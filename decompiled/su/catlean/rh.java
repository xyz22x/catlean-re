package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class rh implements Comparator {
final class_243 U;
private static String R;
private static final long a = yz.a(-6313708130230503124L, 7962333429127072206L, MethodHandles.lookup().lookupClass()).a(26767716032862L);

public rh(class_243 var1) {
this.U = var1;
}

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 36498954575889L;
vm.a<"Å">(-2182121266847390014L, var3);
class_2338 var6 = (class_2338)ax;
boolean var7 = false;
Comparable var10000 = var6.method_46558().method_1022(this.U);
var6 = (class_2338)b;
Comparable var8 = var10000;
var7 = false;

try {
int var12 = ComparisonsKt.compareValues(var8, var6.method_46558().method_1022(this.U));
if (vm.a<"Å">(-2171357203412877492L, var3) != null) {
vm.a<"Å">("V2VCnc", -2200999835961600662L, var3);
}

return var12;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -2173250816852606939L, var3);
}
}

public static void p(String var0) {
R = var0;
}

public static String q() {
return R;
}

static {
long var0 = a ^ 69636711906990L;
if (vm.a<"Å">(-69645113239963523L, var0) != null) {
vm.a<"Å">("mb4Grc", -14808050291323947L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
