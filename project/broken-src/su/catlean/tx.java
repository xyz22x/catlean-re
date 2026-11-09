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
import net.minecraft.class_1297;
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

public final class tx implements jr {
@NotNull
public static final tx o;
private static String[] E;
private static final long a = yz.a(943275813236047888L, 5024495033521770593L, MethodHandles.lookup().lookupClass()).a(91233300279404L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private tx() {
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
// 002: ldc2_w 52537100148008
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 123048400601652
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 93268489241074
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 2350125969345
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 95174287896623
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 109028519504674
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 95510200616042
// 02f: lxor
// 030: lstore 16
// 032: pop2
// 033: ldc2_w 6232619157977255585
// 036: lload 1
// 037: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: aload 3
// 03d: ldc "e"
// 03f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 042: astore 18
// 044: aload 0
// 045: lload 4
// 047: invokevirtual su/catlean/tx.L (J)Z
// 04a: aload 18
// 04c: ifnonnull 0a4
// 04f: ifeq 08f
// 052: goto 05f
// 055: ldc2_w 6234925129711115919
// 058: lload 1
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 062: lload 6
// 064: invokevirtual su/catlean/ut.FL (J)Z
// 067: aload 18
// 069: lload 1
// 06a: lconst_0
// 06b: lcmp
// 06c: ifle 0a6
// 06f: ifnonnull 0a4
// 072: goto 07f
// 075: ldc2_w 6234925129711115919
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: ifne 188
// 082: goto 08f
// 085: ldc2_w 6234925129711115919
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 092: lload 10
// 094: invokevirtual su/catlean/ut.FR (J)Z
// 097: goto 0a4
// 09a: ldc2_w 6234925129711115919
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: aload 18
// 0a6: lload 1
// 0a7: lconst_0
// 0a8: lcmp
// 0a9: iflt 0d6
// 0ac: ifnonnull 0d4
// 0af: ifeq 188
// 0b2: goto 0bf
// 0b5: ldc2_w 6234925129711115919
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0c2: lload 8
// 0c4: invokevirtual su/catlean/ut.kP (J)Z
// 0c7: goto 0d4
// 0ca: ldc2_w 6234925129711115919
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 18
// 0d6: lload 1
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: ifle 10c
// 0dc: ifnonnull 104
// 0df: ifne 11f
// 0e2: goto 0ef
// 0e5: ldc2_w 6234925129711115919
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: lload 16
// 0f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f4: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0f7: goto 104
// 0fa: ldc2_w 6234925129711115919
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: lload 1
// 105: lconst_0
// 106: lcmp
// 107: iflt 159
// 10a: aload 18
// 10c: ifnonnull 159
// 10f: ifne 14f
// 112: goto 11f
// 115: ldc2_w 6234925129711115919
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 122: bipush 1
// 123: invokevirtual su/catlean/qc.K (Z)V
// 126: new net/minecraft/class_2848
// 129: dup
// 12a: lload 16
// 12c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12f: checkcast net/minecraft/class_1297
// 132: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 135: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 138: checkcast net/minecraft/class_2596
// 13b: lload 12
// 13d: dup2_x1
// 13e: pop2
// 13f: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 142: goto 14f
// 145: ldc2_w 6234925129711115919
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: lload 16
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: getfield net/minecraft/class_746.field_6012 I
// 157: bipush 3
// 158: irem
// 159: ifeq 188
// 15c: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 15f: lload 14
// 161: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 164: getstatic su/catlean/aq.Motion Lsu/catlean/aq;
// 167: if_acmpne 188
// 16a: goto 177
// 16d: ldc2_w 6234925129711115919
// 170: lload 1
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: aload 3
// 178: invokevirtual su/catlean/api/event/events/player/PreSyncEvent.cancel ()V
// 17b: goto 188
// 17e: ldc2_w 6234925129711115919
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: return
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
// 002: ldc2_w 129836602860932
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 52389835191008
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 116402100060533
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 59600180345496
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 4452337967885
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 123833832724325
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 14353991285086
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
// 041: ldc2_w 8571044726872
// 044: lxor
// 045: lstore 22
// 047: dup2
// 048: ldc2_w 64823430370190
// 04b: lxor
// 04c: lstore 24
// 04e: dup2
// 04f: ldc2_w 16494758083782
// 052: lxor
// 053: lstore 26
// 055: pop2
// 056: aload 1
// 057: ldc "e"
// 059: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05c: ldc2_w -1237663305365850611
// 05f: lload 2
// 060: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: lload 26
// 067: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06a: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 06d: bipush 0
// 06e: putfield net/minecraft/class_1656.field_7479 Z
// 071: astore 28
// 073: lload 26
// 075: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 078: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 07b: ldc 0.05
// 07d: invokevirtual net/minecraft/class_1656.method_7248 (F)V
// 080: aload 0
// 081: lload 4
// 083: invokevirtual su/catlean/tx.L (J)Z
// 086: aload 28
// 088: ifnonnull 10b
// 08b: ifeq 0c5
// 08e: goto 09b
// 091: ldc2_w -1285005274445191645
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 09e: lload 10
// 0a0: invokevirtual su/catlean/ut.FL (J)Z
// 0a3: aload 28
// 0a5: ifnonnull 10b
// 0a8: goto 0b5
// 0ab: ldc2_w -1285005274445191645
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: ifne 10e
// 0b8: goto 0c5
// 0bb: ldc2_w -1285005274445191645
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: lload 26
// 0c7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ca: lload 2
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: ifle 120
// 0d0: aload 28
// 0d2: ifnonnull 120
// 0d5: goto 0e2
// 0d8: ldc2_w -1285005274445191645
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0e5: sipush 23778
// 0e8: ldc2_w 8099578519581766913
// 0eb: lload 2
// 0ec: lxor
// 0ed: invokedynamic c (IJ)I bsm=su/catlean/tx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0f5: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0f8: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0fb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0fe: goto 10b
// 101: ldc2_w -1285005274445191645
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: ifne 10f
// 10e: return
// 10f: lload 26
// 111: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 114: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 117: bipush 1
// 118: putfield net/minecraft/class_1656.field_7479 Z
// 11b: lload 26
// 11d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 120: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 123: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 126: lload 14
// 128: invokevirtual su/catlean/ut.FN (J)F
// 12b: ldc 15.0
// 12d: fdiv
// 12e: f2d
// 12f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 132: aload 28
// 134: ifnonnull 15c
// 137: lload 18
// 139: invokevirtual su/catlean/ut.Fd (J)Z
// 13c: ifeq 19b
// 13f: goto 14c
// 142: ldc2_w -1285005274445191645
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 14f: goto 15c
// 152: ldc2_w -1285005274445191645
// 155: lload 2
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: lload 20
// 15e: invokevirtual su/catlean/ut.kk (J)F
// 161: fstore 30
// 163: dstore 34
// 165: astore 33
// 167: bipush 0
// 168: istore 31
// 16a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 16d: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 170: invokevirtual su/catlean/ut.x ()F
// 173: fload 30
// 175: fadd
// 176: invokevirtual su/catlean/ut.E (F)V
// 179: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 17c: invokevirtual su/catlean/ut.x ()F
// 17f: fstore 36
// 181: aload 33
// 183: dload 34
// 185: fload 36
// 187: f2d
// 188: ldc2_w 100.0
// 18b: ddiv
// 18c: dstore 29
// 18e: dconst_1
// 18f: dstore 31
// 191: dload 29
// 193: dload 31
// 195: invokestatic java/lang/Math.min (DD)D
// 198: goto 19c
// 19b: dconst_1
// 19c: dmul
// 19d: d2f
// 19e: invokevirtual net/minecraft/class_1656.method_7248 (F)V
// 1a1: aload 1
// 1a2: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 1a5: lload 26
// 1a7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1aa: getfield net/minecraft/class_746.field_6012 I
// 1ad: bipush 3
// 1ae: irem
// 1af: aload 28
// 1b1: lload 2
// 1b2: lconst_0
// 1b3: lcmp
// 1b4: ifle 212
// 1b7: ifnonnull 20a
// 1ba: ifne 1ff
// 1bd: goto 1ca
// 1c0: ldc2_w -1285005274445191645
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1cd: lload 24
// 1cf: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 1d2: getstatic su/catlean/aq.Motion Lsu/catlean/aq;
// 1d5: if_acmpne 1ff
// 1d8: goto 1e5
// 1db: ldc2_w -1285005274445191645
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: aload 1
// 1e6: dconst_0
// 1e7: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 1ea: aload 1
// 1eb: dconst_0
// 1ec: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 1ef: aload 1
// 1f0: dconst_0
// 1f1: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 1f4: return
// 1f5: ldc2_w -1285005274445191645
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 1
// 200: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 203: invokestatic java/lang/Math.abs (D)D
// 206: ldc2_w 0.05
// 209: dcmpg
// 20a: lload 2
// 20b: lconst_0
// 20c: lcmp
// 20d: ifle 25a
// 210: aload 28
// 212: ifnonnull 25a
// 215: ifge 237
// 218: goto 225
// 21b: ldc2_w -1285005274445191645
// 21e: lload 2
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: athrow
// 225: aload 1
// 226: dconst_0
// 227: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 22a: goto 237
// 22d: ldc2_w -1285005274445191645
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: aload 1
// 238: lload 2
// 239: lconst_0
// 23a: lcmp
// 23b: iflt 270
// 23e: aload 28
// 240: ifnonnull 270
// 243: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 246: invokestatic java/lang/Math.abs (D)D
// 249: ldc2_w 0.05
// 24c: dcmpg
// 24d: goto 25a
// 250: ldc2_w -1285005274445191645
// 253: lload 2
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: ifge 26f
// 25d: aload 1
// 25e: dconst_0
// 25f: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 262: goto 26f
// 265: ldc2_w -1285005274445191645
// 268: lload 2
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: aload 1
// 270: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 273: lload 22
// 275: invokevirtual su/catlean/ut.kG (J)Z
// 278: aload 28
// 27a: lload 2
// 27b: lconst_0
// 27c: lcmp
// 27d: iflt 2b6
// 280: ifnonnull 2ae
// 283: ifeq 30b
// 286: goto 293
// 289: ldc2_w -1285005274445191645
// 28c: lload 2
// 28d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 292: athrow
// 293: lload 6
// 295: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 298: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 29b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 29e: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 2a1: goto 2ae
// 2a4: ldc2_w -1285005274445191645
// 2a7: lload 2
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: lload 2
// 2af: lconst_0
// 2b0: lcmp
// 2b1: ifle 2ed
// 2b4: aload 28
// 2b6: ifnonnull 2ed
// 2b9: ifeq 2df
// 2bc: goto 2c9
// 2bf: ldc2_w -1285005274445191645
// 2c2: lload 2
// 2c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: athrow
// 2c9: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2cc: lload 8
// 2ce: invokevirtual su/catlean/ut.FF (J)F
// 2d1: f2d
// 2d2: goto 30c
// 2d5: ldc2_w -1285005274445191645
// 2d8: lload 2
// 2d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: athrow
// 2df: lload 6
// 2e1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2e4: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2e7: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 2ea: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 2ed: ifeq 307
// 2f0: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2f3: lload 8
// 2f5: invokevirtual su/catlean/ut.FF (J)F
// 2f8: f2d
// 2f9: dneg
// 2fa: goto 30c
// 2fd: ldc2_w -1285005274445191645
// 300: lload 2
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: dconst_0
// 308: goto 30c
// 30b: dconst_0
// 30c: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 30f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 312: lload 24
// 314: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 317: getstatic su/catlean/yb.j [I
// 31a: swap
// 31b: invokevirtual su/catlean/aq.ordinal ()I
// 31e: iaload
// 31f: aload 28
// 321: lload 2
// 322: lconst_0
// 323: lcmp
// 324: iflt 3c5
// 327: ifnonnull 3c3
// 32a: tableswitch 145 1 3 36 61 86
// 344: ldc2_w -1285005274445191645
// 347: lload 2
// 348: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: athrow
// 34e: aload 1
// 34f: ldc2_w -1.000088900582341E-12
// 352: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 355: aload 28
// 357: ifnull 3bb
// 35a: goto 367
// 35d: ldc2_w -1285005274445191645
// 360: lload 2
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: aload 1
// 368: ldc2_w -4.000355602329364E-12
// 36b: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 36e: aload 28
// 370: ifnull 3bb
// 373: goto 380
// 376: ldc2_w -1285005274445191645
// 379: lload 2
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: aload 1
// 381: ldc2_w 2.0E-4
// 384: lload 26
// 386: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 389: getfield net/minecraft/class_746.field_6012 I
// 38c: bipush 2
// 38d: irem
// 38e: ifne 3ac
// 391: goto 39e
// 394: ldc2_w -1285005274445191645
// 397: lload 2
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: dconst_0
// 39f: goto 3af
// 3a2: ldc2_w -1285005274445191645
// 3a5: lload 2
// 3a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ab: athrow
// 3ac: ldc2_w 1.0E-6
// 3af: dsub
// 3b0: invokestatic java/lang/Math.random ()D
// 3b3: ldc2_w 9.0E-7
// 3b6: dmul
// 3b7: dadd
// 3b8: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 3bb: lload 26
// 3bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c0: getfield net/minecraft/class_746.field_5976 Z
// 3c3: aload 28
// 3c5: ifnonnull 486
// 3c8: ifeq 47e
// 3cb: goto 3d8
// 3ce: ldc2_w -1285005274445191645
// 3d1: lload 2
// 3d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d7: athrow
// 3d8: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 3db: lload 24
// 3dd: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 3e0: getstatic su/catlean/aq.New Lsu/catlean/aq;
// 3e3: lload 2
// 3e4: lconst_0
// 3e5: lcmp
// 3e6: iflt 435
// 3e9: aload 28
// 3eb: ifnonnull 435
// 3ee: goto 3fb
// 3f1: ldc2_w -1285005274445191645
// 3f4: lload 2
// 3f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fa: athrow
// 3fb: if_acmpeq 438
// 3fe: goto 40b
// 401: ldc2_w -1285005274445191645
// 404: lload 2
// 405: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: athrow
// 40b: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 40e: aload 28
// 410: ifnonnull 481
// 413: goto 420
// 416: ldc2_w -1285005274445191645
// 419: lload 2
// 41a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41f: athrow
// 420: lload 24
// 422: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 425: getstatic su/catlean/aq.Motion Lsu/catlean/aq;
// 428: goto 435
// 42b: ldc2_w -1285005274445191645
// 42e: lload 2
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: if_acmpne 47e
// 438: lload 26
// 43a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43d: getfield net/minecraft/class_746.field_6012 I
// 440: bipush 2
// 441: irem
// 442: aload 28
// 444: lload 2
// 445: lconst_0
// 446: lcmp
// 447: ifle 488
// 44a: ifnonnull 486
// 44d: goto 45a
// 450: ldc2_w -1285005274445191645
// 453: lload 2
// 454: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 459: athrow
// 45a: ifne 47e
// 45d: goto 46a
// 460: ldc2_w -1285005274445191645
// 463: lload 2
// 464: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 469: athrow
// 46a: aload 1
// 46b: ldc2_w -0.07840000152587923
// 46e: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 471: goto 47e
// 474: ldc2_w -1285005274445191645
// 477: lload 2
// 478: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47d: athrow
// 47e: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 481: lload 16
// 483: invokevirtual su/catlean/ut.kP (J)Z
// 486: aload 28
// 488: lload 2
// 489: lconst_0
// 48a: lcmp
// 48b: iflt 4d3
// 48e: ifnonnull 4d1
// 491: ifne 4bc
// 494: goto 4a1
// 497: ldc2_w -1285005274445191645
// 49a: lload 2
// 49b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a0: athrow
// 4a1: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4a4: lload 24
// 4a6: invokevirtual su/catlean/ut.kS (J)Lsu/catlean/aq;
// 4a9: getstatic su/catlean/aq.Motion Lsu/catlean/aq;
// 4ac: if_acmpne 59c
// 4af: goto 4bc
// 4b2: ldc2_w -1285005274445191645
// 4b5: lload 2
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 4bf: lload 12
// 4c1: invokevirtual su/catlean/dm.Y (J)Z
// 4c4: goto 4d1
// 4c7: ldc2_w -1285005274445191645
// 4ca: lload 2
// 4cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d0: athrow
// 4d1: aload 28
// 4d3: lload 2
// 4d4: lconst_0
// 4d5: lcmp
// 4d6: iflt 50c
// 4d9: ifnonnull 504
// 4dc: ifne 59c
// 4df: goto 4ec
// 4e2: ldc2_w -1285005274445191645
// 4e5: lload 2
// 4e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4eb: athrow
// 4ec: aload 1
// 4ed: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 4f0: invokestatic java/lang/Math.abs (D)D
// 4f3: ldc2_w 0.121
// 4f6: dcmpg
// 4f7: goto 504
// 4fa: ldc2_w -1285005274445191645
// 4fd: lload 2
// 4fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 503: athrow
// 504: lload 2
// 505: lconst_0
// 506: lcmp
// 507: ifle 54f
// 50a: aload 28
// 50c: ifnonnull 54f
// 50f: ifge 59c
// 512: goto 51f
// 515: ldc2_w -1285005274445191645
// 518: lload 2
// 519: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51e: athrow
// 51f: aload 1
// 520: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 523: invokestatic java/lang/Math.abs (D)D
// 526: lload 2
// 527: lconst_0
// 528: lcmp
// 529: ifle 57d
// 52c: ldc2_w 0.121
// 52f: aload 28
// 531: ifnonnull 579
// 534: goto 541
// 537: ldc2_w -1285005274445191645
// 53a: lload 2
// 53b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 540: athrow
// 541: dcmpg
// 542: goto 54f
// 545: ldc2_w -1285005274445191645
// 548: lload 2
// 549: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54e: athrow
// 54f: ifge 59c
// 552: ldc2_w 4.5
// 555: lload 26
// 557: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 55a: getfield net/minecraft/class_746.field_6012 I
// 55d: sipush 28740
// 560: ldc2_w 1773340364791814566
// 563: lload 2
// 564: lxor
// 565: invokedynamic c (IJ)I bsm=su/catlean/tx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56a: irem
// 56b: i2d
// 56c: goto 579
// 56f: ldc2_w -1285005274445191645
// 572: lload 2
// 573: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 578: athrow
// 579: dmul
// 57a: invokestatic java/lang/Math.toRadians (D)D
// 57d: d2f
// 57e: fstore 29
// 580: aload 1
// 581: fload 29
// 583: f2d
// 584: invokestatic java/lang/Math.sin (D)D
// 587: ldc2_w 0.12
// 58a: dmul
// 58b: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 58e: aload 1
// 58f: fload 29
// 591: f2d
// 592: invokestatic java/lang/Math.cos (D)D
// 595: ldc2_w 0.12
// 598: dmul
// 599: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 59c: return
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
Intrinsics.checkNotNullParameter(event, a<"v">(16613, 347871762062296610L ^ ax));
}

@Override
public void A(@NotNull ReceivePacket e, long a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: bipush 16
// 03: lshl
// 04: iload 4
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 48
// 0c: lushr
// 0d: lor
// 0e: lstore 5
// 10: lload 5
// 12: dup2
// 13: ldc2_w 25371452378166
// 16: lxor
// 17: lstore 7
// 19: pop2
// 1a: ldc2_w -2440115554946922755
// 1d: lload 5
// 1f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: aload 1
// 25: ldc "e"
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: astore 9
// 2c: aload 1
// 2d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 30: aload 9
// 32: ifnonnull 6d
// 35: instanceof net/minecraft/class_2739
// 38: ifeq b5
// 3b: goto 49
// 3e: ldc2_w -2388413506800396589
// 41: lload 5
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: aload 1
// 4a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 4d: dup
// 4e: sipush 15593
// 51: ldc2_w 2121839590164370266
// 54: lload 5
// 56: lxor
// 57: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/tx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 5f: goto 6d
// 62: ldc2_w -2388413506800396589
// 65: lload 5
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: checkcast net/minecraft/class_2739
// 70: astore 10
// 72: aload 10
// 74: invokevirtual net/minecraft/class_2739.comp_1127 ()I
// 77: aload 9
// 79: ifnonnull ad
// 7c: lload 7
// 7e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 81: invokevirtual net/minecraft/class_746.method_5628 ()I
// 84: if_icmpne b5
// 87: goto 95
// 8a: ldc2_w -2388413506800396589
// 8d: lload 5
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: aload 10
// 97: invokevirtual net/minecraft/class_2739.comp_1128 ()Ljava/util/List;
// 9a: invokeinterface java/util/List.isEmpty ()Z 1
// 9f: goto ad
// a2: ldc2_w -2388413506800396589
// a5: lload 5
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: ifeq b1
// b0: return
// b1: aload 1
// b2: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// b5: return
}

@Override
public void P(int a, @NotNull PlayerUpdateEvent e, char a, char a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void m(char var1, int var2, short var3) {
}

@Override
public void b(long var1) {
long var3 = var1 ^ 85510088156605L;
zf.v(var3).method_31549().field_7479 = false;
zf.v(var3).method_31549().method_7248(0.05F);
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
Intrinsics.checkNotNullParameter(ex, "e");
}

public final boolean L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 24848911186897L;
long var5 = var1 ^ 22602679256438L;
return zf.z(var3).method_20812((class_1297)zf.v(var5), zf.v(var5).method_5829().method_1009(-0.25, 0.0, -0.25).method_989(0.0, -0.3, 0.0)).iterator().hasNext();
}

static {
long var20 = a ^ 104737993292873L;
vm.a<"Å">(null, -2174546355655629827L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[2];
int var16 = 0;
String var15 = "KîÜ\u008a\fv¿NU\u0092\u008c(ö\u0080©P` V\\#sf`´ÆU°Ü»Uä1à\u0015«!-#\u009b¤kÐþ\u0089\u001aâö\u000eËÄ\u0098\u009cKZy»à>º²\u0013Î¥ÿ-õë\u0099\u0099§Ã\u000fÇÕª\u00ad\u009dnÓÇ\tÂé\u00968f\u00066\u0012\u0094ì\u0007ðM\u008evuà{Äd]¼ÛU\u0006þ\u009d\u001eN\f%Ö\u0094Ìl¬]vÊ\u0014¨\f.ØÃöÇ\u000eæª kpÚg+H\u0084¸\u0090®\u008eÉm\u009açYË~\u0087]\u0001C\u0081\\îÔÚ\u0010Y\u0017+O!À\u00ad¹É\u0015ß¥\u0003£S\u009a";
int var17 = "KîÜ\u008a\fv¿NU\u0092\u008c(ö\u0080©P` V\\#sf`´ÆU°Ü»Uä1à\u0015«!-#\u009b¤kÐþ\u0089\u001aâö\u000eËÄ\u0098\u009cKZy»à>º²\u0013Î¥ÿ-õë\u0099\u0099§Ã\u000fÇÕª\u00ad\u009dnÓÇ\tÂé\u00968f\u00066\u0012\u0094ì\u0007ðM\u008evuà{Äd]¼ÛU\u0006þ\u009d\u001eN\f%Ö\u0094Ìl¬]vÊ\u0014¨\f.ØÃöÇ\u000eæª kpÚg+H\u0084¸\u0090®\u008eÉm\u009açYË~\u0087]\u0001C\u0081\\îÔÚ\u0010Y\u0017+O!À\u00ad¹É\u0015ß¥\u0003£S\u009a"
.length();
char var14 = 160;
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var27 = a(var19).intern();
int var10001 = -1;
var18[var16++] = var27;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[2];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "M\u009ah_>5à\u0093I=¦>¦¦uV";
int var5 = "M\u009ah_>5à\u0093I=¦>¦¦uV".length();
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
byte var31 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
o = new tx();
return;
}

var14 = var15.charAt(var13);
}
}

public static void K(String[] var0) {
E = var0;
}

public static String[] P() {
return E;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28906;
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
throw new RuntimeException("su/catlean/tx", var10);
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
throw new RuntimeException("su/catlean/tx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1610;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/tx", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/tx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
