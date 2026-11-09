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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1294;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.SprintEvent;
import su.catlean.gofra.Flow;

public final class uk extends _g {
@NotNull
public static final uk o;
static final KProperty[] I;
@NotNull
private static final cw d;
@NotNull
private static final ct b;
private static final long a = yz.a(-163482282287818356L, 3632263032565008146L, MethodHandles.lookup().lookupClass()).a(96955647302379L);
private static final String[] c;
private static final String[] e;
private static final Map f = new HashMap(13);

private uk(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 56859533145625L;
super(b<"k">(22937, 5369433326786174150L ^ var4), jt.V(), null, 4, null, var6);
}

private final i5 n(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 12811462193471L;
return (i5)d.E(this, var6, I[0]);
}

private final float D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 7381140412827L;
return ((Number)b.E(this, var3, I[1])).floatValue();
}

@Override
public void b(long var1) {
long var10001 = var1 ^ 77511230170736L;
int var3 = (int)((var1 ^ 77511230170736L) >>> 32);
int var4 = (int)((var1 ^ 77511230170736L) << 32 >>> 40);
int var5 = (int)(var10001 << 56 >>> 56);
long var6 = var1 ^ 29647348875563L;

try {
if (this.n(var3, var4, (byte)var5) == i5.DolphinGrace) {
zf.v(var6).method_6016(class_1294.field_5900);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 1427634614623726834L, var1);
}
}

@Flow
private final void c(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uk.a J
// 03: ldc2_w 27137776832124
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 92122112766791
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 40
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 56
// 22: lshl
// 23: bipush 56
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 16771497808924
// 2e: lxor
// 2f: lstore 7
// 31: pop2
// 32: ldc2_w -8737492101657999457
// 35: lload 2
// 36: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: astore 9
// 3d: aload 0
// 3e: iload 4
// 40: iload 5
// 42: iload 6
// 44: i2b
// 45: invokespecial su/catlean/uk.n (IIB)Lsu/catlean/i5;
// 48: getstatic su/catlean/i5.DolphinGrace Lsu/catlean/i5;
// 4b: if_acmpne a5
// 4e: lload 7
// 50: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 53: aload 9
// 55: ifnull 9e
// 58: goto 65
// 5b: ldc2_w -8720957173080032827
// 5e: lload 2
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 68: ifeq 99
// 6b: goto 78
// 6e: ldc2_w -8720957173080032827
// 71: lload 2
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: lload 7
// 7a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7d: new net/minecraft/class_1293
// 80: dup
// 81: getstatic net/minecraft/class_1294.field_5900 Lnet/minecraft/class_6880;
// 84: bipush 2
// 85: bipush 2
// 86: invokespecial net/minecraft/class_1293.<init> (Lnet/minecraft/class_6880;II)V
// 89: invokevirtual net/minecraft/class_746.method_6092 (Lnet/minecraft/class_1293;)Z
// 8c: goto a4
// 8f: ldc2_w -8720957173080032827
// 92: lload 2
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: lload 7
// 9b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9e: getstatic net/minecraft/class_1294.field_5900 Lnet/minecraft/class_6880;
// a1: invokevirtual net/minecraft/class_746.method_6016 (Lnet/minecraft/class_6880;)Z
// a4: pop
// a5: return
}

@Flow
private final void c(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uk.a J
// 03: ldc2_w 123558864668684
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 52032651092817
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 59470174068115
// 2e: lxor
// 2f: lstore 7
// 31: dup2
// 32: ldc2_w 64897266103607
// 35: lxor
// 36: dup2
// 37: bipush 32
// 39: lushr
// 3a: l2i
// 3b: istore 9
// 3d: dup2
// 3e: bipush 32
// 40: lshl
// 41: bipush 40
// 43: lushr
// 44: l2i
// 45: istore 10
// 47: dup2
// 48: bipush 56
// 4a: lshl
// 4b: bipush 56
// 4d: lushr
// 4e: l2i
// 4f: istore 11
// 51: pop2
// 52: dup2
// 53: ldc2_w 113860130099820
// 56: lxor
// 57: lstore 12
// 59: pop2
// 5a: aload 0
// 5b: iload 9
// 5d: iload 10
// 5f: iload 11
// 61: i2b
// 62: invokespecial su/catlean/uk.n (IIB)Lsu/catlean/i5;
// 65: getstatic su/catlean/i5.Vanilla Lsu/catlean/i5;
// 68: if_acmpne ac
// 6b: lload 12
// 6d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 70: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 73: ifeq ac
// 76: goto 83
// 79: ldc2_w 38429472589610933
// 7c: lload 2
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 86: iload 4
// 88: iload 5
// 8a: i2s
// 8b: aload 1
// 8c: aload 0
// 8d: lload 7
// 8f: invokespecial su/catlean/uk.D (J)F
// 92: f2d
// 93: iload 6
// 95: i2c
// 96: dup_x2
// 97: pop
// 98: invokevirtual su/catlean/dm.Y (ISLsu/catlean/api/event/events/player/MoveEvent;CD)V
// 9b: aload 1
// 9c: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 9f: goto ac
// a2: ldc2_w 38429472589610933
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: return
}

@Flow
private final void p(SprintEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uk.a J
// 003: ldc2_w 117926650109800
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 101202633673518
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 35063606494473
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
// 027: ldc2_w 35350404932179
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 40
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: dup2
// 03d: bipush 56
// 03f: lshl
// 040: bipush 56
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 139335527365551
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 34770050469974
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 137089361495304
// 059: lxor
// 05a: lstore 16
// 05c: pop2
// 05d: ldc2_w 1705248889319085707
// 060: lload 2
// 061: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: astore 18
// 068: lload 4
// 06a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06d: aload 18
// 06f: ifnull 097
// 072: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 075: ifnull 15f
// 078: goto 085
// 07b: ldc2_w 1723924583661299921
// 07e: lload 2
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: lload 4
// 087: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08a: goto 097
// 08d: ldc2_w 1723924583661299921
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 09a: ifnull 15f
// 09d: aload 0
// 09e: aload 18
// 0a0: ifnull 0d3
// 0a3: goto 0b0
// 0a6: ldc2_w 1723924583661299921
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: lload 14
// 0b2: invokevirtual su/catlean/uk.f (J)Z
// 0b5: ifeq 15f
// 0b8: goto 0c5
// 0bb: ldc2_w 1723924583661299921
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: aload 0
// 0c6: goto 0d3
// 0c9: ldc2_w 1723924583661299921
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: iload 9
// 0d5: iload 10
// 0d7: iload 11
// 0d9: i2b
// 0da: invokespecial su/catlean/uk.n (IIB)Lsu/catlean/i5;
// 0dd: getstatic su/catlean/i5.Legit Lsu/catlean/i5;
// 0e0: if_acmpne 15f
// 0e3: lload 16
// 0e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e8: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 0eb: aload 18
// 0ed: ifnull 14a
// 0f0: goto 0fd
// 0f3: ldc2_w 1723924583661299921
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: ifne 14d
// 100: goto 10d
// 103: ldc2_w 1723924583661299921
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: lload 12
// 10f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 112: aload 0
// 113: lload 16
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: iload 6
// 11a: i2b
// 11b: swap
// 11c: lload 7
// 11e: dup2_x1
// 11f: pop2
// 120: checkcast net/minecraft/class_1297
// 123: invokevirtual su/catlean/uk.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 126: dconst_0
// 127: ldc2_w -0.5
// 12a: dconst_0
// 12b: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 12e: checkcast net/minecraft/class_2374
// 131: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 134: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 137: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 13a: instanceof net/minecraft/class_2404
// 13d: goto 14a
// 140: ldc2_w 1723924583661299921
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: ifeq 15f
// 14d: aload 1
// 14e: bipush 1
// 14f: invokevirtual su/catlean/api/event/events/player/SprintEvent.setSprinting (Z)V
// 152: goto 15f
// 155: ldc2_w 1723924583661299921
// 158: lload 2
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: return
}

static {
long var20 = a ^ 118322934818787L;
long var22 = var20 ^ 83470658971248L;
long var10001 = var20 ^ 133173598585123L;
int var24 = (int)((var20 ^ 133173598585123L) >>> 48);
int var25 = (int)((var20 ^ 133173598585123L) << 16 >>> 48);
int var26 = (int)(var10001 << 32 >>> 32);
long var27 = var20 ^ 64444337230474L;
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
String var15 = "\u001c'R!\t4|ÊÂ¥MÁÀÏÎü\u0018\u0012\u009cî¸µ[V\u0086³å¶Ù|¢\u000f7/\u009b\u0019+ùX®³\u0010\u0098K$a=@ R}¦m=øç\u009b\u0002\u0010k®\u000e|}ª\u000b¿O\u000bÄ@\u0089¸~¥\u0018ÐLpc)n`\u0093ð§°\u0092\n#ø*(è\nB½þ¿\u0095";
int var17 = "\u001c'R!\t4|ÊÂ¥MÁÀÏÎü\u0018\u0012\u009cî¸µ[V\u0086³å¶Ù|¢\u000f7/\u009b\u0019+ùX®³\u0010\u0098K$a=@ R}¦m=øç\u009b\u0002\u0010k®\u000e|}ª\u000b¿O\u000bÄ@\u0089¸~¥\u0018ÐLpc)n`\u0093ð§°\u0092\n#ø*(è\nB½þ¿\u0095"
.length();
char var14 = 16;
int var31 = -1;

label47:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
byte var35 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var42 = b(var19).intern();
switch (var35) {
case 0:
var18[var16++] = var42;
if ((var31 += var14) >= var17) {
c = var18;
e = new String[7];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "\\¾¼\u00ad\u007feã~\u0016ü\fÎª\u0094\u000eµ";
int var6 = "\\¾¼\u00ad\u007feã~\u0016ü\fÎª\u0094\u000eµ".length();
byte var3 = 0;

do {
byte var39 = var3;
var3 += 8;
byte[] var7 = var5.substring(var39, var3).getBytes("ISO-8859-1");
int var40 = var4++;
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
byte var47 = -1;
var0[var40] = var10004;
} while (var3 < var6);

KProperty[] var29 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(uk.class, b<"k">(25558, 372969792452734630L ^ var20), b<"k">(18118, 8787648930660322226L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uk.class, b<"k">(22603, 8932829505380816188L ^ var20), b<"k">(13705, 3970411566811904255L ^ var20), 0))
};
I = var29;
o = new uk((char)var24, (char)var25, var26);
d = yp.L(o, b<"k">(21160, 2773586478299127769L ^ var20), i5.DolphinGrace, null, null, (int)var0[1], null, var27);
b = yp.k(o, b<"k">(24975, 1329156982200806653L ^ var20), 2.0F, var22, RangesKt.rangeTo(1.0F, 10.0F), null, null, (int)var0[0], null);
return;
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var42;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label47;
}

var15 = "\"¢zÀ¦IçËfÛ\u000f3\rÛ\nS8s\u0013C¨A\u00980\u0011ÿ:sÃõ|û\u007f·ê\u0011Ó\u0092)RØÝ\u0091\u0001ÄeÞ\\r\u0002KëV|Ç\f\u000bª/\u001e\u00055õ\u001f\u00952ëÁ#\rl\u009eþ";
var17 = "\"¢zÀ¦IçËfÛ\u000f3\rÛ\nS8s\u0013C¨A\u00980\u0011ÿ:sÃõ|û\u007f·ê\u0011Ó\u0092)RØÝ\u0091\u0001ÄeÞ\\r\u0002KëV|Ç\f\u000bª/\u001e\u00055õ\u001f\u00952ëÁ#\rl\u009eþ"
.length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var35 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9118;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/uk", var10);
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
throw new RuntimeException("su/catlean/uk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
