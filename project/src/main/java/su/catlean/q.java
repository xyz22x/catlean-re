package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2248;

public final class q implements Comparator {
@Override
public final int compare(Object a, Object b) {
class_2248 var3 = (class_2248)a;
boolean var4 = false;
Comparable var10000 = var3.method_9518().getString();
var3 = (class_2248)b;
Comparable var5 = var10000;
var4 = false;
return ComparisonsKt.compareValues(var5, var3.method_9518().getString());
}
}
