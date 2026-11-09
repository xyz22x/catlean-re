package su.catlean;

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
import net.minecraft.class_634;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;

public final class mp implements ArgumentType {
@NotNull
public static final m5 u;
private static final long a = yz.a(-1729799360318192897L, 5627709146117729805L, MethodHandles.lookup().lookupClass()).a(197727308438276L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

@NotNull
public String c(@NotNull StringReader reader, long a) throws CommandSyntaxException {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/mp.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 108974926948204
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -4920338496713285886
// 12: lload 2
// 13: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 1
// 19: sipush 21257
// 1c: ldc2_w 8981055400137723694
// 1f: lload 2
// 20: lxor
// 21: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/mp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: astore 6
// 2b: aload 1
// 2c: invokevirtual com/mojang/brigadier/StringReader.readString ()Ljava/lang/String;
// 2f: astore 7
// 31: lload 4
// 33: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 36: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 39: dup
// 3a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3d: invokevirtual net/minecraft/class_634.method_2880 ()Ljava/util/Collection;
// 40: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
// 45: aload 7
// 47: invokedynamic invoke (Ljava/lang/String;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/mp.F (Ljava/lang/String;Lnet/minecraft/class_640;)Z, (Lnet/minecraft/class_640;)Ljava/lang/Boolean; ]
// 4c: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/mp.k (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 51: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
// 56: invokeinterface java/util/stream/Stream.findFirst ()Ljava/util/Optional; 1
// 5b: aconst_null
// 5c: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
// 5f: checkcast net/minecraft/class_640
// 62: astore 8
// 64: aload 8
// 66: aload 6
// 68: ifnonnull 8f
// 6b: ifnonnull 8d
// 6e: goto 7b
// 71: ldc2_w -4942411822820656537
// 74: lload 2
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Lcom/mojang/brigadier/exceptions/CommandSyntaxException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: aload 7
// 7d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 80: aload 7
// 82: areturn
// 83: ldc2_w -4942411822820656537
// 86: lload 2
// 87: invokedynamic Å (Ljava/lang/Object;JJ)Lcom/mojang/brigadier/exceptions/CommandSyntaxException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: athrow
// 8d: aload 8
// 8f: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 92: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 95: dup
// 96: sipush 25608
// 99: ldc2_w 8249202444469745706
// 9c: lload 2
// 9d: lxor
// 9e: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/mp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a6: areturn
}

@NotNull
public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
long var3 = a ^ 103610618056571L;
long var5 = var3 ^ 135168414808266L;
Intrinsics.checkNotNullParameter(context, a<"f">(20720, 1921184251350193008L ^ var3));
Intrinsics.checkNotNullParameter(builder, a<"f">(2457, 3889266326104951322L ^ var3));
class_634 var10000 = zf.F(var5).method_1562();
Intrinsics.checkNotNull(var10000);
CompletableFuture var7 = class_2172.method_9264(var10000.method_2880().stream().map(mp::E), builder);
Intrinsics.checkNotNullExpressionValue(var7, a<"f">(14510, 8440773665024015147L ^ var3));
return var7;
}

@NotNull
public List h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 30747113000016L;
class_634 var10000 = zf.F(var3).method_1562();
Intrinsics.checkNotNull(var10000);
List var6 = var10000.method_2880().stream().map(mp::t).limit(e).toList();
Intrinsics.checkNotNullExpressionValue(var6, a<"f">(3255, 4179077760010435503L ^ var1));
return var6;
}

private static final boolean F(String var0, class_640 var1) {
return Intrinsics.areEqual(var0, var1.method_2966().name());
}

private static final boolean k(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final String Z(class_640 var0) {
return var0.method_2966().name();
}

private static final String E(Function1 var0, Object var1) {
return (String)var0.invoke(var1);
}

private static final String T(class_640 var0) {
return var0.method_2966().name();
}

private static final String t(Function1 var0, Object var1) {
return (String)var0.invoke(var1);
}

public Object parse(StringReader p0) {
long var2 = a ^ 23098167704667L;
long var4 = var2 ^ 118527389533822L;
return this.c(p0, var4);
}

public Collection getExamples() {
long var1 = a ^ 65779976840107L;
long var3 = var1 ^ 68121632207538L;
return this.h(var3);
}

static {
long var5 = a ^ 5251964461850L;
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
String var11 = "e\u0086»q$·cN²ËÏêË[+à\u0010\u008f\u009f7\u0089\u0092\u0001pPûÑ\f¾\u0003Ë´\u0005\u0018*\u0087Æ:ç(EaNíô\u009f\u001cËé,D¢Cð!Á\u0085U\u0010\u0093P¥%°\u0082\u009c\t?ó\u0013f Z<â";
int var13 = "e\u0086»q$·cN²ËÏêË[+à\u0010\u008f\u009f7\u0089\u0092\u0001pPûÑ\f¾\u0003Ë´\u0005\u0018*\u0087Æ:ç(EaNíô\u009f\u001cËé,D¢Cð!Á\u0085U\u0010\u0093P¥%°\u0082\u009c\t?ó\u0013f Z<â"
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
long var2 = 8934996591598033391L;
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
u = new m5(null);
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

var11 = "2¾ã\u00830Çmþæ\u0090\u00ad¨T×ÊíÄ³l²SKvd¨°Û=\u00076.Ê Bü`;\u0091®\u0081\fñà|¯ó¸\u00925)\tàx\u001c»ä³¥¹9\f\u009fí¬B";
var13 = "2¾ã\u00830Çmþæ\u0090\u00ad¨T×ÊíÄ³l²SKvd¨°Û=\u00076.Ê Bü`;\u0091®\u0081\fñà|¯ó¸\u00925)\tàx\u001c»ä³¥¹9\f\u009fí¬B".length();
var10 = ' ';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26115;
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
throw new RuntimeException("su/catlean/mp", var10);
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
throw new RuntimeException("su/catlean/mp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
