package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.AfterEntitySpawn;
import su.catlean.gofra.Flow;

public final class ez extends _g {
@NotNull
public static final ez W;
static final KProperty[] F;
@NotNull
private static final cq d;
@NotNull
private static final cw E;
@NotNull
private static final bg m;
@Nullable
private static class_2338 G;
private static int k;
private static int C;
@NotNull
private static final HashMap X;
private static final long a = yz.a(-4762326402042322715L, 2126441121924025221L, MethodHandles.lookup().lookupClass()).a(111996500078028L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;
private static final long i;

private ez(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 81790947333050L;
super(b<"n">(30753, 7096170806511143874L ^ var1), jt.y(), null, 4, null, var3);
}

private final boolean r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 103622055176113L;
return (Boolean)d.E(this, var3, F[0]);
}

private final f9 K(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114491933943326L;
return (f9)E.E(this, var3, F[1]);
}

@Flow
private final void j(AfterEntitySpawn var1) {
long var2 = a ^ 139406696834518L;
long var4 = var2 ^ 38345459101211L;

try {
if (var1.getEntity() instanceof class_1684) {
zf.z(var4).method_18456().stream().min(Comparator.comparingDouble(ez::P)).ifPresent(ez::k);
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 194775354487980413L, var2);
}
}

@Flow(
priority = -10
)
private final void I(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ez.a J
// 003: ldc2_w 79077724838891
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 97948517871710
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 134845249515136
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 60683722409321
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 78985256974288
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 30779587547174
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 56238777433722
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 115425431557969
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 8264576883086
// 04d: lxor
// 04e: dup2
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 32
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: dup2
// 060: bipush 48
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 21
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 135070052318175
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 28490133728897
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 138652477892994
// 07c: lxor
// 07d: lstore 26
// 07f: dup2
// 080: ldc2_w 32661853256738
// 083: lxor
// 084: lstore 28
// 086: dup2
// 087: ldc2_w 17973090994758
// 08a: lxor
// 08b: lstore 30
// 08d: pop2
// 08e: ldc2_w 4374767097520339824
// 091: lload 2
// 092: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: aconst_null
// 098: putstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 09b: astore 32
// 09d: aload 0
// 09e: lload 4
// 0a0: invokespecial su/catlean/ez.r (J)Z
// 0a3: aload 32
// 0a5: ifnonnull 30c
// 0a8: ifeq 301
// 0ab: goto 0b8
// 0ae: ldc2_w 4363638423053401920
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: getstatic su/catlean/um.E Lsu/catlean/um;
// 0bb: aload 32
// 0bd: ifnonnull 0f0
// 0c0: goto 0cd
// 0c3: ldc2_w 4363638423053401920
// 0c6: lload 2
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 0d0: ifnull 18f
// 0d3: goto 0e0
// 0d6: ldc2_w 4363638423053401920
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: getstatic su/catlean/um.E Lsu/catlean/um;
// 0e3: goto 0f0
// 0e6: ldc2_w 4363638423053401920
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: lload 22
// 0f2: invokevirtual su/catlean/um.f (J)Z
// 0f5: aload 32
// 0f7: ifnonnull 132
// 0fa: ifeq 18f
// 0fd: goto 10a
// 100: ldc2_w 4363638423053401920
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: getstatic su/catlean/um.E Lsu/catlean/um;
// 10d: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 110: aload 32
// 112: ifnonnull 159
// 115: goto 122
// 118: ldc2_w 4363638423053401920
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: instanceof net/minecraft/class_1657
// 125: goto 132
// 128: ldc2_w 4363638423053401920
// 12b: lload 2
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: ifeq 18f
// 135: getstatic su/catlean/um.E Lsu/catlean/um;
// 138: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 13b: dup
// 13c: sipush 26435
// 13f: ldc2_w 9208634661996489267
// 142: lload 2
// 143: lxor
// 144: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 14c: goto 159
// 14f: ldc2_w 4363638423053401920
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: checkcast net/minecraft/class_1657
// 15c: aload 32
// 15e: ifnonnull 1a7
// 161: astore 33
// 163: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 166: aload 33
// 168: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
// 16b: ifne 18f
// 16e: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 171: checkcast java/util/Map
// 174: aload 33
// 176: invokestatic su/catlean/zf.A ()J
// 179: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 17c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 181: pop
// 182: goto 18f
// 185: ldc2_w 4363638423053401920
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 192: aload 32
// 194: ifnonnull 1ad
// 197: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 19a: goto 1a7
// 19d: ldc2_w 4363638423053401920
// 1a0: lload 2
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: ifnull 252
// 1aa: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1ad: aload 32
// 1af: ifnonnull 1d7
// 1b2: lload 22
// 1b4: invokevirtual su/catlean/ux.f (J)Z
// 1b7: ifeq 252
// 1ba: goto 1c7
// 1bd: ldc2_w 4363638423053401920
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1ca: goto 1d7
// 1cd: ldc2_w 4363638423053401920
// 1d0: lload 2
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 1da: aload 32
// 1dc: ifnonnull 212
// 1df: ifnull 252
// 1e2: goto 1ef
// 1e5: ldc2_w 4363638423053401920
// 1e8: lload 2
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1f2: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 1f5: dup
// 1f6: bipush 122
// 1f8: ldc2_w 8852480159927602454
// 1fb: lload 2
// 1fc: lxor
// 1fd: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 205: goto 212
// 208: ldc2_w 4363638423053401920
// 20b: lload 2
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: astore 33
// 214: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 217: aload 32
// 219: ifnonnull 262
// 21c: aload 33
// 21e: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
// 221: ifne 252
// 224: goto 231
// 227: ldc2_w 4363638423053401920
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 234: checkcast java/util/Map
// 237: aload 33
// 239: invokestatic su/catlean/zf.A ()J
// 23c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 23f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 244: pop
// 245: goto 252
// 248: ldc2_w 4363638423053401920
// 24b: lload 2
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: new java/util/HashMap
// 255: dup
// 256: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 259: checkcast java/util/Map
// 25c: invokespecial java/util/HashMap.<init> (Ljava/util/Map;)V
// 25f: checkcast java/util/Map
// 262: astore 33
// 264: bipush 0
// 265: istore 34
// 267: aload 33
// 269: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 26e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 273: astore 35
// 275: aload 35
// 277: invokeinterface java/util/Iterator.hasNext ()Z 1
// 27c: ifeq 300
// 27f: aload 35
// 281: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 286: checkcast java/util/Map$Entry
// 289: astore 36
// 28b: aload 36
// 28d: astore 37
// 28f: bipush 0
// 290: istore 38
// 292: aload 32
// 294: ifnonnull 2fb
// 297: invokestatic su/catlean/zf.A ()J
// 29a: aload 37
// 29c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 2a1: dup
// 2a2: sipush 22204
// 2a5: ldc2_w 4614850687023242193
// 2a8: lload 2
// 2a9: lxor
// 2aa: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2b2: checkcast java/lang/Number
// 2b5: invokevirtual java/lang/Number.longValue ()J
// 2b8: lsub
// 2b9: getstatic su/catlean/ez.i J
// 2bc: lcmp
// 2bd: aload 32
// 2bf: ifnonnull 30c
// 2c2: goto 2cf
// 2c5: ldc2_w 4363638423053401920
// 2c8: lload 2
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: ifle 2fa
// 2d2: goto 2df
// 2d5: ldc2_w 4363638423053401920
// 2d8: lload 2
// 2d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: athrow
// 2df: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 2e2: aload 37
// 2e4: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 2e9: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
// 2ec: pop
// 2ed: goto 2fa
// 2f0: ldc2_w 4363638423053401920
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: nop
// 2fb: aload 32
// 2fd: ifnull 275
// 300: nop
// 301: lload 24
// 303: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 306: invokevirtual net/minecraft/class_746.method_6032 ()F
// 309: ldc 5.0
// 30b: fcmpg
// 30c: aload 32
// 30e: ifnonnull 337
// 311: ifge 322
// 314: goto 321
// 317: ldc2_w 4363638423053401920
// 31a: lload 2
// 31b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 320: athrow
// 321: return
// 322: getstatic su/catlean/ez.m Lsu/catlean/bg;
// 325: sipush 29711
// 328: ldc2_w 7559494535348116917
// 32b: lload 2
// 32c: lxor
// 32d: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 332: lload 17
// 334: invokevirtual su/catlean/bg.c (IJ)Z
// 337: ifne 33b
// 33a: return
// 33b: lload 13
// 33d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 340: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 343: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 348: astore 33
// 34a: aload 33
// 34c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 351: ifeq 616
// 354: aload 33
// 356: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 35b: dup
// 35c: sipush 18126
// 35f: ldc2_w 6775889584962882495
// 362: lload 2
// 363: lxor
// 364: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 36c: checkcast net/minecraft/class_1297
// 36f: astore 34
// 371: aload 34
// 373: instanceof net/minecraft/class_1684
// 376: aload 32
// 378: ifnonnull 63d
// 37b: aload 32
// 37d: ifnonnull 3a5
// 380: goto 38d
// 383: ldc2_w 4363638423053401920
// 386: lload 2
// 387: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38c: athrow
// 38d: ifeq 34a
// 390: goto 39d
// 393: ldc2_w 4363638423053401920
// 396: lload 2
// 397: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39c: athrow
// 39d: aload 34
// 39f: checkcast net/minecraft/class_1684
// 3a2: invokevirtual net/minecraft/class_1684.method_5628 ()I
// 3a5: getstatic su/catlean/ez.k I
// 3a8: aload 32
// 3aa: ifnonnull 3c8
// 3ad: if_icmpeq 34a
// 3b0: goto 3bd
// 3b3: ldc2_w 4363638423053401920
// 3b6: lload 2
// 3b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bc: athrow
// 3bd: aload 34
// 3bf: checkcast net/minecraft/class_1684
// 3c2: invokevirtual net/minecraft/class_1684.method_5628 ()I
// 3c5: getstatic su/catlean/ez.C I
// 3c8: if_icmpne 3ce
// 3cb: goto 34a
// 3ce: lload 13
// 3d0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3d3: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 3d6: dup
// 3d7: sipush 18719
// 3da: ldc2_w 6094685846752609398
// 3dd: lload 2
// 3de: lxor
// 3df: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e7: checkcast java/lang/Iterable
// 3ea: astore 36
// 3ec: nop
// 3ed: bipush 0
// 3ee: istore 37
// 3f0: aload 36
// 3f2: astore 38
// 3f4: new java/util/ArrayList
// 3f7: dup
// 3f8: invokespecial java/util/ArrayList.<init> ()V
// 3fb: checkcast java/util/Collection
// 3fe: astore 39
// 400: bipush 0
// 401: istore 40
// 403: aload 38
// 405: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 40a: astore 42
// 40c: aload 42
// 40e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 413: ifeq 4c5
// 416: aload 42
// 418: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 41d: astore 43
// 41f: aload 43
// 421: checkcast net/minecraft/class_742
// 424: astore 45
// 426: bipush 0
// 427: istore 46
// 429: getstatic su/catlean/ez.X Ljava/util/HashMap;
// 42c: aload 45
// 42e: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
// 431: aload 32
// 433: ifnonnull 4d2
// 436: aload 32
// 438: ifnonnull 499
// 43b: goto 448
// 43e: ldc2_w 4363638423053401920
// 441: lload 2
// 442: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: athrow
// 448: ifne 482
// 44b: goto 458
// 44e: ldc2_w 4363638423053401920
// 451: lload 2
// 452: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 457: athrow
// 458: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 45b: lload 4
// 45d: invokespecial su/catlean/ez.r (J)Z
// 460: aload 32
// 462: ifnonnull 499
// 465: goto 472
// 468: ldc2_w 4363638423053401920
// 46b: lload 2
// 46c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 471: athrow
// 472: ifne 4b2
// 475: goto 482
// 478: ldc2_w 4363638423053401920
// 47b: lload 2
// 47c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 481: athrow
// 482: aload 45
// 484: lload 24
// 486: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 489: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 48c: goto 499
// 48f: ldc2_w 4363638423053401920
// 492: lload 2
// 493: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 498: athrow
// 499: aload 32
// 49b: ifnonnull 4af
// 49e: ifne 4b2
// 4a1: goto 4ae
// 4a4: ldc2_w 4363638423053401920
// 4a7: lload 2
// 4a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: athrow
// 4ae: bipush 1
// 4af: goto 4b3
// 4b2: bipush 0
// 4b3: ifeq 40c
// 4b6: aload 39
// 4b8: aload 43
// 4ba: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 4bf: pop
// 4c0: aload 32
// 4c2: ifnull 40c
// 4c5: aload 39
// 4c7: checkcast java/util/List
// 4ca: nop
// 4cb: checkcast java/lang/Iterable
// 4ce: astore 36
// 4d0: nop
// 4d1: bipush 0
// 4d2: istore 37
// 4d4: aload 36
// 4d6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4db: astore 38
// 4dd: aload 38
// 4df: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4e4: aload 32
// 4e6: ifnonnull 529
// 4e9: ifne 507
// 4ec: goto 4f9
// 4ef: ldc2_w 4363638423053401920
// 4f2: lload 2
// 4f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f8: athrow
// 4f9: aconst_null
// 4fa: goto 5a3
// 4fd: ldc2_w 4363638423053401920
// 500: lload 2
// 501: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 506: athrow
// 507: aload 38
// 509: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 50e: astore 39
// 510: aload 38
// 512: aload 32
// 514: ifnonnull 53d
// 517: invokeinterface java/util/Iterator.hasNext ()Z 1
// 51c: goto 529
// 51f: ldc2_w 4363638423053401920
// 522: lload 2
// 523: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 528: athrow
// 529: ifne 53b
// 52c: aload 39
// 52e: goto 5a3
// 531: ldc2_w 4363638423053401920
// 534: lload 2
// 535: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53a: athrow
// 53b: aload 39
// 53d: checkcast net/minecraft/class_742
// 540: astore 40
// 542: bipush 0
// 543: istore 42
// 545: aload 40
// 547: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 54a: iload 6
// 54c: i2b
// 54d: lload 7
// 54f: aload 34
// 551: invokevirtual su/catlean/ez.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 554: invokevirtual net/minecraft/class_742.method_5707 (Lnet/minecraft/class_243;)D
// 557: dstore 40
// 559: aload 38
// 55b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 560: astore 42
// 562: aload 42
// 564: checkcast net/minecraft/class_742
// 567: astore 43
// 569: bipush 0
// 56a: istore 45
// 56c: aload 43
// 56e: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 571: iload 6
// 573: i2b
// 574: lload 7
// 576: aload 34
// 578: invokevirtual su/catlean/ez.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 57b: invokevirtual net/minecraft/class_742.method_5707 (Lnet/minecraft/class_243;)D
// 57e: dstore 43
// 580: dload 40
// 582: dload 43
// 584: invokestatic java/lang/Double.compare (DD)I
// 587: ifle 592
// 58a: aload 42
// 58c: astore 39
// 58e: dload 43
// 590: dstore 40
// 592: aload 38
// 594: invokeinterface java/util/Iterator.hasNext ()Z 1
// 599: ifne 559
// 59c: aload 32
// 59e: ifnonnull 58e
// 5a1: aload 39
// 5a3: checkcast net/minecraft/class_742
// 5a6: astore 35
// 5a8: aload 32
// 5aa: ifnonnull 611
// 5ad: aload 35
// 5af: ifnull 610
// 5b2: goto 5bf
// 5b5: ldc2_w 4363638423053401920
// 5b8: lload 2
// 5b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5be: athrow
// 5bf: aload 35
// 5c1: astore 37
// 5c3: bipush 0
// 5c4: istore 38
// 5c6: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 5c9: pop
// 5ca: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 5cd: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 5d0: iload 6
// 5d2: i2b
// 5d3: lload 7
// 5d5: aload 34
// 5d7: invokevirtual su/catlean/ez.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 5da: lload 11
// 5dc: dup2_x1
// 5dd: pop2
// 5de: aload 34
// 5e0: checkcast net/minecraft/class_1684
// 5e3: invokevirtual net/minecraft/class_1684.method_18798 ()Lnet/minecraft/class_243;
// 5e6: dup
// 5e7: sipush 14580
// 5ea: ldc2_w 7058543979631752578
// 5ed: lload 2
// 5ee: lxor
// 5ef: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5f7: invokespecial su/catlean/ez.P (JLnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_2338;
// 5fa: putstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 5fd: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 600: pop
// 601: aload 34
// 603: checkcast net/minecraft/class_1684
// 606: invokevirtual net/minecraft/class_1684.method_5628 ()I
// 609: putstatic su/catlean/ez.k I
// 60c: nop
// 60d: goto 34a
// 610: nop
// 611: aload 32
// 613: ifnull 34a
// 616: getstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 619: ifnonnull 627
// 61c: return
// 61d: ldc2_w 4363638423053401920
// 620: lload 2
// 621: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 626: athrow
// 627: lload 24
// 629: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 62c: getstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 62f: dup
// 630: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 633: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 636: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 639: ldc2_w 49.0
// 63c: dcmpg
// 63d: ifge 641
// 640: return
// 641: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 644: getstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 647: dup
// 648: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 64b: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 64e: dup
// 64f: sipush 27830
// 652: ldc2_w 7834100436664312266
// 655: lload 2
// 656: lxor
// 657: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 65f: lload 26
// 661: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 664: invokevirtual su/catlean/_w.q ()F
// 667: fstore 33
// 669: aload 0
// 66a: getstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 66d: dup
// 66e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 671: fload 33
// 673: lload 15
// 675: dup2_x2
// 676: pop2
// 677: invokespecial su/catlean/ez.H (JLnet/minecraft/class_2338;F)F
// 67a: fstore 34
// 67c: fload 34
// 67e: invokestatic java/lang/Float.isNaN (F)Z
// 681: ifeq 68f
// 684: return
// 685: ldc2_w 4363638423053401920
// 688: lload 2
// 689: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68e: athrow
// 68f: aload 0
// 690: iload 19
// 692: iload 20
// 694: i2c
// 695: iload 21
// 697: i2c
// 698: fload 33
// 69a: fload 34
// 69c: invokespecial su/catlean/ez.a (ICCFF)Lnet/minecraft/class_2338;
// 69f: astore 35
// 6a1: aload 35
// 6a3: aload 32
// 6a5: ifnonnull 6cc
// 6a8: ifnull 6de
// 6ab: goto 6b8
// 6ae: ldc2_w 4363638423053401920
// 6b1: lload 2
// 6b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b7: athrow
// 6b8: getstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 6bb: dup
// 6bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6bf: goto 6cc
// 6c2: ldc2_w 4363638423053401920
// 6c5: lload 2
// 6c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cb: athrow
// 6cc: aload 35
// 6ce: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 6d1: checkcast net/minecraft/class_2374
// 6d4: invokevirtual net/minecraft/class_2338.method_19770 (Lnet/minecraft/class_2374;)D
// 6d7: ldc2_w 36.0
// 6da: dcmpl
// 6db: ifle 6e9
// 6de: return
// 6df: ldc2_w 4363638423053401920
// 6e2: lload 2
// 6e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e8: athrow
// 6e9: new su/catlean/_w
// 6ec: dup
// 6ed: fload 33
// 6ef: fload 34
// 6f1: ldc -89.0
// 6f3: ldc 89.0
// 6f5: invokestatic java/lang/Math.clamp (FFF)F
// 6f8: lload 28
// 6fa: dup2_x1
// 6fb: pop2
// 6fc: bipush 0
// 6fd: aconst_null
// 6fe: sipush 9600
// 701: ldc2_w 7463519439534820411
// 704: lload 2
// 705: lxor
// 706: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70b: aconst_null
// 70c: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 70f: astore 36
// 711: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 714: new su/catlean/t5
// 717: dup
// 718: aload 36
// 71a: lload 30
// 71c: sipush 23114
// 71f: ldc2_w 795318843668722678
// 722: lload 2
// 723: lxor
// 724: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 729: aload 36
// 72b: invokedynamic invoke (Lsu/catlean/_w;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/ez.v (Lsu/catlean/_w;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 730: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 733: lload 9
// 735: dup2_x1
// 736: pop2
// 737: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 73a: aconst_null
// 73b: putstatic su/catlean/ez.G Lnet/minecraft/class_2338;
// 73e: getstatic su/catlean/ez.m Lsu/catlean/bg;
// 741: invokevirtual su/catlean/bg.l ()V
// 744: return
}

private final float H(long param1, class_2338 param3, float param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ez.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 7899463211533
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 25868472037295
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 81061760857854
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w 2650679748388004623
// 020: lload 1
// 021: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: lload 9
// 028: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02b: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 02e: dup
// 02f: sipush 24614
// 032: ldc2_w 4452182350805333284
// 035: lload 1
// 036: lxor
// 037: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03f: astore 12
// 041: new java/util/ArrayList
// 044: dup
// 045: invokespecial java/util/ArrayList.<init> ()V
// 048: astore 13
// 04a: fload 4
// 04c: f2i
// 04d: sipush 16292
// 050: ldc2_w 8396322028615044709
// 053: lload 1
// 054: lxor
// 055: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: isub
// 05b: istore 14
// 05d: fload 4
// 05f: f2i
// 060: sipush 24190
// 063: ldc2_w 5678615666523271102
// 066: lload 1
// 067: lxor
// 068: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: iadd
// 06e: istore 15
// 070: astore 11
// 072: iload 14
// 074: aload 11
// 076: ifnonnull 0a5
// 079: iload 15
// 07b: if_icmpgt 18c
// 07e: goto 08b
// 081: ldc2_w 2662069754955491135
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: sipush 24190
// 08e: ldc2_w 5678615666523271102
// 091: lload 1
// 092: lxor
// 093: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: goto 0a5
// 09b: ldc2_w 2662069754955491135
// 09e: lload 1
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: istore 16
// 0a7: sipush 9563
// 0aa: ldc2_w 3262312176681260189
// 0ad: lload 1
// 0ae: lxor
// 0af: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: iload 16
// 0b6: if_icmpge 15e
// 0b9: aload 0
// 0ba: lload 7
// 0bc: aload 12
// 0be: aload 0
// 0bf: iload 16
// 0c1: i2f
// 0c2: lload 5
// 0c4: dup2_x1
// 0c5: pop2
// 0c6: iload 14
// 0c8: i2f
// 0c9: invokespecial su/catlean/ez.T (JFF)Lnet/minecraft/class_243;
// 0cc: invokespecial su/catlean/ez.P (JLnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_2338;
// 0cf: astore 17
// 0d1: aload 11
// 0d3: lload 1
// 0d4: lconst_0
// 0d5: lcmp
// 0d6: ifle 0de
// 0d9: ifnonnull 18c
// 0dc: aload 11
// 0de: lload 1
// 0df: lconst_0
// 0e0: lcmp
// 0e1: iflt 15b
// 0e4: ifnonnull 159
// 0e7: goto 0f4
// 0ea: ldc2_w 2662069754955491135
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: aload 17
// 0f6: ifnull 156
// 0f9: goto 106
// 0fc: ldc2_w 2662069754955491135
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 17
// 108: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 10b: aload 3
// 10c: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 10f: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 112: ldc2_w 5.0
// 115: dcmpg
// 116: aload 11
// 118: ifnonnull 155
// 11b: goto 128
// 11e: ldc2_w 2662069754955491135
// 121: lload 1
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: ifge 156
// 12b: goto 138
// 12e: ldc2_w 2662069754955491135
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 13
// 13a: aload 17
// 13c: iload 16
// 13e: i2f
// 13f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 142: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 145: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 148: goto 155
// 14b: ldc2_w 2662069754955491135
// 14e: lload 1
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: pop
// 156: iinc 16 -1
// 159: aload 11
// 15b: ifnull 0a7
// 15e: lload 1
// 15f: lconst_0
// 160: lcmp
// 161: iflt 18c
// 164: lload 1
// 165: lconst_0
// 166: lcmp
// 167: iflt 174
// 16a: iload 14
// 16c: iload 15
// 16e: if_icmpeq 18c
// 171: iinc 14 1
// 174: aload 11
// 176: ifnull 08b
// 179: lload 1
// 17a: lconst_0
// 17b: lcmp
// 17c: ifle 0a7
// 17f: goto 18c
// 182: ldc2_w 2662069754955491135
// 185: lload 1
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: aload 13
// 18e: checkcast java/lang/Iterable
// 191: astore 15
// 193: bipush 0
// 194: istore 16
// 196: aload 15
// 198: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 19d: astore 17
// 19f: aload 17
// 1a1: aload 11
// 1a3: ifnonnull 1d0
// 1a6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ab: ifne 1c9
// 1ae: goto 1bb
// 1b1: ldc2_w 2662069754955491135
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: aconst_null
// 1bc: goto 26b
// 1bf: ldc2_w 2662069754955491135
// 1c2: lload 1
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: aload 17
// 1cb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d0: astore 18
// 1d2: aload 17
// 1d4: aload 11
// 1d6: ifnonnull 1ff
// 1d9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1de: ifne 1fd
// 1e1: goto 1ee
// 1e4: ldc2_w 2662069754955491135
// 1e7: lload 1
// 1e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: athrow
// 1ee: aload 18
// 1f0: goto 26b
// 1f3: ldc2_w 2662069754955491135
// 1f6: lload 1
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: aload 18
// 1ff: checkcast kotlin/Pair
// 202: astore 19
// 204: bipush 0
// 205: istore 21
// 207: aload 19
// 209: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 20c: checkcast net/minecraft/class_2338
// 20f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 212: aload 3
// 213: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 216: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 219: dstore 19
// 21b: aload 17
// 21d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 222: astore 21
// 224: aload 21
// 226: checkcast kotlin/Pair
// 229: astore 22
// 22b: bipush 0
// 22c: istore 24
// 22e: aload 22
// 230: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 233: checkcast net/minecraft/class_2338
// 236: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 239: aload 3
// 23a: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 23d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 240: dstore 22
// 242: dload 19
// 244: dload 22
// 246: invokestatic java/lang/Double.compare (DD)I
// 249: ifle 254
// 24c: aload 21
// 24e: astore 18
// 250: dload 22
// 252: dstore 19
// 254: aload 17
// 256: invokeinterface java/util/Iterator.hasNext ()Z 1
// 25b: ifne 21b
// 25e: aload 11
// 260: lload 1
// 261: lconst_0
// 262: lcmp
// 263: ifle 24e
// 266: ifnonnull 250
// 269: aload 18
// 26b: checkcast kotlin/Pair
// 26e: aload 11
// 270: ifnonnull 294
// 273: dup
// 274: ifnull 29d
// 277: goto 284
// 27a: ldc2_w 2662069754955491135
// 27d: lload 1
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 287: goto 294
// 28a: ldc2_w 2662069754955491135
// 28d: lload 1
// 28e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 293: athrow
// 294: checkcast java/lang/Number
// 297: invokevirtual java/lang/Number.floatValue ()F
// 29a: goto 2a0
// 29d: pop
// 29e: ldc NaN
// 2a0: freturn
}

private final class_2338 a(int var1, char var2, char var3, float var4, float var5) {
long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var8 = var6 ^ 56681216114169L;
long var10 = var6 ^ 38641189816411L;
long var12 = var6 ^ 137557233324298L;
class_243 var10001 = zf.v(var12).method_33571();
Intrinsics.checkNotNullExpressionValue(var10001, b<"n">(11241, 1014671412495358216L ^ var6));
return this.P(var10, var10001, this.T(var8, var5, var4));
}

private final class_2338 P(long param1, class_243 param3, class_243 param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ez.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 42393016820793
// 00b: lxor
// 00c: dup2
// 00d: bipush 16
// 00f: lushr
// 010: lstore 5
// 012: dup2
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 7
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 69675294523891
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 67385973489492
// 028: lxor
// 029: lstore 10
// 02b: pop2
// 02c: aload 4
// 02e: astore 13
// 030: aload 3
// 031: astore 14
// 033: ldc2_w -1341105257177159003
// 036: lload 1
// 037: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: aload 3
// 03d: astore 15
// 03f: astore 12
// 041: bipush 0
// 042: istore 16
// 044: iload 16
// 046: sipush 12402
// 049: ldc2_w 197957179305183263
// 04c: lload 1
// 04d: lxor
// 04e: invokedynamic n (IJ)I bsm=su/catlean/ez.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: if_icmpge 200
// 056: aload 13
// 058: dconst_0
// 059: ldc2_w -0.03
// 05c: dconst_0
// 05d: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 060: dup
// 061: sipush 8049
// 064: ldc2_w 9134143059674416092
// 067: lload 1
// 068: lxor
// 069: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 071: astore 13
// 073: aload 0
// 074: aload 13
// 076: lload 5
// 078: iload 7
// 07a: i2c
// 07b: aload 14
// 07d: invokespecial su/catlean/ez.Z (Lnet/minecraft/class_243;JCLnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 080: astore 13
// 082: lload 8
// 084: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 087: new net/minecraft/class_3959
// 08a: dup
// 08b: aload 15
// 08d: aload 14
// 08f: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
// 092: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 095: lload 10
// 097: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09a: checkcast net/minecraft/class_1297
// 09d: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 0a0: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 0a3: dup
// 0a4: sipush 28483
// 0a7: ldc2_w 46875142840038370
// 0aa: lload 1
// 0ab: lxor
// 0ac: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b4: astore 17
// 0b6: aload 17
// 0b8: aload 12
// 0ba: ifnonnull 0e2
// 0bd: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 0c0: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 0c3: if_acmpeq 0e6
// 0c6: goto 0d3
// 0c9: ldc2_w -1343226461806907755
// 0cc: lload 1
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: aload 17
// 0d5: goto 0e2
// 0d8: ldc2_w -1343226461806907755
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0e5: areturn
// 0e6: lload 8
// 0e8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0eb: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 0ee: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f3: astore 18
// 0f5: aload 18
// 0f7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0fc: ifeq 1da
// 0ff: aload 18
// 101: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 106: dup
// 107: sipush 24626
// 10a: ldc2_w 8700849209132268702
// 10d: lload 1
// 10e: lxor
// 10f: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 117: checkcast net/minecraft/class_1297
// 11a: astore 19
// 11c: aload 19
// 11e: aload 14
// 120: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 123: ldc2_w 64.0
// 126: dcmpg
// 127: aload 12
// 129: ifnonnull 046
// 12c: aload 12
// 12e: lload 1
// 12f: lconst_0
// 130: lcmp
// 131: ifle 129
// 134: lload 1
// 135: lconst_0
// 136: lcmp
// 137: iflt 159
// 13a: ifnonnull 157
// 13d: ifge 0f5
// 140: goto 14d
// 143: ldc2_w -1343226461806907755
// 146: lload 1
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: aload 19
// 14f: lload 10
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 157: aload 12
// 159: ifnonnull 0fc
// 15c: ifne 0f5
// 15f: aload 14
// 161: astore 20
// 163: aload 14
// 165: aload 13
// 167: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 16a: dup
// 16b: sipush 8049
// 16e: ldc2_w 9134143059674416092
// 171: lload 1
// 172: lxor
// 173: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17b: astore 21
// 17d: aload 19
// 17f: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 182: aload 20
// 184: aload 21
// 186: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
// 189: dup
// 18a: sipush 24860
// 18d: ldc2_w 8459063667438403006
// 190: lload 1
// 191: lxor
// 192: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19a: astore 22
// 19c: aload 22
// 19e: aload 12
// 1a0: ifnonnull 1d3
// 1a3: invokevirtual java/util/Optional.isEmpty ()Z
// 1a6: ifeq 1ce
// 1a9: goto 1b6
// 1ac: ldc2_w -1343226461806907755
// 1af: lload 1
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 12
// 1b8: ifnull 0f5
// 1bb: lload 1
// 1bc: lconst_0
// 1bd: lcmp
// 1be: iflt 1fb
// 1c1: goto 1ce
// 1c4: ldc2_w -1343226461806907755
// 1c7: lload 1
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: aload 22
// 1d0: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 1d3: checkcast net/minecraft/class_2374
// 1d6: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 1d9: areturn
// 1da: aload 14
// 1dc: astore 15
// 1de: aload 14
// 1e0: aload 13
// 1e2: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 1e5: dup
// 1e6: sipush 8049
// 1e9: ldc2_w 9134143059674416092
// 1ec: lload 1
// 1ed: lxor
// 1ee: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1f6: astore 14
// 1f8: iinc 16 1
// 1fb: aload 12
// 1fd: ifnull 044
// 200: lload 1
// 201: lconst_0
// 202: lcmp
// 203: ifle 082
// 206: aconst_null
// 207: areturn
}

private final class_243 Z(class_243 var1, long var2, char var4, class_243 var5) {
long var6 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
long var8 = var6 ^ 134854372721615L;

class_243 var10000;
double var10001;
label17: {
try {
var10000 = var1;
if (zf.z(var8).method_8320(class_2338.method_49638((class_2374)var5)).method_26204() instanceof class_2404) {
var10001 = 0.8;
break label17;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 8027564488738581673L, var6);
}

var10001 = 0.99;
}

var10000 = var10000.method_1021(var10001);
Intrinsics.checkNotNullExpressionValue(var10000, b<"n">(813, 5829425783047282110L ^ var6));
return var10000;
}

private final class_243 T(long param1, float param3, float param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ez.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 50441180662518
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 1783847072302046983
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: ldc2_w 0.017453292519943295
// 1b: dstore 8
// 1d: astore 7
// 1f: fload 4
// 21: f2d
// 22: dload 8
// 24: dmul
// 25: invokestatic java/lang/Math.sin (D)D
// 28: dneg
// 29: fload 3
// 2a: f2d
// 2b: dload 8
// 2d: dmul
// 2e: invokestatic java/lang/Math.cos (D)D
// 31: dmul
// 32: dstore 10
// 34: fload 3
// 35: f2d
// 36: dload 8
// 38: dmul
// 39: invokestatic java/lang/Math.sin (D)D
// 3c: dneg
// 3d: dstore 12
// 3f: fload 4
// 41: f2d
// 42: dload 8
// 44: dmul
// 45: invokestatic java/lang/Math.cos (D)D
// 48: fload 3
// 49: f2d
// 4a: dload 8
// 4c: dmul
// 4d: invokestatic java/lang/Math.cos (D)D
// 50: dmul
// 51: dstore 14
// 53: new net/minecraft/class_243
// 56: dup
// 57: dload 10
// 59: dload 12
// 5b: dload 14
// 5d: invokespecial net/minecraft/class_243.<init> (DDD)V
// 60: ldc2_w 1.5
// 63: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 66: lload 5
// 68: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6b: invokevirtual net/minecraft/class_746.method_60478 ()Lnet/minecraft/class_243;
// 6e: getfield net/minecraft/class_243.field_1352 D
// 71: lload 5
// 73: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 76: aload 7
// 78: ifnonnull a1
// 7b: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 7e: ifeq 9c
// 81: goto 8e
// 84: ldc2_w 1799740072925125431
// 87: lload 1
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: dconst_0
// 8f: goto a7
// 92: ldc2_w 1799740072925125431
// 95: lload 1
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: lload 5
// 9e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a1: invokevirtual net/minecraft/class_746.method_60478 ()Lnet/minecraft/class_243;
// a4: getfield net/minecraft/class_243.field_1351 D
// a7: lload 5
// a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// ac: invokevirtual net/minecraft/class_746.method_60478 ()Lnet/minecraft/class_243;
// af: getfield net/minecraft/class_243.field_1350 D
// b2: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// b5: dup
// b6: sipush 20796
// b9: ldc2_w 4188171506339969059
// bc: lload 1
// bd: lxor
// be: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// c6: areturn
}

private static final double G(AfterEntitySpawn var0, class_742 var1) {
long var2 = a ^ 81452585774563L;
int var4 = (int)((var2 ^ 131232808589448L) >>> 56);
long var5 = (var2 ^ 131232808589448L) << 8 >>> 8;
return var1.method_5707(W.J((byte)var4, var5, var0.getEntity()));
}

private static final double P(Function1 var0, Object var1) {
return ((Number)var0.invoke(var1)).doubleValue();
}

private static final Unit J(AfterEntitySpawn param0, class_742 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ez.a J
// 03: ldc2_w 105319887316638
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 1973093307380
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 4738722892409095685
// 14: lload 2
// 15: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: aload 1
// 1b: sipush 31176
// 1e: ldc2_w 1803097192412449238
// 21: lload 2
// 22: lxor
// 23: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ez.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2b: astore 6
// 2d: aload 1
// 2e: lload 4
// 30: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 33: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 36: aload 6
// 38: ifnonnull 63
// 3b: ifeq 66
// 3e: goto 4b
// 41: ldc2_w 4754633682786812469
// 44: lload 2
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: getstatic su/catlean/ez.W Lsu/catlean/ez;
// 4e: pop
// 4f: aload 0
// 50: invokevirtual su/catlean/api/event/events/world/AfterEntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 53: invokevirtual net/minecraft/class_1297.method_5628 ()I
// 56: goto 63
// 59: ldc2_w 4754633682786812469
// 5c: lload 2
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: putstatic su/catlean/ez.C I
// 66: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 69: areturn
}

private static final void k(Function1 var0, Object var1) {
var0.invoke(var1);
}

private static final Unit c(_w var0) {
long var1 = a ^ 123831625964764L;
long var3 = var1 ^ 66812753885566L;
long var5 = var1 ^ 51470181752307L;
ag.x(class_1268.field_5808, var0.q(), var3, var0.N());
_r.a(var5, (class_2596)(new class_2879(class_1268.field_5808)));
return Unit.INSTANCE;
}

private static final Unit v(_w var0) {
long var1 = a ^ 17403693178154L;
long var3 = var1 ^ 138797139506862L;
long var5 = var1 ^ 43111155480368L;
gg var10000 = gg.P;
class_1792 var10001 = class_1802.field_8634;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8634, b<"n">(7633, 119157030464378478L ^ var1));
var10000.S(var10001, W.K(var5), var3, ez::c);
return Unit.INSTANCE;
}

static {
long var25 = a ^ 134799434327638L;
long var27 = var25 ^ 19582719550773L;
long var29 = var25 ^ 38525221832321L;
long var31 = var25 ^ 108252043197493L;
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[24];
int var21 = 0;
String var20 = "çÆSß°R½Ü±\u009a\"Äl\u008f\u0019´\u008cst%ª\u0091ÿÏû´³#Éæ\n%¡Û\u009a\u000f\u008b\u0003\u009ai\u0018ô¦\u0082ßúçúOò\u001fß¨Ý×ÍV#Æjlt\u0012ôe Ü_écg¿0Ã\u0099\"ÿâ\u0088R\u0084dÏ\u0017'\u0015\u001fñ}ìAî\u008aªçôÙz ÛªèÖV\u001c\u0092\u0011Y°aò\u0087§ùbÖ\r=µ\u008b\u000eî,\f\u0091<\u0095§Wõå G%\u0081Ê\u009c¬\u0013\u008dQ}\u0091µ\u008dàù\u008e\u0083êÝ\f+\u0010©\u0016]û\u001dé´\u0018GÞ\u0018ËiI\u0088\u0011Þ\u0015¨è\u0080+×ýwýü\u0096¡$\u0080æ\u0012\u0013\u0016\u0010õQH]£qÀ´\u0015½e\u001d\u0002ðCð ¾n\u0093R\u0087)\u0095æåéY\u0080¾¢bäÈ\u0007B\u0085 \u0088[êo\u0006Dóu\u001cï\u008d\u0010æüwMVïu\u0083\u0005Mê³ÖñÍ\u0003\u0018se] ÇãÆY\tí1\u0017\u008evÎéùazù\bèÃ^\u0018\fM¡kÂÿ]«É\u001c\u0080\u0006ÉK\u0082¢´\u0017ÍÝnÃ\u0013K(ºøn7#;\u001a\u008d+õ¬à\u0004\u0099¥\u0085¥kÝJÉ²ªT.\u0095\u009b¹)\u0091\",+\u0097¡\u0081·\u0017c¸ âw\u0081òy[ûÌ\u008dK\u0089óõ-\u0002$\u00932\u0013¾È*}\u0087\u001cR\u008bÚ>ç\u0013\u0081x'F®gkÌÍ3\u001cìô\u008fä\u0081\u0004´ØÕWzüU\u001d\u000bþ\u009d16õ`Ú\u0088á\u0011wDÀ$\u00146\u008b¿6\u000b=8º¢Ìð8\u009a\u000eÒö\u0086=açS¿Fe3éR.\u008eP|u+æ\u0094\u00ad&ååÑì\u009e²s/Ì\u0096÷ºiêÈ©\u001a/g,{ø1õnÖ´è\u0083 F4Tð°\u0093Ø\u000fú\u0083ÿüE)(\u0001\u000b\u0082\u0016aêÜm¸\\Éá!¹/Xagp¾\u0010íD\u009c[¿\u001f\u00ad¹>\u001bß\u009fR¶\u0091´\u0094·\u001c8\u008e¨hÄÍ\u009c35\u0092â\u008a,½\u0085¢M\u0090<ûçB~2µ>lw\b_n\u0019\u008dºp\\h¹cô;Êk\fH5\u0003j1\\Át½ª¥%ç(\"\bJæ(7ù\u008a\u0080\u009a<²\u009e³z\u0018(\u0089í·ûÄ@\u008f}:¨\u0000VÑkl³kú\u0002\u0097äRä\u0080\u001aï+\t\u0080P\u008c\u001aÊ\u0003O*aVÓú\u0088Ì\u0095^êqî\t\u00141xï\u0081Y\u0099×ÄÆ\u000e\u00ad\u0019\u009b\"¥\u0019\u0019ÜÉÑãÚhÍ\u009cÆF\u008c¥rÔ\u0097ñ°\u0084ð\u001a\u0089\u001dGS\u0081r÷Ah«[ïÑß\u0017Èâ >\u0000S Ó£\u009dæX:KÕ\u0086\u009e\u0084Pq¶4Î~ñU\u009ci_º\u0007\u0012\u0088\u0080Û\u009b°QÈ\u0005\u0012N?Ïêø\u0082{åì\r ½\\¦)-rØ£\u009c;söôåÿ÷y\u00032X\u0002\u0016æ\rÊ\u0015oe\u0001|\u0099à\u0018¬\u0007\u0095\u0011Xä.tË#\u0014\r\u0081ea\u0012Ü]\u008aTx%\u0097\u0097 \b¿¿\u00055{ÃL¡I58ÀT,¶\u001a /c\u000e\u0087\u009aS\t3ýjê,\\m \u00ady\u001e°6\u008bOºÅJ¬³Ò`ã\f#\u008etðag\u001d²Ä\u0086lãc\u009amD";
int var22 = "çÆSß°R½Ü±\u009a\"Äl\u008f\u0019´\u008cst%ª\u0091ÿÏû´³#Éæ\n%¡Û\u009a\u000f\u008b\u0003\u009ai\u0018ô¦\u0082ßúçúOò\u001fß¨Ý×ÍV#Æjlt\u0012ôe Ü_écg¿0Ã\u0099\"ÿâ\u0088R\u0084dÏ\u0017'\u0015\u001fñ}ìAî\u008aªçôÙz ÛªèÖV\u001c\u0092\u0011Y°aò\u0087§ùbÖ\r=µ\u008b\u000eî,\f\u0091<\u0095§Wõå G%\u0081Ê\u009c¬\u0013\u008dQ}\u0091µ\u008dàù\u008e\u0083êÝ\f+\u0010©\u0016]û\u001dé´\u0018GÞ\u0018ËiI\u0088\u0011Þ\u0015¨è\u0080+×ýwýü\u0096¡$\u0080æ\u0012\u0013\u0016\u0010õQH]£qÀ´\u0015½e\u001d\u0002ðCð ¾n\u0093R\u0087)\u0095æåéY\u0080¾¢bäÈ\u0007B\u0085 \u0088[êo\u0006Dóu\u001cï\u008d\u0010æüwMVïu\u0083\u0005Mê³ÖñÍ\u0003\u0018se] ÇãÆY\tí1\u0017\u008evÎéùazù\bèÃ^\u0018\fM¡kÂÿ]«É\u001c\u0080\u0006ÉK\u0082¢´\u0017ÍÝnÃ\u0013K(ºøn7#;\u001a\u008d+õ¬à\u0004\u0099¥\u0085¥kÝJÉ²ªT.\u0095\u009b¹)\u0091\",+\u0097¡\u0081·\u0017c¸ âw\u0081òy[ûÌ\u008dK\u0089óõ-\u0002$\u00932\u0013¾È*}\u0087\u001cR\u008bÚ>ç\u0013\u0081x'F®gkÌÍ3\u001cìô\u008fä\u0081\u0004´ØÕWzüU\u001d\u000bþ\u009d16õ`Ú\u0088á\u0011wDÀ$\u00146\u008b¿6\u000b=8º¢Ìð8\u009a\u000eÒö\u0086=açS¿Fe3éR.\u008eP|u+æ\u0094\u00ad&ååÑì\u009e²s/Ì\u0096÷ºiêÈ©\u001a/g,{ø1õnÖ´è\u0083 F4Tð°\u0093Ø\u000fú\u0083ÿüE)(\u0001\u000b\u0082\u0016aêÜm¸\\Éá!¹/Xagp¾\u0010íD\u009c[¿\u001f\u00ad¹>\u001bß\u009fR¶\u0091´\u0094·\u001c8\u008e¨hÄÍ\u009c35\u0092â\u008a,½\u0085¢M\u0090<ûçB~2µ>lw\b_n\u0019\u008dºp\\h¹cô;Êk\fH5\u0003j1\\Át½ª¥%ç(\"\bJæ(7ù\u008a\u0080\u009a<²\u009e³z\u0018(\u0089í·ûÄ@\u008f}:¨\u0000VÑkl³kú\u0002\u0097äRä\u0080\u001aï+\t\u0080P\u008c\u001aÊ\u0003O*aVÓú\u0088Ì\u0095^êqî\t\u00141xï\u0081Y\u0099×ÄÆ\u000e\u00ad\u0019\u009b\"¥\u0019\u0019ÜÉÑãÚhÍ\u009cÆF\u008c¥rÔ\u0097ñ°\u0084ð\u001a\u0089\u001dGS\u0081r÷Ah«[ïÑß\u0017Èâ >\u0000S Ó£\u009dæX:KÕ\u0086\u009e\u0084Pq¶4Î~ñU\u009ci_º\u0007\u0012\u0088\u0080Û\u009b°QÈ\u0005\u0012N?Ïêø\u0082{åì\r ½\\¦)-rØ£\u009c;söôåÿ÷y\u00032X\u0002\u0016æ\rÊ\u0015oe\u0001|\u0099à\u0018¬\u0007\u0095\u0011Xä.tË#\u0014\r\u0081ea\u0012Ü]\u008aTx%\u0097\u0097 \b¿¿\u00055{ÃL¡I58ÀT,¶\u001a /c\u000e\u0087\u009aS\t3ýjê,\\m \u00ady\u001e°6\u008bOºÅJ¬³Ò`ã\f#\u008etðag\u001d²Ä\u0086lãc\u009amD"
.length();
char var19 = '(';
int var36 = -1;

label64:
while (true) {
String var37 = var20.substring(++var36, var36 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var37.getBytes("ISO-8859-1"));
String var50 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var50;
if ((var36 += var19) >= var22) {
b = var23;
c = new String[24];
h = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[8];
int var8 = 0;
String var9 = "§hÿ2.6r^)è;kfJ\u0089/UG\u008dgw½\u008c/\u0000ÓgÙFq\u009a\u00967\u0080\u008a¢-¯\u008cá+¾P\u0011å¢Kª";
int var10 = "§hÿ2.6r^)è;kfJ\u0089/UG\u008dgw½\u008c/\u0000ÓgÙFq\u009a\u00967\u0080\u008a¢-¯\u008cá+¾P\u0011å¢Kª".length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var40 = var11;
var10001 = var8++;
long var54 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var59 = -1;

while (true) {
long var13 = var54;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var62 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var59) {
case 0:
var40[var10001] = var62;
if (var7 >= var10) {
f = var11;
g = new Integer[8];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -3954987825764659025L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var57 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var48 = -1;
i = var57;
KProperty[] var33 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ez.class, b<"n">(30510, 6867746317180241916L ^ var25), b<"n">(4596, 1937856956921143610L ^ var25), 0)),
Reflection.property1(new PropertyReference1Impl(ez.class, b<"n">(23518, 5934728999826467608L ^ var25), b<"n">(10714, 9045574330444110101L ^ var25), 0))
};
F = var33;
W = new ez(var27);
d = yp.t(W, b<"n">(20139, 2999751259692678761L ^ var25), false, var29, null, null, c<"n">(22495, 3738671593050637279L ^ var25), null);
E = yp.L(W, b<"n">(7652, 1911928720243649836L ^ var25), f9.SILENT_FULL, null, null, c<"n">(22495, 3738671593050637279L ^ var25), null, var31);
m = new bg();
X = new HashMap();
return;
}
break;
default:
var40[var10001] = var62;
if (var7 < var10) {
continue label46;
}

var9 = "ä#=}¨Ë\u0087÷BÏ}¯\u009a3\u0000\u000e";
var10 = "ä#=}¨Ë\u0087÷BÏ}¯\u009a3\u0000\u000e".length();
var7 = 0;
}

byte var47 = var7;
var7 += 8;
var12 = var9.substring(var47, var7).getBytes("ISO-8859-1");
var40 = var11;
var10001 = var8++;
var54 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var59 = 0;
}
}
}

var19 = var20.charAt(var36);
break;
default:
var23[var21++] = var50;
if ((var36 += var19) < var22) {
var19 = var20.charAt(var36);
continue label64;
}

var20 = "4$uXØî\u0007\u008f<U%\u0010rú-ÿ(ñ\u001a|]!*ÌÄ°Þ\bOÄ\u001dK\"!D=`2qÆ\u001aîx}ÕÒ\u009dtP\u007f¦óþòÆ\tê";
var22 = "4$uXØî\u0007\u008f<U%\u0010rú-ÿ(ñ\u001a|]!*ÌÄ°Þ\bOÄ\u001dK\"!D=`2qÆ\u001aîx}ÕÒ\u009dtP\u007f¦óþòÆ\tê".length();
var19 = 16;
var36 = -1;
}

var37 = var20.substring(++var36, var36 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12435;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ez", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/ez" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5206;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ez", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/ez" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
