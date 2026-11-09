package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;

public final class xk implements Runnable {
final int U;
final String a;
private static final long b = yz.a(-8392838322034085229L, 5239270906462121891L, MethodHandles.lookup().lookupClass()).a(33777481023029L);
private static final String c;

public xk(int var1, String var2) {
this.U = var1;
this.a = var2;
}

@Override
public final void run() {
long var1 = b ^ 20638873672821L;
long var3 = var1 ^ 22317440313194L;
long var5 = var1 ^ 13766966796122L;
long var7 = var1 ^ 134917758121794L;
vm.a<"Å">(-1132642445350573509L, var1);
Thread.sleep(this.U);
boolean var10 = false;

try {
_g var10000 = ej.J;
class_124 var10001 = class_124.field_1068;
ej var10002 = ej.J;
String var10003 = this.a;
String var10004 = ej.V(var3, ej.J).name().toLowerCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10004, c);
o2.S(var10000, var10001 + ej.h(var10002, var10003, var10004, var7), false, 2, null, var5);
} catch (Exception var13) {
var13.printStackTrace();
}

try {
if (vm.a<"Å">(-1149676099602288998L, var1) != null) {
vm.a<"Å">(new String[4], -1090113682730106461L, var1);
}
} catch (Exception var12) {
throw vm.a<"Å">(var12, -1108262106612241714L, var1);
}
}

static {
long var0 = b ^ 104598644299805L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("\u000b»Á=kTf5{S\u007fáÄô²\u00adxr\u0096\u0017Äô\u008bÝ".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
c = var5;
}

private static Exception a(Exception var0) {
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
}
