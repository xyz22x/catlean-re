package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class py implements Comparator {
private static final long a = yz.a(4812327757467540131L, -4779279334101556560L, MethodHandles.lookup().lookupClass()).a(141173933098680L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 87061897724683L;
long var5 = var3 ^ 43541456475843L;
mw var8 = (mw)ax;
vm.a<"Å">(309717575790556695L, var3);
boolean var9 = false;
Comparable var10000 = zf.v(var5).method_5707(var8.P().method_46558());
var8 = (mw)b;
Comparable var10 = var10000;
var9 = false;

try {
int var14 = ComparisonsKt.compareValues(var10, zf.v(var5).method_5707(var8.P().method_46558()));
if (vm.a<"Å">(359595648713366124L, var3) != null) {
vm.a<"Å">(new String[2], 291576224514139016L, var3);
}

return var14;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 304984630262612163L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
