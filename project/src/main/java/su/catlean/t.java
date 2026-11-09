package su.catlean;

// $VF: synthetic class
public final class t {
public static final int[] K;

static {
int[] var0 = new int[rw.values().length];

try {
var0[rw.MIRROR.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var0[rw.DEFAULT.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var0[rw.BLOOM.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

try {
var0[rw.DOUBLE.ordinal()] = 4;
} catch (NoSuchFieldError var3) {
}

try {
var0[rw.CAMOUFLAGE.ordinal()] = 5;
} catch (NoSuchFieldError var2) {
}

K = var0;
}
}
