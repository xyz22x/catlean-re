package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class te implements Comparator {
final double[] F;
private static final long a = yz.a(5160970768762988838L, 1526931674224405926L, MethodHandles.lookup().lookupClass()).a(251757663716269L);

public te(double[] var1) {
this.F = var1;
}

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 55316339069706L;
long var5 = var3 ^ 80298344807022L;
class_2338 var8 = (class_2338)ax;
boolean var9 = false;
String var10000 = vm.a<"Å">(-6324563866371608753L, var3);
Comparable var10001 = var8.method_46558().method_1028(zf.v(var5).method_23317() + this.F[0], zf.v(var5).method_23318(), zf.v(var5).method_23321() + this.F[1]);
var8 = (class_2338)b;
Comparable var10 = var10001;
var9 = false;
String var7 = var10000;

try {
int var14 = ComparisonsKt.compareValues(
var10, var8.method_46558().method_1028(zf.v(var5).method_23317() + this.F[0], zf.v(var5).method_23318(), zf.v(var5).method_23321() + this.F[1])
);
if (var7 != null) {
vm.a<"Å">(new _g[3], -6330158424622194149L, var3);
}

return var14;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -6272813408038230894L, var3);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
