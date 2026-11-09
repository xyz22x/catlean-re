package su.catlean;

import java.awt.Color;
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

public final class cd {
@NotNull
private static o_ x;
private static final long a = yz.a(-7178842063185856478L, -2932489648419997534L, MethodHandles.lookup().lookupClass()).a(92510374512673L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final o_ C() {
return x;
}

public static final void x(long a, @NotNull o_ <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"d">(22613, 3494664689699158003L ^ ax));
x = <set-?>;
}

static {
long var20 = a ^ 74948333939076L;
long var22 = (var20 ^ 83962185435095L) >>> 16;
int var24 = (int)((var20 ^ 83962185435095L) << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[2];
int var16 = 0;
String var15 = "\u008eùF\u009bÓñ\u0013_¡\u001c£¶ïë¨¹\u0010ï\u001a\r\u0010\u008c\u008a´Y4â¬4´ Ý\u0011";
int var17 = "\u008eùF\u009bÓñ\u0013_¡\u001c£¶ïë¨¹\u0010ï\u001a\r\u0010\u008c\u008a´Y4â¬4´ Ý\u0011".length();
char var14 = 16;
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var41 = a(var19).intern();
int var10001 = -1;
var18[var16++] = var41;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[2];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[29];
int var4 = 0;
String var5 = "q\u0013ÃÀ\u008eöUa\u0095½Á\u0006]É\u0004Â^\u001eèåÎ8HðÚ\u0087¶`îî\u009ceûL?H¬à\u0007\u0012\u008d%d\u009e\f\u000e°7Öþ Ãp÷1LH\n\u0094¼\u00968\u0014\u008cHþfw¬\u0001©\u0096´1~ßMÀ§@\rô²E,$Ç}ßº\u0004?[£)\u001d\u008c}\u00ad\u009d\feôÈ\u0001\u008fXæ¯~\u0082\u0094=]0h\u0094\u0092ïìHô¨#A\u000b>ÓH,\u0097>µO9\u0010L*ÖÊ\u0080\u000eá\u009a\u009c\u001a\u00008;\u0086óëÍe\u009eFë¹×kwSw«e1'r¬JyïüûÉèì\u0080§±\u009b°4ø\u0017\u008eRJ/9Y[Eîb[\u00968\u0018LÒljÌu\u001fçÎê\u00ad-gv[¿B";
int var6 = "q\u0013ÃÀ\u008eöUa\u0095½Á\u0006]É\u0004Â^\u001eèåÎ8HðÚ\u0087¶`îî\u009ceûL?H¬à\u0007\u0012\u008d%d\u009e\f\u000e°7Öþ Ãp÷1LH\n\u0094¼\u00968\u0014\u008cHþfw¬\u0001©\u0096´1~ßMÀ§@\rô²E,$Ç}ßº\u0004?[£)\u001d\u008c}\u00ad\u009d\feôÈ\u0001\u008fXæ¯~\u0082\u0094=]0h\u0094\u0092ïìHô¨#A\u000b>ÓH,\u0097>µO9\u0010L*ÖÊ\u0080\u000eá\u009a\u009c\u001a\u00008;\u0086óëÍe\u009eFë¹×kwSw«e1'r¬JyïüûÉèì\u0080§±\u009b°4ø\u0017\u008eRJ/9Y[Eîb[\u00968\u0018LÒljÌu\u001fçÎê\u00ad-gv[¿B"
.length();
byte var3 = 0;

label33:
while (true) {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var36 = var0;
var10001 = var4++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var51 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var36[var10001] = var51;
if (var3 >= var6) {
String var46 = a<"d">(12776, 4058473813235731667L ^ var20);
Color var50 = new Color((int)var0[23]);
Color var52 = new Color((int)var0[16]);
Color var10005 = new Color((int)var0[15], (int)var0[6], (int)var0[6]);
Color var10006 = new Color((int)var0[3], (int)var0[5], (int)var0[0]);
Color var10007 = new Color((int)var0[20], (int)var0[10], (int)var0[24]);
Color var10008 = new Color((int)var0[28], (int)var0[13], (int)var0[13]);
Color var10009 = new Color((int)var0[19], (int)var0[9], (int)var0[9]);
Color var10010 = new Color((int)var0[21], (int)var0[18], (int)var0[2]);
Color var10011 = new Color((int)var0[17], (int)var0[4], (int)var0[26], (int)var0[14]);
Color var10012 = new Color((int)var0[22], (int)var0[27], (int)var0[12], (int)var0[11]);
Color var10013 = new Color((int)var0[27], (int)var0[27], (int)var0[8], (int)var0[25]);
Color var25 = new Color((int)var0[7], (int)var0[7], (int)var0[1], (int)var0[13]);
Color var26 = var10013;
Color var27 = var10012;
Color var28 = var10011;
Color var29 = var10010;
Color var30 = var10009;
Color var31 = var10008;
Color var32 = var10007;
x = new o_(var46, var50, var52, var10005, var10006, var22, var32, var31, var30, var29, (char)var24, var28, var27, var26, var25);
return;
}
break;
default:
var36[var10001] = var51;
if (var3 < var6) {
continue label33;
}

var5 = "\u00adJÊ&\u0001\u00860¿{H÷´\u0019%&$";
var6 = "\u00adJÊ&\u0001\u00860¿{H÷´\u0019%&$".length();
var3 = 0;
}

byte var40 = var3;
var3 += 8;
var7 = var5.substring(var40, var3).getBytes("ISO-8859-1");
var36 = var0;
var10001 = var4++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var13);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19299;
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
throw new RuntimeException("su/catlean/cd", var10);
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
throw new RuntimeException("su/catlean/cd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
