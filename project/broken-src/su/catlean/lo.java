package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.DisconnectEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

public final class lo implements ym {
@NotNull
public static final lo k;
public static final double c = -0.0784;
public static final double g = 0.2837;
public static final double V = 0.08511;
public static final double U = 0.45392000000000005;
public static final double i = 0.056740000000000006;
@NotNull
private static final Map h;
private static int[] d;
private static final long a = yz.a(7221140810902236983L, -1285106618695161538L, MethodHandles.lookup().lookupClass()).a(240828536777126L);
private static final String[] b;
private static final String[] e;
private static final Map f = new HashMap(13);

private lo() {
}

@NotNull
public final Map K() {
return h;
}

@Flow(
priority = 20
)
private final void B(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/lo.a J
// 03: ldc2_w 81719459507646
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 38387994452230
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 48849611375705
// 2e: lxor
// 2f: lstore 7
// 31: dup2
// 32: ldc2_w 32903569154660
// 35: lxor
// 36: lstore 9
// 38: pop2
// 39: ldc2_w 2985381796023462471
// 3c: lload 2
// 3d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: getstatic su/catlean/lo.h Ljava/util/Map;
// 45: invokeinterface java/util/Map.clear ()V 1
// 4a: astore 11
// 4c: lload 7
// 4e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 51: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 54: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 59: astore 12
// 5b: aload 12
// 5d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 62: ifeq dc
// 65: aload 12
// 67: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6c: checkcast net/minecraft/class_742
// 6f: astore 13
// 71: getstatic su/catlean/lo.h Ljava/util/Map;
// 74: aload 13
// 76: invokevirtual net/minecraft/class_742.method_5628 ()I
// 79: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 7c: new su/catlean/x4
// 7f: dup
// 80: aload 13
// 82: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 85: lload 9
// 87: aload 13
// 89: checkcast net/minecraft/class_1657
// 8c: invokespecial su/catlean/x4.<init> (JLnet/minecraft/class_1657;)V
// 8f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 94: pop
// 95: aload 11
// 97: ifnull d7
// 9a: getstatic su/catlean/lo.h Ljava/util/Map;
// 9d: aload 13
// 9f: invokevirtual net/minecraft/class_742.method_5628 ()I
// a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// a5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// aa: checkcast su/catlean/x4
// ad: dup
// ae: ifnull d6
// b1: goto be
// b4: ldc2_w 2885162231906114063
// b7: lload 2
// b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bd: athrow
// be: iload 4
// c0: iload 5
// c2: i2c
// c3: iload 6
// c5: i2s
// c6: invokevirtual su/catlean/x4.q (ICS)V
// c9: goto 5b
// cc: ldc2_w 2885162231906114063
// cf: lload 2
// d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: athrow
// d6: pop
// d7: aload 11
// d9: ifnonnull 5b
// dc: return
}

// $VF: Extended synchronized range to monitorexit
@Flow
private final void I(EntityRemove var1) {
long var2 = a ^ 35406166327886L;
if (var1.getEntity() != null) {
Map var4 = h;
synchronized (var4) {
boolean var6 = false;
Map var10000 = h;
class_1297 var10001 = var1.getEntity();
Intrinsics.checkNotNull(var10001);
x4 var9 = (x4)var10000.remove(var10001.method_5628());
}
}
}

@Flow
private final void P(DisconnectEvent var1) {
h.clear();
}

@NotNull
public final synchronized class_243 w(long a, @NotNull class_1657 player, int ticks) {
ax = a ^ ax;
long var5 = ax ^ 135629322262816L;
Intrinsics.checkNotNullParameter(player, a<"q">(244, 4850489899064876172L ^ ax));
class_243 var10000 = this.F(var5, player, ticks).method_1005().method_1031(0.0, -player.method_5829().method_17940() / 2.0, 0.0);
Intrinsics.checkNotNullExpressionValue(var10000, a<"q">(32036, 5369782660885258590L ^ ax));
return var10000;
}

@NotNull
public final synchronized class_238 F(long a, @NotNull class_1657 player, int ticks) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/lo.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w -1455687989803833115
// 009: lload 1
// 00a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 5
// 011: aload 3
// 012: aload 5
// 014: ifnull 06c
// 017: sipush 4594
// 01a: ldc2_w 2123397054137077892
// 01d: lload 1
// 01e: lxor
// 01f: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/lo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 027: getstatic su/catlean/lo.h Ljava/util/Map;
// 02a: aload 3
// 02b: invokevirtual net/minecraft/class_1657.method_5628 ()I
// 02e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 031: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 036: ifeq 05e
// 039: goto 046
// 03c: ldc2_w -1537899752480909139
// 03f: lload 1
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: lload 1
// 047: lconst_0
// 048: lcmp
// 049: ifle 081
// 04c: iload 4
// 04e: ifne 081
// 051: goto 05e
// 054: ldc2_w -1537899752480909139
// 057: lload 1
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: aload 3
// 05f: goto 06c
// 062: ldc2_w -1537899752480909139
// 065: lload 1
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 06f: dup
// 070: sipush 27651
// 073: ldc2_w 8250685649942015344
// 076: lload 1
// 077: lxor
// 078: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/lo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 080: areturn
// 081: lload 1
// 082: lconst_0
// 083: lcmp
// 084: iflt 0eb
// 087: getstatic su/catlean/lo.h Ljava/util/Map;
// 08a: aload 3
// 08b: invokevirtual net/minecraft/class_1657.method_5628 ()I
// 08e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 091: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 096: checkcast su/catlean/x4
// 099: dup
// 09a: ifnull 0ea
// 09d: invokevirtual su/catlean/x4.f ()Ljava/util/ArrayList;
// 0a0: aload 5
// 0a2: lload 1
// 0a3: lconst_0
// 0a4: lcmp
// 0a5: ifle 0e7
// 0a8: ifnull 0df
// 0ab: goto 0b8
// 0ae: ldc2_w -1537899752480909139
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: lload 1
// 0b9: lconst_0
// 0ba: lcmp
// 0bb: iflt 0ee
// 0be: dup
// 0bf: ifnull 0ea
// 0c2: goto 0cf
// 0c5: ldc2_w -1537899752480909139
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: checkcast java/util/List
// 0d2: goto 0df
// 0d5: ldc2_w -1537899752480909139
// 0d8: lload 1
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: lload 1
// 0e0: lconst_0
// 0e1: lcmp
// 0e2: iflt 0ee
// 0e5: aload 5
// 0e7: ifnonnull 0fb
// 0ea: pop
// 0eb: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 0ee: goto 0fb
// 0f1: ldc2_w -1537899752480909139
// 0f4: lload 1
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: astore 6
// 0fd: aload 6
// 0ff: aload 5
// 101: ifnull 14e
// 104: invokeinterface java/util/List.isEmpty ()Z 1
// 109: ifeq 139
// 10c: goto 119
// 10f: ldc2_w -1537899752480909139
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: aload 3
// 11a: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 11d: dup
// 11e: sipush 14497
// 121: ldc2_w 97083591335590352
// 124: lload 1
// 125: lxor
// 126: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/lo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12e: areturn
// 12f: ldc2_w -1537899752480909139
// 132: lload 1
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 6
// 13b: iload 4
// 13d: aload 6
// 13f: invokeinterface java/util/List.size ()I 1
// 144: bipush 1
// 145: isub
// 146: invokestatic java/lang/Math.min (II)I
// 149: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 14e: checkcast net/minecraft/class_238
// 151: areturn
}

@NotNull
public final class_243 c(byte a, @NotNull class_1657 entity, int ticks, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 56
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 8
// 00d: lushr
// 00e: lor
// 00f: iload 5
// 011: i2l
// 012: bipush 40
// 014: lshl
// 015: bipush 40
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/lo.a J
// 01c: lxor
// 01d: lstore 6
// 01f: lload 6
// 021: dup2
// 022: ldc2_w 118328976394073
// 025: lxor
// 026: dup2
// 027: bipush 56
// 029: lushr
// 02a: l2i
// 02b: istore 8
// 02d: dup2
// 02e: bipush 8
// 030: lshl
// 031: bipush 8
// 033: lushr
// 034: lstore 9
// 036: pop2
// 037: dup2
// 038: ldc2_w 11840852163071
// 03b: lxor
// 03c: lstore 11
// 03e: pop2
// 03f: ldc2_w -7725905076000663583
// 042: lload 6
// 044: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: aload 2
// 04a: sipush 10399
// 04d: ldc2_w 9209416040635291371
// 050: lload 6
// 052: lxor
// 053: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/lo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05b: astore 13
// 05d: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 060: iload 8
// 062: i2b
// 063: lload 9
// 065: aload 2
// 066: checkcast net/minecraft/class_1297
// 069: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 06c: astore 14
// 06e: aload 2
// 06f: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 072: aload 2
// 073: getfield net/minecraft/class_1657.field_6014 D
// 076: dsub
// 077: dstore 15
// 079: aload 2
// 07a: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 07d: aload 2
// 07e: getfield net/minecraft/class_1657.field_6036 D
// 081: dsub
// 082: dstore 17
// 084: aload 2
// 085: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 088: aload 2
// 089: getfield net/minecraft/class_1657.field_5969 D
// 08c: dsub
// 08d: dstore 19
// 08f: bipush 0
// 090: istore 21
// 092: iload 21
// 094: iload 3
// 095: if_icmpge 168
// 098: dload 15
// 09a: dconst_0
// 09b: dcmpl
// 09c: ifle 0af
// 09f: ldc 0.3
// 0a1: goto 0b1
// 0a4: ldc2_w -7661747307958655063
// 0a7: lload 6
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: ldc -0.3
// 0b1: fstore 22
// 0b3: dload 19
// 0b5: dconst_0
// 0b6: dcmpl
// 0b7: ifle 0ca
// 0ba: ldc 0.3
// 0bc: goto 0cc
// 0bf: ldc2_w -7661747307958655063
// 0c2: lload 6
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: ldc -0.3
// 0cc: fstore 23
// 0ce: aload 13
// 0d0: ifnull 13f
// 0d3: lload 11
// 0d5: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d8: aload 14
// 0da: dload 15
// 0dc: fload 22
// 0de: f2d
// 0df: dadd
// 0e0: ldc2_w 0.25
// 0e3: dload 19
// 0e5: fload 23
// 0e7: f2d
// 0e8: dadd
// 0e9: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0ec: checkcast net/minecraft/class_2374
// 0ef: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0f2: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 0f5: ifeq 13c
// 0f8: goto 106
// 0fb: ldc2_w -7661747307958655063
// 0fe: lload 6
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: iload 5
// 108: iflt 163
// 10b: lload 11
// 10d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 110: aload 14
// 112: dload 15
// 114: fload 22
// 116: f2d
// 117: dadd
// 118: dconst_1
// 119: dload 19
// 11b: fload 23
// 11d: f2d
// 11e: dadd
// 11f: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 122: checkcast net/minecraft/class_2374
// 125: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 128: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 12b: ifne 142
// 12e: goto 13c
// 131: ldc2_w -7661747307958655063
// 134: lload 6
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: dconst_0
// 13d: dstore 15
// 13f: dconst_0
// 140: dstore 19
// 142: aload 14
// 144: dload 15
// 146: dconst_0
// 147: dload 19
// 149: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 14c: dup
// 14d: sipush 688
// 150: ldc2_w 3104515862528752838
// 153: lload 6
// 155: lxor
// 156: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/lo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15e: astore 14
// 160: iinc 21 1
// 163: aload 13
// 165: ifnonnull 092
// 168: iload 5
// 16a: ifle 098
// 16d: aload 14
// 16f: areturn
}

static {
long var9 = a ^ 2786623441804L;
vm.a<"Å">(null, -8172311132936504766L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[8];
int var5 = 0;
String var4 = "442qS;B\u008b¾\u0000Ò\nØð¢\u0001»¢Ø\u00033EÚ\u0001\fLé¡Fv\u0094+\n±+J±aj\u0099\u0010õE}\u008cV\u0085\u009c46(L¯tèEA(3b|w\u001f.{V\u0006¨Ô¶/WÆ,\u0011«ôC\u008aP$_m÷vcØ¶3ú\u009a\u0000\u001b¡G1QI\u0018/\u0004v\u0087>\u008e5º$q\u0019Æ\u009dO\u001fYD\u001f\u0096d\u001auî(\u0018nÆb5\u009dÒ\u009e±¬§ªmèß\t DeåüÛ©OÛ(Í%®°M í \u009a\u00adSÀ\u0006w1å\u0016#ð\u0007ïr\u0098P\u001e\u0018FÁ\u00027ëüÎ\u00adïJY\u0083Ôg";
int var6 = "442qS;B\u008b¾\u0000Ò\nØð¢\u0001»¢Ø\u00033EÚ\u0001\fLé¡Fv\u0094+\n±+J±aj\u0099\u0010õE}\u008cV\u0085\u009c46(L¯tèEA(3b|w\u001f.{V\u0006¨Ô¶/WÆ,\u0011«ôC\u008aP$_m÷vcØ¶3ú\u009a\u0000\u001b¡G1QI\u0018/\u0004v\u0087>\u008e5º$q\u0019Æ\u009dO\u001fYD\u001f\u0096d\u001auî(\u0018nÆb5\u009dÒ\u009e±¬§ªmèß\t DeåüÛ©OÛ(Í%®°M í \u009a\u00adSÀ\u0006w1å\u0016#ð\u0007ïr\u0098P\u001e\u0018FÁ\u00027ëüÎ\u00adïJY\u0083Ôg"
.length();
char var3 = '(';
int var12 = -1;

label27:
while (true) {
String var13 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var12 += var3) >= var6) {
b = var7;
e = new String[8];
k = new lo();
Map var15 = Collections.synchronizedMap(new HashMap());
Intrinsics.checkNotNullExpressionValue(var15, a<"q">(20852, 1433425502799377552L ^ var9));
h = var15;
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var20;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "´\u0091\u0000ß\u0094è}.\u0017¦5ÐN\u0000 _\u0010úç¸Z«\f'Dn\u0013ª\u0082ìæÎL";
var6 = "´\u0091\u0000ß\u0094è}.\u0017¦5ÐN\u0000 _\u0010úç¸Z«\f'Dn\u0013ª\u0082ìæÎL".length();
var3 = 16;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

public static void c(int[] var0) {
d = var0;
}

public static int[] E() {
return d;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27202;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/lo", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/lo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
