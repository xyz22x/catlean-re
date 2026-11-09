package su.catlean;

import java.lang.invoke.MethodHandles;

public final class j4 implements Runnable {
final int F;
final boolean M;
private static int[] k;
private static final long a = yz.a(7286528217325016279L, 1837187445394322979L, MethodHandles.lookup().lookupClass()).a(143681571296802L);

public j4(int var1, boolean var2) {
this.F = var1;
this.M = var2;
}

@Override
public final void run() {
long var1 = a ^ 18810421632951L;
long var3 = var1 ^ 107335372296440L;
long var5 = var1 ^ 25343639681938L;
Thread.sleep(this.F);
boolean var8 = false;
int[] var10000 = vm.a<"Å">(-5124163538228830354L, var1);
_5.E(rb.N(ux.X, _5.S(var5, _5.t), var3, this.M));
int[] var7 = var10000;

try {
if (var7 != null) {
vm.a<"Å">(new _g[1], -5127955807551048984L, var1);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -5148331001244362354L, var1);
}
}

public static void I(int[] var0) {
k = var0;
}

public static int[] r() {
return k;
}

static {
long var0 = a ^ 121789870549702L;
if (vm.a<"Å">(-3633789486420465121L, var0) != null) {
vm.a<"Å">(new int[1], -3671476817177705947L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
