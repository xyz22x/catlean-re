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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ClearClickMapEvent;
import su.catlean.api.event.events.network.SlowDownEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.ShouldStopSprintingEvent;
import su.catlean.api.event.events.world.SlipperinessEvent;
import su.catlean.api.event.events.world.StepOnSlimeEvent;
import su.catlean.api.event.events.world.SweetBerryBushCollisionEvent;
import su.catlean.api.event.events.world.VelocityMultiplierEvent;
import su.catlean.gofra.Flow;

public final class ug extends _g {
@NotNull
public static final ug X;
static final KProperty[] D;
@NotNull
private static final cw N;
@NotNull
private static final cq j;
@NotNull
private static final c8 o;
@NotNull
private static final cq n;
@NotNull
private static final cp C;
@NotNull
private static final cq I;
@NotNull
private static final cq J;
@NotNull
private static final cq Y;
@NotNull
private static final cq t;
@NotNull
private static final cq E;
@NotNull
private static final cq z;
@NotNull
private static final cq A;
@NotNull
private static final cq V;
@NotNull
private static final cq y;
@NotNull
private static final cq f;
private static boolean U;
private static boolean L;
private static boolean i;
private static boolean u;
private static boolean k;
private static boolean h;
private static final long a = yz.a(6582026244826530436L, 2955564986140426933L, MethodHandles.lookup().lookupClass()).a(34341136588424L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map l;

private ug(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 29043447069771L;
super(b<"o">(28609, 5194713523569258074L ^ var1), jt.V(), null, 4, null, var3);
}

@NotNull
public final l_ V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 15145721228808L;
int var5 = vm.a<"Å">(-6704371867807276163L, var1);

try {
l_ var10000 = (l_)N.E(this, var3, D[0]);
if (var5 == 0) {
vm.a<"Å">(new _g[1], -6688976815571228394L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6643842117760614161L, var1);
}
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 38125253069049L;
return (Boolean)j.E(this, var3, D[1]);
}

private final int e(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 111707768609593L;
return ((Number)o.E(this, var6, D[2])).intValue();
}

private final boolean I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 54925976152084L;
return (Boolean)n.E(this, var3, D[3]);
}

private final h l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 56700856844654L;
return (h)C.E(this, var3, D[4]);
}

private final boolean H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 86182447833625L;
return (Boolean)I.E(this, var3, D[5]);
}

private final boolean G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 122154704915261L;
return (Boolean)J.E(this, var3, D[c<"g">(16516, 8501947513074646296L ^ var1)]);
}

private final boolean w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 30233615386907L;
return (Boolean)Y.E(this, var3, D[c<"g">(4327, 6000240694172528478L ^ var1)]);
}

private final boolean x(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 128481620395370L;
return (Boolean)t.E(this, var3, D[c<"g">(14189, 1810316180487390376L ^ var1)]);
}

private final boolean D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 55525168446571L;
return (Boolean)E.E(this, var3, D[c<"g">(11589, 2769739397994456990L ^ var1)]);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 129481469560298L;
return (Boolean)z.E(this, var3, D[c<"g">(29698, 6312815145368127311L ^ var1)]);
}

private final boolean i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 80125557587954L;
return (Boolean)A.E(this, var3, D[c<"g">(12754, 7189244934317996172L ^ var1)]);
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114492857704865L;
return (Boolean)V.E(this, var3, D[c<"g">(25009, 7873455020420691646L ^ var1)]);
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114507541365884L;
return (Boolean)y.E(this, var3, D[c<"g">(12669, 7613767834278167466L ^ var1)]);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 61559029460549L;
return (Boolean)f.E(this, var3, D[c<"g">(4634, 3529679304690862847L ^ var1)]);
}

@Flow(
priority = -10
)
private final void z(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ug.a J
// 003: ldc2_w 13726879329732
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 135182081168482
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 90376360282830
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 98980747816449
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 121015217383737
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 71995806224328
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 137751486646740
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 99329949538884
// 037: lxor
// 038: lstore 16
// 03a: pop2
// 03b: ldc2_w 5188596942706399461
// 03e: lload 2
// 03f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: getstatic su/catlean/ug.L Z
// 047: putstatic su/catlean/ug.i Z
// 04a: istore 18
// 04c: getstatic su/catlean/ug.L Z
// 04f: iload 18
// 051: ifne 065
// 054: ifne 068
// 057: goto 064
// 05a: ldc2_w 5254432953918581704
// 05d: lload 2
// 05e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: athrow
// 064: bipush 1
// 065: goto 069
// 068: bipush 0
// 069: putstatic su/catlean/ug.L Z
// 06c: getstatic su/catlean/ug.u Z
// 06f: iload 18
// 071: ifne 09c
// 074: ifeq 099
// 077: goto 084
// 07a: ldc2_w 5254432953918581704
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: bipush 1
// 085: putstatic su/catlean/ug.L Z
// 088: bipush 0
// 089: putstatic su/catlean/ug.u Z
// 08c: goto 099
// 08f: ldc2_w 5254432953918581704
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: getstatic su/catlean/ug.U Z
// 09c: iload 18
// 09e: ifne 0e2
// 0a1: ifeq 0da
// 0a4: goto 0b1
// 0a7: ldc2_w 5254432953918581704
// 0aa: lload 2
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: lload 4
// 0b3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b9: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 0bc: bipush 0
// 0bd: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 0c0: lload 16
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: bipush 0
// 0c6: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 0c9: bipush 0
// 0ca: putstatic su/catlean/ug.U Z
// 0cd: goto 0da
// 0d0: ldc2_w 5254432953918581704
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: lload 16
// 0dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0df: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 0e2: iload 18
// 0e4: ifne 10c
// 0e7: ifeq 2da
// 0ea: goto 0f7
// 0ed: ldc2_w 5254432953918581704
// 0f0: lload 2
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: lload 16
// 0f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fc: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 0ff: goto 10c
// 102: ldc2_w 5254432953918581704
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: iload 18
// 10e: ifne 136
// 111: ifne 2da
// 114: goto 121
// 117: ldc2_w 5254432953918581704
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: lload 16
// 123: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 126: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 129: goto 136
// 12c: ldc2_w 5254432953918581704
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: iload 18
// 138: ifne 166
// 13b: ifne 2da
// 13e: goto 14b
// 141: ldc2_w 5254432953918581704
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 0
// 14c: lload 12
// 14e: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 151: getstatic su/catlean/b1.V [I
// 154: swap
// 155: invokevirtual su/catlean/l_.ordinal ()I
// 158: iaload
// 159: goto 166
// 15c: ldc2_w 5254432953918581704
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: tableswitch 372 1 2 22 68
// 17c: new net/minecraft/class_2868
// 17f: dup
// 180: lload 16
// 182: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 185: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 188: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 18b: invokespecial net/minecraft/class_2868.<init> (I)V
// 18e: checkcast net/minecraft/class_2596
// 191: lload 8
// 193: dup2_x1
// 194: pop2
// 195: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 198: iload 18
// 19a: ifeq 2da
// 19d: goto 1aa
// 1a0: ldc2_w 5254432953918581704
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: lload 16
// 1ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1af: invokevirtual net/minecraft/class_746.method_6058 ()Lnet/minecraft/class_1268;
// 1b2: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 1b5: if_acmpne 21f
// 1b8: goto 1c5
// 1bb: ldc2_w 5254432953918581704
// 1be: lload 2
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: new net/minecraft/class_2868
// 1c8: dup
// 1c9: lload 16
// 1cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ce: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1d1: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1d4: sipush 18623
// 1d7: ldc2_w 1815480967143373625
// 1da: lload 2
// 1db: lxor
// 1dc: invokedynamic g (IJ)I bsm=su/catlean/ug.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: irem
// 1e2: bipush 1
// 1e3: iadd
// 1e4: invokespecial net/minecraft/class_2868.<init> (I)V
// 1e7: checkcast net/minecraft/class_2596
// 1ea: lload 8
// 1ec: dup2_x1
// 1ed: pop2
// 1ee: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1f1: new net/minecraft/class_2868
// 1f4: dup
// 1f5: lload 16
// 1f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fa: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1fd: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 200: invokespecial net/minecraft/class_2868.<init> (I)V
// 203: checkcast net/minecraft/class_2596
// 206: lload 8
// 208: dup2_x1
// 209: pop2
// 20a: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 20d: iload 18
// 20f: ifeq 2da
// 212: goto 21f
// 215: ldc2_w 5254432953918581704
// 218: lload 2
// 219: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: athrow
// 21f: aload 0
// 220: lload 14
// 222: invokespecial su/catlean/ug.I (J)Z
// 225: iload 18
// 227: ifne 25c
// 22a: goto 237
// 22d: ldc2_w 5254432953918581704
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: ifeq 2da
// 23a: goto 247
// 23d: ldc2_w 5254432953918581704
// 240: lload 2
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: lload 16
// 249: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24c: invokevirtual net/minecraft/class_746.method_6048 ()I
// 24f: goto 25c
// 252: ldc2_w 5254432953918581704
// 255: lload 2
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: bipush 3
// 25d: iload 18
// 25f: ifne 288
// 262: if_icmple 2b4
// 265: goto 272
// 268: ldc2_w 5254432953918581704
// 26b: lload 2
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: lload 16
// 274: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 277: getfield net/minecraft/class_746.field_6012 I
// 27a: bipush 2
// 27b: goto 288
// 27e: ldc2_w 5254432953918581704
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: irem
// 289: iload 18
// 28b: ifne 2b1
// 28e: ifeq 2b4
// 291: goto 29e
// 294: ldc2_w 5254432953918581704
// 297: lload 2
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: aload 0
// 29f: lload 10
// 2a1: invokespecial su/catlean/ug.t (J)Z
// 2a4: goto 2b1
// 2a7: ldc2_w 5254432953918581704
// 2aa: lload 2
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: ifne 2da
// 2b4: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 2b7: fconst_0
// 2b8: lload 6
// 2ba: fconst_0
// 2bb: sipush 16516
// 2be: ldc2_w 8501868989905875722
// 2c1: lload 2
// 2c2: lxor
// 2c3: invokedynamic g (IJ)I bsm=su/catlean/ug.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: aconst_null
// 2c9: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 2cc: pop
// 2cd: goto 2da
// 2d0: ldc2_w 5254432953918581704
// 2d3: lload 2
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: return
}

@Flow
private final void H(SlipperinessEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ug.a J
// 003: ldc2_w 137854938403132
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 13118248577178
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 79590655006930
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 129191729308362
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w 3817337731333694493
// 022: lload 2
// 023: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: istore 10
// 02a: aload 0
// 02b: lload 6
// 02d: invokespecial su/catlean/ug.s (J)Z
// 030: iload 10
// 032: ifne 088
// 035: ifeq 082
// 038: goto 045
// 03b: ldc2_w 3752360448214308656
// 03e: lload 2
// 03f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: athrow
// 045: aload 1
// 046: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.getBlock ()Lnet/minecraft/class_2248;
// 049: getstatic net/minecraft/class_2246.field_10030 Lnet/minecraft/class_2248;
// 04c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 04f: iload 10
// 051: ifne 088
// 054: goto 061
// 057: ldc2_w 3752360448214308656
// 05a: lload 2
// 05b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: athrow
// 061: ifeq 082
// 064: goto 071
// 067: ldc2_w 3752360448214308656
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 1
// 072: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.cancel ()V
// 075: goto 082
// 078: ldc2_w 3752360448214308656
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: aload 0
// 083: lload 8
// 085: invokespecial su/catlean/ug.i (J)Z
// 088: iload 10
// 08a: ifne 0b4
// 08d: ifeq 17c
// 090: goto 09d
// 093: ldc2_w 3752360448214308656
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 1
// 09e: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.getBlock ()Lnet/minecraft/class_2248;
// 0a1: getstatic net/minecraft/class_2246.field_10295 Lnet/minecraft/class_2248;
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0a7: goto 0b4
// 0aa: ldc2_w 3752360448214308656
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: iload 10
// 0b6: ifne 168
// 0b9: ifne 14d
// 0bc: goto 0c9
// 0bf: ldc2_w 3752360448214308656
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 1
// 0ca: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.getBlock ()Lnet/minecraft/class_2248;
// 0cd: getstatic net/minecraft/class_2246.field_10225 Lnet/minecraft/class_2248;
// 0d0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d3: iload 10
// 0d5: ifne 168
// 0d8: goto 0e5
// 0db: ldc2_w 3752360448214308656
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: ifne 14d
// 0e8: goto 0f5
// 0eb: ldc2_w 3752360448214308656
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: aload 1
// 0f6: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.getBlock ()Lnet/minecraft/class_2248;
// 0f9: getstatic net/minecraft/class_2246.field_10384 Lnet/minecraft/class_2248;
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ff: iload 10
// 101: ifne 168
// 104: goto 111
// 107: ldc2_w 3752360448214308656
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: ifne 14d
// 114: goto 121
// 117: ldc2_w 3752360448214308656
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 1
// 122: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.getBlock ()Lnet/minecraft/class_2248;
// 125: getstatic net/minecraft/class_2246.field_10110 Lnet/minecraft/class_2248;
// 128: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 12b: iload 10
// 12d: ifne 168
// 130: goto 13d
// 133: ldc2_w 3752360448214308656
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: ifeq 17c
// 140: goto 14d
// 143: ldc2_w 3752360448214308656
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: lload 4
// 14f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 152: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 155: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 158: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 15b: goto 168
// 15e: ldc2_w 3752360448214308656
// 161: lload 2
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: ifne 17c
// 16b: aload 1
// 16c: invokevirtual su/catlean/api/event/events/world/SlipperinessEvent.cancel ()V
// 16f: goto 17c
// 172: ldc2_w 3752360448214308656
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: return
}

@Flow
private final void k(VelocityMultiplierEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ug.a J
// 03: ldc2_w 13968915959344
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 138586503724639
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 62322927978334
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 7648910568963599278
// 1b: lload 2
// 1c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: istore 8
// 23: aload 0
// 24: lload 6
// 26: invokespecial su/catlean/ug.x (J)Z
// 29: iload 8
// 2b: ifeq 7d
// 2e: ifeq 6a
// 31: goto 3e
// 34: ldc2_w 7719026991767111740
// 37: lload 2
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: aload 1
// 3f: iload 8
// 41: ifeq bf
// 44: goto 51
// 47: ldc2_w 7719026991767111740
// 4a: lload 2
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: invokevirtual su/catlean/api/event/events/world/VelocityMultiplierEvent.getBlock ()Lnet/minecraft/class_2248;
// 54: getstatic net/minecraft/class_2246.field_10114 Lnet/minecraft/class_2248;
// 57: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5a: ifne be
// 5d: goto 6a
// 60: ldc2_w 7719026991767111740
// 63: lload 2
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: aload 0
// 6b: lload 4
// 6d: invokespecial su/catlean/ug.D (J)Z
// 70: goto 7d
// 73: ldc2_w 7719026991767111740
// 76: lload 2
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: iload 8
// 7f: ifeq bb
// 82: ifeq c2
// 85: goto 92
// 88: ldc2_w 7719026991767111740
// 8b: lload 2
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: aload 1
// 93: iload 8
// 95: ifeq bf
// 98: goto a5
// 9b: ldc2_w 7719026991767111740
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: invokevirtual su/catlean/api/event/events/world/VelocityMultiplierEvent.getBlock ()Lnet/minecraft/class_2248;
// a8: getstatic net/minecraft/class_2246.field_21211 Lnet/minecraft/class_2248;
// ab: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// ae: goto bb
// b1: ldc2_w 7719026991767111740
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: ifeq c2
// be: aload 1
// bf: invokevirtual su/catlean/api/event/events/world/VelocityMultiplierEvent.cancel ()V
// c2: return
}

@Flow
private final void E(StepOnSlimeEvent var1) {
long var2 = a ^ 10822803523022L;
long var4 = var2 ^ 66881755434016L;

try {
if (this.s(var4)) {
var1.cancel();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 6980996435209896898L, var2);
}
}

@Flow
private final void W(ClearClickMapEvent var1) {
long var2 = a ^ 118287279510566L;

try {
if (h) {
var1.cancel();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -5689989139086274006L, var2);
}
}

@Flow
private final void E(KeyboardInputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ug.a J
// 003: ldc2_w 20091238917015
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 87828324947670
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 104741478072731
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 75242940077079
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -4156110711155730762
// 022: lload 2
// 023: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: istore 10
// 02a: aload 0
// 02b: iload 10
// 02d: ifne 26f
// 030: lload 6
// 032: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 035: getstatic su/catlean/l_.MATRIX Lsu/catlean/l_;
// 038: if_acmpne 261
// 03b: goto 048
// 03e: ldc2_w -4127442580331764325
// 041: lload 2
// 042: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: athrow
// 048: lload 8
// 04a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04d: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 050: iload 10
// 052: ifne 275
// 055: goto 062
// 058: ldc2_w -4127442580331764325
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: ifeq 261
// 065: goto 072
// 068: ldc2_w -4127442580331764325
// 06b: lload 2
// 06c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: athrow
// 072: lload 8
// 074: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 077: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 07a: iload 10
// 07c: ifne 275
// 07f: goto 08c
// 082: ldc2_w -4127442580331764325
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifne 261
// 08f: goto 09c
// 092: ldc2_w -4127442580331764325
// 095: lload 2
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: lload 8
// 09e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a1: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 0a4: dup
// 0a5: sipush 24499
// 0a8: ldc2_w 5561740030632375756
// 0ab: lload 2
// 0ac: lxor
// 0ad: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/ug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0b5: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 0b8: new net/minecraft/class_241
// 0bb: dup
// 0bc: lload 8
// 0be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c1: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 0c4: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 0c7: getfield net/minecraft/class_241.field_1343 F
// 0ca: bipush 5
// 0cb: i2f
// 0cc: fmul
// 0cd: lload 8
// 0cf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d2: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 0d5: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 0d8: getfield net/minecraft/class_241.field_1342 F
// 0db: bipush 5
// 0dc: i2f
// 0dd: fmul
// 0de: invokespecial net/minecraft/class_241.<init> (FF)V
// 0e1: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 0e6: lload 8
// 0e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0eb: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0ee: iload 10
// 0f0: ifne 1a8
// 0f3: goto 100
// 0f6: ldc2_w -4127442580331764325
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: ifeq 198
// 103: goto 110
// 106: ldc2_w -4127442580331764325
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: lload 8
// 112: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 115: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 118: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 11b: getfield net/minecraft/class_241.field_1342 F
// 11e: fconst_0
// 11f: fcmpg
// 120: iload 10
// 122: ifne 143
// 125: goto 132
// 128: ldc2_w -4127442580331764325
// 12b: lload 2
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: ifne 146
// 135: goto 142
// 138: ldc2_w -4127442580331764325
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 1
// 143: goto 147
// 146: bipush 0
// 147: ifne 193
// 14a: lload 8
// 14c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14f: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 152: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 155: getfield net/minecraft/class_241.field_1343 F
// 158: fconst_0
// 159: fcmpg
// 15a: iload 10
// 15c: ifne 17d
// 15f: goto 16c
// 162: ldc2_w -4127442580331764325
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: ifne 180
// 16f: goto 17c
// 172: ldc2_w -4127442580331764325
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: bipush 1
// 17d: goto 181
// 180: bipush 0
// 181: ifne 193
// 184: ldc 0.35
// 186: goto 210
// 189: ldc2_w -4127442580331764325
// 18c: lload 2
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: ldc 0.5
// 195: goto 210
// 198: lload 8
// 19a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19d: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 1a0: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 1a3: getfield net/minecraft/class_241.field_1342 F
// 1a6: fconst_0
// 1a7: fcmpg
// 1a8: iload 10
// 1aa: ifne 1be
// 1ad: ifne 1c1
// 1b0: goto 1bd
// 1b3: ldc2_w -4127442580331764325
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: bipush 1
// 1be: goto 1c2
// 1c1: bipush 0
// 1c2: ifne 20e
// 1c5: lload 8
// 1c7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ca: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 1cd: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 1d0: getfield net/minecraft/class_241.field_1343 F
// 1d3: fconst_0
// 1d4: fcmpg
// 1d5: iload 10
// 1d7: ifne 1f8
// 1da: goto 1e7
// 1dd: ldc2_w -4127442580331764325
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: ifne 1fb
// 1ea: goto 1f7
// 1ed: ldc2_w -4127442580331764325
// 1f0: lload 2
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: bipush 1
// 1f8: goto 1fc
// 1fb: bipush 0
// 1fc: ifne 20e
// 1ff: ldc 0.47
// 201: goto 210
// 204: ldc2_w -4127442580331764325
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: ldc 0.67
// 210: fstore 11
// 212: lload 8
// 214: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 217: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 21a: dup
// 21b: sipush 4325
// 21e: ldc2_w 5993060106120100503
// 221: lload 2
// 222: lxor
// 223: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/ug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 22b: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 22e: new net/minecraft/class_241
// 231: dup
// 232: lload 8
// 234: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 237: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 23a: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 23d: getfield net/minecraft/class_241.field_1343 F
// 240: fload 11
// 242: fmul
// 243: lload 8
// 245: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 248: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 24b: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 24e: getfield net/minecraft/class_241.field_1342 F
// 251: fload 11
// 253: fmul
// 254: invokespecial net/minecraft/class_241.<init> (FF)V
// 257: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 25c: iload 10
// 25e: ifeq 335
// 261: aload 0
// 262: goto 26f
// 265: ldc2_w -4127442580331764325
// 268: lload 2
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: bipush 1
// 270: lload 4
// 272: invokespecial su/catlean/ug.u (ZJ)Z
// 275: iload 10
// 277: ifne 29f
// 27a: ifeq 335
// 27d: goto 28a
// 280: ldc2_w -4127442580331764325
// 283: lload 2
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: lload 8
// 28c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 28f: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 292: goto 29f
// 295: ldc2_w -4127442580331764325
// 298: lload 2
// 299: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29e: athrow
// 29f: iload 10
// 2a1: ifne 2db
// 2a4: ifeq 335
// 2a7: goto 2b4
// 2aa: ldc2_w -4127442580331764325
// 2ad: lload 2
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: lload 8
// 2b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b9: iload 10
// 2bb: ifne 2f0
// 2be: goto 2cb
// 2c1: ldc2_w -4127442580331764325
// 2c4: lload 2
// 2c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: athrow
// 2cb: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 2ce: goto 2db
// 2d1: ldc2_w -4127442580331764325
// 2d4: lload 2
// 2d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2da: athrow
// 2db: ifne 335
// 2de: lload 8
// 2e0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e3: goto 2f0
// 2e6: ldc2_w -4127442580331764325
// 2e9: lload 2
// 2ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ef: athrow
// 2f0: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 2f3: dup
// 2f4: sipush 4325
// 2f7: ldc2_w 5993060106120100503
// 2fa: lload 2
// 2fb: lxor
// 2fc: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/ug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 304: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 307: new net/minecraft/class_241
// 30a: dup
// 30b: lload 8
// 30d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 310: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 313: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 316: getfield net/minecraft/class_241.field_1343 F
// 319: bipush 5
// 31a: i2f
// 31b: fmul
// 31c: lload 8
// 31e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 321: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 324: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 327: getfield net/minecraft/class_241.field_1342 F
// 32a: bipush 5
// 32b: i2f
// 32c: fmul
// 32d: invokespecial net/minecraft/class_241.<init> (FF)V
// 330: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 335: return
}

@Flow
private final void E(SlowDownEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ug.a J
// 03: ldc2_w 4043903741285
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 128169902509860
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 47596437775645
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 94036378360549
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 5233348502645856324
// 22: lload 2
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: istore 10
// 2a: lload 8
// 2c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2f: invokevirtual net/minecraft/class_746.method_20448 ()Z
// 32: iload 10
// 34: ifne 82
// 37: ifeq 6f
// 3a: goto 47
// 3d: ldc2_w 5209100435223898985
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: aload 0
// 48: lload 4
// 4a: invokespecial su/catlean/ug.Y (J)Z
// 4d: iload 10
// 4f: ifne 82
// 52: goto 5f
// 55: ldc2_w 5209100435223898985
// 58: lload 2
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: ifne 85
// 62: goto 6f
// 65: ldc2_w 5209100435223898985
// 68: lload 2
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: aload 0
// 70: lload 6
// 72: invokespecial su/catlean/ug.Q (J)Z
// 75: goto 82
// 78: ldc2_w 5209100435223898985
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: ifeq 96
// 85: aload 1
// 86: invokevirtual su/catlean/api/event/events/network/SlowDownEvent.cancel ()V
// 89: goto 96
// 8c: ldc2_w 5209100435223898985
// 8f: lload 2
// 90: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: athrow
// 96: return
}

@Flow
private final void D(ShouldStopSprintingEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ug.a J
// 03: ldc2_w 6074166424953
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 96906201825336
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 92003687170809
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 5868026011043516647
// 1b: lload 2
// 1c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: istore 8
// 23: aload 0
// 24: bipush 0
// 25: lload 4
// 27: invokespecial su/catlean/ug.u (ZJ)Z
// 2a: iload 8
// 2c: ifeq 54
// 2f: ifeq 68
// 32: goto 3f
// 35: ldc2_w 5788945303027610485
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: lload 6
// 41: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 44: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 47: goto 54
// 4a: ldc2_w 5788945303027610485
// 4d: lload 2
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: ifeq 68
// 57: aload 1
// 58: invokevirtual su/catlean/api/event/events/player/ShouldStopSprintingEvent.cancel ()V
// 5b: goto 68
// 5e: ldc2_w 5788945303027610485
// 61: lload 2
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: return
}

@Flow
private final void C(SweetBerryBushCollisionEvent var1) {
long var2 = a ^ 134296838485725L;
long var4 = var2 ^ 91008874519416L;

try {
if (this.z(var4)) {
var1.cancel();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 6048906830794617041L, var2);
}
}

private final boolean u(boolean param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ug.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 70873136261128
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 120139080520881
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 56737902999964
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 21593972393619
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 10
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 11
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 12
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 136327152890786
// 041: lxor
// 042: lstore 13
// 044: dup2
// 045: ldc2_w 27634274358935
// 048: lxor
// 049: lstore 15
// 04b: dup2
// 04c: ldc2_w 78955249677758
// 04f: lxor
// 050: lstore 17
// 052: dup2
// 053: ldc2_w 61962065051571
// 056: lxor
// 057: lstore 19
// 059: dup2
// 05a: ldc2_w 106450658158126
// 05d: lxor
// 05e: lstore 21
// 060: pop2
// 061: ldc2_w -5352429284302670800
// 064: lload 2
// 065: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: istore 23
// 06c: aload 0
// 06d: iload 23
// 06f: ifeq 097
// 072: lload 13
// 074: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 077: getstatic su/catlean/l_.MATRIX Lsu/catlean/l_;
// 07a: if_acmpne 096
// 07d: goto 08a
// 080: ldc2_w -5439991655956637790
// 083: lload 2
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: bipush 0
// 08b: ireturn
// 08c: ldc2_w -5439991655956637790
// 08f: lload 2
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 0
// 097: lload 19
// 099: invokespecial su/catlean/ug.H (J)Z
// 09c: iload 23
// 09e: ifeq 0fe
// 0a1: ifne 0f8
// 0a4: goto 0b1
// 0a7: ldc2_w -5439991655956637790
// 0aa: lload 2
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: lload 21
// 0b3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b6: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 0b9: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 0bc: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 0bf: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 0c4: iload 23
// 0c6: lload 2
// 0c7: lconst_0
// 0c8: lcmp
// 0c9: iflt 100
// 0cc: ifeq 0fe
// 0cf: goto 0dc
// 0d2: ldc2_w -5439991655956637790
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: ifeq 0f8
// 0df: goto 0ec
// 0e2: ldc2_w -5439991655956637790
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: bipush 0
// 0ed: ireturn
// 0ee: ldc2_w -5439991655956637790
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 0
// 0f9: lload 6
// 0fb: invokespecial su/catlean/ug.w (J)Z
// 0fe: iload 23
// 100: ifeq 15e
// 103: ifne 158
// 106: goto 113
// 109: ldc2_w -5439991655956637790
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: lload 21
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 11b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 11e: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 121: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 124: iload 23
// 126: lload 2
// 127: lconst_0
// 128: lcmp
// 129: iflt 160
// 12c: ifeq 15e
// 12f: goto 13c
// 132: ldc2_w -5439991655956637790
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: ifeq 158
// 13f: goto 14c
// 142: ldc2_w -5439991655956637790
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: bipush 0
// 14d: ireturn
// 14e: ldc2_w -5439991655956637790
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: aload 0
// 159: lload 15
// 15b: invokespecial su/catlean/ug.G (J)Z
// 15e: iload 23
// 160: ifeq 232
// 163: ifne 214
// 166: goto 173
// 169: ldc2_w -5439991655956637790
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: lload 21
// 175: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 178: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 17b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 17e: getstatic net/minecraft/class_1802.field_8399 Lnet/minecraft/class_1792;
// 181: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 184: iload 23
// 186: ifeq 213
// 189: goto 196
// 18c: ldc2_w -5439991655956637790
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: ifne 212
// 199: goto 1a6
// 19c: ldc2_w -5439991655956637790
// 19f: lload 2
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: lload 21
// 1a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ab: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 1ae: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1b1: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 1b4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1b7: iload 23
// 1b9: ifeq 213
// 1bc: goto 1c9
// 1bf: ldc2_w -5439991655956637790
// 1c2: lload 2
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: ifne 212
// 1cc: goto 1d9
// 1cf: ldc2_w -5439991655956637790
// 1d2: lload 2
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: lload 21
// 1db: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1de: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 1e1: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1e4: getstatic net/minecraft/class_1802.field_8547 Lnet/minecraft/class_1792;
// 1e7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1ea: lload 2
// 1eb: lconst_0
// 1ec: lcmp
// 1ed: ifle 232
// 1f0: iload 23
// 1f2: ifeq 232
// 1f5: goto 202
// 1f8: ldc2_w -5439991655956637790
// 1fb: lload 2
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: ifeq 214
// 205: goto 212
// 208: ldc2_w -5439991655956637790
// 20b: lload 2
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: bipush 0
// 213: ireturn
// 214: aload 0
// 215: lload 2
// 216: lconst_0
// 217: lcmp
// 218: iflt 25d
// 21b: iload 23
// 21d: ifeq 25d
// 220: lload 17
// 222: invokespecial su/catlean/ug.I (J)Z
// 225: goto 232
// 228: ldc2_w -5439991655956637790
// 22b: lload 2
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: ifne 25c
// 235: lload 21
// 237: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23a: invokevirtual net/minecraft/class_746.method_6058 ()Lnet/minecraft/class_1268;
// 23d: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 240: if_acmpne 25c
// 243: goto 250
// 246: ldc2_w -5439991655956637790
// 249: lload 2
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: bipush 0
// 251: ireturn
// 252: ldc2_w -5439991655956637790
// 255: lload 2
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: aload 0
// 25d: lload 13
// 25f: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 262: getstatic su/catlean/l_.GRIM_2 Lsu/catlean/l_;
// 265: iload 23
// 267: lload 2
// 268: lconst_0
// 269: lcmp
// 26a: ifle 364
// 26d: ifeq 35c
// 270: if_acmpne 353
// 273: goto 280
// 276: ldc2_w -5439991655956637790
// 279: lload 2
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: lload 21
// 282: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 285: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 288: iload 23
// 28a: ifeq 352
// 28d: goto 29a
// 290: ldc2_w -5439991655956637790
// 293: lload 2
// 294: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 299: athrow
// 29a: ifeq 351
// 29d: goto 2aa
// 2a0: ldc2_w -5439991655956637790
// 2a3: lload 2
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: lload 21
// 2ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2af: invokevirtual net/minecraft/class_746.method_6048 ()I
// 2b2: iload 23
// 2b4: ifeq 350
// 2b7: goto 2c4
// 2ba: ldc2_w -5439991655956637790
// 2bd: lload 2
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: lload 2
// 2c5: lconst_0
// 2c6: lcmp
// 2c7: ifle 343
// 2ca: aload 0
// 2cb: iload 10
// 2cd: i2c
// 2ce: iload 11
// 2d0: iload 12
// 2d2: i2c
// 2d3: invokespecial su/catlean/ug.e (CIC)I
// 2d6: if_icmpge 342
// 2d9: goto 2e6
// 2dc: ldc2_w -5439991655956637790
// 2df: lload 2
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: lload 21
// 2e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2eb: invokevirtual net/minecraft/class_746.method_6048 ()I
// 2ee: iload 23
// 2f0: ifeq 352
// 2f3: goto 300
// 2f6: ldc2_w -5439991655956637790
// 2f9: lload 2
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: bipush 2
// 301: if_icmpgt 351
// 304: goto 311
// 307: ldc2_w -5439991655956637790
// 30a: lload 2
// 30b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: athrow
// 311: bipush 1
// 312: putstatic su/catlean/ug.h Z
// 315: bipush 1
// 316: lload 8
// 318: bipush 0
// 319: aconst_null
// 31a: bipush 1
// 31b: sipush 8764
// 31e: ldc2_w 5584805787387571674
// 321: lload 2
// 322: lxor
// 323: invokedynamic g (IJ)I bsm=su/catlean/ug.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: aconst_null
// 329: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 32c: bipush 0
// 32d: putstatic su/catlean/ug.h Z
// 330: iload 23
// 332: ifne 351
// 335: goto 342
// 338: ldc2_w -5439991655956637790
// 33b: lload 2
// 33c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: athrow
// 342: bipush 1
// 343: goto 350
// 346: ldc2_w -5439991655956637790
// 349: lload 2
// 34a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: athrow
// 350: ireturn
// 351: bipush 0
// 352: ireturn
// 353: aload 0
// 354: lload 13
// 356: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 359: getstatic su/catlean/l_.GRIM_3 Lsu/catlean/l_;
// 35c: lload 2
// 35d: lconst_0
// 35e: lcmp
// 35f: iflt 456
// 362: iload 23
// 364: ifeq 456
// 367: if_acmpne 44d
// 36a: goto 377
// 36d: ldc2_w -5439991655956637790
// 370: lload 2
// 371: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 376: athrow
// 377: lload 21
// 379: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 37c: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 37f: iload 23
// 381: ifeq 44c
// 384: goto 391
// 387: ldc2_w -5439991655956637790
// 38a: lload 2
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: ifeq 44b
// 394: goto 3a1
// 397: ldc2_w -5439991655956637790
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: lload 21
// 3a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a6: invokevirtual net/minecraft/class_746.method_6048 ()I
// 3a9: iload 23
// 3ab: ifeq 44a
// 3ae: goto 3bb
// 3b1: ldc2_w -5439991655956637790
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: lload 2
// 3bc: lconst_0
// 3bd: lcmp
// 3be: iflt 402
// 3c1: tableswitch 136 1 3 37 76 116
// 3dc: ldc2_w -5439991655956637790
// 3df: lload 2
// 3e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e5: athrow
// 3e6: lload 21
// 3e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3eb: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 3ee: putstatic su/catlean/ug.k Z
// 3f1: lload 21
// 3f3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3f6: bipush 0
// 3f7: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 3fa: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 3fd: bipush 1
// 3fe: invokevirtual su/catlean/_6.h (Z)V
// 401: bipush 0
// 402: ireturn
// 403: ldc2_w -5439991655956637790
// 406: lload 2
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: bipush 1
// 40e: putstatic su/catlean/ug.h Z
// 411: bipush 1
// 412: lload 8
// 414: bipush 0
// 415: aconst_null
// 416: bipush 1
// 417: sipush 16516
// 41a: ldc2_w 8501826648701554528
// 41d: lload 2
// 41e: lxor
// 41f: invokedynamic g (IJ)I bsm=su/catlean/ug.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: aconst_null
// 425: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 428: bipush 0
// 429: putstatic su/catlean/ug.h Z
// 42c: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 42f: bipush 1
// 430: invokevirtual su/catlean/_6.h (Z)V
// 433: bipush 0
// 434: ireturn
// 435: lload 21
// 437: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43a: getstatic su/catlean/ug.k Z
// 43d: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 440: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 443: bipush 1
// 444: invokevirtual su/catlean/_6.h (Z)V
// 447: bipush 0
// 448: ireturn
// 449: bipush 1
// 44a: ireturn
// 44b: bipush 0
// 44c: ireturn
// 44d: aload 0
// 44e: lload 13
// 450: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 453: getstatic su/catlean/l_.GRIM_V3 Lsu/catlean/l_;
// 456: if_acmpne 5a7
// 459: lload 4
// 45b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 45e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 461: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 464: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 467: iload 23
// 469: ifeq 5a6
// 46c: goto 479
// 46f: ldc2_w -5439991655956637790
// 472: lload 2
// 473: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 478: athrow
// 479: ifne 5a5
// 47c: goto 489
// 47f: ldc2_w -5439991655956637790
// 482: lload 2
// 483: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 488: athrow
// 489: lload 21
// 48b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 48e: invokevirtual net/minecraft/class_746.method_6048 ()I
// 491: iload 23
// 493: lload 2
// 494: lconst_0
// 495: lcmp
// 496: iflt 4d0
// 499: ifeq 4ce
// 49c: goto 4a9
// 49f: ldc2_w -5439991655956637790
// 4a2: lload 2
// 4a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a8: athrow
// 4a9: bipush 3
// 4aa: if_icmpge 4c6
// 4ad: goto 4ba
// 4b0: ldc2_w -5439991655956637790
// 4b3: lload 2
// 4b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b9: athrow
// 4ba: bipush 0
// 4bb: ireturn
// 4bc: ldc2_w -5439991655956637790
// 4bf: lload 2
// 4c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c5: athrow
// 4c6: lload 21
// 4c8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4cb: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 4ce: iload 23
// 4d0: lload 2
// 4d1: lconst_0
// 4d2: lcmp
// 4d3: iflt 58c
// 4d6: ifeq 58a
// 4d9: ifeq 587
// 4dc: goto 4e9
// 4df: ldc2_w -5439991655956637790
// 4e2: lload 2
// 4e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e8: athrow
// 4e9: lload 4
// 4eb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4ee: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 4f1: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 4f4: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 4f7: iload 23
// 4f9: lload 2
// 4fa: lconst_0
// 4fb: lcmp
// 4fc: ifle 56e
// 4ff: ifeq 56c
// 502: goto 50f
// 505: ldc2_w -5439991655956637790
// 508: lload 2
// 509: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50e: athrow
// 50f: lload 2
// 510: lconst_0
// 511: lcmp
// 512: ifle 56a
// 515: ifeq 562
// 518: goto 525
// 51b: ldc2_w -5439991655956637790
// 51e: lload 2
// 51f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 524: athrow
// 525: getstatic su/catlean/ug.i Z
// 528: iload 23
// 52a: ifeq 561
// 52d: goto 53a
// 530: ldc2_w -5439991655956637790
// 533: lload 2
// 534: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 539: athrow
// 53a: lload 2
// 53b: lconst_0
// 53c: lcmp
// 53d: ifle 55d
// 540: ifeq 55c
// 543: goto 550
// 546: ldc2_w -5439991655956637790
// 549: lload 2
// 54a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54f: athrow
// 550: bipush 1
// 551: ireturn
// 552: ldc2_w -5439991655956637790
// 555: lload 2
// 556: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55b: athrow
// 55c: bipush 1
// 55d: putstatic su/catlean/ug.u Z
// 560: bipush 0
// 561: ireturn
// 562: lload 21
// 564: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 567: getfield net/minecraft/class_746.field_6012 I
// 56a: bipush 2
// 56b: irem
// 56c: iload 23
// 56e: ifeq 582
// 571: ifne 585
// 574: goto 581
// 577: ldc2_w -5439991655956637790
// 57a: lload 2
// 57b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 580: athrow
// 581: bipush 1
// 582: goto 586
// 585: bipush 0
// 586: ireturn
// 587: getstatic su/catlean/ug.L Z
// 58a: iload 23
// 58c: ifeq 5a0
// 58f: ifne 5a3
// 592: goto 59f
// 595: ldc2_w -5439991655956637790
// 598: lload 2
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: bipush 1
// 5a0: goto 5a4
// 5a3: bipush 0
// 5a4: ireturn
// 5a5: bipush 0
// 5a6: ireturn
// 5a7: lload 21
// 5a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5ac: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 5af: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 5b2: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
// 5b5: invokeinterface net/minecraft/class_9323.method_57832 (Lnet/minecraft/class_9331;)Z 2
// 5ba: iload 23
// 5bc: lload 2
// 5bd: lconst_0
// 5be: lcmp
// 5bf: ifle 5f5
// 5c2: ifeq 5f3
// 5c5: ifne 608
// 5c8: goto 5d5
// 5cb: ldc2_w -5439991655956637790
// 5ce: lload 2
// 5cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d4: athrow
// 5d5: lload 21
// 5d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5da: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 5dd: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 5e0: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 5e3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5e6: goto 5f3
// 5e9: ldc2_w -5439991655956637790
// 5ec: lload 2
// 5ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f2: athrow
// 5f3: iload 23
// 5f5: ifeq 649
// 5f8: ifeq 648
// 5fb: goto 608
// 5fe: ldc2_w -5439991655956637790
// 601: lload 2
// 602: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 607: athrow
// 608: aload 0
// 609: lload 13
// 60b: invokevirtual su/catlean/ug.V (J)Lsu/catlean/l_;
// 60e: getstatic su/catlean/l_.GRIM Lsu/catlean/l_;
// 611: if_acmpne 648
// 614: goto 621
// 617: ldc2_w -5439991655956637790
// 61a: lload 2
// 61b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 620: athrow
// 621: lload 21
// 623: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 626: invokevirtual net/minecraft/class_746.method_6058 ()Lnet/minecraft/class_1268;
// 629: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 62c: if_acmpne 648
// 62f: goto 63c
// 632: ldc2_w -5439991655956637790
// 635: lload 2
// 636: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63b: athrow
// 63c: bipush 0
// 63d: ireturn
// 63e: ldc2_w -5439991655956637790
// 641: lload 2
// 642: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 647: athrow
// 648: bipush 1
// 649: ireturn
}

private static final boolean L() {
long var0 = a ^ 80217981336661L;
long var2 = var0 ^ 6545160576601L;

try {
if (X.V(var2) == l_.GRIM) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 6447530033004182105L, var0);
}

return false;
}

private static final boolean E() {
long var0 = a ^ 33115029903690L;
long var2 = var0 ^ 91366506412870L;

try {
if (X.V(var2) == l_.GRIM_2) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 8963689984220487494L, var0);
}

return false;
}

static {
long var20 = a ^ 81621406217125L;
long var22 = var20 ^ 63131630436047L;
long var24 = var20 ^ 30247521243544L;
long var26 = var20 ^ 57334121028862L;
long var10001 = var20 ^ 31958837216426L;
int var28 = (int)((var20 ^ 31958837216426L) >>> 48);
int var29 = (int)((var20 ^ 31958837216426L) << 16 >>> 32);
int var30 = (int)(var10001 << 48 >>> 48);
long var31 = var20 ^ 100052110371628L;
long var33 = var20 ^ 124677389573943L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[48];
int var16 = 0;
String var15 = "ce\u0006óóZ\u0098É(Ø×\u00029\u009aLúð\u009e\u000fW\u009c}ÃÐç\u0082\u0085b^\u0086¢\u00840 \u008a \\E:,êâ`Ó ¤'Q\u00135=¨¨nc\u0002\u009e\u0006»\u0015\u008eT\u009cÐÔÖ½DG\"ÓL}\u008a|\u0089¸#5   +\u008c\u0090\u008fà\u0013À¯RKÉV\u0098G¡¶z]ÔaÖ4m\u0003ñ&TÔë\u00adék 6>\u0010ÑýÛ8Aé0&<QRU¼2û¾\u0086 ¬4»\u001d\u0098&t|\u0004\tØ V¯\u0093¼®\u009e\u0003LÔo\u0093§\u0004¡<\u00075Pú\u0018Âìä\ráA\u007f§\u008fÀ£\u007f\u00180Ïf_ð¬F³q\u0082\f-©\u008d_\u0002\u0006-è\u0084ÃÅ¬Á\u0018pÛ\u008dÍÎ×];\u009bÊG\u0010\u0018\u009d1MØ\u009e\u0089\u001fY«ñâ\u0010RW\u0096%\u0007èk¤Ì\u0015Ë\u009dÁ\u009d\u0083V\u0010\u00884mo\u0005ßí\u0099¸X0\u0002»·A/\u0010Î5®\u009cñÙH&\u009e.u¶ÎnJò03|ëÅ\u0018±h½\u009c<©Sqúe(:ó$ÿLQ\u0007~\u009449ÅøN\u009a\u008eJ\u0002ÑÜ\u0006{\u009d\u0087 \u0007\u0096ý\u0007¹\u008dÜ \u0010ÞÙÊ1[\u009a/C½ñ\u0012¼\u008b=é¬ÉÄÃÆ+t\u0099\u0018gÍ¯«:<Ý\u00104\t\u0087¶\u0018¤c£\u008a\u008e\u009f\u0012\u000e-|\u0010\u0010y\u000bP)-Ã¤£\u009f±R\u0017\u0096\u008dj\u009e\u00104Ó\u007fg\u0017u²,§=5tT\t\u00ad©\u0018Ï\u0015 \u0082C\u0094¬åý[É\u0000^¹\u008b.æÓWR\u0010ãg° Ü\u0089Ï\u0002\u0082Ô\u009bPÌó\u0092WÅÁ¯<\f×ì\u0090\u008d\u0098°=¸ár\u001ckNG= <º\t$7É?±µ\u0007Ú\u0093gìáøU?´x\u0095*å\n\u0095Ú\u001d2$½¬£ \u0000ä\u0085ô£\u001c)$Ø\nÁíªâp8\u0019qSç³\u0012\u0006ê½-({¢øÖ¡ ®øÚâË\u0086\u007f\u0091]\u0089A\u009cúÿßNí*DÃ`UA¶\u0095\u009bq\u0093\u008f@1? Lü\u001b\u00920\nëyÁã<LRèLæïúo±\u0085\u0094u=²ªBÛÈ \u0091\u0085\u0018û¡\u00adX«\u0082\u008a\rz-\bò\u008fÄn@»\u0094>%¨\u001d\u001a\u0083\u0018´6%`ñ\u00898*Ög\u0096àÏ-\u0017È\u0096@¿%N\u001a\u0010O0Ï\u0093fzÚò\u008cÀ\u0006ó\u0012\tUÈ\u000b\u0088sZñº_\u0081©8Y?º\u0013ç?\u0095\\Ïí@-P¦+\u007fÖßõr\u0006S\u0095M\u0010_hµÀ\u001cÒ\u000b²Ê\u0098\b\u0006Üe\u0004\r Ldå\u0001\u008diî\u009aºÓû\u009e\u0082,¾¶\u008a<\u0005\u0017\u009c<O\u0099a×Âlæ^\u0083³ «\u0099\u008b%,¼úÈH-\u0081qð\u0002©,*='\u0091¿;Èu¶#_)%±j\u000b\u0010fÏÏ\u009e¯£ Y\u001eþùà\u008f\rù°(ZÓù5P%\u0094\u0089¢PÓ\u0011Ípôº&Km¼@\u00ad\b\"\u0089múö\u0011 ½b\u001c\r\nöÖÉåù\u0010>ªd¥©\u009eòD\b\u009b<\u008bï\u0013Ï\u0011\u0010\u000fÛÍâáäG\u0003í\u0099É\u0095\u0007\u0002\u008b¦\u0010\u0084©\u0095\u008b\u0016s\u0080¢äOñ*ünÇf «4,J\u00990\u009313p«\u008f\\t¯Ì\u0091¬E4Úã<D÷~ºs\u0095³<O\u0010B#\u009b*x\u0013ÈKü\u0081\u0086\u0013òn£×\u0010þ\u0080\u0006ü\u009f¤×_a\u001bºp\u001e%\u0006P \u0099À\u000eÃY\u007fàgØ\u001bÍªõq\u0081\u009eå\u0018\u0094\u0087;K\u0087V\u00815f8t\u0018&Ó\u0010²@ux¾Ä[d»ïÜ\u0005E9\u001bñ(\"52<?w+·\"\u0010Z¥Íqë*¾¼\u0002\u0007\u0013\u0083[\u001a@SvÞ2ç<)pzgãÝ©1%(¶Oµ\u0002ÕCA.\u0000kð²ò°\u009e³¬u_\u0012òiô\u0012}cOQ\u0096ù>¸Ð\u0081\u0084¨\u0082UD\u008b\u0090ÜT2èn9%ÃCvèûK§\u008b=)»è\u0087\u0001Ê/\u0010ó\u008dºí\u0080hùî/\u0087a\u0087]ÂN\u0002êåpÀ0 \u0099«¨f\u009e>NcH\u009b¾\u0082;G~\u00ad\u000e\u0086eÀ\u0088µH'T\rÞ¾\u0090¡ö\u0017)\u0089\bOÝwûá{4þ\u008f²HLýÓC§\u0086\u0084\u0098'ÏÒqu*\u000fÄÒL®\u008eº¥}Å.\u0011 \u0003r¦ ¨\u009au¤G2hU¼½7s\u009b¨Ryæ.Ð©Ø\u0010Ov¸I\u001b\u0099ÈÙy¿X\u00973D}.\u0010@±\u008fNDß4Pá°¼!Õ\u0085LÕ\u0088(\u0013Ê÷Q\u0005´X5/\u009b3\\Â\u0092F·\u001b+\u0004{ÐWË-Æ\u008dSwJáGE\fPN\u000eÙ\u0098\u0017z*Vã8fe\u0015èÈ\fh\u0015p\u009cÜ\u0012y^Ó\u0011;ã>\u008c\u0094X`~\u0091ZC\u0003¬3kèÍZ>¥æðÔÜ´\u0082~-³ \u0092|¡RqyM\u0087ì\rè\u0014u\u001bÒ\u008bkÿÎn¶b¼'\u0000ó°\u0014ÏT\u0081³\u0017\r\u0000®I·wrIÐÊ\u0010{\u0010¯\u0098z\u0080×¯(·\u0084,I\b\u0003Â>ò MD)\b\u008cÓÄ3õ&ÉpÍþês\u0099Ém8\u0005sû\u001cìÇ\u001e\u00843\u0097tÍ\u0010e·Ñ\u000e\u0080£´¸\u00826\u0080\u0007âwä]";
int var17 = "ce\u0006óóZ\u0098É(Ø×\u00029\u009aLúð\u009e\u000fW\u009c}ÃÐç\u0082\u0085b^\u0086¢\u00840 \u008a \\E:,êâ`Ó ¤'Q\u00135=¨¨nc\u0002\u009e\u0006»\u0015\u008eT\u009cÐÔÖ½DG\"ÓL}\u008a|\u0089¸#5   +\u008c\u0090\u008fà\u0013À¯RKÉV\u0098G¡¶z]ÔaÖ4m\u0003ñ&TÔë\u00adék 6>\u0010ÑýÛ8Aé0&<QRU¼2û¾\u0086 ¬4»\u001d\u0098&t|\u0004\tØ V¯\u0093¼®\u009e\u0003LÔo\u0093§\u0004¡<\u00075Pú\u0018Âìä\ráA\u007f§\u008fÀ£\u007f\u00180Ïf_ð¬F³q\u0082\f-©\u008d_\u0002\u0006-è\u0084ÃÅ¬Á\u0018pÛ\u008dÍÎ×];\u009bÊG\u0010\u0018\u009d1MØ\u009e\u0089\u001fY«ñâ\u0010RW\u0096%\u0007èk¤Ì\u0015Ë\u009dÁ\u009d\u0083V\u0010\u00884mo\u0005ßí\u0099¸X0\u0002»·A/\u0010Î5®\u009cñÙH&\u009e.u¶ÎnJò03|ëÅ\u0018±h½\u009c<©Sqúe(:ó$ÿLQ\u0007~\u009449ÅøN\u009a\u008eJ\u0002ÑÜ\u0006{\u009d\u0087 \u0007\u0096ý\u0007¹\u008dÜ \u0010ÞÙÊ1[\u009a/C½ñ\u0012¼\u008b=é¬ÉÄÃÆ+t\u0099\u0018gÍ¯«:<Ý\u00104\t\u0087¶\u0018¤c£\u008a\u008e\u009f\u0012\u000e-|\u0010\u0010y\u000bP)-Ã¤£\u009f±R\u0017\u0096\u008dj\u009e\u00104Ó\u007fg\u0017u²,§=5tT\t\u00ad©\u0018Ï\u0015 \u0082C\u0094¬åý[É\u0000^¹\u008b.æÓWR\u0010ãg° Ü\u0089Ï\u0002\u0082Ô\u009bPÌó\u0092WÅÁ¯<\f×ì\u0090\u008d\u0098°=¸ár\u001ckNG= <º\t$7É?±µ\u0007Ú\u0093gìáøU?´x\u0095*å\n\u0095Ú\u001d2$½¬£ \u0000ä\u0085ô£\u001c)$Ø\nÁíªâp8\u0019qSç³\u0012\u0006ê½-({¢øÖ¡ ®øÚâË\u0086\u007f\u0091]\u0089A\u009cúÿßNí*DÃ`UA¶\u0095\u009bq\u0093\u008f@1? Lü\u001b\u00920\nëyÁã<LRèLæïúo±\u0085\u0094u=²ªBÛÈ \u0091\u0085\u0018û¡\u00adX«\u0082\u008a\rz-\bò\u008fÄn@»\u0094>%¨\u001d\u001a\u0083\u0018´6%`ñ\u00898*Ög\u0096àÏ-\u0017È\u0096@¿%N\u001a\u0010O0Ï\u0093fzÚò\u008cÀ\u0006ó\u0012\tUÈ\u000b\u0088sZñº_\u0081©8Y?º\u0013ç?\u0095\\Ïí@-P¦+\u007fÖßõr\u0006S\u0095M\u0010_hµÀ\u001cÒ\u000b²Ê\u0098\b\u0006Üe\u0004\r Ldå\u0001\u008diî\u009aºÓû\u009e\u0082,¾¶\u008a<\u0005\u0017\u009c<O\u0099a×Âlæ^\u0083³ «\u0099\u008b%,¼úÈH-\u0081qð\u0002©,*='\u0091¿;Èu¶#_)%±j\u000b\u0010fÏÏ\u009e¯£ Y\u001eþùà\u008f\rù°(ZÓù5P%\u0094\u0089¢PÓ\u0011Ípôº&Km¼@\u00ad\b\"\u0089múö\u0011 ½b\u001c\r\nöÖÉåù\u0010>ªd¥©\u009eòD\b\u009b<\u008bï\u0013Ï\u0011\u0010\u000fÛÍâáäG\u0003í\u0099É\u0095\u0007\u0002\u008b¦\u0010\u0084©\u0095\u008b\u0016s\u0080¢äOñ*ünÇf «4,J\u00990\u009313p«\u008f\\t¯Ì\u0091¬E4Úã<D÷~ºs\u0095³<O\u0010B#\u009b*x\u0013ÈKü\u0081\u0086\u0013òn£×\u0010þ\u0080\u0006ü\u009f¤×_a\u001bºp\u001e%\u0006P \u0099À\u000eÃY\u007fàgØ\u001bÍªõq\u0081\u009eå\u0018\u0094\u0087;K\u0087V\u00815f8t\u0018&Ó\u0010²@ux¾Ä[d»ïÜ\u0005E9\u001bñ(\"52<?w+·\"\u0010Z¥Íqë*¾¼\u0002\u0007\u0013\u0083[\u001a@SvÞ2ç<)pzgãÝ©1%(¶Oµ\u0002ÕCA.\u0000kð²ò°\u009e³¬u_\u0012òiô\u0012}cOQ\u0096ù>¸Ð\u0081\u0084¨\u0082UD\u008b\u0090ÜT2èn9%ÃCvèûK§\u008b=)»è\u0087\u0001Ê/\u0010ó\u008dºí\u0080hùî/\u0087a\u0087]ÂN\u0002êåpÀ0 \u0099«¨f\u009e>NcH\u009b¾\u0082;G~\u00ad\u000e\u0086eÀ\u0088µH'T\rÞ¾\u0090¡ö\u0017)\u0089\bOÝwûá{4þ\u008f²HLýÓC§\u0086\u0084\u0098'ÏÒqu*\u000fÄÒL®\u008eº¥}Å.\u0011 \u0003r¦ ¨\u009au¤G2hU¼½7s\u009b¨Ryæ.Ð©Ø\u0010Ov¸I\u001b\u0099ÈÙy¿X\u00973D}.\u0010@±\u008fNDß4Pá°¼!Õ\u0085LÕ\u0088(\u0013Ê÷Q\u0005´X5/\u009b3\\Â\u0092F·\u001b+\u0004{ÐWË-Æ\u008dSwJáGE\fPN\u000eÙ\u0098\u0017z*Vã8fe\u0015èÈ\fh\u0015p\u009cÜ\u0012y^Ó\u0011;ã>\u008c\u0094X`~\u0091ZC\u0003¬3kèÍZ>¥æðÔÜ´\u0082~-³ \u0092|¡RqyM\u0087ì\rè\u0014u\u001bÒ\u008bkÿÎn¶b¼'\u0000ó°\u0014ÏT\u0081³\u0017\r\u0000®I·wrIÐÊ\u0010{\u0010¯\u0098z\u0080×¯(·\u0084,I\b\u0003Â>ò MD)\b\u008cÓÄ3õ&ÉpÍþês\u0099Ém8\u0005sû\u001cìÇ\u001e\u00843\u0097tÍ\u0010e·Ñ\u000e\u0080£´¸\u00826\u0080\u0007âwä]"
.length();
char var14 = ' ';
int var38 = -1;

label54:
while (true) {
String var39 = var15.substring(++var38, var38 + var14);
byte var43 = -1;

while (true) {
byte[] var19 = var11.doFinal(var39.getBytes("ISO-8859-1"));
String var51 = b(var19).intern();
switch (var43) {
case 0:
var18[var16++] = var51;
if ((var38 += var14) >= var17) {
b = var18;
c = new String[48];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[19];
int var3 = 0;
String var4 = "\u0089\u001ch¿òô;dO»ØOÁ %\u0090\u0099]ÈÎ\u008cË#[è\u0080Qº`½\u0092AM\u0084}5ý R\u0086\u0089\u008fmWéJ5³ºGôûµZ\u0013P\\R\u0015`ZCèi\u008bO\u008f¨ª\u0092Ø\u0003ù\u008aP/a\u0094äxïNR]ÌþNE¾ù\u008a¹T\u008eøU\u008dßÕ$\u0090\u001d¤\u007fx»¯Ô\u0015õ#ZÞ1D~\u0006 ?z¤u\u00adÂz6¥\u0018V\u009c8Røò\u0001]";
int var5 = "\u0089\u001ch¿òô;dO»ØOÁ %\u0090\u0099]ÈÎ\u008cË#[è\u0080Qº`½\u0092AM\u0084}5ý R\u0086\u0089\u008fmWéJ5³ºGôûµZ\u0013P\\R\u0015`ZCèi\u008bO\u008f¨ª\u0092Ø\u0003ù\u008aP/a\u0094äxïNR]ÌþNE¾ù\u008a¹T\u008eøU\u008dßÕ$\u0090\u001d¤\u007fx»¯Ô\u0015õ#ZÞ1D~\u0006 ?z¤u\u00adÂz6¥\u0018V\u009c8Røò\u0001]"
.length();
byte var2 = 0;

label36:
while (true) {
byte var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
long[] var42 = var6;
int var48 = var3++;
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
var42[var48] = var60;
if (var2 >= var5) {
e = var6;
g = new Integer[19];
KProperty[] var35 = new KProperty[c<"g">(875, 2046096388046925448L ^ var20)];
var35[0] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(20480, 5405210273760537164L ^ var20), b<"o">(1736, 7417571807555075237L ^ var20), 0)
);
var35[1] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(17063, 2804303319622809827L ^ var20), b<"o">(14719, 611133070088962878L ^ var20), 0)
);
var35[2] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(29399, 5045006843552090269L ^ var20), b<"o">(6440, 4678359053340287834L ^ var20), 0)
);
var35[3] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(22367, 2635018893369797943L ^ var20), b<"o">(29188, 7556911581313091687L ^ var20), 0)
);
var35[4] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(29746, 2219680845445484097L ^ var20), b<"o">(16770, 8832249948802972658L ^ var20), 0)
);
var35[5] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(13437, 1924105858396294661L ^ var20), b<"o">(22062, 3879050213394803786L ^ var20), 0)
);
var35[c<"g">(16516, 8501936874596068715L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(7165, 148452914023899531L ^ var20), b<"o">(12986, 503504589445499128L ^ var20), 0)
);
var35[c<"g">(16706, 7784596361500585129L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(30355, 5090903125881834729L ^ var20), b<"o">(8438, 5431116097805654705L ^ var20), 0)
);
var35[c<"g">(14189, 1810338781547928204L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(11695, 4578506760037308369L ^ var20), b<"o">(3395, 6944001473183692598L ^ var20), 0)
);
var35[c<"g">(3332, 5667105005232070894L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(7385, 3612445677753837206L ^ var20), b<"o">(20866, 5412695954842807283L ^ var20), 0)
);
var35[c<"g">(25408, 6687672311541911206L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(9595, 5095110888114691860L ^ var20), b<"o">(4167, 1604441378518346283L ^ var20), 0)
);
var35[c<"g">(19007, 8339344414381434819L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(3179, 4121821414559364619L ^ var20), b<"o">(30977, 2180239748512564041L ^ var20), 0)
);
var35[c<"g">(20580, 6811520655002598811L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(28160, 2208508590691243133L ^ var20), b<"o">(21220, 8193684073761826946L ^ var20), 0)
);
var35[c<"g">(11191, 595667242273211999L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(756, 2939118435082385549L ^ var20), b<"o">(30399, 3308152956853374170L ^ var20), 0)
);
var35[c<"g">(13427, 2394344459999713687L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ug.class, b<"o">(13399, 516289180578057790L ^ var20), b<"o">(23395, 6481579068331876648L ^ var20), 0)
);
D = var35;
X = new ug(var33);
N = yp.L(X, b<"o">(11688, 2356605455826851799L ^ var20), l_.VANILLA, null, null, c<"g">(25009, 7873462188200217681L ^ var20), null, var31);
j = yp.t(X, b<"o">(18114, 2806165884783262883L ^ var20), false, var24, null, ug::L, 4, null);
o = yp.L(
X,
b<"o">(7008, 9038509662113112331L ^ var20),
3,
new IntRange(1, c<"g">(29698, 6312792730156718571L ^ var20)),
var26,
null,
ug::E,
c<"g">(14189, 1810338781547928204L ^ var20),
null
);
n = yp.t(X, b<"o">(15662, 7671678582785607497L ^ var20), true, var24, null, null, c<"g">(25009, 7873462188200217681L ^ var20), null);
C = yp.B(X, b<"o">(7833, 3691532945703150829L ^ var20), (short)var28, w7.BOOLS, null, 4, var29, null, (char)var30);
I = yp.t(X, b<"o">(16252, 5158418031750776082L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
J = yp.t(X, b<"o">(22797, 3843969333352620911L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
Y = yp.t(X, b<"o">(16739, 1694414227676527397L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
t = yp.t(X, b<"o">(7347, 723037475623020228L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
E = yp.t(X, b<"o">(29928, 3482318986282880685L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
z = yp.t(X, b<"o">(6178, 4830695802336125534L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
A = yp.t(X, b<"o">(14711, 5611931568664642361L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
V = yp.t(X, b<"o">(21500, 2225993739978205575L ^ var20), true, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
y = yp.t(X, b<"o">(26932, 8493473826493387614L ^ var20), false, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
f = yp.t(X, b<"o">(7166, 2444522050469732791L ^ var20), false, var24, X.l(var22), null, c<"g">(14189, 1810338781547928204L ^ var20), null);
return;
}
break;
default:
var42[var48] = var60;
if (var2 < var5) {
continue label36;
}

var4 = "\u0012hBª\t»Ap\u001a\u0085¾¢¬\u0091\u0080e";
var5 = "\u0012hBª\t»Ap\u001a\u0085¾¢¬\u0091\u0080e".length();
var2 = 0;
}

byte var49 = var2;
var2 += 8;
var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
var42 = var6;
var48 = var3++;
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

var14 = var15.charAt(var38);
break;
default:
var18[var16++] = var51;
if ((var38 += var14) < var17) {
var14 = var15.charAt(var38);
continue label54;
}

var15 = "\u0095³\rÆPÿU¬¿®ÑQ+\u000fS\u0003 \u00ad¦êª¦Ì µü¾è\u0019\u0006\f\u001d^ÚþÂþ\u0084_:Ô8aoÈ¿Øû·";
var17 = "\u0095³\rÆPÿU¬¿®ÑQ+\u000fS\u0003 \u00ad¦êª¦Ì µü¾è\u0019\u0006\f\u001d^ÚþÂþ\u0084_:Ô8aoÈ¿Øû·".length();
var14 = 16;
var38 = -1;
}

var39 = var15.substring(++var38, var38 + var14);
var43 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11565;
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
throw new RuntimeException("su/catlean/ug", var10);
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
throw new RuntimeException("su/catlean/ug" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15012;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/ug", var14);
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
throw new RuntimeException("su/catlean/ug" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
