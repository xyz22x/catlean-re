package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class so {
public static final int[] U;
private static String[] z;

static {
long var0 = yz.a(7094525223541479720L, 2468025852360839364L, MethodHandles.lookup().lookupClass()).a(194185700975916L) ^ 140568423906957L;
int[] var2 = new int[ar.values().length];
vm.a<"Å">(null, -7992705173765562923L, var0);

try {
var2[ar.SMART.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var2[ar.CUSTOM.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var2[ar.OFF.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

U = var2;
}

public static void q(String[] var0) {
z = var0;
}

public static String[] D() {
return z;
}
}
