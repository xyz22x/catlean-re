package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class ll implements Comparator {
@Override
public final int compare(Object a, Object b) {
Enum var3 = (Enum)a;
boolean var4 = false;
Comparable var10000 = var3.name().length();
var3 = (Enum)b;
Comparable var5 = var10000;
var4 = false;
return ComparisonsKt.compareValues(var5, var3.name().length());
}
}
