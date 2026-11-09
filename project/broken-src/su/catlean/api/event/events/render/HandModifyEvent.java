package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class HandModifyEvent extends Event {
@NotNull
public static final HandModifyEvent INSTANCE = new HandModifyEvent();
@NotNull
private static class_1268 hand = class_1268.field_5808;
@NotNull
private static class_4587 stack = new class_4587();
@NotNull
private static class_1799 item;
private static boolean eating;

private HandModifyEvent() {
}

@NotNull
public final class_1268 getHand() {
return hand;
}

public final void setHand(@NotNull class_1268 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
hand = <set-?>;
}

@NotNull
public final class_4587 getStack() {
return stack;
}

public final void setStack(@NotNull class_4587 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
stack = <set-?>;
}

@NotNull
public final class_1799 getItem() {
return item;
}

public final void setItem(@NotNull class_1799 <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
item = <set-?>;
}

public final boolean getEating() {
return eating;
}

public final void setEating(boolean <set-?>) {
eating = <set-?>;
}

public final boolean call(@NotNull class_1268 hand, @NotNull class_4587 stack, @NotNull class_1799 item, boolean eating) {
Intrinsics.checkNotNullParameter(hand, "hand");
Intrinsics.checkNotNullParameter(stack, "stack");
Intrinsics.checkNotNullParameter(item, "item");
this.setCancelled(false);
HandModifyEvent.stack = stack;
HandModifyEvent.hand = hand;
HandModifyEvent.item = item;
HandModifyEvent.eating = eating;
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}

static {
class_1799 var10000 = class_1802.field_8162.method_7854();
Intrinsics.checkNotNullExpressionValue(var10000, "getDefaultInstance(...)");
item = var10000;
}
}
