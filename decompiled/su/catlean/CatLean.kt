package su.catlean

import java.lang.invoke.CallSite
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.invoke.MutableCallSite
import java.lang.invoke.MethodHandles.Lookup
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESKeySpec
import javax.crypto.spec.IvParameterSpec
import su.catlean.api.IPasteable
import su.catlean.api.event.events.client.InitEvent
import su.catlean.api.event.events.client.PostTitleScreenInitEvent
import su.catlean.gofra.Flow

@ExcludeCommon
public object CatLean : IPasteable {
public open fun onInitializeClient() {
val var3: Long = a xor 111274068642529L xor 134509087378048L;
val var5: Long = a xor 111274068642529L xor 120695299351714L;
ts.l(this, var3);
mr.t(var5, this);
}

@Flow
private fun M(event: InitEvent) {
val var2: Long = a xor 24129198870584L;
var var10001: Long = a xor 24129198870584L xor 29502266757797L;
val var4: Int = (int)((a xor 24129198870584L xor 29502266757797L) ushr 32);
val var5: Int = (int)(((var2 xor 29502266757797L) shl 32) ushr 48);
val var6: Int = (int)((var10001 shl 48) ushr 48);
var10001 = var2 xor 53848494592964L;
val var7: Int = (int)((var2 xor 53848494592964L) ushr 48);
val var8: Int = (int)(((var2 xor 53848494592964L) shl 16) ushr 48);
val var9: Int = (int)((var10001 shl 32) ushr 32);
PreLaunch.INSTANCE.L();
cv.K(this, var4, (char)var5, (char)var6);
i4.h.y((short)var7, (char)var8, var9);
System.setProperty(
a<"k">(25733, 4958189276859768870L xor var2),
"${a<"k">(24705, 7071336512583967779L xor var2)}${System.getProperty(a<"k">(29840, 8484118454674599985L xor var2))}"
);
}

@Flow
private fun X(event: PostTitleScreenInitEvent) {
val var2: Long = a xor 59852727727436L;
val var4: Long = a xor 59852727727436L xor 72659473070024L;
val var6: Long = a xor 59852727727436L xor 105557133716979L;

try {
if (sc.V()) {
zf.F(var4).method_1507(new d7(var6));
}
} catch (var8: NumberFormatException) {
throw vm.a<"Å">(var8, 3147750806345838348L, var2);
}
}

@JvmStatic
fun {
val var0: Long = a xor 56238235032608L;
val var2: Cipher;
val var10000: Cipher = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
val var10002: SecretKeyFactory = SecretKeyFactory.getInstance("DES");
val var10003: ByteArray = new byte[]{(byte)(var0 ushr 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)((var0 shl var3 * 8) ushr 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
val var9: Array<java.lang.String> = new java.lang.String[3];
var var7: Int = 0;
val var6: java.lang.String = "@8¤Ù^²-\u000eK\u00899ñßÈ\u009dÇôE\u008a¼îÿeáüeñ\u0094g\"\u001bê\u0010\u0083x»ÂÑ¶\u008f\b\u0016\u0088h Ç\u0010\u000bª Bð\u009f¼\u008bQÿ\u001cÜë(2<Ú?K@y\u0010¸¨PFX\u0018Ü)\u0084®Pôf";
val var8: Int = "@8¤Ù^²-\u000eK\u00899ñßÈ\u009dÇôE\u008a¼îÿeáüeñ\u0094g\"\u001bê\u0010\u0083x»ÂÑ¶\u008f\b\u0016\u0088h Ç\u0010\u000bª Bð\u009f¼\u008bQÿ\u001cÜë(2<Ú?K@y\u0010¸¨PFX\u0018Ü)\u0084®Pôf"
.length();
var var5: Char = ' ';
var var4: Int = -1;

while (true) {
var9[var7++] = a(var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"))).intern();
if ((var4 += var5) >= var8) {
b = var9;
c = new java.lang.String[3];
INSTANCE = new CatLean();
return;
}

var5 = var6.charAt(var4);
}
}

@JvmStatic
fun a(var0: NumberFormatException): NumberFormatException {
return var0;
}

@JvmStatic
fun a(var0: ByteArray): java.lang.String {
var var1: Int = 0;
val var2: Int;
val var3: CharArray = new char[var2 = var0.length];

for (int var4 = 0; var4 < var2; var4++) {
val var5: Int;
if ((var5 = 255 and var0[var4]) < 192) {
var3[var1++] = (char)var5;
} else if (var5 < 224) {
var3[var1++] = (char)((char)((char)(var5 and 31) shl 6) or (char)(var0[++var4] and 63));
} else if (var4 < var2 - 2) {
var3[var1++] = (char)((char)((char)((char)(var5 and 15) shl 12) or (char)(var0[++var4] and 63) shl 6) or (char)(var0[++var4] and 63));
}
}

return new java.lang.String(var3, 0, var1);
}

@JvmStatic
fun a(var0: Int, var1: Long): java.lang.String {
val var5: Int = var0 xor (int)(var1 and 32767L) xor 2902;
if (c[var0 xor (int)(var1 and 32767L) xor 2902] == null) {
var var4: Array<Any>;
try {
val var3: java.lang.Long = Thread.currentThread().threadId();
var4 = d.get(var3) as Array<Any>;
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (var10: Exception) {
throw new RuntimeException("su/catlean/CatLean", var10);
}

val var6: ByteArray = new byte[8];
var6[0] = (byte)(var1 ushr 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)((var1 shl var7 * 8) ushr 56);
}

(var4[0] as Cipher).init(2, (var4[1] as SecretKeyFactory).generateSecret(new DESKeySpec(var6)), var4[2] as IvParameterSpec);
c[var5] = a((var4[0] as Cipher).doFinal(b[var5].getBytes("ISO-8859-1")));
}

return c[var5];
}

@JvmStatic
fun a(var0: Lookup, var1: MutableCallSite, var2: java.lang.String, var3: Array<Any>): Any {
val var7: java.lang.String = a(var3[0] as Int, var3[1] as java.lang.Long);
var1.setTarget(MethodHandles.dropArguments(MethodHandles.constant(java.lang.String.class, var7), 0, int.class, long.class));
return var7;
}

@JvmStatic
fun a(var0: Lookup, var1: java.lang.String, var2: MethodType): CallSite {
val var3: MutableCallSite = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (var5: Exception) {
throw new RuntimeException("su/catlean/CatLean : $var1 : ${var2.toString()}", var5);
}
}
}
