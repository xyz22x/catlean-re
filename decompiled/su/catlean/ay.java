package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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

public final class ay extends a3 {
@NotNull
public static final ay T;
private static final long b = yz.a(-1270856413440841061L, -3374900414026391986L, MethodHandles.lookup().lookupClass()).a(14006675627272L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);

private ay(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 131236193479240L;
super(var3, b<"m">(13656, 4179453710309213405L ^ var1));
}

@Override
public void l(@NotNull LiteralArgumentBuilder builder, long a) {
long var4 = a ^ 131983109906692L;
long var6 = a ^ 61473902788714L;
Intrinsics.checkNotNullParameter(builder, b<"m">(28903, 2240316839564784870L ^ a));
builder.then(this.c(var4, b<"m">(4075, 6283679169002753003L ^ a)).executes(ay::x));
IntegerArgumentType var10003 = IntegerArgumentType.integer();
Intrinsics.checkNotNullExpressionValue(var10003, b<"m">(15036, 7543299571016957624L ^ a));
RequiredArgumentBuilder var10001 = this.j("x", (ArgumentType)var10003, var6);
IntegerArgumentType var10004 = IntegerArgumentType.integer();
Intrinsics.checkNotNullExpressionValue(var10004, b<"m">(20384, 6845230938382306213L ^ a));
builder.then(var10001.then(this.j("z", (ArgumentType)var10004, var6).executes(ay::u)));
builder.executes(ay::M);
}

private static final int x(CommandContext var0) {
pf.E.W(null);
return 1;
}

private static final int u(CommandContext var0) {
Integer var1 = (Integer)var0.getArgument("x", int.class);
Integer var2 = (Integer)var0.getArgument("z", int.class);
pf var10000 = pf.E;
Intrinsics.checkNotNull(var1);
int var10003 = var1;
Intrinsics.checkNotNull(var2);
var10000.W(new class_2338(var10003, 0, var2));
return 1;
}

private static final int M(CommandContext var0) {
long var1 = b ^ 132182692321993L;
long var3 = var1 ^ 29053385802756L;
T.a(b<"m">(15111, 44337535345684763L ^ var1), var3);
return 1;
}

static {
long var9 = b ^ 124824873267617L;
long var11 = var9 ^ 55998433921494L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[6];
int var5 = 0;
String var4 = "(û¸$Ü\u0091ÔkÌ*ÛD¿¡\u0094ïsë<2\u0018é\u008b8 { \u0002UÚu\u0084I\u0081\u008c@\u0096½\u001aß@koÊÅ\u000eõõ7$\"FãQ~m[\u0010âT\u0085\u00adÆ\u0084+\u0001Ð\u0080N\u001dÅT{9 õ)\u009fª\u000b\u009f\u008b\u000eÂ9º\u0081\u0011Õ\u009e\u0098\u009b\u0012Ä}.Ý`«Ì¢*¹\u0011Â|p";
int var6 = "(û¸$Ü\u0091ÔkÌ*ÛD¿¡\u0094ïsë<2\u0018é\u008b8 { \u0002UÚu\u0084I\u0081\u008c@\u0096½\u001aß@koÊÅ\u000eõõ7$\"FãQ~m[\u0010âT\u0085\u00adÆ\u0084+\u0001Ð\u0080N\u001dÅT{9 õ)\u009fª\u000b\u009f\u008b\u000eÂ9º\u0081\u0011Õ\u009e\u0098\u009b\u0012Ä}.Ý`«Ì¢*¹\u0011Â|p"
.length();
char var3 = 24;
int var14 = -1;

label27:
while (true) {
String var15 = var4.substring(++var14, var14 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = b(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var14 += var3) >= var6) {
g = var7;
h = new String[6];
T = new ay(var11);
return;
}

var3 = var4.charAt(var14);
break;
default:
var7[var5++] = var21;
if ((var14 += var3) < var6) {
var3 = var4.charAt(var14);
continue label27;
}

var4 = "\u0005¤\u000bSCgÿÍ\u0019\u0087£\f\u0086bgu\u0010\u0003TIÐ\u0012\u007fPªN\u008a2\u009c[Ì<h";
var6 = "\u0005¤\u000bSCgÿÍ\u0019\u0087£\f\u0086bgu\u0010\u0003TIÐ\u0012\u007fPªN\u008a2\u009c[Ì<h".length();
var3 = 16;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
}
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2544;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ay", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = g[var5].getBytes("ISO-8859-1");
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/ay" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
