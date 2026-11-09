package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class SwingArmEvent extends Event {
@NotNull
public static final SwingArmEvent INSTANCE = new SwingArmEvent();
@NotNull
private static final ReadWriteProperty swingProgress$delegate = Delegates.INSTANCE.notNull();
public static class_4587 matrices;
@NotNull
private static final ReadWriteProperty armX$delegate = Delegates.INSTANCE.notNull();
public static class_1306 arm;

private SwingArmEvent() {
}

public final float getSwingProgress() {
return ((Number)swingProgress$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
}

public final void setSwingProgress(float <set-?>) {
swingProgress$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
}

@NotNull
public final class_4587 getMatrices() {
if (matrices != null) {
return matrices;
} else {
Intrinsics.throwUninitializedPropertyAccessException("matrices");
return null;
}
}

public final void setMatrices(@NotNull class_4587 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
matrices = <set-?>;
}

private final int getArmX() {
return ((Number)armX$delegate.getValue(this, $$delegatedProperties[1])).intValue();
}

private final void setArmX(int <set-?>) {
armX$delegate.setValue(this, $$delegatedProperties[1], <set-?>);
}

@NotNull
public final class_1306 getArm() {
if (arm != null) {
return arm;
} else {
Intrinsics.throwUninitializedPropertyAccessException("arm");
return null;
}
}

public final void setArm(@NotNull class_1306 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
arm = <set-?>;
}

public final boolean call(float swingProgress, @NotNull class_4587 matrices, int armX, @NotNull class_1306 arm) {
Intrinsics.checkNotNullParameter(matrices, "matrices");
Intrinsics.checkNotNullParameter(arm, "arm");
this.setCancelled(false);
this.setSwingProgress(swingProgress);
this.setMatrices(matrices);
this.setArm(arm);
this.setArmX(armX);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}

static {
KProperty[] var0 = new KProperty[]{
Reflection.mutableProperty1(new MutablePropertyReference1Impl(SwingArmEvent.class, "swingProgress", "getSwingProgress()F", 0)),
Reflection.mutableProperty1(new MutablePropertyReference1Impl(SwingArmEvent.class, "armX", "getArmX()I", 0))
};
$$delegatedProperties = var0;
}
}
