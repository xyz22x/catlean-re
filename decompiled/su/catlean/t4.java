package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class t4 implements Comparator {
private static final long a = yz.a(-4165720267587765446L, 5979288400800260635L, MethodHandles.lookup().lookupClass()).a(203553888226240L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 1109940010376L;
long var5 = var3 ^ 118476870886674L;
class_2338 var7 = (class_2338)b;
boolean var8 = false;
Comparable var10000 = zf.v(var5).method_33571().method_1022(var7.method_46558());
var7 = (class_2338)ax;
Comparable var9 = var10000;
var8 = false;
return ComparisonsKt.compareValues(var9, zf.v(var5).method_33571().method_1022(var7.method_46558()));
}
}
