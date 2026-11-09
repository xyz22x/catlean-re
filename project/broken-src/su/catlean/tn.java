package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class tn {
public static final int[] t;
private static boolean T;

static {
long var0 = yz.a(-3957160002670670851L, -3286444797927844794L, MethodHandles.lookup().lookupClass()).a(13055167878322L) ^ 140213059710862L;
int[] var2 = new int[lw.values().length];
vm.a<"Å">(true, 3238675305508099914L, var0);

try {
var2[lw.GLOBAL.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var2[lw.LOCAL.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var2[lw.WHISPERS.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

t = var2;
}

public static void O(boolean var0) {
T = var0;
}

public static boolean v() {
return T;
}

public static boolean n() {
boolean var0 = v();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
