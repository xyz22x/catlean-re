package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Properties;
import org.jetbrains.annotations.NotNull;

public final class LinuxMediaPlayerInfo implements MediaPlayerInfo {
    @NotNull
    public static final LinuxMediaPlayerInfo INSTANCE = new LinuxMediaPlayerInfo();
    private static final DBusConnection conn = DBusConnectionBuilder.forSessionBus().build();
    private static final DBus dbus = (DBus)conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class);

    private LinuxMediaPlayerInfo() {
    }

    @NotNull
    @Override
    public List<IMediaSession> getMediaSessions() {
        String[] var10000 = dbus.ListNames();
        Intrinsics.checkNotNullExpressionValue(var10000, "ListNames(...)");
        Object[] $this$filter$iv = var10000;
        int $i$f$filter = 0;
        Object[] $this$filterTo$iv$iv = $this$filter$iv;
        var destination$iv$iv = new ArrayList();
        int $i$f$filterTo = 0;
        int var6 = 0;

        for (int element$iv$iv = $this$filter$iv.length; var6 < element$iv$iv; var6++) {
            Object element$iv$ivx = $this$filterTo$iv$iv[var6];
            String it = (String)element$iv$ivx;
            int $i$a$-filter-LinuxMediaPlayerInfo$getMediaSessions$1 = 0;
            Intrinsics.checkNotNull(it);
            if (StringsKt.startsWith$default(it, "org.mpris.MediaPlayer2.", false, 2, null)) {
                destination$iv$iv.add(element$iv$ivx);
            }
        }

        var var12 = (Iterable & List)destination$iv$iv;
        $i$f$filter = 0;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(var12, 10));
        $i$f$filterTo = 0;

        for (Object item$iv$iv : var12) {
            String var24 = (String)item$iv$iv;
            int $i$a$-map-LinuxMediaPlayerInfo$getMediaSessions$2 = 0;
            DBusInterface var10002 = conn.getRemoteObject(var24, "/org/mpris/MediaPlayer2", Player.class);
            Intrinsics.checkNotNullExpressionValue(var10002, "getRemoteObject(...)");
            Player var28 = (Player)var10002;
            Intrinsics.checkNotNull(var24);
            destination$iv$iv.add(new LinuxMediaSession(var28, StringsKt.removePrefix(var24, "org.mpris.MediaPlayer2.")));
        }

        var var13 = (Iterable & List)destination$iv$iv;
        $i$f$filter = 0;
        destination$iv$iv = new ArrayList();
        $i$f$filterTo = 0;

        for (Object element$iv$ivx : var13) {
            LinuxMediaSession it = (LinuxMediaSession)element$iv$ivx;
            int $i$a$-filter-LinuxMediaPlayerInfo$getMediaSessions$3 = 0;
            if (!Intrinsics.areEqual(INSTANCE.getProperty$MediaPlayerInfo(it.getOwner(), "PlaybackStatus"), "Stopped")) {
                destination$iv$iv.add(element$iv$ivx);
            }
        }

        return (List<IMediaSession>)destination$iv$iv;
    }

    public final <T> T getProperty$MediaPlayerInfo(@NotNull String owner, @NotNull String property) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(property, "property");
        Properties properties = (Properties)conn.getRemoteObject("org.mpris.MediaPlayer2." + owner, "/org/mpris/MediaPlayer2", Properties.class);
        return (T)properties.Get("org.mpris.MediaPlayer2.Player", property);
    }
}
