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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class t8 extends tt {
@NotNull
public static final t8 r;
private static final long a = yz.a(6018499707916333913L, -5358344310943380128L, MethodHandles.lookup().lookupClass()).a(128110490494167L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private t8(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
long var10001 = var4 ^ 61763028542758L;
int var6 = (int)((var4 ^ 61763028542758L) >>> 48);
int var7 = (int)((var4 ^ 61763028542758L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, (short)var8);
}

@NotNull
@Override
public _w o(@NotNull class_1297 target, long a, @NotNull _w currentRotation, boolean attackTick) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 33615733051039
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 45747537906684
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 68997309831326
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 29252912481339
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 78446270612881
// 021: lxor
// 022: lstore 14
// 024: dup2
// 025: ldc2_w 38753063586444
// 028: lxor
// 029: lstore 16
// 02b: dup2
// 02c: ldc2_w 12961280391072
// 02f: lxor
// 030: lstore 18
// 032: dup2
// 033: ldc2_w 60568097754263
// 036: lxor
// 037: dup2
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 20
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 21
// 048: dup2
// 049: bipush 48
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 22
// 052: pop2
// 053: dup2
// 054: ldc2_w 76083599961676
// 057: lxor
// 058: lstore 23
// 05a: dup2
// 05b: ldc2_w 31852927257017
// 05e: lxor
// 05f: lstore 25
// 061: dup2
// 062: ldc2_w 43306842265647
// 065: lxor
// 066: lstore 27
// 068: pop2
// 069: ldc2_w -3889368070291334691
// 06c: lload 2
// 06d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: aload 1
// 073: sipush 935
// 076: ldc2_w 7388127893630508082
// 079: lload 2
// 07a: lxor
// 07b: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/t8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 083: astore 29
// 085: aload 4
// 087: sipush 8586
// 08a: ldc2_w 94357929230499357
// 08d: lload 2
// 08e: lxor
// 08f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/t8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 097: aload 0
// 098: lload 23
// 09a: aload 1
// 09b: invokevirtual su/catlean/t8.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 09e: astore 30
// 0a0: aload 1
// 0a1: aload 1
// 0a2: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0a5: ldc2_w -0.15
// 0a8: dconst_0
// 0a9: ldc2_w -0.15
// 0ac: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 0af: invokevirtual net/minecraft/class_1297.method_5857 (Lnet/minecraft/class_238;)V
// 0b2: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 0b5: aload 1
// 0b6: new su/catlean/_w
// 0b9: dup
// 0ba: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0bd: lload 8
// 0bf: invokevirtual su/catlean/dm.U (J)F
// 0c2: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0c5: lload 14
// 0c7: invokevirtual su/catlean/dm.w (J)F
// 0ca: lload 16
// 0cc: dup2_x1
// 0cd: pop2
// 0ce: bipush 0
// 0cf: aconst_null
// 0d0: sipush 11591
// 0d3: ldc2_w 6171863938985961835
// 0d6: lload 2
// 0d7: lxor
// 0d8: invokedynamic b (IJ)I bsm=su/catlean/t8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: aconst_null
// 0de: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0e1: getstatic su/catlean/um.E Lsu/catlean/um;
// 0e4: lload 10
// 0e6: invokevirtual su/catlean/um.P (J)F
// 0e9: fconst_2
// 0ea: fadd
// 0eb: getstatic su/catlean/um.E Lsu/catlean/um;
// 0ee: iload 20
// 0f0: iload 21
// 0f2: i2s
// 0f3: iload 22
// 0f5: invokevirtual su/catlean/um.G (ISI)Z
// 0f8: aload 29
// 0fa: ifnonnull 10e
// 0fd: ifne 111
// 100: goto 10d
// 103: ldc2_w -3852926227501613061
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: bipush 1
// 10e: goto 112
// 111: bipush 0
// 112: lload 25
// 114: invokevirtual su/catlean/gw.s (Lnet/minecraft/class_1297;Lsu/catlean/_w;FZJ)Z
// 117: istore 31
// 119: aload 1
// 11a: aload 1
// 11b: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 11e: ldc2_w 0.15
// 121: dconst_0
// 122: ldc2_w 0.15
// 125: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 128: invokevirtual net/minecraft/class_1297.method_5857 (Lnet/minecraft/class_238;)V
// 12b: aload 30
// 12d: getfield net/minecraft/class_243.field_1350 D
// 130: lload 27
// 132: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 135: invokevirtual net/minecraft/class_746.method_23321 ()D
// 138: dsub
// 139: aload 30
// 13b: getfield net/minecraft/class_243.field_1352 D
// 13e: lload 27
// 140: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 143: invokevirtual net/minecraft/class_746.method_23317 ()D
// 146: dsub
// 147: invokestatic java/lang/Math.atan2 (DD)D
// 14a: invokestatic java/lang/Math.toDegrees (D)D
// 14d: sipush 30054
// 150: ldc2_w 6862340276884500808
// 153: lload 2
// 154: lxor
// 155: invokedynamic b (IJ)I bsm=su/catlean/t8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: i2d
// 15b: dsub
// 15c: aload 4
// 15e: invokevirtual su/catlean/_w.q ()F
// 161: f2d
// 162: dsub
// 163: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 166: lload 18
// 168: ldc -1.0
// 16a: fconst_1
// 16b: bipush 0
// 16c: bipush 4
// 16d: aconst_null
// 16e: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 171: f2d
// 172: dadd
// 173: dstore 32
// 175: aload 30
// 177: getfield net/minecraft/class_243.field_1351 D
// 17a: lload 27
// 17c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17f: lload 6
// 181: dup2_x1
// 182: pop2
// 183: checkcast net/minecraft/class_1297
// 186: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 189: getfield net/minecraft/class_243.field_1351 D
// 18c: lload 27
// 18e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 191: lload 27
// 193: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 196: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 199: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 19c: f2d
// 19d: dadd
// 19e: dsub
// 19f: aload 30
// 1a1: getfield net/minecraft/class_243.field_1352 D
// 1a4: lload 27
// 1a6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a9: invokevirtual net/minecraft/class_746.method_23317 ()D
// 1ac: dsub
// 1ad: aload 30
// 1af: getfield net/minecraft/class_243.field_1350 D
// 1b2: lload 27
// 1b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b7: invokevirtual net/minecraft/class_746.method_23321 ()D
// 1ba: dsub
// 1bb: invokestatic java/lang/Math.hypot (DD)D
// 1be: invokestatic java/lang/Math.atan2 (DD)D
// 1c1: invokestatic java/lang/Math.toDegrees (D)D
// 1c4: dneg
// 1c5: aload 4
// 1c7: invokevirtual su/catlean/_w.N ()F
// 1ca: f2d
// 1cb: dsub
// 1cc: dstore 34
// 1ce: lload 27
// 1d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d3: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1d6: aload 29
// 1d8: lload 2
// 1d9: lconst_0
// 1da: lcmp
// 1db: ifle 213
// 1de: ifnonnull 20b
// 1e1: ifne 25c
// 1e4: goto 1f1
// 1e7: ldc2_w -3852926227501613061
// 1ea: lload 2
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: getstatic su/catlean/um.E Lsu/catlean/um;
// 1f4: lload 10
// 1f6: invokevirtual su/catlean/um.P (J)F
// 1f9: f2d
// 1fa: ldc2_w 4.0
// 1fd: dcmpg
// 1fe: goto 20b
// 201: ldc2_w -3852926227501613061
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: lload 2
// 20c: lconst_0
// 20d: lcmp
// 20e: iflt 228
// 211: aload 29
// 213: ifnonnull 228
// 216: ifge 25c
// 219: goto 226
// 21c: ldc2_w -3852926227501613061
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: iload 31
// 228: ifeq 246
// 22b: lload 12
// 22d: ldc2_w 0.15
// 230: ldc2_w 0.21
// 233: bipush 0
// 234: bipush 4
// 235: aconst_null
// 236: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 239: goto 25f
// 23c: ldc2_w -3852926227501613061
// 23f: lload 2
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: dload 32
// 248: invokestatic java/lang/Math.abs (D)D
// 24b: lload 18
// 24d: ldc 1.4
// 24f: ldc 1.8
// 251: bipush 0
// 252: bipush 4
// 253: aconst_null
// 254: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 257: f2d
// 258: ddiv
// 259: goto 25f
// 25c: ldc2_w 360.0
// 25f: dstore 36
// 261: lload 27
// 263: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 266: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 269: lload 2
// 26a: lconst_0
// 26b: lcmp
// 26c: iflt 2b6
// 26f: aload 29
// 271: ifnonnull 2b6
// 274: ifne 31e
// 277: goto 284
// 27a: ldc2_w -3852926227501613061
// 27d: lload 2
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: getstatic su/catlean/um.E Lsu/catlean/um;
// 287: lload 10
// 289: invokevirtual su/catlean/um.P (J)F
// 28c: f2d
// 28d: ldc2_w 4.0
// 290: aload 29
// 292: lload 2
// 293: lconst_0
// 294: lcmp
// 295: iflt 2d8
// 298: ifnonnull 2d6
// 29b: goto 2a8
// 29e: ldc2_w -3852926227501613061
// 2a1: lload 2
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: dcmpg
// 2a9: goto 2b6
// 2ac: ldc2_w -3852926227501613061
// 2af: lload 2
// 2b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: athrow
// 2b6: ifge 31e
// 2b9: dload 34
// 2bb: invokestatic java/lang/Math.abs (D)D
// 2be: ldc2_w 15.0
// 2c1: dsub
// 2c2: dconst_0
// 2c3: invokestatic java/lang/Math.max (DD)D
// 2c6: ldc2_w 2.0
// 2c9: goto 2d6
// 2cc: ldc2_w -3852926227501613061
// 2cf: lload 2
// 2d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: athrow
// 2d6: aload 29
// 2d8: ifnonnull 316
// 2db: ddiv
// 2dc: lload 27
// 2de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e1: getfield net/minecraft/class_746.field_6012 I
// 2e4: sipush 29781
// 2e7: ldc2_w 5185430261666836607
// 2ea: lload 2
// 2eb: lxor
// 2ec: invokedynamic b (IJ)I bsm=su/catlean/t8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: irem
// 2f2: ifne 319
// 2f5: goto 302
// 2f8: ldc2_w -3852926227501613061
// 2fb: lload 2
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: ldc2_w 2.0
// 305: invokestatic java/lang/Math.random ()D
// 308: dmul
// 309: goto 316
// 30c: ldc2_w -3852926227501613061
// 30f: lload 2
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: goto 31a
// 319: dconst_0
// 31a: dadd
// 31b: goto 321
// 31e: ldc2_w 180.0
// 321: dstore 38
// 323: aload 4
// 325: invokevirtual su/catlean/_w.q ()F
// 328: f2d
// 329: dload 32
// 32b: dload 36
// 32d: dneg
// 32e: dload 36
// 330: invokestatic java/lang/Math.clamp (DDD)D
// 333: dadd
// 334: dstore 40
// 336: aload 4
// 338: invokevirtual su/catlean/_w.N ()F
// 33b: f2d
// 33c: dload 34
// 33e: dload 38
// 340: dneg
// 341: dload 38
// 343: invokestatic java/lang/Math.clamp (DDD)D
// 346: dadd
// 347: dload 32
// 349: invokestatic java/lang/Math.toRadians (D)D
// 34c: invokestatic java/lang/Math.sin (D)D
// 34f: dadd
// 350: dstore 42
// 352: new su/catlean/_w
// 355: dup
// 356: dload 40
// 358: d2f
// 359: dload 42
// 35b: d2f
// 35c: lload 16
// 35e: dup2_x1
// 35f: pop2
// 360: bipush 0
// 361: aconst_null
// 362: sipush 13002
// 365: ldc2_w 5279052481940305639
// 368: lload 2
// 369: lxor
// 36a: invokedynamic b (IJ)I bsm=su/catlean/t8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: aconst_null
// 370: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 373: areturn
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 100744130797779
// 05: lxor
// 06: lstore 4
// 08: dup2
// 09: ldc2_w 108103236449891
// 0c: lxor
// 0d: lstore 6
// 0f: pop2
// 10: ldc2_w 2615031633354110865
// 13: lload 1
// 14: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 3
// 1a: sipush 17409
// 1d: ldc2_w 5938852032759035355
// 20: lload 1
// 21: lxor
// 22: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/t8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: astore 8
// 2c: lload 6
// 2e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 31: aload 8
// 33: ifnonnull 6a
// 36: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 39: ifeq 69
// 3c: goto 49
// 3f: ldc2_w 2651473599944724919
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: aload 3
// 4a: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 4d: dup
// 4e: sipush 26593
// 51: ldc2_w 8951985376639571516
// 54: lload 1
// 55: lxor
// 56: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/t8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5e: areturn
// 5f: ldc2_w 2651473599944724919
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: aload 3
// 6a: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 6d: invokevirtual net/minecraft/class_238.method_17939 ()D
// 70: ldc2_w 2.1
// 73: ddiv
// 74: aload 3
// 75: getfield net/minecraft/class_1297.field_6012 I
// 78: i2d
// 79: invokestatic java/lang/Math.toRadians (D)D
// 7c: invokestatic java/lang/Math.sin (D)D
// 7f: dmul
// 80: dstore 9
// 82: aload 3
// 83: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 86: invokevirtual net/minecraft/class_238.method_17940 ()D
// 89: sipush 13709
// 8c: ldc2_w 2920393619170189294
// 8f: lload 1
// 90: lxor
// 91: invokedynamic b (IJ)I bsm=su/catlean/t8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96: i2d
// 97: ddiv
// 98: aload 3
// 99: getfield net/minecraft/class_1297.field_6012 I
// 9c: i2d
// 9d: ldc2_w 10.0
// a0: dadd
// a1: invokestatic java/lang/Math.toRadians (D)D
// a4: invokestatic java/lang/Math.sin (D)D
// a7: dmul
// a8: dstore 11
// aa: aload 3
// ab: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// ae: invokevirtual net/minecraft/class_238.method_17941 ()D
// b1: ldc2_w 2.1
// b4: ddiv
// b5: aload 3
// b6: getfield net/minecraft/class_1297.field_6012 I
// b9: i2d
// ba: invokestatic java/lang/Math.toRadians (D)D
// bd: invokestatic java/lang/Math.cos (D)D
// c0: dneg
// c1: dmul
// c2: dstore 13
// c4: lload 4
// c6: aload 3
// c7: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// ca: dload 9
// cc: aload 3
// cd: invokevirtual net/minecraft/class_1297.method_17682 ()F
// d0: f2d
// d1: ldc2_w 2.0
// d4: ddiv
// d5: dload 11
// d7: dadd
// d8: dload 13
// da: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// dd: dup
// de: sipush 29696
// e1: ldc2_w 3900548590557185496
// e4: lload 1
// e5: lxor
// e6: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/t8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// ee: areturn
}

static {
long var20 = a ^ 87636124748298L;
long var10001 = var20 ^ 45966322723252L;
int var22 = (int)((var20 ^ 45966322723252L) >>> 32);
int var23 = (int)((var20 ^ 45966322723252L) << 32 >>> 56);
int var24 = (int)(var10001 << 40 >>> 40);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "¡àC¦3gx*ýNÍ»\u000f\u0094\u0097å\u0018(Ý\u0005ú\u009aùkÂÅÄK\u0092ÂÌ\u0014æ;t\t\u0086Al\u0099G gXj\u008eÄTøN\f^£ðÃö;%\u0095i\u0015Öî|\u0018w:\u008b¶ÿÏ\u0017Z\u0086";
int var17 = "¡àC¦3gx*ýNÍ»\u000f\u0094\u0097å\u0018(Ý\u0005ú\u009aùkÂÅÄK\u0092ÂÌ\u0014æ;t\t\u0086Al\u0099G gXj\u008eÄTøN\f^£ðÃö;%\u0095i\u0015Öî|\u0018w:\u008b¶ÿÏ\u0017Z\u0086"
.length();
char var14 = 16;
int var27 = -1;

label54:
while (true) {
String var28 = var15.substring(++var27, var27 + var14);
byte var32 = -1;

while (true) {
byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var32) {
case 0:
var18[var16++] = var40;
if ((var27 += var14) >= var17) {
b = var18;
c = new String[5];
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
String var4 = "\u0004¼8þåZÍ=ä¾@S\u0007\u0002`höUÈ4\u001f»\"\u0092";
int var5 = "\u0004¼8þåZÍ=ä¾@S\u0007\u0002`höUÈ4\u001f»\"\u0092".length();
byte var2 = 0;

label36:
while (true) {
byte var36 = var2;
var2 += 8;
byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
int var37 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var37] = var49;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
r = new t8(var22, (byte)var23, var24);
return;
}
break;
default:
var31[var37] = var49;
if (var2 < var5) {
continue label36;
}

var4 = "£ï\tÌ²\u0093öÈ\u0088\u0085Àu\u0094ò/¢";
var5 = "£ï\tÌ²\u0093öÈ\u0088\u0085Àu\u0094ò/¢".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var31 = var6;
var37 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var14 = var15.charAt(var27);
break;
default:
var18[var16++] = var40;
if ((var27 += var14) < var17) {
var14 = var15.charAt(var27);
continue label54;
}

var15 = "\u0082D\u00140{%I9~=,«¶òÓã(ý·\u0086\u001eÉ ý\u0093ª¤ÖóI>\u0081Ã©·/DÕ\u0097ÌÏ\u0094JKfÆ\u001b\u001bm»\u000e©ê\u0082~5\u0088";
var17 = "\u0082D\u00140{%I9~=,«¶òÓã(ý·\u0086\u001eÉ ý\u0093ª¤ÖóI>\u0081Ã©·/DÕ\u0097ÌÏ\u0094JKfÆ\u001b\u001bm»\u000e©ê\u0082~5\u0088".length();
var14 = 16;
var27 = -1;
}

var28 = var15.substring(++var27, var27 + var14);
var32 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5333;
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
throw new RuntimeException("su/catlean/t8", var10);
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
throw new RuntimeException("su/catlean/t8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20334;
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
throw new RuntimeException("su/catlean/t8", var14);
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
throw new RuntimeException("su/catlean/t8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
