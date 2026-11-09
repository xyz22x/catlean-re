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
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class eg extends _g {
@NotNull
public static final eg e;
static final KProperty[] z;
@NotNull
private static final c8 Y;
@NotNull
private static final c8 D;
@NotNull
private static final cq i;
@NotNull
private static final c8 B;
@NotNull
private static final cp w;
@NotNull
private static final cq x;
@NotNull
private static final cq g;
@NotNull
private static final cq U;
@NotNull
private static final cq C;
@NotNull
private static final bg O;
private static boolean V;
private static final long a = yz.a(3405732608584912864L, -764973721978237715L, MethodHandles.lookup().lookupClass()).a(84265506057186L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map j;

private eg(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76130967564475L;
super(b<"g">(9456, 4776539004370178118L ^ var1), jt.v(), null, 4, null, var3);
}

private final int B(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 52917317872907L;
return ((Number)Y.E(this, var3, z[0])).intValue();
}

private final int n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 43603909077082L;
return ((Number)D.E(this, var3, z[1])).intValue();
}

private final boolean K(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 84451871219608L;
return (Boolean)i.E(this, var6, z[2]);
}

private final int t(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 11236909023076L;
return ((Number)B.E(this, var6, z[3])).intValue();
}

private final h l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 18735578663297L;
return (h)w.E(this, var3, z[4]);
}

private final boolean p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63025984451812L;
return (Boolean)x.E(this, var3, z[5]);
}

private final boolean w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 1730927156271L;
return (Boolean)g.E(this, var3, z[c<"x">(29044, 3813379574083702871L ^ var1)]);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 56580040124097L;
return (Boolean)U.E(this, var3, z[c<"x">(23733, 6870357991127664488L ^ var1)]);
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 48059071947851L;
return (Boolean)C.E(this, var3, z[c<"x">(7523, 1501412243398100009L ^ var1)]);
}

@NotNull
public final bg Y() {
return O;
}

public final boolean x() {
return V;
}

public final void I(boolean <set-?>) {
V = <set-?>;
}

@Override
public void b(long var1) {
V = false;
}

@Flow(
priority = -10
)
private final void G(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/eg.a J
// 003: ldc2_w 54321599286953
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 125583095536866
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 21362674442820
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 10731480856396
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 48153657228703
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 80218784986697
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 19219654778083
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 125670718048701
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 94623880325879
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 72051308883878
// 054: lxor
// 055: lstore 21
// 057: dup2
// 058: ldc2_w 123368741838466
// 05b: lxor
// 05c: lstore 23
// 05e: dup2
// 05f: ldc2_w 14189463989740
// 062: lxor
// 063: dup2
// 064: bipush 32
// 066: lushr
// 067: l2i
// 068: istore 25
// 06a: dup2
// 06b: bipush 32
// 06d: lshl
// 06e: bipush 32
// 070: lushr
// 071: lstore 26
// 073: pop2
// 074: dup2
// 075: ldc2_w 29094989644584
// 078: lxor
// 079: lstore 28
// 07b: dup2
// 07c: ldc2_w 100607469064438
// 07f: lxor
// 080: dup2
// 081: bipush 32
// 083: lushr
// 084: l2i
// 085: istore 30
// 087: dup2
// 088: bipush 32
// 08a: lshl
// 08b: bipush 48
// 08d: lushr
// 08e: l2i
// 08f: istore 31
// 091: dup2
// 092: bipush 48
// 094: lshl
// 095: bipush 48
// 097: lushr
// 098: l2i
// 099: istore 32
// 09b: pop2
// 09c: dup2
// 09d: ldc2_w 130330905271264
// 0a0: lxor
// 0a1: lstore 33
// 0a3: dup2
// 0a4: ldc2_w 99035950982886
// 0a7: lxor
// 0a8: lstore 35
// 0aa: dup2
// 0ab: ldc2_w 27260749527076
// 0ae: lxor
// 0af: lstore 37
// 0b1: dup2
// 0b2: ldc2_w 15235843371071
// 0b5: lxor
// 0b6: lstore 39
// 0b8: dup2
// 0b9: ldc2_w 69967354083083
// 0bc: lxor
// 0bd: lstore 41
// 0bf: dup2
// 0c0: ldc2_w 106004610442547
// 0c3: lxor
// 0c4: lstore 43
// 0c6: dup2
// 0c7: ldc2_w 29810045851167
// 0ca: lxor
// 0cb: dup2
// 0cc: bipush 16
// 0ce: lushr
// 0cf: lstore 45
// 0d1: dup2
// 0d2: bipush 48
// 0d4: lshl
// 0d5: bipush 48
// 0d7: lushr
// 0d8: l2i
// 0d9: istore 47
// 0db: pop2
// 0dc: dup2
// 0dd: ldc2_w 73472201303148
// 0e0: lxor
// 0e1: lstore 48
// 0e3: dup2
// 0e4: ldc2_w 135386446516694
// 0e7: lxor
// 0e8: lstore 50
// 0ea: dup2
// 0eb: ldc2_w 85661760071842
// 0ee: lxor
// 0ef: lstore 52
// 0f1: dup2
// 0f2: ldc2_w 7799626037131
// 0f5: lxor
// 0f6: dup2
// 0f7: bipush 32
// 0f9: lushr
// 0fa: l2i
// 0fb: istore 54
// 0fd: dup2
// 0fe: bipush 32
// 100: lshl
// 101: bipush 48
// 103: lushr
// 104: l2i
// 105: istore 55
// 107: dup2
// 108: bipush 48
// 10a: lshl
// 10b: bipush 48
// 10d: lushr
// 10e: l2i
// 10f: istore 56
// 111: pop2
// 112: dup2
// 113: ldc2_w 67525451455797
// 116: lxor
// 117: dup2
// 118: bipush 48
// 11a: lushr
// 11b: l2i
// 11c: istore 57
// 11e: dup2
// 11f: bipush 16
// 121: lshl
// 122: bipush 16
// 124: lushr
// 125: lstore 58
// 127: pop2
// 128: pop2
// 129: ldc2_w -3574195960157316869
// 12c: lload 2
// 12d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 135: bipush 1
// 136: anewarray 490
// 139: astore 62
// 13b: aload 62
// 13d: bipush 0
// 13e: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
// 141: dup
// 142: sipush 11334
// 145: ldc2_w 5143415734804150024
// 148: lload 2
// 149: lxor
// 14a: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/eg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 152: aastore
// 153: iload 30
// 155: aload 62
// 157: iload 31
// 159: iload 32
// 15b: i2c
// 15c: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 15f: astore 61
// 161: istore 60
// 163: aload 0
// 164: lload 23
// 166: invokespecial su/catlean/eg.w (J)Z
// 169: iload 60
// 16b: ifne 232
// 16e: ifeq 210
// 171: goto 17e
// 174: ldc2_w -3530867365563955127
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: iload 25
// 180: lload 26
// 182: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 185: invokevirtual net/minecraft/class_636.method_2923 ()Z
// 188: iload 60
// 18a: ifne 1c5
// 18d: goto 19a
// 190: ldc2_w -3530867365563955127
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: ifne 247
// 19d: goto 1aa
// 1a0: ldc2_w -3530867365563955127
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1ad: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 1b0: checkcast java/util/Collection
// 1b3: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1b8: goto 1c5
// 1bb: ldc2_w -3530867365563955127
// 1be: lload 2
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: iload 60
// 1c7: ifne 1db
// 1ca: ifne 1de
// 1cd: goto 1da
// 1d0: ldc2_w -3530867365563955127
// 1d3: lload 2
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: bipush 1
// 1db: goto 1df
// 1de: bipush 0
// 1df: ifeq 210
// 1e2: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1e5: iload 54
// 1e7: iload 55
// 1e9: iload 56
// 1eb: invokevirtual su/catlean/ex.Fl (III)Z
// 1ee: iload 60
// 1f0: ifne 232
// 1f3: goto 200
// 1f6: ldc2_w -3530867365563955127
// 1f9: lload 2
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: ifne 247
// 203: goto 210
// 206: ldc2_w -3530867365563955127
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: getstatic su/catlean/eg.O Lsu/catlean/bg;
// 213: sipush 18176
// 216: ldc2_w 303373746894879118
// 219: lload 2
// 21a: lxor
// 21b: invokedynamic x (IJ)I bsm=su/catlean/eg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: lload 43
// 222: invokevirtual su/catlean/bg.c (IJ)Z
// 225: goto 232
// 228: ldc2_w -3530867365563955127
// 22b: lload 2
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: iload 60
// 234: ifne 24e
// 237: ifne 248
// 23a: goto 247
// 23d: ldc2_w -3530867365563955127
// 240: lload 2
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: return
// 248: aload 0
// 249: lload 13
// 24b: invokespecial su/catlean/eg.p (J)Z
// 24e: iload 60
// 250: ifne 294
// 253: ifeq 28e
// 256: goto 263
// 259: ldc2_w -3530867365563955127
// 25c: lload 2
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 266: lload 28
// 268: invokevirtual su/catlean/dm.Y (J)Z
// 26b: iload 60
// 26d: ifne 294
// 270: goto 27d
// 273: ldc2_w -3530867365563955127
// 276: lload 2
// 277: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: athrow
// 27d: ifeq 28e
// 280: goto 28d
// 283: ldc2_w -3530867365563955127
// 286: lload 2
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: return
// 28e: aload 0
// 28f: lload 48
// 291: invokespecial su/catlean/eg.s (J)Z
// 294: iload 60
// 296: ifne 2da
// 299: ifeq 2d4
// 29c: goto 2a9
// 29f: ldc2_w -3530867365563955127
// 2a2: lload 2
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: athrow
// 2a9: lload 15
// 2ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ae: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 2b1: iload 60
// 2b3: ifne 2da
// 2b6: goto 2c3
// 2b9: ldc2_w -3530867365563955127
// 2bc: lload 2
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: ifeq 2d4
// 2c6: goto 2d3
// 2c9: ldc2_w -3530867365563955127
// 2cc: lload 2
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: return
// 2d4: aload 0
// 2d5: lload 35
// 2d7: invokespecial su/catlean/eg.Q (J)Z
// 2da: iload 60
// 2dc: ifne 35f
// 2df: ifeq 345
// 2e2: goto 2ef
// 2e5: ldc2_w -3530867365563955127
// 2e8: lload 2
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 2f2: aload 0
// 2f3: lload 15
// 2f5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2f8: iload 4
// 2fa: i2b
// 2fb: swap
// 2fc: lload 5
// 2fe: dup2_x1
// 2ff: pop2
// 300: checkcast net/minecraft/class_1297
// 303: invokevirtual su/catlean/eg.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 306: checkcast net/minecraft/class_2374
// 309: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 30c: dup
// 30d: sipush 29956
// 310: ldc2_w 4499171311779622467
// 313: lload 2
// 314: lxor
// 315: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/eg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 31d: lload 50
// 31f: invokevirtual su/catlean/wc.d (Lnet/minecraft/class_2338;J)Z
// 322: iload 60
// 324: ifne 35f
// 327: goto 334
// 32a: ldc2_w -3530867365563955127
// 32d: lload 2
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: ifne 345
// 337: goto 344
// 33a: ldc2_w -3530867365563955127
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: return
// 345: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 348: iload 60
// 34a: ifne 365
// 34d: lload 17
// 34f: invokevirtual su/catlean/ux.f (J)Z
// 352: goto 35f
// 355: ldc2_w -3530867365563955127
// 358: lload 2
// 359: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: athrow
// 35f: ifeq 3e8
// 362: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 365: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 368: iload 60
// 36a: ifne 393
// 36d: ifnull 3e8
// 370: goto 37d
// 373: ldc2_w -3530867365563955127
// 376: lload 2
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 380: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 383: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 386: goto 393
// 389: ldc2_w -3530867365563955127
// 38c: lload 2
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: iload 60
// 395: ifne 3c2
// 398: ifnull 3e8
// 39b: goto 3a8
// 39e: ldc2_w -3530867365563955127
// 3a1: lload 2
// 3a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a7: athrow
// 3a8: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 3ab: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 3ae: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 3b1: dup
// 3b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3b5: goto 3c2
// 3b8: ldc2_w -3530867365563955127
// 3bb: lload 2
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: checkcast su/catlean/mm
// 3c5: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 3c8: invokevirtual su/catlean/t_.c ()F
// 3cb: ldc 4.0
// 3cd: fcmpl
// 3ce: iload 60
// 3d0: ifne 3e4
// 3d3: ifle 3e8
// 3d6: goto 3e3
// 3d9: ldc2_w -3530867365563955127
// 3dc: lload 2
// 3dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: athrow
// 3e3: bipush 0
// 3e4: putstatic su/catlean/eg.V Z
// 3e7: return
// 3e8: lload 7
// 3ea: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3ed: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 3f0: dup
// 3f1: sipush 14069
// 3f4: ldc2_w 5416835457061711279
// 3f7: lload 2
// 3f8: lxor
// 3f9: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/eg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 401: astore 63
// 403: bipush 0
// 404: istore 64
// 406: aload 63
// 408: astore 65
// 40a: new java/util/ArrayList
// 40d: dup
// 40e: invokespecial java/util/ArrayList.<init> ()V
// 411: checkcast java/util/Collection
// 414: astore 66
// 416: bipush 0
// 417: istore 67
// 419: aload 65
// 41b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 420: astore 68
// 422: aload 68
// 424: invokeinterface java/util/Iterator.hasNext ()Z 1
// 429: ifeq 470
// 42c: aload 68
// 42e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 433: astore 69
// 435: aload 69
// 437: instanceof net/minecraft/class_1542
// 43a: iload 60
// 43c: ifne 496
// 43f: iload 60
// 441: ifne 46a
// 444: goto 451
// 447: ldc2_w -3530867365563955127
// 44a: lload 2
// 44b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 450: athrow
// 451: ifeq 422
// 454: goto 461
// 457: ldc2_w -3530867365563955127
// 45a: lload 2
// 45b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 460: athrow
// 461: aload 66
// 463: aload 69
// 465: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 46a: pop
// 46b: iload 60
// 46d: ifeq 422
// 470: aload 66
// 472: checkcast java/util/List
// 475: nop
// 476: checkcast java/lang/Iterable
// 479: astore 63
// 47b: nop
// 47c: bipush 0
// 47d: istore 64
// 47f: aload 63
// 481: iload 60
// 483: ifne 4d5
// 486: instanceof java/util/Collection
// 489: goto 496
// 48c: ldc2_w -3530867365563955127
// 48f: lload 2
// 490: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 495: athrow
// 496: ifeq 4d3
// 499: aload 63
// 49b: checkcast java/util/Collection
// 49e: iload 60
// 4a0: ifne 4d5
// 4a3: goto 4b0
// 4a6: ldc2_w -3530867365563955127
// 4a9: lload 2
// 4aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4af: athrow
// 4b0: invokeinterface java/util/Collection.isEmpty ()Z 1
// 4b5: ifeq 4d3
// 4b8: goto 4c5
// 4bb: ldc2_w -3530867365563955127
// 4be: lload 2
// 4bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c4: athrow
// 4c5: bipush 0
// 4c6: goto 56e
// 4c9: ldc2_w -3530867365563955127
// 4cc: lload 2
// 4cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d2: athrow
// 4d3: aload 63
// 4d5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4da: astore 65
// 4dc: aload 65
// 4de: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4e3: ifeq 56d
// 4e6: aload 65
// 4e8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4ed: astore 66
// 4ef: aload 66
// 4f1: checkcast net/minecraft/class_1542
// 4f4: astore 67
// 4f6: bipush 0
// 4f7: istore 68
// 4f9: aload 67
// 4fb: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 4fe: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 501: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
// 504: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 507: iload 60
// 509: ifne 547
// 50c: ifeq 560
// 50f: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 512: iload 4
// 514: i2b
// 515: lload 5
// 517: aload 67
// 519: checkcast net/minecraft/class_1297
// 51c: invokevirtual su/catlean/eg.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 51f: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 522: lload 15
// 524: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 527: iload 4
// 529: i2b
// 52a: swap
// 52b: lload 5
// 52d: dup2_x1
// 52e: pop2
// 52f: checkcast net/minecraft/class_1297
// 532: invokevirtual su/catlean/eg.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 535: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 538: dconst_1
// 539: dcmpg
// 53a: goto 547
// 53d: ldc2_w -3530867365563955127
// 540: lload 2
// 541: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 546: athrow
// 547: iload 60
// 549: ifne 55d
// 54c: ifge 560
// 54f: goto 55c
// 552: ldc2_w -3530867365563955127
// 555: lload 2
// 556: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55b: athrow
// 55c: bipush 1
// 55d: goto 561
// 560: bipush 0
// 561: ifeq 4dc
// 564: bipush 1
// 565: iload 60
// 567: ifne 507
// 56a: goto 56e
// 56d: bipush 0
// 56e: istore 62
// 570: iload 62
// 572: iload 60
// 574: ifne 5c7
// 577: ifeq 5c1
// 57a: goto 587
// 57d: ldc2_w -3530867365563955127
// 580: lload 2
// 581: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 586: athrow
// 587: aload 0
// 588: iload 57
// 58a: i2c
// 58b: lload 58
// 58d: invokespecial su/catlean/eg.K (CJ)Z
// 590: iload 60
// 592: ifne 5c7
// 595: goto 5a2
// 598: ldc2_w -3530867365563955127
// 59b: lload 2
// 59c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a1: athrow
// 5a2: ifeq 5c1
// 5a5: goto 5b2
// 5a8: ldc2_w -3530867365563955127
// 5ab: lload 2
// 5ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b1: athrow
// 5b2: ldc 100.0
// 5b4: goto 5c8
// 5b7: ldc2_w -3530867365563955127
// 5ba: lload 2
// 5bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c0: athrow
// 5c1: aload 0
// 5c2: lload 19
// 5c4: invokespecial su/catlean/eg.n (J)I
// 5c7: i2f
// 5c8: fstore 63
// 5ca: iload 62
// 5cc: iload 60
// 5ce: ifne 621
// 5d1: ifeq 61b
// 5d4: goto 5e1
// 5d7: ldc2_w -3530867365563955127
// 5da: lload 2
// 5db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e0: athrow
// 5e1: aload 0
// 5e2: iload 57
// 5e4: i2c
// 5e5: lload 58
// 5e7: invokespecial su/catlean/eg.K (CJ)Z
// 5ea: iload 60
// 5ec: ifne 621
// 5ef: goto 5fc
// 5f2: ldc2_w -3530867365563955127
// 5f5: lload 2
// 5f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fb: athrow
// 5fc: ifeq 61b
// 5ff: goto 60c
// 602: ldc2_w -3530867365563955127
// 605: lload 2
// 606: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60b: athrow
// 60c: ldc 100.0
// 60e: goto 622
// 611: ldc2_w -3530867365563955127
// 614: lload 2
// 615: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61a: athrow
// 61b: aload 0
// 61c: lload 21
// 61e: invokespecial su/catlean/eg.B (J)I
// 621: i2f
// 622: fstore 64
// 624: lload 15
// 626: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 629: lload 39
// 62b: dup2_x1
// 62c: pop2
// 62d: invokestatic su/catlean/s_.z (JLnet/minecraft/class_746;)Ljava/util/List;
// 630: checkcast java/lang/Iterable
// 633: astore 66
// 635: bipush 0
// 636: istore 67
// 638: aload 66
// 63a: astore 68
// 63c: new java/util/ArrayList
// 63f: dup
// 640: invokespecial java/util/ArrayList.<init> ()V
// 643: checkcast java/util/Collection
// 646: astore 69
// 648: bipush 0
// 649: istore 70
// 64b: aload 68
// 64d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 652: astore 71
// 654: aload 71
// 656: invokeinterface java/util/Iterator.hasNext ()Z 1
// 65b: ifeq 6b0
// 65e: aload 71
// 660: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 665: astore 72
// 667: aload 72
// 669: checkcast net/minecraft/class_1799
// 66c: astore 73
// 66e: bipush 0
// 66f: istore 74
// 671: lload 9
// 673: aload 73
// 675: getstatic net/minecraft/class_1893.field_9101 Lnet/minecraft/class_5321;
// 678: dup
// 679: sipush 12650
// 67c: ldc2_w 4052429334692293155
// 67f: lload 2
// 680: lxor
// 681: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/eg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 686: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 689: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// 68c: iload 60
// 68e: ifne 6aa
// 691: ifeq 654
// 694: goto 6a1
// 697: ldc2_w -3530867365563955127
// 69a: lload 2
// 69b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a0: athrow
// 6a1: aload 69
// 6a3: aload 72
// 6a5: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 6aa: pop
// 6ab: iload 60
// 6ad: ifeq 654
// 6b0: aload 69
// 6b2: checkcast java/util/List
// 6b5: nop
// 6b6: astore 65
// 6b8: getstatic su/catlean/eg.V Z
// 6bb: iload 60
// 6bd: ifne 7ae
// 6c0: ifne 7ab
// 6c3: goto 6d0
// 6c6: ldc2_w -3530867365563955127
// 6c9: lload 2
// 6ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cf: athrow
// 6d0: aload 65
// 6d2: checkcast java/lang/Iterable
// 6d5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 6da: astore 68
// 6dc: aload 68
// 6de: iload 60
// 6e0: ifne 70d
// 6e3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 6e8: ifne 706
// 6eb: goto 6f8
// 6ee: ldc2_w -3530867365563955127
// 6f1: lload 2
// 6f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f7: athrow
// 6f8: aconst_null
// 6f9: goto 76b
// 6fc: ldc2_w -3530867365563955127
// 6ff: lload 2
// 700: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 705: athrow
// 706: aload 68
// 708: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 70d: checkcast net/minecraft/class_1799
// 710: astore 69
// 712: bipush 0
// 713: istore 70
// 715: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 718: lload 52
// 71a: aload 69
// 71c: invokespecial su/catlean/eg.S (JLnet/minecraft/class_1799;)F
// 71f: fstore 69
// 721: aload 68
// 723: invokeinterface java/util/Iterator.hasNext ()Z 1
// 728: ifeq 766
// 72b: aload 68
// 72d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 732: checkcast net/minecraft/class_1799
// 735: astore 70
// 737: bipush 0
// 738: istore 71
// 73a: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 73d: lload 52
// 73f: aload 70
// 741: invokespecial su/catlean/eg.S (JLnet/minecraft/class_1799;)F
// 744: fstore 70
// 746: fload 69
// 748: fload 70
// 74a: invokestatic java/lang/Math.min (FF)F
// 74d: fstore 69
// 74f: iload 60
// 751: ifne 780
// 754: iload 60
// 756: ifeq 721
// 759: goto 766
// 75c: ldc2_w -3530867365563955127
// 75f: lload 2
// 760: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 765: athrow
// 766: fload 69
// 768: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 76b: dup
// 76c: ifnull 77f
// 76f: invokevirtual java/lang/Float.floatValue ()F
// 772: goto 782
// 775: ldc2_w -3530867365563955127
// 778: lload 2
// 779: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77e: athrow
// 77f: pop
// 780: ldc 100.0
// 782: fload 64
// 784: fcmpg
// 785: iload 60
// 787: ifne 7ae
// 78a: ifge 7ab
// 78d: goto 79a
// 790: ldc2_w -3530867365563955127
// 793: lload 2
// 794: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 799: athrow
// 79a: bipush 1
// 79b: putstatic su/catlean/eg.V Z
// 79e: goto 7ab
// 7a1: ldc2_w -3530867365563955127
// 7a4: lload 2
// 7a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7aa: athrow
// 7ab: getstatic su/catlean/eg.V Z
// 7ae: iload 60
// 7b0: ifne 8a6
// 7b3: ifeq 89e
// 7b6: goto 7c3
// 7b9: ldc2_w -3530867365563955127
// 7bc: lload 2
// 7bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c2: athrow
// 7c3: aload 65
// 7c5: checkcast java/lang/Iterable
// 7c8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 7cd: astore 68
// 7cf: aload 68
// 7d1: iload 60
// 7d3: ifne 800
// 7d6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 7db: ifne 7f9
// 7de: goto 7eb
// 7e1: ldc2_w -3530867365563955127
// 7e4: lload 2
// 7e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ea: athrow
// 7eb: aconst_null
// 7ec: goto 85e
// 7ef: ldc2_w -3530867365563955127
// 7f2: lload 2
// 7f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f8: athrow
// 7f9: aload 68
// 7fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 800: checkcast net/minecraft/class_1799
// 803: astore 69
// 805: bipush 0
// 806: istore 70
// 808: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 80b: lload 52
// 80d: aload 69
// 80f: invokespecial su/catlean/eg.S (JLnet/minecraft/class_1799;)F
// 812: fstore 69
// 814: aload 68
// 816: invokeinterface java/util/Iterator.hasNext ()Z 1
// 81b: ifeq 859
// 81e: aload 68
// 820: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 825: checkcast net/minecraft/class_1799
// 828: astore 70
// 82a: bipush 0
// 82b: istore 71
// 82d: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 830: lload 52
// 832: aload 70
// 834: invokespecial su/catlean/eg.S (JLnet/minecraft/class_1799;)F
// 837: fstore 70
// 839: fload 69
// 83b: fload 70
// 83d: invokestatic java/lang/Math.min (FF)F
// 840: fstore 69
// 842: iload 60
// 844: ifne 873
// 847: iload 60
// 849: ifeq 814
// 84c: goto 859
// 84f: ldc2_w -3530867365563955127
// 852: lload 2
// 853: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 858: athrow
// 859: fload 69
// 85b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 85e: dup
// 85f: ifnull 872
// 862: invokevirtual java/lang/Float.floatValue ()F
// 865: goto 875
// 868: ldc2_w -3530867365563955127
// 86b: lload 2
// 86c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 871: athrow
// 872: pop
// 873: ldc 100.0
// 875: fload 63
// 877: fcmpl
// 878: iload 60
// 87a: ifne 8a6
// 87d: iflt 89e
// 880: goto 88d
// 883: ldc2_w -3530867365563955127
// 886: lload 2
// 887: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88c: athrow
// 88d: bipush 0
// 88e: putstatic su/catlean/eg.V Z
// 891: goto 89e
// 894: ldc2_w -3530867365563955127
// 897: lload 2
// 898: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89d: athrow
// 89e: lload 15
// 8a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8a3: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 8a6: iload 60
// 8a8: ifne 978
// 8ab: ifne 977
// 8ae: goto 8bb
// 8b1: ldc2_w -3530867365563955127
// 8b4: lload 2
// 8b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ba: athrow
// 8bb: lload 7
// 8bd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 8c0: aload 0
// 8c1: lload 15
// 8c3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8c6: iload 4
// 8c8: i2b
// 8c9: swap
// 8ca: lload 5
// 8cc: dup2_x1
// 8cd: pop2
// 8ce: checkcast net/minecraft/class_1297
// 8d1: invokevirtual su/catlean/eg.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 8d4: checkcast net/minecraft/class_2374
// 8d7: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 8da: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 8dd: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 8e0: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 8e3: iload 60
// 8e5: ifne 962
// 8e8: goto 8f5
// 8eb: ldc2_w -3530867365563955127
// 8ee: lload 2
// 8ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f4: athrow
// 8f5: ifeq 950
// 8f8: goto 905
// 8fb: ldc2_w -3530867365563955127
// 8fe: lload 2
// 8ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 904: athrow
// 905: lload 7
// 907: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 90a: aload 0
// 90b: lload 15
// 90d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 910: iload 4
// 912: i2b
// 913: swap
// 914: lload 5
// 916: dup2_x1
// 917: pop2
// 918: checkcast net/minecraft/class_1297
// 91b: invokevirtual su/catlean/eg.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 91e: checkcast net/minecraft/class_2374
// 921: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 924: bipush 2
// 925: invokevirtual net/minecraft/class_2338.method_10087 (I)Lnet/minecraft/class_2338;
// 928: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 92b: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 92e: iload 60
// 930: ifne 978
// 933: goto 940
// 936: ldc2_w -3530867365563955127
// 939: lload 2
// 93a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93f: athrow
// 940: ifne 977
// 943: goto 950
// 946: ldc2_w -3530867365563955127
// 949: lload 2
// 94a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94f: athrow
// 950: aload 61
// 952: invokevirtual su/catlean/fg.R ()Z
// 955: goto 962
// 958: ldc2_w -3530867365563955127
// 95b: lload 2
// 95c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 961: athrow
// 962: iload 60
// 964: ifne 97e
// 967: ifne 97b
// 96a: goto 977
// 96d: ldc2_w -3530867365563955127
// 970: lload 2
// 971: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 976: athrow
// 977: bipush 0
// 978: putstatic su/catlean/eg.V Z
// 97b: getstatic su/catlean/eg.V Z
// 97e: ifeq 9de
// 981: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 984: lload 15
// 986: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 989: lload 11
// 98b: dup2_x1
// 98c: pop2
// 98d: checkcast net/minecraft/class_1657
// 990: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 993: aconst_null
// 994: lload 45
// 996: bipush 1
// 997: iload 47
// 999: i2c
// 99a: aconst_null
// 99b: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 99e: i2f
// 99f: ldc 50.0
// 9a1: fdiv
// 9a2: f2d
// 9a3: invokestatic java/lang/Math.ceil (D)D
// 9a6: d2f
// 9a7: f2i
// 9a8: invokevirtual su/catlean/lo.w (JLnet/minecraft/class_1657;I)Lnet/minecraft/class_243;
// 9ab: astore 66
// 9ad: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 9b0: new su/catlean/t5
// 9b3: dup
// 9b4: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 9b7: aload 66
// 9b9: lload 33
// 9bb: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 9be: lload 37
// 9c0: sipush 28265
// 9c3: ldc2_w 7117436666468929762
// 9c6: lload 2
// 9c7: lxor
// 9c8: invokedynamic x (IJ)I bsm=su/catlean/eg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9cd: aload 61
// 9cf: invokedynamic invoke (Lsu/catlean/fg;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/eg.k (Lsu/catlean/fg;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 9d4: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 9d7: lload 41
// 9d9: dup2_x1
// 9da: pop2
// 9db: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 9de: return
}

private final float S(long param1, class_1799 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/eg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -6349311073654034052
// 09: lload 1
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: aload 3
// 12: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 15: iload 4
// 17: ifne 3b
// 1a: ifne 50
// 1d: goto 2a
// 20: ldc2_w -6379201162242891314
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 3
// 2b: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 2e: goto 3b
// 31: ldc2_w -6379201162242891314
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: iload 4
// 3d: ifne 66
// 40: ifne 5d
// 43: goto 50
// 46: ldc2_w -6379201162242891314
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: ldc 100.0
// 52: freturn
// 53: ldc2_w -6379201162242891314
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 3
// 5e: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 61: aload 3
// 62: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 65: isub
// 66: i2f
// 67: aload 3
// 68: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 6b: i2f
// 6c: fdiv
// 6d: ldc 100.0
// 6f: fmul
// 70: freturn
}

private static final Unit k(fg var0) {
long var1 = a ^ 88820731924815L;
long var10001 = var1 ^ 28796769100335L;
int var3 = (int)((var1 ^ 28796769100335L) >>> 48);
int var4 = (int)((var1 ^ 28796769100335L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
long var6 = var1 ^ 104619497784440L;
gg.P.r(var0.a(), var6, e.t((short)var3, (short)var4, var5));
return Unit.INSTANCE;
}

static {
long var20 = a ^ 91099159584202L;
long var22 = var20 ^ 3367865473103L;
long var24 = var20 ^ 99996108183387L;
long var26 = var20 ^ 129010208692797L;
long var10001 = var20 ^ 127302634098447L;
int var28 = (int)((var20 ^ 127302634098447L) >>> 48);
int var29 = (int)((var20 ^ 127302634098447L) << 16 >>> 32);
int var30 = (int)(var10001 << 48 >>> 48);
long var31 = var20 ^ 60276770389416L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[32];
int var16 = 0;
String var15 = "Ï\u0082\u0093¨²\u0010¿\u0084@\u008c\u0090Aó þ;z\u0015;\u0083©\rrû`¤\u009eëáÕ\u0090t¤\u009d\u000b\u00078\u0017íñ0Ü®`\u000f×`â\u0084\u001f¿G\u0018\u001a§>\u0089î|ä\t\u0000+ÅÀ÷\u008a÷_\u008d\rÛ2¶çðáëÆö\u0084#A\u0096\u0083Ç%z\u0090 í\u0007½Îdm\u00adÔhþ\u0015<uX©×\u001cäýSMævË6Bñ\u000fjc¸© \u009a\u0004\u0088\u001fÿÛÑ¸*\u001b\u008fð_9>¸)`ûð±\u001d|;\u0013¤e\u008c²g¨ü\u0018xåÌ\u008cKm\u009a&\tù\u0004ëz¡\u008e\u0019\u0090jfëâ{D- \u009bÀ\u0005Ïª\u0018c(ª\u008b\u0016è\u0087ÃÉhV¬r\u009c\u0017\u001dvÌWM6r[Má$ Õ5ÿyC£'\nFh«\r\\¥I6Ia\u000eb\\[\u000b\u0017ð\u0080\u00adÂ'ÚE°\u0018>é\u0014\u0094Mþ\u0099\u0083,â\u0016íX|¸ÂaLé0åzQ¹8\r*Ø\u0002{ZdWÃ¿ \u0088<d\u0014û\u0080\u0018:\u0085GÞ5wÌ:NsË\u009b~¾ÐÑ\u008aT{\u0003ãÅÁnåa\u0018j6û\u0093\u008e\u000b\u0007ªéÃ\u0092\u0018\u0089¤\u007f\u00ad\u009dqGÛ\u0016Dg_Û®û \u0015\u0097\u000eÐ\u0097\u0005\u0080¯\u0018\u0082\u009f\u0085\tD7JvÆÜ¢\u0087}y\u009aÇ\u0087\u009at\bÆ³>? `\u009bv\u0003\u0095\n?\u0017\r]«3ò¬_¦HÑ\u009f>Tß66\u0081\b\u009eüT_;´ \r\u00881©\u000bíp\fr\u009aû\u0006[\u0012Ü[\u009bðV®JÒ\u0087\u0081\u0081Ø¢\\ðK£ú W>\u008bÂ¨¹Ë©_\u0013UN>\u0001#^¸Çú/\u0096$tg½\u00157B¹HrK\u0018ÛÓã\u008b\u0090k\u0012\tÌÿ2vj§åê\u0098«Êºjt\u008a\u00910Â³ Ë\u0006\u0004Ü \u008ao\u001eØ¦kà\u0018òOsCè^ó\u009d\u009bA¬\b(\u0019Ó|\u0099ñR]dºa9Ã¸¿\u008bÒJq\n\u0018\u0016åb\u008cN\u0082\r\u0016\u009b÷T?o_á²Y\u0002\u0018ï¢\"m| Zs\u0015\u0095jîÐ\u0091M3¨<)ì\u0085#.NqE\u001dy\neF.×Í½úïí\u00183ù\u0092\r\u0005E\u0017\u0098©Ó@¡\u001b\u0010×\u00ad\u0013]\u009cN\u0081;À\u00ad ÍU!w}pÎ©ìý.\u001aî\u0016ýí6\u0011àd×ÂÝ\u001d\u0004.õè«\u008eÂ\u0099\u0010löBqTS¯ûçBÆ\u0096é3\u0010q\u0010dëeÈ9£ÅeÉ\u008dîë¿\u0004÷É(à~Ü{Í=Ö5pº\u008eÑ|\u0001\bgÀ[Yr-\u0095Y7\bà®\u0018EoËá¬\u0017\u00adÐ§é\u0087\u0084 A6È£°úÒ\u0081\u0011;\u000b\fF^öÿY}U8RãëV\u009e\u009b\u0081\u0090ùèÒ6\u0010å\u001a_Y\u0000\u001f´þ¤±W\u0017qÚëv(¥¾J¶\u0087FéI'\u008b\u0013Ò\b\u009fC,°hÆÅ\u0093·\u008eDâ\u001bº\u0006c~»\u0013gF`\u0015\u008d\u001b+f(Æ\u00962\u0087Æ9Ý#\u0082\u0082ù\u0000\b\u001e-\u0086êß÷\u001fQ9Ðæ\u0092h\u0081= ':t\u0003³\u0096ä\u0098ÌeÄ(}á\u001f\u0003·IV\u0004%\u00078Bâs\nwFþw}\u0007]N§îÐ)!e²¯9Ûvg\u0098p;V\u0018\u0010}\u009f\u00060-\u0082\\m&=c,f\u0016ÕL \u001d\u0090`É_åòM©/ÈT\u008c\u0091á\u009a\u009e'ÅD\u0001wT¶\u0003\u0082Ø\u0080\u0094¬,\u0094";
int var17 = "Ï\u0082\u0093¨²\u0010¿\u0084@\u008c\u0090Aó þ;z\u0015;\u0083©\rrû`¤\u009eëáÕ\u0090t¤\u009d\u000b\u00078\u0017íñ0Ü®`\u000f×`â\u0084\u001f¿G\u0018\u001a§>\u0089î|ä\t\u0000+ÅÀ÷\u008a÷_\u008d\rÛ2¶çðáëÆö\u0084#A\u0096\u0083Ç%z\u0090 í\u0007½Îdm\u00adÔhþ\u0015<uX©×\u001cäýSMævË6Bñ\u000fjc¸© \u009a\u0004\u0088\u001fÿÛÑ¸*\u001b\u008fð_9>¸)`ûð±\u001d|;\u0013¤e\u008c²g¨ü\u0018xåÌ\u008cKm\u009a&\tù\u0004ëz¡\u008e\u0019\u0090jfëâ{D- \u009bÀ\u0005Ïª\u0018c(ª\u008b\u0016è\u0087ÃÉhV¬r\u009c\u0017\u001dvÌWM6r[Má$ Õ5ÿyC£'\nFh«\r\\¥I6Ia\u000eb\\[\u000b\u0017ð\u0080\u00adÂ'ÚE°\u0018>é\u0014\u0094Mþ\u0099\u0083,â\u0016íX|¸ÂaLé0åzQ¹8\r*Ø\u0002{ZdWÃ¿ \u0088<d\u0014û\u0080\u0018:\u0085GÞ5wÌ:NsË\u009b~¾ÐÑ\u008aT{\u0003ãÅÁnåa\u0018j6û\u0093\u008e\u000b\u0007ªéÃ\u0092\u0018\u0089¤\u007f\u00ad\u009dqGÛ\u0016Dg_Û®û \u0015\u0097\u000eÐ\u0097\u0005\u0080¯\u0018\u0082\u009f\u0085\tD7JvÆÜ¢\u0087}y\u009aÇ\u0087\u009at\bÆ³>? `\u009bv\u0003\u0095\n?\u0017\r]«3ò¬_¦HÑ\u009f>Tß66\u0081\b\u009eüT_;´ \r\u00881©\u000bíp\fr\u009aû\u0006[\u0012Ü[\u009bðV®JÒ\u0087\u0081\u0081Ø¢\\ðK£ú W>\u008bÂ¨¹Ë©_\u0013UN>\u0001#^¸Çú/\u0096$tg½\u00157B¹HrK\u0018ÛÓã\u008b\u0090k\u0012\tÌÿ2vj§åê\u0098«Êºjt\u008a\u00910Â³ Ë\u0006\u0004Ü \u008ao\u001eØ¦kà\u0018òOsCè^ó\u009d\u009bA¬\b(\u0019Ó|\u0099ñR]dºa9Ã¸¿\u008bÒJq\n\u0018\u0016åb\u008cN\u0082\r\u0016\u009b÷T?o_á²Y\u0002\u0018ï¢\"m| Zs\u0015\u0095jîÐ\u0091M3¨<)ì\u0085#.NqE\u001dy\neF.×Í½úïí\u00183ù\u0092\r\u0005E\u0017\u0098©Ó@¡\u001b\u0010×\u00ad\u0013]\u009cN\u0081;À\u00ad ÍU!w}pÎ©ìý.\u001aî\u0016ýí6\u0011àd×ÂÝ\u001d\u0004.õè«\u008eÂ\u0099\u0010löBqTS¯ûçBÆ\u0096é3\u0010q\u0010dëeÈ9£ÅeÉ\u008dîë¿\u0004÷É(à~Ü{Í=Ö5pº\u008eÑ|\u0001\bgÀ[Yr-\u0095Y7\bà®\u0018EoËá¬\u0017\u00adÐ§é\u0087\u0084 A6È£°úÒ\u0081\u0011;\u000b\fF^öÿY}U8RãëV\u009e\u009b\u0081\u0090ùèÒ6\u0010å\u001a_Y\u0000\u001f´þ¤±W\u0017qÚëv(¥¾J¶\u0087FéI'\u008b\u0013Ò\b\u009fC,°hÆÅ\u0093·\u008eDâ\u001bº\u0006c~»\u0013gF`\u0015\u008d\u001b+f(Æ\u00962\u0087Æ9Ý#\u0082\u0082ù\u0000\b\u001e-\u0086êß÷\u001fQ9Ðæ\u0092h\u0081= ':t\u0003³\u0096ä\u0098ÌeÄ(}á\u001f\u0003·IV\u0004%\u00078Bâs\nwFþw}\u0007]N§îÐ)!e²¯9Ûvg\u0098p;V\u0018\u0010}\u009f\u00060-\u0082\\m&=c,f\u0016ÕL \u001d\u0090`É_åòM©/ÈT\u008c\u0091á\u009a\u009e'ÅD\u0001wT¶\u0003\u0082Ø\u0080\u0094¬,\u0094"
.length();
char var14 = '(';
int var36 = -1;

label54:
while (true) {
String var37 = var15.substring(++var36, var36 + var14);
byte var41 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var49 = b(var19).intern();
switch (var41) {
case 0:
var18[var16++] = var49;
if ((var36 += var14) >= var17) {
b = var18;
c = new String[32];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[17];
int var3 = 0;
String var4 = "\u009c+ÑCÀÑ\t\u0091F\u0086\u0011îïì\u008b\u009b,âÄkýê\u0080Ö\u0084\n\u007fÿ¡ÆÊ2¼ï\u0000&Ç¶ðu½Dº1\u0081\f\u008dÇ_²ñ\u009fpþ/.\u0010újé\f\u0002\u000f\u00ado\u001d¥¶,,Ú\u008fºEÄðú\u0092¸éJ ,\u0083o\u001f>\u008fPp\fÇ\u0099Ù\u0091âó\u009cãÀ<EÑª\u0000r*_\u0010B\u0094ö I\u0001ö\u0017©B\u0015";
int var5 = "\u009c+ÑCÀÑ\t\u0091F\u0086\u0011îïì\u008b\u009b,âÄkýê\u0080Ö\u0084\n\u007fÿ¡ÆÊ2¼ï\u0000&Ç¶ðu½Dº1\u0081\f\u008dÇ_²ñ\u009fpþ/.\u0010újé\f\u0002\u000f\u00ado\u001d¥¶,,Ú\u008fºEÄðú\u0092¸éJ ,\u0083o\u001f>\u008fPp\fÇ\u0099Ù\u0091âó\u009cãÀ<EÑª\u0000r*_\u0010B\u0094ö I\u0001ö\u0017©B\u0015"
.length();
byte var2 = 0;

label36:
while (true) {
byte var45 = var2;
var2 += 8;
byte[] var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
int var46 = var3++;
long var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var56 = -1;

while (true) {
long var8 = var53;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var56) {
case 0:
var40[var46] = var58;
if (var2 >= var5) {
f = var6;
h = new Integer[17];
KProperty[] var33 = new KProperty[c<"x">(26279, 4081039585253477192L ^ var20)];
var33[0] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(11976, 262680137575442147L ^ var20), b<"g">(21086, 2665318030196595305L ^ var20), 0)
);
var33[1] = Reflection.property1(new PropertyReference1Impl(eg.class, b<"g">(140, 5934867541457373349L ^ var20), b<"g">(13350, 5374379585780104201L ^ var20), 0));
var33[2] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(16052, 690983509179512448L ^ var20), b<"g">(30780, 4858445197412921354L ^ var20), 0)
);
var33[3] = Reflection.property1(new PropertyReference1Impl(eg.class, b<"g">(3554, 6196879702337947089L ^ var20), b<"g">(5951, 952263041312235277L ^ var20), 0));
var33[4] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(11076, 1375337853022872421L ^ var20), b<"g">(10248, 6110375222818152502L ^ var20), 0)
);
var33[5] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(18945, 1000594753961116195L ^ var20), b<"g">(24253, 2779005896825755290L ^ var20), 0)
);
var33[c<"x">(10328, 6030577282809234875L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(6838, 8334904598164574867L ^ var20), b<"g">(9292, 6247448130792041597L ^ var20), 0)
);
var33[c<"x">(9309, 8289150887329499583L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(7107, 5445327808446403557L ^ var20), b<"g">(20947, 3715048255725066734L ^ var20), 0)
);
var33[c<"x">(12555, 7390904320487234786L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(eg.class, b<"g">(26251, 515217267105328817L ^ var20), b<"g">(32197, 103425776057611749L ^ var20), 0)
);
z = var33;
e = new eg(var31);
Y = yp.L(
e,
b<"g">(589, 711748978123410040L ^ var20),
c<"x">(10059, 5359085457054960299L ^ var20),
new IntRange(0, c<"x">(5534, 2028226944860338296L ^ var20)),
var24,
null,
null,
c<"x">(26537, 4196887384249420357L ^ var20),
null
);
D = yp.L(
e,
b<"g">(8332, 8022196223392032956L ^ var20),
c<"x">(31423, 3426217365911197534L ^ var20),
new IntRange(0, c<"x">(27188, 3155402919507675103L ^ var20)),
var24,
null,
null,
c<"x">(1331, 3000363335941794013L ^ var20),
null
);
i = yp.t(e, b<"g">(25852, 212408296936729808L ^ var20), true, var26, null, null, c<"x">(8894, 923949245199552347L ^ var20), null);
B = yp.L(
e,
b<"g">(18494, 9134186306242625537L ^ var20),
1,
new IntRange(1, c<"x">(8843, 8330363896407297903L ^ var20)),
var24,
null,
null,
c<"x">(1331, 3000363335941794013L ^ var20),
null
);
w = yp.B(e, b<"g">(29567, 8279808821468625756L ^ var20), (short)var28, w7.BOOLS, null, 4, var29, null, (char)var30);
x = yp.t(e, b<"g">(20029, 1958562259138758163L ^ var20), true, var26, e.l(var22), null, c<"x">(7523, 1501443316806332553L ^ var20), null);
g = yp.t(e, b<"g">(12483, 7233510496710801659L ^ var20), false, var26, e.l(var22), null, c<"x">(7523, 1501443316806332553L ^ var20), null);
U = yp.t(e, b<"g">(16171, 947612913922127639L ^ var20), false, var26, e.l(var22), null, c<"x">(7523, 1501443316806332553L ^ var20), null);
C = yp.t(e, b<"g">(28431, 1677753959360980775L ^ var20), false, var26, e.l(var22), null, c<"x">(7523, 1501443316806332553L ^ var20), null);
O = new bg();
return;
}
break;
default:
var40[var46] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "åØ§tâ\u0092C»þa®½¸Ð\u008c\u0015";
var5 = "åØ§tâ\u0092C»þa®½¸Ð\u008c\u0015".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var40 = var6;
var46 = var3++;
var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var56 = 0;
}
}
}

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var49;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "=\u0089G\t\u001fp\u0017\u0098,c#úävA¿UEì©¶\u00adÃHþ\u00942bÉ£f\u0086\u0018\u009dJï8µ\u0081ZmD]Ê~\u0080Âû©íÕYJc$Dy";
var17 = "=\u0089G\t\u001fp\u0017\u0098,c#úävA¿UEì©¶\u00adÃHþ\u00942bÉ£f\u0086\u0018\u009dJï8µ\u0081ZmD]Ê~\u0080Âû©íÕYJc$Dy".length();
var14 = ' ';
var36 = -1;
}

var37 = var15.substring(++var36, var36 + var14);
var41 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5337;
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
throw new RuntimeException("su/catlean/eg", var10);
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
throw new RuntimeException("su/catlean/eg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12552;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/eg", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/eg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
