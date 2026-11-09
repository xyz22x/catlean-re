package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_243;

public final class da implements Comparator {
final class_243 n;

public da(class_243 var1) {
this.n = var1;
}

@Override
public final int compare(Object a, Object b) {
class_243 var3 = (class_243)a;
boolean var4 = false;
Comparable var10000 = this.n.method_1022(var3);
var3 = (class_243)b;
Comparable var5 = var10000;
var4 = false;
return ComparisonsKt.compareValues(var5, this.n.method_1022(var3));
}
}
