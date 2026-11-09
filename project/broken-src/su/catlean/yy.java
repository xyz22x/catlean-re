package su.catlean;

import java.lang.invoke.MethodHandles;

public final class yy implements Runnable {
final int n;
private static final long a = yz.a(3670996963746500995L, 5886809280182922498L, MethodHandles.lookup().lookupClass()).a(18885287829215L);

public yy(int $delay) {
this.n = $delay;
}

@Override
public final void run() {
long var1 = a ^ 68944781373424L;
long var3 = var1 ^ 90262946084212L;
Thread.sleep(this.n);
vm.a<"Å">(-6252497612302250215L, var1);
boolean var6 = false;

try {
zf.F(var3).method_40000(mc.J);
if (vm.a<"Å">(-6238365652055377923L, var1) != null) {
vm.a<"Å">(new String[1], -6197380934390008728L, var1);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -6226033348057529200L, var1);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
