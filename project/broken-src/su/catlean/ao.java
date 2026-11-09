package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class ao implements Comparator {
private static final long a = yz.a(-4108389660852814468L, -3529977151439157233L, MethodHandles.lookup().lookupClass()).a(178748269017660L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 50866691897957L;
long var5 = var3 ^ 16928173587383L;
long var7 = var3 ^ 32888171895543L;
int var10000 = vm.a<"Å">(5253669605424258444L, var3);
iz var10 = (iz)b;
int var9 = var10000;
boolean var11 = false;
Comparable var17 = zf.v(var7).method_5707(var10.f(var5));
var10 = (iz)ax;
Comparable var12 = var17;
var11 = false;

try {
var10000 = ComparisonsKt.compareValues(var12, zf.v(var7).method_5707(var10.f(var5)));
if (vm.a<"Å">(5244916921770464856L, var3) != null) {
vm.a<"Å">(++var9, 5194077333610885836L, var3);
}

return var10000;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 5208214945883689101L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
