package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_1297;
import net.minecraft.class_742;

public final class n2 implements Comparator {
private static final long a = yz.a(-8398062320906324946L, 4923199049222960135L, MethodHandles.lookup().lookupClass()).a(52478358323778L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 96618736135604L;
long var5 = var3 ^ 72641914058855L;
class_742 var7 = (class_742)ax;
boolean var8 = false;
Comparable var10000 = zf.v(var5).method_5739((class_1297)var7);
var7 = (class_742)b;
Comparable var9 = var10000;
var8 = false;
return ComparisonsKt.compareValues(var9, zf.v(var5).method_5739((class_1297)var7));
}
}
