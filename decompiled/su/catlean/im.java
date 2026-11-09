package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class im {
@NotNull
private final String b;
@Nullable
private Object Z;
private static _g[] w;
private static final long a = yz.a(472514213862730391L, 6475336801966969797L, MethodHandles.lookup().lookupClass()).a(273495747606358L);
private static final String c;

public im(@NotNull String name, char a, long a) {
long var5 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
_g[] var10000 = vm.a<"Å">(658099033822425912L, var5);
Intrinsics.checkNotNullParameter(name, c);
_g[] var7 = var10000;
super();
this.b = name;
if (var7 != null) {
vm.a<"Å">(new _g[5], 654073173961933614L, var5);
}
}

@NotNull
public final String N() {
return this.b;
}

@Nullable
public final Object f() {
return this.Z;
}

public final void c(@Nullable Object <set-?>) {
this.Z = <set-?>;
}

public static void I(_g[] var0) {
w = var0;
}

public static _g[] F() {
return w;
}

static {
long var3 = a ^ 100333553318663L;
if (vm.a<"Å">(-7309331382747996022L, var3) != null) {
vm.a<"Å">(new _g[5], -7242537361900935549L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("M&S\u0095sË\u009ba".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
c = var5;
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
