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
import net.minecraft.class_1293;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pi {
private final int b;
@Nullable
private final class_1293 v;
private static boolean P;
private static final long a = yz.a(-3321114622787626093L, 7166378035433596697L, MethodHandles.lookup().lookupClass()).a(155346583473214L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long f;

public pi(int slot, @Nullable class_1293 effect) {
this.b = slot;
this.v = effect;
}

public final int W() {
return this.b;
}

@Nullable
public final class_1293 X() {
return this.v;
}

public final int S() {
return this.b;
}

@Nullable
public final class_1293 p() {
return this.v;
}

@NotNull
public final pi u(int slot, @Nullable class_1293 effect) {
return new pi(slot, effect);
}

public static pi E(pi param0, int param1, class_1293 param2, int param3, short param4, Object param5, long param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 4
// 02: i2l
// 03: bipush 48
// 05: lshl
// 06: lload 6
// 08: bipush 16
// 0a: lshl
// 0b: bipush 16
// 0d: lushr
// 0e: lor
// 0f: getstatic su/catlean/pi.a J
// 12: lxor
// 13: lstore 8
// 15: ldc2_w -7368803208681432186
// 18: lload 8
// 1a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: istore 10
// 21: iload 3
// 22: bipush 1
// 23: iand
// 24: iload 10
// 26: ifeq 42
// 29: ifeq 3f
// 2c: goto 3a
// 2f: ldc2_w -7415361464017659308
// 32: lload 8
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: aload 0
// 3b: getfield su/catlean/pi.b I
// 3e: istore 1
// 3f: iload 3
// 40: bipush 2
// 41: iand
// 42: ifeq 4a
// 45: aload 0
// 46: getfield su/catlean/pi.v Lnet/minecraft/class_1293;
// 49: astore 2
// 4a: aload 0
// 4b: iload 1
// 4c: iload 4
// 4e: iflt 64
// 51: aload 2
// 52: invokevirtual su/catlean/pi.u (ILnet/minecraft/class_1293;)Lsu/catlean/pi;
// 55: ldc2_w -7350556587255363732
// 58: lload 8
// 5a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: ifnull 8f
// 62: iload 10
// 64: ifeq 84
// 67: goto 75
// 6a: ldc2_w -7415361464017659308
// 6d: lload 8
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: bipush 0
// 76: goto 85
// 79: ldc2_w -7415361464017659308
// 7c: lload 8
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: bipush 1
// 85: ldc2_w -7385765071219038214
// 88: lload 8
// 8a: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 20484286340701L;
int var10000 = this.b;
class_1293 var10001 = this.v;
return a<"j">(28477, 3607406429559847372L ^ var1) + var10000 + a<"j">(18015, 6577943229924495535L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pi.a J
// 03: ldc2_w 97927611582341
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -3940963179337643148
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: getfield su/catlean/pi.b I
// 15: invokestatic java/lang/Integer.hashCode (I)I
// 18: istore 4
// 1a: istore 3
// 1b: iload 4
// 1d: getstatic su/catlean/pi.f J
// 20: l2i
// 21: imul
// 22: aload 0
// 23: getfield su/catlean/pi.v Lnet/minecraft/class_1293;
// 26: iload 3
// 27: ifeq 4c
// 2a: ifnonnull 48
// 2d: goto 3a
// 30: ldc2_w -3898575406449816922
// 33: lload 1
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: bipush 0
// 3b: goto 4f
// 3e: ldc2_w -3898575406449816922
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 0
// 49: getfield su/catlean/pi.v Lnet/minecraft/class_1293;
// 4c: invokevirtual net/minecraft/class_1293.hashCode ()I
// 4f: iadd
// 50: istore 4
// 52: iload 4
// 54: iload 3
// 55: ifne 72
// 58: bipush 4
// 59: anewarray 199
// 5c: ldc2_w -3928942783474842812
// 5f: lload 1
// 60: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: goto 72
// 68: ldc2_w -3898575406449816922
// 6b: lload 1
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: ireturn
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pi.a J
// 03: ldc2_w 64130222707313
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -7157795276060440679
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifne 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -7200946767312429230
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -7200946767312429230
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifne 5c
// 3c: instanceof su/catlean/pi
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -7200946767312429230
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -7200946767312429230
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/pi
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/pi.b I
// 65: iload 4
// 67: ifne 97
// 6a: aload 5
// 6c: getfield su/catlean/pi.b I
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w -7200946767312429230
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -7200946767312429230
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/pi.v Lnet/minecraft/class_1293;
// 8f: aload 5
// 91: getfield su/catlean/pi.v Lnet/minecraft/class_1293;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: iload 4
// 99: ifne b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w -7200946767312429230
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -7200946767312429230
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

public static void U(boolean var0) {
P = var0;
}

public static boolean y() {
return P;
}

public static boolean w() {
boolean var0 = y();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = a ^ 82559674493554L;
vm.a<"Å">(true, 7243280864475716351L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[2];
int var10 = 0;
String var9 = "\u008fÏÓý9\u0089l\u0006\u008a×\u0091èÉAÜ=ÎÁN-Z¹±B\u0092±x\u0015d/\u0094¸\u0018ML\u0098\u0011«}ÿvÓ\u00114Z}=%³ÑÛ÷Â\u000b\tt\u008d";
int var11 = "\u008fÏÓý9\u0089l\u0006\u008a×\u0091èÉAÜ=ÎÁN-Z¹±B\u0092±x\u0015d/\u0094¸\u0018ML\u0098\u0011«}ÿvÓ\u00114Z}=%³ÑÛ÷Â\u000b\tt\u008d".length();
char var8 = ' ';
int var7 = -1;

while (true) {
byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
String var20 = a(var13).intern();
byte var10001 = -1;
var12[var10++] = var20;
if ((var7 += var8) >= var11) {
c = var12;
d = new String[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 6155658949437375054L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var23;
return;
}

var8 = var9.charAt(var7);
}
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1911;
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
throw new RuntimeException("su/catlean/pi", var10);
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
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/pi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
