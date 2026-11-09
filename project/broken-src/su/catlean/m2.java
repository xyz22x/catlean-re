package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class m2 {
public static final int[] y;
private static String m;

static {
long var0 = yz.a(8489111107365677733L, -3521827521182079485L, MethodHandles.lookup().lookupClass()).a(274547483648350L) ^ 59612630181785L;
int[] var2 = new int[pv.values().length];
vm.a<"Å">(null, 7000012258261979677L, var0);

try {
var2[pv.Command.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var2[pv.Leave.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var2[pv.None.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

y = var2;
}

public static void o(String var0) {
m = var0;
}

public static String o() {
return m;
}
}
