package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4050;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class SetPoseEvent extends Event {
@NotNull
public static final SetPoseEvent INSTANCE = new SetPoseEvent();
@NotNull
private static class_4050 pose = class_4050.field_18076;

private SetPoseEvent() {
}

@NotNull
public final class_4050 getPose() {
return pose;
}

public final void setPose(@NotNull class_4050 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
pose = <set-?>;
}
}
