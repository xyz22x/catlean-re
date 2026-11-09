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
import net.minecraft.class_2350;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fa {
@NotNull
private final class_2338 a;
@NotNull
private final class_2350 L;
private final float t;
private final float Q;
private static final long b = yz.a(-8191077676480898858L, -778446914907880495L, MethodHandles.lookup().lookupClass()).a(278338010141935L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public fa(short a, @NotNull class_2338 pos, int a, @NotNull class_2350 side, float damage, float selfDamage, char a) {
long var8 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ b;
Intrinsics.checkNotNullParameter(pos, a<"a">(3923, 112756791498762878L ^ var8));
Intrinsics.checkNotNullParameter(side, a<"a">(23380, 4251509969894096510L ^ var8));
super();
this.a = pos;
this.L = side;
this.t = damage;
this.Q = selfDamage;
}

@NotNull
public final class_2338 w() {
return this.a;
}

@NotNull
public final class_2350 y() {
return this.L;
}

public final float z() {
return this.t;
}

public final float a() {
return this.Q;
}

@NotNull
public final class_2338 Z() {
return this.a;
}

@NotNull
public final class_2350 C() {
return this.L;
}

public final float s() {
return this.t;
}

public final float x() {
return this.Q;
}

@NotNull
public final fa x(@NotNull class_2338 pos, @NotNull class_2350 side, float damage, float selfDamage, long a) {
ax = b ^ ax;
long var10001 = ax ^ 25877543435916L;
int var7 = (int)((ax ^ 25877543435916L) >>> 48);
int var8 = (int)((ax ^ 25877543435916L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(pos, a<"a">(2711, 6435618793470475354L ^ ax));
Intrinsics.checkNotNullParameter(side, a<"a">(25216, 4751203664449459273L ^ ax));
return new fa((short)var7, pos, var8, side, damage, selfDamage, (char)var9);
}

@NotNull
@Override
public String toString() {
long var1 = b ^ 43628874950379L;
float var3 = this.Q;
float var4 = this.t;
class_2350 var5 = this.L;
class_2338 var6 = this.a;
return a<"a">(24324, 8818636139800058576L ^ var1)
+ var6
+ a<"a">(6090, 8307354951770837529L ^ var1)
+ var5
+ a<"a">(24415, 7491241702140500621L ^ var1)
+ var4
+ a<"a">(31256, 6000259969891631054L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = b ^ 119111207261753L;
int var3 = this.a.hashCode();
var3 = var3 * b<"y">(15740, 6028618919568615704L ^ var1) + this.L.hashCode();
var3 = var3 * b<"y">(11339, 5375149071490463790L ^ var1) + Float.hashCode(this.t);
return var3 * b<"y">(11339, 5375149071490463790L ^ var1) + Float.hashCode(this.Q);
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
// 000: getstatic su/catlean/fa.b J
// 003: ldc2_w 10773446781872
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -8699664913859383198
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -8778102256833727767
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -8778102256833727767
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/fa
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -8778102256833727767
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -8778102256833727767
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/fa
// 05f: astore 5
// 061: aload 0
// 062: aload 4
// 064: ifnonnull 08f
// 067: getfield su/catlean/fa.a Lnet/minecraft/class_2338;
// 06a: aload 5
// 06c: getfield su/catlean/fa.a Lnet/minecraft/class_2338;
// 06f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -8778102256833727767
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -8778102256833727767
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: aload 4
// 091: ifnonnull 0b9
// 094: getfield su/catlean/fa.L Lnet/minecraft/class_2350;
// 097: aload 5
// 099: getfield su/catlean/fa.L Lnet/minecraft/class_2350;
// 09c: if_acmpeq 0b8
// 09f: goto 0ac
// 0a2: ldc2_w -8778102256833727767
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: ireturn
// 0ae: ldc2_w -8778102256833727767
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/fa.t F
// 0bc: aload 5
// 0be: getfield su/catlean/fa.t F
// 0c1: invokestatic java/lang/Float.compare (FF)I
// 0c4: aload 4
// 0c6: ifnonnull 0f1
// 0c9: ifeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w -8778102256833727767
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w -8778102256833727767
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/fa.Q F
// 0e9: aload 5
// 0eb: getfield su/catlean/fa.Q F
// 0ee: invokestatic java/lang/Float.compare (FF)I
// 0f1: aload 4
// 0f3: ifnonnull 113
// 0f6: ifeq 112
// 0f9: goto 106
// 0fc: ldc2_w -8778102256833727767
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w -8778102256833727767
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: bipush 1
// 113: ireturn
}

static {
long var11 = b ^ 44545044466616L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[8];
int var18 = 0;
String var17 = "|õf.³[¯Î\"W\u007fKÐì\rÇ(2QH\u0016åò?¸\u008a@=¤`¦\u00adf4&\u0097âË\u0002ælLÒ?O\u00871\u001boÂ\u001dt\u0080g/\u009c\u008a\u0010Ù\\\u000e\u0016ï\u0087®¡\u009f¦ÝÛÞ ¬}\u0018û§çRÒ7\u0083Ìéår ç\u00ad\u008bý¬FAï?£ùC\u0010ÐËNÒò\u0019õD\u0004»øsaÂ\u0014U\u0010JËØ«-Ñ±V\u000e H\u0003Í½>û";
int var19 = "|õf.³[¯Î\"W\u007fKÐì\rÇ(2QH\u0016åò?¸\u008a@=¤`¦\u00adf4&\u0097âË\u0002ælLÒ?O\u00871\u001boÂ\u001dt\u0080g/\u009c\u008a\u0010Ù\\\u000e\u0016ï\u0087®¡\u009f¦ÝÛÞ ¬}\u0018û§çRÒ7\u0083Ìéår ç\u00ad\u008bý¬FAï?£ùC\u0010ÐËNÒò\u0019õD\u0004»øsaÂ\u0014U\u0010JËØ«-Ñ±V\u000e H\u0003Í½>û"
.length();
char var16 = 16;
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
c = var20;
d = new String[8];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "£\u001b\u0016]@\u0019\u00169Ø%Ö\u001eÕ:\u0014ìÔ7¨ì¸/^d";
int var5 = "£\u001b\u0016]@\u0019\u00169Ø%Ö\u001eÕ:\u0014ìÔ7¨ì¸/^d".length();
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
g = new Integer[3];
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

var17 = "\u0087$%ü_\u0086¤\u0082>=×\u0080Ò\u0004,ù\u0018ÉÊd/º¥o«\u0095&\u000b wÙí\u0096@K£m\u0080õÉ\u0097";
var19 = "\u0087$%ü_\u0086¤\u0082>=×\u0080Ò\u0004,ù\u0018ÉÊd/º¥o«\u0095&\u000b wÙí\u0096@K£m\u0080õÉ\u0097".length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3668;
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
throw new RuntimeException("su/catlean/fa", var10);
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
throw new RuntimeException("su/catlean/fa" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28470;
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
throw new RuntimeException("su/catlean/fa", var14);
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
throw new RuntimeException("su/catlean/fa" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
