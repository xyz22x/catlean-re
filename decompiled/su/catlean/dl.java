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
import net.minecraft.class_2350;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dl {
@NotNull
private final class_2350 Y;
@NotNull
private final class_243 b;
private static final long a = yz.a(-6269097525667313317L, 6505703261685906779L, MethodHandles.lookup().lookupClass()).a(17470763773690L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long f;

public dl(@NotNull class_2350 dir, @NotNull class_243 vector, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(dir, a<"k">(8222, 2238085302066766953L ^ ax));
Intrinsics.checkNotNullParameter(vector, a<"k">(26551, 8753054605482959810L ^ ax));
super();
this.Y = dir;
this.b = vector;
}

@NotNull
public final class_2350 e() {
return this.Y;
}

@NotNull
public final class_243 C() {
return this.b;
}

@NotNull
public final class_2350 o() {
return this.Y;
}

@NotNull
public final class_243 g() {
return this.b;
}

@NotNull
public final dl o(@NotNull class_2350 dir, @NotNull class_243 vector, long a) {
ax = a ^ ax;
long var5 = ax ^ 135831813177561L;
Intrinsics.checkNotNullParameter(dir, a<"k">(20405, 2772549186002033302L ^ ax));
Intrinsics.checkNotNullParameter(vector, a<"k">(6017, 6934537289702949540L ^ ax));
return new dl(dir, vector, var5);
}

public static dl N(dl var0, char var1, short var2, class_2350 var3, int var4, class_243 var5, int var6, Object var7) {
long var8 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
long var10 = var8 ^ 1429880383097L;
_g[] var12 = vm.a<"Å">(1427342720328458806L, var8);

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
throw vm.a<"Å">(var13, 1427754735906408603L, var8);
}

var3 = var0.Y;
}

var10000 = var6 & 2;
}

if (var10000 != 0) {
var5 = var0.b;
}

return var0.o(var3, var5, var10);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 86038694631560L;
class_2350 var10000 = this.Y;
class_243 var10001 = this.b;
return a<"k">(6040, 9206109734692187850L ^ var1) + var10000 + a<"k">(25050, 6389310678861650061L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 45804054041184L;
int var3 = this.Y.hashCode();
return var3 * (int)f + this.b.hashCode();
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
// 00: getstatic su/catlean/dl.a J
// 03: ldc2_w 7317177555848
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 814509804491242165
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 816048323457339416
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 816048323457339416
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/dl
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 816048323457339416
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 816048323457339416
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/dl
// 5f: astore 5
// 61: aload 0
// 62: aload 4
// 64: ifnonnull 8c
// 67: getfield su/catlean/dl.Y Lnet/minecraft/class_2350;
// 6a: aload 5
// 6c: getfield su/catlean/dl.Y Lnet/minecraft/class_2350;
// 6f: if_acmpeq 8b
// 72: goto 7f
// 75: ldc2_w 816048323457339416
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w 816048323457339416
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/dl.b Lnet/minecraft/class_243;
// 8f: aload 5
// 91: getfield su/catlean/dl.b Lnet/minecraft/class_243;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: aload 4
// 99: ifnonnull b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w 816048323457339416
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w 816048323457339416
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

static {
long var5 = a ^ 102286616340585L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[6];
int var12 = 0;
String var11 = "\u0099ov\u0011çªeDß ¯©k¥s\u007f\u0018p^:²Î]û\f¦Âù¸ñ¦\\úå¯\u008eÊÏ¤\r»\u0010K.x\u0001Ï?/e\u0013-\b-Þ²\u009e@\u0010Ð\u0000\u0013n@\u0013>\u009flRÍã,s¿ç";
int var13 = "\u0099ov\u0011çªeDß ¯©k¥s\u007f\u0018p^:²Î]û\f¦Âù¸ñ¦\\úå¯\u008eÊÏ¤\r»\u0010K.x\u0001Ï?/e\u0013-\b-Þ²\u009e@\u0010Ð\u0000\u0013n@\u0013>\u009flRÍã,s¿ç"
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
c = var14;
d = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2983125834408607172L;
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
f = var30;
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

var11 = "\u0010U\u0001T\u0087\u0012T\u0084.\u007fS%Ý!O\u0084ójD\u0090a¾º)âqþ*\u0086¦QF\u0010²×\u0093yò\u008f®\u0013Ý\u0085ã\u0017þ&5c";
var13 = "\u0010U\u0001T\u0087\u0012T\u0084.\u007fS%Ý!O\u0084ójD\u0090a¾º)âqþ*\u0086¦QF\u0010²×\u0093yò\u008f®\u0013Ý\u0085ã\u0017þ&5c".length();
var10 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12370;
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
throw new RuntimeException("su/catlean/dl", var10);
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
throw new RuntimeException("su/catlean/dl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
