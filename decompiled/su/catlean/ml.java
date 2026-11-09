package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class ml {
public static final int[] L;
private static _g[] c;

static {
long var0 = yz.a(-5232878641821488569L, 4003668326182994273L, MethodHandles.lookup().lookupClass()).a(148165987628268L) ^ 29385291322856L;
_g[] var10000 = new _g[4];
int[] var2 = new int[ta.values().length];
vm.a<"Å">(var10000, 702317868093189318L, var0);

try {
var2[ta.NONE.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var2[ta.WHITE_LIST.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

L = var2;
}

public static void S(_g[] var0) {
c = var0;
}

public static _g[] z() {
return c;
}
}
