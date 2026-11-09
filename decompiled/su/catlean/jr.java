package su.catlean;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public interface jr {
void w(long var1, @NotNull PreSyncEvent var3);

void y(@NotNull PreElytraEvent var1, long var2);

void b(long var1, @NotNull AfterElytraEvent var3);

void h(@NotNull MoveEvent var1, long var2);

void j(long var1, @NotNull AfterSendPacket var3);

void A(@NotNull ReceivePacket var1, long var2, char var4);

void P(int var1, @NotNull PlayerUpdateEvent var2, char var3, char var4);

void m(char var1, int var2, short var3);

void b(long var1);

void U(long var1, @NotNull FireWorkVelocityEvent var3);

void s(@NotNull SetPoseEvent var1);

void k(long var1, @NotNull ReceivePacket var3);
}
