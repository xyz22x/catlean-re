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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e7 extends _g {
@NotNull
public static final e7 U;
static final KProperty[] C;
@NotNull
private static final cw O;
@NotNull
private static final cq L;
@NotNull
private static final cq o;
@NotNull
private static final cq W;
private static boolean m;
@NotNull
private static final bg x;
@NotNull
private static final bg X;
private static final long a = yz.a(1111780659855604800L, -2920809087298162523L, MethodHandles.lookup().lookupClass()).a(185081670462412L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private e7(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 132475309305367L;
super(b<"b">(29980, 9111532957054145103L ^ var1), jt.v(), null, 4, null, var3);
}

private final bh s(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 98861187870682L;
return (bh)O.E(this, var6, C[0]);
}

private final boolean I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76137543129118L;
return (Boolean)L.E(this, var3, C[1]);
}

private final boolean n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 93491009567446L;
return (Boolean)o.E(this, var3, C[2]);
}

private final boolean q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 52902343176829L;
return (Boolean)W.E(this, var3, C[3]);
}

@Override
public void b(long var1) {
m = false;
}

@Flow
private final void B(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e7.a J
// 003: ldc2_w 43443011126549
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 132331377509499
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 68906478134987
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 129208012857199
// 035: lxor
// 036: lstore 9
// 038: pop2
// 039: ldc2_w -8284461959623333084
// 03c: lload 2
// 03d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: astore 11
// 044: aload 1
// 045: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 048: instanceof net/minecraft/class_2767
// 04b: ifeq 120
// 04e: aload 0
// 04f: iload 6
// 051: iload 7
// 053: iload 8
// 055: invokespecial su/catlean/e7.s (III)Lsu/catlean/bh;
// 058: aload 11
// 05a: ifnull 099
// 05d: goto 06a
// 060: ldc2_w -8262681357251362033
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: getstatic su/catlean/bh.V1_12_2 Lsu/catlean/bh;
// 06d: if_acmpne 120
// 070: goto 07d
// 073: ldc2_w -8262681357251362033
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: aload 1
// 07e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 081: checkcast net/minecraft/class_2767
// 084: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 087: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 08c: goto 099
// 08f: ldc2_w -8262681357251362033
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: getstatic net/minecraft/class_3417.field_14660 Lnet/minecraft/class_3414;
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09f: ifeq 120
// 0a2: lload 9
// 0a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a7: getfield net/minecraft/class_746.field_7513 Lnet/minecraft/class_1536;
// 0aa: aload 11
// 0ac: ifnull 0e5
// 0af: goto 0bc
// 0b2: ldc2_w -8262681357251362033
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: ifnull 120
// 0bf: goto 0cc
// 0c2: ldc2_w -8262681357251362033
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: lload 9
// 0ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d1: getfield net/minecraft/class_746.field_7513 Lnet/minecraft/class_1536;
// 0d4: dup
// 0d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0d8: goto 0e5
// 0db: ldc2_w -8262681357251362033
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 1
// 0e6: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0e9: checkcast net/minecraft/class_2767
// 0ec: invokevirtual net/minecraft/class_2767.method_11890 ()D
// 0ef: aload 1
// 0f0: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0f3: checkcast net/minecraft/class_2767
// 0f6: invokevirtual net/minecraft/class_2767.method_11889 ()D
// 0f9: aload 1
// 0fa: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0fd: checkcast net/minecraft/class_2767
// 100: invokevirtual net/minecraft/class_2767.method_11893 ()D
// 103: invokevirtual net/minecraft/class_1536.method_5649 (DDD)D
// 106: ldc2_w 4.0
// 109: dcmpg
// 10a: ifge 120
// 10d: aload 0
// 10e: lload 4
// 110: invokespecial su/catlean/e7.H (J)V
// 113: goto 120
// 116: ldc2_w -8262681357251362033
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: return
}

@Flow(
priority = -10
)
private final void c(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e7.a J
// 003: ldc2_w 123999534154823
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 128889787256925
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 4539220534098
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 83867862059959
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 94532728073375
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 80755936440366
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 13
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 14
// 045: pop2
// 046: dup2
// 047: ldc2_w 46878496886455
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 51810017428777
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 112930240584760
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 92171595261933
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 116478224787353
// 066: lxor
// 067: dup2
// 068: bipush 32
// 06a: lushr
// 06b: l2i
// 06c: istore 23
// 06e: dup2
// 06f: bipush 32
// 071: lshl
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 24
// 078: dup2
// 079: bipush 48
// 07b: lshl
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 25
// 082: pop2
// 083: dup2
// 084: ldc2_w 111058335330965
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 38240990387773
// 08e: lxor
// 08f: lstore 28
// 091: pop2
// 092: ldc2_w 888892451588844150
// 095: lload 2
// 096: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: astore 30
// 09d: lload 28
// 09f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a2: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0a5: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0a8: instanceof net/minecraft/class_1787
// 0ab: aload 30
// 0ad: ifnull 213
// 0b0: ifeq 1fe
// 0b3: goto 0c0
// 0b6: ldc2_w 866758560117867101
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: lload 28
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0c8: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 0cb: aload 30
// 0cd: ifnull 213
// 0d0: goto 0dd
// 0d3: ldc2_w 866758560117867101
// 0d6: lload 2
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: sipush 16421
// 0e0: ldc2_w 6382955812833813742
// 0e3: lload 2
// 0e4: lxor
// 0e5: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: if_icmple 1fe
// 0ed: goto 0fa
// 0f0: ldc2_w 866758560117867101
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: aload 0
// 0fb: lload 4
// 0fd: invokespecial su/catlean/e7.I (J)Z
// 100: aload 30
// 102: ifnull 213
// 105: goto 112
// 108: ldc2_w 866758560117867101
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: ifeq 1fe
// 115: goto 122
// 118: ldc2_w 866758560117867101
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 0
// 123: aload 30
// 125: ifnull 1d6
// 128: goto 135
// 12b: ldc2_w 866758560117867101
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: lload 26
// 137: invokespecial su/catlean/e7.n (J)Z
// 13a: ifeq 1c8
// 13d: goto 14a
// 140: ldc2_w 866758560117867101
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: aload 0
// 14b: aload 30
// 14d: ifnull 1d6
// 150: goto 15d
// 153: ldc2_w 866758560117867101
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: lload 10
// 15f: invokespecial su/catlean/e7.V (J)I
// 162: bipush -1
// 163: if_icmpeq 1c8
// 166: goto 173
// 169: ldc2_w 866758560117867101
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 0
// 174: checkcast su/catlean/_g
// 177: iload 12
// 179: aload 0
// 17a: checkcast su/catlean/_g
// 17d: sipush 13984
// 180: ldc2_w 4972684733970686566
// 183: lload 2
// 184: lxor
// 185: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/e7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: bipush 0
// 18b: anewarray 614
// 18e: iload 13
// 190: i2c
// 191: bipush 0
// 192: bipush 4
// 193: aconst_null
// 194: iload 14
// 196: i2s
// 197: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 19a: bipush 0
// 19b: bipush 2
// 19c: aconst_null
// 19d: lload 6
// 19f: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1a2: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1a5: aload 0
// 1a6: lload 10
// 1a8: invokespecial su/catlean/e7.V (J)I
// 1ab: lload 8
// 1ad: invokevirtual su/catlean/gg.f (IJ)V
// 1b0: getstatic su/catlean/e7.X Lsu/catlean/bg;
// 1b3: invokevirtual su/catlean/bg.l ()V
// 1b6: aload 30
// 1b8: ifnonnull 1fe
// 1bb: goto 1c8
// 1be: ldc2_w 866758560117867101
// 1c1: lload 2
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: aload 0
// 1c9: goto 1d6
// 1cc: ldc2_w 866758560117867101
// 1cf: lload 2
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: iload 12
// 1d8: aload 0
// 1d9: checkcast su/catlean/_g
// 1dc: sipush 5869
// 1df: ldc2_w 7961263859598557742
// 1e2: lload 2
// 1e3: lxor
// 1e4: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/e7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: bipush 0
// 1ea: anewarray 614
// 1ed: iload 13
// 1ef: i2c
// 1f0: bipush 0
// 1f1: bipush 4
// 1f2: aconst_null
// 1f3: iload 14
// 1f5: i2s
// 1f6: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 1f9: lload 19
// 1fb: invokevirtual su/catlean/e7.F (Ljava/lang/String;J)V
// 1fe: getstatic su/catlean/e7.X Lsu/catlean/bg;
// 201: sipush 30950
// 204: ldc2_w 5361229768972164132
// 207: lload 2
// 208: lxor
// 209: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: lload 21
// 210: invokevirtual su/catlean/bg.c (IJ)Z
// 213: aload 30
// 215: ifnull 23e
// 218: ifne 229
// 21b: goto 228
// 21e: ldc2_w 866758560117867101
// 221: lload 2
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: return
// 229: getstatic su/catlean/e7.x Lsu/catlean/bg;
// 22c: sipush 30124
// 22f: ldc2_w 8802499608048652649
// 232: lload 2
// 233: lxor
// 234: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: lload 21
// 23b: invokevirtual su/catlean/bg.c (IJ)Z
// 23e: aload 30
// 240: ifnull 280
// 243: ifeq 2c0
// 246: goto 253
// 249: ldc2_w 866758560117867101
// 24c: lload 2
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: lload 28
// 255: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 258: aload 30
// 25a: ifnull 2c5
// 25d: goto 26a
// 260: ldc2_w 866758560117867101
// 263: lload 2
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 26d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 270: instanceof net/minecraft/class_1787
// 273: goto 280
// 276: ldc2_w 866758560117867101
// 279: lload 2
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: ifeq 2c0
// 283: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 286: fconst_0
// 287: lload 15
// 289: fconst_0
// 28a: sipush 29772
// 28d: ldc2_w 8492266379967844491
// 290: lload 2
// 291: lxor
// 292: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 297: aconst_null
// 298: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 29b: pop
// 29c: lload 28
// 29e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a1: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2a4: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 2a7: getstatic su/catlean/e7.x Lsu/catlean/bg;
// 2aa: invokevirtual su/catlean/bg.l ()V
// 2ad: getstatic su/catlean/e7.X Lsu/catlean/bg;
// 2b0: invokevirtual su/catlean/bg.l ()V
// 2b3: goto 2c0
// 2b6: ldc2_w 866758560117867101
// 2b9: lload 2
// 2ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bf: athrow
// 2c0: lload 28
// 2c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c5: getfield net/minecraft/class_746.field_7513 Lnet/minecraft/class_1536;
// 2c8: ifnull 3b5
// 2cb: aload 0
// 2cc: iload 23
// 2ce: iload 24
// 2d0: iload 25
// 2d2: invokespecial su/catlean/e7.s (III)Lsu/catlean/bh;
// 2d5: getstatic su/catlean/bh.V1_17 Lsu/catlean/bh;
// 2d8: aload 30
// 2da: ifnull 31d
// 2dd: goto 2ea
// 2e0: ldc2_w 866758560117867101
// 2e3: lload 2
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: if_acmpne 3b5
// 2ed: goto 2fa
// 2f0: ldc2_w 866758560117867101
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: lload 28
// 2fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ff: getfield net/minecraft/class_746.field_7513 Lnet/minecraft/class_1536;
// 302: dup
// 303: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 306: invokevirtual net/minecraft/class_1536.method_5841 ()Lnet/minecraft/class_2945;
// 309: getstatic net/minecraft/class_1536.field_23234 Lnet/minecraft/class_2940;
// 30c: invokevirtual net/minecraft/class_2945.method_12789 (Lnet/minecraft/class_2940;)Ljava/lang/Object;
// 30f: dup
// 310: goto 31d
// 313: ldc2_w 866758560117867101
// 316: lload 2
// 317: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31c: athrow
// 31d: sipush 19515
// 320: ldc2_w 1200751726277810425
// 323: lload 2
// 324: lxor
// 325: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/e7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32d: checkcast java/lang/Boolean
// 330: invokevirtual java/lang/Boolean.booleanValue ()Z
// 333: istore 31
// 335: getstatic su/catlean/e7.m Z
// 338: aload 30
// 33a: ifnull 39c
// 33d: ifne 38d
// 340: goto 34d
// 343: ldc2_w 866758560117867101
// 346: lload 2
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: iload 31
// 34f: aload 30
// 351: ifnull 39c
// 354: goto 361
// 357: ldc2_w 866758560117867101
// 35a: lload 2
// 35b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 360: athrow
// 361: ifeq 38d
// 364: goto 371
// 367: ldc2_w 866758560117867101
// 36a: lload 2
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: aload 0
// 372: lload 17
// 374: invokespecial su/catlean/e7.H (J)V
// 377: bipush 1
// 378: putstatic su/catlean/e7.m Z
// 37b: aload 30
// 37d: ifnonnull 3b5
// 380: goto 38d
// 383: ldc2_w 866758560117867101
// 386: lload 2
// 387: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38c: athrow
// 38d: iload 31
// 38f: goto 39c
// 392: ldc2_w 866758560117867101
// 395: lload 2
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: aload 30
// 39e: ifnull 3b2
// 3a1: ifne 3b5
// 3a4: goto 3b1
// 3a7: ldc2_w 866758560117867101
// 3aa: lload 2
// 3ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b0: athrow
// 3b1: bipush 0
// 3b2: putstatic su/catlean/e7.m Z
// 3b5: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 117413661917835L;
long var5 = var1 ^ 70852669273602L;
long var7 = var1 ^ 108491194634753L;
String[] var9 = vm.a<"Å">(-4581926009179118006L, var1);

label35: {
label40: {
try {
if (var9 == null) {
break label35;
}

if (!this.q(var5)) {
break label40;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -4595052353951822239L, var1);
}

int var10 = (int)(Random.Default.nextDouble() * 150.0 + 200.0);
bo var11 = bo.S;
boolean var13 = false;
var11.Y().execute(new yy(var10));
var11 = bo.S;
int var12 = var10 * 2;
var13 = false;

try {
var11.Y().execute(new w5(var12));
if (var1 < 0L) {
break label35;
}

if (var9 != null) {
return;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -4595052353951822239L, var1);
}
}

try {
ag.K(class_1268.field_5808, 0.0F, var3, 0.0F, c<"j">(14004, 6694626808057192012L ^ var1), null);
zf.v(var7).method_6104(class_1268.field_5808);
ag.K(class_1268.field_5808, 0.0F, var3, 0.0F, c<"j">(14004, 6694626808057192012L ^ var1), null);
zf.v(var7).method_6104(class_1268.field_5808);
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -4595052353951822239L, var1);
}
}

x.l();
}

private final int V(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/e7.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 26701729659831
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -6206030144364933124
// 11: lload 1
// 12: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: bipush 0
// 18: istore 6
// 1a: astore 5
// 1c: iload 6
// 1e: sipush 3982
// 21: ldc2_w 580850539653336770
// 24: lload 1
// 25: lxor
// 26: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b: if_icmpge cc
// 2e: lload 3
// 2f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 35: iload 6
// 37: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 3a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 3d: getstatic net/minecraft/class_1802.field_8378 Lnet/minecraft/class_1792;
// 40: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 43: aload 5
// 45: lload 1
// 46: lconst_0
// 47: lcmp
// 48: iflt 50
// 4b: ifnull d3
// 4e: aload 5
// 50: lload 1
// 51: lconst_0
// 52: lcmp
// 53: iflt 94
// 56: ifnull 92
// 59: goto 66
// 5c: ldc2_w -6229214003317217321
// 5f: lload 1
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: ifeq c4
// 69: goto 76
// 6c: ldc2_w -6229214003317217321
// 6f: lload 1
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: lload 3
// 77: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 7d: iload 6
// 7f: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 82: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 85: goto 92
// 88: ldc2_w -6229214003317217321
// 8b: lload 1
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: aload 5
// 94: ifnull c3
// 97: sipush 32295
// 9a: ldc2_w 6141686964672036718
// 9d: lload 1
// 9e: lxor
// 9f: invokedynamic j (IJ)I bsm=su/catlean/e7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: if_icmpge c4
// a7: goto b4
// aa: ldc2_w -6229214003317217321
// ad: lload 1
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: iload 6
// b6: goto c3
// b9: ldc2_w -6229214003317217321
// bc: lload 1
// bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c2: athrow
// c3: ireturn
// c4: iinc 6 1
// c7: aload 5
// c9: ifnonnull 1c
// cc: lload 1
// cd: lconst_0
// ce: lcmp
// cf: ifle 2e
// d2: bipush -1
// d3: ireturn
}

public static final bg M() {
return x;
}

static {
long var20 = a ^ 135709011017036L;
long var22 = var20 ^ 37538241971074L;
long var24 = var20 ^ 51668496364171L;
long var26 = var20 ^ 122611600328767L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[16];
int var16 = 0;
String var15 = "e\u009bpæÓ\u00972iAñ·Ó\u009c\u001fj\u0099¥þ\u0014\u0095\u000e-\u00adê\u0018ÄÂqË1a\u0082:\u0088MJ·°\u0002¨ÙSïÃ\u0001¤®9Æ \u0080!õ\u0011z\u0087¸\\J?\u0081^L½°]°RÀïhÎuf/\u0018\u0089\u000eõÌM³ \u008f\u0095úsÌ>¦\t¬ÓïñêK/f\u0002(P\"\u0099\f\u008dØ5ÝCXX\u007fM¾\u0018â\n0Ë´ÑAd\u009di\u0012@\u001e{¯Þu\u009b½pö\u009bXõ\u0010¬ïµøSâw\u0093èãõ´Î.ÅÑ\u0010\u008a>\u001a\u008c@a\u0013Ûó\u00ad¥«;Hö× ½ø\u0084ù\u008b\u0013\u0003EÞüo×®¢\u0003~\u0080\u0080?\u0088úV\u00116)\u0006º\fs±¡\u009f 9\u0019ìé©¯¯\u009f\u009daÕ^¢e¿ÚÏþLAXÙ\u009eåsôÂÖ\u009a]®í\u0010Â5¬\t\u008c\u000fõ\r\u000fÅ8Úo\u0096\u0015Ð <\u0087\u0095*\u0014\u0013ö,Lã\u0087°\u0094\u0015WäG\u0016Å\u0015\u0095#B\f\u0087\u0080´;X{ûß0\u0001\u0083õ½Ï5\u0088\u000e\u0098\u009cöö\u0001HÉV/3ÞÝ|¹b(\u0095²Hg\u0088À§ãj/ ZW\u000fr¿Ù\u0080ô\u001aij*¹ %©°\u0015\u001d&×úJX\u0007\fmé\u0019G6\u009eA<\u008e~+âü@:9æ.ïÁ ´ùÞ\u008cüÆ\u001aê4Ð®\b\u001fM\u009dê\u001dû\u0006\u000eo¢Ã\u0011\u009e¨z Æ¢ÿK";
int var17 = "e\u009bpæÓ\u00972iAñ·Ó\u009c\u001fj\u0099¥þ\u0014\u0095\u000e-\u00adê\u0018ÄÂqË1a\u0082:\u0088MJ·°\u0002¨ÙSïÃ\u0001¤®9Æ \u0080!õ\u0011z\u0087¸\\J?\u0081^L½°]°RÀïhÎuf/\u0018\u0089\u000eõÌM³ \u008f\u0095úsÌ>¦\t¬ÓïñêK/f\u0002(P\"\u0099\f\u008dØ5ÝCXX\u007fM¾\u0018â\n0Ë´ÑAd\u009di\u0012@\u001e{¯Þu\u009b½pö\u009bXõ\u0010¬ïµøSâw\u0093èãõ´Î.ÅÑ\u0010\u008a>\u001a\u008c@a\u0013Ûó\u00ad¥«;Hö× ½ø\u0084ù\u008b\u0013\u0003EÞüo×®¢\u0003~\u0080\u0080?\u0088úV\u00116)\u0006º\fs±¡\u009f 9\u0019ìé©¯¯\u009f\u009daÕ^¢e¿ÚÏþLAXÙ\u009eåsôÂÖ\u009a]®í\u0010Â5¬\t\u008c\u000fõ\r\u000fÅ8Úo\u0096\u0015Ð <\u0087\u0095*\u0014\u0013ö,Lã\u0087°\u0094\u0015WäG\u0016Å\u0015\u0095#B\f\u0087\u0080´;X{ûß0\u0001\u0083õ½Ï5\u0088\u000e\u0098\u009cöö\u0001HÉV/3ÞÝ|¹b(\u0095²Hg\u0088À§ãj/ ZW\u000fr¿Ù\u0080ô\u001aij*¹ %©°\u0015\u001d&×úJX\u0007\fmé\u0019G6\u009eA<\u008e~+âü@:9æ.ïÁ ´ùÞ\u008cüÆ\u001aê4Ð®\b\u001fM\u009dê\u001dû\u0006\u000eo¢Ã\u0011\u009e¨z Æ¢ÿK"
.length();
char var14 = 24;
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
c = new String[16];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "0c\nE)\u0097x\u00014É\u0099êkIXÌ%õ\n«\\\u0017\u0088#~\u0089Ky·\rü\u001f¯\u0017\u008aÐ5ÊÞ#góç\u0006,\u0011ö°.a\u0082½P\u0099òé";
int var5 = "0c\nE)\u0097x\u00014É\u0099êkIXÌ%õ\n«\\\u0017\u0088#~\u0089Ky·\rü\u001f¯\u0017\u008aÐ5ÊÞ#góç\u0006,\u0011ö°.a\u0082½P\u0099òé".length();
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
f = new Integer[9];
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(e7.class, b<"b">(3997, 7093520086559973979L ^ var20), b<"b">(2022, 5018638696042687017L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e7.class, b<"b">(6171, 2524024145832113625L ^ var20), b<"b">(26448, 6179269972934527646L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e7.class, b<"b">(22388, 4277825715558595249L ^ var20), b<"b">(15857, 3449207691735748666L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e7.class, b<"b">(20521, 3986254772183875043L ^ var20), b<"b">(3864, 947303632906773208L ^ var20), 0))
};
C = var28;
U = new e7(var22);
O = yp.L(U, b<"b">(17543, 4555945134298048836L ^ var20), bh.V1_17, null, null, c<"j">(17336, 1987981663842868850L ^ var20), null, var26);
L = yp.t(U, b<"b">(25157, 3429148670004105097L ^ var20), true, var24, null, null, c<"j">(3055, 2807962480269350436L ^ var20), null);
o = yp.t(U, b<"b">(29092, 2255827856428145763L ^ var20), false, var24, null, null, c<"j">(3055, 2807962480269350436L ^ var20), null);
W = yp.t(U, b<"b">(138, 6819057534104661323L ^ var20), true, var24, null, null, c<"j">(3055, 2807962480269350436L ^ var20), null);
x = new bg();
X = new bg();
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u0095(²»©ùß²H\u001cn£éÌ°\u0013";
var5 = "\u0095(²»©ùß²H\u001cn£éÌ°\u0013".length();
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

var15 = "ûöÅwß¿\u001cu¢3\u0095×¶,¢J ÿ\u009aßØ\u0014a\u0098®+`]Ü\u0097Ö\u001f\u0095¢\u0098ä\u009bS\u0018\u0086§\u008a%[±]9ÃÎ";
var17 = "ûöÅwß¿\u001cu¢3\u0095×¶,¢J ÿ\u009aßØ\u0014a\u0098®+`]Ü\u0097Ö\u001f\u0095¢\u0098ä\u009bS\u0018\u0086§\u008a%[±]9ÃÎ".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6557;
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
throw new RuntimeException("su/catlean/e7", var10);
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
throw new RuntimeException("su/catlean/e7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10641;
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
throw new RuntimeException("su/catlean/e7", var14);
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
throw new RuntimeException("su/catlean/e7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
