package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_742;

public final class lx implements Comparator {
private static final long a = yz.a(1471641405891890113L, -8921413038051735226L, MethodHandles.lookup().lookupClass()).a(238339136643562L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 111601192981933L;
int var5 = (int)((var3 ^ 83405062270487L) >>> 56);
long var6 = (var3 ^ 83405062270487L) << 8 >>> 8;
long var8 = var3 ^ 44625689931286L;
class_742 var11 = (class_742)b;
boolean var12 = false;
class_243 var10000 = ko.u.J((byte)var5, var6, (class_1297)zf.v(var8));
ko var10001 = ko.u;
Intrinsics.checkNotNull(var11);
Comparable var17 = var10000.method_1025(var10001.J((byte)var5, var6, (class_1297)var11));
var11 = (class_742)ax;
Comparable var13 = var17;
int var18 = vm.a<"Å">(-4843044746181458770L, var3);
var12 = false;
int var10 = var18;

try {
var10000 = ko.u.J((byte)var5, var6, (class_1297)zf.v(var8));
var10001 = ko.u;
Intrinsics.checkNotNull(var11);
int var20 = ComparisonsKt.compareValues(var13, var10000.method_1025(var10001.J((byte)var5, var6, (class_1297)var11)));
if (var10 != 0) {
vm.a<"Å">(new _g[5], -4873277554631985565L, var3);
}

return var20;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -4846214539923088394L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
