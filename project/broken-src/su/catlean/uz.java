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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.gofra.Flow;

public final class uz extends _g {
@NotNull
public static final uz E;
static final KProperty[] O;
@NotNull
private static final cw t;
@NotNull
private static final cq A;
private static final long a = yz.a(7968827108016304419L, 3547659086180938873L, MethodHandles.lookup().lookupClass()).a(242243382955606L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private uz(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 2033134458576L;
super(b<"t">(7529, 5597332446653575383L ^ var1), jt.A(), null, 4, null, var3);
}

private final f9 z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 110621018384427L;
return (f9)t.E(this, var3, O[0]);
}

private final void G(long var1, f9 var3) {
var1 = a ^ var1;
long var4 = var1 ^ 27798356424983L;
t.b(this, var4, O[0], var3);
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 16418799650060L;
return (Boolean)A.E(this, var3, O[1]);
}

private final void B(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 42219648755808L;
A.b(this, var4, O[1], var3);
}

@Flow
private final void T(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uz.a J
// 003: ldc2_w 15830986710372
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 46448866654539
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 129937658521351
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 112049447551352
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 16
// 043: lushr
// 044: lstore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 19857727226106
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 100214216190993
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 40060931309757
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 137975092057984
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 58715772587989
// 067: lxor
// 068: lstore 20
// 06a: dup2
// 06b: ldc2_w 66894572563218
// 06e: lxor
// 06f: lstore 22
// 071: pop2
// 072: ldc2_w -451574406496489673
// 075: lload 2
// 076: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: istore 24
// 07d: aload 1
// 07e: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 081: iload 24
// 083: ifne 0aa
// 086: instanceof net/minecraft/class_2846
// 089: ifeq 40a
// 08c: goto 099
// 08f: ldc2_w -495724934195894938
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 1
// 09a: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 09d: goto 0aa
// 0a0: ldc2_w -495724934195894938
// 0a3: lload 2
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: checkcast net/minecraft/class_2846
// 0ad: invokevirtual net/minecraft/class_2846.method_12363 ()Lnet/minecraft/class_2846$class_2847;
// 0b0: getstatic net/minecraft/class_2846$class_2847.field_12974 Lnet/minecraft/class_2846$class_2847;
// 0b3: if_acmpne 40a
// 0b6: lload 22
// 0b8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bb: invokevirtual net/minecraft/class_746.method_6048 ()I
// 0be: iload 24
// 0c0: ifne 0ff
// 0c3: goto 0d0
// 0c6: ldc2_w -495724934195894938
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: bipush 2
// 0d1: if_icmple 40a
// 0d4: goto 0e1
// 0d7: ldc2_w -495724934195894938
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: lload 22
// 0e3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e6: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0e9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0ec: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 0ef: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f2: goto 0ff
// 0f5: ldc2_w -495724934195894938
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: iload 24
// 101: ifne 155
// 104: ifeq 40a
// 107: goto 114
// 10a: ldc2_w -495724934195894938
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: lload 22
// 116: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 119: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 11c: dup
// 11d: sipush 24276
// 120: ldc2_w 5828346594754055437
// 123: lload 2
// 124: lxor
// 125: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12d: getstatic net/minecraft/class_1893.field_9126 Lnet/minecraft/class_5321;
// 130: dup
// 131: sipush 13324
// 134: ldc2_w 7471732447902312385
// 137: lload 2
// 138: lxor
// 139: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 141: lload 16
// 143: dup2_x2
// 144: pop2
// 145: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// 148: goto 155
// 14b: ldc2_w -495724934195894938
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: ifeq 40a
// 158: aload 0
// 159: lload 18
// 15b: invokespecial su/catlean/uz.G (J)Lnet/minecraft/class_2338;
// 15e: astore 25
// 160: aload 25
// 162: ifnull 40a
// 165: lload 22
// 167: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16a: invokevirtual net/minecraft/class_746.method_55754 ()D
// 16d: d2f
// 16e: fstore 26
// 170: lload 22
// 172: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 175: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 178: aload 25
// 17a: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 17d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 180: dstore 27
// 182: ldc2_w 2.299999952316284
// 185: dload 27
// 187: dcmpg
// 188: iload 24
// 18a: ifne 1b0
// 18d: ifgt 1d7
// 190: goto 19d
// 193: ldc2_w -495724934195894938
// 196: lload 2
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: dload 27
// 19f: fload 26
// 1a1: f2d
// 1a2: dcmpg
// 1a3: goto 1b0
// 1a6: ldc2_w -495724934195894938
// 1a9: lload 2
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: iload 24
// 1b2: ifne 1d4
// 1b5: ifgt 1d3
// 1b8: goto 1c5
// 1bb: ldc2_w -495724934195894938
// 1be: lload 2
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: bipush 1
// 1c6: goto 1d8
// 1c9: ldc2_w -495724934195894938
// 1cc: lload 2
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: bipush 0
// 1d4: goto 1d8
// 1d7: bipush 0
// 1d8: ifeq 40a
// 1db: aload 0
// 1dc: lload 4
// 1de: invokespecial su/catlean/uz.z (J)Lsu/catlean/f9;
// 1e1: getstatic su/catlean/f9.SILENT Lsu/catlean/f9;
// 1e4: iload 24
// 1e6: ifne 21c
// 1e9: goto 1f6
// 1ec: ldc2_w -495724934195894938
// 1ef: lload 2
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: if_acmpeq 21f
// 1f9: goto 206
// 1fc: ldc2_w -495724934195894938
// 1ff: lload 2
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: aload 0
// 207: lload 4
// 209: invokespecial su/catlean/uz.z (J)Lsu/catlean/f9;
// 20c: getstatic su/catlean/f9.NORMAL Lsu/catlean/f9;
// 20f: goto 21c
// 212: ldc2_w -495724934195894938
// 215: lload 2
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: if_acmpne 22d
// 21f: bipush 1
// 220: goto 22e
// 223: ldc2_w -495724934195894938
// 226: lload 2
// 227: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: athrow
// 22d: bipush 0
// 22e: istore 26
// 230: iload 26
// 232: ifeq 2ad
// 235: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 238: bipush 4
// 239: anewarray 729
// 23c: astore 28
// 23e: aload 28
// 240: bipush 0
// 241: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
// 244: dup
// 245: sipush 18946
// 248: ldc2_w 3720008106188921281
// 24b: lload 2
// 24c: lxor
// 24d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 255: aastore
// 256: aload 28
// 258: bipush 1
// 259: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
// 25c: dup
// 25d: sipush 13067
// 260: ldc2_w 8394456457747177683
// 263: lload 2
// 264: lxor
// 265: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26d: aastore
// 26e: aload 28
// 270: bipush 2
// 271: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
// 274: dup
// 275: sipush 4582
// 278: ldc2_w 3369599495064093245
// 27b: lload 2
// 27c: lxor
// 27d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 285: aastore
// 286: aload 28
// 288: bipush 3
// 289: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
// 28c: dup
// 28d: sipush 2738
// 290: ldc2_w 467922009236445548
// 293: lload 2
// 294: lxor
// 295: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 29d: aastore
// 29e: iload 6
// 2a0: aload 28
// 2a2: iload 7
// 2a4: iload 8
// 2a6: i2c
// 2a7: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 2aa: goto 320
// 2ad: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2b0: bipush 4
// 2b1: anewarray 729
// 2b4: astore 28
// 2b6: aload 28
// 2b8: bipush 0
// 2b9: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
// 2bc: dup
// 2bd: sipush 14405
// 2c0: ldc2_w 1195850821226474375
// 2c3: lload 2
// 2c4: lxor
// 2c5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2cd: aastore
// 2ce: aload 28
// 2d0: bipush 1
// 2d1: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
// 2d4: dup
// 2d5: sipush 5900
// 2d8: ldc2_w 9016941842394744008
// 2db: lload 2
// 2dc: lxor
// 2dd: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e5: aastore
// 2e6: aload 28
// 2e8: bipush 2
// 2e9: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
// 2ec: dup
// 2ed: sipush 9309
// 2f0: ldc2_w 2160381899638519700
// 2f3: lload 2
// 2f4: lxor
// 2f5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2fd: aastore
// 2fe: aload 28
// 300: bipush 3
// 301: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
// 304: dup
// 305: sipush 21907
// 308: ldc2_w 2315204261977507411
// 30b: lload 2
// 30c: lxor
// 30d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 315: aastore
// 316: aload 28
// 318: iload 9
// 31a: i2c
// 31b: lload 10
// 31d: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 320: astore 27
// 322: iload 26
// 324: ifeq 357
// 327: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 32a: bipush 1
// 32b: anewarray 729
// 32e: astore 29
// 330: aload 29
// 332: bipush 0
// 333: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
// 336: dup
// 337: sipush 3487
// 33a: ldc2_w 4395375421399834200
// 33d: lload 2
// 33e: lxor
// 33f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 347: aastore
// 348: iload 6
// 34a: aload 29
// 34c: iload 7
// 34e: iload 8
// 350: i2c
// 351: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 354: goto 382
// 357: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 35a: bipush 1
// 35b: anewarray 729
// 35e: astore 29
// 360: aload 29
// 362: bipush 0
// 363: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
// 366: dup
// 367: sipush 26116
// 36a: ldc2_w 8460786361374537167
// 36d: lload 2
// 36e: lxor
// 36f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 377: aastore
// 378: aload 29
// 37a: iload 9
// 37c: i2c
// 37d: lload 10
// 37f: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 382: astore 28
// 384: aload 27
// 386: invokevirtual su/catlean/fg.R ()Z
// 389: iload 24
// 38b: ifne 3b0
// 38e: ifeq 40a
// 391: goto 39e
// 394: ldc2_w -495724934195894938
// 397: lload 2
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: aload 28
// 3a0: invokevirtual su/catlean/fg.R ()Z
// 3a3: goto 3b0
// 3a6: ldc2_w -495724934195894938
// 3a9: lload 2
// 3aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3af: athrow
// 3b0: ifeq 40a
// 3b3: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3b6: new su/catlean/t5
// 3b9: dup
// 3ba: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 3bd: aload 25
// 3bf: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 3c2: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 3c5: dup
// 3c6: sipush 2695
// 3c9: ldc2_w 5610738572538354007
// 3cc: lload 2
// 3cd: lxor
// 3ce: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d6: lload 14
// 3d8: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 3db: lload 20
// 3dd: sipush 24303
// 3e0: ldc2_w 4517614872941176659
// 3e3: lload 2
// 3e4: lxor
// 3e5: invokedynamic d (IJ)I bsm=su/catlean/uz.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: aload 27
// 3ec: aload 25
// 3ee: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_2338;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/uz.l (Lsu/catlean/fg;Lnet/minecraft/class_2338;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 3f3: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 3f6: lload 12
// 3f8: dup2_x1
// 3f9: pop2
// 3fa: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 3fd: goto 40a
// 400: ldc2_w -495724934195894938
// 403: lload 2
// 404: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 409: athrow
// 40a: return
}

private final class_2338 G(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 56013883844341
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 84087553173292
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 28182935907625
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 86230705478027
// 01f: lxor
// 020: lstore 9
// 022: pop2
// 023: lload 9
// 025: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 028: invokevirtual net/minecraft/class_746.method_23317 ()D
// 02b: dstore 12
// 02d: lload 9
// 02f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 032: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 035: getfield net/minecraft/class_243.field_1351 D
// 038: ldc2_w 0.1000000014901161
// 03b: dsub
// 03c: dstore 14
// 03e: ldc2_w 5442865406997525064
// 041: lload 1
// 042: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: lload 9
// 049: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04c: invokevirtual net/minecraft/class_746.method_23321 ()D
// 04f: dstore 16
// 051: lload 9
// 053: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 056: invokevirtual net/minecraft/class_746.method_36454 ()F
// 059: f2d
// 05a: invokestatic java/lang/Math.toRadians (D)D
// 05d: dstore 18
// 05f: lload 9
// 061: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 064: invokevirtual net/minecraft/class_746.method_36455 ()F
// 067: f2d
// 068: invokestatic java/lang/Math.toRadians (D)D
// 06b: dstore 20
// 06d: dload 18
// 06f: invokestatic java/lang/Math.sin (D)D
// 072: dneg
// 073: dload 20
// 075: invokestatic java/lang/Math.cos (D)D
// 078: dmul
// 079: dstore 22
// 07b: istore 11
// 07d: dload 20
// 07f: invokestatic java/lang/Math.sin (D)D
// 082: dneg
// 083: dstore 24
// 085: dload 18
// 087: invokestatic java/lang/Math.cos (D)D
// 08a: dload 20
// 08c: invokestatic java/lang/Math.cos (D)D
// 08f: dmul
// 090: dstore 26
// 092: lload 9
// 094: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 097: invokevirtual net/minecraft/class_746.method_6048 ()I
// 09a: i2f
// 09b: ldc 20.0
// 09d: fdiv
// 09e: fstore 28
// 0a0: fload 28
// 0a2: fload 28
// 0a4: fmul
// 0a5: fload 28
// 0a7: fconst_2
// 0a8: fmul
// 0a9: fadd
// 0aa: ldc 3.0
// 0ac: fdiv
// 0ad: fstore 28
// 0af: fload 28
// 0b1: iload 11
// 0b3: ifeq 0f7
// 0b6: fconst_1
// 0b7: fcmpl
// 0b8: ifgt 0f6
// 0bb: goto 0c8
// 0be: ldc2_w 5442501701567158271
// 0c1: lload 1
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: fload 28
// 0ca: fconst_0
// 0cb: fcmpg
// 0cc: iload 11
// 0ce: ifeq 0ef
// 0d1: goto 0de
// 0d4: ldc2_w 5442501701567158271
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: ifne 0f2
// 0e1: goto 0ee
// 0e4: ldc2_w 5442501701567158271
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: bipush 1
// 0ef: goto 0f3
// 0f2: bipush 0
// 0f3: ifeq 0f9
// 0f6: fconst_1
// 0f7: fstore 28
// 0f9: dload 22
// 0fb: dload 22
// 0fd: dmul
// 0fe: dload 24
// 100: dload 24
// 102: dmul
// 103: dadd
// 104: dload 26
// 106: dload 26
// 108: dmul
// 109: dadd
// 10a: invokestatic java/lang/Math.sqrt (D)D
// 10d: dstore 29
// 10f: dload 22
// 111: dload 29
// 113: ddiv
// 114: dstore 22
// 116: dload 24
// 118: dload 29
// 11a: ddiv
// 11b: dstore 24
// 11d: dload 26
// 11f: dload 29
// 121: ddiv
// 122: dstore 26
// 124: fload 28
// 126: bipush 3
// 127: i2f
// 128: fmul
// 129: fstore 31
// 12b: dload 22
// 12d: fload 31
// 12f: f2d
// 130: dmul
// 131: dstore 22
// 133: dload 24
// 135: fload 31
// 137: f2d
// 138: dmul
// 139: dstore 24
// 13b: lload 1
// 13c: lconst_0
// 13d: lcmp
// 13e: ifle 14e
// 141: dload 26
// 143: fload 31
// 145: f2d
// 146: dmul
// 147: iload 11
// 149: ifeq 174
// 14c: dstore 26
// 14e: lload 9
// 150: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 153: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 156: ifne 176
// 159: dload 24
// 15b: lload 9
// 15d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 160: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 163: invokevirtual net/minecraft/class_243.method_10214 ()D
// 166: dadd
// 167: goto 174
// 16a: ldc2_w 5442501701567158271
// 16d: lload 1
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: dstore 24
// 176: aconst_null
// 177: astore 32
// 179: bipush 0
// 17a: istore 33
// 17c: iload 33
// 17e: sipush 23016
// 181: ldc2_w 3748009418973483726
// 184: lload 1
// 185: lxor
// 186: invokedynamic d (IJ)I bsm=su/catlean/uz.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: if_icmpge 3ec
// 18e: new net/minecraft/class_243
// 191: dup
// 192: dload 12
// 194: dload 14
// 196: dload 16
// 198: invokespecial net/minecraft/class_243.<init> (DDD)V
// 19b: astore 32
// 19d: dload 12
// 19f: dload 22
// 1a1: dadd
// 1a2: dstore 12
// 1a4: dload 14
// 1a6: dload 24
// 1a8: dadd
// 1a9: dstore 14
// 1ab: dload 16
// 1ad: dload 26
// 1af: dadd
// 1b0: dstore 16
// 1b2: dload 22
// 1b4: ldc2_w 0.99
// 1b7: dmul
// 1b8: dstore 22
// 1ba: dload 24
// 1bc: ldc2_w 0.99
// 1bf: dmul
// 1c0: dstore 24
// 1c2: dload 26
// 1c4: ldc2_w 0.99
// 1c7: dmul
// 1c8: dstore 26
// 1ca: dload 24
// 1cc: ldc2_w 0.05000000074505806
// 1cf: dsub
// 1d0: dstore 24
// 1d2: new net/minecraft/class_243
// 1d5: dup
// 1d6: dload 12
// 1d8: dload 14
// 1da: dload 16
// 1dc: invokespecial net/minecraft/class_243.<init> (DDD)V
// 1df: astore 34
// 1e1: lload 5
// 1e3: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1e6: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 1e9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1ee: astore 35
// 1f0: aload 35
// 1f2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1f7: ifeq 2c9
// 1fa: aload 35
// 1fc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 201: dup
// 202: sipush 11333
// 205: ldc2_w 2938654211111030041
// 208: lload 1
// 209: lxor
// 20a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 212: checkcast net/minecraft/class_1297
// 215: astore 36
// 217: aload 36
// 219: instanceof net/minecraft/class_1667
// 21c: iload 11
// 21e: ifeq 17e
// 221: iload 11
// 223: lload 1
// 224: lconst_0
// 225: lcmp
// 226: iflt 18b
// 229: lload 1
// 22a: lconst_0
// 22b: lcmp
// 22c: ifle 25b
// 22f: ifeq 259
// 232: ifne 274
// 235: goto 242
// 238: ldc2_w 5442501701567158271
// 23b: lload 1
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: aload 36
// 244: lload 9
// 246: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 249: invokevirtual net/minecraft/class_1297.equals (Ljava/lang/Object;)Z
// 24c: goto 259
// 24f: ldc2_w 5442501701567158271
// 252: lload 1
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: iload 11
// 25b: lload 1
// 25c: lconst_0
// 25d: lcmp
// 25e: iflt 2bb
// 261: ifeq 2b9
// 264: ifeq 286
// 267: goto 274
// 26a: ldc2_w 5442501701567158271
// 26d: lload 1
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: iload 11
// 276: ifne 1f0
// 279: goto 286
// 27c: ldc2_w 5442501701567158271
// 27f: lload 1
// 280: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: athrow
// 286: aload 36
// 288: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 28b: new net/minecraft/class_238
// 28e: dup
// 28f: dload 12
// 291: ldc2_w 0.3
// 294: dsub
// 295: dload 14
// 297: ldc2_w 0.3
// 29a: dsub
// 29b: dload 16
// 29d: ldc2_w 0.3
// 2a0: dsub
// 2a1: dload 12
// 2a3: ldc2_w 0.3
// 2a6: dadd
// 2a7: dload 14
// 2a9: ldc2_w 0.3
// 2ac: dadd
// 2ad: dload 16
// 2af: ldc2_w 0.3
// 2b2: dadd
// 2b3: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 2b6: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 2b9: iload 11
// 2bb: ifeq 1f7
// 2be: ifeq 1f0
// 2c1: aconst_null
// 2c2: lload 1
// 2c3: lconst_0
// 2c4: lcmp
// 2c5: ifle 3ed
// 2c8: areturn
// 2c9: lload 5
// 2cb: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2ce: new net/minecraft/class_3959
// 2d1: dup
// 2d2: aload 32
// 2d4: aload 34
// 2d6: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 2d9: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 2dc: lload 9
// 2de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e1: checkcast net/minecraft/class_1297
// 2e4: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 2e7: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 2ea: dup
// 2eb: sipush 28162
// 2ee: ldc2_w 6911549475552743233
// 2f1: lload 1
// 2f2: lxor
// 2f3: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2fb: astore 35
// 2fd: lload 1
// 2fe: lconst_0
// 2ff: lcmp
// 300: ifle 3c2
// 303: aload 35
// 305: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 308: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 30b: if_acmpne 3c2
// 30e: aload 0
// 30f: lload 3
// 310: invokespecial su/catlean/uz.t (J)Z
// 313: lload 1
// 314: lconst_0
// 315: lcmp
// 316: ifle 391
// 319: iload 11
// 31b: ifeq 391
// 31e: goto 32b
// 321: ldc2_w 5442501701567158271
// 324: lload 1
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: ifeq 3b2
// 32e: goto 33b
// 331: ldc2_w 5442501701567158271
// 334: lload 1
// 335: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33a: athrow
// 33b: getstatic su/catlean/la.l Lsu/catlean/la;
// 33e: aload 35
// 340: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 343: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 346: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 349: dup
// 34a: sipush 18754
// 34d: ldc2_w 5207102141137184789
// 350: lload 1
// 351: lxor
// 352: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 35a: aconst_null
// 35b: bipush 0
// 35c: bipush 0
// 35d: aconst_null
// 35e: bipush 0
// 35f: sipush 27112
// 362: ldc2_w 3711999749813019339
// 365: lload 1
// 366: lxor
// 367: invokedynamic d (IJ)I bsm=su/catlean/uz.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: aconst_null
// 36d: lload 7
// 36f: invokestatic su/catlean/la.K (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;IZLjava/util/List;ZILjava/lang/Object;J)F
// 372: lload 9
// 374: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 377: invokevirtual net/minecraft/class_746.method_6032 ()F
// 37a: lload 9
// 37c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 37f: invokevirtual net/minecraft/class_746.method_6067 ()F
// 382: fadd
// 383: fcmpl
// 384: goto 391
// 387: ldc2_w 5442501701567158271
// 38a: lload 1
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: lload 1
// 392: lconst_0
// 393: lcmp
// 394: iflt 39c
// 397: ifle 3b2
// 39a: iload 11
// 39c: lload 1
// 39d: lconst_0
// 39e: lcmp
// 39f: iflt 3d6
// 3a2: ifne 3d1
// 3a5: goto 3b2
// 3a8: ldc2_w 5442501701567158271
// 3ab: lload 1
// 3ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b1: athrow
// 3b2: aload 35
// 3b4: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 3b7: areturn
// 3b8: ldc2_w 5442501701567158271
// 3bb: lload 1
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: dload 14
// 3c4: ldc2_w -65.0
// 3c7: dcmpg
// 3c8: lload 1
// 3c9: lconst_0
// 3ca: lcmp
// 3cb: ifle 3d6
// 3ce: ifle 3ec
// 3d1: iinc 33 1
// 3d4: iload 11
// 3d6: ifne 17c
// 3d9: lload 1
// 3da: lconst_0
// 3db: lcmp
// 3dc: iflt 3ec
// 3df: goto 3ec
// 3e2: ldc2_w 5442501701567158271
// 3e5: lload 1
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: aconst_null
// 3ed: areturn
}

public final boolean e(long param1, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 16
// 03: lshl
// 04: iload 3
// 05: i2l
// 06: bipush 48
// 08: lshl
// 09: bipush 48
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/uz.a J
// 10: lxor
// 11: lstore 4
// 13: lload 4
// 15: dup2
// 16: ldc2_w 86751422821046
// 19: lxor
// 1a: lstore 6
// 1c: dup2
// 1d: ldc2_w 58750910401607
// 20: lxor
// 21: lstore 8
// 23: dup2
// 24: ldc2_w 94962013509913
// 27: lxor
// 28: lstore 10
// 2a: pop2
// 2b: ldc2_w -3769295247935840964
// 2e: lload 4
// 30: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: istore 12
// 37: aload 0
// 38: lload 8
// 3a: invokevirtual su/catlean/uz.f (J)Z
// 3d: iload 12
// 3f: ifne 72
// 42: ifeq ec
// 45: goto 53
// 48: ldc2_w -3812932303976786067
// 4b: lload 4
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: lload 10
// 55: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 58: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 5b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 5e: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 61: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 64: goto 72
// 67: ldc2_w -3812932303976786067
// 6a: lload 4
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: iload 12
// 74: lload 1
// 75: lconst_0
// 76: lcmp
// 77: iflt d4
// 7a: ifne d2
// 7d: ifeq ec
// 80: goto 8e
// 83: ldc2_w -3812932303976786067
// 86: lload 4
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: lload 10
// 90: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 93: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 96: dup
// 97: sipush 19066
// 9a: ldc2_w 4724131593959861175
// 9d: lload 4
// 9f: lxor
// a0: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a8: getstatic net/minecraft/class_1893.field_9126 Lnet/minecraft/class_5321;
// ab: dup
// ac: sipush 30508
// af: ldc2_w 7572986430057567994
// b2: lload 4
// b4: lxor
// b5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// bd: lload 6
// bf: dup2_x2
// c0: pop2
// c1: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// c4: goto d2
// c7: ldc2_w -3812932303976786067
// ca: lload 4
// cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1: athrow
// d2: iload 12
// d4: ifne e9
// d7: ifeq ec
// da: goto e8
// dd: ldc2_w -3812932303976786067
// e0: lload 4
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: goto ed
// ec: bipush 0
// ed: ireturn
}

private static final Unit w(class_2338 var0) {
long var1 = a ^ 50556558965070L;
int var3 = (int)((var1 ^ 3112367685175L) >>> 32);
long var4 = (var1 ^ 3112367685175L) << 32 >>> 32;
long var6 = var1 ^ 34402534297400L;
zf.Z(var3, var4)
.method_2896(
zf.v(var6),
class_1268.field_5808,
new class_3965(new class_243(var0.method_10263() + 0.5, var0.method_10084().method_10264(), var0.method_10260() + 0.0), class_2350.field_11036, var0, false)
);
return Unit.INSTANCE;
}

private static final Unit c(class_2338 var0) {
long var1 = a ^ 70588255305063L;
int var3 = (int)((var1 ^ 122168764332574L) >>> 32);
long var4 = (var1 ^ 122168764332574L) << 32 >>> 32;
long var6 = var1 ^ 125902411991825L;
zf.Z(var3, var4)
.method_2896(
zf.v(var6),
class_1268.field_5808,
new class_3965(
new class_243(var0.method_10263() + 0.5, var0.method_10084().method_10264() + 0.125, var0.method_10260() + 0.5),
class_2350.field_11036,
var0.method_10084(),
false
)
);
return Unit.INSTANCE;
}

private static final Unit l(fg var0, class_2338 var1) {
long var2 = a ^ 77019567453592L;
long var4 = var2 ^ 100418912820480L;
long var6 = var2 ^ 108129217008055L;
long var8 = var2 ^ 2547411921928L;
gg.P.T(var8, var0.a(), E.z(var6), uz::w);
gg var10000 = gg.P;
class_1792 var10001 = class_1802.field_8069;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8069, b<"t">(26116, 8460724620403760435L ^ var2));
var10000.S(var10001, E.z(var6), var4, uz::c);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 134073708646175L;
long var22 = var20 ^ 84460013645012L;
long var24 = var20 ^ 15038284912224L;
long var26 = var20 ^ 97978450086166L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[25];
int var16 = 0;
String var15 = "(©\u0000\u0099ª\u0095\u0006ë\u0088\\§}ûÿ\u000b\u000b´\u00142;³õH9Âbo\u0081OU+\u0011õ:ÐB\u001e\u0084û\u0098=Ê~\f~ã Ý\u0013ÿ\u0088ÚëÔ0g \u0097m\u0096\u0016n(]Ð\u0018l×\u001f\u0082ÂUX«kgÜ\u0010!Ø\u0080*\u00adl\né\u009d\\\u0013 èÈlm\u0083ÕH\u0011Ç\u0081\u0012\u0086\u0092ð}Þ;QT\u007f00\\ü¤ó$\u0015ûÕ³V á`Z\u0018\tX¯çr\u009dï\u0095ÚÂF\u0007\n±õµÔÿÓ\u0000¶\u000f\u0087ªKnè\u0007\u0018ÿ³\u0000\b\u0086¤²ñE;\u007f\u0013\u007f\u000e¢<ù.þ3\u0097Ã\u0006%\u00109\\kXqã4²\u008b\u0016öøJ+Í³\u0018\u0084<ù\r²\u0002\u0081\u008e\u001bWOÔD¤j 5\u000b¡Veâ¶w(}N$\u008a¹¶Þqj\u000f{\u0095\u0087DC.5jc²²^^ æG\u0084$Q·ÇÎ.rºÒ\u000e\u0002o  ^ôÍ*¯\u0016B\u0007\u0091 \u0085\u008cB3ÅciC\u0016eW9n,à<\u001d\u0018H\u0019À®(\u008b{¾³î\u0097\u0096\u0010p\u001c¯\u0098Z\u009b\u0093¤\u0095t¡¶7S÷\f\u0002N|Z\u0081CiíÂS|f\u000f¼^g\u0010\u001c¤]lâî\u00ad-\u0092\u0018\u0016Â\u0081\u009e\n\u009e\u0010 9Qî;\u0003\u0002¼|w¢?\u0016EÎB\u0018c\u001bÚu(L\u009eü (qE\u0089\u0002\núF¯¾\u0004\u009a+ë\u0018\u0018Ym\u0097¿ù\u0003Ùq°u\f\u001bÛ>|Ws\u008fwXÕõ\u00908(ÁÙ\u0007\u0099GðLo³Ä\u0018L\u0002&¬s\u0091e\u009f³6D¾ÁööÎ!Â\\\u0093\u009bIK:«S,cÒ {,MRüÁàÞq©²\u0003ÙÑª]=8\u007fUM\u0087E·g\u0003\u0012õQç\u0005  \u009cÌ¸\u0016ÿó\u0013eß\"I\u009c¶\u009dÙPÃ\u0002¾Î!æ¶¥ý\u0010ù´\fbþl(¯x!\u0088Þ\u0015g\u0083|¹É\u008fÆF\u00810Î±EÖ[@¦\u001aFö\b\u0013P\u0085\u009bïöà\u0016Æ\u0094\u0013KT ã1ø©4$è\u0096\bìâÊS´^XD\u0082÷\u009a\u0097#Sh$\u0081½Zü\u009cÁs ù|#ÔÙ\u008c%\u0080Ä«µó ø\nX\u0086ê\u0080±P!f\u0002Ñ_· F»¬\u0013\u0018Ù% ´çÐ§±\u0000~#¸KGé\u0003\u0085Ãõ\u0015|ß)é\u0010+)ø\u000e\u0081gâi{\u009cØ´³ùuå\u0018\u0085\r®\u009dìµÎ\u0086$ÞápOÞ\u0007R+\u00ad8H\u0091qÙ~";
int var17 = "(©\u0000\u0099ª\u0095\u0006ë\u0088\\§}ûÿ\u000b\u000b´\u00142;³õH9Âbo\u0081OU+\u0011õ:ÐB\u001e\u0084û\u0098=Ê~\f~ã Ý\u0013ÿ\u0088ÚëÔ0g \u0097m\u0096\u0016n(]Ð\u0018l×\u001f\u0082ÂUX«kgÜ\u0010!Ø\u0080*\u00adl\né\u009d\\\u0013 èÈlm\u0083ÕH\u0011Ç\u0081\u0012\u0086\u0092ð}Þ;QT\u007f00\\ü¤ó$\u0015ûÕ³V á`Z\u0018\tX¯çr\u009dï\u0095ÚÂF\u0007\n±õµÔÿÓ\u0000¶\u000f\u0087ªKnè\u0007\u0018ÿ³\u0000\b\u0086¤²ñE;\u007f\u0013\u007f\u000e¢<ù.þ3\u0097Ã\u0006%\u00109\\kXqã4²\u008b\u0016öøJ+Í³\u0018\u0084<ù\r²\u0002\u0081\u008e\u001bWOÔD¤j 5\u000b¡Veâ¶w(}N$\u008a¹¶Þqj\u000f{\u0095\u0087DC.5jc²²^^ æG\u0084$Q·ÇÎ.rºÒ\u000e\u0002o  ^ôÍ*¯\u0016B\u0007\u0091 \u0085\u008cB3ÅciC\u0016eW9n,à<\u001d\u0018H\u0019À®(\u008b{¾³î\u0097\u0096\u0010p\u001c¯\u0098Z\u009b\u0093¤\u0095t¡¶7S÷\f\u0002N|Z\u0081CiíÂS|f\u000f¼^g\u0010\u001c¤]lâî\u00ad-\u0092\u0018\u0016Â\u0081\u009e\n\u009e\u0010 9Qî;\u0003\u0002¼|w¢?\u0016EÎB\u0018c\u001bÚu(L\u009eü (qE\u0089\u0002\núF¯¾\u0004\u009a+ë\u0018\u0018Ym\u0097¿ù\u0003Ùq°u\f\u001bÛ>|Ws\u008fwXÕõ\u00908(ÁÙ\u0007\u0099GðLo³Ä\u0018L\u0002&¬s\u0091e\u009f³6D¾ÁööÎ!Â\\\u0093\u009bIK:«S,cÒ {,MRüÁàÞq©²\u0003ÙÑª]=8\u007fUM\u0087E·g\u0003\u0012õQç\u0005  \u009cÌ¸\u0016ÿó\u0013eß\"I\u009c¶\u009dÙPÃ\u0002¾Î!æ¶¥ý\u0010ù´\fbþl(¯x!\u0088Þ\u0015g\u0083|¹É\u008fÆF\u00810Î±EÖ[@¦\u001aFö\b\u0013P\u0085\u009bïöà\u0016Æ\u0094\u0013KT ã1ø©4$è\u0096\bìâÊS´^XD\u0082÷\u009a\u0097#Sh$\u0081½Zü\u009cÁs ù|#ÔÙ\u008c%\u0080Ä«µó ø\nX\u0086ê\u0080±P!f\u0002Ñ_· F»¬\u0013\u0018Ù% ´çÐ§±\u0000~#¸KGé\u0003\u0085Ãõ\u0015|ß)é\u0010+)ø\u000e\u0081gâi{\u009cØ´³ùuå\u0018\u0085\r®\u009dìµÎ\u0086$ÞápOÞ\u0007R+\u00ad8H\u0091qÙ~"
.length();
char var14 = '8';
int var31 = -1;

label54:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[25];
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
String var4 = "h\u0013\u000fíÂ5ï¶\u0083dù\u000fA\u001cß LvHÖH¸½È";
int var5 = "h\u0013\u000fíÂ5ï¶\u0083dù\u000fA\u001cß LvHÖH¸½È".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var35 = var6;
var10001 = var3++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var35[var10001] = var52;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
KProperty[] var28 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uz.class, b<"t">(14227, 8385445434698004004L ^ var20), b<"t">(9312, 9187176686090511827L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uz.class, b<"t">(24002, 7987081538177932390L ^ var20), b<"t">(28302, 5325774287078862644L ^ var20), 0)
)
};
O = var28;
E = new uz(var26);
t = yp.L(E, b<"t">(13687, 8756610710373201104L ^ var20), f9.SILENT_FULL, null, null, c<"d">(12078, 3917405411317712104L ^ var20), null, var24);
A = yp.t(E, b<"t">(13342, 7918951831527880106L ^ var20), false, var22, null, null, c<"d">(27424, 7670910185203253477L ^ var20), null);
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "ÆÖ\u008e\u0005¼×d\u0088ÈÓ]\u0086\u001f\b\u0015\u0004";
var5 = "ÆÖ\u008e\u0005¼×d\u0088ÈÓ]\u0086\u001f\b\u0015\u0004".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var35 = var6;
var10001 = var3++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var43;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label54;
}

var15 = "Ä\u0016wã\u009e\u001c>\t\u0081Ì«ÿ\u008f\u00adæ÷$Dá8p\u0002H¤-¥\u008f|³\u0004Tã dN\u009cA\u0011Vg\u0004Ì¶ý\u0003¶¯Q¤\u000fr\u0098d¤ù<è:4Å7ñ¾*\n";
var17 = "Ä\u0016wã\u009e\u001c>\t\u0081Ì«ÿ\u008f\u00adæ÷$Dá8p\u0002H¤-¥\u008f|³\u0004Tã dN\u009cA\u0011Vg\u0004Ì¶ý\u0003¶¯Q¤\u000fr\u0098d¤ù<è:4Å7ñ¾*\n"
.length();
var14 = ' ';
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27573;
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
throw new RuntimeException("su/catlean/uz", var10);
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
throw new RuntimeException("su/catlean/uz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 451;
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
throw new RuntimeException("su/catlean/uz", var14);
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
throw new RuntimeException("su/catlean/uz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
