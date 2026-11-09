package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class w6 implements Comparator {
private static int t;
private static final long a = yz.a(-8395517365974704207L, 6048797387394052316L, MethodHandles.lookup().lookupClass()).a(269779843598329L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 38367674170905L;
long var5 = var3 ^ 71163624465187L;
class_3965 var7 = (class_3965)ax;
boolean var8 = false;
Comparable var10000 = zf.v(var5).method_33571().method_1025(var7.method_17784());
var7 = (class_3965)b;
Comparable var9 = var10000;
var8 = false;
return ComparisonsKt.compareValues(var9, zf.v(var5).method_33571().method_1025(var7.method_17784()));
}

public static void g(int var0) {
t = var0;
}

public static int K() {
return t;
}

public static int c() {
int var0 = K();

try {
return var0 == 0 ? 6 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var0 = a ^ 31485649511408L;
if (vm.a<"Å">(-1395738571072188500L, var0) == 0) {
vm.a<"Å">(14, -1347383232212776940L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
