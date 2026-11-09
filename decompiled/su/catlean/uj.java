package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1690;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2833;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.ShouldDismountEvent;
import su.catlean.gofra.Flow;

public final class uj extends _g {
@NotNull
public static final uj D;
static final KProperty[] h;
@NotNull
private static final cw e;
@NotNull
private static final cq c;
@NotNull
private static final cq n;
@NotNull
private static final cq o;
@NotNull
private static final cq j;
@NotNull
private static final ct g;
@NotNull
private static final ct z;
@NotNull
private static final cp V;
@NotNull
private static final ct k;
@NotNull
private static final cq O;
@NotNull
private static final cq E;
@NotNull
private static final cq B;
@NotNull
private static final cq L;
@NotNull
private static final ct P;
@NotNull
private static final cq N;
@NotNull
private static final cq T;
@NotNull
private static final cq a;
@NotNull
private static final c8 m;
@NotNull
private static final c8 d;
@NotNull
private static final ct l;
@NotNull
private static final ArrayList A;
private static int W;
private static int f;
private static boolean y;
private static boolean Y;
private static boolean S;
private static final long b = yz.a(5724145000750933656L, 124536481492501746L, MethodHandles.lookup().lookupClass()).a(259120174945635L);
private static final String[] i;
private static final String[] t;
private static final Map u = new HashMap(13);
private static final long[] w;
private static final Integer[] x;
private static final Map C;

private uj(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 122433218145068L;
super(b<"a">(19418, 4876138967935695413L ^ var1), jt.V(), null, 4, null, var3);
}

private final ik q(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
long var6 = var4 ^ 34616687738998L;
return (ik)e.E(this, var6, h[0]);
}

private final boolean D(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 78558386716068L;
return (Boolean)c.E(this, var3, h[1]);
}

private final boolean T(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 12487121544372L;
return (Boolean)n.E(this, var3, h[2]);
}

private final boolean G(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 108700925255634L;
return (Boolean)o.E(this, var3, h[3]);
}

private final boolean W(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 35644665666679L;
return (Boolean)j.E(this, var6, h[4]);
}

private final float P(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
long var6 = var4 ^ 115925617747250L;
return ((Number)g.E(this, var6, h[5])).floatValue();
}

private final float F(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 24342428013247L;
return ((Number)z.E(this, var3, h[c<"l">(23816, 366598049750022505L ^ var1)])).floatValue();
}

private final h r(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 118898144847322L;
return (h)V.E(this, var3, h[c<"l">(12285, 8953603045642140909L ^ var1)]);
}

private final float K(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 23468680918801L;
return ((Number)k.E(this, var3, h[c<"l">(32685, 8251329602402434669L ^ var1)])).floatValue();
}

private final boolean p(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 2392638850670L;
return (Boolean)O.E(this, var3, h[c<"l">(13583, 781057820815771060L ^ var1)]);
}

private final boolean e(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 80209741200335L;
return (Boolean)E.E(this, var3, h[c<"l">(11632, 3443401886849425515L ^ var1)]);
}

private final boolean B(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 116956316823385L;
return (Boolean)B.E(this, var3, h[c<"l">(31136, 4669411505202421821L ^ var1)]);
}

private final boolean E(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 52845018740261L;
return (Boolean)L.E(this, var6, h[c<"l">(6295, 7221604101653403754L ^ var4)]);
}

private final float Z(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 138846083173515L;
return ((Number)P.E(this, var3, h[c<"l">(20995, 8314412053220845687L ^ var1)])).floatValue();
}

private final boolean x(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 69908726141600L;
return (Boolean)N.E(this, var3, h[c<"l">(58, 5400343303047291976L ^ var1)]);
}

private final boolean H(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 130548591972963L;
return (Boolean)T.E(this, var3, h[c<"l">(6417, 9165019645724638647L ^ var1)]);
}

private final boolean V(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 24141067472701L;
return (Boolean)a.E(this, var3, h[c<"l">(21014, 7245301646802643943L ^ var1)]);
}

private final int M(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 75674332724515L;
return ((Number)m.E(this, var3, h[c<"l">(22132, 3310249262349213080L ^ var1)])).intValue();
}

private final int C(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 123217635153168L;
return ((Number)d.E(this, var3, h[c<"l">(1918, 6845344441898329253L ^ var1)])).intValue();
}

private final float L(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 78743058494867L;
return ((Number)l.E(this, var6, h[c<"l">(22679, 8795894462339062745L ^ var4)])).floatValue();
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 32978412894279
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 122304444111779
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 76401611909238
// 12: lxor
// 13: lstore 7
// 15: dup2
// 16: ldc2_w 20975573779856
// 19: lxor
// 1a: lstore 9
// 1c: pop2
// 1d: ldc2_w 2648177620633790614
// 20: lload 1
// 21: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: astore 11
// 28: aload 11
// 2a: ifnull 74
// 2d: lload 3
// 2e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 31: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 34: ifnull 61
// 37: goto 44
// 3a: ldc2_w 2629673847421734548
// 3d: lload 1
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: lload 1
// 45: lconst_0
// 46: lcmp
// 47: ifle 75
// 4a: lload 3
// 4b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 51: ifnonnull 75
// 54: goto 61
// 57: ldc2_w 2629673847421734548
// 5a: lload 1
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: aload 0
// 62: lload 9
// 64: invokevirtual su/catlean/uj.d (J)V
// 67: goto 74
// 6a: ldc2_w 2629673847421734548
// 6d: lload 1
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: return
// 75: aload 0
// 76: aload 11
// 78: ifnull 9e
// 7b: lload 7
// 7d: invokespecial su/catlean/uj.G (J)Z
// 80: ifeq a3
// 83: goto 90
// 86: ldc2_w 2629673847421734548
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: aload 0
// 91: goto 9e
// 94: ldc2_w 2629673847421734548
// 97: lload 1
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: lload 5
// a0: invokespecial su/catlean/uj.l (J)V
// a3: lload 1
// a4: lconst_0
// a5: lcmp
// a6: ifle c0
// a9: ldc2_w 2620972475537570510
// ac: lload 1
// ad: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: ifnull cd
// b5: ldc "QiAzj"
// b7: ldc2_w 2615097924116087437
// ba: lload 1
// bb: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c0: goto cd
// c3: ldc2_w 2629673847421734548
// c6: lload 1
// c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cc: athrow
// cd: return
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 64129331416845
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 34594838020248
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 6
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 78613518204234
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 29647348875563
// 028: lxor
// 029: lstore 10
// 02b: pop2
// 02c: ldc2_w 1407955626626457564
// 02f: lload 1
// 030: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: getstatic su/catlean/uj.A Ljava/util/ArrayList;
// 038: invokevirtual java/util/ArrayList.clear ()V
// 03b: astore 12
// 03d: bipush 0
// 03e: aload 12
// 040: ifnull 08c
// 043: putstatic su/catlean/uj.y Z
// 046: lload 1
// 047: lconst_0
// 048: lcmp
// 049: iflt 06e
// 04c: lload 3
// 04d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 050: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 053: ifnonnull 06e
// 056: goto 063
// 059: ldc2_w 1383834079121914334
// 05c: lload 1
// 05d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: athrow
// 063: return
// 064: ldc2_w 1383834079121914334
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 0
// 06f: lload 1
// 070: lconst_0
// 071: lcmp
// 072: ifle 090
// 075: aload 12
// 077: ifnull 090
// 07a: lload 8
// 07c: invokespecial su/catlean/uj.D (J)Z
// 07f: goto 08c
// 082: ldc2_w 1383834079121914334
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifeq 0d0
// 08f: aload 0
// 090: iload 5
// 092: i2b
// 093: lload 6
// 095: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 098: getstatic su/catlean/ik.Motion Lsu/catlean/ik;
// 09b: if_acmpne 0d0
// 09e: lload 10
// 0a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a3: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 0a6: dup
// 0a7: ifnull 0c5
// 0aa: goto 0b7
// 0ad: ldc2_w 1383834079121914334
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: astore 13
// 0b9: bipush 0
// 0ba: istore 14
// 0bc: aload 13
// 0be: bipush 0
// 0bf: putfield net/minecraft/class_1297.field_5960 Z
// 0c2: goto 0c7
// 0c5: pop
// 0c6: nop
// 0c7: lload 10
// 0c9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cc: bipush 0
// 0cd: putfield net/minecraft/class_746.field_5960 Z
// 0d0: lload 1
// 0d1: lconst_0
// 0d2: lcmp
// 0d3: iflt 0e6
// 0d6: lload 10
// 0d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0db: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 0de: dup
// 0df: ifnull 0f3
// 0e2: bipush 0
// 0e3: invokevirtual net/minecraft/class_1297.method_5875 (Z)V
// 0e6: goto 0f4
// 0e9: ldc2_w 1383834079121914334
// 0ec: lload 1
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: pop
// 0f4: lload 10
// 0f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f9: bipush 0
// 0fa: invokevirtual net/minecraft/class_746.method_5875 (Z)V
// 0fd: lload 1
// 0fe: lconst_0
// 0ff: lcmp
// 100: iflt 115
// 103: aload 12
// 105: ifnonnull 122
// 108: bipush 4
// 109: anewarray 372
// 10c: ldc2_w 1397120299992947038
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: goto 122
// 118: ldc2_w 1383834079121914334
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: return
}

private final float z(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 89951480617303L;
String var8 = vm.a<"Å">(-8739165071906272530L, var4);

boolean var10000;
label34: {
label33: {
try {
var10000 = S;
if (var8 == null) {
break label34;
}

if (!S) {
break label33;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -8789211974082253588L, var4);
}

var10000 = false;
break label34;
}

var10000 = true;
}

try {
S = var10000;
if (S) {
return this.Z(var6);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8789211974082253588L, var4);
}

return -this.Z(var6);
}

private final void v(class_2833 var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 21003018458806L;
A.add(var1);
_r.a(var4, (class_2596)var1);
}

private final void s(int param1, class_1297 param2, short param3, short param4) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/uj.b J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 127554874375971
// 024: lxor
// 025: dup2
// 026: bipush 56
// 028: lushr
// 029: l2i
// 02a: istore 7
// 02c: dup2
// 02d: bipush 8
// 02f: lshl
// 030: bipush 8
// 032: lushr
// 033: lstore 8
// 035: pop2
// 036: dup2
// 037: ldc2_w 109161481831295
// 03a: lxor
// 03b: lstore 10
// 03d: dup2
// 03e: ldc2_w 23471386673541
// 041: lxor
// 042: lstore 12
// 044: pop2
// 045: aconst_null
// 046: astore 15
// 048: ldc2_w -5943874545287913003
// 04b: lload 5
// 04d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: aload 0
// 053: iload 7
// 055: i2b
// 056: lload 8
// 058: aload 2
// 059: invokevirtual su/catlean/uj.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 05c: checkcast net/minecraft/class_2374
// 05f: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 062: dup
// 063: sipush 27798
// 066: ldc2_w 8573782770535631591
// 069: lload 5
// 06b: lxor
// 06c: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 074: astore 15
// 076: sipush 8754
// 079: ldc2_w 3309878353149473970
// 07c: lload 5
// 07e: lxor
// 07f: invokedynamic l (IJ)I bsm=su/catlean/uj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: istore 16
// 086: astore 14
// 088: bipush 0
// 089: istore 17
// 08b: iload 17
// 08d: iload 16
// 08f: if_icmpge 155
// 092: iload 17
// 094: istore 18
// 096: bipush 0
// 097: istore 19
// 099: aload 14
// 09b: ifnull 132
// 09e: lload 12
// 0a0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0a3: aload 15
// 0a5: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0a8: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0ab: ifeq 0e2
// 0ae: goto 0bc
// 0b1: ldc2_w -5963521845577545769
// 0b4: lload 5
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: iload 4
// 0be: iflt 150
// 0c1: lload 12
// 0c3: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c6: aload 15
// 0c8: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0cb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0ce: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
// 0d1: if_acmpne 133
// 0d4: goto 0e2
// 0d7: ldc2_w -5963521845577545769
// 0da: lload 5
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 2
// 0e3: aload 2
// 0e4: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 0e7: aload 15
// 0e9: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0ec: bipush 1
// 0ed: iadd
// 0ee: i2d
// 0ef: aload 2
// 0f0: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 0f3: invokevirtual net/minecraft/class_1297.method_5814 (DDD)V
// 0f6: getstatic su/catlean/uj.D Lsu/catlean/uj;
// 0f9: aload 2
// 0fa: invokestatic net/minecraft/class_2833.method_65307 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_2833;
// 0fd: dup
// 0fe: sipush 27395
// 101: ldc2_w 1386775343904197990
// 104: lload 5
// 106: lxor
// 107: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10f: lload 10
// 111: invokespecial su/catlean/uj.v (Lnet/minecraft/class_2833;J)V
// 114: aload 2
// 115: aload 2
// 116: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 119: aload 2
// 11a: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 11d: aload 2
// 11e: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 121: invokevirtual net/minecraft/class_1297.method_5814 (DDD)V
// 124: goto 132
// 127: ldc2_w -5963521845577545769
// 12a: lload 5
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: return
// 133: aload 15
// 135: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 138: dup
// 139: sipush 18142
// 13c: ldc2_w 7265645038437441679
// 13f: lload 5
// 141: lxor
// 142: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14a: astore 15
// 14c: nop
// 14d: iinc 17 1
// 150: aload 14
// 152: ifnonnull 08b
// 155: return
}

private final void l(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 60746949807563L;
long var5 = var1 ^ 58798110394153L;
long var7 = var1 ^ 58449378440044L;
String var10000 = vm.a<"Å">(-6787698759974802021L, var1);
Iterator var10 = zf.z(var3).method_18112().iterator();
String var9 = var10000;

while (var10.hasNext()) {
var10000 = (String)var10.next();
Intrinsics.checkNotNullExpressionValue(var10000, b<"a">(22986, 76524500067333058L ^ var1));
class_1297 var11 = (class_1297)var10000;

label52: {
label42: {
try {
var16 = var11 instanceof class_1690;
if (var9 == null) {
break label42;
}

if (var16 == 0) {
continue;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -6812976340859974759L, var1);
}

try {
if (var1 <= 0L) {
break;
}

var17 = zf.v(var7);
if (var9 == null) {
break label52;
}

double var19;
var16 = (var19 = var17.method_5858(var11) - 25.0) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -6812976340859974759L, var1);
}
}

if (var16 > 0) {
continue;
}

var17 = var11;
}

class_2824 var18 = class_2824.method_34207((class_1297)var17, false, class_1268.field_5808);
Intrinsics.checkNotNullExpressionValue(var18, b<"a">(25296, 1406984552348453054L ^ var1));
_r.a(var5, (class_2596)var18);
break;
}
}

@Flow
private final void Z(ShouldDismountEvent var1) {
long var2 = b ^ 112606052018011L;
long var10001 = var2 ^ 7429068535592L;
int var4 = (int)((var2 ^ 7429068535592L) >>> 48);
int var5 = (int)((var2 ^ 7429068535592L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);

try {
if (this.W((short)var4, (short)var5, var6)) {
var1.cancel();
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 8684483128717431407L, var2);
}
}

@Flow
private final void g(EventPlayerTravel param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uj.b J
// 003: ldc2_w 13384382834193
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 58661454195665
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
// 020: ldc2_w 91908657900131
// 023: lxor
// 024: dup2
// 025: bipush 56
// 027: lushr
// 028: l2i
// 029: istore 7
// 02b: dup2
// 02c: bipush 8
// 02e: lshl
// 02f: bipush 8
// 031: lushr
// 032: lstore 8
// 034: pop2
// 035: dup2
// 036: ldc2_w 50784189216199
// 039: lxor
// 03a: lstore 10
// 03c: dup2
// 03d: ldc2_w 67053614022405
// 040: lxor
// 041: lstore 12
// 043: dup2
// 044: ldc2_w 50946373062470
// 047: lxor
// 048: lstore 14
// 04a: dup2
// 04b: ldc2_w 94658199628752
// 04e: lxor
// 04f: lstore 16
// 051: dup2
// 052: ldc2_w 9069767153462
// 055: lxor
// 056: lstore 18
// 058: dup2
// 059: ldc2_w 102372901319707
// 05c: lxor
// 05d: lstore 20
// 05f: dup2
// 060: ldc2_w 83056163216095
// 063: lxor
// 064: dup2
// 065: bipush 32
// 067: lushr
// 068: l2i
// 069: istore 22
// 06b: dup2
// 06c: bipush 32
// 06e: lshl
// 06f: bipush 32
// 071: lushr
// 072: lstore 23
// 074: pop2
// 075: dup2
// 076: ldc2_w 99846652557482
// 079: lxor
// 07a: lstore 25
// 07c: dup2
// 07d: ldc2_w 37454841337741
// 080: lxor
// 081: lstore 27
// 083: dup2
// 084: ldc2_w 4582753034599
// 087: lxor
// 088: dup2
// 089: bipush 16
// 08b: lushr
// 08c: lstore 29
// 08e: dup2
// 08f: bipush 48
// 091: lshl
// 092: bipush 48
// 094: lushr
// 095: l2i
// 096: istore 31
// 098: pop2
// 099: dup2
// 09a: ldc2_w 130510599431670
// 09d: lxor
// 09e: lstore 32
// 0a0: dup2
// 0a1: ldc2_w 41882851461724
// 0a4: lxor
// 0a5: dup2
// 0a6: bipush 32
// 0a8: lushr
// 0a9: l2i
// 0aa: istore 34
// 0ac: dup2
// 0ad: bipush 32
// 0af: lshl
// 0b0: bipush 48
// 0b2: lushr
// 0b3: l2i
// 0b4: istore 35
// 0b6: dup2
// 0b7: bipush 48
// 0b9: lshl
// 0ba: bipush 48
// 0bc: lushr
// 0bd: l2i
// 0be: istore 36
// 0c0: pop2
// 0c1: dup2
// 0c2: ldc2_w 131708664377153
// 0c5: lxor
// 0c6: lstore 37
// 0c8: dup2
// 0c9: ldc2_w 12580923907974
// 0cc: lxor
// 0cd: dup2
// 0ce: bipush 48
// 0d0: lushr
// 0d1: l2i
// 0d2: istore 39
// 0d4: dup2
// 0d5: bipush 16
// 0d7: lshl
// 0d8: bipush 48
// 0da: lushr
// 0db: l2i
// 0dc: istore 40
// 0de: dup2
// 0df: bipush 32
// 0e1: lshl
// 0e2: bipush 32
// 0e4: lushr
// 0e5: l2i
// 0e6: istore 41
// 0e8: pop2
// 0e9: dup2
// 0ea: ldc2_w 12774192994225
// 0ed: lxor
// 0ee: lstore 42
// 0f0: dup2
// 0f1: ldc2_w 98633116818692
// 0f4: lxor
// 0f5: lstore 44
// 0f7: dup2
// 0f8: ldc2_w 137314484771888
// 0fb: lxor
// 0fc: dup2
// 0fd: bipush 48
// 0ff: lushr
// 100: l2i
// 101: istore 46
// 103: dup2
// 104: bipush 16
// 106: lshl
// 107: bipush 32
// 109: lushr
// 10a: l2i
// 10b: istore 47
// 10d: dup2
// 10e: bipush 48
// 110: lshl
// 111: bipush 48
// 113: lushr
// 114: l2i
// 115: istore 48
// 117: pop2
// 118: dup2
// 119: ldc2_w 41248811618087
// 11c: lxor
// 11d: dup2
// 11e: bipush 8
// 120: lushr
// 121: lstore 49
// 123: dup2
// 124: bipush 56
// 126: lshl
// 127: bipush 56
// 129: lushr
// 12a: l2i
// 12b: istore 51
// 12d: pop2
// 12e: dup2
// 12f: ldc2_w 42554371360076
// 132: lxor
// 133: lstore 52
// 135: dup2
// 136: ldc2_w 4881356998162
// 139: lxor
// 13a: lstore 54
// 13c: dup2
// 13d: ldc2_w 97960457659688
// 140: lxor
// 141: lstore 56
// 143: dup2
// 144: ldc2_w 78853854072481
// 147: lxor
// 148: lstore 58
// 14a: dup2
// 14b: ldc2_w 86594625481851
// 14e: lxor
// 14f: lstore 60
// 151: pop2
// 152: ldc2_w -472494440368638681
// 155: lload 2
// 156: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: astore 62
// 15d: aload 0
// 15e: lload 37
// 160: invokevirtual su/catlean/uj.S (J)Z
// 163: ifne 171
// 166: return
// 167: ldc2_w -446118997108468955
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: lload 16
// 173: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 176: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 179: ifnonnull 1b8
// 17c: aload 0
// 17d: aload 62
// 17f: ifnull 1b2
// 182: goto 18f
// 185: ldc2_w -446118997108468955
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: lload 10
// 191: invokespecial su/catlean/uj.G (J)Z
// 194: ifeq 1b7
// 197: goto 1a4
// 19a: ldc2_w -446118997108468955
// 19d: lload 2
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: aload 0
// 1a5: goto 1b2
// 1a8: ldc2_w -446118997108468955
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: lload 54
// 1b4: invokespecial su/catlean/uj.l (J)V
// 1b7: return
// 1b8: aload 0
// 1b9: lload 42
// 1bb: invokespecial su/catlean/uj.D (J)Z
// 1be: aload 62
// 1c0: ifnull 22b
// 1c3: ifeq 228
// 1c6: goto 1d3
// 1c9: ldc2_w -446118997108468955
// 1cc: lload 2
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: aload 0
// 1d4: iload 7
// 1d6: i2b
// 1d7: lload 8
// 1d9: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 1dc: getstatic su/catlean/ik.Motion Lsu/catlean/ik;
// 1df: if_acmpne 228
// 1e2: goto 1ef
// 1e5: ldc2_w -446118997108468955
// 1e8: lload 2
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: lload 16
// 1f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f4: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 1f7: dup
// 1f8: ifnull 21d
// 1fb: goto 208
// 1fe: ldc2_w -446118997108468955
// 201: lload 2
// 202: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 207: athrow
// 208: astore 65
// 20a: bipush 0
// 20b: istore 66
// 20d: aload 65
// 20f: bipush 1
// 210: putfield net/minecraft/class_1297.field_5960 Z
// 213: aload 65
// 215: bipush 1
// 216: invokevirtual net/minecraft/class_1297.method_5875 (Z)V
// 219: nop
// 21a: goto 21f
// 21d: pop
// 21e: nop
// 21f: lload 16
// 221: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 224: bipush 1
// 225: putfield net/minecraft/class_746.field_5960 Z
// 228: getstatic su/catlean/uj.Y Z
// 22b: aload 62
// 22d: ifnull 2bb
// 230: ifne 2b5
// 233: goto 240
// 236: ldc2_w -446118997108468955
// 239: lload 2
// 23a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23f: athrow
// 240: lload 16
// 242: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 245: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 248: dup
// 249: ifnull 28c
// 24c: goto 259
// 24f: ldc2_w -446118997108468955
// 252: lload 2
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: aload 0
// 25a: lload 58
// 25c: invokespecial su/catlean/uj.T (J)Z
// 25f: aload 62
// 261: ifnull 282
// 264: goto 271
// 267: ldc2_w -446118997108468955
// 26a: lload 2
// 26b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 270: athrow
// 271: ifne 285
// 274: goto 281
// 277: ldc2_w -446118997108468955
// 27a: lload 2
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: bipush 1
// 282: goto 286
// 285: bipush 0
// 286: invokevirtual net/minecraft/class_1297.method_5875 (Z)V
// 289: goto 28d
// 28c: pop
// 28d: lload 16
// 28f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 292: aload 0
// 293: lload 58
// 295: invokespecial su/catlean/uj.T (J)Z
// 298: aload 62
// 29a: ifnull 2ae
// 29d: ifne 2b1
// 2a0: goto 2ad
// 2a3: ldc2_w -446118997108468955
// 2a6: lload 2
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: bipush 1
// 2ae: goto 2b2
// 2b1: bipush 0
// 2b2: invokevirtual net/minecraft/class_746.method_5875 (Z)V
// 2b5: aload 0
// 2b6: lload 56
// 2b8: invokespecial su/catlean/uj.V (J)Z
// 2bb: aload 62
// 2bd: ifnull 2d3
// 2c0: ifeq 3a1
// 2c3: goto 2d0
// 2c6: ldc2_w -446118997108468955
// 2c9: lload 2
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: getstatic su/catlean/uj.W I
// 2d3: aload 62
// 2d5: ifnull 334
// 2d8: aload 0
// 2d9: lload 18
// 2db: invokespecial su/catlean/uj.M (J)I
// 2de: if_icmple 331
// 2e1: goto 2ee
// 2e4: ldc2_w -446118997108468955
// 2e7: lload 2
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: getstatic su/catlean/uj.y Z
// 2f1: aload 62
// 2f3: ifnull 334
// 2f6: goto 303
// 2f9: ldc2_w -446118997108468955
// 2fc: lload 2
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: ifne 331
// 306: goto 313
// 309: ldc2_w -446118997108468955
// 30c: lload 2
// 30d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: athrow
// 313: bipush 0
// 314: putstatic su/catlean/uj.W I
// 317: bipush 1
// 318: putstatic su/catlean/uj.y Z
// 31b: aload 0
// 31c: lload 12
// 31e: invokespecial su/catlean/uj.C (J)I
// 321: putstatic su/catlean/uj.f I
// 324: goto 331
// 327: ldc2_w -446118997108468955
// 32a: lload 2
// 32b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 330: athrow
// 331: getstatic su/catlean/uj.f I
// 334: aload 62
// 336: ifnull 388
// 339: ifle 385
// 33c: goto 349
// 33f: ldc2_w -446118997108468955
// 342: lload 2
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: getstatic su/catlean/uj.y Z
// 34c: aload 62
// 34e: ifnull 388
// 351: goto 35e
// 354: ldc2_w -446118997108468955
// 357: lload 2
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: ifeq 385
// 361: goto 36e
// 364: ldc2_w -446118997108468955
// 367: lload 2
// 368: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: athrow
// 36e: getstatic su/catlean/uj.f I
// 371: bipush -1
// 372: iadd
// 373: putstatic su/catlean/uj.f I
// 376: getstatic su/catlean/uj.f I
// 379: pop
// 37a: return
// 37b: ldc2_w -446118997108468955
// 37e: lload 2
// 37f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 384: athrow
// 385: getstatic su/catlean/uj.f I
// 388: aload 62
// 38a: ifnull 39e
// 38d: ifgt 3a1
// 390: goto 39d
// 393: ldc2_w -446118997108468955
// 396: lload 2
// 397: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39c: athrow
// 39d: bipush 0
// 39e: putstatic su/catlean/uj.y Z
// 3a1: lload 16
// 3a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a6: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 3a9: dup
// 3aa: ifnonnull 3b9
// 3ad: pop
// 3ae: return
// 3af: ldc2_w -446118997108468955
// 3b2: lload 2
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: astore 63
// 3bb: aload 0
// 3bc: iload 39
// 3be: i2s
// 3bf: iload 40
// 3c1: i2c
// 3c2: iload 41
// 3c4: invokespecial su/catlean/uj.L (SCI)F
// 3c7: fconst_1
// 3c8: fcmpg
// 3c9: aload 62
// 3cb: ifnull 3df
// 3ce: ifne 3e2
// 3d1: goto 3de
// 3d4: ldc2_w -446118997108468955
// 3d7: lload 2
// 3d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dd: athrow
// 3de: bipush 1
// 3df: goto 3e3
// 3e2: bipush 0
// 3e3: ifne 405
// 3e6: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 3e9: aload 0
// 3ea: iload 39
// 3ec: i2s
// 3ed: iload 40
// 3ef: i2c
// 3f0: iload 41
// 3f2: invokespecial su/catlean/uj.L (SCI)F
// 3f5: invokevirtual su/catlean/tq.x (F)V
// 3f8: goto 405
// 3fb: ldc2_w -446118997108468955
// 3fe: lload 2
// 3ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: athrow
// 405: aload 63
// 407: lload 16
// 409: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 40c: invokevirtual net/minecraft/class_746.method_36454 ()F
// 40f: invokevirtual net/minecraft/class_1297.method_36456 (F)V
// 412: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 415: aload 0
// 416: lload 49
// 418: iload 51
// 41a: i2b
// 41b: invokespecial su/catlean/uj.P (JB)F
// 41e: bipush 0
// 41f: fconst_0
// 420: lload 14
// 422: fconst_0
// 423: fconst_0
// 424: sipush 21405
// 427: ldc2_w 9099207416051896829
// 42a: lload 2
// 42b: lxor
// 42c: invokedynamic l (IJ)I bsm=su/catlean/uj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 431: aconst_null
// 432: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 435: astore 64
// 437: aload 63
// 439: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 43c: aload 64
// 43e: bipush 0
// 43f: daload
// 440: dadd
// 441: dstore 65
// 443: aload 63
// 445: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 448: aload 64
// 44a: bipush 1
// 44b: daload
// 44c: dadd
// 44d: dstore 67
// 44f: aload 63
// 451: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 454: dstore 69
// 456: bipush 0
// 457: aload 62
// 459: ifnull 4cb
// 45c: putstatic su/catlean/uj.Y Z
// 45f: aload 63
// 461: aload 63
// 463: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 466: invokevirtual net/minecraft/class_243.method_10216 ()D
// 469: aload 0
// 46a: lload 44
// 46c: invokespecial su/catlean/uj.K (J)F
// 46f: fneg
// 470: ldc 100.0
// 472: fdiv
// 473: f2d
// 474: aload 63
// 476: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 479: invokevirtual net/minecraft/class_243.method_10215 ()D
// 47c: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 47f: aload 0
// 480: iload 7
// 482: i2b
// 483: lload 8
// 485: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 488: getstatic su/catlean/ik.Motion Lsu/catlean/ik;
// 48b: if_acmpne 4bd
// 48e: goto 49b
// 491: ldc2_w -446118997108468955
// 494: lload 2
// 495: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49a: athrow
// 49b: aload 63
// 49d: aload 64
// 49f: bipush 0
// 4a0: daload
// 4a1: aload 63
// 4a3: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 4a6: invokevirtual net/minecraft/class_243.method_10214 ()D
// 4a9: aload 64
// 4ab: bipush 1
// 4ac: daload
// 4ad: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 4b0: goto 4bd
// 4b3: ldc2_w -446118997108468955
// 4b6: lload 2
// 4b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bc: athrow
// 4bd: lload 32
// 4bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4c2: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 4c5: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 4c8: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 4cb: aload 62
// 4cd: ifnull 55f
// 4d0: ifeq 544
// 4d3: goto 4e0
// 4d6: ldc2_w -446118997108468955
// 4d9: lload 2
// 4da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4df: athrow
// 4e0: aload 0
// 4e1: iload 7
// 4e3: i2b
// 4e4: lload 8
// 4e6: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 4e9: getstatic su/catlean/ik.Motion Lsu/catlean/ik;
// 4ec: if_acmpne 533
// 4ef: goto 4fc
// 4f2: ldc2_w -446118997108468955
// 4f5: lload 2
// 4f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fb: athrow
// 4fc: aload 63
// 4fe: aload 63
// 500: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 503: invokevirtual net/minecraft/class_243.method_10216 ()D
// 506: aload 63
// 508: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 50b: invokevirtual net/minecraft/class_243.method_10214 ()D
// 50e: aload 0
// 50f: lload 25
// 511: invokespecial su/catlean/uj.F (J)F
// 514: f2d
// 515: dadd
// 516: aload 63
// 518: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 51b: invokevirtual net/minecraft/class_243.method_10215 ()D
// 51e: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 521: aload 62
// 523: ifnonnull 5d3
// 526: goto 533
// 529: ldc2_w -446118997108468955
// 52c: lload 2
// 52d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 532: athrow
// 533: dload 69
// 535: aload 0
// 536: lload 25
// 538: invokespecial su/catlean/uj.F (J)F
// 53b: f2d
// 53c: dadd
// 53d: dstore 69
// 53f: aload 62
// 541: ifnonnull 5d3
// 544: lload 32
// 546: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 549: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 54c: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 54f: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 552: goto 55f
// 555: ldc2_w -446118997108468955
// 558: lload 2
// 559: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55e: athrow
// 55f: aload 62
// 561: ifnull 5db
// 564: ifeq 5d3
// 567: goto 574
// 56a: ldc2_w -446118997108468955
// 56d: lload 2
// 56e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 573: athrow
// 574: aload 0
// 575: iload 7
// 577: i2b
// 578: lload 8
// 57a: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 57d: getstatic su/catlean/ik.Motion Lsu/catlean/ik;
// 580: if_acmpne 5c7
// 583: goto 590
// 586: ldc2_w -446118997108468955
// 589: lload 2
// 58a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58f: athrow
// 590: aload 63
// 592: aload 63
// 594: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 597: invokevirtual net/minecraft/class_243.method_10216 ()D
// 59a: aload 63
// 59c: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 59f: invokevirtual net/minecraft/class_243.method_10214 ()D
// 5a2: aload 0
// 5a3: lload 25
// 5a5: invokespecial su/catlean/uj.F (J)F
// 5a8: f2d
// 5a9: dsub
// 5aa: aload 63
// 5ac: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 5af: invokevirtual net/minecraft/class_243.method_10215 ()D
// 5b2: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 5b5: aload 62
// 5b7: ifnonnull 5d3
// 5ba: goto 5c7
// 5bd: ldc2_w -446118997108468955
// 5c0: lload 2
// 5c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c6: athrow
// 5c7: dload 69
// 5c9: aload 0
// 5ca: lload 25
// 5cc: invokespecial su/catlean/uj.F (J)F
// 5cf: f2d
// 5d0: dsub
// 5d1: dstore 69
// 5d3: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 5d6: lload 20
// 5d8: invokevirtual su/catlean/dm.Y (J)Z
// 5db: aload 62
// 5dd: ifnull 624
// 5e0: ifne 60c
// 5e3: goto 5f0
// 5e6: ldc2_w -446118997108468955
// 5e9: lload 2
// 5ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ef: athrow
// 5f0: aload 63
// 5f2: dconst_0
// 5f3: aload 63
// 5f5: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 5f8: invokevirtual net/minecraft/class_243.method_10214 ()D
// 5fb: dconst_0
// 5fc: invokevirtual net/minecraft/class_1297.method_18800 (DDD)V
// 5ff: goto 60c
// 602: ldc2_w -446118997108468955
// 605: lload 2
// 606: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60b: athrow
// 60c: aload 0
// 60d: aload 62
// 60f: ifnull 643
// 612: lload 52
// 614: invokespecial su/catlean/uj.B (J)Z
// 617: goto 624
// 61a: ldc2_w -446118997108468955
// 61d: lload 2
// 61e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 623: athrow
// 624: ifeq 642
// 627: aload 0
// 628: iload 34
// 62a: aload 63
// 62c: iload 35
// 62e: i2s
// 62f: iload 36
// 631: i2s
// 632: invokespecial su/catlean/uj.s (ILnet/minecraft/class_1297;SS)V
// 635: goto 642
// 638: ldc2_w -446118997108468955
// 63b: lload 2
// 63c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 641: athrow
// 642: aload 0
// 643: aload 62
// 645: ifnull 698
// 648: iload 7
// 64a: i2b
// 64b: lload 8
// 64d: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 650: getstatic su/catlean/ik.Packet Lsu/catlean/ik;
// 653: if_acmpne 697
// 656: goto 663
// 659: ldc2_w -446118997108468955
// 65c: lload 2
// 65d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 662: athrow
// 663: aload 63
// 665: dload 65
// 667: dload 69
// 669: dload 67
// 66b: invokevirtual net/minecraft/class_1297.method_5814 (DDD)V
// 66e: aload 0
// 66f: aload 63
// 671: invokestatic net/minecraft/class_2833.method_65307 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_2833;
// 674: dup
// 675: sipush 11703
// 678: ldc2_w 1589460983097925476
// 67b: lload 2
// 67c: lxor
// 67d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 682: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 685: lload 27
// 687: invokespecial su/catlean/uj.v (Lnet/minecraft/class_2833;J)V
// 68a: goto 697
// 68d: ldc2_w -446118997108468955
// 690: lload 2
// 691: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 696: athrow
// 697: aload 0
// 698: lload 60
// 69a: invokespecial su/catlean/uj.p (J)Z
// 69d: aload 62
// 69f: ifnull 6ed
// 6a2: ifeq 6e1
// 6a5: goto 6b2
// 6a8: ldc2_w -446118997108468955
// 6ab: lload 2
// 6ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b1: athrow
// 6b2: iload 22
// 6b4: lload 23
// 6b6: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 6b9: lload 16
// 6bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6be: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 6c1: getfield net/minecraft/class_1703.field_7763 I
// 6c4: bipush 0
// 6c5: bipush 0
// 6c6: getstatic net/minecraft/class_1713.field_7796 Lnet/minecraft/class_1713;
// 6c9: lload 16
// 6cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6ce: checkcast net/minecraft/class_1657
// 6d1: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 6d4: goto 6e1
// 6d7: ldc2_w -446118997108468955
// 6da: lload 2
// 6db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e0: athrow
// 6e1: aload 0
// 6e2: iload 46
// 6e4: i2c
// 6e5: iload 47
// 6e7: iload 48
// 6e9: i2s
// 6ea: invokespecial su/catlean/uj.E (CIS)Z
// 6ed: aload 62
// 6ef: ifnull 7b8
// 6f2: ifeq 796
// 6f5: goto 702
// 6f8: ldc2_w -446118997108468955
// 6fb: lload 2
// 6fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 701: athrow
// 702: aload 0
// 703: iload 4
// 705: i2b
// 706: lload 5
// 708: aload 63
// 70a: invokevirtual su/catlean/uj.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 70d: dconst_0
// 70e: aload 0
// 70f: lload 29
// 711: iload 31
// 713: i2c
// 714: invokespecial su/catlean/uj.z (JC)F
// 717: f2d
// 718: dconst_0
// 719: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 71c: dup
// 71d: sipush 10996
// 720: ldc2_w 1227248346041620595
// 723: lload 2
// 724: lxor
// 725: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 72d: astore 71
// 72f: aload 63
// 731: invokevirtual net/minecraft/class_1297.method_36454 ()F
// 734: fstore 72
// 736: aload 63
// 738: invokevirtual net/minecraft/class_1297.method_36455 ()F
// 73b: fstore 73
// 73d: aload 0
// 73e: iload 4
// 740: i2b
// 741: lload 5
// 743: aload 63
// 745: invokevirtual su/catlean/uj.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 748: astore 74
// 74a: aload 63
// 74c: aload 63
// 74e: invokevirtual net/minecraft/class_1297.method_36454 ()F
// 751: invokevirtual net/minecraft/class_1297.method_36456 (F)V
// 754: aload 63
// 756: aload 63
// 758: invokevirtual net/minecraft/class_1297.method_36455 ()F
// 75b: invokevirtual net/minecraft/class_1297.method_36457 (F)V
// 75e: aload 63
// 760: aload 71
// 762: invokevirtual net/minecraft/class_1297.method_33574 (Lnet/minecraft/class_243;)V
// 765: aload 0
// 766: aload 63
// 768: invokestatic net/minecraft/class_2833.method_65307 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_2833;
// 76b: dup
// 76c: sipush 11703
// 76f: ldc2_w 1589460983097925476
// 772: lload 2
// 773: lxor
// 774: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/uj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 779: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 77c: lload 27
// 77e: invokespecial su/catlean/uj.v (Lnet/minecraft/class_2833;J)V
// 781: aload 63
// 783: fload 72
// 785: invokevirtual net/minecraft/class_1297.method_36456 (F)V
// 788: aload 63
// 78a: fload 73
// 78c: invokevirtual net/minecraft/class_1297.method_36457 (F)V
// 78f: aload 63
// 791: aload 74
// 793: invokevirtual net/minecraft/class_1297.method_33574 (Lnet/minecraft/class_243;)V
// 796: lload 16
// 798: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 79b: getstatic net/minecraft/class_1313.field_6308 Lnet/minecraft/class_1313;
// 79e: lload 16
// 7a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7a3: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 7a6: invokevirtual net/minecraft/class_746.method_5784 (Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V
// 7a9: aload 1
// 7aa: invokevirtual su/catlean/api/event/events/player/EventPlayerTravel.cancel ()V
// 7ad: getstatic su/catlean/uj.W I
// 7b0: bipush 1
// 7b1: iadd
// 7b2: putstatic su/catlean/uj.W I
// 7b5: getstatic su/catlean/uj.W I
// 7b8: pop
// 7b9: return
}

@Flow
private final void X(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uj.b J
// 003: ldc2_w 24010140631173
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 122358743303010
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 39227067850466
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 107363417996981
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 87880749288772
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -2313366738240023629
// 029: lload 2
// 02a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: lload 4
// 033: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 036: aload 12
// 038: ifnull 060
// 03b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 03e: ifnull 066
// 041: goto 04e
// 044: ldc2_w -2352276653321816655
// 047: lload 2
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: lload 4
// 050: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 053: goto 060
// 056: ldc2_w -2352276653321816655
// 059: lload 2
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 063: ifnonnull 071
// 066: return
// 067: ldc2_w -2352276653321816655
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 1
// 072: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 075: instanceof net/minecraft/class_2661
// 078: aload 12
// 07a: ifnull 0a8
// 07d: ifeq 0a0
// 080: goto 08d
// 083: ldc2_w -2352276653321816655
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 0
// 08e: lload 8
// 090: invokevirtual su/catlean/uj.d (J)V
// 093: goto 0a0
// 096: ldc2_w -2352276653321816655
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: lload 10
// 0a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a5: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 0a8: aload 12
// 0aa: ifnull 0c0
// 0ad: ifeq 0ed
// 0b0: goto 0bd
// 0b3: ldc2_w -2352276653321816655
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: getstatic su/catlean/uj.Y Z
// 0c0: aload 12
// 0c2: ifnull 0d8
// 0c5: ifne 0ed
// 0c8: goto 0d5
// 0cb: ldc2_w -2352276653321816655
// 0ce: lload 2
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: getstatic su/catlean/uj.y Z
// 0d8: aload 12
// 0da: ifnull 0f4
// 0dd: ifeq 0ee
// 0e0: goto 0ed
// 0e3: ldc2_w -2352276653321816655
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: return
// 0ee: aload 0
// 0ef: lload 6
// 0f1: invokespecial su/catlean/uj.H (J)Z
// 0f4: aload 12
// 0f6: ifnull 11d
// 0f9: ifeq 1bd
// 0fc: goto 109
// 0ff: ldc2_w -2352276653321816655
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: aload 1
// 10a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 10d: instanceof net/minecraft/class_2692
// 110: goto 11d
// 113: ldc2_w -2352276653321816655
// 116: lload 2
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: aload 12
// 11f: ifnull 14a
// 122: ifeq 143
// 125: goto 132
// 128: ldc2_w -2352276653321816655
// 12b: lload 2
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: aload 1
// 133: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 136: goto 143
// 139: ldc2_w -2352276653321816655
// 13c: lload 2
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: aload 1
// 144: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 147: instanceof net/minecraft/class_2708
// 14a: aload 12
// 14c: ifnull 177
// 14f: ifeq 170
// 152: goto 15f
// 155: ldc2_w -2352276653321816655
// 158: lload 2
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aload 1
// 160: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 163: goto 170
// 166: ldc2_w -2352276653321816655
// 169: lload 2
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: aload 1
// 171: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 174: instanceof net/minecraft/class_2684
// 177: aload 12
// 179: ifnull 1b6
// 17c: ifeq 19d
// 17f: goto 18c
// 182: ldc2_w -2352276653321816655
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: aload 1
// 18d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 190: goto 19d
// 193: ldc2_w -2352276653321816655
// 196: lload 2
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: aload 1
// 19e: aload 12
// 1a0: ifnull 1ba
// 1a3: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1a6: instanceof net/minecraft/class_2740
// 1a9: goto 1b6
// 1ac: ldc2_w -2352276653321816655
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: ifeq 1bd
// 1b9: aload 1
// 1ba: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 1bd: return
}

@Flow
private final void v(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uj.b J
// 003: ldc2_w 83732771627353
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 60168609112766
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 48980266103082
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 21564554636587
// 035: lxor
// 036: dup2
// 037: bipush 56
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 8
// 040: lshl
// 041: bipush 8
// 043: lushr
// 044: lstore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 56572574695421
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 74854734730898
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 24311949995160
// 059: lxor
// 05a: lstore 16
// 05c: pop2
// 05d: ldc2_w 9095332553107403375
// 060: lload 2
// 061: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: astore 18
// 068: lload 4
// 06a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06d: aload 18
// 06f: ifnull 097
// 072: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 075: ifnull 09d
// 078: goto 085
// 07b: ldc2_w 9117345207249163373
// 07e: lload 2
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: lload 4
// 087: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08a: goto 097
// 08d: ldc2_w 9117345207249163373
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 09a: ifnonnull 0a8
// 09d: return
// 09e: ldc2_w 9117345207249163373
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: aload 1
// 0a9: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0ac: instanceof net/minecraft/class_2828$class_2831
// 0af: aload 18
// 0b1: ifnull 100
// 0b4: ifeq 0ec
// 0b7: goto 0c4
// 0ba: ldc2_w 9117345207249163373
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: aload 0
// 0c5: lload 12
// 0c7: invokespecial su/catlean/uj.x (J)Z
// 0ca: aload 18
// 0cc: ifnull 12a
// 0cf: goto 0dc
// 0d2: ldc2_w 9117345207249163373
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: ifne 115
// 0df: goto 0ec
// 0e2: ldc2_w 9117345207249163373
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 1
// 0ed: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0f0: instanceof net/minecraft/class_2851
// 0f3: goto 100
// 0f6: ldc2_w 9117345207249163373
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: aload 18
// 102: ifnull 153
// 105: ifeq 150
// 108: goto 115
// 10b: ldc2_w 9117345207249163373
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: lload 16
// 117: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11a: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 11d: goto 12a
// 120: ldc2_w 9117345207249163373
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: aload 18
// 12c: ifnull 153
// 12f: ifeq 150
// 132: goto 13f
// 135: ldc2_w 9117345207249163373
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: aload 1
// 140: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 143: goto 150
// 146: ldc2_w 9117345207249163373
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: getstatic su/catlean/uj.Y Z
// 153: aload 18
// 155: ifnull 1a9
// 158: ifeq 1a2
// 15b: goto 168
// 15e: ldc2_w 9117345207249163373
// 161: lload 2
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: aload 1
// 169: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 16c: instanceof net/minecraft/class_2833
// 16f: aload 18
// 171: ifnull 1a9
// 174: goto 181
// 177: ldc2_w 9117345207249163373
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: ifeq 1a2
// 184: goto 191
// 187: ldc2_w 9117345207249163373
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: aload 1
// 192: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 195: goto 1a2
// 198: ldc2_w 9117345207249163373
// 19b: lload 2
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: aload 1
// 1a3: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 1a6: instanceof net/minecraft/class_2851
// 1a9: aload 18
// 1ab: ifnull 1d7
// 1ae: ifeq 1eb
// 1b1: goto 1be
// 1b4: ldc2_w 9117345207249163373
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: aload 0
// 1bf: iload 6
// 1c1: i2s
// 1c2: iload 7
// 1c4: i2s
// 1c5: iload 8
// 1c7: invokespecial su/catlean/uj.W (SSI)Z
// 1ca: goto 1d7
// 1cd: ldc2_w 9117345207249163373
// 1d0: lload 2
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: ifeq 1eb
// 1da: aload 1
// 1db: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 1de: goto 1eb
// 1e1: ldc2_w 9117345207249163373
// 1e4: lload 2
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: lload 16
// 1ed: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f0: invokevirtual net/minecraft/class_746.method_49694 ()Lnet/minecraft/class_1297;
// 1f3: ifnull 233
// 1f6: getstatic su/catlean/uj.Y Z
// 1f9: aload 18
// 1fb: ifnull 21e
// 1fe: goto 20b
// 201: ldc2_w 9117345207249163373
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: ifne 233
// 20e: goto 21b
// 211: ldc2_w 9117345207249163373
// 214: lload 2
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: getstatic su/catlean/uj.y Z
// 21e: aload 18
// 220: ifnull 23b
// 223: ifeq 234
// 226: goto 233
// 229: ldc2_w 9117345207249163373
// 22c: lload 2
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: return
// 234: aload 1
// 235: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 238: instanceof net/minecraft/class_2833
// 23b: aload 18
// 23d: ifnull 275
// 240: ifeq 2e1
// 243: goto 250
// 246: ldc2_w 9117345207249163373
// 249: lload 2
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: aload 0
// 251: aload 18
// 253: ifnull 279
// 256: goto 263
// 259: ldc2_w 9117345207249163373
// 25c: lload 2
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: lload 14
// 265: invokespecial su/catlean/uj.e (J)Z
// 268: goto 275
// 26b: ldc2_w 9117345207249163373
// 26e: lload 2
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: ifeq 2e1
// 278: aload 0
// 279: iload 9
// 27b: i2b
// 27c: lload 10
// 27e: invokespecial su/catlean/uj.q (BJ)Lsu/catlean/ik;
// 281: getstatic su/catlean/ik.Packet Lsu/catlean/ik;
// 284: if_acmpne 2e1
// 287: getstatic su/catlean/uj.A Ljava/util/ArrayList;
// 28a: aload 1
// 28b: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 28e: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
// 291: aload 18
// 293: ifnull 2ca
// 296: goto 2a3
// 299: ldc2_w 9117345207249163373
// 29c: lload 2
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: ifeq 2d0
// 2a6: goto 2b3
// 2a9: ldc2_w 9117345207249163373
// 2ac: lload 2
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: getstatic su/catlean/uj.A Ljava/util/ArrayList;
// 2b6: aload 1
// 2b7: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2ba: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
// 2bd: goto 2ca
// 2c0: ldc2_w 9117345207249163373
// 2c3: lload 2
// 2c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: athrow
// 2ca: pop
// 2cb: aload 18
// 2cd: ifnonnull 2e1
// 2d0: aload 1
// 2d1: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 2d4: goto 2e1
// 2d7: ldc2_w 9117345207249163373
// 2da: lload 2
// 2db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e0: athrow
// 2e1: return
}

private static final boolean Y() {
long var0 = b ^ 39948022510574L;
long var10001 = var0 ^ 93021773547983L;
int var2 = (int)((var0 ^ 93021773547983L) >>> 48);
int var3 = (int)((var0 ^ 93021773547983L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return D.E((char)var2, var3, (short)var4);
}

private static final boolean R() {
long var0 = b ^ 116299915847952L;
long var2 = var0 ^ 67011523537449L;
return D.V(var2);
}

private static final boolean t() {
long var0 = b ^ 92748254000197L;
long var2 = var0 ^ 1575642609532L;
return D.V(var2);
}

static {
long var20 = b ^ 14818885469485L;
long var22 = var20 ^ 68666797164831L;
long var24 = var20 ^ 106483202806559L;
long var26 = var20 ^ 76120800718704L;
long var28 = var20 ^ 88867854703953L;
long var10001 = var20 ^ 94838700165219L;
int var30 = (int)((var20 ^ 94838700165219L) >>> 48);
int var31 = (int)((var20 ^ 94838700165219L) << 16 >>> 32);
int var32 = (int)(var10001 << 48 >>> 48);
long var33 = var20 ^ 36944590564595L;
long var35 = var20 ^ 73757660954328L;
long var37 = var20 ^ 19441544095717L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[68];
int var16 = 0;
String var15 = "\u0092ÿ\u008cY\u0003M\u0091\u0019\u0094iR\u008b¦ÓH@\u009e\u0097WÄ\u0091ÿgO\u0010AvçUAS7Á\u0011ß\u0098s70z\f v`f§¾\u001b\u0083bùaêSð÷ÅÉÅÔe1ò\u0095¼c4\u000f:\u0015<±ª@  \u008a?Qè[m¯\u008d>=\u0010äè\u009eú]µ\u001c·SûH_ëÈÛ3=\u00ad4\b\u0010d\u0006©7À\u001a¶f\u0097øé«ó\\\u0094?\u00105xG¢î\u008a:}»\u0084DÂ¡\u0016Va\u0018À\u0080ð\u0095_?T'7OqM¿`E|>\u001cmD¤\u000b¶x \u0001Ó\u0003ÿLX\u0000«\u008adÈë!^m\u0015Ñ\u0091Ö\u0093O\u0014\u008fÞº\u0005\u009f-<(x\u0019\u0018ïE´nck\u009a¨mùØa5\u0097a\u001e_<Ñ¹:ñÿ\u000b WI\u001b\u0014\u000b\u009dI\u0097P©\u001c\u009dÉ\u0082ã\u0005àÿ@\u0091>l1,\u0002o\u009a\\ØÁiÿ\u00109wïvæø\u0011\u009e\u0081\u0080F\u0017-ÜCB(s\u00851\u008dME\u0006\u0084\u0017\u0014á\u009a\u000eoØ\u0088;YÎa>e%\u0088\u0015è\u008e\u009bÝ¶\u0083\u0011\u000f\u0093º\u0014SIm\u0099 \u0091j\u009b`ñÍÞSYáb2a &\u0098\u001a\u008c\rMôþX\u0091r\u0081\u0095Ú\u0014¨eº ÓyËK¥C»D\u001cdG5.\u008c\u008c·ºm\u0005¡\u0081×â\u000f\u0091È±\u0090&\u0003\u0003 (ñ\u001b\r¼\u0019ýÿ\u0019Ã2(\u0010¸\u0007×vNS\u0015Â¹ãÐ[\u0095\u000e\u0019\u0019\u000eÉ·,+\u0014ç\u0095\u0099W\u0089\u0089\u0018:\r\u0087h\u0088\u0012ðÓëÖ\u009a÷\u000bô\\8\u0005¢DÏ@u\u0081P \u0088h\u009c\u0083LÍÕ\u009aòôC0ÒD\u0092\u001bp-\u0090²É\u001c\u0089Ê£\u0096\tÄx\u001c¤<\u0018Úl-xé¦i§ö×Í \u0000F\ràµ³\u0013x=\u0097\u0018\u0091\u0018TQÂ}\u009båä\u0087-sÏï[í~Îeõ\\±Ù¯«F ±EJ[W=\u0017Ç¡\u0011À?Z\u00adk^~ñ\u0094Æ\"jà×±\u0090¡\\Ëy\u0083h\u0018.4w.>CJ¦ÇâúJ>\u009a\u0015±½\u0011³g\u0015o5J(\u0099\"\u0088\u0091!ü 5ç,\u0000Dà¢0´nJu¶\u0089Ì\u00ad¿\u001f[¶&VPp\f\u000e;Zæ¨¾\u001eM \u008f\u0013\u009bH\u000698Âÿ\u00828`\u009a³\u0012\u0012\f¿ü\u008cç\u001d\u0096g6z~÷%\u0086\\}(\u0086/ÆÅ\u008cúTµI´\u009fïÄó\u0096_Ì\u0083!ej=Sî\u0083\u0094çE\u00113M[\fru\u0099È\u0085¨w\u0018\u008dFÓP¾»ðN«~\u0001Áf\u0001b?\b½\u009dOÄàßõ \u0000±ÒÖ\u0092n/{BãPµU\u0003E\u0010\u0017J\\\u0083c\u000b\u0093{£Û&g\u0010×s?\u0018d8oÜY7\u0099\u00956N\u0084\u00ad\u0015®fú\bÊo\u0095\u008aõ+±\u0010ï\u000b\t\u001cú\u001cÝfºv¼áð\tN# Âya\u0014Ã2¤&ý÷wÛÞ@ \fC\u000fA>u\u0082üÿ\u008aèD½Ü\u0018)!\u0010&\u0081\u000e¤&ßZáIõ\u009bV£ú¦â\u0010UÕ^\u0089X¼E\u0088a\u0000oæ¨Ýìî\u0010EÆB¿Þ\u0083Nlóó\u0005ç\u001d\u0010\u0092ä(%ÒQX\u0094ØÎ\u0090J\r\u0082\u0018*!wU\u0018ëÁ}\u0006NC³ûüi\u0096£#`áÁ\u0080\u0001a·âÙU(\u007fa7ìÞ\u008cÊD\u0011ø\u0016M>\u008f1w±×óMÜZÅwá8ù~x\u0096â´Í\u007fô$RV\u0005î\u0010Ê\u0014/ðDB \u001fT\u0092\u0012é\u0011kÖ\u0005 ±À6g,\u0096¸g\u001eØ¤íÅ¦3Ð\u008d?\u001c±8\u000b\u0019Z\u0082dz\u0007Þ\u0011<Â0\u0099UeÛ«á\u008eä\u0087VuI@}\u001cÂ\u0011d¿3¢rãç¤(Z\u0095\u0084±\u0086\u0080(\u0001nGño\u001aFW½^ØPDÞý ×\u0003á\bC\u009b{J\u001aÀ*\u0019¾\u008f\u008cmÅxæw7!¶àü\u0081ì\u009dß-çâ Y\u0095æU\\ÿ×^\u0098Ó\u0081è[x\u0091V\bÕí÷BË¿N>¼Z\u0015ÉÕ\"ß\u0018\u0096üÅ\u0013ê \u0007âð>Ê8¤%\u0094th~Ì_ï\u0015x\u001f\u0018üdðìOà{¼kã \u008b_ä¨\u0010\u0003\u0016ì_\u000fBÍ\u0083\u0010ÞoÓ\b\u008cjúl\u0080@~\u0002\u009b\u0080]â\u0018½\ns\u000eôâ«Szp\n\u009cÞ\u0090\u0091ozÈNâvÑ¸ò\u0010Ä\u0092ª]E\u0099[¤<=`\u0085Ñ=0µ\u0010©4\u009e@D¹¸zêQ+¢Ä\u0002ýÿ\u0018±Ñ<i\u0080à\u0081¥kr\u000b\u0082ù²[×ìê\u0087Ìá ½\u0081\u0018\u007f\u0094ðAL¼a\u009cb\u0015\u001cè\u0000âcH9k3ß1À©y\u0018¾\u0092o\u0088I\u009aKût<èB Ú\u0089\u001bª%ê¹\u008bÿ\u0002\u008d(üèÉ\u0088j¾ù¹Çwe\u0081\r\n\u0001Õ\u0095Zï.\u00835¨^ê$\u008e%Z¾Ó ¥(õ\u0006\"\u0095\u008b7 ¤Z\u0014q+\u008f\u0018'Pòä\u008fL\u0016\u0082p\nÃÎ\u001c(\u008fÇu5\u0085w³n -È\u0018\u009e«\u009d\u0081\u0098c\u0092\u0082üSBIJéÅ\n\u0097¬\u0091\u0086Íã\u0013Ö\u0010jaÉ\u0015#L´\bó?Th¯>Yã \u0005+Ë°\rHâê\u001d.Ï¤\u0099\u009cÀ\u009füÇ9\u0013\u0093\u001d\u0091\buàó|\u001f£¤F\u00106|Ld÷*I\u0014^2ý=O®\u007fÈ \u0017\u0003\u0095®Ü\"¥¿Ô\n\u0015íf7<÷ë\u008a\u008fÂl&ÛAÓ©Ó×\u008dã\u0005`8* Eíle®(C½.\u008d\u0088¯ \u0094%ÄJrV\u0090ô-\u0099ÞK\u0091×yAôe\"bÃ²;*í´¼ï\u00956ßÉ&HèÏ\u001fVÖùá\u0018Ô\u009cÑ1óE${ö{\u0083µ\u0000äºq$(zØÔmFà\u0010êÀ0æ9üÄú¶ÆÈÆ®ä»\u0019\u0010ì\u0094ÂªÇ7±äÅ\u0005¯`\u008ad:|\u0018A\u0085\u008fë\u0005Õ;Ñ\u008b\u009f\u008eÇT\u0090<+\n\u009b÷\u0005\u001fFØ4\u0010ÄZ\u0083\t<ïö¶I\u0092îùï\u0015Õc\u0010\u0092\u001b·\u0007ål)dQÞ\u0090åhúó`\u0010\u0016@\u009c\u0086ï\u0019,(ât¤ê?\u0097h°(1TR\u0092\u0014ª1Ï\u0087¯ú\u009dç5ß\u008d\u00139jÇ\u0005\u001b\u009c\u001e¤ÔÄ\u0091ÔN\u0003T¶2\u0085\u0019ä\u0083cÐ\u0010,¬§âN/\u0090Y´Ø\u0097Ãj\b\u008a± óÀ À\u001fÛLáPÁchË!9l\u0088ÁÒ$*\u009a9\f\u0018(H\u0081MÔ6\u0015";
int var17 = "\u0092ÿ\u008cY\u0003M\u0091\u0019\u0094iR\u008b¦ÓH@\u009e\u0097WÄ\u0091ÿgO\u0010AvçUAS7Á\u0011ß\u0098s70z\f v`f§¾\u001b\u0083bùaêSð÷ÅÉÅÔe1ò\u0095¼c4\u000f:\u0015<±ª@  \u008a?Qè[m¯\u008d>=\u0010äè\u009eú]µ\u001c·SûH_ëÈÛ3=\u00ad4\b\u0010d\u0006©7À\u001a¶f\u0097øé«ó\\\u0094?\u00105xG¢î\u008a:}»\u0084DÂ¡\u0016Va\u0018À\u0080ð\u0095_?T'7OqM¿`E|>\u001cmD¤\u000b¶x \u0001Ó\u0003ÿLX\u0000«\u008adÈë!^m\u0015Ñ\u0091Ö\u0093O\u0014\u008fÞº\u0005\u009f-<(x\u0019\u0018ïE´nck\u009a¨mùØa5\u0097a\u001e_<Ñ¹:ñÿ\u000b WI\u001b\u0014\u000b\u009dI\u0097P©\u001c\u009dÉ\u0082ã\u0005àÿ@\u0091>l1,\u0002o\u009a\\ØÁiÿ\u00109wïvæø\u0011\u009e\u0081\u0080F\u0017-ÜCB(s\u00851\u008dME\u0006\u0084\u0017\u0014á\u009a\u000eoØ\u0088;YÎa>e%\u0088\u0015è\u008e\u009bÝ¶\u0083\u0011\u000f\u0093º\u0014SIm\u0099 \u0091j\u009b`ñÍÞSYáb2a &\u0098\u001a\u008c\rMôþX\u0091r\u0081\u0095Ú\u0014¨eº ÓyËK¥C»D\u001cdG5.\u008c\u008c·ºm\u0005¡\u0081×â\u000f\u0091È±\u0090&\u0003\u0003 (ñ\u001b\r¼\u0019ýÿ\u0019Ã2(\u0010¸\u0007×vNS\u0015Â¹ãÐ[\u0095\u000e\u0019\u0019\u000eÉ·,+\u0014ç\u0095\u0099W\u0089\u0089\u0018:\r\u0087h\u0088\u0012ðÓëÖ\u009a÷\u000bô\\8\u0005¢DÏ@u\u0081P \u0088h\u009c\u0083LÍÕ\u009aòôC0ÒD\u0092\u001bp-\u0090²É\u001c\u0089Ê£\u0096\tÄx\u001c¤<\u0018Úl-xé¦i§ö×Í \u0000F\ràµ³\u0013x=\u0097\u0018\u0091\u0018TQÂ}\u009båä\u0087-sÏï[í~Îeõ\\±Ù¯«F ±EJ[W=\u0017Ç¡\u0011À?Z\u00adk^~ñ\u0094Æ\"jà×±\u0090¡\\Ëy\u0083h\u0018.4w.>CJ¦ÇâúJ>\u009a\u0015±½\u0011³g\u0015o5J(\u0099\"\u0088\u0091!ü 5ç,\u0000Dà¢0´nJu¶\u0089Ì\u00ad¿\u001f[¶&VPp\f\u000e;Zæ¨¾\u001eM \u008f\u0013\u009bH\u000698Âÿ\u00828`\u009a³\u0012\u0012\f¿ü\u008cç\u001d\u0096g6z~÷%\u0086\\}(\u0086/ÆÅ\u008cúTµI´\u009fïÄó\u0096_Ì\u0083!ej=Sî\u0083\u0094çE\u00113M[\fru\u0099È\u0085¨w\u0018\u008dFÓP¾»ðN«~\u0001Áf\u0001b?\b½\u009dOÄàßõ \u0000±ÒÖ\u0092n/{BãPµU\u0003E\u0010\u0017J\\\u0083c\u000b\u0093{£Û&g\u0010×s?\u0018d8oÜY7\u0099\u00956N\u0084\u00ad\u0015®fú\bÊo\u0095\u008aõ+±\u0010ï\u000b\t\u001cú\u001cÝfºv¼áð\tN# Âya\u0014Ã2¤&ý÷wÛÞ@ \fC\u000fA>u\u0082üÿ\u008aèD½Ü\u0018)!\u0010&\u0081\u000e¤&ßZáIõ\u009bV£ú¦â\u0010UÕ^\u0089X¼E\u0088a\u0000oæ¨Ýìî\u0010EÆB¿Þ\u0083Nlóó\u0005ç\u001d\u0010\u0092ä(%ÒQX\u0094ØÎ\u0090J\r\u0082\u0018*!wU\u0018ëÁ}\u0006NC³ûüi\u0096£#`áÁ\u0080\u0001a·âÙU(\u007fa7ìÞ\u008cÊD\u0011ø\u0016M>\u008f1w±×óMÜZÅwá8ù~x\u0096â´Í\u007fô$RV\u0005î\u0010Ê\u0014/ðDB \u001fT\u0092\u0012é\u0011kÖ\u0005 ±À6g,\u0096¸g\u001eØ¤íÅ¦3Ð\u008d?\u001c±8\u000b\u0019Z\u0082dz\u0007Þ\u0011<Â0\u0099UeÛ«á\u008eä\u0087VuI@}\u001cÂ\u0011d¿3¢rãç¤(Z\u0095\u0084±\u0086\u0080(\u0001nGño\u001aFW½^ØPDÞý ×\u0003á\bC\u009b{J\u001aÀ*\u0019¾\u008f\u008cmÅxæw7!¶àü\u0081ì\u009dß-çâ Y\u0095æU\\ÿ×^\u0098Ó\u0081è[x\u0091V\bÕí÷BË¿N>¼Z\u0015ÉÕ\"ß\u0018\u0096üÅ\u0013ê \u0007âð>Ê8¤%\u0094th~Ì_ï\u0015x\u001f\u0018üdðìOà{¼kã \u008b_ä¨\u0010\u0003\u0016ì_\u000fBÍ\u0083\u0010ÞoÓ\b\u008cjúl\u0080@~\u0002\u009b\u0080]â\u0018½\ns\u000eôâ«Szp\n\u009cÞ\u0090\u0091ozÈNâvÑ¸ò\u0010Ä\u0092ª]E\u0099[¤<=`\u0085Ñ=0µ\u0010©4\u009e@D¹¸zêQ+¢Ä\u0002ýÿ\u0018±Ñ<i\u0080à\u0081¥kr\u000b\u0082ù²[×ìê\u0087Ìá ½\u0081\u0018\u007f\u0094ðAL¼a\u009cb\u0015\u001cè\u0000âcH9k3ß1À©y\u0018¾\u0092o\u0088I\u009aKût<èB Ú\u0089\u001bª%ê¹\u008bÿ\u0002\u008d(üèÉ\u0088j¾ù¹Çwe\u0081\r\n\u0001Õ\u0095Zï.\u00835¨^ê$\u008e%Z¾Ó ¥(õ\u0006\"\u0095\u008b7 ¤Z\u0014q+\u008f\u0018'Pòä\u008fL\u0016\u0082p\nÃÎ\u001c(\u008fÇu5\u0085w³n -È\u0018\u009e«\u009d\u0081\u0098c\u0092\u0082üSBIJéÅ\n\u0097¬\u0091\u0086Íã\u0013Ö\u0010jaÉ\u0015#L´\bó?Th¯>Yã \u0005+Ë°\rHâê\u001d.Ï¤\u0099\u009cÀ\u009füÇ9\u0013\u0093\u001d\u0091\buàó|\u001f£¤F\u00106|Ld÷*I\u0014^2ý=O®\u007fÈ \u0017\u0003\u0095®Ü\"¥¿Ô\n\u0015íf7<÷ë\u008a\u008fÂl&ÛAÓ©Ó×\u008dã\u0005`8* Eíle®(C½.\u008d\u0088¯ \u0094%ÄJrV\u0090ô-\u0099ÞK\u0091×yAôe\"bÃ²;*í´¼ï\u00956ßÉ&HèÏ\u001fVÖùá\u0018Ô\u009cÑ1óE${ö{\u0083µ\u0000äºq$(zØÔmFà\u0010êÀ0æ9üÄú¶ÆÈÆ®ä»\u0019\u0010ì\u0094ÂªÇ7±äÅ\u0005¯`\u008ad:|\u0018A\u0085\u008fë\u0005Õ;Ñ\u008b\u009f\u008eÇT\u0090<+\n\u009b÷\u0005\u001fFØ4\u0010ÄZ\u0083\t<ïö¶I\u0092îùï\u0015Õc\u0010\u0092\u001b·\u0007ål)dQÞ\u0090åhúó`\u0010\u0016@\u009c\u0086ï\u0019,(ât¤ê?\u0097h°(1TR\u0092\u0014ª1Ï\u0087¯ú\u009dç5ß\u008d\u00139jÇ\u0005\u001b\u009c\u001e¤ÔÄ\u0091ÔN\u0003T¶2\u0085\u0019ä\u0083cÐ\u0010,¬§âN/\u0090Y´Ø\u0097Ãj\b\u008a± óÀ À\u001fÛLáPÁchË!9l\u0088ÁÒ$*\u009a9\f\u0018(H\u0081MÔ6\u0015"
.length();
char var14 = 24;
int var42 = -1;

label54:
while (true) {
String var43 = var15.substring(++var42, var42 + var14);
byte var47 = -1;

while (true) {
byte[] var19 = var11.doFinal(var43.getBytes("ISO-8859-1"));
String var55 = b(var19).intern();
switch (var47) {
case 0:
var18[var16++] = var55;
if ((var42 += var14) >= var17) {
i = var18;
t = new String[68];
C = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[35];
int var3 = 0;
String var4 = "\u0080`5#9Ú£¹ä\u0019XÁÌâZó± ¶¾\u0016¦Tñ»\u008a`3èC\u0094q\u0082%o\u0017\u007fú +S\u0007¶Òó\u0087iÖ\u009d\u0080ôÏÑÁN\u0016M\u0004û§e\u009dø\u001a\u0083\u008cC\u008f®\u0015Ì\u000eÐDâ{\t¡Ü\u0005^`mÓùòa\u0099ºõ\u008b :À×z\u0084ygêÈùj\u0084\"£\u0002¨Up{§\u0084¼\u009f\u0019®\u0017\u0019\u009fQ\u0004--F'õV\u0018\u0089«åg»P¥¤~ã\u001fýFÅ\u0013¶\u0000\u0019ë\u0099\u0098ò\u0017\u009dUÐß¢Ó\u007f´\u0083\u001fûz5:Õn\u001c@\u001cÉËê\u0082zE©ÉÃ_Ú\u0082\u008a\u008e·9\u009fÌs\u009c\u0090ó\u0016Z¥\u001bUiªA\u0017\u0004ÄfËß\u007f¥Õ²\u001b\u001d,\u0087±É²\u0098\u009d\u001b©\u0004É\u0010î\n\u008czV._\u000fÃ\u0094\u0082Yyï\u009d\u000b\u001b\n&T¥esÈ\u0088¢í\u0005Ù\u0085¤±ÒE\u008d\u009b`ãx";
int var5 = "\u0080`5#9Ú£¹ä\u0019XÁÌâZó± ¶¾\u0016¦Tñ»\u008a`3èC\u0094q\u0082%o\u0017\u007fú +S\u0007¶Òó\u0087iÖ\u009d\u0080ôÏÑÁN\u0016M\u0004û§e\u009dø\u001a\u0083\u008cC\u008f®\u0015Ì\u000eÐDâ{\t¡Ü\u0005^`mÓùòa\u0099ºõ\u008b :À×z\u0084ygêÈùj\u0084\"£\u0002¨Up{§\u0084¼\u009f\u0019®\u0017\u0019\u009fQ\u0004--F'õV\u0018\u0089«åg»P¥¤~ã\u001fýFÅ\u0013¶\u0000\u0019ë\u0099\u0098ò\u0017\u009dUÐß¢Ó\u007f´\u0083\u001fûz5:Õn\u001c@\u001cÉËê\u0082zE©ÉÃ_Ú\u0082\u008a\u008e·9\u009fÌs\u009c\u0090ó\u0016Z¥\u001bUiªA\u0017\u0004ÄfËß\u007f¥Õ²\u001b\u001d,\u0087±É²\u0098\u009d\u001b©\u0004É\u0010î\n\u008czV._\u000fÃ\u0094\u0082Yyï\u009d\u000b\u001b\n&T¥esÈ\u0088¢í\u0005Ù\u0085¤±ÒE\u008d\u009b`ãx"
.length();
byte var2 = 0;

label36:
while (true) {
byte var51 = var2;
var2 += 8;
byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
long[] var46 = var6;
int var52 = var3++;
long var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var62 = -1;

while (true) {
long var8 = var59;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var64 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var62) {
case 0:
var46[var52] = var64;
if (var2 >= var5) {
w = var6;
x = new Integer[35];
KProperty[] var39 = new KProperty[c<"l">(7651, 3240065453129055398L ^ var20)];
var39[0] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(13476, 5394354081763026234L ^ var20), b<"a">(30212, 1497691749722105741L ^ var20), 0)
);
var39[1] = Reflection.property1(new PropertyReference1Impl(uj.class, b<"a">(19160, 4483524507125586761L ^ var20), b<"a">(30502, 15053899010352812L ^ var20), 0));
var39[2] = Reflection.property1(new PropertyReference1Impl(uj.class, b<"a">(1951, 3639512690758178348L ^ var20), b<"a">(26192, 950489813841557461L ^ var20), 0));
var39[3] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(24627, 7678997671377711549L ^ var20), b<"a">(31168, 550330954742933595L ^ var20), 0)
);
var39[4] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(13523, 7723781450907084157L ^ var20), b<"a">(13569, 816569215232173197L ^ var20), 0)
);
var39[5] = Reflection.property1(new PropertyReference1Impl(uj.class, b<"a">(3749, 4172825880863924017L ^ var20), b<"a">(15204, 311235741223905985L ^ var20), 0));
var39[c<"l">(18732, 2937400001407281266L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(6699, 547026478560758698L ^ var20), b<"a">(28263, 1665648634436042701L ^ var20), 0)
);
var39[c<"l">(28972, 1091473476169289835L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(3660, 5795845565146357708L ^ var20), b<"a">(23353, 7821124147934628515L ^ var20), 0)
);
var39[c<"l">(32049, 3899030145702485064L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(1989, 5426994796062332528L ^ var20), b<"a">(1944, 6159639977280132667L ^ var20), 0)
);
var39[c<"l">(22223, 2326936681529505678L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(3566, 2674569154744474704L ^ var20), b<"a">(29055, 4671289493335580893L ^ var20), 0)
);
var39[c<"l">(2475, 783071784310417663L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(19564, 8169982016094805470L ^ var20), b<"a">(8011, 2330510125011324637L ^ var20), 0)
);
var39[c<"l">(17514, 7488546245186151741L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(24440, 3867091832858611417L ^ var20), b<"a">(29408, 2791284986978640749L ^ var20), 0)
);
var39[c<"l">(7786, 2986745812184547104L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(10046, 6812362290945226450L ^ var20), b<"a">(16317, 6451120821951327771L ^ var20), 0)
);
var39[c<"l">(25017, 3701449640667037922L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(24611, 7113366453698900400L ^ var20), b<"a">(11306, 3596638679095672202L ^ var20), 0)
);
var39[c<"l">(18107, 4177992770935646205L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(398, 7832048647618646043L ^ var20), b<"a">(15144, 7966766064030837434L ^ var20), 0)
);
var39[c<"l">(18401, 5931527434716473017L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(20550, 7240518404185620961L ^ var20), b<"a">(31744, 6482355971531550091L ^ var20), 0)
);
var39[c<"l">(9801, 4798648761198577408L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(10762, 7125024963778542478L ^ var20), b<"a">(5510, 1657602090699834417L ^ var20), 0)
);
var39[c<"l">(31555, 176275460944615966L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(2380, 129184235970156784L ^ var20), b<"a">(14483, 4862345810349648169L ^ var20), 0)
);
var39[c<"l">(32520, 6912266692052672071L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(25500, 8063338348684882477L ^ var20), b<"a">(9913, 3294643353220904763L ^ var20), 0)
);
var39[c<"l">(2750, 1481177264509103044L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uj.class, b<"a">(10303, 1490147516754196912L ^ var20), b<"a">(16204, 2748077324453768949L ^ var20), 0)
);
h = var39;
D = new uj(var35);
e = yp.L(D, b<"a">(6471, 2902029131807738094L ^ var20), ik.Packet, null, null, c<"l">(7786, 2986745812184547104L ^ var20), null, var37);
c = yp.t(D, b<"a">(19718, 2488339318408125614L ^ var20), false, var28, null, null, c<"l">(7786, 2986745812184547104L ^ var20), null);
n = yp.t(D, b<"a">(16525, 2739939226707136829L ^ var20), false, var28, null, null, c<"l">(7786, 2986745812184547104L ^ var20), null);
o = yp.t(D, b<"a">(30020, 303514105120072944L ^ var20), true, var28, null, null, c<"l">(7786, 2986745812184547104L ^ var20), null);
j = yp.t(D, b<"a">(18489, 3832048190093891990L ^ var20), true, var28, null, null, c<"l">(7786, 2986745812184547104L ^ var20), null);
g = yp.k(
D, b<"a">(21669, 4925415582621861181L ^ var20), 2.0F, var24, RangesKt.rangeTo(0.0F, 25.0F), null, null, c<"l">(6022, 738112717683406551L ^ var20), null
);
z = yp.k(
D, b<"a">(15700, 401919905959898338L ^ var20), 1.0F, var24, RangesKt.rangeTo(0.0F, 10.0F), null, null, c<"l">(26672, 7919338488755603808L ^ var20), null
);
V = yp.B(D, b<"a">(19440, 6253707115514141299L ^ var20), (short)var30, null, null, c<"l">(18732, 2937400001407281266L ^ var20), var31, null, (char)var32);
k = yp.k(
D, b<"a">(10642, 4895579702002546709L ^ var20), 0.0F, var24, RangesKt.rangeTo(0.0F, 10.0F), D.r(var33), null, c<"l">(21014, 7245241168942527325L ^ var20), null
);
O = yp.t(D, b<"a">(8684, 8633286853972357185L ^ var20), false, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
E = yp.t(D, b<"a">(21602, 3500880120426726898L ^ var20), true, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
B = yp.t(D, b<"a">(3373, 5193919392963550357L ^ var20), false, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
L = yp.t(D, b<"a">(31289, 6456657237982161829L ^ var20), false, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
P = yp.Y(D, b<"a">(9799, 7721260264195094465L ^ var20), 0.1F, RangesKt.rangeTo(0.0F, 10.0F), var22, D.r(var33), uj::Y);
N = yp.t(D, b<"a">(27005, 4377580281980074208L ^ var20), true, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
T = yp.t(D, b<"a">(18093, 5425712960865113920L ^ var20), true, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
a = yp.t(D, b<"a">(15870, 4205401030371535977L ^ var20), false, var28, D.r(var33), null, c<"l">(32049, 3899030145702485064L ^ var20), null);
m = yp.O(
var26,
D,
b<"a">(13876, 7281785262205134729L ^ var20),
c<"l">(11632, 3443294123435723811L ^ var20),
new IntRange(1, c<"l">(13450, 2762598513362376142L ^ var20)),
D.r(var33),
uj::R
);
d = yp.O(
var26,
D,
b<"a">(3255, 4693862976748838163L ^ var20),
c<"l">(11632, 3443294123435723811L ^ var20),
new IntRange(1, c<"l">(21638, 1531925148227073478L ^ var20)),
D.r(var33),
uj::t
);
l = yp.k(
D, b<"a">(10621, 1409966062220572881L ^ var20), 1.0F, var24, RangesKt.rangeTo(0.1F, 5.0F), D.r(var33), null, c<"l">(21014, 7245241168942527325L ^ var20), null
);
A = new ArrayList();
return;
}
break;
default:
var46[var52] = var64;
if (var2 < var5) {
continue label36;
}

var4 = "e\u001f\u00adXZ\u0002\u0085ÐP¼\u0080Å/ãdÈ";
var5 = "e\u001f\u00adXZ\u0002\u0085ÐP¼\u0080Å/ãdÈ".length();
var2 = 0;
}

byte var53 = var2;
var2 += 8;
var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
var46 = var6;
var52 = var3++;
var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var62 = 0;
}
}
}

var14 = var15.charAt(var42);
break;
default:
var18[var16++] = var55;
if ((var42 += var14) < var17) {
var14 = var15.charAt(var42);
continue label54;
}

var15 = "¬@\u0000\u0010¨ey\tÿ\fH\u009a»\u008c'Lq\u001d[¾(\u0091ä't\u0091\u0010N5%!Â8\u0080Xoü)Æ\u0019\u0082ú\u0095N2\u008eÉ=\u0090³Ö\u008eÜ\u0095=<7\u0000°ú\u0081ÎsÇó~\u0081&ÓÒ\u0090P&×ì¹\u008cî-\u0010íFÔ»KvÀ¢ç";
var17 = "¬@\u0000\u0010¨ey\tÿ\fH\u009a»\u008c'Lq\u001d[¾(\u0091ä't\u0091\u0010N5%!Â8\u0080Xoü)Æ\u0019\u0082ú\u0095N2\u008eÉ=\u0090³Ö\u008eÜ\u0095=<7\u0000°ú\u0081ÎsÇó~\u0081&ÓÒ\u0090P&×ì¹\u008cî-\u0010íFÔ»KvÀ¢ç"
.length();
var14 = ' ';
var42 = -1;
}

var43 = var15.substring(++var42, var42 + var14);
var47 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18990;
if (t[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])u.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
u.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/uj", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = i[var5].getBytes("ISO-8859-1");
t[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return t[var5];
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
throw new RuntimeException("su/catlean/uj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15067;
if (x[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = w[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])C.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
C.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/uj", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
x[var3] = var15;
}

return x[var3];
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
throw new RuntimeException("su/catlean/uj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
