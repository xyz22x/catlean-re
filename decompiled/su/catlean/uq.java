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
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.CobWebEvent;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class uq extends _g {
@NotNull
public static final uq h;
static final KProperty[] g;
@NotNull
private static final cw N;
@NotNull
private static final ct o;
@NotNull
private static final ct l;
@NotNull
private static final cq C;
private static final long a = yz.a(-9006128379553538578L, 1633475887594468085L, MethodHandles.lookup().lookupClass()).a(11812280350722L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map i;

private uq(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 1298778099015L;
super(b<"j">(23148, 154943849672545730L ^ var1), jt.V(), null, 4, null, var3);
}

private final xm F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 102022198304070L;
return (xm)N.E(this, var3, g[0]);
}

private final void q(xm var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 96693812840929L;
N.b(this, var4, g[0], var1);
}

private final float e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 6587990345132L;
return ((Number)o.E(this, var3, g[1])).floatValue();
}

private final void e(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 59941245936311L;
o.b(this, var4, g[1], var1);
}

private final float Q(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 126912030009754L;
return ((Number)l.E(this, var6, g[2])).floatValue();
}

private final void c(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 109058975752303L;
l.b(this, var4, g[2], var1);
}

private final boolean n(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 5000223535844L;
return (Boolean)C.E(this, var6, g[3]);
}

private final void U(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 101014127743510L;
C.b(this, var4, g[3], var3);
}

@Flow
public final void Q(@Nullable PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uq.a J
// 003: ldc2_w 102035305316921
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 72536335151216
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 86088545992664
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 56
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
// 032: ldc2_w 71217673835387
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 28525798493073
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 122463722825639
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 13
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 14
// 055: dup2
// 056: bipush 32
// 058: lshl
// 059: bipush 32
// 05b: lushr
// 05c: l2i
// 05d: istore 15
// 05f: pop2
// 060: dup2
// 061: ldc2_w 27623416552128
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 107052727500374
// 06b: lxor
// 06c: lstore 18
// 06e: pop2
// 06f: ldc2_w -6039428001993562419
// 072: lload 2
// 073: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: astore 20
// 07a: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 07d: lload 18
// 07f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 082: checkcast net/minecraft/class_1657
// 085: iload 6
// 087: iload 7
// 089: i2b
// 08a: iload 8
// 08c: invokevirtual su/catlean/bi.j (Lnet/minecraft/class_1657;IBI)Z
// 08f: ifeq 1cd
// 092: aload 0
// 093: lload 9
// 095: invokespecial su/catlean/uq.F (J)Lsu/catlean/xm;
// 098: getstatic su/catlean/xm.TIMER Lsu/catlean/xm;
// 09b: aload 20
// 09d: ifnonnull 0fe
// 0a0: goto 0ad
// 0a3: ldc2_w -6041925857386314683
// 0a6: lload 2
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: if_acmpne 0f5
// 0b0: goto 0bd
// 0b3: ldc2_w -6041925857386314683
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: lload 4
// 0bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0c5: dup
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0c9: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0cc: ifne 0f5
// 0cf: goto 0dc
// 0d2: ldc2_w -6041925857386314683
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 0df: aload 0
// 0e0: lload 11
// 0e2: invokespecial su/catlean/uq.e (J)F
// 0e5: invokevirtual su/catlean/tq.x (F)V
// 0e8: goto 0f5
// 0eb: ldc2_w -6041925857386314683
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: aload 0
// 0f6: lload 9
// 0f8: invokespecial su/catlean/uq.F (J)Lsu/catlean/xm;
// 0fb: getstatic su/catlean/xm.FLY Lsu/catlean/xm;
// 0fe: if_acmpne 1cd
// 101: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 104: aload 0
// 105: iload 13
// 107: i2c
// 108: iload 14
// 10a: i2c
// 10b: iload 15
// 10d: invokespecial su/catlean/uq.Q (CCI)F
// 110: bipush 0
// 111: fconst_0
// 112: lload 16
// 114: fconst_0
// 115: fconst_0
// 116: sipush 2591
// 119: ldc2_w 6583002380001538707
// 11c: lload 2
// 11d: lxor
// 11e: invokedynamic u (IJ)I bsm=su/catlean/uq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: aconst_null
// 124: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 127: astore 21
// 129: lload 18
// 12b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12e: aload 21
// 130: bipush 0
// 131: daload
// 132: dconst_0
// 133: aload 21
// 135: bipush 1
// 136: daload
// 137: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 13a: lload 4
// 13c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 13f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 142: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 145: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 148: aload 20
// 14a: ifnonnull 19a
// 14d: ifeq 18c
// 150: goto 15d
// 153: ldc2_w -6041925857386314683
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: lload 18
// 15f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 162: lload 18
// 164: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 167: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 16a: dconst_0
// 16b: aload 0
// 16c: iload 13
// 16e: i2c
// 16f: iload 14
// 171: i2c
// 172: iload 15
// 174: invokespecial su/catlean/uq.Q (CCI)F
// 177: f2d
// 178: dconst_0
// 179: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 17c: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 17f: goto 18c
// 182: ldc2_w -6041925857386314683
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: lload 4
// 18e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 191: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 194: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 197: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 19a: ifeq 1cd
// 19d: lload 18
// 19f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a2: lload 18
// 1a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a7: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1aa: dconst_0
// 1ab: aload 0
// 1ac: iload 13
// 1ae: i2c
// 1af: iload 14
// 1b1: i2c
// 1b2: iload 15
// 1b4: invokespecial su/catlean/uq.Q (CCI)F
// 1b7: f2d
// 1b8: dneg
// 1b9: dconst_0
// 1ba: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1bd: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 1c0: goto 1cd
// 1c3: ldc2_w -6041925857386314683
// 1c6: lload 2
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: return
}

@Flow
public final void n(@NotNull CollisionEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uq.a J
// 03: ldc2_w 130461377181904
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 117296396593554
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 6252841612880878628
// 14: lload 2
// 15: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: aload 1
// 1b: ldc "e"
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: astore 6
// 22: aload 1
// 23: invokevirtual su/catlean/api/event/events/player/CollisionEvent.getState ()Lnet/minecraft/class_2680;
// 26: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 29: instanceof net/minecraft/class_2560
// 2c: ifeq 70
// 2f: aload 0
// 30: lload 4
// 32: invokespecial su/catlean/uq.F (J)Lsu/catlean/xm;
// 35: getstatic su/catlean/xm.SOLID Lsu/catlean/xm;
// 38: if_acmpne 70
// 3b: goto 48
// 3e: ldc2_w 6255480203633901228
// 41: lload 2
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 1
// 49: getstatic net/minecraft/class_2246.field_10566 Lnet/minecraft/class_2248;
// 4c: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 4f: dup
// 50: sipush 2908
// 53: ldc2_w 5760706444945739446
// 56: lload 2
// 57: lxor
// 58: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/uq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 60: invokevirtual su/catlean/api/event/events/player/CollisionEvent.setState (Lnet/minecraft/class_2680;)V
// 63: goto 70
// 66: ldc2_w 6255480203633901228
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: aload 6
// 72: ifnull 8f
// 75: bipush 1
// 76: anewarray 613
// 79: ldc2_w 6266688799561178314
// 7c: lload 2
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: goto 8f
// 85: ldc2_w 6255480203633901228
// 88: lload 2
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: return
}

@Flow
public final void X(@NotNull CobWebEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uq.a J
// 03: ldc2_w 79106363416008
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 101134546406538
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 4118485213992
// 14: lxor
// 15: dup2
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 16
// 1f: lshl
// 20: bipush 16
// 22: lushr
// 23: lstore 7
// 25: pop2
// 26: dup2
// 27: ldc2_w 48936201444852
// 2a: lxor
// 2b: lstore 9
// 2d: pop2
// 2e: ldc2_w -5485737270341240516
// 31: lload 2
// 32: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: aload 1
// 38: ldc "e"
// 3a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3d: astore 11
// 3f: aload 0
// 40: aload 11
// 42: ifnonnull 82
// 45: lload 4
// 47: invokespecial su/catlean/uq.F (J)Lsu/catlean/xm;
// 4a: getstatic su/catlean/xm.IGNORE Lsu/catlean/xm;
// 4d: if_acmpne a7
// 50: goto 5d
// 53: ldc2_w -5487672089866544204
// 56: lload 2
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 1
// 5e: aload 11
// 60: ifnonnull 9b
// 63: goto 70
// 66: ldc2_w -5487672089866544204
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: bipush 1
// 71: invokevirtual su/catlean/api/event/events/player/CobWebEvent.setCancelled (Z)V
// 74: aload 0
// 75: goto 82
// 78: ldc2_w -5487672089866544204
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: iload 6
// 84: i2c
// 85: lload 7
// 87: invokespecial su/catlean/uq.n (CJ)Z
// 8a: ifeq a7
// 8d: aload 1
// 8e: goto 9b
// 91: ldc2_w -5487672089866544204
// 94: lload 2
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: invokedynamic predict (Lsu/catlean/api/event/events/player/CobWebEvent;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/uq.Q (Lsu/catlean/api/event/events/player/CobWebEvent;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// a0: lload 9
// a2: dup2_x1
// a3: pop2
// a4: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// a7: ldc2_w -5505131935111402232
// aa: lload 2
// ab: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b0: ifnull cc
// b3: bipush 1
// b4: newarray 10
// b6: ldc2_w -5605437127071265981
// b9: lload 2
// ba: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bf: goto cc
// c2: ldc2_w -5487672089866544204
// c5: lload 2
// c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cb: athrow
// cc: return
}

private static final boolean W() {
long var0 = a ^ 24851368761691L;
long var2 = var0 ^ 11628406343705L;

try {
if (h.F(var2) == xm.TIMER) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -5240907766383714521L, var0);
}

return false;
}

private static final boolean I() {
long var0 = a ^ 54578845475489L;
long var2 = var0 ^ 50212373804003L;

try {
if (h.F(var2) == xm.FLY) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 918357324197749981L, var0);
}

return false;
}

private static final boolean l() {
long var0 = a ^ 86485989361276L;
long var2 = var0 ^ 90854876960574L;

try {
if (h.F(var2) == xm.IGNORE) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -1701280844981633024L, var0);
}

return false;
}

private static final class_2596 Q(CobWebEvent var0, int var1) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.getPos(), class_2350.field_11036, var1));
}

static {
long var20 = a ^ 26087595751378L;
long var22 = var20 ^ 61172915497548L;
long var24 = var20 ^ 32650075672654L;
long var26 = var20 ^ 50278325460480L;
long var28 = var20 ^ 119605897438388L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[14];
int var16 = 0;
String var15 = "Qì\u001f&·¬\u0095Å\u0001°\u009e®·2\u001b\u001f,v\u0016¦pbë\u0080u:&Ø\u0098\t³\u0097\u0010\u001eI÷me\u000e\u0098i¼()]\u0084áÖh\u0018;ÉÝìL\u000b\fKªn\"\u0093Úã_#¶1\u0084¬²v©¯\u0010\u001aÃu\u0088¢ÝRÇ\u009f\u0003óC\u0086)\u009c\u008e\u0010¢Q§u²jÜ\u0097\u0007&q¼\u0099± è\u0010,\u0089ú__mþ£\u008a\u008c\n÷%7W÷\u0010J¤Á¿#\u0016\t¡§Zp ×7'è\u0010\tv\u0012æÿ\u0088j^AÿÍÔöG©¸\u0010!¥]Ð·c\u0082q2Û\u0005\r6\b\u0005T\u0010 ÃâÛ\u0097ò4\u0094#½G\u008b\u0010\u0098\u0087ó0\"4\u008d\u0013ûæéM þÎ\u0097\u0090\b\u0086ÚFÔDÝ\u00adÎ©E\u009b\u0014°Hq\u001fÍZã\u009e\u0015¥\u00adâ\u0081à\u0003f\u001a\u0082!6M/\u00186ì½~²Ð\u0087í\\HÉ\rþ7Óà·¬ÍÜãi\u001cx";
int var17 = "Qì\u001f&·¬\u0095Å\u0001°\u009e®·2\u001b\u001f,v\u0016¦pbë\u0080u:&Ø\u0098\t³\u0097\u0010\u001eI÷me\u000e\u0098i¼()]\u0084áÖh\u0018;ÉÝìL\u000b\fKªn\"\u0093Úã_#¶1\u0084¬²v©¯\u0010\u001aÃu\u0088¢ÝRÇ\u009f\u0003óC\u0086)\u009c\u008e\u0010¢Q§u²jÜ\u0097\u0007&q¼\u0099± è\u0010,\u0089ú__mþ£\u008a\u008c\n÷%7W÷\u0010J¤Á¿#\u0016\t¡§Zp ×7'è\u0010\tv\u0012æÿ\u0088j^AÿÍÔöG©¸\u0010!¥]Ð·c\u0082q2Û\u0005\r6\b\u0005T\u0010 ÃâÛ\u0097ò4\u0094#½G\u008b\u0010\u0098\u0087ó0\"4\u008d\u0013ûæéM þÎ\u0097\u0090\b\u0086ÚFÔDÝ\u00adÎ©E\u009b\u0014°Hq\u001fÍZã\u009e\u0015¥\u00adâ\u0081à\u0003f\u001a\u0082!6M/\u00186ì½~²Ð\u0087í\\HÉ\rþ7Óà·¬ÍÜãi\u001cx"
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
c = new String[14];
i = new HashMap(13);
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
String var4 = "b\n\u001dÂ\u0099í}FÙÌà<p¦\u0096õ";
int var5 = "b\n\u001dÂ\u0099í}FÙÌà<p¦\u0096õ".length();
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
e = var6;
f = new Integer[4];
KProperty[] var30 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uq.class, b<"j">(16936, 2104365452153718991L ^ var20), b<"j">(29715, 7402615674147749628L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uq.class, b<"j">(24850, 7466021198699572217L ^ var20), b<"j">(13112, 5295426940140911062L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uq.class, b<"j">(19385, 42729282423685471L ^ var20), b<"j">(22595, 7418649137773351594L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uq.class, b<"j">(1013, 8476443003920632081L ^ var20), b<"j">(17598, 6195212048101707358L ^ var20), 0)
)
};
g = var30;
h = new uq(var22);
N = yp.L(h, b<"j">(13119, 3296875879141931477L ^ var20), xm.SOLID, null, null, c<"u">(17075, 2818324942566281173L ^ var20), null, var28);
o = yp.k(
h, b<"j">(15821, 1692759530924504876L ^ var20), 20.0F, var24, RangesKt.rangeTo(1.0F, 50.0F), null, uq::W, c<"u">(7480, 7763335726296895580L ^ var20), null
);
l = yp.k(
h, b<"j">(22539, 2873713679325598440L ^ var20), 0.3F, var24, RangesKt.rangeTo(0.0F, 10.0F), null, uq::I, c<"u">(12561, 1377283377447484532L ^ var20), null
);
C = yp.t(h, b<"j">(6447, 333735059459232714L ^ var20), false, var26, null, uq::l, 4, null);
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "<ì\u0084\u0003â¿\b;,Ð\u007fr\u0095~Õ\u001f";
var5 = "<ì\u0084\u0003â¿\b;,Ð\u007fr\u0095~Õ\u001f".length();
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

var15 = "Y½õéC\u00ad>\u0089Ù±\r&\u0082ë49¶@Áì<\u0086]7\u0093ä\u0087÷\u0012ÀÁ/0,oâÇ¥\u0094{é°\u0081\u008d  ñ\byêg\u000bfÜ\u0005:QÖ£ßø\u009a!\u0002\u0012\u008d°\u0084Ém\u0019·s«!h$\u001a\u0096í2";
var17 = "Y½õéC\u00ad>\u0089Ù±\r&\u0082ë49¶@Áì<\u0086]7\u0093ä\u0087÷\u0012ÀÁ/0,oâÇ¥\u0094{é°\u0081\u008d  ñ\byêg\u000bfÜ\u0005:QÖ£ßø\u009a!\u0002\u0012\u008d°\u0084Ém\u0019·s«!h$\u001a\u0096í2"
.length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4656;
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
throw new RuntimeException("su/catlean/uq", var10);
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
throw new RuntimeException("su/catlean/uq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21943;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/uq", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/uq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
