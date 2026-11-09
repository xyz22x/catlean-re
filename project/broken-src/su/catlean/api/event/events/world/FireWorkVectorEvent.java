package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FireWorkVectorEvent extends Event {
@NotNull
public static final FireWorkVectorEvent INSTANCE = new FireWorkVectorEvent();
public static class_243 vector;

private FireWorkVectorEvent() {
}

@NotNull
public final class_243 getVector() {
if (vector != null) {
return vector;
} else {
Intrinsics.throwUninitializedPropertyAccessException("vector");
return null;
}
}

public final void setVector(@NotNull class_243 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
vector = <set-?>;
}

public final boolean call(@NotNull class_243 vec) {
Intrinsics.checkNotNullParameter(vec, "vec");
this.setVector(vec);
this.setCancelled(false);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
