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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2378;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e9 extends _g {
@NotNull
public static final e9 k;
static final KProperty[] P;
@NotNull
private static final cw J;
@NotNull
private static final cq u;
@NotNull
private static final cq S;
@NotNull
private static final cq L;
private static final long a = yz.a(4988594446482109599L, 1743809862500794472L, MethodHandles.lookup().lookupClass()).a(269193059696458L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private e9(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 120928454989288L;
super(b<"y">(9431, 8614772067324858558L ^ var1), jt.v(), null, 4, null, var3);
}

private final s2 I(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 36805076087774L;
return (s2)J.E(this, var6, P[0]);
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 85229461290945L;
return (Boolean)u.E(this, var3, P[1]);
}

private final boolean r(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 59966546400598L;
return (Boolean)S.E(this, var6, P[2]);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 9161832934112L;
return (Boolean)L.E(this, var3, P[3]);
}

@Flow
private final void M(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e9.a J
// 003: ldc2_w 20266590946922
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 111620837756361
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 97564889428704
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 110106262101816
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: dup2
// 03d: bipush 48
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 98986732257198
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 100035020562574
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 86357609561002
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 34265648739759
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 127368487106992
// 067: lxor
// 068: dup2
// 069: bipush 32
// 06b: lushr
// 06c: l2i
// 06d: istore 20
// 06f: dup2
// 070: bipush 32
// 072: lshl
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 21
// 079: dup2
// 07a: bipush 48
// 07c: lshl
// 07d: bipush 48
// 07f: lushr
// 080: l2i
// 081: istore 22
// 083: pop2
// 084: dup2
// 085: ldc2_w 76009274885103
// 088: lxor
// 089: lstore 23
// 08b: dup2
// 08c: ldc2_w 41851703023281
// 08f: lxor
// 090: lstore 25
// 092: pop2
// 093: ldc2_w -7981867289320466095
// 096: lload 2
// 097: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: astore 27
// 09e: aload 0
// 09f: lload 14
// 0a1: invokespecial su/catlean/e9.Y (J)Z
// 0a4: aload 27
// 0a6: ifnonnull 170
// 0a9: ifeq 162
// 0ac: goto 0b9
// 0af: ldc2_w -7931934741052959424
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: lload 23
// 0bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0be: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 0c1: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0c4: instanceof net/minecraft/class_1835
// 0c7: aload 27
// 0c9: ifnonnull 170
// 0cc: goto 0d9
// 0cf: ldc2_w -7931934741052959424
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: ifeq 162
// 0dc: goto 0e9
// 0df: ldc2_w -7931934741052959424
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: lload 23
// 0eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ee: invokevirtual net/minecraft/class_746.method_6048 ()I
// 0f1: getstatic su/catlean/ui.a Lsu/catlean/ui;
// 0f4: lload 25
// 0f6: invokevirtual su/catlean/ui.f (J)Z
// 0f9: aload 27
// 0fb: ifnonnull 130
// 0fe: goto 10b
// 101: ldc2_w -7931934741052959424
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: ifeq 133
// 10e: goto 11b
// 111: ldc2_w -7931934741052959424
// 114: lload 2
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: getstatic su/catlean/ui.a Lsu/catlean/ui;
// 11e: lload 12
// 120: invokevirtual su/catlean/ui.g (J)I
// 123: goto 130
// 126: ldc2_w -7931934741052959424
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: goto 140
// 133: sipush 32571
// 136: ldc2_w 2929004840262518966
// 139: lload 2
// 13a: lxor
// 13b: invokedynamic k (IJ)I bsm=su/catlean/e9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: if_icmple 162
// 143: iload 6
// 145: lload 7
// 147: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 14a: lload 23
// 14c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14f: checkcast net/minecraft/class_1657
// 152: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
// 155: goto 162
// 158: ldc2_w -7931934741052959424
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: lload 23
// 164: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 167: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 16a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 16d: instanceof net/minecraft/class_1764
// 170: aload 27
// 172: ifnonnull 25f
// 175: ifeq 23f
// 178: goto 185
// 17b: ldc2_w -7931934741052959424
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: aload 0
// 186: iload 9
// 188: iload 10
// 18a: i2c
// 18b: iload 11
// 18d: invokespecial su/catlean/e9.r (ICI)Z
// 190: aload 27
// 192: ifnonnull 25f
// 195: goto 1a2
// 198: ldc2_w -7931934741052959424
// 19b: lload 2
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: ifeq 23f
// 1a5: goto 1b2
// 1a8: ldc2_w -7931934741052959424
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: lload 23
// 1b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b7: invokevirtual net/minecraft/class_746.method_6048 ()I
// 1ba: i2d
// 1bb: sipush 12724
// 1be: ldc2_w 1647781616093857341
// 1c1: lload 2
// 1c2: lxor
// 1c3: invokedynamic k (IJ)I bsm=su/catlean/e9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: i2d
// 1c9: ldc2_w 0.25
// 1cc: aload 0
// 1cd: lload 23
// 1cf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d2: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 1d5: dup
// 1d6: sipush 16692
// 1d9: ldc2_w 5546118426691100904
// 1dc: lload 2
// 1dd: lxor
// 1de: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/e9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e6: lload 16
// 1e8: invokespecial su/catlean/e9.t (Lnet/minecraft/class_1799;J)F
// 1eb: f2d
// 1ec: dmul
// 1ed: sipush 7467
// 1f0: ldc2_w 7679553217238641316
// 1f3: lload 2
// 1f4: lxor
// 1f5: invokedynamic k (IJ)I bsm=su/catlean/e9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: i2d
// 1fb: dmul
// 1fc: dsub
// 1fd: dcmpl
// 1fe: aload 27
// 200: ifnonnull 25f
// 203: goto 210
// 206: ldc2_w -7931934741052959424
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: iflt 23f
// 213: goto 220
// 216: ldc2_w -7931934741052959424
// 219: lload 2
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: iload 6
// 222: lload 7
// 224: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 227: lload 23
// 229: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22c: checkcast net/minecraft/class_1657
// 22f: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
// 232: goto 23f
// 235: ldc2_w -7931934741052959424
// 238: lload 2
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: lload 23
// 241: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 244: aload 27
// 246: ifnonnull 2e8
// 249: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 24c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 24f: instanceof net/minecraft/class_1753
// 252: goto 25f
// 255: ldc2_w -7931934741052959424
// 258: lload 2
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: ifeq 2e0
// 262: aload 0
// 263: lload 18
// 265: invokespecial su/catlean/e9.Q (J)Z
// 268: aload 27
// 26a: ifnonnull 2b1
// 26d: goto 27a
// 270: ldc2_w -7931934741052959424
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: ifeq 2e0
// 27d: goto 28a
// 280: ldc2_w -7931934741052959424
// 283: lload 2
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: lload 23
// 28c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 28f: aload 27
// 291: ifnonnull 2e8
// 294: goto 2a1
// 297: ldc2_w -7931934741052959424
// 29a: lload 2
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: invokevirtual net/minecraft/class_746.method_6048 ()I
// 2a4: goto 2b1
// 2a7: ldc2_w -7931934741052959424
// 2aa: lload 2
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: sipush 14226
// 2b4: ldc2_w 40162898275237914
// 2b7: lload 2
// 2b8: lxor
// 2b9: invokedynamic k (IJ)I bsm=su/catlean/e9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: if_icmple 2e0
// 2c1: iload 6
// 2c3: lload 7
// 2c5: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 2c8: lload 23
// 2ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2cd: checkcast net/minecraft/class_1657
// 2d0: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
// 2d3: goto 2e0
// 2d6: ldc2_w -7931934741052959424
// 2d9: lload 2
// 2da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2df: athrow
// 2e0: lload 23
// 2e2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e5: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 2e8: aload 27
// 2ea: ifnonnull 312
// 2ed: ifnull 3bb
// 2f0: goto 2fd
// 2f3: ldc2_w -7931934741052959424
// 2f6: lload 2
// 2f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fc: athrow
// 2fd: lload 23
// 2ff: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 302: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 305: goto 312
// 308: ldc2_w -7931934741052959424
// 30b: lload 2
// 30c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 311: athrow
// 312: instanceof net/minecraft/class_1498
// 315: ifeq 3bb
// 318: aload 0
// 319: iload 20
// 31b: iload 21
// 31d: iload 22
// 31f: i2c
// 320: invokespecial su/catlean/e9.I (IIC)Lsu/catlean/s2;
// 323: getstatic su/catlean/s2.Rage Lsu/catlean/s2;
// 326: aload 27
// 328: ifnonnull 382
// 32b: goto 338
// 32e: ldc2_w -7931934741052959424
// 331: lload 2
// 332: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 337: athrow
// 338: if_acmpne 374
// 33b: goto 348
// 33e: ldc2_w -7931934741052959424
// 341: lload 2
// 342: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 347: athrow
// 348: lload 23
// 34a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 34d: dup
// 34e: sipush 26739
// 351: ldc2_w 7270980739237628322
// 354: lload 2
// 355: lxor
// 356: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/e9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 35e: checkcast su/catlean/mixins/accessors/LocalPlayerAccessor
// 361: fconst_1
// 362: invokeinterface su/catlean/mixins/accessors/LocalPlayerAccessor.setJumpRidingScale (F)V 2
// 367: goto 374
// 36a: ldc2_w -7931934741052959424
// 36d: lload 2
// 36e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 373: athrow
// 374: aload 0
// 375: iload 20
// 377: iload 21
// 379: iload 22
// 37b: i2c
// 37c: invokespecial su/catlean/e9.I (IIC)Lsu/catlean/s2;
// 37f: getstatic su/catlean/s2.Legit Lsu/catlean/s2;
// 382: if_acmpne 3bb
// 385: lload 23
// 387: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 38a: invokevirtual net/minecraft/class_746.method_3151 ()F
// 38d: fconst_1
// 38e: fcmpl
// 38f: iflt 3bb
// 392: goto 39f
// 395: ldc2_w -7931934741052959424
// 398: lload 2
// 399: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39e: athrow
// 39f: lload 4
// 3a1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3a4: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 3a7: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 3aa: bipush 0
// 3ab: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 3ae: goto 3bb
// 3b1: ldc2_w -7931934741052959424
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: return
}

private final float t(class_1799 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 109431755083784L;
return class_1890.method_8225(
(class_6880)((class_2378)zf.z(var4).method_30349().method_46759(class_1893.field_9098.method_58273()).get())
.method_10223(class_1893.field_9098.method_29177())
.get(),
var1
);
}

static {
long var20 = a ^ 44357384567478L;
long var22 = var20 ^ 110610147475335L;
long var24 = var20 ^ 132535589268110L;
long var26 = var20 ^ 63736879173690L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[15];
int var16 = 0;
String var15 = "\u0007ß\u0090t\u0019«¨q\u001bD\u0001Q ë¶úU/\u001fÜí\u0098g`{W³®MÌ\u0089æ\u0010íP©¾Àÿ\u0015M0m\u0015\u0098ä\u000fÏ\u0086\u0010\u0007\u001bY¨ð¿uæö®\u001aê\u0098¦e#\u0080ÅX\u008a\u001b#¸\u0098w\u007fn\u001eGÐ/¢\u000f\u0017\u0007\u0003 *f\u0015\u009d4Ñß-r~Ùªâ\u0086r¬<C·\u0091\u0096ï\u0001`£TÃ\u0002k\u0095ü\u0082\u0088\u0086\u0012/x\u008dóåLnãb\u0085\u001e\u0083\u008fÉ¹\u0099ï\u009c«ä¶\u0093X\u0099÷3.9\u0080i úø6´\u0017\u0010\u0090WLáÀ\u0016ÚØ»\u008bì¡ý\u009bW\u0004\u0011 /\u009c·;w[}\u0080ûr\u0084I\\rõ*Ë\u000f\u0010wÙ\bàLB)\f´G\n±÷p§Q\u0010ö¡\u009cZ÷å8x\u009drJÐð\u001a/\u009e \u008d\u0010|ìB\u0015\u0010\u0094ûØ«E'¥ÑW4\u008e\u0010\u0080\u009b\u0017ÈV2PÈ«÷\u0096\u001c \u0010.91É÷¡¡\u0014Á\u008fÒ«mÂf¦\u0010\u0000O\u000fÒ³\\®¿Ú§\u0098I+®\ný\u0018Wì¸D`\u001bÎ\u000f\u008fæ\u0097·|¹æ(º\u001c³\u0013ÆyÏ¾ \u0081s¤t?<\u0096®\u008dÖx\"Dâ\u0003¦\u00ad?U\u0002Ûîã\u0015¤¤\u009d »{\u00ad\u00140/H\u0096)ôÈhª\u0081\u008e)\tazãÔ)\u008aµ\\\u008chÕX\u0094´\u0004\u0092Ç:\u0085§\u0099\u008cg'G\b\u0007\u000f\u0087h6¡ï0[\u0096 \\¶Ú)ñ$À\u0086\u0002\u001b\u009b\u0081MÞW\u001b\u0090£SñO\fi6ò*¦Å°\u008fá6";
int var17 = "\u0007ß\u0090t\u0019«¨q\u001bD\u0001Q ë¶úU/\u001fÜí\u0098g`{W³®MÌ\u0089æ\u0010íP©¾Àÿ\u0015M0m\u0015\u0098ä\u000fÏ\u0086\u0010\u0007\u001bY¨ð¿uæö®\u001aê\u0098¦e#\u0080ÅX\u008a\u001b#¸\u0098w\u007fn\u001eGÐ/¢\u000f\u0017\u0007\u0003 *f\u0015\u009d4Ñß-r~Ùªâ\u0086r¬<C·\u0091\u0096ï\u0001`£TÃ\u0002k\u0095ü\u0082\u0088\u0086\u0012/x\u008dóåLnãb\u0085\u001e\u0083\u008fÉ¹\u0099ï\u009c«ä¶\u0093X\u0099÷3.9\u0080i úø6´\u0017\u0010\u0090WLáÀ\u0016ÚØ»\u008bì¡ý\u009bW\u0004\u0011 /\u009c·;w[}\u0080ûr\u0084I\\rõ*Ë\u000f\u0010wÙ\bàLB)\f´G\n±÷p§Q\u0010ö¡\u009cZ÷å8x\u009drJÐð\u001a/\u009e \u008d\u0010|ìB\u0015\u0010\u0094ûØ«E'¥ÑW4\u008e\u0010\u0080\u009b\u0017ÈV2PÈ«÷\u0096\u001c \u0010.91É÷¡¡\u0014Á\u008fÒ«mÂf¦\u0010\u0000O\u000fÒ³\\®¿Ú§\u0098I+®\ný\u0018Wì¸D`\u001bÎ\u000f\u008fæ\u0097·|¹æ(º\u001c³\u0013ÆyÏ¾ \u0081s¤t?<\u0096®\u008dÖx\"Dâ\u0003¦\u00ad?U\u0002Ûîã\u0015¤¤\u009d »{\u00ad\u00140/H\u0096)ôÈhª\u0081\u008e)\tazãÔ)\u008aµ\\\u008chÕX\u0094´\u0004\u0092Ç:\u0085§\u0099\u008cg'G\b\u0007\u000f\u0087h6¡ï0[\u0096 \\¶Ú)ñ$À\u0086\u0002\u001b\u009b\u0081MÞW\u001b\u0090£SñO\fi6ò*¦Å°\u008fá6"
.length();
char var14 = ' ';
int var31 = -1;

label54:
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
c = new String[15];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "\u0089,Â$\u0013¬1·Ü\u0011_Dg¡ùPÞRc,&\u009d\u0098Òèbê¿ÜW\u0015ó";
int var5 = "\u0089,Â$\u0013¬1·Ü\u0011_Dg¡ùPÞRc,&\u009d\u0098Òèbê¿ÜW\u0015ó".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var35 = var6;
var10001 = var3++;
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
byte[] var10 = var0.doFinal(
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
if (var2 >= var5) {
e = var6;
f = new Integer[6];
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(e9.class, b<"y">(23161, 5383813327064221555L ^ var20), b<"y">(29363, 2651734991732600758L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e9.class, b<"y">(14912, 174370311586391878L ^ var20), b<"y">(16296, 8601625415580590752L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e9.class, b<"y">(17435, 1861075577049766168L ^ var20), b<"y">(4662, 2281154237395078961L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(e9.class, b<"y">(12194, 8859672431720706733L ^ var20), b<"y">(32477, 8368141229126411219L ^ var20), 0))
};
P = var28;
k = new e9(var22);
J = yp.L(k, b<"y">(1990, 7022057660781697743L ^ var20), s2.Legit, null, null, c<"k">(27327, 5421686474332463597L ^ var20), null, var26);
u = yp.t(k, b<"y">(9067, 2471900064549650023L ^ var20), true, var24, null, null, c<"k">(11502, 4629614215953459134L ^ var20), null);
S = yp.t(k, b<"y">(9579, 8895312099456006249L ^ var20), true, var24, null, null, c<"k">(11502, 4629614215953459134L ^ var20), null);
L = yp.t(k, b<"y">(19345, 3796283975607867034L ^ var20), true, var24, null, null, c<"k">(11502, 4629614215953459134L ^ var20), null);
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "tkæ\u0097^t>^\u0013¢\\Hñ}ëÜ";
var5 = "tkæ\u0097^t>^\u0013¢\\Hñ}ëÜ".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var35 = var6;
var10001 = var3++;
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
continue label54;
}

var15 = "I ?Æÿ\r\u0015¶\u000f;¬uÈ1Õ\u008fhÙ\u0087\u0014ep¡\u0012 j±ÚàÖÜ\u001c\u0018/\n $B\u000eFäç\u0010è²Ï¿YYqüB \u0095+\u0013!";
var17 = "I ?Æÿ\r\u0015¶\u000f;¬uÈ1Õ\u008fhÙ\u0087\u0014ep¡\u0012 j±ÚàÖÜ\u001c\u0018/\n $B\u000eFäç\u0010è²Ï¿YYqüB \u0095+\u0013!".length();
var14 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12626;
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
throw new RuntimeException("su/catlean/e9", var10);
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
throw new RuntimeException("su/catlean/e9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9996;
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
throw new RuntimeException("su/catlean/e9", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/e9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
