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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.jetbrains.annotations.NotNull;

public enum ce {
@NotNull
private final Function1 D;
@NotNull
private final Function1 L;
private final double F;
private final double n;
public static final ce HEAD;
public static final ce BODY;
public static final ce LEFT_ARM;
public static final ce RIGHT_ARM;
public static final ce LEFT_LEG;
public static final ce RIGHT_LEG;
private static String T;
private static final long a = yz.a(1690614973099928185L, 1120909493741359870L, MethodHandles.lookup().lookupClass()).a(52777777527417L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private ce(Function1 var3, Function1 var4, double var5, double var7) {
this.D = var3;
this.L = var4;
this.F = var5;
this.n = var7;
}

@NotNull
public final Function1 T() {
return this.D;
}

@NotNull
public final Function1 s() {
return this.L;
}

public final double J() {
return this.F;
}

public final double c() {
return this.n;
}

@NotNull
public static EnumEntries d() {
return V;
}

private static final class_630 d(class_591 var0) {
long var1 = a ^ 69886471686877L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1677016534219033978L ^ var1));
class_630 var10000 = var0.field_3398;
Intrinsics.checkNotNullExpressionValue(var0.field_3398, a<"w">(18818, 5877222634322218887L ^ var1));
return var10000;
}

private static final class_630 z(class_591 var0) {
long var1 = a ^ 4316816825493L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676968287240559410L ^ var1));
class_630 var10000 = var0.field_3394;
Intrinsics.checkNotNullExpressionValue(var0.field_3394, a<"w">(6119, 5514559935106975666L ^ var1));
return var10000;
}

private static final class_630 A(class_591 var0) {
long var1 = a ^ 29322356492812L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676975699579129259L ^ var1));
class_630 var10000 = var0.field_3391;
Intrinsics.checkNotNullExpressionValue(var0.field_3391, a<"w">(7458, 6431537017299655679L ^ var1));
return var10000;
}

private static final class_630 w(class_591 var0) {
long var1 = a ^ 137600223488744L;
Intrinsics.checkNotNullParameter(var0, a<"w">(9015, 6706230186303145217L ^ var1));
class_630 var10000 = var0.field_3483;
Intrinsics.checkNotNullExpressionValue(var0.field_3483, a<"w">(14404, 7529837030977527405L ^ var1));
return var10000;
}

private static final class_630 K(class_591 var0) {
long var1 = a ^ 88112035457951L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676915810655153208L ^ var1));
class_630 var10000 = var0.field_27433;
Intrinsics.checkNotNullExpressionValue(var0.field_27433, a<"w">(30676, 971516993753698452L ^ var1));
return var10000;
}

private static final class_630 I(class_591 var0) {
long var1 = a ^ 105561024561360L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676933531308902263L ^ var1));
class_630 var10000 = var0.field_3484;
Intrinsics.checkNotNullExpressionValue(var0.field_3484, a<"w">(15640, 3719047736858276120L ^ var1));
return var10000;
}

private static final class_630 p(class_591 var0) {
long var1 = a ^ 68379991210835L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1677014821655100660L ^ var1));
class_630 var10000 = var0.field_3401;
Intrinsics.checkNotNullExpressionValue(var0.field_3401, a<"w">(5560, 5562118024544264759L ^ var1));
return var10000;
}

private static final class_630 x(class_591 var0) {
long var1 = a ^ 5451402698188L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676973888643209835L ^ var1));
class_630 var10000 = var0.field_3486;
Intrinsics.checkNotNullExpressionValue(var0.field_3486, a<"w">(3164, 8686120153198533963L ^ var1));
return var10000;
}

private static final class_630 E(class_591 var0) {
long var1 = a ^ 119286424777259L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676929320976479628L ^ var1));
class_630 var10000 = var0.field_3397;
Intrinsics.checkNotNullExpressionValue(var0.field_3397, a<"w">(12029, 5878738679393931266L ^ var1));
return var10000;
}

private static final class_630 e(class_591 var0) {
long var1 = a ^ 75283512504172L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676902914502813899L ^ var1));
class_630 var10000 = var0.field_3482;
Intrinsics.checkNotNullExpressionValue(var0.field_3482, a<"w">(1920, 6456030473201312827L ^ var1));
return var10000;
}

private static final class_630 N(class_591 var0) {
long var1 = a ^ 111222720405630L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676938853693876185L ^ var1));
class_630 var10000 = var0.field_3392;
Intrinsics.checkNotNullExpressionValue(var0.field_3392, a<"w">(16085, 3727532846253593206L ^ var1));
return var10000;
}

private static final class_630 u(class_591 var0) {
long var1 = a ^ 113021416047377L;
Intrinsics.checkNotNullParameter(var0, a<"w">(2942, 1676936525002032310L ^ var1));
class_630 var10000 = var0.field_3479;
Intrinsics.checkNotNullExpressionValue(var0.field_3479, a<"w">(6772, 7674693150167455155L ^ var1));
return var10000;
}

static {
long var14 = a ^ 137842115080305L;
int var16 = (int)((var14 ^ 84382292666155L) >>> 56);
long var17 = (var14 ^ 84382292666155L) << 8 >>> 8;
vm.a<"Å">(null, -7874848882763877336L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[20];
int var10 = 0;
String var9 = "\u0081\u0014;=Ë\u0006Yb»%ó\u008duD\u0085bÖlÆL$´!¶°Z0M<ÿü\u0013\u0010§h:©Î~\u00197\u0083j\bu)\u0003ræ \u0018\u001a½È½elÂ£b±ã\u0090\u0093î,\u0002\u0001\u000eë°f[ìMä\u0091Ü9Bkí\u0010¢L=C\u0094\u000eE£\u008aíÚ]Õ\f \u001b \b-É\u009d\u0089\u0091\u0088K¥ ZÍæ\u0011Ã;\u0095D\u0018Z\u0086$þ?êþÓ¦²ï»¤ \u0013²c\u008bu½\u008ce9\u0016Ò*Á\u0019\u0083sT\u0014ÁgòwÐ\u0097_\u0011ºÊ\u008a\u001c¹Ï\u0010¥¡ú\u0015\u00adu\u009d(z\u0000\u0006\u009bôØh0\u0018ÑÏòL#\u0098Èä$Znþ¨×Ñ¶\u0097;\u001d·\u0088±þ¼\u0018:\u008c\u008eÈdcì\u0082M\u0007´Y\u0099\u0012#;\u000bfÊ\u008c\u0017QZ;\u0018\u0014\u008båpÇÕÿ6÷\u0007Z\u0004\u0092ô\u008c;\u0018(9»%2ý-\u0010\u009e¹´\u008dàê5¹, d$\u008eÇ³9\u0010\u0010\u0017s\u0001\u009b\u001bó_]l\u0010à©,ùP\u0010§X\u0086Ý,aÁMø°é\u0088EÄEá\u0010\u0006ÜíD\u0002\u0082\\íðõCµ³,|F\u0018$£d3*h\u0002@êÇéúù8i\u0094nðí¸E/\u0089B\u0018\u0017uo?B fP\r£z*y\u0012z\u0096Ø\u0007\u0083º¤8$0 \u0089f¶ÄFÈÕ#·\u0007»UÒ\u009ef\u0096÷\u009e\u0002âUñ¢aÝç\u0093&l\u001câj\u0010\u001e¿*\u0000\u0080\u0000?\u007fÑ°ÔÞf\u0086\u0098h";
int var11 = "\u0081\u0014;=Ë\u0006Yb»%ó\u008duD\u0085bÖlÆL$´!¶°Z0M<ÿü\u0013\u0010§h:©Î~\u00197\u0083j\bu)\u0003ræ \u0018\u001a½È½elÂ£b±ã\u0090\u0093î,\u0002\u0001\u000eë°f[ìMä\u0091Ü9Bkí\u0010¢L=C\u0094\u000eE£\u008aíÚ]Õ\f \u001b \b-É\u009d\u0089\u0091\u0088K¥ ZÍæ\u0011Ã;\u0095D\u0018Z\u0086$þ?êþÓ¦²ï»¤ \u0013²c\u008bu½\u008ce9\u0016Ò*Á\u0019\u0083sT\u0014ÁgòwÐ\u0097_\u0011ºÊ\u008a\u001c¹Ï\u0010¥¡ú\u0015\u00adu\u009d(z\u0000\u0006\u009bôØh0\u0018ÑÏòL#\u0098Èä$Znþ¨×Ñ¶\u0097;\u001d·\u0088±þ¼\u0018:\u008c\u008eÈdcì\u0082M\u0007´Y\u0099\u0012#;\u000bfÊ\u008c\u0017QZ;\u0018\u0014\u008båpÇÕÿ6÷\u0007Z\u0004\u0092ô\u008c;\u0018(9»%2ý-\u0010\u009e¹´\u008dàê5¹, d$\u008eÇ³9\u0010\u0010\u0017s\u0001\u009b\u001bó_]l\u0010à©,ùP\u0010§X\u0086Ý,aÁMø°é\u0088EÄEá\u0010\u0006ÜíD\u0002\u0082\\íðõCµ³,|F\u0018$£d3*h\u0002@êÇéúù8i\u0094nðí¸E/\u0089B\u0018\u0017uo?B fP\r£z*y\u0012z\u0096Ø\u0007\u0083º¤8$0 \u0089f¶ÄFÈÕ#·\u0007»UÒ\u009ef\u0096÷\u009e\u0002âUñ¢aÝç\u0093&l\u001câj\u0010\u001e¿*\u0000\u0080\u0000?\u007fÑ°ÔÞf\u0086\u0098h"
.length();
char var8 = ' ';
int var20 = -1;

label37:
while (true) {
String var21 = var9.substring(++var20, var20 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var21.getBytes("ISO-8859-1"));
String var29 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var29;
if ((var20 += var8) >= var11) {
b = var12;
c = new String[20];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -601460653237527546L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var33 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var33;
HEAD = new ce(ce::d, ce::z, 0.5, 0.25);
BODY = new ce(ce::A, ce::w, 0.7, 0.2);
LEFT_ARM = new ce(ce::K, ce::I, 0.6, 0.2);
RIGHT_ARM = new ce(ce::p, ce::x, 0.6, 0.2);
LEFT_LEG = new ce(ce::E, ce::e, 0.7, 0.2);
RIGHT_LEG = new ce(ce::N, ce::u, 0.7, 0.2);
V = EnumEntriesKt.enumEntries(S);
return;
}

var8 = var9.charAt(var20);
break;
default:
var12[var10++] = var29;
if ((var20 += var8) < var11) {
var8 = var9.charAt(var20);
continue label37;
}

var9 = "\u0089¡\u0014\u0088\u0088Ý¾¬(edsÊqU\u0084\u0010v4D%÷>ÀÀ`8ÙOýË¦ò";
var11 = "\u0089¡\u0014\u0088\u0088Ý¾¬(edsÊqU\u0084\u0010v4D%÷>ÀÀ`8ÙOýË¦ò".length();
var8 = 16;
var20 = -1;
}

var21 = var9.substring(++var20, var20 + var8);
var10001 = 0;
}
}
}

public static void u(String var0) {
T = var0;
}

public static String w() {
return T;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12117;
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
throw new RuntimeException("su/catlean/ce", var10);
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
throw new RuntimeException("su/catlean/ce" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
