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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kw extends _g {
@NotNull
public static final kw D;
static final KProperty[] L;
@NotNull
private static final cw x;
@NotNull
private static final cs J;
private static final ThreadLocalRandom B;
@NotNull
private static final List j;
private static final long a = yz.a(2681422077177707976L, -6682528004809586270L, MethodHandles.lookup().lookupClass()).a(167340836421334L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private kw(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 65807763686084L;
super(b<"u">(12360, 2635419539481916208L ^ var4), jt.F(), null, 4, null, var6);
}

private final tz v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 137878420963638L;
return (tz)x.E(this, var3, L[0]);
}

private final Color P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 48250662282227L;
return (Color)J.E(this, var3, L[1]);
}

@Flow
private final void V(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kw.a J
// 003: ldc2_w 14512383480352
// 006: lxor
// 007: lstore 2
// 008: getstatic su/catlean/kw.j Ljava/util/List;
// 00b: checkcast java/lang/Iterable
// 00e: astore 5
// 010: bipush 0
// 011: istore 6
// 013: ldc2_w -2969425510284881151
// 016: lload 2
// 017: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01c: aload 5
// 01e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 023: astore 7
// 025: astore 4
// 027: aload 7
// 029: invokeinterface java/util/Iterator.hasNext ()Z 1
// 02e: ifeq 1c8
// 031: aload 7
// 033: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 038: astore 8
// 03a: aload 8
// 03c: checkcast su/catlean/xu
// 03f: astore 9
// 041: bipush 0
// 042: istore 10
// 044: aload 4
// 046: ifnonnull 1c9
// 049: aload 9
// 04b: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 04e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 053: astore 11
// 055: aload 11
// 057: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05c: ifeq 1c1
// 05f: aload 11
// 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 066: checkcast su/catlean/ti
// 069: astore 12
// 06b: aload 12
// 06d: invokevirtual su/catlean/ti.B ()I
// 070: istore 13
// 072: aload 12
// 074: iload 13
// 076: bipush 1
// 077: iadd
// 078: invokevirtual su/catlean/ti.O (I)V
// 07b: aload 12
// 07d: aload 12
// 07f: invokevirtual su/catlean/ti.b ()F
// 082: invokevirtual su/catlean/ti.P (F)V
// 085: aload 12
// 087: aload 12
// 089: invokevirtual su/catlean/ti.b ()F
// 08c: aload 12
// 08e: invokevirtual su/catlean/ti.z ()F
// 091: fadd
// 092: invokevirtual su/catlean/ti.G (F)V
// 095: aload 12
// 097: aload 12
// 099: invokevirtual su/catlean/ti.O ()F
// 09c: invokevirtual su/catlean/ti.E (F)V
// 09f: aload 12
// 0a1: invokevirtual su/catlean/ti.G ()Z
// 0a4: aload 4
// 0a6: ifnonnull 02e
// 0a9: aload 4
// 0ab: ifnonnull 169
// 0ae: ifeq 148
// 0b1: goto 0be
// 0b4: ldc2_w -3018610743034295457
// 0b7: lload 2
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: aload 12
// 0c0: aload 12
// 0c2: invokevirtual su/catlean/ti.O ()F
// 0c5: ldc 0.2
// 0c7: fadd
// 0c8: invokevirtual su/catlean/ti.g (F)V
// 0cb: aload 12
// 0cd: invokevirtual su/catlean/ti.O ()F
// 0d0: fconst_1
// 0d1: fcmpl
// 0d2: aload 4
// 0d4: ifnonnull 1ae
// 0d7: goto 0e4
// 0da: ldc2_w -3018610743034295457
// 0dd: lload 2
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: iflt 197
// 0e7: goto 0f4
// 0ea: ldc2_w -3018610743034295457
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: aload 12
// 0f6: fconst_1
// 0f7: invokevirtual su/catlean/ti.g (F)V
// 0fa: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 0fd: sipush 19826
// 100: ldc2_w 1704593036450172244
// 103: lload 2
// 104: lxor
// 105: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: invokevirtual java/util/concurrent/ThreadLocalRandom.nextInt (I)I
// 10d: bipush 5
// 10e: aload 4
// 110: ifnonnull 1b3
// 113: goto 120
// 116: ldc2_w -3018610743034295457
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: if_icmpge 197
// 123: goto 130
// 126: ldc2_w -3018610743034295457
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: aload 12
// 132: bipush 0
// 133: invokevirtual su/catlean/ti.I (Z)V
// 136: aload 4
// 138: ifnull 197
// 13b: goto 148
// 13e: ldc2_w -3018610743034295457
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: aload 12
// 14a: aload 12
// 14c: invokevirtual su/catlean/ti.O ()F
// 14f: ldc 0.2
// 151: fsub
// 152: invokevirtual su/catlean/ti.g (F)V
// 155: aload 12
// 157: invokevirtual su/catlean/ti.O ()F
// 15a: fconst_0
// 15b: fcmpg
// 15c: goto 169
// 15f: ldc2_w -3018610743034295457
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 4
// 16b: ifnonnull 1ae
// 16e: ifgt 197
// 171: goto 17e
// 174: ldc2_w -3018610743034295457
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: aload 11
// 180: invokeinterface java/util/Iterator.remove ()V 1
// 185: aload 4
// 187: ifnull 055
// 18a: goto 197
// 18d: ldc2_w -3018610743034295457
// 190: lload 2
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: aload 12
// 199: aload 4
// 19b: ifnonnull 1b8
// 19e: invokevirtual su/catlean/ti.B ()I
// 1a1: goto 1ae
// 1a4: ldc2_w -3018610743034295457
// 1a7: lload 2
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: aload 12
// 1b0: invokevirtual su/catlean/ti.Z ()I
// 1b3: if_icmple 055
// 1b6: aload 12
// 1b8: bipush 0
// 1b9: invokevirtual su/catlean/ti.I (Z)V
// 1bc: aload 4
// 1be: ifnull 055
// 1c1: nop
// 1c2: nop
// 1c3: aload 4
// 1c5: ifnull 027
// 1c8: nop
// 1c9: return
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
// 000: getstatic su/catlean/kw.a J
// 003: ldc2_w 127378117131950
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 38486242764418
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 129180299236585
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
// 031: dup2
// 032: ldc2_w 123551400884262
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 67713658061885
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 1865111508483
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 19031826054509
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 64341925829041
// 051: lxor
// 052: dup2
// 053: bipush 48
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 16
// 05c: lshl
// 05d: bipush 32
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: dup2
// 064: bipush 48
// 066: lshl
// 067: bipush 48
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 140471732074993
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 86309175849884
// 079: lxor
// 07a: lstore 22
// 07c: dup2
// 07d: ldc2_w 27466351268185
// 080: lxor
// 081: lstore 24
// 083: dup2
// 084: ldc2_w 70649741727830
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 58310553808190
// 08e: lxor
// 08f: lstore 28
// 091: dup2
// 092: ldc2_w 45419498679708
// 095: lxor
// 096: lstore 30
// 098: dup2
// 099: ldc2_w 110854294201012
// 09c: lxor
// 09d: lstore 32
// 09f: dup2
// 0a0: ldc2_w 77693158078213
// 0a3: lxor
// 0a4: lstore 34
// 0a6: dup2
// 0a7: ldc2_w 82311214294189
// 0aa: lxor
// 0ab: lstore 36
// 0ad: dup2
// 0ae: ldc2_w 12234363186218
// 0b1: lxor
// 0b2: lstore 38
// 0b4: dup2
// 0b5: ldc2_w 32083287956315
// 0b8: lxor
// 0b9: dup2
// 0ba: bipush 16
// 0bc: lushr
// 0bd: lstore 40
// 0bf: dup2
// 0c0: bipush 48
// 0c2: lshl
// 0c3: bipush 48
// 0c5: lushr
// 0c6: l2i
// 0c7: istore 42
// 0c9: pop2
// 0ca: pop2
// 0cb: ldc2_w -413198873785876593
// 0ce: lload 2
// 0cf: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: lload 4
// 0d6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d9: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0dc: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 0df: dup
// 0e0: sipush 16285
// 0e3: ldc2_w 7118240317770929463
// 0e6: lload 2
// 0e7: lxor
// 0e8: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f0: astore 49
// 0f2: astore 48
// 0f4: aload 48
// 0f6: ifnonnull 134
// 0f9: lload 4
// 0fb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0fe: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 101: dup
// 102: ifnull 126
// 105: goto 112
// 108: ldc2_w -390190912659429423
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 115: dup
// 116: ifnonnull 135
// 119: goto 126
// 11c: ldc2_w -390190912659429423
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: pop
// 127: goto 134
// 12a: ldc2_w -390190912659429423
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: return
// 135: astore 50
// 137: aload 50
// 139: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 13e: astore 51
// 140: aload 51
// 142: invokeinterface java/util/Iterator.hasNext ()Z 1
// 147: ifeq 3f0
// 14a: aload 51
// 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 151: checkcast net/minecraft/class_742
// 154: astore 52
// 156: aload 52
// 158: aload 48
// 15a: ifnonnull 19e
// 15d: lload 4
// 15f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 162: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 165: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 168: aload 48
// 16a: ifnonnull 455
// 16d: goto 17a
// 170: ldc2_w -390190912659429423
// 173: lload 2
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: ifeq 19c
// 17d: goto 18a
// 180: ldc2_w -390190912659429423
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: aload 48
// 18c: ifnull 140
// 18f: goto 19c
// 192: ldc2_w -390190912659429423
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 52
// 19e: invokevirtual net/minecraft/class_742.method_6067 ()F
// 1a1: ldc 16.0
// 1a3: fdiv
// 1a4: fconst_0
// 1a5: fconst_1
// 1a6: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 1a9: fstore 53
// 1ab: sipush 3144
// 1ae: ldc2_w 6500988129492394211
// 1b1: lload 2
// 1b2: lxor
// 1b3: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: i2f
// 1b9: fload 53
// 1bb: fmul
// 1bc: f2i
// 1bd: istore 54
// 1bf: getstatic su/catlean/kw.j Ljava/util/List;
// 1c2: checkcast java/lang/Iterable
// 1c5: astore 56
// 1c7: bipush 0
// 1c8: istore 57
// 1ca: aload 56
// 1cc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1d1: astore 58
// 1d3: aload 58
// 1d5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1da: ifeq 221
// 1dd: aload 58
// 1df: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1e4: astore 59
// 1e6: aload 59
// 1e8: checkcast su/catlean/xu
// 1eb: astore 60
// 1ed: bipush 0
// 1ee: istore 61
// 1f0: aload 60
// 1f2: invokevirtual su/catlean/xu.q ()I
// 1f5: aload 48
// 1f7: ifnonnull 210
// 1fa: aload 52
// 1fc: invokevirtual net/minecraft/class_742.method_5628 ()I
// 1ff: if_icmpne 213
// 202: bipush 1
// 203: goto 210
// 206: ldc2_w -390190912659429423
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: goto 214
// 213: bipush 0
// 214: ifeq 1d3
// 217: aload 59
// 219: aload 48
// 21b: ifnonnull 1e8
// 21e: goto 222
// 221: aconst_null
// 222: checkcast su/catlean/xu
// 225: astore 55
// 227: aload 55
// 229: aload 48
// 22b: ifnonnull 2db
// 22e: ifnonnull 2d9
// 231: goto 23e
// 234: ldc2_w -390190912659429423
// 237: lload 2
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: new java/util/ArrayList
// 241: dup
// 242: invokespecial java/util/ArrayList.<init> ()V
// 245: checkcast java/util/List
// 248: astore 56
// 24a: bipush 0
// 24b: istore 57
// 24d: iload 57
// 24f: iload 54
// 251: if_icmpge 2af
// 254: iload 57
// 256: istore 58
// 258: bipush 0
// 259: istore 59
// 25b: aload 56
// 25d: checkcast java/util/Collection
// 260: new su/catlean/ti
// 263: dup
// 264: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 267: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 26a: ldc 360.0
// 26c: fmul
// 26d: fconst_0
// 26e: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 271: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 274: ldc 360.0
// 276: fmul
// 277: fconst_1
// 278: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 27b: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 27e: ldc 0.2
// 280: fmul
// 281: fadd
// 282: fconst_0
// 283: fconst_0
// 284: bipush 0
// 285: fconst_0
// 286: bipush 0
// 287: bipush 0
// 288: sipush 22733
// 28b: ldc2_w 4331326886552745057
// 28e: lload 2
// 28f: lxor
// 290: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: lload 34
// 297: aconst_null
// 298: invokespecial su/catlean/ti.<init> (FFFFFFZFIIIJLkotlin/jvm/internal/DefaultConstructorMarker;)V
// 29b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2a0: pop
// 2a1: nop
// 2a2: iinc 57 1
// 2a5: aload 48
// 2a7: ifnonnull 140
// 2aa: aload 48
// 2ac: ifnull 24d
// 2af: getstatic su/catlean/kw.j Ljava/util/List;
// 2b2: checkcast java/util/Collection
// 2b5: astore 57
// 2b7: new su/catlean/xu
// 2ba: dup
// 2bb: aload 52
// 2bd: invokevirtual net/minecraft/class_742.method_5628 ()I
// 2c0: iload 6
// 2c2: i2c
// 2c3: aload 56
// 2c5: iload 7
// 2c7: i2c
// 2c8: iload 8
// 2ca: invokespecial su/catlean/xu.<init> (ICLjava/util/List;CI)V
// 2cd: aload 57
// 2cf: swap
// 2d0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2d5: pop
// 2d6: goto 140
// 2d9: aload 55
// 2db: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 2de: invokeinterface java/util/List.size ()I 1
// 2e3: iload 54
// 2e5: aload 48
// 2e7: ifnonnull 359
// 2ea: if_icmpge 34d
// 2ed: goto 2fa
// 2f0: ldc2_w -390190912659429423
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: aload 55
// 2fc: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 2ff: checkcast java/util/Collection
// 302: astore 56
// 304: new su/catlean/ti
// 307: dup
// 308: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 30b: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 30e: ldc 360.0
// 310: fmul
// 311: fconst_0
// 312: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 315: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 318: ldc 360.0
// 31a: fmul
// 31b: fconst_1
// 31c: getstatic su/catlean/kw.B Ljava/util/concurrent/ThreadLocalRandom;
// 31f: invokevirtual java/util/concurrent/ThreadLocalRandom.nextFloat ()F
// 322: ldc 0.2
// 324: fmul
// 325: fadd
// 326: fconst_0
// 327: fconst_0
// 328: bipush 0
// 329: fconst_0
// 32a: bipush 0
// 32b: bipush 0
// 32c: sipush 5027
// 32f: ldc2_w 8968521101692141322
// 332: lload 2
// 333: lxor
// 334: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: lload 34
// 33b: aconst_null
// 33c: invokespecial su/catlean/ti.<init> (FFFFFFZFIIIJLkotlin/jvm/internal/DefaultConstructorMarker;)V
// 33f: aload 56
// 341: swap
// 342: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 347: pop
// 348: aload 48
// 34a: ifnull 140
// 34d: aload 55
// 34f: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 352: invokeinterface java/util/List.size ()I 1
// 357: iload 54
// 359: aload 48
// 35b: ifnonnull 37a
// 35e: if_icmple 140
// 361: goto 36e
// 364: ldc2_w -390190912659429423
// 367: lload 2
// 368: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: athrow
// 36e: aload 55
// 370: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 373: invokeinterface java/util/List.size ()I 1
// 378: iload 54
// 37a: isub
// 37b: istore 56
// 37d: bipush 0
// 37e: istore 57
// 380: aload 55
// 382: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 385: checkcast java/lang/Iterable
// 388: astore 58
// 38a: bipush 0
// 38b: istore 59
// 38d: aload 58
// 38f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 394: astore 60
// 396: aload 60
// 398: invokeinterface java/util/Iterator.hasNext ()Z 1
// 39d: ifeq 3ea
// 3a0: aload 60
// 3a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3a7: astore 61
// 3a9: aload 61
// 3ab: checkcast su/catlean/ti
// 3ae: astore 62
// 3b0: bipush 0
// 3b1: istore 63
// 3b3: aload 48
// 3b5: ifnonnull 3e5
// 3b8: iload 57
// 3ba: aload 48
// 3bc: ifnonnull 147
// 3bf: goto 3cc
// 3c2: ldc2_w -390190912659429423
// 3c5: lload 2
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: iload 56
// 3ce: if_icmpge 3e3
// 3d1: aload 62
// 3d3: aload 62
// 3d5: invokevirtual su/catlean/ti.B ()I
// 3d8: bipush 5
// 3d9: iadd
// 3da: invokevirtual su/catlean/ti.O (I)V
// 3dd: iload 57
// 3df: bipush 1
// 3e0: iadd
// 3e1: istore 57
// 3e3: nop
// 3e4: nop
// 3e5: aload 48
// 3e7: ifnull 396
// 3ea: nop
// 3eb: aload 48
// 3ed: ifnull 140
// 3f0: aload 1
// 3f1: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 3f4: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 3f7: aload 1
// 3f8: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 3fb: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 3fe: aload 49
// 400: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 403: fneg
// 404: ldc 180.0
// 406: fadd
// 407: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 40c: dup
// 40d: sipush 4775
// 410: ldc2_w 7007709755355281408
// 413: lload 2
// 414: lxor
// 415: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 41d: checkcast org/joml/Quaternionfc
// 420: lload 32
// 422: dup2_x1
// 423: pop2
// 424: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 427: aload 1
// 428: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 42b: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 42e: aload 49
// 430: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 433: fneg
// 434: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 439: dup
// 43a: sipush 195
// 43d: ldc2_w 265074322164197989
// 440: lload 2
// 441: lxor
// 442: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 44a: checkcast org/joml/Quaternionfc
// 44d: lload 32
// 44f: dup2_x1
// 450: pop2
// 451: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 454: bipush 0
// 455: istore 51
// 457: getstatic su/catlean/kw.j Ljava/util/List;
// 45a: checkcast java/lang/Iterable
// 45d: astore 52
// 45f: bipush 0
// 460: istore 53
// 462: aload 52
// 464: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 469: astore 54
// 46b: aload 54
// 46d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 472: ifeq 4af
// 475: aload 54
// 477: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 47c: astore 55
// 47e: aload 55
// 480: checkcast su/catlean/xu
// 483: astore 56
// 485: bipush 0
// 486: istore 57
// 488: iload 51
// 48a: aload 56
// 48c: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 48f: invokeinterface java/util/List.size ()I 1
// 494: iadd
// 495: istore 51
// 497: nop
// 498: aload 48
// 49a: ifnonnull 4b0
// 49d: aload 48
// 49f: ifnull 46b
// 4a2: goto 4af
// 4a5: ldc2_w -390190912659429423
// 4a8: lload 2
// 4a9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ae: athrow
// 4af: nop
// 4b0: new su/catlean/g7
// 4b3: dup
// 4b4: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 4b7: dup
// 4b8: sipush 9672
// 4bb: ldc2_w 5837254537049214819
// 4be: lload 2
// 4bf: lxor
// 4c0: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4c8: iload 51
// 4ca: bipush 0
// 4cb: bipush 4
// 4cc: aconst_null
// 4cd: astore 43
// 4cf: istore 44
// 4d1: istore 45
// 4d3: istore 46
// 4d5: astore 47
// 4d7: lload 20
// 4d9: aload 47
// 4db: iload 46
// 4dd: iload 45
// 4df: iload 44
// 4e1: aload 43
// 4e3: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4e6: astore 52
// 4e8: getstatic su/catlean/kw.j Ljava/util/List;
// 4eb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 4f0: astore 53
// 4f2: aload 53
// 4f4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4f9: ifeq 90c
// 4fc: aload 53
// 4fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 503: checkcast su/catlean/xu
// 506: astore 54
// 508: aload 48
// 50a: ifnonnull 95f
// 50d: aload 48
// 50f: ifnonnull 54b
// 512: goto 51f
// 515: ldc2_w -390190912659429423
// 518: lload 2
// 519: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51e: athrow
// 51f: lload 13
// 521: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 524: aload 54
// 526: invokevirtual su/catlean/xu.q ()I
// 529: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
// 52c: dup
// 52d: ifnonnull 54e
// 530: goto 53d
// 533: ldc2_w -390190912659429423
// 536: lload 2
// 537: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53c: athrow
// 53d: pop
// 53e: goto 54b
// 541: ldc2_w -390190912659429423
// 544: lload 2
// 545: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54a: athrow
// 54b: goto 4f2
// 54e: astore 55
// 550: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 553: aload 55
// 555: getfield net/minecraft/class_1297.field_6014 D
// 558: lload 38
// 55a: dup2_x2
// 55b: pop2
// 55c: aload 55
// 55e: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 561: invokevirtual su/catlean/jl.b (JDD)D
// 564: dstore 56
// 566: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 569: aload 55
// 56b: getfield net/minecraft/class_1297.field_6036 D
// 56e: lload 38
// 570: dup2_x2
// 571: pop2
// 572: aload 55
// 574: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 577: invokevirtual su/catlean/jl.b (JDD)D
// 57a: dconst_1
// 57b: dadd
// 57c: dstore 58
// 57e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 581: aload 55
// 583: getfield net/minecraft/class_1297.field_5969 D
// 586: lload 38
// 588: dup2_x2
// 589: pop2
// 58a: aload 55
// 58c: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 58f: invokevirtual su/catlean/jl.b (JDD)D
// 592: dstore 60
// 594: aload 54
// 596: invokevirtual su/catlean/xu.b ()Ljava/util/List;
// 599: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 59e: astore 62
// 5a0: aload 62
// 5a2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5a7: ifeq 4f2
// 5aa: aload 62
// 5ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5b1: checkcast su/catlean/ti
// 5b4: astore 63
// 5b6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5b9: aload 63
// 5bb: invokevirtual su/catlean/ti.I ()F
// 5be: aload 63
// 5c0: invokevirtual su/catlean/ti.b ()F
// 5c3: lload 36
// 5c5: invokevirtual su/catlean/jl.T (FFJ)F
// 5c8: f2d
// 5c9: invokestatic java/lang/Math.toRadians (D)D
// 5cc: dstore 64
// 5ce: aload 63
// 5d0: invokevirtual su/catlean/ti.A ()F
// 5d3: f2d
// 5d4: invokestatic java/lang/Math.toRadians (D)D
// 5d7: dstore 66
// 5d9: dload 56
// 5db: dload 64
// 5dd: invokestatic java/lang/Math.cos (D)D
// 5e0: aload 63
// 5e2: invokevirtual su/catlean/ti.E ()F
// 5e5: f2d
// 5e6: dmul
// 5e7: dload 66
// 5e9: invokestatic java/lang/Math.cos (D)D
// 5ec: dmul
// 5ed: dadd
// 5ee: dstore 68
// 5f0: dload 58
// 5f2: dload 66
// 5f4: invokestatic java/lang/Math.sin (D)D
// 5f7: aload 63
// 5f9: invokevirtual su/catlean/ti.E ()F
// 5fc: f2d
// 5fd: dmul
// 5fe: dadd
// 5ff: dstore 70
// 601: dload 60
// 603: dload 64
// 605: invokestatic java/lang/Math.sin (D)D
// 608: aload 63
// 60a: invokevirtual su/catlean/ti.E ()F
// 60d: f2d
// 60e: dmul
// 60f: dload 66
// 611: invokestatic java/lang/Math.cos (D)D
// 614: dmul
// 615: dadd
// 616: dstore 72
// 618: dload 68
// 61a: dload 56
// 61c: dsub
// 61d: dstore 74
// 61f: dload 70
// 621: dload 58
// 623: dsub
// 624: dstore 76
// 626: dload 72
// 628: dload 60
// 62a: dsub
// 62b: dstore 78
// 62d: dload 78
// 62f: dload 74
// 631: invokestatic java/lang/Math.atan2 (DD)D
// 634: invokestatic java/lang/Math.toDegrees (D)D
// 637: dneg
// 638: d2f
// 639: ldc 90.0
// 63b: fadd
// 63c: fstore 80
// 63e: dload 74
// 640: dload 74
// 642: dmul
// 643: dload 78
// 645: dload 78
// 647: dmul
// 648: dadd
// 649: invokestatic java/lang/Math.sqrt (D)D
// 64c: dstore 82
// 64e: dload 76
// 650: dload 82
// 652: invokestatic java/lang/Math.atan2 (DD)D
// 655: invokestatic java/lang/Math.toDegrees (D)D
// 658: d2f
// 659: fstore 81
// 65b: aload 0
// 65c: aload 48
// 65e: ifnonnull 6a5
// 661: lload 22
// 663: invokespecial su/catlean/kw.v (J)Lsu/catlean/tz;
// 666: getstatic su/catlean/lz.S [I
// 669: swap
// 66a: invokevirtual su/catlean/tz.ordinal ()I
// 66d: iaload
// 66e: aload 48
// 670: ifnonnull 4f9
// 673: goto 680
// 676: ldc2_w -390190912659429423
// 679: lload 2
// 67a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67f: athrow
// 680: tableswitch 161 1 5 36 45 63 92 127
// 6a4: aload 0
// 6a5: lload 24
// 6a7: invokespecial su/catlean/kw.P (J)Ljava/awt/Color;
// 6aa: goto 729
// 6ad: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6b0: aload 63
// 6b2: invokevirtual su/catlean/ti.B ()I
// 6b5: lload 9
// 6b7: dup2_x1
// 6b8: pop2
// 6b9: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 6bc: goto 729
// 6bf: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6c2: sipush 9101
// 6c5: ldc2_w 1164200739952152354
// 6c8: lload 2
// 6c9: lxor
// 6ca: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cf: aload 63
// 6d1: invokevirtual su/catlean/ti.B ()I
// 6d4: lload 11
// 6d6: invokevirtual su/catlean/jl.N (IIJ)Ljava/awt/Color;
// 6d9: goto 729
// 6dc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6df: sipush 16681
// 6e2: ldc2_w 4407839494071627143
// 6e5: lload 2
// 6e6: lxor
// 6e7: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ec: aload 63
// 6ee: invokevirtual su/catlean/ti.B ()I
// 6f1: lload 40
// 6f3: iload 42
// 6f5: i2c
// 6f6: ldc 0.6
// 6f8: fconst_1
// 6f9: invokevirtual su/catlean/jl.q (IIJCFF)Ljava/awt/Color;
// 6fc: goto 729
// 6ff: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 702: sipush 16681
// 705: ldc2_w 4407839494071627143
// 708: lload 2
// 709: lxor
// 70a: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70f: aload 63
// 711: invokevirtual su/catlean/ti.B ()I
// 714: lload 40
// 716: iload 42
// 718: i2c
// 719: fconst_1
// 71a: fconst_1
// 71b: invokevirtual su/catlean/jl.q (IIJCFF)Ljava/awt/Color;
// 71e: goto 729
// 721: new kotlin/NoWhenBranchMatchedException
// 724: dup
// 725: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 728: athrow
// 729: astore 82
// 72b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 72e: aload 63
// 730: invokevirtual su/catlean/ti.D ()F
// 733: aload 63
// 735: invokevirtual su/catlean/ti.O ()F
// 738: lload 36
// 73a: invokevirtual su/catlean/jl.T (FFJ)F
// 73d: fstore 83
// 73f: ldc 0.4
// 741: fload 83
// 743: fmul
// 744: fstore 84
// 746: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 749: aload 82
// 74b: iload 17
// 74d: i2c
// 74e: iload 18
// 750: fload 83
// 752: iload 19
// 754: i2s
// 755: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 758: astore 85
// 75a: new net/minecraft/class_4587
// 75d: dup
// 75e: invokespecial net/minecraft/class_4587.<init> ()V
// 761: astore 86
// 763: aload 86
// 765: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 768: aload 86
// 76a: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 76d: aload 49
// 76f: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 772: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 777: dup
// 778: sipush 195
// 77b: ldc2_w 265074322164197989
// 77e: lload 2
// 77f: lxor
// 780: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 785: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 788: checkcast org/joml/Quaternionfc
// 78b: lload 32
// 78d: dup2_x1
// 78e: pop2
// 78f: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 792: aload 86
// 794: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 797: aload 49
// 799: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 79c: ldc 180.0
// 79e: fadd
// 79f: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 7a4: dup
// 7a5: sipush 195
// 7a8: ldc2_w 265074322164197989
// 7ab: lload 2
// 7ac: lxor
// 7ad: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7b5: checkcast org/joml/Quaternionfc
// 7b8: lload 32
// 7ba: dup2_x1
// 7bb: pop2
// 7bc: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 7bf: aload 86
// 7c1: dload 68
// 7c3: aload 49
// 7c5: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 7c8: getfield net/minecraft/class_243.field_1352 D
// 7cb: dsub
// 7cc: dload 70
// 7ce: aload 49
// 7d0: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 7d3: getfield net/minecraft/class_243.field_1351 D
// 7d6: dsub
// 7d7: dload 72
// 7d9: aload 49
// 7db: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 7de: getfield net/minecraft/class_243.field_1350 D
// 7e1: dsub
// 7e2: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 7e5: aload 86
// 7e7: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 7ea: fload 80
// 7ec: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 7f1: dup
// 7f2: sipush 195
// 7f5: ldc2_w 265074322164197989
// 7f8: lload 2
// 7f9: lxor
// 7fa: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 802: checkcast org/joml/Quaternionfc
// 805: lload 32
// 807: dup2_x1
// 808: pop2
// 809: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 80c: aload 86
// 80e: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 811: fload 81
// 813: fneg
// 814: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 819: dup
// 81a: sipush 195
// 81d: ldc2_w 265074322164197989
// 820: lload 2
// 821: lxor
// 822: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 827: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 82a: checkcast org/joml/Quaternionfc
// 82d: lload 32
// 82f: dup2_x1
// 830: pop2
// 831: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 834: getstatic su/catlean/gi.HEART Lsu/catlean/gi;
// 837: astore 87
// 839: aload 86
// 83b: fload 84
// 83d: fneg
// 83e: f2d
// 83f: ldc2_w 2.0
// 842: ddiv
// 843: fload 84
// 845: fneg
// 846: f2d
// 847: ldc2_w 2.0
// 84a: ddiv
// 84b: dconst_0
// 84c: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 84f: aload 86
// 851: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 854: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 857: dup
// 858: sipush 9112
// 85b: ldc2_w 3396882316304517435
// 85e: lload 2
// 85f: lxor
// 860: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 865: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 868: astore 88
// 86a: aload 52
// 86c: aload 88
// 86e: fconst_0
// 86f: lload 28
// 871: fload 84
// 873: fconst_0
// 874: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 877: aload 87
// 879: invokevirtual su/catlean/gi.L ()F
// 87c: aload 87
// 87e: invokevirtual su/catlean/gi.v ()F
// 881: lload 15
// 883: dup2_x1
// 884: pop2
// 885: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 888: aload 85
// 88a: lload 26
// 88c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 88f: pop
// 890: aload 52
// 892: aload 88
// 894: fload 84
// 896: lload 28
// 898: fload 84
// 89a: fconst_0
// 89b: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 89e: aload 87
// 8a0: invokevirtual su/catlean/gi.o ()F
// 8a3: aload 87
// 8a5: invokevirtual su/catlean/gi.v ()F
// 8a8: lload 15
// 8aa: dup2_x1
// 8ab: pop2
// 8ac: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 8af: aload 85
// 8b1: lload 26
// 8b3: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 8b6: pop
// 8b7: aload 52
// 8b9: aload 88
// 8bb: fload 84
// 8bd: lload 28
// 8bf: fconst_0
// 8c0: fconst_0
// 8c1: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 8c4: aload 87
// 8c6: invokevirtual su/catlean/gi.o ()F
// 8c9: aload 87
// 8cb: invokevirtual su/catlean/gi.w ()F
// 8ce: lload 15
// 8d0: dup2_x1
// 8d1: pop2
// 8d2: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 8d5: aload 85
// 8d7: lload 26
// 8d9: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 8dc: pop
// 8dd: aload 52
// 8df: aload 88
// 8e1: fconst_0
// 8e2: lload 28
// 8e4: fconst_0
// 8e5: fconst_0
// 8e6: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 8e9: aload 87
// 8eb: invokevirtual su/catlean/gi.L ()F
// 8ee: aload 87
// 8f0: invokevirtual su/catlean/gi.w ()F
// 8f3: lload 15
// 8f5: dup2_x1
// 8f6: pop2
// 8f7: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 8fa: aload 85
// 8fc: lload 26
// 8fe: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 901: pop
// 902: aload 86
// 904: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 907: aload 48
// 909: ifnull 5a0
// 90c: lload 30
// 90e: aload 52
// 910: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 913: invokevirtual su/catlean/b6.B ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 916: aconst_null
// 917: aconst_null
// 918: aload 1
// 919: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 91c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 91f: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 922: aconst_null
// 923: sipush 11428
// 926: ldc2_w 419291555965830664
// 929: lload 2
// 92a: lxor
// 92b: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/kw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 930: lload 4
// 932: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 935: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 938: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 93b: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 93e: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 941: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 944: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 947: sipush 27460
// 94a: ldc2_w 2215510231474145262
// 94d: lload 2
// 94e: lxor
// 94f: invokedynamic o (IJ)I bsm=su/catlean/kw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 954: aconst_null
// 955: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 958: aload 1
// 959: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 95c: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 95f: return
}

private static final boolean x() {
long var0 = a ^ 80435794953134L;
long var2 = var0 ^ 128097505791644L;

try {
if (D.v(var2) == tz.CUSTOM) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -4065068688443090223L, var0);
}

return false;
}

static {
long var20 = a ^ 1110460417283L;
int var22 = (int)((var20 ^ 30708643518238L) >>> 48);
long var23 = (var20 ^ 30708643518238L) << 16 >>> 16;
int var25 = (int)((var20 ^ 5270654143521L) >>> 48);
long var26 = (var20 ^ 5270654143521L) << 16 >>> 16;
long var28 = var20 ^ 61098184915968L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[14];
int var16 = 0;
String var15 = "£Á,\u0086\t¤\u009d8A< ·\u00976]»jD7Q\u000fUAª\n6ìKà\u009d-,\u009f\u0010\u009f-´9ÔK(W\u008fSüåÑq±ò7F\u001dcyõeS\u001dhÃ\u00195\u0011X\u001ey\u009aÕtÞÙÇøq\u0084¾\u0006¿D0\u0010Y8sE\u001cÙeï\u0088k1\u0094E\u00137H\u0098Â\u0095|*U§\u008d8Ýe\u0017g\u0013v\t\u008fYÊ´ö\u0013597:ôÁiI\"çyQ0í¤\fBi.\u0005/\u0089ÔqÇ0=JF&þ¡¦83FQòE3ãµ\t\u0003÷b4ëþO\u0084û\u0010nOR\u0005\u009f[¾mkL\u0015¬Hªx f¢fp\u0095'\u0016X\u0088\u000e\u000eSY²\u0083øÐ\u0082õiZú\u009dRp\u0086é\u0018\\d\u000bÈ!<¬E,\u0003àcP?®\u001dL))\u000b\u008d2äÃ £BÇ\u007f\u0085Â\u0013Ï\u0082 m \u009fMØ\u0018|Û¯Ü\u008e*öH\u00ad\u001d¢\u0089c?\u0013\u00ad!\u0080R*bV\u0086+ñÚ\u0010ÑNß§X\u007fÎÞ3Å²\u0098u¿^É\u0018Ù$\u0084Nÿî=¥ÉG:Àzg2îL\u0016\u009eHù\u0086\ný\u0010\u008bÆ7òõâþ\u0000¯\tí\u0091\u001cD\u0093\u0014\u0010øçµ¤\u0001eG\u0096\u00ad9Ì½¯\u001að\n\u0018ë)¬\u0097j[\u0007\u001b\u001dP\u001d½\f~ÿûH\u000b±Ø,õ|Ä8äk\u0090}åu£\u009e<ðåÆ\u0012UQnA\u008bà\u0015|!,+Å\f$ÛG\u0017Õdú¾Ë\u0089¤$\u00169\u009aQG\u009fv°ûY0HT\u0014¤B5' \u009cÅ·K²þÌç\u0084×\u007f;\f*\u000brh\u0083Á\u0005¢Í½x5$ÁgO\u0018\u0088¡";
int var17 = "£Á,\u0086\t¤\u009d8A< ·\u00976]»jD7Q\u000fUAª\n6ìKà\u009d-,\u009f\u0010\u009f-´9ÔK(W\u008fSüåÑq±ò7F\u001dcyõeS\u001dhÃ\u00195\u0011X\u001ey\u009aÕtÞÙÇøq\u0084¾\u0006¿D0\u0010Y8sE\u001cÙeï\u0088k1\u0094E\u00137H\u0098Â\u0095|*U§\u008d8Ýe\u0017g\u0013v\t\u008fYÊ´ö\u0013597:ôÁiI\"çyQ0í¤\fBi.\u0005/\u0089ÔqÇ0=JF&þ¡¦83FQòE3ãµ\t\u0003÷b4ëþO\u0084û\u0010nOR\u0005\u009f[¾mkL\u0015¬Hªx f¢fp\u0095'\u0016X\u0088\u000e\u000eSY²\u0083øÐ\u0082õiZú\u009dRp\u0086é\u0018\\d\u000bÈ!<¬E,\u0003àcP?®\u001dL))\u000b\u008d2äÃ £BÇ\u007f\u0085Â\u0013Ï\u0082 m \u009fMØ\u0018|Û¯Ü\u008e*öH\u00ad\u001d¢\u0089c?\u0013\u00ad!\u0080R*bV\u0086+ñÚ\u0010ÑNß§X\u007fÎÞ3Å²\u0098u¿^É\u0018Ù$\u0084Nÿî=¥ÉG:Àzg2îL\u0016\u009eHù\u0086\ný\u0010\u008bÆ7òõâþ\u0000¯\tí\u0091\u001cD\u0093\u0014\u0010øçµ¤\u0001eG\u0096\u00ad9Ì½¯\u001að\n\u0018ë)¬\u0097j[\u0007\u001b\u001dP\u001d½\f~ÿûH\u000b±Ø,õ|Ä8äk\u0090}åu£\u009e<ðåÆ\u0012UQnA\u008bà\u0015|!,+Å\f$ÛG\u0017Õdú¾Ë\u0089¤$\u00169\u009aQG\u009fv°ûY0HT\u0014¤B5' \u009cÅ·K²þÌç\u0084×\u007f;\f*\u000brh\u0083Á\u0005¢Í½x5$ÁgO\u0018\u0088¡"
.length();
char var14 = '(';
int var33 = -1;

label54:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var47;
if ((var33 += var14) >= var17) {
b = var18;
c = new String[14];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "³\u0081JÅ\u0089òì\u0087n\u0005þÃra%e¤^wöBùlÑi\u0092:pé»ç\u0012\u0003\u0098ÕÂà\u001aU\u0087\u00925¥O\u0081?.\u0084";
int var5 = "³\u0081JÅ\u0089òì\u0087n\u0005þÃra%e¤^wöBùlÑi\u0092:pé»ç\u0012\u0003\u0098ÕÂà\u001aU\u0087\u00925¥O\u0081?.\u0084".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
var10001 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var55 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var55) {
case 0:
var37[var10001] = var58;
if (var2 >= var5) {
e = var6;
f = new Integer[8];
KProperty[] var30 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kw.class, b<"u">(29372, 5113645129137775539L ^ var20), b<"u">(17881, 8995618742812988624L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kw.class, b<"u">(7975, 4729419556412853797L ^ var20), b<"u">(31538, 5743740389319010866L ^ var20), 0))
};
L = var30;
D = new kw((char)var22, var23);
x = yp.L(D, b<"u">(21235, 2038246952869774335L ^ var20), tz.CUSTOM, null, null, c<"o">(29849, 7218349180761187225L ^ var20), null, var28);
jk var38 = D;
short var45 = (short)var25;
String var53 = b<"u">(26684, 4278804253862852916L ^ var20);
Color var57 = Color.ORANGE;
Intrinsics.checkNotNullExpressionValue(Color.ORANGE, b<"u">(19278, 2506538385926511171L ^ var20));
J = yp.b(var38, var45, var53, var57, null, kw::x, 4, null, var26);
B = ThreadLocalRandom.current();
j = new ArrayList();
return;
}
break;
default:
var37[var10001] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "¬\u0087{6é\u0093\u007fUl\u0082ë\u0018&ÿ\u000eT";
var5 = "¬\u0087{6é\u0093\u007fUl\u0082ë\u0018&ÿ\u000eT".length();
var2 = 0;
}

byte var44 = var2;
var2 += 8;
var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
var37 = var6;
var10001 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var55 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var47;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label54;
}

var15 = "\u001f\u007f\u0087®/Z<\u0093\u0016ê\u001f@\u0086ö.ÉÉ\u0080Ù\u001e¨1U<lIPj\u0098éwõ\t6éõ¨\f\u001a>Áñ-±9H\u0089÷0R\u0004n\u008e\u001cp+RbiWöTùÃåÐæzÞ¤pÃ\u009ap\bÀ\u0016d\u009aß\u008eÅs§/é¢ñ2Ë±\u0084ÏÖ¢æá";
var17 = "\u001f\u007f\u0087®/Z<\u0093\u0016ê\u001f@\u0086ö.ÉÉ\u0080Ù\u001e¨1U<lIPj\u0098éwõ\t6éõ¨\f\u001a>Áñ-±9H\u0089÷0R\u0004n\u008e\u001cp+RbiWöTùÃåÐæzÞ¤pÃ\u009ap\bÀ\u0016d\u009aß\u008eÅs§/é¢ñ2Ë±\u0084ÏÖ¢æá"
.length();
var14 = '0';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20844;
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
throw new RuntimeException("su/catlean/kw", var10);
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
throw new RuntimeException("su/catlean/kw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5989;
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
throw new RuntimeException("su/catlean/kw", var14);
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
throw new RuntimeException("su/catlean/kw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
