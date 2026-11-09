package su.catlean;

import java.awt.Color;
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
import org.jetbrains.annotations.NotNull;

public final class j_ {
@NotNull
public static final j_ N;
private static final long a = yz.a(-8706407952680489308L, 4127609483980001596L, MethodHandles.lookup().lookupClass()).a(100345552919754L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private j_() {
}

public final void g(@NotNull s8 mode, @NotNull Color fillColor, @NotNull Color lineColor, int vDistance, long a, int hDistance) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/j_.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 128476682296508
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 120453088953386
// 015: lxor
// 016: lstore 10
// 018: dup2
// 019: ldc2_w 57064753271921
// 01c: lxor
// 01d: lstore 12
// 01f: dup2
// 020: ldc2_w 95020927003709
// 023: lxor
// 024: lstore 14
// 026: dup2
// 027: ldc2_w 38006535472189
// 02a: lxor
// 02b: lstore 16
// 02d: dup2
// 02e: ldc2_w 92894886400666
// 031: lxor
// 032: lstore 18
// 034: pop2
// 035: ldc2_w 4660566930883703865
// 038: lload 5
// 03a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: aload 1
// 040: sipush 1632
// 043: ldc2_w 2609385603952970126
// 046: lload 5
// 048: lxor
// 049: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 051: aload 2
// 052: sipush 27979
// 055: ldc2_w 4365652786050130612
// 058: lload 5
// 05a: lxor
// 05b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 063: istore 25
// 065: aload 3
// 066: sipush 10164
// 069: ldc2_w 699066314268944451
// 06c: lload 5
// 06e: lxor
// 06f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 077: lload 8
// 079: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 07c: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 07f: iload 25
// 081: ifeq 0c6
// 084: dup
// 085: ifnull 0af
// 088: goto 096
// 08b: ldc2_w 4621634249128352616
// 08e: lload 5
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: lload 10
// 098: dup2_x1
// 099: pop2
// 09a: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 09d: dup
// 09e: ifnonnull 0cd
// 0a1: goto 0af
// 0a4: ldc2_w 4621634249128352616
// 0a7: lload 5
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: pop
// 0b0: lload 18
// 0b2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b5: checkcast net/minecraft/class_1297
// 0b8: goto 0c6
// 0bb: ldc2_w 4621634249128352616
// 0be: lload 5
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: lload 10
// 0c8: dup2_x1
// 0c9: pop2
// 0ca: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0cd: astore 26
// 0cf: lload 14
// 0d1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d4: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 0d7: dup
// 0d8: sipush 7770
// 0db: ldc2_w 3746939331504902568
// 0de: lload 5
// 0e0: lxor
// 0e1: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e9: astore 27
// 0eb: bipush 0
// 0ec: istore 28
// 0ee: aload 27
// 0f0: astore 29
// 0f2: new java/util/ArrayList
// 0f5: dup
// 0f6: invokespecial java/util/ArrayList.<init> ()V
// 0f9: checkcast java/util/Collection
// 0fc: astore 30
// 0fe: bipush 0
// 0ff: istore 31
// 101: aload 29
// 103: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 108: astore 32
// 10a: aload 32
// 10c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 111: ifeq 161
// 114: aload 32
// 116: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11b: astore 33
// 11d: lload 5
// 11f: lconst_0
// 120: lcmp
// 121: ifle 18a
// 124: aload 33
// 126: instanceof net/minecraft/class_1511
// 129: iload 25
// 12b: ifeq 188
// 12e: iload 25
// 130: ifeq 15b
// 133: goto 141
// 136: ldc2_w 4621634249128352616
// 139: lload 5
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: ifeq 10a
// 144: goto 152
// 147: ldc2_w 4621634249128352616
// 14a: lload 5
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: aload 30
// 154: aload 33
// 156: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 15b: pop
// 15c: iload 25
// 15e: ifne 10a
// 161: aload 30
// 163: checkcast java/util/List
// 166: nop
// 167: checkcast java/lang/Iterable
// 16a: astore 27
// 16c: nop
// 16d: bipush 0
// 16e: istore 28
// 170: aload 27
// 172: astore 29
// 174: new java/util/ArrayList
// 177: dup
// 178: invokespecial java/util/ArrayList.<init> ()V
// 17b: checkcast java/util/Collection
// 17e: astore 30
// 180: lload 5
// 182: lconst_0
// 183: lcmp
// 184: iflt 18a
// 187: bipush 0
// 188: istore 31
// 18a: aload 29
// 18c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 191: astore 32
// 193: aload 32
// 195: invokeinterface java/util/Iterator.hasNext ()Z 1
// 19a: ifeq 251
// 19d: aload 32
// 19f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1a4: astore 33
// 1a6: aload 33
// 1a8: checkcast net/minecraft/class_1511
// 1ab: astore 34
// 1ad: bipush 0
// 1ae: istore 35
// 1b0: lload 5
// 1b2: lconst_0
// 1b3: lcmp
// 1b4: iflt 267
// 1b7: aload 26
// 1b9: getfield net/minecraft/class_243.field_1352 D
// 1bc: aload 34
// 1be: invokevirtual net/minecraft/class_1511.method_23317 ()D
// 1c1: dsub
// 1c2: aload 26
// 1c4: getfield net/minecraft/class_243.field_1350 D
// 1c7: aload 34
// 1c9: invokevirtual net/minecraft/class_1511.method_23321 ()D
// 1cc: dsub
// 1cd: invokestatic java/lang/Math.hypot (DD)D
// 1d0: iload 7
// 1d2: i2d
// 1d3: dcmpg
// 1d4: iload 25
// 1d6: ifeq 265
// 1d9: iload 25
// 1db: lload 5
// 1dd: lconst_0
// 1de: lcmp
// 1df: ifle 226
// 1e2: ifeq 224
// 1e5: goto 1f3
// 1e8: ldc2_w 4621634249128352616
// 1eb: lload 5
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: ifge 23e
// 1f6: goto 204
// 1f9: ldc2_w 4621634249128352616
// 1fc: lload 5
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: aload 26
// 206: getfield net/minecraft/class_243.field_1351 D
// 209: aload 34
// 20b: invokevirtual net/minecraft/class_1511.method_23318 ()D
// 20e: dsub
// 20f: invokestatic java/lang/Math.abs (D)D
// 212: iload 4
// 214: i2d
// 215: dcmpg
// 216: goto 224
// 219: ldc2_w 4621634249128352616
// 21c: lload 5
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: iload 25
// 226: ifeq 23b
// 229: ifge 23e
// 22c: goto 23a
// 22f: ldc2_w 4621634249128352616
// 232: lload 5
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: bipush 1
// 23b: goto 23f
// 23e: bipush 0
// 23f: ifeq 193
// 242: aload 30
// 244: aload 33
// 246: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 24b: pop
// 24c: iload 25
// 24e: ifne 193
// 251: aload 30
// 253: checkcast java/util/List
// 256: nop
// 257: checkcast java/lang/Iterable
// 25a: astore 27
// 25c: nop
// 25d: lload 5
// 25f: lconst_0
// 260: lcmp
// 261: ifle 267
// 264: bipush 0
// 265: istore 28
// 267: aload 27
// 269: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 26e: astore 29
// 270: aload 29
// 272: invokeinterface java/util/Iterator.hasNext ()Z 1
// 277: ifeq 397
// 27a: aload 29
// 27c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 281: astore 30
// 283: aload 30
// 285: checkcast net/minecraft/class_1511
// 288: astore 31
// 28a: bipush 0
// 28b: istore 32
// 28d: lload 5
// 28f: lconst_0
// 290: lcmp
// 291: iflt 39f
// 294: iload 25
// 296: ifeq 39f
// 299: aload 1
// 29a: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 29d: iload 25
// 29f: lload 5
// 2a1: lconst_0
// 2a2: lcmp
// 2a3: iflt 2dc
// 2a6: ifeq 2da
// 2a9: goto 2b7
// 2ac: ldc2_w 4621634249128352616
// 2af: lload 5
// 2b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b6: athrow
// 2b7: if_acmpeq 2f7
// 2ba: goto 2c8
// 2bd: ldc2_w 4621634249128352616
// 2c0: lload 5
// 2c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: athrow
// 2c8: aload 1
// 2c9: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 2cc: goto 2da
// 2cf: ldc2_w 4621634249128352616
// 2d2: lload 5
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: iload 25
// 2dc: lload 5
// 2de: lconst_0
// 2df: lcmp
// 2e0: ifle 32f
// 2e3: ifeq 32d
// 2e6: if_acmpne 329
// 2e9: goto 2f7
// 2ec: ldc2_w 4621634249128352616
// 2ef: lload 5
// 2f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f6: athrow
// 2f7: lload 12
// 2f9: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 2fc: aload 31
// 2fe: invokevirtual net/minecraft/class_1511.method_5829 ()Lnet/minecraft/class_238;
// 301: dup
// 302: sipush 17939
// 305: ldc2_w 669205976211540478
// 308: lload 5
// 30a: lxor
// 30b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 313: aload 2
// 314: aconst_null
// 315: bipush 4
// 316: aconst_null
// 317: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 31a: pop
// 31b: goto 329
// 31e: ldc2_w 4621634249128352616
// 321: lload 5
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: aload 1
// 32a: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 32d: iload 25
// 32f: ifeq 355
// 332: if_acmpeq 358
// 335: goto 343
// 338: ldc2_w 4621634249128352616
// 33b: lload 5
// 33d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 342: athrow
// 343: aload 1
// 344: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 347: goto 355
// 34a: ldc2_w 4621634249128352616
// 34d: lload 5
// 34f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 354: athrow
// 355: if_acmpne 390
// 358: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 35b: aload 31
// 35d: invokevirtual net/minecraft/class_1511.method_5829 ()Lnet/minecraft/class_238;
// 360: dup
// 361: sipush 17939
// 364: ldc2_w 669205976211540478
// 367: lload 5
// 369: lxor
// 36a: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 372: aload 3
// 373: aconst_null
// 374: bipush 4
// 375: aconst_null
// 376: astore 20
// 378: istore 21
// 37a: astore 22
// 37c: astore 23
// 37e: astore 24
// 380: lload 16
// 382: aload 24
// 384: aload 23
// 386: aload 22
// 388: iload 21
// 38a: aload 20
// 38c: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 38f: pop
// 390: nop
// 391: nop
// 392: iload 25
// 394: ifne 270
// 397: nop
// 398: lload 5
// 39a: lconst_0
// 39b: lcmp
// 39c: iflt 283
// 39f: ldc2_w 4658122463277309493
// 3a2: lload 5
// 3a4: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: ifnull 3d9
// 3ac: iload 25
// 3ae: ifeq 3ce
// 3b1: goto 3bf
// 3b4: ldc2_w 4621634249128352616
// 3b7: lload 5
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: bipush 0
// 3c0: goto 3cf
// 3c3: ldc2_w 4621634249128352616
// 3c6: lload 5
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: bipush 1
// 3cf: ldc2_w 4667960481349352074
// 3d2: lload 5
// 3d4: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: return
}

public final void E(
char a,
int a,
@NotNull s8 mode,
@NotNull Color fillColor,
@NotNull Color lineColor,
@NotNull Color friendFillColor,
@NotNull Color friendLineColor,
int vDistance,
int hDistance,
@NotNull Color sFillColor,
short a,
@NotNull Color sLineColor,
@NotNull Color sFriendFillColor,
@NotNull Color sFriendLineColor
) {
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
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 11
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/j_.a J
// 01b: lxor
// 01c: lstore 15
// 01e: lload 15
// 020: dup2
// 021: ldc2_w 104105431943662
// 024: lxor
// 025: lstore 17
// 027: dup2
// 028: ldc2_w 79141413884280
// 02b: lxor
// 02c: lstore 19
// 02e: dup2
// 02f: ldc2_w 6114353062804
// 032: lxor
// 033: lstore 21
// 035: dup2
// 036: ldc2_w 136461459487087
// 039: lxor
// 03a: lstore 23
// 03c: dup2
// 03d: ldc2_w 6662684676729
// 040: lxor
// 041: dup2
// 042: bipush 8
// 044: lushr
// 045: lstore 25
// 047: dup2
// 048: bipush 56
// 04a: lshl
// 04b: bipush 56
// 04d: lushr
// 04e: l2i
// 04f: istore 27
// 051: pop2
// 052: dup2
// 053: ldc2_w 139962429495658
// 056: lxor
// 057: lstore 28
// 059: dup2
// 05a: ldc2_w 64145141305792
// 05d: lxor
// 05e: dup2
// 05f: bipush 16
// 061: lushr
// 062: lstore 30
// 064: dup2
// 065: bipush 48
// 067: lshl
// 068: bipush 48
// 06a: lushr
// 06b: l2i
// 06c: istore 32
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 138587437549512
// 073: lxor
// 074: lstore 33
// 076: pop2
// 077: aload 3
// 078: sipush 4396
// 07b: ldc2_w 6121173765933157265
// 07e: lload 15
// 080: lxor
// 081: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 089: aload 4
// 08b: sipush 20684
// 08e: ldc2_w 491010761210104424
// 091: lload 15
// 093: lxor
// 094: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 09c: aload 5
// 09e: sipush 14775
// 0a1: ldc2_w 4653603387936596752
// 0a4: lload 15
// 0a6: lxor
// 0a7: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0af: aload 6
// 0b1: sipush 7716
// 0b4: ldc2_w 2538072231256605838
// 0b7: lload 15
// 0b9: lxor
// 0ba: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c2: aload 7
// 0c4: sipush 22509
// 0c7: ldc2_w 2570975632658468162
// 0ca: lload 15
// 0cc: lxor
// 0cd: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d5: aload 10
// 0d7: sipush 21879
// 0da: ldc2_w 3449296902970707934
// 0dd: lload 15
// 0df: lxor
// 0e0: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0e8: ldc2_w -7661360742889482558
// 0eb: lload 15
// 0ed: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: aload 12
// 0f4: sipush 32675
// 0f7: ldc2_w 6564064438062458120
// 0fa: lload 15
// 0fc: lxor
// 0fd: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 105: istore 38
// 107: aload 13
// 109: sipush 781
// 10c: ldc2_w 5805486870338754987
// 10f: lload 15
// 111: lxor
// 112: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 11a: aload 14
// 11c: sipush 1025
// 11f: ldc2_w 558117561676750527
// 122: lload 15
// 124: lxor
// 125: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 12d: lload 17
// 12f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 132: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 135: iload 38
// 137: ifne 17c
// 13a: dup
// 13b: ifnull 165
// 13e: goto 14c
// 141: ldc2_w -7678217714865025478
// 144: lload 15
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: lload 19
// 14e: dup2_x1
// 14f: pop2
// 150: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 153: dup
// 154: ifnonnull 183
// 157: goto 165
// 15a: ldc2_w -7678217714865025478
// 15d: lload 15
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: pop
// 166: lload 33
// 168: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16b: checkcast net/minecraft/class_1297
// 16e: goto 17c
// 171: ldc2_w -7678217714865025478
// 174: lload 15
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: lload 19
// 17e: dup2_x1
// 17f: pop2
// 180: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 183: astore 39
// 185: lload 23
// 187: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 18a: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 18d: dup
// 18e: sipush 30184
// 191: ldc2_w 4776283089445138250
// 194: lload 15
// 196: lxor
// 197: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19f: astore 40
// 1a1: bipush 0
// 1a2: istore 41
// 1a4: aload 40
// 1a6: astore 42
// 1a8: new java/util/ArrayList
// 1ab: dup
// 1ac: invokespecial java/util/ArrayList.<init> ()V
// 1af: checkcast java/util/Collection
// 1b2: astore 43
// 1b4: bipush 0
// 1b5: istore 44
// 1b7: aload 42
// 1b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1be: astore 45
// 1c0: aload 45
// 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1c7: ifeq 301
// 1ca: aload 45
// 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d1: astore 46
// 1d3: aload 46
// 1d5: checkcast net/minecraft/class_1297
// 1d8: astore 47
// 1da: bipush 0
// 1db: istore 48
// 1dd: iload 2
// 1de: iflt 314
// 1e1: aload 47
// 1e3: instanceof net/minecraft/class_1657
// 1e6: iload 38
// 1e8: ifne 312
// 1eb: iload 38
// 1ed: iload 2
// 1ee: ifle 22d
// 1f1: ifne 22b
// 1f4: goto 202
// 1f7: ldc2_w -7678217714865025478
// 1fa: lload 15
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: ifeq 2ee
// 205: goto 213
// 208: ldc2_w -7678217714865025478
// 20b: lload 15
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: aload 47
// 215: lload 33
// 217: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 21d: goto 22b
// 220: ldc2_w -7678217714865025478
// 223: lload 15
// 225: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22a: athrow
// 22b: iload 38
// 22d: iload 11
// 22f: ifge 298
// 232: ifne 296
// 235: ifeq 265
// 238: goto 246
// 23b: ldc2_w -7678217714865025478
// 23e: lload 15
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: lload 17
// 248: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 24e: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 251: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 254: if_acmpeq 2ee
// 257: goto 265
// 25a: ldc2_w -7678217714865025478
// 25d: lload 15
// 25f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 264: athrow
// 265: aload 39
// 267: getfield net/minecraft/class_243.field_1352 D
// 26a: aload 47
// 26c: checkcast net/minecraft/class_1657
// 26f: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 272: dsub
// 273: aload 39
// 275: getfield net/minecraft/class_243.field_1350 D
// 278: aload 47
// 27a: checkcast net/minecraft/class_1657
// 27d: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 280: dsub
// 281: invokestatic java/lang/Math.hypot (DD)D
// 284: iload 9
// 286: i2d
// 287: dcmpg
// 288: goto 296
// 28b: ldc2_w -7678217714865025478
// 28e: lload 15
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: iload 38
// 298: iload 11
// 29a: ifgt 2d6
// 29d: ifne 2d4
// 2a0: ifge 2ee
// 2a3: goto 2b1
// 2a6: ldc2_w -7678217714865025478
// 2a9: lload 15
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: aload 39
// 2b3: getfield net/minecraft/class_243.field_1351 D
// 2b6: aload 47
// 2b8: checkcast net/minecraft/class_1657
// 2bb: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 2be: dsub
// 2bf: invokestatic java/lang/Math.abs (D)D
// 2c2: iload 8
// 2c4: i2d
// 2c5: dcmpg
// 2c6: goto 2d4
// 2c9: ldc2_w -7678217714865025478
// 2cc: lload 15
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: iload 38
// 2d6: ifne 2eb
// 2d9: ifge 2ee
// 2dc: goto 2ea
// 2df: ldc2_w -7678217714865025478
// 2e2: lload 15
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: bipush 1
// 2eb: goto 2ef
// 2ee: bipush 0
// 2ef: ifeq 1c0
// 2f2: aload 43
// 2f4: aload 46
// 2f6: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2fb: pop
// 2fc: iload 38
// 2fe: ifeq 1c0
// 301: aload 43
// 303: checkcast java/util/List
// 306: nop
// 307: checkcast java/lang/Iterable
// 30a: astore 40
// 30c: nop
// 30d: iload 2
// 30e: ifle 314
// 311: bipush 0
// 312: istore 41
// 314: aload 40
// 316: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 31b: astore 42
// 31d: aload 42
// 31f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 324: ifeq 586
// 327: aload 42
// 329: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 32e: astore 43
// 330: aload 43
// 332: checkcast net/minecraft/class_1297
// 335: astore 44
// 337: bipush 0
// 338: istore 45
// 33a: aload 44
// 33c: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 33f: dup
// 340: sipush 8010
// 343: ldc2_w 4945012235907843554
// 346: lload 15
// 348: lxor
// 349: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 351: astore 46
// 353: lload 17
// 355: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 358: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 35b: getfield net/minecraft/class_898.field_4686 Lnet/minecraft/class_4184;
// 35e: dup
// 35f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 362: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 365: dup
// 366: sipush 27882
// 369: ldc2_w 9210072858876655172
// 36c: lload 15
// 36e: lxor
// 36f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 377: astore 47
// 379: lload 25
// 37b: iload 27
// 37d: i2b
// 37e: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 381: aload 44
// 383: sipush 1045
// 386: ldc2_w 8055105529597648569
// 389: lload 15
// 38b: lxor
// 38c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 391: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 394: aload 44
// 396: checkcast net/minecraft/class_1657
// 399: fconst_0
// 39a: bipush 2
// 39b: aconst_null
// 39c: invokestatic su/catlean/zi.I (JBLsu/catlean/zi;Lnet/minecraft/class_1657;FILjava/lang/Object;)Lnet/minecraft/class_243;
// 39f: aload 47
// 3a1: getfield net/minecraft/class_243.field_1352 D
// 3a4: aload 47
// 3a6: getfield net/minecraft/class_243.field_1351 D
// 3a9: aload 47
// 3ab: getfield net/minecraft/class_243.field_1350 D
// 3ae: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 3b1: dup
// 3b2: sipush 23858
// 3b5: ldc2_w 1443488770150238099
// 3b8: lload 15
// 3ba: lxor
// 3bb: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3c3: astore 48
// 3c5: aload 48
// 3c7: aload 46
// 3c9: invokevirtual net/minecraft/class_238.method_17939 ()D
// 3cc: dneg
// 3cd: ldc2_w 2.0
// 3d0: ddiv
// 3d1: dconst_0
// 3d2: aload 46
// 3d4: invokevirtual net/minecraft/class_238.method_17941 ()D
// 3d7: dneg
// 3d8: ldc2_w 2.0
// 3db: ddiv
// 3dc: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 3df: dup
// 3e0: sipush 14753
// 3e3: ldc2_w 4279177042858533634
// 3e6: lload 15
// 3e8: lxor
// 3e9: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3f1: astore 49
// 3f3: aload 48
// 3f5: aload 46
// 3f7: invokevirtual net/minecraft/class_238.method_17939 ()D
// 3fa: ldc2_w 2.0
// 3fd: ddiv
// 3fe: aload 46
// 400: invokevirtual net/minecraft/class_238.method_17940 ()D
// 403: aload 46
// 405: invokevirtual net/minecraft/class_238.method_17941 ()D
// 408: ldc2_w 2.0
// 40b: ddiv
// 40c: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 40f: dup
// 410: sipush 14753
// 413: ldc2_w 4279177042858533634
// 416: lload 15
// 418: lxor
// 419: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/j_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 421: astore 50
// 423: new net/minecraft/class_238
// 426: dup
// 427: aload 49
// 429: aload 50
// 42b: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)V
// 42e: astore 46
// 430: iload 38
// 432: ifne 58c
// 435: aload 3
// 436: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 439: iload 38
// 43b: iload 1
// 43c: iflt 475
// 43f: ifne 473
// 442: goto 450
// 445: ldc2_w -7678217714865025478
// 448: lload 15
// 44a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44f: athrow
// 450: if_acmpeq 48d
// 453: goto 461
// 456: ldc2_w -7678217714865025478
// 459: lload 15
// 45b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 460: athrow
// 461: aload 3
// 462: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 465: goto 473
// 468: ldc2_w -7678217714865025478
// 46b: lload 15
// 46d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 472: athrow
// 473: iload 38
// 475: iload 1
// 476: iflt 4f0
// 479: ifne 4ea
// 47c: if_acmpne 4e6
// 47f: goto 48d
// 482: ldc2_w -7678217714865025478
// 485: lload 15
// 487: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48c: athrow
// 48d: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 490: aload 46
// 492: aload 44
// 494: checkcast net/minecraft/class_1657
// 497: lload 28
// 499: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 49c: ifeq 4bd
// 49f: goto 4ad
// 4a2: ldc2_w -7678217714865025478
// 4a5: lload 15
// 4a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ac: athrow
// 4ad: aload 6
// 4af: goto 4bf
// 4b2: ldc2_w -7678217714865025478
// 4b5: lload 15
// 4b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bc: athrow
// 4bd: aload 4
// 4bf: aload 44
// 4c1: checkcast net/minecraft/class_1657
// 4c4: lload 28
// 4c6: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 4c9: ifeq 4dc
// 4cc: aload 13
// 4ce: goto 4de
// 4d1: ldc2_w -7678217714865025478
// 4d4: lload 15
// 4d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4db: athrow
// 4dc: aload 10
// 4de: lload 21
// 4e0: dup2_x1
// 4e1: pop2
// 4e2: invokevirtual su/catlean/zi.F (Lnet/minecraft/class_238;Ljava/awt/Color;JLjava/awt/Color;)Z
// 4e5: pop
// 4e6: aload 3
// 4e7: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 4ea: iload 1
// 4eb: iflt 516
// 4ee: iload 38
// 4f0: ifne 516
// 4f3: if_acmpeq 519
// 4f6: goto 504
// 4f9: ldc2_w -7678217714865025478
// 4fc: lload 15
// 4fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 503: athrow
// 504: aload 3
// 505: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 508: goto 516
// 50b: ldc2_w -7678217714865025478
// 50e: lload 15
// 510: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 515: athrow
// 516: if_acmpne 57f
// 519: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 51c: aload 46
// 51e: aload 44
// 520: checkcast net/minecraft/class_1657
// 523: lload 28
// 525: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 528: ifeq 549
// 52b: goto 539
// 52e: ldc2_w -7678217714865025478
// 531: lload 15
// 533: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: athrow
// 539: aload 7
// 53b: goto 54b
// 53e: ldc2_w -7678217714865025478
// 541: lload 15
// 543: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 548: athrow
// 549: aload 5
// 54b: aload 44
// 54d: checkcast net/minecraft/class_1657
// 550: lload 28
// 552: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 555: ifeq 568
// 558: aload 14
// 55a: goto 56a
// 55d: ldc2_w -7678217714865025478
// 560: lload 15
// 562: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 567: athrow
// 568: aload 12
// 56a: astore 35
// 56c: astore 36
// 56e: astore 37
// 570: lload 30
// 572: iload 32
// 574: i2s
// 575: aload 37
// 577: aload 36
// 579: aload 35
// 57b: invokevirtual su/catlean/zi.q (JSLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;)Z
// 57e: pop
// 57f: nop
// 580: nop
// 581: iload 38
// 583: ifeq 31d
// 586: nop
// 587: iload 11
// 589: ifge 330
// 58c: return
}

static {
long var0 = a ^ 26743130293335L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[20];
int var7 = 0;
String var6 = "«¶\u000eïÁålý@ÿUmiZÇ\u0010Kg\b;\u0083\u009f\u001aã\u0018à´îA\u0081%õJ\u001f8]Ü.\u0004Å³²\r;\u001c`G´\u0091\u0080\u009ft\u0086À\u001fþ·c\\\u0084¤MÊ»¦é4\u000foúàÓ\u001b\tx~ñ¾MG\u0098ë\u0087±ÛB9\u0011\u009fiõ\u0012\u009e¾°íÒÈ\u0080/b\u0082[íà+ÑºaÖö\u0002q]fª;\u0093s\u0019{¿óü\u000f\u0010\u008b\u009aüUPÍ;\r\u008eiuUEÓ\u0093µ¢{§\u008aÃ«\"¡Wue2Ï\u0093á/\u008a{\u0006ñ\u008eÒ(Ü\u0017=%b«Ø\u001eú\u009eb\u0015Ù Mª=±z\u0097´4ïÔ\u0091r¤(ä\u0011¸q\u0092À\u008dÍr\u008c÷\u0095\u0098¨\u001f\bù\u0098\u0018¡ÿ¡Vì6Z2pïÆî\u009b:&3\u001d§^q)r¨{\u0018ZkK.X&\u0011·¿u7|1Äô¥\u00183³à\u000e÷7\u000e(¥\u008baÛz\u009fF\u009d\u0010E\u0005\u0007_E?ÉÑ\u001f\u001e<\u009a\\Q$\u0018U\u0096kw^\u009dÍ\b*Ìk\u0017Ñ\u0000P e\u0083]\u008bòã\u0004ì&\u0004\u001b¯\u0003¾VØ¡1¨:Ï-âÿ¬ e¦\f\u001f:\u0085(\u0018\u0081nWþ«\u0000\u0090\u00836\u0014A\u001cj\u009a±\u000e\u0083éÃ¿ñ§Næ\u0095°\u009d¨tÉàCÐç\\%½\u0003\u0013 {q¼Ì\u000bÙ\u000b0M\u0085¾`\u00adÖ\u009bó³½4\u0016?î|Jæ\u0006/\u0006\u008e¡\"© &ÀVe\u009aVÖ\u0085Ùpd}E\u009cðº,\u0019_£\u0097PÙÈpdÃ¹L\u008dgW nì\u0086OIû\u008b^ÐÝÀ\u008f?ò6\u0014\u00886\u0096Á[Í\u009d\u0010Ì]§uóI\u0097i8¤\u0087êó¿\u0096ÑÍæ×¦9\u009f»,A\u0098\u0010Ðked©\u0003'5@iÌ\u0017¦ÆÌ[2\u001c/\u009dRE\u0089Î+Áå8Anæ\u001bÚ\u009fÐMPW ç2Ø\u009cg¾±fÌâ$Â\u008fAûGkaª\u0097ì÷Ä5\u008cz\u00addÐ8\u0099\u00908\u001fÜýDá0l\u0088L\u008c\u0006©#Ù×\u0006ëË*\u0094\u001f\béÎ\u001c\u00adA¯\u008fxOï\u0019µ\u008eë\u0085Þ`s\u008e\u0000\u0089!æ\u009cHBrÂëMÛ\fÀ\u0080\u0018H\u0016²\u000bÜ\u001acN\bKÍ\u0095ÿ\u0004\n&¡mÁ5y11g(Ã¹\u008cò`ü\u009a\u0019YS¢\u0004ä0áÁ\r\u0090½çÑK{V\u009eíNãÂÊÐtÑ\u009c&r¹#\u0095ø(ÊÂüþ\u000e¬J¡\u001e\u008e¤\u008e8\u001c\u0013ÌÂ\u0016\u00adóH\u0005sÇ7Í\u0098K\u0013)¿yÏ\u009ct\u0087G¥ùH";
int var8 = "«¶\u000eïÁålý@ÿUmiZÇ\u0010Kg\b;\u0083\u009f\u001aã\u0018à´îA\u0081%õJ\u001f8]Ü.\u0004Å³²\r;\u001c`G´\u0091\u0080\u009ft\u0086À\u001fþ·c\\\u0084¤MÊ»¦é4\u000foúàÓ\u001b\tx~ñ¾MG\u0098ë\u0087±ÛB9\u0011\u009fiõ\u0012\u009e¾°íÒÈ\u0080/b\u0082[íà+ÑºaÖö\u0002q]fª;\u0093s\u0019{¿óü\u000f\u0010\u008b\u009aüUPÍ;\r\u008eiuUEÓ\u0093µ¢{§\u008aÃ«\"¡Wue2Ï\u0093á/\u008a{\u0006ñ\u008eÒ(Ü\u0017=%b«Ø\u001eú\u009eb\u0015Ù Mª=±z\u0097´4ïÔ\u0091r¤(ä\u0011¸q\u0092À\u008dÍr\u008c÷\u0095\u0098¨\u001f\bù\u0098\u0018¡ÿ¡Vì6Z2pïÆî\u009b:&3\u001d§^q)r¨{\u0018ZkK.X&\u0011·¿u7|1Äô¥\u00183³à\u000e÷7\u000e(¥\u008baÛz\u009fF\u009d\u0010E\u0005\u0007_E?ÉÑ\u001f\u001e<\u009a\\Q$\u0018U\u0096kw^\u009dÍ\b*Ìk\u0017Ñ\u0000P e\u0083]\u008bòã\u0004ì&\u0004\u001b¯\u0003¾VØ¡1¨:Ï-âÿ¬ e¦\f\u001f:\u0085(\u0018\u0081nWþ«\u0000\u0090\u00836\u0014A\u001cj\u009a±\u000e\u0083éÃ¿ñ§Næ\u0095°\u009d¨tÉàCÐç\\%½\u0003\u0013 {q¼Ì\u000bÙ\u000b0M\u0085¾`\u00adÖ\u009bó³½4\u0016?î|Jæ\u0006/\u0006\u008e¡\"© &ÀVe\u009aVÖ\u0085Ùpd}E\u009cðº,\u0019_£\u0097PÙÈpdÃ¹L\u008dgW nì\u0086OIû\u008b^ÐÝÀ\u008f?ò6\u0014\u00886\u0096Á[Í\u009d\u0010Ì]§uóI\u0097i8¤\u0087êó¿\u0096ÑÍæ×¦9\u009f»,A\u0098\u0010Ðked©\u0003'5@iÌ\u0017¦ÆÌ[2\u001c/\u009dRE\u0089Î+Áå8Anæ\u001bÚ\u009fÐMPW ç2Ø\u009cg¾±fÌâ$Â\u008fAûGkaª\u0097ì÷Ä5\u008cz\u00addÐ8\u0099\u00908\u001fÜýDá0l\u0088L\u008c\u0006©#Ù×\u0006ëË*\u0094\u001f\béÎ\u001c\u00adA¯\u008fxOï\u0019µ\u008eë\u0085Þ`s\u008e\u0000\u0089!æ\u009cHBrÂëMÛ\fÀ\u0080\u0018H\u0016²\u000bÜ\u001acN\bKÍ\u0095ÿ\u0004\n&¡mÁ5y11g(Ã¹\u008cò`ü\u009a\u0019YS¢\u0004ä0áÁ\r\u0090½çÑK{V\u009eíNãÂÊÐtÑ\u009c&r¹#\u0095ø(ÊÂüþ\u000e¬J¡\u001e\u008e¤\u008e8\u001c\u0013ÌÂ\u0016\u00adóH\u0005sÇ7Í\u0098K\u0013)¿yÏ\u009ct\u0087G¥ùH"
.length();
char var5 = 24;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[20];
N = new j_();
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "\u0013pHHÞ\u0011Îæá¿y,b+sÖ\u0010\u000f\u0004\u0098û8\rÒ\u0004DÓ°ôú<\u009aÉ";
var8 = "\u0013pHHÞ\u0011Îæá¿y,b+sÖ\u0010\u000f\u0004\u0098û8\rÒ\u0004DÓ°ôú<\u009aÉ".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19977;
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
throw new RuntimeException("su/catlean/j_", var10);
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
throw new RuntimeException("su/catlean/j_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
