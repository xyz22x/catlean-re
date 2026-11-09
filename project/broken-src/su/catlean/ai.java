package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
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
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

public final class ai extends a3 {
@NotNull
public static final ai W;
private static final long b = yz.a(-2463097534484928126L, -764143306516214348L, MethodHandles.lookup().lookupClass()).a(53855180085146L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);

private ai(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 100938899573221L;
super(var3, b<"d">(13589, 614908245055901819L ^ var1));
}

@Override
public void l(@NotNull LiteralArgumentBuilder builder, long a) {
long var4 = a ^ 61473902788714L;
Intrinsics.checkNotNullParameter(builder, b<"d">(785, 8330185425017860176L ^ a));
String var10002 = b<"d">(29590, 2231688508753838293L ^ a);
StringArgumentType var10003 = StringArgumentType.string();
Intrinsics.checkNotNullExpressionValue(var10003, b<"d">(941, 665617550002581739L ^ a));
RequiredArgumentBuilder var10001 = this.j(var10002, (ArgumentType)var10003, var4);
String var6 = b<"d">(25162, 624910127891616008L ^ a);
StringArgumentType var10004 = StringArgumentType.string();
Intrinsics.checkNotNullExpressionValue(var10004, b<"d">(11965, 3352702118571007482L ^ a));
((LiteralArgumentBuilder)builder.then(var10001.then(this.j(var6, (ArgumentType)var10004, var4).executes(ai::l)))).executes(ai::j);
}

private static final float a(String param0, float param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ai.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -5015834358632833327
// 09: lload 2
// 0a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 0
// 12: aload 4
// 14: ifnonnull 6e
// 17: ldc "~"
// 19: bipush 0
// 1a: bipush 2
// 1b: aconst_null
// 1c: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
// 1f: ifeq 6d
// 22: goto 2f
// 25: ldc2_w -5004014643552690374
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: lload 2
// 30: lconst_0
// 31: lcmp
// 32: ifle 63
// 35: aload 0
// 36: ldc "~"
// 38: checkcast java/lang/CharSequence
// 3b: invokestatic kotlin/text/StringsKt.removePrefix (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
// 3e: invokestatic kotlin/text/StringsKt.toFloatOrNull (Ljava/lang/String;)Ljava/lang/Float;
// 41: dup
// 42: ifnull 62
// 45: goto 52
// 48: ldc2_w -5004014643552690374
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: invokevirtual java/lang/Float.floatValue ()F
// 55: goto 64
// 58: ldc2_w -5004014643552690374
// 5b: lload 2
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: pop
// 63: fconst_0
// 64: fstore 5
// 66: fload 1
// 67: fload 5
// 69: fadd
// 6a: goto 87
// 6d: aload 0
// 6e: invokestatic kotlin/text/StringsKt.toFloatOrNull (Ljava/lang/String;)Ljava/lang/Float;
// 71: dup
// 72: ifnull 85
// 75: invokevirtual java/lang/Float.floatValue ()F
// 78: goto 87
// 7b: ldc2_w -5004014643552690374
// 7e: lload 2
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: pop
// 86: fload 1
// 87: freturn
}

private static final int l(CommandContext var0) {
long var1 = b ^ 32193420269954L;
long var3 = var1 ^ 66553274081908L;
long var5 = var1 ^ 80114111405732L;
String var7 = (String)var0.getArgument(b<"d">(10251, 7427416373014403953L ^ var1), String.class);
String var8 = (String)var0.getArgument(b<"d">(13652, 5300456957859530287L ^ var1), String.class);
class_746 var10000 = zf.v(var5);
Intrinsics.checkNotNull(var7);
var10000.method_36456(a(var7, zf.v(var5).method_36454(), var3));
var10000 = zf.v(var5);
Intrinsics.checkNotNull(var8);
var10000.method_36457(a(var8, zf.v(var5).method_36455(), var3));
return 1;
}

private static final int j(CommandContext var0) {
long var1 = b ^ 62110768415393L;
long var3 = var1 ^ 36385529696515L;
W.a(b<"d">(17765, 2838198213028523319L ^ var1), var3);
return 1;
}

static {
long var9 = b ^ 132266376448068L;
long var11 = var9 ^ 26065744090014L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[9];
int var5 = 0;
String var4 = "%RÑ~uî^\u009f£~§z8\u0007å\u0093\u0094ÛWûH\u008bm_\u0018\u0089\u0081èï\u0013êÛÅO\u0099ö\u0098R\u0087\u0003\u0014Vß\u0014ÈI\u0082\u001fl\u0010&x\fX·\u0087_\u0012ÏÓ\u001ft\u009fs\u0015n\u0010·\u009dê¨ n\u0090\u0007DåK1\u0097\u009bc\u008c\u0010\u0001\bú¿£¬ë@ì¥ðÛ.h\\\u009f\u0010\u0005à\bIÁ\u001aÑüi=Àý®\u0006¯À\u0010@'\u0083:!\u0096ËØ³\u009f7\u0016´Ð^Ò";
int var6 = "%RÑ~uî^\u009f£~§z8\u0007å\u0093\u0094ÛWûH\u008bm_\u0018\u0089\u0081èï\u0013êÛÅO\u0099ö\u0098R\u0087\u0003\u0014Vß\u0014ÈI\u0082\u001fl\u0010&x\fX·\u0087_\u0012ÏÓ\u001ft\u009fs\u0015n\u0010·\u009dê¨ n\u0090\u0007DåK1\u0097\u009bc\u008c\u0010\u0001\bú¿£¬ë@ì¥ðÛ.h\\\u009f\u0010\u0005à\bIÁ\u001aÑüi=Àý®\u0006¯À\u0010@'\u0083:!\u0096ËØ³\u009f7\u0016´Ð^Ò"
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
h = new String[9];
W = new ai(var11);
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

var4 = "\f5´\u009däV¢\u0007h\u0016°\u0004´\u0000EÖ0Äá0\u0003\u0015ï\"CNè_Ø*\u0096eé£Ü.ü\u0085\u0010~æñL\u0099¤`K\u0085\u0004é\r\u0018\u009aÂòw^BÎf\u000bÞ\u009bn©";
var6 = "\f5´\u009däV¢\u0007h\u0016°\u0004´\u0000EÖ0Äá0\u0003\u0015ï\"CNè_Ø*\u0096eé£Ü.ü\u0085\u0010~æñL\u0099¤`K\u0085\u0004é\r\u0018\u009aÂòw^BÎf\u000bÞ\u009bn©"
.length();
var3 = 16;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16050;
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
throw new RuntimeException("su/catlean/ai", var10);
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
throw new RuntimeException("su/catlean/ai" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
