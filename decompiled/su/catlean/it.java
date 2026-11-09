package su.catlean;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_1304;
import net.minecraft.class_1322.class_1323;

// $VF: synthetic class
public final class it {
public static final int[] C;
public static final int[] l;
private static int[] t;

static {
long var0 = yz.a(-5274999213636242509L, -1873037450010107066L, MethodHandles.lookup().lookupClass()).a(205484714076169L) ^ 22775655167498L;
int[] var2 = new int[class_1304.values().length];
vm.a<"Å">(null, 5620884583187413771L, var0);

try {
var2[class_1304.field_6169.ordinal()] = 1;
} catch (NoSuchFieldError var10) {
}

try {
var2[class_1304.field_48824.ordinal()] = 2;
} catch (NoSuchFieldError var9) {
}

try {
var2[class_1304.field_6172.ordinal()] = 3;
} catch (NoSuchFieldError var8) {
}

try {
var2[class_1304.field_6166.ordinal()] = 4;
} catch (NoSuchFieldError var7) {
}

C = var2;
var2 = new int[class_1323.values().length];

try {
var2[class_1323.field_6328.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var2[class_1323.field_6330.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var2[class_1323.field_6331.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

l = var2;
}

public static void I(int[] var0) {
t = var0;
}

public static int[] U() {
return t;
}
}
