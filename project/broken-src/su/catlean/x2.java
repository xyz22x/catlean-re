package su.catlean;

import java.lang.invoke.MethodHandles;

// $VF: synthetic class
public final class x2 {
public static final int[] N;
public static final int[] V;
private static int[] W;

static {
long var0 = yz.a(-5754272858510067567L, 7660310438428181429L, MethodHandles.lookup().lookupClass()).a(62896063864868L) ^ 13098108270956L;
int[] var10000 = new int[2];
int[] var2 = new int[fb.values().length];
vm.a<"Å">(var10000, -8750728167761357216L, var0);

try {
var2[fb.SEQUENTIAL.ordinal()] = 1;
} catch (NoSuchFieldError var9) {
}

try {
var2[fb.VANILLA.ordinal()] = 2;
} catch (NoSuchFieldError var8) {
}

try {
var2[fb.GRIM.ordinal()] = 3;
} catch (NoSuchFieldError var7) {
}

N = var2;
var2 = new int[mq.values().length];

try {
var2[mq.Inventory.ordinal()] = 1;
} catch (NoSuchFieldError var6) {
}

try {
var2[mq.Normal.ordinal()] = 2;
} catch (NoSuchFieldError var5) {
}

try {
var2[mq.Silent.ordinal()] = 3;
} catch (NoSuchFieldError var4) {
}

V = var2;
}

public static void o(int[] var0) {
W = var0;
}

public static int[] U() {
return W;
}
}
