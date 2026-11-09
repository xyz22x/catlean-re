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
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_2680;
import net.minecraft.class_2791;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class wc implements ym {
@NotNull
public static final wc g;
@NotNull
private static final ExecutorService X;
@Nullable
private static Future Y;
@NotNull
private static final bg v;
@NotNull
private static final Set F;
@NotNull
private static final Set T;
@NotNull
private static List n;
@NotNull
private static final List Q;
@NotNull
private static final List J;
@NotNull
private static final List i;
private static final long a = yz.a(8634210685257522792L, -2508606231224911979L, MethodHandles.lookup().lookupClass()).a(175533454796704L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

private wc() {
}

private final int l(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 72922866134026L;
long var8 = var4 ^ 138490109151727L;
return Math.min(b<"f">(28559, 4921133340122326354L ^ var4), Math.max(_f.U.e(var6), k0.T.R(var8)));
}

private final int P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 80276565195514L;
long var5 = var1 ^ 36478709737189L;
return Math.min(b<"f">(4003, 6735416115916961809L ^ var1), Math.max(_f.U.H(var3), k0.T.g(var5)));
}

@Flow
private final void h(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wc.a J
// 03: ldc2_w 77915122281644
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 5924348110610
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w -8263420427547849093
// 14: lload 2
// 15: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: astore 6
// 1c: aload 6
// 1e: ifnull ab
// 21: getstatic su/catlean/wc.v Lsu/catlean/bg;
// 24: sipush 5730
// 27: ldc2_w 3431764555983856853
// 2a: lload 2
// 2b: lxor
// 2c: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: lload 4
// 33: invokevirtual su/catlean/bg.c (IJ)Z
// 36: ifeq 8f
// 39: goto 46
// 3c: ldc2_w -8304413179268530603
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: getstatic su/catlean/wc.n Ljava/util/List;
// 49: checkcast java/util/Collection
// 4c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 51: aload 6
// 53: ifnull 74
// 56: goto 63
// 59: ldc2_w -8304413179268530603
// 5c: lload 2
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: ifne 77
// 66: goto 73
// 69: ldc2_w -8304413179268530603
// 6c: lload 2
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: bipush 1
// 74: goto 78
// 77: bipush 0
// 78: ifeq 8e
// 7b: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 7e: putstatic su/catlean/wc.n Ljava/util/List;
// 81: goto 8e
// 84: ldc2_w -8304413179268530603
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: return
// 8f: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/wc.Z ()Ljava/util/List;, ()Ljava/util/List; ]
// 94: getstatic su/catlean/wc.X Ljava/util/concurrent/ExecutorService;
// 97: checkcast java/util/concurrent/Executor
// 9a: invokestatic java/util/concurrent/CompletableFuture.supplyAsync (Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
// 9d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/wc.z (Ljava/lang/Throwable;)Ljava/util/List;, (Ljava/lang/Throwable;)Ljava/util/List; ]
// a2: invokevirtual java/util/concurrent/CompletableFuture.exceptionally (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
// a5: checkcast java/util/concurrent/Future
// a8: putstatic su/catlean/wc.Y Ljava/util/concurrent/Future;
// ab: return
}

@NotNull
public final List b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wc.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 9094456996280679711
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: getstatic su/catlean/wc.v Lsu/catlean/bg;
// 12: invokevirtual su/catlean/bg.l ()V
// 15: astore 3
// 16: aload 3
// 17: ifnull 68
// 1a: getstatic su/catlean/wc.Y Ljava/util/concurrent/Future;
// 1d: dup
// 1e: ifnull 67
// 21: goto 2e
// 24: ldc2_w 9197655170690682161
// 27: lload 1
// 28: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: athrow
// 2e: invokeinterface java/util/concurrent/Future.isDone ()Z 1
// 33: aload 3
// 34: ifnull 64
// 37: goto 44
// 3a: ldc2_w 9197655170690682161
// 3d: lload 1
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: bipush 1
// 45: if_icmpne 63
// 48: goto 55
// 4b: ldc2_w 9197655170690682161
// 4e: lload 1
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: bipush 1
// 56: goto 69
// 59: ldc2_w 9197655170690682161
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: bipush 0
// 64: goto 69
// 67: pop
// 68: bipush 0
// 69: ifeq 9c
// 6c: getstatic su/catlean/wc.Y Ljava/util/concurrent/Future;
// 6f: dup
// 70: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 73: invokeinterface java/util/concurrent/Future.get ()Ljava/lang/Object; 1
// 78: dup
// 79: sipush 28522
// 7c: ldc2_w 1386052029964596371
// 7f: lload 1
// 80: lxor
// 81: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 89: checkcast java/util/List
// 8c: putstatic su/catlean/wc.n Ljava/util/List;
// 8f: goto 9c
// 92: ldc2_w 9197655170690682161
// 95: lload 1
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: getstatic su/catlean/wc.n Ljava/util/List;
// 9f: areturn
}

public final boolean d(@NotNull class_2338 pos, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wc.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 123950318018707
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 11385
// 013: ldc2_w 58072670691079702
// 016: lload 2
// 017: lxor
// 018: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w -4637441979955544947
// 023: lload 2
// 024: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/wc.v Lsu/catlean/bg;
// 02c: invokevirtual su/catlean/bg.l ()V
// 02f: astore 6
// 031: aload 0
// 032: lload 4
// 034: invokevirtual su/catlean/wc.b (J)Ljava/util/List;
// 037: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 03c: astore 7
// 03e: aload 7
// 040: invokeinterface java/util/Iterator.hasNext ()Z 1
// 045: ifeq 19f
// 048: aload 7
// 04a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 04f: checkcast su/catlean/z7
// 052: astore 8
// 054: aload 1
// 055: aload 8
// 057: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 05a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 05d: aload 6
// 05f: ifnull 066
// 062: ifeq 067
// 065: bipush 1
// 066: ireturn
// 067: aload 8
// 069: invokevirtual su/catlean/z7.U ()Lsu/catlean/z;
// 06c: getstatic su/catlean/z.DOUBLE_X Lsu/catlean/z;
// 06f: aload 6
// 071: lload 2
// 072: lconst_0
// 073: lcmp
// 074: iflt 0c7
// 077: ifnull 0c5
// 07a: if_acmpne 0bd
// 07d: goto 08a
// 080: ldc2_w -4740357707877430109
// 083: lload 2
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: aload 1
// 08b: aload 8
// 08d: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 090: bipush 1
// 091: bipush 0
// 092: bipush 0
// 093: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 096: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 099: aload 6
// 09b: ifnull 0bc
// 09e: goto 0ab
// 0a1: ldc2_w -4740357707877430109
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: ifeq 0bd
// 0ae: goto 0bb
// 0b1: ldc2_w -4740357707877430109
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: bipush 1
// 0bc: ireturn
// 0bd: aload 8
// 0bf: invokevirtual su/catlean/z7.U ()Lsu/catlean/z;
// 0c2: getstatic su/catlean/z.DOUBLE_Z Lsu/catlean/z;
// 0c5: aload 6
// 0c7: ifnull 115
// 0ca: if_acmpne 10d
// 0cd: goto 0da
// 0d0: ldc2_w -4740357707877430109
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 1
// 0db: aload 8
// 0dd: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 0e0: bipush 0
// 0e1: bipush 0
// 0e2: bipush 1
// 0e3: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e9: aload 6
// 0eb: ifnull 10c
// 0ee: goto 0fb
// 0f1: ldc2_w -4740357707877430109
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: ifeq 10d
// 0fe: goto 10b
// 101: ldc2_w -4740357707877430109
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 1
// 10c: ireturn
// 10d: aload 8
// 10f: invokevirtual su/catlean/z7.U ()Lsu/catlean/z;
// 112: getstatic su/catlean/z.QUAD Lsu/catlean/z;
// 115: if_acmpne 03e
// 118: aload 1
// 119: aload 8
// 11b: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 11e: bipush 0
// 11f: bipush 0
// 120: bipush 1
// 121: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 124: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 127: aload 6
// 129: ifnull 19e
// 12c: ifne 198
// 12f: goto 13c
// 132: ldc2_w -4740357707877430109
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 1
// 13d: aload 8
// 13f: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 142: bipush 1
// 143: bipush 0
// 144: bipush 1
// 145: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 148: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14b: aload 6
// 14d: ifnull 19e
// 150: goto 15d
// 153: ldc2_w -4740357707877430109
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: lload 2
// 15e: lconst_0
// 15f: lcmp
// 160: iflt 199
// 163: ifne 198
// 166: goto 173
// 169: ldc2_w -4740357707877430109
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 1
// 174: aload 8
// 176: invokevirtual su/catlean/z7.A ()Lnet/minecraft/class_2338;
// 179: bipush 1
// 17a: bipush 0
// 17b: bipush 0
// 17c: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 17f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 182: ifeq 03e
// 185: lload 2
// 186: lconst_0
// 187: lcmp
// 188: ifle 054
// 18b: goto 198
// 18e: ldc2_w -4740357707877430109
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: bipush 1
// 199: aload 6
// 19b: ifnull 05d
// 19e: ireturn
// 19f: bipush 0
// 1a0: ireturn
}

@NotNull
public final class_2680 c(int i, int j, int k, int a, short a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 4
// 002: i2l
// 003: bipush 32
// 005: lshl
// 006: iload 5
// 008: i2l
// 009: bipush 48
// 00b: lshl
// 00c: bipush 32
// 00e: lushr
// 00f: lor
// 010: iload 6
// 012: i2l
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: lor
// 01a: getstatic su/catlean/wc.a J
// 01d: lxor
// 01e: lstore 7
// 020: lload 7
// 022: dup2
// 023: ldc2_w 110420320016472
// 026: lxor
// 027: lstore 9
// 029: pop2
// 02a: ldc2_w -5372938470753962426
// 02d: lload 7
// 02f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: astore 11
// 036: nop
// 037: lload 9
// 039: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 03c: iload 1
// 03d: bipush 4
// 03e: ishr
// 03f: iload 3
// 040: bipush 4
// 041: ishr
// 042: invokevirtual net/minecraft/class_638.method_8497 (II)Lnet/minecraft/class_2818;
// 045: dup
// 046: sipush 28222
// 049: ldc2_w 6582738214081330841
// 04c: lload 7
// 04e: lxor
// 04f: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 057: astore 12
// 059: lload 9
// 05b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 05e: iload 2
// 05f: invokevirtual net/minecraft/class_638.method_31602 (I)I
// 062: istore 13
// 064: iload 13
// 066: aload 11
// 068: ifnull 07e
// 06b: iflt 12a
// 06e: goto 07c
// 071: ldc2_w -5404919624917563800
// 074: lload 7
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: iload 13
// 07e: iload 4
// 080: ifle 0cb
// 083: aload 11
// 085: ifnull 0cb
// 088: aload 12
// 08a: invokevirtual net/minecraft/class_2818.method_12006 ()[Lnet/minecraft/class_2826;
// 08d: arraylength
// 08e: if_icmpge 12a
// 091: goto 09f
// 094: ldc2_w -5404919624917563800
// 097: lload 7
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: aload 12
// 0a1: invokevirtual net/minecraft/class_2818.method_12006 ()[Lnet/minecraft/class_2826;
// 0a4: iload 13
// 0a6: aaload
// 0a7: aload 11
// 0a9: ifnull 0e4
// 0ac: goto 0ba
// 0af: ldc2_w -5404919624917563800
// 0b2: lload 7
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: invokevirtual net/minecraft/class_2826.method_38292 ()Z
// 0bd: goto 0cb
// 0c0: ldc2_w -5404919624917563800
// 0c3: lload 7
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: ifne 12a
// 0ce: aload 12
// 0d0: invokevirtual net/minecraft/class_2818.method_12006 ()[Lnet/minecraft/class_2826;
// 0d3: iload 13
// 0d5: aaload
// 0d6: goto 0e4
// 0d9: ldc2_w -5404919624917563800
// 0dc: lload 7
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: iload 1
// 0e5: sipush 20599
// 0e8: ldc2_w 9138610315125971701
// 0eb: lload 7
// 0ed: lxor
// 0ee: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: iand
// 0f4: iload 2
// 0f5: sipush 18929
// 0f8: ldc2_w 2849056153290720113
// 0fb: lload 7
// 0fd: lxor
// 0fe: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: iand
// 104: iload 3
// 105: sipush 18929
// 108: ldc2_w 2849056153290720113
// 10b: lload 7
// 10d: lxor
// 10e: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: iand
// 114: invokevirtual net/minecraft/class_2826.method_12254 (III)Lnet/minecraft/class_2680;
// 117: dup
// 118: sipush 10761
// 11b: ldc2_w 1447365136336239272
// 11e: lload 7
// 120: lxor
// 121: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 129: areturn
// 12a: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 12d: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 130: dup
// 131: sipush 19241
// 134: ldc2_w 3235579068183305103
// 137: lload 7
// 139: lxor
// 13a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 142: areturn
// 143: astore 12
// 145: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 148: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 14b: dup
// 14c: sipush 8618
// 14f: ldc2_w 6026762749984321801
// 152: lload 7
// 154: lxor
// 155: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15d: areturn
}

private final class_2680 Z(int var1, int var2, int var3, int var4, char var5, int var6) {
long var7 = ((long)var4 << 32 | (long)var5 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
long var10001 = var7 ^ 70881430763661L;
int var9 = (int)((var7 ^ 70881430763661L) >>> 32);
int var10 = (int)((var7 ^ 70881430763661L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);
return this.c(var1, var2, var3, var9, (short)var10, (char)var11);
}

private final boolean u(long var1, int var3, int var4, int var5) {
var1 = a ^ var1;
long var10001 = var1 ^ 26777239768777L;
int var6 = (int)((var1 ^ 26777239768777L) >>> 32);
int var7 = (int)((var1 ^ 26777239768777L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
return this.Z(var3, var4, var5, var6, (char)var7, var8).method_45474();
}

private final boolean X(class_2791 param1, int param2, long param3, int param5, int param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wc.a J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: lload 3
// 07: dup2
// 08: ldc2_w 51771426868694
// 0b: lxor
// 0c: dup2
// 0d: bipush 32
// 0f: lushr
// 10: l2i
// 11: istore 7
// 13: dup2
// 14: bipush 32
// 16: lshl
// 17: bipush 48
// 19: lushr
// 1a: l2i
// 1b: istore 8
// 1d: dup2
// 1e: bipush 48
// 20: lshl
// 21: bipush 48
// 23: lushr
// 24: l2i
// 25: istore 9
// 27: pop2
// 28: pop2
// 29: ldc2_w -7370039489703388527
// 2c: lload 3
// 2d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: aload 0
// 33: iload 2
// 34: iload 5
// 36: iload 6
// 38: iload 7
// 3a: iload 8
// 3c: i2s
// 3d: iload 9
// 3f: i2c
// 40: invokevirtual su/catlean/wc.c (IIIISC)Lnet/minecraft/class_2680;
// 43: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 46: dup
// 47: sipush 29025
// 4a: ldc2_w 595191639498607897
// 4d: lload 3
// 4e: lxor
// 4f: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 57: astore 11
// 59: astore 10
// 5b: getstatic su/catlean/wc.T Ljava/util/Set;
// 5e: aload 11
// 60: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 65: aload 10
// 67: ifnull a7
// 6a: ifne a6
// 6d: goto 7a
// 70: ldc2_w -7481887521957385537
// 73: lload 3
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: getstatic su/catlean/wc.F Ljava/util/Set;
// 7d: aload 11
// 7f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 84: aload 10
// 86: ifnull a7
// 89: goto 96
// 8c: ldc2_w -7481887521957385537
// 8f: lload 3
// 90: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: athrow
// 96: ifeq aa
// 99: goto a6
// 9c: ldc2_w -7481887521957385537
// 9f: lload 3
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: bipush 1
// a7: goto ab
// aa: bipush 0
// ab: ireturn
}

private final boolean M(int var1, int var2, short var3, int var4, char var5, int var6) {
long var7 = ((long)var3 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
long var10001 = var7 ^ 69719935386143L;
int var9 = (int)((var7 ^ 69719935386143L) >>> 32);
int var10 = (int)((var7 ^ 69719935386143L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);
return T.contains(this.c(var1, var2, var4, var9, (short)var10, (char)var11).method_26204());
}

private final boolean V(int var1, int var2, int var3, long var4) {
var4 = a ^ var4;
long var10001 = var4 ^ 27776790843737L;
int var6 = (int)((var4 ^ 27776790843737L) >>> 32);
int var7 = (int)((var4 ^ 27776790843737L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
return F.contains(this.c(var1, var2, var3, var6, (short)var7, (char)var8).method_26204());
}

private final z7 H(long param1, int param3, int param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wc.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 31974913436008
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 76112927809324
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 9
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 10
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 129227704958002
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 12
// 045: dup2
// 046: bipush 32
// 048: lshl
// 049: bipush 32
// 04b: lushr
// 04c: l2i
// 04d: istore 13
// 04f: pop2
// 050: dup2
// 051: ldc2_w 91961915158388
// 054: lxor
// 055: lstore 14
// 057: dup2
// 058: ldc2_w 62220403431959
// 05b: lxor
// 05c: lstore 16
// 05e: pop2
// 05f: ldc2_w -3800415704773785493
// 062: lload 1
// 063: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: bipush 0
// 069: istore 19
// 06b: astore 18
// 06d: bipush 0
// 06e: istore 20
// 070: aload 0
// 071: iload 3
// 072: bipush 1
// 073: isub
// 074: iload 4
// 076: iload 5
// 078: lload 14
// 07a: invokespecial su/catlean/wc.V (IIIJ)Z
// 07d: aload 18
// 07f: ifnull 0c7
// 082: ifeq 0a7
// 085: goto 092
// 088: ldc2_w -3832399609980176315
// 08b: lload 1
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: iinc 19 1
// 095: aload 18
// 097: ifnonnull 0e5
// 09a: goto 0a7
// 09d: ldc2_w -3832399609980176315
// 0a0: lload 1
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: aload 0
// 0a8: iload 3
// 0a9: bipush 1
// 0aa: isub
// 0ab: iload 4
// 0ad: iload 11
// 0af: i2s
// 0b0: iload 5
// 0b2: iload 12
// 0b4: i2c
// 0b5: iload 13
// 0b7: invokespecial su/catlean/wc.M (IISICI)Z
// 0ba: goto 0c7
// 0bd: ldc2_w -3832399609980176315
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: aload 18
// 0c9: lload 1
// 0ca: lconst_0
// 0cb: lcmp
// 0cc: ifle 0f4
// 0cf: ifnull 0f2
// 0d2: ifeq 0e5
// 0d5: goto 0e2
// 0d8: ldc2_w -3832399609980176315
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: iinc 20 1
// 0e5: aload 0
// 0e6: iload 3
// 0e7: iload 4
// 0e9: iload 5
// 0eb: bipush 1
// 0ec: isub
// 0ed: lload 14
// 0ef: invokespecial su/catlean/wc.V (IIIJ)Z
// 0f2: aload 18
// 0f4: lload 1
// 0f5: lconst_0
// 0f6: lcmp
// 0f7: ifle 145
// 0fa: ifnull 143
// 0fd: ifeq 122
// 100: goto 10d
// 103: ldc2_w -3832399609980176315
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: iinc 19 1
// 110: aload 18
// 112: ifnonnull 161
// 115: goto 122
// 118: ldc2_w -3832399609980176315
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 0
// 123: iload 3
// 124: iload 4
// 126: iload 5
// 128: bipush 1
// 129: isub
// 12a: iload 11
// 12c: i2s
// 12d: swap
// 12e: iload 12
// 130: i2c
// 131: iload 13
// 133: invokespecial su/catlean/wc.M (IISICI)Z
// 136: goto 143
// 139: ldc2_w -3832399609980176315
// 13c: lload 1
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: aload 18
// 145: lload 1
// 146: lconst_0
// 147: lcmp
// 148: ifle 168
// 14b: ifnull 166
// 14e: ifeq 161
// 151: goto 15e
// 154: ldc2_w -3832399609980176315
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: iinc 20 1
// 161: iload 19
// 163: iload 20
// 165: iadd
// 166: aload 18
// 168: ifnull 19e
// 16b: bipush 2
// 16c: if_icmpge 188
// 16f: goto 17c
// 172: ldc2_w -3832399609980176315
// 175: lload 1
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: aconst_null
// 17d: areturn
// 17e: ldc2_w -3832399609980176315
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 0
// 189: iload 3
// 18a: iload 4
// 18c: iload 5
// 18e: bipush 1
// 18f: iadd
// 190: iload 8
// 192: iload 9
// 194: i2s
// 195: iload 10
// 197: i2c
// 198: invokevirtual su/catlean/wc.c (IIIISC)Lnet/minecraft/class_2680;
// 19b: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 19e: istore 21
// 1a0: aload 0
// 1a1: iload 3
// 1a2: bipush 1
// 1a3: iadd
// 1a4: iload 4
// 1a6: iload 5
// 1a8: iload 8
// 1aa: iload 9
// 1ac: i2s
// 1ad: iload 10
// 1af: i2c
// 1b0: invokevirtual su/catlean/wc.c (IIIISC)Lnet/minecraft/class_2680;
// 1b3: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 1b6: istore 22
// 1b8: iload 21
// 1ba: aload 18
// 1bc: ifnull 3bb
// 1bf: ifeq 3b9
// 1c2: goto 1cf
// 1c5: ldc2_w -3832399609980176315
// 1c8: lload 1
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: iload 22
// 1d1: aload 18
// 1d3: lload 1
// 1d4: lconst_0
// 1d5: lcmp
// 1d6: ifle 3bd
// 1d9: ifnull 3bb
// 1dc: goto 1e9
// 1df: ldc2_w -3832399609980176315
// 1e2: lload 1
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: ifeq 3b9
// 1ec: goto 1f9
// 1ef: ldc2_w -3832399609980176315
// 1f2: lload 1
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: aload 0
// 1fa: iload 3
// 1fb: bipush 1
// 1fc: iadd
// 1fd: iload 4
// 1ff: iload 5
// 201: bipush 1
// 202: iadd
// 203: iload 8
// 205: iload 9
// 207: i2s
// 208: iload 10
// 20a: i2c
// 20b: invokevirtual su/catlean/wc.c (IIIISC)Lnet/minecraft/class_2680;
// 20e: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 211: ifne 22d
// 214: goto 221
// 217: ldc2_w -3832399609980176315
// 21a: lload 1
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: aconst_null
// 222: areturn
// 223: ldc2_w -3832399609980176315
// 226: lload 1
// 227: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: athrow
// 22d: getstatic su/catlean/wc.Q Ljava/util/List;
// 230: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 235: astore 23
// 237: aload 23
// 239: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23e: ifeq 2e6
// 241: aload 23
// 243: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 248: checkcast net/minecraft/class_2382
// 24b: astore 24
// 24d: aload 0
// 24e: iload 3
// 24f: aload 24
// 251: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 254: iadd
// 255: iload 4
// 257: aload 24
// 259: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 25c: iadd
// 25d: iload 5
// 25f: aload 24
// 261: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 264: iadd
// 265: lload 14
// 267: invokespecial su/catlean/wc.V (IIIJ)Z
// 26a: lload 1
// 26b: lconst_0
// 26c: lcmp
// 26d: iflt 2ee
// 270: aload 18
// 272: ifnull 2ee
// 275: aload 18
// 277: lload 1
// 278: lconst_0
// 279: lcmp
// 27a: iflt 2d8
// 27d: ifnull 2d6
// 280: goto 28d
// 283: ldc2_w -3832399609980176315
// 286: lload 1
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: ifeq 2b2
// 290: goto 29d
// 293: ldc2_w -3832399609980176315
// 296: lload 1
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: iinc 19 1
// 2a0: aload 18
// 2a2: ifnonnull 237
// 2a5: goto 2b2
// 2a8: ldc2_w -3832399609980176315
// 2ab: lload 1
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: aload 0
// 2b3: iload 3
// 2b4: aload 24
// 2b6: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 2b9: iadd
// 2ba: iload 4
// 2bc: aload 24
// 2be: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 2c1: iadd
// 2c2: iload 5
// 2c4: aload 24
// 2c6: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 2c9: iadd
// 2ca: iload 11
// 2cc: i2s
// 2cd: swap
// 2ce: iload 12
// 2d0: i2c
// 2d1: iload 13
// 2d3: invokespecial su/catlean/wc.M (IISICI)Z
// 2d6: aload 18
// 2d8: ifnull 23e
// 2db: ifeq 237
// 2de: iinc 20 1
// 2e1: aload 18
// 2e3: ifnonnull 237
// 2e6: lload 1
// 2e7: lconst_0
// 2e8: lcmp
// 2e9: iflt 37b
// 2ec: iload 19
// 2ee: sipush 17585
// 2f1: ldc2_w 4083371608193511449
// 2f4: lload 1
// 2f5: lxor
// 2f6: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fb: aload 18
// 2fd: lload 1
// 2fe: lconst_0
// 2ff: lcmp
// 300: ifle 33a
// 303: ifnull 332
// 306: if_icmpeq 37b
// 309: goto 316
// 30c: ldc2_w -3832399609980176315
// 30f: lload 1
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: iload 20
// 318: sipush 6774
// 31b: ldc2_w 2230217781697048282
// 31e: lload 1
// 31f: lxor
// 320: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 325: goto 332
// 328: ldc2_w -3832399609980176315
// 32b: lload 1
// 32c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 331: athrow
// 332: lload 1
// 333: lconst_0
// 334: lcmp
// 335: ifle 36c
// 338: aload 18
// 33a: ifnull 36c
// 33d: if_icmpeq 37b
// 340: goto 34d
// 343: ldc2_w -3832399609980176315
// 346: lload 1
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: iload 19
// 34f: iload 20
// 351: iadd
// 352: sipush 6774
// 355: ldc2_w 2230217781697048282
// 358: lload 1
// 359: lxor
// 35a: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: goto 36c
// 362: ldc2_w -3832399609980176315
// 365: lload 1
// 366: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: athrow
// 36c: if_icmpeq 37b
// 36f: aconst_null
// 370: areturn
// 371: ldc2_w -3832399609980176315
// 374: lload 1
// 375: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37a: athrow
// 37b: new su/catlean/z7
// 37e: dup
// 37f: new net/minecraft/class_2338
// 382: dup
// 383: iload 3
// 384: iload 4
// 386: iload 5
// 388: invokespecial net/minecraft/class_2338.<init> (III)V
// 38b: iload 20
// 38d: sipush 6774
// 390: ldc2_w 2230217781697048282
// 393: lload 1
// 394: lxor
// 395: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39a: if_icmpne 3ad
// 39d: getstatic su/catlean/ld.SAFE Lsu/catlean/ld;
// 3a0: goto 3b0
// 3a3: ldc2_w -3832399609980176315
// 3a6: lload 1
// 3a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ac: athrow
// 3ad: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 3b0: getstatic su/catlean/z.QUAD Lsu/catlean/z;
// 3b3: lload 16
// 3b5: invokespecial su/catlean/z7.<init> (Lnet/minecraft/class_2338;Lsu/catlean/ld;Lsu/catlean/z;J)V
// 3b8: areturn
// 3b9: iload 21
// 3bb: aload 18
// 3bd: ifnull 593
// 3c0: ifeq 591
// 3c3: goto 3d0
// 3c6: ldc2_w -3832399609980176315
// 3c9: lload 1
// 3ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cf: athrow
// 3d0: aload 0
// 3d1: lload 6
// 3d3: iload 3
// 3d4: iload 4
// 3d6: iload 5
// 3d8: bipush 1
// 3d9: iadd
// 3da: invokespecial su/catlean/wc.u (JIII)Z
// 3dd: aload 18
// 3df: lload 1
// 3e0: lconst_0
// 3e1: lcmp
// 3e2: iflt 595
// 3e5: ifnull 593
// 3e8: goto 3f5
// 3eb: ldc2_w -3832399609980176315
// 3ee: lload 1
// 3ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: athrow
// 3f5: ifeq 591
// 3f8: goto 405
// 3fb: ldc2_w -3832399609980176315
// 3fe: lload 1
// 3ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: athrow
// 405: getstatic su/catlean/wc.J Ljava/util/List;
// 408: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 40d: astore 23
// 40f: aload 23
// 411: invokeinterface java/util/Iterator.hasNext ()Z 1
// 416: ifeq 4be
// 419: aload 23
// 41b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 420: checkcast net/minecraft/class_2382
// 423: astore 24
// 425: aload 0
// 426: iload 3
// 427: aload 24
// 429: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 42c: iadd
// 42d: iload 4
// 42f: aload 24
// 431: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 434: iadd
// 435: iload 5
// 437: aload 24
// 439: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 43c: iadd
// 43d: lload 14
// 43f: invokespecial su/catlean/wc.V (IIIJ)Z
// 442: lload 1
// 443: lconst_0
// 444: lcmp
// 445: iflt 4c6
// 448: aload 18
// 44a: ifnull 4c6
// 44d: aload 18
// 44f: lload 1
// 450: lconst_0
// 451: lcmp
// 452: iflt 4b0
// 455: ifnull 4ae
// 458: goto 465
// 45b: ldc2_w -3832399609980176315
// 45e: lload 1
// 45f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 464: athrow
// 465: ifeq 48a
// 468: goto 475
// 46b: ldc2_w -3832399609980176315
// 46e: lload 1
// 46f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 474: athrow
// 475: iinc 19 1
// 478: aload 18
// 47a: ifnonnull 40f
// 47d: goto 48a
// 480: ldc2_w -3832399609980176315
// 483: lload 1
// 484: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 489: athrow
// 48a: aload 0
// 48b: iload 3
// 48c: aload 24
// 48e: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 491: iadd
// 492: iload 4
// 494: aload 24
// 496: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 499: iadd
// 49a: iload 5
// 49c: aload 24
// 49e: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 4a1: iadd
// 4a2: iload 11
// 4a4: i2s
// 4a5: swap
// 4a6: iload 12
// 4a8: i2c
// 4a9: iload 13
// 4ab: invokespecial su/catlean/wc.M (IISICI)Z
// 4ae: aload 18
// 4b0: ifnull 416
// 4b3: ifeq 40f
// 4b6: iinc 20 1
// 4b9: aload 18
// 4bb: ifnonnull 40f
// 4be: lload 1
// 4bf: lconst_0
// 4c0: lcmp
// 4c1: ifle 553
// 4c4: iload 19
// 4c6: sipush 15517
// 4c9: ldc2_w 5082415838031267895
// 4cc: lload 1
// 4cd: lxor
// 4ce: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d3: aload 18
// 4d5: lload 1
// 4d6: lconst_0
// 4d7: lcmp
// 4d8: iflt 512
// 4db: ifnull 50a
// 4de: if_icmpeq 553
// 4e1: goto 4ee
// 4e4: ldc2_w -3832399609980176315
// 4e7: lload 1
// 4e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ed: athrow
// 4ee: iload 20
// 4f0: sipush 16985
// 4f3: ldc2_w 4056644242799736567
// 4f6: lload 1
// 4f7: lxor
// 4f8: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fd: goto 50a
// 500: ldc2_w -3832399609980176315
// 503: lload 1
// 504: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 509: athrow
// 50a: lload 1
// 50b: lconst_0
// 50c: lcmp
// 50d: iflt 544
// 510: aload 18
// 512: ifnull 544
// 515: if_icmpeq 553
// 518: goto 525
// 51b: ldc2_w -3832399609980176315
// 51e: lload 1
// 51f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 524: athrow
// 525: iload 19
// 527: iload 20
// 529: iadd
// 52a: sipush 16985
// 52d: ldc2_w 4056644242799736567
// 530: lload 1
// 531: lxor
// 532: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 537: goto 544
// 53a: ldc2_w -3832399609980176315
// 53d: lload 1
// 53e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 543: athrow
// 544: if_icmpeq 553
// 547: aconst_null
// 548: areturn
// 549: ldc2_w -3832399609980176315
// 54c: lload 1
// 54d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 552: athrow
// 553: new su/catlean/z7
// 556: dup
// 557: new net/minecraft/class_2338
// 55a: dup
// 55b: iload 3
// 55c: iload 4
// 55e: iload 5
// 560: invokespecial net/minecraft/class_2338.<init> (III)V
// 563: iload 20
// 565: sipush 16985
// 568: ldc2_w 4056644242799736567
// 56b: lload 1
// 56c: lxor
// 56d: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 572: if_icmpne 585
// 575: getstatic su/catlean/ld.SAFE Lsu/catlean/ld;
// 578: goto 588
// 57b: ldc2_w -3832399609980176315
// 57e: lload 1
// 57f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 584: athrow
// 585: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 588: getstatic su/catlean/z.DOUBLE_Z Lsu/catlean/z;
// 58b: lload 16
// 58d: invokespecial su/catlean/z7.<init> (Lnet/minecraft/class_2338;Lsu/catlean/ld;Lsu/catlean/z;J)V
// 590: areturn
// 591: iload 22
// 593: aload 18
// 595: ifnull 778
// 598: ifeq 76b
// 59b: goto 5a8
// 59e: ldc2_w -3832399609980176315
// 5a1: lload 1
// 5a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a7: athrow
// 5a8: aload 0
// 5a9: iload 3
// 5aa: bipush 1
// 5ab: iadd
// 5ac: lload 6
// 5ae: dup2_x1
// 5af: pop2
// 5b0: iload 4
// 5b2: iload 5
// 5b4: invokespecial su/catlean/wc.u (JIII)Z
// 5b7: aload 18
// 5b9: lload 1
// 5ba: lconst_0
// 5bb: lcmp
// 5bc: ifle 77a
// 5bf: ifnull 778
// 5c2: goto 5cf
// 5c5: ldc2_w -3832399609980176315
// 5c8: lload 1
// 5c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ce: athrow
// 5cf: ifeq 76b
// 5d2: goto 5df
// 5d5: ldc2_w -3832399609980176315
// 5d8: lload 1
// 5d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5de: athrow
// 5df: getstatic su/catlean/wc.i Ljava/util/List;
// 5e2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 5e7: astore 23
// 5e9: aload 23
// 5eb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5f0: ifeq 698
// 5f3: aload 23
// 5f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5fa: checkcast net/minecraft/class_2382
// 5fd: astore 24
// 5ff: aload 0
// 600: iload 3
// 601: aload 24
// 603: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 606: iadd
// 607: iload 4
// 609: aload 24
// 60b: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 60e: iadd
// 60f: iload 5
// 611: aload 24
// 613: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 616: iadd
// 617: lload 14
// 619: invokespecial su/catlean/wc.V (IIIJ)Z
// 61c: lload 1
// 61d: lconst_0
// 61e: lcmp
// 61f: iflt 6a0
// 622: aload 18
// 624: ifnull 6a0
// 627: aload 18
// 629: lload 1
// 62a: lconst_0
// 62b: lcmp
// 62c: iflt 68a
// 62f: ifnull 688
// 632: goto 63f
// 635: ldc2_w -3832399609980176315
// 638: lload 1
// 639: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63e: athrow
// 63f: ifeq 664
// 642: goto 64f
// 645: ldc2_w -3832399609980176315
// 648: lload 1
// 649: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64e: athrow
// 64f: iinc 19 1
// 652: aload 18
// 654: ifnonnull 5e9
// 657: goto 664
// 65a: ldc2_w -3832399609980176315
// 65d: lload 1
// 65e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 663: athrow
// 664: aload 0
// 665: iload 3
// 666: aload 24
// 668: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 66b: iadd
// 66c: iload 4
// 66e: aload 24
// 670: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 673: iadd
// 674: iload 5
// 676: aload 24
// 678: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 67b: iadd
// 67c: iload 11
// 67e: i2s
// 67f: swap
// 680: iload 12
// 682: i2c
// 683: iload 13
// 685: invokespecial su/catlean/wc.M (IISICI)Z
// 688: aload 18
// 68a: ifnull 5f0
// 68d: ifeq 5e9
// 690: iinc 20 1
// 693: aload 18
// 695: ifnonnull 5e9
// 698: lload 1
// 699: lconst_0
// 69a: lcmp
// 69b: iflt 72d
// 69e: iload 19
// 6a0: sipush 16985
// 6a3: ldc2_w 4056644242799736567
// 6a6: lload 1
// 6a7: lxor
// 6a8: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ad: aload 18
// 6af: lload 1
// 6b0: lconst_0
// 6b1: lcmp
// 6b2: ifle 6ec
// 6b5: ifnull 6e4
// 6b8: if_icmpeq 72d
// 6bb: goto 6c8
// 6be: ldc2_w -3832399609980176315
// 6c1: lload 1
// 6c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c7: athrow
// 6c8: iload 20
// 6ca: sipush 16985
// 6cd: ldc2_w 4056644242799736567
// 6d0: lload 1
// 6d1: lxor
// 6d2: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d7: goto 6e4
// 6da: ldc2_w -3832399609980176315
// 6dd: lload 1
// 6de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e3: athrow
// 6e4: lload 1
// 6e5: lconst_0
// 6e6: lcmp
// 6e7: ifle 71e
// 6ea: aload 18
// 6ec: ifnull 71e
// 6ef: if_icmpeq 72d
// 6f2: goto 6ff
// 6f5: ldc2_w -3832399609980176315
// 6f8: lload 1
// 6f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fe: athrow
// 6ff: iload 19
// 701: iload 20
// 703: iadd
// 704: sipush 16985
// 707: ldc2_w 4056644242799736567
// 70a: lload 1
// 70b: lxor
// 70c: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 711: goto 71e
// 714: ldc2_w -3832399609980176315
// 717: lload 1
// 718: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71d: athrow
// 71e: if_icmpeq 72d
// 721: aconst_null
// 722: areturn
// 723: ldc2_w -3832399609980176315
// 726: lload 1
// 727: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72c: athrow
// 72d: new su/catlean/z7
// 730: dup
// 731: new net/minecraft/class_2338
// 734: dup
// 735: iload 3
// 736: iload 4
// 738: iload 5
// 73a: invokespecial net/minecraft/class_2338.<init> (III)V
// 73d: iload 20
// 73f: sipush 16985
// 742: ldc2_w 4056644242799736567
// 745: lload 1
// 746: lxor
// 747: invokedynamic f (IJ)I bsm=su/catlean/wc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74c: if_icmpne 75f
// 74f: getstatic su/catlean/ld.SAFE Lsu/catlean/ld;
// 752: goto 762
// 755: ldc2_w -3832399609980176315
// 758: lload 1
// 759: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75e: athrow
// 75f: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 762: getstatic su/catlean/z.DOUBLE_X Lsu/catlean/z;
// 765: lload 16
// 767: invokespecial su/catlean/z7.<init> (Lnet/minecraft/class_2338;Lsu/catlean/ld;Lsu/catlean/z;J)V
// 76a: areturn
// 76b: aload 0
// 76c: iload 3
// 76d: iload 4
// 76f: iload 5
// 771: bipush 1
// 772: iadd
// 773: lload 14
// 775: invokespecial su/catlean/wc.V (IIIJ)Z
// 778: aload 18
// 77a: lload 1
// 77b: lconst_0
// 77c: lcmp
// 77d: ifle 7cb
// 780: ifnull 7c9
// 783: ifeq 7a8
// 786: goto 793
// 789: ldc2_w -3832399609980176315
// 78c: lload 1
// 78d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 792: athrow
// 793: iinc 19 1
// 796: aload 18
// 798: ifnonnull 7e7
// 79b: goto 7a8
// 79e: ldc2_w -3832399609980176315
// 7a1: lload 1
// 7a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a7: athrow
// 7a8: aload 0
// 7a9: iload 3
// 7aa: iload 4
// 7ac: iload 5
// 7ae: bipush 1
// 7af: iadd
// 7b0: iload 11
// 7b2: i2s
// 7b3: swap
// 7b4: iload 12
// 7b6: i2c
// 7b7: iload 13
// 7b9: invokespecial su/catlean/wc.M (IISICI)Z
// 7bc: goto 7c9
// 7bf: ldc2_w -3832399609980176315
// 7c2: lload 1
// 7c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c8: athrow
// 7c9: aload 18
// 7cb: lload 1
// 7cc: lconst_0
// 7cd: lcmp
// 7ce: ifle 7f6
// 7d1: ifnull 7f4
// 7d4: ifeq 7e7
// 7d7: goto 7e4
// 7da: ldc2_w -3832399609980176315
// 7dd: lload 1
// 7de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e3: athrow
// 7e4: iinc 20 1
// 7e7: aload 0
// 7e8: iload 3
// 7e9: bipush 1
// 7ea: iadd
// 7eb: iload 4
// 7ed: iload 5
// 7ef: lload 14
// 7f1: invokespecial su/catlean/wc.V (IIIJ)Z
// 7f4: aload 18
// 7f6: lload 1
// 7f7: lconst_0
// 7f8: lcmp
// 7f9: iflt 84c
// 7fc: ifnull 844
// 7ff: ifeq 824
// 802: goto 80f
// 805: ldc2_w -3832399609980176315
// 808: lload 1
// 809: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80e: athrow
// 80f: iinc 19 1
// 812: aload 18
// 814: ifnonnull 862
// 817: goto 824
// 81a: ldc2_w -3832399609980176315
// 81d: lload 1
// 81e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 823: athrow
// 824: aload 0
// 825: iload 3
// 826: bipush 1
// 827: iadd
// 828: iload 4
// 82a: iload 11
// 82c: i2s
// 82d: iload 5
// 82f: iload 12
// 831: i2c
// 832: iload 13
// 834: invokespecial su/catlean/wc.M (IISICI)Z
// 837: goto 844
// 83a: ldc2_w -3832399609980176315
// 83d: lload 1
// 83e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 843: athrow
// 844: lload 1
// 845: lconst_0
// 846: lcmp
// 847: ifle 864
// 84a: aload 18
// 84c: ifnull 864
// 84f: ifeq 862
// 852: goto 85f
// 855: ldc2_w -3832399609980176315
// 858: lload 1
// 859: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85e: athrow
// 85f: iinc 20 1
// 862: iload 19
// 864: bipush 4
// 865: aload 18
// 867: lload 1
// 868: lconst_0
// 869: lcmp
// 86a: ifle 898
// 86d: ifnull 890
// 870: if_icmpeq 8cd
// 873: goto 880
// 876: ldc2_w -3832399609980176315
// 879: lload 1
// 87a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87f: athrow
// 880: iload 20
// 882: bipush 4
// 883: goto 890
// 886: ldc2_w -3832399609980176315
// 889: lload 1
// 88a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88f: athrow
// 890: lload 1
// 891: lconst_0
// 892: lcmp
// 893: ifle 8be
// 896: aload 18
// 898: ifnull 8be
// 89b: if_icmpeq 8cd
// 89e: goto 8ab
// 8a1: ldc2_w -3832399609980176315
// 8a4: lload 1
// 8a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8aa: athrow
// 8ab: iload 19
// 8ad: iload 20
// 8af: iadd
// 8b0: bipush 4
// 8b1: goto 8be
// 8b4: ldc2_w -3832399609980176315
// 8b7: lload 1
// 8b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8bd: athrow
// 8be: if_icmpeq 8cd
// 8c1: aconst_null
// 8c2: areturn
// 8c3: ldc2_w -3832399609980176315
// 8c6: lload 1
// 8c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8cc: athrow
// 8cd: new su/catlean/z7
// 8d0: dup
// 8d1: new net/minecraft/class_2338
// 8d4: dup
// 8d5: iload 3
// 8d6: iload 4
// 8d8: iload 5
// 8da: invokespecial net/minecraft/class_2338.<init> (III)V
// 8dd: iload 20
// 8df: bipush 4
// 8e0: if_icmpne 8f3
// 8e3: getstatic su/catlean/ld.SAFE Lsu/catlean/ld;
// 8e6: goto 8f6
// 8e9: ldc2_w -3832399609980176315
// 8ec: lload 1
// 8ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f2: athrow
// 8f3: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 8f6: getstatic su/catlean/z.SINGLE Lsu/catlean/z;
// 8f9: lload 16
// 8fb: invokespecial su/catlean/z7.<init> (Lnet/minecraft/class_2338;Lsu/catlean/ld;Lsu/catlean/z;J)V
// 8fe: areturn
}

private final List A(int param1, char param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/wc.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 110183283094506
// 023: lxor
// 024: dup2
// 025: bipush 56
// 027: lushr
// 028: l2i
// 029: istore 6
// 02b: dup2
// 02c: bipush 8
// 02e: lshl
// 02f: bipush 8
// 031: lushr
// 032: lstore 7
// 034: pop2
// 035: dup2
// 036: ldc2_w 60426901520977
// 039: lxor
// 03a: lstore 9
// 03c: dup2
// 03d: ldc2_w 104371430978638
// 040: lxor
// 041: dup2
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 11
// 048: dup2
// 049: bipush 32
// 04b: lshl
// 04c: bipush 56
// 04e: lushr
// 04f: l2i
// 050: istore 12
// 052: dup2
// 053: bipush 40
// 055: lshl
// 056: bipush 40
// 058: lushr
// 059: l2i
// 05a: istore 13
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 39823638547000
// 061: lxor
// 062: lstore 14
// 064: dup2
// 065: ldc2_w 85850965678274
// 068: lxor
// 069: lstore 16
// 06b: dup2
// 06c: ldc2_w 2619677002019
// 06f: lxor
// 070: lstore 18
// 072: dup2
// 073: ldc2_w 5963530718540
// 076: lxor
// 077: lstore 20
// 079: dup2
// 07a: ldc2_w 36791148244377
// 07d: lxor
// 07e: dup2
// 07f: bipush 32
// 081: lushr
// 082: l2i
// 083: istore 22
// 085: dup2
// 086: bipush 32
// 088: lshl
// 089: bipush 48
// 08b: lushr
// 08c: l2i
// 08d: istore 23
// 08f: dup2
// 090: bipush 48
// 092: lshl
// 093: bipush 48
// 095: lushr
// 096: l2i
// 097: istore 24
// 099: pop2
// 09a: dup2
// 09b: ldc2_w 8226742236139
// 09e: lxor
// 09f: lstore 25
// 0a1: pop2
// 0a2: ldc2_w -6882874702574918830
// 0a5: lload 4
// 0a7: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: new java/util/ArrayList
// 0af: dup
// 0b0: invokespecial java/util/ArrayList.<init> ()V
// 0b3: checkcast java/util/List
// 0b6: astore 28
// 0b8: astore 27
// 0ba: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 0bd: lload 25
// 0bf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c2: iload 6
// 0c4: i2b
// 0c5: swap
// 0c6: lload 7
// 0c8: dup2_x1
// 0c9: pop2
// 0ca: checkcast net/minecraft/class_1297
// 0cd: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0d0: checkcast net/minecraft/class_2374
// 0d3: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0d6: dup
// 0d7: sipush 21328
// 0da: ldc2_w 9192872589868685030
// 0dd: lload 4
// 0df: lxor
// 0e0: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e8: astore 29
// 0ea: aload 29
// 0ec: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0ef: aload 0
// 0f0: iload 11
// 0f2: iload 12
// 0f4: i2b
// 0f5: iload 13
// 0f7: invokespecial su/catlean/wc.l (IBI)I
// 0fa: isub
// 0fb: istore 30
// 0fd: aload 29
// 0ff: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 102: aload 0
// 103: iload 11
// 105: iload 12
// 107: i2b
// 108: iload 13
// 10a: invokespecial su/catlean/wc.l (IBI)I
// 10d: iadd
// 10e: istore 31
// 110: aload 29
// 112: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 115: aload 0
// 116: lload 18
// 118: invokespecial su/catlean/wc.P (J)I
// 11b: isub
// 11c: istore 32
// 11e: aload 29
// 120: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 123: aload 0
// 124: lload 18
// 126: invokespecial su/catlean/wc.P (J)I
// 129: iadd
// 12a: istore 33
// 12c: aload 29
// 12e: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 131: aload 0
// 132: iload 11
// 134: iload 12
// 136: i2b
// 137: iload 13
// 139: invokespecial su/catlean/wc.l (IBI)I
// 13c: isub
// 13d: istore 34
// 13f: aload 29
// 141: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 144: aload 0
// 145: iload 11
// 147: iload 12
// 149: i2b
// 14a: iload 13
// 14c: invokespecial su/catlean/wc.l (IBI)I
// 14f: iadd
// 150: istore 35
// 152: iload 30
// 154: istore 36
// 156: iload 36
// 158: aload 27
// 15a: ifnull 180
// 15d: iload 31
// 15f: if_icmpgt 3aa
// 162: goto 170
// 165: ldc2_w -6779677492890152068
// 168: lload 4
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: iload 32
// 172: goto 180
// 175: ldc2_w -6779677492890152068
// 178: lload 4
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: istore 37
// 182: iload 37
// 184: iload 3
// 185: iflt 38b
// 188: iload 33
// 18a: if_icmpgt 389
// 18d: iload 34
// 18f: istore 38
// 191: iload 38
// 193: iload 35
// 195: aload 27
// 197: ifnull 38d
// 19a: if_icmpgt 351
// 19d: lload 20
// 19f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1a2: iload 36
// 1a4: bipush 4
// 1a5: ishr
// 1a6: iload 38
// 1a8: bipush 4
// 1a9: ishr
// 1aa: invokevirtual net/minecraft/class_638.method_8497 (II)Lnet/minecraft/class_2818;
// 1ad: dup
// 1ae: sipush 32754
// 1b1: ldc2_w 1105733785658948163
// 1b4: lload 4
// 1b6: lxor
// 1b7: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/wc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1bf: astore 39
// 1c1: aload 0
// 1c2: iload 36
// 1c4: iload 37
// 1c6: iload 38
// 1c8: iload 22
// 1ca: iload 23
// 1cc: i2c
// 1cd: iload 24
// 1cf: invokespecial su/catlean/wc.Z (IIIICI)Lnet/minecraft/class_2680;
// 1d2: astore 40
// 1d4: aload 40
// 1d6: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 1d9: aload 27
// 1db: ifnull 353
// 1de: ifne 20b
// 1e1: aload 27
// 1e3: ifnull 258
// 1e6: goto 1f4
// 1e9: ldc2_w -6779677492890152068
// 1ec: lload 4
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: iload 3
// 1f5: iflt 319
// 1f8: aload 27
// 1fa: ifnonnull 319
// 1fd: goto 20b
// 200: ldc2_w -6779677492890152068
// 203: lload 4
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: aload 0
// 20c: lload 9
// 20e: iload 36
// 210: iload 37
// 212: bipush 1
// 213: iadd
// 214: iload 38
// 216: invokespecial su/catlean/wc.u (JIII)Z
// 219: aload 27
// 21b: iload 3
// 21c: iflt 26c
// 21f: ifnull 266
// 222: goto 230
// 225: ldc2_w -6779677492890152068
// 228: lload 4
// 22a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: athrow
// 230: ifne 258
// 233: goto 241
// 236: ldc2_w -6779677492890152068
// 239: lload 4
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: iload 1
// 242: ifle 319
// 245: aload 27
// 247: ifnonnull 319
// 24a: goto 258
// 24d: ldc2_w -6779677492890152068
// 250: lload 4
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: aload 0
// 259: lload 9
// 25b: iload 36
// 25d: iload 37
// 25f: bipush 2
// 260: iadd
// 261: iload 38
// 263: invokespecial su/catlean/wc.u (JIII)Z
// 266: iload 3
// 267: ifle 2cd
// 26a: aload 27
// 26c: ifnull 2cd
// 26f: ifne 297
// 272: goto 280
// 275: ldc2_w -6779677492890152068
// 278: lload 4
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: iload 3
// 281: ifle 319
// 284: aload 27
// 286: ifnonnull 319
// 289: goto 297
// 28c: ldc2_w -6779677492890152068
// 28f: lload 4
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: aload 0
// 298: aload 27
// 29a: ifnull 2f6
// 29d: goto 2ab
// 2a0: ldc2_w -6779677492890152068
// 2a3: lload 4
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: aload 39
// 2ad: checkcast net/minecraft/class_2791
// 2b0: iload 36
// 2b2: iload 37
// 2b4: bipush 1
// 2b5: isub
// 2b6: lload 16
// 2b8: dup2_x1
// 2b9: pop2
// 2ba: iload 38
// 2bc: invokespecial su/catlean/wc.X (Lnet/minecraft/class_2791;IJII)Z
// 2bf: goto 2cd
// 2c2: ldc2_w -6779677492890152068
// 2c5: lload 4
// 2c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cc: athrow
// 2cd: ifne 2e7
// 2d0: iload 3
// 2d1: iflt 319
// 2d4: aload 27
// 2d6: ifnonnull 319
// 2d9: goto 2e7
// 2dc: ldc2_w -6779677492890152068
// 2df: lload 4
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: aload 0
// 2e8: goto 2f6
// 2eb: ldc2_w -6779677492890152068
// 2ee: lload 4
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: lload 14
// 2f8: iload 36
// 2fa: iload 37
// 2fc: iload 38
// 2fe: invokespecial su/catlean/wc.H (JIII)Lsu/catlean/z7;
// 301: dup
// 302: ifnull 317
// 305: astore 41
// 307: bipush 0
// 308: istore 42
// 30a: aload 28
// 30c: aload 41
// 30e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 313: pop
// 314: goto 319
// 317: pop
// 318: nop
// 319: iload 38
// 31b: iload 35
// 31d: aload 27
// 31f: iload 2
// 320: iflt 35b
// 323: ifnull 355
// 326: if_icmpeq 351
// 329: goto 337
// 32c: ldc2_w -6779677492890152068
// 32f: lload 4
// 331: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: athrow
// 337: iinc 38 1
// 33a: aload 27
// 33c: ifnonnull 19d
// 33f: iload 1
// 340: ifle 20b
// 343: goto 351
// 346: ldc2_w -6779677492890152068
// 349: lload 4
// 34b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: athrow
// 351: iload 37
// 353: iload 33
// 355: iload 3
// 356: ifle 38d
// 359: aload 27
// 35b: ifnull 38d
// 35e: if_icmpeq 389
// 361: goto 36f
// 364: ldc2_w -6779677492890152068
// 367: lload 4
// 369: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36e: athrow
// 36f: iinc 37 1
// 372: aload 27
// 374: ifnonnull 18d
// 377: iload 2
// 378: ifle 351
// 37b: goto 389
// 37e: ldc2_w -6779677492890152068
// 381: lload 4
// 383: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 388: athrow
// 389: iload 36
// 38b: iload 31
// 38d: if_icmpeq 3aa
// 390: iinc 36 1
// 393: aload 27
// 395: ifnonnull 170
// 398: iload 2
// 399: ifle 182
// 39c: goto 3aa
// 39f: ldc2_w -6779677492890152068
// 3a2: lload 4
// 3a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: athrow
// 3aa: aload 28
// 3ac: areturn
}

private static final List Z() {
long var0 = a ^ 32074865261119L;
long var10001 = var0 ^ 43033162783419L;
int var2 = (int)((var0 ^ 43033162783419L) >>> 32);
int var3 = (int)((var0 ^ 43033162783419L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
return g.A(var2, (char)var3, var4);
}

private static final List z(Throwable var0) {
return CollectionsKt.emptyList();
}

static {
long var20 = a ^ 121553176362570L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "ÜüÀ\u00847wV`0Ù§!/\u001d\n\u0082öÇ\u0001Ä\u0019íÛ^ò\u008a\u009e:æ´~\u008f(\u009f*Î\u009eÊ\bý\u0001=ºö\u0082Èø/²b*áÿ>O¤\u009d3\u0084ßz¢\u0004ú\u008eÿÎû¦àð\u001f³ ¯ÙÝ¢{\u009fÁ\f\f\u001fÒ1#ÂÈ°ì\u009fáI\u001f\u009aTã½ÔÇ\u008c2Â'\u0092\u0010$/¦h7Õ5äoàï2A\u0081®\u0093(øViØ\u0093E\u0012g\u0014âf/â\u0080zº\u0018c\u0011Ýä\u001b\u0011L##K\u0092\u000b-\u0085ô<L\t\b\u001fÅ\"\u0000\u0018zØM-Ô)sL#A-Yà\u000b\u0001\u0007\u0084*]±\u0014k\u009f\u0096(AA,\b\u0002\u0017©\u009bæ7ÎI-y\u008f\u0084\u0010ð(ëvW*u)Õ{K\b½vè\u0013\u0014'#\u0000üÝC ÁË=©ï\u0005¶\u0092\u0082m&\u001b¥©\u0013p\u0097òº\u000fuþ\u009dî\u008a¶jù\u0007\u0011So";
int var17 = "ÜüÀ\u00847wV`0Ù§!/\u001d\n\u0082öÇ\u0001Ä\u0019íÛ^ò\u008a\u009e:æ´~\u008f(\u009f*Î\u009eÊ\bý\u0001=ºö\u0082Èø/²b*áÿ>O¤\u009d3\u0084ßz¢\u0004ú\u008eÿÎû¦àð\u001f³ ¯ÙÝ¢{\u009fÁ\f\f\u001fÒ1#ÂÈ°ì\u009fáI\u001f\u009aTã½ÔÇ\u008c2Â'\u0092\u0010$/¦h7Õ5äoàï2A\u0081®\u0093(øViØ\u0093E\u0012g\u0014âf/â\u0080zº\u0018c\u0011Ýä\u001b\u0011L##K\u0092\u000b-\u0085ô<L\t\b\u001fÅ\"\u0000\u0018zØM-Ô)sL#A-Yà\u000b\u0001\u0007\u0084*]±\u0014k\u009f\u0096(AA,\b\u0002\u0017©\u009bæ7ÎI-y\u008f\u0084\u0010ð(ëvW*u)Õ{K\b½vè\u0013\u0014'#\u0000üÝC ÁË=©ï\u0005¶\u0092\u0082m&\u001b¥©\u0013p\u0097òº\u000fuþ\u009dî\u008a¶jù\u0007\u0011So"
.length();
char var14 = ' ';
int var25 = -1;

label54:
while (true) {
String var30 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[10];
h = new HashMap(13);
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
String var4 = "¤Þ\u0007)§7äÏViï\töèªH\u0083Ë[Õ\u0096Ñ\u00882m\u001bù\u0001ß¹¦¯\fK8\u0086Ã\u009bu9¡\u009c\u001d:Ä¯þ\u0088)\u0082å\f\u009b\u00adçº";
int var5 = "¤Þ\u0007)§7äÏViï\töèªH\u0083Ë[Õ\u0096Ñ\u00882m\u001bù\u0001ß¹¦¯\fK8\u0086Ã\u009bu9¡\u009c\u001d:Ä¯þ\u0088)\u0082å\f\u009b\u00adçº".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
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
var33[var10001] = var52;
if (var2 >= var5) {
e = var6;
f = new Integer[9];
g = new wc();
ExecutorService var40 = Executors.newVirtualThreadPerTaskExecutor();
Intrinsics.checkNotNullExpressionValue(var40, a<"d">(25967, 6109948687598427930L ^ var20));
X = var40;
long var41 = 4056732573472465409L ^ var20;
v = new bg();
class_2248[] var22 = new class_2248[]{class_2246.field_10540, class_2246.field_10443, class_2246.field_22109, class_2246.field_22108};
F = SetsKt.setOf(var22);
var22 = new class_2248[]{class_2246.field_9987, class_2246.field_10499};
T = SetsKt.setOf(var22);
n = CollectionsKt.emptyList();
class_2382[] var27 = new class_2382[b<"f">(16985, var41)];
var27[0] = new class_2382(-1, 0, 1);
var27[1] = new class_2382(0, 0, 2);
var27[2] = new class_2382(1, 0, 2);
var27[3] = new class_2382(2, 0, 1);
var27[4] = new class_2382(2, 0, 0);
var27[5] = new class_2382(1, 0, -1);
Q = CollectionsKt.listOf(var27);
class_2382[] var28 = new class_2382[]{new class_2382(-1, 0, 1), new class_2382(0, 0, 2), new class_2382(1, 0, 1), new class_2382(1, 0, 0)};
J = CollectionsKt.listOf(var28);
class_2382[] var29 = new class_2382[]{new class_2382(0, 0, 1), new class_2382(1, 0, 1), new class_2382(2, 0, 0), new class_2382(1, 0, -1)};
i = CollectionsKt.mutableListOf(var29);
return;
}
break;
default:
var33[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u008eÀ\u000f\u0003»'F¶VúG\u009e\u0019\u0006\u009dä";
var5 = "\u008eÀ\u000f\u0003»'F¶VúG\u009e\u0019\u0006\u009dä".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
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

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var43;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "1]*h\u00adÀºæ\u008aLHJ\u0084\u0016\u001dâo\u008aK\nüÚ\u008c\u0082!ý®\u007f3VÂé@ÉK\tú\u0082ÜmëQòÍ\u009f\u0006\u0007O¦\u0086½\u001dm¦\u0097Í£\u009c\u009eÛ+öiäØv·SÙÖ\u0090gå@âÀ(b*\u0010%\u00162ì\u0005TUi\u0093} -ª,Ð7E";
var17 = "1]*h\u00adÀºæ\u008aLHJ\u0084\u0016\u001dâo\u008aK\nüÚ\u008c\u0082!ý®\u007f3VÂé@ÉK\tú\u0082ÜmëQòÍ\u009f\u0006\u0007O¦\u0086½\u001dm¦\u0097Í£\u009c\u009eÛ+öiäØv·SÙÖ\u0090gå@âÀ(b*\u0010%\u00162ì\u0005TUi\u0093} -ª,Ð7E"
.length();
var14 = ' ';
var25 = -1;
}

var30 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9527;
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
throw new RuntimeException("su/catlean/wc", var10);
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
throw new RuntimeException("su/catlean/wc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16146;
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
throw new RuntimeException("su/catlean/wc", var14);
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
throw new RuntimeException("su/catlean/wc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
