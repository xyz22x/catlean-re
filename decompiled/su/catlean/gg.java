package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class gg implements ym {
@NotNull
public static final gg P;
private static int B;
private static int O;
private static int r;
private static final long a = yz.a(6481707318787404420L, -7861560322843911412L, MethodHandles.lookup().lookupClass()).a(137461647105705L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private gg() {
}

@Flow
private final void J(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: ldc2_w 56761333636155
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 7905948457065487439
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 1
// 14: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 17: instanceof net/minecraft/class_2868
// 1a: aload 4
// 1c: ifnonnull 46
// 1f: ifeq 49
// 22: goto 2f
// 25: ldc2_w 7893106694145695108
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: aload 1
// 30: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 33: checkcast net/minecraft/class_2868
// 36: invokevirtual net/minecraft/class_2868.method_12442 ()I
// 39: goto 46
// 3c: ldc2_w 7893106694145695108
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: putstatic su/catlean/gg.B I
// 49: return
}

public final int O(@NotNull class_1792 item, boolean offHand, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 133287311474760
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 98530163986030
// 012: lxor
// 013: lstore 7
// 015: pop2
// 016: aload 1
// 017: sipush 15110
// 01a: ldc2_w 6348862517523982309
// 01d: lload 3
// 01e: lxor
// 01f: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 027: bipush 0
// 028: istore 10
// 02a: ldc2_w 6649749918798687664
// 02d: lload 3
// 02e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: bipush 0
// 034: istore 11
// 036: astore 9
// 038: iload 11
// 03a: sipush 31484
// 03d: ldc2_w 2342870364297144225
// 040: lload 3
// 041: lxor
// 042: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: if_icmpge 0bf
// 04a: lload 5
// 04c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 04f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 052: dup
// 053: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 056: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 059: iload 11
// 05b: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 05e: dup
// 05f: sipush 21254
// 062: ldc2_w 6247841768618381296
// 065: lload 3
// 066: lxor
// 067: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06f: astore 12
// 071: aload 9
// 073: lload 3
// 074: lconst_0
// 075: lcmp
// 076: iflt 0bc
// 079: ifnonnull 0ba
// 07c: aload 12
// 07e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 081: aload 1
// 082: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 085: aload 9
// 087: lload 3
// 088: lconst_0
// 089: lcmp
// 08a: iflt 0d9
// 08d: ifnonnull 0d7
// 090: goto 09d
// 093: ldc2_w 6662733504319450235
// 096: lload 3
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: ifeq 0b7
// 0a0: goto 0ad
// 0a3: ldc2_w 6662733504319450235
// 0a6: lload 3
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: iload 10
// 0af: aload 12
// 0b1: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 0b4: iadd
// 0b5: istore 10
// 0b7: iinc 11 1
// 0ba: aload 9
// 0bc: ifnull 038
// 0bf: lload 7
// 0c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c4: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0c7: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 0ca: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0cd: aload 1
// 0ce: lload 3
// 0cf: lconst_0
// 0d0: lcmp
// 0d1: ifle 129
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d7: aload 9
// 0d9: lload 3
// 0da: lconst_0
// 0db: lcmp
// 0dc: ifle 10a
// 0df: ifnonnull 108
// 0e2: ifeq 107
// 0e5: goto 0f2
// 0e8: ldc2_w 6662733504319450235
// 0eb: lload 3
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: getstatic su/catlean/gg.O I
// 0f5: bipush 1
// 0f6: iadd
// 0f7: putstatic su/catlean/gg.O I
// 0fa: goto 107
// 0fd: ldc2_w 6662733504319450235
// 100: lload 3
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: iload 2
// 108: aload 9
// 10a: ifnonnull 160
// 10d: ifeq 15e
// 110: goto 11d
// 113: ldc2_w 6662733504319450235
// 116: lload 3
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: lload 7
// 11f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 122: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 125: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 128: aload 1
// 129: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 12c: aload 9
// 12e: ifnonnull 160
// 131: goto 13e
// 134: ldc2_w 6662733504319450235
// 137: lload 3
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: ifeq 15e
// 141: goto 14e
// 144: ldc2_w 6662733504319450235
// 147: lload 3
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: iload 10
// 150: lload 7
// 152: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 155: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 158: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 15b: iadd
// 15c: istore 10
// 15e: iload 10
// 160: ireturn
}

public static int k(gg var0, long var1, class_1792 var3, boolean var4, int var5, Object var6) {
var1 = a ^ var1;
long var7 = var1 ^ 94229263815400L;
_g[] var9 = vm.a<"Å">(-115526788038193251L, var1);

try {
int var10000 = var5 & 2;
if (var9 != null) {
return var10000;
}

if (var10000 == 0) {
return var0.O(var3, var4, var7);
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, -118236548187468202L, var1);
}

var4 = false;
return var0.O(var3, var4, var7);
}

public final int g(short a, @NotNull class_1792 item, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/gg.a J
// 1b: lxor
// 1c: lstore 5
// 1e: lload 5
// 20: dup2
// 21: ldc2_w 4142994119711
// 24: lxor
// 25: lstore 7
// 27: pop2
// 28: ldc2_w -8198255522123579455
// 2b: lload 5
// 2d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: aload 2
// 33: sipush 22135
// 36: ldc2_w 1043703690536327417
// 39: lload 5
// 3b: lxor
// 3c: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 44: bipush 0
// 45: istore 10
// 47: astore 9
// 49: bipush 0
// 4a: istore 11
// 4c: lload 7
// 4e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 51: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 54: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 57: invokevirtual net/minecraft/class_2371.size ()I
// 5a: istore 12
// 5c: iload 11
// 5e: iload 12
// 60: if_icmpge ce
// 63: lload 7
// 65: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 68: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 6b: iload 11
// 6d: invokevirtual net/minecraft/class_1703.method_7611 (I)Lnet/minecraft/class_1735;
// 70: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 73: dup
// 74: sipush 21254
// 77: ldc2_w 6247777617748237697
// 7a: lload 5
// 7c: lxor
// 7d: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 85: astore 13
// 87: aload 9
// 89: iload 4
// 8b: iflt cb
// 8e: ifnonnull c9
// 91: aload 13
// 93: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 96: aload 2
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 9
// 9c: iload 4
// 9e: ifle e6
// a1: ifnonnull e4
// a4: goto b2
// a7: ldc2_w -8212434274002911734
// aa: lload 5
// ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b1: athrow
// b2: ifeq c6
// b5: goto c3
// b8: ldc2_w -8212434274002911734
// bb: lload 5
// bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c2: athrow
// c3: iinc 10 1
// c6: iinc 11 1
// c9: aload 9
// cb: ifnull 5c
// ce: lload 7
// d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// d3: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// d6: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// d9: iload 1
// da: iflt 85
// dd: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// e0: aload 2
// e1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// e4: aload 9
// e6: ifnonnull ff
// e9: ifeq fd
// ec: goto fa
// ef: ldc2_w -8212434274002911734
// f2: lload 5
// f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f9: athrow
// fa: iinc 10 1
// fd: iload 10
// ff: ireturn
}

public final int R(@NotNull n5 searcher, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 21213146670071
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -5633472591590899671
// 12: lload 2
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 1
// 19: sipush 31109
// 1c: ldc2_w 3279643746575419625
// 1f: lload 2
// 20: lxor
// 21: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: bipush 0
// 2a: istore 7
// 2c: astore 6
// 2e: bipush 0
// 2f: istore 8
// 31: iload 8
// 33: sipush 11178
// 36: ldc2_w 2187790321288190822
// 39: lload 2
// 3a: lxor
// 3b: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: if_icmpge aa
// 43: lload 4
// 45: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 48: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 4b: iload 8
// 4d: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 50: dup
// 51: sipush 24361
// 54: ldc2_w 7245111314403700292
// 57: lload 2
// 58: lxor
// 59: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 61: astore 9
// 63: aload 6
// 65: lload 2
// 66: lconst_0
// 67: lcmp
// 68: ifle a7
// 6b: ifnonnull a5
// 6e: aload 1
// 6f: aload 9
// 71: invokeinterface su/catlean/n5.b (Lnet/minecraft/class_1799;)Z 2
// 76: aload 6
// 78: ifnonnull ac
// 7b: goto 88
// 7e: ldc2_w -5625134449236442654
// 81: lload 2
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: ifeq a2
// 8b: goto 98
// 8e: ldc2_w -5625134449236442654
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: iload 7
// 9a: aload 9
// 9c: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 9f: iadd
// a0: istore 7
// a2: iinc 8 1
// a5: aload 6
// a7: ifnull 31
// aa: iload 7
// ac: ireturn
}

@NotNull
public final fg P(long a, @NotNull n5 searcher) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 90438702574740
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 14623531257933
// 12: lxor
// 13: lstore 6
// 15: pop2
// 16: aload 3
// 17: sipush 10459
// 1a: ldc2_w 3511911235862436094
// 1d: lload 1
// 1e: lxor
// 1f: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 27: ldc2_w 8112253036678250860
// 2a: lload 1
// 2b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: bipush 0
// 31: istore 9
// 33: astore 8
// 35: iload 9
// 37: sipush 8828
// 3a: ldc2_w 7804593736524813306
// 3d: lload 1
// 3e: lxor
// 3f: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: if_icmpge d9
// 47: lload 1
// 48: lconst_0
// 49: lcmp
// 4a: iflt 80
// 4d: lload 4
// 4f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 52: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 55: dup
// 56: ifnull 7f
// 59: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 5c: dup
// 5d: ifnull 7f
// 60: goto 6d
// 63: ldc2_w 8118551606001844391
// 66: lload 1
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: iload 9
// 6f: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 72: goto 81
// 75: ldc2_w 8118551606001844391
// 78: lload 1
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: pop
// 80: aconst_null
// 81: astore 10
// 83: aload 8
// 85: lload 1
// 86: lconst_0
// 87: lcmp
// 88: ifle d6
// 8b: ifnonnull d4
// 8e: aload 10
// 90: ifnull d1
// 93: goto a0
// 96: ldc2_w 8118551606001844391
// 99: lload 1
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: aload 3
// a1: aload 10
// a3: invokeinterface su/catlean/n5.b (Lnet/minecraft/class_1799;)Z 2
// a8: ifeq d1
// ab: goto b8
// ae: ldc2_w 8118551606001844391
// b1: lload 1
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: new su/catlean/fg
// bb: dup
// bc: lload 6
// be: iload 9
// c0: bipush 1
// c1: aload 10
// c3: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// c6: areturn
// c7: ldc2_w 8118551606001844391
// ca: lload 1
// cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0: athrow
// d1: iinc 9 1
// d4: aload 8
// d6: ifnull 35
// d9: lload 1
// da: lconst_0
// db: lcmp
// dc: iflt 47
// df: getstatic su/catlean/fg.O Lsu/catlean/d5;
// e2: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// e5: areturn
}

@NotNull
public final fg j(short a, @NotNull n5 searcher, short a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/gg.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 47645986875622
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 127927123448895
// 02b: lxor
// 02c: lstore 9
// 02e: pop2
// 02f: ldc2_w -5411362759790541538
// 032: lload 5
// 034: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: aload 2
// 03a: sipush 10459
// 03d: ldc2_w 3511868434711993484
// 040: lload 5
// 042: lxor
// 043: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04b: astore 11
// 04d: sipush 340
// 050: ldc2_w 779892486411400361
// 053: lload 5
// 055: lxor
// 056: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: istore 12
// 05d: iload 12
// 05f: iflt 125
// 062: iload 3
// 063: ifle 09b
// 066: lload 7
// 068: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 06e: dup
// 06f: ifnull 09a
// 072: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 075: dup
// 076: ifnull 09a
// 079: goto 087
// 07c: ldc2_w -5415408409421282091
// 07f: lload 5
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: iload 12
// 089: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 08c: goto 09c
// 08f: ldc2_w -5415408409421282091
// 092: lload 5
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: pop
// 09b: aconst_null
// 09c: astore 13
// 09e: aload 11
// 0a0: iload 1
// 0a1: iflt 122
// 0a4: ifnonnull 120
// 0a7: aload 13
// 0a9: ifnull 11d
// 0ac: goto 0ba
// 0af: ldc2_w -5415408409421282091
// 0b2: lload 5
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 2
// 0bb: aload 13
// 0bd: invokeinterface su/catlean/n5.b (Lnet/minecraft/class_1799;)Z 2
// 0c2: iload 1
// 0c3: iflt 0ec
// 0c6: aload 11
// 0c8: ifnonnull 0ec
// 0cb: goto 0d9
// 0ce: ldc2_w -5415408409421282091
// 0d1: lload 5
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: ifeq 11d
// 0dc: goto 0ea
// 0df: ldc2_w -5415408409421282091
// 0e2: lload 5
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: iload 12
// 0ec: sipush 8828
// 0ef: ldc2_w 7804462944362567560
// 0f2: lload 5
// 0f4: lxor
// 0f5: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: if_icmpge 10e
// 0fd: iinc 12 36
// 100: goto 10e
// 103: ldc2_w -5415408409421282091
// 106: lload 5
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: new su/catlean/fg
// 111: dup
// 112: lload 9
// 114: iload 12
// 116: bipush 1
// 117: aload 13
// 119: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// 11c: areturn
// 11d: iinc 12 -1
// 120: aload 11
// 122: ifnull 05d
// 125: iload 4
// 127: ifge 062
// 12a: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 12d: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 130: areturn
}

@NotNull
public final fg U(long a, @NotNull List items) {
ax = a ^ ax;
long var4 = ax ^ 68136080545853L;
Intrinsics.checkNotNullParameter(items, a<"q">(19060, 4005899812359164579L ^ ax));
return this.P(var4, gg::V);
}

@NotNull
public final fg Y(int a, @NotNull class_1792[] items, int a, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 61705858920103L;
Intrinsics.checkNotNullParameter(items, a<"q">(19060, 4005904866845484089L ^ var5));
return this.P(var7, gg::w);
}

@NotNull
public final fg B(@NotNull List items, short a, int a, char a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var5 ^ 114977898525058L;
int var7 = (int)((var5 ^ 114977898525058L) >>> 48);
int var8 = (int)((var5 ^ 114977898525058L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(items, a<"q">(20083, 8861407125440002938L ^ var5));
return this.j((short)var7, gg::W, (short)var8, var9);
}

@NotNull
public final fg o(@NotNull class_1792[] items, char a, long a) {
long var5 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
long var10001 = var5 ^ 91050808020138L;
int var7 = (int)((var5 ^ 91050808020138L) >>> 48);
int var8 = (int)((var5 ^ 91050808020138L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(items, a<"q">(19060, 4005888669917053510L ^ var5));
return this.j((short)var7, gg::L, (short)var8, var9);
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public final fg H(long a, @NotNull List blocks) {
ax = a ^ ax;
long var4 = ax ^ 64513567368182L;
_g[] var10000 = vm.a<"Å">(-3792166690596439385L, ax);
Intrinsics.checkNotNullParameter(blocks, a<"q">(32442, 7302747256325829968L ^ ax));
Iterable var7 = blocks;
boolean var8 = false;
_g[] var6 = var10000;
var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, b<"g">(4355, 9166691904713120589L ^ ax)));
boolean var11 = false;
Iterator var12 = var7.iterator();

label22:
while (true) {
if (var12.hasNext()) {
var10000 = (_g[])var12.next();
} else {
var10000 = var10;
if (ax >= 0L) {
return this.U(var4, var10);
}
}

do {
Object var13 = var10000;
class_2248 var14 = (class_2248)var13;
if (var6 != null) {
return this.U(var4, var10);
}

boolean var15 = false;
var10.add(var14.method_8389());
if (var6 == null) {
continue label22;
}

var10000 = var10;
} while (ax < 0L);

return this.U(var4, var10);
}
}

@NotNull
public final fg o(@NotNull class_2248[] blocks, long a) {
ax = a ^ ax;
long var4 = ax ^ 37334603764634L;
_g[] var10000 = vm.a<"Å">(8877614269766666955L, ax);
Intrinsics.checkNotNullParameter(blocks, a<"q">(12709, 8448536519804881449L ^ ax));
boolean var8 = false;
_g[] var6 = var10000;
class_2248[] var9 = blocks;
Collection var10 = new ArrayList(blocks.length);
boolean var11 = false;
int var12 = 0;
int var13 = blocks.length;

while (true) {
if (var12 < var13) {
class_2248 var14 = var9[var12];
var20 = var10;
if (var6 != null) {
break;
}

boolean var16 = false;
var10.add(var14.method_8389());
var12++;
if (var6 == null) {
continue;
}
}

var20 = var10;
if (ax > 0L) {
}
break;
}

return this.U(var4, (List)var20);
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public final fg r(byte a, int a, @NotNull List blocks, int a) {
long var5 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
long var10001 = var5 ^ 126957511235558L;
int var7 = (int)((var5 ^ 126957511235558L) >>> 48);
int var8 = (int)((var5 ^ 126957511235558L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(1333876759338148730L, var5);
Intrinsics.checkNotNullParameter(blocks, a<"q">(32442, 7302855441058606221L ^ var5));
Iterable var11 = blocks;
_g[] var10 = var10000;
boolean var12 = false;
var var14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var11, b<"g">(20241, 8807128622291639436L ^ var5)));
boolean var15 = false;
Iterator var16 = var11.iterator();

label22:
while (true) {
if (var16.hasNext()) {
var10000 = (_g[])var16.next();
} else {
var10000 = var14;
if (axxx >= 0) {
return this.B(var14, (short)var7, var8, (char)var9);
}
}

do {
Object var17 = var10000;
class_2248 var18 = (class_2248)var17;
if (var10 != null) {
return this.B(var14, (short)var7, var8, (char)var9);
}

boolean var19 = false;
var14.add(var18.method_8389());
if (var10 == null) {
continue label22;
}

var10000 = var14;
} while (axxx < 0);

return this.B(var14, (short)var7, var8, (char)var9);
}
}

@NotNull
public final fg O(int a, short a, @NotNull class_2248[] blocks, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var5 ^ 85795162953136L;
int var7 = (int)((var5 ^ 85795162953136L) >>> 48);
int var8 = (int)((var5 ^ 85795162953136L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(blocks, a<"q">(32442, 7302807956485992155L ^ var5));
boolean var12 = false;
class_2248[] var13 = blocks;
Collection var14 = new ArrayList(blocks.length);
boolean var15 = false;
int var16 = 0;
_g[] var10000 = vm.a<"Å">(-3398849203419340500L, var5);
int var17 = blocks.length;
_g[] var10 = var10000;

while (true) {
if (var16 < var17) {
class_2248 var18 = var13[var16];
var23 = var14;
if (var10 != null) {
break;
}

boolean var20 = false;
var14.add(var18.method_8389());
var16++;
if (var10 == null) {
continue;
}
}

var23 = var14;
if (axx >= 0) {
}
break;
}

return this.B((List)var23, (short)var7, var8, (char)var9);
}

public final void o(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 78685578743396L;
O = zf.v(var3).method_31548().method_67532();
}

public final void d(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 5420486027611
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -5839027264043327729
// 11: lload 1
// 12: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: getstatic su/catlean/gg.O I
// 1c: aload 5
// 1e: ifnonnull 48
// 21: bipush -1
// 22: if_icmpeq 47
// 25: goto 32
// 28: ldc2_w -5851870124964831548
// 2b: lload 1
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: aload 0
// 33: getstatic su/catlean/gg.O I
// 36: lload 3
// 37: invokevirtual su/catlean/gg.f (IJ)V
// 3a: goto 47
// 3d: ldc2_w -5851870124964831548
// 40: lload 1
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: bipush -1
// 48: putstatic su/catlean/gg.O I
// 4b: return
}

public final void B(long a, int slot) {
ax = a ^ ax;
long var4 = ax ^ 74072632994408L;
long var6 = ax ^ 8057318228291L;
this.o(var6);
this.f(slot, var4);
}

@NotNull
public final fg X(long a, @NotNull n5 searcher, @NotNull f9 mode) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 106633124093255
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 28513782028597
// 12: lxor
// 13: dup2
// 14: bipush 48
// 16: lushr
// 17: l2i
// 18: istore 7
// 1a: dup2
// 1b: bipush 16
// 1d: lshl
// 1e: bipush 48
// 20: lushr
// 21: l2i
// 22: istore 8
// 24: dup2
// 25: bipush 32
// 27: lshl
// 28: bipush 32
// 2a: lushr
// 2b: l2i
// 2c: istore 9
// 2e: pop2
// 2f: pop2
// 30: ldc2_w 6707705711169744110
// 33: lload 1
// 34: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: aload 3
// 3a: sipush 10459
// 3d: ldc2_w 3511925143752652156
// 40: lload 1
// 41: lxor
// 42: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 4a: astore 10
// 4c: aload 4
// 4e: sipush 18472
// 51: ldc2_w 7687240552458442129
// 54: lload 1
// 55: lxor
// 56: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 5e: aload 4
// 60: getstatic su/catlean/w3.E [I
// 63: swap
// 64: invokevirtual su/catlean/f9.ordinal ()I
// 67: iaload
// 68: tableswitch 142 1 6 40 40 60 60 76 76
// 90: aload 0
// 91: lload 5
// 93: aload 3
// 94: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 97: goto fe
// 9a: ldc2_w 6712877262716398885
// 9d: lload 1
// 9e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: athrow
// a4: aload 0
// a5: iload 7
// a7: i2s
// a8: aload 3
// a9: iload 8
// ab: i2s
// ac: iload 9
// ae: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// b1: goto fe
// b4: aload 0
// b5: lload 5
// b7: aload 3
// b8: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// bb: astore 11
// bd: aload 11
// bf: aload 10
// c1: ifnonnull f3
// c4: invokevirtual su/catlean/fg.R ()Z
// c7: ifeq e6
// ca: goto d7
// cd: ldc2_w 6712877262716398885
// d0: lload 1
// d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d6: athrow
// d7: aload 11
// d9: goto fe
// dc: ldc2_w 6712877262716398885
// df: lload 1
// e0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e5: athrow
// e6: aload 0
// e7: iload 7
// e9: i2s
// ea: aload 3
// eb: iload 8
// ed: i2s
// ee: iload 9
// f0: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// f3: goto fe
// f6: new kotlin/NoWhenBranchMatchedException
// f9: dup
// fa: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// fd: athrow
// fe: areturn
}

public final boolean m(@NotNull n5 searcher, @NotNull f9 mode, long a, @NotNull Function0 action) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 57343328581073
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 84880836276643
// 012: lxor
// 013: dup2
// 014: bipush 48
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 16
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 9
// 024: dup2
// 025: bipush 32
// 027: lshl
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 10
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 102460885256256
// 033: lxor
// 034: lstore 11
// 036: pop2
// 037: ldc2_w 3855321052173354104
// 03a: lload 3
// 03b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: aload 1
// 041: sipush 10459
// 044: ldc2_w 3511833076359683562
// 047: lload 3
// 048: lxor
// 049: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 051: astore 13
// 053: aload 2
// 054: sipush 18472
// 057: ldc2_w 7687297470392581383
// 05a: lload 3
// 05b: lxor
// 05c: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 064: aload 5
// 066: sipush 19970
// 069: ldc2_w 1419974328244452154
// 06c: lload 3
// 06d: lxor
// 06e: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 076: aload 2
// 077: getstatic su/catlean/w3.E [I
// 07a: swap
// 07b: invokevirtual su/catlean/f9.ordinal ()I
// 07e: iaload
// 07f: tableswitch 165 1 4 29 29 94 94
// 09c: aload 0
// 09d: lload 6
// 09f: aload 1
// 0a0: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 0a3: astore 14
// 0a5: aload 14
// 0a7: invokevirtual su/catlean/fg.R ()Z
// 0aa: aload 13
// 0ac: ifnonnull 0dc
// 0af: ifne 0cb
// 0b2: goto 0bf
// 0b5: ldc2_w 3872737865356051891
// 0b8: lload 3
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: bipush 0
// 0c0: ireturn
// 0c1: ldc2_w 3872737865356051891
// 0c4: lload 3
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: aload 0
// 0cc: aload 14
// 0ce: invokevirtual su/catlean/fg.a ()I
// 0d1: lload 11
// 0d3: dup2_x1
// 0d4: pop2
// 0d5: aload 2
// 0d6: aload 5
// 0d8: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 0db: bipush 1
// 0dc: ireturn
// 0dd: aload 0
// 0de: iload 8
// 0e0: i2s
// 0e1: aload 1
// 0e2: iload 9
// 0e4: i2s
// 0e5: iload 10
// 0e7: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// 0ea: astore 14
// 0ec: aload 14
// 0ee: invokevirtual su/catlean/fg.R ()Z
// 0f1: aload 13
// 0f3: ifnonnull 123
// 0f6: ifne 112
// 0f9: goto 106
// 0fc: ldc2_w 3872737865356051891
// 0ff: lload 3
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w 3872737865356051891
// 10b: lload 3
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 0
// 113: aload 14
// 115: invokevirtual su/catlean/fg.a ()I
// 118: lload 11
// 11a: dup2_x1
// 11b: pop2
// 11c: aload 2
// 11d: aload 5
// 11f: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 122: bipush 1
// 123: ireturn
// 124: aload 0
// 125: lload 6
// 127: aload 1
// 128: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 12b: astore 14
// 12d: aload 14
// 12f: aload 13
// 131: ifnonnull 170
// 134: invokevirtual su/catlean/fg.R ()Z
// 137: ifeq 163
// 13a: goto 147
// 13d: ldc2_w 3872737865356051891
// 140: lload 3
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: aload 0
// 148: aload 14
// 14a: invokevirtual su/catlean/fg.a ()I
// 14d: lload 11
// 14f: dup2_x1
// 150: pop2
// 151: aload 2
// 152: aload 5
// 154: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 157: bipush 1
// 158: ireturn
// 159: ldc2_w 3872737865356051891
// 15c: lload 3
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: aload 0
// 164: iload 8
// 166: i2s
// 167: aload 1
// 168: iload 9
// 16a: i2s
// 16b: iload 10
// 16d: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// 170: astore 15
// 172: aload 15
// 174: invokevirtual su/catlean/fg.R ()Z
// 177: aload 13
// 179: ifnonnull 1a9
// 17c: ifne 198
// 17f: goto 18c
// 182: ldc2_w 3872737865356051891
// 185: lload 3
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: bipush 0
// 18d: ireturn
// 18e: ldc2_w 3872737865356051891
// 191: lload 3
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: aload 0
// 199: aload 15
// 19b: invokevirtual su/catlean/fg.a ()I
// 19e: lload 11
// 1a0: dup2_x1
// 1a1: pop2
// 1a2: aload 2
// 1a3: aload 5
// 1a5: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 1a8: bipush 1
// 1a9: ireturn
}

public final boolean S(@NotNull class_1792 item, @NotNull f9 mode, long a, @NotNull Function0 action) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 57281410826701
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 8855281541694
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 9
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 10
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 30546807178305
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 16
// 041: lushr
// 042: lstore 12
// 044: pop2
// 045: pop2
// 046: ldc2_w 8938997900435688949
// 049: lload 3
// 04a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: aload 1
// 050: sipush 15110
// 053: ldc2_w 6348856911043757984
// 056: lload 3
// 057: lxor
// 058: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 060: astore 14
// 062: aload 2
// 063: sipush 18472
// 066: ldc2_w 7687272349892899978
// 069: lload 3
// 06a: lxor
// 06b: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 073: aload 5
// 075: sipush 19970
// 078: ldc2_w 1419946733993030327
// 07b: lload 3
// 07c: lxor
// 07d: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 085: aload 2
// 086: getstatic su/catlean/w3.E [I
// 089: swap
// 08a: invokevirtual su/catlean/f9.ordinal ()I
// 08d: iaload
// 08e: tableswitch 192 1 4 30 30 112 112
// 0ac: aload 0
// 0ad: bipush 1
// 0ae: anewarray 396
// 0b1: astore 16
// 0b3: aload 16
// 0b5: bipush 0
// 0b6: aload 1
// 0b7: aastore
// 0b8: iload 8
// 0ba: aload 16
// 0bc: iload 9
// 0be: iload 10
// 0c0: i2c
// 0c1: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0c4: astore 15
// 0c6: aload 15
// 0c8: invokevirtual su/catlean/fg.R ()Z
// 0cb: aload 14
// 0cd: ifnonnull 0fd
// 0d0: ifne 0ec
// 0d3: goto 0e0
// 0d6: ldc2_w 8949729676881742910
// 0d9: lload 3
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: bipush 0
// 0e1: ireturn
// 0e2: ldc2_w 8949729676881742910
// 0e5: lload 3
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 0
// 0ed: aload 15
// 0ef: invokevirtual su/catlean/fg.a ()I
// 0f2: lload 6
// 0f4: dup2_x1
// 0f5: pop2
// 0f6: aload 2
// 0f7: aload 5
// 0f9: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 0fc: bipush 1
// 0fd: ireturn
// 0fe: aload 0
// 0ff: bipush 1
// 100: anewarray 396
// 103: astore 16
// 105: aload 16
// 107: bipush 0
// 108: aload 1
// 109: aastore
// 10a: aload 16
// 10c: iload 11
// 10e: i2c
// 10f: lload 12
// 111: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 114: astore 15
// 116: aload 15
// 118: invokevirtual su/catlean/fg.R ()Z
// 11b: aload 14
// 11d: ifnonnull 14d
// 120: ifne 13c
// 123: goto 130
// 126: ldc2_w 8949729676881742910
// 129: lload 3
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: bipush 0
// 131: ireturn
// 132: ldc2_w 8949729676881742910
// 135: lload 3
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 0
// 13d: aload 15
// 13f: invokevirtual su/catlean/fg.a ()I
// 142: lload 6
// 144: dup2_x1
// 145: pop2
// 146: aload 2
// 147: aload 5
// 149: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 14c: bipush 1
// 14d: ireturn
// 14e: aload 0
// 14f: bipush 1
// 150: anewarray 396
// 153: astore 16
// 155: aload 16
// 157: bipush 0
// 158: aload 1
// 159: aastore
// 15a: iload 8
// 15c: aload 16
// 15e: iload 9
// 160: iload 10
// 162: i2c
// 163: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 166: astore 15
// 168: aload 15
// 16a: invokevirtual su/catlean/fg.R ()Z
// 16d: aload 14
// 16f: ifnonnull 1a0
// 172: ifeq 1a1
// 175: goto 182
// 178: ldc2_w 8949729676881742910
// 17b: lload 3
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: aload 0
// 183: aload 15
// 185: invokevirtual su/catlean/fg.a ()I
// 188: lload 6
// 18a: dup2_x1
// 18b: pop2
// 18c: aload 2
// 18d: aload 5
// 18f: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 192: bipush 1
// 193: goto 1a0
// 196: ldc2_w 8949729676881742910
// 199: lload 3
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: ireturn
// 1a1: aload 0
// 1a2: bipush 1
// 1a3: anewarray 396
// 1a6: astore 17
// 1a8: aload 17
// 1aa: bipush 0
// 1ab: aload 1
// 1ac: aastore
// 1ad: aload 17
// 1af: iload 11
// 1b1: i2c
// 1b2: lload 12
// 1b4: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 1b7: astore 16
// 1b9: aload 16
// 1bb: invokevirtual su/catlean/fg.R ()Z
// 1be: aload 14
// 1c0: ifnonnull 1f0
// 1c3: ifne 1df
// 1c6: goto 1d3
// 1c9: ldc2_w 8949729676881742910
// 1cc: lload 3
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: bipush 0
// 1d4: ireturn
// 1d5: ldc2_w 8949729676881742910
// 1d8: lload 3
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: aload 0
// 1e0: aload 16
// 1e2: invokevirtual su/catlean/fg.a ()I
// 1e5: lload 6
// 1e7: dup2_x1
// 1e8: pop2
// 1e9: aload 2
// 1ea: aload 5
// 1ec: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 1ef: bipush 1
// 1f0: ireturn
}

public final void T(long a, int slot, @NotNull f9 mode, @NotNull Function0 action) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 129134661438121
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 7075931221548
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 32
// 020: lushr
// 021: lstore 9
// 023: pop2
// 024: dup2
// 025: ldc2_w 119972832522437
// 028: lxor
// 029: lstore 11
// 02b: dup2
// 02c: ldc2_w 30726986276643
// 02f: lxor
// 030: lstore 13
// 032: pop2
// 033: ldc2_w -3673272363616879363
// 036: lload 1
// 037: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: aload 4
// 03e: sipush 4919
// 041: ldc2_w 1045273983447309960
// 044: lload 1
// 045: lxor
// 046: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04e: astore 18
// 050: aload 5
// 052: sipush 16279
// 055: ldc2_w 4987541179448537656
// 058: lload 1
// 059: lxor
// 05a: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 062: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 065: bipush 1
// 066: invokevirtual su/catlean/_n.m (Z)V
// 069: aload 4
// 06b: getstatic su/catlean/w3.E [I
// 06e: swap
// 06f: invokevirtual su/catlean/f9.ordinal ()I
// 072: iaload
// 073: aload 18
// 075: ifnonnull 0da
// 078: tableswitch 629 1 6 50 141 271 347 548 467
// 0a0: ldc2_w -3658177729188365002
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: lload 1
// 0ab: lconst_0
// 0ac: lcmp
// 0ad: iflt 0fa
// 0b0: lload 13
// 0b2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b5: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0b8: aload 18
// 0ba: ifnonnull 0f9
// 0bd: goto 0ca
// 0c0: ldc2_w -3658177729188365002
// 0c3: lload 1
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 0cd: goto 0da
// 0d0: ldc2_w -3658177729188365002
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: iload 3
// 0db: if_icmpeq 0f2
// 0de: aload 0
// 0df: iload 3
// 0e0: lload 6
// 0e2: invokevirtual su/catlean/gg.f (IJ)V
// 0e5: goto 0f2
// 0e8: ldc2_w -3658177729188365002
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: aload 5
// 0f4: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 0f9: pop
// 0fa: lload 1
// 0fb: lconst_0
// 0fc: lcmp
// 0fd: iflt 306
// 100: aload 18
// 102: ifnull 2ff
// 105: lload 13
// 107: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 10d: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 110: istore 19
// 112: getstatic su/catlean/gg.B I
// 115: iload 3
// 116: lload 1
// 117: lconst_0
// 118: lcmp
// 119: ifle 164
// 11c: aload 18
// 11e: ifnonnull 164
// 121: if_icmpeq 145
// 124: goto 131
// 127: ldc2_w -3658177729188365002
// 12a: lload 1
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: aload 0
// 132: iload 3
// 133: lload 6
// 135: invokevirtual su/catlean/gg.f (IJ)V
// 138: goto 145
// 13b: ldc2_w -3658177729188365002
// 13e: lload 1
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: aload 5
// 147: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 14c: pop
// 14d: aload 18
// 14f: ifnonnull 306
// 152: getstatic su/catlean/gg.B I
// 155: iload 19
// 157: goto 164
// 15a: ldc2_w -3658177729188365002
// 15d: lload 1
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: if_icmpeq 2ff
// 167: aload 0
// 168: iload 19
// 16a: lload 6
// 16c: invokevirtual su/catlean/gg.f (IJ)V
// 16f: lload 1
// 170: lconst_0
// 171: lcmp
// 172: ifle 306
// 175: aload 18
// 177: ifnull 2ff
// 17a: goto 187
// 17d: ldc2_w -3658177729188365002
// 180: lload 1
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: iload 8
// 189: lload 9
// 18b: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 18e: lload 13
// 190: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 193: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 196: getfield net/minecraft/class_1703.field_7763 I
// 199: iload 3
// 19a: lload 13
// 19c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1a2: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1a5: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 1a8: lload 13
// 1aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ad: checkcast net/minecraft/class_1657
// 1b0: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 1b3: aload 5
// 1b5: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 1ba: pop
// 1bb: lload 1
// 1bc: lconst_0
// 1bd: lcmp
// 1be: ifle 306
// 1c1: aload 18
// 1c3: ifnull 2ff
// 1c6: goto 1d3
// 1c9: ldc2_w -3658177729188365002
// 1cc: lload 1
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: iload 8
// 1d5: lload 9
// 1d7: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 1da: lload 13
// 1dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1df: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 1e2: getfield net/minecraft/class_1703.field_7763 I
// 1e5: iload 3
// 1e6: lload 13
// 1e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1eb: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1ee: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1f1: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 1f4: lload 13
// 1f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f9: checkcast net/minecraft/class_1657
// 1fc: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 1ff: aload 5
// 201: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 206: pop
// 207: iload 8
// 209: lload 9
// 20b: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 20e: lload 13
// 210: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 213: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 216: getfield net/minecraft/class_1703.field_7763 I
// 219: iload 3
// 21a: lload 13
// 21c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 222: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 225: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 228: lload 13
// 22a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22d: checkcast net/minecraft/class_1657
// 230: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 233: lload 1
// 234: lconst_0
// 235: lcmp
// 236: ifle 306
// 239: aload 18
// 23b: ifnull 2ff
// 23e: goto 24b
// 241: ldc2_w -3658177729188365002
// 244: lload 1
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: aload 0
// 24c: iload 3
// 24d: iload 3
// 24e: sipush 18201
// 251: ldc2_w 4867183260514519816
// 254: lload 1
// 255: lxor
// 256: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: if_icmplt 27b
// 25e: goto 26b
// 261: ldc2_w -3658177729188365002
// 264: lload 1
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: getstatic su/catlean/f9.INVENTORY_SILENT Lsu/catlean/f9;
// 26e: goto 27e
// 271: ldc2_w -3658177729188365002
// 274: lload 1
// 275: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: athrow
// 27b: getstatic su/catlean/f9.SILENT Lsu/catlean/f9;
// 27e: aload 5
// 280: astore 15
// 282: astore 16
// 284: istore 17
// 286: lload 11
// 288: iload 17
// 28a: aload 16
// 28c: aload 15
// 28e: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 291: lload 1
// 292: lconst_0
// 293: lcmp
// 294: iflt 306
// 297: aload 18
// 299: ifnull 2ff
// 29c: aload 0
// 29d: iload 3
// 29e: iload 3
// 29f: sipush 8828
// 2a2: ldc2_w 7804480526556687979
// 2a5: lload 1
// 2a6: lxor
// 2a7: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: if_icmplt 2cc
// 2af: goto 2bc
// 2b2: ldc2_w -3658177729188365002
// 2b5: lload 1
// 2b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bb: athrow
// 2bc: getstatic su/catlean/f9.INVENTORY_NORMAL Lsu/catlean/f9;
// 2bf: goto 2cf
// 2c2: ldc2_w -3658177729188365002
// 2c5: lload 1
// 2c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cb: athrow
// 2cc: getstatic su/catlean/f9.NORMAL Lsu/catlean/f9;
// 2cf: aload 5
// 2d1: astore 15
// 2d3: astore 16
// 2d5: istore 17
// 2d7: lload 11
// 2d9: iload 17
// 2db: aload 16
// 2dd: aload 15
// 2df: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 2e2: lload 1
// 2e3: lconst_0
// 2e4: lcmp
// 2e5: iflt 306
// 2e8: aload 18
// 2ea: ifnull 2ff
// 2ed: new kotlin/NoWhenBranchMatchedException
// 2f0: dup
// 2f1: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 2f4: athrow
// 2f5: ldc2_w -3658177729188365002
// 2f8: lload 1
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 302: bipush 0
// 303: invokevirtual su/catlean/_n.m (Z)V
// 306: return
}

public final void X(long a, int slot) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 125646397432213
// 0b: lxor
// 0c: dup2
// 0d: bipush 32
// 0f: lushr
// 10: l2i
// 11: istore 4
// 13: dup2
// 14: bipush 32
// 16: lshl
// 17: bipush 32
// 19: lushr
// 1a: lstore 5
// 1c: pop2
// 1d: dup2
// 1e: ldc2_w 122986483224730
// 21: lxor
// 22: lstore 7
// 24: pop2
// 25: ldc2_w -4414479715626896572
// 28: lload 1
// 29: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: astore 9
// 30: iload 4
// 32: lload 5
// 34: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 37: lload 7
// 39: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 3f: getfield net/minecraft/class_1703.field_7763 I
// 42: iload 3
// 43: sipush 8828
// 46: ldc2_w 7804563990278988242
// 49: lload 1
// 4a: lxor
// 4b: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: aload 9
// 52: ifnonnull 80
// 55: if_icmpge 84
// 58: goto 65
// 5b: ldc2_w -4430699164845444465
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: iload 3
// 66: sipush 340
// 69: ldc2_w 779923448058102515
// 6c: lload 1
// 6d: lxor
// 6e: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: goto 80
// 76: ldc2_w -4430699164845444465
// 79: lload 1
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: iadd
// 81: goto 85
// 84: iload 3
// 85: lload 7
// 87: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 8d: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 90: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 93: lload 7
// 95: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 98: checkcast net/minecraft/class_1657
// 9b: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 9e: return
}

public final void f(int slot, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 38725524597609
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 99117888969352
// 12: lxor
// 13: lstore 6
// 15: dup2
// 16: ldc2_w 3976948163919
// 19: lxor
// 1a: lstore 8
// 1c: pop2
// 1d: ldc2_w -618697045811394927
// 20: lload 2
// 21: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: astore 10
// 28: bipush 0
// 29: iload 1
// 2a: aload 10
// 2c: ifnonnull 6c
// 2f: if_icmpgt 81
// 32: goto 3f
// 35: ldc2_w -623868586587044006
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: iload 1
// 40: aload 10
// 42: ifnonnull 7e
// 45: goto 52
// 48: ldc2_w -623868586587044006
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: sipush 8828
// 55: ldc2_w 7804471933811184647
// 58: lload 2
// 59: lxor
// 5a: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: goto 6c
// 62: ldc2_w -623868586587044006
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: if_icmpge 7d
// 6f: bipush 1
// 70: goto 82
// 73: ldc2_w -623868586587044006
// 76: lload 2
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 0
// 7e: goto 82
// 81: bipush 0
// 82: ifeq fb
// 85: lload 8
// 87: lload 2
// 88: lconst_0
// 89: lcmp
// 8a: ifle d4
// 8d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 90: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 93: aload 10
// 95: ifnonnull ce
// 98: goto a5
// 9b: ldc2_w -623868586587044006
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: invokevirtual net/minecraft/class_1661.method_67532 ()I
// a8: iload 1
// a9: if_icmpeq fb
// ac: goto b9
// af: ldc2_w -623868586587044006
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: lload 8
// bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// be: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// c1: goto ce
// c4: ldc2_w -623868586587044006
// c7: lload 2
// c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cd: athrow
// ce: iload 1
// cf: invokevirtual net/minecraft/class_1661.method_61496 (I)V
// d2: lload 4
// d4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// d7: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
// da: dup
// db: sipush 23809
// de: ldc2_w 4120689038565763804
// e1: lload 2
// e2: lxor
// e3: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// eb: checkcast su/catlean/mixins/accessors/InteractionManagerAccessor
// ee: iload 1
// ef: invokeinterface su/catlean/mixins/accessors/InteractionManagerAccessor.setCarriedIndex (I)V 2
// f4: aload 0
// f5: iload 1
// f6: lload 6
// f8: invokevirtual su/catlean/gg.P (IJ)V
// fb: return
}

public final void P(int slot, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 21992541749540
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: getstatic su/catlean/gg.B I
// 12: iload 1
// 13: if_icmpeq 4b
// 16: lload 4
// 18: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 1e: dup
// 1f: ifnull 4a
// 22: goto 2f
// 25: ldc2_w 6708857026232249623
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: new net/minecraft/class_2868
// 32: dup
// 33: iload 1
// 34: invokespecial net/minecraft/class_2868.<init> (I)V
// 37: checkcast net/minecraft/class_2596
// 3a: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
// 3d: goto 4b
// 40: ldc2_w 6708857026232249623
// 43: lload 2
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: pop
// 4b: return
}

public final int O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 109567276159600
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 139668799176364
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w -1402151334640607886
// 018: lload 1
// 019: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: lload 5
// 020: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 023: lload 3
// 024: dup2_x1
// 025: pop2
// 026: invokestatic su/catlean/s_.z (JLnet/minecraft/class_746;)Ljava/util/List;
// 029: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 02e: astore 8
// 030: astore 7
// 032: aload 8
// 034: invokeinterface java/util/Iterator.hasNext ()Z 1
// 039: ifeq 089
// 03c: aload 8
// 03e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 043: checkcast net/minecraft/class_1799
// 046: astore 9
// 048: aload 9
// 04a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 04d: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 050: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 053: aload 7
// 055: ifnonnull 060
// 058: ifeq 032
// 05b: aload 9
// 05d: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 060: sipush 24612
// 063: ldc2_w 2294643349221903800
// 066: lload 1
// 067: lxor
// 068: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: if_icmpge 032
// 070: sipush 7598
// 073: ldc2_w 769049020376346686
// 076: lload 1
// 077: lxor
// 078: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: aload 7
// 07f: lload 1
// 080: lconst_0
// 081: lcmp
// 082: iflt 055
// 085: ifnonnull 053
// 088: ireturn
// 089: bipush -1
// 08a: istore 8
// 08c: bipush 0
// 08d: istore 9
// 08f: iload 9
// 091: sipush 7308
// 094: ldc2_w 4742946202712699167
// 097: lload 1
// 098: lxor
// 099: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: if_icmpge 16a
// 0a1: lload 5
// 0a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a6: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0a9: iload 9
// 0ab: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0ae: dup
// 0af: sipush 21254
// 0b2: ldc2_w 6247878512697245490
// 0b5: lload 1
// 0b6: lxor
// 0b7: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: astore 10
// 0c1: aload 7
// 0c3: lload 1
// 0c4: lconst_0
// 0c5: lcmp
// 0c6: ifle 167
// 0c9: ifnonnull 165
// 0cc: aload 10
// 0ce: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0d1: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d7: aload 7
// 0d9: lload 1
// 0da: lconst_0
// 0db: lcmp
// 0dc: iflt 174
// 0df: ifnonnull 172
// 0e2: goto 0ef
// 0e5: ldc2_w -1390224384625976135
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: ifeq 155
// 0f2: goto 0ff
// 0f5: ldc2_w -1390224384625976135
// 0f8: lload 1
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: lload 1
// 100: lconst_0
// 101: lcmp
// 102: ifle 14a
// 105: aload 10
// 107: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 10a: aload 7
// 10c: ifnonnull 148
// 10f: goto 11c
// 112: ldc2_w -1390224384625976135
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: sipush 19186
// 11f: ldc2_w 4382195495356868459
// 122: lload 1
// 123: lxor
// 124: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: if_icmpge 155
// 12c: goto 139
// 12f: ldc2_w -1390224384625976135
// 132: lload 1
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: iload 9
// 13b: goto 148
// 13e: ldc2_w -1390224384625976135
// 141: lload 1
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: istore 8
// 14a: lload 1
// 14b: lconst_0
// 14c: lcmp
// 14d: ifle 158
// 150: aload 7
// 152: ifnull 16a
// 155: iinc 9 1
// 158: goto 165
// 15b: ldc2_w -1390224384625976135
// 15e: lload 1
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: aload 7
// 167: ifnull 08f
// 16a: lload 1
// 16b: lconst_0
// 16c: lcmp
// 16d: iflt 1c9
// 170: iload 8
// 172: aload 7
// 174: ifnonnull 1cb
// 177: sipush 8828
// 17a: ldc2_w 7804581222099603428
// 17d: lload 1
// 17e: lxor
// 17f: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: if_icmpge 1c9
// 187: goto 194
// 18a: ldc2_w -1390224384625976135
// 18d: lload 1
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: iload 8
// 196: aload 7
// 198: ifnonnull 1cb
// 19b: goto 1a8
// 19e: ldc2_w -1390224384625976135
// 1a1: lload 1
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: bipush -1
// 1a9: if_icmpeq 1c9
// 1ac: goto 1b9
// 1af: ldc2_w -1390224384625976135
// 1b2: lload 1
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: iinc 8 36
// 1bc: goto 1c9
// 1bf: ldc2_w -1390224384625976135
// 1c2: lload 1
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: iload 8
// 1cb: ireturn
}

@NotNull
public final fg R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 118234184269438
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 57744263660199
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 82089016081959
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 80513676513023
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 82656699854936
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w 7097315535888225158
// 02d: lload 1
// 02e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: astore 13
// 035: lload 3
// 036: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 039: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 03c: ifnonnull 050
// 03f: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 042: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 045: areturn
// 046: ldc2_w 7079898735552680525
// 049: lload 1
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: bipush -1
// 051: istore 14
// 053: fconst_1
// 054: fstore 15
// 056: bipush 0
// 057: istore 16
// 059: iload 16
// 05b: sipush 8828
// 05e: ldc2_w 7804533023608455440
// 061: lload 1
// 062: lxor
// 063: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: if_icmpge 181
// 06b: aload 13
// 06d: ifnonnull 19e
// 070: lload 3
// 071: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 074: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 077: dup
// 078: ifnull 0ae
// 07b: goto 088
// 07e: ldc2_w 7079898735552680525
// 081: lload 1
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 08b: dup
// 08c: ifnull 0ae
// 08f: goto 09c
// 092: ldc2_w 7079898735552680525
// 095: lload 1
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: iload 16
// 09e: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0a1: goto 0b0
// 0a4: ldc2_w 7079898735552680525
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: pop
// 0af: aconst_null
// 0b0: astore 17
// 0b2: aload 13
// 0b4: ifnonnull 17c
// 0b7: aload 17
// 0b9: ifnull 179
// 0bc: goto 0c9
// 0bf: ldc2_w 7079898735552680525
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 17
// 0cb: lload 7
// 0cd: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 0d0: aload 13
// 0d2: ifnonnull 119
// 0d5: goto 0e2
// 0d8: ldc2_w 7079898735552680525
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: ifeq 179
// 0e5: goto 0f2
// 0e8: ldc2_w 7079898735552680525
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: aload 17
// 0f4: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0f7: invokevirtual net/minecraft/class_1792.method_57347 ()Lnet/minecraft/class_9323;
// 0fa: getstatic net/minecraft/class_9334.field_50072 Lnet/minecraft/class_9331;
// 0fd: invokeinterface net/minecraft/class_9323.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object; 2
// 102: dup
// 103: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 106: checkcast java/lang/Number
// 109: invokevirtual java/lang/Number.intValue ()I
// 10c: goto 119
// 10f: ldc2_w 7079898735552680525
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: i2f
// 11a: fstore 18
// 11c: fload 18
// 11e: lload 9
// 120: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 123: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 126: getstatic net/minecraft/class_1893.field_9118 Lnet/minecraft/class_5321;
// 129: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 12c: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 131: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 134: checkcast net/minecraft/class_2378
// 137: getstatic net/minecraft/class_1893.field_9118 Lnet/minecraft/class_5321;
// 13a: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 13d: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 142: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 145: checkcast net/minecraft/class_6880
// 148: aload 17
// 14a: invokestatic net/minecraft/class_1890.method_8225 (Lnet/minecraft/class_6880;Lnet/minecraft/class_1799;)I
// 14d: i2f
// 14e: fadd
// 14f: fstore 18
// 151: aload 13
// 153: lload 1
// 154: lconst_0
// 155: lcmp
// 156: ifle 17e
// 159: ifnonnull 17c
// 15c: fload 18
// 15e: fload 15
// 160: fcmpl
// 161: ifle 179
// 164: goto 171
// 167: ldc2_w 7079898735552680525
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: fload 18
// 173: fstore 15
// 175: iload 16
// 177: istore 14
// 179: iinc 16 1
// 17c: aload 13
// 17e: ifnull 059
// 181: lload 1
// 182: lconst_0
// 183: lcmp
// 184: ifle 06b
// 187: iload 14
// 189: bipush -1
// 18a: if_icmpne 19e
// 18d: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 190: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 193: areturn
// 194: ldc2_w 7079898735552680525
// 197: lload 1
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: new su/catlean/fg
// 1a1: dup
// 1a2: lload 5
// 1a4: iload 14
// 1a6: bipush 1
// 1a7: lload 11
// 1a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ac: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1af: iload 14
// 1b1: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1b4: dup
// 1b5: sipush 21254
// 1b8: ldc2_w 6247856411432186310
// 1bb: lload 1
// 1bc: lxor
// 1bd: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c5: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// 1c8: areturn
}

@NotNull
public final fg b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 24860215997808
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 45911136463137
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 73282139301807
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 80883101501865
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 61282279421225
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w 2986106407450892424
// 02d: lload 1
// 02e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: astore 13
// 035: lload 3
// 036: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 039: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 03c: aload 13
// 03e: ifnonnull 06d
// 041: ifnonnull 062
// 044: goto 051
// 047: ldc2_w 2976500533960939843
// 04a: lload 1
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 054: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 057: areturn
// 058: ldc2_w 2976500533960939843
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: lload 3
// 063: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 069: dup
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06d: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 070: dup
// 071: sipush 4381
// 074: ldc2_w 9171108697699055838
// 077: lload 1
// 078: lxor
// 079: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 081: astore 14
// 083: aload 14
// 085: lload 11
// 087: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 08a: aload 13
// 08c: lload 1
// 08d: lconst_0
// 08e: lcmp
// 08f: iflt 0bb
// 092: ifnonnull 0b9
// 095: ifne 11c
// 098: goto 0a5
// 09b: ldc2_w 2976500533960939843
// 09e: lload 1
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: aload 14
// 0a7: lload 7
// 0a9: invokestatic su/catlean/xa.K (Lnet/minecraft/class_1799;J)Z
// 0ac: goto 0b9
// 0af: ldc2_w 2976500533960939843
// 0b2: lload 1
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: aload 13
// 0bb: lload 1
// 0bc: lconst_0
// 0bd: lcmp
// 0be: iflt 0f1
// 0c1: ifnonnull 0e9
// 0c4: ifne 11c
// 0c7: goto 0d4
// 0ca: ldc2_w 2976500533960939843
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 14
// 0d6: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0d9: instanceof net/minecraft/class_1743
// 0dc: goto 0e9
// 0df: ldc2_w 2976500533960939843
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: lload 1
// 0ea: lconst_0
// 0eb: lcmp
// 0ec: iflt 119
// 0ef: aload 13
// 0f1: ifnonnull 119
// 0f4: ifne 11c
// 0f7: goto 104
// 0fa: ldc2_w 2976500533960939843
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 14
// 106: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 109: instanceof net/minecraft/class_1821
// 10c: goto 119
// 10f: ldc2_w 2976500533960939843
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: ifeq 163
// 11c: new su/catlean/fg
// 11f: dup
// 120: lload 3
// 121: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 124: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 127: dup
// 128: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 12b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 12e: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 131: lload 9
// 133: dup2_x1
// 134: pop2
// 135: bipush 1
// 136: lload 3
// 137: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 13a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 13d: dup
// 13e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 141: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 144: dup
// 145: sipush 29321
// 148: ldc2_w 6780253255957060431
// 14b: lload 1
// 14c: lxor
// 14d: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 155: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// 158: areturn
// 159: ldc2_w 2976500533960939843
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: aload 0
// 164: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/gg.g (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 169: lload 5
// 16b: dup2_x1
// 16c: pop2
// 16d: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 170: areturn
}

@NotNull
public final fg g(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 2131743534812
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 104438522941957
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 38769903001181
// 018: lxor
// 019: lstore 7
// 01b: pop2
// 01c: ldc2_w 3665033550981743396
// 01f: lload 1
// 020: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 025: astore 9
// 027: lload 3
// 028: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 02e: ifnonnull 042
// 031: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 034: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 037: areturn
// 038: ldc2_w 3666686677801730799
// 03b: lload 1
// 03c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: athrow
// 042: bipush -1
// 043: istore 10
// 045: fconst_1
// 046: fstore 11
// 048: bipush 0
// 049: istore 12
// 04b: iload 12
// 04d: sipush 8828
// 050: ldc2_w 7804508457547174322
// 053: lload 1
// 054: lxor
// 055: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: if_icmpge 19b
// 05d: aload 9
// 05f: ifnonnull 1b8
// 062: lload 3
// 063: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 069: dup
// 06a: ifnull 0a0
// 06d: goto 07a
// 070: ldc2_w 3666686677801730799
// 073: lload 1
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 07d: dup
// 07e: ifnull 0a0
// 081: goto 08e
// 084: ldc2_w 3666686677801730799
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: iload 12
// 090: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 093: goto 0a2
// 096: ldc2_w 3666686677801730799
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: pop
// 0a1: aconst_null
// 0a2: astore 13
// 0a4: aload 9
// 0a6: ifnonnull 196
// 0a9: aload 13
// 0ab: ifnull 193
// 0ae: goto 0bb
// 0b1: ldc2_w 3666686677801730799
// 0b4: lload 1
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 13
// 0bd: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0c0: aload 9
// 0c2: ifnonnull 108
// 0c5: goto 0d2
// 0c8: ldc2_w 3666686677801730799
// 0cb: lload 1
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: instanceof net/minecraft/class_1743
// 0d5: ifeq 193
// 0d8: goto 0e5
// 0db: ldc2_w 3666686677801730799
// 0de: lload 1
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 13
// 0e7: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0ea: dup
// 0eb: sipush 14850
// 0ee: ldc2_w 5667470890411411575
// 0f1: lload 1
// 0f2: lxor
// 0f3: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0fb: goto 108
// 0fe: ldc2_w 3666686677801730799
// 101: lload 1
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: checkcast net/minecraft/class_1743
// 10b: astore 14
// 10d: aload 9
// 10f: lload 1
// 110: lconst_0
// 111: lcmp
// 112: iflt 125
// 115: ifnonnull 14a
// 118: aload 14
// 11a: invokevirtual net/minecraft/class_1743.method_57347 ()Lnet/minecraft/class_9323;
// 11d: getstatic net/minecraft/class_9334.field_50072 Lnet/minecraft/class_9331;
// 120: invokeinterface net/minecraft/class_9323.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object; 2
// 125: checkcast java/lang/Integer
// 128: dup
// 129: ifnull 149
// 12c: goto 139
// 12f: ldc2_w 3666686677801730799
// 132: lload 1
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: invokevirtual java/lang/Integer.intValue ()I
// 13c: goto 14b
// 13f: ldc2_w 3666686677801730799
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: pop
// 14a: bipush 0
// 14b: i2f
// 14c: lload 7
// 14e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 151: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 154: getstatic net/minecraft/class_1893.field_9118 Lnet/minecraft/class_5321;
// 157: invokeinterface net/minecraft/class_5455.method_58561 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 15c: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 15f: checkcast net/minecraft/class_6880
// 162: aload 13
// 164: invokestatic net/minecraft/class_1890.method_8225 (Lnet/minecraft/class_6880;Lnet/minecraft/class_1799;)I
// 167: i2f
// 168: fadd
// 169: fstore 15
// 16b: aload 9
// 16d: lload 1
// 16e: lconst_0
// 16f: lcmp
// 170: ifle 198
// 173: ifnonnull 196
// 176: fload 15
// 178: fload 11
// 17a: fcmpl
// 17b: ifle 193
// 17e: goto 18b
// 181: ldc2_w 3666686677801730799
// 184: lload 1
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: fload 15
// 18d: fstore 11
// 18f: iload 12
// 191: istore 10
// 193: iinc 12 1
// 196: aload 9
// 198: ifnull 04b
// 19b: lload 1
// 19c: lconst_0
// 19d: lcmp
// 19e: ifle 05d
// 1a1: iload 10
// 1a3: bipush -1
// 1a4: if_icmpne 1b8
// 1a7: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 1aa: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 1ad: areturn
// 1ae: ldc2_w 3666686677801730799
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: new su/catlean/fg
// 1bb: dup
// 1bc: lload 5
// 1be: iload 10
// 1c0: bipush 1
// 1c1: lload 3
// 1c2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 1c8: dup
// 1c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1cc: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1cf: iload 10
// 1d1: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1d4: dup
// 1d5: sipush 21254
// 1d8: ldc2_w 6247814525455868260
// 1db: lload 1
// 1dc: lxor
// 1dd: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e5: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// 1e8: areturn
}

public final void r(int slot, long a, int factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gg.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 48851824828978
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 81964915599154
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 73376616170493
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 73592606816184
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: ldc2_w 2710800992679416934
// 027: lload 2
// 028: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: lload 11
// 02f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 032: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 035: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 038: istore 14
// 03a: astore 13
// 03c: iload 1
// 03d: aload 13
// 03f: ifnonnull 07c
// 042: bipush -1
// 043: if_icmpeq 135
// 046: goto 053
// 049: ldc2_w 2711399659897525677
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: aload 0
// 054: iload 1
// 055: lload 5
// 057: invokevirtual su/catlean/gg.f (IJ)V
// 05a: lload 11
// 05c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 062: iload 1
// 063: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 066: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 069: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
// 06c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06f: goto 07c
// 072: ldc2_w 2711399659897525677
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 13
// 07e: ifnonnull 092
// 081: ifeq 100
// 084: goto 091
// 087: ldc2_w 2711399659897525677
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: bipush 1
// 092: istore 15
// 094: aload 13
// 096: ifnonnull 12d
// 099: iload 15
// 09b: iload 4
// 09d: if_icmpgt 119
// 0a0: goto 0ad
// 0a3: ldc2_w 2711399659897525677
// 0a6: lload 2
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 0b0: fconst_0
// 0b1: lload 7
// 0b3: fconst_0
// 0b4: sipush 4014
// 0b7: ldc2_w 8866904330746243884
// 0ba: lload 2
// 0bb: lxor
// 0bc: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: aconst_null
// 0c2: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 0c5: pop
// 0c6: iload 15
// 0c8: iload 4
// 0ca: if_icmpeq 119
// 0cd: goto 0da
// 0d0: ldc2_w 2711399659897525677
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: iinc 15 1
// 0dd: aload 13
// 0df: lload 2
// 0e0: lconst_0
// 0e1: lcmp
// 0e2: ifle 0ea
// 0e5: ifnonnull 12d
// 0e8: aload 13
// 0ea: ifnull 0ad
// 0ed: lload 2
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: iflt 0dd
// 0f3: goto 100
// 0f6: ldc2_w 2711399659897525677
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 103: fconst_0
// 104: lload 7
// 106: fconst_0
// 107: sipush 4014
// 10a: ldc2_w 8866904330746243884
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: aconst_null
// 115: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 118: pop
// 119: new net/minecraft/class_2879
// 11c: dup
// 11d: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 120: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 123: checkcast net/minecraft/class_2596
// 126: lload 9
// 128: dup2_x1
// 129: pop2
// 12a: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 12d: aload 0
// 12e: iload 14
// 130: lload 5
// 132: invokevirtual su/catlean/gg.f (IJ)V
// 135: return
}

public static void N(long var0, gg var2, int var3, int var4, int var5, Object var6) {
var0 = a ^ var0;
long var7 = var0 ^ 112377361654670L;
_g[] var9 = vm.a<"Å">(8562952620942460717L, var0);

label21: {
int var10000;
label20: {
try {
var10000 = var5 & 2;
if (var9 != null) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, 8569180802060306150L, var0);
}

var10000 = 1;
}

var4 = var10000;
}

var2.r(var3, var7, var4);
}

public final void O(int slot, int a, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/gg.a J
// 1b: lxor
// 1c: lstore 5
// 1e: lload 5
// 20: dup2
// 21: ldc2_w 84606948733721
// 24: lxor
// 25: lstore 7
// 27: dup2
// 28: ldc2_w 26237162126369
// 2b: lxor
// 2c: lstore 9
// 2e: dup2
// 2f: ldc2_w 75611650791382
// 32: lxor
// 33: lstore 11
// 35: dup2
// 36: ldc2_w 75413109711763
// 39: lxor
// 3a: lstore 13
// 3c: pop2
// 3d: ldc2_w 8193654499917463629
// 40: lload 5
// 42: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 4a: bipush 1
// 4b: invokevirtual su/catlean/_n.m (Z)V
// 4e: astore 15
// 50: aload 15
// 52: ifnonnull f7
// 55: iload 1
// 56: bipush -1
// 57: if_icmpeq f0
// 5a: goto 68
// 5d: ldc2_w 8181868275546505606
// 60: lload 5
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: iload 1
// 69: lload 13
// 6b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 71: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 74: lload 9
// 76: dup2_x1
// 77: pop2
// 78: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 7b: bipush 0
// 7c: sipush 10147
// 7f: ldc2_w 6194611116646913806
// 82: lload 5
// 84: lxor
// 85: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: aconst_null
// 8b: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 8e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 91: fconst_0
// 92: lload 7
// 94: fconst_0
// 95: sipush 4509
// 98: ldc2_w 1078833670573089080
// 9b: lload 5
// 9d: lxor
// 9e: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: aconst_null
// a4: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// a7: pop
// a8: new net/minecraft/class_2879
// ab: dup
// ac: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// af: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// b2: checkcast net/minecraft/class_2596
// b5: lload 11
// b7: dup2_x1
// b8: pop2
// b9: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// bc: iload 1
// bd: lload 13
// bf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// c2: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// c5: invokevirtual net/minecraft/class_1661.method_67532 ()I
// c8: lload 9
// ca: dup2_x1
// cb: pop2
// cc: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// cf: bipush 0
// d0: sipush 10147
// d3: ldc2_w 6194611116646913806
// d6: lload 5
// d8: lxor
// d9: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// de: aconst_null
// df: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// e2: goto f0
// e5: ldc2_w 8181868275546505606
// e8: lload 5
// ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ef: athrow
// f0: getstatic su/catlean/_n.e Lsu/catlean/_n;
// f3: bipush 0
// f4: invokevirtual su/catlean/_n.m (Z)V
// f7: return
}

public final void x(long a, int from, int to) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 80057938857922
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 41739411569245
// 12: lxor
// 13: lstore 7
// 15: dup2
// 16: ldc2_w 65012174429782
// 19: lxor
// 1a: lstore 9
// 1c: dup2
// 1d: ldc2_w 114806501130724
// 20: lxor
// 21: lstore 11
// 23: pop2
// 24: ldc2_w 1423869375092810298
// 27: lload 1
// 28: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: lload 11
// 2f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 35: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 38: sipush 31781
// 3b: ldc2_w 6319570057584668409
// 3e: lload 1
// 3f: lxor
// 40: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: irem
// 46: bipush 1
// 47: iadd
// 48: istore 14
// 4a: astore 13
// 4c: lload 5
// 4e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 51: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 54: instanceof net/minecraft/class_495
// 57: aload 13
// 59: ifnonnull 9a
// 5c: ifne 99
// 5f: goto 6c
// 62: ldc2_w 1440299917654795249
// 65: lload 1
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: lload 5
// 6e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 71: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 74: instanceof net/minecraft/class_476
// 77: aload 13
// 79: ifnonnull 9a
// 7c: goto 89
// 7f: ldc2_w 1440299917654795249
// 82: lload 1
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: ifeq 9d
// 8c: goto 99
// 8f: ldc2_w 1440299917654795249
// 92: lload 1
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: bipush 1
// 9a: goto 9e
// 9d: bipush 0
// 9e: istore 15
// a0: iload 3
// a1: lload 9
// a3: iload 14
// a5: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// a8: bipush 0
// a9: sipush 10147
// ac: ldc2_w 6194561655817811321
// af: lload 1
// b0: lxor
// b1: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: aconst_null
// b7: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// ba: iload 4
// bc: lload 9
// be: iload 14
// c0: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// c3: bipush 0
// c4: sipush 10147
// c7: ldc2_w 6194561655817811321
// ca: lload 1
// cb: lxor
// cc: invokedynamic g (IJ)I bsm=su/catlean/gg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1: aconst_null
// d2: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// d5: iload 3
// d6: iload 14
// d8: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// db: iload 15
// dd: aload 13
// df: ifnonnull f3
// e2: ifne f6
// e5: goto f2
// e8: ldc2_w 1440299917654795249
// eb: lload 1
// ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f1: athrow
// f2: bipush 1
// f3: goto f7
// f6: bipush 0
// f7: lload 7
// f9: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// fc: return
}

private static final boolean V(List var0, class_1799 var1) {
long var2 = a ^ 60109200747112L;
Intrinsics.checkNotNullParameter(var1, a<"q">(31525, 7842600123350081651L ^ var2));
return var0.contains(var1.method_7909());
}

private static final boolean w(class_1792[] var0, class_1799 var1) {
long var2 = a ^ 73071216558879L;
Intrinsics.checkNotNullParameter(var1, a<"q">(31525, 7842728054120089860L ^ var2));
return ArraysKt.contains(var0, var1.method_7909());
}

private static final boolean W(List var0, class_1799 var1) {
long var2 = a ^ 68285544103367L;
Intrinsics.checkNotNullParameter(var1, a<"q">(31525, 7842609677302036444L ^ var2));
return var0.contains(var1.method_7909());
}

private static final boolean L(class_1792[] var0, class_1799 var1) {
long var2 = a ^ 94296735884850L;
Intrinsics.checkNotNullParameter(var1, a<"q">(1509, 5249445601235784427L ^ var2));
return ArraysKt.contains(var0, var1.method_7909());
}

private static final boolean g(class_1799 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gg.a J
// 03: ldc2_w 4420937158436
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 36232057696375
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 94462863926001
// 13: lxor
// 14: lstore 5
// 16: pop2
// 17: ldc2_w 4515040738969177936
// 1a: lload 1
// 1b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: aload 0
// 21: sipush 9828
// 24: ldc2_w 5818231784157632629
// 27: lload 1
// 28: lxor
// 29: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 31: astore 7
// 33: aload 0
// 34: lload 5
// 36: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 39: aload 7
// 3b: ifnonnull c8
// 3e: ifne c7
// 41: goto 4e
// 44: ldc2_w 4510008829186707099
// 47: lload 1
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 0
// 4f: lload 3
// 50: invokestatic su/catlean/xa.K (Lnet/minecraft/class_1799;J)Z
// 53: aload 7
// 55: ifnonnull c8
// 58: goto 65
// 5b: ldc2_w 4510008829186707099
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: ifne c7
// 68: goto 75
// 6b: ldc2_w 4510008829186707099
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: aload 0
// 76: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 79: instanceof net/minecraft/class_1743
// 7c: aload 7
// 7e: ifnonnull c8
// 81: goto 8e
// 84: ldc2_w 4510008829186707099
// 87: lload 1
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: ifne c7
// 91: goto 9e
// 94: ldc2_w 4510008829186707099
// 97: lload 1
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: aload 0
// 9f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// a2: instanceof net/minecraft/class_1821
// a5: aload 7
// a7: ifnonnull c8
// aa: goto b7
// ad: ldc2_w 4510008829186707099
// b0: lload 1
// b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: athrow
// b7: ifeq cb
// ba: goto c7
// bd: ldc2_w 4510008829186707099
// c0: lload 1
// c1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c6: athrow
// c7: bipush 1
// c8: goto cc
// cb: bipush 0
// cc: ireturn
}

static {
long var20 = a ^ 91196441282260L;
vm.a<"Å">(0, 8616787020908082901L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[21];
int var16 = 0;
String var15 = "zP8°\u0007àXc\u008c\u000fGM¸\u001adH\u0010æzÅ½Ì\t;pè]f\u0005p\u0088B\b \u0011à-Ô\u009eXû_øªýCÜ¿oVX xuæ^Þ0\u0006\u0011ÂçäæÀ\u000f\u0010Î§\u0098'ía\u008e/¤H\u0002(\u008a*.0\u0010\u0003|Ùä\u007fM[\u008dù\u0084×¤üq\u009aü\u0018N²\u001b}\u008cè\u0016¡¿6D\u001bþ¾gÕ>ºßÔïHêó\u0018<\u0091\u0087«\u0081\u0018<±\u00adß\u0089®JaÁ(Z\u0016\u0092\f\u0015D-X\u0018\u008c\u0011Ô_\no\u001e~?Îßq¡ÅôRâ\u0010ùe.KRæ((Ü\u008a\u0015\u0098à¼\u001dK\u0092t\u008dê J\u0018\u001c\u0081ØçöwÒö\t\u0097\u0001Üë\u0000\u00137¶3ªFi\u0095\u0005î\u00104\u0096ÿ\u0097\u008cß¿*Á\u009diFÒª\u0096æ a¸ÊÚSñSyýN\u00037åd;ù*x\u00ad¢;#\u009dà\u0092%\u0091°$þ0¡\u0010Ý\u0011MÂIIB\u009cjKæ\u0087Æ¦\u001a\t\u0010ã\u001esä\u0094ØB\n\u0013©¬\u0097Ý>ÿ\u0081(õ,âZ¦Æ\u0016ü«yüù'\u0002¹ ÕE\u008bO£ûÕoÀo\u0099×þÏ\u0080¥ß\u000f2\u0007|ZP\u0010\u0010q°×w\u0080µ¯adÕÈÍ.Á¢]\u0098^`×âgÙF'>|P\u007f9ýè\u0001\u0082 \u009aun?m,ÜçÁÙfT\u0082ð\u0019\\LÕ}C>ÓKÚÛ~\u0006x\u007f¯v¹b\u0010\u00999\u0002ðÕº\u008fç]?Éj\u0000mÊôRµ,¢Â:4\u001fjúpù@§©K\u009f \u0012È\fÏ¹c\n½\u0094ãLæ\u0017Ce\u0004\u008f&èY\u0086\u008bº\u000b&³ùÄ\u0083\u0089ì\u0002\u0004³\u0081\u009cpXû\u009d}Õ:\u000f\u009d\u0096ê\u0087*@mÜÖ¤¨E|xÙtð,\rµ\u001e$\u0010ek~\u0014À\u001b/\u0088}\u0082%pF'O^\u0010\u008a\bI\u0086\\5Î4Ç7\u009c\u0089?³\n\u008bp\u001en\u0007Þ \u0000JÛÚWô{Ë¡\u000e¦sêY²ZS/G\u0013ñ\u001fk¦mÞ¶hô¦{ý®\u0093É+P¹m\u0010Ë\u009eh\u008bÀ%\u0089E\u001crÎûFx\u0012èï\t9b\f¸æ%Åz\u009c\u0016\u0004\u0010¾0è\u001fo³ÂªFã¢\u0002¾ß~`z°\u0080Ê3ß\u008d{\u0092µ@{Ú\u008d°PÈ½W®Ú";
int var17 = "zP8°\u0007àXc\u008c\u000fGM¸\u001adH\u0010æzÅ½Ì\t;pè]f\u0005p\u0088B\b \u0011à-Ô\u009eXû_øªýCÜ¿oVX xuæ^Þ0\u0006\u0011ÂçäæÀ\u000f\u0010Î§\u0098'ía\u008e/¤H\u0002(\u008a*.0\u0010\u0003|Ùä\u007fM[\u008dù\u0084×¤üq\u009aü\u0018N²\u001b}\u008cè\u0016¡¿6D\u001bþ¾gÕ>ºßÔïHêó\u0018<\u0091\u0087«\u0081\u0018<±\u00adß\u0089®JaÁ(Z\u0016\u0092\f\u0015D-X\u0018\u008c\u0011Ô_\no\u001e~?Îßq¡ÅôRâ\u0010ùe.KRæ((Ü\u008a\u0015\u0098à¼\u001dK\u0092t\u008dê J\u0018\u001c\u0081ØçöwÒö\t\u0097\u0001Üë\u0000\u00137¶3ªFi\u0095\u0005î\u00104\u0096ÿ\u0097\u008cß¿*Á\u009diFÒª\u0096æ a¸ÊÚSñSyýN\u00037åd;ù*x\u00ad¢;#\u009dà\u0092%\u0091°$þ0¡\u0010Ý\u0011MÂIIB\u009cjKæ\u0087Æ¦\u001a\t\u0010ã\u001esä\u0094ØB\n\u0013©¬\u0097Ý>ÿ\u0081(õ,âZ¦Æ\u0016ü«yüù'\u0002¹ ÕE\u008bO£ûÕoÀo\u0099×þÏ\u0080¥ß\u000f2\u0007|ZP\u0010\u0010q°×w\u0080µ¯adÕÈÍ.Á¢]\u0098^`×âgÙF'>|P\u007f9ýè\u0001\u0082 \u009aun?m,ÜçÁÙfT\u0082ð\u0019\\LÕ}C>ÓKÚÛ~\u0006x\u007f¯v¹b\u0010\u00999\u0002ðÕº\u008fç]?Éj\u0000mÊôRµ,¢Â:4\u001fjúpù@§©K\u009f \u0012È\fÏ¹c\n½\u0094ãLæ\u0017Ce\u0004\u008f&èY\u0086\u008bº\u000b&³ùÄ\u0083\u0089ì\u0002\u0004³\u0081\u009cpXû\u009d}Õ:\u000f\u009d\u0096ê\u0087*@mÜÖ¤¨E|xÙtð,\rµ\u001e$\u0010ek~\u0014À\u001b/\u0088}\u0082%pF'O^\u0010\u008a\bI\u0086\\5Î4Ç7\u009c\u0089?³\n\u008bp\u001en\u0007Þ \u0000JÛÚWô{Ë¡\u000e¦sêY²ZS/G\u0013ñ\u001fk¦mÞ¶hô¦{ý®\u0093É+P¹m\u0010Ë\u009eh\u008bÀ%\u0089E\u001crÎûFx\u0012èï\t9b\f¸æ%Åz\u009c\u0016\u0004\u0010¾0è\u001fo³ÂªFã¢\u0002¾ß~`z°\u0080Ê3ß\u008d{\u0092µ@{Ú\u008d°PÈ½W®Ú"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[21];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[15];
int var3 = 0;
String var4 = "Ø_|Á¬½\u00912\u0086÷~ñq\u0019ñI*\u009e\u0007Á\u0084:f.\u00196bÕê.\u00931ÿ\u00ad\txüË¾\u0090°\u000eÂIÛ\u009aNl÷.áð¡\u0085ÀÙ<Il\u0089Hxß´\u0086\u0099[t\\\u00858\u0097@m\u0097'\u0092\u0085?\u0087%\u0081òñ¿\u001d¥öKê3Á\u009c3\u0089á¾\u009aÜC\u0010T\u008a\u0096";
int var5 = "Ø_|Á¬½\u00912\u0086÷~ñq\u0019ñI*\u009e\u0007Á\u0084:f.\u00196bÕê.\u00931ÿ\u00ad\txüË¾\u0090°\u000eÂIÛ\u009aNl÷.áð¡\u0085ÀÙ<Il\u0089Hxß´\u0086\u0099[t\\\u00858\u0097@m\u0097'\u0092\u0085?\u0087%\u0081òñ¿\u001d¥öKê3Á\u009c3\u0089á¾\u009aÜC\u0010T\u008a\u0096"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[15];
P = new gg();
B = -1;
O = -1;
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u00ad\u0085¸\u0005b\u0083Óþ\b}\u0002\\M\u008aAñ";
var5 = "\u00ad\u0085¸\u0005b\u0083Óþ\b}\u0002\\M\u008aAñ".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "Ë\u009fZåÚ\u0086\u0003\u009c-P/§2ÙdC\u0010\u0081\u0019¼2¼\u0090´Ä\u001a«ôÜ\u0087M\u0002\u0097";
var17 = "Ë\u009fZåÚ\u0086\u0003\u009c-P/§2ÙdC\u0010\u0081\u0019¼2¼\u0090´Ä\u001a«ôÜ\u0087M\u0002\u0097".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void F(int var0) {
r = var0;
}

public static int M() {
return r;
}

public static int U() {
int var0 = M();

try {
return var0 == 0 ? 96 : 0;
} catch (NoWhenBranchMatchedException var1) {
throw a(var1);
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16882;
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
throw new RuntimeException("su/catlean/gg", var10);
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
throw new RuntimeException("su/catlean/gg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 81;
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
throw new RuntimeException("su/catlean/gg", var14);
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
throw new RuntimeException("su/catlean/gg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
