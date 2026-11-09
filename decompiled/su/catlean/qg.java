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
import net.minecraft.class_1707;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qg extends _g {
@NotNull
public static final qg f;
static final KProperty[] F;
@NotNull
private static final cw n;
@NotNull
private static final cw y;
@NotNull
private static final cr G;
@NotNull
private static final c8 O;
@NotNull
private static final c8 g;
@NotNull
private static final c8 e;
@NotNull
private static final c8 o;
@NotNull
private static final cq b;
@NotNull
private static final cq t;
@NotNull
private static final cq Y;
@NotNull
private static final cq S;
@NotNull
private static final bg N;
@NotNull
private static final bg X;
@NotNull
private static final bg h;
private static int B;
private static int k;
private static final long a = yz.a(2071335294806830349L, 3805267430008194486L, MethodHandles.lookup().lookupClass()).a(252413335889516L);
private static final String[] c;
private static final String[] d;
private static final Map i = new HashMap(13);
private static final long[] j;
private static final Integer[] l;
private static final Map m;

private qg(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 40305898885883L;
super(b<"x">(29285, 3429619289919788405L ^ var1), jt.I(), null, 4, null, var3);
}

private final v T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 25703708667128L;
return (v)n.E(this, var3, F[0]);
}

private final ta K(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 86539244427302L;
return (ta)y.E(this, var6, F[1]);
}

private final nv W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 115954698085515L;
return (nv)G.E(this, var3, F[2]);
}

private final int h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 132162967536167L;
return ((Number)O.E(this, var3, F[3])).intValue();
}

private final int p(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 11841898087846L;
return ((Number)g.E(this, var6, F[4])).intValue();
}

private final int R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 61024322270091L;
return ((Number)e.E(this, var3, F[5])).intValue();
}

private final int l(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 76233777280167L;
return ((Number)o.E(this, var6, F[c<"a">(31259, 1414832235714437086L ^ var4)])).intValue();
}

private final boolean Q(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 20411719709702L;
return (Boolean)b.E(this, var6, F[c<"a">(26629, 3715231257856953699L ^ var4)]);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 136541027396330L;
return (Boolean)t.E(this, var3, F[c<"a">(13175, 9151894214768363765L ^ var1)]);
}

private final boolean F(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 26615368483135L;
return (Boolean)Y.E(this, var6, F[c<"a">(10704, 3709868427383568782L ^ var4)]);
}

private final boolean j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 126758124253777L;
return (Boolean)S.E(this, var3, F[c<"a">(7256, 2524103420016410494L ^ var1)]);
}

@Flow
private final void q(PostTasksProcessEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qg.a J
// 03: ldc2_w 58282767210913
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 113230335700892
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 108448480737629
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -153636739794128619
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 0
// 24: aload 8
// 26: ifnull 4f
// 29: lload 6
// 2b: invokespecial su/catlean/qg.T (J)Lsu/catlean/v;
// 2e: getstatic su/catlean/v.FAST Lsu/catlean/v;
// 31: if_acmpne 55
// 34: goto 41
// 37: ldc2_w -169235459861169074
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: aload 0
// 42: goto 4f
// 45: ldc2_w -169235459861169074
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: lload 4
// 51: bipush 0
// 52: invokespecial su/catlean/qg.w (JZ)V
// 55: return
}

@Flow
private final void Q(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qg.a J
// 003: ldc2_w 37055783660308
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 26204772537152
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 107544675779734
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 47200060664937
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 32
// 029: lushr
// 02a: lstore 9
// 02c: pop2
// 02d: dup2
// 02e: ldc2_w 125665485479209
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 20041034650945
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 88524181428837
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 77392023053494
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 129826566114280
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 133349500921391
// 054: lxor
// 055: dup2
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 21
// 05c: dup2
// 05d: bipush 16
// 05f: lshl
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 22
// 066: dup2
// 067: bipush 48
// 069: lshl
// 06a: bipush 48
// 06c: lushr
// 06d: l2i
// 06e: istore 23
// 070: pop2
// 071: dup2
// 072: ldc2_w 60957659143526
// 075: lxor
// 076: lstore 24
// 078: pop2
// 079: ldc2_w 5722729887994708896
// 07c: lload 2
// 07d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: astore 26
// 084: aload 0
// 085: aload 26
// 087: ifnull 1e2
// 08a: iload 21
// 08c: i2c
// 08d: iload 22
// 08f: iload 23
// 091: i2s
// 092: invokespecial su/catlean/qg.F (CIS)Z
// 095: ifeq 1e1
// 098: goto 0a5
// 09b: ldc2_w 5698132764933721851
// 09e: lload 2
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: lload 4
// 0a7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0aa: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0ad: ifnonnull 1e1
// 0b0: goto 0bd
// 0b3: ldc2_w 5698132764933721851
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: getstatic su/catlean/qg.N Lsu/catlean/bg;
// 0c0: sipush 2384
// 0c3: ldc2_w 1606122183469914680
// 0c6: lload 2
// 0c7: lxor
// 0c8: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: lload 17
// 0cf: invokevirtual su/catlean/bg.c (IJ)Z
// 0d2: ifeq 1e1
// 0d5: goto 0e2
// 0d8: ldc2_w 5698132764933721851
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 0e5: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 0e8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0ed: astore 27
// 0ef: aload 27
// 0f1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f6: ifeq 1e1
// 0f9: aload 27
// 0fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 100: checkcast net/minecraft/class_2586
// 103: astore 28
// 105: aload 28
// 107: instanceof net/minecraft/class_2611
// 10a: aload 26
// 10c: ifnull 129
// 10f: ifeq 0ef
// 112: lload 24
// 114: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 117: aload 28
// 119: checkcast net/minecraft/class_2611
// 11c: invokevirtual net/minecraft/class_2611.method_11016 ()Lnet/minecraft/class_2338;
// 11f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 122: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 125: ldc2_w 39.0
// 128: dcmpl
// 129: ifgt 0ef
// 12c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 12f: ldc2_w -0.4
// 132: ldc2_w 0.4
// 135: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 138: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 13b: invokevirtual su/catlean/jl.a (DDF)D
// 13e: dstore 29
// 140: aload 28
// 142: checkcast net/minecraft/class_2611
// 145: invokevirtual net/minecraft/class_2611.method_11016 ()Lnet/minecraft/class_2338;
// 148: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 14b: dload 29
// 14d: ldc2_w 0.375
// 150: dload 29
// 152: dneg
// 153: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 156: dup
// 157: sipush 14217
// 15a: ldc2_w 7424985387314863245
// 15d: lload 2
// 15e: lxor
// 15f: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 167: astore 31
// 169: aload 26
// 16b: ifnull 1de
// 16e: aload 0
// 16f: lload 13
// 171: invokespecial su/catlean/qg.j (J)Z
// 174: aload 26
// 176: ifnull 10a
// 179: goto 186
// 17c: ldc2_w 5698132764933721851
// 17f: lload 2
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: ifeq 1ab
// 189: lload 6
// 18b: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 18e: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 191: aload 31
// 193: lload 15
// 195: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 198: bipush 0
// 199: bipush 2
// 19a: aconst_null
// 19b: invokestatic su/catlean/_8.C (JLsu/catlean/_8;Lsu/catlean/_w;IILjava/lang/Object;)V
// 19e: goto 1ab
// 1a1: ldc2_w 5698132764933721851
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: iload 8
// 1ad: lload 9
// 1af: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 1b2: lload 24
// 1b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b7: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1ba: new net/minecraft/class_3965
// 1bd: dup
// 1be: aload 31
// 1c0: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 1c3: aload 28
// 1c5: checkcast net/minecraft/class_2611
// 1c8: invokevirtual net/minecraft/class_2611.method_11016 ()Lnet/minecraft/class_2338;
// 1cb: bipush 0
// 1cc: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 1cf: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 1d2: pop
// 1d3: lload 24
// 1d5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d8: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1db: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 1de: goto 1e1
// 1e1: aload 0
// 1e2: aload 26
// 1e4: ifnull 20d
// 1e7: lload 19
// 1e9: invokespecial su/catlean/qg.T (J)Lsu/catlean/v;
// 1ec: getstatic su/catlean/v.ON_TICK Lsu/catlean/v;
// 1ef: if_acmpne 213
// 1f2: goto 1ff
// 1f5: ldc2_w 5698132764933721851
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 0
// 200: goto 20d
// 203: ldc2_w 5698132764933721851
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: lload 11
// 20f: bipush 1
// 210: invokespecial su/catlean/qg.w (JZ)V
// 213: return
}

private final void w(long param1, boolean param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qg.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 85937822755700
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 46311763585826
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
// 030: ldc2_w 62095616212512
// 033: lxor
// 034: dup2
// 035: bipush 16
// 037: lushr
// 038: lstore 9
// 03a: dup2
// 03b: bipush 48
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: pop2
// 045: dup2
// 046: ldc2_w 67928530893536
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 75455496828366
// 050: lxor
// 051: lstore 14
// 053: dup2
// 054: ldc2_w 10169475465010
// 057: lxor
// 058: lstore 16
// 05a: dup2
// 05b: ldc2_w 48410330100033
// 05e: lxor
// 05f: lstore 18
// 061: dup2
// 062: ldc2_w 34765869128834
// 065: lxor
// 066: lstore 20
// 068: dup2
// 069: ldc2_w 110961039011758
// 06c: lxor
// 06d: dup2
// 06e: bipush 16
// 070: lushr
// 071: lstore 22
// 073: dup2
// 074: bipush 48
// 076: lshl
// 077: bipush 48
// 079: lushr
// 07a: l2i
// 07b: istore 24
// 07d: pop2
// 07e: dup2
// 07f: ldc2_w 121553963705682
// 082: lxor
// 083: lstore 25
// 085: dup2
// 086: ldc2_w 53442391094150
// 089: lxor
// 08a: lstore 27
// 08c: pop2
// 08d: ldc2_w 3990014992763255700
// 090: lload 1
// 091: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 099: bipush 1
// 09a: invokevirtual su/catlean/_n.m (Z)V
// 09d: astore 29
// 09f: lload 4
// 0a1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a4: aload 29
// 0a6: ifnull 0ce
// 0a9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0ac: ifnull 3dc
// 0af: goto 0bc
// 0b2: ldc2_w 3974299621654460111
// 0b5: lload 1
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: lload 4
// 0be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c1: goto 0ce
// 0c4: ldc2_w 3974299621654460111
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 0d1: ifnull 3dc
// 0d4: lload 25
// 0d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d9: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0dc: aload 29
// 0de: ifnull 127
// 0e1: goto 0ee
// 0e4: ldc2_w 3974299621654460111
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: instanceof net/minecraft/class_1707
// 0f1: ifeq 3dc
// 0f4: goto 101
// 0f7: ldc2_w 3974299621654460111
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: lload 25
// 103: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 106: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 109: dup
// 10a: sipush 6614
// 10d: ldc2_w 296272126495656688
// 110: lload 1
// 111: lxor
// 112: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 11a: goto 127
// 11d: ldc2_w 3974299621654460111
// 120: lload 1
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: checkcast net/minecraft/class_1707
// 12a: astore 30
// 12c: bipush 0
// 12d: aload 30
// 12f: invokevirtual net/minecraft/class_1707.method_7629 ()Lnet/minecraft/class_1263;
// 132: invokeinterface net/minecraft/class_1263.method_5439 ()I 1
// 137: invokestatic kotlin/ranges/RangesKt.until (II)Lkotlin/ranges/IntRange;
// 13a: astore 31
// 13c: aload 0
// 13d: iload 6
// 13f: iload 7
// 141: i2c
// 142: iload 8
// 144: i2s
// 145: invokespecial su/catlean/qg.Q (ICS)Z
// 148: ifeq 163
// 14b: aload 31
// 14d: checkcast java/lang/Iterable
// 150: invokestatic kotlin/collections/CollectionsKt.shuffled (Ljava/lang/Iterable;)Ljava/util/List;
// 153: checkcast java/lang/Iterable
// 156: goto 168
// 159: ldc2_w 3974299621654460111
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: aload 31
// 165: checkcast java/lang/Iterable
// 168: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 16d: astore 32
// 16f: aload 32
// 171: invokeinterface java/util/Iterator.hasNext ()Z 1
// 176: ifeq 32e
// 179: aload 32
// 17b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 180: checkcast java/lang/Number
// 183: invokevirtual java/lang/Number.intValue ()I
// 186: istore 33
// 188: aload 30
// 18a: iload 33
// 18c: invokevirtual net/minecraft/class_1707.method_7611 (I)Lnet/minecraft/class_1735;
// 18f: dup
// 190: sipush 25373
// 193: ldc2_w 6903549504524414995
// 196: lload 1
// 197: lxor
// 198: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a0: astore 34
// 1a2: lload 4
// 1a4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1a7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1aa: dup
// 1ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ae: invokevirtual net/minecraft/class_437.method_25440 ()Lnet/minecraft/class_2561;
// 1b1: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 1b6: dup
// 1b7: sipush 12623
// 1ba: ldc2_w 2262388654761648759
// 1bd: lload 1
// 1be: lxor
// 1bf: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c7: astore 35
// 1c9: aload 34
// 1cb: invokevirtual net/minecraft/class_1735.method_7681 ()Z
// 1ce: aload 29
// 1d0: lload 1
// 1d1: lconst_0
// 1d2: lcmp
// 1d3: ifle 341
// 1d6: ifnull 33f
// 1d9: aload 29
// 1db: lload 1
// 1dc: lconst_0
// 1dd: lcmp
// 1de: iflt 21f
// 1e1: ifnull 21d
// 1e4: goto 1f1
// 1e7: ldc2_w 3974299621654460111
// 1ea: lload 1
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: ifeq 16f
// 1f4: goto 201
// 1f7: ldc2_w 3974299621654460111
// 1fa: lload 1
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: aload 0
// 202: aload 34
// 204: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 207: dup
// 208: sipush 32260
// 20b: ldc2_w 8292509125571013921
// 20e: lload 1
// 20f: lxor
// 210: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 218: lload 18
// 21a: invokespecial su/catlean/qg.M (Lnet/minecraft/class_1799;J)Z
// 21d: aload 29
// 21f: ifnull 176
// 222: ifeq 16f
// 225: getstatic su/catlean/qg.X Lsu/catlean/bg;
// 228: iload 3
// 229: aload 29
// 22b: ifnull 241
// 22e: ifeq 244
// 231: goto 23e
// 234: ldc2_w 3974299621654460111
// 237: lload 1
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: getstatic su/catlean/qg.B I
// 241: goto 247
// 244: getstatic su/catlean/qg.k I
// 247: lload 16
// 249: invokevirtual su/catlean/bg.q (IJ)Z
// 24c: aload 29
// 24e: lload 1
// 24f: lconst_0
// 250: lcmp
// 251: iflt 284
// 254: ifnull 282
// 257: ifeq 16f
// 25a: goto 267
// 25d: ldc2_w 3974299621654460111
// 260: lload 1
// 261: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: athrow
// 267: aload 35
// 269: checkcast java/lang/CharSequence
// 26c: sipush 1520
// 26f: ldc2_w 7598812468914099928
// 272: lload 1
// 273: lxor
// 274: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: checkcast java/lang/CharSequence
// 27c: bipush 0
// 27d: bipush 2
// 27e: aconst_null
// 27f: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 282: aload 29
// 284: lload 1
// 285: lconst_0
// 286: lcmp
// 287: ifle 2ba
// 28a: ifnull 2b8
// 28d: ifne 16f
// 290: goto 29d
// 293: ldc2_w 3974299621654460111
// 296: lload 1
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: aload 35
// 29f: checkcast java/lang/CharSequence
// 2a2: sipush 22481
// 2a5: ldc2_w 1845459113761096949
// 2a8: lload 1
// 2a9: lxor
// 2aa: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: checkcast java/lang/CharSequence
// 2b2: bipush 0
// 2b3: bipush 2
// 2b4: aconst_null
// 2b5: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 2b8: aload 29
// 2ba: lload 1
// 2bb: lconst_0
// 2bc: lcmp
// 2bd: iflt 2f0
// 2c0: ifnull 2ee
// 2c3: ifne 16f
// 2c6: goto 2d3
// 2c9: ldc2_w 3974299621654460111
// 2cc: lload 1
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: aload 35
// 2d5: checkcast java/lang/CharSequence
// 2d8: sipush 8928
// 2db: ldc2_w 4541555496789520861
// 2de: lload 1
// 2df: lxor
// 2e0: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: checkcast java/lang/CharSequence
// 2e8: bipush 0
// 2e9: bipush 2
// 2ea: aconst_null
// 2eb: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 2ee: aload 29
// 2f0: ifnull 305
// 2f3: ifne 16f
// 2f6: goto 303
// 2f9: ldc2_w 3974299621654460111
// 2fc: lload 1
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: iload 33
// 305: lload 12
// 307: bipush 0
// 308: getstatic net/minecraft/class_1713.field_7794 Lnet/minecraft/class_1713;
// 30b: bipush 0
// 30c: sipush 7856
// 30f: ldc2_w 8145158235586246140
// 312: lload 1
// 313: lxor
// 314: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: aconst_null
// 31a: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 31d: getstatic su/catlean/qg.N Lsu/catlean/bg;
// 320: invokevirtual su/catlean/bg.l ()V
// 323: aload 0
// 324: lload 27
// 326: invokespecial su/catlean/qg.z (J)V
// 329: aload 29
// 32b: ifnonnull 16f
// 32e: aload 0
// 32f: lload 1
// 330: lconst_0
// 331: lcmp
// 332: ifle 180
// 335: aload 30
// 337: lload 9
// 339: iload 11
// 33b: i2c
// 33c: invokespecial su/catlean/qg.P (Lnet/minecraft/class_1707;JC)Z
// 33f: aload 29
// 341: lload 1
// 342: lconst_0
// 343: lcmp
// 344: iflt 375
// 347: ifnull 36d
// 34a: ifeq 3ef
// 34d: goto 35a
// 350: ldc2_w 3974299621654460111
// 353: lload 1
// 354: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 359: athrow
// 35a: aload 0
// 35b: lload 14
// 35d: invokespecial su/catlean/qg.Y (J)Z
// 360: goto 36d
// 363: ldc2_w 3974299621654460111
// 366: lload 1
// 367: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: athrow
// 36d: lload 1
// 36e: lconst_0
// 36f: lcmp
// 370: iflt 3b9
// 373: aload 29
// 375: ifnull 3b9
// 378: ifeq 3ef
// 37b: goto 388
// 37e: ldc2_w 3974299621654460111
// 381: lload 1
// 382: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: athrow
// 388: getstatic su/catlean/qg.h Lsu/catlean/bg;
// 38b: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 38e: aconst_null
// 38f: lload 22
// 391: bipush 1
// 392: iload 24
// 394: i2c
// 395: aconst_null
// 396: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 399: sipush 19140
// 39c: ldc2_w 329974427729256862
// 39f: lload 1
// 3a0: lxor
// 3a1: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: iadd
// 3a7: lload 20
// 3a9: invokevirtual su/catlean/bg.c (IJ)Z
// 3ac: goto 3b9
// 3af: ldc2_w 3974299621654460111
// 3b2: lload 1
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: ifeq 3ef
// 3bc: lload 25
// 3be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c1: invokevirtual net/minecraft/class_746.method_7346 ()V
// 3c4: lload 1
// 3c5: lconst_0
// 3c6: lcmp
// 3c7: ifle 3f6
// 3ca: aload 29
// 3cc: ifnonnull 3ef
// 3cf: goto 3dc
// 3d2: ldc2_w 3974299621654460111
// 3d5: lload 1
// 3d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: athrow
// 3dc: getstatic su/catlean/qg.h Lsu/catlean/bg;
// 3df: invokevirtual su/catlean/bg.l ()V
// 3e2: goto 3ef
// 3e5: ldc2_w 3974299621654460111
// 3e8: lload 1
// 3e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ee: athrow
// 3ef: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 3f2: bipush 0
// 3f3: invokevirtual su/catlean/_n.m (Z)V
// 3f6: return
}

private final void z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100679682083736L;
int var5 = (int)((var1 ^ 45526354840601L) >>> 32);
long var6 = (var1 ^ 45526354840601L) << 32 >>> 32;
long var8 = var1 ^ 64083399031397L;
long var10 = var1 ^ 22138729364020L;
int var12 = (int)((var1 ^ 113212269968664L) >>> 48);
long var13 = (var1 ^ 113212269968664L) << 16 >>> 16;
k = mf.f(new IntRange(this.h(var3), this.p(var5, var6)), false, var8, 2, null);
B = mf.f(new IntRange(this.R(var10), this.l((short)var12, var13)), false, var8, 2, null);
}

private final boolean M(class_1799 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 94881845964787
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 124838941545310
// 12: lxor
// 13: dup2
// 14: bipush 16
// 16: lushr
// 17: lstore 6
// 19: dup2
// 1a: bipush 48
// 1c: lshl
// 1d: bipush 48
// 1f: lushr
// 20: l2i
// 21: istore 8
// 23: pop2
// 24: pop2
// 25: ldc2_w 7134659273551228872
// 28: lload 2
// 29: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: astore 9
// 30: aload 0
// 31: lload 6
// 33: iload 8
// 35: i2c
// 36: invokespecial su/catlean/qg.K (JC)Lsu/catlean/ta;
// 39: getstatic su/catlean/ml.L [I
// 3c: swap
// 3d: invokevirtual su/catlean/ta.ordinal ()I
// 40: iaload
// 41: aload 9
// 43: ifnull 9b
// 46: tableswitch 67 1 2 32 46
// 5c: ldc2_w 7168476901105443475
// 5f: lload 2
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: bipush 1
// 67: goto b5
// 6a: ldc2_w 7168476901105443475
// 6d: lload 2
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: aload 0
// 75: lload 4
// 77: invokespecial su/catlean/qg.W (J)Lsu/catlean/nv;
// 7a: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 7d: aload 1
// 7e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 81: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 86: goto b5
// 89: aload 0
// 8a: lload 4
// 8c: invokespecial su/catlean/qg.W (J)Lsu/catlean/nv;
// 8f: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 92: aload 1
// 93: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 96: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 9b: aload 9
// 9d: ifnull b1
// a0: ifne b4
// a3: goto b0
// a6: ldc2_w 7168476901105443475
// a9: lload 2
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: bipush 1
// b1: goto b5
// b4: bipush 0
// b5: ireturn
}

private final boolean P(class_1707 param1, long param2, char param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: bipush 16
// 03: lshl
// 04: iload 4
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 48
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/qg.a J
// 11: lxor
// 12: lstore 5
// 14: ldc2_w 7809930805174968489
// 17: lload 5
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: bipush 0
// 1f: istore 8
// 21: astore 7
// 23: aload 1
// 24: invokevirtual net/minecraft/class_1707.method_7629 ()Lnet/minecraft/class_1263;
// 27: invokeinterface net/minecraft/class_1263.method_5439 ()I 1
// 2c: aload 7
// 2e: ifnull 6c
// 31: sipush 29061
// 34: ldc2_w 3496372007836910071
// 37: lload 5
// 39: lxor
// 3a: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: if_icmpne 6f
// 42: goto 50
// 45: ldc2_w 7789714136591085042
// 48: lload 5
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: sipush 19734
// 53: ldc2_w 8834213483138596193
// 56: lload 5
// 58: lxor
// 59: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: goto 6c
// 61: ldc2_w 7789714136591085042
// 64: lload 5
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: goto 7d
// 6f: sipush 13083
// 72: ldc2_w 7183215977996567413
// 75: lload 5
// 77: lxor
// 78: invokedynamic a (IJ)I bsm=su/catlean/qg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: istore 9
// 7f: iload 8
// 81: iload 9
// 83: if_icmpge c7
// 86: aload 1
// 87: iload 8
// 89: invokevirtual net/minecraft/class_1707.method_7611 (I)Lnet/minecraft/class_1735;
// 8c: invokevirtual net/minecraft/class_1735.method_7681 ()Z
// 8f: aload 7
// 91: iload 4
// 93: iflt 9b
// 96: ifnull ce
// 99: aload 7
// 9b: ifnull be
// 9e: goto ac
// a1: ldc2_w 7789714136591085042
// a4: lload 5
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: ifeq bf
// af: goto bd
// b2: ldc2_w 7789714136591085042
// b5: lload 5
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: bipush 0
// be: ireturn
// bf: iinc 8 1
// c2: aload 7
// c4: ifnonnull 7f
// c7: lload 2
// c8: lconst_0
// c9: lcmp
// ca: iflt 86
// cd: bipush 1
// ce: ireturn
}

private static final boolean V() {
long var0 = a ^ 92786512253162L;
long var2 = (var0 ^ 99058204263624L) >>> 16;
int var4 = (int)((var0 ^ 99058204263624L) << 48 >>> 48);

try {
if (f.K(var2, (char)var4) != ta.NONE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 8425566809828865285L, var0);
}

return false;
}

private static final boolean Z() {
long var0 = a ^ 130762375546541L;
long var2 = var0 ^ 36616181163601L;

try {
if (f.T(var2) == su.catlean.v.FAST) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -2113733238575848638L, var0);
}

return false;
}

private static final boolean e() {
long var0 = a ^ 53459209979151L;
long var2 = var0 ^ 113519537284595L;

try {
if (f.T(var2) == su.catlean.v.FAST) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -6843003433708330784L, var0);
}

return false;
}

private static final boolean t() {
long var0 = a ^ 105980065130501L;
long var2 = var0 ^ 61311910922489L;

try {
if (f.T(var2) == su.catlean.v.ON_TICK) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -8357954820152013334L, var0);
}

return false;
}

private static final boolean M() {
long var0 = a ^ 140591250801729L;
long var2 = var0 ^ 44520844125373L;

try {
if (f.T(var2) == su.catlean.v.ON_TICK) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 2325700056128283054L, var0);
}

return false;
}

private static final boolean n() {
long var0 = a ^ 15154213190072L;
long var10001 = var0 ^ 93717193962627L;
int var2 = (int)((var0 ^ 93717193962627L) >>> 48);
int var3 = (int)((var0 ^ 93717193962627L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return f.F((char)var2, var3, (short)var4);
}

static {
long var20 = a ^ 120356432177155L;
long var22 = var20 ^ 115361439263265L;
long var24 = var20 ^ 41218346762261L;
long var26 = var20 ^ 129689321899187L;
long var28 = var20 ^ 91809484572330L;
long var30 = var20 ^ 136509640379340L;
long var32 = var20 ^ 67457261941112L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[42];
int var16 = 0;
String var15 = "å\u0081)ö\\º&\u001bÀ\tý\u0091ho]X´\u008a=\u009dªÜ.[<e\u0012\u008a\u0080ÄJH8Bá \\a\n¹\u0001\u001b£MywØ\u009663qQQ*i\u0016Ë\b\u009a{ñ¹^SÜnCæ\u0084¡Øo\u0082ðºÈG{¤¹\u0003\u001fY®æ\u000bbÎÓ\u0010ë\u0013ÛpÒSÑkÄ}^,Á<\u001a\u00ad\u0018\u001b\b6ZË\u0097µÞ¤\u008a»\u0090B\n=\u00adÅ¦EÕöt\u0087Å\u0010x\u008e±\u0088Lm<#¥ñ-N]UW\u001e00 \u009f\\Ô/÷\u00123»©sK-\u0084\u0013\u008bÏ\u0083~,ò\u008fô#\u0086Üg½mIP7\u007fÉm\u0016,.w$\u0092p\u0007á\u007f\u0093é0þÊ\u0096¨bJ¨\u0010\u000b2\u009e¦ª¥\u0014¢\në:\u0007\u0019RPÄ\f\u0011¶jj+ÓS\u0087L×]¯H\u009f0uêqX\u0010gÄÜ I\u000eâÑ\"±y´Ó\u0000\u0005ô\u001axÐ¸!äSA\u008fÐ\u009b\u000f5¤º?û»/\u008a\u0018J4Ô\u0088\rf\u001e\fPüv¼\u00073\u009b\u008fá\u0001\u0019÷m¤Ë\u009e ýÐìk\u007f\u0002\u007fac²\u0004³~bÛ[\u009aMI\u0085!ê$å\u008a\f\\\u001f/\u0003\u0002<\u0010×ê\u000bx\u008c\u0084qÃÞ\u0087\u001eh¥å\u000fÌ ¿&Zñ\u0099Éº¬#Ãh2P\u0007ÕO\u0097îE¾\u009d\u0007g\u0089{d¤t\u008cåáå Qtð\u0098!\u001aåA@YÍ7øÈ\u0093Õ~Ä\u00adpsÌ¡\u0096\u008b5ä¦*\u000bOs ¹§óW8ò¿Z\bº\u0088Ü7Q¾¹¼êÜ³/¡OÎ\u009c3\u000fâ\u0014?\u000bixpìjé\u0080Hõ.üê6C\tMù×C\bü\u0006\u0013\u0081\u000e0\u009bí`2ÇZÄ³\u0016\u00876ö=)ÕÐ\u009d\u008d± \u0003ø\u009bß\u0016®T\u008a\u008fÌ\u0002q\u0017\u009b\u001aÿ\u008b(é»)T;\u0082ëG{\u0099Ù3×dinO\u0013[ý \u0084\u0084R\u001e¤\u000f\u0010\u0001,Ðq4çU#æ\u008c\fT>\u0006e$\u0093W\u001c<$KØl@s/T2T(B\u0093,ªöQÈ5Öüú×|sb¿\u008eÀÄGC.¹§Åä!â\u0082¸\u0080¡){Ó\u0006>\u0007¨¸ iVÃé]þ2éS\u009f\u008d¡¢R|«\u0007$»\u0091¿\u0016Jñ\u008d\u008b*\u009aB´\u0088¼ PVñElm\"?nnuxy\u0089øIÎÅ.\u001fÁÜ\u0090\u0097b}\u0084+1\u0015?a\u0010\u009b\u008f\u0006|#´â\nó£ëKÞJ§Õ\u0010Ê\t\u0081v\u000eÍ\u0004Ì\u008aØ\u0006\u0084%\u0088\u0015^\u0010£X0uKq·\u0010_£'\u0000öBMR\u0018\u008e\u0081+o\u0002\f!Îïö\u0088\u0096ö:ü+°¾\u0092±\u0012¼¥X0Z½xÁ·ÿ¼·\rõ\u007f¡@Uì\u0082å\u000f\u009dYm\ryt\f\u001eÉ\u0017\u0010«Ð\u008c\u001acÅßÕï\u0096k\u008cq\u0006\"§\u0090\u0011ÿ õÙ9\u008aÔ\u0007¸³Ø\u0095à¦#]]Á\u008f\u0087E_\f¤\u001c\f)ì«\u0013\u0091dW\u0003 \u009førËC\u0001\u0007Í\u0090\u0000[cc\u0013´\u001f7±,eÈ\u008b5¨WÎ4O\u0010(\u0099\u0088\u0010Ñ&\u001c\u0013/àI\u0017\u0002ðÑÖò¨´m\u0018%øqü\u0090)¬Zô\u0003\u0003Óu\u0086¿Ifñ\u0011\u0004\u001aV.'\u0010W\u0080à\u007f\u0015;\u0094\u001eüõÍz\u0083wÆ\u0094\u0018\u0088|õÄ?\u008293û*\u0015¨\u0093Ê\u008eä\u008d\u009e\fÙ¤\u0019ÚZ\u0010N²-g.ýZîuùPÃî(iê !\u0012+\u0006iA\u0080îü¨\u008b`/k(ô=N!ýhb4\u009d\u0015Ï¯åi\u0089úÍ0¤ÜózÑ/öi\u00105Èû©°¬Rvb_\u001b~\u0097ø\u009aB(g±\u009adi$»G\u0083tY¯ÕµÓÚýP&å\u0000%(ÿîÂ\u009eêj§»'\u0097¥FÎ]\u0080&Zf£_µøÆÔù;_LÚe\u0005áL\t\u008aÜD¬#\u0084 ¥}8ÃÄJÇ%íY\u0090KqBw\u0097ÛÃtémh]ÒÀÀ+ZHØJ (+üS,S\u008e8\u0010%~\u001e¹IÔ\u0013óûÀ\u0094\t\u0013ý\u0088\u0080A\u0018\u008fù´Ý\u00121\u00115VÖ \u0087ð[ :t¤of\u0094\u008bÛf]:d\u0019Üí\u008aÆ\u00840â\u000f×\u0000Çj±2\u0014\u0014o\u0082¦\u0018&»\u0014£\u0019à\u0003U¼ìB\u0014\u0088=½îw5K\u0014¶ \u001c\u0081 \u0088ag\u0080Ï äÇ9\u0084¹h\u0015\u001f}zxÞÚ\u0095p<Ê¿\u001dÜ\u00896ÝÂ½\u009b\u0018É*û7\t%]¯\u0010;Éwòåé«åüf\u00ad$\u0086ØI\u0018þ#·J.Ç\u0083ß¨Ó ¢ò\u0014\u0001\u0011gÝj¤ü¾d\u009a";
int var17 = "å\u0081)ö\\º&\u001bÀ\tý\u0091ho]X´\u008a=\u009dªÜ.[<e\u0012\u008a\u0080ÄJH8Bá \\a\n¹\u0001\u001b£MywØ\u009663qQQ*i\u0016Ë\b\u009a{ñ¹^SÜnCæ\u0084¡Øo\u0082ðºÈG{¤¹\u0003\u001fY®æ\u000bbÎÓ\u0010ë\u0013ÛpÒSÑkÄ}^,Á<\u001a\u00ad\u0018\u001b\b6ZË\u0097µÞ¤\u008a»\u0090B\n=\u00adÅ¦EÕöt\u0087Å\u0010x\u008e±\u0088Lm<#¥ñ-N]UW\u001e00 \u009f\\Ô/÷\u00123»©sK-\u0084\u0013\u008bÏ\u0083~,ò\u008fô#\u0086Üg½mIP7\u007fÉm\u0016,.w$\u0092p\u0007á\u007f\u0093é0þÊ\u0096¨bJ¨\u0010\u000b2\u009e¦ª¥\u0014¢\në:\u0007\u0019RPÄ\f\u0011¶jj+ÓS\u0087L×]¯H\u009f0uêqX\u0010gÄÜ I\u000eâÑ\"±y´Ó\u0000\u0005ô\u001axÐ¸!äSA\u008fÐ\u009b\u000f5¤º?û»/\u008a\u0018J4Ô\u0088\rf\u001e\fPüv¼\u00073\u009b\u008fá\u0001\u0019÷m¤Ë\u009e ýÐìk\u007f\u0002\u007fac²\u0004³~bÛ[\u009aMI\u0085!ê$å\u008a\f\\\u001f/\u0003\u0002<\u0010×ê\u000bx\u008c\u0084qÃÞ\u0087\u001eh¥å\u000fÌ ¿&Zñ\u0099Éº¬#Ãh2P\u0007ÕO\u0097îE¾\u009d\u0007g\u0089{d¤t\u008cåáå Qtð\u0098!\u001aåA@YÍ7øÈ\u0093Õ~Ä\u00adpsÌ¡\u0096\u008b5ä¦*\u000bOs ¹§óW8ò¿Z\bº\u0088Ü7Q¾¹¼êÜ³/¡OÎ\u009c3\u000fâ\u0014?\u000bixpìjé\u0080Hõ.üê6C\tMù×C\bü\u0006\u0013\u0081\u000e0\u009bí`2ÇZÄ³\u0016\u00876ö=)ÕÐ\u009d\u008d± \u0003ø\u009bß\u0016®T\u008a\u008fÌ\u0002q\u0017\u009b\u001aÿ\u008b(é»)T;\u0082ëG{\u0099Ù3×dinO\u0013[ý \u0084\u0084R\u001e¤\u000f\u0010\u0001,Ðq4çU#æ\u008c\fT>\u0006e$\u0093W\u001c<$KØl@s/T2T(B\u0093,ªöQÈ5Öüú×|sb¿\u008eÀÄGC.¹§Åä!â\u0082¸\u0080¡){Ó\u0006>\u0007¨¸ iVÃé]þ2éS\u009f\u008d¡¢R|«\u0007$»\u0091¿\u0016Jñ\u008d\u008b*\u009aB´\u0088¼ PVñElm\"?nnuxy\u0089øIÎÅ.\u001fÁÜ\u0090\u0097b}\u0084+1\u0015?a\u0010\u009b\u008f\u0006|#´â\nó£ëKÞJ§Õ\u0010Ê\t\u0081v\u000eÍ\u0004Ì\u008aØ\u0006\u0084%\u0088\u0015^\u0010£X0uKq·\u0010_£'\u0000öBMR\u0018\u008e\u0081+o\u0002\f!Îïö\u0088\u0096ö:ü+°¾\u0092±\u0012¼¥X0Z½xÁ·ÿ¼·\rõ\u007f¡@Uì\u0082å\u000f\u009dYm\ryt\f\u001eÉ\u0017\u0010«Ð\u008c\u001acÅßÕï\u0096k\u008cq\u0006\"§\u0090\u0011ÿ õÙ9\u008aÔ\u0007¸³Ø\u0095à¦#]]Á\u008f\u0087E_\f¤\u001c\f)ì«\u0013\u0091dW\u0003 \u009førËC\u0001\u0007Í\u0090\u0000[cc\u0013´\u001f7±,eÈ\u008b5¨WÎ4O\u0010(\u0099\u0088\u0010Ñ&\u001c\u0013/àI\u0017\u0002ðÑÖò¨´m\u0018%øqü\u0090)¬Zô\u0003\u0003Óu\u0086¿Ifñ\u0011\u0004\u001aV.'\u0010W\u0080à\u007f\u0015;\u0094\u001eüõÍz\u0083wÆ\u0094\u0018\u0088|õÄ?\u008293û*\u0015¨\u0093Ê\u008eä\u008d\u009e\fÙ¤\u0019ÚZ\u0010N²-g.ýZîuùPÃî(iê !\u0012+\u0006iA\u0080îü¨\u008b`/k(ô=N!ýhb4\u009d\u0015Ï¯åi\u0089úÍ0¤ÜózÑ/öi\u00105Èû©°¬Rvb_\u001b~\u0097ø\u009aB(g±\u009adi$»G\u0083tY¯ÕµÓÚýP&å\u0000%(ÿîÂ\u009eêj§»'\u0097¥FÎ]\u0080&Zf£_µøÆÔù;_LÚe\u0005áL\t\u008aÜD¬#\u0084 ¥}8ÃÄJÇ%íY\u0090KqBw\u0097ÛÃtémh]ÒÀÀ+ZHØJ (+üS,S\u008e8\u0010%~\u001e¹IÔ\u0013óûÀ\u0094\t\u0013ý\u0088\u0080A\u0018\u008fù´Ý\u00121\u00115VÖ \u0087ð[ :t¤of\u0094\u008bÛf]:d\u0019Üí\u008aÆ\u00840â\u000f×\u0000Çj±2\u0014\u0014o\u0082¦\u0018&»\u0014£\u0019à\u0003U¼ìB\u0014\u0088=½îw5K\u0014¶ \u001c\u0081 \u0088ag\u0080Ï äÇ9\u0084¹h\u0015\u001f}zxÞÚ\u0095p<Ê¿\u001dÜ\u00896ÝÂ½\u009b\u0018É*û7\t%]¯\u0010;Éwòåé«åüf\u00ad$\u0086ØI\u0018þ#·J.Ç\u0083ß¨Ó ¢ò\u0014\u0001\u0011gÝj¤ü¾d\u009a"
.length();
char var14 = ' ';
int var37 = -1;

label54:
while (true) {
String var38 = var15.substring(++var37, var37 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
String var49 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var49;
if ((var37 += var14) >= var17) {
c = var18;
d = new String[42];
m = new HashMap(13);
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
String var4 = "\u009aØâ¤z°\u008añHCuÊPO±d6\u0012å3ö(GÎ\u001f\nÍz[`ò?\u008eÊP\\t\u009dÓ\u001cÔ¿,±,F\u001eþ±\u009c\u0088ùc\u0003XU/>¸Op=\u00adû\\Íc\u000f §M¯@èeÙ\u0004£S$&ÊèI\u001f?èQ¹\u0091\u0003÷e\u008cF¡\u009egìü\u001bDé×\u001cÓ\u0094\u0000¨\u0004*LhiR*s/Ì\u008886Q\u009aÚ¯±ÁáX++ùu\u0081ùZ3äe¦¡\u0083U¾°Ö\u0098\u007f\u0013,\u008a\u0018\u008eú @,SíÊúQ\u008c_½C\u009cµc\u0092wZìrê";
int var5 = "\u009aØâ¤z°\u008añHCuÊPO±d6\u0012å3ö(GÎ\u001f\nÍz[`ò?\u008eÊP\\t\u009dÓ\u001cÔ¿,±,F\u001eþ±\u009c\u0088ùc\u0003XU/>¸Op=\u00adû\\Íc\u000f §M¯@èeÙ\u0004£S$&ÊèI\u001f?èQ¹\u0091\u0003÷e\u008cF¡\u009egìü\u001bDé×\u001cÓ\u0094\u0000¨\u0004*LhiR*s/Ì\u008886Q\u009aÚ¯±ÁáX++ùu\u0081ùZ3äe¦¡\u0083U¾°Ö\u0098\u007f\u0013,\u008a\u0018\u008eú @,SíÊúQ\u008c_½C\u009cµc\u0092wZìrê"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var41 = var6;
var10001 = var3++;
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
var41[var10001] = var58;
if (var2 >= var5) {
j = var6;
l = new Integer[24];
KProperty[] var34 = new KProperty[c<"a">(5724, 2723922952270497330L ^ var20)];
var34[0] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(11343, 7927933774195573830L ^ var20), b<"x">(11484, 6801201051936834769L ^ var20), 0)
);
var34[1] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(7808, 3907239587928667801L ^ var20), b<"x">(12429, 3612349139915528327L ^ var20), 0)
);
var34[2] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(27337, 9082447902490034911L ^ var20), b<"x">(29156, 7599911886515706352L ^ var20), 0)
);
var34[3] = Reflection.property1(new PropertyReference1Impl(qg.class, b<"x">(7484, 6718450196473738544L ^ var20), b<"x">(4672, 1187440486115211844L ^ var20), 0));
var34[4] = Reflection.property1(new PropertyReference1Impl(qg.class, b<"x">(4606, 290607337511156207L ^ var20), b<"x">(12796, 1042489855244130775L ^ var20), 0));
var34[5] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(30606, 5228032920392867739L ^ var20), b<"x">(25575, 8981537754079824873L ^ var20), 0)
);
var34[c<"a">(2956, 1840297053603159033L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(29149, 224641420563454455L ^ var20), b<"x">(24557, 2572411234096363460L ^ var20), 0)
);
var34[c<"a">(18930, 8705587070705637786L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(1258, 1798352873598610665L ^ var20), b<"x">(10252, 5833060637597745169L ^ var20), 0)
);
var34[c<"a">(7856, 8145181563148750559L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(25398, 8595540515464973102L ^ var20), b<"x">(10660, 7226688140536824228L ^ var20), 0)
);
var34[c<"a">(5305, 2054551900597404871L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(21309, 7442878091460098855L ^ var20), b<"x">(24337, 3752616094821726015L ^ var20), 0)
);
var34[c<"a">(24186, 8544468828269710864L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qg.class, b<"x">(13841, 4349804316201868830L ^ var20), b<"x">(24104, 2668530544940332576L ^ var20), 0)
);
F = var34;
f = new qg(var22);
n = yp.L(f, b<"x">(26429, 8918016317411200802L ^ var20), su.catlean.v.FAST, null, null, c<"a">(11226, 8815863240003025831L ^ var20), null, var32);
y = yp.L(f, b<"x">(1666, 5642317512811310736L ^ var20), ta.NONE, null, null, c<"a">(17308, 659821771902751727L ^ var20), null, var32);
G = yp.j(var24, f, b<"x">(645, 5305566183352265365L ^ var20), new nv(null, 1, var26, null), null, qg::V, 4, null);
O = yp.L(
f,
b<"x">(9038, 8012411826874370924L ^ var20),
c<"a">(20872, 2238875150362477055L ^ var20),
new IntRange(0, c<"a">(6488, 8480571710303193388L ^ var20)),
var28,
null,
qg::Z,
c<"a">(7856, 8145181563148750559L ^ var20),
null
);
g = yp.L(
f,
b<"x">(8506, 5674344317594323218L ^ var20),
c<"a">(23119, 9101584666319555108L ^ var20),
new IntRange(0, c<"a">(22465, 9101478766867253168L ^ var20)),
var28,
null,
qg::e,
c<"a">(7856, 8145181563148750559L ^ var20),
null
);
e = yp.L(
f,
b<"x">(13461, 8165459079022238906L ^ var20),
0,
new IntRange(0, c<"a">(9949, 8010077013283960491L ^ var20)),
var28,
null,
qg::t,
c<"a">(7856, 8145181563148750559L ^ var20),
null
);
o = yp.L(
f,
b<"x">(21112, 3606622334471879259L ^ var20),
1,
new IntRange(0, c<"a">(21187, 8623519182845117119L ^ var20)),
var28,
null,
qg::M,
c<"a">(7856, 8145181563148750559L ^ var20),
null
);
b = yp.t(f, b<"x">(10379, 1308128317427630231L ^ var20), false, var30, null, null, c<"a">(17308, 659821771902751727L ^ var20), null);
t = yp.t(f, b<"x">(16304, 1621062917525034919L ^ var20), false, var30, null, null, c<"a">(17308, 659821771902751727L ^ var20), null);
Y = yp.t(f, b<"x">(11470, 3239687678674552012L ^ var20), false, var30, null, null, c<"a">(17308, 659821771902751727L ^ var20), null);
S = yp.t(f, b<"x">(30549, 3179911769809395540L ^ var20), false, var30, null, qg::n, 4, null);
N = new bg();
X = new bg();
h = new bg();
return;
}
break;
default:
var41[var10001] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "Ñ\u00910¨\u0096&-Á¥\u0093\fZ3ÊÊ\u0007";
var5 = "Ñ\u00910¨\u0096&-Á¥\u0093\fZ3ÊÊ\u0007".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var41 = var6;
var10001 = var3++;
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

var14 = var15.charAt(var37);
break;
default:
var18[var16++] = var49;
if ((var37 += var14) < var17) {
var14 = var15.charAt(var37);
continue label54;
}

var15 = "¢J,ãN°_¶\\\u0087Dß80¹E¼ºLÙ\u0083\u0010>W\u0093Ã\u0081Bof·% \u0000\u0099|ØÁ,kë#æ/Czý\u009füL\u0012\u0085ãÖRÌ}\u0015\u00adðü\u009aàºü";
var17 = "¢J,ãN°_¶\\\u0087Dß80¹E¼ºLÙ\u0083\u0010>W\u0093Ã\u0081Bof·% \u0000\u0099|ØÁ,kë#æ/Czý\u009füL\u0012\u0085ãÖRÌ}\u0015\u00adðü\u009aàºü".length();
var14 = ' ';
var37 = -1;
}

var38 = var15.substring(++var37, var37 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9493;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qg", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/qg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7523;
if (l[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = j[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])m.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/qg", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
l[var3] = var15;
}

return l[var3];
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
throw new RuntimeException("su/catlean/qg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
