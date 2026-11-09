package su.catlean;

import java.lang.invoke.MethodHandles;

public final class m9 extends Thread {
private static boolean O;
private static final long a = yz.a(451139238856524211L, -3838081566582568328L, MethodHandles.lookup().lookupClass()).a(6182769701399L);

@Override
public void run() {
long var1 = a ^ 103999022855761L;
long var3 = var1 ^ 121598259981976L;
long var5 = var1 ^ 34935375162106L;
boolean var10000 = vm.a<"Å">(-7049084273088424021L, var1);
yl.g.q(var3);
boolean var7 = var10000;

try {
os.D.s(var5);
super.run();
if (!var7) {
vm.a<"Å">(new _g[5], -7045891301473479670L, var1);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -7010032527601815334L, var1);
}
}

public static void F(boolean var0) {
O = var0;
}

public static boolean G() {
return O;
}

public static boolean q() {
boolean var0 = G();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var0 = a ^ 105519581765941L;
if (!vm.a<"Å">(-3942727348823670577L, var0)) {
vm.a<"Å">(true, -3893814835103631333L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
