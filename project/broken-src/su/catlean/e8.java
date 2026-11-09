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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e8 extends _g {
@NotNull
public static final e8 e;
static final KProperty[] L;
@NotNull
private static final cw t;
@NotNull
private static final cw w;
@NotNull
private static final c8 c;
@NotNull
private static final c8 V;
@NotNull
private static final ct G;
@NotNull
private static final ct U;
@NotNull
private static final ct a;
@NotNull
private static final cq P;
private static float N;
private static float Y;
private static float h;
private static float b;
private static final long d = yz.a(8817249581474992697L, 4284579878735130283L, MethodHandles.lookup().lookupClass()).a(144576988037376L);
private static final String[] f;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long[] j;
private static final Integer[] k;
private static final Map l;

private e8(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 109872416742400L;
super(b<"d">(32311, 6331216882944512421L ^ var1), jt.v(), null, 4, null, var3);
}

private final _q z(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ d;
long var6 = var4 ^ 24890832943842L;
return (_q)t.E(this, var6, L[0]);
}

private final _q F(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 19334488810224L;
return (_q)w.E(this, var3, L[1]);
}

private final int q(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 41095756465451L;
return ((Number)c.E(this, var6, L[2])).intValue();
}

private final void D(byte var1, long var2, int var4) {
long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ d;
long var7 = var5 ^ 20787059770534L;
c.b(this, var7, L[2], var4);
}

private final int j(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 122749445204125L;
return ((Number)V.E(this, var3, L[3])).intValue();
}

private final void f(int var1, char var2, int var3, int var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ d;
long var7 = var5 ^ 5142543748662L;
V.b(this, var7, L[3], var3);
}

private final float E(short var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 59115996582690L;
return ((Number)G.E(this, var6, L[4])).floatValue();
}

private final void I(float var1, int var2, long var3) {
long var5 = ((long)var2 << 32 | var3 << 32 >>> 32) ^ d;
long var7 = var5 ^ 5981106135589L;
G.b(this, var7, L[4], var1);
}

private final float V(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 115034240977799L;
return ((Number)U.E(this, var3, L[5])).floatValue();
}

private final void K(short var1, int var2, float var3, short var4) {
long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ d;
long var7 = var5 ^ 80381352388844L;
U.b(this, var7, L[5], var3);
}

private final float P(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 130256225073764L;
return ((Number)a.E(this, var3, L[c<"f">(31350, 179410130586090982L ^ var1)])).floatValue();
}

private final void U(float var1, long var2) {
var2 = d ^ var2;
long var4 = var2 ^ 103032707602286L;
a.b(this, var4, L[c<"f">(30616, 6078039386674891501L ^ var2)], var1);
}

private final boolean a(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 79979879386967L;
return (Boolean)P.E(this, var3, L[c<"f">(18894, 8409377661466327908L ^ var1)]);
}

@Flow(
priority = 10
)
private final void K(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e8.d J
// 003: ldc2_w 43859716148643
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 63577378178439
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 123584530678283
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 52358208032496
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 17300719323680
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 91153698574981
// 029: lxor
// 02a: dup2
// 02b: bipush 48
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 16
// 034: lshl
// 035: bipush 32
// 037: lushr
// 038: l2i
// 039: istore 13
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 14
// 045: pop2
// 046: dup2
// 047: ldc2_w 124794660567877
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 16
// 05c: dup2
// 05d: bipush 32
// 05f: lshl
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 17
// 066: pop2
// 067: dup2
// 068: ldc2_w 28000145689505
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 130528174842711
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 94162343010318
// 079: lxor
// 07a: lstore 22
// 07c: dup2
// 07d: ldc2_w 72855628776588
// 080: lxor
// 081: dup2
// 082: bipush 32
// 084: lushr
// 085: l2i
// 086: istore 24
// 088: dup2
// 089: bipush 32
// 08b: lshl
// 08c: bipush 48
// 08e: lushr
// 08f: l2i
// 090: istore 25
// 092: dup2
// 093: bipush 48
// 095: lshl
// 096: bipush 48
// 098: lushr
// 099: l2i
// 09a: istore 26
// 09c: pop2
// 09d: dup2
// 09e: ldc2_w 19056638737347
// 0a1: lxor
// 0a2: lstore 27
// 0a4: dup2
// 0a5: ldc2_w 32068454652162
// 0a8: lxor
// 0a9: lstore 29
// 0ab: dup2
// 0ac: ldc2_w 9348151191866
// 0af: lxor
// 0b0: lstore 31
// 0b2: pop2
// 0b3: ldc2_w 1849944552105035459
// 0b6: lload 2
// 0b7: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: astore 33
// 0be: lload 4
// 0c0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0c6: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 0c9: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0cc: aload 33
// 0ce: ifnonnull 0fc
// 0d1: ifne 111
// 0d4: goto 0e1
// 0d7: ldc2_w 1835043733189011778
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: lload 4
// 0e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0e9: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 0ec: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0ef: goto 0fc
// 0f2: ldc2_w 1835043733189011778
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: aload 33
// 0fe: ifnonnull 11a
// 101: ifeq 112
// 104: goto 111
// 107: ldc2_w 1835043733189011778
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: return
// 112: lload 18
// 114: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 117: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 11a: aload 33
// 11c: ifnonnull 154
// 11f: ifeq 158
// 122: goto 12f
// 125: ldc2_w 1835043733189011778
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: aload 0
// 130: aload 33
// 132: ifnonnull 159
// 135: goto 142
// 138: ldc2_w 1835043733189011778
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: lload 8
// 144: invokespecial su/catlean/e8.a (J)Z
// 147: goto 154
// 14a: ldc2_w 1835043733189011778
// 14d: lload 2
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: ifeq 158
// 157: return
// 158: aload 0
// 159: lload 20
// 15b: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 15e: getstatic su/catlean/_q.RANDOM Lsu/catlean/_q;
// 161: aload 33
// 163: ifnonnull 1c6
// 166: if_acmpne 1b7
// 169: goto 176
// 16c: ldc2_w 1835043733189011778
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: lload 18
// 178: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17b: getfield net/minecraft/class_746.field_6012 I
// 17e: aload 0
// 17f: lload 31
// 181: invokespecial su/catlean/e8.j (J)I
// 184: irem
// 185: ifne 1b7
// 188: goto 195
// 18b: ldc2_w 1835043733189011778
// 18e: lload 2
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: ldc 90.0
// 197: ldc -90.0
// 199: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 19c: checkcast kotlin/ranges/ClosedRange
// 19f: lload 22
// 1a1: bipush 0
// 1a2: bipush 2
// 1a3: aconst_null
// 1a4: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 1a7: putstatic su/catlean/e8.Y F
// 1aa: goto 1b7
// 1ad: ldc2_w 1835043733189011778
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 0
// 1b8: iload 15
// 1ba: i2c
// 1bb: iload 16
// 1bd: i2s
// 1be: iload 17
// 1c0: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 1c3: getstatic su/catlean/_q.RANDOM Lsu/catlean/_q;
// 1c6: aload 33
// 1c8: ifnonnull 22f
// 1cb: if_acmpne 220
// 1ce: goto 1db
// 1d1: ldc2_w 1835043733189011778
// 1d4: lload 2
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: lload 18
// 1dd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e0: getfield net/minecraft/class_746.field_6012 I
// 1e3: aload 0
// 1e4: iload 24
// 1e6: iload 25
// 1e8: iload 26
// 1ea: i2c
// 1eb: invokespecial su/catlean/e8.q (IIC)I
// 1ee: irem
// 1ef: ifne 220
// 1f2: goto 1ff
// 1f5: ldc2_w 1835043733189011778
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: fconst_0
// 200: ldc 360.0
// 202: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 205: checkcast kotlin/ranges/ClosedRange
// 208: lload 22
// 20a: bipush 0
// 20b: bipush 2
// 20c: aconst_null
// 20d: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 210: putstatic su/catlean/e8.N F
// 213: goto 220
// 216: ldc2_w 1835043733189011778
// 219: lload 2
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 0
// 221: iload 15
// 223: i2c
// 224: iload 16
// 226: i2s
// 227: iload 17
// 229: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 22c: getstatic su/catlean/_q.SPIN Lsu/catlean/_q;
// 22f: aload 33
// 231: ifnonnull 2ee
// 234: if_acmpne 2e5
// 237: goto 244
// 23a: ldc2_w 1835043733189011778
// 23d: lload 2
// 23e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: athrow
// 244: lload 18
// 246: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 249: getfield net/minecraft/class_746.field_6012 I
// 24c: aload 0
// 24d: iload 24
// 24f: iload 25
// 251: iload 26
// 253: i2c
// 254: invokespecial su/catlean/e8.q (IIC)I
// 257: irem
// 258: aload 33
// 25a: ifnonnull 2a0
// 25d: goto 26a
// 260: ldc2_w 1835043733189011778
// 263: lload 2
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: ifne 2e5
// 26d: goto 27a
// 270: ldc2_w 1835043733189011778
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: getstatic su/catlean/e8.N F
// 27d: aload 0
// 27e: iload 12
// 280: i2s
// 281: iload 13
// 283: iload 14
// 285: i2s
// 286: invokespecial su/catlean/e8.E (SIS)F
// 289: fadd
// 28a: putstatic su/catlean/e8.N F
// 28d: getstatic su/catlean/e8.N F
// 290: ldc 360.0
// 292: fcmpl
// 293: goto 2a0
// 296: ldc2_w 1835043733189011778
// 299: lload 2
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: aload 33
// 2a2: ifnonnull 2dd
// 2a5: ifle 2c6
// 2a8: goto 2b5
// 2ab: ldc2_w 1835043733189011778
// 2ae: lload 2
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: fconst_0
// 2b6: putstatic su/catlean/e8.N F
// 2b9: goto 2c6
// 2bc: ldc2_w 1835043733189011778
// 2bf: lload 2
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: getstatic su/catlean/e8.N F
// 2c9: aload 33
// 2cb: ifnonnull 2e2
// 2ce: fconst_0
// 2cf: fcmpg
// 2d0: goto 2dd
// 2d3: ldc2_w 1835043733189011778
// 2d6: lload 2
// 2d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dc: athrow
// 2dd: ifge 2e5
// 2e0: ldc 360.0
// 2e2: putstatic su/catlean/e8.N F
// 2e5: aload 0
// 2e6: lload 20
// 2e8: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 2eb: getstatic su/catlean/_q.SPIN Lsu/catlean/_q;
// 2ee: aload 33
// 2f0: ifnonnull 3a4
// 2f3: if_acmpne 39b
// 2f6: goto 303
// 2f9: ldc2_w 1835043733189011778
// 2fc: lload 2
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: lload 18
// 305: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 308: getfield net/minecraft/class_746.field_6012 I
// 30b: aload 0
// 30c: lload 31
// 30e: invokespecial su/catlean/e8.j (J)I
// 311: irem
// 312: aload 33
// 314: ifnonnull 354
// 317: goto 324
// 31a: ldc2_w 1835043733189011778
// 31d: lload 2
// 31e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 323: athrow
// 324: ifne 39b
// 327: goto 334
// 32a: ldc2_w 1835043733189011778
// 32d: lload 2
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: getstatic su/catlean/e8.Y F
// 337: aload 0
// 338: lload 10
// 33a: invokespecial su/catlean/e8.V (J)F
// 33d: fadd
// 33e: putstatic su/catlean/e8.Y F
// 341: getstatic su/catlean/e8.Y F
// 344: ldc 90.0
// 346: fcmpl
// 347: goto 354
// 34a: ldc2_w 1835043733189011778
// 34d: lload 2
// 34e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: athrow
// 354: aload 33
// 356: ifnonnull 393
// 359: ifle 37b
// 35c: goto 369
// 35f: ldc2_w 1835043733189011778
// 362: lload 2
// 363: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: athrow
// 369: ldc -90.0
// 36b: putstatic su/catlean/e8.Y F
// 36e: goto 37b
// 371: ldc2_w 1835043733189011778
// 374: lload 2
// 375: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37a: athrow
// 37b: getstatic su/catlean/e8.Y F
// 37e: aload 33
// 380: ifnonnull 398
// 383: ldc -90.0
// 385: fcmpg
// 386: goto 393
// 389: ldc2_w 1835043733189011778
// 38c: lload 2
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: ifge 39b
// 396: ldc 90.0
// 398: putstatic su/catlean/e8.Y F
// 39b: aload 0
// 39c: lload 20
// 39e: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 3a1: getstatic su/catlean/_q.SIN Lsu/catlean/_q;
// 3a4: aload 33
// 3a6: ifnonnull 410
// 3a9: if_acmpne 401
// 3ac: goto 3b9
// 3af: ldc2_w 1835043733189011778
// 3b2: lload 2
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: getstatic su/catlean/e8.h F
// 3bc: aload 0
// 3bd: lload 31
// 3bf: invokespecial su/catlean/e8.j (J)I
// 3c2: i2f
// 3c3: ldc 10.0
// 3c5: fdiv
// 3c6: fadd
// 3c7: putstatic su/catlean/e8.h F
// 3ca: lload 18
// 3cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3cf: invokevirtual net/minecraft/class_746.method_36455 ()F
// 3d2: f2d
// 3d3: aload 0
// 3d4: lload 10
// 3d6: invokespecial su/catlean/e8.V (J)F
// 3d9: f2d
// 3da: getstatic su/catlean/e8.h F
// 3dd: f2d
// 3de: invokestatic java/lang/Math.sin (D)D
// 3e1: dmul
// 3e2: dadd
// 3e3: d2f
// 3e4: putstatic su/catlean/e8.Y F
// 3e7: getstatic su/catlean/e8.Y F
// 3ea: ldc -90.0
// 3ec: ldc 90.0
// 3ee: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 3f1: putstatic su/catlean/e8.Y F
// 3f4: goto 401
// 3f7: ldc2_w 1835043733189011778
// 3fa: lload 2
// 3fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 400: athrow
// 401: aload 0
// 402: iload 15
// 404: i2c
// 405: iload 16
// 407: i2s
// 408: iload 17
// 40a: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 40d: getstatic su/catlean/_q.SIN Lsu/catlean/_q;
// 410: aload 33
// 412: ifnonnull 47c
// 415: if_acmpne 473
// 418: goto 425
// 41b: ldc2_w 1835043733189011778
// 41e: lload 2
// 41f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: athrow
// 425: getstatic su/catlean/e8.b F
// 428: aload 0
// 429: iload 24
// 42b: iload 25
// 42d: iload 26
// 42f: i2c
// 430: invokespecial su/catlean/e8.q (IIC)I
// 433: i2f
// 434: ldc 10.0
// 436: fdiv
// 437: fadd
// 438: putstatic su/catlean/e8.b F
// 43b: lload 18
// 43d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 440: invokevirtual net/minecraft/class_746.method_36454 ()F
// 443: f2d
// 444: aload 0
// 445: iload 12
// 447: i2s
// 448: iload 13
// 44a: iload 14
// 44c: i2s
// 44d: invokespecial su/catlean/e8.E (SIS)F
// 450: f2d
// 451: getstatic su/catlean/e8.b F
// 454: f2d
// 455: invokestatic java/lang/Math.sin (D)D
// 458: dmul
// 459: dadd
// 45a: aload 0
// 45b: lload 27
// 45d: invokespecial su/catlean/e8.P (J)F
// 460: f2d
// 461: dadd
// 462: d2f
// 463: putstatic su/catlean/e8.N F
// 466: goto 473
// 469: ldc2_w 1835043733189011778
// 46c: lload 2
// 46d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 472: athrow
// 473: aload 0
// 474: lload 20
// 476: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 479: getstatic su/catlean/_q.FIX Lsu/catlean/_q;
// 47c: aload 33
// 47e: ifnonnull 4b6
// 481: if_acmpne 4a7
// 484: goto 491
// 487: ldc2_w 1835043733189011778
// 48a: lload 2
// 48b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 490: athrow
// 491: aload 0
// 492: lload 10
// 494: invokespecial su/catlean/e8.V (J)F
// 497: putstatic su/catlean/e8.Y F
// 49a: goto 4a7
// 49d: ldc2_w 1835043733189011778
// 4a0: lload 2
// 4a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: athrow
// 4a7: aload 0
// 4a8: iload 15
// 4aa: i2c
// 4ab: iload 16
// 4ad: i2s
// 4ae: iload 17
// 4b0: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 4b3: getstatic su/catlean/_q.FIX Lsu/catlean/_q;
// 4b6: aload 33
// 4b8: ifnonnull 4f0
// 4bb: if_acmpne 4e7
// 4be: goto 4cb
// 4c1: ldc2_w 1835043733189011778
// 4c4: lload 2
// 4c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ca: athrow
// 4cb: aload 0
// 4cc: iload 12
// 4ce: i2s
// 4cf: iload 13
// 4d1: iload 14
// 4d3: i2s
// 4d4: invokespecial su/catlean/e8.E (SIS)F
// 4d7: putstatic su/catlean/e8.N F
// 4da: goto 4e7
// 4dd: ldc2_w 1835043733189011778
// 4e0: lload 2
// 4e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e6: athrow
// 4e7: aload 0
// 4e8: lload 20
// 4ea: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 4ed: getstatic su/catlean/_q.STATIC Lsu/catlean/_q;
// 4f0: aload 33
// 4f2: ifnonnull 540
// 4f5: if_acmpne 531
// 4f8: goto 505
// 4fb: ldc2_w 1835043733189011778
// 4fe: lload 2
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: lload 18
// 507: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 50a: invokevirtual net/minecraft/class_746.method_36455 ()F
// 50d: aload 0
// 50e: lload 10
// 510: invokespecial su/catlean/e8.V (J)F
// 513: fadd
// 514: putstatic su/catlean/e8.Y F
// 517: getstatic su/catlean/e8.Y F
// 51a: ldc -90.0
// 51c: ldc 90.0
// 51e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 521: putstatic su/catlean/e8.Y F
// 524: goto 531
// 527: ldc2_w 1835043733189011778
// 52a: lload 2
// 52b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 530: athrow
// 531: aload 0
// 532: iload 15
// 534: i2c
// 535: iload 16
// 537: i2s
// 538: iload 17
// 53a: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 53d: getstatic su/catlean/_q.STATIC Lsu/catlean/_q;
// 540: if_acmpne 577
// 543: lload 18
// 545: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 548: invokevirtual net/minecraft/class_746.method_36454 ()F
// 54b: sipush 20241
// 54e: ldc2_w 1805216813751182893
// 551: lload 2
// 552: lxor
// 553: invokedynamic f (IJ)I bsm=su/catlean/e8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 558: i2f
// 559: frem
// 55a: aload 0
// 55b: iload 12
// 55d: i2s
// 55e: iload 13
// 560: iload 14
// 562: i2s
// 563: invokespecial su/catlean/e8.E (SIS)F
// 566: fadd
// 567: putstatic su/catlean/e8.N F
// 56a: goto 577
// 56d: ldc2_w 1835043733189011778
// 570: lload 2
// 571: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 576: athrow
// 577: lload 18
// 579: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 57c: getfield net/minecraft/class_746.field_6012 I
// 57f: aload 0
// 580: iload 24
// 582: iload 25
// 584: iload 26
// 586: i2c
// 587: invokespecial su/catlean/e8.q (IIC)I
// 58a: bipush 2
// 58b: imul
// 58c: irem
// 58d: istore 34
// 58f: lload 18
// 591: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 594: getfield net/minecraft/class_746.field_6012 I
// 597: aload 0
// 598: lload 31
// 59a: invokespecial su/catlean/e8.j (J)I
// 59d: bipush 2
// 59e: imul
// 59f: irem
// 5a0: istore 35
// 5a2: aload 0
// 5a3: lload 20
// 5a5: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 5a8: getstatic su/catlean/_q.JITTER Lsu/catlean/_q;
// 5ab: aload 33
// 5ad: ifnonnull 62f
// 5b0: if_acmpne 620
// 5b3: goto 5c0
// 5b6: ldc2_w 1835043733189011778
// 5b9: lload 2
// 5ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bf: athrow
// 5c0: iload 34
// 5c2: aload 33
// 5c4: ifnonnull 5fe
// 5c7: goto 5d4
// 5ca: ldc2_w 1835043733189011778
// 5cd: lload 2
// 5ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d3: athrow
// 5d4: ifne 5fc
// 5d7: goto 5e4
// 5da: ldc2_w 1835043733189011778
// 5dd: lload 2
// 5de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e3: athrow
// 5e4: aload 0
// 5e5: lload 10
// 5e7: invokespecial su/catlean/e8.V (J)F
// 5ea: fconst_2
// 5eb: fdiv
// 5ec: putstatic su/catlean/e8.Y F
// 5ef: goto 5fc
// 5f2: ldc2_w 1835043733189011778
// 5f5: lload 2
// 5f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fb: athrow
// 5fc: iload 34
// 5fe: aload 0
// 5ff: lload 31
// 601: invokespecial su/catlean/e8.j (J)I
// 604: if_icmpne 620
// 607: aload 0
// 608: lload 10
// 60a: invokespecial su/catlean/e8.V (J)F
// 60d: ldc -2.0
// 60f: fdiv
// 610: putstatic su/catlean/e8.Y F
// 613: goto 620
// 616: ldc2_w 1835043733189011778
// 619: lload 2
// 61a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61f: athrow
// 620: aload 0
// 621: iload 15
// 623: i2c
// 624: iload 16
// 626: i2s
// 627: iload 17
// 629: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 62c: getstatic su/catlean/_q.JITTER Lsu/catlean/_q;
// 62f: aload 33
// 631: ifnonnull 6e4
// 634: if_acmpne 6d5
// 637: goto 644
// 63a: ldc2_w 1835043733189011778
// 63d: lload 2
// 63e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 643: athrow
// 644: iload 35
// 646: aload 33
// 648: ifnonnull 698
// 64b: goto 658
// 64e: ldc2_w 1835043733189011778
// 651: lload 2
// 652: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 657: athrow
// 658: ifne 696
// 65b: goto 668
// 65e: ldc2_w 1835043733189011778
// 661: lload 2
// 662: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 667: athrow
// 668: aload 0
// 669: iload 12
// 66b: i2s
// 66c: iload 13
// 66e: iload 14
// 670: i2s
// 671: invokespecial su/catlean/e8.E (SIS)F
// 674: fconst_2
// 675: fdiv
// 676: aload 0
// 677: lload 27
// 679: invokespecial su/catlean/e8.P (J)F
// 67c: fadd
// 67d: lload 18
// 67f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 682: invokevirtual net/minecraft/class_746.method_36454 ()F
// 685: fadd
// 686: putstatic su/catlean/e8.N F
// 689: goto 696
// 68c: ldc2_w 1835043733189011778
// 68f: lload 2
// 690: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 695: athrow
// 696: iload 35
// 698: aload 0
// 699: iload 24
// 69b: iload 25
// 69d: iload 26
// 69f: i2c
// 6a0: invokespecial su/catlean/e8.q (IIC)I
// 6a3: if_icmpne 6d5
// 6a6: aload 0
// 6a7: iload 12
// 6a9: i2s
// 6aa: iload 13
// 6ac: iload 14
// 6ae: i2s
// 6af: invokespecial su/catlean/e8.E (SIS)F
// 6b2: ldc -2.0
// 6b4: fdiv
// 6b5: aload 0
// 6b6: lload 27
// 6b8: invokespecial su/catlean/e8.P (J)F
// 6bb: fadd
// 6bc: lload 18
// 6be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6c1: invokevirtual net/minecraft/class_746.method_36454 ()F
// 6c4: fadd
// 6c5: putstatic su/catlean/e8.N F
// 6c8: goto 6d5
// 6cb: ldc2_w 1835043733189011778
// 6ce: lload 2
// 6cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d4: athrow
// 6d5: aload 0
// 6d6: iload 15
// 6d8: i2c
// 6d9: iload 16
// 6db: i2s
// 6dc: iload 17
// 6de: invokespecial su/catlean/e8.z (CSI)Lsu/catlean/_q;
// 6e1: getstatic su/catlean/_q.OFF Lsu/catlean/_q;
// 6e4: if_acmpeq 6f7
// 6e7: getstatic su/catlean/e8.N F
// 6ea: goto 6ff
// 6ed: ldc2_w 1835043733189011778
// 6f0: lload 2
// 6f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f6: athrow
// 6f7: lload 18
// 6f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6fc: invokevirtual net/minecraft/class_746.method_36454 ()F
// 6ff: fstore 36
// 701: aload 0
// 702: lload 20
// 704: invokespecial su/catlean/e8.F (J)Lsu/catlean/_q;
// 707: getstatic su/catlean/_q.OFF Lsu/catlean/_q;
// 70a: if_acmpeq 71d
// 70d: getstatic su/catlean/e8.Y F
// 710: goto 725
// 713: ldc2_w 1835043733189011778
// 716: lload 2
// 717: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71c: athrow
// 71d: lload 18
// 71f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 722: invokevirtual net/minecraft/class_746.method_36455 ()F
// 725: fstore 37
// 727: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 72a: new su/catlean/_w
// 72d: dup
// 72e: fload 36
// 730: lload 29
// 732: fload 37
// 734: bipush 0
// 735: aconst_null
// 736: sipush 27575
// 739: ldc2_w 8369165318109921926
// 73c: lload 2
// 73d: lxor
// 73e: invokedynamic f (IJ)I bsm=su/catlean/e8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 743: aconst_null
// 744: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 747: bipush 0
// 748: lload 6
// 74a: dup2_x2
// 74b: pop2
// 74c: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 74f: return
}

static {
long var20 = d ^ 13004444613589L;
long var22 = var20 ^ 80311763580684L;
long var24 = var20 ^ 3155276228132L;
long var26 = var20 ^ 32378410362124L;
long var28 = var20 ^ 55890418690154L;
long var30 = var20 ^ 127168582537950L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[25];
int var16 = 0;
String var15 = "\u009a¨H.Å\"ÙG¾\u00ad\u0093;t\nÄ\u0002ó³Û|¾\u008f\u0011& \u0080?æ&Ò?\u0015×m:Ü¼jE\u0095$\u0016ë/£Ì*·\u0007g=\u001bdnÂ\\2 \u0006wµ=¤{R\n\u0086\u0091\rDO&·»¡à©\u0010nQï\f6µ¦f¢\u0013\u0015\u0012\u0010Ð\u008d\u00953R\u001d\u001bH'4/¦M°³ä \u0007Á«UA±öó\u0004E®y\u0005¹m\u0095\u0095\u008d~Õk\u008cì\u0085P\u0098\u0095v& 1¦ Ô\n¾µQ\u0001\t\u000eÜ\u0097\u0090\u0086ÝÖ\u0099°P*É¿:æ¼d¡*7²y!hC ÏW\u0096Øü\u0089Þ{gþ±Ò\u0092 `\u0084B\u0005º\u009b²¸ðî\u0005ÃÇM_6#T\u0018U\u009c]\u008dâ\u0088\u0089e,ÕÊù¥¦ô\u008e`µ4ððû\tÊ\u0010p¥'ð>Ò7Æ[5¤Ýz\u001fr¸ ï¾\b\u0001\u0088¤\u0084\u0096\u008fëX:Õ\u0017&Ë!y\u0011}\u009b¯\u0016\u0083:£âÑ7ÛC=\u00182'\u0012óÊ¢~X ñ·C[ 0^©` \u0099\u0003\u0000Ñ\u001e(\u001c\u0092ê\u001dyC[R/¥9LÄ\u009e@µUrý½#@rT-t~\u0085\u0087Jó»T¨rÖ$éBü \u000b\u0016dº\b\u001bi\u000fì3ã0~\u0085ÒâR¤ñ\u0081C Ì\u0087é[¢ýqÀLe(h¤ó\u0098_Å¾\u001eL\u0080\u0093nÉýõ\u008e\u009d±\u0090\tð\u009fwãÇ\fÂ\u0006¶\u0091ï\u0001±Çn2%\u009aß\u008c  \u0018\u0013\u0007Nuë\u008b\u0093\u0087º\u0016J¡\u0099\u000eÍÃ\ndAXØhÍÂ9è0a\u0089\u009e ,ô+\u0007·²1\u009cê\u0080çÅÀÀ÷E\r/\u0000\u0090\u0004\u009f\u001a~S5ðª`\u0011º\u009f0\u009e^I»ñª\u0086¶F\u009b\u0084Ùï©&þIÕ$¶ç}Å48Ï\u001d\u0085-¢\u00845v\u009d|i\u00adçEOÛ§¡>Ñ¨\u0000\"\u0010b¾nÀ$|0Ý õÆ^y\u001c)¶(Ç\u00922kópêòå\u0090{Ûðúî\"jj±3k©ÉÓ\u0004?\u008c\u0080v£c\u0091\u0002.\u009bAÑC-Q \u0010\u009aÝ.0\u008cïr¡snjzvw&Ïõklq:W\u0084Ë\u0016!IdÖÎS8ì÷\u0005ëðJé¶\u001f©ã½ô\u0002j\\qbsêÕ»@µ6\u0014?ö§cðD¢?\u001aå´\u0007\u0005Ót7ÍS\u0011Ýs\u000f\u001f=\u001b\u0095ü¢\u008e\u0012\u0018aÑ\u00967\ní»\u0094íþìÙú\u0091ë&¡i\"H¢\fâ°\u0018ÑGªý\"\u0007¦fË\u000fÏ£<é\u0015Ç\u0097b·ÐÞ\n{J";
int var17 = "\u009a¨H.Å\"ÙG¾\u00ad\u0093;t\nÄ\u0002ó³Û|¾\u008f\u0011& \u0080?æ&Ò?\u0015×m:Ü¼jE\u0095$\u0016ë/£Ì*·\u0007g=\u001bdnÂ\\2 \u0006wµ=¤{R\n\u0086\u0091\rDO&·»¡à©\u0010nQï\f6µ¦f¢\u0013\u0015\u0012\u0010Ð\u008d\u00953R\u001d\u001bH'4/¦M°³ä \u0007Á«UA±öó\u0004E®y\u0005¹m\u0095\u0095\u008d~Õk\u008cì\u0085P\u0098\u0095v& 1¦ Ô\n¾µQ\u0001\t\u000eÜ\u0097\u0090\u0086ÝÖ\u0099°P*É¿:æ¼d¡*7²y!hC ÏW\u0096Øü\u0089Þ{gþ±Ò\u0092 `\u0084B\u0005º\u009b²¸ðî\u0005ÃÇM_6#T\u0018U\u009c]\u008dâ\u0088\u0089e,ÕÊù¥¦ô\u008e`µ4ððû\tÊ\u0010p¥'ð>Ò7Æ[5¤Ýz\u001fr¸ ï¾\b\u0001\u0088¤\u0084\u0096\u008fëX:Õ\u0017&Ë!y\u0011}\u009b¯\u0016\u0083:£âÑ7ÛC=\u00182'\u0012óÊ¢~X ñ·C[ 0^©` \u0099\u0003\u0000Ñ\u001e(\u001c\u0092ê\u001dyC[R/¥9LÄ\u009e@µUrý½#@rT-t~\u0085\u0087Jó»T¨rÖ$éBü \u000b\u0016dº\b\u001bi\u000fì3ã0~\u0085ÒâR¤ñ\u0081C Ì\u0087é[¢ýqÀLe(h¤ó\u0098_Å¾\u001eL\u0080\u0093nÉýõ\u008e\u009d±\u0090\tð\u009fwãÇ\fÂ\u0006¶\u0091ï\u0001±Çn2%\u009aß\u008c  \u0018\u0013\u0007Nuë\u008b\u0093\u0087º\u0016J¡\u0099\u000eÍÃ\ndAXØhÍÂ9è0a\u0089\u009e ,ô+\u0007·²1\u009cê\u0080çÅÀÀ÷E\r/\u0000\u0090\u0004\u009f\u001a~S5ðª`\u0011º\u009f0\u009e^I»ñª\u0086¶F\u009b\u0084Ùï©&þIÕ$¶ç}Å48Ï\u001d\u0085-¢\u00845v\u009d|i\u00adçEOÛ§¡>Ñ¨\u0000\"\u0010b¾nÀ$|0Ý õÆ^y\u001c)¶(Ç\u00922kópêòå\u0090{Ûðúî\"jj±3k©ÉÓ\u0004?\u008c\u0080v£c\u0091\u0002.\u009bAÑC-Q \u0010\u009aÝ.0\u008cïr¡snjzvw&Ïõklq:W\u0084Ë\u0016!IdÖÎS8ì÷\u0005ëðJé¶\u001f©ã½ô\u0002j\\qbsêÕ»@µ6\u0014?ö§cðD¢?\u001aå´\u0007\u0005Ót7ÍS\u0011Ýs\u000f\u001f=\u001b\u0095ü¢\u008e\u0012\u0018aÑ\u00967\ní»\u0094íþìÙú\u0091ë&¡i\"H¢\fâ°\u0018ÑGªý\"\u0007¦fË\u000fÏ£<é\u0015Ç\u0097b·ÐÞ\n{J"
.length();
char var14 = 24;
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
f = var18;
g = new String[25];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "ò\u0092\u0089\t\"FémÃ\u008fê\u0093¿Çò/FýL\u0016\u0087\u0014ÈÙ!8\u0015$;ùø«ÔÈ\u008f\u001ep\u0018*Ó@]\u0082\u0012SÈ{\u008cÈ¼Å\u0086nË½\u0004:\u0006jzo\u0093\u009bs\u00868E)Æåþù\u008eqvS\u0013Q\nâ";
int var5 = "ò\u0092\u0089\t\"FémÃ\u008fê\u0093¿Çò/FýL\u0016\u0087\u0014ÈÙ!8\u0015$;ùø«ÔÈ\u008f\u001ep\u0018*Ó@]\u0082\u0012SÈ{\u008cÈ¼Å\u0086nË½\u0004:\u0006jzo\u0093\u009bs\u00868E)Æåþù\u008eqvS\u0013Q\nâ"
.length();
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
j = var6;
k = new Integer[12];
KProperty[] var32 = new KProperty[c<"f">(20217, 982915003355763135L ^ var20)];
var32[0] = Reflection.property1(new PropertyReference1Impl(e8.class, b<"d">(32620, 162942299247293086L ^ var20), b<"d">(8417, 5694145752627309839L ^ var20), 0));
var32[1] = Reflection.property1(
new PropertyReference1Impl(e8.class, b<"d">(27074, 4733632673808753721L ^ var20), b<"d">(15103, 2888933904443733781L ^ var20), 0)
);
var32[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e8.class, b<"d">(25518, 7680503947763887696L ^ var20), b<"d">(2945, 7296217053173892727L ^ var20), 0)
);
var32[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e8.class, b<"d">(31304, 1509258097438472114L ^ var20), b<"d">(9920, 7258364264116939575L ^ var20), 0)
);
var32[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e8.class, b<"d">(9342, 5253812732736760203L ^ var20), b<"d">(30723, 4207051649874572799L ^ var20), 0)
);
var32[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e8.class, b<"d">(11725, 5969565036020097056L ^ var20), b<"d">(8438, 5764537042539605278L ^ var20), 0)
);
var32[c<"f">(30616, 6078074082215471315L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e8.class, b<"d">(1799, 7032049846052408046L ^ var20), b<"d">(9564, 3798909700501334192L ^ var20), 0)
);
var32[c<"f">(21590, 2744350858928655125L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(e8.class, b<"d">(11732, 6142227580684820521L ^ var20), b<"d">(14470, 4052174403259135351L ^ var20), 0)
);
L = var32;
e = new e8(var22);
t = yp.L(e, b<"d">(3755, 5253083403318608704L ^ var20), _q.OFF, null, null, c<"f">(24179, 4337129133722534202L ^ var20), null, var30);
w = yp.L(e, b<"d">(4699, 7472363706369171362L ^ var20), _q.OFF, null, null, c<"f">(27575, 8369117146016789744L ^ var20), null, var30);
c = yp.L(
e,
b<"d">(27472, 2729739035151935136L ^ var20),
1,
new IntRange(1, c<"f">(6327, 89041351896483831L ^ var20)),
var26,
null,
null,
c<"f">(32569, 5648937888829612156L ^ var20),
null
);
V = yp.L(
e,
b<"d">(8428, 3509618240597028099L ^ var20),
1,
new IntRange(1, c<"f">(20126, 4990311839529701852L ^ var20)),
var26,
null,
null,
c<"f">(2280, 2964094873591076780L ^ var20),
null
);
G = yp.k(
e, b<"d">(9912, 2727217268393470784L ^ var20), 60.0F, var24, RangesKt.rangeTo(-360.0F, 360.0F), null, null, c<"f">(2280, 2964094873591076780L ^ var20), null
);
U = yp.k(
e, b<"d">(26743, 6965168101292975496L ^ var20), 10.0F, var24, RangesKt.rangeTo(-90.0F, 90.0F), null, null, c<"f">(2280, 2964094873591076780L ^ var20), null
);
a = yp.k(
e, b<"d">(15852, 1442095145307664398L ^ var20), 0.0F, var24, RangesKt.rangeTo(-180.0F, 180.0F), null, null, c<"f">(2280, 2964094873591076780L ^ var20), null
);
P = yp.t(e, b<"d">(23866, 1725395507466670286L ^ var20), true, var28, null, null, c<"f">(27575, 8369117146016789744L ^ var20), null);
return;
}
break;
default:
var39[var10001] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "È%\u0005zOv\u0003©'Éh¦¿\t!¾";
var5 = "È%\u0005zOv\u0003©'Éh¦¿\t!¾".length();
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

var15 = "\u0010Nÿ\u0005B6j©ÉQòoÐJ-×Ð|®\u00adÖs¤?·¥\u0018¢\u008e\u0017Ïµ \u0000¦\u0082oÚ¸Ü\u001dtiÎ¢üêJ\u000e\u0015å _î\u0017Îv¥òÎVÇ\u0086[¼";
var17 = "\u0010Nÿ\u0005B6j©ÉQòoÐJ-×Ð|®\u00adÖs¤?·¥\u0018¢\u008e\u0017Ïµ \u0000¦\u0082oÚ¸Ü\u001dtiÎ¢üêJ\u000e\u0015å _î\u0017Îv¥òÎVÇ\u0086[¼".length();
var14 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25410;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/e8", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = f[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/e8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29177;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = j[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/e8", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/e8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
