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
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class qo extends _g {
@NotNull
public static final qo e;
static final KProperty[] E;
@NotNull
private static final c8 I;
@NotNull
private static final cw O;
@NotNull
private static final c8 w;
@NotNull
private static final ArrayDeque i;
@NotNull
private static final bg G;
@NotNull
private static final bg u;
@NotNull
private static final bg n;
private static long T;
private static int U;
private static final long a = yz.a(-6965801511463904666L, 3826201949402237327L, MethodHandles.lookup().lookupClass()).a(209371219023231L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;
private static final long j;

private qo(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 89027712239994L;
super(b<"u">(8687, 7936534463730942151L ^ var4), jt.d(), null, 4, null, var6);
}

private final int V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 50737390896975L;
return ((Number)I.E(this, var3, E[0])).intValue();
}

private final yg w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 132594601201581L;
return (yg)O.E(this, var3, E[1]);
}

private final int D(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 29108487969270L;
return ((Number)w.E(this, var6, E[2])).intValue();
}

public final int j() {
return U;
}

public final void G(int <set-?>) {
U = <set-?>;
}

@Flow
private final void j(PostTasksProcessEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qo.a J
// 003: ldc2_w 82927096598852
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 114952739349016
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 41293945117199
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 52345780893278
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 79696382154875
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 62925550360046
// 029: lxor
// 02a: lstore 12
// 02c: pop2
// 02d: ldc2_w 4592984654333709003
// 030: lload 2
// 031: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: astore 14
// 038: lload 4
// 03a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03d: aload 14
// 03f: ifnull 067
// 042: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 045: ifnull 118
// 048: goto 055
// 04b: ldc2_w 4531248285271370394
// 04e: lload 2
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: lload 4
// 057: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05a: goto 067
// 05d: ldc2_w 4531248285271370394
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 06a: ifnull 118
// 06d: getstatic su/catlean/qo.G Lsu/catlean/bg;
// 070: sipush 32375
// 073: ldc2_w 4256931685111502093
// 076: lload 2
// 077: lxor
// 078: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: lload 12
// 07f: invokevirtual su/catlean/bg.c (IJ)Z
// 082: aload 14
// 084: ifnull 0d1
// 087: goto 094
// 08a: ldc2_w 4531248285271370394
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: ifeq 118
// 097: goto 0a4
// 09a: ldc2_w 4531248285271370394
// 09d: lload 2
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: getstatic su/catlean/qo.u Lsu/catlean/bg;
// 0a7: aload 14
// 0a9: ifnull 115
// 0ac: goto 0b9
// 0af: ldc2_w 4531248285271370394
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: aload 0
// 0ba: lload 6
// 0bc: invokespecial su/catlean/qo.V (J)I
// 0bf: lload 8
// 0c1: invokevirtual su/catlean/bg.q (IJ)Z
// 0c4: goto 0d1
// 0c7: ldc2_w 4531248285271370394
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: ifeq 118
// 0d4: new net/minecraft/class_2805
// 0d7: dup
// 0d8: sipush 32548
// 0db: ldc2_w 867100938130560093
// 0de: lload 2
// 0df: lxor
// 0e0: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: sipush 9993
// 0e8: ldc2_w 3035028912399589595
// 0eb: lload 2
// 0ec: lxor
// 0ed: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/qo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: invokespecial net/minecraft/class_2805.<init> (ILjava/lang/String;)V
// 0f5: checkcast net/minecraft/class_2596
// 0f8: lload 10
// 0fa: dup2_x1
// 0fb: pop2
// 0fc: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 0ff: invokestatic java/lang/System.currentTimeMillis ()J
// 102: putstatic su/catlean/qo.T J
// 105: getstatic su/catlean/qo.G Lsu/catlean/bg;
// 108: goto 115
// 10b: ldc2_w 4531248285271370394
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: invokevirtual su/catlean/bg.l ()V
// 118: return
}

@Flow
private final void p(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qo.a J
// 003: ldc2_w 86404730199317
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 10687259055190
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 117854672264448
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 42204624522876
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 22180497721575
// 056: lxor
// 057: dup2
// 058: bipush 32
// 05a: lushr
// 05b: l2i
// 05c: istore 12
// 05e: dup2
// 05f: bipush 32
// 061: lshl
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 13
// 068: dup2
// 069: bipush 48
// 06b: lshl
// 06c: bipush 48
// 06e: lushr
// 06f: l2i
// 070: istore 14
// 072: pop2
// 073: dup2
// 074: ldc2_w 46617051691535
// 077: lxor
// 078: lstore 15
// 07a: dup2
// 07b: ldc2_w 130622903246524
// 07e: lxor
// 07f: lstore 17
// 081: pop2
// 082: ldc2_w -5481854041681885542
// 085: lload 2
// 086: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: astore 19
// 08d: aload 1
// 08e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 091: instanceof net/minecraft/class_2639
// 094: aload 19
// 096: ifnull 0d1
// 099: ifeq 32b
// 09c: goto 0a9
// 09f: ldc2_w -5570038286768920885
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: aload 1
// 0aa: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0ad: dup
// 0ae: sipush 994
// 0b1: ldc2_w 8289308451676424299
// 0b4: lload 2
// 0b5: lxor
// 0b6: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/qo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0be: checkcast net/minecraft/class_2639
// 0c1: invokevirtual net/minecraft/class_2639.comp_2262 ()I
// 0c4: goto 0d1
// 0c7: ldc2_w -5570038286768920885
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: sipush 4849
// 0d4: ldc2_w 1058104248084559318
// 0d7: lload 2
// 0d8: lxor
// 0d9: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: aload 19
// 0e0: ifnull 141
// 0e3: if_icmpne 32b
// 0e6: goto 0f3
// 0e9: ldc2_w -5570038286768920885
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: invokestatic java/lang/System.currentTimeMillis ()J
// 0f6: getstatic su/catlean/qo.T J
// 0f9: lsub
// 0fa: new kotlin/ranges/LongRange
// 0fd: dup
// 0fe: lconst_0
// 0ff: getstatic su/catlean/qo.j J
// 102: invokespecial kotlin/ranges/LongRange.<init> (JJ)V
// 105: checkcast kotlin/ranges/ClosedRange
// 108: invokestatic kotlin/ranges/RangesKt.coerceIn (JLkotlin/ranges/ClosedRange;)J
// 10b: l2i
// 10c: putstatic su/catlean/qo.U I
// 10f: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 112: invokevirtual kotlin/collections/ArrayDeque.size ()I
// 115: aload 19
// 117: ifnull 177
// 11a: goto 127
// 11d: ldc2_w -5570038286768920885
// 120: lload 2
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: sipush 4953
// 12a: ldc2_w 7480186802136446069
// 12d: lload 2
// 12e: lxor
// 12f: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: goto 141
// 137: ldc2_w -5570038286768920885
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: if_icmplt 158
// 144: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 147: invokevirtual kotlin/collections/ArrayDeque.removeFirst ()Ljava/lang/Object;
// 14a: pop
// 14b: goto 158
// 14e: ldc2_w -5570038286768920885
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 15b: getstatic su/catlean/qo.U I
// 15e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 161: invokevirtual kotlin/collections/ArrayDeque.add (Ljava/lang/Object;)Z
// 164: pop
// 165: getstatic su/catlean/qo.U I
// 168: i2f
// 169: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 16c: checkcast java/lang/Iterable
// 16f: invokestatic kotlin/collections/CollectionsKt.averageOfInt (Ljava/lang/Iterable;)D
// 172: d2f
// 173: ldc 1.15
// 175: fmul
// 176: fcmpl
// 177: aload 19
// 179: ifnull 19f
// 17c: ifle 318
// 17f: goto 18c
// 182: ldc2_w -5570038286768920885
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 18f: invokevirtual kotlin/collections/ArrayDeque.size ()I
// 192: goto 19f
// 195: ldc2_w -5570038286768920885
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: aload 19
// 1a1: ifnull 1f3
// 1a4: sipush 4953
// 1a7: ldc2_w 7480186802136446069
// 1aa: lload 2
// 1ab: lxor
// 1ac: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: if_icmplt 318
// 1b4: goto 1c1
// 1b7: ldc2_w -5570038286768920885
// 1ba: lload 2
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: getstatic su/catlean/qo.n Lsu/catlean/bg;
// 1c4: aload 0
// 1c5: iload 12
// 1c7: iload 13
// 1c9: iload 14
// 1cb: i2s
// 1cc: invokespecial su/catlean/qo.D (IIS)I
// 1cf: aload 19
// 1d1: ifnull 328
// 1d4: goto 1e1
// 1d7: ldc2_w -5570038286768920885
// 1da: lload 2
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: lload 15
// 1e3: invokevirtual su/catlean/bg.q (IJ)Z
// 1e6: goto 1f3
// 1e9: ldc2_w -5570038286768920885
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: ifeq 318
// 1f6: iload 9
// 1f8: aload 0
// 1f9: checkcast su/catlean/_g
// 1fc: sipush 14887
// 1ff: ldc2_w 8379160934619230632
// 202: lload 2
// 203: lxor
// 204: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/qo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: bipush 2
// 20a: anewarray 261
// 20d: astore 21
// 20f: aload 21
// 211: bipush 0
// 212: getstatic su/catlean/qo.i Lkotlin/collections/ArrayDeque;
// 215: checkcast java/lang/Iterable
// 218: invokestatic kotlin/collections/CollectionsKt.averageOfInt (Ljava/lang/Iterable;)D
// 21b: d2i
// 21c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 21f: aastore
// 220: aload 21
// 222: bipush 1
// 223: getstatic su/catlean/qo.U I
// 226: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 229: aastore
// 22a: aload 21
// 22c: iload 10
// 22e: i2c
// 22f: bipush 0
// 230: bipush 4
// 231: aconst_null
// 232: iload 11
// 234: i2s
// 235: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 238: astore 20
// 23a: aload 0
// 23b: aload 19
// 23d: ifnull 294
// 240: lload 17
// 242: invokespecial su/catlean/qo.w (J)Lsu/catlean/yg;
// 245: getstatic su/catlean/yg.BOTH Lsu/catlean/yg;
// 248: if_acmpeq 283
// 24b: goto 258
// 24e: ldc2_w -5570038286768920885
// 251: lload 2
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: aload 0
// 259: lload 17
// 25b: invokespecial su/catlean/qo.w (J)Lsu/catlean/yg;
// 25e: getstatic su/catlean/yg.NOTIFICATION Lsu/catlean/yg;
// 261: aload 19
// 263: ifnull 2cf
// 266: goto 273
// 269: ldc2_w -5570038286768920885
// 26c: lload 2
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: if_acmpne 2b4
// 276: goto 283
// 279: ldc2_w -5570038286768920885
// 27c: lload 2
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: aload 0
// 284: checkcast su/catlean/_g
// 287: goto 294
// 28a: ldc2_w -5570038286768920885
// 28d: lload 2
// 28e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 293: athrow
// 294: aload 20
// 296: iload 4
// 298: iload 5
// 29a: i2c
// 29b: iload 6
// 29d: i2s
// 29e: getstatic su/catlean/ys.WARNING Lsu/catlean/ys;
// 2a1: bipush 0
// 2a2: aconst_null
// 2a3: sipush 7600
// 2a6: ldc2_w 6069943156828732062
// 2a9: lload 2
// 2aa: lxor
// 2ab: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: aconst_null
// 2b1: invokestatic su/catlean/o2.e (Lsu/catlean/_g;Ljava/lang/String;ICSLsu/catlean/ys;ILnet/minecraft/class_1799;ILjava/lang/Object;)V
// 2b4: aload 0
// 2b5: aload 19
// 2b7: ifnull 30e
// 2ba: lload 17
// 2bc: invokespecial su/catlean/qo.w (J)Lsu/catlean/yg;
// 2bf: getstatic su/catlean/yg.BOTH Lsu/catlean/yg;
// 2c2: goto 2cf
// 2c5: ldc2_w -5570038286768920885
// 2c8: lload 2
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: if_acmpeq 2fd
// 2d2: aload 0
// 2d3: aload 19
// 2d5: ifnull 30e
// 2d8: goto 2e5
// 2db: ldc2_w -5570038286768920885
// 2de: lload 2
// 2df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: athrow
// 2e5: lload 17
// 2e7: invokespecial su/catlean/qo.w (J)Lsu/catlean/yg;
// 2ea: getstatic su/catlean/yg.CHAT Lsu/catlean/yg;
// 2ed: if_acmpne 318
// 2f0: goto 2fd
// 2f3: ldc2_w -5570038286768920885
// 2f6: lload 2
// 2f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fc: athrow
// 2fd: aload 0
// 2fe: checkcast su/catlean/_g
// 301: goto 30e
// 304: ldc2_w -5570038286768920885
// 307: lload 2
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: aload 20
// 310: bipush 0
// 311: bipush 2
// 312: aconst_null
// 313: lload 7
// 315: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 318: getstatic su/catlean/qo.G Lsu/catlean/bg;
// 31b: sipush 4872
// 31e: ldc2_w 1743693556353299502
// 321: lload 2
// 322: lxor
// 323: invokedynamic q (IJ)I bsm=su/catlean/qo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: invokevirtual su/catlean/bg.G (I)V
// 32b: return
}

static {
long var25 = a ^ 110951889553780L;
int var27 = (int)((var25 ^ 23252616302807L) >>> 48);
long var28 = (var25 ^ 23252616302807L) << 16 >>> 16;
long var30 = var25 ^ 87547972332757L;
long var32 = var25 ^ 36583598136071L;
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[13];
int var21 = 0;
String var20 = "Ä\u0018\u0081\u0000Ç\u001e\u0005\u0082MùæWÝ@ª¢Q\u0082À\u000f9ÐC\u0082\u008b3!\u008flÈç\u007f \u0006\u009c\u009f\u0019\t\u0096£O7\u008dd2Ë>~D%¬\u0015\njÊQcX\n»Uõ¸jA¨»H~;\u0088aöe\u0010P1j\fÇÓ¬\u0091«õO¦*¢~\u0005^\u0085·|Å\u009e\u009c«G\u0081àZ\u001d°Î¥Õÿ\u0000]\u0003S'\u008a\u0098\\\u008fÂ\u00ad|\u0093\u0098+á'¼·>gpïf2Yý_[2¿\u0095t`mÓ\u0091h¤î\tàÂJ¼g¶¡\u0002 à\u009e\u0084\u0088\"_\u0000\u000e=b:\u0098\u009eðÜàJ'qí\u0000pþ\u0086\u00ad\u0006úJÉ\u008e\u0015döz\n·\u0093±9\n\u0089\u001adÂ\"\u0089 \u0015§o[\u0013çp\u0097©mà^i \u0092Ìl2µÇ:~\u0011PÇMÀ0(\u0003\u008bå\u0089z\u008cRp\u001c»¹\u009b¸=\u0090\u0014²÷²)ñ\u008fyDzý\u00ad\u0092¯¢\u0001³î\u008d\u001bÿ',Tø\u0010weýAuá\u0019\u001eÒU»B\u008bá^Ë \u0088\u007f*\u0006EN¤¤«ê²2ã\u009füÕfØ8t±\u0004Æi#\u001eëlM÷\u009f'\u0010/õ>q{Cc\u0005\u0095\u0096]\n&î\u009f\u0080 «ò\u0097¿´\u0085$°M /\u0012\u0086]\u009cÅ\u0080»@î\\;\u009dUêÈ3\u008aI\u008d\"Õ\u0010s¢\u001f9dÀ> 7¸\u0017¼G\u0087à\u0089\u0010Fv\u0086\u0085Wp(\u0014%1þ@}m¦n\u0018\u0006£ÖÄ>ê,\u0090?¹âù>u^öôü·\u008du¿ì\u0092";
int var22 = "Ä\u0018\u0081\u0000Ç\u001e\u0005\u0082MùæWÝ@ª¢Q\u0082À\u000f9ÐC\u0082\u008b3!\u008flÈç\u007f \u0006\u009c\u009f\u0019\t\u0096£O7\u008dd2Ë>~D%¬\u0015\njÊQcX\n»Uõ¸jA¨»H~;\u0088aöe\u0010P1j\fÇÓ¬\u0091«õO¦*¢~\u0005^\u0085·|Å\u009e\u009c«G\u0081àZ\u001d°Î¥Õÿ\u0000]\u0003S'\u008a\u0098\\\u008fÂ\u00ad|\u0093\u0098+á'¼·>gpïf2Yý_[2¿\u0095t`mÓ\u0091h¤î\tàÂJ¼g¶¡\u0002 à\u009e\u0084\u0088\"_\u0000\u000e=b:\u0098\u009eðÜàJ'qí\u0000pþ\u0086\u00ad\u0006úJÉ\u008e\u0015döz\n·\u0093±9\n\u0089\u001adÂ\"\u0089 \u0015§o[\u0013çp\u0097©mà^i \u0092Ìl2µÇ:~\u0011PÇMÀ0(\u0003\u008bå\u0089z\u008cRp\u001c»¹\u009b¸=\u0090\u0014²÷²)ñ\u008fyDzý\u00ad\u0092¯¢\u0001³î\u008d\u001bÿ',Tø\u0010weýAuá\u0019\u001eÒU»B\u008bá^Ë \u0088\u007f*\u0006EN¤¤«ê²2ã\u009füÕfØ8t±\u0004Æi#\u001eëlM÷\u009f'\u0010/õ>q{Cc\u0005\u0095\u0096]\n&î\u009f\u0080 «ò\u0097¿´\u0085$°M /\u0012\u0086]\u009cÅ\u0080»@î\\;\u009dUêÈ3\u008aI\u008d\"Õ\u0010s¢\u001f9dÀ> 7¸\u0017¼G\u0087à\u0089\u0010Fv\u0086\u0085Wp(\u0014%1þ@}m¦n\u0018\u0006£ÖÄ>ê,\u0090?¹âù>u^öôü·\u008du¿ì\u0092"
.length();
char var19 = ' ';
int var37 = -1;

label64:
while (true) {
String var38 = var20.substring(++var37, var37 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var38.getBytes("ISO-8859-1"));
String var51 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var51;
if ((var37 += var19) >= var22) {
b = var23;
c = new String[13];
h = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[14];
int var8 = 0;
String var9 = "n·\u009f\u00928¨Éåýï\u0016¨ª\u0003d±åIÊ\u0015[ò<\u009d\u0085ñGz±ëc8K^-vXW~\u008b\u0019\u0010äÎä±B\u0001\u008c\u001dD9aàþú\u000e~1®àÚ\u0090ãíß¤:Ð¿\u0081È\u0002½ò6°-\u001fTBd]u¶\u008d²<o±R£OW¸Ç";
int var10 = "n·\u009f\u00928¨Éåýï\u0016¨ª\u0003d±åIÊ\u0015[ò<\u009d\u0085ñGz±ëc8K^-vXW~\u008b\u0019\u0010äÎä±B\u0001\u008c\u001dD9aàþú\u000e~1®àÚ\u0090ãíß¤:Ð¿\u0081È\u0002½ò6°-\u001fTBd]u¶\u008d²<o±R£OW¸Ç"
.length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var41 = var11;
var10001 = var8++;
long var55 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var60 = -1;

while (true) {
long var13 = var55;
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
long var63 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var60) {
case 0:
var41[var10001] = var63;
if (var7 >= var10) {
f = var11;
g = new Integer[14];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4324469286900840437L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var58 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var49 = -1;
j = var58;
KProperty[] var34 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qo.class, b<"u">(30338, 8937347364714817902L ^ var25), b<"u">(31930, 7536090480551863131L ^ var25), 0)),
Reflection.property1(new PropertyReference1Impl(qo.class, b<"u">(22715, 8020600589902710608L ^ var25), b<"u">(15010, 5103348029002835268L ^ var25), 0)),
Reflection.property1(new PropertyReference1Impl(qo.class, b<"u">(26173, 4156203376565565917L ^ var25), b<"u">(24952, 172857362202771089L ^ var25), 0))
};
E = var34;
e = new qo((char)var27, var28);
I = yp.L(
e,
b<"u">(7006, 2527383119889712317L ^ var25),
c<"q">(1722, 3358173401554597364L ^ var25),
new IntRange(0, c<"q">(22453, 2305197177045542129L ^ var25)),
var30,
null,
null,
c<"q">(32453, 4951643368518208903L ^ var25),
null
);
O = yp.L(e, b<"u">(26873, 960085021661509396L ^ var25), yg.CHAT, null, null, c<"q">(17928, 7461381096516941133L ^ var25), null, var32);
w = yp.L(
e,
b<"u">(6911, 6862994552978851088L ^ var25),
c<"q">(16330, 7261832468730776710L ^ var25),
new IntRange(0, c<"q">(12311, 2201297469616915295L ^ var25)),
var30,
null,
null,
c<"q">(20757, 601876491425833566L ^ var25),
null
);
i = new ArrayDeque(c<"q">(12482, 3596292175987868545L ^ var25));
G = new bg();
u = new bg();
n = new bg();
return;
}
break;
default:
var41[var10001] = var63;
if (var7 < var10) {
continue label46;
}

var9 = "òM\u001dÂ òT<µ2`t\u0017}\u009e÷";
var10 = "òM\u001dÂ òT<µ2`t\u0017}\u009e÷".length();
var7 = 0;
}

byte var48 = var7;
var7 += 8;
var12 = var9.substring(var48, var7).getBytes("ISO-8859-1");
var41 = var11;
var10001 = var8++;
var55 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var60 = 0;
}
}
}

var19 = var20.charAt(var37);
break;
default:
var23[var21++] = var51;
if ((var37 += var19) < var22) {
var19 = var20.charAt(var37);
continue label64;
}

var20 = "6?\u0091Aä¥³úféU©\u008cD2\u008dÍ=ðg\u000b\u0098>\u0081H»c¡Ç\u0018\u009bºHÐ\u0000\u0092ÈznbL)§¸vs\u009dY»k¼ªxÑ£xÃ\u001b7\u0018\u009a>\u009bë\u0095eTâG\u0094\u008d\u0015Ù\u001aËò7\u008a[\\ý|u\\Þ¡ë\u0010é\u0011Í\u0087U\u000bø÷3\u000fP\u000bËüÛ\u0093¹";
var22 = "6?\u0091Aä¥³úféU©\u008cD2\u008dÍ=ðg\u000b\u0098>\u0081H»c¡Ç\u0018\u009bºHÐ\u0000\u0092ÈznbL)§¸vs\u009dY»k¼ªxÑ£xÃ\u001b7\u0018\u009a>\u009bë\u0095eTâG\u0094\u008d\u0015Ù\u001aËò7\u008a[\\ý|u\\Þ¡ë\u0010é\u0011Í\u0087U\u000bø÷3\u000fP\u000bËüÛ\u0093¹"
.length();
var19 = ' ';
var37 = -1;
}

var38 = var20.substring(++var37, var37 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14475;
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
throw new RuntimeException("su/catlean/qo", var10);
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
throw new RuntimeException("su/catlean/qo" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21551;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/qo", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/qo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
