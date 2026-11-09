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
import net.minecraft.class_1268;
import net.minecraft.class_2596;
import net.minecraft.class_2879;

public final class i3 extends Thread {
private int y;
private int u;
private int J;
private boolean p;
private static int C;
private static final long a = yz.a(7571245220821462297L, -4748880409182059764L, MethodHandles.lookup().lookupClass()).a(187703699128839L);
private static final long[] b;
private static final Integer[] c;
private static final Map d = new HashMap(13);

public i3(int epSlot, int originalSlot, int delay, int a, boolean inv, long a) {
long var8 = ((long)axx << 32 | ax << 32 >>> 32) ^ a;
int var10000 = vm.a<"Å">(-4720816755052586112L, var8);
super();
int var10 = var10000;

try {
this.y = epSlot;
this.u = originalSlot;
this.J = delay;
this.p = inv;
if (vm.a<"Å">(-4721520624835518232L, var8) != null) {
vm.a<"Å">(++var10, -4693267007781537182L, var8);
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -4753447458233615246L, var8);
}
}

@Override
public void run() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/i3.a J
// 003: ldc2_w 69393603521766
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 88018783610812
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 56730976246465
// 013: lxor
// 014: lstore 5
// 016: dup2
// 017: ldc2_w 120703579254148
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 17960230590942
// 021: lxor
// 022: lstore 9
// 024: dup2
// 025: ldc2_w 64665442115733
// 028: lxor
// 029: lstore 11
// 02b: dup2
// 02c: ldc2_w 68778915344950
// 02f: lxor
// 030: lstore 13
// 032: pop2
// 033: ldc2_w -2302162462858574351
// 036: lload 1
// 037: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 03f: bipush 1
// 040: invokevirtual su/catlean/_n.m (Z)V
// 043: istore 15
// 045: aload 0
// 046: getfield su/catlean/i3.p Z
// 049: iload 15
// 04b: ifne 099
// 04e: ifne 095
// 051: goto 05e
// 054: ldc2_w -2271777960984632829
// 057: lload 1
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 061: aload 0
// 062: getfield su/catlean/i3.y I
// 065: lload 3
// 066: invokevirtual su/catlean/gg.f (IJ)V
// 069: iload 15
// 06b: ifeq 0b6
// 06e: goto 07b
// 071: ldc2_w -2271777960984632829
// 074: lload 1
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: bipush 3
// 07c: anewarray 202
// 07f: ldc2_w -2270177078195066301
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: goto 095
// 08b: ldc2_w -2271777960984632829
// 08e: lload 1
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: aload 0
// 096: getfield su/catlean/i3.y I
// 099: aload 0
// 09a: getfield su/catlean/i3.u I
// 09d: lload 7
// 09f: dup2_x1
// 0a0: pop2
// 0a1: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 0a4: bipush 0
// 0a5: sipush 2456
// 0a8: ldc2_w 3403159495133978344
// 0ab: lload 1
// 0ac: lxor
// 0ad: invokedynamic z (IJ)I bsm=su/catlean/i3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: aconst_null
// 0b3: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 0b6: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 0b9: bipush 0
// 0ba: invokevirtual su/catlean/_n.m (Z)V
// 0bd: aload 0
// 0be: getfield su/catlean/i3.J I
// 0c1: i2l
// 0c2: invokestatic java/lang/Thread.sleep (J)V
// 0c5: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 0c8: new su/catlean/tu
// 0cb: dup
// 0cc: new su/catlean/_w
// 0cf: dup
// 0d0: lload 13
// 0d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d5: invokevirtual net/minecraft/class_746.method_36454 ()F
// 0d8: lload 13
// 0da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0dd: invokevirtual net/minecraft/class_746.method_36455 ()F
// 0e0: lload 11
// 0e2: dup2_x1
// 0e3: pop2
// 0e4: bipush 0
// 0e5: aconst_null
// 0e6: sipush 12837
// 0e9: ldc2_w 470439003145299284
// 0ec: lload 1
// 0ed: lxor
// 0ee: invokedynamic z (IJ)I bsm=su/catlean/i3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: aconst_null
// 0f4: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0f7: sipush 30522
// 0fa: ldc2_w 5590779545671016520
// 0fd: lload 1
// 0fe: lxor
// 0ff: invokedynamic z (IJ)I bsm=su/catlean/i3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/i3.B ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 109: lload 5
// 10b: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;ILkotlin/jvm/functions/Function0;J)V
// 10e: checkcast su/catlean/t5
// 111: lload 9
// 113: dup2_x1
// 114: pop2
// 115: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 118: aload 0
// 119: getfield su/catlean/i3.J I
// 11c: i2l
// 11d: invokestatic java/lang/Thread.sleep (J)V
// 120: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 123: bipush 1
// 124: invokevirtual su/catlean/_n.m (Z)V
// 127: aload 0
// 128: getfield su/catlean/i3.p Z
// 12b: iload 15
// 12d: ifne 16e
// 130: ifne 15d
// 133: goto 140
// 136: ldc2_w -2271777960984632829
// 139: lload 1
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 143: aload 0
// 144: getfield su/catlean/i3.u I
// 147: lload 3
// 148: invokevirtual su/catlean/gg.f (IJ)V
// 14b: iload 15
// 14d: ifeq 18b
// 150: goto 15d
// 153: ldc2_w -2271777960984632829
// 156: lload 1
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: aload 0
// 15e: getfield su/catlean/i3.y I
// 161: goto 16e
// 164: ldc2_w -2271777960984632829
// 167: lload 1
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: aload 0
// 16f: getfield su/catlean/i3.u I
// 172: lload 7
// 174: dup2_x1
// 175: pop2
// 176: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 179: bipush 0
// 17a: sipush 3104
// 17d: ldc2_w 5947956005946612564
// 180: lload 1
// 181: lxor
// 182: invokedynamic z (IJ)I bsm=su/catlean/i3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: aconst_null
// 188: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 18b: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 18e: bipush 0
// 18f: invokevirtual su/catlean/_n.m (Z)V
// 192: aload 0
// 193: invokespecial java/lang/Thread.run ()V
// 196: return
}

private static final Unit B() {
long var0 = a ^ 15972548105923L;
long var2 = var0 ^ 8189047953561L;
long var4 = var0 ^ 16789224471638L;
ag.K(class_1268.field_5808, 0.0F, var2, 0.0F, a<"z">(17577, 1799783606263556607L ^ var0), null);
_r.a(var4, (class_2596)(new class_2879(class_1268.field_5808)));
return Unit.INSTANCE;
}

public static void n(int var0) {
C = var0;
}

public static int W() {
return C;
}

public static int U() {
int var0 = W();

try {
return var0 == 0 ? 125 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var11 = a ^ 12731612378305L;
vm.a<"Å">(50, 4073584266045324340L, var11);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "²aåÝ\u0090Û\u0094\u0015>í\u0019n \u0091vV¦r0¥\u009fô#I";
int var5 = "²aåÝ\u0090Û\u0094\u0015>í\u0019n \u0091vV¦r0¥\u009fô#I".length();
byte var2 = 0;

label23:
while (true) {
int var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var14 = var6;
var10001 = var3++;
long var17 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var19 = -1;

while (true) {
long var8 = var17;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var21 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var19) {
case 0:
var14[var10001] = var21;
if (var2 >= var5) {
b = var6;
c = new Integer[5];
return;
}
break;
default:
var14[var10001] = var21;
if (var2 < var5) {
continue label23;
}

var4 = "\u0083ï{ÊøÂ~\u0002£E\u0080»\u0007+¢ü";
var5 = "\u0083ï{ÊøÂ~\u0002£E\u0080»\u0007+¢ü".length();
var2 = 0;
}

byte var16 = var2;
var2 += 8;
var7 = var4.substring(var16, var2).getBytes("ISO-8859-1");
var14 = var6;
var10001 = var3++;
var17 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var19 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13865;
if (c[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = b[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])d.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/i3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
c[var3] = var15;
}

return c[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/i3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
