package su.catlean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

public final class rt {
private rt() {
}

@NotNull
public final KSerializer k() {
return this.j();
}

private final KSerializer j() {
return (KSerializer)d1.o().getValue();
}

public rt(DefaultConstructorMarker $constructor_marker) {
this();
}
}
