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
import org.jetbrains.annotations.NotNull;

public final class b5 {
private static final long a = yz.a(2578386098969198015L, 8576244606825400967L, MethodHandles.lookup().lookupClass()).a(121370020893037L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final c8 j(int a, int a, char a, @NotNull c8 $this$withNameValOverride, int i, @NotNull String string) {
long var6 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var6 ^ 96277802091591L;
int var8 = (int)((var6 ^ 96277802091591L) >>> 48);
int var9 = (int)((var6 ^ 96277802091591L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter($this$withNameValOverride, a<"g">(15853, 790108302088087140L ^ var6));
Intrinsics.checkNotNullParameter(string, a<"g">(3525, 2556659491597686350L ^ var6));
oo.k.v().add(new s6($this$withNameValOverride.e(), (short)var8, i, var9, string, (char)var10));
return $this$withNameValOverride;
}

@NotNull
public static final ct V(long a, @NotNull ct $this$withNameValOverride, float i, @NotNull String string) {
ax = a ^ ax;
long var10001 = ax ^ 125996649623860L;
int var5 = (int)((ax ^ 125996649623860L) >>> 48);
int var6 = (int)((ax ^ 125996649623860L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter($this$withNameValOverride, a<"g">(29430, 4559125654272203789L ^ ax));
Intrinsics.checkNotNullParameter(string, a<"g">(27411, 688198831736997354L ^ ax));
oo.k.v().add(new s6($this$withNameValOverride.e(), (short)var5, i, var6, string, (char)var7));
return $this$withNameValOverride;
}

static {
long var0 = a ^ 13397909734508L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[4];
int var7 = 0;
String var6 = "9È\nÓ£÷Þ©²²7Å\bÊòà\u0010\u001fÅú@çØ\u008d-à`\bw'ÈE\u009a";
int var8 = "9È\nÓ£÷Þ©²²7Å\bÊòà\u0010\u001fÅú@çØ\u008d-à`\bw'ÈE\u009a".length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[4];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "öÇ¥Ù\u0002Gû7Ê\u0095\u001dÖj0\u008e\u0006\u0010Qæ©-ìîç\u0001xU\u0085áè7ÓÒ";
var8 = "öÇ¥Ù\u0002Gû7Ê\u0095\u001dÖj0\u008e\u0006\u0010Qæ©-ìîç\u0001xU\u0085áè7ÓÒ".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28700;
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
throw new RuntimeException("su/catlean/b5", var10);
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
throw new RuntimeException("su/catlean/b5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
