package su.catlean;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class s5 implements ArgumentType {
@NotNull
public static final li n;
private static final long a = yz.a(6960106126537031823L, 4426036122259795337L, MethodHandles.lookup().lookupClass()).a(44125390255755L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

@NotNull
public String i(@NotNull StringReader reader, long a) throws CommandSyntaxException {
ax = a ^ ax;
long var4 = ax ^ 3990445543734L;
Intrinsics.checkNotNullParameter(reader, a<"k">(27312, 4817735605197482676L ^ ax));
String var6 = reader.readString();

try {
c7 var10000 = c7.b;
Intrinsics.checkNotNull(var6);
if (!var10000.Y(var4, var6)) {
throw new DynamicCommandExceptionType(s5::Z).create(var6);
} else {
return var6;
}
} catch (CommandSyntaxException var7) {
throw vm.a<"Å">(var7, -6765091997244995899L, ax);
}
}

@NotNull
public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
long var3 = a ^ 110242762018693L;
long var5 = var3 ^ 92086183415732L;
Intrinsics.checkNotNullParameter(context, a<"k">(8557, 416889090985519020L ^ var3));
Intrinsics.checkNotNullParameter(builder, a<"k">(32669, 830986921541777755L ^ var3));
CompletableFuture var10000 = class_2172.method_9265(yl.g.g().P(var5), builder);
Intrinsics.checkNotNullExpressionValue(var10000, a<"k">(25882, 5987441663528870877L ^ var3));
return var10000;
}

@NotNull
public List O(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 103621164126339L;
List var10000 = yl.g.g().P(var3).stream().limit(e).toList();
Intrinsics.checkNotNullExpressionValue(var10000, a<"k">(21817, 2003225257559821515L ^ var1));
return var10000;
}

private static final Message Z(Object var0) {
long var1 = a ^ 10291633808944L;
long var10001 = var1 ^ 19916609839868L;
int var3 = (int)((var1 ^ 19916609839868L) >>> 32);
int var4 = (int)((var1 ^ 19916609839868L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
i4 var10000 = i4.h;
String var10002 = a<"k">(5684, 2765231320088344897L ^ var1);
Object[] var6 = new Object[1];
Intrinsics.checkNotNull(var0);
var6[0] = var0;
return (Message)class_2561.method_43470(var10000.E(var3, var10002, var4, var6, var5));
}

public Object parse(StringReader p0) {
long var2 = a ^ 47099324903390L;
long var4 = var2 ^ 97334481849569L;
return this.i(p0, var4);
}

public Collection getExamples() {
long var1 = a ^ 23635178912611L;
long var3 = var1 ^ 135707038925227L;
return this.O(var3);
}

static {
long var5 = a ^ 84087809265051L;
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
String var11 = "¼3Å¬åd\u0084\"]R¡>N\"þû\u0018{ ÷Ë\u001döSã^«\u001dÅ¾LPÉc`\u008c\u0082\u008a g\u0099\u0010Ë\u0006pñ\u001f\u001b²æß¤îò·\u000f'Ä\u0018 \u008e³Î\u00105Ï\u0015ôZ\u008aêø¯±\u0091NH±\u001atµF(";
int var13 = "¼3Å¬åd\u0084\"]R¡>N\"þû\u0018{ ÷Ë\u001döSã^«\u001dÅ¾LPÉc`\u008c\u0082\u008a g\u0099\u0010Ë\u0006pñ\u001f\u001b²æß¤îò·\u000f'Ä\u0018 \u008e³Î\u00105Ï\u0015ôZ\u008aêø¯±\u0091NH±\u001atµF("
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
long var2 = -2952240849207881282L;
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
n = new li(null);
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

var11 = "X\u0016ï\u009c 2+\u001a)\u0011\u0098é~Ö]0\u008d\u00adû£ém)ÍÄø9ùù\tÒE\u001f\u008bÂ\u0082Y\u0097t\u0012ôK\u0098\u0095+ÆÀ\u0083\u0010?óq\u0086\u009b\u0014+?^\u0080\u008a\b\u0094d×<";
var13 = "X\u0016ï\u009c 2+\u001a)\u0011\u0098é~Ö]0\u008d\u00adû£ém)ÍÄø9ùù\tÒE\u001f\u008bÂ\u0082Y\u0097t\u0012ôK\u0098\u0095+ÆÀ\u0083\u0010?óq\u0086\u009b\u0014+?^\u0080\u008a\b\u0094d×<"
.length();
var10 = '0';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25403;
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
throw new RuntimeException("su/catlean/s5", var10);
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
throw new RuntimeException("su/catlean/s5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
