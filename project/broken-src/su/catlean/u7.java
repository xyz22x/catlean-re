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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u7 extends _g {
@NotNull
public static final u7 G;
static final KProperty[] K;
@NotNull
private static final cw A;
@NotNull
private static final cw J;
@NotNull
private static final c8 w;
@NotNull
private static final cq o;
@NotNull
private static final cq h;
@NotNull
private static final cq c;
@NotNull
private static final cq i;
@NotNull
private static final cq L;
@NotNull
private static final cq g;
@NotNull
private static final bg W;
private static boolean e;
private static int u;
private static int k;
private static boolean j;
private static final long a = yz.a(2583107197582518083L, 377041133615913263L, MethodHandles.lookup().lookupClass()).a(13217624884272L);
private static final String[] b;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

private u7(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 70142685120227L;
super(b<"m">(2500, 3810197544761772950L ^ var1), jt.V(), null, 4, null, var3);
}

private final lh n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 88662254727012L;
return (lh)A.E(this, var3, K[0]);
}

private final mo e(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 47219425717710L;
return (mo)J.E(this, var5, K[1]);
}

private final int z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 44909745821283L;
return ((Number)w.E(this, var3, K[2])).intValue();
}

private final boolean j(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 62285603029081L;
return (Boolean)o.E(this, var6, K[3]);
}

private final boolean G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 74502028888792L;
return (Boolean)h.E(this, var3, K[4]);
}

private final boolean P(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 123495054977910L;
return (Boolean)c.E(this, var6, K[5]);
}

private final boolean T(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 78035368524797L;
return (Boolean)i.E(this, var6, K[c<"n">(24654, 7694470171334181275L ^ var4)]);
}

private final boolean W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 17543113813653L;
return (Boolean)L.E(this, var3, K[c<"n">(1115, 4573794888152903919L ^ var1)]);
}

private final boolean C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 27969775140654L;
return (Boolean)g.E(this, var3, K[c<"n">(712, 9197782512973752280L ^ var1)]);
}

@Flow
public final void M(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u7.a J
// 003: ldc2_w 130224076572371
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 66297174993214
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 59595145129628
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 37648093841296
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
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
// 03e: ldc2_w 102351063160728
// 041: lxor
// 042: lstore 11
// 044: dup2
// 045: ldc2_w 123461508608298
// 048: lxor
// 049: dup2
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 13
// 050: dup2
// 051: bipush 32
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 14
// 05a: dup2
// 05b: bipush 48
// 05d: lshl
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 15
// 064: pop2
// 065: dup2
// 066: ldc2_w 12959041906499
// 069: lxor
// 06a: lstore 16
// 06c: dup2
// 06d: ldc2_w 50657184338159
// 070: lxor
// 071: lstore 18
// 073: dup2
// 074: ldc2_w 129135770927119
// 077: lxor
// 078: lstore 20
// 07a: dup2
// 07b: ldc2_w 104459928480063
// 07e: lxor
// 07f: lstore 22
// 081: dup2
// 082: ldc2_w 77936339493281
// 085: lxor
// 086: dup2
// 087: bipush 32
// 089: lushr
// 08a: l2i
// 08b: istore 24
// 08d: dup2
// 08e: bipush 32
// 090: lshl
// 091: bipush 48
// 093: lushr
// 094: l2i
// 095: istore 25
// 097: dup2
// 098: bipush 48
// 09a: lshl
// 09b: bipush 48
// 09d: lushr
// 09e: l2i
// 09f: istore 26
// 0a1: pop2
// 0a2: dup2
// 0a3: ldc2_w 62964390929474
// 0a6: lxor
// 0a7: lstore 27
// 0a9: dup2
// 0aa: ldc2_w 15485068954254
// 0ad: lxor
// 0ae: dup2
// 0af: bipush 8
// 0b1: lushr
// 0b2: lstore 29
// 0b4: dup2
// 0b5: bipush 56
// 0b7: lshl
// 0b8: bipush 56
// 0ba: lushr
// 0bb: l2i
// 0bc: istore 31
// 0be: pop2
// 0bf: dup2
// 0c0: ldc2_w 24168119182634
// 0c3: lxor
// 0c4: dup2
// 0c5: bipush 32
// 0c7: lushr
// 0c8: l2i
// 0c9: istore 32
// 0cb: dup2
// 0cc: bipush 32
// 0ce: lshl
// 0cf: bipush 48
// 0d1: lushr
// 0d2: l2i
// 0d3: istore 33
// 0d5: dup2
// 0d6: bipush 48
// 0d8: lshl
// 0d9: bipush 48
// 0db: lushr
// 0dc: l2i
// 0dd: istore 34
// 0df: pop2
// 0e0: dup2
// 0e1: ldc2_w 112235330676147
// 0e4: lxor
// 0e5: lstore 35
// 0e7: dup2
// 0e8: ldc2_w 49383441895020
// 0eb: lxor
// 0ec: lstore 37
// 0ee: dup2
// 0ef: ldc2_w 104813155425658
// 0f2: lxor
// 0f3: lstore 39
// 0f5: pop2
// 0f6: ldc2_w -289002887412127498
// 0f9: lload 2
// 0fa: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: aload 1
// 100: ldc "e"
// 102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 105: astore 41
// 107: lload 22
// 109: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10c: getfield net/minecraft/class_746.field_6012 I
// 10f: bipush 5
// 110: aload 41
// 112: ifnull 13a
// 115: if_icmpge 136
// 118: goto 125
// 11b: ldc2_w -291883547606096564
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: bipush 0
// 126: putstatic su/catlean/u7.k I
// 129: goto 136
// 12c: ldc2_w -291883547606096564
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: getstatic su/catlean/u7.u I
// 139: bipush 1
// 13a: aload 41
// 13c: ifnull 174
// 13f: if_icmpne 170
// 142: goto 14f
// 145: ldc2_w -291883547606096564
// 148: lload 2
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: sipush 22073
// 152: ldc2_w 1697549790866487890
// 155: lload 2
// 156: lxor
// 157: invokedynamic n (IJ)I bsm=su/catlean/u7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: putstatic su/catlean/u7.u I
// 15f: aload 0
// 160: lload 16
// 162: invokespecial su/catlean/u7.K (J)V
// 165: return
// 166: ldc2_w -291883547606096564
// 169: lload 2
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: getstatic su/catlean/u7.u I
// 173: bipush 2
// 174: aload 41
// 176: ifnull 1c8
// 179: if_icmpne 1b2
// 17c: goto 189
// 17f: ldc2_w -291883547606096564
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: lload 22
// 18b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 18e: invokevirtual net/minecraft/class_746.method_6043 ()V
// 191: sipush 6118
// 194: ldc2_w 4385988767604472724
// 197: lload 2
// 198: lxor
// 199: invokedynamic n (IJ)I bsm=su/catlean/u7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: putstatic su/catlean/u7.u I
// 1a1: aload 0
// 1a2: lload 16
// 1a4: invokespecial su/catlean/u7.K (J)V
// 1a7: return
// 1a8: ldc2_w -291883547606096564
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: getstatic su/catlean/u7.u I
// 1b5: aload 41
// 1b7: ifnull 1ea
// 1ba: bipush 3
// 1bb: goto 1c8
// 1be: ldc2_w -291883547606096564
// 1c1: lload 2
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: if_icmpne 1e4
// 1cb: bipush 0
// 1cc: putstatic su/catlean/u7.j Z
// 1cf: bipush 0
// 1d0: putstatic su/catlean/u7.u I
// 1d3: aload 0
// 1d4: lload 16
// 1d6: invokespecial su/catlean/u7.K (J)V
// 1d9: return
// 1da: ldc2_w -291883547606096564
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: aload 0
// 1e5: lload 7
// 1e7: invokespecial su/catlean/u7.a (J)Z
// 1ea: aload 41
// 1ec: ifnull 6a1
// 1ef: ifeq 69e
// 1f2: goto 1ff
// 1f5: ldc2_w -291883547606096564
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 0
// 200: lload 35
// 202: invokespecial su/catlean/u7.n (J)Lsu/catlean/lh;
// 205: getstatic su/catlean/ia.W [I
// 208: swap
// 209: invokevirtual su/catlean/lh.ordinal ()I
// 20c: iaload
// 20d: tableswitch 1151 1 6 49 119 1028 1028 1050 1078
// 234: ldc2_w -291883547606096564
// 237: lload 2
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: new net/minecraft/class_2828$class_5911
// 241: dup
// 242: bipush 1
// 243: lload 22
// 245: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 248: getfield net/minecraft/class_746.field_5976 Z
// 24b: invokespecial net/minecraft/class_2828$class_5911.<init> (ZZ)V
// 24e: checkcast net/minecraft/class_2596
// 251: lload 39
// 253: dup2_x1
// 254: pop2
// 255: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 258: aload 41
// 25a: ifnonnull 706
// 25d: goto 26a
// 260: ldc2_w -291883547606096564
// 263: lload 2
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: bipush 2
// 26b: anewarray 306
// 26e: ldc2_w -326558848937758390
// 271: lload 2
// 272: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: goto 284
// 27a: ldc2_w -291883547606096564
// 27d: lload 2
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: aconst_null
// 285: astore 44
// 287: aload 0
// 288: lload 22
// 28a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 28d: iload 4
// 28f: i2b
// 290: swap
// 291: lload 5
// 293: dup2_x1
// 294: pop2
// 295: checkcast net/minecraft/class_1297
// 298: invokevirtual su/catlean/u7.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 29b: checkcast net/minecraft/class_2374
// 29e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 2a1: dup
// 2a2: sipush 10003
// 2a5: ldc2_w 8417838508604016933
// 2a8: lload 2
// 2a9: lxor
// 2aa: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2b2: astore 44
// 2b4: bipush 5
// 2b5: istore 45
// 2b7: bipush 0
// 2b8: istore 46
// 2ba: iload 46
// 2bc: iload 45
// 2be: if_icmpge 337
// 2c1: iload 46
// 2c3: istore 47
// 2c5: bipush 0
// 2c6: istore 48
// 2c8: aload 44
// 2ca: iload 47
// 2cc: invokevirtual net/minecraft/class_2338.method_10087 (I)Lnet/minecraft/class_2338;
// 2cf: dup
// 2d0: sipush 10208
// 2d3: ldc2_w 186860283040319962
// 2d6: lload 2
// 2d7: lxor
// 2d8: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e0: astore 49
// 2e2: aload 41
// 2e4: ifnull 706
// 2e7: aload 41
// 2e9: ifnull 332
// 2ec: goto 2f9
// 2ef: ldc2_w -291883547606096564
// 2f2: lload 2
// 2f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: athrow
// 2f9: lload 11
// 2fb: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2fe: aload 49
// 300: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 303: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 306: ifne 32e
// 309: goto 316
// 30c: ldc2_w -291883547606096564
// 30f: lload 2
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: aload 49
// 318: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 31b: dup
// 31c: sipush 26046
// 31f: ldc2_w 2768066407848709011
// 322: lload 2
// 323: lxor
// 324: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32c: astore 44
// 32e: nop
// 32f: iinc 46 1
// 332: aload 41
// 334: ifnonnull 2ba
// 337: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 33a: bipush 1
// 33b: anewarray 121
// 33e: astore 46
// 340: aload 46
// 342: bipush 0
// 343: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 346: dup
// 347: sipush 21387
// 34a: ldc2_w 6170099027656687035
// 34d: lload 2
// 34e: lxor
// 34f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 354: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 357: aastore
// 358: iload 32
// 35a: aload 46
// 35c: iload 33
// 35e: iload 34
// 360: i2c
// 361: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 364: astore 45
// 366: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 369: bipush 1
// 36a: anewarray 121
// 36d: astore 47
// 36f: aload 47
// 371: bipush 0
// 372: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
// 375: dup
// 376: sipush 14343
// 379: ldc2_w 6950829617574598181
// 37c: lload 2
// 37d: lxor
// 37e: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 386: aastore
// 387: iload 32
// 389: aload 47
// 38b: iload 33
// 38d: iload 34
// 38f: i2c
// 390: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 393: astore 46
// 395: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 398: bipush 1
// 399: anewarray 121
// 39c: astore 48
// 39e: aload 48
// 3a0: bipush 0
// 3a1: getstatic net/minecraft/class_1802.field_23070 Lnet/minecraft/class_1792;
// 3a4: dup
// 3a5: sipush 22169
// 3a8: ldc2_w 8582182289055529127
// 3ab: lload 2
// 3ac: lxor
// 3ad: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3b5: aastore
// 3b6: iload 32
// 3b8: aload 48
// 3ba: iload 33
// 3bc: iload 34
// 3be: i2c
// 3bf: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 3c2: astore 47
// 3c4: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 3c7: bipush 1
// 3c8: anewarray 121
// 3cb: astore 49
// 3cd: aload 49
// 3cf: bipush 0
// 3d0: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
// 3d3: dup
// 3d4: sipush 11621
// 3d7: ldc2_w 3154738317073892162
// 3da: lload 2
// 3db: lxor
// 3dc: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e4: aastore
// 3e5: iload 32
// 3e7: aload 49
// 3e9: iload 33
// 3eb: iload 34
// 3ed: i2c
// 3ee: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 3f1: astore 48
// 3f3: aload 48
// 3f5: invokevirtual su/catlean/fg.R ()Z
// 3f8: aload 41
// 3fa: ifnull 4a4
// 3fd: ifeq 492
// 400: goto 40d
// 403: ldc2_w -291883547606096564
// 406: lload 2
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: aload 0
// 40e: lload 29
// 410: iload 31
// 412: i2b
// 413: invokespecial su/catlean/u7.j (JB)Z
// 416: aload 41
// 418: ifnull 4a4
// 41b: goto 428
// 41e: ldc2_w -291883547606096564
// 421: lload 2
// 422: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 427: athrow
// 428: ifeq 492
// 42b: goto 438
// 42e: ldc2_w -291883547606096564
// 431: lload 2
// 432: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 437: athrow
// 438: getstatic su/catlean/u7.W Lsu/catlean/bg;
// 43b: sipush 23225
// 43e: ldc2_w 985601812873590479
// 441: lload 2
// 442: lxor
// 443: invokedynamic n (IJ)I bsm=su/catlean/u7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 448: lload 18
// 44a: invokevirtual su/catlean/bg.c (IJ)Z
// 44d: aload 41
// 44f: ifnull 4a4
// 452: goto 45f
// 455: ldc2_w -291883547606096564
// 458: lload 2
// 459: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45e: athrow
// 45f: ifeq 492
// 462: goto 46f
// 465: ldc2_w -291883547606096564
// 468: lload 2
// 469: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: athrow
// 46f: aload 0
// 470: lload 37
// 472: aload 48
// 474: invokespecial su/catlean/u7.q (JLsu/catlean/fg;)V
// 477: aload 0
// 478: lload 20
// 47a: invokespecial su/catlean/u7.G (J)Z
// 47d: putstatic su/catlean/u7.e Z
// 480: aload 41
// 482: ifnonnull 706
// 485: goto 492
// 488: ldc2_w -291883547606096564
// 48b: lload 2
// 48c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 491: athrow
// 492: aload 45
// 494: invokevirtual su/catlean/fg.R ()Z
// 497: goto 4a4
// 49a: ldc2_w -291883547606096564
// 49d: lload 2
// 49e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a3: athrow
// 4a4: aload 41
// 4a6: ifnull 550
// 4a9: ifeq 53e
// 4ac: goto 4b9
// 4af: ldc2_w -291883547606096564
// 4b2: lload 2
// 4b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b8: athrow
// 4b9: aload 0
// 4ba: iload 24
// 4bc: iload 25
// 4be: i2s
// 4bf: iload 26
// 4c1: i2s
// 4c2: invokespecial su/catlean/u7.P (ISS)Z
// 4c5: aload 41
// 4c7: ifnull 550
// 4ca: goto 4d7
// 4cd: ldc2_w -291883547606096564
// 4d0: lload 2
// 4d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d6: athrow
// 4d7: ifeq 53e
// 4da: goto 4e7
// 4dd: ldc2_w -291883547606096564
// 4e0: lload 2
// 4e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e6: athrow
// 4e7: getstatic su/catlean/u7.W Lsu/catlean/bg;
// 4ea: sipush 16669
// 4ed: ldc2_w 2693947888947342695
// 4f0: lload 2
// 4f1: lxor
// 4f2: invokedynamic n (IJ)I bsm=su/catlean/u7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f7: lload 18
// 4f9: invokevirtual su/catlean/bg.c (IJ)Z
// 4fc: aload 41
// 4fe: ifnull 550
// 501: goto 50e
// 504: ldc2_w -291883547606096564
// 507: lload 2
// 508: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50d: athrow
// 50e: ifeq 53e
// 511: goto 51e
// 514: ldc2_w -291883547606096564
// 517: lload 2
// 518: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51d: athrow
// 51e: aload 0
// 51f: lload 37
// 521: aload 45
// 523: invokespecial su/catlean/u7.q (JLsu/catlean/fg;)V
// 526: getstatic su/catlean/u7.W Lsu/catlean/bg;
// 529: invokevirtual su/catlean/bg.l ()V
// 52c: aload 41
// 52e: ifnonnull 706
// 531: goto 53e
// 534: ldc2_w -291883547606096564
// 537: lload 2
// 538: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53d: athrow
// 53e: aload 46
// 540: invokevirtual su/catlean/fg.R ()Z
// 543: goto 550
// 546: ldc2_w -291883547606096564
// 549: lload 2
// 54a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54f: athrow
// 550: aload 41
// 552: ifnull 5c3
// 555: ifeq 5b1
// 558: goto 565
// 55b: ldc2_w -291883547606096564
// 55e: lload 2
// 55f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 564: athrow
// 565: aload 0
// 566: iload 13
// 568: iload 14
// 56a: i2c
// 56b: iload 15
// 56d: i2c
// 56e: invokespecial su/catlean/u7.T (ICC)Z
// 571: aload 41
// 573: ifnull 5c3
// 576: goto 583
// 579: ldc2_w -291883547606096564
// 57c: lload 2
// 57d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 582: athrow
// 583: ifeq 5b1
// 586: goto 593
// 589: ldc2_w -291883547606096564
// 58c: lload 2
// 58d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 592: athrow
// 593: aload 0
// 594: aload 46
// 596: iload 9
// 598: aload 44
// 59a: iload 10
// 59c: invokespecial su/catlean/u7.q (Lsu/catlean/fg;ILnet/minecraft/class_2338;I)V
// 59f: aload 41
// 5a1: ifnonnull 706
// 5a4: goto 5b1
// 5a7: ldc2_w -291883547606096564
// 5aa: lload 2
// 5ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b0: athrow
// 5b1: aload 47
// 5b3: invokevirtual su/catlean/fg.R ()Z
// 5b6: goto 5c3
// 5b9: ldc2_w -291883547606096564
// 5bc: lload 2
// 5bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c2: athrow
// 5c3: aload 41
// 5c5: ifnull 5fd
// 5c8: ifeq 706
// 5cb: goto 5d8
// 5ce: ldc2_w -291883547606096564
// 5d1: lload 2
// 5d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d7: athrow
// 5d8: aload 0
// 5d9: aload 41
// 5db: ifnull 601
// 5de: goto 5eb
// 5e1: ldc2_w -291883547606096564
// 5e4: lload 2
// 5e5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ea: athrow
// 5eb: lload 27
// 5ed: invokespecial su/catlean/u7.W (J)Z
// 5f0: goto 5fd
// 5f3: ldc2_w -291883547606096564
// 5f6: lload 2
// 5f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fc: athrow
// 5fd: ifeq 706
// 600: aload 0
// 601: aload 47
// 603: iload 9
// 605: aload 44
// 607: iload 10
// 609: invokespecial su/catlean/u7.q (Lsu/catlean/fg;ILnet/minecraft/class_2338;I)V
// 60c: aload 41
// 60e: ifnonnull 706
// 611: bipush 1
// 612: putstatic su/catlean/u7.j Z
// 615: aload 41
// 617: ifnonnull 706
// 61a: goto 627
// 61d: ldc2_w -291883547606096564
// 620: lload 2
// 621: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 626: athrow
// 627: bipush 1
// 628: putstatic su/catlean/u7.j Z
// 62b: aload 0
// 62c: lload 16
// 62e: invokespecial su/catlean/u7.K (J)V
// 631: aload 41
// 633: ifnonnull 706
// 636: goto 643
// 639: ldc2_w -291883547606096564
// 63c: lload 2
// 63d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 642: athrow
// 643: lload 22
// 645: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 648: astore 45
// 64a: bipush 0
// 64b: istore 46
// 64d: new net/minecraft/class_2828$class_2830
// 650: dup
// 651: aload 45
// 653: invokevirtual net/minecraft/class_746.method_23317 ()D
// 656: aload 45
// 658: invokevirtual net/minecraft/class_746.method_23318 ()D
// 65b: ldc2_w 1.0E-9
// 65e: dadd
// 65f: aload 45
// 661: invokevirtual net/minecraft/class_746.method_23321 ()D
// 664: aload 45
// 666: invokevirtual net/minecraft/class_746.method_36454 ()F
// 669: aload 45
// 66b: invokevirtual net/minecraft/class_746.method_36455 ()F
// 66e: bipush 0
// 66f: aload 45
// 671: getfield net/minecraft/class_746.field_5976 Z
// 674: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 677: checkcast net/minecraft/class_2596
// 67a: lload 39
// 67c: dup2_x1
// 67d: pop2
// 67e: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 681: aload 45
// 683: invokevirtual net/minecraft/class_746.method_38785 ()V
// 686: nop
// 687: aload 41
// 689: ifnonnull 706
// 68c: new kotlin/NoWhenBranchMatchedException
// 68f: dup
// 690: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 693: athrow
// 694: ldc2_w -291883547606096564
// 697: lload 2
// 698: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69d: athrow
// 69e: getstatic su/catlean/u7.e Z
// 6a1: ifeq 706
// 6a4: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 6a7: bipush 1
// 6a8: anewarray 121
// 6ab: astore 43
// 6ad: aload 43
// 6af: bipush 0
// 6b0: getstatic net/minecraft/class_1802.field_8550 Lnet/minecraft/class_1792;
// 6b3: dup
// 6b4: sipush 4078
// 6b7: ldc2_w 5820364411683889615
// 6ba: lload 2
// 6bb: lxor
// 6bc: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6c4: aastore
// 6c5: iload 32
// 6c7: aload 43
// 6c9: iload 33
// 6cb: iload 34
// 6cd: i2c
// 6ce: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 6d1: astore 42
// 6d3: aload 42
// 6d5: invokevirtual su/catlean/fg.R ()Z
// 6d8: aload 41
// 6da: ifnull 703
// 6dd: ifeq 702
// 6e0: goto 6ed
// 6e3: ldc2_w -291883547606096564
// 6e6: lload 2
// 6e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ec: athrow
// 6ed: aload 0
// 6ee: lload 37
// 6f0: aload 42
// 6f2: invokespecial su/catlean/u7.q (JLsu/catlean/fg;)V
// 6f5: goto 702
// 6f8: ldc2_w -291883547606096564
// 6fb: lload 2
// 6fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 701: athrow
// 702: bipush 0
// 703: putstatic su/catlean/u7.e Z
// 706: return
}

private final void q(long var1, fg var3) {
var1 = a ^ var1;
long var4 = var1 ^ 80495072620600L;
long var6 = var1 ^ 109607861832051L;
long var8 = var1 ^ 120055638318528L;
long var10 = var1 ^ 114271359769552L;
_8.P.C(var4, new t5(new _w(zf.v(var10).method_36454(), var6, 90.0F, false, null, c<"n">(528, 8979426153559612545L ^ var1), null), var8, 0, u7::O, 2, null));
}

private final void q(fg var1, int var2, class_2338 var3, int var4) {
long var5 = ((long)var2 << 32 | (long)var4 << 32 >>> 32) ^ a;
long var7 = var5 ^ 28554508455658L;
long var9 = var5 ^ 79035517647300L;
long var11 = var5 ^ 110754657570551L;
long var13 = var5 ^ 115695749632556L;
String var15 = vm.a<"Å">(-4544563722850544667L, var5);

gw var10000;
class_2338 var10001;
int var10002;
xx var10003;
label38: {
try {
var10000 = gw.Y;
var10001 = var3;
var10002 = var1.a();
if (this.C(var7)) {
var10003 = xx.GRIM;
break label38;
}
} catch (NoWhenBranchMatchedException var20) {
throw vm.a<"Å">(var20, -4548579216734986657L, var5);
}

var10003 = xx.Strict;
}

t5 var16 = gw.P(
var10000,
var10001,
var10002,
var10003,
zr.Normal,
y4.ALL,
(float)zf.v(var13).method_55754(),
0.0F,
c<"n">(12952, 1365171996376983026L ^ var5),
var11,
yi.Silent,
null,
false,
c<"n">(9732, 2958668976395383140L ^ var5),
null
);

try {
if (var15 == null || var16 == null) {
return;
}
} catch (NoWhenBranchMatchedException var19) {
throw vm.a<"Å">(var19, -4548579216734986657L, var5);
}

boolean var18 = false;
_8.P.C(var9, var16);
W.l();
}

private final boolean a(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u7.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 102882712958214
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 68669933171974
// 011: lxor
// 012: dup2
// 013: bipush 32
// 015: lushr
// 016: l2i
// 017: istore 5
// 019: dup2
// 01a: bipush 32
// 01c: lshl
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 6
// 023: pop2
// 024: dup2
// 025: ldc2_w 74926204860332
// 028: lxor
// 029: lstore 7
// 02b: dup2
// 02c: ldc2_w 66374602051243
// 02f: lxor
// 030: lstore 9
// 032: dup2
// 033: ldc2_w 137678233877280
// 036: lxor
// 037: lstore 11
// 039: pop2
// 03a: ldc2_w -1593602116538336535
// 03d: lload 1
// 03e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: astore 13
// 045: lload 3
// 046: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 049: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 04c: aload 13
// 04e: ifnull 073
// 051: ifnull 0b8
// 054: goto 061
// 057: ldc2_w -1590853397706213549
// 05a: lload 1
// 05b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: athrow
// 061: lload 11
// 063: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 066: goto 073
// 069: ldc2_w -1590853397706213549
// 06c: lload 1
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 076: aload 13
// 078: ifnull 0b9
// 07b: ifne 0b8
// 07e: goto 08b
// 081: ldc2_w -1590853397706213549
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 11
// 08d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 090: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 093: getfield net/minecraft/class_1656.field_7479 Z
// 096: aload 13
// 098: ifnull 0b9
// 09b: goto 0a8
// 09e: ldc2_w -1590853397706213549
// 0a1: lload 1
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: ifeq 0ba
// 0ab: goto 0b8
// 0ae: ldc2_w -1590853397706213549
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: bipush 0
// 0b9: ireturn
// 0ba: aload 0
// 0bb: lload 1
// 0bc: lconst_0
// 0bd: lcmp
// 0be: ifle 111
// 0c1: aload 13
// 0c3: ifnull 111
// 0c6: lload 7
// 0c8: invokespecial su/catlean/u7.n (J)Lsu/catlean/lh;
// 0cb: getstatic su/catlean/lh.GrimOld Lsu/catlean/lh;
// 0ce: if_acmpne 110
// 0d1: goto 0de
// 0d4: ldc2_w -1590853397706213549
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0e1: invokevirtual su/catlean/dm.o ()D
// 0e4: ldc2_w 3.0
// 0e7: dcmpl
// 0e8: aload 13
// 0ea: ifnull 10b
// 0ed: goto 0fa
// 0f0: ldc2_w -1590853397706213549
// 0f3: lload 1
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: ifle 10e
// 0fd: goto 10a
// 100: ldc2_w -1590853397706213549
// 103: lload 1
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: bipush 1
// 10b: goto 10f
// 10e: bipush 0
// 10f: ireturn
// 110: aload 0
// 111: iload 5
// 113: iload 6
// 115: invokespecial su/catlean/u7.e (II)Lsu/catlean/mo;
// 118: getstatic su/catlean/ia.n [I
// 11b: swap
// 11c: invokevirtual su/catlean/mo.ordinal ()I
// 11f: iaload
// 120: aload 13
// 122: lload 1
// 123: lconst_0
// 124: lcmp
// 125: iflt 167
// 128: ifnull 165
// 12b: tableswitch 165 1 2 31 97
// 140: ldc2_w -1590853397706213549
// 143: lload 1
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 14d: invokevirtual su/catlean/dm.o ()D
// 150: aload 0
// 151: lload 9
// 153: invokespecial su/catlean/u7.z (J)I
// 156: i2d
// 157: dcmpl
// 158: goto 165
// 15b: ldc2_w -1590853397706213549
// 15e: lload 1
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: aload 13
// 167: ifnull 189
// 16a: ifle 188
// 16d: goto 17a
// 170: ldc2_w -1590853397706213549
// 173: lload 1
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: bipush 1
// 17b: goto 1d8
// 17e: ldc2_w -1590853397706213549
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: bipush 0
// 189: goto 1d8
// 18c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 18f: invokevirtual su/catlean/dm.o ()D
// 192: bipush 3
// 193: i2d
// 194: dsub
// 195: fconst_2
// 196: f2d
// 197: ddiv
// 198: ldc 3.5
// 19a: f2d
// 19b: dadd
// 19c: lload 11
// 19e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a1: invokevirtual net/minecraft/class_746.method_6032 ()F
// 1a4: ldc 3.0
// 1a6: fdiv
// 1a7: f2d
// 1a8: dcmpl
// 1a9: aload 13
// 1ab: ifnull 1cd
// 1ae: ifle 1cc
// 1b1: goto 1be
// 1b4: ldc2_w -1590853397706213549
// 1b7: lload 1
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: bipush 1
// 1bf: goto 1d8
// 1c2: ldc2_w -1590853397706213549
// 1c5: lload 1
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: bipush 0
// 1cd: goto 1d8
// 1d0: new kotlin/NoWhenBranchMatchedException
// 1d3: dup
// 1d4: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 1d7: athrow
// 1d8: ireturn
}

@Flow
public final void L(@NotNull SendPacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u7.a J
// 003: ldc2_w 90854223985344
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 73402356881824
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 136137486259500
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: ldc2_w -8651866000854051611
// 01b: lload 2
// 01c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: aload 1
// 022: ldc "e"
// 024: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 027: astore 8
// 029: aload 1
// 02a: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 02d: instanceof net/minecraft/class_2828
// 030: ifeq 19e
// 033: aload 0
// 034: lload 4
// 036: invokespecial su/catlean/u7.n (J)Lsu/catlean/lh;
// 039: getstatic su/catlean/lh.GRIM_NEW Lsu/catlean/lh;
// 03c: if_acmpne 08f
// 03f: goto 04c
// 042: ldc2_w -8655881494486312609
// 045: lload 2
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: getstatic su/catlean/u7.k I
// 04f: aload 8
// 051: ifnull 08c
// 054: goto 061
// 057: ldc2_w -8655881494486312609
// 05a: lload 2
// 05b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: athrow
// 061: sipush 16802
// 064: ldc2_w 7437675496838156736
// 067: lload 2
// 068: lxor
// 069: invokedynamic n (IJ)I bsm=su/catlean/u7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: if_icmpge 08f
// 071: goto 07e
// 074: ldc2_w -8655881494486312609
// 077: lload 2
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: bipush 1
// 07f: goto 08c
// 082: ldc2_w -8655881494486312609
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: goto 090
// 08f: bipush 0
// 090: istore 9
// 092: getstatic su/catlean/u7.j Z
// 095: aload 8
// 097: ifnull 0ac
// 09a: ifeq 19e
// 09d: goto 0aa
// 0a0: ldc2_w -8655881494486312609
// 0a3: lload 2
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: iload 9
// 0ac: ifeq 10f
// 0af: aload 1
// 0b0: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0b3: dup
// 0b4: sipush 10268
// 0b7: ldc2_w 2752118528090061364
// 0ba: lload 2
// 0bb: lxor
// 0bc: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0c4: checkcast su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor
// 0c7: lload 6
// 0c9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cc: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0cf: aload 8
// 0d1: ifnull 0f2
// 0d4: goto 0e1
// 0d7: ldc2_w -8655881494486312609
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: ifne 0f5
// 0e4: goto 0f1
// 0e7: ldc2_w -8655881494486312609
// 0ea: lload 2
// 0eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: athrow
// 0f1: bipush 1
// 0f2: goto 0f6
// 0f5: bipush 0
// 0f6: invokeinterface su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor.setGround (Z)V 2
// 0fb: getstatic su/catlean/u7.k I
// 0fe: istore 10
// 100: iload 10
// 102: bipush 1
// 103: iadd
// 104: putstatic su/catlean/u7.k I
// 107: iload 10
// 109: pop
// 10a: aload 8
// 10c: ifnonnull 13a
// 10f: aload 1
// 110: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 113: dup
// 114: sipush 19591
// 117: ldc2_w 784260873754730173
// 11a: lload 2
// 11b: lxor
// 11c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 124: checkcast su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor
// 127: bipush 0
// 128: invokeinterface su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor.setGround (Z)V 2
// 12d: goto 13a
// 130: ldc2_w -8655881494486312609
// 133: lload 2
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: lload 6
// 13c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13f: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 142: aload 8
// 144: ifnull 15a
// 147: ifeq 19e
// 14a: goto 157
// 14d: ldc2_w -8655881494486312609
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: getstatic su/catlean/u7.u I
// 15a: ifne 19e
// 15d: aload 0
// 15e: lload 4
// 160: invokespecial su/catlean/u7.n (J)Lsu/catlean/lh;
// 163: getstatic su/catlean/lh.GRIM_NEW Lsu/catlean/lh;
// 166: if_acmpne 19e
// 169: goto 176
// 16c: ldc2_w -8655881494486312609
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: iload 9
// 178: aload 8
// 17a: ifnull 19b
// 17d: goto 18a
// 180: ldc2_w -8655881494486312609
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: ifne 19e
// 18d: goto 19a
// 190: ldc2_w -8655881494486312609
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: bipush 1
// 19b: putstatic su/catlean/u7.u I
// 19e: ldc2_w -8713666898566342269
// 1a1: lload 2
// 1a2: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: ifnull 1c2
// 1aa: ldc "hmW7Qc"
// 1ac: ldc2_w -8691798895296719922
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: goto 1c2
// 1b8: ldc2_w -8655881494486312609
// 1bb: lload 2
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: return
}

private final void K(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 106003818183897L;
long var5 = var1 ^ 71250929742591L;
zf.v(var5).method_5728(false);
zf.F(var3).field_1690.field_1894.method_23481(false);
zf.F(var3).field_1690.field_1881.method_23481(false);
zf.F(var3).field_1690.field_1913.method_23481(false);
zf.F(var3).field_1690.field_1849.method_23481(false);
zf.F(var3).field_1690.field_1903.method_23481(false);
}

@Override
public void O(long var1) {
j = false;
}

private static final boolean w() {
long var0 = a ^ 33007234150993L;
int var2 = (int)((var0 ^ 127781845996443L) >>> 32);
int var3 = (int)((var0 ^ 127781845996443L) << 32 >>> 32);

try {
if (G.e(var2, var3) == mo.Custom) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -3498895586532503090L, var0);
}

return false;
}

private static final boolean r() {
long var0 = a ^ 73877691823196L;
long var2 = var0 ^ 91616102881084L;

try {
if (G.n(var2) == lh.Items) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 5295160267807184835L, var0);
}

return false;
}

private static final boolean I() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u7.a J
// 03: ldc2_w 28044393254986
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 107635533847575
// 0d: lxor
// 0e: dup2
// 0f: bipush 8
// 11: lushr
// 12: lstore 2
// 13: dup2
// 14: bipush 56
// 16: lshl
// 17: bipush 56
// 19: lushr
// 1a: l2i
// 1b: istore 4
// 1d: pop2
// 1e: dup2
// 1f: ldc2_w 10868092728106
// 22: lxor
// 23: lstore 5
// 25: pop2
// 26: ldc2_w -5952581585504649617
// 29: lload 0
// 2a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: astore 7
// 31: getstatic su/catlean/u7.G Lsu/catlean/u7;
// 34: aload 7
// 36: ifnull 61
// 39: lload 5
// 3b: invokespecial su/catlean/u7.n (J)Lsu/catlean/lh;
// 3e: getstatic su/catlean/lh.Items Lsu/catlean/lh;
// 41: if_acmpne 81
// 44: goto 51
// 47: ldc2_w -5950826842400082987
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: getstatic su/catlean/u7.G Lsu/catlean/u7;
// 54: goto 61
// 57: ldc2_w -5950826842400082987
// 5a: lload 0
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: lload 2
// 62: iload 4
// 64: i2b
// 65: invokespecial su/catlean/u7.j (JB)Z
// 68: aload 7
// 6a: ifnull 7e
// 6d: ifeq 81
// 70: goto 7d
// 73: ldc2_w -5950826842400082987
// 76: lload 0
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 1
// 7e: goto 82
// 81: bipush 0
// 82: ireturn
}

private static final boolean s() {
long var0 = a ^ 90720037965404L;
long var2 = var0 ^ 73536608955708L;

try {
if (G.n(var2) == lh.Items) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -5513494975853613629L, var0);
}

return false;
}

private static final boolean V() {
long var0 = a ^ 114304477530550L;
long var2 = var0 ^ 131487757298390L;

try {
if (G.n(var2) == lh.Items) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 3789239157759191593L, var0);
}

return false;
}

private static final boolean F() {
long var0 = a ^ 14712037467350L;
long var2 = var0 ^ 31897062410166L;

try {
if (G.n(var2) == lh.Items) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -2740864351165528247L, var0);
}

return false;
}

private static final boolean Z() {
long var0 = a ^ 31598148941314L;
long var2 = var0 ^ 14151659689314L;

try {
if (G.n(var2) == lh.Items) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -3809359496077486691L, var0);
}

return false;
}

private static final Unit O(fg param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u7.a J
// 03: ldc2_w 70858319187859
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 135625241489591
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 74275287752414
// 13: lxor
// 14: lstore 5
// 16: dup2
// 17: ldc2_w 121441701686379
// 1a: lxor
// 1b: lstore 7
// 1d: dup2
// 1e: ldc2_w 91265735342723
// 21: lxor
// 22: lstore 9
// 24: dup2
// 25: ldc2_w 115451469013119
// 28: lxor
// 29: lstore 11
// 2b: pop2
// 2c: ldc2_w 8267895772765118902
// 2f: lload 1
// 30: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 38: lload 5
// 3a: invokevirtual su/catlean/gg.o (J)V
// 3d: astore 13
// 3f: aload 0
// 40: lload 9
// 42: invokevirtual su/catlean/fg.x (J)V
// 45: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 48: lload 11
// 4a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4d: invokevirtual net/minecraft/class_746.method_36454 ()F
// 50: lload 3
// 51: ldc 90.0
// 53: invokestatic su/catlean/ag.x (Lnet/minecraft/class_1268;FJF)Lnet/minecraft/class_1269;
// 56: astore 14
// 58: aload 13
// 5a: ifnull 9b
// 5d: aload 14
// 5f: getstatic net/minecraft/class_1269.field_5811 Lnet/minecraft/class_1269$class_9859;
// 62: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 65: ifne 88
// 68: goto 75
// 6b: ldc2_w 8265006316176206860
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: getstatic su/catlean/u7.W Lsu/catlean/bg;
// 78: invokevirtual su/catlean/bg.l ()V
// 7b: goto 88
// 7e: ldc2_w 8265006316176206860
// 81: lload 1
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: lload 11
// 8a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8d: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 90: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 93: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 96: lload 7
// 98: invokevirtual su/catlean/gg.d (J)V
// 9b: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 9e: areturn
}

static {
long var20 = a ^ 68673379558980L;
long var22 = var20 ^ 35783192883326L;
long var24 = var20 ^ 69483070787955L;
long var26 = var20 ^ 18238157626389L;
long var28 = var20 ^ 90073388623521L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[38];
int var16 = 0;
String var15 = "ÚµÕ\u008695HGÚÕ½J©ia\u000fXH\u0013\u0085ðDLò\u0090v¿¨,,ç\u000e ºJT%iýàUNõ\u00014²1\u008b\u0093\u008fÕ)Ëv¨#m¨:#z\u0011Ü\u009f¿¦ý÷§ð[÷.ÅÑAç\u009d` Ôð\u009fÀ{$oP¸\u0088çÝÖ\u009c:\u0016\ruT\u0086\u0095gOc3)¶åV\u0003\u0016ÆM`ynl9zü6xg\u0006õð3\u0017'v\u007f\u0088\u0083\"\u0093´\u001d|äz\u009d\u0093\u008e¤\u001c9\u008f·×+Ï\u0092h.p%ø\u0017<\u0085\u0087E²¤\u008eå\u0099Ww§÷\u0005¸¨j®Sr#º÷\fì\u008a¡ ª\u009b[!}²K\u0010¨HÃ M1\u0084\u008e¯\u0091Ï\u0018\\\u001e\u0015\u008a\u0010<a\u0093¸\u0014!}õK\u0094,»\u0019c«( bÌ§!í\u0083?ä\u0091Ï*ªð÷ÂÎão\u0016l'\u001cè°\u000bïF.\u009drâ\u001f\u0018\u0096\u001daÝæ-²x>_ÎiÄ=\u001fj\u008cnº§©(\u0092\u001a\u0018ú\u001f?¢e\u0090\u0080~§'\u0087_Mâ\u0090òez\u0086\u0097Ñtøª Þ\u009aÑVÿ\u001d\u009f\u008e·\u0091\u0013f/\u0093K\\åvõQV\u009bªÔxV^ã\u0089²A® ÄÃÜiè\u009b\u001e!n\u0099\u001bÃ#Ø\u0003§'\u0018·0Äç¼ñ\u0081\u001a\u009b\\é\u0082ïC \r\u000e7¶æ\fpÊ°,É\u008a\u0000Ø~\u009bê²Ùm\u0097\u0086ßà\u007f'}¸{øó\u0080 ývª½b\u0006Ó\bËÚð\né!Ü¬²ãÚMFPb;Óñ4\u001f\u0002\u00adÒ.(0\u0000\u00966\u009e·\u0010\u0007»é²\u0003ºÌ·s×:ÿ¨Rh\u0015\u009bú¬\\øwÃ\u008d\u000b\u0084\u008eØõÀÜeÎ\u00186ïÙÈ\u0093T\u0086ò\bd`¤dò.\u008fø\u008bp2µjæ\u0092 ¶\u008bsE¢:ãÐ~p¤/¥\u0000Î\u008b\\\táÔ ®n^Ê\b\u0005\u0013ò¦óF\u0018S\u008a/ÖI\u007fïmd2uÒv4±g,}ª\u0088BüÛó Ô\u0096J?\u009c«.`a\u00ad§\u0091ÖJë\u0010\u009cæ«Z#ï¤Ô\u000e¬\u008cå\u0019ò`s8Ê\u009fÒ\u0099\u000fH\u0017Í\u0091\u0012ª3>\u0003¥Ñ³ã¯/§Å¦\u000eR^søW}G\bz3'?©,R×Ç\u0091æh¬U|îð0,\u0000\u001a'3~\u0010C¬ø\u0004ÆÈBH\u00ad ãzÀr\u0099\u0010(R\u0013\u009b1ï?9r\u0099é¨T\u000f\u0099M«\u000b'êÇ\u0003îìc\u000fª°+\u000fÈC\u008cQ\u0000¾\u0085\u009a\u0080Ý1 h_JOgÚ\\Óßû\u009b\u0001+Å>\u0098°\u0098C½¯\u0092e\u009dã\u0090¡\u009d^¿a¿éx·õ\u009c÷ñ\u0094$/T\u0011\u0013_ \u000fµ¾Fº*úÓH3«¥\u0093t¡iæLº\u0085Y±Å\u009b\u008dÅ3|rbî\rÌ\u0002=JX\u0097à\u0016Óá1\u0085G\u008aq\u008f\u0017®Â\u007f\u0093ÜSk^Ü:¼Æµo«sC\u007f~?\u00858\u000b.æF\u009f#u©L\u0084\u0092\u007f\u0091´:\u007f\u0013¹\u0080Ó\u0097¤¶':é§!u@âÿVu\u0001¤d\u0098á (à\u0018Ï#|\u0096\u0007HD<\\£Î§ùÿ\u0083IR\u009eÛêðMå\f\u0010Ç%µ«P\u0007\u001b=yØÅ\u001b\u0097lr\u0095(>{m CÓ¡7\u000e\u008a¦³Ñ\u0098^D¸'\u008f\u0085ÿWslâ÷\u0019\u0096unv&.7ØùQ\u009b\u008bÞ ¡\u008fø\u0005\u0087û\u001d×brfõêwä\\.\u0013W½~ù*4¦Hb3×]U\u00ad\u0010\u000bõdÔbµwNÓbó¼Êü8¦ \u00058\\]tù«2^sH5\u0015<Ðø\u0099\u001a\u008dÀ\u0000\u008dGÛÎP\u0005 1{\u0015À\u0010ár\u0011\u001aW¬(§\u0084\u0086gëà]¦·\u0010\u0017\u0006¬WV\u008c8¶\bµ\u0083\\\u008bwf_\u0018\\k\u0016XZ\u001d4:\u0095ã#\u0090Ï5¼èzdÑëÃ O7 ¾´\u000e3\u000b#íDß\u009dg¶Fc\u0003tá$\u0000W\u009e>ò=÷\u0092\u0013\u008c2¢îX\u0010¼9Ô\u0011ÌîÁwM\u0010Í\u001béÜµÆ(O¾xA<:éÍ9ZL\u009dSä\u009e\\¾Rze\u000b[@\u0094cf:I\"N\u0086Þo\u0088ßì\nq\u0095-Hé\u008c*ýÜ\u0006uècÆ\u0083Z[ä<ð@\u008eL0\u0098\u0005×å\u0081\u008e]½Ý\u009a\u000bÌèKÖÚº\u001c¤¢ØM3;\u008d@ñÊ#B§Sµ/Ç£\u0004\u009að\u001ev\u0096ïú\u009e\u008dªq\u00842\u0004÷\u0018GáfíþÙ\u0011Fæ\u00034\f`(´ Õ:u\rmG[\u0092(<\u0098\u009a°\u0098\"õ-j\u0011éBC\b´e. \u0082¯.ÀKAÙër\u008a¬é/ð\t¿i%\bÜ\u001eå(\u009b\u001f\u0002#|û\u0097èÏù\u009f4#Ã\u001eì\u0085\nî\u008d¤4ê¾´Kx\u0081\u0005l¡UYS»c&ý\u008em";
int var17 = "ÚµÕ\u008695HGÚÕ½J©ia\u000fXH\u0013\u0085ðDLò\u0090v¿¨,,ç\u000e ºJT%iýàUNõ\u00014²1\u008b\u0093\u008fÕ)Ëv¨#m¨:#z\u0011Ü\u009f¿¦ý÷§ð[÷.ÅÑAç\u009d` Ôð\u009fÀ{$oP¸\u0088çÝÖ\u009c:\u0016\ruT\u0086\u0095gOc3)¶åV\u0003\u0016ÆM`ynl9zü6xg\u0006õð3\u0017'v\u007f\u0088\u0083\"\u0093´\u001d|äz\u009d\u0093\u008e¤\u001c9\u008f·×+Ï\u0092h.p%ø\u0017<\u0085\u0087E²¤\u008eå\u0099Ww§÷\u0005¸¨j®Sr#º÷\fì\u008a¡ ª\u009b[!}²K\u0010¨HÃ M1\u0084\u008e¯\u0091Ï\u0018\\\u001e\u0015\u008a\u0010<a\u0093¸\u0014!}õK\u0094,»\u0019c«( bÌ§!í\u0083?ä\u0091Ï*ªð÷ÂÎão\u0016l'\u001cè°\u000bïF.\u009drâ\u001f\u0018\u0096\u001daÝæ-²x>_ÎiÄ=\u001fj\u008cnº§©(\u0092\u001a\u0018ú\u001f?¢e\u0090\u0080~§'\u0087_Mâ\u0090òez\u0086\u0097Ñtøª Þ\u009aÑVÿ\u001d\u009f\u008e·\u0091\u0013f/\u0093K\\åvõQV\u009bªÔxV^ã\u0089²A® ÄÃÜiè\u009b\u001e!n\u0099\u001bÃ#Ø\u0003§'\u0018·0Äç¼ñ\u0081\u001a\u009b\\é\u0082ïC \r\u000e7¶æ\fpÊ°,É\u008a\u0000Ø~\u009bê²Ùm\u0097\u0086ßà\u007f'}¸{øó\u0080 ývª½b\u0006Ó\bËÚð\né!Ü¬²ãÚMFPb;Óñ4\u001f\u0002\u00adÒ.(0\u0000\u00966\u009e·\u0010\u0007»é²\u0003ºÌ·s×:ÿ¨Rh\u0015\u009bú¬\\øwÃ\u008d\u000b\u0084\u008eØõÀÜeÎ\u00186ïÙÈ\u0093T\u0086ò\bd`¤dò.\u008fø\u008bp2µjæ\u0092 ¶\u008bsE¢:ãÐ~p¤/¥\u0000Î\u008b\\\táÔ ®n^Ê\b\u0005\u0013ò¦óF\u0018S\u008a/ÖI\u007fïmd2uÒv4±g,}ª\u0088BüÛó Ô\u0096J?\u009c«.`a\u00ad§\u0091ÖJë\u0010\u009cæ«Z#ï¤Ô\u000e¬\u008cå\u0019ò`s8Ê\u009fÒ\u0099\u000fH\u0017Í\u0091\u0012ª3>\u0003¥Ñ³ã¯/§Å¦\u000eR^søW}G\bz3'?©,R×Ç\u0091æh¬U|îð0,\u0000\u001a'3~\u0010C¬ø\u0004ÆÈBH\u00ad ãzÀr\u0099\u0010(R\u0013\u009b1ï?9r\u0099é¨T\u000f\u0099M«\u000b'êÇ\u0003îìc\u000fª°+\u000fÈC\u008cQ\u0000¾\u0085\u009a\u0080Ý1 h_JOgÚ\\Óßû\u009b\u0001+Å>\u0098°\u0098C½¯\u0092e\u009dã\u0090¡\u009d^¿a¿éx·õ\u009c÷ñ\u0094$/T\u0011\u0013_ \u000fµ¾Fº*úÓH3«¥\u0093t¡iæLº\u0085Y±Å\u009b\u008dÅ3|rbî\rÌ\u0002=JX\u0097à\u0016Óá1\u0085G\u008aq\u008f\u0017®Â\u007f\u0093ÜSk^Ü:¼Æµo«sC\u007f~?\u00858\u000b.æF\u009f#u©L\u0084\u0092\u007f\u0091´:\u007f\u0013¹\u0080Ó\u0097¤¶':é§!u@âÿVu\u0001¤d\u0098á (à\u0018Ï#|\u0096\u0007HD<\\£Î§ùÿ\u0083IR\u009eÛêðMå\f\u0010Ç%µ«P\u0007\u001b=yØÅ\u001b\u0097lr\u0095(>{m CÓ¡7\u000e\u008a¦³Ñ\u0098^D¸'\u008f\u0085ÿWslâ÷\u0019\u0096unv&.7ØùQ\u009b\u008bÞ ¡\u008fø\u0005\u0087û\u001d×brfõêwä\\.\u0013W½~ù*4¦Hb3×]U\u00ad\u0010\u000bõdÔbµwNÓbó¼Êü8¦ \u00058\\]tù«2^sH5\u0015<Ðø\u0099\u001a\u008dÀ\u0000\u008dGÛÎP\u0005 1{\u0015À\u0010ár\u0011\u001aW¬(§\u0084\u0086gëà]¦·\u0010\u0017\u0006¬WV\u008c8¶\bµ\u0083\\\u008bwf_\u0018\\k\u0016XZ\u001d4:\u0095ã#\u0090Ï5¼èzdÑëÃ O7 ¾´\u000e3\u000b#íDß\u009dg¶Fc\u0003tá$\u0000W\u009e>ò=÷\u0092\u0013\u008c2¢îX\u0010¼9Ô\u0011ÌîÁwM\u0010Í\u001béÜµÆ(O¾xA<:éÍ9ZL\u009dSä\u009e\\¾Rze\u000b[@\u0094cf:I\"N\u0086Þo\u0088ßì\nq\u0095-Hé\u008c*ýÜ\u0006uècÆ\u0083Z[ä<ð@\u008eL0\u0098\u0005×å\u0081\u008e]½Ý\u009a\u000bÌèKÖÚº\u001c¤¢ØM3;\u008d@ñÊ#B§Sµ/Ç£\u0004\u009að\u001ev\u0096ïú\u009e\u008dªq\u00842\u0004÷\u0018GáfíþÙ\u0011Fæ\u00034\f`(´ Õ:u\rmG[\u0092(<\u0098\u009a°\u0098\"õ-j\u0011éBC\b´e. \u0082¯.ÀKAÙër\u008a¬é/ð\t¿i%\bÜ\u001eå(\u009b\u001f\u0002#|û\u0097èÏù\u009f4#Ã\u001eì\u0085\nî\u008d¤4ê¾´Kx\u0081\u0005l¡UYS»c&ý\u008em"
.length();
char var14 = ' ';
int var33 = -1;

label54:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var45;
if ((var33 += var14) >= var17) {
b = var18;
d = new String[38];
n = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[18];
int var3 = 0;
String var4 = "ÌL\u001a3\u009eõ\u0087¸Þwqq,X¦h\u0019Uí (¹;b\u0093\u009d³\u0019Þ\u0087^GtL\u000bO\u0015CrüÞFð-ü_ÏäÏLb\u001e\u008d\u00ad|xSö\u001e\u0003|BÞJ·\u0090lzÒP\u000fÕësÉË\t\"\"Ámbï\b|³¹8Ë\u008d¾-\tÐ\u0015\u001f¨\u009f'ü¨\u0080_ghñoÊÜèÓßUà:I0jÌ\u009d34Ç\u0002qi`;";
int var5 = "ÌL\u001a3\u009eõ\u0087¸Þwqq,X¦h\u0019Uí (¹;b\u0093\u009d³\u0019Þ\u0087^GtL\u000bO\u0015CrüÞFð-ü_ÏäÏLb\u001e\u008d\u00ad|xSö\u001e\u0003|BÞJ·\u0090lzÒP\u000fÕësÉË\t\"\"Ámbï\b|³¹8Ë\u008d¾-\tÐ\u0015\u001f¨\u009f'ü¨\u0080_ghñoÊÜèÓßUà:I0jÌ\u009d34Ç\u0002qi`;"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
var10001 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var37[var10001] = var54;
if (var2 >= var5) {
l = var6;
m = new Integer[18];
KProperty[] var30 = new KProperty[c<"n">(31232, 4619909700369790696L ^ var20)];
var30[0] = Reflection.property1(
new PropertyReference1Impl(u7.class, b<"m">(1628, 4749497907888736495L ^ var20), b<"m">(26885, 7691809426226685880L ^ var20), 0)
);
var30[1] = Reflection.property1(new PropertyReference1Impl(u7.class, b<"m">(7717, 982945599055483014L ^ var20), b<"m">(29169, 7009985151384141692L ^ var20), 0));
var30[2] = Reflection.property1(new PropertyReference1Impl(u7.class, b<"m">(2472, 953008969561163559L ^ var20), b<"m">(19115, 4605924063032837136L ^ var20), 0));
var30[3] = Reflection.property1(
new PropertyReference1Impl(u7.class, b<"m">(15943, 4768904087971524815L ^ var20), b<"m">(31654, 6368310280383706368L ^ var20), 0)
);
var30[4] = Reflection.property1(new PropertyReference1Impl(u7.class, b<"m">(2376, 579251024321398752L ^ var20), b<"m">(4674, 4453189867120712936L ^ var20), 0));
var30[5] = Reflection.property1(new PropertyReference1Impl(u7.class, b<"m">(5214, 9066767157186419434L ^ var20), b<"m">(3279, 5600304801216905840L ^ var20), 0));
var30[c<"n">(16953, 6164624601127325406L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u7.class, b<"m">(9739, 5981978184837523621L ^ var20), b<"m">(11693, 5687648932907082516L ^ var20), 0)
);
var30[c<"n">(19744, 603282624507544012L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u7.class, b<"m">(28209, 3991807945366806717L ^ var20), b<"m">(24360, 8230296000897487270L ^ var20), 0)
);
var30[c<"n">(13078, 2645999892331954166L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u7.class, b<"m">(7427, 5896267470281888650L ^ var20), b<"m">(30840, 9079604023502714588L ^ var20), 0)
);
K = var30;
G = new u7(var22);
A = yp.L(G, b<"m">(17085, 3376093142877637637L ^ var20), lh.Rubberband, null, null, c<"n">(7680, 8441962332102251247L ^ var20), null, var28);
J = yp.L(G, b<"m">(32504, 5646496879817142362L ^ var20), mo.Calc, null, null, c<"n">(528, 8979373275055574777L ^ var20), null, var28);
w = yp.L(
G,
b<"m">(16966, 7302974647461416180L ^ var20),
c<"n">(30383, 8433290699457870412L ^ var20),
new IntRange(2, c<"n">(28006, 5178494779935629708L ^ var20)),
var24,
null,
u7::w,
c<"n">(13078, 2645999892331954166L ^ var20),
null
);
o = yp.t(G, b<"m">(24690, 711675024440176338L ^ var20), true, var26, null, u7::r, 4, null);
h = yp.t(G, b<"m">(8345, 9025619833043742258L ^ var20), true, var26, null, u7::I, 4, null);
c = yp.t(G, b<"m">(30224, 2237937878291658913L ^ var20), true, var26, null, u7::s, 4, null);
i = yp.t(G, b<"m">(8583, 7892389666702880560L ^ var20), true, var26, null, u7::V, 4, null);
L = yp.t(G, b<"m">(4666, 7347280441687891103L ^ var20), true, var26, null, u7::F, 4, null);
g = yp.t(G, b<"m">(16520, 1615086529198296628L ^ var20), true, var26, null, u7::Z, 4, null);
W = new bg();
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "\u0012Ocm\u0089\u0019õ±À\u0018qD\u0019)ø\u008a";
var5 = "\u0012Ocm\u0089\u0019õ±À\u0018qD\u0019)ø\u008a".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var37 = var6;
var10001 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var45;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label54;
}

var15 = "OÛç?\u00adRô\u009a8tÿào£ëµ ´t\u0097\u0013\u0001õN3¿7IÀÞ\u008b\u008a¨HÿQ[\u0012ðút®\u0081\u001b\u009c4vÚ]";
var17 = "OÛç?\u00adRô\u009a8tÿào£ëµ ´t\u0097\u0013\u0001õN3¿7IÀÞ\u008b\u008a¨HÿQ[\u0012ðút®\u0081\u001b\u009c4vÚ]".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5226;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u7", var10);
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
throw new RuntimeException("su/catlean/u7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5674;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/u7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
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
throw new RuntimeException("su/catlean/u7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
