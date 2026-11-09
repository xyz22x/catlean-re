package su.catlean;

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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gp {
@NotNull
private final List k;
@NotNull
private final class_1657 I;
private final float Q;
private final float L;
private final float e;
private final float V;
private final boolean H;
private final float G;
private final float N;
private final boolean K;
private final float h;
private final boolean F;
@NotNull
private final sv p;
private final boolean D;
private final boolean R;
private final int E;
private final boolean o;
private final float i;
private final boolean s;
private final boolean f;
private final boolean c;
private final boolean v;
private final boolean j;
private final boolean C;
private final boolean A;
private static final long a = yz.a(9169581523206441333L, -170958280359002345L, MethodHandles.lookup().lookupClass()).a(102733960513791L);
private static final String[] b;
private static final String[] d;
private static final Map g = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

public gp(
@NotNull List entities,
@NotNull class_1657 target,
float placeRange,
float explodeRange,
float maxSelfDamage,
float minDamage,
boolean oldVer,
float armorScale,
float facePlaceHp,
boolean overrideSelfDamage,
float efficiencyFactor,
long a,
boolean rayTrace,
@NotNull sv friendProtection,
boolean breakFire,
boolean ignoreTerrain,
int lethalMultiplier,
boolean minimizeSelfDamage,
float maxDamageReduction,
boolean calcShields,
boolean stringWaterRemove,
boolean grimBreakRange,
boolean explodeEChestFarm,
boolean antiPortal,
boolean antiQuiver,
boolean overrideMinDamage
) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(entities, a<"b">(30741, 6745636020303484372L ^ ax));
Intrinsics.checkNotNullParameter(target, a<"b">(20538, 6650592532087045625L ^ ax));
Intrinsics.checkNotNullParameter(friendProtection, a<"b">(23267, 9096390029976205099L ^ ax));
super();
this.k = entities;
this.I = target;
this.Q = placeRange;
this.L = explodeRange;
this.e = maxSelfDamage;
this.V = minDamage;
this.H = oldVer;
this.G = armorScale;
this.N = facePlaceHp;
this.K = overrideSelfDamage;
this.h = efficiencyFactor;
this.F = rayTrace;
this.p = friendProtection;
this.D = breakFire;
this.R = ignoreTerrain;
this.E = lethalMultiplier;
this.o = minimizeSelfDamage;
this.i = maxDamageReduction;
this.s = calcShields;
this.f = stringWaterRemove;
this.c = grimBreakRange;
this.v = explodeEChestFarm;
this.j = antiPortal;
this.C = antiQuiver;
this.A = overrideMinDamage;
}

@NotNull
public final List I() {
return this.k;
}

@NotNull
public final class_1657 t() {
return this.I;
}

public final float M() {
return this.Q;
}

public final float U() {
return this.L;
}

public final float X() {
return this.e;
}

public final float a() {
return this.V;
}

public final boolean e() {
return this.H;
}

public final float W() {
return this.G;
}

public final float v() {
return this.N;
}

public final boolean u() {
return this.K;
}

public final float E() {
return this.h;
}

public final boolean r() {
return this.F;
}

@NotNull
public final sv b() {
return this.p;
}

public final boolean T() {
return this.D;
}

public final boolean Q() {
return this.R;
}

public final int m() {
return this.E;
}

public final boolean K() {
return this.o;
}

public final float h() {
return this.i;
}

public final boolean n() {
return this.s;
}

public final boolean O() {
return this.f;
}

public final boolean F() {
return this.c;
}

public final boolean V() {
return this.v;
}

public final boolean C() {
return this.j;
}

public final boolean H() {
return this.C;
}

public final boolean o() {
return this.A;
}

@NotNull
public final List z() {
return this.k;
}

@NotNull
public final class_1657 p() {
return this.I;
}

public final float i() {
return this.Q;
}

public final float d() {
return this.L;
}

public final float P() {
return this.e;
}

public final float q() {
return this.V;
}

public final boolean N() {
return this.H;
}

public final float R() {
return this.G;
}

public final float x() {
return this.N;
}

public final boolean A() {
return this.K;
}

public final float f() {
return this.h;
}

public final boolean y() {
return this.F;
}

@NotNull
public final sv g() {
return this.p;
}

public final boolean L() {
return this.D;
}

public final boolean S() {
return this.R;
}

public final int c() {
return this.E;
}

public final boolean Y() {
return this.o;
}

public final float k() {
return this.i;
}

public final boolean s() {
return this.s;
}

public final boolean j() {
return this.f;
}

public final boolean G() {
return this.c;
}

public final boolean w() {
return this.v;
}

public final boolean l() {
return this.j;
}

public final boolean B() {
return this.C;
}

public final boolean D() {
return this.A;
}

@NotNull
public final gp p(
@NotNull List entities,
@NotNull class_1657 target,
float placeRange,
float explodeRange,
float maxSelfDamage,
long a,
float minDamage,
boolean oldVer,
float armorScale,
float facePlaceHp,
boolean overrideSelfDamage,
float efficiencyFactor,
boolean rayTrace,
@NotNull sv friendProtection,
boolean breakFire,
boolean ignoreTerrain,
int lethalMultiplier,
boolean minimizeSelfDamage,
float maxDamageReduction,
boolean calcShields,
boolean stringWaterRemove,
boolean grimBreakRange,
boolean explodeEChestFarm,
boolean antiPortal,
boolean antiQuiver,
boolean overrideMinDamage
) {
ax = a ^ ax;
long var28 = ax ^ 15090699591847L;
Intrinsics.checkNotNullParameter(entities, a<"b">(15966, 850761253993823436L ^ ax));
Intrinsics.checkNotNullParameter(target, a<"b">(7766, 1821809290820197598L ^ ax));
Intrinsics.checkNotNullParameter(friendProtection, a<"b">(17288, 4113526771297632530L ^ ax));
return new gp(
entities,
target,
placeRange,
explodeRange,
maxSelfDamage,
minDamage,
oldVer,
armorScale,
facePlaceHp,
overrideSelfDamage,
efficiencyFactor,
var28,
rayTrace,
friendProtection,
breakFire,
ignoreTerrain,
lethalMultiplier,
minimizeSelfDamage,
maxDamageReduction,
calcShields,
stringWaterRemove,
grimBreakRange,
explodeEChestFarm,
antiPortal,
antiQuiver,
overrideMinDamage
);
}

public static gp m(
gp param0,
List param1,
class_1657 param2,
float param3,
float param4,
float param5,
float param6,
boolean param7,
float param8,
float param9,
boolean param10,
float param11,
boolean param12,
sv param13,
boolean param14,
boolean param15,
int param16,
boolean param17,
float param18,
long param19,
boolean param21,
boolean param22,
boolean param23,
boolean param24,
boolean param25,
boolean param26,
boolean param27,
int param28,
Object param29
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gp.a J
// 003: lload 19
// 005: lxor
// 006: lstore 19
// 008: lload 19
// 00a: dup2
// 00b: ldc2_w 110910908551238
// 00e: lxor
// 00f: lstore 30
// 011: pop2
// 012: ldc2_w -4978235138598351409
// 015: lload 19
// 017: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01c: astore 32
// 01e: iload 28
// 020: bipush 1
// 021: iand
// 022: aload 32
// 024: ifnonnull 041
// 027: ifeq 03d
// 02a: goto 038
// 02d: ldc2_w -4933758274863341587
// 030: lload 19
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 0
// 039: getfield su/catlean/gp.k Ljava/util/List;
// 03c: astore 1
// 03d: iload 28
// 03f: bipush 2
// 040: iand
// 041: aload 32
// 043: lload 19
// 045: lconst_0
// 046: lcmp
// 047: iflt 069
// 04a: ifnonnull 067
// 04d: ifeq 063
// 050: goto 05e
// 053: ldc2_w -4933758274863341587
// 056: lload 19
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: aload 0
// 05f: getfield su/catlean/gp.I Lnet/minecraft/class_1657;
// 062: astore 2
// 063: iload 28
// 065: bipush 4
// 066: iand
// 067: aload 32
// 069: lload 19
// 06b: lconst_0
// 06c: lcmp
// 06d: ifle 09c
// 070: ifnonnull 09a
// 073: ifeq 089
// 076: goto 084
// 079: ldc2_w -4933758274863341587
// 07c: lload 19
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: getfield su/catlean/gp.Q F
// 088: fstore 3
// 089: iload 28
// 08b: sipush 4109
// 08e: ldc2_w 7625446344100191597
// 091: lload 19
// 093: lxor
// 094: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: iand
// 09a: aload 32
// 09c: lload 19
// 09e: lconst_0
// 09f: lcmp
// 0a0: iflt 0d0
// 0a3: ifnonnull 0ce
// 0a6: ifeq 0bd
// 0a9: goto 0b7
// 0ac: ldc2_w -4933758274863341587
// 0af: lload 19
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 0
// 0b8: getfield su/catlean/gp.L F
// 0bb: fstore 4
// 0bd: iload 28
// 0bf: sipush 31532
// 0c2: ldc2_w 672244079112779344
// 0c5: lload 19
// 0c7: lxor
// 0c8: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: iand
// 0ce: aload 32
// 0d0: lload 19
// 0d2: lconst_0
// 0d3: lcmp
// 0d4: iflt 104
// 0d7: ifnonnull 102
// 0da: ifeq 0f1
// 0dd: goto 0eb
// 0e0: ldc2_w -4933758274863341587
// 0e3: lload 19
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: aload 0
// 0ec: getfield su/catlean/gp.e F
// 0ef: fstore 5
// 0f1: iload 28
// 0f3: sipush 6373
// 0f6: ldc2_w 5114233672865781128
// 0f9: lload 19
// 0fb: lxor
// 0fc: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: iand
// 102: aload 32
// 104: lload 19
// 106: lconst_0
// 107: lcmp
// 108: ifle 138
// 10b: ifnonnull 136
// 10e: ifeq 125
// 111: goto 11f
// 114: ldc2_w -4933758274863341587
// 117: lload 19
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 0
// 120: getfield su/catlean/gp.V F
// 123: fstore 6
// 125: iload 28
// 127: sipush 5744
// 12a: ldc2_w 6962934418151676697
// 12d: lload 19
// 12f: lxor
// 130: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: iand
// 136: aload 32
// 138: lload 19
// 13a: lconst_0
// 13b: lcmp
// 13c: ifle 16c
// 13f: ifnonnull 16a
// 142: ifeq 159
// 145: goto 153
// 148: ldc2_w -4933758274863341587
// 14b: lload 19
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: aload 0
// 154: getfield su/catlean/gp.H Z
// 157: istore 7
// 159: iload 28
// 15b: sipush 7125
// 15e: ldc2_w 6625443753722320573
// 161: lload 19
// 163: lxor
// 164: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: iand
// 16a: aload 32
// 16c: lload 19
// 16e: lconst_0
// 16f: lcmp
// 170: iflt 1a0
// 173: ifnonnull 19e
// 176: ifeq 18d
// 179: goto 187
// 17c: ldc2_w -4933758274863341587
// 17f: lload 19
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: aload 0
// 188: getfield su/catlean/gp.G F
// 18b: fstore 8
// 18d: iload 28
// 18f: sipush 26832
// 192: ldc2_w 4524181048231585206
// 195: lload 19
// 197: lxor
// 198: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: iand
// 19e: aload 32
// 1a0: lload 19
// 1a2: lconst_0
// 1a3: lcmp
// 1a4: iflt 1d4
// 1a7: ifnonnull 1d2
// 1aa: ifeq 1c1
// 1ad: goto 1bb
// 1b0: ldc2_w -4933758274863341587
// 1b3: lload 19
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: aload 0
// 1bc: getfield su/catlean/gp.N F
// 1bf: fstore 9
// 1c1: iload 28
// 1c3: sipush 23914
// 1c6: ldc2_w 6128664534877360142
// 1c9: lload 19
// 1cb: lxor
// 1cc: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: iand
// 1d2: aload 32
// 1d4: lload 19
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: ifle 208
// 1db: ifnonnull 206
// 1de: ifeq 1f5
// 1e1: goto 1ef
// 1e4: ldc2_w -4933758274863341587
// 1e7: lload 19
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: aload 0
// 1f0: getfield su/catlean/gp.K Z
// 1f3: istore 10
// 1f5: iload 28
// 1f7: sipush 24340
// 1fa: ldc2_w 1721692222676324990
// 1fd: lload 19
// 1ff: lxor
// 200: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: iand
// 206: aload 32
// 208: lload 19
// 20a: lconst_0
// 20b: lcmp
// 20c: iflt 23c
// 20f: ifnonnull 23a
// 212: ifeq 229
// 215: goto 223
// 218: ldc2_w -4933758274863341587
// 21b: lload 19
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: aload 0
// 224: getfield su/catlean/gp.h F
// 227: fstore 11
// 229: iload 28
// 22b: sipush 29283
// 22e: ldc2_w 6407422902986211084
// 231: lload 19
// 233: lxor
// 234: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: iand
// 23a: aload 32
// 23c: lload 19
// 23e: lconst_0
// 23f: lcmp
// 240: ifle 270
// 243: ifnonnull 26e
// 246: ifeq 25d
// 249: goto 257
// 24c: ldc2_w -4933758274863341587
// 24f: lload 19
// 251: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: athrow
// 257: aload 0
// 258: getfield su/catlean/gp.F Z
// 25b: istore 12
// 25d: iload 28
// 25f: sipush 23784
// 262: ldc2_w 3373604755660427663
// 265: lload 19
// 267: lxor
// 268: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: iand
// 26e: aload 32
// 270: lload 19
// 272: lconst_0
// 273: lcmp
// 274: ifle 2a4
// 277: ifnonnull 2a2
// 27a: ifeq 291
// 27d: goto 28b
// 280: ldc2_w -4933758274863341587
// 283: lload 19
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: aload 0
// 28c: getfield su/catlean/gp.p Lsu/catlean/sv;
// 28f: astore 13
// 291: iload 28
// 293: sipush 13276
// 296: ldc2_w 7074860589714489022
// 299: lload 19
// 29b: lxor
// 29c: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a1: iand
// 2a2: aload 32
// 2a4: lload 19
// 2a6: lconst_0
// 2a7: lcmp
// 2a8: iflt 2d8
// 2ab: ifnonnull 2d6
// 2ae: ifeq 2c5
// 2b1: goto 2bf
// 2b4: ldc2_w -4933758274863341587
// 2b7: lload 19
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: aload 0
// 2c0: getfield su/catlean/gp.D Z
// 2c3: istore 14
// 2c5: iload 28
// 2c7: sipush 1317
// 2ca: ldc2_w 1380866593919273054
// 2cd: lload 19
// 2cf: lxor
// 2d0: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: iand
// 2d6: aload 32
// 2d8: lload 19
// 2da: lconst_0
// 2db: lcmp
// 2dc: iflt 30c
// 2df: ifnonnull 30a
// 2e2: ifeq 2f9
// 2e5: goto 2f3
// 2e8: ldc2_w -4933758274863341587
// 2eb: lload 19
// 2ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: athrow
// 2f3: aload 0
// 2f4: getfield su/catlean/gp.R Z
// 2f7: istore 15
// 2f9: iload 28
// 2fb: sipush 25573
// 2fe: ldc2_w 6968221288013786776
// 301: lload 19
// 303: lxor
// 304: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: iand
// 30a: aload 32
// 30c: lload 19
// 30e: lconst_0
// 30f: lcmp
// 310: iflt 340
// 313: ifnonnull 33e
// 316: ifeq 32d
// 319: goto 327
// 31c: ldc2_w -4933758274863341587
// 31f: lload 19
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: aload 0
// 328: getfield su/catlean/gp.E I
// 32b: istore 16
// 32d: iload 28
// 32f: sipush 11939
// 332: ldc2_w 4051217924731937741
// 335: lload 19
// 337: lxor
// 338: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: iand
// 33e: aload 32
// 340: lload 19
// 342: lconst_0
// 343: lcmp
// 344: iflt 374
// 347: ifnonnull 372
// 34a: ifeq 361
// 34d: goto 35b
// 350: ldc2_w -4933758274863341587
// 353: lload 19
// 355: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35a: athrow
// 35b: aload 0
// 35c: getfield su/catlean/gp.o Z
// 35f: istore 17
// 361: iload 28
// 363: sipush 18493
// 366: ldc2_w 6155276170385900888
// 369: lload 19
// 36b: lxor
// 36c: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: iand
// 372: aload 32
// 374: lload 19
// 376: lconst_0
// 377: lcmp
// 378: ifle 3a8
// 37b: ifnonnull 3a6
// 37e: ifeq 395
// 381: goto 38f
// 384: ldc2_w -4933758274863341587
// 387: lload 19
// 389: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: athrow
// 38f: aload 0
// 390: getfield su/catlean/gp.i F
// 393: fstore 18
// 395: iload 28
// 397: sipush 15065
// 39a: ldc2_w 2530741817621395381
// 39d: lload 19
// 39f: lxor
// 3a0: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: iand
// 3a6: aload 32
// 3a8: lload 19
// 3aa: lconst_0
// 3ab: lcmp
// 3ac: iflt 3dc
// 3af: ifnonnull 3da
// 3b2: ifeq 3c9
// 3b5: goto 3c3
// 3b8: ldc2_w -4933758274863341587
// 3bb: lload 19
// 3bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: athrow
// 3c3: aload 0
// 3c4: getfield su/catlean/gp.s Z
// 3c7: istore 21
// 3c9: iload 28
// 3cb: sipush 16729
// 3ce: ldc2_w 8411581472392301618
// 3d1: lload 19
// 3d3: lxor
// 3d4: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: iand
// 3da: aload 32
// 3dc: lload 19
// 3de: lconst_0
// 3df: lcmp
// 3e0: ifle 410
// 3e3: ifnonnull 40e
// 3e6: ifeq 3fd
// 3e9: goto 3f7
// 3ec: ldc2_w -4933758274863341587
// 3ef: lload 19
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: aload 0
// 3f8: getfield su/catlean/gp.f Z
// 3fb: istore 22
// 3fd: iload 28
// 3ff: sipush 12158
// 402: ldc2_w 219716384809525767
// 405: lload 19
// 407: lxor
// 408: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40d: iand
// 40e: aload 32
// 410: lload 19
// 412: lconst_0
// 413: lcmp
// 414: iflt 444
// 417: ifnonnull 442
// 41a: ifeq 431
// 41d: goto 42b
// 420: ldc2_w -4933758274863341587
// 423: lload 19
// 425: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42a: athrow
// 42b: aload 0
// 42c: getfield su/catlean/gp.c Z
// 42f: istore 23
// 431: iload 28
// 433: sipush 6940
// 436: ldc2_w 2848390887015913058
// 439: lload 19
// 43b: lxor
// 43c: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: iand
// 442: aload 32
// 444: lload 19
// 446: lconst_0
// 447: lcmp
// 448: iflt 478
// 44b: ifnonnull 476
// 44e: ifeq 465
// 451: goto 45f
// 454: ldc2_w -4933758274863341587
// 457: lload 19
// 459: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45e: athrow
// 45f: aload 0
// 460: getfield su/catlean/gp.v Z
// 463: istore 24
// 465: iload 28
// 467: sipush 19561
// 46a: ldc2_w 7534028003071738120
// 46d: lload 19
// 46f: lxor
// 470: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 475: iand
// 476: aload 32
// 478: lload 19
// 47a: lconst_0
// 47b: lcmp
// 47c: iflt 4ac
// 47f: ifnonnull 4aa
// 482: ifeq 499
// 485: goto 493
// 488: ldc2_w -4933758274863341587
// 48b: lload 19
// 48d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 492: athrow
// 493: aload 0
// 494: getfield su/catlean/gp.j Z
// 497: istore 25
// 499: iload 28
// 49b: sipush 31124
// 49e: ldc2_w 627098161793660151
// 4a1: lload 19
// 4a3: lxor
// 4a4: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a9: iand
// 4aa: aload 32
// 4ac: lload 19
// 4ae: lconst_0
// 4af: lcmp
// 4b0: ifle 4e0
// 4b3: ifnonnull 4de
// 4b6: ifeq 4cd
// 4b9: goto 4c7
// 4bc: ldc2_w -4933758274863341587
// 4bf: lload 19
// 4c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c6: athrow
// 4c7: aload 0
// 4c8: getfield su/catlean/gp.C Z
// 4cb: istore 26
// 4cd: iload 28
// 4cf: sipush 13992
// 4d2: ldc2_w 6289020144795990994
// 4d5: lload 19
// 4d7: lxor
// 4d8: invokedynamic c (IJ)I bsm=su/catlean/gp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4dd: iand
// 4de: aload 32
// 4e0: ifnonnull 506
// 4e3: ifeq 508
// 4e6: goto 4f4
// 4e9: ldc2_w -4933758274863341587
// 4ec: lload 19
// 4ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f3: athrow
// 4f4: aload 0
// 4f5: getfield su/catlean/gp.A Z
// 4f8: goto 506
// 4fb: ldc2_w -4933758274863341587
// 4fe: lload 19
// 500: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 505: athrow
// 506: istore 27
// 508: aload 0
// 509: aload 1
// 50a: aload 2
// 50b: fload 3
// 50c: fload 4
// 50e: fload 5
// 510: lload 30
// 512: fload 6
// 514: iload 7
// 516: fload 8
// 518: fload 9
// 51a: iload 10
// 51c: fload 11
// 51e: iload 12
// 520: aload 13
// 522: iload 14
// 524: iload 15
// 526: iload 16
// 528: iload 17
// 52a: fload 18
// 52c: iload 21
// 52e: iload 22
// 530: iload 23
// 532: iload 24
// 534: iload 25
// 536: iload 26
// 538: iload 27
// 53a: invokevirtual su/catlean/gp.p (Ljava/util/List;Lnet/minecraft/class_1657;FFFJFZFFZFZLsu/catlean/sv;ZZIZFZZZZZZZ)Lsu/catlean/gp;
// 53d: lload 19
// 53f: lconst_0
// 540: lcmp
// 541: iflt 55d
// 544: ldc2_w -5033137796464925513
// 547: lload 19
// 549: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54e: ifnull 56b
// 551: ldc "BcVJ0"
// 553: ldc2_w -4972569315104205857
// 556: lload 19
// 558: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55d: goto 56b
// 560: ldc2_w -4933758274863341587
// 563: lload 19
// 565: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56a: athrow
// 56b: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 117465219528494L;
boolean var3 = this.A;
boolean var4 = this.C;
boolean var5 = this.j;
boolean var6 = this.v;
boolean var7 = this.c;
boolean var8 = this.f;
boolean var9 = this.s;
float var10 = this.i;
boolean var11 = this.o;
int var12 = this.E;
boolean var13 = this.R;
boolean var14 = this.D;
sv var15 = this.p;
boolean var16 = this.F;
float var17 = this.h;
boolean var18 = this.K;
float var19 = this.N;
float var20 = this.G;
boolean var21 = this.H;
float var22 = this.V;
float var23 = this.e;
float var24 = this.L;
float var25 = this.Q;
class_1657 var26 = this.I;
List var27 = this.k;
return a<"b">(11742, 9028496657022202690L ^ var1)
+ var27
+ a<"b">(10173, 9202148519849507122L ^ var1)
+ var26
+ a<"b">(8095, 934308236028313862L ^ var1)
+ var25
+ a<"b">(23676, 4193502081899053819L ^ var1)
+ var24
+ a<"b">(6499, 6270120486955845625L ^ var1)
+ var23
+ a<"b">(26003, 8470346452685060881L ^ var1)
+ var22
+ a<"b">(3475, 4964772412022821643L ^ var1)
+ var21
+ a<"b">(8698, 1038696833266597737L ^ var1)
+ var20
+ a<"b">(9134, 1321927615197199675L ^ var1)
+ var19
+ a<"b">(29306, 8640043430731738352L ^ var1)
+ var18
+ a<"b">(6645, 3289192233241151331L ^ var1)
+ var17
+ a<"b">(20812, 8305376096871534536L ^ var1)
+ var16
+ a<"b">(23380, 8889711531357652426L ^ var1)
+ var15
+ a<"b">(10294, 8132852654568912567L ^ var1)
+ var14
+ a<"b">(18624, 7149959690072839761L ^ var1)
+ var13
+ a<"b">(6691, 1801438549843477669L ^ var1)
+ var12
+ a<"b">(24965, 75279033822641934L ^ var1)
+ var11
+ a<"b">(9670, 4763265677153286994L ^ var1)
+ var10
+ a<"b">(30092, 943722676791307020L ^ var1)
+ var9
+ a<"b">(25634, 1838233987951426239L ^ var1)
+ var8
+ a<"b">(8460, 8870447359418384271L ^ var1)
+ var7
+ a<"b">(7253, 7577811804216459996L ^ var1)
+ var6
+ a<"b">(17671, 1833407327082503051L ^ var1)
+ var5
+ a<"b">(8864, 6760903714660203566L ^ var1)
+ var4
+ a<"b">(29193, 5366088269265267841L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 93601647090811L;
int var4 = this.k.hashCode();
var4 = var4 * b<"c">(27599, 8898793843073371735L ^ var1) + this.I.hashCode();
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.Q);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.L);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.e);
String var10000 = vm.a<"Å">(1301238158434297128L, var1);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.V);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.H);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.G);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.N);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.K);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.h);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.F);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + this.p.hashCode();
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.D);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.R);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Integer.hashCode(this.E);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.o);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Float.hashCode(this.i);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.s);
String var3 = var10000;
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.f);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.c);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.v);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.j);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.C);
var4 = var4 * b<"c">(21410, 2064940633742931517L ^ var1) + Boolean.hashCode(this.A);

try {
if (var3 != null) {
vm.a<"Å">(new _g[4], 1348750973227571338L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1396371300451284746L, var1);
}
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gp.a J
// 003: ldc2_w 20280017542619
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 1418258285088859272
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 1351272423846311594
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 1351272423846311594
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/gp
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 1351272423846311594
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 1351272423846311594
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/gp
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/gp.k Ljava/util/List;
// 065: aload 5
// 067: getfield su/catlean/gp.k Ljava/util/List;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 1351272423846311594
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 1351272423846311594
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/gp.I Lnet/minecraft/class_1657;
// 092: aload 5
// 094: getfield su/catlean/gp.I Lnet/minecraft/class_1657;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 1351272423846311594
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 1351272423846311594
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/gp.Q F
// 0bf: aload 5
// 0c1: getfield su/catlean/gp.Q F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 1351272423846311594
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 1351272423846311594
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/gp.L F
// 0ec: aload 5
// 0ee: getfield su/catlean/gp.L F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w 1351272423846311594
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 1351272423846311594
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/gp.e F
// 119: aload 5
// 11b: getfield su/catlean/gp.e F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w 1351272423846311594
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 1351272423846311594
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/gp.V F
// 146: aload 5
// 148: getfield su/catlean/gp.V F
// 14b: invokestatic java/lang/Float.compare (FF)I
// 14e: aload 4
// 150: ifnonnull 173
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w 1351272423846311594
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w 1351272423846311594
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: getfield su/catlean/gp.H Z
// 173: aload 4
// 175: ifnonnull 1a5
// 178: aload 5
// 17a: getfield su/catlean/gp.H Z
// 17d: if_icmpeq 199
// 180: goto 18d
// 183: ldc2_w 1351272423846311594
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 0
// 18e: ireturn
// 18f: ldc2_w 1351272423846311594
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: getfield su/catlean/gp.G F
// 19d: aload 5
// 19f: getfield su/catlean/gp.G F
// 1a2: invokestatic java/lang/Float.compare (FF)I
// 1a5: aload 4
// 1a7: ifnonnull 1d2
// 1aa: ifeq 1c6
// 1ad: goto 1ba
// 1b0: ldc2_w 1351272423846311594
// 1b3: lload 2
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: bipush 0
// 1bb: ireturn
// 1bc: ldc2_w 1351272423846311594
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: aload 0
// 1c7: getfield su/catlean/gp.N F
// 1ca: aload 5
// 1cc: getfield su/catlean/gp.N F
// 1cf: invokestatic java/lang/Float.compare (FF)I
// 1d2: aload 4
// 1d4: ifnonnull 1f7
// 1d7: ifeq 1f3
// 1da: goto 1e7
// 1dd: ldc2_w 1351272423846311594
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: bipush 0
// 1e8: ireturn
// 1e9: ldc2_w 1351272423846311594
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: aload 0
// 1f4: getfield su/catlean/gp.K Z
// 1f7: aload 4
// 1f9: ifnonnull 229
// 1fc: aload 5
// 1fe: getfield su/catlean/gp.K Z
// 201: if_icmpeq 21d
// 204: goto 211
// 207: ldc2_w 1351272423846311594
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: bipush 0
// 212: ireturn
// 213: ldc2_w 1351272423846311594
// 216: lload 2
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: aload 0
// 21e: getfield su/catlean/gp.h F
// 221: aload 5
// 223: getfield su/catlean/gp.h F
// 226: invokestatic java/lang/Float.compare (FF)I
// 229: aload 4
// 22b: ifnonnull 260
// 22e: ifeq 24a
// 231: goto 23e
// 234: ldc2_w 1351272423846311594
// 237: lload 2
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: bipush 0
// 23f: ireturn
// 240: ldc2_w 1351272423846311594
// 243: lload 2
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: aload 0
// 24b: aload 4
// 24d: ifnonnull 275
// 250: getfield su/catlean/gp.F Z
// 253: goto 260
// 256: ldc2_w 1351272423846311594
// 259: lload 2
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: aload 5
// 262: getfield su/catlean/gp.F Z
// 265: if_icmpeq 274
// 268: bipush 0
// 269: ireturn
// 26a: ldc2_w 1351272423846311594
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: aload 0
// 275: aload 4
// 277: ifnonnull 29f
// 27a: getfield su/catlean/gp.p Lsu/catlean/sv;
// 27d: aload 5
// 27f: getfield su/catlean/gp.p Lsu/catlean/sv;
// 282: if_acmpeq 29e
// 285: goto 292
// 288: ldc2_w 1351272423846311594
// 28b: lload 2
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: bipush 0
// 293: ireturn
// 294: ldc2_w 1351272423846311594
// 297: lload 2
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: aload 0
// 29f: getfield su/catlean/gp.D Z
// 2a2: aload 5
// 2a4: getfield su/catlean/gp.D Z
// 2a7: aload 4
// 2a9: ifnonnull 2d1
// 2ac: if_icmpeq 2c8
// 2af: goto 2bc
// 2b2: ldc2_w 1351272423846311594
// 2b5: lload 2
// 2b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bb: athrow
// 2bc: bipush 0
// 2bd: ireturn
// 2be: ldc2_w 1351272423846311594
// 2c1: lload 2
// 2c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: athrow
// 2c8: aload 0
// 2c9: getfield su/catlean/gp.R Z
// 2cc: aload 5
// 2ce: getfield su/catlean/gp.R Z
// 2d1: aload 4
// 2d3: ifnonnull 2fb
// 2d6: if_icmpeq 2f2
// 2d9: goto 2e6
// 2dc: ldc2_w 1351272423846311594
// 2df: lload 2
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: bipush 0
// 2e7: ireturn
// 2e8: ldc2_w 1351272423846311594
// 2eb: lload 2
// 2ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: athrow
// 2f2: aload 0
// 2f3: getfield su/catlean/gp.E I
// 2f6: aload 5
// 2f8: getfield su/catlean/gp.E I
// 2fb: aload 4
// 2fd: ifnonnull 337
// 300: if_icmpeq 31c
// 303: goto 310
// 306: ldc2_w 1351272423846311594
// 309: lload 2
// 30a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: athrow
// 310: bipush 0
// 311: ireturn
// 312: ldc2_w 1351272423846311594
// 315: lload 2
// 316: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: athrow
// 31c: aload 0
// 31d: getfield su/catlean/gp.o Z
// 320: aload 4
// 322: ifnonnull 352
// 325: aload 5
// 327: getfield su/catlean/gp.o Z
// 32a: goto 337
// 32d: ldc2_w 1351272423846311594
// 330: lload 2
// 331: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: athrow
// 337: if_icmpeq 346
// 33a: bipush 0
// 33b: ireturn
// 33c: ldc2_w 1351272423846311594
// 33f: lload 2
// 340: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: athrow
// 346: aload 0
// 347: getfield su/catlean/gp.i F
// 34a: aload 5
// 34c: getfield su/catlean/gp.i F
// 34f: invokestatic java/lang/Float.compare (FF)I
// 352: aload 4
// 354: ifnonnull 377
// 357: ifeq 373
// 35a: goto 367
// 35d: ldc2_w 1351272423846311594
// 360: lload 2
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: bipush 0
// 368: ireturn
// 369: ldc2_w 1351272423846311594
// 36c: lload 2
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: aload 0
// 374: getfield su/catlean/gp.s Z
// 377: aload 5
// 379: getfield su/catlean/gp.s Z
// 37c: aload 4
// 37e: ifnonnull 3a6
// 381: if_icmpeq 39d
// 384: goto 391
// 387: ldc2_w 1351272423846311594
// 38a: lload 2
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: bipush 0
// 392: ireturn
// 393: ldc2_w 1351272423846311594
// 396: lload 2
// 397: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39c: athrow
// 39d: aload 0
// 39e: getfield su/catlean/gp.f Z
// 3a1: aload 5
// 3a3: getfield su/catlean/gp.f Z
// 3a6: aload 4
// 3a8: ifnonnull 3d0
// 3ab: if_icmpeq 3c7
// 3ae: goto 3bb
// 3b1: ldc2_w 1351272423846311594
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: bipush 0
// 3bc: ireturn
// 3bd: ldc2_w 1351272423846311594
// 3c0: lload 2
// 3c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c6: athrow
// 3c7: aload 0
// 3c8: getfield su/catlean/gp.c Z
// 3cb: aload 5
// 3cd: getfield su/catlean/gp.c Z
// 3d0: aload 4
// 3d2: ifnonnull 3fa
// 3d5: if_icmpeq 3f1
// 3d8: goto 3e5
// 3db: ldc2_w 1351272423846311594
// 3de: lload 2
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: bipush 0
// 3e6: ireturn
// 3e7: ldc2_w 1351272423846311594
// 3ea: lload 2
// 3eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: athrow
// 3f1: aload 0
// 3f2: getfield su/catlean/gp.v Z
// 3f5: aload 5
// 3f7: getfield su/catlean/gp.v Z
// 3fa: aload 4
// 3fc: ifnonnull 424
// 3ff: if_icmpeq 41b
// 402: goto 40f
// 405: ldc2_w 1351272423846311594
// 408: lload 2
// 409: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40e: athrow
// 40f: bipush 0
// 410: ireturn
// 411: ldc2_w 1351272423846311594
// 414: lload 2
// 415: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41a: athrow
// 41b: aload 0
// 41c: getfield su/catlean/gp.j Z
// 41f: aload 5
// 421: getfield su/catlean/gp.j Z
// 424: aload 4
// 426: ifnonnull 44e
// 429: if_icmpeq 445
// 42c: goto 439
// 42f: ldc2_w 1351272423846311594
// 432: lload 2
// 433: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 438: athrow
// 439: bipush 0
// 43a: ireturn
// 43b: ldc2_w 1351272423846311594
// 43e: lload 2
// 43f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 444: athrow
// 445: aload 0
// 446: getfield su/catlean/gp.C Z
// 449: aload 5
// 44b: getfield su/catlean/gp.C Z
// 44e: aload 4
// 450: ifnonnull 48a
// 453: if_icmpeq 46f
// 456: goto 463
// 459: ldc2_w 1351272423846311594
// 45c: lload 2
// 45d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 462: athrow
// 463: bipush 0
// 464: ireturn
// 465: ldc2_w 1351272423846311594
// 468: lload 2
// 469: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: athrow
// 46f: aload 0
// 470: getfield su/catlean/gp.A Z
// 473: aload 4
// 475: ifnonnull 49a
// 478: aload 5
// 47a: getfield su/catlean/gp.A Z
// 47d: goto 48a
// 480: ldc2_w 1351272423846311594
// 483: lload 2
// 484: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 489: athrow
// 48a: if_icmpeq 499
// 48d: bipush 0
// 48e: ireturn
// 48f: ldc2_w 1351272423846311594
// 492: lload 2
// 493: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 498: athrow
// 499: bipush 1
// 49a: ireturn
}

static {
long var11 = a ^ 111439005571833L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[31];
int var18 = 0;
String var17 = "\u0086\fýç»1êW\u0010\u00adñ43×ï(1z\u0000_L\u0097G\u0000\u0018\u001e\u0012¯ ñ¾0\u009fÈÑÇëDúULô\r\u001b*\u0098\u0000vÍ \u001dD,\u008cª£¨ÎGê\u0098\u0080uÕ1\u000eæ¶ \t*\u009aë´u0bí\u009a\u0017\u0086\u0086(\u0088)H\nO\u0013\u001bØ\u0095\u009es>\u0084Øá'Ò7\u0093½\u0019\u0080[-\u0015¨K\u009b¨Éüê\u001b\u0014ù®G\nP\u0085\u0018\u00adÃÀ\u0014\u008c\fú\u000eUU\u000e½ÿ#à\u0098\u0011(\u008cwîçÁ.(\bÜ.]Fá{JÒj#¯`wQó\u0006å}\u009d¶|\u001d5ï*)áY\u009c)\b\u007f½¹W¿Ì\u009d=(]\b\u001e \u009bî\u0011®\u0089a8>ï2ñ\u0081\bNïß\u0000þ\u0086Ô\u009by¼\t*÷¬Ë\u0088ø¥Ãç}\u008b4 \u008e\u0085\u001dC£Í\u0019J(B\u0086Ì\u000fée\u0013't¸\u0014£\u0017º¬<`2MÂT¤\u008b0Øíè,0M\u0017|§\u000f}\u0010_Ë\u0007aÅ\u00ad\u009d£Â\u0010Òc¶yº\u0015²\u008f\u0002\u00814:â\u0090\nã@\u0004H\u009c\u0011\u0083WÝQd(¾S\u0089%\\\u0088\u0013&YS[\u00adè!Ï\u0019È- }\u0017ìZ±-g\u009dj¦6d\u0091Q_êÀÅ¸ÙL(Y\u000f®©$\u0005JÛ\u0011i{\u0091 q$Ç$\fHNÅ\u00adOhL\u0013öÔµs°I¼w\u0085fÂ{Oh(ð·í\u008eÉ\u0086¦H\u0005îf\u0092<üÍ÷\u0016ôf\u0002&M\u009b~\u0016à·\u008c\u008e¿hÊ\u0089s9\u009ecûüR GÐõIìx\u009a\u008f»kÙ\u0015që½\u0010VM -¿dö\u0005w÷OÏ\u000eXð\u007f\u0018ù\u0085kÆ\u0016lQ\u0099ÌÅÎ\\áMª\u0086äe\u0005½\u009f±Õþ \u0005Jñ¾áÚ\u001bLê©v\u008eV\u0096ÿõ\u0005þI\u000e\u008bZR5O¾Èû\u0000E\"« Âêàµ×Ï¶\u0006°å«9Ó*Ì\u0011\u0019\u009f\t\u0084}\u008c\u001cF\u001f\u00863MùRÍa\u0010oaZv\u008e\u0088yýð¬Ì5ðµ«ÿ(\t\u0010}ª\u0001ø:\u008aùt\u0005\u008c4\u0018\u009fÚ-r'4e\u001cr\u009aôzgþ#\u001fÇ\u0011\u009aL!\\=\u009e^x ùW\u001cÓÁ[ow\u001aM\u008a\u001a®¢n2$*Q\u009e«æ}\u0085\u0097\u008aC>]ä\u0002p Ä\u001e\n¼z`Ì0\u009e\u008bï\r}Ú\nÀ¨}·>\u0089ö$Ì\u0086\u000b\u0014[tð\u0093/(*ë@qñO>b\u009aÖ\u008d¥Ü:|\u00878³º\u0005\u0098gb*phK\u0087\u008a\u001a#:å½3ñÂ\\Ó8 è·{ö]Îó£\u0000São]-\u0002ºÐ\u001a\u009f\u0082ÓXãÒÿ«973üìX(èMæ)9\u000bô\u0015v\u008e\u0016Ö\u000b\u0011n\u001bÀBÛ\u008dÿsÛQ$÷{¸\u007f#8ÁÎÁÙV\\2òð\u0010Ü\u0085Å¦Û$uçù9\u0006Ú´÷\u0086k ãpé(\u0080\f\u008dh\u009fK>\u009aYG)Ò\u0093u!\u0015Ë`Í~\tÇ³\u001eÍJ~c 1}3í\u0011z.#à/°çW³'Ê\u001d\u0017\u008b/ô\u0001&\u0083ÆÞ&\u0003ð«RÉ(\u0019\u0098Äaj;\u0082bbùùÂ%\rU\u00ad¹p\u001c\u008a³aki\u0010\u007f\u0090\u00ad÷¿Ã!1 °Q~©Ö\u0097(f¨Ü\u000fÚ\u001a\u0012PÍ5\u000e\u001c2ÇØ:\u0087õ\u0098D\u001f\u0004rÐ\u00194Á\u0080Ð\u0019e\u0084h\u0087A\u0088G}\u0094Ã(\u001e\u000fN\u0083\u001dË\u008f\nÕ\u0090½ÔT$Ô}*ÁhÅv\u0019&k\u0097F7Ðûª\u0001È\u0087Üò²Ê\u0097í'";
int var19 = "\u0086\fýç»1êW\u0010\u00adñ43×ï(1z\u0000_L\u0097G\u0000\u0018\u001e\u0012¯ ñ¾0\u009fÈÑÇëDúULô\r\u001b*\u0098\u0000vÍ \u001dD,\u008cª£¨ÎGê\u0098\u0080uÕ1\u000eæ¶ \t*\u009aë´u0bí\u009a\u0017\u0086\u0086(\u0088)H\nO\u0013\u001bØ\u0095\u009es>\u0084Øá'Ò7\u0093½\u0019\u0080[-\u0015¨K\u009b¨Éüê\u001b\u0014ù®G\nP\u0085\u0018\u00adÃÀ\u0014\u008c\fú\u000eUU\u000e½ÿ#à\u0098\u0011(\u008cwîçÁ.(\bÜ.]Fá{JÒj#¯`wQó\u0006å}\u009d¶|\u001d5ï*)áY\u009c)\b\u007f½¹W¿Ì\u009d=(]\b\u001e \u009bî\u0011®\u0089a8>ï2ñ\u0081\bNïß\u0000þ\u0086Ô\u009by¼\t*÷¬Ë\u0088ø¥Ãç}\u008b4 \u008e\u0085\u001dC£Í\u0019J(B\u0086Ì\u000fée\u0013't¸\u0014£\u0017º¬<`2MÂT¤\u008b0Øíè,0M\u0017|§\u000f}\u0010_Ë\u0007aÅ\u00ad\u009d£Â\u0010Òc¶yº\u0015²\u008f\u0002\u00814:â\u0090\nã@\u0004H\u009c\u0011\u0083WÝQd(¾S\u0089%\\\u0088\u0013&YS[\u00adè!Ï\u0019È- }\u0017ìZ±-g\u009dj¦6d\u0091Q_êÀÅ¸ÙL(Y\u000f®©$\u0005JÛ\u0011i{\u0091 q$Ç$\fHNÅ\u00adOhL\u0013öÔµs°I¼w\u0085fÂ{Oh(ð·í\u008eÉ\u0086¦H\u0005îf\u0092<üÍ÷\u0016ôf\u0002&M\u009b~\u0016à·\u008c\u008e¿hÊ\u0089s9\u009ecûüR GÐõIìx\u009a\u008f»kÙ\u0015që½\u0010VM -¿dö\u0005w÷OÏ\u000eXð\u007f\u0018ù\u0085kÆ\u0016lQ\u0099ÌÅÎ\\áMª\u0086äe\u0005½\u009f±Õþ \u0005Jñ¾áÚ\u001bLê©v\u008eV\u0096ÿõ\u0005þI\u000e\u008bZR5O¾Èû\u0000E\"« Âêàµ×Ï¶\u0006°å«9Ó*Ì\u0011\u0019\u009f\t\u0084}\u008c\u001cF\u001f\u00863MùRÍa\u0010oaZv\u008e\u0088yýð¬Ì5ðµ«ÿ(\t\u0010}ª\u0001ø:\u008aùt\u0005\u008c4\u0018\u009fÚ-r'4e\u001cr\u009aôzgþ#\u001fÇ\u0011\u009aL!\\=\u009e^x ùW\u001cÓÁ[ow\u001aM\u008a\u001a®¢n2$*Q\u009e«æ}\u0085\u0097\u008aC>]ä\u0002p Ä\u001e\n¼z`Ì0\u009e\u008bï\r}Ú\nÀ¨}·>\u0089ö$Ì\u0086\u000b\u0014[tð\u0093/(*ë@qñO>b\u009aÖ\u008d¥Ü:|\u00878³º\u0005\u0098gb*phK\u0087\u008a\u001a#:å½3ñÂ\\Ó8 è·{ö]Îó£\u0000São]-\u0002ºÐ\u001a\u009f\u0082ÓXãÒÿ«973üìX(èMæ)9\u000bô\u0015v\u008e\u0016Ö\u000b\u0011n\u001bÀBÛ\u008dÿsÛQ$÷{¸\u007f#8ÁÎÁÙV\\2òð\u0010Ü\u0085Å¦Û$uçù9\u0006Ú´÷\u0086k ãpé(\u0080\f\u008dh\u009fK>\u009aYG)Ò\u0093u!\u0015Ë`Í~\tÇ³\u001eÍJ~c 1}3í\u0011z.#à/°çW³'Ê\u001d\u0017\u008b/ô\u0001&\u0083ÆÞ&\u0003ð«RÉ(\u0019\u0098Äaj;\u0082bbùùÂ%\rU\u00ad¹p\u001c\u008a³aki\u0010\u007f\u0090\u00ad÷¿Ã!1 °Q~©Ö\u0097(f¨Ü\u000fÚ\u001a\u0012PÍ5\u000e\u001c2ÇØ:\u0087õ\u0098D\u001f\u0004rÐ\u00194Á\u0080Ð\u0019e\u0084h\u0087A\u0088G}\u0094Ã(\u001e\u000fN\u0083\u001dË\u008f\nÕ\u0090½ÔT$Ô}*ÁhÅv\u0019&k\u0097F7Ðûª\u0001È\u0087Üò²Ê\u0097í'"
.length();
char var16 = 24;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
d = new String[31];
n = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[24];
int var3 = 0;
String var4 = "\u008eAT\u0082îx{\u008f»Z?$\u0006zø¹À%i\u009a+×tw\u0011V@ \u0095Ù\u008f\u001c\u000enÏ\u0095 {¸¨ù«\u009b'ù^ý+\u0097K=^r©%¢}\u007fu\rh\u0098¤Óµ\u0080E\u009e)á×º¢×:Ea÷¡¦¤kÙ\u00838hOkWh¼^÷ÚÌ°Ãä\u0000êæÉã\u00193Ùê¬ñ}¿³\u0010¶ì\u0004\u0088è¿\u001aÁ+w \u00809à\u009bÉ¼¤ÈwåþD\u0014Î×lË{\u009e:ê¬Ì:\u008d\b\u0002Uu2í,\u000f»$\u0081õCR\fêK \u0081Å.Á¸(\\Ûx";
int var5 = "\u008eAT\u0082îx{\u008f»Z?$\u0006zø¹À%i\u009a+×tw\u0011V@ \u0095Ù\u008f\u001c\u000enÏ\u0095 {¸¨ù«\u009b'ù^ý+\u0097K=^r©%¢}\u007fu\rh\u0098¤Óµ\u0080E\u009e)á×º¢×:Ea÷¡¦¤kÙ\u00838hOkWh¼^÷ÚÌ°Ãä\u0000êæÉã\u00193Ùê¬ñ}¿³\u0010¶ì\u0004\u0088è¿\u001aÁ+w \u00809à\u009bÉ¼¤ÈwåþD\u0014Î×lË{\u009e:ê¬Ì:\u008d\b\u0002Uu2í,\u000f»$\u0081õCR\fêK \u0081Å.Á¸(\\Ûx"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
l = var6;
m = new Integer[24];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Ù\u0017[ÐÍ\u0098\u0082bÕøf²§ý\u00882";
var5 = "Ù\u0017[ÐÍ\u0098\u0082bÕøf²§ý\u00882".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "\\Ýf4êH\u0082^ ²aËá \u0002\u0093Ü¸-\u000e.»ÑÓ\u000b¶\u0006ò´{Ù7Ê¨è[f÷¯à(uß÷,Zmõ\u0005ìñûý»S¬ú`Æ¥ÿP\u0003ÜÀdÏêË°6\u00887\u008cô\u0097ßJ\u008eox";
var19 = "\\Ýf4êH\u0082^ ²aËá \u0002\u0093Ü¸-\u000e.»ÑÓ\u000b¶\u0006ò´{Ù7Ê¨è[f÷¯à(uß÷,Zmõ\u0005ìñûý»S¬ú`Æ¥ÿP\u0003ÜÀdÏêË°6\u00887\u008cô\u0097ßJ\u008eox"
.length();
var16 = '(';
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9797;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/gp", var10);
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
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/gp" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13852;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/gp", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
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
throw new RuntimeException("su/catlean/gp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
