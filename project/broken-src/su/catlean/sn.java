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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class sn implements jr {
@NotNull
public static final sn w;
private static final String a;
private static final long[] b;
private static final Integer[] c;
private static final Map d;

private sn() {
}

@Override
public void w(long a, @NotNull PreSyncEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 316164599882
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 2350125969345
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 28393686283084
// 013: lxor
// 014: dup2
// 015: bipush 48
// 017: lushr
// 018: l2i
// 019: istore 8
// 01b: dup2
// 01c: bipush 16
// 01e: lshl
// 01f: bipush 48
// 021: lushr
// 022: l2i
// 023: istore 9
// 025: dup2
// 026: bipush 32
// 028: lshl
// 029: bipush 32
// 02b: lushr
// 02c: l2i
// 02d: istore 10
// 02f: pop2
// 030: dup2
// 031: ldc2_w 95174287896623
// 034: lxor
// 035: lstore 11
// 037: dup2
// 038: ldc2_w 43766790553018
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 95510200616042
// 042: lxor
// 043: lstore 15
// 045: pop2
// 046: ldc2_w 6232619157977255585
// 049: lload 1
// 04a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: aload 3
// 050: ldc "e"
// 052: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 055: astore 17
// 057: lload 15
// 059: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05c: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 05f: aload 17
// 061: ifnonnull 090
// 064: ifeq 088
// 067: goto 074
// 06a: ldc2_w 6335991790927415998
// 06d: lload 1
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 077: bipush 1
// 078: invokevirtual su/catlean/ut.E (Z)V
// 07b: goto 088
// 07e: ldc2_w 6335991790927415998
// 081: lload 1
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: lload 15
// 08a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08d: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 090: aload 17
// 092: lload 1
// 093: lconst_0
// 094: lcmp
// 095: iflt 0c2
// 098: ifnonnull 0c0
// 09b: ifne 2ac
// 09e: goto 0ab
// 0a1: ldc2_w 6335991790927415998
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0ae: lload 6
// 0b0: invokevirtual su/catlean/ut.FR (J)Z
// 0b3: goto 0c0
// 0b6: ldc2_w 6335991790927415998
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 17
// 0c2: lload 1
// 0c3: lconst_0
// 0c4: lcmp
// 0c5: iflt 0f0
// 0c8: ifnonnull 0ee
// 0cb: ifeq 2ac
// 0ce: goto 0db
// 0d1: ldc2_w 6335991790927415998
// 0d4: lload 1
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0de: invokevirtual su/catlean/ut.Fb ()Z
// 0e1: goto 0ee
// 0e4: ldc2_w 6335991790927415998
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 17
// 0f0: ifnonnull 1aa
// 0f3: ifeq 1a2
// 0f6: goto 103
// 0f9: ldc2_w 6335991790927415998
// 0fc: lload 1
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: lload 15
// 105: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 108: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 10b: aload 17
// 10d: ifnonnull 1aa
// 110: goto 11d
// 113: ldc2_w 6335991790927415998
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: ifne 1a2
// 120: goto 12d
// 123: ldc2_w 6335991790927415998
// 126: lload 1
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 130: invokevirtual su/catlean/dm.o ()D
// 133: dconst_0
// 134: dcmpl
// 135: aload 17
// 137: ifnonnull 1aa
// 13a: goto 147
// 13d: ldc2_w 6335991790927415998
// 140: lload 1
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: ifle 1a2
// 14a: goto 157
// 14d: ldc2_w 6335991790927415998
// 150: lload 1
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 15a: iload 8
// 15c: i2s
// 15d: iload 9
// 15f: i2c
// 160: iload 10
// 162: invokevirtual su/catlean/ut.kC (SCI)Z
// 165: aload 17
// 167: lload 1
// 168: lconst_0
// 169: lcmp
// 16a: iflt 1ac
// 16d: ifnonnull 1aa
// 170: goto 17d
// 173: ldc2_w 6335991790927415998
// 176: lload 1
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: ifeq 1a2
// 180: goto 18d
// 183: ldc2_w 6335991790927415998
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 190: ldc 0.3
// 192: invokevirtual su/catlean/tq.x (F)V
// 195: goto 1a2
// 198: ldc2_w 6335991790927415998
// 19b: lload 1
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: lload 15
// 1a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a7: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1aa: aload 17
// 1ac: lload 1
// 1ad: lconst_0
// 1ae: lcmp
// 1af: ifle 1e2
// 1b2: ifnonnull 1e0
// 1b5: ifne 2ac
// 1b8: goto 1c5
// 1bb: ldc2_w 6335991790927415998
// 1be: lload 1
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1c8: iload 8
// 1ca: i2s
// 1cb: iload 9
// 1cd: i2c
// 1ce: iload 10
// 1d0: invokevirtual su/catlean/ut.kC (SCI)Z
// 1d3: goto 1e0
// 1d6: ldc2_w 6335991790927415998
// 1d9: lload 1
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: aload 17
// 1e2: lload 1
// 1e3: lconst_0
// 1e4: lcmp
// 1e5: ifle 217
// 1e8: ifnonnull 215
// 1eb: ifeq 2ac
// 1ee: goto 1fb
// 1f1: ldc2_w 6335991790927415998
// 1f4: lload 1
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: lload 15
// 1fd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 200: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 203: invokevirtual net/minecraft/class_243.method_10214 ()D
// 206: dconst_0
// 207: dcmpg
// 208: goto 215
// 20b: ldc2_w 6335991790927415998
// 20e: lload 1
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: aload 17
// 217: ifnonnull 26c
// 21a: ifge 2ac
// 21d: goto 22a
// 220: ldc2_w 6335991790927415998
// 223: lload 1
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 22d: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 230: aload 17
// 232: ifnonnull 2a9
// 235: goto 242
// 238: ldc2_w 6335991790927415998
// 23b: lload 1
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: sipush 23354
// 245: ldc2_w 6613410839648725229
// 248: lload 1
// 249: lxor
// 24a: invokedynamic u (IJ)I bsm=su/catlean/sn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: i2f
// 250: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 253: lload 4
// 255: invokevirtual su/catlean/ut.FV (J)F
// 258: fmul
// 259: f2i
// 25a: lload 13
// 25c: invokevirtual su/catlean/bg.c (IJ)Z
// 25f: goto 26c
// 262: ldc2_w 6335991790927415998
// 265: lload 1
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: ifne 270
// 26f: return
// 270: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 273: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 276: invokevirtual su/catlean/bg.l ()V
// 279: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 27c: bipush 1
// 27d: invokevirtual su/catlean/qc.K (Z)V
// 280: new net/minecraft/class_2848
// 283: dup
// 284: lload 15
// 286: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 289: checkcast net/minecraft/class_1297
// 28c: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 28f: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 292: checkcast net/minecraft/class_2596
// 295: lload 11
// 297: dup2_x1
// 298: pop2
// 299: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 29c: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 29f: bipush 0
// 2a0: invokevirtual su/catlean/ut.E (Z)V
// 2a3: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2a6: invokevirtual su/catlean/ut.FT ()Lsu/catlean/bg;
// 2a9: invokevirtual su/catlean/bg.l ()V
// 2ac: return
}

@Override
public void y(@NotNull PreElytraEvent e, long a) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void b(long a, @NotNull AfterElytraEvent e) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void h(@NotNull MoveEvent e, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 52389835191008
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 4452337967885
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 49448490245388
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 123833832724325
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 61376565249967
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 85271198980116
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 46640431346444
// 02f: lxor
// 030: lstore 16
// 032: dup2
// 033: ldc2_w 119169530931175
// 036: lxor
// 037: lstore 18
// 039: dup2
// 03a: ldc2_w 28734862241446
// 03d: lxor
// 03e: lstore 20
// 040: dup2
// 041: ldc2_w 131128708503632
// 044: lxor
// 045: lstore 22
// 047: dup2
// 048: ldc2_w 16494758083782
// 04b: lxor
// 04c: lstore 24
// 04e: pop2
// 04f: ldc2_w -1237663305365850611
// 052: lload 2
// 053: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: aload 1
// 059: ldc "e"
// 05b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05e: astore 26
// 060: lload 24
// 062: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 065: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 068: sipush 24038
// 06b: ldc2_w 764088901778232991
// 06e: lload 2
// 06f: lxor
// 070: invokedynamic u (IJ)I bsm=su/catlean/sn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 078: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 07b: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 081: aload 26
// 083: ifnonnull 0ab
// 086: ifeq 0ae
// 089: goto 096
// 08c: ldc2_w -1206490625644187118
// 08f: lload 2
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: lload 24
// 098: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09b: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 09e: goto 0ab
// 0a1: ldc2_w -1206490625644187118
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: ifne 0af
// 0ae: return
// 0af: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0b2: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0b5: lload 10
// 0b7: invokevirtual su/catlean/ut.FN (J)F
// 0ba: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0bd: aload 26
// 0bf: ifnonnull 0e7
// 0c2: lload 18
// 0c4: invokevirtual su/catlean/ut.Fd (J)Z
// 0c7: ifeq 126
// 0ca: goto 0d7
// 0cd: ldc2_w -1206490625644187118
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0da: goto 0e7
// 0dd: ldc2_w -1206490625644187118
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: lload 20
// 0e9: invokevirtual su/catlean/ut.kk (J)F
// 0ec: fstore 29
// 0ee: fstore 33
// 0f0: astore 32
// 0f2: bipush 0
// 0f3: istore 30
// 0f5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0f8: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0fb: invokevirtual su/catlean/ut.x ()F
// 0fe: fload 29
// 100: fadd
// 101: invokevirtual su/catlean/ut.E (F)V
// 104: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 107: invokevirtual su/catlean/ut.x ()F
// 10a: fstore 34
// 10c: aload 32
// 10e: fload 33
// 110: fload 34
// 112: nop
// 113: ldc 100.0
// 115: fdiv
// 116: f2d
// 117: dstore 28
// 119: dconst_1
// 11a: dstore 30
// 11c: dload 28
// 11e: dload 30
// 120: invokestatic java/lang/Math.min (DD)D
// 123: goto 127
// 126: dconst_1
// 127: d2f
// 128: fmul
// 129: bipush 0
// 12a: fconst_0
// 12b: lload 22
// 12d: fconst_0
// 12e: fconst_0
// 12f: sipush 21730
// 132: ldc2_w 4539335604600758168
// 135: lload 2
// 136: lxor
// 137: invokedynamic u (IJ)I bsm=su/catlean/sn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: aconst_null
// 13d: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 140: astore 27
// 142: aload 1
// 143: aload 27
// 145: bipush 0
// 146: daload
// 147: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 14a: aload 1
// 14b: lload 4
// 14d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 150: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 153: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 156: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 159: aload 26
// 15b: lload 2
// 15c: lconst_0
// 15d: lcmp
// 15e: iflt 19a
// 161: ifnonnull 198
// 164: ifeq 18a
// 167: goto 174
// 16a: ldc2_w -1206490625644187118
// 16d: lload 2
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 177: lload 12
// 179: invokevirtual su/catlean/ut.FK (J)F
// 17c: f2d
// 17d: goto 24c
// 180: ldc2_w -1206490625644187118
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: lload 4
// 18c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 18f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 192: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 195: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 198: aload 26
// 19a: lload 2
// 19b: lconst_0
// 19c: lcmp
// 19d: ifle 1da
// 1a0: ifnonnull 1d2
// 1a3: ifeq 1ca
// 1a6: goto 1b3
// 1a9: ldc2_w -1206490625644187118
// 1ac: lload 2
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1b6: lload 16
// 1b8: invokevirtual su/catlean/ut.kx (J)F
// 1bb: f2d
// 1bc: dneg
// 1bd: goto 24c
// 1c0: ldc2_w -1206490625644187118
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1cd: lload 14
// 1cf: invokevirtual su/catlean/ut.Fn (J)Z
// 1d2: lload 2
// 1d3: lconst_0
// 1d4: lcmp
// 1d5: ifle 202
// 1d8: aload 26
// 1da: ifnonnull 202
// 1dd: ifeq 23d
// 1e0: goto 1ed
// 1e3: ldc2_w -1206490625644187118
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1f0: lload 6
// 1f2: invokevirtual su/catlean/dm.Y (J)Z
// 1f5: goto 202
// 1f8: ldc2_w -1206490625644187118
// 1fb: lload 2
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: ifeq 23d
// 205: lload 24
// 207: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20a: invokevirtual net/minecraft/class_746.method_36455 ()F
// 20d: f2d
// 20e: ldc2_w 90.0
// 211: ddiv
// 212: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 215: lload 12
// 217: invokevirtual su/catlean/ut.FK (J)F
// 21a: fneg
// 21b: f2d
// 21c: dmul
// 21d: lload 24
// 21f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 222: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 225: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 228: getfield net/minecraft/class_241.field_1342 F
// 22b: invokestatic java/lang/Math.signum (F)F
// 22e: f2d
// 22f: dmul
// 230: goto 23e
// 233: ldc2_w -1206490625644187118
// 236: lload 2
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: dconst_0
// 23e: ldc2_w 0.08
// 241: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 244: lload 8
// 246: invokevirtual su/catlean/ut.kI (J)F
// 249: f2d
// 24a: dmul
// 24b: dsub
// 24c: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 24f: aload 1
// 250: aload 27
// 252: bipush 1
// 253: daload
// 254: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 257: aload 26
// 259: ifnonnull 2a0
// 25c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 25f: lload 6
// 261: invokevirtual su/catlean/dm.Y (J)Z
// 264: ifne 288
// 267: goto 274
// 26a: ldc2_w -1206490625644187118
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 277: fconst_0
// 278: invokevirtual su/catlean/ut.E (F)V
// 27b: goto 288
// 27e: ldc2_w -1206490625644187118
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: lload 24
// 28a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 28d: aload 1
// 28e: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 291: aload 1
// 292: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 295: aload 1
// 296: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 299: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 29c: aload 1
// 29d: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 2a0: return
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
Intrinsics.checkNotNullParameter(event, a);
}

@Override
public void A(@NotNull ReceivePacket e, long a, char a) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void P(int a, @NotNull PlayerUpdateEvent e, char a, char a) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void m(char var1, int var2, short var3) {
}

@Override
public void b(long var1) {
}

@Override
public void U(long a, @NotNull FireWorkVelocityEvent e) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void s(@NotNull SetPoseEvent e) {
Intrinsics.checkNotNullParameter(e, "e");
}

@Override
public void k(long a, @NotNull ReceivePacket e) {
Intrinsics.checkNotNullParameter(e, "e");
}

static {
long var11 = yz.a(8822416560424700861L, -2284376559956725315L, MethodHandles.lookup().lookupClass()).a(80909883216423L) ^ 37516010152906L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var15 = var13.doFinal("'\u000b\u00adÈ|\u009d\u00854".getBytes("ISO-8859-1"));
String var19 = a(var15).intern();
int var10001 = -1;
a = var19;
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "«Æü\u00add,Mø\u008fJ~ä0½Ë#pÞ1S\u001d\u0092Õû";
int var5 = "«Æü\u00add,Mø\u008fJ~ä0½Ë#pÞ1S\u001d\u0092Õû".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var22 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

b = var6;
c = new Integer[3];
w = new sn();
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String a(byte[] var0) {
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25810;
if (c[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = b[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])d.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/sn", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
c[var3] = var15;
}

return c[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/sn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
