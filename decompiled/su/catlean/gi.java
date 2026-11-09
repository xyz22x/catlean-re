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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gi {
private final float C;
private final float B;
private final float w;
private final float U;
public static final gi SMOKE;
public static final gi CIRCLE;
public static final gi CRACK;
public static final gi CLOUD;
public static final gi DOLLAR;
public static final gi DROP;
public static final gi FIREFLY;
public static final gi FIREFLY_ALT;
public static final gi HEART;
public static final gi SNOWFLAKE;
public static final gi STAR;
public static final gi TRIANGLE1;
public static final gi TRIANGLE2;
public static final gi TRIANGLE3;
public static final gi TRIANGLE4;
public static final gi HALO;
public static final gi TRIANGLE5;
private static int[] r;
private static final long a = yz.a(-3732756354189874883L, -8004455321125896098L, MethodHandles.lookup().lookupClass()).a(30233294075805L);
private static final long[] b;
private static final Integer[] c;
private static final Map d;

private gi(float var3, float var4, float var5, float var6) {
this.C = var3;
this.B = var4;
this.w = var5;
this.U = var6;
}

public final float o() {
return this.C;
}

public final float v() {
return this.B;
}

public final float L() {
return this.w;
}

public final float w() {
return this.U;
}

@NotNull
public static EnumEntries G() {
return i;
}

static {
long var20 = a ^ 112704465528274L;
long var10001 = var20 ^ 51706774436743L;
int var22 = (int)((var20 ^ 51706774436743L) >>> 48);
int var23 = (int)((var20 ^ 51706774436743L) << 16 >>> 48);
int var24 = (int)(var10001 << 32 >>> 32);
if (vm.a<"Å">(8650270298860573595L, var20) == null) {
vm.a<"Å">(new int[1], 8646954499518587504L, var20);
}

Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[17];
int var17 = 0;
String var16 = "ðð\rè\u0012u\u009fü\u0010\u0099\t¢YÈé¨×\u001a1$\u0002\u00808qf\bÛS+\u008fÐ|k\u0005\bøü2\u0084¬ö\u000e(\bkìÉ¸çÊõT\b\u0089{wDwîºÑ\u0010\u0099\t¢YÈé¨×Îg\u0083¥ÇU±u\bv\u00853@\u0003\u008aÄW\b.\u0089\f-x\u00983\u0004\b\u0091\u001d\u009aGsï\u008f|\u0010\u0099\t¢YÈé¨×ùaÌV(\u0011Ôa\bÍ¯¹®µ\u008fª¦\b$\u0097\u0093\u0089\u0082OI4\u0010T&Z\u00914Cz\u009a\u0093ôG\u001fg5V¹\u0010\u0099\t¢YÈé¨×\u0013\u001aö¼\u0089ª÷e";
int var18 = "ðð\rè\u0012u\u009fü\u0010\u0099\t¢YÈé¨×\u001a1$\u0002\u00808qf\bÛS+\u008fÐ|k\u0005\bøü2\u0084¬ö\u000e(\bkìÉ¸çÊõT\b\u0089{wDwîºÑ\u0010\u0099\t¢YÈé¨×Îg\u0083¥ÇU±u\bv\u00853@\u0003\u008aÄW\b.\u0089\f-x\u00983\u0004\b\u0091\u001d\u009aGsï\u008f|\u0010\u0099\t¢YÈé¨×ùaÌV(\u0011Ôa\bÍ¯¹®µ\u008fª¦\b$\u0097\u0093\u0089\u0082OI4\u0010T&Z\u00914Cz\u009a\u0093ôG\u001fg5V¹\u0010\u0099\t¢YÈé¨×\u0013\u001aö¼\u0089ª÷e"
.length();
char var15 = '\b';
int var27 = -1;

label58:
while (true) {
String var28 = var16.substring(++var27, var27 + var15);
byte var32 = -1;

while (true) {
byte[] var19 = var12.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = a(var19).intern();
switch (var32) {
case 0:
var11[var17++] = var40;
if ((var27 += var15) >= var18) {
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[23];
int var3 = 0;
String var4 = "sÙ\t\u001c°\u00059Å@²Ñ\u001epì*\u0086}.ªZWÔtÀìì\u001eÇaÏN¬ëÐÝ¸Çîç4ØËä\u0080W\f\u0016\u00adcTÙÄ+ÿ¯Ì\u009bøRÿ\u0093AJÒúÅ\u0089\u000b\u000b |§xèHVçÅ\u007fñm;\u0011Z>uý\u0082ö#\u000eùíÏÀ=&W®Ù\u0089bÝIô\u0000pvH\u0018Wáa\u0098Ø2d½|M\b\u0010ø\u001c¾VDVTAG¶\u0098\u0006\u001bÐ'\u0088¢=\bN¾Õ\b\u009c×\u0091!o²n·\u009fQë\f\u0001!à\u0082ôY\u0007§&\u0091è";
int var5 = "sÙ\t\u001c°\u00059Å@²Ñ\u001epì*\u0086}.ªZWÔtÀìì\u001eÇaÏN¬ëÐÝ¸Çîç4ØËä\u0080W\f\u0016\u00adcTÙÄ+ÿ¯Ì\u009bøRÿ\u0093AJÒúÅ\u0089\u000b\u000b |§xèHVçÅ\u007fñm;\u0011Z>uý\u0082ö#\u000eùíÏÀ=&W®Ù\u0089bÝIô\u0000pvH\u0018Wáa\u0098Ø2d½|M\b\u0010ø\u001c¾VDVTAG¶\u0098\u0006\u001bÐ'\u0088¢=\bN¾Õ\b\u009c×\u0091!o²n·\u009fQë\f\u0001!à\u0082ôY\u0007§&\u0091è"
.length();
byte var2 = 0;

label40:
while (true) {
byte var36 = var2;
var2 += 8;
byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
int var37 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var37] = var49;
if (var2 >= var5) {
b = var6;
c = new Integer[23];
SMOKE = new gi(0.0F, 0.0F, 0.3906F, 0.3906F);
CIRCLE = new gi(0.3906F, 0.0F, 0.6406F, 0.25F);
CRACK = new gi(0.6406F, 0.0F, 0.8906F, 0.25F);
CLOUD = new gi(0.8906F, 0.0F, 0.9531F, 0.0625F);
DOLLAR = new gi(0.8906F, 0.0625F, 0.9531F, 0.125F);
DROP = new gi(0.8906F, 0.125F, 0.9531F, 0.1875F);
FIREFLY = new gi(0.8906F, 0.1875F, 0.9531F, 0.25F);
FIREFLY_ALT = new gi(0.3906F, 0.25F, 0.4531F, 0.3125F);
HEART = new gi(0.4531F, 0.25F, 0.5156F, 0.3125F);
SNOWFLAKE = new gi(0.5156F, 0.25F, 0.5781F, 0.3125F);
STAR = new gi(0.5781F, 0.25F, 0.6406F, 0.3125F);
TRIANGLE1 = new gi(0.6406F, 0.25F, 0.7031F, 0.3125F);
TRIANGLE2 = new gi(0.7031F, 0.25F, 0.7656F, 0.3125F);
TRIANGLE3 = new gi(0.7656F, 0.25F, 0.8281F, 0.3125F);
TRIANGLE4 = new gi(0.8281F, 0.25F, 0.8906F, 0.3125F);
HALO = new gi(0.8906F, 0.25F, 0.9531F, 0.3096F);
TRIANGLE5 = new gi(0.3906F, 0.3125F, 0.4531F, 0.3701F);
i = EnumEntriesKt.enumEntries(q);
return;
}
break;
default:
var31[var37] = var49;
if (var2 < var5) {
continue label40;
}

var4 = "& \u0086`£\u008f\u0000\u0018Çc½!Ñ\u0007ñ!";
var5 = "& \u0086`£\u008f\u0000\u0018Çc½!Ñ\u0007ñ!".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var31 = var6;
var37 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var15 = var16.charAt(var27);
break;
default:
var11[var17++] = var40;
if ((var27 += var15) < var18) {
var15 = var16.charAt(var27);
continue label58;
}

var16 = "\u0011\b#»\u008b(\u0089\u0081ê\u009d\u0004úáÇ\u0010<\u0010\u0099\t¢YÈé¨×]ï\u009f[÷>\nG";
var18 = "\u0011\b#»\u008b(\u0089\u0081ê\u009d\u0004úáÇ\u0010<\u0010\u0099\t¢YÈé¨×]ï\u009f[÷>\nG".length();
var15 = 16;
var27 = -1;
}

var28 = var16.substring(++var27, var27 + var15);
var32 = 0;
}
}
}

public static void S(int[] var0) {
r = var0;
}

public static int[] I() {
return r;
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6193;
if (c[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = b[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])d.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/gi", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
c[var3] = var15;
}

return c[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/gi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
