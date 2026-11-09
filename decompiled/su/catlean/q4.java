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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class q4 extends _g {
@NotNull
public static final q4 c;
static final KProperty[] e;
@NotNull
private static final a6 W;
@NotNull
private static final cr N;
@NotNull
private static final c8 x;
@NotNull
private static final c8 b;
@NotNull
private static final cw P;
@NotNull
private static final c8 y;
@NotNull
private static final cq u;
@NotNull
private static final bg l;
private static boolean t;
private static int A;
private static final long a = yz.a(-6680767085894232486L, -3152355307944075782L, MethodHandles.lookup().lookupClass()).a(209676086885715L);
private static final String[] d;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private q4(short var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 53799671550624L;
super(b<"r">(29554, 1025479264430479271L ^ var4), jt.I(), null, 4, null, var6);
}

private final id E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 4619751529976L;
return (id)W.E(this, var3, e[0]);
}

private final void p(long var1, id var3) {
var1 = a ^ var1;
long var4 = var1 ^ 13073968939103L;
W.b(this, var4, e[0], var3);
}

/** @deprecated */
private static void w() {
}

private final nv F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 47063349674449L;
return (nv)N.E(this, var3, e[1]);
}

private final void M(int var1, short var2, nv var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 133038570842819L;
N.b(this, var7, e[1], var3);
}

private final int D(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 130295500229357L;
return ((Number)x.E(this, var6, e[2])).intValue();
}

private final void z(int var1, int var2, long var3) {
long var5 = ((long)var2 << 32 | var3 << 32 >>> 32) ^ a;
long var7 = var5 ^ 88349586857855L;
x.b(this, var7, e[2], var1);
}

private final int s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114849333273846L;
return ((Number)b.E(this, var3, e[3])).intValue();
}

private final void m(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 58612417734756L;
b.b(this, var4, e[3], var1);
}

private final r7 H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114450575761141L;
return (r7)P.E(this, var3, e[4]);
}

private final int R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 95296027935534L;
return ((Number)y.E(this, var3, e[5])).intValue();
}

private final boolean W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 96362563446907L;
return (Boolean)u.E(this, var3, e[c<"g">(16541, 1829652911696058098L ^ var1)]);
}

@Flow
private final void A(PlayerUpdateEvent var1) {
long var2 = a ^ 112932953386487L;
long var4 = var2 ^ 105454901868225L;
long var6 = var2 ^ 140040261316309L;
long var10001 = var2 ^ 89018422651678L;
int var8 = (int)((var2 ^ 89018422651678L) >>> 32);
int var9 = (int)((var2 ^ 89018422651678L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
long var11 = var2 ^ 90631366201017L;
long var13 = var2 ^ 85772908774661L;
long var15 = var2 ^ 48477314773351L;
String var17 = vm.a<"Å">(-6680939193804190151L, var2);

label60: {
int var10000;
label55: {
try {
var10000 = A;
if (var17 == null) {
break label55;
}

if (A > 0) {
break label60;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -6678635930223365188L, var2);
}

var10000 = yl.g.m().H(var4).r().isEmpty();
}

label46: {
try {
if (var17 == null) {
break label46;
}

if (var10000 != 0) {
return;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -6678635930223365188L, var2);
}

var10000 = 0;
}

int var23 = var10000;
class_1703 var26 = zf.v(var15).field_7512;
Intrinsics.checkNotNullExpressionValue(var26, b<"r">(19478, 3325023096456104116L ^ var2));
Iterator var24 = this.z(var26, var11).iterator();
Intrinsics.checkNotNullExpressionValue(var24, b<"r">(1270, 2479891933642031180L ^ var2));
Iterator var19 = var24;

label35:
while (var19.hasNext()) {
Object var25 = var19.next();
Intrinsics.checkNotNullExpressionValue(var25, b<"r">(3120, 8821065453102729371L ^ var2));
int var20 = ((Number)var25).intValue();
ag.e(var20, var6, 0, null, false, c<"g">(11830, 8972924391482703411L ^ var2), null);
var23++;

while (var23 >= this.s(var13)) {
if (var17 != null) {
break label35;
}
}
}

A = this.D(var8, (char)var9, (short)var10);
return;
}

int var18 = A;
A = var18 + -1;
}

private final int J(short param1, class_1792 param2, class_1703 param3, long param4, IntRange param6) {
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
// 005: lload 4
// 007: bipush 16
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/q4.a J
// 011: lxor
// 012: lstore 7
// 014: lload 7
// 016: dup2
// 017: ldc2_w 30693063059534
// 01a: lxor
// 01b: lstore 9
// 01d: dup2
// 01e: ldc2_w 57366701542702
// 021: lxor
// 022: lstore 11
// 024: pop2
// 025: ldc2_w 9063438381747851446
// 028: lload 7
// 02a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 13
// 031: aload 3
// 032: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 035: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 038: aload 2
// 039: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 03c: aload 13
// 03e: ifnull 060
// 041: ifeq 061
// 044: goto 052
// 047: ldc2_w 9070245263457250611
// 04a: lload 7
// 04c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: athrow
// 052: sipush 32048
// 055: ldc2_w 6469650171762619320
// 058: lload 7
// 05a: lxor
// 05b: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: ireturn
// 061: aload 0
// 062: aload 3
// 063: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 066: invokevirtual net/minecraft/class_2371.size ()I
// 069: lload 11
// 06b: dup2_x1
// 06c: pop2
// 06d: invokespecial su/catlean/q4.k (JI)Lkotlin/ranges/IntRange;
// 070: astore 14
// 072: aload 6
// 074: invokevirtual kotlin/ranges/IntRange.getFirst ()I
// 077: istore 15
// 079: aload 6
// 07b: invokevirtual kotlin/ranges/IntRange.getLast ()I
// 07e: istore 16
// 080: iload 15
// 082: aload 13
// 084: ifnull 173
// 087: iload 16
// 089: if_icmpgt 172
// 08c: goto 09a
// 08f: ldc2_w 9070245263457250611
// 092: lload 7
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: aload 3
// 09b: iload 15
// 09d: invokevirtual net/minecraft/class_1703.method_7611 (I)Lnet/minecraft/class_1735;
// 0a0: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 0a3: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0a6: aload 2
// 0a7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0aa: ifeq 13b
// 0ad: goto 0bb
// 0b0: ldc2_w 9070245263457250611
// 0b3: lload 7
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0be: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 0c1: lload 9
// 0c3: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 0c6: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// 0c9: iload 15
// 0cb: aload 6
// 0cd: invokevirtual kotlin/ranges/IntRange.getFirst ()I
// 0d0: isub
// 0d1: aload 6
// 0d3: invokevirtual kotlin/ranges/IntRange.getFirst ()I
// 0d6: aload 13
// 0d8: ifnull 0ff
// 0db: ifne 102
// 0de: goto 0ec
// 0e1: ldc2_w 9070245263457250611
// 0e4: lload 7
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 14
// 0ee: invokevirtual kotlin/ranges/IntRange.getFirst ()I
// 0f1: goto 0ff
// 0f4: ldc2_w 9070245263457250611
// 0f7: lload 7
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: goto 103
// 102: bipush 0
// 103: isub
// 104: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 107: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 10c: aload 2
// 10d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 110: aload 13
// 112: lload 4
// 114: lconst_0
// 115: lcmp
// 116: iflt 13f
// 119: ifnull 13d
// 11c: ifne 13b
// 11f: goto 12d
// 122: ldc2_w 9070245263457250611
// 125: lload 7
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: iload 15
// 12f: ireturn
// 130: ldc2_w 9070245263457250611
// 133: lload 7
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: iload 15
// 13d: aload 13
// 13f: ifnull 173
// 142: iload 16
// 144: if_icmpeq 172
// 147: goto 155
// 14a: ldc2_w 9070245263457250611
// 14d: lload 7
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: iinc 15 1
// 158: aload 13
// 15a: ifnonnull 09a
// 15d: lload 4
// 15f: lconst_0
// 160: lcmp
// 161: ifle 0bb
// 164: goto 172
// 167: ldc2_w 9070245263457250611
// 16a: lload 7
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: bipush -1
// 173: ireturn
}

private final IntRange R(int var1, long var2, short var4) {
long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;

try {
switch (var1) {
case 46:
return new IntRange(c<"g">(30995, 1020449380445932831L ^ var5), c<"g">(14910, 5775501575471369780L ^ var5));
case 63:
return new IntRange(0, c<"g">(32683, 6523692255363025827L ^ var5));
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -8693358637187459146L, var5);
}

return new IntRange(0, c<"g">(17182, 6674165468687726347L ^ var5));
}

private final IntRange k(long var1, int var3) {
var1 = a ^ var1;

try {
switch (var3) {
case 46:
return new IntRange(c<"g">(30995, 1020380694462461259L ^ var1), c<"g">(19668, 1011426419943784600L ^ var1));
case 63:
return new IntRange(c<"g">(1453, 173597265684072955L ^ var1), c<"g">(9784, 959522235303209585L ^ var1));
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 4543780159642709986L, var1);
}

return new IntRange(c<"g">(27477, 2433028170434995968L ^ var1), c<"g">(10290, 3723603526937748599L ^ var1));
}

private final ArrayList z(class_1703 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q4.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 24664563421238
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 16
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 134491007563655
// 021: lxor
// 022: lstore 7
// 024: dup2
// 025: ldc2_w 94108378714855
// 028: lxor
// 029: lstore 9
// 02b: dup2
// 02c: ldc2_w 24243443952307
// 02f: lxor
// 030: dup2
// 031: bipush 16
// 033: lushr
// 034: lstore 11
// 036: dup2
// 037: bipush 48
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: pop2
// 041: pop2
// 042: ldc2_w -6769283473499943041
// 045: lload 2
// 046: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: new java/util/ArrayList
// 04e: dup
// 04f: invokespecial java/util/ArrayList.<init> ()V
// 052: astore 15
// 054: aload 1
// 055: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 058: invokevirtual net/minecraft/class_2371.size ()I
// 05b: istore 16
// 05d: astore 14
// 05f: iload 16
// 061: sipush 23673
// 064: ldc2_w 4462822811803045169
// 067: lload 2
// 068: lxor
// 069: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: aload 14
// 070: ifnull 09f
// 073: if_icmpeq 0e6
// 076: goto 083
// 079: ldc2_w -6767047971584593158
// 07c: lload 2
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: iload 16
// 085: sipush 29018
// 088: ldc2_w 3205213285616443398
// 08b: lload 2
// 08c: lxor
// 08d: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: goto 09f
// 095: ldc2_w -6767047971584593158
// 098: lload 2
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: lload 2
// 0a0: lconst_0
// 0a1: lcmp
// 0a2: iflt 0d6
// 0a5: aload 14
// 0a7: ifnull 0d6
// 0aa: if_icmpeq 0e6
// 0ad: goto 0ba
// 0b0: ldc2_w -6767047971584593158
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: iload 16
// 0bc: sipush 2510
// 0bf: ldc2_w 3583021290389051541
// 0c2: lload 2
// 0c3: lxor
// 0c4: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: goto 0d6
// 0cc: ldc2_w -6767047971584593158
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: if_icmpeq 0e6
// 0d9: aload 15
// 0db: areturn
// 0dc: ldc2_w -6767047971584593158
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0e9: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 0ec: lload 7
// 0ee: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 0f1: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// 0f4: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
// 0f9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 0fe: astore 17
// 100: aload 17
// 102: invokeinterface java/util/Iterator.hasNext ()Z 1
// 107: ifeq 297
// 10a: aload 17
// 10c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 111: dup
// 112: sipush 7739
// 115: ldc2_w 10388066753158089
// 118: lload 2
// 119: lxor
// 11a: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 122: checkcast java/lang/Number
// 125: invokevirtual java/lang/Number.intValue ()I
// 128: istore 18
// 12a: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 12d: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 130: lload 7
// 132: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 135: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// 138: iload 18
// 13a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 13d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 142: checkcast net/minecraft/class_1792
// 145: astore 19
// 147: aload 19
// 149: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 14c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14f: aload 14
// 151: ifnull 184
// 154: ifeq 176
// 157: goto 164
// 15a: ldc2_w -6767047971584593158
// 15d: lload 2
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: aload 14
// 166: ifnonnull 100
// 169: goto 176
// 16c: ldc2_w -6767047971584593158
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: iload 18
// 178: aload 0
// 179: lload 9
// 17b: iload 16
// 17d: invokespecial su/catlean/q4.k (JI)Lkotlin/ranges/IntRange;
// 180: invokevirtual kotlin/ranges/IntRange.getFirst ()I
// 183: iadd
// 184: istore 20
// 186: aload 1
// 187: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 18a: iload 20
// 18c: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 18f: checkcast net/minecraft/class_1735
// 192: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 195: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 198: aload 19
// 19a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 19d: aload 14
// 19f: ifnull 1dd
// 1a2: ifeq 1c4
// 1a5: goto 1b2
// 1a8: ldc2_w -6767047971584593158
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 14
// 1b4: ifnonnull 100
// 1b7: goto 1c4
// 1ba: ldc2_w -6767047971584593158
// 1bd: lload 2
// 1be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: athrow
// 1c4: aload 0
// 1c5: iload 4
// 1c7: i2s
// 1c8: aload 19
// 1ca: aload 1
// 1cb: aload 0
// 1cc: iload 16
// 1ce: lload 11
// 1d0: iload 13
// 1d2: i2s
// 1d3: invokespecial su/catlean/q4.R (IJS)Lkotlin/ranges/IntRange;
// 1d6: lload 5
// 1d8: dup2_x1
// 1d9: pop2
// 1da: invokespecial su/catlean/q4.J (SLnet/minecraft/class_1792;Lnet/minecraft/class_1703;JLkotlin/ranges/IntRange;)I
// 1dd: istore 21
// 1df: iload 21
// 1e1: sipush 31138
// 1e4: ldc2_w 4071795783443671288
// 1e7: lload 2
// 1e8: lxor
// 1e9: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: aload 14
// 1f0: ifnull 241
// 1f3: if_icmpne 226
// 1f6: goto 203
// 1f9: ldc2_w -6767047971584593158
// 1fc: lload 2
// 1fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: athrow
// 203: aload 15
// 205: iload 20
// 207: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 20a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 20d: lload 2
// 20e: lconst_0
// 20f: lcmp
// 210: ifle 107
// 213: pop
// 214: aload 14
// 216: ifnonnull 100
// 219: goto 226
// 21c: ldc2_w -6767047971584593158
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: iload 21
// 228: aload 14
// 22a: lload 2
// 22b: lconst_0
// 22c: lcmp
// 22d: iflt 274
// 230: ifnull 272
// 233: bipush -1
// 234: goto 241
// 237: ldc2_w -6767047971584593158
// 23a: lload 2
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: if_icmpeq 100
// 244: aload 15
// 246: iload 21
// 248: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 24b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 24e: pop
// 24f: aload 15
// 251: iload 20
// 253: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 256: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 259: pop
// 25a: aload 1
// 25b: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
// 25e: iload 20
// 260: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
// 263: checkcast net/minecraft/class_1735
// 266: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 269: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 26c: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 26f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 272: aload 14
// 274: ifnull 291
// 277: ifne 100
// 27a: goto 287
// 27d: ldc2_w -6767047971584593158
// 280: lload 2
// 281: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 286: athrow
// 287: aload 15
// 289: iload 21
// 28b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 28e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 291: pop
// 292: aload 14
// 294: ifnonnull 100
// 297: aload 15
// 299: lload 2
// 29a: lconst_0
// 29b: lcmp
// 29c: iflt 122
// 29f: areturn
}

@Flow
private final void n(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q4.a J
// 003: ldc2_w 73386433438785
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 44780743325431
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 117002346149552
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 44753166231956
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 94394974928958
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 9127140117652
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 133093225529601
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 8932961188049
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 34050388792170
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 93277953649515
// 045: lxor
// 046: lstore 20
// 048: pop2
// 049: ldc2_w -6125267971720149105
// 04c: lload 2
// 04d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: astore 22
// 054: aload 0
// 055: lload 6
// 057: invokespecial su/catlean/q4.H (J)Lsu/catlean/r7;
// 05a: getstatic su/catlean/r7.OFF Lsu/catlean/r7;
// 05d: if_acmpeq 3b0
// 060: lload 4
// 062: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 065: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 068: instanceof net/minecraft/class_490
// 06b: istore 23
// 06d: lload 16
// 06f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 072: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 075: instanceof net/minecraft/class_1707
// 078: aload 22
// 07a: ifnull 0b2
// 07d: ifeq 213
// 080: goto 08d
// 083: ldc2_w -6132042278031967734
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 0
// 08e: aload 22
// 090: ifnull 214
// 093: goto 0a0
// 096: ldc2_w -6132042278031967734
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: lload 10
// 0a2: invokespecial su/catlean/q4.W (J)Z
// 0a5: goto 0b2
// 0a8: ldc2_w -6132042278031967734
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: ifeq 213
// 0b5: lload 16
// 0b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ba: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0bd: dup
// 0be: sipush 26133
// 0c1: ldc2_w 5439769753961196316
// 0c4: lload 2
// 0c5: lxor
// 0c6: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0ce: checkcast net/minecraft/class_1707
// 0d1: astore 24
// 0d3: lload 4
// 0d5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d8: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0db: dup
// 0dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0df: invokevirtual net/minecraft/class_437.method_25440 ()Lnet/minecraft/class_2561;
// 0e2: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 0e7: dup
// 0e8: sipush 16623
// 0eb: ldc2_w 3482990556510244340
// 0ee: lload 2
// 0ef: lxor
// 0f0: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: astore 25
// 0fa: bipush 0
// 0fb: istore 26
// 0fd: aload 24
// 0ff: invokevirtual net/minecraft/class_1707.method_7629 ()Lnet/minecraft/class_1263;
// 102: invokeinterface net/minecraft/class_1263.method_5439 ()I 1
// 107: istore 27
// 109: iload 26
// 10b: iload 27
// 10d: if_icmpge 213
// 110: aload 24
// 112: iload 26
// 114: invokevirtual net/minecraft/class_1707.method_7611 (I)Lnet/minecraft/class_1735;
// 117: dup
// 118: sipush 14676
// 11b: ldc2_w 6446868219348759644
// 11e: lload 2
// 11f: lxor
// 120: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 128: astore 28
// 12a: aload 22
// 12c: ifnull 20e
// 12f: aload 28
// 131: invokevirtual net/minecraft/class_1735.method_7681 ()Z
// 134: aload 22
// 136: ifnull 280
// 139: goto 146
// 13c: ldc2_w -6132042278031967734
// 13f: lload 2
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: ifeq 20b
// 149: goto 156
// 14c: ldc2_w -6132042278031967734
// 14f: lload 2
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: aload 0
// 157: lload 8
// 159: invokespecial su/catlean/q4.F (J)Lsu/catlean/nv;
// 15c: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 15f: aload 28
// 161: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
// 164: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 167: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 16c: aload 22
// 16e: ifnull 1b6
// 171: goto 17e
// 174: ldc2_w -6132042278031967734
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: ifeq 20b
// 181: goto 18e
// 184: ldc2_w -6132042278031967734
// 187: lload 2
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: aload 25
// 190: checkcast java/lang/CharSequence
// 193: sipush 24104
// 196: ldc2_w 8980663193629152062
// 199: lload 2
// 19a: lxor
// 19b: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: checkcast java/lang/CharSequence
// 1a3: bipush 0
// 1a4: bipush 2
// 1a5: aconst_null
// 1a6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 1a9: goto 1b6
// 1ac: ldc2_w -6132042278031967734
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 22
// 1b8: ifnull 1f3
// 1bb: ifne 20b
// 1be: goto 1cb
// 1c1: ldc2_w -6132042278031967734
// 1c4: lload 2
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: aload 25
// 1cd: checkcast java/lang/CharSequence
// 1d0: sipush 19909
// 1d3: ldc2_w 8178019708964978911
// 1d6: lload 2
// 1d7: lxor
// 1d8: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: checkcast java/lang/CharSequence
// 1e0: bipush 0
// 1e1: bipush 2
// 1e2: aconst_null
// 1e3: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 1e6: goto 1f3
// 1e9: ldc2_w -6132042278031967734
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: ifne 20b
// 1f6: aload 0
// 1f7: iload 26
// 1f9: lload 18
// 1fb: invokespecial su/catlean/q4.E (IJ)V
// 1fe: goto 20b
// 201: ldc2_w -6132042278031967734
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: iinc 26 1
// 20e: aload 22
// 210: ifnonnull 109
// 213: aload 0
// 214: lload 6
// 216: invokespecial su/catlean/q4.H (J)Lsu/catlean/r7;
// 219: getstatic su/catlean/r7.INVENTORY Lsu/catlean/r7;
// 21c: aload 22
// 21e: ifnull 257
// 221: if_acmpne 24e
// 224: goto 231
// 227: ldc2_w -6132042278031967734
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: iload 23
// 233: ifne 24e
// 236: goto 243
// 239: ldc2_w -6132042278031967734
// 23c: lload 2
// 23d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 242: athrow
// 243: return
// 244: ldc2_w -6132042278031967734
// 247: lload 2
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: aload 0
// 24f: lload 6
// 251: invokespecial su/catlean/q4.H (J)Lsu/catlean/r7;
// 254: getstatic su/catlean/r7.NOT_IN_INVENTORY Lsu/catlean/r7;
// 257: if_acmpne 27f
// 25a: iload 23
// 25c: aload 22
// 25e: ifnull 280
// 261: goto 26e
// 264: ldc2_w -6132042278031967734
// 267: lload 2
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: ifeq 27f
// 271: goto 27e
// 274: ldc2_w -6132042278031967734
// 277: lload 2
// 278: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: athrow
// 27e: return
// 27f: bipush 0
// 280: istore 24
// 282: iload 24
// 284: sipush 30954
// 287: ldc2_w 51834508062613826
// 28a: lload 2
// 28b: lxor
// 28c: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: if_icmpge 32d
// 294: aload 0
// 295: aload 22
// 297: ifnull 2da
// 29a: lload 8
// 29c: invokespecial su/catlean/q4.F (J)Lsu/catlean/nv;
// 29f: invokevirtual su/catlean/nv.x ()Ljava/util/List;
// 2a2: lload 16
// 2a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a7: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 2aa: iload 24
// 2ac: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 2af: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 2b2: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 2b7: aload 22
// 2b9: ifnull 330
// 2bc: goto 2c9
// 2bf: ldc2_w -6132042278031967734
// 2c2: lload 2
// 2c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: athrow
// 2c9: ifeq 325
// 2cc: goto 2d9
// 2cf: ldc2_w -6132042278031967734
// 2d2: lload 2
// 2d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d8: athrow
// 2d9: aload 0
// 2da: iload 24
// 2dc: sipush 27768
// 2df: ldc2_w 7262002223288808923
// 2e2: lload 2
// 2e3: lxor
// 2e4: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: aload 22
// 2eb: ifnull 31a
// 2ee: if_icmpge 31e
// 2f1: goto 2fe
// 2f4: ldc2_w -6132042278031967734
// 2f7: lload 2
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: iload 24
// 300: sipush 14171
// 303: ldc2_w 652398752658206439
// 306: lload 2
// 307: lxor
// 308: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: goto 31a
// 310: ldc2_w -6132042278031967734
// 313: lload 2
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: iadd
// 31b: goto 320
// 31e: iload 24
// 320: lload 18
// 322: invokespecial su/catlean/q4.E (IJ)V
// 325: iinc 24 1
// 328: aload 22
// 32a: ifnonnull 282
// 32d: getstatic su/catlean/q4.t Z
// 330: aload 22
// 332: ifnull 36e
// 335: ifeq 3b0
// 338: goto 345
// 33b: ldc2_w -6132042278031967734
// 33e: lload 2
// 33f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: athrow
// 345: getstatic su/catlean/q4.l Lsu/catlean/bg;
// 348: aload 0
// 349: lload 20
// 34b: invokespecial su/catlean/q4.R (J)I
// 34e: sipush 6788
// 351: ldc2_w 6187565419141563169
// 354: lload 2
// 355: lxor
// 356: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35b: iadd
// 35c: lload 14
// 35e: invokevirtual su/catlean/bg.c (IJ)Z
// 361: goto 36e
// 364: ldc2_w -6132042278031967734
// 367: lload 2
// 368: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: athrow
// 36e: aload 22
// 370: ifnull 3ad
// 373: ifeq 3b0
// 376: goto 383
// 379: ldc2_w -6132042278031967734
// 37c: lload 2
// 37d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: athrow
// 383: new net/minecraft/class_2815
// 386: dup
// 387: lload 16
// 389: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 38c: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 38f: getfield net/minecraft/class_1703.field_7763 I
// 392: invokespecial net/minecraft/class_2815.<init> (I)V
// 395: checkcast net/minecraft/class_2596
// 398: lload 12
// 39a: dup2_x1
// 39b: pop2
// 39c: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 39f: bipush 0
// 3a0: goto 3ad
// 3a3: ldc2_w -6132042278031967734
// 3a6: lload 2
// 3a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ac: athrow
// 3ad: putstatic su/catlean/q4.t Z
// 3b0: return
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public final mh X(int a, int a, @NotNull String name, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 33774642893811L;
long var9 = var5 ^ 88787518486675L;
Intrinsics.checkNotNullParameter(name, b<"r">(4730, 3256433380234141493L ^ var5));
String var10000 = vm.a<"Å">(3079606605857064909L, var5);
Map var12 = new LinkedHashMap();
String var11 = var10000;
int var13 = c<"g">(30995, 1020458907381719265L ^ var5);

while (true) {
if (var13 < c<"g">(22544, 51461930443588075L ^ var5)) {
var12.put(var13 - c<"g">(30995, 1020458907381719265L ^ var5), ((class_1735)zf.v(var9).field_7512.field_7761.get(var13)).method_7677().method_7909());
var13++;
if (var11 != null) {
continue;
}
}

do {
if (axxx > 0) {
return new mh(name, var12, var7);
}

var13++;
} while (var11 != null);
}
}

private final void E(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q4.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 55490115992566
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 7214885125668
// 12: lxor
// 13: lstore 6
// 15: dup2
// 16: ldc2_w 68132361320446
// 19: lxor
// 1a: lstore 8
// 1c: pop2
// 1d: ldc2_w -690242505447285990
// 20: lload 2
// 21: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: astore 10
// 28: getstatic su/catlean/q4.l Lsu/catlean/bg;
// 2b: aload 0
// 2c: lload 8
// 2e: invokespecial su/catlean/q4.R (J)I
// 31: lload 6
// 33: invokevirtual su/catlean/bg.q (IJ)Z
// 36: aload 10
// 38: ifnull 72
// 3b: ifeq 75
// 3e: goto 4b
// 41: ldc2_w -687936749732534625
// 44: lload 2
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: iload 1
// 4c: lload 4
// 4e: bipush 1
// 4f: getstatic net/minecraft/class_1713.field_7795 Lnet/minecraft/class_1713;
// 52: bipush 0
// 53: sipush 1980
// 56: ldc2_w 4082986289131897502
// 59: lload 2
// 5a: lxor
// 5b: invokedynamic g (IJ)I bsm=su/catlean/q4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: aconst_null
// 61: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 64: bipush 1
// 65: goto 72
// 68: ldc2_w -687936749732534625
// 6b: lload 2
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: putstatic su/catlean/q4.t Z
// 75: return
}

private static final Unit A() {
long var0 = a ^ 39247070690060L;
long var2 = var0 ^ 36729803887070L;
fi.C.o(new dw(var2));
return Unit.INSTANCE;
}

private static final boolean r() {
long var0 = a ^ 2206593276379L;
long var2 = var0 ^ 47102440311594L;

try {
if (c.H(var2) != r7.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 1692470234784761744L, var0);
}

return false;
}

private static final boolean g() {
long var0 = a ^ 97887237064381L;
long var2 = var0 ^ 125138216555596L;

try {
if (c.H(var2) != r7.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 583928295029971190L, var0);
}

return false;
}

static {
long var20 = a ^ 114226383160323L;
long var22 = var20 ^ 127041350092535L;
long var10001 = var20 ^ 129983519491706L;
int var24 = (int)((var20 ^ 129983519491706L) >>> 48);
int var25 = (int)((var20 ^ 129983519491706L) << 16 >>> 32);
int var26 = (int)(var10001 << 48 >>> 48);
long var27 = var20 ^ 38501690573393L;
long var29 = var20 ^ 6012783722568L;
long var31 = var20 ^ 47074368163118L;
long var33 = var20 ^ 118394603124634L;
long var35 = var20 ^ 76651167574944L;
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
String var15 = "\u008aâõûã° nÌ°A\u0016häÃ¶o\u001dôò\u008a\u0084df\u0084\u0098õú9[%\u009e8g¹\u0083ÔøO±\u0011&îÓî\u0002wRÞ \u0015\u0000°\u0002\u0091\\}oæ\r&\u0089oDª2%d\u0096ª]\u0006\tT\u000fÿR¦\\·\u0085½Å´ÎüEh×(4\u0011%>0àMÒð\u0092\u0016\u0083\u0097lá¡Ú\tQ@\u008f8 \u007fþ$\u001býyJ\no\u001aÇ\u0001\u008c«^Ú\u0085(M¼\u0004ó7«óÒ¶\u0094J+·Â½\u0080Oy]Î¿£\u001búr¶@E\u0095\u0006R6 °°W\u0018Q $ r\u0016³%õ\f\"g\u0093'\u0086¾\u0090\u0019Ø(úFry\u0011g¹ÒH\f¿\rRï\u0087î tÝ#·Ä¨÷ïðë\u0004Mð\u0093F£ó4áE0~Óq6«-Ö®ëîXX\b$6÷|¾¼ ËTwü>\u0082\u0087\u0082s\u001c\u0002Õ\u009ayº\u001cN\u0000ÑÉP\u0087´\u0091às¦ÚD\u001bÝXH¨fvj\u0098äÈ\u008e\u0004x\u0095\u0001\u0085è\u000e\u000eÌQè\u0099Jaç\u008aOÄi\u0083\u0002\u0099\u0089è¢:\u0015\u008f\u009e¬q#C\u0019Aý¡\tS\u0018\u009d\u008c}I\u001cÜª\n¬ï-:É(íU\u0010=\bÃ6óÐ\u001d\u0010\u001b\u0000\u008d;û<\u007f\t%\u0018\u0018kÌÄ¥\u0010 â©çsÞù!}ÐøÂ#nå)Ü\u001ft$#=Ö¹\u0011Ò\u009e«\u0018Êq\u0005'0\u0000ñú\u009c\u000evZêÕÑ\u0016\u0096ç|ÝÀ\u008a\u001d7\u00978\u009eg§©\u0093fmXõì÷T\b¹Å6\u001e\u0014züYU\u0017Â°Ñ=8G÷\b\u000f\u009bÚMÉ¨Ø¢[\u00165\nÓô0P\u000eÅ\u0016âgÄkj×òË\u0098Ä\u0003\u0096\u001a±wbð{\u0019ð\u0084l\u0090\u008dz\u0001\t\u000bã½¼\u0097\u0098\n\u0080\u0085\u009c\u0019\u0082\u009a\u008bt\u0019Êó\u0012\rñ\u0005Û\u001b#¯\u009b\u0014.*PoMôn\u0010ÝÓ\u0086Ï\u009f-Ñ¾u\u0096iÏeóÞA\u0087å\u0006òV\u0016(×9ß\u0083\u0013ñæÿ\u0018\t\u0083\u007fj!Gíg\u0014$B\u009c@ß¾®sè©T²ù@¡\u009d/µ\u001b\u0094EàW\u0016 4\u0006ì9'à*Ã\u0006eäOÆ\r\u0093\u0082ßú\"ÑÖ·[^\u0011 ªJ\u0086±e\\L\u009a\u0018\u000bW\u0005\u008c\u000bU¼-\u0018\u0098Z\u0016q\u008ffÿ·kXçBi/ñ )··\u008bÿC\u001a$×ëq\u001d\u0015¯k²\u001daÑ@?¼î\u0002,\u0016£\u0092\u0082ÓèO\u0018¤á\u0093\u0094sÆQ`É[\u0097`\u008cÜª\u009b9nÁGÎëÎM ü&°¬b\u0014ÖÏ#Å! \u008fa3\u0096i¤ÒG©: a\u0001\u0012ÆÕÜ\u0005µ\u0013 ËÓpVH\u0016\u001e\u0094îWð Â÷lÉ¬9G©¡\u0005Y»ZÛ\u008a\u0013¾Ù\u001fo\u0018æ\u0015µÄO\u0001.ä\u0012xQ0\u0007â8{ç\u007f¾\u008fÙÌ\u0011g å\u0084Ñ¦}mhGfáKÂ\u009bÉ»h·hoY\u008bl+èl§Ë\u0019\u008eeú\u0091\u0018\u0092Ûã\u0017unUE\u0010³TÃýÿ¥Â¦Ü\u0002\u0088sHê\u0005(8ÍÅ\u0085\u0087£Î1<\u000bHJ\u0095D=«Ã«5\u001fLª\u000b@\f\u0017ãò\u0098\u0092\u0003\nI\u0014yC\u0094\rhº z_¨Cú\u0017sêXºá7\u0015y?S\u0017ò\u000eáÊ³\u000fìk`*a\u008b¦`ä(ë\u0005\u001dQàÙ5H¹!\u0015'ÜZ\u00ad¹ÿÍø'\u0087Á}ß\u00040y§×P÷gÀE²H\u001dÁ\u0015â â\u0098ÉòÄo¢QåëÅ¶NÎ5¢Gn±`IÇ\u009aÓ\u0096O&o[]jv(E¨A-\u000f¯\u008bdØ\u001cÆ\u008f÷;â1\u008a·gHÎ-£öD®\u0084Û}HÜ·í°ýk\\x®Ú\u0010Ûþ\rÊ\u008d/ÞTãì\u0011Dû\u008em\u008b ýX\u008c[#\fÜ\u0096hüdÙ¤ã\u00178\u0018w*ÞtÁÞ\u000f\u0014\u001aÁËkÔ\tA\u0010íd\u000eÚsÅ\u001dÚÙ.%¾\u0014\n\u0018&\u0018fË®èß¯ÌÖ°ÚIêM\u00143a§»\u001bú,Ô\u00ad·";
int var17 = "\u008aâõûã° nÌ°A\u0016häÃ¶o\u001dôò\u008a\u0084df\u0084\u0098õú9[%\u009e8g¹\u0083ÔøO±\u0011&îÓî\u0002wRÞ \u0015\u0000°\u0002\u0091\\}oæ\r&\u0089oDª2%d\u0096ª]\u0006\tT\u000fÿR¦\\·\u0085½Å´ÎüEh×(4\u0011%>0àMÒð\u0092\u0016\u0083\u0097lá¡Ú\tQ@\u008f8 \u007fþ$\u001býyJ\no\u001aÇ\u0001\u008c«^Ú\u0085(M¼\u0004ó7«óÒ¶\u0094J+·Â½\u0080Oy]Î¿£\u001búr¶@E\u0095\u0006R6 °°W\u0018Q $ r\u0016³%õ\f\"g\u0093'\u0086¾\u0090\u0019Ø(úFry\u0011g¹ÒH\f¿\rRï\u0087î tÝ#·Ä¨÷ïðë\u0004Mð\u0093F£ó4áE0~Óq6«-Ö®ëîXX\b$6÷|¾¼ ËTwü>\u0082\u0087\u0082s\u001c\u0002Õ\u009ayº\u001cN\u0000ÑÉP\u0087´\u0091às¦ÚD\u001bÝXH¨fvj\u0098äÈ\u008e\u0004x\u0095\u0001\u0085è\u000e\u000eÌQè\u0099Jaç\u008aOÄi\u0083\u0002\u0099\u0089è¢:\u0015\u008f\u009e¬q#C\u0019Aý¡\tS\u0018\u009d\u008c}I\u001cÜª\n¬ï-:É(íU\u0010=\bÃ6óÐ\u001d\u0010\u001b\u0000\u008d;û<\u007f\t%\u0018\u0018kÌÄ¥\u0010 â©çsÞù!}ÐøÂ#nå)Ü\u001ft$#=Ö¹\u0011Ò\u009e«\u0018Êq\u0005'0\u0000ñú\u009c\u000evZêÕÑ\u0016\u0096ç|ÝÀ\u008a\u001d7\u00978\u009eg§©\u0093fmXõì÷T\b¹Å6\u001e\u0014züYU\u0017Â°Ñ=8G÷\b\u000f\u009bÚMÉ¨Ø¢[\u00165\nÓô0P\u000eÅ\u0016âgÄkj×òË\u0098Ä\u0003\u0096\u001a±wbð{\u0019ð\u0084l\u0090\u008dz\u0001\t\u000bã½¼\u0097\u0098\n\u0080\u0085\u009c\u0019\u0082\u009a\u008bt\u0019Êó\u0012\rñ\u0005Û\u001b#¯\u009b\u0014.*PoMôn\u0010ÝÓ\u0086Ï\u009f-Ñ¾u\u0096iÏeóÞA\u0087å\u0006òV\u0016(×9ß\u0083\u0013ñæÿ\u0018\t\u0083\u007fj!Gíg\u0014$B\u009c@ß¾®sè©T²ù@¡\u009d/µ\u001b\u0094EàW\u0016 4\u0006ì9'à*Ã\u0006eäOÆ\r\u0093\u0082ßú\"ÑÖ·[^\u0011 ªJ\u0086±e\\L\u009a\u0018\u000bW\u0005\u008c\u000bU¼-\u0018\u0098Z\u0016q\u008ffÿ·kXçBi/ñ )··\u008bÿC\u001a$×ëq\u001d\u0015¯k²\u001daÑ@?¼î\u0002,\u0016£\u0092\u0082ÓèO\u0018¤á\u0093\u0094sÆQ`É[\u0097`\u008cÜª\u009b9nÁGÎëÎM ü&°¬b\u0014ÖÏ#Å! \u008fa3\u0096i¤ÒG©: a\u0001\u0012ÆÕÜ\u0005µ\u0013 ËÓpVH\u0016\u001e\u0094îWð Â÷lÉ¬9G©¡\u0005Y»ZÛ\u008a\u0013¾Ù\u001fo\u0018æ\u0015µÄO\u0001.ä\u0012xQ0\u0007â8{ç\u007f¾\u008fÙÌ\u0011g å\u0084Ñ¦}mhGfáKÂ\u009bÉ»h·hoY\u008bl+èl§Ë\u0019\u008eeú\u0091\u0018\u0092Ûã\u0017unUE\u0010³TÃýÿ¥Â¦Ü\u0002\u0088sHê\u0005(8ÍÅ\u0085\u0087£Î1<\u000bHJ\u0095D=«Ã«5\u001fLª\u000b@\f\u0017ãò\u0098\u0092\u0003\nI\u0014yC\u0094\rhº z_¨Cú\u0017sêXºá7\u0015y?S\u0017ò\u000eáÊ³\u000fìk`*a\u008b¦`ä(ë\u0005\u001dQàÙ5H¹!\u0015'ÜZ\u00ad¹ÿÍø'\u0087Á}ß\u00040y§×P÷gÀE²H\u001dÁ\u0015â â\u0098ÉòÄo¢QåëÅ¶NÎ5¢Gn±`IÇ\u009aÓ\u0096O&o[]jv(E¨A-\u000f¯\u008bdØ\u001cÆ\u008f÷;â1\u008a·gHÎ-£öD®\u0084Û}HÜ·í°ýk\\x®Ú\u0010Ûþ\rÊ\u008d/ÞTãì\u0011Dû\u008em\u008b ýX\u008c[#\fÜ\u0096hüdÙ¤ã\u00178\u0018w*ÞtÁÞ\u000f\u0014\u001aÁËkÔ\tA\u0010íd\u000eÚsÅ\u001dÚÙ.%¾\u0014\n\u0018&\u0018fË®èß¯ÌÖ°ÚIêM\u00143a§»\u001bú,Ô\u00ad·"
.length();
char var14 = ' ';
int var40 = -1;

label54:
while (true) {
String var41 = var15.substring(++var40, var40 + var14);
byte var45 = -1;

while (true) {
byte[] var19 = var11.doFinal(var41.getBytes("ISO-8859-1"));
String var53 = b(var19).intern();
switch (var45) {
case 0:
var18[var16++] = var53;
if ((var40 += var14) >= var17) {
d = var18;
f = new String[32];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[32];
int var3 = 0;
String var4 = "å·ìuø£\u008aìãë\u009ax0î\u001f\u001c!\bz\u0081ºt\u0088÷Ì»7\u0097§®\u0086öð=\u0088¿eÃ¨ñ¼L±Ú[¤Ý*\u0091\u0007X\u0006\u007f!ÚZ$LË\u0095´\u001a\u0091\u0010ß\u007fØó~Uîe·¬\u0005øìªb\u008eg0\u001b:t\u0090vjåä¼ðª\u0004ê]´\u0018\u008e+É\u0010\tÃT\u001218\u001dùï\u009a\u001fTN\"îÐÔÃªûÄîrj\u008ffº\u0093TÚÃE«®¼\u0001k¦\u0003[t¯²ýâ\"ùxVÇ]ï;+¼réÎu9\u0005F©~ÓºQ´wûYF`\u009d\n*_MÙ+\u0098ÛO'¾Ü\u0006bÌ'\r_\u0081½ao\b\u0006ÜÌ]jì;!~ª6$\u0003Ì¹y»6\u0092ÞQÂ\u0015ð\u0004\u0084L\u001bÏ-[M)~\u0087\u008al¨C\u0094v";
int var5 = "å·ìuø£\u008aìãë\u009ax0î\u001f\u001c!\bz\u0081ºt\u0088÷Ì»7\u0097§®\u0086öð=\u0088¿eÃ¨ñ¼L±Ú[¤Ý*\u0091\u0007X\u0006\u007f!ÚZ$LË\u0095´\u001a\u0091\u0010ß\u007fØó~Uîe·¬\u0005øìªb\u008eg0\u001b:t\u0090vjåä¼ðª\u0004ê]´\u0018\u008e+É\u0010\tÃT\u001218\u001dùï\u009a\u001fTN\"îÐÔÃªûÄîrj\u008ffº\u0093TÚÃE«®¼\u0001k¦\u0003[t¯²ýâ\"ùxVÇ]ï;+¼réÎu9\u0005F©~ÓºQ´wûYF`\u009d\n*_MÙ+\u0098ÛO'¾Ü\u0006bÌ'\r_\u0081½ao\b\u0006ÜÌ]jì;!~ª6$\u0003Ì¹y»6\u0092ÞQÂ\u0015ð\u0004\u0084L\u001bÏ-[M)~\u0087\u008al¨C\u0094v"
.length();
byte var2 = 0;

label36:
while (true) {
byte var49 = var2;
var2 += 8;
byte[] var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
long[] var44 = var6;
int var50 = var3++;
long var57 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var60 = -1;

while (true) {
long var8 = var57;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var60) {
case 0:
var44[var50] = var62;
if (var2 >= var5) {
h = var6;
i = new Integer[32];
KProperty[] var37 = new KProperty[c<"g">(22958, 396171843830718538L ^ var20)];
var37[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q4.class, b<"r">(118, 6542433078880103733L ^ var20), b<"r">(13081, 6109330138812833365L ^ var20), 0)
);
var37[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q4.class, b<"r">(12791, 8419343971846479029L ^ var20), b<"r">(15377, 7193053023388324176L ^ var20), 0)
);
var37[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q4.class, b<"r">(2359, 6990159186813346928L ^ var20), b<"r">(26654, 7905070343904068928L ^ var20), 0)
);
var37[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q4.class, b<"r">(7045, 5711185566693291737L ^ var20), b<"r">(1227, 8930973855304018329L ^ var20), 0)
);
var37[4] = Reflection.property1(
new PropertyReference1Impl(q4.class, b<"r">(32426, 5086728743264982007L ^ var20), b<"r">(25170, 6512324658779328276L ^ var20), 0)
);
var37[5] = Reflection.property1(
new PropertyReference1Impl(q4.class, b<"r">(8315, 8932279625054309672L ^ var20), b<"r">(22392, 2339744591628384828L ^ var20), 0)
);
var37[c<"g">(12009, 7285982662115022604L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q4.class, b<"r">(25333, 6103412627106729917L ^ var20), b<"r">(8436, 4893714725506371001L ^ var20), 0)
);
e = var37;
c = new q4((short)var24, var25, var26);
W = yp.y(c, b<"r">(24052, 4665748722283950269L ^ var20), q4::A, var35, null, null, c<"g">(18536, 7889884921795719573L ^ var20), null);
N = yp.j(var22, c, b<"r">(25453, 4454992121660050999L ^ var20), new nv(null, 1, var27, null), null, null, c<"g">(13281, 5087763307980278275L ^ var20), null);
x = yp.L(
c,
b<"r">(26590, 1499977583325481615L ^ var20),
0,
new IntRange(0, c<"g">(7595, 917481506195661915L ^ var20)),
var29,
null,
null,
c<"g">(16978, 5993283589486328754L ^ var20),
null
);
b = yp.L(c, b<"r">(20396, 5029079960517976809L ^ var20), 1, new IntRange(1, 3), var29, null, null, c<"g">(24254, 2803672037221345097L ^ var20), null);
P = yp.L(c, b<"r">(24766, 4172906254101646821L ^ var20), r7.OFF, null, null, c<"g">(13281, 5087763307980278275L ^ var20), null, var33);
y = yp.L(
c,
b<"r">(30538, 2975425306703370783L ^ var20),
c<"g">(5113, 8243303436860811776L ^ var20),
new IntRange(0, c<"g">(15144, 2035473279084151504L ^ var20)),
var29,
null,
q4::r,
c<"g">(22302, 7025506791195815667L ^ var20),
null
);
u = yp.t(c, b<"r">(19732, 7599369423669076035L ^ var20), false, var31, null, q4::g, 4, null);
l = new bg();
return;
}
break;
default:
var44[var50] = var62;
if (var2 < var5) {
continue label36;
}

var4 = "¯¥4¦Ú\u007fcÃÌßH4\u0093j\u0080å";
var5 = "¯¥4¦Ú\u007fcÃÌßH4\u0093j\u0080å".length();
var2 = 0;
}

byte var51 = var2;
var2 += 8;
var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
var44 = var6;
var50 = var3++;
var57 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var60 = 0;
}
}
}

var14 = var15.charAt(var40);
break;
default:
var18[var16++] = var53;
if ((var40 += var14) < var17) {
var14 = var15.charAt(var40);
continue label54;
}

var15 = "ËE\u001dÞ3Ô7Ã`½`¢\u0096°#2r\u009c\u0097\u0016=\u0010 \u007f \u007fÌ\\Z¹\u0007]¡)¿\u0080\u008a30Â\u0095ä¤Ü\u008c´º\u0002³ÔQ%\u0011Õ\u0006Et";
var17 = "ËE\u001dÞ3Ô7Ã`½`¢\u0096°#2r\u009c\u0097\u0016=\u0010 \u007f \u007fÌ\\Z¹\u0007]¡)¿\u0080\u008a30Â\u0095ä¤Ü\u008c´º\u0002³ÔQ%\u0011Õ\u0006Et".length();
var14 = 24;
var40 = -1;
}

var41 = var15.substring(++var40, var40 + var14);
var45 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9915;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/q4", var10);
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
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/q4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12809;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/q4", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/q4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
