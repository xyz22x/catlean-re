package su.catlean;

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
import org.joml.Matrix4f;

public final class zd implements class_11281 {
@NotNull
private final Matrix4f A;
@Nullable
private final Matrix4f G;
private static final long a = yz.a(2645781390117145826L, 3786156340651080042L, MethodHandles.lookup().lookupClass()).a(262146235560138L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public zd(@NotNull Matrix4f projection, int a, int a, int a, @Nullable Matrix4f view) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(projection, a<"p">(31498, 3099788824021794623L ^ var6));
super();
this.A = projection;
this.G = view;
}

@NotNull
public final Matrix4f n() {
return this.A;
}

@Nullable
public final Matrix4f U() {
return this.G;
}

public void method_71104(@NotNull ByteBuffer buffer) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/zd.a J
// 03: ldc2_w 14957564951829
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8103537578194082892
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: sipush 7408
// 15: ldc2_w 191627988942031248
// 18: lload 2
// 19: lxor
// 1a: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/zd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 4
// 24: aload 1
// 25: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
// 28: aload 0
// 29: getfield su/catlean/zd.A Lorg/joml/Matrix4f;
// 2c: checkcast org/joml/Matrix4fc
// 2f: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putMat4f (Lorg/joml/Matrix4fc;)Lcom/mojang/blaze3d/buffers/Std140Builder;
// 32: aload 0
// 33: getfield su/catlean/zd.G Lorg/joml/Matrix4f;
// 36: aload 4
// 38: ifnonnull 64
// 3b: dup
// 3c: ifnonnull 61
// 3f: goto 4c
// 42: ldc2_w -8141395711454348467
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: pop
// 4d: new org/joml/Matrix4f
// 50: dup
// 51: invokespecial org/joml/Matrix4f.<init> ()V
// 54: goto 61
// 57: ldc2_w -8141395711454348467
// 5a: lload 2
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: checkcast org/joml/Matrix4fc
// 64: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putMat4f (Lorg/joml/Matrix4fc;)Lcom/mojang/blaze3d/buffers/Std140Builder;
// 67: pop
// 68: return
}

@NotNull
public final Matrix4f d() {
return this.A;
}

@Nullable
public final Matrix4f J() {
return this.G;
}

@NotNull
public final zd u(long a, @NotNull Matrix4f projection, @Nullable Matrix4f view) {
ax = a ^ ax;
long var10001 = ax ^ 55368600636004L;
int var5 = (int)((ax ^ 55368600636004L) >>> 32);
int var6 = (int)((ax ^ 55368600636004L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(projection, a<"p">(13176, 4064212633240964743L ^ ax));
return new zd(projection, var5, var6, var7, view);
}

public static zd i(int var0, zd var1, int var2, Matrix4f var3, short var4, Matrix4f var5, int var6, Object var7) {
long var8 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
long var10 = var8 ^ 3318375942600L;
String[] var12 = vm.a<"Å">(6734420288683290955L, var8);

int var10000;
label25: {
label24: {
try {
var10000 = var6 & 1;
if (var12 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 6772560274849212850L, var8);
}

var3 = var1.A;
}

var10000 = var6 & 2;
}

if (var10000 != 0) {
var5 = var1.G;
}

return var1.u(var10, var3, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 59189522359043L;
Matrix4f var10000 = this.A;
Matrix4f var10001 = this.G;
return a<"p">(29908, 895446534270615461L ^ var1) + var10000 + a<"p">(10845, 2617961216884842799L ^ var1) + var10001 + ")";
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
// 00: getstatic su/catlean/zd.a J
// 03: ldc2_w 125868162296540
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -2863431320196598659
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: getfield su/catlean/zd.A Lorg/joml/Matrix4f;
// 15: invokevirtual org/joml/Matrix4f.hashCode ()I
// 18: istore 4
// 1a: astore 3
// 1b: iload 4
// 1d: getstatic su/catlean/zd.e J
// 20: l2i
// 21: imul
// 22: aload 0
// 23: getfield su/catlean/zd.G Lorg/joml/Matrix4f;
// 26: aload 3
// 27: ifnonnull 4c
// 2a: ifnonnull 48
// 2d: goto 3a
// 30: ldc2_w -2825291476007801724
// 33: lload 1
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: bipush 0
// 3b: goto 4f
// 3e: ldc2_w -2825291476007801724
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 0
// 49: getfield su/catlean/zd.G Lorg/joml/Matrix4f;
// 4c: invokevirtual org/joml/Matrix4f.hashCode ()I
// 4f: iadd
// 50: istore 4
// 52: iload 4
// 54: ireturn
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
// 00: getstatic su/catlean/zd.a J
// 03: ldc2_w 86693766895277
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2003485267318536180
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -1964782206884146955
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -1964782206884146955
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/zd
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -1964782206884146955
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -1964782206884146955
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/zd
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/zd.A Lorg/joml/Matrix4f;
// 65: aload 5
// 67: getfield su/catlean/zd.A Lorg/joml/Matrix4f;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -1964782206884146955
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -1964782206884146955
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/zd.G Lorg/joml/Matrix4f;
// 92: aload 5
// 94: getfield su/catlean/zd.G Lorg/joml/Matrix4f;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnonnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -1964782206884146955
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -1964782206884146955
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

static {
long var5 = a ^ 98798242784007L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[5];
int var12 = 0;
String var11 = "ê\u008a\u0013Q \f\u009ad¡×ì¼-fÔ\u008d Îä&\u0002~\u008e·\u008eÅö\u0015[ç7\u008fåu\u0016E±\u0095Ø\u0018qÇë\u0090&ö(êÓ\u0018¢k.$.=mª\u000fd§Ç\"{ÞFò\u001d\u0086µiÌ\u008c\u0007";
int var13 = "ê\u008a\u0013Q \f\u009ad¡×ì¼-fÔ\u008d Îä&\u0002~\u008e·\u008eÅö\u0015[ç7\u008fåu\u0016E±\u0095Ø\u0018qÇë\u0090&ö(êÓ\u0018¢k.$.=mª\u000fd§Ç\"{ÞFò\u001d\u0086µiÌ\u008c\u0007"
.length();
char var10 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
c = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 7709557158548045795L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "\u0006|1ZvÁÚSÐÀ\r±-6'\u007f\u0089èù:Ö²Û\u009c(±\\8zÔÍp\u009f¨×V$Hz>\u0010ü\u0004ÿªÌ\u0013ºÉC!\u0089ô;-\u0019\u009b";
var13 = "\u0006|1ZvÁÚSÐÀ\r±-6'\u007f\u0089èù:Ö²Û\u009c(±\\8zÔÍp\u009f¨×V$Hz>\u0010ü\u0004ÿªÌ\u0013ºÉC!\u0089ô;-\u0019\u009b".length();
var10 = '(';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7132;
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
throw new RuntimeException("su/catlean/zd", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/zd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
