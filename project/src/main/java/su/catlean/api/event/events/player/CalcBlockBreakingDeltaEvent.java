package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class CalcBlockBreakingDeltaEvent extends Event {
@NotNull
public static final CalcBlockBreakingDeltaEvent INSTANCE = new CalcBlockBreakingDeltaEvent();
public static class_2338 blockPos;
public static class_2680 state;
private static float delta;

private CalcBlockBreakingDeltaEvent() {
}

@NotNull
public final class_2338 getBlockPos() {
if (blockPos != null) {
return blockPos;
} else {
Intrinsics.throwUninitializedPropertyAccessException("blockPos");
return null;
}
}

public final void setBlockPos(@NotNull class_2338 _v) {
Intrinsics.checkNotNullParameter(_v, "_v");
blockPos = _v;
}

@NotNull
public final class_2680 getState() {
if (state != null) {
return state;
} else {
Intrinsics.throwUninitializedPropertyAccessException("state");
return null;
}
}

public final void setState(@NotNull class_2680 _v) {
Intrinsics.checkNotNullParameter(_v, "_v");
state = _v;
}

public final float getDelta() {
return delta;
}

public final void setDelta(float _v) {
delta = _v;
}

public final boolean call(@NotNull class_2338 pos, @NotNull class_2680 state) {
Intrinsics.checkNotNullParameter(pos, "pos");
Intrinsics.checkNotNullParameter(state, "state");
this.setCancelled(false);
this.setBlockPos(pos);
INSTANCE.setState(state);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
