package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class j0 {
@NotNull
private final List V;
private static final long a = yz.a(5029942605386981333L, -4741181842543453637L, MethodHandles.lookup().lookupClass()).a(90150293233075L);
private static final String b;

public j0(@NotNull List suggestions, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(suggestions, b);
super();
this.V = suggestions;
}

@Nullable
public final String X(@NotNull String s, long a) {
ax = a ^ ax;
String var10000 = vm.a<"Å">(-6749216828452542325L, ax);
Intrinsics.checkNotNullParameter(s, "s");
Iterable var5 = this.V;
String var4 = var10000;
boolean var6 = false;

label27:
for (Object var12 : var5) {
label25:
while (true) {
Object var8 = var12;
var12 = var8;

do {
String var9 = (String)var12;
boolean var10 = false;
if (!StringsKt.startsWith$default(var9, s, false, 2, null)) {
continue label27;
}

var12 = var8;
if (ax < 0L) {
continue label25;
}
} while (var4 == null);

return (String)var8;
}
}

return (String)null;
}

static {
long var0 = a ^ 27894210637048L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal(")M\u0017\u0099Þ:\u0011\u0005ê>â¥Øö/Û".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
b = var5;
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
