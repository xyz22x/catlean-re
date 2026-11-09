package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.Grouping;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1542;
import net.minecraft.class_2561;

public final class zt implements Grouping {
final Iterable b;
private static final long a = yz.a(2033904172459930695L, -1541671367760256798L, MethodHandles.lookup().lookupClass()).a(149816205595117L);
private static final String c;

public zt(Iterable $receiver) {
this.b = $receiver;
}

@Override
public Iterator sourceIterator() {
return this.b.iterator();
}

@Override
public Object keyOf(Object element) {
long var2 = a ^ 123655482202778L;
long var4 = var2 ^ 95467880940274L;
class_1542 var6 = (class_1542)element;
boolean var7 = false;
class_2561 var10000 = var6.method_6983().method_7964();
Intrinsics.checkNotNullExpressionValue(var10000, c);
return r5.D(var4, var10000);
}

static {
long var0 = a ^ 11615863201496L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("\u0012À.Ñÿ£\u0089\r¨u\u001cï\u0016q\u001aÎO\u001dó©A]ð*".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
c = var5;
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
}
