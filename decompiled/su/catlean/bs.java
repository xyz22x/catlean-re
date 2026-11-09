package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class bs implements Comparator {
private static int[] h;
private static final long a = yz.a(5923240106666421228L, -7850087669393763421L, MethodHandles.lookup().lookupClass()).a(22166380070477L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 118981396709369L;
long var5 = var3 ^ 118834235281728L;
int[] var10000 = vm.a<"Å">(4854265350987475786L, var3);
class_3965 var8 = (class_3965)ax;
int[] var7 = var10000;
boolean var9 = false;
Comparable var14 = zf.v(var5).method_33571().method_1025(var8.method_17784());
var8 = (class_3965)b;
Comparable var10 = var14;
var9 = false;

try {
int var15 = ComparisonsKt.compareValues(var10, zf.v(var5).method_33571().method_1025(var8.method_17784()));
if (var7 != null) {
vm.a<"Å">(new _g[3], 4830365000835156277L, var3);
}

return var15;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 4850385320323569150L, var3);
}
}

public static void W(int[] var0) {
h = var0;
}

public static int[] E() {
return h;
}

static {
long var0 = a ^ 11330182221913L;
if (vm.a<"Å">(7853634426906232042L, var0) != null) {
vm.a<"Å">(new int[1], 7836431248691393615L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
