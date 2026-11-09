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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class u8 extends _g {
@NotNull
public static final u8 d;
static final KProperty[] W;
@NotNull
private static final cw w;
@NotNull
private static final ct F;
@NotNull
private static final ct Y;
@NotNull
private static final cq k;
@Nullable
private static class_243 g;
private static final long a = yz.a(-7922677117316658856L, 5254213832544096717L, MethodHandles.lookup().lookupClass()).a(118308594946723L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

private u8(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 39626938997515L;
super(b<"u">(4750, 27617947421014921L ^ var1), jt.V(), null, 4, null, var3);
}

private final be L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 131989444268286L;
return (be)w.E(this, var3, W[0]);
}

private final float E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 28567959182663L;
return ((Number)F.E(this, var3, W[1])).floatValue();
}

private final float w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 38409337956598L;
return ((Number)Y.E(this, var3, W[2])).floatValue();
}

private final boolean r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 68799657715187L;
return (Boolean)k.E(this, var3, W[3]);
}

@Flow
private final void q(PreSyncEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u8.a J
// 003: ldc2_w 57284164271573
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 124301245837029
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 14096407093551
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 99662335557384
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 119993931525270
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 94798020548903
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 90135864005766
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 81688525689890
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 46085503009877
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 89784851390659
// 045: lxor
// 046: lstore 20
// 048: pop2
// 049: ldc2_w -5618860151998551175
// 04c: lload 2
// 04d: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: istore 22
// 054: aload 0
// 055: lload 6
// 057: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 05a: getstatic su/catlean/x5.p [I
// 05d: swap
// 05e: invokevirtual su/catlean/be.ordinal ()I
// 061: iaload
// 062: iload 22
// 064: ifeq 20a
// 067: tableswitch 413 1 2 31 324
// 07c: ldc2_w -5587819444686534136
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 089: iload 22
// 08b: ifeq 0c0
// 08e: goto 09b
// 091: ldc2_w -5587819444686534136
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: lload 8
// 09d: invokevirtual su/catlean/dm.Y (J)Z
// 0a0: ifeq 0f5
// 0a3: goto 0b0
// 0a6: ldc2_w -5587819444686534136
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0b3: goto 0c0
// 0b6: ldc2_w -5587819444686534136
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 0
// 0c1: lload 10
// 0c3: invokespecial su/catlean/u8.E (J)F
// 0c6: bipush 0
// 0c7: fconst_0
// 0c8: lload 18
// 0ca: fconst_0
// 0cb: fconst_0
// 0cc: sipush 18054
// 0cf: ldc2_w 5765011225048293480
// 0d2: lload 2
// 0d3: lxor
// 0d4: invokedynamic m (IJ)I bsm=su/catlean/u8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: aconst_null
// 0da: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 0dd: astore 23
// 0df: lload 20
// 0e1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e4: aload 23
// 0e6: bipush 0
// 0e7: daload
// 0e8: dconst_0
// 0e9: aload 23
// 0eb: bipush 1
// 0ec: daload
// 0ed: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 0f0: iload 22
// 0f2: ifne 10d
// 0f5: lload 20
// 0f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fa: dconst_0
// 0fb: dconst_0
// 0fc: dconst_0
// 0fd: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 100: goto 10d
// 103: ldc2_w -5587819444686534136
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: lload 4
// 10f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 112: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 115: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 118: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 11b: iload 22
// 11d: ifeq 167
// 120: ifeq 159
// 123: goto 130
// 126: ldc2_w -5587819444686534136
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: lload 20
// 132: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 135: lload 20
// 137: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13a: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 13d: dconst_0
// 13e: aload 0
// 13f: lload 12
// 141: invokespecial su/catlean/u8.w (J)F
// 144: f2d
// 145: dconst_0
// 146: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 149: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 14c: goto 159
// 14f: ldc2_w -5587819444686534136
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: lload 4
// 15b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 15e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 161: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 164: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 167: iload 22
// 169: ifeq 20a
// 16c: ifeq 204
// 16f: goto 17c
// 172: ldc2_w -5587819444686534136
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: lload 20
// 17e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 181: lload 20
// 183: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 186: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 189: dconst_0
// 18a: aload 0
// 18b: lload 12
// 18d: invokespecial su/catlean/u8.w (J)F
// 190: f2d
// 191: dneg
// 192: dconst_0
// 193: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 196: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 199: iload 22
// 19b: ifne 204
// 19e: goto 1ab
// 1a1: ldc2_w -5587819444686534136
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: lload 20
// 1ad: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b0: bipush 1
// 1b1: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 1b4: lload 20
// 1b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b9: getfield net/minecraft/class_746.field_6012 I
// 1bc: bipush 2
// 1bd: irem
// 1be: iload 22
// 1c0: ifeq 20a
// 1c3: goto 1d0
// 1c6: ldc2_w -5587819444686534136
// 1c9: lload 2
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: ifne 204
// 1d3: goto 1e0
// 1d6: ldc2_w -5587819444686534136
// 1d9: lload 2
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: aload 1
// 1e1: invokevirtual su/catlean/api/event/events/player/PreSyncEvent.cancel ()V
// 1e4: new net/minecraft/class_2828$class_5911
// 1e7: dup
// 1e8: bipush 1
// 1e9: bipush 0
// 1ea: invokespecial net/minecraft/class_2828$class_5911.<init> (ZZ)V
// 1ed: checkcast net/minecraft/class_2596
// 1f0: lload 14
// 1f2: dup2_x1
// 1f3: pop2
// 1f4: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1f7: goto 204
// 1fa: ldc2_w -5587819444686534136
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: aload 0
// 205: lload 16
// 207: invokespecial su/catlean/u8.r (J)Z
// 20a: iload 22
// 20c: ifeq 254
// 20f: ifeq 2b5
// 212: goto 21f
// 215: ldc2_w -5587819444686534136
// 218: lload 2
// 219: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: athrow
// 21f: lload 20
// 221: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 224: iload 22
// 226: ifeq 269
// 229: goto 236
// 22c: ldc2_w -5587819444686534136
// 22f: lload 2
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: getfield net/minecraft/class_746.field_6012 I
// 239: sipush 21566
// 23c: ldc2_w 3190353093345686227
// 23f: lload 2
// 240: lxor
// 241: invokedynamic m (IJ)I bsm=su/catlean/u8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: irem
// 247: goto 254
// 24a: ldc2_w -5587819444686534136
// 24d: lload 2
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: ifne 2b5
// 257: lload 20
// 259: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25c: goto 269
// 25f: ldc2_w -5587819444686534136
// 262: lload 2
// 263: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: athrow
// 269: new net/minecraft/class_243
// 26c: dup
// 26d: lload 20
// 26f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 272: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 275: getfield net/minecraft/class_243.field_1352 D
// 278: lload 20
// 27a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27d: getfield net/minecraft/class_746.field_6012 I
// 280: sipush 18054
// 283: ldc2_w 5765011225048293480
// 286: lload 2
// 287: lxor
// 288: invokedynamic m (IJ)I bsm=su/catlean/u8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: irem
// 28e: ifne 2a1
// 291: ldc2_w -0.08
// 294: goto 2a4
// 297: ldc2_w -5587819444686534136
// 29a: lload 2
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: ldc2_w 0.08
// 2a4: lload 20
// 2a6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a9: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2ac: getfield net/minecraft/class_243.field_1350 D
// 2af: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2b2: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 2b5: return
}

@Flow
public final void B(@NotNull PlayerUpdateEvent event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u8.a J
// 003: ldc2_w 127391554007136
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 60232781505360
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 82563117329562
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 47173399486755
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 19734439842962
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 121149016541664
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 24659558772086
// 030: lxor
// 031: lstore 14
// 033: pop2
// 034: ldc2_w 9213746215762059259
// 037: lload 2
// 038: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: aload 1
// 03e: sipush 28996
// 041: ldc2_w 516702808719814029
// 044: lload 2
// 045: lxor
// 046: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/u8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04e: istore 16
// 050: aload 0
// 051: lload 6
// 053: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 056: getstatic su/catlean/be.Creative Lsu/catlean/be;
// 059: iload 16
// 05b: ifne 0a4
// 05e: if_acmpne 09b
// 061: goto 06e
// 064: ldc2_w 9205731572028901309
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: lload 14
// 070: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 073: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 076: bipush 1
// 077: putfield net/minecraft/class_1656.field_7479 Z
// 07a: lload 14
// 07c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07f: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 082: aload 0
// 083: lload 8
// 085: invokespecial su/catlean/u8.E (J)F
// 088: ldc 10.0
// 08a: fdiv
// 08b: invokevirtual net/minecraft/class_1656.method_7248 (F)V
// 08e: goto 09b
// 091: ldc2_w 9205731572028901309
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: aload 0
// 09c: lload 6
// 09e: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 0a1: getstatic su/catlean/be.MATRIX_JUMP Lsu/catlean/be;
// 0a4: if_acmpne 177
// 0a7: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0aa: iload 16
// 0ac: ifne 0e1
// 0af: goto 0bc
// 0b2: ldc2_w 9205731572028901309
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: invokevirtual su/catlean/dm.o ()D
// 0bf: dconst_0
// 0c0: dcmpl
// 0c1: ifle 177
// 0c4: goto 0d1
// 0c7: ldc2_w 9205731572028901309
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0d4: goto 0e1
// 0d7: ldc2_w 9205731572028901309
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 0
// 0e2: lload 8
// 0e4: invokespecial su/catlean/u8.E (J)F
// 0e7: bipush 0
// 0e8: fconst_0
// 0e9: lload 12
// 0eb: fconst_0
// 0ec: fconst_0
// 0ed: sipush 29698
// 0f0: ldc2_w 5362819535939690334
// 0f3: lload 2
// 0f4: lxor
// 0f5: invokedynamic m (IJ)I bsm=su/catlean/u8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: aconst_null
// 0fb: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 0fe: astore 17
// 100: bipush 0
// 101: istore 18
// 103: lload 14
// 105: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 108: aload 17
// 10a: bipush 0
// 10b: daload
// 10c: lload 4
// 10e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 111: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 114: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 117: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 11a: iload 16
// 11c: ifne 153
// 11f: ifeq 145
// 122: goto 12f
// 125: ldc2_w 9205731572028901309
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: getstatic su/catlean/u8.d Lsu/catlean/u8;
// 132: lload 10
// 134: invokespecial su/catlean/u8.w (J)F
// 137: f2d
// 138: goto 16e
// 13b: ldc2_w 9205731572028901309
// 13e: lload 2
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: lload 4
// 147: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 14a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 14d: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 150: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 153: ifeq 16d
// 156: getstatic su/catlean/u8.d Lsu/catlean/u8;
// 159: lload 10
// 15b: invokespecial su/catlean/u8.w (J)F
// 15e: f2d
// 15f: dneg
// 160: goto 16e
// 163: ldc2_w 9205731572028901309
// 166: lload 2
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: dconst_0
// 16e: aload 17
// 170: bipush 1
// 171: daload
// 172: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 175: nop
// 176: nop
// 177: iload 16
// 179: ifeq 196
// 17c: bipush 1
// 17d: anewarray 446
// 180: ldc2_w 9168938626268951811
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: goto 196
// 18c: ldc2_w 9205731572028901309
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: return
}

@Flow
private final void H(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u8.a J
// 03: ldc2_w 111216391954412
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 103272565981974
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 651726045946
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: aload 0
// 19: lload 4
// 1b: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 1e: getstatic su/catlean/be.MATRIX_JUMP Lsu/catlean/be;
// 21: if_acmpne 53
// 24: aload 1
// 25: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 28: instanceof net/minecraft/class_2708
// 2b: ifeq 53
// 2e: goto 3b
// 31: ldc2_w -8048703373270423503
// 34: lload 2
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: lload 6
// 3d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 40: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 43: putstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 46: goto 53
// 49: ldc2_w -8048703373270423503
// 4c: lload 2
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: return
}

@Flow
private final void Y(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u8.a J
// 03: ldc2_w 120576427063952
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 93881308751466
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 42128827290743
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 8902585689990
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: aload 0
// 20: lload 4
// 22: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 25: getstatic su/catlean/be.MATRIX_JUMP Lsu/catlean/be;
// 28: if_acmpne 92
// 2b: aload 1
// 2c: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2f: instanceof net/minecraft/class_2828$class_2830
// 32: ifeq 92
// 35: goto 42
// 38: ldc2_w -778759473859064499
// 3b: lload 2
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: getstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 45: ifnull 92
// 48: goto 55
// 4b: ldc2_w -778759473859064499
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: lload 8
// 57: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5a: getstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 5d: dup
// 5e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 61: getfield net/minecraft/class_243.field_1352 D
// 64: getstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 67: dup
// 68: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6b: getfield net/minecraft/class_243.field_1351 D
// 6e: getstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 71: dup
// 72: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 75: getfield net/minecraft/class_243.field_1350 D
// 78: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 7b: aload 0
// 7c: lload 6
// 7e: invokevirtual su/catlean/u8.d (J)V
// 81: aconst_null
// 82: putstatic su/catlean/u8.g Lnet/minecraft/class_243;
// 85: goto 92
// 88: ldc2_w -778759473859064499
// 8b: lload 2
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: return
}

@Flow
public final void z(@NotNull MoveEvent event) {
long var2 = a ^ 6815589672276L;
long var4 = var2 ^ 69241077791150L;
long var6 = var2 ^ 30517831883988L;
long var8 = var2 ^ 109417657956418L;
Intrinsics.checkNotNullParameter(event, b<"u">(6530, 5519662831669694590L ^ var2));
if (this.L(var4) == be.GRIM_GLIDE) {
double[] var10 = dm.O(dm.h, 0.3F, false, 1.0F, var6, 0.0F, 0.0F, c<"m">(8465, 6284429350255189884L ^ var2), null);
event.cancel();
event.setY(-0.03);
event.setX(var10[0]);
event.setZ(var10[1]);
zf.v(var8).method_18800(event.getX(), -0.03, event.getZ());
}
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 29647348875563
// 05: lxor
// 06: lstore 3
// 07: pop2
// 08: lload 3
// 09: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 0f: bipush 0
// 10: putfield net/minecraft/class_1656.field_7479 Z
// 13: ldc2_w 1405336142816457638
// 16: lload 1
// 17: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c: lload 3
// 1d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 23: ldc 0.05
// 25: invokevirtual net/minecraft/class_1656.method_7248 (F)V
// 28: istore 5
// 2a: ldc2_w 1375206718265298308
// 2d: lload 1
// 2e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: ifnull 60
// 36: iload 5
// 38: ifeq 56
// 3b: goto 48
// 3e: ldc2_w 1413101743418305504
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: bipush 0
// 49: goto 57
// 4c: ldc2_w 1413101743418305504
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: bipush 1
// 57: ldc2_w 1350214073363911452
// 5a: lload 1
// 5b: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: return
}

private static final boolean G() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u8.a J
// 03: ldc2_w 2718629579749
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 64542283798303
// 0d: lxor
// 0e: lstore 2
// 0f: pop2
// 10: ldc2_w -4308262490523361975
// 13: lload 0
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: istore 4
// 1b: getstatic su/catlean/u8.d Lsu/catlean/u8;
// 1e: lload 2
// 1f: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 22: getstatic su/catlean/be.Creative Lsu/catlean/be;
// 25: iload 4
// 27: ifeq 51
// 2a: if_acmpeq 54
// 2d: goto 3a
// 30: ldc2_w -4304273891338994632
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: getstatic su/catlean/u8.d Lsu/catlean/u8;
// 3d: lload 2
// 3e: invokespecial su/catlean/u8.L (J)Lsu/catlean/be;
// 41: getstatic su/catlean/be.Vanilla Lsu/catlean/be;
// 44: goto 51
// 47: ldc2_w -4304273891338994632
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: if_acmpne 62
// 54: bipush 1
// 55: goto 63
// 58: ldc2_w -4304273891338994632
// 5b: lload 0
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: bipush 0
// 63: ireturn
}

static {
long var20 = a ^ 112611400945011L;
long var22 = var20 ^ 57464829561750L;
long var24 = var20 ^ 4708212393432L;
long var26 = var20 ^ 109213672146593L;
long var28 = var20 ^ 76096249724780L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[15];
int var16 = 0;
String var15 = "|\u0099& àÒnØ\u0013«±\u0017Òb¨\u001c\u0010ô\u0081_\u000fÊèE)\u0018\u0004»ÒR{\u001b\u001b <E¼Û\u008bPé()\u00adËÅO7âÏ.¢\u008b\u0081ìØ4ä\u001cI/!@\t¦\u008b \u0019¶\u0088>Èìp\u001b\u009aBÇý\b\u0087×Î\u00adÌ\u0085Ð\u0006\u0094\u0000[}ïõ±Ë\u0085\u0017\u0014 \u0002mÇ©doE\u0097zo\u008b$°\u0087bâe¦÷S\u001d=5\u001bù \u0092á}«X<\u0010ý^\u0086U«`ù$\u0017Å]mEç°\u0007 H¬\u001eQ¬\u0005×³\u0085ÜáÚV8yy!gT¥ÅiÌù\u000bþl\n\u0090\u0010b|\u0010`DFî¦\u008a\u009cÌß¿\u0087\u0007LÛ¾]\u0010¡v%æ\u009d:ÿØ\u0093R]\u009f+\u009fÞ,\u0018` ¼\u000eÛdG\u0092\u00066·ò½=b_p°\u000fîÖò>\u0013\u0010\u008fuÞ¸\u000b\u000e\u0015e=ÊR\u0099j\u0083Që0\u001b\u009b[\u007fm\u009el'Å'\u0089<«\u0081`¦ÉPvÇÆ\u009a\"·lfÖ÷Æ\u001d\u0006\u0089°H&à\u0094\u0094RÔÒ\u0080n&z\u009c\u008ag \u009bbö1\u0011f\u0013Uã<\tú§dÛgÏ\u0085@ó¢è'ÞµX3Ea¾9ä";
int var17 = "|\u0099& àÒnØ\u0013«±\u0017Òb¨\u001c\u0010ô\u0081_\u000fÊèE)\u0018\u0004»ÒR{\u001b\u001b <E¼Û\u008bPé()\u00adËÅO7âÏ.¢\u008b\u0081ìØ4ä\u001cI/!@\t¦\u008b \u0019¶\u0088>Èìp\u001b\u009aBÇý\b\u0087×Î\u00adÌ\u0085Ð\u0006\u0094\u0000[}ïõ±Ë\u0085\u0017\u0014 \u0002mÇ©doE\u0097zo\u008b$°\u0087bâe¦÷S\u001d=5\u001bù \u0092á}«X<\u0010ý^\u0086U«`ù$\u0017Å]mEç°\u0007 H¬\u001eQ¬\u0005×³\u0085ÜáÚV8yy!gT¥ÅiÌù\u000bþl\n\u0090\u0010b|\u0010`DFî¦\u008a\u009cÌß¿\u0087\u0007LÛ¾]\u0010¡v%æ\u009d:ÿØ\u0093R]\u009f+\u009fÞ,\u0018` ¼\u000eÛdG\u0092\u00066·ò½=b_p°\u000fîÖò>\u0013\u0010\u008fuÞ¸\u000b\u000e\u0015e=ÊR\u0099j\u0083Që0\u001b\u009b[\u007fm\u009el'Å'\u0089<«\u0081`¦ÉPvÇÆ\u009a\"·lfÖ÷Æ\u001d\u0006\u0089°H&à\u0094\u0094RÔÒ\u0080n&z\u009c\u008ag \u009bbö1\u0011f\u0013Uã<\tú§dÛgÏ\u0085@ó¢è'ÞµX3Ea¾9ä"
.length();
char var14 = 16;
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
c = new String[15];
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
String var4 = "gò\bc\u0087r¾+/\u0082\u007fáDÙª\u0010A\u001c²wD`\u0097·}è\u0086\u0006ÛÌ\u009a(®TAf\u0086ðèT";
int var5 = "gò\bc\u0087r¾+/\u0082\u007fáDÙª\u0010A\u001c²wD`\u0097·}è\u0086\u0006ÛÌ\u009a(®TAf\u0086ðèT".length();
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
h = new Integer[7];
KProperty[] var30 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(u8.class, b<"u">(9568, 1406738745816368306L ^ var20), b<"u">(32692, 2138809180741082725L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(u8.class, b<"u">(21962, 8568800743436432407L ^ var20), b<"u">(30439, 3703631644960036665L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(u8.class, b<"u">(29509, 5111575229125956245L ^ var20), b<"u">(10878, 8646072336879143853L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(u8.class, b<"u">(11165, 6434214746351258180L ^ var20), b<"u">(6383, 987331664338778427L ^ var20), 0))
};
W = var30;
d = new u8(var26);
w = yp.L(d, b<"u">(21653, 8984485206023779650L ^ var20), be.Vanilla, null, null, c<"m">(19130, 5928234569679969527L ^ var20), null, var28);
F = yp.k(
d, b<"u">(21693, 2487209378527163755L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.0F, 10.0F), null, null, c<"m">(24518, 6302269009584785802L ^ var20), null
);
Y = yp.k(
d, b<"u">(26724, 6933646138753223096L ^ var20), 0.78F, var22, RangesKt.rangeTo(0.0F, 5.0F), null, null, c<"m">(11495, 1104965425599642286L ^ var20), null
);
k = yp.t(d, b<"u">(28760, 2433560888043868544L ^ var20), false, var24, null, u8::G, 4, null);
g = class_243.field_1353;
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "}R: d\u0017%\u0003i;qOp}\u0089Z";
var5 = "}R: d\u0017%\u0003i;qOp}\u0089Z".length();
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

var15 = "À\u0099P\u007f\u0085\u0089/©\u0094\rj/û6\u008bn\u0018)dJ2N\u0005\u0001;\u0080\u0091Y¼íe\u009d.%\u0085\t\u0001¬\u0002\u0007\u009d";
var17 = "À\u0099P\u007f\u0085\u0089/©\u0094\rj/û6\u008bn\u0018)dJ2N\u0005\u0001;\u0080\u0091Y¼íe\u009d.%\u0085\t\u0001¬\u0002\u0007\u009d".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25296;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u8", var10);
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
throw new RuntimeException("su/catlean/u8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21827;
if (h[var3] == null) {
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
throw new RuntimeException("su/catlean/u8", var14);
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
throw new RuntimeException("su/catlean/u8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
