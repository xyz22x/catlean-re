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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1794;
import net.minecraft.class_1799;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kq extends _g {
@NotNull
public static final kq T;
static final KProperty[] B;
@NotNull
private static final cw L;
@NotNull
private static final c8 f;
@NotNull
private static final i9 G;
private static final long a = yz.a(6399819449303119250L, 8299625213245895197L, MethodHandles.lookup().lookupClass()).a(164289998049550L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private kq(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 36648310481389L;
super(b<"e">(3993, 4133875631634725116L ^ var4), jt.y(), null, 4, null, var6);
}

private final f9 T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 62444488181023L;
return (f9)L.E(this, var3, B[0]);
}

private final void j(f9 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 113376829438068L;
L.b(this, var4, B[0], var1);
}

private final int v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 33472314783351L;
return ((Number)f.E(this, var3, B[1])).intValue();
}

private final void q(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 40226335396339L;
f.b(this, var4, B[1], var1);
}

@Flow
private final void r(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kq.a J
// 003: ldc2_w 135169070067364
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 3185843070911
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 42153413372629
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 133480659501284
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 53111285459983
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 94184515917227
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 39987754865879
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 122491836317086
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 46756881051429
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 76554013005049
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 96473634073356
// 04c: lxor
// 04d: lstore 22
// 04f: pop2
// 050: ldc2_w -5094515444993591224
// 053: lload 2
// 054: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: astore 24
// 05b: getstatic su/catlean/kq.G Lsu/catlean/i9;
// 05e: aload 0
// 05f: lload 14
// 061: invokespecial su/catlean/kq.v (J)I
// 064: lload 16
// 066: invokevirtual su/catlean/i9.e (IJ)Z
// 069: ifeq 370
// 06c: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 06f: lload 18
// 071: invokevirtual su/catlean/gw.c (J)Ljava/util/List;
// 074: checkcast java/lang/Iterable
// 077: astore 26
// 079: nop
// 07a: bipush 0
// 07b: istore 27
// 07d: aload 26
// 07f: astore 28
// 081: new java/util/ArrayList
// 084: dup
// 085: invokespecial java/util/ArrayList.<init> ()V
// 088: checkcast java/util/Collection
// 08b: astore 29
// 08d: bipush 0
// 08e: istore 30
// 090: aload 28
// 092: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 097: astore 31
// 099: aload 31
// 09b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0a0: ifeq 213
// 0a3: aload 31
// 0a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0aa: astore 32
// 0ac: aload 32
// 0ae: checkcast net/minecraft/class_2338
// 0b1: astore 33
// 0b3: bipush 0
// 0b4: istore 34
// 0b6: lload 12
// 0b8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0bb: aload 33
// 0bd: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0c0: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0c3: dup
// 0c4: sipush 27217
// 0c7: ldc2_w 529021674525660268
// 0ca: lload 2
// 0cb: lxor
// 0cc: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/kq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d4: astore 35
// 0d6: lload 12
// 0d8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0db: aload 33
// 0dd: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0e0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0e3: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0e6: dup
// 0e7: sipush 16046
// 0ea: ldc2_w 3732536408981258385
// 0ed: lload 2
// 0ee: lxor
// 0ef: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/kq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f7: astore 36
// 0f9: aload 35
// 0fb: getstatic net/minecraft/class_2246.field_10219 Lnet/minecraft/class_2248;
// 0fe: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 101: aload 24
// 103: ifnonnull 245
// 106: aload 24
// 108: ifnonnull 191
// 10b: goto 118
// 10e: ldc2_w -5053538061779635551
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: ifne 17c
// 11b: goto 128
// 11e: ldc2_w -5053538061779635551
// 121: lload 2
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 35
// 12a: getstatic net/minecraft/class_2246.field_10566 Lnet/minecraft/class_2248;
// 12d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 130: aload 24
// 132: ifnonnull 191
// 135: goto 142
// 138: ldc2_w -5053538061779635551
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: ifne 17c
// 145: goto 152
// 148: ldc2_w -5053538061779635551
// 14b: lload 2
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: aload 35
// 154: getstatic net/minecraft/class_2246.field_10194 Lnet/minecraft/class_2248;
// 157: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 15a: aload 24
// 15c: ifnonnull 191
// 15f: goto 16c
// 162: ldc2_w -5053538061779635551
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: ifeq 1ed
// 16f: goto 17c
// 172: ldc2_w -5053538061779635551
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: aload 36
// 17e: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 181: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 184: goto 191
// 187: ldc2_w -5053538061779635551
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: aload 24
// 193: ifnonnull 1d4
// 196: ifeq 1ed
// 199: goto 1a6
// 19c: ldc2_w -5053538061779635551
// 19f: lload 2
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: lload 22
// 1a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ab: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 1ae: aload 33
// 1b0: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1b3: dconst_0
// 1b4: ldc2_w 0.5
// 1b7: dconst_0
// 1b8: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1bb: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1be: lload 22
// 1c0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c3: invokevirtual net/minecraft/class_746.method_55754 ()D
// 1c6: dcmpg
// 1c7: goto 1d4
// 1ca: ldc2_w -5053538061779635551
// 1cd: lload 2
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: aload 24
// 1d6: ifnonnull 1ea
// 1d9: ifge 1ed
// 1dc: goto 1e9
// 1df: ldc2_w -5053538061779635551
// 1e2: lload 2
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: bipush 1
// 1ea: goto 1ee
// 1ed: bipush 0
// 1ee: nop
// 1ef: aload 24
// 1f1: ifnonnull 20d
// 1f4: ifeq 099
// 1f7: goto 204
// 1fa: ldc2_w -5053538061779635551
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: aload 29
// 206: aload 32
// 208: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 20d: pop
// 20e: aload 24
// 210: ifnull 099
// 213: aload 29
// 215: checkcast java/util/List
// 218: nop
// 219: checkcast java/lang/Iterable
// 21c: astore 26
// 21e: nop
// 21f: bipush 0
// 220: istore 27
// 222: aload 26
// 224: astore 28
// 226: new java/util/ArrayList
// 229: dup
// 22a: aload 26
// 22c: sipush 1682
// 22f: ldc2_w 5365336413486217568
// 232: lload 2
// 233: lxor
// 234: invokedynamic a (IJ)I bsm=su/catlean/kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 23c: invokespecial java/util/ArrayList.<init> (I)V
// 23f: checkcast java/util/Collection
// 242: astore 29
// 244: bipush 0
// 245: istore 30
// 247: aload 28
// 249: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 24e: astore 31
// 250: aload 31
// 252: invokeinterface java/util/Iterator.hasNext ()Z 1
// 257: ifeq 2ab
// 25a: aload 31
// 25c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 261: astore 32
// 263: aload 29
// 265: aload 32
// 267: checkcast net/minecraft/class_2338
// 26a: astore 33
// 26c: astore 37
// 26e: bipush 0
// 26f: istore 34
// 271: new net/minecraft/class_3965
// 274: dup
// 275: aload 33
// 277: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 27a: dconst_0
// 27b: ldc2_w 0.5
// 27e: dconst_0
// 27f: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 282: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 285: aload 33
// 287: bipush 0
// 288: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 28b: aload 37
// 28d: swap
// 28e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 293: pop
// 294: aload 24
// 296: ifnonnull 2ba
// 299: aload 24
// 29b: ifnull 250
// 29e: goto 2ab
// 2a1: ldc2_w -5053538061779635551
// 2a4: lload 2
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: aload 29
// 2ad: checkcast java/util/List
// 2b0: nop
// 2b1: checkcast java/lang/Iterable
// 2b4: astore 26
// 2b6: nop
// 2b7: bipush 0
// 2b8: istore 27
// 2ba: aload 26
// 2bc: new su/catlean/si
// 2bf: dup
// 2c0: invokespecial su/catlean/si.<init> ()V
// 2c3: checkcast java/util/Comparator
// 2c6: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 2c9: astore 25
// 2cb: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2ce: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/kq.k (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 2d3: lload 20
// 2d5: dup2_x1
// 2d6: pop2
// 2d7: aload 0
// 2d8: lload 4
// 2da: invokespecial su/catlean/kq.T (J)Lsu/catlean/f9;
// 2dd: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 2e0: astore 26
// 2e2: aload 25
// 2e4: invokeinterface java/util/List.isEmpty ()Z 1
// 2e9: aload 24
// 2eb: ifnonnull 322
// 2ee: ifne 325
// 2f1: goto 2fe
// 2f4: ldc2_w -5053538061779635551
// 2f7: lload 2
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: aload 26
// 300: aload 24
// 302: ifnonnull 32b
// 305: goto 312
// 308: ldc2_w -5053538061779635551
// 30b: lload 2
// 30c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 311: athrow
// 312: invokevirtual su/catlean/fg.R ()Z
// 315: goto 322
// 318: ldc2_w -5053538061779635551
// 31b: lload 2
// 31c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: athrow
// 322: ifne 326
// 325: return
// 326: aload 25
// 328: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 32b: checkcast net/minecraft/class_3965
// 32e: astore 27
// 330: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 333: new su/catlean/tu
// 336: dup
// 337: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 33a: aload 27
// 33c: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 33f: dup
// 340: sipush 8649
// 343: ldc2_w 2017985603484213246
// 346: lload 2
// 347: lxor
// 348: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/kq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 350: lload 10
// 352: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 355: lload 6
// 357: bipush 0
// 358: aload 26
// 35a: aload 27
// 35c: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/kq.X (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 361: bipush 2
// 362: aconst_null
// 363: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 366: checkcast su/catlean/t5
// 369: lload 8
// 36b: dup2_x1
// 36c: pop2
// 36d: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 370: return
}

private static final boolean k(class_1799 var0) {
long var1 = a ^ 2918729978881L;
Intrinsics.checkNotNullParameter(var0, b<"e">(12362, 9221174982013859035L ^ var1));
return var0.method_7909() instanceof class_1794;
}

private static final Unit h(class_3965 var0) {
long var1 = a ^ 60621628107539L;
int var3 = (int)((var1 ^ 8719975554996L) >>> 32);
long var4 = (var1 ^ 8719975554996L) << 32 >>> 32;
long var6 = var1 ^ 29081597669051L;
zf.Z(var3, var4).method_2896(zf.v(var6), class_1268.field_5808, var0);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

private static final Unit X(fg var0, class_3965 var1) {
long var2 = a ^ 127781657193048L;
long var4 = var2 ^ 52267832311830L;
long var6 = var2 ^ 13457191969603L;
gg.P.T(var4, var0.a(), T.T(var6), kq::h);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 137425063108877L;
long var22 = var20 ^ 74927529484750L;
long var10001 = var20 ^ 137015507456057L;
int var24 = (int)((var20 ^ 137015507456057L) >>> 32);
int var25 = (int)((var20 ^ 137015507456057L) << 32 >>> 56);
int var26 = (int)(var10001 << 40 >>> 40);
long var27 = var20 ^ 133696197721214L;
long var29 = var20 ^ 25574446386092L;
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
String var15 = "Ç~\u009fzy*0!b#Zo\u0090#EÒºÅ¿Íì\u001a!w\u0090\u0019ÜKà\u007ft¥\u009cèJ\u008dâÏmäXl8\u0088|Ç»º\u0080y®V\u0004×\u001as\u0010&Í&¼÷z\u0083!Ö-G\u008eZöþy(ä'<o¹\u0093Æ\ty\u0081¼L%ÍÏ\u0091/\u007f$®\u009d\u0012Ò4\u0015m\u0004'5\u0083%kñCk\u000b2ïRi\u0018ö\"\u0015}\u0015v\u0087ÔÆó¨\u007fQ¨/ÞdÁéh4Ò\u009cÅ\u0018+QÑü7;\u008a\u001dÑ®µ~nö\u009d\u0006@\u000f!\u0018ägB\u0098\u0010,)\u001b«ý:\u0086t!â\u001d¹\u0002\u001crÉ\u0010¥Ëq\u001f\u001bÇöÅÛR¡tZ\u0005j\u0083 \u0004\nGû)\u0010\u0086\u0012\u0087æ\u0083ô(;Pd\u008d·\u000f0ý¯Cê~©»\u001f=ë¾\u0082 0l\f1\u008e«zê6Ô\u0002\u008a$ãªzz\u0088nw¦\u009f²\u0089X=î\u0080Ö+H\u0014";
int var17 = "Ç~\u009fzy*0!b#Zo\u0090#EÒºÅ¿Íì\u001a!w\u0090\u0019ÜKà\u007ft¥\u009cèJ\u008dâÏmäXl8\u0088|Ç»º\u0080y®V\u0004×\u001as\u0010&Í&¼÷z\u0083!Ö-G\u008eZöþy(ä'<o¹\u0093Æ\ty\u0081¼L%ÍÏ\u0091/\u007f$®\u009d\u0012Ò4\u0015m\u0004'5\u0083%kñCk\u000b2ïRi\u0018ö\"\u0015}\u0015v\u0087ÔÆó¨\u007fQ¨/ÞdÁéh4Ò\u009cÅ\u0018+QÑü7;\u008a\u001dÑ®µ~nö\u009d\u0006@\u000f!\u0018ägB\u0098\u0010,)\u001b«ý:\u0086t!â\u001d¹\u0002\u001crÉ\u0010¥Ëq\u001f\u001bÇöÅÛR¡tZ\u0005j\u0083 \u0004\nGû)\u0010\u0086\u0012\u0087æ\u0083ô(;Pd\u008d·\u000f0ý¯Cê~©»\u001f=ë¾\u0082 0l\f1\u008e«zê6Ô\u0002\u008a$ãªzz\u0088nw¦\u009f²\u0089X=î\u0080Ö+H\u0014"
.length();
char var14 = '8';
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
byte var39 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var39) {
case 0:
var18[var16++] = var47;
if ((var34 += var14) >= var17) {
b = var18;
c = new String[11];
h = new HashMap(13);
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
String var4 = "\u0086|\u0014·ýå\u0003ãì\u0004\b¼#Ü\u009b?";
int var5 = "\u0086|\u0014·ýå\u0003ãì\u0004\b¼#Ü\u009b?".length();
byte var2 = 0;

label36:
while (true) {
byte var43 = var2;
var2 += 8;
byte[] var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
int var44 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var54 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var56 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var54) {
case 0:
var38[var44] = var56;
if (var2 >= var5) {
e = var6;
g = new Integer[4];
KProperty[] var31 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kq.class, b<"e">(14147, 4349096696419600091L ^ var20), b<"e">(31557, 2909434049252068057L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kq.class, b<"e">(10057, 3706712194223036115L ^ var20), b<"e">(8926, 6189496397632099137L ^ var20), 0)
)
};
B = var31;
T = new kq(var24, (byte)var25, var26);
L = yp.L(T, b<"e">(137, 4690376212406694172L ^ var20), f9.SILENT_FULL, null, null, c<"a">(26994, 5568711660460710184L ^ var20), null, var29);
f = yp.L(
T,
b<"e">(4150, 5794972163853279663L ^ var20),
0,
new IntRange(0, c<"a">(29011, 794568378398277899L ^ var20)),
var27,
null,
null,
c<"a">(3025, 5006484092840311688L ^ var20),
null
);
G = new i9(var22);
return;
}
break;
default:
var38[var44] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "õ\u0095\u001dó8\r\u0005\u0093\u009f]!ÉMV[¡";
var5 = "õ\u0095\u001dó8\r\u0005\u0093\u009f]!ÉMV[¡".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var38 = var6;
var44 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var54 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var47;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "ßCQ\u001e\u0094å·ÀÌ\"w¹\u0085XÃ\u009a 7\u001a\"\u0098äb½Î¥\u008aXónGÃómqbÍ±#\u0002kE\u0087h\u00891gÙn";
var17 = "ßCQ\u001e\u0094å·ÀÌ\"w¹\u0085XÃ\u009a 7\u001a\"\u0098äb½Î¥\u008aXónGÃómqbÍ±#\u0002kE\u0087h\u00891gÙn".length();
var14 = 16;
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
var39 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18006;
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
throw new RuntimeException("su/catlean/kq", var10);
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
throw new RuntimeException("su/catlean/kq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18320;
if (g[var3] == null) {
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
throw new RuntimeException("su/catlean/kq", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/kq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
