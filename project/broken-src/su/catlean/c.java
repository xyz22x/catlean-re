package su.catlean;

import kotlin.jvm.functions.Function0;

public final class c implements Runnable {
final int d;
final Function0 T;

public c(int $delay, Function0 $runnable) {
this.d = $delay;
this.T = $runnable;
}

@Override
public final void run() {
Thread.sleep(this.d);
this.T.invoke();
}
}
