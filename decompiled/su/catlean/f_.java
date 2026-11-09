package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;

public final class f_ implements Runnable {
final int i;
private static final long a = yz.a(-2108138520625534466L, 4052978590936760661L, MethodHandles.lookup().lookupClass()).a(182986827396611L);

public f_(int $delay) {
this.i = $delay;
}

@Override
public final void run() {
long var1 = a ^ 26435369947813L;
long var3 = var1 ^ 23853214097953L;
long var5 = var1 ^ 6936458700984L;
long var7 = var1 ^ 6936458700984L;
Thread.sleep(this.i);
boolean var10 = false;
yl.g.q(var3);
File[] var11 = mj.l();
boolean var12 = false;
int var13 = 0;
_g[] var10000 = vm.a<"Å">(-7863723769970437098L, var1);
int var14 = var11.length;
_g[] var9 = var10000;

while (true) {
if (var13 < var14) {
File var15 = var11[var13];
File var16 = var15;
boolean var17 = false;

try {
var16.mkdirs();
var13++;
if (var9 == null) {
break;
}

if (var9 != null) {
continue;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -7901222470498213064L, var1);
}
}

yl.g.l().w(var7);
yl.g.d().w(var5);
ir.r.D();
break;
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
