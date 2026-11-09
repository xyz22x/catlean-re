package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.KeyMappingAccessor;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

public final class dm {
@NotNull
public static final dm h;
private static int H;
private static float R;
private static float K;
private static boolean Q;
private static boolean w;
private static long i;
private static long z;
private static long u;
private static double S;
private static boolean M;
private static _g[] n;
private static final long a = yz.a(-265864172261133626L, 338618076458484166L, MethodHandles.lookup().lookupClass()).a(220459146735406L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long[] j;
private static final Long[] k;
private static final Map l;

private dm() {
}

public final int Z() {
return H;
}

public final void I(int <set-?>) {
H = <set-?>;
}

public final float r() {
return R;
}

public final void X(float <set-?>) {
R = <set-?>;
}

public final float H() {
return K;
}

public final void Q(float <set-?>) {
K = <set-?>;
}

public final boolean J() {
return Q;
}

public final void E(boolean <set-?>) {
Q = <set-?>;
}

public final boolean I() {
return w;
}

public final void V(boolean <set-?>) {
w = <set-?>;
}

public final long L() {
return i;
}

public final void c(long <set-?>) {
i = <set-?>;
}

public final long A() {
return z;
}

public final void y(long <set-?>) {
z = <set-?>;
}

public final long q() {
return u;
}

public final void R(long <set-?>) {
u = <set-?>;
}

public final double o() {
return S;
}

public final void c(double <set-?>) {
S = <set-?>;
}

public final boolean W() {
return M;
}

public final void r(boolean <set-?>) {
M = <set-?>;
}

public final float U(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 26846181185767L;
class_746 var10000 = zf.v(var3);
Intrinsics.checkNotNull(var10000, a<"x">(12117, 8137856535093275613L ^ var1));
return ((LocalPlayerAccessor)var10000).getLastYaw();
}

public final float w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 130469340436106L;
class_746 var10000 = zf.v(var3);
Intrinsics.checkNotNull(var10000, a<"x">(28670, 1212775109831238912L ^ var1));
return ((LocalPlayerAccessor)var10000).getLastPitch();
}

@NotNull
public final class_243 S(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 5680393519727
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 105460485472641
// 11: lxor
// 12: lstore 5
// 14: dup2
// 15: ldc2_w 66913392022751
// 18: lxor
// 19: lstore 7
// 1b: pop2
// 1c: ldc2_w -8720713708772821247
// 1f: lload 1
// 20: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25: astore 9
// 27: getstatic su/catlean/us.z Lsu/catlean/us;
// 2a: aload 9
// 2c: ifnonnull 54
// 2f: lload 5
// 31: invokevirtual su/catlean/us.f (J)Z
// 34: ifeq 86
// 37: goto 44
// 3a: ldc2_w -8758298552144775192
// 3d: lload 1
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: getstatic su/catlean/us.z Lsu/catlean/us;
// 47: goto 54
// 4a: ldc2_w -8758298552144775192
// 4d: lload 1
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: invokevirtual su/catlean/us.l ()Lnet/minecraft/class_243;
// 57: aload 9
// 59: ifnonnull 83
// 5c: ifnull 86
// 5f: goto 6c
// 62: ldc2_w -8758298552144775192
// 65: lload 1
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: getstatic su/catlean/us.z Lsu/catlean/us;
// 6f: invokevirtual su/catlean/us.l ()Lnet/minecraft/class_243;
// 72: dup
// 73: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 76: goto 83
// 79: ldc2_w -8758298552144775192
// 7c: lload 1
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: goto 94
// 86: lload 7
// 88: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8b: lload 3
// 8c: dup2_x1
// 8d: pop2
// 8e: checkcast net/minecraft/class_1297
// 91: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 94: areturn
}

@Flow
private final void i(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: ldc2_w 139954739222686
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 93111036477637
// 00d: lxor
// 00e: lstore 4
// 010: pop2
// 011: ldc2_w -3250572663726267621
// 014: lload 2
// 015: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01a: astore 6
// 01c: aload 1
// 01d: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 020: instanceof net/minecraft/class_2848
// 023: aload 6
// 025: ifnonnull 0b2
// 028: ifeq 0ab
// 02b: goto 038
// 02e: ldc2_w -3283636867250985998
// 031: lload 2
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 1
// 039: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 03c: checkcast net/minecraft/class_2848
// 03f: invokevirtual net/minecraft/class_2848.method_12365 ()Lnet/minecraft/class_2848$class_2849;
// 042: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 045: aload 6
// 047: ifnonnull 097
// 04a: goto 057
// 04d: ldc2_w -3283636867250985998
// 050: lload 2
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: if_acmpne 078
// 05a: goto 067
// 05d: ldc2_w -3283636867250985998
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: bipush 1
// 068: putstatic su/catlean/dm.Q Z
// 06b: goto 078
// 06e: ldc2_w -3283636867250985998
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: aload 1
// 079: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 07c: checkcast net/minecraft/class_2848
// 07f: aload 6
// 081: ifnonnull 0af
// 084: invokevirtual net/minecraft/class_2848.method_12365 ()Lnet/minecraft/class_2848$class_2849;
// 087: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 08a: goto 097
// 08d: ldc2_w -3283636867250985998
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: if_acmpne 0ab
// 09a: bipush 0
// 09b: putstatic su/catlean/dm.Q Z
// 09e: goto 0ab
// 0a1: ldc2_w -3283636867250985998
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 1
// 0ac: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0af: instanceof net/minecraft/class_2813
// 0b2: aload 6
// 0b4: ifnonnull 0df
// 0b7: ifeq 0d8
// 0ba: goto 0c7
// 0bd: ldc2_w -3283636867250985998
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: bipush 1
// 0c8: putstatic su/catlean/dm.w Z
// 0cb: goto 0d8
// 0ce: ldc2_w -3283636867250985998
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: aload 1
// 0d9: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0dc: instanceof net/minecraft/class_2815
// 0df: aload 6
// 0e1: ifnonnull 10c
// 0e4: ifeq 105
// 0e7: goto 0f4
// 0ea: ldc2_w -3283636867250985998
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: bipush 0
// 0f5: putstatic su/catlean/dm.w Z
// 0f8: goto 105
// 0fb: ldc2_w -3283636867250985998
// 0fe: lload 2
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: aload 1
// 106: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 109: instanceof net/minecraft/class_2886
// 10c: aload 6
// 10e: ifnonnull 13f
// 111: ifeq 155
// 114: goto 121
// 117: ldc2_w -3283636867250985998
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: lload 4
// 123: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 126: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 129: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 12c: getstatic net/minecraft/class_1802.field_8233 Lnet/minecraft/class_1792;
// 12f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 132: goto 13f
// 135: ldc2_w -3283636867250985998
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: ifeq 155
// 142: invokestatic su/catlean/zf.A ()J
// 145: putstatic su/catlean/dm.u J
// 148: goto 155
// 14b: ldc2_w -3283636867250985998
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: return
}

@Flow
private final void h(StopUsingItemEvent var1) {
long var2 = a ^ 44350552975456L;
long var4 = var2 ^ 4058478915643L;

try {
if (Intrinsics.areEqual(zf.v(var4).method_6030().method_7909(), class_1802.field_8233)) {
u = zf.A();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 7102311531350610700L, var2);
}
}

@Flow
private final void J(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: ldc2_w 84650641154299
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 104361069948432
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 113368239208608
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: ldc2_w -6159069590390219906
// 01b: lload 2
// 01c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: astore 8
// 023: aload 1
// 024: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 027: instanceof net/minecraft/class_2708
// 02a: aload 8
// 02c: ifnonnull 09e
// 02f: ifeq 097
// 032: goto 03f
// 035: ldc2_w -6193823747518915689
// 038: lload 2
// 039: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: athrow
// 03f: aload 1
// 040: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 043: checkcast net/minecraft/class_2708
// 046: invokevirtual net/minecraft/class_2708.comp_3228 ()Lnet/minecraft/class_10182;
// 049: invokevirtual net/minecraft/class_10182.comp_3148 ()Lnet/minecraft/class_243;
// 04c: lload 6
// 04e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 051: lload 4
// 053: dup2_x1
// 054: pop2
// 055: checkcast net/minecraft/class_1297
// 058: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 05b: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 05e: ldc2_w 3.0
// 061: dcmpl
// 062: aload 8
// 064: ifnonnull 09e
// 067: goto 074
// 06a: ldc2_w -6193823747518915689
// 06d: lload 2
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: ifle 097
// 077: goto 084
// 07a: ldc2_w -6193823747518915689
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: invokestatic su/catlean/zf.A ()J
// 087: putstatic su/catlean/dm.z J
// 08a: goto 097
// 08d: ldc2_w -6193823747518915689
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: aload 1
// 098: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 09b: instanceof net/minecraft/class_2708
// 09e: aload 8
// 0a0: ifnonnull 13b
// 0a3: ifeq 134
// 0a6: goto 0b3
// 0a9: ldc2_w -6193823747518915689
// 0ac: lload 2
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: invokestatic su/catlean/zf.A ()J
// 0b6: getstatic su/catlean/dm.u J
// 0b9: lsub
// 0ba: sipush 31298
// 0bd: ldc2_w 3278149460151800652
// 0c0: lload 2
// 0c1: lxor
// 0c2: invokedynamic a (IJ)J bsm=su/catlean/dm.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: lcmp
// 0c8: aload 8
// 0ca: ifnonnull 13b
// 0cd: goto 0da
// 0d0: ldc2_w -6193823747518915689
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: ifle 134
// 0dd: goto 0ea
// 0e0: ldc2_w -6193823747518915689
// 0e3: lload 2
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: lload 6
// 0ec: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ef: getfield net/minecraft/class_746.field_6012 I
// 0f2: aload 8
// 0f4: ifnonnull 13b
// 0f7: goto 104
// 0fa: ldc2_w -6193823747518915689
// 0fd: lload 2
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: sipush 1640
// 107: ldc2_w 6438253909555957912
// 10a: lload 2
// 10b: lxor
// 10c: invokedynamic p (IJ)I bsm=su/catlean/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: if_icmple 134
// 114: goto 121
// 117: ldc2_w -6193823747518915689
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: invokestatic su/catlean/zf.A ()J
// 124: putstatic su/catlean/dm.i J
// 127: goto 134
// 12a: ldc2_w -6193823747518915689
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 1
// 135: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 138: instanceof net/minecraft/class_2767
// 13b: aload 8
// 13d: ifnonnull 172
// 140: ifeq 188
// 143: goto 150
// 146: ldc2_w -6193823747518915689
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: aload 1
// 151: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 154: checkcast net/minecraft/class_2767
// 157: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 15a: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 15f: getstatic net/minecraft/class_3417.field_14757 Lnet/minecraft/class_3414;
// 162: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 165: goto 172
// 168: ldc2_w -6193823747518915689
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: ifeq 188
// 175: invokestatic su/catlean/zf.A ()J
// 178: putstatic su/catlean/dm.u J
// 17b: goto 188
// 17e: ldc2_w -6193823747518915689
// 181: lload 2
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: return
}

@Flow
private final void k(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: ldc2_w 68084156596060
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 60126329628961
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 31301281638075
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 128899937923673
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 24235581040391
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 3828596002901968089
// 029: lload 2
// 02a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: lload 4
// 033: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 036: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 039: ifnonnull 047
// 03c: return
// 03d: ldc2_w 3867588292355753008
// 040: lload 2
// 041: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: athrow
// 047: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 04a: getstatic su/catlean/__.i Lsu/catlean/__;
// 04d: lload 8
// 04f: invokevirtual su/catlean/__.f (J)Z
// 052: aload 12
// 054: ifnonnull 0e6
// 057: ifne 0e5
// 05a: goto 067
// 05d: ldc2_w 3867588292355753008
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: getstatic su/catlean/uq.h Lsu/catlean/uq;
// 06a: lload 8
// 06c: invokevirtual su/catlean/uq.f (J)Z
// 06f: aload 12
// 071: ifnonnull 0e6
// 074: goto 081
// 077: ldc2_w 3867588292355753008
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: ifne 0e5
// 084: goto 091
// 087: ldc2_w 3867588292355753008
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 094: lload 8
// 096: invokevirtual su/catlean/u3.f (J)Z
// 099: aload 12
// 09b: ifnonnull 0e6
// 09e: goto 0ab
// 0a1: ldc2_w 3867588292355753008
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: ifne 0e5
// 0ae: goto 0bb
// 0b1: ldc2_w 3867588292355753008
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0be: lload 6
// 0c0: invokevirtual su/catlean/ex.e (J)Z
// 0c3: aload 12
// 0c5: ifnonnull 0e6
// 0c8: goto 0d5
// 0cb: ldc2_w 3867588292355753008
// 0ce: lload 2
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: ifeq 0e9
// 0d8: goto 0e5
// 0db: ldc2_w 3867588292355753008
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: bipush 1
// 0e6: goto 0ea
// 0e9: bipush 0
// 0ea: invokevirtual su/catlean/api/event/GofraState.setModifyCollisions (Z)V
// 0ed: lload 10
// 0ef: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f2: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0f5: lload 10
// 0f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fa: getfield net/minecraft/class_746.field_6014 D
// 0fd: dsub
// 0fe: dstore 13
// 100: lload 10
// 102: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 105: invokevirtual net/minecraft/class_746.method_23318 ()D
// 108: lload 10
// 10a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10d: getfield net/minecraft/class_746.field_6036 D
// 110: dsub
// 111: dstore 15
// 113: lload 10
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: invokevirtual net/minecraft/class_746.method_23321 ()D
// 11b: lload 10
// 11d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 120: getfield net/minecraft/class_746.field_5969 D
// 123: dsub
// 124: dstore 17
// 126: dload 13
// 128: dload 17
// 12a: invokestatic java/lang/Math.hypot (DD)D
// 12d: d2f
// 12e: putstatic su/catlean/dm.R F
// 131: dload 13
// 133: dload 13
// 135: dmul
// 136: dload 15
// 138: dload 15
// 13a: dmul
// 13b: dadd
// 13c: dload 17
// 13e: dload 17
// 140: dmul
// 141: dadd
// 142: invokestatic java/lang/Math.sqrt (D)D
// 145: d2f
// 146: putstatic su/catlean/dm.K F
// 149: lload 10
// 14b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14e: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 151: aload 12
// 153: ifnonnull 1be
// 156: ifeq 1b0
// 159: goto 166
// 15c: ldc2_w 3867588292355753008
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: lload 10
// 168: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16b: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 16e: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 171: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 174: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 177: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 17a: aload 12
// 17c: ifnonnull 1be
// 17f: goto 18c
// 182: ldc2_w 3867588292355753008
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: ifeq 1b0
// 18f: goto 19c
// 192: ldc2_w 3867588292355753008
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: getstatic su/catlean/dm.H I
// 19f: istore 19
// 1a1: iload 19
// 1a3: bipush 1
// 1a4: iadd
// 1a5: putstatic su/catlean/dm.H I
// 1a8: iload 19
// 1aa: pop
// 1ab: aload 12
// 1ad: ifnull 1c1
// 1b0: bipush 0
// 1b1: goto 1be
// 1b4: ldc2_w 3867588292355753008
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: putstatic su/catlean/dm.H I
// 1c1: lload 4
// 1c3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1c9: ifnonnull 1dd
// 1cc: bipush 0
// 1cd: putstatic su/catlean/dm.w Z
// 1d0: goto 1dd
// 1d3: ldc2_w 3867588292355753008
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: return
}

@Flow
private final void V(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: ldc2_w 49149341053963
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 8064401321040
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 9112742032208007054
// 14: lload 2
// 15: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: astore 6
// 1c: lload 4
// 1e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 24: aload 6
// 26: ifnonnull 4e
// 29: ifne a8
// 2c: goto 39
// 2f: ldc2_w 9150045950359064423
// 32: lload 2
// 33: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: athrow
// 39: lload 4
// 3b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e: invokevirtual net/minecraft/class_746.method_52535 ()Z
// 41: goto 4e
// 44: ldc2_w 9150045950359064423
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 6
// 50: ifnonnull 76
// 53: ifne a8
// 56: goto 63
// 59: ldc2_w 9150045950359064423
// 5c: lload 2
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 1
// 64: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 67: dconst_0
// 68: dcmpg
// 69: goto 76
// 6c: ldc2_w 9150045950359064423
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: aload 6
// 78: ifnonnull be
// 7b: ifge b9
// 7e: goto 8b
// 81: ldc2_w 9150045950359064423
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: getstatic su/catlean/dm.S D
// 8e: aload 1
// 8f: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 92: dsub
// 93: putstatic su/catlean/dm.S D
// 96: aload 6
// 98: ifnull b9
// 9b: goto a8
// 9e: ldc2_w 9150045950359064423
// a1: lload 2
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: dconst_0
// a9: putstatic su/catlean/dm.S D
// ac: goto b9
// af: ldc2_w 9150045950359064423
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: getstatic su/catlean/dm.S D
// bc: dconst_0
// bd: dcmpl
// be: aload 6
// c0: ifnonnull d4
// c3: ifle d7
// c6: goto d3
// c9: ldc2_w 9150045950359064423
// cc: lload 2
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: bipush 1
// d4: goto d8
// d7: bipush 0
// d8: putstatic su/catlean/dm.M Z
// db: return
}

public final long K() {
return System.currentTimeMillis() - i;
}

public final boolean Y(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 67325925137113
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 32564449121535
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -4118000541212264671
// 18: lload 1
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 3
// 21: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24: aload 7
// 26: ifnonnull 4d
// 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 2c: ifnull e1
// 2f: goto 3c
// 32: ldc2_w -4155585936219047992
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: lload 3
// 3d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 40: goto 4d
// 43: ldc2_w -4155585936219047992
// 46: lload 1
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 50: ifnull e1
// 53: lload 5
// 55: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 58: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 5b: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 5e: getfield net/minecraft/class_241.field_1342 F
// 61: fconst_0
// 62: fcmpg
// 63: aload 7
// 65: ifnonnull 86
// 68: goto 75
// 6b: ldc2_w -4155585936219047992
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: ifne 89
// 78: goto 85
// 7b: ldc2_w -4155585936219047992
// 7e: lload 1
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: bipush 1
// 86: goto 8a
// 89: bipush 0
// 8a: lload 1
// 8b: lconst_0
// 8c: lcmp
// 8d: ifle d4
// 90: ifeq d3
// 93: lload 5
// 95: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 98: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 9b: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 9e: getfield net/minecraft/class_241.field_1343 F
// a1: fconst_0
// a2: fcmpg
// a3: aload 7
// a5: ifnonnull c6
// a8: goto b5
// ab: ldc2_w -4155585936219047992
// ae: lload 1
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: ifne c9
// b8: goto c5
// bb: ldc2_w -4155585936219047992
// be: lload 1
// bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c4: athrow
// c5: bipush 1
// c6: goto ca
// c9: bipush 0
// ca: lload 1
// cb: lconst_0
// cc: lcmp
// cd: iflt d4
// d0: ifne e1
// d3: bipush 1
// d4: goto e2
// d7: ldc2_w -4155585936219047992
// da: lload 1
// db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e0: athrow
// e1: bipush 0
// e2: ireturn
}

@NotNull
public final double[] F(int a, float d, boolean moveFix, float forward, long a, float sideways, float yaw) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: lload 5
// 007: bipush 32
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/dm.a J
// 011: lxor
// 012: lstore 9
// 014: lload 9
// 016: dup2
// 017: ldc2_w 128097343233944
// 01a: lxor
// 01b: lstore 11
// 01d: pop2
// 01e: ldc2_w 259139394849796704
// 021: lload 9
// 023: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: fload 4
// 02a: fstore 14
// 02c: astore 13
// 02e: fload 7
// 030: fstore 15
// 032: iload 3
// 033: aload 13
// 035: ifnonnull 065
// 038: ifeq 110
// 03b: goto 049
// 03e: ldc2_w 222133375366083209
// 041: lload 9
// 043: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: athrow
// 049: lload 11
// 04b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 04e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 051: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 054: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 057: goto 065
// 05a: ldc2_w 222133375366083209
// 05d: lload 9
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: iload 1
// 066: ifle 09c
// 069: aload 13
// 06b: ifnonnull 09c
// 06e: ifeq 08e
// 071: goto 07f
// 074: ldc2_w 222133375366083209
// 077: lload 9
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: fconst_1
// 080: goto 0b0
// 083: ldc2_w 222133375366083209
// 086: lload 9
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: lload 11
// 090: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 093: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 096: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 099: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 09c: ifeq 0af
// 09f: ldc -1.0
// 0a1: goto 0b0
// 0a4: ldc2_w 222133375366083209
// 0a7: lload 9
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: fconst_0
// 0b0: fstore 14
// 0b2: lload 11
// 0b4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ba: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 0bd: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0c0: lload 5
// 0c2: lconst_0
// 0c3: lcmp
// 0c4: iflt 0fa
// 0c7: aload 13
// 0c9: ifnonnull 0fa
// 0cc: ifeq 0ec
// 0cf: goto 0dd
// 0d2: ldc2_w 222133375366083209
// 0d5: lload 9
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: fconst_1
// 0de: goto 10e
// 0e1: ldc2_w 222133375366083209
// 0e4: lload 9
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: lload 11
// 0ee: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0f4: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 0f7: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0fa: ifeq 10d
// 0fd: ldc -1.0
// 0ff: goto 10e
// 102: ldc2_w 222133375366083209
// 105: lload 9
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: fconst_0
// 10e: fstore 15
// 110: fload 8
// 112: fstore 16
// 114: fload 14
// 116: fconst_0
// 117: fcmpg
// 118: aload 13
// 11a: ifnonnull 12f
// 11d: ifne 132
// 120: goto 12e
// 123: ldc2_w 222133375366083209
// 126: lload 9
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: bipush 1
// 12f: goto 133
// 132: bipush 0
// 133: iload 1
// 134: iflt 13e
// 137: ifne 228
// 13a: fload 15
// 13c: fconst_0
// 13d: fcmpg
// 13e: aload 13
// 140: ifnonnull 163
// 143: goto 151
// 146: ldc2_w 222133375366083209
// 149: lload 9
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: athrow
// 151: ifne 166
// 154: goto 162
// 157: ldc2_w 222133375366083209
// 15a: lload 9
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: bipush 1
// 163: goto 167
// 166: bipush 0
// 167: ifne 1f8
// 16a: fload 16
// 16c: fload 15
// 16e: fconst_0
// 16f: fcmpl
// 170: aload 13
// 172: ifnonnull 1e8
// 175: goto 183
// 178: ldc2_w 222133375366083209
// 17b: lload 9
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: ifle 1d1
// 186: goto 194
// 189: ldc2_w 222133375366083209
// 18c: lload 9
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: fload 14
// 196: aload 13
// 198: ifnonnull 1ce
// 19b: goto 1a9
// 19e: ldc2_w 222133375366083209
// 1a1: lload 9
// 1a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: athrow
// 1a9: fconst_0
// 1aa: fcmpl
// 1ab: ifle 1cc
// 1ae: goto 1bc
// 1b1: ldc2_w 222133375366083209
// 1b4: lload 9
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: ldc -45.0
// 1be: goto 1f2
// 1c1: ldc2_w 222133375366083209
// 1c4: lload 9
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: ldc 45.0
// 1ce: goto 1f2
// 1d1: fload 14
// 1d3: aload 13
// 1d5: ifnonnull 1ed
// 1d8: fconst_0
// 1d9: fcmpl
// 1da: goto 1e8
// 1dd: ldc2_w 222133375366083209
// 1e0: lload 9
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: ifle 1f0
// 1eb: ldc 45.0
// 1ed: goto 1f2
// 1f0: ldc -45.0
// 1f2: fadd
// 1f3: fstore 16
// 1f5: fconst_0
// 1f6: fstore 15
// 1f8: fload 14
// 1fa: aload 13
// 1fc: ifnonnull 221
// 1ff: fconst_0
// 200: fcmpl
// 201: ifle 224
// 204: goto 212
// 207: ldc2_w 222133375366083209
// 20a: lload 9
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: fconst_1
// 213: goto 221
// 216: ldc2_w 222133375366083209
// 219: lload 9
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: goto 226
// 224: ldc -1.0
// 226: fstore 14
// 228: fload 16
// 22a: ldc 90.0
// 22c: fadd
// 22d: f2d
// 22e: invokestatic java/lang/Math.toRadians (D)D
// 231: invokestatic java/lang/Math.sin (D)D
// 234: dstore 17
// 236: fload 16
// 238: ldc 90.0
// 23a: fadd
// 23b: f2d
// 23c: invokestatic java/lang/Math.toRadians (D)D
// 23f: invokestatic java/lang/Math.cos (D)D
// 242: dstore 19
// 244: fload 14
// 246: fload 2
// 247: fmul
// 248: f2d
// 249: dload 19
// 24b: dmul
// 24c: fload 15
// 24e: fload 2
// 24f: fmul
// 250: f2d
// 251: dload 17
// 253: dmul
// 254: dadd
// 255: dstore 21
// 257: fload 14
// 259: fload 2
// 25a: fmul
// 25b: f2d
// 25c: dload 17
// 25e: dmul
// 25f: fload 15
// 261: fload 2
// 262: fmul
// 263: f2d
// 264: dload 19
// 266: dmul
// 267: dsub
// 268: dstore 23
// 26a: bipush 2
// 26b: newarray 7
// 26d: astore 25
// 26f: aload 25
// 271: bipush 0
// 272: dload 21
// 274: dastore
// 275: aload 25
// 277: bipush 1
// 278: dload 23
// 27a: dastore
// 27b: aload 25
// 27d: areturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static double[] O(dm var0, float var1, boolean var2, float var3, long var4, float var6, float var7, int var8, Object var9) {
var4 = a ^ var4;
long var10 = var4 ^ 121841452511138L;
int var12 = (int)((var4 ^ 48824134464808L) >>> 32);
long var13 = (var4 ^ 48824134464808L) << 32 >>> 32;
_g[] var15 = vm.a<"Å">(4432842880146459772L, var4);

int var10000;
label65: {
label64: {
try {
var10000 = var8 & 2;
if (var15 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 4398072718358940821L, var4);
}

var2 = false;
}

var10000 = var8 & 4;
}

_g[] var10001;
label56: {
label55: {
label54: {
try {
var10001 = var15;
if (var4 <= 0L) {
break label56;
}

if (var15 != null) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 4398072718358940821L, var4);
}

var3 = zf.v(var10).field_3913.method_3128().field_1342;
}

var10000 = var8 & b<"p">(9590, 5607300248481293447L ^ var4);
}

try {
var10001 = var15;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 4398072718358940821L, var4);
}
}

label43: {
label42: {
try {
if (var10001 != null) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 4398072718358940821L, var4);
}

var6 = zf.v(var10).field_3913.method_3128().field_1343;
}

var10000 = var8 & b<"p">(2814, 5375574055880346378L ^ var4);
}

if (var10000 != 0) {
var7 = zf.v(var10).method_36454();
}

return var0.F(var12, var1, var2, var3, var13, var6, var7);
}

public final void Y(int a, short a, @NotNull MoveEvent event, char a, double d) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/dm.a J
// 01b: lxor
// 01c: lstore 7
// 01e: lload 7
// 020: dup2
// 021: ldc2_w 139550917227567
// 024: lxor
// 025: lstore 9
// 027: pop2
// 028: ldc2_w -6327645972659807785
// 02b: lload 7
// 02d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: aload 3
// 033: sipush 23520
// 036: ldc2_w 1451604915499974016
// 039: lload 7
// 03b: lxor
// 03c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 044: astore 11
// 046: lload 9
// 048: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 04e: dup
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 052: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 055: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 058: getfield net/minecraft/class_241.field_1342 F
// 05b: f2d
// 05c: dstore 12
// 05e: lload 9
// 060: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 063: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 066: dup
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06a: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 06d: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 070: getfield net/minecraft/class_241.field_1343 F
// 073: f2d
// 074: dstore 14
// 076: lload 9
// 078: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 07b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 07e: dup
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 082: invokevirtual net/minecraft/class_746.method_36454 ()F
// 085: fstore 16
// 087: dload 12
// 089: dconst_0
// 08a: dcmpg
// 08b: aload 11
// 08d: ifnonnull 0a2
// 090: ifne 0a5
// 093: goto 0a1
// 096: ldc2_w -6295426123802175170
// 099: lload 7
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: bipush 1
// 0a2: goto 0a6
// 0a5: bipush 0
// 0a6: iload 2
// 0a7: ifgt 102
// 0aa: ifeq 0fe
// 0ad: dload 14
// 0af: dconst_0
// 0b0: dcmpg
// 0b1: aload 11
// 0b3: ifnonnull 0d6
// 0b6: goto 0c4
// 0b9: ldc2_w -6295426123802175170
// 0bc: lload 7
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: ifne 0d9
// 0c7: goto 0d5
// 0ca: ldc2_w -6295426123802175170
// 0cd: lload 7
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: bipush 1
// 0d6: goto 0da
// 0d9: bipush 0
// 0da: iload 2
// 0db: ifge 102
// 0de: ifeq 0fe
// 0e1: aload 3
// 0e2: dconst_0
// 0e3: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 0e6: aload 3
// 0e7: dconst_0
// 0e8: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 0eb: aload 11
// 0ed: ifnull 2cd
// 0f0: goto 0fe
// 0f3: ldc2_w -6295426123802175170
// 0f6: lload 7
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: dload 12
// 100: dconst_0
// 101: dcmpg
// 102: aload 11
// 104: ifnonnull 127
// 107: goto 115
// 10a: ldc2_w -6295426123802175170
// 10d: lload 7
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: ifne 12a
// 118: goto 126
// 11b: ldc2_w -6295426123802175170
// 11e: lload 7
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: bipush 1
// 127: goto 12b
// 12a: bipush 0
// 12b: iload 1
// 12c: iflt 136
// 12f: ifne 287
// 132: dload 14
// 134: dconst_0
// 135: dcmpl
// 136: aload 11
// 138: iload 1
// 139: ifle 1cc
// 13c: ifnonnull 1ca
// 13f: goto 14d
// 142: ldc2_w -6295426123802175170
// 145: lload 7
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: iload 1
// 14e: ifle 1bc
// 151: ifle 1b8
// 154: goto 162
// 157: ldc2_w -6295426123802175170
// 15a: lload 7
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: fload 16
// 164: dload 12
// 166: dconst_0
// 167: dcmpl
// 168: aload 11
// 16a: ifnonnull 19a
// 16d: goto 17b
// 170: ldc2_w -6295426123802175170
// 173: lload 7
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: ifle 19d
// 17e: goto 18c
// 181: ldc2_w -6295426123802175170
// 184: lload 7
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: sipush 3914
// 18f: ldc2_w 7686788834502433553
// 192: lload 7
// 194: lxor
// 195: invokedynamic p (IJ)I bsm=su/catlean/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: goto 1ab
// 19d: sipush 7093
// 1a0: ldc2_w 285789565021638632
// 1a3: lload 7
// 1a5: lxor
// 1a6: invokedynamic p (IJ)I bsm=su/catlean/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: i2f
// 1ac: fadd
// 1ad: fstore 16
// 1af: iload 1
// 1b0: ifle 234
// 1b3: aload 11
// 1b5: ifnull 231
// 1b8: dload 14
// 1ba: dconst_0
// 1bb: dcmpg
// 1bc: goto 1ca
// 1bf: ldc2_w -6295426123802175170
// 1c2: lload 7
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 11
// 1cc: iload 1
// 1cd: ifle 23a
// 1d0: ifnonnull 238
// 1d3: ifge 231
// 1d6: goto 1e4
// 1d9: ldc2_w -6295426123802175170
// 1dc: lload 7
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: fload 16
// 1e6: dload 12
// 1e8: dconst_0
// 1e9: dcmpl
// 1ea: aload 11
// 1ec: ifnonnull 21c
// 1ef: goto 1fd
// 1f2: ldc2_w -6295426123802175170
// 1f5: lload 7
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: ifle 21f
// 200: goto 20e
// 203: ldc2_w -6295426123802175170
// 206: lload 7
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: sipush 16593
// 211: ldc2_w 5500780208773436553
// 214: lload 7
// 216: lxor
// 217: invokedynamic p (IJ)I bsm=su/catlean/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: goto 22d
// 21f: sipush 15995
// 222: ldc2_w 4123763436716780071
// 225: lload 7
// 227: lxor
// 228: invokedynamic p (IJ)I bsm=su/catlean/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: i2f
// 22e: fadd
// 22f: fstore 16
// 231: dconst_0
// 232: dstore 14
// 234: dload 12
// 236: dconst_0
// 237: dcmpl
// 238: aload 11
// 23a: ifnonnull 27f
// 23d: ifle 25a
// 240: goto 24e
// 243: ldc2_w -6295426123802175170
// 246: lload 7
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: dconst_1
// 24f: iload 2
// 250: ifge 293
// 253: dstore 12
// 255: aload 11
// 257: ifnull 287
// 25a: dload 12
// 25c: aload 11
// 25e: ifnonnull 293
// 261: goto 26f
// 264: ldc2_w -6295426123802175170
// 267: lload 7
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: dconst_0
// 270: dcmpg
// 271: goto 27f
// 274: ldc2_w -6295426123802175170
// 277: lload 7
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: ifge 287
// 282: ldc2_w -1.0
// 285: dstore 12
// 287: fload 16
// 289: ldc 90.0
// 28b: fadd
// 28c: f2d
// 28d: invokestatic java/lang/Math.toRadians (D)D
// 290: invokestatic java/lang/Math.sin (D)D
// 293: dstore 17
// 295: fload 16
// 297: ldc 90.0
// 299: fadd
// 29a: f2d
// 29b: invokestatic java/lang/Math.toRadians (D)D
// 29e: invokestatic java/lang/Math.cos (D)D
// 2a1: dstore 19
// 2a3: aload 3
// 2a4: dload 12
// 2a6: dload 5
// 2a8: dmul
// 2a9: dload 19
// 2ab: dmul
// 2ac: dload 14
// 2ae: dload 5
// 2b0: dmul
// 2b1: dload 17
// 2b3: dmul
// 2b4: dadd
// 2b5: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 2b8: aload 3
// 2b9: dload 12
// 2bb: dload 5
// 2bd: dmul
// 2be: dload 17
// 2c0: dmul
// 2c1: dload 14
// 2c3: dload 5
// 2c5: dmul
// 2c6: dload 19
// 2c8: dmul
// 2c9: dsub
// 2ca: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 2cd: return
}

public final float b(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: lload 2
// 006: bipush 32
// 008: lshl
// 009: bipush 32
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/dm.a J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 75623621086140
// 019: lxor
// 01a: lstore 6
// 01c: pop2
// 01d: ldc2_w -7512965496910289340
// 020: lload 4
// 022: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: astore 8
// 029: lload 6
// 02b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 031: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 034: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 037: aload 8
// 039: ifnonnull 06a
// 03c: ifeq 05c
// 03f: goto 04d
// 042: ldc2_w -7552222770818079059
// 045: lload 4
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: dconst_1
// 04e: goto 07f
// 051: ldc2_w -7552222770818079059
// 054: lload 4
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: lload 6
// 05e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 061: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 064: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 067: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 06a: ifeq 07e
// 06d: ldc2_w -1.0
// 070: goto 07f
// 073: ldc2_w -7552222770818079059
// 076: lload 4
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: dconst_0
// 07f: dstore 9
// 081: lload 6
// 083: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 086: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 089: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 08c: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 08f: lload 2
// 090: lconst_0
// 091: lcmp
// 092: ifle 0c8
// 095: aload 8
// 097: ifnonnull 0c8
// 09a: ifeq 0ba
// 09d: goto 0ab
// 0a0: ldc2_w -7552222770818079059
// 0a3: lload 4
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: dconst_1
// 0ac: goto 0dd
// 0af: ldc2_w -7552222770818079059
// 0b2: lload 4
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: lload 6
// 0bc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0bf: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0c2: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 0c5: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0c8: ifeq 0dc
// 0cb: ldc2_w -1.0
// 0ce: goto 0dd
// 0d1: ldc2_w -7552222770818079059
// 0d4: lload 4
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: dconst_0
// 0dd: dstore 11
// 0df: dload 11
// 0e1: dconst_0
// 0e2: dcmpl
// 0e3: aload 8
// 0e5: ifnonnull 12a
// 0e8: ifle 105
// 0eb: goto 0f9
// 0ee: ldc2_w -7552222770818079059
// 0f1: lload 4
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: dconst_1
// 0fa: dstore 11
// 0fc: iload 1
// 0fd: iflt 105
// 100: aload 8
// 102: ifnull 132
// 105: dload 11
// 107: aload 8
// 109: ifnonnull 130
// 10c: goto 11a
// 10f: ldc2_w -7552222770818079059
// 112: lload 4
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: dconst_0
// 11b: dcmpg
// 11c: goto 12a
// 11f: ldc2_w -7552222770818079059
// 122: lload 4
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: ifge 132
// 12d: ldc2_w -1.0
// 130: dstore 11
// 132: lload 6
// 134: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 137: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 13a: dup
// 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 13e: invokevirtual net/minecraft/class_746.method_36454 ()F
// 141: fstore 13
// 143: dload 9
// 145: dconst_0
// 146: dcmpg
// 147: aload 8
// 149: ifnonnull 15e
// 14c: ifne 161
// 14f: goto 15d
// 152: ldc2_w -7552222770818079059
// 155: lload 4
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: bipush 1
// 15e: goto 162
// 161: bipush 0
// 162: lload 2
// 163: lconst_0
// 164: lcmp
// 165: ifle 1b3
// 168: ifeq 1af
// 16b: dload 11
// 16d: dconst_0
// 16e: dcmpg
// 16f: aload 8
// 171: ifnonnull 194
// 174: goto 182
// 177: ldc2_w -7552222770818079059
// 17a: lload 4
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: ifne 197
// 185: goto 193
// 188: ldc2_w -7552222770818079059
// 18b: lload 4
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: bipush 1
// 194: goto 198
// 197: bipush 0
// 198: lload 2
// 199: lconst_0
// 19a: lcmp
// 19b: iflt 1b3
// 19e: ifeq 1af
// 1a1: fload 13
// 1a3: freturn
// 1a4: ldc2_w -7552222770818079059
// 1a7: lload 4
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: dload 9
// 1b1: dconst_0
// 1b2: dcmpg
// 1b3: aload 8
// 1b5: ifnonnull 1ca
// 1b8: ifne 1cd
// 1bb: goto 1c9
// 1be: ldc2_w -7552222770818079059
// 1c1: lload 4
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: bipush 1
// 1ca: goto 1ce
// 1cd: bipush 0
// 1ce: iload 1
// 1cf: iflt 1d9
// 1d2: ifne 2cc
// 1d5: dload 11
// 1d7: dconst_0
// 1d8: dcmpl
// 1d9: aload 8
// 1db: lload 2
// 1dc: lconst_0
// 1dd: lcmp
// 1de: ifle 24e
// 1e1: ifnonnull 24c
// 1e4: goto 1f2
// 1e7: ldc2_w -7552222770818079059
// 1ea: lload 4
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: lload 2
// 1f3: lconst_0
// 1f4: lcmp
// 1f5: ifle 23e
// 1f8: ifle 23a
// 1fb: goto 209
// 1fe: ldc2_w -7552222770818079059
// 201: lload 4
// 203: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 208: athrow
// 209: fload 13
// 20b: dload 9
// 20d: dconst_0
// 20e: dcmpl
// 20f: ifle 230
// 212: goto 220
// 215: ldc2_w -7552222770818079059
// 218: lload 4
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: ldc -45.0
// 222: goto 232
// 225: ldc2_w -7552222770818079059
// 228: lload 4
// 22a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: athrow
// 230: ldc -135.0
// 232: fadd
// 233: fstore 13
// 235: aload 8
// 237: ifnull 2cc
// 23a: dload 11
// 23c: dconst_0
// 23d: dcmpg
// 23e: goto 24c
// 241: ldc2_w -7552222770818079059
// 244: lload 4
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: aload 8
// 24e: iload 1
// 24f: ifle 2ab
// 252: ifnonnull 2a9
// 255: ifge 297
// 258: goto 266
// 25b: ldc2_w -7552222770818079059
// 25e: lload 4
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: fload 13
// 268: dload 9
// 26a: dconst_0
// 26b: dcmpl
// 26c: ifle 28d
// 26f: goto 27d
// 272: ldc2_w -7552222770818079059
// 275: lload 4
// 277: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: athrow
// 27d: ldc 45.0
// 27f: goto 28f
// 282: ldc2_w -7552222770818079059
// 285: lload 4
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: ldc 135.0
// 28f: fadd
// 290: fstore 13
// 292: aload 8
// 294: ifnull 2cc
// 297: dload 9
// 299: dconst_0
// 29a: dcmpg
// 29b: goto 2a9
// 29e: ldc2_w -7552222770818079059
// 2a1: lload 4
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: athrow
// 2a9: aload 8
// 2ab: lload 2
// 2ac: lconst_0
// 2ad: lcmp
// 2ae: ifle 2d2
// 2b1: ifnonnull 2d0
// 2b4: ifge 2cc
// 2b7: goto 2c5
// 2ba: ldc2_w -7552222770818079059
// 2bd: lload 4
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: fload 13
// 2c7: ldc 180.0
// 2c9: fadd
// 2ca: fstore 13
// 2cc: dload 9
// 2ce: dconst_0
// 2cf: dcmpg
// 2d0: aload 8
// 2d2: ifnonnull 2e7
// 2d5: ifne 2ea
// 2d8: goto 2e6
// 2db: ldc2_w -7552222770818079059
// 2de: lload 4
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: bipush 1
// 2e7: goto 2eb
// 2ea: bipush 0
// 2eb: lload 2
// 2ec: lconst_0
// 2ed: lcmp
// 2ee: ifle 2f8
// 2f1: ifeq 322
// 2f4: dload 11
// 2f6: dconst_0
// 2f7: dcmpl
// 2f8: ifle 31b
// 2fb: goto 309
// 2fe: ldc2_w -7552222770818079059
// 301: lload 4
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: fload 13
// 30b: ldc 90.0
// 30d: fsub
// 30e: lload 2
// 30f: lconst_0
// 310: lcmp
// 311: iflt 324
// 314: fstore 13
// 316: aload 8
// 318: ifnull 322
// 31b: fload 13
// 31d: ldc 90.0
// 31f: fadd
// 320: fstore 13
// 322: fload 13
// 324: freturn
}

@NotNull
public final double[] H(char a, short a, double d, int a) {
long var6 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var8 = var6 ^ 105006746069620L;
class_746 var10000 = zf.F(var8).field_1724;
Intrinsics.checkNotNull(var10000);
float var10 = var10000.method_36454();
double var11 = dx * Math.cos(Math.toRadians(var10 + 90.0F));
double var13 = dx * Math.sin(Math.toRadians(var10 + 90.0F));
return new double[]{var11, var13};
}

@Nullable
public final class_1297 N(float yaw, float pitch, long a, float distance, boolean ignoreWalls, boolean onlyLiving) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 26870522113002
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 53460783544142
// 012: lxor
// 013: lstore 10
// 015: dup2
// 016: ldc2_w 36840800009562
// 019: lxor
// 01a: lstore 12
// 01c: pop2
// 01d: ldc2_w -1189847173365424508
// 020: lload 3
// 021: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: astore 14
// 028: iload 6
// 02a: ifeq 03b
// 02d: aconst_null
// 02e: goto 045
// 031: ldc2_w -1157046304817422739
// 034: lload 3
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: aload 0
// 03c: fload 5
// 03e: fload 1
// 03f: lload 10
// 041: fload 2
// 042: invokevirtual su/catlean/dm.r (FFJF)Lnet/minecraft/class_239;
// 045: astore 15
// 047: lload 12
// 049: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04c: lload 8
// 04e: dup2_x1
// 04f: pop2
// 050: checkcast net/minecraft/class_1297
// 053: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 056: dconst_0
// 057: lload 12
// 059: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05c: lload 12
// 05e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 061: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 064: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 067: f2d
// 068: dconst_0
// 069: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 06c: dup
// 06d: sipush 18236
// 070: ldc2_w 2488127476830070274
// 073: lload 3
// 074: lxor
// 075: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 07d: astore 16
// 07f: fload 5
// 081: f2d
// 082: bipush 2
// 083: i2d
// 084: invokestatic java/lang/Math.pow (DD)D
// 087: d2f
// 088: f2d
// 089: dstore 17
// 08b: aload 15
// 08d: aload 14
// 08f: ifnonnull 0a4
// 092: ifnull 0ae
// 095: goto 0a2
// 098: ldc2_w -1157046304817422739
// 09b: lload 3
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aload 15
// 0a4: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 0a7: aload 16
// 0a9: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0ac: dstore 17
// 0ae: aload 0
// 0af: fload 2
// 0b0: fload 1
// 0b1: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 0b4: astore 19
// 0b6: aload 16
// 0b8: aload 19
// 0ba: getfield net/minecraft/class_243.field_1352 D
// 0bd: fload 5
// 0bf: f2d
// 0c0: dmul
// 0c1: aload 19
// 0c3: getfield net/minecraft/class_243.field_1351 D
// 0c6: fload 5
// 0c8: f2d
// 0c9: dmul
// 0ca: aload 19
// 0cc: getfield net/minecraft/class_243.field_1350 D
// 0cf: fload 5
// 0d1: f2d
// 0d2: dmul
// 0d3: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0d6: dup
// 0d7: sipush 9058
// 0da: ldc2_w 1726623941813568083
// 0dd: lload 3
// 0de: lxor
// 0df: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e7: astore 20
// 0e9: lload 12
// 0eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ee: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 0f1: aload 19
// 0f3: fload 5
// 0f5: f2d
// 0f6: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 0f9: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
// 0fc: dconst_1
// 0fd: dconst_1
// 0fe: dconst_1
// 0ff: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 102: dup
// 103: sipush 24193
// 106: ldc2_w 260100016325885873
// 109: lload 3
// 10a: lxor
// 10b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 113: astore 21
// 115: lload 12
// 117: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11a: checkcast net/minecraft/class_1297
// 11d: aload 16
// 11f: aload 20
// 121: aload 21
// 123: iload 7
// 125: invokedynamic test (Z)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/dm.k (ZLnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
// 12a: dload 17
// 12c: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
// 12f: astore 22
// 131: aload 22
// 133: ifnull 175
// 136: aload 16
// 138: aload 22
// 13a: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
// 13d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 140: dload 17
// 142: dcmpg
// 143: iflt 165
// 146: goto 153
// 149: ldc2_w -1157046304817422739
// 14c: lload 3
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: aload 15
// 155: ifnonnull 175
// 158: goto 165
// 15b: ldc2_w -1157046304817422739
// 15e: lload 3
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: aload 22
// 167: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 16a: areturn
// 16b: ldc2_w -1157046304817422739
// 16e: lload 3
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: aconst_null
// 176: areturn
}

public static class_1297 y(dm var0, float var1, float var2, float var3, boolean var4, boolean var5, int var6, Object var7, long var8) {
var8 = a ^ var8;
long var10 = var8 ^ 55974029079886L;
_g[] var12 = vm.a<"Å">(-7996435573859917570L, var8);

int var10000;
label20: {
try {
var10000 = var6 & b<"p">(9672, 8317204683013441727L ^ var8);
if (var12 != null) {
break label20;
}

if (var10000 == 0) {
return var0.N(var1, var2, var10, var3, var4, (boolean)var5);
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -7959130482914320361L, var8);
}

var10000 = 1;
}

var5 = var10000;
return var0.N(var1, var2, var10, var3, var4, (boolean)var5);
}

@NotNull
public final class_239 p(float yaw, float pitch, double x, double y, double z, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: lload 9
// 005: lxor
// 006: lstore 9
// 008: lload 9
// 00a: dup2
// 00b: ldc2_w 9568005233453
// 00e: lxor
// 00f: dup2
// 010: bipush 56
// 012: lushr
// 013: l2i
// 014: istore 11
// 016: dup2
// 017: bipush 8
// 019: lshl
// 01a: bipush 32
// 01c: lushr
// 01d: l2i
// 01e: istore 12
// 020: dup2
// 021: bipush 40
// 023: lshl
// 024: bipush 40
// 026: lushr
// 027: l2i
// 028: istore 13
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 63321225681771
// 02f: lxor
// 030: lstore 14
// 032: pop2
// 033: ldc2_w 670412210356943029
// 036: lload 9
// 038: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: aload 0
// 03e: ldc 5.0
// 040: fload 1
// 041: fload 2
// 042: dload 3
// 043: d2f
// 044: dload 5
// 046: d2f
// 047: iload 11
// 049: i2b
// 04a: swap
// 04b: iload 12
// 04d: swap
// 04e: iload 13
// 050: swap
// 051: dload 7
// 053: d2f
// 054: invokespecial su/catlean/dm.b (FFFFBIIFF)Lnet/minecraft/class_239;
// 057: astore 17
// 059: new net/minecraft/class_243
// 05c: dup
// 05d: dload 3
// 05e: dload 5
// 060: dload 7
// 062: invokespecial net/minecraft/class_243.<init> (DDD)V
// 065: dconst_0
// 066: lload 14
// 068: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06b: lload 14
// 06d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 070: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 073: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 076: f2d
// 077: dconst_0
// 078: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 07b: dup
// 07c: sipush 9058
// 07f: ldc2_w 1726615082724385890
// 082: lload 9
// 084: lxor
// 085: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: astore 18
// 08f: ldc2_w 25.0
// 092: dstore 19
// 094: astore 16
// 096: aload 17
// 098: aload 16
// 09a: ifnonnull 0c4
// 09d: invokevirtual net/minecraft/class_239.method_17783 ()Lnet/minecraft/class_239$class_240;
// 0a0: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 0a3: if_acmpeq 0ce
// 0a6: goto 0b4
// 0a9: ldc2_w 702632540519282780
// 0ac: lload 9
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: aload 17
// 0b6: goto 0c4
// 0b9: ldc2_w 702632540519282780
// 0bc: lload 9
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 0c7: aload 18
// 0c9: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0cc: dstore 19
// 0ce: aload 0
// 0cf: fload 2
// 0d0: fload 1
// 0d1: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 0d4: astore 21
// 0d6: aload 18
// 0d8: aload 21
// 0da: getfield net/minecraft/class_243.field_1352 D
// 0dd: bipush 5
// 0de: i2d
// 0df: dmul
// 0e0: aload 21
// 0e2: getfield net/minecraft/class_243.field_1351 D
// 0e5: bipush 5
// 0e6: i2d
// 0e7: dmul
// 0e8: aload 21
// 0ea: getfield net/minecraft/class_243.field_1350 D
// 0ed: bipush 5
// 0ee: i2d
// 0ef: dmul
// 0f0: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0f3: dup
// 0f4: sipush 9058
// 0f7: ldc2_w 1726615082724385890
// 0fa: lload 9
// 0fc: lxor
// 0fd: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 105: astore 22
// 107: new net/minecraft/class_238
// 10a: dup
// 10b: dload 3
// 10c: ldc2_w 0.3
// 10f: dsub
// 110: dload 5
// 112: dload 7
// 114: ldc2_w 0.3
// 117: dsub
// 118: dload 3
// 119: ldc2_w 0.3
// 11c: dadd
// 11d: dload 5
// 11f: ldc2_w 1.8
// 122: dadd
// 123: dload 7
// 125: ldc2_w 0.3
// 128: dadd
// 129: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 12c: aload 21
// 12e: ldc2_w 5.0
// 131: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 134: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
// 137: dconst_1
// 138: dconst_1
// 139: dconst_1
// 13a: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 13d: dup
// 13e: sipush 4602
// 141: ldc2_w 6352844861604976358
// 144: lload 9
// 146: lxor
// 147: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14f: astore 23
// 151: lload 14
// 153: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 156: checkcast net/minecraft/class_1297
// 159: aload 18
// 15b: aload 22
// 15d: aload 23
// 15f: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/dm.I (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
// 164: dload 19
// 166: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
// 169: astore 24
// 16b: aload 24
// 16d: aload 16
// 16f: ifnonnull 23c
// 172: ifnull 23a
// 175: goto 183
// 178: ldc2_w 702632540519282780
// 17b: lload 9
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: aload 24
// 185: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 188: dup
// 189: sipush 7776
// 18c: ldc2_w 3661648911072319861
// 18f: lload 9
// 191: lxor
// 192: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19a: astore 25
// 19c: aload 24
// 19e: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
// 1a1: dup
// 1a2: sipush 15556
// 1a5: ldc2_w 2027789817069370311
// 1a8: lload 9
// 1aa: lxor
// 1ab: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b3: astore 26
// 1b5: aload 18
// 1b7: aload 26
// 1b9: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 1bc: dstore 27
// 1be: dload 27
// 1c0: dload 19
// 1c2: dcmpg
// 1c3: lload 9
// 1c5: lconst_0
// 1c6: lcmp
// 1c7: ifle 226
// 1ca: aload 16
// 1cc: ifnonnull 226
// 1cf: iflt 213
// 1d2: goto 1e0
// 1d5: ldc2_w 702632540519282780
// 1d8: lload 9
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: aload 17
// 1e2: aload 16
// 1e4: lload 9
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: ifle 23e
// 1eb: ifnonnull 23c
// 1ee: goto 1fc
// 1f1: ldc2_w 702632540519282780
// 1f4: lload 9
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: invokevirtual net/minecraft/class_239.method_17783 ()Lnet/minecraft/class_239$class_240;
// 1ff: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 202: if_acmpne 23a
// 205: goto 213
// 208: ldc2_w 702632540519282780
// 20b: lload 9
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: aload 25
// 215: instanceof net/minecraft/class_1309
// 218: goto 226
// 21b: ldc2_w 702632540519282780
// 21e: lload 9
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: ifeq 23a
// 229: aload 24
// 22b: checkcast net/minecraft/class_239
// 22e: areturn
// 22f: ldc2_w 702632540519282780
// 232: lload 9
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: aload 17
// 23c: aload 16
// 23e: lload 9
// 240: lconst_0
// 241: lcmp
// 242: iflt 24c
// 245: ifnull 264
// 248: bipush 1
// 249: anewarray 1017
// 24c: ldc2_w 658566660248699678
// 24f: lload 9
// 251: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: goto 264
// 259: ldc2_w 702632540519282780
// 25c: lload 9
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: areturn
}

@NotNull
public final class_243 y(float yaw, float pitch) {
return new class_243(
(float)Math.sin(-pitch * (float) (Math.PI / 180.0)) * (float)Math.cos(yaw * (float) (Math.PI / 180.0)),
-((float)Math.sin(yaw * (float) (Math.PI / 180.0))),
(float)Math.cos(-pitch * (float) (Math.PI / 180.0)) * (float)Math.cos(yaw * (float) (Math.PI / 180.0))
);
}

@NotNull
public final class_239 r(float dst, float yaw, long a, float pitch) {
ax = a ^ ax;
long var6 = ax ^ 6164145897351L;
long var8 = ax ^ 8298909974816L;
class_243 var10000 = zf.v(var8).method_5836(1.0F);
Intrinsics.checkNotNullExpressionValue(var10000, a<"x">(13627, 2300074394705225834L ^ ax));
class_243 var10 = var10000;
class_243 var11 = this.y(pitch, yaw);
var10000 = var10.method_1031(var11.field_1352 * dst, var11.field_1351 * dst, var11.field_1350 * dst);
Intrinsics.checkNotNullExpressionValue(var10000, a<"x">(9058, 1726591001405128233L ^ ax));
class_243 var12 = var10000;
class_3965 var15 = zf.z(var6).method_17742(new class_3959(var10, var12, class_3960.field_17559, class_242.field_1348, (class_1297)zf.v(var8)));
Intrinsics.checkNotNullExpressionValue(var15, a<"x">(16076, 7827038894946476928L ^ ax));
return (class_239)var15;
}

private final class_239 b(float var1, float var2, float var3, float var4, byte var5, int var6, int var7, float var8, float var9) {
long var10 = ((long)var5 << 56 | (long)var6 << 32 >>> 8 | (long)var7 << 40 >>> 40) ^ a;
long var12 = var10 ^ 41375312819669L;
long var14 = var10 ^ 43664768207730L;
class_243 var16 = new class_243(var4, var8, var9);
class_243 var17 = this.y(var3, var2);
class_243 var10000 = var16.method_1031(var17.field_1352 * var1, var17.field_1351 * var1, var17.field_1350 * var1);
Intrinsics.checkNotNullExpressionValue(var10000, a<"x">(9058, 1726626212572836987L ^ var10));
class_243 var18 = var10000;
class_3965 var19 = zf.z(var12).method_17742(new class_3959(var16, var18, class_3960.field_17559, class_242.field_1348, (class_1297)zf.v(var14)));
Intrinsics.checkNotNullExpressionValue(var19, a<"x">(4200, 4779945619934512994L ^ var10));
return (class_239)var19;
}

public final double a(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 133008104238515
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 97160036623253
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w -1030293450689806261
// 018: lload 1
// 019: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: bipush 0
// 01f: istore 8
// 021: astore 7
// 023: ldc2_w 0.2873
// 026: dstore 9
// 028: lload 3
// 029: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 02f: aload 7
// 031: ifnonnull 055
// 034: ifnonnull 050
// 037: goto 044
// 03a: ldc2_w -1063375798509387614
// 03d: lload 1
// 03e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: athrow
// 044: dconst_0
// 045: dreturn
// 046: ldc2_w -1063375798509387614
// 049: lload 1
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: lload 5
// 052: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 055: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 058: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 05b: aload 7
// 05d: lload 1
// 05e: lconst_0
// 05f: lcmp
// 060: ifle 0a7
// 063: ifnonnull 0a5
// 066: ifeq 09a
// 069: goto 076
// 06c: ldc2_w -1063375798509387614
// 06f: lload 1
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: lload 5
// 078: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07b: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 07e: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 081: dup
// 082: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 085: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 088: istore 8
// 08a: dload 9
// 08c: dconst_1
// 08d: ldc2_w 0.2
// 090: iload 8
// 092: bipush 1
// 093: iadd
// 094: i2d
// 095: dmul
// 096: dadd
// 097: dmul
// 098: dstore 9
// 09a: lload 5
// 09c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09f: getstatic net/minecraft/class_1294.field_5913 Lnet/minecraft/class_6880;
// 0a2: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 0a5: aload 7
// 0a7: lload 1
// 0a8: lconst_0
// 0a9: lcmp
// 0aa: ifle 0f1
// 0ad: ifnonnull 0ef
// 0b0: ifeq 0e4
// 0b3: goto 0c0
// 0b6: ldc2_w -1063375798509387614
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: lload 5
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: getstatic net/minecraft/class_1294.field_5913 Lnet/minecraft/class_6880;
// 0c8: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 0cb: dup
// 0cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0cf: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 0d2: istore 8
// 0d4: dload 9
// 0d6: dconst_1
// 0d7: ldc2_w 0.2
// 0da: iload 8
// 0dc: bipush 1
// 0dd: iadd
// 0de: i2d
// 0df: dmul
// 0e0: dadd
// 0e1: ddiv
// 0e2: dstore 9
// 0e4: lload 5
// 0e6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e9: getstatic net/minecraft/class_1294.field_5909 Lnet/minecraft/class_6880;
// 0ec: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 0ef: aload 7
// 0f1: ifnonnull 123
// 0f4: ifeq 135
// 0f7: goto 104
// 0fa: ldc2_w -1063375798509387614
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: lload 5
// 106: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 109: getstatic net/minecraft/class_1294.field_5909 Lnet/minecraft/class_6880;
// 10c: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 10f: dup
// 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 113: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 116: goto 123
// 119: ldc2_w -1063375798509387614
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: istore 8
// 125: dload 9
// 127: dconst_1
// 128: ldc2_w 0.2
// 12b: iload 8
// 12d: bipush 1
// 12e: iadd
// 12f: i2d
// 130: dmul
// 131: dadd
// 132: ddiv
// 133: dstore 9
// 135: dload 9
// 137: dreturn
}

public final double n(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 48748507381691
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -1324659056359105435
// 11: lload 1
// 12: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: ldc2_w 0.3999999463558197
// 1a: dstore 6
// 1c: astore 5
// 1e: lload 3
// 1f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22: getstatic net/minecraft/class_1294.field_5913 Lnet/minecraft/class_6880;
// 25: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 28: aload 5
// 2a: ifnonnull 5b
// 2d: ifeq 6b
// 30: goto 3d
// 33: ldc2_w -1364496869654864756
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: lload 3
// 3e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 41: getstatic net/minecraft/class_1294.field_5913 Lnet/minecraft/class_6880;
// 44: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 47: dup
// 48: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4b: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 4e: goto 5b
// 51: ldc2_w -1364496869654864756
// 54: lload 1
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: i2d
// 5c: dstore 8
// 5e: dload 6
// 60: dload 8
// 62: dconst_1
// 63: dadd
// 64: ldc2_w 0.1
// 67: dmul
// 68: dadd
// 69: dstore 6
// 6b: dload 6
// 6d: dreturn
}

public final float Y(long a, @NotNull class_1799 stack, char a) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(stack, a<"x">(25189, 6588134762159985949L ^ var5));
return (float)(stack.method_7936() - stack.method_7919()) / stack.method_7936() * 100.0F;
}

public final float z(short a, char a, int a, @NotNull class_243 targetPos) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var7 = var5 ^ 19083956094594L;
Intrinsics.checkNotNullParameter(targetPos, a<"x">(25641, 3475958471925826006L ^ var5));
return (float)Math.sqrt(this.R(var7, targetPos));
}

public final float R(long a, @NotNull class_243 targetPos) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 70686247303682
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 125552787407374
// 12: lxor
// 13: dup2
// 14: bipush 48
// 16: lushr
// 17: l2i
// 18: istore 6
// 1a: dup2
// 1b: bipush 16
// 1d: lshl
// 1e: bipush 32
// 20: lushr
// 21: l2i
// 22: istore 7
// 24: dup2
// 25: bipush 48
// 27: lshl
// 28: bipush 48
// 2a: lushr
// 2b: l2i
// 2c: istore 8
// 2e: pop2
// 2f: dup2
// 30: ldc2_w 106568425092132
// 33: lxor
// 34: lstore 9
// 36: pop2
// 37: ldc2_w -1872774923955595270
// 3a: lload 1
// 3b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: astore 11
// 42: aload 3
// 43: aload 11
// 45: ifnonnull 95
// 48: sipush 28955
// 4b: ldc2_w 4084409891415021890
// 4e: lload 1
// 4f: lxor
// 50: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 58: lload 4
// 5a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 60: ifnonnull 7c
// 63: goto 70
// 66: ldc2_w -1833218031250122989
// 69: lload 1
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: fconst_0
// 71: freturn
// 72: ldc2_w -1833218031250122989
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 7f: lload 9
// 81: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 84: iload 6
// 86: i2s
// 87: swap
// 88: iload 7
// 8a: swap
// 8b: iload 8
// 8d: i2c
// 8e: swap
// 8f: checkcast net/minecraft/class_1297
// 92: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 95: astore 12
// 97: aload 3
// 98: getfield net/minecraft/class_243.field_1352 D
// 9b: aload 12
// 9d: getfield net/minecraft/class_243.field_1352 D
// a0: dsub
// a1: dstore 13
// a3: aload 3
// a4: getfield net/minecraft/class_243.field_1351 D
// a7: aload 12
// a9: getfield net/minecraft/class_243.field_1351 D
// ac: dsub
// ad: dstore 15
// af: aload 3
// b0: getfield net/minecraft/class_243.field_1350 D
// b3: aload 12
// b5: getfield net/minecraft/class_243.field_1350 D
// b8: dsub
// b9: dstore 17
// bb: dload 13
// bd: dload 13
// bf: dmul
// c0: dload 15
// c2: dload 15
// c4: dmul
// c5: dadd
// c6: dload 17
// c8: dload 17
// ca: dmul
// cb: dadd
// cc: d2f
// cd: freturn
}

public final boolean v(long a, @NotNull class_243 pos, int fov) {
ax = a ^ ax;
long var5 = ax ^ 36948538128910L;
_g[] var10000 = vm.a<"Å">(-6480977890936989706L, ax);
Intrinsics.checkNotNullParameter(pos, a<"x">(20978, 1986761339123579305L ^ ax));
_g[] var7 = var10000;
double var8 = pos.method_10216() - zf.F(var5).field_1773.method_19418().method_71156().field_1352;
double var10 = pos.method_10215() - zf.F(var5).field_1773.method_19418().method_71156().field_1350;
float var12 = class_3532.method_15393(
(float)class_3532.method_15338(Math.toDegrees(Math.atan2(var10, var8)) - 90.0) - class_3532.method_15393(zf.F(var5).field_1773.method_19418().method_19330())
);

try {
double var16;
int var15 = (var16 = Math.abs((double)var12) - fov) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
if (var7 != null) {
return (boolean)var15;
}

if (var15 <= 0) {
return (boolean)1;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -6448178046671612129L, ax);
}

return (boolean)0;
}

public final boolean k(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 125325761828590
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 89464776284360
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 787743539272678166
// 18: lload 1
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 3
// 21: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 27: aload 7
// 29: ifnonnull 4d
// 2c: ifnonnull 48
// 2f: goto 3c
// 32: ldc2_w 748486336835763199
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: bipush 0
// 3d: ireturn
// 3e: ldc2_w 748486336835763199
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: lload 5
// 4a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4d: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 50: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 53: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 56: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 5b: aload 7
// 5d: ifnonnull c0
// 60: ifne ab
// 63: goto 70
// 66: ldc2_w 748486336835763199
// 69: lload 1
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: lload 5
// 72: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 75: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 78: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 7b: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 7e: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 83: aload 7
// 85: lload 1
// 86: lconst_0
// 87: lcmp
// 88: ifle c2
// 8b: ifnonnull c0
// 8e: goto 9b
// 91: ldc2_w 748486336835763199
// 94: lload 1
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: ifeq d9
// 9e: goto ab
// a1: ldc2_w 748486336835763199
// a4: lload 1
// a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa: athrow
// ab: lload 5
// ad: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// b0: invokevirtual net/minecraft/class_746.method_6115 ()Z
// b3: goto c0
// b6: ldc2_w 748486336835763199
// b9: lload 1
// ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bf: athrow
// c0: aload 7
// c2: ifnonnull d6
// c5: ifeq d9
// c8: goto d5
// cb: ldc2_w 748486336835763199
// ce: lload 1
// cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d4: athrow
// d5: bipush 1
// d6: goto da
// d9: bipush 0
// da: ireturn
}

@Nullable
public final class_243 J(float yaw, float pitch, float distance, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 16943809744865
// 00e: lxor
// 00f: lstore 6
// 011: dup2
// 012: ldc2_w 24453083043703
// 015: lxor
// 016: lstore 8
// 018: dup2
// 019: ldc2_w 52555374969287
// 01c: lxor
// 01d: lstore 10
// 01f: pop2
// 020: ldc2_w 1432670256319816217
// 023: lload 4
// 025: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02a: lload 6
// 02c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 032: dup
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 036: checkcast net/minecraft/class_1297
// 039: lload 8
// 03b: dup2_x1
// 03c: pop2
// 03d: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 040: dconst_0
// 041: lload 10
// 043: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 046: lload 10
// 048: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04b: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 04e: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 051: f2d
// 052: dconst_0
// 053: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 056: dup
// 057: sipush 9058
// 05a: ldc2_w 1726634708663762638
// 05d: lload 4
// 05f: lxor
// 060: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 068: astore 13
// 06a: fload 3
// 06b: f2d
// 06c: fconst_2
// 06d: f2d
// 06e: invokestatic java/lang/Math.pow (DD)D
// 071: d2f
// 072: fstore 14
// 074: aload 0
// 075: fload 2
// 076: fload 1
// 077: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 07a: astore 15
// 07c: aload 13
// 07e: aload 15
// 080: getfield net/minecraft/class_243.field_1352 D
// 083: fload 3
// 084: f2d
// 085: dmul
// 086: aload 15
// 088: getfield net/minecraft/class_243.field_1351 D
// 08b: fload 3
// 08c: f2d
// 08d: dmul
// 08e: aload 15
// 090: getfield net/minecraft/class_243.field_1350 D
// 093: fload 3
// 094: f2d
// 095: dmul
// 096: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 099: dup
// 09a: sipush 9058
// 09d: ldc2_w 1726634708663762638
// 0a0: lload 4
// 0a2: lxor
// 0a3: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ab: astore 16
// 0ad: lload 10
// 0af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b2: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 0b5: aload 15
// 0b7: fload 3
// 0b8: f2d
// 0b9: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 0bc: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
// 0bf: dconst_1
// 0c0: dconst_1
// 0c1: dconst_1
// 0c2: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 0c5: dup
// 0c6: sipush 4602
// 0c9: ldc2_w 6352820842224438346
// 0cc: lload 4
// 0ce: lxor
// 0cf: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d7: astore 17
// 0d9: astore 12
// 0db: lload 10
// 0dd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e0: checkcast net/minecraft/class_1297
// 0e3: aload 13
// 0e5: aload 16
// 0e7: aload 17
// 0e9: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/dm.p (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
// 0ee: fload 14
// 0f0: f2d
// 0f1: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
// 0f4: astore 18
// 0f6: aload 12
// 0f8: ifnonnull 121
// 0fb: aload 18
// 0fd: dup
// 0fe: ifnull 120
// 101: goto 10f
// 104: ldc2_w 1399589006401151728
// 107: lload 4
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
// 112: goto 122
// 115: ldc2_w 1399589006401151728
// 118: lload 4
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: pop
// 121: aconst_null
// 122: areturn
}

public final float e(int a, double x, byte a, int a, double z) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 4
// 07: i2l
// 08: bipush 56
// 0a: lshl
// 0b: bipush 32
// 0d: lushr
// 0e: lor
// 0f: iload 5
// 11: i2l
// 12: bipush 40
// 14: lshl
// 15: bipush 40
// 17: lushr
// 18: lor
// 19: getstatic su/catlean/dm.a J
// 1c: lxor
// 1d: lstore 8
// 1f: lload 8
// 21: dup2
// 22: ldc2_w 17388817031171
// 25: lxor
// 26: lstore 10
// 28: dup2
// 29: ldc2_w 52180362276389
// 2c: lxor
// 2d: lstore 12
// 2f: pop2
// 30: ldc2_w -287141068230357509
// 33: lload 8
// 35: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: astore 14
// 3c: lload 10
// 3e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 44: aload 14
// 46: ifnonnull 6c
// 49: ifnonnull 67
// 4c: goto 5a
// 4f: ldc2_w -248165887845806830
// 52: lload 8
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: fconst_0
// 5b: freturn
// 5c: ldc2_w -248165887845806830
// 5f: lload 8
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: lload 12
// 69: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6c: invokevirtual net/minecraft/class_746.method_23317 ()D
// 6f: dload 2
// 70: dsub
// 71: dstore 15
// 73: lload 12
// 75: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 78: invokevirtual net/minecraft/class_746.method_23321 ()D
// 7b: dload 6
// 7d: dsub
// 7e: dstore 17
// 80: dload 15
// 82: dload 15
// 84: dmul
// 85: dload 17
// 87: dload 17
// 89: dmul
// 8a: dadd
// 8b: d2f
// 8c: freturn
}

public final float r(int a, int a, double x, int a, double z) {
long var8 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var8 ^ 55979578331739L;
int var10 = (int)((var8 ^ 55979578331739L) >>> 32);
int var11 = (int)((var8 ^ 55979578331739L) << 32 >>> 56);
int var12 = (int)(var10001 << 40 >>> 40);
return (float)Math.sqrt(this.e(var10, x, (byte)var11, var12, zx));
}

public final void f(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 57461778194438
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 124937412257698
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 8468034401485358204
// 18: lload 1
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: aload 7
// 22: ifnonnull 6a
// 25: getstatic su/catlean/dm.Q Z
// 28: ifeq 73
// 2b: goto 38
// 2e: ldc2_w 8433281281796752533
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: lload 3
// 39: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 3c: new net/minecraft/class_2848
// 3f: dup
// 40: lload 5
// 42: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 45: checkcast net/minecraft/class_1297
// 48: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 4b: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 4e: checkcast net/minecraft/class_2596
// 51: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
// 54: lload 5
// 56: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 59: bipush 0
// 5a: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 5d: goto 6a
// 60: ldc2_w 8433281281796752533
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: lload 5
// 6c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6f: bipush 0
// 70: putfield net/minecraft/class_746.field_3919 Z
// 73: return
}

@NotNull
public final class_239 l(double blockInteractionRange, double entityInteractionRange, float yaw, long a, float pitch) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dm.a J
// 003: lload 6
// 005: lxor
// 006: lstore 6
// 008: lload 6
// 00a: dup2
// 00b: ldc2_w 70780965341201
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 19694386481230
// 015: lxor
// 016: dup2
// 017: bipush 16
// 019: lushr
// 01a: lstore 11
// 01c: dup2
// 01d: bipush 48
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 13
// 026: pop2
// 027: dup2
// 028: ldc2_w 114155459145955
// 02b: lxor
// 02c: lstore 14
// 02e: pop2
// 02f: dload 1
// 030: dload 3
// 031: invokestatic java/lang/Math.max (DD)D
// 034: dstore 17
// 036: dload 17
// 038: invokestatic net/minecraft/class_3532.method_33723 (D)D
// 03b: dstore 19
// 03d: lload 14
// 03f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 042: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 045: dup
// 046: sipush 4623
// 049: ldc2_w 400838977530527383
// 04c: lload 6
// 04e: lxor
// 04f: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 057: astore 21
// 059: ldc2_w -6717798206851886275
// 05c: lload 6
// 05e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: aload 0
// 064: dload 1
// 065: lload 9
// 067: fload 5
// 069: fload 8
// 06b: invokevirtual su/catlean/dm.x (DJFF)Lnet/minecraft/class_239;
// 06e: astore 22
// 070: astore 16
// 072: aload 22
// 074: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 077: aload 21
// 079: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 07c: dstore 23
// 07e: aload 16
// 080: ifnonnull 0a0
// 083: aload 22
// 085: invokevirtual net/minecraft/class_239.method_17783 ()Lnet/minecraft/class_239$class_240;
// 088: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 08b: if_acmpeq 0a7
// 08e: goto 09c
// 091: ldc2_w -6753113731033033772
// 094: lload 6
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: dload 23
// 09e: dstore 19
// 0a0: dload 23
// 0a2: invokestatic java/lang/Math.sqrt (D)D
// 0a5: dstore 17
// 0a7: aload 0
// 0a8: fload 8
// 0aa: fload 5
// 0ac: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 0af: astore 25
// 0b1: aload 21
// 0b3: aload 25
// 0b5: getfield net/minecraft/class_243.field_1352 D
// 0b8: dload 17
// 0ba: dmul
// 0bb: aload 25
// 0bd: getfield net/minecraft/class_243.field_1351 D
// 0c0: dload 17
// 0c2: dmul
// 0c3: aload 25
// 0c5: getfield net/minecraft/class_243.field_1350 D
// 0c8: dload 17
// 0ca: dmul
// 0cb: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0ce: dup
// 0cf: sipush 9058
// 0d2: ldc2_w 1726696154049073130
// 0d5: lload 6
// 0d7: lxor
// 0d8: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e0: astore 26
// 0e2: lload 14
// 0e4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e7: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 0ea: aload 25
// 0ec: dload 17
// 0ee: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 0f1: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
// 0f4: dconst_1
// 0f5: dconst_1
// 0f6: dconst_1
// 0f7: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 0fa: dup
// 0fb: sipush 4602
// 0fe: ldc2_w 6352759364584996206
// 101: lload 6
// 103: lxor
// 104: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10c: astore 27
// 10e: lload 14
// 110: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 113: checkcast net/minecraft/class_1297
// 116: aload 21
// 118: aload 26
// 11a: aload 27
// 11c: getstatic net/minecraft/class_1301.field_52443 Ljava/util/function/Predicate;
// 11f: dload 19
// 121: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
// 124: astore 28
// 126: aload 28
// 128: aload 16
// 12a: lload 6
// 12c: lconst_0
// 12d: lcmp
// 12e: iflt 149
// 131: ifnonnull 147
// 134: ifnull 18a
// 137: goto 145
// 13a: ldc2_w -6753113731033033772
// 13d: lload 6
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: aload 28
// 147: aload 16
// 149: ifnonnull 187
// 14c: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
// 14f: aload 21
// 151: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 154: dload 23
// 156: dcmpg
// 157: ifge 18a
// 15a: goto 168
// 15d: ldc2_w -6753113731033033772
// 160: lload 6
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: aload 0
// 169: lload 11
// 16b: aload 28
// 16d: checkcast net/minecraft/class_239
// 170: iload 13
// 172: i2c
// 173: aload 21
// 175: dload 3
// 176: invokespecial su/catlean/dm.i (JLnet/minecraft/class_239;CLnet/minecraft/class_243;D)Lnet/minecraft/class_239;
// 179: goto 187
// 17c: ldc2_w -6753113731033033772
// 17f: lload 6
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: goto 198
// 18a: aload 0
// 18b: lload 11
// 18d: aload 22
// 18f: iload 13
// 191: i2c
// 192: aload 21
// 194: dload 1
// 195: invokespecial su/catlean/dm.i (JLnet/minecraft/class_239;CLnet/minecraft/class_243;D)Lnet/minecraft/class_239;
// 198: areturn
}

private final class_239 i(long param1, class_239 param3, char param4, class_243 param5, double param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 16
// 03: lshl
// 04: iload 4
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 48
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/dm.a J
// 11: lxor
// 12: lstore 8
// 14: ldc2_w 7043508201507295303
// 17: lload 8
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: aload 3
// 1f: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 22: dup
// 23: sipush 8452
// 26: ldc2_w 8447127575319973604
// 29: lload 8
// 2b: lxor
// 2c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 34: astore 11
// 36: astore 10
// 38: aload 11
// 3a: aload 5
// 3c: aload 10
// 3e: ifnonnull 6d
// 41: checkcast net/minecraft/class_2374
// 44: dload 6
// 46: invokevirtual net/minecraft/class_243.method_24802 (Lnet/minecraft/class_2374;D)Z
// 49: ifne dd
// 4c: goto 5a
// 4f: ldc2_w 7003688601221615790
// 52: lload 8
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: aload 3
// 5b: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 5e: dup
// 5f: goto 6d
// 62: ldc2_w 7003688601221615790
// 65: lload 8
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: sipush 8452
// 70: ldc2_w 8447127575319973604
// 73: lload 8
// 75: lxor
// 76: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7e: astore 12
// 80: aload 12
// 82: getfield net/minecraft/class_243.field_1352 D
// 85: aload 5
// 87: getfield net/minecraft/class_243.field_1352 D
// 8a: dsub
// 8b: aload 12
// 8d: getfield net/minecraft/class_243.field_1351 D
// 90: aload 5
// 92: getfield net/minecraft/class_243.field_1351 D
// 95: dsub
// 96: aload 12
// 98: getfield net/minecraft/class_243.field_1350 D
// 9b: aload 5
// 9d: getfield net/minecraft/class_243.field_1350 D
// a0: dsub
// a1: invokestatic net/minecraft/class_2350.method_10142 (DDD)Lnet/minecraft/class_2350;
// a4: dup
// a5: sipush 8540
// a8: ldc2_w 4832566439702171317
// ab: lload 8
// ad: lxor
// ae: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// b6: astore 13
// b8: aload 12
// ba: aload 13
// bc: aload 12
// be: checkcast net/minecraft/class_2374
// c1: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// c4: invokestatic net/minecraft/class_3965.method_17778 (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
// c7: dup
// c8: sipush 31042
// cb: ldc2_w 4861563854944818869
// ce: lload 8
// d0: lxor
// d1: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// d9: checkcast net/minecraft/class_239
// dc: areturn
// dd: aload 3
// de: areturn
}

@NotNull
public final class_239 x(double l, long a, float yaw, float pitch) {
ax = a ^ ax;
long var7 = ax ^ 56112936799585L;
long var9 = ax ^ 54012460626886L;
class_243 var10000 = this.y(pitch, yaw).method_1021(lx);
Intrinsics.checkNotNullExpressionValue(var10000, a<"x">(20815, 1679193923648634620L ^ ax));
class_243 var11 = var10000;
class_3965 var13 = zf.z(var7)
.method_17742(
new class_3959(zf.v(var9).method_33571(), zf.v(var9).method_33571().method_1019(var11), class_3960.field_17559, class_242.field_1348, (class_1297)zf.v(var9))
);
Intrinsics.checkNotNullExpressionValue(var13, a<"x">(16076, 7826988920249307494L ^ ax));
return (class_239)var13;
}

public final void D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 32225418198409L;
zf.F(var3).field_1690.field_1894.method_23481(false);
zf.F(var3).field_1690.field_1881.method_23481(false);
zf.F(var3).field_1690.field_1913.method_23481(false);
zf.F(var3).field_1690.field_1849.method_23481(false);
zf.F(var3).field_1690.field_1903.method_23481(false);
zf.F(var3).field_1690.field_1832.method_23481(false);
}

public final void F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 89256188261323L;
long var10001 = var1 ^ 74171733175777L;
int var5 = (int)((var1 ^ 74171733175777L) >>> 48);
int var6 = (int)((var1 ^ 74171733175777L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
class_304 var10000 = zf.F(var3).field_1690.field_1894;
class_304 var14 = zf.F(var3).field_1690.field_1894;
Intrinsics.checkNotNull(var14, a<"x">(30069, 9019427036763968743L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var14).getKey().method_1444()));
var10000 = zf.F(var3).field_1690.field_1881;
class_304 var15 = zf.F(var3).field_1690.field_1881;
Intrinsics.checkNotNull(var15, a<"x">(2304, 8374258782213023895L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var15).getKey().method_1444()));
var10000 = zf.F(var3).field_1690.field_1913;
class_304 var16 = zf.F(var3).field_1690.field_1913;
Intrinsics.checkNotNull(var16, a<"x">(2304, 8374258782213023895L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var16).getKey().method_1444()));
var10000 = zf.F(var3).field_1690.field_1849;
class_304 var17 = zf.F(var3).field_1690.field_1849;
Intrinsics.checkNotNull(var17, a<"x">(2304, 8374258782213023895L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var17).getKey().method_1444()));
var10000 = zf.F(var3).field_1690.field_1903;
class_304 var18 = zf.F(var3).field_1690.field_1903;
Intrinsics.checkNotNull(var18, a<"x">(2304, 8374258782213023895L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var18).getKey().method_1444()));
var10000 = zf.F(var3).field_1690.field_1832;
class_304 var19 = zf.F(var3).field_1690.field_1832;
Intrinsics.checkNotNull(var19, a<"x">(2304, 8374258782213023895L ^ var1));
var10000.method_23481(bx.k((short)var5, var6, (char)var7, ((KeyMappingAccessor)var19).getKey().method_1444()));
}

private static final boolean k(boolean param0, class_1297 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: ldc2_w 117177641086611
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -1950427278963370730
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: sipush 20288
// 15: ldc2_w 133482634811237886
// 18: lload 2
// 19: lxor
// 1a: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 4
// 24: aload 1
// 25: invokevirtual net/minecraft/class_1297.method_7325 ()Z
// 28: aload 4
// 2a: ifnonnull 4e
// 2d: ifne b0
// 30: goto 3d
// 33: ldc2_w -1989684548509051393
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: aload 1
// 3e: invokevirtual net/minecraft/class_1297.method_5863 ()Z
// 41: goto 4e
// 44: ldc2_w -1989684548509051393
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 4
// 50: ifnonnull 74
// 53: ifeq b0
// 56: goto 63
// 59: ldc2_w -1989684548509051393
// 5c: lload 2
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 1
// 64: instanceof net/minecraft/class_1309
// 67: goto 74
// 6a: ldc2_w -1989684548509051393
// 6d: lload 2
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: aload 4
// 76: ifnonnull ad
// 79: ifne ac
// 7c: goto 89
// 7f: ldc2_w -1989684548509051393
// 82: lload 2
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: iload 0
// 8a: aload 4
// 8c: ifnonnull ad
// 8f: goto 9c
// 92: ldc2_w -1989684548509051393
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: ifne b0
// 9f: goto ac
// a2: ldc2_w -1989684548509051393
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 1
// ad: goto b1
// b0: bipush 0
// b1: ireturn
}

private static final boolean I(class_1297 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dm.a J
// 03: ldc2_w 82790738034927
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -3849854857497527446
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: sipush 20288
// 15: ldc2_w 133445945810439042
// 18: lload 1
// 19: lxor
// 1a: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 3
// 23: aload 0
// 24: invokevirtual net/minecraft/class_1297.method_7325 ()Z
// 27: aload 3
// 28: ifnonnull 4c
// 2b: ifne 64
// 2e: goto 3b
// 31: ldc2_w -3882356112947872893
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: aload 0
// 3c: invokevirtual net/minecraft/class_1297.method_5863 ()Z
// 3f: goto 4c
// 42: ldc2_w -3882356112947872893
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: aload 3
// 4d: ifnonnull 61
// 50: ifeq 64
// 53: goto 60
// 56: ldc2_w -3882356112947872893
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: bipush 1
// 61: goto 65
// 64: bipush 0
// 65: ireturn
}

private static final boolean p(class_1297 var0) {
long var1 = a ^ 128579933037388L;
_g[] var10000 = vm.a<"Å">(2968345884762298569L, var1);
Intrinsics.checkNotNullParameter(var0, a<"x">(7173, 7649450371091266414L ^ var1));
_g[] var3 = var10000;

try {
boolean var5 = var0.method_7325();
if (var3 != null) {
return var5;
}

if (!var5) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 3007320510827534368L, var1);
}

return false;
}

static {
long var31 = a ^ 26301898346218L;
vm.a<"Å">(null, 327542255580015407L, var31);
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[25];
int var27 = 0;
String var26 = "ÂåØ<\u0004¼\u0092Í\u009c\u000eKÑÃ\u0094\u0018Ý \u0087\u0017nLS\u0084a\"¤\u008depBZ\u00940ýñÉâ¼Å\u001a\u001dKc\u0092\u0017,Yöe \u000f\u0017þüO\u0001\u000eþ]\u009d¼\u0001íÑßxCÂáá¹cÚIÐÖ\u0016\u001a7l?©\u0090¨\u008f½Ds\u001e3¢Ú#È¥t\rq\u0081\u0081\\\u009b^±\u0003\u008f3²u4ìÑþ\r\u0082þ(ÇPs%¤k\u0002ã´;\u0011\u0095\u009eZæá:ç8È,Ç\u0090c§\f/\u001cÈ\u009dP\n!iµ\u0095\t\u009c\u009b\u009f\u0013{îj=x\u001dQøëÖ»W`5zÛ\u00058þ c¼\u0015\u000fèQ\u0093¾\u0002î\tÒÛá§\u0099jÜ¾0\u0084\u0004\u0088\rC)cY\u0097~Ö\u008daÍ¬6\rbvs×\u008fA¡Bp¼\u0099¬ \u0090\u0002ã¤Ç÷ë\u0000\u0003Ï;\u001fð®Áî²\u009aûèÿ\u008bú>ÑõY\u0090ú\u0099ÎÁ(G\u0018¬_§\u009d\u0019\u009cÂ¨í,£O[2\u0095áâ\u008cÝ8^\u0000o¶Øß\u001f¡ÜºÖð\u0085*´) Ó\u0088\u0010\u001d\u0091û\u00057\u000epÜU\u008dÈ\u0016\u009fZ\u009aÛ\u0018iËX\u0016\u007f\f\u0015½X=>¹9\\ Þ\u0015óíÝ\u0016«è´N9\\ÞÁR\u0094_#@ø\u0002z\u000be\u001e®¸Õ9ÁD¸÷ar\u0001\u0088\u000e\u0010\rø¾¥\u0083×s[}\u000e\u001a·9ý\u0080ºÍ!\u0004ã(Û+R\u00151!\u008a\u0090Õ¼\u0082`E\u0011ã÷IË\t¾-\u0019y\u008aË\u0086\u0091;\u009eUPñ,´µ;(\u0094ÞóÒ]÷(g5ñßL%#\u0090$ë\u0010\u0090çE²µm¢Ú\u0006rä\u0090bôÙAïÜ(\u001e²ÏÁ0f\\[\u0002`\u0088Ð³vÌ\u0014\u0003&#}I\u0086\"¿\u000f\u0087òn\u0083\u009e°jB\u008a\r\u0090\u0080ÖÖ0!+@ÖF#û²_r\b\u0007Ò\u0001x\u0098,ÏÔXéu=BÉ\t¿\u009b±v7¨é\u009f^\u0013Î£LÇ\u008d\u0019\u0015ÄI-%\u0006¡å¿?\u0081^\u001eÝ\u001a×Å\u0094£NÛe³1#Y¥íÐ\t¶ \u008c\u0093\u008aÍ\u009b\u008dç*\u0096\u0084\u0087¤\u009d*Ôæ!C\u0082åÏÿÍP\u0090g»Ò\u0005WVQ\u0091 ó%´öÈ$1\u0000d\u00adû×\u0001M9Ë\u001bó¢)\u0003O\u0096\u0016³º¿\u0099£ìM\u0004\u0010Ï±¸§+\u0016SÞ25%à\f5.Î I(¡kÂß²\u0087¢æëe\u0091[g\u009cHåH\u0089k}\u009a\u00045\u001b\u00812ÔOëÌ8ðiÍ±\u001fíË\u001f\n¢Z\u0013?Q¢+¸\u0085¥ú¶/\u0092W&¹Wè¼\u0099¬>>\u0014\u001bxAÊ§|W}to´\u009fp åáIY¦\u0093E<(9X\u0083§h\u0006Å¿ßÂn*\u0094/ö\u0000\u009dÞcH\u0007\u0006\u00ad\u0012¥\f\u0013´ì\rÊ\u0018¦%¬|Ø+ùÍ\u0010,\u0090çäL¾\u001a\\¶0´ÜÞYÈ\u0081\u0010ÌbÅ\u0091\u000ed8'¥pwbå\"áö\u0018\u0019í\u0017Ñ¢`\r{\u0086Å\u0017\u0097Fe\u0018ÝØýú¥gû2µ \u00adWSW\u0097_ÜêO\u0015GEä)'ë\u009b¾ì±X\u0089Æ§Ù©Z\u0004\u0095¬¯_ ¹$\u0018{ý\u008b\u0000¸\u0012%f-U\u0015äÊ\u0017Ç\u0000 QPb\r²ç7\u0096\u0012XÈü\u0088óÜ1tÎ©ÕBôê\u0096)\u009b\u0014ö\u0082Õ\u001f¥D\u008a\u0089K(¸`c\u001eóÙ\u0004\u007fú?Q¦<J\u001e\u000e¸·\u0082C\u00104ÅU\u0088\u0012f;\u0093ÿÔ\u007f¤}Ù#¼Ü9CÛ\u0006á\u000f\nA\u0019Î\u0004)\u0088é\u0085\\m±¾\u001dÉf\u0092:\u0010£ÇÚ\u0080l}ú£ý Íq-9ä\u009c\u007fAÚû\u009eölâ®©}°ðt\u001b£\u0004´\u0005QÒ)\u0090¢:o$º\u001a`v\u000bB(\u009f§\u0015\u0095ÏNVq\u0099u\u0012\u001d\u000bpHg\u008adVwÑ\u001cÈ\u0084ÿ_\u0088òÓvwOV\u008c\u00855\u0003\u001eÕJ\u0010\u0087åÓ:N\u0015ç\u001e§\u000bÑ3Ðå%J ?!5´AÖ;!gÞI\rù\u000fî¾\u0007ãÊ\u0017B\u0089KH\u0090¤ËÍ:ªI\u0086";
int var28 = "ÂåØ<\u0004¼\u0092Í\u009c\u000eKÑÃ\u0094\u0018Ý \u0087\u0017nLS\u0084a\"¤\u008depBZ\u00940ýñÉâ¼Å\u001a\u001dKc\u0092\u0017,Yöe \u000f\u0017þüO\u0001\u000eþ]\u009d¼\u0001íÑßxCÂáá¹cÚIÐÖ\u0016\u001a7l?©\u0090¨\u008f½Ds\u001e3¢Ú#È¥t\rq\u0081\u0081\\\u009b^±\u0003\u008f3²u4ìÑþ\r\u0082þ(ÇPs%¤k\u0002ã´;\u0011\u0095\u009eZæá:ç8È,Ç\u0090c§\f/\u001cÈ\u009dP\n!iµ\u0095\t\u009c\u009b\u009f\u0013{îj=x\u001dQøëÖ»W`5zÛ\u00058þ c¼\u0015\u000fèQ\u0093¾\u0002î\tÒÛá§\u0099jÜ¾0\u0084\u0004\u0088\rC)cY\u0097~Ö\u008daÍ¬6\rbvs×\u008fA¡Bp¼\u0099¬ \u0090\u0002ã¤Ç÷ë\u0000\u0003Ï;\u001fð®Áî²\u009aûèÿ\u008bú>ÑõY\u0090ú\u0099ÎÁ(G\u0018¬_§\u009d\u0019\u009cÂ¨í,£O[2\u0095áâ\u008cÝ8^\u0000o¶Øß\u001f¡ÜºÖð\u0085*´) Ó\u0088\u0010\u001d\u0091û\u00057\u000epÜU\u008dÈ\u0016\u009fZ\u009aÛ\u0018iËX\u0016\u007f\f\u0015½X=>¹9\\ Þ\u0015óíÝ\u0016«è´N9\\ÞÁR\u0094_#@ø\u0002z\u000be\u001e®¸Õ9ÁD¸÷ar\u0001\u0088\u000e\u0010\rø¾¥\u0083×s[}\u000e\u001a·9ý\u0080ºÍ!\u0004ã(Û+R\u00151!\u008a\u0090Õ¼\u0082`E\u0011ã÷IË\t¾-\u0019y\u008aË\u0086\u0091;\u009eUPñ,´µ;(\u0094ÞóÒ]÷(g5ñßL%#\u0090$ë\u0010\u0090çE²µm¢Ú\u0006rä\u0090bôÙAïÜ(\u001e²ÏÁ0f\\[\u0002`\u0088Ð³vÌ\u0014\u0003&#}I\u0086\"¿\u000f\u0087òn\u0083\u009e°jB\u008a\r\u0090\u0080ÖÖ0!+@ÖF#û²_r\b\u0007Ò\u0001x\u0098,ÏÔXéu=BÉ\t¿\u009b±v7¨é\u009f^\u0013Î£LÇ\u008d\u0019\u0015ÄI-%\u0006¡å¿?\u0081^\u001eÝ\u001a×Å\u0094£NÛe³1#Y¥íÐ\t¶ \u008c\u0093\u008aÍ\u009b\u008dç*\u0096\u0084\u0087¤\u009d*Ôæ!C\u0082åÏÿÍP\u0090g»Ò\u0005WVQ\u0091 ó%´öÈ$1\u0000d\u00adû×\u0001M9Ë\u001bó¢)\u0003O\u0096\u0016³º¿\u0099£ìM\u0004\u0010Ï±¸§+\u0016SÞ25%à\f5.Î I(¡kÂß²\u0087¢æëe\u0091[g\u009cHåH\u0089k}\u009a\u00045\u001b\u00812ÔOëÌ8ðiÍ±\u001fíË\u001f\n¢Z\u0013?Q¢+¸\u0085¥ú¶/\u0092W&¹Wè¼\u0099¬>>\u0014\u001bxAÊ§|W}to´\u009fp åáIY¦\u0093E<(9X\u0083§h\u0006Å¿ßÂn*\u0094/ö\u0000\u009dÞcH\u0007\u0006\u00ad\u0012¥\f\u0013´ì\rÊ\u0018¦%¬|Ø+ùÍ\u0010,\u0090çäL¾\u001a\\¶0´ÜÞYÈ\u0081\u0010ÌbÅ\u0091\u000ed8'¥pwbå\"áö\u0018\u0019í\u0017Ñ¢`\r{\u0086Å\u0017\u0097Fe\u0018ÝØýú¥gû2µ \u00adWSW\u0097_ÜêO\u0015GEä)'ë\u009b¾ì±X\u0089Æ§Ù©Z\u0004\u0095¬¯_ ¹$\u0018{ý\u008b\u0000¸\u0012%f-U\u0015äÊ\u0017Ç\u0000 QPb\r²ç7\u0096\u0012XÈü\u0088óÜ1tÎ©ÕBôê\u0096)\u009b\u0014ö\u0082Õ\u001f¥D\u008a\u0089K(¸`c\u001eóÙ\u0004\u007fú?Q¦<J\u001e\u000e¸·\u0082C\u00104ÅU\u0088\u0012f;\u0093ÿÔ\u007f¤}Ù#¼Ü9CÛ\u0006á\u000f\nA\u0019Î\u0004)\u0088é\u0085\\m±¾\u001dÉf\u0092:\u0010£ÇÚ\u0080l}ú£ý Íq-9ä\u009c\u007fAÚû\u009eölâ®©}°ðt\u001b£\u0004´\u0005QÒ)\u0090¢:o$º\u001a`v\u000bB(\u009f§\u0015\u0095ÏNVq\u0099u\u0012\u001d\u000bpHg\u008adVwÑ\u001cÈ\u0084ÿ_\u0088òÓvwOV\u008c\u00855\u0003\u001eÕJ\u0010\u0087åÓ:N\u0015ç\u001e§\u000bÑ3Ðå%J ?!5´AÖ;!gÞI\rù\u000fî¾\u0007ãÊ\u0017B\u0089KH\u0090¤ËÍ:ªI\u0086"
.length();
char var25 = 16;
int var35 = -1;

label72:
while (true) {
String var36 = var26.substring(++var35, var35 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var50;
if ((var35 += var25) >= var28) {
b = var29;
c = new String[25];
g = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[8];
int var14 = 0;
String var15 = "\u009c\u008bM/ùR¬Fÿ\u0091\u0015Vd.\u0017uÍã(\u0093¿\u0081\u0089ñÿ¶UÒ\u0099Y#\u0082\u0013hU^ÇÈn¾\u009b´NMru\u0017¡";
int var16 = "\u009c\u008bM/ùR¬Fÿ\u0091\u0015Vd.\u0017uÍã(\u0093¿\u0081\u0089ñÿ¶UÒ\u0099Y#\u0082\u0013hU^ÇÈn¾\u009b´NMru\u0017¡".length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var39 = var17;
var10001 = var14++;
long var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var58 = -1;

while (true) {
long var19 = var54;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var62 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var62;
if (var13 >= var16) {
e = var17;
f = new Integer[8];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "Í\u0001·cÀ´î\u0007£[aë\u001bG\u009c\u008cé\u0019q\u00adÝ³\u0013\u0094";
int var5 = "Í\u0001·cÀ´î\u0007£[aë\u001bG\u009c\u008cé\u0019q\u00adÝ³\u0013\u0094".length();
byte var2 = 0;

do {
int var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var47 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var61 = -1;
var6[var47] = var62;
} while (var2 < var5);

j = var6;
k = new Long[3];
h = new dm();
i = c<"a">(28210, 3215941172036643116L ^ var31);
z = c<"a">(19653, 9169977205806992344L ^ var31);
u = c<"a">(19653, 9169977205806992344L ^ var31);
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = ">¹49Dn\u0082ù\u00116ÓñÏ\u0085/Á";
var16 = ">¹49Dn\u0082ù\u00116ÓñÏ\u0085/Á".length();
var13 = 0;
}

byte var46 = var13;
var13 += 8;
var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
var39 = var17;
var10001 = var14++;
var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var58 = 0;
}
}
}

var25 = var26.charAt(var35);
break;
default:
var29[var27++] = var50;
if ((var35 += var25) < var28) {
var25 = var26.charAt(var35);
continue label72;
}

var26 = "c\u0081\u008a\u00171ÙYÖ\u009b\u000bÂ0Ï\u001c@D\u0098\u0010ëì/Íµ\u0086cfÃ\u0092\u008fÃ6\u008a \u00127ËU\u0013 ÷6kHVû\u0015íðÕY\u0002¿&e´ô\u0092m\u0089\u0086_\u0000\u009eK?";
var28 = "c\u0081\u008a\u00171ÙYÖ\u009b\u000bÂ0Ï\u001c@D\u0098\u0010ëì/Íµ\u0086cfÃ\u0092\u008fÃ6\u008a \u00127ËU\u0013 ÷6kHVû\u0015íðÕY\u0002¿&e´ô\u0092m\u0089\u0086_\u0000\u009eK?"
.length();
var25 = ' ';
var35 = -1;
}

var36 = var26.substring(++var35, var35 + var25);
var10001 = 0;
}
}
}

public static void k(_g[] var0) {
n = var0;
}

public static _g[] e() {
return n;
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String a(byte[] var0) {
int var1 = 0;
int var2;
char[] var3 = new char[var2 = var0.length];

for (int var4 = 0; var4 < var2; var4++) {
int var5;
if ((var5 = 255 & var0[var4]) < 192) {
var3[var1++] = (char)var5;
} else if (var5 < 224) {
char var6 = (char)((char)(var5 & 31) << 6);
byte var8 = var0[++var4];
var6 = (char)(var6 | (char)(var8 & 63));
var3[var1++] = var6;
} else if (var4 < var2 - 2) {
char var12 = (char)((char)(var5 & 15) << '\f');
byte var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63) << 6);
var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63));
var3[var1++] = var12;
}
}

return new String(var3, 0, var1);
}

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20243;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])d.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/dm", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = b[var5].getBytes("ISO-8859-1");
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/dm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32060;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/dm", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/dm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17089;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = j[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/dm", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
k[var3] = var15;
}

return k[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = d(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/dm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
