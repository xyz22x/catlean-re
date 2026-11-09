package su.catlean.mixins.client;

import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.client.InputEvent.Action;
import su.catlean.api.event.events.client.InputEvent.Device;

@Mixin({class_309.class})
public class MixinKeyboardHandler {
@Inject(
method = {"method_1466"},
at = {@At("HEAD")},
cancellable = true
)
private void onKey(long window, int action, class_11908 input, CallbackInfo ci) {
if (window == class_310.method_1551().method_22683().method_4490()
&& class_310.method_1551().field_1687 != null
&& class_310.method_1551().field_1724 != null
&& InputEvent.INSTANCE.call(input.comp_4795(), Device.Keyboard, action == 0 ? Action.Release : (action == 1 ? Action.Press : Action.Hold))) {
ci.cancel();
}
}
}
