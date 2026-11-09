package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class xg implements Runnable {
final int D;
final _g w;
private static String x;
private static final long a = yz.a(-1457104587333393916L, 4982747470262936036L, MethodHandles.lookup().lookupClass()).a(208906287101498L);

public xg(int var1, _g var2) {
this.D = var1;
this.w = var2;
}

@Override
public final void run() {
long var1 = a ^ 38233901256423L;
long var3 = var1 ^ 73336865869649L;
String var10000 = vm.a<"Å">(-472388018478457629L, var1);
Thread.sleep(this.D);
String var5 = var10000;
boolean var6 = false;
Iterable var7 = fi.P();
boolean var8 = false;
Iterator var9 = var7.iterator();

label57:
while (true) {
boolean var21 = var9.hasNext();

label54:
while (var21) {
Object var10 = var9.next();
ry var11 = (ry)var10;
boolean var12 = false;
Iterable var13 = var11.E();
boolean var14 = false;
if (var5 == null) {
return;
}

for (Object var16 : var13) {
tw var17 = (tw)var16;
boolean var18 = false;

label64: {
try {
if (var5 == null) {
break label64;
}

var21 = Intrinsics.areEqual(var17.K(), this.w);
if (var5 == null) {
continue label54;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -432728126854946915L, var1);
}

try {
if (var21) {
var17.j(var3);
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -432728126854946915L, var1);
}
}

if (var5 == null) {
break;
}
}

if (var5 != null) {
continue label57;
}

return;
}

return;
}
}

public static void Y(String var0) {
x = var0;
}

public static String O() {
return x;
}

static {
long var0 = a ^ 86867186354807L;
if (vm.a<"Å">(-4764297825219274637L, var0) == null) {
vm.a<"Å">("SMzMUb", -4804463187916621635L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
