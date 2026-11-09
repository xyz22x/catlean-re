package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;

public final class gd implements Comparator {
private static int[] A;
private static final long a = yz.a(509664487931814498L, 1453492134935506192L, MethodHandles.lookup().lookupClass()).a(258674519614279L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 105774216231178L;
int var5 = (int)((var3 ^ 7739116972883L) >>> 56);
long var6 = (var3 ^ 7739116972883L) << 8 >>> 8;
long var8 = var3 ^ 110245840939858L;
int[] var10000 = vm.a<"Å">(4128906720713863763L, var3);
class_1297 var11 = (class_1297)ax;
boolean var12 = false;
class_243 var10001 = zf.v(var8).method_33571();
en var10002 = en.b;
Intrinsics.checkNotNull(var11);
Comparable var19 = var10001.method_1025(var10002.J((byte)var5, var6, var11));
var11 = (class_1297)b;
Comparable var13 = var19;
int[] var10 = var10000;
var12 = false;

try {
class_243 var17 = zf.v(var8).method_33571();
en var20 = en.b;
Intrinsics.checkNotNull(var11);
int var18 = ComparisonsKt.compareValues(var13, var17.method_1025(var20.J((byte)var5, var6, var11)));
if (var10 != null) {
vm.a<"Å">(new _g[3], 4114864202853397287L, var3);
}

return var18;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 4090690585147815978L, var3);
}
}

public static void v(int[] var0) {
A = var0;
}

public static int[] v() {
return A;
}

static {
long var0 = a ^ 125591526382972L;
if (vm.a<"Å">(-7117164314500540891L, var0) != null) {
vm.a<"Å">(new int[5], -7065510142528239839L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
