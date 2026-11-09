package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class on implements Comparator {
private static final long a = yz.a(-8546052113798930415L, -6499725517617054273L, MethodHandles.lookup().lookupClass()).a(156785441641116L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 12279690019775L;
long var5 = var3 ^ 116219064517050L;
ds var7 = (ds)ax;
boolean var8 = false;
s7 var10001 = s7.r;
Intrinsics.checkNotNull(var7);
Comparable var10000 = s7.C(var5, var10001, var7);
var7 = (ds)b;
Comparable var9 = var10000;
var8 = false;
var10001 = s7.r;
Intrinsics.checkNotNull(var7);
return ComparisonsKt.compareValues(var9, s7.C(var5, var10001, var7));
}
}
