package su.catlean.api.event.events.network;

import io.netty.channel.ChannelPipeline;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_2598;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class AddHandlersEvent extends Event {
@NotNull
public static final AddHandlersEvent INSTANCE = new AddHandlersEvent();
private static AtomicReference<ChannelPipeline> pipeline;
private static class_2598 side;
@NotNull
private static final ReadWriteProperty local$delegate = Delegates.INSTANCE.notNull();

private AddHandlersEvent() {
}

@NotNull
public final AtomicReference<ChannelPipeline> getPipeline() {
if (pipeline != null) {
return pipeline;
} else {
Intrinsics.throwUninitializedPropertyAccessException("pipeline");
return null;
}
}

@NotNull
public final class_2598 getSide() {
if (side != null) {
return side;
} else {
Intrinsics.throwUninitializedPropertyAccessException("side");
return null;
}
}

public final boolean getLocal() {
return (Boolean)local$delegate.getValue(this, $$delegatedProperties[0]);
}

private final void setLocal(boolean <set-?>) {
local$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
}

public final boolean call(@NotNull AtomicReference<ChannelPipeline> pipeline, @NotNull class_2598 side, boolean local) {
Intrinsics.checkNotNullParameter(pipeline, "pipeline");
Intrinsics.checkNotNullParameter(side, "side");
this.setCancelled(false);
AddHandlersEvent.pipeline = pipeline;
AddHandlersEvent.side = side;
this.setLocal(local);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}

static {
KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(AddHandlersEvent.class, "local", "getLocal()Z", 0))};
$$delegatedProperties = var0;
}
}
