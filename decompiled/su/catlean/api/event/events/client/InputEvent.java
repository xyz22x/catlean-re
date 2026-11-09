package su.catlean.api.event.events.client;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class InputEvent extends Event {
@NotNull
public static final InputEvent INSTANCE = new InputEvent();
public static InputEvent.Action action;
public static InputEvent.Device device;
private static int key = -1;

private InputEvent() {
}

@NotNull
public final InputEvent.Action getAction() {
if (action != null) {
return action;
} else {
Intrinsics.throwUninitializedPropertyAccessException("action");
return null;
}
}

public final void setAction(@NotNull InputEvent.Action <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
action = <set-?>;
}

@NotNull
public final InputEvent.Device getDevice() {
if (device != null) {
return device;
} else {
Intrinsics.throwUninitializedPropertyAccessException("device");
return null;
}
}

public final void setDevice(@NotNull InputEvent.Device <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
device = <set-?>;
}

public final int getKey() {
return key;
}

public final void setKey(int <set-?>) {
key = <set-?>;
}

public final boolean call(int key, @NotNull InputEvent.Device device, @NotNull InputEvent.Action action) {
Intrinsics.checkNotNullParameter(device, "device");
Intrinsics.checkNotNullParameter(action, "action");
this.setCancelled(false);
this.setDevice(device);
this.setAction(action);
InputEvent.key = key;
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}

public static enum Action {
Press,
Release,
Hold;

@NotNull
public static EnumEntries<InputEvent.Action> getEntries() {
return $ENTRIES;
}
}

public static enum Device {
Mouse,
Keyboard;

@NotNull
public static EnumEntries<InputEvent.Device> getEntries() {
return $ENTRIES;
}
}
}
