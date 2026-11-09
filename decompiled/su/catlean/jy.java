package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

enum jy {
@NotNull
private final class_2960 o;
@NotNull
private final class_2960 q;
public static final jy CONTAINER;
public static final jy NORMAL;
public static final jy ABSORBING;
private static final jy[] j;
private static final EnumEntries x;
private static final long a = yz.a(1932610023855144807L, 3324433405844299484L, MethodHandles.lookup().lookupClass()).a(99569550897541L);

private jy(class_2960 var3, class_2960 var4) {
this.o = var3;
this.q = var4;
}

@NotNull
public final class_2960 Z(long a, boolean half) {
ax = a ^ ax;

try {
if (half) {
return this.q;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 6375507960969037285L, ax);
}

return this.o;
}

@NotNull
public static EnumEntries S() {
return x;
}

private static final jy[] a() {
return new jy[]{CONTAINER, NORMAL, ABSORBING};
}

static {
long var9 = a ^ 118735757526252L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[11];
int var6 = 0;
String var5 = "¿\u009awks÷\rõôn\u0014$/V\u008f#\u000eß\u0007\u008c9\u009egSÃyÍI9Ü¼|\bZHõÔú*¿N\u0010¿\u009awks÷\rõëGø³+J¡u\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸\u0010Ô\u0016\u0080\u0001ý·¹?²ÑafZ\u0010\u0004á\u0010¿\u009awks÷\rõWèB\n·\u0097\u009fÞ ¿\u009awks÷\rõôn\u0014$/V\u008f#ò\u0094ñ£ý\u0005{5Î°\u0097\u0098r«\u008cç\u0010\u0084åÛÈº´Ý~\u009bp\f\u0018îPK\u0002\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸";
int var7 = "¿\u009awks÷\rõôn\u0014$/V\u008f#\u000eß\u0007\u008c9\u009egSÃyÍI9Ü¼|\bZHõÔú*¿N\u0010¿\u009awks÷\rõëGø³+J¡u\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸\u0010Ô\u0016\u0080\u0001ý·¹?²ÑafZ\u0010\u0004á\u0010¿\u009awks÷\rõWèB\n·\u0097\u009fÞ ¿\u009awks÷\rõôn\u0014$/V\u008f#ò\u0094ñ£ý\u0005{5Î°\u0097\u0098r«\u008cç\u0010\u0084åÛÈº´Ý~\u009bp\f\u0018îPK\u0002\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸"
.length();
char var4 = ' ';
int var12 = -1;

label28:
while (true) {
String var13 = var5.substring(++var12, var12 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var19;
if ((var12 += var4) >= var7) {
String var22 = var0[7];
class_2960 var10004 = class_2960.method_60656(var0[3]);
Intrinsics.checkNotNullExpressionValue(var10004, var0[10]);
class_2960 var10005 = class_2960.method_60656(var0[8]);
Intrinsics.checkNotNullExpressionValue(var10005, var0[9]);
CONTAINER = new jy(var10004, var10005);
String var23 = var0[1];
var10004 = class_2960.method_60656(var0[2]);
Intrinsics.checkNotNullExpressionValue(var10004, var0[9]);
var10005 = class_2960.method_60656(var0[5]);
Intrinsics.checkNotNullExpressionValue(var10005, var0[9]);
NORMAL = new jy(var10004, var10005);
String var24 = var0[4];
var10004 = class_2960.method_60656(var0[6]);
Intrinsics.checkNotNullExpressionValue(var10004, var0[9]);
var10005 = class_2960.method_60656(var0[0]);
Intrinsics.checkNotNullExpressionValue(var10005, var0[9]);
ABSORBING = new jy(var10004, var10005);
j = a();
x = EnumEntriesKt.enumEntries(j);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label28;
}

var5 = "w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g";
var7 = "w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g".length();
var4 = ' ';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
