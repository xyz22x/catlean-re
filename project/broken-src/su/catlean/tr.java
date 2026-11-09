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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class tr extends tt {
@NotNull
public static final tr r;
private static int m;
@NotNull
private static _w U;
private static final long a = yz.a(1578620359136845785L, -5730320016401219740L, MethodHandles.lookup().lookupClass()).a(189758173182364L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private tr(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 392524263230L;
int var3 = (int)((var1 ^ 392524263230L) >>> 48);
int var4 = (int)((var1 ^ 392524263230L) << 16 >>> 32);
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
// 002: ldc2_w 8549690578441
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 33615733051039
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 68997309831326
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 118435926143872
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 12961280391072
// 021: lxor
// 022: lstore 14
// 024: dup2
// 025: ldc2_w 38753063586444
// 028: lxor
// 029: lstore 16
// 02b: dup2
// 02c: ldc2_w 65801053811260
// 02f: lxor
// 030: lstore 18
// 032: dup2
// 033: ldc2_w 76083599961676
// 036: lxor
// 037: lstore 20
// 039: dup2
// 03a: ldc2_w 43306842265647
// 03d: lxor
// 03e: lstore 22
// 040: pop2
// 041: aload 1
// 042: sipush 29221
// 045: ldc2_w 1861203335059879551
// 048: lload 2
// 049: lxor
// 04a: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 052: ldc2_w -3889368070291334691
// 055: lload 2
// 056: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: aload 4
// 05d: sipush 27655
// 060: ldc2_w 3250631389608421470
// 063: lload 2
// 064: lxor
// 065: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06d: getstatic su/catlean/tr.m I
// 070: istore 25
// 072: iload 25
// 074: bipush 1
// 075: iadd
// 076: putstatic su/catlean/tr.m I
// 079: astore 24
// 07b: aload 0
// 07c: lload 20
// 07e: aload 1
// 07f: invokevirtual su/catlean/tr.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 082: astore 25
// 084: fconst_0
// 085: fstore 26
// 087: aload 0
// 088: bipush 0
// 089: lload 18
// 08b: invokespecial su/catlean/tr.m (ZJ)F
// 08e: getstatic su/catlean/tr.U Lsu/catlean/_w;
// 091: invokevirtual su/catlean/_w.N ()F
// 094: fadd
// 095: fstore 27
// 097: iload 5
// 099: aload 24
// 09b: ifnonnull 0f5
// 09e: ifeq 0f2
// 0a1: goto 0ae
// 0a4: ldc2_w -3882509112948924065
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: lload 22
// 0b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b3: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0b6: aload 1
// 0b7: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 0ba: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 0bd: getstatic su/catlean/um.E Lsu/catlean/um;
// 0c0: lload 10
// 0c2: invokevirtual su/catlean/um.P (J)F
// 0c5: ldc 0.3
// 0c7: fadd
// 0c8: f2d
// 0c9: lload 2
// 0ca: lconst_0
// 0cb: lcmp
// 0cc: ifle 1b2
// 0cf: dcmpl
// 0d0: aload 24
// 0d2: ifnonnull 183
// 0d5: goto 0e2
// 0d8: ldc2_w -3882509112948924065
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: ifle 175
// 0e5: goto 0f2
// 0e8: ldc2_w -3882509112948924065
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: getstatic su/catlean/tr.m I
// 0f5: sipush 22907
// 0f8: ldc2_w 2701526258346323219
// 0fb: lload 2
// 0fc: lxor
// 0fd: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: if_icmple 160
// 105: lload 14
// 107: ldc 25.0
// 109: ldc 45.0
// 10b: bipush 0
// 10c: bipush 4
// 10d: aconst_null
// 10e: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 111: fstore 28
// 113: aload 0
// 114: bipush 1
// 115: lload 18
// 117: invokespecial su/catlean/tr.m (ZJ)F
// 11a: lload 6
// 11c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 11f: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 122: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 125: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 128: fadd
// 129: aload 4
// 12b: invokevirtual su/catlean/_w.q ()F
// 12e: fsub
// 12f: invokestatic net/minecraft/class_3532.method_15393 (F)F
// 132: fload 28
// 134: fneg
// 135: fload 28
// 137: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 13a: fstore 29
// 13c: new su/catlean/_w
// 13f: dup
// 140: aload 4
// 142: invokevirtual su/catlean/_w.q ()F
// 145: fload 29
// 147: fadd
// 148: lload 16
// 14a: fload 27
// 14c: bipush 0
// 14d: aconst_null
// 14e: sipush 27996
// 151: ldc2_w 4611653340195739955
// 154: lload 2
// 155: lxor
// 156: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: aconst_null
// 15c: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 15f: areturn
// 160: aload 0
// 161: bipush 1
// 162: lload 18
// 164: invokespecial su/catlean/tr.m (ZJ)F
// 167: getstatic su/catlean/tr.U Lsu/catlean/_w;
// 16a: invokevirtual su/catlean/_w.q ()F
// 16d: fadd
// 16e: fstore 26
// 170: aload 24
// 172: ifnull 24d
// 175: bipush 0
// 176: goto 183
// 179: ldc2_w -3882509112948924065
// 17c: lload 2
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: putstatic su/catlean/tr.m I
// 186: aload 25
// 188: getfield net/minecraft/class_243.field_1350 D
// 18b: lload 22
// 18d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 190: invokevirtual net/minecraft/class_746.method_23321 ()D
// 193: dsub
// 194: aload 25
// 196: getfield net/minecraft/class_243.field_1352 D
// 199: lload 22
// 19b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19e: invokevirtual net/minecraft/class_746.method_23317 ()D
// 1a1: dsub
// 1a2: invokestatic java/lang/Math.atan2 (DD)D
// 1a5: invokestatic java/lang/Math.toDegrees (D)D
// 1a8: ldc 90.0
// 1aa: f2d
// 1ab: dsub
// 1ac: aload 4
// 1ae: invokevirtual su/catlean/_w.q ()F
// 1b1: f2d
// 1b2: dsub
// 1b3: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 1b6: d2f
// 1b7: fstore 28
// 1b9: aload 25
// 1bb: getfield net/minecraft/class_243.field_1351 D
// 1be: lload 22
// 1c0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c3: lload 8
// 1c5: dup2_x1
// 1c6: pop2
// 1c7: checkcast net/minecraft/class_1297
// 1ca: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1cd: getfield net/minecraft/class_243.field_1351 D
// 1d0: lload 22
// 1d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d5: lload 22
// 1d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1da: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 1dd: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 1e0: f2d
// 1e1: dadd
// 1e2: dsub
// 1e3: aload 25
// 1e5: getfield net/minecraft/class_243.field_1352 D
// 1e8: lload 22
// 1ea: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ed: invokevirtual net/minecraft/class_746.method_23317 ()D
// 1f0: dsub
// 1f1: aload 25
// 1f3: getfield net/minecraft/class_243.field_1350 D
// 1f6: lload 22
// 1f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fb: invokevirtual net/minecraft/class_746.method_23321 ()D
// 1fe: dsub
// 1ff: invokestatic java/lang/Math.hypot (DD)D
// 202: invokestatic java/lang/Math.atan2 (DD)D
// 205: invokestatic java/lang/Math.toDegrees (D)D
// 208: d2f
// 209: fneg
// 20a: aload 4
// 20c: invokevirtual su/catlean/_w.N ()F
// 20f: fsub
// 210: fstore 29
// 212: aload 4
// 214: invokevirtual su/catlean/_w.q ()F
// 217: fload 28
// 219: ldc -95.0
// 21b: ldc 95.0
// 21d: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 220: fadd
// 221: fstore 26
// 223: aload 4
// 225: invokevirtual su/catlean/_w.N ()F
// 228: fload 29
// 22a: fadd
// 22b: fstore 27
// 22d: new su/catlean/_w
// 230: dup
// 231: fload 26
// 233: lload 16
// 235: fload 27
// 237: bipush 0
// 238: aconst_null
// 239: sipush 5189
// 23c: ldc2_w 7034909994581434412
// 23f: lload 2
// 240: lxor
// 241: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: aconst_null
// 247: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 24a: putstatic su/catlean/tr.U Lsu/catlean/_w;
// 24d: lload 22
// 24f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 252: getfield net/minecraft/class_746.field_6012 I
// 255: sipush 4042
// 258: ldc2_w 4046938644243364775
// 25b: lload 2
// 25c: lxor
// 25d: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: irem
// 263: istore 28
// 265: bipush 0
// 266: iload 28
// 268: lload 2
// 269: lconst_0
// 26a: lcmp
// 26b: ifle 2b1
// 26e: aload 24
// 270: ifnonnull 2b1
// 273: if_icmpgt 2c6
// 276: goto 283
// 279: ldc2_w -3882509112948924065
// 27c: lload 2
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: iload 28
// 285: aload 24
// 287: ifnonnull 2c3
// 28a: goto 297
// 28d: ldc2_w -3882509112948924065
// 290: lload 2
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: sipush 10143
// 29a: ldc2_w 6664533984677106673
// 29d: lload 2
// 29e: lxor
// 29f: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: goto 2b1
// 2a7: ldc2_w -3882509112948924065
// 2aa: lload 2
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: if_icmpge 2c2
// 2b4: bipush 1
// 2b5: goto 2c7
// 2b8: ldc2_w -3882509112948924065
// 2bb: lload 2
// 2bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c1: athrow
// 2c2: bipush 0
// 2c3: goto 2c7
// 2c6: bipush 0
// 2c7: ifeq 308
// 2ca: ldc -90.0
// 2cc: lload 14
// 2ce: ldc 18.0
// 2d0: ldc 20.0
// 2d2: bipush 0
// 2d3: bipush 4
// 2d4: aconst_null
// 2d5: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 2d8: lload 22
// 2da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2dd: getfield net/minecraft/class_746.field_6012 I
// 2e0: sipush 315
// 2e3: ldc2_w 8158076375685608791
// 2e6: lload 2
// 2e7: lxor
// 2e8: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: irem
// 2ee: i2f
// 2ef: ldc 10.0
// 2f1: fdiv
// 2f2: fmul
// 2f3: fadd
// 2f4: ldc -1.0
// 2f6: fconst_1
// 2f7: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 2fa: checkcast kotlin/ranges/ClosedRange
// 2fd: lload 12
// 2ff: bipush 0
// 300: bipush 2
// 301: aconst_null
// 302: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 305: fadd
// 306: fstore 27
// 308: new su/catlean/_w
// 30b: dup
// 30c: fload 26
// 30e: lload 16
// 310: fload 27
// 312: bipush 0
// 313: aconst_null
// 314: sipush 5189
// 317: ldc2_w 7034909994581434412
// 31a: lload 2
// 31b: lxor
// 31c: invokedynamic g (IJ)I bsm=su/catlean/tr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: aconst_null
// 322: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 325: areturn
}

private final float m(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 79251214838970L;
String var6 = vm.a<"Å">(-102633706770338488L, var2);

label22: {
int var10000;
label21: {
try {
var10000 = var1;
if (var6 != null) {
break label21;
}

if (var1 != 0) {
break label22;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -104741680828688950L, var2);
}

var10000 = zf.v(var4).field_6012;
}

float var16 = var10000 + 2.0F;
float var17 = (float)Math.sin(var16);
double var9 = 0.2 * Math.sin(0.4 * var16 * 0.7 + 1.23);
double var11 = 1 + 0.3 * Math.sin(0.4 * var16 * 0.5 + 2.45);
float var13 = (float)(var11 * var17 + var9);
return var13 * 6.0F;
}

float var7 = zf.v(var4).field_6012;
float var8 = (float)Math.sin(var7) + mf.q(-0.1F, 0.1F, false);
return var8 * 15.0F;
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
Intrinsics.checkNotNullParameter(target, b<"s">(7912, 9068358616668583164L ^ ax));
class_243 var10000 = target.method_5829().method_1005();
Intrinsics.checkNotNullExpressionValue(var10000, b<"s">(806, 6201146098350336305L ^ ax));
class_243 var4 = var10000;
return new class_243(var4.field_1352, var4.field_1351, var4.field_1350);
}

static {
long var20 = a ^ 69792145769692L;
long var22 = var20 ^ 91258273170361L;
long var24 = var20 ^ 107154223246714L;
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
String var15 = "\fïÚGvÖ\u0013\u0003«^ûP\u0004<^!õ57ÂÙ²t0$Ø\u008dv&I\u009b!\u0010\u000e©>âÆÁk\u0082\r\u0087ü\u009d¢>²×";
int var17 = "\fïÚGvÖ\u0013\u0003«^ûP\u0004<^!õ57ÂÙ²t0$Ø\u008dv&I\u009b!\u0010\u000e©>âÆÁk\u0082\r\u0087ü\u009d¢>²×".length();
char var14 = ' ';
int var28 = -1;

label54:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var40;
if ((var28 += var14) >= var17) {
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
long[] var6 = new long[6];
int var3 = 0;
String var4 = "Ryº-\u000b1_á8ÓÔâOól\u001fJ\u009e°Ú\u0081¿\t|YäÄR\u0099Q·[";
int var5 = "Ryº-\u000b1_á8ÓÔâOól\u001fJ\u009e°Ú\u0081¿\t|YäÄR\u0099Q·[".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var32 = var6;
var10001 = var3++;
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
var32[var10001] = var49;
if (var2 >= var5) {
e = var6;
f = new Integer[6];
r = new tr(var24);
U = new _w(0.0F, var22, 0.0F, false, null, c<"g">(5189, 7035032320448751897L ^ var20), null);
return;
}
break;
default:
var32[var10001] = var49;
if (var2 < var5) {
continue label36;
}

var4 = ">s\b\u0090:\u007fd2a1.\u0084fáÚ\u0010";
var5 = ">s\b\u0090:\u007fd2a1.\u0084fáÚ\u0010".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var32 = var6;
var10001 = var3++;
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

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var40;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label54;
}

var15 = "\u0085½i0\u0003TG2w¡|c¡\u0010Ö\u009bHâ\u008e1å(}ß÷¶ N\u0011ÁÊ%\u0010Ù\u0005Àe\u008aøîÕ}¯©F¯×e\t";
var17 = "\u0085½i0\u0003TG2w¡|c¡\u0010Ö\u009bHâ\u008e1å(}ß÷¶ N\u0011ÁÊ%\u0010Ù\u0005Àe\u008aøîÕ}¯©F¯×e\t".length();
var14 = ' ';
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3865;
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
throw new RuntimeException("su/catlean/tr", var10);
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
throw new RuntimeException("su/catlean/tr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32556;
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
throw new RuntimeException("su/catlean/tr", var14);
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
throw new RuntimeException("su/catlean/tr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
