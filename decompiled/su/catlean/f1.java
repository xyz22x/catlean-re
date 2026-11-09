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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4050;
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

public final class f1 implements jr {
@NotNull
public static final f1 x;
private static float f;
private static float p;
@NotNull
private static final i9 U;
@NotNull
private static final i9 r;
@NotNull
private static HashMap q;
private static final long a = yz.a(-6844058597710634435L, 5516195895963292931L, MethodHandles.lookup().lookupClass()).a(88685240984708L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private f1() {
}

@Override
public void w(long a, @NotNull PreSyncEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void y(@NotNull PreElytraEvent e, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: dup2
// 02: ldc2_w 11101687657869
// 05: lxor
// 06: lstore 4
// 08: dup2
// 09: ldc2_w 139945243846052
// 0c: lxor
// 0d: lstore 6
// 0f: dup2
// 10: ldc2_w 79805115683167
// 13: lxor
// 14: lstore 8
// 16: dup2
// 17: ldc2_w 56085832421177
// 1a: lxor
// 1b: dup2
// 1c: bipush 48
// 1e: lushr
// 1f: l2i
// 20: istore 10
// 22: dup2
// 23: bipush 16
// 25: lshl
// 26: bipush 32
// 28: lushr
// 29: l2i
// 2a: istore 11
// 2c: dup2
// 2d: bipush 48
// 2f: lshl
// 30: bipush 48
// 32: lushr
// 33: l2i
// 34: istore 12
// 36: pop2
// 37: pop2
// 38: ldc2_w -8985903558872163436
// 3b: lload 2
// 3c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: aload 1
// 42: ldc "e"
// 44: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 47: lload 8
// 49: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4c: invokevirtual net/minecraft/class_746.method_36454 ()F
// 4f: putstatic su/catlean/f1.f F
// 52: astore 13
// 54: lload 8
// 56: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 59: invokevirtual net/minecraft/class_746.method_36455 ()F
// 5c: putstatic su/catlean/f1.p F
// 5f: lload 8
// 61: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 64: aload 0
// 65: iload 10
// 67: i2c
// 68: iload 11
// 6a: iload 12
// 6c: i2c
// 6d: invokespecial su/catlean/f1.S (CIC)F
// 70: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 73: aload 13
// 75: ifnonnull b4
// 78: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 7b: lload 4
// 7d: invokevirtual su/catlean/ut.Fn (J)Z
// 80: ifne a6
// 83: goto 90
// 86: ldc2_w -9002546071644357764
// 89: lload 2
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: lload 8
// 92: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 95: fconst_0
// 96: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 99: goto a6
// 9c: ldc2_w -9002546071644357764
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: lload 8
// a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// ab: aload 0
// ac: lload 6
// ae: invokespecial su/catlean/f1.M (J)F
// b1: invokevirtual net/minecraft/class_746.method_36457 (F)V
// b4: return
}

@Override
public void b(long a, @NotNull AfterElytraEvent e) {
long var4 = ax ^ 18213801518595L;
Intrinsics.checkNotNullParameter(ex, "e");
zf.v(var4).method_36456(f);
zf.v(var4).method_36457(p);
}

@Override
public void h(@NotNull MoveEvent e, long a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
Intrinsics.checkNotNullParameter(event, a<"a">(25302, 9200658739501041503L ^ ax));
}

@Override
public void A(@NotNull ReceivePacket e, long a, char a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void P(int a, @NotNull PlayerUpdateEvent e, char a, char a) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: lstore 5
// 01a: lload 5
// 01c: dup2
// 01d: ldc2_w 110443321443084
// 020: lxor
// 021: lstore 7
// 023: dup2
// 024: ldc2_w 50328728142976
// 027: lxor
// 028: lstore 9
// 02a: dup2
// 02b: ldc2_w 41345190240954
// 02e: lxor
// 02f: dup2
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 11
// 036: dup2
// 037: bipush 32
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 12
// 040: dup2
// 041: bipush 48
// 043: lshl
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 13
// 04a: pop2
// 04b: dup2
// 04c: ldc2_w 63995293181256
// 04f: lxor
// 050: lstore 14
// 052: dup2
// 053: ldc2_w 114086189244075
// 056: lxor
// 057: lstore 16
// 059: dup2
// 05a: ldc2_w 25966103532184
// 05d: lxor
// 05e: lstore 18
// 060: dup2
// 061: ldc2_w 21941179117163
// 064: lxor
// 065: lstore 20
// 067: dup2
// 068: ldc2_w 126467566025169
// 06b: lxor
// 06c: lstore 22
// 06e: dup2
// 06f: ldc2_w 119142936620191
// 072: lxor
// 073: lstore 24
// 075: dup2
// 076: ldc2_w 75690733423914
// 079: lxor
// 07a: lstore 26
// 07c: dup2
// 07d: ldc2_w 18593605143838
// 080: lxor
// 081: lstore 28
// 083: dup2
// 084: ldc2_w 69546472592204
// 087: lxor
// 088: dup2
// 089: bipush 48
// 08b: lushr
// 08c: l2i
// 08d: istore 30
// 08f: dup2
// 090: bipush 16
// 092: lshl
// 093: bipush 32
// 095: lushr
// 096: l2i
// 097: istore 31
// 099: dup2
// 09a: bipush 48
// 09c: lshl
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 32
// 0a3: pop2
// 0a4: dup2
// 0a5: ldc2_w 10219090097811
// 0a8: lxor
// 0a9: lstore 33
// 0ab: dup2
// 0ac: ldc2_w 17349872559412
// 0af: lxor
// 0b0: lstore 35
// 0b2: dup2
// 0b3: ldc2_w 102152613699867
// 0b6: lxor
// 0b7: lstore 37
// 0b9: dup2
// 0ba: ldc2_w 113945537659848
// 0bd: lxor
// 0be: lstore 39
// 0c0: dup2
// 0c1: ldc2_w 32884685514560
// 0c4: lxor
// 0c5: dup2
// 0c6: bipush 48
// 0c8: lushr
// 0c9: l2i
// 0ca: istore 41
// 0cc: dup2
// 0cd: bipush 16
// 0cf: lshl
// 0d0: bipush 16
// 0d2: lushr
// 0d3: lstore 42
// 0d5: pop2
// 0d6: dup2
// 0d7: ldc2_w 95440221422403
// 0da: lxor
// 0db: lstore 44
// 0dd: dup2
// 0de: ldc2_w 70964958371721
// 0e1: lxor
// 0e2: lstore 46
// 0e4: dup2
// 0e5: ldc2_w 75341532821871
// 0e8: lxor
// 0e9: lstore 48
// 0eb: dup2
// 0ec: ldc2_w 136402819029944
// 0ef: lxor
// 0f0: lstore 50
// 0f2: dup2
// 0f3: ldc2_w 89099754289359
// 0f6: lxor
// 0f7: lstore 52
// 0f9: pop2
// 0fa: ldc2_w -6971954781823399967
// 0fd: lload 5
// 0ff: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: aload 2
// 105: ldc "e"
// 107: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10a: astore 59
// 10c: aload 0
// 10d: lload 39
// 10f: invokespecial su/catlean/f1.H (J)Z
// 112: aload 59
// 114: ifnonnull 197
// 117: ifne 18f
// 11a: goto 128
// 11d: ldc2_w -6961012197525182711
// 120: lload 5
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 12b: lload 24
// 12d: invokevirtual su/catlean/ut.a (J)Lsu/catlean/am;
// 130: getstatic su/catlean/am.BLOCK Lsu/catlean/am;
// 133: iload 3
// 134: iflt 176
// 137: aload 59
// 139: ifnonnull 176
// 13c: goto 14a
// 13f: ldc2_w -6961012197525182711
// 142: lload 5
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: if_acmpne 16b
// 14d: goto 15b
// 150: ldc2_w -6961012197525182711
// 153: lload 5
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: aload 2
// 15c: invokevirtual su/catlean/api/event/events/player/PlayerUpdateEvent.cancel ()V
// 15f: return
// 160: ldc2_w -6961012197525182711
// 163: lload 5
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 16e: lload 24
// 170: invokevirtual su/catlean/ut.a (J)Lsu/catlean/am;
// 173: getstatic su/catlean/am.TIMER Lsu/catlean/am;
// 176: if_acmpne 18f
// 179: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 17c: ldc 0.05
// 17e: invokevirtual su/catlean/tq.x (F)V
// 181: goto 18f
// 184: ldc2_w -6961012197525182711
// 187: lload 5
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 192: lload 44
// 194: invokevirtual su/catlean/gg.O (J)I
// 197: istore 60
// 199: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 19c: bipush 1
// 19d: anewarray 896
// 1a0: astore 62
// 1a2: aload 62
// 1a4: bipush 0
// 1a5: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 1a8: dup
// 1a9: sipush 12280
// 1ac: ldc2_w 4759421757581206043
// 1af: lload 5
// 1b1: lxor
// 1b2: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/f1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ba: aastore
// 1bb: aload 62
// 1bd: iload 41
// 1bf: i2c
// 1c0: lload 42
// 1c2: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 1c5: astore 61
// 1c7: iload 60
// 1c9: aload 59
// 1cb: iload 4
// 1cd: ifle 1f9
// 1d0: ifnonnull 1f7
// 1d3: iflt 272
// 1d6: goto 1e4
// 1d9: ldc2_w -6961012197525182711
// 1dc: lload 5
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: aload 61
// 1e6: invokevirtual su/catlean/fg.R ()Z
// 1e9: goto 1f7
// 1ec: ldc2_w -6961012197525182711
// 1ef: lload 5
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: aload 59
// 1f9: iload 3
// 1fa: ifle 229
// 1fd: ifnonnull 227
// 200: ifeq 272
// 203: goto 211
// 206: ldc2_w -6961012197525182711
// 209: lload 5
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: lload 26
// 213: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 216: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 219: goto 227
// 21c: ldc2_w -6961012197525182711
// 21f: lload 5
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: aload 59
// 229: iload 3
// 22a: ifle 259
// 22d: ifnonnull 257
// 230: ifne 272
// 233: goto 241
// 236: ldc2_w -6961012197525182711
// 239: lload 5
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: lload 26
// 243: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 246: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 249: goto 257
// 24c: ldc2_w -6961012197525182711
// 24f: lload 5
// 251: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: athrow
// 257: aload 59
// 259: iload 4
// 25b: ifle 283
// 25e: ifnonnull 281
// 261: ifeq 273
// 264: goto 272
// 267: ldc2_w -6961012197525182711
// 26a: lload 5
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: return
// 273: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 276: iload 11
// 278: iload 12
// 27a: i2c
// 27b: iload 13
// 27d: i2c
// 27e: invokevirtual su/catlean/ut.Fu (ICC)Z
// 281: aload 59
// 283: ifnonnull 343
// 286: ifeq 33b
// 289: goto 297
// 28c: ldc2_w -6961012197525182711
// 28f: lload 5
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: lload 26
// 299: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29c: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 29f: aload 59
// 2a1: ifnonnull 343
// 2a4: goto 2b2
// 2a7: ldc2_w -6961012197525182711
// 2aa: lload 5
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: ifeq 33b
// 2b5: goto 2c3
// 2b8: ldc2_w -6961012197525182711
// 2bb: lload 5
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: lload 26
// 2c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c8: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 2cb: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 2ce: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 2d1: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 2d6: aload 59
// 2d8: iload 3
// 2d9: iflt 321
// 2dc: ifnonnull 31f
// 2df: goto 2ed
// 2e2: ldc2_w -6961012197525182711
// 2e5: lload 5
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: ifne 33a
// 2f0: goto 2fe
// 2f3: ldc2_w -6961012197525182711
// 2f6: lload 5
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: lload 26
// 300: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 303: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 306: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 309: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 30c: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 311: goto 31f
// 314: ldc2_w -6961012197525182711
// 317: lload 5
// 319: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31e: athrow
// 31f: aload 59
// 321: iload 4
// 323: iflt 345
// 326: ifnonnull 343
// 329: ifeq 33b
// 32c: goto 33a
// 32f: ldc2_w -6961012197525182711
// 332: lload 5
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: return
// 33b: lload 26
// 33d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 340: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 343: aload 59
// 345: iload 4
// 347: ifle 3db
// 34a: ifnonnull 3d9
// 34d: ifeq 3d1
// 350: goto 35e
// 353: ldc2_w -6961012197525182711
// 356: lload 5
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: iload 3
// 35f: ifle 3b1
// 362: lload 7
// 364: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 367: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 36a: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 36d: aload 59
// 36f: ifnonnull 3ad
// 372: goto 380
// 375: ldc2_w -6961012197525182711
// 378: lload 5
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 383: ifne 3d0
// 386: goto 394
// 389: ldc2_w -6961012197525182711
// 38c: lload 5
// 38e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 393: athrow
// 394: lload 7
// 396: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 399: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 39c: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 39f: goto 3ad
// 3a2: ldc2_w -6961012197525182711
// 3a5: lload 5
// 3a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ac: athrow
// 3ad: bipush 1
// 3ae: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 3b1: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 3b4: lload 52
// 3b6: bipush 3
// 3b7: bipush 0
// 3b8: bipush 0
// 3b9: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/f1.d ()V, ()V ]
// 3be: sipush 1424
// 3c1: ldc2_w 4356307465454078586
// 3c4: lload 5
// 3c6: lxor
// 3c7: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: aconst_null
// 3cd: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 3d0: return
// 3d1: lload 26
// 3d3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d6: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 3d9: aload 59
// 3db: iload 4
// 3dd: iflt 418
// 3e0: ifnonnull 412
// 3e3: ifne 6cf
// 3e6: goto 3f4
// 3e9: ldc2_w -6961012197525182711
// 3ec: lload 5
// 3ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f3: athrow
// 3f4: getstatic su/catlean/f1.r Lsu/catlean/i9;
// 3f7: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3fa: lload 20
// 3fc: invokevirtual su/catlean/ut.Fv (J)I
// 3ff: lload 50
// 401: invokevirtual su/catlean/i9.e (IJ)Z
// 404: goto 412
// 407: ldc2_w -6961012197525182711
// 40a: lload 5
// 40c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 411: athrow
// 412: iload 1
// 413: ifle 42e
// 416: aload 59
// 418: ifnonnull 42e
// 41b: ifeq 6cf
// 41e: goto 42c
// 421: ldc2_w -6961012197525182711
// 424: lload 5
// 426: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42b: athrow
// 42c: iload 60
// 42e: sipush 1038
// 431: ldc2_w 4730174600620624876
// 434: lload 5
// 436: lxor
// 437: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43c: aload 59
// 43e: ifnonnull 554
// 441: if_icmplt 525
// 444: goto 452
// 447: ldc2_w -6961012197525182711
// 44a: lload 5
// 44c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 451: athrow
// 452: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 455: bipush 1
// 456: invokevirtual su/catlean/_n.m (Z)V
// 459: iload 60
// 45b: sipush 25763
// 45e: ldc2_w 8280317790508788555
// 461: lload 5
// 463: lxor
// 464: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 469: isub
// 46a: istore 62
// 46c: sipush 1424
// 46f: ldc2_w 4356307465454078586
// 472: lload 5
// 474: lxor
// 475: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47a: iload 62
// 47c: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 47f: bipush 1
// 480: lload 33
// 482: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 485: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 488: bipush 1
// 489: invokevirtual su/catlean/qc.K (Z)V
// 48c: lload 26
// 48e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 491: invokevirtual net/minecraft/class_746.method_23669 ()V
// 494: new net/minecraft/class_2848
// 497: dup
// 498: lload 26
// 49a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 49d: checkcast net/minecraft/class_1297
// 4a0: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 4a3: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 4a6: checkcast net/minecraft/class_2596
// 4a9: lload 48
// 4ab: dup2_x1
// 4ac: pop2
// 4ad: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 4b0: iload 1
// 4b1: ifle 522
// 4b4: getstatic su/catlean/f1.U Lsu/catlean/i9;
// 4b7: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4ba: lload 14
// 4bc: invokevirtual su/catlean/ut.kc (J)I
// 4bf: lload 50
// 4c1: invokevirtual su/catlean/i9.e (IJ)Z
// 4c4: aload 59
// 4c6: ifnonnull 510
// 4c9: ifeq 502
// 4cc: goto 4da
// 4cf: ldc2_w -6961012197525182711
// 4d2: lload 5
// 4d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d9: athrow
// 4da: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 4dd: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4e0: lload 16
// 4e2: invokevirtual su/catlean/ut.kp (J)Z
// 4e5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4e8: lload 35
// 4ea: invokevirtual su/catlean/ut.M (J)Z
// 4ed: lload 28
// 4ef: dup2_x1
// 4f0: pop2
// 4f1: invokevirtual su/catlean/uy.k (ZJZ)V
// 4f4: goto 502
// 4f7: ldc2_w -6961012197525182711
// 4fa: lload 5
// 4fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 501: athrow
// 502: sipush 1424
// 505: ldc2_w 4356307465454078586
// 508: lload 5
// 50a: lxor
// 50b: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: iload 62
// 512: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 515: bipush 1
// 516: lload 33
// 518: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 51b: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 51e: bipush 0
// 51f: invokevirtual su/catlean/_n.m (Z)V
// 522: goto 6cf
// 525: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 528: bipush 1
// 529: invokevirtual su/catlean/_n.m (Z)V
// 52c: iload 60
// 52e: lload 18
// 530: bipush 0
// 531: aconst_null
// 532: bipush 0
// 533: sipush 32759
// 536: ldc2_w 1812204628834234398
// 539: lload 5
// 53b: lxor
// 53c: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 541: aconst_null
// 542: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 545: sipush 1424
// 548: ldc2_w 4356307465454078586
// 54b: lload 5
// 54d: lxor
// 54e: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: bipush 0
// 554: aconst_null
// 555: bipush 0
// 556: sipush 32759
// 559: ldc2_w 1812204628834234398
// 55c: lload 5
// 55e: lxor
// 55f: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 564: aconst_null
// 565: astore 54
// 567: istore 55
// 569: istore 56
// 56b: astore 57
// 56d: istore 58
// 56f: lload 18
// 571: iload 58
// 573: aload 57
// 575: iload 56
// 577: iload 55
// 579: aload 54
// 57b: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 57e: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 581: lload 37
// 583: invokevirtual su/catlean/ut.Fr (J)Z
// 586: aload 59
// 588: iload 3
// 589: iflt 604
// 58c: ifnonnull 602
// 58f: ifne 5c7
// 592: goto 5a0
// 595: ldc2_w -6961012197525182711
// 598: lload 5
// 59a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59f: athrow
// 5a0: iload 60
// 5a2: lload 18
// 5a4: bipush 0
// 5a5: aconst_null
// 5a6: bipush 1
// 5a7: sipush 1424
// 5aa: ldc2_w 4356307465454078586
// 5ad: lload 5
// 5af: lxor
// 5b0: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b5: aconst_null
// 5b6: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 5b9: goto 5c7
// 5bc: ldc2_w -6961012197525182711
// 5bf: lload 5
// 5c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c6: athrow
// 5c7: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 5ca: bipush 1
// 5cb: invokevirtual su/catlean/qc.K (Z)V
// 5ce: lload 26
// 5d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5d3: invokevirtual net/minecraft/class_746.method_23669 ()V
// 5d6: new net/minecraft/class_2848
// 5d9: dup
// 5da: lload 26
// 5dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5df: checkcast net/minecraft/class_1297
// 5e2: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 5e5: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 5e8: checkcast net/minecraft/class_2596
// 5eb: lload 48
// 5ed: dup2_x1
// 5ee: pop2
// 5ef: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 5f2: getstatic su/catlean/f1.U Lsu/catlean/i9;
// 5f5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 5f8: lload 14
// 5fa: invokevirtual su/catlean/ut.kc (J)I
// 5fd: lload 50
// 5ff: invokevirtual su/catlean/i9.e (IJ)Z
// 602: aload 59
// 604: iload 4
// 606: ifle 64f
// 609: ifnonnull 64d
// 60c: ifeq 645
// 60f: goto 61d
// 612: ldc2_w -6961012197525182711
// 615: lload 5
// 617: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61c: athrow
// 61d: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 620: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 623: lload 16
// 625: invokevirtual su/catlean/ut.kp (J)Z
// 628: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 62b: lload 35
// 62d: invokevirtual su/catlean/ut.M (J)Z
// 630: lload 28
// 632: dup2_x1
// 633: pop2
// 634: invokevirtual su/catlean/uy.k (ZJZ)V
// 637: goto 645
// 63a: ldc2_w -6961012197525182711
// 63d: lload 5
// 63f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 644: athrow
// 645: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 648: lload 37
// 64a: invokevirtual su/catlean/ut.Fr (J)Z
// 64d: aload 59
// 64f: ifnonnull 6b1
// 652: ifne 68a
// 655: goto 663
// 658: ldc2_w -6961012197525182711
// 65b: lload 5
// 65d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 662: athrow
// 663: iload 60
// 665: lload 18
// 667: bipush 0
// 668: aconst_null
// 669: bipush 0
// 66a: sipush 32759
// 66d: ldc2_w 1812204628834234398
// 670: lload 5
// 672: lxor
// 673: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 678: aconst_null
// 679: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 67c: goto 68a
// 67f: ldc2_w -6961012197525182711
// 682: lload 5
// 684: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 689: athrow
// 68a: sipush 1424
// 68d: ldc2_w 4356307465454078586
// 690: lload 5
// 692: lxor
// 693: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 698: lload 18
// 69a: bipush 0
// 69b: aconst_null
// 69c: bipush 0
// 69d: sipush 32759
// 6a0: ldc2_w 1812204628834234398
// 6a3: lload 5
// 6a5: lxor
// 6a6: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ab: aconst_null
// 6ac: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 6af: iload 60
// 6b1: lload 18
// 6b3: bipush 0
// 6b4: aconst_null
// 6b5: bipush 1
// 6b6: sipush 1424
// 6b9: ldc2_w 4356307465454078586
// 6bc: lload 5
// 6be: lxor
// 6bf: invokedynamic w (IJ)I bsm=su/catlean/f1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c4: aconst_null
// 6c5: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 6c8: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 6cb: bipush 0
// 6cc: invokevirtual su/catlean/_n.m (Z)V
// 6cf: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 6d2: new su/catlean/_w
// 6d5: dup
// 6d6: aload 0
// 6d7: iload 30
// 6d9: i2c
// 6da: iload 31
// 6dc: iload 32
// 6de: i2c
// 6df: invokespecial su/catlean/f1.S (CIC)F
// 6e2: aload 0
// 6e3: lload 22
// 6e5: invokespecial su/catlean/f1.M (J)F
// 6e8: lload 46
// 6ea: dup2_x1
// 6eb: pop2
// 6ec: bipush 0
// 6ed: getstatic su/catlean/z3.FORCE Lsu/catlean/z3;
// 6f0: bipush 4
// 6f1: aconst_null
// 6f2: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 6f5: bipush 0
// 6f6: lload 9
// 6f8: dup2_x2
// 6f9: pop2
// 6fa: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 6fd: return
}

@Override
public void m(char var1, int var2, short var3) {
}

@Override
public void b(long var1) {
}

private final boolean H(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f1.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 58754572677795
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w 3355732637121197646
// 011: lload 1
// 012: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: astore 5
// 019: lload 3
// 01a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 01d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 020: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 023: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 026: aload 5
// 028: ifnonnull 127
// 02b: ifne 126
// 02e: goto 03b
// 031: ldc2_w 3371741831464621734
// 034: lload 1
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: lload 3
// 03c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 042: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 045: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 048: aload 5
// 04a: ifnonnull 127
// 04d: goto 05a
// 050: ldc2_w 3371741831464621734
// 053: lload 1
// 054: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: athrow
// 05a: ifne 126
// 05d: goto 06a
// 060: ldc2_w 3371741831464621734
// 063: lload 1
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: lload 3
// 06b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 071: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 074: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 077: aload 5
// 079: ifnonnull 127
// 07c: goto 089
// 07f: ldc2_w 3371741831464621734
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: ifne 126
// 08c: goto 099
// 08f: ldc2_w 3371741831464621734
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: lload 3
// 09a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 09d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0a0: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 0a3: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0a6: aload 5
// 0a8: ifnonnull 127
// 0ab: goto 0b8
// 0ae: ldc2_w 3371741831464621734
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: ifne 126
// 0bb: goto 0c8
// 0be: ldc2_w 3371741831464621734
// 0c1: lload 1
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: lload 3
// 0c9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cc: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0cf: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0d2: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0d5: aload 5
// 0d7: ifnonnull 127
// 0da: goto 0e7
// 0dd: ldc2_w 3371741831464621734
// 0e0: lload 1
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: ifne 126
// 0ea: goto 0f7
// 0ed: ldc2_w 3371741831464621734
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: lload 3
// 0f8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0fb: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0fe: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 101: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 104: aload 5
// 106: ifnonnull 127
// 109: goto 116
// 10c: ldc2_w 3371741831464621734
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: ifeq 12a
// 119: goto 126
// 11c: ldc2_w 3371741831464621734
// 11f: lload 1
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: bipush 1
// 127: goto 12b
// 12a: bipush 0
// 12b: ireturn
}

private final float S(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
int var6 = (int)((var4 ^ 70201066906287L) >>> 32);
long var7 = (var4 ^ 70201066906287L) << 32 >>> 32;
return dm.h.b(var6, var7);
}

private final float M(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f1.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 37144361699514
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 74629662007886
// 11: lxor
// 12: lstore 5
// 14: dup2
// 15: ldc2_w 1571182741148
// 18: lxor
// 19: lstore 7
// 1b: pop2
// 1c: ldc2_w -3132005419202261929
// 1f: lload 1
// 20: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25: astore 9
// 27: lload 3
// 28: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2e: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 31: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 34: aload 9
// 36: ifnonnull 65
// 39: ifeq 58
// 3c: goto 49
// 3f: ldc2_w -3110929666553877313
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: ldc -90.0
// 4b: goto b0
// 4e: ldc2_w -3110929666553877313
// 51: lload 1
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: lload 3
// 59: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 5f: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 62: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 65: lload 1
// 66: lconst_0
// 67: lcmp
// 68: ifle 97
// 6b: aload 9
// 6d: ifnonnull 97
// 70: ifeq 8f
// 73: goto 80
// 76: ldc2_w -3110929666553877313
// 79: lload 1
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: ldc 90.0
// 82: goto b0
// 85: ldc2_w -3110929666553877313
// 88: lload 1
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 92: lload 5
// 94: invokevirtual su/catlean/ut.Fn (J)Z
// 97: ifne a8
// 9a: fconst_0
// 9b: goto b0
// 9e: ldc2_w -3110929666553877313
// a1: lload 1
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: lload 7
// aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// ad: invokevirtual net/minecraft/class_746.method_36455 ()F
// b0: freturn
}

@Override
public void U(long a, @NotNull FireWorkVelocityEvent e) {
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
// 002: ldc2_w 41654020828972
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 42411159857622
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 10903048792458
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 49306664467385
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 87862280744679
// 021: lxor
// 022: lstore 12
// 024: pop2
// 025: ldc2_w -6220091074226179726
// 028: lload 1
// 029: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: aload 3
// 02f: ldc "e"
// 031: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 034: astore 14
// 036: aload 3
// 037: invokevirtual su/catlean/api/event/events/world/FireWorkVelocityEvent.cancel ()V
// 03a: getstatic su/catlean/api/event/events/world/FireWorkVectorEvent.INSTANCE Lsu/catlean/api/event/events/world/FireWorkVectorEvent;
// 03d: aload 14
// 03f: ifnonnull 07e
// 042: lload 10
// 044: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 047: invokevirtual net/minecraft/class_746.method_5720 ()Lnet/minecraft/class_243;
// 04a: dup
// 04b: sipush 5391
// 04e: ldc2_w 6279540721844924030
// 051: lload 1
// 052: lxor
// 053: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/f1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05b: invokevirtual su/catlean/api/event/events/world/FireWorkVectorEvent.call (Lnet/minecraft/class_243;)Z
// 05e: ifeq 084
// 061: goto 06e
// 064: ldc2_w -6199508049151487590
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: getstatic su/catlean/api/event/events/world/FireWorkVectorEvent.INSTANCE Lsu/catlean/api/event/events/world/FireWorkVectorEvent;
// 071: goto 07e
// 074: ldc2_w -6199508049151487590
// 077: lload 1
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: invokevirtual su/catlean/api/event/events/world/FireWorkVectorEvent.getVector ()Lnet/minecraft/class_243;
// 081: goto 09d
// 084: lload 10
// 086: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 089: invokevirtual net/minecraft/class_746.method_5720 ()Lnet/minecraft/class_243;
// 08c: dup
// 08d: sipush 26485
// 090: ldc2_w 3245637858002656263
// 093: lload 1
// 094: lxor
// 095: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/f1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09d: astore 15
// 09f: lload 1
// 0a0: lconst_0
// 0a1: lcmp
// 0a2: ifle 0b6
// 0a5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0a8: lload 6
// 0aa: invokevirtual su/catlean/ut.Ff (J)Z
// 0ad: ifeq 0c3
// 0b0: aload 0
// 0b1: lload 8
// 0b3: invokespecial su/catlean/f1.Y (J)V
// 0b6: goto 0c3
// 0b9: ldc2_w -6199508049151487590
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: aload 15
// 0c5: getfield net/minecraft/class_243.field_1351 D
// 0c8: aload 15
// 0ca: getfield net/minecraft/class_243.field_1352 D
// 0cd: aload 15
// 0cf: getfield net/minecraft/class_243.field_1350 D
// 0d2: invokestatic java/lang/Math.hypot (DD)D
// 0d5: invokestatic java/lang/Math.atan2 (DD)D
// 0d8: dneg
// 0d9: invokestatic java/lang/Math.toDegrees (D)D
// 0dc: d2f
// 0dd: invokestatic java/lang/Math.abs (F)F
// 0e0: fstore 16
// 0e2: getstatic su/catlean/us.z Lsu/catlean/us;
// 0e5: lload 12
// 0e7: invokevirtual su/catlean/us.f (J)Z
// 0ea: aload 14
// 0ec: lload 1
// 0ed: lconst_0
// 0ee: lcmp
// 0ef: iflt 122
// 0f2: ifnonnull 11a
// 0f5: ifne 135
// 0f8: goto 105
// 0fb: ldc2_w -6199508049151487590
// 0fe: lload 1
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 108: lload 4
// 10a: invokevirtual su/catlean/ut.kZ (J)Z
// 10d: goto 11a
// 110: ldc2_w -6199508049151487590
// 113: lload 1
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: lload 1
// 11b: lconst_0
// 11c: lcmp
// 11d: ifle 14c
// 120: aload 14
// 122: ifnonnull 14c
// 125: ifne 144
// 128: goto 135
// 12b: ldc2_w -6199508049151487590
// 12e: lload 1
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: ldc 0.1
// 137: goto 277
// 13a: ldc2_w -6199508049151487590
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 147: lload 6
// 149: invokevirtual su/catlean/ut.Ff (J)Z
// 14c: ifeq 15f
// 14f: getstatic su/catlean/f1.q Ljava/util/HashMap;
// 152: goto 165
// 155: ldc2_w -6199508049151487590
// 158: lload 1
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 162: invokevirtual su/catlean/uy.Pd ()Ljava/util/HashMap;
// 165: checkcast java/util/Map
// 168: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 16d: checkcast java/lang/Iterable
// 170: astore 19
// 172: aload 19
// 174: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 179: astore 20
// 17b: aload 20
// 17d: aload 14
// 17f: ifnonnull 1ac
// 182: invokeinterface java/util/Iterator.hasNext ()Z 1
// 187: ifne 1a5
// 18a: goto 197
// 18d: ldc2_w -6199508049151487590
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: aconst_null
// 198: goto 240
// 19b: ldc2_w -6199508049151487590
// 19e: lload 1
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: aload 20
// 1a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ac: astore 21
// 1ae: aload 20
// 1b0: aload 14
// 1b2: ifnonnull 1db
// 1b5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ba: ifne 1d9
// 1bd: goto 1ca
// 1c0: ldc2_w -6199508049151487590
// 1c3: lload 1
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 21
// 1cc: goto 240
// 1cf: ldc2_w -6199508049151487590
// 1d2: lload 1
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: aload 21
// 1db: checkcast java/util/Map$Entry
// 1de: astore 22
// 1e0: bipush 0
// 1e1: istore 23
// 1e3: fload 16
// 1e5: aload 22
// 1e7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 1ec: checkcast java/lang/Number
// 1ef: invokevirtual java/lang/Number.floatValue ()F
// 1f2: fsub
// 1f3: invokestatic java/lang/Math.abs (F)F
// 1f6: nop
// 1f7: fstore 22
// 1f9: aload 20
// 1fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 200: astore 23
// 202: aload 23
// 204: checkcast java/util/Map$Entry
// 207: astore 24
// 209: bipush 0
// 20a: istore 25
// 20c: fload 16
// 20e: aload 24
// 210: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 215: checkcast java/lang/Number
// 218: invokevirtual java/lang/Number.floatValue ()F
// 21b: fsub
// 21c: invokestatic java/lang/Math.abs (F)F
// 21f: nop
// 220: fstore 24
// 222: fload 22
// 224: fload 24
// 226: invokestatic java/lang/Float.compare (FF)I
// 229: ifle 234
// 22c: aload 23
// 22e: astore 21
// 230: fload 24
// 232: fstore 22
// 234: aload 20
// 236: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23b: ifne 1f9
// 23e: aload 21
// 240: checkcast java/util/Map$Entry
// 243: aload 14
// 245: ifnonnull 26b
// 248: dup
// 249: ifnull 274
// 24c: goto 259
// 24f: ldc2_w -6199508049151487590
// 252: lload 1
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 25e: goto 26b
// 261: ldc2_w -6199508049151487590
// 264: lload 1
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: checkcast java/lang/Number
// 26e: invokevirtual java/lang/Number.floatValue ()F
// 271: goto 277
// 274: pop
// 275: ldc 0.1
// 277: fstore 17
// 279: ldc 1.5
// 27b: fstore 18
// 27d: aload 3
// 27e: lload 10
// 280: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 283: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 286: aload 15
// 288: getfield net/minecraft/class_243.field_1352 D
// 28b: fload 17
// 28d: f2d
// 28e: dmul
// 28f: aload 15
// 291: getfield net/minecraft/class_243.field_1352 D
// 294: fload 18
// 296: f2d
// 297: dmul
// 298: lload 10
// 29a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29d: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2a0: getfield net/minecraft/class_243.field_1352 D
// 2a3: dsub
// 2a4: ldc2_w 0.5
// 2a7: dmul
// 2a8: dadd
// 2a9: aload 15
// 2ab: getfield net/minecraft/class_243.field_1351 D
// 2ae: fload 17
// 2b0: f2d
// 2b1: dmul
// 2b2: aload 15
// 2b4: getfield net/minecraft/class_243.field_1351 D
// 2b7: fload 18
// 2b9: f2d
// 2ba: dmul
// 2bb: lload 10
// 2bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c0: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2c3: getfield net/minecraft/class_243.field_1351 D
// 2c6: dsub
// 2c7: ldc2_w 0.5
// 2ca: dmul
// 2cb: dadd
// 2cc: aload 15
// 2ce: getfield net/minecraft/class_243.field_1350 D
// 2d1: fload 17
// 2d3: f2d
// 2d4: dmul
// 2d5: aload 15
// 2d7: getfield net/minecraft/class_243.field_1350 D
// 2da: fload 18
// 2dc: f2d
// 2dd: dmul
// 2de: lload 10
// 2e0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e3: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2e6: getfield net/minecraft/class_243.field_1350 D
// 2e9: dsub
// 2ea: ldc2_w 0.5
// 2ed: dmul
// 2ee: dadd
// 2ef: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 2f2: invokevirtual su/catlean/api/event/events/world/FireWorkVelocityEvent.setVelocity (Lnet/minecraft/class_243;)V
// 2f5: lload 1
// 2f6: lconst_0
// 2f7: lcmp
// 2f8: ifle 30d
// 2fb: aload 14
// 2fd: ifnull 31a
// 300: bipush 3
// 301: anewarray 667
// 304: ldc2_w -6200990853123824692
// 307: lload 1
// 308: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: goto 31a
// 310: ldc2_w -6199508049151487590
// 313: lload 1
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: return
}

@Override
public void s(@NotNull SetPoseEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
ex.cancel();
ex.setPose(class_4050.field_18076);
}

@Override
public void k(long a, @NotNull ReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: ldc2_w -1507329089342344245
// 003: lload 1
// 004: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 3
// 00a: ldc "e"
// 00c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 00f: astore 4
// 011: aload 3
// 012: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 015: aload 4
// 017: ifnonnull 03e
// 01a: instanceof net/minecraft/class_2767
// 01d: ifeq 1c3
// 020: goto 02d
// 023: ldc2_w -1490756945379863773
// 026: lload 1
// 027: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: athrow
// 02d: aload 3
// 02e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 031: goto 03e
// 034: ldc2_w -1490756945379863773
// 037: lload 1
// 038: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: athrow
// 03e: checkcast net/minecraft/class_2767
// 041: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 044: dup
// 045: sipush 5235
// 048: ldc2_w 3176232842188549567
// 04b: lload 1
// 04c: lxor
// 04d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/f1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 055: astore 5
// 057: aload 5
// 059: getstatic net/minecraft/class_3417.field_14966 Lnet/minecraft/class_6880;
// 05c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 05f: aload 4
// 061: lload 1
// 062: lconst_0
// 063: lcmp
// 064: iflt 091
// 067: ifnonnull 08f
// 06a: ifne 1b2
// 06d: goto 07a
// 070: ldc2_w -1490756945379863773
// 073: lload 1
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: aload 5
// 07c: getstatic net/minecraft/class_3417.field_21866 Lnet/minecraft/class_6880;
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 082: goto 08f
// 085: ldc2_w -1490756945379863773
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: aload 4
// 091: lload 1
// 092: lconst_0
// 093: lcmp
// 094: iflt 0c1
// 097: ifnonnull 0bf
// 09a: ifne 1b2
// 09d: goto 0aa
// 0a0: ldc2_w -1490756945379863773
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: aload 5
// 0ac: getstatic net/minecraft/class_3417.field_15103 Lnet/minecraft/class_6880;
// 0af: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b2: goto 0bf
// 0b5: ldc2_w -1490756945379863773
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: aload 4
// 0c1: lload 1
// 0c2: lconst_0
// 0c3: lcmp
// 0c4: ifle 0f1
// 0c7: ifnonnull 0ef
// 0ca: ifne 1b2
// 0cd: goto 0da
// 0d0: ldc2_w -1490756945379863773
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 5
// 0dc: getstatic net/minecraft/class_3417.field_14761 Lnet/minecraft/class_6880;
// 0df: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e2: goto 0ef
// 0e5: ldc2_w -1490756945379863773
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 4
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: ifle 121
// 0f7: ifnonnull 11f
// 0fa: ifne 1b2
// 0fd: goto 10a
// 100: ldc2_w -1490756945379863773
// 103: lload 1
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: aload 5
// 10c: getstatic net/minecraft/class_3417.field_14862 Lnet/minecraft/class_6880;
// 10f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 112: goto 11f
// 115: ldc2_w -1490756945379863773
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 4
// 121: lload 1
// 122: lconst_0
// 123: lcmp
// 124: ifle 151
// 127: ifnonnull 14f
// 12a: ifne 1b2
// 12d: goto 13a
// 130: ldc2_w -1490756945379863773
// 133: lload 1
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: aload 5
// 13c: getstatic net/minecraft/class_3417.field_14883 Lnet/minecraft/class_6880;
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 142: goto 14f
// 145: ldc2_w -1490756945379863773
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 4
// 151: lload 1
// 152: lconst_0
// 153: lcmp
// 154: iflt 187
// 157: ifnonnull 17f
// 15a: ifne 1b2
// 15d: goto 16a
// 160: ldc2_w -1490756945379863773
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: aload 5
// 16c: getstatic net/minecraft/class_3417.field_15191 Lnet/minecraft/class_6880;
// 16f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 172: goto 17f
// 175: ldc2_w -1490756945379863773
// 178: lload 1
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: lload 1
// 180: lconst_0
// 181: lcmp
// 182: ifle 1af
// 185: aload 4
// 187: ifnonnull 1af
// 18a: ifne 1b2
// 18d: goto 19a
// 190: ldc2_w -1490756945379863773
// 193: lload 1
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: aload 5
// 19c: getstatic net/minecraft/class_3417.field_14581 Lnet/minecraft/class_6880;
// 19f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1a2: goto 1af
// 1a5: ldc2_w -1490756945379863773
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: ifeq 1c3
// 1b2: aload 3
// 1b3: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 1b6: goto 1c3
// 1b9: ldc2_w -1490756945379863773
// 1bc: lload 1
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: return
}

private final void Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 116383164490610L;
long var5 = var1 ^ 95433713734633L;
long var10001 = var1 ^ 18196977287126L;
int var7 = (int)((var1 ^ 18196977287126L) >>> 48);
int var8 = (int)((var1 ^ 18196977287126L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
var10001 = var1 ^ 59293617426854L;
int var10 = (int)((var1 ^ 59293617426854L) >>> 48);
int var11 = (int)((var1 ^ 59293617426854L) << 16 >>> 48);
int var12 = (int)(var10001 << 32 >>> 32);
long var13 = var1 ^ 130572373611079L;
long var15 = var1 ^ 3492068465446L;
long var17 = var1 ^ 6720971746324L;
var10001 = var1 ^ 128784835606131L;
int var19 = (int)((var1 ^ 128784835606131L) >>> 32);
int var20 = (int)((var1 ^ 128784835606131L) << 32 >>> 56);
int var21 = (int)(var10001 << 40 >>> 40);
long var22 = var1 ^ 132286606331425L;
long var24 = var1 ^ 15723418250839L;
long var26 = var1 ^ 130608421455186L;
long var28 = var1 ^ 48393167326477L;
long var30 = var1 ^ 26212053297292L;
var10001 = var1 ^ 18429995160687L;
int var32 = (int)((var1 ^ 18429995160687L) >>> 32);
int var33 = (int)((var1 ^ 18429995160687L) << 32 >>> 48);
int var34 = (int)(var10001 << 48 >>> 48);
long var35 = var1 ^ 17868586242319L;
long var37 = var1 ^ 74264264942000L;
long var39 = var1 ^ 11273757207634L;
int var41 = (int)((var1 ^ 138518237534820L) >>> 32);
long var42 = (var1 ^ 138518237534820L) << 32 >>> 32;
int var44 = (int)((var1 ^ 78351012746693L) >>> 48);
long var45 = (var1 ^ 78351012746693L) << 16 >>> 16;
Pair[] var47 = new Pair[b<"w">(31136, 7965884954624580415L ^ var1)];
var47[0] = TuplesKt.to(0.0F, ut.D.L(var32, (short)var33, var34));
var47[1] = TuplesKt.to(5.0F, ut.D.q((short)var10, (short)var11, var12));
var47[2] = TuplesKt.to(10.0F, ut.D.kd(var22));
var47[3] = TuplesKt.to(15.0F, ut.D.j((char)var44, var45));
var47[4] = TuplesKt.to(20.0F, ut.D.FO(var39));
var47[5] = TuplesKt.to(25.0F, ut.D.kU(var19, (byte)var20, var21));
var47[b<"w">(21852, 4960437328930174941L ^ var1)] = TuplesKt.to(30.0F, ut.D.kf(var41, var42));
var47[b<"w">(29358, 5500236984139042862L ^ var1)] = TuplesKt.to(35.0F, ut.D.ke(var3));
var47[b<"w">(18027, 8252624112797312237L ^ var1)] = TuplesKt.to(40.0F, ut.D.kz((short)var7, var8, var9));
var47[b<"w">(8900, 5186241128386920527L ^ var1)] = TuplesKt.to(45.0F, ut.D.F2(var24));
var47[b<"w">(25395, 6632180893947642299L ^ var1)] = TuplesKt.to(50.0F, ut.D.F4(var35));
var47[b<"w">(27074, 4119650263300623184L ^ var1)] = TuplesKt.to(55.0F, ut.D.I(var13));
var47[b<"w">(19225, 6203324189825853826L ^ var1)] = TuplesKt.to(60.0F, ut.D.Y(var37));
var47[b<"w">(26606, 77781414938461552L ^ var1)] = TuplesKt.to(65.0F, ut.D.A(var17));
var47[b<"w">(22318, 1306806976334493092L ^ var1)] = TuplesKt.to(70.0F, ut.D.Fk(var26));
var47[b<"w">(10044, 1245249259986027966L ^ var1)] = TuplesKt.to(75.0F, ut.D.kW(var5));
var47[b<"w">(22498, 3537404884905096555L ^ var1)] = TuplesKt.to(80.0F, ut.D.kN(var28));
var47[b<"w">(29678, 2827555243531784546L ^ var1)] = TuplesKt.to(85.0F, ut.D.Q(var15));
var47[b<"w">(15925, 109815928240610479L ^ var1)] = TuplesKt.to(90.0F, ut.D.FP(var30));
q = MapsKt.hashMapOf(var47);
}

private static final void d() {
long var0 = a ^ 116593732615746L;
long var2 = var0 ^ 71899295994220L;
long var10001 = var0 ^ 91520306024262L;
int var4 = (int)((var0 ^ 91520306024262L) >>> 48);
int var5 = (int)((var0 ^ 91520306024262L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);

try {
if (!bx.k((short)var4, var5, (char)var6, b<"w">(4145, 7325022311491161532L ^ var0))) {
zf.F(var2).field_1690.field_1903.method_23481(false);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -8285038508534942359L, var0);
}
}

static {
long var20 = a ^ 93866500815563L;
long var22 = var20 ^ 82590495432360L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "@\u0095ÐÐ\b\u0016ñ\u0000\u001c«\u008e\u0017å£ÑÓ\u00adô\u0010mÑ\u0013HãéØ\u008czÝ#b Ì®®@I#ü¸ î,ÏF?óz\u001f\u0019Dfy@ ðeEe\u0091\u001fö]F\u0089Q¡¨¼2\u009dÑ3\u0010ÝäÊ¨O>ÌÅ,O?Râ\u0016,u";
int var17 = "@\u0095ÐÐ\b\u0016ñ\u0000\u001c«\u008e\u0017å£ÑÓ\u00adô\u0010mÑ\u0013HãéØ\u008czÝ#b Ì®®@I#ü¸ î,ÏF?óz\u001f\u0019Dfy@ ðeEe\u0091\u001fö]F\u0089Q¡¨¼2\u009dÑ3\u0010ÝäÊ¨O>ÌÅ,O?Râ\u0016,u"
.length();
char var14 = '(';
int var27 = -1;

label54:
while (true) {
String var28 = var15.substring(++var27, var27 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var40;
if ((var27 += var14) >= var17) {
b = var18;
c = new String[5];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[31];
int var3 = 0;
String var4 = "\t4,ìÈ\u009e\u001b,Þk(\u008dwïf\u009dÐu¡\u0010\u0018ß.Û0\u0000\u0017NøxiZ]i)zç\u0090\u0003 A¼Ò´\u0085Ã½Dr:@¬pÍ\u0018\u00ad\tÕ®ÐÎ\u0005Û\u0012¨\u00118\u008aÓ)CgS\u008bd?\u0094jöÂ´¢{|Ä\u009f`Èã¬égØ\u0000\u007f2\u0088Ä\u001cÁZ'{Z\u0005\u0006]\u001ew\u0017²\u009e¢þÛ\u0099óiÒÌnÈw(¹ÀU\u001f|Ê\rÝÅ\u0011[q\u000bÛ\u008br\u0086Eõ§òÙµ¶Ô\u009c&Ñ?¿w\u0002\n\u000fGNHp\u0001\u008bãèæmPÝ\u0088\u0007}¶':ï¤<´yOî>\u0082\u0090\u000eà\u000ef÷d\u008d\u000b\u001ep\u009fKÆërYtsZsªPr¨Øç\u0003L\u000eÀR8&\u0003eõ\u0088[]c\u0082f¹\u0096OG";
int var5 = "\t4,ìÈ\u009e\u001b,Þk(\u008dwïf\u009dÐu¡\u0010\u0018ß.Û0\u0000\u0017NøxiZ]i)zç\u0090\u0003 A¼Ò´\u0085Ã½Dr:@¬pÍ\u0018\u00ad\tÕ®ÐÎ\u0005Û\u0012¨\u00118\u008aÓ)CgS\u008bd?\u0094jöÂ´¢{|Ä\u009f`Èã¬égØ\u0000\u007f2\u0088Ä\u001cÁZ'{Z\u0005\u0006]\u001ew\u0017²\u009e¢þÛ\u0099óiÒÌnÈw(¹ÀU\u001f|Ê\rÝÅ\u0011[q\u000bÛ\u008br\u0086Eõ§òÙµ¶Ô\u009c&Ñ?¿w\u0002\n\u000fGNHp\u0001\u008bãèæmPÝ\u0088\u0007}¶':ï¤<´yOî>\u0082\u0090\u000eà\u000ef÷d\u008d\u000b\u001ep\u009fKÆërYtsZsªPr¨Øç\u0003L\u000eÀR8&\u0003eõ\u0088[]c\u0082f¹\u0096OG"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
var10001 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var10001] = var49;
if (var2 >= var5) {
e = var6;
g = new Integer[31];
x = new f1();
U = new i9(var22);
long var38 = 864378471891771724L ^ var20;
r = new i9(var22);
Pair[] var24 = new Pair[b<"w">(30805, var38)];
var24[0] = TuplesKt.to(0.0F, 0.155F);
var24[1] = TuplesKt.to(5.0F, 0.16F);
var24[2] = TuplesKt.to(10.0F, 0.19F);
var24[3] = TuplesKt.to(15.0F, 0.22F);
var24[4] = TuplesKt.to(20.0F, 0.22F);
var24[5] = TuplesKt.to(25.0F, 0.27F);
var24[b<"w">(1424, 4356296738335087763L ^ var20)] = TuplesKt.to(30.0F, 0.28F);
var24[b<"w">(9148, 633799040485620399L ^ var20)] = TuplesKt.to(35.0F, 0.34F);
var24[b<"w">(22701, 784542286233993647L ^ var20)] = TuplesKt.to(40.0F, 0.37F);
var24[b<"w">(32542, 8131882332865603078L ^ var20)] = TuplesKt.to(45.0F, 0.37F);
var24[b<"w">(3116, 6355178752879908131L ^ var20)] = TuplesKt.to(50.0F, 0.34F);
var24[b<"w">(10171, 159075615167938229L ^ var20)] = TuplesKt.to(55.0F, 0.34F);
var24[b<"w">(17995, 3632313066900922201L ^ var20)] = TuplesKt.to(60.0F, 0.2F);
var24[b<"w">(15338, 2839441529515107070L ^ var20)] = TuplesKt.to(65.0F, 0.18F);
var24[b<"w">(32759, 1812176309323409143L ^ var20)] = TuplesKt.to(70.0F, 0.16F);
var24[b<"w">(1468, 4165373093481274555L ^ var20)] = TuplesKt.to(75.0F, 0.16F);
var24[b<"w">(16001, 751273825723082635L ^ var20)] = TuplesKt.to(80.0F, 0.13F);
var24[b<"w">(12552, 6949197279833352210L ^ var20)] = TuplesKt.to(85.0F, 0.13F);
var24[b<"w">(8696, 1789049030086392062L ^ var20)] = TuplesKt.to(90.0F, 0.13F);
q = MapsKt.hashMapOf(var24);
return;
}
break;
default:
var31[var10001] = var49;
if (var2 < var5) {
continue label36;
}

var4 = "¦Y?\u008d\u0004\u0016\u00133Ï®\u001eÂ.\u008aO ";
var5 = "¦Y?\u008d\u0004\u0016\u00133Ï®\u001eÂ.\u008aO ".length();
var2 = 0;
}

byte var37 = var2;
var2 += 8;
var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
var31 = var6;
var10001 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var14 = var15.charAt(var27);
break;
default:
var18[var16++] = var40;
if ((var27 += var14) < var17) {
var14 = var15.charAt(var27);
continue label54;
}

var15 = "\u0014\u0099ÔöI\u00991r\u0080ÿB\u00832¡tº\u0014Ar(\u0087\u0001<ÿ\u0089xjð\u008ar\u00826H÷ðÁ8V3Æ ò\u0084ßåN;´T×kè\u0002ý\u009f3\u009bú{[jÓ'½\u008dm@Y½»&\u0003P";
var17 = "\u0014\u0099ÔöI\u00991r\u0080ÿB\u00832¡tº\u0014Ar(\u0087\u0001<ÿ\u0089xjð\u008ar\u00826H÷ðÁ8V3Æ ò\u0084ßåN;´T×kè\u0002ý\u009f3\u009bú{[jÓ'½\u008dm@Y½»&\u0003P"
.length();
var14 = '(';
var27 = -1;
}

var28 = var15.substring(++var27, var27 + var14);
var10001 = 0;
}
}
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5031;
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
throw new RuntimeException("su/catlean/f1", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/f1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20899;
if (g[var3] == null) {
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
throw new RuntimeException("su/catlean/f1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/f1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
