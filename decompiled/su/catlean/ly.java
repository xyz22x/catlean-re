package su.catlean;

// $VF: synthetic class
public final class ly {
public static final int[] K;

static {
int[] var0 = new int[tz.values().length];

try {
var0[tz.CUSTOM.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var0[tz.SYNC.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var0[tz.SKY.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

try {
var0[tz.LIGHT_RGB.ordinal()] = 4;
} catch (NoSuchFieldError var3) {
}

try {
var0[tz.RGB.ordinal()] = 5;
} catch (NoSuchFieldError var2) {
}

K = var0;
}
}
