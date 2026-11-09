package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ga extends gf {
@NotNull
public static final ga N;
@NotNull
private static final List y;
@NotNull
private static final fd p;
private static final long a = yz.a(3667193777786092288L, -7098458865151111616L, MethodHandles.lookup().lookupClass()).a(128086613349322L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private ga(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var10001 = var4 ^ 7375577755973L;
int var6 = (int)((var4 ^ 7375577755973L) >>> 48);
int var7 = (int)((var4 ^ 7375577755973L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"h">(12163, 3811813375819549189L ^ var4), (char)var8);
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
// 017: ldc2_w 72787674350557
// 01a: lxor
// 01b: dup2
// 01c: bipush 32
// 01e: lushr
// 01f: l2i
// 020: istore 10
// 022: dup2
// 023: bipush 32
// 025: lshl
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 48
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: pop2
// 037: dup2
// 038: ldc2_w 99541060701969
// 03b: lxor
// 03c: dup2
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 13
// 043: dup2
// 044: bipush 16
// 046: lshl
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 14
// 04d: dup2
// 04e: bipush 48
// 050: lshl
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 15
// 057: pop2
// 058: dup2
// 059: ldc2_w 109580710346244
// 05c: lxor
// 05d: lstore 16
// 05f: dup2
// 060: ldc2_w 100479272291701
// 063: lxor
// 064: lstore 18
// 066: dup2
// 067: ldc2_w 130512158954640
// 06a: lxor
// 06b: lstore 20
// 06d: dup2
// 06e: ldc2_w 104104530525409
// 071: lxor
// 072: dup2
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 22
// 079: dup2
// 07a: bipush 16
// 07c: lshl
// 07d: bipush 32
// 07f: lushr
// 080: l2i
// 081: istore 23
// 083: dup2
// 084: bipush 48
// 086: lshl
// 087: bipush 48
// 089: lushr
// 08a: l2i
// 08b: istore 24
// 08d: pop2
// 08e: dup2
// 08f: ldc2_w 112434023090035
// 092: lxor
// 093: lstore 25
// 095: dup2
// 096: ldc2_w 128377113661390
// 099: lxor
// 09a: lstore 27
// 09c: dup2
// 09d: ldc2_w 122988646685770
// 0a0: lxor
// 0a1: lstore 29
// 0a3: dup2
// 0a4: ldc2_w 20173347401993
// 0a7: lxor
// 0a8: lstore 31
// 0aa: dup2
// 0ab: ldc2_w 99949442920536
// 0ae: lxor
// 0af: lstore 33
// 0b1: dup2
// 0b2: ldc2_w 30591967126976
// 0b5: lxor
// 0b6: lstore 35
// 0b8: pop2
// 0b9: ldc2_w -5990705277528627281
// 0bc: lload 1
// 0bd: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: aload 3
// 0c3: sipush 19969
// 0c6: ldc2_w 2768513714271894829
// 0c9: lload 1
// 0ca: lxor
// 0cb: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d3: istore 39
// 0d5: nop
// 0d6: lload 16
// 0d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0db: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 0de: dup
// 0df: sipush 4081
// 0e2: ldc2_w 4717970768083254489
// 0e5: lload 1
// 0e6: lxor
// 0e7: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0ef: checkcast su/catlean/mixins/accessors/ItemCooldownsAccessor
// 0f2: invokeinterface su/catlean/mixins/accessors/ItemCooldownsAccessor.getCooldowns ()Ljava/util/Map; 1
// 0f7: dup
// 0f8: sipush 20938
// 0fb: ldc2_w 2459009814266684139
// 0fe: lload 1
// 0ff: lxor
// 100: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 108: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 10d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 112: astore 40
// 114: aload 40
// 116: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11b: ifeq 263
// 11e: aload 40
// 120: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 125: checkcast java/util/Map$Entry
// 128: astore 41
// 12a: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
// 12d: aload 41
// 12f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 134: checkcast net/minecraft/class_2960
// 137: invokeinterface net/minecraft/class_7922.method_63535 (Lnet/minecraft/class_2960;)Ljava/lang/Object; 2
// 13c: dup
// 13d: sipush 12365
// 140: ldc2_w 5100311687438877540
// 143: lload 1
// 144: lxor
// 145: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14d: checkcast net/minecraft/class_1792
// 150: astore 42
// 152: getstatic su/catlean/ga.y Ljava/util/List;
// 155: checkcast java/lang/Iterable
// 158: astore 43
// 15a: bipush 0
// 15b: istore 44
// 15d: aload 43
// 15f: lload 1
// 160: lconst_0
// 161: lcmp
// 162: ifle 269
// 165: iload 39
// 167: lload 1
// 168: lconst_0
// 169: lcmp
// 16a: iflt 172
// 16d: ifeq 269
// 170: iload 39
// 172: ifeq 1d1
// 175: goto 182
// 178: ldc2_w -5981603049938189043
// 17b: lload 1
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: instanceof java/util/Collection
// 185: ifeq 1cf
// 188: goto 195
// 18b: ldc2_w -5981603049938189043
// 18e: lload 1
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: aload 43
// 197: checkcast java/util/Collection
// 19a: iload 39
// 19c: ifeq 1d1
// 19f: goto 1ac
// 1a2: ldc2_w -5981603049938189043
// 1a5: lload 1
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1b1: ifeq 1cf
// 1b4: goto 1c1
// 1b7: ldc2_w -5981603049938189043
// 1ba: lload 1
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: bipush 1
// 1c2: goto 212
// 1c5: ldc2_w -5981603049938189043
// 1c8: lload 1
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: aload 43
// 1d1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1d6: astore 45
// 1d8: aload 45
// 1da: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1df: ifeq 211
// 1e2: aload 45
// 1e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1e9: astore 46
// 1eb: aload 46
// 1ed: checkcast su/catlean/gb
// 1f0: astore 47
// 1f2: bipush 0
// 1f3: istore 48
// 1f5: aload 47
// 1f7: invokevirtual su/catlean/gb.m ()Lnet/minecraft/class_1792;
// 1fa: aload 42
// 1fc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1ff: ifeq 1d8
// 202: bipush 0
// 203: lload 1
// 204: lconst_0
// 205: lcmp
// 206: ifle 1ff
// 209: iload 39
// 20b: ifeq 1ff
// 20e: goto 212
// 211: bipush 1
// 212: ifeq 114
// 215: getstatic su/catlean/ga.y Ljava/util/List;
// 218: new su/catlean/gb
// 21b: dup
// 21c: aload 42
// 21e: aload 41
// 220: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 225: dup
// 226: sipush 6631
// 229: ldc2_w 8080018715934616257
// 22c: lload 1
// 22d: lxor
// 22e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 236: checkcast su/catlean/mixins/accessors/CooldownInstanceAccessor
// 239: invokeinterface su/catlean/mixins/accessors/CooldownInstanceAccessor.getEndTime ()I 1
// 23e: aconst_null
// 23f: bipush 0
// 240: lload 29
// 242: sipush 31174
// 245: ldc2_w 6098539770187856449
// 248: lload 1
// 249: lxor
// 24a: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: aconst_null
// 250: invokespecial su/catlean/gb.<init> (Lnet/minecraft/class_1792;ILsu/catlean/fd;ZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 253: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 258: pop
// 259: goto 114
// 25c: astore 40
// 25e: aload 40
// 260: invokevirtual java/lang/Throwable.printStackTrace ()V
// 263: getstatic su/catlean/ga.y Ljava/util/List;
// 266: checkcast java/lang/Iterable
// 269: astore 40
// 26b: bipush 0
// 26c: istore 41
// 26e: aload 40
// 270: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 275: astore 42
// 277: aload 42
// 279: invokeinterface java/util/Iterator.hasNext ()Z 1
// 27e: ifeq 2f4
// 281: aload 42
// 283: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 288: astore 43
// 28a: aload 43
// 28c: checkcast su/catlean/gb
// 28f: astore 44
// 291: bipush 0
// 292: istore 45
// 294: iload 39
// 296: lload 1
// 297: lconst_0
// 298: lcmp
// 299: ifle 2f1
// 29c: ifeq 2ef
// 29f: lload 16
// 2a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a4: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 2a7: aload 44
// 2a9: invokevirtual su/catlean/gb.m ()Lnet/minecraft/class_1792;
// 2ac: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 2af: invokevirtual net/minecraft/class_1796.method_7904 (Lnet/minecraft/class_1799;)Z
// 2b2: lload 1
// 2b3: lconst_0
// 2b4: lcmp
// 2b5: ifle 311
// 2b8: iload 39
// 2ba: ifeq 30d
// 2bd: goto 2ca
// 2c0: ldc2_w -5981603049938189043
// 2c3: lload 1
// 2c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: athrow
// 2ca: ifne 2ed
// 2cd: goto 2da
// 2d0: ldc2_w -5981603049938189043
// 2d3: lload 1
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: aload 44
// 2dc: bipush 1
// 2dd: invokevirtual su/catlean/gb.X (Z)V
// 2e0: goto 2ed
// 2e3: ldc2_w -5981603049938189043
// 2e6: lload 1
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: nop
// 2ee: nop
// 2ef: iload 39
// 2f1: ifne 277
// 2f4: nop
// 2f5: getstatic su/catlean/ga.y Ljava/util/List;
// 2f8: lload 1
// 2f9: lconst_0
// 2fa: lcmp
// 2fb: ifle 288
// 2fe: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ga.E (Lsu/catlean/gb;)Z, (Lsu/catlean/gb;)Ljava/lang/Boolean; ]
// 303: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/ga.Y (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 308: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 30d: pop
// 30e: sipush 25097
// 311: ldc2_w 8127407519348625700
// 314: lload 1
// 315: lxor
// 316: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: astore 40
// 31d: aload 0
// 31e: lload 35
// 320: invokevirtual su/catlean/ga.p (J)F
// 323: aload 0
// 324: lload 18
// 326: invokevirtual su/catlean/ga.r (J)I
// 329: i2f
// 32a: fconst_2
// 32b: fdiv
// 32c: fcmpl
// 32d: iload 39
// 32f: ifeq 343
// 332: ifle 346
// 335: goto 342
// 338: ldc2_w -5981603049938189043
// 33b: lload 1
// 33c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: athrow
// 342: bipush 1
// 343: goto 347
// 346: bipush 0
// 347: istore 41
// 349: getstatic su/catlean/ga.p Lsu/catlean/fd;
// 34c: getstatic su/catlean/ga.y Ljava/util/List;
// 34f: invokeinterface java/util/List.isEmpty ()Z 1
// 354: iload 39
// 356: lload 1
// 357: lconst_0
// 358: lcmp
// 359: iflt 38f
// 35c: ifeq 387
// 35f: ifeq 3cb
// 362: goto 36f
// 365: ldc2_w -5981603049938189043
// 368: lload 1
// 369: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36e: athrow
// 36f: lload 4
// 371: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 374: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 377: instanceof net/minecraft/class_408
// 37a: goto 387
// 37d: ldc2_w -5981603049938189043
// 380: lload 1
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: lload 1
// 388: lconst_0
// 389: lcmp
// 38a: ifle 3ba
// 38d: iload 39
// 38f: ifeq 3ba
// 392: ifne 3cb
// 395: goto 3a2
// 398: ldc2_w -5981603049938189043
// 39b: lload 1
// 39c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: athrow
// 3a2: lload 4
// 3a4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3a7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 3aa: instanceof su/catlean/rl
// 3ad: goto 3ba
// 3b0: ldc2_w -5981603049938189043
// 3b3: lload 1
// 3b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b9: athrow
// 3ba: ifne 3cb
// 3bd: fconst_0
// 3be: goto 3cc
// 3c1: ldc2_w -5981603049938189043
// 3c4: lload 1
// 3c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ca: athrow
// 3cb: fconst_1
// 3cc: lload 8
// 3ce: dup2_x1
// 3cf: pop2
// 3d0: invokevirtual su/catlean/fd.B (JF)V
// 3d3: aload 0
// 3d4: aload 3
// 3d5: aload 40
// 3d7: getstatic su/catlean/ga.p Lsu/catlean/fd;
// 3da: invokevirtual su/catlean/fd.a ()F
// 3dd: iload 41
// 3df: lload 20
// 3e1: invokevirtual su/catlean/ga.q (Lnet/minecraft/class_332;Ljava/lang/String;FZJ)V
// 3e4: ldc 17.0
// 3e6: fstore 42
// 3e8: lload 33
// 3ea: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3ed: lload 31
// 3ef: aload 40
// 3f1: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 3f4: ldc 24.0
// 3f6: fadd
// 3f7: fstore 43
// 3f9: getstatic su/catlean/ga.y Ljava/util/List;
// 3fc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 401: astore 44
// 403: aload 44
// 405: invokeinterface java/util/Iterator.hasNext ()Z 1
// 40a: ifeq 4de
// 40d: aload 44
// 40f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 414: checkcast su/catlean/gb
// 417: astore 45
// 419: aload 0
// 41a: aload 45
// 41c: invokevirtual su/catlean/gb.P ()I
// 41f: lload 16
// 421: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 424: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 427: dup
// 428: sipush 11461
// 42b: ldc2_w 2718179050662649839
// 42e: lload 1
// 42f: lxor
// 430: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 435: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 438: checkcast su/catlean/mixins/accessors/ItemCooldownsAccessor
// 43b: invokeinterface su/catlean/mixins/accessors/ItemCooldownsAccessor.getTickCount ()I 1
// 440: isub
// 441: lload 25
// 443: invokevirtual su/catlean/ga.o (IJ)Ljava/lang/String;
// 446: astore 46
// 448: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 44b: aload 45
// 44d: invokevirtual su/catlean/gb.m ()Lnet/minecraft/class_1792;
// 450: invokevirtual net/minecraft/class_1792.method_7876 ()Ljava/lang/String;
// 453: dup
// 454: sipush 4260
// 457: ldc2_w 1813265862322119562
// 45a: lload 1
// 45b: lxor
// 45c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 461: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 464: bipush 0
// 465: anewarray 236
// 468: astore 37
// 46a: astore 38
// 46c: iload 10
// 46e: aload 38
// 470: iload 11
// 472: aload 37
// 474: iload 12
// 476: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 479: astore 47
// 47b: lload 33
// 47d: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 480: lload 31
// 482: aload 47
// 484: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 487: fstore 48
// 489: lload 33
// 48b: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 48e: lload 31
// 490: aload 46
// 492: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 495: fstore 49
// 497: fload 48
// 499: fload 49
// 49b: fadd
// 49c: ldc 27.0
// 49e: fadd
// 49f: lload 1
// 4a0: lconst_0
// 4a1: lcmp
// 4a2: iflt 4d7
// 4a5: fload 43
// 4a7: iload 39
// 4a9: ifeq 4d6
// 4ac: fcmpl
// 4ad: iload 39
// 4af: ifeq 4f5
// 4b2: goto 4bf
// 4b5: ldc2_w -5981603049938189043
// 4b8: lload 1
// 4b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4be: athrow
// 4bf: ifle 403
// 4c2: goto 4cf
// 4c5: ldc2_w -5981603049938189043
// 4c8: lload 1
// 4c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ce: athrow
// 4cf: fload 48
// 4d1: fload 49
// 4d3: fadd
// 4d4: ldc 27.0
// 4d6: fadd
// 4d7: fstore 43
// 4d9: iload 39
// 4db: ifne 403
// 4de: getstatic su/catlean/ga.y Ljava/util/List;
// 4e1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 4e6: lload 1
// 4e7: lconst_0
// 4e8: lcmp
// 4e9: ifle 414
// 4ec: astore 44
// 4ee: aload 44
// 4f0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4f5: ifeq 800
// 4f8: aload 44
// 4fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4ff: checkcast su/catlean/gb
// 502: astore 45
// 504: aload 0
// 505: aload 45
// 507: invokevirtual su/catlean/gb.P ()I
// 50a: lload 16
// 50c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 50f: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 512: dup
// 513: sipush 11461
// 516: ldc2_w 2718179050662649839
// 519: lload 1
// 51a: lxor
// 51b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 520: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 523: checkcast su/catlean/mixins/accessors/ItemCooldownsAccessor
// 526: invokeinterface su/catlean/mixins/accessors/ItemCooldownsAccessor.getTickCount ()I 1
// 52b: isub
// 52c: lload 25
// 52e: invokevirtual su/catlean/ga.o (IJ)Ljava/lang/String;
// 531: astore 46
// 533: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 536: aload 45
// 538: invokevirtual su/catlean/gb.m ()Lnet/minecraft/class_1792;
// 53b: invokevirtual net/minecraft/class_1792.method_7876 ()Ljava/lang/String;
// 53e: dup
// 53f: sipush 9942
// 542: ldc2_w 1345261018071782898
// 545: lload 1
// 546: lxor
// 547: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 54f: bipush 0
// 550: anewarray 236
// 553: astore 37
// 555: astore 38
// 557: iload 10
// 559: aload 38
// 55b: iload 11
// 55d: aload 37
// 55f: iload 12
// 561: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 564: astore 47
// 566: lload 33
// 568: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 56b: lload 31
// 56d: aload 47
// 56f: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 572: fstore 48
// 574: lload 33
// 576: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 579: lload 31
// 57b: aload 46
// 57d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 580: fstore 49
// 582: iload 39
// 584: lload 1
// 585: lconst_0
// 586: lcmp
// 587: ifle 58f
// 58a: ifeq 810
// 58d: iload 41
// 58f: ifeq 5d8
// 592: goto 59f
// 595: ldc2_w -5981603049938189043
// 598: lload 1
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: aload 0
// 5a0: lload 35
// 5a2: invokevirtual su/catlean/ga.p (J)F
// 5a5: fconst_1
// 5a6: aload 45
// 5a8: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 5ab: invokevirtual su/catlean/fd.a ()F
// 5ae: fsub
// 5af: sipush 7718
// 5b2: ldc2_w 4251190373040086432
// 5b5: lload 1
// 5b6: lxor
// 5b7: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bc: i2f
// 5bd: fmul
// 5be: fsub
// 5bf: fload 48
// 5c1: fload 49
// 5c3: fadd
// 5c4: ldc 27.0
// 5c6: fadd
// 5c7: fload 43
// 5c9: fsub
// 5ca: fsub
// 5cb: goto 5f8
// 5ce: ldc2_w -5981603049938189043
// 5d1: lload 1
// 5d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d7: athrow
// 5d8: aload 0
// 5d9: lload 35
// 5db: invokevirtual su/catlean/ga.p (J)F
// 5de: fconst_1
// 5df: aload 45
// 5e1: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 5e4: invokevirtual su/catlean/fd.a ()F
// 5e7: fsub
// 5e8: sipush 20460
// 5eb: ldc2_w 4933850528440355949
// 5ee: lload 1
// 5ef: lxor
// 5f0: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f5: i2f
// 5f6: fmul
// 5f7: fsub
// 5f8: fstore 50
// 5fa: aload 0
// 5fb: checkcast su/catlean/gf
// 5fe: aload 3
// 5ff: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 602: dup
// 603: sipush 169
// 606: ldc2_w 1604624460328268678
// 609: lload 1
// 60a: lxor
// 60b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 610: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 613: fload 50
// 615: aload 0
// 616: lload 6
// 618: invokevirtual su/catlean/ga.V (J)F
// 61b: fload 42
// 61d: fadd
// 61e: iload 22
// 620: i2s
// 621: swap
// 622: iload 23
// 624: swap
// 625: ldc 13.0
// 627: ldc 13.0
// 629: aload 45
// 62b: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 62e: invokevirtual su/catlean/fd.a ()F
// 631: iload 24
// 633: i2s
// 634: swap
// 635: bipush 0
// 636: sipush 4927
// 639: ldc2_w 940379493864689855
// 63c: lload 1
// 63d: lxor
// 63e: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 643: aconst_null
// 644: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 647: aload 0
// 648: checkcast su/catlean/gf
// 64b: aload 3
// 64c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 64f: dup
// 650: sipush 15974
// 653: ldc2_w 7042245967417789766
// 656: lload 1
// 657: lxor
// 658: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 660: fload 50
// 662: ldc 14.0
// 664: fadd
// 665: aload 0
// 666: lload 6
// 668: invokevirtual su/catlean/ga.V (J)F
// 66b: fload 42
// 66d: fadd
// 66e: iload 22
// 670: i2s
// 671: swap
// 672: iload 23
// 674: swap
// 675: fload 48
// 677: ldc 6.0
// 679: fadd
// 67a: ldc 13.0
// 67c: aload 45
// 67e: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 681: invokevirtual su/catlean/fd.a ()F
// 684: iload 24
// 686: i2s
// 687: swap
// 688: bipush 0
// 689: sipush 2966
// 68c: ldc2_w 1694404557680232469
// 68f: lload 1
// 690: lxor
// 691: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 696: aconst_null
// 697: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 69a: aload 0
// 69b: checkcast su/catlean/gf
// 69e: aload 3
// 69f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6a2: dup
// 6a3: sipush 15974
// 6a6: ldc2_w 7042245967417789766
// 6a9: lload 1
// 6aa: lxor
// 6ab: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6b3: fload 50
// 6b5: fload 48
// 6b7: ldc 21.0
// 6b9: fadd
// 6ba: aload 45
// 6bc: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 6bf: invokevirtual su/catlean/fd.a ()F
// 6c2: fmul
// 6c3: fadd
// 6c4: aload 0
// 6c5: lload 6
// 6c7: invokevirtual su/catlean/ga.V (J)F
// 6ca: fload 42
// 6cc: fadd
// 6cd: iload 22
// 6cf: i2s
// 6d0: swap
// 6d1: iload 23
// 6d3: swap
// 6d4: fload 49
// 6d6: ldc 6.0
// 6d8: fadd
// 6d9: ldc 13.0
// 6db: aload 45
// 6dd: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 6e0: invokevirtual su/catlean/fd.a ()F
// 6e3: iload 24
// 6e5: i2s
// 6e6: swap
// 6e7: bipush 0
// 6e8: sipush 2966
// 6eb: ldc2_w 1694404557680232469
// 6ee: lload 1
// 6ef: lxor
// 6f0: invokedynamic g (IJ)I bsm=su/catlean/ga.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f5: aconst_null
// 6f6: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 6f9: aload 0
// 6fa: aload 3
// 6fb: aload 47
// 6fd: fload 50
// 6ff: ldc 17.0
// 701: fadd
// 702: aload 0
// 703: lload 6
// 705: invokevirtual su/catlean/ga.V (J)F
// 708: fload 42
// 70a: fadd
// 70b: fconst_1
// 70c: fadd
// 70d: lload 27
// 70f: dup2_x1
// 710: pop2
// 711: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 714: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 717: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 71a: aload 45
// 71c: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 71f: invokevirtual su/catlean/fd.a ()F
// 722: iload 13
// 724: i2c
// 725: swap
// 726: iload 14
// 728: swap
// 729: iload 15
// 72b: i2s
// 72c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 72f: invokevirtual su/catlean/ga.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 732: aload 0
// 733: aload 3
// 734: aload 46
// 736: fload 50
// 738: fload 48
// 73a: ldc 24.0
// 73c: fadd
// 73d: aload 45
// 73f: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 742: invokevirtual su/catlean/fd.a ()F
// 745: fmul
// 746: fadd
// 747: aload 0
// 748: lload 6
// 74a: invokevirtual su/catlean/ga.V (J)F
// 74d: fload 42
// 74f: fadd
// 750: fconst_1
// 751: fadd
// 752: lload 27
// 754: dup2_x1
// 755: pop2
// 756: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 759: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 75c: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 75f: aload 45
// 761: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 764: invokevirtual su/catlean/fd.a ()F
// 767: iload 13
// 769: i2c
// 76a: swap
// 76b: iload 14
// 76d: swap
// 76e: iload 15
// 770: i2s
// 771: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 774: invokevirtual su/catlean/ga.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 777: aload 3
// 778: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 77b: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 77e: pop
// 77f: aload 3
// 780: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 783: fload 50
// 785: bipush 2
// 786: i2f
// 787: fadd
// 788: aload 0
// 789: lload 6
// 78b: invokevirtual su/catlean/ga.V (J)F
// 78e: fload 42
// 790: fadd
// 791: bipush 2
// 792: i2f
// 793: fadd
// 794: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 797: pop
// 798: aload 3
// 799: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 79c: ldc 0.55
// 79e: invokevirtual org/joml/Matrix3x2fStack.scale (F)Lorg/joml/Matrix3x2f;
// 7a1: pop
// 7a2: aload 45
// 7a4: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 7a7: invokevirtual su/catlean/fd.a ()F
// 7aa: lload 1
// 7ab: lconst_0
// 7ac: lcmp
// 7ad: iflt 7f9
// 7b0: ldc 0.8
// 7b2: iload 39
// 7b4: ifeq 7f8
// 7b7: fcmpl
// 7b8: ifle 7e3
// 7bb: goto 7c8
// 7be: ldc2_w -5981603049938189043
// 7c1: lload 1
// 7c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c7: athrow
// 7c8: aload 3
// 7c9: aload 45
// 7cb: invokevirtual su/catlean/gb.m ()Lnet/minecraft/class_1792;
// 7ce: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 7d1: bipush 0
// 7d2: bipush 0
// 7d3: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 7d6: goto 7e3
// 7d9: ldc2_w -5981603049938189043
// 7dc: lload 1
// 7dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e2: athrow
// 7e3: aload 3
// 7e4: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7e7: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 7ea: pop
// 7eb: fload 42
// 7ed: ldc 14.0
// 7ef: aload 45
// 7f1: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 7f4: invokevirtual su/catlean/fd.a ()F
// 7f7: fmul
// 7f8: fadd
// 7f9: fstore 42
// 7fb: iload 39
// 7fd: ifne 4ee
// 800: aload 0
// 801: fload 43
// 803: fload 42
// 805: fconst_2
// 806: fsub
// 807: invokevirtual su/catlean/ga.X (FF)V
// 80a: lload 1
// 80b: lconst_0
// 80c: lcmp
// 80d: iflt 810
// 810: return
}

@NotNull
public final String o(int ticks, long a) {
ax = a ^ ax;
int var10000 = ticks / d<"g">(7266, 7113437307517092591L ^ ax);
String var4 = b<"h">(24036, 8815854156787299273L ^ ax);
Object[] var5 = new Object[]{ticks % d<"g">(743, 9177067631210388588L ^ ax) / d<"g">(13274, 7925064932289539408L ^ ax)};
String var10001 = String.format(var4, Arrays.copyOf(var5, var5.length));
Intrinsics.checkNotNullExpressionValue(var10001, b<"h">(22695, 1493187870644647567L ^ ax));
return var10000 + ":" + var10001;
}

private static final boolean E(gb param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ga.a J
// 03: ldc2_w 52210180710914
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 123510958434890
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w 4165507332059848831
// 13: lload 1
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 19765
// 1d: ldc2_w 4922942021481671429
// 20: lload 1
// 21: lxor
// 22: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/ga.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: istore 5
// 2c: aload 0
// 2d: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 30: aload 0
// 31: invokevirtual su/catlean/gb.q ()Z
// 34: ifeq 45
// 37: fconst_0
// 38: goto 46
// 3b: ldc2_w 4172631028802850840
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: lload 3
// 47: dup2_x1
// 48: pop2
// 49: invokevirtual su/catlean/fd.B (JF)V
// 4c: aload 0
// 4d: invokevirtual su/catlean/gb.q ()Z
// 50: iload 5
// 52: ifne 7b
// 55: ifeq 94
// 58: goto 65
// 5b: ldc2_w 4172631028802850840
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: aload 0
// 66: invokevirtual su/catlean/gb.v ()Lsu/catlean/fd;
// 69: invokevirtual su/catlean/fd.a ()F
// 6c: fconst_0
// 6d: fcmpg
// 6e: goto 7b
// 71: ldc2_w 4172631028802850840
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: iload 5
// 7d: ifne 91
// 80: ifgt 94
// 83: goto 90
// 86: ldc2_w 4172631028802850840
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 1
// 91: goto 95
// 94: bipush 0
// 95: ireturn
}

private static final boolean Y(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var27 = a ^ 69653142136126L;
long var29 = var27 ^ 15752698764422L;
long var10001 = var27 ^ 109142597115632L;
int var31 = (int)((var27 ^ 109142597115632L) >>> 32);
int var32 = (int)((var27 ^ 109142597115632L) << 32 >>> 48);
int var33 = (int)(var10001 << 48 >>> 48);
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
String var22 = "îoRÜ;\u0018Ô¥þv\u001cÿr¦´\u0010whÙþþx\u001ekrÕ\u0086d\u0080(óæ\u0010ø±ÓÁb¤ß\u0017¼ÿ\u0019£¹Fo¢ ¾v\u00ad\u0080´»¶\u0083Ì|ûhØ¤\u0004ì\u009c\fe\u0013ö¡ß+äôþÿ?\u0014\u009dpH\u000b,Ü\u008e\u0096\u008bbÛÍ¿4\"³_³\u0082¸çLOè\u0084AÝor\u008c\u001a=Çùo2ô\u00137 \u0093¬ö\u0095\u0088\ný\u001dìÇ\u0087\u001eÊG*\u0092¯É\u0086\u000b´Â»ô\u0089\u001d§\u001dï)\u009fÚ\u0085È¼tèBJ©\\}'<ò\u0016ÉÎÒ\u0086}¿ßàAO¼\u001fË\u0002ÍÒ{\u009b\"Ã\u0087\u0001Ç0Å\u0018Çß\u008bÉ1Öz\u009aíÇÏ]S\u0083=R\u008e¿ Eã\u001b9\u009cwÖf\u000e\u0092 yàèÍ\u0018\r\u009a\u0096\u0083(\u00ad\u0084\u009dÔ\\\u0081ö\u0098L£Õ ÝÎ\u009fç\u0092ò\u0001ÝX\u0006$Fè\u000fJM\u0098º\u0002\u0014\u0019²LHÐ$\u008b7N«æÈ(.ËÓrÖr\u0098\u0091b\u0097Ï\u009f·\u0080\u0017à\u0098\u009cåíD\u0099É\u008c\u0012qNOZÙ\\¾\u000b3¯ª¿\u0093\u009c\u001b\u00107CyNm¶VY\u007f\u009c¾ÙYrA±(À6êS©ìN®\u009b\f\u0094ä\u001b#\u00ad³¦\u000fýU\u009e¡(§;?\u00ad\u0082gj\u0012\u0080\u007fg\u0001gO\u0019J\u009d\u0010Ø\u007f\u008b\u000fóT)\u0090ñ¢\"é4\u0098\u001að\u001846g¼ã\u0098ùLY9-\u0092\u0090¼ d\u0085gÙ¬\u0011\"½\t(ó\"z!b \u0096\u0087\u001b(ØïT8ó\u0084\u0019eÌª\u0012\n\u009c§Æ\fËgðÀ¹¼ú6ÂV×ç]§ ë5Áb8Q` Ó\u0086\u008eU\u0015Ù9ñbÞ\u0010Ö\u0098üñ¬å\u0015ú/\rv»\u009c\u0088Y=Ë÷$`DÚ\u000fhÂ\u008fK¬êd\u000eÇ\fD¡\u0013\u0090\u0089Éá\u009fdnÞº[\r?¼\u0091\u0003wÅ]á\u001bXòöÙ31·g4=ëác^Ì\u0092É\u0003gP\u001dÞ[ÅÓiÈ\u0093\b\u009fðã¶.å\u0002ßÐSíZüXí\u000fÚoõ\u001f\b·êÑ\u008dµ\u0014 '\u00ad-\u0005ÂszU¸Iä\u0011ÆC%p\u0006i6\u001db()1-\u0001\u001e\u001c Õ\r\u009eE¬Å\u001ed";
int var24 = "îoRÜ;\u0018Ô¥þv\u001cÿr¦´\u0010whÙþþx\u001ekrÕ\u0086d\u0080(óæ\u0010ø±ÓÁb¤ß\u0017¼ÿ\u0019£¹Fo¢ ¾v\u00ad\u0080´»¶\u0083Ì|ûhØ¤\u0004ì\u009c\fe\u0013ö¡ß+äôþÿ?\u0014\u009dpH\u000b,Ü\u008e\u0096\u008bbÛÍ¿4\"³_³\u0082¸çLOè\u0084AÝor\u008c\u001a=Çùo2ô\u00137 \u0093¬ö\u0095\u0088\ný\u001dìÇ\u0087\u001eÊG*\u0092¯É\u0086\u000b´Â»ô\u0089\u001d§\u001dï)\u009fÚ\u0085È¼tèBJ©\\}'<ò\u0016ÉÎÒ\u0086}¿ßàAO¼\u001fË\u0002ÍÒ{\u009b\"Ã\u0087\u0001Ç0Å\u0018Çß\u008bÉ1Öz\u009aíÇÏ]S\u0083=R\u008e¿ Eã\u001b9\u009cwÖf\u000e\u0092 yàèÍ\u0018\r\u009a\u0096\u0083(\u00ad\u0084\u009dÔ\\\u0081ö\u0098L£Õ ÝÎ\u009fç\u0092ò\u0001ÝX\u0006$Fè\u000fJM\u0098º\u0002\u0014\u0019²LHÐ$\u008b7N«æÈ(.ËÓrÖr\u0098\u0091b\u0097Ï\u009f·\u0080\u0017à\u0098\u009cåíD\u0099É\u008c\u0012qNOZÙ\\¾\u000b3¯ª¿\u0093\u009c\u001b\u00107CyNm¶VY\u007f\u009c¾ÙYrA±(À6êS©ìN®\u009b\f\u0094ä\u001b#\u00ad³¦\u000fýU\u009e¡(§;?\u00ad\u0082gj\u0012\u0080\u007fg\u0001gO\u0019J\u009d\u0010Ø\u007f\u008b\u000fóT)\u0090ñ¢\"é4\u0098\u001að\u001846g¼ã\u0098ùLY9-\u0092\u0090¼ d\u0085gÙ¬\u0011\"½\t(ó\"z!b \u0096\u0087\u001b(ØïT8ó\u0084\u0019eÌª\u0012\n\u009c§Æ\fËgðÀ¹¼ú6ÂV×ç]§ ë5Áb8Q` Ó\u0086\u008eU\u0015Ù9ñbÞ\u0010Ö\u0098üñ¬å\u0015ú/\rv»\u009c\u0088Y=Ë÷$`DÚ\u000fhÂ\u008fK¬êd\u000eÇ\fD¡\u0013\u0090\u0089Éá\u009fdnÞº[\r?¼\u0091\u0003wÅ]á\u001bXòöÙ31·g4=ëác^Ì\u0092É\u0003gP\u001dÞ[ÅÓiÈ\u0093\b\u009fðã¶.å\u0002ßÐSíZüXí\u000fÚoõ\u001f\b·êÑ\u008dµ\u0014 '\u00ad-\u0005ÂszU¸Iä\u0011ÆC%p\u0006i6\u001db()1-\u0001\u001e\u001c Õ\r\u009eE¬Å\u001ed"
.length();
char var21 = ' ';
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
String var11 = "^T\u008a\u009bµÚÊ\u00ad\u0087U7än\u0097\u0005¹xR\u009f7\u0089\u0003êÿ+,VrÔ¸ÞÃ\"æ\u008f;\u007f\u001f¨ÿòÁªdZÅ\u0014è";
int var12 = "^T\u008a\u009bµÚÊ\u00ad\u0087U7än\u0097\u0005¹xR\u009f7\u0089\u0003êÿ+,VrÔ¸ÞÃ\"æ\u008f;\u007f\u001f¨ÿòÁªdZÅ\u0014è".length();
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
long var4 = 4176606586045248472L;
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
N = new ga(var31, (char)var32, (char)var33);
y = new ArrayList();
p = new fd(_s.OUT_BACK, var0, var29);
return;
}
break;
default:
var40[var47] = var63;
if (var9 < var12) {
continue label46;
}

var11 = ",*ÁÐx\u009d»\u0090\u001b\"ì\u000e$\u00061o";
var12 = ",*ÁÐx\u009d»\u0090\u001b\"ì\u000e$\u00061o".length();
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

var22 = "\u007f\u0001|¨\u001d¯b§4hU§PÃ þT§Xàï\u0005\u008ew\u0088Â/PLôË\u0084\r¼( K®fJ\u0006<\u001d!êÔ\u007f\u0012\u009c\u0001Úï\u0000,ü\fu2\u0012\u009d¾übd1\u001f\u0001$\u007f¾\u008fËßË\u008fW½\u0004Mn|\b\u0094ýT\u0005Õº?ðT\u008bØ¶áT%\u009aå8\\~\u0084)ª'¤»0N(\u0092\u000f¡bâá¢þ\u0015\u009aìÿY£ïjs¦Å\u008f ¡qqAÃéC·¸t\u001b'\u0084\u0010Ê²Èjnh^û^äúKÒ«\u0010";
var24 = "\u007f\u0001|¨\u001d¯b§4hU§PÃ þT§Xàï\u0005\u008ew\u0088Â/PLôË\u0084\r¼( K®fJ\u0006<\u001d!êÔ\u007f\u0012\u009c\u0001Úï\u0000,ü\fu2\u0012\u009d¾übd1\u001f\u0001$\u007f¾\u008fËßË\u008fW½\u0004Mn|\b\u0094ýT\u0005Õº?ðT\u008bØ¶áT%\u009aå8\\~\u0084)ª'¤»0N(\u0092\u000f¡bâá¢þ\u0015\u009aìÿY£ïjs¦Å\u008f ¡qqAÃéC·¸t\u001b'\u0084\u0010Ê²Èjnh^û^äúKÒ«\u0010"
.length();
var21 = 24;
var36 = -1;
}

var37 = var22.substring(++var36, var36 + var21);
var42 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24143;
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
throw new RuntimeException("su/catlean/ga", var10);
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
throw new RuntimeException("su/catlean/ga" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28394;
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
throw new RuntimeException("su/catlean/ga", var14);
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
throw new RuntimeException("su/catlean/ga" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
