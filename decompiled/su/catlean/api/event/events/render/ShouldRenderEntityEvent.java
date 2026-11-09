package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class ShouldRenderEntityEvent extends Event {
@NotNull
public static final ShouldRenderEntityEvent INSTANCE = new ShouldRenderEntityEvent();
public static class_1297 entity;

private ShouldRenderEntityEvent() {
}

@NotNull
public final class_1297 getEntity() {
if (entity != null) {
return entity;
} else {
Intrinsics.throwUninitializedPropertyAccessException("entity");
return null;
}
}

public final void setEntity(@NotNull class_1297 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
entity = <set-?>;
}

public final boolean call(@NotNull class_1297 entity) {
Intrinsics.checkNotNullParameter(entity, "entity");
this.setCancelled(false);
this.setEntity(entity);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
