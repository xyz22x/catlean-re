package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;

public final class wf implements class_4588 {
@NotNull
private final g7 f;
@NotNull
private final Color L;
private static final long a = yz.a(9142289781137877925L, -3782846691724570767L, MethodHandles.lookup().lookupClass()).a(236401166593230L);
private static final String b;

public wf(long a, byte a, @NotNull g7 polygon, @NotNull Color c) {
long var6 = (axx << 8 | (long)ax << 56 >>> 56) ^ a;
Intrinsics.checkNotNullParameter(polygon, b);
Intrinsics.checkNotNullParameter(c, "c");
super();
String[] var10000 = vm.a<"Å">(-7465575463228414461L, var6);
this.f = polygon;
String[] var8 = var10000;

try {
this.L = c;
if (var8 != null) {
vm.a<"Å">(new _g[4], -7432136772876725530L, var6);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -7487530744403329826L, var6);
}
}

@NotNull
public final g7 Y() {
return this.f;
}

@NotNull
public final Color R() {
return this.L;
}

@NotNull
public class_4588 method_22912(float x, float y, float z) {
long var4 = a ^ 83149520982153L;
long var6 = var4 ^ 76462108569525L;
this.f.G(x, var6, y, z);
return this;
}

@NotNull
public wf y(int red, int green, int blue, int alpha) {
return this;
}

@NotNull
public class_4588 method_39415(int argb) {
return this;
}

@NotNull
public class_4588 method_22913(float u, float v) {
long var3 = a ^ 63212719088600L;
long var5 = var3 ^ 135993317054986L;
long var7 = var3 ^ 46871861247793L;
vm.a<"Å">(8651414265236555368L, var3);
this.f.j(u, var7, v).n(this.L, var5);

try {
class_4588 var10000 = this;
if (vm.a<"Å">(8702807727793464919L, var3) != null) {
vm.a<"Å">(new String[2], 8651234641101730764L, var3);
}

return var10000;
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 8682376792940223669L, var3);
}
}

@NotNull
public wf F(int u, int v) {
return this;
}

@NotNull
public wf H(int u, int v) {
return this;
}

@NotNull
public wf e(float x, float y, float z) {
return this;
}

@NotNull
public wf S(float width) {
return this;
}

public class_4588 method_1336(int i, int j, int k, int l) {
return this.y(i, j, k, l);
}

public class_4588 method_60796(int i, int j) {
return this.F(i, j);
}

public class_4588 method_22921(int i, int j) {
return this.H(i, j);
}

public class_4588 method_22914(float f, float g, float h) {
return this.e(fx, g, h);
}

public class_4588 method_75298(float f) {
return this.S(fx);
}

static {
long var0 = a ^ 13691079689324L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("¿\u0081Õ\u0019ð\u00184F".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
b = var5;
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
