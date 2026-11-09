package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_2818;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class nf implements ym {
@NotNull
public static final nf Z;
@NotNull
private static final ArrayDeque w;
private static long s;
private static float W;
private static int k;
@NotNull
private static List U;
private static long H;
private static long B;
private static String X;
private static final long a = yz.a(5547563520432500816L, -385423042536278456L, MethodHandles.lookup().lookupClass()).a(192092499423659L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private nf() {
}

@NotNull
public final List V() {
return U;
}

public final void q(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"e">(8462, 4168444812750558006L ^ ax));
U = <set-?>;
}

public final long B() {
return H;
}

public final float p() {
return new BigDecimal((double)W).setScale(2, RoundingMode.HALF_UP).floatValue();
}

public final float a(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 2943694868603L;
return new BigDecimal(20.0 * this.g(var6)).setScale(2, RoundingMode.HALF_UP).floatValue();
}

public final float g(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nf.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 140282231570876
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 1551526227218814625
// 11: lload 1
// 12: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: aload 5
// 1b: ifnull b1
// 1e: lload 3
// 1f: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 22: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 25: dup
// 26: ifnull b0
// 29: goto 36
// 2c: ldc2_w 1469976613145420133
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 39: dup
// 3a: lload 1
// 3b: lconst_0
// 3c: lcmp
// 3d: iflt 82
// 40: aload 5
// 42: ifnull 82
// 45: goto 52
// 48: ldc2_w 1469976613145420133
// 4b: lload 1
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: ifnull b0
// 55: goto 62
// 58: ldc2_w 1469976613145420133
// 5b: lload 1
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: checkcast java/lang/CharSequence
// 65: sipush 1001
// 68: ldc2_w 4022711906978668507
// 6b: lload 1
// 6c: lxor
// 6d: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/nf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: checkcast java/lang/CharSequence
// 75: goto 82
// 78: ldc2_w 1469976613145420133
// 7b: lload 1
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: bipush 2
// 84: aconst_null
// 85: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 88: aload 5
// 8a: ifnull ad
// 8d: bipush 1
// 8e: if_icmpne ac
// 91: goto 9e
// 94: ldc2_w 1469976613145420133
// 97: lload 1
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: bipush 1
// 9f: goto b2
// a2: ldc2_w 1469976613145420133
// a5: lload 1
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: goto b2
// b0: pop
// b1: bipush 0
// b2: ifeq c3
// b5: fconst_1
// b6: goto ce
// b9: ldc2_w 1469976613145420133
// bc: lload 1
// bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c2: athrow
// c3: ldc 1000.0
// c5: getstatic su/catlean/nf.s J
// c8: l2f
// c9: fconst_1
// ca: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
// cd: fdiv
// ce: freturn
}

@Flow(
priority = 10
)
private final void N(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nf.a J
// 03: ldc2_w 19242789387274
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 43601650670452
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 6935425361489
// 14: lxor
// 15: dup2
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 16
// 1f: lshl
// 20: bipush 32
// 22: lushr
// 23: l2i
// 24: istore 7
// 26: dup2
// 27: bipush 48
// 29: lshl
// 2a: bipush 48
// 2c: lushr
// 2d: l2i
// 2e: istore 8
// 30: pop2
// 31: dup2
// 32: ldc2_w 7706334221650
// 35: lxor
// 36: lstore 9
// 38: pop2
// 39: ldc2_w -8736387797161359893
// 3c: lload 2
// 3d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: getstatic su/catlean/nf.U Ljava/util/List;
// 45: invokeinterface java/util/List.clear ()V 1
// 4a: astore 11
// 4c: getstatic su/catlean/nf.U Ljava/util/List;
// 4f: aload 0
// 50: iload 6
// 52: i2c
// 53: iload 7
// 55: iload 8
// 57: invokespecial su/catlean/nf.T (CII)Ljava/util/List;
// 5a: checkcast java/util/Collection
// 5d: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
// 62: pop
// 63: aload 11
// 65: ifnull ae
// 68: lload 4
// 6a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6d: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 70: dup
// 71: ifnull ad
// 74: goto 81
// 77: ldc2_w -8706484443115834833
// 7a: lload 2
// 7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80: athrow
// 81: lload 9
// 83: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 86: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
// 89: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
// 8c: dup
// 8d: ifnull ad
// 90: goto 9d
// 93: ldc2_w -8706484443115834833
// 96: lload 2
// 97: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c: athrow
// 9d: invokevirtual net/minecraft/class_640.method_2959 ()I
// a0: goto af
// a3: ldc2_w -8706484443115834833
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: pop
// ae: bipush 0
// af: putstatic su/catlean/nf.k I
// b2: return
}

@Flow
private final void W(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nf.a J
// 003: ldc2_w 132080574745306
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 85795813404068
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 139783926210477
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 121643897529218
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -1147727180516641989
// 022: lload 2
// 023: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 10
// 02a: aload 10
// 02c: ifnull 1ca
// 02f: aload 1
// 030: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 033: instanceof net/minecraft/class_2761
// 036: ifeq 1c4
// 039: goto 046
// 03c: ldc2_w -1009875973614549761
// 03f: lload 2
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: getstatic su/catlean/nf.H J
// 049: aload 10
// 04b: ifnull 1c1
// 04e: goto 05b
// 051: ldc2_w -1009875973614549761
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: lconst_0
// 05c: lcmp
// 05d: ifeq 1be
// 060: goto 06d
// 063: ldc2_w -1009875973614549761
// 066: lload 2
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: invokestatic su/catlean/zf.A ()J
// 070: getstatic su/catlean/nf.H J
// 073: lsub
// 074: aload 10
// 076: ifnull 0ec
// 079: goto 086
// 07c: ldc2_w -1009875973614549761
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: putstatic su/catlean/nf.s J
// 089: lload 4
// 08b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 091: ifnull 0e9
// 094: goto 0a1
// 097: ldc2_w -1009875973614549761
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: lload 8
// 0a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a6: getfield net/minecraft/class_746.field_6012 I
// 0a9: aload 10
// 0ab: ifnull 100
// 0ae: goto 0bb
// 0b1: ldc2_w -1009875973614549761
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: sipush 10831
// 0be: ldc2_w 6121653444700619530
// 0c1: lload 2
// 0c2: lxor
// 0c3: invokedynamic p (IJ)I bsm=su/catlean/nf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: if_icmpge 0e9
// 0cb: goto 0d8
// 0ce: ldc2_w -1009875973614549761
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 0db: invokevirtual kotlin/collections/ArrayDeque.clear ()V
// 0de: return
// 0df: ldc2_w -1009875973614549761
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: getstatic su/catlean/nf.s J
// 0ec: aload 10
// 0ee: ifnull 1c1
// 0f1: lconst_0
// 0f2: lcmp
// 0f3: goto 100
// 0f6: ldc2_w -1009875973614549761
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: ifle 1be
// 103: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 106: aload 10
// 108: ifnull 14b
// 10b: goto 118
// 10e: ldc2_w -1009875973614549761
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: invokevirtual kotlin/collections/ArrayDeque.size ()I
// 11b: sipush 22000
// 11e: ldc2_w 1177413552060087479
// 121: lload 2
// 122: lxor
// 123: invokedynamic p (IJ)I bsm=su/catlean/nf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: if_icmplt 14c
// 12b: goto 138
// 12e: ldc2_w -1009875973614549761
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 13b: invokevirtual kotlin/collections/ArrayDeque.removeFirst ()Ljava/lang/Object;
// 13e: goto 14b
// 141: ldc2_w -1009875973614549761
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: pop
// 14c: ldc 20.0
// 14e: aload 0
// 14f: lload 6
// 151: invokevirtual su/catlean/nf.g (J)F
// 154: fmul
// 155: fstore 11
// 157: fload 11
// 159: aload 10
// 15b: ifnull 1bb
// 15e: invokestatic java/lang/Float.isNaN (F)Z
// 161: ifne 1b1
// 164: goto 171
// 167: ldc2_w -1009875973614549761
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: fload 11
// 173: aload 10
// 175: ifnull 1bb
// 178: goto 185
// 17b: ldc2_w -1009875973614549761
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: invokestatic java/lang/Float.isInfinite (F)Z
// 188: ifne 1b1
// 18b: goto 198
// 18e: ldc2_w -1009875973614549761
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 19b: fload 11
// 19d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 1a0: invokevirtual kotlin/collections/ArrayDeque.add (Ljava/lang/Object;)Z
// 1a3: pop
// 1a4: goto 1b1
// 1a7: ldc2_w -1009875973614549761
// 1aa: lload 2
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 1b4: checkcast java/lang/Iterable
// 1b7: invokestatic kotlin/collections/CollectionsKt.averageOfFloat (Ljava/lang/Iterable;)D
// 1ba: d2f
// 1bb: putstatic su/catlean/nf.W F
// 1be: invokestatic su/catlean/zf.A ()J
// 1c1: putstatic su/catlean/nf.H J
// 1c4: invokestatic su/catlean/zf.A ()J
// 1c7: putstatic su/catlean/nf.B J
// 1ca: return
}

public final int z(int a, short a, short a, @NotNull class_1657 pl) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/nf.a J
// 1a: lxor
// 1b: lstore 5
// 1d: lload 5
// 1f: dup2
// 20: ldc2_w 79914982124087
// 23: lxor
// 24: lstore 7
// 26: dup2
// 27: ldc2_w 114397018661905
// 2a: lxor
// 2b: lstore 9
// 2d: dup2
// 2e: ldc2_w 12344601686351
// 31: lxor
// 32: lstore 11
// 34: pop2
// 35: ldc2_w -612082057340078936
// 38: lload 5
// 3a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: aload 4
// 41: sipush 10345
// 44: ldc2_w 8452311947954411093
// 47: lload 5
// 49: lxor
// 4a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/nf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 52: astore 13
// 54: aload 4
// 56: lload 9
// 58: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5e: aload 13
// 60: ifnull 8a
// 63: ifeq bb
// 66: goto 74
// 69: ldc2_w -689273332865645716
// 6c: lload 5
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: getstatic su/catlean/qo.e Lsu/catlean/qo;
// 77: lload 11
// 79: invokevirtual su/catlean/qo.f (J)Z
// 7c: goto 8a
// 7f: ldc2_w -689273332865645716
// 82: lload 5
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: aload 13
// 8c: ifnull b4
// 8f: ifeq b7
// 92: goto a0
// 95: ldc2_w -689273332865645716
// 98: lload 5
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: getstatic su/catlean/qo.e Lsu/catlean/qo;
// a3: invokevirtual su/catlean/qo.j ()I
// a6: goto b4
// a9: ldc2_w -689273332865645716
// ac: lload 5
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: goto ba
// b7: getstatic su/catlean/nf.k I
// ba: ireturn
// bb: iload 3
// bc: ifle d8
// bf: lload 7
// c1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// c4: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// c7: dup
// c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// cb: aload 4
// cd: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
// d0: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
// d3: dup
// d4: ifnonnull e5
// d7: pop
// d8: bipush 0
// d9: ireturn
// da: ldc2_w -689273332865645716
// dd: lload 5
// df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4: athrow
// e5: astore 14
// e7: aload 14
// e9: invokevirtual net/minecraft/class_640.method_2959 ()I
// ec: ireturn
}

public final boolean H(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nf.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 101631253104651
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -7656851242236717420
// 11: lload 1
// 12: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: aload 5
// 1b: ifnull 85
// 1e: lload 3
// 1f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 22: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 25: dup
// 26: ifnull 84
// 29: goto 36
// 2c: ldc2_w -7758821113202302640
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: invokevirtual net/minecraft/class_638.method_27983 ()Lnet/minecraft/class_5321;
// 39: dup
// 3a: ifnull 84
// 3d: goto 4a
// 40: ldc2_w -7758821113202302640
// 43: lload 1
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 4d: dup
// 4e: ifnull 84
// 51: goto 5e
// 54: ldc2_w -7758821113202302640
// 57: lload 1
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
// 61: dup
// 62: aload 5
// 64: ifnull 94
// 67: goto 74
// 6a: ldc2_w -7758821113202302640
// 6d: lload 1
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: ifnonnull 87
// 77: goto 84
// 7a: ldc2_w -7758821113202302640
// 7d: lload 1
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: pop
// 85: ldc ""
// 87: sipush 21326
// 8a: ldc2_w 4450203879404490572
// 8d: lload 1
// 8e: lxor
// 8f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/nf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: ireturn
}

private final List T(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 65873645571929L;
String var10000 = vm.a<"Å">(-7303659724952708723L, var4);
List var9 = new ArrayList();
String var8 = var10000;

for (class_2818 var11 : this.O(var6)) {
do {
try {
if (var3 >= 0) {
if (var8 == null) {
return var9;
}

var9.addAll(var11.method_12214().values());
}

if (var8 != null) {
break;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -7256856733155086775L, var4);
}
} while (var3 <= 0);
break;
}

return var9;
}

@NotNull
public final List O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nf.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 28589119009404
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 62341111825149
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 64484202675290
// 018: lxor
// 019: lstore 7
// 01b: pop2
// 01c: ldc2_w -5779771771136906013
// 01f: lload 1
// 020: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 025: new java/util/ArrayList
// 028: dup
// 029: invokespecial java/util/ArrayList.<init> ()V
// 02c: checkcast java/util/List
// 02f: astore 10
// 031: lload 3
// 032: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 035: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 038: invokevirtual net/minecraft/class_315.method_42503 ()Lnet/minecraft/class_7172;
// 03b: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 03e: dup
// 03f: sipush 5102
// 042: ldc2_w 7071844348920411544
// 045: lload 1
// 046: lxor
// 047: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/nf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 04f: checkcast java/lang/Number
// 052: invokevirtual java/lang/Number.intValue ()I
// 055: istore 11
// 057: astore 9
// 059: iload 11
// 05b: ineg
// 05c: istore 12
// 05e: iload 12
// 060: aload 9
// 062: ifnull 087
// 065: iload 11
// 067: if_icmpgt 16a
// 06a: goto 077
// 06d: ldc2_w -5898476222577140953
// 070: lload 1
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: iload 11
// 079: ineg
// 07a: goto 087
// 07d: ldc2_w -5898476222577140953
// 080: lload 1
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: istore 13
// 089: iload 13
// 08b: lload 1
// 08c: lconst_0
// 08d: lcmp
// 08e: ifle 14a
// 091: iload 11
// 093: if_icmpgt 148
// 096: aload 9
// 098: ifnull 16a
// 09b: goto 0a8
// 09e: ldc2_w -5898476222577140953
// 0a1: lload 1
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: lload 5
// 0aa: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ad: invokevirtual net/minecraft/class_638.method_2935 ()Lnet/minecraft/class_631;
// 0b0: lload 7
// 0b2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b5: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0b8: d2i
// 0b9: sipush 20653
// 0bc: ldc2_w 6490836036694107699
// 0bf: lload 1
// 0c0: lxor
// 0c1: invokedynamic p (IJ)I bsm=su/catlean/nf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: idiv
// 0c7: iload 12
// 0c9: iadd
// 0ca: lload 7
// 0cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cf: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0d2: d2i
// 0d3: sipush 17230
// 0d6: ldc2_w 182055521122121170
// 0d9: lload 1
// 0da: lxor
// 0db: invokedynamic p (IJ)I bsm=su/catlean/nf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: idiv
// 0e1: iload 13
// 0e3: iadd
// 0e4: invokevirtual net/minecraft/class_631.method_21730 (II)Lnet/minecraft/class_2818;
// 0e7: dup
// 0e8: ifnull 10c
// 0eb: astore 14
// 0ed: bipush 0
// 0ee: istore 15
// 0f0: aload 10
// 0f2: aload 14
// 0f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0f9: pop
// 0fa: aload 9
// 0fc: ifnull 10d
// 0ff: goto 10e
// 102: ldc2_w -5898476222577140953
// 105: lload 1
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: pop
// 10d: nop
// 10e: iload 13
// 110: iload 11
// 112: lload 1
// 113: lconst_0
// 114: lcmp
// 115: iflt 14c
// 118: aload 9
// 11a: ifnull 14c
// 11d: if_icmpeq 148
// 120: goto 12d
// 123: ldc2_w -5898476222577140953
// 126: lload 1
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: iinc 13 1
// 130: aload 9
// 132: ifnonnull 096
// 135: lload 1
// 136: lconst_0
// 137: lcmp
// 138: iflt 0a8
// 13b: goto 148
// 13e: ldc2_w -5898476222577140953
// 141: lload 1
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: iload 12
// 14a: iload 11
// 14c: if_icmpeq 16a
// 14f: iinc 12 1
// 152: aload 9
// 154: ifnonnull 077
// 157: lload 1
// 158: lconst_0
// 159: lcmp
// 15a: ifle 089
// 15d: goto 16a
// 160: ldc2_w -5898476222577140953
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: aload 10
// 16c: areturn
}

@NotNull
public final List C(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nf.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 110116629669070
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 75329686104808
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w -5082208736536298927
// 018: lload 1
// 019: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: new java/util/ArrayList
// 021: dup
// 022: invokespecial java/util/ArrayList.<init> ()V
// 025: checkcast java/util/List
// 028: astore 8
// 02a: lload 3
// 02b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 031: invokevirtual net/minecraft/class_315.method_42503 ()Lnet/minecraft/class_7172;
// 034: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 037: checkcast java/lang/Number
// 03a: invokevirtual java/lang/Number.intValue ()I
// 03d: bipush 2
// 03e: iadd
// 03f: istore 9
// 041: lload 5
// 043: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 046: invokevirtual net/minecraft/class_746.method_23317 ()D
// 049: d2i
// 04a: bipush 4
// 04b: ishr
// 04c: istore 10
// 04e: astore 7
// 050: lload 5
// 052: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 055: invokevirtual net/minecraft/class_746.method_23321 ()D
// 058: d2i
// 059: bipush 4
// 05a: ishr
// 05b: istore 11
// 05d: iload 9
// 05f: ineg
// 060: istore 12
// 062: iload 12
// 064: aload 7
// 066: ifnull 08b
// 069: iload 9
// 06b: if_icmpgt 11b
// 06e: goto 07b
// 071: ldc2_w -5145898008786530923
// 074: lload 1
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: iload 9
// 07d: ineg
// 07e: goto 08b
// 081: ldc2_w -5145898008786530923
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: istore 13
// 08d: iload 13
// 08f: lload 1
// 090: lconst_0
// 091: lcmp
// 092: iflt 0fb
// 095: iload 9
// 097: if_icmpgt 0f9
// 09a: aload 8
// 09c: new net/minecraft/class_1923
// 09f: dup
// 0a0: iload 10
// 0a2: iload 12
// 0a4: iadd
// 0a5: iload 11
// 0a7: iload 13
// 0a9: iadd
// 0aa: invokespecial net/minecraft/class_1923.<init> (II)V
// 0ad: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0b2: pop
// 0b3: iload 13
// 0b5: iload 9
// 0b7: aload 7
// 0b9: ifnull 0fd
// 0bc: goto 0c9
// 0bf: ldc2_w -5145898008786530923
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: if_icmpeq 0f9
// 0cc: iinc 13 1
// 0cf: aload 7
// 0d1: ifnull 11b
// 0d4: goto 0e1
// 0d7: ldc2_w -5145898008786530923
// 0da: lload 1
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 7
// 0e3: ifnonnull 09a
// 0e6: lload 1
// 0e7: lconst_0
// 0e8: lcmp
// 0e9: iflt 0f9
// 0ec: goto 0f9
// 0ef: ldc2_w -5145898008786530923
// 0f2: lload 1
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: iload 12
// 0fb: iload 9
// 0fd: if_icmpeq 11b
// 100: iinc 12 1
// 103: aload 7
// 105: ifnonnull 07b
// 108: lload 1
// 109: lconst_0
// 10a: lcmp
// 10b: ifle 08d
// 10e: goto 11b
// 111: ldc2_w -5145898008786530923
// 114: lload 1
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: aload 8
// 11d: areturn
}

public final boolean w(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nf.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 5493885607370821399
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: getstatic su/catlean/nf.w Lkotlin/collections/ArrayDeque;
// 13: invokevirtual kotlin/collections/ArrayDeque.size ()I
// 16: aload 3
// 17: ifnull 45
// 1a: sipush 22000
// 1d: ldc2_w 1177485199450243227
// 20: lload 1
// 21: lxor
// 22: invokedynamic p (IJ)I bsm=su/catlean/nf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: if_icmpge 48
// 2a: goto 37
// 2d: ldc2_w 5607109941644392659
// 30: lload 1
// 31: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: athrow
// 37: bipush 1
// 38: goto 45
// 3b: ldc2_w 5607109941644392659
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: goto 49
// 48: bipush 0
// 49: ireturn
}

public final long S() {
return B - H;
}

static {
long var20 = a ^ 48061792740045L;
vm.a<"Å">("siVOoc", -2807353574008245787L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "åC\n¦\u008c·\u008f\u001e\u008bpJ\bµ%\u0018 \u0018\"\u009bn\u001f]\u0010oÆñ¿~wº\rV\u001e\u008f\u001dI}\u0011E:\u008f =Æ·\u0017Î\tSÇ¿¢èÑ 3\u0018\u009eÍ°å\u0085*\u0086töÐ\u0004\u0016zo|K\u0012";
int var17 = "åC\n¦\u008c·\u008f\u001e\u008bpJ\bµ%\u0018 \u0018\"\u009bn\u001f]\u0010oÆñ¿~wº\rV\u001e\u008f\u001dI}\u0011E:\u008f =Æ·\u0017Î\tSÇ¿¢èÑ 3\u0018\u009eÍ°å\u0085*\u0086töÐ\u0004\u0016zo|K\u0012"
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
c = new String[5];
g = new HashMap(13);
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
String var4 = "tx\u0007êòðrvI\u0013p§È1Wp";
int var5 = "tx\u0007êòðrvI\u0013p§È1Wp".length();
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
f = new Integer[4];
Z = new nf();
w = new ArrayDeque(b<"p">(22000, 1177498840944448672L ^ var20));
s = 1L;
U = new ArrayList();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "É\u0002\u0092\\\u0088K<V²ÝúÜfÄfÍ";
var5 = "É\u0002\u0092\\\u0088K<V²ÝúÜfÄfÍ".length();
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

var15 = "¸²\u0011\u0093dÇ)\u008dIu\u008fmw¶?ä(`Ðõ\u0000,;É\u0085ß8y\u0006\u0012%ìc[ø\u001ci#2ia¢dõU¿\u000bv\u0082\u001bÒ\u007f\u000f\u007f\u0080¯\u00ad";
var17 = "¸²\u0011\u0093dÇ)\u008dIu\u008fmw¶?ä(`Ðõ\u0000,;É\u0085ß8y\u0006\u0012%ìc[ø\u001ci#2ia¢dõU¿\u000bv\u0082\u001bÒ\u007f\u000f\u007f\u0080¯\u00ad"
.length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void n(String var0) {
X = var0;
}

public static String o() {
return X;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2369;
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
throw new RuntimeException("su/catlean/nf", var10);
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
throw new RuntimeException("su/catlean/nf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6568;
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
throw new RuntimeException("su/catlean/nf", var14);
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
throw new RuntimeException("su/catlean/nf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
