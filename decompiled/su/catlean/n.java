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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class n implements ArgumentType {
@NotNull
public static final x7 I;
private static final long a = yz.a(-5233322082850419700L, -710600978650939526L, MethodHandles.lookup().lookupClass()).a(101134420975269L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@NotNull
public String x(long a, int a, @NotNull StringReader reader) throws CommandSyntaxException {
long var5 = (axx << 32 | (long)ax << 32 >>> 32) ^ a;
long var7 = var5 ^ 2941683773583L;
Intrinsics.checkNotNullParameter(reader, a<"o">(31278, 7563297520348462343L ^ var5));
String var10000 = reader.readString();
Intrinsics.checkNotNullExpressionValue(var10000, a<"o">(14591, 4888247919540486099L ^ var5));
String var10 = var10000;
Iterable var11 = yl.g.l().F(var7);
int[] var24 = vm.a<"Å">(399759321188999481L, var5);
boolean var12 = false;
int[] var9 = var24;
var var14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var11, b<"a">(21790, 7422600703021912575L ^ var5)));
boolean var15 = false;
Iterator var16 = var11.iterator();

label42:
while (true) {
if (var16.hasNext()) {
Object var17 = var16.next();
y_ var18 = (y_)var17;
ArrayList var20 = var14;
boolean var19 = false;

try {
var10000 = var18.q();
if (axx < 0L) {
return var10000;
}

var20.add(var10000);
} catch (CommandSyntaxException var22) {
throw vm.a<"Å">(var22, 353462034338680099L, var5);
}

do {
try {
if (var9 != null) {
return var10;
}

if (var9 == null) {
continue label42;
}
} catch (CommandSyntaxException var23) {
throw vm.a<"Å">(var23, 353462034338680099L, var5);
}
} while (ax > 0);
}

try {
if (!var14.contains(var10)) {
throw new DynamicCommandExceptionType(n::Y).create(var10);
}

return var10;
} catch (CommandSyntaxException var21) {
throw vm.a<"Å">(var21, 353462034338680099L, var5);
}
}
}

@NotNull
public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
long var3 = a ^ 38999919535357L;
long var5 = var3 ^ 25376761525244L;
int[] var10000 = vm.a<"Å">(504173654972572234L, var3);
Intrinsics.checkNotNullParameter(context, a<"o">(7346, 8993489609513703660L ^ var3));
int[] var7 = var10000;
Intrinsics.checkNotNullParameter(builder, a<"o">(27112, 8886777943327010227L ^ var3));
Iterable var8 = yl.g.l().F(var5);
boolean var9 = false;
var var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var8, b<"a">(8195, 4559036549332461456L ^ var3)));
boolean var12 = false;
Iterator var13 = var8.iterator();

while (true) {
if (var13.hasNext()) {
Object var14 = var13.next();
var10000 = (int[])var11;
y_ var15 = (y_)var14;
if (var7 != null) {
break;
}

boolean var16 = false;
var11.add(var15.q());
if (var7 == null) {
continue;
}
}

var10000 = (int[])var11;
break;
}

CompletableFuture var19 = class_2172.method_9265(var10000, builder);
Intrinsics.checkNotNullExpressionValue(var19, a<"o">(12160, 2841146593859021784L ^ var3));
return var19;
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public List a(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 23420593179300L;
int[] var10000 = vm.a<"Å">(4586684352057318162L, var4);
Iterable var9 = yl.g.l().F(var6);
boolean var10 = false;
int[] var8 = var10000;
Collection var12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var9, b<"a">(8195, 4559034595441630920L ^ var4)));
boolean var13 = false;
Iterator var14 = var9.iterator();

label22:
while (true) {
if (var14.hasNext()) {
var10000 = (int[])var14.next();
} else {
var10000 = (int[])var12;
if (var2 >= 0) {
break;
}
}

while (true) {
Object var15 = var10000;
var10000 = (int[])var12;
y_ var16 = (y_)var15;
if (var8 != null) {
break label22;
}

boolean var17 = false;
var12.add(var16.q());
if (var8 == null) {
break;
}

var10000 = (int[])var12;
if (var2 >= 0) {
break label22;
}
}
}

List var20 = ((List)var10000).stream().limit(h).toList();
Intrinsics.checkNotNullExpressionValue(var20, a<"o">(10348, 5867618677096158568L ^ var4));
return var20;
}

private static final Message Y(Object var0) {
long var1 = a ^ 61512679340818L;
long var10001 = var1 ^ 48213525984820L;
int var3 = (int)((var1 ^ 48213525984820L) >>> 32);
int var4 = (int)((var1 ^ 48213525984820L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
i4 var10000 = i4.h;
String var10002 = a<"o">(685, 3947026353389967643L ^ var1);
Object[] var6 = new Object[1];
Intrinsics.checkNotNull(var0);
var6[0] = var0;
return (Message)class_2561.method_43470(var10000.E(var3, var10002, var4, var6, var5));
}

public Object parse(StringReader p0) {
long var2 = a ^ 12448089357071L;
long var4 = (var2 ^ 67446768713489L) >>> 32;
int var6 = (int)((var2 ^ 67446768713489L) << 32 >>> 32);
return this.x(var4, var6, p0);
}

public Collection getExamples() {
long var1 = a ^ 30021160837893L;
long var10001 = var1 ^ 64501244665136L;
int var3 = (int)((var1 ^ 64501244665136L) >>> 32);
int var4 = (int)((var1 ^ 64501244665136L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
return this.a(var3, var4, (short)var5);
}

static {
long var16 = a ^ 118127275066945L;
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
String var22 = "¶\u0086\u009d\u0094BíØÎz\u00ad\u0093MKÍ'\u0018\u0010*è\u000b\u009e\u001bû\u0088A\u0001\u0003-\u00962\råÎ\u0018û\u001d,\f`8.\u0011\téÈÇ@ý¹Å\u0087h\u001fj+â`80Ïç@Ô§\u0005\bf=\u0019Ö\u000fÓO\u0010p+'âE[\u001b\u008cÄRr82\u0019xC§æ\u009aäBXXÇóÑg)\u0012(Aùï\u0010°ÒæÏBI0\u0015Iº]0ì\u000eW\u008a";
int var24 = "¶\u0086\u009d\u0094BíØÎz\u00ad\u0093MKÍ'\u0018\u0010*è\u000b\u009e\u001bû\u0088A\u0001\u0003-\u00962\råÎ\u0018û\u001d,\f`8.\u0011\téÈÇ@ý¹Å\u0087h\u001fj+â`80Ïç@Ô§\u0005\bf=\u0019Ö\u000fÓO\u0010p+'âE[\u001b\u008cÄRr82\u0019xC§æ\u009aäBXXÇóÑg)\u0012(Aùï\u0010°ÒæÏBI0\u0015Iº]0ì\u000eW\u008a"
.length();
char var21 = 16;
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
String var9 = "²z\u0096K\u008d÷\u000fÖe\u009d\u009fnúÔO³";
int var10 = "²z\u0096K\u008d÷\u000fÖe\u009d\u009fnúÔO³".length();
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
long var2 = 5846951523563312209L;
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
I = new x7(null);
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

var22 = "\u0006ò\u00884uÚ\u0019HÑ·\u008cWNd¬.ýQ\\`6ä\u008a\u0007 æÐ§[9v\u0082ø\u009cF ý\u008b´ú d\u0090Úµãk\u0085k\u0011\u0018\u0082$.\u001b¤É";
var24 = "\u0006ò\u00884uÚ\u0019HÑ·\u008cWNd¬.ýQ\\`6ä\u008a\u0007 æÐ§[9v\u0082ø\u009cF ý\u008b´ú d\u0090Úµãk\u0085k\u0011\u0018\u0082$.\u001b¤É".length();
var21 = 24;
var28 = -1;
}

var29 = var22.substring(++var28, var28 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 823;
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
throw new RuntimeException("su/catlean/n", var10);
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
throw new RuntimeException("su/catlean/n" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16638;
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
throw new RuntimeException("su/catlean/n", var14);
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
throw new RuntimeException("su/catlean/n" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
