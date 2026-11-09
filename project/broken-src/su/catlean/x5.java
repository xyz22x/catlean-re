package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class x5 {
public static final int[] p;
private static boolean B;

static {
long var0 = yz.a(-8748202399386563053L, 3396528333513052542L, MethodHandles.lookup().lookupClass()).a(15596453794262L) ^ 53890766856175L;
int[] var2 = new int[be.values().length];
vm.a<"Å">(true, 2847341247724774947L, var0);

try {
var2[be.Vanilla.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var2[be.GRIM_GLIDE.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

p = var2;
}

public static void Y(boolean var0) {
B = var0;
}

public static boolean J() {
return B;
}

public static boolean t() {
boolean var0 = J();

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
