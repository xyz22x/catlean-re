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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e3 extends _g {
@NotNull
public static final e3 j;
static final KProperty[] O;
@NotNull
private static final cq z;
@NotNull
private static final cw B;
@NotNull
private static final cl t;
@NotNull
private static final cl f;
@NotNull
private static final cw V;
private static boolean m;
private static int S;
private static final long a = yz.a(7811351097077925840L, -1408723325581327534L, MethodHandles.lookup().lookupClass()).a(231759894766863L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private e3(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 49598004558103L;
super(b<"f">(31712, 7768679920939630300L ^ var1), jt.v(), null, 4, null, var3);
}

private final boolean n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 33211590268322L;
return (Boolean)z.E(this, var3, O[0]);
}

private final b3 j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 98200574968283L;
return (b3)B.E(this, var3, O[1]);
}

private final String Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 21393475063332L;
return (String)t.E(this, var3, O[2]);
}

private final String g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 107450145326162L;
return (String)f.E(this, var3, O[3]);
}

private final xo h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114982732105517L;
return (xo)V.E(this, var3, O[4]);
}

@Flow
private final void P(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e3.a J
// 003: ldc2_w 134566442836214
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 30236808638766
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 40231544404304
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 32723180683879
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 88581012492571
// 022: lxor
// 023: dup2
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 32
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 90366363888607
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 65032373862152
// 04a: lxor
// 04b: lstore 15
// 04d: pop2
// 04e: ldc2_w 3309825064586651940
// 051: lload 2
// 052: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: astore 17
// 059: lload 4
// 05b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 061: instanceof net/minecraft/class_418
// 064: aload 17
// 066: ifnonnull 1b2
// 069: ifeq 1a4
// 06c: goto 079
// 06f: ldc2_w 3251257288916253756
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: getstatic su/catlean/e3.m Z
// 07c: aload 17
// 07e: ifnonnull 0cb
// 081: goto 08e
// 084: ldc2_w 3251257288916253756
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: ifeq 1b5
// 091: goto 09e
// 094: ldc2_w 3251257288916253756
// 097: lload 2
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: getstatic su/catlean/e3.S I
// 0a1: bipush 1
// 0a2: iadd
// 0a3: putstatic su/catlean/e3.S I
// 0a6: aload 0
// 0a7: aload 17
// 0a9: ifnonnull 162
// 0ac: goto 0b9
// 0af: ldc2_w 3251257288916253756
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: lload 6
// 0bb: invokespecial su/catlean/e3.n (J)Z
// 0be: goto 0cb
// 0c1: ldc2_w 3251257288916253756
// 0c4: lload 2
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: ifeq 13e
// 0ce: aload 0
// 0cf: checkcast su/catlean/_g
// 0d2: iload 10
// 0d4: aload 0
// 0d5: checkcast su/catlean/_g
// 0d8: sipush 28499
// 0db: ldc2_w 1635506735153016775
// 0de: lload 2
// 0df: lxor
// 0e0: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: bipush 0
// 0e6: anewarray 63
// 0e9: iload 11
// 0eb: i2c
// 0ec: bipush 0
// 0ed: bipush 4
// 0ee: aconst_null
// 0ef: iload 12
// 0f1: i2s
// 0f2: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 0f5: lload 15
// 0f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fa: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0fd: d2i
// 0fe: lload 15
// 100: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 103: invokevirtual net/minecraft/class_746.method_23321 ()D
// 106: d2i
// 107: sipush 7108
// 10a: ldc2_w 8089478958889278287
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: dup_x2
// 115: pop
// 116: sipush 12521
// 119: ldc2_w 7748434381840855162
// 11c: lload 2
// 11d: lxor
// 11e: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: swap
// 124: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 129: bipush 0
// 12a: bipush 2
// 12b: aconst_null
// 12c: lload 8
// 12e: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 131: goto 13e
// 134: ldc2_w 3251257288916253756
// 137: lload 2
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: lload 15
// 140: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 143: invokevirtual net/minecraft/class_746.method_7331 ()V
// 146: lload 4
// 148: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 14b: aconst_null
// 14c: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
// 14f: aload 17
// 151: ifnonnull 19f
// 154: aload 0
// 155: goto 162
// 158: ldc2_w 3251257288916253756
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: lload 13
// 164: invokespecial su/catlean/e3.h (J)Lsu/catlean/xo;
// 167: getstatic su/catlean/xo.DELAYED Lsu/catlean/xo;
// 16a: if_acmpne 19b
// 16d: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 170: astore 18
// 172: sipush 450
// 175: ldc2_w 3851187253711543289
// 178: lload 2
// 179: lxor
// 17a: invokedynamic g (IJ)I bsm=su/catlean/e3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: istore 19
// 181: bipush 0
// 182: istore 20
// 184: aload 18
// 186: invokevirtual su/catlean/bo.Y ()Ljava/util/concurrent/ExecutorService;
// 189: new su/catlean/lv
// 18c: dup
// 18d: iload 19
// 18f: invokespecial su/catlean/lv.<init> (I)V
// 192: checkcast java/lang/Runnable
// 195: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
// 19a: nop
// 19b: bipush 0
// 19c: putstatic su/catlean/e3.m Z
// 19f: aload 17
// 1a1: ifnull 1b5
// 1a4: bipush 1
// 1a5: goto 1b2
// 1a8: ldc2_w 3251257288916253756
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: putstatic su/catlean/e3.m Z
// 1b5: return
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
// 000: getstatic su/catlean/e3.a J
// 003: ldc2_w 5160374565088
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 111403959593272
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 111855836689820
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 49350252704713
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 79030735542713
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 76930527667998
// 029: lxor
// 02a: lstore 12
// 02c: pop2
// 02d: ldc2_w -722649007744880334
// 030: lload 2
// 031: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: astore 14
// 038: aload 1
// 039: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 03c: instanceof net/minecraft/class_2663
// 03f: ifeq 150
// 042: lload 4
// 044: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 047: aload 14
// 049: ifnonnull 07e
// 04c: goto 059
// 04f: ldc2_w -790179883823373270
// 052: lload 2
// 053: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: athrow
// 059: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 05c: ifnull 150
// 05f: goto 06c
// 062: ldc2_w -790179883823373270
// 065: lload 2
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: lload 4
// 06e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 071: goto 07e
// 074: ldc2_w -790179883823373270
// 077: lload 2
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 081: ifnull 150
// 084: aload 1
// 085: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 088: dup
// 089: sipush 14757
// 08c: ldc2_w 4612650451948757283
// 08f: lload 2
// 090: lxor
// 091: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 099: checkcast net/minecraft/class_2663
// 09c: astore 15
// 09e: aload 15
// 0a0: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 0a3: aload 14
// 0a5: ifnonnull 10f
// 0a8: bipush 3
// 0a9: if_icmpeq 0ed
// 0ac: goto 0b9
// 0af: ldc2_w -790179883823373270
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: aload 15
// 0bb: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 0be: aload 14
// 0c0: ifnonnull 10f
// 0c3: goto 0d0
// 0c6: ldc2_w -790179883823373270
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: sipush 26918
// 0d3: ldc2_w 8536181686061804297
// 0d6: lload 2
// 0d7: lxor
// 0d8: invokedynamic g (IJ)I bsm=su/catlean/e3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: if_icmpne 150
// 0e0: goto 0ed
// 0e3: ldc2_w -790179883823373270
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: aload 15
// 0ef: lload 10
// 0f1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0f4: checkcast net/minecraft/class_1937
// 0f7: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 0fa: lload 12
// 0fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ff: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 102: goto 10f
// 105: ldc2_w -790179883823373270
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: ifeq 150
// 112: aload 0
// 113: aload 14
// 115: ifnonnull 14b
// 118: goto 125
// 11b: ldc2_w -790179883823373270
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: lload 8
// 127: invokespecial su/catlean/e3.h (J)Lsu/catlean/xo;
// 12a: getstatic su/catlean/xo.INSTANT Lsu/catlean/xo;
// 12d: if_acmpne 150
// 130: goto 13d
// 133: ldc2_w -790179883823373270
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: aload 0
// 13e: goto 14b
// 141: ldc2_w -790179883823373270
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: lload 6
// 14d: invokevirtual su/catlean/e3.r (J)V
// 150: return
}

public final void r(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e3.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 137282221461557
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 5120032443442
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 86367726928845
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 68633756092887
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 66252763171259
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w -8289513897557718977
// 02d: lload 1
// 02e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: astore 13
// 035: lload 3
// 036: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 039: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 03c: ifnull 13f
// 03f: aload 0
// 040: lload 1
// 041: lconst_0
// 042: lcmp
// 043: ifle 0a0
// 046: aload 13
// 048: ifnonnull 0a0
// 04b: goto 058
// 04e: ldc2_w -8357082094753080025
// 051: lload 1
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: lload 1
// 059: lconst_0
// 05a: lcmp
// 05b: iflt 093
// 05e: lload 5
// 060: invokespecial su/catlean/e3.j (J)Lsu/catlean/b3;
// 063: getstatic su/catlean/bn.A [I
// 066: swap
// 067: invokevirtual su/catlean/b3.ordinal ()I
// 06a: iaload
// 06b: tableswitch 194 1 4 39 93 129 165
// 088: ldc2_w -8357082094753080025
// 08b: lload 1
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 0
// 093: goto 0a0
// 096: ldc2_w -8357082094753080025
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: lload 7
// 0a2: invokespecial su/catlean/e3.Q (J)Ljava/lang/String;
// 0a5: sipush 3254
// 0a8: ldc2_w 6517167093893803316
// 0ab: lload 1
// 0ac: lxor
// 0ad: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: swap
// 0b3: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 0b8: lload 9
// 0ba: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 0bd: aload 13
// 0bf: lload 1
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: iflt 0dc
// 0c5: ifnull 13f
// 0c8: sipush 12857
// 0cb: ldc2_w 9136809343466705854
// 0ce: lload 1
// 0cf: lxor
// 0d0: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: lload 9
// 0d7: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 0da: aload 13
// 0dc: ifnull 13f
// 0df: goto 0ec
// 0e2: ldc2_w -8357082094753080025
// 0e5: lload 1
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: sipush 5055
// 0ef: ldc2_w 1261559829151167021
// 0f2: lload 1
// 0f3: lxor
// 0f4: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/e3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: lload 9
// 0fb: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 0fe: aload 13
// 100: ifnull 13f
// 103: goto 110
// 106: ldc2_w -8357082094753080025
// 109: lload 1
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: aload 0
// 111: lload 11
// 113: invokespecial su/catlean/e3.g (J)Ljava/lang/String;
// 116: lload 9
// 118: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 11b: aload 13
// 11d: ifnull 13f
// 120: goto 12d
// 123: ldc2_w -8357082094753080025
// 126: lload 1
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: new kotlin/NoWhenBranchMatchedException
// 130: dup
// 131: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 134: athrow
// 135: ldc2_w -8357082094753080025
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: return
}

private static final boolean I() {
long var0 = a ^ 2949325372582L;
long var2 = var0 ^ 29953470706041L;

try {
if (j.j(var2) == b3.KIT) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -5670399671273840532L, var0);
}

return false;
}

private static final boolean x() {
long var0 = a ^ 32172880721854L;
long var2 = var0 ^ 5301896411745L;

try {
if (j.j(var2) == b3.CUSTOM) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 8815425076542761844L, var0);
}

return false;
}

static {
long var20 = a ^ 116532479366824L;
long var22 = var20 ^ 51851499461867L;
long var24 = var20 ^ 111956095188838L;
long var26 = var20 ^ 121311897183839L;
long var28 = var20 ^ 60338472315694L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[25];
int var16 = 0;
String var15 = "á~ß,S\u0014½z¯\u0090\u008dGµ\u0089¿\u009eøì7*O.=(\u008e\"~\"Z±\u0002räWýÿ>nk\f\u009aø¸@0N5sEÌ\u0080TÙ72¾ÈÛÿ±{|]\u0087\u0010\u0092E¢«¤P\u001a\u009a©\u0007Ù0âÔ\u0089\u0088\u0010²â±*a\u0091¬aÏgÕV qfÕ\u0010\u0012^ï§ÌSú1AÛG%}4?ß\u0010kG\u0017Ûhzíó·æ¥\u0002\u001b\u0095|á@Ï/8±jÙÑ8´òR\u0010Ñ<;\u0080ÑçhnÑVæ\u000e\u00ad<ý¼ÆW\tK\u0017ç\u001f©]ö_\t¶_\u0095AmßprùàjóîÄ\u0010R±\u008avV¸üÚ· Ô\u0087nçE\u001dØô&¯«S¨\u007f\u0002ð\u0092J\u0018©9n[¼/ÉVI\u008a\u0088¥í\u0010ìDpË\n\u0004¤øÊ1\u008a¥ÀÖ\u0089\u001e 9s\u0013\u008fÒý\u0090 R£±ç\u001bLÊq§ÝX*!W×g\u0016ëÄå\u001fÎ\u0001*\u0010%ö¿[õó\u0006\u0080\u0096\b\u0085\u000e\u008c\u000f.É \u000eo ¹`\u009dM}|\u008bL(\u0081%¯e¡\u0015öT\u000bØÃ<v¢$:n~®4 .\u0099<#ÑZ·w\u0001ñi64Û\u0004AÎ~ÇlB<\u0003á\u0013N\u008b2\u0089\\ø\u0091\u0018P\u0092Û\u008cE1ÁÍ\u0019H\u008b\u000fAvþ1yEÔ§\u0092\u008f3X\u0010#\u0095ôÍÛyÝÊunZÈõ·\fj \u0002\u0084<~É\u0001xA ³êÝiû¶A\u001cç·XÇ\f\u009c©Ä»a\u0084ïù#5\u0083\u0006Þ£\u000eü\u008bø\u0004>~wf\u00919¸\u0006N\u0018<Z®<>'\u008694}¶ QRèàðØì\u0004]Y×å±E:ÔÇ\u0012ÜÂ\\8%l®ý1¢ÞË\u001b\u0015Czó\u001d6\u0004ÀöÚò\u0003)ä\u0089\\÷àTr_ú¤\u009f@æt°N\u0007¾E\u0006¨\u0019!W=\u0007²`\u0083@ØÏj Ë\u001a1åÅ%µÑzé\u0017R¯\f>\u009bÂç£0ÞØ\u0099Í\u0097¢ÛæC÷»»Øy%Q`b]PãH²AÛ@¦ \u0002¾àüÙ\u0083~ö\u0002:\u0019Ë\u0086\u0096E´Í+Áÿ\u0018\u00ad\u0017vùs\u0011ÊÌ\u0017M.è\u0083\u001f\u009b\u0002\u0017udpÊu®È \u0010î}©Sq%âõR\u001b'\u009e\u008aµ×x\u009fm\u0090\u008eÄ<<\u009dÄMó\u0007³A\u00058pÁØ\u0003JÚj\u008cÞ\u009d¨Æ\u0089ÁV\u0088ÑL\u0088ä\u008bÇ»¥~ºêj¥\u0004\u0089\u0096\u0082X\u009f`g /I\u0003×Ëm\u009fërì\u0089Þ®³\u0091\u000f·P \u0081Ó\u007fßâ\u0082bpmUô»\u0082 édxX!ËøYT45\u0084F½«x\u0010\u007f\u0018³¡G\u0095 á#\fÂ2\u0099|0\u0097\u001f×rÀ'×Á½÷Ó\u0010ÿ1]L\u0080û¸9\\âPæß9»x(§[@K¾a\u001cê\u0097{d·ÂxÕåc\u008a\u0003b«2q\b>\td½\u0000\u0097¹»[\u0006\r\u009d\u001d\u001e\u0018\u0015";
int var17 = "á~ß,S\u0014½z¯\u0090\u008dGµ\u0089¿\u009eøì7*O.=(\u008e\"~\"Z±\u0002räWýÿ>nk\f\u009aø¸@0N5sEÌ\u0080TÙ72¾ÈÛÿ±{|]\u0087\u0010\u0092E¢«¤P\u001a\u009a©\u0007Ù0âÔ\u0089\u0088\u0010²â±*a\u0091¬aÏgÕV qfÕ\u0010\u0012^ï§ÌSú1AÛG%}4?ß\u0010kG\u0017Ûhzíó·æ¥\u0002\u001b\u0095|á@Ï/8±jÙÑ8´òR\u0010Ñ<;\u0080ÑçhnÑVæ\u000e\u00ad<ý¼ÆW\tK\u0017ç\u001f©]ö_\t¶_\u0095AmßprùàjóîÄ\u0010R±\u008avV¸üÚ· Ô\u0087nçE\u001dØô&¯«S¨\u007f\u0002ð\u0092J\u0018©9n[¼/ÉVI\u008a\u0088¥í\u0010ìDpË\n\u0004¤øÊ1\u008a¥ÀÖ\u0089\u001e 9s\u0013\u008fÒý\u0090 R£±ç\u001bLÊq§ÝX*!W×g\u0016ëÄå\u001fÎ\u0001*\u0010%ö¿[õó\u0006\u0080\u0096\b\u0085\u000e\u008c\u000f.É \u000eo ¹`\u009dM}|\u008bL(\u0081%¯e¡\u0015öT\u000bØÃ<v¢$:n~®4 .\u0099<#ÑZ·w\u0001ñi64Û\u0004AÎ~ÇlB<\u0003á\u0013N\u008b2\u0089\\ø\u0091\u0018P\u0092Û\u008cE1ÁÍ\u0019H\u008b\u000fAvþ1yEÔ§\u0092\u008f3X\u0010#\u0095ôÍÛyÝÊunZÈõ·\fj \u0002\u0084<~É\u0001xA ³êÝiû¶A\u001cç·XÇ\f\u009c©Ä»a\u0084ïù#5\u0083\u0006Þ£\u000eü\u008bø\u0004>~wf\u00919¸\u0006N\u0018<Z®<>'\u008694}¶ QRèàðØì\u0004]Y×å±E:ÔÇ\u0012ÜÂ\\8%l®ý1¢ÞË\u001b\u0015Czó\u001d6\u0004ÀöÚò\u0003)ä\u0089\\÷àTr_ú¤\u009f@æt°N\u0007¾E\u0006¨\u0019!W=\u0007²`\u0083@ØÏj Ë\u001a1åÅ%µÑzé\u0017R¯\f>\u009bÂç£0ÞØ\u0099Í\u0097¢ÛæC÷»»Øy%Q`b]PãH²AÛ@¦ \u0002¾àüÙ\u0083~ö\u0002:\u0019Ë\u0086\u0096E´Í+Áÿ\u0018\u00ad\u0017vùs\u0011ÊÌ\u0017M.è\u0083\u001f\u009b\u0002\u0017udpÊu®È \u0010î}©Sq%âõR\u001b'\u009e\u008aµ×x\u009fm\u0090\u008eÄ<<\u009dÄMó\u0007³A\u00058pÁØ\u0003JÚj\u008cÞ\u009d¨Æ\u0089ÁV\u0088ÑL\u0088ä\u008bÇ»¥~ºêj¥\u0004\u0089\u0096\u0082X\u009f`g /I\u0003×Ëm\u009fërì\u0089Þ®³\u0091\u000f·P \u0081Ó\u007fßâ\u0082bpmUô»\u0082 édxX!ËøYT45\u0084F½«x\u0010\u007f\u0018³¡G\u0095 á#\fÂ2\u0099|0\u0097\u001f×rÀ'×Á½÷Ó\u0010ÿ1]L\u0080û¸9\\âPæß9»x(§[@K¾a\u001cê\u0097{d·ÂxÕåc\u008a\u0003b«2q\b>\td½\u0000\u0097¹»[\u0006\r\u009d\u001d\u001e\u0018\u0015"
.length();
char var14 = '@';
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
c = new String[25];
h = new HashMap(13);
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
String var4 = "\u009fú\f\u0000öæÏê\n¯l±\u0090g®2";
int var5 = "\u009fú\f\u0000öæÏê\n¯l±\u0090g®2".length();
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
g = new Integer[4];
KProperty[] var30 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(e3.class, b<"f">(12658, 4907917072924346275L ^ var20), b<"f">(21154, 5492618800260768884L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e3.class, b<"f">(1816, 950399937113829836L ^ var20), b<"f">(24320, 7319079822493772224L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e3.class, b<"f">(9188, 2245506444293084476L ^ var20), b<"f">(27206, 2404485457757822100L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e3.class, b<"f">(3207, 5267549450531879491L ^ var20), b<"f">(962, 9112769684691170573L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e3.class, b<"f">(2358, 228995447479615472L ^ var20), b<"f">(32505, 536238305826883644L ^ var20), 0))
};
O = var30;
j = new e3(var24);
z = yp.t(j, b<"f">(20705, 1983419124681106985L ^ var20), true, var22, null, null, c<"g">(16547, 7536412740580928709L ^ var20), null);
B = yp.L(j, b<"f">(4032, 6981671901398448396L ^ var20), b3.KIT, null, null, c<"g">(20866, 2705564274042502630L ^ var20), null, var26);
t = yp.x(j, b<"f">(30824, 5013326586039258808L ^ var20), b<"f">(18939, 3747756762486964024L ^ var20), null, e3::I, 4, var28, null);
f = yp.x(j, b<"f">(21095, 2769235947818738862L ^ var20), b<"f">(16421, 1607422092899612388L ^ var20), null, e3::x, 4, var28, null);
V = yp.L(j, b<"f">(27497, 2025487785762905530L ^ var20), xo.DELAYED, null, null, c<"g">(20866, 2705564274042502630L ^ var20), null, var26);
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "u5Î\u001djÁRÖ²ªmó1øæ\r";
var5 = "u5Î\u001djÁRÖ²ªmó1øæ\r".length();
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

var15 = "V\u001dZ\u0010\u0007\u0096|K>fR\u009e{;Ü\u008a\u0010KGcÖuH@å\u0017\u0084R\u0007\u000b\u007füõ";
var17 = "V\u001dZ\u0010\u0007\u0096|K>fR\u009e{;Ü\u008a\u0010KGcÖuH@å\u0017\u0084R\u0007\u000b\u007füõ".length();
var14 = 16;
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11513;
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
throw new RuntimeException("su/catlean/e3", var10);
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
throw new RuntimeException("su/catlean/e3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13918;
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
throw new RuntimeException("su/catlean/e3", var14);
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
throw new RuntimeException("su/catlean/e3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
