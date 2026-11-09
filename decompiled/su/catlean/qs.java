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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.EntitySpawn;
import su.catlean.gofra.Flow;

public final class qs extends _g {
@NotNull
public static final qs c;
static final KProperty[] K;
@NotNull
private static final c8 Y;
@NotNull
private static final av b;
@NotNull
private static final cq W;
@NotNull
private static final cq e;
@NotNull
private static final cq I;
@NotNull
private static class_243 G;
@NotNull
private static bg f;
private static final long a = yz.a(-8322813928051460090L, 5770892342167639590L, MethodHandles.lookup().lookupClass()).a(113023663211465L);
private static final String[] d;
private static final String[] g;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] j;
private static final Map k;

private qs(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 102790477132195L;
super(b<"m">(17817, 4382902247837762968L ^ var1), jt.A(), null, 4, null, var3);
}

private final int E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 135470461928381L;
return ((Number)Y.E(this, var3, K[0])).intValue();
}

private final lj w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 18982311126957L;
return (lj)b.E(this, var3, K[1]);
}

private final boolean L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 131436574975100L;
return (Boolean)W.E(this, var3, K[2]);
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 18226615615185L;
return (Boolean)e.E(this, var3, K[3]);
}

private final boolean x(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 27518910901446L;
return (Boolean)I.E(this, var3, K[4]);
}

@Flow
private final void g(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qs.a J
// 003: ldc2_w 49784276739555
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 40196810340247
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 117279109573691
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 8651022524513
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 28277333297342
// 022: lxor
// 023: dup2
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 32
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: lstore 11
// 033: pop2
// 034: dup2
// 035: ldc2_w 86659184555428
// 038: lxor
// 039: dup2
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: dup2
// 041: bipush 32
// 043: lshl
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 14
// 04a: dup2
// 04b: bipush 48
// 04d: lshl
// 04e: bipush 48
// 050: lushr
// 051: l2i
// 052: istore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 6861394986774
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 109505459577809
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 24955303914074
// 067: lxor
// 068: lstore 20
// 06a: dup2
// 06b: ldc2_w 60301008579005
// 06e: lxor
// 06f: dup2
// 070: bipush 48
// 072: lushr
// 073: l2i
// 074: istore 22
// 076: dup2
// 077: bipush 16
// 079: lshl
// 07a: bipush 32
// 07c: lushr
// 07d: l2i
// 07e: istore 23
// 080: dup2
// 081: bipush 48
// 083: lshl
// 084: bipush 48
// 086: lushr
// 087: l2i
// 088: istore 24
// 08a: pop2
// 08b: dup2
// 08c: ldc2_w 137182751608394
// 08f: lxor
// 090: lstore 25
// 092: dup2
// 093: ldc2_w 19742846651476
// 096: lxor
// 097: lstore 27
// 099: dup2
// 09a: ldc2_w 4580669651377
// 09d: lxor
// 09e: lstore 29
// 0a0: pop2
// 0a1: ldc2_w 3160158158802683606
// 0a4: lload 2
// 0a5: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: astore 31
// 0ac: lload 4
// 0ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b1: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0b4: instanceof net/minecraft/class_3966
// 0b7: aload 31
// 0b9: ifnull 0fb
// 0bc: ifeq 114
// 0bf: goto 0cc
// 0c2: ldc2_w 3165945491999108212
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: lload 4
// 0ce: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d1: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0d4: dup
// 0d5: sipush 16709
// 0d8: ldc2_w 4602075877671062241
// 0db: lload 2
// 0dc: lxor
// 0dd: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0e5: checkcast net/minecraft/class_3966
// 0e8: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 0eb: instanceof net/minecraft/class_1511
// 0ee: goto 0fb
// 0f1: ldc2_w 3165945491999108212
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: aload 31
// 0fd: ifnull 111
// 100: ifeq 114
// 103: goto 110
// 106: ldc2_w 3165945491999108212
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: bipush 1
// 111: goto 115
// 114: bipush 0
// 115: istore 32
// 117: lload 4
// 119: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 11c: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 11f: instanceof net/minecraft/class_3965
// 122: aload 31
// 124: ifnull 174
// 127: ifeq 1df
// 12a: goto 137
// 12d: ldc2_w 3165945491999108212
// 130: lload 2
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: lload 16
// 139: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 13c: lload 4
// 13e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 141: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 144: dup
// 145: sipush 10128
// 148: ldc2_w 963947081246256172
// 14b: lload 2
// 14c: lxor
// 14d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 155: checkcast net/minecraft/class_3965
// 158: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 15b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 15e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 161: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 164: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 167: goto 174
// 16a: ldc2_w 3165945491999108212
// 16d: lload 2
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: aload 31
// 176: ifnull 1dc
// 179: ifne 1db
// 17c: goto 189
// 17f: ldc2_w 3165945491999108212
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: lload 16
// 18b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 18e: lload 4
// 190: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 193: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 196: dup
// 197: sipush 31019
// 19a: ldc2_w 7711638306041262731
// 19d: lload 2
// 19e: lxor
// 19f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1a7: checkcast net/minecraft/class_3965
// 1aa: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 1ad: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1b0: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1b3: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 1b6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1b9: aload 31
// 1bb: ifnull 1dc
// 1be: goto 1cb
// 1c1: ldc2_w 3165945491999108212
// 1c4: lload 2
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: ifeq 1df
// 1ce: goto 1db
// 1d1: ldc2_w 3165945491999108212
// 1d4: lload 2
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: bipush 1
// 1dc: goto 1e0
// 1df: bipush 0
// 1e0: istore 33
// 1e2: aload 0
// 1e3: lload 25
// 1e5: invokespecial su/catlean/qs.w (J)Lsu/catlean/lj;
// 1e8: invokevirtual su/catlean/lj.X ()I
// 1eb: iload 22
// 1ed: i2s
// 1ee: swap
// 1ef: iload 23
// 1f1: swap
// 1f2: iload 24
// 1f4: i2c
// 1f5: swap
// 1f6: invokestatic su/catlean/bx.k (SICI)Z
// 1f9: ifeq 4be
// 1fc: getstatic su/catlean/qs.f Lsu/catlean/bg;
// 1ff: aload 0
// 200: lload 20
// 202: invokespecial su/catlean/qs.E (J)I
// 205: iload 32
// 207: aload 31
// 209: ifnull 239
// 20c: goto 219
// 20f: ldc2_w 3165945491999108212
// 212: lload 2
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: ifeq 237
// 21c: goto 229
// 21f: ldc2_w 3165945491999108212
// 222: lload 2
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: bipush 1
// 22a: goto 253
// 22d: ldc2_w 3165945491999108212
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: iload 33
// 239: aload 31
// 23b: ifnull 24f
// 23e: ifeq 252
// 241: goto 24e
// 244: ldc2_w 3165945491999108212
// 247: lload 2
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: bipush 2
// 24f: goto 253
// 252: bipush 4
// 253: imul
// 254: lload 18
// 256: invokevirtual su/catlean/bg.q (IJ)Z
// 259: ifeq 4be
// 25c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 25f: bipush 1
// 260: anewarray 681
// 263: astore 35
// 265: aload 35
// 267: bipush 0
// 268: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
// 26b: dup
// 26c: sipush 18195
// 26f: ldc2_w 3247319815764135080
// 272: lload 2
// 273: lxor
// 274: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27c: aastore
// 27d: iload 13
// 27f: aload 35
// 281: iload 14
// 283: iload 15
// 285: i2c
// 286: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 289: invokevirtual su/catlean/fg.a ()I
// 28c: istore 34
// 28e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 291: bipush 1
// 292: anewarray 113
// 295: astore 36
// 297: aload 36
// 299: bipush 0
// 29a: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 29d: dup
// 29e: sipush 26918
// 2a1: ldc2_w 6759407799621280415
// 2a4: lload 2
// 2a5: lxor
// 2a6: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ae: aastore
// 2af: aload 36
// 2b1: lload 8
// 2b3: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_2248;J)Lsu/catlean/fg;
// 2b6: invokevirtual su/catlean/fg.a ()I
// 2b9: istore 35
// 2bb: iload 35
// 2bd: bipush -1
// 2be: aload 31
// 2c0: ifnull 31e
// 2c3: if_icmpne 31b
// 2c6: goto 2d3
// 2c9: ldc2_w 3165945491999108212
// 2cc: lload 2
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: iload 33
// 2d5: aload 31
// 2d7: ifnull 31d
// 2da: goto 2e7
// 2dd: ldc2_w 3165945491999108212
// 2e0: lload 2
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: ifne 31b
// 2ea: goto 2f7
// 2ed: ldc2_w 3165945491999108212
// 2f0: lload 2
// 2f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f6: athrow
// 2f7: iload 32
// 2f9: aload 31
// 2fb: ifnull 31d
// 2fe: goto 30b
// 301: ldc2_w 3165945491999108212
// 304: lload 2
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: ifeq 395
// 30e: goto 31b
// 311: ldc2_w 3165945491999108212
// 314: lload 2
// 315: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31a: athrow
// 31b: iload 34
// 31d: bipush -1
// 31e: aload 31
// 320: ifnull 34f
// 323: if_icmpeq 395
// 326: goto 333
// 329: ldc2_w 3165945491999108212
// 32c: lload 2
// 32d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 332: athrow
// 333: iload 34
// 335: sipush 22726
// 338: ldc2_w 8698285737339716864
// 33b: lload 2
// 33c: lxor
// 33d: invokedynamic u (IJ)I bsm=su/catlean/qs.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 342: goto 34f
// 345: ldc2_w 3165945491999108212
// 348: lload 2
// 349: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: athrow
// 34f: aload 31
// 351: ifnull 392
// 354: if_icmpge 395
// 357: goto 364
// 35a: ldc2_w 3165945491999108212
// 35d: lload 2
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: iload 35
// 366: aload 31
// 368: ifnull 398
// 36b: goto 378
// 36e: ldc2_w 3165945491999108212
// 371: lload 2
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: sipush 4209
// 37b: ldc2_w 8024165375680466353
// 37e: lload 2
// 37f: lxor
// 380: invokedynamic u (IJ)I bsm=su/catlean/qs.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 385: goto 392
// 388: ldc2_w 3165945491999108212
// 38b: lload 2
// 38c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 391: athrow
// 392: if_icmplt 396
// 395: return
// 396: iload 32
// 398: aload 31
// 39a: ifnull 3ff
// 39d: ifeq 3f4
// 3a0: goto 3ad
// 3a3: ldc2_w 3165945491999108212
// 3a6: lload 2
// 3a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ac: athrow
// 3ad: iload 10
// 3af: lload 11
// 3b1: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 3b4: lload 29
// 3b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3b9: checkcast net/minecraft/class_1657
// 3bc: lload 4
// 3be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3c1: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 3c4: dup
// 3c5: sipush 32751
// 3c8: ldc2_w 7640684440632390745
// 3cb: lload 2
// 3cc: lxor
// 3cd: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3d5: checkcast net/minecraft/class_3966
// 3d8: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 3db: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
// 3de: lload 29
// 3e0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e3: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 3e6: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 3e9: return
// 3ea: ldc2_w 3165945491999108212
// 3ed: lload 2
// 3ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f3: athrow
// 3f4: lload 29
// 3f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3f9: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 3fc: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 3ff: istore 36
// 401: aload 31
// 403: ifnull 4a3
// 406: iload 33
// 408: ifne 48c
// 40b: goto 418
// 40e: ldc2_w 3165945491999108212
// 411: lload 2
// 412: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: athrow
// 418: lload 29
// 41a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 41d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 420: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 423: iload 35
// 425: if_icmpeq 44c
// 428: goto 435
// 42b: ldc2_w 3165945491999108212
// 42e: lload 2
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 438: iload 35
// 43a: lload 6
// 43c: invokevirtual su/catlean/gg.f (IJ)V
// 43f: goto 44c
// 442: ldc2_w 3165945491999108212
// 445: lload 2
// 446: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44b: athrow
// 44c: lload 4
// 44e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 451: dup
// 452: sipush 32263
// 455: ldc2_w 1664994034013992363
// 458: lload 2
// 459: lxor
// 45a: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 462: checkcast su/catlean/mixins/accessors/MinecraftAccessor
// 465: invokeinterface su/catlean/mixins/accessors/MinecraftAccessor.idoItemUse ()V 1
// 46a: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 46d: aload 0
// 46e: lload 20
// 470: invokespecial su/catlean/qs.E (J)I
// 473: lload 27
// 475: dup2_x1
// 476: pop2
// 477: bipush 0
// 478: bipush 0
// 479: iload 34
// 47b: iload 36
// 47d: invokedynamic run (II)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/qs.Q (II)V, ()V ]
// 482: bipush 2
// 483: aconst_null
// 484: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 487: aload 31
// 489: ifnonnull 4be
// 48c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 48f: iload 34
// 491: lload 6
// 493: invokevirtual su/catlean/gg.f (IJ)V
// 496: goto 4a3
// 499: ldc2_w 3165945491999108212
// 49c: lload 2
// 49d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a2: athrow
// 4a3: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 4a6: aload 0
// 4a7: lload 20
// 4a9: invokespecial su/catlean/qs.E (J)I
// 4ac: lload 27
// 4ae: dup2_x1
// 4af: pop2
// 4b0: bipush 0
// 4b1: bipush 0
// 4b2: iload 36
// 4b4: invokedynamic run (I)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/qs.V (I)V, ()V ]
// 4b9: bipush 2
// 4ba: aconst_null
// 4bb: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 4be: return
}

@Flow
private final void D(EntitySpawn param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qs.a J
// 003: ldc2_w 5713980744806
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 55493853940766
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 86942280251445
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 118951920845061
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 54713479563579
// 031: lxor
// 032: dup2
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 32
// 03c: lshl
// 03d: bipush 32
// 03f: lushr
// 040: lstore 12
// 042: pop2
// 043: dup2
// 044: ldc2_w 83203234316087
// 047: lxor
// 048: lstore 14
// 04a: dup2
// 04b: ldc2_w 93876909889203
// 04e: lxor
// 04f: lstore 16
// 051: dup2
// 052: ldc2_w 50889572828819
// 055: lxor
// 056: lstore 18
// 058: dup2
// 059: ldc2_w 48789364963380
// 05c: lxor
// 05d: lstore 20
// 05f: pop2
// 060: ldc2_w -6170481868004718765
// 063: lload 2
// 064: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: astore 22
// 06b: aload 1
// 06c: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 06f: instanceof net/minecraft/class_1511
// 072: aload 22
// 074: ifnull 09d
// 077: ifeq 1cc
// 07a: goto 087
// 07d: ldc2_w -6166946506534244879
// 080: lload 2
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: getstatic su/catlean/qs.G Lnet/minecraft/class_243;
// 08a: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 08d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 090: goto 09d
// 093: ldc2_w -6166946506534244879
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 22
// 09f: ifnull 0cd
// 0a2: ifne 1cc
// 0a5: goto 0b2
// 0a8: ldc2_w -6166946506534244879
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: aload 1
// 0b3: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 0b6: getstatic su/catlean/qs.G Lnet/minecraft/class_243;
// 0b9: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 0bc: ldc2_w 4.0
// 0bf: dcmpg
// 0c0: goto 0cd
// 0c3: ldc2_w -6166946506534244879
// 0c6: lload 2
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 22
// 0cf: ifnull 10c
// 0d2: ifge 1cc
// 0d5: goto 0e2
// 0d8: ldc2_w -6166946506534244879
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 0e5: dup
// 0e6: sipush 7842
// 0e9: ldc2_w 5323240244912362647
// 0ec: lload 2
// 0ed: lxor
// 0ee: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f6: putstatic su/catlean/qs.G Lnet/minecraft/class_243;
// 0f9: aload 0
// 0fa: lload 4
// 0fc: invokespecial su/catlean/qs.L (J)Z
// 0ff: goto 10c
// 102: ldc2_w -6166946506534244879
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 22
// 10e: ifnull 196
// 111: ifeq 16f
// 114: goto 121
// 117: ldc2_w -6166946506534244879
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: lload 20
// 123: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 126: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 129: aload 0
// 12a: aload 1
// 12b: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 12e: iload 6
// 130: i2b
// 131: swap
// 132: lload 7
// 134: dup2_x1
// 135: pop2
// 136: invokevirtual su/catlean/qs.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 139: dconst_0
// 13a: ldc2_w 0.15
// 13d: dconst_0
// 13e: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 141: dup
// 142: sipush 12698
// 145: ldc2_w 8934128688375774114
// 148: lload 2
// 149: lxor
// 14a: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 152: lload 14
// 154: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 157: lload 9
// 159: invokevirtual su/catlean/_w.s (J)Lsu/catlean/_w;
// 15c: invokevirtual su/catlean/_w.N ()F
// 15f: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 162: goto 16f
// 165: ldc2_w -6166946506534244879
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: iload 11
// 171: lload 12
// 173: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 176: lload 20
// 178: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17b: checkcast net/minecraft/class_1657
// 17e: aload 1
// 17f: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 182: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
// 185: lload 20
// 187: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 18a: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 18d: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 190: aload 0
// 191: lload 16
// 193: invokespecial su/catlean/qs.Q (J)Z
// 196: ifeq 1cc
// 199: lload 18
// 19b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 19e: aload 1
// 19f: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 1a2: dup
// 1a3: sipush 442
// 1a6: ldc2_w 3590441349133601692
// 1a9: lload 2
// 1aa: lxor
// 1ab: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1b3: checkcast net/minecraft/class_1511
// 1b6: invokevirtual net/minecraft/class_1511.method_5628 ()I
// 1b9: getstatic net/minecraft/class_1297$class_5529.field_26998 Lnet/minecraft/class_1297$class_5529;
// 1bc: invokevirtual net/minecraft/class_638.method_2945 (ILnet/minecraft/class_1297$class_5529;)V
// 1bf: goto 1cc
// 1c2: ldc2_w -6166946506534244879
// 1c5: lload 2
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: return
}

private static final void F(int var0) {
long var1 = a ^ 57414889229178L;
long var3 = var1 ^ 127382683435682L;
gg.P.f(var0, var3);
}

private static final void w(int param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qs.a J
// 03: ldc2_w 75708205102102
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 84745913591394
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 32009059996884
// 13: lxor
// 14: lstore 5
// 16: dup2
// 17: ldc2_w 139836124887983
// 1a: lxor
// 1b: lstore 7
// 1d: dup2
// 1e: ldc2_w 132391357521313
// 21: lxor
// 22: lstore 9
// 24: pop2
// 25: ldc2_w -5031001792864446685
// 28: lload 1
// 29: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: lload 3
// 2f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 32: dup
// 33: sipush 552
// 36: ldc2_w 7802131418959190121
// 39: lload 1
// 3a: lxor
// 3b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 43: checkcast su/catlean/mixins/accessors/MinecraftAccessor
// 46: invokeinterface su/catlean/mixins/accessors/MinecraftAccessor.idoItemUse ()V 1
// 4b: astore 11
// 4d: getstatic su/catlean/qs.c Lsu/catlean/qs;
// 50: pop
// 51: aload 11
// 53: ifnull 95
// 56: lload 3
// 57: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 5d: dup
// 5e: ifnull 94
// 61: goto 6e
// 64: ldc2_w -5036472187577320063
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 71: dup
// 72: aload 11
// 74: ifnull 99
// 77: goto 84
// 7a: ldc2_w -5036472187577320063
// 7d: lload 1
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: ifnonnull a9
// 87: goto 94
// 8a: ldc2_w -5036472187577320063
// 8d: lload 1
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: pop
// 95: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 98: dup
// 99: sipush 7842
// 9c: ldc2_w 5323170259819136231
// 9f: lload 1
// a0: lxor
// a1: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a9: putstatic su/catlean/qs.G Lnet/minecraft/class_243;
// ac: getstatic su/catlean/qs.c Lsu/catlean/qs;
// af: lload 5
// b1: invokespecial su/catlean/qs.x (J)Z
// b4: ifeq e0
// b7: getstatic su/catlean/o8.g Lsu/catlean/o8;
// ba: getstatic su/catlean/qs.c Lsu/catlean/qs;
// bd: lload 7
// bf: invokespecial su/catlean/qs.E (J)I
// c2: lload 9
// c4: dup2_x1
// c5: pop2
// c6: bipush 0
// c7: bipush 0
// c8: iload 0
// c9: invokedynamic run (I)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/qs.F (I)V, ()V ]
// ce: bipush 2
// cf: aconst_null
// d0: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// d3: goto e0
// d6: ldc2_w -5036472187577320063
// d9: lload 1
// da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df: athrow
// e0: return
}

private static final void Q(int var0, int var1) {
long var2 = a ^ 72456785196994L;
long var4 = var2 ^ 6645614280218L;
long var6 = var2 ^ 134223010101371L;
long var8 = var2 ^ 137807709118069L;
gg.P.f(var0, var4);
o8.p(o8.g, var8, c.E(var6), (byte)0, false, qs::w, 2, null);
}

private static final void Z(int var0) {
long var1 = a ^ 33866421988134L;
long var3 = var1 ^ 97995073151742L;
gg.P.f(var0, var3);
}

private static final void V(int param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qs.a J
// 03: ldc2_w 88679014354391
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 98335216033699
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 10310893907221
// 13: lxor
// 14: lstore 5
// 16: dup2
// 17: ldc2_w 118000518775406
// 1a: lxor
// 1b: lstore 7
// 1d: dup2
// 1e: ldc2_w 118836415931488
// 21: lxor
// 22: lstore 9
// 24: pop2
// 25: ldc2_w 283549730833411810
// 28: lload 1
// 29: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: lload 3
// 2f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 32: dup
// 33: sipush 552
// 36: ldc2_w 7802109548960391592
// 39: lload 1
// 3a: lxor
// 3b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 43: checkcast su/catlean/mixins/accessors/MinecraftAccessor
// 46: invokeinterface su/catlean/mixins/accessors/MinecraftAccessor.idoItemUse ()V 1
// 4b: astore 11
// 4d: getstatic su/catlean/qs.c Lsu/catlean/qs;
// 50: pop
// 51: aload 11
// 53: ifnull 95
// 56: lload 3
// 57: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 5d: dup
// 5e: ifnull 94
// 61: goto 6e
// 64: ldc2_w 278043705122489408
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 71: dup
// 72: aload 11
// 74: ifnull 99
// 77: goto 84
// 7a: ldc2_w 278043705122489408
// 7d: lload 1
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: ifnonnull a9
// 87: goto 94
// 8a: ldc2_w 278043705122489408
// 8d: lload 1
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: pop
// 95: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 98: dup
// 99: sipush 7842
// 9c: ldc2_w 5323157289010216230
// 9f: lload 1
// a0: lxor
// a1: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a9: putstatic su/catlean/qs.G Lnet/minecraft/class_243;
// ac: getstatic su/catlean/qs.c Lsu/catlean/qs;
// af: lload 5
// b1: invokespecial su/catlean/qs.x (J)Z
// b4: ifeq e0
// b7: getstatic su/catlean/o8.g Lsu/catlean/o8;
// ba: getstatic su/catlean/qs.c Lsu/catlean/qs;
// bd: lload 7
// bf: invokespecial su/catlean/qs.E (J)I
// c2: lload 9
// c4: dup2_x1
// c5: pop2
// c6: bipush 0
// c7: bipush 0
// c8: iload 0
// c9: invokedynamic run (I)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/qs.Z (I)V, ()V ]
// ce: bipush 2
// cf: aconst_null
// d0: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// d3: goto e0
// d6: ldc2_w 278043705122489408
// d9: lload 1
// da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df: athrow
// e0: return
}

static {
long var20 = a ^ 134040623585386L;
long var22 = var20 ^ 132700972686563L;
long var24 = var20 ^ 95758267060613L;
long var26 = var20 ^ 3603423655351L;
long var28 = var20 ^ 6190978398480L;
long var10001 = var20 ^ 42307268482724L;
int var30 = (int)((var20 ^ 42307268482724L) >>> 32);
int var31 = (int)((var20 ^ 42307268482724L) << 32 >>> 48);
int var32 = (int)(var10001 << 48 >>> 48);
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
String var15 = "\u0096Å)§¶ËÏï\u008c\u0081Ýv¶m15\u0097Dûñ:^÷¸¥Â¯\u0006\u00979\u0015\f\u0080\u0080¿øRùïÌ£\u00068\u001a¢Ò¬|/ÙöG« l\u001aN4|âXªÓv\u0016÷Sâö¡\u0017]½-ó4Y¾2ó\u009eý\u0005´\u001eÄÃ%OèÐ¨²7þ\u0098d.g\u0082\t\"\u0083%©\u009b\u0085\f\u0093áÀ\u000f¤]Y\t`x\u0084\u0019²\u0083Ô¦é¾\u0096ñoôÔ\u001e5\u008e\u0083ª}[ÖîmZò®Ø¦\fÙ\u0012À¹¬X*i§\u000e=o,?(\u0091>#{¬0}E¦'dw\bÔaGôI4Á\u0007r/-L\u0093#¡Ã\u001aO\u0003ô\u0093êí\u0017P+\u0099\u0088ß\u0013\u001d\rñ§ò°yñ\r¾ï\u001bä°]à_\f\u0017\u008e:\u0003\u000eäËÁ\u0017§^¯&iaUó\u009a\u007febFS¥Oiñ\u009e==[\u0082¶G\u0015\u009e*ö\t\u0088\u008cß\u000b(âX\u001f&Ç¡\u008cód«û\u0010R\u0002-¿µÕøÀ\u0018y)¤{}³3\u001eÏ/)àP\u0015?¨þ\u001f¤aà¦¶µÛièÕÈ\u0090\u0019J\u009bÖJ\u001b\fPpXvÑ}\u0011íñ~mxÒü\u0010{÷\u000f 94m¤7\bÍmÞ`_%\u0010À\b\u007fj¢½{.þíÂ¢Å~²ð Y8ö\u0081í\u0015ÔFóîcQ^Ci^U\fýì¸h\u0092Èm?\u0095¯·Ô\u009dí\u00100Gw\u0095Ëî¯\u001e'z|½ú\u0013¼8 \rV¸\u0090Ôþ³&ÊTæ\u0010·¶ß!EàÎýÝ^{ý\u009ctmk¬ \u0087ì\u0018\u009b *\u0019±\u009d\u0011\u008fÎ\u0004G\tt,]Õ\u0015\u0090[\u0090+Ï']\u0018\r\u0017\u0088Ì\u0088þ\u0002G&!ÚÀvå³¶Å\u0016\u009f&\u0001\u001e\u0085¨\u0080ß\u001cR¤hÌIë\u0006\u008a\u0005B8\u0092,îL¨j¸\u0096c\f¡×°vaY.¸³¾\u0014\u009bÙe\u008aF\u0093ø¬cé\u0091\u008699\u0012¶\f\u0097v\u0016\u0086X\u0086z\u00ad~ô3\u001cî\u008e§YÔbÏ·¦úÚ¢è\bsR&\u0097? IËè\u0001K;<,Ð¤ÏpÇÊííaÿ|\u000e6jè§\u001cðúpþR½-vîT\u0000\u008d%Â4â?\u0084Þã k\u008cØ\u0081´S\u0010\u0096Jû\u0000ÊÙ\u000ftëN´äÅpZfÔ+\u0002qFwBA\u0014 \fu\f¾Ù²\\÷\u0002¤,aÃ\u008bO,Õ´¥°3Y\u0011^âòeXk ¨¸ \u008e\u000f¥±\u0014ì«Â\u0019«Öf\u0012?¥@Ê\u0089\u0015Á{òP{ËGô¤\u008c©u[(Óþ'Jc\\Ä¶\u001cµ\u0082üß\u0089ÏÌØ®kIF'i{§\"¡\u0084z\u001fÔA÷\u008a\u0006\u009a×¬Û¨ µ²»\u0013\u0083§{h KOþ\u0091É<Ù$\u0011pfû\u0095Öÿ7òL¡õ\u00132A(·Â$\u001dÅo^\u008caLò4åt·W(þ\u0096ô°\u000e-Ó¶S\u009e6\u0011\u0011$P¥]'»XÔ¦ë \u0010E±`0-h\u0092of0æù1&÷é\u0000Q\u0004»2\u008bH<ÍôI:ÄÞ\u000bx|W®Èza¦&\u001e\r\u0001±'\n\u007fºãwù\u009aµÒ\u0011Uâh¦òµ\u0014\u000eF=Ù\u00adðtjZò©5\u0012\u00837\u009e\u0097:p\u0085$t\u0003\b¥â¶\u0098Õé\u008eíßè\u0081[¶\u0003â\u0017Õâ×\\ØÌ£sÐ\u009e &ÇxÝ5È\u0004l@fr\u009d»°äf\u0086\u009eRå»Cêù&!¢é-Ç\u009b§ç³ktÖ\u001dZ\u0090eÛ+À\u0018p\u0017g\u0099\u0018\u0017f<\u0011Q\b¨M'ê¾ü\u0087\u0088J\u0015\u00ad\u0001¸a\u0007©ú¥\u001a\u000e\u0017ñ|^|\u001cH\u008eSý\u0014\u0002gi)ç°û/\u0006\u001a\u0010\u0011&z\u001f\u009d\u009cÜkòê¡ÁÊÉ\u007f³\u0019kùï¾¸y\u0003²t\u0093q\u0099¿\u009d\b¾Öë\\y3Ù\u007fÑ\u008a|zë\t§xh\u0087\u000bn >Ü\u0085©\u0005È\u001fg \u0080\u0006\u0080¶V\u0005ô\u0080FèÛMÔòìè\u0007@Ò\u009caÿ\u0004H\u0018\u0000\u0003ÍZ$q¡5*G\u001b\u001d\u0015wª%-Bvª¤WÃ\u0005(.\u009fÓ\u0097\r\u0019}\u0098\u001aU¡\u00155@¥Y\u0018\u0019hÇ¿Çð¼Mß\"·þq§«Ñ§\u0090\u009fÔ÷åö\u0088\u009e¹vÐï47¢D\u00005>²Gz9\u0013+åqnÝ¼kõH2(\u008a\u00ad>tÿ\u009cWÇ\u00101\u0004\u0003²1ª\f~\u001fgj}vÚñb{\u0087\u001aö9§åc¶òm\u000bóËñl\u0091§\u001d\u0087·B\u001b\u001f\u009f\u001dd\rB\u001aé\u0091òñ×ïµY\u0086\u00193»¿\u0089V;\f\\iö3\u007fðÃ`\u0095^r\u009d¤\u009f_Ì\u00adS{\u0012¥7\f(\f\u0096N(\u0006û?¨ÊôÈ\u009c ¼Ì\\±¬$¯'ùË«\u0095õÌ*åY\u008aZ?¬:a£À\u00adÄ©\u001elÃ10\"¬\u0098\u0081\u0012)PîS\u001b`õt\u001dð¡\u001fÎ§>d\u0084\u009a'q2AhZ\u0089\u0092nZ8A\ntT\u0006CÍeY\u0089ò!Ö\u0080";
int var17 = "\u0096Å)§¶ËÏï\u008c\u0081Ýv¶m15\u0097Dûñ:^÷¸¥Â¯\u0006\u00979\u0015\f\u0080\u0080¿øRùïÌ£\u00068\u001a¢Ò¬|/ÙöG« l\u001aN4|âXªÓv\u0016÷Sâö¡\u0017]½-ó4Y¾2ó\u009eý\u0005´\u001eÄÃ%OèÐ¨²7þ\u0098d.g\u0082\t\"\u0083%©\u009b\u0085\f\u0093áÀ\u000f¤]Y\t`x\u0084\u0019²\u0083Ô¦é¾\u0096ñoôÔ\u001e5\u008e\u0083ª}[ÖîmZò®Ø¦\fÙ\u0012À¹¬X*i§\u000e=o,?(\u0091>#{¬0}E¦'dw\bÔaGôI4Á\u0007r/-L\u0093#¡Ã\u001aO\u0003ô\u0093êí\u0017P+\u0099\u0088ß\u0013\u001d\rñ§ò°yñ\r¾ï\u001bä°]à_\f\u0017\u008e:\u0003\u000eäËÁ\u0017§^¯&iaUó\u009a\u007febFS¥Oiñ\u009e==[\u0082¶G\u0015\u009e*ö\t\u0088\u008cß\u000b(âX\u001f&Ç¡\u008cód«û\u0010R\u0002-¿µÕøÀ\u0018y)¤{}³3\u001eÏ/)àP\u0015?¨þ\u001f¤aà¦¶µÛièÕÈ\u0090\u0019J\u009bÖJ\u001b\fPpXvÑ}\u0011íñ~mxÒü\u0010{÷\u000f 94m¤7\bÍmÞ`_%\u0010À\b\u007fj¢½{.þíÂ¢Å~²ð Y8ö\u0081í\u0015ÔFóîcQ^Ci^U\fýì¸h\u0092Èm?\u0095¯·Ô\u009dí\u00100Gw\u0095Ëî¯\u001e'z|½ú\u0013¼8 \rV¸\u0090Ôþ³&ÊTæ\u0010·¶ß!EàÎýÝ^{ý\u009ctmk¬ \u0087ì\u0018\u009b *\u0019±\u009d\u0011\u008fÎ\u0004G\tt,]Õ\u0015\u0090[\u0090+Ï']\u0018\r\u0017\u0088Ì\u0088þ\u0002G&!ÚÀvå³¶Å\u0016\u009f&\u0001\u001e\u0085¨\u0080ß\u001cR¤hÌIë\u0006\u008a\u0005B8\u0092,îL¨j¸\u0096c\f¡×°vaY.¸³¾\u0014\u009bÙe\u008aF\u0093ø¬cé\u0091\u008699\u0012¶\f\u0097v\u0016\u0086X\u0086z\u00ad~ô3\u001cî\u008e§YÔbÏ·¦úÚ¢è\bsR&\u0097? IËè\u0001K;<,Ð¤ÏpÇÊííaÿ|\u000e6jè§\u001cðúpþR½-vîT\u0000\u008d%Â4â?\u0084Þã k\u008cØ\u0081´S\u0010\u0096Jû\u0000ÊÙ\u000ftëN´äÅpZfÔ+\u0002qFwBA\u0014 \fu\f¾Ù²\\÷\u0002¤,aÃ\u008bO,Õ´¥°3Y\u0011^âòeXk ¨¸ \u008e\u000f¥±\u0014ì«Â\u0019«Öf\u0012?¥@Ê\u0089\u0015Á{òP{ËGô¤\u008c©u[(Óþ'Jc\\Ä¶\u001cµ\u0082üß\u0089ÏÌØ®kIF'i{§\"¡\u0084z\u001fÔA÷\u008a\u0006\u009a×¬Û¨ µ²»\u0013\u0083§{h KOþ\u0091É<Ù$\u0011pfû\u0095Öÿ7òL¡õ\u00132A(·Â$\u001dÅo^\u008caLò4åt·W(þ\u0096ô°\u000e-Ó¶S\u009e6\u0011\u0011$P¥]'»XÔ¦ë \u0010E±`0-h\u0092of0æù1&÷é\u0000Q\u0004»2\u008bH<ÍôI:ÄÞ\u000bx|W®Èza¦&\u001e\r\u0001±'\n\u007fºãwù\u009aµÒ\u0011Uâh¦òµ\u0014\u000eF=Ù\u00adðtjZò©5\u0012\u00837\u009e\u0097:p\u0085$t\u0003\b¥â¶\u0098Õé\u008eíßè\u0081[¶\u0003â\u0017Õâ×\\ØÌ£sÐ\u009e &ÇxÝ5È\u0004l@fr\u009d»°äf\u0086\u009eRå»Cêù&!¢é-Ç\u009b§ç³ktÖ\u001dZ\u0090eÛ+À\u0018p\u0017g\u0099\u0018\u0017f<\u0011Q\b¨M'ê¾ü\u0087\u0088J\u0015\u00ad\u0001¸a\u0007©ú¥\u001a\u000e\u0017ñ|^|\u001cH\u008eSý\u0014\u0002gi)ç°û/\u0006\u001a\u0010\u0011&z\u001f\u009d\u009cÜkòê¡ÁÊÉ\u007f³\u0019kùï¾¸y\u0003²t\u0093q\u0099¿\u009d\b¾Öë\\y3Ù\u007fÑ\u008a|zë\t§xh\u0087\u000bn >Ü\u0085©\u0005È\u001fg \u0080\u0006\u0080¶V\u0005ô\u0080FèÛMÔòìè\u0007@Ò\u009caÿ\u0004H\u0018\u0000\u0003ÍZ$q¡5*G\u001b\u001d\u0015wª%-Bvª¤WÃ\u0005(.\u009fÓ\u0097\r\u0019}\u0098\u001aU¡\u00155@¥Y\u0018\u0019hÇ¿Çð¼Mß\"·þq§«Ñ§\u0090\u009fÔ÷åö\u0088\u009e¹vÐï47¢D\u00005>²Gz9\u0013+åqnÝ¼kõH2(\u008a\u00ad>tÿ\u009cWÇ\u00101\u0004\u0003²1ª\f~\u001fgj}vÚñb{\u0087\u001aö9§åc¶òm\u000bóËñl\u0091§\u001d\u0087·B\u001b\u001f\u009f\u001dd\rB\u001aé\u0091òñ×ïµY\u0086\u00193»¿\u0089V;\f\\iö3\u007fðÃ`\u0095^r\u009d¤\u009f_Ì\u00adS{\u0012¥7\f(\f\u0096N(\u0006û?¨ÊôÈ\u009c ¼Ì\\±¬$¯'ùË«\u0095õÌ*åY\u008aZ?¬:a£À\u00adÄ©\u001elÃ10\"¬\u0098\u0081\u0012)PîS\u001b`õt\u001dð¡\u001fÎ§>d\u0084\u009a'q2AhZ\u0089\u0092nZ8A\ntT\u0006CÍeY\u0089ò!Ö\u0080"
.length();
char var14 = ' ';
int var36 = -1;

label54:
while (true) {
String var37 = var15.substring(++var36, var36 + var14);
byte var42 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var42) {
case 0:
var18[var16++] = var50;
if ((var36 += var14) >= var17) {
d = var18;
g = new String[28];
k = new HashMap(13);
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
String var4 = "ÞZ`\u0083\u008d\u00054Ë\u0099´ö\u0089\u0097O\u000bZºî1êõí}\u0090\u0099\u008ek\u0019Hîìk\"ñÔ\u0002F\u009cH¤";
int var5 = "ÞZ`\u0083\u008d\u00054Ë\u0099´ö\u0089\u0097O\u000bZºî1êõí}\u0090\u0099\u008ek\u0019Hîìk\"ñÔ\u0002F\u009cH¤".length();
byte var2 = 0;

label36:
while (true) {
byte var46 = var2;
var2 += 8;
byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
int var47 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var57 = -1;

while (true) {
long var8 = var54;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var59 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var57) {
case 0:
var40[var47] = var59;
if (var2 >= var5) {
i = var6;
j = new Integer[7];
KProperty[] var33 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qs.class, b<"m">(32034, 3029590310221974276L ^ var20), b<"m">(27998, 1763011255520435055L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qs.class, b<"m">(31108, 8477889183330865082L ^ var20), b<"m">(21640, 7422418125278028463L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qs.class, b<"m">(16854, 6330566198771693536L ^ var20), b<"m">(21388, 4678867509360436648L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qs.class, b<"m">(21024, 712339178208797704L ^ var20), b<"m">(772, 3709025842028016939L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qs.class, b<"m">(5060, 6363276578105714167L ^ var20), b<"m">(18804, 1447444108232048456L ^ var20), 0))
};
K = var33;
c = new qs(var28);
Y = yp.L(
c,
b<"m">(31138, 8556261362865246105L ^ var20),
0,
new IntRange(0, c<"u">(20424, 5509977257518886788L ^ var20)),
var22,
null,
null,
c<"u">(2808, 5038127880651713202L ^ var20),
null
);
b = yp.J(
c,
b<"m">(32755, 6333305414388779460L ^ var20),
new lj(0, false, var26, false, c<"u">(12596, 3654047612055589242L ^ var20), null),
null,
var30,
null,
var31,
(char)var32,
c<"u">(5384, 6569239621335004483L ^ var20),
null
);
W = yp.t(c, b<"m">(2875, 8011270594447179029L ^ var20), false, var24, null, null, c<"u">(9952, 5663623092350977704L ^ var20), null);
e = yp.t(c, b<"m">(16655, 5661003733000927012L ^ var20), false, var24, null, null, c<"u">(9952, 5663623092350977704L ^ var20), null);
I = yp.t(c, b<"m">(26597, 2198437436257505757L ^ var20), false, var24, null, null, c<"u">(9952, 5663623092350977704L ^ var20), null);
class_243 var41 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"m">(6247, 343464282638839389L ^ var20));
G = var41;
f = new bg();
return;
}
break;
default:
var40[var47] = var59;
if (var2 < var5) {
continue label36;
}

var4 = "[N¯ÁsTw\u0002=7}W\u0019_äÝ";
var5 = "[N¯ÁsTw\u0002=7}W\u0019_äÝ".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var40 = var6;
var47 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var57 = 0;
}
}
}

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var50;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "ÿ¨g\b\u00806SO\"õöò\u0007µTð·AUÙ=Êê¦¶#Ü|ü»\b\u0000§\u0006ÿã6Ì\u009d{\u0090y6p\rÛª÷\u000b\u001ad[¼îó8ºM\u001a\u0005\u0093f\u0099ÊUàX({Þ§ÄÉ_¡ç\u009e>3,\u0012\u0006\u0019^¿\u0082\u0016¬ËI\u0093 yÕYÉ\u001f\u008fá×W&\u008f-ëêyBw\n×ðÐß¥ÛÎõgú\u0089æm±\u0080\u0002Vê[ª¢*KnäÔ\u009c'\u001a\u001fi\u0003\u009c¿\u001cEø\u009dz\u0004¸ä\u001cNP¶*ü\u009f\u0005O\u0011Ë¹\u0081\\\u0098\u0097\u000fÞ,Ëe²U\u008aÐh\u0003\u0014ÜH\u007f\u001d*";
var17 = "ÿ¨g\b\u00806SO\"õöò\u0007µTð·AUÙ=Êê¦¶#Ü|ü»\b\u0000§\u0006ÿã6Ì\u009d{\u0090y6p\rÛª÷\u000b\u001ad[¼îó8ºM\u001a\u0005\u0093f\u0099ÊUàX({Þ§ÄÉ_¡ç\u009e>3,\u0012\u0006\u0019^¿\u0082\u0016¬ËI\u0093 yÕYÉ\u001f\u008fá×W&\u008f-ëêyBw\n×ðÐß¥ÛÎõgú\u0089æm±\u0080\u0002Vê[ª¢*KnäÔ\u009c'\u001a\u001fi\u0003\u009c¿\u001cEø\u009dz\u0004¸ä\u001cNP¶*ü\u009f\u0005O\u0011Ë¹\u0081\\\u0098\u0097\u000fÞ,Ëe²U\u008aÐh\u0003\u0014ÜH\u007f\u001d*"
.length();
var14 = '(';
var36 = -1;
}

var37 = var15.substring(++var36, var36 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8553;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qs", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/qs" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30493;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
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
throw new RuntimeException("su/catlean/qs", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/qs" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
