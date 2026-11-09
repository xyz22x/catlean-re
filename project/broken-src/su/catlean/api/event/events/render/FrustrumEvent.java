package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4604;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class FrustrumEvent extends Event {
@NotNull
public static final FrustrumEvent INSTANCE = new FrustrumEvent();
public static class_4604 frustrum;

private FrustrumEvent() {
}

@NotNull
public final class_4604 getFrustrum() {
if (frustrum != null) {
return frustrum;
} else {
Intrinsics.throwUninitializedPropertyAccessException("frustrum");
return null;
}
}

public final void setFrustrum(@NotNull class_4604 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
frustrum = <set-?>;
}
}
