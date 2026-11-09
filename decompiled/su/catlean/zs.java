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
import net.minecraft.class_1792;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class zs {
@NotNull
private final class_243 y;
private final long J;
@NotNull
private final class_1792 p;
private static final long a = yz.a(5840573284536615849L, -8857293405430114261L, MethodHandles.lookup().lookupClass()).a(187394134356744L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public zs(@NotNull class_243 pos, long expiresOn, @NotNull class_1792 item, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(pos, a<"k">(24980, 2936631975063667592L ^ ax));
Intrinsics.checkNotNullParameter(item, a<"k">(27863, 6539552318520839881L ^ ax));
super();
this.y = pos;
this.J = expiresOn;
this.p = item;
}

@NotNull
public final class_243 b() {
return this.y;
}

public final long s() {
return this.J;
}

@NotNull
public final class_1792 T() {
return this.p;
}

@NotNull
public final class_243 A() {
return this.y;
}

public final long t() {
return this.J;
}

@NotNull
public final class_1792 f() {
return this.p;
}

@NotNull
public final zs j(byte a, int a, int a, @NotNull class_243 pos, long expiresOn, @NotNull class_1792 item) {
long var8 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
long var10 = var8 ^ 114843398560452L;
Intrinsics.checkNotNullParameter(pos, a<"k">(17343, 2637065190695851247L ^ var8));
Intrinsics.checkNotNullParameter(item, a<"k">(24914, 6048425934286976512L ^ var8));
return new zs(pos, expiresOn, item, var10);
}

public static zs w(zs var0, class_243 var1, long var2, class_1792 var4, int var5, Object var6, long var7) {
var7 = a ^ var7;
long var10001 = var7 ^ 129655290516707L;
int var9 = (int)((var7 ^ 129655290516707L) >>> 56);
int var10 = (int)((var7 ^ 129655290516707L) << 8 >>> 32);
int var11 = (int)(var10001 << 40 >>> 40);
String var12 = vm.a<"Å">(2726279863985617483L, var7);

int var10000;
label41: {
label40: {
try {
var10000 = var5 & 1;
if (var12 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 2717507111007485534L, var7);
}

var1 = var0.y;
}

var10000 = var5 & 2;
}

label32: {
label31: {
try {
if (var12 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 2717507111007485534L, var7);
}

var2 = var0.J;
}

var10000 = var5 & 4;
}

if (var10000 != 0) {
var4 = var0.p;
}

return var0.j((byte)var9, var10, var11, var1, var2, var4);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 136039926990745L;
class_1792 var3 = this.p;
long var4 = this.J;
class_243 var6 = this.y;
return a<"k">(29222, 6305971897723130437L ^ var1)
+ var6
+ a<"k">(6513, 411519487262521619L ^ var1)
+ var4
+ a<"k">(24144, 2292150358399499824L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 87293022518963L;
int var3 = this.y.hashCode();
var3 = var3 * b<"l">(28555, 1696653879030398415L ^ var1) + Long.hashCode(this.J);
return var3 * b<"l">(17597, 8804113356175415032L ^ var1) + this.p.hashCode();
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
// 00: getstatic su/catlean/zs.a J
// 03: ldc2_w 44745299622828
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 1566398253777521186
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 1576191355928497719
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 1576191355928497719
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/zs
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 1576191355928497719
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 1576191355928497719
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/zs
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/zs.y Lnet/minecraft/class_243;
// 65: aload 5
// 67: getfield su/catlean/zs.y Lnet/minecraft/class_243;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 98
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 1576191355928497719
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 1576191355928497719
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/zs.J J
// 92: aload 5
// 94: getfield su/catlean/zs.J J
// 97: lcmp
// 98: aload 4
// 9a: ifnonnull c5
// 9d: ifeq b9
// a0: goto ad
// a3: ldc2_w 1576191355928497719
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: bipush 0
// ae: ireturn
// af: ldc2_w 1576191355928497719
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: aload 0
// ba: getfield su/catlean/zs.p Lnet/minecraft/class_1792;
// bd: aload 5
// bf: getfield su/catlean/zs.p Lnet/minecraft/class_1792;
// c2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c5: aload 4
// c7: ifnonnull e7
// ca: ifne e6
// cd: goto da
// d0: ldc2_w 1576191355928497719
// d3: lload 2
// d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9: athrow
// da: bipush 0
// db: ireturn
// dc: ldc2_w 1576191355928497719
// df: lload 2
// e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e5: athrow
// e6: bipush 1
// e7: ireturn
}

static {
long var11 = a ^ 87833906294728L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[7];
int var18 = 0;
String var17 = "µB·E\u0002¿×\u0007\u0090\\!;7b¶k\u0010cÅS\u0094\f-Ä.Ë\u009c®ù9\u009c\t\b\u0010@\u0085\f2Ds\\Rä§]\u001aµ&óù\u0010'ÐZMì°³e\u0094ÿqµ\u0005\u0002r\u008b )m§µj\u0088æ\u0097ä¥ D\u0085\u008e\u0013:\u00066¹RK\u001dô·ÝÇ¼-\u0013¦¿§";
int var19 = "µB·E\u0002¿×\u0007\u0090\\!;7b¶k\u0010cÅS\u0094\f-Ä.Ë\u009c®ù9\u009c\t\b\u0010@\u0085\f2Ds\\Rä§]\u001aµ&óù\u0010'ÐZMì°³e\u0094ÿqµ\u0005\u0002r\u008b )m§µj\u0088æ\u0097ä¥ D\u0085\u008e\u0013:\u00066¹RK\u001dô·ÝÇ¼-\u0013¦¿§"
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
b = var20;
c = new String[7];
g = new HashMap(13);
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
String var4 = "ü\u008fòÂ°¢m\u0014ÍI\u0097øCwX\u001c";
int var5 = "ü\u008fòÂ°¢m\u0014ÍI\u0097øCwX\u001c".length();
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

e = var6;
f = new Integer[2];
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

var17 = "fcx× a#\u00971Z\u0012:ù\fªa¤\u009f&Îø2}C\u009eåW7\u0099\u00ad\u0094Ú\u0010ì\u00187\u0019\u0004à\u000b\u008aG@\u0089D\u0010Ýê\u0082";
var19 = "fcx× a#\u00971Z\u0012:ù\fªa¤\u009f&Îø2}C\u009eåW7\u0099\u00ad\u0094Ú\u0010ì\u00187\u0019\u0004à\u000b\u008aG@\u0089D\u0010Ýê\u0082".length();
var16 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2166;
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
throw new RuntimeException("su/catlean/zs", var10);
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
throw new RuntimeException("su/catlean/zs" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 894;
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
throw new RuntimeException("su/catlean/zs", var14);
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
throw new RuntimeException("su/catlean/zs" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
