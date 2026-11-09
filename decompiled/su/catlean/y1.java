package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class y1 implements class_11281 {
private final float Y;
private final float c;
private final float s;
private static final long a = yz.a(8740295180890646901L, 5927022104557258384L, MethodHandles.lookup().lookupClass()).a(23393583996478L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public y1(float halfTexelSizeX, float halfTexelSizeY, float offset) {
this.Y = halfTexelSizeX;
this.c = halfTexelSizeY;
this.s = offset;
}

public final float Z() {
return this.Y;
}

public final float B() {
return this.c;
}

public final float X() {
return this.s;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 106083744169981L;
Intrinsics.checkNotNullParameter(buffer, a<"e">(12488, 2387541448669561333L ^ var2));
Std140Builder.intoBuffer(buffer).putVec2(this.Y, this.c).putFloat(this.s);
}

public final float G() {
return this.Y;
}

public final float u() {
return this.c;
}

public final float T() {
return this.s;
}

@NotNull
public final y1 A(float halfTexelSizeX, float halfTexelSizeY, float offset) {
return new y1(halfTexelSizeX, halfTexelSizeY, offset);
}

public static y1 F(y1 var0, long var1, float var3, float var4, float var5, int var6, Object var7) {
var1 = a ^ var1;
String[] var8 = vm.a<"Å">(1313944975747055106L, var1);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var8 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 1438200255930594167L, var1);
}

var3 = var0.Y;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var8 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 1438200255930594167L, var1);
}

var4 = var0.c;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var0.s;
}

return var0.A(var3, var4, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 86126546518297L;
float var3 = this.s;
float var4 = this.c;
float var5 = this.Y;
return a<"e">(21785, 4975290731397176002L ^ var1)
+ var5
+ a<"e">(24913, 8978143929539292809L ^ var1)
+ var4
+ a<"e">(24520, 8425068615288836114L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 98250055427182L;
int var3 = Float.hashCode(this.Y);
var3 = var3 * b<"f">(596, 180997879131498913L ^ var1) + Float.hashCode(this.c);
return var3 * b<"f">(20635, 2208112617013001071L ^ var1) + Float.hashCode(this.s);
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
// 00: getstatic su/catlean/y1.a J
// 03: ldc2_w 17222339750660
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8525471791799638639
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -8617951323410994972
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -8617951323410994972
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/y1
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -8617951323410994972
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -8617951323410994972
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/y1
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/y1.Y F
// 65: aload 5
// 67: getfield su/catlean/y1.Y F
// 6a: invokestatic java/lang/Float.compare (FF)I
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifeq 8e
// 75: goto 82
// 78: ldc2_w -8617951323410994972
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -8617951323410994972
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/y1.c F
// 92: aload 5
// 94: getfield su/catlean/y1.c F
// 97: invokestatic java/lang/Float.compare (FF)I
// 9a: aload 4
// 9c: ifnonnull c7
// 9f: ifeq bb
// a2: goto af
// a5: ldc2_w -8617951323410994972
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -8617951323410994972
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/y1.s F
// bf: aload 5
// c1: getfield su/catlean/y1.s F
// c4: invokestatic java/lang/Float.compare (FF)I
// c7: aload 4
// c9: ifnonnull e9
// cc: ifeq e8
// cf: goto dc
// d2: ldc2_w -8617951323410994972
// d5: lload 2
// d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db: athrow
// dc: bipush 0
// dd: ireturn
// de: ldc2_w -8617951323410994972
// e1: lload 2
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: ireturn
}

static {
long var11 = a ^ 110606945628608L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[4];
int var18 = 0;
String var17 = "dPª§;>Ô\u008aÀ\rKy\u001d \u008a:\b\u0007ÄÈ\n\u001c\u009cÕ8G¿\u0095\rÆP\u001b¦î\u001ePKõ\u001d\u0004Ð\u0085½\u001c\u009cns\u0099Ô\u0080¸Ò\bãÕ©Giï÷g\u0014Ý~Ä\u00808~N`:¶=Ò\u008bK\u0010\u0006{\u001d1";
int var19 = "dPª§;>Ô\u008aÀ\rKy\u001d \u008a:\b\u0007ÄÈ\n\u001c\u009cÕ8G¿\u0095\rÆP\u001b¦î\u001ePKõ\u001d\u0004Ð\u0085½\u001c\u009cns\u0099Ô\u0080¸Ò\bãÕ©Giï÷g\u0014Ý~Ä\u00808~N`:¶=Ò\u008bK\u0010\u0006{\u001d1"
.length();
char var16 = 24;
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
d = new String[4];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u001c\u001d¸\f\u0086\b\u0005\u0087ö\u0017´\u0096[\u009a\u001ei";
int var5 = "\u001c\u001d¸\f\u0086\b\u0005\u0087ö\u0017´\u0096[\u009a\u001ei".length();
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
g = new Integer[2];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "Ñðf\u0087ãf\u0086\u0092p\u009bÐ¿ºÉ-¢;\u0096@ZÍâ¬\u0096>ò¶\u000fW/\u001eV\u0091IN\u0083Ièë\u0010\u0010@x{¬ª¤\u008a\u0016P;¾\u008b\u008b\u0006ç^";
var19 = "Ñðf\u0087ãf\u0086\u0092p\u009bÐ¿ºÉ-¢;\u0096@ZÍâ¬\u0096>ò¶\u000fW/\u001eV\u0091IN\u0083Ièë\u0010\u0010@x{¬ª¤\u008a\u0016P;¾\u008b\u008b\u0006ç^"
.length();
var16 = '(';
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27994;
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
throw new RuntimeException("su/catlean/y1", var10);
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
throw new RuntimeException("su/catlean/y1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11266;
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
throw new RuntimeException("su/catlean/y1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/y1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
