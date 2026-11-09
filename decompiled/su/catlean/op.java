package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

public final class op {
@NotNull
private static final Json O;
private static int[] E;
private static final long a = yz.a(-4736635959034706142L, -5031677942863051632L, MethodHandles.lookup().lookupClass()).a(200207185930461L);
private static final String b;

@NotNull
public static final Json d() {
return O;
}

/** @deprecated */
public static void H() {
}

private static final Unit q(JsonBuilder var0) {
long var1 = a ^ 62467263332300L;
Intrinsics.checkNotNullParameter(var0, b);
var0.setIgnoreUnknownKeys(true);
var0.setExplicitNulls(false);
var0.setNamingStrategy(JsonNamingStrategy.Builtins.getSnakeCase());
return Unit.INSTANCE;
}

static {
long var3 = a ^ 132987648724679L;
if (vm.a<"Å">(1835261948800857743L, var3) == null) {
vm.a<"Å">(new int[1], 1853671601706333110L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("Àîà \u0090\u0088Rq¬¼Å\u000fØ\b³¸".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
b = var5;
O = JsonKt.Json$default(null, op::q, 1, null);
}

public static void y(int[] var0) {
E = var0;
}

public static int[] v() {
return E;
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
