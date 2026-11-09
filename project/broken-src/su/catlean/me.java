package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class me implements Comparator {
final double[] s;
private static final long a = yz.a(2162100038635540272L, -2305859575058774886L, MethodHandles.lookup().lookupClass()).a(235743095427625L);

public me(double[] var1) {
this.s = var1;
}

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 118911429089929L;
long var5 = var3 ^ 94459462929367L;
class_2338 var7 = (class_2338)ax;
boolean var8 = false;
Comparable var10000 = var7.method_46558().method_1028(zf.v(var5).method_23317() + this.s[0], zf.v(var5).method_23318(), zf.v(var5).method_23321() + this.s[1]);
var7 = (class_2338)b;
Comparable var9 = var10000;
var8 = false;
return ComparisonsKt.compareValues(
var9, var7.method_46558().method_1028(zf.v(var5).method_23317() + this.s[0], zf.v(var5).method_23318(), zf.v(var5).method_23321() + this.s[1])
);
}
}
