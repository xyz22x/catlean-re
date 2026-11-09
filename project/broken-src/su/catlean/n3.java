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
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class n3 {
@NotNull
private final class_2338 X;
private final float C;
private static final long a = yz.a(-7373886820703503391L, 2703852038642117533L, MethodHandles.lookup().lookupClass()).a(53267170294411L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public n3(@NotNull class_2338 blockPos, float damage, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(blockPos, a<"b">(17801, 6847967258158837527L ^ ax));
super();
this.X = blockPos;
this.C = damage;
}

@NotNull
public final class_2338 b() {
return this.X;
}

public final float D() {
return this.C;
}

@NotNull
public final class_2338 c() {
return this.X;
}

public final float i() {
return this.C;
}

@NotNull
public final n3 q(int a, @NotNull class_2338 blockPos, int a, char a, float damage) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var8 = var6 ^ 112732380702587L;
Intrinsics.checkNotNullParameter(blockPos, a<"b">(3467, 1332219041811089368L ^ var6));
return new n3(blockPos, damage, var8);
}

public static n3 Y(n3 var0, class_2338 var1, long var2, float var4, int var5, Object var6) {
var2 = a ^ var2;
long var10001 = var2 ^ 30765636186920L;
int var7 = (int)((var2 ^ 30765636186920L) >>> 32);
int var8 = (int)((var2 ^ 30765636186920L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
_g[] var10 = vm.a<"Å">(2794449387353991884L, var2);

int var10000;
label25: {
label24: {
try {
var10000 = var5 & 1;
if (var10 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 2767588475934416253L, var2);
}

var1 = var0.X;
}

var10000 = var5 & 2;
}

if (var10000 != 0) {
var4 = var0.C;
}

return var0.q(var7, var1, var8, (char)var9, var4);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 37300932023700L;
class_2338 var10000 = this.X;
float var10001 = this.C;
return a<"b">(12580, 5446334487245208201L ^ var1) + var10000 + a<"b">(14357, 2787854389400351674L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 23661552425001L;
vm.a<"Å">(-2442201691103686128L, var1);
int var4 = this.X.hashCode();
var4 = var4 * (int)e + Float.hashCode(this.C);

try {
if (vm.a<"Å">(-2392351924347486115L, var1) != null) {
vm.a<"Å">(new _g[3], -2444122601758810704L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -2399260369245968991L, var1);
}
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
// 00: getstatic su/catlean/n3.a J
// 03: ldc2_w 137876759404156
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2860095410678983611
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -2818842668501376012
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -2818842668501376012
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/n3
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -2818842668501376012
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -2818842668501376012
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/n3
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/n3.X Lnet/minecraft/class_2338;
// 65: aload 5
// 67: getfield su/catlean/n3.X Lnet/minecraft/class_2338;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -2818842668501376012
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -2818842668501376012
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/n3.C F
// 92: aload 5
// 94: getfield su/catlean/n3.C F
// 97: invokestatic java/lang/Float.compare (FF)I
// 9a: aload 4
// 9c: ifnonnull bc
// 9f: ifeq bb
// a2: goto af
// a5: ldc2_w -2818842668501376012
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -2818842668501376012
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

static {
long var5 = a ^ 122817641360195L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "yPØÆ\u0003Qf±;\u0018õè >õy³ÑnæûUQV«\"Z¨´´\u0011~ Î\u008dõ\u001aÎ\u0090N\u009b Nc\u001d\u0017ÊûõÀÝ\u001bÖ\u0010ç\u008d\\y\u0082 GÙº`Ê";
int var13 = "yPØÆ\u0003Qf±;\u0018õè >õy³ÑnæûUQV«\"Z¨´´\u0011~ Î\u008dõ\u001aÎ\u0090N\u009b Nc\u001d\u0017ÊûõÀÝ\u001bÖ\u0010ç\u008d\\y\u0082 GÙº`Ê".length();
char var10 = ' ';
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
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 6119329829863844323L;
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

var11 = "\u0007\u009c±\u009bÌ\u0013èfÄ\u000e/²Û3À\u0088ÿráz¤ùÕ¦=\u008bÍ9TY\u0010ªYu\u001e9\u001f\u008fG\u0016 ±_;®VR\u0090¹71§x@Ûý\u000e¡dþ\u0081\u0088¦¤É½\u007f\u0084)4\u0087\u0081\u0092";
var13 = "\u0007\u009c±\u009bÌ\u0013èfÄ\u000e/²Û3À\u0088ÿráz¤ùÕ¦=\u008bÍ9TY\u0010ªYu\u001e9\u001f\u008fG\u0016 ±_;®VR\u0090¹71§x@Ûý\u000e¡dþ\u0081\u0088¦¤É½\u007f\u0084)4\u0087\u0081\u0092"
.length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6543;
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
throw new RuntimeException("su/catlean/n3", var10);
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
throw new RuntimeException("su/catlean/n3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
