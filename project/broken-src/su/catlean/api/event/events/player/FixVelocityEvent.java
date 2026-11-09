package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FixVelocityEvent extends Event {
@NotNull
public static final FixVelocityEvent INSTANCE = new FixVelocityEvent();
@NotNull
private static class_243 movementInput = new class_243(0.0, 0.0, 0.0);
private static float speed;
private static float yaw;
@NotNull
private static class_243 velocity = new class_243(0.0, 0.0, 0.0);

private FixVelocityEvent() {
}

@NotNull
public final class_243 getMovementInput() {
return movementInput;
}

public final void setMovementInput(@NotNull class_243 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
movementInput = <set-?>;
}

public final float getSpeed() {
return speed;
}

public final void setSpeed(float <set-?>) {
speed = <set-?>;
}

public final float getYaw() {
return yaw;
}

public final void setYaw(float <set-?>) {
yaw = <set-?>;
}

@NotNull
public final class_243 getVelocity() {
return velocity;
}

public final void setVelocity(@NotNull class_243 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
velocity = <set-?>;
}

public final boolean call(@NotNull class_243 movementInput, float speed, float yaw) {
Intrinsics.checkNotNullParameter(movementInput, "movementInput");
this.setCancelled(false);
FixVelocityEvent.movementInput = movementInput;
FixVelocityEvent.speed = speed;
FixVelocityEvent.yaw = yaw;
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
