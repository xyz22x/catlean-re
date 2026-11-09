package su.catlean;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import org.jetbrains.annotations.NotNull;

public final class d6 {
static final d6 k;
private static final long a = yz.a(-5830574947048430428L, 299825577381671109L, MethodHandles.lookup().lookupClass()).a(69705668784920L);
private static final String b;

private d6() {
}

@NotNull
public final KSerializer b(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
String var10002 = b;
KClass var10003 = Reflection.getOrCreateKotlinClass(wl.class);
KClass[] var6 = new KClass[]{
Reflection.getOrCreateKotlinClass(bp.class), Reflection.getOrCreateKotlinClass(ft.class), Reflection.getOrCreateKotlinClass(nh.class)
};
KSerializer[] var7 = new KSerializer[]{p2.N, ca.N, rg.W};
return new SealedClassSerializer(var10002, var10003, var6, var7, new Annotation[0]);
}

static {
long var0 = a ^ 96945866955749L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("Z\u0004gÄP0íë\u0007Ðª{2AþO".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
b = var5;
k = new d6();
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
