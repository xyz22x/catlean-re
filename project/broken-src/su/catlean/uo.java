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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class uo extends _g {
@NotNull
public static final uo i;
static final KProperty[] c;
@NotNull
private static final c8 K;
@NotNull
private static final cw g;
@NotNull
private static final cq W;
@NotNull
private static final cq u;
@NotNull
private static final cq k;
@NotNull
private static final cq x;
@NotNull
private static final c8 z;
private static int t;
private static final long a = yz.a(326382974442152207L, 2524609626761883131L, MethodHandles.lookup().lookupClass()).a(123538379694604L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map j;

private uo(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 131369936887161L;
super(b<"m">(10005, 5479877268854169666L ^ var1), jt.Q(), null, 4, null, var3);
}

private final int L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 108440492120588L;
return ((Number)K.E(this, var3, c[0])).intValue();
}

private final w0 P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 128671667009269L;
return (w0)g.E(this, var3, c[1]);
}

private final boolean F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 35839058357309L;
return (Boolean)W.E(this, var3, c[2]);
}

private final boolean i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 57471661947626L;
return (Boolean)u.E(this, var3, c[3]);
}

private final boolean a(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 14185159488643L;
return (Boolean)k.E(this, var6, c[4]);
}

private final boolean Y(short var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 11065587808940L;
return (Boolean)x.E(this, var6, c[5]);
}

private final int l(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 126111970931257L;
return ((Number)z.E(this, var6, c[c<"j">(2619, 1009148381073853684L ^ var4)])).intValue();
}

@Flow
private final void d(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uo.a J
// 003: ldc2_w 36680671233077
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 22653427908292
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 53666088414214
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 77542616999621
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 21090029959688
// 022: lxor
// 023: dup2
// 024: bipush 56
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 8
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 40
// 037: lshl
// 038: bipush 40
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 136921851673657
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 109400053231182
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 120372395556018
// 051: lxor
// 052: dup2
// 053: bipush 32
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 32
// 05c: lshl
// 05d: bipush 56
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: dup2
// 064: bipush 40
// 066: lshl
// 067: bipush 40
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 37789865572897
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 85044082635628
// 079: lxor
// 07a: lstore 22
// 07c: dup2
// 07d: ldc2_w 3558808736317
// 080: lxor
// 081: lstore 24
// 083: dup2
// 084: ldc2_w 118252074889885
// 087: lxor
// 088: dup2
// 089: bipush 48
// 08b: lushr
// 08c: l2i
// 08d: istore 26
// 08f: dup2
// 090: bipush 16
// 092: lshl
// 093: bipush 32
// 095: lushr
// 096: l2i
// 097: istore 27
// 099: dup2
// 09a: bipush 48
// 09c: lshl
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 28
// 0a3: pop2
// 0a4: dup2
// 0a5: ldc2_w 71488435872780
// 0a8: lxor
// 0a9: lstore 29
// 0ab: dup2
// 0ac: ldc2_w 115833693522396
// 0af: lxor
// 0b0: lstore 31
// 0b2: dup2
// 0b3: ldc2_w 94394614706907
// 0b6: lxor
// 0b7: lstore 33
// 0b9: pop2
// 0ba: ldc2_w 7972312354765005313
// 0bd: lload 2
// 0be: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: astore 35
// 0c5: aload 1
// 0c6: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0c9: instanceof net/minecraft/class_2824
// 0cc: aload 35
// 0ce: ifnull 111
// 0d1: ifeq 569
// 0d4: goto 0e1
// 0d7: ldc2_w 7936762244933902165
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0e4: aload 1
// 0e5: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0e8: checkcast net/minecraft/class_2824
// 0eb: aload 35
// 0ed: ifnull 12b
// 0f0: goto 0fd
// 0f3: ldc2_w 7936762244933902165
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: lload 20
// 0ff: dup2_x1
// 100: pop2
// 101: invokevirtual su/catlean/u2.E (JLnet/minecraft/class_2824;)Z
// 104: goto 111
// 107: ldc2_w 7936762244933902165
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: ifeq 569
// 114: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 117: aload 1
// 118: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 11b: checkcast net/minecraft/class_2824
// 11e: goto 12b
// 121: ldc2_w 7936762244933902165
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: lload 22
// 12d: dup2_x1
// 12e: pop2
// 12f: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 132: astore 36
// 134: aload 36
// 136: aload 35
// 138: ifnull 14d
// 13b: ifnull 153
// 13e: goto 14b
// 141: ldc2_w 7936762244933902165
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 36
// 14d: instanceof net/minecraft/class_1511
// 150: ifeq 15e
// 153: return
// 154: ldc2_w 7936762244933902165
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aconst_null
// 15f: astore 37
// 161: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 164: lload 6
// 166: invokevirtual su/catlean/gg.g (J)Lsu/catlean/fg;
// 169: astore 38
// 16b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 16e: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uo.C (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 173: lload 15
// 175: dup2_x1
// 176: pop2
// 177: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 17a: astore 39
// 17c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 17f: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uo.p (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 184: lload 15
// 186: dup2_x1
// 187: pop2
// 188: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 18b: astore 40
// 18d: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 190: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uo.e (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 195: lload 15
// 197: dup2_x1
// 198: pop2
// 199: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 19c: astore 41
// 19e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1a1: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uo.c (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 1a6: lload 15
// 1a8: dup2_x1
// 1a9: pop2
// 1aa: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 1ad: astore 42
// 1af: aload 0
// 1b0: iload 26
// 1b2: i2s
// 1b3: iload 27
// 1b5: iload 28
// 1b7: i2s
// 1b8: invokespecial su/catlean/uo.Y (SIS)Z
// 1bb: aload 35
// 1bd: ifnull 2aa
// 1c0: ifeq 297
// 1c3: goto 1d0
// 1c6: ldc2_w 7936762244933902165
// 1c9: lload 2
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: lload 13
// 1d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d5: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 1d8: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1db: instanceof net/minecraft/class_1743
// 1de: aload 35
// 1e0: ifnull 2aa
// 1e3: goto 1f0
// 1e6: ldc2_w 7936762244933902165
// 1e9: lload 2
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: ifeq 297
// 1f3: goto 200
// 1f6: ldc2_w 7936762244933902165
// 1f9: lload 2
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: aload 39
// 202: invokevirtual su/catlean/fg.R ()Z
// 205: aload 35
// 207: ifnull 2aa
// 20a: goto 217
// 20d: ldc2_w 7936762244933902165
// 210: lload 2
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: ifeq 297
// 21a: goto 227
// 21d: ldc2_w 7936762244933902165
// 220: lload 2
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: aload 41
// 229: aload 35
// 22b: ifnull 25d
// 22e: goto 23b
// 231: ldc2_w 7936762244933902165
// 234: lload 2
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: invokevirtual su/catlean/fg.R ()Z
// 23e: ifeq 260
// 241: goto 24e
// 244: ldc2_w 7936762244933902165
// 247: lload 2
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: aload 41
// 250: goto 25d
// 253: ldc2_w 7936762244933902165
// 256: lload 2
// 257: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25c: athrow
// 25d: goto 262
// 260: aload 39
// 262: astore 43
// 264: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 267: aload 0
// 268: iload 10
// 26a: i2b
// 26b: iload 11
// 26d: iload 12
// 26f: invokespecial su/catlean/uo.l (BII)I
// 272: lload 31
// 274: dup2_x1
// 275: pop2
// 276: bipush 0
// 277: bipush 0
// 278: aload 43
// 27a: aload 36
// 27c: invokedynamic run (Lsu/catlean/fg;Lnet/minecraft/class_1297;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/uo.C (Lsu/catlean/fg;Lnet/minecraft/class_1297;)V, ()V ]
// 281: sipush 2619
// 284: ldc2_w 1009163221980175775
// 287: lload 2
// 288: lxor
// 289: invokedynamic j (IJ)I bsm=su/catlean/uo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: aconst_null
// 28f: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 292: aload 35
// 294: ifnonnull 569
// 297: aload 0
// 298: lload 29
// 29a: invokespecial su/catlean/uo.F (J)Z
// 29d: goto 2aa
// 2a0: ldc2_w 7936762244933902165
// 2a3: lload 2
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: aload 35
// 2ac: ifnull 2da
// 2af: ifeq 3c0
// 2b2: goto 2bf
// 2b5: ldc2_w 7936762244933902165
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: lload 13
// 2c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c4: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 2c7: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 2ca: instanceof net/minecraft/class_1743
// 2cd: goto 2da
// 2d0: ldc2_w 7936762244933902165
// 2d3: lload 2
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: aload 35
// 2dc: ifnull 302
// 2df: ifne 3c0
// 2e2: goto 2ef
// 2e5: ldc2_w 7936762244933902165
// 2e8: lload 2
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: aload 0
// 2f0: lload 33
// 2f2: invokespecial su/catlean/uo.i (J)Z
// 2f5: goto 302
// 2f8: ldc2_w 7936762244933902165
// 2fb: lload 2
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: aload 35
// 304: ifnull 329
// 307: ifeq 3bc
// 30a: goto 317
// 30d: ldc2_w 7936762244933902165
// 310: lload 2
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: aload 36
// 319: instanceof net/minecraft/class_1657
// 31c: goto 329
// 31f: ldc2_w 7936762244933902165
// 322: lload 2
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: aload 35
// 32b: ifnull 353
// 32e: ifeq 3c0
// 331: goto 33e
// 334: ldc2_w 7936762244933902165
// 337: lload 2
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: aload 36
// 340: checkcast net/minecraft/class_1657
// 343: invokevirtual net/minecraft/class_1657.method_6115 ()Z
// 346: goto 353
// 349: ldc2_w 7936762244933902165
// 34c: lload 2
// 34d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: athrow
// 353: aload 35
// 355: ifnull 386
// 358: ifeq 3c0
// 35b: goto 368
// 35e: ldc2_w 7936762244933902165
// 361: lload 2
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: aload 36
// 36a: checkcast net/minecraft/class_1657
// 36d: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 370: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 373: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 376: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 379: goto 386
// 37c: ldc2_w 7936762244933902165
// 37f: lload 2
// 380: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 385: athrow
// 386: aload 35
// 388: ifnull 3b9
// 38b: ifne 3bc
// 38e: goto 39b
// 391: ldc2_w 7936762244933902165
// 394: lload 2
// 395: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39a: athrow
// 39b: aload 36
// 39d: checkcast net/minecraft/class_1657
// 3a0: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 3a3: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 3a6: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 3a9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3ac: goto 3b9
// 3af: ldc2_w 7936762244933902165
// 3b2: lload 2
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: ifeq 3c0
// 3bc: aload 38
// 3be: astore 37
// 3c0: aload 37
// 3c2: aload 35
// 3c4: ifnull 3d9
// 3c7: ifnull 3f1
// 3ca: goto 3d7
// 3cd: ldc2_w 7936762244933902165
// 3d0: lload 2
// 3d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d6: athrow
// 3d7: aload 37
// 3d9: aload 35
// 3db: ifnull 486
// 3de: invokevirtual su/catlean/fg.R ()Z
// 3e1: ifne 484
// 3e4: goto 3f1
// 3e7: ldc2_w 7936762244933902165
// 3ea: lload 2
// 3eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: athrow
// 3f1: aload 0
// 3f2: lload 4
// 3f4: invokespecial su/catlean/uo.P (J)Lsu/catlean/w0;
// 3f7: getstatic su/catlean/w0.OFF Lsu/catlean/w0;
// 3fa: if_acmpeq 484
// 3fd: goto 40a
// 400: ldc2_w 7936762244933902165
// 403: lload 2
// 404: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 409: athrow
// 40a: lload 13
// 40c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 40f: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 412: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 415: instanceof net/minecraft/class_9362
// 418: aload 35
// 41a: ifnull 455
// 41d: goto 42a
// 420: ldc2_w 7936762244933902165
// 423: lload 2
// 424: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: athrow
// 42a: ifne 484
// 42d: goto 43a
// 430: ldc2_w 7936762244933902165
// 433: lload 2
// 434: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 439: athrow
// 43a: aload 0
// 43b: lload 4
// 43d: invokespecial su/catlean/uo.P (J)Lsu/catlean/w0;
// 440: getstatic su/catlean/se.O [I
// 443: swap
// 444: invokevirtual su/catlean/w0.ordinal ()I
// 447: iaload
// 448: goto 455
// 44b: ldc2_w 7936762244933902165
// 44e: lload 2
// 44f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 454: athrow
// 455: tableswitch 43 1 2 23 38
// 46c: aload 40
// 46e: goto 482
// 471: ldc2_w 7936762244933902165
// 474: lload 2
// 475: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47a: athrow
// 47b: aload 41
// 47d: goto 482
// 480: aload 39
// 482: astore 37
// 484: aload 37
// 486: aload 35
// 488: ifnull 49d
// 48b: ifnull 4b5
// 48e: goto 49b
// 491: ldc2_w 7936762244933902165
// 494: lload 2
// 495: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49a: athrow
// 49b: aload 37
// 49d: aload 35
// 49f: ifnull 4d6
// 4a2: invokevirtual su/catlean/fg.R ()Z
// 4a5: ifne 4d4
// 4a8: goto 4b5
// 4ab: ldc2_w 7936762244933902165
// 4ae: lload 2
// 4af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b4: athrow
// 4b5: aload 0
// 4b6: iload 17
// 4b8: iload 18
// 4ba: i2b
// 4bb: iload 19
// 4bd: invokespecial su/catlean/uo.a (IBI)Z
// 4c0: ifeq 4d4
// 4c3: goto 4d0
// 4c6: ldc2_w 7936762244933902165
// 4c9: lload 2
// 4ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cf: athrow
// 4d0: aload 42
// 4d2: astore 37
// 4d4: aload 37
// 4d6: aload 35
// 4d8: ifnull 4ed
// 4db: ifnull 569
// 4de: goto 4eb
// 4e1: ldc2_w 7936762244933902165
// 4e4: lload 2
// 4e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ea: athrow
// 4eb: aload 37
// 4ed: invokevirtual su/catlean/fg.R ()Z
// 4f0: aload 35
// 4f2: ifnull 52a
// 4f5: ifeq 569
// 4f8: goto 505
// 4fb: ldc2_w 7936762244933902165
// 4fe: lload 2
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: lload 13
// 507: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 50a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 50d: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 510: putstatic su/catlean/uo.t I
// 513: aload 37
// 515: lload 8
// 517: invokevirtual su/catlean/fg.x (J)V
// 51a: getstatic su/catlean/uo.t I
// 51d: goto 52a
// 520: ldc2_w 7936762244933902165
// 523: lload 2
// 524: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 529: athrow
// 52a: istore 43
// 52c: aload 0
// 52d: lload 24
// 52f: invokespecial su/catlean/uo.L (J)I
// 532: ifle 569
// 535: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 538: aload 0
// 539: lload 24
// 53b: invokespecial su/catlean/uo.L (J)I
// 53e: lload 31
// 540: dup2_x1
// 541: pop2
// 542: bipush 0
// 543: bipush 0
// 544: iload 43
// 546: invokedynamic run (I)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/uo.v (I)V, ()V ]
// 54b: sipush 2619
// 54e: ldc2_w 1009163221980175775
// 551: lload 2
// 552: lxor
// 553: invokedynamic j (IJ)I bsm=su/catlean/uo.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 558: aconst_null
// 559: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 55c: goto 569
// 55f: ldc2_w 7936762244933902165
// 562: lload 2
// 563: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 568: athrow
// 569: return
}

@Flow
private final void k(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uo.a J
// 03: ldc2_w 77481158919631
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 128834695620681
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 76369838357467
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 110050065683399
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 3411812014667637755
// 22: lload 2
// 23: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 1
// 2b: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2e: instanceof net/minecraft/class_2824
// 31: aload 10
// 33: ifnull 64
// 36: ifeq d6
// 39: goto 46
// 3c: ldc2_w 3449594713992142511
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 49: aload 1
// 4a: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 4d: lload 6
// 4f: dup2_x1
// 50: pop2
// 51: checkcast net/minecraft/class_2824
// 54: invokevirtual su/catlean/u2.E (JLnet/minecraft/class_2824;)Z
// 57: goto 64
// 5a: ldc2_w 3449594713992142511
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: aload 10
// 66: ifnull 7c
// 69: ifeq d6
// 6c: goto 79
// 6f: ldc2_w 3449594713992142511
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: getstatic su/catlean/uo.t I
// 7c: aload 10
// 7e: ifnull a5
// 81: bipush -1
// 82: if_icmpeq d6
// 85: goto 92
// 88: ldc2_w 3449594713992142511
// 8b: lload 2
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: aload 0
// 93: lload 8
// 95: invokespecial su/catlean/uo.L (J)I
// 98: goto a5
// 9b: ldc2_w 3449594713992142511
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: aload 10
// a7: ifnull d3
// aa: ifne d6
// ad: goto ba
// b0: ldc2_w 3449594713992142511
// b3: lload 2
// b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b9: athrow
// ba: getstatic su/catlean/gg.P Lsu/catlean/gg;
// bd: getstatic su/catlean/uo.t I
// c0: lload 4
// c2: invokevirtual su/catlean/gg.f (IJ)V
// c5: bipush -1
// c6: goto d3
// c9: ldc2_w 3449594713992142511
// cc: lload 2
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: putstatic su/catlean/uo.t I
// d6: return
}

private static final boolean R() {
long var0 = a ^ 6718305301585L;
long var2 = var0 ^ 112446178137192L;
return i.F(var2);
}

private static final boolean Q() {
long var0 = a ^ 18236044128426L;
long var10001 = var0 ^ 99253446067714L;
int var2 = (int)((var0 ^ 99253446067714L) >>> 48);
int var3 = (int)((var0 ^ 99253446067714L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return i.Y((short)var2, var3, (short)var4);
}

private static final boolean C(class_1799 var0) {
long var1 = a ^ 104188297065194L;
Intrinsics.checkNotNullParameter(var0, b<"m">(11372, 3348413685572370187L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_49814);
}

private static final boolean p(class_1799 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uo.a J
// 03: ldc2_w 24655251885725
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 55981515302050
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w -6626095873340266327
// 13: lload 1
// 14: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 17396
// 1d: ldc2_w 4956946109932989671
// 20: lload 1
// 21: lxor
// 22: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: astore 5
// 2c: aload 0
// 2d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 30: getstatic net/minecraft/class_1802.field_49814 Lnet/minecraft/class_1792;
// 33: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 36: aload 5
// 38: ifnull 71
// 3b: ifeq 98
// 3e: goto 4b
// 41: ldc2_w -6589544682871417347
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: lload 3
// 4c: aload 0
// 4d: getstatic net/minecraft/class_1893.field_50158 Lnet/minecraft/class_5321;
// 50: dup
// 51: sipush 5502
// 54: ldc2_w 216199698831653474
// 57: lload 1
// 58: lxor
// 59: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 61: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 64: goto 71
// 67: ldc2_w -6589544682871417347
// 6a: lload 1
// 6b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70: athrow
// 71: aload 5
// 73: ifnull 95
// 76: bipush 1
// 77: if_icmplt 98
// 7a: goto 87
// 7d: ldc2_w -6589544682871417347
// 80: lload 1
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: bipush 1
// 88: goto 95
// 8b: ldc2_w -6589544682871417347
// 8e: lload 1
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: goto 99
// 98: bipush 0
// 99: ireturn
}

private static final boolean e(class_1799 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uo.a J
// 03: ldc2_w 6098833233684
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 36342790323499
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w -4791140543619845856
// 13: lload 1
// 14: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 17396
// 1d: ldc2_w 4956932527077029230
// 20: lload 1
// 21: lxor
// 22: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: astore 5
// 2c: aload 0
// 2d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 30: getstatic net/minecraft/class_1802.field_49814 Lnet/minecraft/class_1792;
// 33: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 36: aload 5
// 38: ifnull 71
// 3b: ifeq 98
// 3e: goto 4b
// 41: ldc2_w -4826680254658737036
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: lload 3
// 4c: aload 0
// 4d: getstatic net/minecraft/class_1893.field_50157 Lnet/minecraft/class_5321;
// 50: dup
// 51: sipush 6425
// 54: ldc2_w 3916143020075003780
// 57: lload 1
// 58: lxor
// 59: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 61: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 64: goto 71
// 67: ldc2_w -4826680254658737036
// 6a: lload 1
// 6b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70: athrow
// 71: aload 5
// 73: ifnull 95
// 76: bipush 1
// 77: if_icmplt 98
// 7a: goto 87
// 7d: ldc2_w -4826680254658737036
// 80: lload 1
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: bipush 1
// 88: goto 95
// 8b: ldc2_w -4826680254658737036
// 8e: lload 1
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: goto 99
// 98: bipush 0
// 99: ireturn
}

private static final boolean c(class_1799 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uo.a J
// 03: ldc2_w 110129088677422
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 71120982600721
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w -6001025965081419750
// 13: lload 1
// 14: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 17396
// 1d: ldc2_w 4957036557425796180
// 20: lload 1
// 21: lxor
// 22: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: astore 5
// 2c: lload 3
// 2d: aload 0
// 2e: getstatic net/minecraft/class_1893.field_9121 Lnet/minecraft/class_5321;
// 31: dup
// 32: sipush 7366
// 35: ldc2_w 1738781103439493992
// 38: lload 1
// 39: lxor
// 3a: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/uo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 42: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 45: aload 5
// 47: ifnull 69
// 4a: bipush 1
// 4b: if_icmplt 6c
// 4e: goto 5b
// 51: ldc2_w -6035300400770278066
// 54: lload 1
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: bipush 1
// 5c: goto 69
// 5f: ldc2_w -6035300400770278066
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: goto 6d
// 6c: bipush 0
// 6d: ireturn
}

private static final void C(fg var0, class_1297 var1) {
long var2 = a ^ 49210456468979L;
long var4 = var2 ^ 34750135189621L;
int var6 = (int)((var2 ^ 119327524431088L) >>> 32);
long var7 = (var2 ^ 119327524431088L) << 32 >>> 32;
long var9 = var2 ^ 124357757326847L;
gg.P.f(var0.a(), var4);
zf.Z(var6, var7).method_2918((class_1657)zf.v(var9), var1);
zf.v(var9).method_6104(class_1268.field_5808);
}

private static final void v(int var0) {
long var1 = a ^ 2857820043109L;
long var3 = var1 ^ 54710197885667L;
gg.P.f(var0, var3);
}

static {
long var20 = a ^ 13452122983803L;
long var22 = var20 ^ 99452490563803L;
long var24 = var20 ^ 133943851462060L;
long var26 = var20 ^ 95063003046090L;
long var28 = var20 ^ 25323835628158L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[27];
int var16 = 0;
String var15 = "¿E³pô^S\u0003¿^!Ú÷Üù°¢ó\u001aôú¦\u0019¹\u0010.\u001bÒ\u0093þ\u0011L¢oÄá\u0017d<ËÎ \u009c´)\\{h\u0007Á#Ì~Qÿ(\u0000±\u0096HkMúR\u008cE?VTH¬ï¦ô\u0010E½ç³\u008b\u008d\u0080¢XÂX{=Ïê\u008d(\u009dÔx@*5êÜ¦¥]²FSø\u008f\u001dÁ¿/lÃYüJö\u008e\u0081Î¿³{A`9Ù\u0084ô¡\u00970éX\u0012«ôQú¦\u009a¤£T)mU[\u000bÝbcPHÉ´ßBë\u0084±W-.\u009fÌqýÃ7É\u0083\u001a\bÊV\u009cP\u0017Þ ®Û¢\u009fY>\u0097ÍôR\f\u0019µ\u0005¨ö\f Ç¦°\u0001+jõ)/E\u0016âÉ \u0010å\u0007ZGo\u0007\"\u0000\u0007°{\u0094\u001f»\u0087\u0019\u0010aoÿ{y\u0088\u0004\u0083\u001e\u0096\nG\f\u0085°\u001e0Ëd\u008c×\u009d)òM\u009bÕÒÆ\u0097à±ñA|ÀCÎ\u0094`\u0011\u0096SÚÃ\u001c\u0099ì¤]LØÆQv®Õ!\u001d\u001c\u00135Ç\u0082\u007f\u0010DÝ\u0095\u0017\u0004\u001bT\u0087Î\u001e\u0095y\u009cÃÒ°\u0010ì°T\u0081^\u0099\u0088øö<Z\u00035\u0088t)\u0010¹4´¦\u0093ñëk¸\u001c\u0019ÃF$ñÓ\u0010¸î\u000fP\u001e\u001aNñ\t`\u0086%¦ÇàG :\"ö²\u0096\u00ad\u00934\u0083K\u0089/!\u001e\u001eG÷j £-\u001dÿý\u0083§_\u009b\u0019úºç\u0010®ë'î!\u000e@VqU4ñ\u0085±ºÎ(Î½\u001d]¶çÇZ$¦«\u000fº~Xì4Ò¶ÐÀZ¬\u0005\u0012\u0085Ùm¦ÆÚ\u0082\u000b±FJÝ\u00809¯\u0018¸\f\u0016â\u0006\u0016YBZu¶O^d\n\u0086»EËCû¾\u008f\u0084 z\ra\u00818þ\u0081GÐi\bÅ¥\u001bOë\u0096Æ¯\u0087°\u0015:\u009a\u0005ôæ¦_\u008dv\u00ad(\\_¯´ít³\u0089\\\"Ý2Ëßn{3\u009f\u0089£û*\u0082ìW\u0006oÄ\u008fU¸\u0003fz\u0096ß\u000bmþA\u0010ÅüÆ×òªº·Ï,ÿ:fØuÒ \u001f#(.ÊãQ6Èª\u008eyñ:3ÐðÅ\u0084\u0097FãÏk\u008d9\u009buÃs4j\u0018\u0002\u0018õ\u009f\b0Rq]\u009dõÅW\u000e*\u0081Afzfb\u0095Yó Å;3\u00ad×\u0017%i®\u0097\u0087\u0011\u000fOñ'<\u0080b¶\u0013\u0083æ<\u000btrãÚ,ö! »v\u001cS\u000b\tzkqNjñì~j]/â\u001eÌÏ4Tt\u000bøú\u000e¾¼\u0010â";
int var17 = "¿E³pô^S\u0003¿^!Ú÷Üù°¢ó\u001aôú¦\u0019¹\u0010.\u001bÒ\u0093þ\u0011L¢oÄá\u0017d<ËÎ \u009c´)\\{h\u0007Á#Ì~Qÿ(\u0000±\u0096HkMúR\u008cE?VTH¬ï¦ô\u0010E½ç³\u008b\u008d\u0080¢XÂX{=Ïê\u008d(\u009dÔx@*5êÜ¦¥]²FSø\u008f\u001dÁ¿/lÃYüJö\u008e\u0081Î¿³{A`9Ù\u0084ô¡\u00970éX\u0012«ôQú¦\u009a¤£T)mU[\u000bÝbcPHÉ´ßBë\u0084±W-.\u009fÌqýÃ7É\u0083\u001a\bÊV\u009cP\u0017Þ ®Û¢\u009fY>\u0097ÍôR\f\u0019µ\u0005¨ö\f Ç¦°\u0001+jõ)/E\u0016âÉ \u0010å\u0007ZGo\u0007\"\u0000\u0007°{\u0094\u001f»\u0087\u0019\u0010aoÿ{y\u0088\u0004\u0083\u001e\u0096\nG\f\u0085°\u001e0Ëd\u008c×\u009d)òM\u009bÕÒÆ\u0097à±ñA|ÀCÎ\u0094`\u0011\u0096SÚÃ\u001c\u0099ì¤]LØÆQv®Õ!\u001d\u001c\u00135Ç\u0082\u007f\u0010DÝ\u0095\u0017\u0004\u001bT\u0087Î\u001e\u0095y\u009cÃÒ°\u0010ì°T\u0081^\u0099\u0088øö<Z\u00035\u0088t)\u0010¹4´¦\u0093ñëk¸\u001c\u0019ÃF$ñÓ\u0010¸î\u000fP\u001e\u001aNñ\t`\u0086%¦ÇàG :\"ö²\u0096\u00ad\u00934\u0083K\u0089/!\u001e\u001eG÷j £-\u001dÿý\u0083§_\u009b\u0019úºç\u0010®ë'î!\u000e@VqU4ñ\u0085±ºÎ(Î½\u001d]¶çÇZ$¦«\u000fº~Xì4Ò¶ÐÀZ¬\u0005\u0012\u0085Ùm¦ÆÚ\u0082\u000b±FJÝ\u00809¯\u0018¸\f\u0016â\u0006\u0016YBZu¶O^d\n\u0086»EËCû¾\u008f\u0084 z\ra\u00818þ\u0081GÐi\bÅ¥\u001bOë\u0096Æ¯\u0087°\u0015:\u009a\u0005ôæ¦_\u008dv\u00ad(\\_¯´ít³\u0089\\\"Ý2Ëßn{3\u009f\u0089£û*\u0082ìW\u0006oÄ\u008fU¸\u0003fz\u0096ß\u000bmþA\u0010ÅüÆ×òªº·Ï,ÿ:fØuÒ \u001f#(.ÊãQ6Èª\u008eyñ:3ÐðÅ\u0084\u0097FãÏk\u008d9\u009buÃs4j\u0018\u0002\u0018õ\u009f\b0Rq]\u009dõÅW\u000e*\u0081Afzfb\u0095Yó Å;3\u00ad×\u0017%i®\u0097\u0087\u0011\u000fOñ'<\u0080b¶\u0013\u0083æ<\u000btrãÚ,ö! »v\u001cS\u000b\tzkqNjñì~j]/â\u001eÌÏ4Tt\u000bøú\u000e¾¼\u0010â"
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
d = new String[27];
j = new HashMap(13);
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
String var4 = "{\u0087\u0010ðÓ\u0018Ù (ï\u0015Dý\u001bÐ\f7\u0081R^Z\u0089\u009b7ï\u0010|¬g\u001a\u009d\u0096;JóÉÊl\u0084\u0087lp#\u0005`\u008a{z";
int var5 = "{\u0087\u0010ðÓ\u0018Ù (ï\u0015Dý\u001bÐ\f7\u0081R^Z\u0089\u009b7ï\u0010|¬g\u001a\u009d\u0096;JóÉÊl\u0084\u0087lp#\u0005`\u008a{z".length();
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
h = new Integer[8];
KProperty[] var30 = new KProperty[c<"j">(17843, 3892797607158225752L ^ var20)];
var30[0] = Reflection.property1(new PropertyReference1Impl(uo.class, b<"m">(6429, 808013004984776161L ^ var20), b<"m">(21321, 8347304690827280291L ^ var20), 0));
var30[1] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(18140, 4636529465260419627L ^ var20), b<"m">(13624, 7776515064422521292L ^ var20), 0)
);
var30[2] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(10564, 4805062403728852405L ^ var20), b<"m">(6608, 3087839401113580853L ^ var20), 0)
);
var30[3] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(1367, 2787518836768696744L ^ var20), b<"m">(22362, 5424603776715930531L ^ var20), 0)
);
var30[4] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(5212, 4663182939415378081L ^ var20), b<"m">(10637, 7999313173040022890L ^ var20), 0)
);
var30[5] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(14713, 2240775542414169482L ^ var20), b<"m">(6891, 8159552037182797318L ^ var20), 0)
);
var30[c<"j">(9509, 294138383816391625L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uo.class, b<"m">(12691, 4086364745122078079L ^ var20), b<"m">(2073, 5653394609989313789L ^ var20), 0)
);
c = var30;
i = new uo(var22);
K = yp.L(i, b<"m">(21580, 8249065722955446450L ^ var20), 0, new IntRange(0, 5), var24, null, null, c<"j">(23277, 2532515434315252740L ^ var20), null);
g = yp.L(i, b<"m">(8374, 7069220786220878918L ^ var20), w0.ANY, null, null, c<"j">(25849, 2364554216185117206L ^ var20), null, var28);
W = yp.t(i, b<"m">(25688, 5557010579411175601L ^ var20), true, var26, null, null, c<"j">(8592, 3374299083470733176L ^ var20), null);
u = yp.t(i, b<"m">(26874, 4425873490390090754L ^ var20), true, var26, null, uo::R, 4, null);
k = yp.t(i, b<"m">(5428, 8497798092013894111L ^ var20), true, var26, null, null, c<"j">(8592, 3374299083470733176L ^ var20), null);
x = yp.t(i, b<"m">(22929, 4599756759034541433L ^ var20), true, var26, null, null, c<"j">(8592, 3374299083470733176L ^ var20), null);
z = yp.L(
i,
b<"m">(1009, 1842767570726416159L ^ var20),
4,
new IntRange(1, c<"j">(24819, 3435300644486987293L ^ var20)),
var24,
null,
uo::Q,
c<"j">(2989, 1937984134085793088L ^ var20),
null
);
t = -1;
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "\u0012<e\u0096º\\|Ó\u0007õì\t\u0002½þç";
var5 = "\u0012<e\u0096º\\|Ó\u0007õì\t\u0002½þç".length();
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

var15 = "ó[cÍä}f\u001alV\u0006*ÒVY\u0013,Ç\u0085\u008bÂ )AN\u0094\u0015ê¨0ñj\u009d\u0013µTVÝ\u0001Q_Hª\u0087xÅ\u0097î vø\u0091r\u0092Jý>j\u009auÈ^ÇdHv\u0000áQ©Ñc\u0011GÖîÆ\u0007¯</";
var17 = "ó[cÍä}f\u001alV\u0006*ÒVY\u0013,Ç\u0085\u008bÂ )AN\u0094\u0015ê¨0ñj\u009d\u0013µTVÝ\u0001Q_Hª\u0087xÅ\u0097î vø\u0091r\u0092Jý>j\u009auÈ^ÇdHv\u0000áQ©Ñc\u0011GÖîÆ\u0007¯</"
.length();
var14 = '0';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2789;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/uo", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/uo" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14576;
if (h[var3] == null) {
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
throw new RuntimeException("su/catlean/uo", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/uo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
