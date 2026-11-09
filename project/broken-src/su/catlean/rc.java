package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class rc implements Comparator {
private static final long a = yz.a(5608674842131395910L, 9065327072673522870L, MethodHandles.lookup().lookupClass()).a(189035521399016L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 66693451220071L;
_g var5 = (_g)ax;
boolean var6 = false;
String var10000 = var5.U().toLowerCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10000, a<"c">(18840, 7502802400095115115L ^ var3));
Comparable var10 = var10000;
var5 = (_g)bx;
Comparable var7 = var10;
var6 = false;
var10000 = var5.U().toLowerCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10000, a<"c">(24960, 1908799898432520050L ^ var3));
return ComparisonsKt.compareValues(var7, var10000);
}

static {
long var0 = a ^ 90003287973574L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "\u0016\u001c-\u009b\u0010\u008b\u0007\u0089¿UN[Ä\u001aÙ¼E\u008d\u009eù\u001c\u009f²\u009fh1cQe¬\u0091å\u0016Ù»\\\u0001BnÊ(\u0099²\u0090H¼âó\u0019|ãu+\u0087R\u0011\u0002\u009dvõ$HmâY\u0098b\u0016\fS£×W6\u008a\u0013\u0088qvD©";
int var8 = "\u0016\u001c-\u009b\u0010\u008b\u0007\u0089¿UN[Ä\u001aÙ¼E\u008d\u009eù\u001c\u009f²\u009fh1cQe¬\u0091å\u0016Ù»\\\u0001BnÊ(\u0099²\u0090H¼âó\u0019|ãu+\u0087R\u0011\u0002\u009dvõ$HmâY\u0098b\u0016\fS£×W6\u008a\u0013\u0088qvD©"
.length();
char var5 = '(';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[2];
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29026;
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
throw new RuntimeException("su/catlean/rc", var10);
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
throw new RuntimeException("su/catlean/rc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
