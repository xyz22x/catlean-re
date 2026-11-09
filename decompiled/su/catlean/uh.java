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
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class uh extends _g {
@NotNull
public static final uh V;
@NotNull
private static final cq E;
@NotNull
private static final ct l;
@NotNull
private static final cq d;
@NotNull
private static final ct n;
@NotNull
private static final ct g;
private static float t;
private static float D;
private static int J;
@Nullable
private static class_243 S;
private static final long a = yz.a(122228354191651993L, -3358765337760580810L, MethodHandles.lookup().lookupClass()).a(116281293856565L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

private uh(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 127030015165050L;
super(b<"t">(20811, 747699906193913553L ^ var1), jt.V(), null, 4, null, var3);
}

private final boolean n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 42085952628165L;
return (Boolean)E.E(this, var3, i[0]);
}

private final float K(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 18122593981144L;
return ((Number)l.E(this, var3, i[1])).floatValue();
}

private final boolean a(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 36909373937399L;
return (Boolean)d.E(this, var6, i[2]);
}

private final float E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 51489257237641L;
return ((Number)n.E(this, var3, i[3])).floatValue();
}

private final float z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 136013499573708L;
return ((Number)g.E(this, var3, i[4])).floatValue();
}

@Flow
public final void N(@NotNull MoveEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uh.a J
// 003: ldc2_w 56976836810457
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 103100892886612
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 16640041363087
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
// 027: ldc2_w 109307794114565
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 121462657816617
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 119224882144910
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 9506216492817
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 38071556656687
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 40354968180659
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
// 06b: ldc2_w 113678867790149
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 30578522447617
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 90713616600106
// 07c: lxor
// 07d: dup2
// 07e: bipush 48
// 080: lushr
// 081: l2i
// 082: istore 26
// 084: dup2
// 085: bipush 16
// 087: lshl
// 088: bipush 32
// 08a: lushr
// 08b: l2i
// 08c: istore 27
// 08e: dup2
// 08f: bipush 48
// 091: lshl
// 092: bipush 48
// 094: lushr
// 095: l2i
// 096: istore 28
// 098: pop2
// 099: dup2
// 09a: ldc2_w 72735774709119
// 09d: lxor
// 09e: lstore 29
// 0a0: dup2
// 0a1: ldc2_w 93835048402712
// 0a4: lxor
// 0a5: lstore 31
// 0a7: pop2
// 0a8: ldc2_w 8413062712000731557
// 0ab: lload 2
// 0ac: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: aload 1
// 0b2: ldc "e"
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: astore 33
// 0b9: getstatic su/catlean/uh.S Lnet/minecraft/class_243;
// 0bc: aload 33
// 0be: ifnull 0f2
// 0c1: ifnull 133
// 0c4: goto 0d1
// 0c7: ldc2_w 8384299991183925177
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 0
// 0d2: lload 13
// 0d4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d7: iload 6
// 0d9: i2b
// 0da: swap
// 0db: lload 7
// 0dd: dup2_x1
// 0de: pop2
// 0df: checkcast net/minecraft/class_1297
// 0e2: invokevirtual su/catlean/uh.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0e5: goto 0f2
// 0e8: ldc2_w 8384299991183925177
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: getstatic su/catlean/uh.S Lnet/minecraft/class_243;
// 0f5: dup
// 0f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f9: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0fc: aload 0
// 0fd: lload 15
// 0ff: invokespecial su/catlean/uh.z (J)F
// 102: aload 0
// 103: lload 15
// 105: invokespecial su/catlean/uh.z (J)F
// 108: fmul
// 109: f2d
// 10a: dcmpl
// 10b: aload 33
// 10d: ifnull 14d
// 110: ifle 133
// 113: goto 120
// 116: ldc2_w 8384299991183925177
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: aload 0
// 121: lload 29
// 123: invokevirtual su/catlean/uh.d (J)V
// 126: goto 133
// 129: ldc2_w 8384299991183925177
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 136: aload 33
// 138: ifnull 37c
// 13b: lload 22
// 13d: invokevirtual su/catlean/dm.Y (J)Z
// 140: goto 14d
// 143: ldc2_w 8384299991183925177
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: ifeq 367
// 150: aload 0
// 151: lload 31
// 153: invokespecial su/catlean/uh.n (J)Z
// 156: aload 33
// 158: ifnull 194
// 15b: goto 168
// 15e: ldc2_w 8384299991183925177
// 161: lload 2
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: ifeq 191
// 16b: goto 178
// 16e: ldc2_w 8384299991183925177
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 17b: aload 0
// 17c: lload 9
// 17e: invokespecial su/catlean/uh.K (J)F
// 181: invokevirtual su/catlean/tq.x (F)V
// 184: goto 191
// 187: ldc2_w 8384299991183925177
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: getstatic su/catlean/uh.J I
// 194: aload 33
// 196: ifnull 2a4
// 199: tableswitch 246 0 2 37 117 199
// 1b4: ldc2_w 8384299991183925177
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: aload 0
// 1bf: lload 4
// 1c1: invokespecial su/catlean/uh.E (J)F
// 1c4: f2d
// 1c5: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1c8: lload 17
// 1ca: invokevirtual su/catlean/dm.a (J)D
// 1cd: dmul
// 1ce: d2f
// 1cf: putstatic su/catlean/uh.t F
// 1d2: fconst_0
// 1d3: putstatic su/catlean/uh.D F
// 1d6: getstatic su/catlean/uh.J I
// 1d9: bipush 1
// 1da: iadd
// 1db: putstatic su/catlean/uh.J I
// 1de: getstatic su/catlean/uh.J I
// 1e1: pop
// 1e2: aload 33
// 1e4: ifnonnull 367
// 1e7: goto 1f4
// 1ea: ldc2_w 8384299991183925177
// 1ed: lload 2
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: bipush 3
// 1f5: anewarray 311
// 1f8: ldc2_w 8414667058257362683
// 1fb: lload 2
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: goto 20e
// 204: ldc2_w 8384299991183925177
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: lload 13
// 210: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 213: lload 13
// 215: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 218: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 21b: invokevirtual net/minecraft/class_243.method_10216 ()D
// 21e: ldc2_w 0.42
// 221: aload 0
// 222: lload 24
// 224: invokespecial su/catlean/uh.p (J)F
// 227: f2d
// 228: dadd
// 229: lload 13
// 22b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22e: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 231: invokevirtual net/minecraft/class_243.method_10215 ()D
// 234: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 237: aload 1
// 238: ldc2_w 0.42
// 23b: aload 0
// 23c: lload 24
// 23e: invokespecial su/catlean/uh.p (J)F
// 241: f2d
// 242: dadd
// 243: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 246: getstatic su/catlean/uh.t F
// 249: ldc 2.149
// 24b: fmul
// 24c: putstatic su/catlean/uh.t F
// 24f: getstatic su/catlean/uh.J I
// 252: bipush 1
// 253: iadd
// 254: putstatic su/catlean/uh.J I
// 257: getstatic su/catlean/uh.J I
// 25a: pop
// 25b: aload 33
// 25d: ifnonnull 367
// 260: ldc 0.66
// 262: f2d
// 263: getstatic su/catlean/uh.D F
// 266: f2d
// 267: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 26a: lload 17
// 26c: invokevirtual su/catlean/dm.a (J)D
// 26f: dsub
// 270: dmul
// 271: dstore 34
// 273: getstatic su/catlean/uh.D F
// 276: f2d
// 277: dload 34
// 279: dsub
// 27a: d2f
// 27b: putstatic su/catlean/uh.t F
// 27e: getstatic su/catlean/uh.J I
// 281: bipush 1
// 282: iadd
// 283: putstatic su/catlean/uh.J I
// 286: getstatic su/catlean/uh.J I
// 289: pop
// 28a: aload 33
// 28c: ifnonnull 367
// 28f: lload 13
// 291: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 294: getfield net/minecraft/class_746.field_5992 Z
// 297: goto 2a4
// 29a: ldc2_w 8384299991183925177
// 29d: lload 2
// 29e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a3: athrow
// 2a4: aload 33
// 2a6: ifnull 32a
// 2a9: ifne 311
// 2ac: goto 2b9
// 2af: ldc2_w 8384299991183925177
// 2b2: lload 2
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: lload 11
// 2bb: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2be: lload 13
// 2c0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c3: checkcast net/minecraft/class_1297
// 2c6: lload 13
// 2c8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2cb: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 2ce: ldc2_w -0.2
// 2d1: lload 13
// 2d3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2d6: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2d9: invokevirtual net/minecraft/class_243.method_10214 ()D
// 2dc: ldc2_w -0.2
// 2df: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 2e2: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 2e5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2ea: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ef: aload 33
// 2f1: ifnull 32a
// 2f4: goto 301
// 2f7: ldc2_w 8384299991183925177
// 2fa: lload 2
// 2fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 300: athrow
// 301: ifeq 35a
// 304: goto 311
// 307: ldc2_w 8384299991183925177
// 30a: lload 2
// 30b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: athrow
// 311: aload 0
// 312: iload 26
// 314: i2c
// 315: iload 27
// 317: iload 28
// 319: i2c
// 31a: invokespecial su/catlean/uh.a (CIC)Z
// 31d: goto 32a
// 320: ldc2_w 8384299991183925177
// 323: lload 2
// 324: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: athrow
// 32a: aload 33
// 32c: ifnull 353
// 32f: ifeq 352
// 332: goto 33f
// 335: ldc2_w 8384299991183925177
// 338: lload 2
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: aload 0
// 340: lload 29
// 342: invokevirtual su/catlean/uh.d (J)V
// 345: goto 352
// 348: ldc2_w 8384299991183925177
// 34b: lload 2
// 34c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 351: athrow
// 352: bipush 0
// 353: putstatic su/catlean/uh.J I
// 356: fconst_0
// 357: putstatic su/catlean/uh.D F
// 35a: getstatic su/catlean/uh.D F
// 35d: getstatic su/catlean/uh.D F
// 360: ldc 159.0
// 362: fdiv
// 363: fsub
// 364: putstatic su/catlean/uh.t F
// 367: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 36a: lload 17
// 36c: invokevirtual su/catlean/dm.a (J)D
// 36f: d2f
// 370: getstatic su/catlean/uh.t F
// 373: invokestatic java/lang/Math.max (FF)F
// 376: putstatic su/catlean/uh.t F
// 379: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 37c: iload 19
// 37e: iload 20
// 380: i2s
// 381: aload 1
// 382: getstatic su/catlean/uh.t F
// 385: f2d
// 386: iload 21
// 388: i2c
// 389: dup_x2
// 38a: pop
// 38b: invokevirtual su/catlean/dm.Y (ISLsu/catlean/api/event/events/player/MoveEvent;CD)V
// 38e: aload 1
// 38f: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 392: return
}

@Flow
public final void e(@NotNull ReceivePacket e) {
long var2 = a ^ 47167855835037L;
long var4 = var2 ^ 100128393753659L;

try {
Intrinsics.checkNotNullParameter(ex, "e");
if (ex.getPacket() instanceof class_2708) {
this.d(var4);
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -7701404555136663811L, var2);
}
}

@Override
public void O(long var1) {
long var3 = var1 ^ 41571510600469L;
this.Z(var3);
}

private final void Z(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uh.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 100037299640426
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 27570695116365
// 11: lxor
// 12: dup2
// 13: bipush 56
// 15: lushr
// 16: l2i
// 17: istore 5
// 19: dup2
// 1a: bipush 8
// 1c: lshl
// 1d: bipush 8
// 1f: lushr
// 20: lstore 6
// 22: pop2
// 23: dup2
// 24: ldc2_w 134545051719244
// 27: lxor
// 28: lstore 8
// 2a: pop2
// 2b: ldc2_w 4900802357603821927
// 2e: lload 1
// 2f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: astore 10
// 36: aload 10
// 38: ifnull 80
// 3b: lload 3
// 3c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 42: ifnonnull 5d
// 45: goto 52
// 48: ldc2_w 4943002246094270331
// 4b: lload 1
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: return
// 53: ldc2_w 4943002246094270331
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 0
// 5e: lload 8
// 60: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 63: iload 5
// 65: i2b
// 66: swap
// 67: lload 6
// 69: dup2_x1
// 6a: pop2
// 6b: checkcast net/minecraft/class_1297
// 6e: invokevirtual su/catlean/uh.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 71: putstatic su/catlean/uh.S Lnet/minecraft/class_243;
// 74: fconst_0
// 75: putstatic su/catlean/uh.t F
// 78: fconst_0
// 79: putstatic su/catlean/uh.D F
// 7c: bipush 0
// 7d: putstatic su/catlean/uh.J I
// 80: return
}

private final float p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23546813700791L;

try {
if (zf.v(var3).method_6059(class_1294.field_5913)) {
return 0.2F;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -8619188821824838784L, var1);
}

return 0.0F;
}

@Flow
public final void r(@NotNull PreSyncEvent eventSync) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uh.a J
// 03: ldc2_w 64283411759459
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 121793419046655
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 137838678049856
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 111917809905972
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 7168387349377797663
// 22: lload 2
// 23: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: aload 1
// 29: sipush 30125
// 2c: ldc2_w 2646087309748789953
// 2f: lload 2
// 30: lxor
// 31: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/uh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 39: astore 10
// 3b: aload 10
// 3d: ifnull 8e
// 40: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 43: lload 4
// 45: invokevirtual su/catlean/dm.Y (J)Z
// 48: ifeq 93
// 4b: goto 58
// 4e: ldc2_w 7197048855129884675
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: lload 8
// 5a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5d: invokevirtual net/minecraft/class_746.method_23317 ()D
// 60: lload 8
// 62: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 65: getfield net/minecraft/class_746.field_6014 D
// 68: dsub
// 69: lload 8
// 6b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6e: invokevirtual net/minecraft/class_746.method_23321 ()D
// 71: lload 8
// 73: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 76: getfield net/minecraft/class_746.field_5969 D
// 79: dsub
// 7a: invokestatic java/lang/Math.hypot (DD)D
// 7d: d2f
// 7e: putstatic su/catlean/uh.D F
// 81: goto 8e
// 84: ldc2_w 7197048855129884675
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 10
// 90: ifnonnull a6
// 93: aload 0
// 94: lload 6
// 96: invokespecial su/catlean/uh.Z (J)V
// 99: goto a6
// 9c: ldc2_w 7197048855129884675
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: ldc2_w 7136736489564568987
// a9: lload 2
// aa: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: ifnull ca
// b2: ldc "oxTDcc"
// b4: ldc2_w 7163213073872731619
// b7: lload 2
// b8: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bd: goto ca
// c0: ldc2_w 7197048855129884675
// c3: lload 2
// c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c9: athrow
// ca: return
}

private static final boolean e() {
long var0 = a ^ 55241200621654L;
long var2 = var0 ^ 93164291994007L;
return V.n(var2);
}

static {
long var20 = a ^ 10963638679047L;
long var22 = var20 ^ 100354663883940L;
long var24 = var20 ^ 107613413612963L;
long var26 = var20 ^ 89971358274541L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[17];
int var16 = 0;
String var15 = "\u009aîjÖ®:Ë\u0095ø`tá±aþÅ\u0018\u009dP-ê¿\u0014ý³ðA3ð\u0088vç±¶\u001b¶ÇQ\u001bãC(§@°DÑÞ®7\u008d\u0018JÅÍ\u0006¾Õj@\u009ec\u008c\u00ad«,þ½ÍNóX!_9/K£nz¨û \u0014^¬uGÌM=s1SypkLW>Ù'\u0015V¯lwåþoëÚQZ\u0095 §\u0006>\"¿_\u0087«\u0096U\u009d\u00137\u0005\u0002tªfsR¤\rY¨E\u001cÎîý4L\u001e B\u0081¨\u0003è|0þ9J 0\u009e\u00adÿÙÝ\u0096,\u001bÌm~Þ\u0012\u0006æ\u008aÕú\u0001Ã \u009bFOïÆ!\"\"Âcªgø°Á\u0001\u0006ó¯¦=¾\u008e¸ñ\u0087YÅ¡dS¥\u0010\u001f\\ê\u0091z<~k\u0090kXY\u0018£9å Ê=Á\u00024ì\u0097tþ\u0080Wéd\u009bR\u0005\u0093°·Xx\u001b~ÎËê~uµï\u008f\u0087 \u001b\u0085\b¶éíl¶\u0005´H\u0099.\u0018]\u009d÷ã¸º\\K¯\f\u0088\u0006O!Ò\u000e,\n \u0004\u0007y·eçÅ Ò\u0080'%ò¿îg@aÔ²\u0098¦*©\u0005çN\u0080\u0000=¥í mR±5R\u0003\bµ¤\u0080ÍE]¬\u001b\u008d\u001aÇeu\u001eÙ¹ä\u0080ü\u0095\u0091v\u0080.~(´Õ\u0005ÈþÓ×'KåhòGé¹\u0016\u0088E\\§p #\u001bT\u008b§×E¸\u009eJ\u00130ÃþÓ\u008c`< \u0014u-îØö[nÓ-\u0016\u0004\u0014\nþ·`Jäð²6\u0014\nÄ\u009b@´b\u000e\u0016K\u0010ì,Ç\u0092 ÍIWR\u000eÌ5j¤Ýï";
int var17 = "\u009aîjÖ®:Ë\u0095ø`tá±aþÅ\u0018\u009dP-ê¿\u0014ý³ðA3ð\u0088vç±¶\u001b¶ÇQ\u001bãC(§@°DÑÞ®7\u008d\u0018JÅÍ\u0006¾Õj@\u009ec\u008c\u00ad«,þ½ÍNóX!_9/K£nz¨û \u0014^¬uGÌM=s1SypkLW>Ù'\u0015V¯lwåþoëÚQZ\u0095 §\u0006>\"¿_\u0087«\u0096U\u009d\u00137\u0005\u0002tªfsR¤\rY¨E\u001cÎîý4L\u001e B\u0081¨\u0003è|0þ9J 0\u009e\u00adÿÙÝ\u0096,\u001bÌm~Þ\u0012\u0006æ\u008aÕú\u0001Ã \u009bFOïÆ!\"\"Âcªgø°Á\u0001\u0006ó¯¦=¾\u008e¸ñ\u0087YÅ¡dS¥\u0010\u001f\\ê\u0091z<~k\u0090kXY\u0018£9å Ê=Á\u00024ì\u0097tþ\u0080Wéd\u009bR\u0005\u0093°·Xx\u001b~ÎËê~uµï\u008f\u0087 \u001b\u0085\b¶éíl¶\u0005´H\u0099.\u0018]\u009d÷ã¸º\\K¯\f\u0088\u0006O!Ò\u000e,\n \u0004\u0007y·eçÅ Ò\u0080'%ò¿îg@aÔ²\u0098¦*©\u0005çN\u0080\u0000=¥í mR±5R\u0003\bµ¤\u0080ÍE]¬\u001b\u008d\u001aÇeu\u001eÙ¹ä\u0080ü\u0095\u0091v\u0080.~(´Õ\u0005ÈþÓ×'KåhòGé¹\u0016\u0088E\\§p #\u001bT\u008b§×E¸\u009eJ\u00130ÃþÓ\u008c`< \u0014u-îØö[nÓ-\u0016\u0004\u0014\nþ·`Jäð²6\u0014\nÄ\u009b@´b\u000e\u0016K\u0010ì,Ç\u0092 ÍIWR\u000eÌ5j¤Ýï"
.length();
char var14 = 16;
int var31 = -1;

label55:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[17];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[5];
int var4 = 0;
String var5 = "y\u0088¹\u0014\b\u001b½}öÈÊ\u008fÊ¾Äü7\u007fõÇP2À\u0083";
int var6 = "y\u0088¹\u0014\b\u001b½}öÈÊ\u008fÊ¾Äü7\u007fõÇP2À\u0083".length();
byte var3 = 0;

label37:
while (true) {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var35 = var0;
var10001 = var4++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var35[var10001] = var52;
if (var3 >= var6) {
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(uh.class, b<"t">(16141, 7190583929230335750L ^ var20), b<"t">(21208, 6461406501070435034L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uh.class, b<"t">(25128, 7295091983483945512L ^ var20), b<"t">(27012, 6336223684286368133L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uh.class, b<"t">(25416, 3498928686009860955L ^ var20), b<"t">(24028, 6214384147336854995L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uh.class, b<"t">(28188, 3175408167527632401L ^ var20), b<"t">(27835, 1326776824306093237L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uh.class, b<"t">(20, 2169439435183759389L ^ var20), b<"t">(24115, 4734103100906700351L ^ var20), 0))
};
i = var28;
V = new uh(var22);
E = yp.t(V, b<"t">(14138, 4322574059651897150L ^ var20), false, var26, null, null, (int)var0[1], null);
l = yp.k(V, b<"t">(30556, 6870306816653514582L ^ var20), 1.0F, var24, RangesKt.rangeTo(0.5F, 3.0F), null, uh::e, (int)var0[0], null);
d = yp.t(V, b<"t">(16611, 3500026732602319078L ^ var20), true, var26, null, null, (int)var0[3], null);
n = yp.k(V, b<"t">(13246, 4549977474075792317L ^ var20), 1.35F, var24, RangesKt.rangeTo(0.1F, 10.0F), null, null, (int)var0[4], null);
g = yp.k(V, b<"t">(29212, 4379698137796137499L ^ var20), 10.0F, var24, RangesKt.rangeTo(5.0F, 40.0F), null, null, (int)var0[2], null);
return;
}
break;
default:
var35[var10001] = var52;
if (var3 < var6) {
continue label37;
}

var5 = "°¨ò¼\t\u0080¡\u008a{¨,\u001a<Y½Ö";
var6 = "°¨ò¼\t\u0080¡\u008a{¨,\u001a<Y½Ö".length();
var3 = 0;
}

byte var41 = var3;
var3 += 8;
var7 = var5.substring(var41, var3).getBytes("ISO-8859-1");
var35 = var0;
var10001 = var4++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var43;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label55;
}

var15 = "\u000eó\u0083á¦ª\u001b\u0094(cÒ\u009bÍ£Þ~`]S\f4\fÉÜ\u0097ðÝ\u0099\u001c\\µ-oÚNùê¾¿\u0001ív\u009f\u0098+òÄµ \fkûZÊ\u001b|\u0017×âK:\u0098\rÊí!\rèé¾äîÛ³\u000e2Ã\u00133Êî";
var17 = "\u000eó\u0083á¦ª\u001b\u0094(cÒ\u009bÍ£Þ~`]S\f4\fÉÜ\u0097ðÝ\u0099\u001c\\µ-oÚNùê¾¿\u0001ív\u009f\u0098+òÄµ \fkûZÊ\u001b|\u0017×âK:\u0098\rÊí!\rèé¾äîÛ³\u000e2Ã\u00133Êî"
.length();
var14 = '0';
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30012;
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
throw new RuntimeException("su/catlean/uh", var10);
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
throw new RuntimeException("su/catlean/uh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
