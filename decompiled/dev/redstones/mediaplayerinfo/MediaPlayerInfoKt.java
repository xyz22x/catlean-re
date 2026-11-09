package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.impl.DummyMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaPlayerInfo;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class MediaPlayerInfoKt {
    @NotNull
    private static final MediaPlayerInfo systemMediaPlayerInfo;

    @NotNull
    public static final MediaPlayerInfo getSystemMediaPlayerInfo() {
        return systemMediaPlayerInfo;
    }

    static {
        String var10000 = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue(var10000, "getProperty(...)");
        var10000 = var10000.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
        MediaPlayerInfo var1;
        if (StringsKt.startsWith$default(var10000, "windows", false, 2, null)) {
            var1 = WindowsMediaPlayerInfo.INSTANCE;
        } else {
            var10000 = System.getProperty("os.name");
            Intrinsics.checkNotNullExpressionValue(var10000, "getProperty(...)");
            var10000 = var10000.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
            var1 = Intrinsics.areEqual(var10000, "linux") ? LinuxMediaPlayerInfo.INSTANCE : DummyMediaPlayerInfo.INSTANCE;
        }

        systemMediaPlayerInfo = var1;
    }
}
