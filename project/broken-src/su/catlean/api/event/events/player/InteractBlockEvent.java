package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class InteractBlockEvent extends Event {
@NotNull
public static final InteractBlockEvent INSTANCE = new InteractBlockEvent();
public static class_1268 hand;
public static class_3965 hitResult;

private InteractBlockEvent() {
}

@NotNull
public final class_1268 getHand() {
if (hand != null) {
return hand;
} else {
Intrinsics.throwUninitializedPropertyAccessException("hand");
return null;
}
}

public final void setHand(@NotNull class_1268 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
hand = <set-?>;
}

@NotNull
public final class_3965 getHitResult() {
if (hitResult != null) {
return hitResult;
} else {
Intrinsics.throwUninitializedPropertyAccessException("hitResult");
return null;
}
}

public final void setHitResult(@NotNull class_3965 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
hitResult = <set-?>;
}

public final boolean call(@NotNull class_1268 hand, @NotNull class_3965 hitResult) {
Intrinsics.checkNotNullParameter(hand, "hand");
Intrinsics.checkNotNullParameter(hitResult, "hitResult");
this.setHand(hand);
this.setHitResult(hitResult);
this.setCancelled(false);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
