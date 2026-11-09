package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;

public final class cc {
private final float Q;
private final float x;
private final float D;
private final float Y;
private final float u;
private final float Z;
private final int l;
private final int n;
private final int O;
private final int v;
private final int K;
private final int L;
private final float U;
@NotNull
private final Matrix3x2f b;
private static final long a = yz.a(-1323630252890563535L, -4327020380130851021L, MethodHandles.lookup().lookupClass()).a(155679556902218L);
private static final String c;

public cc(float atX, float atY, float r, float g, float b, long a, float a, int w, int h, int ow, int oh, int u, int v, float z, @NotNull Matrix3x2f matrix) {
axx = a ^ axx;
Intrinsics.checkNotNullParameter(matrix, c);
super();
this.Q = atX;
this.x = atY;
this.D = r;
this.Y = g;
this.u = bx;
this.Z = ax;
this.l = w;
this.n = h;
this.O = ow;
this.v = oh;
this.K = ux;
this.L = vx;
this.U = z;
this.b = matrix;
}

public final float J() {
return this.Q;
}

public final float X() {
return this.x;
}

public final float p() {
return this.D;
}

public final float L() {
return this.Y;
}

public final float u() {
return this.u;
}

public final float s() {
return this.Z;
}

public final int q() {
return this.l;
}

public final int i() {
return this.n;
}

public final int K() {
return this.O;
}

public final int U() {
return this.v;
}

public final int G() {
return this.K;
}

public final int g() {
return this.L;
}

public final float Z() {
return this.U;
}

@NotNull
public final Matrix3x2f o() {
return this.b;
}

static {
long var0 = a ^ 178368473284L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("\u008cÍ¶Ô\u009cSb\u007f".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
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
