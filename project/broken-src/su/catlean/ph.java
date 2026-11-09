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

public final class ph extends gf {
@NotNull
public static final ph H;
@NotNull
private static final List g;
@NotNull
private static final fd l;
private static final long a = yz.a(7972252224232676418L, -5853125047384858089L, MethodHandles.lookup().lookupClass()).a(114821091128628L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private ph(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var10001 = var4 ^ 10589524591183L;
int var6 = (int)((var4 ^ 10589524591183L) >>> 48);
int var7 = (int)((var4 ^ 10589524591183L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"r">(29481, 7050670193629890410L ^ var4), (char)var8);
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
// 059: ldc2_w 39056381264851
// 05c: lxor
// 05d: dup2
// 05e: bipush 8
// 060: lushr
// 061: lstore 16
// 063: dup2
// 064: bipush 56
// 066: lshl
// 067: bipush 56
// 069: lushr
// 06a: l2i
// 06b: istore 18
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 109580710346244
// 072: lxor
// 073: lstore 19
// 075: dup2
// 076: ldc2_w 100479272291701
// 079: lxor
// 07a: lstore 21
// 07c: dup2
// 07d: ldc2_w 130512158954640
// 080: lxor
// 081: lstore 23
// 083: dup2
// 084: ldc2_w 104104530525409
// 087: lxor
// 088: dup2
// 089: bipush 48
// 08b: lushr
// 08c: l2i
// 08d: istore 25
// 08f: dup2
// 090: bipush 16
// 092: lshl
// 093: bipush 32
// 095: lushr
// 096: l2i
// 097: istore 26
// 099: dup2
// 09a: bipush 48
// 09c: lshl
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 27
// 0a3: pop2
// 0a4: dup2
// 0a5: ldc2_w 87674672431915
// 0a8: lxor
// 0a9: dup2
// 0aa: bipush 32
// 0ac: lushr
// 0ad: l2i
// 0ae: istore 28
// 0b0: dup2
// 0b1: bipush 32
// 0b3: lshl
// 0b4: bipush 56
// 0b6: lushr
// 0b7: l2i
// 0b8: istore 29
// 0ba: dup2
// 0bb: bipush 40
// 0bd: lshl
// 0be: bipush 40
// 0c0: lushr
// 0c1: l2i
// 0c2: istore 30
// 0c4: pop2
// 0c5: dup2
// 0c6: ldc2_w 128377113661390
// 0c9: lxor
// 0ca: lstore 31
// 0cc: dup2
// 0cd: ldc2_w 20173347401993
// 0d0: lxor
// 0d1: lstore 33
// 0d3: dup2
// 0d4: ldc2_w 99949442920536
// 0d7: lxor
// 0d8: lstore 35
// 0da: dup2
// 0db: ldc2_w 30591967126976
// 0de: lxor
// 0df: lstore 37
// 0e1: pop2
// 0e2: aload 3
// 0e3: sipush 26971
// 0e6: ldc2_w 7571386871329126578
// 0e9: lload 1
// 0ea: lxor
// 0eb: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0f3: ldc2_w -5990705277528627281
// 0f6: lload 1
// 0f7: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: lload 19
// 0fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 101: invokevirtual net/minecraft/class_746.method_6026 ()Ljava/util/Collection;
// 104: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
// 109: astore 42
// 10b: istore 41
// 10d: aload 42
// 10f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 114: ifeq 21d
// 117: aload 42
// 119: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11e: dup
// 11f: sipush 21232
// 122: ldc2_w 4206855849086862102
// 125: lload 1
// 126: lxor
// 127: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12f: checkcast net/minecraft/class_1293
// 132: astore 43
// 134: getstatic su/catlean/ph.g Ljava/util/List;
// 137: checkcast java/lang/Iterable
// 13a: astore 44
// 13c: bipush 0
// 13d: istore 45
// 13f: aload 44
// 141: iload 41
// 143: lload 1
// 144: lconst_0
// 145: lcmp
// 146: ifle 14e
// 149: ifeq 229
// 14c: iload 41
// 14e: ifeq 1ad
// 151: goto 15e
// 154: ldc2_w -6005043199846158191
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: instanceof java/util/Collection
// 161: ifeq 1ab
// 164: goto 171
// 167: ldc2_w -6005043199846158191
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: aload 44
// 173: checkcast java/util/Collection
// 176: iload 41
// 178: ifeq 1ad
// 17b: goto 188
// 17e: ldc2_w -6005043199846158191
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: invokeinterface java/util/Collection.isEmpty ()Z 1
// 18d: ifeq 1ab
// 190: goto 19d
// 193: ldc2_w -6005043199846158191
// 196: lload 1
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: bipush 1
// 19e: goto 1ee
// 1a1: ldc2_w -6005043199846158191
// 1a4: lload 1
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: aload 44
// 1ad: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1b2: astore 46
// 1b4: aload 46
// 1b6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1bb: ifeq 1ed
// 1be: aload 46
// 1c0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1c5: astore 47
// 1c7: aload 47
// 1c9: checkcast su/catlean/ms
// 1cc: astore 48
// 1ce: bipush 0
// 1cf: istore 49
// 1d1: aload 48
// 1d3: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 1d6: aload 43
// 1d8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1db: ifeq 1b4
// 1de: bipush 0
// 1df: lload 1
// 1e0: lconst_0
// 1e1: lcmp
// 1e2: iflt 1db
// 1e5: iload 41
// 1e7: ifeq 1db
// 1ea: goto 1ee
// 1ed: bipush 1
// 1ee: ifeq 10d
// 1f1: getstatic su/catlean/ph.g Ljava/util/List;
// 1f4: new su/catlean/ms
// 1f7: dup
// 1f8: aload 43
// 1fa: aconst_null
// 1fb: bipush 0
// 1fc: lload 16
// 1fe: sipush 16736
// 201: ldc2_w 8136383155092831794
// 204: lload 1
// 205: lxor
// 206: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: aconst_null
// 20c: iload 18
// 20e: i2b
// 20f: invokespecial su/catlean/ms.<init> (Lnet/minecraft/class_1293;Lsu/catlean/fd;ZJILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 212: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 217: pop
// 218: iload 41
// 21a: ifne 10d
// 21d: getstatic su/catlean/ph.g Ljava/util/List;
// 220: lload 1
// 221: lconst_0
// 222: lcmp
// 223: iflt 12f
// 226: checkcast java/lang/Iterable
// 229: astore 42
// 22b: bipush 0
// 22c: istore 43
// 22e: aload 42
// 230: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 235: astore 44
// 237: aload 44
// 239: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23e: ifeq 347
// 241: aload 44
// 243: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 248: astore 45
// 24a: aload 45
// 24c: checkcast su/catlean/ms
// 24f: astore 46
// 251: bipush 0
// 252: istore 47
// 254: lload 19
// 256: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 259: invokevirtual net/minecraft/class_746.method_6026 ()Ljava/util/Collection;
// 25c: dup
// 25d: sipush 30580
// 260: ldc2_w 5014644848733611678
// 263: lload 1
// 264: lxor
// 265: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26d: checkcast java/lang/Iterable
// 270: astore 48
// 272: bipush 0
// 273: istore 49
// 275: aload 48
// 277: iload 41
// 279: ifeq 2e3
// 27c: instanceof java/util/Collection
// 27f: lload 1
// 280: lconst_0
// 281: lcmp
// 282: iflt 364
// 285: iload 41
// 287: ifeq 360
// 28a: goto 297
// 28d: ldc2_w -6005043199846158191
// 290: lload 1
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: ifeq 2e1
// 29a: goto 2a7
// 29d: ldc2_w -6005043199846158191
// 2a0: lload 1
// 2a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: athrow
// 2a7: aload 48
// 2a9: checkcast java/util/Collection
// 2ac: iload 41
// 2ae: ifeq 2e3
// 2b1: goto 2be
// 2b4: ldc2_w -6005043199846158191
// 2b7: lload 1
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: invokeinterface java/util/Collection.isEmpty ()Z 1
// 2c3: ifeq 2e1
// 2c6: goto 2d3
// 2c9: ldc2_w -6005043199846158191
// 2cc: lload 1
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: bipush 1
// 2d4: goto 324
// 2d7: ldc2_w -6005043199846158191
// 2da: lload 1
// 2db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e0: athrow
// 2e1: aload 48
// 2e3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2e8: astore 50
// 2ea: aload 50
// 2ec: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2f1: ifeq 323
// 2f4: aload 50
// 2f6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2fb: astore 51
// 2fd: aload 51
// 2ff: checkcast net/minecraft/class_1293
// 302: astore 52
// 304: bipush 0
// 305: istore 53
// 307: aload 46
// 309: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 30c: aload 52
// 30e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 311: ifeq 2ea
// 314: bipush 0
// 315: lload 1
// 316: lconst_0
// 317: lcmp
// 318: iflt 311
// 31b: iload 41
// 31d: ifeq 311
// 320: goto 324
// 323: bipush 1
// 324: lload 1
// 325: lconst_0
// 326: lcmp
// 327: iflt 344
// 32a: ifeq 340
// 32d: aload 46
// 32f: bipush 1
// 330: invokevirtual su/catlean/ms.v (Z)V
// 333: goto 340
// 336: ldc2_w -6005043199846158191
// 339: lload 1
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: nop
// 341: nop
// 342: iload 41
// 344: ifne 237
// 347: nop
// 348: getstatic su/catlean/ph.g Ljava/util/List;
// 34b: lload 1
// 34c: lconst_0
// 34d: lcmp
// 34e: ifle 248
// 351: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ph.K (Lsu/catlean/ms;)Z, (Lsu/catlean/ms;)Ljava/lang/Boolean; ]
// 356: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/ph.w (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 35b: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 360: pop
// 361: sipush 10979
// 364: ldc2_w 6764489083003910920
// 367: lload 1
// 368: lxor
// 369: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36e: astore 42
// 370: aload 0
// 371: lload 37
// 373: invokevirtual su/catlean/ph.p (J)F
// 376: aload 0
// 377: lload 21
// 379: invokevirtual su/catlean/ph.r (J)I
// 37c: i2f
// 37d: fconst_2
// 37e: fdiv
// 37f: fcmpl
// 380: iload 41
// 382: ifeq 396
// 385: ifle 399
// 388: goto 395
// 38b: ldc2_w -6005043199846158191
// 38e: lload 1
// 38f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: athrow
// 395: bipush 1
// 396: goto 39a
// 399: bipush 0
// 39a: istore 43
// 39c: getstatic su/catlean/ph.l Lsu/catlean/fd;
// 39f: getstatic su/catlean/ph.g Ljava/util/List;
// 3a2: invokeinterface java/util/List.isEmpty ()Z 1
// 3a7: iload 41
// 3a9: lload 1
// 3aa: lconst_0
// 3ab: lcmp
// 3ac: iflt 3e2
// 3af: ifeq 3da
// 3b2: ifeq 41e
// 3b5: goto 3c2
// 3b8: ldc2_w -6005043199846158191
// 3bb: lload 1
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: lload 4
// 3c4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3c7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 3ca: instanceof net/minecraft/class_408
// 3cd: goto 3da
// 3d0: ldc2_w -6005043199846158191
// 3d3: lload 1
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: lload 1
// 3db: lconst_0
// 3dc: lcmp
// 3dd: iflt 40d
// 3e0: iload 41
// 3e2: ifeq 40d
// 3e5: ifne 41e
// 3e8: goto 3f5
// 3eb: ldc2_w -6005043199846158191
// 3ee: lload 1
// 3ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: athrow
// 3f5: lload 4
// 3f7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3fa: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 3fd: instanceof su/catlean/rl
// 400: goto 40d
// 403: ldc2_w -6005043199846158191
// 406: lload 1
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: ifne 41e
// 410: fconst_0
// 411: goto 41f
// 414: ldc2_w -6005043199846158191
// 417: lload 1
// 418: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41d: athrow
// 41e: fconst_1
// 41f: lload 8
// 421: dup2_x1
// 422: pop2
// 423: invokevirtual su/catlean/fd.B (JF)V
// 426: aload 0
// 427: aload 3
// 428: aload 42
// 42a: getstatic su/catlean/ph.l Lsu/catlean/fd;
// 42d: invokevirtual su/catlean/fd.a ()F
// 430: iload 43
// 432: lload 23
// 434: invokevirtual su/catlean/ph.q (Lnet/minecraft/class_332;Ljava/lang/String;FZJ)V
// 437: ldc 17.0
// 439: fstore 44
// 43b: lload 35
// 43d: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 440: lload 33
// 442: aload 42
// 444: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 447: ldc 24.0
// 449: fadd
// 44a: fstore 45
// 44c: getstatic su/catlean/ph.g Ljava/util/List;
// 44f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 454: astore 46
// 456: aload 46
// 458: invokeinterface java/util/Iterator.hasNext ()Z 1
// 45d: ifeq 563
// 460: aload 46
// 462: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 467: checkcast su/catlean/ms
// 46a: astore 47
// 46c: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 46f: aload 47
// 471: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 474: invokevirtual net/minecraft/class_1293.method_5586 ()Ljava/lang/String;
// 477: dup
// 478: sipush 3212
// 47b: ldc2_w 7195171897135373665
// 47e: lload 1
// 47f: lxor
// 480: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 485: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 488: bipush 0
// 489: anewarray 636
// 48c: astore 39
// 48e: astore 40
// 490: iload 10
// 492: aload 40
// 494: iload 11
// 496: aload 39
// 498: iload 12
// 49a: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 49d: aload 47
// 49f: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 4a2: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 4a5: iload 41
// 4a7: lload 1
// 4a8: lconst_0
// 4a9: lcmp
// 4aa: ifle 5c9
// 4ad: ifeq 5c7
// 4b0: iload 41
// 4b2: ifeq 4e9
// 4b5: goto 4c2
// 4b8: ldc2_w -6005043199846158191
// 4bb: lload 1
// 4bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c1: athrow
// 4c2: ifle 4f1
// 4c5: goto 4d2
// 4c8: ldc2_w -6005043199846158191
// 4cb: lload 1
// 4cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: athrow
// 4d2: aload 47
// 4d4: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 4d7: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 4da: bipush 1
// 4db: iadd
// 4dc: goto 4e9
// 4df: ldc2_w -6005043199846158191
// 4e2: lload 1
// 4e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e8: athrow
// 4e9: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ " \u0001" ]
// 4ee: goto 4f3
// 4f1: ldc ""
// 4f3: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 4f8: astore 48
// 4fa: lload 35
// 4fc: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 4ff: lload 33
// 501: aload 48
// 503: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 506: fstore 49
// 508: lload 35
// 50a: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 50d: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 510: aload 47
// 512: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 515: iload 28
// 517: iload 29
// 519: i2b
// 51a: iload 30
// 51c: invokevirtual su/catlean/ko.Z (Lnet/minecraft/class_1293;IBI)Ljava/lang/String;
// 51f: lload 33
// 521: dup2_x1
// 522: pop2
// 523: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 526: fstore 50
// 528: fload 49
// 52a: fload 50
// 52c: fadd
// 52d: ldc 27.0
// 52f: fadd
// 530: lload 1
// 531: lconst_0
// 532: lcmp
// 533: ifle 55c
// 536: fload 45
// 538: iload 41
// 53a: ifeq 55b
// 53d: fcmpl
// 53e: lload 1
// 53f: lconst_0
// 540: lcmp
// 541: ifle 45d
// 544: ifle 456
// 547: goto 554
// 54a: ldc2_w -6005043199846158191
// 54d: lload 1
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: fload 49
// 556: fload 50
// 558: fadd
// 559: ldc 27.0
// 55b: fadd
// 55c: fstore 45
// 55e: iload 41
// 560: ifne 456
// 563: getstatic su/catlean/ph.g Ljava/util/List;
// 566: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 56b: lload 1
// 56c: lconst_0
// 56d: lcmp
// 56e: iflt 467
// 571: astore 46
// 573: aload 46
// 575: invokeinterface java/util/Iterator.hasNext ()Z 1
// 57a: ifeq 95d
// 57d: aload 46
// 57f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 584: checkcast su/catlean/ms
// 587: astore 47
// 589: iload 41
// 58b: ifeq 96d
// 58e: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 591: aload 47
// 593: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 596: invokevirtual net/minecraft/class_1293.method_5586 ()Ljava/lang/String;
// 599: dup
// 59a: sipush 32671
// 59d: ldc2_w 1401840501187079799
// 5a0: lload 1
// 5a1: lxor
// 5a2: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5aa: bipush 0
// 5ab: anewarray 636
// 5ae: astore 39
// 5b0: astore 40
// 5b2: iload 10
// 5b4: aload 40
// 5b6: iload 11
// 5b8: aload 39
// 5ba: iload 12
// 5bc: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 5bf: aload 47
// 5c1: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 5c4: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 5c7: iload 41
// 5c9: ifeq 5f3
// 5cc: ifle 5fb
// 5cf: goto 5dc
// 5d2: ldc2_w -6005043199846158191
// 5d5: lload 1
// 5d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5db: athrow
// 5dc: aload 47
// 5de: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 5e1: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 5e4: bipush 1
// 5e5: iadd
// 5e6: goto 5f3
// 5e9: ldc2_w -6005043199846158191
// 5ec: lload 1
// 5ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f2: athrow
// 5f3: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ " \u0001" ]
// 5f8: goto 5fd
// 5fb: ldc ""
// 5fd: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 602: astore 48
// 604: lload 35
// 606: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 609: lload 33
// 60b: aload 48
// 60d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 610: fstore 49
// 612: lload 35
// 614: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 617: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 61a: aload 47
// 61c: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 61f: iload 28
// 621: iload 29
// 623: i2b
// 624: iload 30
// 626: invokevirtual su/catlean/ko.Z (Lnet/minecraft/class_1293;IBI)Ljava/lang/String;
// 629: lload 33
// 62b: dup2_x1
// 62c: pop2
// 62d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 630: fstore 50
// 632: aload 47
// 634: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 637: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 63a: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 63f: checkcast net/minecraft/class_1291
// 642: invokevirtual net/minecraft/class_1291.method_18792 ()Lnet/minecraft/class_4081;
// 645: getstatic net/minecraft/class_4081.field_18272 Lnet/minecraft/class_4081;
// 648: if_acmpne 659
// 64b: bipush 1
// 64c: goto 65a
// 64f: ldc2_w -6005043199846158191
// 652: lload 1
// 653: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 658: athrow
// 659: bipush 0
// 65a: istore 51
// 65c: iload 43
// 65e: ifeq 69a
// 661: aload 0
// 662: lload 37
// 664: invokevirtual su/catlean/ph.p (J)F
// 667: fconst_1
// 668: aload 47
// 66a: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 66d: invokevirtual su/catlean/fd.a ()F
// 670: fsub
// 671: sipush 5462
// 674: ldc2_w 2315130066377075207
// 677: lload 1
// 678: lxor
// 679: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67e: i2f
// 67f: fmul
// 680: fsub
// 681: fload 49
// 683: fload 50
// 685: fadd
// 686: ldc 27.0
// 688: fadd
// 689: fload 45
// 68b: fsub
// 68c: fsub
// 68d: goto 6ba
// 690: ldc2_w -6005043199846158191
// 693: lload 1
// 694: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 699: athrow
// 69a: aload 0
// 69b: lload 37
// 69d: invokevirtual su/catlean/ph.p (J)F
// 6a0: fconst_1
// 6a1: aload 47
// 6a3: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 6a6: invokevirtual su/catlean/fd.a ()F
// 6a9: fsub
// 6aa: sipush 19607
// 6ad: ldc2_w 3039986938349204417
// 6b0: lload 1
// 6b1: lxor
// 6b2: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b7: i2f
// 6b8: fmul
// 6b9: fsub
// 6ba: fstore 52
// 6bc: fconst_1
// 6bd: fstore 53
// 6bf: lload 1
// 6c0: lconst_0
// 6c1: lcmp
// 6c2: iflt 803
// 6c5: iload 41
// 6c7: ifeq 803
// 6ca: aload 47
// 6cc: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 6cf: sipush 21538
// 6d2: ldc2_w 7931666461634833269
// 6d5: lload 1
// 6d6: lxor
// 6d7: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6dc: invokevirtual net/minecraft/class_1293.method_48557 (I)Z
// 6df: ifeq 704
// 6e2: goto 6ef
// 6e5: ldc2_w -6005043199846158191
// 6e8: lload 1
// 6e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ee: athrow
// 6ef: fconst_1
// 6f0: aload 47
// 6f2: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 6f5: invokevirtual net/minecraft/class_1293.method_5584 ()I
// 6f8: i2f
// 6f9: f2d
// 6fa: invokestatic java/lang/Math.sin (D)D
// 6fd: d2f
// 6fe: ldc 0.5
// 700: fmul
// 701: fsub
// 702: fstore 53
// 704: aload 0
// 705: checkcast su/catlean/gf
// 708: aload 3
// 709: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 70c: dup
// 70d: sipush 18447
// 710: ldc2_w 5095521811162323435
// 713: lload 1
// 714: lxor
// 715: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 71d: fload 52
// 71f: aload 0
// 720: lload 6
// 722: invokevirtual su/catlean/ph.V (J)F
// 725: fload 44
// 727: fadd
// 728: iload 25
// 72a: i2s
// 72b: swap
// 72c: iload 26
// 72e: swap
// 72f: ldc 13.0
// 731: ldc 13.0
// 733: aload 47
// 735: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 738: invokevirtual su/catlean/fd.a ()F
// 73b: iload 27
// 73d: i2s
// 73e: swap
// 73f: bipush 0
// 740: sipush 17981
// 743: ldc2_w 6892482574266743144
// 746: lload 1
// 747: lxor
// 748: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74d: aconst_null
// 74e: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 751: aload 0
// 752: checkcast su/catlean/gf
// 755: aload 3
// 756: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 759: dup
// 75a: sipush 21048
// 75d: ldc2_w 8885170957193790423
// 760: lload 1
// 761: lxor
// 762: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 767: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 76a: fload 52
// 76c: ldc 14.0
// 76e: fadd
// 76f: aload 0
// 770: lload 6
// 772: invokevirtual su/catlean/ph.V (J)F
// 775: fload 44
// 777: fadd
// 778: iload 25
// 77a: i2s
// 77b: swap
// 77c: iload 26
// 77e: swap
// 77f: fload 49
// 781: ldc 6.0
// 783: fadd
// 784: ldc 13.0
// 786: aload 47
// 788: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 78b: invokevirtual su/catlean/fd.a ()F
// 78e: iload 27
// 790: i2s
// 791: swap
// 792: bipush 0
// 793: sipush 22289
// 796: ldc2_w 4686371474919565378
// 799: lload 1
// 79a: lxor
// 79b: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a0: aconst_null
// 7a1: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 7a4: aload 0
// 7a5: checkcast su/catlean/gf
// 7a8: aload 3
// 7a9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7ac: dup
// 7ad: sipush 21048
// 7b0: ldc2_w 8885170957193790423
// 7b3: lload 1
// 7b4: lxor
// 7b5: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7bd: fload 52
// 7bf: fload 49
// 7c1: ldc 21.0
// 7c3: fadd
// 7c4: aload 47
// 7c6: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 7c9: invokevirtual su/catlean/fd.a ()F
// 7cc: fmul
// 7cd: fadd
// 7ce: aload 0
// 7cf: lload 6
// 7d1: invokevirtual su/catlean/ph.V (J)F
// 7d4: fload 44
// 7d6: fadd
// 7d7: iload 25
// 7d9: i2s
// 7da: swap
// 7db: iload 26
// 7dd: swap
// 7de: fload 50
// 7e0: ldc 6.0
// 7e2: fadd
// 7e3: ldc 13.0
// 7e5: aload 47
// 7e7: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 7ea: invokevirtual su/catlean/fd.a ()F
// 7ed: iload 27
// 7ef: i2s
// 7f0: swap
// 7f1: bipush 0
// 7f2: sipush 22289
// 7f5: ldc2_w 4686371474919565378
// 7f8: lload 1
// 7f9: lxor
// 7fa: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ff: aconst_null
// 800: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 803: aload 0
// 804: aload 3
// 805: aload 48
// 807: fload 52
// 809: ldc 17.0
// 80b: fadd
// 80c: aload 0
// 80d: lload 6
// 80f: invokevirtual su/catlean/ph.V (J)F
// 812: fload 44
// 814: fadd
// 815: fconst_1
// 816: fadd
// 817: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 81a: iload 51
// 81c: ifeq 82f
// 81f: getstatic java/awt/Color.RED Ljava/awt/Color;
// 822: goto 835
// 825: ldc2_w -6005043199846158191
// 828: lload 1
// 829: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82e: athrow
// 82f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 832: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 835: astore 54
// 837: aload 54
// 839: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 83c: aload 54
// 83e: aload 47
// 840: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 843: invokevirtual su/catlean/fd.a ()F
// 846: fload 53
// 848: fmul
// 849: iload 13
// 84b: i2c
// 84c: swap
// 84d: iload 14
// 84f: swap
// 850: iload 15
// 852: i2s
// 853: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 856: lload 31
// 858: dup2_x2
// 859: pop2
// 85a: invokevirtual su/catlean/ph.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 85d: aload 0
// 85e: aload 3
// 85f: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 862: aload 47
// 864: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 867: iload 28
// 869: iload 29
// 86b: i2b
// 86c: iload 30
// 86e: invokevirtual su/catlean/ko.Z (Lnet/minecraft/class_1293;IBI)Ljava/lang/String;
// 871: fload 52
// 873: fload 49
// 875: ldc 24.0
// 877: fadd
// 878: aload 47
// 87a: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 87d: invokevirtual su/catlean/fd.a ()F
// 880: fmul
// 881: fadd
// 882: aload 0
// 883: lload 6
// 885: invokevirtual su/catlean/ph.V (J)F
// 888: fload 44
// 88a: fadd
// 88b: fconst_1
// 88c: fadd
// 88d: lload 31
// 88f: dup2_x1
// 890: pop2
// 891: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 894: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 897: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 89a: aload 47
// 89c: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 89f: invokevirtual su/catlean/fd.a ()F
// 8a2: fload 53
// 8a4: fmul
// 8a5: iload 13
// 8a7: i2c
// 8a8: swap
// 8a9: iload 14
// 8ab: swap
// 8ac: iload 15
// 8ae: i2s
// 8af: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 8b2: invokevirtual su/catlean/ph.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 8b5: aload 3
// 8b6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8b9: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 8bc: pop
// 8bd: aload 3
// 8be: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8c1: fload 52
// 8c3: bipush 2
// 8c4: i2f
// 8c5: fadd
// 8c6: aload 0
// 8c7: lload 6
// 8c9: invokevirtual su/catlean/ph.V (J)F
// 8cc: fload 44
// 8ce: fadd
// 8cf: bipush 2
// 8d0: i2f
// 8d1: fadd
// 8d2: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 8d5: pop
// 8d6: aload 3
// 8d7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8da: ldc 0.55
// 8dc: invokevirtual org/joml/Matrix3x2fStack.scale (F)Lorg/joml/Matrix3x2f;
// 8df: pop
// 8e0: aload 3
// 8e1: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 8e4: aload 47
// 8e6: invokevirtual su/catlean/ms.a ()Lnet/minecraft/class_1293;
// 8e9: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 8ec: invokestatic net/minecraft/class_329.method_71644 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_2960;
// 8ef: bipush 0
// 8f0: bipush 0
// 8f1: sipush 24468
// 8f4: ldc2_w 2518701789480558788
// 8f7: lload 1
// 8f8: lxor
// 8f9: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8fe: sipush 28794
// 901: ldc2_w 3750750081379340078
// 904: lload 1
// 905: lxor
// 906: invokedynamic l (IJ)I bsm=su/catlean/ph.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 90e: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 911: dup
// 912: sipush 21803
// 915: ldc2_w 6290889179257849029
// 918: lload 1
// 919: lxor
// 91a: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 922: aload 47
// 924: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 927: invokevirtual su/catlean/fd.a ()F
// 92a: fload 53
// 92c: fmul
// 92d: iload 13
// 92f: i2c
// 930: swap
// 931: iload 14
// 933: swap
// 934: iload 15
// 936: i2s
// 937: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 93a: invokevirtual java/awt/Color.getRGB ()I
// 93d: invokevirtual net/minecraft/class_332.method_52707 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIIII)V
// 940: aload 3
// 941: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 944: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 947: pop
// 948: fload 44
// 94a: ldc 14.0
// 94c: aload 47
// 94e: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 951: invokevirtual su/catlean/fd.a ()F
// 954: fmul
// 955: fadd
// 956: fstore 44
// 958: iload 41
// 95a: ifne 573
// 95d: aload 0
// 95e: fload 45
// 960: fload 44
// 962: fconst_2
// 963: fsub
// 964: invokevirtual su/catlean/ph.X (FF)V
// 967: lload 1
// 968: lconst_0
// 969: lcmp
// 96a: iflt 96d
// 96d: return
}

private static final boolean K(ms param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ph.a J
// 03: ldc2_w 96982718088498
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 48585664354549
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w 5436274368788828864
// 13: lload 1
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 25387
// 1d: ldc2_w 1972908249150756196
// 20: lload 1
// 21: lxor
// 22: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ph.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: istore 5
// 2c: aload 0
// 2d: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 30: aload 0
// 31: invokevirtual su/catlean/ms.C ()Z
// 34: ifeq 45
// 37: fconst_0
// 38: goto 46
// 3b: ldc2_w 5405352013093312315
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: lload 3
// 47: dup2_x1
// 48: pop2
// 49: invokevirtual su/catlean/fd.B (JF)V
// 4c: aload 0
// 4d: invokevirtual su/catlean/ms.C ()Z
// 50: iload 5
// 52: ifne 7b
// 55: ifeq 94
// 58: goto 65
// 5b: ldc2_w 5405352013093312315
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: aload 0
// 66: invokevirtual su/catlean/ms.x ()Lsu/catlean/fd;
// 69: invokevirtual su/catlean/fd.a ()F
// 6c: fconst_0
// 6d: fcmpg
// 6e: goto 7b
// 71: ldc2_w 5405352013093312315
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: iload 5
// 7d: ifne 91
// 80: ifgt 94
// 83: goto 90
// 86: ldc2_w 5405352013093312315
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 1
// 91: goto 95
// 94: bipush 0
// 95: ireturn
}

private static final boolean w(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var27 = a ^ 3815587722065L;
int var29 = (int)((var27 ^ 88469613018005L) >>> 32);
long var30 = (var27 ^ 88469613018005L) << 32 >>> 32;
long var32 = var27 ^ 27895858126694L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[11];
int var23 = 0;
String var22 = "ºÔæ\u008e¶LíJîÍ¸ÏÖþ±QÍÎ£;\u0086QÄ¤(\fJ6æR±Ôýß3;Ø\u0001\nqi§\u001f\\cA\u0016»·HÏ<P\u0001uð\u0000n\t¤àßÔ\f³\u0010}\u000bê[þ\u001a\u001b\u0097ÀÞæW2\u007f\u0082Ö  7\u008aèNáPF\rÒ~Ë!\u009aø/-ÖxÔÚ=±\u001b ·\u0091XEù7\u0001(\u009düT\u008a¯DRä\tn½ùpð\u008bÿä\u001e\u0000æÉÜê\u0092ÅÂ_«crÎòdÈÏ\u0015D|\u00038\u0010\u008aÄJú\u0093l\u0015rÙÿY\nê\n½\u00160\u0011s[Ô2.\u008f*Ïd-'\u0088°\u001a®Ï\u00ad1\"ôjIõ\u00974ròjÕC\u0013ÈKY6¿\u0010\u009b$ømÀ=Ä(\u0007\u0096\u0010'¬+ü°õt\u0018hy\u0010òîk\u0011d\u0018Ä\u0090a\u0011·\u0006ðp;_\u0005Ô\u0085\u0097É\u0094í\u0084\u0015\u009aD c\u0015";
int var24 = "ºÔæ\u008e¶LíJîÍ¸ÏÖþ±QÍÎ£;\u0086QÄ¤(\fJ6æR±Ôýß3;Ø\u0001\nqi§\u001f\\cA\u0016»·HÏ<P\u0001uð\u0000n\t¤àßÔ\f³\u0010}\u000bê[þ\u001a\u001b\u0097ÀÞæW2\u007f\u0082Ö  7\u008aèNáPF\rÒ~Ë!\u009aø/-ÖxÔÚ=±\u001b ·\u0091XEù7\u0001(\u009düT\u008a¯DRä\tn½ùpð\u008bÿä\u001e\u0000æÉÜê\u0092ÅÂ_«crÎòdÈÏ\u0015D|\u00038\u0010\u008aÄJú\u0093l\u0015rÙÿY\nê\n½\u00160\u0011s[Ô2.\u008f*Ïd-'\u0088°\u001a®Ï\u00ad1\"ôjIõ\u00974ròjÕC\u0013ÈKY6¿\u0010\u009b$ømÀ=Ä(\u0007\u0096\u0010'¬+ü°õt\u0018hy\u0010òîk\u0011d\u0018Ä\u0090a\u0011·\u0006ðp;_\u0005Ô\u0085\u0097É\u0094í\u0084\u0015\u009aD c\u0015"
.length();
char var21 = 24;
int var36 = -1;

label64:
while (true) {
String var37 = var22.substring(++var36, var36 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var37.getBytes("ISO-8859-1"));
String var50 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var50;
if ((var36 += var21) >= var24) {
b = var25;
c = new String[11];
k = new HashMap(13);
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
String var11 = "\u0019Ü\u0085~¾\u009a\u001f\u0012/Äöc\u009cè\fÒ7f3ö!ìÖ4¡\nºÑ\u0085\u001dÁý\u0017f\u008d\u0007ãä¡vm\u0002Þæ\u0091KLá";
int var12 = "\u0019Ü\u0085~¾\u009a\u001f\u0012/Äöc\u009cè\fÒ7f3ö!ìÖ4¡\nºÑ\u0085\u001dÁý\u0017f\u008d\u0007ãä¡vm\u0002Þæ\u0091KLá".length();
byte var9 = 0;

label46:
while (true) {
var10001 = var9;
var9 += 8;
byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
long[] var40 = var13;
var10001 = var10++;
long var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var59 = -1;

while (true) {
long var15 = var54;
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
long var62 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var59) {
case 0:
var40[var10001] = var62;
if (var9 >= var12) {
h = var13;
i = new Integer[8];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 6564459770667983389L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var57 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var48 = -1;
long var0 = var57;
H = new ph(var29, var30);
g = new ArrayList();
l = new fd(_s.OUT_BACK, var0, var32);
return;
}
break;
default:
var40[var10001] = var62;
if (var9 < var12) {
continue label46;
}

var11 = "\u001f\u0095Ñ>æ\u007fÇ\u001b\u0018\rqÙ»`ò·";
var12 = "\u001f\u0095Ñ>æ\u007fÇ\u001b\u0018\rqÙ»`ò·".length();
var9 = 0;
}

byte var47 = var9;
var9 += 8;
var14 = var11.substring(var47, var9).getBytes("ISO-8859-1");
var40 = var13;
var10001 = var10++;
var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var59 = 0;
}
}
}

var21 = var22.charAt(var36);
break;
default:
var25[var23++] = var50;
if ((var36 += var21) < var24) {
var21 = var22.charAt(var36);
continue label64;
}

var22 = "6X*.¬\u0088>\u0019\u0012Ì\u0001\u008cøv\u0018ï\u0018D\u0004úÌEe±\u0003\u009fß\u009a\u0018c\u000f#e\u0017\u001e^Ù±\r\u0082\u009d";
var24 = "6X*.¬\u0088>\u0019\u0012Ì\u0001\u008cøv\u0018ï\u0018D\u0004úÌEe±\u0003\u009fß\u009a\u0018c\u000f#e\u0017\u001e^Ù±\r\u0082\u009d".length();
var21 = 16;
var36 = -1;
}

var37 = var22.substring(++var36, var36 + var21);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15495;
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
throw new RuntimeException("su/catlean/ph", var10);
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
throw new RuntimeException("su/catlean/ph" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21050;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ph", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/ph" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
