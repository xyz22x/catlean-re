package su.catlean;

// $VF: synthetic class
public final class z6 {
public static final int[] K;
public static final int[] h;

static {
int[] var0 = new int[p6.values().length];

try {
var0[p6.NCP.ordinal()] = 1;
} catch (NoSuchFieldError var7) {
}

try {
var0[p6.CUSTOM.ordinal()] = 2;
} catch (NoSuchFieldError var6) {
}

K = var0;
var0 = new int[wn.values().length];

try {
var0[wn.OLD.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var0[wn.NORMAL.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

try {
var0[wn.NEW.ordinal()] = 3;
} catch (NoSuchFieldError var3) {
}

try {
var0[wn.STRICT.ordinal()] = 4;
} catch (NoSuchFieldError var2) {
}

h = var0;
}
}
