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
import net.minecraft.class_1113;
import net.minecraft.class_1144;
import net.minecraft.class_2378;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_5819;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lp {
@NotNull
private final String n;
private final float z;
@NotNull
private final class_3414 c;
private static int[] K;
private static final long a = yz.a(8889086489295664459L, -7696702242446467936L, MethodHandles.lookup().lookupClass()).a(141004746872133L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long f;

public lp(@NotNull String name, char a, char a, int a, float volume) {
long var6 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var8 = var6 ^ 16513233328916L;
Intrinsics.checkNotNullParameter(name, a<"p">(10174, 6559182622311154185L ^ var6));
super();
this.n = name;
this.z = volume;
String var10000 = this.n;
class_2960 var10 = l6.m(var8, a<"p">(10167, 3668599272979399172L ^ var6) + var10000);
class_3414 var10001 = class_3414.method_47908(var10);
Intrinsics.checkNotNullExpressionValue(var10001, a<"p">(30431, 7346924227424244589L ^ var6));
this.c = var10001;
class_2378.method_10230(class_7923.field_41172, var10, this.c);
}

@NotNull
public final String c() {
return this.n;
}

public final float M() {
return this.z;
}

public final void L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 22714111889297L;
zf.F(var3).method_40000(lp::L);
}

public final void k(long a, @NotNull class_243 vec, byte a) {
long var5 = (axx << 8 | (long)ax << 56 >>> 56) ^ a;
int var7 = (int)((var5 ^ 61752887200913L) >>> 48);
long var8 = (var5 ^ 61752887200913L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(vec, a<"p">(23319, 6714801747240018303L ^ var5));
this.q(vec.field_1352, (short)var7, var8, vec.field_1351, vec.field_1350);
}

public final void q(double x, short a, long a, double y, double z) {
long var10 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
long var12 = var10 ^ 138218339987752L;
zf.F(var12).method_40000(lp::K);
}

@NotNull
public final String m() {
return this.n;
}

public final float U() {
return this.z;
}

@NotNull
public final lp m(@NotNull String name, long a, float volume) {
ax = a ^ ax;
long var10001 = ax ^ 19487336713794L;
int var5 = (int)((ax ^ 19487336713794L) >>> 48);
int var6 = (int)((ax ^ 19487336713794L) << 16 >>> 48);
int var7 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(name, a<"p">(1439, 2001225742979124777L ^ ax));
return new lp(name, (char)var5, (char)var6, var7, volume);
}

public static lp S(lp var0, String var1, float var2, int var3, byte var4, Object var5, long var6) {
long var8 = ((long)var4 << 56 | var6 << 8 >>> 8) ^ a;
long var10 = var8 ^ 133326475716483L;
String var12 = vm.a<"Å">(-592865278864785114L, var8);

int var10000;
label35: {
label34: {
try {
var10000 = var3 & 1;
if (var12 != null) {
break label35;
}

if (var10000 == 0) {
break label34;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -578954394628903028L, var8);
}

var1 = var0.n;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.z;
}

try {
lp var15 = var0.m(var1, var10, var2);
if (var6 > 0L && vm.a<"Å">(-578216759590917784L, var8) != null) {
vm.a<"Å">("HXlqvb", -597185986396064751L, var8);
}

return var15;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -578954394628903028L, var8);
}
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 16165718265326L;
String var10000 = this.n;
float var10001 = this.z;
return a<"p">(32223, 1856241934638066346L ^ var1) + var10000 + a<"p">(2504, 4571395632793738943L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 105359730668073L;
String var10000 = vm.a<"Å">(-3242449956913338909L, var1);
int var4 = this.n.hashCode();
String var3 = var10000;
var4 = var4 * (int)f + Float.hashCode(this.z);

try {
if (var3 != null) {
vm.a<"Å">(new _g[4], -3221520096628254345L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -3228486296089982135L, var1);
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
// 00: getstatic su/catlean/lp.a J
// 03: ldc2_w 31846485179723
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -7177959533609915775
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -7183135897495714773
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -7183135897495714773
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/lp
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -7183135897495714773
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -7183135897495714773
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/lp
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/lp.n Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/lp.n Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -7183135897495714773
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -7183135897495714773
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/lp.z F
// 92: aload 5
// 94: getfield su/catlean/lp.z F
// 97: invokestatic java/lang/Float.compare (FF)I
// 9a: aload 4
// 9c: ifnonnull bc
// 9f: ifeq bb
// a2: goto af
// a5: ldc2_w -7183135897495714773
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -7183135897495714773
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

private static final void L(lp var0) {
long var1 = a ^ 62513487973626L;
long var3 = var1 ^ 17945972077047L;
class_1144 var10000 = zf.F(var3).method_1483();
class_3414 var5 = var0.c;
class_3419 var6 = class_3419.field_15246;
class_5819 var7 = class_1113.method_43221();
var10000.method_4873((class_1113)(new _p(var5, var6, var7)));
}

private static final void K(double var0, double var2, double var4, lp var6) {
long var7 = a ^ 48692344547724L;
long var9 = var7 ^ 42274407425024L;
zf.z(var9).method_8486(var0, var2, var4, var6.c, class_3419.field_15248, var6.z, 1.0F, true);
}

public static void e(int[] var0) {
K = var0;
}

public static int[] n() {
return K;
}

static {
long var14 = a ^ 93369187949011L;
int[] var10000 = new int[4];
vm.a<"Å">(var10000, -541825033230393727L, var14);
Cipher var5;
Cipher var18 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[7];
int var10 = 0;
String var9 = "ÅÕj\u009bZ\u008c§)·2S?\u0091UÞv6u[s»ó\"õ¸®çîÊZÏÍ\u0010Ó´\u009e¡ò«h-L#\u0011\u000eä\u009cÈ;\u00185ÅÑ!=Ë!ì\u0097a0ÑªÊó²ã\u008fh\u0086\u001a\u001b{õ\u0010»&±R\u0006LÉ¼8Â\u0089åþo¾i0@)\u0018\u009eÉÈPáBlïzñ¨\u0087\u0007Kð$\u000fò\u0010Ôµ\u000e\u0006S&r\u0083ú\u0013jo\u0012S6\u008c-ß\fn\u0013\u001f$mÅF";
int var11 = "ÅÕj\u009bZ\u008c§)·2S?\u0091UÞv6u[s»ó\"õ¸®çîÊZÏÍ\u0010Ó´\u009e¡ò«h-L#\u0011\u000eä\u009cÈ;\u00185ÅÑ!=Ë!ì\u0097a0ÑªÊó²ã\u008fh\u0086\u001a\u001b{õ\u0010»&±R\u0006LÉ¼8Â\u0089åþo¾i0@)\u0018\u009eÉÈPáBlïzñ¨\u0087\u0007Kð$\u000fò\u0010Ôµ\u000e\u0006S&r\u0083ú\u0013jo\u0012S6\u008c-ß\fn\u0013\u001f$mÅF"
.length();
char var8 = ' ';
int var17 = -1;

label37:
while (true) {
String var19 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
String var27 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var27;
if ((var17 += var8) >= var11) {
b = var12;
d = new String[7];
Cipher var0;
Cipher var21 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var21.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1407762333045233855L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var31 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var31;
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var27;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "\n\u0087x\u001dnJ\u0091åõ®Ì\u0011t^M³>\u0094\u0014·-òÝÇ (\u0000'Ððy\u009e\u0010\u009c2å&\u0007³õI½\u001fÅÆû\u0096zÀ";
var11 = "\n\u0087x\u001dnJ\u0091åõ®Ì\u0011t^M³>\u0094\u0014·-òÝÇ (\u0000'Ððy\u009e\u0010\u009c2å&\u0007³õI½\u001fÅÆû\u0096zÀ".length();
var8 = ' ';
var17 = -1;
}

var19 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31455;
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
throw new RuntimeException("su/catlean/lp", var10);
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
throw new RuntimeException("su/catlean/lp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
