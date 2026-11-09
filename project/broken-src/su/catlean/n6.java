package su.catlean;

// $VF: synthetic class
public final class n6 {
public static final int[] w;
public static final int[] l;

static {
int[] var0 = new int[su.catlean.w.values().length];

try {
var0[su.catlean.w.BOX.ordinal()] = 1;
} catch (NoSuchFieldError var5) {
}

try {
var0[su.catlean.w.OUTLINE.ordinal()] = 2;
} catch (NoSuchFieldError var4) {
}

w = var0;
var0 = new int[gh.values().length];

try {
var0[gh.NONE.ordinal()] = 1;
} catch (NoSuchFieldError var3) {
}

try {
var0[gh.WHITE_LIST.ordinal()] = 2;
} catch (NoSuchFieldError var2) {
}

l = var0;
}
}
