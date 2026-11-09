package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;

final class fh {
@NotNull
private final class_1297 f;
private final float g;
private final double r;
private final double P;
private final double o;
private int C;
private static final long a = yz.a(-4367063019617745768L, 6073599645286526085L, MethodHandles.lookup().lookupClass()).a(48227527715650L);
private static final String b;
private static final long c;

public fh(@NotNull class_1297 entity, float hp, double posX, double posY, long a, double posZ, int ticks) {
ax = a ^ ax;
int[] var10000 = vm.a<"Å">(5559238187300696337L, ax);
Intrinsics.checkNotNullParameter(entity, b);
super();
int[] var12 = var10000;

try {
this.f = entity;
this.g = hp;
this.r = posX;
this.P = posY;
this.o = posZ;
this.C = ticks;
if (var12 == null) {
vm.a<"Å">(new _g[1], 5563020563082069774L, ax);
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 5580202469138731718L, ax);
}
}

public fh(class_1297 var1, float var2, double var3, double var5, double var7, int var9, long var10, int var12, DefaultConstructorMarker var13) {
var10 = a ^ var10;
long var14 = var10 ^ 109669433823135L;
if ((var12 & (int)c) != 0) {
var9 = 0;
}

this(var1, var2, var3, var5, var14, var7, var9);
}

@NotNull
public final class_1297 x() {
return this.f;
}

public final float Z() {
return this.g;
}

public final double z() {
return this.r;
}

public final double D() {
return this.P;
}

public final double M() {
return this.o;
}

public final int k() {
return this.C;
}

public final void J(int <set-?>) {
this.C = <set-?>;
}

public final float s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 92417173860633L;
int[] var5 = vm.a<"Å">(3408422373891462010L, var1);

try {
float var10000 = jl.y.T(RangesKt.coerceAtLeast(this.C - 1.0F, 0.0F), this.C, var3);
if (vm.a<"Å">(3399849089144074687L, var1) != null) {
vm.a<"Å">(new int[4], 3354647753938035602L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 3394477369989722285L, var1);
}
}

static {
long var5 = a ^ 119792104140370L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var9 = var7.doFinal("\u0089ÐSæc»Vq".getBytes("ISO-8859-1"));
String var12 = a(var9).intern();
byte var10001 = -1;
b = var12;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 3191627675618505191L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var14 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
c = var14;
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
