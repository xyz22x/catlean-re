package su.catlean;

import java.lang.invoke.MethodHandles;

public final class w5 implements Runnable {
final int h;
private static String[] l;
private static final long a = yz.a(5471893296269150731L, -8535250809707412076L, MethodHandles.lookup().lookupClass()).a(246538749756351L);

public w5(int $delay) {
this.h = $delay;
}

@Override
public final void run() {
long var1 = a ^ 51173781562753L;
long var3 = var1 ^ 2398822985505L;
Thread.sleep(this.h);
boolean var6 = false;
String[] var10000 = vm.a<"Å">(3706456673738855756L, var1);
zf.F(var3).method_40000(x.T);
String[] var5 = var10000;

try {
if (var5 == null) {
vm.a<"Å">(new _g[3], 3697360733779540338L, var1);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 3703846266749565677L, var1);
}
}

public static void E(String[] var0) {
l = var0;
}

public static String[] I() {
return l;
}

static {
long var0 = a ^ 46117245156032L;
if (vm.a<"Å">(-6039610987634161139L, var0) == null) {
vm.a<"Å">(new String[5], -5986922579806539396L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
