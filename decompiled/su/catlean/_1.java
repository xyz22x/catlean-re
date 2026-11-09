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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3611;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.EntityPushEvent;
import su.catlean.api.event.events.player.PushOutOfBlocksEvent;
import su.catlean.api.event.events.world.WaterPushEvent;
import su.catlean.gofra.Flow;

public final class _1 extends _g {
@NotNull
public static final _1 g;
static final KProperty[] c;
@NotNull
private static final cq N;
@NotNull
private static final cq m;
@NotNull
private static final cq i;
@NotNull
private static final cq A;
private static final long a = yz.a(-2209060970001580517L, -4265645779473533937L, MethodHandles.lookup().lookupClass()).a(147079701834060L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map j;

private _1(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 66128145277397L;
super(b<"m">(1730, 990159431446474362L ^ var1), jt.c(), null, 4, null, var3);
}

private final boolean L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 77673158085343L;
return (Boolean)N.E(this, var3, c[0]);
}

private final void g(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 135319005421740L;
N.b(this, var4, c[0], var3);
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 124680145376065L;
return (Boolean)m.E(this, var3, c[1]);
}

private final void o(int var1, int var2, int var3, boolean var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var7 = var5 ^ 105419778863522L;
m.b(this, var7, c[1], var4);
}

private final boolean e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 42296362282973L;
return (Boolean)i.E(this, var3, c[2]);
}

private final void L(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 106435389063337L;
i.b(this, var4, c[2], var1);
}

private final boolean G(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 88686020013261L;
return (Boolean)A.E(this, var6, c[3]);
}

private final void t(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 131717699178825L;
A.b(this, var4, c[3], var3);
}

@Flow
private final void L(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_1.a J
// 003: ldc2_w 132484279871144
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 114443869308513
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
// 02b: ldc2_w 110966750004226
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 113230296545957
// 035: lxor
// 036: lstore 9
// 038: pop2
// 039: ldc2_w -6278868888849807177
// 03c: lload 2
// 03d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: istore 11
// 044: aload 1
// 045: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 048: instanceof net/minecraft/class_2663
// 04b: iload 11
// 04d: ifeq 078
// 050: ifeq 153
// 053: goto 060
// 056: ldc2_w -6326570088470276649
// 059: lload 2
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: aload 0
// 061: iload 4
// 063: iload 5
// 065: iload 6
// 067: i2c
// 068: invokespecial su/catlean/_1.G (IIC)Z
// 06b: goto 078
// 06e: ldc2_w -6326570088470276649
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: iload 11
// 07a: ifeq 0a4
// 07d: ifeq 153
// 080: goto 08d
// 083: ldc2_w -6326570088470276649
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 1
// 08e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 091: checkcast net/minecraft/class_2663
// 094: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 097: goto 0a4
// 09a: ldc2_w -6326570088470276649
// 09d: lload 2
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: iload 11
// 0a6: ifeq 0fa
// 0a9: sipush 2227
// 0ac: ldc2_w 4631908541877751483
// 0af: lload 2
// 0b0: lxor
// 0b1: invokedynamic h (IJ)I bsm=su/catlean/_1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: if_icmpne 153
// 0b9: goto 0c6
// 0bc: ldc2_w -6326570088470276649
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 1
// 0c7: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0ca: checkcast net/minecraft/class_2663
// 0cd: lload 7
// 0cf: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d2: checkcast net/minecraft/class_1937
// 0d5: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 0d8: iload 11
// 0da: ifeq 12d
// 0dd: goto 0ea
// 0e0: ldc2_w -6326570088470276649
// 0e3: lload 2
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: instanceof net/minecraft/class_1536
// 0ed: goto 0fa
// 0f0: ldc2_w -6326570088470276649
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: ifeq 153
// 0fd: aload 1
// 0fe: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 101: checkcast net/minecraft/class_2663
// 104: lload 7
// 106: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 109: checkcast net/minecraft/class_1937
// 10c: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 10f: dup
// 110: sipush 18525
// 113: ldc2_w 6035760726856988729
// 116: lload 2
// 117: lxor
// 118: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 120: goto 12d
// 123: ldc2_w -6326570088470276649
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: checkcast net/minecraft/class_1536
// 130: astore 12
// 132: aload 12
// 134: invokevirtual net/minecraft/class_1536.method_26957 ()Lnet/minecraft/class_1297;
// 137: lload 9
// 139: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 13f: ifeq 153
// 142: aload 1
// 143: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 146: goto 153
// 149: ldc2_w -6326570088470276649
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: return
}

@Flow
private final void d(WaterPushEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_1.a J
// 003: ldc2_w 83205700170259
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 129245270466616
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 137619621491082
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 49596326760906
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -4892152475661065331
// 022: lload 2
// 023: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: istore 10
// 02a: aload 0
// 02b: lload 8
// 02d: invokespecial su/catlean/_1.e (J)Z
// 030: ifeq 075
// 033: lload 4
// 035: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 038: iload 10
// 03a: ifne 06f
// 03d: goto 04a
// 040: ldc2_w -4861440270998371988
// 043: lload 2
// 044: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: athrow
// 04a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 04d: ifnull 075
// 050: goto 05d
// 053: ldc2_w -4861440270998371988
// 056: lload 2
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: lload 4
// 05f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 062: goto 06f
// 065: ldc2_w -4861440270998371988
// 068: lload 2
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 072: ifnonnull 080
// 075: return
// 076: ldc2_w -4861440270998371988
// 079: lload 2
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: new net/minecraft/class_2338$class_2339
// 083: dup
// 084: invokespecial net/minecraft/class_2338$class_2339.<init> ()V
// 087: astore 11
// 089: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 08c: dup
// 08d: sipush 32010
// 090: ldc2_w 4202410909043972557
// 093: lload 2
// 094: lxor
// 095: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09d: astore 12
// 09f: aload 1
// 0a0: iload 10
// 0a2: ifne 1d0
// 0a5: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.getState ()Lnet/minecraft/class_3610;
// 0a8: getstatic net/minecraft/class_3609.field_15902 Lnet/minecraft/class_2746;
// 0ab: checkcast net/minecraft/class_2769
// 0ae: invokevirtual net/minecraft/class_3610.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
// 0b1: checkcast java/lang/Boolean
// 0b4: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0b7: ifeq 1b5
// 0ba: goto 0c7
// 0bd: ldc2_w -4861440270998371988
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: getstatic net/minecraft/class_2350$class_2353.field_11062 Lnet/minecraft/class_2350$class_2353;
// 0ca: invokevirtual net/minecraft/class_2350$class_2353.iterator ()Ljava/util/Iterator;
// 0cd: dup
// 0ce: sipush 22288
// 0d1: ldc2_w 675941113682850765
// 0d4: lload 2
// 0d5: lxor
// 0d6: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0de: astore 13
// 0e0: aload 13
// 0e2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e7: ifeq 1b5
// 0ea: aload 13
// 0ec: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f1: dup
// 0f2: sipush 11351
// 0f5: ldc2_w 2408297107224168580
// 0f8: lload 2
// 0f9: lxor
// 0fa: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 102: checkcast net/minecraft/class_2350
// 105: astore 14
// 107: aload 11
// 109: aload 1
// 10a: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.getPos ()Lnet/minecraft/class_2338;
// 10d: checkcast net/minecraft/class_2382
// 110: aload 14
// 112: invokevirtual net/minecraft/class_2338$class_2339.method_25505 (Lnet/minecraft/class_2382;Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338$class_2339;
// 115: pop
// 116: iload 10
// 118: ifne 1d3
// 11b: iload 10
// 11d: ifne 1b4
// 120: goto 12d
// 123: ldc2_w -4861440270998371988
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 0
// 12e: aload 1
// 12f: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.getFluid ()Lnet/minecraft/class_3611;
// 132: lload 6
// 134: aload 11
// 136: checkcast net/minecraft/class_2338
// 139: aload 14
// 13b: invokespecial su/catlean/_1.V (Lnet/minecraft/class_3611;JLnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 13e: ifne 194
// 141: goto 14e
// 144: ldc2_w -4861440270998371988
// 147: lload 2
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 0
// 14f: aload 1
// 150: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.getFluid ()Lnet/minecraft/class_3611;
// 153: aload 11
// 155: invokevirtual net/minecraft/class_2338$class_2339.method_10084 ()Lnet/minecraft/class_2338;
// 158: dup
// 159: sipush 3268
// 15c: ldc2_w 1135265763238914069
// 15f: lload 2
// 160: lxor
// 161: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 169: aload 14
// 16b: lload 6
// 16d: dup2_x2
// 16e: pop2
// 16f: invokespecial su/catlean/_1.V (Lnet/minecraft/class_3611;JLnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 172: ifne 194
// 175: goto 182
// 178: ldc2_w -4861440270998371988
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: iload 10
// 184: ifeq 0e0
// 187: goto 194
// 18a: ldc2_w -4861440270998371988
// 18d: lload 2
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: aload 12
// 196: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 199: dconst_0
// 19a: ldc2_w -6.0
// 19d: dconst_0
// 19e: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1a1: dup
// 1a2: sipush 13838
// 1a5: ldc2_w 2659408317385151186
// 1a8: lload 2
// 1a9: lxor
// 1aa: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b2: astore 12
// 1b4: nop
// 1b5: aload 1
// 1b6: aload 12
// 1b8: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 1bb: dup
// 1bc: sipush 7909
// 1bf: ldc2_w 3162540429958003248
// 1c2: lload 2
// 1c3: lxor
// 1c4: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1cc: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.setVec (Lnet/minecraft/class_243;)V
// 1cf: aload 1
// 1d0: invokevirtual su/catlean/api/event/events/world/WaterPushEvent.cancel ()V
// 1d3: return
}

@Flow
private final void z(PushOutOfBlocksEvent var1) {
long var2 = a ^ 51772737616010L;
long var4 = var2 ^ 45570839854673L;

try {
if (this.L(var4)) {
var1.cancel();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 8507815839767776245L, var2);
}
}

@Flow
private final void n(EntityPushEvent var1) {
long var2 = a ^ 67970580743122L;
long var4 = var2 ^ 13693554351255L;

try {
if (this.Q(var4)) {
var1.cancel();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 957515928386187437L, var2);
}
}

private final boolean V(class_3611 param1, long param2, class_2338 param4, class_2350 param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_1.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 10882543742545
// 0b: lxor
// 0c: lstore 6
// 0e: pop2
// 0f: ldc2_w -9010634244174668443
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: lload 6
// 1a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d: aload 4
// 1f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 22: astore 9
// 24: istore 8
// 26: bipush 0
// 27: istore 10
// 29: lload 6
// 2b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2e: aload 4
// 30: invokevirtual net/minecraft/class_638.method_8316 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3610;
// 33: invokevirtual net/minecraft/class_3610.method_15772 ()Lnet/minecraft/class_3611;
// 36: aload 1
// 37: invokevirtual net/minecraft/class_3611.method_15780 (Lnet/minecraft/class_3611;)Z
// 3a: iload 8
// 3c: ifne 50
// 3f: ifeq 53
// 42: goto 4f
// 45: ldc2_w -9051972400869130364
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: goto ab
// 53: lload 2
// 54: lconst_0
// 55: lcmp
// 56: iflt 6f
// 59: aload 5
// 5b: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 5e: if_acmpne 6f
// 61: bipush 1
// 62: goto ab
// 65: ldc2_w -9051972400869130364
// 68: lload 2
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: aload 9
// 71: iload 8
// 73: ifne 9c
// 76: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 79: instanceof net/minecraft/class_2386
// 7c: ifeq 9a
// 7f: goto 8c
// 82: ldc2_w -9051972400869130364
// 85: lload 2
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: bipush 0
// 8d: goto ab
// 90: ldc2_w -9051972400869130364
// 93: lload 2
// 94: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 99: athrow
// 9a: aload 9
// 9c: lload 6
// 9e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// a1: checkcast net/minecraft/class_1922
// a4: aload 4
// a6: aload 5
// a8: invokevirtual net/minecraft/class_2680.method_26206 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// ab: nop
// ac: ireturn
}

static {
long var20 = a ^ 131770210362494L;
long var22 = var20 ^ 117415702631794L;
long var24 = var20 ^ 121836491763150L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[20];
int var16 = 0;
String var15 = "\u0093\u001f\u0013¶W'\u0003R\u0013tA¦\u0086\u001b4C\u0003#v\u0017\u00859\u0013·\u009a\u0003\u009a\u009c®\u0095'b\u0010d\u0097²#ÆM×m¥öÔv\u009a\u0018o[ í¹TÓA\u0012,¡\u0015\bÿ\u0003þ0¼I\u008b\nNLZUWè\u009cV\u0013\u008c\u008cü¨Ó O\u00ad\u0019\u0002Gµ5\bï}i\u00193PÙhDã/-¬ìà\u0088}\u000eÅ·o¾1\u000e\u00187UÁ7¡é³J\u0098-\u008d|]ûóoÅfð\u0098\u0093\"\u0096)\u0010òõ\u0003ý}©\u0095[+\u000f\u0083X©4:\u0012 m\u0011ßk\u001e,´I\u00adR\u007f×KXÒÌuLd\u0095\u0007~NÑ\u0019\u0007n\u0007%p/¸\u0010\u0016(y\u001fJ?ó4%ÓÑ3\u0006\u008d\u008c\u001f \u008eiôS{ÉÉÛà\u007fa\u0095=ü\u0090*µ`¯)S¢1ä\u0086Vô\u009c\u008a\u0091RÝ\u0018D]]\u008cÑO9ø*\u0004\u008b\u0013\u0005w©¾%ßÓØ©\u0096E3\u0090î;C\u000fÄ%ÅCñ³L)Ã£é\u0004\u008aÁ\u009e\u0081Þ\u0018X\u0092Pâ\u001cK¬#ÃT\r·q¢\u0095¿¼\u001b\u008dÂèWw^~ÆHÔ\u008e\u0015¡çSC\"ÕX\"\u0015T\u00994öØÛ;ñ\u0018\u0095M©ÎÃùö\u008dÿ5Ù£'µÝÄ&\u009b«<E\u008dä¹Ä\r\u001f@\u0085Ñ\u000f'\u0097x\u0018\u007f\u008c\u00057P\u00ad WÙÝ¸'\u008fî)\u0007ñ]dësìÙ\u000b>\u008f¢2SÛ°³e\u000f\t\u0002¦pK\u0018k.j\u0082\u00052\u0093åbWôjT\u0005\u00846¹ïñ\u009b\u009d\u0087×a ÜäCP\u0092\u0085S\u0012Ñ´FÏ|\u008eÜ\u0094Ò}ª¿Üº\u001béÌº\u008eý\u0006(8´ 8q\u000fÖ\u0084=2\u0003«vC\u0087%´\u001cF[\u0011\\\u0089°ØØh\u008bª¤¸ÒlE\u009a(åa\u001c\u009b:Þ\u009b´ =É\u0084fª¦«pÓÊ²_\n÷.rt\u009d\u0080¸\u009aLÄÀæêàRÑÎñ VdYu\u0088\u0015_ÝÑS~ó«ØÚ!l\u008f\r\u008bM\u001dP·å-ôNið\u008e¹\u0010ñ¯õïe[Â*¿à\u0018À\u0087\u0017ôO\u0010\u0090iv\u009cÉZ\r¦&\u009cKÃÊ\u0014s(";
int var17 = "\u0093\u001f\u0013¶W'\u0003R\u0013tA¦\u0086\u001b4C\u0003#v\u0017\u00859\u0013·\u009a\u0003\u009a\u009c®\u0095'b\u0010d\u0097²#ÆM×m¥öÔv\u009a\u0018o[ í¹TÓA\u0012,¡\u0015\bÿ\u0003þ0¼I\u008b\nNLZUWè\u009cV\u0013\u008c\u008cü¨Ó O\u00ad\u0019\u0002Gµ5\bï}i\u00193PÙhDã/-¬ìà\u0088}\u000eÅ·o¾1\u000e\u00187UÁ7¡é³J\u0098-\u008d|]ûóoÅfð\u0098\u0093\"\u0096)\u0010òõ\u0003ý}©\u0095[+\u000f\u0083X©4:\u0012 m\u0011ßk\u001e,´I\u00adR\u007f×KXÒÌuLd\u0095\u0007~NÑ\u0019\u0007n\u0007%p/¸\u0010\u0016(y\u001fJ?ó4%ÓÑ3\u0006\u008d\u008c\u001f \u008eiôS{ÉÉÛà\u007fa\u0095=ü\u0090*µ`¯)S¢1ä\u0086Vô\u009c\u008a\u0091RÝ\u0018D]]\u008cÑO9ø*\u0004\u008b\u0013\u0005w©¾%ßÓØ©\u0096E3\u0090î;C\u000fÄ%ÅCñ³L)Ã£é\u0004\u008aÁ\u009e\u0081Þ\u0018X\u0092Pâ\u001cK¬#ÃT\r·q¢\u0095¿¼\u001b\u008dÂèWw^~ÆHÔ\u008e\u0015¡çSC\"ÕX\"\u0015T\u00994öØÛ;ñ\u0018\u0095M©ÎÃùö\u008dÿ5Ù£'µÝÄ&\u009b«<E\u008dä¹Ä\r\u001f@\u0085Ñ\u000f'\u0097x\u0018\u007f\u008c\u00057P\u00ad WÙÝ¸'\u008fî)\u0007ñ]dësìÙ\u000b>\u008f¢2SÛ°³e\u000f\t\u0002¦pK\u0018k.j\u0082\u00052\u0093åbWôjT\u0005\u00846¹ïñ\u009b\u009d\u0087×a ÜäCP\u0092\u0085S\u0012Ñ´FÏ|\u008eÜ\u0094Ò}ª¿Üº\u001béÌº\u008eý\u0006(8´ 8q\u000fÖ\u0084=2\u0003«vC\u0087%´\u001cF[\u0011\\\u0089°ØØh\u008bª¤¸ÒlE\u009a(åa\u001c\u009b:Þ\u009b´ =É\u0084fª¦«pÓÊ²_\n÷.rt\u009d\u0080¸\u009aLÄÀæêàRÑÎñ VdYu\u0088\u0015_ÝÑS~ó«ØÚ!l\u008f\r\u008bM\u001dP·å-ôNið\u008e¹\u0010ñ¯õïe[Â*¿à\u0018À\u0087\u0017ôO\u0010\u0090iv\u009cÉZ\r¦&\u009cKÃÊ\u0014s("
.length();
char var14 = ' ';
int var28 = -1;

label45:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
d = new String[20];
j = new HashMap(13);
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
String var4 = "á¦\u0014_¹\u009f§ËH|\u008eÕ\u0083}~\u0096ú\u000f\u000fV7þ:Ã";
int var5 = "á¦\u0014_¹\u009f§ËH|\u008eÕ\u0083}~\u0096ú\u000f\u000fV7þ:Ã".length();
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
byte var43 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
h = new Integer[3];
KProperty[] var26 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_1.class, b<"m">(3313, 3563646441975725646L ^ var20), b<"m">(14465, 6345284691472157226L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_1.class, b<"m">(27982, 8373832937811369981L ^ var20), b<"m">(798, 7812305098873581993L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_1.class, b<"m">(27870, 1916222348266036839L ^ var20), b<"m">(14512, 6850098776963844618L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_1.class, b<"m">(24088, 4717752314815409325L ^ var20), b<"m">(30652, 6770761294597637386L ^ var20), 0)
)
};
c = var26;
g = new _1(var22);
N = yp.t(g, b<"m">(16414, 4669064217150845603L ^ var20), true, var24, null, null, c<"h">(5720, 5222427651712553604L ^ var20), null);
m = yp.t(g, b<"m">(106, 7699396804236358366L ^ var20), true, var24, null, null, c<"h">(30009, 4302029489181651428L ^ var20), null);
i = yp.t(g, b<"m">(15991, 6599351871984241886L ^ var20), true, var24, null, null, c<"h">(30009, 4302029489181651428L ^ var20), null);
A = yp.t(g, b<"m">(29620, 7585937895126712591L ^ var20), true, var24, null, null, c<"h">(30009, 4302029489181651428L ^ var20), null);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label45;
}

var15 = "ØBCô4£($\u001a,%3tæ\u008ez\u0018R¾å~ó\u0001!\b²3Ô¼\u0002\u0092\u0080\u009cØTÝßÀ\u007füÈ";
var17 = "ØBCô4£($\u001a,%3tæ\u008ez\u0018R¾å~ó\u0001!\b²3Ô¼\u0002\u0092\u0080\u009cØTÝßÀ\u007füÈ".length();
var14 = 16;
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6564;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_1", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/_1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12224;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/_1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
