package su.catlean;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class fk implements ArgumentType {
@NotNull
public static final ou V;
@NotNull
private static final Collection P;
private static final long a = yz.a(5789928076481872052L, 2748609643139066356L, MethodHandles.lookup().lookupClass()).a(176405931892900L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public _g B(long a, @NotNull StringReader reader) throws CommandSyntaxException {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fk.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 5433593407441
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 4500824969243728579
// 12: lload 1
// 13: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 3
// 19: sipush 28043
// 1c: ldc2_w 8219192432758669269
// 1f: lload 1
// 20: lxor
// 21: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/fk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: astore 6
// 2b: aload 6
// 2d: ifnonnull 6e
// 30: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 33: aload 3
// 34: invokevirtual com/mojang/brigadier/StringReader.readString ()Ljava/lang/String;
// 37: dup
// 38: sipush 29750
// 3b: ldc2_w 8221713854029309545
// 3e: lload 1
// 3f: lxor
// 40: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/fk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 48: lload 4
// 4a: dup2_x1
// 4b: pop2
// 4c: invokevirtual su/catlean/iq.R (JLjava/lang/String;)Lsu/catlean/_g;
// 4f: dup
// 50: ifnonnull 82
// 53: goto 60
// 56: ldc2_w 4535168202860740104
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Lcom/mojang/brigadier/exceptions/CommandSyntaxException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: pop
// 61: goto 6e
// 64: ldc2_w 4535168202860740104
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Lcom/mojang/brigadier/exceptions/CommandSyntaxException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: new com/mojang/brigadier/exceptions/DynamicCommandExceptionType
// 71: dup
// 72: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/fk.s (Ljava/lang/Object;)Lcom/mojang/brigadier/Message;, (Ljava/lang/Object;)Lcom/mojang/brigadier/Message; ]
// 77: invokespecial com/mojang/brigadier/exceptions/DynamicCommandExceptionType.<init> (Ljava/util/function/Function;)V
// 7a: aload 3
// 7b: invokevirtual com/mojang/brigadier/StringReader.readString ()Ljava/lang/String;
// 7e: invokevirtual com/mojang/brigadier/exceptions/DynamicCommandExceptionType.create (Ljava/lang/Object;)Lcom/mojang/brigadier/exceptions/CommandSyntaxException;
// 81: athrow
// 82: areturn
}

@NotNull
public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
long var3 = a ^ 100209053376683L;
Intrinsics.checkNotNullParameter(context, a<"r">(16350, 7259945514693357417L ^ var3));
Intrinsics.checkNotNullParameter(builder, a<"r">(31339, 2488889992513006298L ^ var3));
CompletableFuture var10000 = class_2172.method_9264(iq.a.L().stream().map(fk::n), builder);
Intrinsics.checkNotNullExpressionValue(var10000, a<"r">(32183, 7455768606363495681L ^ var3));
return var10000;
}

@NotNull
public Collection getExamples() {
return P;
}

private static final Message s(Object var0) {
long var1 = a ^ 135140641234311L;
long var10001 = var1 ^ 18465753968277L;
int var3 = (int)((var1 ^ 18465753968277L) >>> 32);
int var4 = (int)((var1 ^ 18465753968277L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
i4 var10000 = i4.h;
String var10002 = a<"r">(10598, 2193393390448968953L ^ var1);
Object[] var6 = new Object[1];
Intrinsics.checkNotNull(var0);
var6[0] = var0;
return (Message)class_2561.method_43470(var10000.E(var3, var10002, var4, var6, var5));
}

private static final String p(_g var0) {
return var0.U();
}

private static final String n(Function1 var0, Object var1) {
return (String)var0.invoke(var1);
}

private static final String k(_g var0) {
return var0.U();
}

private static final String d(Function1 var0, Object var1) {
return (String)var0.invoke(var1);
}

public Object parse(StringReader p0) {
long var2 = a ^ 101052041986731L;
long var4 = var2 ^ 126887908359503L;
return this.B(var4, p0);
}

static {
long var16 = a ^ 67424223862816L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[7];
int var12 = 0;
String var11 = "v\u001877\u001d\u0002¢ë¶D\u0087ÓÖé¦k\u0018å\u0084\u0018&ªÝÐ\u0000!0DðE·+ÿÆ®«\u009cð)Õ\u0089\u0010µàsø,S\u0006u43s½W½Ô\u0018 \u00184É=©\u0086zi¸e\u009bC\u0090cKz\u0000üÆÒå\u0090Li\u008cÆà\u0086î-Ø<\u0010Í=VT!\u000b\u000fûb\u0088ª/\u008eÎUN";
int var13 = "v\u001877\u001d\u0002¢ë¶D\u0087ÓÖé¦k\u0018å\u0084\u0018&ªÝÐ\u0000!0DðE·+ÿÆ®«\u009cð)Õ\u0089\u0010µàsø,S\u0006u43s½W½Ô\u0018 \u00184É=©\u0086zi¸e\u009bC\u0090cKz\u0000üÆÒå\u0090Li\u008cÆà\u0086î-Ø<\u0010Í=VT!\u000b\u000fûb\u0088ª/\u008eÎUN"
.length();
char var10 = 16;
int var20 = -1;

label37:
while (true) {
String var21 = var11.substring(++var20, var20 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var21.getBytes("ISO-8859-1"));
String var29 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var29;
if ((var20 += var10) >= var13) {
b = var14;
c = new String[7];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 8848106031710839409L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var33 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var33;
V = new ou(null);
List var18 = iq.a.L().stream().map(fk::d).limit(var0).toList();
Intrinsics.checkNotNullExpressionValue(var18, a<"r">(13225, 2557882864415728530L ^ var16));
P = var18;
return;
}

var10 = var11.charAt(var20);
break;
default:
var14[var12++] = var29;
if ((var20 += var10) < var13) {
var10 = var11.charAt(var20);
continue label37;
}

var11 = "ßnÒ¸\u0006[\u0095P<b\u0080Ø\u0015\u008dn\u000f[\u008e<Vp¬.\u0002w×\u000bÀ~H3á(\u009b#jË¿òÊÂÑ1\u0082\u008açq·h$[þÇÜ§¥ìÓkqúz®k\u0096\u0082VH\u0006-3\n\u000f";
var13 = "ßnÒ¸\u0006[\u0095P<b\u0080Ø\u0015\u008dn\u000f[\u008e<Vp¬.\u0002w×\u000bÀ~H3á(\u009b#jË¿òÊÂÑ1\u0082\u008açq·h$[þÇÜ§¥ìÓkqúz®k\u0096\u0082VH\u0006-3\n\u000f"
.length();
var10 = ' ';
var20 = -1;
}

var21 = var11.substring(++var20, var20 + var10);
var10001 = 0;
}
}
}

private static CommandSyntaxException a(CommandSyntaxException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28090;
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
throw new RuntimeException("su/catlean/fk", var10);
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
throw new RuntimeException("su/catlean/fk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
