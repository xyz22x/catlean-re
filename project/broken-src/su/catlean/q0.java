package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1735;
import net.minecraft.class_1739;
import net.minecraft.class_1792;
import net.minecraft.class_1842;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q0 extends _g {
@NotNull
public static final q0 d;
static final KProperty[] Y;
@NotNull
private static final cw i;
@NotNull
private static final c8 X;
@NotNull
private static final cq t;
@NotNull
private static final cw x;
@NotNull
private static final cq F;
@NotNull
private static final bg P;
@NotNull
private static final Map h;
@Nullable
private static class_2338 o;
private static final long a = yz.a(7132504836130794636L, 4528798078840085108L, MethodHandles.lookup().lookupClass()).a(126132845364236L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map j;

private q0(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 84549102583903L;
super(b<"w">(19326, 8319570533379729559L ^ var1), jt.d(), null, 4, null, var3);
}

private final m0 v(short var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 122678970083158L;
return (m0)i.E(this, var6, Y[0]);
}

private final int I(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 8541005492523L;
return ((Number)X.E(this, var6, Y[1])).intValue();
}

private final boolean h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 84683596160606L;
return (Boolean)t.E(this, var3, Y[2]);
}

private final mz W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 97572539562010L;
return (mz)x.E(this, var3, Y[3]);
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 120004874299518L;
return (Boolean)F.E(this, var3, Y[4]);
}

@Flow
private final void l(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q0.a J
// 003: ldc2_w 13391084077149
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 39024211553039
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 32
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 516850677894
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 88744576195579
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 49635731992481
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 111719005971659
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 45455235724571
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 126371565354393
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 82643755711858
// 058: lxor
// 059: dup2
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 19
// 060: dup2
// 061: bipush 16
// 063: lshl
// 064: bipush 48
// 066: lushr
// 067: l2i
// 068: istore 20
// 06a: dup2
// 06b: bipush 32
// 06d: lshl
// 06e: bipush 32
// 070: lushr
// 071: l2i
// 072: istore 21
// 074: pop2
// 075: dup2
// 076: ldc2_w 98386463486249
// 079: lxor
// 07a: lstore 22
// 07c: dup2
// 07d: ldc2_w 40962985743645
// 080: lxor
// 081: lstore 24
// 083: dup2
// 084: ldc2_w 4384622068809
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 37150054540327
// 08e: lxor
// 08f: lstore 28
// 091: dup2
// 092: ldc2_w 96647187886930
// 095: lxor
// 096: dup2
// 097: bipush 32
// 099: lushr
// 09a: l2i
// 09b: istore 30
// 09d: dup2
// 09e: bipush 32
// 0a0: lshl
// 0a1: bipush 40
// 0a3: lushr
// 0a4: l2i
// 0a5: istore 31
// 0a7: dup2
// 0a8: bipush 56
// 0aa: lshl
// 0ab: bipush 56
// 0ad: lushr
// 0ae: l2i
// 0af: istore 32
// 0b1: pop2
// 0b2: dup2
// 0b3: ldc2_w 110016462488394
// 0b6: lxor
// 0b7: lstore 33
// 0b9: dup2
// 0ba: ldc2_w 10040051565145
// 0bd: lxor
// 0be: lstore 35
// 0c0: dup2
// 0c1: ldc2_w 2102579450375
// 0c4: lxor
// 0c5: lstore 37
// 0c7: dup2
// 0c8: ldc2_w 80447783234979
// 0cb: lxor
// 0cc: lstore 39
// 0ce: pop2
// 0cf: ldc2_w -7635903876985845149
// 0d2: lload 2
// 0d3: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: istore 46
// 0da: lload 26
// 0dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0df: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0e2: instanceof net/minecraft/class_1708
// 0e5: iload 46
// 0e7: ifeq a70
// 0ea: ifeq a5d
// 0ed: goto 0fa
// 0f0: ldc2_w -7570780303709861289
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: lload 26
// 0fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ff: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 102: dup
// 103: sipush 13264
// 106: ldc2_w 1513281193322878868
// 109: lload 2
// 10a: lxor
// 10b: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 113: checkcast net/minecraft/class_1708
// 116: astore 47
// 118: aload 0
// 119: lload 22
// 11b: invokespecial su/catlean/q0.Q (J)Z
// 11e: iload 46
// 120: ifeq 1a7
// 123: ifeq 1a6
// 126: goto 133
// 129: ldc2_w -7570780303709861289
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 0
// 134: getstatic net/minecraft/class_1802.field_8183 Lnet/minecraft/class_1792;
// 137: dup
// 138: sipush 20154
// 13b: ldc2_w 989683301660682983
// 13e: lload 2
// 13f: lxor
// 140: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 148: iload 46
// 14a: ifeq 192
// 14d: goto 15a
// 150: ldc2_w -7570780303709861289
// 153: lload 2
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: lload 7
// 15c: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 15f: bipush -1
// 160: if_icmpeq 1a5
// 163: goto 170
// 166: ldc2_w -7570780303709861289
// 169: lload 2
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: aload 0
// 171: getstatic net/minecraft/class_1802.field_8183 Lnet/minecraft/class_1792;
// 174: dup
// 175: sipush 11126
// 178: ldc2_w 1574106683506495283
// 17b: lload 2
// 17c: lxor
// 17d: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 185: goto 192
// 188: ldc2_w -7570780303709861289
// 18b: lload 2
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: bipush 4
// 193: istore 41
// 195: astore 42
// 197: iload 30
// 199: iload 31
// 19b: aload 42
// 19d: iload 41
// 19f: iload 32
// 1a1: i2b
// 1a2: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 1a5: return
// 1a6: bipush 0
// 1a7: istore 48
// 1a9: iload 48
// 1ab: bipush 3
// 1ac: if_icmpge 2ec
// 1af: lload 26
// 1b1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b4: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 1b7: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 1ba: iload 48
// 1bc: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 1bf: checkcast net/minecraft/class_1735
// 1c2: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 1c5: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1c8: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 1cb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1ce: iload 46
// 1d0: ifeq 30e
// 1d3: iload 46
// 1d5: ifeq 224
// 1d8: goto 1e5
// 1db: ldc2_w -7570780303709861289
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: ifeq 2e4
// 1e8: goto 1f5
// 1eb: ldc2_w -7570780303709861289
// 1ee: lload 2
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: aload 0
// 1f6: getstatic net/minecraft/class_1847.field_8991 Lnet/minecraft/class_6880;
// 1f9: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 1fe: dup
// 1ff: sipush 14737
// 202: ldc2_w 5063483457886428636
// 205: lload 2
// 206: lxor
// 207: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 20f: checkcast net/minecraft/class_1842
// 212: lload 13
// 214: invokespecial su/catlean/q0.c (Lnet/minecraft/class_1842;J)I
// 217: goto 224
// 21a: ldc2_w -7570780303709861289
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: istore 49
// 226: iload 46
// 228: ifeq 2e7
// 22b: getstatic su/catlean/q0.P Lsu/catlean/bg;
// 22e: aload 0
// 22f: iload 19
// 231: i2s
// 232: iload 20
// 234: i2s
// 235: iload 21
// 237: invokespecial su/catlean/q0.I (SSI)I
// 23a: lload 17
// 23c: invokevirtual su/catlean/bg.c (IJ)Z
// 23f: ifeq 2e4
// 242: goto 24f
// 245: ldc2_w -7570780303709861289
// 248: lload 2
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: iload 49
// 251: bipush -1
// 252: iload 46
// 254: ifeq 2b4
// 257: goto 264
// 25a: ldc2_w -7570780303709861289
// 25d: lload 2
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: if_icmpeq 2e4
// 267: goto 274
// 26a: ldc2_w -7570780303709861289
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: iload 49
// 276: lload 9
// 278: bipush 0
// 279: aconst_null
// 27a: bipush 0
// 27b: sipush 15632
// 27e: ldc2_w 6477764281021660672
// 281: lload 2
// 282: lxor
// 283: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: aconst_null
// 289: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 28c: iload 48
// 28e: lload 9
// 290: bipush 0
// 291: aconst_null
// 292: bipush 0
// 293: sipush 8373
// 296: ldc2_w 7577662925663265707
// 299: lload 2
// 29a: lxor
// 29b: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: aconst_null
// 2a1: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2a4: iload 49
// 2a6: bipush 0
// 2a7: goto 2b4
// 2aa: ldc2_w -7570780303709861289
// 2ad: lload 2
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: aconst_null
// 2b5: bipush 0
// 2b6: sipush 8373
// 2b9: ldc2_w 7577662925663265707
// 2bc: lload 2
// 2bd: lxor
// 2be: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: aconst_null
// 2c4: astore 41
// 2c6: istore 42
// 2c8: istore 43
// 2ca: astore 44
// 2cc: istore 45
// 2ce: lload 9
// 2d0: iload 45
// 2d2: aload 44
// 2d4: iload 43
// 2d6: iload 42
// 2d8: aload 41
// 2da: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2dd: getstatic su/catlean/q0.P Lsu/catlean/bg;
// 2e0: invokevirtual su/catlean/bg.l ()V
// 2e3: return
// 2e4: iinc 48 1
// 2e7: iload 46
// 2e9: ifne 1a9
// 2ec: aload 0
// 2ed: getstatic net/minecraft/class_1847.field_8991 Lnet/minecraft/class_6880;
// 2f0: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 2f5: dup
// 2f6: sipush 14737
// 2f9: ldc2_w 5063483457886428636
// 2fc: lload 2
// 2fd: lxor
// 2fe: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 306: checkcast net/minecraft/class_1842
// 309: lload 15
// 30b: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 30e: iload 46
// 310: ifeq 3eb
// 313: ifeq 3c9
// 316: goto 323
// 319: ldc2_w -7570780303709861289
// 31c: lload 2
// 31d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: athrow
// 323: aload 0
// 324: getstatic net/minecraft/class_1802.field_8790 Lnet/minecraft/class_1792;
// 327: dup
// 328: sipush 15729
// 32b: ldc2_w 5525404555483257123
// 32e: lload 2
// 32f: lxor
// 330: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 335: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 338: lload 7
// 33a: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 33d: iload 46
// 33f: ifeq 3eb
// 342: goto 34f
// 345: ldc2_w -7570780303709861289
// 348: lload 2
// 349: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: athrow
// 34f: bipush -1
// 350: if_icmpeq 3c9
// 353: goto 360
// 356: ldc2_w -7570780303709861289
// 359: lload 2
// 35a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: athrow
// 360: lload 26
// 362: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 365: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 368: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 36b: bipush 3
// 36c: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 36f: checkcast net/minecraft/class_1735
// 372: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 375: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 378: getstatic net/minecraft/class_1802.field_8790 Lnet/minecraft/class_1792;
// 37b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 37e: iload 46
// 380: ifeq 3eb
// 383: goto 390
// 386: ldc2_w -7570780303709861289
// 389: lload 2
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: athrow
// 390: ifne 3c9
// 393: goto 3a0
// 396: ldc2_w -7570780303709861289
// 399: lload 2
// 39a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39f: athrow
// 3a0: aload 0
// 3a1: getstatic net/minecraft/class_1802.field_8790 Lnet/minecraft/class_1792;
// 3a4: dup
// 3a5: sipush 22512
// 3a8: ldc2_w 7858398540883325862
// 3ab: lload 2
// 3ac: lxor
// 3ad: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3b5: bipush 3
// 3b6: istore 41
// 3b8: astore 42
// 3ba: iload 30
// 3bc: iload 31
// 3be: aload 42
// 3c0: iload 41
// 3c2: iload 32
// 3c4: i2b
// 3c5: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 3c8: return
// 3c9: aload 0
// 3ca: getstatic net/minecraft/class_1847.field_8999 Lnet/minecraft/class_6880;
// 3cd: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 3d2: dup
// 3d3: sipush 14737
// 3d6: ldc2_w 5063483457886428636
// 3d9: lload 2
// 3da: lxor
// 3db: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e3: checkcast net/minecraft/class_1842
// 3e6: lload 15
// 3e8: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 3eb: iload 46
// 3ed: ifeq 4ce
// 3f0: ifeq 4ac
// 3f3: goto 400
// 3f6: ldc2_w -7570780303709861289
// 3f9: lload 2
// 3fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ff: athrow
// 400: aload 0
// 401: aload 0
// 402: iload 4
// 404: i2s
// 405: iload 5
// 407: iload 6
// 409: i2s
// 40a: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 40d: invokevirtual su/catlean/m0.e ()Lnet/minecraft/class_1792;
// 410: lload 7
// 412: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 415: iload 46
// 417: ifeq 4ce
// 41a: goto 427
// 41d: ldc2_w -7570780303709861289
// 420: lload 2
// 421: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 426: athrow
// 427: bipush -1
// 428: if_icmpeq 4ac
// 42b: goto 438
// 42e: ldc2_w -7570780303709861289
// 431: lload 2
// 432: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 437: athrow
// 438: lload 26
// 43a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43d: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 440: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 443: bipush 3
// 444: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 447: checkcast net/minecraft/class_1735
// 44a: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 44d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 450: aload 0
// 451: iload 4
// 453: i2s
// 454: iload 5
// 456: iload 6
// 458: i2s
// 459: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 45c: invokevirtual su/catlean/m0.e ()Lnet/minecraft/class_1792;
// 45f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 462: iload 46
// 464: ifeq 4ce
// 467: goto 474
// 46a: ldc2_w -7570780303709861289
// 46d: lload 2
// 46e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 473: athrow
// 474: ifne 4ac
// 477: goto 484
// 47a: ldc2_w -7570780303709861289
// 47d: lload 2
// 47e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 483: athrow
// 484: aload 0
// 485: aload 0
// 486: iload 4
// 488: i2s
// 489: iload 5
// 48b: iload 6
// 48d: i2s
// 48e: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 491: invokevirtual su/catlean/m0.e ()Lnet/minecraft/class_1792;
// 494: iload 30
// 496: swap
// 497: iload 31
// 499: swap
// 49a: bipush 3
// 49b: iload 32
// 49d: i2b
// 49e: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 4a1: return
// 4a2: ldc2_w -7570780303709861289
// 4a5: lload 2
// 4a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ab: athrow
// 4ac: aload 0
// 4ad: getstatic net/minecraft/class_1847.field_8968 Lnet/minecraft/class_6880;
// 4b0: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 4b5: dup
// 4b6: sipush 14737
// 4b9: ldc2_w 5063483457886428636
// 4bc: lload 2
// 4bd: lxor
// 4be: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4c6: checkcast net/minecraft/class_1842
// 4c9: lload 15
// 4cb: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 4ce: iload 46
// 4d0: ifeq 5e8
// 4d3: ifeq 5c6
// 4d6: goto 4e3
// 4d9: ldc2_w -7570780303709861289
// 4dc: lload 2
// 4dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e2: athrow
// 4e3: aload 0
// 4e4: iload 4
// 4e6: i2s
// 4e7: iload 5
// 4e9: iload 6
// 4eb: i2s
// 4ec: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 4ef: invokevirtual su/catlean/m0.D ()Lnet/minecraft/class_1792;
// 4f2: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 4f5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4f8: iload 46
// 4fa: ifeq 5e8
// 4fd: goto 50a
// 500: ldc2_w -7570780303709861289
// 503: lload 2
// 504: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 509: athrow
// 50a: ifne 5c6
// 50d: goto 51a
// 510: ldc2_w -7570780303709861289
// 513: lload 2
// 514: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 519: athrow
// 51a: aload 0
// 51b: aload 0
// 51c: iload 4
// 51e: i2s
// 51f: iload 5
// 521: iload 6
// 523: i2s
// 524: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 527: invokevirtual su/catlean/m0.D ()Lnet/minecraft/class_1792;
// 52a: lload 7
// 52c: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 52f: iload 46
// 531: ifeq 5e8
// 534: goto 541
// 537: ldc2_w -7570780303709861289
// 53a: lload 2
// 53b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 540: athrow
// 541: bipush -1
// 542: if_icmpeq 5c6
// 545: goto 552
// 548: ldc2_w -7570780303709861289
// 54b: lload 2
// 54c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 551: athrow
// 552: lload 26
// 554: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 557: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 55a: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 55d: bipush 3
// 55e: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 561: checkcast net/minecraft/class_1735
// 564: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 567: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 56a: aload 0
// 56b: iload 4
// 56d: i2s
// 56e: iload 5
// 570: iload 6
// 572: i2s
// 573: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 576: invokevirtual su/catlean/m0.D ()Lnet/minecraft/class_1792;
// 579: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 57c: iload 46
// 57e: ifeq 5e8
// 581: goto 58e
// 584: ldc2_w -7570780303709861289
// 587: lload 2
// 588: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58d: athrow
// 58e: ifne 5c6
// 591: goto 59e
// 594: ldc2_w -7570780303709861289
// 597: lload 2
// 598: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59d: athrow
// 59e: aload 0
// 59f: aload 0
// 5a0: iload 4
// 5a2: i2s
// 5a3: iload 5
// 5a5: iload 6
// 5a7: i2s
// 5a8: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 5ab: invokevirtual su/catlean/m0.D ()Lnet/minecraft/class_1792;
// 5ae: iload 30
// 5b0: swap
// 5b1: iload 31
// 5b3: swap
// 5b4: bipush 3
// 5b5: iload 32
// 5b7: i2b
// 5b8: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 5bb: return
// 5bc: ldc2_w -7570780303709861289
// 5bf: lload 2
// 5c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c5: athrow
// 5c6: aload 0
// 5c7: getstatic net/minecraft/class_1847.field_8978 Lnet/minecraft/class_6880;
// 5ca: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 5cf: dup
// 5d0: sipush 14737
// 5d3: ldc2_w 5063483457886428636
// 5d6: lload 2
// 5d7: lxor
// 5d8: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5e0: checkcast net/minecraft/class_1842
// 5e3: lload 15
// 5e5: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 5e8: iload 46
// 5ea: ifeq 6ca
// 5ed: ifne 6c9
// 5f0: goto 5fd
// 5f3: ldc2_w -7570780303709861289
// 5f6: lload 2
// 5f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fc: athrow
// 5fd: aload 0
// 5fe: getstatic net/minecraft/class_1847.field_9005 Lnet/minecraft/class_6880;
// 601: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 606: dup
// 607: sipush 14737
// 60a: ldc2_w 5063483457886428636
// 60d: lload 2
// 60e: lxor
// 60f: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 614: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 617: checkcast net/minecraft/class_1842
// 61a: lload 15
// 61c: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 61f: iload 46
// 621: ifeq 6ca
// 624: goto 631
// 627: ldc2_w -7570780303709861289
// 62a: lload 2
// 62b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 630: athrow
// 631: ifne 6c9
// 634: goto 641
// 637: ldc2_w -7570780303709861289
// 63a: lload 2
// 63b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 640: athrow
// 641: aload 0
// 642: getstatic net/minecraft/class_1847.field_9005 Lnet/minecraft/class_6880;
// 645: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 64a: dup
// 64b: sipush 14737
// 64e: ldc2_w 5063483457886428636
// 651: lload 2
// 652: lxor
// 653: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 658: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 65b: checkcast net/minecraft/class_1842
// 65e: lload 15
// 660: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 663: iload 46
// 665: ifeq 6ca
// 668: goto 675
// 66b: ldc2_w -7570780303709861289
// 66e: lload 2
// 66f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 674: athrow
// 675: ifne 6c9
// 678: goto 685
// 67b: ldc2_w -7570780303709861289
// 67e: lload 2
// 67f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 684: athrow
// 685: aload 0
// 686: getstatic net/minecraft/class_1847.field_8997 Lnet/minecraft/class_6880;
// 689: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 68e: dup
// 68f: sipush 14737
// 692: ldc2_w 5063483457886428636
// 695: lload 2
// 696: lxor
// 697: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 69f: checkcast net/minecraft/class_1842
// 6a2: lload 15
// 6a4: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 6a7: iload 46
// 6a9: ifeq 6ca
// 6ac: goto 6b9
// 6af: ldc2_w -7570780303709861289
// 6b2: lload 2
// 6b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b8: athrow
// 6b9: ifeq 6cd
// 6bc: goto 6c9
// 6bf: ldc2_w -7570780303709861289
// 6c2: lload 2
// 6c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c8: athrow
// 6c9: bipush 1
// 6ca: goto 6ce
// 6cd: bipush 0
// 6ce: istore 48
// 6d0: bipush 1
// 6d1: istore 49
// 6d3: iload 48
// 6d5: iload 46
// 6d7: ifeq 7bb
// 6da: ifeq 799
// 6dd: goto 6ea
// 6e0: ldc2_w -7570780303709861289
// 6e3: lload 2
// 6e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e9: athrow
// 6ea: lload 26
// 6ec: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6ef: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 6f2: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 6f5: bipush 3
// 6f6: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 6f9: checkcast net/minecraft/class_1735
// 6fc: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 6ff: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 702: aload 0
// 703: iload 4
// 705: i2s
// 706: iload 5
// 708: iload 6
// 70a: i2s
// 70b: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 70e: invokevirtual su/catlean/m0.Q ()Lnet/minecraft/class_1792;
// 711: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 714: iload 46
// 716: ifeq 7bb
// 719: goto 726
// 71c: ldc2_w -7570780303709861289
// 71f: lload 2
// 720: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 725: athrow
// 726: ifne 799
// 729: goto 736
// 72c: ldc2_w -7570780303709861289
// 72f: lload 2
// 730: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 735: athrow
// 736: aload 0
// 737: aload 0
// 738: iload 4
// 73a: i2s
// 73b: iload 5
// 73d: iload 6
// 73f: i2s
// 740: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 743: invokevirtual su/catlean/m0.Q ()Lnet/minecraft/class_1792;
// 746: lload 7
// 748: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 74b: iload 46
// 74d: ifeq 797
// 750: goto 75d
// 753: ldc2_w -7570780303709861289
// 756: lload 2
// 757: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75c: athrow
// 75d: bipush -1
// 75e: if_icmpeq 796
// 761: goto 76e
// 764: ldc2_w -7570780303709861289
// 767: lload 2
// 768: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76d: athrow
// 76e: aload 0
// 76f: aload 0
// 770: iload 4
// 772: i2s
// 773: iload 5
// 775: iload 6
// 777: i2s
// 778: invokespecial su/catlean/q0.v (SIS)Lsu/catlean/m0;
// 77b: invokevirtual su/catlean/m0.Q ()Lnet/minecraft/class_1792;
// 77e: iload 30
// 780: swap
// 781: iload 31
// 783: swap
// 784: bipush 3
// 785: iload 32
// 787: i2b
// 788: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 78b: return
// 78c: ldc2_w -7570780303709861289
// 78f: lload 2
// 790: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 795: athrow
// 796: bipush 0
// 797: istore 49
// 799: aload 0
// 79a: getstatic net/minecraft/class_1847.field_8993 Lnet/minecraft/class_6880;
// 79d: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 7a2: dup
// 7a3: sipush 14737
// 7a6: ldc2_w 5063483457886428636
// 7a9: lload 2
// 7aa: lxor
// 7ab: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7b3: checkcast net/minecraft/class_1842
// 7b6: lload 15
// 7b8: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 7bb: iload 46
// 7bd: ifeq 89d
// 7c0: ifne 89c
// 7c3: goto 7d0
// 7c6: ldc2_w -7570780303709861289
// 7c9: lload 2
// 7ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cf: athrow
// 7d0: aload 0
// 7d1: getstatic net/minecraft/class_1847.field_8966 Lnet/minecraft/class_6880;
// 7d4: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 7d9: dup
// 7da: sipush 14737
// 7dd: ldc2_w 5063483457886428636
// 7e0: lload 2
// 7e1: lxor
// 7e2: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7ea: checkcast net/minecraft/class_1842
// 7ed: lload 15
// 7ef: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 7f2: iload 46
// 7f4: ifeq 89d
// 7f7: goto 804
// 7fa: ldc2_w -7570780303709861289
// 7fd: lload 2
// 7fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 803: athrow
// 804: ifne 89c
// 807: goto 814
// 80a: ldc2_w -7570780303709861289
// 80d: lload 2
// 80e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 813: athrow
// 814: aload 0
// 815: getstatic net/minecraft/class_1847.field_8969 Lnet/minecraft/class_6880;
// 818: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 81d: dup
// 81e: sipush 14737
// 821: ldc2_w 5063483457886428636
// 824: lload 2
// 825: lxor
// 826: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 82e: checkcast net/minecraft/class_1842
// 831: lload 15
// 833: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 836: iload 46
// 838: ifeq 89d
// 83b: goto 848
// 83e: ldc2_w -7570780303709861289
// 841: lload 2
// 842: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 847: athrow
// 848: ifne 89c
// 84b: goto 858
// 84e: ldc2_w -7570780303709861289
// 851: lload 2
// 852: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 857: athrow
// 858: aload 0
// 859: getstatic net/minecraft/class_1847.field_9000 Lnet/minecraft/class_6880;
// 85c: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 861: dup
// 862: sipush 14737
// 865: ldc2_w 5063483457886428636
// 868: lload 2
// 869: lxor
// 86a: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 872: checkcast net/minecraft/class_1842
// 875: lload 15
// 877: invokespecial su/catlean/q0.e (Lnet/minecraft/class_1842;J)Z
// 87a: iload 46
// 87c: ifeq 89d
// 87f: goto 88c
// 882: ldc2_w -7570780303709861289
// 885: lload 2
// 886: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88b: athrow
// 88c: ifeq 8a0
// 88f: goto 89c
// 892: ldc2_w -7570780303709861289
// 895: lload 2
// 896: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89b: athrow
// 89c: bipush 1
// 89d: goto 8a1
// 8a0: bipush 0
// 8a1: istore 50
// 8a3: iload 48
// 8a5: iload 46
// 8a7: ifeq 8e3
// 8aa: ifeq 8e1
// 8ad: goto 8ba
// 8b0: ldc2_w -7570780303709861289
// 8b3: lload 2
// 8b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b9: athrow
// 8ba: iload 49
// 8bc: iload 46
// 8be: ifeq 8e3
// 8c1: goto 8ce
// 8c4: ldc2_w -7570780303709861289
// 8c7: lload 2
// 8c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8cd: athrow
// 8ce: ifne 8e1
// 8d1: goto 8de
// 8d4: ldc2_w -7570780303709861289
// 8d7: lload 2
// 8d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8dd: athrow
// 8de: bipush 1
// 8df: istore 50
// 8e1: iload 50
// 8e3: iload 46
// 8e5: ifeq 9fa
// 8e8: ifeq 9f5
// 8eb: goto 8f8
// 8ee: ldc2_w -7570780303709861289
// 8f1: lload 2
// 8f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f7: athrow
// 8f8: aload 0
// 8f9: iload 46
// 8fb: ifeq 9ef
// 8fe: goto 90b
// 901: ldc2_w -7570780303709861289
// 904: lload 2
// 905: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90a: athrow
// 90b: lload 37
// 90d: invokespecial su/catlean/q0.h (J)Z
// 910: ifeq 9ee
// 913: goto 920
// 916: ldc2_w -7570780303709861289
// 919: lload 2
// 91a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91f: athrow
// 920: aload 0
// 921: iload 46
// 923: ifeq 9ef
// 926: goto 933
// 929: ldc2_w -7570780303709861289
// 92c: lload 2
// 92d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 932: athrow
// 933: getstatic net/minecraft/class_1802.field_8054 Lnet/minecraft/class_1792;
// 936: dup
// 937: sipush 9105
// 93a: ldc2_w 120463339815045062
// 93d: lload 2
// 93e: lxor
// 93f: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 944: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 947: lload 7
// 949: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 94c: bipush -1
// 94d: if_icmpeq 9ee
// 950: goto 95d
// 953: ldc2_w -7570780303709861289
// 956: lload 2
// 957: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95c: athrow
// 95d: aload 0
// 95e: iload 46
// 960: ifeq 9ef
// 963: goto 970
// 966: ldc2_w -7570780303709861289
// 969: lload 2
// 96a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96f: athrow
// 970: lload 24
// 972: invokespecial su/catlean/q0.F (J)Z
// 975: ifne 9ee
// 978: goto 985
// 97b: ldc2_w -7570780303709861289
// 97e: lload 2
// 97f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 984: athrow
// 985: lload 26
// 987: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 98a: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 98d: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 990: bipush 3
// 991: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 994: checkcast net/minecraft/class_1735
// 997: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 99a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 99d: getstatic net/minecraft/class_1802.field_8054 Lnet/minecraft/class_1792;
// 9a0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a3: iload 46
// 9a5: ifeq 9fa
// 9a8: goto 9b5
// 9ab: ldc2_w -7570780303709861289
// 9ae: lload 2
// 9af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b4: athrow
// 9b5: ifne 9f5
// 9b8: goto 9c5
// 9bb: ldc2_w -7570780303709861289
// 9be: lload 2
// 9bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c4: athrow
// 9c5: aload 0
// 9c6: getstatic net/minecraft/class_1802.field_8054 Lnet/minecraft/class_1792;
// 9c9: dup
// 9ca: sipush 22038
// 9cd: ldc2_w 1762899170024813149
// 9d0: lload 2
// 9d1: lxor
// 9d2: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9da: bipush 3
// 9db: istore 41
// 9dd: astore 42
// 9df: iload 30
// 9e1: iload 31
// 9e3: aload 42
// 9e5: iload 41
// 9e7: iload 32
// 9e9: i2b
// 9ea: invokespecial su/catlean/q0.y (IILnet/minecraft/class_1792;IB)V
// 9ed: return
// 9ee: aload 0
// 9ef: lload 39
// 9f1: invokespecial su/catlean/q0.z (J)V
// 9f4: return
// 9f5: aload 47
// 9f7: invokevirtual net/minecraft/class_1708.method_17378 ()I
// 9fa: ifle bee
// 9fd: getstatic su/catlean/q0.o Lnet/minecraft/class_2338;
// a00: iload 46
// a02: ifeq a57
// a05: goto a12
// a08: ldc2_w -7570780303709861289
// a0b: lload 2
// a0c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a11: athrow
// a12: ifnull bee
// a15: goto a22
// a18: ldc2_w -7570780303709861289
// a1b: lload 2
// a1c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a21: athrow
// a22: lload 26
// a24: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a27: invokevirtual net/minecraft/class_746.method_7346 ()V
// a2a: getstatic su/catlean/q0.h Ljava/util/Map;
// a2d: getstatic su/catlean/q0.o Lnet/minecraft/class_2338;
// a30: dup
// a31: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// a34: lload 26
// a36: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a39: getfield net/minecraft/class_746.field_6012 I
// a3c: aload 47
// a3e: invokevirtual net/minecraft/class_1708.method_17378 ()I
// a41: iadd
// a42: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// a45: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// a4a: goto a57
// a4d: ldc2_w -7570780303709861289
// a50: lload 2
// a51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a56: athrow
// a57: pop
// a58: iload 46
// a5a: ifne bee
// a5d: aload 0
// a5e: lload 28
// a60: invokespecial su/catlean/q0.t (J)Z
// a63: goto a70
// a66: ldc2_w -7570780303709861289
// a69: lload 2
// a6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6f: athrow
// a70: ifeq bee
// a73: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// a76: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// a79: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// a7e: astore 47
// a80: aload 47
// a82: invokeinterface java/util/Iterator.hasNext ()Z 1
// a87: ifeq bee
// a8a: aload 47
// a8c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// a91: checkcast net/minecraft/class_2586
// a94: astore 48
// a96: aload 48
// a98: instanceof net/minecraft/class_2589
// a9b: iload 46
// a9d: ifeq ae7
// aa0: ifeq a80
// aa3: goto ab0
// aa6: ldc2_w -7570780303709861289
// aa9: lload 2
// aaa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aaf: athrow
// ab0: lload 26
// ab2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// ab5: iload 46
// ab7: ifeq afa
// aba: aload 48
// abc: checkcast net/minecraft/class_2589
// abf: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// ac2: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// ac5: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// ac8: lload 26
// aca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// acd: invokevirtual net/minecraft/class_746.method_55754 ()D
// ad0: lload 26
// ad2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// ad5: invokevirtual net/minecraft/class_746.method_55754 ()D
// ad8: dmul
// ad9: dcmpg
// ada: goto ae7
// add: ldc2_w -7570780303709861289
// ae0: lload 2
// ae1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae6: athrow
// ae7: ifgt a80
// aea: getstatic su/catlean/q0.h Ljava/util/Map;
// aed: aload 48
// aef: checkcast net/minecraft/class_2589
// af2: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// af5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// afa: ifnull b42
// afd: lload 26
// aff: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// b02: getfield net/minecraft/class_746.field_6012 I
// b05: getstatic su/catlean/q0.h Ljava/util/Map;
// b08: aload 48
// b0a: checkcast net/minecraft/class_2589
// b0d: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// b10: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// b15: dup
// b16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// b19: checkcast java/lang/Number
// b1c: invokevirtual java/lang/Number.intValue ()I
// b1f: isub
// b20: iload 46
// b22: ifeq b58
// b25: goto b32
// b28: ldc2_w -7570780303709861289
// b2b: lload 2
// b2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b31: athrow
// b32: ifle a80
// b35: goto b42
// b38: ldc2_w -7570780303709861289
// b3b: lload 2
// b3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b41: athrow
// b42: lload 26
// b44: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// b47: getfield net/minecraft/class_746.field_6012 I
// b4a: sipush 31671
// b4d: ldc2_w 65752016323557541
// b50: lload 2
// b51: lxor
// b52: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b57: irem
// b58: iload 46
// b5a: ifeq a87
// b5d: ifne a80
// b60: new net/minecraft/class_3965
// b63: dup
// b64: new net/minecraft/class_243
// b67: dup
// b68: aload 48
// b6a: checkcast net/minecraft/class_2589
// b6d: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// b70: invokevirtual net/minecraft/class_2338.method_10263 ()I
// b73: i2d
// b74: ldc 0.5
// b76: f2d
// b77: dadd
// b78: aload 48
// b7a: checkcast net/minecraft/class_2589
// b7d: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// b80: invokevirtual net/minecraft/class_2338.method_10264 ()I
// b83: i2d
// b84: ldc2_w 0.125
// b87: dadd
// b88: aload 48
// b8a: checkcast net/minecraft/class_2589
// b8d: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// b90: invokevirtual net/minecraft/class_2338.method_10260 ()I
// b93: i2d
// b94: ldc 0.5
// b96: f2d
// b97: dadd
// b98: invokespecial net/minecraft/class_243.<init> (DDD)V
// b9b: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// b9e: aload 48
// ba0: checkcast net/minecraft/class_2589
// ba3: invokevirtual net/minecraft/class_2589.method_11016 ()Lnet/minecraft/class_2338;
// ba6: bipush 0
// ba7: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// baa: astore 49
// bac: getstatic su/catlean/_8.P Lsu/catlean/_8;
// baf: new su/catlean/t5
// bb2: dup
// bb3: getstatic su/catlean/_w.W Lsu/catlean/ye;
// bb6: aload 49
// bb8: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// bbb: dup
// bbc: sipush 4312
// bbf: ldc2_w 8562386381455832210
// bc2: lload 2
// bc3: lxor
// bc4: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// bcc: lload 33
// bce: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// bd1: lload 35
// bd3: bipush 0
// bd4: aload 49
// bd6: aload 48
// bd8: invokedynamic invoke (Lnet/minecraft/class_3965;Lnet/minecraft/class_2586;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/q0.Q (Lnet/minecraft/class_3965;Lnet/minecraft/class_2586;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// bdd: bipush 2
// bde: aconst_null
// bdf: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// be2: lload 11
// be4: dup2_x1
// be5: pop2
// be6: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// be9: iload 46
// beb: ifne a80
// bee: return
}

private final void z(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q0.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 123004485488283
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 47527151575331
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 10310577489729
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 53490827102122
// 01f: lxor
// 020: dup2
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 9
// 027: dup2
// 028: bipush 16
// 02a: lshl
// 02b: bipush 48
// 02d: lushr
// 02e: l2i
// 02f: istore 10
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 32
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: pop2
// 03c: pop2
// 03d: ldc2_w -5980821586903563424
// 040: lload 1
// 041: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: bipush 0
// 047: istore 13
// 049: istore 12
// 04b: iload 13
// 04d: bipush 3
// 04e: if_icmpge 11d
// 051: getstatic su/catlean/q0.P Lsu/catlean/bg;
// 054: aload 0
// 055: iload 9
// 057: i2s
// 058: iload 10
// 05a: i2s
// 05b: iload 11
// 05d: invokespecial su/catlean/q0.I (SSI)I
// 060: lload 7
// 062: invokevirtual su/catlean/bg.c (IJ)Z
// 065: lload 1
// 066: lconst_0
// 067: lcmp
// 068: ifle 11a
// 06b: ifeq 115
// 06e: aload 0
// 06f: lload 3
// 070: invokespecial su/catlean/q0.W (J)Lsu/catlean/mz;
// 073: getstatic su/catlean/mz.TAKE Lsu/catlean/mz;
// 076: lload 1
// 077: lconst_0
// 078: lcmp
// 079: ifle 0eb
// 07c: iload 12
// 07e: ifne 0eb
// 081: goto 08e
// 084: ldc2_w -6037263439941488497
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: lload 1
// 08f: lconst_0
// 090: lcmp
// 091: iflt 0de
// 094: if_acmpne 0d6
// 097: goto 0a4
// 09a: ldc2_w -6037263439941488497
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: iload 13
// 0a6: lload 5
// 0a8: bipush 0
// 0a9: getstatic net/minecraft/class_1713.field_7794 Lnet/minecraft/class_1713;
// 0ac: bipush 0
// 0ad: sipush 23632
// 0b0: ldc2_w 1791348567955711376
// 0b3: lload 1
// 0b4: lxor
// 0b5: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: aconst_null
// 0bb: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 0be: iload 12
// 0c0: lload 1
// 0c1: lconst_0
// 0c2: lcmp
// 0c3: iflt 11a
// 0c6: ifeq 115
// 0c9: goto 0d6
// 0cc: ldc2_w -6037263439941488497
// 0cf: lload 1
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: aload 0
// 0d7: lload 3
// 0d8: invokespecial su/catlean/q0.W (J)Lsu/catlean/mz;
// 0db: getstatic su/catlean/mz.THROW Lsu/catlean/mz;
// 0de: goto 0eb
// 0e1: ldc2_w -6037263439941488497
// 0e4: lload 1
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: if_acmpne 115
// 0ee: iload 13
// 0f0: lload 5
// 0f2: bipush 0
// 0f3: getstatic net/minecraft/class_1713.field_7795 Lnet/minecraft/class_1713;
// 0f6: bipush 0
// 0f7: sipush 26404
// 0fa: ldc2_w 7686615183455297263
// 0fd: lload 1
// 0fe: lxor
// 0ff: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: aconst_null
// 105: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 108: goto 115
// 10b: ldc2_w -6037263439941488497
// 10e: lload 1
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: iinc 13 1
// 118: iload 12
// 11a: ifeq 04b
// 11d: lload 1
// 11e: lconst_0
// 11f: lcmp
// 120: iflt 051
// 123: return
}

private final boolean F(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q0.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 22096137111087
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -7754699358468372475
// 11: lload 1
// 12: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: bipush 0
// 18: istore 6
// 1a: istore 5
// 1c: iload 6
// 1e: bipush 3
// 1f: if_icmpge 77
// 22: lload 3
// 23: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 26: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 29: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 2c: iload 6
// 2e: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 31: checkcast net/minecraft/class_1735
// 34: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 37: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 3a: getstatic net/minecraft/class_1802.field_8436 Lnet/minecraft/class_1792;
// 3d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 40: iload 5
// 42: lload 1
// 43: lconst_0
// 44: lcmp
// 45: iflt 4d
// 48: ifeq 7e
// 4b: iload 5
// 4d: ifeq 6e
// 50: goto 5d
// 53: ldc2_w -7743595924912764879
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: ifne 6f
// 60: goto 6d
// 63: ldc2_w -7743595924912764879
// 66: lload 1
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: bipush 0
// 6e: ireturn
// 6f: iinc 6 1
// 72: iload 5
// 74: ifne 1c
// 77: lload 1
// 78: lconst_0
// 79: lcmp
// 7a: iflt 22
// 7d: bipush 1
// 7e: ireturn
}

private final boolean e(class_1842 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q0.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 26450681669161
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -835477022203418621
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 0
// 19: istore 7
// 1b: istore 6
// 1d: iload 7
// 1f: bipush 3
// 20: if_icmpge f0
// 23: lload 4
// 25: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 28: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 2b: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 2e: iload 7
// 30: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 33: checkcast net/minecraft/class_1735
// 36: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 39: dup
// 3a: sipush 11533
// 3d: ldc2_w 7719287848307813157
// 40: lload 2
// 41: lxor
// 42: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4a: astore 8
// 4c: aload 8
// 4e: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 51: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 54: checkcast net/minecraft/class_1844
// 57: astore 9
// 59: aload 9
// 5b: lload 2
// 5c: lconst_0
// 5d: lcmp
// 5e: iflt 78
// 61: iload 6
// 63: ifeq 78
// 66: ifnull e6
// 69: goto 76
// 6c: ldc2_w -824382350548604873
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: aload 9
// 78: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
// 7b: invokevirtual java/util/Optional.isPresent ()Z
// 7e: iload 6
// 80: ifeq e7
// 83: ifeq e6
// 86: goto 93
// 89: ldc2_w -824382350548604873
// 8c: lload 2
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: aload 9
// 95: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
// 98: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 9b: checkcast net/minecraft/class_6880
// 9e: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// a3: dup
// a4: sipush 16629
// a7: ldc2_w 7308244650316203724
// aa: lload 2
// ab: lxor
// ac: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// b4: checkcast net/minecraft/class_1842
// b7: astore 10
// b9: iload 6
// bb: lload 2
// bc: lconst_0
// bd: lcmp
// be: ifle ed
// c1: ifeq eb
// c4: aload 10
// c6: aload 1
// c7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// ca: ifne e8
// cd: goto da
// d0: ldc2_w -824382350548604873
// d3: lload 2
// d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9: athrow
// da: bipush 0
// db: ireturn
// dc: ldc2_w -824382350548604873
// df: lload 2
// e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e5: athrow
// e6: bipush 0
// e7: ireturn
// e8: iinc 7 1
// eb: iload 6
// ed: ifne 1d
// f0: bipush 1
// f1: ireturn
}

private final int c(class_1842 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q0.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 93193340975097
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 2717789196454967763
// 012: lload 2
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: bipush 5
// 019: istore 7
// 01b: istore 6
// 01d: iload 7
// 01f: sipush 17015
// 022: ldc2_w 1409458843334259414
// 025: lload 2
// 026: lxor
// 027: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: if_icmpge 10f
// 02f: lload 4
// 031: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 034: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 037: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 03a: iload 7
// 03c: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 03f: checkcast net/minecraft/class_1735
// 042: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 045: dup
// 046: sipush 413
// 049: ldc2_w 8641136199192909427
// 04c: lload 2
// 04d: lxor
// 04e: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 056: astore 8
// 058: aload 8
// 05a: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 05d: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 060: checkcast net/minecraft/class_1844
// 063: astore 9
// 065: iload 6
// 067: ifeq 10a
// 06a: aload 9
// 06c: ifnull 107
// 06f: goto 07c
// 072: ldc2_w 2693003397668616679
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 9
// 07e: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
// 081: iload 6
// 083: ifeq 0d4
// 086: goto 093
// 089: ldc2_w 2693003397668616679
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: invokevirtual java/util/Optional.isPresent ()Z
// 096: ifeq 107
// 099: goto 0a6
// 09c: ldc2_w 2693003397668616679
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: aload 9
// 0a8: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
// 0ab: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 0ae: checkcast net/minecraft/class_6880
// 0b1: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 0b6: dup
// 0b7: sipush 14737
// 0ba: ldc2_w 5063537323687259756
// 0bd: lload 2
// 0be: lxor
// 0bf: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c7: goto 0d4
// 0ca: ldc2_w 2693003397668616679
// 0cd: lload 2
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: checkcast net/minecraft/class_1842
// 0d7: astore 10
// 0d9: iload 6
// 0db: lload 2
// 0dc: lconst_0
// 0dd: lcmp
// 0de: ifle 10c
// 0e1: ifeq 10a
// 0e4: aload 10
// 0e6: aload 1
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ea: ifeq 107
// 0ed: goto 0fa
// 0f0: ldc2_w 2693003397668616679
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: iload 7
// 0fc: ireturn
// 0fd: ldc2_w 2693003397668616679
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: iinc 7 1
// 10a: iload 6
// 10c: ifne 01d
// 10f: bipush -1
// 110: ireturn
}

private final void y(int param1, int param2, class_1792 param3, int param4, byte param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 40
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 56
// 013: lshl
// 014: bipush 56
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/q0.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 111305092029615
// 024: lxor
// 025: lstore 8
// 027: dup2
// 028: ldc2_w 59326890459090
// 02b: lxor
// 02c: lstore 10
// 02e: dup2
// 02f: ldc2_w 26028685171120
// 032: lxor
// 033: lstore 12
// 035: dup2
// 036: ldc2_w 51035309087067
// 039: lxor
// 03a: dup2
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 14
// 041: dup2
// 042: bipush 16
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 15
// 04b: dup2
// 04c: bipush 32
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 16
// 055: pop2
// 056: pop2
// 057: ldc2_w 3616026159171546698
// 05a: lload 6
// 05c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: istore 22
// 063: getstatic su/catlean/q0.P Lsu/catlean/bg;
// 066: aload 0
// 067: iload 14
// 069: i2s
// 06a: iload 15
// 06c: i2s
// 06d: iload 16
// 06f: invokespecial su/catlean/q0.I (SSI)I
// 072: lload 12
// 074: invokevirtual su/catlean/bg.c (IJ)Z
// 077: iload 22
// 079: ifeq 0a2
// 07c: ifeq 130
// 07f: goto 08d
// 082: ldc2_w 3658693315258363518
// 085: lload 6
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 0
// 08e: aload 3
// 08f: lload 8
// 091: invokespecial su/catlean/q0.Y (Lnet/minecraft/class_1792;J)I
// 094: goto 0a2
// 097: ldc2_w 3658693315258363518
// 09a: lload 6
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: istore 23
// 0a4: iload 23
// 0a6: bipush -1
// 0a7: iload 22
// 0a9: ifeq 100
// 0ac: if_icmpeq 130
// 0af: goto 0bd
// 0b2: ldc2_w 3658693315258363518
// 0b5: lload 6
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: iload 23
// 0bf: lload 10
// 0c1: bipush 0
// 0c2: aconst_null
// 0c3: bipush 0
// 0c4: sipush 8373
// 0c7: ldc2_w 7577624180045498242
// 0ca: lload 6
// 0cc: lxor
// 0cd: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: aconst_null
// 0d3: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 0d6: iload 4
// 0d8: lload 10
// 0da: bipush 1
// 0db: aconst_null
// 0dc: bipush 0
// 0dd: sipush 31510
// 0e0: ldc2_w 2883819677745847330
// 0e3: lload 6
// 0e5: lxor
// 0e6: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: aconst_null
// 0ec: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 0ef: iload 23
// 0f1: bipush 0
// 0f2: goto 100
// 0f5: ldc2_w 3658693315258363518
// 0f8: lload 6
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: aconst_null
// 101: bipush 0
// 102: sipush 8373
// 105: ldc2_w 7577624180045498242
// 108: lload 6
// 10a: lxor
// 10b: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: aconst_null
// 111: astore 17
// 113: istore 18
// 115: istore 19
// 117: astore 20
// 119: istore 21
// 11b: lload 10
// 11d: iload 21
// 11f: aload 20
// 121: iload 19
// 123: iload 18
// 125: aload 17
// 127: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 12a: getstatic su/catlean/q0.P Lsu/catlean/bg;
// 12d: invokevirtual su/catlean/bg.l ()V
// 130: return
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114498365383195L;
return ((class_1735)zf.v(var3).field_7512.field_7761.get(4)).method_7677().method_7909() instanceof class_1739;
}

private final int Y(class_1792 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q0.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 54020200917940
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 4168806199532820037
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 5
// 19: istore 7
// 1b: istore 6
// 1d: iload 7
// 1f: sipush 29118
// 22: ldc2_w 722860596243438936
// 25: lload 2
// 26: lxor
// 27: invokedynamic j (IJ)I bsm=su/catlean/q0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: if_icmpge 84
// 2f: lload 4
// 31: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 34: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 37: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 3a: iload 7
// 3c: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 3f: checkcast net/minecraft/class_1735
// 42: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 45: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 48: aload 1
// 49: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4c: iload 6
// 4e: lload 2
// 4f: lconst_0
// 50: lcmp
// 51: ifle 59
// 54: ifne 8b
// 57: iload 6
// 59: ifne 7b
// 5c: goto 69
// 5f: ldc2_w 4112382058975471018
// 62: lload 2
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: ifeq 7c
// 6c: goto 79
// 6f: ldc2_w 4112382058975471018
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: iload 7
// 7b: ireturn
// 7c: iinc 7 1
// 7f: iload 6
// 81: ifeq 1d
// 84: lload 2
// 85: lconst_0
// 86: lcmp
// 87: iflt 2f
// 8a: bipush -1
// 8b: ireturn
}

private static final Unit Q(class_3965 var0, class_2586 var1) {
long var2 = a ^ 93506366064896L;
int var4 = (int)((var2 ^ 78372179033115L) >>> 32);
long var5 = (var2 ^ 78372179033115L) << 32 >>> 32;
long var7 = var2 ^ 99892896976148L;
zf.Z(var4, var5).method_2896(zf.v(var7), class_1268.field_5808, var0);
o = ((class_2589)var1).method_11016();
return Unit.INSTANCE;
}

static {
long var20 = a ^ 32043176750870L;
long var22 = var20 ^ 64598282335193L;
long var24 = var20 ^ 23535791865535L;
long var26 = var20 ^ 124194484617104L;
long var28 = var20 ^ 92472327685131L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[28];
int var16 = 0;
String var15 = "\u009b\u0013\u00814\u000b1\u001d:TÈP\u008a\u008d\"0\u009a7¤\u0093ý\u0095`è\u009a8zR~\u0093Ü&Z\u0003®TåË\u0081ÃNþ´;¤n\u009fË\u0096 ãDP¯;+}\u008dcÍ\u000f\rÆä\u000eãA\u0080¡¦o5V\u0018g9\u001fé:ôkç('\u009c\u008b>èH\u0015rF\u0006\u008cP$;¤(ÛíJkF´v¡P¤Ðz7oc(¨í¢Ç\u0087«µ¬\u0018\u0086?i\u008bËäÖwé¹^ÌÀ\u0087g\u001fú2^Jì')+HdÛ\u0092\u0086\u0086\u00847\u0013ÍJ\u000b\u0097:X\u0012«u\u0000eá\u000e§g\u0098Fm\u0088ÕÔ\u000eÖçvw´D;²õ£]À¡³ô£@±Ç\u0085ïÔn8+ñ \u0004\u009f\u008b \u0091Ò}\u0007!#\u0018_\u0004\u000e÷ ^Nª\u0013Y\u0087¨¡Ò\u000e²\u008dö\u0005\u0010òu\u009d©\u007fË\u0019èOK£Ù*a\u009c\u0001\u0094\u0010\u0000\u00854\u008fùDw;5\u009däÑ\tK¿\u0081 {sé;Úq\u001an£ \u007f.\u007fÛÖÉ\u0094\u0083\u0097Bo\u0003\u0007äs\u0015Ä\u008bàÑ¯§ ¨ÿk ãøHpÂ\u009f¿L\u007fx*\bWº\u0003e\u0007®éx>±ìS\nc®+\u0018\u0013\u009bÙÃ\n¬;ÞÃ\u000eó1\u009c\u0011\u008a[PñG59¢âå\u0018W¿hÊ:1û\u0086\u0093\u0097D\u0096ì\u0087\fzÞ\u0007uÒHØJ£ ×5½K!\u0094¶.\u0019Dd$DGW\u0015 ¹8SC\u0098k\u0093\u0001¯\u0019l\u0001J\u0017Q =vÇ#7V\u009c¥Ô¤0\u0087j*\u009f7Ö\u0097\u0017<\t\u0087\u0013ÂËöÍÏe\u000f\u009c8 \u0017Ûf\u0080g\u008c2\u0006\u0097µ\u0004\rþ}MèX~{µ\u007fJëb{¡u\u0095f:B\u009e\u0018ÙÏmûÌGjq¦`>ª»^\u0018pWÌ\u0003\u0016\u0095\u001e\u000e`\u0010\u0091n¥C\u0099\u0097Å\u0084¦\u009fg\u008a\u008a8lS\u0010êø\u00019\u008b¿hÞÔSÉë¯Ò\u0001_\u0010\u0080§¾;q¬\u0001R×\u0005\u009azÇÂä  ðmtmÇæ#\u0014¼B\u0085aj»[²?Üh\u0000Ì\u001f/¥òý%yx\u0011\u0015\u0098 þc$CÃ#´\r¤\u008dIqb\u000b,¥]\n\u001f*\u0003Æ\u0019gÀWh¢±\u0081\"S()h_\u008bh\u0002tÎ\u001em.½ãÊspgç´\tÃ\u0090\u0088«Õý\u008d;Ëj¾\u008d\u0081Ðm¨\\à\u009e\u0093 æ\u0097¯\u0007üÈcW=÷\u0005úiµ\"5\u0085\u009c¾vUp\u0093î*q\u0080¥1Ø+Á ?3Ô|5.úFÎ»7ö® \u001f\u0010ú±êÝQÖZ\u0006B(À-,Î9\u0011(Ë¯ÝüØú5A\u0082'oCØÌ÷ú,ðéA\u0092.³ý\"ó®Ý¼<Õ0EçEÍ\u00930^l\u0010\u007f§Þ\u0004èsH\\M\u00033åEÈ\u001dq\u0010\u0006ºÃ\u000fNý+7GU/X(Ì/ô";
int var17 = "\u009b\u0013\u00814\u000b1\u001d:TÈP\u008a\u008d\"0\u009a7¤\u0093ý\u0095`è\u009a8zR~\u0093Ü&Z\u0003®TåË\u0081ÃNþ´;¤n\u009fË\u0096 ãDP¯;+}\u008dcÍ\u000f\rÆä\u000eãA\u0080¡¦o5V\u0018g9\u001fé:ôkç('\u009c\u008b>èH\u0015rF\u0006\u008cP$;¤(ÛíJkF´v¡P¤Ðz7oc(¨í¢Ç\u0087«µ¬\u0018\u0086?i\u008bËäÖwé¹^ÌÀ\u0087g\u001fú2^Jì')+HdÛ\u0092\u0086\u0086\u00847\u0013ÍJ\u000b\u0097:X\u0012«u\u0000eá\u000e§g\u0098Fm\u0088ÕÔ\u000eÖçvw´D;²õ£]À¡³ô£@±Ç\u0085ïÔn8+ñ \u0004\u009f\u008b \u0091Ò}\u0007!#\u0018_\u0004\u000e÷ ^Nª\u0013Y\u0087¨¡Ò\u000e²\u008dö\u0005\u0010òu\u009d©\u007fË\u0019èOK£Ù*a\u009c\u0001\u0094\u0010\u0000\u00854\u008fùDw;5\u009däÑ\tK¿\u0081 {sé;Úq\u001an£ \u007f.\u007fÛÖÉ\u0094\u0083\u0097Bo\u0003\u0007äs\u0015Ä\u008bàÑ¯§ ¨ÿk ãøHpÂ\u009f¿L\u007fx*\bWº\u0003e\u0007®éx>±ìS\nc®+\u0018\u0013\u009bÙÃ\n¬;ÞÃ\u000eó1\u009c\u0011\u008a[PñG59¢âå\u0018W¿hÊ:1û\u0086\u0093\u0097D\u0096ì\u0087\fzÞ\u0007uÒHØJ£ ×5½K!\u0094¶.\u0019Dd$DGW\u0015 ¹8SC\u0098k\u0093\u0001¯\u0019l\u0001J\u0017Q =vÇ#7V\u009c¥Ô¤0\u0087j*\u009f7Ö\u0097\u0017<\t\u0087\u0013ÂËöÍÏe\u000f\u009c8 \u0017Ûf\u0080g\u008c2\u0006\u0097µ\u0004\rþ}MèX~{µ\u007fJëb{¡u\u0095f:B\u009e\u0018ÙÏmûÌGjq¦`>ª»^\u0018pWÌ\u0003\u0016\u0095\u001e\u000e`\u0010\u0091n¥C\u0099\u0097Å\u0084¦\u009fg\u008a\u008a8lS\u0010êø\u00019\u008b¿hÞÔSÉë¯Ò\u0001_\u0010\u0080§¾;q¬\u0001R×\u0005\u009azÇÂä  ðmtmÇæ#\u0014¼B\u0085aj»[²?Üh\u0000Ì\u001f/¥òý%yx\u0011\u0015\u0098 þc$CÃ#´\r¤\u008dIqb\u000b,¥]\n\u001f*\u0003Æ\u0019gÀWh¢±\u0081\"S()h_\u008bh\u0002tÎ\u001em.½ãÊspgç´\tÃ\u0090\u0088«Õý\u008d;Ëj¾\u008d\u0081Ðm¨\\à\u009e\u0093 æ\u0097¯\u0007üÈcW=÷\u0005úiµ\"5\u0085\u009c¾vUp\u0093î*q\u0080¥1Ø+Á ?3Ô|5.úFÎ»7ö® \u001f\u0010ú±êÝQÖZ\u0006B(À-,Î9\u0011(Ë¯ÝüØú5A\u0082'oCØÌ÷ú,ðéA\u0092.³ý\"ó®Ý¼<Õ0EçEÍ\u00930^l\u0010\u007f§Þ\u0004èsH\\M\u00033åEÈ\u001dq\u0010\u0006ºÃ\u000fNý+7GU/X(Ì/ô"
.length();
char var14 = 24;
int var33 = -1;

label54:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var45;
if ((var33 += var14) >= var17) {
b = var18;
c = new String[28];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "ÎHµ4té\u0019RùÓ\u0014\u0097\u009cM7\u0083Ë\u001c\u000eè@#jÆs\u0082(Û\u0094p>BvÊ\bS\u0096\u0017©ªÃÒÔl\u001f\u009c\u0099C\u008c\nèÝæ¶Ã)x´eOæä´\u0091/§\u0083ÐÇÀ%H\u0000ú\u001esfÛP½";
int var5 = "ÎHµ4té\u0019RùÓ\u0014\u0097\u009cM7\u0083Ë\u001c\u000eè@#jÆs\u0082(Û\u0094p>BvÊ\bS\u0096\u0017©ªÃÒÔl\u001f\u009c\u0099C\u008c\nèÝæ¶Ã)x´eOæä´\u0091/§\u0083ÐÇÀ%H\u0000ú\u001esfÛP½"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
var10001 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var37[var10001] = var54;
if (var2 >= var5) {
f = var6;
g = new Integer[12];
KProperty[] var30 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(q0.class, b<"w">(29132, 3651671687687469769L ^ var20), b<"w">(23402, 3441495463866683518L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q0.class, b<"w">(15554, 5633787202384705496L ^ var20), b<"w">(10495, 2297642330406691808L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q0.class, b<"w">(32766, 3390135926593320166L ^ var20), b<"w">(20141, 8259851531839030714L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q0.class, b<"w">(22566, 578338461716501309L ^ var20), b<"w">(17341, 3134734955974084780L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q0.class, b<"w">(10141, 3377107055133076622L ^ var20), b<"w">(8660, 4207626353343834820L ^ var20), 0))
};
Y = var30;
d = new q0(var26);
i = yp.L(d, b<"w">(28169, 271221341756744973L ^ var20), m0.STRENGTH, null, null, c<"j">(28801, 8150309762247728339L ^ var20), null, var28);
X = yp.L(
d,
b<"w">(31469, 4381054288151867872L ^ var20),
c<"j">(16829, 5570570237496012266L ^ var20),
new IntRange(0, c<"j">(28425, 7051103828382384989L ^ var20)),
var22,
null,
null,
c<"j">(23321, 3594442546319177544L ^ var20),
null
);
t = yp.t(d, b<"w">(442, 7438766385837542077L ^ var20), true, var24, null, null, c<"j">(31510, 2883736415814588224L ^ var20), null);
x = yp.L(d, b<"w">(24139, 8021796297347618133L ^ var20), mz.TAKE, null, null, c<"j">(31510, 2883736415814588224L ^ var20), null, var28);
F = yp.t(d, b<"w">(30546, 8376168956476357726L ^ var20), true, var24, null, null, c<"j">(31510, 2883736415814588224L ^ var20), null);
P = new bg();
h = new LinkedHashMap();
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "â{â\u001eñ\u0082ôòóAå\u000bØG[Ð";
var5 = "â{â\u001eñ\u0082ôòóAå\u000bØG[Ð".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var37 = var6;
var10001 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var45;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label54;
}

var15 = "RØp}JH\u008bÚc\u0014Ã\u0006Z\u008d\u0013\u009dSA×6l\u000f³¥\u0081\u009d±yg¢\u008fû/l2kU¢]«\u001ac?d\u0095{¥ VÒ::Ymy\fk)É®·\tó\u008faÌ?n>âÍ¼áåVdºûaÌ!v²ëîê3Î\u0017\u0093\u0000\u009a(¢\u0088\t«\u0082Ü\u008fÅ%h9\u0081Ý\bÉBý\ngUî\u008fü¸ÙÒ?\u00011f´\u0012×TÐ\u0018\u0093$\u0019;E¢^É+6\u009fØå\\êh¥\u008báºÐ\u0006\u0081U";
var17 = "RØp}JH\u008bÚc\u0014Ã\u0006Z\u008d\u0013\u009dSA×6l\u000f³¥\u0081\u009d±yg¢\u008fû/l2kU¢]«\u001ac?d\u0095{¥ VÒ::Ymy\fk)É®·\tó\u008faÌ?n>âÍ¼áåVdºûaÌ!v²ëîê3Î\u0017\u0093\u0000\u009a(¢\u0088\t«\u0082Ü\u008fÅ%h9\u0081Ý\bÉBý\ngUî\u008fü¸ÙÒ?\u00011f´\u0012×TÐ\u0018\u0093$\u0019;E¢^É+6\u009fØå\\êh¥\u008báºÐ\u0006\u0081U"
.length();
var14 = 128;
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13176;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/q0", var10);
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
throw new RuntimeException("su/catlean/q0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21564;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/q0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/q0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
