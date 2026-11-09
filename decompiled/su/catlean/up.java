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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.gofra.Flow;

public final class up extends _g {
@NotNull
public static final up g;
@NotNull
private static final cq D;
@NotNull
private static final ct u;
@NotNull
private static final cq c;
@NotNull
private static final ct X;
@NotNull
private static final ct A;
@NotNull
private static final ct j;
private static int m;
private static float b;
private static final long a = yz.a(-4972314754821266888L, 4656782431449420122L, MethodHandles.lookup().lookupClass()).a(118060033216283L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private up(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 126297519314687L;
super(b<"k">(9425, 6094003139841407886L ^ var4), jt.V(), null, 4, null, var6);
}

private final boolean T(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 27096523919322L;
return (Boolean)D.E(this, var5, L[0]);
}

private final float I(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 85786627451646L;
return ((Number)u.E(this, var6, L[1])).floatValue();
}

private final boolean a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 167104955141L;
return (Boolean)c.E(this, var3, L[2]);
}

private final float L(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 25545555151267L;
return ((Number)X.E(this, var6, L[3])).floatValue();
}

private final float Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100501492538818L;
return ((Number)A.E(this, var3, L[4])).floatValue();
}

private final float R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 61125417730473L;
return ((Number)j.E(this, var3, L[5])).floatValue();
}

@Override
public void O(long var1) {
m = 0;
b = 0.0F;
}

@Flow
public final void R(@NotNull EventPlayerTravel ev) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/up.a J
// 003: ldc2_w 24715456670499
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 131860204493103
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 57200012597000
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
// 027: ldc2_w 69280201363027
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 15246750464741
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 101448354875586
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 95231552611362
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 93869181839790
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 51720620422047
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 95969183012617
// 054: lxor
// 055: lstore 21
// 057: pop2
// 058: ldc2_w -4195146970087869481
// 05b: lload 2
// 05c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: aload 1
// 062: sipush 23356
// 065: ldc2_w 3181258560193922592
// 068: lload 2
// 069: lxor
// 06a: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/up.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 072: istore 23
// 074: lload 4
// 076: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 079: iload 23
// 07b: ifne 0a3
// 07e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 081: ifnull 0a9
// 084: goto 091
// 087: ldc2_w -4222067117959721653
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: lload 4
// 093: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 096: goto 0a3
// 099: ldc2_w -4222067117959721653
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 0a6: ifnonnull 0b4
// 0a9: return
// 0aa: ldc2_w -4222067117959721653
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: lload 21
// 0b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b9: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 0bc: dup
// 0bd: ifnonnull 0cc
// 0c0: pop
// 0c1: return
// 0c2: ldc2_w -4222067117959721653
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: astore 24
// 0ce: lload 17
// 0d0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d3: aload 0
// 0d4: iload 6
// 0d6: i2b
// 0d7: lload 7
// 0d9: aload 24
// 0db: invokevirtual su/catlean/up.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0de: invokevirtual net/minecraft/class_243.method_10216 ()D
// 0e1: d2i
// 0e2: bipush 4
// 0e3: ishr
// 0e4: aload 0
// 0e5: iload 6
// 0e7: i2b
// 0e8: lload 7
// 0ea: aload 24
// 0ec: invokevirtual su/catlean/up.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0ef: invokevirtual net/minecraft/class_243.method_10215 ()D
// 0f2: d2i
// 0f3: bipush 4
// 0f4: ishr
// 0f5: invokevirtual net/minecraft/class_638.method_8393 (II)Z
// 0f8: iload 23
// 0fa: ifne 154
// 0fd: ifeq 141
// 100: goto 10d
// 103: ldc2_w -4222067117959721653
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: aload 0
// 10e: iload 6
// 110: i2b
// 111: lload 7
// 113: aload 24
// 115: invokevirtual su/catlean/up.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 118: invokevirtual net/minecraft/class_243.method_10214 ()D
// 11b: ldc2_w -60.0
// 11e: dcmpg
// 11f: iload 23
// 121: ifne 16f
// 124: goto 131
// 127: ldc2_w -4222067117959721653
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: ifge 16a
// 134: goto 141
// 137: ldc2_w -4222067117959721653
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 0
// 142: lload 15
// 144: invokespecial su/catlean/up.a (J)Z
// 147: goto 154
// 14a: ldc2_w -4222067117959721653
// 14d: lload 2
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: iload 23
// 156: ifne 16f
// 159: ifeq 16a
// 15c: goto 169
// 15f: ldc2_w -4222067117959721653
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: return
// 16a: aload 24
// 16c: getfield net/minecraft/class_1297.field_5976 Z
// 16f: iload 23
// 171: ifne 199
// 174: ifne 1ae
// 177: goto 184
// 17a: ldc2_w -4222067117959721653
// 17d: lload 2
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: lload 21
// 186: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 189: getfield net/minecraft/class_746.field_5976 Z
// 18c: goto 199
// 18f: ldc2_w -4222067117959721653
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: iload 23
// 19b: ifne 1c7
// 19e: ifeq 1bf
// 1a1: goto 1ae
// 1a4: ldc2_w -4222067117959721653
// 1a7: lload 2
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: fconst_0
// 1af: putstatic su/catlean/up.b F
// 1b2: goto 1bf
// 1b5: ldc2_w -4222067117959721653
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: aload 0
// 1c0: lload 11
// 1c2: invokespecial su/catlean/up.Y (J)F
// 1c5: fconst_1
// 1c6: fcmpg
// 1c7: iload 23
// 1c9: ifne 1dd
// 1cc: ifne 1e0
// 1cf: goto 1dc
// 1d2: ldc2_w -4222067117959721653
// 1d5: lload 2
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: bipush 1
// 1dd: goto 1e1
// 1e0: bipush 0
// 1e1: ifne 1fd
// 1e4: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 1e7: aload 0
// 1e8: lload 11
// 1ea: invokespecial su/catlean/up.Y (J)F
// 1ed: invokevirtual su/catlean/tq.x (F)V
// 1f0: goto 1fd
// 1f3: ldc2_w -4222067117959721653
// 1f6: lload 2
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 200: aload 0
// 201: lload 9
// 203: invokespecial su/catlean/up.i (J)F
// 206: bipush 0
// 207: fconst_0
// 208: lload 19
// 20a: fconst_0
// 20b: fconst_0
// 20c: sipush 26724
// 20f: ldc2_w 2658198370289356599
// 212: lload 2
// 213: lxor
// 214: invokedynamic c (IJ)I bsm=su/catlean/up.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: aconst_null
// 21a: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 21d: astore 25
// 21f: aload 24
// 221: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 224: aload 25
// 226: bipush 0
// 227: daload
// 228: dadd
// 229: dstore 26
// 22b: aload 24
// 22d: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 230: aload 25
// 232: bipush 1
// 233: daload
// 234: dadd
// 235: dstore 28
// 237: lload 17
// 239: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 23c: dload 26
// 23e: d2i
// 23f: bipush 4
// 240: ishr
// 241: dload 28
// 243: d2i
// 244: bipush 4
// 245: ishr
// 246: invokevirtual net/minecraft/class_638.method_8393 (II)Z
// 249: iload 23
// 24b: ifne 2a5
// 24e: ifeq 292
// 251: goto 25e
// 254: ldc2_w -4222067117959721653
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: aload 0
// 25f: iload 6
// 261: i2b
// 262: lload 7
// 264: aload 24
// 266: invokevirtual su/catlean/up.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 269: invokevirtual net/minecraft/class_243.method_10214 ()D
// 26c: ldc2_w -60.0
// 26f: dcmpg
// 270: iload 23
// 272: ifne 2c3
// 275: goto 282
// 278: ldc2_w -4222067117959721653
// 27b: lload 2
// 27c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: athrow
// 282: ifge 2bb
// 285: goto 292
// 288: ldc2_w -4222067117959721653
// 28b: lload 2
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: aload 0
// 293: lload 15
// 295: invokespecial su/catlean/up.a (J)Z
// 298: goto 2a5
// 29b: ldc2_w -4222067117959721653
// 29e: lload 2
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: iload 23
// 2a7: ifne 2c3
// 2aa: ifeq 2bb
// 2ad: goto 2ba
// 2b0: ldc2_w -4222067117959721653
// 2b3: lload 2
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: return
// 2bb: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2be: lload 13
// 2c0: invokevirtual su/catlean/dm.Y (J)Z
// 2c3: ifeq 2ed
// 2c6: aload 24
// 2c8: aload 25
// 2ca: bipush 0
// 2cb: daload
// 2cc: aload 24
// 2ce: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 2d1: invokevirtual net/minecraft/class_243.method_10214 ()D
// 2d4: aload 25
// 2d6: bipush 1
// 2d7: daload
// 2d8: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 2db: iload 23
// 2dd: ifeq 309
// 2e0: goto 2ed
// 2e3: ldc2_w -4222067117959721653
// 2e6: lload 2
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: aload 24
// 2ef: dconst_0
// 2f0: aload 24
// 2f2: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 2f5: invokevirtual net/minecraft/class_243.method_10214 ()D
// 2f8: dconst_0
// 2f9: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 2fc: goto 309
// 2ff: ldc2_w -4222067117959721653
// 302: lload 2
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: getstatic su/catlean/up.m I
// 30c: istore 30
// 30e: iload 30
// 310: bipush 1
// 311: iadd
// 312: putstatic su/catlean/up.m I
// 315: iload 23
// 317: ifne 34e
// 31a: iload 30
// 31c: sipush 7135
// 31f: ldc2_w 7004419502319991946
// 322: lload 2
// 323: lxor
// 324: invokedynamic c (IJ)I bsm=su/catlean/up.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: if_icmple 34a
// 32c: goto 339
// 32f: ldc2_w -4222067117959721653
// 332: lload 2
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: bipush 0
// 33a: putstatic su/catlean/up.m I
// 33d: goto 34a
// 340: ldc2_w -4222067117959721653
// 343: lload 2
// 344: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 349: athrow
// 34a: aload 1
// 34b: invokevirtual su/catlean/api/event/events/player/EventPlayerTravel.cancel ()V
// 34e: ldc2_w -4235641466786030682
// 351: lload 2
// 352: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: ifnull 375
// 35a: iinc 23 1
// 35d: iload 23
// 35f: ldc2_w -4211010242281898278
// 362: lload 2
// 363: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: goto 375
// 36b: ldc2_w -4222067117959721653
// 36e: lload 2
// 36f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: athrow
// 375: return
}

@Flow
public final void w(@NotNull ReceivePacket e) {
long var2 = a ^ 127274788262754L;
int var10000 = vm.a<"Å">(4420017234055159965L, var2);
Intrinsics.checkNotNullParameter(ex, "e");
int var4 = var10000;

try {
if (ex.getPacket() instanceof class_2708) {
b = 0.0F;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 4407143769861764362L, var2);
}

try {
if (var4 == 0) {
vm.a<"Å">(new _g[4], 4395717226183472957L, var2);
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4407143769861764362L, var2);
}
}

private final float i(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/up.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 3046895275922
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 16
// 015: lshl
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 4
// 01c: dup2
// 01d: bipush 48
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 5
// 026: pop2
// 027: dup2
// 028: ldc2_w 14681373608427
// 02b: lxor
// 02c: dup2
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 6
// 033: dup2
// 034: bipush 32
// 036: lshl
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 7
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 101135236295887
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 8
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 9
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 10
// 05e: pop2
// 05f: dup2
// 060: ldc2_w 37836488066968
// 063: lxor
// 064: lstore 11
// 066: pop2
// 067: getstatic su/catlean/up.b F
// 06a: ldc 20.0
// 06c: aload 0
// 06d: iload 8
// 06f: i2c
// 070: iload 9
// 072: iload 10
// 074: i2c
// 075: invokespecial su/catlean/up.I (CIC)F
// 078: fsub
// 079: aload 0
// 07a: iload 3
// 07b: i2c
// 07c: iload 4
// 07e: iload 5
// 080: i2c
// 081: invokespecial su/catlean/up.L (CIC)F
// 084: fdiv
// 085: fadd
// 086: fstore 15
// 088: fload 15
// 08a: fstore 16
// 08c: bipush 0
// 08d: istore 17
// 08f: getstatic su/catlean/up.g Lsu/catlean/up;
// 092: pop
// 093: fload 16
// 095: putstatic su/catlean/up.b F
// 098: nop
// 099: fload 15
// 09b: ldc 100.0
// 09d: fdiv
// 09e: f2d
// 09f: dstore 15
// 0a1: ldc2_w 2594118186005264842
// 0a4: lload 1
// 0a5: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: aload 0
// 0ab: iload 3
// 0ac: i2c
// 0ad: iload 4
// 0af: iload 5
// 0b1: i2c
// 0b2: invokespecial su/catlean/up.L (CIC)F
// 0b5: f2d
// 0b6: dstore 17
// 0b8: dload 15
// 0ba: dload 17
// 0bc: invokestatic java/lang/Math.min (DD)D
// 0bf: d2f
// 0c0: fstore 14
// 0c2: istore 13
// 0c4: aload 0
// 0c5: iload 13
// 0c7: ifeq 0ef
// 0ca: iload 6
// 0cc: iload 7
// 0ce: invokespecial su/catlean/up.T (II)Z
// 0d1: ifne 0fb
// 0d4: goto 0e1
// 0d7: ldc2_w 2629670177299541085
// 0da: lload 1
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 0
// 0e2: goto 0ef
// 0e5: ldc2_w 2629670177299541085
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: iload 3
// 0f0: i2c
// 0f1: iload 4
// 0f3: iload 5
// 0f5: i2c
// 0f6: invokespecial su/catlean/up.L (CIC)F
// 0f9: fstore 14
// 0fb: fload 14
// 0fd: getstatic su/catlean/up.m I
// 100: sipush 31409
// 103: ldc2_w 6595797972499692784
// 106: lload 1
// 107: lxor
// 108: invokedynamic c (IJ)I bsm=su/catlean/up.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: if_icmple 123
// 110: aload 0
// 111: lload 11
// 113: invokespecial su/catlean/up.R (J)F
// 116: goto 124
// 119: ldc2_w 2629670177299541085
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: fconst_0
// 124: fadd
// 125: fstore 14
// 127: fload 14
// 129: freturn
}

private static final boolean G() {
long var0 = a ^ 28304884741481L;
int var2 = (int)((var0 ^ 72406283761335L) >>> 32);
int var3 = (int)((var0 ^ 72406283761335L) << 32 >>> 32);
return g.T(var2, var3);
}

static {
long var20 = a ^ 101681660103506L;
long var22 = var20 ^ 47078580055179L;
long var10001 = var20 ^ 17119753080180L;
int var24 = (int)((var20 ^ 17119753080180L) >>> 32);
int var25 = (int)((var20 ^ 17119753080180L) << 32 >>> 48);
int var26 = (int)(var10001 << 48 >>> 48);
long var27 = var20 ^ 29527692108485L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[20];
int var16 = 0;
String var15 = "í\u008en[vwï~øEü@\u0002¾ö\u0093\u0016¿Î±\u0017êj²\\17ym\u0007¯\u0000Â\u0097o@ãªìø ÀO|ÏO@\u001d\tÆ\u0019Y~\u0084ðí³99\u008d\u0080\u001bX\u0019W³º\u008a\u0007\u008dvP\u0018 N\u008dâ\u008d3ÉJÓÄÒ¾\u009b`c²Lu\u00176\u00ad\u008dz)õ%í_\u008aýþXÏ\u0010×ð\u008eq\u001d\u001f0üà·\u0092·<\b\u0090I(\f\u001d_w\u008aÀ+\u0090ý\u009f\u0013òÀá¼c~\u0007£¦Ó\u0013³Ðßó¦pwVt\u009c\rah¡\u009em;ö\u00100K\u000ebå_zûdøîÀ\u0004\u0093¹ä07À\u008bàBÂ\u009ch¦6\u0011Ó('û\u001bßÂ\u0014\u009bÖ^uu \u0093\u008d¥\u0096Á\u008eAÔä\u0085ÏäpUgJû\u0004àÔê}r ÞÐ©÷ß\u0096+B:\u0098v}\u000b¦!ËI1\u00ad\u000b8¯\u000fR¡6\u001b¹\u000fÖ\u009c9\u0010F»ðI RÂ?4>:\u00165q¼^ lFª#\u000e\u0082õ$íx\u000b\u0097¨üñl¯\u0092µp\u0091zò\u0000\u0011\u0018¾\u0091þ\u0093A\u001f(\u0092<¿µ\u008c\rmQ9Èê\u001e\u0002ÿÀ\rAÚs\u0088\"Ø[¾®rGSLÒ\u0094\u001b»ä§SµM\\Á(/X¯ç`çe¢\u0094I(C\u0081²\u001f<½\u0090\u00850B1oÂ>§\u0087N5ØIá\u000e\u0001ü\u0005\u0006&Ã\u0089 o³ê(Å¹ùPaÊ\u0090#6È:\u0019¾_<\fOJ):\n¥Ý\u001aBNZ´\u0010\u0091%}¼Wµ3Ë;\u000f0]\u0090b-m\u0018t1\u0007'R}åëßÃN\u009f\u001cÅ±P>\u0085\r·\u0093cxµ\u0010F¶B¯ Þ¶ºÀx<¹E\u0013»î\u0010n\u0081qUö85\u001e\u0086/\u009a\u0084\u009dË;\u008e òÁW\u0013]ZJ9+N×av¾lög§\u009aÌûa´ q~\u008eú\u001e°ø®";
int var17 = "í\u008en[vwï~øEü@\u0002¾ö\u0093\u0016¿Î±\u0017êj²\\17ym\u0007¯\u0000Â\u0097o@ãªìø ÀO|ÏO@\u001d\tÆ\u0019Y~\u0084ðí³99\u008d\u0080\u001bX\u0019W³º\u008a\u0007\u008dvP\u0018 N\u008dâ\u008d3ÉJÓÄÒ¾\u009b`c²Lu\u00176\u00ad\u008dz)õ%í_\u008aýþXÏ\u0010×ð\u008eq\u001d\u001f0üà·\u0092·<\b\u0090I(\f\u001d_w\u008aÀ+\u0090ý\u009f\u0013òÀá¼c~\u0007£¦Ó\u0013³Ðßó¦pwVt\u009c\rah¡\u009em;ö\u00100K\u000ebå_zûdøîÀ\u0004\u0093¹ä07À\u008bàBÂ\u009ch¦6\u0011Ó('û\u001bßÂ\u0014\u009bÖ^uu \u0093\u008d¥\u0096Á\u008eAÔä\u0085ÏäpUgJû\u0004àÔê}r ÞÐ©÷ß\u0096+B:\u0098v}\u000b¦!ËI1\u00ad\u000b8¯\u000fR¡6\u001b¹\u000fÖ\u009c9\u0010F»ðI RÂ?4>:\u00165q¼^ lFª#\u000e\u0082õ$íx\u000b\u0097¨üñl¯\u0092µp\u0091zò\u0000\u0011\u0018¾\u0091þ\u0093A\u001f(\u0092<¿µ\u008c\rmQ9Èê\u001e\u0002ÿÀ\rAÚs\u0088\"Ø[¾®rGSLÒ\u0094\u001b»ä§SµM\\Á(/X¯ç`çe¢\u0094I(C\u0081²\u001f<½\u0090\u00850B1oÂ>§\u0087N5ØIá\u000e\u0001ü\u0005\u0006&Ã\u0089 o³ê(Å¹ùPaÊ\u0090#6È:\u0019¾_<\fOJ):\n¥Ý\u001aBNZ´\u0010\u0091%}¼Wµ3Ë;\u000f0]\u0090b-m\u0018t1\u0007'R}åëßÃN\u009f\u001cÅ±P>\u0085\r·\u0093cxµ\u0010F¶B¯ Þ¶ºÀx<¹E\u0013»î\u0010n\u0081qUö85\u001e\u0086/\u009a\u0084\u009dË;\u008e òÁW\u0013]ZJ9+N×av¾lög§\u009aÌûa´ q~\u008eú\u001e°ø®"
.length();
char var14 = '(';
int var32 = -1;

label54:
while (true) {
String var33 = var15.substring(++var32, var32 + var14);
byte var37 = -1;

while (true) {
byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var37) {
case 0:
var18[var16++] = var45;
if ((var32 += var14) >= var17) {
d = var18;
e = new String[20];
k = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "\fYè\u0002_hn\u0012ï\u0093`\u0096\u0083t¡½Nü³\u0087\u0010¡¬viÆ|\u0099¨\u0007þÒI\u0000\u0018¤[\u00075û:Jì\u0083öþ ~\u000f\u009d\u0099!C\u0081\u0016]";
int var5 = "\fYè\u0002_hn\u0012ï\u0093`\u0096\u0083t¡½Nü³\u0087\u0010¡¬viÆ|\u0099¨\u0007þÒI\u0000\u0018¤[\u00075û:Jì\u0083öþ ~\u000f\u009d\u0099!C\u0081\u0016]"
.length();
byte var2 = 0;

label36:
while (true) {
byte var41 = var2;
var2 += 8;
byte[] var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
long[] var36 = var6;
int var42 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var36[var42] = var54;
if (var2 >= var5) {
h = var6;
i = new Integer[9];
KProperty[] var29 = new KProperty[c<"c">(17433, 3165710426612941624L ^ var20)];
var29[0] = Reflection.property1(new PropertyReference1Impl(up.class, b<"k">(4726, 469174697877909269L ^ var20), b<"k">(10685, 5095543389195637973L ^ var20), 0));
var29[1] = Reflection.property1(new PropertyReference1Impl(up.class, b<"k">(11969, 4461914701461132195L ^ var20), b<"k">(838, 9044296045026557472L ^ var20), 0));
var29[2] = Reflection.property1(new PropertyReference1Impl(up.class, b<"k">(29347, 8565538880336285640L ^ var20), b<"k">(8673, 699932758500449416L ^ var20), 0));
var29[3] = Reflection.property1(new PropertyReference1Impl(up.class, b<"k">(965, 8774694414646853282L ^ var20), b<"k">(23580, 2901724854488359289L ^ var20), 0));
var29[4] = Reflection.property1(
new PropertyReference1Impl(up.class, b<"k">(18121, 3647111886026767270L ^ var20), b<"k">(22626, 109646044093670658L ^ var20), 0)
);
var29[5] = Reflection.property1(
new PropertyReference1Impl(up.class, b<"k">(1099, 1811900527202679097L ^ var20), b<"k">(10065, 2044356432241334845L ^ var20), 0)
);
L = var29;
g = new up(var24, (char)var25, var26);
D = yp.t(g, b<"k">(14308, 3756544403314576023L ^ var20), true, var27, null, null, c<"c">(17859, 3892977566135927520L ^ var20), null);
u = yp.k(
g, b<"k">(18179, 7651923009816296039L ^ var20), 9.0F, var22, RangesKt.rangeTo(0.0F, 20.0F), null, up::G, c<"c">(3230, 970912704021531573L ^ var20), null
);
c = yp.t(g, b<"k">(22934, 2013088130472010983L ^ var20), true, var27, null, null, c<"c">(10962, 388320228929613298L ^ var20), null);
X = yp.k(
g, b<"k">(16611, 414642118952517001L ^ var20), 0.77F, var22, RangesKt.rangeTo(0.1F, 5.0F), null, null, c<"c">(5618, 6316784998805017303L ^ var20), null
);
A = yp.k(
g, b<"k">(29548, 6918240721862938140L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.1F, 5.0F), null, null, c<"c">(3000, 3439245920173624479L ^ var20), null
);
j = yp.k(
g, b<"k">(14904, 8838504042049111897L ^ var20), 0.05F, var22, RangesKt.rangeTo(0.0F, 0.5F), null, null, c<"c">(3000, 3439245920173624479L ^ var20), null
);
return;
}
break;
default:
var36[var42] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "z\u008eKãc¯¿\u001fb\u00915\u008b\u0015.3\u0007";
var5 = "z\u008eKãc¯¿\u001fb\u00915\u008b\u0015.3\u0007".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var36 = var6;
var42 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var45;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label54;
}

var15 = "RC\u001c¦¨GH·'Cz\fö4&À\u0018\u001añº\u0014\u008a\u008aíõ\u0016í&f\u0089\u008c\u0087ÓyB\"¥²\u009c3r";
var17 = "RC\u001c¦¨GH·'Cz\fö4&À\u0018\u001añº\u0014\u008a\u008aíõ\u0016í&f\u0089\u008c\u0087ÓyB\"¥²\u009c3r".length();
var14 = 16;
var32 = -1;
}

var33 = var15.substring(++var32, var32 + var14);
var37 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6517;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/up", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/up" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9012;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/up", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/up" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
