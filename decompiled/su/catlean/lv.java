package su.catlean;

import java.lang.invoke.MethodHandles;

public final class lv implements Runnable {
final int g;
private static String r;
private static final long a = yz.a(1552214561807891309L, 4600427558378185114L, MethodHandles.lookup().lookupClass()).a(174544275208148L);

public lv(int $delay) {
this.g = $delay;
}

@Override
public final void run() {
long var1 = a ^ 112290697253278L;
long var3 = var1 ^ 2671112020613L;
Thread.sleep(this.g);
String var10000 = vm.a<"Å">(7125193071416075819L, var1);
boolean var6 = false;
e3.j.r(var3);
String var5 = var10000;

try {
if (var5 != null) {
vm.a<"Å">(new _g[4], 7084066922205177970L, var1);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 7096743894267456098L, var1);
}
}

public static void X(String var0) {
r = var0;
}

public static String P() {
return r;
}

static {
long var0 = a ^ 49278283054391L;
if (vm.a<"Å">(1029230471676234370L, var0) != null) {
vm.a<"Å">("JKG3G", 1058994448930089210L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
