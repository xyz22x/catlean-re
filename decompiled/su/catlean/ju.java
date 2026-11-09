package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class ju implements Comparator {
private static String[] O;
private static final long a = yz.a(-311697594900908806L, 3782620389181955327L, MethodHandles.lookup().lookupClass()).a(112880146224265L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 112811570113870L;
long var5 = var3 ^ 72532909072669L;
String[] var10000 = vm.a<"Å">(8326692040727751623L, var3);
class_2338 var8 = (class_2338)ax;
boolean var9 = false;
String[] var7 = var10000;
Comparable var14 = zf.v(var5).method_5707(var8.method_46558());
var8 = (class_2338)b;
Comparable var10 = var14;
var9 = false;

try {
int var15 = ComparisonsKt.compareValues(var10, zf.v(var5).method_5707(var8.method_46558()));
if (var7 != null) {
vm.a<"Å">(new _g[2], 8310771353928366440L, var3);
}

return var15;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 8287784416732403328L, var3);
}
}

public static void L(String[] var0) {
O = var0;
}

public static String[] N() {
return O;
}

static {
long var0 = a ^ 98936586862327L;
if (vm.a<"Å">(2321435363394664574L, var0) != null) {
vm.a<"Å">(new String[2], 2328699295853820695L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
