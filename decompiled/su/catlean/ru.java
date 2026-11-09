package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public abstract class ru {
@NotNull
private final a1 i;
private float L;
private float A;
private float w;
private float M;
private static boolean c;
private static final long a = yz.a(-700852211368038802L, -3026040840279007935L, MethodHandles.lookup().lookupClass()).a(269491494342262L);
private static final String j;

public ru(long a, @NotNull a1 setting) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(setting, j);
super();
this.i = setting;
this.w = 116.0F;
this.M = 13.0F;
}

@NotNull
public a1 A() {
return this.i;
}

public final float x() {
return this.L;
}

public final void V(float <set-?>) {
this.L = <set-?>;
}

public final float R() {
return this.A;
}

public final void S(float <set-?>) {
this.A = <set-?>;
}

public final float F() {
return this.w;
}

public final void h(float <set-?>) {
this.w = <set-?>;
}

public final float d() {
return this.M;
}

public final void m(float <set-?>) {
this.M = <set-?>;
}

public abstract void r(@NotNull class_332 var1, int var2, int var3, long var4, float var6);

public abstract void W(long var1, double var3, double var5, int var7);

public abstract void U(double var1, double var3, int var5);

public abstract void V(int var1, short var2, int var3, char var4);

public abstract void T(char var1, long var2);

public abstract boolean S(byte var1, double var2, double var4, double var6, long var8);

public abstract void L();

public static void O(boolean var0) {
c = var0;
}

public static boolean z() {
return c;
}

public static boolean e() {
boolean var0 = z();

try {
return !var0;
} catch (NumberFormatException var1) {
throw b(var1);
}
}

static {
long var3 = a ^ 127949377976144L;
if (vm.a<"Å">(2514945100849049314L, var3)) {
vm.a<"Å">(true, 2492724231543726443L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal(" öQ\u0001\u001b\u001fÒC".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
j = var5;
}

private static NumberFormatException b(NumberFormatException var0) {
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
