package su.catlean.api.event;

import org.jetbrains.annotations.NotNull;

public final class GofraState {
@NotNull
public static final GofraState INSTANCE = new GofraState();
private static boolean modifyBuffer;
private static boolean modifyCollisions;
private static boolean shouldRender;
private static boolean stopSwapBuffers;
private static boolean xray;

private GofraState() {
}

public final boolean getModifyBuffer() {
return modifyBuffer;
}

public final void setModifyBuffer(boolean _v) {
modifyBuffer = _v;
}

public final boolean getModifyCollisions() {
return modifyCollisions;
}

public final void setModifyCollisions(boolean _v) {
modifyCollisions = _v;
}

public final boolean getShouldRender() {
return shouldRender;
}

public final void setShouldRender(boolean _v) {
shouldRender = _v;
}

public final boolean getStopSwapBuffers() {
return stopSwapBuffers;
}

public final void setStopSwapBuffers(boolean _v) {
stopSwapBuffers = _v;
}

public final boolean getXray() {
return xray;
}

public final void setXray(boolean _v) {
xray = _v;
}
}
