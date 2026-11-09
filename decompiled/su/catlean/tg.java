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
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class tg extends tt {
@NotNull
public static final tg i;
private static final long a = yz.a(-6514827009284199195L, 8744111123483576884L, MethodHandles.lookup().lookupClass()).a(14198924158240L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private tg(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 105249691449733L;
int var3 = (int)((var1 ^ 105249691449733L) >>> 48);
int var4 = (int)((var1 ^ 105249691449733L) << 16 >>> 32);
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
// 009: ldc2_w 76083599961676
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 68997309831326
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 38753063586444
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 60568097754263
// 021: lxor
// 022: dup2
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 14
// 029: dup2
// 02a: bipush 32
// 02c: lshl
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 15
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 16
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 31852927257017
// 042: lxor
// 043: lstore 17
// 045: dup2
// 046: ldc2_w 36353052440722
// 049: lxor
// 04a: lstore 19
// 04c: dup2
// 04d: ldc2_w 43306842265647
// 050: lxor
// 051: lstore 21
// 053: pop2
// 054: ldc2_w -3889368070291334691
// 057: lload 2
// 058: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: aload 1
// 05e: sipush 20226
// 061: ldc2_w 2372008915287987669
// 064: lload 2
// 065: lxor
// 066: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/tg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06e: astore 23
// 070: aload 4
// 072: sipush 8479
// 075: ldc2_w 2789336405367077835
// 078: lload 2
// 079: lxor
// 07a: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/tg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 082: aload 0
// 083: lload 8
// 085: aload 1
// 086: invokevirtual su/catlean/tg.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 089: astore 24
// 08b: aload 24
// 08d: getfield net/minecraft/class_243.field_1350 D
// 090: lload 21
// 092: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 095: invokevirtual net/minecraft/class_746.method_23321 ()D
// 098: dsub
// 099: aload 24
// 09b: getfield net/minecraft/class_243.field_1352 D
// 09e: lload 21
// 0a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a3: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0a6: dsub
// 0a7: invokestatic java/lang/Math.atan2 (DD)D
// 0aa: invokestatic java/lang/Math.toDegrees (D)D
// 0ad: ldc 90.0
// 0af: f2d
// 0b0: dsub
// 0b1: aload 4
// 0b3: invokevirtual su/catlean/_w.q ()F
// 0b6: f2d
// 0b7: dsub
// 0b8: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 0bb: dstore 25
// 0bd: aload 24
// 0bf: getfield net/minecraft/class_243.field_1351 D
// 0c2: lload 21
// 0c4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c7: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0ca: getfield net/minecraft/class_243.field_1351 D
// 0cd: dsub
// 0ce: aload 24
// 0d0: getfield net/minecraft/class_243.field_1352 D
// 0d3: lload 21
// 0d5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d8: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0db: dsub
// 0dc: aload 24
// 0de: getfield net/minecraft/class_243.field_1350 D
// 0e1: lload 21
// 0e3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e6: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0e9: dsub
// 0ea: invokestatic java/lang/Math.hypot (DD)D
// 0ed: invokestatic java/lang/Math.atan2 (DD)D
// 0f0: invokestatic java/lang/Math.toDegrees (D)D
// 0f3: dneg
// 0f4: aload 4
// 0f6: invokevirtual su/catlean/_w.N ()F
// 0f9: f2d
// 0fa: dsub
// 0fb: dstore 27
// 0fd: aload 4
// 0ff: invokevirtual su/catlean/_w.q ()F
// 102: dload 25
// 104: d2f
// 105: fadd
// 106: fstore 29
// 108: aload 4
// 10a: invokevirtual su/catlean/_w.N ()F
// 10d: dload 27
// 10f: d2f
// 110: fadd
// 111: dload 25
// 113: invokestatic java/lang/Math.sin (D)D
// 116: d2f
// 117: fadd
// 118: fstore 30
// 11a: iload 5
// 11c: aload 23
// 11e: ifnonnull 14d
// 121: ifne 145
// 124: goto 131
// 127: ldc2_w -3864481985729182888
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: lload 21
// 133: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 136: invokevirtual net/minecraft/class_746.method_36454 ()F
// 139: fstore 29
// 13b: lload 21
// 13d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 140: invokevirtual net/minecraft/class_746.method_36455 ()F
// 143: fstore 30
// 145: getstatic su/catlean/um.E Lsu/catlean/um;
// 148: lload 19
// 14a: invokevirtual su/catlean/um.BL (J)Z
// 14d: ifeq 1e5
// 150: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 153: getstatic su/catlean/um.E Lsu/catlean/um;
// 156: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 159: dup
// 15a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 15d: aload 4
// 15f: getstatic su/catlean/um.E Lsu/catlean/um;
// 162: lload 10
// 164: invokevirtual su/catlean/um.P (J)F
// 167: getstatic su/catlean/um.E Lsu/catlean/um;
// 16a: iload 14
// 16c: iload 15
// 16e: i2s
// 16f: iload 16
// 171: invokevirtual su/catlean/um.G (ISI)Z
// 174: aload 23
// 176: ifnonnull 197
// 179: goto 186
// 17c: ldc2_w -3864481985729182888
// 17f: lload 2
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: ifne 19a
// 189: goto 196
// 18c: ldc2_w -3864481985729182888
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: bipush 1
// 197: goto 19b
// 19a: bipush 0
// 19b: lload 17
// 19d: invokevirtual su/catlean/gw.s (Lnet/minecraft/class_1297;Lsu/catlean/_w;FZJ)Z
// 1a0: ifeq 1e5
// 1a3: new su/catlean/_w
// 1a6: dup
// 1a7: lload 6
// 1a9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ac: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 1af: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 1b2: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 1b5: lload 6
// 1b7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ba: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 1bd: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 1c0: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 1c3: lload 12
// 1c5: dup2_x1
// 1c6: pop2
// 1c7: bipush 0
// 1c8: aconst_null
// 1c9: sipush 10154
// 1cc: ldc2_w 9128251018072274625
// 1cf: lload 2
// 1d0: lxor
// 1d1: invokedynamic y (IJ)I bsm=su/catlean/tg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: aconst_null
// 1d7: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1da: areturn
// 1db: ldc2_w -3864481985729182888
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: new su/catlean/_w
// 1e8: dup
// 1e9: fload 29
// 1eb: lload 12
// 1ed: fload 30
// 1ef: bipush 0
// 1f0: aconst_null
// 1f1: sipush 8849
// 1f4: ldc2_w 5777280570749498363
// 1f7: lload 2
// 1f8: lxor
// 1f9: invokedynamic y (IJ)I bsm=su/catlean/tg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: aconst_null
// 1ff: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 202: areturn
}

@Override
public boolean i() {
return false;
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
long var4 = ax ^ 108103236449891L;
Intrinsics.checkNotNullParameter(target, b<"n">(16796, 1350131461740442885L ^ ax));
class_238 var10000 = target.method_5829();
Intrinsics.checkNotNullExpressionValue(var10000, b<"n">(15096, 840715600669888098L ^ ax));
class_238 var6 = var10000;
return new class_243(
RangesKt.coerceIn(zf.v(var4).method_33571().field_1352, var6.field_1323, var6.field_1320),
RangesKt.coerceIn(zf.v(var4).method_33571().field_1351, var6.field_1322, var6.field_1325),
RangesKt.coerceIn(zf.v(var4).method_33571().field_1350, var6.field_1321, var6.field_1324)
);
}

static {
long var20 = a ^ 31851282139082L;
long var22 = var20 ^ 31992188041431L;
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
String var15 = "MBõÊ¶jy~\u0011yp\u001bþ\u0001\u001c\u008b\u0095&\u0093§6å¨µ8#\b\u0010\u008b\u0003\u001a;KînwD\u008bÂ\u0081\u0010 )\u0006õ&s Ö\u000f\u000fc¦Âá^`";
int var17 = "MBõÊ¶jy~\u0011yp\u001bþ\u0001\u001c\u008b\u0095&\u0093§6å¨µ8#\b\u0010\u008b\u0003\u001a;KînwD\u008bÂ\u0081\u0010 )\u0006õ&s Ö\u000f\u000fc¦Âá^`"
.length();
char var14 = '(';
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
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
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u008f(HyõI\u0096M[ì3þ\u0090Çr?";
int var5 = "\u008f(HyõI\u0096M[ì3þ\u0090Çr?".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
i = new tg(var22);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "_U=\u008a\u0006\u0085º^G\u0005ìr\u0083\u0093_5¤\u0087[ÓªsSz\u0010\u008c@¶\u0091r\u0005záNÏ=\u000bwß«w";
var17 = "_U=\u008a\u0006\u0085º^G\u0005ìr\u0083\u0093_5¤\u0087[ÓªsSz\u0010\u008c@¶\u0091r\u0005záNÏ=\u000bwß«w".length();
var14 = 24;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20886;
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
throw new RuntimeException("su/catlean/tg", var10);
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
throw new RuntimeException("su/catlean/tg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23082;
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
throw new RuntimeException("su/catlean/tg", var14);
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
throw new RuntimeException("su/catlean/tg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
