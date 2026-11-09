package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

public final class s_ {
private static int F;
private static final long a = yz.a(-2145524935249395855L, -3847122713801587648L, MethodHandles.lookup().lookupClass()).a(197182984676419L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

@NotNull
public static final List z(long a, @NotNull class_746 $this$armorItems) {
ax = a ^ ax;
int var10000 = vm.a<"Å">(-3303811208194243400L, ax);
Intrinsics.checkNotNullParameter($this$armorItems, a<"l">(9517, 968466103595195739L ^ ax));
class_1799[] var4 = new class_1799[4];
int var3 = var10000;

try {
class_1799 var10002 = $this$armorItems.method_31548().method_5438(b<"o">(20590, 5827133378349169631L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(2835, 4400465409791030119L ^ ax));
var4[0] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(31984, 622932286781052741L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352887785242276479L ^ ax));
var4[1] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(23826, 8133145024672200352L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352887785242276479L ^ ax));
var4[2] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(32464, 5224501840705901927L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352887785242276479L ^ ax));
var4[3] = var10002;
List var8 = CollectionsKt.listOf(var4);
if (vm.a<"Å">(-3269936351505495025L, ax) != null) {
vm.a<"Å">(++var3, -3297845095467559878L, ax);
}

return var8;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -3259513898137894489L, ax);
}
}

@NotNull
public static final List L(@NotNull class_1657 $this$armorItems, long a) {
ax = a ^ ax;
int var10000 = vm.a<"Å">(-8939698073272543887L, ax);
Intrinsics.checkNotNullParameter($this$armorItems, a<"l">(21206, 6165117718567222122L ^ ax));
int var3 = var10000;
class_1799[] var4 = new class_1799[4];

try {
class_1799 var10002 = $this$armorItems.method_31548().method_5438(b<"o">(6200, 6659724351386968645L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352965016885453750L ^ ax));
var4[0] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(10628, 8926266847249257470L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352965016885453750L ^ ax));
var4[1] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(341, 8387247562153949994L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352965016885453750L ^ ax));
var4[2] = var10002;
var10002 = $this$armorItems.method_31548().method_5438(b<"o">(30783, 704098750288233030L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(18952, 7352965016885453750L ^ ax));
var4[3] = var10002;
List var7 = CollectionsKt.mutableListOf(var4);
if (var3 != 0) {
vm.a<"Å">(new _g[2], -8997714527652509412L, ax);
}

return var7;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -9004191388263083922L, ax);
}
}

@NotNull
public static final List E(int a, @NotNull class_1309 $this$armorItems, int a, byte a) {
long var4 = ((long)ax << 32 | (long)axxx << 40 >>> 32 | (long)axx << 56 >>> 56) ^ a;
Intrinsics.checkNotNullParameter($this$armorItems, a<"l">(21206, 6165126981133948331L ^ var4));
class_1799[] var6 = new class_1799[4];
class_1799 var10002 = class_1802.field_8162.method_7854();
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(29017, 7087868374027367969L ^ var4));
var6[0] = var10002;
var10002 = class_1802.field_8162.method_7854();
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(28419, 2007006452976609402L ^ var4));
var6[1] = var10002;
var10002 = class_1802.field_8162.method_7854();
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(28419, 2007006452976609402L ^ var4));
var6[2] = var10002;
var10002 = class_1802.field_8162.method_7854();
Intrinsics.checkNotNullExpressionValue(var10002, a<"l">(28419, 2007006452976609402L ^ var4));
var6[3] = var10002;
return CollectionsKt.mutableListOf(var6);
}

public static void w(int var0) {
F = var0;
}

public static int g() {
return F;
}

public static int w() {
int var0 = g();

try {
return var0 == 0 ? 100 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 11970006343308L;
vm.a<"Å">(107, -935455230634920699L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[6];
int var16 = 0;
String var15 = "ÒU\u0012\u009d\u0019oÆ®¥ÓW^¤tòB JÑ69óÒ3ÑçZþîÈèì\u0017\u0000²\u0091;KU-\u0083\u0019Ñ^\u0016\u00845g\n\u0018Ä'\u001f\bÚvg=t\u008d\u0090Cü\u0080µ\u0000*\u0084á\u0016Ù«Æ^\u0010R-y\"Jp\u0018Tn\u009a ! 1×s";
int var17 = "ÒU\u0012\u009d\u0019oÆ®¥ÓW^¤tòB JÑ69óÒ3ÑçZþîÈèì\u0017\u0000²\u0091;KU-\u0083\u0019Ñ^\u0016\u00845g\n\u0018Ä'\u001f\bÚvg=t\u008d\u0090Cü\u0080µ\u0000*\u0084á\u0016Ù«Æ^\u0010R-y\"Jp\u0018Tn\u009a ! 1×s"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "T\u001e\u00ad/£j\u001cçoU;\u0019 ÷\u001d+¼ù\u0017zç¬Ù&ÂèÂ\u0095\u0082\u008a))wOG.\u0018äÿU\u0085\ræ_tûÁE";
int var5 = "T\u001e\u00ad/£j\u001cçoU;\u0019 ÷\u001d+¼ù\u0017zç¬Ù&ÂèÂ\u0095\u0082\u008a))wOG.\u0018äÿU\u0085\ræ_tûÁE".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[8];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "q\u008deW¬A\u000býo]Z(t¼\n\u000b";
var5 = "q\u008deW¬A\u000býo]Z(t¼\n\u000b".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "î««Æ$÷ù©\u0005·uq\u0083\u0089\u000fü\u0084p \r\u0095ÂDÔ$õ\u0011\\;eÜ\n\u0004Õts¸ü\u001a[(Öæ\u0083Êø\u001b!\u0094\u0010!Ìômµ\u008eÒ\u001a7W>ñ'\u0000l\u0017%\u0001P¡Â\u001cÒÑ\u0001{\u0098\u0098Óua";
var17 = "î««Æ$÷ù©\u0005·uq\u0083\u0089\u000fü\u0084p \r\u0095ÂDÔ$õ\u0011\\;eÜ\n\u0004Õts¸ü\u001a[(Öæ\u0083Êø\u001b!\u0094\u0010!Ìômµ\u008eÒ\u001a7W>ñ'\u0000l\u0017%\u0001P¡Â\u001cÒÑ\u0001{\u0098\u0098Óua"
.length();
var14 = '(';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11194;
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
throw new RuntimeException("su/catlean/s_", var10);
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
throw new RuntimeException("su/catlean/s_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30844;
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
throw new RuntimeException("su/catlean/s_", var14);
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
throw new RuntimeException("su/catlean/s_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
