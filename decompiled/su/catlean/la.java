package su.catlean;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
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
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1282;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.gofra.Flow;

@ExcludeFlow
@ExcludeIndy
public final class la implements ym {
@NotNull
public static final la l;
public static final double S = -1.0E-7;
@NotNull
private static final Long2ByteOpenHashMap X;
@NotNull
private static final class_265 c;
@Nullable
private static class_1282 b;
private static boolean p;
private static final long a = yz.a(926659411245365366L, -4733013729815131179L, MethodHandles.lookup().lookupClass()).a(255625429357492L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private la() {
}

public final boolean k() {
return p;
}

public final void t(boolean <set-?>) {
p = <set-?>;
}

@Flow
private final void E(PostTasksProcessEvent var1) {
X.clear();
}

public final float K(
@NotNull class_243 explosionPos, @NotNull class_1657 target, int predictTicks, long a, boolean ignoreTerrain, @NotNull List ghost, boolean solid
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/la.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 33314986034618
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 9
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 16
// 01c: lushr
// 01d: lstore 10
// 01f: pop2
// 020: dup2
// 021: ldc2_w 82708488395348
// 024: lxor
// 025: lstore 12
// 027: dup2
// 028: ldc2_w 89720070527104
// 02b: lxor
// 02c: lstore 14
// 02e: dup2
// 02f: ldc2_w 51852622231465
// 032: lxor
// 033: lstore 16
// 035: pop2
// 036: aload 1
// 037: sipush 5989
// 03a: ldc2_w 239934253948933908
// 03d: lload 4
// 03f: lxor
// 040: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 048: aload 2
// 049: sipush 2028
// 04c: ldc2_w 5415753862913591186
// 04f: lload 4
// 051: lxor
// 052: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: aload 7
// 05c: sipush 30546
// 05f: ldc2_w 3559067682661627694
// 062: lload 4
// 064: lxor
// 065: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06d: iload 3
// 06e: ifle 089
// 071: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 074: lload 12
// 076: aload 2
// 077: iload 3
// 078: invokevirtual su/catlean/lo.F (JLnet/minecraft/class_1657;I)Lnet/minecraft/class_238;
// 07b: goto 09f
// 07e: ldc2_w 3872950505206576620
// 081: lload 4
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: aload 2
// 08a: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 08d: dup
// 08e: sipush 2079
// 091: ldc2_w 4241640625242048614
// 094: lload 4
// 096: lxor
// 097: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09f: astore 18
// 0a1: aload 18
// 0a3: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 0a6: dconst_0
// 0a7: aload 18
// 0a9: invokevirtual net/minecraft/class_238.method_17940 ()D
// 0ac: dneg
// 0ad: ldc2_w 2.0
// 0b0: ddiv
// 0b1: dconst_0
// 0b2: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0b5: aload 1
// 0b6: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 0b9: ldc2_w 12.0
// 0bc: ddiv
// 0bd: dstore 19
// 0bf: lload 14
// 0c1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c4: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
// 0c7: getstatic net/minecraft/class_1267.field_5801 Lnet/minecraft/class_1267;
// 0ca: if_acmpeq 0f7
// 0cd: dload 19
// 0cf: dconst_1
// 0d0: dcmpl
// 0d1: ifgt 0f7
// 0d4: goto 0e2
// 0d7: ldc2_w 3872950505206576620
// 0da: lload 4
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 2
// 0e3: invokevirtual net/minecraft/class_1657.method_68878 ()Z
// 0e6: ifeq 104
// 0e9: goto 0f7
// 0ec: ldc2_w 3872950505206576620
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: fconst_0
// 0f8: freturn
// 0f9: ldc2_w 3872950505206576620
// 0fc: lload 4
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 0
// 105: aload 2
// 106: lload 16
// 108: dload 19
// 10a: aload 0
// 10b: aload 1
// 10c: aload 18
// 10e: iload 6
// 110: iload 9
// 112: i2s
// 113: aload 7
// 115: iload 8
// 117: lload 10
// 119: invokespecial su/catlean/la.v (Lnet/minecraft/class_243;Lnet/minecraft/class_238;ZSLjava/util/List;ZJ)F
// 11c: f2d
// 11d: invokespecial su/catlean/la.O (Lnet/minecraft/class_1657;JDD)F
// 120: freturn
}

public static float K(la var0, class_243 var1, class_1657 var2, int var3, boolean var4, List var5, boolean var6, int var7, Object var8, long var9) {
var9 = a ^ var9;
long var11 = var9 ^ 4683220406917L;
long var13 = var9 ^ 135587242765179L;
if ((var7 & 2) != 0) {
var2 = (class_1657)zf.v(var13);
}

if ((var7 & 4) != 0) {
var3 = 0;
}

if ((var7 & b<"d">(18829, 5336849459537247351L ^ var9)) != 0) {
var4 = false;
}

if ((var7 & b<"d">(29550, 1008136825782486674L ^ var9)) != 0) {
var5 = CollectionsKt.emptyList();
}

if ((var7 & b<"d">(32321, 1396570908910668728L ^ var9)) != 0) {
var6 = false;
}

return var0.K(var1, var2, var3, var11, var4, var5, var6);
}

private final float O(class_1657 param1, long param2, double param4, double param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/la.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 99530970665395
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 90354700087536
// 012: lxor
// 013: lstore 10
// 015: dup2
// 016: ldc2_w 31555787034900
// 019: lxor
// 01a: lstore 12
// 01c: dup2
// 01d: ldc2_w 2583685116738
// 020: lxor
// 021: lstore 14
// 023: dup2
// 024: ldc2_w 88211546197591
// 027: lxor
// 028: lstore 16
// 02a: pop2
// 02b: getstatic su/catlean/la.b Lnet/minecraft/class_1282;
// 02e: ifnonnull 060
// 031: new net/minecraft/class_1282
// 034: dup
// 035: lload 10
// 037: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 03a: invokevirtual net/minecraft/class_638.method_48963 ()Lnet/minecraft/class_8109;
// 03d: getfield net/minecraft/class_8109.field_42296 Lnet/minecraft/class_2378;
// 040: getstatic net/minecraft/class_8111.field_42331 Lnet/minecraft/class_5321;
// 043: invokeinterface net/minecraft/class_2378.method_46747 (Lnet/minecraft/class_5321;)Lnet/minecraft/class_6880$class_6883; 2
// 048: checkcast net/minecraft/class_6880
// 04b: aconst_null
// 04c: aconst_null
// 04d: invokespecial net/minecraft/class_1282.<init> (Lnet/minecraft/class_6880;Lnet/minecraft/class_1297;Lnet/minecraft/class_1297;)V
// 050: putstatic su/catlean/la.b Lnet/minecraft/class_1282;
// 053: goto 060
// 056: ldc2_w -7075304263829529188
// 059: lload 2
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: aload 0
// 061: dload 4
// 063: dload 6
// 065: invokespecial su/catlean/la.t (DD)F
// 068: fstore 18
// 06a: lload 10
// 06c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 06f: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
// 072: getstatic net/minecraft/class_1267.field_5805 Lnet/minecraft/class_1267;
// 075: if_acmpne 08d
// 078: fload 18
// 07a: f2d
// 07b: ldc2_w 2.0
// 07e: ddiv
// 07f: dconst_1
// 080: dadd
// 081: fload 18
// 083: f2d
// 084: invokestatic java/lang/Math.min (DD)D
// 087: d2f
// 088: fstore 18
// 08a: goto 0a2
// 08d: lload 10
// 08f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 092: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
// 095: getstatic net/minecraft/class_1267.field_5807 Lnet/minecraft/class_1267;
// 098: if_acmpne 0a2
// 09b: fload 18
// 09d: ldc 1.5
// 09f: fmul
// 0a0: fstore 18
// 0a2: aload 1
// 0a3: checkcast net/minecraft/class_1309
// 0a6: fload 18
// 0a8: getstatic su/catlean/la.b Lnet/minecraft/class_1282;
// 0ab: dup
// 0ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0af: aload 1
// 0b0: invokevirtual net/minecraft/class_1657.method_6096 ()I
// 0b3: i2f
// 0b4: aload 1
// 0b5: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
// 0b8: invokevirtual net/minecraft/class_1657.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
// 0bb: dup
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bf: invokevirtual net/minecraft/class_1324.method_6194 ()D
// 0c2: d2f
// 0c3: invokestatic net/minecraft/class_1280.method_5496 (Lnet/minecraft/class_1309;FLnet/minecraft/class_1282;FF)F
// 0c6: fstore 18
// 0c8: aload 1
// 0c9: getstatic net/minecraft/class_1294.field_5907 Lnet/minecraft/class_6880;
// 0cc: invokevirtual net/minecraft/class_1657.method_6059 (Lnet/minecraft/class_6880;)Z
// 0cf: ifeq 105
// 0d2: sipush 15894
// 0d5: ldc2_w 7623254790655061701
// 0d8: lload 2
// 0d9: lxor
// 0da: invokedynamic d (IJ)I bsm=su/catlean/la.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: aload 1
// 0e0: getstatic net/minecraft/class_1294.field_5907 Lnet/minecraft/class_6880;
// 0e3: invokevirtual net/minecraft/class_1657.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 0e6: dup
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ea: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 0ed: bipush 1
// 0ee: iadd
// 0ef: bipush 5
// 0f0: imul
// 0f1: isub
// 0f2: istore 19
// 0f4: fload 18
// 0f6: iload 19
// 0f8: i2f
// 0f9: fmul
// 0fa: ldc 25.0
// 0fc: fdiv
// 0fd: f2d
// 0fe: dconst_0
// 0ff: invokestatic java/lang/Math.max (DD)D
// 102: d2f
// 103: fstore 18
// 105: fload 18
// 107: fconst_0
// 108: fcmpg
// 109: ifgt 112
// 10c: fconst_0
// 10d: fstore 18
// 10f: goto 172
// 112: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 115: lload 12
// 117: invokevirtual su/catlean/ux.h (J)Z
// 11a: ifeq 150
// 11d: aload 1
// 11e: lload 16
// 120: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 123: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 126: ifne 150
// 129: goto 136
// 12c: ldc2_w -7075304263829529188
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: aload 0
// 137: aload 1
// 138: lload 14
// 13a: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 13d: checkcast java/lang/Iterable
// 140: invokespecial su/catlean/la.o (Ljava/lang/Iterable;)F
// 143: goto 160
// 146: ldc2_w -7075304263829529188
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: aload 0
// 151: aload 1
// 152: lload 14
// 154: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 157: checkcast java/lang/Iterable
// 15a: lload 8
// 15c: invokespecial su/catlean/la.g (Ljava/lang/Iterable;J)I
// 15f: i2f
// 160: fstore 19
// 162: fload 19
// 164: fconst_0
// 165: fcmpl
// 166: ifle 172
// 169: fload 18
// 16b: fload 19
// 16d: invokestatic net/minecraft/class_1280.method_5497 (FF)F
// 170: fstore 18
// 172: fload 18
// 174: freturn
}

private final float o(Iterable var1) {
float var2 = 0.0F;
boolean var4 = false;

for (Object var6 : var1) {
class_1799 var7 = (class_1799)var6;
boolean var8 = false;
if (!var7.method_7960()) {
var2 += 8.0F;
}
}

return var2;
}

private final float t(double var1, double var3) {
double var5 = (1.0 - var1) * var3;
return (float)((var5 * var5 + var5) / 2.0 * 7.0 * 12.0 + 1.0);
}

private final float v(class_243 param1, class_238 param2, boolean param3, short param4, List param5, boolean param6, long param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 4
// 002: i2l
// 003: bipush 48
// 005: lshl
// 006: lload 7
// 008: bipush 16
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: getstatic su/catlean/la.a J
// 012: lxor
// 013: lstore 9
// 015: lload 9
// 017: dup2
// 018: ldc2_w 131277833575770
// 01b: lxor
// 01c: lstore 11
// 01e: dup2
// 01f: ldc2_w 67726027368239
// 022: lxor
// 023: lstore 13
// 025: pop2
// 026: aload 0
// 027: aload 1
// 028: aload 2
// 029: iload 3
// 02a: aload 5
// 02c: iload 6
// 02e: lload 13
// 030: invokespecial su/catlean/la.X (Lnet/minecraft/class_243;Lnet/minecraft/class_238;ZLjava/util/List;ZJ)Lkotlin/Pair;
// 033: astore 15
// 035: aload 15
// 037: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 03a: checkcast java/lang/Number
// 03d: invokevirtual java/lang/Number.intValue ()I
// 040: i2f
// 041: aload 15
// 043: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 046: checkcast java/lang/Number
// 049: invokevirtual java/lang/Number.intValue ()I
// 04c: i2f
// 04d: fdiv
// 04e: fconst_1
// 04f: fcmpg
// 050: ifne 062
// 053: bipush 1
// 054: goto 063
// 057: ldc2_w -1162974174425501809
// 05a: lload 9
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: bipush 0
// 063: ifeq 073
// 066: fconst_1
// 067: freturn
// 068: ldc2_w -1162974174425501809
// 06b: lload 9
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: aload 15
// 075: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 078: checkcast java/lang/Number
// 07b: invokevirtual java/lang/Number.intValue ()I
// 07e: i2f
// 07f: aload 15
// 081: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 084: checkcast java/lang/Number
// 087: invokevirtual java/lang/Number.intValue ()I
// 08a: i2f
// 08b: fdiv
// 08c: fconst_0
// 08d: fcmpg
// 08e: ifne 0a0
// 091: bipush 1
// 092: goto 0a1
// 095: ldc2_w -1162974174425501809
// 098: lload 9
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: bipush 0
// 0a1: ifeq 0b1
// 0a4: fconst_0
// 0a5: freturn
// 0a6: ldc2_w -1162974174425501809
// 0a9: lload 9
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: dconst_1
// 0b2: aload 2
// 0b3: getfield net/minecraft/class_238.field_1320 D
// 0b6: aload 2
// 0b7: getfield net/minecraft/class_238.field_1323 D
// 0ba: dsub
// 0bb: ldc2_w 2.0
// 0be: dmul
// 0bf: dconst_1
// 0c0: dadd
// 0c1: ddiv
// 0c2: dstore 16
// 0c4: dconst_1
// 0c5: aload 2
// 0c6: getfield net/minecraft/class_238.field_1325 D
// 0c9: aload 2
// 0ca: getfield net/minecraft/class_238.field_1322 D
// 0cd: dsub
// 0ce: ldc2_w 2.0
// 0d1: dmul
// 0d2: dconst_1
// 0d3: dadd
// 0d4: ddiv
// 0d5: dstore 18
// 0d7: dconst_1
// 0d8: aload 2
// 0d9: getfield net/minecraft/class_238.field_1324 D
// 0dc: aload 2
// 0dd: getfield net/minecraft/class_238.field_1321 D
// 0e0: dsub
// 0e1: ldc2_w 2.0
// 0e4: dmul
// 0e5: dconst_1
// 0e6: dadd
// 0e7: ddiv
// 0e8: dstore 20
// 0ea: dconst_1
// 0eb: dconst_1
// 0ec: dload 16
// 0ee: ddiv
// 0ef: invokestatic java/lang/Math.floor (D)D
// 0f2: dload 16
// 0f4: dmul
// 0f5: dsub
// 0f6: ldc2_w 2.0
// 0f9: ddiv
// 0fa: dstore 22
// 0fc: dconst_1
// 0fd: dconst_1
// 0fe: dload 20
// 100: ddiv
// 101: invokestatic java/lang/Math.floor (D)D
// 104: dload 20
// 106: dmul
// 107: dsub
// 108: ldc2_w 2.0
// 10b: ddiv
// 10c: dstore 24
// 10e: dload 16
// 110: dconst_0
// 111: dcmpl
// 112: iflt 21b
// 115: dload 18
// 117: dconst_0
// 118: dcmpl
// 119: iflt 21b
// 11c: goto 12a
// 11f: ldc2_w -1162974174425501809
// 122: lload 9
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: dload 20
// 12c: dconst_0
// 12d: dcmpl
// 12e: iflt 21b
// 131: goto 13f
// 134: ldc2_w -1162974174425501809
// 137: lload 9
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: aload 15
// 141: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 144: checkcast java/lang/Number
// 147: invokevirtual java/lang/Number.intValue ()I
// 14a: istore 26
// 14c: aload 15
// 14e: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 151: checkcast java/lang/Number
// 154: invokevirtual java/lang/Number.intValue ()I
// 157: istore 27
// 159: dconst_0
// 15a: dstore 28
// 15c: dload 28
// 15e: dconst_1
// 15f: dcmpg
// 160: ifgt 213
// 163: dconst_0
// 164: dstore 30
// 166: dload 30
// 168: dconst_1
// 169: dcmpg
// 16a: ifgt 209
// 16d: dconst_0
// 16e: dstore 32
// 170: dload 32
// 172: dconst_1
// 173: dcmpg
// 174: ifgt 1ff
// 177: dload 28
// 179: aload 2
// 17a: getfield net/minecraft/class_238.field_1323 D
// 17d: aload 2
// 17e: getfield net/minecraft/class_238.field_1320 D
// 181: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 184: dstore 34
// 186: dload 30
// 188: aload 2
// 189: getfield net/minecraft/class_238.field_1322 D
// 18c: aload 2
// 18d: getfield net/minecraft/class_238.field_1325 D
// 190: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 193: dstore 36
// 195: dload 32
// 197: aload 2
// 198: getfield net/minecraft/class_238.field_1321 D
// 19b: aload 2
// 19c: getfield net/minecraft/class_238.field_1324 D
// 19f: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 1a2: dstore 38
// 1a4: aload 0
// 1a5: dload 28
// 1a7: dload 30
// 1a9: dload 32
// 1ab: invokespecial su/catlean/la.t (DDD)Z
// 1ae: ifne 1f5
// 1b1: aload 0
// 1b2: new net/minecraft/class_243
// 1b5: dup
// 1b6: dload 34
// 1b8: dload 22
// 1ba: dadd
// 1bb: dload 36
// 1bd: dload 38
// 1bf: dload 24
// 1c1: dadd
// 1c2: invokespecial net/minecraft/class_243.<init> (DDD)V
// 1c5: aload 1
// 1c6: iload 3
// 1c7: lload 11
// 1c9: aload 5
// 1cb: iload 6
// 1cd: invokevirtual su/catlean/la.V (Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJLjava/util/List;Z)Lnet/minecraft/class_3965;
// 1d0: ifnonnull 1f2
// 1d3: goto 1e1
// 1d6: ldc2_w -1162974174425501809
// 1d9: lload 9
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: iinc 26 1
// 1e4: goto 1f2
// 1e7: ldc2_w -1162974174425501809
// 1ea: lload 9
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: iinc 27 1
// 1f5: dload 32
// 1f7: dload 20
// 1f9: dadd
// 1fa: dstore 32
// 1fc: goto 170
// 1ff: dload 30
// 201: dload 18
// 203: dadd
// 204: dstore 30
// 206: goto 166
// 209: dload 28
// 20b: dload 16
// 20d: dadd
// 20e: dstore 28
// 210: goto 15c
// 213: iload 26
// 215: i2f
// 216: iload 27
// 218: i2f
// 219: fdiv
// 21a: freturn
// 21b: fconst_0
// 21c: freturn
}

static float W(la var0, long var1, class_243 var3, class_238 var4, boolean var5, List var6, boolean var7, int var8, Object var9) {
var1 = a ^ var1;
int var10 = (int)((var1 ^ 56307701689264L) >>> 48);
long var11 = (var1 ^ 56307701689264L) << 16 >>> 16;
if ((var8 & b<"d">(18829, 5336846829678419745L ^ var1)) != 0) {
var6 = CollectionsKt.emptyList();
}

return var0.v(var3, var4, var5, (short)var10, var6, var7, var11);
}

private final boolean t(double param1, double param3, double param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: bipush 0
// 01: istore 7
// 03: iload 7
// 05: bipush 2
// 06: if_icmpge 85
// 09: bipush 0
// 0a: istore 8
// 0c: iload 8
// 0e: bipush 2
// 0f: if_icmpge 7f
// 12: bipush 0
// 13: istore 9
// 15: iload 9
// 17: bipush 2
// 18: if_icmpge 79
// 1b: dload 1
// 1c: iload 7
// 1e: i2d
// 1f: dcmpg
// 20: ifne 32
// 23: goto 2a
// 26: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 29: athrow
// 2a: bipush 1
// 2b: goto 33
// 2e: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 31: athrow
// 32: bipush 0
// 33: ifeq 73
// 36: dload 3
// 37: iload 8
// 39: i2d
// 3a: dcmpg
// 3b: ifne 4d
// 3e: goto 45
// 41: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 44: athrow
// 45: bipush 1
// 46: goto 4e
// 49: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 4c: athrow
// 4d: bipush 0
// 4e: ifeq 73
// 51: dload 5
// 53: iload 9
// 55: i2d
// 56: dcmpg
// 57: ifne 69
// 5a: goto 61
// 5d: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 60: athrow
// 61: bipush 1
// 62: goto 6a
// 65: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 68: athrow
// 69: bipush 0
// 6a: ifeq 73
// 6d: bipush 1
// 6e: ireturn
// 6f: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 72: athrow
// 73: iinc 9 1
// 76: goto 15
// 79: iinc 8 1
// 7c: goto 0c
// 7f: iinc 7 1
// 82: goto 03
// 85: bipush 0
// 86: ireturn
}

private final Pair X(class_243 var1, class_238 var2, boolean var3, List var4, boolean var5, long var6) {
var6 = a ^ var6;
long var8 = var6 ^ 112567123830188L;
double var10 = 1.0 / ((var2.field_1320 - var2.field_1323) * 2.0 + 1.0);
double var12 = 1.0 / ((var2.field_1324 - var2.field_1321) * 2.0 + 1.0);
double var14 = (1.0 - Math.floor(1.0 / var10) * var10) / 2.0;
double var16 = (1.0 - Math.floor(1.0 / var12) * var12) / 2.0;
int var18 = 0;
int var19 = 0;

for (double var20 = 0.0; var20 <= 1.0; var20++) {
for (double var22 = 0.0; var22 <= 1.0; var22++) {
for (double var24 = 0.0; var24 <= 1.0; var24++) {
double var26 = class_3532.method_16436(var20, var2.field_1323, var2.field_1320);
double var28 = class_3532.method_16436(var22, var2.field_1322, var2.field_1325);
double var30 = class_3532.method_16436(var24, var2.field_1321, var2.field_1324);
class_243 var32 = new class_243(var26 + var14, var28, var30 + var16);

try {
if (this.V(var32, var1, var3, var8, var4, var5) == null) {
var18++;
}
} catch (NumberFormatException var33) {
throw vm.a<"Å">(var33, 1669243519134652281L, var6);
}

var19++;
}
}
}

return new Pair<>(var18, var19);
}

static Pair Z(la var0, class_243 var1, class_238 var2, boolean var3, List var4, boolean var5, int var6, Object var7, long var8) {
var8 = a ^ var8;
long var10 = var8 ^ 91587216040731L;
if ((var6 & b<"d">(18829, 5336827769351106428L ^ var8)) != 0) {
var4 = CollectionsKt.emptyList();
}

return var0.X(var1, var2, var3, var4, var5, var10);
}

private final class_3965 i(class_2338 param1, class_243 param2, class_243 param3, boolean param4, long param5, List param7, boolean param8) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/la.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 8404201149282
// 00e: lxor
// 00f: lstore 9
// 011: pop2
// 012: aconst_null
// 013: astore 11
// 015: fconst_0
// 016: fstore 12
// 018: aload 7
// 01a: aload 1
// 01b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 020: ifeq 04f
// 023: iload 8
// 025: ifeq 04d
// 028: goto 036
// 02b: ldc2_w 9105484374232776206
// 02e: lload 5
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: invokestatic net/minecraft/class_259.method_1077 ()Lnet/minecraft/class_265;
// 039: aload 2
// 03a: aload 3
// 03b: aload 1
// 03c: invokevirtual net/minecraft/class_265.method_1092 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
// 03f: goto 04e
// 042: ldc2_w 9105484374232776206
// 045: lload 5
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: aconst_null
// 04e: areturn
// 04f: aload 1
// 050: invokevirtual net/minecraft/class_2338.method_10063 ()J
// 053: lstore 13
// 055: getstatic su/catlean/la.X Lit/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap;
// 058: lload 13
// 05a: invokevirtual it/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap.get (J)B
// 05d: istore 15
// 05f: getstatic su/catlean/la.p Z
// 062: ifeq 08b
// 065: iload 15
// 067: ifeq 08b
// 06a: goto 078
// 06d: ldc2_w 9105484374232776206
// 070: lload 5
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: aload 0
// 079: iload 15
// 07b: invokespecial su/catlean/la.f (B)Lnet/minecraft/class_265;
// 07e: astore 11
// 080: aload 0
// 081: iload 15
// 083: invokespecial su/catlean/la.p (B)F
// 086: fstore 12
// 088: goto 151
// 08b: lload 9
// 08d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 090: aload 1
// 091: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 094: dup
// 095: sipush 12502
// 098: ldc2_w 3175963500178701131
// 09b: lload 5
// 09d: lxor
// 09e: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a6: astore 16
// 0a8: aload 16
// 0aa: lload 9
// 0ac: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0af: checkcast net/minecraft/class_1922
// 0b2: aload 1
// 0b3: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 0b6: dup
// 0b7: sipush 278
// 0ba: ldc2_w 1512395470777338500
// 0bd: lload 5
// 0bf: lxor
// 0c0: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c8: astore 11
// 0ca: aload 16
// 0cc: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0cf: invokevirtual net/minecraft/class_2248.method_9520 ()F
// 0d2: fstore 12
// 0d4: aload 11
// 0d6: invokevirtual net/minecraft/class_265.method_1110 ()Z
// 0d9: ifne 111
// 0dc: aload 16
// 0de: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0e1: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e7: ifne 111
// 0ea: goto 0f8
// 0ed: ldc2_w 9105484374232776206
// 0f0: lload 5
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 11
// 0fa: invokestatic net/minecraft/class_259.method_1077 ()Lnet/minecraft/class_265;
// 0fd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 100: ifeq 151
// 103: goto 111
// 106: ldc2_w 9105484374232776206
// 109: lload 5
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: getstatic su/catlean/la.X Lit/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap;
// 114: checkcast java/util/Map
// 117: astore 17
// 119: lload 13
// 11b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 11e: astore 18
// 120: aload 0
// 121: aload 16
// 123: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 126: dup
// 127: sipush 28666
// 12a: ldc2_w 4014041404077679722
// 12d: lload 5
// 12f: lxor
// 130: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 138: aload 11
// 13a: invokevirtual net/minecraft/class_265.method_1110 ()Z
// 13d: invokespecial su/catlean/la.o (Lnet/minecraft/class_2248;Z)B
// 140: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
// 143: astore 19
// 145: aload 17
// 147: aload 18
// 149: aload 19
// 14b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 150: pop
// 151: fload 12
// 153: ldc 600.0
// 155: fcmpg
// 156: ifge 179
// 159: iload 4
// 15b: ifeq 179
// 15e: goto 16c
// 161: ldc2_w 9105484374232776206
// 164: lload 5
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: aconst_null
// 16d: areturn
// 16e: ldc2_w 9105484374232776206
// 171: lload 5
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: aload 11
// 17b: aload 2
// 17c: aload 3
// 17d: aload 1
// 17e: invokevirtual net/minecraft/class_265.method_1092 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
// 181: areturn
}

static class_3965 z(
la var0, class_2338 var1, class_243 var2, class_243 var3, boolean var4, int var5, char var6, List var7, boolean var8, int var9, Object var10, int var11
) {
long var12 = ((long)var5 << 32 | (long)var6 << 48 >>> 32 | (long)var11 << 48 >>> 48) ^ a;
long var14 = var12 ^ 65198642729189L;
if ((var9 & b<"d">(11171, 427636909415831516L ^ var12)) != 0) {
var4 = false;
}

if ((var9 & b<"d">(19989, 5352348119202919020L ^ var12)) != 0) {
var7 = CollectionsKt.emptyList();
}

if ((var9 & b<"d">(26154, 3416970707416930896L ^ var12)) != 0) {
var8 = true;
}

return var0.i(var1, var2, var3, var4, var14, var7, var8);
}

private final float p(byte param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: istore 2
// 02: iload 2
// 03: bipush 1
// 04: if_icmpeq 13
// 07: iload 2
// 08: bipush 2
// 09: if_icmpne 1b
// 0c: goto 13
// 0f: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 12: athrow
// 13: fconst_0
// 14: goto 1d
// 17: invokestatic su/catlean/la.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
// 1a: athrow
// 1b: ldc 600.0
// 1d: freturn
}

private final class_265 f(byte var1) {
byte var3 = var1;

class_265 var10000;
label31: {
try {
if (var3 == 1) {
var10000 = class_259.method_1073();
break label31;
}
} catch (NumberFormatException var5) {
throw a(var5);
}

try {
if (var3 == 4) {
var10000 = c;
break label31;
}
} catch (NumberFormatException var4) {
throw a(var4);
}

var10000 = class_259.method_1077();
}

class_265 var2 = var10000;
Intrinsics.checkNotNull(var2);
return var2;
}

private final byte o(class_2248 var1, boolean var2) {
try {
if (var2) {
return 1;
}
} catch (NumberFormatException var4) {
throw a(var4);
}

try {
if (Intrinsics.areEqual(var1, class_2246.field_10443)) {
return 4;
}
} catch (NumberFormatException var5) {
throw a(var5);
}

try {
return (byte)(var1.method_9520() >= 600.0F ? 3 : 2);
} catch (NumberFormatException var3) {
throw a(var3);
}
}

@Nullable
public final class_3965 V(@NotNull class_243 start, @NotNull class_243 end, boolean ignoreTerrain, long a, @NotNull List ghost, boolean solid) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/la.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 21476057713883
// 00e: lxor
// 00f: lstore 8
// 011: pop2
// 012: aload 1
// 013: sipush 18614
// 016: ldc2_w 7529823639005548581
// 019: lload 4
// 01b: lxor
// 01c: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 024: aload 2
// 025: sipush 21557
// 028: ldc2_w 8941175061824687279
// 02b: lload 4
// 02d: lxor
// 02e: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 036: aload 6
// 038: sipush 29068
// 03b: ldc2_w 3085672933978302747
// 03e: lload 4
// 040: lxor
// 041: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 049: aload 1
// 04a: aload 2
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 04e: ifeq 05e
// 051: aconst_null
// 052: areturn
// 053: ldc2_w -5954019430004790004
// 056: lload 4
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: ldc2_w -1.0E-7
// 061: aload 2
// 062: getfield net/minecraft/class_243.field_1352 D
// 065: aload 1
// 066: getfield net/minecraft/class_243.field_1352 D
// 069: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 06c: dstore 10
// 06e: ldc2_w -1.0E-7
// 071: aload 2
// 072: getfield net/minecraft/class_243.field_1351 D
// 075: aload 1
// 076: getfield net/minecraft/class_243.field_1351 D
// 079: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 07c: dstore 12
// 07e: ldc2_w -1.0E-7
// 081: aload 2
// 082: getfield net/minecraft/class_243.field_1350 D
// 085: aload 1
// 086: getfield net/minecraft/class_243.field_1350 D
// 089: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 08c: dstore 14
// 08e: ldc2_w -1.0E-7
// 091: aload 1
// 092: getfield net/minecraft/class_243.field_1352 D
// 095: aload 2
// 096: getfield net/minecraft/class_243.field_1352 D
// 099: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 09c: dstore 16
// 09e: ldc2_w -1.0E-7
// 0a1: aload 1
// 0a2: getfield net/minecraft/class_243.field_1351 D
// 0a5: aload 2
// 0a6: getfield net/minecraft/class_243.field_1351 D
// 0a9: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 0ac: dstore 18
// 0ae: ldc2_w -1.0E-7
// 0b1: aload 1
// 0b2: getfield net/minecraft/class_243.field_1350 D
// 0b5: aload 2
// 0b6: getfield net/minecraft/class_243.field_1350 D
// 0b9: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 0bc: dstore 20
// 0be: dload 16
// 0c0: invokestatic net/minecraft/class_3532.method_15357 (D)I
// 0c3: istore 22
// 0c5: dload 18
// 0c7: invokestatic net/minecraft/class_3532.method_15357 (D)I
// 0ca: istore 23
// 0cc: dload 20
// 0ce: invokestatic net/minecraft/class_3532.method_15357 (D)I
// 0d1: istore 24
// 0d3: new net/minecraft/class_2338$class_2339
// 0d6: dup
// 0d7: iload 22
// 0d9: iload 23
// 0db: iload 24
// 0dd: invokespecial net/minecraft/class_2338$class_2339.<init> (III)V
// 0e0: astore 25
// 0e2: aload 0
// 0e3: aload 25
// 0e5: checkcast net/minecraft/class_2338
// 0e8: aload 1
// 0e9: aload 2
// 0ea: iload 3
// 0eb: lload 8
// 0ed: aload 6
// 0ef: iload 7
// 0f1: invokespecial su/catlean/la.i (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJLjava/util/List;Z)Lnet/minecraft/class_3965;
// 0f4: astore 26
// 0f6: aload 26
// 0f8: ifnull 109
// 0fb: aload 26
// 0fd: areturn
// 0fe: ldc2_w -5954019430004790004
// 101: lload 4
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: dload 10
// 10b: dload 16
// 10d: dsub
// 10e: dstore 27
// 110: dload 12
// 112: dload 18
// 114: dsub
// 115: dstore 29
// 117: dload 14
// 119: dload 20
// 11b: dsub
// 11c: dstore 31
// 11e: dload 27
// 120: invokestatic net/minecraft/class_3532.method_17822 (D)I
// 123: istore 33
// 125: dload 29
// 127: invokestatic net/minecraft/class_3532.method_17822 (D)I
// 12a: istore 34
// 12c: dload 31
// 12e: invokestatic net/minecraft/class_3532.method_17822 (D)I
// 131: istore 35
// 133: iload 33
// 135: ifne 149
// 138: ldc2_w 1.7976931348623157E308
// 13b: goto 14f
// 13e: ldc2_w -5954019430004790004
// 141: lload 4
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: iload 33
// 14b: i2d
// 14c: dload 27
// 14e: ddiv
// 14f: dstore 36
// 151: iload 34
// 153: ifne 167
// 156: ldc2_w 1.7976931348623157E308
// 159: goto 16d
// 15c: ldc2_w -5954019430004790004
// 15f: lload 4
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: iload 34
// 169: i2d
// 16a: dload 29
// 16c: ddiv
// 16d: dstore 38
// 16f: iload 35
// 171: ifne 185
// 174: ldc2_w 1.7976931348623157E308
// 177: goto 18b
// 17a: ldc2_w -5954019430004790004
// 17d: lload 4
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: iload 35
// 187: i2d
// 188: dload 31
// 18a: ddiv
// 18b: dstore 40
// 18d: dload 36
// 18f: iload 33
// 191: ifle 1a9
// 194: dconst_1
// 195: dload 16
// 197: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 19a: dsub
// 19b: goto 1ae
// 19e: ldc2_w -5954019430004790004
// 1a1: lload 4
// 1a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: athrow
// 1a9: dload 16
// 1ab: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 1ae: dmul
// 1af: dstore 42
// 1b1: dload 38
// 1b3: iload 34
// 1b5: ifle 1cd
// 1b8: dconst_1
// 1b9: dload 18
// 1bb: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 1be: dsub
// 1bf: goto 1d2
// 1c2: ldc2_w -5954019430004790004
// 1c5: lload 4
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: dload 18
// 1cf: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 1d2: dmul
// 1d3: dstore 44
// 1d5: dload 40
// 1d7: iload 35
// 1d9: ifle 1f1
// 1dc: dconst_1
// 1dd: dload 20
// 1df: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 1e2: dsub
// 1e3: goto 1f6
// 1e6: ldc2_w -5954019430004790004
// 1e9: lload 4
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: dload 20
// 1f3: invokestatic net/minecraft/class_3532.method_15385 (D)D
// 1f6: dmul
// 1f7: dstore 46
// 1f9: dload 42
// 1fb: dconst_1
// 1fc: dcmpg
// 1fd: ifle 21c
// 200: dload 44
// 202: dconst_1
// 203: dcmpg
// 204: ifle 21c
// 207: dload 46
// 209: dconst_1
// 20a: dcmpg
// 20b: ifgt 2cf
// 20e: goto 21c
// 211: ldc2_w -5954019430004790004
// 214: lload 4
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: dload 42
// 21e: dload 44
// 220: dcmpg
// 221: ifge 26a
// 224: goto 232
// 227: ldc2_w -5954019430004790004
// 22a: lload 4
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: dload 42
// 234: dload 46
// 236: dcmpg
// 237: ifge 259
// 23a: goto 248
// 23d: ldc2_w -5954019430004790004
// 240: lload 4
// 242: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: athrow
// 248: iload 22
// 24a: iload 33
// 24c: iadd
// 24d: istore 22
// 24f: dload 42
// 251: dload 36
// 253: dadd
// 254: dstore 42
// 256: goto 291
// 259: iload 24
// 25b: iload 35
// 25d: iadd
// 25e: istore 24
// 260: dload 46
// 262: dload 40
// 264: dadd
// 265: dstore 46
// 267: goto 291
// 26a: dload 44
// 26c: dload 46
// 26e: dcmpg
// 26f: ifge 283
// 272: iload 23
// 274: iload 34
// 276: iadd
// 277: istore 23
// 279: dload 44
// 27b: dload 38
// 27d: dadd
// 27e: dstore 44
// 280: goto 291
// 283: iload 24
// 285: iload 35
// 287: iadd
// 288: istore 24
// 28a: dload 46
// 28c: dload 40
// 28e: dadd
// 28f: dstore 46
// 291: aload 0
// 292: aload 25
// 294: iload 22
// 296: iload 23
// 298: iload 24
// 29a: invokevirtual net/minecraft/class_2338$class_2339.method_10103 (III)Lnet/minecraft/class_2338$class_2339;
// 29d: dup
// 29e: sipush 14457
// 2a1: ldc2_w 8667571336084300013
// 2a4: lload 4
// 2a6: lxor
// 2a7: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2af: checkcast net/minecraft/class_2338
// 2b2: aload 1
// 2b3: aload 2
// 2b4: iload 3
// 2b5: lload 8
// 2b7: aload 6
// 2b9: iload 7
// 2bb: invokespecial su/catlean/la.i (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJLjava/util/List;Z)Lnet/minecraft/class_3965;
// 2be: astore 48
// 2c0: aload 48
// 2c2: ifnull 1f9
// 2c5: aload 48
// 2c7: astore 49
// 2c9: bipush 0
// 2ca: istore 50
// 2cc: aload 49
// 2ce: areturn
// 2cf: aconst_null
// 2d0: areturn
}

public static class_3965 R(la var0, class_243 var1, class_243 var2, boolean var3, List var4, boolean var5, int var6, Object var7, long var8) {
var8 = a ^ var8;
long var10 = var8 ^ 30796502964376L;
if ((var6 & 4) != 0) {
var3 = false;
}

if ((var6 & b<"d">(18829, 5336832799285882506L ^ var8)) != 0) {
var4 = CollectionsKt.emptyList();
}

if ((var6 & b<"d">(29550, 1008224069518365807L ^ var8)) != 0) {
var5 = true;
}

return var0.V(var1, var2, var3, var10, var4, var5);
}

public final boolean c(long a, @NotNull class_243 point) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/la.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 55873018217316
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 7326746923793
// 12: lxor
// 13: dup2
// 14: bipush 48
// 16: lushr
// 17: l2i
// 18: istore 6
// 1a: dup2
// 1b: bipush 16
// 1d: lshl
// 1e: bipush 32
// 20: lushr
// 21: l2i
// 22: istore 7
// 24: dup2
// 25: bipush 48
// 27: lshl
// 28: bipush 48
// 2a: lushr
// 2b: l2i
// 2c: istore 8
// 2e: pop2
// 2f: dup2
// 30: ldc2_w 22492885394747
// 33: lxor
// 34: lstore 9
// 36: pop2
// 37: aload 3
// 38: sipush 16053
// 3b: ldc2_w 1985568682279140831
// 3e: lload 1
// 3f: lxor
// 40: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 48: aload 0
// 49: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 4c: lload 9
// 4e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 51: iload 6
// 53: i2s
// 54: swap
// 55: iload 7
// 57: swap
// 58: iload 8
// 5a: i2c
// 5b: swap
// 5c: checkcast net/minecraft/class_1297
// 5f: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 62: aload 3
// 63: bipush 0
// 64: aconst_null
// 65: bipush 0
// 66: sipush 8798
// 69: ldc2_w 4349240180143446496
// 6c: lload 1
// 6d: lxor
// 6e: invokedynamic d (IJ)I bsm=su/catlean/la.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: aconst_null
// 74: lload 4
// 76: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 79: dup
// 7a: ifnull 91
// 7d: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 80: dup
// 81: ifnonnull a2
// 84: goto 91
// 87: ldc2_w 8548742545909462768
// 8a: lload 1
// 8b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: athrow
// 91: pop
// 92: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 95: goto a2
// 98: ldc2_w 8548742545909462768
// 9b: lload 1
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// a5: if_acmpne b6
// a8: bipush 1
// a9: goto b7
// ac: ldc2_w 8548742545909462768
// af: lload 1
// b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5: athrow
// b6: bipush 0
// b7: ireturn
}

private final int g(Iterable var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 42371490182690L;
int var6 = 0;
boolean var8 = false;

for (Object var10 : var1) {
class_1799 var11 = (class_1799)var10;
boolean var12 = false;
var6 += l.x(var4, var11);
}

return var6;
}

private final int x(long param1, class_1799 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/la.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 93919488457717
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: aload 3
// 10: ifnull 27
// 13: aload 3
// 14: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 17: ifeq 33
// 1a: goto 27
// 1d: ldc2_w -405882181062608371
// 20: lload 1
// 21: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: athrow
// 27: bipush 0
// 28: ireturn
// 29: ldc2_w -405882181062608371
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: lload 4
// 35: aload 3
// 36: getstatic net/minecraft/class_1893.field_9107 Lnet/minecraft/class_5321;
// 39: dup
// 3a: sipush 16173
// 3d: ldc2_w 1662301618130481337
// 40: lload 1
// 41: lxor
// 42: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4a: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 4d: istore 6
// 4f: lload 4
// 51: aload 3
// 52: getstatic net/minecraft/class_1893.field_9111 Lnet/minecraft/class_5321;
// 55: dup
// 56: sipush 27540
// 59: ldc2_w 3509820504185807886
// 5c: lload 1
// 5d: lxor
// 5e: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/la.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 66: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 69: istore 7
// 6b: iload 6
// 6d: bipush 2
// 6e: imul
// 6f: iload 7
// 71: iadd
// 72: ireturn
}

static {
long var20 = a ^ 8846302682020L;
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
String var15 = "\u007fÚ_×ÄS\u0098\u0097?¬Iî¡\u0011YÚ\u0010ÿÖú1\u009eC/é^V\u009c\r$5O\u0086(\u001by\u001f\u0085\u0088ðº7\u001d4SÇcû\u0084B\u0086Øl&%i\u0088\u008cëß\u009e§À|\u008e\u0086õjÑÓ(ñÚ\u0006\u0018 \u001f\u0088\u0097Z\u0081T+\f\u009f\u0083F\\7ÇPÍ,Þ5\u008c\u009cþE\u0010\u008a\u00996\u0000RmJ§·Ô×\u009f\fJmt \\\u001f¹\u0092\u0083\u009caO·Ïacå\u0016\u008dËuSC\u008cpê±\u009ak;ÝÒ!´\u0098®\u0018×¼\u0097¶Á4äbýÂ\u0084SË-÷\u0017¬YLC5õ\u0006¯(!p°Õ9Ùo¾\u0096\\Ø\u0095LÎ©Q\u0094ÈæÇ¤\u0095îÕ\u0017=5T~à\\\u0013¿\u001e&H5\u0019ÖO(Ü\u0084å7\u0087©ªv\u008aêGÔ\u0013v\u009c\\}\u001b@\u0099±Ý´MË\u0017\u000fìµ\u0013¡º\u008bü8RH\u0086\u0013É\u0010\u001927ñ?nþÿ\u0014\u0088öQ\u0000\u0089I\u0007\u0018 \"\u0013\u0089[xQ¡7KØêjxãGX\u008b)6S×\u0098\u0081\u00101Åú\u0089ª®\u0004\u0083\u0011j\"\u0017L\u0011jß Íµ:\u0097\u0019>ùã'¼\u00ad\u0003`US\u0088\fø\u0094\bðo³eÒF\u0080ÉC\u0019<\u0091";
int var17 = "\u007fÚ_×ÄS\u0098\u0097?¬Iî¡\u0011YÚ\u0010ÿÖú1\u009eC/é^V\u009c\r$5O\u0086(\u001by\u001f\u0085\u0088ðº7\u001d4SÇcû\u0084B\u0086Øl&%i\u0088\u008cëß\u009e§À|\u008e\u0086õjÑÓ(ñÚ\u0006\u0018 \u001f\u0088\u0097Z\u0081T+\f\u009f\u0083F\\7ÇPÍ,Þ5\u008c\u009cþE\u0010\u008a\u00996\u0000RmJ§·Ô×\u009f\fJmt \\\u001f¹\u0092\u0083\u009caO·Ïacå\u0016\u008dËuSC\u008cpê±\u009ak;ÝÒ!´\u0098®\u0018×¼\u0097¶Á4äbýÂ\u0084SË-÷\u0017¬YLC5õ\u0006¯(!p°Õ9Ùo¾\u0096\\Ø\u0095LÎ©Q\u0094ÈæÇ¤\u0095îÕ\u0017=5T~à\\\u0013¿\u001e&H5\u0019ÖO(Ü\u0084å7\u0087©ªv\u008aêGÔ\u0013v\u009c\\}\u001b@\u0099±Ý´MË\u0017\u000fìµ\u0013¡º\u008bü8RH\u0086\u0013É\u0010\u001927ñ?nþÿ\u0014\u0088öQ\u0000\u0089I\u0007\u0018 \"\u0013\u0089[xQ¡7KØêjxãGX\u008b)6S×\u0098\u0081\u00101Åú\u0089ª®\u0004\u0083\u0011j\"\u0017L\u0011jß Íµ:\u0097\u0019>ùã'¼\u00ad\u0003`US\u0088\fø\u0094\bðo³eÒF\u0080ÉC\u0019<\u0091"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var24 += var14) >= var17) {
d = var18;
e = new String[15];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "\u00ad\u0098¿*ö×Ö\\Ãr÷£VFBøÕì=ªI¯ÆÏö\u0017Á¹\u0000Q\u0000¸ü±V³s®Uþo\u008187k¶Âz";
int var5 = "\u00ad\u0098¿*ö×Ö\\Ãr÷£VFBøÕì=ªI¯ÆÏö\u0017Á¹\u0000Q\u0000¸ü±V³s®Uþo\u008187k¶Âz".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var28[var10001] = var46;
if (var2 >= var5) {
g = var6;
h = new Integer[8];
l = new la();
X = new Long2ByteOpenHashMap();
class_265 var29 = class_2248.method_66404(14.0, 0.0, 14.0);
Intrinsics.checkNotNullExpressionValue(var29, a<"o">(14230, 6256652480248628958L ^ var20));
c = var29;
p = true;
return;
}
break;
default:
var28[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "uádzöuËÊKj¡ã$\u0010\u0017b";
var5 = "uádzöuËÊKj¡ã$\u0010\u0017b".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var37;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "\f«?U$*\u0093\u0013Ì¯\u0084î·\u0017¦¼(Å¸Ù+\u0090^mÐ®\u009f1Kw9©Û\u0004\u0089\u0094*ç¯ê!Ñõ5\u008a®xDw\u0094lRJ\u0083áoã";
var17 = "\f«?U$*\u0093\u0013Ì¯\u0084î·\u0017¦¼(Å¸Ù+\u0090^mÐ®\u009f1Kw9©Û\u0004\u0089\u0094*ç¯ê!Ñõ5\u008a®xDw\u0094lRJ\u0083áoã".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13631;
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
throw new RuntimeException("su/catlean/la", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/la" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3561;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/la", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/la" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
