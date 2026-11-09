package dev.redstones.mediaplayerinfo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class MediaInfo {
    @NotNull
    public static final MediaInfo.Companion Companion = new MediaInfo.Companion(null);
    @NotNull
    private final String title;
    @NotNull
    private final String artist;
    @NotNull
    private final byte[] artworkPng;
    private final long position;
    private final long duration;
    private final boolean playing;
    @NotNull
    private final Lazy artwork$delegate;

    public MediaInfo(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        super();
        this.title = title;
        this.artist = artist;
        this.artworkPng = artworkPng;
        this.position = position;
        this.duration = duration;
        this.playing = playing;
        this.artwork$delegate = LazyKt.lazy((Function0)(new Function0<BufferedImage>() {
            @Nullable
            public final BufferedImage invoke() {
                System.currentTimeMillis();

                BufferedImage var1;
                try {
                    var1 = ImageIO.read(new ByteArrayInputStream(MediaInfo.this.getArtworkPng()));
                } catch (Exception var3) {
                    var1 = null;
                }

                return var1;
            }
        }));
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    public final byte[] getArtworkPng() {
        return this.artworkPng;
    }

    public final long getPosition() {
        return this.position;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    @Nullable
    public final BufferedImage getArtwork() {
        Lazy var1 = this.artwork$delegate;
        return (BufferedImage)var1.getValue();
    }

    @Override
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        } else if (!Intrinsics.areEqual(this.getClass(), other != null ? other.getClass() : null)) {
            return false;
        } else {
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type dev.redstones.mediaplayerinfo.MediaInfo");
            if (!Intrinsics.areEqual(this.title, ((MediaInfo)other).title)) {
                return false;
            } else if (!Intrinsics.areEqual(this.artist, ((MediaInfo)other).artist)) {
                return false;
            } else if (!Arrays.equals(this.artworkPng, ((MediaInfo)other).artworkPng)) {
                return false;
            } else if (this.position != ((MediaInfo)other).position) {
                return false;
            } else {
                return this.duration != ((MediaInfo)other).duration ? false : this.playing == ((MediaInfo)other).playing;
            }
        }
    }

    @Override
    public int hashCode() {
        int result = this.title.hashCode();
        result = 31 * result + this.artist.hashCode();
        result = 31 * result + Arrays.hashCode(this.artworkPng);
        result = 31 * result + Long.hashCode(this.position);
        result = 31 * result + Long.hashCode(this.duration);
        return 31 * result + Boolean.hashCode(this.playing);
    }

    @NotNull
    @Override
    public String toString() {
        return "MediaInfo(title='"
            + this.title
            + "', artist='"
            + this.artist
            + "', position="
            + this.position
            + ", duration="
            + this.duration
            + ", playing="
            + this.playing
            + ")";
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.artist;
    }

    @NotNull
    public final byte[] component3() {
        return this.artworkPng;
    }

    public final long component4() {
        return this.position;
    }

    public final long component5() {
        return this.duration;
    }

    public final boolean component6() {
        return this.playing;
    }

    @NotNull
    public final MediaInfo copy(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        return new MediaInfo(title, artist, artworkPng, position, duration, playing);
    }

    /** @deprecated */
    @Deprecated(
        message = "This synthesized declaration should not be used directly",
        replaceWith = @ReplaceWith(
            expression = "",
            imports = {}
        ),
        level = DeprecationLevel.HIDDEN
    )
    public static final class $serializer implements GeneratedSerializer<MediaInfo> {
        @NotNull
        public static final MediaInfo.$serializer INSTANCE = new MediaInfo.$serializer();

        private $serializer() {
        }

        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }

        @NotNull
        public SerialDescriptor getDescriptor() {
            return (SerialDescriptor)descriptor;
        }

        @NotNull
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{
                StringSerializer.INSTANCE,
                StringSerializer.INSTANCE,
                ByteArraySerializer.INSTANCE,
                LongSerializer.INSTANCE,
                LongSerializer.INSTANCE,
                BooleanSerializer.INSTANCE
            };
        }

        @NotNull
        public MediaInfo deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor var2 = this.getDescriptor();
            boolean var3 = true;
            int var5 = 0;
            String var6 = null;
            String var7 = null;
            byte[] var8 = null;
            long var9 = 0L;
            long var11 = 0L;
            boolean var13 = false;
            CompositeDecoder var14 = decoder.beginStructure(var2);
            if (var14.decodeSequentially()) {
                var6 = var14.decodeStringElement(var2, 0);
                var5 |= 1;
                var7 = var14.decodeStringElement(var2, 1);
                var5 |= 2;
                var8 = (byte[])var14.decodeSerializableElement(var2, 2, (DeserializationStrategy)ByteArraySerializer.INSTANCE, var8);
                var5 |= 4;
                var9 = var14.decodeLongElement(var2, 3);
                var5 |= 8;
                var11 = var14.decodeLongElement(var2, 4);
                var5 |= 16;
                var13 = var14.decodeBooleanElement(var2, 5);
                var5 |= 32;
            } else {
                while (var3) {
                    int var4 = var14.decodeElementIndex(var2);
                    switch (var4) {
                        case -1:
                            var3 = false;
                            break;
                        case 0:
                            var6 = var14.decodeStringElement(var2, 0);
                            var5 |= 1;
                            break;
                        case 1:
                            var7 = var14.decodeStringElement(var2, 1);
                            var5 |= 2;
                            break;
                        case 2:
                            var8 = (byte[])var14.decodeSerializableElement(var2, 2, (DeserializationStrategy)ByteArraySerializer.INSTANCE, var8);
                            var5 |= 4;
                            break;
                        case 3:
                            var9 = var14.decodeLongElement(var2, 3);
                            var5 |= 8;
                            break;
                        case 4:
                            var11 = var14.decodeLongElement(var2, 4);
                            var5 |= 16;
                            break;
                        case 5:
                            var13 = var14.decodeBooleanElement(var2, 5);
                            var5 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(var4);
                    }
                }
            }

            var14.endStructure(var2);
            return new MediaInfo(var5, var6, var7, var8, var9, var11, var13, null);
        }

        public void serialize(@NotNull Encoder encoder, @NotNull MediaInfo value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor var3 = this.getDescriptor();
            CompositeEncoder var4 = encoder.beginStructure(var3);
            MediaInfo.write$Self$MediaPlayerInfo(value, var4, var3);
            var4.endStructure(var3);
        }

        static {
            PluginGeneratedSerialDescriptor var0 = new PluginGeneratedSerialDescriptor("dev.redstones.mediaplayerinfo.MediaInfo", INSTANCE, 6);
            var0.addElement("title", false);
            var0.addElement("artist", false);
            var0.addElement("artworkPng", false);
            var0.addElement("position", false);
            var0.addElement("duration", false);
            var0.addElement("playing", false);
            descriptor = var0;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<MediaInfo> serializer() {
            return (KSerializer<MediaInfo>)MediaInfo.$serializer.INSTANCE;
        }
    }
}
