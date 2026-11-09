package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class rv {
public static final int[] u;
private static boolean n;

static {
long var0 = yz.a(9011180962554359920L, 6156531790283830354L, MethodHandles.lookup().lookupClass()).a(88503043084977L) ^ 46913168465745L;
int[] var2 = new int[xn.values().length];
vm.a<"Å">(true, 6911923896606059493L, var0);

try {
var2[xn.FLAT.ordinal()] = 1;
} catch (NoSuchFieldError var7) {
}

try {
var2[xn.BOX.ordinal()] = 2;
} catch (NoSuchFieldError var6) {
}

try {
var2[xn.WIRE_FRAME.ordinal()] = 3;
} catch (NoSuchFieldError var5) {
}

try {
var2[xn.CROSS.ordinal()] = 4;
} catch (NoSuchFieldError var4) {
}

u = var2;
}

public static void K(boolean var0) {
n = var0;
}

public static boolean Q() {
return n;
}

public static boolean x() {
boolean var0 = Q();

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
