package su.catlean;

import net.minecraft.class_1934;

// $VF: synthetic class
public final class z8 {
public static final int[] s;
public static final int[] R;
public static final int[] m;

static {
int[] var0 = new int[al.values().length];

try {
var0[al.FULL.ordinal()] = 1;
} catch (NoSuchFieldError var10) {
}

try {
var0[al.SEMI.ordinal()] = 2;
} catch (NoSuchFieldError var9) {
}

try {
var0[al.DEFAULT.ordinal()] = 3;
} catch (NoSuchFieldError var8) {
}

s = var0;
var0 = new int[class_1934.values().length];

try {
var0[class_1934.field_9215.ordinal()] = 1;
} catch (NoSuchFieldError var7) {
}

try {
var0[class_1934.field_9220.ordinal()] = 2;
} catch (NoSuchFieldError var6) {
}

try {
var0[class_1934.field_9219.ordinal()] = 3;
} catch (NoSuchFieldError var5) {
}

try {
var0[class_1934.field_9216.ordinal()] = 4;
} catch (NoSuchFieldError var4) {
}

R = var0;
var0 = new int[_j.values().length];

try {
var0[_j.ScoreBoard.ordinal()] = 1;
} catch (NoSuchFieldError var3) {
}

try {
var0[_j.PlayerList.ordinal()] = 2;
} catch (NoSuchFieldError var2) {
}

m = var0;
}
}
