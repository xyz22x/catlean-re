package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import net.minecraft.class_630.class_593;
import net.minecraft.class_630.class_618;
import net.minecraft.class_630.class_628;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ModelPartAccessor;

public final class kh extends _g {
@NotNull
public static final kh W;
static final KProperty[] V;
@NotNull
private static final cq u;
@NotNull
private static final c8 h;
@NotNull
private static final List X;
@NotNull
private static final List D;
private static final long a = yz.a(6224377949498687200L, 7658337560409827342L, MethodHandles.lookup().lookupClass()).a(1835574540851L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private kh(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 107718506010454L;
super(b<"p">(28524, 5004588559004176170L ^ var3), jt.F(), null, 4, null, var5);
}

public final boolean p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114200560854688L;
return (Boolean)u.E(this, var3, V[0]);
}

public final int E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 88702157561732L;
return ((Number)h.E(this, var3, V[1])).intValue();
}

@NotNull
public final List e() {
return X;
}

@NotNull
public final List H() {
return D;
}

@Override
public void O(long var1) {
long var3 = var1 ^ 32978412894279L;

try {
if (zf.F(var3).field_1724 != null) {
;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 2642381454120090059L, var1);
}
}

@Flow
private final void p(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kh.a J
// 03: ldc2_w 11999133950717
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 67748250823368
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w -8051244801183833797
// 14: lload 2
// 15: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: astore 6
// 1c: getstatic su/catlean/kh.X Ljava/util/List;
// 1f: aload 6
// 21: ifnonnull 4a
// 24: invokeinterface java/util/List.isEmpty ()Z 1
// 29: ifeq 44
// 2c: goto 39
// 2f: ldc2_w -8052570497748382369
// 32: lload 2
// 33: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: athrow
// 39: return
// 3a: ldc2_w -8052570497748382369
// 3d: lload 2
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: getstatic su/catlean/kh.X Ljava/util/List;
// 47: checkcast java/lang/Iterable
// 4a: astore 7
// 4c: bipush 0
// 4d: istore 8
// 4f: aload 7
// 51: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 56: astore 9
// 58: aload 9
// 5a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5f: ifeq 98
// 62: aload 9
// 64: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 69: astore 10
// 6b: aload 10
// 6d: checkcast su/catlean/j1
// 70: astore 11
// 72: bipush 0
// 73: istore 12
// 75: aload 11
// 77: aload 1
// 78: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 7b: lload 4
// 7d: invokevirtual su/catlean/j1.N (Lnet/minecraft/class_4587;J)V
// 80: nop
// 81: aload 6
// 83: ifnonnull 99
// 86: aload 6
// 88: ifnull 58
// 8b: goto 98
// 8e: ldc2_w -8052570497748382369
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: nop
// 99: return
}

@Flow
private final void B(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kh.a J
// 03: ldc2_w 103779985829531
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 125220931317812
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: lload 4
// 13: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 16: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 19: dup
// 1a: sipush 5195
// 1d: ldc2_w 8835238266068151920
// 20: lload 2
// 21: lxor
// 22: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: checkcast java/lang/Iterable
// 2d: astore 7
// 2f: bipush 0
// 30: istore 8
// 32: ldc2_w -2584381154587611811
// 35: lload 2
// 36: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: aload 7
// 3d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 42: astore 9
// 44: astore 6
// 46: aload 9
// 48: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4d: ifeq c0
// 50: aload 9
// 52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 57: astore 10
// 59: aload 10
// 5b: checkcast net/minecraft/class_742
// 5e: astore 11
// 60: bipush 0
// 61: istore 12
// 63: getstatic su/catlean/kh.W Lsu/catlean/kh;
// 66: pop
// 67: aload 6
// 69: ifnonnull bb
// 6c: getstatic su/catlean/kh.D Ljava/util/List;
// 6f: aload 11
// 71: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 76: aload 6
// 78: ifnonnull e6
// 7b: goto 88
// 7e: ldc2_w -2568792034835463879
// 81: lload 2
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: ifne b9
// 8b: goto 98
// 8e: ldc2_w -2568792034835463879
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: getstatic su/catlean/kh.W Lsu/catlean/kh;
// 9b: pop
// 9c: getstatic su/catlean/kh.D Ljava/util/List;
// 9f: aload 11
// a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// a4: aload 11
// a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// ab: pop
// ac: goto b9
// af: ldc2_w -2568792034835463879
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: nop
// ba: nop
// bb: aload 6
// bd: ifnull 46
// c0: nop
// c1: getstatic su/catlean/kh.D Ljava/util/List;
// c4: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kh.t (Lnet/minecraft/class_1657;)Z, (Lnet/minecraft/class_1657;)Ljava/lang/Boolean; ]
// c9: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kh.L (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// ce: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// d3: pop
// d4: getstatic su/catlean/kh.X Ljava/util/List;
// d7: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kh.U (Lsu/catlean/j1;)Z, (Lsu/catlean/j1;)Ljava/lang/Boolean; ]
// dc: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kh.P (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// e1: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// e6: pop
// e7: return
}

private final void y(long param1, class_1657 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kh.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 54994470593129
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 15031798001403
// 012: lxor
// 013: dup2
// 014: bipush 48
// 016: lushr
// 017: l2i
// 018: istore 6
// 01a: dup2
// 01b: bipush 16
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 7
// 024: dup2
// 025: bipush 32
// 027: lshl
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 8
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 135144512959237
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 9
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 16
// 041: lushr
// 042: lstore 10
// 044: pop2
// 045: dup2
// 046: ldc2_w 26574360536803
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 20486663990351
// 050: lxor
// 051: lstore 14
// 053: pop2
// 054: ldc2_w -4684290765733556351
// 057: lload 1
// 058: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: astore 16
// 05f: aload 3
// 060: instanceof net/minecraft/class_746
// 063: aload 16
// 065: ifnonnull 09f
// 068: ifne 0af
// 06b: goto 078
// 06e: ldc2_w -4718171431523851291
// 071: lload 1
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: lload 14
// 07a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07d: aload 16
// 07f: ifnonnull 0cf
// 082: goto 08f
// 085: ldc2_w -4718171431523851291
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: getfield net/minecraft/class_746.field_6012 I
// 092: goto 09f
// 095: ldc2_w -4718171431523851291
// 098: lload 1
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: sipush 7052
// 0a2: ldc2_w 4585781447902258712
// 0a5: lload 1
// 0a6: lxor
// 0a7: invokedynamic d (IJ)I bsm=su/catlean/kh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: if_icmpge 0ba
// 0af: return
// 0b0: ldc2_w -4718171431523851291
// 0b3: lload 1
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 3
// 0bb: sipush 7989
// 0be: ldc2_w 4194481238287894475
// 0c1: lload 1
// 0c2: lxor
// 0c3: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0cb: aload 3
// 0cc: checkcast net/minecraft/class_742
// 0cf: invokevirtual net/minecraft/class_742.method_52814 ()Lnet/minecraft/class_8685;
// 0d2: invokevirtual net/minecraft/class_8685.comp_1626 ()Lnet/minecraft/class_12079$class_12081;
// 0d5: invokeinterface net/minecraft/class_12079$class_12081.comp_3627 ()Lnet/minecraft/class_2960; 1
// 0da: dup
// 0db: sipush 31543
// 0de: ldc2_w 8161314446545822673
// 0e1: lload 1
// 0e2: lxor
// 0e3: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0eb: astore 17
// 0ed: aload 3
// 0ee: checkcast net/minecraft/class_742
// 0f1: invokevirtual net/minecraft/class_742.method_23317 ()D
// 0f4: dstore 18
// 0f6: aload 3
// 0f7: checkcast net/minecraft/class_742
// 0fa: invokevirtual net/minecraft/class_742.method_23318 ()D
// 0fd: ldc 1.45
// 0ff: f2d
// 100: dadd
// 101: dstore 20
// 103: aload 3
// 104: checkcast net/minecraft/class_742
// 107: invokevirtual net/minecraft/class_742.method_23321 ()D
// 10a: dstore 22
// 10c: lload 4
// 10e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 111: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 114: lload 14
// 116: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 119: checkcast net/minecraft/class_1297
// 11c: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 11f: dup
// 120: sipush 14197
// 123: ldc2_w 7727869681746014090
// 126: lload 1
// 127: lxor
// 128: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 130: checkcast net/minecraft/class_1007
// 133: astore 24
// 135: aload 24
// 137: invokevirtual net/minecraft/class_1007.method_4038 ()Lnet/minecraft/class_583;
// 13a: dup
// 13b: sipush 30293
// 13e: ldc2_w 658519774667517608
// 141: lload 1
// 142: lxor
// 143: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14b: checkcast net/minecraft/class_591
// 14e: astore 25
// 150: getstatic su/catlean/kh.X Ljava/util/List;
// 153: checkcast java/lang/Iterable
// 156: astore 26
// 158: bipush 0
// 159: istore 27
// 15b: aload 26
// 15d: aload 16
// 15f: ifnonnull 1b1
// 162: instanceof java/util/Collection
// 165: ifeq 1af
// 168: goto 175
// 16b: ldc2_w -4718171431523851291
// 16e: lload 1
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: aload 26
// 177: checkcast java/util/Collection
// 17a: aload 16
// 17c: ifnonnull 1b1
// 17f: goto 18c
// 182: ldc2_w -4718171431523851291
// 185: lload 1
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 191: ifeq 1af
// 194: goto 1a1
// 197: ldc2_w -4718171431523851291
// 19a: lload 1
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: bipush 0
// 1a2: goto 1f2
// 1a5: ldc2_w -4718171431523851291
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: aload 26
// 1b1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1b6: astore 28
// 1b8: aload 28
// 1ba: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1bf: ifeq 1f1
// 1c2: aload 28
// 1c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1c9: astore 29
// 1cb: aload 29
// 1cd: checkcast su/catlean/j1
// 1d0: astore 30
// 1d2: bipush 0
// 1d3: istore 31
// 1d5: aload 30
// 1d7: invokevirtual su/catlean/j1.S ()Lnet/minecraft/class_2960;
// 1da: aload 17
// 1dc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1df: ifeq 1b8
// 1e2: bipush 1
// 1e3: lload 1
// 1e4: lconst_0
// 1e5: lcmp
// 1e6: iflt 1df
// 1e9: aload 16
// 1eb: ifnonnull 1df
// 1ee: goto 1f2
// 1f1: bipush 0
// 1f2: ifeq 1f6
// 1f5: return
// 1f6: getstatic su/catlean/kh.X Ljava/util/List;
// 1f9: new su/catlean/j1
// 1fc: dup
// 1fd: aload 17
// 1ff: aload 25
// 201: iload 6
// 203: i2c
// 204: getstatic su/catlean/ce.HEAD Lsu/catlean/ce;
// 207: iload 7
// 209: i2s
// 20a: dload 18
// 20c: iload 8
// 20e: dload 20
// 210: dload 22
// 212: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 215: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 21a: pop
// 21b: getstatic su/catlean/kh.X Ljava/util/List;
// 21e: new su/catlean/j1
// 221: dup
// 222: aload 17
// 224: aload 25
// 226: iload 6
// 228: i2c
// 229: getstatic su/catlean/ce.BODY Lsu/catlean/ce;
// 22c: iload 7
// 22e: i2s
// 22f: dload 18
// 231: iload 8
// 233: dload 20
// 235: dload 22
// 237: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 23a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 23f: pop
// 240: getstatic su/catlean/kh.X Ljava/util/List;
// 243: new su/catlean/j1
// 246: dup
// 247: aload 17
// 249: aload 25
// 24b: iload 6
// 24d: i2c
// 24e: getstatic su/catlean/ce.RIGHT_ARM Lsu/catlean/ce;
// 251: dload 18
// 253: ldc 0.35
// 255: f2d
// 256: dadd
// 257: iload 7
// 259: i2s
// 25a: dup_x2
// 25b: pop
// 25c: dload 20
// 25e: ldc 0.15
// 260: f2d
// 261: dsub
// 262: iload 8
// 264: dup_x2
// 265: pop
// 266: dload 22
// 268: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 26b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 270: pop
// 271: getstatic su/catlean/kh.X Ljava/util/List;
// 274: new su/catlean/j1
// 277: dup
// 278: aload 17
// 27a: aload 25
// 27c: iload 6
// 27e: i2c
// 27f: getstatic su/catlean/ce.LEFT_ARM Lsu/catlean/ce;
// 282: dload 18
// 284: ldc 0.35
// 286: f2d
// 287: dsub
// 288: iload 7
// 28a: i2s
// 28b: dup_x2
// 28c: pop
// 28d: dload 20
// 28f: ldc 0.15
// 291: f2d
// 292: dsub
// 293: iload 8
// 295: dup_x2
// 296: pop
// 297: dload 22
// 299: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 29c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2a1: pop
// 2a2: getstatic su/catlean/kh.X Ljava/util/List;
// 2a5: new su/catlean/j1
// 2a8: dup
// 2a9: aload 17
// 2ab: aload 25
// 2ad: iload 6
// 2af: i2c
// 2b0: getstatic su/catlean/ce.RIGHT_LEG Lsu/catlean/ce;
// 2b3: dload 18
// 2b5: ldc 0.1
// 2b7: f2d
// 2b8: dadd
// 2b9: iload 7
// 2bb: i2s
// 2bc: dup_x2
// 2bd: pop
// 2be: dload 20
// 2c0: ldc 0.7
// 2c2: f2d
// 2c3: dsub
// 2c4: iload 8
// 2c6: dup_x2
// 2c7: pop
// 2c8: dload 22
// 2ca: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 2cd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2d2: pop
// 2d3: getstatic su/catlean/kh.X Ljava/util/List;
// 2d6: new su/catlean/j1
// 2d9: dup
// 2da: aload 17
// 2dc: aload 25
// 2de: iload 6
// 2e0: i2c
// 2e1: getstatic su/catlean/ce.LEFT_LEG Lsu/catlean/ce;
// 2e4: dload 18
// 2e6: ldc 0.1
// 2e8: f2d
// 2e9: dsub
// 2ea: iload 7
// 2ec: i2s
// 2ed: dup_x2
// 2ee: pop
// 2ef: dload 20
// 2f1: ldc 0.7
// 2f3: f2d
// 2f4: dsub
// 2f5: iload 8
// 2f7: dup_x2
// 2f8: pop
// 2f9: dload 22
// 2fb: invokespecial su/catlean/j1.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_591;CLsu/catlean/ce;SDIDD)V
// 2fe: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 303: pop
// 304: aload 0
// 305: lload 12
// 307: invokevirtual su/catlean/kh.p (J)Z
// 30a: lload 1
// 30b: lconst_0
// 30c: lcmp
// 30d: iflt 344
// 310: aload 16
// 312: ifnonnull 344
// 315: ifeq 368
// 318: goto 325
// 31b: ldc2_w -4718171431523851291
// 31e: lload 1
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: lload 14
// 327: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32a: dload 18
// 32c: dload 20
// 32e: dload 22
// 330: invokevirtual net/minecraft/class_746.method_5649 (DDD)D
// 333: ldc2_w 49.0
// 336: dcmpg
// 337: goto 344
// 33a: ldc2_w -4718171431523851291
// 33d: lload 1
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: ifge 368
// 347: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 34a: invokevirtual su/catlean/d2.B ()Lsu/catlean/lp;
// 34d: dload 18
// 34f: iload 9
// 351: i2s
// 352: lload 10
// 354: dload 20
// 356: dload 22
// 358: invokevirtual su/catlean/lp.q (DSJDD)V
// 35b: goto 368
// 35e: ldc2_w -4718171431523851291
// 361: lload 1
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: return
}

public final void E(
@NotNull class_4587 stack,
long a,
@NotNull class_591 model,
@NotNull g7 polygon,
double posX,
double posY,
double posZ,
double rotX,
double rotY,
double rotZ,
@NotNull ce part,
@NotNull Color color
) {
ax = a ^ ax;
long var10001 = ax ^ 100209331889545L;
int var20 = (int)((ax ^ 100209331889545L) >>> 48);
int var21 = (int)((ax ^ 100209331889545L) << 16 >>> 32);
int var22 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(stack, b<"p">(13376, 4821201546183347955L ^ ax));
Intrinsics.checkNotNullParameter(model, b<"p">(10487, 2257131922391143007L ^ ax));
Intrinsics.checkNotNullParameter(polygon, b<"p">(17994, 7519320150623026427L ^ ax));
Intrinsics.checkNotNullParameter(part, b<"p">(19328, 1312479071993917733L ^ ax));
Intrinsics.checkNotNullParameter(color, b<"p">(19641, 3424314035686110739L ^ ax));
stack.method_22903();
stack.method_22904(posX, posY, posZ);
stack.method_22905(0.0555F, 0.0555F, 0.0555F);
stack.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)rotX));
stack.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)rotY));
stack.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)rotZ));
Matrix4f var23 = stack.method_23760().method_23761();
boolean var24 = false;
kh var10000 = W;
Object var26 = part.T().invoke(model);
short var10003 = (short)var20;
class_630 var10002 = (class_630)var26;
Intrinsics.checkNotNull(var23);
var10000.h(var10003, var10002, polygon, var21, var22, color, var23);
W.h((short)var20, (class_630)part.s().invoke(model), polygon, var21, var22, color, var23);
stack.method_22909();
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void h(short a, @NotNull class_630 part, @NotNull g7 polygon, int a, int a, @NotNull Color color, @NotNull Matrix4f mat) {
long var8 = ((long)ax << 48 | (long)axxx << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var10 = var8 ^ 20751138220046L;
long var12 = var8 ^ 113896478350694L;
long var14 = var8 ^ 74568647675189L;
Intrinsics.checkNotNullParameter(part, b<"p">(384, 167372705248554439L ^ var8));
String var10000 = vm.a<"Å">(5354021052261595954L, var8);
Intrinsics.checkNotNullParameter(polygon, b<"p">(12226, 8956755532498699161L ^ var8));
Intrinsics.checkNotNullParameter(color, b<"p">(32141, 3108454367928177101L ^ var8));
Intrinsics.checkNotNullParameter(mat, b<"p">(23875, 6398320296057204994L ^ var8));
String var16 = var10000;
List var34 = ((ModelPartAccessor)part).getCuboidsList();
Intrinsics.checkNotNullExpressionValue(var34, b<"p">(6573, 8506755383261640174L ^ var8));
Iterable var17 = var34;
boolean var18 = false;
Iterator var19 = var17.iterator();

while (true) {
if (var19.hasNext()) {
Object var20 = var19.next();
class_628 var21 = (class_628)var20;
boolean var22 = false;
class_593[] var35 = var21.field_3649;
Intrinsics.checkNotNullExpressionValue(var21.field_3649, b<"p">(14663, 7056279021252646149L ^ var8));
Object[] var23 = var35;
boolean var24 = false;
int var25 = 0;
if (var16 != null) {
break;
}

int var26 = var23.length;

label48: {
label47:
while (var25 < var26) {
Object var27 = var23[var25];
class_593 var28 = (class_593)var27;
boolean var29 = false;
class_618[] var30 = var28.comp_3184();
boolean var31 = false;

try {
polygon.O(mat, var30[0].comp_4804(), var12, var30[0].comp_4805(), var30[0].comp_4806()).j(var30[0].comp_3187(), var14, var30[0].comp_3188()).n(color, var10);
polygon.O(mat, var30[1].comp_4804(), var12, var30[1].comp_4805(), var30[1].comp_4806()).j(var30[1].comp_3187(), var14, var30[1].comp_3188()).n(color, var10);
polygon.O(mat, var30[2].comp_4804(), var12, var30[2].comp_4805(), var30[2].comp_4806()).j(var30[2].comp_3187(), var14, var30[2].comp_3188()).n(color, var10);
polygon.O(mat, var30[3].comp_4804(), var12, var30[3].comp_4805(), var30[3].comp_4806()).j(var30[3].comp_3187(), var14, var30[3].comp_3188()).n(color, var10);
var25++;
} catch (NumberFormatException var32) {
throw vm.a<"Å">(var32, 5347729402875811670L, var8);
}

while (true) {
try {
var10000 = var16;
if (ax < 0) {
break label48;
}

if (var16 != null) {
break label47;
}

if (var16 == null) {
break;
}
} catch (NumberFormatException var33) {
throw vm.a<"Å">(var33, 5347729402875811670L, var8);
}

if (ax >= 0) {
break label47;
}
}
}

var10000 = var16;
}

if (var10000 == null) {
continue;
}
}

if (ax >= 0) {
}
break;
}
}

private static final boolean t(class_1657 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kh.a J
// 03: ldc2_w 131960045000665
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 96558268934393
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 96225446250870
// 13: lxor
// 14: lstore 5
// 16: pop2
// 17: ldc2_w 2693233318966367263
// 1a: lload 1
// 1b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: aload 0
// 21: sipush 7165
// 24: ldc2_w 8467802746207262874
// 27: lload 1
// 28: lxor
// 29: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 31: astore 7
// 33: lload 5
// 35: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 38: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 3b: dup
// 3c: sipush 17681
// 3f: ldc2_w 3299402517194573410
// 42: lload 1
// 43: lxor
// 44: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/kh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4c: checkcast java/lang/Iterable
// 4f: aload 0
// 50: invokestatic kotlin/collections/CollectionsKt.contains (Ljava/lang/Iterable;Ljava/lang/Object;)Z
// 53: aload 7
// 55: ifnonnull 7e
// 58: ifne 81
// 5b: goto 68
// 5e: ldc2_w 2674002548023392379
// 61: lload 1
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: getstatic su/catlean/kh.W Lsu/catlean/kh;
// 6b: lload 3
// 6c: aload 0
// 6d: invokespecial su/catlean/kh.y (JLnet/minecraft/class_1657;)V
// 70: bipush 1
// 71: goto 7e
// 74: ldc2_w 2674002548023392379
// 77: lload 1
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: goto 82
// 81: bipush 0
// 82: ireturn
}

private static final boolean L(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean U(j1 var0) {
long var1 = a ^ 90778306589187L;
long var10001 = var1 ^ 117032748715238L;
int var3 = (int)((var1 ^ 117032748715238L) >>> 48);
int var4 = (int)((var1 ^ 117032748715238L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var0, b<"p">(8457, 2590415403385128866L ^ var1));
return var0.m((char)var3, var4, var5);
}

private static final boolean P(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 105534204672388L;
long var22 = var20 ^ 129736051969073L;
long var24 = var20 ^ 99338976117079L;
int var26 = (int)((var20 ^ 34320123100683L) >>> 32);
int var27 = (int)((var20 ^ 34320123100683L) << 32 >>> 32);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[26];
int var16 = 0;
String var15 = "Æ\u0000^\u0081\u008cX6ºÛÁ]._-Ó% G§»LÜÞ<¦\u0094b±¤°\u0000¢\u0018n\u0088\u0096\u0087e@\u0091¾]oCÊûYØ¤\\9Qrp\u008cþeí\u0006=\u000e\u0085ÿ\u008f°âr\u000eÞ}\u0096\u0016\u0004ÿx=Uh\r\u001dzêU\u008aà°\u0019\u007fÚÄ\u0080ÿ\u0083â»¢Ë\u0007Ñ\u0014\"\u0084I^[I\u0095\u0015]æ\u0003Ð\u0099\u0010²¶\u008aøÌÍ\u0082q \u000f.\u0000àßð\u008füÁz7ExĀë©\u0094[y\u0088I@ð¤ \u0010²\u0000\u001crÁQ*\u0091\u0010Õ\u0014`¨\b\u000b³\fj9Ñ°ë\u000fQ\râ[.\u0085.ã¿«\u0000n\u0083;Ì\u001e\u0003\u0015\"\u0084ÿæU~'\u0005¥t9~\u009e¥L=Q\u009e\u009bwâ&iæ\u007fßN¨Qü\u0095\u0093Ww\u0000yîÇ-ÁFÆhR\n\u0014\u009f¶\u001bµUw¿fwWø²Á=oÂ\u008c\u008f-¡k7H\u0082\u0094t\u0087Å\u000bç\u007f×7Àèöý\fNB\u0080Óµ/&ç©n\u009bÿD\u0095½9@ñpR¿`Q$ÈNFÜÅ1\u0099Õ\u0084\u0000ÁÞ0\u009cê\u0081\u009d\u0019XÈ¯ÒÆN Í4®#µ÷y´I\u008d\u0011\u0083·Ø\"\u0091Wýýg´\u008d)*]\u0015\u0096Ha\u001cK\u0095\u0087\tÈî#×á4\u009e\u0087s\u0018\u0096\u008c\u009f\u008e\u0019/Wbxq\u0018Àa\u0011\u0010\u0001±\u0002òã¬9\u001b<\u0083Á \u0089ST\u0084Jle\u0010_í7Õf\u009bß¼\u0081\u0012`\f\u000e«²\u00001\\ß_§öñ\u0087 \u00069\u00ad\u001fÝ5\u0006ýÿ|$\u0093Î\u0092P\u0010¸0\u009f\u0088L5¦ê´\u008a\u009a'~Ù\u0086H wà\u009fÈô¼Î\u00aduvØk\u008d\u001a\u001e$ÒÜ¯µ`0¾UC÷?c\u009dØÁ^\u001058¯\u0089\u001dÖ\u0011\u0080z[w\u0087ã*Yy\u0010ºïÁª+³íé\t\u0014\u0091\u008d¹S%T\u0010EÆGk0[{\tEO\u0095A®Òù§\u0018\fv9\u0091ûÝÐ#[c\bóç<ø\u009cÊè\u0084)Edã\u0016\u0010|SU¤½\u000b=\u0015\u0015a¸\u009a9Qáp\u0010ÔJ½\u0014\u0019\n\u0091b«ÛürÁ¿Ëd\u0010$\u0088\u009dÐ\u0085(`÷.1Ê/o5\u0005±\u0010\u001eì\n9òZt¨eç=\u0001Æ¸Q×\u00108â*\f'w=Kk\tÞ\u0098§] \u008f(\u001eßF\u0087\u0089óV\u0018ë¹\u0018\u0092¾\u0003\u0094VzÊ¶\u0081{Á\u0014A¦9\u0001\u009c\u008d\u0014\u001b+±«fa\u0016j\u0093( \u008f²Ê¢\u009eeªF\u0085bÙØU\u0011À4\u0095jðvÕÕûÛ[\u0010\u008d/\n]+4\u0010\"ù\"±ÄÑJ)&\u0084Bf&\u0089\u0003\u0004\u0010\u00106A\n\u0017e\u0012u×¶;5\u0095ÛC\u0086\u0010?\u0080~X\u0096º!\u008d\u0003.\u009f\u0019ý]\u009ew g\u0010úÚ+Öcv\ræ¡Kß\u0017f4l\fp\t\u0010c%\u0082§ÏDùd¸\u008dê \u009eÚ.\u001b5¹î/QDRW{Üipþ\u008aóç6g\u0019\u0001Òÿêþô\u009e\u001f9\u0010;S>@Æ\u0002D\u0004\u0007\u0096dÇ]\\,¯\u0010)\u0099Y²(I\u009b Ã>©®Ï7\u0097\u0000\u0018¿Râ\tÈ¿\u0018î\f\u0000ÿÉEcbï\u0006$ÂB\u000fJ[j";
int var17 = "Æ\u0000^\u0081\u008cX6ºÛÁ]._-Ó% G§»LÜÞ<¦\u0094b±¤°\u0000¢\u0018n\u0088\u0096\u0087e@\u0091¾]oCÊûYØ¤\\9Qrp\u008cþeí\u0006=\u000e\u0085ÿ\u008f°âr\u000eÞ}\u0096\u0016\u0004ÿx=Uh\r\u001dzêU\u008aà°\u0019\u007fÚÄ\u0080ÿ\u0083â»¢Ë\u0007Ñ\u0014\"\u0084I^[I\u0095\u0015]æ\u0003Ð\u0099\u0010²¶\u008aøÌÍ\u0082q \u000f.\u0000àßð\u008füÁz7ExĀë©\u0094[y\u0088I@ð¤ \u0010²\u0000\u001crÁQ*\u0091\u0010Õ\u0014`¨\b\u000b³\fj9Ñ°ë\u000fQ\râ[.\u0085.ã¿«\u0000n\u0083;Ì\u001e\u0003\u0015\"\u0084ÿæU~'\u0005¥t9~\u009e¥L=Q\u009e\u009bwâ&iæ\u007fßN¨Qü\u0095\u0093Ww\u0000yîÇ-ÁFÆhR\n\u0014\u009f¶\u001bµUw¿fwWø²Á=oÂ\u008c\u008f-¡k7H\u0082\u0094t\u0087Å\u000bç\u007f×7Àèöý\fNB\u0080Óµ/&ç©n\u009bÿD\u0095½9@ñpR¿`Q$ÈNFÜÅ1\u0099Õ\u0084\u0000ÁÞ0\u009cê\u0081\u009d\u0019XÈ¯ÒÆN Í4®#µ÷y´I\u008d\u0011\u0083·Ø\"\u0091Wýýg´\u008d)*]\u0015\u0096Ha\u001cK\u0095\u0087\tÈî#×á4\u009e\u0087s\u0018\u0096\u008c\u009f\u008e\u0019/Wbxq\u0018Àa\u0011\u0010\u0001±\u0002òã¬9\u001b<\u0083Á \u0089ST\u0084Jle\u0010_í7Õf\u009bß¼\u0081\u0012`\f\u000e«²\u00001\\ß_§öñ\u0087 \u00069\u00ad\u001fÝ5\u0006ýÿ|$\u0093Î\u0092P\u0010¸0\u009f\u0088L5¦ê´\u008a\u009a'~Ù\u0086H wà\u009fÈô¼Î\u00aduvØk\u008d\u001a\u001e$ÒÜ¯µ`0¾UC÷?c\u009dØÁ^\u001058¯\u0089\u001dÖ\u0011\u0080z[w\u0087ã*Yy\u0010ºïÁª+³íé\t\u0014\u0091\u008d¹S%T\u0010EÆGk0[{\tEO\u0095A®Òù§\u0018\fv9\u0091ûÝÐ#[c\bóç<ø\u009cÊè\u0084)Edã\u0016\u0010|SU¤½\u000b=\u0015\u0015a¸\u009a9Qáp\u0010ÔJ½\u0014\u0019\n\u0091b«ÛürÁ¿Ëd\u0010$\u0088\u009dÐ\u0085(`÷.1Ê/o5\u0005±\u0010\u001eì\n9òZt¨eç=\u0001Æ¸Q×\u00108â*\f'w=Kk\tÞ\u0098§] \u008f(\u001eßF\u0087\u0089óV\u0018ë¹\u0018\u0092¾\u0003\u0094VzÊ¶\u0081{Á\u0014A¦9\u0001\u009c\u008d\u0014\u001b+±«fa\u0016j\u0093( \u008f²Ê¢\u009eeªF\u0085bÙØU\u0011À4\u0095jðvÕÕûÛ[\u0010\u008d/\n]+4\u0010\"ù\"±ÄÑJ)&\u0084Bf&\u0089\u0003\u0004\u0010\u00106A\n\u0017e\u0012u×¶;5\u0095ÛC\u0086\u0010?\u0080~X\u0096º!\u008d\u0003.\u009f\u0019ý]\u009ew g\u0010úÚ+Öcv\ræ¡Kß\u0017f4l\fp\t\u0010c%\u0082§ÏDùd¸\u008dê \u009eÚ.\u001b5¹î/QDRW{Üipþ\u008aóç6g\u0019\u0001Òÿêþô\u009e\u001f9\u0010;S>@Æ\u0002D\u0004\u0007\u0096dÇ]\\,¯\u0010)\u0099Y²(I\u009b Ã>©®Ï7\u0097\u0000\u0018¿Râ\tÈ¿\u0018î\f\u0000ÿÉEcbï\u0006$ÂB\u000fJ[j"
.length();
char var14 = 136;
int var31 = -1;

label54:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[26];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "\u0091Åì\u001dT·\u00ad\r~¿æõwÞv\u008c<WÈÔ{²\u008a\u0097";
int var5 = "\u0091Åì\u001dT·\u00ad\r~¿æõwÞv\u008c<WÈÔ{²\u008a\u0097".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var35 = var6;
var10001 = var3++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var35[var10001] = var52;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kh.class, b<"p">(15268, 6084424441559602828L ^ var20), b<"p">(6554, 847541045264086195L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kh.class, b<"p">(3298, 7779797182063075803L ^ var20), b<"p">(21866, 3668423499521079381L ^ var20), 0))
};
V = var28;
W = new kh(var26, var27);
u = yp.t(W, b<"p">(28375, 3423461722283607023L ^ var20), true, var22, null, null, c<"d">(22872, 85320088587407629L ^ var20), null);
h = yp.L(
W,
b<"p">(3378, 7590327053201268743L ^ var20),
c<"d">(3054, 2211877371539047356L ^ var20),
new IntRange(3, c<"d">(2152, 5626907184099999804L ^ var20)),
var24,
null,
null,
c<"d">(22674, 6603971722440118468L ^ var20),
null
);
X = new ArrayList();
D = new ArrayList();
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "ó¨\u000e\u001e\u009b^ìì×Q½\bCà\u00016";
var5 = "ó¨\u000e\u001e\u009b^ìì×Q½\bCà\u00016".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var35 = var6;
var10001 = var3++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var43;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label54;
}

var15 = "V>\u0010\u00840\u001b¬öÍ-\u0095\rrØ\u000ex1Á\u0093v\u0014ÍÖsÝ]áA)âÍ\u0085ãó\u001co[òÃ  a¢b-\u001fP^úï]M(\u0012¤ªObÜãj\u0010:×É\u0003\u0093r\\§ô+\u009f";
var17 = "V>\u0010\u00840\u001b¬öÍ-\u0095\rrØ\u000ex1Á\u0093v\u0014ÍÖsÝ]áA)âÍ\u0085ãó\u001co[òÃ  a¢b-\u001fP^úï]M(\u0012¤ªObÜãj\u0010:×É\u0003\u0093r\\§ô+\u009f"
.length();
var14 = '(';
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26590;
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
throw new RuntimeException("su/catlean/kh", var10);
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
throw new RuntimeException("su/catlean/kh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17077;
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
throw new RuntimeException("su/catlean/kh", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/kh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
