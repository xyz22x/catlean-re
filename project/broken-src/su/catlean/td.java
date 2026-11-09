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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class td extends tt {
@NotNull
public static final td u;
private static final long a = yz.a(-2476744014373215559L, -1366891779842275940L, MethodHandles.lookup().lookupClass()).a(8358863625347L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private td(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 33405503357748L;
int var3 = (int)((var1 ^ 33405503357748L) >>> 48);
int var4 = (int)((var1 ^ 33405503357748L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, (short)var5);
}

@NotNull
@Override
public _w o(@NotNull class_1297 target, long a, @NotNull _w currentRotation, boolean attackTick) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 74965760972846
// 005: lxor
// 006: dup2
// 007: bipush 56
// 009: lushr
// 00a: l2i
// 00b: istore 6
// 00d: dup2
// 00e: bipush 8
// 010: lshl
// 011: bipush 8
// 013: lushr
// 014: lstore 7
// 016: pop2
// 017: dup2
// 018: ldc2_w 68997309831326
// 01b: lxor
// 01c: lstore 9
// 01e: dup2
// 01f: ldc2_w 29252912481339
// 022: lxor
// 023: lstore 11
// 025: dup2
// 026: ldc2_w 12961280391072
// 029: lxor
// 02a: lstore 13
// 02c: dup2
// 02d: ldc2_w 38753063586444
// 030: lxor
// 031: lstore 15
// 033: dup2
// 034: ldc2_w 76083599961676
// 037: lxor
// 038: lstore 17
// 03a: dup2
// 03b: ldc2_w 60568097754263
// 03e: lxor
// 03f: dup2
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 19
// 046: dup2
// 047: bipush 32
// 049: lshl
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 20
// 050: dup2
// 051: bipush 48
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 21
// 05a: pop2
// 05b: dup2
// 05c: ldc2_w 31852927257017
// 05f: lxor
// 060: lstore 22
// 062: dup2
// 063: ldc2_w 43306842265647
// 066: lxor
// 067: lstore 24
// 069: pop2
// 06a: aload 1
// 06b: sipush 3208
// 06e: ldc2_w 6516912622649671711
// 071: lload 2
// 072: lxor
// 073: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/td.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07b: aload 4
// 07d: sipush 26601
// 080: ldc2_w 2890564281027324797
// 083: lload 2
// 084: lxor
// 085: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/td.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: ldc2_w -3889368070291334691
// 090: lload 2
// 091: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: aload 0
// 097: lload 17
// 099: aload 1
// 09a: invokevirtual su/catlean/td.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 09d: astore 27
// 09f: astore 26
// 0a1: aload 27
// 0a3: getfield net/minecraft/class_243.field_1350 D
// 0a6: lload 24
// 0a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ab: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0ae: dsub
// 0af: aload 27
// 0b1: getfield net/minecraft/class_243.field_1352 D
// 0b4: lload 24
// 0b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b9: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0bc: dsub
// 0bd: invokestatic java/lang/Math.atan2 (DD)D
// 0c0: invokestatic java/lang/Math.toDegrees (D)D
// 0c3: sipush 25231
// 0c6: ldc2_w 4543415691429352506
// 0c9: lload 2
// 0ca: lxor
// 0cb: invokedynamic f (IJ)I bsm=su/catlean/td.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: i2d
// 0d1: dsub
// 0d2: aload 4
// 0d4: invokevirtual su/catlean/_w.q ()F
// 0d7: f2d
// 0d8: dsub
// 0d9: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 0dc: lload 13
// 0de: ldc -1.0
// 0e0: fconst_1
// 0e1: bipush 0
// 0e2: bipush 4
// 0e3: aconst_null
// 0e4: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 0e7: f2d
// 0e8: dadd
// 0e9: dstore 28
// 0eb: aload 27
// 0ed: getfield net/minecraft/class_243.field_1351 D
// 0f0: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 0f3: lload 24
// 0f5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f8: iload 6
// 0fa: i2b
// 0fb: swap
// 0fc: lload 7
// 0fe: dup2_x1
// 0ff: pop2
// 100: checkcast net/minecraft/class_1297
// 103: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 106: getfield net/minecraft/class_243.field_1351 D
// 109: lload 24
// 10b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10e: lload 24
// 110: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 113: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 116: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 119: f2d
// 11a: dadd
// 11b: dsub
// 11c: aload 27
// 11e: getfield net/minecraft/class_243.field_1352 D
// 121: lload 24
// 123: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 126: invokevirtual net/minecraft/class_746.method_23317 ()D
// 129: dsub
// 12a: aload 27
// 12c: getfield net/minecraft/class_243.field_1350 D
// 12f: lload 24
// 131: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 134: invokevirtual net/minecraft/class_746.method_23321 ()D
// 137: dsub
// 138: invokestatic java/lang/Math.hypot (DD)D
// 13b: invokestatic java/lang/Math.atan2 (DD)D
// 13e: invokestatic java/lang/Math.toDegrees (D)D
// 141: dneg
// 142: aload 4
// 144: invokevirtual su/catlean/_w.N ()F
// 147: f2d
// 148: dsub
// 149: dstore 30
// 14b: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 14e: aload 1
// 14f: new su/catlean/_w
// 152: dup
// 153: aload 4
// 155: invokevirtual su/catlean/_w.q ()F
// 158: aload 4
// 15a: invokevirtual su/catlean/_w.N ()F
// 15d: lload 15
// 15f: dup2_x1
// 160: pop2
// 161: bipush 0
// 162: aconst_null
// 163: sipush 5707
// 166: ldc2_w 8891274853248983295
// 169: lload 2
// 16a: lxor
// 16b: invokedynamic f (IJ)I bsm=su/catlean/td.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: aconst_null
// 171: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 174: getstatic su/catlean/um.E Lsu/catlean/um;
// 177: lload 9
// 179: invokevirtual su/catlean/um.P (J)F
// 17c: fconst_2
// 17d: fadd
// 17e: getstatic su/catlean/um.E Lsu/catlean/um;
// 181: iload 19
// 183: iload 20
// 185: i2s
// 186: iload 21
// 188: invokevirtual su/catlean/um.G (ISI)Z
// 18b: aload 26
// 18d: ifnonnull 1a1
// 190: ifne 1a4
// 193: goto 1a0
// 196: ldc2_w -3859696921058489448
// 199: lload 2
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: bipush 1
// 1a1: goto 1a5
// 1a4: bipush 0
// 1a5: lload 22
// 1a7: invokevirtual su/catlean/gw.s (Lnet/minecraft/class_1297;Lsu/catlean/_w;FZJ)Z
// 1aa: istore 32
// 1ac: lload 24
// 1ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b1: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1b4: lload 2
// 1b5: lconst_0
// 1b6: lcmp
// 1b7: iflt 1d1
// 1ba: aload 26
// 1bc: ifnonnull 1d1
// 1bf: ifne 205
// 1c2: goto 1cf
// 1c5: ldc2_w -3859696921058489448
// 1c8: lload 2
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: iload 32
// 1d1: ifeq 1ef
// 1d4: lload 11
// 1d6: ldc2_w 0.15
// 1d9: ldc2_w 0.21
// 1dc: bipush 0
// 1dd: bipush 4
// 1de: aconst_null
// 1df: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 1e2: goto 208
// 1e5: ldc2_w -3859696921058489448
// 1e8: lload 2
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: dload 28
// 1f1: invokestatic java/lang/Math.abs (D)D
// 1f4: lload 13
// 1f6: ldc 1.4
// 1f8: ldc 1.8
// 1fa: bipush 0
// 1fb: bipush 4
// 1fc: aconst_null
// 1fd: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 200: f2d
// 201: ddiv
// 202: goto 208
// 205: ldc2_w 180.0
// 208: dstore 33
// 20a: lload 24
// 20c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20f: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 212: ifne 27a
// 215: dload 30
// 217: invokestatic java/lang/Math.abs (D)D
// 21a: ldc2_w 2.0
// 21d: dsub
// 21e: dconst_0
// 21f: invokestatic java/lang/Math.max (DD)D
// 222: ldc2_w 2.0
// 225: aload 26
// 227: ifnonnull 272
// 22a: goto 237
// 22d: ldc2_w -3859696921058489448
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: ddiv
// 238: lload 24
// 23a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23d: getfield net/minecraft/class_746.field_6012 I
// 240: sipush 7259
// 243: ldc2_w 3445593761008773865
// 246: lload 2
// 247: lxor
// 248: invokedynamic f (IJ)I bsm=su/catlean/td.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: irem
// 24e: ifne 275
// 251: goto 25e
// 254: ldc2_w -3859696921058489448
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: ldc2_w 2.0
// 261: invokestatic java/lang/Math.random ()D
// 264: dmul
// 265: goto 272
// 268: ldc2_w -3859696921058489448
// 26b: lload 2
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: goto 276
// 275: dconst_0
// 276: dadd
// 277: goto 27d
// 27a: ldc2_w 90.0
// 27d: dstore 35
// 27f: dload 28
// 281: invokestatic java/lang/Math.abs (D)D
// 284: aload 26
// 286: ifnonnull 2ac
// 289: ldc2_w 0.3
// 28c: dcmpl
// 28d: ifle 2af
// 290: goto 29d
// 293: ldc2_w -3859696921058489448
// 296: lload 2
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: dload 28
// 29f: goto 2ac
// 2a2: ldc2_w -3859696921058489448
// 2a5: lload 2
// 2a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: athrow
// 2ac: goto 2b0
// 2af: dconst_0
// 2b0: dstore 37
// 2b2: aload 4
// 2b4: invokevirtual su/catlean/_w.q ()F
// 2b7: f2d
// 2b8: dload 37
// 2ba: dload 33
// 2bc: dneg
// 2bd: dload 33
// 2bf: invokestatic java/lang/Math.clamp (DDD)D
// 2c2: dadd
// 2c3: lload 24
// 2c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c8: getfield net/minecraft/class_746.field_6012 I
// 2cb: i2d
// 2cc: ldc 20.0
// 2ce: f2d
// 2cf: dmul
// 2d0: invokestatic java/lang/Math.toRadians (D)D
// 2d3: invokestatic java/lang/Math.sin (D)D
// 2d6: ldc 0.5
// 2d8: f2d
// 2d9: dmul
// 2da: dadd
// 2db: dstore 39
// 2dd: aload 4
// 2df: invokevirtual su/catlean/_w.N ()F
// 2e2: f2d
// 2e3: dload 30
// 2e5: dload 35
// 2e7: dneg
// 2e8: dload 35
// 2ea: invokestatic java/lang/Math.clamp (DDD)D
// 2ed: dadd
// 2ee: dload 39
// 2f0: invokestatic java/lang/Math.toRadians (D)D
// 2f3: invokestatic java/lang/Math.sin (D)D
// 2f6: ldc 1.5
// 2f8: f2d
// 2f9: dmul
// 2fa: dadd
// 2fb: dstore 41
// 2fd: dload 39
// 2ff: aload 4
// 301: invokevirtual su/catlean/_w.q ()F
// 304: f2d
// 305: dsub
// 306: dstore 43
// 308: dload 43
// 30a: invokestatic kotlin/math/MathKt.roundToInt (D)I
// 30d: i2d
// 30e: dload 43
// 310: dsub
// 311: invokestatic java/lang/Math.abs (D)D
// 314: dstore 45
// 316: dload 45
// 318: lload 2
// 319: lconst_0
// 31a: lcmp
// 31b: ifle 344
// 31e: aload 26
// 320: ifnonnull 344
// 323: dconst_1
// 324: dcmpg
// 325: ifge 378
// 328: goto 335
// 32b: ldc2_w -3859696921058489448
// 32e: lload 2
// 32f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: athrow
// 335: dload 39
// 337: goto 344
// 33a: ldc2_w -3859696921058489448
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: lload 24
// 346: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 349: getfield net/minecraft/class_746.field_6012 I
// 34c: bipush 2
// 34d: irem
// 34e: aload 26
// 350: ifnonnull 364
// 353: ifne 367
// 356: goto 363
// 359: ldc2_w -3859696921058489448
// 35c: lload 2
// 35d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 362: athrow
// 363: bipush 1
// 364: goto 374
// 367: sipush 21934
// 36a: ldc2_w 7714551460106445593
// 36d: lload 2
// 36e: lxor
// 36f: invokedynamic f (IJ)I bsm=su/catlean/td.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: i2d
// 375: dadd
// 376: dstore 39
// 378: new su/catlean/_w
// 37b: dup
// 37c: dload 39
// 37e: d2f
// 37f: dload 41
// 381: d2f
// 382: lload 15
// 384: dup2_x1
// 385: pop2
// 386: bipush 0
// 387: aconst_null
// 388: sipush 8106
// 38b: ldc2_w 5847793163772553500
// 38e: lload 2
// 38f: lxor
// 390: invokedynamic f (IJ)I bsm=su/catlean/td.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 395: aconst_null
// 396: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 399: lload 2
// 39a: lconst_0
// 39b: lcmp
// 39c: ifle 3b1
// 39f: aload 26
// 3a1: ifnull 3be
// 3a4: bipush 4
// 3a5: anewarray 120
// 3a8: ldc2_w -3861928939273273254
// 3ab: lload 2
// 3ac: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b1: goto 3be
// 3b4: ldc2_w -3859696921058489448
// 3b7: lload 2
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: areturn
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
long var4 = ax ^ 108103236449891L;
Intrinsics.checkNotNullParameter(target, b<"w">(22887, 4628379651565403069L ^ ax));
class_238 var10000 = target.method_5829();
Intrinsics.checkNotNullExpressionValue(var10000, b<"w">(30682, 8846170985190659331L ^ ax));
class_238 var6 = var10000;
return new class_243(
RangesKt.coerceIn(zf.v(var4).method_33571().field_1352, var6.field_1323, var6.field_1320),
RangesKt.coerceIn(zf.v(var4).method_33571().field_1351, var6.field_1322, var6.field_1325),
RangesKt.coerceIn(zf.v(var4).method_33571().field_1350, var6.field_1321, var6.field_1324)
);
}

static {
long var20 = a ^ 10081647779560L;
long var22 = var20 ^ 80388617820996L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "¿Bû·FVZ;\u0081É«ìéxôòÉ5Y@F¼¸}(\u0098\u00955Á\u008cÃ\u001e\u0002\b\u0098ª×y\u009di\u0000`j<Äq\u0017\u009d\u0017\u0099\u00adÀT4\u008c\u0097\u008dÕ\u0013YM(\u0010(Ü";
int var17 = "¿Bû·FVZ;\u0081É«ìéxôòÉ5Y@F¼¸}(\u0098\u00955Á\u008cÃ\u001e\u0002\b\u0098ª×y\u009di\u0000`j<Äq\u0017\u009d\u0017\u0099\u00adÀT4\u008c\u0097\u008dÕ\u0013YM(\u0010(Ü"
.length();
char var14 = 24;
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[4];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "©\u008f\n\u009aÓw,ùÜ@ORHÐ\u00adW\u00adÖØ=6\u0004Ìk";
int var5 = "©\u008f\n\u009aÓw,ùÜ@ORHÐ\u00adW\u00adÖØ=6\u0004Ìk".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
u = new td(var22);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "C¿¸`F¸0ítk\u0019ÉÐ¹\"Ç";
var5 = "C¿¸`F¸0ítk\u0019ÉÐ¹\"Ç".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "üª½JËz8ßÒÊ1\u0018ëQ\u0001)\u0010\u0087µ\u009dbywÃXý\u009fp{I\u000e\fh";
var17 = "üª½JËz8ßÒÊ1\u0018ëQ\u0001)\u0010\u0087µ\u009dbywÃXý\u009fp{I\u000e\fh".length();
var14 = 16;
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18388;
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
throw new RuntimeException("su/catlean/td", var10);
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
throw new RuntimeException("su/catlean/td" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15862;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/td", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/td" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
