package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class fm implements Comparator {
@Override
public final int compare(Object a, Object b) {
a1 var3 = (a1)a;
boolean var4 = false;
Comparable var10000 = var3.Q().length();
var3 = (a1)b;
Comparable var5 = var10000;
var4 = false;
return ComparisonsKt.compareValues(var5, var3.Q().length());
}
}
