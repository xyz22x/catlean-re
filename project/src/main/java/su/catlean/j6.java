package su.catlean;

// $VF: synthetic class
public final class j6 {
public static final int[] k;

static {
int[] var0 = new int[px.values().length];

try {
var0[px.SERVER.ordinal()] = 1;
} catch (NoSuchFieldError var4) {
}

try {
var0[px.CLIENT.ordinal()] = 2;
} catch (NoSuchFieldError var3) {
}

try {
var0[px.PREDICT.ordinal()] = 3;
} catch (NoSuchFieldError var2) {
}

k = var0;
}
}
