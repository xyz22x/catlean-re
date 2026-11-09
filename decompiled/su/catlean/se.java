package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class se {
public static final int[] O;
private static String[] W;

static {
long var0 = yz.a(2051992107460895125L, -5479819645875781613L, MethodHandles.lookup().lookupClass()).a(28055980419419L) ^ 54381099156216L;
String[] var10000 = new String[4];
int[] var2 = new int[w0.values().length];
vm.a<"Å">(var10000, 5930243009857504690L, var0);

try {
var2[w0.BREACH.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var2[w0.DENSITY.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

O = var2;
}

public static void z(String[] var0) {
W = var0;
}

public static String[] m() {
return W;
}
}
