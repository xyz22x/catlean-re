package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class m4 {
public static final int[] A;
private static String[] m;

static {
long var0 = yz.a(-8294004098769026650L, -6821158249576863314L, MethodHandles.lookup().lookupClass()).a(226051231569457L) ^ 108101547290346L;
int[] var2 = new int[ak.values().length];
vm.a<"Å">(null, 5477317425195937561L, var0);

try {
var2[ak.GLOBAL.ordinal()] = 1;
} catch (NoSuchFieldError var7) {
}

try {
var2[ak.LOCAL.ordinal()] = 2;
} catch (NoSuchFieldError var6) {
}

try {
var2[ak.WHISPERS.ordinal()] = 3;
} catch (NoSuchFieldError var5) {
}

try {
var2[ak.SILENT.ordinal()] = 4;
} catch (NoSuchFieldError var4) {
}

A = var2;
}

public static void O(String[] var0) {
m = var0;
}

public static String[] P() {
return m;
}
}
