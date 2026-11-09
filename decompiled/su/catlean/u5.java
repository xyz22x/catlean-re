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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1324;
import net.minecraft.class_5134;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class u5 extends _g {
@NotNull
public static final u5 g;
static final KProperty[] d;
@NotNull
private static final cw c;
@NotNull
private static final ct I;
@NotNull
private static final cq U;
@NotNull
private static final cq j;
private static final long a = yz.a(1901266971513563256L, 7142061953972540871L, MethodHandles.lookup().lookupClass()).a(271882228413522L);
private static final String[] b;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private u5(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 85801739813796L;
super(b<"m">(3833, 6564251037678383621L ^ var1), jt.V(), null, 4, null, var3);
}

private final sk j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 53258483616076L;
return (sk)c.E(this, var3, d[0]);
}

private final void A(sk var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 7861813157391L;
c.b(this, var4, d[0], var1);
}

private final float e(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 32099707884958L;
return ((Number)I.E(this, var6, d[1])).floatValue();
}

private final void C(long var1, float var3) {
var1 = a ^ var1;
long var4 = var1 ^ 14904668559938L;
I.b(this, var4, d[1], var3);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 46427755555468L;
return (Boolean)U.E(this, var3, d[2]);
}

private final void v(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 85783880377235L;
U.b(this, var4, d[2], var1);
}

private final boolean q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 66578743561984L;
return (Boolean)j.E(this, var3, d[3]);
}

private final void q(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 99012034230024L;
j.b(this, var4, d[3], var1);
}

@Override
public void b(long var1) {
long var3 = var1 ^ 117573222669056L;
this.L(var3, 0.6F);
}

@Flow
public final void C(@NotNull PreSyncEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u5.a J
// 003: ldc2_w 117908662582839
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 121469234774046
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 60257497294765
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 40
// 029: lshl
// 02a: bipush 40
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 30289013799807
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 69012117509139
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 1949058963647
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 86374026492541
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 25776569924915
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 86708060229176
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 120857207284963
// 05f: lxor
// 060: dup2
// 061: bipush 32
// 063: lushr
// 064: l2i
// 065: istore 21
// 067: dup2
// 068: bipush 32
// 06a: lshl
// 06b: bipush 48
// 06d: lushr
// 06e: l2i
// 06f: istore 22
// 071: dup2
// 072: bipush 48
// 074: lshl
// 075: bipush 48
// 077: lushr
// 078: l2i
// 079: istore 23
// 07b: pop2
// 07c: pop2
// 07d: ldc2_w -2556245555267115988
// 080: lload 2
// 081: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: aload 1
// 087: ldc "e"
// 089: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08c: istore 24
// 08e: aload 0
// 08f: iload 24
// 091: ifne 0b8
// 094: lload 9
// 096: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 099: getstatic su/catlean/sk.NCP_2 Lsu/catlean/sk;
// 09c: if_acmpne 0b7
// 09f: goto 0ac
// 0a2: ldc2_w -2545426173369055128
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: return
// 0ad: ldc2_w -2545426173369055128
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 0
// 0b8: lload 17
// 0ba: invokespecial su/catlean/u5.q (J)Z
// 0bd: iload 24
// 0bf: ifne 11a
// 0c2: ifeq 102
// 0c5: goto 0d2
// 0c8: ldc2_w -2545426173369055128
// 0cb: lload 2
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: lload 4
// 0d4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0da: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 0dd: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0e0: iload 24
// 0e2: ifne 11a
// 0e5: goto 0f2
// 0e8: ldc2_w -2545426173369055128
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: ifne 1ad
// 0f5: goto 102
// 0f8: ldc2_w -2545426173369055128
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: lload 19
// 104: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 107: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 10a: getfield net/minecraft/class_1656.field_7479 Z
// 10d: goto 11a
// 110: ldc2_w -2545426173369055128
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: iload 24
// 11c: ifne 144
// 11f: ifne 1ad
// 122: goto 12f
// 125: ldc2_w -2545426173369055128
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: lload 19
// 131: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 134: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 137: goto 144
// 13a: ldc2_w -2545426173369055128
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: iload 24
// 146: ifne 16e
// 149: ifne 1ad
// 14c: goto 159
// 14f: ldc2_w -2545426173369055128
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: lload 19
// 15b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15e: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 161: goto 16e
// 164: ldc2_w -2545426173369055128
// 167: lload 2
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: iload 24
// 170: ifne 198
// 173: ifne 1ad
// 176: goto 183
// 179: ldc2_w -2545426173369055128
// 17c: lload 2
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: lload 19
// 185: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 188: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 18b: goto 198
// 18e: ldc2_w -2545426173369055128
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: iload 24
// 19a: ifne 1c8
// 19d: ifeq 1c0
// 1a0: goto 1ad
// 1a3: ldc2_w -2545426173369055128
// 1a6: lload 2
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: aload 0
// 1ae: lload 11
// 1b0: ldc 0.6
// 1b2: invokespecial su/catlean/u5.L (JF)V
// 1b5: return
// 1b6: ldc2_w -2545426173369055128
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: lload 19
// 1c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c5: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1c8: ifeq 236
// 1cb: aload 0
// 1cc: aload 0
// 1cd: iload 24
// 1cf: ifne 206
// 1d2: goto 1df
// 1d5: ldc2_w -2545426173369055128
// 1d8: lload 2
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: lload 9
// 1e1: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 1e4: getstatic su/catlean/sk.STRICT_NCP Lsu/catlean/sk;
// 1e7: if_acmpne 205
// 1ea: goto 1f7
// 1ed: ldc2_w -2545426173369055128
// 1f0: lload 2
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: fconst_1
// 1f8: goto 210
// 1fb: ldc2_w -2545426173369055128
// 1fe: lload 2
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: aload 0
// 206: iload 6
// 208: i2b
// 209: iload 7
// 20b: iload 8
// 20d: invokespecial su/catlean/u5.e (BII)F
// 210: lload 11
// 212: dup2_x1
// 213: pop2
// 214: invokespecial su/catlean/u5.L (JF)V
// 217: iload 24
// 219: ifeq 23e
// 21c: bipush 1
// 21d: anewarray 29
// 220: ldc2_w -2562330861806365107
// 223: lload 2
// 224: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: goto 236
// 22c: ldc2_w -2545426173369055128
// 22f: lload 2
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: aload 0
// 237: lload 11
// 239: ldc 0.6
// 23b: invokespecial su/catlean/u5.L (JF)V
// 23e: aload 0
// 23f: lload 9
// 241: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 244: getstatic su/catlean/sk.NCP Lsu/catlean/sk;
// 247: iload 24
// 249: ifne 272
// 24c: if_acmpeq 275
// 24f: goto 25c
// 252: ldc2_w -2545426173369055128
// 255: lload 2
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: aload 0
// 25d: lload 9
// 25f: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 262: getstatic su/catlean/sk.STRICT_NCP Lsu/catlean/sk;
// 265: goto 272
// 268: ldc2_w -2545426173369055128
// 26b: lload 2
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: if_acmpne 3f7
// 275: lload 19
// 277: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27a: invokevirtual net/minecraft/class_746.method_23318 ()D
// 27d: lload 19
// 27f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 282: getfield net/minecraft/class_746.field_6036 D
// 285: dsub
// 286: dstore 25
// 288: dload 25
// 28a: ldc2_w 0.75
// 28d: dcmpg
// 28e: iload 24
// 290: ifne 2bf
// 293: ifle 2c2
// 296: goto 2a3
// 299: ldc2_w -2545426173369055128
// 29c: lload 2
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: dload 25
// 2a5: aload 0
// 2a6: iload 6
// 2a8: i2b
// 2a9: iload 7
// 2ab: iload 8
// 2ad: invokespecial su/catlean/u5.e (BII)F
// 2b0: f2d
// 2b1: dcmpl
// 2b2: goto 2bf
// 2b5: ldc2_w -2545426173369055128
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: ifle 2c3
// 2c2: return
// 2c3: aload 0
// 2c4: iload 21
// 2c6: iload 22
// 2c8: i2s
// 2c9: iload 23
// 2cb: i2s
// 2cc: dload 25
// 2ce: invokespecial su/catlean/u5.w (ISSD)[D
// 2d1: astore 27
// 2d3: aload 27
// 2d5: iload 24
// 2d7: ifne 2ec
// 2da: ifnull 3f7
// 2dd: goto 2ea
// 2e0: ldc2_w -2545426173369055128
// 2e3: lload 2
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: aload 27
// 2ec: arraylength
// 2ed: iload 24
// 2ef: ifne 316
// 2f2: bipush 1
// 2f3: if_icmple 3f7
// 2f6: goto 303
// 2f9: ldc2_w -2545426173369055128
// 2fc: lload 2
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: aload 0
// 304: lload 13
// 306: invokespecial su/catlean/u5.s (J)Z
// 309: goto 316
// 30c: ldc2_w -2545426173369055128
// 30f: lload 2
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: iload 24
// 318: ifne 345
// 31b: ifeq 344
// 31e: goto 32b
// 321: ldc2_w -2545426173369055128
// 324: lload 2
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 32e: fconst_1
// 32f: aload 27
// 331: arraylength
// 332: i2f
// 333: fdiv
// 334: invokevirtual su/catlean/tq.x (F)V
// 337: goto 344
// 33a: ldc2_w -2545426173369055128
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: bipush 0
// 345: istore 28
// 347: aload 27
// 349: arraylength
// 34a: istore 29
// 34c: iload 28
// 34e: iload 29
// 350: if_icmpge 3a9
// 353: aload 27
// 355: iload 28
// 357: daload
// 358: dstore 30
// 35a: new net/minecraft/class_2828$class_2829
// 35d: dup
// 35e: lload 19
// 360: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 363: getfield net/minecraft/class_746.field_6014 D
// 366: lload 19
// 368: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 36b: getfield net/minecraft/class_746.field_6036 D
// 36e: dload 30
// 370: dadd
// 371: lload 19
// 373: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 376: getfield net/minecraft/class_746.field_5969 D
// 379: bipush 0
// 37a: lload 19
// 37c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 37f: getfield net/minecraft/class_746.field_5976 Z
// 382: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 385: checkcast net/minecraft/class_2596
// 388: lload 15
// 38a: dup2_x1
// 38b: pop2
// 38c: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 38f: iinc 28 1
// 392: iload 24
// 394: ifne 3f7
// 397: iload 24
// 399: ifeq 34c
// 39c: goto 3a9
// 39f: ldc2_w -2545426173369055128
// 3a2: lload 2
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: aload 0
// 3aa: lload 9
// 3ac: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 3af: getstatic su/catlean/sk.STRICT_NCP Lsu/catlean/sk;
// 3b2: if_acmpne 3f7
// 3b5: new net/minecraft/class_2828$class_2829
// 3b8: dup
// 3b9: lload 19
// 3bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3be: getfield net/minecraft/class_746.field_6014 D
// 3c1: lload 19
// 3c3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c6: getfield net/minecraft/class_746.field_6036 D
// 3c9: dload 25
// 3cb: dadd
// 3cc: lload 19
// 3ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d1: getfield net/minecraft/class_746.field_5969 D
// 3d4: bipush 0
// 3d5: lload 19
// 3d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3da: getfield net/minecraft/class_746.field_5976 Z
// 3dd: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 3e0: checkcast net/minecraft/class_2596
// 3e3: lload 15
// 3e5: dup2_x1
// 3e6: pop2
// 3e7: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 3ea: goto 3f7
// 3ed: ldc2_w -2545426173369055128
// 3f0: lload 2
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: return
}

@Flow
private final void Z(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u5.a J
// 003: ldc2_w 36317521024252
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 39868731583189
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 89848013263284
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 5390723146995
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 102576574519288
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -5320685679515507330
// 029: lload 2
// 02a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: istore 12
// 031: lload 8
// 033: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 036: getfield net/minecraft/class_746.field_5976 Z
// 039: ifeq 1a7
// 03c: aload 0
// 03d: iload 12
// 03f: ifeq 075
// 042: goto 04f
// 045: ldc2_w -5303095923510254941
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: lload 6
// 051: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 054: getstatic su/catlean/sk.NCP_2 Lsu/catlean/sk;
// 057: if_acmpne 1a7
// 05a: goto 067
// 05d: ldc2_w -5303095923510254941
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 0
// 068: goto 075
// 06b: ldc2_w -5303095923510254941
// 06e: lload 2
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: lload 10
// 077: invokespecial su/catlean/u5.q (J)Z
// 07a: iload 12
// 07c: ifeq 0d4
// 07f: ifeq 0bf
// 082: goto 08f
// 085: ldc2_w -5303095923510254941
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: lload 4
// 091: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 094: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 097: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 09a: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 09d: iload 12
// 09f: ifeq 0d4
// 0a2: goto 0af
// 0a5: ldc2_w -5303095923510254941
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: ifne 1a7
// 0b2: goto 0bf
// 0b5: ldc2_w -5303095923510254941
// 0b8: lload 2
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: lload 8
// 0c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c4: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0c7: goto 0d4
// 0ca: ldc2_w -5303095923510254941
// 0cd: lload 2
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: iload 12
// 0d6: ifeq 117
// 0d9: ifeq 102
// 0dc: goto 0e9
// 0df: ldc2_w -5303095923510254941
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 1
// 0ea: ldc2_w 0.42
// 0ed: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 0f0: iload 12
// 0f2: ifne 1a3
// 0f5: goto 102
// 0f8: ldc2_w -5303095923510254941
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: aload 1
// 103: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 106: ldc2_w -0.1552320045166016
// 109: dcmpg
// 10a: goto 117
// 10d: ldc2_w -5303095923510254941
// 110: lload 2
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: iload 12
// 119: ifeq 12d
// 11c: ifne 130
// 11f: goto 12c
// 122: ldc2_w -5303095923510254941
// 125: lload 2
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: bipush 1
// 12d: goto 131
// 130: bipush 0
// 131: ifeq 14d
// 134: aload 1
// 135: ldc2_w 0.333
// 138: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 13b: iload 12
// 13d: ifne 1a3
// 140: goto 14d
// 143: ldc2_w -5303095923510254941
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: aload 1
// 14e: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 151: ldc2_w -0.230527368912964
// 154: dcmpg
// 155: iload 12
// 157: ifeq 178
// 15a: goto 167
// 15d: ldc2_w -5303095923510254941
// 160: lload 2
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: ifne 17b
// 16a: goto 177
// 16d: ldc2_w -5303095923510254941
// 170: lload 2
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: bipush 1
// 178: goto 17c
// 17b: bipush 0
// 17c: ifeq 198
// 17f: aload 1
// 180: ldc2_w 0.25
// 183: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 186: iload 12
// 188: ifne 1a3
// 18b: goto 198
// 18e: ldc2_w -5303095923510254941
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: return
// 199: ldc2_w -5303095923510254941
// 19c: lload 2
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 1
// 1a4: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 1a7: return
}

private final double[] w(int var1, short var2, short var3, double var4) {
long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
boolean var8 = vm.a<"Å">(6584579126951118902L, var6);

int var10000;
label58: {
label59: {
label67: {
label36: {
try {
var10000 = (int)(var4 * c<"g">(11373, 1116312257711746229L ^ var6));
if (!var8) {
break label58;
}

switch (var10000) {
case 7500:
case 10000:
break;
case 8125:
case 8750:
return new double[]{0.39, 0.7};
case 15000:
break label59;
case 20000:
break label67;
case 25000:
break label36;
default:
return null;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 6570647532030824427L, var6);
}

var10000 = 2;
break label58;
}

double[] var9 = new double[c<"g">(22526, 4792187045434185505L ^ var6)];
var9[0] = 0.425;
var9[1] = 0.821;
var9[2] = 0.699;
var9[3] = 0.599;
var9[4] = 1.022;
var9[5] = 1.372;
var9[c<"g">(17226, 261499981030802335L ^ var6)] = 1.652;
var9[c<"g">(15307, 5497191301571427101L ^ var6)] = 1.869;
var9[c<"g">(6910, 4457858473927776805L ^ var6)] = 2.019;
var9[c<"g">(17873, 7292608507400144133L ^ var6)] = 1.907;
return var9;
}

double[] var11 = new double[c<"g">(7797, 2215150804028694187L ^ var6)];
var11[0] = 0.42;
var11[1] = 0.78;
var11[2] = 0.63;
var11[3] = 0.51;
var11[4] = 0.9;
var11[5] = 1.21;
var11[c<"g">(17226, 261499981030802335L ^ var6)] = 1.45;
var11[c<"g">(11344, 8867635792829197452L ^ var6)] = 1.43;
return var11;
}

double[] var12 = new double[c<"g">(29088, 7618224999612510589L ^ var6)];
var12[0] = 0.42;
var12[1] = 0.75;
var12[2] = 1.0;
var12[3] = 1.16;
var12[4] = 1.23;
var12[5] = 1.2;
return var12;
}

double[] var14 = new double[var10000];
var14[0] = 0.42;
var14[1] = 0.753;
return var14;
}

private final void L(long var1, float var3) {
var1 = a ^ var1;
long var4 = var1 ^ 114953186179403L;
class_1324 var10000 = zf.v(var4).method_5996(class_5134.field_47761);
Intrinsics.checkNotNull(var10000);
var10000.method_6192(var3);
}

private static final boolean V() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u5.a J
// 03: ldc2_w 80675750037532
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 63699791826260
// 0d: lxor
// 0e: lstore 2
// 0f: pop2
// 10: ldc2_w 7694761464642714014
// 13: lload 0
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: istore 4
// 1b: getstatic su/catlean/u5.g Lsu/catlean/u5;
// 1e: lload 2
// 1f: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 22: getstatic su/catlean/sk.STRICT_NCP Lsu/catlean/sk;
// 25: iload 4
// 27: ifeq 51
// 2a: if_acmpeq 62
// 2d: goto 3a
// 30: ldc2_w 7676374581963505219
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: getstatic su/catlean/u5.g Lsu/catlean/u5;
// 3d: lload 2
// 3e: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 41: getstatic su/catlean/sk.NCP_2 Lsu/catlean/sk;
// 44: goto 51
// 47: ldc2_w 7676374581963505219
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: if_acmpeq 62
// 54: bipush 1
// 55: goto 63
// 58: ldc2_w 7676374581963505219
// 5b: lload 0
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: bipush 0
// 63: ireturn
}

private static final boolean I() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u5.a J
// 03: ldc2_w 9671437802056
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 132470826065664
// 0d: lxor
// 0e: lstore 2
// 0f: pop2
// 10: ldc2_w 8717007081255616595
// 13: lload 0
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: istore 4
// 1b: getstatic su/catlean/u5.g Lsu/catlean/u5;
// 1e: lload 2
// 1f: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 22: getstatic su/catlean/sk.VANILLA Lsu/catlean/sk;
// 25: iload 4
// 27: ifne 51
// 2a: if_acmpeq 62
// 2d: goto 3a
// 30: ldc2_w 8706504363255049239
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: getstatic su/catlean/u5.g Lsu/catlean/u5;
// 3d: lload 2
// 3e: invokespecial su/catlean/u5.j (J)Lsu/catlean/sk;
// 41: getstatic su/catlean/sk.NCP_2 Lsu/catlean/sk;
// 44: goto 51
// 47: ldc2_w 8706504363255049239
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: if_acmpeq 62
// 54: bipush 1
// 55: goto 63
// 58: ldc2_w 8706504363255049239
// 5b: lload 0
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: bipush 0
// 63: ireturn
}

static {
long var20 = a ^ 12423044634143L;
long var22 = var20 ^ 27716964908515L;
long var24 = var20 ^ 45350531101613L;
long var26 = var20 ^ 110433342113122L;
long var28 = var20 ^ 114638062012697L;
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
String var15 = "\u009d½ø~âmÓ'ÃmL\u0081¸\fV\u001dÖZ\u0000N¡Ø=ú£\"&4ÖD¥\u008c>í\n&\b\u0004â \u0018VI¡\u0089\u0014\u000f\u001eÁ¨>\u0003\u0002%§xæío\u0086h\u009bsC\u009e \u0082Ã\u008fpð\u0005ijT\u009cK\u0086H%\"\u0019õ\u001c$ò\u00952¥\u0094yÛÕ_®\u0001[w8o\u0012_l\b\u0099zä\u0099zsØ\u0004\u0011Gh\u000e8ø\u0014é$\u0003¥\u0017të\t\fµò~\u00ad\u0096yÐÙ\u008dj=`aG°/\u009b)\\KCý\u0002Rn\u0081¯\u0010Ë_w\u0099JD\u0003\u001afQ5\u00860ýQ< \u0088\u0088èÜûù\u0095\u0099\u0084Ê:\u001c«³S¢hlA\rZûQý+õ÷\u0006i$G@ roë¨ún\u007f\u0081Îv\u001e Ë\u009dð\u0004\u0002\u001e\u007fÕ\u0013óéS$v\u0006\u0080Ó!R²\u0010&´~\u0002¬\u009aéÒm\u0082\u008d\u0019ÁWì½\u0010fÄÐdª\u0002\u0004\u008bî7 ì{K\u009cá\u0010\"ï^\bû'\u0019£\u0005¯vª\b¯\u0088¤\u0010ì\u00140êÁV\u0011AÒ\u0091\u001bd\u009ctUÝ";
int var17 = "\u009d½ø~âmÓ'ÃmL\u0081¸\fV\u001dÖZ\u0000N¡Ø=ú£\"&4ÖD¥\u008c>í\n&\b\u0004â \u0018VI¡\u0089\u0014\u000f\u001eÁ¨>\u0003\u0002%§xæío\u0086h\u009bsC\u009e \u0082Ã\u008fpð\u0005ijT\u009cK\u0086H%\"\u0019õ\u001c$ò\u00952¥\u0094yÛÕ_®\u0001[w8o\u0012_l\b\u0099zä\u0099zsØ\u0004\u0011Gh\u000e8ø\u0014é$\u0003¥\u0017të\t\fµò~\u00ad\u0096yÐÙ\u008dj=`aG°/\u009b)\\KCý\u0002Rn\u0081¯\u0010Ë_w\u0099JD\u0003\u001afQ5\u00860ýQ< \u0088\u0088èÜûù\u0095\u0099\u0084Ê:\u001c«³S¢hlA\rZûQý+õ÷\u0006i$G@ roë¨ún\u007f\u0081Îv\u001e Ë\u009dð\u0004\u0002\u001e\u007fÕ\u0013óéS$v\u0006\u0080Ó!R²\u0010&´~\u0002¬\u009aéÒm\u0082\u008d\u0019ÁWì½\u0010fÄÐdª\u0002\u0004\u008bî7 ì{K\u009cá\u0010\"ï^\bû'\u0019£\u0005¯vª\b¯\u0088¤\u0010ì\u00140êÁV\u0011AÒ\u0091\u001bd\u009ctUÝ"
.length();
char var14 = '(';
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
e = new String[13];
k = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "5À½¡ë\u0006e\u0088(°:\u001e£õórªC=8\u0014~¸o,¢ÎDsYJ\u009f\u000e^:\u0084\u0018\u0097¦wÅßTM\\ÝM\u001a¿H\u000eò¹úAKÐ\u0086Â-\u0086 Þ\u0013\u000bò/h\u008ai\u0019¨";
int var5 = "5À½¡ë\u0006e\u0088(°:\u001e£õórªC=8\u0014~¸o,¢ÎDsYJ\u009f\u000e^:\u0084\u0018\u0097¦wÅßTM\\ÝM\u001a¿H\u000eò¹úAKÐ\u0086Â-\u0086 Þ\u0013\u000bò/h\u008ai\u0019¨"
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
h = var6;
i = new Integer[11];
KProperty[] var30 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u5.class, b<"m">(19765, 2108690247814584256L ^ var20), b<"m">(4694, 6149083566178814124L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u5.class, b<"m">(16129, 5986678236965561840L ^ var20), b<"m">(14972, 7939441578423443591L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u5.class, b<"m">(19555, 5322018344104171164L ^ var20), b<"m">(8134, 547045096954611006L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u5.class, b<"m">(1681, 6020743796213570669L ^ var20), b<"m">(16342, 5367313363603842351L ^ var20), 0)
)
};
d = var30;
g = new u5(var26);
c = yp.L(g, b<"m">(25261, 3837285105312610398L ^ var20), sk.NCP, null, null, c<"g">(21640, 7905249341730077690L ^ var20), null, var28);
I = yp.k(
g, b<"m">(20670, 4879526251870554691L ^ var20), 2.0F, var22, RangesKt.rangeTo(1.0F, 2.5F), null, u5::V, c<"g">(6910, 4457837569846080910L ^ var20), null
);
U = yp.t(g, b<"m">(30024, 3814613889328033720L ^ var20), true, var24, null, u5::I, 4, null);
j = yp.t(g, b<"m">(18366, 5611017227454979404L ^ var20), false, var24, null, null, c<"g">(4519, 9119991336814968534L ^ var20), null);
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "ªå\u001cÚ¦£ý\u000b\u008b\u0082BÃMÝW1";
var5 = "ªå\u001cÚ¦£ý\u000b\u008b\u0082BÃMÝW1".length();
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

var15 = "¤÷téo\u0092k\u0097{Óæ\u0015ñÖlÍ@\u0003tâoåúNJÁZïádö>\u0010µ®Fy¹vó§{ÿ@lEëT\u008b";
var17 = "¤÷téo\u0092k\u0097{Óæ\u0015ñÖlÍ@\u0003tâoåúNJÁZïádö>\u0010µ®Fy¹vó§{ÿ@lEëT\u008b".length();
var14 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28550;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u5", var10);
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
throw new RuntimeException("su/catlean/u5" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23048;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/u5", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/u5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
