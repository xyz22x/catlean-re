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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class uv extends _g {
@NotNull
public static final uv K;
static final KProperty[] D;
@NotNull
private static final cq O;
@NotNull
private static final cq c;
@NotNull
private static final cq J;
@NotNull
private static final cq W;
@NotNull
private static final c8 C;
@NotNull
private static final cq F;
@NotNull
private static final cw I;
@NotNull
private static final c8 B;
@NotNull
private static final c8 U;
@NotNull
private static final cw e;
@NotNull
private static final i9 w;
private static int y;
private static final long a = yz.a(8088570268154467807L, -3809793699463186813L, MethodHandles.lookup().lookupClass()).a(57019293668033L);
private static final String[] b;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private uv(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 71485639214076L;
super(b<"h">(30148, 8229275945614697101L ^ var4), jt.A(), null, 4, null, var6);
}

private final boolean Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 25298002645926L;
return (Boolean)O.E(this, var3, D[0]);
}

private final boolean V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 118338166536730L;
return (Boolean)c.E(this, var3, D[1]);
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 75974777542971L;
return (Boolean)J.E(this, var3, D[2]);
}

private final boolean n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 87437867057446L;
return (Boolean)W.E(this, var3, D[3]);
}

private final int Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23541861759837L;
return ((Number)C.E(this, var3, D[4])).intValue();
}

private final boolean q(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 135297252619298L;
return (Boolean)F.E(this, var6, D[5]);
}

private final p F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 59961769573772L;
return (p)I.E(this, var3, D[c<"e">(28752, 6449290476653114000L ^ var1)]);
}

private final int I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 105721377815013L;
return ((Number)B.E(this, var3, D[c<"e">(7747, 2191756604649593068L ^ var1)])).intValue();
}

private final int Y(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 31663734881937L;
return ((Number)U.E(this, var6, D[c<"e">(4408, 5681960216842522862L ^ var4)])).intValue();
}

private final f9 D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 80412029402908L;
return (f9)e.E(this, var3, D[c<"e">(15357, 286856782278114212L ^ var1)]);
}

private final void s(f9 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 54699019100494L;
e.b(this, var4, D[c<"e">(15357, 286915155751137818L ^ var2)], var1);
}

@Flow(
priority = -10
)
private final void Q(PlayerUpdateEvent var1) {
long var2 = a ^ 82598681997414L;
long var4 = var2 ^ 125906186475050L;
long var10001 = var2 ^ 91831563111356L;
int var6 = (int)((var2 ^ 91831563111356L) >>> 32);
int var7 = (int)((var2 ^ 91831563111356L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var2 ^ 90859818331665L;
long var11 = var2 ^ 132110420334426L;
long var13 = var2 ^ 129516268790078L;

try {
y = 0;
if (this.g(var6, var7, (char)var8)) {
_8.P
.C(
var9,
new t5(
new _w(dm.h.U(var4), var11, 90.0F, false, null, c<"e">(7468, 6724154610180274424L ^ var2), null), var13, c<"e">(9844, 4043850788680991656L ^ var2), uv::W
)
);
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -2906521827365098729L, var2);
}
}

private final void w(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 26393721492341
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 61161916476342
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 73590895274254
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 106719679934431
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 20470665956200
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 70941402153461
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 82786481220802
// 034: lxor
// 035: dup2
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 15
// 03c: dup2
// 03d: bipush 16
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 16
// 046: dup2
// 047: bipush 32
// 049: lshl
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 17
// 050: pop2
// 051: dup2
// 052: ldc2_w 86354074222541
// 055: lxor
// 056: lstore 18
// 058: dup2
// 059: ldc2_w 48971951842929
// 05c: lxor
// 05d: dup2
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 20
// 064: dup2
// 065: bipush 16
// 067: lshl
// 068: bipush 16
// 06a: lushr
// 06b: lstore 21
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 35334030158792
// 072: lxor
// 073: lstore 23
// 075: dup2
// 076: ldc2_w 66141204801609
// 079: lxor
// 07a: lstore 25
// 07c: dup2
// 07d: ldc2_w 116439005465543
// 080: lxor
// 081: lstore 27
// 083: pop2
// 084: ldc2_w 4113747418145185846
// 087: lload 1
// 088: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: lload 23
// 08f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 092: astore 30
// 094: astore 29
// 096: bipush 0
// 097: istore 31
// 099: aload 30
// 09b: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 09e: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 0a1: aload 29
// 0a3: ifnull 14a
// 0a6: ifne 142
// 0a9: goto 0b6
// 0ac: ldc2_w 4150253511610860838
// 0af: lload 1
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 0b9: lload 25
// 0bb: invokespecial su/catlean/uv.V (J)Z
// 0be: aload 29
// 0c0: ifnull 14a
// 0c3: goto 0d0
// 0c6: ldc2_w 4150253511610860838
// 0c9: lload 1
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: ifeq 142
// 0d3: goto 0e0
// 0d6: ldc2_w 4150253511610860838
// 0d9: lload 1
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: getstatic su/catlean/uv.y I
// 0e3: aload 29
// 0e5: lload 1
// 0e6: lconst_0
// 0e7: lcmp
// 0e8: ifle 14c
// 0eb: ifnull 14a
// 0ee: goto 0fb
// 0f1: ldc2_w 4150253511610860838
// 0f4: lload 1
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 0fe: iload 15
// 100: i2c
// 101: iload 16
// 103: i2s
// 104: iload 17
// 106: invokespecial su/catlean/uv.Y (CSI)I
// 109: if_icmpge 142
// 10c: goto 119
// 10f: ldc2_w 4150253511610860838
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 11c: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 11f: dup
// 120: sipush 6681
// 123: ldc2_w 1692163173185300215
// 126: lload 1
// 127: lxor
// 128: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 130: lload 18
// 132: invokespecial su/catlean/uv.Q (Lnet/minecraft/class_6880;J)V
// 135: goto 142
// 138: ldc2_w 4150253511610860838
// 13b: lload 1
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 30
// 144: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
// 147: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 14a: aload 29
// 14c: ifnull 1f3
// 14f: ifne 1eb
// 152: goto 15f
// 155: ldc2_w 4150253511610860838
// 158: lload 1
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 162: lload 13
// 164: invokespecial su/catlean/uv.Z (J)Z
// 167: aload 29
// 169: ifnull 1f3
// 16c: goto 179
// 16f: ldc2_w 4150253511610860838
// 172: lload 1
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: ifeq 1eb
// 17c: goto 189
// 17f: ldc2_w 4150253511610860838
// 182: lload 1
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: getstatic su/catlean/uv.y I
// 18c: aload 29
// 18e: lload 1
// 18f: lconst_0
// 190: lcmp
// 191: iflt 1f5
// 194: ifnull 1f3
// 197: goto 1a4
// 19a: ldc2_w 4150253511610860838
// 19d: lload 1
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 1a7: iload 15
// 1a9: i2c
// 1aa: iload 16
// 1ac: i2s
// 1ad: iload 17
// 1af: invokespecial su/catlean/uv.Y (CSI)I
// 1b2: if_icmpge 1eb
// 1b5: goto 1c2
// 1b8: ldc2_w 4150253511610860838
// 1bb: lload 1
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 1c5: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
// 1c8: dup
// 1c9: sipush 19920
// 1cc: ldc2_w 3316973639811625275
// 1cf: lload 1
// 1d0: lxor
// 1d1: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d9: lload 18
// 1db: invokespecial su/catlean/uv.Q (Lnet/minecraft/class_6880;J)V
// 1de: goto 1eb
// 1e1: ldc2_w 4150253511610860838
// 1e4: lload 1
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: aload 30
// 1ed: getstatic net/minecraft/class_1294.field_5918 Lnet/minecraft/class_6880;
// 1f0: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 1f3: aload 29
// 1f5: ifnull 2a9
// 1f8: ifne 294
// 1fb: goto 208
// 1fe: ldc2_w 4150253511610860838
// 201: lload 1
// 202: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 207: athrow
// 208: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 20b: lload 11
// 20d: invokespecial su/catlean/uv.t (J)Z
// 210: aload 29
// 212: ifnull 2a9
// 215: goto 222
// 218: ldc2_w 4150253511610860838
// 21b: lload 1
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: ifeq 294
// 225: goto 232
// 228: ldc2_w 4150253511610860838
// 22b: lload 1
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: getstatic su/catlean/uv.y I
// 235: aload 29
// 237: lload 1
// 238: lconst_0
// 239: lcmp
// 23a: ifle 2ab
// 23d: ifnull 2a9
// 240: goto 24d
// 243: ldc2_w 4150253511610860838
// 246: lload 1
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 250: iload 15
// 252: i2c
// 253: iload 16
// 255: i2s
// 256: iload 17
// 258: invokespecial su/catlean/uv.Y (CSI)I
// 25b: if_icmpge 294
// 25e: goto 26b
// 261: ldc2_w 4150253511610860838
// 264: lload 1
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 26e: getstatic net/minecraft/class_1294.field_5918 Lnet/minecraft/class_6880;
// 271: dup
// 272: sipush 29713
// 275: ldc2_w 2326604718136477895
// 278: lload 1
// 279: lxor
// 27a: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 282: lload 18
// 284: invokespecial su/catlean/uv.Q (Lnet/minecraft/class_6880;J)V
// 287: goto 294
// 28a: ldc2_w 4150253511610860838
// 28d: lload 1
// 28e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 293: athrow
// 294: aload 30
// 296: invokevirtual net/minecraft/class_746.method_6032 ()F
// 299: aload 30
// 29b: invokevirtual net/minecraft/class_746.method_6067 ()F
// 29e: fadd
// 29f: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 2a2: lload 7
// 2a4: invokespecial su/catlean/uv.Q (J)I
// 2a7: i2f
// 2a8: fcmpg
// 2a9: aload 29
// 2ab: ifnull 351
// 2ae: ifge 349
// 2b1: goto 2be
// 2b4: ldc2_w 4150253511610860838
// 2b7: lload 1
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 2c1: lload 3
// 2c2: invokespecial su/catlean/uv.n (J)Z
// 2c5: aload 29
// 2c7: ifnull 351
// 2ca: goto 2d7
// 2cd: ldc2_w 4150253511610860838
// 2d0: lload 1
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: ifeq 349
// 2da: goto 2e7
// 2dd: ldc2_w 4150253511610860838
// 2e0: lload 1
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: getstatic su/catlean/uv.y I
// 2ea: aload 29
// 2ec: lload 1
// 2ed: lconst_0
// 2ee: lcmp
// 2ef: iflt 359
// 2f2: ifnull 351
// 2f5: goto 302
// 2f8: ldc2_w 4150253511610860838
// 2fb: lload 1
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 305: iload 15
// 307: i2c
// 308: iload 16
// 30a: i2s
// 30b: iload 17
// 30d: invokespecial su/catlean/uv.Y (CSI)I
// 310: if_icmpge 349
// 313: goto 320
// 316: ldc2_w 4150253511610860838
// 319: lload 1
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 323: getstatic net/minecraft/class_1294.field_5915 Lnet/minecraft/class_6880;
// 326: dup
// 327: sipush 8302
// 32a: ldc2_w 2473922765517593735
// 32d: lload 1
// 32e: lxor
// 32f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 337: lload 18
// 339: invokespecial su/catlean/uv.Q (Lnet/minecraft/class_6880;J)V
// 33c: goto 349
// 33f: ldc2_w 4150253511610860838
// 342: lload 1
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: aload 30
// 34b: getstatic net/minecraft/class_1294.field_5924 Lnet/minecraft/class_6880;
// 34e: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 351: lload 1
// 352: lconst_0
// 353: lcmp
// 354: ifle 3c1
// 357: aload 29
// 359: ifnull 3c1
// 35c: ifne 39f
// 35f: goto 36c
// 362: ldc2_w 4150253511610860838
// 365: lload 1
// 366: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: athrow
// 36c: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 36f: aload 29
// 371: ifnull 407
// 374: goto 381
// 377: ldc2_w 4150253511610860838
// 37a: lload 1
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: lload 1
// 382: lconst_0
// 383: lcmp
// 384: iflt 3fa
// 387: lload 9
// 389: invokespecial su/catlean/uv.F (J)Lsu/catlean/p;
// 38c: getstatic su/catlean/p.LackOfRegen Lsu/catlean/p;
// 38f: if_acmpeq 3f7
// 392: goto 39f
// 395: ldc2_w 4150253511610860838
// 398: lload 1
// 399: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39e: athrow
// 39f: aload 30
// 3a1: invokevirtual net/minecraft/class_746.method_6032 ()F
// 3a4: aload 30
// 3a6: invokevirtual net/minecraft/class_746.method_6067 ()F
// 3a9: fadd
// 3aa: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 3ad: lload 5
// 3af: invokespecial su/catlean/uv.I (J)I
// 3b2: i2f
// 3b3: fcmpg
// 3b4: goto 3c1
// 3b7: ldc2_w 4150253511610860838
// 3ba: lload 1
// 3bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: athrow
// 3c1: ifge 467
// 3c4: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 3c7: lload 1
// 3c8: lconst_0
// 3c9: lcmp
// 3ca: iflt 407
// 3cd: aload 29
// 3cf: ifnull 407
// 3d2: goto 3df
// 3d5: ldc2_w 4150253511610860838
// 3d8: lload 1
// 3d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3de: athrow
// 3df: lload 9
// 3e1: invokespecial su/catlean/uv.F (J)Lsu/catlean/p;
// 3e4: getstatic su/catlean/p.Health Lsu/catlean/p;
// 3e7: if_acmpne 467
// 3ea: goto 3f7
// 3ed: ldc2_w 4150253511610860838
// 3f0: lload 1
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 3fa: goto 407
// 3fd: ldc2_w 4150253511610860838
// 400: lload 1
// 401: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 406: athrow
// 407: iload 20
// 409: i2c
// 40a: lload 21
// 40c: invokespecial su/catlean/uv.q (CJ)Z
// 40f: lload 1
// 410: lconst_0
// 411: lcmp
// 412: iflt 42d
// 415: aload 29
// 417: ifnull 42d
// 41a: ifeq 467
// 41d: goto 42a
// 420: ldc2_w 4150253511610860838
// 423: lload 1
// 424: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: athrow
// 42a: getstatic su/catlean/uv.y I
// 42d: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 430: iload 15
// 432: i2c
// 433: iload 16
// 435: i2s
// 436: iload 17
// 438: invokespecial su/catlean/uv.Y (CSI)I
// 43b: if_icmpge 467
// 43e: getstatic su/catlean/uv.K Lsu/catlean/uv;
// 441: getstatic net/minecraft/class_1294.field_5924 Lnet/minecraft/class_6880;
// 444: dup
// 445: sipush 437
// 448: ldc2_w 6722263686365527405
// 44b: lload 1
// 44c: lxor
// 44d: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 455: lload 18
// 457: invokespecial su/catlean/uv.Q (Lnet/minecraft/class_6880;J)V
// 45a: goto 467
// 45d: ldc2_w 4150253511610860838
// 460: lload 1
// 461: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 466: athrow
// 467: nop
// 468: nop
// 469: getstatic su/catlean/uv.w Lsu/catlean/i9;
// 46c: lload 27
// 46e: invokevirtual su/catlean/i9.X (J)V
// 471: return
}

private final void Q(class_6880 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uv.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 20157992787219
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 42293827738023
// 12: lxor
// 13: lstore 6
// 15: dup2
// 16: ldc2_w 99221691855986
// 19: lxor
// 1a: lstore 8
// 1c: pop2
// 1d: ldc2_w -6905227811898984181
// 20: lload 2
// 21: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: aload 0
// 27: aload 1
// 28: lload 6
// 2a: invokespecial su/catlean/uv.a (Lnet/minecraft/class_6880;J)I
// 2d: istore 11
// 2f: astore 10
// 31: aload 10
// 33: ifnull 69
// 36: iload 11
// 38: bipush -1
// 39: if_icmpne 54
// 3c: goto 49
// 3f: ldc2_w -6870825017873556453
// 42: lload 2
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: return
// 4a: ldc2_w -6870825017873556453
// 4d: lload 2
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 57: lload 4
// 59: iload 11
// 5b: aload 0
// 5c: lload 8
// 5e: invokespecial su/catlean/uv.D (J)Lsu/catlean/f9;
// 61: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/uv.B ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 66: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 69: return
}

private final int a(class_6880 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 130135402007333L;
long var6 = var2 ^ 99790635397719L;
return gg.P.X(var6, uv::y, this.D(var4)).a();
}

private final boolean R(long param1, class_6880 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uv.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 73669315409766
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 1980600769588
// 12: lxor
// 13: lstore 6
// 15: pop2
// 16: ldc2_w -8148464641150232630
// 19: lload 1
// 1a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: astore 8
// 21: lload 6
// 23: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 26: aload 3
// 27: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 2a: aload 8
// 2c: ifnull 53
// 2f: ifne 7a
// 32: goto 3f
// 35: ldc2_w -8186268158337502502
// 38: lload 1
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: aload 0
// 40: aload 3
// 41: lload 4
// 43: invokespecial su/catlean/uv.a (Lnet/minecraft/class_6880;J)I
// 46: goto 53
// 49: ldc2_w -8186268158337502502
// 4c: lload 1
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: aload 8
// 55: ifnull 77
// 58: bipush -1
// 59: if_icmpeq 7a
// 5c: goto 69
// 5f: ldc2_w -8186268158337502502
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: bipush 1
// 6a: goto 77
// 6d: ldc2_w -8186268158337502502
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: goto 7b
// 7a: bipush 0
// 7b: ireturn
}

private final boolean t(class_1799 param1, class_6880 param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uv.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: ldc2_w 5011047268096351402
// 009: lload 3
// 00a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 5
// 011: aload 5
// 013: ifnull 039
// 016: aload 1
// 017: dup
// 018: ifnull 038
// 01b: goto 028
// 01e: ldc2_w 4973256154781612474
// 021: lload 3
// 022: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: athrow
// 028: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 02b: goto 03a
// 02e: ldc2_w 4973256154781612474
// 031: lload 3
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: pop
// 039: aconst_null
// 03a: instanceof net/minecraft/class_1828
// 03d: ifeq 113
// 040: aload 1
// 041: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 044: getstatic net/minecraft/class_1844.field_49274 Lnet/minecraft/class_1844;
// 047: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
// 04a: checkcast net/minecraft/class_1844
// 04d: invokevirtual net/minecraft/class_1844.method_57397 ()Ljava/lang/Iterable;
// 050: dup
// 051: sipush 24038
// 054: ldc2_w 5843064314485743034
// 057: lload 3
// 058: lxor
// 059: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 061: astore 6
// 063: bipush 0
// 064: istore 7
// 066: aload 6
// 068: aload 5
// 06a: ifnull 0bc
// 06d: instanceof java/util/Collection
// 070: ifeq 0ba
// 073: goto 080
// 076: ldc2_w 4973256154781612474
// 079: lload 3
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: aload 6
// 082: checkcast java/util/Collection
// 085: aload 5
// 087: ifnull 0bc
// 08a: goto 097
// 08d: ldc2_w 4973256154781612474
// 090: lload 3
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: invokeinterface java/util/Collection.isEmpty ()Z 1
// 09c: ifeq 0ba
// 09f: goto 0ac
// 0a2: ldc2_w 4973256154781612474
// 0a5: lload 3
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: goto 0fc
// 0b0: ldc2_w 4973256154781612474
// 0b3: lload 3
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 6
// 0bc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0c1: astore 8
// 0c3: aload 8
// 0c5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ca: ifeq 0fb
// 0cd: aload 8
// 0cf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d4: astore 9
// 0d6: aload 9
// 0d8: checkcast net/minecraft/class_1293
// 0db: astore 10
// 0dd: bipush 0
// 0de: istore 11
// 0e0: aload 10
// 0e2: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 0e5: aload 2
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e9: ifeq 0c3
// 0ec: bipush 1
// 0ed: lload 3
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: iflt 0e9
// 0f3: aload 5
// 0f5: ifnull 0e9
// 0f8: goto 0fc
// 0fb: bipush 0
// 0fc: lload 3
// 0fd: lconst_0
// 0fe: lcmp
// 0ff: iflt 106
// 102: ifeq 113
// 105: bipush 1
// 106: goto 114
// 109: ldc2_w 4973256154781612474
// 10c: lload 3
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: bipush 0
// 114: ireturn
}

private final boolean g(int param1, int param2, char param3) {
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
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/uv.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 32767043784712
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 76180866122376
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 52265150243401
// 031: lxor
// 032: dup2
// 033: bipush 16
// 035: lushr
// 036: lstore 10
// 038: dup2
// 039: bipush 48
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 12
// 042: pop2
// 043: dup2
// 044: ldc2_w 45381759968524
// 047: lxor
// 048: dup2
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 13
// 04f: dup2
// 050: bipush 16
// 052: lshl
// 053: bipush 16
// 055: lushr
// 056: lstore 14
// 058: pop2
// 059: dup2
// 05a: ldc2_w 41707088734389
// 05d: lxor
// 05e: lstore 16
// 060: dup2
// 061: ldc2_w 77926309920235
// 064: lxor
// 065: lstore 18
// 067: dup2
// 068: ldc2_w 55440346687691
// 06b: lxor
// 06c: lstore 20
// 06e: dup2
// 06f: ldc2_w 78212953434739
// 072: lxor
// 073: lstore 22
// 075: dup2
// 076: ldc2_w 110792791387298
// 079: lxor
// 07a: lstore 24
// 07c: dup2
// 07d: ldc2_w 25642475210773
// 080: lxor
// 081: lstore 26
// 083: dup2
// 084: ldc2_w 50794472313457
// 087: lxor
// 088: lstore 28
// 08a: dup2
// 08b: ldc2_w 111402797901158
// 08e: lxor
// 08f: dup2
// 090: bipush 48
// 092: lushr
// 093: l2i
// 094: istore 30
// 096: dup2
// 097: bipush 16
// 099: lshl
// 09a: bipush 32
// 09c: lushr
// 09d: l2i
// 09e: istore 31
// 0a0: dup2
// 0a1: bipush 48
// 0a3: lshl
// 0a4: bipush 48
// 0a6: lushr
// 0a7: l2i
// 0a8: istore 32
// 0aa: pop2
// 0ab: dup2
// 0ac: ldc2_w 63685160725300
// 0af: lxor
// 0b0: lstore 33
// 0b2: pop2
// 0b3: ldc2_w -5013646890837941429
// 0b6: lload 4
// 0b8: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: astore 35
// 0bf: getstatic su/catlean/uv.w Lsu/catlean/i9;
// 0c2: sipush 28752
// 0c5: ldc2_w 6449178126202190018
// 0c8: lload 4
// 0ca: lxor
// 0cb: invokedynamic e (IJ)I bsm=su/catlean/uv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 0d3: aconst_null
// 0d4: lload 10
// 0d6: bipush 1
// 0d7: iload 12
// 0d9: i2c
// 0da: aconst_null
// 0db: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 0de: i2d
// 0df: ldc2_w 50.0
// 0e2: ddiv
// 0e3: invokestatic java/lang/Math.floor (D)D
// 0e6: d2i
// 0e7: iadd
// 0e8: iload 30
// 0ea: i2s
// 0eb: swap
// 0ec: iload 31
// 0ee: swap
// 0ef: iload 32
// 0f1: i2s
// 0f2: swap
// 0f3: invokevirtual su/catlean/i9.g (SISI)Z
// 0f6: aload 35
// 0f8: ifnull 159
// 0fb: ifeq 14a
// 0fe: goto 10c
// 101: ldc2_w -4979384318913182117
// 104: lload 4
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: lload 16
// 10e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 111: getfield net/minecraft/class_746.field_6012 I
// 114: aload 35
// 116: iload 2
// 117: ifle 164
// 11a: ifnull 162
// 11d: goto 12b
// 120: ldc2_w -4979384318913182117
// 123: lload 4
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: sipush 17795
// 12e: ldc2_w 8812883433587477790
// 131: lload 4
// 133: lxor
// 134: invokedynamic e (IJ)I bsm=su/catlean/uv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: if_icmpgt 15a
// 13c: goto 14a
// 13f: ldc2_w -4979384318913182117
// 142: lload 4
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: bipush 0
// 14b: goto 159
// 14e: ldc2_w -4979384318913182117
// 151: lload 4
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: ireturn
// 15a: getstatic su/catlean/um.E Lsu/catlean/um;
// 15d: lload 18
// 15f: invokevirtual su/catlean/um.f (J)Z
// 162: aload 35
// 164: ifnull 1d8
// 167: ifeq 1d0
// 16a: goto 178
// 16d: ldc2_w -4979384318913182117
// 170: lload 4
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: getstatic su/catlean/um.E Lsu/catlean/um;
// 17b: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 17e: ifnull 1d0
// 181: goto 18f
// 184: ldc2_w -4979384318913182117
// 187: lload 4
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: lload 16
// 191: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 194: fconst_1
// 195: invokevirtual net/minecraft/class_746.method_7261 (F)F
// 198: ldc 0.5
// 19a: fcmpl
// 19b: aload 35
// 19d: iload 1
// 19e: ifle 1da
// 1a1: ifnull 1d8
// 1a4: goto 1b2
// 1a7: ldc2_w -4979384318913182117
// 1aa: lload 4
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: ifle 1d0
// 1b5: goto 1c3
// 1b8: ldc2_w -4979384318913182117
// 1bb: lload 4
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: bipush 0
// 1c4: ireturn
// 1c5: ldc2_w -4979384318913182117
// 1c8: lload 4
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: lload 16
// 1d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d5: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1d8: aload 35
// 1da: iload 1
// 1db: ifle 21e
// 1de: ifnull 21c
// 1e1: ifeq 1ff
// 1e4: goto 1f2
// 1e7: ldc2_w -4979384318913182117
// 1ea: lload 4
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: bipush 0
// 1f3: ireturn
// 1f4: ldc2_w -4979384318913182117
// 1f7: lload 4
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 0
// 200: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 203: dup
// 204: sipush 1898
// 207: ldc2_w 308602213102336210
// 20a: lload 4
// 20c: lxor
// 20d: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 215: lload 28
// 217: dup2_x1
// 218: pop2
// 219: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 21c: aload 35
// 21e: iload 2
// 21f: iflt 28d
// 222: ifnull 28b
// 225: ifeq 260
// 228: goto 236
// 22b: ldc2_w -4979384318913182117
// 22e: lload 4
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: aload 0
// 237: lload 33
// 239: invokespecial su/catlean/uv.V (J)Z
// 23c: aload 35
// 23e: ifnull 555
// 241: goto 24f
// 244: ldc2_w -4979384318913182117
// 247: lload 4
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: ifne 554
// 252: goto 260
// 255: ldc2_w -4979384318913182117
// 258: lload 4
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: aload 0
// 261: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
// 264: dup
// 265: sipush 14226
// 268: ldc2_w 7813704647844202554
// 26b: lload 4
// 26d: lxor
// 26e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 276: lload 28
// 278: dup2_x1
// 279: pop2
// 27a: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 27d: goto 28b
// 280: ldc2_w -4979384318913182117
// 283: lload 4
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: aload 35
// 28d: iload 3
// 28e: ifle 2fc
// 291: ifnull 2fa
// 294: ifeq 2cf
// 297: goto 2a5
// 29a: ldc2_w -4979384318913182117
// 29d: lload 4
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: aload 0
// 2a6: lload 8
// 2a8: invokespecial su/catlean/uv.Z (J)Z
// 2ab: aload 35
// 2ad: ifnull 555
// 2b0: goto 2be
// 2b3: ldc2_w -4979384318913182117
// 2b6: lload 4
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: ifne 554
// 2c1: goto 2cf
// 2c4: ldc2_w -4979384318913182117
// 2c7: lload 4
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: aload 0
// 2d0: getstatic net/minecraft/class_1294.field_5918 Lnet/minecraft/class_6880;
// 2d3: dup
// 2d4: sipush 5744
// 2d7: ldc2_w 6809054396513364427
// 2da: lload 4
// 2dc: lxor
// 2dd: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e5: lload 28
// 2e7: dup2_x1
// 2e8: pop2
// 2e9: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 2ec: goto 2fa
// 2ef: ldc2_w -4979384318913182117
// 2f2: lload 4
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: aload 35
// 2fc: iload 2
// 2fd: ifle 36b
// 300: ifnull 365
// 303: ifeq 33e
// 306: goto 314
// 309: ldc2_w -4979384318913182117
// 30c: lload 4
// 30e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: athrow
// 314: aload 0
// 315: lload 26
// 317: invokespecial su/catlean/uv.t (J)Z
// 31a: aload 35
// 31c: ifnull 555
// 31f: goto 32d
// 322: ldc2_w -4979384318913182117
// 325: lload 4
// 327: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: athrow
// 32d: ifne 554
// 330: goto 33e
// 333: ldc2_w -4979384318913182117
// 336: lload 4
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: lload 16
// 340: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 343: invokevirtual net/minecraft/class_746.method_6032 ()F
// 346: lload 16
// 348: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 34b: invokevirtual net/minecraft/class_746.method_6067 ()F
// 34e: fadd
// 34f: aload 0
// 350: lload 22
// 352: invokespecial su/catlean/uv.Q (J)I
// 355: i2f
// 356: fcmpg
// 357: goto 365
// 35a: ldc2_w -4979384318913182117
// 35d: lload 4
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: iload 2
// 366: iflt 3c1
// 369: aload 35
// 36b: ifnull 3c1
// 36e: ifge 3f2
// 371: goto 37f
// 374: ldc2_w -4979384318913182117
// 377: lload 4
// 379: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: athrow
// 37f: aload 0
// 380: aload 35
// 382: iload 2
// 383: ifle 3f9
// 386: ifnull 3f3
// 389: goto 397
// 38c: ldc2_w -4979384318913182117
// 38f: lload 4
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: getstatic net/minecraft/class_1294.field_5915 Lnet/minecraft/class_6880;
// 39a: dup
// 39b: sipush 10327
// 39e: ldc2_w 7386720214197540851
// 3a1: lload 4
// 3a3: lxor
// 3a4: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ac: lload 28
// 3ae: dup2_x1
// 3af: pop2
// 3b0: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 3b3: goto 3c1
// 3b6: ldc2_w -4979384318913182117
// 3b9: lload 4
// 3bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: athrow
// 3c1: iload 3
// 3c2: iflt 3ce
// 3c5: ifeq 3f2
// 3c8: aload 0
// 3c9: lload 6
// 3cb: invokespecial su/catlean/uv.n (J)Z
// 3ce: aload 35
// 3d0: ifnull 555
// 3d3: goto 3e1
// 3d6: ldc2_w -4979384318913182117
// 3d9: lload 4
// 3db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: athrow
// 3e1: ifne 554
// 3e4: goto 3f2
// 3e7: ldc2_w -4979384318913182117
// 3ea: lload 4
// 3ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f1: athrow
// 3f2: aload 0
// 3f3: iload 1
// 3f4: ifle 424
// 3f7: aload 35
// 3f9: ifnull 424
// 3fc: lload 24
// 3fe: invokespecial su/catlean/uv.F (J)Lsu/catlean/p;
// 401: getstatic su/catlean/p.LackOfRegen Lsu/catlean/p;
// 404: if_acmpne 487
// 407: goto 415
// 40a: ldc2_w -4979384318913182117
// 40d: lload 4
// 40f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 414: athrow
// 415: aload 0
// 416: goto 424
// 419: ldc2_w -4979384318913182117
// 41c: lload 4
// 41e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 423: athrow
// 424: getstatic net/minecraft/class_1294.field_5924 Lnet/minecraft/class_6880;
// 427: dup
// 428: sipush 31760
// 42b: ldc2_w 3806479829227193279
// 42e: lload 4
// 430: lxor
// 431: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 436: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 439: lload 28
// 43b: dup2_x1
// 43c: pop2
// 43d: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 440: iload 2
// 441: iflt 4ae
// 444: aload 35
// 446: ifnull 4ae
// 449: ifeq 487
// 44c: goto 45a
// 44f: ldc2_w -4979384318913182117
// 452: lload 4
// 454: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 459: athrow
// 45a: aload 0
// 45b: iload 13
// 45d: i2c
// 45e: lload 14
// 460: invokespecial su/catlean/uv.q (CJ)Z
// 463: aload 35
// 465: ifnull 555
// 468: goto 476
// 46b: ldc2_w -4979384318913182117
// 46e: lload 4
// 470: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 475: athrow
// 476: ifne 554
// 479: goto 487
// 47c: ldc2_w -4979384318913182117
// 47f: lload 4
// 481: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 486: athrow
// 487: lload 16
// 489: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 48c: invokevirtual net/minecraft/class_746.method_6032 ()F
// 48f: lload 16
// 491: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 494: invokevirtual net/minecraft/class_746.method_6067 ()F
// 497: fadd
// 498: aload 0
// 499: lload 20
// 49b: invokespecial su/catlean/uv.I (J)I
// 49e: i2f
// 49f: fcmpg
// 4a0: goto 4ae
// 4a3: ldc2_w -4979384318913182117
// 4a6: lload 4
// 4a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: athrow
// 4ae: ifge 558
// 4b1: aload 0
// 4b2: iload 3
// 4b3: iflt 4f1
// 4b6: aload 35
// 4b8: ifnull 4f1
// 4bb: goto 4c9
// 4be: ldc2_w -4979384318913182117
// 4c1: lload 4
// 4c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c8: athrow
// 4c9: lload 24
// 4cb: invokespecial su/catlean/uv.F (J)Lsu/catlean/p;
// 4ce: getstatic su/catlean/p.Health Lsu/catlean/p;
// 4d1: if_acmpne 558
// 4d4: goto 4e2
// 4d7: ldc2_w -4979384318913182117
// 4da: lload 4
// 4dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e1: athrow
// 4e2: aload 0
// 4e3: goto 4f1
// 4e6: ldc2_w -4979384318913182117
// 4e9: lload 4
// 4eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f0: athrow
// 4f1: getstatic net/minecraft/class_1294.field_5924 Lnet/minecraft/class_6880;
// 4f4: dup
// 4f5: sipush 437
// 4f8: ldc2_w 6722259028874280464
// 4fb: lload 4
// 4fd: lxor
// 4fe: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/uv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 503: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 506: lload 28
// 508: dup2_x1
// 509: pop2
// 50a: invokespecial su/catlean/uv.R (JLnet/minecraft/class_6880;)Z
// 50d: aload 35
// 50f: iload 1
// 510: ifle 540
// 513: ifnull 53e
// 516: ifeq 558
// 519: goto 527
// 51c: ldc2_w -4979384318913182117
// 51f: lload 4
// 521: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 526: athrow
// 527: aload 0
// 528: iload 13
// 52a: i2c
// 52b: lload 14
// 52d: invokespecial su/catlean/uv.q (CJ)Z
// 530: goto 53e
// 533: ldc2_w -4979384318913182117
// 536: lload 4
// 538: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53d: athrow
// 53e: aload 35
// 540: ifnull 555
// 543: ifeq 558
// 546: goto 554
// 549: ldc2_w -4979384318913182117
// 54c: lload 4
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: bipush 1
// 555: goto 559
// 558: bipush 0
// 559: ireturn
}

private static final boolean j() {
long var0 = a ^ 124773285835464L;
long var2 = var0 ^ 7917142885184L;

try {
if (K.F(var2) == su.catlean.p.Health) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -7707963913915881031L, var0);
}

return false;
}

private static final Unit W() {
long var0 = a ^ 78190103345683L;
long var2 = var0 ^ 99281786340020L;
K.w(var2);
return Unit.INSTANCE;
}

private static final Unit B() {
long var0 = a ^ 134482664607153L;
long var2 = var0 ^ 76209197279396L;
long var4 = var0 ^ 85179748584555L;
ag.K(class_1268.field_5808, 0.0F, var2, 0.0F, c<"e">(28752, 6449292733001951321L ^ var0), null);
_r.a(var4, (class_2596)(new class_2879(class_1268.field_5808)));
int var6 = y++;
return Unit.INSTANCE;
}

private static final boolean y(class_6880 var0, class_1799 var1) {
long var2 = a ^ 41577808008006L;
long var4 = var2 ^ 34143666591613L;
Intrinsics.checkNotNullParameter(var1, b<"h">(5741, 6891969580972320687L ^ var2));
return K.t(var1, var0, var4);
}

static {
long var20 = a ^ 11051624758701L;
long var22 = var20 ^ 44942839483737L;
long var24 = var20 ^ 64846494899599L;
long var26 = var20 ^ 23493192421609L;
long var28 = (var20 ^ 116807293431432L) >>> 8;
int var30 = (int)((var20 ^ 116807293431432L) << 56 >>> 56);
long var31 = var20 ^ 135824028346171L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[43];
int var16 = 0;
String var15 = "vmé\u009dóÝÒ]6\u001füÑ÷3\u000f\u0091fu\u0000\u0095îÂ ÇÄ\u0091\u0087À\u008de¡e0+cÚ¤\u00805\u0000Ñ\u0016Î4-ð¨\u0084mdM57ÔQ\të9(s£§\u001a\u00ad\u0017&Å\u0003fî¢z«þ\u0010É\\¿y@r Æ»\r\u0012X)ÔÉÏã\u009eñ\u001b]¨Áý%y_f\u000e»\bçnÿ\u008dç<åÊ Ã\u0010Ö{\u0098o\u0098C\u001c\u001f6zY\u001d¶|\u008b¿ù\u0016çÃtúc\u0015ÿ|T¬-O\u0018d\u009cmâÊ§Ô©\u001d¶4>\b§KÓ\u0000r¹´k\u0097>=\u0018_&ÛL\u0084I}\u0097\u008c\u0080\u008cttå\u0099OQJ(µà5Ð\f\u00186þñ\u0091B\u0087²ô\u0098!K÷Y\u0095îþ\u0088\u0086ï\u0083¥ó!1\u0010\u0085DZí\u000e9ÿ\u0005\u007f´\u001ejþì°g\u0010\u0002É!:\u0000\búþ?ò£¨Aá½n\u0018»(ïL©Gn~\u0086¹I\u0018\u0018Xª¿þÍ#.f\u000b+m\u0010¢xß\u008cÁ( 8¿ú£*1&ò\f\u0010¾)¯V\u0090\u001ama.\u0081\u0084Ô\r\u000ed³\u0010î6ãÏ\u009bï\u0083AÞi:\u0099&Å\b>\u0018tÉ¦sz[¢\u00adCÖm\u0090ß7^Å\u008aÅvïF]\u0097\r ØÎþë\u0097ÍºBû{Zk\u00966¼\u001c\u0013â8Ú\u0096s\u001c6\u0019g\u0014$nÜe\u0010(ò\u001ah\u008fÙÏêáR\rÊ×\u009aãv9äwµ\u0096ªli§},%\u008eül¦NK{îò\u001e\u0085§®\u0018æ[[f\u001cÝ\u008c¾Èò8\u007f\u008dB\u0084ÑcW»Æ£\u001d\u0001z(/\u0018Ò×.\u007f¾8>Zîâ\u0007©í\u0087¶\u008csv£ø5~Û\u001aa\u0095Ñ\u0083×%Sî¾\u0086ÃÌ\u0094½(ª\u008d\u0006\u009cùMÈ$|&bâazt\u0012{$4\u0097{Ó\u009a¼\u009eäÂè´Î]\u008eÕ\u008c\u0087Îì#nð !`p*-×]\u0006\u0003\u0085\u009d¾ ]\u0095ÔÓß4\u008f\u009b\u0012³:'(k%¶>\u00027\u0018\u0005\fyÉÉxî«-\u0081¤¬ú)HÇÂÛ\u001bSê\u0094\u0081b\u0010f®Ë¯á\u008f\u0007©\u0018-áætl±V 'éN&í°8ßD\u001d||M\u0092l¦dØÞ6¦\u0000Ý.ëp\u0087u\u008f:üÊ Ê\u0016 KºÌ\u0096\u000eÚÿÔE\u000e\u001cËb\u000e\u008eÙLÀ\u0013fÎr\u001f,=Ó\u0005O9\u0010w\t3û\u0007k¶©¹\u0093¢Q\u008d\u0006÷k\u0018\u0086\u001bu`\u0004³\b»ð~á×Fªú\u008aÈÆgr3ü@F\u0018Y\f.\u009aD]Î\u0002æ)Â\u0012°ó¥¹üÖ6\u0000\u009b#_?\u0018Ë)¶Ë\u0083Ðák\u0082ÐNv6\\B\u0019XÓ\u0015!Ð½;\u0085\u0010Â)\u0083tL\u00ad\u009aM5¨ô´LËlt\u0018\u0086\rÇ\u008a,+Þ\u0089s+0}WZL®V+T,\u0001\u001dIC Õaó\u0001\u0099\u0086\u000f\u009bR\u0097\u0086|\u001b\u0084\\²éÇ.\u0082Í¼*%Ç¢´½1Ñ\u0086\u000e(7\u007f j§Çy\u0086ØäÚ³Þ÷\u0093Gv!\u0081ÑýüåPSA\\ð¼Þ÷êæ\u0013Ä\u0014\u008dw'Ù \u0084ÊP\u0098NÑ·H\u001a´2xÌÒ\u0097ÒÔ\u0016Ë\u008aè~P×Ã\u0090\u0096\u0001ë4\u0013\u0007\u0010\u0018è2.$Këj\u007f»#òúlê\n0©.¯;-t\\U\u008e]®C=é\u008f\t\u0097À¬\u0018~\u0010\u0012\u0006º»QÜ\u00975íãý\u0006\u0088\u0005ÄR\u0087ëe\u000e,\u009c(\r\rÈ \u0003wH²\u007fe\u0017oã^¥ÊPÔõ\u0097J+r\u0019DTªÂ\u008b_\f\u009f\u0018\u0089æ) j¯'åW\u008bæ\u008eí\u0096»\"\u008d\u0098E¡i{Ú*¦.æu%ÙcÍþ\u001dîå\u0010ûf\u007f\u008a\rbÁõ:§u\u0003~ýE\u0010 g£)\u0014wÓ\u0004¼¸`91áN æ\u0090,m4ÚWà®Q\u0005 .D×\u009f{ éM\u001a\u008d8Ýg\u009b\u0003Wg\u000bð¶\u0098ÌùYNõïèóB¼ûÙÈ5\u0092QP\u0010YØ\u0018o|*¬1ç¢Ql©°\u0088Ã";
int var17 = "vmé\u009dóÝÒ]6\u001füÑ÷3\u000f\u0091fu\u0000\u0095îÂ ÇÄ\u0091\u0087À\u008de¡e0+cÚ¤\u00805\u0000Ñ\u0016Î4-ð¨\u0084mdM57ÔQ\të9(s£§\u001a\u00ad\u0017&Å\u0003fî¢z«þ\u0010É\\¿y@r Æ»\r\u0012X)ÔÉÏã\u009eñ\u001b]¨Áý%y_f\u000e»\bçnÿ\u008dç<åÊ Ã\u0010Ö{\u0098o\u0098C\u001c\u001f6zY\u001d¶|\u008b¿ù\u0016çÃtúc\u0015ÿ|T¬-O\u0018d\u009cmâÊ§Ô©\u001d¶4>\b§KÓ\u0000r¹´k\u0097>=\u0018_&ÛL\u0084I}\u0097\u008c\u0080\u008cttå\u0099OQJ(µà5Ð\f\u00186þñ\u0091B\u0087²ô\u0098!K÷Y\u0095îþ\u0088\u0086ï\u0083¥ó!1\u0010\u0085DZí\u000e9ÿ\u0005\u007f´\u001ejþì°g\u0010\u0002É!:\u0000\búþ?ò£¨Aá½n\u0018»(ïL©Gn~\u0086¹I\u0018\u0018Xª¿þÍ#.f\u000b+m\u0010¢xß\u008cÁ( 8¿ú£*1&ò\f\u0010¾)¯V\u0090\u001ama.\u0081\u0084Ô\r\u000ed³\u0010î6ãÏ\u009bï\u0083AÞi:\u0099&Å\b>\u0018tÉ¦sz[¢\u00adCÖm\u0090ß7^Å\u008aÅvïF]\u0097\r ØÎþë\u0097ÍºBû{Zk\u00966¼\u001c\u0013â8Ú\u0096s\u001c6\u0019g\u0014$nÜe\u0010(ò\u001ah\u008fÙÏêáR\rÊ×\u009aãv9äwµ\u0096ªli§},%\u008eül¦NK{îò\u001e\u0085§®\u0018æ[[f\u001cÝ\u008c¾Èò8\u007f\u008dB\u0084ÑcW»Æ£\u001d\u0001z(/\u0018Ò×.\u007f¾8>Zîâ\u0007©í\u0087¶\u008csv£ø5~Û\u001aa\u0095Ñ\u0083×%Sî¾\u0086ÃÌ\u0094½(ª\u008d\u0006\u009cùMÈ$|&bâazt\u0012{$4\u0097{Ó\u009a¼\u009eäÂè´Î]\u008eÕ\u008c\u0087Îì#nð !`p*-×]\u0006\u0003\u0085\u009d¾ ]\u0095ÔÓß4\u008f\u009b\u0012³:'(k%¶>\u00027\u0018\u0005\fyÉÉxî«-\u0081¤¬ú)HÇÂÛ\u001bSê\u0094\u0081b\u0010f®Ë¯á\u008f\u0007©\u0018-áætl±V 'éN&í°8ßD\u001d||M\u0092l¦dØÞ6¦\u0000Ý.ëp\u0087u\u008f:üÊ Ê\u0016 KºÌ\u0096\u000eÚÿÔE\u000e\u001cËb\u000e\u008eÙLÀ\u0013fÎr\u001f,=Ó\u0005O9\u0010w\t3û\u0007k¶©¹\u0093¢Q\u008d\u0006÷k\u0018\u0086\u001bu`\u0004³\b»ð~á×Fªú\u008aÈÆgr3ü@F\u0018Y\f.\u009aD]Î\u0002æ)Â\u0012°ó¥¹üÖ6\u0000\u009b#_?\u0018Ë)¶Ë\u0083Ðák\u0082ÐNv6\\B\u0019XÓ\u0015!Ð½;\u0085\u0010Â)\u0083tL\u00ad\u009aM5¨ô´LËlt\u0018\u0086\rÇ\u008a,+Þ\u0089s+0}WZL®V+T,\u0001\u001dIC Õaó\u0001\u0099\u0086\u000f\u009bR\u0097\u0086|\u001b\u0084\\²éÇ.\u0082Í¼*%Ç¢´½1Ñ\u0086\u000e(7\u007f j§Çy\u0086ØäÚ³Þ÷\u0093Gv!\u0081ÑýüåPSA\\ð¼Þ÷êæ\u0013Ä\u0014\u008dw'Ù \u0084ÊP\u0098NÑ·H\u001a´2xÌÒ\u0097ÒÔ\u0016Ë\u008aè~P×Ã\u0090\u0096\u0001ë4\u0013\u0007\u0010\u0018è2.$Këj\u007f»#òúlê\n0©.¯;-t\\U\u008e]®C=é\u008f\t\u0097À¬\u0018~\u0010\u0012\u0006º»QÜ\u00975íãý\u0006\u0088\u0005ÄR\u0087ëe\u000e,\u009c(\r\rÈ \u0003wH²\u007fe\u0017oã^¥ÊPÔõ\u0097J+r\u0019DTªÂ\u008b_\f\u009f\u0018\u0089æ) j¯'åW\u008bæ\u008eí\u0096»\"\u008d\u0098E¡i{Ú*¦.æu%ÙcÍþ\u001dîå\u0010ûf\u007f\u008a\rbÁõ:§u\u0003~ýE\u0010 g£)\u0014wÓ\u0004¼¸`91áN æ\u0090,m4ÚWà®Q\u0005 .D×\u009f{ éM\u001a\u008d8Ýg\u009b\u0003Wg\u000bð¶\u0098ÌùYNõïèóB¼ûÙÈ5\u0092QP\u0010YØ\u0018o|*¬1ç¢Ql©°\u0088Ã"
.length();
char var14 = ' ';
int var36 = -1;

label54:
while (true) {
String var37 = var15.substring(++var36, var36 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var48 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var48;
if ((var36 += var14) >= var17) {
b = var18;
d = new String[43];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[17];
int var3 = 0;
String var4 = "Rã\u0088¶0cpäÌ\u0084ûNûæt\u0080ÄZ¸>.+\u0083\u0085\u001e\u009c¾\u001eS\u0094óS\u001fí\u0018]Æ\"Z\u0001ìvF¶\u009c®z\u0088Ã\u0093!x¢E&È\u0080×ÀÑ0Ì~þ&å¾ËÞ¢\u009c\u0096\u001bðFÄñ\u0092\fg@5~nC¦fÁ\u0017@½Ý\u001a\u009eì¤)?\u0002\u0086ðim\u0004t\u000f4\u0096Ù·\u0011ÆC\u008dw\u008e\u0004´Ù/";
int var5 = "Rã\u0088¶0cpäÌ\u0084ûNûæt\u0080ÄZ¸>.+\u0083\u0085\u001e\u009c¾\u001eS\u0094óS\u001fí\u0018]Æ\"Z\u0001ìvF¶\u009c®z\u0088Ã\u0093!x¢E&È\u0080×ÀÑ0Ì~þ&å¾ËÞ¢\u009c\u0096\u001bðFÄñ\u0092\fg@5~nC¦fÁ\u0017@½Ý\u001a\u009eì¤)?\u0002\u0086ðim\u0004t\u000f4\u0096Ù·\u0011ÆC\u008dw\u008e\u0004´Ù/"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
var10001 = var3++;
long var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var55 = -1;

while (true) {
long var8 = var52;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var57 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var55) {
case 0:
var40[var10001] = var57;
if (var2 >= var5) {
g = var6;
h = new Integer[17];
KProperty[] var33 = new KProperty[c<"e">(25636, 7287825801162181664L ^ var20)];
var33[0] = Reflection.property1(new PropertyReference1Impl(uv.class, b<"h">(3151, 364148735467901801L ^ var20), b<"h">(986, 394719985301511423L ^ var20), 0));
var33[1] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(8366, 1663245965983023006L ^ var20), b<"h">(24293, 9079845438258905537L ^ var20), 0)
);
var33[2] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(17916, 2555148354954074830L ^ var20), b<"h">(24737, 3004159069559898002L ^ var20), 0)
);
var33[3] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(20117, 5372529974282391980L ^ var20), b<"h">(12519, 1582562157826502623L ^ var20), 0)
);
var33[4] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(30293, 642705295737366888L ^ var20), b<"h">(18003, 7843582168095168838L ^ var20), 0)
);
var33[5] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(2293, 6355736300784900072L ^ var20), b<"h">(26854, 4072441270771988433L ^ var20), 0)
);
var33[c<"e">(5613, 230212300045401584L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(3743, 5636992671171629476L ^ var20), b<"h">(19112, 6261552457597916572L ^ var20), 0)
);
var33[c<"e">(1010, 4625482286824434667L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(23762, 4946545955837969388L ^ var20), b<"h">(10330, 6108834192880596859L ^ var20), 0)
);
var33[c<"e">(13482, 6252182678451002558L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uv.class, b<"h">(6687, 5877433601597719817L ^ var20), b<"h">(9336, 1940542631217396562L ^ var20), 0)
);
var33[c<"e">(19405, 5811940027651580892L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uv.class, b<"h">(26975, 3245727369619060329L ^ var20), b<"h">(26308, 2552603907933714899L ^ var20), 0)
);
D = var33;
K = new uv(var28, (byte)var30);
O = yp.t(K, b<"h">(12793, 3961061381712572139L ^ var20), true, var24, null, null, c<"e">(27049, 2408685668990992825L ^ var20), null);
c = yp.t(K, b<"h">(1951, 7329530375887280271L ^ var20), true, var24, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null);
J = yp.t(K, b<"h">(15194, 7092192670898873457L ^ var20), true, var24, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null);
W = yp.t(K, b<"h">(23608, 5018517584007037709L ^ var20), true, var24, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null);
C = yp.L(
K,
b<"h">(23721, 4272598086668092292L ^ var20),
c<"e">(4408, 5681920564766587174L ^ var20),
new IntRange(0, c<"e">(3086, 2774540063569945628L ^ var20)),
var26,
null,
null,
c<"e">(2718, 3237538886522544773L ^ var20),
null
);
F = yp.t(K, b<"h">(25160, 1054737176803655014L ^ var20), true, var24, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null);
I = yp.L(K, b<"h">(4599, 2338392069631889128L ^ var20), su.catlean.p.LackOfRegen, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null, var31);
B = yp.L(
K,
b<"h">(18734, 7363355808137549362L ^ var20),
c<"e">(4408, 5681920564766587174L ^ var20),
new IntRange(0, c<"e">(16034, 7897135907427784378L ^ var20)),
var26,
null,
uv::j,
c<"e">(4408, 5681920564766587174L ^ var20),
null
);
U = yp.L(K, b<"h">(25683, 1678191228724099956L ^ var20), 3, new IntRange(1, 3), var26, null, null, c<"e">(23335, 2160755619113268017L ^ var20), null);
e = yp.L(K, b<"h">(3354, 4487447038689727034L ^ var20), f9.SILENT_FULL, null, null, c<"e">(7468, 6724085278017467699L ^ var20), null, var31);
w = new i9(var22);
return;
}
break;
default:
var40[var10001] = var57;
if (var2 < var5) {
continue label36;
}

var4 = "o·È_cW\u0080»À\b<C \u008eØ\u0011";
var5 = "o·È_cW\u0080»À\b<C \u008eØ\u0011".length();
var2 = 0;
}

byte var46 = var2;
var2 += 8;
var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
var40 = var6;
var10001 = var3++;
var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var55 = 0;
}
}
}

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var48;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "Ç\u0001\u008a¸úJ\u0082ëçáÍ\u009cH\u000byÆ\u0010\u0019æÐ!\u0081d\u008a\u0093\u0084ch\u001aN\u009b\u0083£";
var17 = "Ç\u0001\u008a¸úJ\u0082ëçáÍ\u009cH\u000byÆ\u0010\u0019æÐ!\u0081d\u008a\u0093\u0084ch\u001aN\u009b\u0083£".length();
var14 = 16;
var36 = -1;
}

var37 = var15.substring(++var36, var36 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1128;
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
throw new RuntimeException("su/catlean/uv", var10);
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
throw new RuntimeException("su/catlean/uv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29513;
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
throw new RuntimeException("su/catlean/uv", var14);
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
throw new RuntimeException("su/catlean/uv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
