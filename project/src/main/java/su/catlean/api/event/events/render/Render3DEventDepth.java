package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class Render3DEventDepth extends Event {
@NotNull
public static final Render3DEventDepth INSTANCE = new Render3DEventDepth();
private static class_4587 stack;
private static Matrix4f projection;

private Render3DEventDepth() {
}

@NotNull
public final class_4587 getStack() {
if (stack != null) {
return stack;
} else {
Intrinsics.throwUninitializedPropertyAccessException("stack");
return null;
}
}

@NotNull
public final Matrix4f getProjection() {
if (projection != null) {
return projection;
} else {
Intrinsics.throwUninitializedPropertyAccessException("projection");
return null;
}
}

public final boolean call(@NotNull class_4587 stack, @NotNull Matrix4f projection) {
Intrinsics.checkNotNullParameter(stack, "stack");
Intrinsics.checkNotNullParameter(projection, "projection");
this.setCancelled(false);
Render3DEventDepth.stack = stack;
Render3DEventDepth.projection = projection;
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
