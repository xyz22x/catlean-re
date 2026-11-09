package dev.redstones.mediaplayerinfo;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface MediaPlayerInfo {
    @NotNull
    MediaPlayerInfo.Instance Instance = MediaPlayerInfo.Instance.$$INSTANCE;

    @NotNull
    List<IMediaSession> getMediaSessions();

    public static final class Instance implements MediaPlayerInfo {
        private Instance() {
        }

        @NotNull
        @Override
        public List<IMediaSession> getMediaSessions() {
            return this.$$delegate_0.getMediaSessions();
        }
    }
}
