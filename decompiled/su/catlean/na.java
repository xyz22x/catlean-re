package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class na implements b4 {
@NotNull
public static final na F;
private static boolean M;
private static final String a;

private na() {
}

@Override
public void Q(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: lload 2
// 006: bipush 32
// 008: lshl
// 009: bipush 32
// 00b: lushr
// 00c: lor
// 00d: lstore 4
// 00f: lload 4
// 011: dup2
// 012: ldc2_w 20745683030457
// 015: lxor
// 016: dup2
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 32
// 020: lshl
// 021: bipush 32
// 023: lushr
// 024: lstore 7
// 026: pop2
// 027: dup2
// 028: ldc2_w 16782221287606
// 02b: lxor
// 02c: lstore 9
// 02e: dup2
// 02f: ldc2_w 134691496928949
// 032: lxor
// 033: dup2
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 11
// 03a: dup2
// 03b: bipush 32
// 03d: lshl
// 03e: bipush 56
// 040: lushr
// 041: l2i
// 042: istore 12
// 044: dup2
// 045: bipush 40
// 047: lshl
// 048: bipush 40
// 04a: lushr
// 04b: l2i
// 04c: istore 13
// 04e: pop2
// 04f: pop2
// 050: ldc2_w 8223014789551767705
// 053: lload 4
// 055: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: istore 14
// 05c: lload 9
// 05e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 061: iload 14
// 063: ifeq 08d
// 066: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 069: ifeq 0b3
// 06c: goto 07a
// 06f: ldc2_w 8299492127949937854
// 072: lload 4
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: lload 9
// 07c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07f: goto 08d
// 082: ldc2_w 8299492127949937854
// 085: lload 4
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 090: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 093: lload 9
// 095: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 098: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 09b: invokevirtual net/minecraft/class_1792.method_7853 (Lnet/minecraft/class_1799;)Lnet/minecraft/class_1839;
// 09e: getstatic net/minecraft/class_1839.field_8949 Lnet/minecraft/class_1839;
// 0a1: if_acmpne 0b3
// 0a4: bipush 1
// 0a5: goto 0b4
// 0a8: ldc2_w 8299492127949937854
// 0ab: lload 4
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: bipush 0
// 0b4: putstatic su/catlean/na.M Z
// 0b7: getstatic su/catlean/na.M Z
// 0ba: ifeq 138
// 0bd: getstatic su/catlean/um.E Lsu/catlean/um;
// 0c0: iload 11
// 0c2: iload 12
// 0c4: i2b
// 0c5: iload 13
// 0c7: invokevirtual su/catlean/um.B9 (IBI)Lsu/catlean/mt;
// 0ca: getstatic su/catlean/mt.UNPRESS Lsu/catlean/mt;
// 0cd: lload 2
// 0ce: lconst_0
// 0cf: lcmp
// 0d0: iflt 115
// 0d3: iload 14
// 0d5: ifeq 115
// 0d8: goto 0e6
// 0db: ldc2_w 8299492127949937854
// 0de: lload 4
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: if_acmpeq 118
// 0e9: goto 0f7
// 0ec: ldc2_w 8299492127949937854
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: getstatic su/catlean/um.E Lsu/catlean/um;
// 0fa: iload 11
// 0fc: iload 12
// 0fe: i2b
// 0ff: iload 13
// 101: invokevirtual su/catlean/um.B9 (IBI)Lsu/catlean/mt;
// 104: getstatic su/catlean/mt.LEGIT Lsu/catlean/mt;
// 107: goto 115
// 10a: ldc2_w 8299492127949937854
// 10d: lload 4
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: if_acmpne 138
// 118: iload 6
// 11a: lload 7
// 11c: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 11f: lload 9
// 121: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 124: checkcast net/minecraft/class_1657
// 127: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
// 12a: goto 138
// 12d: ldc2_w 8299492127949937854
// 130: lload 4
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: return
}

@Override
public void P(@NotNull _w rotation, short a, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: lstore 5
// 1a: lload 5
// 1c: dup2
// 1d: ldc2_w 100624651377200
// 20: lxor
// 21: lstore 7
// 23: dup2
// 24: ldc2_w 66102524677371
// 27: lxor
// 28: dup2
// 29: bipush 32
// 2b: lushr
// 2c: l2i
// 2d: istore 9
// 2f: dup2
// 30: bipush 32
// 32: lshl
// 33: bipush 56
// 35: lushr
// 36: l2i
// 37: istore 10
// 39: dup2
// 3a: bipush 40
// 3c: lshl
// 3d: bipush 40
// 3f: lushr
// 40: l2i
// 41: istore 11
// 43: pop2
// 44: pop2
// 45: aload 1
// 46: getstatic su/catlean/na.a Ljava/lang/String;
// 49: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 4c: getstatic su/catlean/na.M Z
// 4f: ifeq 94
// 52: getstatic su/catlean/um.E Lsu/catlean/um;
// 55: iload 9
// 57: iload 10
// 59: i2b
// 5a: iload 11
// 5c: invokevirtual su/catlean/um.B9 (IBI)Lsu/catlean/mt;
// 5f: getstatic su/catlean/mt.UNPRESS Lsu/catlean/mt;
// 62: if_acmpne 94
// 65: goto 73
// 68: ldc2_w -2782100315421280528
// 6b: lload 5
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 76: aload 1
// 77: invokevirtual su/catlean/_w.q ()F
// 7a: aload 1
// 7b: invokevirtual su/catlean/_w.N ()F
// 7e: lload 7
// 80: dup2_x1
// 81: pop2
// 82: invokestatic su/catlean/ag.x (Lnet/minecraft/class_1268;FJF)Lnet/minecraft/class_1269;
// 85: pop
// 86: goto 94
// 89: ldc2_w -2782100315421280528
// 8c: lload 5
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: return
}

@Override
public void n(long var1) {
}

static {
long var0 = yz.a(202333040935328619L, 652114779646073318L, MethodHandles.lookup().lookupClass()).a(257937556679860L) ^ 12462863488478L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("w\bBk2¹´\u0095×Q8U¢hcÐ".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
a = var5;
F = new na();
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String a(byte[] var0) {
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
}
