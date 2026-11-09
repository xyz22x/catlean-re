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
import org.jetbrains.annotations.NotNull;

public final class t7 extends tt {
@NotNull
public static final t7 t;
private static int k;
private static final long a = yz.a(1748851076827362995L, -4955903871362037333L, MethodHandles.lookup().lookupClass()).a(278719522543346L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private t7(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 85316087876395L;
int var3 = (int)((var1 ^ 85316087876395L) >>> 48);
int var4 = (int)((var1 ^ 85316087876395L) << 16 >>> 32);
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
// 002: ldc2_w 74965760972846
// 005: lxor
// 006: dup2
// 007: bipush 56
// 009: lushr
// 00a: l2i
// 00b: istore 6
// 00d: dup2
// 00e: bipush 8
// 010: lshl
// 011: bipush 8
// 013: lushr
// 014: lstore 7
// 016: pop2
// 017: dup2
// 018: ldc2_w 76083599961676
// 01b: lxor
// 01c: lstore 9
// 01e: dup2
// 01f: ldc2_w 38753063586444
// 022: lxor
// 023: lstore 11
// 025: dup2
// 026: ldc2_w 42077792783538
// 029: lxor
// 02a: lstore 13
// 02c: dup2
// 02d: ldc2_w 43306842265647
// 030: lxor
// 031: lstore 15
// 033: pop2
// 034: aload 1
// 035: sipush 23646
// 038: ldc2_w 6236576327782737717
// 03b: lload 2
// 03c: lxor
// 03d: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/t7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 045: ldc2_w -3889368070291334691
// 048: lload 2
// 049: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: aload 4
// 050: sipush 20393
// 053: ldc2_w 2161503678661178563
// 056: lload 2
// 057: lxor
// 058: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/t7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 060: astore 17
// 062: iload 5
// 064: aload 17
// 066: ifnonnull 0c6
// 069: ifeq 0b6
// 06c: goto 079
// 06f: ldc2_w -3879437436999827767
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: getstatic su/catlean/um.E Lsu/catlean/um;
// 07c: lload 13
// 07e: invokevirtual su/catlean/um.BN (J)Z
// 081: aload 17
// 083: ifnonnull 0a4
// 086: goto 093
// 089: ldc2_w -3879437436999827767
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: ifeq 0a7
// 096: goto 0a3
// 099: ldc2_w -3879437436999827767
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: bipush 1
// 0a4: goto 0a8
// 0a7: bipush 4
// 0a8: lload 2
// 0a9: lconst_0
// 0aa: lcmp
// 0ab: ifle 0b9
// 0ae: putstatic su/catlean/t7.k I
// 0b1: aload 17
// 0b3: ifnull 0e7
// 0b6: getstatic su/catlean/t7.k I
// 0b9: goto 0c6
// 0bc: ldc2_w -3879437436999827767
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 17
// 0c8: ifnonnull 0de
// 0cb: ifle 0e7
// 0ce: goto 0db
// 0d1: ldc2_w -3879437436999827767
// 0d4: lload 2
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: getstatic su/catlean/t7.k I
// 0de: istore 18
// 0e0: iload 18
// 0e2: bipush -1
// 0e3: iadd
// 0e4: putstatic su/catlean/t7.k I
// 0e7: aload 0
// 0e8: lload 9
// 0ea: aload 1
// 0eb: invokevirtual su/catlean/t7.B (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0ee: astore 18
// 0f0: aload 18
// 0f2: getfield net/minecraft/class_243.field_1350 D
// 0f5: lload 15
// 0f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fa: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0fd: dsub
// 0fe: aload 18
// 100: getfield net/minecraft/class_243.field_1352 D
// 103: lload 15
// 105: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 108: invokevirtual net/minecraft/class_746.method_23317 ()D
// 10b: dsub
// 10c: invokestatic java/lang/Math.atan2 (DD)D
// 10f: invokestatic java/lang/Math.toDegrees (D)D
// 112: sipush 8863
// 115: ldc2_w 4572699178338818931
// 118: lload 2
// 119: lxor
// 11a: invokedynamic n (IJ)I bsm=su/catlean/t7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: i2d
// 120: dsub
// 121: aload 4
// 123: invokevirtual su/catlean/_w.q ()F
// 126: f2d
// 127: dsub
// 128: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 12b: dstore 19
// 12d: aload 18
// 12f: getfield net/minecraft/class_243.field_1351 D
// 132: getstatic su/catlean/um.E Lsu/catlean/um;
// 135: lload 15
// 137: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13a: iload 6
// 13c: i2b
// 13d: swap
// 13e: lload 7
// 140: dup2_x1
// 141: pop2
// 142: checkcast net/minecraft/class_1297
// 145: invokevirtual su/catlean/um.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 148: getfield net/minecraft/class_243.field_1351 D
// 14b: lload 15
// 14d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 150: lload 15
// 152: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 155: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 158: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 15b: f2d
// 15c: dadd
// 15d: dsub
// 15e: aload 18
// 160: getfield net/minecraft/class_243.field_1352 D
// 163: lload 15
// 165: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 168: invokevirtual net/minecraft/class_746.method_23317 ()D
// 16b: dsub
// 16c: aload 18
// 16e: getfield net/minecraft/class_243.field_1350 D
// 171: lload 15
// 173: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 176: invokevirtual net/minecraft/class_746.method_23321 ()D
// 179: dsub
// 17a: invokestatic java/lang/Math.hypot (DD)D
// 17d: invokestatic java/lang/Math.atan2 (DD)D
// 180: invokestatic java/lang/Math.toDegrees (D)D
// 183: dneg
// 184: aload 4
// 186: invokevirtual su/catlean/_w.N ()F
// 189: f2d
// 18a: dsub
// 18b: dstore 21
// 18d: lload 15
// 18f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 192: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 195: ifne 1b4
// 198: dload 19
// 19a: ldc2_w 1.5
// 19d: ddiv
// 19e: invokestatic java/lang/Math.abs (D)D
// 1a1: ldc2_w 35.0
// 1a4: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (DD)D
// 1a7: goto 1b7
// 1aa: ldc2_w -3879437436999827767
// 1ad: lload 2
// 1ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: athrow
// 1b4: ldc2_w 180.0
// 1b7: dstore 23
// 1b9: lload 15
// 1bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1be: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1c1: ifne 229
// 1c4: dload 21
// 1c6: invokestatic java/lang/Math.abs (D)D
// 1c9: ldc2_w 15.0
// 1cc: dsub
// 1cd: dconst_0
// 1ce: invokestatic java/lang/Math.max (DD)D
// 1d1: ldc2_w 2.0
// 1d4: aload 17
// 1d6: ifnonnull 221
// 1d9: goto 1e6
// 1dc: ldc2_w -3879437436999827767
// 1df: lload 2
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: ddiv
// 1e7: lload 15
// 1e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ec: getfield net/minecraft/class_746.field_6012 I
// 1ef: sipush 3699
// 1f2: ldc2_w 1302714048675887006
// 1f5: lload 2
// 1f6: lxor
// 1f7: invokedynamic n (IJ)I bsm=su/catlean/t7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: irem
// 1fd: ifne 224
// 200: goto 20d
// 203: ldc2_w -3879437436999827767
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: ldc2_w 2.0
// 210: invokestatic java/lang/Math.random ()D
// 213: dmul
// 214: goto 221
// 217: ldc2_w -3879437436999827767
// 21a: lload 2
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: goto 225
// 224: dconst_0
// 225: dadd
// 226: goto 22c
// 229: ldc2_w 90.0
// 22c: dstore 25
// 22e: aload 4
// 230: invokevirtual su/catlean/_w.q ()F
// 233: f2d
// 234: dload 19
// 236: dload 23
// 238: dneg
// 239: dload 23
// 23b: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 23e: dadd
// 23f: dstore 27
// 241: aload 4
// 243: invokevirtual su/catlean/_w.N ()F
// 246: f2d
// 247: dload 21
// 249: dload 25
// 24b: dneg
// 24c: dload 25
// 24e: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 251: dadd
// 252: dload 19
// 254: invokestatic java/lang/Math.sin (D)D
// 257: dadd
// 258: dstore 29
// 25a: getstatic su/catlean/t7.k I
// 25d: ifle 28e
// 260: new su/catlean/_w
// 263: dup
// 264: dload 27
// 266: d2f
// 267: dload 29
// 269: d2f
// 26a: lload 11
// 26c: dup2_x1
// 26d: pop2
// 26e: bipush 0
// 26f: aconst_null
// 270: sipush 8044
// 273: ldc2_w 1387285739045594754
// 276: lload 2
// 277: lxor
// 278: invokedynamic n (IJ)I bsm=su/catlean/t7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: aconst_null
// 27e: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 281: goto 2b9
// 284: ldc2_w -3879437436999827767
// 287: lload 2
// 288: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: athrow
// 28e: new su/catlean/_w
// 291: dup
// 292: lload 15
// 294: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 297: invokevirtual net/minecraft/class_746.method_36454 ()F
// 29a: lload 15
// 29c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29f: invokevirtual net/minecraft/class_746.method_36455 ()F
// 2a2: lload 11
// 2a4: dup2_x1
// 2a5: pop2
// 2a6: bipush 0
// 2a7: aconst_null
// 2a8: sipush 26752
// 2ab: ldc2_w 5177589535427252591
// 2ae: lload 2
// 2af: lxor
// 2b0: invokedynamic n (IJ)I bsm=su/catlean/t7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: aconst_null
// 2b6: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 2b9: areturn
}

@Override
public boolean i() {
return false;
}

static {
long var20 = a ^ 107873652934663L;
long var22 = var20 ^ 125147109180852L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[2];
int var16 = 0;
String var15 = "í|ç\u0093\u0095w\u007f®w\u0087EDÏ\u000bñð YU!ãAME\u001fjfÔ\u0017$Ð\u009c\u0093vú\u008av\u0003y!â\u0010j\u0007Üö¯\u008dc";
int var17 = "í|ç\u0093\u0095w\u007f®w\u0087EDÏ\u000bñð YU!ãAME\u001fjfÔ\u0017$Ð\u009c\u0093vú\u008av\u0003y!â\u0010j\u0007Üö¯\u008dc".length();
char var14 = 16;
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var32 = b(var19).intern();
int var10001 = -1;
var18[var16++] = var32;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[2];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "ÊËtd\b<Hå!°\u0012j@K\u000bó";
int var5 = "ÊËtd\b<Hå!°\u0012j@K\u000bó".length();
byte var2 = 0;

label32:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var27 = var6;
var10001 = var3++;
long var35 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var38 = -1;

while (true) {
long var8 = var35;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var40 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var38) {
case 0:
var27[var10001] = var40;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
t = new t7(var22);
return;
}
break;
default:
var27[var10001] = var40;
if (var2 < var5) {
continue label32;
}

var4 = "\u0010OHÏÖ\u00163MZê\nG\u0000Å1\u000b";
var5 = "\u0010OHÏÖ\u00163MZê\nG\u0000Å1\u000b".length();
var2 = 0;
}

byte var31 = var2;
var2 += 8;
var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
var27 = var6;
var10001 = var3++;
var35 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var38 = 0;
}
}
}

var14 = var15.charAt(var13);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12331;
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
throw new RuntimeException("su/catlean/t7", var10);
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
throw new RuntimeException("su/catlean/t7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29359;
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
throw new RuntimeException("su/catlean/t7", var14);
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
throw new RuntimeException("su/catlean/t7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
