package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ra extends r2 {
private static final long b = yz.a(3792817161690927398L, 5854561959595799312L, MethodHandles.lookup().lookupClass()).a(63577411702596L);
private static final String[] k;
private static final String[] l;
private static final Map m = new HashMap(13);

public ra(@NotNull a1 setting, long a) {
a = b ^ a;
long var4 = a ^ 13725931633128L;
Intrinsics.checkNotNullParameter(setting, b<"b">(2008, 7776801553420772951L ^ a));
super(var4, setting);
}

@Override
public void K(long a, int mouseX) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 82773164258250
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w -8664070826218471330
// 0c: lload 1
// 0d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: astore 6
// 14: aload 0
// 15: invokevirtual su/catlean/ra.k ()Z
// 18: aload 6
// 1a: ifnull 2e
// 1d: ifeq d1
// 20: goto 2d
// 23: ldc2_w -8708178980252629743
// 26: lload 1
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: iload 3
// 2e: i2f
// 2f: aload 0
// 30: invokevirtual su/catlean/ra.x ()F
// 33: fsub
// 34: aload 0
// 35: invokevirtual su/catlean/ra.F ()F
// 38: ldc 7.0
// 3a: fsub
// 3b: fdiv
// 3c: fconst_0
// 3d: fconst_1
// 3e: invokestatic java/lang/Math.clamp (FFF)F
// 41: fstore 7
// 43: aload 0
// 44: lload 4
// 46: invokevirtual su/catlean/ra.U (J)Lkotlin/ranges/ClosedFloatingPointRange;
// 49: invokeinterface kotlin/ranges/ClosedFloatingPointRange.getStart ()Ljava/lang/Comparable; 1
// 4e: checkcast java/lang/Number
// 51: invokevirtual java/lang/Number.floatValue ()F
// 54: aload 0
// 55: lload 4
// 57: invokevirtual su/catlean/ra.U (J)Lkotlin/ranges/ClosedFloatingPointRange;
// 5a: invokeinterface kotlin/ranges/ClosedFloatingPointRange.getEndInclusive ()Ljava/lang/Comparable; 1
// 5f: checkcast java/lang/Number
// 62: invokevirtual java/lang/Number.floatValue ()F
// 65: aload 0
// 66: lload 4
// 68: invokevirtual su/catlean/ra.U (J)Lkotlin/ranges/ClosedFloatingPointRange;
// 6b: invokeinterface kotlin/ranges/ClosedFloatingPointRange.getStart ()Ljava/lang/Comparable; 1
// 70: checkcast java/lang/Number
// 73: invokevirtual java/lang/Number.floatValue ()F
// 76: fsub
// 77: fload 7
// 79: fmul
// 7a: fadd
// 7b: fstore 8
// 7d: aload 0
// 7e: lload 4
// 80: invokevirtual su/catlean/ra.U (J)Lkotlin/ranges/ClosedFloatingPointRange;
// 83: invokeinterface kotlin/ranges/ClosedFloatingPointRange.getEndInclusive ()Ljava/lang/Comparable; 1
// 88: checkcast java/lang/Number
// 8b: invokevirtual java/lang/Number.floatValue ()F
// 8e: aload 6
// 90: ifnull b4
// 93: fconst_1
// 94: fcmpl
// 95: ifle b7
// 98: goto a5
// 9b: ldc2_w -8708178980252629743
// 9e: lload 1
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: ldc 10.0
// a7: goto b4
// aa: ldc2_w -8708178980252629743
// ad: lload 1
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: goto b9
// b7: ldc 100.0
// b9: fstore 9
// bb: aload 0
// bc: invokevirtual su/catlean/ra.A ()Lsu/catlean/a1;
// bf: fload 8
// c1: fload 9
// c3: fmul
// c4: invokestatic kotlin/math/MathKt.roundToInt (F)I
// c7: i2f
// c8: fload 9
// ca: fdiv
// cb: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// ce: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// d1: return
}

@Override
public float J(char var1, long var2) {
long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
long var6 = var4 ^ 106285934015789L;
return Math.clamp(
(((Number)this.A().F()).floatValue() - ((Number)this.U(var6).getStart()).floatValue())
/ (((Number)this.U(var6).getEndInclusive()).floatValue() - ((Number)this.U(var6).getStart()).floatValue()),
0.0F,
1.0F
);
}

@NotNull
public Float Q(@NotNull String value, long a) {
a = b ^ a;
Intrinsics.checkNotNullParameter(value, b<"b">(9362, 8898305943908050539L ^ a));
return Float.parseFloat(value);
}

@Override
public void L() {
this.k(false);
}

@NotNull
public Float V(float current, int step) {
return new BigDecimal(String.valueOf(step * 0.1)).add(new BigDecimal(String.valueOf(((Number)this.A().F()).floatValue()))).floatValue();
}

@Override
public Number s(int a, char a, int a, String value) {
long var5 = (long)a << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48;
long var7 = var5 ^ 50856965502212L;
return this.Q(value, var7);
}

@Override
public Number i(int a, Number current, int a, char a, int step) {
return this.V(current.floatValue(), step);
}

static {
long var0 = b ^ 38637292153016L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "X\u001a3Á\u0013kö%¶\u0093µ77fma\u0010WqçaM\u0090ï@ê\u000enÁ´Ù¨þ";
int var8 = "X\u001a3Á\u0013kö%¶\u0093µ77fma\u0010WqçaM\u0090ï@ê\u000enÁ´Ù¨þ".length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = c(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
k = var9;
l = new String[2];
return;
}

var5 = var6.charAt(var4);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16579;
if (l[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])m.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ra", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = k[var5].getBytes("ISO-8859-1");
l[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return l[var5];
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
throw new RuntimeException("su/catlean/ra" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
