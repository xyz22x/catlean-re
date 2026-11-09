package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class rb {
private static final double h = 0.05;
private static final double U = 0.95;
private static final double b = 0.5;
@NotNull
private static final Map l;
@NotNull
private static final List E;
private static boolean N;
private static final long a = yz.a(-181175479539052100L, 3244234991542762975L, MethodHandles.lookup().lookupClass()).a(140063211212728L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map i;

@NotNull
public static final Map W() {
return l;
}

@NotNull
public static final List N() {
return E;
}

@Nullable
public static final mm q(@NotNull ux $this$calcPosition, long a, @NotNull gp configState) {
ax = a ^ ax;
long var4 = ax ^ 137890815064519L;
long var6 = ax ^ 61102753187219L;
Intrinsics.checkNotNullParameter($this$calcPosition, a<"i">(672, 3154676996142204407L ^ ax));
Intrinsics.checkNotNullParameter(configState, a<"i">(14059, 7741706163646640549L ^ ax));
boolean var9 = false;
long var10 = zf.A();
boolean var12 = false;
Pair var8 = TuplesKt.to(
ot.W(var4, configState, W($this$calcPosition, configState, false, false, var6, b<"j">(3350, 9047693804052527659L ^ ax), null)), zf.A() - var10
);
mm var14 = (mm)var8.component1();
var10 = ((Number)var8.component2()).longValue();
$this$calcPosition.I(var10);
return var14;
}

@Nullable
public static final class_3965 N(@NotNull ux $this$calcBasePosition, boolean onlyNoPositions, long a, boolean sponges) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 119381095225204
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 130793567705378
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 66051051376398
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w 1361325957796789337
// 020: lload 2
// 021: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: aload 0
// 027: sipush 13172
// 02a: ldc2_w 8273417687471594136
// 02d: lload 2
// 02e: lxor
// 02f: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 037: istore 11
// 039: fconst_0
// 03a: fstore 12
// 03c: fconst_0
// 03d: fstore 13
// 03f: aload 0
// 040: lload 7
// 042: invokevirtual su/catlean/ux.L (J)Lsu/catlean/gp;
// 045: astore 14
// 047: iload 11
// 049: ifne 086
// 04c: lload 5
// 04e: aload 14
// 050: aload 0
// 051: aload 14
// 053: lload 9
// 055: bipush 0
// 056: iload 4
// 058: invokestatic su/catlean/rb.h (Lsu/catlean/ux;Lsu/catlean/gp;JZZ)Ljava/util/List;
// 05b: invokestatic su/catlean/ot.W (JLsu/catlean/gp;Ljava/util/List;)Lsu/catlean/mm;
// 05e: dup
// 05f: ifnull 085
// 062: goto 06f
// 065: ldc2_w 1352242411977787277
// 068: lload 2
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: astore 16
// 071: aload 16
// 073: astore 17
// 075: bipush 0
// 076: istore 18
// 078: aload 17
// 07a: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 07d: invokevirtual su/catlean/t_.c ()F
// 080: fstore 13
// 082: goto 087
// 085: pop
// 086: nop
// 087: iload 1
// 088: iload 11
// 08a: lload 2
// 08b: lconst_0
// 08c: lcmp
// 08d: iflt 0b6
// 090: ifne 0b4
// 093: ifeq 0dd
// 096: goto 0a3
// 099: ldc2_w 1352242411977787277
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: fload 13
// 0a5: fconst_0
// 0a6: fcmpg
// 0a7: goto 0b4
// 0aa: ldc2_w 1352242411977787277
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: iload 11
// 0b6: ifne 0ca
// 0b9: ifne 0cd
// 0bc: goto 0c9
// 0bf: ldc2_w 1352242411977787277
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: bipush 1
// 0ca: goto 0ce
// 0cd: bipush 0
// 0ce: ifne 0dd
// 0d1: aconst_null
// 0d2: areturn
// 0d3: ldc2_w 1352242411977787277
// 0d6: lload 2
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: lload 5
// 0df: aload 14
// 0e1: aload 0
// 0e2: aload 14
// 0e4: lload 9
// 0e6: bipush 1
// 0e7: iload 4
// 0e9: invokestatic su/catlean/rb.h (Lsu/catlean/ux;Lsu/catlean/gp;JZZ)Ljava/util/List;
// 0ec: invokestatic su/catlean/ot.W (JLsu/catlean/gp;Ljava/util/List;)Lsu/catlean/mm;
// 0ef: dup
// 0f0: ifnull 111
// 0f3: astore 18
// 0f5: aload 18
// 0f7: astore 19
// 0f9: bipush 0
// 0fa: istore 20
// 0fc: aload 19
// 0fe: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 101: invokevirtual su/catlean/t_.c ()F
// 104: fstore 12
// 106: aload 18
// 108: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 10b: checkcast net/minecraft/class_3965
// 10e: goto 113
// 111: pop
// 112: aconst_null
// 113: astore 15
// 115: fload 12
// 117: iload 11
// 119: ifne 15c
// 11c: aload 0
// 11d: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 120: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 123: checkcast su/catlean/mm
// 126: dup
// 127: ifnull 15b
// 12a: goto 137
// 12d: ldc2_w 1352242411977787277
// 130: lload 2
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 13a: dup
// 13b: ifnull 15b
// 13e: goto 14b
// 141: ldc2_w 1352242411977787277
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: invokevirtual su/catlean/t_.c ()F
// 14e: goto 15d
// 151: ldc2_w 1352242411977787277
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: pop
// 15c: fconst_0
// 15d: fcmpg
// 15e: iload 11
// 160: lload 2
// 161: lconst_0
// 162: lcmp
// 163: ifle 193
// 166: ifne 18b
// 169: ifle 1c0
// 16c: goto 179
// 16f: ldc2_w 1352242411977787277
// 172: lload 2
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: fload 13
// 17b: fload 12
// 17d: fcmpl
// 17e: goto 18b
// 181: ldc2_w 1352242411977787277
// 184: lload 2
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: lload 2
// 18c: lconst_0
// 18d: lcmp
// 18e: ifle 1bd
// 191: iload 11
// 193: ifne 1bd
// 196: ifge 1c0
// 199: goto 1a6
// 19c: ldc2_w 1352242411977787277
// 19f: lload 2
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: fload 12
// 1a8: fload 13
// 1aa: fsub
// 1ab: invokestatic java/lang/Math.abs (F)F
// 1ae: fconst_1
// 1af: fcmpg
// 1b0: goto 1bd
// 1b3: ldc2_w 1352242411977787277
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: ifgt 1cc
// 1c0: aconst_null
// 1c1: areturn
// 1c2: ldc2_w 1352242411977787277
// 1c5: lload 2
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: aload 15
// 1ce: areturn
}

// $VF: Irreducible bytecode was duplicated to produce valid code
private static final List h(ux var0, gp var1, long var2, boolean var4, boolean var5) {
var2 = a ^ var2;
long var6 = var2 ^ 64964668675095L;
long var8 = var2 ^ 1806217246059L;
long var10001 = var2 ^ 99854087012007L;
int var10 = (int)((var2 ^ 99854087012007L) >>> 48);
int var11 = (int)((var2 ^ 99854087012007L) << 16 >>> 32);
int var12 = (int)(var10001 << 48 >>> 48);
class_2338 var10000 = class_2338.method_49638((class_2374)zf.v(var8).method_33571());
Intrinsics.checkNotNullExpressionValue(var10000, a<"i">(16755, 1153428070176316736L ^ var2));
class_2338 var19 = var10000;
class_243 var20 = lo.k.w(var6, (class_1657)zf.v(var8), 1);
int var21 = (int)((float)Math.ceil(var1.M()));
IntRange var22 = new IntRange(var19.method_10263() - var21, var19.method_10263() + var21);
byte var62 = vm.a<"Å">(2823246505709259155L, var2);
IntRange var23 = new IntRange(var19.method_10264() - var21, var19.method_10264() + var21);
IntRange var24 = new IntRange(var19.method_10260() - var21, var19.method_10260() + var21);
byte var18 = var62;
Iterable var25 = var22;
boolean var26 = false;
Collection var28 = new ArrayList();
boolean var29 = false;
Iterator var30 = var25.iterator();

label69:
while (true) {
Iterator var63 = var30;

label66:
while (true) {
if (var63.hasNext()) {
int var31 = ((IntIterator)var30).nextInt();
int var32 = var31;
boolean var33 = false;
Iterable var34 = var23;
boolean var35 = false;
ArrayList var64 = new ArrayList();
if (var2 < 0L) {
return var64;
}

var10000 = var64;
if (var18 != 0) {
break;
}

Object var37 = var10000;
boolean var38 = false;
Iterator var39 = var34.iterator();

label61:
while (true) {
if (var39.hasNext()) {
var66 = ((IntIterator)var39).nextInt();
} else {
var var59 = (Iterable & List)var37;
CollectionsKt.addAll(var28, var59);
var66 = var18;
if (var2 >= 0L) {
break;
}
}

while (true) {
int var40 = var66;
int var41 = var40;
boolean var42 = false;
Iterable var43 = var24;
boolean var44 = false;
var var46 = new ArrayList();
boolean var47 = false;
boolean var49 = false;
var63 = var43.iterator();
if (var18 != 0) {
continue label66;
}

Iterator var50 = var63;

while (true) {
if (!var50.hasNext()) {
if (var2 >= 0L) {
}
break;
}

int var51 = ((IntIterator)var50).nextInt();
boolean var53 = false;
boolean var55 = false;
if (var18 != 0) {
break;
}

class_2338 var17 = new class_2338(var32, var41, var51);
mm var67 = z(var0, (short)var10, var17, var11, var20, var1, (short)var12, var4, var5);
if (var67 != null) {
mm var56 = var67;
boolean var57 = false;
var46.add(var56);
}

if (var18 != 0) {
if (var2 >= 0L) {
}
break;
}
}

var var58 = var46;
CollectionsKt.addAll((Collection)var37, var58);
if (var18 == 0) {
break;
}

var var61 = (Iterable & List)var37;
CollectionsKt.addAll(var28, var61);
var66 = var18;
if (var2 >= 0L) {
break label61;
}
}
}

if (var66 == 0) {
continue label69;
}
}

var10000 = var28;
if (var2 > 0L) {
}
break;
}

return (List)var10000;
}
}

static List W(ux var0, gp var1, boolean var2, boolean var3, long var4, int var6, Object var7) {
var4 = a ^ var4;
long var8 = var4 ^ 122508958998250L;
boolean var10 = vm.a<"Å">(-4395454104907731523L, var4);

int var10000;
label37: {
label36: {
try {
var10000 = var6 & 2;
if (var10) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoSuchElementException var12) {
throw vm.a<"Å">(var12, -4386380459535722903L, var4);
}

var2 = false;
}

var10000 = var6 & 4;
}

label27: {
try {
if (var10) {
break label27;
}

if (var10000 == 0) {
return h(var0, var1, var8, var2, (boolean)var3);
}
} catch (NoSuchElementException var11) {
throw vm.a<"Å">(var11, -4386380459535722903L, var4);
}

var10000 = 0;
}

var3 = var10000;
return h(var0, var1, var8, var2, (boolean)var3);
}

@Nullable
public static final mm z(
@NotNull ux $this$getPlaceData,
short a,
@NotNull class_2338 bp,
int a,
@NotNull class_243 predictedPlayerPos,
@NotNull gp configState,
short a,
boolean basePlace,
boolean sponges
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 6
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/rb.a J
// 01b: lxor
// 01c: lstore 9
// 01e: lload 9
// 020: dup2
// 021: ldc2_w 84841514184969
// 024: lxor
// 025: dup2
// 026: bipush 56
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 8
// 02f: lshl
// 030: bipush 8
// 032: lushr
// 033: lstore 12
// 035: pop2
// 036: dup2
// 037: ldc2_w 58944123093231
// 03a: lxor
// 03b: lstore 14
// 03d: dup2
// 03e: ldc2_w 111242660931449
// 041: lxor
// 042: lstore 16
// 044: dup2
// 045: ldc2_w 76598718304626
// 048: lxor
// 049: dup2
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 18
// 050: dup2
// 051: bipush 16
// 053: lshl
// 054: bipush 16
// 056: lushr
// 057: lstore 19
// 059: pop2
// 05a: dup2
// 05b: ldc2_w 110632517549341
// 05e: lxor
// 05f: dup2
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 21
// 066: dup2
// 067: bipush 32
// 069: lshl
// 06a: bipush 48
// 06c: lushr
// 06d: l2i
// 06e: istore 22
// 070: dup2
// 071: bipush 48
// 073: lshl
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 23
// 07a: pop2
// 07b: dup2
// 07c: ldc2_w 138662459428843
// 07f: lxor
// 080: dup2
// 081: bipush 32
// 083: lushr
// 084: l2i
// 085: istore 24
// 087: dup2
// 088: bipush 32
// 08a: lshl
// 08b: bipush 32
// 08d: lushr
// 08e: l2i
// 08f: istore 25
// 091: pop2
// 092: dup2
// 093: ldc2_w 15188047097504
// 096: lxor
// 097: lstore 26
// 099: dup2
// 09a: ldc2_w 48875671064495
// 09d: lxor
// 09e: lstore 28
// 0a0: dup2
// 0a1: ldc2_w 82421778079319
// 0a4: lxor
// 0a5: lstore 30
// 0a7: dup2
// 0a8: ldc2_w 28887158385556
// 0ab: lxor
// 0ac: lstore 32
// 0ae: dup2
// 0af: ldc2_w 121834545431785
// 0b2: lxor
// 0b3: lstore 34
// 0b5: pop2
// 0b6: ldc2_w -2067996115480343056
// 0b9: lload 9
// 0bb: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: aload 0
// 0c1: sipush 13172
// 0c4: ldc2_w 8273520772626737969
// 0c7: lload 9
// 0c9: lxor
// 0ca: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d2: aload 2
// 0d3: sipush 13102
// 0d6: ldc2_w 8955292248537918328
// 0d9: lload 9
// 0db: lxor
// 0dc: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0e4: istore 42
// 0e6: aload 4
// 0e8: sipush 28698
// 0eb: ldc2_w 2182915503418058844
// 0ee: lload 9
// 0f0: lxor
// 0f1: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0f9: aload 5
// 0fb: sipush 28581
// 0fe: ldc2_w 4617940382924257259
// 101: lload 9
// 103: lxor
// 104: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10c: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 10f: lload 26
// 111: aload 2
// 112: invokevirtual su/catlean/yk.z (JLnet/minecraft/class_2338;)Z
// 115: iload 42
// 117: ifne 13d
// 11a: ifeq 138
// 11d: goto 12b
// 120: ldc2_w -2058910785698941404
// 123: lload 9
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: aconst_null
// 12c: areturn
// 12d: ldc2_w -2058910785698941404
// 130: lload 9
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 5
// 13a: invokevirtual su/catlean/gp.n ()Z
// 13d: iload 42
// 13f: ifne 1ba
// 142: ifeq 193
// 145: goto 153
// 148: ldc2_w -2058910785698941404
// 14b: lload 9
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: lload 32
// 155: aload 2
// 156: aload 5
// 158: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 15b: invokestatic su/catlean/rb.L (JLnet/minecraft/class_2338;Lnet/minecraft/class_1657;)Z
// 15e: iload 1
// 15f: iflt 1ba
// 162: iload 42
// 164: ifne 1ba
// 167: goto 175
// 16a: ldc2_w -2058910785698941404
// 16d: lload 9
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: ifeq 193
// 178: goto 186
// 17b: ldc2_w -2058910785698941404
// 17e: lload 9
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: aconst_null
// 187: areturn
// 188: ldc2_w -2058910785698941404
// 18b: lload 9
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: aload 0
// 194: aload 5
// 196: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 199: iload 11
// 19b: i2b
// 19c: swap
// 19d: lload 12
// 19f: dup2_x1
// 1a0: pop2
// 1a1: checkcast net/minecraft/class_1297
// 1a4: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1a7: aload 2
// 1a8: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1ab: dconst_0
// 1ac: ldc2_w 0.5
// 1af: dconst_0
// 1b0: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1b3: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1b6: ldc2_w 12.0
// 1b9: dcmpl
// 1ba: ifle 1ca
// 1bd: aconst_null
// 1be: areturn
// 1bf: ldc2_w -2058910785698941404
// 1c2: lload 9
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: lload 28
// 1cc: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1cf: aload 2
// 1d0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1d3: dup
// 1d4: sipush 15416
// 1d7: ldc2_w 5258554887421748340
// 1da: lload 9
// 1dc: lxor
// 1dd: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e5: astore 43
// 1e7: aload 43
// 1e9: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1ec: dup
// 1ed: sipush 31434
// 1f0: ldc2_w 227605200259588746
// 1f3: lload 9
// 1f5: lxor
// 1f6: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1fe: astore 44
// 200: aload 44
// 202: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 205: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 208: iload 42
// 20a: ifne 283
// 20d: ifne 281
// 210: goto 21e
// 213: ldc2_w -2058910785698941404
// 216: lload 9
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: aload 44
// 220: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 223: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 226: iload 42
// 228: ifne 283
// 22b: goto 239
// 22e: ldc2_w -2058910785698941404
// 231: lload 9
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: ifne 281
// 23c: goto 24a
// 23f: ldc2_w -2058910785698941404
// 242: lload 9
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: iload 7
// 24c: iload 42
// 24e: iload 3
// 24f: ifle 285
// 252: ifne 283
// 255: goto 263
// 258: ldc2_w -2058910785698941404
// 25b: lload 9
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: ifne 281
// 266: goto 274
// 269: ldc2_w -2058910785698941404
// 26c: lload 9
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: aconst_null
// 275: areturn
// 276: ldc2_w -2058910785698941404
// 279: lload 9
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: iload 7
// 283: iload 42
// 285: ifne 2d5
// 288: ifeq 2d3
// 28b: goto 299
// 28e: ldc2_w -2058910785698941404
// 291: lload 9
// 293: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 298: athrow
// 299: aload 43
// 29b: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 29e: iload 42
// 2a0: iload 1
// 2a1: iflt 2db
// 2a4: ifne 2d5
// 2a7: goto 2b5
// 2aa: ldc2_w -2058910785698941404
// 2ad: lload 9
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: ifne 2d3
// 2b8: goto 2c6
// 2bb: ldc2_w -2058910785698941404
// 2be: lload 9
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: aconst_null
// 2c7: areturn
// 2c8: ldc2_w -2058910785698941404
// 2cb: lload 9
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: iload 7
// 2d5: iload 3
// 2d6: ifle 306
// 2d9: iload 42
// 2db: ifne 306
// 2de: ifeq 316
// 2e1: goto 2ef
// 2e4: ldc2_w -2058910785698941404
// 2e7: lload 9
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: getstatic su/catlean/_5.t Lsu/catlean/_5;
// 2f2: aload 2
// 2f3: lload 34
// 2f5: invokevirtual su/catlean/_5.Z (Lnet/minecraft/class_2338;J)Z
// 2f8: goto 306
// 2fb: ldc2_w -2058910785698941404
// 2fe: lload 9
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: ifne 316
// 309: aconst_null
// 30a: areturn
// 30b: ldc2_w -2058910785698941404
// 30e: lload 9
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: lload 28
// 318: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 31b: aload 2
// 31c: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 31f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 322: dup
// 323: sipush 13030
// 326: ldc2_w 6457447288202259127
// 329: lload 9
// 32b: lxor
// 32c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 331: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 334: astore 45
// 336: bipush 0
// 337: istore 46
// 339: aload 5
// 33b: invokevirtual su/catlean/gp.O ()Z
// 33e: iload 42
// 340: ifne 50e
// 343: ifeq 509
// 346: goto 354
// 349: ldc2_w -2058910785698941404
// 34c: lload 9
// 34e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: athrow
// 354: aload 45
// 356: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 359: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
// 35c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 35f: iload 42
// 361: iload 1
// 362: iflt 3a2
// 365: ifne 3a0
// 368: goto 376
// 36b: ldc2_w -2058910785698941404
// 36e: lload 9
// 370: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 375: athrow
// 376: ifne 423
// 379: goto 387
// 37c: ldc2_w -2058910785698941404
// 37f: lload 9
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: aload 45
// 389: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 38c: getstatic net/minecraft/class_2246.field_10589 Lnet/minecraft/class_2248;
// 38f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 392: goto 3a0
// 395: ldc2_w -2058910785698941404
// 398: lload 9
// 39a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39f: athrow
// 3a0: iload 42
// 3a2: iload 6
// 3a4: ifge 3d6
// 3a7: ifne 3d4
// 3aa: ifne 423
// 3ad: goto 3bb
// 3b0: ldc2_w -2058910785698941404
// 3b3: lload 9
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: aload 45
// 3bd: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 3c0: getstatic net/minecraft/class_2246.field_10091 Lnet/minecraft/class_2248;
// 3c3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3c6: goto 3d4
// 3c9: ldc2_w -2058910785698941404
// 3cc: lload 9
// 3ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: athrow
// 3d4: iload 42
// 3d6: iload 6
// 3d8: ifgt 40a
// 3db: ifne 408
// 3de: ifne 423
// 3e1: goto 3ef
// 3e4: ldc2_w -2058910785698941404
// 3e7: lload 9
// 3e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ee: athrow
// 3ef: aload 45
// 3f1: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 3f4: getstatic net/minecraft/class_2246.field_10336 Lnet/minecraft/class_2248;
// 3f7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3fa: goto 408
// 3fd: ldc2_w -2058910785698941404
// 400: lload 9
// 402: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 407: athrow
// 408: iload 42
// 40a: iload 6
// 40c: ifge 510
// 40f: ifne 50e
// 412: ifeq 509
// 415: goto 423
// 418: ldc2_w -2058910785698941404
// 41b: lload 9
// 41d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 422: athrow
// 423: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 426: bipush 1
// 427: anewarray 974
// 42a: astore 48
// 42c: aload 48
// 42e: bipush 0
// 42f: getstatic net/minecraft/class_1802.field_8276 Lnet/minecraft/class_1792;
// 432: dup
// 433: sipush 11972
// 436: ldc2_w 7437490969014302336
// 439: lload 9
// 43b: lxor
// 43c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 444: aastore
// 445: iload 21
// 447: aload 48
// 449: iload 22
// 44b: iload 23
// 44d: i2c
// 44e: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 451: astore 47
// 453: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 456: bipush 1
// 457: anewarray 974
// 45a: astore 49
// 45c: aload 49
// 45e: bipush 0
// 45f: getstatic net/minecraft/class_1802.field_8725 Lnet/minecraft/class_1792;
// 462: dup
// 463: sipush 4307
// 466: ldc2_w 2375088845700843675
// 469: lload 9
// 46b: lxor
// 46c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 471: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 474: aastore
// 475: iload 21
// 477: aload 49
// 479: iload 22
// 47b: iload 23
// 47d: i2c
// 47e: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 481: astore 48
// 483: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 486: bipush 1
// 487: anewarray 974
// 48a: astore 50
// 48c: aload 50
// 48e: bipush 0
// 48f: getstatic net/minecraft/class_1802.field_8810 Lnet/minecraft/class_1792;
// 492: dup
// 493: sipush 30898
// 496: ldc2_w 4799544530492629245
// 499: lload 9
// 49b: lxor
// 49c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4a4: aastore
// 4a5: iload 21
// 4a7: aload 50
// 4a9: iload 22
// 4ab: iload 23
// 4ad: i2c
// 4ae: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 4b1: astore 49
// 4b3: aload 47
// 4b5: invokevirtual su/catlean/fg.R ()Z
// 4b8: iload 42
// 4ba: ifne 4f6
// 4bd: ifeq 4de
// 4c0: goto 4ce
// 4c3: ldc2_w -2058910785698941404
// 4c6: lload 9
// 4c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cd: athrow
// 4ce: aload 47
// 4d0: goto 500
// 4d3: ldc2_w -2058910785698941404
// 4d6: lload 9
// 4d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4dd: athrow
// 4de: aload 48
// 4e0: iload 42
// 4e2: ifne 4fb
// 4e5: invokevirtual su/catlean/fg.R ()Z
// 4e8: goto 4f6
// 4eb: ldc2_w -2058910785698941404
// 4ee: lload 9
// 4f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f5: athrow
// 4f6: ifeq 4fe
// 4f9: aload 48
// 4fb: goto 500
// 4fe: aload 49
// 500: astore 50
// 502: aload 50
// 504: invokevirtual su/catlean/fg.R ()Z
// 507: istore 46
// 509: aload 45
// 50b: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 50e: iload 42
// 510: ifne 5e5
// 513: ifne 5e4
// 516: goto 524
// 519: ldc2_w -2058910785698941404
// 51c: lload 9
// 51e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 523: athrow
// 524: aload 45
// 526: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 529: getstatic net/minecraft/class_2246.field_10036 Lnet/minecraft/class_2248;
// 52c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 52f: iload 42
// 531: iload 3
// 532: ifle 584
// 535: ifne 582
// 538: goto 546
// 53b: ldc2_w -2058910785698941404
// 53e: lload 9
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: ifeq 580
// 549: goto 557
// 54c: ldc2_w -2058910785698941404
// 54f: lload 9
// 551: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 556: athrow
// 557: aload 5
// 559: invokevirtual su/catlean/gp.T ()Z
// 55c: iload 42
// 55e: ifne 5e5
// 561: goto 56f
// 564: ldc2_w -2058910785698941404
// 567: lload 9
// 569: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56e: athrow
// 56f: ifne 5e4
// 572: goto 580
// 575: ldc2_w -2058910785698941404
// 578: lload 9
// 57a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57f: athrow
// 580: iload 8
// 582: iload 42
// 584: iload 6
// 586: ifge 5d0
// 589: ifne 5ce
// 58c: ifeq 5cc
// 58f: goto 59d
// 592: ldc2_w -2058910785698941404
// 595: lload 9
// 597: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59c: athrow
// 59d: aload 45
// 59f: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 5a2: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
// 5a5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5a8: iload 42
// 5aa: ifne 5e5
// 5ad: goto 5bb
// 5b0: ldc2_w -2058910785698941404
// 5b3: lload 9
// 5b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ba: athrow
// 5bb: ifne 5e4
// 5be: goto 5cc
// 5c1: ldc2_w -2058910785698941404
// 5c4: lload 9
// 5c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5cb: athrow
// 5cc: iload 46
// 5ce: iload 42
// 5d0: ifne 5e5
// 5d3: ifeq 5e8
// 5d6: goto 5e4
// 5d9: ldc2_w -2058910785698941404
// 5dc: lload 9
// 5de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e3: athrow
// 5e4: bipush 1
// 5e5: goto 5e9
// 5e8: bipush 0
// 5e9: istore 47
// 5eb: iload 47
// 5ed: iload 42
// 5ef: iload 6
// 5f1: ifge 61d
// 5f4: ifne 61b
// 5f7: ifeq 666
// 5fa: goto 608
// 5fd: ldc2_w -2058910785698941404
// 600: lload 9
// 602: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 607: athrow
// 608: aload 5
// 60a: invokevirtual su/catlean/gp.e ()Z
// 60d: goto 61b
// 610: ldc2_w -2058910785698941404
// 613: lload 9
// 615: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61a: athrow
// 61b: iload 42
// 61d: ifne 692
// 620: ifeq 673
// 623: goto 631
// 626: ldc2_w -2058910785698941404
// 629: lload 9
// 62b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 630: athrow
// 631: lload 28
// 633: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 636: aload 2
// 637: bipush 2
// 638: invokevirtual net/minecraft/class_2338.method_10086 (I)Lnet/minecraft/class_2338;
// 63b: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 63e: iload 1
// 63f: iflt 692
// 642: iload 42
// 644: ifne 692
// 647: goto 655
// 64a: ldc2_w -2058910785698941404
// 64d: lload 9
// 64f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 654: athrow
// 655: ifne 673
// 658: goto 666
// 65b: ldc2_w -2058910785698941404
// 65e: lload 9
// 660: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 665: athrow
// 666: aconst_null
// 667: areturn
// 668: ldc2_w -2058910785698941404
// 66b: lload 9
// 66d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 672: athrow
// 673: aload 0
// 674: aload 2
// 675: iload 42
// 677: iload 1
// 678: iflt 67f
// 67b: ifne 6a4
// 67e: bipush 1
// 67f: aload 5
// 681: astore 36
// 683: istore 37
// 685: astore 38
// 687: lload 14
// 689: aload 38
// 68b: iload 37
// 68d: aload 36
// 68f: invokestatic su/catlean/rb.a (Lsu/catlean/ux;JLnet/minecraft/class_2338;ZLsu/catlean/gp;)Z
// 692: ifeq 6a2
// 695: aconst_null
// 696: areturn
// 697: ldc2_w -2058910785698941404
// 69a: lload 9
// 69c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a1: athrow
// 6a2: aload 0
// 6a3: aload 2
// 6a4: aload 5
// 6a6: bipush 0
// 6a7: bipush 1
// 6a8: iload 7
// 6aa: istore 36
// 6ac: istore 37
// 6ae: istore 38
// 6b0: astore 39
// 6b2: astore 40
// 6b4: astore 41
// 6b6: iload 1
// 6b7: iflt 6d3
// 6ba: iload 18
// 6bc: i2s
// 6bd: aload 41
// 6bf: aload 40
// 6c1: lload 19
// 6c3: aload 39
// 6c5: iload 38
// 6c7: iload 37
// 6c9: iload 36
// 6cb: invokestatic su/catlean/ot.e (SLsu/catlean/ux;Lnet/minecraft/class_2338;JLsu/catlean/gp;ZZZ)Lsu/catlean/t_;
// 6ce: dup
// 6cf: ifnonnull 6e0
// 6d2: pop
// 6d3: aconst_null
// 6d4: areturn
// 6d5: ldc2_w -2058910785698941404
// 6d8: lload 9
// 6da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6df: athrow
// 6e0: astore 48
// 6e2: iload 42
// 6e4: iload 3
// 6e5: iflt 6ed
// 6e8: ifne 718
// 6eb: iload 24
// 6ed: aload 2
// 6ee: aload 5
// 6f0: iload 25
// 6f2: iload 7
// 6f4: invokestatic su/catlean/rb.D (ILnet/minecraft/class_2338;Lsu/catlean/gp;IZ)Lnet/minecraft/class_3965;
// 6f7: dup
// 6f8: ifnonnull 71a
// 6fb: goto 709
// 6fe: ldc2_w -2058910785698941404
// 701: lload 9
// 703: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 708: athrow
// 709: pop
// 70a: goto 718
// 70d: ldc2_w -2058910785698941404
// 710: lload 9
// 712: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 717: athrow
// 718: aconst_null
// 719: areturn
// 71a: astore 49
// 71c: aload 49
// 71e: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 721: dup
// 722: sipush 521
// 725: ldc2_w 8959533839977994816
// 728: lload 9
// 72a: lxor
// 72b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 730: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 733: lload 16
// 735: aload 2
// 736: aload 4
// 738: aload 5
// 73a: invokestatic su/catlean/rb.w (Lnet/minecraft/class_243;JLnet/minecraft/class_2338;Lnet/minecraft/class_243;Lsu/catlean/gp;)Z
// 73d: ifne 74d
// 740: aconst_null
// 741: areturn
// 742: ldc2_w -2058910785698941404
// 745: lload 9
// 747: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74c: athrow
// 74d: new su/catlean/mm
// 750: dup
// 751: aload 49
// 753: lload 30
// 755: aload 48
// 757: invokespecial su/catlean/mm.<init> (Ljava/lang/Object;JLsu/catlean/t_;)V
// 75a: areturn
}

public static mm U(ux var0, class_2338 var1, long var2, class_243 var4, gp var5, boolean var6, boolean var7, int var8, Object var9) {
var2 = a ^ var2;
long var10001 = var2 ^ 78240960013558L;
int var10 = (int)((var2 ^ 78240960013558L) >>> 48);
int var11 = (int)((var2 ^ 78240960013558L) << 16 >>> 32);
int var12 = (int)(var10001 << 48 >>> 48);
boolean var13 = vm.a<"Å">(9056209784625859056L, var2);

int var10000;
label37: {
label36: {
try {
var10000 = var8 & b<"j">(7646, 1691391838674414532L ^ var2);
if (!var13) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoSuchElementException var15) {
throw vm.a<"Å">(var15, 9034068798787954710L, var2);
}

var6 = false;
}

var10000 = var8 & b<"j">(12238, 6273464189327104465L ^ var2);
}

label27: {
try {
if (!var13) {
break label27;
}

if (var10000 == 0) {
return z(var0, (short)var10, var1, var11, var4, var5, (short)var12, var6, (boolean)var7);
}
} catch (NoSuchElementException var14) {
throw vm.a<"Å">(var14, 9034068798787954710L, var2);
}

var10000 = 0;
}

var7 = var10000;
return z(var0, (short)var10, var1, var11, var4, var5, (short)var12, var6, (boolean)var7);
}

@Nullable
public static final class_3965 D(int a, @NotNull class_2338 bp, @NotNull gp configState, int a, boolean basePlace) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 0
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/rb.a J
// 11: lxor
// 12: lstore 5
// 14: lload 5
// 16: dup2
// 17: ldc2_w 8200281328223
// 1a: lxor
// 1b: lstore 7
// 1d: dup2
// 1e: ldc2_w 68866561157866
// 21: lxor
// 22: lstore 9
// 24: pop2
// 25: ldc2_w -2975991064226618643
// 28: lload 5
// 2a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 11
// 31: aload 1
// 32: iload 11
// 34: ifeq 87
// 37: sipush 13102
// 3a: ldc2_w 8955299934449000023
// 3d: lload 5
// 3f: lxor
// 40: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 48: aload 2
// 49: sipush 28581
// 4c: ldc2_w 4617934827451155140
// 4f: lload 5
// 51: lxor
// 52: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 5a: aload 2
// 5b: invokevirtual su/catlean/gp.r ()Z
// 5e: ifeq 86
// 61: goto 6f
// 64: ldc2_w -3007757484091669749
// 67: lload 5
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: aload 1
// 70: lload 9
// 72: aload 2
// 73: iload 4
// 75: invokestatic su/catlean/rb.L (Lnet/minecraft/class_2338;JLsu/catlean/gp;Z)Lnet/minecraft/class_3965;
// 78: goto 8d
// 7b: ldc2_w -3007757484091669749
// 7e: lload 5
// 80: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: athrow
// 86: aload 1
// 87: lload 7
// 89: aload 2
// 8a: invokestatic su/catlean/rb.r (Lnet/minecraft/class_2338;JLsu/catlean/gp;)Lnet/minecraft/class_3965;
// 8d: areturn
}

public static class_3965 f(char var0, class_2338 var1, int var2, gp var3, short var4, boolean var5, int var6, Object var7) {
long var8 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
int var10 = (int)((var8 ^ 18153519534358L) >>> 32);
int var11 = (int)((var8 ^ 18153519534358L) << 32 >>> 32);
boolean var12 = vm.a<"Å">(-166511264047164659L, var8);

int var10000;
label20: {
try {
var10000 = var6 & 4;
if (var12) {
break label20;
}

if (var10000 == 0) {
return D(var10, var1, var3, var11, (boolean)var5);
}
} catch (NoSuchElementException var13) {
throw vm.a<"Å">(var13, -175595224313648935L, var8);
}

var10000 = 0;
}

var5 = var10000;
return D(var10, var1, var3, var11, (boolean)var5);
}

private static final class_3965 r(class_2338 param0, long param1, gp param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 103314408339407
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 42582019524122
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 6
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 7
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 8
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 93571658762779
// 043: lxor
// 044: lstore 9
// 046: dup2
// 047: ldc2_w 76767087952534
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 11
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 12
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 13
// 066: pop2
// 067: dup2
// 068: ldc2_w 57433467019746
// 06b: lxor
// 06c: lstore 14
// 06e: dup2
// 06f: ldc2_w 95714811475132
// 072: lxor
// 073: lstore 16
// 075: pop2
// 076: aload 3
// 077: invokevirtual su/catlean/gp.M ()F
// 07a: fstore 20
// 07c: ldc2_w -6414963064125241276
// 07f: lload 1
// 080: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: aconst_null
// 086: astore 21
// 088: istore 19
// 08a: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 08d: lload 14
// 08f: invokevirtual su/catlean/_a.f (J)Z
// 092: iload 19
// 094: ifne 0bb
// 097: ifeq 0be
// 09a: goto 0a7
// 09d: ldc2_w -6424034239892032624
// 0a0: lload 1
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: aload 0
// 0a8: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0ab: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0ae: goto 0bb
// 0b1: ldc2_w -6424034239892032624
// 0b4: lload 1
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: goto 0c2
// 0be: aload 0
// 0bf: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0c2: istore 22
// 0c4: lload 16
// 0c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c9: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0cc: getfield net/minecraft/class_243.field_1351 D
// 0cf: iload 22
// 0d1: i2d
// 0d2: dcmpl
// 0d3: iload 19
// 0d5: ifne 2bb
// 0d8: ifle 2aa
// 0db: goto 0e8
// 0de: ldc2_w -6424034239892032624
// 0e1: lload 1
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: getstatic su/catlean/rb.E Ljava/util/List;
// 0eb: checkcast java/lang/Iterable
// 0ee: astore 24
// 0f0: bipush 0
// 0f1: istore 25
// 0f3: aload 24
// 0f5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0fa: astore 26
// 0fc: aload 26
// 0fe: iload 19
// 100: ifne 131
// 103: invokeinterface java/util/Iterator.hasNext ()Z 1
// 108: ifne 12a
// 10b: goto 118
// 10e: ldc2_w -6424034239892032624
// 111: lload 1
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: new java/util/NoSuchElementException
// 11b: dup
// 11c: invokespecial java/util/NoSuchElementException.<init> ()V
// 11f: athrow
// 120: ldc2_w -6424034239892032624
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: aload 26
// 12c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 131: astore 27
// 133: aload 26
// 135: iload 19
// 137: ifne 160
// 13a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 13f: ifne 15e
// 142: goto 14f
// 145: ldc2_w -6424034239892032624
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 27
// 151: goto 222
// 154: ldc2_w -6424034239892032624
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aload 27
// 160: checkcast net/minecraft/class_243
// 163: astore 28
// 165: bipush 0
// 166: istore 29
// 168: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 16b: new net/minecraft/class_243
// 16e: dup
// 16f: aload 0
// 170: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 173: i2d
// 174: aload 28
// 176: getfield net/minecraft/class_243.field_1352 D
// 179: dadd
// 17a: aload 0
// 17b: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 17e: i2d
// 17f: aload 28
// 181: getfield net/minecraft/class_243.field_1351 D
// 184: dadd
// 185: dconst_1
// 186: dadd
// 187: aload 0
// 188: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 18b: i2d
// 18c: aload 28
// 18e: getfield net/minecraft/class_243.field_1350 D
// 191: dadd
// 192: invokespecial net/minecraft/class_243.<init> (DDD)V
// 195: astore 18
// 197: iload 6
// 199: i2s
// 19a: iload 7
// 19c: i2c
// 19d: iload 8
// 19f: aload 18
// 1a1: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 1a4: nop
// 1a5: fstore 28
// 1a7: aload 26
// 1a9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ae: astore 29
// 1b0: aload 29
// 1b2: checkcast net/minecraft/class_243
// 1b5: astore 30
// 1b7: bipush 0
// 1b8: istore 31
// 1ba: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1bd: new net/minecraft/class_243
// 1c0: dup
// 1c1: aload 0
// 1c2: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 1c5: i2d
// 1c6: aload 30
// 1c8: getfield net/minecraft/class_243.field_1352 D
// 1cb: dadd
// 1cc: aload 0
// 1cd: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1d0: i2d
// 1d1: aload 30
// 1d3: getfield net/minecraft/class_243.field_1351 D
// 1d6: dadd
// 1d7: dconst_1
// 1d8: dadd
// 1d9: aload 0
// 1da: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 1dd: i2d
// 1de: aload 30
// 1e0: getfield net/minecraft/class_243.field_1350 D
// 1e3: dadd
// 1e4: invokespecial net/minecraft/class_243.<init> (DDD)V
// 1e7: astore 18
// 1e9: iload 6
// 1eb: i2s
// 1ec: iload 7
// 1ee: i2c
// 1ef: iload 8
// 1f1: aload 18
// 1f3: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 1f6: nop
// 1f7: fstore 30
// 1f9: fload 28
// 1fb: fload 30
// 1fd: invokestatic java/lang/Float.compare (FF)I
// 200: ifle 20b
// 203: aload 29
// 205: astore 27
// 207: fload 30
// 209: fstore 28
// 20b: aload 26
// 20d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 212: ifne 1a7
// 215: iload 19
// 217: lload 1
// 218: lconst_0
// 219: lcmp
// 21a: iflt 212
// 21d: ifne 207
// 220: aload 27
// 222: checkcast net/minecraft/class_243
// 225: astore 23
// 227: new net/minecraft/class_243
// 22a: dup
// 22b: aload 0
// 22c: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 22f: i2d
// 230: aload 23
// 232: getfield net/minecraft/class_243.field_1352 D
// 235: dadd
// 236: aload 0
// 237: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 23a: i2d
// 23b: dconst_1
// 23c: dadd
// 23d: aload 0
// 23e: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 241: i2d
// 242: aload 23
// 244: getfield net/minecraft/class_243.field_1350 D
// 247: dadd
// 248: invokespecial net/minecraft/class_243.<init> (DDD)V
// 24b: astore 24
// 24d: aload 24
// 24f: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 252: lload 16
// 254: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 257: iload 11
// 259: i2s
// 25a: swap
// 25b: iload 12
// 25d: swap
// 25e: iload 13
// 260: i2c
// 261: swap
// 262: checkcast net/minecraft/class_1297
// 265: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 268: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 26b: aload 3
// 26c: invokevirtual su/catlean/gp.M ()F
// 26f: aload 3
// 270: invokevirtual su/catlean/gp.M ()F
// 273: fmul
// 274: f2d
// 275: dcmpg
// 276: iload 19
// 278: lload 1
// 279: lconst_0
// 27a: lcmp
// 27b: iflt 2bd
// 27e: ifne 2bb
// 281: ifgt 2aa
// 284: goto 291
// 287: ldc2_w -6424034239892032624
// 28a: lload 1
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: new net/minecraft/class_3965
// 294: dup
// 295: aload 24
// 297: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 29a: aload 0
// 29b: bipush 0
// 29c: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 29f: areturn
// 2a0: ldc2_w -6424034239892032624
// 2a3: lload 1
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: lload 16
// 2ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2af: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 2b2: getfield net/minecraft/class_243.field_1351 D
// 2b5: aload 0
// 2b6: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 2b9: i2d
// 2ba: dcmpg
// 2bb: iload 19
// 2bd: ifne 2e9
// 2c0: ifge 490
// 2c3: goto 2d0
// 2c6: ldc2_w -6424034239892032624
// 2c9: lload 1
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: lload 9
// 2d2: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2d5: aload 0
// 2d6: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 2d9: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 2dc: goto 2e9
// 2df: ldc2_w -6424034239892032624
// 2e2: lload 1
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: ifeq 490
// 2ec: getstatic su/catlean/rb.E Ljava/util/List;
// 2ef: checkcast java/lang/Iterable
// 2f2: astore 24
// 2f4: bipush 0
// 2f5: istore 25
// 2f7: aload 24
// 2f9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2fe: astore 26
// 300: aload 26
// 302: iload 19
// 304: ifne 335
// 307: invokeinterface java/util/Iterator.hasNext ()Z 1
// 30c: ifne 32e
// 30f: goto 31c
// 312: ldc2_w -6424034239892032624
// 315: lload 1
// 316: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: athrow
// 31c: new java/util/NoSuchElementException
// 31f: dup
// 320: invokespecial java/util/NoSuchElementException.<init> ()V
// 323: athrow
// 324: ldc2_w -6424034239892032624
// 327: lload 1
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: aload 26
// 330: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 335: astore 27
// 337: aload 26
// 339: iload 19
// 33b: ifne 364
// 33e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 343: ifne 362
// 346: goto 353
// 349: ldc2_w -6424034239892032624
// 34c: lload 1
// 34d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: athrow
// 353: aload 27
// 355: goto 422
// 358: ldc2_w -6424034239892032624
// 35b: lload 1
// 35c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 361: athrow
// 362: aload 27
// 364: checkcast net/minecraft/class_243
// 367: astore 28
// 369: bipush 0
// 36a: istore 29
// 36c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 36f: new net/minecraft/class_243
// 372: dup
// 373: aload 0
// 374: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 377: i2d
// 378: aload 28
// 37a: getfield net/minecraft/class_243.field_1352 D
// 37d: dadd
// 37e: aload 0
// 37f: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 382: i2d
// 383: aload 28
// 385: getfield net/minecraft/class_243.field_1351 D
// 388: dadd
// 389: aload 0
// 38a: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 38d: i2d
// 38e: aload 28
// 390: getfield net/minecraft/class_243.field_1350 D
// 393: dadd
// 394: invokespecial net/minecraft/class_243.<init> (DDD)V
// 397: astore 18
// 399: iload 6
// 39b: i2s
// 39c: iload 7
// 39e: i2c
// 39f: iload 8
// 3a1: aload 18
// 3a3: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 3a6: nop
// 3a7: fstore 28
// 3a9: aload 26
// 3ab: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3b0: astore 29
// 3b2: aload 29
// 3b4: checkcast net/minecraft/class_243
// 3b7: astore 30
// 3b9: bipush 0
// 3ba: istore 31
// 3bc: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3bf: new net/minecraft/class_243
// 3c2: dup
// 3c3: aload 0
// 3c4: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 3c7: i2d
// 3c8: aload 30
// 3ca: getfield net/minecraft/class_243.field_1352 D
// 3cd: dadd
// 3ce: aload 0
// 3cf: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 3d2: i2d
// 3d3: aload 30
// 3d5: getfield net/minecraft/class_243.field_1351 D
// 3d8: dadd
// 3d9: aload 0
// 3da: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3dd: i2d
// 3de: aload 30
// 3e0: getfield net/minecraft/class_243.field_1350 D
// 3e3: dadd
// 3e4: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3e7: astore 18
// 3e9: iload 6
// 3eb: i2s
// 3ec: iload 7
// 3ee: i2c
// 3ef: iload 8
// 3f1: aload 18
// 3f3: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 3f6: nop
// 3f7: fstore 30
// 3f9: fload 28
// 3fb: fload 30
// 3fd: invokestatic java/lang/Float.compare (FF)I
// 400: ifle 40b
// 403: aload 29
// 405: astore 27
// 407: fload 30
// 409: fstore 28
// 40b: aload 26
// 40d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 412: ifne 3a9
// 415: iload 19
// 417: lload 1
// 418: lconst_0
// 419: lcmp
// 41a: ifle 412
// 41d: ifne 407
// 420: aload 27
// 422: checkcast net/minecraft/class_243
// 425: astore 23
// 427: new net/minecraft/class_243
// 42a: dup
// 42b: aload 0
// 42c: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 42f: i2d
// 430: aload 23
// 432: getfield net/minecraft/class_243.field_1352 D
// 435: dadd
// 436: aload 0
// 437: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 43a: i2d
// 43b: aload 0
// 43c: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 43f: i2d
// 440: aload 23
// 442: getfield net/minecraft/class_243.field_1350 D
// 445: dadd
// 446: invokespecial net/minecraft/class_243.<init> (DDD)V
// 449: astore 24
// 44b: aload 24
// 44d: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 450: lload 16
// 452: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 455: iload 11
// 457: i2s
// 458: swap
// 459: iload 12
// 45b: swap
// 45c: iload 13
// 45e: i2c
// 45f: swap
// 460: checkcast net/minecraft/class_1297
// 463: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 466: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 469: aload 3
// 46a: invokevirtual su/catlean/gp.M ()F
// 46d: aload 3
// 46e: invokevirtual su/catlean/gp.M ()F
// 471: fmul
// 472: f2d
// 473: dcmpg
// 474: ifgt 490
// 477: new net/minecraft/class_3965
// 47a: dup
// 47b: aload 24
// 47d: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 480: aload 0
// 481: bipush 0
// 482: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 485: areturn
// 486: ldc2_w -6424034239892032624
// 489: lload 1
// 48a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48f: athrow
// 490: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 493: iload 4
// 495: aload 0
// 496: iload 5
// 498: invokevirtual su/catlean/gw.M (ILnet/minecraft/class_2338;I)Ljava/util/List;
// 49b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 4a0: astore 23
// 4a2: aload 23
// 4a4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4a9: ifeq 58d
// 4ac: aload 23
// 4ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4b3: checkcast net/minecraft/class_2350
// 4b6: astore 24
// 4b8: aload 24
// 4ba: lload 1
// 4bb: lconst_0
// 4bc: lcmp
// 4bd: ifle 58f
// 4c0: iload 19
// 4c2: ifne 58f
// 4c5: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 4c8: iload 19
// 4ca: ifne 4ef
// 4cd: goto 4da
// 4d0: ldc2_w -6424034239892032624
// 4d3: lload 1
// 4d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d9: athrow
// 4da: if_acmpeq 4a2
// 4dd: goto 4ea
// 4e0: ldc2_w -6424034239892032624
// 4e3: lload 1
// 4e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e9: athrow
// 4ea: aload 24
// 4ec: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 4ef: if_acmpne 4f5
// 4f2: goto 4a2
// 4f5: new net/minecraft/class_243
// 4f8: dup
// 4f9: aload 0
// 4fa: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 4fd: i2d
// 4fe: ldc2_w 0.5
// 501: dadd
// 502: aload 24
// 504: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 507: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 50a: i2d
// 50b: ldc2_w 0.5
// 50e: dmul
// 50f: dadd
// 510: aload 0
// 511: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 514: i2d
// 515: ldc2_w 0.99
// 518: dadd
// 519: aload 0
// 51a: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 51d: i2d
// 51e: ldc2_w 0.5
// 521: dadd
// 522: aload 24
// 524: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 527: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 52a: i2d
// 52b: ldc2_w 0.5
// 52e: dmul
// 52f: dadd
// 530: invokespecial net/minecraft/class_243.<init> (DDD)V
// 533: astore 25
// 535: lload 9
// 537: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 53a: aload 0
// 53b: aload 24
// 53d: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 540: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 543: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 546: iload 19
// 548: ifne 4a9
// 54b: ifeq 4a2
// 54e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 551: iload 6
// 553: i2s
// 554: iload 7
// 556: i2c
// 557: iload 8
// 559: aload 25
// 55b: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 55e: fstore 26
// 560: lload 1
// 561: lconst_0
// 562: lcmp
// 563: iflt 588
// 566: fload 20
// 568: iload 19
// 56a: ifne 586
// 56d: fload 26
// 56f: fcmpl
// 570: ifle 4a2
// 573: goto 580
// 576: ldc2_w -6424034239892032624
// 579: lload 1
// 57a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57f: athrow
// 580: aload 24
// 582: astore 21
// 584: fload 26
// 586: fstore 20
// 588: iload 19
// 58a: ifeq 4a2
// 58d: aload 21
// 58f: ifnonnull 59e
// 592: aconst_null
// 593: areturn
// 594: ldc2_w -6424034239892032624
// 597: lload 1
// 598: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59d: athrow
// 59e: aload 0
// 59f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 5a2: aload 21
// 5a4: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 5a7: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 5aa: i2d
// 5ab: ldc2_w 0.5
// 5ae: dmul
// 5af: aload 21
// 5b1: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 5b4: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 5b7: i2d
// 5b8: ldc2_w 0.5
// 5bb: dmul
// 5bc: aload 21
// 5be: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 5c1: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 5c4: i2d
// 5c5: ldc2_w 0.5
// 5c8: dmul
// 5c9: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 5cc: dup
// 5cd: sipush 16819
// 5d0: ldc2_w 4627721939940596813
// 5d3: lload 1
// 5d4: lxor
// 5d5: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5dd: astore 23
// 5df: new net/minecraft/class_3965
// 5e2: dup
// 5e3: aload 23
// 5e5: aload 21
// 5e7: aload 0
// 5e8: bipush 0
// 5e9: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 5ec: areturn
}

private static final class_3965 L(class_2338 param0, long param1, gp param3, boolean param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 34553516582575
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 32
// 020: lshl
// 021: bipush 32
// 023: lushr
// 024: l2i
// 025: istore 7
// 027: pop2
// 028: dup2
// 029: ldc2_w 132910597043479
// 02c: lxor
// 02d: lstore 8
// 02f: dup2
// 030: ldc2_w 136368486556195
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 10
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 32
// 041: lushr
// 042: l2i
// 043: istore 11
// 045: dup2
// 046: bipush 48
// 048: lshl
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 12
// 04f: pop2
// 050: dup2
// 051: ldc2_w 121883377226761
// 054: lxor
// 055: lstore 13
// 057: pop2
// 058: ldc2_w -8746715782810930493
// 05b: lload 1
// 05c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: getstatic su/catlean/rb.l Ljava/util/Map;
// 064: aload 0
// 065: invokedynamic invoke (Lnet/minecraft/class_2338;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/rb.D (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Ljava/lang/Float;, (Lnet/minecraft/class_243;)Ljava/lang/Float; ]
// 06a: invokedynamic apply (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/rb.b (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;, (Ljava/lang/Object;)Ljava/lang/Float; ]
// 06f: invokestatic java/util/Comparator.comparing (Ljava/util/function/Function;)Ljava/util/Comparator;
// 072: dup
// 073: sipush 23990
// 076: ldc2_w 223378140408045813
// 079: lload 1
// 07a: lxor
// 07b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 083: invokestatic kotlin/collections/MapsKt.toSortedMap (Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;
// 086: checkcast java/util/Map
// 089: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 08e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 093: astore 16
// 095: istore 15
// 097: aload 16
// 099: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09e: ifeq 1f2
// 0a1: aload 16
// 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a8: checkcast java/util/Map$Entry
// 0ab: astore 17
// 0ad: new net/minecraft/class_243
// 0b0: dup
// 0b1: aload 0
// 0b2: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0b5: i2d
// 0b6: aload 17
// 0b8: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0bd: checkcast net/minecraft/class_243
// 0c0: getfield net/minecraft/class_243.field_1352 D
// 0c3: dadd
// 0c4: aload 0
// 0c5: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0c8: i2d
// 0c9: aload 17
// 0cb: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0d0: checkcast net/minecraft/class_243
// 0d3: getfield net/minecraft/class_243.field_1351 D
// 0d6: dadd
// 0d7: ldc2_w 0.01
// 0da: dsub
// 0db: aload 0
// 0dc: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0df: i2d
// 0e0: aload 17
// 0e2: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0e7: checkcast net/minecraft/class_243
// 0ea: getfield net/minecraft/class_243.field_1350 D
// 0ed: dadd
// 0ee: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0f1: astore 18
// 0f3: lload 1
// 0f4: lconst_0
// 0f5: lcmp
// 0f6: iflt 129
// 0f9: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0fc: iload 5
// 0fe: i2s
// 0ff: iload 6
// 101: i2c
// 102: iload 7
// 104: aload 18
// 106: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 109: aload 3
// 10a: invokevirtual su/catlean/gp.M ()F
// 10d: fcmpl
// 10e: ifle 129
// 111: iload 15
// 113: lload 1
// 114: lconst_0
// 115: lcmp
// 116: ifle 09e
// 119: ifne 097
// 11c: goto 129
// 11f: ldc2_w -8760619262026394843
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: getstatic su/catlean/la.l Lsu/catlean/la;
// 12c: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 12f: lload 13
// 131: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 134: iload 10
// 136: i2s
// 137: swap
// 138: iload 11
// 13a: swap
// 13b: iload 12
// 13d: i2c
// 13e: swap
// 13f: checkcast net/minecraft/class_1297
// 142: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 145: aload 18
// 147: bipush 0
// 148: iload 4
// 14a: ifeq 15e
// 14d: aload 0
// 14e: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 151: goto 161
// 154: ldc2_w -8760619262026394843
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 161: iload 4
// 163: lload 8
// 165: dup2_x2
// 166: pop2
// 167: invokevirtual su/catlean/la.V (Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJLjava/util/List;Z)Lnet/minecraft/class_3965;
// 16a: astore 19
// 16c: aload 19
// 16e: iload 15
// 170: lload 1
// 171: lconst_0
// 172: lcmp
// 173: ifle 18d
// 176: ifeq 18b
// 179: ifnull 1d7
// 17c: goto 189
// 17f: ldc2_w -8760619262026394843
// 182: lload 1
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: aload 19
// 18b: iload 15
// 18d: lload 1
// 18e: lconst_0
// 18f: lcmp
// 190: iflt 1bd
// 193: ifeq 1bb
// 196: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 199: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 19c: if_acmpne 1d7
// 19f: goto 1ac
// 1a2: ldc2_w -8760619262026394843
// 1a5: lload 1
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: aload 19
// 1ae: goto 1bb
// 1b1: ldc2_w -8760619262026394843
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: iload 15
// 1bd: ifeq 1f1
// 1c0: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 1c3: aload 0
// 1c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c7: ifne 1ef
// 1ca: goto 1d7
// 1cd: ldc2_w -8760619262026394843
// 1d0: lload 1
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: iload 15
// 1d9: ifne 097
// 1dc: lload 1
// 1dd: lconst_0
// 1de: lcmp
// 1df: ifle 0f3
// 1e2: goto 1ef
// 1e5: ldc2_w -8760619262026394843
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: aload 19
// 1f1: areturn
// 1f2: aconst_null
// 1f3: areturn
}

private static final boolean w(class_243 param0, long param1, class_2338 param3, class_243 param4, gp param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 118530184338234
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 79148147140209
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 68552757652661
// 019: lxor
// 01a: lstore 10
// 01c: pop2
// 01d: ldc2_w 9146828713374158925
// 020: lload 1
// 021: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: aload 4
// 028: dconst_0
// 029: lload 10
// 02b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02e: lload 10
// 030: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 033: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 036: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 039: f2d
// 03a: dconst_0
// 03b: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 03e: dup
// 03f: sipush 25457
// 042: ldc2_w 3539293908457367179
// 045: lload 1
// 046: lxor
// 047: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 04f: astore 13
// 051: istore 12
// 053: aload 5
// 055: invokevirtual su/catlean/gp.r ()Z
// 058: iload 12
// 05a: ifne 0bd
// 05d: ifeq 0b8
// 060: goto 06d
// 063: ldc2_w 9137900063465089945
// 066: lload 1
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: getstatic su/catlean/oa.k Lsu/catlean/oa;
// 070: aload 3
// 071: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 074: dconst_0
// 075: ldc2_w 0.5
// 078: dconst_0
// 079: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 07c: dup
// 07d: sipush 16819
// 080: ldc2_w 4627608877735740484
// 083: lload 1
// 084: lxor
// 085: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: lload 6
// 08f: aload 5
// 091: aload 13
// 093: invokevirtual su/catlean/oa.S (Lnet/minecraft/class_243;JLsu/catlean/gp;Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 096: ifnull 0b4
// 099: goto 0a6
// 09c: ldc2_w 9137900063465089945
// 09f: lload 1
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: bipush 1
// 0a7: goto 132
// 0aa: ldc2_w 9137900063465089945
// 0ad: lload 1
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: bipush 0
// 0b5: goto 132
// 0b8: aload 5
// 0ba: invokevirtual su/catlean/gp.F ()Z
// 0bd: iload 12
// 0bf: lload 1
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: iflt 11a
// 0c5: ifne 118
// 0c8: ifeq 10b
// 0cb: goto 0d8
// 0ce: ldc2_w 9137900063465089945
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: getstatic su/catlean/i1.C Lsu/catlean/i1;
// 0db: aload 3
// 0dc: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0df: dconst_0
// 0e0: ldc2_w 0.5
// 0e3: dconst_0
// 0e4: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0e7: dup
// 0e8: sipush 16819
// 0eb: ldc2_w 4627608877735740484
// 0ee: lload 1
// 0ef: lxor
// 0f0: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: lload 8
// 0fa: aload 0
// 0fb: invokevirtual su/catlean/i1.C (Lnet/minecraft/class_243;JLnet/minecraft/class_243;)Z
// 0fe: goto 132
// 101: ldc2_w 9137900063465089945
// 104: lload 1
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: aload 13
// 10d: aload 0
// 10e: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 111: aload 5
// 113: invokevirtual su/catlean/gp.U ()F
// 116: f2d
// 117: dcmpg
// 118: iload 12
// 11a: ifne 12e
// 11d: ifgt 131
// 120: goto 12d
// 123: ldc2_w 9137900063465089945
// 126: lload 1
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 1
// 12e: goto 132
// 131: bipush 0
// 132: ireturn
}

public static final boolean a(@NotNull ux $this$isPositionBlockedByEntity, long a, @NotNull class_2338 base, boolean calcPhase, @NotNull gp configState) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 14994158062370
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 6
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 7
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 130128564221776
// 021: lxor
// 022: lstore 9
// 024: dup2
// 025: ldc2_w 47339078847623
// 028: lxor
// 029: lstore 11
// 02b: dup2
// 02c: ldc2_w 20905227330101
// 02f: lxor
// 030: lstore 13
// 032: dup2
// 033: ldc2_w 49986440685858
// 036: lxor
// 037: lstore 15
// 039: dup2
// 03a: ldc2_w 103982540281510
// 03d: lxor
// 03e: lstore 17
// 040: pop2
// 041: aload 0
// 042: sipush 13172
// 045: ldc2_w 8273450909159969050
// 048: lload 1
// 049: lxor
// 04a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 052: ldc2_w 6441907750741981147
// 055: lload 1
// 056: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: aload 3
// 05c: sipush 28157
// 05f: ldc2_w 3166068680473448321
// 062: lload 1
// 063: lxor
// 064: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06c: istore 19
// 06e: aload 5
// 070: sipush 28581
// 073: ldc2_w 4618011255872294336
// 076: lload 1
// 077: lxor
// 078: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 080: lload 11
// 082: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 085: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 088: iload 19
// 08a: ifne 0b6
// 08d: ifnull 0e6
// 090: goto 09d
// 093: ldc2_w 6432836840752286735
// 096: lload 1
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 11
// 09f: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 0a2: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 0a5: dup
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a9: goto 0b6
// 0ac: ldc2_w 6432836840752286735
// 0af: lload 1
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 0b9: dup
// 0ba: sipush 10070
// 0bd: ldc2_w 7201413876947731759
// 0c0: lload 1
// 0c1: lxor
// 0c2: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: checkcast java/lang/CharSequence
// 0cd: sipush 23592
// 0d0: ldc2_w 6831177857227701846
// 0d3: lload 1
// 0d4: lxor
// 0d5: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: checkcast java/lang/CharSequence
// 0dd: bipush 0
// 0de: bipush 2
// 0df: aconst_null
// 0e0: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0e3: ifne 104
// 0e6: new net/minecraft/class_238
// 0e9: dup
// 0ea: aload 3
// 0eb: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0ee: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0f1: dconst_0
// 0f2: dconst_1
// 0f3: dconst_0
// 0f4: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 0f7: goto 10f
// 0fa: ldc2_w 6432836840752286735
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: new net/minecraft/class_238
// 107: dup
// 108: aload 3
// 109: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 10c: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 10f: astore 21
// 111: aload 21
// 113: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 116: aload 21
// 118: astore 20
// 11a: aload 0
// 11b: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 11e: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 121: ifnull 233
// 124: getstatic su/catlean/y6.b Lkotlin/enums/EnumEntries;
// 127: checkcast java/lang/Iterable
// 12a: astore 22
// 12c: bipush 0
// 12d: istore 23
// 12f: aload 22
// 131: iload 19
// 133: ifne 185
// 136: instanceof java/util/Collection
// 139: ifeq 183
// 13c: goto 149
// 13f: ldc2_w 6432836840752286735
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 22
// 14b: checkcast java/util/Collection
// 14e: iload 19
// 150: ifne 185
// 153: goto 160
// 156: ldc2_w 6432836840752286735
// 159: lload 1
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: invokeinterface java/util/Collection.isEmpty ()Z 1
// 165: ifeq 183
// 168: goto 175
// 16b: ldc2_w 6432836840752286735
// 16e: lload 1
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: bipush 0
// 176: goto 230
// 179: ldc2_w 6432836840752286735
// 17c: lload 1
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: aload 22
// 185: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 18a: astore 24
// 18c: aload 24
// 18e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 193: ifeq 22f
// 196: aload 24
// 198: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 19d: astore 25
// 19f: aload 25
// 1a1: checkcast net/minecraft/class_2350
// 1a4: astore 26
// 1a6: bipush 0
// 1a7: istore 27
// 1a9: iload 19
// 1ab: ifne 200
// 1ae: aload 0
// 1af: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 1b2: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 1b5: checkcast su/catlean/mm
// 1b8: lload 1
// 1b9: lconst_0
// 1ba: lcmp
// 1bb: iflt 1c5
// 1be: dup
// 1bf: ifnull 1ff
// 1c2: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 1c5: checkcast net/minecraft/class_3965
// 1c8: dup
// 1c9: ifnull 1ff
// 1cc: goto 1d9
// 1cf: ldc2_w 6432836840752286735
// 1d2: lload 1
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 1dc: dup
// 1dd: iload 19
// 1df: ifne 21a
// 1e2: goto 1ef
// 1e5: ldc2_w 6432836840752286735
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: ifnonnull 214
// 1f2: goto 1ff
// 1f5: ldc2_w 6432836840752286735
// 1f8: lload 1
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: pop
// 200: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 203: dup
// 204: sipush 12933
// 207: ldc2_w 3876849982087745780
// 20a: lload 1
// 20b: lxor
// 20c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 214: aload 3
// 215: aload 26
// 217: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 21a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 21d: ifeq 18c
// 220: bipush 1
// 221: lload 1
// 222: lconst_0
// 223: lcmp
// 224: iflt 1ab
// 227: iload 19
// 229: ifne 1a7
// 22c: goto 230
// 22f: bipush 0
// 230: ifne 2e1
// 233: getstatic su/catlean/y6.b Lkotlin/enums/EnumEntries;
// 236: checkcast java/lang/Iterable
// 239: astore 22
// 23b: bipush 0
// 23c: istore 23
// 23e: aload 22
// 240: iload 19
// 242: ifne 294
// 245: instanceof java/util/Collection
// 248: ifeq 292
// 24b: goto 258
// 24e: ldc2_w 6432836840752286735
// 251: lload 1
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: aload 22
// 25a: checkcast java/util/Collection
// 25d: iload 19
// 25f: ifne 294
// 262: goto 26f
// 265: ldc2_w 6432836840752286735
// 268: lload 1
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: invokeinterface java/util/Collection.isEmpty ()Z 1
// 274: ifeq 292
// 277: goto 284
// 27a: ldc2_w 6432836840752286735
// 27d: lload 1
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: bipush 0
// 285: goto 2d8
// 288: ldc2_w 6432836840752286735
// 28b: lload 1
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: aload 22
// 294: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 299: astore 24
// 29b: aload 24
// 29d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2a2: ifeq 2d7
// 2a5: aload 24
// 2a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2ac: astore 25
// 2ae: aload 25
// 2b0: checkcast net/minecraft/class_2350
// 2b3: astore 26
// 2b5: bipush 0
// 2b6: istore 27
// 2b8: aload 0
// 2b9: invokevirtual su/catlean/ux.e ()Ljava/util/LinkedList;
// 2bc: aload 3
// 2bd: aload 26
// 2bf: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 2c2: invokevirtual java/util/LinkedList.contains (Ljava/lang/Object;)Z
// 2c5: ifeq 29b
// 2c8: bipush 1
// 2c9: lload 1
// 2ca: lconst_0
// 2cb: lcmp
// 2cc: ifle 2c5
// 2cf: iload 19
// 2d1: ifne 2c5
// 2d4: goto 2d8
// 2d7: bipush 0
// 2d8: lload 1
// 2d9: lconst_0
// 2da: lcmp
// 2db: ifle 2e2
// 2de: ifeq 2ef
// 2e1: bipush 1
// 2e2: goto 2f0
// 2e5: ldc2_w 6432836840752286735
// 2e8: lload 1
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: bipush 0
// 2f0: istore 21
// 2f2: aload 0
// 2f3: invokevirtual su/catlean/ux.N5 ()Ljava/util/Map;
// 2f6: aload 3
// 2f7: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 2fa: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 2ff: iload 19
// 301: lload 1
// 302: lconst_0
// 303: lcmp
// 304: iflt 31e
// 307: ifne 31c
// 30a: ifeq 333
// 30d: goto 31a
// 310: ldc2_w 6432836840752286735
// 313: lload 1
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: iload 21
// 31c: iload 19
// 31e: ifne 332
// 321: ifne 333
// 324: goto 331
// 327: ldc2_w 6432836840752286735
// 32a: lload 1
// 32b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 330: athrow
// 331: bipush 1
// 332: ireturn
// 333: aload 5
// 335: invokevirtual su/catlean/gp.I ()Ljava/util/List;
// 338: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 33d: astore 22
// 33f: aload 22
// 341: invokeinterface java/util/Iterator.hasNext ()Z 1
// 346: ifeq 76e
// 349: aload 22
// 34b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 350: checkcast net/minecraft/class_1297
// 353: astore 23
// 355: aload 23
// 357: lload 1
// 358: lconst_0
// 359: lcmp
// 35a: ifle 374
// 35d: iload 19
// 35f: ifne 374
// 362: ifnull 3de
// 365: goto 372
// 368: ldc2_w 6432836840752286735
// 36b: lload 1
// 36c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: athrow
// 372: aload 23
// 374: invokevirtual net/minecraft/class_1297.method_5805 ()Z
// 377: iload 19
// 379: lload 1
// 37a: lconst_0
// 37b: lcmp
// 37c: iflt 3c5
// 37f: ifne 3c3
// 382: ifeq 3de
// 385: goto 392
// 388: ldc2_w 6432836840752286735
// 38b: lload 1
// 38c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 391: athrow
// 392: aload 23
// 394: aload 3
// 395: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 398: i2d
// 399: ldc2_w 0.5
// 39c: dadd
// 39d: aload 3
// 39e: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 3a1: i2d
// 3a2: ldc2_w 0.5
// 3a5: dadd
// 3a6: aload 3
// 3a7: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3aa: i2d
// 3ab: ldc2_w 0.5
// 3ae: dadd
// 3af: invokevirtual net/minecraft/class_1297.method_5649 (DDD)D
// 3b2: ldc2_w 16.0
// 3b5: dcmpl
// 3b6: goto 3c3
// 3b9: ldc2_w 6432836840752286735
// 3bc: lload 1
// 3bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: athrow
// 3c3: iload 19
// 3c5: lload 1
// 3c6: lconst_0
// 3c7: lcmp
// 3c8: ifle 40a
// 3cb: ifne 408
// 3ce: ifle 403
// 3d1: goto 3de
// 3d4: ldc2_w 6432836840752286735
// 3d7: lload 1
// 3d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dd: athrow
// 3de: iload 19
// 3e0: lload 1
// 3e1: lconst_0
// 3e2: lcmp
// 3e3: ifle 346
// 3e6: ifeq 33f
// 3e9: goto 3f6
// 3ec: ldc2_w 6432836840752286735
// 3ef: lload 1
// 3f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f5: athrow
// 3f6: bipush 3
// 3f7: anewarray 1013
// 3fa: ldc2_w 6443496141876777814
// 3fd: lload 1
// 3fe: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 403: aload 23
// 405: instanceof net/minecraft/class_1657
// 408: iload 19
// 40a: ifne 4c6
// 40d: ifeq 4bc
// 410: goto 41d
// 413: ldc2_w 6432836840752286735
// 416: lload 1
// 417: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41c: athrow
// 41d: bipush 0
// 41e: istore 24
// 420: aload 0
// 421: lload 17
// 423: invokevirtual su/catlean/ux.NA (J)I
// 426: istore 25
// 428: iload 24
// 42a: iload 19
// 42c: lload 1
// 42d: lconst_0
// 42e: lcmp
// 42f: ifle 437
// 432: ifne 4c6
// 435: iload 25
// 437: if_icmpgt 4bc
// 43a: goto 447
// 43d: ldc2_w 6432836840752286735
// 440: lload 1
// 441: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 446: athrow
// 447: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 44a: lload 9
// 44c: aload 23
// 44e: checkcast net/minecraft/class_1657
// 451: iload 24
// 453: invokevirtual su/catlean/lo.F (JLnet/minecraft/class_1657;I)Lnet/minecraft/class_238;
// 456: aload 20
// 458: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 45b: ifeq 482
// 45e: goto 46b
// 461: ldc2_w 6432836840752286735
// 464: lload 1
// 465: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: athrow
// 46b: bipush 1
// 46c: iload 19
// 46e: lload 1
// 46f: lconst_0
// 470: lcmp
// 471: ifle 486
// 474: ifne 484
// 477: ireturn
// 478: ldc2_w 6432836840752286735
// 47b: lload 1
// 47c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 481: athrow
// 482: iload 24
// 484: iload 19
// 486: lload 1
// 487: lconst_0
// 488: lcmp
// 489: iflt 4c8
// 48c: ifne 4c6
// 48f: iload 25
// 491: if_icmpeq 4bc
// 494: goto 4a1
// 497: ldc2_w 6432836840752286735
// 49a: lload 1
// 49b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a0: athrow
// 4a1: iinc 24 1
// 4a4: iload 19
// 4a6: ifeq 447
// 4a9: lload 1
// 4aa: lconst_0
// 4ab: lcmp
// 4ac: iflt 46b
// 4af: goto 4bc
// 4b2: ldc2_w 6432836840752286735
// 4b5: lload 1
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: aload 23
// 4be: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 4c1: aload 20
// 4c3: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 4c6: iload 19
// 4c8: lload 1
// 4c9: lconst_0
// 4ca: lcmp
// 4cb: ifle 4e8
// 4ce: ifne 4e6
// 4d1: ifeq 33f
// 4d4: goto 4e1
// 4d7: ldc2_w 6432836840752286735
// 4da: lload 1
// 4db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e0: athrow
// 4e1: aload 23
// 4e3: instanceof net/minecraft/class_1303
// 4e6: iload 19
// 4e8: lload 1
// 4e9: lconst_0
// 4ea: lcmp
// 4eb: iflt 520
// 4ee: ifne 51e
// 4f1: ifeq 519
// 4f4: goto 501
// 4f7: ldc2_w 6432836840752286735
// 4fa: lload 1
// 4fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 500: athrow
// 501: iload 19
// 503: lload 1
// 504: lconst_0
// 505: lcmp
// 506: iflt 346
// 509: ifeq 33f
// 50c: goto 519
// 50f: ldc2_w 6432836840752286735
// 512: lload 1
// 513: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 518: athrow
// 519: aload 23
// 51b: instanceof net/minecraft/class_1542
// 51e: iload 19
// 520: ifne 62a
// 523: ifeq 625
// 526: goto 533
// 529: ldc2_w 6432836840752286735
// 52c: lload 1
// 52d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 532: athrow
// 533: aload 23
// 535: checkcast net/minecraft/class_1542
// 538: invokevirtual net/minecraft/class_1542.method_5809 ()Z
// 53b: iload 19
// 53d: lload 1
// 53e: lconst_0
// 53f: lcmp
// 540: iflt 586
// 543: ifne 584
// 546: goto 553
// 549: ldc2_w 6432836840752286735
// 54c: lload 1
// 54d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 552: athrow
// 553: lload 1
// 554: lconst_0
// 555: lcmp
// 556: ifle 60f
// 559: ifne 60d
// 55c: goto 569
// 55f: ldc2_w 6432836840752286735
// 562: lload 1
// 563: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 568: athrow
// 569: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 56c: aload 23
// 56e: checkcast net/minecraft/class_1542
// 571: invokevirtual net/minecraft/class_1542.method_5628 ()I
// 574: invokevirtual su/catlean/yk.d (I)Z
// 577: goto 584
// 57a: ldc2_w 6432836840752286735
// 57d: lload 1
// 57e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 583: athrow
// 584: iload 19
// 586: lload 1
// 587: lconst_0
// 588: lcmp
// 589: ifle 5bb
// 58c: ifne 5b9
// 58f: ifne 60d
// 592: goto 59f
// 595: ldc2_w 6432836840752286735
// 598: lload 1
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: aload 0
// 5a0: invokevirtual su/catlean/ux.N5 ()Ljava/util/Map;
// 5a3: aload 3
// 5a4: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 5a7: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 5ac: goto 5b9
// 5af: ldc2_w 6432836840752286735
// 5b2: lload 1
// 5b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b8: athrow
// 5b9: iload 19
// 5bb: lload 1
// 5bc: lconst_0
// 5bd: lcmp
// 5be: iflt 5f4
// 5c1: ifne 5f2
// 5c4: ifne 60d
// 5c7: goto 5d4
// 5ca: ldc2_w 6432836840752286735
// 5cd: lload 1
// 5ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d3: athrow
// 5d4: aload 23
// 5d6: checkcast net/minecraft/class_1542
// 5d9: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 5dc: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 5df: getstatic net/minecraft/class_1802.field_8276 Lnet/minecraft/class_1792;
// 5e2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5e5: goto 5f2
// 5e8: ldc2_w 6432836840752286735
// 5eb: lload 1
// 5ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f1: athrow
// 5f2: iload 19
// 5f4: lload 1
// 5f5: lconst_0
// 5f6: lcmp
// 5f7: ifle 62c
// 5fa: ifne 62a
// 5fd: ifeq 625
// 600: goto 60d
// 603: ldc2_w 6432836840752286735
// 606: lload 1
// 607: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60c: athrow
// 60d: iload 19
// 60f: lload 1
// 610: lconst_0
// 611: lcmp
// 612: ifle 346
// 615: ifeq 33f
// 618: goto 625
// 61b: ldc2_w 6432836840752286735
// 61e: lload 1
// 61f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 624: athrow
// 625: aload 23
// 627: instanceof net/minecraft/class_1511
// 62a: iload 19
// 62c: ifne 76d
// 62f: ifeq 76c
// 632: goto 63f
// 635: ldc2_w 6432836840752286735
// 638: lload 1
// 639: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63e: athrow
// 63f: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 642: aload 23
// 644: checkcast net/minecraft/class_1511
// 647: invokevirtual net/minecraft/class_1511.method_5628 ()I
// 64a: invokevirtual su/catlean/yk.d (I)Z
// 64d: iload 19
// 64f: lload 1
// 650: lconst_0
// 651: lcmp
// 652: ifle 69f
// 655: ifne 69d
// 658: goto 665
// 65b: ldc2_w 6432836840752286735
// 65e: lload 1
// 65f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 664: athrow
// 665: ifeq 68d
// 668: goto 675
// 66b: ldc2_w 6432836840752286735
// 66e: lload 1
// 66f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 674: athrow
// 675: iload 19
// 677: lload 1
// 678: lconst_0
// 679: lcmp
// 67a: ifle 346
// 67d: ifeq 33f
// 680: goto 68d
// 683: ldc2_w 6432836840752286735
// 686: lload 1
// 687: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68c: athrow
// 68d: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 690: aload 23
// 692: checkcast net/minecraft/class_1511
// 695: invokevirtual net/minecraft/class_1511.method_5628 ()I
// 698: lload 13
// 69a: invokevirtual su/catlean/yk.L (IJ)Z
// 69d: iload 19
// 69f: lload 1
// 6a0: lconst_0
// 6a1: lcmp
// 6a2: ifle 6c8
// 6a5: ifne 6c6
// 6a8: ifeq 6c4
// 6ab: goto 6b8
// 6ae: ldc2_w 6432836840752286735
// 6b1: lload 1
// 6b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b7: athrow
// 6b8: bipush 1
// 6b9: ireturn
// 6ba: ldc2_w 6432836840752286735
// 6bd: lload 1
// 6be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c3: athrow
// 6c4: iload 4
// 6c6: iload 19
// 6c8: lload 1
// 6c9: lconst_0
// 6ca: lcmp
// 6cb: iflt 741
// 6ce: ifne 73f
// 6d1: ifeq 728
// 6d4: goto 6e1
// 6d7: ldc2_w 6432836840752286735
// 6da: lload 1
// 6db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e0: athrow
// 6e1: getstatic su/catlean/oa.k Lsu/catlean/oa;
// 6e4: aload 0
// 6e5: aload 0
// 6e6: iload 6
// 6e8: i2b
// 6e9: lload 7
// 6eb: aload 23
// 6ed: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 6f0: aload 5
// 6f2: lload 15
// 6f4: bipush 1
// 6f5: aload 23
// 6f7: checkcast net/minecraft/class_1511
// 6fa: getfield net/minecraft/class_1511.field_6012 I
// 6fd: invokevirtual su/catlean/oa.u (Lsu/catlean/ux;Lnet/minecraft/class_243;Lsu/catlean/gp;JZI)Lsu/catlean/t_;
// 700: ifnull 76c
// 703: goto 710
// 706: ldc2_w 6432836840752286735
// 709: lload 1
// 70a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70f: athrow
// 710: iload 19
// 712: ifeq 33f
// 715: lload 1
// 716: lconst_0
// 717: lcmp
// 718: iflt 355
// 71b: goto 728
// 71e: ldc2_w 6432836840752286735
// 721: lload 1
// 722: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 727: athrow
// 728: aload 0
// 729: iload 6
// 72b: i2b
// 72c: lload 7
// 72e: aload 23
// 730: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 733: aload 20
// 735: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 738: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 73b: ldc2_w 0.3
// 73e: dcmpl
// 73f: iload 19
// 741: ifne 76d
// 744: ifle 76c
// 747: goto 754
// 74a: ldc2_w 6432836840752286735
// 74d: lload 1
// 74e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 753: athrow
// 754: getstatic su/catlean/oa.k Lsu/catlean/oa;
// 757: aload 23
// 759: checkcast net/minecraft/class_1511
// 75c: invokevirtual su/catlean/oa.u (Lnet/minecraft/class_1511;)V
// 75f: goto 76c
// 762: ldc2_w 6432836840752286735
// 765: lload 1
// 766: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76b: athrow
// 76c: bipush 1
// 76d: ireturn
// 76e: bipush 0
// 76f: ireturn
}

public static final boolean L(long a, @NotNull class_2338 bp, @NotNull class_1657 target) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rb.a J
// 003: lload 0
// 004: lxor
// 005: lstore 0
// 006: lload 0
// 007: dup2
// 008: ldc2_w 37921174560857
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: pop2
// 01e: ldc2_w -1000521316671218528
// 021: lload 0
// 022: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: aload 2
// 028: sipush 7323
// 02b: ldc2_w 1867475509068846474
// 02e: lload 0
// 02f: lxor
// 030: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 038: istore 7
// 03a: aload 3
// 03b: sipush 24647
// 03e: ldc2_w 836854355625847124
// 041: lload 0
// 042: lxor
// 043: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04b: aload 3
// 04c: invokevirtual net/minecraft/class_1657.method_6115 ()Z
// 04f: iload 7
// 051: ifne 08f
// 054: ifne 070
// 057: goto 064
// 05a: ldc2_w -991591434635008140
// 05d: lload 0
// 05e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: athrow
// 064: bipush 0
// 065: ireturn
// 066: ldc2_w -991591434635008140
// 069: lload 0
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: aload 3
// 071: iload 7
// 073: ifne 0ce
// 076: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 079: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 07c: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 082: goto 08f
// 085: ldc2_w -991591434635008140
// 088: lload 0
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: ifne 0cd
// 092: aload 3
// 093: iload 7
// 095: ifne 0ce
// 098: goto 0a5
// 09b: ldc2_w -991591434635008140
// 09e: lload 0
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 0a8: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0ab: getstatic net/minecraft/class_1802.field_8255 Lnet/minecraft/class_1792;
// 0ae: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b1: ifne 0cd
// 0b4: goto 0c1
// 0b7: ldc2_w -991591434635008140
// 0ba: lload 0
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: bipush 0
// 0c2: ireturn
// 0c3: ldc2_w -991591434635008140
// 0c6: lload 0
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 3
// 0ce: fconst_0
// 0cf: aload 3
// 0d0: getfield net/minecraft/class_1657.field_6241 F
// 0d3: invokevirtual net/minecraft/class_1657.method_5631 (FF)Lnet/minecraft/class_243;
// 0d6: dup
// 0d7: sipush 29450
// 0da: ldc2_w 2775617488418028041
// 0dd: lload 0
// 0de: lxor
// 0df: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e7: astore 8
// 0e9: aload 2
// 0ea: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0ed: dconst_0
// 0ee: ldc2_w 0.5
// 0f1: dconst_0
// 0f2: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0f5: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 0f8: iload 4
// 0fa: i2b
// 0fb: lload 5
// 0fd: aload 3
// 0fe: checkcast net/minecraft/class_1297
// 101: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 104: invokevirtual net/minecraft/class_243.method_1035 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 107: dup
// 108: sipush 5145
// 10b: ldc2_w 6055809294716361986
// 10e: lload 0
// 10f: lxor
// 110: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/rb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 118: astore 9
// 11a: new net/minecraft/class_243
// 11d: dup
// 11e: aload 9
// 120: getfield net/minecraft/class_243.field_1352 D
// 123: dconst_0
// 124: aload 9
// 126: getfield net/minecraft/class_243.field_1350 D
// 129: invokespecial net/minecraft/class_243.<init> (DDD)V
// 12c: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 12f: aload 8
// 131: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
// 134: dconst_0
// 135: dcmpg
// 136: iload 7
// 138: ifne 14c
// 13b: ifge 14f
// 13e: goto 14b
// 141: ldc2_w -991591434635008140
// 144: lload 0
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: bipush 1
// 14c: goto 150
// 14f: bipush 0
// 150: ireturn
}

private static final Float D(class_2338 var0, class_243 var1) {
long var2 = a ^ 64267105467346L;
long var10001 = var2 ^ 3990975930591L;
int var4 = (int)((var2 ^ 3990975930591L) >>> 48);
int var5 = (int)((var2 ^ 3990975930591L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);
dm var10000 = dm.h;
class_243 var7 = new class_243(var0.method_10263() + var1.field_1352, var0.method_10264() + var1.field_1351, var0.method_10260() + var1.field_1350);
return var10000.z((short)var4, (char)var5, var6, var7);
}

private static final Float b(Function1 var0, Object var1) {
return (Float)var0.invoke(var1);
}

static {
long var20 = a ^ 102806594955871L;
vm.a<"Å">(true, -3371240002363202452L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[25];
int var16 = 0;
String var15 = "Ù//VrÃÀ·u²ç/c+\u0084,zÁT'¡¶%3\u0010¨\u009a\u000e\u0012\u0015mP\u009eÄª;ø\u0088z2ø 6·\u0011TÜ\u0089\u0007òA\u0087ãq! \u001b\u0082.ÇIê\u0093êÄªôæ\u0002ä\u0088\u0089pª\u0010ïÎ!\r$W8|\u0088\u0005¸g\u000bÈ×\u001f(G>Ø\u0089û>mfÏ\u0000ñ¿\u000e\u0012½×C½\u0013P³BX]Â\u0011aü¡ý\u000enª}AÙ¢¸å9\u0018q·A\u0083#Ó\tw\u0012.cÞ$\u0087X{áß\u0097¤dÿ« \u00109\u009b\u0097iz\u0015µN5»µH}V-Ó\u0010¼O¶AuÓJ{á´:\u0090\u0017E³7 Åä\u0097ÿM\u0000\u0086\fõè\u008a\u0012¯c\u009cC\u0002kVl$ì\u001be*\u0015\u008dÚî\u0016IÐ\u0018\u0000Õ;Ò\u0003ÐFÓúÏ6öe%\u009a÷2¤lÉÉð2# ¹\u0098^Ê´«ÆtD\u0082&\u009dµ+ª\u0013Ô¹ö\n¿Küµ\u008b\u0086\u0084V·0i\u00ad(xn\u0090¹¦8É¥\f¢þñ\u0090'üj\u0097d\u0012Ü\u0018 \u008c\u008d\u009f\u0010\u001dÒA\fÊ2õy.vÄ\u009b\u009e[\u0018FIAyWk¦ÏW\u009e.¦Y\nãýÚq\u001dñ6y\u0098\u0019\u0010\u0007Ë¦ñü%Õ23Ìbb\u00013³^(>\u008eä\u009e\u0000V4Ëbr\r[\u001böq\u0085\u008df®.¸¯7O`µ\u0003³ÑÅ>ûÝ²oHzÉ\u0007ö\u0010i\u0085âä\u0097\u0002ä\u0000]Ì1Ö\u0087ïäD\u0010/\u0095«>Î¸J\u009b\u009cÆþÍ*øí28MV,Íó\u001d\u0092\u0094Y¶Ê ½£ð1\u001fÎtj\u0095ð\u008c±\u0093'\u007f¾\u0097\"}¥(æ\u001a{D\u0082t]Ý[f\u0013³c¨ß<\u0099p\u0084ª\u001c}\u009c\u0018W¦/\u0083êÌÁ/zwæµ\u008d0 =j&b¦\u000bA\u0011\u0080(Y6ýÐ\u0014Be\u008fLÚú\u0091³z©»&o\u0015\u000b\u0006E,\u0001\u0092Çb§\u0015»8\u008eO\u0082¢\u0006.r\u0080Þ\u0010\u00146µ\u0005^LvN¢£2\u001dJTßõ\u0010¬IUÑÝÝ¥\u009f:\u008bêW\\\u0091\u0019G [á\"\u001bÏÜFö¨Ä\u0007H\\º\teÑÝ¸ÇQx\u001eÚ;\u0010Ï\u000fJ\u0092\u0093\u000b";
int var17 = "Ù//VrÃÀ·u²ç/c+\u0084,zÁT'¡¶%3\u0010¨\u009a\u000e\u0012\u0015mP\u009eÄª;ø\u0088z2ø 6·\u0011TÜ\u0089\u0007òA\u0087ãq! \u001b\u0082.ÇIê\u0093êÄªôæ\u0002ä\u0088\u0089pª\u0010ïÎ!\r$W8|\u0088\u0005¸g\u000bÈ×\u001f(G>Ø\u0089û>mfÏ\u0000ñ¿\u000e\u0012½×C½\u0013P³BX]Â\u0011aü¡ý\u000enª}AÙ¢¸å9\u0018q·A\u0083#Ó\tw\u0012.cÞ$\u0087X{áß\u0097¤dÿ« \u00109\u009b\u0097iz\u0015µN5»µH}V-Ó\u0010¼O¶AuÓJ{á´:\u0090\u0017E³7 Åä\u0097ÿM\u0000\u0086\fõè\u008a\u0012¯c\u009cC\u0002kVl$ì\u001be*\u0015\u008dÚî\u0016IÐ\u0018\u0000Õ;Ò\u0003ÐFÓúÏ6öe%\u009a÷2¤lÉÉð2# ¹\u0098^Ê´«ÆtD\u0082&\u009dµ+ª\u0013Ô¹ö\n¿Küµ\u008b\u0086\u0084V·0i\u00ad(xn\u0090¹¦8É¥\f¢þñ\u0090'üj\u0097d\u0012Ü\u0018 \u008c\u008d\u009f\u0010\u001dÒA\fÊ2õy.vÄ\u009b\u009e[\u0018FIAyWk¦ÏW\u009e.¦Y\nãýÚq\u001dñ6y\u0098\u0019\u0010\u0007Ë¦ñü%Õ23Ìbb\u00013³^(>\u008eä\u009e\u0000V4Ëbr\r[\u001böq\u0085\u008df®.¸¯7O`µ\u0003³ÑÅ>ûÝ²oHzÉ\u0007ö\u0010i\u0085âä\u0097\u0002ä\u0000]Ì1Ö\u0087ïäD\u0010/\u0095«>Î¸J\u009b\u009cÆþÍ*øí28MV,Íó\u001d\u0092\u0094Y¶Ê ½£ð1\u001fÎtj\u0095ð\u008c±\u0093'\u007f¾\u0097\"}¥(æ\u001a{D\u0082t]Ý[f\u0013³c¨ß<\u0099p\u0084ª\u001c}\u009c\u0018W¦/\u0083êÌÁ/zwæµ\u008d0 =j&b¦\u000bA\u0011\u0080(Y6ýÐ\u0014Be\u008fLÚú\u0091³z©»&o\u0015\u000b\u0006E,\u0001\u0092Çb§\u0015»8\u008eO\u0082¢\u0006.r\u0080Þ\u0010\u00146µ\u0005^LvN¢£2\u001dJTßõ\u0010¬IUÑÝÝ¥\u009f:\u008bêW\\\u0091\u0019G [á\"\u001bÏÜFö¨Ä\u0007H\\º\teÑÝ¸ÇQx\u001eÚ;\u0010Ï\u000fJ\u0092\u0093\u000b"
.length();
char var14 = 24;
int var25 = -1;

label54:
while (true) {
String var27 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var25 += var14) >= var17) {
c = var18;
d = new String[25];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "\u0010\u008cØ|ÂY\u001ca\u0080n\u001f\u009e\u0098£CÕ\u0082±å\u00177C\u0018\u0017\u009d\"µ\u001cIYÞ;Mò\u0007¡\u001fú|\u0088\u0017%÷î\u0003r¼ûBíýkqê-:ëñ²\u0004¼°,÷/Pæ\u0095 \u008e\u008d@\u009c\\þìºYÝoª\u0015¨K5n\u0087èb#7;Ú§w\"";
int var5 = "\u0010\u008cØ|ÂY\u001ca\u0080n\u001f\u009e\u0098£CÕ\u0082±å\u00177C\u0018\u0017\u009d\"µ\u001cIYÞ;Mò\u0007¡\u001fú|\u0088\u0017%÷î\u0003r¼ûBíýkqê-:ëñ²\u0004¼°,÷/Pæ\u0095 \u008e\u008d@\u009c\\þìºYÝoª\u0015¨K5n\u0087èb#7;Ú§w\""
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
f = var6;
g = new Integer[14];
Pair[] var22 = new Pair[b<"j">(65, 2321468868985281183L ^ var20)];
var22[0] = TuplesKt.to(new class_243(0.5, 1.0, 0.5), true);
var22[1] = TuplesKt.to(new class_243(0.5, 0.0, 0.5), true);
var22[2] = TuplesKt.to(new class_243(0.5, 0.5, 0.0), true);
var22[3] = TuplesKt.to(new class_243(0.5, 0.5, 1.0), true);
var22[4] = TuplesKt.to(new class_243(0.0, 0.5, 0.5), true);
var22[5] = TuplesKt.to(new class_243(1.0, 0.5, 0.5), true);
var22[b<"j">(19870, 8555386399941171020L ^ var20)] = TuplesKt.to(new class_243(0.05, 0.05, 0.05), false);
var22[b<"j">(11256, 2703697670755512623L ^ var20)] = TuplesKt.to(new class_243(0.05, 0.05, 0.95), false);
var22[b<"j">(29876, 1410350779812687460L ^ var20)] = TuplesKt.to(new class_243(0.05, 0.95, 0.05), false);
var22[b<"j">(23081, 8138838208477921526L ^ var20)] = TuplesKt.to(new class_243(0.05, 0.95, 0.95), false);
var22[b<"j">(10197, 4742365416383773967L ^ var20)] = TuplesKt.to(new class_243(0.95, 0.05, 0.05), false);
var22[b<"j">(5095, 8737859199014258996L ^ var20)] = TuplesKt.to(new class_243(0.95, 0.05, 0.95), false);
var22[b<"j">(7497, 192657446628444060L ^ var20)] = TuplesKt.to(new class_243(0.95, 0.95, 0.05), false);
var22[b<"j">(27150, 55785972830187730L ^ var20)] = TuplesKt.to(new class_243(0.95, 0.95, 0.95), false);
l = MapsKt.mapOf(var22);
class_243[] var26 = new class_243[b<"j">(765, 1313155645350074400L ^ var20)];
var26[0] = new class_243(0.51, 0.0, 0.49);
var26[1] = new class_243(0.05, 0.0, 0.05);
var26[2] = new class_243(0.05, 0.0, 0.95);
var26[3] = new class_243(0.95, 0.0, 0.05);
var26[4] = new class_243(0.95, 0.0, 0.95);
var26[5] = new class_243(0.475, 0.0, 0.95);
var26[b<"j">(19870, 8555386399941171020L ^ var20)] = new class_243(0.475, 0.0, 0.05);
var26[b<"j">(17713, 657263871677931495L ^ var20)] = new class_243(0.95, 0.0, 0.025);
var26[b<"j">(29876, 1410350779812687460L ^ var20)] = new class_243(0.05, 0.0, 0.475);
E = CollectionsKt.listOf(var26);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "\u0018G^Êm\\2\u009dîß³ï\u0083»äª";
var5 = "\u0018G^Êm\\2\u009dîß³ï\u0083»äª".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var38;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "¾\u0087±VHÌ¥^ôa»9\u0004.8þ¶#l\u0095{\u0012\u0013\u000f¹J\u0090û_Üá+\u0010«Î\u009f:\t\u0097ÊJ\u0098¼È\u001b\u001b\u00062ü";
var17 = "¾\u0087±VHÌ¥^ôa»9\u0004.8þ¶#l\u0095{\u0012\u0013\u000f¹J\u0090û_Üá+\u0010«Î\u009f:\t\u0097ÊJ\u0098¼È\u001b\u001b\u00062ü".length();
var14 = ' ';
var25 = -1;
}

var27 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void l(boolean var0) {
N = var0;
}

public static boolean t() {
return N;
}

public static boolean D() {
boolean var0 = t();

try {
return !var0;
} catch (NoSuchElementException var1) {
throw a(var1);
}
}

private static NoSuchElementException a(NoSuchElementException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14885;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/rb", var10);
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
throw new RuntimeException("su/catlean/rb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2636;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/rb", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/rb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
