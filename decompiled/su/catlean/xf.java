package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class xf implements Comparator {
private static final long a = yz.a(7040518653584201961L, -5907578590386348756L, MethodHandles.lookup().lookupClass()).a(191752529576189L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 35516109807865L;
long var5 = var3 ^ 111757679916052L;
class_3965 var8 = (class_3965)ax;
boolean var9 = false;
int var10000 = vm.a<"Å">(2774019941161862514L, var3);
Comparable var10001 = zf.v(var5).method_33571().method_1025(var8.method_17784());
var8 = (class_3965)b;
Comparable var10 = var10001;
int var7 = var10000;
var9 = false;

try {
var10000 = ComparisonsKt.compareValues(var10, zf.v(var5).method_33571().method_1025(var8.method_17784()));
if (var7 == 0) {
vm.a<"Å">(new _g[5], 2764346852293487713L, var3);
}

return var10000;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 2752954395106238557L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
