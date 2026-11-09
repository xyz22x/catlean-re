package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class w1 {
private final float r;
private final float v;
private final float w;
private int e;
@NotNull
private final Color P;
private static final long a = yz.a(3872253167715393531L, 5390006120305610838L, MethodHandles.lookup().lookupClass()).a(12828209212602L);
private static final String b;

public w1(float posX, float posY, float posZ, short a, int age, @NotNull Color color, long a) {
long var9 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
vm.a<"Å">(4869464287066375372L, var9);
Intrinsics.checkNotNullParameter(color, b);
super();
this.r = posX;
this.v = posY;
this.w = posZ;
this.e = age;
this.P = color;
if (vm.a<"Å">(4885278609586937178L, var9) != null) {
vm.a<"Å">(new String[4], 4831673250781811244L, var9);
}
}

public final float u() {
return this.r;
}

public final float G() {
return this.v;
}

public final float d() {
return this.w;
}

public final int H() {
return this.e;
}

public final void W(int <set-?>) {
this.e = <set-?>;
}

@NotNull
public final Color z() {
return this.P;
}

static {
long var0 = a ^ 136908613634178L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("\u001déçL\u0015$æQ".getBytes("ISO-8859-1"));
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
