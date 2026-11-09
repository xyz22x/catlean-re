package su.catlean;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_2350;

// $VF: synthetic class
public final class mg {
public static final int[] F;
private static boolean L;

static {
long var0 = yz.a(3184539057178708915L, 7545630833672240559L, MethodHandles.lookup().lookupClass()).a(78132414378253L) ^ 91594282834130L;
int[] var2 = new int[class_2350.values().length];
vm.a<"Å">(true, 1428327288083525750L, var0);

try {
var2[class_2350.field_11034.ordinal()] = 1;
} catch (NoSuchFieldError var7) {
}

try {
var2[class_2350.field_11043.ordinal()] = 2;
} catch (NoSuchFieldError var6) {
}

try {
var2[class_2350.field_11035.ordinal()] = 3;
} catch (NoSuchFieldError var5) {
}

try {
var2[class_2350.field_11039.ordinal()] = 4;
} catch (NoSuchFieldError var4) {
}

F = var2;
}

public static void f(boolean var0) {
L = var0;
}

public static boolean I() {
return L;
}

public static boolean m() {
boolean var0 = I();

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
