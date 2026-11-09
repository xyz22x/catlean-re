package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class by implements Comparator {
@Override
public final int compare(Object a, Object b) {
String var3 = (String)a;
boolean var4 = false;
Comparable var10000 = var3;
var3 = (String)b;
Comparable var5 = var10000;
var4 = false;
return ComparisonsKt.compareValues(var5, var3);
}
}
