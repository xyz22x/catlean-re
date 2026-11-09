package su.catlean.api.event.events;

import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FilesDraggedEvent extends Event {
@NotNull
public static final FilesDraggedEvent INSTANCE = new FilesDraggedEvent();
public static List<? extends Path> paths;

private FilesDraggedEvent() {
}

@NotNull
public final List<Path> getPaths() {
if (paths != null) {
return paths;
} else {
Intrinsics.throwUninitializedPropertyAccessException("paths");
return null;
}
}

public final void setPaths(@NotNull List<? extends Path> <set-?>) {
Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
paths = <set-?>;
}

public final boolean call(@NotNull List<? extends Path> paths) {
Intrinsics.checkNotNullParameter(paths, "paths");
this.setPaths(paths);
this.setCancelled(false);
Gofra.INSTANCE.drain(this);
return this.getCancelled();
}
}
