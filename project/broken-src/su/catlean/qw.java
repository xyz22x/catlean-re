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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.ReachStateEvent;
import su.catlean.gofra.Flow;

public final class qw extends _g {
@NotNull
public static final qw x;
@NotNull
private static final ct N;
@NotNull
private static final ct G;
private static final long a = yz.a(8703413359471372131L, -4019937147206219141L, MethodHandles.lookup().lookupClass()).a(144058003400353L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private qw(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 121590024188895L;
super(b<"u">(26530, 3603187525305120230L ^ var1), jt.A(), null, 4, null, var3);
}

private final float A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 31661126451440L;
return ((Number)N.E(this, var3, W[0])).floatValue();
}

private final float e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 118996301759405L;
return ((Number)G.E(this, var3, W[1])).floatValue();
}

@Flow
private final void g(ReachStateEvent var1) {
long var2 = a ^ 33546251938954L;
long var4 = var2 ^ 73158471835774L;
long var6 = var2 ^ 55507532391203L;
var1.setBlockRange(this.A(var4));
var1.setEntityRange(this.e(var6));
var1.cancel();
}

static {
long var20 = a ^ 70944018276183L;
long var22 = var20 ^ 92893294180081L;
long var24 = var20 ^ 16653299579985L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "\u00073¢-0müáÈâ\u0017JxpÁÜ \u001cð]¼O\u000fÖÊ½^êyrs[\u001c«*\u0093[ø\u0082)q4\u001f\u001fx\u009aëÃ\u0081\u00107?ö>«Z¿wqr¡D\u008d\u001c\u0091{(\u0010d\u0016ùP¯ÎÆâp\fþÕ-\u007f\u0013w§#pÿ\u008cæ.æXDAï9ík\u0014hnà+\u001e\u000f\u0097\u0018\u0086®~\u0015\u008c¨I×\u0011eÇõ3ú@t\u0085ýÚ\u000fÁ×a:";
int var17 = "\u00073¢-0müáÈâ\u0017JxpÁÜ \u001cð]¼O\u000fÖÊ½^êyrs[\u001c«*\u0093[ø\u0082)q4\u001f\u001fx\u009aëÃ\u0081\u00107?ö>«Z¿wqr¡D\u008d\u001c\u0091{(\u0010d\u0016ùP¯ÎÆâp\fþÕ-\u007f\u0013w§#pÿ\u008cæ.æXDAï9ík\u0014hnà+\u001e\u000f\u0097\u0018\u0086®~\u0015\u008c¨I×\u0011eÇõ3ú@t\u0085ýÚ\u000fÁ×a:"
.length();
char var14 = 16;
int var28 = -1;

label47:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
c = new String[7];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "Þî\nqÚ®O)x¼j_\u0017<Ri";
int var6 = "Þî\nqÚ®O)x¼j_\u0017<Ri".length();
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
byte var43 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qw.class, b<"u">(23092, 7563752031205561631L ^ var20), b<"u">(13068, 4645308094385224738L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qw.class, b<"u">(12, 3460072434956816161L ^ var20), b<"u">(766, 471239814664113623L ^ var20), 0))
};
W = var26;
x = new qw(var24);
N = yp.k(x, b<"u">(8686, 1338715155401567938L ^ var20), 3.0F, var22, RangesKt.rangeTo(0.1F, 10.0F), null, null, (int)var0[1], null);
G = yp.k(x, b<"u">(25682, 286812696235289466L ^ var20), 3.0F, var22, RangesKt.rangeTo(0.1F, 10.0F), null, null, (int)var0[0], null);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label47;
}

var15 = "ò¬Ø\u009aÖ÷\u009c\u0096È\u009fx0\u0017+÷\u00897Û2o`}\u008aU9J¹p5ÛGG þµ\u0092Ü\u0012Tîú&\"ßôR\u0011\u00125\u0013\u0014Q\u0006Z\u001b_\b<~û?\u0010?\t4";
var17 = "ò¬Ø\u009aÖ÷\u009c\u0096È\u009fx0\u0017+÷\u00897Û2o`}\u008aU9J¹p5ÛGG þµ\u0092Ü\u0012Tîú&\"ßôR\u0011\u00125\u0013\u0014Q\u0006Z\u001b_\b<~û?\u0010?\t4"
.length();
var14 = ' ';
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12608;
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
throw new RuntimeException("su/catlean/qw", var10);
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
throw new RuntimeException("su/catlean/qw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
