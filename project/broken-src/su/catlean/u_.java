package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u_ extends _g {
@NotNull
public static final u_ c;
static final KProperty[] h;
@NotNull
private static final c8 S;
@NotNull
private static final cw g;
@NotNull
private static final cq f;
@NotNull
private static i9 d;
@NotNull
private static i9 t;
private static final long a = yz.a(-3669055477203919723L, -5218157628920450632L, MethodHandles.lookup().lookupClass()).a(261688049258216L);
private static final String[] b;
private static final String[] e;
private static final Map i = new HashMap(13);
private static final long[] j;
private static final Integer[] k;
private static final Map l;

private u_(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23759555676765L;
super(b<"i">(17865, 2495862270515569594L ^ var1), jt.Q(), null, 4, null, var3);
}

private final int F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 28993418607929L;
return ((Number)S.E(this, var3, h[0])).intValue();
}

private final void A(long var1, int var3) {
var1 = a ^ var1;
long var4 = var1 ^ 69106496473162L;
S.b(this, var4, h[0], var3);
}

private final f9 P(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 136769871100748L;
return (f9)g.E(this, var5, h[1]);
}

private final void Z(int var1, f9 var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 106465045480145L;
g.b(this, var6, h[1], var2);
}

private final boolean h(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 118070272714922L;
return (Boolean)f.E(this, var6, h[2]);
}

private final void v(long var1, boolean var3, byte var4) {
long var5 = (var1 << 8 | (long)var4 << 56 >>> 56) ^ a;
long var7 = var5 ^ 6130130695786L;
f.b(this, var7, h[2], var3);
}

@Flow
private final void d(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u_.a J
// 003: ldc2_w 84737235819987
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 81027636801291
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 4555534730466
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 84727474251785
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 116838159344345
// 031: lxor
// 032: dup2
// 033: bipush 48
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 16
// 03c: lshl
// 03d: bipush 32
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: dup2
// 044: bipush 48
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 44993050939821
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 114259721691755
// 059: lxor
// 05a: dup2
// 05b: bipush 32
// 05d: lushr
// 05e: l2i
// 05f: istore 16
// 061: dup2
// 062: bipush 32
// 064: lshl
// 065: bipush 56
// 067: lushr
// 068: l2i
// 069: istore 17
// 06b: dup2
// 06c: bipush 40
// 06e: lshl
// 06f: bipush 40
// 071: lushr
// 072: l2i
// 073: istore 18
// 075: pop2
// 076: dup2
// 077: ldc2_w 135319248556080
// 07a: lxor
// 07b: lstore 19
// 07d: dup2
// 07e: ldc2_w 38813670050765
// 081: lxor
// 082: lstore 21
// 084: dup2
// 085: ldc2_w 25904497061102
// 088: lxor
// 089: lstore 23
// 08b: dup2
// 08c: ldc2_w 47265259237130
// 08f: lxor
// 090: lstore 25
// 092: dup2
// 093: ldc2_w 109094403002117
// 096: lxor
// 097: lstore 27
// 099: pop2
// 09a: ldc2_w 9055902418620458817
// 09d: lload 2
// 09e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: astore 29
// 0a5: getstatic su/catlean/u_.d Lsu/catlean/i9;
// 0a8: aload 0
// 0a9: lload 23
// 0ab: invokespecial su/catlean/u_.F (J)I
// 0ae: iload 11
// 0b0: i2s
// 0b1: swap
// 0b2: iload 12
// 0b4: swap
// 0b5: iload 13
// 0b7: i2s
// 0b8: swap
// 0b9: invokevirtual su/catlean/i9.g (SISI)Z
// 0bc: ifne 0ca
// 0bf: return
// 0c0: ldc2_w 9010444953407658590
// 0c3: lload 2
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: aload 0
// 0cb: lload 25
// 0cd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d0: iload 4
// 0d2: i2b
// 0d3: swap
// 0d4: lload 5
// 0d6: dup2_x1
// 0d7: pop2
// 0d8: checkcast net/minecraft/class_1297
// 0db: invokevirtual su/catlean/u_.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0de: checkcast net/minecraft/class_2374
// 0e1: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0e4: dup
// 0e5: sipush 1933
// 0e8: ldc2_w 5383083641364662024
// 0eb: lload 2
// 0ec: lxor
// 0ed: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f5: astore 30
// 0f7: lload 25
// 0f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fc: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0ff: invokestatic java/lang/Math.ceil (D)D
// 102: d2i
// 103: istore 31
// 105: new java/util/LinkedHashMap
// 108: dup
// 109: invokespecial java/util/LinkedHashMap.<init> ()V
// 10c: checkcast java/util/Map
// 10f: astore 32
// 111: iload 31
// 113: ineg
// 114: istore 33
// 116: iload 33
// 118: aload 29
// 11a: ifnull 13f
// 11d: iload 31
// 11f: if_icmpgt 47d
// 122: goto 12f
// 125: ldc2_w 9010444953407658590
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: iload 31
// 131: ineg
// 132: goto 13f
// 135: ldc2_w 9010444953407658590
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: istore 34
// 141: iload 34
// 143: iload 31
// 145: if_icmpgt 461
// 148: iload 31
// 14a: ineg
// 14b: istore 35
// 14d: iload 35
// 14f: iload 31
// 151: aload 29
// 153: ifnull 465
// 156: if_icmpgt 433
// 159: aload 30
// 15b: iload 33
// 15d: iload 34
// 15f: iload 35
// 161: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 164: dup
// 165: sipush 30787
// 168: ldc2_w 8700048939676154076
// 16b: lload 2
// 16c: lxor
// 16d: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 175: astore 36
// 177: lload 14
// 179: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 17c: aload 36
// 17e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 181: dup
// 182: sipush 27237
// 185: ldc2_w 7025102111717599985
// 188: lload 2
// 189: lxor
// 18a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 192: astore 37
// 194: lload 14
// 196: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 199: aload 36
// 19b: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 19e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1a1: dup
// 1a2: sipush 19006
// 1a5: ldc2_w 174520520633158330
// 1a8: lload 2
// 1a9: lxor
// 1aa: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b2: astore 38
// 1b4: aload 37
// 1b6: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1b9: instanceof net/minecraft/class_2533
// 1bc: aload 29
// 1be: ifnull 435
// 1c1: ifeq 405
// 1c4: aload 37
// 1c6: aload 29
// 1c8: ifnull 1b6
// 1cb: goto 1d8
// 1ce: ldc2_w 9010444953407658590
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: aload 29
// 1da: ifnull 208
// 1dd: getstatic net/minecraft/class_2533.field_11625 Lnet/minecraft/class_2754;
// 1e0: checkcast net/minecraft/class_2769
// 1e3: invokevirtual net/minecraft/class_2680.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
// 1e6: getstatic net/minecraft/class_2760.field_12617 Lnet/minecraft/class_2760;
// 1e9: if_acmpne 405
// 1ec: goto 1f9
// 1ef: ldc2_w 9010444953407658590
// 1f2: lload 2
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: aload 38
// 1fb: goto 208
// 1fe: ldc2_w 9010444953407658590
// 201: lload 2
// 202: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 207: athrow
// 208: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 20b: aload 29
// 20d: ifnull 238
// 210: ifne 24d
// 213: goto 220
// 216: ldc2_w 9010444953407658590
// 219: lload 2
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 38
// 222: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 225: getstatic net/minecraft/class_2246.field_28048 Lnet/minecraft/class_2248;
// 228: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 22b: goto 238
// 22e: ldc2_w 9010444953407658590
// 231: lload 2
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: aload 29
// 23a: ifnull 407
// 23d: ifeq 405
// 240: goto 24d
// 243: ldc2_w 9010444953407658590
// 246: lload 2
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: aload 36
// 24f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 252: dup
// 253: sipush 23154
// 256: ldc2_w 1990694645531646700
// 259: lload 2
// 25a: lxor
// 25b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 263: astore 39
// 265: lload 14
// 267: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 26a: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 26d: dup
// 26e: sipush 7364
// 271: ldc2_w 2416656546506005591
// 274: lload 2
// 275: lxor
// 276: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/u_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27e: astore 40
// 280: nop
// 281: bipush 0
// 282: istore 41
// 284: aload 40
// 286: aload 29
// 288: ifnull 2da
// 28b: instanceof java/util/Collection
// 28e: ifeq 2d8
// 291: goto 29e
// 294: ldc2_w 9010444953407658590
// 297: lload 2
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: aload 40
// 2a0: checkcast java/util/Collection
// 2a3: aload 29
// 2a5: ifnull 2da
// 2a8: goto 2b5
// 2ab: ldc2_w 9010444953407658590
// 2ae: lload 2
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: invokeinterface java/util/Collection.isEmpty ()Z 1
// 2ba: ifeq 2d8
// 2bd: goto 2ca
// 2c0: ldc2_w 9010444953407658590
// 2c3: lload 2
// 2c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: athrow
// 2ca: bipush 0
// 2cb: goto 3e9
// 2ce: ldc2_w 9010444953407658590
// 2d1: lload 2
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: aload 40
// 2da: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2df: astore 42
// 2e1: aload 42
// 2e3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e8: ifeq 3e8
// 2eb: aload 42
// 2ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2f2: astore 43
// 2f4: aload 43
// 2f6: checkcast net/minecraft/class_1297
// 2f9: astore 44
// 2fb: bipush 0
// 2fc: istore 45
// 2fe: aload 44
// 300: instanceof net/minecraft/class_1309
// 303: aload 29
// 305: ifnull 320
// 308: ifeq 3db
// 30b: aload 44
// 30d: checkcast net/minecraft/class_1309
// 310: invokevirtual net/minecraft/class_1309.method_29504 ()Z
// 313: goto 320
// 316: ldc2_w 9010444953407658590
// 319: lload 2
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: aload 29
// 322: ifnull 365
// 325: ifne 3db
// 328: goto 335
// 32b: ldc2_w 9010444953407658590
// 32e: lload 2
// 32f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: athrow
// 335: aload 39
// 337: getfield net/minecraft/class_243.field_1352 D
// 33a: aload 44
// 33c: checkcast net/minecraft/class_1309
// 33f: invokevirtual net/minecraft/class_1309.method_23317 ()D
// 342: dsub
// 343: aload 39
// 345: getfield net/minecraft/class_243.field_1350 D
// 348: aload 44
// 34a: checkcast net/minecraft/class_1309
// 34d: invokevirtual net/minecraft/class_1309.method_23321 ()D
// 350: dsub
// 351: invokestatic java/lang/Math.hypot (DD)D
// 354: ldc2_w 0.800000011920929
// 357: dcmpg
// 358: goto 365
// 35b: ldc2_w 9010444953407658590
// 35e: lload 2
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: aload 29
// 367: ifnull 391
// 36a: ifge 3db
// 36d: goto 37a
// 370: ldc2_w 9010444953407658590
// 373: lload 2
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: aload 44
// 37c: lload 25
// 37e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 381: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 384: goto 391
// 387: ldc2_w 9010444953407658590
// 38a: lload 2
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: aload 29
// 393: ifnull 3c2
// 396: ifne 3db
// 399: goto 3a6
// 39c: ldc2_w 9010444953407658590
// 39f: lload 2
// 3a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: athrow
// 3a6: aload 44
// 3a8: checkcast net/minecraft/class_1309
// 3ab: invokevirtual net/minecraft/class_1309.method_23318 ()D
// 3ae: aload 36
// 3b0: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 3b3: i2d
// 3b4: dcmpg
// 3b5: goto 3c2
// 3b8: ldc2_w 9010444953407658590
// 3bb: lload 2
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: aload 29
// 3c4: ifnull 3d8
// 3c7: ifge 3db
// 3ca: goto 3d7
// 3cd: ldc2_w 9010444953407658590
// 3d0: lload 2
// 3d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d6: athrow
// 3d7: bipush 1
// 3d8: goto 3dc
// 3db: bipush 0
// 3dc: ifeq 2e1
// 3df: bipush 1
// 3e0: aload 29
// 3e2: ifnull 303
// 3e5: goto 3e9
// 3e8: bipush 0
// 3e9: ifeq 405
// 3ec: aload 32
// 3ee: aload 36
// 3f0: aload 37
// 3f2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 3f7: pop
// 3f8: goto 405
// 3fb: ldc2_w 9010444953407658590
// 3fe: lload 2
// 3ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: athrow
// 405: iload 35
// 407: iload 31
// 409: aload 29
// 40b: ifnull 437
// 40e: if_icmpeq 433
// 411: goto 41e
// 414: ldc2_w 9010444953407658590
// 417: lload 2
// 418: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41d: athrow
// 41e: iinc 35 1
// 421: aload 29
// 423: ifnonnull 159
// 426: goto 433
// 429: ldc2_w 9010444953407658590
// 42c: lload 2
// 42d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: athrow
// 433: iload 34
// 435: iload 31
// 437: aload 29
// 439: ifnull 465
// 43c: if_icmpeq 461
// 43f: goto 44c
// 442: ldc2_w 9010444953407658590
// 445: lload 2
// 446: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44b: athrow
// 44c: iinc 34 1
// 44f: aload 29
// 451: ifnonnull 148
// 454: goto 461
// 457: ldc2_w 9010444953407658590
// 45a: lload 2
// 45b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 460: athrow
// 461: iload 33
// 463: iload 31
// 465: if_icmpeq 47d
// 468: iinc 33 1
// 46b: aload 29
// 46d: ifnonnull 12f
// 470: goto 47d
// 473: ldc2_w 9010444953407658590
// 476: lload 2
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: aload 32
// 47f: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 484: checkcast java/lang/Iterable
// 487: astore 35
// 489: aload 35
// 48b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 490: astore 36
// 492: aload 36
// 494: aload 29
// 496: ifnull 4c3
// 499: invokeinterface java/util/Iterator.hasNext ()Z 1
// 49e: ifne 4bc
// 4a1: goto 4ae
// 4a4: ldc2_w 9010444953407658590
// 4a7: lload 2
// 4a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: athrow
// 4ae: aconst_null
// 4af: goto 561
// 4b2: ldc2_w 9010444953407658590
// 4b5: lload 2
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: aload 36
// 4be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4c3: astore 37
// 4c5: aload 36
// 4c7: aload 29
// 4c9: ifnull 4f2
// 4cc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4d1: ifne 4f0
// 4d4: goto 4e1
// 4d7: ldc2_w 9010444953407658590
// 4da: lload 2
// 4db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e0: athrow
// 4e1: aload 37
// 4e3: goto 561
// 4e6: ldc2_w 9010444953407658590
// 4e9: lload 2
// 4ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ef: athrow
// 4f0: aload 37
// 4f2: checkcast java/util/Map$Entry
// 4f5: astore 38
// 4f7: bipush 0
// 4f8: istore 39
// 4fa: getstatic su/catlean/u_.c Lsu/catlean/u_;
// 4fd: aload 38
// 4ff: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 504: iload 16
// 506: swap
// 507: iload 17
// 509: i2b
// 50a: swap
// 50b: checkcast net/minecraft/class_2338
// 50e: iload 18
// 510: invokevirtual su/catlean/u_.l (IBLnet/minecraft/class_2338;I)F
// 513: fstore 38
// 515: aload 36
// 517: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 51c: astore 39
// 51e: aload 39
// 520: checkcast java/util/Map$Entry
// 523: astore 40
// 525: bipush 0
// 526: istore 41
// 528: getstatic su/catlean/u_.c Lsu/catlean/u_;
// 52b: aload 40
// 52d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 532: iload 16
// 534: swap
// 535: iload 17
// 537: i2b
// 538: swap
// 539: checkcast net/minecraft/class_2338
// 53c: iload 18
// 53e: invokevirtual su/catlean/u_.l (IBLnet/minecraft/class_2338;I)F
// 541: fstore 40
// 543: fload 38
// 545: fload 40
// 547: invokestatic java/lang/Float.compare (FF)I
// 54a: ifle 555
// 54d: aload 39
// 54f: astore 37
// 551: fload 40
// 553: fstore 38
// 555: aload 36
// 557: invokeinterface java/util/Iterator.hasNext ()Z 1
// 55c: ifne 515
// 55f: aload 37
// 561: checkcast java/util/Map$Entry
// 564: astore 33
// 566: aload 33
// 568: aload 29
// 56a: ifnull 591
// 56d: ifnull 6d2
// 570: goto 57d
// 573: ldc2_w 9010444953407658590
// 576: lload 2
// 577: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57c: athrow
// 57d: aload 33
// 57f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 584: goto 591
// 587: ldc2_w 9010444953407658590
// 58a: lload 2
// 58b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 590: athrow
// 591: checkcast net/minecraft/class_2680
// 594: getstatic net/minecraft/class_2533.field_11631 Lnet/minecraft/class_2746;
// 597: checkcast net/minecraft/class_2769
// 59a: invokevirtual net/minecraft/class_2680.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
// 59d: checkcast java/lang/Boolean
// 5a0: invokevirtual java/lang/Boolean.booleanValue ()Z
// 5a3: aload 29
// 5a5: ifnull 5dd
// 5a8: ifne 5f2
// 5ab: goto 5b8
// 5ae: ldc2_w 9010444953407658590
// 5b1: lload 2
// 5b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b7: athrow
// 5b8: lload 14
// 5ba: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 5bd: aload 33
// 5bf: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 5c4: checkcast net/minecraft/class_2338
// 5c7: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 5ca: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 5cd: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 5d0: goto 5dd
// 5d3: ldc2_w 9010444953407658590
// 5d6: lload 2
// 5d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5dc: athrow
// 5dd: aload 29
// 5df: ifnull 6ba
// 5e2: ifne 6a8
// 5e5: goto 5f2
// 5e8: ldc2_w 9010444953407658590
// 5eb: lload 2
// 5ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f1: athrow
// 5f2: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 5f5: invokevirtual kotlin/random/Random$Default.nextDouble ()D
// 5f8: ldc2_w 10.0
// 5fb: ddiv
// 5fc: ldc2_w 0.5
// 5ff: dadd
// 600: dstore 34
// 602: new net/minecraft/class_243
// 605: dup
// 606: aload 33
// 608: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 60d: checkcast net/minecraft/class_2338
// 610: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 613: i2d
// 614: dload 34
// 616: dadd
// 617: aload 33
// 619: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 61e: checkcast net/minecraft/class_2338
// 621: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 624: i2d
// 625: aload 33
// 627: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 62c: checkcast net/minecraft/class_2338
// 62f: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 632: i2d
// 633: dload 34
// 635: dadd
// 636: invokespecial net/minecraft/class_243.<init> (DDD)V
// 639: astore 36
// 63b: getstatic su/catlean/u_.t Lsu/catlean/i9;
// 63e: aload 29
// 640: ifnull 6a0
// 643: iload 11
// 645: i2s
// 646: iload 12
// 648: iload 13
// 64a: i2s
// 64b: bipush 5
// 64c: invokevirtual su/catlean/i9.g (SISI)Z
// 64f: ifeq 69d
// 652: goto 65f
// 655: ldc2_w 9010444953407658590
// 658: lload 2
// 659: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65e: athrow
// 65f: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 662: new su/catlean/t5
// 665: dup
// 666: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 669: aload 36
// 66b: lload 9
// 66d: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 670: lload 21
// 672: sipush 20520
// 675: ldc2_w 6227595279469874687
// 678: lload 2
// 679: lxor
// 67a: invokedynamic i (IJ)I bsm=su/catlean/u_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67f: aload 33
// 681: invokedynamic invoke (Ljava/util/Map$Entry;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/u_.r (Ljava/util/Map$Entry;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 686: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 689: lload 7
// 68b: dup2_x1
// 68c: pop2
// 68d: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 690: goto 69d
// 693: ldc2_w 9010444953407658590
// 696: lload 2
// 697: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69c: athrow
// 69d: getstatic su/catlean/u_.d Lsu/catlean/i9;
// 6a0: lload 27
// 6a2: invokevirtual su/catlean/i9.X (J)V
// 6a5: goto 6d2
// 6a8: aload 0
// 6a9: aload 33
// 6ab: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 6b0: lload 19
// 6b2: dup2_x1
// 6b3: pop2
// 6b4: checkcast net/minecraft/class_2338
// 6b7: invokespecial su/catlean/u_.w (JLnet/minecraft/class_2338;)Z
// 6ba: ifeq 6d2
// 6bd: getstatic su/catlean/u_.d Lsu/catlean/i9;
// 6c0: lload 27
// 6c2: invokevirtual su/catlean/i9.X (J)V
// 6c5: goto 6d2
// 6c8: ldc2_w 9010444953407658590
// 6cb: lload 2
// 6cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d1: athrow
// 6d2: return
}

private final boolean w(long var1, class_2338 var3) {
var1 = a ^ var1;
int var4 = (int)((var1 ^ 88228034992925L) >>> 32);
int var5 = (int)((var1 ^ 88228034992925L) << 32 >>> 32);
long var6 = var1 ^ 41435664430436L;
long var8 = var1 ^ 119318252214671L;
long var10 = var1 ^ 31689145260509L;
long var12 = var1 ^ 27938821251449L;
long var14 = var1 ^ 3053017938507L;
long var16 = var1 ^ 12606164442764L;
String[] var10000 = vm.a<"Å">(-3734848794744744249L, var1);
fg var19 = gg.P.X(var12, u_::G, this.P(var4, var5));
String[] var18 = var10000;

try {
boolean var24 = var19.R();
if (var18 == null) {
return var24;
}

if (!var24) {
return true;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -3707123876260762664L, var1);
}

gw var25 = gw.Y;
class_2338 var10001 = var3.method_10074();
Intrinsics.checkNotNullExpressionValue(var10001, b<"i">(6937, 501226302776142346L ^ var1));
class_3965 var20 = gw.j(
var25,
var10001,
-1,
var10,
xx.Strict,
y4.ALL,
(float)zf.v(var16).method_55754(),
(float)zf.v(var16).method_55754(),
null,
c<"i">(3307, 1971180784750616761L ^ var1),
null
);

try {
if (var1 > 0L && var20 != null) {
_8 var26 = _8.P;
ye var10003 = _w.W;
class_243 var10004 = var20.method_17784();
Intrinsics.checkNotNullExpressionValue(var10004, b<"i">(9681, 6492214190163088576L ^ var1));
var26.C(var6, new t5(var10003.I(var10004, var8), var14, c<"i">(21631, 8468255370908678187L ^ var1), u_::T));
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -3707123876260762664L, var1);
}

return true;
}

private final void s(class_2338 var1, long var2) {
var2 = a ^ var2;
int var4 = (int)((var2 ^ 55886873776547L) >>> 32);
long var5 = (var2 ^ 55886873776547L) << 32 >>> 32;
long var7 = var2 ^ 51992659861676L;
double var9 = Random.Default.nextDouble() / 10.0 + 0.5;
class_3965 var11 = new class_3965(
new class_243(var1.method_10263() + var9, var1.method_10264(), var1.method_10260() + var9), class_2350.field_11033, var1, false
);
zf.Z(var4, var5).method_2896(zf.v(var7), class_1268.field_5808, var11);
zf.v(var7).method_6104(class_1268.field_5808);
}

public final float l(int a, byte a, @NotNull class_2338 pos, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
long var7 = var5 ^ 25899799309527L;
String[] var10000 = vm.a<"Å">(-4724212003515407204L, var5);
Intrinsics.checkNotNullParameter(pos, b<"i">(11572, 5443700942972694132L ^ var5));
String[] var9 = var10000;

try {
float var11 = (float)Math.abs(
class_3532.method_15338(
Math.toDegrees(Math.atan2(pos.method_46558().field_1350 - zf.v(var7).method_23321(), pos.method_46558().field_1352 - zf.v(var7).method_23317())) - 90.0
)
- class_3532.method_15393(zf.v(var7).method_36454())
);
if (var9 == null) {
vm.a<"Å">(new _g[5], -4710874086602591070L, var5);
}

return var11;
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -4695360500073375357L, var5);
}
}

private static final Unit r(Entry var0) {
long var1 = a ^ 35823385885118L;
long var3 = var1 ^ 55704495573629L;
c.s((class_2338)var0.getKey(), var3);
return Unit.INSTANCE;
}

private static final boolean G(class_1799 var0) {
long var1 = a ^ 3345276760663L;
Intrinsics.checkNotNullParameter(var0, b<"i">(22533, 4802871749963413275L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_28042);
}

private static final class_2596 V(class_3965 var0, int var1) {
return (class_2596)(new class_2885(class_1268.field_5808, var0, var1));
}

private static final Unit t(class_2338 param0, class_3965 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u_.a J
// 03: ldc2_w 128825115584687
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 113348781529964
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 81427724624738
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 103941178952705
// 1b: lxor
// 1c: dup2
// 1d: bipush 32
// 1f: lushr
// 20: l2i
// 21: istore 8
// 23: dup2
// 24: bipush 32
// 26: lshl
// 27: bipush 40
// 29: lushr
// 2a: l2i
// 2b: istore 9
// 2d: dup2
// 2e: bipush 56
// 30: lshl
// 31: bipush 56
// 33: lushr
// 34: l2i
// 35: istore 10
// 37: pop2
// 38: dup2
// 39: ldc2_w 74928402933285
// 3c: lxor
// 3d: lstore 11
// 3f: dup2
// 40: ldc2_w 20649387694710
// 43: lxor
// 44: lstore 13
// 46: dup2
// 47: ldc2_w 100070703037049
// 4a: lxor
// 4b: lstore 15
// 4d: pop2
// 4e: ldc2_w -3976327177037770179
// 51: lload 2
// 52: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 5a: lload 6
// 5c: bipush 1
// 5d: invokevirtual su/catlean/wu.G (JZ)V
// 60: aload 1
// 61: invokedynamic predict (Lnet/minecraft/class_3965;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/u_.V (Lnet/minecraft/class_3965;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 66: lload 11
// 68: dup2_x1
// 69: pop2
// 6a: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 6d: lload 13
// 6f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 72: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 75: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 78: astore 17
// 7a: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 7d: lload 6
// 7f: bipush 0
// 80: invokevirtual su/catlean/wu.G (JZ)V
// 83: getstatic su/catlean/u_.c Lsu/catlean/u_;
// 86: aload 0
// 87: lload 4
// 89: invokespecial su/catlean/u_.s (Lnet/minecraft/class_2338;J)V
// 8c: aload 17
// 8e: ifnull cc
// 91: getstatic su/catlean/u_.c Lsu/catlean/u_;
// 94: iload 8
// 96: iload 9
// 98: iload 10
// 9a: i2b
// 9b: invokespecial su/catlean/u_.h (IIB)Z
// 9e: ifeq c4
// a1: goto ae
// a4: ldc2_w -4001518873357275358
// a7: lload 2
// a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad: athrow
// ae: getstatic su/catlean/u_.c Lsu/catlean/u_;
// b1: aload 0
// b2: lload 4
// b4: invokespecial su/catlean/u_.s (Lnet/minecraft/class_2338;J)V
// b7: goto c4
// ba: ldc2_w -4001518873357275358
// bd: lload 2
// be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3: athrow
// c4: getstatic su/catlean/u_.t Lsu/catlean/i9;
// c7: lload 15
// c9: invokevirtual su/catlean/i9.X (J)V
// cc: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// cf: areturn
}

private static final Unit T(fg var0, class_2338 var1, class_3965 var2) {
long var3 = a ^ 90723010433638L;
long var5 = var3 ^ 74224784789337L;
int var7 = (int)((var3 ^ 121116228035886L) >>> 32);
int var8 = (int)((var3 ^ 121116228035886L) << 32 >>> 32);
gg.P.T(var5, var0.a(), c.P(var7, var8), u_::t);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 75894938175723L;
long var22 = var20 ^ 60898995486553L;
long var24 = var20 ^ 11952229589737L;
long var26 = var20 ^ 41203622915983L;
long var28 = var20 ^ 109971730830651L;
long var30 = var20 ^ 124967106941551L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[20];
int var16 = 0;
String var15 = "ÒMÅr&µ\u008añ\rz¿õgfo´tÕl«\u0097ÛÄ\u007f\u0082\u0005UbÄp\u0019\u0099(é\u0081\u0014a½o\u008fv\u008dF\fÅÈn«Ý\u009f\u001bìZÎn\u0098\u0019\nOy\u0082kcq\u0001;¾þ\u0010íI×Ô(2ZEPI|\u008c\u0019Á\u009a\u0088×\u001bi14:\u0091µ°t\tê~|´orÀª)±¢ÜÿklF3Ù :õ¨\u0091=¹\u0083ñ\u007f\u000e\u0098\u0098H.»nB¼³\u009fn2n{\u007f\u00adö«S¤^q\u0010<Ø%õ\u009a°\"Ùh\u0098\u008e¹Ì¦£Ë8¾B\u0091½ ÛÃHÌ\u001f\u009e«\u009bêtÂÆ'\u008c\u008do6\bRK+\u001d\u009e=£\u0000¼\n\u0001\u0093Ä\u0014\u009b_ô\\'J ú7¦ëÛJ³¿C¿ØG8\u001f=â£\u0000\u0006\u0015ï_îý,÷Æ2*ñÁ,·Áýn\u000fû\u0086\u0090ÀH{°ÄT¤\u008b¿?6£¢qQÃ·áßnõá\\Ælï\u0085\u0013? >¿OÜI?Ïl\u0088²Ö\u0092P¶\u0007Ëù¥B\u001b* \u0015+¼ça¬\u001d\u0007³{\u0010®ÕÙå-Hw¾=ã\u0003& \u0089þæ\u0018,§Ð_ºûÝà\u008c\\Ã\u0095\u0000c#Æ\u0016\u009bq¡¶Ð«\u00ad\u0018û\u0000íYä\u008eõèÊ:^V1\u009c\u000fÛ7û\u0014+_ép«\u0018Q¡\"ñö«¼«)÷\u0081=m\u009c\u008b\u001ddDøµæüøÙ\u0018\u0090;¯\u001aââé£°á1iHÔ.\u008dÉí\u00adI\u009cÕ{$\u0010~vÖ\u0017ÐØq+í7úÄ]Dée\u0010z\u008d9÷\u000f~ÿ«fY\\\u007f¥p\u001a\u0083\u0010!Ë÷Ë§\u009bV\u0017t\u0002!Ë\u0001Ý\u0007K\u0018´r2\t´Ì½\u001eÊæ)\u0096\u0000pP¬M×\u00147)À¼Ê(\u0094\u0011;Élqz¡ß¤GÏ+\u0014\u008ct\u0086¤&J~\u00ad\"évH\nç}8\u0010\u008d¨i\u0014\u0015\u0013\u008d«M";
int var17 = "ÒMÅr&µ\u008añ\rz¿õgfo´tÕl«\u0097ÛÄ\u007f\u0082\u0005UbÄp\u0019\u0099(é\u0081\u0014a½o\u008fv\u008dF\fÅÈn«Ý\u009f\u001bìZÎn\u0098\u0019\nOy\u0082kcq\u0001;¾þ\u0010íI×Ô(2ZEPI|\u008c\u0019Á\u009a\u0088×\u001bi14:\u0091µ°t\tê~|´orÀª)±¢ÜÿklF3Ù :õ¨\u0091=¹\u0083ñ\u007f\u000e\u0098\u0098H.»nB¼³\u009fn2n{\u007f\u00adö«S¤^q\u0010<Ø%õ\u009a°\"Ùh\u0098\u008e¹Ì¦£Ë8¾B\u0091½ ÛÃHÌ\u001f\u009e«\u009bêtÂÆ'\u008c\u008do6\bRK+\u001d\u009e=£\u0000¼\n\u0001\u0093Ä\u0014\u009b_ô\\'J ú7¦ëÛJ³¿C¿ØG8\u001f=â£\u0000\u0006\u0015ï_îý,÷Æ2*ñÁ,·Áýn\u000fû\u0086\u0090ÀH{°ÄT¤\u008b¿?6£¢qQÃ·áßnõá\\Ælï\u0085\u0013? >¿OÜI?Ïl\u0088²Ö\u0092P¶\u0007Ëù¥B\u001b* \u0015+¼ça¬\u001d\u0007³{\u0010®ÕÙå-Hw¾=ã\u0003& \u0089þæ\u0018,§Ð_ºûÝà\u008c\\Ã\u0095\u0000c#Æ\u0016\u009bq¡¶Ð«\u00ad\u0018û\u0000íYä\u008eõèÊ:^V1\u009c\u000fÛ7û\u0014+_ép«\u0018Q¡\"ñö«¼«)÷\u0081=m\u009c\u008b\u001ddDøµæüøÙ\u0018\u0090;¯\u001aââé£°á1iHÔ.\u008dÉí\u00adI\u009cÕ{$\u0010~vÖ\u0017ÐØq+í7úÄ]Dée\u0010z\u008d9÷\u000f~ÿ«fY\\\u007f¥p\u001a\u0083\u0010!Ë÷Ë§\u009bV\u0017t\u0002!Ë\u0001Ý\u0007K\u0018´r2\t´Ì½\u001eÊæ)\u0096\u0000pP¬M×\u00147)À¼Ê(\u0094\u0011;Élqz¡ß¤GÏ+\u0014\u008ct\u0086¤&J~\u00ad\"évH\nç}8\u0010\u008d¨i\u0014\u0015\u0013\u008d«M"
.length();
char var14 = ' ';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var47;
if ((var35 += var14) >= var17) {
b = var18;
e = new String[20];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "/n\u001f\u00131º\u0082¡OIõ\u0085\u008br×æC\u001bé\bN5\u0014òD\u0080o»\u001dë\u007fe>9¸¢ÊÃÝÊ";
int var5 = "/n\u001f\u00131º\u0082¡OIõ\u0085\u008br×æC\u001bé\bN5\u0014òD\u0080o»\u001dë\u007fe>9¸¢ÊÃÝÊ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
var10001 = var3++;
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
var39[var10001] = var56;
if (var2 >= var5) {
j = var6;
k = new Integer[7];
KProperty[] var32 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u_.class, b<"i">(24369, 6726430682232031890L ^ var20), b<"i">(28095, 8668091958064723985L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u_.class, b<"i">(27265, 4322493419436031807L ^ var20), b<"i">(1698, 7734880899920253706L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u_.class, b<"i">(1199, 6039895447334670608L ^ var20), b<"i">(18115, 1481534743466316642L ^ var20), 0)
)
};
h = var32;
c = new u_(var30);
S = yp.L(
c,
b<"i">(31174, 2589490881349758063L ^ var20),
0,
new IntRange(0, c<"i">(24072, 3531144160481122017L ^ var20)),
var24,
null,
null,
c<"i">(8592, 2900304523379206523L ^ var20),
null
);
g = yp.L(c, b<"i">(2159, 2725964013392256463L ^ var20), f9.SILENT_FULL, null, null, c<"i">(6602, 5142997825541460258L ^ var20), null, var28);
f = yp.t(c, b<"i">(6514, 5654632897770376406L ^ var20), true, var26, null, null, c<"i">(20333, 7989104570198951811L ^ var20), null);
d = new i9(var22);
t = new i9(var22);
return;
}
break;
default:
var39[var10001] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "\u0092Í\u0005ëµbô\tA½Pëá\u001d=s";
var5 = "\u0092Í\u0005ëµbô\tA½Pëá\u001d=s".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var39 = var6;
var10001 = var3++;
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

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var47;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "s\u008bÚ/\u0012ÅÔ\u0081\u008c#Ê4ÂÚÂåö\u0082éxÒÐy% E\u00adtÅ\u0013+K\u000b¹Èt-iÏ\u008eè\u0088rèô\u0006xvuK\u0084-¢\u0095\u008b¬Û";
var17 = "s\u008bÚ/\u0012ÅÔ\u0081\u008c#Ê4ÂÚÂåö\u0082éxÒÐy% E\u00adtÅ\u0013+K\u000b¹Èt-iÏ\u008eè\u0088rèô\u0006xvuK\u0084-¢\u0095\u008b¬Û".length();
var14 = 24;
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15600;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u_", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/u_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8631;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = j[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/u_", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/u_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
