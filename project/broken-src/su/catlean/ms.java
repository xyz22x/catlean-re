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
import net.minecraft.class_1293;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ms {
@NotNull
private final class_1293 Q;
@NotNull
private final fd Y;
private boolean U;
private static final long a = yz.a(-8470295709590641938L, 5119415053560401807L, MethodHandles.lookup().lookupClass()).a(44125292741753L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public ms(@NotNull class_1293 instance, @NotNull fd animation, short a, short a, boolean removing, int a) {
long var7 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(instance, a<"m">(18984, 3747614680426844311L ^ var7));
Intrinsics.checkNotNullParameter(animation, a<"m">(16549, 6470124462068210200L ^ var7));
super();
this.Q = instance;
this.Y = animation;
this.U = removing;
}

@NotNull
public final class_1293 a() {
return this.Q;
}

@NotNull
public final fd x() {
return this.Y;
}

public final boolean C() {
return this.U;
}

public final void v(boolean <set-?>) {
this.U = <set-?>;
}

@NotNull
public final class_1293 Y() {
return this.Q;
}

@NotNull
public final fd Z() {
return this.Y;
}

public final boolean y() {
return this.U;
}

@NotNull
public final ms y(@NotNull class_1293 instance, @NotNull fd animation, long a, boolean removing) {
ax = a ^ ax;
long var10001 = ax ^ 89170009170117L;
int var6 = (int)((ax ^ 89170009170117L) >>> 48);
int var7 = (int)((ax ^ 89170009170117L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(instance, a<"m">(118, 4231184669502411431L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"m">(12623, 8059273028236747673L ^ ax));
return new ms(instance, animation, (short)var6, (short)var7, removing, var8);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 36102515844936L;
boolean var3 = this.U;
fd var4 = this.Y;
class_1293 var5 = this.Q;
return a<"m">(7054, 5278141867814813248L ^ var1)
+ var5
+ a<"m">(10738, 3968540113263316027L ^ var1)
+ var4
+ a<"m">(4819, 6427488568048940827L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 64590461673813L;
int var3 = this.Q.hashCode();
var3 = var3 * b<"j">(30015, 6399407519490842265L ^ var1) + this.Y.hashCode();
return var3 * b<"j">(1767, 7114952430072851776L ^ var1) + Boolean.hashCode(this.U);
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
// 00: getstatic su/catlean/ms.a J
// 03: ldc2_w 90127702386743
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 84122577047738523
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifne 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 73885893335868206
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 73885893335868206
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifne 5c
// 3c: instanceof su/catlean/ms
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 73885893335868206
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 73885893335868206
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/ms
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/ms.Q Lnet/minecraft/class_1293;
// 65: aload 5
// 67: getfield su/catlean/ms.Q Lnet/minecraft/class_1293;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: iload 4
// 6f: ifne 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 73885893335868206
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 73885893335868206
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/ms.Y Lsu/catlean/fd;
// 92: aload 5
// 94: getfield su/catlean/ms.Y Lsu/catlean/fd;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: iload 4
// 9c: ifne bf
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 73885893335868206
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 73885893335868206
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/ms.U Z
// bf: iload 4
// c1: ifne e6
// c4: aload 5
// c6: getfield su/catlean/ms.U Z
// c9: if_icmpeq e5
// cc: goto d9
// cf: ldc2_w 73885893335868206
// d2: lload 2
// d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d8: athrow
// d9: bipush 0
// da: ireturn
// db: ldc2_w 73885893335868206
// de: lload 2
// df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4: athrow
// e5: bipush 1
// e6: ireturn
}

static {
long var16 = a ^ 26038580669572L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[7];
int var23 = 0;
String var22 = "j\u0096\u0083>\u0015Ö\u00064F\u0087k>Â\u0015·\u0011ên\u0093Ã\u0007\u0095\u0007ò²åOàÜ\nA\u0007 \u0094oñ\u0098#ÿ~4ÔÍôÓ\u009b)þ\u000btîðAø?À\u0086ÏÔÝ)»²\u001a\u0093\u0018@X¡%å¸«Ó<\bç\u000bè'\u009bçCH'Ýfìµv(\u0098É\u008fÌ\u0093y\u0081Wý\u000e¿9zz¤\u009ekõ\t\u0012«S%8\u00912ó×\u0082d½\u0005\býi\u008e \u0005o×\u0018\n\u008d&)k\u008e\u0001Ô\u0006º\u0013ñ¥\u0084ÐÇ.òÏï\u0085\u0004»Ç";
int var24 = "j\u0096\u0083>\u0015Ö\u00064F\u0087k>Â\u0015·\u0011ên\u0093Ã\u0007\u0095\u0007ò²åOàÜ\nA\u0007 \u0094oñ\u0098#ÿ~4ÔÍôÓ\u009b)þ\u000btîðAø?À\u0086ÏÔÝ)»²\u001a\u0093\u0018@X¡%å¸«Ó<\bç\u000bè'\u009bçCH'Ýfìµv(\u0098É\u008fÌ\u0093y\u0081Wý\u000e¿9zz¤\u009ekõ\t\u0012«S%8\u00912ó×\u0082d½\u0005\býi\u008e \u0005o×\u0018\n\u008d&)k\u008e\u0001Ô\u0006º\u0013ñ¥\u0084ÐÇ.òÏï\u0085\u0004»Ç"
.length();
char var21 = ' ';
int var28 = -1;

label56:
while (true) {
String var29 = var22.substring(++var28, var28 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var40;
if ((var28 += var21) >= var24) {
b = var25;
c = new String[7];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[2];
int var8 = 0;
String var9 = "\"\rôO<±¸\u000b,0å\u001eL\u008aÓp";
int var10 = "\"\rôO<±¸\u000b,0å\u001eL\u008aÓp".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var47 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

e = var11;
f = new Integer[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 554053662095637430L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var45 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var38 = -1;
h = var45;
return;
}

var21 = var22.charAt(var28);
break;
default:
var25[var23++] = var40;
if ((var28 += var21) < var24) {
var21 = var22.charAt(var28);
continue label56;
}

var22 = "\u000f\u009fûNµÈ¿\u009dDú°Qøáz\u000eåx\u0092\u008bÂ;ï¼oy\u0010\u0003ö^\u009c\u0098 `\\S¸T¨Ý`] q\u0082A+ñyU#´D±e>\b6ÙÆMÊG\u0017s";
var24 = "\u000f\u009fûNµÈ¿\u009dDú°Qøáz\u000eåx\u0092\u008bÂ;ï¼oy\u0010\u0003ö^\u009c\u0098 `\\S¸T¨Ý`] q\u0082A+ñyU#´D±e>\b6ÙÆMÊG\u0017s".length();
var21 = ' ';
var28 = -1;
}

var29 = var22.substring(++var28, var28 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27176;
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
throw new RuntimeException("su/catlean/ms", var10);
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
throw new RuntimeException("su/catlean/ms" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8798;
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
throw new RuntimeException("su/catlean/ms", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/ms" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
