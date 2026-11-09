package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kn extends _g {
@NotNull
public static final kn n;
static final KProperty[] T;
@NotNull
private static final cw S;
@NotNull
private static final cw z;
@NotNull
private static final cq t;
@NotNull
private static final cq y;
@NotNull
private static final cq Y;
@NotNull
private static final cs i;
@NotNull
private static final cs w;
@NotNull
private static final cs G;
@NotNull
private static final ct x;
@NotNull
private static final cw U;
@NotNull
private static final cr V;
@Nullable
private static class_6364 D;
private static boolean m;
@NotNull
private static final ab J;
private static final long a = yz.a(6183139388381466131L, -1542040225599438767L, MethodHandles.lookup().lookupClass()).a(211021558191093L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private kn(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 129223921109236L;
super(b<"d">(6152, 8391759215724332785L ^ var1), jt.z(), null, 4, null, var3);
}

private final w e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 52464296450790L;
return (w)S.E(this, var3, T[0]);
}

private final r3 Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 123235685179575L;
return (r3)z.E(this, var3, T[1]);
}

private final boolean A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10027560744056L;
return (Boolean)t.E(this, var3, T[2]);
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 28553261047430L;
return (Boolean)y.E(this, var3, T[3]);
}

private final boolean V(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 96525055924676L;
return (Boolean)Y.E(this, var6, T[4]);
}

private final Color n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 54401840830824L;
return (Color)i.E(this, var3, T[5]);
}

private final Color x(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 66032515287566L;
return (Color)w.E(this, var3, T[c<"f">(25292, 6886321005044011683L ^ var1)]);
}

private final Color W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 6594900916761L;
return (Color)G.E(this, var3, T[c<"f">(30029, 4990969382782891321L ^ var1)]);
}

private final float t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 61270252899032L;
return ((Number)x.E(this, var3, T[c<"f">(8871, 5359910448508736009L ^ var1)])).floatValue();
}

private final void s(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 31635899803321L;
x.b(this, var4, T[c<"f">(8871, 5359886841194785156L ^ var2)], var1);
}

private final gh C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 60669983799594L;
return (gh)U.E(this, var3, T[c<"f">(30967, 4687793929078553525L ^ var1)]);
}

private final nv D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 95212700929760L;
return (nv)V.E(this, var3, T[c<"f">(3434, 669220586645846511L ^ var1)]);
}

@Flow
private final void l(FrameBufferEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kn.a J
// 03: ldc2_w 123778845986472
// 06: lxor
// 07: lstore 2
// 08: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 0b: ifnull 3c
// 0e: getstatic su/catlean/kn.m Z
// 11: ifeq 3c
// 14: goto 21
// 17: ldc2_w -1678810318842501602
// 1a: lload 2
// 1b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: athrow
// 21: aload 1
// 22: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 25: checkcast net/minecraft/class_276
// 28: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.setFrameBuffer (Lnet/minecraft/class_276;)V
// 2b: aload 1
// 2c: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.cancel ()V
// 2f: goto 3c
// 32: ldc2_w -1678810318842501602
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: return
}

@Flow
private final void y(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kn.a J
// 003: ldc2_w 78887289949078
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 53941539109290
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 2751475563915
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 44841970965876
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 450004578633
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 96872820079700
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 13
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 14
// 045: pop2
// 046: dup2
// 047: ldc2_w 43694949499461
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 16
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 17
// 066: pop2
// 067: dup2
// 068: ldc2_w 37697131193835
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 122819395145300
// 072: lxor
// 073: dup2
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 20
// 07a: dup2
// 07b: bipush 16
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: l2i
// 082: istore 21
// 084: dup2
// 085: bipush 48
// 087: lshl
// 088: bipush 48
// 08a: lushr
// 08b: l2i
// 08c: istore 22
// 08e: pop2
// 08f: dup2
// 090: ldc2_w 35700910336486
// 093: lxor
// 094: lstore 23
// 096: pop2
// 097: ldc2_w -5975299206993609224
// 09a: lload 2
// 09b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: istore 25
// 0a2: aload 0
// 0a3: lload 8
// 0a5: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 0a8: getstatic su/catlean/w.OFF Lsu/catlean/w;
// 0ab: iload 25
// 0ad: ifne 0d6
// 0b0: if_acmpeq 221
// 0b3: goto 0c0
// 0b6: ldc2_w -5940918868177214688
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 0
// 0c1: lload 8
// 0c3: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 0c6: getstatic su/catlean/w.SHADER Lsu/catlean/w;
// 0c9: goto 0d6
// 0cc: ldc2_w -5940918868177214688
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: iload 25
// 0d8: ifne 12a
// 0db: if_acmpne 10f
// 0de: goto 0eb
// 0e1: ldc2_w -5940918868177214688
// 0e4: lload 2
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: aload 0
// 0ec: iload 12
// 0ee: iload 13
// 0f0: i2c
// 0f1: iload 14
// 0f3: invokespecial su/catlean/kn.i (ICI)V
// 0f6: aload 0
// 0f7: aload 1
// 0f8: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0fb: lload 10
// 0fd: dup2_x1
// 0fe: pop2
// 0ff: invokespecial su/catlean/kn.d (JLnet/minecraft/class_4587;)V
// 102: goto 10f
// 105: ldc2_w -5940918868177214688
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 0
// 110: iload 25
// 112: ifne 12e
// 115: lload 8
// 117: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 11a: getstatic su/catlean/w.SHADER Lsu/catlean/w;
// 11d: goto 12a
// 120: ldc2_w -5940918868177214688
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: if_acmpeq 221
// 12d: aload 0
// 12e: iload 15
// 130: i2c
// 131: iload 16
// 133: iload 17
// 135: i2c
// 136: invokespecial su/catlean/kn.p (CIC)Ljava/util/List;
// 139: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 13e: astore 26
// 140: aload 26
// 142: invokeinterface java/util/Iterator.hasNext ()Z 1
// 147: ifeq 221
// 14a: aload 26
// 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 151: checkcast net/minecraft/class_1542
// 154: astore 27
// 156: aload 0
// 157: lload 8
// 159: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 15c: getstatic su/catlean/n6.w [I
// 15f: swap
// 160: invokevirtual su/catlean/w.ordinal ()I
// 163: iaload
// 164: iload 25
// 166: ifne 1e5
// 169: tableswitch 177 1 2 33 127
// 180: ldc2_w -5940918868177214688
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: lload 4
// 18c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 18f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 192: aload 27
// 194: checkcast net/minecraft/class_1297
// 197: lload 18
// 199: invokevirtual su/catlean/zi.S (Lnet/minecraft/class_1297;J)Lnet/minecraft/class_238;
// 19c: aload 0
// 19d: lload 6
// 19f: invokespecial su/catlean/kn.W (J)Ljava/awt/Color;
// 1a2: aconst_null
// 1a3: bipush 4
// 1a4: aconst_null
// 1a5: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1a8: pop
// 1a9: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1ac: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1af: aload 27
// 1b1: checkcast net/minecraft/class_1297
// 1b4: lload 18
// 1b6: invokevirtual su/catlean/zi.S (Lnet/minecraft/class_1297;J)Lnet/minecraft/class_238;
// 1b9: lload 23
// 1bb: dup2_x1
// 1bc: pop2
// 1bd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1c0: aload 0
// 1c1: lload 6
// 1c3: invokespecial su/catlean/kn.W (J)Ljava/awt/Color;
// 1c6: iload 20
// 1c8: i2c
// 1c9: iload 21
// 1cb: fconst_1
// 1cc: iload 22
// 1ce: i2s
// 1cf: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1d2: aconst_null
// 1d3: bipush 4
// 1d4: aconst_null
// 1d5: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1d8: goto 1e5
// 1db: ldc2_w -5940918868177214688
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: goto 21b
// 1e8: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1eb: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1ee: aload 27
// 1f0: checkcast net/minecraft/class_1297
// 1f3: lload 18
// 1f5: invokevirtual su/catlean/zi.S (Lnet/minecraft/class_1297;J)Lnet/minecraft/class_238;
// 1f8: lload 23
// 1fa: dup2_x1
// 1fb: pop2
// 1fc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1ff: aload 0
// 200: lload 6
// 202: invokespecial su/catlean/kn.W (J)Ljava/awt/Color;
// 205: iload 20
// 207: i2c
// 208: iload 21
// 20a: fconst_1
// 20b: iload 22
// 20d: i2s
// 20e: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 211: aconst_null
// 212: bipush 4
// 213: aconst_null
// 214: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 217: goto 21b
// 21a: return
// 21b: pop
// 21c: iload 25
// 21e: ifeq 140
// 221: return
}

@Flow
private final void O(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kn.a J
// 003: ldc2_w 40215505063798
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 107394159409515
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 18725253110305
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 138176798285300
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 88725097034106
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 92265823979946
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 98702045089973
// 030: lxor
// 031: dup2
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 32
// 03b: lshl
// 03c: bipush 32
// 03e: lushr
// 03f: l2i
// 040: istore 15
// 042: pop2
// 043: dup2
// 044: ldc2_w 56737149917878
// 047: lxor
// 048: dup2
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 16
// 04f: dup2
// 050: bipush 16
// 052: lshl
// 053: bipush 48
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 32
// 05c: lshl
// 05d: bipush 32
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: pop2
// 064: dup2
// 065: ldc2_w 81221094238964
// 068: lxor
// 069: lstore 19
// 06b: dup2
// 06c: ldc2_w 123752605904222
// 06f: lxor
// 070: lstore 21
// 072: dup2
// 073: ldc2_w 23186172915399
// 076: lxor
// 077: dup2
// 078: bipush 32
// 07a: lushr
// 07b: l2i
// 07c: istore 23
// 07e: dup2
// 07f: bipush 32
// 081: lshl
// 082: bipush 48
// 084: lushr
// 085: l2i
// 086: istore 24
// 088: dup2
// 089: bipush 48
// 08b: lshl
// 08c: bipush 48
// 08e: lushr
// 08f: l2i
// 090: istore 25
// 092: pop2
// 093: dup2
// 094: ldc2_w 22294424200133
// 097: lxor
// 098: lstore 26
// 09a: dup2
// 09b: ldc2_w 83445103581588
// 09e: lxor
// 09f: lstore 28
// 0a1: dup2
// 0a2: ldc2_w 54472846297579
// 0a5: lxor
// 0a6: lstore 30
// 0a8: dup2
// 0a9: ldc2_w 43111415995105
// 0ac: lxor
// 0ad: lstore 32
// 0af: dup2
// 0b0: ldc2_w 40093019295403
// 0b3: lxor
// 0b4: lstore 34
// 0b6: dup2
// 0b7: ldc2_w 75079598634156
// 0ba: lxor
// 0bb: lstore 36
// 0bd: dup2
// 0be: ldc2_w 97159619742076
// 0c1: lxor
// 0c2: lstore 38
// 0c4: dup2
// 0c5: ldc2_w 127386443941612
// 0c8: lxor
// 0c9: lstore 40
// 0cb: dup2
// 0cc: ldc2_w 73608213992197
// 0cf: lxor
// 0d0: lstore 42
// 0d2: dup2
// 0d3: ldc2_w 15779795389545
// 0d6: lxor
// 0d7: lstore 44
// 0d9: dup2
// 0da: ldc2_w 93637574973978
// 0dd: lxor
// 0de: lstore 46
// 0e0: dup2
// 0e1: ldc2_w 13847384197812
// 0e4: lxor
// 0e5: dup2
// 0e6: bipush 48
// 0e8: lushr
// 0e9: l2i
// 0ea: istore 48
// 0ec: dup2
// 0ed: bipush 16
// 0ef: lshl
// 0f0: bipush 32
// 0f2: lushr
// 0f3: l2i
// 0f4: istore 49
// 0f6: dup2
// 0f7: bipush 48
// 0f9: lshl
// 0fa: bipush 48
// 0fc: lushr
// 0fd: l2i
// 0fe: istore 50
// 100: pop2
// 101: dup2
// 102: ldc2_w 122314554305082
// 105: lxor
// 106: lstore 51
// 108: dup2
// 109: ldc2_w 97644899009237
// 10c: lxor
// 10d: lstore 53
// 10f: dup2
// 110: ldc2_w 34444846907033
// 113: lxor
// 114: lstore 55
// 116: dup2
// 117: ldc2_w 75391774508709
// 11a: lxor
// 11b: dup2
// 11c: bipush 48
// 11e: lushr
// 11f: l2i
// 120: istore 57
// 122: dup2
// 123: bipush 16
// 125: lshl
// 126: bipush 32
// 128: lushr
// 129: l2i
// 12a: istore 58
// 12c: dup2
// 12d: bipush 48
// 12f: lshl
// 130: bipush 48
// 132: lushr
// 133: l2i
// 134: istore 59
// 136: pop2
// 137: pop2
// 138: aload 0
// 139: lload 40
// 13b: invokespecial su/catlean/kn.K (J)Ljava/util/List;
// 13e: astore 66
// 140: ldc2_w 7634474567900674328
// 143: lload 2
// 144: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: aload 66
// 14b: checkcast java/lang/Iterable
// 14e: astore 68
// 150: istore 65
// 152: bipush 0
// 153: istore 69
// 155: aload 68
// 157: new su/catlean/ao
// 15a: dup
// 15b: invokespecial su/catlean/ao.<init> ()V
// 15e: checkcast java/util/Comparator
// 161: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 164: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 169: astore 67
// 16b: aload 67
// 16d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 172: ifeq 58d
// 175: aload 67
// 177: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 17c: checkcast su/catlean/iz
// 17f: astore 68
// 181: aload 68
// 183: invokevirtual su/catlean/iz.i ()Ljava/util/List;
// 186: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 189: checkcast net/minecraft/class_1542
// 18c: getfield net/minecraft/class_1542.field_6012 I
// 18f: iload 65
// 191: ifne 172
// 194: i2f
// 195: ldc 15.0
// 197: fdiv
// 198: fconst_1
// 199: invokestatic java/lang/Math.min (FF)F
// 19c: fstore 69
// 19e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1a1: aload 68
// 1a3: lload 32
// 1a5: invokevirtual su/catlean/iz.f (J)Lnet/minecraft/class_243;
// 1a8: lload 51
// 1aa: dup2_x1
// 1ab: pop2
// 1ac: invokevirtual su/catlean/jl.t (JLnet/minecraft/class_243;)Lorg/joml/Vector4d;
// 1af: astore 70
// 1b1: aload 68
// 1b3: lload 44
// 1b5: invokevirtual su/catlean/iz.r (J)Ljava/util/List;
// 1b8: astore 71
// 1ba: aload 70
// 1bc: ifnull 16b
// 1bf: fconst_0
// 1c0: fstore 72
// 1c2: aload 71
// 1c4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1c9: astore 73
// 1cb: aload 73
// 1cd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d2: ifeq 217
// 1d5: aload 73
// 1d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1dc: checkcast java/lang/String
// 1df: astore 74
// 1e1: lload 53
// 1e3: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 1e6: lload 36
// 1e8: aload 74
// 1ea: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 1ed: fstore 75
// 1ef: fload 75
// 1f1: iload 65
// 1f3: ifne 210
// 1f6: fload 72
// 1f8: fcmpl
// 1f9: iload 65
// 1fb: ifne 172
// 1fe: goto 20b
// 201: ldc2_w 7597008418844469184
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: ifle 1cb
// 20e: fload 75
// 210: fstore 72
// 212: iload 65
// 214: ifeq 1cb
// 217: aload 70
// 219: getfield org/joml/Vector4d.x D
// 21c: aload 70
// 21e: getfield org/joml/Vector4d.z D
// 221: aload 70
// 223: getfield org/joml/Vector4d.x D
// 226: dsub
// 227: d2f
// 228: fconst_2
// 229: fdiv
// 22a: f2d
// 22b: dadd
// 22c: fload 72
// 22e: bipush 2
// 22f: i2f
// 230: fdiv
// 231: f2d
// 232: dsub
// 233: d2f
// 234: fstore 73
// 236: aload 0
// 237: lload 8
// 239: invokespecial su/catlean/kn.z (J)Z
// 23c: ifeq 297
// 23f: getstatic su/catlean/kn.J Lsu/catlean/ab;
// 242: aload 1
// 243: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 246: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 249: dup
// 24a: sipush 11330
// 24d: ldc2_w 680128888190730836
// 250: lload 2
// 251: lxor
// 252: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 25a: fload 73
// 25c: ldc 3.0
// 25e: fsub
// 25f: aload 70
// 261: getfield org/joml/Vector4d.y D
// 264: fconst_1
// 265: f2d
// 266: dsub
// 267: ldc 12.0
// 269: aload 71
// 26b: invokeinterface java/util/List.size ()I 1
// 270: i2f
// 271: fmul
// 272: f2d
// 273: dsub
// 274: d2f
// 275: fload 72
// 277: ldc 5.0
// 279: fadd
// 27a: ldc 12.0
// 27c: aload 71
// 27e: invokeinterface java/util/List.size ()I 1
// 283: i2f
// 284: fmul
// 285: fload 69
// 287: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 28a: goto 297
// 28d: ldc2_w 7597008418844469184
// 290: lload 2
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: aload 71
// 299: checkcast java/lang/Iterable
// 29c: astore 74
// 29e: bipush 0
// 29f: istore 75
// 2a1: bipush 0
// 2a2: istore 76
// 2a4: aload 74
// 2a6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2ab: astore 77
// 2ad: aload 77
// 2af: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2b4: ifeq 410
// 2b7: aload 77
// 2b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2be: astore 78
// 2c0: iload 76
// 2c2: iinc 76 1
// 2c5: istore 79
// 2c7: iload 79
// 2c9: iload 65
// 2cb: ifne 41d
// 2ce: iload 65
// 2d0: ifne 2f5
// 2d3: goto 2e0
// 2d6: ldc2_w 7597008418844469184
// 2d9: lload 2
// 2da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2df: athrow
// 2e0: ifge 2f3
// 2e3: goto 2f0
// 2e6: ldc2_w 7597008418844469184
// 2e9: lload 2
// 2ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ef: athrow
// 2f0: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 2f3: iload 79
// 2f5: aload 78
// 2f7: checkcast java/lang/String
// 2fa: astore 80
// 2fc: istore 81
// 2fe: bipush 0
// 2ff: istore 82
// 301: iload 65
// 303: ifne 40b
// 306: getstatic su/catlean/kn.n Lsu/catlean/kn;
// 309: lload 8
// 30b: invokespecial su/catlean/kn.z (J)Z
// 30e: ifne 387
// 311: goto 31e
// 314: ldc2_w 7597008418844469184
// 317: lload 2
// 318: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31d: athrow
// 31e: getstatic su/catlean/kn.J Lsu/catlean/ab;
// 321: aload 1
// 322: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 325: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 328: dup
// 329: sipush 10600
// 32c: ldc2_w 4038036877741295469
// 32f: lload 2
// 330: lxor
// 331: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 339: fload 73
// 33b: ldc 3.0
// 33d: fsub
// 33e: fload 72
// 340: fconst_2
// 341: fdiv
// 342: fadd
// 343: lload 53
// 345: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 348: lload 36
// 34a: aload 80
// 34c: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 34f: fconst_2
// 350: fdiv
// 351: fsub
// 352: aload 70
// 354: getfield org/joml/Vector4d.y D
// 357: ldc 13.0
// 359: f2d
// 35a: dsub
// 35b: ldc 12.0
// 35d: iload 81
// 35f: i2f
// 360: fmul
// 361: f2d
// 362: dsub
// 363: d2f
// 364: lload 53
// 366: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 369: lload 36
// 36b: aload 80
// 36d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 370: ldc 5.0
// 372: fadd
// 373: ldc 12.0
// 375: fload 69
// 377: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 37a: goto 387
// 37d: ldc2_w 7597008418844469184
// 380: lload 2
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: lload 53
// 389: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 38c: aload 1
// 38d: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 390: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 393: dup
// 394: sipush 10600
// 397: ldc2_w 4038036877741295469
// 39a: lload 2
// 39b: lxor
// 39c: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a4: aload 80
// 3a6: fload 73
// 3a8: fconst_1
// 3a9: fsub
// 3aa: fload 72
// 3ac: fconst_2
// 3ad: fdiv
// 3ae: fadd
// 3af: lload 53
// 3b1: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 3b4: lload 36
// 3b6: aload 80
// 3b8: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 3bb: fconst_2
// 3bc: fdiv
// 3bd: fsub
// 3be: aload 70
// 3c0: getfield org/joml/Vector4d.y D
// 3c3: d2f
// 3c4: ldc 13.0
// 3c6: fsub
// 3c7: ldc 12.0
// 3c9: iload 81
// 3cb: i2f
// 3cc: fmul
// 3cd: fsub
// 3ce: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3d1: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3d4: dup
// 3d5: sipush 31999
// 3d8: ldc2_w 6305493722859000559
// 3db: lload 2
// 3dc: lxor
// 3dd: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e5: iload 48
// 3e7: i2c
// 3e8: iload 49
// 3ea: fload 69
// 3ec: iload 50
// 3ee: i2s
// 3ef: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3f2: lload 10
// 3f4: dup2_x1
// 3f5: pop2
// 3f6: bipush 0
// 3f7: bipush 0
// 3f8: sipush 16769
// 3fb: ldc2_w 4510531768679735080
// 3fe: lload 2
// 3ff: lxor
// 400: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 405: aconst_null
// 406: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 409: nop
// 40a: nop
// 40b: iload 65
// 40d: ifeq 2ad
// 410: nop
// 411: aload 0
// 412: iload 16
// 414: i2c
// 415: iload 17
// 417: i2s
// 418: iload 18
// 41a: invokespecial su/catlean/kn.V (CSI)Z
// 41d: iload 65
// 41f: ifne 172
// 422: ifeq 16b
// 425: aload 68
// 427: invokevirtual su/catlean/iz.i ()Ljava/util/List;
// 42a: checkcast java/lang/Iterable
// 42d: astore 75
// 42f: bipush 0
// 430: istore 76
// 432: aload 75
// 434: astore 77
// 436: new java/util/ArrayList
// 439: dup
// 43a: invokespecial java/util/ArrayList.<init> ()V
// 43d: checkcast java/util/Collection
// 440: astore 78
// 442: bipush 0
// 443: istore 79
// 445: aload 77
// 447: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 44c: astore 80
// 44e: aload 80
// 450: invokeinterface java/util/Iterator.hasNext ()Z 1
// 455: ifeq 4eb
// 458: aload 80
// 45a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 45f: astore 81
// 461: aload 81
// 463: checkcast net/minecraft/class_1542
// 466: astore 82
// 468: bipush 0
// 469: istore 83
// 46b: aload 82
// 46d: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 470: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 473: instanceof net/minecraft/class_1747
// 476: iload 65
// 478: ifne 172
// 47b: iload 65
// 47d: ifne 4bf
// 480: ifeq 4d8
// 483: goto 490
// 486: ldc2_w 7597008418844469184
// 489: lload 2
// 48a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48f: athrow
// 490: aload 82
// 492: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 495: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 498: dup
// 499: sipush 4477
// 49c: ldc2_w 7566025468608659276
// 49f: lload 2
// 4a0: lxor
// 4a1: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 4a9: checkcast net/minecraft/class_1747
// 4ac: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 4af: instanceof net/minecraft/class_2480
// 4b2: goto 4bf
// 4b5: ldc2_w 7597008418844469184
// 4b8: lload 2
// 4b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4be: athrow
// 4bf: iload 65
// 4c1: ifne 4d5
// 4c4: ifeq 4d8
// 4c7: goto 4d4
// 4ca: ldc2_w 7597008418844469184
// 4cd: lload 2
// 4ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d3: athrow
// 4d4: bipush 1
// 4d5: goto 4d9
// 4d8: bipush 0
// 4d9: ifeq 44e
// 4dc: aload 78
// 4de: aload 81
// 4e0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 4e5: pop
// 4e6: iload 65
// 4e8: ifeq 44e
// 4eb: aload 78
// 4ed: checkcast java/util/List
// 4f0: nop
// 4f1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 4f6: astore 74
// 4f8: aload 74
// 4fa: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4ff: ifeq 16b
// 502: aload 74
// 504: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 509: checkcast net/minecraft/class_1542
// 50c: astore 75
// 50e: aload 1
// 50f: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 512: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 515: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 518: pop
// 519: aload 1
// 51a: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 51d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 520: aload 70
// 522: getfield org/joml/Vector4d.x D
// 525: d2f
// 526: ldc 58.2
// 528: fsub
// 529: aload 70
// 52b: getfield org/joml/Vector4d.y D
// 52e: d2f
// 52f: ldc 4.0
// 531: fsub
// 532: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 535: pop
// 536: aload 1
// 537: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 53a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 53d: ldc 0.6
// 53f: invokevirtual org/joml/Matrix3x2fStack.scale (F)Lorg/joml/Matrix3x2f;
// 542: pop
// 543: aload 0
// 544: aload 1
// 545: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 548: aload 75
// 54a: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 54d: dup
// 54e: sipush 31576
// 551: ldc2_w 722237518298043730
// 554: lload 2
// 555: lxor
// 556: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 55e: fconst_1
// 55f: lload 21
// 561: dup2_x2
// 562: pop2
// 563: invokespecial su/catlean/kn.y (Lnet/minecraft/class_332;JLnet/minecraft/class_1799;F)V
// 566: aload 1
// 567: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 56a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 56d: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 570: pop
// 571: iload 65
// 573: ifne 1ba
// 576: iload 65
// 578: ifne 5cd
// 57b: iload 65
// 57d: ifeq 4f8
// 580: goto 58d
// 583: ldc2_w 7597008418844469184
// 586: lload 2
// 587: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58c: athrow
// 58d: getstatic su/catlean/kn.J Lsu/catlean/ab;
// 590: aload 1
// 591: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 594: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 597: dup
// 598: sipush 10600
// 59b: ldc2_w 4038036877741295469
// 59e: lload 2
// 59f: lxor
// 5a0: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5a8: aload 0
// 5a9: lload 46
// 5ab: invokespecial su/catlean/kn.n (J)Ljava/awt/Color;
// 5ae: aload 0
// 5af: lload 38
// 5b1: invokespecial su/catlean/kn.x (J)Ljava/awt/Color;
// 5b4: iload 14
// 5b6: swap
// 5b7: iload 15
// 5b9: bipush 1
// 5ba: invokevirtual su/catlean/ab.w (Lorg/joml/Matrix3x2fStack;Ljava/awt/Color;ILjava/awt/Color;IZ)V
// 5bd: lload 53
// 5bf: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 5c2: iload 23
// 5c4: iload 24
// 5c6: i2c
// 5c7: iload 25
// 5c9: i2s
// 5ca: invokevirtual su/catlean/c6.g (ICS)V
// 5cd: aload 0
// 5ce: lload 28
// 5d0: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 5d3: getstatic su/catlean/w.FRAME Lsu/catlean/w;
// 5d6: if_acmpne 7ed
// 5d9: new su/catlean/g7
// 5dc: dup
// 5dd: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 5e0: dup
// 5e1: sipush 6303
// 5e4: ldc2_w 577544051247101581
// 5e7: lload 2
// 5e8: lxor
// 5e9: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5f1: aload 0
// 5f2: iload 57
// 5f4: i2c
// 5f5: iload 58
// 5f7: iload 59
// 5f9: i2c
// 5fa: invokespecial su/catlean/kn.p (CIC)Ljava/util/List;
// 5fd: invokeinterface java/util/List.size ()I 1
// 602: sipush 7279
// 605: ldc2_w 3193370111088706256
// 608: lload 2
// 609: lxor
// 60a: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60f: imul
// 610: bipush 0
// 611: bipush 4
// 612: aconst_null
// 613: astore 60
// 615: istore 61
// 617: istore 62
// 619: istore 63
// 61b: astore 64
// 61d: lload 19
// 61f: aload 64
// 621: iload 63
// 623: iload 62
// 625: iload 61
// 627: aload 60
// 629: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 62c: astore 67
// 62e: aload 0
// 62f: iload 57
// 631: i2c
// 632: iload 58
// 634: iload 59
// 636: i2c
// 637: invokespecial su/catlean/kn.p (CIC)Ljava/util/List;
// 63a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 63f: astore 68
// 641: aload 68
// 643: invokeinterface java/util/Iterator.hasNext ()Z 1
// 648: ifeq 7bd
// 64b: aload 68
// 64d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 652: checkcast net/minecraft/class_1542
// 655: astore 69
// 657: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 65a: lload 30
// 65c: aload 69
// 65e: checkcast net/minecraft/class_1297
// 661: invokevirtual su/catlean/jl.L (JLnet/minecraft/class_1297;)[Lnet/minecraft/class_243;
// 664: astore 70
// 666: aconst_null
// 667: astore 71
// 669: bipush 0
// 66a: istore 72
// 66c: iload 65
// 66e: ifne 7ed
// 671: aload 70
// 673: arraylength
// 674: istore 73
// 676: iload 72
// 678: iload 73
// 67a: if_icmpge 769
// 67d: aload 70
// 67f: iload 72
// 681: aaload
// 682: astore 74
// 684: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 687: new net/minecraft/class_243
// 68a: dup
// 68b: aload 74
// 68d: getfield net/minecraft/class_243.field_1352 D
// 690: aload 74
// 692: getfield net/minecraft/class_243.field_1351 D
// 695: aload 74
// 697: getfield net/minecraft/class_243.field_1350 D
// 69a: invokespecial net/minecraft/class_243.<init> (DDD)V
// 69d: lload 6
// 69f: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 6a2: astore 75
// 6a4: iload 65
// 6a6: ifne 764
// 6a9: aload 75
// 6ab: getfield net/minecraft/class_243.field_1350 D
// 6ae: dconst_0
// 6af: dcmpl
// 6b0: iload 65
// 6b2: ifne 648
// 6b5: goto 6c2
// 6b8: ldc2_w 7597008418844469184
// 6bb: lload 2
// 6bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c1: athrow
// 6c2: ifle 761
// 6c5: aload 75
// 6c7: getfield net/minecraft/class_243.field_1350 D
// 6ca: dconst_1
// 6cb: dcmpg
// 6cc: ifge 761
// 6cf: goto 6dc
// 6d2: ldc2_w 7597008418844469184
// 6d5: lload 2
// 6d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6db: athrow
// 6dc: aload 71
// 6de: iload 65
// 6e0: ifne 751
// 6e3: goto 6f0
// 6e6: ldc2_w 7597008418844469184
// 6e9: lload 2
// 6ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ef: athrow
// 6f0: ifnonnull 719
// 6f3: goto 700
// 6f6: ldc2_w 7597008418844469184
// 6f9: lload 2
// 6fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ff: athrow
// 700: new org/joml/Vector4d
// 703: dup
// 704: aload 75
// 706: getfield net/minecraft/class_243.field_1352 D
// 709: aload 75
// 70b: getfield net/minecraft/class_243.field_1351 D
// 70e: aload 75
// 710: getfield net/minecraft/class_243.field_1350 D
// 713: dconst_0
// 714: invokespecial org/joml/Vector4d.<init> (DDDD)V
// 717: astore 71
// 719: aload 71
// 71b: aload 75
// 71d: getfield net/minecraft/class_243.field_1352 D
// 720: aload 71
// 722: getfield org/joml/Vector4d.x D
// 725: invokestatic java/lang/Math.min (DD)D
// 728: putfield org/joml/Vector4d.x D
// 72b: aload 71
// 72d: aload 75
// 72f: getfield net/minecraft/class_243.field_1351 D
// 732: aload 71
// 734: getfield org/joml/Vector4d.y D
// 737: invokestatic java/lang/Math.min (DD)D
// 73a: putfield org/joml/Vector4d.y D
// 73d: aload 71
// 73f: aload 75
// 741: getfield net/minecraft/class_243.field_1352 D
// 744: aload 71
// 746: getfield org/joml/Vector4d.z D
// 749: invokestatic java/lang/Math.max (DD)D
// 74c: putfield org/joml/Vector4d.z D
// 74f: aload 71
// 751: aload 75
// 753: getfield net/minecraft/class_243.field_1351 D
// 756: aload 71
// 758: getfield org/joml/Vector4d.w D
// 75b: invokestatic java/lang/Math.max (DD)D
// 75e: putfield org/joml/Vector4d.w D
// 761: iinc 72 1
// 764: iload 65
// 766: ifeq 676
// 769: aload 71
// 76b: iload 65
// 76d: ifne 782
// 770: ifnull 641
// 773: goto 780
// 776: ldc2_w 7597008418844469184
// 779: lload 2
// 77a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77f: athrow
// 780: aload 71
// 782: getfield org/joml/Vector4d.x D
// 785: d2f
// 786: fstore 72
// 788: aload 71
// 78a: getfield org/joml/Vector4d.y D
// 78d: d2f
// 78e: fstore 73
// 790: aload 71
// 792: getfield org/joml/Vector4d.z D
// 795: d2f
// 796: fstore 74
// 798: aload 71
// 79a: getfield org/joml/Vector4d.w D
// 79d: d2f
// 79e: fstore 75
// 7a0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7a3: aload 67
// 7a5: fload 72
// 7a7: lload 34
// 7a9: fload 73
// 7ab: fload 74
// 7ad: fload 75
// 7af: aload 0
// 7b0: lload 4
// 7b2: invokespecial su/catlean/kn.W (J)Ljava/awt/Color;
// 7b5: invokevirtual su/catlean/jl.P (Lsu/catlean/g7;FJFFFLjava/awt/Color;)V
// 7b8: iload 65
// 7ba: ifeq 641
// 7bd: lload 55
// 7bf: aload 67
// 7c1: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 7c4: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 7c7: aconst_null
// 7c8: aconst_null
// 7c9: aconst_null
// 7ca: new org/joml/Matrix3x2f
// 7cd: dup
// 7ce: aload 1
// 7cf: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 7d2: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7d5: checkcast org/joml/Matrix3x2fc
// 7d8: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 7db: aconst_null
// 7dc: sipush 6994
// 7df: ldc2_w 8384356273417471466
// 7e2: lload 2
// 7e3: lxor
// 7e4: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e9: aconst_null
// 7ea: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 7ed: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 7f0: ifnull 8a3
// 7f3: aload 0
// 7f4: iload 65
// 7f6: ifne 82c
// 7f9: goto 806
// 7fc: ldc2_w 7597008418844469184
// 7ff: lload 2
// 800: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 805: athrow
// 806: lload 28
// 808: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 80b: getstatic su/catlean/w.SHADER Lsu/catlean/w;
// 80e: if_acmpne 8a3
// 811: goto 81e
// 814: ldc2_w 7597008418844469184
// 817: lload 2
// 818: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81d: athrow
// 81e: aload 0
// 81f: goto 82c
// 822: ldc2_w 7597008418844469184
// 825: lload 2
// 826: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82b: athrow
// 82c: lload 26
// 82e: invokespecial su/catlean/kn.Y (J)Lsu/catlean/r3;
// 831: getstatic su/catlean/r3.DEFAULT Lsu/catlean/r3;
// 834: if_acmpne 847
// 837: getstatic su/catlean/rw.DEFAULT Lsu/catlean/rw;
// 83a: goto 848
// 83d: ldc2_w 7597008418844469184
// 840: lload 2
// 841: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 846: athrow
// 847: aconst_null
// 848: astore 67
// 84a: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 84d: aload 67
// 84f: aload 0
// 850: lload 4
// 852: invokespecial su/catlean/kn.W (J)Ljava/awt/Color;
// 855: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 858: dup
// 859: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 85c: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 85f: dup
// 860: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 863: bipush 0
// 864: bipush 0
// 865: fconst_0
// 866: fconst_0
// 867: fconst_0
// 868: aload 0
// 869: lload 12
// 86b: invokespecial su/catlean/kn.t (J)F
// 86e: bipush 0
// 86f: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 872: dup
// 873: sipush 22759
// 876: ldc2_w 6781344323780310761
// 879: lload 2
// 87a: lxor
// 87b: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 880: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 883: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 886: dup
// 887: sipush 22759
// 88a: ldc2_w 6781344323780310761
// 88d: lload 2
// 88e: lxor
// 88f: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 894: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 897: bipush 0
// 898: lload 42
// 89a: fconst_0
// 89b: fconst_0
// 89c: fconst_0
// 89d: fconst_0
// 89e: fconst_0
// 89f: fconst_0
// 8a0: invokevirtual su/catlean/kg.d (Lsu/catlean/rw;Ljava/awt/Color;Lnet/minecraft/class_6364;Lnet/minecraft/class_6364;ZZFFFFILjava/awt/Color;Ljava/awt/Color;IJFFFFFF)V
// 8a3: return
}

private final List K(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kn.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 52763606347116
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: lstore 3
// 011: dup2
// 012: bipush 32
// 014: lshl
// 015: bipush 32
// 017: lushr
// 018: l2i
// 019: istore 5
// 01b: pop2
// 01c: dup2
// 01d: ldc2_w 55838339110494
// 020: lxor
// 021: lstore 6
// 023: dup2
// 024: ldc2_w 29772757166065
// 027: lxor
// 028: dup2
// 029: bipush 48
// 02b: lushr
// 02c: l2i
// 02d: istore 8
// 02f: dup2
// 030: bipush 16
// 032: lshl
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 9
// 039: dup2
// 03a: bipush 48
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 10
// 043: pop2
// 044: pop2
// 045: ldc2_w 5254222465493523854
// 048: lload 1
// 049: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: new java/util/ArrayList
// 051: dup
// 052: invokespecial java/util/ArrayList.<init> ()V
// 055: checkcast java/util/List
// 058: astore 13
// 05a: aload 0
// 05b: iload 8
// 05d: i2c
// 05e: iload 9
// 060: iload 10
// 062: i2c
// 063: invokespecial su/catlean/kn.p (CIC)Ljava/util/List;
// 066: astore 14
// 068: istore 12
// 06a: new java/util/ArrayList
// 06d: dup
// 06e: invokespecial java/util/ArrayList.<init> ()V
// 071: checkcast java/util/List
// 074: astore 15
// 076: aload 14
// 078: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 07d: astore 16
// 07f: aload 16
// 081: invokeinterface java/util/Iterator.hasNext ()Z 1
// 086: ifeq 1e0
// 089: aload 16
// 08b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 090: checkcast net/minecraft/class_1542
// 093: astore 17
// 095: aload 15
// 097: iload 12
// 099: ifeq 1ee
// 09c: aload 17
// 09e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 0a3: ifeq 0cb
// 0a6: goto 0b3
// 0a9: ldc2_w 5204368336100345492
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: iload 12
// 0b5: lload 1
// 0b6: lconst_0
// 0b7: lcmp
// 0b8: iflt 086
// 0bb: ifne 07f
// 0be: goto 0cb
// 0c1: ldc2_w 5204368336100345492
// 0c4: lload 1
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: new su/catlean/iz
// 0ce: dup
// 0cf: new java/util/ArrayList
// 0d2: dup
// 0d3: invokespecial java/util/ArrayList.<init> ()V
// 0d6: checkcast java/util/List
// 0d9: astore 11
// 0db: lload 3
// 0dc: iload 5
// 0de: aload 11
// 0e0: invokespecial su/catlean/iz.<init> (JILjava/util/List;)V
// 0e3: astore 18
// 0e5: aload 18
// 0e7: invokevirtual su/catlean/iz.i ()Ljava/util/List;
// 0ea: aload 17
// 0ec: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0f1: pop
// 0f2: aload 14
// 0f4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0f9: astore 19
// 0fb: aload 19
// 0fd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 102: ifeq 1cb
// 105: aload 19
// 107: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10c: checkcast net/minecraft/class_1542
// 10f: astore 20
// 111: aload 17
// 113: aload 20
// 115: lload 1
// 116: lconst_0
// 117: lcmp
// 118: ifle 152
// 11b: iload 12
// 11d: ifeq 152
// 120: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 123: lload 1
// 124: lconst_0
// 125: lcmp
// 126: ifle 1dd
// 129: iload 12
// 12b: ifeq 1da
// 12e: goto 13b
// 131: ldc2_w 5204368336100345492
// 134: lload 1
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: ifne 0fb
// 13e: goto 14b
// 141: ldc2_w 5204368336100345492
// 144: lload 1
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 17
// 14d: aload 20
// 14f: checkcast net/minecraft/class_1297
// 152: invokevirtual net/minecraft/class_1542.method_5858 (Lnet/minecraft/class_1297;)D
// 155: aload 0
// 156: lload 6
// 158: invokespecial su/catlean/kn.A (J)Z
// 15b: ifeq 16e
// 15e: ldc2_w 9.0
// 161: goto 16f
// 164: ldc2_w 5204368336100345492
// 167: lload 1
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: dconst_0
// 16f: dcmpg
// 170: iload 12
// 172: lload 1
// 173: lconst_0
// 174: lcmp
// 175: iflt 19c
// 178: ifeq 194
// 17b: ifge 0fb
// 17e: goto 18b
// 181: ldc2_w 5204368336100345492
// 184: lload 1
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: aload 15
// 18d: aload 20
// 18f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 194: lload 1
// 195: lconst_0
// 196: lcmp
// 197: ifle 1c8
// 19a: iload 12
// 19c: ifeq 1c5
// 19f: ifne 0fb
// 1a2: goto 1af
// 1a5: ldc2_w 5204368336100345492
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: aload 18
// 1b1: invokevirtual su/catlean/iz.i ()Ljava/util/List;
// 1b4: aload 20
// 1b6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1bb: pop
// 1bc: aload 15
// 1be: aload 20
// 1c0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1c5: pop
// 1c6: iload 12
// 1c8: ifne 0fb
// 1cb: aload 13
// 1cd: aload 18
// 1cf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1d4: lload 1
// 1d5: lconst_0
// 1d6: lcmp
// 1d7: iflt 102
// 1da: pop
// 1db: iload 12
// 1dd: ifne 07f
// 1e0: aload 13
// 1e2: checkcast java/lang/Iterable
// 1e5: lload 1
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: iflt 090
// 1eb: invokestatic kotlin/collections/CollectionsKt.distinct (Ljava/lang/Iterable;)Ljava/util/List;
// 1ee: areturn
}

private final void y(class_332 param1, long param2, class_1799 param4, float param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kn.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 81155752820577
// 00b: lxor
// 00c: lstore 6
// 00e: pop2
// 00f: ldc2_w -6695367239870909442
// 012: lload 2
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: istore 8
// 01a: iload 8
// 01c: ifne 049
// 01f: aload 4
// 021: getstatic net/minecraft/class_9334.field_49622 Lnet/minecraft/class_9331;
// 024: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 027: checkcast net/minecraft/class_9288
// 02a: dup
// 02b: ifnonnull 04a
// 02e: goto 03b
// 031: ldc2_w -6662052847058834138
// 034: lload 2
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: pop
// 03c: goto 049
// 03f: ldc2_w -6662052847058834138
// 042: lload 2
// 043: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: athrow
// 049: return
// 04a: astore 9
// 04c: aload 4
// 04e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 051: dup
// 052: sipush 987
// 055: ldc2_w 3396720896409036592
// 058: lload 2
// 059: lxor
// 05a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 062: astore 10
// 064: aload 10
// 066: instanceof net/minecraft/class_1747
// 069: iload 8
// 06b: lload 2
// 06c: lconst_0
// 06d: lcmp
// 06e: iflt 09e
// 071: ifne 09c
// 074: ifeq 0b7
// 077: goto 084
// 07a: ldc2_w -6662052847058834138
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 10
// 086: checkcast net/minecraft/class_1747
// 089: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 08c: instanceof net/minecraft/class_2480
// 08f: goto 09c
// 092: ldc2_w -6662052847058834138
// 095: lload 2
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: iload 8
// 09e: lload 2
// 09f: lconst_0
// 0a0: lcmp
// 0a1: ifle 0c9
// 0a4: ifne 0c7
// 0a7: ifne 0b8
// 0aa: goto 0b7
// 0ad: ldc2_w -6662052847058834138
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: return
// 0b8: aload 9
// 0ba: invokevirtual net/minecraft/class_9288.method_57489 ()Ljava/util/stream/Stream;
// 0bd: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
// 0c2: invokeinterface java/util/List.isEmpty ()Z 1
// 0c7: iload 8
// 0c9: ifne 102
// 0cc: ifeq 0dd
// 0cf: goto 0dc
// 0d2: ldc2_w -6662052847058834138
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: return
// 0dd: getstatic su/catlean/kn.J Lsu/catlean/ab;
// 0e0: aload 1
// 0e1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0e4: dup
// 0e5: sipush 10600
// 0e8: ldc2_w 4037936622195395979
// 0eb: lload 2
// 0ec: lxor
// 0ed: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f5: ldc 12.0
// 0f7: ldc -79.0
// 0f9: ldc 169.0
// 0fb: ldc 60.0
// 0fd: fconst_2
// 0fe: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 101: bipush 0
// 102: istore 11
// 104: bipush 0
// 105: istore 12
// 107: aload 9
// 109: invokevirtual net/minecraft/class_9288.method_57489 ()Ljava/util/stream/Stream;
// 10c: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
// 111: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 116: astore 13
// 118: aload 13
// 11a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11f: ifeq 1f2
// 122: aload 13
// 124: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 129: checkcast net/minecraft/class_1799
// 12c: astore 14
// 12e: aload 1
// 12f: aload 14
// 131: sipush 10138
// 134: ldc2_w 1935069880119669703
// 137: lload 2
// 138: lxor
// 139: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: iload 12
// 140: sipush 2756
// 143: ldc2_w 7338352021575868033
// 146: lload 2
// 147: lxor
// 148: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: imul
// 14e: iadd
// 14f: sipush 1686
// 152: ldc2_w 5048235027394532061
// 155: lload 2
// 156: lxor
// 157: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: iload 11
// 15e: sipush 10645
// 161: ldc2_w 7559438330794065371
// 164: lload 2
// 165: lxor
// 166: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: imul
// 16c: iadd
// 16d: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 170: aload 1
// 171: lload 6
// 173: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 176: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
// 179: aload 14
// 17b: sipush 4955
// 17e: ldc2_w 3677491537245538055
// 181: lload 2
// 182: lxor
// 183: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: iload 12
// 18a: sipush 10645
// 18d: ldc2_w 7559438330794065371
// 190: lload 2
// 191: lxor
// 192: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: imul
// 198: iadd
// 199: sipush 6288
// 19c: ldc2_w 8497743674336611538
// 19f: lload 2
// 1a0: lxor
// 1a1: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: iload 11
// 1a8: sipush 10645
// 1ab: ldc2_w 7559438330794065371
// 1ae: lload 2
// 1af: lxor
// 1b0: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: imul
// 1b6: iadd
// 1b7: invokevirtual net/minecraft/class_332.method_51431 (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
// 1ba: iinc 12 1
// 1bd: iload 12
// 1bf: lload 2
// 1c0: lconst_0
// 1c1: lcmp
// 1c2: iflt 1ef
// 1c5: iload 8
// 1c7: ifne 1e8
// 1ca: sipush 30278
// 1cd: ldc2_w 2463566193423540750
// 1d0: lload 2
// 1d1: lxor
// 1d2: invokedynamic f (IJ)I bsm=su/catlean/kn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: if_icmplt 118
// 1da: goto 1e7
// 1dd: ldc2_w -6662052847058834138
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: bipush 0
// 1e8: istore 12
// 1ea: iinc 11 1
// 1ed: iload 8
// 1ef: ifeq 118
// 1f2: lload 2
// 1f3: lconst_0
// 1f4: lcmp
// 1f5: ifle 118
// 1f8: return
}

private final void d(long param1, class_4587 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kn.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 98982580791190
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 87330189688773
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 6
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 7
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 8
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 12694673282228
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 9
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 32
// 041: lushr
// 042: l2i
// 043: istore 10
// 045: dup2
// 046: bipush 48
// 048: lshl
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 11
// 04f: pop2
// 050: pop2
// 051: ldc2_w -310836467331043637
// 054: lload 1
// 055: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: lload 4
// 05c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05f: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 062: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 065: dup
// 066: sipush 31062
// 069: ldc2_w 6545231271461569905
// 06c: lload 1
// 06d: lxor
// 06e: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 076: astore 13
// 078: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 07b: iload 6
// 07d: iload 7
// 07f: i2c
// 080: iload 8
// 082: invokevirtual su/catlean/zi.n (ICI)F
// 085: f2d
// 086: dstore 14
// 088: istore 12
// 08a: lload 4
// 08c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 092: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 095: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 098: dup
// 099: sipush 24764
// 09c: ldc2_w 3479393242690018453
// 09f: lload 1
// 0a0: lxor
// 0a1: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a9: checkcast java/lang/Boolean
// 0ac: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0af: istore 16
// 0b1: lload 4
// 0b3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b9: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 0bc: bipush 0
// 0bd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0c0: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 0c3: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 0c6: bipush 1
// 0c7: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 0ca: bipush 1
// 0cb: putstatic su/catlean/kn.m Z
// 0ce: invokestatic com/mojang/blaze3d/systems/RenderSystem.backupProjectionMatrix ()V
// 0d1: lload 4
// 0d3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d6: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0d9: dup
// 0da: sipush 16835
// 0dd: ldc2_w 2435656919906254311
// 0e0: lload 1
// 0e1: lxor
// 0e2: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0ea: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 0ed: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelProjectionMatrixBuffer ()Lnet/minecraft/class_11286; 1
// 0f2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0f5: invokevirtual su/catlean/zi.s ()Lorg/joml/Matrix4f;
// 0f8: invokevirtual net/minecraft/class_11286.method_71123 (Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 0fb: invokestatic com/mojang/blaze3d/systems/RenderSystem.getProjectionType ()Lnet/minecraft/class_10366;
// 0fe: invokestatic com/mojang/blaze3d/systems/RenderSystem.setProjectionMatrix (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V
// 101: aload 0
// 102: iload 9
// 104: i2c
// 105: iload 10
// 107: iload 11
// 109: i2c
// 10a: invokespecial su/catlean/kn.p (CIC)Ljava/util/List;
// 10d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 112: astore 17
// 114: aload 17
// 116: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11b: ifeq 27c
// 11e: aload 17
// 120: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 125: checkcast net/minecraft/class_1542
// 128: astore 18
// 12a: lload 4
// 12c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12f: lload 1
// 130: lconst_0
// 131: lcmp
// 132: ifle 2bf
// 135: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 138: aload 18
// 13a: checkcast net/minecraft/class_1297
// 13d: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 140: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 143: aload 13
// 145: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 148: getfield net/minecraft/class_243.field_1352 D
// 14b: aload 13
// 14d: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 150: getfield net/minecraft/class_243.field_1351 D
// 153: aload 13
// 155: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 158: getfield net/minecraft/class_243.field_1350 D
// 15b: invokevirtual net/minecraft/class_898.method_3950 (Lnet/minecraft/class_1297;Lnet/minecraft/class_4604;DDD)Z
// 15e: iload 12
// 160: ifeq 2b0
// 163: ifne 18b
// 166: goto 173
// 169: ldc2_w -325189419224140335
// 16c: lload 1
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: iload 12
// 175: lload 1
// 176: lconst_0
// 177: lcmp
// 178: iflt 11b
// 17b: ifne 114
// 17e: goto 18b
// 181: ldc2_w -325189419224140335
// 184: lload 1
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: dload 14
// 18d: aload 18
// 18f: getfield net/minecraft/class_1542.field_6038 D
// 192: aload 18
// 194: invokevirtual net/minecraft/class_1542.method_23317 ()D
// 197: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 19a: aload 13
// 19c: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 19f: getfield net/minecraft/class_243.field_1352 D
// 1a2: dsub
// 1a3: dstore 19
// 1a5: dload 14
// 1a7: aload 18
// 1a9: getfield net/minecraft/class_1542.field_5971 D
// 1ac: aload 18
// 1ae: invokevirtual net/minecraft/class_1542.method_23318 ()D
// 1b1: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 1b4: aload 13
// 1b6: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 1b9: getfield net/minecraft/class_243.field_1351 D
// 1bc: dsub
// 1bd: dstore 21
// 1bf: dload 14
// 1c1: aload 18
// 1c3: getfield net/minecraft/class_1542.field_5989 D
// 1c6: aload 18
// 1c8: invokevirtual net/minecraft/class_1542.method_23321 ()D
// 1cb: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 1ce: aload 13
// 1d0: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 1d3: getfield net/minecraft/class_243.field_1350 D
// 1d6: dsub
// 1d7: dstore 23
// 1d9: lload 4
// 1db: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1de: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 1e1: aload 18
// 1e3: checkcast net/minecraft/class_1297
// 1e6: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 1e9: aload 18
// 1eb: checkcast net/minecraft/class_1297
// 1ee: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1f1: iload 6
// 1f3: iload 7
// 1f5: i2c
// 1f6: iload 8
// 1f8: invokevirtual su/catlean/zi.n (ICI)F
// 1fb: invokevirtual net/minecraft/class_897.method_62425 (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;
// 1fe: astore 26
// 200: aload 26
// 202: sipush 21435
// 205: ldc2_w 7929775770884796331
// 208: lload 1
// 209: lxor
// 20a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 212: aload 26
// 214: checkcast net/minecraft/class_10039
// 217: astore 25
// 219: lload 4
// 21b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 21e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 221: dup
// 222: sipush 2304
// 225: ldc2_w 1808216263985935662
// 228: lload 1
// 229: lxor
// 22a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 232: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 235: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelRenderState ()Lnet/minecraft/class_11658; 1
// 23a: getfield net/minecraft/class_11658.field_63082 Lnet/minecraft/class_12075;
// 23d: dup
// 23e: sipush 13574
// 241: ldc2_w 5881597853955033389
// 244: lload 1
// 245: lxor
// 246: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24e: astore 26
// 250: lload 4
// 252: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 255: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 258: aload 25
// 25a: checkcast net/minecraft/class_10017
// 25d: aload 26
// 25f: dload 19
// 261: dload 21
// 263: dload 23
// 265: aload 3
// 266: lload 4
// 268: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 26b: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 26e: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 271: checkcast net/minecraft/class_11659
// 274: invokevirtual net/minecraft/class_898.method_72976 (Lnet/minecraft/class_10017;Lnet/minecraft/class_12075;DDDLnet/minecraft/class_4587;Lnet/minecraft/class_11659;)V
// 277: iload 12
// 279: ifne 114
// 27c: lload 4
// 27e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 281: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 284: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
// 287: invokevirtual net/minecraft/class_11684.method_73002 ()V
// 28a: lload 4
// 28c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28f: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
// 292: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
// 295: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
// 298: lload 4
// 29a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 29d: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 2a0: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 2a3: invokevirtual net/minecraft/class_11661.method_72953 ()V
// 2a6: invokestatic com/mojang/blaze3d/systems/RenderSystem.restoreProjectionMatrix ()V
// 2a9: lload 1
// 2aa: lconst_0
// 2ab: lcmp
// 2ac: ifle 2cd
// 2af: bipush 0
// 2b0: putstatic su/catlean/kn.m Z
// 2b3: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 2b6: bipush 0
// 2b7: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 2ba: lload 4
// 2bc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2bf: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2c2: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 2c5: iload 16
// 2c7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 2ca: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 2cd: return
}

private final void i(int param1, char param2, int param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/kn.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 2697739283083
// 023: lxor
// 024: lstore 6
// 026: pop2
// 027: ldc2_w 8574586799579407892
// 02a: lload 4
// 02c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: istore 8
// 033: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 036: iload 8
// 038: ifne 095
// 03b: ifnonnull 07f
// 03e: goto 04c
// 041: ldc2_w 8530355905285748940
// 044: lload 4
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: new net/minecraft/class_6364
// 04f: dup
// 050: lload 6
// 052: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 055: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 058: getfield net/minecraft/class_276.field_1482 I
// 05b: lload 6
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 063: getfield net/minecraft/class_276.field_1481 I
// 066: invokespecial net/minecraft/class_6364.<init> (II)V
// 069: putstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 06c: iload 8
// 06e: ifeq 13b
// 071: goto 07f
// 074: ldc2_w 8530355905285748940
// 077: lload 4
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: lload 6
// 081: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 084: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 087: goto 095
// 08a: ldc2_w 8530355905285748940
// 08d: lload 4
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: getfield net/minecraft/class_276.field_1482 I
// 098: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 09b: dup
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 09f: getfield net/minecraft/class_6364.field_1482 I
// 0a2: iload 2
// 0a3: iflt 0df
// 0a6: iload 8
// 0a8: ifne 0df
// 0ab: if_icmpne 0e2
// 0ae: goto 0bc
// 0b1: ldc2_w 8530355905285748940
// 0b4: lload 4
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: lload 6
// 0be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0c4: getfield net/minecraft/class_276.field_1481 I
// 0c7: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 0ca: dup
// 0cb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ce: getfield net/minecraft/class_6364.field_1481 I
// 0d1: goto 0df
// 0d4: ldc2_w 8530355905285748940
// 0d7: lload 4
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: if_icmpeq 110
// 0e2: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 0e5: dup
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e9: lload 6
// 0eb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ee: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0f1: getfield net/minecraft/class_276.field_1482 I
// 0f4: lload 6
// 0f6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f9: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0fc: getfield net/minecraft/class_276.field_1481 I
// 0ff: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 102: goto 110
// 105: ldc2_w 8530355905285748940
// 108: lload 4
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 113: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 118: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 11b: dup
// 11c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 11f: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 122: dup
// 123: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 126: bipush 0
// 127: getstatic su/catlean/kn.D Lnet/minecraft/class_6364;
// 12a: dup
// 12b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 12e: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 131: dup
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 135: dconst_1
// 136: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 13b: return
}

private final List p(char param1, int param2, char param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/kn.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 17722925168449
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 104874136527899
// 02a: lxor
// 02b: lstore 8
// 02d: pop2
// 02e: ldc2_w -8579793912500463611
// 031: lload 4
// 033: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: lload 8
// 03a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 03d: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 040: dup
// 041: sipush 27838
// 044: ldc2_w 7006400178845819800
// 047: lload 4
// 049: lxor
// 04a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 052: astore 11
// 054: istore 10
// 056: bipush 0
// 057: istore 12
// 059: aload 11
// 05b: astore 13
// 05d: new java/util/ArrayList
// 060: dup
// 061: invokespecial java/util/ArrayList.<init> ()V
// 064: checkcast java/util/Collection
// 067: astore 14
// 069: bipush 0
// 06a: istore 15
// 06c: aload 13
// 06e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 073: astore 16
// 075: aload 16
// 077: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07c: ifeq 0c9
// 07f: aload 16
// 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 086: astore 17
// 088: iload 3
// 089: iflt 0ef
// 08c: aload 17
// 08e: instanceof net/minecraft/class_1542
// 091: iload 10
// 093: ifne 0ed
// 096: iload 10
// 098: ifne 0c3
// 09b: goto 0a9
// 09e: ldc2_w -8615220990936316195
// 0a1: lload 4
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: ifeq 075
// 0ac: goto 0ba
// 0af: ldc2_w -8615220990936316195
// 0b2: lload 4
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 14
// 0bc: aload 17
// 0be: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0c3: pop
// 0c4: iload 10
// 0c6: ifeq 075
// 0c9: aload 14
// 0cb: checkcast java/util/List
// 0ce: nop
// 0cf: checkcast java/lang/Iterable
// 0d2: astore 11
// 0d4: nop
// 0d5: bipush 0
// 0d6: istore 12
// 0d8: aload 11
// 0da: astore 13
// 0dc: new java/util/ArrayList
// 0df: dup
// 0e0: invokespecial java/util/ArrayList.<init> ()V
// 0e3: checkcast java/util/Collection
// 0e6: astore 14
// 0e8: iload 2
// 0e9: iflt 0ef
// 0ec: bipush 0
// 0ed: istore 15
// 0ef: aload 13
// 0f1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f6: astore 16
// 0f8: aload 16
// 0fa: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ff: ifeq 15d
// 102: aload 16
// 104: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 109: astore 17
// 10b: aload 17
// 10d: checkcast net/minecraft/class_1542
// 110: astore 18
// 112: bipush 0
// 113: istore 19
// 115: getstatic su/catlean/kn.n Lsu/catlean/kn;
// 118: aload 18
// 11a: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 11d: dup
// 11e: sipush 987
// 121: ldc2_w 3396742937558011083
// 124: lload 4
// 126: lxor
// 127: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12f: lload 6
// 131: invokespecial su/catlean/kn.G (Lnet/minecraft/class_1799;J)Z
// 134: iload 3
// 135: ifle 15a
// 138: iload 10
// 13a: ifne 157
// 13d: ifeq 0f8
// 140: goto 14e
// 143: ldc2_w -8615220990936316195
// 146: lload 4
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 14
// 150: aload 17
// 152: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 157: pop
// 158: iload 10
// 15a: ifeq 0f8
// 15d: aload 14
// 15f: checkcast java/util/List
// 162: nop
// 163: iload 3
// 164: iflt 109
// 167: areturn
}

private final boolean G(class_1799 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kn.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 112443391900790
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 8735955930044
// 12: lxor
// 13: lstore 6
// 15: pop2
// 16: ldc2_w -7468458617559347906
// 19: lload 2
// 1a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: istore 8
// 21: aload 0
// 22: lload 6
// 24: invokespecial su/catlean/kn.C (J)Lsu/catlean/gh;
// 27: getstatic su/catlean/n6.l [I
// 2a: swap
// 2b: invokevirtual su/catlean/gh.ordinal ()I
// 2e: iaload
// 2f: iload 8
// 31: ifeq 8b
// 34: tableswitch 69 1 2 34 48
// 4c: ldc2_w -7455240344687831516
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: bipush 1
// 57: goto a5
// 5a: ldc2_w -7455240344687831516
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: aload 0
// 65: lload 4
// 67: invokespecial su/catlean/kn.D (J)Lsu/catlean/nv;
// 6a: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 6d: aload 1
// 6e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 71: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 76: goto a5
// 79: aload 0
// 7a: lload 4
// 7c: invokespecial su/catlean/kn.D (J)Lsu/catlean/nv;
// 7f: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 82: aload 1
// 83: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 86: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 8b: iload 8
// 8d: ifeq a1
// 90: ifne a4
// 93: goto a0
// 96: ldc2_w -7455240344687831516
// 99: lload 2
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: bipush 1
// a1: goto a5
// a4: bipush 0
// a5: ireturn
}

private static final boolean L() {
long var0 = a ^ 53218249091778L;
long var2 = var0 ^ 104527222029344L;

try {
if (n.e(var2) == su.catlean.w.SHADER) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -8297343425211956620L, var0);
}

return false;
}

private static final boolean w() {
long var0 = a ^ 84937004051415L;
long var2 = var0 ^ 5368308798379L;
return n.A(var2);
}

private static final boolean T() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kn.a J
// 03: ldc2_w 134222263670032
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 82217409722787
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 23523460236274
// 13: lxor
// 14: lstore 4
// 16: pop2
// 17: ldc2_w 8347631346487617212
// 1a: lload 0
// 1b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: istore 6
// 22: getstatic su/catlean/kn.n Lsu/catlean/kn;
// 25: iload 6
// 27: ifeq 51
// 2a: lload 2
// 2b: invokespecial su/catlean/kn.Y (J)Lsu/catlean/r3;
// 2e: getstatic su/catlean/r3.DEFAULT Lsu/catlean/r3;
// 31: if_acmpeq 5c
// 34: goto 41
// 37: ldc2_w 8289895909393464742
// 3a: lload 0
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: getstatic su/catlean/kn.n Lsu/catlean/kn;
// 44: goto 51
// 47: ldc2_w 8289895909393464742
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: lload 4
// 53: invokespecial su/catlean/kn.e (J)Lsu/catlean/w;
// 56: getstatic su/catlean/w.SHADER Lsu/catlean/w;
// 59: if_acmpne 6a
// 5c: bipush 1
// 5d: goto 6b
// 60: ldc2_w 8289895909393464742
// 63: lload 0
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: bipush 0
// 6b: ireturn
}

private static final boolean a() {
long var0 = a ^ 35679850799070L;
long var2 = var0 ^ 96337037486832L;

try {
if (n.C(var2) != gh.NONE) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -5060363693027379352L, var0);
}

return false;
}

static {
long var20 = a ^ 82877304273015L;
long var22 = var20 ^ 4963603141316L;
long var24 = var20 ^ 120754283419475L;
long var26 = var20 ^ 92414489466466L;
long var28 = var20 ^ 103186215475485L;
int var30 = (int)((var20 ^ 52776489538440L) >>> 48);
long var31 = (var20 ^ 52776489538440L) << 16 >>> 16;
long var33 = var20 ^ 34988357427290L;
long var35 = var20 ^ 31496455136169L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[49];
int var16 = 0;
String var15 = "ÙÿnÇwD\u00adøi©\u0000oÉ¹\u0003\u00172k\u009aBxü\u0087¸  ÆAïÇÝ1>.ÜÛX¤Òú5Î,\u008dêÏã;Æ\u000e\u001c÷Q\u00969R·0JvÙ-ÅÃäÔ[D\u0004\u0086lOf\n Ý-ï\u0085ÁA\u0012a\u00182\u0099\u009frÄ´âw\u0014»0ñ-!sJº\u009a\u0007\u0011e\u0019 0ºfdV»\u008føm%zðxôÂZÐï^ÎwÍ\u009c\u0087 2sÎ \u0001\u00adÿ\u0010\u001bR\u0017Ûf«0\u00127m\b\u0003Àþ\u0099\u0098\u0018\u00adã\rf1ÛòÁ\u000b\u008dz\u00906r¿þj\u0006¬Y\u0011D\u00adG ÀÕX4\"\u0098l\u0090\u0015ÚðÝ1E\u0082xØù\u0012`ØFÒÐ`z5\\\u0082ë\u008d\u0019\u0018Jåö\u008cU[DðNÂÚ{KÙ©\u00156öQÍ\rú!](Hãÿ\u008e\u0083\u0095\r2Ô\u0019>Ó\u0085Áj¬2ïÌ\u0082ªÌnMÔ§C!]L\u0092j\u00adê³&£Ú¿\u0083\u0010`õ\"æªVL\u001dï\u0003Ê|\u0004\u0084@Ã0(\u000fUñæ\u007fx?\u0098Ö¼tãa4\u0086«Ö¤#ó^\u0016\u0006çMØ\u008cé_Wï\u0095>?\u0010y\u000e®Bé\u000b\u0006L½À\u0082\u0000\u0018ö\u0081íÂ\fe\u0016X`¨ÜKn\u0000[h\u008aà°~þÜët8á\u0017¨´\"àg\t\u0016#«d\"¨¬\u0099¹\u0081?\u00ad\\k²ë#Í\u0011§\u008dß\u008da:$\u0013dJmè3òó`\u0017-VìÅÄ\u0019Pp¦\t'^\u0010\u009amã±\u009f×Ëf\u0013\u00974\u0090ÞOuÓ \u001e+9}ÈæÙ\u0000ÓN¿Wú\niì9e=\n\u0085´#\u0093$g]*Þ²õ\u0012 ì!ý¶èMðD\u0083¦µ\u0089}¤ðs\u000e\u0090\u0006^ñðLËs\fÍ\u0005\u008192? \u0091\u0095õëc\u00184~\u0019\bé\u008cÂ'p7ò#¾ÀÞØ·û\u0099\tÛ\u0091&ý|È ¢\u007f\u008d¼\u0098Å\u008e*¼Iß<NKÿÈ\u0080h\fMB\u00055\"CåöÎ\u0089¯\u0019¬ é\tÆK\b\u0015¼Ô©6\u0094ÿÊ;3\b1\u0003vËÎ(²Ss8P\u0091\u0098\u008e(È\u0018*\u0017_e\u0094ÿakWÙÓ\u0084\u0083&Ñ\u0010\u009f\u001b\fô\u0082È2ð\u0018æ&\u0084\u0002\u001a\u0096ûÓ\u0095\u0085\u0013B\u008aÀLìN\u0081øp?ì\u0081B 3\u0083T½,phTT\n6a \u007f¾\u001b?Yv+P\u001bùÇIõ½ã\u009bcBf\u0018Vð\u0007ö\u0017\u000e//Ö5æ@\u0003ºîÈ\u00ad¦ò`Ï\u0082\u0090\u0015\u0010´vÎø)ðý¹4\u0095\u0017b{\u0086\u00ad\u008b \u0010Å\u009f}Ìì\u0091wGáçnI¾/ÐäeÌ\u0006-¿=×\fËï«>\u0084£@F\u0095â\u001dvÃÂi\u009bV\u0082vV 6>ô\u0001\u0097b«B\u0016Å\u0098ôÛ:\u0019®\u0087»B\u0097ÈïjQ¡e\u0019÷\u008bî=ä\u008bC]®huí|°±\u0089\u0088Û!¢ðEJ\u0095ú\u000f\u0006\u0081ÉÑX3\u0004ó¢¿\u00150º\u001cÕ<ë\u000b\u0000\u0082Ô!`\u0084Áz´\u009fúX\u0094#\u008e²ñç=åN\u001c÷¿-«\u0011\u009eùÛr\u001fÜ\tÿÁ$\u0089ò¿1:@8µÂFJë¬Ð¼ëÙü\u009d\u0089 ÀË¤^\u009b0>´Nlý?ïs[<\nÏ@C\u0000 \u008a+º^\u0002×õê·±ÑÝ&l\u0086@Ë\u0011´E ³¤.\u0015h\u001dOÛpÒ__\f4õ5G\u008a\u009bZ×'CW\u008bËh\u009dw¬R/\u0010Où\u0003yÉê$÷Ùùq\u001d¬N\u0094ä \u0086^Ò\u0080Øª\u000b!)\u0095ïô1÷ù\u0088îûB\u001e¹s&fÝÇ´&Ê\u009d\u0099µ \u009e!\u0016Lxm¼Ñ\u0014T]\u008a\\\u00ad*JëRÅj\\\u0001Õ\u0011\u008eI!áS\r~ý\u0018ìh¢|\u00ad\u0097{\u0096ªÔ\u001f\u0019ô°¥@Ô¦>!ÎÄ\u009e\u008b\u0010b\u001ebµH0Z2«\u00175ü'\u0007K*(·³èÂ[kà\b-Ûuð¥î?\u009dù\u008e(\u0098±J¹\u0003ºn¬ÖtÐ6\b\u0002lüRt\\E¸ CZò`\fkjD\u0095Ç:ÍÂ\u0005\u009cb´'ïô´r\u0080Ø\u0086\u0001p\u0003ó\u0092öÚ0· k\u000fåz\u0098\u008f\u0095+U\u0080y\u009fîòa\u0003ñ+\u009d\u0013Ù½ø\u0007\rmãÙã\u009aS¥´\u0004\nw²nÓ¡5\u001cÙ;\u000fw(±Å`\u008a#Þ\u009f«Ã¥\u0099\u008e¶e$é\u008a4Lüi±\u0098@ìcÔnYPddi@BÝ¥)r\u001c \\¦;ÈÉß4PºñÂKÇAt*ÙZ°<9 ÓÏ«\u0004\fÇÄ§=%\u0010¾B:8-ûçåÃv·¶Zgøà\u0090¡(\u0018Í®(â\u008b\u0013\b§\u009bË\u001bõÊÎË\u007fçB5\u001b\u00075\"\u0002é\u008dG]o!\u0006ýìÄ\u007fì\u0002÷#ð\u0002bB±Í;ó7y»\u0098'Ë²õÒn-ò-Ö÷íDzY\u008f`Þh=59.ß\u0097á\u0090óyO\u009ak¬N\u0015\u0092\u0089Ø½\u001f\u0012\u008fÖ|\u0090µcª¶\u0012^\u0014\r\u001dP\u001eòI\u0000áPlÒtó¾\u0003ä4=VÛÂ°\u0097&2×µ2[Ï¸\u008cßÈ\u0089Ñ\u0085\u0086@ü\b.À*\u001d\u0083#\u001e.Î\u009dvm²\u0095\u001eé;>\u0010ï\n\u0018\u0006P\tôtàs\u0010èÓ²\u001eô\rÅ\u007f\u0019\u009cq\u0093}2\u009e\bµ\u0084=a:Ô\f\u0013BÇs\u000fúéiäp\u0012\u000f\u001f@üv+ÓE§zód\u0016<öR©\u009dòÿ\u008aá]\u0004î±\u00ad\u0083@ª\u0016Ô\u009c\u001bíX\u0081ÿ\u0088.2û\u0094 L\u0085\u0014tct\u0011+\u009e½\u009eÆK\u008c÷\t\ro§'Ú\u0019>\u0006\u0012]\\6\u0080\u0097ð\u008dÖ\u0014ôJ¨Ào|!\u0091ûlÚl\u0002@\u009a\u001e 8\u001a\u00adfZ\u0088ø\u001a\u0004\u00194À\u0017Ü\u0012\u00030\u0096\u0085þ¥\u000e/rþÎe{Ç\u0000úÏ#\u001b8\u0012\u009c¬\u0003Âo\u0001ne\u009ba\u00815\u0014Ë=I\u0083ÃÞm¯ëÆô9$\u0011\u0003o\u0010#5£¼p\u0081ë\t\u0085Ãò*Y\b\u0092y\u0010z\u0010½ç®õ¼ÎøÞÆ\u0087F%ÅÇ\u0080y\b31\u0094\u008c\u000f\u0088Ö7»\u0092\u0016É\u00160\u001e m\f9Ü\u0015\nØ¤Ì\u0002\u001cl(W¡É3É£ýÙ\u0089[=\u0082\u0091AÅ\u0096!¸ÿE,7d7F\u009cÿý}ÝÅ>ÆV¼¬¾Ê\u007fµI\u0082oS¶æã\u0080\u009c\u0088\u0088*Ã\u0080}a!\u00820\u0096Â\u0099a8\u0088\u008b.Y\u0088J§ï\u009c²ÛQ\u008e\u0010\u007f<Þ\u007f\u0085tìÀTZmLqsa\r5=v@I\u0006üQ\\0f¹ª^\u008dÞ\u0083^ \u0088ÆDÐÃ\u0014«\u0002Ü\u008eøú\u001c¿8íû6*\u0086¼\u0084´©¨+eÌ\u008bê?e\n\u001eBøv¢´²\u0007\u0019`8ì^ç\u0085Ý\u0010¡\u001cýMÝÙE©Xoê\u0080-(A^";
int var17 = "ÙÿnÇwD\u00adøi©\u0000oÉ¹\u0003\u00172k\u009aBxü\u0087¸  ÆAïÇÝ1>.ÜÛX¤Òú5Î,\u008dêÏã;Æ\u000e\u001c÷Q\u00969R·0JvÙ-ÅÃäÔ[D\u0004\u0086lOf\n Ý-ï\u0085ÁA\u0012a\u00182\u0099\u009frÄ´âw\u0014»0ñ-!sJº\u009a\u0007\u0011e\u0019 0ºfdV»\u008føm%zðxôÂZÐï^ÎwÍ\u009c\u0087 2sÎ \u0001\u00adÿ\u0010\u001bR\u0017Ûf«0\u00127m\b\u0003Àþ\u0099\u0098\u0018\u00adã\rf1ÛòÁ\u000b\u008dz\u00906r¿þj\u0006¬Y\u0011D\u00adG ÀÕX4\"\u0098l\u0090\u0015ÚðÝ1E\u0082xØù\u0012`ØFÒÐ`z5\\\u0082ë\u008d\u0019\u0018Jåö\u008cU[DðNÂÚ{KÙ©\u00156öQÍ\rú!](Hãÿ\u008e\u0083\u0095\r2Ô\u0019>Ó\u0085Áj¬2ïÌ\u0082ªÌnMÔ§C!]L\u0092j\u00adê³&£Ú¿\u0083\u0010`õ\"æªVL\u001dï\u0003Ê|\u0004\u0084@Ã0(\u000fUñæ\u007fx?\u0098Ö¼tãa4\u0086«Ö¤#ó^\u0016\u0006çMØ\u008cé_Wï\u0095>?\u0010y\u000e®Bé\u000b\u0006L½À\u0082\u0000\u0018ö\u0081íÂ\fe\u0016X`¨ÜKn\u0000[h\u008aà°~þÜët8á\u0017¨´\"àg\t\u0016#«d\"¨¬\u0099¹\u0081?\u00ad\\k²ë#Í\u0011§\u008dß\u008da:$\u0013dJmè3òó`\u0017-VìÅÄ\u0019Pp¦\t'^\u0010\u009amã±\u009f×Ëf\u0013\u00974\u0090ÞOuÓ \u001e+9}ÈæÙ\u0000ÓN¿Wú\niì9e=\n\u0085´#\u0093$g]*Þ²õ\u0012 ì!ý¶èMðD\u0083¦µ\u0089}¤ðs\u000e\u0090\u0006^ñðLËs\fÍ\u0005\u008192? \u0091\u0095õëc\u00184~\u0019\bé\u008cÂ'p7ò#¾ÀÞØ·û\u0099\tÛ\u0091&ý|È ¢\u007f\u008d¼\u0098Å\u008e*¼Iß<NKÿÈ\u0080h\fMB\u00055\"CåöÎ\u0089¯\u0019¬ é\tÆK\b\u0015¼Ô©6\u0094ÿÊ;3\b1\u0003vËÎ(²Ss8P\u0091\u0098\u008e(È\u0018*\u0017_e\u0094ÿakWÙÓ\u0084\u0083&Ñ\u0010\u009f\u001b\fô\u0082È2ð\u0018æ&\u0084\u0002\u001a\u0096ûÓ\u0095\u0085\u0013B\u008aÀLìN\u0081øp?ì\u0081B 3\u0083T½,phTT\n6a \u007f¾\u001b?Yv+P\u001bùÇIõ½ã\u009bcBf\u0018Vð\u0007ö\u0017\u000e//Ö5æ@\u0003ºîÈ\u00ad¦ò`Ï\u0082\u0090\u0015\u0010´vÎø)ðý¹4\u0095\u0017b{\u0086\u00ad\u008b \u0010Å\u009f}Ìì\u0091wGáçnI¾/ÐäeÌ\u0006-¿=×\fËï«>\u0084£@F\u0095â\u001dvÃÂi\u009bV\u0082vV 6>ô\u0001\u0097b«B\u0016Å\u0098ôÛ:\u0019®\u0087»B\u0097ÈïjQ¡e\u0019÷\u008bî=ä\u008bC]®huí|°±\u0089\u0088Û!¢ðEJ\u0095ú\u000f\u0006\u0081ÉÑX3\u0004ó¢¿\u00150º\u001cÕ<ë\u000b\u0000\u0082Ô!`\u0084Áz´\u009fúX\u0094#\u008e²ñç=åN\u001c÷¿-«\u0011\u009eùÛr\u001fÜ\tÿÁ$\u0089ò¿1:@8µÂFJë¬Ð¼ëÙü\u009d\u0089 ÀË¤^\u009b0>´Nlý?ïs[<\nÏ@C\u0000 \u008a+º^\u0002×õê·±ÑÝ&l\u0086@Ë\u0011´E ³¤.\u0015h\u001dOÛpÒ__\f4õ5G\u008a\u009bZ×'CW\u008bËh\u009dw¬R/\u0010Où\u0003yÉê$÷Ùùq\u001d¬N\u0094ä \u0086^Ò\u0080Øª\u000b!)\u0095ïô1÷ù\u0088îûB\u001e¹s&fÝÇ´&Ê\u009d\u0099µ \u009e!\u0016Lxm¼Ñ\u0014T]\u008a\\\u00ad*JëRÅj\\\u0001Õ\u0011\u008eI!áS\r~ý\u0018ìh¢|\u00ad\u0097{\u0096ªÔ\u001f\u0019ô°¥@Ô¦>!ÎÄ\u009e\u008b\u0010b\u001ebµH0Z2«\u00175ü'\u0007K*(·³èÂ[kà\b-Ûuð¥î?\u009dù\u008e(\u0098±J¹\u0003ºn¬ÖtÐ6\b\u0002lüRt\\E¸ CZò`\fkjD\u0095Ç:ÍÂ\u0005\u009cb´'ïô´r\u0080Ø\u0086\u0001p\u0003ó\u0092öÚ0· k\u000fåz\u0098\u008f\u0095+U\u0080y\u009fîòa\u0003ñ+\u009d\u0013Ù½ø\u0007\rmãÙã\u009aS¥´\u0004\nw²nÓ¡5\u001cÙ;\u000fw(±Å`\u008a#Þ\u009f«Ã¥\u0099\u008e¶e$é\u008a4Lüi±\u0098@ìcÔnYPddi@BÝ¥)r\u001c \\¦;ÈÉß4PºñÂKÇAt*ÙZ°<9 ÓÏ«\u0004\fÇÄ§=%\u0010¾B:8-ûçåÃv·¶Zgøà\u0090¡(\u0018Í®(â\u008b\u0013\b§\u009bË\u001bõÊÎË\u007fçB5\u001b\u00075\"\u0002é\u008dG]o!\u0006ýìÄ\u007fì\u0002÷#ð\u0002bB±Í;ó7y»\u0098'Ë²õÒn-ò-Ö÷íDzY\u008f`Þh=59.ß\u0097á\u0090óyO\u009ak¬N\u0015\u0092\u0089Ø½\u001f\u0012\u008fÖ|\u0090µcª¶\u0012^\u0014\r\u001dP\u001eòI\u0000áPlÒtó¾\u0003ä4=VÛÂ°\u0097&2×µ2[Ï¸\u008cßÈ\u0089Ñ\u0085\u0086@ü\b.À*\u001d\u0083#\u001e.Î\u009dvm²\u0095\u001eé;>\u0010ï\n\u0018\u0006P\tôtàs\u0010èÓ²\u001eô\rÅ\u007f\u0019\u009cq\u0093}2\u009e\bµ\u0084=a:Ô\f\u0013BÇs\u000fúéiäp\u0012\u000f\u001f@üv+ÓE§zód\u0016<öR©\u009dòÿ\u008aá]\u0004î±\u00ad\u0083@ª\u0016Ô\u009c\u001bíX\u0081ÿ\u0088.2û\u0094 L\u0085\u0014tct\u0011+\u009e½\u009eÆK\u008c÷\t\ro§'Ú\u0019>\u0006\u0012]\\6\u0080\u0097ð\u008dÖ\u0014ôJ¨Ào|!\u0091ûlÚl\u0002@\u009a\u001e 8\u001a\u00adfZ\u0088ø\u001a\u0004\u00194À\u0017Ü\u0012\u00030\u0096\u0085þ¥\u000e/rþÎe{Ç\u0000úÏ#\u001b8\u0012\u009c¬\u0003Âo\u0001ne\u009ba\u00815\u0014Ë=I\u0083ÃÞm¯ëÆô9$\u0011\u0003o\u0010#5£¼p\u0081ë\t\u0085Ãò*Y\b\u0092y\u0010z\u0010½ç®õ¼ÎøÞÆ\u0087F%ÅÇ\u0080y\b31\u0094\u008c\u000f\u0088Ö7»\u0092\u0016É\u00160\u001e m\f9Ü\u0015\nØ¤Ì\u0002\u001cl(W¡É3É£ýÙ\u0089[=\u0082\u0091AÅ\u0096!¸ÿE,7d7F\u009cÿý}ÝÅ>ÆV¼¬¾Ê\u007fµI\u0082oS¶æã\u0080\u009c\u0088\u0088*Ã\u0080}a!\u00820\u0096Â\u0099a8\u0088\u008b.Y\u0088J§ï\u009c²ÛQ\u008e\u0010\u007f<Þ\u007f\u0085tìÀTZmLqsa\r5=v@I\u0006üQ\\0f¹ª^\u008dÞ\u0083^ \u0088ÆDÐÃ\u0014«\u0002Ü\u008eøú\u001c¿8íû6*\u0086¼\u0084´©¨+eÌ\u008bê?e\n\u001eBøv¢´²\u0007\u0019`8ì^ç\u0085Ý\u0010¡\u001cýMÝÙE©Xoê\u0080-(A^"
.length();
char var14 = 24;
int var40 = -1;

label54:
while (true) {
String var41 = var15.substring(++var40, var40 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var41.getBytes("ISO-8859-1"));
String var52 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var52;
if ((var40 += var14) >= var17) {
b = var18;
c = new String[49];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[24];
int var3 = 0;
String var4 = "Çu±ùÀ\u0095f®¡\u0086'\u009d\u0015ÕC®Ú]¡T8ò4\u0001±k\u0083\u0005f}\u001b\u0015,\u0081£¸âB..¿ê\u009fäc\u001d\u000bÚ(°å\u0088Ð?À1ÂMt\u0006\u0082¾^`l\u0097S5\t13CÊ\u000fN1t×\u000e\u0016â\u0083ïä?á«ar#àA\u0096íýy[ÊAÞb÷\u0081ÛFºª¯(\u0093\u0082Vç\u0097z÷1jeã¬X¼\u008eÞ¢ô%©Cvjõ0¢q×\u0083Dñ\u001cëýþ°9ùÚCóÖ\u0000·BS-Ý\u0087\f{§\u0097\u0096þu¶p·\u009eÏ6\u000e×°,½";
int var5 = "Çu±ùÀ\u0095f®¡\u0086'\u009d\u0015ÕC®Ú]¡T8ò4\u0001±k\u0083\u0005f}\u001b\u0015,\u0081£¸âB..¿ê\u009fäc\u001d\u000bÚ(°å\u0088Ð?À1ÂMt\u0006\u0082¾^`l\u0097S5\t13CÊ\u000fN1t×\u000e\u0016â\u0083ïä?á«ar#àA\u0096íýy[ÊAÞb÷\u0081ÛFºª¯(\u0093\u0082Vç\u0097z÷1jeã¬X¼\u008eÞ¢ô%©Cvjõ0¢q×\u0083Dñ\u001cëýþ°9ùÚCóÖ\u0000·BS-Ý\u0087\f{§\u0097\u0096þu¶p·\u009eÏ6\u000e×°,½"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var44 = var6;
var10001 = var3++;
long var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var59 = -1;

while (true) {
long var8 = var56;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var61 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var59) {
case 0:
var44[var10001] = var61;
if (var2 >= var5) {
e = var6;
f = new Integer[24];
KProperty[] var37 = new KProperty[c<"f">(30816, 6074123030523253208L ^ var20)];
var37[0] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(26409, 2011121719105617455L ^ var20), b<"d">(11877, 1932864939288442708L ^ var20), 0)
);
var37[1] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(27286, 343580256678179726L ^ var20), b<"d">(14291, 4626499403047710418L ^ var20), 0)
);
var37[2] = Reflection.property1(new PropertyReference1Impl(kn.class, b<"d">(860, 5528363507087841865L ^ var20), b<"d">(13635, 4143988583345040457L ^ var20), 0));
var37[3] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(8044, 1540024867029124718L ^ var20), b<"d">(22263, 3611255868427128779L ^ var20), 0)
);
var37[4] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(32536, 6380142258361132565L ^ var20), b<"d">(1031, 6590584426229833023L ^ var20), 0)
);
var37[5] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(30818, 1817924608092954964L ^ var20), b<"d">(23065, 5832226295532929795L ^ var20), 0)
);
var37[c<"f">(384, 8451802203749607463L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(10269, 3856282456687292674L ^ var20), b<"d">(4425, 9078057903503378556L ^ var20), 0)
);
var37[c<"f">(20364, 6094867199163082288L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(6485, 7008140497415897181L ^ var20), b<"d">(19776, 7976352578091308159L ^ var20), 0)
);
var37[c<"f">(8871, 5359893098742598426L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kn.class, b<"d">(13848, 2680806409846238990L ^ var20), b<"d">(12258, 7278603481665124082L ^ var20), 0)
);
var37[c<"f">(30967, 4687811179199992148L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(10083, 6096726753377074784L ^ var20), b<"d">(24797, 2616988468429257167L ^ var20), 0)
);
var37[c<"f">(22814, 5803575863264161978L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kn.class, b<"d">(22668, 1777566486982541745L ^ var20), b<"d">(13571, 8886919057830226967L ^ var20), 0)
);
T = var37;
n = new kn(var33);
S = yp.L(n, b<"d">(24128, 6511903212364580701L ^ var20), su.catlean.w.OFF, null, null, c<"f">(20885, 6680978639018244152L ^ var20), null, var35);
z = yp.L(n, b<"d">(30143, 591854604398619825L ^ var20), r3.DEFAULT, null, kn::L, 4, null, var35);
t = yp.t(n, b<"d">(29019, 5866695174217197673L ^ var20), true, var28, null, null, c<"f">(11290, 4757270384721970619L ^ var20), null);
y = yp.t(n, b<"d">(26120, 4798814839715135245L ^ var20), true, var28, null, kn::w, 4, null);
Y = yp.t(n, b<"d">(22301, 2527142021542366724L ^ var20), true, var28, null, null, c<"f">(11290, 4757270384721970619L ^ var20), null);
i = yp.b(
n,
(short)var30,
b<"d">(32219, 5319138468714374343L ^ var20),
new Color(
c<"f">(7186, 2490565316517459373L ^ var20),
c<"f">(15071, 334319724606018420L ^ var20),
c<"f">(15071, 334319724606018420L ^ var20),
c<"f">(11639, 5878341717018100951L ^ var20)
),
null,
null,
c<"f">(11290, 4757270384721970619L ^ var20),
null,
var31
);
w = yp.b(n, (short)var30, b<"d">(28380, 372950792574990324L ^ var20), new Color(-1), null, null, c<"f">(11290, 4757270384721970619L ^ var20), null, var31);
G = yp.b(n, (short)var30, b<"d">(5714, 85272918677163852L ^ var20), new Color(-1), null, null, c<"f">(11290, 4757270384721970619L ^ var20), null, var31);
x = yp.k(
n, b<"d">(20622, 3926880715335682439L ^ var20), 4.0F, var24, RangesKt.rangeTo(1.0F, 4.0F), null, kn::T, c<"f">(8871, 5359893098742598426L ^ var20), null
);
U = yp.L(n, b<"d">(19761, 300849436773274678L ^ var20), gh.NONE, null, null, c<"f">(11290, 4757270384721970619L ^ var20), null, var35);
V = yp.j(var22, n, b<"d">(16716, 996502624463378559L ^ var20), new nv(null, 1, var26, null), null, kn::a, 4, null);
J = new ab();
return;
}
break;
default:
var44[var10001] = var61;
if (var2 < var5) {
continue label36;
}

var4 = "¨\u009eMã5\u0094\u008e[PL×EÞ\u000f%\u009a";
var5 = "¨\u009eMã5\u0094\u008e[PL×EÞ\u000f%\u009a".length();
var2 = 0;
}

byte var50 = var2;
var2 += 8;
var7 = var4.substring(var50, var2).getBytes("ISO-8859-1");
var44 = var6;
var10001 = var3++;
var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var59 = 0;
}
}
}

var14 = var15.charAt(var40);
break;
default:
var18[var16++] = var52;
if ((var40 += var14) < var17) {
var14 = var15.charAt(var40);
continue label54;
}

var15 = "Àþ\u0011£;\bÃ¼\u008e\u0081\u0017Ô·ú¡@\u0092®\u0091þÑÀU\u008f ±½\u008e\u0014\u009eg>±©O©A´\u009d\u009b\u0010\u001döYB\u009a°\u0004\u0082xÈ¼ÿK9eA";
var17 = "Àþ\u0011£;\bÃ¼\u008e\u0081\u0017Ô·ú¡@\u0092®\u0091þÑÀU\u008f ±½\u008e\u0014\u009eg>±©O©A´\u009d\u009b\u0010\u001döYB\u009a°\u0004\u0082xÈ¼ÿK9eA"
.length();
var14 = '(';
var40 = -1;
}

var41 = var15.substring(++var40, var40 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18135;
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
throw new RuntimeException("su/catlean/kn", var10);
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
throw new RuntimeException("su/catlean/kn" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13926;
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
throw new RuntimeException("su/catlean/kn", var14);
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
throw new RuntimeException("su/catlean/kn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
