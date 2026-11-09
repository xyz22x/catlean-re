package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class si implements Comparator {
private static String[] m;
private static final long a = yz.a(-9081064515331713736L, 4874658618522533266L, MethodHandles.lookup().lookupClass()).a(88765670507335L);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 40369609254585L;
long var5 = var3 ^ 101269883299698L;
class_3965 var8 = (class_3965)ax;
String[] var10000 = vm.a<"Å">(8445004208019715126L, var3);
boolean var9 = false;
Comparable var10001 = zf.v(var5).method_33571().method_1025(var8.method_17784());
var8 = (class_3965)b;
Comparable var10 = var10001;
var9 = false;
String[] var7 = var10000;

try {
int var14 = ComparisonsKt.compareValues(var10, zf.v(var5).method_33571().method_1025(var8.method_17784()));
if (var7 != null) {
vm.a<"Å">(new _g[4], 8447300921775914759L, var3);
}

return var14;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 8481706461810153187L, var3);
}
}

public static void C(String[] var0) {
m = var0;
}

public static String[] P() {
return m;
}

static {
long var0 = a ^ 110299023414125L;
if (vm.a<"Å">(4676687440215638498L, var0) != null) {
vm.a<"Å">(new String[1], 4614157110609072144L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
