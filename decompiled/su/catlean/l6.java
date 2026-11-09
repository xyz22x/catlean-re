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
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

public final class l6 {
private static _g[] u;
private static final long a = yz.a(-1274128401070656841L, 8176765396449292577L, MethodHandles.lookup().lookupClass()).a(124330148733236L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final class_2960 m(long a, @NotNull String string) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(string, a<"v">(15945, 4079690691211221048L ^ ax));
class_2960 var10000 = class_2960.method_60654(string);
Intrinsics.checkNotNullExpressionValue(var10000, a<"v">(26062, 1613708948748174265L ^ ax));
return var10000;
}

@NotNull
public static final class_2960 J(@NotNull String id, @NotNull String string, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(id, a<"v">(4085, 8836299495738771198L ^ ax));
Intrinsics.checkNotNullParameter(string, a<"v">(11093, 6598297656061370975L ^ ax));
class_2960 var10000 = class_2960.method_60655(id, string);
Intrinsics.checkNotNullExpressionValue(var10000, a<"v">(429, 8884513782084110501L ^ ax));
return var10000;
}

public static void y(_g[] var0) {
u = var0;
}

public static _g[] U() {
return u;
}

static {
long var9 = a ^ 72425295909917L;
_g[] var10000 = new _g[5];
vm.a<"Å">(var10000, 5967655863582729290L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "ø£¯ºTt\u008dÙà\u00adØ¥hJ\f°\u0010ÕíËÍ\u000b>³Ié$K#\u009bc\u0085\u00ad ÜÝÐã\u0016|R;#ãIô\u000fÕÅÀ3à?¸¼êÇ\u008f\u001d\u0018¹E°ïÛz";
int var6 = "ø£¯ºTt\u008dÙà\u00adØ¥hJ\f°\u0010ÕíËÍ\u000b>³Ié$K#\u009bc\u0085\u00ad ÜÝÐã\u0016|R;#ãIô\u000fÕÅÀ3à?¸¼êÇ\u008f\u001d\u0018¹E°ïÛz".length();
char var3 = 16;
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
b = var7;
c = new String[5];
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

var4 = "62·¹yª\u009b\u0011c¶\u0081\u000f\u0086\u0003\b¾Á§\"9P§pï#¥än\u008a:p\u0083\u0000\u0000rv4Z®\u008dü\rIé\\=Ù¼\u0010êª\u0013\u0087\u00ad\u0015\u009fø¿³\u0004Êi/\u0082Ü";
var6 = "62·¹yª\u009b\u0011c¶\u0081\u000f\u0086\u0003\b¾Á§\"9P§pï#¥än\u008a:p\u0083\u0000\u0000rv4Z®\u008dü\rIé\\=Ù¼\u0010êª\u0013\u0087\u00ad\u0015\u009fø¿³\u0004Êi/\u0082Ü"
.length();
var3 = '0';
var12 = -1;
}

var14 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26065;
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
throw new RuntimeException("su/catlean/l6", var10);
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
throw new RuntimeException("su/catlean/l6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
