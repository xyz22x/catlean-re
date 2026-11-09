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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q_ extends _g {
@NotNull
public static final q_ V;
static final KProperty[] i;
@NotNull
private static final cq e;
@NotNull
private static final cq A;
@NotNull
private static final cq t;
@NotNull
private static final cq m;
@NotNull
private static final c8 w;
@NotNull
private static final ct j;
@NotNull
private static final cw W;
@NotNull
private static final cl c;
@NotNull
private static final c8 N;
@NotNull
private static final bg B;
private static final long a = yz.a(-2046311430517982632L, -7281699710445923995L, MethodHandles.lookup().lookupClass()).a(238112899842062L);
private static final String[] b;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map k;

private q_(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 79102962374121L;
super(b<"i">(9242, 4033879299168277644L ^ var1), jt.d(), null, 4, null, var3);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 25905386942153L;
return (Boolean)e.E(this, var3, i[0]);
}

private final boolean V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 41076318716587L;
return (Boolean)A.E(this, var3, i[1]);
}

private final boolean j(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 89894463442552L;
return (Boolean)t.E(this, var6, i[2]);
}

private final boolean E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 69670967467519L;
return (Boolean)m.E(this, var3, i[3]);
}

private final int z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 11111183243836L;
return ((Number)w.E(this, var3, i[4])).intValue();
}

private final float I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 38484753274327L;
return ((Number)j.E(this, var3, i[5])).floatValue();
}

private final pv G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 106122918183047L;
return (pv)W.E(this, var3, i[c<"x">(22764, 8221581127028280043L ^ var1)]);
}

private final String B(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 135263834617170L;
return (String)c.E(this, var5, i[c<"x">(2412, 3587310431956217532L ^ var3)]);
}

private final void H(String var1, char var2, long var3) {
long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
long var7 = var5 ^ 77489913536802L;
c.b(this, var7, i[c<"x">(11952, 8347186936681990899L ^ var5)], var1);
}

private final int C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 16738519112702L;
return ((Number)N.E(this, var3, i[c<"x">(20624, 190162640984906223L ^ var1)])).intValue();
}

@Flow
private final void x(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q_.a J
// 003: ldc2_w 30688087895343
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 45203537621529
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
// 020: ldc2_w 65615098372524
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 119532391141239
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 84276101304290
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 110449768168660
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 79468464884927
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 82537790303418
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 12007419522899
// 04d: lxor
// 04e: dup2
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 32
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: dup2
// 060: bipush 48
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 21
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 81714969047576
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 77507467636382
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 37264880147467
// 07c: lxor
// 07d: dup2
// 07e: bipush 32
// 080: lushr
// 081: l2i
// 082: istore 26
// 084: dup2
// 085: bipush 32
// 087: lshl
// 088: bipush 48
// 08a: lushr
// 08b: l2i
// 08c: istore 27
// 08e: dup2
// 08f: bipush 48
// 091: lshl
// 092: bipush 48
// 094: lushr
// 095: l2i
// 096: istore 28
// 098: pop2
// 099: dup2
// 09a: ldc2_w 132121523549436
// 09d: lxor
// 09e: lstore 29
// 0a0: dup2
// 0a1: ldc2_w 35373596415097
// 0a4: lxor
// 0a5: dup2
// 0a6: bipush 32
// 0a8: lushr
// 0a9: l2i
// 0aa: istore 31
// 0ac: dup2
// 0ad: bipush 32
// 0af: lshl
// 0b0: bipush 32
// 0b2: lushr
// 0b3: l2i
// 0b4: istore 32
// 0b6: pop2
// 0b7: dup2
// 0b8: ldc2_w 4108301115763
// 0bb: lxor
// 0bc: dup2
// 0bd: bipush 48
// 0bf: lushr
// 0c0: l2i
// 0c1: istore 33
// 0c3: dup2
// 0c4: bipush 16
// 0c6: lshl
// 0c7: bipush 32
// 0c9: lushr
// 0ca: l2i
// 0cb: istore 34
// 0cd: dup2
// 0ce: bipush 48
// 0d0: lshl
// 0d1: bipush 48
// 0d3: lushr
// 0d4: l2i
// 0d5: istore 35
// 0d7: pop2
// 0d8: dup2
// 0d9: ldc2_w 50452990847096
// 0dc: lxor
// 0dd: lstore 36
// 0df: dup2
// 0e0: ldc2_w 92430431582933
// 0e3: lxor
// 0e4: lstore 38
// 0e6: dup2
// 0e7: ldc2_w 110061037797865
// 0ea: lxor
// 0eb: lstore 40
// 0ed: dup2
// 0ee: ldc2_w 89277746084631
// 0f1: lxor
// 0f2: lstore 42
// 0f4: pop2
// 0f5: ldc2_w 2318009329114448762
// 0f8: lload 2
// 0f9: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: lload 15
// 100: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 103: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 106: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 10b: astore 49
// 10d: astore 48
// 10f: aload 49
// 111: invokeinterface java/util/Iterator.hasNext ()Z 1
// 116: ifeq 305
// 119: aload 49
// 11b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 120: checkcast net/minecraft/class_742
// 123: astore 50
// 125: aload 50
// 127: lload 22
// 129: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 12f: aload 48
// 131: ifnonnull 30b
// 134: aload 48
// 136: ifnonnull 165
// 139: goto 146
// 13c: ldc2_w 2326043826500694983
// 13f: lload 2
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: ifne 10f
// 149: goto 156
// 14c: ldc2_w 2326043826500694983
// 14f: lload 2
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: aload 50
// 158: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 15b: aload 50
// 15d: checkcast net/minecraft/class_1657
// 160: lload 17
// 162: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 165: aload 48
// 167: ifnonnull 116
// 16a: ifne 10f
// 16d: aload 0
// 16e: aload 48
// 170: ifnonnull 18c
// 173: lload 7
// 175: invokespecial su/catlean/q_.G (J)Lsu/catlean/pv;
// 178: getstatic su/catlean/pv.None Lsu/catlean/pv;
// 17b: if_acmpeq 10f
// 17e: goto 18b
// 181: ldc2_w 2326043826500694983
// 184: lload 2
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: aload 0
// 18c: lload 22
// 18e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 191: iload 4
// 193: i2b
// 194: swap
// 195: lload 5
// 197: dup2_x1
// 198: pop2
// 199: checkcast net/minecraft/class_1297
// 19c: invokevirtual su/catlean/q_.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 19f: aload 0
// 1a0: iload 4
// 1a2: i2b
// 1a3: lload 5
// 1a5: aload 50
// 1a7: checkcast net/minecraft/class_1297
// 1aa: invokevirtual su/catlean/q_.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1ad: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1b0: aload 0
// 1b1: lload 38
// 1b3: invokespecial su/catlean/q_.C (J)I
// 1b6: i2d
// 1b7: dcmpg
// 1b8: aload 48
// 1ba: ifnonnull 1db
// 1bd: ifgt 10f
// 1c0: goto 1cd
// 1c3: ldc2_w 2326043826500694983
// 1c6: lload 2
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: aload 0
// 1ce: lload 7
// 1d0: invokespecial su/catlean/q_.G (J)Lsu/catlean/pv;
// 1d3: getstatic su/catlean/m2.y [I
// 1d6: swap
// 1d7: invokevirtual su/catlean/pv.ordinal ()I
// 1da: iaload
// 1db: aload 48
// 1dd: ifnonnull 228
// 1e0: tableswitch 285 1 3 38 229 280
// 1fc: ldc2_w 2326043826500694983
// 1ff: lload 2
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: getstatic su/catlean/q_.B Lsu/catlean/bg;
// 209: sipush 23076
// 20c: ldc2_w 3781238624604988888
// 20f: lload 2
// 210: lxor
// 211: invokedynamic x (IJ)I bsm=su/catlean/q_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: lload 36
// 218: invokevirtual su/catlean/bg.q (IJ)Z
// 21b: goto 228
// 21e: ldc2_w 2326043826500694983
// 221: lload 2
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: aload 48
// 22a: ifnonnull 262
// 22d: ifeq 2c4
// 230: goto 23d
// 233: ldc2_w 2326043826500694983
// 236: lload 2
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: aload 0
// 23e: aload 48
// 240: ifnonnull 27c
// 243: goto 250
// 246: ldc2_w 2326043826500694983
// 249: lload 2
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: lload 11
// 252: invokespecial su/catlean/q_.s (J)Z
// 255: goto 262
// 258: ldc2_w 2326043826500694983
// 25b: lload 2
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: ifeq 278
// 265: aload 0
// 266: lload 40
// 268: invokevirtual su/catlean/q_.d (J)V
// 26b: goto 278
// 26e: ldc2_w 2326043826500694983
// 271: lload 2
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: aload 0
// 279: checkcast su/catlean/_g
// 27c: iload 26
// 27e: aload 0
// 27f: checkcast su/catlean/_g
// 282: sipush 26092
// 285: ldc2_w 146973137014436138
// 288: lload 2
// 289: lxor
// 28a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: bipush 0
// 290: anewarray 435
// 293: iload 27
// 295: i2c
// 296: bipush 0
// 297: bipush 4
// 298: aconst_null
// 299: iload 28
// 29b: i2s
// 29c: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 29f: bipush 0
// 2a0: bipush 2
// 2a1: aconst_null
// 2a2: lload 9
// 2a4: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 2a7: lload 22
// 2a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ac: getfield net/minecraft/class_746.field_3944 Lnet/minecraft/class_634;
// 2af: aload 0
// 2b0: iload 31
// 2b2: iload 32
// 2b4: invokespecial su/catlean/q_.B (II)Ljava/lang/String;
// 2b7: ldc "/"
// 2b9: ldc ""
// 2bb: bipush 0
// 2bc: bipush 4
// 2bd: aconst_null
// 2be: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 2c1: invokevirtual net/minecraft/class_634.method_45730 (Ljava/lang/String;)V
// 2c4: return
// 2c5: aload 0
// 2c6: iload 26
// 2c8: aload 0
// 2c9: checkcast su/catlean/_g
// 2cc: sipush 6935
// 2cf: ldc2_w 4218664662634057714
// 2d2: lload 2
// 2d3: lxor
// 2d4: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: bipush 0
// 2da: anewarray 435
// 2dd: iload 27
// 2df: i2c
// 2e0: bipush 0
// 2e1: bipush 4
// 2e2: aconst_null
// 2e3: iload 28
// 2e5: i2s
// 2e6: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 2e9: iload 33
// 2eb: i2c
// 2ec: swap
// 2ed: iload 34
// 2ef: swap
// 2f0: iload 35
// 2f2: i2s
// 2f3: swap
// 2f4: invokespecial su/catlean/q_.h (CISLjava/lang/String;)V
// 2f7: return
// 2f8: aload 48
// 2fa: ifnull 10f
// 2fd: new kotlin/NoWhenBranchMatchedException
// 300: dup
// 301: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 304: athrow
// 305: aload 0
// 306: lload 13
// 308: invokespecial su/catlean/q_.E (J)Z
// 30b: aload 48
// 30d: ifnonnull 3b8
// 310: ifeq 3a9
// 313: goto 320
// 316: ldc2_w 2326043826500694983
// 319: lload 2
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 323: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 326: dup
// 327: sipush 3952
// 32a: ldc2_w 6107009412668087212
// 32d: lload 2
// 32e: lxor
// 32f: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 337: bipush 0
// 338: bipush 2
// 339: aconst_null
// 33a: astore 44
// 33c: istore 45
// 33e: istore 46
// 340: astore 47
// 342: lload 24
// 344: aload 47
// 346: iload 46
// 348: iload 45
// 34a: aload 44
// 34c: invokestatic su/catlean/gg.k (Lsu/catlean/gg;JLnet/minecraft/class_1792;ZILjava/lang/Object;)I
// 34f: aload 48
// 351: ifnonnull 3b8
// 354: aload 0
// 355: lload 42
// 357: invokespecial su/catlean/q_.z (J)I
// 35a: if_icmpgt 3a9
// 35d: goto 36a
// 360: ldc2_w 2326043826500694983
// 363: lload 2
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: aload 0
// 36b: iload 26
// 36d: aload 0
// 36e: checkcast su/catlean/_g
// 371: sipush 13275
// 374: ldc2_w 8832560176168298257
// 377: lload 2
// 378: lxor
// 379: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: bipush 0
// 37f: anewarray 435
// 382: iload 27
// 384: i2c
// 385: bipush 0
// 386: bipush 4
// 387: aconst_null
// 388: iload 28
// 38a: i2s
// 38b: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 38e: iload 33
// 390: i2c
// 391: swap
// 392: iload 34
// 394: swap
// 395: iload 35
// 397: i2s
// 398: swap
// 399: invokespecial su/catlean/q_.h (CISLjava/lang/String;)V
// 39c: goto 3a9
// 39f: ldc2_w 2326043826500694983
// 3a2: lload 2
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: lload 22
// 3ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3ae: invokevirtual net/minecraft/class_746.method_6032 ()F
// 3b1: aload 0
// 3b2: lload 29
// 3b4: invokespecial su/catlean/q_.I (J)F
// 3b7: fcmpg
// 3b8: aload 48
// 3ba: ifnonnull 3f8
// 3bd: ifge 42d
// 3c0: goto 3cd
// 3c3: ldc2_w 2326043826500694983
// 3c6: lload 2
// 3c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: athrow
// 3cd: aload 0
// 3ce: aload 48
// 3d0: ifnonnull 3fc
// 3d3: goto 3e0
// 3d6: ldc2_w 2326043826500694983
// 3d9: lload 2
// 3da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3df: athrow
// 3e0: iload 19
// 3e2: iload 20
// 3e4: i2s
// 3e5: iload 21
// 3e7: i2c
// 3e8: invokespecial su/catlean/q_.j (ISC)Z
// 3eb: goto 3f8
// 3ee: ldc2_w 2326043826500694983
// 3f1: lload 2
// 3f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f7: athrow
// 3f8: ifeq 42d
// 3fb: aload 0
// 3fc: iload 26
// 3fe: aload 0
// 3ff: checkcast su/catlean/_g
// 402: sipush 26644
// 405: ldc2_w 4648061022176099542
// 408: lload 2
// 409: lxor
// 40a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40f: bipush 0
// 410: anewarray 435
// 413: iload 27
// 415: i2c
// 416: bipush 0
// 417: bipush 4
// 418: aconst_null
// 419: iload 28
// 41b: i2s
// 41c: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 41f: iload 33
// 421: i2c
// 422: swap
// 423: iload 34
// 425: swap
// 426: iload 35
// 428: i2s
// 429: swap
// 42a: invokespecial su/catlean/q_.h (CISLjava/lang/String;)V
// 42d: return
}

private final void h(char param1, int param2, short param3, String param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/q_.a J
// 1a: lxor
// 1b: lstore 5
// 1d: lload 5
// 1f: dup2
// 20: ldc2_w 39402491224777
// 23: lxor
// 24: lstore 7
// 26: dup2
// 27: ldc2_w 106387231873175
// 2a: lxor
// 2b: lstore 9
// 2d: dup2
// 2e: ldc2_w 107011687783734
// 31: lxor
// 32: lstore 11
// 34: dup2
// 35: ldc2_w 41177559772022
// 38: lxor
// 39: lstore 13
// 3b: dup2
// 3c: ldc2_w 18701789040299
// 3f: lxor
// 40: lstore 15
// 42: pop2
// 43: ldc2_w -3674842445817680303
// 46: lload 5
// 48: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: astore 17
// 4f: aload 0
// 50: lload 7
// 52: invokespecial su/catlean/q_.s (J)Z
// 55: aload 17
// 57: ifnonnull 87
// 5a: ifeq 81
// 5d: goto 6b
// 60: ldc2_w -3644348910920884500
// 63: lload 5
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 0
// 6c: aload 4
// 6e: lload 11
// 70: invokevirtual su/catlean/q_.F (Ljava/lang/String;J)V
// 73: goto 81
// 76: ldc2_w -3644348910920884500
// 79: lload 5
// 7b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80: athrow
// 81: aload 0
// 82: lload 15
// 84: invokespecial su/catlean/q_.V (J)Z
// 87: ifeq b7
// 8a: new net/minecraft/class_2868
// 8d: dup
// 8e: sipush 32167
// 91: ldc2_w 5084271135380467571
// 94: lload 5
// 96: lxor
// 97: invokedynamic x (IJ)I bsm=su/catlean/q_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c: invokespecial net/minecraft/class_2868.<init> (I)V
// 9f: checkcast net/minecraft/class_2596
// a2: lload 13
// a4: dup2_x1
// a5: pop2
// a6: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// a9: goto b7
// ac: ldc2_w -3644348910920884500
// af: lload 5
// b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: athrow
// b7: lload 9
// b9: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// bc: invokevirtual net/minecraft/class_634.method_48296 ()Lnet/minecraft/class_2535;
// bf: aload 4
// c1: sipush 21511
// c4: ldc2_w 2134497927848259067
// c7: lload 5
// c9: lxor
// ca: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/q_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: swap
// d0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// d5: invokestatic net/minecraft/class_2561.method_30163 (Ljava/lang/String;)Lnet/minecraft/class_2561;
// d8: invokevirtual net/minecraft/class_2535.method_10747 (Lnet/minecraft/class_2561;)V
// db: return
}

private static final boolean i() {
long var0 = a ^ 45165061143692L;
long var2 = var0 ^ 95172059557239L;
return V.E(var2);
}

private static final boolean L() {
long var0 = a ^ 95459743234459L;
long var10001 = var0 ^ 78973266541543L;
int var2 = (int)((var0 ^ 78973266541543L) >>> 32);
int var3 = (int)((var0 ^ 78973266541543L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
return V.j(var2, (short)var3, (char)var4);
}

private static final boolean H() {
long var0 = a ^ 61308906106220L;
long var2 = var0 ^ 25866501579247L;

try {
if (V.G(var2) == pv.Command) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 2307224695857116036L, var0);
}

return false;
}

private static final boolean P() {
long var0 = a ^ 24890815550146L;
long var2 = var0 ^ 60367041109569L;

try {
if (V.G(var2) != pv.None) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -2329828017012241366L, var0);
}

return false;
}

static {
long var20 = a ^ 82909387092701L;
long var22 = var20 ^ 49781348136473L;
long var24 = var20 ^ 32217522862167L;
long var26 = var20 ^ 55983106290993L;
long var28 = var20 ^ 50179081877485L;
long var30 = var20 ^ 101363455116003L;
long var32 = var20 ^ 4969293991826L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[34];
int var16 = 0;
String var15 = "\u0002P\u0010¶X!\u009d\u000e)¤cÓA\u009c9\u0096(6RT\rÌ\u0095ÒD¾e¢¾¸\u001e\u000b\u0087p¾<\u001bjÅ£\u0003\u001d~\u0097\u0088\u000b_e ×Èt\u001b2<?âI.¦\u0018'nº\u0081«½\u0012]³d1»\u0017À\u0000\"\u008b\u001b\u00824\u0010áö\u0091¡[ËË\u00011\u000f_Êép#G\u0010z\u0095N\u00106³7e.³Cù\u0010wä?\u0018kþb§\u0089í\u0013e\u0007Ý\u009c\u0088eÅ/\u0094\u0019³\u0018þ\u000f·\u0097ð\u0010å¬?\u008c\u0083ì}ÚÕçP\u0088*øI\u0012\u0010\u0007\u0096oX\u009d\u0018*,Õö\u0000\u00020Ùä¬ ]¦ù\u008eCíö\u0083<qI£ÐÃ\u0019\u0087r¬\u0004\u0097\u0015äï\u0001BÞ\u0005ÈÎÏoõ ø\u000eÜ\u0091ì\u009cl\u009eKðpKIï¢)z½\u009d5z¬lñ\u000f>ZGL\u001bS\u008d \u009eD_|\u0001ñáD\u0096îù\u000eà\n½d\u0005¬jð0¢]9¢ ú/6%ôB\u0010AHÐ\u0005úµ3\u008a\u0090\"ÆÝ¢jL6 µ\u0091øR¸Ò|\u0012O\u0098\u00adØT9è\u000e@vÈ¿ãÀ¼<\u0010¶E0:«\u0082\u00140Qì±/|üÚ=¤Ø\u0097ç\u0087\u001e\u008bú\u0015\u0017Û\u0013mi\u0080n£¦¬'\u0092AF©\u0015x'd-Î4ûÈ3;Y\u0093-\u000b\u0015 AÅÔ¼ó\u001d\u000en\u0096\u0091Øo\u0097{<p]\u001c\u0088yÃ\u001f¦\u009a\u0083´Ho¨^´»\u0010ôÁÄ\u0004Z/ü>F\"èFó´R\u0000\u00103?MÌ\u0080ÖwÉÚ&\nU\u0017s=+\u0010¥\u001b 'Ù\u0013û;F\u0097\u001a8:wíx\u0010í\u001b\u0081]\u001f£\u0000jz\u001b¢óN¥Ú~ |\u009e\"ô\u0085:õó7q\u009cY\n§5L¿ç8Ø\u000e\u0000ëkß®¨lk\u0094\\÷ Cô\u00949u\u0016âe\bì\u001b,¸ýtû£õuãÏº2\u0015a\feâ\u0086ßt¾ \u008f\u0097v£¨7ÎÅ\u0084&´OÄ\u000b^%\u001dð^kÇ7±*\u001cÎû}\u009dünc ¥ {ú\u0006tùýO\u008a!¯£ü]\u00adÈ\u0013\u001b\u0017\u0097\u0012\u0010s±\u001f}XÊã\u008cl \u0007Ç\u001c\u001bJ*£U²3ÿ¥Lø95ÌQ\u001dx\u0091\\\\à\u0003\u009b\u0000»\u008fÕÓ{\u00108\u0081-³\u0010'\u0089'\u0006Ûkf8ø\"\r(\u0002¸3l§á:C 3x©?_\u009cìÑ?/)q÷ªÖ\u0013ôô\u0001\u0083Á%Î)æÉÍþ\u009d\u00019\u0010¢Né¦Ê2é\u0082?¦äú<\u0094B³\u0010ùÜÊ-\u0080\u0013\u000e¥\u0083\u0013\u0010Ê×¾óz Má\n\u0018îxî\u0094Âù\u0092!êhå³í\u008aë^\u00962÷¿\u0012~\u001f\u0092Ötn)\u0010\u0099·O\u008coÂ\u0085\u001b:ýË9\u0018`o1\u0018î\nOõ;Jæ\u009aIùdÞ\u0011³;\u0088\u0083P\u0083\u0012\u0011\u0017Ñ×\u0010e\u0016ÊlL^#W\u0014\u0010ó\u0084OÉ¯/ \u008bÿÖ\u0086Å\u001f\u0082C\u008bÕ¦ÝQ16þË}'\u0093\u0017,¾B\u0019 .H+S[1";
int var17 = "\u0002P\u0010¶X!\u009d\u000e)¤cÓA\u009c9\u0096(6RT\rÌ\u0095ÒD¾e¢¾¸\u001e\u000b\u0087p¾<\u001bjÅ£\u0003\u001d~\u0097\u0088\u000b_e ×Èt\u001b2<?âI.¦\u0018'nº\u0081«½\u0012]³d1»\u0017À\u0000\"\u008b\u001b\u00824\u0010áö\u0091¡[ËË\u00011\u000f_Êép#G\u0010z\u0095N\u00106³7e.³Cù\u0010wä?\u0018kþb§\u0089í\u0013e\u0007Ý\u009c\u0088eÅ/\u0094\u0019³\u0018þ\u000f·\u0097ð\u0010å¬?\u008c\u0083ì}ÚÕçP\u0088*øI\u0012\u0010\u0007\u0096oX\u009d\u0018*,Õö\u0000\u00020Ùä¬ ]¦ù\u008eCíö\u0083<qI£ÐÃ\u0019\u0087r¬\u0004\u0097\u0015äï\u0001BÞ\u0005ÈÎÏoõ ø\u000eÜ\u0091ì\u009cl\u009eKðpKIï¢)z½\u009d5z¬lñ\u000f>ZGL\u001bS\u008d \u009eD_|\u0001ñáD\u0096îù\u000eà\n½d\u0005¬jð0¢]9¢ ú/6%ôB\u0010AHÐ\u0005úµ3\u008a\u0090\"ÆÝ¢jL6 µ\u0091øR¸Ò|\u0012O\u0098\u00adØT9è\u000e@vÈ¿ãÀ¼<\u0010¶E0:«\u0082\u00140Qì±/|üÚ=¤Ø\u0097ç\u0087\u001e\u008bú\u0015\u0017Û\u0013mi\u0080n£¦¬'\u0092AF©\u0015x'd-Î4ûÈ3;Y\u0093-\u000b\u0015 AÅÔ¼ó\u001d\u000en\u0096\u0091Øo\u0097{<p]\u001c\u0088yÃ\u001f¦\u009a\u0083´Ho¨^´»\u0010ôÁÄ\u0004Z/ü>F\"èFó´R\u0000\u00103?MÌ\u0080ÖwÉÚ&\nU\u0017s=+\u0010¥\u001b 'Ù\u0013û;F\u0097\u001a8:wíx\u0010í\u001b\u0081]\u001f£\u0000jz\u001b¢óN¥Ú~ |\u009e\"ô\u0085:õó7q\u009cY\n§5L¿ç8Ø\u000e\u0000ëkß®¨lk\u0094\\÷ Cô\u00949u\u0016âe\bì\u001b,¸ýtû£õuãÏº2\u0015a\feâ\u0086ßt¾ \u008f\u0097v£¨7ÎÅ\u0084&´OÄ\u000b^%\u001dð^kÇ7±*\u001cÎû}\u009dünc ¥ {ú\u0006tùýO\u008a!¯£ü]\u00adÈ\u0013\u001b\u0017\u0097\u0012\u0010s±\u001f}XÊã\u008cl \u0007Ç\u001c\u001bJ*£U²3ÿ¥Lø95ÌQ\u001dx\u0091\\\\à\u0003\u009b\u0000»\u008fÕÓ{\u00108\u0081-³\u0010'\u0089'\u0006Ûkf8ø\"\r(\u0002¸3l§á:C 3x©?_\u009cìÑ?/)q÷ªÖ\u0013ôô\u0001\u0083Á%Î)æÉÍþ\u009d\u00019\u0010¢Né¦Ê2é\u0082?¦äú<\u0094B³\u0010ùÜÊ-\u0080\u0013\u000e¥\u0083\u0013\u0010Ê×¾óz Má\n\u0018îxî\u0094Âù\u0092!êhå³í\u008aë^\u00962÷¿\u0012~\u001f\u0092Ötn)\u0010\u0099·O\u008coÂ\u0085\u001b:ýË9\u0018`o1\u0018î\nOõ;Jæ\u009aIùdÞ\u0011³;\u0088\u0083P\u0083\u0012\u0011\u0017Ñ×\u0010e\u0016ÊlL^#W\u0014\u0010ó\u0084OÉ¯/ \u008bÿÖ\u0086Å\u001f\u0082C\u008bÕ¦ÝQ16þË}'\u0093\u0017,¾B\u0019 .H+S[1"
.length();
char var14 = '0';
int var37 = -1;

label54:
while (true) {
String var38 = var15.substring(++var37, var37 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
String var49 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var49;
if ((var37 += var14) >= var17) {
b = var18;
d = new String[34];
k = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "GZ sÈ¸\u000eY\u0082ÞU\u0001é¥4'm\u0083'×ÓÈµN¡\u0089Dà\u0001\u0091[\b6\u001e^¼\u009eø¦\u0013.Õ\u008aÊ4¥\u0091Ï\u001b\u001c\"S\u0000qø·AnXzÇh¿}ÿ\\c\u009alâ~â2 \t:#A¡ñÖÈäìs¦Yé\u0004\u0000Yéë\u0004\u001c(";
int var5 = "GZ sÈ¸\u000eY\u0082ÞU\u0001é¥4'm\u0083'×ÓÈµN¡\u0089Dà\u0001\u0091[\b6\u001e^¼\u009eø¦\u0013.Õ\u008aÊ4¥\u0091Ï\u001b\u001c\"S\u0000qø·AnXzÇh¿}ÿ\\c\u009alâ~â2 \t:#A¡ñÖÈäìs¦Yé\u0004\u0000Yéë\u0004\u001c("
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var41 = var6;
var10001 = var3++;
long var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var56 = -1;

while (true) {
long var8 = var53;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var56) {
case 0:
var41[var10001] = var58;
if (var2 >= var5) {
g = var6;
h = new Integer[14];
KProperty[] var34 = new KProperty[c<"x">(23319, 1656688654082521886L ^ var20)];
var34[0] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(16759, 6554066175802018391L ^ var20), b<"i">(17203, 2094505058366294053L ^ var20), 0)
);
var34[1] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(5280, 9018305069879648151L ^ var20), b<"i">(23828, 8129947921481045545L ^ var20), 0)
);
var34[2] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(20142, 6694658993453729161L ^ var20), b<"i">(13993, 6857951416570576267L ^ var20), 0)
);
var34[3] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(1298, 2485000459835067966L ^ var20), b<"i">(11931, 7247545483848934832L ^ var20), 0)
);
var34[4] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(21424, 4689692434301753486L ^ var20), b<"i">(9839, 2516912860966120798L ^ var20), 0)
);
var34[5] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(13786, 1127395440391945979L ^ var20), b<"i">(14554, 8666046572024984574L ^ var20), 0)
);
var34[c<"x">(6602, 7063472317303519688L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(20136, 8839160318556865937L ^ var20), b<"i">(23967, 1051301747691853477L ^ var20), 0)
);
var34[c<"x">(2412, 3587314717612730735L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q_.class, b<"i">(2166, 4417045506423374661L ^ var20), b<"i">(23259, 6831145890702201325L ^ var20), 0)
);
var34[c<"x">(26837, 7312014652066760913L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q_.class, b<"i">(23641, 6693128097674532710L ^ var20), b<"i">(10083, 1604186392579009614L ^ var20), 0)
);
i = var34;
V = new q_(var28);
e = yp.t(V, b<"i">(19858, 4351864632312596148L ^ var20), true, var24, null, null, c<"x">(15470, 6219960228549319782L ^ var20), null);
A = yp.t(V, b<"i">(1831, 1271596518726355996L ^ var20), true, var24, null, null, c<"x">(31922, 6013400623078120633L ^ var20), null);
t = yp.t(V, b<"i">(31883, 9164490450971113377L ^ var20), false, var24, null, null, c<"x">(31922, 6013400623078120633L ^ var20), null);
m = yp.t(V, b<"i">(13275, 8832647523589355747L ^ var20), false, var24, null, null, c<"x">(31922, 6013400623078120633L ^ var20), null);
w = yp.L(
V,
b<"i">(20370, 435799141430133947L ^ var20),
2,
new IntRange(0, c<"x">(14161, 5160345566806890324L ^ var20)),
var26,
null,
q_::i,
c<"x">(20624, 190276778772869264L ^ var20),
null
);
j = yp.k(
V, b<"i">(1183, 3150491490336821162L ^ var20), 8.0F, var22, RangesKt.rangeTo(1.0F, 20.0F), null, q_::L, c<"x">(20624, 190276778772869264L ^ var20), null
);
W = yp.L(V, b<"i">(25506, 6357014370371250317L ^ var20), pv.Leave, null, null, c<"x">(31922, 6013400623078120633L ^ var20), null, var30);
c = yp.x(V, b<"i">(25492, 4657690875863148732L ^ var20), b<"i">(32208, 1105046329425606380L ^ var20), null, q_::H, 4, var32, null);
N = yp.L(
V,
b<"i">(4549, 2243982886098950903L ^ var20),
c<"x">(5615, 3380784209401542117L ^ var20),
new IntRange(4, c<"x">(13473, 7183603516657226926L ^ var20)),
var26,
null,
q_::P,
c<"x">(20624, 190276778772869264L ^ var20),
null
);
B = new bg();
return;
}
break;
default:
var41[var10001] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "Ý\u0097\u0087ÂX\u008bt\u009e\f\u009cä\u0089\u009e\u0016\u000f´";
var5 = "Ý\u0097\u0087ÂX\u008bt\u009e\f\u009cä\u0089\u009e\u0016\u000f´".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var41 = var6;
var10001 = var3++;
var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var56 = 0;
}
}
}

var14 = var15.charAt(var37);
break;
default:
var18[var16++] = var49;
if ((var37 += var14) < var17) {
var14 = var15.charAt(var37);
continue label54;
}

var15 = "V\u0091@ôi\r={vIa¹ÊÝ\u000f\u0097¬a\u008c4%]:*\u0091Tlzy\u0092´¿Ï ½\r0!\u00015\u0010Ò)\u0087\u001fQ=ØÎbn\u001c¸ÅAoµ";
var17 = "V\u0091@ôi\r={vIa¹ÊÝ\u000f\u0097¬a\u008c4%]:*\u0091Tlzy\u0092´¿Ï ½\r0!\u00015\u0010Ò)\u0087\u001fQ=ØÎbn\u001c¸ÅAoµ".length();
var14 = '(';
var37 = -1;
}

var38 = var15.substring(++var37, var37 + var14);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30131;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/q_", var10);
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
throw new RuntimeException("su/catlean/q_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24205;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/q_", var14);
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
throw new RuntimeException("su/catlean/q_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
