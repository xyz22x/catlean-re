package su.catlean;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2767;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.SlotRenderEvent;
import su.catlean.gofra.Flow;

public final class e1 extends _g {
@NotNull
public static final e1 Y;
static final KProperty[] F;
@NotNull
private static final cq C;
@NotNull
private static final cq P;
private static final boolean c;
@NotNull
private static final List o;
@NotNull
private static final List A;
@NotNull
private static final IntArrayList a;
private static final long b = yz.a(4609668170555452464L, -3513194470429409577L, MethodHandles.lookup().lookupClass()).a(169900073998871L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;
private static final long j;

private e1(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 94385513073697L;
super(b<"p">(8107, 854701900118441779L ^ var1), jt.y(), null, 4, null, var3);
}

private final boolean H(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 11012229560820L;
return (Boolean)C.E(this, var6, F[0]);
}

private final boolean E(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 88763826677018L;
return (Boolean)P.E(this, var3, F[1]);
}

@Flow
private final void Y(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: ldc2_w 106640879855934
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 123725349208096
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 35900016057528
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 60952731588602
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -5698817081491771529
// 022: lload 2
// 023: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 10
// 02a: getstatic su/catlean/e1.c Z
// 02d: aload 10
// 02f: ifnonnull 214
// 032: ifeq 20e
// 035: goto 042
// 038: ldc2_w -5701051828935147060
// 03b: lload 2
// 03c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: athrow
// 042: aload 1
// 043: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 046: instanceof net/minecraft/class_2716
// 049: aload 10
// 04b: ifnonnull 214
// 04e: goto 05b
// 051: ldc2_w -5701051828935147060
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: ifeq 20e
// 05e: goto 06b
// 061: ldc2_w -5701051828935147060
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: aload 1
// 06c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 06f: dup
// 070: sipush 28907
// 073: ldc2_w 384666593526267331
// 076: lload 2
// 077: lxor
// 078: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 080: checkcast su/catlean/mixins/accessors/ClientboundRemoveEntitiesPacketAccessor
// 083: astore 11
// 085: new it/unimi/dsi/fastutil/ints/IntArrayList
// 088: dup
// 089: invokespecial it/unimi/dsi/fastutil/ints/IntArrayList.<init> ()V
// 08c: astore 12
// 08e: aload 11
// 090: invokeinterface su/catlean/mixins/accessors/ClientboundRemoveEntitiesPacketAccessor.getIds ()Lit/unimi/dsi/fastutil/ints/IntList; 1
// 095: dup
// 096: sipush 19670
// 099: ldc2_w 6924371460978999749
// 09c: lload 2
// 09d: lxor
// 09e: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a6: checkcast java/lang/Iterable
// 0a9: astore 13
// 0ab: bipush 0
// 0ac: istore 14
// 0ae: aload 13
// 0b0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0b5: astore 15
// 0b7: aload 15
// 0b9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0be: ifeq 1fc
// 0c1: aload 15
// 0c3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c8: astore 16
// 0ca: aload 16
// 0cc: checkcast java/lang/Integer
// 0cf: astore 17
// 0d1: bipush 0
// 0d2: istore 18
// 0d4: lload 6
// 0d6: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d9: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 0dc: dup
// 0dd: sipush 31571
// 0e0: ldc2_w 6720751850791155275
// 0e3: lload 2
// 0e4: lxor
// 0e5: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ed: checkcast java/lang/Iterable
// 0f0: astore 19
// 0f2: bipush 0
// 0f3: istore 20
// 0f5: aload 19
// 0f7: aload 10
// 0f9: ifnonnull 15d
// 0fc: instanceof java/util/Collection
// 0ff: aload 10
// 101: ifnonnull 214
// 104: goto 111
// 107: ldc2_w -5701051828935147060
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: ifeq 15b
// 114: goto 121
// 117: ldc2_w -5701051828935147060
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 19
// 123: checkcast java/util/Collection
// 126: aload 10
// 128: ifnonnull 15d
// 12b: goto 138
// 12e: ldc2_w -5701051828935147060
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: invokeinterface java/util/Collection.isEmpty ()Z 1
// 13d: ifeq 15b
// 140: goto 14d
// 143: ldc2_w -5701051828935147060
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: bipush 1
// 14e: goto 1c5
// 151: ldc2_w -5701051828935147060
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: aload 19
// 15d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 162: astore 21
// 164: aload 21
// 166: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16b: ifeq 1c4
// 16e: aload 21
// 170: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 175: astore 22
// 177: aload 22
// 179: checkcast net/minecraft/class_742
// 17c: astore 23
// 17e: bipush 0
// 17f: istore 24
// 181: aload 23
// 183: invokevirtual net/minecraft/class_742.method_5628 ()I
// 186: aload 10
// 188: ifnonnull 19f
// 18b: aload 17
// 18d: dup
// 18e: ifnonnull 1a3
// 191: pop
// 192: goto 19f
// 195: ldc2_w -5701051828935147060
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: pop
// 1a0: goto 1b7
// 1a3: invokevirtual java/lang/Integer.intValue ()I
// 1a6: if_icmpne 1b7
// 1a9: bipush 1
// 1aa: goto 1b8
// 1ad: ldc2_w -5701051828935147060
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: bipush 0
// 1b8: ifeq 164
// 1bb: bipush 0
// 1bc: aload 10
// 1be: ifnonnull 186
// 1c1: goto 1c5
// 1c4: bipush 1
// 1c5: ifeq 1e4
// 1c8: aload 12
// 1ca: aload 17
// 1cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1cf: aload 17
// 1d1: invokevirtual java/lang/Integer.intValue ()I
// 1d4: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
// 1d7: goto 1f4
// 1da: ldc2_w -5701051828935147060
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: getstatic su/catlean/e1.a Lit/unimi/dsi/fastutil/ints/IntArrayList;
// 1e7: aload 17
// 1e9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ec: aload 17
// 1ee: invokevirtual java/lang/Integer.intValue ()I
// 1f1: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
// 1f4: pop
// 1f5: nop
// 1f6: nop
// 1f7: aload 10
// 1f9: ifnull 0b7
// 1fc: nop
// 1fd: aload 1
// 1fe: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 201: checkcast su/catlean/mixins/accessors/ClientboundRemoveEntitiesPacketAccessor
// 204: aload 12
// 206: checkcast it/unimi/dsi/fastutil/ints/IntList
// 209: invokeinterface su/catlean/mixins/accessors/ClientboundRemoveEntitiesPacketAccessor.setIds (Lit/unimi/dsi/fastutil/ints/IntList;)V 2
// 20e: aload 0
// 20f: lload 4
// 211: invokespecial su/catlean/e1.E (J)Z
// 214: aload 10
// 216: ifnonnull 23d
// 219: ifeq 389
// 21c: goto 229
// 21f: ldc2_w -5701051828935147060
// 222: lload 2
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: aload 1
// 22a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 22d: instanceof net/minecraft/class_2767
// 230: goto 23d
// 233: ldc2_w -5701051828935147060
// 236: lload 2
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: aload 10
// 23f: ifnonnull 274
// 242: ifeq 389
// 245: goto 252
// 248: ldc2_w -5701051828935147060
// 24b: lload 2
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: aload 1
// 253: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 256: checkcast net/minecraft/class_2767
// 259: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 25c: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 261: getstatic net/minecraft/class_3417.field_15228 Lnet/minecraft/class_3414;
// 264: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 267: goto 274
// 26a: ldc2_w -5701051828935147060
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: aload 10
// 276: ifnonnull 2ab
// 279: ifne 2c0
// 27c: goto 289
// 27f: ldc2_w -5701051828935147060
// 282: lload 2
// 283: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: athrow
// 289: aload 1
// 28a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 28d: checkcast net/minecraft/class_2767
// 290: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 293: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 298: getstatic net/minecraft/class_3417.field_15134 Lnet/minecraft/class_3414;
// 29b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 29e: goto 2ab
// 2a1: ldc2_w -5701051828935147060
// 2a4: lload 2
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: aload 10
// 2ad: ifnonnull 325
// 2b0: ifeq 2f1
// 2b3: goto 2c0
// 2b6: ldc2_w -5701051828935147060
// 2b9: lload 2
// 2ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bf: athrow
// 2c0: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 2c3: lload 8
// 2c5: bipush 0
// 2c6: bipush 0
// 2c7: bipush 0
// 2c8: aload 1
// 2c9: invokedynamic run (Lsu/catlean/api/event/events/network/ReceivePacket;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/e1.y (Lsu/catlean/api/event/events/network/ReceivePacket;)V, ()V ]
// 2ce: sipush 15591
// 2d1: ldc2_w 1341517536629629002
// 2d4: lload 2
// 2d5: lxor
// 2d6: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: aconst_null
// 2dc: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 2df: aload 10
// 2e1: ifnull 389
// 2e4: goto 2f1
// 2e7: ldc2_w -5701051828935147060
// 2ea: lload 2
// 2eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: athrow
// 2f1: aload 1
// 2f2: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 2f5: checkcast net/minecraft/class_2767
// 2f8: aload 10
// 2fa: ifnonnull 33c
// 2fd: goto 30a
// 300: ldc2_w -5701051828935147060
// 303: lload 2
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 30d: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 312: getstatic net/minecraft/class_3417.field_14785 Lnet/minecraft/class_3414;
// 315: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 318: goto 325
// 31b: ldc2_w -5701051828935147060
// 31e: lload 2
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: ifeq 389
// 328: aload 1
// 329: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 32c: checkcast net/minecraft/class_2767
// 32f: goto 33c
// 332: ldc2_w -5701051828935147060
// 335: lload 2
// 336: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: athrow
// 33c: invokevirtual net/minecraft/class_2767.method_11890 ()D
// 33f: aload 1
// 340: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 343: checkcast net/minecraft/class_2767
// 346: invokevirtual net/minecraft/class_2767.method_11889 ()D
// 349: aload 1
// 34a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 34d: checkcast net/minecraft/class_2767
// 350: invokevirtual net/minecraft/class_2767.method_11893 ()D
// 353: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 356: dup
// 357: sipush 13835
// 35a: ldc2_w 4953565605761022750
// 35d: lload 2
// 35e: lxor
// 35f: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 367: astore 11
// 369: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 36c: lload 8
// 36e: bipush 5
// 36f: bipush 0
// 370: bipush 0
// 371: aload 11
// 373: invokedynamic run (Lnet/minecraft/class_2338;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/e1.O (Lnet/minecraft/class_2338;)V, ()V ]
// 378: sipush 18714
// 37b: ldc2_w 8429866145141478833
// 37e: lload 2
// 37f: lxor
// 380: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 385: aconst_null
// 386: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 389: return
}

@Flow
private final void N(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: ldc2_w 107903136733810
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 125728299217772
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 135141068177608
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 69422447829983
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 32
// 030: lshl
// 031: bipush 32
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 89742202642014
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 104101420732176
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 27629761781519
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 95541226381256
// 051: lxor
// 052: lstore 17
// 054: pop2
// 055: ldc2_w 262825956821998651
// 058: lload 2
// 059: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: astore 19
// 060: aload 0
// 061: lload 4
// 063: invokespecial su/catlean/e1.E (J)Z
// 066: aload 19
// 068: ifnonnull 09a
// 06b: ifeq 2e0
// 06e: goto 07b
// 071: ldc2_w 265089295329227392
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: getstatic su/catlean/e1.o Ljava/util/List;
// 07e: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/e1.Q (Lsu/catlean/zs;)Z, (Lsu/catlean/zs;)Ljava/lang/Boolean; ]
// 083: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/e1.M (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 088: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 08d: goto 09a
// 090: ldc2_w 265089295329227392
// 093: lload 2
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: pop
// 09b: getstatic su/catlean/e1.o Ljava/util/List;
// 09e: checkcast java/lang/Iterable
// 0a1: astore 20
// 0a3: bipush 0
// 0a4: istore 21
// 0a6: aload 20
// 0a8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ad: astore 22
// 0af: aload 22
// 0b1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b6: ifeq 2df
// 0b9: aload 22
// 0bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c0: astore 23
// 0c2: aload 23
// 0c4: checkcast su/catlean/zs
// 0c7: astore 24
// 0c9: bipush 0
// 0ca: istore 25
// 0cc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0cf: aload 24
// 0d1: invokevirtual su/catlean/zs.b ()Lnet/minecraft/class_243;
// 0d4: lload 6
// 0d6: dup2_x1
// 0d7: pop2
// 0d8: invokevirtual su/catlean/jl.t (JLnet/minecraft/class_243;)Lorg/joml/Vector4d;
// 0db: astore 26
// 0dd: aload 24
// 0df: invokevirtual su/catlean/zs.s ()J
// 0e2: invokestatic su/catlean/zf.A ()J
// 0e5: lsub
// 0e6: l2d
// 0e7: ldc 50.0
// 0e9: f2d
// 0ea: ddiv
// 0eb: d2i
// 0ec: istore 27
// 0ee: iload 27
// 0f0: sipush 28892
// 0f3: ldc2_w 5489414547841998643
// 0f6: lload 2
// 0f7: lxor
// 0f8: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: idiv
// 0fe: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 101: pop
// 102: sipush 23764
// 105: ldc2_w 5491669501615481479
// 108: lload 2
// 109: lxor
// 10a: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: astore 28
// 111: bipush 1
// 112: anewarray 528
// 115: astore 29
// 117: aload 29
// 119: bipush 0
// 11a: iload 27
// 11c: sipush 1158
// 11f: ldc2_w 7889720251085204347
// 122: lload 2
// 123: lxor
// 124: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: irem
// 12a: sipush 9414
// 12d: ldc2_w 7878053377343884079
// 130: lload 2
// 131: lxor
// 132: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: idiv
// 138: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 13b: aastore
// 13c: aload 29
// 13e: astore 29
// 140: aload 28
// 142: aload 29
// 144: aload 29
// 146: arraylength
// 147: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// 14a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 14d: dup
// 14e: sipush 19626
// 151: ldc2_w 7121104805870646001
// 154: lload 2
// 155: lxor
// 156: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15e: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
// 163: astore 30
// 165: lload 15
// 167: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 16a: lload 11
// 16c: aload 30
// 16e: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 171: ldc 22.0
// 173: fadd
// 174: fstore 31
// 176: aload 19
// 178: ifnonnull 2e0
// 17b: aload 19
// 17d: ifnonnull 2da
// 180: goto 18d
// 183: ldc2_w 265089295329227392
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 26
// 18f: ifnull 2d8
// 192: goto 19f
// 195: ldc2_w 265089295329227392
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: aload 26
// 1a1: getfield org/joml/Vector4d.x D
// 1a4: aload 26
// 1a6: getfield org/joml/Vector4d.z D
// 1a9: aload 26
// 1ab: getfield org/joml/Vector4d.x D
// 1ae: dsub
// 1af: d2f
// 1b0: fconst_2
// 1b1: fdiv
// 1b2: f2d
// 1b3: dadd
// 1b4: fload 31
// 1b6: bipush 2
// 1b7: i2f
// 1b8: fdiv
// 1b9: f2d
// 1ba: dsub
// 1bb: d2f
// 1bc: fstore 28
// 1be: aload 26
// 1c0: getfield org/joml/Vector4d.y D
// 1c3: d2f
// 1c4: fstore 29
// 1c6: aload 1
// 1c7: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 1ca: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1cd: dup
// 1ce: sipush 22727
// 1d1: ldc2_w 3534131855226939025
// 1d4: lload 2
// 1d5: lxor
// 1d6: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1de: iload 8
// 1e0: i2c
// 1e1: fload 28
// 1e3: fload 29
// 1e5: fload 31
// 1e7: ldc 16.0
// 1e9: ldc 3.0
// 1eb: ldc 1.5
// 1ed: fconst_0
// 1ee: fconst_1
// 1ef: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f2: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 1f5: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f8: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1fb: fconst_0
// 1fc: iload 9
// 1fe: i2s
// 1ff: fconst_0
// 200: iload 10
// 202: fconst_0
// 203: sipush 19583
// 206: ldc2_w 9193502111670789012
// 209: lload 2
// 20a: lxor
// 20b: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: aconst_null
// 211: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 214: aload 1
// 215: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 218: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 21b: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 21e: pop
// 21f: aload 1
// 220: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 223: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 226: fload 28
// 228: fconst_2
// 229: fadd
// 22a: fload 29
// 22c: fconst_2
// 22d: fadd
// 22e: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 231: pop
// 232: aload 1
// 233: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 236: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 239: ldc 0.7
// 23b: invokevirtual org/joml/Matrix3x2fStack.scale (F)Lorg/joml/Matrix3x2f;
// 23e: pop
// 23f: aload 1
// 240: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 243: aload 24
// 245: invokevirtual su/catlean/zs.T ()Lnet/minecraft/class_1792;
// 248: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 24b: bipush 0
// 24c: bipush 0
// 24d: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 250: aload 1
// 251: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 254: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 257: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 25a: pop
// 25b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 25e: aload 1
// 25f: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 262: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 265: dup
// 266: sipush 22879
// 269: ldc2_w 1232702633799100191
// 26c: lload 2
// 26d: lxor
// 26e: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 276: fload 28
// 278: sipush 32680
// 27b: ldc2_w 5375161593557373000
// 27e: lload 2
// 27f: lxor
// 280: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: i2f
// 286: fadd
// 287: fload 29
// 289: ldc 4.0
// 28b: fadd
// 28c: ldc 0.5
// 28e: ldc 9.0
// 290: bipush 1
// 291: anewarray 527
// 294: astore 32
// 296: aload 32
// 298: bipush 0
// 299: new java/awt/Color
// 29c: dup
// 29d: sipush 28176
// 2a0: ldc2_w 6708645415574553074
// 2a3: lload 2
// 2a4: lxor
// 2a5: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: bipush 1
// 2ab: invokespecial java/awt/Color.<init> (IZ)V
// 2ae: aastore
// 2af: aload 32
// 2b1: lload 17
// 2b3: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 2b6: lload 15
// 2b8: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2bb: aload 1
// 2bc: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 2bf: aload 30
// 2c1: fload 28
// 2c3: ldc 18.0
// 2c5: fadd
// 2c6: lload 13
// 2c8: dup2_x1
// 2c9: pop2
// 2ca: fload 29
// 2cc: ldc 3.0
// 2ce: fadd
// 2cf: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2d2: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2d5: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 2d8: nop
// 2d9: nop
// 2da: aload 19
// 2dc: ifnull 0af
// 2df: nop
// 2e0: return
}

@Flow
private final void b(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: ldc2_w 50776986926788
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 84418314697667
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 60629858039675
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 110969919802164
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
// 039: ldc2_w 71434576478237
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 119170882532837
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 2815861226968889485
// 04a: lload 2
// 04b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 19
// 052: lload 13
// 054: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 057: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 05a: instanceof net/minecraft/class_1707
// 05d: aload 19
// 05f: ifnonnull 374
// 062: ifeq 371
// 065: goto 072
// 068: ldc2_w 2817992510796551734
// 06b: lload 2
// 06c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: athrow
// 072: aload 0
// 073: iload 8
// 075: iload 9
// 077: i2c
// 078: iload 10
// 07a: invokespecial su/catlean/e1.H (ICI)Z
// 07d: aload 19
// 07f: ifnonnull 374
// 082: goto 08f
// 085: ldc2_w 2817992510796551734
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: ifeq 371
// 092: goto 09f
// 095: ldc2_w 2817992510796551734
// 098: lload 2
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: lload 13
// 0a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a4: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0a7: dup
// 0a8: sipush 29679
// 0ab: ldc2_w 3075307796210919694
// 0ae: lload 2
// 0af: lxor
// 0b0: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0b8: checkcast net/minecraft/class_1707
// 0bb: astore 20
// 0bd: lload 4
// 0bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c2: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0c5: dup
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0c9: invokevirtual net/minecraft/class_437.method_25440 ()Lnet/minecraft/class_2561;
// 0cc: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 0d1: dup
// 0d2: sipush 24929
// 0d5: ldc2_w 2128514404505762712
// 0d8: lload 2
// 0d9: lxor
// 0da: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e2: astore 21
// 0e4: aload 19
// 0e6: ifnonnull 166
// 0e9: aload 21
// 0eb: checkcast java/lang/CharSequence
// 0ee: sipush 28754
// 0f1: ldc2_w 6542544744004004514
// 0f4: lload 2
// 0f5: lxor
// 0f6: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: checkcast java/lang/CharSequence
// 0fe: bipush 0
// 0ff: bipush 2
// 100: aconst_null
// 101: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 104: ifne 151
// 107: goto 114
// 10a: ldc2_w 2817992510796551734
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: aload 21
// 116: checkcast java/lang/CharSequence
// 119: sipush 15036
// 11c: ldc2_w 2249061033892339820
// 11f: lload 2
// 120: lxor
// 121: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: checkcast java/lang/CharSequence
// 129: bipush 0
// 12a: bipush 2
// 12b: aconst_null
// 12c: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 12f: aload 19
// 131: ifnonnull 374
// 134: goto 141
// 137: ldc2_w 2817992510796551734
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: ifeq 371
// 144: goto 151
// 147: ldc2_w 2817992510796551734
// 14a: lload 2
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: athrow
// 151: getstatic su/catlean/e1.A Ljava/util/List;
// 154: invokeinterface java/util/List.clear ()V 1
// 159: goto 166
// 15c: ldc2_w 2817992510796551734
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: new java/util/LinkedHashMap
// 169: dup
// 16a: invokespecial java/util/LinkedHashMap.<init> ()V
// 16d: checkcast java/util/Map
// 170: astore 22
// 172: bipush 0
// 173: istore 23
// 175: aload 20
// 177: invokevirtual net/minecraft/class_1707.method_7602 ()Lnet/minecraft/class_2371;
// 17a: invokevirtual net/minecraft/class_2371.iterator ()Ljava/util/Iterator;
// 17d: dup
// 17e: sipush 26588
// 181: ldc2_w 4341935562121887032
// 184: lload 2
// 185: lxor
// 186: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18e: astore 24
// 190: aload 24
// 192: invokeinterface java/util/Iterator.hasNext ()Z 1
// 197: ifeq 252
// 19a: aload 24
// 19c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1a1: checkcast net/minecraft/class_1799
// 1a4: astore 25
// 1a6: iload 23
// 1a8: aload 19
// 1aa: ifnonnull 253
// 1ad: aload 19
// 1af: ifnonnull 1e9
// 1b2: goto 1bf
// 1b5: ldc2_w 2817992510796551734
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: sipush 8215
// 1c2: ldc2_w 1883906476392950601
// 1c5: lload 2
// 1c6: lxor
// 1c7: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: if_icmpgt 190
// 1cf: goto 1dc
// 1d2: ldc2_w 2817992510796551734
// 1d5: lload 2
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 0
// 1dd: aload 25
// 1df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1e2: lload 6
// 1e4: aload 25
// 1e6: invokespecial su/catlean/e1.H (JLnet/minecraft/class_1799;)I
// 1e9: istore 26
// 1eb: aload 25
// 1ed: aload 19
// 1ef: ifnonnull 249
// 1f2: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 1f5: bipush 1
// 1f6: if_icmple 210
// 1f9: goto 206
// 1fc: ldc2_w 2817992510796551734
// 1ff: lload 2
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: iload 26
// 208: aload 25
// 20a: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 20d: idiv
// 20e: istore 26
// 210: nop
// 211: aload 22
// 213: aload 0
// 214: aload 25
// 216: invokespecial su/catlean/e1.c (Lnet/minecraft/class_1799;)Ljava/lang/String;
// 219: aload 22
// 21b: aload 0
// 21c: aload 25
// 21e: invokespecial su/catlean/e1.c (Lnet/minecraft/class_1799;)Ljava/lang/String;
// 221: sipush 9721
// 224: ldc2_w 632903983143333559
// 227: lload 2
// 228: lxor
// 229: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 231: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 236: checkcast java/lang/Number
// 239: invokevirtual java/lang/Number.intValue ()I
// 23c: iload 26
// 23e: invokestatic java/lang/Math.min (II)I
// 241: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 244: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 249: pop
// 24a: iinc 23 1
// 24d: aload 19
// 24f: ifnull 190
// 252: bipush 0
// 253: istore 23
// 255: aload 20
// 257: invokevirtual net/minecraft/class_1707.method_7602 ()Lnet/minecraft/class_2371;
// 25a: invokevirtual net/minecraft/class_2371.iterator ()Ljava/util/Iterator;
// 25d: dup
// 25e: sipush 4458
// 261: ldc2_w 8195314825132100501
// 264: lload 2
// 265: lxor
// 266: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26e: astore 24
// 270: aload 24
// 272: invokeinterface java/util/Iterator.hasNext ()Z 1
// 277: ifeq 371
// 27a: aload 24
// 27c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 281: checkcast net/minecraft/class_1799
// 284: astore 25
// 286: aload 19
// 288: ifnonnull 3a2
// 28b: aload 19
// 28d: ifnonnull 36c
// 290: goto 29d
// 293: ldc2_w 2817992510796551734
// 296: lload 2
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: aload 22
// 29f: aload 0
// 2a0: aload 25
// 2a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2a5: aload 25
// 2a7: invokespecial su/catlean/e1.c (Lnet/minecraft/class_1799;)Ljava/lang/String;
// 2aa: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 2af: ifnull 369
// 2b2: goto 2bf
// 2b5: ldc2_w 2817992510796551734
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: aload 0
// 2c0: lload 6
// 2c2: aload 25
// 2c4: invokespecial su/catlean/e1.H (JLnet/minecraft/class_1799;)I
// 2c7: istore 26
// 2c9: aload 25
// 2cb: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 2ce: bipush 1
// 2cf: aload 19
// 2d1: ifnonnull 2f8
// 2d4: if_icmple 2fb
// 2d7: goto 2e4
// 2da: ldc2_w 2817992510796551734
// 2dd: lload 2
// 2de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: athrow
// 2e4: iload 26
// 2e6: aload 25
// 2e8: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 2eb: goto 2f8
// 2ee: ldc2_w 2817992510796551734
// 2f1: lload 2
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: idiv
// 2f9: istore 26
// 2fb: getstatic su/catlean/e1.A Ljava/util/List;
// 2fe: new su/catlean/wo
// 301: dup
// 302: aload 25
// 304: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 307: dup
// 308: sipush 5369
// 30b: ldc2_w 2010404947006967299
// 30e: lload 2
// 30f: lxor
// 310: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 318: iload 26
// 31a: aload 22
// 31c: aload 0
// 31d: aload 25
// 31f: invokespecial su/catlean/e1.c (Lnet/minecraft/class_1799;)Ljava/lang/String;
// 322: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 327: checkcast java/lang/Integer
// 32a: dup
// 32b: ifnull 33e
// 32e: invokevirtual java/lang/Integer.intValue ()I
// 331: goto 34c
// 334: ldc2_w 2817992510796551734
// 337: lload 2
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: pop
// 33f: sipush 17412
// 342: ldc2_w 4407607268174942036
// 345: lload 2
// 346: lxor
// 347: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: iload 23
// 34e: istore 15
// 350: istore 16
// 352: istore 17
// 354: astore 18
// 356: lload 11
// 358: aload 18
// 35a: iload 17
// 35c: iload 16
// 35e: iload 15
// 360: invokespecial su/catlean/wo.<init> (JLnet/minecraft/class_1792;III)V
// 363: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 368: pop
// 369: iinc 23 1
// 36c: aload 19
// 36e: ifnull 270
// 371: getstatic su/catlean/e1.c Z
// 374: aload 19
// 376: ifnonnull 3a1
// 379: ifeq 3a2
// 37c: goto 389
// 37f: ldc2_w 2817992510796551734
// 382: lload 2
// 383: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 388: athrow
// 389: getstatic su/catlean/e1.a Lit/unimi/dsi/fastutil/ints/IntArrayList;
// 38c: invokedynamic test ()Lit/unimi/dsi/fastutil/ints/IntPredicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Z, su/catlean/e1.j (I)Z, (I)Z ]
// 391: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.removeIf (Lit/unimi/dsi/fastutil/ints/IntPredicate;)Z
// 394: goto 3a1
// 397: ldc2_w 2817992510796551734
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: pop
// 3a2: return
}

private final String c(class_1799 var1) {
String var2 = var1.method_7909().method_7876();
Intrinsics.checkNotNull(var2);
return var2;
}

@Flow
private final void g(SlotRenderEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: ldc2_w 86266769952337
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 49052146305878
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 58380764296293
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 13440537560432
// 035: lxor
// 036: lstore 9
// 038: pop2
// 039: aload 1
// 03a: invokevirtual su/catlean/api/event/events/render/SlotRenderEvent.getSlot ()Lnet/minecraft/class_1735;
// 03d: astore 12
// 03f: ldc2_w 6306889432774461464
// 042: lload 2
// 043: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: aload 1
// 049: invokevirtual su/catlean/api/event/events/render/SlotRenderEvent.getContext ()Lnet/minecraft/class_332;
// 04c: astore 13
// 04e: astore 11
// 050: lload 9
// 052: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 055: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 058: instanceof net/minecraft/class_1707
// 05b: ifeq 1c8
// 05e: lload 4
// 060: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 063: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 066: dup
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06a: invokevirtual net/minecraft/class_437.method_25440 ()Lnet/minecraft/class_2561;
// 06d: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 072: dup
// 073: sipush 24929
// 076: ldc2_w 2128620191091215117
// 079: lload 2
// 07a: lxor
// 07b: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 083: astore 14
// 085: bipush 4
// 086: istore 15
// 088: aload 14
// 08a: checkcast java/lang/CharSequence
// 08d: sipush 25937
// 090: ldc2_w 3754450263767797551
// 093: lload 2
// 094: lxor
// 095: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: checkcast java/lang/CharSequence
// 09d: bipush 0
// 09e: bipush 2
// 09f: aconst_null
// 0a0: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0a3: aload 11
// 0a5: ifnonnull 0e0
// 0a8: ifne 0e3
// 0ab: goto 0b8
// 0ae: ldc2_w 6309232027385472675
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 14
// 0ba: checkcast java/lang/CharSequence
// 0bd: sipush 19362
// 0c0: ldc2_w 7546004826936304100
// 0c3: lload 2
// 0c4: lxor
// 0c5: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: checkcast java/lang/CharSequence
// 0cd: bipush 0
// 0ce: bipush 2
// 0cf: aconst_null
// 0d0: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0d3: goto 0e0
// 0d6: ldc2_w 6309232027385472675
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: ifeq 1c8
// 0e3: getstatic su/catlean/e1.A Ljava/util/List;
// 0e6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0eb: astore 16
// 0ed: aload 16
// 0ef: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f4: ifeq 1c8
// 0f7: aload 16
// 0f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0fe: checkcast su/catlean/wo
// 101: astore 17
// 103: aload 17
// 105: invokevirtual su/catlean/wo.Y ()I
// 108: aload 12
// 10a: getfield net/minecraft/class_1735.field_7874 I
// 10d: aload 11
// 10f: ifnonnull 139
// 112: if_icmpne 0ed
// 115: aload 12
// 117: getfield net/minecraft/class_1735.field_7874 I
// 11a: aload 11
// 11c: ifnonnull 144
// 11f: sipush 17828
// 122: ldc2_w 6014456018191433314
// 125: lload 2
// 126: lxor
// 127: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: goto 139
// 12f: ldc2_w 6309232027385472675
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: if_icmpgt 0ed
// 13c: aload 12
// 13e: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 141: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 144: ifne 0ed
// 147: aload 17
// 149: invokevirtual su/catlean/wo.W ()I
// 14c: i2f
// 14d: f2d
// 14e: iload 15
// 150: i2d
// 151: invokestatic java/lang/Math.pow (DD)D
// 154: d2f
// 155: aload 17
// 157: invokevirtual su/catlean/wo.G ()I
// 15a: i2f
// 15b: f2d
// 15c: iload 15
// 15e: i2d
// 15f: invokestatic java/lang/Math.pow (DD)D
// 162: d2f
// 163: fdiv
// 164: fstore 18
// 166: aload 13
// 168: aload 12
// 16a: getfield net/minecraft/class_1735.field_7873 I
// 16d: aload 12
// 16f: getfield net/minecraft/class_1735.field_7872 I
// 172: aload 12
// 174: getfield net/minecraft/class_1735.field_7873 I
// 177: sipush 23867
// 17a: ldc2_w 8942785404002346742
// 17d: lload 2
// 17e: lxor
// 17f: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: iadd
// 185: aload 12
// 187: getfield net/minecraft/class_1735.field_7872 I
// 18a: sipush 3445
// 18d: ldc2_w 7029187130138752682
// 190: lload 2
// 191: lxor
// 192: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: iadd
// 198: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 19b: getstatic java/awt/Color.GREEN Ljava/awt/Color;
// 19e: dup
// 19f: sipush 7909
// 1a2: ldc2_w 9154599296370848915
// 1a5: lload 2
// 1a6: lxor
// 1a7: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1af: iload 6
// 1b1: i2c
// 1b2: iload 7
// 1b4: fload 18
// 1b6: iload 8
// 1b8: i2s
// 1b9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1bc: invokevirtual java/awt/Color.getRGB ()I
// 1bf: invokevirtual net/minecraft/class_332.method_25294 (IIIII)V
// 1c2: aload 11
// 1c4: ifnonnull 103
// 1c7: return
// 1c8: return
}

private final int H(long param1, class_1799 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 107329371495796
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 587362140711851960
// 012: lload 1
// 013: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: astore 6
// 01a: aload 6
// 01c: ifnonnull 04d
// 01f: aload 3
// 020: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 023: getstatic net/minecraft/class_9334.field_49632 Lnet/minecraft/class_9331;
// 026: invokeinterface net/minecraft/class_9323.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object; 2
// 02b: checkcast net/minecraft/class_9290
// 02e: dup
// 02f: ifnonnull 05b
// 032: goto 03f
// 035: ldc2_w 589634407868889347
// 038: lload 1
// 039: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: athrow
// 03f: pop
// 040: goto 04d
// 043: ldc2_w 589634407868889347
// 046: lload 1
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: sipush 12585
// 050: ldc2_w 6851662123454469457
// 053: lload 1
// 054: lxor
// 055: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: ireturn
// 05b: astore 7
// 05d: nop
// 05e: aload 6
// 060: ifnonnull 0a3
// 063: lload 4
// 065: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 068: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 06b: dup
// 06c: ifnull 0a2
// 06f: goto 07c
// 072: ldc2_w 589634407868889347
// 075: lload 1
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 07f: dup
// 080: aload 6
// 082: ifnonnull 0c3
// 085: goto 092
// 088: ldc2_w 589634407868889347
// 08b: lload 1
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: ifnonnull 0b0
// 095: goto 0a2
// 098: ldc2_w 589634407868889347
// 09b: lload 1
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: pop
// 0a3: sipush 12334
// 0a6: ldc2_w 5160562543284930031
// 0a9: lload 1
// 0aa: lxor
// 0ab: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: checkcast java/lang/CharSequence
// 0b3: sipush 13824
// 0b6: ldc2_w 8280821592051565506
// 0b9: lload 1
// 0ba: lxor
// 0bb: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: checkcast java/lang/CharSequence
// 0c3: bipush 0
// 0c4: bipush 2
// 0c5: aconst_null
// 0c6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0c9: ifeq 242
// 0cc: aload 7
// 0ce: invokevirtual net/minecraft/class_9290.comp_2400 ()Ljava/util/List;
// 0d1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0d6: astore 8
// 0d8: aload 8
// 0da: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0df: ifeq 2f1
// 0e2: aload 8
// 0e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e9: dup
// 0ea: sipush 15933
// 0ed: ldc2_w 8066587337111227389
// 0f0: lload 1
// 0f1: lxor
// 0f2: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fa: checkcast net/minecraft/class_2561
// 0fd: astore 9
// 0ff: aload 9
// 101: aload 6
// 103: ifnonnull 147
// 106: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 10b: dup
// 10c: sipush 11310
// 10f: ldc2_w 8558298001179073015
// 112: lload 1
// 113: lxor
// 114: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11c: checkcast java/lang/CharSequence
// 11f: sipush 15646
// 122: ldc2_w 1516495250360715514
// 125: lload 1
// 126: lxor
// 127: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: checkcast java/lang/CharSequence
// 12f: bipush 0
// 130: bipush 2
// 131: aconst_null
// 132: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 135: goto 142
// 138: ldc2_w 589634407868889347
// 13b: lload 1
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: ifeq 0d8
// 145: aload 9
// 147: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
// 14c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 151: astore 10
// 153: aload 10
// 155: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15a: ifeq 0d8
// 15d: aload 10
// 15f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 164: dup
// 165: sipush 4736
// 168: ldc2_w 5687154156286338891
// 16b: lload 1
// 16c: lxor
// 16d: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 175: checkcast net/minecraft/class_2561
// 178: astore 11
// 17a: aload 11
// 17c: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 181: dup
// 182: sipush 24929
// 185: ldc2_w 2128593550726403245
// 188: lload 1
// 189: lxor
// 18a: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 192: astore 12
// 194: aload 12
// 196: checkcast java/lang/CharSequence
// 199: astore 13
// 19b: bipush 0
// 19c: istore 14
// 19e: bipush 0
// 19f: istore 15
// 1a1: bipush 0
// 1a2: lload 1
// 1a3: lconst_0
// 1a4: lcmp
// 1a5: iflt 15a
// 1a8: aload 6
// 1aa: ifnonnull 142
// 1ad: lload 1
// 1ae: lconst_0
// 1af: lcmp
// 1b0: iflt 15a
// 1b3: istore 16
// 1b5: iload 16
// 1b7: aload 13
// 1b9: invokeinterface java/lang/CharSequence.length ()I 1
// 1be: if_icmpge 211
// 1c1: aload 13
// 1c3: iload 16
// 1c5: invokeinterface java/lang/CharSequence.charAt (I)C 2
// 1ca: istore 17
// 1cc: iload 17
// 1ce: istore 18
// 1d0: bipush 0
// 1d1: istore 19
// 1d3: aload 6
// 1d5: lload 1
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: ifle 20e
// 1db: ifnonnull 20c
// 1de: iload 18
// 1e0: invokestatic java/lang/Character.isDigit (C)Z
// 1e3: nop
// 1e4: aload 6
// 1e6: ifnonnull 219
// 1e9: goto 1f6
// 1ec: ldc2_w 589634407868889347
// 1ef: lload 1
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: ifeq 209
// 1f9: goto 206
// 1fc: ldc2_w 589634407868889347
// 1ff: lload 1
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: iinc 15 1
// 209: iinc 16 1
// 20c: aload 6
// 20e: ifnull 1b5
// 211: iload 15
// 213: lload 1
// 214: lconst_0
// 215: lcmp
// 216: ifle 1ca
// 219: bipush 1
// 21a: if_icmple 153
// 21d: aload 12
// 21f: ldc " "
// 221: ldc ""
// 223: bipush 0
// 224: bipush 4
// 225: aconst_null
// 226: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 229: ldc "¤"
// 22b: ldc ""
// 22d: bipush 0
// 22e: bipush 4
// 22f: aconst_null
// 230: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 233: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 236: aload 6
// 238: lload 1
// 239: lconst_0
// 23a: lcmp
// 23b: iflt 1aa
// 23e: ifnonnull 1ad
// 241: ireturn
// 242: aload 7
// 244: invokevirtual net/minecraft/class_9290.comp_2400 ()Ljava/util/List;
// 247: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 24c: astore 8
// 24e: aload 8
// 250: invokeinterface java/util/Iterator.hasNext ()Z 1
// 255: ifeq 2f1
// 258: aload 8
// 25a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 25f: dup
// 260: sipush 4736
// 263: ldc2_w 5687154156286338891
// 266: lload 1
// 267: lxor
// 268: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 270: checkcast net/minecraft/class_2561
// 273: astore 9
// 275: aload 9
// 277: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 27c: dup
// 27d: sipush 24929
// 280: ldc2_w 2128593550726403245
// 283: lload 1
// 284: lxor
// 285: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 28d: checkcast java/lang/CharSequence
// 290: sipush 21353
// 293: ldc2_w 3101497396439819936
// 296: lload 1
// 297: lxor
// 298: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: checkcast java/lang/CharSequence
// 2a0: bipush 0
// 2a1: bipush 2
// 2a2: aconst_null
// 2a3: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 2a6: ifeq 24e
// 2a9: aload 9
// 2ab: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 2b0: dup
// 2b1: sipush 24929
// 2b4: ldc2_w 2128593550726403245
// 2b7: lload 1
// 2b8: lxor
// 2b9: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c1: sipush 4556
// 2c4: ldc2_w 3852103294233371678
// 2c7: lload 1
// 2c8: lxor
// 2c9: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: ldc ""
// 2d0: bipush 0
// 2d1: bipush 4
// 2d2: aconst_null
// 2d3: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 2d6: ldc ","
// 2d8: ldc ""
// 2da: bipush 0
// 2db: bipush 4
// 2dc: aconst_null
// 2dd: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 2e0: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 2e3: lload 1
// 2e4: lconst_0
// 2e5: lcmp
// 2e6: iflt 2a6
// 2e9: aload 6
// 2eb: ifnonnull 2a6
// 2ee: ireturn
// 2ef: astore 8
// 2f1: sipush 28125
// 2f4: ldc2_w 1027309727645026738
// 2f7: lload 1
// 2f8: lxor
// 2f9: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: ireturn
}

private final List h(class_2338 param1, long param2, int param4, int param5, byte param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: bipush 8
// 003: lshl
// 004: iload 6
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 56
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/e1.b J
// 011: lxor
// 012: lstore 7
// 014: ldc2_w 6234278435254946074
// 017: lload 7
// 019: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: new java/util/ArrayList
// 021: dup
// 022: invokespecial java/util/ArrayList.<init> ()V
// 025: checkcast java/util/List
// 028: astore 10
// 02a: aload 1
// 02b: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 02e: iload 4
// 030: isub
// 031: istore 11
// 033: astore 9
// 035: aload 1
// 036: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 039: iload 4
// 03b: iadd
// 03c: istore 12
// 03e: iload 11
// 040: iload 12
// 042: aload 9
// 044: ifnonnull 06c
// 047: if_icmpgt 160
// 04a: goto 058
// 04d: ldc2_w 6236619804254676897
// 050: lload 7
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 1
// 059: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 05c: iload 4
// 05e: goto 06c
// 061: ldc2_w 6236619804254676897
// 064: lload 7
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: isub
// 06d: istore 13
// 06f: aload 1
// 070: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 073: iload 4
// 075: iadd
// 076: istore 14
// 078: iload 13
// 07a: iload 14
// 07c: lload 2
// 07d: lconst_0
// 07e: lcmp
// 07f: ifle 08b
// 082: if_icmpgt 13d
// 085: aload 1
// 086: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 089: iload 5
// 08b: isub
// 08c: istore 15
// 08e: aload 1
// 08f: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 092: iload 5
// 094: iadd
// 095: istore 16
// 097: iload 15
// 099: iload 16
// 09b: aload 9
// 09d: ifnonnull 141
// 0a0: if_icmpgt 101
// 0a3: aload 10
// 0a5: new net/minecraft/class_2338
// 0a8: dup
// 0a9: iload 11
// 0ab: iload 15
// 0ad: iload 13
// 0af: invokespecial net/minecraft/class_2338.<init> (III)V
// 0b2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0b7: pop
// 0b8: iload 15
// 0ba: iload 16
// 0bc: aload 9
// 0be: ifnonnull 105
// 0c1: goto 0cf
// 0c4: ldc2_w 6236619804254676897
// 0c7: lload 7
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: if_icmpeq 101
// 0d2: iinc 15 1
// 0d5: aload 9
// 0d7: ifnonnull 13d
// 0da: goto 0e8
// 0dd: ldc2_w 6236619804254676897
// 0e0: lload 7
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 9
// 0ea: ifnull 0a3
// 0ed: lload 2
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: ifle 101
// 0f3: goto 101
// 0f6: ldc2_w 6236619804254676897
// 0f9: lload 7
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: iload 13
// 103: iload 14
// 105: lload 2
// 106: lconst_0
// 107: lcmp
// 108: ifle 141
// 10b: aload 9
// 10d: ifnonnull 141
// 110: if_icmpeq 13d
// 113: goto 121
// 116: ldc2_w 6236619804254676897
// 119: lload 7
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: iinc 13 1
// 124: aload 9
// 126: ifnull 085
// 129: lload 2
// 12a: lconst_0
// 12b: lcmp
// 12c: ifle 101
// 12f: goto 13d
// 132: ldc2_w 6236619804254676897
// 135: lload 7
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: iload 11
// 13f: iload 12
// 141: if_icmpeq 160
// 144: iinc 11 1
// 147: aload 9
// 149: ifnull 058
// 14c: lload 2
// 14d: lconst_0
// 14e: lcmp
// 14f: iflt 078
// 152: goto 160
// 155: ldc2_w 6236619804254676897
// 158: lload 7
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: aload 10
// 162: areturn
}

private static final void y(ReceivePacket var0) {
long var1 = b ^ 41125782328802L;
long var3 = var1 ^ 44577544882254L;
List var10000 = o;
class_243 var10003 = new class_243(
((class_2767)var0.getPacket()).method_11890(), ((class_2767)var0.getPacket()).method_11889(), ((class_2767)var0.getPacket()).method_11893()
);
long var10004 = zf.A() + j;
class_1792 var10005 = class_1802.field_22021;
Intrinsics.checkNotNullExpressionValue(class_1802.field_22021, b<"p">(27048, 6423069045622675558L ^ var1));
var10000.add(new zs(var10003, var10004, var10005, var3));
}

private static final void O(class_2338 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e1.b J
// 003: ldc2_w 14577331154804
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 59088186407017
// 00d: lxor
// 00e: dup2
// 00f: bipush 8
// 011: lushr
// 012: lstore 3
// 013: dup2
// 014: bipush 56
// 016: lshl
// 017: bipush 56
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 748930396888
// 022: lxor
// 023: lstore 6
// 025: dup2
// 026: ldc2_w 84773272967922
// 029: lxor
// 02a: lstore 8
// 02c: pop2
// 02d: ldc2_w -5286150976935876291
// 030: lload 1
// 031: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: getstatic su/catlean/e1.Y Lsu/catlean/e1;
// 039: aload 0
// 03a: lload 3
// 03b: bipush 4
// 03c: bipush 4
// 03d: iload 5
// 03f: i2b
// 040: invokespecial su/catlean/e1.h (Lnet/minecraft/class_2338;JIIB)Ljava/util/List;
// 043: checkcast java/lang/Iterable
// 046: astore 12
// 048: nop
// 049: astore 10
// 04b: bipush 0
// 04c: istore 13
// 04e: aload 12
// 050: astore 14
// 052: new java/util/ArrayList
// 055: dup
// 056: invokespecial java/util/ArrayList.<init> ()V
// 059: checkcast java/util/Collection
// 05c: astore 15
// 05e: bipush 0
// 05f: istore 16
// 061: aload 14
// 063: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 068: astore 18
// 06a: aload 18
// 06c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 071: ifeq 10a
// 074: aload 18
// 076: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 07b: astore 19
// 07d: aload 19
// 07f: checkcast net/minecraft/class_2338
// 082: astore 21
// 084: bipush 0
// 085: istore 22
// 087: aload 21
// 089: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 08c: aload 0
// 08d: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 090: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 093: ldc2_w 2.0
// 096: dcmpl
// 097: aload 10
// 099: ifnonnull 117
// 09c: aload 10
// 09e: ifnonnull 0de
// 0a1: goto 0ae
// 0a4: ldc2_w -5283947019589859450
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: ifle 0f7
// 0b1: goto 0be
// 0b4: ldc2_w -5283947019589859450
// 0b7: lload 1
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: lload 8
// 0c0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c3: aload 21
// 0c5: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0c8: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0cb: getstatic net/minecraft/class_2246.field_10445 Lnet/minecraft/class_2248;
// 0ce: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d1: goto 0de
// 0d4: ldc2_w -5283947019589859450
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 10
// 0e0: ifnonnull 0f4
// 0e3: ifeq 0f7
// 0e6: goto 0f3
// 0e9: ldc2_w -5283947019589859450
// 0ec: lload 1
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: bipush 1
// 0f4: goto 0f8
// 0f7: bipush 0
// 0f8: ifeq 06a
// 0fb: aload 15
// 0fd: aload 19
// 0ff: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 104: pop
// 105: aload 10
// 107: ifnull 06a
// 10a: aload 15
// 10c: checkcast java/util/List
// 10f: nop
// 110: checkcast java/lang/Iterable
// 113: astore 12
// 115: nop
// 116: bipush 0
// 117: istore 13
// 119: aload 12
// 11b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 120: astore 14
// 122: aload 14
// 124: invokeinterface java/util/Iterator.hasNext ()Z 1
// 129: aload 10
// 12b: ifnonnull 16e
// 12e: ifne 14c
// 131: goto 13e
// 134: ldc2_w -5283947019589859450
// 137: lload 1
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: aconst_null
// 13f: goto 1dc
// 142: ldc2_w -5283947019589859450
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 14
// 14e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 153: astore 15
// 155: aload 14
// 157: aload 10
// 159: ifnonnull 182
// 15c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 161: goto 16e
// 164: ldc2_w -5283947019589859450
// 167: lload 1
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: ifne 180
// 171: aload 15
// 173: goto 1dc
// 176: ldc2_w -5283947019589859450
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 15
// 182: checkcast net/minecraft/class_2338
// 185: astore 16
// 187: bipush 0
// 188: istore 18
// 18a: aload 16
// 18c: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 18f: aload 0
// 190: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 193: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 196: dstore 16
// 198: aload 14
// 19a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 19f: astore 18
// 1a1: aload 18
// 1a3: checkcast net/minecraft/class_2338
// 1a6: astore 19
// 1a8: bipush 0
// 1a9: istore 21
// 1ab: aload 19
// 1ad: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1b0: aload 0
// 1b1: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1b4: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1b7: dstore 19
// 1b9: dload 16
// 1bb: dload 19
// 1bd: invokestatic java/lang/Double.compare (DD)I
// 1c0: ifle 1cb
// 1c3: aload 18
// 1c5: astore 15
// 1c7: dload 19
// 1c9: dstore 16
// 1cb: aload 14
// 1cd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d2: ifne 198
// 1d5: aload 10
// 1d7: ifnonnull 1c7
// 1da: aload 15
// 1dc: checkcast net/minecraft/class_2338
// 1df: astore 11
// 1e1: aload 11
// 1e3: ifnull 3a3
// 1e6: getstatic su/catlean/e1.Y Lsu/catlean/e1;
// 1e9: aload 11
// 1eb: lload 3
// 1ec: bipush 1
// 1ed: bipush 0
// 1ee: iload 5
// 1f0: i2b
// 1f1: invokespecial su/catlean/e1.h (Lnet/minecraft/class_2338;JIIB)Ljava/util/List;
// 1f4: checkcast java/lang/Iterable
// 1f7: astore 13
// 1f9: bipush 0
// 1fa: istore 14
// 1fc: aload 13
// 1fe: instanceof java/util/Collection
// 201: aload 10
// 203: ifnonnull 251
// 206: ifeq 250
// 209: goto 216
// 20c: ldc2_w -5283947019589859450
// 20f: lload 1
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: aload 13
// 218: checkcast java/util/Collection
// 21b: invokeinterface java/util/Collection.isEmpty ()Z 1
// 220: aload 10
// 222: ifnonnull 251
// 225: goto 232
// 228: ldc2_w -5283947019589859450
// 22b: lload 1
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: ifeq 250
// 235: goto 242
// 238: ldc2_w -5283947019589859450
// 23b: lload 1
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: bipush 0
// 243: goto 2d7
// 246: ldc2_w -5283947019589859450
// 249: lload 1
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: bipush 0
// 251: istore 15
// 253: aload 13
// 255: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 25a: astore 16
// 25c: aload 16
// 25e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 263: ifeq 2d5
// 266: aload 16
// 268: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 26d: astore 18
// 26f: aload 18
// 271: checkcast net/minecraft/class_2338
// 274: astore 19
// 276: bipush 0
// 277: istore 21
// 279: lload 8
// 27b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 27e: aload 19
// 280: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 283: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 286: getstatic net/minecraft/class_2246.field_10115 Lnet/minecraft/class_2248;
// 289: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 28c: aload 10
// 28e: ifnonnull 2d7
// 291: aload 10
// 293: ifnonnull 2ca
// 296: goto 2a3
// 299: ldc2_w -5283947019589859450
// 29c: lload 1
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: ifeq 25c
// 2a6: goto 2b3
// 2a9: ldc2_w -5283947019589859450
// 2ac: lload 1
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: iinc 15 1
// 2b6: aload 10
// 2b8: ifnonnull 2d0
// 2bb: iload 15
// 2bd: goto 2ca
// 2c0: ldc2_w -5283947019589859450
// 2c3: lload 1
// 2c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: athrow
// 2ca: ifge 25c
// 2cd: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
// 2d0: aload 10
// 2d2: ifnull 25c
// 2d5: iload 15
// 2d7: istore 12
// 2d9: iload 12
// 2db: aload 10
// 2dd: ifnonnull 317
// 2e0: sipush 30636
// 2e3: ldc2_w 3763852790629002574
// 2e6: lload 1
// 2e7: lxor
// 2e8: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: if_icmpne 31a
// 2f0: goto 2fd
// 2f3: ldc2_w -5283947019589859450
// 2f6: lload 1
// 2f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fc: athrow
// 2fd: sipush 5077
// 300: ldc2_w 3335566723365308720
// 303: lload 1
// 304: lxor
// 305: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: goto 317
// 30d: ldc2_w -5283947019589859450
// 310: lload 1
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: goto 327
// 31a: sipush 7007
// 31d: ldc2_w 2831526433985036723
// 320: lload 1
// 321: lxor
// 322: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: istore 13
// 329: getstatic su/catlean/e1.o Ljava/util/List;
// 32c: new su/catlean/zs
// 32f: dup
// 330: aload 11
// 332: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 335: dconst_0
// 336: iload 12
// 338: sipush 13691
// 33b: ldc2_w 4036751467985940355
// 33e: lload 1
// 33f: lxor
// 340: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: if_icmpne 358
// 348: ldc2_w -0.5
// 34b: goto 359
// 34e: ldc2_w -5283947019589859450
// 351: lload 1
// 352: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: athrow
// 358: dconst_0
// 359: dconst_0
// 35a: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 35d: dup
// 35e: sipush 14275
// 361: ldc2_w 4508857116244278429
// 364: lload 1
// 365: lxor
// 366: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 36e: invokestatic su/catlean/zf.A ()J
// 371: iload 13
// 373: i2l
// 374: ladd
// 375: sipush 16785
// 378: ldc2_w 4956322025420184430
// 37b: lload 1
// 37c: lxor
// 37d: invokedynamic s (IJ)I bsm=su/catlean/e1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: i2l
// 383: lsub
// 384: getstatic net/minecraft/class_1802.field_8551 Lnet/minecraft/class_1792;
// 387: dup
// 388: sipush 9514
// 38b: ldc2_w 2910069452054916684
// 38e: lload 1
// 38f: lxor
// 390: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/e1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 395: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 398: lload 6
// 39a: invokespecial su/catlean/zs.<init> (Lnet/minecraft/class_243;JLnet/minecraft/class_1792;J)V
// 39d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 3a2: pop
// 3a3: return
}

private static final boolean Q(zs var0) {
long var1 = b ^ 15923714933178L;
String var10000 = vm.a<"Å">(-2851391507005618189L, var1);
Intrinsics.checkNotNullParameter(var0, b<"p">(10408, 7801197314176388397L ^ var1));
String var3 = var10000;

try {
long var6;
int var5 = (var6 = zf.A() - var0.s() - 0L) == 0L ? 0 : (var6 < 0L ? -1 : 1);
if (var3 != null) {
return (boolean)var5;
}

if (var5 >= 0) {
return (boolean)1;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -2853693266662610616L, var1);
}

return (boolean)0;
}

private static final boolean M(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean j(int param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/e1.b J
// 03: ldc2_w 108291585533949
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 37547762487931
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w 9091288314954047924
// 13: lload 1
// 14: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: lload 3
// 1a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d: iload 0
// 1e: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
// 21: astore 6
// 23: astore 5
// 25: aload 5
// 27: ifnonnull d6
// 2a: aload 6
// 2c: ifnull be
// 2f: goto 3c
// 32: ldc2_w 9089048076873961231
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: aload 6
// 3e: instanceof net/minecraft/class_1657
// 41: aload 5
// 43: ifnonnull d7
// 46: goto 53
// 49: ldc2_w 9089048076873961231
// 4c: lload 1
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: ifeq be
// 56: goto 63
// 59: ldc2_w 9089048076873961231
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 6
// 65: checkcast net/minecraft/class_1657
// 68: invokevirtual net/minecraft/class_1657.method_5805 ()Z
// 6b: aload 5
// 6d: ifnonnull d7
// 70: goto 7d
// 73: ldc2_w 9089048076873961231
// 76: lload 1
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: ifeq be
// 80: goto 8d
// 83: ldc2_w 9089048076873961231
// 86: lload 1
// 87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: athrow
// 8d: lload 3
// 8e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 91: aload 6
// 93: checkcast net/minecraft/class_1657
// 96: invokevirtual net/minecraft/class_1657.method_24515 ()Lnet/minecraft/class_2338;
// 99: invokevirtual net/minecraft/class_638.method_8477 (Lnet/minecraft/class_2338;)Z
// 9c: aload 5
// 9e: ifnonnull d9
// a1: goto ae
// a4: ldc2_w 9089048076873961231
// a7: lload 1
// a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad: athrow
// ae: ifne d8
// b1: goto be
// b4: ldc2_w 9089048076873961231
// b7: lload 1
// b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bd: athrow
// be: lload 3
// bf: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// c2: iload 0
// c3: getstatic net/minecraft/class_1297$class_5529.field_26998 Lnet/minecraft/class_1297$class_5529;
// c6: invokevirtual net/minecraft/class_638.method_2945 (ILnet/minecraft/class_1297$class_5529;)V
// c9: goto d6
// cc: ldc2_w 9089048076873961231
// cf: lload 1
// d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: athrow
// d6: bipush 1
// d7: ireturn
// d8: bipush 0
// d9: ireturn
}

static {
long var25 = b ^ 120281729835595L;
long var27 = var25 ^ 44787552779479L;
long var29 = var25 ^ 28071470923443L;
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[37];
int var21 = 0;
String var20 = "(¦\u001c\u0086Àü¥\u008d¨%\b\u008eè²em½\u0095Tü\u0084F\u00985Ã\t'³\u0084[H_¾\u0015$¨ä~û\u001aU¸\u007fã`ÑiÅ08\u0095ØÝåæ`fR\r³Ë¡ð6¬ ¦B«Ï¸qê\u008f«\u0007YØseæ@7\u000b(\u0086á9\u0011\u008dþ\u0007\u0098\u008aé*Õ\u0018zOA/\u0082õ%þ«\u008b\"\bñón·\u001b8\f5®\u0082\u0097 0¸u\u0086&]n!KÆèÅ\u009e\u0012IF\u0010\\v2\u008b\u0087u\u0099.]å´\tÞL\u008e)Ó\u0011so\u000eDß\u0091á1ey1nÙ¶ pU;ü/\u008bó;\u0087¼èå¼\u0081\u0006\u008c//\u0011¥\u008bDx\u0088\u0017^ë\u000ec¤\u0082\u007f\u0018\u008eÿå£eS\t4\u00935Í³\u008c\t¿\u0012N(nÖY¤}y ÇW%+¢Ù¼-r\u0099¯1ð=®kB{`²,\u0013²SÌÆÉÑYC¿}\u00184Ì)o.<P\u0004\u008e\u0012\u000f\u009eHX°§ä8ÎªÃ\u0013\u0090p s9^Z@Zy|\u009f;R\u000e\u0081\u0011SÆt\u0095\u0015°\u0080\u001f\u0012ÑËú\u008f\tsè#\u0084\u0010ÿ/\u001efðp,æõI^×\u000eÓÀY Ë¸vÅg3Ä9Ù¼p!u8³\u008c×Ïµ\u0094h6ÆR±ò~ZR@hÝ á\u0086«!¬ûw\u0081º/jÇ\u0019ï¿aLEñv%]ÓÁõ/FH\u0000\u009bãü \u0004T\u008f|\u0011ôªéY1ï>ý·\u0007\u009d)\u009btý²¯\u0087\u0003Ãq\u0007(\u0096L\u0087ð V\u0015~øô\u001d2¨ÎE¾l\u0097N8¶\n\u0084\t\u00067ì´¶êÅ\u0019\u0093\u009awuU\u0010ÜDÊªñT\u0098\u0016\u0000\u0095¤a¨ñ~N E-\u000bÆ²i\u0001îÆð\\oýgåÖüÀ:][G7Í©\u0007pwËêÇ\u009d Êc¦Ü\u000bñ\u007f\u0087{\u0019d\\nE\u009eë\u0088\u009cË<\u0005ï¬Õ[ðG1¿iG¹\u0010¨×Ö7=Ã°Ì\u0097wiÂÂÐ\u007f\u009d\u0018¨\u0006Þ\u007f±Ð\u009dx\u0093 Z!SÕÆwfÍ\f\u0099\u0002\u0099½1\u0080\u0003î .w\u009d\u009bS^F\u008bqp\u0099Áø`Epi¡1\u0080);5áp\u0003tàïòë´\u0094\u00134\u0081\u0002S+>\u001aµ\u008báûòx½£<\u009cp¼ÃÑí\u0004dÛ`_\"W\u0083\u009e0ÑHÁTÊD;+c|Á«5iº@d¶ã\u0003,ò7u2Í\u001f\u0089ó¼\u0088hWÊµ2«Ñ1ah\u0080Úq\u0090ÿ¤õâØ\u0002ØO\r\u0088c\u001c3M\u0018²\u0016\u008cÞ\u0012Kc\u000f§\u001bJJ\u008e\u001cö\u0092¤]\u0011\u008fA\"\u0005ö }õêgõ\u001d6\u0093x)RCZ\u0000bæìÍ²õ¢d+>\nKÝôÀ÷û{\u0018¼eôUQP\u0083º¡Í\u0085\u0015e¸VÎÖ\u009cNÝ|i\u001eÃ\u0010%_\f$\u009c(¾Æ\u0019DÐ@¬DÇ{\u0018\u0090ÞH\u0083Ûiº\u0091à3ÁãÞÞy:\u0087èÍó\u009câæ\u00ad \u000e4\t}&\u001cTZû´-_ð\u001cýLÆ8æ\u0089òñ\u008d80ì4\u0081SFPÌ Õ>¯\u0003`Ä\u001cEeò¯\u008b\u001dºÊ\u001a\u0001$z}ã\"\u0088²\u0081&¶¡\u0093\u0010ì£ \u008c\u0013Õdl¯\u0089®no£éu\u008e\u0093å±°6Ä+SLIG\u0083Â;ê\u009a·Â\u0018\u008a5/`\u001dÖ`F¨,Íf\u009b\u0004\u008dù@1z)\u0097DÆê \f´WA±õ.\u0016\u009dQßd\u009eô\u001b\u001eúXðl\u0097þªó-\u001fýòí\u0011=\u0015 º$ë\u000f\u0095Ö$\u009d)\flDÿ:µ '\u001f\u0001û\u0017B\u0096îÊ¹Í\u0080AËFn DÖB\u000e&DU\u0091ã¬:\u008eù\u00ad¶Ç\u0018·ª\u0087gBõ½Ò\u001c9)¯\u0086 Ò¸£HÎîO\u001a< Ë~aK:\\<Ú\u0012½ª-\u001c±r´\u0096ÔOÙ\u0001\u000få³Ô\u008a\u0094! \u0082/\u0003É%i8\u001f\n\u0006jê&\u0084¢Q\u0006\u000fX\u0002ìi\u0082ýòg¹ý\u009a?Î-×\u008a½\u0015ÄÌø\\\u0092]Â\u001c¬yÑÎµ\u001b\u008a\u0085wf1\u008a+$Cy\u0014M2E½O\u0094?\tÛYÄæ¡Êç\u0085®\u0015\u00056\u0000ä?\u0096\u0001[#dÑ¡Iú\u0003qÌk\u000b:Á@\u008f\u0097ß{^\u00970\u0084\u0007½\u0010xd\u0010\":Z\t\u00033\u0001Ä\u007fVæ}>\u000e^\n\u0016\u009c\u00164Á>¦óu\u001dO3£èD× Ó\u008c\u0089h\u0014ÝÕòÛzì\u009bf²ü\u008bZ\u008fóúx ¿õ\u0001!|£]\u0099\u009d- b2eü·éÇ\u0005ñ9¬ï¼Wd\u0094åh]\u0004\u0082³VGé7\u009c9_\u0018&\u001d";
int var22 = "(¦\u001c\u0086Àü¥\u008d¨%\b\u008eè²em½\u0095Tü\u0084F\u00985Ã\t'³\u0084[H_¾\u0015$¨ä~û\u001aU¸\u007fã`ÑiÅ08\u0095ØÝåæ`fR\r³Ë¡ð6¬ ¦B«Ï¸qê\u008f«\u0007YØseæ@7\u000b(\u0086á9\u0011\u008dþ\u0007\u0098\u008aé*Õ\u0018zOA/\u0082õ%þ«\u008b\"\bñón·\u001b8\f5®\u0082\u0097 0¸u\u0086&]n!KÆèÅ\u009e\u0012IF\u0010\\v2\u008b\u0087u\u0099.]å´\tÞL\u008e)Ó\u0011so\u000eDß\u0091á1ey1nÙ¶ pU;ü/\u008bó;\u0087¼èå¼\u0081\u0006\u008c//\u0011¥\u008bDx\u0088\u0017^ë\u000ec¤\u0082\u007f\u0018\u008eÿå£eS\t4\u00935Í³\u008c\t¿\u0012N(nÖY¤}y ÇW%+¢Ù¼-r\u0099¯1ð=®kB{`²,\u0013²SÌÆÉÑYC¿}\u00184Ì)o.<P\u0004\u008e\u0012\u000f\u009eHX°§ä8ÎªÃ\u0013\u0090p s9^Z@Zy|\u009f;R\u000e\u0081\u0011SÆt\u0095\u0015°\u0080\u001f\u0012ÑËú\u008f\tsè#\u0084\u0010ÿ/\u001efðp,æõI^×\u000eÓÀY Ë¸vÅg3Ä9Ù¼p!u8³\u008c×Ïµ\u0094h6ÆR±ò~ZR@hÝ á\u0086«!¬ûw\u0081º/jÇ\u0019ï¿aLEñv%]ÓÁõ/FH\u0000\u009bãü \u0004T\u008f|\u0011ôªéY1ï>ý·\u0007\u009d)\u009btý²¯\u0087\u0003Ãq\u0007(\u0096L\u0087ð V\u0015~øô\u001d2¨ÎE¾l\u0097N8¶\n\u0084\t\u00067ì´¶êÅ\u0019\u0093\u009awuU\u0010ÜDÊªñT\u0098\u0016\u0000\u0095¤a¨ñ~N E-\u000bÆ²i\u0001îÆð\\oýgåÖüÀ:][G7Í©\u0007pwËêÇ\u009d Êc¦Ü\u000bñ\u007f\u0087{\u0019d\\nE\u009eë\u0088\u009cË<\u0005ï¬Õ[ðG1¿iG¹\u0010¨×Ö7=Ã°Ì\u0097wiÂÂÐ\u007f\u009d\u0018¨\u0006Þ\u007f±Ð\u009dx\u0093 Z!SÕÆwfÍ\f\u0099\u0002\u0099½1\u0080\u0003î .w\u009d\u009bS^F\u008bqp\u0099Áø`Epi¡1\u0080);5áp\u0003tàïòë´\u0094\u00134\u0081\u0002S+>\u001aµ\u008báûòx½£<\u009cp¼ÃÑí\u0004dÛ`_\"W\u0083\u009e0ÑHÁTÊD;+c|Á«5iº@d¶ã\u0003,ò7u2Í\u001f\u0089ó¼\u0088hWÊµ2«Ñ1ah\u0080Úq\u0090ÿ¤õâØ\u0002ØO\r\u0088c\u001c3M\u0018²\u0016\u008cÞ\u0012Kc\u000f§\u001bJJ\u008e\u001cö\u0092¤]\u0011\u008fA\"\u0005ö }õêgõ\u001d6\u0093x)RCZ\u0000bæìÍ²õ¢d+>\nKÝôÀ÷û{\u0018¼eôUQP\u0083º¡Í\u0085\u0015e¸VÎÖ\u009cNÝ|i\u001eÃ\u0010%_\f$\u009c(¾Æ\u0019DÐ@¬DÇ{\u0018\u0090ÞH\u0083Ûiº\u0091à3ÁãÞÞy:\u0087èÍó\u009câæ\u00ad \u000e4\t}&\u001cTZû´-_ð\u001cýLÆ8æ\u0089òñ\u008d80ì4\u0081SFPÌ Õ>¯\u0003`Ä\u001cEeò¯\u008b\u001dºÊ\u001a\u0001$z}ã\"\u0088²\u0081&¶¡\u0093\u0010ì£ \u008c\u0013Õdl¯\u0089®no£éu\u008e\u0093å±°6Ä+SLIG\u0083Â;ê\u009a·Â\u0018\u008a5/`\u001dÖ`F¨,Íf\u009b\u0004\u008dù@1z)\u0097DÆê \f´WA±õ.\u0016\u009dQßd\u009eô\u001b\u001eúXðl\u0097þªó-\u001fýòí\u0011=\u0015 º$ë\u000f\u0095Ö$\u009d)\flDÿ:µ '\u001f\u0001û\u0017B\u0096îÊ¹Í\u0080AËFn DÖB\u000e&DU\u0091ã¬:\u008eù\u00ad¶Ç\u0018·ª\u0087gBõ½Ò\u001c9)¯\u0086 Ò¸£HÎîO\u001a< Ë~aK:\\<Ú\u0012½ª-\u001c±r´\u0096ÔOÙ\u0001\u000få³Ô\u008a\u0094! \u0082/\u0003É%i8\u001f\n\u0006jê&\u0084¢Q\u0006\u000fX\u0002ìi\u0082ýòg¹ý\u009a?Î-×\u008a½\u0015ÄÌø\\\u0092]Â\u001c¬yÑÎµ\u001b\u008a\u0085wf1\u008a+$Cy\u0014M2E½O\u0094?\tÛYÄæ¡Êç\u0085®\u0015\u00056\u0000ä?\u0096\u0001[#dÑ¡Iú\u0003qÌk\u000b:Á@\u008f\u0097ß{^\u00970\u0084\u0007½\u0010xd\u0010\":Z\t\u00033\u0001Ä\u007fVæ}>\u000e^\n\u0016\u009c\u00164Á>¦óu\u001dO3£èD× Ó\u008c\u0089h\u0014ÝÕòÛzì\u009bf²ü\u008bZ\u008fóúx ¿õ\u0001!|£]\u0099\u009d- b2eü·éÇ\u0005ñ9¬ï¼Wd\u0094åh]\u0004\u0082³VGé7\u009c9_\u0018&\u001d"
.length();
char var19 = '0';
int var34 = -1;

label64:
while (true) {
String var35 = var20.substring(++var34, var34 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var35.getBytes("ISO-8859-1"));
String var48 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var48;
if ((var34 += var19) >= var22) {
d = var23;
e = new String[37];
i = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[23];
int var8 = 0;
String var9 = "ç$Ñÿ\u009e\u0007p\u0092 »f8.\u0095\u00ad\u0080Ê\u0081Íc\u0091d\u009fDoÈ\u0019±·}`¢Î¾\u009d4¿êÓ(â\u0093k\u0003\u0092\u0011±DÆÒÍ\u001cÌ\u0099Rk¡\u001bç\u0098YR'1Ï\u009dEÅ\u009b\u0014Yû?\u008f\u0010ÅN\u0017-¤Ê`}\u00818ê\u0094p5Ç:\u0097\u0018\nÌJHHõ\\-ÇîF\u001aæ\u0088fo´,Ç\nòÈs£ÎF×³Þ\u000f\b¼ã\u0086(ù\u001dØ÷\n\u0091y\u000f\u0091z¯ù·ºV \u0000Â\u009fL¶A»Î\u001bÜ\u0006 ëF\u0012\u001fq\u0015WÇAÈ%¬";
int var10 = "ç$Ñÿ\u009e\u0007p\u0092 »f8.\u0095\u00ad\u0080Ê\u0081Íc\u0091d\u009fDoÈ\u0019±·}`¢Î¾\u009d4¿êÓ(â\u0093k\u0003\u0092\u0011±DÆÒÍ\u001cÌ\u0099Rk¡\u001bç\u0098YR'1Ï\u009dEÅ\u009b\u0014Yû?\u008f\u0010ÅN\u0017-¤Ê`}\u00818ê\u0094p5Ç:\u0097\u0018\nÌJHHõ\\-ÇîF\u001aæ\u0088fo´,Ç\nòÈs£ÎF×³Þ\u000f\b¼ã\u0086(ù\u001dØ÷\n\u0091y\u000f\u0091z¯ù·ºV \u0000Â\u009fL¶A»Î\u001bÜ\u0006 ëF\u0012\u001fq\u0015WÇAÈ%¬"
.length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var38 = var11;
var10001 = var8++;
long var52 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var57 = -1;

while (true) {
long var13 = var52;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var60 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var57) {
case 0:
var38[var10001] = var60;
if (var7 >= var10) {
g = var11;
h = new Integer[23];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 226412021751670609L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var55 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var46 = -1;
j = var55;
KProperty[] var31 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(e1.class, b<"p">(8262, 8370310032524830260L ^ var25), b<"p">(29747, 2407914574029828676L ^ var25), 0)),
Reflection.property1(new PropertyReference1Impl(e1.class, b<"p">(5072, 893935860018238892L ^ var25), b<"p">(16185, 4383779332831967556L ^ var25), 0))
};
F = var31;
Y = new e1(var29);
C = yp.t(Y, b<"p">(18694, 1530435042185449327L ^ var25), true, var27, null, null, c<"s">(28262, 4184343715911760306L ^ var25), null);
P = yp.t(Y, b<"p">(8044, 2761382877607647506L ^ var25), true, var27, null, null, c<"s">(5451, 4988894456965005960L ^ var25), null);
o = new ArrayList();
A = new ArrayList();
a = new IntArrayList();
return;
}
break;
default:
var38[var10001] = var60;
if (var7 < var10) {
continue label46;
}

var9 = "v\t;d¿D\u0013|1ÄØÆkí\u0094ì";
var10 = "v\t;d¿D\u0013|1ÄØÆkí\u0094ì".length();
var7 = 0;
}

byte var45 = var7;
var7 += 8;
var12 = var9.substring(var45, var7).getBytes("ISO-8859-1");
var38 = var11;
var10001 = var8++;
var52 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var57 = 0;
}
}
}

var19 = var20.charAt(var34);
break;
default:
var23[var21++] = var48;
if ((var34 += var19) < var22) {
var19 = var20.charAt(var34);
continue label64;
}

var20 = "êØ%{Å\u0090°\u00060\u001eL¥±½E\u0005µJç7¦9´d-ñj\u0085[Ï®¦\\ï\u008d¾Ú/\u008dR\u0018(\u0019brãç¿\u0017f»\u0016\"à\u0085?/ÿZ\u009fÁG¿ìA";
var22 = "êØ%{Å\u0090°\u00060\u001eL¥±½E\u0005µJç7¦9´d-ñj\u0085[Ï®¦\\ï\u008d¾Ú/\u008dR\u0018(\u0019brãç¿\u0017f»\u0016\"à\u0085?/ÿZ\u009fÁG¿ìA".length();
var19 = '(';
var34 = -1;
}

var35 = var20.substring(++var34, var34 + var19);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31864;
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
throw new RuntimeException("su/catlean/e1", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
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
throw new RuntimeException("su/catlean/e1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11732;
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
throw new RuntimeException("su/catlean/e1", var14);
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
throw new RuntimeException("su/catlean/e1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
