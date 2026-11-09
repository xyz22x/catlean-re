package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.List;

public final class t2 implements Runnable {
final int K;
private static final long a = yz.a(3677195933568187457L, 8375471263312503100L, MethodHandles.lookup().lookupClass()).a(202130605757384L);

public t2(int $delay) {
this.K = $delay;
}

@Override
public final void run() {
long var1 = a ^ 28574787861413L;
long var3 = var1 ^ 14799253892798L;
Thread.sleep(this.K);
boolean var6 = false;
List var7 = rq.G.r(var3);
rq.Z().clear();
rq.Z().addAll(var7);
int[] var5 = vm.a<"Å">(-1739567320077592299L, var1);

try {
if (vm.a<"Å">(-1769098512524903965L, var1) != null) {
vm.a<"Å">(new int[4], -1773439646189639426L, var1);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -1814935287590928650L, var1);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
