package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class _t implements Comparator {
private static final long a = yz.a(-2090984215748182622L, -5200576937610715304L, MethodHandles.lookup().lookupClass()).a(126835002431466L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 56682974102382L;
long var5 = var3 ^ 68766843788099L;
int var10000 = vm.a<"Å">(719931592166766050L, var3);
class_3965 var8 = (class_3965)ax;
int var7 = var10000;
boolean var9 = false;
Comparable var15 = zf.v(var5).method_33571().method_1025(var8.method_17784());
var8 = (class_3965)b;
Comparable var10 = var15;
var9 = false;

try {
var10000 = ComparisonsKt.compareValues(var10, zf.v(var5).method_33571().method_1025(var8.method_17784()));
if (vm.a<"Å">(683864641215272940L, var3) != null) {
vm.a<"Å">(++var7, 631738025734581661L, var3);
}

return var10000;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 680731273420385268L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
