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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class th extends tt {
@NotNull
public static final th y;
private static final long a = yz.a(-3060317417336013462L, -5576961288089987184L, MethodHandles.lookup().lookupClass()).a(115319983134086L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private th(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var10001 = var4 ^ 113493943604121L;
int var6 = (int)((var4 ^ 113493943604121L) >>> 48);
int var7 = (int)((var4 ^ 113493943604121L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, (short)var8);
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
// 002: ldc2_w 33615733051039
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 76083599961676
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 38753063586444
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 43306842265647
// 01a: lxor
// 01b: lstore 12
// 01d: pop2
// 01e: aload 1
// 01f: sipush 27828
// 022: ldc2_w 4046236202019336077
// 025: lload 2
// 026: lxor
// 027: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/th.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02f: ldc2_w -3889368070291334691
// 032: lload 2
// 033: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: aload 4
// 03a: sipush 9869
// 03d: ldc2_w 8106835795574384051
// 040: lload 2
// 041: lxor
// 042: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/th.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04a: aload 0
// 04b: lload 8
// 04d: aload 1
// 04e: invokevirtual su/catlean/th.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 051: astore 15
// 053: astore 14
// 055: aload 15
// 057: getfield net/minecraft/class_243.field_1350 D
// 05a: lload 12
// 05c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05f: invokevirtual net/minecraft/class_746.method_23321 ()D
// 062: dsub
// 063: aload 15
// 065: getfield net/minecraft/class_243.field_1352 D
// 068: lload 12
// 06a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06d: invokevirtual net/minecraft/class_746.method_23317 ()D
// 070: dsub
// 071: invokestatic java/lang/Math.atan2 (DD)D
// 074: invokestatic java/lang/Math.toDegrees (D)D
// 077: sipush 12082
// 07a: ldc2_w 1304738314957897207
// 07d: lload 2
// 07e: lxor
// 07f: invokedynamic e (IJ)I bsm=su/catlean/th.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: i2d
// 085: dsub
// 086: aload 4
// 088: invokevirtual su/catlean/_w.q ()F
// 08b: f2d
// 08c: dsub
// 08d: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 090: dstore 16
// 092: aload 15
// 094: getfield net/minecraft/class_243.field_1351 D
// 097: lload 12
// 099: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09c: lload 6
// 09e: dup2_x1
// 09f: pop2
// 0a0: checkcast net/minecraft/class_1297
// 0a3: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0a6: getfield net/minecraft/class_243.field_1351 D
// 0a9: lload 12
// 0ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ae: lload 12
// 0b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b3: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 0b6: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 0b9: f2d
// 0ba: dadd
// 0bb: dsub
// 0bc: aload 15
// 0be: getfield net/minecraft/class_243.field_1352 D
// 0c1: lload 12
// 0c3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c6: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0c9: dsub
// 0ca: aload 15
// 0cc: getfield net/minecraft/class_243.field_1350 D
// 0cf: lload 12
// 0d1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d4: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0d7: dsub
// 0d8: invokestatic java/lang/Math.hypot (DD)D
// 0db: invokestatic java/lang/Math.atan2 (DD)D
// 0de: invokestatic java/lang/Math.toDegrees (D)D
// 0e1: dneg
// 0e2: aload 4
// 0e4: invokevirtual su/catlean/_w.N ()F
// 0e7: f2d
// 0e8: dsub
// 0e9: dstore 18
// 0eb: lload 12
// 0ed: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f0: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0f3: ifeq 106
// 0f6: ldc2_w 360.0
// 0f9: goto 109
// 0fc: ldc2_w -3770994404389552610
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: ldc2_w 360.0
// 109: dstore 20
// 10b: iload 5
// 10d: lload 2
// 10e: lconst_0
// 10f: lcmp
// 110: iflt 13d
// 113: aload 14
// 115: ifnonnull 13d
// 118: ifne 140
// 11b: goto 128
// 11e: ldc2_w -3770994404389552610
// 121: lload 2
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: lload 12
// 12a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12d: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 130: goto 13d
// 133: ldc2_w -3770994404389552610
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: ifeq 150
// 140: ldc2_w 180.0
// 143: goto 153
// 146: ldc2_w -3770994404389552610
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: ldc2_w 180.0
// 153: dstore 22
// 155: aload 4
// 157: invokevirtual su/catlean/_w.q ()F
// 15a: f2d
// 15b: dload 16
// 15d: dload 20
// 15f: dneg
// 160: dload 20
// 162: invokestatic java/lang/Math.clamp (DDD)D
// 165: dadd
// 166: dstore 24
// 168: aload 4
// 16a: invokevirtual su/catlean/_w.N ()F
// 16d: f2d
// 16e: dload 18
// 170: dload 22
// 172: dneg
// 173: dload 22
// 175: invokestatic java/lang/Math.clamp (DDD)D
// 178: dadd
// 179: dload 16
// 17b: invokestatic java/lang/Math.toRadians (D)D
// 17e: invokestatic java/lang/Math.sin (D)D
// 181: dadd
// 182: dstore 26
// 184: new su/catlean/_w
// 187: dup
// 188: dload 24
// 18a: d2f
// 18b: dload 26
// 18d: d2f
// 18e: lload 10
// 190: dup2_x1
// 191: pop2
// 192: bipush 0
// 193: aconst_null
// 194: sipush 24444
// 197: ldc2_w 324129772424220088
// 19a: lload 2
// 19b: lxor
// 19c: invokedynamic e (IJ)I bsm=su/catlean/th.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: aconst_null
// 1a2: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1a5: areturn
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 108103236449891
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w 2615031633354110865
// 0c: lload 1
// 0d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: aload 3
// 13: sipush 6904
// 16: ldc2_w 9174232140190463880
// 19: lload 1
// 1a: lxor
// 1b: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/th.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 23: astore 6
// 25: lload 4
// 27: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a: aload 6
// 2c: ifnonnull 63
// 2f: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 32: ifeq 62
// 35: goto 42
// 38: ldc2_w 2731144702717661266
// 3b: lload 1
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: aload 3
// 43: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 46: dup
// 47: sipush 17189
// 4a: ldc2_w 8389642401016901206
// 4d: lload 1
// 4e: lxor
// 4f: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/th.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 57: areturn
// 58: ldc2_w 2731144702717661266
// 5b: lload 1
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: aload 3
// 63: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 66: dup
// 67: sipush 21582
// 6a: ldc2_w 18365746056788287
// 6d: lload 1
// 6e: lxor
// 6f: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/th.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 77: astore 7
// 79: new net/minecraft/class_243
// 7c: dup
// 7d: lload 4
// 7f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 82: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 85: getfield net/minecraft/class_243.field_1352 D
// 88: aload 7
// 8a: getfield net/minecraft/class_238.field_1323 D
// 8d: aload 7
// 8f: getfield net/minecraft/class_238.field_1320 D
// 92: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 95: lload 4
// 97: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9a: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 9d: getfield net/minecraft/class_243.field_1351 D
// a0: aload 7
// a2: getfield net/minecraft/class_238.field_1322 D
// a5: aload 7
// a7: getfield net/minecraft/class_238.field_1325 D
// aa: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// ad: lload 4
// af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// b2: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// b5: getfield net/minecraft/class_243.field_1350 D
// b8: aload 7
// ba: getfield net/minecraft/class_238.field_1321 D
// bd: aload 7
// bf: getfield net/minecraft/class_238.field_1324 D
// c2: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// c5: invokespecial net/minecraft/class_243.<init> (DDD)V
// c8: areturn
}

static {
long var20 = a ^ 47209011271504L;
long var10001 = var20 ^ 21444894016081L;
int var22 = (int)((var20 ^ 21444894016081L) >>> 48);
int var23 = (int)((var20 ^ 21444894016081L) << 16 >>> 32);
int var24 = (int)(var10001 << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "¦èã\u0001»î$à S<\u001b¦j!\u001e\u009a00H®\u0017Ë©Ä«F!ÔUJ\u0015G9Ã\u0004\u008cI\u0098·\u0010ö\n\u0094óÿ\u0000\u0003ÏWX\u000e)\u0001\u0094<l(\u0084åy\u0016\u007fùazE¥!\u0084^D§Ò\u008d\u001d(\u008az¡\u000f\u008eÀ¡Ci\u0090¸ÃiË+lzM\r´ò";
int var17 = "¦èã\u0001»î$à S<\u001b¦j!\u001e\u009a00H®\u0017Ë©Ä«F!ÔUJ\u0015G9Ã\u0004\u008cI\u0098·\u0010ö\n\u0094óÿ\u0000\u0003ÏWX\u000e)\u0001\u0094<l(\u0084åy\u0016\u007fùazE¥!\u0084^D§Ò\u008d\u001d(\u008az¡\u000f\u008eÀ¡Ci\u0090¸ÃiË+lzM\r´ò"
.length();
char var14 = '(';
int var26 = -1;

label45:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
byte var30 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var37 = b(var19).intern();
switch (var30) {
case 0:
var18[var16++] = var37;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[5];
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
String var4 = "1\u0094ó>r,1?[ë\u0005ÙQa\u009f²";
int var5 = "1\u0094ó>r,1?[ë\u0005ÙQa\u009f²".length();
byte var2 = 0;

do {
byte var34 = var2;
var2 += 8;
byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
int var35 = var3++;
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
byte var42 = -1;
var6[var35] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
y = new th((char)var22, var23, var24);
return;
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var37;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label45;
}

var15 = "\u000bj\u008fËû²¼:g,á\u008c\u0090M\tôyG}C\u0094{ÛûÔ±\b\t\u0004oxß\u0010á3Ö¦¼ÅìUF\u0087È\r6Lð\u001e";
var17 = "\u000bj\u008fËû²¼:g,á\u008c\u0090M\tôyG}C\u0094{ÛûÔ±\b\t\u0004oxß\u0010á3Ö¦¼ÅìUF\u0087È\r6Lð\u001e".length();
var14 = ' ';
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var30 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2173;
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
throw new RuntimeException("su/catlean/th", var10);
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
throw new RuntimeException("su/catlean/th" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22916;
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
throw new RuntimeException("su/catlean/th", var14);
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
throw new RuntimeException("su/catlean/th" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
