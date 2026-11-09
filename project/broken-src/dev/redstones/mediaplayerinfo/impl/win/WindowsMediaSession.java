package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class WindowsMediaSession implements IMediaSession {
    @NotNull
    private final MediaInfo media;
    @NotNull
    private final String owner;
    private final int index;

    public WindowsMediaSession(@NotNull MediaInfo media, @NotNull String owner, int index) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(owner, "owner");
        super();
        this.media = media;
        this.owner = owner;
        this.index = index;
    }

    @NotNull
    @Override
    public MediaInfo getMedia() {
        return this.media;
    }

    @NotNull
    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public native void play();

    @Override
    public native void pause();

    @Override
    public native void playPause();

    @Override
    public native void stop();

    @Override
    public native void next();

    @Override
    public native void previous();
}
