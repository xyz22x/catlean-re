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
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.BoxContractEvent;
import su.catlean.gofra.Flow;

public final class e4 extends _g {
@NotNull
public static final e4 j;
private static boolean E;
private static final long a = yz.a(5504473183836025402L, 3895427400097468407L, MethodHandles.lookup().lookupClass()).a(32562753600422L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private e4(short var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 33241609630576L;
super(b<"d">(12556, 4048521788802854985L ^ var4), jt.v(), null, 4, null, var6);
}

public final boolean x() {
return E;
}

public final void t(boolean <set-?>) {
E = <set-?>;
}

@Flow
private final void R(BoxContractEvent var1) {
long var2 = a ^ 34960059142082L;
long var4 = var2 ^ 67081314545937L;
String[] var6 = vm.a<"Å">(7152645276246685544L, var2);

boolean var10000;
label22: {
try {
var10000 = E;
if (var6 != null) {
break label22;
}

if (E) {
return;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 7203174902806565253L, var2);
}

E = true;
class_238 var10001 = zf.v(var4).method_5829().method_1009(-1.0E-12, 0.0, -1.0E-12);
Intrinsics.checkNotNullExpressionValue(var10001, b<"d">(8627, 8626611812996292896L ^ var2));
var1.setValue(var10001);
var10000 = false;
}

E = var10000;
var1.cancel();
}

static {
long var9 = a ^ 63450855702394L;
long var10001 = var9 ^ 7402692009171L;
int var11 = (int)((var9 ^ 7402692009171L) >>> 48);
int var12 = (int)((var9 ^ 7402692009171L) << 16 >>> 32);
int var13 = (int)(var10001 << 48 >>> 48);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[2];
int var5 = 0;
String var4 = "\u0081³]\u0012oT{4\u0019\u0099ÇË/£4\u00ad÷\u009e-jè\u0012ï-UyKè`§7k\u0018ï\tÓî?¢§\u0004÷×º¬Þè,}TØ[õ%3{s";
int var6 = "\u0081³]\u0012oT{4\u0019\u0099ÇË/£4\u00ad÷\u009e-jè\u0012ï-UyKè`§7k\u0018ï\tÓî?¢§\u0004÷×º¬Þè,}TØ[õ%3{s".length();
char var3 = ' ';
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var17 = b(var8).intern();
byte var15 = -1;
var7[var5++] = var17;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
j = new e4((short)var11, var12, (short)var13);
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25325;
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
throw new RuntimeException("su/catlean/e4", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/e4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
