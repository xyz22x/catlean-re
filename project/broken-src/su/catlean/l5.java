package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

final class l5 {
private float h;
private float b;
private static final long a = yz.a(2360773594629889511L, 2992802427112181265L, MethodHandles.lookup().lookupClass()).a(86650162089207L);

public l5(float value, float velocity) {
this.h = value;
this.b = velocity;
}

public l5(float var1, float var2, long var3, int var5, DefaultConstructorMarker var6) {
var3 = a ^ var3;
if ((var5 & 1) != 0) {
var1 = 0.0F;
}

if ((var5 & 2) != 0) {
var2 = 0.0F;
}

this(var1, var2);
}

public final float P() {
return this.h;
}

public final void j(float <set-?>) {
this.h = <set-?>;
}

public final float B() {
return this.b;
}

public final void m(float <set-?>) {
this.b = <set-?>;
}

public final float G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 127353899713418L;
int var5 = (int)((var1 ^ 104695479796942L) >>> 32);
long var6 = (var1 ^ 104695479796942L) << 32 >>> 32;
this.b = mf.D(var3, -0.1F, 0.1F, false, 4, null);
this.h = this.h + this.b;
this.h = tp.nc.L(this.h, RangesKt.rangeTo(-1.0F, 1.0F), var5, var6);
return this.h;
}

public l5(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 43998291916538L;
this(0.0F, 0.0F, var3, 3, null);
}
}
