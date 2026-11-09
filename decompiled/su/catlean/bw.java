package su.catlean;

// $VF: synthetic class
public final class bw {
public static final int[] i;

static {
int[] var0 = new int[nc.values().length];

try {
var0[nc.Block.ordinal()] = 1;
} catch (NoSuchFieldError var4) {
}

try {
var0[nc.Grow.ordinal()] = 2;
} catch (NoSuchFieldError var3) {
}

try {
var0[nc.Shrink.ordinal()] = 3;
} catch (NoSuchFieldError var2) {
}

i = var0;
}
}
