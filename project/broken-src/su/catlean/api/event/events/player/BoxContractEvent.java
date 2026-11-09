package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class BoxContractEvent extends Event {
@NotNull
public static final BoxContractEvent INSTANCE = new BoxContractEvent();
public static class_238 value;

private BoxContractEvent() {
}

@NotNull
public final class_238 getValue() {
if (value != null) {
return value;
} else {
Intrinsics.throwUninitializedPropertyAccessException("value");
return null;
}
}

public final void setValue(@NotNull class_238 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
value = <set-?>;
}
}
