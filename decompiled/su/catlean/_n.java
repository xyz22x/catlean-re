package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.ClickSlotEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _n extends _g {
@NotNull
public static final _n e;
static final KProperty[] O;
@NotNull
private static final cw F;
@NotNull
private static List V;
@NotNull
private static final LinkedList c;
@NotNull
private static final AtomicBoolean k;
private static boolean Y;
private static boolean A;
private static int K;
private static boolean D;
private static boolean f;
@NotNull
private static final Map U;
@NotNull
private static final Map d;
private static boolean N;
private static _g[] m;
private static final long a = yz.a(-4133011456643079438L, 4599371866093213342L, MethodHandles.lookup().lookupClass()).a(211928457330695L);
private static final String[] b;
private static final String[] g;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] j;
private static final Map l;

private _n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 113016968695007L;
super(b<"m">(9753, 1914785684798170493L ^ var1), jt.c(), null, 4, null, var3);
}

@NotNull
public final su i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 123482039398188L;
return (su)F.E(this, var3, O[0]);
}

@NotNull
public final Map Y() {
return U;
}

@NotNull
public final Map j() {
return d;
}

public final boolean e() {
return N;
}

public final void m(boolean <set-?>) {
N = <set-?>;
}

@Flow
private final void D(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_n.a J
// 003: ldc2_w 66290446456833
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 116689069475130
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 60363414443976
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 50163099368901
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 14038830332713
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 137390329887835
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
// 047: ldc2_w 82289647468377
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 132457498336016
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
// 06f: ldc2_w 107739292922759
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 81936219310876
// 079: lxor
// 07a: lstore 22
// 07c: pop2
// 07d: ldc2_w -2763005958095700293
// 080: lload 2
// 081: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: astore 24
// 088: getstatic su/catlean/_n.V Ljava/util/List;
// 08b: invokeinterface java/util/List.isEmpty ()Z 1
// 090: aload 24
// 092: ifnull 183
// 095: ifeq 180
// 098: goto 0a5
// 09b: ldc2_w -2774362406952174454
// 09e: lload 2
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: nop
// 0a6: sipush 4897
// 0a9: ldc2_w 2614577708040221016
// 0ac: lload 2
// 0ad: lxor
// 0ae: invokedynamic b (IJ)I bsm=su/catlean/_n.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: anewarray 484
// 0b6: astore 25
// 0b8: aload 25
// 0ba: bipush 0
// 0bb: lload 4
// 0bd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0c3: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 0c6: dup
// 0c7: sipush 4201
// 0ca: ldc2_w 8564648837241542514
// 0cd: lload 2
// 0ce: lxor
// 0cf: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d7: aastore
// 0d8: aload 25
// 0da: bipush 1
// 0db: lload 4
// 0dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0e3: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 0e6: dup
// 0e7: sipush 14026
// 0ea: ldc2_w 8076717414806598109
// 0ed: lload 2
// 0ee: lxor
// 0ef: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f7: aastore
// 0f8: aload 25
// 0fa: bipush 2
// 0fb: lload 4
// 0fd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 100: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 103: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 106: dup
// 107: sipush 13200
// 10a: ldc2_w 9195636667687842947
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 117: aastore
// 118: aload 25
// 11a: bipush 3
// 11b: lload 4
// 11d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 120: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 123: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 126: dup
// 127: sipush 2336
// 12a: ldc2_w 1543766675663031858
// 12d: lload 2
// 12e: lxor
// 12f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 137: aastore
// 138: aload 25
// 13a: bipush 4
// 13b: lload 4
// 13d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 140: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 143: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 146: dup
// 147: sipush 19321
// 14a: ldc2_w 630801600759745641
// 14d: lload 2
// 14e: lxor
// 14f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 157: aastore
// 158: aload 25
// 15a: bipush 5
// 15b: lload 4
// 15d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 160: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 163: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
// 166: dup
// 167: sipush 7099
// 16a: ldc2_w 6338662968035679394
// 16d: lload 2
// 16e: lxor
// 16f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 177: aastore
// 178: aload 25
// 17a: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 17d: putstatic su/catlean/_n.V Ljava/util/List;
// 180: getstatic su/catlean/_n.f Z
// 183: ifeq 1b1
// 186: aload 0
// 187: lload 10
// 189: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 18c: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 18f: aload 24
// 191: ifnull 268
// 194: goto 1a1
// 197: ldc2_w -2774362406952174454
// 19a: lload 2
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: if_acmpeq 25f
// 1a4: goto 1b1
// 1a7: ldc2_w -2774362406952174454
// 1aa: lload 2
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: lload 4
// 1b3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1b9: aload 24
// 1bb: ifnull 1f0
// 1be: goto 1cb
// 1c1: ldc2_w -2774362406952174454
// 1c4: lload 2
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: ifnull 25f
// 1ce: goto 1db
// 1d1: ldc2_w -2774362406952174454
// 1d4: lload 2
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: lload 4
// 1dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e0: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1e3: goto 1f0
// 1e6: ldc2_w -2774362406952174454
// 1e9: lload 2
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: instanceof net/minecraft/class_408
// 1f3: ifne 25f
// 1f6: getstatic su/catlean/_n.V Ljava/util/List;
// 1f9: checkcast java/lang/Iterable
// 1fc: astore 25
// 1fe: bipush 0
// 1ff: istore 26
// 201: aload 25
// 203: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 208: astore 27
// 20a: aload 27
// 20c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 211: ifeq 25e
// 214: aload 27
// 216: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 21b: astore 28
// 21d: aload 28
// 21f: checkcast net/minecraft/class_304
// 222: astore 29
// 224: bipush 0
// 225: istore 30
// 227: aload 29
// 229: aload 29
// 22b: invokevirtual net/minecraft/class_304.method_1428 ()Ljava/lang/String;
// 22e: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
// 231: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 234: iload 17
// 236: i2s
// 237: swap
// 238: iload 18
// 23a: swap
// 23b: iload 19
// 23d: i2c
// 23e: swap
// 23f: invokestatic su/catlean/bx.k (SICI)Z
// 242: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 245: nop
// 246: nop
// 247: aload 24
// 249: ifnull 25f
// 24c: aload 24
// 24e: ifnonnull 20a
// 251: goto 25e
// 254: ldc2_w -2774362406952174454
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: nop
// 25f: aload 0
// 260: lload 10
// 262: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 265: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 268: if_acmpne 2c5
// 26b: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 26e: checkcast java/util/Collection
// 271: invokeinterface java/util/Collection.isEmpty ()Z 1
// 276: aload 24
// 278: ifnull 299
// 27b: goto 288
// 27e: ldc2_w -2774362406952174454
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: ifne 29c
// 28b: goto 298
// 28e: ldc2_w -2774362406952174454
// 291: lload 2
// 292: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 297: athrow
// 298: bipush 1
// 299: goto 29d
// 29c: bipush 0
// 29d: ifeq 2c5
// 2a0: getstatic su/catlean/_n.Y Z
// 2a3: aload 24
// 2a5: ifnull 2ed
// 2a8: goto 2b5
// 2ab: ldc2_w -2774362406952174454
// 2ae: lload 2
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: ifne 2ea
// 2b8: goto 2c5
// 2bb: ldc2_w -2774362406952174454
// 2be: lload 2
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: getstatic su/catlean/_n.K I
// 2c8: aload 24
// 2ca: ifnull 2ed
// 2cd: goto 2da
// 2d0: ldc2_w -2774362406952174454
// 2d3: lload 2
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: ifeq 445
// 2dd: goto 2ea
// 2e0: ldc2_w -2774362406952174454
// 2e3: lload 2
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: getstatic su/catlean/_n.K I
// 2ed: aload 24
// 2ef: ifnull 343
// 2f2: tableswitch 338 0 1 32 89
// 308: ldc2_w -2774362406952174454
// 30b: lload 2
// 30c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 311: athrow
// 312: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 315: bipush 1
// 316: invokevirtual su/catlean/_6.h (Z)V
// 319: lload 22
// 31b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 31e: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 321: putstatic su/catlean/_n.D Z
// 324: lload 22
// 326: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 329: bipush 0
// 32a: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 32d: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 330: lload 20
// 332: invokevirtual su/catlean/dm.D (J)V
// 335: bipush 1
// 336: goto 343
// 339: ldc2_w -2774362406952174454
// 33c: lload 2
// 33d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 342: athrow
// 343: putstatic su/catlean/_n.K I
// 346: aload 24
// 348: ifnonnull 444
// 34b: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 34e: bipush 1
// 34f: invokevirtual su/catlean/_6.h (Z)V
// 352: getstatic su/catlean/_n.k Ljava/util/concurrent/atomic/AtomicBoolean;
// 355: bipush 1
// 356: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 359: aload 0
// 35a: lload 6
// 35c: getstatic su/catlean/_n.d Ljava/util/Map;
// 35f: invokespecial su/catlean/_n.t (JLjava/util/Map;)V
// 362: aload 0
// 363: getstatic su/catlean/_n.U Ljava/util/Map;
// 366: iload 12
// 368: iload 13
// 36a: iload 14
// 36c: invokespecial su/catlean/_n.c (Ljava/util/Map;III)V
// 36f: goto 37c
// 372: ldc2_w -2774362406952174454
// 375: lload 2
// 376: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37b: athrow
// 37c: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 37f: invokevirtual java/util/LinkedList.isEmpty ()Z
// 382: ifne 3f2
// 385: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 388: invokevirtual java/util/LinkedList.poll ()Ljava/lang/Object;
// 38b: checkcast su/catlean/r
// 38e: astore 26
// 390: aload 24
// 392: ifnull 437
// 395: aload 24
// 397: ifnull 3ed
// 39a: goto 3a7
// 39d: ldc2_w -2774362406952174454
// 3a0: lload 2
// 3a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: athrow
// 3a7: lload 4
// 3a9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3ac: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
// 3af: dup
// 3b0: ifnull 3ec
// 3b3: goto 3c0
// 3b6: ldc2_w -2774362406952174454
// 3b9: lload 2
// 3ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bf: athrow
// 3c0: aload 26
// 3c2: invokevirtual su/catlean/r.e ()I
// 3c5: aload 26
// 3c7: invokevirtual su/catlean/r.y ()I
// 3ca: aload 26
// 3cc: invokevirtual su/catlean/r.j ()I
// 3cf: aload 26
// 3d1: invokevirtual su/catlean/r.z ()Lnet/minecraft/class_1713;
// 3d4: lload 22
// 3d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d9: checkcast net/minecraft/class_1657
// 3dc: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 3df: goto 37c
// 3e2: ldc2_w -2774362406952174454
// 3e5: lload 2
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: pop
// 3ed: aload 24
// 3ef: ifnonnull 37c
// 3f2: new net/minecraft/class_2815
// 3f5: dup
// 3f6: lload 22
// 3f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3fb: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 3fe: getfield net/minecraft/class_1703.field_7763 I
// 401: invokespecial net/minecraft/class_2815.<init> (I)V
// 404: checkcast net/minecraft/class_2596
// 407: lload 15
// 409: dup2_x1
// 40a: pop2
// 40b: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 40e: getstatic su/catlean/_n.k Ljava/util/concurrent/atomic/AtomicBoolean;
// 411: bipush 0
// 412: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 415: bipush 0
// 416: putstatic su/catlean/_n.Y Z
// 419: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 41c: bipush 1
// 41d: invokevirtual su/catlean/_6.h (Z)V
// 420: lload 22
// 422: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 425: getstatic su/catlean/_n.D Z
// 428: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 42b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 42e: lload 8
// 430: invokevirtual su/catlean/dm.F (J)V
// 433: bipush 0
// 434: putstatic su/catlean/_n.K I
// 437: aload 0
// 438: getstatic su/catlean/_n.d Ljava/util/Map;
// 43b: iload 12
// 43d: iload 13
// 43f: iload 14
// 441: invokespecial su/catlean/_n.c (Ljava/util/Map;III)V
// 444: return
// 445: return
}

@Flow
private final void x(ClickSlotEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_n.a J
// 003: ldc2_w 45363522665145
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 139812940883842
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 39505205933424
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 92917006661231
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 28367677725073
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 94309556733408
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 102916999747331
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 105415594515937
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 54248480426497
// 03e: lxor
// 03f: dup2
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 18
// 046: dup2
// 047: bipush 32
// 049: lshl
// 04a: bipush 56
// 04c: lushr
// 04d: l2i
// 04e: istore 19
// 050: dup2
// 051: bipush 40
// 053: lshl
// 054: bipush 40
// 056: lushr
// 057: l2i
// 058: istore 20
// 05a: pop2
// 05b: dup2
// 05c: ldc2_w 105060086000036
// 05f: lxor
// 060: lstore 21
// 062: pop2
// 063: ldc2_w -351349283493061629
// 066: lload 2
// 067: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: astore 23
// 06e: getstatic su/catlean/_n.N Z
// 071: aload 23
// 073: ifnull 099
// 076: ifne 0ae
// 079: goto 086
// 07c: ldc2_w -304158865924104654
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: getstatic su/catlean/_n.k Ljava/util/concurrent/atomic/AtomicBoolean;
// 089: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 08c: goto 099
// 08f: ldc2_w -304158865924104654
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 23
// 09b: ifnull 0b7
// 09e: ifeq 0af
// 0a1: goto 0ae
// 0a4: ldc2_w -304158865924104654
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: return
// 0af: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0b2: lload 8
// 0b4: invokevirtual su/catlean/dm.Y (J)Z
// 0b7: aload 23
// 0b9: ifnull 111
// 0bc: ifne 0fc
// 0bf: goto 0cc
// 0c2: ldc2_w -304158865924104654
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: lload 4
// 0ce: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0d4: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0d7: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0da: aload 23
// 0dc: ifnull 127
// 0df: goto 0ec
// 0e2: ldc2_w -304158865924104654
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: ifeq 126
// 0ef: goto 0fc
// 0f2: ldc2_w -304158865924104654
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: lload 21
// 0fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 101: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 104: goto 111
// 107: ldc2_w -304158865924104654
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: aload 23
// 113: ifnull 14b
// 116: ifeq 12b
// 119: goto 126
// 11c: ldc2_w -304158865924104654
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: bipush 1
// 127: putstatic su/catlean/_n.f Z
// 12a: return
// 12b: aload 0
// 12c: lload 10
// 12e: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 131: aload 23
// 133: ifnull 1a5
// 136: getstatic su/catlean/p_.Z [I
// 139: swap
// 13a: invokevirtual su/catlean/su.ordinal ()I
// 13d: iaload
// 13e: goto 14b
// 141: ldc2_w -304158865924104654
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: tableswitch 739 1 5 33 33 366 520 722
// 16c: aload 0
// 16d: aload 1
// 16e: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getSyncId ()I
// 171: iload 18
// 173: swap
// 174: iload 19
// 176: i2b
// 177: swap
// 178: aload 1
// 179: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getId ()I
// 17c: aload 1
// 17d: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getButton ()I
// 180: aload 1
// 181: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getAction ()Lnet/minecraft/class_1713;
// 184: iload 20
// 186: swap
// 187: lload 21
// 189: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 18c: checkcast net/minecraft/class_1657
// 18f: invokespecial su/catlean/_n.R (IBIIIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 192: aload 0
// 193: lload 10
// 195: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 198: goto 1a5
// 19b: ldc2_w -304158865924104654
// 19e: lload 2
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: getstatic su/catlean/su.STRICT_NCP Lsu/catlean/su;
// 1a8: if_acmpne 1bb
// 1ab: ldc2_w 0.0656
// 1ae: goto 1be
// 1b1: ldc2_w -304158865924104654
// 1b4: lload 2
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: ldc2_w 2.71875E-7
// 1be: dstore 24
// 1c0: lload 21
// 1c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c5: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1c8: aload 23
// 1ca: ifnull 213
// 1cd: ifeq 42e
// 1d0: goto 1dd
// 1d3: ldc2_w -304158865924104654
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: lload 14
// 1df: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1e2: lload 21
// 1e4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e7: checkcast net/minecraft/class_1297
// 1ea: lload 21
// 1ec: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ef: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 1f2: dconst_0
// 1f3: dload 24
// 1f5: dconst_0
// 1f6: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 1f9: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 1fc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 201: invokeinterface java/util/Iterator.hasNext ()Z 1
// 206: goto 213
// 209: ldc2_w -304158865924104654
// 20c: lload 2
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: aload 23
// 215: ifnull 23d
// 218: ifne 42e
// 21b: goto 228
// 21e: ldc2_w -304158865924104654
// 221: lload 2
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: lload 21
// 22a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22d: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 230: goto 23d
// 233: ldc2_w -304158865924104654
// 236: lload 2
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: aload 23
// 23f: ifnull 27c
// 242: ifeq 27f
// 245: goto 252
// 248: ldc2_w -304158865924104654
// 24b: lload 2
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: new net/minecraft/class_2848
// 255: dup
// 256: lload 21
// 258: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25b: checkcast net/minecraft/class_1297
// 25e: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 261: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 264: checkcast net/minecraft/class_2596
// 267: lload 16
// 269: dup2_x1
// 26a: pop2
// 26b: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 26e: bipush 1
// 26f: goto 27c
// 272: ldc2_w -304158865924104654
// 275: lload 2
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: putstatic su/catlean/_n.A Z
// 27f: new net/minecraft/class_2828$class_2829
// 282: dup
// 283: lload 21
// 285: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 288: invokevirtual net/minecraft/class_746.method_23317 ()D
// 28b: lload 21
// 28d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 290: invokevirtual net/minecraft/class_746.method_23318 ()D
// 293: dload 24
// 295: dadd
// 296: lload 21
// 298: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29b: invokevirtual net/minecraft/class_746.method_23321 ()D
// 29e: bipush 0
// 29f: lload 21
// 2a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a4: getfield net/minecraft/class_746.field_5976 Z
// 2a7: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 2aa: checkcast net/minecraft/class_2596
// 2ad: lload 16
// 2af: dup2_x1
// 2b0: pop2
// 2b1: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2b4: aload 23
// 2b6: ifnonnull 42e
// 2b9: aload 0
// 2ba: aload 1
// 2bb: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getSyncId ()I
// 2be: iload 18
// 2c0: swap
// 2c1: iload 19
// 2c3: i2b
// 2c4: swap
// 2c5: aload 1
// 2c6: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getId ()I
// 2c9: aload 1
// 2ca: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getButton ()I
// 2cd: aload 1
// 2ce: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getAction ()Lnet/minecraft/class_1713;
// 2d1: iload 20
// 2d3: swap
// 2d4: lload 21
// 2d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2d9: checkcast net/minecraft/class_1657
// 2dc: invokespecial su/catlean/_n.R (IBIIIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 2df: new net/minecraft/class_2848
// 2e2: dup
// 2e3: lload 21
// 2e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e8: checkcast net/minecraft/class_1297
// 2eb: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 2ee: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 2f1: checkcast net/minecraft/class_2596
// 2f4: lload 16
// 2f6: dup2_x1
// 2f7: pop2
// 2f8: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2fb: lload 4
// 2fd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 300: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 303: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 306: bipush 0
// 307: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 30a: lload 21
// 30c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 30f: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 312: dup
// 313: sipush 9086
// 316: ldc2_w 6157153235060164318
// 319: lload 2
// 31a: lxor
// 31b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/_n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 320: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 323: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 326: new net/minecraft/class_241
// 329: dup
// 32a: lload 21
// 32c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32f: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 332: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 335: getfield net/minecraft/class_241.field_1343 F
// 338: fconst_0
// 339: invokespecial net/minecraft/class_241.<init> (FF)V
// 33c: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 341: aload 23
// 343: ifnonnull 42e
// 346: goto 353
// 349: ldc2_w -304158865924104654
// 34c: lload 2
// 34d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: athrow
// 353: lload 21
// 355: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 358: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 35b: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 35e: invokevirtual net/minecraft/class_2371.size ()I
// 361: aload 23
// 363: ifnull 3a1
// 366: goto 373
// 369: ldc2_w -304158865924104654
// 36c: lload 2
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: sipush 25167
// 376: ldc2_w 4130858313350095500
// 379: lload 2
// 37a: lxor
// 37b: invokedynamic b (IJ)I bsm=su/catlean/_n.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: if_icmpeq 39b
// 383: goto 390
// 386: ldc2_w -304158865924104654
// 389: lload 2
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: athrow
// 390: return
// 391: ldc2_w -304158865924104654
// 394: lload 2
// 395: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39a: athrow
// 39b: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 39e: invokevirtual java/util/LinkedList.isEmpty ()Z
// 3a1: aload 23
// 3a3: ifnull 413
// 3a6: ifeq 3cc
// 3a9: goto 3b6
// 3ac: ldc2_w -304158865924104654
// 3af: lload 2
// 3b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b5: athrow
// 3b6: aload 0
// 3b7: lload 6
// 3b9: getstatic su/catlean/_n.U Ljava/util/Map;
// 3bc: invokespecial su/catlean/_n.t (JLjava/util/Map;)V
// 3bf: goto 3cc
// 3c2: ldc2_w -304158865924104654
// 3c5: lload 2
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: aload 0
// 3cd: aload 1
// 3ce: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getSyncId ()I
// 3d1: iload 18
// 3d3: swap
// 3d4: iload 19
// 3d6: i2b
// 3d7: swap
// 3d8: aload 1
// 3d9: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getId ()I
// 3dc: aload 1
// 3dd: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getButton ()I
// 3e0: aload 1
// 3e1: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getAction ()Lnet/minecraft/class_1713;
// 3e4: iload 20
// 3e6: swap
// 3e7: lload 21
// 3e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3ec: checkcast net/minecraft/class_1657
// 3ef: invokespecial su/catlean/_n.R (IBIIIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 3f2: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 3f5: new su/catlean/r
// 3f8: dup
// 3f9: aload 1
// 3fa: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getSyncId ()I
// 3fd: aload 1
// 3fe: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getId ()I
// 401: lload 12
// 403: dup2_x1
// 404: pop2
// 405: aload 1
// 406: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getButton ()I
// 409: aload 1
// 40a: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.getAction ()Lnet/minecraft/class_1713;
// 40d: invokespecial su/catlean/r.<init> (IJIILnet/minecraft/class_1713;)V
// 410: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
// 413: pop
// 414: aload 1
// 415: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.cancel ()V
// 418: aload 23
// 41a: ifnonnull 42e
// 41d: aload 1
// 41e: invokevirtual su/catlean/api/event/events/player/ClickSlotEvent.cancel ()V
// 421: goto 42e
// 424: ldc2_w -304158865924104654
// 427: lload 2
// 428: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42d: athrow
// 42e: return
}

@Flow
private final void j(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_n.a J
// 003: ldc2_w 45626656255331
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 28525316705867
// 00d: lxor
// 00e: lstore 4
// 010: pop2
// 011: ldc2_w -1385488497379718183
// 014: lload 2
// 015: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01a: astore 6
// 01c: getstatic su/catlean/_n.N Z
// 01f: aload 6
// 021: ifnull 03c
// 024: ifeq 035
// 027: goto 034
// 02a: ldc2_w -1432873510790051352
// 02d: lload 2
// 02e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: athrow
// 034: return
// 035: aload 1
// 036: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 039: instanceof net/minecraft/class_2645
// 03c: aload 6
// 03e: ifnull 116
// 041: ifeq 10f
// 044: goto 051
// 047: ldc2_w -1432873510790051352
// 04a: lload 2
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: bipush 0
// 052: putstatic su/catlean/_n.f Z
// 055: aload 0
// 056: lload 4
// 058: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 05b: getstatic su/catlean/su.DISABLE_CLICKS Lsu/catlean/su;
// 05e: aload 6
// 060: ifnull 09a
// 063: goto 070
// 066: ldc2_w -1432873510790051352
// 069: lload 2
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: if_acmpne 091
// 073: goto 080
// 076: ldc2_w -1432873510790051352
// 079: lload 2
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: aload 1
// 081: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 084: goto 091
// 087: ldc2_w -1432873510790051352
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: aload 0
// 092: lload 4
// 094: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 097: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 09a: if_acmpne 10f
// 09d: getstatic su/catlean/_n.k Ljava/util/concurrent/atomic/AtomicBoolean;
// 0a0: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 0a3: aload 6
// 0a5: ifnull 116
// 0a8: goto 0b5
// 0ab: ldc2_w -1432873510790051352
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: ifne 10f
// 0b8: goto 0c5
// 0bb: ldc2_w -1432873510790051352
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 0c8: checkcast java/util/Collection
// 0cb: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0d0: aload 6
// 0d2: ifnull 0f3
// 0d5: goto 0e2
// 0d8: ldc2_w -1432873510790051352
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: ifne 0f6
// 0e5: goto 0f2
// 0e8: ldc2_w -1432873510790051352
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: bipush 1
// 0f3: goto 0f7
// 0f6: bipush 0
// 0f7: ifeq 10f
// 0fa: aload 1
// 0fb: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 0fe: bipush 1
// 0ff: putstatic su/catlean/_n.Y Z
// 102: goto 10f
// 105: ldc2_w -1432873510790051352
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 1
// 110: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 113: instanceof net/minecraft/class_3944
// 116: aload 6
// 118: ifnull 12c
// 11b: ifeq 12f
// 11e: goto 12b
// 121: ldc2_w -1432873510790051352
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: bipush 1
// 12c: putstatic su/catlean/_n.f Z
// 12f: return
}

@Flow
private final void C(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_n.a J
// 003: ldc2_w 13794591450934
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 65992512554014
// 00d: lxor
// 00e: lstore 4
// 010: pop2
// 011: ldc2_w -6444399854594522740
// 014: lload 2
// 015: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01a: astore 6
// 01c: getstatic su/catlean/_n.N Z
// 01f: aload 6
// 021: ifnull 03c
// 024: ifeq 035
// 027: goto 034
// 02a: ldc2_w -6464832780125568067
// 02d: lload 2
// 02e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: athrow
// 034: return
// 035: aload 1
// 036: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 039: instanceof net/minecraft/class_2815
// 03c: aload 6
// 03e: ifnull 052
// 041: ifeq 102
// 044: goto 051
// 047: ldc2_w -6464832780125568067
// 04a: lload 2
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: bipush 0
// 052: putstatic su/catlean/_n.f Z
// 055: aload 0
// 056: lload 4
// 058: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 05b: getstatic su/catlean/su.DISABLE_CLICKS Lsu/catlean/su;
// 05e: aload 6
// 060: ifnull 08d
// 063: if_acmpne 084
// 066: goto 073
// 069: ldc2_w -6464832780125568067
// 06c: lload 2
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: aload 1
// 074: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 077: goto 084
// 07a: ldc2_w -6464832780125568067
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: lload 4
// 087: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 08a: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 08d: if_acmpne 102
// 090: getstatic su/catlean/_n.k Ljava/util/concurrent/atomic/AtomicBoolean;
// 093: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 096: aload 6
// 098: ifnull 0d0
// 09b: goto 0a8
// 09e: ldc2_w -6464832780125568067
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: ifne 102
// 0ab: goto 0b8
// 0ae: ldc2_w -6464832780125568067
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: getstatic su/catlean/_n.c Ljava/util/LinkedList;
// 0bb: checkcast java/util/Collection
// 0be: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0c3: goto 0d0
// 0c6: ldc2_w -6464832780125568067
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: aload 6
// 0d2: ifnull 0e6
// 0d5: ifne 0e9
// 0d8: goto 0e5
// 0db: ldc2_w -6464832780125568067
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: bipush 1
// 0e6: goto 0ea
// 0e9: bipush 0
// 0ea: ifeq 0fe
// 0ed: bipush 1
// 0ee: putstatic su/catlean/_n.Y Z
// 0f1: goto 0fe
// 0f4: ldc2_w -6464832780125568067
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 1
// 0ff: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 102: return
}

@Flow
private final void r(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_n.a J
// 03: ldc2_w 87570782229351
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 139826697597007
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 62916286608447
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 63127846797434
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -7871826681550883363
// 22: lload 2
// 23: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: getstatic su/catlean/_n.N Z
// 2d: aload 10
// 2f: ifnull 4a
// 32: ifeq 43
// 35: goto 42
// 38: ldc2_w -7919280910506674196
// 3b: lload 2
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: return
// 43: aload 1
// 44: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 47: instanceof net/minecraft/class_2813
// 4a: aload 10
// 4c: ifnull 62
// 4f: ifeq ab
// 52: goto 5f
// 55: ldc2_w -7919280910506674196
// 58: lload 2
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: getstatic su/catlean/_n.A Z
// 62: ifeq ab
// 65: aload 0
// 66: lload 4
// 68: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 6b: getstatic su/catlean/su.STRICT_NCP Lsu/catlean/su;
// 6e: if_acmpne ab
// 71: goto 7e
// 74: ldc2_w -7919280910506674196
// 77: lload 2
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: new net/minecraft/class_2848
// 81: dup
// 82: lload 8
// 84: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 87: checkcast net/minecraft/class_1297
// 8a: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 8d: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 90: checkcast net/minecraft/class_2596
// 93: lload 6
// 95: dup2_x1
// 96: pop2
// 97: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 9a: bipush 0
// 9b: putstatic su/catlean/_n.A Z
// 9e: goto ab
// a1: ldc2_w -7919280910506674196
// a4: lload 2
// a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa: athrow
// ab: return
}

private final void R(int var1, byte var2, int var3, int var4, int var5, int var6, class_1713 var7, class_1657 var8) {
long var9 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var6 << 40 >>> 40) ^ a;

try {
if (var3 == var8.field_7512.field_7763) {
var8.field_7512.method_7593(var4, var5, var7, var8);
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -5641862498806426559L, var9);
}
}

private final void t(long param1, Map param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
//   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
//
// Bytecode:
// 00: getstatic su/catlean/_n.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 61400919415974
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 5628841910759614721
// 12: lload 1
// 13: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 0
// 19: istore 7
// 1b: astore 6
// 1d: iload 7
// 1f: sipush 25167
// 22: ldc2_w 4130832109043783566
// 25: lload 1
// 26: lxor
// 27: invokedynamic b (IJ)I bsm=su/catlean/_n.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: if_icmpge 56
// 2f: aload 3
// 30: iload 7
// 32: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 35: lload 4
// 37: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 3d: iload 7
// 3f: invokevirtual net/minecraft/class_1703.method_7611 (I)Lnet/minecraft/class_1735;
// 42: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 45: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 48: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 4d: pop
// 4e: iinc 7 1
// 51: aload 6
// 53: ifnonnull 1d
// 56: lload 1
// 57: lconst_0
// 58: lcmp
// 59: ifle 51
// 5c: return
}

private final void c(Map param1, int param2, int param3, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
//   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
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
// 18: getstatic su/catlean/_n.a J
// 1b: lxor
// 1c: lstore 5
// 1e: lload 5
// 20: dup2
// 21: ldc2_w 138310258489141
// 24: lxor
// 25: lstore 7
// 27: pop2
// 28: ldc2_w -6517020957448174958
// 2b: lload 5
// 2d: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: bipush 0
// 33: istore 10
// 35: astore 9
// 37: iload 10
// 39: sipush 930
// 3c: ldc2_w 3445781852107054577
// 3f: lload 5
// 41: lxor
// 42: invokedynamic b (IJ)I bsm=su/catlean/_n.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: if_icmpge 7c
// 4a: lload 7
// 4c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4f: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 52: iload 10
// 54: lload 7
// 56: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 59: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 5c: invokevirtual net/minecraft/class_1703.method_37421 ()I
// 5f: aload 1
// 60: iload 10
// 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 65: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 6a: dup
// 6b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6e: checkcast net/minecraft/class_1799
// 71: invokevirtual net/minecraft/class_1703.method_7619 (IILnet/minecraft/class_1799;)V
// 74: iinc 10 1
// 77: aload 9
// 79: ifnonnull 37
// 7c: iload 2
// 7d: ifle 77
// 80: return
}

static {
long var20 = a ^ 135887530408709L;
long var22 = var20 ^ 66427617748739L;
long var24 = var20 ^ 83245950191377L;
vm.a<"Å">(null, 4217146355126499820L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "\u000eÜÙw32¼]\u009e`\u0086H\u0099,Q\nþÿ\u0002Æ\u0010\u008fÚ\u0083¼ö\u00ad«´=Fz\u0010_\"¼Ð÷Ý\b3?Ùä\u0006~\u008a\u00adÜ\u00106W\u0083mIë\rÏx}V¡\u0012\u0097©\u001a ÅÌÂµ\\\u001b\u0018JºGi\u0091\u009f}\u00076´ñD{`¡\u0004H¹ÿ\u0095m×ë\u001e¿\u0010×Ë\u0087\fx\u008b?¾\u009c\u000f\"b\fWÄ¼@*z\u0005®l\u0019\u0082\u0082è\u000bG\u001aêH \u00ade)t\u0092f\u0014[z÷Ú32¤ÉªHè<\u008f\u0019+$Oñ<\u0085\u008d#VæTN\u0016Úí,Jû<D\u007f\u0012\u0093Ì\u0096ZÐ\u008c\u0010ó\u000e\u0081\n\u008aP\u008dr3À¥Q\u0089\u0086¹\u0099 æ\u009föIÙ\u0092\u0004\u009bXã\tMDÊn±\u0000;Ë\u000f\u0084`u\u0013A\u0016r·ô¹\u0094\u0014 îâpt°\u009e·ÊêØübw\u008d¤m,Â|¬\u0092¨©\u00914õh\u009aw\u0082\u0000V";
int var17 = "\u000eÜÙw32¼]\u009e`\u0086H\u0099,Q\nþÿ\u0002Æ\u0010\u008fÚ\u0083¼ö\u00ad«´=Fz\u0010_\"¼Ð÷Ý\b3?Ùä\u0006~\u008a\u00adÜ\u00106W\u0083mIë\rÏx}V¡\u0012\u0097©\u001a ÅÌÂµ\\\u001b\u0018JºGi\u0091\u009f}\u00076´ñD{`¡\u0004H¹ÿ\u0095m×ë\u001e¿\u0010×Ë\u0087\fx\u008b?¾\u009c\u000f\"b\fWÄ¼@*z\u0005®l\u0019\u0082\u0082è\u000bG\u001aêH \u00ade)t\u0092f\u0014[z÷Ú32¤ÉªHè<\u008f\u0019+$Oñ<\u0085\u008d#VæTN\u0016Úí,Jû<D\u007f\u0012\u0093Ì\u0096ZÐ\u008c\u0010ó\u000e\u0081\n\u008aP\u008dr3À¥Q\u0089\u0086¹\u0099 æ\u009föIÙ\u0092\u0004\u009bXã\tMDÊn±\u0000;Ë\u000f\u0084`u\u0013A\u0016r·ô¹\u0094\u0014 îâpt°\u009e·ÊêØübw\u008d¤m,Â|¬\u0092¨©\u00914õh\u009aw\u0082\u0000V"
.length();
char var14 = ' ';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
g = new String[11];
l = new HashMap(13);
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
String var4 = "\u0017jÅx8P\u009fB¡\u008e°²ÍÐ \u0015";
int var5 = "\u0017jÅx8P\u009fB¡\u008e°²ÍÐ \u0015".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
i = var6;
j = new Integer[4];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(_n.class, b<"m">(29256, 3082603230057403994L ^ var20), b<"m">(14238, 2943157118245000078L ^ var20), 0))
};
O = var26;
e = new _n(var22);
F = yp.L(e, b<"m">(29140, 4491878986860402117L ^ var20), su.NONE, null, null, c<"b">(17034, 4603028648168571894L ^ var20), null, var24);
V = CollectionsKt.emptyList();
c = new LinkedList();
k = new AtomicBoolean();
U = new LinkedHashMap();
d = new LinkedHashMap();
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "\u008b\u0006|9å5\u0081\u009aü²¢DìÕ!\u0005";
var5 = "\u008b\u0006|9å5\u0081\u009aü²¢DìÕ!\u0005".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "®°-®T\u0005\n½yemGîgoÞPäòkOb©\u0014#\u001aÍ»\u00128\u0099ÍÉ#\u0098,\u008a,¡|_ts{\u001crkµ\u0094;i\u0089KñÏfV\u001bÆv\u0089/\u0003gû\u0092\rÆ~%\r\u0001a\u0085\u0093\rwþ&\u0080QÞ¡\u001aÌç¦q]\u001d\\Záæ\u009d\u008eãô\u0095g!Ùx´CE0ªÔØ\u0085Çtè7h\u0015QJô\u009av\u0012\rM\u0015@V\u0010eÞÌFÉÑnà\u007f»9ÖÈi\u0087Ï";
var17 = "®°-®T\u0005\n½yemGîgoÞPäòkOb©\u0014#\u001aÍ»\u00128\u0099ÍÉ#\u0098,\u008a,¡|_ts{\u001crkµ\u0094;i\u0089KñÏfV\u001bÆv\u0089/\u0003gû\u0092\rÆ~%\r\u0001a\u0085\u0093\rwþ&\u0080QÞ¡\u001aÌç¦q]\u001d\\Záæ\u009d\u008eãô\u0095g!Ùx´CE0ªÔØ\u0085Çtè7h\u0015QJô\u009av\u0012\rM\u0015@V\u0010eÞÌFÉÑnà\u007f»9ÖÈi\u0087Ï"
.length();
var14 = 128;
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
var10001 = 0;
}
}
}

public static void Y(_g[] var0) {
m = var0;
}

public static _g[] M() {
return m;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24418;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_n", var10);
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
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/_n" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14857;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_n", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/_n" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
