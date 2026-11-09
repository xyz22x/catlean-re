package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_1657;
import net.minecraft.class_2338;

public final class _7 implements Comparator {
final class_1657 H;
private static _g[] L;
private static final long a = yz.a(-3711468906153983158L, -4387807468706797874L, MethodHandles.lookup().lookupClass()).a(130708210504400L);

public _7(class_1657 var1) {
this.H = var1;
}

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 125032682665923L;
class_2338 var6 = (class_2338)ax;
_g[] var10000 = vm.a<"Å">(776730510595704524L, var3);
boolean var7 = false;
_g[] var5 = var10000;
Comparable var12 = this.H.method_33571().method_1022(var6.method_46558());
var6 = (class_2338)b;
Comparable var8 = var12;
var7 = false;

try {
int var13 = ComparisonsKt.compareValues(var8, this.H.method_33571().method_1022(var6.method_46558()));
if (var5 != null) {
vm.a<"Å">(new _g[1], 749428133087543387L, var3);
}

return var13;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 765884065645927250L, var3);
}
}

public static void O(_g[] var0) {
L = var0;
}

public static _g[] L() {
return L;
}

static {
long var0 = a ^ 42664748420834L;
if (vm.a<"Å">(3739913152000557037L, var0) != null) {
vm.a<"Å">(new _g[3], 3740770293838016589L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
