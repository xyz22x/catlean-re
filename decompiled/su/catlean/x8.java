package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class x8 {
public static final int[] v;
public static final int[] a;
private static _g[] S;

static {
long var0 = yz.a(7985256281696422549L, -2604575219532910221L, MethodHandles.lookup().lookupClass()).a(35608222560684L) ^ 3578463180061L;
int[] var2 = new int[w4.values().length];
vm.a<"Å">(null, 6687404575770027715L, var0);

try {
var2[w4.OFF.ordinal()] = 1;
} catch (NoSuchFieldError var11) {
}

try {
var2[w4.CRYSTAL.ordinal()] = 2;
} catch (NoSuchFieldError var10) {
}

try {
var2[w4.GAPPLE.ordinal()] = 3;
} catch (NoSuchFieldError var9) {
}

v = var2;
var2 = new int[b0.values().length];

try {
var2[b0.BALL_SHIELD.ordinal()] = 1;
} catch (NoSuchFieldError var8) {
}

try {
var2[b0.GAPPLE_BALL.ordinal()] = 2;
} catch (NoSuchFieldError var7) {
}

try {
var2[b0.GAPPLE_SHIELD.ordinal()] = 3;
} catch (NoSuchFieldError var6) {
}

try {
var2[b0.BALL_TOTEM.ordinal()] = 4;
} catch (NoSuchFieldError var5) {
}

try {
var2[b0.TOTEM_TOTEM.ordinal()] = 5;
} catch (NoSuchFieldError var4) {
}

a = var2;
}

public static void K(_g[] var0) {
S = var0;
}

public static _g[] B() {
return S;
}
}
