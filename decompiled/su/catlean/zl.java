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

public final class zl {
@NotNull
private final class_2338 v;
@NotNull
private final class_2350 D;
private static final long a = yz.a(172878911480562013L, 2275872102176327809L, MethodHandles.lookup().lookupClass()).a(181153028627339L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public zl(@NotNull class_2338 position, long a, @NotNull class_2350 facing) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(position, a<"j">(10309, 4677613425925580676L ^ ax));
Intrinsics.checkNotNullParameter(facing, a<"j">(20136, 4172177783598940520L ^ ax));
super();
this.v = position;
this.D = facing;
}

@NotNull
public final class_2338 v() {
return this.v;
}

@NotNull
public final class_2350 p() {
return this.D;
}

@NotNull
public final class_2338 C() {
return this.v;
}

@NotNull
public final class_2350 P() {
return this.D;
}

@NotNull
public final zl G(@NotNull class_2338 position, long a, @NotNull class_2350 facing) {
ax = a ^ ax;
long var5 = ax ^ 140317189530282L;
Intrinsics.checkNotNullParameter(position, a<"j">(22099, 4513540417078342646L ^ ax));
Intrinsics.checkNotNullParameter(facing, a<"j">(14165, 7776522518343635702L ^ ax));
return new zl(position, var5, facing);
}

public static zl F(zl var0, class_2338 var1, class_2350 var2, int var3, long var4, Object var6) {
var4 = a ^ var4;
long var7 = var4 ^ 22539640073235L;
_g[] var9 = vm.a<"Å">(2989415047897208964L, var4);

int var10000;
label25: {
label24: {
try {
var10000 = var3 & 1;
if (var9 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 3026233070608987800L, var4);
}

var1 = var0.v;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.D;
}

return var0.G(var1, var7, var2);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 42387718492353L;
class_2338 var10000 = this.v;
class_2350 var10001 = this.D;
return a<"j">(9688, 7686091467158443165L ^ var1) + var10000 + a<"j">(15902, 8629236767529062237L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 59329057803189L;
int var3 = this.v.hashCode();
return var3 * (int)e + this.D.hashCode();
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
// 00: getstatic su/catlean/zl.a J
// 03: ldc2_w 93743610840326
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8321634969465881221
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -8358607508957654169
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -8358607508957654169
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/zl
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -8358607508957654169
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -8358607508957654169
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/zl
// 5f: astore 5
// 61: aload 0
// 62: aload 4
// 64: ifnonnull 8f
// 67: getfield su/catlean/zl.v Lnet/minecraft/class_2338;
// 6a: aload 5
// 6c: getfield su/catlean/zl.v Lnet/minecraft/class_2338;
// 6f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -8358607508957654169
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -8358607508957654169
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/zl.D Lnet/minecraft/class_2350;
// 92: aload 5
// 94: getfield su/catlean/zl.D Lnet/minecraft/class_2350;
// 97: if_acmpeq a6
// 9a: bipush 0
// 9b: ireturn
// 9c: ldc2_w -8358607508957654169
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: bipush 1
// a7: ireturn
}

static {
long var5 = a ^ 136723335459696L;
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
String var11 = "\u0081\u008d!\u0098ç(Ý\u0002\u0083î*\u007fV\u0095È·\u0018]ò\u009d\u009fRòû\u0015\u001aP(ò^F¡5Î\nÜ_\u00156ÄÊ \u0096ì\u001bÐ\u0002\u0011÷~*Ó´OF\u0081\u0081\u0002ÎX\u0081ÏÀ\u0088<\u0000¨É^XïKÕÃ\u0018\u0095(\u0089\u0017þö\u008cÜ6l¸}jÎ\u0089Mï\u0092\u0098Ñ\u009b\u0005yÐ";
int var13 = "\u0081\u008d!\u0098ç(Ý\u0002\u0083î*\u007fV\u0095È·\u0018]ò\u009d\u009fRòû\u0015\u001aP(ò^F¡5Î\nÜ_\u00156ÄÊ \u0096ì\u001bÐ\u0002\u0011÷~*Ó´OF\u0081\u0081\u0002ÎX\u0081ÏÀ\u0088<\u0000¨É^XïKÕÃ\u0018\u0095(\u0089\u0017þö\u008cÜ6l¸}jÎ\u0089Mï\u0092\u0098Ñ\u009b\u0005yÐ"
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
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 8373937569478411055L;
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

var11 = "Uu\u001bÎ\u0012\u009e\u008bY>\u0096\u008a¼òýÉ\u0099âjnêi\u001e\u0080ñ\u0000QÈJ(\u001aÈq¿ä©(\u0010\u0084#\u009a\u0098ä±\u008d\u0011pÛèÑ\u0003\u001d/\u008b\u0080#j\u0010\u001aúó\u000ejÚv\u0085QÈ1«\u0092\u0004\u009eP";
var13 = "Uu\u001bÎ\u0012\u009e\u008bY>\u0096\u008a¼òýÉ\u0099âjnêi\u001e\u0080ñ\u0000QÈJ(\u001aÈq¿ä©(\u0010\u0084#\u009a\u0098ä±\u008d\u0011pÛèÑ\u0003\u001d/\u008b\u0080#j\u0010\u001aúó\u000ejÚv\u0085QÈ1«\u0092\u0004\u009eP"
.length();
var10 = '8';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26956;
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
throw new RuntimeException("su/catlean/zl", var10);
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
throw new RuntimeException("su/catlean/zl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
