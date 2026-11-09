package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.gofra.Flow;

public final class ef extends _g {
@NotNull
public static final ef V;
@NotNull
private static final cl g;
@NotNull
private static final cl e;
@NotNull
private static final cl x;
@NotNull
private static final cl T;
@NotNull
private static final cl b;
@NotNull
private static final cq a;
private static final long c = yz.a(6421587437488320030L, -3118933473525214565L, MethodHandles.lookup().lookupClass()).a(67492385117281L);
private static final String[] d;
private static final String[] f;
private static final Map h = new HashMap(13);

private ef(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 25442226523241L;
super(b<"r">(6818, 7021643909277202847L ^ var1), jt.y(), null, 4, null, var3);
}

private final String G(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 110888955979299L;
return (String)g.E(this, var6, E[0]);
}

private final String s(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 104424633454007L;
return (String)e.E(this, var6, E[1]);
}

private final String v(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ c;
long var6 = var4 ^ 6687165358718L;
return (String)x.E(this, var6, E[2]);
}

private final String K(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 18950611330908L;
return (String)T.E(this, var3, E[3]);
}

private final String w(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 1223997141928L;
return (String)b.E(this, var3, E[4]);
}

private final boolean W(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 61431838043714L;
return (Boolean)a.E(this, var3, E[5]);
}

@Flow
public final void V(@NotNull ScreenEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ef.c J
// 003: ldc2_w 59667242551414
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 123764183688716
// 00d: lxor
// 00e: dup2
// 00f: bipush 8
// 011: lushr
// 012: lstore 4
// 014: dup2
// 015: bipush 56
// 017: lshl
// 018: bipush 56
// 01a: lushr
// 01b: l2i
// 01c: istore 6
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 4936898665412
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 136416454749430
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 15761662389059
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 39217431353846
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 33918058352414
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 40514420299234
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 71862667946544
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 20198073393745
// 054: lxor
// 055: dup2
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 21
// 05c: dup2
// 05d: bipush 32
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 22
// 066: dup2
// 067: bipush 48
// 069: lshl
// 06a: bipush 48
// 06c: lushr
// 06d: l2i
// 06e: istore 23
// 070: pop2
// 071: dup2
// 072: ldc2_w 62971449877741
// 075: lxor
// 076: dup2
// 077: bipush 32
// 079: lushr
// 07a: l2i
// 07b: istore 24
// 07d: dup2
// 07e: bipush 32
// 080: lshl
// 081: bipush 32
// 083: lushr
// 084: lstore 25
// 086: pop2
// 087: dup2
// 088: ldc2_w 121094781000183
// 08b: lxor
// 08c: dup2
// 08d: bipush 32
// 08f: lushr
// 090: l2i
// 091: istore 27
// 093: dup2
// 094: bipush 32
// 096: lshl
// 097: bipush 48
// 099: lushr
// 09a: l2i
// 09b: istore 28
// 09d: dup2
// 09e: bipush 48
// 0a0: lshl
// 0a1: bipush 48
// 0a3: lushr
// 0a4: l2i
// 0a5: istore 29
// 0a7: pop2
// 0a8: dup2
// 0a9: ldc2_w 40175957369255
// 0ac: lxor
// 0ad: lstore 30
// 0af: dup2
// 0b0: ldc2_w 62126704173065
// 0b3: lxor
// 0b4: dup2
// 0b5: bipush 32
// 0b7: lushr
// 0b8: l2i
// 0b9: istore 32
// 0bb: dup2
// 0bc: bipush 32
// 0be: lshl
// 0bf: bipush 48
// 0c1: lushr
// 0c2: l2i
// 0c3: istore 33
// 0c5: dup2
// 0c6: bipush 48
// 0c8: lshl
// 0c9: bipush 48
// 0cb: lushr
// 0cc: l2i
// 0cd: istore 34
// 0cf: pop2
// 0d0: dup2
// 0d1: ldc2_w 44520071170501
// 0d4: lxor
// 0d5: dup2
// 0d6: bipush 32
// 0d8: lushr
// 0d9: l2i
// 0da: istore 35
// 0dc: dup2
// 0dd: bipush 32
// 0df: lshl
// 0e0: bipush 48
// 0e2: lushr
// 0e3: l2i
// 0e4: istore 36
// 0e6: dup2
// 0e7: bipush 48
// 0e9: lshl
// 0ea: bipush 48
// 0ec: lushr
// 0ed: l2i
// 0ee: istore 37
// 0f0: pop2
// 0f1: dup2
// 0f2: ldc2_w 114042829873966
// 0f5: lxor
// 0f6: lstore 38
// 0f8: pop2
// 0f9: ldc2_w -8705139845562929303
// 0fc: lload 2
// 0fd: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: aload 1
// 103: ldc "e"
// 105: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 108: istore 40
// 10a: aload 1
// 10b: invokevirtual su/catlean/api/event/events/client/ScreenEvent.getScreen ()Lnet/minecraft/class_437;
// 10e: iload 40
// 110: ifeq 148
// 113: instanceof net/minecraft/class_498
// 116: ifeq 37d
// 119: goto 126
// 11c: ldc2_w -8650641652106660247
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 1
// 127: invokevirtual su/catlean/api/event/events/client/ScreenEvent.getScreen ()Lnet/minecraft/class_437;
// 12a: dup
// 12b: sipush 9446
// 12e: ldc2_w 2788432460991995369
// 131: lload 2
// 132: lxor
// 133: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 13b: goto 148
// 13e: ldc2_w -8650641652106660247
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: checkcast su/catlean/mixins/accessors/SignEditScreenAccessor
// 14b: astore 41
// 14d: aload 1
// 14e: invokevirtual su/catlean/api/event/events/client/ScreenEvent.cancel ()V
// 151: new net/minecraft/class_2877
// 154: dup
// 155: aload 41
// 157: invokeinterface su/catlean/mixins/accessors/SignEditScreenAccessor.getSign ()Lnet/minecraft/class_2625; 1
// 15c: invokevirtual net/minecraft/class_2625.method_11016 ()Lnet/minecraft/class_2338;
// 15f: aload 41
// 161: invokeinterface su/catlean/mixins/accessors/SignEditScreenAccessor.isIsFrontText ()Z 1
// 166: aload 0
// 167: aload 0
// 168: iload 21
// 16a: iload 22
// 16c: iload 23
// 16e: i2c
// 16f: invokespecial su/catlean/ef.G (IIC)Ljava/lang/String;
// 172: iload 32
// 174: swap
// 175: iload 33
// 177: iload 34
// 179: i2s
// 17a: invokespecial su/catlean/ef.l (ILjava/lang/String;IS)Ljava/lang/String;
// 17d: aload 0
// 17e: aload 0
// 17f: iload 35
// 181: iload 36
// 183: iload 37
// 185: i2s
// 186: invokespecial su/catlean/ef.s (IIS)Ljava/lang/String;
// 189: iload 32
// 18b: swap
// 18c: iload 33
// 18e: iload 34
// 190: i2s
// 191: invokespecial su/catlean/ef.l (ILjava/lang/String;IS)Ljava/lang/String;
// 194: aload 0
// 195: aload 0
// 196: lload 4
// 198: iload 6
// 19a: i2b
// 19b: invokespecial su/catlean/ef.v (JB)Ljava/lang/String;
// 19e: iload 32
// 1a0: swap
// 1a1: iload 33
// 1a3: iload 34
// 1a5: i2s
// 1a6: invokespecial su/catlean/ef.l (ILjava/lang/String;IS)Ljava/lang/String;
// 1a9: aload 0
// 1aa: aload 0
// 1ab: lload 38
// 1ad: invokespecial su/catlean/ef.K (J)Ljava/lang/String;
// 1b0: iload 32
// 1b2: swap
// 1b3: iload 33
// 1b5: iload 34
// 1b7: i2s
// 1b8: invokespecial su/catlean/ef.l (ILjava/lang/String;IS)Ljava/lang/String;
// 1bb: invokespecial net/minecraft/class_2877.<init> (Lnet/minecraft/class_2338;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
// 1be: checkcast net/minecraft/class_2596
// 1c1: lload 30
// 1c3: dup2_x1
// 1c4: pop2
// 1c5: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1c8: aload 0
// 1c9: lload 19
// 1cb: invokespecial su/catlean/ef.W (J)Z
// 1ce: iload 40
// 1d0: ifeq 1fe
// 1d3: ifeq 37d
// 1d6: goto 1e3
// 1d9: ldc2_w -8650641652106660247
// 1dc: lload 2
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: aload 41
// 1e5: invokeinterface su/catlean/mixins/accessors/SignEditScreenAccessor.getSign ()Lnet/minecraft/class_2625; 1
// 1ea: bipush 1
// 1eb: invokevirtual net/minecraft/class_2625.method_49843 (Z)Lnet/minecraft/class_8242;
// 1ee: invokevirtual net/minecraft/class_8242.method_49856 ()Z
// 1f1: goto 1fe
// 1f4: ldc2_w -8650641652106660247
// 1f7: lload 2
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: ifne 37d
// 201: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 204: bipush 1
// 205: anewarray 477
// 208: astore 43
// 20a: aload 43
// 20c: bipush 0
// 20d: getstatic net/minecraft/class_1802.field_28410 Lnet/minecraft/class_1792;
// 210: dup
// 211: sipush 10721
// 214: ldc2_w 8974900992223777007
// 217: lload 2
// 218: lxor
// 219: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 221: aastore
// 222: iload 27
// 224: aload 43
// 226: iload 28
// 228: iload 29
// 22a: i2c
// 22b: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 22e: astore 42
// 230: lload 7
// 232: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 235: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 238: dup
// 239: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 23c: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 23f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 242: getstatic net/minecraft/class_1802.field_28410 Lnet/minecraft/class_1792;
// 245: if_acmpne 256
// 248: bipush 1
// 249: goto 257
// 24c: ldc2_w -8650641652106660247
// 24f: lload 2
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: bipush 0
// 257: istore 43
// 259: lload 7
// 25b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 25e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 261: dup
// 262: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 265: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 268: istore 44
// 26a: aload 42
// 26c: invokevirtual su/catlean/fg.R ()Z
// 26f: iload 40
// 271: ifeq 2c6
// 274: ifne 2a8
// 277: goto 284
// 27a: ldc2_w -8650641652106660247
// 27d: lload 2
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: iload 43
// 286: iload 40
// 288: ifeq 2c6
// 28b: goto 298
// 28e: ldc2_w -8650641652106660247
// 291: lload 2
// 292: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 297: athrow
// 298: ifeq 37d
// 29b: goto 2a8
// 29e: ldc2_w -8650641652106660247
// 2a1: lload 2
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2ab: lload 11
// 2ad: invokevirtual su/catlean/gg.o (J)V
// 2b0: aload 42
// 2b2: lload 15
// 2b4: invokevirtual su/catlean/fg.x (J)V
// 2b7: iload 44
// 2b9: goto 2c6
// 2bc: ldc2_w -8650641652106660247
// 2bf: lload 2
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: ifeq 2df
// 2c9: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 2cc: lload 9
// 2ce: bipush 0
// 2cf: invokevirtual su/catlean/wu.G (JZ)V
// 2d2: goto 2df
// 2d5: ldc2_w -8650641652106660247
// 2d8: lload 2
// 2d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: athrow
// 2df: iload 24
// 2e1: lload 25
// 2e3: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 2e6: lload 17
// 2e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2eb: iload 43
// 2ed: ifeq 300
// 2f0: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 2f3: goto 303
// 2f6: ldc2_w -8650641652106660247
// 2f9: lload 2
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 303: new net/minecraft/class_3965
// 306: dup
// 307: aload 41
// 309: invokeinterface su/catlean/mixins/accessors/SignEditScreenAccessor.getSign ()Lnet/minecraft/class_2625; 1
// 30e: invokevirtual net/minecraft/class_2625.method_11016 ()Lnet/minecraft/class_2338;
// 311: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 314: dconst_0
// 315: ldc2_w 0.5
// 318: dconst_0
// 319: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 31c: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 31f: aload 41
// 321: invokeinterface su/catlean/mixins/accessors/SignEditScreenAccessor.getSign ()Lnet/minecraft/class_2625; 1
// 326: invokevirtual net/minecraft/class_2625.method_11016 ()Lnet/minecraft/class_2338;
// 329: bipush 0
// 32a: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 32d: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 330: pop
// 331: iload 44
// 333: ifeq 34c
// 336: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 339: lload 9
// 33b: bipush 1
// 33c: invokevirtual su/catlean/wu.G (JZ)V
// 33f: goto 34c
// 342: ldc2_w -8650641652106660247
// 345: lload 2
// 346: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34b: athrow
// 34c: new net/minecraft/class_2879
// 34f: dup
// 350: iload 43
// 352: ifeq 365
// 355: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 358: goto 368
// 35b: ldc2_w -8650641652106660247
// 35e: lload 2
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 368: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 36b: checkcast net/minecraft/class_2596
// 36e: lload 30
// 370: dup2_x1
// 371: pop2
// 372: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 375: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 378: lload 13
// 37a: invokevirtual su/catlean/gg.d (J)V
// 37d: iload 40
// 37f: ifne 39c
// 382: bipush 3
// 383: anewarray 330
// 386: ldc2_w -8670924977039307369
// 389: lload 2
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: goto 39c
// 392: ldc2_w -8650641652106660247
// 395: lload 2
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: return
}

private final String l(int var1, String var2, int var3, short var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
long var7 = var5 ^ 106591291595048L;
long var9 = var5 ^ 20980240414006L;
long var11 = var5 ^ 23459857270399L;
String var13 = b<"r">(16667, 5483672212690786046L ^ var5);

try {
String var10000 = new SimpleDateFormat(this.w(var7)).format(new Date());
Intrinsics.checkNotNullExpressionValue(var10000, b<"r">(2254, 5276290891380432680L ^ var5));
var13 = var10000;
} catch (Exception var15) {
o2.S(this, class_124.field_1061 + b<"r">(8733, 6596448401227691502L ^ var5), false, 2, null, var11);
}

String var10001 = b<"r">(25938, 4157856695058002617L ^ var5);
String var10002 = zf.F(var9).method_1548().method_1676();
Intrinsics.checkNotNullExpressionValue(var10002, b<"r">(3407, 5419879613654571700L ^ var5));
return StringsKt.replace$default(
StringsKt.replace$default(var2, var10001, var10002, false, 4, null), b<"r">(25173, 3617027582386795967L ^ var5), var13, false, 4, null
);
}

private final boolean I(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ef.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 73183631377362
// 00b: lxor
// 00c: dup2
// 00d: bipush 8
// 00f: lushr
// 010: lstore 3
// 011: dup2
// 012: bipush 56
// 014: lshl
// 015: bipush 56
// 017: lushr
// 018: l2i
// 019: istore 5
// 01b: pop2
// 01c: dup2
// 01d: ldc2_w 35466876487567
// 020: lxor
// 021: dup2
// 022: bipush 32
// 024: lushr
// 025: l2i
// 026: istore 6
// 028: dup2
// 029: bipush 32
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 7
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 8
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 29011957345307
// 041: lxor
// 042: dup2
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 9
// 049: dup2
// 04a: bipush 32
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 10
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 11
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 94179341584112
// 062: lxor
// 063: lstore 12
// 065: pop2
// 066: ldc2_w -2146838991344797692
// 069: lload 1
// 06a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: istore 14
// 071: aload 0
// 072: iload 6
// 074: iload 7
// 076: iload 8
// 078: i2c
// 079: invokespecial su/catlean/ef.G (IIC)Ljava/lang/String;
// 07c: checkcast java/lang/CharSequence
// 07f: sipush 7597
// 082: ldc2_w 3410922029064634728
// 085: lload 1
// 086: lxor
// 087: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: checkcast java/lang/CharSequence
// 08f: bipush 0
// 090: bipush 2
// 091: aconst_null
// 092: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 095: iload 14
// 097: ifne 175
// 09a: ifne 174
// 09d: goto 0aa
// 0a0: ldc2_w -2149187481347189833
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: aload 0
// 0ab: iload 9
// 0ad: iload 10
// 0af: iload 11
// 0b1: i2s
// 0b2: invokespecial su/catlean/ef.s (IIS)Ljava/lang/String;
// 0b5: checkcast java/lang/CharSequence
// 0b8: sipush 25173
// 0bb: ldc2_w 3617065715863633555
// 0be: lload 1
// 0bf: lxor
// 0c0: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: checkcast java/lang/CharSequence
// 0c8: bipush 0
// 0c9: bipush 2
// 0ca: aconst_null
// 0cb: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0ce: iload 14
// 0d0: ifne 175
// 0d3: goto 0e0
// 0d6: ldc2_w -2149187481347189833
// 0d9: lload 1
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: ifne 174
// 0e3: goto 0f0
// 0e6: ldc2_w -2149187481347189833
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: aload 0
// 0f1: lload 3
// 0f2: iload 5
// 0f4: i2b
// 0f5: invokespecial su/catlean/ef.v (JB)Ljava/lang/String;
// 0f8: checkcast java/lang/CharSequence
// 0fb: sipush 25173
// 0fe: ldc2_w 3617065715863633555
// 101: lload 1
// 102: lxor
// 103: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: checkcast java/lang/CharSequence
// 10b: bipush 0
// 10c: bipush 2
// 10d: aconst_null
// 10e: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 111: iload 14
// 113: ifne 175
// 116: goto 123
// 119: ldc2_w -2149187481347189833
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: ifne 174
// 126: goto 133
// 129: ldc2_w -2149187481347189833
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 0
// 134: lload 12
// 136: invokespecial su/catlean/ef.K (J)Ljava/lang/String;
// 139: checkcast java/lang/CharSequence
// 13c: sipush 25173
// 13f: ldc2_w 3617065715863633555
// 142: lload 1
// 143: lxor
// 144: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/ef.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: checkcast java/lang/CharSequence
// 14c: bipush 0
// 14d: bipush 2
// 14e: aconst_null
// 14f: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 152: iload 14
// 154: ifne 175
// 157: goto 164
// 15a: ldc2_w -2149187481347189833
// 15d: lload 1
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: ifeq 178
// 167: goto 174
// 16a: ldc2_w -2149187481347189833
// 16d: lload 1
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: bipush 1
// 175: goto 179
// 178: bipush 0
// 179: ireturn
}

private static final boolean A() {
long var0 = c ^ 52016354038128L;
long var2 = var0 ^ 5482544624163L;
return V.I(var2);
}

static {
long var20 = c ^ 78263619134787L;
long var22 = var20 ^ 124489171483123L;
long var24 = var20 ^ 90301518277994L;
long var26 = var20 ^ 83463275993775L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[32];
int var16 = 0;
String var15 = "Ýn3\u001b\u0007\u0004\u0088|Ã\u00914L«LM`ãË\u0001\"\u0080õÑ<W\u009d\t6\u0012\u000e&\u0090\u0016}\u0098\fe¬üHUúKÇhmÑë\u001dKU¦,\r-å\u0010g±ï©ó\u001ehj×69\u008f<\u0015ÑÄ\u0018B\u008c` ø\f¡Zê\u008aó1'\u0015×rÞÊa}\u008f.HÈ8]\u009b{br\u0095[\u0098¢\u0098W#(\u001aTãä\u008eÐfq\u0084ï-0Z\u0096Í\u0011\u0086(\u0007\u0005H2\u0089g\t';\u000e|^\u0084\u008d\u0099\u0084\u00ad1kû¼¬¯Cñ \u0010\u0095C&\nîÎünÞ\u008fn³\u0097\nÝ\u0096ßd\u0004\u001c\u0013\u0006\u0091\u0095êÓ\u0010Jß\r\u0083 \u0006¹\u0083\u0013O3xe\u0081ºù\u0016Á\u008bÕ\u0096`4\u0086ª¾\u008e=Ñ\u0089§Ø\u0091L\u0093\u0005¥\u00185øy1v÷3à7{\u0017\u0099ÂF£©@ã<w;â¼s0½Æ²ú»\u0088IäÞü\u0080\u0083\u009c\u0096ú£\u001eMé\u0005\u00147P\u0099\u008aL\u001e\u009d-\u0089<>y«O_`Äk)÷\u0092Ígqdú\u0000 }\u008dU¸\u0004M»(×*pH\\v\u007f%ÿµK\u009f\u0096t\fD±ð\r!`ä&\u0081\u0010'³P\u0010|&ý\u008faÆ¤\u0090t\u0091z\u009d\u00106\u0016Ñ\u0019p\"\u008fmárTaÛ\u008bÈú Dn\u008fC£\u0098uKU{òE]\u009b\u009av+Z[áÔq\u0015Z\u009d¯\u0090\u0011E~ï\u001b %zÞH9\u0087«ùPqØüý'p±ðn\u009e\u0011\u000e©\u009b\u009bTU\u000ec`¿H\b\u0010Çþü/Ð\u009a\u000fÞÖp\u0081\u008eº\u009f/\u00ad\u0010Ì(¾Æ\u0082\u000bGB\u009dMSá¦`õN8k¬\u0089\u0099£Ôm\"j\u009bXM»×A¹aúá¯Àb[øã8ü\u0005\u000e\t\u008e\u008e¬ÊNÞ¿õ7no\u001c2ËWoÁuX\u008ew\n\u0086w\u0095x8Ç\u001e\u0090Ûé¬_\u0096ÎIU\u0081É¥¶sD´s\u0016\u009ejûä>M¬cÈ´.lyù:m\f\u0099õà\u00ad\u0015\u0098ÉNÔ?ÚÅ£{Ø\u001f\u0083´\u0002\u0018\u0018wß ®\u000e¯\u0098ø\u0017\u009b²ãÁ\u008au¨¤y\u009aÓeab\u0010RËì\u000e\u0090\u0001sÓ\u0000rÄ\u0080ä³\u0090\u0080 \u000f\u0097\fö\n§E[\u001aèþm1ÕGÈ´°\u000eÖÙ¨êÍ_÷lüÑ\u009f\u0095Ü\u0010ËÁ _+^\u0089]'\u001e\n\u008a\u0017}å²\u0010RÉöûþ\u0006X\u000b\u008fZØ»\u008ee$\u0007 \r¿JOýi\u0005\u0002\fa¨¾§\u0090^ÑíUÐ ,²ÙK£f9[ûkbD\u0010\u008fÝ\u0089Ó:hF\\Ôh\u0092AWÄôK \u0098ºs\u00adÏþÿ¶;Ï7ß$\u009eàà\u008aáá\u001cK~\u0099s\u0086ôÐf[v¦P\u0010£ZªgÊ\u001c.¡C©\u0006\b\u0088\u001a>æ@¤8\u0011$G´\ræM\u000f\"$3\u008býáà>ìÂ\u001aýD[¸}#z Ú\u0002Toõ\u0084\u0082l\u0013Á\u009f\\ÑC(óÐ\u0019d¯sPÁ¥\u0080<uã\fWN<ûè\u0086\u0010\u009dn\u0019DcyþÊ`\u0080µ\u001bæ\u0087ÈO þ\u0094É\u0090Þ\u0017ÉhëA°\u0083©6¬Ï¬ÛÐÉöWaÑ<Æês\u0015kË¯\u0010\u0088\u0080\u009dé\b\u0083\\Û\u0094°]ßvi\u0011\u00ad";
int var17 = "Ýn3\u001b\u0007\u0004\u0088|Ã\u00914L«LM`ãË\u0001\"\u0080õÑ<W\u009d\t6\u0012\u000e&\u0090\u0016}\u0098\fe¬üHUúKÇhmÑë\u001dKU¦,\r-å\u0010g±ï©ó\u001ehj×69\u008f<\u0015ÑÄ\u0018B\u008c` ø\f¡Zê\u008aó1'\u0015×rÞÊa}\u008f.HÈ8]\u009b{br\u0095[\u0098¢\u0098W#(\u001aTãä\u008eÐfq\u0084ï-0Z\u0096Í\u0011\u0086(\u0007\u0005H2\u0089g\t';\u000e|^\u0084\u008d\u0099\u0084\u00ad1kû¼¬¯Cñ \u0010\u0095C&\nîÎünÞ\u008fn³\u0097\nÝ\u0096ßd\u0004\u001c\u0013\u0006\u0091\u0095êÓ\u0010Jß\r\u0083 \u0006¹\u0083\u0013O3xe\u0081ºù\u0016Á\u008bÕ\u0096`4\u0086ª¾\u008e=Ñ\u0089§Ø\u0091L\u0093\u0005¥\u00185øy1v÷3à7{\u0017\u0099ÂF£©@ã<w;â¼s0½Æ²ú»\u0088IäÞü\u0080\u0083\u009c\u0096ú£\u001eMé\u0005\u00147P\u0099\u008aL\u001e\u009d-\u0089<>y«O_`Äk)÷\u0092Ígqdú\u0000 }\u008dU¸\u0004M»(×*pH\\v\u007f%ÿµK\u009f\u0096t\fD±ð\r!`ä&\u0081\u0010'³P\u0010|&ý\u008faÆ¤\u0090t\u0091z\u009d\u00106\u0016Ñ\u0019p\"\u008fmárTaÛ\u008bÈú Dn\u008fC£\u0098uKU{òE]\u009b\u009av+Z[áÔq\u0015Z\u009d¯\u0090\u0011E~ï\u001b %zÞH9\u0087«ùPqØüý'p±ðn\u009e\u0011\u000e©\u009b\u009bTU\u000ec`¿H\b\u0010Çþü/Ð\u009a\u000fÞÖp\u0081\u008eº\u009f/\u00ad\u0010Ì(¾Æ\u0082\u000bGB\u009dMSá¦`õN8k¬\u0089\u0099£Ôm\"j\u009bXM»×A¹aúá¯Àb[øã8ü\u0005\u000e\t\u008e\u008e¬ÊNÞ¿õ7no\u001c2ËWoÁuX\u008ew\n\u0086w\u0095x8Ç\u001e\u0090Ûé¬_\u0096ÎIU\u0081É¥¶sD´s\u0016\u009ejûä>M¬cÈ´.lyù:m\f\u0099õà\u00ad\u0015\u0098ÉNÔ?ÚÅ£{Ø\u001f\u0083´\u0002\u0018\u0018wß ®\u000e¯\u0098ø\u0017\u009b²ãÁ\u008au¨¤y\u009aÓeab\u0010RËì\u000e\u0090\u0001sÓ\u0000rÄ\u0080ä³\u0090\u0080 \u000f\u0097\fö\n§E[\u001aèþm1ÕGÈ´°\u000eÖÙ¨êÍ_÷lüÑ\u009f\u0095Ü\u0010ËÁ _+^\u0089]'\u001e\n\u008a\u0017}å²\u0010RÉöûþ\u0006X\u000b\u008fZØ»\u008ee$\u0007 \r¿JOýi\u0005\u0002\fa¨¾§\u0090^ÑíUÐ ,²ÙK£f9[ûkbD\u0010\u008fÝ\u0089Ó:hF\\Ôh\u0092AWÄôK \u0098ºs\u00adÏþÿ¶;Ï7ß$\u009eàà\u008aáá\u001cK~\u0099s\u0086ôÐf[v¦P\u0010£ZªgÊ\u001c.¡C©\u0006\b\u0088\u001a>æ@¤8\u0011$G´\ræM\u000f\"$3\u008býáà>ìÂ\u001aýD[¸}#z Ú\u0002Toõ\u0084\u0082l\u0013Á\u009f\\ÑC(óÐ\u0019d¯sPÁ¥\u0080<uã\fWN<ûè\u0086\u0010\u009dn\u0019DcyþÊ`\u0080µ\u001bæ\u0087ÈO þ\u0094É\u0090Þ\u0017ÉhëA°\u0083©6¬Ï¬ÛÐÉöWaÑ<Æês\u0015kË¯\u0010\u0088\u0080\u009dé\b\u0083\\Û\u0094°]ßvi\u0011\u00ad"
.length();
char var14 = '8';
int var30 = -1;

label47:
while (true) {
String var31 = var15.substring(++var30, var30 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var40;
if ((var30 += var14) >= var17) {
d = var18;
f = new String[32];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[3];
int var4 = 0;
String var5 = "\\«;{±Øô7\u0017\u0016\u0084e3Ê2\u0012$\u0088Ê®M\u0097\nô";
int var6 = "\\«;{±Øô7\u0017\u0016\u0084e3Ê2\u0012$\u0088Ê®M\u0097\nô".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var45 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var28 = new KProperty[(int)var0[0]];
var28[0] = Reflection.property1(
new PropertyReference1Impl(ef.class, b<"r">(28907, 994474853289583828L ^ var20), b<"r">(31518, 3718689092785762101L ^ var20), 0)
);
var28[1] = Reflection.property1(
new PropertyReference1Impl(ef.class, b<"r">(24181, 1983183080546290252L ^ var20), b<"r">(6220, 5832502913483705448L ^ var20), 0)
);
var28[2] = Reflection.property1(
new PropertyReference1Impl(ef.class, b<"r">(23229, 1501459303904431744L ^ var20), b<"r">(10644, 3656503951633071539L ^ var20), 0)
);
var28[3] = Reflection.property1(
new PropertyReference1Impl(ef.class, b<"r">(31627, 7084019212843872184L ^ var20), b<"r">(8831, 1375631587665360476L ^ var20), 0)
);
var28[4] = Reflection.property1(
new PropertyReference1Impl(ef.class, b<"r">(1875, 6967607851604120444L ^ var20), b<"r">(31524, 6172319407038951194L ^ var20), 0)
);
var28[5] = Reflection.property1(new PropertyReference1Impl(ef.class, b<"r">(13072, 8767279911148693306L ^ var20), b<"r">(706, 3897094153926088418L ^ var20), 0));
E = var28;
V = new ef(var22);
g = yp.x(V, b<"r">(7543, 8898815429475895634L ^ var20), b<"r">(8259, 42833890935911537L ^ var20), null, null, (int)var0[1], var26, null);
e = yp.x(V, b<"r">(22382, 7600654787663315800L ^ var20), b<"r">(6931, 3944145639602884388L ^ var20), null, null, (int)var0[2], var26, null);
x = yp.x(V, b<"r">(22648, 5903339102448766033L ^ var20), b<"r">(22142, 6949758768827908696L ^ var20), null, null, (int)var0[2], var26, null);
T = yp.x(V, b<"r">(1856, 2409292710538875761L ^ var20), b<"r">(25173, 3616994612773549688L ^ var20), null, null, (int)var0[2], var26, null);
b = yp.x(V, b<"r">(22313, 5017828611767943937L ^ var20), b<"r">(7770, 1175237006074317410L ^ var20), null, ef::A, 4, var26, null);
a = yp.t(V, b<"r">(19828, 847166882909411652L ^ var20), false, var24, null, null, (int)var0[2], null);
return;
}

var14 = var15.charAt(var30);
break;
default:
var18[var16++] = var40;
if ((var30 += var14) < var17) {
var14 = var15.charAt(var30);
continue label47;
}

var15 = "U(îç\u0004)U\u0007\u0087wp:Ä\u0081\u000fÓ}æ£\u001dö@j:ëé\u0094u³g\u007f\u0084-hÇ×²RùÜÝ~X\u00adNP7&Ñòw\u0083\u0012\u0093\u008aÊ\u0012\u0016¡«Ø\u0016yCßÆnkHNrÇ=\n³ 4x\u007fËmB_\u008f\u0085Ý\u0002¡Òs5yé Í×Q\u0085ºÿæ¥5Æ\u009càW\u001a\u009dJ\u001d¼§¨dÇ\u0003\u0099)\u008bWdÿÖ\u009a´\u001aÐ/ÄÉá<BÛc\u0018\u00032PdQÚ\u0019ÄuØ¬]\u008fEð]\r\u0099\u0081í\u0084\u008e\u0087å";
var17 = "U(îç\u0004)U\u0007\u0087wp:Ä\u0081\u000fÓ}æ£\u001dö@j:ëé\u0094u³g\u007f\u0084-hÇ×²RùÜÝ~X\u00adNP7&Ñòw\u0083\u0012\u0093\u008aÊ\u0012\u0016¡«Ø\u0016yCßÆnkHNrÇ=\n³ 4x\u007fËmB_\u008f\u0085Ý\u0002¡Òs5yé Í×Q\u0085ºÿæ¥5Æ\u009càW\u001a\u009dJ\u001d¼§¨dÇ\u0003\u0099)\u008bWdÿÖ\u009a´\u001aÐ/ÄÉá<BÛc\u0018\u00032PdQÚ\u0019ÄuØ¬]\u008fEð]\r\u0099\u0081í\u0084\u008e\u0087å"
.length();
var14 = 136;
var30 = -1;
}

var31 = var15.substring(++var30, var30 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16284;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ef", var10);
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
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/ef" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
