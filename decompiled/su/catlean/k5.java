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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.render.EquipArmEvent;
import su.catlean.api.event.events.render.SwingArmEvent;
import su.catlean.api.event.events.render.SwingDurationEvent;
import su.catlean.gofra.Flow;

public final class k5 extends _g {
@NotNull
public static final k5 A;
static final KProperty[] a;
@NotNull
private static final cw L;
@NotNull
private static final c8 V;
private static float m;
private static final long b = yz.a(5370127439062463046L, -4337332661934070925L, MethodHandles.lookup().lookupClass()).a(212291494360167L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private k5(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 106590278641384L;
super(b<"k">(28683, 8481322847732225932L ^ var1), jt.F(), null, 4, null, var3);
}

private final df a(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 26139647614275L;
return (df)L.E(this, var6, a[0]);
}

private final void r(df var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 113609991367932L;
L.b(this, var4, a[0], var1);
}

private final int g(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
long var6 = var4 ^ 63124051481521L;
return ((Number)V.E(this, var6, a[1])).intValue();
}

private final void k(long var1, char var3, int var4) {
long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
long var7 = var5 ^ 136607972172018L;
V.b(this, var7, a[1], var4);
}

@Flow
private final void v(SwingDurationEvent var1) {
long var2 = b ^ 98848419980776L;
long var4 = (var2 ^ 35525699975773L) >>> 8;
int var6 = (int)((var2 ^ 35525699975773L) << 56 >>> 56);
var1.setValue(this.g(var4, (byte)var6));
var1.cancel();
}

@Flow
private final void d(EquipArmEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/k5.b J
// 03: ldc2_w 131538016674751
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2268589303111580634
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 1
// 14: aload 4
// 16: ifnonnull 3d
// 19: invokevirtual su/catlean/api/event/events/render/EquipArmEvent.getArm ()Lnet/minecraft/class_1306;
// 1c: getstatic net/minecraft/class_1306.field_6183 Lnet/minecraft/class_1306;
// 1f: if_acmpne 43
// 22: goto 2f
// 25: ldc2_w -2283559145168256087
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: aload 1
// 30: goto 3d
// 33: ldc2_w -2283559145168256087
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: invokevirtual su/catlean/api/event/events/render/EquipArmEvent.getProgress ()F
// 40: putstatic su/catlean/k5.m F
// 43: return
}

@Flow
private final void R(SwingArmEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k5.b J
// 003: ldc2_w 96687103287762
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 74736732400122
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 118970111451740
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
// 032: ldc2_w 92207926028655
// 035: lxor
// 036: dup2
// 037: bipush 16
// 039: lushr
// 03a: lstore 9
// 03c: dup2
// 03d: bipush 48
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 1001180295317
// 04b: lxor
// 04c: dup2
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 12
// 053: dup2
// 054: bipush 16
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 13
// 05d: dup2
// 05e: bipush 32
// 060: lshl
// 061: bipush 32
// 063: lushr
// 064: l2i
// 065: istore 14
// 067: pop2
// 068: dup2
// 069: ldc2_w 61028555577382
// 06c: lxor
// 06d: lstore 15
// 06f: dup2
// 070: ldc2_w 6306888822606
// 073: lxor
// 074: lstore 17
// 076: dup2
// 077: ldc2_w 61933481698694
// 07a: lxor
// 07b: lstore 19
// 07d: pop2
// 07e: ldc2_w -2096009727904807349
// 081: lload 2
// 082: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: astore 21
// 089: aload 1
// 08a: aload 21
// 08c: ifnonnull 0c5
// 08f: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 092: getstatic net/minecraft/class_1306.field_6183 Lnet/minecraft/class_1306;
// 095: if_acmpeq 0b0
// 098: goto 0a5
// 09b: ldc2_w -2152145286249135676
// 09e: lload 2
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: return
// 0a6: ldc2_w -2152145286249135676
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 1
// 0b1: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 0b4: ldc -0.56
// 0b6: ldc 0.52
// 0b8: getstatic su/catlean/k5.m F
// 0bb: ldc -0.6
// 0bd: fmul
// 0be: fsub
// 0bf: ldc 0.72
// 0c1: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 0c4: aload 1
// 0c5: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.cancel ()V
// 0c8: aload 0
// 0c9: aload 21
// 0cb: ifnonnull 15a
// 0ce: iload 12
// 0d0: i2s
// 0d1: iload 13
// 0d3: i2c
// 0d4: iload 14
// 0d6: invokespecial su/catlean/k5.a (SCI)Lsu/catlean/df;
// 0d9: getstatic su/catlean/g_.U [I
// 0dc: swap
// 0dd: invokevirtual su/catlean/df.ordinal ()I
// 0e0: iaload
// 0e1: tableswitch 1670 1 11 69 157 263 369 475 581 721 881 1019 1128 1257
// 11c: ldc2_w -2152145286249135676
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 0
// 127: aload 1
// 128: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 12b: lload 9
// 12d: dup2_x1
// 12e: pop2
// 12f: iload 11
// 131: i2s
// 132: swap
// 133: aload 1
// 134: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 137: fconst_0
// 138: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 13b: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 13e: aload 1
// 13f: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 142: iload 6
// 144: iload 7
// 146: iload 8
// 148: i2s
// 149: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 14c: aload 0
// 14d: goto 15a
// 150: ldc2_w -2152145286249135676
// 153: lload 2
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 1
// 15b: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 15e: aload 1
// 15f: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 162: lload 17
// 164: dup2_x1
// 165: pop2
// 166: aload 1
// 167: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 16a: invokespecial su/catlean/k5.j (Lnet/minecraft/class_4587;JLnet/minecraft/class_1306;F)V
// 16d: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 170: aload 1
// 171: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 174: lload 15
// 176: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 179: aload 21
// 17b: ifnull 767
// 17e: aload 0
// 17f: aload 1
// 180: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 183: lload 9
// 185: dup2_x1
// 186: pop2
// 187: iload 11
// 189: i2s
// 18a: swap
// 18b: aload 1
// 18c: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 18f: fconst_0
// 190: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 193: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 196: aload 1
// 197: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 19a: iload 6
// 19c: iload 7
// 19e: iload 8
// 1a0: i2s
// 1a1: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 1a4: getstatic su/catlean/_s.OUT_ELASTIC Lsu/catlean/_s;
// 1a7: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 1aa: aload 1
// 1ab: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 1ae: f2d
// 1af: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1b2: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 1b7: checkcast java/lang/Number
// 1ba: invokevirtual java/lang/Number.doubleValue ()D
// 1bd: dstore 22
// 1bf: aload 1
// 1c0: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 1c3: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 1c6: dload 22
// 1c8: d2f
// 1c9: ldc -90.0
// 1cb: fmul
// 1cc: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 1d1: checkcast org/joml/Quaternionfc
// 1d4: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 1d7: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 1da: aload 1
// 1db: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 1de: lload 15
// 1e0: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 1e3: aload 21
// 1e5: ifnull 767
// 1e8: aload 0
// 1e9: aload 1
// 1ea: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 1ed: lload 9
// 1ef: dup2_x1
// 1f0: pop2
// 1f1: iload 11
// 1f3: i2s
// 1f4: swap
// 1f5: aload 1
// 1f6: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 1f9: fconst_0
// 1fa: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 1fd: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 200: aload 1
// 201: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 204: iload 6
// 206: iload 7
// 208: iload 8
// 20a: i2s
// 20b: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 20e: getstatic su/catlean/_s.OUT_ELASTIC Lsu/catlean/_s;
// 211: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 214: aload 1
// 215: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 218: f2d
// 219: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 21c: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 221: checkcast java/lang/Number
// 224: invokevirtual java/lang/Number.doubleValue ()D
// 227: dstore 22
// 229: aload 1
// 22a: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 22d: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 230: dload 22
// 232: d2f
// 233: ldc -360.0
// 235: fmul
// 236: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 23b: checkcast org/joml/Quaternionfc
// 23e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 241: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 244: aload 1
// 245: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 248: lload 15
// 24a: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 24d: aload 21
// 24f: ifnull 767
// 252: aload 0
// 253: aload 1
// 254: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 257: lload 9
// 259: dup2_x1
// 25a: pop2
// 25b: iload 11
// 25d: i2s
// 25e: swap
// 25f: aload 1
// 260: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 263: fconst_0
// 264: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 267: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 26a: aload 1
// 26b: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 26e: iload 6
// 270: iload 7
// 272: iload 8
// 274: i2s
// 275: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 278: getstatic su/catlean/_s.OUT_SINE Lsu/catlean/_s;
// 27b: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 27e: aload 1
// 27f: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 282: f2d
// 283: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 286: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 28b: checkcast java/lang/Number
// 28e: invokevirtual java/lang/Number.doubleValue ()D
// 291: dstore 22
// 293: aload 1
// 294: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 297: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 29a: dload 22
// 29c: d2f
// 29d: ldc -360.0
// 29f: fmul
// 2a0: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2a5: checkcast org/joml/Quaternionfc
// 2a8: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 2ab: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 2ae: aload 1
// 2af: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 2b2: lload 15
// 2b4: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 2b7: aload 21
// 2b9: ifnull 767
// 2bc: aload 0
// 2bd: aload 1
// 2be: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 2c1: lload 9
// 2c3: dup2_x1
// 2c4: pop2
// 2c5: iload 11
// 2c7: i2s
// 2c8: swap
// 2c9: aload 1
// 2ca: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 2cd: fconst_0
// 2ce: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 2d1: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 2d4: aload 1
// 2d5: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 2d8: iload 6
// 2da: iload 7
// 2dc: iload 8
// 2de: i2s
// 2df: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 2e2: getstatic su/catlean/_s.OUT_BACK Lsu/catlean/_s;
// 2e5: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 2e8: aload 1
// 2e9: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 2ec: f2d
// 2ed: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 2f0: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 2f5: checkcast java/lang/Number
// 2f8: invokevirtual java/lang/Number.doubleValue ()D
// 2fb: dstore 22
// 2fd: aload 1
// 2fe: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 301: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 304: dload 22
// 306: d2f
// 307: ldc -360.0
// 309: fmul
// 30a: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 30f: checkcast org/joml/Quaternionfc
// 312: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 315: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 318: aload 1
// 319: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 31c: lload 15
// 31e: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 321: aload 21
// 323: ifnull 767
// 326: aload 1
// 327: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 32a: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 32d: ldc 3.1415927
// 32f: fmul
// 330: f2d
// 331: invokestatic java/lang/Math.sin (D)D
// 334: d2f
// 335: fstore 22
// 337: aload 0
// 338: aload 1
// 339: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 33c: lload 9
// 33e: dup2_x1
// 33f: pop2
// 340: iload 11
// 342: i2s
// 343: swap
// 344: aload 1
// 345: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 348: fconst_0
// 349: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 34c: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 34f: aload 1
// 350: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 353: iload 6
// 355: iload 7
// 357: iload 8
// 359: i2s
// 35a: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 35d: aload 1
// 35e: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 361: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 364: ldc 50.0
// 366: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 36b: checkcast org/joml/Quaternionfc
// 36e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 371: aload 1
// 372: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 375: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 378: ldc -30.0
// 37a: fconst_1
// 37b: fload 22
// 37d: fsub
// 37e: fmul
// 37f: ldc 30.0
// 381: fsub
// 382: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 387: checkcast org/joml/Quaternionfc
// 38a: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 38d: aload 1
// 38e: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 391: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 394: ldc 110.0
// 396: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 39b: checkcast org/joml/Quaternionfc
// 39e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 3a1: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 3a4: aload 1
// 3a5: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 3a8: lload 15
// 3aa: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 3ad: aload 21
// 3af: ifnull 767
// 3b2: aload 1
// 3b3: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 3b6: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 3b9: ldc 3.1415927
// 3bb: fmul
// 3bc: f2d
// 3bd: invokestatic java/lang/Math.sin (D)D
// 3c0: d2f
// 3c1: fstore 22
// 3c3: aload 1
// 3c4: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 3c7: dconst_0
// 3c8: dconst_0
// 3c9: dconst_0
// 3ca: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 3cd: aload 0
// 3ce: aload 1
// 3cf: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 3d2: lload 9
// 3d4: dup2_x1
// 3d5: pop2
// 3d6: iload 11
// 3d8: i2s
// 3d9: swap
// 3da: aload 1
// 3db: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 3de: fconst_0
// 3df: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 3e2: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 3e5: aload 1
// 3e6: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 3e9: iload 6
// 3eb: iload 7
// 3ed: iload 8
// 3ef: i2s
// 3f0: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 3f3: aload 1
// 3f4: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 3f7: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 3fa: ldc 50.0
// 3fc: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 401: checkcast org/joml/Quaternionfc
// 404: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 407: aload 1
// 408: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 40b: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 40e: ldc -60.0
// 410: fload 22
// 412: fmul
// 413: sipush 3103
// 416: ldc2_w 8133107250741101295
// 419: lload 2
// 41a: lxor
// 41b: invokedynamic g (IJ)I bsm=su/catlean/k5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 420: i2f
// 421: fsub
// 422: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 427: checkcast org/joml/Quaternionfc
// 42a: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 42d: aload 1
// 42e: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 431: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 434: ldc 110.0
// 436: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 43b: checkcast org/joml/Quaternionfc
// 43e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 441: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 444: aload 1
// 445: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 448: lload 15
// 44a: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 44d: aload 21
// 44f: ifnull 767
// 452: aload 1
// 453: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 456: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 459: ldc 3.1415927
// 45b: fmul
// 45c: f2d
// 45d: invokestatic java/lang/Math.sin (D)D
// 460: d2f
// 461: fstore 22
// 463: aload 0
// 464: aload 1
// 465: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 468: lload 9
// 46a: dup2_x1
// 46b: pop2
// 46c: iload 11
// 46e: i2s
// 46f: swap
// 470: aload 1
// 471: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 474: fconst_0
// 475: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 478: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 47b: aload 1
// 47c: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 47f: iload 6
// 481: iload 7
// 483: iload 8
// 485: i2s
// 486: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 489: aload 1
// 48a: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 48d: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 490: ldc 50.0
// 492: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 497: checkcast org/joml/Quaternionfc
// 49a: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 49d: aload 1
// 49e: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 4a1: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 4a4: ldc -60.0
// 4a6: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 4ab: checkcast org/joml/Quaternionfc
// 4ae: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 4b1: aload 1
// 4b2: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 4b5: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 4b8: ldc 110.0
// 4ba: ldc 20.0
// 4bc: fload 22
// 4be: fmul
// 4bf: fadd
// 4c0: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 4c5: checkcast org/joml/Quaternionfc
// 4c8: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 4cb: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 4ce: aload 1
// 4cf: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 4d2: lload 15
// 4d4: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 4d7: aload 21
// 4d9: ifnull 767
// 4dc: aload 1
// 4dd: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 4e0: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 4e3: ldc 3.1415927
// 4e5: fmul
// 4e6: f2d
// 4e7: invokestatic java/lang/Math.sin (D)D
// 4ea: d2f
// 4eb: fstore 22
// 4ed: aload 0
// 4ee: aload 1
// 4ef: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 4f2: lload 9
// 4f4: dup2_x1
// 4f5: pop2
// 4f6: iload 11
// 4f8: i2s
// 4f9: swap
// 4fa: aload 1
// 4fb: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 4fe: fconst_0
// 4ff: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 502: aload 1
// 503: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 506: dconst_0
// 507: dconst_0
// 508: fload 22
// 50a: fneg
// 50b: f2d
// 50c: ldc2_w 4.0
// 50f: ddiv
// 510: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 513: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 516: aload 1
// 517: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 51a: iload 6
// 51c: iload 7
// 51e: iload 8
// 520: i2s
// 521: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 524: aload 1
// 525: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 528: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 52b: ldc -120.0
// 52d: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 532: checkcast org/joml/Quaternionfc
// 535: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 538: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 53b: aload 1
// 53c: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 53f: lload 15
// 541: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 544: aload 21
// 546: ifnull 767
// 549: aload 1
// 54a: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 54d: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 550: ldc 3.1415927
// 552: fmul
// 553: f2d
// 554: invokestatic java/lang/Math.sin (D)D
// 557: d2f
// 558: fstore 22
// 55a: aload 0
// 55b: aload 1
// 55c: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 55f: lload 9
// 561: dup2_x1
// 562: pop2
// 563: iload 11
// 565: i2s
// 566: swap
// 567: aload 1
// 568: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 56b: fconst_0
// 56c: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 56f: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 572: aload 1
// 573: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 576: iload 6
// 578: iload 7
// 57a: iload 8
// 57c: i2s
// 57d: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 580: aload 1
// 581: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 584: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 587: aload 1
// 588: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 58b: ldc 3.0
// 58d: fmul
// 58e: f2d
// 58f: invokestatic java/lang/Math.sin (D)D
// 592: d2f
// 593: fneg
// 594: ldc 60.0
// 596: fmul
// 597: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 59c: checkcast org/joml/Quaternionfc
// 59f: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 5a2: aload 1
// 5a3: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 5a6: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 5a9: ldc -60.0
// 5ab: fload 22
// 5ad: fmul
// 5ae: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 5b3: checkcast org/joml/Quaternionfc
// 5b6: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 5b9: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 5bc: aload 1
// 5bd: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 5c0: lload 15
// 5c2: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 5c5: aload 21
// 5c7: ifnull 767
// 5ca: aload 1
// 5cb: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 5ce: fconst_0
// 5cf: aload 21
// 5d1: ifnonnull 707
// 5d4: goto 5e1
// 5d7: ldc2_w -2152145286249135676
// 5da: lload 2
// 5db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e0: athrow
// 5e1: fcmpl
// 5e2: ifle 6e9
// 5e5: goto 5f2
// 5e8: ldc2_w -2152145286249135676
// 5eb: lload 2
// 5ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f1: athrow
// 5f2: aload 1
// 5f3: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 5f6: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 5f9: ldc 3.1415927
// 5fb: fmul
// 5fc: f2d
// 5fd: invokestatic java/lang/Math.sin (D)D
// 600: d2f
// 601: fstore 22
// 603: aload 1
// 604: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 607: ldc 0.56
// 609: getstatic su/catlean/k5.m F
// 60c: ldc -0.2
// 60e: fmul
// 60f: ldc 0.5
// 611: fsub
// 612: ldc -0.7
// 614: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 617: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 61a: aload 1
// 61b: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 61e: iload 6
// 620: iload 7
// 622: iload 8
// 624: i2s
// 625: invokevirtual su/catlean/k9.w (Lnet/minecraft/class_4587;IIS)V
// 628: aload 1
// 629: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 62c: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 62f: ldc 45.0
// 631: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 636: checkcast org/joml/Quaternionfc
// 639: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 63c: aload 1
// 63d: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 640: aload 21
// 642: ifnonnull 6bb
// 645: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 648: fload 22
// 64a: ldc -85.0
// 64c: fmul
// 64d: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 652: checkcast org/joml/Quaternionfc
// 655: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 658: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 65b: lload 19
// 65d: invokevirtual su/catlean/k9.f (J)Z
// 660: ifeq 6aa
// 663: goto 670
// 666: ldc2_w -2152145286249135676
// 669: lload 2
// 66a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66f: athrow
// 670: aload 1
// 671: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 674: ldc -0.1
// 676: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 679: lload 4
// 67b: invokevirtual su/catlean/k9.h (J)F
// 67e: fmul
// 67f: ldc 0.28
// 681: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 684: lload 4
// 686: invokevirtual su/catlean/k9.h (J)F
// 689: fmul
// 68a: ldc 0.2
// 68c: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 68f: lload 4
// 691: invokevirtual su/catlean/k9.h (J)F
// 694: fmul
// 695: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 698: aload 21
// 69a: ifnull 6c4
// 69d: goto 6aa
// 6a0: ldc2_w -2152145286249135676
// 6a3: lload 2
// 6a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a9: athrow
// 6aa: aload 1
// 6ab: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 6ae: goto 6bb
// 6b1: ldc2_w -2152145286249135676
// 6b4: lload 2
// 6b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ba: athrow
// 6bb: ldc -0.1
// 6bd: ldc 0.28
// 6bf: ldc 0.2
// 6c1: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 6c4: aload 1
// 6c5: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 6c8: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 6cb: ldc -85.0
// 6cd: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 6d2: checkcast org/joml/Quaternionfc
// 6d5: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 6d8: getstatic su/catlean/k9.K Lsu/catlean/k9;
// 6db: aload 1
// 6dc: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 6df: lload 15
// 6e1: invokevirtual su/catlean/k9.Q (Lnet/minecraft/class_4587;J)V
// 6e4: aload 21
// 6e6: ifnull 767
// 6e9: ldc -0.4
// 6eb: aload 1
// 6ec: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 6ef: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 6f2: ldc 3.1415927
// 6f4: fmul
// 6f5: f2d
// 6f6: invokestatic java/lang/Math.sin (D)D
// 6f9: d2f
// 6fa: goto 707
// 6fd: ldc2_w -2152145286249135676
// 700: lload 2
// 701: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 706: athrow
// 707: fmul
// 708: fstore 22
// 70a: ldc 0.2
// 70c: aload 1
// 70d: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 710: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 713: ldc 6.2831855
// 715: fmul
// 716: f2d
// 717: invokestatic java/lang/Math.sin (D)D
// 71a: d2f
// 71b: fmul
// 71c: fstore 23
// 71e: ldc -0.2
// 720: aload 1
// 721: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 724: ldc 3.1415927
// 726: fmul
// 727: f2d
// 728: invokestatic java/lang/Math.sin (D)D
// 72b: d2f
// 72c: fmul
// 72d: fstore 24
// 72f: aload 1
// 730: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 733: fload 22
// 735: fload 23
// 737: fload 24
// 739: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 73c: aload 0
// 73d: aload 1
// 73e: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 741: lload 9
// 743: dup2_x1
// 744: pop2
// 745: iload 11
// 747: i2s
// 748: swap
// 749: aload 1
// 74a: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 74d: getstatic su/catlean/k5.m F
// 750: invokespecial su/catlean/k5.k (JSLnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V
// 753: aload 0
// 754: aload 1
// 755: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getMatrices ()Lnet/minecraft/class_4587;
// 758: aload 1
// 759: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getArm ()Lnet/minecraft/class_1306;
// 75c: lload 17
// 75e: dup2_x1
// 75f: pop2
// 760: aload 1
// 761: invokevirtual su/catlean/api/event/events/render/SwingArmEvent.getSwingProgress ()F
// 764: invokespecial su/catlean/k5.j (Lnet/minecraft/class_4587;JLnet/minecraft/class_1306;F)V
// 767: return
}

private final void j(class_4587 var1, long var2, class_1306 var4, float var5) {
var2 = b ^ var2;

byte var10000;
label17: {
try {
if (var4 == class_1306.field_6183) {
var10000 = 1;
break label17;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 1083466458890579183L, var2);
}

var10000 = -1;
}

byte var6 = var10000;
float var7 = (float)Math.sin(var5 * var5 * (float) Math.PI);
var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(var6 * (45.0F + var7 * -20.0F)));
float var8 = (float)Math.sin(class_3532.method_15355(var5) * (float) Math.PI);
var1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(var6 * var8 * -20.0F));
var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var8 * -80.0F));
var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(var6 * -45.0F));
}

private final void k(long var1, short var3, class_4587 var4, class_1306 var5, float var6) {
long var7 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;

class_4587 var10000;
byte var10001;
label17: {
try {
var10000 = var4;
if (var5 == class_1306.field_6183) {
var10001 = 1;
break label17;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 659893213884721870L, var7);
}

var10001 = -1;
}

var10000.method_46416(var10001 * 0.56F, -0.52F + var6 * -0.6F, -0.72F);
}

static {
long var20 = b ^ 22229908249825L;
long var22 = var20 ^ 94505441782480L;
long var24 = var20 ^ 53363731256624L;
long var26 = var20 ^ 103709093356258L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "§n+¥¢\u008aJ\u0097ª=\u008a\u009b\u0090ü\rkñd²\u0003þ´Êî\u0013\u0003å>Åe\u0003·Í¨Í\u0000\u0085ºu\u009c\u0018Viì¸®:åkIà\u0003½39È\u007fÇô\u001e\u0096ßb\nè8}|\u0084pÓU11^Õ\u0080c\u0015(NÊ\u0091Y\u009e\u001f~r\u001f×*iÀ®ÉÌF\u009fx\báf^üµ¬\u0011\u0088F.@¬º®§C\u0096r\u001f1ÍM\u0010\u009eb\u0080I\r`$G½å\u001aÆëýïY\u0010\u0006®\u0080*;uß\u0006\u0018 ¹]\u009cCÚ\u0091";
int var17 = "§n+¥¢\u008aJ\u0097ª=\u008a\u009b\u0090ü\rkñd²\u0003þ´Êî\u0013\u0003å>Åe\u0003·Í¨Í\u0000\u0085ºu\u009c\u0018Viì¸®:åkIà\u0003½39È\u007fÇô\u001e\u0096ßb\nè8}|\u0084pÓU11^Õ\u0080c\u0015(NÊ\u0091Y\u009e\u001f~r\u001f×*iÀ®ÉÌF\u009fx\báf^üµ¬\u0011\u0088F.@¬º®§C\u0096r\u001f1ÍM\u0010\u009eb\u0080I\r`$G½å\u001aÆëýïY\u0010\u0006®\u0080*;uß\u0006\u0018 ¹]\u009cCÚ\u0091"
.length();
char var14 = '(';
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
c = var18;
d = new String[7];
h = new HashMap(13);
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
String var4 = "\u001f5£\u0086ä\u009dÕ@\u008b-~\u0005 \u008a\u007f\u001bqÆ84Üþ\"8";
int var5 = "\u001f5£\u0086ä\u009dÕ@\u008b-~\u0005 \u008a\u007f\u001bqÆ84Üþ\"8".length();
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
f = var6;
g = new Integer[5];
KProperty[] var28 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k5.class, b<"k">(16965, 5787814374222187890L ^ var20), b<"k">(20842, 7682113501774995034L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k5.class, b<"k">(30542, 3263458332546300026L ^ var20), b<"k">(22778, 7674781969425160137L ^ var20), 0)
)
};
a = var28;
A = new k5(var22);
L = yp.L(A, b<"k">(1429, 3025482323984616100L ^ var20), df.Default, null, null, c<"g">(18928, 4567419144789260849L ^ var20), null, var26);
V = yp.L(
A,
b<"k">(30789, 4790943854572992371L ^ var20),
c<"g">(32652, 5353005971443436622L ^ var20),
new IntRange(0, c<"g">(10393, 6028924184971483993L ^ var20)),
var24,
null,
null,
c<"g">(25155, 695831303132729733L ^ var20),
null
);
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u00ad`xzr;Ò¢\u0006ÀfÌµÔçÄ";
var5 = "\u00ad`xzr;Ò¢\u0006ÀfÌµÔçÄ".length();
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

var15 = "#Ó.k.\u008e¾\u0004Üø:\u000b|\u0012Ío\u0010gá_\u0002\u008b\u00991¾Ù,¼Þ\u0091×\u008f%";
var17 = "#Ó.k.\u008e¾\u0004Üø:\u000b|\u0012Ío\u0010gá_\u0002\u008b\u00991¾Ù,¼Þ\u0091×\u008f%".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4534;
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
throw new RuntimeException("su/catlean/k5", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
throw new RuntimeException("su/catlean/k5" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11590;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/k5", var14);
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
throw new RuntimeException("su/catlean/k5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
