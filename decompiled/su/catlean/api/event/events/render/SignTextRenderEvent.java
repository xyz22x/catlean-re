package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class SignTextRenderEvent extends Event {
@NotNull
public static final SignTextRenderEvent INSTANCE = new SignTextRenderEvent();
private static class_2338 pos;

private SignTextRenderEvent() {
}

@NotNull
public final class_2338 getPos() {
if (pos != null) {
return pos;
} else {
Intrinsics.throwUninitializedPropertyAccessException("pos");
return null;
}
}

public final boolean call(@NotNull class_2338 pos) {
Intrinsics.checkNotNullParameter(pos, "pos");
this.setCancelled(false);
SignTextRenderEvent.pos = pos;
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
