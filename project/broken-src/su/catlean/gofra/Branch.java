package su.catlean.gofra;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Branch {
@NotNull
private final Class<?> eventTarget;
private final byte priority;
@NotNull
private Consumer<Object> consumer;
private Method privateLookupInMethod;

public Branch(@NotNull Class<?> klass, @NotNull Object obj, @NotNull Method method) {
Intrinsics.checkNotNullParameter(klass, "klass");
Intrinsics.checkNotNullParameter(obj, "obj");
Intrinsics.checkNotNullParameter(method, "method");
super();
Class var10001 = method.getParameters()[0].getType();
Intrinsics.checkNotNullExpressionValue(var10001, "getType(...)");
this.eventTarget = var10001;
this.priority = method.getAnnotation(Flow.class).priority();
Class[] l = new Class[]{Class.class, Lookup.class};
this.privateLookupInMethod = MethodHandles.class.getDeclaredMethod("privateLookupIn", l);
Method var10000 = this.privateLookupInMethod;
Object[] mH = new Object[]{klass, MethodHandles.lookup()};
Object var10 = var10000.invoke(null, mH);
Intrinsics.checkNotNull(var10, "null cannot be cast to non-null type java.lang.invoke.MethodHandles.Lookup");
Lookup lx = (Lookup)var10;
MethodType mT = MethodType.methodType(void.class, method.getParameters()[0].getType());
MethodHandle mHx = lx.findVirtual(klass, method.getName(), mT);
MethodType iT = MethodType.methodType(Consumer.class, klass);
this.consumer = (Consumer)LambdaMetafactory.metafactory(lx, "accept", iT, MethodType.methodType(void.class, Object.class), mHx, mT)
.getTarget()
.invoke((Object)obj);
}

@NotNull
public final Class<?> getEventTarget() {
return this.eventTarget;
}

public final byte getPriority() {
return this.priority;
}

public final void call(@NotNull Object event) {
Intrinsics.checkNotNullParameter(event, "event");
this.consumer.accept(event);
}
}
