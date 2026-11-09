package su.catlean;

import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_290;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ku extends _g {
@NotNull
public static final ku I;
private static float f;
private static float C;
private static float x;
private static float c;
private static float y;
private static float O;
private static float K;
private static float t;
private static float L;
private static int b;
private static final long a = yz.a(-6034562963958908252L, -4729566867936998456L, MethodHandles.lookup().lookupClass()).a(125343006471290L);
private static final String[] d;
private static final String[] e;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private ku(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 35474170949360L;
super(b<"x">(6547, 4626761340428278026L ^ var1), jt.F(), null, 4, null, var3);
}

@Override
public void O(long var1) {
long var3 = var1 ^ 32978412894279L;
long var5 = var1 ^ 69599493015750L;
long var7 = var1 ^ 67464996320865L;
_g[] var9 = vm.a<"Å">(2602544989129668004L, var1);

class_746 var10000;
label22: {
try {
var10000 = zf.F(var3).field_1724;
if (var9 == null) {
break label22;
}

if (var10000 == null) {
return;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 2735778510775786364L, var1);
}

b = 0;
zf.z(var5).method_8486(f, C + 0.5, x, class_3417.field_15079, class_3419.field_15245, 0.2F, 1.0F, false);
f = (float)zf.v(var7).method_33571().field_1352;
C = (float)zf.v(var7).method_33571().field_1351;
x = (float)zf.v(var7).method_33571().field_1350;
K = (float)zf.v(var7).method_5720().field_1352;
t = (float)zf.v(var7).method_5720().field_1351 + 0.42F + (float)zf.v(var7).method_18798().field_1351;
var10000 = zf.v(var7);
}

L = (float)var10000.method_5720().field_1350;
}

@Flow
private final void p(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ku.a J
// 003: ldc2_w 111434961527165
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 32629452854980
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 59307536720712
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 18976936786864
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 34128205179773
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 67196055353062
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 21257533670679
// 030: lxor
// 031: lstore 14
// 033: pop2
// 034: getstatic su/catlean/ku.f F
// 037: putstatic su/catlean/ku.c F
// 03a: ldc2_w -7536713578534517038
// 03d: lload 2
// 03e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: getstatic su/catlean/ku.C F
// 046: putstatic su/catlean/ku.y F
// 049: getstatic su/catlean/ku.x F
// 04c: putstatic su/catlean/ku.O F
// 04f: getstatic su/catlean/ku.f F
// 052: getstatic su/catlean/ku.K F
// 055: fadd
// 056: putstatic su/catlean/ku.f F
// 059: getstatic su/catlean/ku.C F
// 05c: getstatic su/catlean/ku.t F
// 05f: fadd
// 060: putstatic su/catlean/ku.C F
// 063: getstatic su/catlean/ku.x F
// 066: getstatic su/catlean/ku.L F
// 069: fadd
// 06a: putstatic su/catlean/ku.x F
// 06d: getstatic su/catlean/ku.K F
// 070: ldc 0.98
// 072: fmul
// 073: putstatic su/catlean/ku.K F
// 076: astore 16
// 078: getstatic su/catlean/ku.t F
// 07b: ldc 0.98
// 07d: fmul
// 07e: putstatic su/catlean/ku.t F
// 081: getstatic su/catlean/ku.L F
// 084: ldc 0.98
// 086: fmul
// 087: putstatic su/catlean/ku.L F
// 08a: getstatic su/catlean/la.l Lsu/catlean/la;
// 08d: new net/minecraft/class_243
// 090: dup
// 091: getstatic su/catlean/ku.f F
// 094: f2d
// 095: getstatic su/catlean/ku.C F
// 098: f2d
// 099: getstatic su/catlean/ku.x F
// 09c: f2d
// 09d: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0a0: new net/minecraft/class_243
// 0a3: dup
// 0a4: getstatic su/catlean/ku.c F
// 0a7: f2d
// 0a8: getstatic su/catlean/ku.y F
// 0ab: f2d
// 0ac: getstatic su/catlean/ku.O F
// 0af: f2d
// 0b0: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0b3: bipush 0
// 0b4: aconst_null
// 0b5: bipush 0
// 0b6: sipush 19803
// 0b9: ldc2_w 8331200528998282696
// 0bc: lload 2
// 0bd: lxor
// 0be: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: aconst_null
// 0c4: lload 6
// 0c6: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 0c9: astore 17
// 0cb: aload 16
// 0cd: ifnull 11e
// 0d0: aload 17
// 0d2: dup
// 0d3: ifnull 11d
// 0d6: goto 0e3
// 0d9: ldc2_w -7601691337595967478
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 0e6: invokevirtual net/minecraft/class_3965.equals (Ljava/lang/Object;)Z
// 0e9: aload 16
// 0eb: ifnull 11a
// 0ee: goto 0fb
// 0f1: ldc2_w -7601691337595967478
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: ifne 119
// 0fe: goto 10b
// 101: ldc2_w -7601691337595967478
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 1
// 10c: goto 11f
// 10f: ldc2_w -7601691337595967478
// 112: lload 2
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: bipush 0
// 11a: goto 11f
// 11d: pop
// 11e: bipush 0
// 11f: ifne 130
// 122: bipush 1
// 123: goto 131
// 126: ldc2_w -7601691337595967478
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: bipush 0
// 131: istore 18
// 133: aload 16
// 135: ifnull 15d
// 138: iload 18
// 13a: ifne 1e4
// 13d: goto 14a
// 140: ldc2_w -7601691337595967478
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: getstatic su/catlean/ku.c F
// 14d: putstatic su/catlean/ku.f F
// 150: goto 15d
// 153: ldc2_w -7601691337595967478
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: aload 16
// 15f: ifnull 1c1
// 162: aload 17
// 164: dup
// 165: ifnull 1c0
// 168: goto 175
// 16b: ldc2_w -7601691337595967478
// 16e: lload 2
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 178: dup
// 179: aload 16
// 17b: ifnull 1ac
// 17e: goto 18b
// 181: ldc2_w -7601691337595967478
// 184: lload 2
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: ifnull 1c0
// 18e: goto 19b
// 191: ldc2_w -7601691337595967478
// 194: lload 2
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 19e: dup
// 19f: goto 1ac
// 1a2: ldc2_w -7601691337595967478
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: ifnull 1c0
// 1af: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1b2: i2f
// 1b3: goto 1c4
// 1b6: ldc2_w -7601691337595967478
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: pop
// 1c1: getstatic su/catlean/ku.y F
// 1c4: putstatic su/catlean/ku.C F
// 1c7: getstatic su/catlean/ku.O F
// 1ca: putstatic su/catlean/ku.x F
// 1cd: getstatic su/catlean/ku.K F
// 1d0: ldc 0.81
// 1d2: fmul
// 1d3: putstatic su/catlean/ku.K F
// 1d6: getstatic su/catlean/ku.L F
// 1d9: ldc 0.81
// 1db: fmul
// 1dc: putstatic su/catlean/ku.L F
// 1df: aload 16
// 1e1: ifnonnull 1fa
// 1e4: getstatic su/catlean/ku.t F
// 1e7: ldc 0.08
// 1e9: fsub
// 1ea: putstatic su/catlean/ku.t F
// 1ed: goto 1fa
// 1f0: ldc2_w -7601691337595967478
// 1f3: lload 2
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: getstatic su/catlean/ku.b I
// 1fd: istore 19
// 1ff: iload 19
// 201: bipush 1
// 202: iadd
// 203: putstatic su/catlean/ku.b I
// 206: bipush 3
// 207: istore 19
// 209: bipush 0
// 20a: istore 20
// 20c: iload 20
// 20e: iload 19
// 210: if_icmpge 290
// 213: iload 20
// 215: istore 21
// 217: bipush 0
// 218: istore 22
// 21a: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 21d: new su/catlean/bk
// 220: dup
// 221: getstatic su/catlean/fo.STAR Lsu/catlean/fo;
// 224: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 227: new net/minecraft/class_243
// 22a: dup
// 22b: getstatic su/catlean/ku.f F
// 22e: f2d
// 22f: getstatic su/catlean/ku.C F
// 232: f2d
// 233: ldc2_w 0.5
// 236: dadd
// 237: getstatic su/catlean/ku.x F
// 23a: f2d
// 23b: invokespecial net/minecraft/class_243.<init> (DDD)V
// 23e: invokestatic java/lang/Math.random ()D
// 241: ldc 50.0
// 243: f2d
// 244: dmul
// 245: d2f
// 246: lload 10
// 248: ldc 0.2
// 24a: bipush 5
// 24b: new net/minecraft/class_243
// 24e: dup
// 24f: invokestatic java/lang/Math.random ()D
// 252: ldc 4.0
// 254: f2d
// 255: ddiv
// 256: ldc 0.125
// 258: f2d
// 259: dsub
// 25a: invokestatic java/lang/Math.random ()D
// 25d: fconst_2
// 25e: f2d
// 25f: ddiv
// 260: invokestatic java/lang/Math.random ()D
// 263: ldc 4.0
// 265: f2d
// 266: ddiv
// 267: ldc 0.125
// 269: f2d
// 26a: dsub
// 26b: invokespecial net/minecraft/class_243.<init> (DDD)V
// 26e: aconst_null
// 26f: fconst_0
// 270: fconst_0
// 271: bipush 0
// 272: sipush 29526
// 275: ldc2_w 7849680638250453966
// 278: lload 2
// 279: lxor
// 27a: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: aconst_null
// 280: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 283: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 286: pop
// 287: nop
// 288: iinc 20 1
// 28b: aload 16
// 28d: ifnonnull 20c
// 290: getstatic su/catlean/ku.x F
// 293: f2d
// 294: lload 14
// 296: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 299: invokevirtual net/minecraft/class_746.method_23321 ()D
// 29c: dsub
// 29d: getstatic su/catlean/ku.f F
// 2a0: f2d
// 2a1: lload 14
// 2a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a6: invokevirtual net/minecraft/class_746.method_23317 ()D
// 2a9: dsub
// 2aa: invokestatic java/lang/Math.atan2 (DD)D
// 2ad: invokestatic java/lang/Math.toDegrees (D)D
// 2b0: sipush 32207
// 2b3: ldc2_w 8124068833686127963
// 2b6: lload 2
// 2b7: lxor
// 2b8: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: i2d
// 2be: dsub
// 2bf: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2c2: lload 4
// 2c4: invokevirtual su/catlean/dm.U (J)F
// 2c7: f2d
// 2c8: dsub
// 2c9: sipush 32024
// 2cc: ldc2_w 54512398947812745
// 2cf: lload 2
// 2d0: lxor
// 2d1: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: i2d
// 2d7: drem
// 2d8: ldc 180.0
// 2da: f2d
// 2db: dadd
// 2dc: dstore 19
// 2de: getstatic su/catlean/ku.b I
// 2e1: aload 16
// 2e3: ifnull 34b
// 2e6: sipush 20442
// 2e9: ldc2_w 9038222463198934856
// 2ec: lload 2
// 2ed: lxor
// 2ee: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: if_icmple 453
// 2f6: goto 303
// 2f9: ldc2_w -7601691337595967478
// 2fc: lload 2
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: aload 0
// 304: lload 12
// 306: invokevirtual su/catlean/ku.d (J)V
// 309: sipush 13982
// 30c: lload 8
// 30e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 311: getstatic su/catlean/ku.f F
// 314: f2d
// 315: getstatic su/catlean/ku.C F
// 318: f2d
// 319: ldc2_w 0.5
// 31c: dadd
// 31d: getstatic su/catlean/ku.x F
// 320: f2d
// 321: getstatic net/minecraft/class_3417.field_15152 Lnet/minecraft/class_6880$class_6883;
// 324: invokevirtual net/minecraft/class_6880$class_6883.comp_349 ()Ljava/lang/Object;
// 327: checkcast net/minecraft/class_3414
// 32a: getstatic net/minecraft/class_3419.field_15245 Lnet/minecraft/class_3419;
// 32d: ldc 0.2
// 32f: fconst_1
// 330: bipush 0
// 331: invokevirtual net/minecraft/class_638.method_8486 (DDDLnet/minecraft/class_3414;Lnet/minecraft/class_3419;FFZ)V
// 334: ldc2_w 3301905739186163205
// 337: lload 2
// 338: lxor
// 339: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: goto 34b
// 341: ldc2_w -7601691337595967478
// 344: lload 2
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: istore 21
// 34d: bipush 0
// 34e: istore 22
// 350: iload 22
// 352: iload 21
// 354: if_icmpge 453
// 357: iload 22
// 359: istore 23
// 35b: bipush 0
// 35c: istore 24
// 35e: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 361: new su/catlean/bk
// 364: dup
// 365: getstatic su/catlean/fo.STAR Lsu/catlean/fo;
// 368: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 36b: new net/minecraft/class_243
// 36e: dup
// 36f: getstatic su/catlean/ku.f F
// 372: f2d
// 373: getstatic su/catlean/ku.C F
// 376: f2d
// 377: ldc2_w 0.5
// 37a: dadd
// 37b: getstatic su/catlean/ku.x F
// 37e: f2d
// 37f: invokespecial net/minecraft/class_243.<init> (DDD)V
// 382: invokestatic java/lang/Math.random ()D
// 385: ldc 50.0
// 387: f2d
// 388: dmul
// 389: d2f
// 38a: lload 10
// 38c: ldc 0.5
// 38e: sipush 30263
// 391: ldc2_w 7840551331846524578
// 394: lload 2
// 395: lxor
// 396: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: new net/minecraft/class_243
// 39e: dup
// 39f: invokestatic java/lang/Math.random ()D
// 3a2: ldc2_w 0.5
// 3a5: dsub
// 3a6: ldc 1.5
// 3a8: f2d
// 3a9: dmul
// 3aa: invokestatic java/lang/Math.random ()D
// 3ad: invokestatic java/lang/Math.random ()D
// 3b0: ldc2_w 0.5
// 3b3: dsub
// 3b4: ldc 1.5
// 3b6: f2d
// 3b7: dmul
// 3b8: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3bb: aconst_null
// 3bc: fconst_0
// 3bd: fconst_0
// 3be: bipush 0
// 3bf: sipush 4084
// 3c2: ldc2_w 6021125662472337250
// 3c5: lload 2
// 3c6: lxor
// 3c7: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: aconst_null
// 3cd: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3d0: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 3d3: pop
// 3d4: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 3d7: new su/catlean/bk
// 3da: dup
// 3db: getstatic su/catlean/fo.FIRE_FLY Lsu/catlean/fo;
// 3de: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 3e1: new net/minecraft/class_243
// 3e4: dup
// 3e5: getstatic su/catlean/ku.f F
// 3e8: f2d
// 3e9: getstatic su/catlean/ku.C F
// 3ec: f2d
// 3ed: ldc2_w 0.5
// 3f0: dadd
// 3f1: getstatic su/catlean/ku.x F
// 3f4: f2d
// 3f5: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3f8: invokestatic java/lang/Math.random ()D
// 3fb: ldc 50.0
// 3fd: f2d
// 3fe: dmul
// 3ff: d2f
// 400: lload 10
// 402: ldc 0.3
// 404: sipush 32270
// 407: ldc2_w 1086594698928031383
// 40a: lload 2
// 40b: lxor
// 40c: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 411: new net/minecraft/class_243
// 414: dup
// 415: invokestatic java/lang/Math.random ()D
// 418: ldc2_w 0.5
// 41b: dsub
// 41c: ldc 1.5
// 41e: f2d
// 41f: dmul
// 420: invokestatic java/lang/Math.random ()D
// 423: invokestatic java/lang/Math.random ()D
// 426: ldc2_w 0.5
// 429: dsub
// 42a: ldc 1.5
// 42c: f2d
// 42d: dmul
// 42e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 431: aconst_null
// 432: fconst_0
// 433: fconst_0
// 434: bipush 0
// 435: sipush 4084
// 438: ldc2_w 6021125662472337250
// 43b: lload 2
// 43c: lxor
// 43d: invokedynamic n (IJ)I bsm=su/catlean/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: aconst_null
// 443: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 446: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 449: pop
// 44a: nop
// 44b: iinc 22 1
// 44e: aload 16
// 450: ifnonnull 350
// 453: return
}

@Flow
private final void I(Render3DEvent var1) {
long var2 = a ^ 101132134265298L;
long var4 = var2 ^ 14651202231198L;
long var6 = var2 ^ 102240699649931L;
long var10001 = var2 ^ 131981939838150L;
int var8 = (int)((var2 ^ 131981939838150L) >>> 32);
int var9 = (int)((var2 ^ 131981939838150L) << 32 >>> 56);
int var10 = (int)(var10001 << 40 >>> 40);
class_4184 var10000 = zf.F(var4).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var10000, b<"x">(28958, 3692626330636339568L ^ var2));
class_4184 var11 = var10000;
float var12 = jl.y.B(c, f, jl.y.K(var6));
float var13 = jl.y.B(y, C, jl.y.K(var6));
float var14 = jl.y.B(O, x, jl.y.K(var6));
var1.getStack().method_22903();
var1.getStack().method_22904(var12 - var11.method_71156().field_1352, var13 - var11.method_71156().field_1351, var14 - var11.method_71156().field_1350);
this.E(var8, (byte)var9, var1.getStack(), 0.0F, var10, 0.0F, 0.0F);
var1.getStack().method_22909();
}

public final void E(int a, byte a, @NotNull class_4587 matrices, float x, int a, float y, float z) {
long var8 = ((long)ax << 32 | (long)axxx << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
long var10 = var8 ^ 108716529041198L;
long var12 = var8 ^ 102683967659657L;
long var14 = var8 ^ 44164854082529L;
long var16 = var8 ^ 57645318630211L;
Intrinsics.checkNotNullParameter(matrices, b<"x">(5155, 6080615350841481097L ^ var8));
_g[] var10000 = vm.a<"Å">(4324646674369801662L, var8);
Matrix4f var10001 = matrices.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var10001, b<"x">(17927, 6277362028384437672L ^ var8));
Matrix4f var24 = var10001;
VertexFormat var10003 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, b<"x">(3275, 6529768194699202402L ^ var8));
int var10004 = c<"n">(30817, 8850814350304226205L ^ var8);
Object var18 = null;
byte var19 = 4;
boolean var20 = false;
int var21 = var10004;
VertexFormat var22 = var10003;
g7 var25 = new g7(var10, var22, var21, var20, var19, (DefaultConstructorMarker)var18);
float var26 = 0.12F;
_g[] var23 = var10000;
float var27 = 0.5F;
float var28 = 0.2F;
int var29 = c<"n">(5665, 2344829258631300567L ^ var8);
int var30 = 0;

label39:
while (true) {
if (var30 < var29) {
float var31 = (float)((Math.PI * 2) * var30 / var29);
float var32 = (float)((Math.PI * 2) * (var30 + 1) / var29);
float var33 = xx + (float)Math.cos(var31) * var26;
float var34 = z + (float)Math.sin(var31) * var26;
float var35 = xx + (float)Math.cos(var32) * var26;
var48 = z + (float)Math.sin(var32) * var26;
if (var23 == null) {
break;
}

float var36 = var48;
Color var37 = Color.DARK_GRAY;
g7 var49 = var25.O(var24, var33, var14, yx, var34);
Intrinsics.checkNotNull(var37);
var49.n(var37, var12);
var25.O(var24, var33, var14, yx + var27, var34).n(var37, var12);
var25.O(var24, var35, var14, yx + var27, var36).n(var37, var12);
var25.O(var24, var35, var14, yx, var36).n(var37, var12);
var30++;
var10000 = var23;

do {
if (var10000 != null) {
continue label39;
}

var10000 = new _g[5];
} while (ax < 0);

vm.a<"Å">(var10000, 4337975739697149454L, var8);
}

var48 = yx + var27 / 2 - var28 / 2;
break;
}

float var38 = var48;
int var39 = 0;

while (true) {
if (var39 < var29) {
float var41 = (float)((Math.PI * 2) * var39 / var29);
float var43 = (float)((Math.PI * 2) * (var39 + 1) / var29);
float var44 = xx + (float)Math.cos(var41) * (var26 + 0.01F);
float var45 = z + (float)Math.sin(var41) * (var26 + 0.01F);
float var46 = xx + (float)Math.cos(var43) * (var26 + 0.01F);
var51 = z + (float)Math.sin(var43) * (var26 + 0.01F);
if (var23 == null) {
break;
}

float var47 = var51;
g7 var52 = var25.O(var24, var44, var14, var38, var45);
Color var60 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"x">(20886, 518413484028088893L ^ var8));
var52.n(var60, var12);
g7 var53 = var25.O(var24, var44, var14, var38 + var28, var45);
Color var61 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"x">(31888, 1161367752399617848L ^ var8));
var53.n(var61, var12);
g7 var54 = var25.O(var24, var46, var14, var38 + var28, var47);
Color var62 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"x">(31888, 1161367752399617848L ^ var8));
var54.n(var62, var12);
g7 var55 = var25.O(var24, var46, var14, var38, var47);
Color var63 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"x">(31888, 1161367752399617848L ^ var8));
var55.n(var63, var12);
var39++;
if (var23 != null) {
continue;
}
}

var51 = 0.06F;
break;
}

float var40 = var51;
float var42 = 0.03F;
g7 var56 = var25.O(var24, xx - var42, var14, yx + var27 + var40, z - var42);
Color var64 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"x">(17285, 376039371643863081L ^ var8));
var56.n(var64, var12);
g7 var57 = var25.O(var24, xx - var42, var14, yx + var27, z - var42);
Color var65 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"x">(17337, 1958106826013851671L ^ var8));
var57.n(var65, var12);
g7 var58 = var25.O(var24, xx + var42, var14, yx + var27, z + var42);
Color var66 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"x">(17337, 1958106826013851671L ^ var8));
var58.n(var66, var12);
g7 var59 = var25.O(var24, xx + var42, var14, yx + var27 + var40, z + var42);
Color var67 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"x">(17337, 1958106826013851671L ^ var8));
var59.n(var67, var12);
g7.R(var16, var25, b6.R.Z(), null, null, matrices.method_23760().method_23761(), null, null, c<"n">(9927, 8478110356426192188L ^ var8), null);
}

static {
long var20 = a ^ 346152035543L;
long var22 = var20 ^ 1265206500094L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "×«QÃGv«½\u009dÑÿä?N¤\u009c(\u000f°ÃK\tûäL\u0002q·mÂìèOÐú×³Ï-Ä\u008c\u0013oWHèq LÓÌf=gÁýÑ\u0010\u008dÍá~ÖßðPúÔ×\u008a\u0096OûI ø\u0096\u0097o~$qß¸\u0003&^\u008cL\\\u008cºâ8R\f¼Ëï\u0093}`\u008fê,Õ`\u0010]\u000eR~\u0098NrïÆñusýäÌ\u009c `?\u0084õ]\u0094À\u009eãõ\u008f@qV9\u00ad\u0010+õ#ÐøÔ²5 \u001a\u009ch]Þ\t\u0018Y©\u008b¥^öU´\u0081ÃÛÍ\u009fÌZÏÕ:\u0011\u001c\u000b$Ýb";
int var17 = "×«QÃGv«½\u009dÑÿä?N¤\u009c(\u000f°ÃK\tûäL\u0002q·mÂìèOÐú×³Ï-Ä\u008c\u0013oWHèq LÓÌf=gÁýÑ\u0010\u008dÍá~ÖßðPúÔ×\u008a\u0096OûI ø\u0096\u0097o~$qß¸\u0003&^\u008cL\\\u008cºâ8R\f¼Ëï\u0093}`\u008fê,Õ`\u0010]\u000eR~\u0098NrïÆñusýäÌ\u009c `?\u0084õ]\u0094À\u009eãõ\u008f@qV9\u00ad\u0010+õ#ÐøÔ²5 \u001a\u009ch]Þ\t\u0018Y©\u008b¥^öU´\u0081ÃÛÍ\u009fÌZÏÕ:\u0011\u001c\u000b$Ýb"
.length();
char var14 = 16;
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
d = var18;
e = new String[9];
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
String var4 = "&\u008c\u0085ý\u008bsó\u001c{oÍ\u009a\u0089¿u\u009cnº]\u009b\u000biåf¦\r\u008d\u0015\b\b/\u0089rÇI§\u0096\u009dbËyj'®Ð\u0089«R\rñÀ\u0090ëôÌiõ\u0095Dª%gP\nÐ)iÇÌ?2×59ê\u008a\u0088\u0019ú\u0014";
int var5 = "&\u008c\u0085ý\u008bsó\u001c{oÍ\u009a\u0089¿u\u009cnº]\u009b\u000biåf¦\r\u008d\u0015\b\b/\u0089rÇI§\u0096\u009dbËyj'®Ð\u0089«R\rñÀ\u0090ëôÌiõ\u0095Dª%gP\nÐ)iÇÌ?2×59ê\u008a\u0088\u0019ú\u0014"
.length();
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
h = var6;
i = new Integer[12];
I = new ku(var22);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "P¾Ø\u0087¤\u0092\u001b\u008e5{üÛjæðÿ";
var5 = "P¾Ø\u0087¤\u0092\u001b\u008e5{üÛjæðÿ".length();
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

var15 = "\u0089\u0013\u0003?\u0004OmrÜe\u001d06ÏÊ· Øé)\u008bìÂü\n¬Öª\u0000¿ûH=ë\u0090¾g×\bØq§\u008e&5nxË\u0097";
var17 = "\u0089\u0013\u0003?\u0004OmrÜe\u001d06ÏÊ· Øé)\u008bìÂü\n¬Öª\u0000¿ûH=ë\u0090¾g×\bØq§\u008e&5nxË\u0097".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16056;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ku", var10);
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
throw new RuntimeException("su/catlean/ku" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28394;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/ku", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/ku" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
