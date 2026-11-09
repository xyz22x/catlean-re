package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1735;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class SlotRenderEvent extends Event {
@NotNull
public static final SlotRenderEvent INSTANCE = new SlotRenderEvent();
public static class_332 context;
public static class_1735 slot;

private SlotRenderEvent() {
}

@NotNull
public final class_332 getContext() {
if (context != null) {
return context;
} else {
Intrinsics.throwUninitializedPropertyAccessException("context");
return null;
}
}

public final void setContext(@NotNull class_332 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
context = <set-?>;
}

@NotNull
public final class_1735 getSlot() {
if (slot != null) {
return slot;
} else {
Intrinsics.throwUninitializedPropertyAccessException("slot");
return null;
}
}

public final void setSlot(@NotNull class_1735 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
slot = <set-?>;
}
}
