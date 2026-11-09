package su.catlean;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pg extends gf {
@NotNull
public static final pg k;
@NotNull
private static final List m;
@NotNull
private static final fd z;
private static final long a = yz.a(8005792646645263982L, 953061348799163574L, MethodHandles.lookup().lookupClass()).a(143583625293000L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private pg(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
long var10001 = var4 ^ 74063092947160L;
int var6 = (int)((var4 ^ 74063092947160L) >>> 48);
int var7 = (int)((var4 ^ 74063092947160L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"t">(9934, 8863951870027110470L ^ var4), (char)var8);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 73719739740194
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 70082237648869
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 50910300018319
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 81581919584095
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 99541060701969
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 12
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 13
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 14
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 100479272291701
// 042: lxor
// 043: lstore 15
// 045: dup2
// 046: ldc2_w 130512158954640
// 049: lxor
// 04a: lstore 17
// 04c: dup2
// 04d: ldc2_w 104104530525409
// 050: lxor
// 051: dup2
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 19
// 058: dup2
// 059: bipush 16
// 05b: lshl
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 20
// 062: dup2
// 063: bipush 48
// 065: lshl
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 21
// 06c: pop2
// 06d: dup2
// 06e: ldc2_w 128377113661390
// 071: lxor
// 072: lstore 22
// 074: dup2
// 075: ldc2_w 20173347401993
// 078: lxor
// 079: lstore 24
// 07b: dup2
// 07c: ldc2_w 99949442920536
// 07f: lxor
// 080: lstore 26
// 082: dup2
// 083: ldc2_w 30591967126976
// 086: lxor
// 087: lstore 28
// 089: dup2
// 08a: ldc2_w 14190504267447
// 08d: lxor
// 08e: lstore 30
// 090: pop2
// 091: ldc2_w -5990705277528627281
// 094: lload 1
// 095: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: aload 3
// 09b: sipush 19792
// 09e: ldc2_w 568626559788715239
// 0a1: lload 1
// 0a2: lxor
// 0a3: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/pg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ab: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 0ae: invokevirtual su/catlean/s7.a ()Ljava/util/List;
// 0b1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0b6: astore 33
// 0b8: istore 32
// 0ba: aload 33
// 0bc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c1: ifeq 1dc
// 0c4: aload 33
// 0c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0cb: checkcast su/catlean/ds
// 0ce: astore 34
// 0d0: getstatic su/catlean/pg.m Ljava/util/List;
// 0d3: checkcast java/lang/Iterable
// 0d6: astore 36
// 0d8: bipush 0
// 0d9: istore 37
// 0db: aload 36
// 0dd: iload 32
// 0df: lload 1
// 0e0: lconst_0
// 0e1: lcmp
// 0e2: ifle 0ea
// 0e5: ifeq 1e8
// 0e8: iload 32
// 0ea: ifeq 149
// 0ed: goto 0fa
// 0f0: ldc2_w -5998132523813566779
// 0f3: lload 1
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: instanceof java/util/Collection
// 0fd: ifeq 147
// 100: goto 10d
// 103: ldc2_w -5998132523813566779
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: aload 36
// 10f: checkcast java/util/Collection
// 112: iload 32
// 114: ifeq 149
// 117: goto 124
// 11a: ldc2_w -5998132523813566779
// 11d: lload 1
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: invokeinterface java/util/Collection.isEmpty ()Z 1
// 129: ifeq 147
// 12c: goto 139
// 12f: ldc2_w -5998132523813566779
// 132: lload 1
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: bipush 1
// 13a: goto 18f
// 13d: ldc2_w -5998132523813566779
// 140: lload 1
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: aload 36
// 149: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 14e: astore 38
// 150: aload 38
// 152: invokeinterface java/util/Iterator.hasNext ()Z 1
// 157: ifeq 18e
// 15a: aload 38
// 15c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 161: astore 39
// 163: aload 39
// 165: checkcast su/catlean/pz
// 168: astore 40
// 16a: bipush 0
// 16b: istore 41
// 16d: aload 40
// 16f: invokevirtual su/catlean/pz.A ()Ljava/lang/String;
// 172: aload 34
// 174: lload 30
// 176: invokevirtual su/catlean/ds.W (J)Ljava/lang/String;
// 179: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 17c: ifeq 150
// 17f: bipush 0
// 180: lload 1
// 181: lconst_0
// 182: lcmp
// 183: ifle 17c
// 186: iload 32
// 188: ifeq 17c
// 18b: goto 18f
// 18e: bipush 1
// 18f: istore 35
// 191: iload 35
// 193: lload 1
// 194: lconst_0
// 195: lcmp
// 196: ifle 1d9
// 199: iload 32
// 19b: ifeq 1d6
// 19e: ifeq 0ba
// 1a1: goto 1ae
// 1a4: ldc2_w -5998132523813566779
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: getstatic su/catlean/pg.m Ljava/util/List;
// 1b1: new su/catlean/pz
// 1b4: dup
// 1b5: aload 34
// 1b7: lload 30
// 1b9: invokevirtual su/catlean/ds.W (J)Ljava/lang/String;
// 1bc: lload 6
// 1be: aconst_null
// 1bf: bipush 0
// 1c0: sipush 9046
// 1c3: ldc2_w 700496215151932529
// 1c6: lload 1
// 1c7: lxor
// 1c8: invokedynamic p (IJ)I bsm=su/catlean/pg.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: aconst_null
// 1ce: invokespecial su/catlean/pz.<init> (Ljava/lang/String;JLsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1d1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1d6: pop
// 1d7: iload 32
// 1d9: ifne 0ba
// 1dc: getstatic su/catlean/pg.m Ljava/util/List;
// 1df: lload 1
// 1e0: lconst_0
// 1e1: lcmp
// 1e2: iflt 0cb
// 1e5: checkcast java/lang/Iterable
// 1e8: astore 33
// 1ea: bipush 0
// 1eb: istore 34
// 1ed: aload 33
// 1ef: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1f4: astore 35
// 1f6: aload 35
// 1f8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1fd: ifeq 2f8
// 200: aload 35
// 202: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 207: astore 36
// 209: aload 36
// 20b: checkcast su/catlean/pz
// 20e: astore 37
// 210: bipush 0
// 211: istore 38
// 213: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 216: invokevirtual su/catlean/s7.a ()Ljava/util/List;
// 219: checkcast java/lang/Iterable
// 21c: astore 39
// 21e: bipush 0
// 21f: istore 40
// 221: aload 39
// 223: iload 32
// 225: ifeq 28f
// 228: instanceof java/util/Collection
// 22b: lload 1
// 22c: lconst_0
// 22d: lcmp
// 22e: iflt 315
// 231: iload 32
// 233: ifeq 311
// 236: goto 243
// 239: ldc2_w -5998132523813566779
// 23c: lload 1
// 23d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 242: athrow
// 243: ifeq 28d
// 246: goto 253
// 249: ldc2_w -5998132523813566779
// 24c: lload 1
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: aload 39
// 255: checkcast java/util/Collection
// 258: iload 32
// 25a: ifeq 28f
// 25d: goto 26a
// 260: ldc2_w -5998132523813566779
// 263: lload 1
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: invokeinterface java/util/Collection.isEmpty ()Z 1
// 26f: ifeq 28d
// 272: goto 27f
// 275: ldc2_w -5998132523813566779
// 278: lload 1
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: bipush 1
// 280: goto 2d5
// 283: ldc2_w -5998132523813566779
// 286: lload 1
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: aload 39
// 28f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 294: astore 41
// 296: aload 41
// 298: invokeinterface java/util/Iterator.hasNext ()Z 1
// 29d: ifeq 2d4
// 2a0: aload 41
// 2a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2a7: astore 42
// 2a9: aload 42
// 2ab: checkcast su/catlean/ds
// 2ae: astore 43
// 2b0: bipush 0
// 2b1: istore 44
// 2b3: aload 43
// 2b5: lload 30
// 2b7: invokevirtual su/catlean/ds.W (J)Ljava/lang/String;
// 2ba: aload 37
// 2bc: invokevirtual su/catlean/pz.A ()Ljava/lang/String;
// 2bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2c2: ifeq 296
// 2c5: bipush 0
// 2c6: lload 1
// 2c7: lconst_0
// 2c8: lcmp
// 2c9: iflt 2c2
// 2cc: iload 32
// 2ce: ifeq 2c2
// 2d1: goto 2d5
// 2d4: bipush 1
// 2d5: lload 1
// 2d6: lconst_0
// 2d7: lcmp
// 2d8: ifle 2f5
// 2db: ifeq 2f1
// 2de: aload 37
// 2e0: bipush 1
// 2e1: invokevirtual su/catlean/pz.D (Z)V
// 2e4: goto 2f1
// 2e7: ldc2_w -5998132523813566779
// 2ea: lload 1
// 2eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: athrow
// 2f1: nop
// 2f2: nop
// 2f3: iload 32
// 2f5: ifne 1f6
// 2f8: nop
// 2f9: getstatic su/catlean/pg.m Ljava/util/List;
// 2fc: lload 1
// 2fd: lconst_0
// 2fe: lcmp
// 2ff: iflt 207
// 302: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/pg.F (Lsu/catlean/pz;)Z, (Lsu/catlean/pz;)Ljava/lang/Boolean; ]
// 307: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/pg.n (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 30c: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 311: pop
// 312: sipush 8362
// 315: ldc2_w 8288947938903875870
// 318: lload 1
// 319: lxor
// 31a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/pg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: astore 33
// 321: aload 0
// 322: lload 28
// 324: invokevirtual su/catlean/pg.p (J)F
// 327: aload 0
// 328: lload 15
// 32a: invokevirtual su/catlean/pg.r (J)I
// 32d: i2f
// 32e: fconst_2
// 32f: fdiv
// 330: fcmpl
// 331: iload 32
// 333: ifeq 347
// 336: ifle 34a
// 339: goto 346
// 33c: ldc2_w -5998132523813566779
// 33f: lload 1
// 340: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: athrow
// 346: bipush 1
// 347: goto 34b
// 34a: bipush 0
// 34b: istore 34
// 34d: getstatic su/catlean/pg.z Lsu/catlean/fd;
// 350: getstatic su/catlean/pg.m Ljava/util/List;
// 353: invokeinterface java/util/List.isEmpty ()Z 1
// 358: iload 32
// 35a: lload 1
// 35b: lconst_0
// 35c: lcmp
// 35d: ifle 393
// 360: ifeq 38b
// 363: ifeq 3cf
// 366: goto 373
// 369: ldc2_w -5998132523813566779
// 36c: lload 1
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: lload 4
// 375: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 378: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 37b: instanceof net/minecraft/class_408
// 37e: goto 38b
// 381: ldc2_w -5998132523813566779
// 384: lload 1
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: lload 1
// 38c: lconst_0
// 38d: lcmp
// 38e: iflt 3be
// 391: iload 32
// 393: ifeq 3be
// 396: ifne 3cf
// 399: goto 3a6
// 39c: ldc2_w -5998132523813566779
// 39f: lload 1
// 3a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: athrow
// 3a6: lload 4
// 3a8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3ab: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 3ae: instanceof su/catlean/rl
// 3b1: goto 3be
// 3b4: ldc2_w -5998132523813566779
// 3b7: lload 1
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: ifne 3cf
// 3c1: fconst_0
// 3c2: goto 3d0
// 3c5: ldc2_w -5998132523813566779
// 3c8: lload 1
// 3c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: athrow
// 3cf: fconst_1
// 3d0: lload 10
// 3d2: dup2_x1
// 3d3: pop2
// 3d4: invokevirtual su/catlean/fd.B (JF)V
// 3d7: aload 0
// 3d8: aload 3
// 3d9: aload 33
// 3db: getstatic su/catlean/pg.z Lsu/catlean/fd;
// 3de: invokevirtual su/catlean/fd.a ()F
// 3e1: iload 34
// 3e3: lload 17
// 3e5: invokevirtual su/catlean/pg.q (Lnet/minecraft/class_332;Ljava/lang/String;FZJ)V
// 3e8: ldc 17.0
// 3ea: fstore 35
// 3ec: lload 26
// 3ee: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3f1: lload 24
// 3f3: aload 33
// 3f5: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 3f8: ldc 24.0
// 3fa: fadd
// 3fb: fstore 36
// 3fd: getstatic su/catlean/pg.m Ljava/util/List;
// 400: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 405: astore 37
// 407: aload 37
// 409: invokeinterface java/util/Iterator.hasNext ()Z 1
// 40e: ifeq 47a
// 411: aload 37
// 413: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 418: checkcast su/catlean/pz
// 41b: astore 38
// 41d: lload 26
// 41f: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 422: aload 38
// 424: invokevirtual su/catlean/pz.A ()Ljava/lang/String;
// 427: checkcast java/lang/CharSequence
// 42a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 42d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 430: lload 24
// 432: dup2_x1
// 433: pop2
// 434: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 437: fstore 39
// 439: fload 39
// 43b: ldc 7.0
// 43d: fadd
// 43e: lload 1
// 43f: lconst_0
// 440: lcmp
// 441: ifle 473
// 444: fload 36
// 446: iload 32
// 448: ifeq 472
// 44b: fcmpl
// 44c: iload 32
// 44e: ifeq 491
// 451: goto 45e
// 454: ldc2_w -5998132523813566779
// 457: lload 1
// 458: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45d: athrow
// 45e: ifle 407
// 461: goto 46e
// 464: ldc2_w -5998132523813566779
// 467: lload 1
// 468: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46d: athrow
// 46e: fload 39
// 470: ldc 7.0
// 472: fadd
// 473: fstore 36
// 475: iload 32
// 477: ifne 407
// 47a: getstatic su/catlean/pg.m Ljava/util/List;
// 47d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 482: lload 1
// 483: lconst_0
// 484: lcmp
// 485: iflt 418
// 488: astore 37
// 48a: aload 37
// 48c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 491: ifeq 5df
// 494: aload 37
// 496: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 49b: checkcast su/catlean/pz
// 49e: astore 38
// 4a0: lload 26
// 4a2: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 4a5: aload 38
// 4a7: invokevirtual su/catlean/pz.A ()Ljava/lang/String;
// 4aa: checkcast java/lang/CharSequence
// 4ad: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 4b0: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 4b3: lload 24
// 4b5: dup2_x1
// 4b6: pop2
// 4b7: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 4ba: fstore 39
// 4bc: iload 32
// 4be: lload 1
// 4bf: lconst_0
// 4c0: lcmp
// 4c1: iflt 4c9
// 4c4: ifeq 5f0
// 4c7: iload 34
// 4c9: ifeq 50f
// 4cc: goto 4d9
// 4cf: ldc2_w -5998132523813566779
// 4d2: lload 1
// 4d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d8: athrow
// 4d9: aload 0
// 4da: lload 28
// 4dc: invokevirtual su/catlean/pg.p (J)F
// 4df: fconst_1
// 4e0: aload 38
// 4e2: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 4e5: invokevirtual su/catlean/fd.a ()F
// 4e8: fsub
// 4e9: sipush 20240
// 4ec: ldc2_w 7117221194434091062
// 4ef: lload 1
// 4f0: lxor
// 4f1: invokedynamic p (IJ)I bsm=su/catlean/pg.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f6: i2f
// 4f7: fmul
// 4f8: fsub
// 4f9: fload 39
// 4fb: ldc 8.0
// 4fd: fadd
// 4fe: fload 36
// 500: fsub
// 501: fsub
// 502: goto 52f
// 505: ldc2_w -5998132523813566779
// 508: lload 1
// 509: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50e: athrow
// 50f: aload 0
// 510: lload 28
// 512: invokevirtual su/catlean/pg.p (J)F
// 515: fconst_1
// 516: aload 38
// 518: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 51b: invokevirtual su/catlean/fd.a ()F
// 51e: fsub
// 51f: sipush 5520
// 522: ldc2_w 2863059662322385588
// 525: lload 1
// 526: lxor
// 527: invokedynamic p (IJ)I bsm=su/catlean/pg.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52c: i2f
// 52d: fmul
// 52e: fsub
// 52f: fstore 40
// 531: aload 0
// 532: checkcast su/catlean/gf
// 535: aload 3
// 536: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 539: dup
// 53a: sipush 13334
// 53d: ldc2_w 8710082574346483107
// 540: lload 1
// 541: lxor
// 542: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/pg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 547: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 54a: fload 40
// 54c: aload 0
// 54d: lload 8
// 54f: invokevirtual su/catlean/pg.V (J)F
// 552: fload 35
// 554: fadd
// 555: iload 19
// 557: i2s
// 558: swap
// 559: iload 20
// 55b: swap
// 55c: fload 39
// 55e: ldc 7.0
// 560: fadd
// 561: ldc 13.0
// 563: aload 38
// 565: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 568: invokevirtual su/catlean/fd.a ()F
// 56b: iload 21
// 56d: i2s
// 56e: swap
// 56f: bipush 0
// 570: sipush 5155
// 573: ldc2_w 5290969811349488390
// 576: lload 1
// 577: lxor
// 578: invokedynamic p (IJ)I bsm=su/catlean/pg.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57d: aconst_null
// 57e: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 581: fload 35
// 583: fstore 41
// 585: aload 0
// 586: aload 3
// 587: aload 38
// 589: invokevirtual su/catlean/pz.A ()Ljava/lang/String;
// 58c: checkcast java/lang/CharSequence
// 58f: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 592: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 595: fload 40
// 597: ldc 3.0
// 599: fadd
// 59a: aload 0
// 59b: lload 8
// 59d: invokevirtual su/catlean/pg.V (J)F
// 5a0: fload 41
// 5a2: fadd
// 5a3: fconst_1
// 5a4: fadd
// 5a5: lload 22
// 5a7: dup2_x1
// 5a8: pop2
// 5a9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5ac: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 5af: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 5b2: aload 38
// 5b4: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 5b7: invokevirtual su/catlean/fd.a ()F
// 5ba: iload 12
// 5bc: i2c
// 5bd: swap
// 5be: iload 13
// 5c0: swap
// 5c1: iload 14
// 5c3: i2s
// 5c4: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 5c7: invokevirtual su/catlean/pg.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 5ca: fload 35
// 5cc: ldc 14.0
// 5ce: aload 38
// 5d0: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 5d3: invokevirtual su/catlean/fd.a ()F
// 5d6: fmul
// 5d7: fadd
// 5d8: fstore 35
// 5da: iload 32
// 5dc: ifne 48a
// 5df: aload 0
// 5e0: fload 36
// 5e2: ldc 13.0
// 5e4: fload 35
// 5e6: fadd
// 5e7: invokevirtual su/catlean/pg.X (FF)V
// 5ea: lload 1
// 5eb: lconst_0
// 5ec: lcmp
// 5ed: ifle 5f0
// 5f0: return
}

private static final boolean F(pz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pg.a J
// 03: ldc2_w 47206350358165
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 97437145860656
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w 1852017277746582208
// 13: lload 1
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 19155
// 1d: ldc2_w 4903459450363100682
// 20: lload 1
// 21: lxor
// 22: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/pg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: istore 5
// 2c: aload 0
// 2d: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 30: aload 0
// 31: invokevirtual su/catlean/pz.T ()Z
// 34: ifeq 45
// 37: fconst_0
// 38: goto 46
// 3b: ldc2_w 1850214819681121194
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: lload 3
// 47: dup2_x1
// 48: pop2
// 49: invokevirtual su/catlean/fd.B (JF)V
// 4c: aload 0
// 4d: invokevirtual su/catlean/pz.T ()Z
// 50: iload 5
// 52: ifeq 7b
// 55: ifeq 94
// 58: goto 65
// 5b: ldc2_w 1850214819681121194
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: aload 0
// 66: invokevirtual su/catlean/pz.Y ()Lsu/catlean/fd;
// 69: invokevirtual su/catlean/fd.a ()F
// 6c: fconst_0
// 6d: fcmpg
// 6e: goto 7b
// 71: ldc2_w 1850214819681121194
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: iload 5
// 7d: ifeq 91
// 80: ifgt 94
// 83: goto 90
// 86: ldc2_w 1850214819681121194
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 1
// 91: goto 95
// 94: bipush 0
// 95: ireturn
}

private static final boolean n(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var27 = a ^ 84531735683691L;
long var10001 = var27 ^ 93536360476728L;
int var29 = (int)((var27 ^ 93536360476728L) >>> 32);
int var30 = (int)((var27 ^ 93536360476728L) << 32 >>> 40);
int var31 = (int)(var10001 << 56 >>> 56);
long var32 = var27 ^ 88729940778814L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[5];
int var23 = 0;
String var22 = "0\u008fH ¹L\u009a\u0012©\u0007(:×û÷\u009c\u0018\u0001C«ÀeçÌ\u0091=§Àö\u009d\u0010þì\u0089\u0002#¦ï¤(\u001e\u0010$z\u00adÀÜ\u00069TZh\u0082-ð^Þ\u009d";
int var24 = "0\u008fH ¹L\u009a\u0012©\u0007(:×û÷\u009c\u0018\u0001C«ÀeçÌ\u0091=§Àö\u009d\u0010þì\u0089\u0002#¦ï¤(\u001e\u0010$z\u00adÀÜ\u00069TZh\u0082-ð^Þ\u009d"
.length();
char var21 = 16;
int var36 = -1;

label64:
while (true) {
String var37 = var22.substring(++var36, var36 + var21);
byte var42 = -1;

while (true) {
byte[] var26 = var18.doFinal(var37.getBytes("ISO-8859-1"));
String var51 = b(var26).intern();
switch (var42) {
case 0:
var25[var23++] = var51;
if ((var36 += var21) >= var24) {
b = var25;
c = new String[5];
i = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[4];
int var10 = 0;
String var11 = "íæì´Ý=\u0018õö5\\^\\ÝÖ\u0094";
int var12 = "íæì´Ý=\u0018õö5\\^\\ÝÖ\u0094".length();
byte var9 = 0;

label46:
while (true) {
byte var46 = var9;
var9 += 8;
byte[] var14 = var11.substring(var46, var9).getBytes("ISO-8859-1");
long[] var40 = var13;
int var47 = var10++;
long var55 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var60 = -1;

while (true) {
long var15 = var55;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var63 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var60) {
case 0:
var40[var47] = var63;
if (var9 >= var12) {
g = var13;
h = new Integer[4];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -5754534477218968107L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var58 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var49 = -1;
long var0 = var58;
k = new pg(var29, var30, (byte)var31);
m = new ArrayList();
z = new fd(_s.OUT_BACK, var0, var32);
return;
}
break;
default:
var40[var47] = var63;
if (var9 < var12) {
continue label46;
}

var11 = "\u0088¸IÁÍ\u009e>ª\u0013\u0090oE2\nZ÷";
var12 = "\u0088¸IÁÍ\u009e>ª\u0013\u0090oE2\nZ÷".length();
var9 = 0;
}

byte var48 = var9;
var9 += 8;
var14 = var11.substring(var48, var9).getBytes("ISO-8859-1");
var40 = var13;
var47 = var10++;
var55 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var60 = 0;
}
}
}

var21 = var22.charAt(var36);
break;
default:
var25[var23++] = var51;
if ((var36 += var21) < var24) {
var21 = var22.charAt(var36);
continue label64;
}

var22 = "·í4A\u0002\u0091è*]\u0081z\u0097ðÑ+p k\u0017O¡\u001e\u001aYâ\u001d¿¢ô\u001añ\u0091\u0082wëÁ î ¾\u0081\u0090\u00ad\u008cDÌ¿\f\n";
var24 = "·í4A\u0002\u0091è*]\u0081z\u0097ðÑ+p k\u0017O¡\u001e\u001aYâ\u001d¿¢ô\u001añ\u0091\u0082wëÁ î ¾\u0081\u0090\u00ad\u008cDÌ¿\f\n".length();
var21 = 16;
var36 = -1;
}

var37 = var22.substring(++var36, var36 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27871;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pg", var10);
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
throw new RuntimeException("su/catlean/pg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31310;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/pg", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/pg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
