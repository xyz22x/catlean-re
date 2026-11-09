package su.catlean;

import com.google.common.collect.Queues;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render3DEvent;

public final class bv {
@NotNull
public static final bv n;
@NotNull
private static final ConcurrentLinkedQueue u;
@NotNull
private static final ConcurrentLinkedQueue s;
@Nullable
private static class_1657 S;
@Nullable
private static class_243 r;
@Nullable
private static class_243 R;
private static long U;
private static final long a = yz.a(170663042456987575L, -7070276741611711763L, MethodHandles.lookup().lookupClass()).a(209365014410064L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private bv() {
}

@Nullable
public final class_1657 S() {
return S;
}

public final void k(@Nullable class_1657 <set-?>) {
S = <set-?>;
}

public final void X(long a, @NotNull Render3DEvent event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 99605631567934
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 27130181317707
// 021: lxor
// 022: lstore 7
// 024: dup2
// 025: ldc2_w 33703621585018
// 028: lxor
// 029: lstore 9
// 02b: pop2
// 02c: ldc2_w -2695629797980772336
// 02f: lload 1
// 030: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: aload 3
// 036: sipush 16770
// 039: ldc2_w 17503277122125495
// 03c: lload 1
// 03d: lxor
// 03e: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 046: istore 14
// 048: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 04b: ifnull 0d1
// 04e: getstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 051: iload 14
// 053: lload 1
// 054: lconst_0
// 055: lcmp
// 056: ifle 084
// 059: ifeq 07c
// 05c: goto 069
// 05f: ldc2_w -2688208692862059958
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: ifnull 0d1
// 06c: goto 079
// 06f: ldc2_w -2688208692862059958
// 072: lload 1
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: getstatic su/catlean/bv.R Lnet/minecraft/class_243;
// 07c: lload 1
// 07d: lconst_0
// 07e: lcmp
// 07f: ifle 0b0
// 082: iload 14
// 084: ifeq 0b0
// 087: ifnull 0d1
// 08a: goto 097
// 08d: ldc2_w -2688208692862059958
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 09a: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 09d: dup
// 09e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a1: checkcast net/minecraft/class_1297
// 0a4: astore 11
// 0a6: iload 4
// 0a8: i2b
// 0a9: lload 5
// 0ab: aload 11
// 0ad: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0b0: getstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 0b3: dup
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b7: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0ba: dconst_1
// 0bb: dcmpg
// 0bc: iload 14
// 0be: ifeq 0d3
// 0c1: ifge 0d2
// 0c4: goto 0d1
// 0c7: ldc2_w -2688208692862059958
// 0ca: lload 1
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: return
// 0d2: bipush 0
// 0d3: istore 15
// 0d5: invokestatic java/lang/System.currentTimeMillis ()J
// 0d8: l2d
// 0d9: ldc2_w 2.0
// 0dc: ddiv
// 0dd: sipush 32159
// 0e0: ldc2_w 7655293632054112342
// 0e3: lload 1
// 0e4: lxor
// 0e5: invokedynamic t (IJ)I bsm=su/catlean/bv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: i2d
// 0eb: drem
// 0ec: d2i
// 0ed: istore 15
// 0ef: iload 15
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: iflt 136
// 0f7: sipush 17123
// 0fa: ldc2_w 9101255755044720427
// 0fd: lload 1
// 0fe: lxor
// 0ff: invokedynamic t (IJ)I bsm=su/catlean/bv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: iload 14
// 106: ifeq 135
// 109: if_icmplt 139
// 10c: goto 119
// 10f: ldc2_w -2688208692862059958
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: sipush 30073
// 11c: ldc2_w 7857442674788776114
// 11f: lload 1
// 120: lxor
// 121: invokedynamic t (IJ)I bsm=su/catlean/bv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: iload 15
// 128: goto 135
// 12b: ldc2_w -2688208692862059958
// 12e: lload 1
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: isub
// 136: goto 13b
// 139: iload 15
// 13b: istore 15
// 13d: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 140: getstatic su/catlean/bv.R Lnet/minecraft/class_243;
// 143: dup
// 144: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 147: getstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 14a: dup
// 14b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 14e: invokestatic su/catlean/zf.A ()J
// 151: getstatic su/catlean/bv.U J
// 154: lsub
// 155: l2f
// 156: ldc 100.0
// 158: fdiv
// 159: fconst_0
// 15a: fconst_1
// 15b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 15e: fstore 11
// 160: astore 12
// 162: astore 13
// 164: lload 9
// 166: aload 13
// 168: aload 12
// 16a: fload 11
// 16c: invokevirtual su/catlean/zi.q (JLnet/minecraft/class_243;Lnet/minecraft/class_243;F)Lnet/minecraft/class_243;
// 16f: astore 16
// 171: bipush 0
// 172: istore 17
// 174: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 177: aload 3
// 178: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 17b: aload 16
// 17d: getstatic su/catlean/bv.n Lsu/catlean/bv;
// 180: pop
// 181: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 184: dup
// 185: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 188: iload 15
// 18a: i2f
// 18b: ldc 360.0
// 18d: fdiv
// 18e: lload 7
// 190: dup2_x1
// 191: pop2
// 192: bipush 1
// 193: invokevirtual su/catlean/zi.D (Lnet/minecraft/class_4587;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;JFZ)V
// 196: nop
// 197: return
}

public final void M(long a, @NotNull ReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 92464426093775
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 105090885576290
// 021: lxor
// 022: lstore 7
// 024: dup2
// 025: ldc2_w 58561746317929
// 028: lxor
// 029: lstore 9
// 02b: dup2
// 02c: ldc2_w 60842342812878
// 02f: lxor
// 030: lstore 11
// 032: pop2
// 033: ldc2_w -2385838486475464675
// 036: lload 1
// 037: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: istore 14
// 03e: aload 3
// 03f: iload 14
// 041: ifne 0c6
// 044: ldc "e"
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 049: getstatic su/catlean/bv.u Ljava/util/concurrent/ConcurrentLinkedQueue;
// 04c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
// 04f: ifeq 0c5
// 052: goto 05f
// 055: ldc2_w -2431769111976804677
// 058: lload 1
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: getstatic su/catlean/bv.s Ljava/util/concurrent/ConcurrentLinkedQueue;
// 062: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
// 065: ifeq 0c5
// 068: goto 075
// 06b: ldc2_w -2431769111976804677
// 06e: lload 1
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 078: lload 1
// 079: lconst_0
// 07a: lcmp
// 07b: iflt 0b4
// 07e: iload 14
// 080: ifne 0b4
// 083: goto 090
// 086: ldc2_w -2431769111976804677
// 089: lload 1
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: ifnull 0ba
// 093: goto 0a0
// 096: ldc2_w -2431769111976804677
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 0a3: dup
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a7: goto 0b4
// 0aa: ldc2_w -2431769111976804677
// 0ad: lload 1
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: invokevirtual net/minecraft/class_1657.method_5805 ()Z
// 0b7: ifne 0c5
// 0ba: return
// 0bb: ldc2_w -2431769111976804677
// 0be: lload 1
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: aload 3
// 0c6: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0c9: astore 15
// 0cb: aload 15
// 0cd: astore 16
// 0cf: aload 16
// 0d1: instanceof net/minecraft/class_2797
// 0d4: iload 14
// 0d6: lload 1
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: iflt 103
// 0dc: ifne 101
// 0df: ifne 257
// 0e2: goto 0ef
// 0e5: ldc2_w -2431769111976804677
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 16
// 0f1: instanceof net/minecraft/class_7439
// 0f4: goto 101
// 0f7: ldc2_w -2431769111976804677
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: iload 14
// 103: lload 1
// 104: lconst_0
// 105: lcmp
// 106: iflt 130
// 109: ifne 12e
// 10c: ifne 257
// 10f: goto 11c
// 112: ldc2_w -2431769111976804677
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 16
// 11e: instanceof net/minecraft/class_2761
// 121: goto 12e
// 124: ldc2_w -2431769111976804677
// 127: lload 1
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: iload 14
// 130: lload 1
// 131: lconst_0
// 132: lcmp
// 133: iflt 15d
// 136: ifne 15b
// 139: ifne 257
// 13c: goto 149
// 13f: ldc2_w -2431769111976804677
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 16
// 14b: instanceof net/minecraft/class_7472
// 14e: goto 15b
// 151: ldc2_w -2431769111976804677
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: iload 14
// 15d: lload 1
// 15e: lconst_0
// 15f: lcmp
// 160: iflt 18a
// 163: ifne 188
// 166: ifne 257
// 169: goto 176
// 16c: ldc2_w -2431769111976804677
// 16f: lload 1
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 16
// 178: instanceof net/minecraft/class_2767
// 17b: goto 188
// 17e: ldc2_w -2431769111976804677
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: iload 14
// 18a: lload 1
// 18b: lconst_0
// 18c: lcmp
// 18d: ifle 1b7
// 190: ifne 1b5
// 193: ifne 257
// 196: goto 1a3
// 199: ldc2_w -2431769111976804677
// 19c: lload 1
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 16
// 1a5: instanceof net/minecraft/class_2770
// 1a8: goto 1b5
// 1ab: ldc2_w -2431769111976804677
// 1ae: lload 1
// 1af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: athrow
// 1b5: iload 14
// 1b7: lload 1
// 1b8: lconst_0
// 1b9: lcmp
// 1ba: iflt 1e4
// 1bd: ifne 1e2
// 1c0: ifne 257
// 1c3: goto 1d0
// 1c6: ldc2_w -2431769111976804677
// 1c9: lload 1
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: aload 16
// 1d2: instanceof net/minecraft/class_5894
// 1d5: goto 1e2
// 1d8: ldc2_w -2431769111976804677
// 1db: lload 1
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: iload 14
// 1e4: lload 1
// 1e5: lconst_0
// 1e6: lcmp
// 1e7: ifle 211
// 1ea: ifne 20f
// 1ed: ifne 257
// 1f0: goto 1fd
// 1f3: ldc2_w -2431769111976804677
// 1f6: lload 1
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: aload 16
// 1ff: instanceof net/minecraft/class_2749
// 202: goto 20f
// 205: ldc2_w -2431769111976804677
// 208: lload 1
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: iload 14
// 211: lload 1
// 212: lconst_0
// 213: lcmp
// 214: iflt 23e
// 217: ifne 23c
// 21a: ifne 257
// 21d: goto 22a
// 220: ldc2_w -2431769111976804677
// 223: lload 1
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: aload 16
// 22c: instanceof net/minecraft/class_2629
// 22f: goto 23c
// 232: ldc2_w -2431769111976804677
// 235: lload 1
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: iload 14
// 23e: lload 1
// 23f: lconst_0
// 240: lcmp
// 241: ifle 265
// 244: ifne 25d
// 247: ifeq 258
// 24a: goto 257
// 24d: ldc2_w -2431769111976804677
// 250: lload 1
// 251: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: athrow
// 257: return
// 258: aload 16
// 25a: instanceof net/minecraft/class_2708
// 25d: lload 1
// 25e: lconst_0
// 25f: lcmp
// 260: ifle 28a
// 263: iload 14
// 265: ifne 28a
// 268: ifne 28d
// 26b: goto 278
// 26e: ldc2_w -2431769111976804677
// 271: lload 1
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: aload 16
// 27a: instanceof net/minecraft/class_2661
// 27d: goto 28a
// 280: ldc2_w -2431769111976804677
// 283: lload 1
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: ifeq 29c
// 28d: aload 0
// 28e: invokevirtual su/catlean/bv.i ()V
// 291: return
// 292: ldc2_w -2431769111976804677
// 295: lload 1
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: aconst_null
// 29d: astore 16
// 29f: aload 15
// 2a1: instanceof net/minecraft/class_2684
// 2a4: iload 14
// 2a6: ifne 2dc
// 2a9: ifeq 320
// 2ac: goto 2b9
// 2af: ldc2_w -2431769111976804677
// 2b2: lload 1
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: aload 15
// 2bb: checkcast net/minecraft/class_2684
// 2be: lload 9
// 2c0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2c3: checkcast net/minecraft/class_1937
// 2c6: invokevirtual net/minecraft/class_2684.method_11645 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 2c9: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 2cc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2cf: goto 2dc
// 2d2: ldc2_w -2431769111976804677
// 2d5: lload 1
// 2d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: athrow
// 2dc: ifeq 31f
// 2df: new net/minecraft/class_7422
// 2e2: dup
// 2e3: invokespecial net/minecraft/class_7422.<init> ()V
// 2e6: astore 17
// 2e8: aload 17
// 2ea: getstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 2ed: dup
// 2ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2f1: invokevirtual net/minecraft/class_7422.method_43494 (Lnet/minecraft/class_243;)V
// 2f4: aload 17
// 2f6: aload 15
// 2f8: checkcast net/minecraft/class_2684
// 2fb: invokevirtual net/minecraft/class_2684.method_36150 ()S
// 2fe: i2l
// 2ff: aload 15
// 301: checkcast net/minecraft/class_2684
// 304: invokevirtual net/minecraft/class_2684.method_36151 ()S
// 307: i2l
// 308: aload 15
// 30a: checkcast net/minecraft/class_2684
// 30d: invokevirtual net/minecraft/class_2684.method_36152 ()S
// 310: i2l
// 311: invokevirtual net/minecraft/class_7422.method_43489 (JJJ)Lnet/minecraft/class_243;
// 314: astore 16
// 316: invokestatic su/catlean/zf.A ()J
// 319: putstatic su/catlean/bv.U J
// 31c: goto 320
// 31f: return
// 320: aload 15
// 322: instanceof net/minecraft/class_2777
// 325: iload 14
// 327: ifne 3b1
// 32a: ifeq 3ac
// 32d: goto 33a
// 330: ldc2_w -2431769111976804677
// 333: lload 1
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 33d: astore 17
// 33f: aload 17
// 341: ifnull 385
// 344: aload 15
// 346: checkcast net/minecraft/class_2777
// 349: invokevirtual net/minecraft/class_2777.comp_3237 ()I
// 34c: iload 14
// 34e: ifne 382
// 351: goto 35e
// 354: ldc2_w -2431769111976804677
// 357: lload 1
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: aload 17
// 360: invokevirtual net/minecraft/class_1657.method_5628 ()I
// 363: if_icmpne 381
// 366: goto 373
// 369: ldc2_w -2431769111976804677
// 36c: lload 1
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: bipush 1
// 374: goto 386
// 377: ldc2_w -2431769111976804677
// 37a: lload 1
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: bipush 0
// 382: goto 386
// 385: bipush 0
// 386: ifeq 3a1
// 389: aload 15
// 38b: checkcast net/minecraft/class_2777
// 38e: lload 1
// 38f: lconst_0
// 390: lcmp
// 391: ifle 3ae
// 394: invokevirtual net/minecraft/class_2777.comp_3238 ()Lnet/minecraft/class_10182;
// 397: invokevirtual net/minecraft/class_10182.comp_3148 ()Lnet/minecraft/class_243;
// 39a: astore 16
// 39c: iload 14
// 39e: ifeq 3ac
// 3a1: return
// 3a2: ldc2_w -2431769111976804677
// 3a5: lload 1
// 3a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ab: athrow
// 3ac: aload 15
// 3ae: instanceof net/minecraft/class_10264
// 3b1: ifeq 426
// 3b4: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 3b7: astore 17
// 3b9: aload 17
// 3bb: ifnull 3ff
// 3be: aload 15
// 3c0: checkcast net/minecraft/class_10264
// 3c3: invokevirtual net/minecraft/class_10264.comp_3223 ()I
// 3c6: iload 14
// 3c8: ifne 3fc
// 3cb: goto 3d8
// 3ce: ldc2_w -2431769111976804677
// 3d1: lload 1
// 3d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d7: athrow
// 3d8: aload 17
// 3da: invokevirtual net/minecraft/class_1657.method_5628 ()I
// 3dd: if_icmpne 3fb
// 3e0: goto 3ed
// 3e3: ldc2_w -2431769111976804677
// 3e6: lload 1
// 3e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ec: athrow
// 3ed: bipush 1
// 3ee: goto 400
// 3f1: ldc2_w -2431769111976804677
// 3f4: lload 1
// 3f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fa: athrow
// 3fb: bipush 0
// 3fc: goto 400
// 3ff: bipush 0
// 400: ifeq 41b
// 403: aload 15
// 405: checkcast net/minecraft/class_10264
// 408: invokevirtual net/minecraft/class_10264.comp_3224 ()Lnet/minecraft/class_10182;
// 40b: invokevirtual net/minecraft/class_10182.comp_3148 ()Lnet/minecraft/class_243;
// 40e: astore 16
// 410: lload 1
// 411: lconst_0
// 412: lcmp
// 413: iflt 426
// 416: iload 14
// 418: ifeq 426
// 41b: return
// 41c: ldc2_w -2431769111976804677
// 41f: lload 1
// 420: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 425: athrow
// 426: aload 16
// 428: lload 1
// 429: lconst_0
// 42a: lcmp
// 42b: iflt 458
// 42e: iload 14
// 430: ifne 458
// 433: ifnull 4e6
// 436: goto 443
// 439: ldc2_w -2431769111976804677
// 43c: lload 1
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: getstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 446: putstatic su/catlean/bv.R Lnet/minecraft/class_243;
// 449: aload 16
// 44b: goto 458
// 44e: ldc2_w -2431769111976804677
// 451: lload 1
// 452: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 457: athrow
// 458: putstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 45b: iload 14
// 45d: ifne 4ff
// 460: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 463: ifnull 4e6
// 466: goto 473
// 469: ldc2_w -2431769111976804677
// 46c: lload 1
// 46d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 472: athrow
// 473: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 476: lload 11
// 478: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 47b: iload 4
// 47d: i2b
// 47e: swap
// 47f: lload 5
// 481: dup2_x1
// 482: pop2
// 483: checkcast net/minecraft/class_1297
// 486: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 489: aload 16
// 48b: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 48e: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 491: lload 11
// 493: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 496: iload 4
// 498: i2b
// 499: swap
// 49a: lload 5
// 49c: dup2_x1
// 49d: pop2
// 49e: checkcast net/minecraft/class_1297
// 4a1: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 4a4: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 4a7: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 4aa: dup
// 4ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4ae: checkcast net/minecraft/class_1297
// 4b1: astore 13
// 4b3: iload 4
// 4b5: i2b
// 4b6: lload 5
// 4b8: aload 13
// 4ba: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 4bd: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 4c0: dcmpg
// 4c1: iload 14
// 4c3: ifne 4fa
// 4c6: ifgt 4e6
// 4c9: goto 4d6
// 4cc: ldc2_w -2431769111976804677
// 4cf: lload 1
// 4d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d5: athrow
// 4d6: aload 0
// 4d7: bipush 1
// 4d8: invokevirtual su/catlean/bv.q (Z)V
// 4db: return
// 4dc: ldc2_w -2431769111976804677
// 4df: lload 1
// 4e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e5: athrow
// 4e6: getstatic su/catlean/bv.u Ljava/util/concurrent/ConcurrentLinkedQueue;
// 4e9: new su/catlean/d
// 4ec: dup
// 4ed: aload 15
// 4ef: invokestatic su/catlean/zf.A ()J
// 4f2: lload 7
// 4f4: invokespecial su/catlean/d.<init> (Lnet/minecraft/class_2596;JJ)V
// 4f7: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.add (Ljava/lang/Object;)Z
// 4fa: pop
// 4fb: aload 3
// 4fc: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 4ff: return
}

public final void t(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 49224571255586
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 8
// 015: lshl
// 016: bipush 8
// 018: lushr
// 019: lstore 4
// 01b: pop2
// 01c: dup2
// 01d: ldc2_w 49171274657405
// 020: lxor
// 021: lstore 6
// 023: pop2
// 024: ldc2_w 2958500286596667376
// 027: lload 1
// 028: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: istore 8
// 02f: getstatic su/catlean/um.E Lsu/catlean/um;
// 032: iload 8
// 034: ifne 05c
// 037: lload 6
// 039: invokevirtual su/catlean/um.f (J)Z
// 03c: ifeq 0cf
// 03f: goto 04c
// 042: ldc2_w 3003309671907461462
// 045: lload 1
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: getstatic su/catlean/um.E Lsu/catlean/um;
// 04f: goto 05c
// 052: ldc2_w 3003309671907461462
// 055: lload 1
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 05f: iload 8
// 061: lload 1
// 062: lconst_0
// 063: lcmp
// 064: ifle 08f
// 067: ifne 08d
// 06a: ifnull 0cf
// 06d: goto 07a
// 070: ldc2_w 3003309671907461462
// 073: lload 1
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: getstatic su/catlean/um.E Lsu/catlean/um;
// 07d: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 080: goto 08d
// 083: ldc2_w 3003309671907461462
// 086: lload 1
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: iload 8
// 08f: ifne 0c9
// 092: instanceof net/minecraft/class_1657
// 095: ifeq 0cf
// 098: goto 0a5
// 09b: ldc2_w 3003309671907461462
// 09e: lload 1
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: getstatic su/catlean/um.E Lsu/catlean/um;
// 0a8: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 0ab: dup
// 0ac: sipush 26218
// 0af: ldc2_w 108180881586367042
// 0b2: lload 1
// 0b3: lxor
// 0b4: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0bc: goto 0c9
// 0bf: ldc2_w 3003309671907461462
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: checkcast net/minecraft/class_1657
// 0cc: goto 0d0
// 0cf: aconst_null
// 0d0: astore 9
// 0d2: aload 9
// 0d4: iload 8
// 0d6: lload 1
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: iflt 102
// 0dc: ifne 100
// 0df: ifnonnull 0fe
// 0e2: goto 0ef
// 0e5: ldc2_w 3003309671907461462
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 0
// 0f0: invokevirtual su/catlean/bv.i ()V
// 0f3: return
// 0f4: ldc2_w 3003309671907461462
// 0f7: lload 1
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 9
// 100: iload 8
// 102: ifne 140
// 105: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 108: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 10b: ifne 13e
// 10e: goto 11b
// 111: ldc2_w 3003309671907461462
// 114: lload 1
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: aload 0
// 11c: invokevirtual su/catlean/bv.i ()V
// 11f: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 122: iload 3
// 123: i2b
// 124: lload 4
// 126: aload 9
// 128: checkcast net/minecraft/class_1297
// 12b: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 12e: putstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 131: goto 13e
// 134: ldc2_w 3003309671907461462
// 137: lload 1
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: aload 9
// 140: putstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 143: return
}

public final void Z(int param1, short param2, int param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/bv.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 10872380781239
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 130793198295165
// 02a: lxor
// 02b: lstore 8
// 02d: pop2
// 02e: ldc2_w 3367798182812930114
// 031: lload 4
// 033: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: istore 10
// 03a: iload 10
// 03c: ifne 0a4
// 03f: lload 6
// 041: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 044: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 047: ifnull 088
// 04a: goto 058
// 04d: ldc2_w 3323516832852414180
// 050: lload 4
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: lload 6
// 05a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 060: iload 10
// 062: iload 3
// 063: iflt 0ae
// 066: ifne 0a8
// 069: goto 077
// 06c: ldc2_w 3323516832852414180
// 06f: lload 4
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: ifnonnull 0a5
// 07a: goto 088
// 07d: ldc2_w 3323516832852414180
// 080: lload 4
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: getstatic su/catlean/bv.u Ljava/util/concurrent/ConcurrentLinkedQueue;
// 08b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
// 08e: aconst_null
// 08f: putstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 092: aconst_null
// 093: putstatic su/catlean/bv.r Lnet/minecraft/class_243;
// 096: goto 0a4
// 099: ldc2_w 3323516832852414180
// 09c: lload 4
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: return
// 0a5: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 0a8: iload 3
// 0a9: ifle 0d7
// 0ac: iload 10
// 0ae: ifne 0d7
// 0b1: ifnull 101
// 0b4: goto 0c2
// 0b7: ldc2_w 3323516832852414180
// 0ba: lload 4
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: getstatic su/catlean/bv.S Lnet/minecraft/class_1657;
// 0c5: dup
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0c9: goto 0d7
// 0cc: ldc2_w 3323516832852414180
// 0cf: lload 4
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: invokevirtual net/minecraft/class_1657.method_5805 ()Z
// 0da: iload 3
// 0db: iflt 0ec
// 0de: ifeq 101
// 0e1: aload 0
// 0e2: bipush 0
// 0e3: lload 8
// 0e5: bipush 1
// 0e6: aconst_null
// 0e7: invokestatic su/catlean/bv.S (Lsu/catlean/bv;ZJILjava/lang/Object;)V
// 0ea: iload 10
// 0ec: iload 2
// 0ed: ifge 123
// 0f0: ifeq 113
// 0f3: goto 101
// 0f6: ldc2_w 3323516832852414180
// 0f9: lload 4
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 0
// 102: invokevirtual su/catlean/bv.i ()V
// 105: goto 113
// 108: ldc2_w 3323516832852414180
// 10b: lload 4
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: getstatic su/catlean/bv.s Ljava/util/concurrent/ConcurrentLinkedQueue;
// 116: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/bv.R (Lnet/minecraft/class_2596;)Z, (Lnet/minecraft/class_2596;)Ljava/lang/Boolean; ]
// 11b: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/bv.f (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 120: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.removeIf (Ljava/util/function/Predicate;)Z
// 123: pop
// 124: return
}

public final void q(boolean clear) {
u.removeIf(bv::J);
}

public static void S(bv var0, boolean var1, long var2, int var4, Object var5) {
var2 = a ^ var2;
int var6 = vm.a<"Å">(4436040484472832881L, var2);

label21: {
int var10000;
label20: {
try {
var10000 = var4 & 1;
if (var6 != 0) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 4408084196438253015L, var2);
}

var10000 = 0;
}

var1 = var10000;
}

var0.q((boolean)var1);
}

public final void i() {
u.removeIf(bv::M);
S = null;
r = null;
}

private static final boolean R(class_2596 var0) {
long var1 = a ^ 26284119663826L;
long var3 = var1 ^ 53117310466903L;
bv var5 = n;

try {
boolean var7 = false;
Intrinsics.checkNotNull(var0, a<"i">(6966, 2156052413840150729L ^ var1));
var0.method_65081((class_2547)zf.k(var3));
Object var9 = Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var8) {
Object var6 = Result.constructor-impl(ResultKt.createFailure(var8));
}

return true;
}

private static final boolean f(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean W(boolean param0, d param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bv.a J
// 03: ldc2_w 48237524535280
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 23400582388069
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 5582566558457430014
// 14: lload 2
// 15: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: istore 6
// 1c: iload 0
// 1d: iload 6
// 1f: ifeq 67
// 22: ifne 66
// 25: goto 32
// 28: ldc2_w 5575421299761048996
// 2b: lload 2
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: aload 1
// 33: invokevirtual su/catlean/d.d ()J
// 36: invokestatic su/catlean/zf.A ()J
// 39: getstatic su/catlean/um.E Lsu/catlean/um;
// 3c: lload 4
// 3e: invokevirtual su/catlean/um.A (J)I
// 41: i2l
// 42: lsub
// 43: lcmp
// 44: iload 6
// 46: ifeq 67
// 49: goto 56
// 4c: ldc2_w 5575421299761048996
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: ifgt 6a
// 59: goto 66
// 5c: ldc2_w 5575421299761048996
// 5f: lload 2
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: bipush 1
// 67: goto 6b
// 6a: bipush 0
// 6b: istore 7
// 6d: iload 7
// 6f: istore 8
// 71: bipush 0
// 72: istore 9
// 74: iload 8
// 76: iload 6
// 78: ifeq a6
// 7b: ifeq a3
// 7e: goto 8b
// 81: ldc2_w 5575421299761048996
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: getstatic su/catlean/bv.s Ljava/util/concurrent/ConcurrentLinkedQueue;
// 8e: aload 1
// 8f: invokevirtual su/catlean/d.f ()Lnet/minecraft/class_2596;
// 92: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.add (Ljava/lang/Object;)Z
// 95: pop
// 96: goto a3
// 99: ldc2_w 5575421299761048996
// 9c: lload 2
// 9d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a2: athrow
// a3: nop
// a4: iload 7
// a6: ireturn
}

private static final boolean J(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean Q(d var0) {
long var1 = a ^ 35584092814521L;
long var3 = var1 ^ 8753021739836L;
bv var5 = n;

try {
boolean var7 = false;
class_2596 var10000 = var0.f();
Intrinsics.checkNotNull(var10000, a<"i">(4713, 7704413136613786108L ^ var1));
var10000.method_65081((class_2547)zf.k(var3));
Object var9 = Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var8) {
Object var6 = Result.constructor-impl(ResultKt.createFailure(var8));
}

return true;
}

private static final boolean M(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 13446951276270L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[6];
int var16 = 0;
String var15 = "æViUÉöa£\u001c¯¬\u001c¼xÙ\u00ad¨\u0081jx!ÈÐ\t\u0089d°bäi\u0080×\u0090ì±û[CxÆ7]?v¢\u001cJ/8¨\u0005ó\u0005c\u0095_}1p×\u007fJ´avË0\u001e\u0014£Û´õúÞ9§ìTï\u0019\u0014E¬\u0083÷mÙ\bQ¥5,\u0017p\u001d7à-rØuQøªàfeZ\u008e\u0083ñãj*®\u0088íZR¡»mÇ\u009fõ¦bCj¦ôÀ\u0087\u0017N\u0092©æè\u0005|öÝø\u008c°GüªÚ\u0085\u001cÐ$\f\u0097j\fB\u008bÑC\"r\u008f1÷¡¡Rk&^\u0018/!j²Í-¤Õ]Dú\u009ff#Ãé\u008e#Ñ¢Ï3pZ4ã\u0080\u0098_[TÆ¤Ç\u0080iVb\u0005ÖÌc2jvX\\p\u0016%\u0012\tô\u009b¤\u0089\u0084ñ\u001dÒÀDlµ2\u008bí&îëdw¸À>¶\u0081\u0080}BéÈ\u00865:¹dÏ\u0094\u000e¬$9Ø$3ÓôI¿yÑM+\u008a\n±\u0096\u001c\u0095¨OVU]âÕ\u0002Zx;!w¹ã\u0017\u009b¹»è\u000bE\u0088\u00846FV\u0016\u001dPÕ«s\u0012:\u0093\u001f/\u0004\u0019Åù/\u000b\u009bàR\u009aÞ\u0004P?\u0080ðº\u009a3ÿ\u00976¯Ø\u0012 Û\u008b²éìÁæÖ®\u0085w\u0019´\u0015\u0003\u0099\u0006A!I\u008a\"ÑQ\u001aø\u008dó\nÐ7\u0003\u0006,\u0081´\u009e+\u0003øLWÙÄ\u0093P¯[à+k\u00ad¦¨cJ\u0098U\u0016\u001eÚó\u0090ë\u0081wWRz ¡á\u001e7¦\u0099ÜKe7pO\u0095p\u001f\u001a\u0089ó\u008dJÇPWôäeX\n,ÌÍ°(Y9\u001f´¨±¤p5\u0007ö\u008a±\u000bå©£ÚX\u0002\u008fw¤y\r¥k\u001d\u008f{\u0086B\tOM\u0097»\u0089ÆB±«;\u009f!Ä9»Z{\u0092È.j5¦\u0013¿£N\u0084Ó\t\u0011·#\u0087\u0005¢zÒidÅ)ÔkTþ\u0081ù\u0017º\u000f)\u0016á#ÔU\u0087ÿ(¹\u0010%IñF:NG+";
int var17 = "æViUÉöa£\u001c¯¬\u001c¼xÙ\u00ad¨\u0081jx!ÈÐ\t\u0089d°bäi\u0080×\u0090ì±û[CxÆ7]?v¢\u001cJ/8¨\u0005ó\u0005c\u0095_}1p×\u007fJ´avË0\u001e\u0014£Û´õúÞ9§ìTï\u0019\u0014E¬\u0083÷mÙ\bQ¥5,\u0017p\u001d7à-rØuQøªàfeZ\u008e\u0083ñãj*®\u0088íZR¡»mÇ\u009fõ¦bCj¦ôÀ\u0087\u0017N\u0092©æè\u0005|öÝø\u008c°GüªÚ\u0085\u001cÐ$\f\u0097j\fB\u008bÑC\"r\u008f1÷¡¡Rk&^\u0018/!j²Í-¤Õ]Dú\u009ff#Ãé\u008e#Ñ¢Ï3pZ4ã\u0080\u0098_[TÆ¤Ç\u0080iVb\u0005ÖÌc2jvX\\p\u0016%\u0012\tô\u009b¤\u0089\u0084ñ\u001dÒÀDlµ2\u008bí&îëdw¸À>¶\u0081\u0080}BéÈ\u00865:¹dÏ\u0094\u000e¬$9Ø$3ÓôI¿yÑM+\u008a\n±\u0096\u001c\u0095¨OVU]âÕ\u0002Zx;!w¹ã\u0017\u009b¹»è\u000bE\u0088\u00846FV\u0016\u001dPÕ«s\u0012:\u0093\u001f/\u0004\u0019Åù/\u000b\u009bàR\u009aÞ\u0004P?\u0080ðº\u009a3ÿ\u00976¯Ø\u0012 Û\u008b²éìÁæÖ®\u0085w\u0019´\u0015\u0003\u0099\u0006A!I\u008a\"ÑQ\u001aø\u008dó\nÐ7\u0003\u0006,\u0081´\u009e+\u0003øLWÙÄ\u0093P¯[à+k\u00ad¦¨cJ\u0098U\u0016\u001eÚó\u0090ë\u0081wWRz ¡á\u001e7¦\u0099ÜKe7pO\u0095p\u001f\u001a\u0089ó\u008dJÇPWôäeX\n,ÌÍ°(Y9\u001f´¨±¤p5\u0007ö\u008a±\u000bå©£ÚX\u0002\u008fw¤y\r¥k\u001d\u008f{\u0086B\tOM\u0097»\u0089ÆB±«;\u009f!Ä9»Z{\u0092È.j5¦\u0013¿£N\u0084Ó\t\u0011·#\u0087\u0005¢zÒidÅ)ÔkTþ\u0081ù\u0017º\u000f)\u0016á#ÔU\u0087ÿ(¹\u0010%IñF:NG+"
.length();
char var14 = '0';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "xÍ¢$\u0084\u0088Ó´Éæ\u0094Ø-ÊX\u0085§\u0087'\u0001\u0001F¶Â";
int var5 = "xÍ¢$\u0084\u0088Ó´Éæ\u0094Ø-ÊX\u0085§\u0087'\u0001\u0001F¶Â".length();
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
n = new bv();
ConcurrentLinkedQueue var27 = Queues.newConcurrentLinkedQueue();
Intrinsics.checkNotNullExpressionValue(var27, a<"i">(1851, 5067219818830358266L ^ var20));
u = var27;
ConcurrentLinkedQueue var28 = Queues.newConcurrentLinkedQueue();
Intrinsics.checkNotNullExpressionValue(var28, a<"i">(14421, 6632717539217365397L ^ var20));
s = var28;
U = zf.A();
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var35;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "QµÛ¯77ÜÞÝù{l\u0001úÌHx×ºfÒ\"Úu\t\u0001ÖÄÛw\u0080åÂ\n\u0005ÃJLIéw\u0018\u0000<[\u0085ÝI\u0001»Bøí\u0004-\u001c©xÖ\u0089Ær(¥ÏÁóª0ì\"\u0080âÈùY\u0007\u007f\u008fâE\n\u00163Äú\u0011C\u0081ð\u00104SñçÙÓ\u0089\u0096S\u0086\u007f>\u0002\u0014yÆW\u0084éW\u0094%Z\bø\u0090é5Ü*\u008aÊãÈïtØ÷Z¡¿fÅ¦\u0018n";
var17 = "QµÛ¯77ÜÞÝù{l\u0001úÌHx×ºfÒ\"Úu\t\u0001ÖÄÛw\u0080åÂ\n\u0005ÃJLIéw\u0018\u0000<[\u0085ÝI\u0001»Bøí\u0004-\u001c©xÖ\u0089Ær(¥ÏÁóª0ì\"\u0080âÈùY\u0007\u007f\u008fâE\n\u00163Äú\u0011C\u0081ð\u00104SñçÙÓ\u0089\u0096S\u0086\u007f>\u0002\u0014yÆW\u0084éW\u0094%Z\bø\u0090é5Ü*\u008aÊãÈïtØ÷Z¡¿fÅ¦\u0018n"
.length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25697;
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
throw new RuntimeException("su/catlean/bv", var10);
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
throw new RuntimeException("su/catlean/bv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5785;
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
throw new RuntimeException("su/catlean/bv", var14);
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
throw new RuntimeException("su/catlean/bv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
