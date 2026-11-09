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
import net.minecraft.class_1511;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class nw {
@NotNull
private final class_1511 d;
private final boolean M;
private static boolean O;
private static final long a = yz.a(-834247996626952122L, -7857121743543482226L, MethodHandles.lookup().lookupClass()).a(232916167405904L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long f;

public nw(@NotNull class_1511 crystal, long a, boolean block) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(crystal, a<"f">(17534, 3712570810718746766L ^ ax));
super();
this.d = crystal;
this.M = block;
}

@NotNull
public final class_1511 U() {
return this.d;
}

public final boolean G() {
return this.M;
}

@NotNull
public final class_1511 R() {
return this.d;
}

public final boolean c() {
return this.M;
}

@NotNull
public final nw P(@NotNull class_1511 crystal, long a, char a, boolean block) {
long var6 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var8 = var6 ^ 101553228463497L;
Intrinsics.checkNotNullParameter(crystal, a<"f">(13495, 2931320651557570064L ^ var6));
return new nw(crystal, var8, block);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 138405892271781L;
class_1511 var10000 = this.d;
boolean var10001 = this.M;
return a<"f">(6637, 9082424906488620421L ^ var1) + var10000 + a<"f">(14327, 1367955207086541725L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 41826265129997L;
boolean var10000 = vm.a<"Å">(6224018730680779918L, var1);
int var4 = this.d.hashCode();
boolean var3 = var10000;
var4 = var4 * (int)f + Boolean.hashCode(this.M);

try {
if (var3) {
vm.a<"Å">(new _g[2], 6266354301256096971L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 6212187761526611775L, var1);
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
// 00: getstatic su/catlean/nw.a J
// 03: ldc2_w 104544962156042
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -6600217599602919799
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifne 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -6615393384940212936
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -6615393384940212936
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifne 5c
// 3c: instanceof su/catlean/nw
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -6615393384940212936
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -6615393384940212936
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/nw
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/nw.d Lnet/minecraft/class_1511;
// 65: aload 5
// 67: getfield su/catlean/nw.d Lnet/minecraft/class_1511;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: iload 4
// 6f: ifne 92
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -6615393384940212936
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -6615393384940212936
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/nw.M Z
// 92: iload 4
// 94: ifne b9
// 97: aload 5
// 99: getfield su/catlean/nw.M Z
// 9c: if_icmpeq b8
// 9f: goto ac
// a2: ldc2_w -6615393384940212936
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -6615393384940212936
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

public static void P(boolean var0) {
O = var0;
}

public static boolean x() {
return O;
}

public static boolean K() {
boolean var0 = x();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = a ^ 32202209199079L;
vm.a<"Å">(true, 3581737385118985488L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[4];
int var10 = 0;
String var9 = "£AÒ'I\u009dÇ\u009eÀóo§YX\u0082¢ \bø Ï+\u0085ÃÀ²½\u0086O\u008b¹\u0095\u0000\u0006\u0082x',ýAc\u000bAú,v\u009d.\u0085";
int var11 = "£AÒ'I\u009dÇ\u009eÀóo§YX\u0082¢ \bø Ï+\u0085ÃÀ²½\u0086O\u008b¹\u0095\u0000\u0006\u0082x',ýAc\u000bAú,v\u009d.\u0085".length();
char var8 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
b = var12;
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 331077028204997896L;
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

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "v\u0019¨\u0093VM\u00adºm\u0019\"#|åÈô(Q\u0087\u0001à\u009cÙÊ<(Mìû\b\u009a\u0005\u0081\u0083Zç±QÊjP\u009ayÛô\u0018ÍÓdV\u008d`õ_ì>w";
var11 = "v\u0019¨\u0093VM\u00adºm\u0019\"#|åÈô(Q\u0087\u0001à\u009cÙÊ<(Mìû\b\u009a\u0005\u0081\u0083Zç±QÊjP\u009ayÛô\u0018ÍÓdV\u008d`õ_ì>w".length();
var8 = 16;
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8466;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/nw", var10);
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
throw new RuntimeException("su/catlean/nw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
