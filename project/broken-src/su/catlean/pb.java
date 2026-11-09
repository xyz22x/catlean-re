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

public final class pb extends gf {
@NotNull
public static final pb o;
@NotNull
private static final List S;
@NotNull
private static final fd p;
private static final long a = yz.a(2408774187869706312L, -180406917401825280L, MethodHandles.lookup().lookupClass()).a(84371270245176L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private pb(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
long var10001 = var4 ^ 27534833708589L;
int var6 = (int)((var4 ^ 27534833708589L) >>> 48);
int var7 = (int)((var4 ^ 27534833708589L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"q">(7849, 5923189307424147581L ^ var4), (char)var8);
}

@NotNull
public final List j() {
return S;
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
// 009: ldc2_w 50910300018319
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 81581919584095
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 20795373550736
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 22879798888836
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 107471649456291
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 99541060701969
// 02f: lxor
// 030: dup2
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 16
// 037: dup2
// 038: bipush 16
// 03a: lshl
// 03b: bipush 32
// 03d: lushr
// 03e: l2i
// 03f: istore 17
// 041: dup2
// 042: bipush 48
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 18
// 04b: pop2
// 04c: dup2
// 04d: ldc2_w 100479272291701
// 050: lxor
// 051: lstore 19
// 053: dup2
// 054: ldc2_w 130512158954640
// 057: lxor
// 058: lstore 21
// 05a: dup2
// 05b: ldc2_w 104104530525409
// 05e: lxor
// 05f: dup2
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 23
// 066: dup2
// 067: bipush 16
// 069: lshl
// 06a: bipush 32
// 06c: lushr
// 06d: l2i
// 06e: istore 24
// 070: dup2
// 071: bipush 48
// 073: lshl
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 25
// 07a: pop2
// 07b: dup2
// 07c: ldc2_w 128377113661390
// 07f: lxor
// 080: lstore 26
// 082: dup2
// 083: ldc2_w 20173347401993
// 086: lxor
// 087: lstore 28
// 089: dup2
// 08a: ldc2_w 99949442920536
// 08d: lxor
// 08e: lstore 30
// 090: dup2
// 091: ldc2_w 30591967126976
// 094: lxor
// 095: lstore 32
// 097: pop2
// 098: aload 3
// 099: sipush 18548
// 09c: ldc2_w 3646317136272021347
// 09f: lload 1
// 0a0: lxor
// 0a1: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a9: lload 14
// 0ab: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ae: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 0b1: dup
// 0b2: sipush 30139
// 0b5: ldc2_w 8840599174291974825
// 0b8: lload 1
// 0b9: lxor
// 0ba: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c2: checkcast java/lang/Iterable
// 0c5: astore 36
// 0c7: ldc2_w -5990947769900206742
// 0ca: lload 1
// 0cb: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: bipush 0
// 0d1: istore 37
// 0d3: aload 36
// 0d5: astore 38
// 0d7: new java/util/ArrayList
// 0da: dup
// 0db: invokespecial java/util/ArrayList.<init> ()V
// 0de: checkcast java/util/Collection
// 0e1: astore 39
// 0e3: bipush 0
// 0e4: istore 40
// 0e6: aload 38
// 0e8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ed: astore 41
// 0ef: istore 34
// 0f1: aload 41
// 0f3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f8: ifeq 152
// 0fb: aload 41
// 0fd: lload 1
// 0fe: lconst_0
// 0ff: lcmp
// 100: ifle 10d
// 103: iload 34
// 105: ifne 163
// 108: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10d: astore 42
// 10f: aload 42
// 111: checkcast net/minecraft/class_742
// 114: astore 43
// 116: bipush 0
// 117: istore 44
// 119: aload 43
// 11b: lload 4
// 11d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 120: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 123: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 126: iload 34
// 128: ifne 13c
// 12b: ifne 13f
// 12e: goto 13b
// 131: ldc2_w -5992828224962208862
// 134: lload 1
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: bipush 1
// 13c: goto 140
// 13f: bipush 0
// 140: ifeq 0f1
// 143: aload 39
// 145: aload 42
// 147: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 14c: pop
// 14d: iload 34
// 14f: ifeq 0f1
// 152: aload 39
// 154: checkcast java/util/List
// 157: nop
// 158: lload 1
// 159: lconst_0
// 15a: lcmp
// 15b: ifle 10d
// 15e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 163: astore 35
// 165: aload 35
// 167: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16c: ifeq 285
// 16f: aload 35
// 171: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 176: checkcast net/minecraft/class_742
// 179: astore 36
// 17b: getstatic su/catlean/pb.S Ljava/util/List;
// 17e: checkcast java/lang/Iterable
// 181: astore 38
// 183: bipush 0
// 184: istore 39
// 186: aload 38
// 188: iload 34
// 18a: lload 1
// 18b: lconst_0
// 18c: lcmp
// 18d: iflt 195
// 190: ifne 291
// 193: iload 34
// 195: ifne 1f4
// 198: goto 1a5
// 19b: ldc2_w -5992828224962208862
// 19e: lload 1
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: instanceof java/util/Collection
// 1a8: ifeq 1f2
// 1ab: goto 1b8
// 1ae: ldc2_w -5992828224962208862
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: aload 38
// 1ba: checkcast java/util/Collection
// 1bd: iload 34
// 1bf: ifne 1f4
// 1c2: goto 1cf
// 1c5: ldc2_w -5992828224962208862
// 1c8: lload 1
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1d4: ifeq 1f2
// 1d7: goto 1e4
// 1da: ldc2_w -5992828224962208862
// 1dd: lload 1
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: bipush 1
// 1e5: goto 235
// 1e8: ldc2_w -5992828224962208862
// 1eb: lload 1
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: aload 38
// 1f4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1f9: astore 40
// 1fb: aload 40
// 1fd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 202: ifeq 234
// 205: aload 40
// 207: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 20c: astore 41
// 20e: aload 41
// 210: checkcast su/catlean/jv
// 213: astore 42
// 215: bipush 0
// 216: istore 43
// 218: aload 42
// 21a: invokevirtual su/catlean/jv.X ()Lnet/minecraft/class_1657;
// 21d: aload 36
// 21f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 222: ifeq 1fb
// 225: bipush 0
// 226: lload 1
// 227: lconst_0
// 228: lcmp
// 229: iflt 222
// 22c: iload 34
// 22e: ifne 222
// 231: goto 235
// 234: bipush 1
// 235: istore 37
// 237: iload 37
// 239: lload 1
// 23a: lconst_0
// 23b: lcmp
// 23c: iflt 282
// 23f: iload 34
// 241: ifne 27f
// 244: ifeq 165
// 247: goto 254
// 24a: ldc2_w -5992828224962208862
// 24d: lload 1
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: getstatic su/catlean/pb.S Ljava/util/List;
// 257: new su/catlean/jv
// 25a: dup
// 25b: aload 36
// 25d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 260: aload 36
// 262: checkcast net/minecraft/class_1657
// 265: aconst_null
// 266: lload 10
// 268: bipush 0
// 269: sipush 2221
// 26c: ldc2_w 6379581159902490915
// 26f: lload 1
// 270: lxor
// 271: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: aconst_null
// 277: invokespecial su/catlean/jv.<init> (Lnet/minecraft/class_1657;Lsu/catlean/fd;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 27a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 27f: pop
// 280: iload 34
// 282: ifeq 165
// 285: getstatic su/catlean/pb.S Ljava/util/List;
// 288: lload 1
// 289: lconst_0
// 28a: lcmp
// 28b: iflt 176
// 28e: checkcast java/lang/Iterable
// 291: astore 35
// 293: bipush 0
// 294: istore 36
// 296: aload 35
// 298: astore 37
// 29a: new java/util/ArrayList
// 29d: dup
// 29e: invokespecial java/util/ArrayList.<init> ()V
// 2a1: checkcast java/util/Collection
// 2a4: astore 38
// 2a6: bipush 0
// 2a7: istore 39
// 2a9: aload 37
// 2ab: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2b0: astore 40
// 2b2: aload 40
// 2b4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2b9: ifeq 337
// 2bc: aload 40
// 2be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2c3: astore 41
// 2c5: aload 41
// 2c7: checkcast su/catlean/jv
// 2ca: astore 42
// 2cc: bipush 0
// 2cd: istore 43
// 2cf: lload 14
// 2d1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2d4: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 2d7: dup
// 2d8: sipush 7609
// 2db: ldc2_w 7615093398827041446
// 2de: lload 1
// 2df: lxor
// 2e0: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e8: checkcast java/lang/Iterable
// 2eb: lload 1
// 2ec: lconst_0
// 2ed: lcmp
// 2ee: ifle 34e
// 2f1: aload 42
// 2f3: invokevirtual su/catlean/jv.X ()Lnet/minecraft/class_1657;
// 2f6: invokestatic kotlin/collections/CollectionsKt.contains (Ljava/lang/Iterable;Ljava/lang/Object;)Z
// 2f9: iload 34
// 2fb: ifne 34a
// 2fe: iload 34
// 300: ifne 321
// 303: goto 310
// 306: ldc2_w -5992828224962208862
// 309: lload 1
// 30a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: athrow
// 310: ifne 324
// 313: goto 320
// 316: ldc2_w -5992828224962208862
// 319: lload 1
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: bipush 1
// 321: goto 325
// 324: bipush 0
// 325: ifeq 2b2
// 328: aload 38
// 32a: aload 41
// 32c: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 331: pop
// 332: iload 34
// 334: ifeq 2b2
// 337: aload 38
// 339: checkcast java/util/List
// 33c: nop
// 33d: checkcast java/lang/Iterable
// 340: astore 35
// 342: nop
// 343: lload 1
// 344: lconst_0
// 345: lcmp
// 346: iflt 2c5
// 349: bipush 0
// 34a: istore 36
// 34c: aload 35
// 34e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 353: astore 37
// 355: aload 37
// 357: invokeinterface java/util/Iterator.hasNext ()Z 1
// 35c: ifeq 39c
// 35f: aload 37
// 361: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 366: astore 38
// 368: aload 38
// 36a: checkcast su/catlean/jv
// 36d: astore 39
// 36f: bipush 0
// 370: istore 40
// 372: aload 39
// 374: bipush 1
// 375: invokevirtual su/catlean/jv.h (Z)V
// 378: nop
// 379: iload 34
// 37b: lload 1
// 37c: lconst_0
// 37d: lcmp
// 37e: ifle 3b3
// 381: ifne 3b0
// 384: iload 34
// 386: ifeq 355
// 389: lload 1
// 38a: lconst_0
// 38b: lcmp
// 38c: iflt 379
// 38f: goto 39c
// 392: ldc2_w -5992828224962208862
// 395: lload 1
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: nop
// 39d: getstatic su/catlean/pb.S Ljava/util/List;
// 3a0: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/pb.W (Lsu/catlean/jv;)Z, (Lsu/catlean/jv;)Ljava/lang/Boolean; ]
// 3a5: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/pb.F (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 3aa: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 3af: pop
// 3b0: sipush 21013
// 3b3: ldc2_w 517140857243356424
// 3b6: lload 1
// 3b7: lxor
// 3b8: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: astore 35
// 3bf: aload 0
// 3c0: lload 32
// 3c2: invokevirtual su/catlean/pb.p (J)F
// 3c5: aload 0
// 3c6: lload 19
// 3c8: invokevirtual su/catlean/pb.r (J)I
// 3cb: i2f
// 3cc: fconst_2
// 3cd: fdiv
// 3ce: fcmpl
// 3cf: iload 34
// 3d1: ifne 3e5
// 3d4: ifle 3e8
// 3d7: goto 3e4
// 3da: ldc2_w -5992828224962208862
// 3dd: lload 1
// 3de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e3: athrow
// 3e4: bipush 1
// 3e5: goto 3e9
// 3e8: bipush 0
// 3e9: istore 36
// 3eb: getstatic su/catlean/pb.p Lsu/catlean/fd;
// 3ee: getstatic su/catlean/pb.S Ljava/util/List;
// 3f1: invokeinterface java/util/List.isEmpty ()Z 1
// 3f6: iload 34
// 3f8: lload 1
// 3f9: lconst_0
// 3fa: lcmp
// 3fb: iflt 431
// 3fe: ifne 429
// 401: ifeq 46d
// 404: goto 411
// 407: ldc2_w -5992828224962208862
// 40a: lload 1
// 40b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 410: athrow
// 411: lload 4
// 413: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 416: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 419: instanceof net/minecraft/class_408
// 41c: goto 429
// 41f: ldc2_w -5992828224962208862
// 422: lload 1
// 423: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 428: athrow
// 429: lload 1
// 42a: lconst_0
// 42b: lcmp
// 42c: ifle 45c
// 42f: iload 34
// 431: ifne 45c
// 434: ifne 46d
// 437: goto 444
// 43a: ldc2_w -5992828224962208862
// 43d: lload 1
// 43e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 443: athrow
// 444: lload 4
// 446: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 449: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 44c: instanceof su/catlean/rl
// 44f: goto 45c
// 452: ldc2_w -5992828224962208862
// 455: lload 1
// 456: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45b: athrow
// 45c: ifne 46d
// 45f: fconst_0
// 460: goto 46e
// 463: ldc2_w -5992828224962208862
// 466: lload 1
// 467: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46c: athrow
// 46d: fconst_1
// 46e: lload 8
// 470: dup2_x1
// 471: pop2
// 472: invokevirtual su/catlean/fd.B (JF)V
// 475: aload 0
// 476: aload 3
// 477: aload 35
// 479: getstatic su/catlean/pb.p Lsu/catlean/fd;
// 47c: invokevirtual su/catlean/fd.a ()F
// 47f: iload 36
// 481: lload 21
// 483: invokevirtual su/catlean/pb.q (Lnet/minecraft/class_332;Ljava/lang/String;FZJ)V
// 486: ldc 17.0
// 488: fstore 37
// 48a: lload 30
// 48c: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 48f: lload 28
// 491: aload 35
// 493: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 496: ldc 24.0
// 498: fadd
// 499: fstore 38
// 49b: getstatic su/catlean/pb.S Ljava/util/List;
// 49e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 4a3: astore 39
// 4a5: aload 39
// 4a7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4ac: ifeq 511
// 4af: aload 39
// 4b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4b6: checkcast su/catlean/jv
// 4b9: astore 40
// 4bb: lload 30
// 4bd: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 4c0: aload 40
// 4c2: lload 12
// 4c4: invokevirtual su/catlean/jv.H (J)Ljava/lang/String;
// 4c7: lload 28
// 4c9: dup2_x1
// 4ca: pop2
// 4cb: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 4ce: fstore 41
// 4d0: fload 41
// 4d2: ldc 13.0
// 4d4: fadd
// 4d5: lload 1
// 4d6: lconst_0
// 4d7: lcmp
// 4d8: iflt 50a
// 4db: fload 38
// 4dd: iload 34
// 4df: ifne 509
// 4e2: fcmpl
// 4e3: iload 34
// 4e5: ifne 528
// 4e8: goto 4f5
// 4eb: ldc2_w -5992828224962208862
// 4ee: lload 1
// 4ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: athrow
// 4f5: ifle 4a5
// 4f8: goto 505
// 4fb: ldc2_w -5992828224962208862
// 4fe: lload 1
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: fload 41
// 507: ldc 13.0
// 509: fadd
// 50a: fstore 38
// 50c: iload 34
// 50e: ifeq 4a5
// 511: getstatic su/catlean/pb.S Ljava/util/List;
// 514: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 519: lload 1
// 51a: lconst_0
// 51b: lcmp
// 51c: ifle 4b6
// 51f: astore 39
// 521: aload 39
// 523: invokeinterface java/util/Iterator.hasNext ()Z 1
// 528: ifeq 6a2
// 52b: aload 39
// 52d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 532: checkcast su/catlean/jv
// 535: astore 40
// 537: lload 30
// 539: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 53c: aload 40
// 53e: lload 12
// 540: invokevirtual su/catlean/jv.H (J)Ljava/lang/String;
// 543: lload 28
// 545: dup2_x1
// 546: pop2
// 547: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 54a: fstore 41
// 54c: iload 34
// 54e: lload 1
// 54f: lconst_0
// 550: lcmp
// 551: ifle 559
// 554: ifne 6b2
// 557: iload 36
// 559: ifeq 5a2
// 55c: goto 569
// 55f: ldc2_w -5992828224962208862
// 562: lload 1
// 563: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 568: athrow
// 569: aload 0
// 56a: lload 32
// 56c: invokevirtual su/catlean/pb.p (J)F
// 56f: fconst_1
// 570: aload 40
// 572: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 575: invokevirtual su/catlean/fd.a ()F
// 578: fsub
// 579: sipush 17376
// 57c: ldc2_w 5873116195429317225
// 57f: lload 1
// 580: lxor
// 581: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 586: i2f
// 587: fmul
// 588: fsub
// 589: fload 41
// 58b: bipush 0
// 58c: i2f
// 58d: fadd
// 58e: ldc 13.0
// 590: fadd
// 591: fload 38
// 593: fsub
// 594: fsub
// 595: goto 5c2
// 598: ldc2_w -5992828224962208862
// 59b: lload 1
// 59c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a1: athrow
// 5a2: aload 0
// 5a3: lload 32
// 5a5: invokevirtual su/catlean/pb.p (J)F
// 5a8: fconst_1
// 5a9: aload 40
// 5ab: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 5ae: invokevirtual su/catlean/fd.a ()F
// 5b1: fsub
// 5b2: sipush 9818
// 5b5: ldc2_w 7611293524685004758
// 5b8: lload 1
// 5b9: lxor
// 5ba: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bf: i2f
// 5c0: fmul
// 5c1: fsub
// 5c2: fstore 42
// 5c4: aload 0
// 5c5: checkcast su/catlean/gf
// 5c8: aload 3
// 5c9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5cc: dup
// 5cd: sipush 24929
// 5d0: ldc2_w 7358191842287025789
// 5d3: lload 1
// 5d4: lxor
// 5d5: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5dd: fload 42
// 5df: aload 0
// 5e0: lload 6
// 5e2: invokevirtual su/catlean/pb.V (J)F
// 5e5: fload 37
// 5e7: fadd
// 5e8: iload 23
// 5ea: i2s
// 5eb: swap
// 5ec: iload 24
// 5ee: swap
// 5ef: fload 41
// 5f1: ldc 21.0
// 5f3: fadd
// 5f4: ldc 13.0
// 5f6: aload 40
// 5f8: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 5fb: invokevirtual su/catlean/fd.a ()F
// 5fe: iload 25
// 600: i2s
// 601: swap
// 602: bipush 0
// 603: sipush 2813
// 606: ldc2_w 1189795448407044981
// 609: lload 1
// 60a: lxor
// 60b: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 610: aconst_null
// 611: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 614: fload 37
// 616: fstore 43
// 618: aload 0
// 619: aload 3
// 61a: aload 40
// 61c: lload 12
// 61e: invokevirtual su/catlean/jv.H (J)Ljava/lang/String;
// 621: fload 42
// 623: ldc 3.0
// 625: fadd
// 626: aload 0
// 627: lload 6
// 629: invokevirtual su/catlean/pb.V (J)F
// 62c: fload 43
// 62e: fadd
// 62f: fconst_1
// 630: fadd
// 631: lload 26
// 633: dup2_x1
// 634: pop2
// 635: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 638: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 63b: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 63e: aload 40
// 640: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 643: invokevirtual su/catlean/fd.a ()F
// 646: iload 16
// 648: i2c
// 649: swap
// 64a: iload 17
// 64c: swap
// 64d: iload 18
// 64f: i2s
// 650: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 653: invokevirtual su/catlean/pb.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 656: aload 0
// 657: aload 3
// 658: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 65b: dup
// 65c: sipush 4212
// 65f: ldc2_w 1260170234027249519
// 662: lload 1
// 663: lxor
// 664: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 669: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 66c: fload 42
// 66e: fload 41
// 670: fadd
// 671: ldc 6.0
// 673: fadd
// 674: aload 0
// 675: lload 6
// 677: invokevirtual su/catlean/pb.V (J)F
// 67a: fconst_2
// 67b: fadd
// 67c: fload 43
// 67e: fadd
// 67f: aload 40
// 681: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 684: invokevirtual su/catlean/fd.a ()F
// 687: ldc 0.27
// 689: fmul
// 68a: invokevirtual su/catlean/pb.w (Lorg/joml/Matrix3x2fStack;FFF)V
// 68d: fload 37
// 68f: ldc 14.0
// 691: aload 40
// 693: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 696: invokevirtual su/catlean/fd.a ()F
// 699: fmul
// 69a: fadd
// 69b: fstore 37
// 69d: iload 34
// 69f: ifeq 521
// 6a2: aload 0
// 6a3: fload 38
// 6a5: fload 37
// 6a7: fconst_2
// 6a8: fsub
// 6a9: invokevirtual su/catlean/pb.X (FF)V
// 6ac: lload 1
// 6ad: lconst_0
// 6ae: lcmp
// 6af: ifle 6b2
// 6b2: return
}

@Override
public void H(@NotNull class_332 context, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 118901760466898
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 116421505234798
// 00c: lxor
// 00d: dup2
// 00e: bipush 32
// 010: lushr
// 011: l2i
// 012: istore 6
// 014: dup2
// 015: bipush 32
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 7
// 01e: dup2
// 01f: bipush 48
// 021: lshl
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 8
// 028: pop2
// 029: dup2
// 02a: ldc2_w 95252125974745
// 02d: lxor
// 02e: lstore 9
// 030: dup2
// 031: ldc2_w 88194911549524
// 034: lxor
// 035: lstore 11
// 037: dup2
// 038: ldc2_w 26980051417349
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 27379191465548
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 15
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 16
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 17
// 05e: pop2
// 05f: dup2
// 060: ldc2_w 98664999447709
// 063: lxor
// 064: lstore 18
// 066: dup2
// 067: ldc2_w 27539938346024
// 06a: lxor
// 06b: lstore 20
// 06d: pop2
// 06e: aload 1
// 06f: sipush 15689
// 072: ldc2_w 5078238865331202816
// 075: lload 2
// 076: lxor
// 077: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07f: ldc2_w -6520650251987964174
// 082: lload 2
// 083: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: sipush 555
// 08b: ldc2_w 2876978234915820646
// 08e: lload 2
// 08f: lxor
// 090: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: astore 23
// 097: istore 22
// 099: aload 0
// 09a: lload 18
// 09c: invokevirtual su/catlean/pb.p (J)F
// 09f: aload 0
// 0a0: lload 20
// 0a2: invokevirtual su/catlean/pb.r (J)I
// 0a5: i2f
// 0a6: fconst_2
// 0a7: fdiv
// 0a8: fcmpl
// 0a9: iload 22
// 0ab: ifeq 0bf
// 0ae: ifle 0c2
// 0b1: goto 0be
// 0b4: ldc2_w -6518837222700330241
// 0b7: lload 2
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: bipush 1
// 0bf: goto 0c3
// 0c2: bipush 0
// 0c3: istore 24
// 0c5: ldc 17.0
// 0c7: fstore 25
// 0c9: lload 13
// 0cb: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 0ce: lload 11
// 0d0: aload 23
// 0d2: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 0d5: ldc 24.0
// 0d7: fadd
// 0d8: fstore 26
// 0da: getstatic su/catlean/pb.S Ljava/util/List;
// 0dd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0e2: astore 27
// 0e4: aload 27
// 0e6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0eb: ifeq 150
// 0ee: aload 27
// 0f0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f5: checkcast su/catlean/jv
// 0f8: astore 28
// 0fa: lload 13
// 0fc: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 0ff: aload 28
// 101: lload 9
// 103: invokevirtual su/catlean/jv.H (J)Ljava/lang/String;
// 106: lload 11
// 108: dup2_x1
// 109: pop2
// 10a: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 10d: fstore 29
// 10f: fload 29
// 111: ldc 13.0
// 113: fadd
// 114: lload 2
// 115: lconst_0
// 116: lcmp
// 117: iflt 149
// 11a: fload 26
// 11c: iload 22
// 11e: ifeq 148
// 121: fcmpl
// 122: iload 22
// 124: ifeq 167
// 127: goto 134
// 12a: ldc2_w -6518837222700330241
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: ifle 0e4
// 137: goto 144
// 13a: ldc2_w -6518837222700330241
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: fload 29
// 146: ldc 13.0
// 148: fadd
// 149: fstore 26
// 14b: iload 22
// 14d: ifne 0e4
// 150: getstatic su/catlean/pb.S Ljava/util/List;
// 153: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 158: lload 2
// 159: lconst_0
// 15a: lcmp
// 15b: ifle 0f5
// 15e: astore 27
// 160: aload 27
// 162: invokeinterface java/util/Iterator.hasNext ()Z 1
// 167: ifeq 365
// 16a: aload 27
// 16c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 171: checkcast su/catlean/jv
// 174: astore 28
// 176: lload 13
// 178: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 17b: aload 28
// 17d: lload 9
// 17f: invokevirtual su/catlean/jv.H (J)Ljava/lang/String;
// 182: lload 11
// 184: dup2_x1
// 185: pop2
// 186: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 189: fstore 29
// 18b: iload 24
// 18d: ifeq 1c9
// 190: aload 0
// 191: lload 18
// 193: invokevirtual su/catlean/pb.p (J)F
// 196: fconst_1
// 197: aload 28
// 199: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 19c: invokevirtual su/catlean/fd.a ()F
// 19f: fsub
// 1a0: sipush 2758
// 1a3: ldc2_w 2681723516873947665
// 1a6: lload 2
// 1a7: lxor
// 1a8: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: i2f
// 1ae: fmul
// 1af: fsub
// 1b0: fload 29
// 1b2: bipush 0
// 1b3: i2f
// 1b4: fadd
// 1b5: ldc 13.0
// 1b7: fadd
// 1b8: fload 26
// 1ba: fsub
// 1bb: fsub
// 1bc: goto 1e9
// 1bf: ldc2_w -6518837222700330241
// 1c2: lload 2
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: aload 0
// 1ca: lload 18
// 1cc: invokevirtual su/catlean/pb.p (J)F
// 1cf: fconst_1
// 1d0: aload 28
// 1d2: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 1d5: invokevirtual su/catlean/fd.a ()F
// 1d8: fsub
// 1d9: sipush 23348
// 1dc: ldc2_w 6040954273406381028
// 1df: lload 2
// 1e0: lxor
// 1e1: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: i2f
// 1e7: fmul
// 1e8: fsub
// 1e9: fstore 30
// 1eb: fload 25
// 1ed: fstore 31
// 1ef: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f2: aload 1
// 1f3: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1f6: dup
// 1f7: sipush 4212
// 1fa: ldc2_w 1260238547581666866
// 1fd: lload 2
// 1fe: lxor
// 1ff: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 207: checkcast org/joml/Matrix3x2f
// 20a: aload 28
// 20c: invokevirtual su/catlean/jv.X ()Lnet/minecraft/class_1657;
// 20f: dup
// 210: sipush 15746
// 213: ldc2_w 5605152818647641031
// 216: lload 2
// 217: lxor
// 218: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 220: checkcast net/minecraft/class_742
// 223: invokevirtual net/minecraft/class_742.method_52814 ()Lnet/minecraft/class_8685;
// 226: invokevirtual net/minecraft/class_8685.comp_1626 ()Lnet/minecraft/class_12079$class_12081;
// 229: invokeinterface net/minecraft/class_12079$class_12081.comp_3627 ()Lnet/minecraft/class_2960; 1
// 22e: dup
// 22f: sipush 6550
// 232: ldc2_w 504278927709409237
// 235: lload 2
// 236: lxor
// 237: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 23f: fload 30
// 241: fload 29
// 243: fadd
// 244: ldc 10.0
// 246: fadd
// 247: aload 0
// 248: lload 4
// 24a: invokevirtual su/catlean/pb.V (J)F
// 24d: ldc 2.5
// 24f: fadd
// 250: fload 31
// 252: fadd
// 253: ldc 8.0
// 255: ldc 8.0
// 257: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 25a: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 25d: dup
// 25e: sipush 21137
// 261: ldc2_w 1131437363519112415
// 264: lload 2
// 265: lxor
// 266: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26e: aload 28
// 270: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 273: invokevirtual su/catlean/fd.a ()F
// 276: iload 15
// 278: i2c
// 279: swap
// 27a: iload 16
// 27c: swap
// 27d: iload 17
// 27f: i2s
// 280: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 283: aconst_null
// 284: iload 6
// 286: aconst_null
// 287: aconst_null
// 288: ldc 0.125
// 28a: iload 7
// 28c: i2c
// 28d: ldc 0.125
// 28f: ldc 0.25
// 291: iload 8
// 293: i2s
// 294: ldc 0.25
// 296: bipush 0
// 297: sipush 16567
// 29a: ldc2_w 538441327934074981
// 29d: lload 2
// 29e: lxor
// 29f: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: aconst_null
// 2a5: invokestatic su/catlean/jl.W (Lsu/catlean/jl;Lorg/joml/Matrix3x2f;Lnet/minecraft/class_2960;FFFFLjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;FCFFSFZILjava/lang/Object;)V
// 2a8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2ab: aload 1
// 2ac: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2af: dup
// 2b0: sipush 4212
// 2b3: ldc2_w 1260238547581666866
// 2b6: lload 2
// 2b7: lxor
// 2b8: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c0: checkcast org/joml/Matrix3x2f
// 2c3: aload 28
// 2c5: invokevirtual su/catlean/jv.X ()Lnet/minecraft/class_1657;
// 2c8: checkcast net/minecraft/class_742
// 2cb: invokevirtual net/minecraft/class_742.method_52814 ()Lnet/minecraft/class_8685;
// 2ce: invokevirtual net/minecraft/class_8685.comp_1626 ()Lnet/minecraft/class_12079$class_12081;
// 2d1: invokeinterface net/minecraft/class_12079$class_12081.comp_3627 ()Lnet/minecraft/class_2960; 1
// 2d6: dup
// 2d7: sipush 3535
// 2da: ldc2_w 8653329086960376708
// 2dd: lload 2
// 2de: lxor
// 2df: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e7: fload 30
// 2e9: fload 29
// 2eb: fadd
// 2ec: ldc 9.0
// 2ee: fadd
// 2ef: aload 0
// 2f0: lload 4
// 2f2: invokevirtual su/catlean/pb.V (J)F
// 2f5: ldc 1.5
// 2f7: fadd
// 2f8: fload 31
// 2fa: fadd
// 2fb: ldc 10.0
// 2fd: ldc 10.0
// 2ff: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 302: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 305: dup
// 306: sipush 18910
// 309: ldc2_w 9199602671137087378
// 30c: lload 2
// 30d: lxor
// 30e: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 316: aload 28
// 318: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 31b: invokevirtual su/catlean/fd.a ()F
// 31e: iload 15
// 320: i2c
// 321: swap
// 322: iload 16
// 324: swap
// 325: iload 17
// 327: i2s
// 328: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 32b: aconst_null
// 32c: iload 6
// 32e: aconst_null
// 32f: aconst_null
// 330: ldc 0.625
// 332: iload 7
// 334: i2c
// 335: ldc 0.125
// 337: ldc 0.75
// 339: iload 8
// 33b: i2s
// 33c: ldc 0.25
// 33e: bipush 0
// 33f: sipush 18298
// 342: ldc2_w 4921080867009427372
// 345: lload 2
// 346: lxor
// 347: invokedynamic y (IJ)I bsm=su/catlean/pb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: aconst_null
// 34d: invokestatic su/catlean/jl.W (Lsu/catlean/jl;Lorg/joml/Matrix3x2f;Lnet/minecraft/class_2960;FFFFLjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;FCFFSFZILjava/lang/Object;)V
// 350: fload 25
// 352: ldc 14.0
// 354: aload 28
// 356: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 359: invokevirtual su/catlean/fd.a ()F
// 35c: fmul
// 35d: fadd
// 35e: fstore 25
// 360: iload 22
// 362: ifne 160
// 365: return
}

private static final boolean W(jv param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pb.a J
// 03: ldc2_w 75537449928247
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 119908949756746
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w -7437243473904528454
// 13: lload 1
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 16306
// 1d: ldc2_w 7696367077430039730
// 20: lload 1
// 21: lxor
// 22: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/pb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: istore 5
// 2c: aload 0
// 2d: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 30: aload 0
// 31: invokevirtual su/catlean/jv.W ()Z
// 34: ifeq 45
// 37: fconst_0
// 38: goto 46
// 3b: ldc2_w -7439923186839556169
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: lload 3
// 47: dup2_x1
// 48: pop2
// 49: invokevirtual su/catlean/fd.B (JF)V
// 4c: aload 0
// 4d: invokevirtual su/catlean/jv.W ()Z
// 50: iload 5
// 52: ifeq 7b
// 55: ifeq 94
// 58: goto 65
// 5b: ldc2_w -7439923186839556169
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: aload 0
// 66: invokevirtual su/catlean/jv.i ()Lsu/catlean/fd;
// 69: invokevirtual su/catlean/fd.a ()F
// 6c: fconst_0
// 6d: fcmpg
// 6e: goto 7b
// 71: ldc2_w -7439923186839556169
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: iload 5
// 7d: ifeq 91
// 80: ifgt 94
// 83: goto 90
// 86: ldc2_w -7439923186839556169
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 1
// 91: goto 95
// 94: bipush 0
// 95: ireturn
}

private static final boolean F(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var27 = a ^ 116067560293487L;
long var29 = var27 ^ 50641262442722L;
long var10001 = var27 ^ 46409194250441L;
int var31 = (int)((var27 ^ 46409194250441L) >>> 56);
int var32 = (int)((var27 ^ 46409194250441L) << 8 >>> 32);
int var33 = (int)(var10001 << 40 >>> 40);
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[15];
int var23 = 0;
String var22 = "ÁÜFKJ¶4ðwÓ\u009f¦lå)\u0002\u0010ÿªÔ\u0001\u0092·\u0018m#¶Âk\u0015æ¿ò\u0010\u009dÿP²Ü$\u0083´ý¢JõòF°+(½%÷[§4Þf/n{´æ\tm²9pØ{(ïæîëÚ-éf¬Õ:\u0088@\u001d9\t§h;\u0010)\nõåÉY1\u0088§\u0086Tnù¸\u0017U\u0010áfÎ~ºf\u009b´\u0081TQCA\u00ad'ù\u00106\u0007wÛ\u0011\u0010°Ö|\u0014°Fs#áË\u0018\u0017iõª\u000bdÀ¼`]\u009b÷Uç¢\\\t\u0000±L,~\u000f|\u0010Dµ6¨\fFÏ\bÞ\u0090\u0081\u000eàN\u0091¢ \t<YÚÎS[qÀ¢åûhNyÄ\u007fýÀ\u0002\u008fáyÓÐÀö@~Ê 6 Æ;´BÊ\u0015@q©wøåÆ\f{\u0093Uò\u0081í\u0081-ÓæÍ\"\u0087<¤\u0017$É0ÂN\u0089üqç\u0096\u009eT\u0080W¸ÏÈÄ¦ùé9È\u000e¦\u0007¾\u0002 \u000e\u0085>\u0010§\u008dsí\\\u0080ß\u008f·ùÊC±«îP\u0092y(?\u0014Þ6#Ý¤~\u0003ð\r\u0002ú\u0089\u0005\u008bº\u0082À\u008d\u001aHöÒ©F\u0087\u000f·ñëO]\u0000Pn\u008f\u009d{N";
int var24 = "ÁÜFKJ¶4ðwÓ\u009f¦lå)\u0002\u0010ÿªÔ\u0001\u0092·\u0018m#¶Âk\u0015æ¿ò\u0010\u009dÿP²Ü$\u0083´ý¢JõòF°+(½%÷[§4Þf/n{´æ\tm²9pØ{(ïæîëÚ-éf¬Õ:\u0088@\u001d9\t§h;\u0010)\nõåÉY1\u0088§\u0086Tnù¸\u0017U\u0010áfÎ~ºf\u009b´\u0081TQCA\u00ad'ù\u00106\u0007wÛ\u0011\u0010°Ö|\u0014°Fs#áË\u0018\u0017iõª\u000bdÀ¼`]\u009b÷Uç¢\\\t\u0000±L,~\u000f|\u0010Dµ6¨\fFÏ\bÞ\u0090\u0081\u000eàN\u0091¢ \t<YÚÎS[qÀ¢åûhNyÄ\u007fýÀ\u0002\u008fáyÓÐÀö@~Ê 6 Æ;´BÊ\u0015@q©wøåÆ\f{\u0093Uò\u0081í\u0081-ÓæÍ\"\u0087<¤\u0017$É0ÂN\u0089üqç\u0096\u009eT\u0080W¸ÏÈÄ¦ùé9È\u000e¦\u0007¾\u0002 \u000e\u0085>\u0010§\u008dsí\\\u0080ß\u008f·ùÊC±«îP\u0092y(?\u0014Þ6#Ý¤~\u0003ð\r\u0002ú\u0089\u0005\u008bº\u0082À\u008d\u001aHöÒ©F\u0087\u000f·ñëO]\u0000Pn\u008f\u009d{N"
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
c = new String[15];
i = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[8];
int var10 = 0;
String var11 = "ÙÞ\u0014\u009cÏ\"[ì\u001a§\u000b6GS\\:jç\u00ad¦+Â3\u0013B£¿\b\u0011É³\u009f=LÖ=G\u001e\u009dI]'4\u0002?:8à";
int var12 = "ÙÞ\u0014\u009cÏ\"[ì\u001a§\u000b6GS\\:jç\u00ad¦+Â3\u0013B£¿\b\u0011É³\u009f=LÖ=G\u001e\u009dI]'4\u0002?:8à".length();
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
h = new Integer[8];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -9083294706206323L;
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
o = new pb((byte)var31, var32, var33);
S = new ArrayList();
p = new fd(_s.OUT_BACK, var0, var29);
return;
}
break;
default:
var40[var47] = var63;
if (var9 < var12) {
continue label46;
}

var11 = "Ñ\u0084ÃïÝÆ\u0090 j EyDBjµ";
var12 = "Ñ\u0084ÃïÝÆ\u0090 j EyDBjµ".length();
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

var22 = "E\u0087\u009a\rÊô°#Î\u0007\u008b!c´\u008cÑ\u0097çIÊ\u0097\u0083$È\u0087Á4c\u0083Ç\u0083\t2g\u0086mõ\u001c \u0006ð\u0091§óä|¬\u0010K{\r4\u0019/ôÐ\u0086ú¦\u000fú¥t®K\u0014\u0083~\u0082<\u008b´µw0,\f\u0084\u0082à+\u0098}¦íÖv\u000f¯plÀÝµ$7¬ÓÀèð.ñ¶\u0093·Ô\u009dÅ<8F\f\\\u000b\u000f&µ\u008c×zo\u0003;g\u0096\u008a±î¶O\u009e\u0088ÄãBK¢5\rõ7W8\u0018ÿ\u0081\u001bÛâC\u0082-\u00adÅ\u0018º4ù}\u001d»\u008fö\u0084E|\u009a¨";
var24 = "E\u0087\u009a\rÊô°#Î\u0007\u008b!c´\u008cÑ\u0097çIÊ\u0097\u0083$È\u0087Á4c\u0083Ç\u0083\t2g\u0086mõ\u001c \u0006ð\u0091§óä|¬\u0010K{\r4\u0019/ôÐ\u0086ú¦\u000fú¥t®K\u0014\u0083~\u0082<\u008b´µw0,\f\u0084\u0082à+\u0098}¦íÖv\u000f¯plÀÝµ$7¬ÓÀèð.ñ¶\u0093·Ô\u009dÅ<8F\f\\\u000b\u000f&µ\u008c×zo\u0003;g\u0096\u008a±î¶O\u009e\u0088ÄãBK¢5\rõ7W8\u0018ÿ\u0081\u001bÛâC\u0082-\u00adÅ\u0018º4ù}\u001d»\u008fö\u0084E|\u009a¨"
.length();
var21 = 144;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12926;
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
throw new RuntimeException("su/catlean/pb", var10);
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
throw new RuntimeException("su/catlean/pb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5344;
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
throw new RuntimeException("su/catlean/pb", var14);
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
throw new RuntimeException("su/catlean/pb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
