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

public final class pu implements jr {
@NotNull
public static final pu Q;
@NotNull
private static final bg k;
@NotNull
private static final bg m;
private static final String[] a;
private static final String[] b;
private static final Map c = new HashMap(13);
private static final long[] d;
private static final Integer[] e;
private static final Map f;

private pu() {
}

@NotNull
public final bg k() {
return k;
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
// 009: ldc2_w 101871953768817
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 2350125969345
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 28393686283084
// 01a: lxor
// 01b: dup2
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 10
// 022: dup2
// 023: bipush 16
// 025: lshl
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 32
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: pop2
// 037: dup2
// 038: ldc2_w 34895964612476
// 03b: lxor
// 03c: dup2
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 13
// 043: dup2
// 044: bipush 16
// 046: lshl
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 14
// 04d: dup2
// 04e: bipush 48
// 050: lshl
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 15
// 057: pop2
// 058: dup2
// 059: ldc2_w 95174287896623
// 05c: lxor
// 05d: lstore 16
// 05f: dup2
// 060: ldc2_w 43766790553018
// 063: lxor
// 064: lstore 18
// 066: dup2
// 067: ldc2_w 92960854389321
// 06a: lxor
// 06b: lstore 20
// 06d: dup2
// 06e: ldc2_w 95510200616042
// 071: lxor
// 072: lstore 22
// 074: pop2
// 075: ldc2_w 6232619157977255585
// 078: lload 1
// 079: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: aload 3
// 07f: ldc "e"
// 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 084: astore 24
// 086: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 089: iload 13
// 08b: i2s
// 08c: iload 14
// 08e: iload 15
// 090: i2s
// 091: invokevirtual su/catlean/ut.B (SIS)Z
// 094: aload 24
// 096: ifnonnull 0d7
// 099: ifeq 0cf
// 09c: goto 0a9
// 09f: ldc2_w 6251363571971914119
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0ac: lload 6
// 0ae: invokevirtual su/catlean/ut.FX (J)Lsu/catlean/dz;
// 0b1: getstatic su/catlean/dz.BOOST Lsu/catlean/dz;
// 0b4: if_acmpne 0cf
// 0b7: goto 0c4
// 0ba: ldc2_w 6251363571971914119
// 0bd: lload 1
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: return
// 0c5: ldc2_w 6251363571971914119
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: lload 22
// 0d1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d4: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0d7: aload 24
// 0d9: lload 1
// 0da: lconst_0
// 0db: lcmp
// 0dc: iflt 110
// 0df: ifnonnull 10e
// 0e2: ifeq 106
// 0e5: goto 0f2
// 0e8: ldc2_w 6251363571971914119
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0f5: bipush 1
// 0f6: invokevirtual su/catlean/ut.E (Z)V
// 0f9: goto 106
// 0fc: ldc2_w 6251363571971914119
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 109: lload 20
// 10b: invokevirtual su/catlean/ut.F6 (J)Z
// 10e: aload 24
// 110: lload 1
// 111: lconst_0
// 112: lcmp
// 113: iflt 14f
// 116: ifnonnull 14d
// 119: ifne 145
// 11c: goto 129
// 11f: ldc2_w 6251363571971914119
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 12c: lload 22
// 12e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 131: invokevirtual net/minecraft/class_746.method_23318 ()D
// 134: d2f
// 135: invokevirtual su/catlean/ut.K (F)V
// 138: goto 145
// 13b: ldc2_w 6251363571971914119
// 13e: lload 1
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: lload 22
// 147: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14a: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 14d: aload 24
// 14f: lload 1
// 150: lconst_0
// 151: lcmp
// 152: iflt 17f
// 155: ifnonnull 17d
// 158: ifne 369
// 15b: goto 168
// 15e: ldc2_w 6251363571971914119
// 161: lload 1
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 16b: lload 8
// 16d: invokevirtual su/catlean/ut.FR (J)Z
// 170: goto 17d
// 173: ldc2_w 6251363571971914119
// 176: lload 1
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 24
// 17f: lload 1
// 180: lconst_0
// 181: lcmp
// 182: iflt 1ad
// 185: ifnonnull 1ab
// 188: ifeq 369
// 18b: goto 198
// 18e: ldc2_w 6251363571971914119
// 191: lload 1
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 19b: invokevirtual su/catlean/ut.Fb ()Z
// 19e: goto 1ab
// 1a1: ldc2_w 6251363571971914119
// 1a4: lload 1
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: aload 24
// 1ad: ifnonnull 267
// 1b0: ifeq 25f
// 1b3: goto 1c0
// 1b6: ldc2_w 6251363571971914119
// 1b9: lload 1
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: lload 22
// 1c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c5: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1c8: aload 24
// 1ca: ifnonnull 267
// 1cd: goto 1da
// 1d0: ldc2_w 6251363571971914119
// 1d3: lload 1
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: ifne 25f
// 1dd: goto 1ea
// 1e0: ldc2_w 6251363571971914119
// 1e3: lload 1
// 1e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: athrow
// 1ea: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1ed: invokevirtual su/catlean/dm.o ()D
// 1f0: dconst_0
// 1f1: dcmpl
// 1f2: aload 24
// 1f4: ifnonnull 267
// 1f7: goto 204
// 1fa: ldc2_w 6251363571971914119
// 1fd: lload 1
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: ifle 25f
// 207: goto 214
// 20a: ldc2_w 6251363571971914119
// 20d: lload 1
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 217: iload 10
// 219: i2s
// 21a: iload 11
// 21c: i2c
// 21d: iload 12
// 21f: invokevirtual su/catlean/ut.kC (SCI)Z
// 222: aload 24
// 224: lload 1
// 225: lconst_0
// 226: lcmp
// 227: ifle 269
// 22a: ifnonnull 267
// 22d: goto 23a
// 230: ldc2_w 6251363571971914119
// 233: lload 1
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: ifeq 25f
// 23d: goto 24a
// 240: ldc2_w 6251363571971914119
// 243: lload 1
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 24d: ldc 0.3
// 24f: invokevirtual su/catlean/tq.x (F)V
// 252: goto 25f
// 255: ldc2_w 6251363571971914119
// 258: lload 1
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: lload 22
// 261: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 264: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 267: aload 24
// 269: lload 1
// 26a: lconst_0
// 26b: lcmp
// 26c: iflt 29f
// 26f: ifnonnull 29d
// 272: ifne 369
// 275: goto 282
// 278: ldc2_w 6251363571971914119
// 27b: lload 1
// 27c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: athrow
// 282: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 285: iload 10
// 287: i2s
// 288: iload 11
// 28a: i2c
// 28b: iload 12
// 28d: invokevirtual su/catlean/ut.kC (SCI)Z
// 290: goto 29d
// 293: ldc2_w 6251363571971914119
// 296: lload 1
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: aload 24
// 29f: lload 1
// 2a0: lconst_0
// 2a1: lcmp
// 2a2: ifle 2d4
// 2a5: ifnonnull 2d2
// 2a8: ifeq 369
// 2ab: goto 2b8
// 2ae: ldc2_w 6251363571971914119
// 2b1: lload 1
// 2b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b7: athrow
// 2b8: lload 22
// 2ba: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2bd: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2c0: invokevirtual net/minecraft/class_243.method_10214 ()D
// 2c3: dconst_0
// 2c4: dcmpg
// 2c5: goto 2d2
// 2c8: ldc2_w 6251363571971914119
// 2cb: lload 1
// 2cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: athrow
// 2d2: aload 24
// 2d4: ifnonnull 329
// 2d7: ifge 369
// 2da: goto 2e7
// 2dd: ldc2_w 6251363571971914119
// 2e0: lload 1
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2ea: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 2ed: aload 24
// 2ef: ifnonnull 366
// 2f2: goto 2ff
// 2f5: ldc2_w 6251363571971914119
// 2f8: lload 1
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: sipush 29455
// 302: ldc2_w 8900647818683408386
// 305: lload 1
// 306: lxor
// 307: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: i2f
// 30d: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 310: lload 4
// 312: invokevirtual su/catlean/ut.FV (J)F
// 315: fmul
// 316: f2i
// 317: lload 18
// 319: invokevirtual su/catlean/bg.c (IJ)Z
// 31c: goto 329
// 31f: ldc2_w 6251363571971914119
// 322: lload 1
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: ifne 32d
// 32c: return
// 32d: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 330: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 333: invokevirtual su/catlean/bg.l ()V
// 336: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 339: bipush 1
// 33a: invokevirtual su/catlean/qc.K (Z)V
// 33d: new net/minecraft/class_2848
// 340: dup
// 341: lload 22
// 343: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 346: checkcast net/minecraft/class_1297
// 349: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 34c: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 34f: checkcast net/minecraft/class_2596
// 352: lload 16
// 354: dup2_x1
// 355: pop2
// 356: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 359: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 35c: bipush 0
// 35d: invokevirtual su/catlean/ut.E (Z)V
// 360: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 363: invokevirtual su/catlean/ut.FT ()Lsu/catlean/bg;
// 366: invokevirtual su/catlean/bg.l ()V
// 369: return
}

@Override
public void y(@NotNull PreElytraEvent e, long a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void b(long a, @NotNull AfterElytraEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
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
// 009: ldc2_w 45640722348789
// 00c: lxor
// 00d: dup2
// 00e: bipush 48
// 010: lushr
// 011: l2i
// 012: istore 6
// 014: dup2
// 015: bipush 16
// 017: lshl
// 018: bipush 32
// 01a: lushr
// 01b: l2i
// 01c: istore 7
// 01e: dup2
// 01f: bipush 48
// 021: lshl
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 8
// 028: pop2
// 029: dup2
// 02a: ldc2_w 8153721749621
// 02d: lxor
// 02e: lstore 9
// 030: dup2
// 031: ldc2_w 83534144421380
// 034: lxor
// 035: lstore 11
// 037: dup2
// 038: ldc2_w 112939991536544
// 03b: lxor
// 03c: dup2
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 13
// 043: dup2
// 044: bipush 16
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 14
// 04d: dup2
// 04e: bipush 32
// 050: lshl
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 15
// 057: pop2
// 058: dup2
// 059: ldc2_w 74526778099768
// 05c: lxor
// 05d: dup2
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 16
// 064: dup2
// 065: bipush 16
// 067: lshl
// 068: bipush 32
// 06a: lushr
// 06b: l2i
// 06c: istore 17
// 06e: dup2
// 06f: bipush 48
// 071: lshl
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 18
// 078: pop2
// 079: dup2
// 07a: ldc2_w 77382798385104
// 07d: lxor
// 07e: dup2
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 19
// 085: dup2
// 086: bipush 16
// 088: lshl
// 089: bipush 32
// 08b: lushr
// 08c: l2i
// 08d: istore 20
// 08f: dup2
// 090: bipush 48
// 092: lshl
// 093: bipush 48
// 095: lushr
// 096: l2i
// 097: istore 21
// 099: pop2
// 09a: dup2
// 09b: ldc2_w 138622479516950
// 09e: lxor
// 09f: lstore 22
// 0a1: dup2
// 0a2: ldc2_w 1499376952107
// 0a5: lxor
// 0a6: lstore 24
// 0a8: dup2
// 0a9: ldc2_w 102964656663895
// 0ac: lxor
// 0ad: lstore 26
// 0af: dup2
// 0b0: ldc2_w 74919611406377
// 0b3: lxor
// 0b4: lstore 28
// 0b6: dup2
// 0b7: ldc2_w 16494758083782
// 0ba: lxor
// 0bb: lstore 30
// 0bd: dup2
// 0be: ldc2_w 102974922985851
// 0c1: lxor
// 0c2: lstore 32
// 0c4: dup2
// 0c5: ldc2_w 101150267987821
// 0c8: lxor
// 0c9: lstore 34
// 0cb: dup2
// 0cc: ldc2_w 44928523577151
// 0cf: lxor
// 0d0: lstore 36
// 0d2: dup2
// 0d3: ldc2_w 138581660526325
// 0d6: lxor
// 0d7: lstore 38
// 0d9: dup2
// 0da: ldc2_w 16847851849859
// 0dd: lxor
// 0de: lstore 40
// 0e0: dup2
// 0e1: ldc2_w 61288314464010
// 0e4: lxor
// 0e5: lstore 42
// 0e7: dup2
// 0e8: ldc2_w 14645520927461
// 0eb: lxor
// 0ec: lstore 44
// 0ee: pop2
// 0ef: ldc2_w -1237663305365850611
// 0f2: lload 2
// 0f3: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: aload 1
// 0f9: ldc "e"
// 0fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0fe: astore 46
// 100: lload 30
// 102: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 105: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 108: sipush 23912
// 10b: ldc2_w 1498519769751123658
// 10e: lload 2
// 10f: lxor
// 110: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 118: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 11b: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 46
// 123: ifnonnull 14b
// 126: ifeq 1ba
// 129: goto 136
// 12c: ldc2_w -1266329730004205269
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: lload 30
// 138: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13b: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 13e: goto 14b
// 141: ldc2_w -1266329730004205269
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 46
// 14d: lload 2
// 14e: lconst_0
// 14f: lcmp
// 150: ifle 17d
// 153: ifnonnull 17b
// 156: ifeq 1ba
// 159: goto 166
// 15c: ldc2_w -1266329730004205269
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: lload 30
// 168: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16b: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 16e: goto 17b
// 171: ldc2_w -1266329730004205269
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: aload 46
// 17d: ifnonnull 1b7
// 180: ifne 1ba
// 183: goto 190
// 186: ldc2_w -1266329730004205269
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: lload 30
// 192: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 195: aload 46
// 197: ifnonnull 1c0
// 19a: goto 1a7
// 19d: ldc2_w -1266329730004205269
// 1a0: lload 2
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 1aa: goto 1b7
// 1ad: ldc2_w -1266329730004205269
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: ifeq 1bb
// 1ba: return
// 1bb: lload 30
// 1bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c0: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 1c3: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 1c6: getfield net/minecraft/class_241.field_1342 F
// 1c9: fstore 47
// 1cb: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1ce: lload 44
// 1d0: invokevirtual su/catlean/ut.F6 (J)Z
// 1d3: aload 46
// 1d5: lload 2
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: iflt 483
// 1db: ifnonnull 481
// 1de: ifeq 473
// 1e1: goto 1ee
// 1e4: ldc2_w -1266329730004205269
// 1e7: lload 2
// 1e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: athrow
// 1ee: lload 4
// 1f0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1f3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1f6: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1f9: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1fc: aload 46
// 1fe: lload 2
// 1ff: lconst_0
// 200: lcmp
// 201: iflt 25e
// 204: ifnonnull 25c
// 207: goto 214
// 20a: ldc2_w -1266329730004205269
// 20d: lload 2
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: ifeq 241
// 217: goto 224
// 21a: ldc2_w -1266329730004205269
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 227: invokevirtual su/catlean/ut.F5 ()F
// 22a: fstore 48
// 22c: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 22f: lload 2
// 230: lconst_0
// 231: lcmp
// 232: ifle 28d
// 235: fload 48
// 237: fconst_1
// 238: fadd
// 239: invokevirtual su/catlean/ut.K (F)V
// 23c: aload 46
// 23e: ifnull 28a
// 241: lload 4
// 243: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 246: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 249: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 24c: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 24f: goto 25c
// 252: ldc2_w -1266329730004205269
// 255: lload 2
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: aload 46
// 25e: lload 2
// 25f: lconst_0
// 260: lcmp
// 261: iflt 294
// 264: ifnonnull 292
// 267: ifeq 28a
// 26a: goto 277
// 26d: ldc2_w -1266329730004205269
// 270: lload 2
// 271: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: athrow
// 277: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 27a: invokevirtual su/catlean/ut.F5 ()F
// 27d: fstore 48
// 27f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 282: fload 48
// 284: ldc -1.0
// 286: fadd
// 287: invokevirtual su/catlean/ut.K (F)V
// 28a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 28d: lload 28
// 28f: invokevirtual su/catlean/ut.k3 (J)Z
// 292: aload 46
// 294: lload 2
// 295: lconst_0
// 296: lcmp
// 297: ifle 2d9
// 29a: ifnonnull 2d7
// 29d: ifeq 2c9
// 2a0: goto 2ad
// 2a3: ldc2_w -1266329730004205269
// 2a6: lload 2
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2b0: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2b3: lload 36
// 2b5: invokevirtual su/catlean/ut.D (J)I
// 2b8: i2f
// 2b9: invokevirtual su/catlean/ut.K (F)V
// 2bc: goto 2c9
// 2bf: ldc2_w -1266329730004205269
// 2c2: lload 2
// 2c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: athrow
// 2c9: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2cc: iload 19
// 2ce: i2s
// 2cf: iload 20
// 2d1: iload 21
// 2d3: i2s
// 2d4: invokevirtual su/catlean/ut.B (SIS)Z
// 2d7: aload 46
// 2d9: ifnonnull 380
// 2dc: ifeq 372
// 2df: goto 2ec
// 2e2: ldc2_w -1266329730004205269
// 2e5: lload 2
// 2e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2eb: athrow
// 2ec: lload 2
// 2ed: lconst_0
// 2ee: lcmp
// 2ef: iflt 360
// 2f2: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2f5: invokevirtual su/catlean/dm.r ()F
// 2f8: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2fb: lload 26
// 2fd: invokevirtual su/catlean/ut.k5 (J)F
// 300: fcmpl
// 301: iflt 356
// 304: goto 311
// 307: ldc2_w -1266329730004205269
// 30a: lload 2
// 30b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: athrow
// 311: lload 30
// 313: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 316: nop
// 317: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 31a: invokevirtual su/catlean/ut.F5 ()F
// 31d: f2d
// 31e: lload 30
// 320: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 323: invokevirtual net/minecraft/class_746.method_23318 ()D
// 326: dsub
// 327: ldc2_w -1.0
// 32a: dmul
// 32b: ldc2_w 10.0
// 32e: invokestatic java/lang/Math.atan2 (DD)D
// 331: invokestatic java/lang/Math.toDegrees (D)D
// 334: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 337: ldc2_w -50.0
// 33a: ldc2_w 50.0
// 33d: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
// 340: d2f
// 341: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 344: aload 46
// 346: ifnull 473
// 349: goto 356
// 34c: ldc2_w -1266329730004205269
// 34f: lload 2
// 350: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: athrow
// 356: lload 30
// 358: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 35b: ldc 0.25
// 35d: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 360: aload 46
// 362: ifnull 473
// 365: goto 372
// 368: ldc2_w -1266329730004205269
// 36b: lload 2
// 36c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: athrow
// 372: bipush 1
// 373: goto 380
// 376: ldc2_w -1266329730004205269
// 379: lload 2
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: i2d
// 381: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 384: invokevirtual su/catlean/dm.r ()F
// 387: f2d
// 388: ldc2_w 1.7
// 38b: ddiv
// 38c: dconst_0
// 38d: dconst_1
// 38e: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
// 391: invokestatic java/lang/Math.sqrt (D)D
// 394: dsub
// 395: dstore 48
// 397: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 39a: invokevirtual su/catlean/dm.r ()F
// 39d: aload 46
// 39f: ifnonnull 471
// 3a2: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3a5: lload 26
// 3a7: invokevirtual su/catlean/ut.k5 (J)F
// 3aa: fcmpl
// 3ab: iflt 459
// 3ae: goto 3bb
// 3b1: ldc2_w -1266329730004205269
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3be: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 3c1: sipush 9611
// 3c4: ldc2_w 5492404415402446379
// 3c7: lload 2
// 3c8: lxor
// 3c9: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: i2f
// 3cf: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3d2: lload 11
// 3d4: invokevirtual su/catlean/ut.Fp (J)F
// 3d7: fmul
// 3d8: f2i
// 3d9: lload 22
// 3db: invokevirtual su/catlean/bg.c (IJ)Z
// 3de: ifeq 459
// 3e1: goto 3ee
// 3e4: ldc2_w -1266329730004205269
// 3e7: lload 2
// 3e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: athrow
// 3ee: ldc2_w 44.4
// 3f1: dload 48
// 3f3: dmul
// 3f4: ldc2_w 0.6
// 3f7: dadd
// 3f8: dneg
// 3f9: dstore 50
// 3fb: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3fe: lload 2
// 3ff: lconst_0
// 400: lcmp
// 401: ifle 476
// 404: invokevirtual su/catlean/ut.F5 ()F
// 407: bipush 1
// 408: i2f
// 409: fadd
// 40a: f2d
// 40b: lload 30
// 40d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 410: invokevirtual net/minecraft/class_746.method_23318 ()D
// 413: dsub
// 414: bipush 2
// 415: i2d
// 416: dmul
// 417: dstore 52
// 419: dload 52
// 41b: invokestatic java/lang/Math.abs (D)D
// 41e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 421: invokevirtual su/catlean/dm.r ()F
// 424: f2d
// 425: ldc2_w 30.0
// 428: dmul
// 429: invokestatic java/lang/Math.atan2 (DD)D
// 42c: invokestatic java/lang/Math.toDegrees (D)D
// 42f: dneg
// 430: dload 52
// 432: invokestatic java/lang/Math.signum (D)D
// 435: dmul
// 436: dstore 54
// 438: lload 30
// 43a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43d: dload 50
// 43f: dload 54
// 441: dload 50
// 443: dsub
// 444: dload 52
// 446: invokestatic java/lang/Math.abs (D)D
// 449: dconst_0
// 44a: dconst_1
// 44b: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
// 44e: dmul
// 44f: dadd
// 450: d2f
// 451: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 454: aload 46
// 456: ifnull 473
// 459: lload 30
// 45b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 45e: ldc 0.25
// 460: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 463: fconst_1
// 464: goto 471
// 467: ldc2_w -1266329730004205269
// 46a: lload 2
// 46b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: athrow
// 471: fstore 47
// 473: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 476: iload 19
// 478: i2s
// 479: iload 20
// 47b: iload 21
// 47d: i2s
// 47e: invokevirtual su/catlean/ut.B (SIS)Z
// 481: aload 46
// 483: lload 2
// 484: lconst_0
// 485: lcmp
// 486: ifle 4b9
// 489: ifnonnull 4b7
// 48c: ifeq 56b
// 48f: goto 49c
// 492: ldc2_w -1266329730004205269
// 495: lload 2
// 496: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49b: athrow
// 49c: lload 4
// 49e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4a1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 4a4: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 4a7: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 4aa: goto 4b7
// 4ad: ldc2_w -1266329730004205269
// 4b0: lload 2
// 4b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b6: athrow
// 4b7: aload 46
// 4b9: lload 2
// 4ba: lconst_0
// 4bb: lcmp
// 4bc: ifle 4e9
// 4bf: ifnonnull 4e7
// 4c2: ifne 514
// 4c5: goto 4d2
// 4c8: ldc2_w -1266329730004205269
// 4cb: lload 2
// 4cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: athrow
// 4d2: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4d5: lload 9
// 4d7: invokevirtual su/catlean/ut.ku (J)Z
// 4da: goto 4e7
// 4dd: ldc2_w -1266329730004205269
// 4e0: lload 2
// 4e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e6: athrow
// 4e7: aload 46
// 4e9: ifnonnull 511
// 4ec: ifeq 514
// 4ef: goto 4fc
// 4f2: ldc2_w -1266329730004205269
// 4f5: lload 2
// 4f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fb: athrow
// 4fc: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4ff: lload 44
// 501: invokevirtual su/catlean/ut.F6 (J)Z
// 504: goto 511
// 507: ldc2_w -1266329730004205269
// 50a: lload 2
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: ifeq 9be
// 514: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 517: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 51a: iload 16
// 51c: i2s
// 51d: iload 17
// 51f: iload 18
// 521: invokevirtual su/catlean/ut.Fl (SII)F
// 524: f2d
// 525: ldc2_w 10.0
// 528: ddiv
// 529: iload 13
// 52b: i2c
// 52c: dup_x2
// 52d: pop
// 52e: iload 14
// 530: i2s
// 531: dup_x2
// 532: pop
// 533: iload 15
// 535: invokevirtual su/catlean/dm.H (CSDI)[D
// 538: astore 48
// 53a: aload 1
// 53b: aload 1
// 53c: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 53f: aload 48
// 541: bipush 0
// 542: daload
// 543: dadd
// 544: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 547: aload 1
// 548: aload 1
// 549: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 54c: aload 48
// 54e: bipush 1
// 54f: daload
// 550: dadd
// 551: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 554: aload 1
// 555: lload 2
// 556: lconst_0
// 557: lcmp
// 558: iflt 9bf
// 55b: aload 1
// 55c: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 55f: ldc2_w 0.003
// 562: dadd
// 563: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 566: aload 46
// 568: ifnull 9be
// 56b: lload 30
// 56d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 570: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 573: lload 38
// 575: invokevirtual su/catlean/jl.K (J)F
// 578: invokevirtual net/minecraft/class_746.method_5828 (F)Lnet/minecraft/class_243;
// 57b: dup
// 57c: sipush 6852
// 57f: ldc2_w 7637668243560583339
// 582: lload 2
// 583: lxor
// 584: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/pu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 589: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 58c: astore 48
// 58e: aload 48
// 590: getfield net/minecraft/class_243.field_1352 D
// 593: aload 48
// 595: getfield net/minecraft/class_243.field_1350 D
// 598: invokestatic java/lang/Math.hypot (DD)D
// 59b: dstore 49
// 59d: aload 1
// 59e: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 5a1: aload 1
// 5a2: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 5a5: invokestatic java/lang/Math.hypot (DD)D
// 5a8: dstore 51
// 5aa: lload 30
// 5ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5af: invokevirtual net/minecraft/class_746.method_36455 ()F
// 5b2: f2d
// 5b3: invokestatic java/lang/Math.toRadians (D)D
// 5b6: invokestatic java/lang/Math.cos (D)D
// 5b9: ldc2_w 2.0
// 5bc: invokestatic java/lang/Math.pow (DD)D
// 5bf: dconst_1
// 5c0: aload 48
// 5c2: invokevirtual net/minecraft/class_243.method_1033 ()D
// 5c5: ldc2_w 0.4
// 5c8: ddiv
// 5c9: invokestatic java/lang/Math.min (DD)D
// 5cc: dmul
// 5cd: d2f
// 5ce: fstore 53
// 5d0: aload 1
// 5d1: aload 1
// 5d2: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 5d5: ldc2_w -0.08
// 5d8: fload 53
// 5da: f2d
// 5db: ldc2_w 0.06
// 5de: dmul
// 5df: dadd
// 5e0: dadd
// 5e1: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 5e4: aload 1
// 5e5: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 5e8: dconst_0
// 5e9: dcmpg
// 5ea: aload 46
// 5ec: ifnonnull 676
// 5ef: ifge 66c
// 5f2: goto 5ff
// 5f5: ldc2_w -1266329730004205269
// 5f8: lload 2
// 5f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fe: athrow
// 5ff: dload 49
// 601: dconst_0
// 602: dcmpl
// 603: aload 46
// 605: lload 2
// 606: lconst_0
// 607: lcmp
// 608: ifle 678
// 60b: ifnonnull 676
// 60e: goto 61b
// 611: ldc2_w -1266329730004205269
// 614: lload 2
// 615: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61a: athrow
// 61b: ifle 66c
// 61e: goto 62b
// 621: ldc2_w -1266329730004205269
// 624: lload 2
// 625: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62a: athrow
// 62b: aload 1
// 62c: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 62f: ldc2_w -0.1
// 632: dmul
// 633: fload 53
// 635: f2d
// 636: dmul
// 637: dstore 54
// 639: aload 1
// 63a: aload 1
// 63b: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 63e: dload 54
// 640: dadd
// 641: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 644: aload 1
// 645: aload 1
// 646: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 649: aload 48
// 64b: getfield net/minecraft/class_243.field_1352 D
// 64e: dload 54
// 650: dmul
// 651: dload 49
// 653: ddiv
// 654: dadd
// 655: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 658: aload 1
// 659: aload 1
// 65a: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 65d: aload 48
// 65f: getfield net/minecraft/class_243.field_1350 D
// 662: dload 54
// 664: dmul
// 665: dload 49
// 667: ddiv
// 668: dadd
// 669: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 66c: lload 30
// 66e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 671: invokevirtual net/minecraft/class_746.method_36455 ()F
// 674: fconst_0
// 675: fcmpg
// 676: aload 46
// 678: lload 2
// 679: lconst_0
// 67a: lcmp
// 67b: iflt 6e7
// 67e: ifnonnull 6e5
// 681: ifge 6e1
// 684: goto 691
// 687: ldc2_w -1266329730004205269
// 68a: lload 2
// 68b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 690: athrow
// 691: dload 51
// 693: lload 30
// 695: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 698: invokevirtual net/minecraft/class_746.method_36455 ()F
// 69b: f2d
// 69c: invokestatic java/lang/Math.toRadians (D)D
// 69f: invokestatic java/lang/Math.sin (D)D
// 6a2: dneg
// 6a3: dmul
// 6a4: ldc2_w 0.04
// 6a7: dmul
// 6a8: dstore 54
// 6aa: aload 1
// 6ab: aload 1
// 6ac: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 6af: dload 54
// 6b1: ldc2_w 3.2
// 6b4: dmul
// 6b5: dadd
// 6b6: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 6b9: aload 1
// 6ba: aload 1
// 6bb: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 6be: aload 48
// 6c0: getfield net/minecraft/class_243.field_1352 D
// 6c3: dload 54
// 6c5: dmul
// 6c6: dload 49
// 6c8: ddiv
// 6c9: dsub
// 6ca: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 6cd: aload 1
// 6ce: aload 1
// 6cf: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 6d2: aload 48
// 6d4: getfield net/minecraft/class_243.field_1350 D
// 6d7: dload 54
// 6d9: dmul
// 6da: dload 49
// 6dc: ddiv
// 6dd: dsub
// 6de: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 6e1: dload 49
// 6e3: dconst_0
// 6e4: dcmpl
// 6e5: aload 46
// 6e7: lload 2
// 6e8: lconst_0
// 6e9: lcmp
// 6ea: ifle 759
// 6ed: ifnonnull 751
// 6f0: ifle 747
// 6f3: goto 700
// 6f6: ldc2_w -1266329730004205269
// 6f9: lload 2
// 6fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ff: athrow
// 700: aload 1
// 701: aload 1
// 702: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 705: aload 48
// 707: getfield net/minecraft/class_243.field_1352 D
// 70a: dload 49
// 70c: ddiv
// 70d: dload 51
// 70f: dmul
// 710: aload 1
// 711: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 714: dsub
// 715: ldc2_w 0.1
// 718: dmul
// 719: dadd
// 71a: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 71d: aload 1
// 71e: aload 1
// 71f: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 722: aload 48
// 724: getfield net/minecraft/class_243.field_1350 D
// 727: dload 49
// 729: ddiv
// 72a: dload 51
// 72c: dmul
// 72d: aload 1
// 72e: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 731: dsub
// 732: ldc2_w 0.1
// 735: dmul
// 736: dadd
// 737: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 73a: goto 747
// 73d: ldc2_w -1266329730004205269
// 740: lload 2
// 741: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 746: athrow
// 747: lload 30
// 749: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 74c: invokevirtual net/minecraft/class_746.method_36455 ()F
// 74f: fconst_0
// 750: fcmpl
// 751: lload 2
// 752: lconst_0
// 753: lcmp
// 754: iflt 797
// 757: aload 46
// 759: ifnonnull 797
// 75c: ifle 9be
// 75f: goto 76c
// 762: ldc2_w -1266329730004205269
// 765: lload 2
// 766: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76b: athrow
// 76c: aload 1
// 76d: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 770: lload 2
// 771: lconst_0
// 772: lcmp
// 773: ifle 9c9
// 776: dconst_0
// 777: aload 46
// 779: ifnonnull 9c6
// 77c: goto 789
// 77f: ldc2_w -1266329730004205269
// 782: lload 2
// 783: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 788: athrow
// 789: dcmpg
// 78a: goto 797
// 78d: ldc2_w -1266329730004205269
// 790: lload 2
// 791: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 796: athrow
// 797: lload 2
// 798: lconst_0
// 799: lcmp
// 79a: iflt 7a8
// 79d: ifge 9be
// 7a0: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 7a3: lload 34
// 7a5: invokevirtual su/catlean/ut.FR (J)Z
// 7a8: aload 46
// 7aa: lload 2
// 7ab: lconst_0
// 7ac: lcmp
// 7ad: ifle 7e3
// 7b0: ifnonnull 7e1
// 7b3: goto 7c0
// 7b6: ldc2_w -1266329730004205269
// 7b9: lload 2
// 7ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7bf: athrow
// 7c0: ifeq 9be
// 7c3: goto 7d0
// 7c6: ldc2_w -1266329730004205269
// 7c9: lload 2
// 7ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cf: athrow
// 7d0: fload 47
// 7d2: fconst_0
// 7d3: fcmpg
// 7d4: goto 7e1
// 7d7: ldc2_w -1266329730004205269
// 7da: lload 2
// 7db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e0: athrow
// 7e1: aload 46
// 7e3: ifnonnull 7f7
// 7e6: ifne 7fa
// 7e9: goto 7f6
// 7ec: ldc2_w -1266329730004205269
// 7ef: lload 2
// 7f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f5: athrow
// 7f6: bipush 1
// 7f7: goto 7fb
// 7fa: bipush 0
// 7fb: lload 2
// 7fc: lconst_0
// 7fd: lcmp
// 7fe: iflt 827
// 801: ifne 908
// 804: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 807: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 80a: sipush 22694
// 80d: ldc2_w 2581364396341392131
// 810: lload 2
// 811: lxor
// 812: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 817: i2f
// 818: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 81b: lload 11
// 81d: invokevirtual su/catlean/ut.Fp (J)F
// 820: fmul
// 821: f2i
// 822: lload 22
// 824: invokevirtual su/catlean/bg.c (IJ)Z
// 827: aload 46
// 829: ifnonnull 94a
// 82c: goto 839
// 82f: ldc2_w -1266329730004205269
// 832: lload 2
// 833: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 838: athrow
// 839: ifeq 908
// 83c: goto 849
// 83f: ldc2_w -1266329730004205269
// 842: lload 2
// 843: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 848: athrow
// 849: getstatic su/catlean/pu.k Lsu/catlean/bg;
// 84c: sipush 28671
// 84f: ldc2_w 2097904803630335068
// 852: lload 2
// 853: lxor
// 854: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 859: i2f
// 85a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 85d: lload 42
// 85f: invokevirtual su/catlean/ut.W (J)F
// 862: fmul
// 863: f2i
// 864: lload 22
// 866: invokevirtual su/catlean/bg.c (IJ)Z
// 869: lload 2
// 86a: lconst_0
// 86b: lcmp
// 86c: iflt 94a
// 86f: aload 46
// 871: ifnonnull 94a
// 874: goto 881
// 877: ldc2_w -1266329730004205269
// 87a: lload 2
// 87b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 880: athrow
// 881: ifeq 908
// 884: goto 891
// 887: ldc2_w -1266329730004205269
// 88a: lload 2
// 88b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 890: athrow
// 891: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 894: lload 2
// 895: lconst_0
// 896: lcmp
// 897: ifle 8db
// 89a: aload 46
// 89c: ifnonnull 8db
// 89f: goto 8ac
// 8a2: ldc2_w -1266329730004205269
// 8a5: lload 2
// 8a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ab: athrow
// 8ac: lload 24
// 8ae: invokevirtual su/catlean/ut.FJ (J)Z
// 8b1: ifeq 8d8
// 8b4: goto 8c1
// 8b7: ldc2_w -1266329730004205269
// 8ba: lload 2
// 8bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c0: athrow
// 8c1: aload 1
// 8c2: dconst_0
// 8c3: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 8c6: aload 1
// 8c7: dconst_0
// 8c8: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 8cb: goto 8d8
// 8ce: ldc2_w -1266329730004205269
// 8d1: lload 2
// 8d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d7: athrow
// 8d8: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 8db: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 8de: invokevirtual su/catlean/bg.l ()V
// 8e1: new net/minecraft/class_2848
// 8e4: dup
// 8e5: lload 30
// 8e7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8ea: checkcast net/minecraft/class_1297
// 8ed: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 8f0: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 8f3: checkcast net/minecraft/class_2596
// 8f6: lload 40
// 8f8: dup2_x1
// 8f9: pop2
// 8fa: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 8fd: lload 2
// 8fe: lconst_0
// 8ff: lcmp
// 900: ifle 908
// 903: aload 46
// 905: ifnull 9be
// 908: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 90b: invokevirtual su/catlean/ut.k7 ()Lsu/catlean/bg;
// 90e: aload 46
// 910: ifnonnull 9bb
// 913: goto 920
// 916: ldc2_w -1266329730004205269
// 919: lload 2
// 91a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91f: athrow
// 920: sipush 22694
// 923: ldc2_w 2581364396341392131
// 926: lload 2
// 927: lxor
// 928: invokedynamic c (IJ)I bsm=su/catlean/pu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92d: i2f
// 92e: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 931: lload 11
// 933: invokevirtual su/catlean/ut.Fp (J)F
// 936: fmul
// 937: f2i
// 938: lload 22
// 93a: invokevirtual su/catlean/bg.c (IJ)Z
// 93d: goto 94a
// 940: ldc2_w -1266329730004205269
// 943: lload 2
// 944: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 949: athrow
// 94a: ifne 9be
// 94d: aload 1
// 94e: aload 1
// 94f: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 952: fload 47
// 954: f2d
// 955: lload 30
// 957: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 95a: invokevirtual net/minecraft/class_746.method_36454 ()F
// 95d: f2d
// 95e: invokestatic java/lang/Math.toRadians (D)D
// 961: invokestatic java/lang/Math.sin (D)D
// 964: dmul
// 965: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 968: iload 16
// 96a: i2s
// 96b: iload 17
// 96d: iload 18
// 96f: invokevirtual su/catlean/ut.Fl (SII)F
// 972: f2d
// 973: dmul
// 974: ldc 20.0
// 976: f2d
// 977: ddiv
// 978: dsub
// 979: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 97c: aload 1
// 97d: aload 1
// 97e: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 981: fload 47
// 983: f2d
// 984: lload 30
// 986: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 989: invokevirtual net/minecraft/class_746.method_36454 ()F
// 98c: f2d
// 98d: invokestatic java/lang/Math.toRadians (D)D
// 990: invokestatic java/lang/Math.cos (D)D
// 993: dmul
// 994: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 997: iload 16
// 999: i2s
// 99a: iload 17
// 99c: iload 18
// 99e: invokevirtual su/catlean/ut.Fl (SII)F
// 9a1: f2d
// 9a2: dmul
// 9a3: ldc 20.0
// 9a5: f2d
// 9a6: ddiv
// 9a7: dadd
// 9a8: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 9ab: getstatic su/catlean/pu.k Lsu/catlean/bg;
// 9ae: goto 9bb
// 9b1: ldc2_w -1266329730004205269
// 9b4: lload 2
// 9b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ba: athrow
// 9bb: invokevirtual su/catlean/bg.l ()V
// 9be: aload 1
// 9bf: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 9c2: aload 1
// 9c3: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 9c6: invokestatic java/lang/Math.hypot (DD)D
// 9c9: dstore 48
// 9cb: aload 46
// 9cd: ifnonnull a5f
// 9d0: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 9d3: iload 6
// 9d5: i2c
// 9d6: iload 7
// 9d8: iload 8
// 9da: i2s
// 9db: invokevirtual su/catlean/ut.Fg (CIS)Z
// 9de: ifeq a47
// 9e1: goto 9ee
// 9e4: ldc2_w -1266329730004205269
// 9e7: lload 2
// 9e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ed: athrow
// 9ee: lload 2
// 9ef: lconst_0
// 9f0: lcmp
// 9f1: iflt a5f
// 9f4: dload 48
// 9f6: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 9f9: lload 32
// 9fb: invokevirtual su/catlean/ut.FW (J)F
// 9fe: f2d
// 9ff: dcmpl
// a00: ifle a47
// a03: goto a10
// a06: ldc2_w -1266329730004205269
// a09: lload 2
// a0a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0f: athrow
// a10: aload 1
// a11: aload 1
// a12: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// a15: getstatic su/catlean/ut.D Lsu/catlean/ut;
// a18: lload 32
// a1a: invokevirtual su/catlean/ut.FW (J)F
// a1d: f2d
// a1e: dmul
// a1f: dload 48
// a21: ddiv
// a22: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// a25: aload 1
// a26: aload 1
// a27: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// a2a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// a2d: lload 32
// a2f: invokevirtual su/catlean/ut.FW (J)F
// a32: f2d
// a33: dmul
// a34: dload 48
// a36: ddiv
// a37: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// a3a: goto a47
// a3d: ldc2_w -1266329730004205269
// a40: lload 2
// a41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a46: athrow
// a47: lload 30
// a49: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a4c: aload 1
// a4d: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// a50: aload 1
// a51: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// a54: aload 1
// a55: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// a58: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// a5b: aload 1
// a5c: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// a5f: return
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
Intrinsics.checkNotNullParameter(event, a<"l">(13833, 2310361014288606689L ^ ax));
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
// 01d: ldc2_w 15077302398524
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 7
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 75341532821871
// 041: lxor
// 042: lstore 10
// 044: dup2
// 045: ldc2_w 129924746353958
// 048: lxor
// 049: dup2
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 12
// 050: dup2
// 051: bipush 16
// 053: lshl
// 054: bipush 32
// 056: lushr
// 057: l2i
// 058: istore 13
// 05a: dup2
// 05b: bipush 48
// 05d: lshl
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 14
// 064: pop2
// 065: dup2
// 066: ldc2_w 50723236875816
// 069: lxor
// 06a: lstore 15
// 06c: dup2
// 06d: ldc2_w 75690733423914
// 070: lxor
// 071: lstore 17
// 073: pop2
// 074: ldc2_w -6971954781823399967
// 077: lload 5
// 079: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: aload 2
// 07f: ldc "e"
// 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 084: astore 19
// 086: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 089: iload 7
// 08b: i2s
// 08c: iload 8
// 08e: iload 9
// 090: i2s
// 091: invokevirtual su/catlean/ut.B (SIS)Z
// 094: aload 19
// 096: ifnonnull 0d1
// 099: ifeq 1bf
// 09c: goto 0aa
// 09f: ldc2_w -6953175166664822585
// 0a2: lload 5
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0ad: lload 15
// 0af: invokevirtual su/catlean/ut.Fy (J)Lsu/catlean/lj;
// 0b2: invokevirtual su/catlean/lj.X ()I
// 0b5: iload 12
// 0b7: i2s
// 0b8: swap
// 0b9: iload 13
// 0bb: swap
// 0bc: iload 14
// 0be: i2c
// 0bf: swap
// 0c0: invokestatic su/catlean/bx.k (SICI)Z
// 0c3: goto 0d1
// 0c6: ldc2_w -6953175166664822585
// 0c9: lload 5
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 19
// 0d3: iload 1
// 0d4: iflt 107
// 0d7: ifnonnull 101
// 0da: ifeq 1bf
// 0dd: goto 0eb
// 0e0: ldc2_w -6953175166664822585
// 0e3: lload 5
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0ee: invokevirtual su/catlean/dm.o ()D
// 0f1: dconst_0
// 0f2: dcmpl
// 0f3: goto 101
// 0f6: ldc2_w -6953175166664822585
// 0f9: lload 5
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: iload 1
// 102: ifle 144
// 105: aload 19
// 107: ifnonnull 144
// 10a: ifle 1bf
// 10d: goto 11b
// 110: ldc2_w -6953175166664822585
// 113: lload 5
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: lload 17
// 11d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 120: aload 19
// 122: ifnonnull 17d
// 125: goto 133
// 128: ldc2_w -6953175166664822585
// 12b: lload 5
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 136: goto 144
// 139: ldc2_w -6953175166664822585
// 13c: lload 5
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: ifne 180
// 147: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 14a: bipush 1
// 14b: invokevirtual su/catlean/qc.K (Z)V
// 14e: new net/minecraft/class_2848
// 151: dup
// 152: lload 17
// 154: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 157: checkcast net/minecraft/class_1297
// 15a: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 15d: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 160: checkcast net/minecraft/class_2596
// 163: lload 10
// 165: dup2_x1
// 166: pop2
// 167: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 16a: lload 17
// 16c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16f: goto 17d
// 172: ldc2_w -6953175166664822585
// 175: lload 5
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: invokevirtual net/minecraft/class_746.method_23669 ()V
// 180: ldc2_w 0.05
// 183: invokestatic su/catlean/zf.A ()J
// 186: getstatic su/catlean/pu.m Lsu/catlean/bg;
// 189: invokevirtual su/catlean/bg.N ()J
// 18c: lsub
// 18d: l2f
// 18e: ldc 100.0
// 190: fdiv
// 191: fconst_1
// 192: invokestatic java/lang/Math.min (FF)F
// 195: f2d
// 196: dmul
// 197: dstore 20
// 199: lload 17
// 19b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19e: dconst_0
// 19f: lload 17
// 1a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a4: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1a7: getfield net/minecraft/class_243.field_1351 D
// 1aa: dload 20
// 1ac: dadd
// 1ad: dconst_1
// 1ae: invokestatic java/lang/Math.min (DD)D
// 1b1: dconst_0
// 1b2: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 1b5: iload 4
// 1b7: ifle 1c5
// 1ba: aload 19
// 1bc: ifnull 1d3
// 1bf: getstatic su/catlean/pu.m Lsu/catlean/bg;
// 1c2: invokevirtual su/catlean/bg.l ()V
// 1c5: goto 1d3
// 1c8: ldc2_w -6953175166664822585
// 1cb: lload 5
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: return
}

@Override
public void m(char var1, int var2, short var3) {
}

@Override
public void b(long var1) {
}

@Override
public void U(long a, @NotNull FireWorkVelocityEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void s(@NotNull SetPoseEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
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
// 000: lload 1
// 001: dup2
// 002: ldc2_w 59472532531468
// 005: lxor
// 006: dup2
// 007: bipush 48
// 009: lushr
// 00a: l2i
// 00b: istore 4
// 00d: dup2
// 00e: bipush 16
// 010: lshl
// 011: bipush 32
// 013: lushr
// 014: l2i
// 015: istore 5
// 017: dup2
// 018: bipush 48
// 01a: lshl
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 6
// 021: pop2
// 022: dup2
// 023: ldc2_w 121069188053506
// 026: lxor
// 027: lstore 7
// 029: dup2
// 02a: ldc2_w 5404917577984
// 02d: lxor
// 02e: lstore 9
// 030: pop2
// 031: ldc2_w -1507329089342344245
// 034: lload 1
// 035: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: aload 3
// 03b: ldc "e"
// 03d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 040: astore 11
// 042: aload 3
// 043: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 046: instanceof net/minecraft/class_2739
// 049: aload 11
// 04b: ifnonnull 075
// 04e: ifeq 137
// 051: goto 05e
// 054: ldc2_w -1465046210013936403
// 057: lload 1
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: aload 3
// 05f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 062: checkcast net/minecraft/class_2739
// 065: invokevirtual net/minecraft/class_2739.comp_1127 ()I
// 068: goto 075
// 06b: ldc2_w -1465046210013936403
// 06e: lload 1
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: aload 11
// 077: lload 1
// 078: lconst_0
// 079: lcmp
// 07a: iflt 0c0
// 07d: ifnonnull 0be
// 080: lload 9
// 082: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 085: invokevirtual net/minecraft/class_746.method_5628 ()I
// 088: if_icmpne 137
// 08b: goto 098
// 08e: ldc2_w -1465046210013936403
// 091: lload 1
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 09b: lload 7
// 09d: invokevirtual su/catlean/ut.Fy (J)Lsu/catlean/lj;
// 0a0: invokevirtual su/catlean/lj.X ()I
// 0a3: iload 4
// 0a5: i2s
// 0a6: swap
// 0a7: iload 5
// 0a9: swap
// 0aa: iload 6
// 0ac: i2c
// 0ad: swap
// 0ae: invokestatic su/catlean/bx.k (SICI)Z
// 0b1: goto 0be
// 0b4: ldc2_w -1465046210013936403
// 0b7: lload 1
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: aload 11
// 0c0: lload 1
// 0c1: lconst_0
// 0c2: lcmp
// 0c3: iflt 10b
// 0c6: ifnonnull 109
// 0c9: ifeq 137
// 0cc: goto 0d9
// 0cf: ldc2_w -1465046210013936403
// 0d2: lload 1
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 3
// 0da: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0dd: checkcast net/minecraft/class_2739
// 0e0: invokevirtual net/minecraft/class_2739.comp_1128 ()Ljava/util/List;
// 0e3: dup
// 0e4: sipush 26886
// 0e7: ldc2_w 8754075455648540334
// 0ea: lload 1
// 0eb: lxor
// 0ec: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/pu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f4: checkcast java/util/Collection
// 0f7: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0fc: goto 109
// 0ff: ldc2_w -1465046210013936403
// 102: lload 1
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: aload 11
// 10b: ifnonnull 11f
// 10e: ifne 122
// 111: goto 11e
// 114: ldc2_w -1465046210013936403
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: bipush 1
// 11f: goto 123
// 122: bipush 0
// 123: ifeq 137
// 126: aload 3
// 127: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 12a: goto 137
// 12d: ldc2_w -1465046210013936403
// 130: lload 1
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: return
}

static {
long var10000 = yz.a(-3608008337857735485L, -258073531758580433L, MethodHandles.lookup().lookupClass()).a(140953315821104L);
long var11 = var10000 ^ 136716533412049L;
Cipher var13;
Cipher var24 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[3];
int var18 = 0;
String var17 = "Ç\u0086£LD+zqM¿\u0016\u0010\u0016\t/â¬\u0087µíÏÂ\u0087ò\fê`\u008bÉ'jP\u008eâ0&\u0086\u0090\t¤(\u001eþ\u0019t\u000fõ¥\u0094m\u0019±\u007fNÉPd\u001e--\u0083hxH\u001aÈkx9;¸°JGÅ#2/{\u0095o\u0010}[\u008fç¯\u009a`Óì§\u0087v]ÉcÖ";
int var19 = "Ç\u0086£LD+zqM¿\u0016\u0010\u0016\t/â¬\u0087µíÏÂ\u0087ò\fê`\u008bÉ'jP\u008eâ0&\u0086\u0090\t¤(\u001eþ\u0019t\u000fõ¥\u0094m\u0019±\u007fNÉPd\u001e--\u0083hxH\u001aÈkx9;¸°JGÅ#2/{\u0095o\u0010}[\u008fç¯\u009a`Óì§\u0087v]ÉcÖ"
.length();
char var16 = '(';
int var15 = -1;

while (true) {
byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
String var31 = a(var21).intern();
int var10001 = -1;
var20[var18++] = var31;
if ((var15 += var16) >= var19) {
a = var20;
b = new String[3];
f = new HashMap(13);
Cipher var0;
Cipher var25 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "\u00adTd,\u0097\u001b\u0090¼4sL\n®wGi¬Þ\u000b7à\u0006\u008b\u001b";
int var5 = "\u00adTd,\u0097\u001b\u0090¼4sL\n®wGi¬Þ\u000b7à\u0006\u008b\u001b".length();
byte var2 = 0;

label32:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var26 = var6;
var10001 = var3++;
long var34 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var37 = -1;

while (true) {
long var8 = var34;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var39 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var37) {
case 0:
var26[var10001] = var39;
if (var2 >= var5) {
d = var6;
e = new Integer[5];
Q = new pu();
k = new bg();
m = new bg();
return;
}
break;
default:
var26[var10001] = var39;
if (var2 < var5) {
continue label32;
}

var4 = "\u001eQ]ôÎýÎv³FJ\t\u0081¦Àþ";
var5 = "\u001eQ]ôÎýÎv³FJ\t\u0081¦Àþ".length();
var2 = 0;
}

byte var30 = var2;
var2 += 8;
var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
var26 = var6;
var10001 = var3++;
var34 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var37 = 0;
}
}
}

var16 = var17.charAt(var15);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9670;
if (b[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])c.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
c.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pu", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = a[var5].getBytes("ISO-8859-1");
b[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return b[var5];
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
throw new RuntimeException("su/catlean/pu" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17416;
if (e[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = d[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])f.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/pu", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
e[var3] = var15;
}

return e[var3];
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
throw new RuntimeException("su/catlean/pu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
