package su.catlean.api.event.events.render;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class CrystalYOffsetEvent extends Event {
@NotNull
public static final CrystalYOffsetEvent INSTANCE = new CrystalYOffsetEvent();
private static float offset;
@NotNull
private static final ReadWriteProperty age$delegate = Delegates.INSTANCE.notNull();

private CrystalYOffsetEvent() {
}

public final float getOffset() {
return offset;
}

public final void setOffset(float <set-?>) {
offset = <set-?>;
}

public final float getAge() {
return ((Number)age$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
}

public final void setAge(float <set-?>) {
age$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
}

public final boolean call(float age) {
this.setAge(age);
this.setCancelled(false);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}

static {
KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(CrystalYOffsetEvent.class, "age", "getAge()F", 0))};
$$delegatedProperties = var0;
}
}
