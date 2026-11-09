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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class ew extends _g {
@NotNull
public static final ew O;
static final KProperty[] V;
@NotNull
private static final cw o;
@NotNull
private static final cw h;
@NotNull
private static final cw I;
private static int Y;
private static final long a = yz.a(-3082537083315868688L, -5029862328146011263L, MethodHandles.lookup().lookupClass()).a(186088794932831L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private ew(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 38601655987733L;
super(b<"z">(19721, 5069107569658719060L ^ var1), jt.d(), null, 4, null, var3);
}

@NotNull
public final bl I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 67417001694374L;
return (bl)o.E(this, var3, V[0]);
}

@NotNull
public final bc z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 53900382091734L;
int var5 = vm.a<"Å">(8388329966535609908L, var1);

try {
bc var10000 = (bc)h.E(this, var3, V[1]);
if (vm.a<"Å">(8395802063845878290L, var1) != null) {
vm.a<"Å">(++var5, 8369902143009085078L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 8400293364943878761L, var1);
}
}

@NotNull
public final lg P(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 58456551648186L;
int var8 = vm.a<"Å">(2739685586888612952L, var4);

try {
lg var10000 = (lg)I.E(this, var6, V[2]);
if (var8 != 0) {
vm.a<"Å">(new _g[5], 2781469657883094180L, var4);
}

return var10000;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 2810196005924022277L, var4);
}
}

static {
long var20 = a ^ 65757135936049L;
long var22 = var20 ^ 9740457613093L;
long var24 = var20 ^ 63636759700733L;
long var26 = var20 ^ 114432169124395L;
vm.a<"Å">(0, -2375692645111166003L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "£IQ##\u008an`g\u0084>ZVÎ°\u0095°SB\u0011}&?\u000f ÏqÞùý-)âÚULbUKÆ\u0019úë%\u008aØ£±\u0004\u009b/5ÿ\u0019Ðm\r q´v¿]Õ{\u001bçµ¡çãY\u008aõ\u0003_¦\u0007ÿj\u001c\u009b%@\u0081ÜË)uï LÏ4àÌ\u0007.Ùõ\u0084\u008a\u001fió\n\u009c\u0083UG\u0012V\u001fQ¸ ¦A½å\u0014É}\u0010µù\u0017RqÄ\fg]\u0007\u0003\u008a9a\u0094°0ê&\u0093\u001b4ÍAOôXß\u007fÜøú_@\u0091\u0015«zLl\u000eÄvâû®)\u0000Äóa¥½:oJ©\u0097q³\u0006ç\u0007ý\u0081\u0080.\bñ\u001eF¡X\u0082\u0018j°\u0016Êæ\u000e°vM\u0080J\u0005éêC\u001a\\¿¢yíSG©C?ðÍ2¹ÅòN\u007f\u0096.åÚ=q_ú¡éÚ\u0082[]õ\tâ\u00995\u008e|°\u0007\u0011\u0089$}_=µ\u001f)\b\u009b¥õ©¨\u009eSnÉ¨Ô\u0089ãÎU\u0017\u008c\u0005\u0083\u000e\u008fÙr¨×\u0086¡\u0017Ø²ª\u0018Ë\u0005\u000b¹,À\u0097\u001cÜ÷Ñ\u000b¿i2\u001b\u0016\u00830¶ b±ÎôÉÒ $P\u0017r(\u0006ï¯:i\u000f\u0003?=\u001aÕÖ¤\u0088\u0000\u009cy^8\u0014";
int var17 = "£IQ##\u008an`g\u0084>ZVÎ°\u0095°SB\u0011}&?\u000f ÏqÞùý-)âÚULbUKÆ\u0019úë%\u008aØ£±\u0004\u009b/5ÿ\u0019Ðm\r q´v¿]Õ{\u001bçµ¡çãY\u008aõ\u0003_¦\u0007ÿj\u001c\u009b%@\u0081ÜË)uï LÏ4àÌ\u0007.Ùõ\u0084\u008a\u001fió\n\u009c\u0083UG\u0012V\u001fQ¸ ¦A½å\u0014É}\u0010µù\u0017RqÄ\fg]\u0007\u0003\u008a9a\u0094°0ê&\u0093\u001b4ÍAOôXß\u007fÜøú_@\u0091\u0015«zLl\u000eÄvâû®)\u0000Äóa¥½:oJ©\u0097q³\u0006ç\u0007ý\u0081\u0080.\bñ\u001eF¡X\u0082\u0018j°\u0016Êæ\u000e°vM\u0080J\u0005éêC\u001a\\¿¢yíSG©C?ðÍ2¹ÅòN\u007f\u0096.åÚ=q_ú¡éÚ\u0082[]õ\tâ\u00995\u008e|°\u0007\u0011\u0089$}_=µ\u001f)\b\u009b¥õ©¨\u009eSnÉ¨Ô\u0089ãÎU\u0017\u008c\u0005\u0083\u000e\u008fÙr¨×\u0086¡\u0017Ø²ª\u0018Ë\u0005\u000b¹,À\u0097\u001cÜ÷Ñ\u000b¿i2\u001b\u0016\u00830¶ b±ÎôÉÒ $P\u0017r(\u0006ï¯:i\u000f\u0003?=\u001aÕÖ¤\u0088\u0000\u009cy^8\u0014"
.length();
char var14 = 24;
int var31 = -1;

label58:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[10];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[3];
int var4 = 0;
String var5 = "!óZ\u008a\u0019ÜÔoØ@|ºä»\u0091\u009fãÂº\u001bÁÑ±û";
int var6 = "!óZ\u008a\u0019ÜÔoØ@|ºä»\u0091\u009fãÂº\u001bÁÑ±û".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var46 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var28 = new KProperty[3];

try {
var28[0] = Reflection.property1(
new PropertyReference1Impl(ew.class, b<"z">(20766, 8538674560263608263L ^ var20), b<"z">(27243, 7088435377963691195L ^ var20), 0)
);
var28[1] = Reflection.property1(
new PropertyReference1Impl(ew.class, b<"z">(21447, 7344789183099950360L ^ var20), b<"z">(30094, 7727737519723770707L ^ var20), 0)
);
var28[2] = Reflection.property1(
new PropertyReference1Impl(ew.class, b<"z">(32197, 5512484920988334879L ^ var20), b<"z">(21293, 4630686410129823219L ^ var20), 0)
);
V = var28;
O = new ew(var24);
o = yp.L(O, b<"z">(73, 166626867876431512L ^ var20), bl.DEFAULT, null, null, (int)var0[0], null, var26);
h = yp.L(O, b<"z">(95, 7228890614545876615L ^ var20), bc.CENTER, null, null, (int)var0[2], null, var26);
I = yp.L(O, b<"z">(9745, 4219075200443162826L ^ var20), lg.NEW, null, null, (int)var0[2], null, var26);
if (O.m(var22).X() == -1) {
O.m(var22).D((int)var0[1]);
}

return;
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -2374324980498214410L, var20);
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var41;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label58;
}

var15 = "\u0089\b2?¹°\u0019|BÓ\u0006\u008f?\u000eî\u0097\u0086Oï\u0081[Öü\u0097{\"ÞÏÏ ÎvÐ×)J\u001aÓ\ré\u00802þ\u0081]î\u00888\u0081ÿLÔ¢\u0004\u0085(\u0018\u0086\u000bÁ\\Û[±Î\u0011¡\u00adUÏA½Þ\u000bÄóp1\u0018Ý\u008d";
var17 = "\u0089\b2?¹°\u0019|BÓ\u0006\u008f?\u000eî\u0097\u0086Oï\u0081[Öü\u0097{\"ÞÏÏ ÎvÐ×)J\u001aÓ\ré\u00802þ\u0081]î\u00888\u0081ÿLÔ¢\u0004\u0085(\u0018\u0086\u000bÁ\\Û[±Î\u0011¡\u00adUÏA½Þ\u000bÄóp1\u0018Ý\u008d"
.length();
var14 = '8';
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var10001 = 0;
}
}
}

public static void b(int var0) {
Y = var0;
}

public static int r() {
return Y;
}

public static int Z() {
int var0 = r();

try {
return var0 == 0 ? 56 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22677;
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
throw new RuntimeException("su/catlean/ew", var10);
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
throw new RuntimeException("su/catlean/ew" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
