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
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_2627;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;
import su.catlean.gofra.Flow;

public final class ur extends _g {
@NotNull
public static final ur o;
static final KProperty[] D;
@NotNull
private static final cw Y;
@NotNull
private static final ct u;
@NotNull
private static final ct C;
@NotNull
private static final cq c;
@NotNull
private static final cq i;
@NotNull
private static final cq F;
@NotNull
private static final c8 J;
private static boolean b;
private static int U;
@NotNull
private static i9 f;
private static float a;
private static final long d = yz.a(-983711160038968419L, 6622404617818079575L, MethodHandles.lookup().lookupClass()).a(186499525355146L);
private static final String[] e;
private static final String[] g;
private static final Map h = new HashMap(13);
private static final long[] j;
private static final Integer[] k;
private static final Map l;

private ur(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 57218461640221L;
super(b<"s">(28109, 6664765771485123129L ^ var1), jt.V(), null, 4, null, var3);
}

private final le q(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 3901314297916L;
return (le)Y.E(this, var3, D[0]);
}

private final float i(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 123920856604453L;
return ((Number)u.E(this, var3, D[1])).floatValue();
}

private final float V(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 96287083339813L;
return ((Number)C.E(this, var3, D[2])).floatValue();
}

private final boolean t(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 36832485720399L;
return (Boolean)c.E(this, var3, D[3]);
}

private final boolean j(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 124159528645672L;
return (Boolean)i.E(this, var6, D[4]);
}

private final boolean s(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 121770668920716L;
return (Boolean)F.E(this, var3, D[5]);
}

private final int p(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 134037309566252L;
return ((Number)J.E(this, var3, D[c<"e">(17943, 2959330132696633872L ^ var1)])).intValue();
}

@Override
public void O(long var1) {
U = 0;
}

@Flow
private final void T(ScreenEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 34449744897349
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 7265091914974475324
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: getstatic su/catlean/ur.b Z
// 16: aload 4
// 18: ifnonnull 3d
// 1b: ifeq 40
// 1e: goto 2b
// 21: ldc2_w 7263509517298078734
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: aload 1
// 2c: invokevirtual su/catlean/api/event/events/client/ScreenEvent.cancel ()V
// 2f: bipush 0
// 30: goto 3d
// 33: ldc2_w 7263509517298078734
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: putstatic su/catlean/ur.b Z
// 40: return
}

@Flow
private final void s(JumpEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 72367811485223
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 95122153910790
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 2875868865055
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 124955059866886
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -6939884163807752354
// 22: lload 2
// 23: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 10
// 2c: ifnonnull 63
// 2f: aload 0
// 30: lload 6
// 32: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 35: getstatic su/catlean/le.VANILLA Lsu/catlean/le;
// 38: if_acmpne 6d
// 3b: goto 48
// 3e: ldc2_w -6940198854545084564
// 41: lload 2
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 1
// 49: invokevirtual su/catlean/api/event/events/player/JumpEvent.cancel ()V
// 4c: aload 1
// 4d: aload 0
// 4e: lload 8
// 50: invokespecial su/catlean/ur.i (J)F
// 53: invokevirtual su/catlean/api/event/events/player/JumpEvent.setY (F)V
// 56: goto 63
// 59: ldc2_w -6940198854545084564
// 5c: lload 2
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 1
// 64: aload 0
// 65: lload 4
// 67: invokespecial su/catlean/ur.V (J)F
// 6a: invokevirtual su/catlean/api/event/events/player/JumpEvent.setXz (F)V
// 6d: return
}

@Flow(
priority = -10
)
private final void J(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ur.d J
// 003: ldc2_w 138671793159197
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 78307087637813
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 116154589537836
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 88374411689877
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 34772309455190
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 86222118465340
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 133006070680336
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 778861129606
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 109419753749208
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 92957617172402
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 84838921458751
// 04c: lxor
// 04d: lstore 22
// 04f: dup2
// 050: ldc2_w 12891605069901
// 053: lxor
// 054: lstore 24
// 056: dup2
// 057: ldc2_w 114003820239199
// 05a: lxor
// 05b: lstore 26
// 05d: dup2
// 05e: ldc2_w 115779995127868
// 061: lxor
// 062: lstore 28
// 064: dup2
// 065: ldc2_w 98452579370476
// 068: lxor
// 069: dup2
// 06a: bipush 48
// 06c: lushr
// 06d: l2i
// 06e: istore 30
// 070: dup2
// 071: bipush 16
// 073: lshl
// 074: bipush 16
// 076: lushr
// 077: lstore 31
// 079: pop2
// 07a: dup2
// 07b: ldc2_w 113553503709317
// 07e: lxor
// 07f: lstore 33
// 081: dup2
// 082: ldc2_w 20543374107119
// 085: lxor
// 086: lstore 35
// 088: dup2
// 089: ldc2_w 994716294083
// 08c: lxor
// 08d: lstore 37
// 08f: dup2
// 090: ldc2_w 51666258861175
// 093: lxor
// 094: lstore 39
// 096: dup2
// 097: ldc2_w 130122594318625
// 09a: lxor
// 09b: lstore 41
// 09d: dup2
// 09e: ldc2_w 35256816869792
// 0a1: lxor
// 0a2: lstore 43
// 0a4: dup2
// 0a5: ldc2_w 67430658244645
// 0a8: lxor
// 0a9: lstore 45
// 0ab: dup2
// 0ac: ldc2_w 124647604956767
// 0af: lxor
// 0b0: lstore 47
// 0b2: dup2
// 0b3: ldc2_w 92358919745588
// 0b6: lxor
// 0b7: lstore 49
// 0b9: dup2
// 0ba: ldc2_w 51046496240750
// 0bd: lxor
// 0be: lstore 51
// 0c0: dup2
// 0c1: ldc2_w 48159850682141
// 0c4: lxor
// 0c5: lstore 53
// 0c7: dup2
// 0c8: ldc2_w 78017006935987
// 0cb: lxor
// 0cc: lstore 55
// 0ce: dup2
// 0cf: ldc2_w 85983374918705
// 0d2: lxor
// 0d3: dup2
// 0d4: bipush 48
// 0d6: lushr
// 0d7: l2i
// 0d8: istore 57
// 0da: dup2
// 0db: bipush 16
// 0dd: lshl
// 0de: bipush 32
// 0e0: lushr
// 0e1: l2i
// 0e2: istore 58
// 0e4: dup2
// 0e5: bipush 48
// 0e7: lshl
// 0e8: bipush 48
// 0ea: lushr
// 0eb: l2i
// 0ec: istore 59
// 0ee: pop2
// 0ef: dup2
// 0f0: ldc2_w 5397060025637
// 0f3: lxor
// 0f4: lstore 60
// 0f6: dup2
// 0f7: ldc2_w 102170930085834
// 0fa: lxor
// 0fb: lstore 62
// 0fd: dup2
// 0fe: ldc2_w 62038813047060
// 101: lxor
// 102: lstore 64
// 104: dup2
// 105: ldc2_w 23551181511267
// 108: lxor
// 109: lstore 66
// 10b: pop2
// 10c: ldc2_w 9046231716647906660
// 10f: lload 2
// 110: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: astore 73
// 117: lload 16
// 119: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11c: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 11f: getfield net/minecraft/class_1656.field_7479 Z
// 122: aload 73
// 124: ifnonnull 14c
// 127: ifne 14f
// 12a: goto 137
// 12d: ldc2_w 9049220561511550294
// 130: lload 2
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: lload 16
// 139: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13c: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 13f: goto 14c
// 142: ldc2_w 9049220561511550294
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: ifeq 150
// 14f: return
// 150: aload 0
// 151: lload 45
// 153: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 156: getstatic su/catlean/le.GRIM_SHULKER Lsu/catlean/le;
// 159: aload 73
// 15b: ifnonnull 4c1
// 15e: if_acmpne 4b8
// 161: goto 16e
// 164: ldc2_w 9049220561511550294
// 167: lload 2
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: lload 16
// 170: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 173: getfield net/minecraft/class_746.field_6012 I
// 176: bipush 5
// 177: irem
// 178: aload 73
// 17a: ifnonnull 1af
// 17d: goto 18a
// 180: ldc2_w 9049220561511550294
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: ifne 4b8
// 18d: goto 19a
// 190: ldc2_w 9049220561511550294
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 19d: lload 24
// 19f: invokevirtual su/catlean/dm.Y (J)Z
// 1a2: goto 1af
// 1a5: ldc2_w 9049220561511550294
// 1a8: lload 2
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: ifeq 4b8
// 1b2: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 1b5: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 1b8: checkcast java/lang/Iterable
// 1bb: astore 75
// 1bd: bipush 0
// 1be: istore 76
// 1c0: aload 75
// 1c2: astore 77
// 1c4: new java/util/ArrayList
// 1c7: dup
// 1c8: invokespecial java/util/ArrayList.<init> ()V
// 1cb: checkcast java/util/Collection
// 1ce: astore 78
// 1d0: bipush 0
// 1d1: istore 79
// 1d3: aload 77
// 1d5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1da: astore 80
// 1dc: aload 80
// 1de: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1e3: ifeq 22a
// 1e6: aload 80
// 1e8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ed: astore 81
// 1ef: aload 81
// 1f1: instanceof net/minecraft/class_2627
// 1f4: aload 73
// 1f6: ifnonnull 4d9
// 1f9: aload 73
// 1fb: ifnonnull 224
// 1fe: goto 20b
// 201: ldc2_w 9049220561511550294
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: ifeq 1dc
// 20e: goto 21b
// 211: ldc2_w 9049220561511550294
// 214: lload 2
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: aload 78
// 21d: aload 81
// 21f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 224: pop
// 225: aload 73
// 227: ifnull 1dc
// 22a: aload 78
// 22c: checkcast java/util/List
// 22f: nop
// 230: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 235: astore 74
// 237: aload 74
// 239: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23e: ifeq 4b8
// 241: aload 74
// 243: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 248: checkcast net/minecraft/class_2627
// 24b: astore 75
// 24d: aload 73
// 24f: ifnonnull 9ff
// 252: aload 75
// 254: invokevirtual net/minecraft/class_2627.method_11313 ()Lnet/minecraft/class_2627$class_2628;
// 257: getstatic net/minecraft/class_2627$class_2628.field_12066 Lnet/minecraft/class_2627$class_2628;
// 25a: aload 73
// 25c: ifnonnull 291
// 25f: goto 26c
// 262: ldc2_w 9049220561511550294
// 265: lload 2
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: if_acmpeq 2a2
// 26f: goto 27c
// 272: ldc2_w 9049220561511550294
// 275: lload 2
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: aload 75
// 27e: invokevirtual net/minecraft/class_2627.method_11313 ()Lnet/minecraft/class_2627$class_2628;
// 281: getstatic net/minecraft/class_2627$class_2628.field_12063 Lnet/minecraft/class_2627$class_2628;
// 284: goto 291
// 287: ldc2_w 9049220561511550294
// 28a: lload 2
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: if_acmpeq 2a2
// 294: bipush 1
// 295: goto 2a3
// 298: ldc2_w 9049220561511550294
// 29b: lload 2
// 29c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a1: athrow
// 2a2: bipush 0
// 2a3: istore 76
// 2a5: new net/minecraft/class_238
// 2a8: dup
// 2a9: aload 75
// 2ab: invokevirtual net/minecraft/class_2627.method_11016 ()Lnet/minecraft/class_2338;
// 2ae: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 2b1: ldc2_w 0.5
// 2b4: dconst_1
// 2b5: ldc2_w 0.5
// 2b8: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 2bb: dup
// 2bc: sipush 19163
// 2bf: ldc2_w 3654822059095375625
// 2c2: lload 2
// 2c3: lxor
// 2c4: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2cc: astore 77
// 2ce: new net/minecraft/class_238
// 2d1: dup
// 2d2: aload 75
// 2d4: invokevirtual net/minecraft/class_2627.method_11016 ()Lnet/minecraft/class_2338;
// 2d7: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 2da: ldc2_w 1.5
// 2dd: dconst_1
// 2de: ldc2_w 1.5
// 2e1: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 2e4: dup
// 2e5: sipush 25495
// 2e8: ldc2_w 2757278294717011523
// 2eb: lload 2
// 2ec: lxor
// 2ed: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2f5: astore 78
// 2f7: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 2fa: lload 41
// 2fc: aload 77
// 2fe: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 301: dup
// 302: sipush 9088
// 305: ldc2_w 739879016441861709
// 308: lload 2
// 309: lxor
// 30a: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 312: aconst_null
// 313: bipush 4
// 314: aconst_null
// 315: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 318: pop
// 319: lload 16
// 31b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 31e: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 321: aload 78
// 323: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 326: aload 73
// 328: ifnonnull 33d
// 32b: ifeq 237
// 32e: goto 33b
// 331: ldc2_w 9049220561511550294
// 334: lload 2
// 335: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33a: athrow
// 33b: iload 76
// 33d: aload 73
// 33f: ifnonnull 3fc
// 342: ifeq 3ef
// 345: goto 352
// 348: ldc2_w 9049220561511550294
// 34b: lload 2
// 34c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 351: athrow
// 352: lload 16
// 354: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 357: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 35a: aload 78
// 35c: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 35f: aload 73
// 361: ifnonnull 3fc
// 364: goto 371
// 367: ldc2_w 9049220561511550294
// 36a: lload 2
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: ifeq 3ef
// 374: goto 381
// 377: ldc2_w 9049220561511550294
// 37a: lload 2
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 384: aload 75
// 386: invokevirtual net/minecraft/class_2627.method_11016 ()Lnet/minecraft/class_2338;
// 389: dup
// 38a: sipush 4870
// 38d: ldc2_w 7869965656299497155
// 390: lload 2
// 391: lxor
// 392: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 397: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 39a: lload 62
// 39c: getstatic su/catlean/xx.Strict Lsu/catlean/xx;
// 39f: invokevirtual su/catlean/gw.z (Lnet/minecraft/class_2338;JLsu/catlean/xx;)Lsu/catlean/dl;
// 3a2: astore 79
// 3a4: aload 73
// 3a6: ifnonnull 3ea
// 3a9: aload 79
// 3ab: ifnull 237
// 3ae: goto 3bb
// 3b1: ldc2_w 9049220561511550294
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3be: new su/catlean/tu
// 3c1: dup
// 3c2: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 3c5: aload 79
// 3c7: invokevirtual su/catlean/dl.C ()Lnet/minecraft/class_243;
// 3ca: lload 33
// 3cc: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 3cf: lload 47
// 3d1: bipush 0
// 3d2: aload 79
// 3d4: aload 75
// 3d6: invokedynamic invoke (Lsu/catlean/dl;Lnet/minecraft/class_2627;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/ur.Q (Lsu/catlean/dl;Lnet/minecraft/class_2627;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 3db: bipush 2
// 3dc: aconst_null
// 3dd: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3e0: checkcast su/catlean/t5
// 3e3: lload 51
// 3e5: dup2_x1
// 3e6: pop2
// 3e7: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 3ea: aload 73
// 3ec: ifnull 237
// 3ef: lload 16
// 3f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3f4: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 3f7: aload 77
// 3f9: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 3fc: aload 73
// 3fe: ifnonnull 419
// 401: ifeq 237
// 404: goto 411
// 407: ldc2_w 9049220561511550294
// 40a: lload 2
// 40b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 410: athrow
// 411: aload 0
// 412: lload 28
// 414: invokespecial su/catlean/ur.V (J)F
// 417: fconst_0
// 418: fcmpg
// 419: aload 73
// 41b: ifnonnull 42f
// 41e: ifne 432
// 421: goto 42e
// 424: ldc2_w 9049220561511550294
// 427: lload 2
// 428: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42d: athrow
// 42e: bipush 1
// 42f: goto 433
// 432: bipush 0
// 433: ifeq 45e
// 436: bipush 2
// 437: newarray 7
// 439: astore 80
// 43b: aload 80
// 43d: bipush 0
// 43e: lload 16
// 440: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 443: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 446: getfield net/minecraft/class_243.field_1352 D
// 449: dastore
// 44a: aload 80
// 44c: bipush 1
// 44d: lload 16
// 44f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 452: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 455: getfield net/minecraft/class_243.field_1350 D
// 458: dastore
// 459: aload 80
// 45b: goto 47e
// 45e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 461: aload 0
// 462: lload 28
// 464: invokespecial su/catlean/ur.V (J)F
// 467: bipush 0
// 468: fconst_0
// 469: lload 14
// 46b: fconst_0
// 46c: fconst_0
// 46d: sipush 8240
// 470: ldc2_w 3769706147596528121
// 473: lload 2
// 474: lxor
// 475: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47a: aconst_null
// 47b: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 47e: astore 79
// 480: lload 16
// 482: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 485: aload 79
// 487: bipush 0
// 488: daload
// 489: aload 0
// 48a: lload 12
// 48c: invokespecial su/catlean/ur.i (J)F
// 48f: f2d
// 490: aload 79
// 492: bipush 1
// 493: daload
// 494: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 497: new net/minecraft/class_2815
// 49a: dup
// 49b: lload 16
// 49d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a0: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 4a3: getfield net/minecraft/class_1703.field_7763 I
// 4a6: invokespecial net/minecraft/class_2815.<init> (I)V
// 4a9: checkcast net/minecraft/class_2596
// 4ac: lload 37
// 4ae: dup2_x1
// 4af: pop2
// 4b0: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 4b3: aload 73
// 4b5: ifnull 237
// 4b8: aload 0
// 4b9: lload 45
// 4bb: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 4be: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 4c1: if_acmpne 9ff
// 4c4: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 4c7: lload 35
// 4c9: invokevirtual su/catlean/gg.O (J)I
// 4cc: goto 4d9
// 4cf: ldc2_w 9049220561511550294
// 4d2: lload 2
// 4d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d8: athrow
// 4d9: istore 74
// 4db: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 4de: bipush 1
// 4df: anewarray 592
// 4e2: astore 76
// 4e4: aload 76
// 4e6: bipush 0
// 4e7: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 4ea: dup
// 4eb: sipush 8914
// 4ee: ldc2_w 405307348322178838
// 4f1: lload 2
// 4f2: lxor
// 4f3: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4fb: aastore
// 4fc: aload 76
// 4fe: iload 30
// 500: i2c
// 501: lload 31
// 503: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 506: astore 75
// 508: aload 73
// 50a: ifnonnull 5ad
// 50d: iload 74
// 50f: iflt 59a
// 512: goto 51f
// 515: ldc2_w 9049220561511550294
// 518: lload 2
// 519: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51e: athrow
// 51f: aload 75
// 521: invokevirtual su/catlean/fg.R ()Z
// 524: aload 73
// 526: ifnonnull 55b
// 529: goto 536
// 52c: ldc2_w 9049220561511550294
// 52f: lload 2
// 530: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 535: athrow
// 536: ifeq 59a
// 539: goto 546
// 53c: ldc2_w 9049220561511550294
// 53f: lload 2
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: lload 16
// 548: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 54b: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 54e: goto 55b
// 551: ldc2_w 9049220561511550294
// 554: lload 2
// 555: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55a: athrow
// 55b: aload 73
// 55d: ifnonnull 585
// 560: ifne 59a
// 563: goto 570
// 566: ldc2_w 9049220561511550294
// 569: lload 2
// 56a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56f: athrow
// 570: lload 16
// 572: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 575: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 578: goto 585
// 57b: ldc2_w 9049220561511550294
// 57e: lload 2
// 57f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 584: athrow
// 585: aload 73
// 587: ifnonnull 5d5
// 58a: ifeq 5ae
// 58d: goto 59a
// 590: ldc2_w 9049220561511550294
// 593: lload 2
// 594: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 599: athrow
// 59a: aload 0
// 59b: lload 39
// 59d: invokevirtual su/catlean/ur.d (J)V
// 5a0: goto 5ad
// 5a3: ldc2_w 9049220561511550294
// 5a6: lload 2
// 5a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ac: athrow
// 5ad: return
// 5ae: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 5b1: new su/catlean/_w
// 5b4: dup
// 5b5: lload 16
// 5b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5ba: invokevirtual net/minecraft/class_746.method_36454 ()F
// 5bd: lload 60
// 5bf: ldc -90.0
// 5c1: bipush 0
// 5c2: getstatic su/catlean/z3.FORCE Lsu/catlean/z3;
// 5c5: bipush 4
// 5c6: aconst_null
// 5c7: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 5ca: bipush 0
// 5cb: lload 6
// 5cd: dup2_x2
// 5ce: pop2
// 5cf: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 5d2: getstatic su/catlean/ur.U I
// 5d5: aload 73
// 5d7: ifnonnull 679
// 5da: aload 0
// 5db: lload 4
// 5dd: invokespecial su/catlean/ur.p (J)I
// 5e0: bipush 1
// 5e1: isub
// 5e2: if_icmple 671
// 5e5: goto 5f2
// 5e8: ldc2_w 9049220561511550294
// 5eb: lload 2
// 5ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f1: athrow
// 5f2: getstatic su/catlean/ur.U I
// 5f5: istore 76
// 5f7: iload 76
// 5f9: bipush 1
// 5fa: iadd
// 5fb: putstatic su/catlean/ur.U I
// 5fe: iload 76
// 600: aload 73
// 602: ifnonnull 644
// 605: aload 0
// 606: lload 4
// 608: invokespecial su/catlean/ur.p (J)I
// 60b: bipush 5
// 60c: iadd
// 60d: if_icmple 670
// 610: goto 61d
// 613: ldc2_w 9049220561511550294
// 616: lload 2
// 617: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61c: athrow
// 61d: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 620: aload 73
// 622: ifnonnull 64a
// 625: goto 632
// 628: ldc2_w 9049220561511550294
// 62b: lload 2
// 62c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 631: athrow
// 632: lload 18
// 634: invokevirtual su/catlean/_n.f (J)Z
// 637: goto 644
// 63a: ldc2_w 9049220561511550294
// 63d: lload 2
// 63e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 643: athrow
// 644: ifeq 66a
// 647: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 64a: lload 55
// 64c: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 64f: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 652: if_acmpne 66a
// 655: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 658: lload 26
// 65a: invokevirtual su/catlean/dm.F (J)V
// 65d: goto 66a
// 660: ldc2_w 9049220561511550294
// 663: lload 2
// 664: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 669: athrow
// 66a: aload 0
// 66b: lload 39
// 66d: invokevirtual su/catlean/ur.d (J)V
// 670: return
// 671: lload 16
// 673: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 676: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 679: aload 73
// 67b: ifnonnull 701
// 67e: ifeq 6f9
// 681: goto 68e
// 684: ldc2_w 9049220561511550294
// 687: lload 2
// 688: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68d: athrow
// 68e: lload 43
// 690: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 693: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 696: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 699: aload 73
// 69b: ifnonnull 6d6
// 69e: goto 6ab
// 6a1: ldc2_w 9049220561511550294
// 6a4: lload 2
// 6a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6aa: athrow
// 6ab: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 6ae: ifne 6f8
// 6b1: goto 6be
// 6b4: ldc2_w 9049220561511550294
// 6b7: lload 2
// 6b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6bd: athrow
// 6be: lload 43
// 6c0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6c3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 6c6: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 6c9: goto 6d6
// 6cc: ldc2_w 9049220561511550294
// 6cf: lload 2
// 6d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d5: athrow
// 6d6: bipush 1
// 6d7: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 6da: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 6dd: lload 66
// 6df: bipush 3
// 6e0: bipush 0
// 6e1: bipush 0
// 6e2: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/ur.E ()V, ()V ]
// 6e7: sipush 17943
// 6ea: ldc2_w 2959326704994193361
// 6ed: lload 2
// 6ee: lxor
// 6ef: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f4: aconst_null
// 6f5: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 6f8: return
// 6f9: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 6fc: lload 18
// 6fe: invokevirtual su/catlean/_n.f (J)Z
// 701: aload 73
// 703: ifnonnull 777
// 706: ifeq 76e
// 709: goto 716
// 70c: ldc2_w 9049220561511550294
// 70f: lload 2
// 710: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 715: athrow
// 716: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 719: lload 55
// 71b: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 71e: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 721: if_acmpne 76e
// 724: goto 731
// 727: ldc2_w 9049220561511550294
// 72a: lload 2
// 72b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 730: athrow
// 731: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 734: lload 24
// 736: invokevirtual su/catlean/dm.Y (J)Z
// 739: aload 73
// 73b: ifnonnull 777
// 73e: goto 74b
// 741: ldc2_w 9049220561511550294
// 744: lload 2
// 745: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74a: athrow
// 74b: ifeq 76e
// 74e: goto 75b
// 751: ldc2_w 9049220561511550294
// 754: lload 2
// 755: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75a: athrow
// 75b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 75e: lload 53
// 760: invokevirtual su/catlean/dm.D (J)V
// 763: return
// 764: ldc2_w 9049220561511550294
// 767: lload 2
// 768: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76d: athrow
// 76e: getstatic su/catlean/ur.f Lsu/catlean/i9;
// 771: bipush 4
// 772: lload 64
// 774: invokevirtual su/catlean/i9.e (IJ)Z
// 777: aload 73
// 779: ifnonnull 78e
// 77c: ifeq 9ff
// 77f: goto 78c
// 782: ldc2_w 9049220561511550294
// 785: lload 2
// 786: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78b: athrow
// 78c: iload 74
// 78e: sipush 23711
// 791: ldc2_w 5461883815029052765
// 794: lload 2
// 795: lxor
// 796: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79b: aload 73
// 79d: ifnonnull 89c
// 7a0: if_icmplt 86f
// 7a3: goto 7b0
// 7a6: ldc2_w 9049220561511550294
// 7a9: lload 2
// 7aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7af: athrow
// 7b0: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 7b3: bipush 1
// 7b4: invokevirtual su/catlean/_n.m (Z)V
// 7b7: iload 74
// 7b9: sipush 27530
// 7bc: ldc2_w 1085969039482200649
// 7bf: lload 2
// 7c0: lxor
// 7c1: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c6: isub
// 7c7: istore 76
// 7c9: sipush 17943
// 7cc: ldc2_w 2959326704994193361
// 7cf: lload 2
// 7d0: lxor
// 7d1: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d6: iload 76
// 7d8: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 7db: bipush 1
// 7dc: lload 22
// 7de: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 7e1: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 7e4: bipush 1
// 7e5: invokevirtual su/catlean/qc.K (Z)V
// 7e8: lload 16
// 7ea: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7ed: invokevirtual net/minecraft/class_746.method_23669 ()V
// 7f0: new net/minecraft/class_2848
// 7f3: dup
// 7f4: lload 16
// 7f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7f9: checkcast net/minecraft/class_1297
// 7fc: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 7ff: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 802: checkcast net/minecraft/class_2596
// 805: lload 37
// 807: dup2_x1
// 808: pop2
// 809: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 80c: getstatic su/catlean/ur.U I
// 80f: aload 73
// 811: ifnonnull 85a
// 814: ifne 84d
// 817: goto 824
// 81a: ldc2_w 9049220561511550294
// 81d: lload 2
// 81e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 823: athrow
// 824: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 827: aload 0
// 828: iload 57
// 82a: i2c
// 82b: iload 58
// 82d: iload 59
// 82f: i2c
// 830: invokespecial su/catlean/ur.j (CIC)Z
// 833: aload 0
// 834: lload 8
// 836: invokespecial su/catlean/ur.s (J)Z
// 839: lload 20
// 83b: dup2_x1
// 83c: pop2
// 83d: invokevirtual su/catlean/uy.k (ZJZ)V
// 840: goto 84d
// 843: ldc2_w 9049220561511550294
// 846: lload 2
// 847: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84c: athrow
// 84d: sipush 17943
// 850: ldc2_w 2959326704994193361
// 853: lload 2
// 854: lxor
// 855: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85a: iload 76
// 85c: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 85f: bipush 1
// 860: lload 22
// 862: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 865: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 868: bipush 0
// 869: invokevirtual su/catlean/_n.m (Z)V
// 86c: goto 9f3
// 86f: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 872: bipush 1
// 873: invokevirtual su/catlean/_n.m (Z)V
// 876: iload 74
// 878: lload 49
// 87a: bipush 0
// 87b: aconst_null
// 87c: bipush 0
// 87d: sipush 31782
// 880: ldc2_w 8194235853214823912
// 883: lload 2
// 884: lxor
// 885: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88a: aconst_null
// 88b: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 88e: sipush 17943
// 891: ldc2_w 2959326704994193361
// 894: lload 2
// 895: lxor
// 896: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89b: bipush 0
// 89c: aconst_null
// 89d: bipush 0
// 89e: sipush 13857
// 8a1: ldc2_w 7066490269364977632
// 8a4: lload 2
// 8a5: lxor
// 8a6: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ab: aconst_null
// 8ac: astore 68
// 8ae: istore 69
// 8b0: istore 70
// 8b2: astore 71
// 8b4: istore 72
// 8b6: lload 49
// 8b8: iload 72
// 8ba: aload 71
// 8bc: iload 70
// 8be: iload 69
// 8c0: aload 68
// 8c2: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 8c5: aload 0
// 8c6: lload 10
// 8c8: invokespecial su/catlean/ur.t (J)Z
// 8cb: aload 73
// 8cd: ifnonnull 933
// 8d0: ifne 905
// 8d3: goto 8e0
// 8d6: ldc2_w 9049220561511550294
// 8d9: lload 2
// 8da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8df: athrow
// 8e0: iload 74
// 8e2: lload 49
// 8e4: bipush 0
// 8e5: aconst_null
// 8e6: bipush 1
// 8e7: sipush 17943
// 8ea: ldc2_w 2959326704994193361
// 8ed: lload 2
// 8ee: lxor
// 8ef: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f4: aconst_null
// 8f5: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 8f8: goto 905
// 8fb: ldc2_w 9049220561511550294
// 8fe: lload 2
// 8ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 904: athrow
// 905: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 908: bipush 1
// 909: invokevirtual su/catlean/qc.K (Z)V
// 90c: lload 16
// 90e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 911: invokevirtual net/minecraft/class_746.method_23669 ()V
// 914: new net/minecraft/class_2848
// 917: dup
// 918: lload 16
// 91a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 91d: checkcast net/minecraft/class_1297
// 920: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 923: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 926: checkcast net/minecraft/class_2596
// 929: lload 37
// 92b: dup2_x1
// 92c: pop2
// 92d: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 930: getstatic su/catlean/ur.U I
// 933: aload 73
// 935: ifnonnull 977
// 938: ifne 971
// 93b: goto 948
// 93e: ldc2_w 9049220561511550294
// 941: lload 2
// 942: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 947: athrow
// 948: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 94b: aload 0
// 94c: iload 57
// 94e: i2c
// 94f: iload 58
// 951: iload 59
// 953: i2c
// 954: invokespecial su/catlean/ur.j (CIC)Z
// 957: aload 0
// 958: lload 8
// 95a: invokespecial su/catlean/ur.s (J)Z
// 95d: lload 20
// 95f: dup2_x1
// 960: pop2
// 961: invokevirtual su/catlean/uy.k (ZJZ)V
// 964: goto 971
// 967: ldc2_w 9049220561511550294
// 96a: lload 2
// 96b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 970: athrow
// 971: aload 0
// 972: lload 10
// 974: invokespecial su/catlean/ur.t (J)Z
// 977: aload 73
// 979: ifnonnull 9d6
// 97c: ifne 9b1
// 97f: goto 98c
// 982: ldc2_w 9049220561511550294
// 985: lload 2
// 986: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98b: athrow
// 98c: iload 74
// 98e: lload 49
// 990: bipush 0
// 991: aconst_null
// 992: bipush 0
// 993: sipush 13857
// 996: ldc2_w 7066490269364977632
// 999: lload 2
// 99a: lxor
// 99b: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a0: aconst_null
// 9a1: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 9a4: goto 9b1
// 9a7: ldc2_w 9049220561511550294
// 9aa: lload 2
// 9ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b0: athrow
// 9b1: sipush 17943
// 9b4: ldc2_w 2959326704994193361
// 9b7: lload 2
// 9b8: lxor
// 9b9: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9be: lload 49
// 9c0: bipush 0
// 9c1: aconst_null
// 9c2: bipush 0
// 9c3: sipush 13857
// 9c6: ldc2_w 7066490269364977632
// 9c9: lload 2
// 9ca: lxor
// 9cb: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d0: aconst_null
// 9d1: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 9d4: iload 74
// 9d6: lload 49
// 9d8: bipush 0
// 9d9: aconst_null
// 9da: bipush 1
// 9db: sipush 17943
// 9de: ldc2_w 2959326704994193361
// 9e1: lload 2
// 9e2: lxor
// 9e3: invokedynamic e (IJ)I bsm=su/catlean/ur.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e8: aconst_null
// 9e9: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 9ec: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 9ef: bipush 0
// 9f0: invokevirtual su/catlean/_n.m (Z)V
// 9f3: getstatic su/catlean/ur.U I
// 9f6: istore 76
// 9f8: iload 76
// 9fa: bipush 1
// 9fb: iadd
// 9fc: putstatic su/catlean/ur.U I
// 9ff: return
}

@Flow
private final void Q(FireWorkVelocityEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 53223138779210
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 126629004303474
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 86645177250769
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 2440359090507280691
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnonnull 50
// 28: aload 0
// 29: lload 4
// 2b: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 2e: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 31: if_acmpeq 4c
// 34: goto 41
// 37: ldc2_w 2432511555199422721
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: return
// 42: ldc2_w 2432511555199422721
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: aload 1
// 4d: invokevirtual su/catlean/api/event/events/world/FireWorkVelocityEvent.cancel ()V
// 50: lload 6
// 52: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 55: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 58: dup
// 59: sipush 21255
// 5c: ldc2_w 6518003133738220168
// 5f: lload 2
// 60: lxor
// 61: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 69: astore 9
// 6b: aload 1
// 6c: lload 6
// 6e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 71: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 74: aload 9
// 76: getfield net/minecraft/class_243.field_1352 D
// 79: dneg
// 7a: ldc2_w 0.5
// 7d: dmul
// 7e: ldc2_w 0.1
// 81: ldc2_w 1.5
// 84: aload 9
// 86: getfield net/minecraft/class_243.field_1351 D
// 89: dsub
// 8a: ldc2_w 0.5
// 8d: dmul
// 8e: dadd
// 8f: aload 9
// 91: getfield net/minecraft/class_243.field_1350 D
// 94: dneg
// 95: ldc2_w 0.5
// 98: dmul
// 99: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 9c: invokevirtual su/catlean/api/event/events/world/FireWorkVelocityEvent.setVelocity (Lnet/minecraft/class_243;)V
// 9f: return
}

@Flow
private final void I(PreElytraEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 65669001180591
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 132994332019095
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 75950527735348
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 3763019687583016150
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnonnull 61
// 28: aload 0
// 29: lload 4
// 2b: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 2e: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 31: if_acmpeq 4c
// 34: goto 41
// 37: ldc2_w 3757989461536457956
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: return
// 42: ldc2_w 3757989461536457956
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: lload 6
// 4e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 51: invokevirtual net/minecraft/class_746.method_36455 ()F
// 54: putstatic su/catlean/ur.a F
// 57: lload 6
// 59: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5c: ldc -90.0
// 5e: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 61: return
}

@Flow
private final void I(AfterElytraEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 73717621707632
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 306523008840
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 67765555871979
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 1362223187453329929
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnonnull 57
// 28: aload 0
// 29: lload 4
// 2b: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 2e: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 31: if_acmpeq 4c
// 34: goto 41
// 37: ldc2_w 1366973549265412667
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: return
// 42: ldc2_w 1366973549265412667
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: lload 6
// 4e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 51: getstatic su/catlean/ur.a F
// 54: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 57: return
}

@Flow
private final void a(SetPoseEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ur.d J
// 03: ldc2_w 66708335921193
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 140631594546193
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 5313941232743455056
// 14: lload 2
// 15: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: astore 6
// 1c: aload 6
// 1e: ifnonnull 50
// 21: aload 0
// 22: lload 4
// 24: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 27: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 2a: if_acmpeq 45
// 2d: goto 3a
// 30: ldc2_w 5305531264870955362
// 33: lload 2
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: return
// 3b: ldc2_w 5305531264870955362
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 1
// 46: invokevirtual su/catlean/api/event/events/player/SetPoseEvent.cancel ()V
// 49: aload 1
// 4a: getstatic net/minecraft/class_4050.field_18076 Lnet/minecraft/class_4050;
// 4d: invokevirtual su/catlean/api/event/events/player/SetPoseEvent.setPose (Lnet/minecraft/class_4050;)V
// 50: return
}

@Flow
private final void y(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ur.d J
// 003: ldc2_w 41828865356537
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 111359580638913
// 00d: lxor
// 00e: lstore 4
// 010: pop2
// 011: ldc2_w -905518446631312512
// 014: lload 2
// 015: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01a: astore 6
// 01c: aload 0
// 01d: lload 4
// 01f: invokespecial su/catlean/ur.q (J)Lsu/catlean/le;
// 022: getstatic su/catlean/le.ELYTRA Lsu/catlean/le;
// 025: if_acmpeq 033
// 028: return
// 029: ldc2_w -904922035990363214
// 02c: lload 2
// 02d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: athrow
// 033: aload 1
// 034: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 037: aload 6
// 039: ifnonnull 060
// 03c: instanceof net/minecraft/class_2767
// 03f: ifeq 1bb
// 042: goto 04f
// 045: ldc2_w -904922035990363214
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: aload 1
// 050: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 053: goto 060
// 056: ldc2_w -904922035990363214
// 059: lload 2
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: checkcast net/minecraft/class_2767
// 063: invokevirtual net/minecraft/class_2767.method_11894 ()Lnet/minecraft/class_6880;
// 066: dup
// 067: sipush 5665
// 06a: ldc2_w 8805668650183879949
// 06d: lload 2
// 06e: lxor
// 06f: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ur.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 077: astore 7
// 079: aload 7
// 07b: getstatic net/minecraft/class_3417.field_14966 Lnet/minecraft/class_6880;
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 081: aload 6
// 083: ifnonnull 0ab
// 086: ifne 1aa
// 089: goto 096
// 08c: ldc2_w -904922035990363214
// 08f: lload 2
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 7
// 098: getstatic net/minecraft/class_3417.field_21866 Lnet/minecraft/class_6880;
// 09b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09e: goto 0ab
// 0a1: ldc2_w -904922035990363214
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 6
// 0ad: ifnonnull 0d5
// 0b0: ifne 1aa
// 0b3: goto 0c0
// 0b6: ldc2_w -904922035990363214
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 7
// 0c2: getstatic net/minecraft/class_3417.field_15103 Lnet/minecraft/class_6880;
// 0c5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c8: goto 0d5
// 0cb: ldc2_w -904922035990363214
// 0ce: lload 2
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: aload 6
// 0d7: ifnonnull 0ff
// 0da: ifne 1aa
// 0dd: goto 0ea
// 0e0: ldc2_w -904922035990363214
// 0e3: lload 2
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: aload 7
// 0ec: getstatic net/minecraft/class_3417.field_14761 Lnet/minecraft/class_6880;
// 0ef: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f2: goto 0ff
// 0f5: ldc2_w -904922035990363214
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: aload 6
// 101: ifnonnull 129
// 104: ifne 1aa
// 107: goto 114
// 10a: ldc2_w -904922035990363214
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: aload 7
// 116: getstatic net/minecraft/class_3417.field_14862 Lnet/minecraft/class_6880;
// 119: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11c: goto 129
// 11f: ldc2_w -904922035990363214
// 122: lload 2
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: aload 6
// 12b: ifnonnull 153
// 12e: ifne 1aa
// 131: goto 13e
// 134: ldc2_w -904922035990363214
// 137: lload 2
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: aload 7
// 140: getstatic net/minecraft/class_3417.field_14883 Lnet/minecraft/class_6880;
// 143: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 146: goto 153
// 149: ldc2_w -904922035990363214
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: aload 6
// 155: ifnonnull 17d
// 158: ifne 1aa
// 15b: goto 168
// 15e: ldc2_w -904922035990363214
// 161: lload 2
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: aload 7
// 16a: getstatic net/minecraft/class_3417.field_15191 Lnet/minecraft/class_6880;
// 16d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 170: goto 17d
// 173: ldc2_w -904922035990363214
// 176: lload 2
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 6
// 17f: ifnonnull 1a7
// 182: ifne 1aa
// 185: goto 192
// 188: ldc2_w -904922035990363214
// 18b: lload 2
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: aload 7
// 194: getstatic net/minecraft/class_3417.field_14581 Lnet/minecraft/class_6880;
// 197: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 19a: goto 1a7
// 19d: ldc2_w -904922035990363214
// 1a0: lload 2
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: ifeq 1bb
// 1aa: aload 1
// 1ab: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 1ae: goto 1bb
// 1b1: ldc2_w -904922035990363214
// 1b4: lload 2
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: return
}

private static final boolean I() {
long var0 = d ^ 56301280995484L;
long var2 = var0 ^ 123662028805284L;

try {
if (o.q(var2) == le.ELYTRA) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 7571684622781422039L, var0);
}

return false;
}

private static final boolean H() {
long var0 = d ^ 96986238940748L;
long var2 = var0 ^ 30209605094004L;

try {
if (o.q(var2) == le.ELYTRA) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 4018455573625816839L, var0);
}

return false;
}

private static final boolean w() {
long var0 = d ^ 127428007387483L;
long var2 = var0 ^ 53505688296803L;

try {
if (o.q(var2) == le.ELYTRA) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -6858058789670924272L, var0);
}

return false;
}

private static final boolean A() {
long var0 = d ^ 47979525868220L;
long var2 = var0 ^ 115379935295108L;

try {
if (o.q(var2) == le.ELYTRA) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 5418991006365170679L, var0);
}

return false;
}

private static final Unit Q(dl var0, class_2627 var1) {
long var2 = d ^ 4474105887526L;
int var4 = (int)((var2 ^ 113416018532786L) >>> 32);
long var5 = (var2 ^ 113416018532786L) << 32 >>> 32;
long var7 = var2 ^ 134947473516733L;
zf.Z(var4, var5).method_2896(zf.v(var7), class_1268.field_5808, new class_3965(var0.C(), var0.e(), var1.method_11016(), false));
zf.v(var7).method_6104(class_1268.field_5808);
b = true;
return Unit.INSTANCE;
}

private static final void E() {
long var0 = d ^ 30365334917434L;
long var2 = var0 ^ 76494172015751L;
long var10001 = var0 ^ 96528573698733L;
int var4 = (int)((var0 ^ 96528573698733L) >>> 48);
int var5 = (int)((var0 ^ 96528573698733L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);

try {
if (!bx.k((short)var4, var5, (char)var6, c<"e">(3778, 1981134557725108781L ^ var0))) {
zf.F(var2).field_1690.field_1903.method_23481(false);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -8020295600292077455L, var0);
}
}

static {
long var20 = d ^ 137015487688895L;
long var22 = var20 ^ 26109479282255L;
long var24 = var20 ^ 54605712451170L;
long var26 = var20 ^ 59025234294999L;
long var28 = var20 ^ 6207428130457L;
long var30 = var20 ^ 46191981427711L;
long var32 = var20 ^ 116145115629179L;
long var34 = var20 ^ 75698684382253L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[30];
int var16 = 0;
String var15 = "ßF¸³^ \u0012Ökn,[\u0001kïSM \u00880\u000f\u0086\u001f\u0098(^ü\u0003ÒZA\u0085\u0003iA(\u0083\u0001Ö\nì]>ß{¿ò%]\u009b}\u009f£Á&\u001cª\u00adïÚW\u00adSPE\u0018\u0007åBÖâís4§!\t\u0017\u0014=.ÚmÒ5É.Éâ¦ åWç*`_\u00891÷Ê¡\u0087â\u0097p²\u009b>7¶UZ\f¦Ä5,+\u00ad \u0085Ú ?á#\u0016É¨\u001e4\u0010·{9ùn¿òÑñ{[\u0095R\u008fD\u009aÛ\u0090úþEµp É6w*¦Ápº\u009f\u0010Ôgh \bÏ\u0097Á\u001eÍÈóSÂ\u0095°©£kÒPÈ ¯\u0019EK\u0000Wk9~ØÂz Ê\u0007\u008cÈc\u001c*\tÀK\u008cù\u0098ÎTÝ?\u0010\u0096\u0010P\n\u0082D-\u00169\u001bv÷$S%%^È \u001ek\fÂB\u009d\u001fããñEC¿ª\u0089\u0096Ûcª®\u000bûMÜ>)¿\u0011I¾p\u008d\u0010½&é\u0004Òu;\u0017f\u0091\u0005*=\u001e\u0005'(\u009bóÕ\u0014\fÊb \u009e\u0007ÇÌ°\u0003aiQ\u0001*Ç¦}¤íÇÔÅ\u0018\u008726cº\u0092R\u00936Ñ\u001f( 7Mþ)vï2cu\u0090X\u0011µø\u0083á6¾F\u008b\u0083E÷T&·E\u000f*}$= PEm\u008e\u009a\u0089>OÇTà\u00100Ì^¿\u0094:E\u008e\u000fÝ^ØC\u0088Z\u0080¾Ul¥ %/\u0006\u0096¶ \u0013Ö2¹/\u009dôqöâ\u008f\u008cvU@\u001ar\u009c\u0088ÏKë\u0086á\u0010Ì0â\t\u009dÛ%µ0Þä,(²CÃ\u001eÃ&4¯$»äuvk~»#·áj·Mó!6Úá\u000e4ÓÖi-é&,Z\u0018\u0092\u0080Ùqþ\u008c\u009b\fvéÄ\u0001Ä\u0001\u0090Ã±§Ãµ\u008c/þv(ÝW\u0017èë\u0016¨\u0003\u0092Zã`\\/\u0093?ÔJ\u00938WÒQ}\u0099\u0082+¥§·Ø-ò¡¤Ò\u0089Bb\u0017 \u009e\u0016ìßõ\tÃgÂk\u0007üÏu\fU¯H±\f\u000f'\u00990kl¼ê\u0090\u0087üº HÎ\u008aì¶\u00983Nú[èÈäpüäÇ\u0094ÔcK(Ñ~\u0014¬:D\u000e(5M 3çËÕ¸ât\u0016\r&\u008b\u001dçHídDc4æu|\f.bõ8´û\u009c&ù\u0010±:h<\u0080\tÿ+\u007fþ\u0090\u0093^ç\u009fï(Òû\u0001>ßÚÓ\b{æ¹\u009b³öËö\u001c\u0097\u0095øú\u0091ÔÓ'kÿæd\u001b~¡aÀÞ\u000e,Ûò/8\u0094»Zÿ£$È\u007fÿ0Ã{\u0096\u0010\u0016jQ\u0005\u001cs\u001a\n\u0007Ü\u0004Ñ\u008cá¥ÇK\u008c\u0011×,ÕebÜg5iÌ\u009açÂ\u0011\u0088Rx\u001etÌ{@¾\u0018È*\u0013\u0096xå<Â\rZÒ¡ÿ_\u009a}jÐp\u0003_\u0004\u000f¡ =\u0086\u0084\u001f¶Y\u0091\n\u0086\u0007\u000eeÑÑU\u00adz\b-\u009c\u008aã?l\tÁpè\u0094\u0087»u( LFÇN (\u007fÀ\u00ad\u0097?j PÏÊ¢L\u000bP\u0002s~\u009b«cÂpOÓ¶+Wìñz²ì±\u0010Ív±^\u008eÑ\u009f±\u0007£qP9Yòù\u0010O\tÉ|\u0003æ\u0097Â\u0082-ÞKÜí]õ";
int var17 = "ßF¸³^ \u0012Ökn,[\u0001kïSM \u00880\u000f\u0086\u001f\u0098(^ü\u0003ÒZA\u0085\u0003iA(\u0083\u0001Ö\nì]>ß{¿ò%]\u009b}\u009f£Á&\u001cª\u00adïÚW\u00adSPE\u0018\u0007åBÖâís4§!\t\u0017\u0014=.ÚmÒ5É.Éâ¦ åWç*`_\u00891÷Ê¡\u0087â\u0097p²\u009b>7¶UZ\f¦Ä5,+\u00ad \u0085Ú ?á#\u0016É¨\u001e4\u0010·{9ùn¿òÑñ{[\u0095R\u008fD\u009aÛ\u0090úþEµp É6w*¦Ápº\u009f\u0010Ôgh \bÏ\u0097Á\u001eÍÈóSÂ\u0095°©£kÒPÈ ¯\u0019EK\u0000Wk9~ØÂz Ê\u0007\u008cÈc\u001c*\tÀK\u008cù\u0098ÎTÝ?\u0010\u0096\u0010P\n\u0082D-\u00169\u001bv÷$S%%^È \u001ek\fÂB\u009d\u001fããñEC¿ª\u0089\u0096Ûcª®\u000bûMÜ>)¿\u0011I¾p\u008d\u0010½&é\u0004Òu;\u0017f\u0091\u0005*=\u001e\u0005'(\u009bóÕ\u0014\fÊb \u009e\u0007ÇÌ°\u0003aiQ\u0001*Ç¦}¤íÇÔÅ\u0018\u008726cº\u0092R\u00936Ñ\u001f( 7Mþ)vï2cu\u0090X\u0011µø\u0083á6¾F\u008b\u0083E÷T&·E\u000f*}$= PEm\u008e\u009a\u0089>OÇTà\u00100Ì^¿\u0094:E\u008e\u000fÝ^ØC\u0088Z\u0080¾Ul¥ %/\u0006\u0096¶ \u0013Ö2¹/\u009dôqöâ\u008f\u008cvU@\u001ar\u009c\u0088ÏKë\u0086á\u0010Ì0â\t\u009dÛ%µ0Þä,(²CÃ\u001eÃ&4¯$»äuvk~»#·áj·Mó!6Úá\u000e4ÓÖi-é&,Z\u0018\u0092\u0080Ùqþ\u008c\u009b\fvéÄ\u0001Ä\u0001\u0090Ã±§Ãµ\u008c/þv(ÝW\u0017èë\u0016¨\u0003\u0092Zã`\\/\u0093?ÔJ\u00938WÒQ}\u0099\u0082+¥§·Ø-ò¡¤Ò\u0089Bb\u0017 \u009e\u0016ìßõ\tÃgÂk\u0007üÏu\fU¯H±\f\u000f'\u00990kl¼ê\u0090\u0087üº HÎ\u008aì¶\u00983Nú[èÈäpüäÇ\u0094ÔcK(Ñ~\u0014¬:D\u000e(5M 3çËÕ¸ât\u0016\r&\u008b\u001dçHídDc4æu|\f.bõ8´û\u009c&ù\u0010±:h<\u0080\tÿ+\u007fþ\u0090\u0093^ç\u009fï(Òû\u0001>ßÚÓ\b{æ¹\u009b³öËö\u001c\u0097\u0095øú\u0091ÔÓ'kÿæd\u001b~¡aÀÞ\u000e,Ûò/8\u0094»Zÿ£$È\u007fÿ0Ã{\u0096\u0010\u0016jQ\u0005\u001cs\u001a\n\u0007Ü\u0004Ñ\u008cá¥ÇK\u008c\u0011×,ÕebÜg5iÌ\u009açÂ\u0011\u0088Rx\u001etÌ{@¾\u0018È*\u0013\u0096xå<Â\rZÒ¡ÿ_\u009a}jÐp\u0003_\u0004\u000f¡ =\u0086\u0084\u001f¶Y\u0091\n\u0086\u0007\u000eeÑÑU\u00adz\b-\u009c\u008aã?l\tÁpè\u0094\u0087»u( LFÇN (\u007fÀ\u00ad\u0097?j PÏÊ¢L\u000bP\u0002s~\u009b«cÂpOÓ¶+Wìñz²ì±\u0010Ív±^\u008eÑ\u009f±\u0007£qP9Yòù\u0010O\tÉ|\u0003æ\u0097Â\u0082-ÞKÜí]õ"
.length();
char var14 = 24;
int var39 = -1;

label54:
while (true) {
String var40 = var15.substring(++var39, var39 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var40.getBytes("ISO-8859-1"));
String var51 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var51;
if ((var39 += var14) >= var17) {
e = var18;
g = new String[30];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "_M\u0019\u0081T2\u0087\u001a\u0081=Õ\u0086¶H¼H\u008c¼Ë<\u0017þ\u0005y¬Øi^¨\u008cD9|xµÞ\rD\u0089\u009e^ÙÙá\u009eç³ü\u0015>ÔlZh¾\r@\u0013NÜø\u0089l¿\u0083Vã½éd4NÆ\u00adò\u0094\u000f/s\u0098\u0080¡´ãÉø¦ÇÝ\u0099®LþY<Ù";
int var5 = "_M\u0019\u0081T2\u0087\u001a\u0081=Õ\u0086¶H¼H\u008c¼Ë<\u0017þ\u0005y¬Øi^¨\u008cD9|xµÞ\rD\u0089\u009e^ÙÙá\u009eç³ü\u0015>ÔlZh¾\r@\u0013NÜø\u0089l¿\u0083Vã½éd4NÆ\u00adò\u0094\u000f/s\u0098\u0080¡´ãÉø¦ÇÝ\u0099®LþY<Ù"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var43 = var6;
var10001 = var3++;
long var55 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var58 = -1;

while (true) {
long var8 = var55;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var60 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var58) {
case 0:
var43[var10001] = var60;
if (var2 >= var5) {
j = var6;
k = new Integer[14];
KProperty[] var36 = new KProperty[c<"e">(30291, 6049731192970900276L ^ var20)];
var36[0] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(29655, 2295795270397643429L ^ var20), b<"s">(24493, 2197136382299662040L ^ var20), 0)
);
var36[1] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(18374, 4919768214109552302L ^ var20), b<"s">(27816, 707649763922007505L ^ var20), 0)
);
var36[2] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(4962, 5347317429753752065L ^ var20), b<"s">(32116, 1551921056124322842L ^ var20), 0)
);
var36[3] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(31724, 8329160011300717204L ^ var20), b<"s">(7444, 2759031673182332010L ^ var20), 0)
);
var36[4] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(2504, 1331195847185445055L ^ var20), b<"s">(24756, 3591752194411944413L ^ var20), 0)
);
var36[5] = Reflection.property1(new PropertyReference1Impl(ur.class, b<"s">(2915, 5609396481696477697L ^ var20), b<"s">(4110, 371216118456461667L ^ var20), 0));
var36[c<"e">(25873, 6909669532884656255L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ur.class, b<"s">(9129, 7694501747454646997L ^ var20), b<"s">(25831, 229409393031536011L ^ var20), 0)
);
D = var36;
o = new ur(var32);
Y = yp.L(o, b<"s">(12936, 9180004893067971560L ^ var20), le.VANILLA, null, null, c<"e">(26635, 7834295189951311209L ^ var20), null, var34);
u = yp.k(
o, b<"s">(26867, 4134632426212020620L ^ var20), 0.42F, var26, RangesKt.rangeTo(0.1F, 20.0F), null, null, c<"e">(27785, 9120125962741934572L ^ var20), null
);
C = b5.V(
var24,
yp.k(o, b<"s">(17816, 8712267738364542188L ^ var20), 0.0F, var26, RangesKt.rangeTo(0.0F, 5.0F), null, null, c<"e">(28510, 941523469962701363L ^ var20), null),
0.0F,
b<"s">(20562, 1849095147242449187L ^ var20)
);
c = yp.t(o, b<"s">(21334, 3022246046959266341L ^ var20), false, var28, null, ur::I, 4, null);
i = yp.t(o, b<"s">(32314, 1118314200956159815L ^ var20), false, var28, null, ur::H, 4, null);
F = yp.t(o, b<"s">(3420, 8095282868005909559L ^ var20), false, var28, null, ur::w, 4, null);
J = yp.L(
o,
b<"s">(11192, 392549869670044377L ^ var20),
2,
new IntRange(1, c<"e">(27802, 6861223004950751740L ^ var20)),
var30,
null,
ur::A,
c<"e">(24999, 5286056332767257800L ^ var20),
null
);
f = new i9(var22);
return;
}
break;
default:
var43[var10001] = var60;
if (var2 < var5) {
continue label36;
}

var4 = "\u009dº¢\u0018vHã\u0002/*\u0018Í\u0016ìãÙ";
var5 = "\u009dº¢\u0018vHã\u0002/*\u0018Í\u0016ìãÙ".length();
var2 = 0;
}

byte var49 = var2;
var2 += 8;
var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
var43 = var6;
var10001 = var3++;
var55 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var58 = 0;
}
}
}

var14 = var15.charAt(var39);
break;
default:
var18[var16++] = var51;
if ((var39 += var14) < var17) {
var14 = var15.charAt(var39);
continue label54;
}

var15 = "jdM¨6\u0011ð¯¬Ôq\u009bP*\u008f'ci\u0091FÆWP\u008bã\u0097\u0089\u00974,ócn\u0083ÀÒ\u0081ÔTs ÞHh\u0098Ç¶IYÅ\u0091G6\u00adÙ-#\u0012ØÜWþ¯ÐW\u0092»S\u009aD·.¡";
var17 = "jdM¨6\u0011ð¯¬Ôq\u009bP*\u008f'ci\u0091FÆWP\u008bã\u0097\u0089\u00974,ócn\u0083ÀÒ\u0081ÔTs ÞHh\u0098Ç¶IYÅ\u0091G6\u00adÙ-#\u0012ØÜWþ¯ÐW\u0092»S\u009aD·.¡"
.length();
var14 = '(';
var39 = -1;
}

var40 = var15.substring(++var39, var39 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2352;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ur", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/ur" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13612;
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
throw new RuntimeException("su/catlean/ur", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/ur" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
