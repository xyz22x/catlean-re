package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class un extends _g {
@NotNull
public static final un d;
static final KProperty[] E;
@NotNull
private static final av z;
@NotNull
private static final av f;
@NotNull
private static final cq P;
@NotNull
private static final cq c;
@NotNull
private static bg Y;
@NotNull
private static bg t;
private static boolean A;
@NotNull
private static List N;
private static final long a = yz.a(835664927788733921L, 4280059109689286568L, MethodHandles.lookup().lookupClass()).a(43011627313028L);
private static final String[] b;
private static final String[] e;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private un(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 75958821934422L;
super(b<"g">(20493, 450712093966141731L ^ var4), jt.Q(), null, 4, null, var6);
}

private final lj G(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 48677715575643L;
return (lj)z.E(this, var6, E[0]);
}

private final lj j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 108217929041857L;
return (lj)f.E(this, var3, E[1]);
}

private final boolean R(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 133076846230481L;
return (Boolean)P.E(this, var6, E[2]);
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63323484429481L;
return (Boolean)c.E(this, var3, E[3]);
}

@Flow
private final void l(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/un.a J
// 003: ldc2_w 59630268194234
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 10620332044742
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 17498882507407
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 73362016178675
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 98862259644370
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 12
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 13
// 058: pop2
// 059: dup2
// 05a: ldc2_w 22638993462911
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 87328963579159
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 7180929657871
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 85712998626041
// 072: lxor
// 073: dup2
// 074: bipush 32
// 076: lushr
// 077: l2i
// 078: istore 20
// 07a: dup2
// 07b: bipush 32
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: lstore 21
// 083: pop2
// 084: dup2
// 085: ldc2_w 96889214862896
// 088: lxor
// 089: lstore 23
// 08b: dup2
// 08c: ldc2_w 99775712318181
// 08f: lxor
// 090: dup2
// 091: bipush 32
// 093: lushr
// 094: l2i
// 095: istore 25
// 097: dup2
// 098: bipush 32
// 09a: lshl
// 09b: bipush 48
// 09d: lushr
// 09e: l2i
// 09f: istore 26
// 0a1: dup2
// 0a2: bipush 48
// 0a4: lshl
// 0a5: bipush 48
// 0a7: lushr
// 0a8: l2i
// 0a9: istore 27
// 0ab: pop2
// 0ac: pop2
// 0ad: ldc2_w -5967380817434995343
// 0b0: lload 2
// 0b1: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: astore 28
// 0b8: aload 1
// 0b9: aload 28
// 0bb: ifnull 11c
// 0be: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0c1: aload 0
// 0c2: iload 25
// 0c4: iload 26
// 0c6: i2c
// 0c7: iload 27
// 0c9: invokespecial su/catlean/un.G (ICI)Lsu/catlean/lj;
// 0cc: invokevirtual su/catlean/lj.X ()I
// 0cf: if_icmpeq 10e
// 0d2: goto 0df
// 0d5: ldc2_w -5928486889509146345
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: aload 1
// 0e0: aload 28
// 0e2: ifnull 11c
// 0e5: goto 0f2
// 0e8: ldc2_w -5928486889509146345
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0f5: aload 0
// 0f6: lload 14
// 0f8: invokespecial su/catlean/un.j (J)Lsu/catlean/lj;
// 0fb: invokevirtual su/catlean/lj.X ()I
// 0fe: if_icmpne 13d
// 101: goto 10e
// 104: ldc2_w -5928486889509146345
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: aload 1
// 10f: goto 11c
// 112: ldc2_w -5928486889509146345
// 115: lload 2
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 11f: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 122: if_acmpne 13d
// 125: lload 4
// 127: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12a: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 12d: ifnull 148
// 130: goto 13d
// 133: ldc2_w -5928486889509146345
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: return
// 13e: ldc2_w -5928486889509146345
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/un.Y Lsu/catlean/bg;
// 14b: sipush 20499
// 14e: ldc2_w 7038207185173261234
// 151: lload 2
// 152: lxor
// 153: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: lload 23
// 15a: invokevirtual su/catlean/bg.c (IJ)Z
// 15d: aload 28
// 15f: ifnull 1b2
// 162: ifne 1ac
// 165: goto 172
// 168: ldc2_w -5928486889509146345
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: aload 0
// 173: checkcast su/catlean/_g
// 176: iload 8
// 178: aload 0
// 179: checkcast su/catlean/_g
// 17c: sipush 3422
// 17f: ldc2_w 9003137047114349940
// 182: lload 2
// 183: lxor
// 184: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/un.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: bipush 0
// 18a: anewarray 410
// 18d: iload 9
// 18f: i2c
// 190: bipush 0
// 191: bipush 4
// 192: aconst_null
// 193: iload 10
// 195: i2s
// 196: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 199: bipush 0
// 19a: bipush 2
// 19b: aconst_null
// 19c: lload 6
// 19e: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1a1: return
// 1a2: ldc2_w -5928486889509146345
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: aload 0
// 1ad: lload 16
// 1af: invokespecial su/catlean/un.t (J)Z
// 1b2: aload 28
// 1b4: ifnull 238
// 1b7: ifeq 234
// 1ba: goto 1c7
// 1bd: ldc2_w -5928486889509146345
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: iload 11
// 1c9: i2c
// 1ca: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 1cd: ldc 1.5
// 1cf: getstatic su/catlean/w2.DISTANCE Lsu/catlean/w2;
// 1d2: bipush 0
// 1d3: bipush 0
// 1d4: sipush 8251
// 1d7: ldc2_w 325363590294297490
// 1da: lload 2
// 1db: lxor
// 1dc: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: iload 12
// 1e3: iload 13
// 1e5: i2c
// 1e6: aconst_null
// 1e7: invokestatic su/catlean/dx.Y (CLsu/catlean/dx;FLsu/catlean/w2;ZZIICLjava/lang/Object;)Lnet/minecraft/class_1657;
// 1ea: ifnonnull 234
// 1ed: goto 1fa
// 1f0: ldc2_w -5928486889509146345
// 1f3: lload 2
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: aload 0
// 1fb: checkcast su/catlean/_g
// 1fe: iload 8
// 200: aload 0
// 201: checkcast su/catlean/_g
// 204: sipush 13037
// 207: ldc2_w 3365724595585237710
// 20a: lload 2
// 20b: lxor
// 20c: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/un.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: bipush 0
// 212: anewarray 410
// 215: iload 9
// 217: i2c
// 218: bipush 0
// 219: bipush 4
// 21a: aconst_null
// 21b: iload 10
// 21d: i2s
// 21e: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 221: bipush 0
// 222: bipush 2
// 223: aconst_null
// 224: lload 6
// 226: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 229: return
// 22a: ldc2_w -5928486889509146345
// 22d: lload 2
// 22e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: athrow
// 234: aload 1
// 235: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 238: aload 0
// 239: iload 25
// 23b: iload 26
// 23d: i2c
// 23e: iload 27
// 240: invokespecial su/catlean/un.G (ICI)Lsu/catlean/lj;
// 243: invokevirtual su/catlean/lj.X ()I
// 246: aload 28
// 248: ifnull 27b
// 24b: if_icmpne 26e
// 24e: goto 25b
// 251: ldc2_w -5928486889509146345
// 254: lload 2
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: aload 0
// 25c: lload 18
// 25e: invokespecial su/catlean/un.P (J)V
// 261: goto 26e
// 264: ldc2_w -5928486889509146345
// 267: lload 2
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: aload 1
// 26f: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 272: aload 0
// 273: lload 14
// 275: invokespecial su/catlean/un.j (J)Lsu/catlean/lj;
// 278: invokevirtual su/catlean/lj.X ()I
// 27b: if_icmpne 293
// 27e: aload 0
// 27f: iload 20
// 281: lload 21
// 283: invokespecial su/catlean/un.i (IJ)V
// 286: goto 293
// 289: ldc2_w -5928486889509146345
// 28c: lload 2
// 28d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 292: athrow
// 293: return
}

@Flow
private final void K(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/un.a J
// 003: ldc2_w 30780690713903
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 39623300839211
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 46248803796125
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 7556094464466
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 10216996615086
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 37616680614650
// 029: lxor
// 02a: dup2
// 02b: bipush 56
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 8
// 034: lshl
// 035: bipush 8
// 037: lushr
// 038: lstore 13
// 03a: pop2
// 03b: dup2
// 03c: ldc2_w 129586543908517
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 49312350605288
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 5258189123445
// 04d: lxor
// 04e: lstore 19
// 050: pop2
// 051: ldc2_w 9059754837504706020
// 054: lload 2
// 055: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: astore 21
// 05c: getstatic su/catlean/un.A Z
// 05f: aload 21
// 061: ifnull 0c1
// 064: ifne 09f
// 067: goto 074
// 06a: ldc2_w 9019836289501487490
// 06d: lload 2
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: aload 0
// 075: iload 12
// 077: i2b
// 078: lload 13
// 07a: invokespecial su/catlean/un.R (BJ)Z
// 07d: aload 21
// 07f: ifnull 0c1
// 082: goto 08f
// 085: ldc2_w 9019836289501487490
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: ifeq 1d8
// 092: goto 09f
// 095: ldc2_w 9019836289501487490
// 098: lload 2
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: getstatic su/catlean/un.t Lsu/catlean/bg;
// 0a2: sipush 29603
// 0a5: ldc2_w 2143460442404870290
// 0a8: lload 2
// 0a9: lxor
// 0aa: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: lload 15
// 0b1: invokevirtual su/catlean/bg.c (IJ)Z
// 0b4: goto 0c1
// 0b7: ldc2_w 9019836289501487490
// 0ba: lload 2
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: ifeq 1d8
// 0c4: lload 19
// 0c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c9: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0cc: checkcast net/minecraft/class_2374
// 0cf: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0d2: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0d5: dup
// 0d6: sipush 10660
// 0d9: ldc2_w 8986115446975662352
// 0dc: lload 2
// 0dd: lxor
// 0de: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/un.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e6: astore 22
// 0e8: lload 8
// 0ea: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ed: aload 22
// 0ef: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0f2: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0f5: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0f8: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0fb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0fe: aload 21
// 100: ifnull 126
// 103: ifeq 1d8
// 106: goto 113
// 109: ldc2_w 9019836289501487490
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: aload 0
// 114: lload 4
// 116: invokespecial su/catlean/un.V (J)I
// 119: goto 126
// 11c: ldc2_w 9019836289501487490
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: istore 23
// 128: iload 23
// 12a: aload 21
// 12c: ifnull 151
// 12f: bipush -1
// 130: if_icmpne 14b
// 133: goto 140
// 136: ldc2_w 9019836289501487490
// 139: lload 2
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: return
// 141: ldc2_w 9019836289501487490
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 0
// 14c: lload 17
// 14e: invokespecial su/catlean/un.v (J)Z
// 151: ifne 1d8
// 154: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 157: aload 22
// 159: iload 23
// 15b: getstatic su/catlean/xx.Strict Lsu/catlean/xx;
// 15e: getstatic su/catlean/zr.Normal Lsu/catlean/zr;
// 161: getstatic su/catlean/y4.NONE Lsu/catlean/y4;
// 164: ldc 4.0
// 166: fconst_0
// 167: sipush 7115
// 16a: ldc2_w 3634712516044599550
// 16d: lload 2
// 16e: lxor
// 16f: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: lload 10
// 176: getstatic su/catlean/yi.Alternative Lsu/catlean/yi;
// 179: aconst_null
// 17a: bipush 0
// 17b: sipush 28650
// 17e: ldc2_w 3217606203626570972
// 181: lload 2
// 182: lxor
// 183: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: aconst_null
// 189: invokestatic su/catlean/gw.P (Lsu/catlean/gw;Lnet/minecraft/class_2338;ILsu/catlean/xx;Lsu/catlean/zr;Lsu/catlean/y4;FFIJLsu/catlean/yi;Ljava/util/List;ZILjava/lang/Object;)Lsu/catlean/t5;
// 18c: astore 24
// 18e: aload 24
// 190: aload 21
// 192: ifnull 1a7
// 195: ifnull 1ca
// 198: goto 1a5
// 19b: ldc2_w 9019836289501487490
// 19e: lload 2
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: aload 24
// 1a7: astore 25
// 1a9: bipush 0
// 1aa: istore 26
// 1ac: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 1af: lload 6
// 1b1: aload 25
// 1b3: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 1b6: getstatic su/catlean/un.t Lsu/catlean/bg;
// 1b9: invokevirtual su/catlean/bg.l ()V
// 1bc: getstatic su/catlean/un.d Lsu/catlean/un;
// 1bf: pop
// 1c0: bipush 0
// 1c1: putstatic su/catlean/un.A Z
// 1c4: nop
// 1c5: aload 21
// 1c7: ifnonnull 1d8
// 1ca: nop
// 1cb: goto 1d8
// 1ce: ldc2_w 9019836289501487490
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: return
}

private final int V(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/un.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 140236828383498
// 0b: lxor
// 0c: dup2
// 0d: bipush 56
// 0f: lushr
// 10: l2i
// 11: istore 3
// 12: dup2
// 13: bipush 8
// 15: lshl
// 16: bipush 32
// 18: lushr
// 19: l2i
// 1a: istore 4
// 1c: dup2
// 1d: bipush 40
// 1f: lshl
// 20: bipush 40
// 22: lushr
// 23: l2i
// 24: istore 5
// 26: pop2
// 27: pop2
// 28: ldc2_w -4925617146628701190
// 2b: lload 1
// 2c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 34: iload 3
// 35: i2b
// 36: iload 4
// 38: getstatic su/catlean/un.N Ljava/util/List;
// 3b: iload 5
// 3d: invokevirtual su/catlean/gg.r (BILjava/util/List;I)Lsu/catlean/fg;
// 40: astore 7
// 42: astore 6
// 44: aload 7
// 46: invokevirtual su/catlean/fg.R ()Z
// 49: aload 6
// 4b: ifnull 6f
// 4e: ifeq 6e
// 51: goto 5e
// 54: ldc2_w -4957650532028242020
// 57: lload 1
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: aload 7
// 60: invokevirtual su/catlean/fg.a ()I
// 63: ireturn
// 64: ldc2_w -4957650532028242020
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: bipush -1
// 6f: ireturn
}

private final boolean v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 9091669110543L;
long var5 = var1 ^ 11355349848488L;
String var10000 = vm.a<"Å">(-4366317226756736199L, var1);
class_2338 var10001 = class_2338.method_49638((class_2374)zf.v(var5).method_33571()).method_10084();
Intrinsics.checkNotNullExpressionValue(var10001, b<"g">(17940, 5304997072204191840L ^ var1));
class_2338 var8 = var10001;
String var7 = var10000;
int var9 = c<"m">(13287, 1483509787982112261L ^ var1);

label85:
while (true) {
int var14 = var9;

label79:
while (var14 < c<"m">(15065, 163411285846044478L ^ var1)) {
int var15 = c<"m">(25837, 452423504022335751L ^ var1);
if (var7 == null) {
return (boolean)var15;
}

int var10 = var15;

label77:
while (true) {
var14 = var10;

label74:
while (true) {
if (var14 < c<"m">(15065, 163411285846044478L ^ var1)) {
var14 = c<"m">(25837, 452423504022335751L ^ var1);
String var17 = var7;

label69:
while (true) {
if (var17 == null) {
continue label79;
}

int var11 = var14;

while (true) {
if (var11 >= c<"m">(15065, 163411285846044478L ^ var1)) {
break label69;
}

var14 = N.contains(zf.z(var3).method_8320(var8.method_10069(var9, var10, var11)).method_26204());
if (var7 == null) {
continue label74;
}

try {
var17 = var7;
if (var1 < 0L) {
break;
}

if (var7 == null) {
return (boolean)var14;
}

if (var14 != 0) {
return (boolean)1;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -4327418507868283041L, var1);
}

var11++;
if (var7 == null) {
break label69;
}
}
}

var10++;
var10000 = var7;
if (var1 < 0L) {
break;
}

if (var7 != null) {
continue label77;
}
}

var9++;
if (var1 <= 0L) {
return (boolean)0;
}

var10000 = var7;
break;
}

if (var10000 != null) {
continue label85;
}

return (boolean)0;
}
}

return (boolean)0;
}
}

private final void P(long var1) {
var1 = a ^ var1;
int var3 = (int)((var1 ^ 115661772009411L) >>> 32);
long var4 = (var1 ^ 115661772009411L) << 32 >>> 32;
long var6 = var1 ^ 26482950494015L;
this.i(var3, var4);
A = true;
o8.p(o8.g, var6, c<"m">(23352, 8814794133501345188L ^ var1), (byte)0, false, un::a, c<"m">(16034, 7626053231956006963L ^ var1), null);
}

private final void i(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: lload 2
// 006: bipush 32
// 008: lshl
// 009: bipush 32
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/un.a J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 98146103602779
// 019: lxor
// 01a: lstore 6
// 01c: dup2
// 01d: ldc2_w 35558017919529
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 8
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 32
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 86716232592550
// 041: lxor
// 042: lstore 11
// 044: dup2
// 045: ldc2_w 24128951739294
// 048: lxor
// 049: lstore 13
// 04b: dup2
// 04c: ldc2_w 72330001707064
// 04f: lxor
// 050: lstore 15
// 052: dup2
// 053: ldc2_w 7115868484363
// 056: lxor
// 057: lstore 17
// 059: dup2
// 05a: ldc2_w 77770562419756
// 05d: lxor
// 05e: lstore 19
// 060: pop2
// 061: ldc2_w -1232871989247879491
// 064: lload 4
// 066: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 06e: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/un.x (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 073: lload 6
// 075: dup2_x1
// 076: pop2
// 077: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 07a: astore 22
// 07c: astore 21
// 07e: aload 22
// 080: aload 21
// 082: ifnull 0fb
// 085: invokevirtual su/catlean/fg.R ()Z
// 088: ifeq 0e7
// 08b: goto 099
// 08e: ldc2_w -1263920347528793381
// 091: lload 4
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 09c: aload 22
// 09e: invokevirtual su/catlean/fg.a ()I
// 0a1: lload 17
// 0a3: dup2_x1
// 0a4: pop2
// 0a5: invokevirtual su/catlean/gg.B (JI)V
// 0a8: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 0ab: fconst_0
// 0ac: lload 11
// 0ae: fconst_0
// 0af: sipush 15065
// 0b2: ldc2_w 163468080327131834
// 0b5: lload 4
// 0b7: lxor
// 0b8: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: aconst_null
// 0be: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 0c1: pop
// 0c2: lload 19
// 0c4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c7: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 0ca: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 0cd: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0d0: lload 15
// 0d2: invokevirtual su/catlean/gg.d (J)V
// 0d5: getstatic su/catlean/un.Y Lsu/catlean/bg;
// 0d8: invokevirtual su/catlean/bg.l ()V
// 0db: return
// 0dc: ldc2_w -1263920347528793381
// 0df: lload 4
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0ea: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/un.h (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 0ef: iload 8
// 0f1: i2s
// 0f2: swap
// 0f3: iload 9
// 0f5: i2s
// 0f6: iload 10
// 0f8: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// 0fb: astore 23
// 0fd: lload 2
// 0fe: lconst_0
// 0ff: lcmp
// 100: ifle 1b3
// 103: aload 23
// 105: invokevirtual su/catlean/fg.R ()Z
// 108: aload 21
// 10a: ifnull 187
// 10d: ifeq 1b9
// 110: goto 11e
// 113: ldc2_w -1263920347528793381
// 116: lload 4
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 121: bipush 1
// 122: invokevirtual su/catlean/_n.m (Z)V
// 125: aload 23
// 127: invokevirtual su/catlean/fg.a ()I
// 12a: lload 19
// 12c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 132: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 135: lload 13
// 137: dup2_x1
// 138: pop2
// 139: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 13c: bipush 0
// 13d: sipush 12300
// 140: ldc2_w 7942727162483673197
// 143: lload 4
// 145: lxor
// 146: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: aconst_null
// 14c: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 14f: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 152: fconst_0
// 153: lload 11
// 155: fconst_0
// 156: sipush 15065
// 159: ldc2_w 163468080327131834
// 15c: lload 4
// 15e: lxor
// 15f: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: aconst_null
// 165: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 168: pop
// 169: lload 19
// 16b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 171: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 174: aload 23
// 176: invokevirtual su/catlean/fg.a ()I
// 179: goto 187
// 17c: ldc2_w -1263920347528793381
// 17f: lload 4
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: lload 19
// 189: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 18c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 18f: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 192: lload 13
// 194: dup2_x1
// 195: pop2
// 196: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 199: bipush 0
// 19a: sipush 21516
// 19d: ldc2_w 1864822652331715692
// 1a0: lload 4
// 1a2: lxor
// 1a3: invokedynamic m (IJ)I bsm=su/catlean/un.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: aconst_null
// 1a9: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1ac: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 1af: bipush 0
// 1b0: invokevirtual su/catlean/_n.m (Z)V
// 1b3: getstatic su/catlean/un.Y Lsu/catlean/bg;
// 1b6: invokevirtual su/catlean/bg.l ()V
// 1b9: return
}

private static final void a() {
A = false;
}

private static final boolean x(class_1799 var0) {
long var1 = a ^ 74530379882113L;
Intrinsics.checkNotNullParameter(var0, b<"g">(13566, 909582751550113774L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_22021);
}

private static final boolean h(class_1799 var0) {
long var1 = a ^ 93157990426448L;
Intrinsics.checkNotNullParameter(var0, b<"g">(20141, 1086660692645528702L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_22021);
}

static {
long var20 = a ^ 470489601031L;
long var22 = var20 ^ 27251612607456L;
long var10001 = var20 ^ 110283837444488L;
int var24 = (int)((var20 ^ 110283837444488L) >>> 48);
int var25 = (int)((var20 ^ 110283837444488L) << 16 >>> 48);
int var26 = (int)(var10001 << 32 >>> 32);
long var27 = var20 ^ 84218051233746L;
var10001 = var20 ^ 116153539880129L;
int var29 = (int)((var20 ^ 116153539880129L) >>> 32);
int var30 = (int)((var20 ^ 116153539880129L) << 32 >>> 48);
int var31 = (int)(var10001 << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[24];
int var16 = 0;
String var15 = "w2Fx'ü=<|V\\\u0098ô\\ü`XN\u0015<\u0019\u001aª|\u0095æ\n#VFPã \u0002Ðu\n\u009b\u000fñ7\u001e1\u008b%\u0082â\u0004Lâ&çëÓ°õóÓñ Ç´ïÒ\u0094\u0010*\u009dÏë\u0084#\u001bMh.DGÉ\u0012¨\u0094\u0010©BoíQ Ä>íQç¨éµ\u0087À(7\u0091×Øæäçµè\u0006d\u008c*\u001f\u0011\u0092\\¥¤û¦\u009f²Bk\u0018\u0013Rç±Â×\u0096\u008el\u0019H\u000f<¤(õË\\P£Ï\u008f\u0012Ñ3\u0018\u009b×hï\u00038zô\u001d\u000f+¸¾p\bFF\u0005\u009dný3,õG{ÚÚ}\u0018ð\u0082uQÒÿI÷\u0003Ôãê.\u008c\u00804J±Ësk]Õ®(35Ë1AÆ0\rN`½Xw\u001en\b¼³õÒ\u00adÞ\u0087Ä7\u0000D¬ú\u0098M\u001eÔR±Á\u008c9Ø\u0005\u0018ãÄ\u0018iìU\u008b\u0093_\u001d¸8à\u0001¡Á\u000b#  â¡\u000eB \u0092^ÛòÄ>è\u0099\u008bmù\u001e\u008fk\u001eàÁ\u0011\fcL=\u0016»~W<RÍ6¬ã\u0018^ò^M\u001a=\u008dq\u009c\u0018ú\u0016TÓ´^Ábê\u0094³Æs^($B&\u000bÎú\u0093¦)Âø\u0093\u008aGJ«MÁß²²&Õ´Is\u008c[A\u0088t×X\u0093~«\u0080R?p\u0018\u0016à@\u00939X\u0000(;ÌUÒ½Þ7\u0089§DvJc^\u0011\u0082\u0018\u0016\u009bRåÍ¶l\u0083P\n\u009e\u001f\u009ebí²ù4m-v2\u0019g ~¨oE\u009aPÌt\u0003¸C;EWnÍ\u0001\u0082M}Ë/ÓZå\u001eò\u008e3^XÌ aIl@\u0002üo\u007f\u001aë0¢ò^º\u0089Z\u008aP®[µ\n\u001fF\u0091Ö\u0012c\u009a\u0099¥\u0010\u0090\u0090vû³gL8\u0019«\u0080H'w2c £''xº_mÓ2ø²¦\u0082\u0018\u0084\u0019ÀÅS\u001ekK\u009c¤Ó\u008få\u008f\u0017Ä³\u00840Ò\u0089@½Bs\u0090äzÈSe\u0015¾w*\u0081,Éìl\u008d0¨\u0088e\\äW\u009a\u00ad\u000b$<ç\fhþý²u=@\u000b±7Ü\n Â¡éc\u008e¢Þq®sÎ)n5\u009a¶#©÷VTÁïÆEà@·ÌÑ\u000ey\u0018\u0003¸Ú\u0000ýâ¯gaV\u008d«úã\fN¾?ë\u001fV?ýþ\u0018(R³WQ\u0089áþ`óh\u00975èfåïAÞµk\u0011\u0004!";
int var17 = "w2Fx'ü=<|V\\\u0098ô\\ü`XN\u0015<\u0019\u001aª|\u0095æ\n#VFPã \u0002Ðu\n\u009b\u000fñ7\u001e1\u008b%\u0082â\u0004Lâ&çëÓ°õóÓñ Ç´ïÒ\u0094\u0010*\u009dÏë\u0084#\u001bMh.DGÉ\u0012¨\u0094\u0010©BoíQ Ä>íQç¨éµ\u0087À(7\u0091×Øæäçµè\u0006d\u008c*\u001f\u0011\u0092\\¥¤û¦\u009f²Bk\u0018\u0013Rç±Â×\u0096\u008el\u0019H\u000f<¤(õË\\P£Ï\u008f\u0012Ñ3\u0018\u009b×hï\u00038zô\u001d\u000f+¸¾p\bFF\u0005\u009dný3,õG{ÚÚ}\u0018ð\u0082uQÒÿI÷\u0003Ôãê.\u008c\u00804J±Ësk]Õ®(35Ë1AÆ0\rN`½Xw\u001en\b¼³õÒ\u00adÞ\u0087Ä7\u0000D¬ú\u0098M\u001eÔR±Á\u008c9Ø\u0005\u0018ãÄ\u0018iìU\u008b\u0093_\u001d¸8à\u0001¡Á\u000b#  â¡\u000eB \u0092^ÛòÄ>è\u0099\u008bmù\u001e\u008fk\u001eàÁ\u0011\fcL=\u0016»~W<RÍ6¬ã\u0018^ò^M\u001a=\u008dq\u009c\u0018ú\u0016TÓ´^Ábê\u0094³Æs^($B&\u000bÎú\u0093¦)Âø\u0093\u008aGJ«MÁß²²&Õ´Is\u008c[A\u0088t×X\u0093~«\u0080R?p\u0018\u0016à@\u00939X\u0000(;ÌUÒ½Þ7\u0089§DvJc^\u0011\u0082\u0018\u0016\u009bRåÍ¶l\u0083P\n\u009e\u001f\u009ebí²ù4m-v2\u0019g ~¨oE\u009aPÌt\u0003¸C;EWnÍ\u0001\u0082M}Ë/ÓZå\u001eò\u008e3^XÌ aIl@\u0002üo\u007f\u001aë0¢ò^º\u0089Z\u008aP®[µ\n\u001fF\u0091Ö\u0012c\u009a\u0099¥\u0010\u0090\u0090vû³gL8\u0019«\u0080H'w2c £''xº_mÓ2ø²¦\u0082\u0018\u0084\u0019ÀÅS\u001ekK\u009c¤Ó\u008få\u008f\u0017Ä³\u00840Ò\u0089@½Bs\u0090äzÈSe\u0015¾w*\u0081,Éìl\u008d0¨\u0088e\\äW\u009a\u00ad\u000b$<ç\fhþý²u=@\u000b±7Ü\n Â¡éc\u008e¢Þq®sÎ)n5\u009a¶#©÷VTÁïÆEà@·ÌÑ\u000ey\u0018\u0003¸Ú\u0000ýâ¯gaV\u008d«úã\fN¾?ë\u001fV?ýþ\u0018(R³WQ\u0089áþ`óh\u00975èfåïAÞµk\u0011\u0004!"
.length();
char var14 = ' ';
int var35 = -1;

label54:
while (true) {
String var37 = var15.substring(++var35, var35 + var14);
byte var42 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var42) {
case 0:
var18[var16++] = var50;
if ((var35 += var14) >= var17) {
b = var18;
e = new String[24];
j = new HashMap(13);
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
String var4 = "EÈSu?L\u009cK\u0001åÚã¸r©nÍ½\u0000ce\u0095þÓ0Ð+\u0014z.¢¢²b½%p\u008c-&^ý®¢K>\bì±g5Þí\u008b9yc0kÁ©\u009b\u0089T\u00897ä\u000eim¾û««ã\n\u0003\u0007\r\u0012d/Ø\u000f\u0096!AðEí»«ê)\u0091\u0010K\\M\u0094\u009cïÝp";
int var5 = "EÈSu?L\u009cK\u0001åÚã¸r©nÍ½\u0000ce\u0095þÓ0Ð+\u0014z.¢¢²b½%p\u008c-&^ý®¢K>\bì±g5Þí\u008b9yc0kÁ©\u009b\u0089T\u00897ä\u000eim¾û««ã\n\u0003\u0007\r\u0012d/Ø\u000f\u0096!AðEí»«ê)\u0091\u0010K\\M\u0094\u009cïÝp"
.length();
byte var2 = 0;

label36:
while (true) {
byte var46 = var2;
var2 += 8;
byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
int var47 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var62 = -1;

while (true) {
long var8 = var54;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var64 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var62) {
case 0:
var40[var47] = var64;
if (var2 >= var5) {
h = var6;
i = new Integer[15];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(un.class, b<"g">(31773, 1146052049739777437L ^ var20), b<"g">(31800, 6127574839726704059L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(un.class, b<"g">(24775, 2981623798329284930L ^ var20), b<"g">(12978, 6684077681384377140L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(un.class, b<"g">(31880, 5702964857162499354L ^ var20), b<"g">(5030, 735692119103695414L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(un.class, b<"g">(28508, 8857493855173416667L ^ var20), b<"g">(15536, 7087974834582537519L ^ var20), 0))
};
E = var32;
d = new un((char)var24, (char)var25, var26);
z = yp.J(
d,
b<"g">(16154, 6363446865747789451L ^ var20),
new lj(0, false, var27, false, c<"m">(32333, 7170981595123059800L ^ var20), null),
null,
var29,
null,
var30,
(char)var31,
c<"m">(15291, 1618593689705662888L ^ var20),
null
);
f = yp.J(
d,
b<"g">(4855, 3600606840326712181L ^ var20),
new lj(0, false, var27, false, c<"m">(380, 3087077730729849700L ^ var20), null),
null,
var29,
null,
var30,
(char)var31,
c<"m">(15291, 1618593689705662888L ^ var20),
null
);
P = yp.t(d, b<"g">(21205, 1427457449340218190L ^ var20), true, var22, null, null, c<"m">(15291, 1618593689705662888L ^ var20), null);
c = yp.t(d, b<"g">(26535, 8465693356271377982L ^ var20), false, var22, null, null, c<"m">(15291, 1618593689705662888L ^ var20), null);
Y = new bg();
t = new bg();
class_2248[] var36 = new class_2248[5];
class_2248 var56 = class_2246.field_10381;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10381, b<"g">(29909, 7766895918631488833L ^ var20));
var36[0] = var56;
class_2248 var57 = class_2246.field_10442;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10442, b<"g">(27873, 7484234417226716540L ^ var20));
var36[1] = var57;
class_2248 var58 = class_2246.field_10201;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10201, b<"g">(9356, 8377749357562387737L ^ var20));
var36[2] = var58;
class_2248 var59 = class_2246.field_10013;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10013, b<"g">(9450, 2318646618220846450L ^ var20));
var36[3] = var59;
class_2248 var60 = class_2246.field_22109;
Intrinsics.checkNotNullExpressionValue(class_2246.field_22109, b<"g">(26653, 8524719616907972999L ^ var20));
var36[4] = var60;
N = CollectionsKt.listOf(var36);
return;
}
break;
default:
var40[var47] = var64;
if (var2 < var5) {
continue label36;
}

var4 = "[oýrx\u0081=»\u0085PKä(cä\u000f";
var5 = "[oýrx\u0081=»\u0085PKä(cä\u000f".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var40 = var6;
var47 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var62 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var50;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "|7¹\\Èç½CÍÿ\u0097Z!¾,ùAÊN\u008c\u0090\u0096\u008e/\u008bÑ(\u0097ÌÆ¦\u0016H+}·\u0084\u0001_õÖÎvÃ\u0005·¯jÙ¾iög(b\u0005oqB\u008aR=þõº`i.þB)Púã\u0014 N\u000bþl,B\u0087QÝ¹`Úð«J{øÇ{D\u001b,4ÝÍ£\u0004\u001fï";
var17 = "|7¹\\Èç½CÍÿ\u0097Z!¾,ùAÊN\u008c\u0090\u0096\u008e/\u008bÑ(\u0097ÌÆ¦\u0016H+}·\u0084\u0001_õÖÎvÃ\u0005·¯jÙ¾iög(b\u0005oqB\u008aR=þõº`i.þB)Púã\u0014 N\u000bþl,B\u0087QÝ¹`Úð«J{øÇ{D\u001b,4ÝÍ£\u0004\u001fï"
.length();
var14 = ' ';
var35 = -1;
}

var37 = var15.substring(++var35, var35 + var14);
var42 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23718;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/un", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/un" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22311;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/un", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/un" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
