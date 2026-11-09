package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class ij {
public static final int[] a;
private static int[] W;

static {
long var0 = yz.a(4177637233814730235L, -8839912655941682496L, MethodHandles.lookup().lookupClass()).a(16335986938190L) ^ 7246113452827L;
int[] var2 = new int[c4.values().length];
vm.a<"Å">(null, -5013277013829771549L, var0);

try {
var2[c4.DEFAULT.ordinal()] = 1;
} catch (NoSuchFieldError var8) {
}

try {
var2[c4.GROW.ordinal()] = 2;
} catch (NoSuchFieldError var7) {
}

try {
var2[c4.SHRINK.ordinal()] = 3;
} catch (NoSuchFieldError var6) {
}

try {
var2[c4.FILL.ordinal()] = 4;
} catch (NoSuchFieldError var5) {
}

try {
var2[c4.EMPTY.ordinal()] = 5;
} catch (NoSuchFieldError var4) {
}

a = var2;
}

public static void x(int[] var0) {
W = var0;
}

public static int[] E() {
return W;
}
}
