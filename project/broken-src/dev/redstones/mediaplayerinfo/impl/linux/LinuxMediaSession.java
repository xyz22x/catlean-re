package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.net.URL;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.freedesktop.dbus.DBusMap;
import org.jetbrains.annotations.NotNull;

public final class LinuxMediaSession implements IMediaSession {
    @NotNull
    private final Player dbus;
    @NotNull
    private final String owner;
    @NotNull
    private final MediaInfo media;

    public LinuxMediaSession(@NotNull Player dbus, @NotNull String owner) {
        Intrinsics.checkNotNullParameter(dbus, "dbus");
        Intrinsics.checkNotNullParameter(owner, "owner");
        super();
        this.dbus = dbus;
        this.owner = owner;
        this.media = this.generateMediaInfo();
    }

    @NotNull
    @Override
    public String getOwner() {
        return this.owner;
    }

    @NotNull
    @Override
    public MediaInfo getMedia() {
        return this.media;
    }

    @Override
    public void play() {
        this.dbus.Play();
    }

    @Override
    public void pause() {
        this.dbus.Pause();
    }

    @Override
    public void playPause() {
        this.dbus.PlayPause();
    }

    @Override
    public void stop() {
        this.dbus.Stop();
    }

    @Override
    public void next() {
        this.dbus.Next();
    }

    @Override
    public void previous() {
        this.dbus.Previous();
    }

    private final MediaInfo generateMediaInfo() {
        DBusMap metadata = LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "Metadata");
        boolean playing = Intrinsics.areEqual(LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "PlaybackStatus"), "Playing");
        long position = (long)LinuxMediaPlayerInfo.INSTANCE.<Number>getProperty$MediaPlayerInfo(this.getOwner(), "Position").doubleValue() / 1000000;
        Object var10000 = metadata.get("mpris:length");
        Intrinsics.checkNotNull(var10000);
        long duration = Long.parseLong(var10000.toString()) / 1000000;
        var10000 = metadata.get("xesam:title");
        Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.String");
        String title = (String)var10000;
        Object $this$generateMediaInfo_u24lambda_u240 = metadata.get("xesam:artist");
        int $i$a$-run-LinuxMediaSession$generateMediaInfo$artist$1 = 0;
        if (!($this$generateMediaInfo_u24lambda_u240 instanceof String var14)) {
            Intrinsics.checkNotNull($this$generateMediaInfo_u24lambda_u240, "null cannot be cast to non-null type kotlin.collections.List<*>");
            var14 = CollectionsKt.joinToString$default((Iterable & List)$this$generateMediaInfo_u24lambda_u240, ", ", null, null, 0, null, null, 62, null);
        }

        String artist = var14;
        Object artworkUrl = metadata.get("mpris:artUrl");
        $this$generateMediaInfo_u24lambda_u240 = artworkUrl instanceof String ? TextStreamsKt.readBytes(new URL((String)artworkUrl)) : new byte[0];
        return new MediaInfo(title, artist, (byte[])$this$generateMediaInfo_u24lambda_u240, position, duration, playing);
    }
}
