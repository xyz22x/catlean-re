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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _5 extends _3 {
@NotNull
public static final _5 t;
static final KProperty[] B;
@NotNull
private static final cq c;
@NotNull
private static final c8 w;
@NotNull
private static final cq l;
@NotNull
private static final i9 i;
@NotNull
private static final i9 h;
@Nullable
private static class_3965 o;
@Nullable
private static class_2338 F;
private static final long m = yz.a(4274978275322558135L, -3186876596970392574L, MethodHandles.lookup().lookupClass()).a(39814049665642L);
private static final String[] n;
private static final String[] y;
private static final Map I = new HashMap(13);
private static final long[] O;
private static final Integer[] S;
private static final Map W;

private _5(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ m;
long var10001 = var4 ^ 97648748101088L;
int var6 = (int)((var4 ^ 97648748101088L) >>> 48);
int var7 = (int)((var4 ^ 97648748101088L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
super(c<"l">(12149, 5413010199518729933L ^ var4), (short)var6, jt.Q(), 0, false, f<"c">(27735, 1564662309941339812L ^ var4), (short)var7, var8, null);
}

private final boolean V(long var1) {
var1 = m ^ var1;
long var3 = var1 ^ 135456054777281L;
return (Boolean)c.E(this, var3, B[0]);
}

private final int F(long var1) {
var1 = m ^ var1;
long var3 = var1 ^ 57804833727989L;
return ((Number)w.E(this, var3, B[1])).intValue();
}

private final boolean I(long var1) {
var1 = m ^ var1;
long var3 = var1 ^ 127693292177633L;
return (Boolean)l.E(this, var3, B[2]);
}

@Flow
private final void c(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_5.m J
// 003: ldc2_w 45126901047242
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 102636541539899
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 13179629036512
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 79952681383907
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 32
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
// 039: ldc2_w 11129015649431
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 79861641646033
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 75942120910690
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 20856361895439
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 117893381189486
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 72346223548991
// 05f: lxor
// 060: lstore 21
// 062: pop2
// 063: ldc2_w -6319108511836893245
// 066: lload 2
// 067: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: astore 23
// 06e: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 071: aload 23
// 073: ifnonnull 09b
// 076: lload 19
// 078: invokevirtual su/catlean/ux.f (J)Z
// 07b: ifeq 412
// 07e: goto 08b
// 081: ldc2_w -6335974075889363116
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 08e: goto 09b
// 091: ldc2_w -6335974075889363116
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 09e: ifnull 412
// 0a1: aload 0
// 0a2: lload 17
// 0a4: invokespecial su/catlean/_5.V (J)Z
// 0a7: ifeq 0fb
// 0aa: goto 0b7
// 0ad: ldc2_w -6335974075889363116
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0ba: bipush 1
// 0bb: anewarray 118
// 0be: astore 25
// 0c0: aload 25
// 0c2: bipush 0
// 0c3: getstatic net/minecraft/class_2246.field_10258 Lnet/minecraft/class_2248;
// 0c6: dup
// 0c7: sipush 28232
// 0ca: ldc2_w 3650725328677273965
// 0cd: lload 2
// 0ce: lxor
// 0cf: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/_5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d7: aastore
// 0d8: aload 25
// 0da: lload 6
// 0dc: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_2248;J)Lsu/catlean/fg;
// 0df: invokevirtual su/catlean/fg.R ()Z
// 0e2: aload 23
// 0e4: ifnonnull 0f8
// 0e7: ifeq 0fb
// 0ea: goto 0f7
// 0ed: ldc2_w -6335974075889363116
// 0f0: lload 2
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: bipush 1
// 0f8: goto 0fc
// 0fb: bipush 0
// 0fc: istore 24
// 0fe: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 101: astore 25
// 103: bipush 0
// 104: istore 26
// 106: bipush 0
// 107: istore 27
// 109: aload 25
// 10b: invokevirtual su/catlean/bo.Y ()Ljava/util/concurrent/ExecutorService;
// 10e: new su/catlean/j4
// 111: dup
// 112: iload 26
// 114: iload 24
// 116: invokespecial su/catlean/j4.<init> (IZ)V
// 119: checkcast java/lang/Runnable
// 11c: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
// 121: nop
// 122: getstatic su/catlean/_5.i Lsu/catlean/i9;
// 125: iload 8
// 127: i2s
// 128: iload 9
// 12a: iload 10
// 12c: i2s
// 12d: sipush 29918
// 130: ldc2_w 6909146080222505149
// 133: lload 2
// 134: lxor
// 135: invokedynamic c (IJ)I bsm=su/catlean/_5.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: invokevirtual su/catlean/i9.g (SISI)Z
// 13d: aload 23
// 13f: ifnonnull 1ad
// 142: ifeq 1ab
// 145: goto 152
// 148: ldc2_w -6335974075889363116
// 14b: lload 2
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: getstatic su/catlean/_5.o Lnet/minecraft/class_3965;
// 155: dup
// 156: ifnull 1a9
// 159: goto 166
// 15c: ldc2_w -6335974075889363116
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: astore 27
// 168: bipush 0
// 169: istore 28
// 16b: getstatic su/catlean/_5.t Lsu/catlean/_5;
// 16e: checkcast su/catlean/_3
// 171: aload 27
// 173: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 176: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 179: bipush 0
// 17a: bipush 0
// 17b: aconst_null
// 17c: bipush 0
// 17d: sipush 23048
// 180: ldc2_w 6267195606739142254
// 183: lload 2
// 184: lxor
// 185: invokedynamic c (IJ)I bsm=su/catlean/_5.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: lload 15
// 18c: aconst_null
// 18d: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 190: pop
// 191: getstatic su/catlean/_5.t Lsu/catlean/_5;
// 194: pop
// 195: aload 27
// 197: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 19a: putstatic su/catlean/_5.F Lnet/minecraft/class_2338;
// 19d: getstatic su/catlean/_5.i Lsu/catlean/i9;
// 1a0: lload 21
// 1a2: invokevirtual su/catlean/i9.X (J)V
// 1a5: nop
// 1a6: goto 1ab
// 1a9: pop
// 1aa: nop
// 1ab: iload 24
// 1ad: ifeq 412
// 1b0: getstatic su/catlean/_5.F Lnet/minecraft/class_2338;
// 1b3: ifnull 412
// 1b6: goto 1c3
// 1b9: ldc2_w -6335974075889363116
// 1bc: lload 2
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: getstatic su/catlean/_5.h Lsu/catlean/i9;
// 1c6: aload 0
// 1c7: lload 4
// 1c9: invokespecial su/catlean/_5.F (J)I
// 1cc: iload 8
// 1ce: i2s
// 1cf: swap
// 1d0: iload 9
// 1d2: swap
// 1d3: iload 10
// 1d5: i2s
// 1d6: swap
// 1d7: invokevirtual su/catlean/i9.g (SISI)Z
// 1da: ifeq 412
// 1dd: goto 1ea
// 1e0: ldc2_w -6335974075889363116
// 1e3: lload 2
// 1e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: athrow
// 1ea: lload 11
// 1ec: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1ef: getstatic su/catlean/_5.F Lnet/minecraft/class_2338;
// 1f2: dup
// 1f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1f6: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1f9: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1fc: dup
// 1fd: sipush 24381
// 200: ldc2_w 5195674514532741141
// 203: lload 2
// 204: lxor
// 205: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/_5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 20d: astore 25
// 20f: aload 25
// 211: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 214: aload 23
// 216: ifnonnull 23b
// 219: ifne 30f
// 21c: goto 229
// 21f: ldc2_w -6335974075889363116
// 222: lload 2
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: aload 25
// 22b: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 22e: goto 23b
// 231: ldc2_w -6335974075889363116
// 234: lload 2
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: ifeq 30f
// 23e: getstatic su/catlean/x_.G Lkotlin/enums/EnumEntries;
// 241: checkcast java/lang/Iterable
// 244: astore 26
// 246: bipush 0
// 247: istore 27
// 249: aload 26
// 24b: aload 23
// 24d: ifnonnull 29f
// 250: instanceof java/util/Collection
// 253: ifeq 29d
// 256: goto 263
// 259: ldc2_w -6335974075889363116
// 25c: lload 2
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: aload 26
// 265: checkcast java/util/Collection
// 268: aload 23
// 26a: ifnonnull 29f
// 26d: goto 27a
// 270: ldc2_w -6335974075889363116
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: invokeinterface java/util/Collection.isEmpty ()Z 1
// 27f: ifeq 29d
// 282: goto 28f
// 285: ldc2_w -6335974075889363116
// 288: lload 2
// 289: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: athrow
// 28f: bipush 0
// 290: goto 30c
// 293: ldc2_w -6335974075889363116
// 296: lload 2
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: aload 26
// 29f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2a4: astore 28
// 2a6: aload 28
// 2a8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ad: ifeq 30b
// 2b0: aload 28
// 2b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b7: astore 29
// 2b9: aload 29
// 2bb: checkcast net/minecraft/class_2350
// 2be: astore 30
// 2c0: bipush 0
// 2c1: istore 31
// 2c3: aload 30
// 2c5: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 2c8: if_acmpeq 2fe
// 2cb: lload 11
// 2cd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2d0: getstatic su/catlean/_5.F Lnet/minecraft/class_2338;
// 2d3: dup
// 2d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2d7: aload 30
// 2d9: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 2dc: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2df: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 2e2: instanceof net/minecraft/class_2502
// 2e5: aload 23
// 2e7: ifnonnull 2fb
// 2ea: ifeq 2fe
// 2ed: goto 2fa
// 2f0: ldc2_w -6335974075889363116
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: bipush 1
// 2fb: goto 2ff
// 2fe: bipush 0
// 2ff: ifeq 2a6
// 302: bipush 1
// 303: aload 23
// 305: ifnonnull 2c1
// 308: goto 30c
// 30b: bipush 0
// 30c: ifeq 310
// 30f: return
// 310: getstatic su/catlean/x_.G Lkotlin/enums/EnumEntries;
// 313: checkcast java/lang/Iterable
// 316: astore 27
// 318: bipush 0
// 319: istore 28
// 31b: aload 27
// 31d: astore 29
// 31f: new java/util/ArrayList
// 322: dup
// 323: invokespecial java/util/ArrayList.<init> ()V
// 326: checkcast java/util/Collection
// 329: astore 30
// 32b: bipush 0
// 32c: istore 31
// 32e: aload 29
// 330: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 335: astore 32
// 337: aload 32
// 339: invokeinterface java/util/Iterator.hasNext ()Z 1
// 33e: ifeq 38f
// 341: aload 32
// 343: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 348: astore 33
// 34a: aload 33
// 34c: checkcast net/minecraft/class_2350
// 34f: astore 34
// 351: bipush 0
// 352: istore 35
// 354: aload 23
// 356: ifnonnull 412
// 359: aload 34
// 35b: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 35e: if_acmpeq 37c
// 361: goto 36e
// 364: ldc2_w -6335974075889363116
// 367: lload 2
// 368: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: athrow
// 36e: bipush 1
// 36f: goto 37d
// 372: ldc2_w -6335974075889363116
// 375: lload 2
// 376: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37b: athrow
// 37c: bipush 0
// 37d: ifeq 337
// 380: aload 30
// 382: aload 33
// 384: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 389: pop
// 38a: aload 23
// 38c: ifnull 337
// 38f: aload 30
// 391: checkcast java/util/List
// 394: nop
// 395: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 39a: astore 26
// 39c: aload 26
// 39e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3a3: ifeq 412
// 3a6: aload 26
// 3a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3ad: checkcast net/minecraft/class_2350
// 3b0: astore 27
// 3b2: getstatic su/catlean/_5.F Lnet/minecraft/class_2338;
// 3b5: dup
// 3b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3b9: aload 27
// 3bb: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 3be: dup
// 3bf: sipush 27200
// 3c2: ldc2_w 4266011828553909614
// 3c5: lload 2
// 3c6: lxor
// 3c7: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/_5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3cf: astore 28
// 3d1: aload 0
// 3d2: aload 28
// 3d4: lload 13
// 3d6: invokevirtual su/catlean/_5.Z (Lnet/minecraft/class_2338;J)Z
// 3d9: ifeq 39c
// 3dc: aload 0
// 3dd: checkcast su/catlean/_3
// 3e0: aload 28
// 3e2: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 3e5: bipush 0
// 3e6: bipush 0
// 3e7: getstatic net/minecraft/class_2246.field_10258 Lnet/minecraft/class_2248;
// 3ea: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 3ed: bipush 0
// 3ee: sipush 27650
// 3f1: ldc2_w 5555319951773757542
// 3f4: lload 2
// 3f5: lxor
// 3f6: invokedynamic c (IJ)I bsm=su/catlean/_5.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: lload 15
// 3fd: aconst_null
// 3fe: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 401: pop
// 402: getstatic su/catlean/_5.h Lsu/catlean/i9;
// 405: lload 21
// 407: invokevirtual su/catlean/i9.X (J)V
// 40a: aload 23
// 40c: ifnonnull 3d1
// 40f: goto 412
// 412: return
}

public final boolean Z(@NotNull class_2338 pos, long a) {
a = m ^ a;
long var4 = a ^ 98233007476900L;
long var6 = a ^ 31929281025002L;
long var8 = a ^ 140504035357680L;
long var10 = a ^ 37849231510766L;
vm.a<"Å">(1227882484445034119L, a);
Intrinsics.checkNotNullParameter(pos, c<"l">(30774, 1187805762528652894L ^ a));

try {
boolean var10000 = gw.Y.x(pos, this.w(var8), var10, this.s(), this.Y(var6), this.Q(var4));
if (vm.a<"Å">(1246073311966990299L, a) != null) {
vm.a<"Å">(new int[3], 1266694993546075837L, a);
}

return var10000;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 1249271645417401872L, a);
}
}

@NotNull
@Override
protected List R(long var1) {
return CollectionsKt.listOf(class_2246.field_10540);
}

private static final boolean t() {
long var0 = m ^ 113764767281836L;
long var2 = var0 ^ 101726307249001L;
return t.V(var2);
}

public static final void E(class_3965 <set-?>) {
o = <set-?>;
}

public static final boolean S(long a, _5 $this) {
a = m ^ a;
long var3 = a ^ 73333792933509L;
return $this.I(var3);
}

static {
long var20 = m ^ 5415785378670L;
long var22 = var20 ^ 53215017358335L;
long var24 = var20 ^ 37917171139369L;
long var26 = var20 ^ 15238152638031L;
long var28 = (var20 ^ 139663835008160L) >>> 16;
int var30 = (int)((var20 ^ 139663835008160L) << 48 >>> 48);
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
String var15 = "¢\u0080 Ágso \u0095¯.@\u001a\u009dP¸\u0015\u0097î9Nm\u000ba\u0018\u009eö`Ev\u0001P9¼\u0093\u0014Î\u0099\u0017Þ\flù(ýëæýõ ÎÂªóy\u008d\u0089\\ÃÁM*ª\u0018\u0086\t\u0098óJ?ÇÀXµ'\u0014\u0012ê7©K+\u0010\u001aR\fÐ>.A\u009e¸¦x[\u0012\u0091\u0087\u0094\u0010=»ù\u0002º\u0098G\u0004[ú6\u001cÚ\u0081ì^\u0010ë\u0086J.)\u00ad³@\u0082\u0090Ió\u001a¥D\u009d LÕËeJÈY\u007ft\u0082&ìÌÎ\u0010\u0094Ä\u0082ã§7vbâ¯\u0015¤\u009e'Ã×O(\u009c9Æó_|¯\u0011¬x·(ýª\"\u009d#ë»\u0089\u0084àF,ú\u0096Î«\u009eÌLøÑ\u0005%[Gð°[ 'kK\u009cÜÉc&û\"\u009a,Í\u0014\u0099m\u0098\u00819<¦fN×Þé(Ñ²}d\u001f\u0018í 99\u0098vs±\u001f\u009c+\u007f9Ï\u000bSü]´)9zæ\u0091\u0010¼1¹\u001d\u009aÐý£ú\u000e\u0086VS)8¬(F8Õ\u0011y\u0010\u009d5gæß\u0088\u0094\u008d\u001cA~ì\u0084hËþ\f5\tÛo\u001f¶\u001epZMv¨¢\u0083y\u0001j";
int var17 = "¢\u0080 Ágso \u0095¯.@\u001a\u009dP¸\u0015\u0097î9Nm\u000ba\u0018\u009eö`Ev\u0001P9¼\u0093\u0014Î\u0099\u0017Þ\flù(ýëæýõ ÎÂªóy\u008d\u0089\\ÃÁM*ª\u0018\u0086\t\u0098óJ?ÇÀXµ'\u0014\u0012ê7©K+\u0010\u001aR\fÐ>.A\u009e¸¦x[\u0012\u0091\u0087\u0094\u0010=»ù\u0002º\u0098G\u0004[ú6\u001cÚ\u0081ì^\u0010ë\u0086J.)\u00ad³@\u0082\u0090Ió\u001a¥D\u009d LÕËeJÈY\u007ft\u0082&ìÌÎ\u0010\u0094Ä\u0082ã§7vbâ¯\u0015¤\u009e'Ã×O(\u009c9Æó_|¯\u0011¬x·(ýª\"\u009d#ë»\u0089\u0084àF,ú\u0096Î«\u009eÌLøÑ\u0005%[Gð°[ 'kK\u009cÜÉc&û\"\u009a,Í\u0014\u0099m\u0098\u00819<¦fN×Þé(Ñ²}d\u001f\u0018í 99\u0098vs±\u001f\u009c+\u007f9Ï\u000bSü]´)9zæ\u0091\u0010¼1¹\u001d\u009aÐý£ú\u000e\u0086VS)8¬(F8Õ\u0011y\u0010\u009d5gæß\u0088\u0094\u008d\u001cA~ì\u0084hËþ\f5\tÛo\u001f¶\u001epZMv¨¢\u0083y\u0001j"
.length();
char var14 = 24;
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var46 = c(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var46;
if ((var34 += var14) >= var17) {
n = var18;
y = new String[14];
W = new HashMap(13);
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
String var4 = "Å\u0001hÌ\f3\u0087÷[0ø\u008eúG×1X«]H\u0080\u008aëE\t\u007f¨\r\u0015ôi`ú\u008f\u00992\u0005Å]qÍbþ\u009föúÔ!";
int var5 = "Å\u0001hÌ\f3\u0087÷[0ø\u008eúG×1X«]H\u0080\u008aëE\t\u007f¨\r\u0015ôi`ú\u008f\u00992\u0005Å]qÍbþ\u009föúÔ!".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
var10001 = var3++;
long var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var53 = -1;

while (true) {
long var8 = var50;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var55 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var53) {
case 0:
var38[var10001] = var55;
if (var2 >= var5) {
O = var6;
S = new Integer[8];
KProperty[] var31 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(_5.class, c<"l">(24190, 5720239050643774960L ^ var20), c<"l">(5369, 2364600599587018618L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(_5.class, c<"l">(9611, 1029477084455986697L ^ var20), c<"l">(8955, 4195260064322675069L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(_5.class, c<"l">(12618, 5657583513104970435L ^ var20), c<"l">(10905, 8141619688878532889L ^ var20), 0))
};
B = var31;
t = new _5(var28, (short)var30);
c = yp.t(t, c<"l">(15689, 3529007234858090182L ^ var20), false, var24, null, null, f<"c">(26805, 651141677993416816L ^ var20), null);
w = yp.L(
t,
c<"l">(13040, 5554760336999936379L ^ var20),
f<"c">(7600, 24734994357988723L ^ var20),
new IntRange(0, f<"c">(13017, 1170309910791914008L ^ var20)),
var26,
null,
_5::t,
f<"c">(8154, 5107525964100808478L ^ var20),
null
);
l = yp.t(t, c<"l">(24314, 1541765563209850237L ^ var20), false, var24, null, null, f<"c">(26805, 651141677993416816L ^ var20), null);
i = new i9(var22);
h = new i9(var22);
return;
}
break;
default:
var38[var10001] = var55;
if (var2 < var5) {
continue label36;
}

var4 = "\u001a\u0085ùË\u0086\u0091\u0093\u0093«*#nóÛùÅ";
var5 = "\u001a\u0085ùË\u0086\u0091\u0093\u0093«*#nóÛùÅ".length();
var2 = 0;
}

byte var44 = var2;
var2 += 8;
var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
var38 = var6;
var10001 = var3++;
var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var53 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var46;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "¡\u0010;ms|\u000b¨¸(F²\u007fèE\u0080@]\u007f):\u0080CßÐt»ó¸\u001e\u0083ø}üÅjQâJ7DàñÝºçÁ\u0095(dJ©hu\u0094Á\u0099#í\\Dîì4aÀç\n\u0015æiµZO&üºN?\u009e\u0098=\u001ea;\\ÎèÎ";
var17 = "¡\u0010;ms|\u000b¨¸(F²\u007fèE\u0080@]\u007f):\u0080CßÐt»ó¸\u001e\u0083ø}üÅjQâJ7DàñÝºçÁ\u0095(dJ©hu\u0094Á\u0099#í\\Dîì4aÀç\n\u0015æiµZO&üºN?\u009e\u0098=\u001ea;\\ÎèÎ"
.length();
var14 = '0';
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18032;
if (y[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])I.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
I.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_5", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = n[var5].getBytes("ISO-8859-1");
y[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return y[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/_5" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13628;
if (S[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = O[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])W.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
W.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_5", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
S[var3] = var15;
}

return S[var3];
}

private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = f(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite f(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
