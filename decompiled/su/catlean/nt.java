package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class nt {
@NotNull
private static final nd r;
@NotNull
private static final nd q;
@NotNull
private static final nd H;
@NotNull
private static final nd F;

@NotNull
public static final nd m() {
return r;
}

@NotNull
public static final nd J() {
return q;
}

@NotNull
public static final nd d() {
return H;
}

@NotNull
public static final nd h() {
return F;
}

static {
long var9 = yz.a(-3477903525195447015L, -7720611515454701748L, MethodHandles.lookup().lookupClass()).a(13110237613992L) ^ 69741202846868L;
long var11 = var9 ^ 67820703868462L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[4];
int var6 = 0;
String var5 = "P\"\u008bÃw»z\u007fß\u001a°[¹®{c\bojhdÁÀ\u001cÄ";
int var7 = "P\"\u008bÃw»z\u007fß\u001a°[¹®{c\bojhdÁÀ\u001cÄ".length();
char var4 = 16;
int var15 = -1;

label28:
while (true) {
String var19 = var5.substring(++var15, var15 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var19.getBytes("ISO-8859-1"));
String var25 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var25;
if ((var15 += var4) >= var7) {
String var28 = var0[2];
fu[] var13 = new fu[]{jt.Q(), jt.A(), jt.n()};
r = new nd(var11, var28, CollectionsKt.arrayListOf(var13));
String var29 = var0[0];
var13 = new fu[]{jt.c(), jt.V()};
q = new nd(var11, var29, CollectionsKt.arrayListOf(var13));
String var30 = var0[1];
var13 = new fu[]{jt.F(), jt.z()};
H = new nd(var11, var30, CollectionsKt.arrayListOf(var13));
String var31 = var0[3];
var13 = new fu[]{jt.y(), jt.I(), jt.v(), jt.d()};
F = new nd(var11, var31, CollectionsKt.arrayListOf(var13));
return;
}

var4 = var5.charAt(var15);
break;
default:
var0[var6++] = var25;
if ((var15 += var4) < var7) {
var4 = var5.charAt(var15);
continue label28;
}

var5 = "É+\u00198\u0006ÚSC\bâË\ntß\u0089Ke";
var7 = "É+\u00198\u0006ÚSC\bâË\ntß\u0089Ke".length();
var4 = '\b';
var15 = -1;
}

var19 = var5.substring(++var15, var15 + var4);
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
}
