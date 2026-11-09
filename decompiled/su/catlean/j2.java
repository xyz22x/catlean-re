package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class j2 implements ym {
@NotNull
public static final j2 X;
@NotNull
private static final ConcurrentHashMap H;
private static final long a = yz.a(-4395962194441900966L, 5560387659857502074L, MethodHandles.lookup().lookupClass()).a(62076195381834L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private j2() {
}

public final boolean g(long a, @NotNull class_2338 bp) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(bp, a<"o">(9940, 8432630807636846284L ^ ax));
return H.containsKey(bp);
}

public final void J(@NotNull class_2338 pos, long a, char a) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(pos, a<"o">(21977, 6798441162817306521L ^ var5));
H.put(pos, zf.A());
}

public final void Z(@NotNull class_2338 pos, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(pos, a<"o">(30717, 4705767170539205305L ^ ax));
H.remove(pos);
}

@Flow(
priority = 10
)
private final void a(PlayerUpdateEvent var1) {
long var2 = a ^ 83344503173591L;
long var4 = (var2 ^ 45212235003766L) >>> 16;
int var6 = (int)((var2 ^ 45212235003766L) << 48 >>> 48);
String var10000 = vm.a<"Å">(-5901340662354875085L, var2);
Iterator var8 = H.entrySet().iterator();
String var7 = var10000;

while (var8.hasNext()) {
long var9 = ((Number)((Entry)var8.next()).getValue()).longValue();

label25: {
try {
if (var7 == null) {
break label25;
}

if (zf.A() - var9 <= nf.f(nf.Z, null, var4, 1, (char)var6, null) * 3) {
continue;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -5825808504843162971L, var2);
}

var8.remove();
}

if (var7 == null) {
break;
}
}
}

static {
long var0 = a ^ 35716489137360L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[3];
int var7 = 0;
String var6 = "¿ü=¦Â\u0098÷Dð´\u0003ze´Çî\u0010rÁ\u0094SÇ\u009eÄ\b?qQÙð»[°\u0010oN\u0085¤ùkU\u009e fîsS\u0084@h";
int var8 = "¿ü=¦Â\u0098÷Dð´\u0003ze´Çî\u0010rÁ\u0094SÇ\u009eÄ\b?qQÙð»[°\u0010oN\u0085¤ùkU\u009e fîsS\u0084@h".length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[3];
X = new j2();
H = new ConcurrentHashMap();
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6902;
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
throw new RuntimeException("su/catlean/j2", var10);
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
throw new RuntimeException("su/catlean/j2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
