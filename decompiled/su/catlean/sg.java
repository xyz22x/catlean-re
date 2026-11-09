package su.catlean;

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
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class sg implements ym {
@NotNull
public static final sg H;
@NotNull
private static final List o;
@NotNull
private static final bj u;
@NotNull
private static final bj F;
@NotNull
private static final bj l;
@NotNull
private static final bj g;
@NotNull
private static final bj B;
@NotNull
private static final bj n;
private static boolean w;
private static int O;
private static final long a = yz.a(-7762248569282793520L, 4859372621254086896L, MethodHandles.lookup().lookupClass()).a(160804293708231L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

private sg() {
}

@NotNull
public final bj C() {
return u;
}

@NotNull
public final bj B() {
return F;
}

@NotNull
public final bj L() {
return l;
}

@NotNull
public final bj A() {
return g;
}

@NotNull
public final bj x() {
return B;
}

@NotNull
public final bj g() {
return n;
}

public final boolean u() {
return w;
}

public final void t(boolean <set-?>) {
w = <set-?>;
}

public final void A(@NotNull String title, long a, @NotNull String content, int second, @NotNull ys type, @Nullable class_1799 item) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/sg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 67089986010788
// 0b: lxor
// 0c: lstore 8
// 0e: dup2
// 0f: ldc2_w 33901693490843
// 12: lxor
// 13: dup2
// 14: bipush 48
// 16: lushr
// 17: l2i
// 18: istore 10
// 1a: dup2
// 1b: bipush 16
// 1d: lshl
// 1e: bipush 48
// 20: lushr
// 21: l2i
// 22: istore 11
// 24: dup2
// 25: bipush 32
// 27: lshl
// 28: bipush 32
// 2a: lushr
// 2b: l2i
// 2c: istore 12
// 2e: pop2
// 2f: pop2
// 30: ldc2_w 7077164270549961484
// 33: lload 2
// 34: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: aload 1
// 3a: sipush 2331
// 3d: ldc2_w 6430079183675148741
// 40: lload 2
// 41: lxor
// 42: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 4a: aload 4
// 4c: sipush 9451
// 4f: ldc2_w 6221162073401189424
// 52: lload 2
// 53: lxor
// 54: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 5c: astore 13
// 5e: aload 6
// 60: sipush 515
// 63: ldc2_w 2013252795683783380
// 66: lload 2
// 67: lxor
// 68: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 70: getstatic su/catlean/pp.n Lsu/catlean/pp;
// 73: iload 10
// 75: i2s
// 76: iload 11
// 78: i2c
// 79: iload 12
// 7b: invokevirtual su/catlean/pp.U (SCI)Z
// 7e: aload 13
// 80: ifnull 96
// 83: ifeq 99
// 86: goto 93
// 89: ldc2_w 7084203655755953750
// 8c: lload 2
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: getstatic su/catlean/sg.w Z
// 96: ifeq 9a
// 99: return
// 9a: lload 8
// 9c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 9f: aload 13
// a1: lload 2
// a2: lconst_0
// a3: lcmp
// a4: ifle d0
// a7: ifnull cf
// aa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// ad: ifnull e0
// b0: goto bd
// b3: ldc2_w 7084203655755953750
// b6: lload 2
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: lload 8
// bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// c2: goto cf
// c5: ldc2_w 7084203655755953750
// c8: lload 2
// c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ce: athrow
// cf: aload 1
// d0: aload 4
// d2: aload 6
// d4: iload 5
// d6: aload 7
// d8: invokedynamic run (Ljava/lang/String;Ljava/lang/String;Lsu/catlean/ys;ILnet/minecraft/class_1799;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/sg.q (Ljava/lang/String;Ljava/lang/String;Lsu/catlean/ys;ILnet/minecraft/class_1799;)V, ()V ]
// dd: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
// e0: return
}

public static void J(int var0, sg var1, String var2, String var3, int var4, byte var5, int var6, ys var7, class_1799 var8, int var9, Object var10) {
long var11 = ((long)var0 << 32 | (long)var4 << 40 >>> 32 | (long)var5 << 56 >>> 56) ^ a;
long var13 = var11 ^ 25265957035311L;
if ((var9 & b<"x">(12404, 97110979414112056L ^ var11)) != 0) {
var8 = null;
}

var1.A(var2, var13, var3, var6, var7, var8);
}

@Flow
public final void C(@NotNull Render2DEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sg.a J
// 003: ldc2_w 73881034010694
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 55215087039299
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 1095425635985
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: pop2
// 032: ldc2_w -1166383534095923477
// 035: lload 2
// 036: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: aload 1
// 03c: ldc "e"
// 03e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 041: lload 4
// 043: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 046: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 049: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 04c: i2f
// 04d: fconst_2
// 04e: fdiv
// 04f: sipush 3276
// 052: ldc2_w 5250884917147862285
// 055: lload 2
// 056: lxor
// 057: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: i2f
// 05d: fadd
// 05e: fstore 10
// 060: astore 9
// 062: getstatic su/catlean/sg.o Ljava/util/List;
// 065: aload 9
// 067: ifnull 0a8
// 06a: invokeinterface java/util/List.size ()I 1
// 06f: sipush 29898
// 072: ldc2_w 680388552682077446
// 075: lload 2
// 076: lxor
// 077: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: if_icmple 0a2
// 07f: goto 08c
// 082: ldc2_w -1173422432947143759
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: getstatic su/catlean/sg.o Ljava/util/List;
// 08f: invokeinterface java/util/List.removeFirst ()Ljava/lang/Object; 1
// 094: pop
// 095: goto 0a2
// 098: ldc2_w -1173422432947143759
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: getstatic su/catlean/sg.o Ljava/util/List;
// 0a5: checkcast java/lang/Iterable
// 0a8: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 0ab: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
// 0ae: dup
// 0af: sipush 15625
// 0b2: ldc2_w 1040670329236811837
// 0b5: lload 2
// 0b6: lxor
// 0b7: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: astore 11
// 0c1: aload 11
// 0c3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c8: ifeq 121
// 0cb: aload 11
// 0cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d2: dup
// 0d3: sipush 12499
// 0d6: ldc2_w 5337988897604074988
// 0d9: lload 2
// 0da: lxor
// 0db: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e3: checkcast su/catlean/l1
// 0e6: astore 12
// 0e8: aload 0
// 0e9: aload 12
// 0eb: aload 1
// 0ec: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 0ef: iload 6
// 0f1: i2s
// 0f2: swap
// 0f3: fload 10
// 0f5: getstatic su/catlean/sg.o Ljava/util/List;
// 0f8: invokeinterface java/util/List.size ()I 1
// 0fd: sipush 9300
// 100: ldc2_w 394961826222288286
// 103: lload 2
// 104: lxor
// 105: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: imul
// 10b: i2f
// 10c: fadd
// 10d: iload 7
// 10f: i2c
// 110: iload 8
// 112: invokespecial su/catlean/sg.M (Lsu/catlean/l1;SLnet/minecraft/class_332;FCI)V
// 115: fload 10
// 117: ldc 16.0
// 119: fsub
// 11a: fstore 10
// 11c: aload 9
// 11e: ifnonnull 0c1
// 121: getstatic su/catlean/sg.o Ljava/util/List;
// 124: astore 12
// 126: aload 12
// 128: monitorenter
// 129: nop
// 12a: bipush 0
// 12b: istore 13
// 12d: getstatic su/catlean/sg.o Ljava/util/List;
// 130: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/sg.K (Lsu/catlean/l1;)Z, (Lsu/catlean/l1;)Ljava/lang/Boolean; ]
// 135: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/sg.t (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 13a: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 13f: istore 13
// 141: aload 12
// 143: monitorexit
// 144: goto 14f
// 147: astore 14
// 149: aload 12
// 14b: monitorexit
// 14c: aload 14
// 14e: athrow
// 14f: return
}

private final void M(l1 param1, short param2, class_332 param3, float param4, char param5, int param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 32
// 014: lshl
// 015: bipush 32
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/sg.a J
// 01c: lxor
// 01d: lstore 7
// 01f: lload 7
// 021: dup2
// 022: ldc2_w 103488370891678
// 025: lxor
// 026: lstore 9
// 028: dup2
// 029: ldc2_w 107711807924020
// 02c: lxor
// 02d: dup2
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 16
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 13
// 048: pop2
// 049: dup2
// 04a: ldc2_w 95802200790243
// 04d: lxor
// 04e: lstore 14
// 050: dup2
// 051: ldc2_w 529093561339
// 054: lxor
// 055: lstore 16
// 057: dup2
// 058: ldc2_w 79114345765860
// 05b: lxor
// 05c: lstore 18
// 05e: dup2
// 05f: ldc2_w 17219492228200
// 062: lxor
// 063: lstore 20
// 065: dup2
// 066: ldc2_w 111285738456611
// 069: lxor
// 06a: lstore 22
// 06c: dup2
// 06d: ldc2_w 78732134180013
// 070: lxor
// 071: dup2
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 24
// 078: dup2
// 079: bipush 16
// 07b: lshl
// 07c: bipush 32
// 07e: lushr
// 07f: l2i
// 080: istore 25
// 082: dup2
// 083: bipush 48
// 085: lshl
// 086: bipush 48
// 088: lushr
// 089: l2i
// 08a: istore 26
// 08c: pop2
// 08d: dup2
// 08e: ldc2_w 9010246261539
// 091: lxor
// 092: lstore 27
// 094: pop2
// 095: ldc2_w 508133197816196662
// 098: lload 7
// 09a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: astore 29
// 0a1: aload 1
// 0a2: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 0a5: aload 1
// 0a6: invokevirtual su/catlean/l1.f ()Lsu/catlean/bg;
// 0a9: aload 1
// 0aa: invokevirtual su/catlean/l1.h ()I
// 0ad: sipush 21795
// 0b0: ldc2_w 3749028499983053877
// 0b3: lload 7
// 0b5: lxor
// 0b6: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: isub
// 0bc: lload 20
// 0be: invokevirtual su/catlean/bg.c (IJ)Z
// 0c1: ifeq 0d3
// 0c4: fconst_0
// 0c5: goto 0d4
// 0c8: ldc2_w 534317206730052460
// 0cb: lload 7
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: fconst_1
// 0d4: lload 14
// 0d6: dup2_x1
// 0d7: pop2
// 0d8: invokevirtual su/catlean/fd.B (JF)V
// 0db: aload 1
// 0dc: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 0df: invokevirtual su/catlean/fd.a ()F
// 0e2: iload 2
// 0e3: iflt 125
// 0e6: f2d
// 0e7: ldc2_w 0.01
// 0ea: dcmpg
// 0eb: aload 29
// 0ed: ifnull 11b
// 0f0: ifge 102
// 0f3: goto 101
// 0f6: ldc2_w 534317206730052460
// 0f9: lload 7
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: return
// 102: aload 1
// 103: aload 0
// 104: aload 1
// 105: invokevirtual su/catlean/l1.w ()F
// 108: fload 4
// 10a: invokespecial su/catlean/sg.a (FF)F
// 10d: invokevirtual su/catlean/l1.L (F)V
// 110: lload 9
// 112: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 115: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 118: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 11b: i2f
// 11c: fconst_2
// 11d: fdiv
// 11e: aload 1
// 11f: invokevirtual su/catlean/l1.a ()F
// 122: fconst_2
// 123: fdiv
// 124: fsub
// 125: fstore 30
// 127: aload 3
// 128: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 12b: dup
// 12c: sipush 18638
// 12f: ldc2_w 1242712903413787941
// 132: lload 7
// 134: lxor
// 135: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/sg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 13d: astore 31
// 13f: aload 31
// 141: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 144: pop
// 145: aload 31
// 147: fload 30
// 149: aload 1
// 14a: invokevirtual su/catlean/l1.a ()F
// 14d: fconst_2
// 14e: fdiv
// 14f: fadd
// 150: aload 1
// 151: invokevirtual su/catlean/l1.w ()F
// 154: ldc 6.5
// 156: fadd
// 157: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 15a: pop
// 15b: aload 31
// 15d: aload 1
// 15e: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 161: invokevirtual su/catlean/fd.a ()F
// 164: aload 1
// 165: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 168: invokevirtual su/catlean/fd.a ()F
// 16b: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 16e: pop
// 16f: aload 31
// 171: fload 30
// 173: aload 1
// 174: invokevirtual su/catlean/l1.a ()F
// 177: fconst_2
// 178: fdiv
// 179: fadd
// 17a: fneg
// 17b: aload 1
// 17c: invokevirtual su/catlean/l1.w ()F
// 17f: ldc 6.5
// 181: fadd
// 182: fneg
// 183: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 186: pop
// 187: aload 31
// 189: iload 11
// 18b: i2c
// 18c: fload 30
// 18e: aload 1
// 18f: invokevirtual su/catlean/l1.w ()F
// 192: aload 1
// 193: invokevirtual su/catlean/l1.a ()F
// 196: ldc 13.0
// 198: ldc 3.0
// 19a: ldc 1.5
// 19c: fconst_0
// 19d: aload 1
// 19e: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 1a1: invokevirtual su/catlean/fd.a ()F
// 1a4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1a7: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 1aa: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ad: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1b0: fconst_0
// 1b1: iload 12
// 1b3: i2s
// 1b4: fconst_0
// 1b5: iload 13
// 1b7: fconst_0
// 1b8: sipush 29104
// 1bb: ldc2_w 2008401893951901859
// 1be: lload 7
// 1c0: lxor
// 1c1: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: aconst_null
// 1c7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 1ca: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1cd: aload 31
// 1cf: fload 30
// 1d1: sipush 20331
// 1d4: ldc2_w 3493971369902780022
// 1d7: lload 7
// 1d9: lxor
// 1da: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: i2f
// 1e0: fadd
// 1e1: aload 1
// 1e2: invokevirtual su/catlean/l1.w ()F
// 1e5: bipush 2
// 1e6: i2f
// 1e7: fadd
// 1e8: ldc 0.5
// 1ea: ldc 9.0
// 1ec: bipush 1
// 1ed: anewarray 309
// 1f0: astore 32
// 1f2: aload 32
// 1f4: bipush 0
// 1f5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f8: new java/awt/Color
// 1fb: dup
// 1fc: sipush 8209
// 1ff: ldc2_w 6481779819863654657
// 202: lload 7
// 204: lxor
// 205: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: bipush 1
// 20b: invokespecial java/awt/Color.<init> (IZ)V
// 20e: aload 1
// 20f: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 212: invokevirtual su/catlean/fd.a ()F
// 215: ldc 0.1
// 217: fmul
// 218: iload 24
// 21a: i2c
// 21b: swap
// 21c: iload 25
// 21e: swap
// 21f: iload 26
// 221: i2s
// 222: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 225: aastore
// 226: aload 32
// 228: lload 27
// 22a: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 22d: lload 18
// 22f: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 232: aload 3
// 233: aload 1
// 234: aload 29
// 236: ifnull 269
// 239: invokevirtual su/catlean/l1.i ()Lnet/minecraft/class_1799;
// 23c: ifnonnull 268
// 23f: goto 24d
// 242: ldc2_w 534317206730052460
// 245: lload 7
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: aload 1
// 24e: invokevirtual su/catlean/l1.B ()Ljava/lang/String;
// 251: aload 1
// 252: invokevirtual su/catlean/l1.S ()Ljava/lang/String;
// 255: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 25a: goto 26c
// 25d: ldc2_w 534317206730052460
// 260: lload 7
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: aload 1
// 269: invokevirtual su/catlean/l1.S ()Ljava/lang/String;
// 26c: fload 30
// 26e: ldc 16.0
// 270: fadd
// 271: lload 16
// 273: dup2_x1
// 274: pop2
// 275: aload 1
// 276: invokevirtual su/catlean/l1.w ()F
// 279: fconst_1
// 27a: fadd
// 27b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 27e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 281: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 284: aload 1
// 285: invokevirtual su/catlean/l1.L ()Lsu/catlean/fd;
// 288: invokevirtual su/catlean/fd.a ()F
// 28b: iload 24
// 28d: i2c
// 28e: swap
// 28f: iload 25
// 291: swap
// 292: iload 26
// 294: i2s
// 295: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 298: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 29b: aload 29
// 29d: ifnull 33e
// 2a0: aload 1
// 2a1: invokevirtual su/catlean/l1.i ()Lnet/minecraft/class_1799;
// 2a4: ifnonnull 2fe
// 2a7: goto 2b5
// 2aa: ldc2_w 534317206730052460
// 2ad: lload 7
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: aload 1
// 2b6: invokevirtual su/catlean/l1.O ()Lsu/catlean/bj;
// 2b9: aload 31
// 2bb: checkcast org/joml/Matrix3x2f
// 2be: fload 30
// 2c0: f2d
// 2c1: ldc2_w 2.0
// 2c4: dadd
// 2c5: aload 1
// 2c6: invokevirtual su/catlean/l1.w ()F
// 2c9: f2d
// 2ca: ldc2_w 0.5
// 2cd: dadd
// 2ce: fconst_0
// 2cf: fconst_0
// 2d0: aconst_null
// 2d1: aconst_null
// 2d2: fconst_0
// 2d3: sipush 2158
// 2d6: ldc2_w 2659210747185817980
// 2d9: lload 7
// 2db: lxor
// 2dc: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: lload 22
// 2e3: aconst_null
// 2e4: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 2e7: iload 2
// 2e8: iflt 358
// 2eb: aload 29
// 2ed: ifnonnull 352
// 2f0: goto 2fe
// 2f3: ldc2_w 534317206730052460
// 2f6: lload 7
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: aload 3
// 2ff: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 302: fload 30
// 304: fconst_2
// 305: fadd
// 306: aload 1
// 307: invokevirtual su/catlean/l1.w ()F
// 30a: fconst_1
// 30b: fadd
// 30c: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 30f: pop
// 310: aload 3
// 311: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 314: ldc 0.65
// 316: ldc 0.65
// 318: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 31b: pop
// 31c: aload 3
// 31d: aload 1
// 31e: invokevirtual su/catlean/l1.i ()Lnet/minecraft/class_1799;
// 321: bipush 0
// 322: bipush 0
// 323: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 326: aload 3
// 327: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 32a: fconst_1
// 32b: fconst_1
// 32c: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 32f: pop
// 330: goto 33e
// 333: ldc2_w 534317206730052460
// 336: lload 7
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: aload 3
// 33f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 342: fload 30
// 344: fconst_2
// 345: fadd
// 346: fneg
// 347: aload 1
// 348: invokevirtual su/catlean/l1.w ()F
// 34b: fconst_1
// 34c: fadd
// 34d: fneg
// 34e: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 351: pop
// 352: aload 31
// 354: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 357: pop
// 358: return
}

private final float a(float var1, float var2) {
return var1 + (var2 - var1) / 8.0F;
}

private static final void q(String param0, String param1, ys param2, int param3, class_1799 param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/sg.a J
// 03: ldc2_w 78872668598490
// 06: lxor
// 07: lstore 5
// 09: lload 5
// 0b: dup2
// 0c: ldc2_w 136943349014325
// 0f: lxor
// 10: dup2
// 11: bipush 32
// 13: lushr
// 14: lstore 7
// 16: dup2
// 17: bipush 32
// 19: lshl
// 1a: bipush 32
// 1c: lushr
// 1d: l2i
// 1e: istore 9
// 20: pop2
// 21: dup2
// 22: ldc2_w 25622412090378
// 25: lxor
// 26: lstore 10
// 28: pop2
// 29: ldc2_w -5815228139655903625
// 2c: lload 5
// 2e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: getstatic su/catlean/sg.o Ljava/util/List;
// 36: new su/catlean/l1
// 39: dup
// 3a: aload 0
// 3b: aload 1
// 3c: aload 2
// 3d: iload 3
// 3e: sipush 26324
// 41: ldc2_w 996656847109992331
// 44: lload 5
// 46: lxor
// 47: invokedynamic x (IJ)I bsm=su/catlean/sg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: imul
// 4d: lload 7
// 4f: dup2_x1
// 50: pop2
// 51: iload 9
// 53: aload 4
// 55: invokespecial su/catlean/l1.<init> (Ljava/lang/String;Ljava/lang/String;Lsu/catlean/ys;JIILnet/minecraft/class_1799;)V
// 58: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 5d: pop
// 5e: astore 12
// 60: aload 12
// 62: ifnull a8
// 65: aload 2
// 66: getstatic su/catlean/sw.M [I
// 69: swap
// 6a: invokevirtual su/catlean/ys.ordinal ()I
// 6d: iaload
// 6e: tableswitch 88 1 2 33 63
// 84: ldc2_w -5824511074382595283
// 87: lload 5
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 92: invokevirtual su/catlean/d2.d ()Lsu/catlean/lp;
// 95: lload 10
// 97: invokevirtual su/catlean/lp.L (J)V
// 9a: goto a8
// 9d: ldc2_w -5824511074382595283
// a0: lload 5
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: aload 12
// aa: ifnonnull c6
// ad: getstatic su/catlean/d2.O Lsu/catlean/d2;
// b0: invokevirtual su/catlean/d2.s ()Lsu/catlean/lp;
// b3: lload 10
// b5: invokevirtual su/catlean/lp.L (J)V
// b8: goto c6
// bb: ldc2_w -5824511074382595283
// be: lload 5
// c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c5: athrow
// c6: return
}

private static final boolean K(l1 var0) {
long var1 = a ^ 43880234139278L;
long var3 = var1 ^ 132057202750466L;
Intrinsics.checkNotNullParameter(var0, a<"j">(4377, 467835329285575402L ^ var1));
return var0.X(var3);
}

private static final boolean t(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 15786382409512L;
long var22 = var20 ^ 76035053617063L;
vm.a<"Å">(0, 6943436246830817799L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[13];
int var16 = 0;
String var15 = "V¬Ç½Å¯\u000b\tÏ`\u0090¼~ü \u0090\u0010T\u0015\u0015@\u001b\u0003^\u001aËT\u0099Z\u0002Íª\u008e\u0010&BU¸Z?(¥`õÖ½\\!ýP\u0018S\u0087\u00adÀ\u008aJ\u00adÖ¨\u0086[£R\u0084U÷ì·l\u0015Ý\u001dÐ\u009e\u0010\u009aÐ\u001e¾÷>ó\u009e¼¸\u0083f\u00079à\u00ad\u0010\u0011\u0097»¼\u0017Ñ\u000fþZ§\u0097ñÎ\u001e\u008d^\u0010\u0014\u001f\u0003¹ßîoØBç\u001cXâl\u001e²\u0010Ò\u008bûÇÿ¦=\u008a.§ãDÝê/° ×a¯¬F±\u009d\u000búÒ\u00826Ù0ÏØ¶\"\u0080\u0001þf}|u4÷ðéìÐ×\u0010ÈÎM6ÕÖÜj\u0000Nß\u000eÜ\u0017\u0089Í æÖ\u0094ÔªÓ/T\\O\u007fìÐáºùÙH1\u001d1\u009e\u009dÒk\u0098\u0080\f\u0096ÖÕW";
int var17 = "V¬Ç½Å¯\u000b\tÏ`\u0090¼~ü \u0090\u0010T\u0015\u0015@\u001b\u0003^\u001aËT\u0099Z\u0002Íª\u008e\u0010&BU¸Z?(¥`õÖ½\\!ýP\u0018S\u0087\u00adÀ\u008aJ\u00adÖ¨\u0086[£R\u0084U÷ì·l\u0015Ý\u001dÐ\u009e\u0010\u009aÐ\u001e¾÷>ó\u009e¼¸\u0083f\u00079à\u00ad\u0010\u0011\u0097»¼\u0017Ñ\u000fþZ§\u0097ñÎ\u001e\u008d^\u0010\u0014\u001f\u0003¹ßîoØBç\u001cXâl\u001e²\u0010Ò\u008bûÇÿ¦=\u008a.§ãDÝê/° ×a¯¬F±\u009d\u000búÒ\u00826Ù0ÏØ¶\"\u0080\u0001þf}|u4÷ðéìÐ×\u0010ÈÎM6ÕÖÜj\u0000Nß\u000eÜ\u0017\u0089Í æÖ\u0094ÔªÓ/T\\O\u007fìÐáºùÙH1\u001d1\u009e\u009dÒk\u0098\u0080\f\u0096ÖÕW"
.length();
char var14 = 16;
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[13];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "6Û½¤L\u00067\u009afFc\byî\u008e[\u008b©ÕÎ\u008f\u0084\u0004.[\u0085G-'CýôýIG\u001ct\u0087°\u009e\u0091n4I\r¯\u001e\u0005Y8\u0003Öb(~\u001fil°\u0088\u001dºí xq`¢_{É.;n/I\"ô(E";
int var5 = "6Û½¤L\u00067\u009afFc\byî\u008e[\u008b©ÕÎ\u008f\u0084\u0004.[\u0085G-'CýôýIG\u001ct\u0087°\u009e\u0091n4I\r¯\u001e\u0005Y8\u0003Öb(~\u001fil°\u0088\u001dºí xq`¢_{É.;n/I\"ô(E"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
e = var6;
f = new Integer[12];
H = new sg();
o = new ArrayList();
u = new bj(a<"j">(24183, 6474069478631480359L ^ var20), b<"x">(15605, 5904957093700680274L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
F = new bj(a<"j">(5845, 2872875705901175937L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
l = new bj(a<"j">(20623, 6098184931984347868L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
g = new bj(a<"j">(29150, 4140009972856664968L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
B = new bj(a<"j">(17892, 9099674116198303679L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
n = new bj(a<"j">(833, 350322787676930328L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), b<"x">(5977, 8444250528046977525L ^ var20), var22);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "Õ\"r&}\u0012ÒY<R[YÜ¦ðo";
var5 = "Õ\"r&}\u0012ÒY<R[YÜ¦ðo".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "bû±®\u001cÏ¨ïA\u008e)\u0087¥<ïÎ\u00108\u0084\u0013\u0010dòt:¶M\u0014Ñk$ ¼";
var17 = "bû±®\u001cÏ¨ïA\u008e)\u0087¥<ïÎ\u00108\u0084\u0013\u0010dòt:¶M\u0014Ñk$ ¼".length();
var14 = 16;
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var10001 = 0;
}
}
}

public static void j(int var0) {
O = var0;
}

public static int s() {
return O;
}

public static int D() {
int var0 = s();

try {
return var0 == 0 ? 90 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9014;
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
throw new RuntimeException("su/catlean/sg", var10);
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
throw new RuntimeException("su/catlean/sg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26562;
if (f[var3] == null) {
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
throw new RuntimeException("su/catlean/sg", var14);
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
throw new RuntimeException("su/catlean/sg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
