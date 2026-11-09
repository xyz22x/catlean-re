package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class g5 {
public static final int[] o;
private static String[] N;

static {
long var0 = yz.a(8225791897810224488L, 3182479557769148131L, MethodHandles.lookup().lookupClass()).a(155962638002754L) ^ 32990988215643L;
int[] var2 = new int[ne.values().length];
vm.a<"Å">(null, -5047445844435204881L, var0);

try {
var2[ne.GHOST.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var2[ne.DEFAULT.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

o = var2;
}

public static void E(String[] var0) {
N = var0;
}

public static String[] l() {
return N;
}
}
