package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

public abstract class n9 {
private static int r;
private static final long a = yz.a(2034843016353345246L, 2812540783205301726L, MethodHandles.lookup().lookupClass()).a(62909548747673L);
private static final String[] c;
private static final String[] d;
private static final Map g = new HashMap(13);
private static final long l;

public final void v(long a, @NotNull b2 opcode, @NotNull JsonElement element) {
ax = a ^ ax;
long var5 = ax ^ 32603513572087L;
Intrinsics.checkNotNullParameter(opcode, a<"j">(16148, 1936237124887129616L ^ ax));
Intrinsics.checkNotNullParameter(element, a<"j">(23225, 6815628952810310588L ^ ax));
Map var8 = MapsKt.toMutableMap(JsonElementKt.getJsonObject(element));
var8.put(a<"j">(14645, 5379416431102928946L ^ ax), JsonElementKt.JsonPrimitive(UUID.randomUUID().toString()));
Json var9 = op.d();
int var10000 = vm.a<"Å">(-489362945702438527L, ax);
JsonObject var10 = new JsonObject(var8);
boolean var11 = false;
var9.getSerializersModule();
String var18 = var9.encodeToString(JsonObject.Companion.serializer(), var10);
byte[] var10001 = var18.getBytes(Charsets.UTF_8);
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(25215, 470372951128896377L ^ ax));
byte[] var19 = var10001;
int var7 = var10000;
byte[] var20 = var19;
var11 = false;
ByteBuffer var12 = ByteBuffer.allocate(var19.length + (int)l);
ByteBuffer var13 = var12;
n9 var14 = this;
boolean var15 = false;

try {
var13.putInt(jw.c(opcode.ordinal()));
var13.putInt(jw.c(var20.length));
var13.put(var20);
var13.flip();
Intrinsics.checkNotNullExpressionValue(var12, a<"j">(19333, 8070259611248974470L ^ ax));
var14.P(var5, var12);
if (var7 == 0) {
vm.a<"Å">(new _g[2], -475436803597929637L, ax);
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -452699380914994942L, ax);
}
}

protected abstract void P(long var1, @NotNull ByteBuffer var3);

public abstract void Q();

public static void j(int var0) {
r = var0;
}

public static int j() {
return r;
}

public static int o() {
int var0 = j();

try {
return var0 == 0 ? 118 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = a ^ 128915959592254L;
vm.a<"Å">(109, 7666654957139213038L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[5];
int var10 = 0;
String var9 = "\u00ad_nÓ«¦\u008f©ß\u00ad\u0090±Ü5ãÁ ¦\u0091¢\u0002ÚB\u00adí}ÔIv4jöe\u008c¸ñ¦c\u0092ZXóñÁ·øªiH\u0010dì¬³4ZÍ\u0012¯`[ÀW\tÿ\u009b";
int var11 = "\u00ad_nÓ«¦\u008f©ß\u00ad\u0090±Ü5ãÁ ¦\u0091¢\u0002ÚB\u00adí}ÔIv4jöe\u008c¸ñ¦c\u0092ZXóñÁ·øªiH\u0010dì¬³4ZÍ\u0012¯`[ÀW\tÿ\u009b".length();
char var8 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
c = var12;
d = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -6568661644844098077L;
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
l = var30;
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "ó| \u0085â\u0013$[ùð¬Ðå\u0007^\" Í\u001bÿé\u001a©FÒ\u001d\u009e?:³ÇRGà\u0091²-b(qT47=1Ã¯\u0083\u0006";
var11 = "ó| \u0085â\u0013$[ùð¬Ðå\u0007^\" Í\u001bÿé\u001a©FÒ\u001d\u009e?:³ÇRGà\u0091²-b(qT47=1Ã¯\u0083\u0006".length();
var8 = 16;
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26950;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/n9", var10);
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
throw new RuntimeException("su/catlean/n9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
