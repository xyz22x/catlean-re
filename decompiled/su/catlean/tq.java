package su.catlean;

import java.lang.invoke.MethodHandles;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickFactorEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tq implements ym {
@NotNull
public static final tq I = new tq();
private static float x = 1.0F;
private static int[] Z;
private static final long a = yz.a(5900562588817714538L, 1933864321093250690L, MethodHandles.lookup().lookupClass()).a(258707700523382L);

private tq() {
}

public final float C() {
return x;
}

public final void h(float <set-?>) {
x = <set-?>;
}

public final void x(float t) {
x = t;
}

@Flow(
priority = 20
)
private final void G(PlayerUpdateEvent var1) {
this.x(1.0F);
}

@Flow
private final void P(TickFactorEvent var1) {
long var2 = a ^ 67935419293951L;
String var4 = vm.a<"Å">(-7899775687742140041L, var2);

int var10000;
label26: {
label25: {
try {
float var6;
var10000 = (var6 = x - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
if (var4 == null) {
break label26;
}

if (!var10000) {
break label25;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -7842505503459493723L, var2);
}

var10000 = 0;
break label26;
}

var10000 = 1;
}

if (!var10000) {
var1.setFactor(x);
var1.cancel();
}
}

static {
long var0 = a ^ 132243420625537L;
int[] var10000 = new int[5];
vm.a<"Å">(var10000, 5282891642635682769L, var0);
}

public static void t(int[] var0) {
Z = var0;
}

public static int[] b() {
return Z;
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
