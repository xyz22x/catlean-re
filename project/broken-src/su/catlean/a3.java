package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

public abstract class a3 {
@NotNull
private final String L;
@NotNull
private final String d;
private static _g[] H;
private static final long a = yz.a(-3293937965191506912L, -6601232492868737155L, MethodHandles.lookup().lookupClass()).a(11271304481541L);
private static final String[] c;
private static final String[] e;
private static final Map f = new HashMap(13);

public a3(long a, @NotNull String name) {
ax = a ^ ax;
long var10001 = ax ^ 93897461427013L;
int var4 = (int)((ax ^ 93897461427013L) >>> 32);
int var5 = (int)((ax ^ 93897461427013L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(name, a<"s">(26118, 2965668006841850007L ^ ax));
super();
this.L = name;
String var10002 = this.L;
this.d = i4.h.E(var4, a<"s">(26068, 1439037480054561610L ^ ax) + var10002, var5, new Object[0], var6);
}

@NotNull
public final String E() {
return this.L;
}

public abstract void l(@NotNull LiteralArgumentBuilder var1, long var2);

public final void q(long a, @NotNull CommandDispatcher dispatcher) {
ax = a ^ ax;
long var4 = ax ^ 48502509680065L;
Intrinsics.checkNotNullParameter(dispatcher, a<"s">(23305, 6652015202535004249L ^ ax));
LiteralArgumentBuilder var6 = LiteralArgumentBuilder.literal(this.L);
Intrinsics.checkNotNull(var6);
this.l(var6, var4);
dispatcher.register(var6);
}

@NotNull
public final RequiredArgumentBuilder j(@NotNull String name, @NotNull ArgumentType type, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(name, a<"s">(19557, 5844530683590847825L ^ ax));
vm.a<"Å">(-7267751676784076691L, ax);
Intrinsics.checkNotNullParameter(type, a<"s">(19459, 8210955457299623216L ^ ax));

try {
RequiredArgumentBuilder var10000 = RequiredArgumentBuilder.argument(name, type);
Intrinsics.checkNotNullExpressionValue(var10000, a<"s">(14510, 1369458740062443928L ^ ax));
if (vm.a<"Å">(-7276788263415347822L, ax) != null) {
vm.a<"Å">(new _g[1], -7243067664372291136L, ax);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -7303506338034073054L, ax);
}
}

@NotNull
public final LiteralArgumentBuilder c(long a, @NotNull String name) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(name, a<"s">(26118, 2965649103474320984L ^ ax));
LiteralArgumentBuilder var10000 = LiteralArgumentBuilder.literal(name);
Intrinsics.checkNotNullExpressionValue(var10000, a<"s">(28576, 7748257090975199227L ^ ax));
return var10000;
}

public final void a(@NotNull String msg, long a) {
ax = a ^ ax;
long var4 = ax ^ 137557489866392L;
long var6 = ax ^ 71489716120494L;
Intrinsics.checkNotNullParameter(msg, a<"s">(3961, 4735516704726934589L ^ ax));
this.C(zm.G(var4, msg), var6);
}

public final void C(@NotNull class_2561 msg, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/a3.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 114361554289630
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 49826151067916
// 12: lxor
// 13: lstore 6
// 15: dup2
// 16: ldc2_w 122950876724197
// 19: lxor
// 1a: lstore 8
// 1c: dup2
// 1d: ldc2_w 57921009132821
// 20: lxor
// 21: lstore 10
// 23: dup2
// 24: ldc2_w 15343900622634
// 27: lxor
// 28: lstore 12
// 2a: pop2
// 2b: ldc2_w 3257445862645673594
// 2e: lload 2
// 2f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: aload 1
// 35: sipush 18897
// 38: ldc2_w 7953939281799716596
// 3b: lload 2
// 3c: lxor
// 3d: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/a3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 45: astore 14
// 47: lload 8
// 49: invokestatic su/catlean/zm.B (J)Lnet/minecraft/class_5250;
// 4c: lload 10
// 4e: ldc ">"
// 50: invokestatic su/catlean/zm.D (Lnet/minecraft/class_5250;JLjava/lang/String;)Lnet/minecraft/class_5250;
// 53: lload 4
// 55: dup2_x1
// 56: pop2
// 57: ldc " "
// 59: invokestatic su/catlean/zm.E (JLnet/minecraft/class_5250;Ljava/lang/String;)Lnet/minecraft/class_5250;
// 5c: astore 15
// 5e: aload 15
// 60: aload 1
// 61: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
// 64: pop
// 65: lload 6
// 67: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6a: aload 14
// 6c: ifnull c1
// 6f: invokevirtual net/minecraft/class_310.method_18854 ()Z
// 72: ifeq bc
// 75: goto 82
// 78: ldc2_w 3221125096754967605
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: lload 12
// 84: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 87: aload 15
// 89: checkcast net/minecraft/class_2561
// 8c: bipush 0
// 8d: invokevirtual net/minecraft/class_746.method_7353 (Lnet/minecraft/class_2561;Z)V
// 90: aload 14
// 92: ifnonnull cb
// 95: goto a2
// 98: ldc2_w 3221125096754967605
// 9b: lload 2
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: bipush 3
// a3: anewarray 153
// a6: ldc2_w 3270324167993272159
// a9: lload 2
// aa: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: goto bc
// b2: ldc2_w 3221125096754967605
// b5: lload 2
// b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bb: athrow
// bc: lload 6
// be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// c1: aload 15
// c3: invokedynamic run (Lnet/minecraft/class_5250;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/a3.n (Lnet/minecraft/class_5250;)V, ()V ]
// c8: invokevirtual net/minecraft/class_310.method_40000 (Ljava/lang/Runnable;)V
// cb: return
}

private static final void n(class_5250 var0) {
long var1 = a ^ 99552141081273L;
long var3 = var1 ^ 28881855020570L;
zf.v(var3).method_7353((class_2561)var0, false);
}

public static void Z(_g[] var0) {
H = var0;
}

public static _g[] S() {
return H;
}

static {
long var9 = a ^ 56869212652252L;
_g[] var10000 = new _g[4];
vm.a<"Å">(var10000, -3154475442261662078L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[9];
int var5 = 0;
String var4 = "úç£ç¾·¨9H\u0005~w´\u0005\u0016êÍÒ®°\u0099Á^¨ö{Y\u0099K\u0088=¿\u0018\u0007\u008cf¬\u009fÎb©\u0003E\u009au^h´m\u0081§øçKí\u0001Z\u0018\b\u0088Ãz\u0089\u0095ïOIÁ\u0004\u0099¶g\u009aõ[%Q¯yDøú\u0010\u00ad6b}\u0007\"/xÿH\u001b¿oìU%\u0010^é\u001b\u0098\u0001!¡\u0094à\u009fç\u0084~_Äì\u0010ù_e\u008e.3\b\u0088|®\u008b{b\u0090Æ\u009e\u0010]ÿ \u00934ÞÈ#\u0090!j±\u000eé¿\u000b";
int var6 = "úç£ç¾·¨9H\u0005~w´\u0005\u0016êÍÒ®°\u0099Á^¨ö{Y\u0099K\u0088=¿\u0018\u0007\u008cf¬\u009fÎb©\u0003E\u009au^h´m\u0081§øçKí\u0001Z\u0018\b\u0088Ãz\u0089\u0095ïOIÁ\u0004\u0099¶g\u009aõ[%Q¯yDøú\u0010\u00ad6b}\u0007\"/xÿH\u001b¿oìU%\u0010^é\u001b\u0098\u0001!¡\u0094à\u009fç\u0084~_Äì\u0010ù_e\u008e.3\b\u0088|®\u008b{b\u0090Æ\u009e\u0010]ÿ \u00934ÞÈ#\u0090!j±\u000eé¿\u000b"
.length();
char var3 = ' ';
int var12 = -1;

label27:
while (true) {
String var14 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var12 += var3) >= var6) {
c = var7;
e = new String[9];
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var20;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "ë9\u0011<*ëö÷º\u009d\u009c·N@?q(©àÜO\u0013\u00119\u0010\u0085E¯u1²ãüÄFÛn\u009dc¡1Ð*\u009e¾SÙ\u0083ü)\u009dô8þ\u0098¢G";
var6 = "ë9\u0011<*ëö÷º\u009d\u009c·N@?q(©àÜO\u0013\u00119\u0010\u0085E¯u1²ãüÄFÛn\u009dc¡1Ð*\u009e¾SÙ\u0083ü)\u009dô8þ\u0098¢G".length();
var3 = 16;
var12 = -1;
}

var14 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31589;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/a3", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/a3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
