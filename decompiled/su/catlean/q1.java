package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_2797;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PlayerEntityDeathEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.api.event.events.world.EntitySpawn;
import su.catlean.gofra.Flow;

public final class q1 extends _g {
@NotNull
public static final q1 W;
static final KProperty[] f;
@NotNull
private static final cq e;
@NotNull
private static final cq E;
@NotNull
private static final cq Y;
@NotNull
private static final cq u;
@NotNull
private static final cq S;
@NotNull
private static final cq K;
@NotNull
private static final cq y;
@NotNull
private static final c8 z;
@NotNull
private static final c8 g;
@NotNull
private static final cq a;
@NotNull
private static final cw l;
@NotNull
private static final cw B;
@NotNull
private static final cq h;
@NotNull
private static final cq j;
@NotNull
private static final cq V;
@NotNull
private static final cw A;
@NotNull
private static final cq F;
@NotNull
private static final cw L;
@NotNull
private static final bj D;
@NotNull
private static final bj T;
@NotNull
private static final bj k;
@NotNull
private static final bj i;
@NotNull
private static final bj N;
@NotNull
private static final bj X;
@NotNull
private static final bj U;
@NotNull
private static final bg x;
@NotNull
private static final bg C;
@NotNull
private static final bg w;
@NotNull
private static final bg o;
@NotNull
private static final bg G;
@NotNull
private static final bg I;
@NotNull
private static final bg b;
@NotNull
private static final bg P;
@NotNull
private static final bg O;
@NotNull
private static final List t;
@NotNull
private static final List J;
@NotNull
private static final ConcurrentHashMap m;
private static boolean n;
private static int d;
private static final long c = yz.a(8727518763717427279L, 4851239753951672957L, MethodHandles.lookup().lookupClass()).a(144039010805440L);
private static final String[] ab;
private static final String[] fb;
private static final Map gb = new HashMap(13);
private static final long[] hb;
private static final Integer[] lb;
private static final Map mb;
private static final long[] nb;
private static final Long[] ob;
private static final Map pb;

private q1(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 85161383924604L;
super(b<"h">(32403, 2592944197218072364L ^ var1), jt.d(), null, 4, null, var3);
}

private final boolean e(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 79586049581197L;
return (Boolean)e.E(this, var3, f[0]);
}

private final boolean K(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 21625262190037L;
return (Boolean)E.E(this, var3, f[1]);
}

private final boolean T(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 82288888314370L;
return (Boolean)Y.E(this, var6, f[2]);
}

private final boolean h(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 41701130169949L;
return (Boolean)u.E(this, var3, f[3]);
}

private final boolean P(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
long var6 = var4 ^ 85066600182154L;
return (Boolean)S.E(this, var6, f[4]);
}

private final boolean i(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 2245890338417L;
return (Boolean)K.E(this, var3, f[5]);
}

private final boolean F(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 54745667232752L;
return (Boolean)y.E(this, var3, f[c<"k">(12215, 452639540378165570L ^ var1)]);
}

private final int z(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ c;
long var5 = var3 ^ 59662334028152L;
return ((Number)z.E(this, var5, f[c<"k">(16564, 8617226668456412369L ^ var3)])).intValue();
}

private final int G(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 28166047638310L;
return ((Number)g.E(this, var6, f[c<"k">(1988, 4776436343069149687L ^ var4)])).intValue();
}

private final boolean D(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 21108061392198L;
return (Boolean)a.E(this, var6, f[c<"k">(7492, 3922189982443044139L ^ var4)]);
}

private final cm Q(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 134986547562536L;
return (cm)l.E(this, var3, f[c<"k">(16691, 3082030363039622146L ^ var1)]);
}

private final cm g(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 67506950911254L;
return (cm)B.E(this, var3, f[c<"k">(27905, 4147026316751271212L ^ var1)]);
}

private final boolean r(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 19668409050673L;
return (Boolean)h.E(this, var3, f[c<"k">(9898, 6473342272829222298L ^ var1)]);
}

private final boolean W(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 29905213929702L;
return (Boolean)j.E(this, var3, f[c<"k">(10338, 2255768636736716174L ^ var1)]);
}

private final boolean q(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 117417389080738L;
return (Boolean)V.E(this, var3, f[c<"k">(24992, 6215432912772926478L ^ var1)]);
}

private final cm Y(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 106909430098488L;
return (cm)A.E(this, var6, f[c<"k">(1987, 7108341647297511641L ^ var4)]);
}

private final boolean M(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 123424491730697L;
return (Boolean)F.E(this, var3, f[c<"k">(11471, 7762575345875187396L ^ var1)]);
}

private final cm l(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 104843879290239L;
return (cm)L.E(this, var3, f[c<"k">(14258, 6966570284840062940L ^ var1)]);
}

@NotNull
public final bg j() {
return I;
}

public final boolean x() {
return n;
}

public final void h(boolean <set-?>) {
n = <set-?>;
}

@Flow
private final void G(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: ldc2_w 107352103577636
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 64228724591623
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 55840531286517
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 7070864404221
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 119006990587306
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 118592912899057
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 30349222372306
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 29480184070689
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 134135886010239
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 43067027282603
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 124769800563762
// 066: lxor
// 067: dup2
// 068: bipush 32
// 06a: lushr
// 06b: l2i
// 06c: istore 23
// 06e: dup2
// 06f: bipush 32
// 071: lshl
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 24
// 078: dup2
// 079: bipush 48
// 07b: lshl
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 25
// 082: pop2
// 083: dup2
// 084: ldc2_w 38931938986577
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 88379476264201
// 08e: lxor
// 08f: lstore 28
// 091: dup2
// 092: ldc2_w 137977381345345
// 095: lxor
// 096: lstore 30
// 098: pop2
// 099: ldc2_w -7950641574438780191
// 09c: lload 2
// 09d: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: astore 32
// 0a4: getstatic su/catlean/q1.I Lsu/catlean/bg;
// 0a7: sipush 8040
// 0aa: ldc2_w 1026983813718044438
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: lload 13
// 0b6: invokevirtual su/catlean/bg.c (IJ)Z
// 0b9: aload 32
// 0bb: ifnull 15e
// 0be: ifne 158
// 0c1: goto 0ce
// 0c4: ldc2_w -8062944543031086540
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: getstatic su/catlean/q1.n Z
// 0d1: aload 32
// 0d3: ifnull 15e
// 0d6: goto 0e3
// 0d9: ldc2_w -8062944543031086540
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: ifeq 158
// 0e6: goto 0f3
// 0e9: ldc2_w -8062944543031086540
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: aload 0
// 0f4: aload 1
// 0f5: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 0f8: getstatic su/catlean/q1.X Lsu/catlean/bj;
// 0fb: getstatic su/catlean/q1.U Lsu/catlean/bj;
// 0fe: iload 23
// 100: aload 0
// 101: checkcast su/catlean/_g
// 104: sipush 5256
// 107: ldc2_w 6220381706511405010
// 10a: lload 2
// 10b: lxor
// 10c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: bipush 0
// 112: anewarray 1092
// 115: iload 24
// 117: i2c
// 118: bipush 0
// 119: bipush 4
// 11a: aconst_null
// 11b: iload 25
// 11d: i2s
// 11e: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 121: lload 28
// 123: dup2_x1
// 124: pop2
// 125: iload 23
// 127: aload 0
// 128: checkcast su/catlean/_g
// 12b: sipush 24374
// 12e: ldc2_w 6176477418216227937
// 131: lload 2
// 132: lxor
// 133: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: bipush 0
// 139: anewarray 1092
// 13c: iload 24
// 13e: i2c
// 13f: bipush 0
// 140: bipush 4
// 141: aconst_null
// 142: iload 25
// 144: i2s
// 145: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 148: invokespecial su/catlean/q1.O (Lnet/minecraft/class_332;Lsu/catlean/bj;Lsu/catlean/bj;JLjava/lang/String;Ljava/lang/String;)V
// 14b: goto 158
// 14e: ldc2_w -8062944543031086540
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: aload 0
// 159: lload 6
// 15b: invokespecial su/catlean/q1.K (J)Z
// 15e: aload 32
// 160: ifnull 29d
// 163: ifeq 291
// 166: goto 173
// 169: ldc2_w -8062944543031086540
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: lload 17
// 175: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 178: lload 8
// 17a: dup2_x1
// 17b: pop2
// 17c: invokestatic su/catlean/s_.z (JLnet/minecraft/class_746;)Ljava/util/List;
// 17f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 184: astore 33
// 186: aload 33
// 188: invokeinterface java/util/Iterator.hasNext ()Z 1
// 18d: ifeq 291
// 190: aload 33
// 192: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 197: checkcast net/minecraft/class_1799
// 19a: astore 34
// 19c: aload 34
// 19e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 1a1: aload 32
// 1a3: ifnull 1af
// 1a6: ifne 186
// 1a9: aload 0
// 1aa: aload 34
// 1ac: invokespecial su/catlean/q1.x (Lnet/minecraft/class_1799;)I
// 1af: aload 32
// 1b1: ifnull 1d6
// 1b4: sipush 5533
// 1b7: ldc2_w 3690956858863347152
// 1ba: lload 2
// 1bb: lxor
// 1bc: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: if_icmpge 186
// 1c4: goto 1d1
// 1c7: ldc2_w -8062944543031086540
// 1ca: lload 2
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: aload 34
// 1d3: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 1d6: ifeq 186
// 1d9: aload 0
// 1da: aload 1
// 1db: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 1de: getstatic su/catlean/q1.D Lsu/catlean/bj;
// 1e1: getstatic su/catlean/q1.T Lsu/catlean/bj;
// 1e4: iload 23
// 1e6: aload 0
// 1e7: checkcast su/catlean/_g
// 1ea: sipush 27163
// 1ed: ldc2_w 8134067312073322797
// 1f0: lload 2
// 1f1: lxor
// 1f2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: bipush 0
// 1f8: anewarray 1092
// 1fb: iload 24
// 1fd: i2c
// 1fe: bipush 0
// 1ff: bipush 4
// 200: aconst_null
// 201: iload 25
// 203: i2s
// 204: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 207: lload 28
// 209: dup2_x1
// 20a: pop2
// 20b: iload 23
// 20d: aload 0
// 20e: checkcast su/catlean/_g
// 211: sipush 15439
// 214: ldc2_w 368115326597293937
// 217: lload 2
// 218: lxor
// 219: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: bipush 0
// 21f: anewarray 1092
// 222: iload 24
// 224: i2c
// 225: bipush 0
// 226: bipush 4
// 227: aconst_null
// 228: iload 25
// 22a: i2s
// 22b: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 22e: invokespecial su/catlean/q1.O (Lnet/minecraft/class_332;Lsu/catlean/bj;Lsu/catlean/bj;JLjava/lang/String;Ljava/lang/String;)V
// 231: getstatic su/catlean/q1.w Lsu/catlean/bg;
// 234: sipush 27587
// 237: ldc2_w 4051311861844646843
// 23a: lload 2
// 23b: lxor
// 23c: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: lload 30
// 243: invokevirtual su/catlean/bg.q (IJ)Z
// 246: aload 32
// 248: ifnull 1a1
// 24b: aload 32
// 24d: ifnull 275
// 250: ifeq 290
// 253: goto 260
// 256: ldc2_w -8062944543031086540
// 259: lload 2
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 263: lload 19
// 265: invokevirtual su/catlean/qm.f (J)Z
// 268: goto 275
// 26b: ldc2_w -8062944543031086540
// 26e: lload 2
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: ifeq 290
// 278: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 27b: invokevirtual su/catlean/d2.e ()Lsu/catlean/lp;
// 27e: lload 15
// 280: invokevirtual su/catlean/lp.L (J)V
// 283: goto 290
// 286: ldc2_w -8062944543031086540
// 289: lload 2
// 28a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: athrow
// 290: return
// 291: aload 0
// 292: iload 10
// 294: i2s
// 295: iload 11
// 297: i2c
// 298: iload 12
// 29a: invokespecial su/catlean/q1.P (SCI)Z
// 29d: aload 32
// 29f: ifnull 416
// 2a2: ifeq 410
// 2a5: goto 2b2
// 2a8: ldc2_w -8062944543031086540
// 2ab: lload 2
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 2b5: invokevirtual su/catlean/nf.S ()J
// 2b8: sipush 19890
// 2bb: ldc2_w 7988468880342866234
// 2be: lload 2
// 2bf: lxor
// 2c0: invokedynamic d (IJ)J bsm=su/catlean/q1.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: lcmp
// 2c6: aload 32
// 2c8: ifnull 416
// 2cb: goto 2d8
// 2ce: ldc2_w -8062944543031086540
// 2d1: lload 2
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: ifle 410
// 2db: goto 2e8
// 2de: ldc2_w -8062944543031086540
// 2e1: lload 2
// 2e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e7: athrow
// 2e8: lload 4
// 2ea: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2ed: invokevirtual net/minecraft/class_310.method_1542 ()Z
// 2f0: aload 32
// 2f2: ifnull 416
// 2f5: goto 302
// 2f8: ldc2_w -8062944543031086540
// 2fb: lload 2
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: ifne 410
// 305: goto 312
// 308: ldc2_w -8062944543031086540
// 30b: lload 2
// 30c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 311: athrow
// 312: lload 17
// 314: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 317: getfield net/minecraft/class_746.field_6012 I
// 31a: aload 32
// 31c: ifnull 416
// 31f: goto 32c
// 322: ldc2_w -8062944543031086540
// 325: lload 2
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: sipush 2890
// 32f: ldc2_w 1731806244432804666
// 332: lload 2
// 333: lxor
// 334: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: if_icmple 410
// 33c: goto 349
// 33f: ldc2_w -8062944543031086540
// 342: lload 2
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: aload 0
// 34a: aload 1
// 34b: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 34e: getstatic su/catlean/q1.k Lsu/catlean/bj;
// 351: getstatic su/catlean/q1.i Lsu/catlean/bj;
// 354: iload 23
// 356: aload 0
// 357: checkcast su/catlean/_g
// 35a: sipush 5595
// 35d: ldc2_w 2132923677594504855
// 360: lload 2
// 361: lxor
// 362: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: bipush 0
// 368: anewarray 1092
// 36b: iload 24
// 36d: i2c
// 36e: bipush 0
// 36f: bipush 4
// 370: aconst_null
// 371: iload 25
// 373: i2s
// 374: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 377: lload 28
// 379: dup2_x1
// 37a: pop2
// 37b: iload 23
// 37d: aload 0
// 37e: checkcast su/catlean/_g
// 381: sipush 29478
// 384: ldc2_w 2410865905725515881
// 387: lload 2
// 388: lxor
// 389: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: bipush 1
// 38f: anewarray 1092
// 392: astore 33
// 394: aload 33
// 396: bipush 0
// 397: aload 0
// 398: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 39b: invokevirtual su/catlean/nf.S ()J
// 39e: lload 21
// 3a0: invokespecial su/catlean/q1.O (JJ)Ljava/lang/String;
// 3a3: aastore
// 3a4: aload 33
// 3a6: iload 24
// 3a8: i2c
// 3a9: bipush 0
// 3aa: bipush 4
// 3ab: aconst_null
// 3ac: iload 25
// 3ae: i2s
// 3af: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 3b2: invokespecial su/catlean/q1.O (Lnet/minecraft/class_332;Lsu/catlean/bj;Lsu/catlean/bj;JLjava/lang/String;Ljava/lang/String;)V
// 3b5: getstatic su/catlean/q1.x Lsu/catlean/bg;
// 3b8: sipush 12368
// 3bb: ldc2_w 6440782693903319068
// 3be: lload 2
// 3bf: lxor
// 3c0: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c5: lload 30
// 3c7: invokevirtual su/catlean/bg.q (IJ)Z
// 3ca: aload 32
// 3cc: ifnull 3f4
// 3cf: ifeq 40f
// 3d2: goto 3df
// 3d5: ldc2_w -8062944543031086540
// 3d8: lload 2
// 3d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3de: athrow
// 3df: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 3e2: lload 19
// 3e4: invokevirtual su/catlean/qm.f (J)Z
// 3e7: goto 3f4
// 3ea: ldc2_w -8062944543031086540
// 3ed: lload 2
// 3ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f3: athrow
// 3f4: ifeq 40f
// 3f7: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 3fa: invokevirtual su/catlean/d2.K ()Lsu/catlean/lp;
// 3fd: lload 15
// 3ff: invokevirtual su/catlean/lp.L (J)V
// 402: goto 40f
// 405: ldc2_w -8062944543031086540
// 408: lload 2
// 409: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40e: athrow
// 40f: return
// 410: aload 0
// 411: lload 26
// 413: invokespecial su/catlean/q1.i (J)Z
// 416: aload 32
// 418: ifnull 44c
// 41b: ifeq 54d
// 41e: goto 42b
// 421: ldc2_w -8062944543031086540
// 424: lload 2
// 425: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42a: athrow
// 42b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 42e: invokevirtual su/catlean/dm.K ()J
// 431: sipush 1728
// 434: ldc2_w 7896760891292455497
// 437: lload 2
// 438: lxor
// 439: invokedynamic d (IJ)J bsm=su/catlean/q1.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43e: lcmp
// 43f: goto 44c
// 442: ldc2_w -8062944543031086540
// 445: lload 2
// 446: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44b: athrow
// 44c: aload 32
// 44e: ifnull 476
// 451: ifge 54d
// 454: goto 461
// 457: ldc2_w -8062944543031086540
// 45a: lload 2
// 45b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 460: athrow
// 461: lload 17
// 463: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 466: getfield net/minecraft/class_746.field_6012 I
// 469: goto 476
// 46c: ldc2_w -8062944543031086540
// 46f: lload 2
// 470: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 475: athrow
// 476: sipush 23287
// 479: ldc2_w 6444492108271626923
// 47c: lload 2
// 47d: lxor
// 47e: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 483: if_icmple 54d
// 486: aload 0
// 487: aload 1
// 488: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 48b: getstatic su/catlean/q1.N Lsu/catlean/bj;
// 48e: getstatic su/catlean/q1.N Lsu/catlean/bj;
// 491: iload 23
// 493: aload 0
// 494: checkcast su/catlean/_g
// 497: sipush 1909
// 49a: ldc2_w 9151238439333518440
// 49d: lload 2
// 49e: lxor
// 49f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: bipush 0
// 4a5: anewarray 1092
// 4a8: iload 24
// 4aa: i2c
// 4ab: bipush 0
// 4ac: bipush 4
// 4ad: aconst_null
// 4ae: iload 25
// 4b0: i2s
// 4b1: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 4b4: lload 28
// 4b6: dup2_x1
// 4b7: pop2
// 4b8: iload 23
// 4ba: aload 0
// 4bb: checkcast su/catlean/_g
// 4be: sipush 27543
// 4c1: ldc2_w 8210970133244719254
// 4c4: lload 2
// 4c5: lxor
// 4c6: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cb: bipush 1
// 4cc: anewarray 1092
// 4cf: astore 33
// 4d1: aload 33
// 4d3: bipush 0
// 4d4: aload 0
// 4d5: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 4d8: invokevirtual su/catlean/dm.K ()J
// 4db: lload 21
// 4dd: invokespecial su/catlean/q1.O (JJ)Ljava/lang/String;
// 4e0: aastore
// 4e1: aload 33
// 4e3: iload 24
// 4e5: i2c
// 4e6: bipush 0
// 4e7: bipush 4
// 4e8: aconst_null
// 4e9: iload 25
// 4eb: i2s
// 4ec: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 4ef: invokespecial su/catlean/q1.O (Lnet/minecraft/class_332;Lsu/catlean/bj;Lsu/catlean/bj;JLjava/lang/String;Ljava/lang/String;)V
// 4f2: getstatic su/catlean/q1.C Lsu/catlean/bg;
// 4f5: sipush 14603
// 4f8: ldc2_w 2830561761723337051
// 4fb: lload 2
// 4fc: lxor
// 4fd: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 502: lload 30
// 504: invokevirtual su/catlean/bg.q (IJ)Z
// 507: aload 32
// 509: ifnull 531
// 50c: ifeq 54c
// 50f: goto 51c
// 512: ldc2_w -8062944543031086540
// 515: lload 2
// 516: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51b: athrow
// 51c: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 51f: lload 19
// 521: invokevirtual su/catlean/qm.f (J)Z
// 524: goto 531
// 527: ldc2_w -8062944543031086540
// 52a: lload 2
// 52b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 530: athrow
// 531: ifeq 54c
// 534: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 537: invokevirtual su/catlean/d2.v ()Lsu/catlean/lp;
// 53a: lload 15
// 53c: invokevirtual su/catlean/lp.L (J)V
// 53f: goto 54c
// 542: ldc2_w -8062944543031086540
// 545: lload 2
// 546: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54b: athrow
// 54c: return
// 54d: return
}

@Flow
private final void D(SendPacket var1) {
long var2 = c ^ 87070958388400L;

try {
if (var1.getPacket() instanceof class_2797) {
b.l();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -248115543230292320L, var2);
}
}

@Flow
private final void a(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: ldc2_w 104954413276248
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 3293444672306
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 139156654799460
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 41844468730106
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 123098671933269
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 93502797549453
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 41010426337198
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 52871392637388
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 39692520978013
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 78240088384259
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 13772867558682
// 066: lxor
// 067: dup2
// 068: bipush 48
// 06a: lushr
// 06b: l2i
// 06c: istore 23
// 06e: dup2
// 06f: bipush 16
// 071: lshl
// 072: bipush 32
// 074: lushr
// 075: l2i
// 076: istore 24
// 078: dup2
// 079: bipush 48
// 07b: lshl
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 25
// 082: pop2
// 083: dup2
// 084: ldc2_w 3337185302741
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 87602214377550
// 08e: lxor
// 08f: dup2
// 090: bipush 32
// 092: lushr
// 093: l2i
// 094: istore 28
// 096: dup2
// 097: bipush 32
// 099: lshl
// 09a: bipush 48
// 09c: lushr
// 09d: l2i
// 09e: istore 29
// 0a0: dup2
// 0a1: bipush 48
// 0a3: lshl
// 0a4: bipush 48
// 0a6: lushr
// 0a7: l2i
// 0a8: istore 30
// 0aa: pop2
// 0ab: dup2
// 0ac: ldc2_w 71395145811235
// 0af: lxor
// 0b0: lstore 31
// 0b2: dup2
// 0b3: ldc2_w 51960539945968
// 0b6: lxor
// 0b7: dup2
// 0b8: bipush 32
// 0ba: lushr
// 0bb: l2i
// 0bc: istore 33
// 0be: dup2
// 0bf: bipush 32
// 0c1: lshl
// 0c2: bipush 40
// 0c4: lushr
// 0c5: l2i
// 0c6: istore 34
// 0c8: dup2
// 0c9: bipush 56
// 0cb: lshl
// 0cc: bipush 56
// 0ce: lushr
// 0cf: l2i
// 0d0: istore 35
// 0d2: pop2
// 0d3: dup2
// 0d4: ldc2_w 74402217061437
// 0d7: lxor
// 0d8: lstore 36
// 0da: dup2
// 0db: ldc2_w 93936263960723
// 0de: lxor
// 0df: lstore 38
// 0e1: pop2
// 0e2: ldc2_w 2726255893760276125
// 0e5: lload 2
// 0e6: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: astore 40
// 0ed: nop
// 0ee: aload 1
// 0ef: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0f2: instanceof net/minecraft/class_2739
// 0f5: aload 40
// 0f7: ifnull 5eb
// 0fa: ifeq 5e4
// 0fd: goto 10a
// 100: ldc2_w 2622947102104192584
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: lload 9
// 10c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 10f: aload 1
// 110: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 113: checkcast net/minecraft/class_2739
// 116: invokevirtual net/minecraft/class_2739.comp_1127 ()I
// 119: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
// 11c: dup
// 11d: ifnonnull 139
// 120: goto 12d
// 123: ldc2_w 2622947102104192584
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: pop
// 12e: return
// 12f: ldc2_w 2622947102104192584
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: astore 41
// 13b: aload 41
// 13d: instanceof net/minecraft/class_1657
// 140: aload 40
// 142: ifnull 16c
// 145: ifeq 16f
// 148: goto 155
// 14b: ldc2_w 2622947102104192584
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: aload 41
// 157: lload 19
// 159: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 15f: goto 16c
// 162: ldc2_w 2622947102104192584
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: ifeq 170
// 16f: return
// 170: aload 1
// 171: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 174: checkcast net/minecraft/class_2739
// 177: invokevirtual net/minecraft/class_2739.comp_1128 ()Ljava/util/List;
// 17a: dup
// 17b: sipush 2901
// 17e: ldc2_w 4746365509246837860
// 181: lload 2
// 182: lxor
// 183: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18b: checkcast java/lang/Iterable
// 18e: astore 42
// 190: bipush 0
// 191: istore 43
// 193: aload 42
// 195: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 19a: astore 44
// 19c: aload 44
// 19e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1a3: ifeq 5e3
// 1a6: aload 44
// 1a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ad: astore 45
// 1af: aload 45
// 1b1: checkcast net/minecraft/class_2945$class_7834
// 1b4: astore 46
// 1b6: bipush 0
// 1b7: istore 47
// 1b9: aload 40
// 1bb: ifnull 5de
// 1be: aload 46
// 1c0: invokevirtual net/minecraft/class_2945$class_7834.comp_1115 ()I
// 1c3: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1c6: ldc "8"
// 1c8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1cb: aload 40
// 1cd: ifnull 5eb
// 1d0: goto 1dd
// 1d3: ldc2_w 2622947102104192584
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: ifeq 5dc
// 1e0: goto 1ed
// 1e3: ldc2_w 2622947102104192584
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: aload 46
// 1ef: invokevirtual net/minecraft/class_2945$class_7834.comp_1117 ()Ljava/lang/Object;
// 1f2: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 1f5: ldc "1"
// 1f7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1fa: aload 40
// 1fc: ifnull 265
// 1ff: goto 20c
// 202: ldc2_w 2622947102104192584
// 205: lload 2
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: ifne 24b
// 20f: goto 21c
// 212: ldc2_w 2622947102104192584
// 215: lload 2
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: aload 46
// 21e: invokevirtual net/minecraft/class_2945$class_7834.comp_1117 ()Ljava/lang/Object;
// 221: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 224: aload 40
// 226: ifnull 3af
// 229: goto 236
// 22c: ldc2_w 2622947102104192584
// 22f: lload 2
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: ldc "3"
// 238: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 23b: ifeq 37c
// 23e: goto 24b
// 241: ldc2_w 2622947102104192584
// 244: lload 2
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: aload 46
// 24d: invokevirtual net/minecraft/class_2945$class_7834.comp_1117 ()Ljava/lang/Object;
// 250: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 253: ldc "3"
// 255: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 258: goto 265
// 25b: ldc2_w 2622947102104192584
// 25e: lload 2
// 25f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 264: athrow
// 265: istore 48
// 267: aload 41
// 269: checkcast net/minecraft/class_1657
// 26c: iload 48
// 26e: ifeq 281
// 271: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 274: goto 284
// 277: ldc2_w 2622947102104192584
// 27a: lload 2
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 284: invokevirtual net/minecraft/class_1657.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
// 287: dup
// 288: sipush 19633
// 28b: ldc2_w 7204179490391827361
// 28e: lload 2
// 28f: lxor
// 290: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 298: astore 49
// 29a: aload 40
// 29c: ifnull 5de
// 29f: aload 49
// 2a1: ifnull 5dc
// 2a4: goto 2b1
// 2a7: ldc2_w 2622947102104192584
// 2aa: lload 2
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: aload 49
// 2b3: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 2b6: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 2b9: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 2be: aload 40
// 2c0: ifnull 2fa
// 2c3: goto 2d0
// 2c6: ldc2_w 2622947102104192584
// 2c9: lload 2
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: ifne 2fd
// 2d3: goto 2e0
// 2d6: ldc2_w 2622947102104192584
// 2d9: lload 2
// 2da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2df: athrow
// 2e0: aload 49
// 2e2: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 2e5: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 2e8: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 2ed: goto 2fa
// 2f0: ldc2_w 2622947102104192584
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: ifeq 5dc
// 2fd: getstatic su/catlean/q1.m Ljava/util/concurrent/ConcurrentHashMap;
// 300: checkcast java/util/Map
// 303: astore 50
// 305: aload 41
// 307: checkcast net/minecraft/class_1657
// 30a: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 30d: dup
// 30e: sipush 6998
// 311: ldc2_w 4253773240581977201
// 314: lload 2
// 315: lxor
// 316: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 31e: lload 17
// 320: dup2_x1
// 321: pop2
// 322: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 325: astore 51
// 327: new su/catlean/z9
// 32a: dup
// 32b: aload 49
// 32d: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 330: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// 333: dup
// 334: sipush 26348
// 337: ldc2_w 2726371736717789613
// 33a: lload 2
// 33b: lxor
// 33c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 344: lload 17
// 346: dup2_x1
// 347: pop2
// 348: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 34b: aload 49
// 34d: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 350: dup
// 351: sipush 27327
// 354: ldc2_w 1359196749295388146
// 357: lload 2
// 358: lxor
// 359: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 361: invokestatic su/catlean/zf.A ()J
// 364: lload 26
// 366: invokespecial su/catlean/z9.<init> (Ljava/lang/String;Lnet/minecraft/class_1799;JJ)V
// 369: astore 52
// 36b: aload 50
// 36d: aload 51
// 36f: aload 52
// 371: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 376: pop
// 377: aload 40
// 379: ifnonnull 5dc
// 37c: getstatic su/catlean/q1.m Ljava/util/concurrent/ConcurrentHashMap;
// 37f: aload 41
// 381: checkcast net/minecraft/class_1657
// 384: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 387: dup
// 388: sipush 1942
// 38b: ldc2_w 6475958551720650889
// 38e: lload 2
// 38f: lxor
// 390: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 395: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 398: lload 17
// 39a: dup2_x1
// 39b: pop2
// 39c: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 39f: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
// 3a2: goto 3af
// 3a5: ldc2_w 2622947102104192584
// 3a8: lload 2
// 3a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: athrow
// 3af: checkcast su/catlean/z9
// 3b2: dup
// 3b3: ifnonnull 3c2
// 3b6: pop
// 3b7: return
// 3b8: ldc2_w 2622947102104192584
// 3bb: lload 2
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: astore 48
// 3c4: invokestatic su/catlean/zf.A ()J
// 3c7: aload 48
// 3c9: invokevirtual su/catlean/z9.u ()J
// 3cc: lsub
// 3cd: sipush 14359
// 3d0: ldc2_w 4924621011496900832
// 3d3: lload 2
// 3d4: lxor
// 3d5: invokedynamic d (IJ)J bsm=su/catlean/q1.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3da: lcmp
// 3db: iflt 50f
// 3de: iload 28
// 3e0: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 3e3: checkcast su/catlean/_g
// 3e6: sipush 15227
// 3e9: ldc2_w 3783607496906134545
// 3ec: lload 2
// 3ed: lxor
// 3ee: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f3: bipush 2
// 3f4: anewarray 1092
// 3f7: astore 50
// 3f9: aload 50
// 3fb: bipush 0
// 3fc: aload 41
// 3fe: checkcast net/minecraft/class_1657
// 401: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 404: dup
// 405: sipush 1942
// 408: ldc2_w 6475958551720650889
// 40b: lload 2
// 40c: lxor
// 40d: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 412: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 415: lload 17
// 417: dup2_x1
// 418: pop2
// 419: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 41c: aastore
// 41d: aload 50
// 41f: bipush 1
// 420: aload 48
// 422: invokevirtual su/catlean/z9.v ()Ljava/lang/String;
// 425: aastore
// 426: aload 50
// 428: iload 29
// 42a: i2c
// 42b: bipush 0
// 42c: bipush 4
// 42d: aconst_null
// 42e: iload 30
// 430: i2s
// 431: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 434: astore 49
// 436: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 439: lload 31
// 43b: invokespecial su/catlean/q1.l (J)Lsu/catlean/cm;
// 43e: getstatic su/catlean/cm.NOTIFICATION Lsu/catlean/cm;
// 441: aload 40
// 443: ifnull 46e
// 446: if_acmpeq 483
// 449: goto 456
// 44c: ldc2_w 2622947102104192584
// 44f: lload 2
// 450: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 455: athrow
// 456: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 459: lload 31
// 45b: invokespecial su/catlean/q1.l (J)Lsu/catlean/cm;
// 45e: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 461: goto 46e
// 464: ldc2_w 2622947102104192584
// 467: lload 2
// 468: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46d: athrow
// 46e: aload 40
// 470: ifnull 4c2
// 473: if_acmpne 4a5
// 476: goto 483
// 479: ldc2_w 2622947102104192584
// 47c: lload 2
// 47d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 482: athrow
// 483: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 486: ldc ""
// 488: lload 38
// 48a: aload 49
// 48c: bipush 5
// 48d: getstatic su/catlean/ys.INFO Lsu/catlean/ys;
// 490: aload 48
// 492: invokevirtual su/catlean/z9.b ()Lnet/minecraft/class_1799;
// 495: invokevirtual su/catlean/sg.A (Ljava/lang/String;JLjava/lang/String;ILsu/catlean/ys;Lnet/minecraft/class_1799;)V
// 498: goto 4a5
// 49b: ldc2_w 2622947102104192584
// 49e: lload 2
// 49f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: athrow
// 4a5: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 4a8: aload 40
// 4aa: ifnull 505
// 4ad: lload 31
// 4af: invokespecial su/catlean/q1.l (J)Lsu/catlean/cm;
// 4b2: getstatic su/catlean/cm.CHAT Lsu/catlean/cm;
// 4b5: goto 4c2
// 4b8: ldc2_w 2622947102104192584
// 4bb: lload 2
// 4bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c1: athrow
// 4c2: if_acmpeq 4f2
// 4c5: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 4c8: aload 40
// 4ca: ifnull 505
// 4cd: goto 4da
// 4d0: ldc2_w 2622947102104192584
// 4d3: lload 2
// 4d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d9: athrow
// 4da: lload 31
// 4dc: invokespecial su/catlean/q1.l (J)Lsu/catlean/cm;
// 4df: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 4e2: if_acmpne 50f
// 4e5: goto 4f2
// 4e8: ldc2_w 2622947102104192584
// 4eb: lload 2
// 4ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f1: athrow
// 4f2: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 4f5: checkcast su/catlean/_g
// 4f8: goto 505
// 4fb: ldc2_w 2622947102104192584
// 4fe: lload 2
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: aload 49
// 507: bipush 0
// 508: bipush 2
// 509: aconst_null
// 50a: lload 4
// 50c: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 50f: lload 9
// 511: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 514: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 517: dup
// 518: sipush 20058
// 51b: ldc2_w 2250683055519506752
// 51e: lload 2
// 51f: lxor
// 520: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 525: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 528: checkcast java/lang/Iterable
// 52b: astore 50
// 52d: bipush 0
// 52e: istore 51
// 530: aload 50
// 532: astore 52
// 534: new java/util/ArrayList
// 537: dup
// 538: aload 50
// 53a: sipush 16717
// 53d: ldc2_w 2009354858767713630
// 540: lload 2
// 541: lxor
// 542: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 547: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 54a: invokespecial java/util/ArrayList.<init> (I)V
// 54d: checkcast java/util/Collection
// 550: astore 53
// 552: bipush 0
// 553: istore 54
// 555: aload 52
// 557: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 55c: astore 55
// 55e: aload 55
// 560: invokeinterface java/util/Iterator.hasNext ()Z 1
// 565: ifeq 5bc
// 568: aload 55
// 56a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 56f: astore 56
// 571: aload 53
// 573: aload 56
// 575: checkcast net/minecraft/class_742
// 578: astore 57
// 57a: astore 58
// 57c: bipush 0
// 57d: istore 59
// 57f: aload 57
// 581: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 584: dup
// 585: sipush 1942
// 588: ldc2_w 6475958551720650889
// 58b: lload 2
// 58c: lxor
// 58d: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 592: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 595: lload 17
// 597: dup2_x1
// 598: pop2
// 599: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 59c: aload 58
// 59e: swap
// 59f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 5a4: pop
// 5a5: aload 40
// 5a7: ifnull 5de
// 5aa: aload 40
// 5ac: ifnonnull 55e
// 5af: goto 5bc
// 5b2: ldc2_w 2622947102104192584
// 5b5: lload 2
// 5b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bb: athrow
// 5bc: aload 53
// 5be: checkcast java/util/List
// 5c1: nop
// 5c2: astore 49
// 5c4: getstatic su/catlean/q1.m Ljava/util/concurrent/ConcurrentHashMap;
// 5c7: invokevirtual java/util/concurrent/ConcurrentHashMap.entrySet ()Ljava/util/Set;
// 5ca: aload 49
// 5cc: invokedynamic invoke (Ljava/util/List;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/q1.R (Ljava/util/List;Ljava/util/Map$Entry;)Z, (Ljava/util/Map$Entry;)Ljava/lang/Boolean; ]
// 5d1: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/q1.t (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 5d6: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
// 5db: pop
// 5dc: nop
// 5dd: nop
// 5de: aload 40
// 5e0: ifnonnull 19c
// 5e3: nop
// 5e4: aload 1
// 5e5: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 5e8: instanceof net/minecraft/class_2673
// 5eb: aload 40
// 5ed: ifnull 752
// 5f0: ifeq 734
// 5f3: goto 600
// 5f6: ldc2_w 2622947102104192584
// 5f9: lload 2
// 5fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ff: athrow
// 600: aload 1
// 601: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 604: checkcast net/minecraft/class_2673
// 607: invokevirtual net/minecraft/class_2673.method_11532 ()I
// 60a: aload 40
// 60c: ifnull 689
// 60f: goto 61c
// 612: ldc2_w 2622947102104192584
// 615: lload 2
// 616: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61b: athrow
// 61c: sipush 4492
// 61f: ldc2_w 17603406989907338
// 622: lload 2
// 623: lxor
// 624: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 629: if_icmpeq 672
// 62c: goto 639
// 62f: ldc2_w 2622947102104192584
// 632: lload 2
// 633: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 638: athrow
// 639: aload 1
// 63a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 63d: checkcast net/minecraft/class_2673
// 640: invokevirtual net/minecraft/class_2673.method_11532 ()I
// 643: aload 40
// 645: ifnull 752
// 648: goto 655
// 64b: ldc2_w 2622947102104192584
// 64e: lload 2
// 64f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 654: athrow
// 655: sipush 32603
// 658: ldc2_w 6565628878676114266
// 65b: lload 2
// 65c: lxor
// 65d: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 662: if_icmpne 734
// 665: goto 672
// 668: ldc2_w 2622947102104192584
// 66b: lload 2
// 66c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 671: athrow
// 672: aload 1
// 673: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 676: checkcast net/minecraft/class_2673
// 679: invokevirtual net/minecraft/class_2673.method_11534 ()I
// 67c: goto 689
// 67f: ldc2_w 2622947102104192584
// 682: lload 2
// 683: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 688: athrow
// 689: istore 41
// 68b: iload 41
// 68d: sipush 22253
// 690: ldc2_w 3815826911090414312
// 693: lload 2
// 694: lxor
// 695: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69a: ishr
// 69b: sipush 24805
// 69e: ldc2_w 225859067889722571
// 6a1: lload 2
// 6a2: lxor
// 6a3: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a8: iand
// 6a9: i2f
// 6aa: ldc 255.0
// 6ac: fdiv
// 6ad: fstore 42
// 6af: iload 41
// 6b1: sipush 22368
// 6b4: ldc2_w 6016873330302817092
// 6b7: lload 2
// 6b8: lxor
// 6b9: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6be: ishr
// 6bf: sipush 15211
// 6c2: ldc2_w 6960033749553282924
// 6c5: lload 2
// 6c6: lxor
// 6c7: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cc: iand
// 6cd: i2f
// 6ce: ldc 255.0
// 6d0: fdiv
// 6d1: fstore 43
// 6d3: iload 41
// 6d5: bipush 0
// 6d6: ishr
// 6d7: sipush 15211
// 6da: ldc2_w 6960033749553282924
// 6dd: lload 2
// 6de: lxor
// 6df: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e4: iand
// 6e5: i2f
// 6e6: ldc 255.0
// 6e8: fdiv
// 6e9: fstore 44
// 6eb: new java/awt/Color
// 6ee: dup
// 6ef: fload 42
// 6f1: fload 43
// 6f3: fload 44
// 6f5: invokespecial java/awt/Color.<init> (FFF)V
// 6f8: astore 45
// 6fa: aload 45
// 6fc: invokevirtual java/awt/Color.getRGB ()I
// 6ff: aload 40
// 701: ifnull 731
// 704: sipush 7298
// 707: ldc2_w 7512694757102246051
// 70a: lload 2
// 70b: lxor
// 70c: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 711: if_icmpne 72c
// 714: goto 721
// 717: ldc2_w 2622947102104192584
// 71a: lload 2
// 71b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 720: athrow
// 721: return
// 722: ldc2_w 2622947102104192584
// 725: lload 2
// 726: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72b: athrow
// 72c: aload 45
// 72e: invokevirtual java/awt/Color.getRGB ()I
// 731: putstatic su/catlean/q1.d I
// 734: aload 0
// 735: aload 40
// 737: ifnull 8b3
// 73a: iload 23
// 73c: i2c
// 73d: iload 24
// 73f: iload 25
// 741: i2s
// 742: invokespecial su/catlean/q1.D (CIS)Z
// 745: goto 752
// 748: ldc2_w 2622947102104192584
// 74b: lload 2
// 74c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 751: athrow
// 752: ifeq 8b2
// 755: aload 1
// 756: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 759: instanceof net/minecraft/class_7439
// 75c: aload 40
// 75e: ifnull 7a0
// 761: goto 76e
// 764: ldc2_w 2622947102104192584
// 767: lload 2
// 768: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76d: athrow
// 76e: ifeq 8b2
// 771: goto 77e
// 774: ldc2_w 2622947102104192584
// 777: lload 2
// 778: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77d: athrow
// 77e: getstatic su/catlean/q1.b Lsu/catlean/bg;
// 781: sipush 13343
// 784: ldc2_w 6328856537525579821
// 787: lload 2
// 788: lxor
// 789: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78e: lload 13
// 790: invokevirtual su/catlean/bg.c (IJ)Z
// 793: goto 7a0
// 796: ldc2_w 2622947102104192584
// 799: lload 2
// 79a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79f: athrow
// 7a0: ifeq 8b2
// 7a3: aload 1
// 7a4: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 7a7: astore 41
// 7a9: aload 41
// 7ab: checkcast net/minecraft/class_7439
// 7ae: getfield net/minecraft/class_7439.comp_763 Lnet/minecraft/class_2561;
// 7b1: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 7b6: dup
// 7b7: sipush 15392
// 7ba: ldc2_w 7380204354832913209
// 7bd: lload 2
// 7be: lxor
// 7bf: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7c7: checkcast java/lang/CharSequence
// 7ca: lload 19
// 7cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7cf: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 7d2: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 7d5: dup
// 7d6: sipush 18415
// 7d9: ldc2_w 4536829368562329754
// 7dc: lload 2
// 7dd: lxor
// 7de: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7e6: checkcast java/lang/CharSequence
// 7e9: bipush 0
// 7ea: bipush 2
// 7eb: aconst_null
// 7ec: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 7ef: aload 40
// 7f1: ifnull 86d
// 7f4: ifeq 8b2
// 7f7: goto 804
// 7fa: ldc2_w 2622947102104192584
// 7fd: lload 2
// 7fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 803: athrow
// 804: iload 33
// 806: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 809: aload 0
// 80a: invokevirtual su/catlean/q1.k ()Ljava/lang/String;
// 80d: iload 28
// 80f: aload 0
// 810: checkcast su/catlean/_g
// 813: sipush 22278
// 816: ldc2_w 1588321020727310422
// 819: lload 2
// 81a: lxor
// 81b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 820: bipush 0
// 821: anewarray 1092
// 824: iload 29
// 826: i2c
// 827: bipush 0
// 828: bipush 4
// 829: aconst_null
// 82a: iload 30
// 82c: i2s
// 82d: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 830: iload 34
// 832: iload 35
// 834: i2b
// 835: bipush 3
// 836: getstatic su/catlean/ys.WARNING Lsu/catlean/ys;
// 839: aconst_null
// 83a: sipush 11471
// 83d: ldc2_w 7762548562424228091
// 840: lload 2
// 841: lxor
// 842: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 847: aconst_null
// 848: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 84b: getstatic su/catlean/q1.o Lsu/catlean/bg;
// 84e: sipush 7042
// 851: ldc2_w 6320929650243067831
// 854: lload 2
// 855: lxor
// 856: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85b: lload 36
// 85d: invokevirtual su/catlean/bg.q (IJ)Z
// 860: goto 86d
// 863: ldc2_w 2622947102104192584
// 866: lload 2
// 867: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86c: athrow
// 86d: aload 40
// 86f: ifnull 897
// 872: ifeq 8b2
// 875: goto 882
// 878: ldc2_w 2622947102104192584
// 87b: lload 2
// 87c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 881: athrow
// 882: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 885: lload 21
// 887: invokevirtual su/catlean/qm.f (J)Z
// 88a: goto 897
// 88d: ldc2_w 2622947102104192584
// 890: lload 2
// 891: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 896: athrow
// 897: ifeq 8b2
// 89a: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 89d: invokevirtual su/catlean/d2.X ()Lsu/catlean/lp;
// 8a0: lload 15
// 8a2: invokevirtual su/catlean/lp.L (J)V
// 8a5: goto 8b2
// 8a8: ldc2_w 2622947102104192584
// 8ab: lload 2
// 8ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b1: athrow
// 8b2: aload 0
// 8b3: iload 6
// 8b5: iload 7
// 8b7: i2s
// 8b8: iload 8
// 8ba: i2s
// 8bb: invokespecial su/catlean/q1.Y (ISS)Lsu/catlean/cm;
// 8be: getstatic su/catlean/cm.OFF Lsu/catlean/cm;
// 8c1: if_acmpeq c26
// 8c4: aload 1
// 8c5: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 8c8: instanceof net/minecraft/class_2775
// 8cb: ifeq c26
// 8ce: goto 8db
// 8d1: ldc2_w 2622947102104192584
// 8d4: lload 2
// 8d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8da: athrow
// 8db: lload 9
// 8dd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 8e0: aload 1
// 8e1: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 8e4: checkcast net/minecraft/class_2775
// 8e7: invokevirtual net/minecraft/class_2775.method_11915 ()I
// 8ea: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
// 8ed: astore 41
// 8ef: lload 9
// 8f1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 8f4: aload 1
// 8f5: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 8f8: checkcast net/minecraft/class_2775
// 8fb: invokevirtual net/minecraft/class_2775.method_11912 ()I
// 8fe: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
// 901: astore 42
// 903: aload 41
// 905: aload 40
// 907: ifnull 92c
// 90a: instanceof net/minecraft/class_1542
// 90d: ifeq c26
// 910: goto 91d
// 913: ldc2_w 2622947102104192584
// 916: lload 2
// 917: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91c: athrow
// 91d: aload 42
// 91f: goto 92c
// 922: ldc2_w 2622947102104192584
// 925: lload 2
// 926: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92b: athrow
// 92c: aload 40
// 92e: ifnull 943
// 931: ifnull c26
// 934: goto 941
// 937: ldc2_w 2622947102104192584
// 93a: lload 2
// 93b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 940: athrow
// 941: aload 41
// 943: checkcast net/minecraft/class_1542
// 946: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 949: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 94c: dup
// 94d: sipush 7879
// 950: ldc2_w 4062445229582053849
// 953: lload 2
// 954: lxor
// 955: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 95d: astore 43
// 95f: aload 43
// 961: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 964: aload 40
// 966: ifnull 98c
// 969: ifne c26
// 96c: goto 979
// 96f: ldc2_w 2622947102104192584
// 972: lload 2
// 973: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 978: athrow
// 979: aload 0
// 97a: lload 11
// 97c: invokespecial su/catlean/q1.M (J)Z
// 97f: goto 98c
// 982: ldc2_w 2622947102104192584
// 985: lload 2
// 986: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98b: athrow
// 98c: aload 40
// 98e: ifnull a5f
// 991: ifeq a5a
// 994: goto 9a1
// 997: ldc2_w 2622947102104192584
// 99a: lload 2
// 99b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a0: athrow
// 9a1: aload 43
// 9a3: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// 9a6: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 9ab: dup
// 9ac: sipush 27089
// 9af: ldc2_w 2899945598079043317
// 9b2: lload 2
// 9b3: lxor
// 9b4: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9bc: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 9bf: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 9c2: dup
// 9c3: sipush 7755
// 9c6: ldc2_w 6317897057586999615
// 9c9: lload 2
// 9ca: lxor
// 9cb: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9d3: checkcast java/lang/CharSequence
// 9d6: sipush 17015
// 9d9: ldc2_w 8377976075056000267
// 9dc: lload 2
// 9dd: lxor
// 9de: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e3: checkcast java/lang/CharSequence
// 9e6: bipush 0
// 9e7: bipush 2
// 9e8: aconst_null
// 9e9: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 9ec: aload 40
// 9ee: ifnull a5f
// 9f1: goto 9fe
// 9f4: ldc2_w 2622947102104192584
// 9f7: lload 2
// 9f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9fd: athrow
// 9fe: ifne a5a
// a01: goto a0e
// a04: ldc2_w 2622947102104192584
// a07: lload 2
// a08: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0d: athrow
// a0e: aload 43
// a10: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// a13: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// a18: dup
// a19: sipush 27089
// a1c: ldc2_w 2899945598079043317
// a1f: lload 2
// a20: lxor
// a21: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a29: checkcast java/lang/CharSequence
// a2c: ldc "★"
// a2e: checkcast java/lang/CharSequence
// a31: bipush 0
// a32: bipush 2
// a33: aconst_null
// a34: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// a37: aload 40
// a39: ifnull a5f
// a3c: goto a49
// a3f: ldc2_w 2622947102104192584
// a42: lload 2
// a43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a48: athrow
// a49: ifne a5a
// a4c: goto a59
// a4f: ldc2_w 2622947102104192584
// a52: lload 2
// a53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a58: athrow
// a59: return
// a5a: aload 42
// a5c: invokevirtual net/minecraft/class_1297.method_5628 ()I
// a5f: lload 19
// a61: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a64: invokevirtual net/minecraft/class_746.method_5628 ()I
// a67: if_icmpne ac1
// a6a: iload 28
// a6c: aload 0
// a6d: checkcast su/catlean/_g
// a70: sipush 12203
// a73: ldc2_w 8336455568950804696
// a76: lload 2
// a77: lxor
// a78: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7d: bipush 2
// a7e: anewarray 1092
// a81: astore 45
// a83: aload 45
// a85: bipush 0
// a86: aload 43
// a88: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// a8b: dup
// a8c: sipush 16344
// a8f: ldc2_w 4418817110372077779
// a92: lload 2
// a93: lxor
// a94: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a99: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a9c: lload 17
// a9e: dup2_x1
// a9f: pop2
// aa0: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// aa3: aastore
// aa4: aload 45
// aa6: bipush 1
// aa7: aload 43
// aa9: invokevirtual net/minecraft/class_1799.method_7947 ()I
// aac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// aaf: aastore
// ab0: aload 45
// ab2: iload 29
// ab4: i2c
// ab5: bipush 0
// ab6: bipush 4
// ab7: aconst_null
// ab8: iload 30
// aba: i2s
// abb: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// abe: goto b36
// ac1: iload 28
// ac3: aload 0
// ac4: checkcast su/catlean/_g
// ac7: sipush 29606
// aca: ldc2_w 814307320631073999
// acd: lload 2
// ace: lxor
// acf: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad4: bipush 3
// ad5: anewarray 1092
// ad8: astore 45
// ada: aload 45
// adc: bipush 0
// add: aload 42
// adf: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// ae2: dup
// ae3: sipush 1942
// ae6: ldc2_w 6475958551720650889
// ae9: lload 2
// aea: lxor
// aeb: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// af3: lload 17
// af5: dup2_x1
// af6: pop2
// af7: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// afa: aastore
// afb: aload 45
// afd: bipush 1
// afe: aload 43
// b00: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// b03: dup
// b04: sipush 16344
// b07: ldc2_w 4418817110372077779
// b0a: lload 2
// b0b: lxor
// b0c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b11: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// b14: lload 17
// b16: dup2_x1
// b17: pop2
// b18: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// b1b: aastore
// b1c: aload 45
// b1e: bipush 2
// b1f: aload 43
// b21: invokevirtual net/minecraft/class_1799.method_7947 ()I
// b24: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// b27: aastore
// b28: aload 45
// b2a: iload 29
// b2c: i2c
// b2d: bipush 0
// b2e: bipush 4
// b2f: aconst_null
// b30: iload 30
// b32: i2s
// b33: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// b36: astore 44
// b38: aload 0
// b39: iload 6
// b3b: iload 7
// b3d: i2s
// b3e: iload 8
// b40: i2s
// b41: invokespecial su/catlean/q1.Y (ISS)Lsu/catlean/cm;
// b44: getstatic su/catlean/cm.NOTIFICATION Lsu/catlean/cm;
// b47: aload 40
// b49: ifnull b78
// b4c: if_acmpeq b8d
// b4f: goto b5c
// b52: ldc2_w 2622947102104192584
// b55: lload 2
// b56: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5b: athrow
// b5c: aload 0
// b5d: iload 6
// b5f: iload 7
// b61: i2s
// b62: iload 8
// b64: i2s
// b65: invokespecial su/catlean/q1.Y (ISS)Lsu/catlean/cm;
// b68: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// b6b: goto b78
// b6e: ldc2_w 2622947102104192584
// b71: lload 2
// b72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b77: athrow
// b78: aload 40
// b7a: ifnull bcd
// b7d: if_acmpne bac
// b80: goto b8d
// b83: ldc2_w 2622947102104192584
// b86: lload 2
// b87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8c: athrow
// b8d: getstatic su/catlean/sg.H Lsu/catlean/sg;
// b90: ldc ""
// b92: lload 38
// b94: aload 44
// b96: bipush 5
// b97: getstatic su/catlean/ys.INFO Lsu/catlean/ys;
// b9a: aload 43
// b9c: invokevirtual su/catlean/sg.A (Ljava/lang/String;JLjava/lang/String;ILsu/catlean/ys;Lnet/minecraft/class_1799;)V
// b9f: goto bac
// ba2: ldc2_w 2622947102104192584
// ba5: lload 2
// ba6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bab: athrow
// bac: aload 0
// bad: aload 40
// baf: ifnull c12
// bb2: iload 6
// bb4: iload 7
// bb6: i2s
// bb7: iload 8
// bb9: i2s
// bba: invokespecial su/catlean/q1.Y (ISS)Lsu/catlean/cm;
// bbd: getstatic su/catlean/cm.CHAT Lsu/catlean/cm;
// bc0: goto bcd
// bc3: ldc2_w 2622947102104192584
// bc6: lload 2
// bc7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bcc: athrow
// bcd: if_acmpeq c01
// bd0: aload 0
// bd1: aload 40
// bd3: ifnull c12
// bd6: goto be3
// bd9: ldc2_w 2622947102104192584
// bdc: lload 2
// bdd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be2: athrow
// be3: iload 6
// be5: iload 7
// be7: i2s
// be8: iload 8
// bea: i2s
// beb: invokespecial su/catlean/q1.Y (ISS)Lsu/catlean/cm;
// bee: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// bf1: if_acmpne c26
// bf4: goto c01
// bf7: ldc2_w 2622947102104192584
// bfa: lload 2
// bfb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c00: athrow
// c01: aload 0
// c02: checkcast su/catlean/_g
// c05: goto c12
// c08: ldc2_w 2622947102104192584
// c0b: lload 2
// c0c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c11: athrow
// c12: aload 44
// c14: bipush 0
// c15: bipush 2
// c16: aconst_null
// c17: lload 4
// c19: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// c1c: goto c26
// c1f: astore 41
// c21: aload 41
// c23: invokevirtual java/lang/Exception.printStackTrace ()V
// c26: return
}

@Flow
private final void B(EntitySpawn param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: ldc2_w 79508422081881
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 23938895571507
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 97406085167439
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 72946233117535
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 92979472862524
// 056: lxor
// 057: lstore 12
// 059: dup2
// 05a: ldc2_w 55487187957423
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 56224466376540
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 88046114996738
// 06b: lxor
// 06c: lstore 18
// 06e: pop2
// 06f: ldc2_w 4959743510487046044
// 072: lload 2
// 073: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: astore 20
// 07a: aload 0
// 07b: iload 9
// 07d: iload 10
// 07f: i2c
// 080: iload 11
// 082: i2s
// 083: invokespecial su/catlean/q1.T (ICS)Z
// 086: aload 20
// 088: ifnull 0af
// 08b: ifeq 1c5
// 08e: goto 09b
// 091: ldc2_w 5001110245344012105
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: aload 1
// 09c: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 09f: instanceof net/minecraft/class_1657
// 0a2: goto 0af
// 0a5: ldc2_w 5001110245344012105
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: aload 20
// 0b1: ifnull 0dd
// 0b4: ifeq 1c5
// 0b7: goto 0c4
// 0ba: ldc2_w 5001110245344012105
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: aload 1
// 0c5: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 0c8: lload 16
// 0ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d0: goto 0dd
// 0d3: ldc2_w 5001110245344012105
// 0d6: lload 2
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: ifne 1c5
// 0e0: aload 0
// 0e1: checkcast su/catlean/_g
// 0e4: iload 6
// 0e6: aload 0
// 0e7: checkcast su/catlean/_g
// 0ea: sipush 12350
// 0ed: ldc2_w 8838497478537920108
// 0f0: lload 2
// 0f1: lxor
// 0f2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: bipush 1
// 0f8: anewarray 1092
// 0fb: astore 21
// 0fd: aload 21
// 0ff: bipush 0
// 100: aload 1
// 101: invokevirtual su/catlean/api/event/events/world/EntitySpawn.getEntity ()Lnet/minecraft/class_1297;
// 104: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 107: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 10c: dup
// 10d: sipush 27089
// 110: ldc2_w 2899959802127050740
// 113: lload 2
// 114: lxor
// 115: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11d: aastore
// 11e: aload 21
// 120: iload 7
// 122: i2c
// 123: bipush 0
// 124: bipush 4
// 125: aconst_null
// 126: iload 8
// 128: i2s
// 129: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 12c: bipush 0
// 12d: bipush 2
// 12e: aconst_null
// 12f: lload 4
// 131: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 134: getstatic su/catlean/q1.P Lsu/catlean/bg;
// 137: sipush 29045
// 13a: ldc2_w 7696020161052202057
// 13d: lload 2
// 13e: lxor
// 13f: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: lload 12
// 146: invokevirtual su/catlean/bg.q (IJ)Z
// 149: aload 20
// 14b: ifnull 173
// 14e: ifeq 1c5
// 151: goto 15e
// 154: ldc2_w 5001110245344012105
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: lload 16
// 160: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 163: getfield net/minecraft/class_746.field_6012 I
// 166: goto 173
// 169: ldc2_w 5001110245344012105
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 20
// 175: ifnull 1aa
// 178: sipush 5533
// 17b: ldc2_w 3690911378843480237
// 17e: lload 2
// 17f: lxor
// 180: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: if_icmple 1c5
// 188: goto 195
// 18b: ldc2_w 5001110245344012105
// 18e: lload 2
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 198: lload 18
// 19a: invokevirtual su/catlean/qm.f (J)Z
// 19d: goto 1aa
// 1a0: ldc2_w 5001110245344012105
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: ifeq 1c5
// 1ad: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 1b0: invokevirtual su/catlean/d2.g ()Lsu/catlean/lp;
// 1b3: lload 14
// 1b5: invokevirtual su/catlean/lp.L (J)V
// 1b8: goto 1c5
// 1bb: ldc2_w 5001110245344012105
// 1be: lload 2
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: return
}

@Flow
private final void C(EntityRemove param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: ldc2_w 71526105506625
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 66694016768595
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 31366985069611
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 30763981272221
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 29683045275555
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 62085063571427
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 65101394471095
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 51058404134613
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 64185065392452
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 98205806484506
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 89977824716631
// 066: lxor
// 067: dup2
// 068: bipush 32
// 06a: lushr
// 06b: l2i
// 06c: istore 23
// 06e: dup2
// 06f: bipush 32
// 071: lshl
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 24
// 078: dup2
// 079: bipush 48
// 07b: lshl
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 25
// 082: pop2
// 083: dup2
// 084: ldc2_w 64704338577035
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 103160805774116
// 08e: lxor
// 08f: lstore 28
// 091: dup2
// 092: ldc2_w 17792681199988
// 095: lxor
// 096: lstore 30
// 098: dup2
// 099: ldc2_w 39722205659416
// 09c: lxor
// 09d: lstore 32
// 09f: dup2
// 0a0: ldc2_w 82561606625162
// 0a3: lxor
// 0a4: lstore 34
// 0a6: dup2
// 0a7: ldc2_w 117680413470695
// 0aa: lxor
// 0ab: lstore 36
// 0ad: pop2
// 0ae: ldc2_w 1931064795952073092
// 0b1: lload 2
// 0b2: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: astore 40
// 0b9: aload 0
// 0ba: aload 40
// 0bc: ifnull 7fd
// 0bf: lload 4
// 0c1: invokespecial su/catlean/q1.g (J)Lsu/catlean/cm;
// 0c4: getstatic su/catlean/cm.OFF Lsu/catlean/cm;
// 0c7: if_acmpeq 7fc
// 0ca: goto 0d7
// 0cd: ldc2_w 1981454127746955601
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: aload 1
// 0d8: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 0db: aload 40
// 0dd: ifnull 10e
// 0e0: goto 0ed
// 0e3: ldc2_w 1981454127746955601
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: ifnull 7fc
// 0f0: goto 0fd
// 0f3: ldc2_w 1981454127746955601
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: aload 1
// 0fe: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 101: goto 10e
// 104: ldc2_w 1981454127746955601
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: instanceof net/minecraft/class_10691
// 111: aload 40
// 113: ifnull 802
// 116: ifeq 7fc
// 119: goto 126
// 11c: ldc2_w 1981454127746955601
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 1
// 127: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 12a: dup
// 12b: sipush 32056
// 12e: ldc2_w 2712521239972228477
// 131: lload 2
// 132: lxor
// 133: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 13b: checkcast net/minecraft/class_10691
// 13e: astore 41
// 140: lload 13
// 142: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 145: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 148: dup
// 149: sipush 19986
// 14c: ldc2_w 7559900758843203111
// 14f: lload 2
// 150: lxor
// 151: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 159: checkcast java/lang/Iterable
// 15c: astore 42
// 15e: bipush 0
// 15f: istore 43
// 161: aload 42
// 163: astore 44
// 165: new java/util/ArrayList
// 168: dup
// 169: invokespecial java/util/ArrayList.<init> ()V
// 16c: checkcast java/util/Collection
// 16f: astore 45
// 171: bipush 0
// 172: istore 46
// 174: aload 44
// 176: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 17b: astore 47
// 17d: aload 47
// 17f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 184: ifeq 20c
// 187: aload 47
// 189: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 18e: astore 48
// 190: aload 48
// 192: checkcast net/minecraft/class_742
// 195: astore 49
// 197: bipush 0
// 198: istore 50
// 19a: aload 49
// 19c: lload 19
// 19e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1a4: aload 40
// 1a6: ifnull 219
// 1a9: aload 40
// 1ab: ifnull 1f6
// 1ae: goto 1bb
// 1b1: ldc2_w 1981454127746955601
// 1b4: lload 2
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: ifeq 1f5
// 1be: goto 1cb
// 1c1: ldc2_w 1981454127746955601
// 1c4: lload 2
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 1ce: lload 11
// 1d0: invokespecial su/catlean/q1.W (J)Z
// 1d3: aload 40
// 1d5: ifnull 1f6
// 1d8: goto 1e5
// 1db: ldc2_w 1981454127746955601
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: ifeq 1f9
// 1e8: goto 1f5
// 1eb: ldc2_w 1981454127746955601
// 1ee: lload 2
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: bipush 1
// 1f6: goto 1fa
// 1f9: bipush 0
// 1fa: ifeq 17d
// 1fd: aload 45
// 1ff: aload 48
// 201: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 206: pop
// 207: aload 40
// 209: ifnonnull 17d
// 20c: aload 45
// 20e: checkcast java/util/List
// 211: nop
// 212: checkcast java/lang/Iterable
// 215: astore 42
// 217: nop
// 218: bipush 0
// 219: istore 43
// 21b: aload 42
// 21d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 222: astore 44
// 224: aload 44
// 226: invokeinterface java/util/Iterator.hasNext ()Z 1
// 22b: ifeq 7fb
// 22e: aload 44
// 230: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 235: astore 45
// 237: aload 45
// 239: checkcast net/minecraft/class_742
// 23c: astore 46
// 23e: bipush 0
// 23f: istore 47
// 241: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 244: lload 36
// 246: invokespecial su/catlean/q1.q (J)Z
// 249: aload 40
// 24b: ifnull 802
// 24e: ifeq 275
// 251: goto 25e
// 254: ldc2_w 1981454127746955601
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: aload 41
// 260: aload 46
// 262: checkcast net/minecraft/class_1297
// 265: invokevirtual net/minecraft/class_10691.method_5858 (Lnet/minecraft/class_1297;)D
// 268: goto 28e
// 26b: ldc2_w 1981454127746955601
// 26e: lload 2
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: aload 41
// 277: invokevirtual net/minecraft/class_10691.method_5829 ()Lnet/minecraft/class_238;
// 27a: aload 46
// 27c: invokevirtual net/minecraft/class_742.method_5829 ()Lnet/minecraft/class_238;
// 27f: aload 41
// 281: checkcast net/minecraft/class_1297
// 284: invokestatic net/minecraft/class_1675.method_71624 (Lnet/minecraft/class_1297;)F
// 287: f2d
// 288: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
// 28b: invokevirtual net/minecraft/class_238.method_71490 (Lnet/minecraft/class_238;)D
// 28e: dstore 48
// 290: aload 40
// 292: ifnull 7f6
// 295: dload 48
// 297: ldc2_w 16.0
// 29a: dcmpg
// 29b: ifge 7f4
// 29e: goto 2ab
// 2a1: ldc2_w 1981454127746955601
// 2a4: lload 2
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 2ae: lload 30
// 2b0: invokespecial su/catlean/q1.r (J)Z
// 2b3: aload 40
// 2b5: ifnull 344
// 2b8: goto 2c5
// 2bb: ldc2_w 1981454127746955601
// 2be: lload 2
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: ifeq 35f
// 2c8: goto 2d5
// 2cb: ldc2_w 1981454127746955601
// 2ce: lload 2
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: aload 41
// 2d7: invokevirtual net/minecraft/class_10691.method_7495 ()Lnet/minecraft/class_1799;
// 2da: aload 40
// 2dc: ifnull 364
// 2df: goto 2ec
// 2e2: ldc2_w 1981454127746955601
// 2e5: lload 2
// 2e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2eb: athrow
// 2ec: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// 2ef: dup
// 2f0: sipush 16344
// 2f3: ldc2_w 4418828131771379658
// 2f6: lload 2
// 2f7: lxor
// 2f8: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 300: lload 17
// 302: dup2_x1
// 303: pop2
// 304: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 307: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 30a: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 30d: dup
// 30e: sipush 3229
// 311: ldc2_w 1915091607737883902
// 314: lload 2
// 315: lxor
// 316: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 31e: checkcast java/lang/CharSequence
// 321: sipush 13964
// 324: ldc2_w 4035128252800067320
// 327: lload 2
// 328: lxor
// 329: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: checkcast java/lang/CharSequence
// 331: bipush 0
// 332: bipush 2
// 333: aconst_null
// 334: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 337: goto 344
// 33a: ldc2_w 1981454127746955601
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: ifeq 35f
// 347: getstatic su/catlean/wi.t Lsu/catlean/wi;
// 34a: getstatic su/catlean/q1.d I
// 34d: lload 26
// 34f: invokevirtual su/catlean/wi.H (IJ)Lnet/minecraft/class_1799;
// 352: goto 375
// 355: ldc2_w 1981454127746955601
// 358: lload 2
// 359: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: athrow
// 35f: aload 41
// 361: invokevirtual net/minecraft/class_10691.method_7495 ()Lnet/minecraft/class_1799;
// 364: dup
// 365: sipush 20569
// 368: ldc2_w 804959072632438832
// 36b: lload 2
// 36c: lxor
// 36d: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 375: astore 50
// 377: sipush 22362
// 37a: dconst_1
// 37b: dload 48
// 37d: invokestatic java/lang/Math.sqrt (D)D
// 380: ldc2_w 4.0
// 383: ddiv
// 384: dsub
// 385: dstore 51
// 387: ldc2_w 8373045852277255252
// 38a: lload 2
// 38b: lxor
// 38c: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 391: i2d
// 392: dload 51
// 394: dmul
// 395: d2i
// 396: istore 53
// 398: iload 53
// 39a: sipush 20874
// 39d: ldc2_w 7072475597702736539
// 3a0: lload 2
// 3a1: lxor
// 3a2: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a7: aload 40
// 3a9: ifnull 3db
// 3ac: if_icmple 3cc
// 3af: goto 3bc
// 3b2: ldc2_w 1981454127746955601
// 3b5: lload 2
// 3b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bb: athrow
// 3bc: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 3bf: goto 3f1
// 3c2: ldc2_w 1981454127746955601
// 3c5: lload 2
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: iload 53
// 3ce: sipush 991
// 3d1: ldc2_w 3844449364382021830
// 3d4: lload 2
// 3d5: lxor
// 3d6: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: if_icmple 3ee
// 3de: getstatic net/minecraft/class_124.field_1054 Lnet/minecraft/class_124;
// 3e1: goto 3f1
// 3e4: ldc2_w 1981454127746955601
// 3e7: lload 2
// 3e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: athrow
// 3ee: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 3f1: invokevirtual net/minecraft/class_124.toString ()Ljava/lang/String;
// 3f4: dup
// 3f5: sipush 28609
// 3f8: ldc2_w 8969216166809649116
// 3fb: lload 2
// 3fc: lxor
// 3fd: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 405: astore 54
// 407: iload 23
// 409: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 40c: checkcast su/catlean/_g
// 40f: sipush 23684
// 412: ldc2_w 7854319933822373109
// 415: lload 2
// 416: lxor
// 417: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41c: bipush 4
// 41d: anewarray 1092
// 420: astore 55
// 422: aload 55
// 424: bipush 0
// 425: aload 46
// 427: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 42a: dup
// 42b: sipush 1942
// 42e: ldc2_w 6475938238110324624
// 431: lload 2
// 432: lxor
// 433: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 438: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 43b: lload 17
// 43d: dup2_x1
// 43e: pop2
// 43f: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 442: aastore
// 443: aload 55
// 445: bipush 1
// 446: aload 50
// 448: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
// 44b: dup
// 44c: sipush 16344
// 44f: ldc2_w 4418828131771379658
// 452: lload 2
// 453: lxor
// 454: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 459: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 45c: lload 17
// 45e: dup2_x1
// 45f: pop2
// 460: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 463: aastore
// 464: aload 55
// 466: bipush 2
// 467: aload 54
// 469: aastore
// 46a: aload 55
// 46c: bipush 3
// 46d: iload 53
// 46f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 472: aastore
// 473: aload 55
// 475: iload 24
// 477: i2c
// 478: bipush 0
// 479: bipush 4
// 47a: aconst_null
// 47b: iload 25
// 47d: i2s
// 47e: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 481: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001%" ]
// 486: astore 56
// 488: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 48b: lload 4
// 48d: invokespecial su/catlean/q1.g (J)Lsu/catlean/cm;
// 490: getstatic su/catlean/cm.NOTIFICATION Lsu/catlean/cm;
// 493: aload 40
// 495: ifnull 4c0
// 498: if_acmpeq 4d5
// 49b: goto 4a8
// 49e: ldc2_w 1981454127746955601
// 4a1: lload 2
// 4a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a7: athrow
// 4a8: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 4ab: lload 4
// 4ad: invokespecial su/catlean/q1.g (J)Lsu/catlean/cm;
// 4b0: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 4b3: goto 4c0
// 4b6: ldc2_w 1981454127746955601
// 4b9: lload 2
// 4ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bf: athrow
// 4c0: aload 40
// 4c2: ifnull 511
// 4c5: if_acmpne 4f4
// 4c8: goto 4d5
// 4cb: ldc2_w 1981454127746955601
// 4ce: lload 2
// 4cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d4: athrow
// 4d5: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 4d8: ldc ""
// 4da: lload 34
// 4dc: aload 56
// 4de: bipush 5
// 4df: getstatic su/catlean/ys.WARNING Lsu/catlean/ys;
// 4e2: aload 50
// 4e4: invokevirtual su/catlean/sg.A (Ljava/lang/String;JLjava/lang/String;ILsu/catlean/ys;Lnet/minecraft/class_1799;)V
// 4e7: goto 4f4
// 4ea: ldc2_w 1981454127746955601
// 4ed: lload 2
// 4ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f3: athrow
// 4f4: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 4f7: lload 4
// 4f9: invokespecial su/catlean/q1.g (J)Lsu/catlean/cm;
// 4fc: aload 40
// 4fe: ifnull 578
// 501: getstatic su/catlean/cm.CHAT Lsu/catlean/cm;
// 504: goto 511
// 507: ldc2_w 1981454127746955601
// 50a: lload 2
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: if_acmpeq 541
// 514: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 517: lload 4
// 519: invokespecial su/catlean/q1.g (J)Lsu/catlean/cm;
// 51c: aload 40
// 51e: ifnull 578
// 521: goto 52e
// 524: ldc2_w 1981454127746955601
// 527: lload 2
// 528: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52d: athrow
// 52e: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 531: if_acmpne 7f4
// 534: goto 541
// 537: ldc2_w 1981454127746955601
// 53a: lload 2
// 53b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 540: athrow
// 541: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 544: checkcast su/catlean/_g
// 547: aload 56
// 549: bipush 0
// 54a: bipush 2
// 54b: aconst_null
// 54c: lload 6
// 54e: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 551: aload 40
// 553: ifnull 58d
// 556: goto 563
// 559: ldc2_w 1981454127746955601
// 55c: lload 2
// 55d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 562: athrow
// 563: aload 50
// 565: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 568: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 56b: goto 578
// 56e: ldc2_w 1981454127746955601
// 571: lload 2
// 572: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: athrow
// 578: checkcast net/minecraft/class_1844
// 57b: dup
// 57c: ifnonnull 58e
// 57f: pop
// 580: goto 58d
// 583: ldc2_w 1981454127746955601
// 586: lload 2
// 587: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58c: athrow
// 58d: return
// 58e: astore 55
// 590: aload 55
// 592: invokevirtual net/minecraft/class_1844.method_57397 ()Ljava/lang/Iterable;
// 595: dup
// 596: sipush 2684
// 599: ldc2_w 4721115811201407564
// 59c: lload 2
// 59d: lxor
// 59e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5a6: astore 57
// 5a8: aload 57
// 5aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5af: astore 58
// 5b1: aload 58
// 5b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5b8: ifeq 7f4
// 5bb: aload 58
// 5bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5c2: dup
// 5c3: sipush 32031
// 5c6: ldc2_w 6922747685708967234
// 5c9: lload 2
// 5ca: lxor
// 5cb: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5d3: checkcast net/minecraft/class_1293
// 5d6: astore 59
// 5d8: aload 59
// 5da: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 5dd: bipush 1
// 5de: iadd
// 5df: aload 40
// 5e1: ifnull 22b
// 5e4: aload 40
// 5e6: ifnull 6ba
// 5e9: tableswitch 202 1 10 65 80 96 112 128 133 149 165 181 197
// 620: ldc2_w 1981454127746955601
// 623: lload 2
// 624: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 629: athrow
// 62a: ldc "I"
// 62c: goto 6bd
// 62f: ldc2_w 1981454127746955601
// 632: lload 2
// 633: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 638: athrow
// 639: sipush 10492
// 63c: ldc2_w 1732191877323946232
// 63f: lload 2
// 640: lxor
// 641: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 646: goto 6bd
// 649: sipush 8765
// 64c: ldc2_w 4390971294064734823
// 64f: lload 2
// 650: lxor
// 651: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 656: goto 6bd
// 659: sipush 11222
// 65c: ldc2_w 4300793467253521297
// 65f: lload 2
// 660: lxor
// 661: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 666: goto 6bd
// 669: ldc "V"
// 66b: goto 6bd
// 66e: sipush 20151
// 671: ldc2_w 1106820548276330229
// 674: lload 2
// 675: lxor
// 676: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67b: goto 6bd
// 67e: sipush 31518
// 681: ldc2_w 4454178344372415345
// 684: lload 2
// 685: lxor
// 686: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68b: goto 6bd
// 68e: sipush 19925
// 691: ldc2_w 2442278155785903597
// 694: lload 2
// 695: lxor
// 696: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69b: goto 6bd
// 69e: sipush 16597
// 6a1: ldc2_w 8919652066016202982
// 6a4: lload 2
// 6a5: lxor
// 6a6: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ab: goto 6bd
// 6ae: ldc "X"
// 6b0: goto 6bd
// 6b3: aload 59
// 6b5: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 6b8: bipush 1
// 6b9: iadd
// 6ba: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 6bd: astore 60
// 6bf: aload 59
// 6c1: invokevirtual net/minecraft/class_1293.method_5584 ()I
// 6c4: i2d
// 6c5: dload 51
// 6c7: dmul
// 6c8: d2i
// 6c9: istore 61
// 6cb: aload 59
// 6cd: invokevirtual net/minecraft/class_1293.method_48559 ()Z
// 6d0: aload 40
// 6d2: ifnull 713
// 6d5: ifeq 6ff
// 6d8: goto 6e5
// 6db: ldc2_w 1981454127746955601
// 6de: lload 2
// 6df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e4: athrow
// 6e5: sipush 17992
// 6e8: ldc2_w 6968526423556626023
// 6eb: lload 2
// 6ec: lxor
// 6ed: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f2: goto 774
// 6f5: ldc2_w 1981454127746955601
// 6f8: lload 2
// 6f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fe: athrow
// 6ff: iload 61
// 701: sipush 32096
// 704: ldc2_w 3895416602227476039
// 707: lload 2
// 708: lxor
// 709: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70e: idiv
// 70f: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 712: pop
// 713: sipush 23234
// 716: ldc2_w 3069678010717670097
// 719: lload 2
// 71a: lxor
// 71b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 720: astore 62
// 722: bipush 1
// 723: anewarray 1092
// 726: astore 63
// 728: aload 63
// 72a: bipush 0
// 72b: iload 61
// 72d: sipush 2706
// 730: ldc2_w 9029980795807822233
// 733: lload 2
// 734: lxor
// 735: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73a: irem
// 73b: sipush 22067
// 73e: ldc2_w 4066592016429264146
// 741: lload 2
// 742: lxor
// 743: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 748: idiv
// 749: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 74c: aastore
// 74d: aload 63
// 74f: astore 63
// 751: aload 62
// 753: aload 63
// 755: aload 63
// 757: arraylength
// 758: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// 75b: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 75e: dup
// 75f: sipush 15898
// 762: ldc2_w 3832984404638920214
// 765: lload 2
// 766: lxor
// 767: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 76f: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
// 774: astore 64
// 776: lload 19
// 778: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 77b: aload 59
// 77d: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 780: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 785: checkcast net/minecraft/class_1291
// 788: invokevirtual net/minecraft/class_1291.method_18792 ()Lnet/minecraft/class_4081;
// 78b: getstatic net/minecraft/class_4081.field_18272 Lnet/minecraft/class_4081;
// 78e: if_acmpne 7a1
// 791: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 794: goto 7a3
// 797: ldc2_w 1981454127746955601
// 79a: lload 2
// 79b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a0: athrow
// 7a1: ldc ""
// 7a3: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 7a6: aload 59
// 7a8: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 7ab: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 7b0: checkcast net/minecraft/class_1291
// 7b3: invokevirtual net/minecraft/class_1291.method_5567 ()Ljava/lang/String;
// 7b6: dup
// 7b7: sipush 5391
// 7ba: ldc2_w 1609874537061074177
// 7bd: lload 2
// 7be: lxor
// 7bf: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7c7: bipush 0
// 7c8: anewarray 1092
// 7cb: astore 38
// 7cd: astore 39
// 7cf: iload 8
// 7d1: aload 39
// 7d3: iload 9
// 7d5: aload 38
// 7d7: iload 10
// 7d9: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 7dc: aload 60
// 7de: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 7e1: aload 64
// 7e3: invokedynamic makeConcatWithConstants (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "•\u0001 \u0001 \u0001 \u0001\u0001" ]
// 7e8: invokestatic net/minecraft/class_2561.method_30163 (Ljava/lang/String;)Lnet/minecraft/class_2561;
// 7eb: bipush 0
// 7ec: invokevirtual net/minecraft/class_746.method_7353 (Lnet/minecraft/class_2561;Z)V
// 7ef: aload 40
// 7f1: ifnonnull 5b1
// 7f4: nop
// 7f5: nop
// 7f6: aload 40
// 7f8: ifnonnull 224
// 7fb: nop
// 7fc: aload 0
// 7fd: lload 32
// 7ff: invokespecial su/catlean/q1.h (J)Z
// 802: ifeq 959
// 805: aload 1
// 806: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 809: aload 40
// 80b: ifnull 83c
// 80e: goto 81b
// 811: ldc2_w 1981454127746955601
// 814: lload 2
// 815: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81a: athrow
// 81b: ifnull 959
// 81e: goto 82b
// 821: ldc2_w 1981454127746955601
// 824: lload 2
// 825: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82a: athrow
// 82b: aload 1
// 82c: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 82f: goto 83c
// 832: ldc2_w 1981454127746955601
// 835: lload 2
// 836: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83b: athrow
// 83c: instanceof net/minecraft/class_1657
// 83f: aload 40
// 841: ifnull 86d
// 844: ifeq 959
// 847: goto 854
// 84a: ldc2_w 1981454127746955601
// 84d: lload 2
// 84e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 853: athrow
// 854: aload 1
// 855: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 858: lload 19
// 85a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 85d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 860: goto 86d
// 863: ldc2_w 1981454127746955601
// 866: lload 2
// 867: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86c: athrow
// 86d: ifne 959
// 870: aload 0
// 871: checkcast su/catlean/_g
// 874: iload 23
// 876: aload 0
// 877: checkcast su/catlean/_g
// 87a: sipush 31032
// 87d: ldc2_w 4709518922135939416
// 880: lload 2
// 881: lxor
// 882: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 887: bipush 1
// 888: anewarray 1092
// 88b: astore 41
// 88d: aload 41
// 88f: bipush 0
// 890: aload 1
// 891: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 894: dup
// 895: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 898: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 89b: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 8a0: dup
// 8a1: sipush 27089
// 8a4: ldc2_w 2899952373968189932
// 8a7: lload 2
// 8a8: lxor
// 8a9: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8b1: aastore
// 8b2: aload 41
// 8b4: iload 24
// 8b6: i2c
// 8b7: bipush 0
// 8b8: bipush 4
// 8b9: aconst_null
// 8ba: iload 25
// 8bc: i2s
// 8bd: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 8c0: bipush 0
// 8c1: bipush 2
// 8c2: aconst_null
// 8c3: lload 6
// 8c5: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 8c8: getstatic su/catlean/q1.P Lsu/catlean/bg;
// 8cb: sipush 2448
// 8ce: ldc2_w 6817661167711580810
// 8d1: lload 2
// 8d2: lxor
// 8d3: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d8: lload 28
// 8da: invokevirtual su/catlean/bg.q (IJ)Z
// 8dd: aload 40
// 8df: ifnull 907
// 8e2: ifeq 959
// 8e5: goto 8f2
// 8e8: ldc2_w 1981454127746955601
// 8eb: lload 2
// 8ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f1: athrow
// 8f2: lload 19
// 8f4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8f7: getfield net/minecraft/class_746.field_6012 I
// 8fa: goto 907
// 8fd: ldc2_w 1981454127746955601
// 900: lload 2
// 901: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 906: athrow
// 907: aload 40
// 909: ifnull 93e
// 90c: sipush 5533
// 90f: ldc2_w 3690921010388070069
// 912: lload 2
// 913: lxor
// 914: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 919: if_icmple 959
// 91c: goto 929
// 91f: ldc2_w 1981454127746955601
// 922: lload 2
// 923: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 928: athrow
// 929: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 92c: lload 21
// 92e: invokevirtual su/catlean/qm.f (J)Z
// 931: goto 93e
// 934: ldc2_w 1981454127746955601
// 937: lload 2
// 938: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93d: athrow
// 93e: ifeq 959
// 941: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 944: invokevirtual su/catlean/d2.p ()Lsu/catlean/lp;
// 947: lload 15
// 949: invokevirtual su/catlean/lp.L (J)V
// 94c: goto 959
// 94f: ldc2_w 1981454127746955601
// 952: lload 2
// 953: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 958: athrow
// 959: return
}

@Flow
private final void l(PlayerEntityDeathEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q1.c J
// 03: ldc2_w 122302178973234
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 55740017541464
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 140614305124900
// 14: lxor
// 15: dup2
// 16: bipush 32
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 32
// 1f: lshl
// 20: bipush 48
// 22: lushr
// 23: l2i
// 24: istore 7
// 26: dup2
// 27: bipush 48
// 29: lshl
// 2a: bipush 48
// 2c: lushr
// 2d: l2i
// 2e: istore 8
// 30: pop2
// 31: dup2
// 32: ldc2_w 113907318258363
// 35: lxor
// 36: lstore 9
// 38: pop2
// 39: ldc2_w -5782715355720909577
// 3c: lload 2
// 3d: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: astore 11
// 44: aload 0
// 45: aload 11
// 47: ifnull 70
// 4a: lload 9
// 4c: invokespecial su/catlean/q1.e (J)Z
// 4f: ifeq bf
// 52: goto 5f
// 55: ldc2_w -5905164480376730590
// 58: lload 2
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: aload 0
// 60: checkcast su/catlean/_g
// 63: goto 70
// 66: ldc2_w -5905164480376730590
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: aload 1
// 71: invokevirtual su/catlean/api/event/events/network/PlayerEntityDeathEvent.getPlayer ()Lnet/minecraft/class_1657;
// 74: dup
// 75: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 78: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 7b: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 80: iload 6
// 82: aload 0
// 83: checkcast su/catlean/_g
// 86: sipush 24853
// 89: ldc2_w 1921819666673108033
// 8c: lload 2
// 8d: lxor
// 8e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: bipush 1
// 94: anewarray 1092
// 97: astore 12
// 99: aload 12
// 9b: bipush 0
// 9c: aload 1
// 9d: invokevirtual su/catlean/api/event/events/network/PlayerEntityDeathEvent.getTotemsPopped ()I
// a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// a3: aastore
// a4: aload 12
// a6: iload 7
// a8: i2c
// a9: bipush 0
// aa: bipush 4
// ab: aconst_null
// ac: iload 8
// ae: i2s
// af: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// b2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001" ]
// b7: bipush 0
// b8: bipush 2
// b9: aconst_null
// ba: lload 4
// bc: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// bf: return
}

@Flow
private final void W(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: ldc2_w 73548654164173
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 27680272030958
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 34558036373415
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 132911499443425
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 57100106340153
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 44919803532453
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 26473462705937
// 030: lxor
// 031: dup2
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 32
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 15
// 042: dup2
// 043: bipush 48
// 045: lshl
// 046: bipush 48
// 048: lushr
// 049: l2i
// 04a: istore 16
// 04c: pop2
// 04d: dup2
// 04e: ldc2_w 62519691850555
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 30482268018671
// 058: lxor
// 059: dup2
// 05a: bipush 16
// 05c: lushr
// 05d: lstore 19
// 05f: dup2
// 060: bipush 48
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 21
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 57620874108337
// 06e: lxor
// 06f: dup2
// 070: bipush 32
// 072: lushr
// 073: l2i
// 074: istore 22
// 076: dup2
// 077: bipush 32
// 079: lshl
// 07a: bipush 32
// 07c: lushr
// 07d: l2i
// 07e: istore 23
// 080: pop2
// 081: dup2
// 082: ldc2_w 63262074737352
// 085: lxor
// 086: lstore 24
// 088: dup2
// 089: ldc2_w 90419819740379
// 08c: lxor
// 08d: dup2
// 08e: bipush 32
// 090: lushr
// 091: l2i
// 092: istore 26
// 094: dup2
// 095: bipush 32
// 097: lshl
// 098: bipush 48
// 09a: lushr
// 09b: l2i
// 09c: istore 27
// 09e: dup2
// 09f: bipush 48
// 0a1: lshl
// 0a2: bipush 48
// 0a4: lushr
// 0a5: l2i
// 0a6: istore 28
// 0a8: pop2
// 0a9: dup2
// 0aa: ldc2_w 55881725411173
// 0ad: lxor
// 0ae: dup2
// 0af: bipush 32
// 0b1: lushr
// 0b2: l2i
// 0b3: istore 29
// 0b5: dup2
// 0b6: bipush 32
// 0b8: lshl
// 0b9: bipush 40
// 0bb: lushr
// 0bc: l2i
// 0bd: istore 30
// 0bf: dup2
// 0c0: bipush 56
// 0c2: lshl
// 0c3: bipush 56
// 0c5: lushr
// 0c6: l2i
// 0c7: istore 31
// 0c9: pop2
// 0ca: dup2
// 0cb: ldc2_w 103611360413864
// 0ce: lxor
// 0cf: lstore 32
// 0d1: dup2
// 0d2: ldc2_w 123486854512165
// 0d5: lxor
// 0d6: lstore 34
// 0d8: pop2
// 0d9: ldc2_w -4521465752980057592
// 0dc: lload 2
// 0dd: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: astore 41
// 0e4: aload 0
// 0e5: aload 41
// 0e7: ifnull 3fe
// 0ea: lload 10
// 0ec: invokespecial su/catlean/q1.F (J)Z
// 0ef: ifeq 3fd
// 0f2: goto 0ff
// 0f5: ldc2_w -4543135939657112867
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 102: lload 12
// 104: invokevirtual su/catlean/nf.O (J)Ljava/util/List;
// 107: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 10c: astore 42
// 10e: aload 42
// 110: invokeinterface java/util/Iterator.hasNext ()Z 1
// 115: ifeq 3fd
// 118: aload 42
// 11a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11f: checkcast net/minecraft/class_2818
// 122: astore 43
// 124: getstatic su/catlean/q1.t Ljava/util/List;
// 127: aload 41
// 129: ifnull 41c
// 12c: aload 41
// 12e: ifnull 169
// 131: goto 13e
// 134: ldc2_w -4543135939657112867
// 137: lload 2
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: aload 43
// 140: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 145: ifne 10e
// 148: goto 155
// 14b: ldc2_w -4543135939657112867
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: aload 43
// 157: invokevirtual net/minecraft/class_2818.method_12214 ()Ljava/util/Map;
// 15a: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
// 15f: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
// 164: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
// 169: astore 44
// 16b: bipush 0
// 16c: istore 45
// 16e: bipush 0
// 16f: istore 46
// 171: aload 44
// 173: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 178: astore 47
// 17a: aload 47
// 17c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 181: ifeq 1d4
// 184: aload 47
// 186: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 18b: checkcast net/minecraft/class_2586
// 18e: astore 48
// 190: aload 48
// 192: instanceof net/minecraft/class_2595
// 195: aload 41
// 197: ifnull 1d6
// 19a: aload 41
// 19c: ifnull 1c4
// 19f: goto 1ac
// 1a2: ldc2_w -4543135939657112867
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: ifeq 1bf
// 1af: goto 1bc
// 1b2: ldc2_w -4543135939657112867
// 1b5: lload 2
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: iinc 45 1
// 1bf: aload 48
// 1c1: instanceof net/minecraft/class_2627
// 1c4: aload 41
// 1c6: ifnull 181
// 1c9: ifeq 17a
// 1cc: iinc 46 1
// 1cf: aload 41
// 1d1: ifnonnull 17a
// 1d4: iload 45
// 1d6: aload 0
// 1d7: iload 22
// 1d9: iload 23
// 1db: invokespecial su/catlean/q1.z (II)I
// 1de: aload 41
// 1e0: ifnull 1fe
// 1e3: if_icmplt 10e
// 1e6: goto 1f3
// 1e9: ldc2_w -4543135939657112867
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: iload 46
// 1f5: aload 0
// 1f6: lload 19
// 1f8: iload 21
// 1fa: i2s
// 1fb: invokespecial su/catlean/q1.G (JS)I
// 1fe: aload 41
// 200: ifnull 22e
// 203: if_icmplt 10e
// 206: goto 213
// 209: ldc2_w -4543135939657112867
// 20c: lload 2
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: getstatic su/catlean/q1.t Ljava/util/List;
// 216: aload 43
// 218: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 21d: pop
// 21e: aload 43
// 220: invokevirtual net/minecraft/class_2818.method_12004 ()Lnet/minecraft/class_1923;
// 223: invokevirtual net/minecraft/class_1923.method_33940 ()I
// 226: aload 43
// 228: invokevirtual net/minecraft/class_2818.method_12004 ()Lnet/minecraft/class_1923;
// 22b: invokevirtual net/minecraft/class_1923.method_33942 ()I
// 22e: iload 45
// 230: iload 46
// 232: istore 53
// 234: istore 54
// 236: istore 55
// 238: istore 56
// 23a: sipush 24410
// 23d: ldc2_w 4339271353300079869
// 240: lload 2
// 241: lxor
// 242: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: iload 56
// 249: sipush 9027
// 24c: ldc2_w 6694261433988917470
// 24f: lload 2
// 250: lxor
// 251: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: iload 55
// 258: sipush 31812
// 25b: ldc2_w 7387296746950358993
// 25e: lload 2
// 25f: lxor
// 260: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: iload 54
// 267: sipush 2472
// 26a: ldc2_w 4685100002258977290
// 26d: lload 2
// 26e: lxor
// 26f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: iload 53
// 276: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
// 27b: astore 47
// 27d: iload 29
// 27f: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 282: sipush 29275
// 285: ldc2_w 7767760582991018486
// 288: lload 2
// 289: lxor
// 28a: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: aload 47
// 291: iload 30
// 293: iload 31
// 295: i2b
// 296: bipush 5
// 297: getstatic su/catlean/ys.SUCCESS Lsu/catlean/ys;
// 29a: aconst_null
// 29b: sipush 11471
// 29e: ldc2_w 7762518397356674158
// 2a1: lload 2
// 2a2: lxor
// 2a3: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: aconst_null
// 2a9: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 2ac: aload 0
// 2ad: checkcast su/catlean/_g
// 2b0: aload 47
// 2b2: bipush 0
// 2b3: bipush 2
// 2b4: aconst_null
// 2b5: lload 6
// 2b7: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 2ba: getstatic su/catlean/q1.O Lsu/catlean/bg;
// 2bd: sipush 21273
// 2c0: ldc2_w 3523263767831573431
// 2c3: lload 2
// 2c4: lxor
// 2c5: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: lload 32
// 2cc: invokevirtual su/catlean/bg.q (IJ)Z
// 2cf: ifeq 2ea
// 2d2: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 2d5: invokevirtual su/catlean/d2.o ()Lsu/catlean/lp;
// 2d8: lload 17
// 2da: invokevirtual su/catlean/lp.L (J)V
// 2dd: goto 2ea
// 2e0: ldc2_w -4543135939657112867
// 2e3: lload 2
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: sipush 13530
// 2ed: ldc2_w 3715774566245482337
// 2f0: lload 2
// 2f1: lxor
// 2f2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: astore 48
// 2f9: aload 41
// 2fb: ifnull 3ac
// 2fe: lload 4
// 300: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 303: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 306: dup
// 307: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 30a: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 30d: ifnull 3ab
// 310: goto 31d
// 313: ldc2_w -4543135939657112867
// 316: lload 2
// 317: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31c: athrow
// 31d: lload 4
// 31f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 322: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 325: dup
// 326: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 329: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 32c: dup
// 32d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 330: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 333: aload 41
// 335: ifnull 3a9
// 338: goto 345
// 33b: ldc2_w -4543135939657112867
// 33e: lload 2
// 33f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: athrow
// 345: ifnull 3ab
// 348: goto 355
// 34b: ldc2_w -4543135939657112867
// 34e: lload 2
// 34f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 354: athrow
// 355: lload 4
// 357: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 35a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 35d: dup
// 35e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 361: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 364: dup
// 365: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 368: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 36b: dup
// 36c: sipush 27094
// 36f: ldc2_w 7214723689967968779
// 372: lload 2
// 373: lxor
// 374: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 37c: sipush 22600
// 37f: ldc2_w 258071514980186356
// 382: lload 2
// 383: lxor
// 384: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 389: sipush 20694
// 38c: ldc2_w 5285110210024534101
// 38f: lload 2
// 390: lxor
// 391: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: bipush 0
// 397: bipush 4
// 398: aconst_null
// 399: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
// 39c: goto 3a9
// 39f: ldc2_w -4543135939657112867
// 3a2: lload 2
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: astore 48
// 3ab: nop
// 3ac: new java/io/BufferedWriter
// 3af: dup
// 3b0: new java/io/FileWriter
// 3b3: dup
// 3b4: new java/io/File
// 3b7: dup
// 3b8: invokestatic su/catlean/mj.z ()Ljava/io/File;
// 3bb: aload 48
// 3bd: sipush 2054
// 3c0: ldc2_w 6847875579970257863
// 3c3: lload 2
// 3c4: lxor
// 3c5: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ca: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 3cf: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
// 3d2: bipush 1
// 3d3: invokespecial java/io/FileWriter.<init> (Ljava/io/File;Z)V
// 3d6: checkcast java/io/Writer
// 3d9: invokespecial java/io/BufferedWriter.<init> (Ljava/io/Writer;)V
// 3dc: astore 49
// 3de: aload 49
// 3e0: aload 47
// 3e2: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\n\u0001" ]
// 3e7: checkcast java/lang/CharSequence
// 3ea: invokevirtual java/io/BufferedWriter.append (Ljava/lang/CharSequence;)Ljava/io/Writer;
// 3ed: pop
// 3ee: aload 49
// 3f0: invokevirtual java/io/BufferedWriter.close ()V
// 3f3: goto 10e
// 3f6: astore 49
// 3f8: aload 41
// 3fa: ifnonnull 10e
// 3fd: aload 0
// 3fe: lload 8
// 400: invokespecial su/catlean/q1.Q (J)Lsu/catlean/cm;
// 403: getstatic su/catlean/cm.OFF Lsu/catlean/cm;
// 406: if_acmpeq 731
// 409: getstatic su/catlean/q1.J Ljava/util/List;
// 40c: checkcast java/lang/Iterable
// 40f: goto 41c
// 412: ldc2_w -4543135939657112867
// 415: lload 2
// 416: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: athrow
// 41c: astore 42
// 41e: bipush 0
// 41f: istore 43
// 421: aload 42
// 423: astore 44
// 425: new java/util/ArrayList
// 428: dup
// 429: aload 42
// 42b: sipush 16691
// 42e: ldc2_w 3082059399632740745
// 431: lload 2
// 432: lxor
// 433: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 438: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 43b: invokespecial java/util/ArrayList.<init> (I)V
// 43e: checkcast java/util/Collection
// 441: astore 45
// 443: bipush 0
// 444: istore 46
// 446: aload 44
// 448: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 44d: astore 47
// 44f: aload 47
// 451: invokeinterface java/util/Iterator.hasNext ()Z 1
// 456: ifeq 495
// 459: aload 47
// 45b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 460: astore 48
// 462: aload 45
// 464: aload 48
// 466: checkcast net/minecraft/class_1293
// 469: astore 49
// 46b: astore 51
// 46d: bipush 0
// 46e: istore 50
// 470: aload 49
// 472: invokevirtual net/minecraft/class_1293.method_5586 ()Ljava/lang/String;
// 475: aload 51
// 477: swap
// 478: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 47d: pop
// 47e: aload 41
// 480: ifnull 4e6
// 483: aload 41
// 485: ifnonnull 44f
// 488: goto 495
// 48b: ldc2_w -4543135939657112867
// 48e: lload 2
// 48f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 494: athrow
// 495: aload 45
// 497: checkcast java/util/List
// 49a: nop
// 49b: checkcast java/lang/Iterable
// 49e: lload 24
// 4a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a3: invokevirtual net/minecraft/class_746.method_6026 ()Ljava/util/Collection;
// 4a6: dup
// 4a7: sipush 17152
// 4aa: ldc2_w 927818678909520113
// 4ad: lload 2
// 4ae: lxor
// 4af: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b7: checkcast java/lang/Iterable
// 4ba: astore 42
// 4bc: astore 51
// 4be: bipush 0
// 4bf: istore 43
// 4c1: aload 42
// 4c3: astore 44
// 4c5: new java/util/ArrayList
// 4c8: dup
// 4c9: aload 42
// 4cb: sipush 16691
// 4ce: ldc2_w 3082059399632740745
// 4d1: lload 2
// 4d2: lxor
// 4d3: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d8: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 4db: invokespecial java/util/ArrayList.<init> (I)V
// 4de: checkcast java/util/Collection
// 4e1: astore 45
// 4e3: bipush 0
// 4e4: istore 46
// 4e6: aload 44
// 4e8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4ed: astore 47
// 4ef: aload 47
// 4f1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4f6: ifeq 535
// 4f9: aload 47
// 4fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 500: astore 48
// 502: aload 45
// 504: aload 48
// 506: checkcast net/minecraft/class_1293
// 509: astore 49
// 50b: astore 52
// 50d: bipush 0
// 50e: istore 50
// 510: aload 49
// 512: invokevirtual net/minecraft/class_1293.method_5586 ()Ljava/lang/String;
// 515: aload 52
// 517: swap
// 518: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 51d: pop
// 51e: aload 41
// 520: ifnull 552
// 523: aload 41
// 525: ifnonnull 4ef
// 528: goto 535
// 52b: ldc2_w -4543135939657112867
// 52e: lload 2
// 52f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 534: athrow
// 535: aload 45
// 537: checkcast java/util/List
// 53a: nop
// 53b: aload 51
// 53d: swap
// 53e: checkcast java/lang/Iterable
// 541: invokestatic kotlin/collections/CollectionsKt.toSet (Ljava/lang/Iterable;)Ljava/util/Set;
// 544: checkcast java/lang/Iterable
// 547: invokestatic kotlin/collections/CollectionsKt.minus (Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
// 54a: checkcast java/lang/Iterable
// 54d: astore 42
// 54f: bipush 0
// 550: istore 43
// 552: aload 42
// 554: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 559: astore 44
// 55b: aload 44
// 55d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 562: ifeq 706
// 565: aload 44
// 567: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 56c: astore 45
// 56e: aload 45
// 570: checkcast java/lang/String
// 573: astore 46
// 575: bipush 0
// 576: istore 47
// 578: aload 41
// 57a: ifnull 70f
// 57d: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 580: aload 41
// 582: ifnull 5ea
// 585: goto 592
// 588: ldc2_w -4543135939657112867
// 58b: lload 2
// 58c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 591: athrow
// 592: lload 8
// 594: invokespecial su/catlean/q1.Q (J)Lsu/catlean/cm;
// 597: getstatic su/catlean/cm.NOTIFICATION Lsu/catlean/cm;
// 59a: if_acmpeq 5d7
// 59d: goto 5aa
// 5a0: ldc2_w -4543135939657112867
// 5a3: lload 2
// 5a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a9: athrow
// 5aa: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 5ad: lload 8
// 5af: invokespecial su/catlean/q1.Q (J)Lsu/catlean/cm;
// 5b2: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 5b5: aload 41
// 5b7: ifnull 66f
// 5ba: goto 5c7
// 5bd: ldc2_w -4543135939657112867
// 5c0: lload 2
// 5c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c6: athrow
// 5c7: if_acmpne 652
// 5ca: goto 5d7
// 5cd: ldc2_w -4543135939657112867
// 5d0: lload 2
// 5d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d6: athrow
// 5d7: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 5da: checkcast su/catlean/_g
// 5dd: goto 5ea
// 5e0: ldc2_w -4543135939657112867
// 5e3: lload 2
// 5e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e9: athrow
// 5ea: iload 26
// 5ec: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 5ef: checkcast su/catlean/_g
// 5f2: sipush 5872
// 5f5: ldc2_w 5688686603081653682
// 5f8: lload 2
// 5f9: lxor
// 5fa: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ff: bipush 1
// 600: anewarray 1092
// 603: astore 48
// 605: aload 48
// 607: bipush 0
// 608: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 60b: aload 46
// 60d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 610: iload 14
// 612: aload 46
// 614: bipush 0
// 615: anewarray 1092
// 618: iload 15
// 61a: swap
// 61b: iload 16
// 61d: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 620: aastore
// 621: aload 48
// 623: iload 27
// 625: i2c
// 626: bipush 0
// 627: bipush 4
// 628: aconst_null
// 629: iload 28
// 62b: i2s
// 62c: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 62f: getstatic su/catlean/ys.WARNING Lsu/catlean/ys;
// 632: bipush 2
// 633: getstatic net/minecraft/class_1802.field_8574 Lnet/minecraft/class_1792;
// 636: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 639: astore 36
// 63b: istore 37
// 63d: astore 38
// 63f: astore 39
// 641: astore 40
// 643: lload 34
// 645: aload 40
// 647: aload 39
// 649: aload 38
// 64b: iload 37
// 64d: aload 36
// 64f: invokestatic su/catlean/o2.O (JLsu/catlean/_g;Ljava/lang/String;Lsu/catlean/ys;ILnet/minecraft/class_1799;)V
// 652: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 655: aload 41
// 657: ifnull 6b2
// 65a: lload 8
// 65c: invokespecial su/catlean/q1.Q (J)Lsu/catlean/cm;
// 65f: getstatic su/catlean/cm.CHAT Lsu/catlean/cm;
// 662: goto 66f
// 665: ldc2_w -4543135939657112867
// 668: lload 2
// 669: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66e: athrow
// 66f: if_acmpeq 69f
// 672: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 675: aload 41
// 677: ifnull 6b2
// 67a: goto 687
// 67d: ldc2_w -4543135939657112867
// 680: lload 2
// 681: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 686: athrow
// 687: lload 8
// 689: invokespecial su/catlean/q1.Q (J)Lsu/catlean/cm;
// 68c: getstatic su/catlean/cm.BOTH Lsu/catlean/cm;
// 68f: if_acmpne 6ff
// 692: goto 69f
// 695: ldc2_w -4543135939657112867
// 698: lload 2
// 699: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69e: athrow
// 69f: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 6a2: checkcast su/catlean/_g
// 6a5: goto 6b2
// 6a8: ldc2_w -4543135939657112867
// 6ab: lload 2
// 6ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b1: athrow
// 6b2: iload 26
// 6b4: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 6b7: checkcast su/catlean/_g
// 6ba: sipush 1820
// 6bd: ldc2_w 8515147584509807748
// 6c0: lload 2
// 6c1: lxor
// 6c2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c7: bipush 1
// 6c8: anewarray 1092
// 6cb: astore 48
// 6cd: aload 48
// 6cf: bipush 0
// 6d0: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 6d3: aload 46
// 6d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6d8: iload 14
// 6da: aload 46
// 6dc: bipush 0
// 6dd: anewarray 1092
// 6e0: iload 15
// 6e2: swap
// 6e3: iload 16
// 6e5: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 6e8: aastore
// 6e9: aload 48
// 6eb: iload 27
// 6ed: i2c
// 6ee: bipush 0
// 6ef: bipush 4
// 6f0: aconst_null
// 6f1: iload 28
// 6f3: i2s
// 6f4: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 6f7: bipush 0
// 6f8: bipush 2
// 6f9: aconst_null
// 6fa: lload 6
// 6fc: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 6ff: nop
// 700: nop
// 701: aload 41
// 703: ifnonnull 55b
// 706: nop
// 707: getstatic su/catlean/q1.J Ljava/util/List;
// 70a: invokeinterface java/util/List.clear ()V 1
// 70f: getstatic su/catlean/q1.J Ljava/util/List;
// 712: lload 24
// 714: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 717: invokevirtual net/minecraft/class_746.method_6026 ()Ljava/util/Collection;
// 71a: dup
// 71b: sipush 22872
// 71e: ldc2_w 6634363265072485032
// 721: lload 2
// 722: lxor
// 723: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 728: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 72b: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
// 730: pop
// 731: return
}

private final String O(long var1, long var3) {
var3 = c ^ var3;
String var5 = b<"h">(28872, 3699555008586090538L ^ var3);
Object[] var6 = new Object[]{(float)var1 / 1000.0F};
String var10000 = String.format(var5, Arrays.copyOf(var6, var6.length));
Intrinsics.checkNotNullExpressionValue(var10000, b<"h">(21153, 6802258686378846846L ^ var3));
return var10000;
}

private final void O(class_332 param1, bj param2, bj param3, long param4, String param6, String param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 48456418652260
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 8888083505721
// 015: lxor
// 016: lstore 10
// 018: dup2
// 019: ldc2_w 30965386149059
// 01c: lxor
// 01d: lstore 12
// 01f: dup2
// 020: ldc2_w 137743565599055
// 023: lxor
// 024: lstore 14
// 026: dup2
// 027: ldc2_w 125852480446465
// 02a: lxor
// 02b: lstore 16
// 02d: dup2
// 02e: ldc2_w 84116123872008
// 031: lxor
// 032: lstore 18
// 034: dup2
// 035: ldc2_w 25545842879961
// 038: lxor
// 039: lstore 20
// 03b: pop2
// 03c: ldc2_w 3299647471165210242
// 03f: lload 4
// 041: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: lload 18
// 048: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 04b: lload 14
// 04d: aload 7
// 04f: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 052: lload 12
// 054: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 057: lload 14
// 059: aload 6
// 05b: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 05e: invokestatic java/lang/Math.max (FF)F
// 061: fstore 23
// 063: lload 8
// 065: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 068: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 06b: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 06e: i2f
// 06f: fconst_2
// 070: fdiv
// 071: fload 23
// 073: fconst_2
// 074: fdiv
// 075: fsub
// 076: ldc 17.0
// 078: fsub
// 079: fstore 24
// 07b: astore 22
// 07d: invokestatic java/lang/System.currentTimeMillis ()J
// 080: l2d
// 081: ldc2_w 3.0
// 084: ddiv
// 085: sipush 18596
// 088: ldc2_w 2274542403364553869
// 08b: lload 4
// 08d: lxor
// 08e: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: i2d
// 094: drem
// 095: d2i
// 096: istore 25
// 098: iload 25
// 09a: sipush 19002
// 09d: ldc2_w 2985570888385955331
// 0a0: lload 4
// 0a2: lxor
// 0a3: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: aload 22
// 0aa: ifnull 0dc
// 0ad: if_icmplt 0e0
// 0b0: goto 0be
// 0b3: ldc2_w 3204800211477827159
// 0b6: lload 4
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: sipush 13048
// 0c1: ldc2_w 896975806192484089
// 0c4: lload 4
// 0c6: lxor
// 0c7: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: iload 25
// 0ce: goto 0dc
// 0d1: ldc2_w 3204800211477827159
// 0d4: lload 4
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: isub
// 0dd: goto 0e2
// 0e0: iload 25
// 0e2: istore 25
// 0e4: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e7: getstatic java/awt/Color.RED Ljava/awt/Color;
// 0ea: dup
// 0eb: sipush 10955
// 0ee: ldc2_w 6763094468772580802
// 0f1: lload 4
// 0f3: lxor
// 0f4: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fc: getstatic java/awt/Color.YELLOW Ljava/awt/Color;
// 0ff: dup
// 100: sipush 11760
// 103: ldc2_w 8047882951366003425
// 106: lload 4
// 108: lxor
// 109: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 111: iload 25
// 113: i2f
// 114: ldc 360.0
// 116: fdiv
// 117: lload 10
// 119: dup2_x2
// 11a: pop2
// 11b: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 11e: astore 26
// 120: lload 12
// 122: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 125: aload 1
// 126: aload 6
// 128: lload 16
// 12a: fload 24
// 12c: ldc 8.0
// 12e: aload 26
// 130: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 133: lload 18
// 135: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 138: aload 1
// 139: aload 7
// 13b: lload 16
// 13d: fload 24
// 13f: ldc 20.0
// 141: aload 26
// 143: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 146: iload 25
// 148: sipush 32619
// 14b: ldc2_w 3097673690647933818
// 14e: lload 4
// 150: lxor
// 151: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: if_icmple 168
// 159: aload 2
// 15a: goto 169
// 15d: ldc2_w 3204800211477827159
// 160: lload 4
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: aload 3
// 169: aload 1
// 16a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 16d: dup
// 16e: sipush 10333
// 171: ldc2_w 393144369113255694
// 174: lload 4
// 176: lxor
// 177: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17f: checkcast org/joml/Matrix3x2f
// 182: fload 24
// 184: bipush 5
// 185: i2f
// 186: fadd
// 187: f2d
// 188: fload 23
// 18a: f2d
// 18b: dadd
// 18c: ldc2_w 5.0
// 18f: fconst_0
// 190: fconst_0
// 191: aload 26
// 193: aconst_null
// 194: fconst_0
// 195: sipush 8982
// 198: ldc2_w 1763009786292104963
// 19b: lload 4
// 19d: lxor
// 19e: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: lload 20
// 1a5: aconst_null
// 1a6: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 1a9: return
}

public final void s(@NotNull String name, int count, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q1.c J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 94648959470317
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 29994036009361
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 7
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 8
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 9
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 3563939197198
// 033: lxor
// 034: lstore 10
// 036: dup2
// 037: ldc2_w 25567415365090
// 03a: lxor
// 03b: lstore 12
// 03d: dup2
// 03e: ldc2_w 124964336752241
// 041: lxor
// 042: lstore 14
// 044: dup2
// 045: ldc2_w 21729542857436
// 048: lxor
// 049: lstore 16
// 04b: pop2
// 04c: ldc2_w 2597116427666683714
// 04f: lload 3
// 050: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: aload 1
// 056: sipush 6743
// 059: ldc2_w 1061015241073554599
// 05c: lload 3
// 05d: lxor
// 05e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 066: astore 18
// 068: aload 0
// 069: aload 18
// 06b: ifnull 094
// 06e: lload 10
// 070: invokespecial su/catlean/q1.e (J)Z
// 073: ifeq 131
// 076: goto 083
// 079: ldc2_w 2718415600313272215
// 07c: lload 3
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: aload 0
// 084: checkcast su/catlean/_g
// 087: goto 094
// 08a: ldc2_w 2718415600313272215
// 08d: lload 3
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 1
// 095: iload 7
// 097: aload 0
// 098: checkcast su/catlean/_g
// 09b: sipush 26820
// 09e: ldc2_w 433140536550753904
// 0a1: lload 3
// 0a2: lxor
// 0a3: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/q1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: bipush 1
// 0a9: anewarray 1092
// 0ac: astore 19
// 0ae: aload 19
// 0b0: bipush 0
// 0b1: iload 2
// 0b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0b5: aastore
// 0b6: aload 19
// 0b8: iload 8
// 0ba: i2c
// 0bb: bipush 0
// 0bc: bipush 4
// 0bd: aconst_null
// 0be: iload 9
// 0c0: i2s
// 0c1: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 0c4: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001" ]
// 0c9: bipush 0
// 0ca: bipush 2
// 0cb: aconst_null
// 0cc: lload 5
// 0ce: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 0d1: getstatic su/catlean/q1.G Lsu/catlean/bg;
// 0d4: sipush 13616
// 0d7: ldc2_w 3688163922843234558
// 0da: lload 3
// 0db: lxor
// 0dc: invokedynamic k (IJ)I bsm=su/catlean/q1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: lload 12
// 0e3: invokevirtual su/catlean/bg.q (IJ)Z
// 0e6: lload 3
// 0e7: lconst_0
// 0e8: lcmp
// 0e9: ifle 116
// 0ec: aload 18
// 0ee: ifnull 116
// 0f1: ifeq 131
// 0f4: goto 101
// 0f7: ldc2_w 2718415600313272215
// 0fa: lload 3
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: getstatic su/catlean/qm.k Lsu/catlean/qm;
// 104: lload 16
// 106: invokevirtual su/catlean/qm.f (J)Z
// 109: goto 116
// 10c: ldc2_w 2718415600313272215
// 10f: lload 3
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: ifeq 131
// 119: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 11c: invokevirtual su/catlean/d2.I ()Lsu/catlean/lp;
// 11f: lload 14
// 121: invokevirtual su/catlean/lp.L (J)V
// 124: goto 131
// 127: ldc2_w 2718415600313272215
// 12a: lload 3
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: return
}

private final int x(class_1799 var1) {
return (int)((var1.method_7936() - var1.method_7919()) / Math.max(0.1, (double)var1.method_7936()) * 100.0F);
}

private static final boolean n() {
long var0 = c ^ 99793747647469L;
long var2 = var0 ^ 48145711543321L;
return W.F(var2);
}

private static final boolean Z() {
long var0 = c ^ 37494863210934L;
long var2 = var0 ^ 91341923616322L;
return W.F(var2);
}

private static final boolean H() {
long var0 = c ^ 42462111421716L;
long var2 = var0 ^ 100310741724166L;

try {
if (W.g(var2) != cm.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 3254674904600776452L, var0);
}

return false;
}

private static final boolean L() {
long var0 = c ^ 94788924267070L;
long var2 = var0 ^ 47901050479404L;

try {
if (W.g(var2) != cm.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -6773240944261988306L, var0);
}

return false;
}

private static final boolean R() {
long var0 = c ^ 20367690306507L;
long var2 = var0 ^ 122196815243993L;

try {
if (W.g(var2) != cm.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 7779363129623366107L, var0);
}

return false;
}

private static final boolean A() {
long var0 = c ^ 123325150952878L;
long var10001 = var0 ^ 89965265361810L;
int var2 = (int)((var0 ^ 89965265361810L) >>> 32);
int var3 = (int)((var0 ^ 89965265361810L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);

try {
if (W.Y(var2, (short)var3, (short)var4) != cm.OFF) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 401026127056512958L, var0);
}

return false;
}

private static final boolean R(List var0, Entry var1) {
long var2 = c ^ 69789675868873L;
int[] var10000 = vm.a<"Å">(-6105478911570282484L, var2);
Intrinsics.checkNotNullParameter(var1, b<"h">(31646, 4278299074659752666L ^ var2));
int[] var4 = var10000;
var10000 = (int[])var1.getKey();
Intrinsics.checkNotNullExpressionValue(var10000, b<"h">(4516, 5918875443231846512L ^ var2));
String var5 = (String)var10000;

try {
boolean var8 = var0.contains(var5);
if (var4 == null) {
return var8;
}

if (!var8) {
return true;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6127159990104094503L, var2);
}

return false;
}

private static final boolean t(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var31 = c ^ 11129531296214L;
long var33 = var31 ^ 130704686601838L;
long var35 = var31 ^ 98164183063304L;
long var37 = var31 ^ 118391761866367L;
long var39 = var31 ^ 112554197887603L;
long var41 = var31 ^ 61150416301274L;
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[131];
int var27 = 0;
String var26 = ";\u0091\f\u0005âWà\f\u0001)¶z8þ\u0098Ñ\u00ad\u009e(ºÑ2¬UÒ_ê\u0082m5þ¯ \u009e\u0091\u0094ZõúÞlÉ<Cu¿\u0013Þ#;Û#\u009f\u0087¹¿c\u0015\u0091\"\u0095\\\u0094¿Ï\u0010\"®i=ÈûÙ-\fç\u0015\u001dUòê,\u0010\u001añ4ò\u0002Pzù¼´\u0090_\u0012ÞQ· \u0093å´~oÃ\u001f\u008cÎ3d\u0099\u0019íQÞ\u008e\u009d\u0085Í'h\n÷.YeÈhËÊ+\u0010ÙÇ1\u0091¢Z\u0019´¦+\u001b&«äÇu\u0018Òt5£ôLR\u0016¾wïÔÿtÓ¾\u0085\u009cM[\u0086\u0012Zw\u0010\u008dåV\u009a\rÖ\u0018¹A\u0082 \u009a\u0096\u0001mß\u0010\u0088B\u0088¹O\u009f4H\b¨\u009c\u0003H§Û \u0010\u0011\u0093\u0092È½\u0094\u007f4OØ>ß]Ü[Ã\u0018¯J\u000bÐ¨K\rXpÃ\"5ú\u0013±\u0096¡ k¹PD \u0089À\u0018úÛß\u008cj?\u001b\u001b\\\u0003+<}\u008b;P ³\u00855wÀ<¿id\u008f£Ó¤\nÖ\u009b\u0089W4À\u001f».ó\u009a\tX%\u008aj¶z\u0083áá@\u0092j#ö^\u0015Ån*G\u0096\u0097\u0015\u0003®\u0086RU\u0084Ò[\u0085D\u0093pëÖZøTì\u0093¹\u0006î\u0080Õ-¿a\u0099NÔuN\u0001 î'×\u0092?c\u00800¬áh\u0007ÝÓªÙ\u0083\u008f\u0013\u001f8÷\u0086RT)\u008c°´ÌD\u00adF±Çº\u008f\u0011Ò\u0013º\u00adÚÂf\u0095\\)\u008bÏ\u000eZÕ»)ù\")áÞ@\u0095¦7\u0096\u0094\f/§-N\u000blà2ðµôz3\u0082\u0086,Îÿ\u0081|\u008bg\u000b\u008b\u0010Ü\u0013ûÁÜ2k\u009c\u008b\u008c´ rÒ\u008eþ\u0018v¢u:\u000e\u001e\u009d_\u000fÛn<ñâ°8¨\u0086äo{\u0007Ð\u0018\u0018Ûp_\u0099ï\fÉ\u0095ÝS*êóÃÖ\u0000\u000b°(b,Lî2\u0018\u008eà\u009dù\t§ÌÕ{Äc©w^#¬!\u0088\u000bs{\u009a.¤(ÑÐ\u008bÀ¾Ý\u0080B~ËÅR-{ì[p\u007f0r\"\u008e6E\u0014Ë[\n\u0095aèÌÏÀ3(åà\u0001õ ³]\u0096.ÁföA\u0016qé}63p9<\u0094Ó\u0014'84×U¥\u0088b|ZÝ\u0092 &[i\u009c\u000fN\u0012¬\u000bØ\u0085Uþ\u0080ºï\u008b\u0015\u0001^h\u0017é£b\u0097¤\t»#½¹ éz\u0006\\¾\u009cqÍd6Dü¥ý\u009amã\tÎ±!6\u008f4WÈ±ò¼\u00102Ù\u0010°2à\u0019Û¹\u0088á\u0000f\u0090)J,IÄ å\u0095~r\u0081\u008dËÔÇ\u0086b\\L\u008d\u0089»ÞízÇÚ\u0003»Ðèa§]»\u0088¥s(\u0082ÉJp\u00adð\u0003\u0006ó½\u009bg0Q1\u0088Ke\u0012ÁÅAîå;G\n=\u0015×à\u008cÈ,0Â\u001aì'Ò(÷Ü0ßî\u0002î\u0084h\u009cÔ»÷f_ÔÐ©ý\u001a`¼î\u008f\u000f\u0001àÓr/3VV¶X\u008fµ²Ic =gË¨.Ù\u009bµÇ\u0098uo\\!K\u0099\u0003¬$ß\r\u009cêßç¨\u0019v\u0092N\u008aÝ0\u009a\u0092u9\u0000\u0096\u0096;Çs}i¬¶á/\u001aáÐþÐË\u0010\u000fC¨ïª~\u0017¯?{Ðõ\u001e\u008a\u0004\u0080_¡|1\u0019ä)L÷ Hr\u0018¡Æ»o$ç »èÆû8åó\u0007Ls»\u0086ÞÐ»\u009eUv7c·«\u0018EÎe°ëÇu.ùÃ\u0098ð/í\rYÞ;äáxªdõ TùÁ\u001eJþít-£&kµø¥º\u0082m\u0093^s\u0015É=OgÞ.fF¦· ß4\u001d°d\u0010]_Í\u0011©\u008b1Ì¬\u0092\u0089qey\\Waãi2Ì\u009e²ï\u008aê\u0010\n¾|Z¾\u0007\t\u0099{X\u001a$i\u008cpt\u0010X\u0096ìZÜi\u0086Áa¹W\u000bl\u0081©u\u0010\u00adÅ\u0002çÛ@¥Ï/¾Þ4x*O\u0080\u0010V\u007f2ÿ×i.«û\bß\u001d%¯vÄ\u0018\"[d5µ\u001fÈÑFÃIå~¦\u000f\u0018\u0013ëª$Sý:æ(\u008f³\u0003§\u0086\u0097(\u0093h¾\u0088\u009aúÉqÃ³xÖ\u000bÔ\u0018R\u0011'\u008a4\u001b þ:«¢á\u0019\u009d®aá\\\u0010\u009fkKÚavXÿí\u009b\u0091S¼½à\u001f \u0005EJqY\u008eD8|4x;%(\u009b\"\u009eÜ<äs\rØm\u001fØ\u0088\u00adò\u0095|Ý \u0004!ò&³ò\u0081 A\u0084¯âÄ=\u0086¦¡\u000fê(ÒÒ(Ì0(\u008a\u00adôuÏ\u0001 [\u0095ö«¾\u00ad\u0093l|\u009a+\u001d×xJ÷\u0094ÖvÔý\u001e\u001eG\\Jt å`Î\u00060R}\tF[#~\u007fâÏ\u0090i¡\u0093BK²WÐ)>ª!\u0011ópº\u0012ÞþéÏµB\u0015]õ\\WcÄ~D\u0098þÑ\u0001F Ð¤e\u0016ý]G\u001d\u0095ý£fK\u0087F${¢+}\u0099ÀÚêf=â\u0085\u001b®Q\u009d öS'93.rå\u001b·\u0082F×2ªWë\u009b\u0013p\u009eÄòÁ±¾\u000fýTÉ«r\u0018¦ÆæÀ÷\u0088ñ-HÕª\u0091Q\u0082\u0092±`\u0090\u0083[&\u0089¦« oz?¯25.0%·\u0015a-\u0083¨ßgÚ¼¥ë¨eÌ\u000bÙ\u009fÔ¸\u008fØe(§¨þþ\u0092~Úôª\t\u000fbß\u0012Ñ\u00886<®\u008fº\u0000À9ÙBõe@+K\u0016\u0011\u0089\u0096+GÊÞx\u0018wiË½\u0085\u009de'¾\u0095¼(r\u0000\u0095[ÐÙ[ì»Vc\u008a\u0010éjO#Eõc¦â·p\u008b´ÉØ\u001a \u0087gz\u009ad8\u000f³µÂÕº\"ùìî\u0005 ¾ãK\u009e¦·\u0012)IùAß*\u008d ÝkðT<\rIâ\u0092ø\u001a\u00984\u009f_oª\u0000\u008cuòÚ^ÃÇÞ\u0099\u009fß¾¦ò(\u008c\u009ca¦dùEÄ\u0085S\u0080\u009boÕÅl\u0085sà\u0010\u008dØ\u001a¡Ò«èË\u009e \u0086ôÆ§!Ë9nv2(\u0003\u0010\u0002\u008a¸\u0010>xÙ½ßªCùî\u0015\u0019YùÓü)\u001dü\u009cÁ»\u009cºüDÄX\u0001\u008b`Ò\u0095(< \u0005\u0095ðKÃ^\u0016\u001bpìÓ+\u009bõ\u008ex\u009f\u000eI\u0001®\u001dc\u0002Úò\\\u008eß$\u0093@\u0018Ù\u0014!¹aWûÊ:\u007füÚ¯æfZó\u0082\u009dø¦åCy Óë\u000bëx\u00191\u0082\u0000POlk ²~ëk\u009bä¢>v\u0091\u0012\u0011t²äx\"q\u0018\u000foX\\\u0095p*\u0087é\u0091A\u0093¢TJÎ\"u\u0005Ä\u001dÁiÓ Æ]J\u0090\u0004·Ã¹â\u001f2p[Ð\u0011\u0087ÿÍä-x0\u0096\u001dqeÿ28ù\u0092Ï\u0010\u00883Z\tWÀ3\u0086ÒóÔ®Ïü§\u00978Á¡·QI÷¡\u008an|èÅøtûC\u008fF\u0091\u001a5\u008e\u009b8\u0019T\u0092ri<\u0084\u0001\b\u0012a° ¥1OLuU\u0088³ñ@8\u008d\u0014Ðºùv\u0092D \u0096¤täÉ\u0083âj¦[~\u00ad\u009e\u0015VO\r\u001e \u0010JÎ{\u0017\u000bW\u001aY¶\u0083&&\u0010vï-\b]çhä3Z\n:\\aÑ®\u0010e³Sp\u008aÍµ?û0§\u0001\u0095ÏÓ°\u0018\u00ad\u0016ëÜ<|lJ1Q×¯BE\u008a\u0005&\u0000íÚÌ\u0091)\u0007\u0018C»\u001e9Tæ\u001fe\u000bÅgº\u0001Ã·%\u0001Á\u0093ö\u0012åí7(h<\u0089tí\u00823B\r\u0004\u00145ÙÖ\u008fÍ&j_vû\u001cbe2úUM\u00810/PHø\u0082\u0010\u000e2)=\u0010}û\"ÓåñÂ)v\u0017Mï6öE\u0094\u0018æÒù¾^vÂ½¢ô{]~\u0011ypá°X¨ÿq¦~\u0010ÎvOàG\u0006<_\u001c\"óðnA\u0086'\u0018\u009f5\u008e\u001dôw\u0000\bÔ\u001fwf\u0086hëÙz\u001d'D@î\u0016&8ÀÈÍa\u000bJ\u0087B\u0092\u008fòD\u0000Þ\t\u0011\u000bú\u0091pÜLå\u0097À9\u000e¿Ê¥½Õe3\u0001t¶`-\u0090O}\u0082Ë<3\u0096\u0089Wû*1\u009a±ßä \b\u0002¬øf\u0005Í®FR\u001a\u001dàÂ\u000b\u0011\u0099´ÿè\u0013ÔÕ\u0019ä\u0003zÕ\u0002à\u009fá(G\u0081éà\u0018bmÀ^ü\u008b¼¢7\u009aÅnjÅ.´÷]ªª3(÷\u0016:¤Çø\u0086ãu\u0010}Óë\u0018¿\u0097fòeåT¬éÇ\u000e\u008bÑp3\u0006ÔÑLÔ\u0081qØ\u0085 \u0090T%&*8^7ók{o\u0081Ä5ñ\u008bÈ\u0082ü\u000e¦\\\\)\u008bé)|+Ãs\u0010:\u0083;pGü\u0015~x¡© e\u0095Tù\u0010¾\u0085þfå[\u008d¯ä£yñæ6ÚH\u0010È^l\u0089óO\u0082e\u0006\u009aâer¨Ðr\u0018Æù6\u0005£\u00ad¶å/ý\u0095\u0017?EÞ\u008bXÑN ¿\u001d\u001aÔ }u¦\u009d Ä\u0095\u001câ¶$Cs\u0000Ä\u008aêÅÄ\u008dÌ/e\u0082ùJ\u008dN\u0097U§\u0087\u0018¶1\u0015ê\u0011z¸Ç!Þ¬Ü!\u0098ëªÆ#\"Ö\u0018õ-\u0097(\\Åà\u0084®Ó|Æ\u0086è\u0090b\u0014\u0088 ¶\u0096»o¨\u0082éfCvÀÙa]ZKêÀßau\u0087í\u008d\u0006\u0018xÆh\u009fîD_Âåudf\u0001ÿ5f\u0080dæÕ\u008e´Iî8@}Ül\u000bjD«Ò.¬¦Ö|O\u0087ÐK%1|\u008dªª\u0093AZÁNÒ-ñ\u001dÜ\u007fÓ\u0016a[¼kØË&hÜB\u0016Ô»$Ïx\u0015]\u001c\u0018\u0011*\u009av\u0003Æ¨ØúR\\\u008c6ãBeÞ&ä»»!2\u0096 KgPIZKO\u0012÷\u0083\u0004\fH\u008b(\u0018\u009ay\u0085\u001ab/k\r\u001eÅ\f\u0092\u0018w\u00159\u0010x\u0086» \u001c\u0086jøF\u00ad7\u0089d\u00181 \u0010\u000b\u00ad\u001a°\u001cáâ\b\u0000ß¿Ð\u0090\u001f\u0091#\u0018>¸5-Xkd]<\u0018§\u0089÷ßÙ.\u0005©öòDÜt\u0085 \u008e|\u001añí\nº=ªÁÍ\u009b\u0083Í\u008fäC\u0016\u000fiç ¹á²\u0000\u0016üxÁ_\u001a\u0010\u000e\u001f\u0017}õO(¦ënWu>ö\u0019\u009c wÜ\u0015H\u008e/¯\u0083\u0010\u0081\u001dÒd\u0014\u008f|UûE¨Â2\u0094ÇÂcÃ\u0089Pû(ú \u0080h_ví¡7¿zj²'àîÎï\u000eÀ$3o\u0002¤\u0087 îm\u008f\u0000X¬@(ô\u0081ÏwÕ|\u001e\u0005Ë\u0096\u0081?5ZèÊ#\u0019\fÎ3à·)ªãÜD¬ù\u0096\u0082I<dÝa·T@\u0010TL«Ùæ-v·Hª¿\u0006×\u0080ì\u001a8|98\\ô\u0095/û¦¶0Ã\u008aÖ\u0094^\u008a¸DJ¤\u009a)¹\u0011E\u0087ÜÀ\"\u0093\u0000\u0099¶!I\u009f\u008a®/\u0085h8<3½ÚPu\u0083¿\u0003-g\u008c\u0087\u00104ëº\u001a\u0082·të\u000b2®oÔªõn\u0018&úÊÖÇê\u00adÏÂz¢FË¸$\u0094\u0086ßh#\u008e²8<\u0010Ð\u0006\u009b\u009c\fIéø\u008c¢\u0007R\u008b\u0090Ù\u001e \u0093|K½\u008f\u009alé\u0091+fØ¥\n¬\u0097òü\u0080ä\u0006\u0002Á°vu\faó+o\u0000 æQ¨\u008e\u007fÄ\u0013?{ÛÓ\u009a\u0019\u008aâ%\u008f'{)³\u0083b8/üA|éó±±(¼ºÍ\u001eBf~«\u0012àù7Ø³\u001aí@p\u0014¥t\u00ad\u000eîã\u0006VÙæÃÚD¶N=ÔW\u001b;Á\u0018qÓy@ï{±KWþä\u0012\u0010¾øFòá¯\u001f,H\u0013\b(Í¢mû\u0089Rª\u0007\u0088L:z]Cå¡\u0016´\u000fON\u0000öÅ{VuÄ¹\u009c´Ã!\u0005µÁîO¦ñ(æt ¬0\u001d_Cüe\u0090\u000f\u008dJ{qÍ¹4\bÌ\u00ad9ì2\u0088_íÉùÒôVFÅ}\u0014n!v 3Ëöæ½\u0005-\bv¡z{NSî<\u009eA#fÕ²ý¦0f«\u009fÿâÓ\u0010\u0010eÚQ³\u0019}\u0098óí(=Ñ,§\f\u0087 ÄFøWQÌÊ¨E§\u0087\u0016\u0097\u001d)%óg\u0019\u0085q\u0012Y·áÅÏ\u009e-bF_\u0018Ï4×ý²\u0015µ\u0098;_¢\u000bÎ\u001ff'ð\u0083:{êÞ\t\u001e «6*q\u0080\u0015\u0001tC\u0096óÚO¦ügDûQ6· \u0002\u0083bÜ\u0012;XÉ¿!\u0018:ËYrÓM\u0005N\u0017ÒpbHjH@Ûß\u0011\u0096\u009bV\u0004\u0097 ºª-=Ë<ÐÌþÔ°ÞÕE\u009dT, m¥\u0084XÚè\u009fùº\u0004ÒKòH |º\u0005TÙ\u0099Î5\u0088À\"\u0093 \u0004 óÃG¤ê\u0005j'ÄÚ5þ¦ê|(h\u0018AXÌñÓ\u0092\u008aÉ\u0084\u0097®1Y¨s3ª\u0096g9Ä\u001e\u0099Î(á\u0006y/ÒÜìÙúç²Iäì\u0080\u0087Ä\u0098OSÜçsÕ%#\u00070¾Xiín`J\f\u0002\u0084$'8µ%<wpj\u0012\u008bãcä\u001c\u0095¨×õ\u0017^\u000b\f¿6\u0086- \u008d\u009c°Á§¡Z::0§;V\n`et&\u0014wë3\u0017°|ñèãKÙ\u0087 \u001fAP\u009c\u000bù\u0016Â\rËj`@ú\bªlÒ×\u001fwÐ9ÅáCfîÐU0Ç\u0018\u0007\u0088îd¹á{l°\u008a\u001b\u0088\u009e\u0002¤\u0004Á¿¸÷+Ê¬Æ\u0010çu\u0006¥e½½ îBA£\u000fð¦C\u0010µÂ£É]Ö!éÓØ\u0015=çá?2 *\u0090/5\u0006Ú¢ô\u0010\u008b\u008b|íB¾\u0001À6CyÔî\u009a?þºÊIÔx\u0096\u00ad\u0010\u000fyh\b\u000bðÁ\u0086~\u0092»¼u\u0001)6 o\u008dh*\u0081ÇYu¯÷öÅ\u0004\u0091åðÃ©¾\u0095Aâ(ö\u0092£)8é½\u007f²\u0018ÆË>hãQçÝscOY~£\u0096»ÒÓ\u0098\u0089\u00856\u0085K\u0018\u008aåu|×j\u008ac\u008b]³!rSñÓr§`¾Âh\u0088( ³DÅ\u008bL_\u009dÏ¾s\u008d+\u0006þ+¸¸\u009bÓ·Lú=ÿrÞÖðÿ×\u001fó\u0010¬W¥·\u0001\u0096Y½b\u0086§ì\u0092¥\t\u0013(X<\u009bË'\u0085q)\u0015ÁÕî?F$\u0016(0\u007fÑ£¬\u0087: Ê]Ê¨\nä¸\u0004ZÖþ@N¬Ì \u0005ÒS\u0090Y\u0001m.Z\u0093«ÏÜcìÏ\u0005¥¶ì\u0092\u0003K:Ç\u0011y\u009cKßêÇ {´ð\u0018Ó\u009b\u000e¨¶/ôqKd\f7GÝ\u0086\u0098òiñ\u007fq\fR[p=cf";
int var28 = ";\u0091\f\u0005âWà\f\u0001)¶z8þ\u0098Ñ\u00ad\u009e(ºÑ2¬UÒ_ê\u0082m5þ¯ \u009e\u0091\u0094ZõúÞlÉ<Cu¿\u0013Þ#;Û#\u009f\u0087¹¿c\u0015\u0091\"\u0095\\\u0094¿Ï\u0010\"®i=ÈûÙ-\fç\u0015\u001dUòê,\u0010\u001añ4ò\u0002Pzù¼´\u0090_\u0012ÞQ· \u0093å´~oÃ\u001f\u008cÎ3d\u0099\u0019íQÞ\u008e\u009d\u0085Í'h\n÷.YeÈhËÊ+\u0010ÙÇ1\u0091¢Z\u0019´¦+\u001b&«äÇu\u0018Òt5£ôLR\u0016¾wïÔÿtÓ¾\u0085\u009cM[\u0086\u0012Zw\u0010\u008dåV\u009a\rÖ\u0018¹A\u0082 \u009a\u0096\u0001mß\u0010\u0088B\u0088¹O\u009f4H\b¨\u009c\u0003H§Û \u0010\u0011\u0093\u0092È½\u0094\u007f4OØ>ß]Ü[Ã\u0018¯J\u000bÐ¨K\rXpÃ\"5ú\u0013±\u0096¡ k¹PD \u0089À\u0018úÛß\u008cj?\u001b\u001b\\\u0003+<}\u008b;P ³\u00855wÀ<¿id\u008f£Ó¤\nÖ\u009b\u0089W4À\u001f».ó\u009a\tX%\u008aj¶z\u0083áá@\u0092j#ö^\u0015Ån*G\u0096\u0097\u0015\u0003®\u0086RU\u0084Ò[\u0085D\u0093pëÖZøTì\u0093¹\u0006î\u0080Õ-¿a\u0099NÔuN\u0001 î'×\u0092?c\u00800¬áh\u0007ÝÓªÙ\u0083\u008f\u0013\u001f8÷\u0086RT)\u008c°´ÌD\u00adF±Çº\u008f\u0011Ò\u0013º\u00adÚÂf\u0095\\)\u008bÏ\u000eZÕ»)ù\")áÞ@\u0095¦7\u0096\u0094\f/§-N\u000blà2ðµôz3\u0082\u0086,Îÿ\u0081|\u008bg\u000b\u008b\u0010Ü\u0013ûÁÜ2k\u009c\u008b\u008c´ rÒ\u008eþ\u0018v¢u:\u000e\u001e\u009d_\u000fÛn<ñâ°8¨\u0086äo{\u0007Ð\u0018\u0018Ûp_\u0099ï\fÉ\u0095ÝS*êóÃÖ\u0000\u000b°(b,Lî2\u0018\u008eà\u009dù\t§ÌÕ{Äc©w^#¬!\u0088\u000bs{\u009a.¤(ÑÐ\u008bÀ¾Ý\u0080B~ËÅR-{ì[p\u007f0r\"\u008e6E\u0014Ë[\n\u0095aèÌÏÀ3(åà\u0001õ ³]\u0096.ÁföA\u0016qé}63p9<\u0094Ó\u0014'84×U¥\u0088b|ZÝ\u0092 &[i\u009c\u000fN\u0012¬\u000bØ\u0085Uþ\u0080ºï\u008b\u0015\u0001^h\u0017é£b\u0097¤\t»#½¹ éz\u0006\\¾\u009cqÍd6Dü¥ý\u009amã\tÎ±!6\u008f4WÈ±ò¼\u00102Ù\u0010°2à\u0019Û¹\u0088á\u0000f\u0090)J,IÄ å\u0095~r\u0081\u008dËÔÇ\u0086b\\L\u008d\u0089»ÞízÇÚ\u0003»Ðèa§]»\u0088¥s(\u0082ÉJp\u00adð\u0003\u0006ó½\u009bg0Q1\u0088Ke\u0012ÁÅAîå;G\n=\u0015×à\u008cÈ,0Â\u001aì'Ò(÷Ü0ßî\u0002î\u0084h\u009cÔ»÷f_ÔÐ©ý\u001a`¼î\u008f\u000f\u0001àÓr/3VV¶X\u008fµ²Ic =gË¨.Ù\u009bµÇ\u0098uo\\!K\u0099\u0003¬$ß\r\u009cêßç¨\u0019v\u0092N\u008aÝ0\u009a\u0092u9\u0000\u0096\u0096;Çs}i¬¶á/\u001aáÐþÐË\u0010\u000fC¨ïª~\u0017¯?{Ðõ\u001e\u008a\u0004\u0080_¡|1\u0019ä)L÷ Hr\u0018¡Æ»o$ç »èÆû8åó\u0007Ls»\u0086ÞÐ»\u009eUv7c·«\u0018EÎe°ëÇu.ùÃ\u0098ð/í\rYÞ;äáxªdõ TùÁ\u001eJþít-£&kµø¥º\u0082m\u0093^s\u0015É=OgÞ.fF¦· ß4\u001d°d\u0010]_Í\u0011©\u008b1Ì¬\u0092\u0089qey\\Waãi2Ì\u009e²ï\u008aê\u0010\n¾|Z¾\u0007\t\u0099{X\u001a$i\u008cpt\u0010X\u0096ìZÜi\u0086Áa¹W\u000bl\u0081©u\u0010\u00adÅ\u0002çÛ@¥Ï/¾Þ4x*O\u0080\u0010V\u007f2ÿ×i.«û\bß\u001d%¯vÄ\u0018\"[d5µ\u001fÈÑFÃIå~¦\u000f\u0018\u0013ëª$Sý:æ(\u008f³\u0003§\u0086\u0097(\u0093h¾\u0088\u009aúÉqÃ³xÖ\u000bÔ\u0018R\u0011'\u008a4\u001b þ:«¢á\u0019\u009d®aá\\\u0010\u009fkKÚavXÿí\u009b\u0091S¼½à\u001f \u0005EJqY\u008eD8|4x;%(\u009b\"\u009eÜ<äs\rØm\u001fØ\u0088\u00adò\u0095|Ý \u0004!ò&³ò\u0081 A\u0084¯âÄ=\u0086¦¡\u000fê(ÒÒ(Ì0(\u008a\u00adôuÏ\u0001 [\u0095ö«¾\u00ad\u0093l|\u009a+\u001d×xJ÷\u0094ÖvÔý\u001e\u001eG\\Jt å`Î\u00060R}\tF[#~\u007fâÏ\u0090i¡\u0093BK²WÐ)>ª!\u0011ópº\u0012ÞþéÏµB\u0015]õ\\WcÄ~D\u0098þÑ\u0001F Ð¤e\u0016ý]G\u001d\u0095ý£fK\u0087F${¢+}\u0099ÀÚêf=â\u0085\u001b®Q\u009d öS'93.rå\u001b·\u0082F×2ªWë\u009b\u0013p\u009eÄòÁ±¾\u000fýTÉ«r\u0018¦ÆæÀ÷\u0088ñ-HÕª\u0091Q\u0082\u0092±`\u0090\u0083[&\u0089¦« oz?¯25.0%·\u0015a-\u0083¨ßgÚ¼¥ë¨eÌ\u000bÙ\u009fÔ¸\u008fØe(§¨þþ\u0092~Úôª\t\u000fbß\u0012Ñ\u00886<®\u008fº\u0000À9ÙBõe@+K\u0016\u0011\u0089\u0096+GÊÞx\u0018wiË½\u0085\u009de'¾\u0095¼(r\u0000\u0095[ÐÙ[ì»Vc\u008a\u0010éjO#Eõc¦â·p\u008b´ÉØ\u001a \u0087gz\u009ad8\u000f³µÂÕº\"ùìî\u0005 ¾ãK\u009e¦·\u0012)IùAß*\u008d ÝkðT<\rIâ\u0092ø\u001a\u00984\u009f_oª\u0000\u008cuòÚ^ÃÇÞ\u0099\u009fß¾¦ò(\u008c\u009ca¦dùEÄ\u0085S\u0080\u009boÕÅl\u0085sà\u0010\u008dØ\u001a¡Ò«èË\u009e \u0086ôÆ§!Ë9nv2(\u0003\u0010\u0002\u008a¸\u0010>xÙ½ßªCùî\u0015\u0019YùÓü)\u001dü\u009cÁ»\u009cºüDÄX\u0001\u008b`Ò\u0095(< \u0005\u0095ðKÃ^\u0016\u001bpìÓ+\u009bõ\u008ex\u009f\u000eI\u0001®\u001dc\u0002Úò\\\u008eß$\u0093@\u0018Ù\u0014!¹aWûÊ:\u007füÚ¯æfZó\u0082\u009dø¦åCy Óë\u000bëx\u00191\u0082\u0000POlk ²~ëk\u009bä¢>v\u0091\u0012\u0011t²äx\"q\u0018\u000foX\\\u0095p*\u0087é\u0091A\u0093¢TJÎ\"u\u0005Ä\u001dÁiÓ Æ]J\u0090\u0004·Ã¹â\u001f2p[Ð\u0011\u0087ÿÍä-x0\u0096\u001dqeÿ28ù\u0092Ï\u0010\u00883Z\tWÀ3\u0086ÒóÔ®Ïü§\u00978Á¡·QI÷¡\u008an|èÅøtûC\u008fF\u0091\u001a5\u008e\u009b8\u0019T\u0092ri<\u0084\u0001\b\u0012a° ¥1OLuU\u0088³ñ@8\u008d\u0014Ðºùv\u0092D \u0096¤täÉ\u0083âj¦[~\u00ad\u009e\u0015VO\r\u001e \u0010JÎ{\u0017\u000bW\u001aY¶\u0083&&\u0010vï-\b]çhä3Z\n:\\aÑ®\u0010e³Sp\u008aÍµ?û0§\u0001\u0095ÏÓ°\u0018\u00ad\u0016ëÜ<|lJ1Q×¯BE\u008a\u0005&\u0000íÚÌ\u0091)\u0007\u0018C»\u001e9Tæ\u001fe\u000bÅgº\u0001Ã·%\u0001Á\u0093ö\u0012åí7(h<\u0089tí\u00823B\r\u0004\u00145ÙÖ\u008fÍ&j_vû\u001cbe2úUM\u00810/PHø\u0082\u0010\u000e2)=\u0010}û\"ÓåñÂ)v\u0017Mï6öE\u0094\u0018æÒù¾^vÂ½¢ô{]~\u0011ypá°X¨ÿq¦~\u0010ÎvOàG\u0006<_\u001c\"óðnA\u0086'\u0018\u009f5\u008e\u001dôw\u0000\bÔ\u001fwf\u0086hëÙz\u001d'D@î\u0016&8ÀÈÍa\u000bJ\u0087B\u0092\u008fòD\u0000Þ\t\u0011\u000bú\u0091pÜLå\u0097À9\u000e¿Ê¥½Õe3\u0001t¶`-\u0090O}\u0082Ë<3\u0096\u0089Wû*1\u009a±ßä \b\u0002¬øf\u0005Í®FR\u001a\u001dàÂ\u000b\u0011\u0099´ÿè\u0013ÔÕ\u0019ä\u0003zÕ\u0002à\u009fá(G\u0081éà\u0018bmÀ^ü\u008b¼¢7\u009aÅnjÅ.´÷]ªª3(÷\u0016:¤Çø\u0086ãu\u0010}Óë\u0018¿\u0097fòeåT¬éÇ\u000e\u008bÑp3\u0006ÔÑLÔ\u0081qØ\u0085 \u0090T%&*8^7ók{o\u0081Ä5ñ\u008bÈ\u0082ü\u000e¦\\\\)\u008bé)|+Ãs\u0010:\u0083;pGü\u0015~x¡© e\u0095Tù\u0010¾\u0085þfå[\u008d¯ä£yñæ6ÚH\u0010È^l\u0089óO\u0082e\u0006\u009aâer¨Ðr\u0018Æù6\u0005£\u00ad¶å/ý\u0095\u0017?EÞ\u008bXÑN ¿\u001d\u001aÔ }u¦\u009d Ä\u0095\u001câ¶$Cs\u0000Ä\u008aêÅÄ\u008dÌ/e\u0082ùJ\u008dN\u0097U§\u0087\u0018¶1\u0015ê\u0011z¸Ç!Þ¬Ü!\u0098ëªÆ#\"Ö\u0018õ-\u0097(\\Åà\u0084®Ó|Æ\u0086è\u0090b\u0014\u0088 ¶\u0096»o¨\u0082éfCvÀÙa]ZKêÀßau\u0087í\u008d\u0006\u0018xÆh\u009fîD_Âåudf\u0001ÿ5f\u0080dæÕ\u008e´Iî8@}Ül\u000bjD«Ò.¬¦Ö|O\u0087ÐK%1|\u008dªª\u0093AZÁNÒ-ñ\u001dÜ\u007fÓ\u0016a[¼kØË&hÜB\u0016Ô»$Ïx\u0015]\u001c\u0018\u0011*\u009av\u0003Æ¨ØúR\\\u008c6ãBeÞ&ä»»!2\u0096 KgPIZKO\u0012÷\u0083\u0004\fH\u008b(\u0018\u009ay\u0085\u001ab/k\r\u001eÅ\f\u0092\u0018w\u00159\u0010x\u0086» \u001c\u0086jøF\u00ad7\u0089d\u00181 \u0010\u000b\u00ad\u001a°\u001cáâ\b\u0000ß¿Ð\u0090\u001f\u0091#\u0018>¸5-Xkd]<\u0018§\u0089÷ßÙ.\u0005©öòDÜt\u0085 \u008e|\u001añí\nº=ªÁÍ\u009b\u0083Í\u008fäC\u0016\u000fiç ¹á²\u0000\u0016üxÁ_\u001a\u0010\u000e\u001f\u0017}õO(¦ënWu>ö\u0019\u009c wÜ\u0015H\u008e/¯\u0083\u0010\u0081\u001dÒd\u0014\u008f|UûE¨Â2\u0094ÇÂcÃ\u0089Pû(ú \u0080h_ví¡7¿zj²'àîÎï\u000eÀ$3o\u0002¤\u0087 îm\u008f\u0000X¬@(ô\u0081ÏwÕ|\u001e\u0005Ë\u0096\u0081?5ZèÊ#\u0019\fÎ3à·)ªãÜD¬ù\u0096\u0082I<dÝa·T@\u0010TL«Ùæ-v·Hª¿\u0006×\u0080ì\u001a8|98\\ô\u0095/û¦¶0Ã\u008aÖ\u0094^\u008a¸DJ¤\u009a)¹\u0011E\u0087ÜÀ\"\u0093\u0000\u0099¶!I\u009f\u008a®/\u0085h8<3½ÚPu\u0083¿\u0003-g\u008c\u0087\u00104ëº\u001a\u0082·të\u000b2®oÔªõn\u0018&úÊÖÇê\u00adÏÂz¢FË¸$\u0094\u0086ßh#\u008e²8<\u0010Ð\u0006\u009b\u009c\fIéø\u008c¢\u0007R\u008b\u0090Ù\u001e \u0093|K½\u008f\u009alé\u0091+fØ¥\n¬\u0097òü\u0080ä\u0006\u0002Á°vu\faó+o\u0000 æQ¨\u008e\u007fÄ\u0013?{ÛÓ\u009a\u0019\u008aâ%\u008f'{)³\u0083b8/üA|éó±±(¼ºÍ\u001eBf~«\u0012àù7Ø³\u001aí@p\u0014¥t\u00ad\u000eîã\u0006VÙæÃÚD¶N=ÔW\u001b;Á\u0018qÓy@ï{±KWþä\u0012\u0010¾øFòá¯\u001f,H\u0013\b(Í¢mû\u0089Rª\u0007\u0088L:z]Cå¡\u0016´\u000fON\u0000öÅ{VuÄ¹\u009c´Ã!\u0005µÁîO¦ñ(æt ¬0\u001d_Cüe\u0090\u000f\u008dJ{qÍ¹4\bÌ\u00ad9ì2\u0088_íÉùÒôVFÅ}\u0014n!v 3Ëöæ½\u0005-\bv¡z{NSî<\u009eA#fÕ²ý¦0f«\u009fÿâÓ\u0010\u0010eÚQ³\u0019}\u0098óí(=Ñ,§\f\u0087 ÄFøWQÌÊ¨E§\u0087\u0016\u0097\u001d)%óg\u0019\u0085q\u0012Y·áÅÏ\u009e-bF_\u0018Ï4×ý²\u0015µ\u0098;_¢\u000bÎ\u001ff'ð\u0083:{êÞ\t\u001e «6*q\u0080\u0015\u0001tC\u0096óÚO¦ügDûQ6· \u0002\u0083bÜ\u0012;XÉ¿!\u0018:ËYrÓM\u0005N\u0017ÒpbHjH@Ûß\u0011\u0096\u009bV\u0004\u0097 ºª-=Ë<ÐÌþÔ°ÞÕE\u009dT, m¥\u0084XÚè\u009fùº\u0004ÒKòH |º\u0005TÙ\u0099Î5\u0088À\"\u0093 \u0004 óÃG¤ê\u0005j'ÄÚ5þ¦ê|(h\u0018AXÌñÓ\u0092\u008aÉ\u0084\u0097®1Y¨s3ª\u0096g9Ä\u001e\u0099Î(á\u0006y/ÒÜìÙúç²Iäì\u0080\u0087Ä\u0098OSÜçsÕ%#\u00070¾Xiín`J\f\u0002\u0084$'8µ%<wpj\u0012\u008bãcä\u001c\u0095¨×õ\u0017^\u000b\f¿6\u0086- \u008d\u009c°Á§¡Z::0§;V\n`et&\u0014wë3\u0017°|ñèãKÙ\u0087 \u001fAP\u009c\u000bù\u0016Â\rËj`@ú\bªlÒ×\u001fwÐ9ÅáCfîÐU0Ç\u0018\u0007\u0088îd¹á{l°\u008a\u001b\u0088\u009e\u0002¤\u0004Á¿¸÷+Ê¬Æ\u0010çu\u0006¥e½½ îBA£\u000fð¦C\u0010µÂ£É]Ö!éÓØ\u0015=çá?2 *\u0090/5\u0006Ú¢ô\u0010\u008b\u008b|íB¾\u0001À6CyÔî\u009a?þºÊIÔx\u0096\u00ad\u0010\u000fyh\b\u000bðÁ\u0086~\u0092»¼u\u0001)6 o\u008dh*\u0081ÇYu¯÷öÅ\u0004\u0091åðÃ©¾\u0095Aâ(ö\u0092£)8é½\u007f²\u0018ÆË>hãQçÝscOY~£\u0096»ÒÓ\u0098\u0089\u00856\u0085K\u0018\u008aåu|×j\u008ac\u008b]³!rSñÓr§`¾Âh\u0088( ³DÅ\u008bL_\u009dÏ¾s\u008d+\u0006þ+¸¸\u009bÓ·Lú=ÿrÞÖðÿ×\u001fó\u0010¬W¥·\u0001\u0096Y½b\u0086§ì\u0092¥\t\u0013(X<\u009bË'\u0085q)\u0015ÁÕî?F$\u0016(0\u007fÑ£¬\u0087: Ê]Ê¨\nä¸\u0004ZÖþ@N¬Ì \u0005ÒS\u0090Y\u0001m.Z\u0093«ÏÜcìÏ\u0005¥¶ì\u0092\u0003K:Ç\u0011y\u009cKßêÇ {´ð\u0018Ó\u009b\u000e¨¶/ôqKd\f7GÝ\u0086\u0098òiñ\u007fq\fR[p=cf"
.length();
char var25 = ' ';
int var46 = -1;

label72:
while (true) {
String var47 = var26.substring(++var46, var46 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var47.getBytes("ISO-8859-1"));
String var62 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var62;
if ((var46 += var25) >= var28) {
ab = var29;
fb = new String[131];
mb = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[60];
int var14 = 0;
String var15 = "¤¢\u000f2ù}TèÂÁ!)ÍaZ\u0098#ø÷â£,9À\bí¶w\u000b D¶D\u0005AÊäß¹¡N¾TÓÙIò¹*Ü\u0084pNÙ®\\öíp¬;Hðð94Cô=«\bL(ºÅwDº\u0082\u0086*J \u0087óOåA´údS\u001cZÍ§\u001bê±\fM»\u008b,\r\u008e\u0017\u0096\u0005Fr\u0013\u009aúuÇ\u0084·ãÎ\u0000ÌOV§M\\\u0013Ëk\u008b9!\u0014åÚ$\u0013\u000fç\u0087Þ³\u001f\u0012½4y´\u0097\u009fðñ\"½F\u0016@ü:g\\D¢úúðÒv\u0014dì·~ßªSe¼Rçì©@\u0013\u000fìé¹ýÞv±pháUÏ*ÑVÏ\u0094¨\u0017lÂAË&ÃáåX¾2\u0098\u009bÃÁá\u001a5}aÏ\u0005 ÐguÒ\u0092ÀN¹!ºÜî\u0087$P\u008e\u000fi\u0096ðåáû³0+Ý&ÝZ%wb(!\u0017q?#)\u0001ç\u00ad<³E\u0094MÍ>\u0099\u000fe\u0085s\f8\u000f1¢2\u0081µ,\u0096Þðþ\u0084\tÊ'WÀQÑ$ÿÒ*«\u0010\\AÃé@y\u008a\u0089½É£ð2\u0084f\u007f\u0080Yù\u0080\u001eímÖ<)æÒ®\tV.ÌAxsOBWck?æ|I²B\u008f)Æº\u009fq?~Ý£%b@=,É\u0093¤\u0085I6ð9\u0010\u0089(]\u008có¸³Ðöí¡nòâ§ª~j\u0090¹BµdX1z\u0085\u009aO½»:\u0086·Å,uâ?_\bC'×èJs\u009eG\u0081\u00905òR\u009fCê.F\r\u0014~àe¡\u008c\u0085\u0001ès\u008d\u0013;S #\u0017`è\b\u0093\"¬";
int var16 = "¤¢\u000f2ù}TèÂÁ!)ÍaZ\u0098#ø÷â£,9À\bí¶w\u000b D¶D\u0005AÊäß¹¡N¾TÓÙIò¹*Ü\u0084pNÙ®\\öíp¬;Hðð94Cô=«\bL(ºÅwDº\u0082\u0086*J \u0087óOåA´údS\u001cZÍ§\u001bê±\fM»\u008b,\r\u008e\u0017\u0096\u0005Fr\u0013\u009aúuÇ\u0084·ãÎ\u0000ÌOV§M\\\u0013Ëk\u008b9!\u0014åÚ$\u0013\u000fç\u0087Þ³\u001f\u0012½4y´\u0097\u009fðñ\"½F\u0016@ü:g\\D¢úúðÒv\u0014dì·~ßªSe¼Rçì©@\u0013\u000fìé¹ýÞv±pháUÏ*ÑVÏ\u0094¨\u0017lÂAË&ÃáåX¾2\u0098\u009bÃÁá\u001a5}aÏ\u0005 ÐguÒ\u0092ÀN¹!ºÜî\u0087$P\u008e\u000fi\u0096ðåáû³0+Ý&ÝZ%wb(!\u0017q?#)\u0001ç\u00ad<³E\u0094MÍ>\u0099\u000fe\u0085s\f8\u000f1¢2\u0081µ,\u0096Þðþ\u0084\tÊ'WÀQÑ$ÿÒ*«\u0010\\AÃé@y\u008a\u0089½É£ð2\u0084f\u007f\u0080Yù\u0080\u001eímÖ<)æÒ®\tV.ÌAxsOBWck?æ|I²B\u008f)Æº\u009fq?~Ý£%b@=,É\u0093¤\u0085I6ð9\u0010\u0089(]\u008có¸³Ðöí¡nòâ§ª~j\u0090¹BµdX1z\u0085\u009aO½»:\u0086·Å,uâ?_\bC'×èJs\u009eG\u0081\u00905òR\u009fCê.F\r\u0014~àe¡\u008c\u0085\u0001ès\u008d\u0013;S #\u0017`è\b\u0093\"¬"
.length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var50 = var17;
var10001 = var14++;
long var66 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var70 = -1;

while (true) {
long var19 = var66;
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
long var74 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var70) {
case 0:
var50[var10001] = var74;
if (var13 >= var16) {
hb = var17;
lb = new Integer[60];
pb = new HashMap(13);
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
String var4 = "Àû¸`SÑ h$_\u0019\u0099$·\u008dô =:\u001d\u000f4²a";
int var5 = "Àû¸`SÑ h$_\u0019\u0099$·\u008dô =:\u001d\u000f4²a".length();
byte var2 = 0;

do {
int var58 = var2;
var2 += 8;
byte[] var7 = var4.substring(var58, var2).getBytes("ISO-8859-1");
var58 = var3++;
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
var74 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var73 = -1;
var6[var58] = var74;
} while (var2 < var5);

nb = var6;
ob = new Long[3];
KProperty[] var43 = new KProperty[c<"k">(32413, 5603845063007309594L ^ var31)];
var43[0] = Reflection.property1(new PropertyReference1Impl(q1.class, b<"h">(1322, 8855750676245536712L ^ var31), b<"h">(1705, 7032019552778017846L ^ var31), 0));
var43[1] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(15573, 6573869395977659933L ^ var31), b<"h">(4818, 6613976913591126143L ^ var31), 0)
);
var43[2] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(4915, 3408055530743941610L ^ var31), b<"h">(13637, 2249957849359347636L ^ var31), 0)
);
var43[3] = Reflection.property1(new PropertyReference1Impl(q1.class, b<"h">(2764, 1549956518590763032L ^ var31), b<"h">(9920, 7195229235102612494L ^ var31), 0));
var43[4] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(19767, 4388677114909399019L ^ var31), b<"h">(18535, 4247649322630058706L ^ var31), 0)
);
var43[5] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(4704, 2466098631455885456L ^ var31), b<"h">(13412, 6329171697975488173L ^ var31), 0)
);
var43[c<"k">(1145, 8388504345250395605L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(21274, 3281044948204849658L ^ var31), b<"h">(8713, 7396690562427713736L ^ var31), 0)
);
var43[c<"k">(20767, 2901562593937498297L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(709, 8977326464396941334L ^ var31), b<"h">(25810, 3264436540262497888L ^ var31), 0)
);
var43[c<"k">(1988, 4776448759334991465L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(15642, 7327025281752885147L ^ var31), b<"h">(24589, 6611118571095931597L ^ var31), 0)
);
var43[c<"k">(28117, 5696061902589893732L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(18201, 6710336915565387230L ^ var31), b<"h">(18971, 8226152501703250070L ^ var31), 0)
);
var43[c<"k">(16691, 3082120530265288850L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(11033, 8724524268298596794L ^ var31), b<"h">(5487, 2090009570295566312L ^ var31), 0)
);
var43[c<"k">(25455, 2907743230067151564L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(32085, 3262713018125100984L ^ var31), b<"h">(794, 8329196736340285830L ^ var31), 0)
);
var43[c<"k">(30281, 7372931142916736968L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(27283, 543504732227547177L ^ var31), b<"h">(20061, 3023607791181567128L ^ var31), 0)
);
var43[c<"k">(31855, 1490859156806372824L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(29556, 78654353195018626L ^ var31), b<"h">(5789, 5745752471231908864L ^ var31), 0)
);
var43[c<"k">(14926, 5961679929924373468L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(20278, 699209096721470906L ^ var31), b<"h">(14847, 1294587295071855435L ^ var31), 0)
);
var43[c<"k">(18381, 7080581896532080214L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(32064, 4815633207825016735L ^ var31), b<"h">(18118, 4210611787879783533L ^ var31), 0)
);
var43[c<"k">(11471, 7762597867830959477L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(26039, 7113505616152739640L ^ var31), b<"h">(32314, 214471845347435732L ^ var31), 0)
);
var43[c<"k">(18320, 9162352826212824635L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(q1.class, b<"h">(11075, 2590294788506055094L ^ var31), b<"h">(3384, 4620686630831839155L ^ var31), 0)
);
f = var43;
W = new q1(var39);
e = yp.t(W, b<"h">(3286, 4751968847802881620L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
E = yp.t(W, b<"h">(29087, 8123924532727098184L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
Y = yp.t(W, b<"h">(15951, 3092628415345157319L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
u = yp.t(W, b<"h">(19325, 1358511450687312326L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
S = yp.t(W, b<"h">(25990, 4961163318067085098L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
K = yp.t(W, b<"h">(27599, 6590362344217489702L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
y = yp.t(W, b<"h">(27035, 4872097407234585353L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
z = yp.L(
W,
b<"h">(2063, 4255858216152453820L ^ var31),
5,
new IntRange(0, c<"k">(2332, 1321881447987673231L ^ var31)),
var35,
null,
q1::n,
c<"k">(1988, 4776448759334991465L ^ var31),
null
);
g = yp.L(
W,
b<"h">(10388, 1030949911983354472L ^ var31),
0,
new IntRange(0, c<"k">(22362, 8373110645915461315L ^ var31)),
var35,
null,
q1::Z,
c<"k">(1988, 4776448759334991465L ^ var31),
null
);
a = yp.t(W, b<"h">(18201, 6710336915565387230L ^ var31), false, var33, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null);
l = yp.L(W, b<"h">(1805, 8477207443478076858L ^ var31), cm.BOTH, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null, var41);
B = yp.L(W, b<"h">(20530, 894674508370610916L ^ var31), cm.BOTH, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null, var41);
h = yp.t(W, b<"h">(28261, 4847811611165504715L ^ var31), true, var33, null, q1::H, 4, null);
j = yp.t(W, b<"h">(25184, 9139803726250555642L ^ var31), false, var33, null, q1::L, 4, null);
V = yp.t(W, b<"h">(28093, 2903938775825332034L ^ var31), true, var33, null, q1::R, 4, null);
A = yp.L(W, b<"h">(4500, 5615349740697930700L ^ var31), cm.BOTH, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null, var41);
F = yp.t(W, b<"h">(18081, 8433099763167108217L ^ var31), false, var33, null, q1::A, 4, null);
L = yp.L(W, b<"h">(15769, 1697707776068019983L ^ var31), cm.BOTH, null, null, c<"k">(9898, 6473347608875718419L ^ var31), null, var41);
D = new bj(b<"h">(22107, 2278151822537690274L ^ var31), c<"k">(6185, 5571678032754108813L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
T = new bj(b<"h">(9144, 7295596979663862105L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
k = new bj(b<"h">(23804, 4430372333516260969L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
i = new bj(b<"h">(22173, 8311311235759475756L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
N = new bj(b<"h">(4031, 279779164688766308L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
X = new bj(b<"h">(25625, 691915123464388337L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
U = new bj(b<"h">(13669, 6278597653367484396L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), c<"k">(23077, 8457777720552663968L ^ var31), var37);
x = new bg();
long var60 = 2340522854975236811L ^ var31;
C = new bg();
w = new bg();
o = new bg();
G = new bg();
I = new bg();
b = new bg();
P = new bg();
O = new bg();
t = new ArrayList();
J = new ArrayList();
m = new ConcurrentHashMap();
d = c<"k">(6997, var60);
return;
}
break;
default:
var50[var10001] = var74;
if (var13 < var16) {
continue label54;
}

var15 = ";ÙØÎ y\u0099òCN¯PÅ¦_^";
var16 = ";ÙØÎ y\u0099òCN¯PÅ¦_^".length();
var13 = 0;
}

byte var57 = var13;
var13 += 8;
var18 = var15.substring(var57, var13).getBytes("ISO-8859-1");
var50 = var17;
var10001 = var14++;
var66 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var70 = 0;
}
}
}

var25 = var26.charAt(var46);
break;
default:
var29[var27++] = var62;
if ((var46 += var25) < var28) {
var25 = var26.charAt(var46);
continue label72;
}

var26 = "yf¯\u0011¹@\u0087Mç\u009f\u0089pè|\u0010 Òb5ö\u0001âÉõY\u0015`§\u0015áÊ\u0083 4¾Ø«\u0002\u0087p\u0013ô\rd_\u009e¤\u0015/¦è;ÄiuGáçª¤Sç£å ";
var28 = "yf¯\u0011¹@\u0087Mç\u009f\u0089pè|\u0010 Òb5ö\u0001âÉõY\u0015`§\u0015áÊ\u0083 4¾Ø«\u0002\u0087p\u0013ô\rd_\u009e¤\u0015/¦è;ÄiuGáçª¤Sç£å ".length();
var25 = ' ';
var46 = -1;
}

var47 = var26.substring(++var46, var46 + var25);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19045;
if (fb[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])gb.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
gb.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/q1", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = ab[var5].getBytes("ISO-8859-1");
fb[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return fb[var5];
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
throw new RuntimeException("su/catlean/q1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24853;
if (lb[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = hb[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])mb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
mb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/q1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
lb[var3] = var15;
}

return lb[var3];
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
throw new RuntimeException("su/catlean/q1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long e(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1479;
if (ob[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = nb[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])pb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
pb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/q1", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
ob[var3] = var15;
}

return ob[var3];
}

private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = e(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
return var7;
}

private static CallSite e(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/q1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
