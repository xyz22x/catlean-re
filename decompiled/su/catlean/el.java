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
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.api.event.events.player.UsingItemEvent;
import su.catlean.gofra.Flow;

public final class el extends _g {
@NotNull
public static final el C;
@NotNull
private static final c8 o;
@NotNull
private static final cq m;
@NotNull
private static final cq F;
@NotNull
private static final cq K;
@NotNull
private static final cq g;
@NotNull
private static final cq x;
@NotNull
private static final cq l;
private static boolean V;
private static int O;
private static final long a = yz.a(-6054961735656640193L, 4709577558979737275L, MethodHandles.lookup().lookupClass()).a(50406202715930L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

private el(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 7534316182341L;
super(b<"s">(24687, 2871346970098491349L ^ var1), jt.d(), null, 4, null, var3);
}

private final int M(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 124150998118352L;
return ((Number)o.E(this, var6, X[0])).intValue();
}

private final boolean l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 34755012513556L;
return (Boolean)m.E(this, var3, X[1]);
}

private final boolean r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 85744700850495L;
return (Boolean)F.E(this, var3, X[2]);
}

private final boolean a(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 6393945492468L;
return (Boolean)K.E(this, var5, X[3]);
}

private final boolean Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 20498823386500L;
return (Boolean)g.E(this, var3, X[4]);
}

private final boolean E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 74740587900438L;
return (Boolean)x.E(this, var3, X[5]);
}

private final boolean F(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 7921348228237L;
return (Boolean)l.E(this, var6, X[c<"f">(18668, 4128179978997462599L ^ var4)]);
}

@Flow(
priority = -10
)
private final void y(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/el.a J
// 003: ldc2_w 14293381730589
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 78829242879006
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 91961041736205
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 69638566872562
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 66887558968009
// 022: lxor
// 023: dup2
// 024: bipush 32
// 026: lushr
// 027: lstore 10
// 029: dup2
// 02a: bipush 32
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 12
// 033: pop2
// 034: dup2
// 035: ldc2_w 70335053496734
// 038: lxor
// 039: dup2
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: dup2
// 041: bipush 32
// 043: lshl
// 044: bipush 32
// 046: lushr
// 047: lstore 14
// 049: pop2
// 04a: dup2
// 04b: ldc2_w 343164592167
// 04e: lxor
// 04f: lstore 16
// 051: dup2
// 052: ldc2_w 45292367944084
// 055: lxor
// 056: lstore 18
// 058: pop2
// 059: ldc2_w 5419026853171997647
// 05c: lload 2
// 05d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: bipush 0
// 063: putstatic su/catlean/el.V Z
// 066: astore 20
// 068: lload 18
// 06a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06d: invokevirtual net/minecraft/class_746.method_7344 ()Lnet/minecraft/class_1702;
// 070: invokevirtual net/minecraft/class_1702.method_7586 ()I
// 073: aload 0
// 074: lload 10
// 076: iload 12
// 078: invokespecial su/catlean/el.M (JI)I
// 07b: aload 20
// 07d: ifnonnull 153
// 080: if_icmpgt 130
// 083: goto 090
// 086: ldc2_w 5472391385368285408
// 089: lload 2
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: aload 0
// 091: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 094: lload 16
// 096: invokespecial su/catlean/el.R (Lnet/minecraft/class_1268;J)Z
// 099: aload 20
// 09b: ifnonnull 0d1
// 09e: goto 0ab
// 0a1: ldc2_w 5472391385368285408
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: ifne 0fc
// 0ae: goto 0bb
// 0b1: ldc2_w 5472391385368285408
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 0bf: lload 16
// 0c1: invokespecial su/catlean/el.R (Lnet/minecraft/class_1268;J)Z
// 0c4: goto 0d1
// 0c7: ldc2_w 5472391385368285408
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 20
// 0d3: ifnonnull 0f9
// 0d6: ifne 0fc
// 0d9: goto 0e6
// 0dc: ldc2_w 5472391385368285408
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: aload 0
// 0e7: lload 8
// 0e9: invokespecial su/catlean/el.W (J)Z
// 0ec: goto 0f9
// 0ef: ldc2_w 5472391385368285408
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: goto 0fd
// 0fc: bipush 1
// 0fd: istore 21
// 0ff: aload 20
// 101: ifnonnull 12b
// 104: iload 21
// 106: ifeq 19a
// 109: goto 116
// 10c: ldc2_w 5472391385368285408
// 10f: lload 2
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: aload 0
// 117: iload 13
// 119: lload 14
// 11b: invokespecial su/catlean/el.s (IJ)V
// 11e: goto 12b
// 121: ldc2_w 5472391385368285408
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: aload 20
// 12d: ifnull 19a
// 130: getstatic su/catlean/el.O I
// 133: aload 20
// 135: ifnonnull 169
// 138: goto 145
// 13b: ldc2_w 5472391385368285408
// 13e: lload 2
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: bipush -1
// 146: goto 153
// 149: ldc2_w 5472391385368285408
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: if_icmpeq 19a
// 156: aload 0
// 157: lload 6
// 159: invokespecial su/catlean/el.l (J)Z
// 15c: goto 169
// 15f: ldc2_w 5472391385368285408
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 20
// 16b: ifnonnull 197
// 16e: ifeq 19a
// 171: goto 17e
// 174: ldc2_w 5472391385368285408
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 181: getstatic su/catlean/el.O I
// 184: lload 4
// 186: invokevirtual su/catlean/gg.f (IJ)V
// 189: bipush -1
// 18a: goto 197
// 18d: ldc2_w 5472391385368285408
// 190: lload 2
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: putstatic su/catlean/el.O I
// 19a: return
}

private final void s(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: lload 2
// 06: bipush 32
// 08: lshl
// 09: bipush 32
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/el.a J
// 10: lxor
// 11: lstore 4
// 13: lload 4
// 15: dup2
// 16: ldc2_w 6694344938342
// 19: lxor
// 1a: lstore 6
// 1c: dup2
// 1d: ldc2_w 42938385807967
// 20: lxor
// 21: lstore 8
// 23: dup2
// 24: ldc2_w 15890482398188
// 27: lxor
// 28: lstore 10
// 2a: pop2
// 2b: ldc2_w -3365201071313964617
// 2e: lload 4
// 30: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: astore 12
// 37: lload 10
// 39: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 3f: aload 12
// 41: ifnonnull 9b
// 44: ifne 9a
// 47: goto 55
// 4a: ldc2_w -3347879066039006568
// 4d: lload 4
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: aload 0
// 56: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 59: lload 8
// 5b: invokespecial su/catlean/el.R (Lnet/minecraft/class_1268;J)Z
// 5e: ifeq 80
// 61: goto 6f
// 64: ldc2_w -3347879066039006568
// 67: lload 4
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 72: goto 83
// 75: ldc2_w -3347879066039006568
// 78: lload 4
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 83: fconst_0
// 84: lload 6
// 86: fconst_0
// 87: sipush 3809
// 8a: ldc2_w 4849120619111258182
// 8d: lload 4
// 8f: lxor
// 90: invokedynamic f (IJ)I bsm=su/catlean/el.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: aconst_null
// 96: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 99: pop
// 9a: bipush 1
// 9b: putstatic su/catlean/el.V Z
// 9e: return
}

private final boolean W(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/el.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 120948513081593
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 32
// 015: lshl
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 4
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 41969608720946
// 021: lxor
// 022: lstore 5
// 024: dup2
// 025: ldc2_w 105960028836362
// 028: lxor
// 029: lstore 7
// 02b: dup2
// 02c: ldc2_w 119728200005504
// 02f: lxor
// 030: dup2
// 031: bipush 32
// 033: lushr
// 034: l2i
// 035: istore 9
// 037: dup2
// 038: bipush 32
// 03a: lshl
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 10
// 041: dup2
// 042: bipush 48
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 11
// 04b: pop2
// 04c: dup2
// 04d: ldc2_w 133543164843657
// 050: lxor
// 051: lstore 12
// 053: dup2
// 054: ldc2_w 44160178466075
// 057: lxor
// 058: lstore 14
// 05a: dup2
// 05b: ldc2_w 16346970883968
// 05e: lxor
// 05f: lstore 16
// 061: pop2
// 062: ldc2_w 6134016875584730587
// 065: lload 1
// 066: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: bipush 0
// 06c: istore 19
// 06e: astore 18
// 070: iload 19
// 072: sipush 1732
// 075: ldc2_w 8998314736469120012
// 078: lload 1
// 079: lxor
// 07a: invokedynamic f (IJ)I bsm=su/catlean/el.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: if_icmpge 28a
// 082: lload 16
// 084: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 087: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 08a: iload 19
// 08c: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 08f: dup
// 090: sipush 31303
// 093: ldc2_w 2388425880750496392
// 096: lload 1
// 097: lxor
// 098: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/el.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a0: astore 20
// 0a2: aload 18
// 0a4: lload 1
// 0a5: lconst_0
// 0a6: lcmp
// 0a7: iflt 287
// 0aa: ifnonnull 285
// 0ad: aload 20
// 0af: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 0b2: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 0b5: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 0ba: aload 18
// 0bc: ifnonnull 28b
// 0bf: goto 0cc
// 0c2: ldc2_w 6189618348073733876
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: ifeq 282
// 0cf: goto 0dc
// 0d2: ldc2_w 6189618348073733876
// 0d5: lload 1
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: aload 0
// 0dd: lload 5
// 0df: invokespecial su/catlean/el.r (J)Z
// 0e2: aload 18
// 0e4: lload 1
// 0e5: lconst_0
// 0e6: lcmp
// 0e7: iflt 158
// 0ea: ifnonnull 156
// 0ed: goto 0fa
// 0f0: ldc2_w 6189618348073733876
// 0f3: lload 1
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: ifne 14f
// 0fd: goto 10a
// 100: ldc2_w 6189618348073733876
// 103: lload 1
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: aload 20
// 10c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 10f: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
// 112: aload 18
// 114: ifnonnull 149
// 117: goto 124
// 11a: ldc2_w 6189618348073733876
// 11d: lload 1
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: if_acmpeq 282
// 127: goto 134
// 12a: ldc2_w 6189618348073733876
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 20
// 136: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 139: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
// 13c: goto 149
// 13f: ldc2_w 6189618348073733876
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: if_acmpne 14f
// 14c: goto 282
// 14f: aload 0
// 150: iload 3
// 151: iload 4
// 153: invokespecial su/catlean/el.a (II)Z
// 156: aload 18
// 158: lload 1
// 159: lconst_0
// 15a: lcmp
// 15b: iflt 19e
// 15e: ifnonnull 19c
// 161: ifne 189
// 164: goto 171
// 167: ldc2_w 6189618348073733876
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: aload 20
// 173: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 176: getstatic net/minecraft/class_1802.field_8233 Lnet/minecraft/class_1792;
// 179: if_acmpeq 282
// 17c: goto 189
// 17f: ldc2_w 6189618348073733876
// 182: lload 1
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: aload 0
// 18a: lload 12
// 18c: invokespecial su/catlean/el.Z (J)Z
// 18f: goto 19c
// 192: ldc2_w 6189618348073733876
// 195: lload 1
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 18
// 19e: lload 1
// 19f: lconst_0
// 1a0: lcmp
// 1a1: iflt 1e4
// 1a4: ifnonnull 1e2
// 1a7: ifne 1cf
// 1aa: goto 1b7
// 1ad: ldc2_w 6189618348073733876
// 1b0: lload 1
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 20
// 1b9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1bc: getstatic net/minecraft/class_1802.field_8511 Lnet/minecraft/class_1792;
// 1bf: if_acmpeq 282
// 1c2: goto 1cf
// 1c5: ldc2_w 6189618348073733876
// 1c8: lload 1
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: aload 0
// 1d0: lload 14
// 1d2: invokespecial su/catlean/el.E (J)Z
// 1d5: goto 1e2
// 1d8: ldc2_w 6189618348073733876
// 1db: lload 1
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: aload 18
// 1e4: lload 1
// 1e5: lconst_0
// 1e6: lcmp
// 1e7: iflt 230
// 1ea: ifnonnull 22e
// 1ed: ifne 215
// 1f0: goto 1fd
// 1f3: ldc2_w 6189618348073733876
// 1f6: lload 1
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: aload 20
// 1ff: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 202: getstatic net/minecraft/class_1802.field_8680 Lnet/minecraft/class_1792;
// 205: if_acmpeq 282
// 208: goto 215
// 20b: ldc2_w 6189618348073733876
// 20e: lload 1
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: aload 0
// 216: iload 9
// 218: iload 10
// 21a: i2s
// 21b: iload 11
// 21d: i2s
// 21e: invokespecial su/catlean/el.F (ISS)Z
// 221: goto 22e
// 224: ldc2_w 6189618348073733876
// 227: lload 1
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: aload 18
// 230: ifnonnull 281
// 233: ifne 25b
// 236: goto 243
// 239: ldc2_w 6189618348073733876
// 23c: lload 1
// 23d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 242: athrow
// 243: aload 20
// 245: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 248: getstatic net/minecraft/class_1802.field_8323 Lnet/minecraft/class_1792;
// 24b: if_acmpeq 282
// 24e: goto 25b
// 251: ldc2_w 6189618348073733876
// 254: lload 1
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: lload 16
// 25d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 260: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 263: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 266: putstatic su/catlean/el.O I
// 269: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 26c: iload 19
// 26e: lload 7
// 270: invokevirtual su/catlean/gg.f (IJ)V
// 273: bipush 1
// 274: goto 281
// 277: ldc2_w 6189618348073733876
// 27a: lload 1
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: ireturn
// 282: iinc 19 1
// 285: aload 18
// 287: ifnull 070
// 28a: bipush 0
// 28b: ireturn
}

private final boolean R(class_1268 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/el.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 89174746475820
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 27701861689319
// 022: lxor
// 023: lstore 6
// 025: dup2
// 026: ldc2_w 92352482513493
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 8
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 9
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 10
// 045: pop2
// 046: dup2
// 047: ldc2_w 77442166928220
// 04a: lxor
// 04b: lstore 11
// 04d: dup2
// 04e: ldc2_w 25511300335822
// 051: lxor
// 052: lstore 13
// 054: dup2
// 055: ldc2_w 54718073807445
// 058: lxor
// 059: lstore 15
// 05b: pop2
// 05c: ldc2_w -1083862539508117490
// 05f: lload 2
// 060: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: astore 17
// 067: aload 1
// 068: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 06b: if_acmpne 083
// 06e: lload 15
// 070: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 073: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 076: goto 08b
// 079: ldc2_w -1139184146534208735
// 07c: lload 2
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: lload 15
// 085: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 088: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 08b: astore 19
// 08d: aload 19
// 08f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 092: aload 19
// 094: astore 18
// 096: aload 18
// 098: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 09b: dup
// 09c: sipush 19415
// 09f: ldc2_w 4182441610151005894
// 0a2: lload 2
// 0a3: lxor
// 0a4: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/el.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ac: astore 19
// 0ae: aload 18
// 0b0: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 0b3: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 0b6: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 0bb: aload 17
// 0bd: lload 2
// 0be: lconst_0
// 0bf: lcmp
// 0c0: iflt 0eb
// 0c3: ifnonnull 0e9
// 0c6: ifeq 265
// 0c9: goto 0d6
// 0cc: ldc2_w -1139184146534208735
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: aload 0
// 0d7: lload 6
// 0d9: invokespecial su/catlean/el.r (J)Z
// 0dc: goto 0e9
// 0df: ldc2_w -1139184146534208735
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 17
// 0eb: lload 2
// 0ec: lconst_0
// 0ed: lcmp
// 0ee: iflt 15d
// 0f1: ifnonnull 15b
// 0f4: ifne 146
// 0f7: goto 104
// 0fa: ldc2_w -1139184146534208735
// 0fd: lload 2
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 19
// 106: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
// 109: lload 2
// 10a: lconst_0
// 10b: lcmp
// 10c: ifle 143
// 10f: aload 17
// 111: ifnonnull 143
// 114: goto 121
// 117: ldc2_w -1139184146534208735
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: if_acmpeq 265
// 124: goto 131
// 127: ldc2_w -1139184146534208735
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: aload 19
// 133: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
// 136: goto 143
// 139: ldc2_w -1139184146534208735
// 13c: lload 2
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: if_acmpeq 265
// 146: aload 0
// 147: iload 4
// 149: iload 5
// 14b: invokespecial su/catlean/el.a (II)Z
// 14e: goto 15b
// 151: ldc2_w -1139184146534208735
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: aload 17
// 15d: lload 2
// 15e: lconst_0
// 15f: lcmp
// 160: iflt 1a0
// 163: ifnonnull 19e
// 166: ifne 18b
// 169: goto 176
// 16c: ldc2_w -1139184146534208735
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 19
// 178: getstatic net/minecraft/class_1802.field_8233 Lnet/minecraft/class_1792;
// 17b: if_acmpeq 265
// 17e: goto 18b
// 181: ldc2_w -1139184146534208735
// 184: lload 2
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: aload 0
// 18c: lload 11
// 18e: invokespecial su/catlean/el.Z (J)Z
// 191: goto 19e
// 194: ldc2_w -1139184146534208735
// 197: lload 2
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: aload 17
// 1a0: lload 2
// 1a1: lconst_0
// 1a2: lcmp
// 1a3: iflt 1e3
// 1a6: ifnonnull 1e1
// 1a9: ifne 1ce
// 1ac: goto 1b9
// 1af: ldc2_w -1139184146534208735
// 1b2: lload 2
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: aload 19
// 1bb: getstatic net/minecraft/class_1802.field_8511 Lnet/minecraft/class_1792;
// 1be: if_acmpeq 265
// 1c1: goto 1ce
// 1c4: ldc2_w -1139184146534208735
// 1c7: lload 2
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: aload 0
// 1cf: lload 13
// 1d1: invokespecial su/catlean/el.E (J)Z
// 1d4: goto 1e1
// 1d7: ldc2_w -1139184146534208735
// 1da: lload 2
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: aload 17
// 1e3: lload 2
// 1e4: lconst_0
// 1e5: lcmp
// 1e6: iflt 22c
// 1e9: ifnonnull 22a
// 1ec: ifne 211
// 1ef: goto 1fc
// 1f2: ldc2_w -1139184146534208735
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: aload 19
// 1fe: getstatic net/minecraft/class_1802.field_8680 Lnet/minecraft/class_1792;
// 201: if_acmpeq 265
// 204: goto 211
// 207: ldc2_w -1139184146534208735
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: aload 0
// 212: iload 8
// 214: iload 9
// 216: i2s
// 217: iload 10
// 219: i2s
// 21a: invokespecial su/catlean/el.F (ISS)Z
// 21d: goto 22a
// 220: ldc2_w -1139184146534208735
// 223: lload 2
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: aload 17
// 22c: ifnonnull 262
// 22f: ifne 254
// 232: goto 23f
// 235: ldc2_w -1139184146534208735
// 238: lload 2
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: aload 19
// 241: getstatic net/minecraft/class_1802.field_8323 Lnet/minecraft/class_1792;
// 244: if_acmpeq 265
// 247: goto 254
// 24a: ldc2_w -1139184146534208735
// 24d: lload 2
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: bipush 1
// 255: goto 262
// 258: ldc2_w -1139184146534208735
// 25b: lload 2
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: goto 266
// 265: bipush 0
// 266: ireturn
}

@Flow
private final void Z(UsingItemEvent var1) {
long var2 = a ^ 117089520944362L;

try {
if (V) {
var1.cancel();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 2163610706823709975L, var2);
}
}

@Flow
private final void z(StopUsingItemEvent var1) {
long var2 = a ^ 95483354595618L;

try {
if (V) {
var1.cancel();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 6615379727774826719L, var2);
}
}

static {
long var20 = a ^ 31147944461090L;
long var22 = var20 ^ 19445410108272L;
long var24 = var20 ^ 68207636094486L;
long var26 = var20 ^ 65676478204094L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[24];
int var16 = 0;
String var15 = "y8\u0086?é\u0012_\u0001Ã¸G¦\u0082\u0017HU\u0018Ô·\t<eÆ;¯\u0092£rÅ\u0003ìZ\u001e\u0013Ë!òÙ(=¯  d;Ù\u008aìPn\u0083\u008bÎõ\u0088`\u0015&Ó\u009a;(µ;\u0084ëHY\u007fó·v\u0083\u000f óö¢îñÖ\u0085Û\u0090ï\u0082\u008exÔLWÉZ!é¿ë\u0014\u0084as\u0019Î\u001d\u001a\\\u008e \u008a\u008b^G¹ób\u001e¨A°wa5¤µ\u000eÓ\u0080ã¶>Wº\u0001\u0094\u00ad\\\u008d<PÂ\u00102h2hä\u008eå\u008d\u0091-\u0094ÍïL:\u0017\u0010¬\u007fö¨\u001a\u0093\u0097cû\u001dRXÀ§'®\u0018(6d}¸ëè@\u0005²\u008a¬l\u009d\u001e5\u009cSé'ÚTç4(±uÜùEk\u0006©\u009bHD¦!\u0080£Âß~\u0088õÍ\nªy\u0015®=t6\u007f\u0089\u001fÅ(%Ü;\u000b0} äâ£æ*\\X}\u0016\u009bÙnQóq¼×Ó8ïP\t/Å\u0016lßås\u008cp\u0094\u0018(C\u0080Ää\u0002\u0083L\u0083Z\u00179Ä\u0081\u009bAM\u0014Ôñ)\u0094ÿY\u0018f]3\n\u0081\u0083\b-\u001cxß9\u0005xÜSÒ^jç\"\u00010\u0014 È\u0015\u0096\u009f¯)ã\u001b\"\u008b\u008dØKFÇÆåª{WV\u008c\u0085á¾\u0017\u0086ËO¸\u0016,\u0018ÑkólÔZ×\u0099H\u009dsõ|@Fþ¶I \u009a¸|ñ¶\u0010\u0017>Ù¶\u000f\u0089â¦\u0084Åb@\\\u008d,/ !\u0089£Nªº\u0097¢\u0097@hÚ\u0083v<è\u00adáR\t\f=ÒsÈFñÚb\u0002\u0019\u0016 *0\u0089À\\\u0081¨»4´28qÂ\u0019\u000eªßU·v\u0085ò\u009c+o¾b\u0000\u0095¦n\u0010òí4àìeÛ!3\u0018¦ïF'ËO\u0010D6Á\u008a\\=s\u0007$ÏÑç´Q\u0017; P\u0095\bE¬Öy9f¯\u0003}Ô\u0095,Ê\u0081|Í\u0084Â¡5[i`.\u001e4<\u001e\u00ad ÷ú(\u0094·\u001ea\u009a³öAÉÔ¬\u0098åµá\u000eÕö\u0091Vt}¡\\¸FÕ\u0013à \u001c\u0088 Ý\u0094ä\u0097\u0002=\u009eW´ußQÒ{`Hä\u0095Ö\u0089¾í \u0089\u008f¹\u007f\u0018i";
int var17 = "y8\u0086?é\u0012_\u0001Ã¸G¦\u0082\u0017HU\u0018Ô·\t<eÆ;¯\u0092£rÅ\u0003ìZ\u001e\u0013Ë!òÙ(=¯  d;Ù\u008aìPn\u0083\u008bÎõ\u0088`\u0015&Ó\u009a;(µ;\u0084ëHY\u007fó·v\u0083\u000f óö¢îñÖ\u0085Û\u0090ï\u0082\u008exÔLWÉZ!é¿ë\u0014\u0084as\u0019Î\u001d\u001a\\\u008e \u008a\u008b^G¹ób\u001e¨A°wa5¤µ\u000eÓ\u0080ã¶>Wº\u0001\u0094\u00ad\\\u008d<PÂ\u00102h2hä\u008eå\u008d\u0091-\u0094ÍïL:\u0017\u0010¬\u007fö¨\u001a\u0093\u0097cû\u001dRXÀ§'®\u0018(6d}¸ëè@\u0005²\u008a¬l\u009d\u001e5\u009cSé'ÚTç4(±uÜùEk\u0006©\u009bHD¦!\u0080£Âß~\u0088õÍ\nªy\u0015®=t6\u007f\u0089\u001fÅ(%Ü;\u000b0} äâ£æ*\\X}\u0016\u009bÙnQóq¼×Ó8ïP\t/Å\u0016lßås\u008cp\u0094\u0018(C\u0080Ää\u0002\u0083L\u0083Z\u00179Ä\u0081\u009bAM\u0014Ôñ)\u0094ÿY\u0018f]3\n\u0081\u0083\b-\u001cxß9\u0005xÜSÒ^jç\"\u00010\u0014 È\u0015\u0096\u009f¯)ã\u001b\"\u008b\u008dØKFÇÆåª{WV\u008c\u0085á¾\u0017\u0086ËO¸\u0016,\u0018ÑkólÔZ×\u0099H\u009dsõ|@Fþ¶I \u009a¸|ñ¶\u0010\u0017>Ù¶\u000f\u0089â¦\u0084Åb@\\\u008d,/ !\u0089£Nªº\u0097¢\u0097@hÚ\u0083v<è\u00adáR\t\f=ÒsÈFñÚb\u0002\u0019\u0016 *0\u0089À\\\u0081¨»4´28qÂ\u0019\u000eªßU·v\u0085ò\u009c+o¾b\u0000\u0095¦n\u0010òí4àìeÛ!3\u0018¦ïF'ËO\u0010D6Á\u008a\\=s\u0007$ÏÑç´Q\u0017; P\u0095\bE¬Öy9f¯\u0003}Ô\u0095,Ê\u0081|Í\u0084Â¡5[i`.\u001e4<\u001e\u00ad ÷ú(\u0094·\u001ea\u009a³öAÉÔ¬\u0098åµá\u000eÕö\u0091Vt}¡\\¸FÕ\u0013à \u001c\u0088 Ý\u0094ä\u0097\u0002=\u009eW´ußQÒ{`Hä\u0095Ö\u0089¾í \u0089\u008f¹\u007f\u0018i"
.length();
char var14 = 16;
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
b = var18;
c = new String[24];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "â\u000e¯r->I\u0089Öô\t\u0095³(\fÛ\u0090\f\u0090/\u0099-Îmvç\\ÝÀd\u001d<YV×\u0098ZàÖÿDÌ>{\u0099\u0015T>oÔ^\u000emñíD";
int var5 = "â\u000e¯r->I\u0089Öô\t\u0095³(\fÛ\u0090\f\u0090/\u0099-Îmvç\\ÝÀd\u001d<YV×\u0098ZàÖÿDÌ>{\u0099\u0015T>oÔ^\u000emñíD".length();
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
e = var6;
f = new Integer[9];
KProperty[] var28 = new KProperty[c<"f">(20932, 5119222149124706083L ^ var20)];
var28[0] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(15064, 5463949147593430576L ^ var20), b<"s">(22230, 7531395008880032297L ^ var20), 0)
);
var28[1] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(13490, 5055483202379765833L ^ var20), b<"s">(26378, 1155030495495425014L ^ var20), 0)
);
var28[2] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(14118, 4882962262440991691L ^ var20), b<"s">(9084, 9129840590411943809L ^ var20), 0)
);
var28[3] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(28358, 2969879245966770720L ^ var20), b<"s">(7709, 1987173973937386234L ^ var20), 0)
);
var28[4] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(10309, 4623009851239646380L ^ var20), b<"s">(3095, 3559967447566049513L ^ var20), 0)
);
var28[5] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(13991, 8980913215801809476L ^ var20), b<"s">(29972, 2421700475747179007L ^ var20), 0)
);
var28[c<"f">(18668, 4128251422640789002L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(el.class, b<"s">(7781, 6210307634729382532L ^ var20), b<"s">(13983, 921706006026443391L ^ var20), 0)
);
X = var28;
C = new el(var26);
o = yp.L(
C,
b<"s">(27477, 3009089627580532655L ^ var20),
c<"f">(21057, 2012898679388785838L ^ var20),
new IntRange(0, c<"f">(28458, 9040014078820676043L ^ var20)),
var22,
null,
null,
c<"f">(27616, 3996002599965652228L ^ var20),
null
);
m = yp.t(C, b<"s">(6541, 1077097837991064929L ^ var20), true, var24, null, null, c<"f">(25413, 1236896807944289696L ^ var20), null);
F = yp.t(C, b<"s">(20040, 1291975266806637233L ^ var20), true, var24, null, null, c<"f">(6171, 7242757416356316921L ^ var20), null);
K = yp.t(C, b<"s">(21637, 6059280054636329067L ^ var20), false, var24, null, null, c<"f">(6171, 7242757416356316921L ^ var20), null);
g = yp.t(C, b<"s">(31057, 2487041652154701225L ^ var20), false, var24, null, null, c<"f">(6171, 7242757416356316921L ^ var20), null);
x = yp.t(C, b<"s">(12858, 1583913012437475039L ^ var20), false, var24, null, null, c<"f">(6171, 7242757416356316921L ^ var20), null);
l = yp.t(C, b<"s">(24795, 6167836727920561201L ^ var20), false, var24, null, null, c<"f">(6171, 7242757416356316921L ^ var20), null);
O = -1;
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u001bÌ\u0086ÓÜc+\u00178\u0097:\u000fD)OÈ";
var5 = "\u001bÌ\u0086ÓÜc+\u00178\u0097:\u000fD)OÈ".length();
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

var15 = "\u008a:wõW#«\u009c¤À\u0082V\u0099\"U\u0082aÆlé\u000b]\u0092A+Ñ²nÐ×è\u0084\u0090\u0091\u0005îpvâm\u0018ï\u0018A8Q\u0010\u0092ßl¾\u0006ËE§ø\u0083Ê s·\u009f¢ûÕ";
var17 = "\u008a:wõW#«\u009c¤À\u0082V\u0099\"U\u0082aÆlé\u000b]\u0092A+Ñ²nÐ×è\u0084\u0090\u0091\u0005îpvâm\u0018ï\u0018A8Q\u0010\u0092ßl¾\u0006ËE§ø\u0083Ê s·\u009f¢ûÕ"
.length();
var14 = '(';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13356;
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
throw new RuntimeException("su/catlean/el", var10);
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
throw new RuntimeException("su/catlean/el" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17955;
if (f[var3] == null) {
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
throw new RuntimeException("su/catlean/el", var14);
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
throw new RuntimeException("su/catlean/el" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
