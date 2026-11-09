package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_270;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class s7 {
@NotNull
public static final s7 r;
@NotNull
private static final CopyOnWriteArrayList x;
@NotNull
private static List R;
@NotNull
private static final String[] h;
private static final long a = yz.a(-7752995345005578566L, 168533173610472466L, MethodHandles.lookup().lookupClass()).a(277559414737122L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private s7() {
}

@NotNull
public final List a() {
return R;
}

public final void S(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"r">(15069, 3948043770115643664L ^ ax));
R = <set-?>;
}

@Flow
private final void B(PlayerUpdateEvent var1) {
long var2 = a ^ 72851184697309L;
long var10001 = var2 ^ 62837082750837L;
int var4 = (int)((var2 ^ 62837082750837L) >>> 48);
int var5 = (int)((var2 ^ 62837082750837L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);
String var7 = vm.a<"Å">(5403229685894482389L, var2);

boolean var10000;
label39: {
try {
var10000 = pg.k.U((short)var4, (char)var5, var6);
if (var7 == null) {
break label39;
}

if (!var10000) {
return;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 5461148876213892672L, var2);
}

var10000 = x.isEmpty();
}

label29: {
try {
if (var7 == null) {
break label29;
}

if (var10000) {
return;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 5461148876213892672L, var2);
}

x.removeIf(s7::O);
}

Iterable var8 = x;
boolean var9 = false;
R = CollectionsKt.toMutableList(CollectionsKt.sortedWith(var8, new on()));
}

@Flow
private final void U(AfterReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s7.a J
// 003: ldc2_w 7183657525216
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 25288456706779
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 108130147543724
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 138465624203080
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 32
// 030: lshl
// 031: bipush 32
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 139205313526097
// 03c: lxor
// 03d: lstore 11
// 03f: pop2
// 040: ldc2_w -6142518409823196696
// 043: lload 2
// 044: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: astore 13
// 04b: getstatic su/catlean/pg.k Lsu/catlean/pg;
// 04e: iload 8
// 050: i2s
// 051: iload 9
// 053: i2c
// 054: iload 10
// 056: invokevirtual su/catlean/pg.U (SCI)Z
// 059: aload 13
// 05b: ifnull 088
// 05e: ifne 06f
// 061: goto 06e
// 064: ldc2_w -6056038308563757443
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: return
// 06f: aload 1
// 070: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 073: aload 13
// 075: ifnull 0ad
// 078: instanceof net/minecraft/class_5900
// 07b: goto 088
// 07e: ldc2_w -6056038308563757443
// 081: lload 2
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: ifeq 2f9
// 08b: aload 1
// 08c: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 08f: dup
// 090: sipush 7283
// 093: ldc2_w 404199958222508159
// 096: lload 2
// 097: lxor
// 098: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0a0: goto 0ad
// 0a3: ldc2_w -6056038308563757443
// 0a6: lload 2
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: checkcast net/minecraft/class_5900
// 0b0: astore 14
// 0b2: aload 14
// 0b4: aload 13
// 0b6: ifnull 0de
// 0b9: invokevirtual net/minecraft/class_5900.method_34176 ()Lnet/minecraft/class_5900$class_5901;
// 0bc: getstatic net/minecraft/class_5900$class_5901.field_29155 Lnet/minecraft/class_5900$class_5901;
// 0bf: if_acmpne 2f9
// 0c2: goto 0cf
// 0c5: ldc2_w -6056038308563757443
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: aload 14
// 0d1: goto 0de
// 0d4: ldc2_w -6056038308563757443
// 0d7: lload 2
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: invokevirtual net/minecraft/class_5900.method_34178 ()Ljava/util/Collection;
// 0e1: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
// 0e6: astore 15
// 0e8: aload 15
// 0ea: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ef: ifeq 2f9
// 0f2: aload 15
// 0f4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f9: checkcast java/lang/String
// 0fc: astore 16
// 0fe: new su/catlean/ds
// 101: dup
// 102: new com/mojang/authlib/GameProfile
// 105: dup
// 106: sipush 597
// 109: ldc2_w 6535799782631247486
// 10c: lload 2
// 10d: lxor
// 10e: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
// 116: aload 16
// 118: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
// 11b: lload 6
// 11d: bipush 1
// 11e: invokespecial su/catlean/ds.<init> (Lcom/mojang/authlib/GameProfile;JZ)V
// 121: astore 17
// 123: aload 17
// 125: invokevirtual su/catlean/ds.V ()Lcom/mojang/authlib/GameProfile;
// 128: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 12b: lload 11
// 12d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 130: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 133: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 136: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 139: aload 13
// 13b: ifnull 17b
// 13e: ifeq 14f
// 141: goto 14e
// 144: ldc2_w -6056038308563757443
// 147: lload 2
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: return
// 14f: aload 14
// 151: invokevirtual net/minecraft/class_5900.method_34179 ()Ljava/util/Optional;
// 154: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 157: checkcast net/minecraft/class_5900$class_5902
// 15a: invokevirtual net/minecraft/class_5900$class_5902.method_34187 ()Lnet/minecraft/class_2561;
// 15d: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 162: dup
// 163: sipush 3492
// 166: ldc2_w 1782305924224123285
// 169: lload 2
// 16a: lxor
// 16b: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 173: checkcast java/lang/CharSequence
// 176: invokeinterface java/lang/CharSequence.length ()I 1
// 17b: aload 13
// 17d: ifnull 191
// 180: ifle 194
// 183: goto 190
// 186: ldc2_w -6056038308563757443
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: bipush 1
// 191: goto 195
// 194: bipush 0
// 195: ifeq 0e8
// 198: aload 0
// 199: aload 17
// 19b: invokevirtual su/catlean/ds.o ()Lnet/minecraft/class_640;
// 19e: lload 4
// 1a0: dup2_x1
// 1a1: pop2
// 1a2: invokevirtual su/catlean/s7.g (JLnet/minecraft/class_640;)Lnet/minecraft/class_5250;
// 1a5: invokevirtual net/minecraft/class_5250.getString ()Ljava/lang/String;
// 1a8: dup
// 1a9: sipush 20008
// 1ac: ldc2_w 8731106428974809624
// 1af: lload 2
// 1b0: lxor
// 1b1: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b9: astore 20
// 1bb: invokestatic java/util/Locale.getDefault ()Ljava/util/Locale;
// 1be: dup
// 1bf: sipush 29721
// 1c2: ldc2_w 6703279000038078525
// 1c5: lload 2
// 1c6: lxor
// 1c7: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1cf: aload 20
// 1d1: swap
// 1d2: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 1d5: dup
// 1d6: sipush 8934
// 1d9: ldc2_w 538995599157309132
// 1dc: lload 2
// 1dd: lxor
// 1de: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e6: invokestatic net/minecraft/class_3544.method_15440 (Ljava/lang/String;)Ljava/lang/String;
// 1e9: dup
// 1ea: sipush 8801
// 1ed: ldc2_w 1154308969033379395
// 1f0: lload 2
// 1f1: lxor
// 1f2: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1fa: checkcast java/lang/CharSequence
// 1fd: astore 19
// 1ff: new kotlin/text/Regex
// 202: dup
// 203: ldc " "
// 205: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
// 208: astore 20
// 20a: bipush 0
// 20b: istore 21
// 20d: aload 20
// 20f: aload 19
// 211: iload 21
// 213: invokevirtual kotlin/text/Regex.split (Ljava/lang/CharSequence;I)Ljava/util/List;
// 216: astore 19
// 218: nop
// 219: bipush 0
// 21a: istore 20
// 21c: aload 19
// 21e: aload 13
// 220: ifnull 247
// 223: invokeinterface java/util/List.isEmpty ()Z 1
// 228: ifne 2a2
// 22b: goto 238
// 22e: ldc2_w -6056038308563757443
// 231: lload 2
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: aload 19
// 23a: goto 247
// 23d: ldc2_w -6056038308563757443
// 240: lload 2
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 19
// 249: invokeinterface java/util/List.size ()I 1
// 24e: invokeinterface java/util/List.listIterator (I)Ljava/util/ListIterator; 2
// 253: astore 21
// 255: aload 21
// 257: invokeinterface java/util/ListIterator.hasPrevious ()Z 1
// 25c: ifeq 2a2
// 25f: aload 21
// 261: invokeinterface java/util/ListIterator.previous ()Ljava/lang/Object; 1
// 266: checkcast java/lang/String
// 269: astore 22
// 26b: bipush 0
// 26c: istore 23
// 26e: aload 22
// 270: checkcast java/lang/CharSequence
// 273: invokeinterface java/lang/CharSequence.length ()I 1
// 278: aload 13
// 27a: ifnull 281
// 27d: ifne 284
// 280: bipush 1
// 281: goto 285
// 284: bipush 0
// 285: nop
// 286: ifne 255
// 289: aload 19
// 28b: checkcast java/lang/Iterable
// 28e: aload 21
// 290: invokeinterface java/util/ListIterator.nextIndex ()I 1
// 295: bipush 1
// 296: iadd
// 297: invokestatic kotlin/collections/CollectionsKt.take (Ljava/lang/Iterable;I)Ljava/util/List;
// 29a: aload 13
// 29c: ifnull 266
// 29f: goto 2a5
// 2a2: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 2a5: checkcast java/util/Collection
// 2a8: astore 19
// 2aa: sipush 13535
// 2ad: nop
// 2ae: ldc2_w 4838054831841338943
// 2b1: lload 2
// 2b2: lxor
// 2b3: bipush 0
// 2b4: istore 20
// 2b6: aload 19
// 2b8: astore 21
// 2ba: aload 21
// 2bc: bipush 0
// 2bd: anewarray 9
// 2c0: invokeinterface java/util/Collection.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
// 2c5: checkcast [Ljava/lang/String;
// 2c8: astore 18
// 2ca: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 2cd: astore 19
// 2cf: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: istore 20
// 2d6: bipush 0
// 2d7: istore 21
// 2d9: aload 19
// 2db: invokevirtual su/catlean/bo.Y ()Ljava/util/concurrent/ExecutorService;
// 2de: new su/catlean/ci
// 2e1: dup
// 2e2: iload 20
// 2e4: aload 17
// 2e6: aload 18
// 2e8: invokespecial su/catlean/ci.<init> (ILsu/catlean/ds;[Ljava/lang/String;)V
// 2eb: checkcast java/lang/Runnable
// 2ee: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
// 2f3: nop
// 2f4: aload 13
// 2f6: ifnonnull 0e8
// 2f9: return
}

@NotNull
public final class_5250 g(long a, @NotNull class_640 entry) {
ax = a ^ ax;
long var4 = ax ^ 115247881178498L;

try {
Intrinsics.checkNotNullParameter(entry, a<"r">(15331, 4545440474536007900L ^ ax));
if (entry.method_2971() != null) {
class_2561 var8 = entry.method_2971();
Intrinsics.checkNotNull(var8);
class_5250 var9 = var8.method_27661();
Intrinsics.checkNotNullExpressionValue(var9, a<"r">(21837, 5581611710244533873L ^ ax));
return this.O(entry, var4, var9);
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 4968018661431032184L, ax);
}

class_5250 var10002 = class_268.method_1142((class_270)entry.method_2955(), (class_2561)class_2561.method_43470(entry.method_2966().name()));
Intrinsics.checkNotNullExpressionValue(var10002, a<"r">(23252, 6100612651370658285L ^ ax));
return this.O(entry, var4, var10002);
}

private final class_5250 O(class_640 var1, long var2, class_5250 var4) {
var2 = a ^ var2;

class_5250 var10000;
label17: {
try {
if (var1.method_2958() == class_1934.field_9219) {
var10000 = var4.method_27692(class_124.field_1056);
break label17;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -239289944032935644L, var2);
}

var10000 = var4;
}

class_5250 var5 = var10000;
Intrinsics.checkNotNull(var5);
return var5;
}

private final void v(String[] var1, long var2) {
var2 = a ^ var2;

try {
if (var1.length >= 2) {
;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -7998400960029823626L, var2);
}
}

private final boolean M(long param1, String param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s7.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 18858525433874
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 8323227917929033899
// 012: lload 1
// 013: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 3
// 019: astore 7
// 01b: astore 6
// 01d: aload 7
// 01f: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 022: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 025: dup
// 026: sipush 20031
// 029: ldc2_w 3557114060753541953
// 02c: lload 1
// 02d: lxor
// 02e: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 036: invokestatic net/minecraft/class_3544.method_15440 (Ljava/lang/String;)Ljava/lang/String;
// 039: dup
// 03a: sipush 31907
// 03d: ldc2_w 7729336395648870890
// 040: lload 1
// 041: lxor
// 042: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 04a: astore 7
// 04c: aload 7
// 04e: checkcast java/lang/CharSequence
// 051: aload 6
// 053: ifnull 082
// 056: ldc "§"
// 058: checkcast java/lang/CharSequence
// 05b: bipush 0
// 05c: bipush 2
// 05d: aconst_null
// 05e: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 061: ifeq 07d
// 064: goto 071
// 067: ldc2_w 8266302703283507006
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: bipush 0
// 072: ireturn
// 073: ldc2_w 8266302703283507006
// 076: lload 1
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: aload 7
// 07f: checkcast java/lang/CharSequence
// 082: bipush 1
// 083: anewarray 9
// 086: astore 9
// 088: aload 9
// 08a: bipush 0
// 08b: ldc " "
// 08d: aastore
// 08e: aload 9
// 090: bipush 0
// 091: bipush 0
// 092: sipush 14863
// 095: ldc2_w 8152868012406845866
// 098: lload 1
// 099: lxor
// 09a: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: aconst_null
// 0a0: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 0a3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0a8: astore 8
// 0aa: aload 8
// 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b1: ifeq 0e7
// 0b4: aload 8
// 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bb: checkcast java/lang/String
// 0be: astore 9
// 0c0: getstatic su/catlean/s7.h [Ljava/lang/String;
// 0c3: invokestatic java/util/Arrays.stream ([Ljava/lang/Object;)Ljava/util/stream/Stream;
// 0c6: aload 9
// 0c8: invokedynamic invoke (Ljava/lang/String;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/s7.u (Ljava/lang/String;Ljava/lang/String;)Z, (Ljava/lang/String;)Ljava/lang/Boolean; ]
// 0cd: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/s7.F (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 0d2: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
// 0d7: ifeq 0aa
// 0da: bipush 1
// 0db: lload 1
// 0dc: lconst_0
// 0dd: lcmp
// 0de: iflt 0d7
// 0e1: aload 6
// 0e3: ifnull 0d7
// 0e6: ireturn
// 0e7: lload 4
// 0e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ec: getfield net/minecraft/class_746.field_3944 Lnet/minecraft/class_634;
// 0ef: invokevirtual net/minecraft/class_634.method_2880 ()Ljava/util/Collection;
// 0f2: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
// 0f7: astore 8
// 0f9: aload 8
// 0fb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 100: ifeq 13d
// 103: aload 8
// 105: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10a: dup
// 10b: sipush 26412
// 10e: ldc2_w 5791104297859002982
// 111: lload 1
// 112: lxor
// 113: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11b: checkcast net/minecraft/class_640
// 11e: astore 9
// 120: aload 9
// 122: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 125: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 128: aload 7
// 12a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 12d: ifeq 0f9
// 130: bipush 1
// 131: lload 1
// 132: lconst_0
// 133: lcmp
// 134: iflt 12d
// 137: aload 6
// 139: ifnull 12d
// 13c: ireturn
// 13d: bipush 0
// 13e: ireturn
}

@Nullable
public final class_1657 q(int a, @NotNull String name, int a, short a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 93746405770469L;
String var10000 = vm.a<"Å">(-1598129414755210501L, var5);
Intrinsics.checkNotNullParameter(name, a<"r">(26621, 1828274487060080838L ^ var5));
String var9 = var10000;

label21:
for (Object var12 : zf.z(var7).method_18456()) {
class_742 var11;
do {
var11 = (class_742)var12;
if (!Intrinsics.areEqual(name, var11.method_5477().getString())) {
continue label21;
}

var12 = (class_1657 & class_742)var11;
} while (axxx < 0 || var9 == null);

return (class_1657 & class_742)var11;
}

return null;
}

private final int u(ds param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s7.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 129602052763770
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: lload 4
// 012: invokevirtual su/catlean/ds.L (J)Ljava/lang/String;
// 015: dup
// 016: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 019: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 01c: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 01f: dup
// 020: sipush 20031
// 023: ldc2_w 3557120056956000067
// 026: lload 2
// 027: lxor
// 028: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 030: invokestatic net/minecraft/class_3544.method_15440 (Ljava/lang/String;)Ljava/lang/String;
// 033: dup
// 034: sipush 31907
// 037: ldc2_w 7729332806037448168
// 03a: lload 2
// 03b: lxor
// 03c: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 044: checkcast java/lang/CharSequence
// 047: bipush 1
// 048: newarray 5
// 04a: astore 8
// 04c: aload 8
// 04e: bipush 0
// 04f: sipush 9443
// 052: ldc2_w 1123052813769286478
// 055: lload 2
// 056: lxor
// 057: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: castore
// 05d: aload 8
// 05f: bipush 0
// 060: bipush 0
// 061: sipush 14863
// 064: ldc2_w 8152865520696376744
// 067: lload 2
// 068: lxor
// 069: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: aconst_null
// 06f: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
// 072: astore 7
// 074: ldc2_w -36013346641494871
// 077: lload 2
// 078: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: sipush 24919
// 080: ldc2_w 6868042052295026418
// 083: lload 2
// 084: lxor
// 085: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: istore 8
// 08c: astore 6
// 08e: aload 7
// 090: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 095: astore 9
// 097: aload 9
// 099: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09e: ifeq 484
// 0a1: aload 9
// 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a8: checkcast java/lang/String
// 0ab: astore 10
// 0ad: aload 10
// 0af: astore 12
// 0b1: aload 12
// 0b3: invokevirtual java/lang/String.hashCode ()I
// 0b6: aload 6
// 0b8: lload 2
// 0b9: lconst_0
// 0ba: lcmp
// 0bb: iflt 0c3
// 0be: ifnull 48c
// 0c1: aload 6
// 0c3: lload 2
// 0c4: lconst_0
// 0c5: lcmp
// 0c6: iflt 183
// 0c9: ifnull 181
// 0cc: goto 0d9
// 0cf: ldc2_w -92944745016065220
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: lload 2
// 0da: lconst_0
// 0db: lcmp
// 0dc: ifle 450
// 0df: lookupswitch 878 14 -1220931666 594 -536475072 234 -446765093 131 -148051614 459 3867 684 119920 504 92668751 279 104069935 729 404719092 369 805824061 639 1007120555 414 1023145917 189 1113750001 549 1902965990 324
// 158: ldc2_w -92944745016065220
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: aload 12
// 164: sipush 10952
// 167: ldc2_w 117488807449064364
// 16a: lload 2
// 16b: lxor
// 16c: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 174: goto 181
// 177: ldc2_w -92944745016065220
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: aload 6
// 183: ifnull 40a
// 186: ifne 3fd
// 189: goto 196
// 18c: ldc2_w -92944745016065220
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: lload 2
// 197: lconst_0
// 198: lcmp
// 199: ifge 44d
// 19c: aload 12
// 19e: sipush 24339
// 1a1: ldc2_w 3105767508767278718
// 1a4: lload 2
// 1a5: lxor
// 1a6: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 1ae: aload 6
// 1b0: ifnull 3e6
// 1b3: ifne 3e5
// 1b6: goto 1c3
// 1b9: ldc2_w -92944745016065220
// 1bc: lload 2
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: lload 2
// 1c4: lconst_0
// 1c5: lcmp
// 1c6: ifge 44d
// 1c9: aload 12
// 1cb: sipush 15843
// 1ce: ldc2_w 2916447215745787021
// 1d1: lload 2
// 1d2: lxor
// 1d3: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 1db: aload 6
// 1dd: ifnull 3ea
// 1e0: ifne 3e9
// 1e3: goto 1f0
// 1e6: ldc2_w -92944745016065220
// 1e9: lload 2
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: lload 2
// 1f1: lconst_0
// 1f2: lcmp
// 1f3: ifgt 44d
// 1f6: aload 12
// 1f8: sipush 13371
// 1fb: ldc2_w 8043795698349075791
// 1fe: lload 2
// 1ff: lxor
// 200: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 208: aload 6
// 20a: ifnull 3e6
// 20d: ifne 3e5
// 210: goto 21d
// 213: ldc2_w -92944745016065220
// 216: lload 2
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: lload 2
// 21e: lconst_0
// 21f: lcmp
// 220: ifgt 44d
// 223: aload 12
// 225: sipush 22778
// 228: ldc2_w 459585877261779356
// 22b: lload 2
// 22c: lxor
// 22d: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 235: aload 6
// 237: ifnull 3ee
// 23a: ifne 3ed
// 23d: goto 24a
// 240: ldc2_w -92944745016065220
// 243: lload 2
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: lload 2
// 24b: lconst_0
// 24c: lcmp
// 24d: ifgt 44d
// 250: aload 12
// 252: sipush 10806
// 255: ldc2_w 5667787521061974870
// 258: lload 2
// 259: lxor
// 25a: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 262: aload 6
// 264: ifnull 3f2
// 267: ifne 3f1
// 26a: goto 277
// 26d: ldc2_w -92944745016065220
// 270: lload 2
// 271: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: athrow
// 277: lload 2
// 278: lconst_0
// 279: lcmp
// 27a: ifgt 44d
// 27d: aload 12
// 27f: sipush 32474
// 282: ldc2_w 1853176454967437231
// 285: lload 2
// 286: lxor
// 287: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 28f: aload 6
// 291: ifnull 3fa
// 294: ifne 3f9
// 297: goto 2a4
// 29a: ldc2_w -92944745016065220
// 29d: lload 2
// 29e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a3: athrow
// 2a4: lload 2
// 2a5: lconst_0
// 2a6: lcmp
// 2a7: ifgt 44d
// 2aa: aload 12
// 2ac: sipush 22183
// 2af: ldc2_w 8045650817359319005
// 2b2: lload 2
// 2b3: lxor
// 2b4: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 2bc: aload 6
// 2be: ifnull 3f2
// 2c1: ifne 3f1
// 2c4: goto 2d1
// 2c7: ldc2_w -92944745016065220
// 2ca: lload 2
// 2cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d0: athrow
// 2d1: lload 2
// 2d2: lconst_0
// 2d3: lcmp
// 2d4: ifgt 44d
// 2d7: aload 12
// 2d9: sipush 19743
// 2dc: ldc2_w 709102826222228588
// 2df: lload 2
// 2e0: lxor
// 2e1: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 2e9: aload 6
// 2eb: ifnull 43a
// 2ee: ifne 42d
// 2f1: goto 2fe
// 2f4: ldc2_w -92944745016065220
// 2f7: lload 2
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: lload 2
// 2ff: lconst_0
// 300: lcmp
// 301: ifge 44d
// 304: aload 12
// 306: sipush 24162
// 309: ldc2_w 7120791382582593325
// 30c: lload 2
// 30d: lxor
// 30e: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 316: aload 6
// 318: ifnull 3f6
// 31b: ifne 3f5
// 31e: goto 32b
// 321: ldc2_w -92944745016065220
// 324: lload 2
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: lload 2
// 32c: lconst_0
// 32d: lcmp
// 32e: ifgt 44d
// 331: aload 12
// 333: sipush 23400
// 336: ldc2_w 4830764864108790295
// 339: lload 2
// 33a: lxor
// 33b: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 343: aload 6
// 345: ifnull 42a
// 348: ifne 41d
// 34b: goto 358
// 34e: ldc2_w -92944745016065220
// 351: lload 2
// 352: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: athrow
// 358: lload 2
// 359: lconst_0
// 35a: lcmp
// 35b: ifge 44d
// 35e: aload 12
// 360: sipush 2393
// 363: ldc2_w 8874740449971294264
// 366: lload 2
// 367: lxor
// 368: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 370: aload 6
// 372: ifnull 41a
// 375: ifne 40d
// 378: goto 385
// 37b: ldc2_w -92944745016065220
// 37e: lload 2
// 37f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 384: athrow
// 385: lload 2
// 386: lconst_0
// 387: lcmp
// 388: ifgt 44d
// 38b: aload 12
// 38d: sipush 4550
// 390: ldc2_w 8819723654976293048
// 393: lload 2
// 394: lxor
// 395: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 39d: aload 6
// 39f: ifnull 44a
// 3a2: ifne 43d
// 3a5: goto 3b2
// 3a8: ldc2_w -92944745016065220
// 3ab: lload 2
// 3ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b1: athrow
// 3b2: lload 2
// 3b3: lconst_0
// 3b4: lcmp
// 3b5: ifge 44d
// 3b8: aload 12
// 3ba: sipush 15103
// 3bd: ldc2_w 8381038802983740301
// 3c0: lload 2
// 3c1: lxor
// 3c2: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/s7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 3ca: aload 6
// 3cc: ifnull 3f6
// 3cf: ifne 3f5
// 3d2: goto 3df
// 3d5: ldc2_w -92944745016065220
// 3d8: lload 2
// 3d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3de: athrow
// 3df: lload 2
// 3e0: lconst_0
// 3e1: lcmp
// 3e2: ifge 44d
// 3e5: bipush 0
// 3e6: goto 45a
// 3e9: bipush 1
// 3ea: goto 45a
// 3ed: bipush 2
// 3ee: goto 45a
// 3f1: bipush 3
// 3f2: goto 45a
// 3f5: bipush 4
// 3f6: goto 45a
// 3f9: bipush 5
// 3fa: goto 45a
// 3fd: sipush 14863
// 400: ldc2_w 8152865520696376744
// 403: lload 2
// 404: lxor
// 405: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: goto 45a
// 40d: sipush 15823
// 410: ldc2_w 9097027886124120689
// 413: lload 2
// 414: lxor
// 415: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41a: goto 45a
// 41d: sipush 17389
// 420: ldc2_w 3821058909015262287
// 423: lload 2
// 424: lxor
// 425: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42a: goto 45a
// 42d: sipush 7116
// 430: ldc2_w 6608739939869891687
// 433: lload 2
// 434: lxor
// 435: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43a: goto 45a
// 43d: sipush 15133
// 440: ldc2_w 9061942735582575801
// 443: lload 2
// 444: lxor
// 445: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44a: goto 45a
// 44d: sipush 24919
// 450: ldc2_w 6868042052295026418
// 453: lload 2
// 454: lxor
// 455: invokedynamic e (IJ)I bsm=su/catlean/s7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45a: istore 11
// 45c: lload 2
// 45d: lconst_0
// 45e: lcmp
// 45f: ifle 47f
// 462: iload 11
// 464: aload 6
// 466: ifnull 47d
// 469: iload 8
// 46b: if_icmpge 097
// 46e: goto 47b
// 471: ldc2_w -92944745016065220
// 474: lload 2
// 475: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47a: athrow
// 47b: iload 11
// 47d: istore 8
// 47f: aload 6
// 481: ifnonnull 097
// 484: lload 2
// 485: lconst_0
// 486: lcmp
// 487: iflt 097
// 48a: iload 8
// 48c: ireturn
}

private static final boolean G(ds param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/s7.a J
// 03: ldc2_w 33568249880487
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 7675958970866346415
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 3
// 12: aload 0
// 13: aload 3
// 14: ifnull 3b
// 17: invokevirtual su/catlean/ds.o ()Lnet/minecraft/class_640;
// 1a: invokevirtual net/minecraft/class_640.method_2955 ()Lnet/minecraft/class_268;
// 1d: ifnonnull 56
// 20: goto 2d
// 23: ldc2_w 7760750206133507642
// 26: lload 1
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: aload 0
// 2e: goto 3b
// 31: ldc2_w 7760750206133507642
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: invokevirtual su/catlean/ds.T ()Z
// 3e: aload 3
// 3f: ifnull 53
// 42: ifeq 56
// 45: goto 52
// 48: ldc2_w 7760750206133507642
// 4b: lload 1
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: bipush 1
// 53: goto 57
// 56: bipush 0
// 57: ireturn
}

private static final boolean O(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean u(String var0, String var1) {
Intrinsics.checkNotNull(var1);
return StringsKt.startsWith$default(var0, var1, false, 2, null);
}

private static final boolean F(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

public static final int C(long a, s7 $this, ds employee) {
ax = a ^ ax;
long var4 = ax ^ 81812450278618L;
return $this.u(employee, var4);
}

public static final boolean C(long a, s7 $this, String name1, int a) {
long var5 = (ax << 32 | (long)axx << 32 >>> 32) ^ a;
long var7 = var5 ^ 78559685655412L;
return $this.M(var7, name1);
}

public static final CopyOnWriteArrayList F() {
return x;
}

public static final void E(long a, s7 $this, String[] stringArray) {
ax = a ^ ax;
long var4 = ax ^ 78127548642294L;
$this.v(stringArray, var4);
}

static {
long var20 = a ^ 14052665268301L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[43];
int var16 = 0;
String var15 = "ÁqK\u0005ù\u0096ÿþ4Vô\u0014\u008d£ì\u0001\u009dÓ¿þD\u0002jÈ\u00108î1pMÂ0_'JÊf¹\u008awÚ@\u0099\u0016UZx\u0012þ<\u0095)PX×}\u008eR§ì\u009b\u0098\u008a¯6ß¦Òù\u001a~Á«¦dÝî\u0001º<î*à¬X\u00826WlGyñxÞ\\\u0007Ú\u0086HM]Óòª<t0Ê\u00936r\u0081Ç=\u0083Íçf\u000f·\u00adp¡r«\rºjè\u0010ÀØr\"uh[µ\u0007ëFÅÿå\u0011\u0084ý\u001b\u008dH\u008bQ*£\u0013\u0010\u007f¿ÁMç1\u00187\u0013tr{¸\u00115¾ \u000e\u0096¨gÔ»z¦i$è»T\b?³\u0010\u0017e*ÐÝiy°\u0016ï\u0001\u0099\u009a\u009eÓ\u0018-\u00196:\"\u0005ùºc\u0004¤w~éL3dr\u008có\u0017²\u00adÏ\u0010µ`3ä¹f'ò\u001f\u0081ý\u0086\u0089õ\u001f§\u0010T\u0086¡¦oF\u0081ág\u0095Ú(§ó\u000fª\u0010;\nG\u008a¤üåUi§«z\n\u009c>\u0012 \u001e@2\u0002ò\b=è^S>¹yí{f\u00963\u000b\u0098\u008fq\b\u0095ôi\u0012ç¹G<\u008c ª}[¼(4Ã°\u00ad\u00926\u0096}2\u0097WÁ\u009aË\u0011X\fd£S\u0093TÚÁ·Ì¨ \nd\u00ad\u008aG^\u0004=\u0090^û\u001d4÷\u0000³i\u00897éöûþB[\u0003\u0005È½á\u008eê\u0018\u0082db)äÎÂØSC!]7$\u001da\tü(DÆ4i\u0018\u0018þ×qÍf\u009bsf\u00869p¾#éÓõh;f\u009a*½åÝ\u0010\u001a¹BäGG¬*\u0013Hÿ&eyÈ5 ô¾¯yP:]\u0016Çâ\u009b\u001cyLÝ\u0010uIÖþØyw\u009d\u007fæwí\u001a\u0088E\r\u0018½\u0007ße7ÌZÁJ¾cå>6»9<p\u000fæp¥Ë² /y\u0011\u0095\u001e¯OI.S\u0096VzÝ'Ó\u00062ç\u0003\fÐÄMós7Aßt¹\u009b\u0010\f\u001f6Èd´X{·ÔâÃ«E\u0089_(%ûÔ|%uk³¸da+a\u0082:OQ\u0090¦\u0015\u0094§ÃW\u0001\u008fÖ¢¡\u0016ýOå\u00adf\u0006,i-O(\u0085åG\u0080<eË©9\u0090.¯ú=\u001dÖ¦¦ù\u009d`t¬Ù\u0011\u0097üÆâ\u009cò\u0092~¥\u0082zxE96\u0010û]ö\u000eÛ&\u0095\u0014¿¹\u0001n¾Ö\tZ\u0018AÄ\u008b:ØÐö\u0085)¼;k¹¿L\u0098HR±Éíd4Ø\u0018B\u0014Àã,>ºoó¸\u0017Ñ×ÙÁ?u\u009d\t>\"©¯Û\u0018Ç\u0087ª\u0098¸0h\u008dg`\t¨\u001d\u0099ð«¤pÖ&\u008f«3\u0003\u0010¸5eîK8jf\r¬GÓ¨\u009b(c\u0010îÈî\u0093gÓÝ÷\u009d%\u0080\u0002CC\u0084Ç\u0010»Å!\u008b/Â3\u0092÷\u0010\u000f¸¾ÎÝ\u0000\u0010_\u0081~Ðé>\u0097\u0006O\u0015S\u009døä)Ù Á\u0011\u0080×Ö>\u001e~pj-âÏ¤uë>\u008c®¶¯þ«\u000b»\u001d;B\u007f\u0081µ4 Z\u0017®\u001e\u0083\u0094\f\u000f\u0083\u008eq\u001dr|\u008eâ\u0087\u0005M[æ\fé ql\u001fûàñVF \u00053C\u008f¾mÙ6Îw\u0085\u008eÆ\u001c\u0085Ë.\u0087\u001b\u0001\u0003mÜpµú\u0085ßÓe<&\u0010¹öÈ\u009f\u009aêéëCµ%î\u0014\u0017\tÈ\u0010ýîê&\u0096dI½y{£\u0012µ&ïý ÷#\u009at\u001f~\u0085òLñ\u0010\u0013:ØË·éÞËw²ç\u001amæ\u000b|óÇµ8\u008c\u0010\u0085|Y\u00ad3\u0001\b+8ºÈ¶^\u009dä( \u0004nUí;Ò\u0015Ükd¤\u000bÂ¬OZ°\u0014K\u0092Ñ\\:©+ç}\u0092Ró\u009e£×ÑÄÚ\u001bY0:æµ×Ôáq\u001a¬+1\u000eºÐ\tæÎ\u0000lv.Ðs@j\u0088ÖYä2\u0080ç§@¥®øg:jåâ-{ôª\u0002BtI\r}\u0082¨R,«í\u0006rf\u008dH0*Ücá-(\u000f'(5?QOÈÈ\u000bÛ\u0006ë±I¯\u009a?@\u0081Y\u0007\u0098«³CàßA\u0089\u0092Úå(ÂE\u001bÄ{À\u0018h#j7l\b\b}-20ß\u001cGr#\u009b\u008dìl\u0098\bÄ=\u001btÇÌKª:È©lÂDÂ\u0090\u0086ev8\u0005¡Ý\u008de_Ù\u001f¯\u009cÛMd\";\n¨(ï\u0099\u000e³?c \u009f3µJX\u001eú\u0013<\u0080lI3A|\u009b\u000bDz\u0089êXÕ\u0080\u0096¯Dì°¶\u001dµÒ\u0010g\u0018\u0091s\u001dÏù¯\u0082a5ñ÷?#²";
int var17 = "ÁqK\u0005ù\u0096ÿþ4Vô\u0014\u008d£ì\u0001\u009dÓ¿þD\u0002jÈ\u00108î1pMÂ0_'JÊf¹\u008awÚ@\u0099\u0016UZx\u0012þ<\u0095)PX×}\u008eR§ì\u009b\u0098\u008a¯6ß¦Òù\u001a~Á«¦dÝî\u0001º<î*à¬X\u00826WlGyñxÞ\\\u0007Ú\u0086HM]Óòª<t0Ê\u00936r\u0081Ç=\u0083Íçf\u000f·\u00adp¡r«\rºjè\u0010ÀØr\"uh[µ\u0007ëFÅÿå\u0011\u0084ý\u001b\u008dH\u008bQ*£\u0013\u0010\u007f¿ÁMç1\u00187\u0013tr{¸\u00115¾ \u000e\u0096¨gÔ»z¦i$è»T\b?³\u0010\u0017e*ÐÝiy°\u0016ï\u0001\u0099\u009a\u009eÓ\u0018-\u00196:\"\u0005ùºc\u0004¤w~éL3dr\u008có\u0017²\u00adÏ\u0010µ`3ä¹f'ò\u001f\u0081ý\u0086\u0089õ\u001f§\u0010T\u0086¡¦oF\u0081ág\u0095Ú(§ó\u000fª\u0010;\nG\u008a¤üåUi§«z\n\u009c>\u0012 \u001e@2\u0002ò\b=è^S>¹yí{f\u00963\u000b\u0098\u008fq\b\u0095ôi\u0012ç¹G<\u008c ª}[¼(4Ã°\u00ad\u00926\u0096}2\u0097WÁ\u009aË\u0011X\fd£S\u0093TÚÁ·Ì¨ \nd\u00ad\u008aG^\u0004=\u0090^û\u001d4÷\u0000³i\u00897éöûþB[\u0003\u0005È½á\u008eê\u0018\u0082db)äÎÂØSC!]7$\u001da\tü(DÆ4i\u0018\u0018þ×qÍf\u009bsf\u00869p¾#éÓõh;f\u009a*½åÝ\u0010\u001a¹BäGG¬*\u0013Hÿ&eyÈ5 ô¾¯yP:]\u0016Çâ\u009b\u001cyLÝ\u0010uIÖþØyw\u009d\u007fæwí\u001a\u0088E\r\u0018½\u0007ße7ÌZÁJ¾cå>6»9<p\u000fæp¥Ë² /y\u0011\u0095\u001e¯OI.S\u0096VzÝ'Ó\u00062ç\u0003\fÐÄMós7Aßt¹\u009b\u0010\f\u001f6Èd´X{·ÔâÃ«E\u0089_(%ûÔ|%uk³¸da+a\u0082:OQ\u0090¦\u0015\u0094§ÃW\u0001\u008fÖ¢¡\u0016ýOå\u00adf\u0006,i-O(\u0085åG\u0080<eË©9\u0090.¯ú=\u001dÖ¦¦ù\u009d`t¬Ù\u0011\u0097üÆâ\u009cò\u0092~¥\u0082zxE96\u0010û]ö\u000eÛ&\u0095\u0014¿¹\u0001n¾Ö\tZ\u0018AÄ\u008b:ØÐö\u0085)¼;k¹¿L\u0098HR±Éíd4Ø\u0018B\u0014Àã,>ºoó¸\u0017Ñ×ÙÁ?u\u009d\t>\"©¯Û\u0018Ç\u0087ª\u0098¸0h\u008dg`\t¨\u001d\u0099ð«¤pÖ&\u008f«3\u0003\u0010¸5eîK8jf\r¬GÓ¨\u009b(c\u0010îÈî\u0093gÓÝ÷\u009d%\u0080\u0002CC\u0084Ç\u0010»Å!\u008b/Â3\u0092÷\u0010\u000f¸¾ÎÝ\u0000\u0010_\u0081~Ðé>\u0097\u0006O\u0015S\u009døä)Ù Á\u0011\u0080×Ö>\u001e~pj-âÏ¤uë>\u008c®¶¯þ«\u000b»\u001d;B\u007f\u0081µ4 Z\u0017®\u001e\u0083\u0094\f\u000f\u0083\u008eq\u001dr|\u008eâ\u0087\u0005M[æ\fé ql\u001fûàñVF \u00053C\u008f¾mÙ6Îw\u0085\u008eÆ\u001c\u0085Ë.\u0087\u001b\u0001\u0003mÜpµú\u0085ßÓe<&\u0010¹öÈ\u009f\u009aêéëCµ%î\u0014\u0017\tÈ\u0010ýîê&\u0096dI½y{£\u0012µ&ïý ÷#\u009at\u001f~\u0085òLñ\u0010\u0013:ØË·éÞËw²ç\u001amæ\u000b|óÇµ8\u008c\u0010\u0085|Y\u00ad3\u0001\b+8ºÈ¶^\u009dä( \u0004nUí;Ò\u0015Ükd¤\u000bÂ¬OZ°\u0014K\u0092Ñ\\:©+ç}\u0092Ró\u009e£×ÑÄÚ\u001bY0:æµ×Ôáq\u001a¬+1\u000eºÐ\tæÎ\u0000lv.Ðs@j\u0088ÖYä2\u0080ç§@¥®øg:jåâ-{ôª\u0002BtI\r}\u0082¨R,«í\u0006rf\u008dH0*Ücá-(\u000f'(5?QOÈÈ\u000bÛ\u0006ë±I¯\u009a?@\u0081Y\u0007\u0098«³CàßA\u0089\u0092Úå(ÂE\u001bÄ{À\u0018h#j7l\b\b}-20ß\u001cGr#\u009b\u008dìl\u0098\bÄ=\u001btÇÌKª:È©lÂDÂ\u0090\u0086ev8\u0005¡Ý\u008de_Ù\u001f¯\u009cÛMd\";\n¨(ï\u0099\u000e³?c \u009f3µJX\u001eú\u0013<\u0080lI3A|\u009b\u000bDz\u0089êXÕ\u0080\u0096¯Dì°¶\u001dµÒ\u0010g\u0018\u0091s\u001dÏù¯\u0082a5ñ÷?#²"
.length();
char var14 = 24;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[43];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[18];
int var3 = 0;
String var4 = "eË\u0094.µ³>É\u008cÙù\u0086|K,ñ\u001f\u0012\u009bOà\u0001eÇ×©26¯4z8ï^\u0016ítbþ\u00adS\rV [®ÑQ\u0001Äì\u0019Aõ²\u009diV\u0003×{Q\u0089?+adkÞ4)=¯\u001a6èß·à²ÌWÑÓN?Ç&Å\u0000ÑÊÅ¯¾;Ã¢Wã}2\u0018Ñ\u0099\b\u0082¿É\u0081BÞ\u0091JÄ\u0089\u0000ö\u009a\u0097\u0011Àz¹ÊÇqÔ";
int var5 = "eË\u0094.µ³>É\u008cÙù\u0086|K,ñ\u001f\u0012\u009bOà\u0001eÇ×©26¯4z8ï^\u0016ítbþ\u00adS\rV [®ÑQ\u0001Äì\u0019Aõ²\u009diV\u0003×{Q\u0089?+adkÞ4)=¯\u001a6èß·à²ÌWÑÓN?Ç&Å\u0000ÑÊÅ¯¾;Ã¢Wã}2\u0018Ñ\u0099\b\u0082¿É\u0081BÞ\u0091JÄ\u0089\u0000ö\u009a\u0097\u0011Àz¹ÊÇqÔ"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var29[var10001] = var47;
if (var2 >= var5) {
e = var6;
f = new Integer[18];
r = new s7();
x = new CopyOnWriteArrayList();
long var36 = 2405398651168645461L ^ var20;
R = new ArrayList();
String[] var22 = new String[b<"e">(29715, var36)];
var22[0] = a<"r">(16132, 5738420539465036969L ^ var20);
var22[1] = a<"r">(20168, 2743026779890255179L ^ var20);
var22[2] = a<"r">(21002, 3052815695226247568L ^ var20);
var22[3] = a<"r">(21562, 2627163004287164316L ^ var20);
var22[4] = a<"r">(2390, 8925529144190223043L ^ var20);
var22[5] = a<"r">(28276, 1469547492519585236L ^ var20);
var22[b<"e">(18743, 4840033079204207739L ^ var20)] = a<"r">(19853, 5391424195850962435L ^ var20);
var22[b<"e">(2499, 2302836175295224967L ^ var20)] = a<"r">(30505, 5048927287915494540L ^ var20);
var22[b<"e">(6693, 2657827395224145775L ^ var20)] = a<"r">(10609, 2187256281071215315L ^ var20);
var22[b<"e">(17364, 8535713919445784219L ^ var20)] = a<"r">(27808, 3610518812935661326L ^ var20);
var22[b<"e">(11682, 3020422183246149873L ^ var20)] = a<"r">(7174, 6203439385056073602L ^ var20);
var22[b<"e">(26948, 3744699081920609287L ^ var20)] = a<"r">(12571, 5276377805554743936L ^ var20);
var22[b<"e">(28081, 268304671217055985L ^ var20)] = a<"r">(4513, 6942276865723456013L ^ var20);
var22[b<"e">(29492, 8232237544804312694L ^ var20)] = a<"r">(23400, 4830729911009480955L ^ var20);
var22[b<"e">(23729, 7874331040856459764L ^ var20)] = a<"r">(8753, 7523873312439167409L ^ var20);
h = var22;
return;
}
break;
default:
var29[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "vG\u0005\u007fd#ød>\u0013.6`{qÍ";
var5 = "vG\u0005\u007fd#ød>\u0013.6`{qÍ".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var38;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "P-\r¤ºH+ÜÂ<ä~ä\u008dQfñ!ç\u0017x,Ù_ (\u001aë\f@Wi¯®EM\u0006 ýÞé\u00021\u001a\u0016q\u000fd]YVà»\u0001&\u0088ê";
var17 = "P-\r¤ºH+ÜÂ<ä~ä\u008dQfñ!ç\u0017x,Ù_ (\u001aë\f@Wi¯®EM\u0006 ýÞé\u00021\u001a\u0016q\u000fd]YVà»\u0001&\u0088ê".length();
var14 = 24;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9751;
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
throw new RuntimeException("su/catlean/s7", var10);
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
throw new RuntimeException("su/catlean/s7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30928;
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
throw new RuntimeException("su/catlean/s7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
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
throw new RuntimeException("su/catlean/s7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
