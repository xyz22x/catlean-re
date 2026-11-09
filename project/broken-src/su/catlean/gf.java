package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.lwjgl.glfw.GLFW;
import su.catlean.api.event.events.client.InputEvent.Action;

public abstract class gf implements jk, ap {
static final KProperty[] d;
@NotNull
private final String D;
@NotNull
private final List A;
@NotNull
private final List M;
@NotNull
private final bj P;
@NotNull
private final cq L;
@NotNull
private final ch e;
@NotNull
private bj j;
private boolean w;
private float C;
private float V;
private float T;
private float X;
private boolean s;
private float r;
private float v;
@NotNull
private final String t;
private static String W;
private static final long u = yz.a(4051785881732570208L, 7133493794591131875L, MethodHandles.lookup().lookupClass()).a(221274452969961L);
private static final String[] Z;
private static final String[] ab;
private static final Map bb = new HashMap(13);
private static final long[] cb;
private static final Integer[] db;
private static final Map eb;

public gf(char a, int a, @NotNull String id, char a) {
long var5 = ((long)a << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ u;
long var7 = var5 ^ 40888500351373L;
long var9 = var5 ^ 62110260963740L;
long var11 = var5 ^ 15155652999541L;
Intrinsics.checkNotNullParameter(id, a<"a">(18676, 1447132240203557234L ^ var5));
super();
this.D = id;
this.A = new ArrayList();
this.M = new ArrayList();
this.P = new bj(a<"a">(13030, 2374735501780702066L ^ var5), c<"b">(32164, 786736703198575307L ^ var5), c<"b">(6094, 8307027085198905519L ^ var5), var7);
this.L = yp.t(this, a<"a">(11380, 4753309577243741694L ^ var5), false, var9, null, null, c<"b">(6094, 8307027085198905519L ^ var5), null);
this.e = yp.x(this, a<"a">(15279, 2939294145549195814L ^ var5), new d_(0.5F, 0.5F), var11, null, null, c<"b">(6094, 8307027085198905519L ^ var5), null);
this.j = new bj(this.D, c<"b">(10755, 5050791001288994152L ^ var5), c<"b">(19208, 6662134608897576043L ^ var5), var7);
StringBuilder var13 = new StringBuilder();
StringBuilder var14 = var13;
boolean var15 = false;
CharSequence var10000 = this.D;
String[] var16 = new String[]{"-"};
Iterable var30 = StringsKt.split$default(var10000, var16, false, 0, c<"b">(31240, 3148511351767285101L ^ var5), null);
boolean var17 = false;
Iterator var18 = var30.iterator();

while (true) {
if (var18.hasNext()) {
Object var19 = var18.next();
String var20 = (String)var19;
boolean var21 = false;
if (a < 0) {
break;
}

StringBuilder var32 = var14;
String var22 = var20;

int var10001;
label35: {
try {
var10001 = var22.length();
if (axx <= 0) {
break label35;
}

if (var10001 > 0) {
var10001 = 1;
break label35;
}
} catch (UnsupportedOperationException var29) {
throw vm.a<"Å">(var29, -1266556484570324810L, var5);
}

var10001 = 0;
}

String var37;
if (var10001 != 0) {
StringBuilder var35 = new StringBuilder();
char var23 = var20.charAt(0);
StringBuilder var24 = var35;
byte var26 = 0;
String var33 = String.valueOf(var23);
Intrinsics.checkNotNull(var33, a<"a">(9905, 5604945973939062562L ^ var5));
String var34 = var33.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var34, a<"a">(32476, 4138707645609647959L ^ var5));
CharSequence var27 = var34;
var32 = var14;
StringBuilder var36 = var24.append((Object)var27);
var26 = 1;
String var10002 = var20.substring(var26);
Intrinsics.checkNotNullExpressionValue(var10002, a<"a">(30103, 933704770997097497L ^ var5));
var37 = var36.append(var10002).toString();
} else {
var37 = var20;
}

var32.append(var37);
var14.append((char)c<"b">(11271, 6231699029711678309L ^ var5));
StringsKt.trim(var14);
if (axx > 0) {
continue;
}
}

this.t = var13.toString();
break;
}
}

@NotNull
public final String I() {
return this.D;
}

@NotNull
@Override
public List c() {
return this.A;
}

@NotNull
@Override
public List u() {
return this.M;
}

public final boolean U(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ u;
long var6 = var4 ^ 42830412438711L;
return (Boolean)this.L.E(this, var6, d[0]);
}

public final void S(long a, boolean <set-?>) {
a = u ^ a;
long var4 = a ^ 18304019655099L;
this.L.b(this, var4, d[0], <set-?>);
}

@NotNull
public final d_ T(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 101591507570986L;
return (d_)this.e.E(this, var3, d[1]);
}

public final void o(@NotNull d_ <set-?>, long a) {
a = u ^ a;
long var4 = a ^ 86083090227906L;
Intrinsics.checkNotNullParameter(<set-?>, a<"a">(22747, 1307705875522727721L ^ a));
this.e.b(this, var4, d[1], <set-?>);
}

@NotNull
public final bj x() {
return this.j;
}

public final float F() {
return this.r;
}

public final void w(float <set-?>) {
this.r = <set-?>;
}

public final float Y() {
return this.v;
}

public final void O(float <set-?>) {
this.v = <set-?>;
}

@NotNull
public final String A() {
return this.t;
}

@Override
public void J(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 65469789313429
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 24976244493437
// 0b: lxor
// 0c: dup2
// 0d: bipush 48
// 0f: lushr
// 10: l2i
// 11: istore 5
// 13: dup2
// 14: bipush 16
// 16: lshl
// 17: bipush 48
// 19: lushr
// 1a: l2i
// 1b: istore 6
// 1d: dup2
// 1e: bipush 32
// 20: lshl
// 21: bipush 32
// 23: lushr
// 24: l2i
// 25: istore 7
// 27: pop2
// 28: dup2
// 29: ldc2_w 67469537118988
// 2c: lxor
// 2d: dup2
// 2e: bipush 56
// 30: lushr
// 31: l2i
// 32: istore 8
// 34: dup2
// 35: bipush 8
// 37: lshl
// 38: bipush 8
// 3a: lushr
// 3b: lstore 9
// 3d: pop2
// 3e: pop2
// 3f: ldc2_w -530648882990635844
// 42: lload 1
// 43: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: astore 11
// 4a: aload 0
// 4b: aload 11
// 4d: ifnonnull 90
// 50: iload 5
// 52: i2s
// 53: iload 6
// 55: i2c
// 56: iload 7
// 58: invokevirtual su/catlean/gf.U (SCI)Z
// 5b: ifeq 82
// 5e: goto 6b
// 61: ldc2_w -564810626170751245
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 0
// 6c: lload 3
// 6d: invokevirtual su/catlean/gf.d (J)V
// 70: aload 11
// 72: ifnull 98
// 75: goto 82
// 78: ldc2_w -564810626170751245
// 7b: lload 1
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: aload 0
// 83: goto 90
// 86: ldc2_w -564810626170751245
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: iload 8
// 92: i2b
// 93: lload 9
// 95: invokevirtual su/catlean/gf.o (BJ)V
// 98: return
}

@Override
public void o(byte var1, long var2) {
long var4 = (long)var1 << 56 | var2 << 8 >>> 8;
long var6 = var4 ^ 44318043563409L;
this.S(var6, true);
}

@Override
public void d(long var1) {
long var3 = var1 ^ 51235729995528L;
this.S(var3, false);
}

public abstract void h(long var1, @NotNull class_332 var3);

public void H(@NotNull class_332 context, long a) {
Intrinsics.checkNotNullParameter(context, a<"a">(27214, 2055742814358847666L ^ a));
}

public void w(long var1) {
}

public final void O(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gf.u J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 84623141345956
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 37072294968329
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 55505014010482
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 101781446079682
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 23874562866950
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 20421222943425
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 126015257312524
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: lstore 16
// 03c: dup2
// 03d: bipush 32
// 03f: lshl
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 18
// 046: pop2
// 047: dup2
// 048: ldc2_w 93013119657971
// 04b: lxor
// 04c: lstore 19
// 04e: dup2
// 04f: ldc2_w 126577046119950
// 052: lxor
// 053: dup2
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 21
// 05a: dup2
// 05b: bipush 16
// 05d: lshl
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 22
// 064: dup2
// 065: bipush 32
// 067: lshl
// 068: bipush 32
// 06a: lushr
// 06b: l2i
// 06c: istore 23
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 111815296541763
// 073: lxor
// 074: lstore 24
// 076: dup2
// 077: ldc2_w 10394756995617
// 07a: lxor
// 07b: lstore 26
// 07d: dup2
// 07e: ldc2_w 32581950462863
// 081: lxor
// 082: lstore 28
// 084: dup2
// 085: ldc2_w 17570352720518
// 088: lxor
// 089: lstore 30
// 08b: dup2
// 08c: ldc2_w 131800286005017
// 08f: lxor
// 090: lstore 32
// 092: dup2
// 093: ldc2_w 122213779567259
// 096: lxor
// 097: dup2
// 098: bipush 48
// 09a: lushr
// 09b: l2i
// 09c: istore 34
// 09e: dup2
// 09f: bipush 16
// 0a1: lshl
// 0a2: bipush 48
// 0a4: lushr
// 0a5: l2i
// 0a6: istore 35
// 0a8: dup2
// 0a9: bipush 32
// 0ab: lshl
// 0ac: bipush 32
// 0ae: lushr
// 0af: l2i
// 0b0: istore 36
// 0b2: pop2
// 0b3: dup2
// 0b4: ldc2_w 16840114605940
// 0b7: lxor
// 0b8: lstore 37
// 0ba: dup2
// 0bb: ldc2_w 22163473338182
// 0be: lxor
// 0bf: lstore 39
// 0c1: pop2
// 0c2: ldc2_w 5063374428040469082
// 0c5: lload 1
// 0c6: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: aload 3
// 0cc: sipush 27214
// 0cf: ldc2_w 2055676243023569769
// 0d2: lload 1
// 0d3: lxor
// 0d4: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0dc: astore 41
// 0de: aload 0
// 0df: lload 30
// 0e1: aload 3
// 0e2: invokevirtual su/catlean/gf.h (JLnet/minecraft/class_332;)V
// 0e5: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 0e8: invokevirtual su/catlean/w8.C ()Ljava/util/List;
// 0eb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0f0: astore 42
// 0f2: aload 42
// 0f4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f9: ifeq 5fc
// 0fc: aload 42
// 0fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 103: checkcast su/catlean/gf
// 106: astore 43
// 108: aload 43
// 10a: aload 0
// 10b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 10e: aload 41
// 110: lload 1
// 111: lconst_0
// 112: lcmp
// 113: iflt 619
// 116: lload 1
// 117: lconst_0
// 118: lcmp
// 119: iflt 619
// 11c: ifnonnull 617
// 11f: aload 41
// 121: ifnonnull 160
// 124: goto 131
// 127: ldc2_w 5102325672630372373
// 12a: lload 1
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: ifne 0f2
// 134: goto 141
// 137: ldc2_w 5102325672630372373
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 43
// 143: aload 41
// 145: ifnonnull 168
// 148: iload 34
// 14a: i2s
// 14b: iload 35
// 14d: i2c
// 14e: iload 36
// 150: invokevirtual su/catlean/gf.U (SCI)Z
// 153: goto 160
// 156: ldc2_w 5102325672630372373
// 159: lload 1
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: ifne 166
// 163: goto 0f2
// 166: aload 43
// 168: lload 39
// 16a: invokevirtual su/catlean/gf.p (J)F
// 16d: fstore 44
// 16f: aload 43
// 171: getfield su/catlean/gf.v F
// 174: aload 43
// 176: lload 39
// 178: invokevirtual su/catlean/gf.p (J)F
// 17b: fadd
// 17c: fstore 45
// 17e: aload 0
// 17f: lload 39
// 181: invokevirtual su/catlean/gf.p (J)F
// 184: fstore 46
// 186: fload 44
// 188: fload 46
// 18a: fcmpg
// 18b: aload 41
// 18d: lload 1
// 18e: lconst_0
// 18f: lcmp
// 190: ifle 1ba
// 193: ifnonnull 1b8
// 196: ifgt 1df
// 199: goto 1a6
// 19c: ldc2_w 5102325672630372373
// 19f: lload 1
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: fload 46
// 1a8: fload 45
// 1aa: fcmpg
// 1ab: goto 1b8
// 1ae: ldc2_w 5102325672630372373
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: aload 41
// 1ba: ifnonnull 1dc
// 1bd: ifgt 1db
// 1c0: goto 1cd
// 1c3: ldc2_w 5102325672630372373
// 1c6: lload 1
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: bipush 1
// 1ce: goto 1e0
// 1d1: ldc2_w 5102325672630372373
// 1d4: lload 1
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: bipush 0
// 1dc: goto 1e0
// 1df: bipush 0
// 1e0: ifeq 438
// 1e3: aload 43
// 1e5: lload 6
// 1e7: invokevirtual su/catlean/gf.V (J)F
// 1ea: fstore 44
// 1ec: aload 43
// 1ee: lload 6
// 1f0: invokevirtual su/catlean/gf.V (J)F
// 1f3: aload 43
// 1f5: getfield su/catlean/gf.r F
// 1f8: fadd
// 1f9: fstore 45
// 1fb: aload 0
// 1fc: lload 6
// 1fe: invokevirtual su/catlean/gf.V (J)F
// 201: fstore 46
// 203: fload 44
// 205: fload 46
// 207: fcmpg
// 208: aload 41
// 20a: lload 1
// 20b: lconst_0
// 20c: lcmp
// 20d: iflt 237
// 210: ifnonnull 235
// 213: ifgt 25c
// 216: goto 223
// 219: ldc2_w 5102325672630372373
// 21c: lload 1
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: fload 46
// 225: fload 45
// 227: fcmpg
// 228: goto 235
// 22b: ldc2_w 5102325672630372373
// 22e: lload 1
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: aload 41
// 237: ifnonnull 259
// 23a: ifgt 258
// 23d: goto 24a
// 240: ldc2_w 5102325672630372373
// 243: lload 1
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: bipush 1
// 24b: goto 25d
// 24e: ldc2_w 5102325672630372373
// 251: lload 1
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: bipush 0
// 259: goto 25d
// 25c: bipush 0
// 25d: ifeq 438
// 260: aload 43
// 262: lload 39
// 264: invokevirtual su/catlean/gf.p (J)F
// 267: aload 43
// 269: getfield su/catlean/gf.v F
// 26c: fadd
// 26d: fconst_2
// 26e: fadd
// 26f: aload 0
// 270: lload 19
// 272: invokevirtual su/catlean/gf.r (J)I
// 275: i2f
// 276: fdiv
// 277: fstore 44
// 279: aload 43
// 27b: lload 6
// 27d: invokevirtual su/catlean/gf.V (J)F
// 280: aload 43
// 282: getfield su/catlean/gf.r F
// 285: fadd
// 286: fconst_2
// 287: fadd
// 288: aload 0
// 289: lload 24
// 28b: invokevirtual su/catlean/gf.l (J)I
// 28e: i2f
// 28f: fdiv
// 290: fstore 45
// 292: ldc 5.0
// 294: aload 0
// 295: lload 24
// 297: invokevirtual su/catlean/gf.l (J)I
// 29a: i2f
// 29b: fdiv
// 29c: fconst_1
// 29d: aload 0
// 29e: getfield su/catlean/gf.r F
// 2a1: aload 0
// 2a2: lload 24
// 2a4: invokevirtual su/catlean/gf.l (J)I
// 2a7: i2f
// 2a8: fdiv
// 2a9: fsub
// 2aa: invokestatic java/lang/Math.min (FF)F
// 2ad: fstore 46
// 2af: ldc 5.0
// 2b1: aload 0
// 2b2: lload 24
// 2b4: invokevirtual su/catlean/gf.l (J)I
// 2b7: i2f
// 2b8: fdiv
// 2b9: fconst_1
// 2ba: aload 0
// 2bb: getfield su/catlean/gf.r F
// 2be: aload 0
// 2bf: lload 24
// 2c1: invokevirtual su/catlean/gf.l (J)I
// 2c4: i2f
// 2c5: fdiv
// 2c6: fsub
// 2c7: invokestatic java/lang/Math.max (FF)F
// 2ca: fstore 47
// 2cc: aload 43
// 2ce: lload 39
// 2d0: invokevirtual su/catlean/gf.p (J)F
// 2d3: aload 0
// 2d4: lload 39
// 2d6: invokevirtual su/catlean/gf.p (J)F
// 2d9: fcmpg
// 2da: aload 41
// 2dc: ifnonnull 2f0
// 2df: ifne 2f3
// 2e2: goto 2ef
// 2e5: ldc2_w 5102325672630372373
// 2e8: lload 1
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: bipush 1
// 2f0: goto 2f4
// 2f3: bipush 0
// 2f4: lload 1
// 2f5: lconst_0
// 2f6: lcmp
// 2f7: iflt 36f
// 2fa: ifne 361
// 2fd: aload 43
// 2ff: lload 6
// 301: invokevirtual su/catlean/gf.V (J)F
// 304: aload 0
// 305: lload 6
// 307: invokevirtual su/catlean/gf.V (J)F
// 30a: fcmpg
// 30b: aload 41
// 30d: ifnonnull 32e
// 310: goto 31d
// 313: ldc2_w 5102325672630372373
// 316: lload 1
// 317: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31c: athrow
// 31d: ifne 331
// 320: goto 32d
// 323: ldc2_w 5102325672630372373
// 326: lload 1
// 327: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: athrow
// 32d: bipush 1
// 32e: goto 332
// 331: bipush 0
// 332: lload 1
// 333: lconst_0
// 334: lcmp
// 335: ifle 36f
// 338: ifeq 361
// 33b: aload 0
// 33c: lload 12
// 33e: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 341: fload 44
// 343: ldc 5.0
// 345: aload 0
// 346: lload 19
// 348: invokevirtual su/catlean/gf.r (J)I
// 34b: i2f
// 34c: fdiv
// 34d: fconst_1
// 34e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 351: invokevirtual su/catlean/d_.y (F)V
// 354: goto 361
// 357: ldc2_w 5102325672630372373
// 35a: lload 1
// 35b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 360: athrow
// 361: aload 43
// 363: lload 6
// 365: invokevirtual su/catlean/gf.V (J)F
// 368: aload 0
// 369: lload 6
// 36b: invokevirtual su/catlean/gf.V (J)F
// 36e: fcmpg
// 36f: aload 41
// 371: ifnonnull 385
// 374: ifne 388
// 377: goto 384
// 37a: ldc2_w 5102325672630372373
// 37d: lload 1
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: bipush 1
// 385: goto 389
// 388: bipush 0
// 389: lload 1
// 38a: lconst_0
// 38b: lcmp
// 38c: ifle 446
// 38f: ifne 438
// 392: aload 43
// 394: lload 39
// 396: invokevirtual su/catlean/gf.p (J)F
// 399: aload 0
// 39a: lload 39
// 39c: invokevirtual su/catlean/gf.p (J)F
// 39f: fcmpg
// 3a0: aload 41
// 3a2: ifnonnull 3c3
// 3a5: goto 3b2
// 3a8: ldc2_w 5102325672630372373
// 3ab: lload 1
// 3ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b1: athrow
// 3b2: ifne 3c6
// 3b5: goto 3c2
// 3b8: ldc2_w 5102325672630372373
// 3bb: lload 1
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: bipush 1
// 3c3: goto 3c7
// 3c6: bipush 0
// 3c7: lload 1
// 3c8: lconst_0
// 3c9: lcmp
// 3ca: iflt 3e9
// 3cd: ifne 419
// 3d0: aload 43
// 3d2: lload 39
// 3d4: invokevirtual su/catlean/gf.p (J)F
// 3d7: aload 43
// 3d9: getfield su/catlean/gf.v F
// 3dc: fadd
// 3dd: aload 0
// 3de: lload 39
// 3e0: invokevirtual su/catlean/gf.p (J)F
// 3e3: aload 0
// 3e4: getfield su/catlean/gf.v F
// 3e7: fadd
// 3e8: fcmpg
// 3e9: aload 41
// 3eb: ifnonnull 40c
// 3ee: goto 3fb
// 3f1: ldc2_w 5102325672630372373
// 3f4: lload 1
// 3f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fa: athrow
// 3fb: ifne 40f
// 3fe: goto 40b
// 401: ldc2_w 5102325672630372373
// 404: lload 1
// 405: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: athrow
// 40b: bipush 1
// 40c: goto 410
// 40f: bipush 0
// 410: lload 1
// 411: lconst_0
// 412: lcmp
// 413: ifle 446
// 416: ifeq 438
// 419: aload 0
// 41a: lload 12
// 41c: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 41f: fload 45
// 421: fload 46
// 423: fload 47
// 425: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 428: invokevirtual su/catlean/d_.J (F)V
// 42b: goto 438
// 42e: ldc2_w 5102325672630372373
// 431: lload 1
// 432: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 437: athrow
// 438: aload 43
// 43a: lload 6
// 43c: invokevirtual su/catlean/gf.V (J)F
// 43f: aload 0
// 440: lload 6
// 442: invokevirtual su/catlean/gf.V (J)F
// 445: fcmpg
// 446: aload 41
// 448: ifnonnull 45c
// 44b: ifne 45f
// 44e: goto 45b
// 451: ldc2_w 5102325672630372373
// 454: lload 1
// 455: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45a: athrow
// 45b: bipush 1
// 45c: goto 460
// 45f: bipush 0
// 460: lload 1
// 461: lconst_0
// 462: lcmp
// 463: ifle 483
// 466: ifeq 4dd
// 469: aload 43
// 46b: lload 39
// 46d: invokevirtual su/catlean/gf.p (J)F
// 470: aload 43
// 472: getfield su/catlean/gf.v F
// 475: fadd
// 476: aload 0
// 477: lload 39
// 479: invokevirtual su/catlean/gf.p (J)F
// 47c: fsub
// 47d: invokestatic java/lang/Math.abs (F)F
// 480: ldc 10.0
// 482: fcmpg
// 483: aload 41
// 485: lload 1
// 486: lconst_0
// 487: lcmp
// 488: iflt 4ed
// 48b: ifnonnull 4eb
// 48e: goto 49b
// 491: ldc2_w 5102325672630372373
// 494: lload 1
// 495: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49a: athrow
// 49b: ifge 4dd
// 49e: goto 4ab
// 4a1: ldc2_w 5102325672630372373
// 4a4: lload 1
// 4a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4aa: athrow
// 4ab: aload 43
// 4ad: lload 39
// 4af: invokevirtual su/catlean/gf.p (J)F
// 4b2: aload 43
// 4b4: getfield su/catlean/gf.v F
// 4b7: fadd
// 4b8: fconst_2
// 4b9: fadd
// 4ba: aload 0
// 4bb: lload 19
// 4bd: invokevirtual su/catlean/gf.r (J)I
// 4c0: i2f
// 4c1: fdiv
// 4c2: fstore 44
// 4c4: aload 0
// 4c5: lload 12
// 4c7: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 4ca: fload 44
// 4cc: ldc 5.0
// 4ce: aload 0
// 4cf: lload 19
// 4d1: invokevirtual su/catlean/gf.r (J)I
// 4d4: i2f
// 4d5: fdiv
// 4d6: fconst_1
// 4d7: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 4da: invokevirtual su/catlean/d_.y (F)V
// 4dd: aload 43
// 4df: lload 39
// 4e1: invokevirtual su/catlean/gf.p (J)F
// 4e4: aload 0
// 4e5: lload 39
// 4e7: invokevirtual su/catlean/gf.p (J)F
// 4ea: fcmpg
// 4eb: aload 41
// 4ed: ifnonnull 501
// 4f0: ifne 504
// 4f3: goto 500
// 4f6: ldc2_w 5102325672630372373
// 4f9: lload 1
// 4fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ff: athrow
// 500: bipush 1
// 501: goto 505
// 504: bipush 0
// 505: lload 1
// 506: lconst_0
// 507: lcmp
// 508: ifle 527
// 50b: ifne 551
// 50e: aload 43
// 510: lload 39
// 512: invokevirtual su/catlean/gf.p (J)F
// 515: aload 43
// 517: getfield su/catlean/gf.v F
// 51a: fadd
// 51b: aload 0
// 51c: lload 39
// 51e: invokevirtual su/catlean/gf.p (J)F
// 521: aload 0
// 522: getfield su/catlean/gf.v F
// 525: fadd
// 526: fcmpg
// 527: aload 41
// 529: ifnonnull 54a
// 52c: goto 539
// 52f: ldc2_w 5102325672630372373
// 532: lload 1
// 533: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: athrow
// 539: ifne 54d
// 53c: goto 549
// 53f: ldc2_w 5102325672630372373
// 542: lload 1
// 543: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 548: athrow
// 549: bipush 1
// 54a: goto 54e
// 54d: bipush 0
// 54e: ifeq 0f2
// 551: aload 43
// 553: lload 6
// 555: invokevirtual su/catlean/gf.V (J)F
// 558: aload 43
// 55a: getfield su/catlean/gf.r F
// 55d: fadd
// 55e: aload 0
// 55f: lload 6
// 561: invokevirtual su/catlean/gf.V (J)F
// 564: fsub
// 565: invokestatic java/lang/Math.abs (F)F
// 568: lload 1
// 569: lconst_0
// 56a: lcmp
// 56b: ifle 5dd
// 56e: ldc 10.0
// 570: aload 41
// 572: ifnonnull 5da
// 575: fcmpg
// 576: lload 1
// 577: lconst_0
// 578: lcmp
// 579: ifle 0f9
// 57c: ifge 0f2
// 57f: goto 58c
// 582: ldc2_w 5102325672630372373
// 585: lload 1
// 586: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58b: athrow
// 58c: aload 43
// 58e: lload 6
// 590: invokevirtual su/catlean/gf.V (J)F
// 593: aload 43
// 595: getfield su/catlean/gf.r F
// 598: fadd
// 599: fconst_2
// 59a: fadd
// 59b: aload 0
// 59c: lload 24
// 59e: invokevirtual su/catlean/gf.l (J)I
// 5a1: i2f
// 5a2: fdiv
// 5a3: fstore 44
// 5a5: ldc 5.0
// 5a7: aload 0
// 5a8: lload 24
// 5aa: invokevirtual su/catlean/gf.l (J)I
// 5ad: i2f
// 5ae: fdiv
// 5af: fconst_1
// 5b0: aload 0
// 5b1: getfield su/catlean/gf.r F
// 5b4: aload 0
// 5b5: lload 24
// 5b7: invokevirtual su/catlean/gf.l (J)I
// 5ba: i2f
// 5bb: fdiv
// 5bc: fsub
// 5bd: invokestatic java/lang/Math.min (FF)F
// 5c0: fstore 45
// 5c2: ldc 5.0
// 5c4: aload 0
// 5c5: lload 24
// 5c7: invokevirtual su/catlean/gf.l (J)I
// 5ca: i2f
// 5cb: fdiv
// 5cc: fconst_1
// 5cd: aload 0
// 5ce: getfield su/catlean/gf.r F
// 5d1: aload 0
// 5d2: lload 24
// 5d4: invokevirtual su/catlean/gf.l (J)I
// 5d7: i2f
// 5d8: fdiv
// 5d9: fsub
// 5da: invokestatic java/lang/Math.max (FF)F
// 5dd: fstore 46
// 5df: aload 0
// 5e0: lload 12
// 5e2: lload 1
// 5e3: lconst_0
// 5e4: lcmp
// 5e5: ifle 5ff
// 5e8: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 5eb: fload 44
// 5ed: fload 45
// 5ef: fload 46
// 5f1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 5f4: invokevirtual su/catlean/d_.J (F)V
// 5f7: aload 41
// 5f9: ifnull 0f2
// 5fc: aload 0
// 5fd: lload 39
// 5ff: invokevirtual su/catlean/gf.p (J)F
// 602: aload 0
// 603: getfield su/catlean/gf.v F
// 606: fadd
// 607: lload 4
// 609: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 60c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 60f: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 612: i2f
// 613: ldc 5.0
// 615: fsub
// 616: fcmpl
// 617: aload 41
// 619: ifnonnull 68d
// 61c: ifgt 675
// 61f: goto 62c
// 622: ldc2_w 5102325672630372373
// 625: lload 1
// 626: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62b: athrow
// 62c: aload 0
// 62d: lload 39
// 62f: invokevirtual su/catlean/gf.p (J)F
// 632: aload 0
// 633: getfield su/catlean/gf.v F
// 636: fadd
// 637: lload 4
// 639: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 63c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 63f: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 642: i2f
// 643: fsub
// 644: ldc 5.0
// 646: fsub
// 647: invokestatic java/lang/Math.abs (F)F
// 64a: ldc 60.0
// 64c: fcmpg
// 64d: aload 41
// 64f: lload 1
// 650: lconst_0
// 651: lcmp
// 652: ifle 6c6
// 655: ifnonnull 6c4
// 658: goto 665
// 65b: ldc2_w 5102325672630372373
// 65e: lload 1
// 65f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 664: athrow
// 665: ifge 6b9
// 668: goto 675
// 66b: ldc2_w 5102325672630372373
// 66e: lload 1
// 66f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 674: athrow
// 675: lload 4
// 677: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 67a: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 67d: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 680: goto 68d
// 683: ldc2_w 5102325672630372373
// 686: lload 1
// 687: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68c: athrow
// 68d: i2f
// 68e: aload 0
// 68f: getfield su/catlean/gf.v F
// 692: fsub
// 693: ldc 5.0
// 695: fsub
// 696: aload 0
// 697: lload 19
// 699: invokevirtual su/catlean/gf.r (J)I
// 69c: i2f
// 69d: fdiv
// 69e: fstore 42
// 6a0: aload 0
// 6a1: lload 12
// 6a3: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 6a6: fload 42
// 6a8: ldc 5.0
// 6aa: aload 0
// 6ab: lload 19
// 6ad: invokevirtual su/catlean/gf.r (J)I
// 6b0: i2f
// 6b1: fdiv
// 6b2: fconst_1
// 6b3: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 6b6: invokevirtual su/catlean/d_.y (F)V
// 6b9: lload 4
// 6bb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6be: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 6c1: instanceof net/minecraft/class_408
// 6c4: aload 41
// 6c6: lload 1
// 6c7: lconst_0
// 6c8: lcmp
// 6c9: iflt 71f
// 6cc: ifnonnull 71d
// 6cf: ifne 70c
// 6d2: goto 6df
// 6d5: ldc2_w 5102325672630372373
// 6d8: lload 1
// 6d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6de: athrow
// 6df: lload 4
// 6e1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6e4: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 6e7: instanceof su/catlean/rl
// 6ea: aload 41
// 6ec: ifnonnull e21
// 6ef: goto 6fc
// 6f2: ldc2_w 5102325672630372373
// 6f5: lload 1
// 6f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fb: athrow
// 6fc: ifeq e1b
// 6ff: goto 70c
// 702: ldc2_w 5102325672630372373
// 705: lload 1
// 706: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70b: athrow
// 70c: aload 0
// 70d: getfield su/catlean/gf.w Z
// 710: goto 71d
// 713: ldc2_w 5102325672630372373
// 716: lload 1
// 717: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71c: athrow
// 71d: aload 41
// 71f: lload 1
// 720: lconst_0
// 721: lcmp
// 722: iflt a89
// 725: ifnonnull a87
// 728: ifeq a83
// 72b: goto 738
// 72e: ldc2_w 5102325672630372373
// 731: lload 1
// 732: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 737: athrow
// 738: aload 0
// 739: invokevirtual su/catlean/gf.N ()F
// 73c: aload 0
// 73d: getfield su/catlean/gf.C F
// 740: fsub
// 741: aload 0
// 742: lload 19
// 744: invokevirtual su/catlean/gf.r (J)I
// 747: i2f
// 748: fdiv
// 749: fstore 42
// 74b: aload 0
// 74c: invokevirtual su/catlean/gf.b ()F
// 74f: aload 0
// 750: getfield su/catlean/gf.V F
// 753: fsub
// 754: aload 0
// 755: lload 24
// 757: invokevirtual su/catlean/gf.l (J)I
// 75a: i2f
// 75b: fdiv
// 75c: fstore 43
// 75e: aload 0
// 75f: lload 12
// 761: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 764: fload 42
// 766: ldc 5.0
// 768: aload 0
// 769: lload 19
// 76b: invokevirtual su/catlean/gf.r (J)I
// 76e: i2f
// 76f: fdiv
// 770: fconst_1
// 771: aload 0
// 772: getfield su/catlean/gf.v F
// 775: ldc 5.0
// 777: fadd
// 778: aload 0
// 779: lload 19
// 77b: invokevirtual su/catlean/gf.r (J)I
// 77e: i2f
// 77f: fdiv
// 780: fsub
// 781: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 784: invokevirtual su/catlean/d_.y (F)V
// 787: ldc 5.0
// 789: aload 0
// 78a: lload 24
// 78c: invokevirtual su/catlean/gf.l (J)I
// 78f: i2f
// 790: fdiv
// 791: fconst_1
// 792: aload 0
// 793: getfield su/catlean/gf.r F
// 796: aload 0
// 797: lload 24
// 799: invokevirtual su/catlean/gf.l (J)I
// 79c: i2f
// 79d: fdiv
// 79e: fsub
// 79f: invokestatic java/lang/Math.min (FF)F
// 7a2: fstore 44
// 7a4: ldc 5.0
// 7a6: aload 0
// 7a7: lload 24
// 7a9: invokevirtual su/catlean/gf.l (J)I
// 7ac: i2f
// 7ad: fdiv
// 7ae: fconst_1
// 7af: aload 0
// 7b0: getfield su/catlean/gf.r F
// 7b3: aload 0
// 7b4: lload 24
// 7b6: invokevirtual su/catlean/gf.l (J)I
// 7b9: i2f
// 7ba: fdiv
// 7bb: fsub
// 7bc: invokestatic java/lang/Math.max (FF)F
// 7bf: fstore 45
// 7c1: aload 0
// 7c2: lload 12
// 7c4: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 7c7: fload 43
// 7c9: fload 44
// 7cb: fload 45
// 7cd: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 7d0: invokevirtual su/catlean/d_.J (F)V
// 7d3: fconst_0
// 7d4: fstore 46
// 7d6: fconst_0
// 7d7: fstore 47
// 7d9: fconst_0
// 7da: fstore 48
// 7dc: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 7df: invokevirtual su/catlean/w8.C ()Ljava/util/List;
// 7e2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 7e7: astore 49
// 7e9: aload 49
// 7eb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 7f0: ifeq a83
// 7f3: aload 49
// 7f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 7fa: checkcast su/catlean/gf
// 7fd: astore 50
// 7ff: aload 50
// 801: aload 0
// 802: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 805: aload 41
// 807: lload 1
// 808: lconst_0
// 809: lcmp
// 80a: ifle a89
// 80d: lload 1
// 80e: lconst_0
// 80f: lcmp
// 810: iflt 818
// 813: ifnonnull a87
// 816: aload 41
// 818: lload 1
// 819: lconst_0
// 81a: lcmp
// 81b: iflt 84d
// 81e: ifnonnull 84b
// 821: goto 82e
// 824: ldc2_w 5102325672630372373
// 827: lload 1
// 828: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82d: athrow
// 82e: ifne 7e9
// 831: goto 83e
// 834: ldc2_w 5102325672630372373
// 837: lload 1
// 838: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83d: athrow
// 83e: aload 50
// 840: iload 34
// 842: i2s
// 843: iload 35
// 845: i2c
// 846: iload 36
// 848: invokevirtual su/catlean/gf.U (SCI)Z
// 84b: aload 41
// 84d: lload 1
// 84e: lconst_0
// 84f: lcmp
// 850: iflt 88e
// 853: ifnonnull 88c
// 856: ifne 86c
// 859: goto 866
// 85c: ldc2_w 5102325672630372373
// 85f: lload 1
// 860: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 865: athrow
// 866: lload 1
// 867: lconst_0
// 868: lcmp
// 869: ifgt 7e9
// 86c: aload 0
// 86d: aload 50
// 86f: lload 39
// 871: invokevirtual su/catlean/gf.p (J)F
// 874: aload 50
// 876: getfield su/catlean/gf.v F
// 879: fadd
// 87a: lload 37
// 87c: dup2_x1
// 87d: pop2
// 87e: aload 0
// 87f: lload 39
// 881: invokevirtual su/catlean/gf.p (J)F
// 884: aload 0
// 885: getfield su/catlean/gf.v F
// 888: fadd
// 889: invokevirtual su/catlean/gf.t (JFF)Z
// 88c: aload 41
// 88e: lload 1
// 88f: lconst_0
// 890: lcmp
// 891: ifle 8f9
// 894: ifnonnull 8f7
// 897: ifeq 8d5
// 89a: goto 8a7
// 89d: ldc2_w 5102325672630372373
// 8a0: lload 1
// 8a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a6: athrow
// 8a7: aload 50
// 8a9: lload 39
// 8ab: invokevirtual su/catlean/gf.p (J)F
// 8ae: aload 50
// 8b0: getfield su/catlean/gf.v F
// 8b3: fadd
// 8b4: aload 0
// 8b5: getfield su/catlean/gf.v F
// 8b8: fsub
// 8b9: fstore 46
// 8bb: aload 50
// 8bd: lload 1
// 8be: lconst_0
// 8bf: lcmp
// 8c0: ifle 920
// 8c3: lload 39
// 8c5: invokevirtual su/catlean/gf.p (J)F
// 8c8: aload 50
// 8ca: getfield su/catlean/gf.v F
// 8cd: fadd
// 8ce: fstore 47
// 8d0: aload 41
// 8d2: ifnull 91f
// 8d5: aload 0
// 8d6: aload 50
// 8d8: lload 39
// 8da: invokevirtual su/catlean/gf.p (J)F
// 8dd: lload 37
// 8df: dup2_x1
// 8e0: pop2
// 8e1: aload 0
// 8e2: lload 39
// 8e4: invokevirtual su/catlean/gf.p (J)F
// 8e7: invokevirtual su/catlean/gf.t (JFF)Z
// 8ea: goto 8f7
// 8ed: ldc2_w 5102325672630372373
// 8f0: lload 1
// 8f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f6: athrow
// 8f7: aload 41
// 8f9: lload 1
// 8fa: lconst_0
// 8fb: lcmp
// 8fc: iflt 936
// 8ff: ifnonnull 934
// 902: ifeq 91f
// 905: goto 912
// 908: ldc2_w 5102325672630372373
// 90b: lload 1
// 90c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 911: athrow
// 912: aload 50
// 914: lload 39
// 916: invokevirtual su/catlean/gf.p (J)F
// 919: fstore 46
// 91b: fload 46
// 91d: fstore 47
// 91f: aload 0
// 920: aload 50
// 922: lload 6
// 924: invokevirtual su/catlean/gf.V (J)F
// 927: lload 37
// 929: dup2_x1
// 92a: pop2
// 92b: aload 0
// 92c: lload 6
// 92e: invokevirtual su/catlean/gf.V (J)F
// 931: invokevirtual su/catlean/gf.t (JFF)Z
// 934: aload 41
// 936: lload 1
// 937: lconst_0
// 938: lcmp
// 939: ifle 95e
// 93c: ifnonnull 95c
// 93f: ifeq 958
// 942: goto 94f
// 945: ldc2_w 5102325672630372373
// 948: lload 1
// 949: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94e: athrow
// 94f: aload 50
// 951: lload 6
// 953: invokevirtual su/catlean/gf.V (J)F
// 956: fstore 48
// 958: fload 47
// 95a: fconst_0
// 95b: fcmpg
// 95c: aload 41
// 95e: ifnonnull 972
// 961: ifne 975
// 964: goto 971
// 967: ldc2_w 5102325672630372373
// 96a: lload 1
// 96b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 970: athrow
// 971: bipush 1
// 972: goto 976
// 975: bipush 0
// 976: lload 1
// 977: lconst_0
// 978: lcmp
// 979: iflt 9f5
// 97c: ifne 9f1
// 97f: lload 16
// 981: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 984: aload 3
// 985: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 988: dup
// 989: sipush 29562
// 98c: ldc2_w 1734921429571746368
// 98f: lload 1
// 990: lxor
// 991: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 996: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 999: fload 47
// 99b: ldc 5.0
// 99d: iload 18
// 99f: fload 47
// 9a1: aload 0
// 9a2: lload 24
// 9a4: invokevirtual su/catlean/gf.l (J)I
// 9a7: i2f
// 9a8: ldc 5.0
// 9aa: fsub
// 9ab: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 9ae: dup
// 9af: sipush 9392
// 9b2: ldc2_w 4270393026368892310
// 9b5: lload 1
// 9b6: lxor
// 9b7: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9bf: aconst_null
// 9c0: sipush 19510
// 9c3: ldc2_w 4134736969775686651
// 9c6: lload 1
// 9c7: lxor
// 9c8: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9cd: aconst_null
// 9ce: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 9d1: aload 0
// 9d2: lload 12
// 9d4: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// 9d7: fload 46
// 9d9: aload 0
// 9da: lload 19
// 9dc: invokevirtual su/catlean/gf.r (J)I
// 9df: i2f
// 9e0: fdiv
// 9e1: invokevirtual su/catlean/d_.y (F)V
// 9e4: goto 9f1
// 9e7: ldc2_w 5102325672630372373
// 9ea: lload 1
// 9eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f0: athrow
// 9f1: fload 48
// 9f3: fconst_0
// 9f4: fcmpg
// 9f5: aload 41
// 9f7: ifnonnull a0b
// 9fa: ifne a0e
// 9fd: goto a0a
// a00: ldc2_w 5102325672630372373
// a03: lload 1
// a04: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a09: athrow
// a0a: bipush 1
// a0b: goto a0f
// a0e: bipush 0
// a0f: ifne 7e9
// a12: lload 16
// a14: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a17: aload 3
// a18: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// a1b: dup
// a1c: sipush 29562
// a1f: ldc2_w 1734921429571746368
// a22: lload 1
// a23: lxor
// a24: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a29: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a2c: ldc 5.0
// a2e: fload 48
// a30: aload 0
// a31: lload 19
// a33: invokevirtual su/catlean/gf.r (J)I
// a36: i2f
// a37: ldc 5.0
// a39: fsub
// a3a: iload 18
// a3c: swap
// a3d: fload 48
// a3f: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// a42: dup
// a43: sipush 10576
// a46: ldc2_w 2320082068995072112
// a49: lload 1
// a4a: lxor
// a4b: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a50: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a53: aconst_null
// a54: sipush 19510
// a57: ldc2_w 4134736969775686651
// a5a: lload 1
// a5b: lxor
// a5c: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a61: aconst_null
// a62: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// a65: aload 0
// a66: lload 1
// a67: lconst_0
// a68: lcmp
// a69: iflt a84
// a6c: lload 12
// a6e: invokevirtual su/catlean/gf.T (J)Lsu/catlean/d_;
// a71: fload 48
// a73: aload 0
// a74: lload 24
// a76: invokevirtual su/catlean/gf.l (J)I
// a79: i2f
// a7a: fdiv
// a7b: invokevirtual su/catlean/d_.J (F)V
// a7e: aload 41
// a80: ifnull 7e9
// a83: aload 0
// a84: getfield su/catlean/gf.s Z
// a87: aload 41
// a89: lload 1
// a8a: lconst_0
// a8b: lcmp
// a8c: iflt e23
// a8f: ifnonnull e21
// a92: ifeq e1b
// a95: goto aa2
// a98: ldc2_w 5102325672630372373
// a9b: lload 1
// a9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa1: athrow
// aa2: fconst_0
// aa3: fstore 42
// aa5: aload 0
// aa6: invokevirtual su/catlean/gf.c ()Ljava/util/List;
// aa9: checkcast java/lang/Iterable
// aac: astore 44
// aae: bipush 0
// aaf: istore 45
// ab1: aload 44
// ab3: astore 46
// ab5: new java/util/ArrayList
// ab8: dup
// ab9: invokespecial java/util/ArrayList.<init> ()V
// abc: checkcast java/util/Collection
// abf: astore 47
// ac1: bipush 0
// ac2: istore 48
// ac4: aload 46
// ac6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// acb: astore 49
// acd: aload 49
// acf: invokeinterface java/util/Iterator.hasNext ()Z 1
// ad4: ifeq b80
// ad7: aload 49
// ad9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// ade: astore 50
// ae0: aload 50
// ae2: checkcast su/catlean/a1
// ae5: astore 51
// ae7: bipush 0
// ae8: istore 52
// aea: aload 51
// aec: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// aef: sipush 11380
// af2: ldc2_w 4753398070821643613
// af5: lload 1
// af6: lxor
// af7: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// afc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// aff: aload 41
// b01: lload 1
// b02: lconst_0
// b03: lcmp
// b04: ifle b0c
// b07: ifnonnull e21
// b0a: aload 41
// b0c: lload 1
// b0d: lconst_0
// b0e: lcmp
// b0f: ifle b56
// b12: ifnonnull b54
// b15: goto b22
// b18: ldc2_w 5102325672630372373
// b1b: lload 1
// b1c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b21: athrow
// b22: ifne b6d
// b25: goto b32
// b28: ldc2_w 5102325672630372373
// b2b: lload 1
// b2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b31: athrow
// b32: aload 51
// b34: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// b37: sipush 12588
// b3a: ldc2_w 6026720885516400640
// b3d: lload 1
// b3e: lxor
// b3f: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b44: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// b47: goto b54
// b4a: ldc2_w 5102325672630372373
// b4d: lload 1
// b4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b53: athrow
// b54: aload 41
// b56: ifnonnull b6a
// b59: ifne b6d
// b5c: goto b69
// b5f: ldc2_w 5102325672630372373
// b62: lload 1
// b63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b68: athrow
// b69: bipush 1
// b6a: goto b6e
// b6d: bipush 0
// b6e: ifeq acd
// b71: aload 47
// b73: aload 50
// b75: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// b7a: pop
// b7b: aload 41
// b7d: ifnull acd
// b80: aload 47
// b82: checkcast java/util/List
// b85: nop
// b86: astore 43
// b88: aload 43
// b8a: checkcast java/lang/Iterable
// b8d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// b92: astore 47
// b94: lload 1
// b95: lconst_0
// b96: lcmp
// b97: iflt e9e
// b9a: aload 47
// b9c: aload 41
// b9e: ifnonnull bcb
// ba1: invokeinterface java/util/Iterator.hasNext ()Z 1
// ba6: ifne bc4
// ba9: goto bb6
// bac: ldc2_w 5102325672630372373
// baf: lload 1
// bb0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bb5: athrow
// bb6: aconst_null
// bb7: goto c43
// bba: ldc2_w 5102325672630372373
// bbd: lload 1
// bbe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc3: athrow
// bc4: aload 47
// bc6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// bcb: checkcast su/catlean/a1
// bce: astore 48
// bd0: bipush 0
// bd1: istore 49
// bd3: lload 26
// bd5: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// bd8: aload 48
// bda: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// bdd: lload 28
// bdf: dup2_x1
// be0: pop2
// be1: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// be4: fstore 48
// be6: aload 47
// be8: invokeinterface java/util/Iterator.hasNext ()Z 1
// bed: ifeq c3e
// bf0: aload 47
// bf2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// bf7: checkcast su/catlean/a1
// bfa: astore 49
// bfc: bipush 0
// bfd: istore 50
// bff: lload 26
// c01: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// c04: aload 49
// c06: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// c09: lload 28
// c0b: dup2_x1
// c0c: pop2
// c0d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// c10: fstore 49
// c12: fload 48
// c14: fload 49
// c16: invokestatic java/lang/Math.max (FF)F
// c19: fstore 48
// c1b: aload 41
// c1d: lload 1
// c1e: lconst_0
// c1f: lcmp
// c20: iflt c28
// c23: ifnonnull c58
// c26: aload 41
// c28: ifnull be6
// c2b: lload 1
// c2c: lconst_0
// c2d: lcmp
// c2e: ifle c1b
// c31: goto c3e
// c34: ldc2_w 5102325672630372373
// c37: lload 1
// c38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3d: athrow
// c3e: fload 48
// c40: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// c43: dup
// c44: ifnull c57
// c47: invokevirtual java/lang/Float.floatValue ()F
// c4a: goto c59
// c4d: ldc2_w 5102325672630372373
// c50: lload 1
// c51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c56: athrow
// c57: pop
// c58: fconst_0
// c59: ldc 23.0
// c5b: fadd
// c5c: fstore 44
// c5e: aload 3
// c5f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// c62: dup
// c63: sipush 29562
// c66: ldc2_w 1734921429571746368
// c69: lload 1
// c6a: lxor
// c6b: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c70: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// c73: aload 0
// c74: getfield su/catlean/gf.T F
// c77: iload 21
// c79: i2c
// c7a: swap
// c7b: aload 0
// c7c: getfield su/catlean/gf.X F
// c7f: fload 44
// c81: ldc 14.0
// c83: aload 43
// c85: invokeinterface java/util/List.size ()I 1
// c8a: i2f
// c8b: fmul
// c8c: ldc 6.0
// c8e: fadd
// c8f: ldc 3.0
// c91: ldc 1.5
// c93: fconst_0
// c94: fconst_1
// c95: getstatic su/catlean/jh.f Lsu/catlean/jh;
// c98: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// c9b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// c9e: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// ca1: fconst_0
// ca2: iload 22
// ca4: i2s
// ca5: fconst_0
// ca6: iload 23
// ca8: fconst_0
// ca9: sipush 3866
// cac: ldc2_w 61801423046959315
// caf: lload 1
// cb0: lxor
// cb1: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cb6: aconst_null
// cb7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// cba: aload 43
// cbc: checkcast java/lang/Iterable
// cbf: astore 45
// cc1: bipush 0
// cc2: istore 46
// cc4: aload 45
// cc6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// ccb: astore 47
// ccd: aload 47
// ccf: invokeinterface java/util/Iterator.hasNext ()Z 1
// cd4: ifeq e14
// cd7: aload 47
// cd9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// cde: astore 48
// ce0: aload 48
// ce2: checkcast su/catlean/a1
// ce5: astore 49
// ce7: bipush 0
// ce8: istore 50
// cea: lload 26
// cec: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// cef: aload 3
// cf0: aload 49
// cf2: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// cf5: aload 0
// cf6: getfield su/catlean/gf.T F
// cf9: ldc 3.0
// cfb: fadd
// cfc: lload 14
// cfe: dup2_x1
// cff: pop2
// d00: aload 0
// d01: getfield su/catlean/gf.X F
// d04: fload 42
// d06: fadd
// d07: ldc 3.0
// d09: fadd
// d0a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// d0d: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// d10: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// d13: aload 3
// d14: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// d17: dup
// d18: sipush 29562
// d1b: ldc2_w 1734921429571746368
// d1e: lload 1
// d1f: lxor
// d20: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d25: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// d28: aload 0
// d29: getfield su/catlean/gf.T F
// d2c: fload 44
// d2e: fadd
// d2f: ldc 14.0
// d31: fsub
// d32: iload 21
// d34: i2c
// d35: swap
// d36: aload 0
// d37: getfield su/catlean/gf.X F
// d3a: ldc 3.5
// d3c: fadd
// d3d: fload 42
// d3f: fadd
// d40: ldc 11.0
// d42: ldc 11.0
// d44: ldc 3.0
// d46: ldc 2.5
// d48: fconst_0
// d49: fconst_1
// d4a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// d4d: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// d50: getstatic su/catlean/jh.f Lsu/catlean/jh;
// d53: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// d56: fconst_0
// d57: iload 22
// d59: i2s
// d5a: fconst_0
// d5b: iload 23
// d5d: fconst_0
// d5e: sipush 3866
// d61: ldc2_w 61801423046959315
// d64: lload 1
// d65: lxor
// d66: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d6b: aconst_null
// d6c: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// d6f: aload 41
// d71: lload 1
// d72: lconst_0
// d73: lcmp
// d74: iflt e11
// d77: ifnonnull e0f
// d7a: aload 49
// d7c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// d7f: bipush 1
// d80: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// d83: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// d86: aload 41
// d88: ifnonnull e21
// d8b: goto d98
// d8e: ldc2_w 5102325672630372373
// d91: lload 1
// d92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d97: athrow
// d98: ifeq e06
// d9b: goto da8
// d9e: ldc2_w 5102325672630372373
// da1: lload 1
// da2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// da7: athrow
// da8: aload 0
// da9: getfield su/catlean/gf.P Lsu/catlean/bj;
// dac: aload 3
// dad: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// db0: dup
// db1: sipush 29562
// db4: ldc2_w 1734921429571746368
// db7: lload 1
// db8: lxor
// db9: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dbe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// dc1: checkcast org/joml/Matrix3x2f
// dc4: aload 0
// dc5: getfield su/catlean/gf.T F
// dc8: fload 44
// dca: fadd
// dcb: f2d
// dcc: ldc2_w 14.5
// dcf: dsub
// dd0: aload 0
// dd1: getfield su/catlean/gf.X F
// dd4: fload 42
// dd6: fadd
// dd7: f2d
// dd8: ldc2_w 2.0
// ddb: dadd
// ddc: fconst_0
// ddd: fconst_0
// dde: getstatic su/catlean/jh.f Lsu/catlean/jh;
// de1: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// de4: aconst_null
// de5: fconst_0
// de6: sipush 26775
// de9: ldc2_w 4319160959570970443
// dec: lload 1
// ded: lxor
// dee: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df3: lload 32
// df5: aconst_null
// df6: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// df9: goto e06
// dfc: ldc2_w 5102325672630372373
// dff: lload 1
// e00: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e05: athrow
// e06: fload 42
// e08: ldc 14.0
// e0a: fadd
// e0b: fstore 42
// e0d: nop
// e0e: nop
// e0f: aload 41
// e11: ifnull ccd
// e14: lload 1
// e15: lconst_0
// e16: lcmp
// e17: iflt e9e
// e1a: nop
// e1b: aload 0
// e1c: lload 10
// e1e: invokevirtual su/catlean/gf.G (J)Z
// e21: aload 41
// e23: ifnonnull e81
// e26: ifeq e69
// e29: goto e36
// e2c: ldc2_w 5102325672630372373
// e2f: lload 1
// e30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e35: athrow
// e36: lload 4
// e38: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// e3b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// e3e: instanceof net/minecraft/class_408
// e41: lload 1
// e42: lconst_0
// e43: lcmp
// e44: ifle e81
// e47: aload 41
// e49: ifnonnull e81
// e4c: goto e59
// e4f: ldc2_w 5102325672630372373
// e52: lload 1
// e53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e58: athrow
// e59: ifne e84
// e5c: goto e69
// e5f: ldc2_w 5102325672630372373
// e62: lload 1
// e63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e68: athrow
// e69: lload 4
// e6b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// e6e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// e71: instanceof su/catlean/rl
// e74: goto e81
// e77: ldc2_w 5102325672630372373
// e7a: lload 1
// e7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e80: athrow
// e81: ifeq e9e
// e84: aload 0
// e85: lload 8
// e87: invokevirtual su/catlean/gf.s (J)V
// e8a: getstatic su/catlean/w8.T Lsu/catlean/w8;
// e8d: aload 0
// e8e: invokevirtual su/catlean/w8.w (Lsu/catlean/gf;)V
// e91: goto e9e
// e94: ldc2_w 5102325672630372373
// e97: lload 1
// e98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e9d: athrow
// e9e: return
}

public final void X(@NotNull class_332 context, long a, @NotNull String text) {
a = u ^ a;
long var10001 = a ^ 119698447961557L;
int var5 = (int)((a ^ 119698447961557L) >>> 48);
int var6 = (int)((a ^ 119698447961557L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
long var8 = a ^ 40175902333318L;
long var10 = a ^ 31055644862395L;
long var12 = a ^ 77730028125946L;
long var14 = a ^ 35369991241789L;
long var16 = a ^ 114987112415596L;
long var18 = a ^ 45773372937460L;
long var20 = a ^ 98042369072257L;
Intrinsics.checkNotNullParameter(context, a<"a">(5770, 7266811636661257243L ^ a));
Intrinsics.checkNotNullParameter(text, a<"a">(5181, 1476635634356258475L ^ a));
float var23 = b8.f(var16).D(var14, text);
Matrix3x2fStack var26 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var26, a<"a">(28129, 4485928044390186866L ^ a));
b(this, var26, this.p(var18), (short)var5, var6, this.V(var10), var23 + 19.0F, 13.0F, (short)var7, 0.0F, false, c<"b">(2152, 8609652961156086801L ^ a), null);
Matrix3x2fStack var10002 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10002, a<"a">(29562, 1734888954848666098L ^ a));
u(var20, this, var10002, this.p(var18) + c<"b">(15378, 2943123867270613093L ^ a), this.V(var10) + 3.0F, 0.0F, c<"b">(15821, 430428874176399778L ^ a), null);
bj var27 = this.j;
var10002 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10002, a<"a">(29562, 1734888954848666098L ^ a));
l(this, var27, var10002, this.p(var18) + 2.0F, this.V(var10), 10.0F, var8, 10.0F, 0.0F, c<"b">(24933, 2891438112324801801L ^ a), null);
this.Z(context, text, this.p(var18) + 16.0F, var12, this.V(var10) + 1.0F, jh.f.n());
vm.a<"Å">(-7064311914386374168L, a);
this.v = var23 + 20.0F;

try {
this.r = 13.0F;
if (vm.a<"Å">(-7129483989181889633L, a) != null) {
vm.a<"Å">("rpI2Lc", -7124375750104873731L, a);
}
} catch (UnsupportedOperationException var24) {
throw vm.a<"Å">(var24, -7098473855136853081L, a);
}
}

public final void q(@NotNull class_332 context, @NotNull String header, float factor, boolean right, long a) {
a = u ^ a;
long var10001 = a ^ 123322699648436L;
int var7 = (int)((a ^ 123322699648436L) >>> 48);
int var8 = (int)((a ^ 123322699648436L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
long var10 = a ^ 62114164054503L;
long var12 = a ^ 869972191194L;
long var14 = a ^ 99255964073627L;
long var16 = a ^ 66928694493276L;
long var18 = a ^ 127958873358605L;
long var20 = a ^ 58640454014101L;
long var22 = a ^ 76826199776480L;
String var10000 = vm.a<"Å">(-7091030544179478135L, a);
Intrinsics.checkNotNullParameter(context, a<"a">(27214, 2055642385823299770L ^ a));
Intrinsics.checkNotNullParameter(header, a<"a">(14513, 7771234369339140694L ^ a));
float var25 = b8.f(var18).D(var16, header);
String var24 = var10000;
float var26 = var25 + 24.0F;

label29: {
try {
var31 = this.p(var20);
if (right) {
var32 = this.v - var26;
break label29;
}
} catch (UnsupportedOperationException var29) {
throw vm.a<"Å">(var29, -7125755263882652730L, a);
}

var32 = 0.0F;
}

float var27 = var31 + var32;

try {
context.method_51448().pushMatrix();
context.method_51448().translate(var27 + var26 / 2.0F, this.V(var12) + 8.0F);
context.method_51448()
.scale(RangesKt.coerceIn(factor, RangesKt.rangeTo(0.0F, 2.0F)).floatValue(), RangesKt.coerceIn(factor, RangesKt.rangeTo(0.0F, 2.0F)).floatValue());
context.method_51448().translate(-(var27 + var26 / 2.0F), -(this.V(var12) + 8.0F));
Matrix3x2fStack var33 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var33, a<"a">(29562, 1734884918481969555L ^ a));
b(this, var33, var27, (short)var7, var8, this.V(var12), var26, 16.0F, (short)var9, 0.0F, false, c<"b">(8080, 8150975756158479260L ^ a), null);
bj var34 = this.j;
Matrix3x2fStack var10002 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10002, a<"a">(29562, 1734884918481969555L ^ a));
l(this, var34, var10002, var27 + 2.0F, this.V(var12) + 1.5F, 10.0F, var10, 10.0F, 0.0F, c<"b">(19510, 4134770801679104040L ^ a), null);
var10002 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10002, a<"a">(29562, 1734884918481969555L ^ a));
u(var22, this, var10002, var27 + c<"b">(3323, 1762377877010495723L ^ a), this.V(var12) + 4.0F, 0.0F, c<"b">(17822, 8435756218328838531L ^ a), null);
this.Z(context, header, var27 + 18.0F, var14, this.V(var12) + 2.0F, jh.f.n());
context.method_51448().popMatrix();
if (a > 0L && var24 != null) {
vm.a<"Å">(new _g[1], -7126446844660902108L, a);
}
} catch (UnsupportedOperationException var28) {
throw vm.a<"Å">(var28, -7125755263882652730L, a);
}
}

public void O(char a, short a, int key, int a, @NotNull Action action) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/gf.u J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 11747157478187
// 024: lxor
// 025: lstore 8
// 027: dup2
// 028: ldc2_w 104775594698184
// 02b: lxor
// 02c: lstore 10
// 02e: dup2
// 02f: ldc2_w 83137082385510
// 032: lxor
// 033: lstore 12
// 035: dup2
// 036: ldc2_w 43148482365962
// 039: lxor
// 03a: dup2
// 03b: bipush 32
// 03d: lushr
// 03e: l2i
// 03f: istore 14
// 041: dup2
// 042: bipush 32
// 044: lshl
// 045: bipush 32
// 047: lushr
// 048: l2i
// 049: istore 15
// 04b: pop2
// 04c: pop2
// 04d: ldc2_w 8767925775940724147
// 050: lload 6
// 052: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: astore 16
// 059: aload 5
// 05b: aload 16
// 05d: ifnonnull 4e0
// 060: sipush 5537
// 063: ldc2_w 9131685037534372711
// 066: lload 6
// 068: lxor
// 069: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 071: iload 3
// 072: ifne 4d0
// 075: goto 083
// 078: ldc2_w 8729748579484923900
// 07b: lload 6
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: aload 0
// 084: getfield su/catlean/gf.s Z
// 087: ifeq 441
// 08a: goto 098
// 08d: ldc2_w 8729748579484923900
// 090: lload 6
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 5
// 09a: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 09d: iload 4
// 09f: ifle 446
// 0a2: aload 16
// 0a4: ifnonnull 446
// 0a7: goto 0b5
// 0aa: ldc2_w 8729748579484923900
// 0ad: lload 6
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: if_acmpne 441
// 0b8: goto 0c6
// 0bb: ldc2_w 8729748579484923900
// 0be: lload 6
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 0
// 0c7: invokevirtual su/catlean/gf.c ()Ljava/util/List;
// 0ca: checkcast java/lang/Iterable
// 0cd: astore 18
// 0cf: bipush 0
// 0d0: istore 19
// 0d2: aload 18
// 0d4: astore 20
// 0d6: new java/util/ArrayList
// 0d9: dup
// 0da: invokespecial java/util/ArrayList.<init> ()V
// 0dd: checkcast java/util/Collection
// 0e0: astore 21
// 0e2: bipush 0
// 0e3: istore 22
// 0e5: aload 20
// 0e7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ec: astore 23
// 0ee: aload 23
// 0f0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f5: ifeq 18c
// 0f8: aload 23
// 0fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ff: astore 24
// 101: aload 24
// 103: checkcast su/catlean/a1
// 106: astore 25
// 108: bipush 0
// 109: istore 26
// 10b: aload 25
// 10d: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 110: sipush 11380
// 113: ldc2_w 4753303539417078452
// 116: lload 6
// 118: lxor
// 119: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 16
// 123: iload 2
// 124: iflt 161
// 127: ifnonnull 15f
// 12a: ifne 179
// 12d: goto 13b
// 130: ldc2_w 8729748579484923900
// 133: lload 6
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: aload 25
// 13d: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 140: sipush 12588
// 143: ldc2_w 6026766864296167401
// 146: lload 6
// 148: lxor
// 149: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 151: goto 15f
// 154: ldc2_w 8729748579484923900
// 157: lload 6
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aload 16
// 161: ifnonnull 176
// 164: ifne 179
// 167: goto 175
// 16a: ldc2_w 8729748579484923900
// 16d: lload 6
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: bipush 1
// 176: goto 17a
// 179: bipush 0
// 17a: ifeq 0ee
// 17d: aload 21
// 17f: aload 24
// 181: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 186: pop
// 187: aload 16
// 189: ifnull 0ee
// 18c: aload 21
// 18e: checkcast java/util/List
// 191: nop
// 192: astore 17
// 194: aload 17
// 196: checkcast java/lang/Iterable
// 199: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 19e: iload 4
// 1a0: ifle 0ff
// 1a3: astore 21
// 1a5: aload 21
// 1a7: aload 16
// 1a9: ifnonnull 1d8
// 1ac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b1: ifne 1d1
// 1b4: goto 1c2
// 1b7: ldc2_w 8729748579484923900
// 1ba: lload 6
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: aconst_null
// 1c3: goto 24e
// 1c6: ldc2_w 8729748579484923900
// 1c9: lload 6
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: aload 21
// 1d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d8: checkcast su/catlean/a1
// 1db: astore 22
// 1dd: bipush 0
// 1de: istore 23
// 1e0: lload 10
// 1e2: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 1e5: aload 22
// 1e7: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 1ea: lload 12
// 1ec: dup2_x1
// 1ed: pop2
// 1ee: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 1f1: fstore 22
// 1f3: aload 21
// 1f5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1fa: ifeq 249
// 1fd: aload 21
// 1ff: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 204: checkcast su/catlean/a1
// 207: astore 23
// 209: bipush 0
// 20a: istore 24
// 20c: lload 10
// 20e: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 211: aload 23
// 213: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 216: lload 12
// 218: dup2_x1
// 219: pop2
// 21a: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 21d: fstore 23
// 21f: fload 22
// 221: fload 23
// 223: invokestatic java/lang/Math.max (FF)F
// 226: fstore 22
// 228: aload 16
// 22a: iload 4
// 22c: ifle 234
// 22f: ifnonnull 264
// 232: aload 16
// 234: ifnull 1f3
// 237: iload 2
// 238: iflt 228
// 23b: goto 249
// 23e: ldc2_w 8729748579484923900
// 241: lload 6
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: fload 22
// 24b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 24e: dup
// 24f: ifnull 263
// 252: invokevirtual java/lang/Float.floatValue ()F
// 255: goto 265
// 258: ldc2_w 8729748579484923900
// 25b: lload 6
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: pop
// 264: fconst_0
// 265: ldc 23.0
// 267: fadd
// 268: fstore 18
// 26a: fconst_0
// 26b: fstore 19
// 26d: aload 17
// 26f: checkcast java/lang/Iterable
// 272: astore 20
// 274: bipush 0
// 275: istore 21
// 277: aload 20
// 279: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 27e: astore 22
// 280: aload 22
// 282: invokeinterface java/util/Iterator.hasNext ()Z 1
// 287: ifeq 43b
// 28a: aload 22
// 28c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 291: astore 23
// 293: aload 23
// 295: checkcast su/catlean/a1
// 298: astore 24
// 29a: bipush 0
// 29b: istore 25
// 29d: aload 0
// 29e: getfield su/catlean/gf.T F
// 2a1: fload 18
// 2a3: fadd
// 2a4: ldc 14.0
// 2a6: fsub
// 2a7: fstore 26
// 2a9: aload 0
// 2aa: getfield su/catlean/gf.T F
// 2ad: fload 18
// 2af: fadd
// 2b0: ldc 3.0
// 2b2: fsub
// 2b3: fstore 27
// 2b5: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 2b8: invokevirtual su/catlean/w8.H ()F
// 2bb: fstore 28
// 2bd: aload 16
// 2bf: ifnonnull 440
// 2c2: fload 26
// 2c4: fload 28
// 2c6: fcmpg
// 2c7: aload 16
// 2c9: iload 2
// 2ca: ifle 304
// 2cd: ifnonnull 302
// 2d0: goto 2de
// 2d3: ldc2_w 8729748579484923900
// 2d6: lload 6
// 2d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: athrow
// 2de: ifgt 32b
// 2e1: goto 2ef
// 2e4: ldc2_w 8729748579484923900
// 2e7: lload 6
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: fload 28
// 2f1: fload 27
// 2f3: fcmpg
// 2f4: goto 302
// 2f7: ldc2_w 8729748579484923900
// 2fa: lload 6
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: aload 16
// 304: ifnonnull 328
// 307: ifgt 327
// 30a: goto 318
// 30d: ldc2_w 8729748579484923900
// 310: lload 6
// 312: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 317: athrow
// 318: bipush 1
// 319: goto 32c
// 31c: ldc2_w 8729748579484923900
// 31f: lload 6
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: bipush 0
// 328: goto 32c
// 32b: bipush 0
// 32c: ifeq 42d
// 32f: aload 0
// 330: getfield su/catlean/gf.X F
// 333: ldc 3.5
// 335: fadd
// 336: fload 19
// 338: fadd
// 339: fstore 26
// 33b: aload 0
// 33c: getfield su/catlean/gf.X F
// 33f: ldc 14.5
// 341: fadd
// 342: fload 19
// 344: fadd
// 345: fstore 27
// 347: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 34a: invokevirtual su/catlean/w8.u ()F
// 34d: fstore 28
// 34f: fload 26
// 351: fload 28
// 353: fcmpg
// 354: aload 16
// 356: iload 2
// 357: iflt 383
// 35a: ifnonnull 381
// 35d: ifgt 3aa
// 360: goto 36e
// 363: ldc2_w 8729748579484923900
// 366: lload 6
// 368: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: athrow
// 36e: fload 28
// 370: fload 27
// 372: fcmpg
// 373: goto 381
// 376: ldc2_w 8729748579484923900
// 379: lload 6
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: aload 16
// 383: ifnonnull 3a7
// 386: ifgt 3a6
// 389: goto 397
// 38c: ldc2_w 8729748579484923900
// 38f: lload 6
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: bipush 1
// 398: goto 3ab
// 39b: ldc2_w 8729748579484923900
// 39e: lload 6
// 3a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: athrow
// 3a6: bipush 0
// 3a7: goto 3ab
// 3aa: bipush 0
// 3ab: ifeq 42d
// 3ae: aload 24
// 3b0: aload 16
// 3b2: ifnonnull 3fd
// 3b5: goto 3c3
// 3b8: ldc2_w 8729748579484923900
// 3bb: lload 6
// 3bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: athrow
// 3c3: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 3c6: instanceof java/lang/Boolean
// 3c9: ifeq 42d
// 3cc: goto 3da
// 3cf: ldc2_w 8729748579484923900
// 3d2: lload 6
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: aload 24
// 3dc: sipush 19660
// 3df: ldc2_w 3389110343483472395
// 3e2: lload 6
// 3e4: lxor
// 3e5: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3ed: aload 24
// 3ef: goto 3fd
// 3f2: ldc2_w 8729748579484923900
// 3f5: lload 6
// 3f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fc: athrow
// 3fd: astore 26
// 3ff: aload 26
// 401: aload 26
// 403: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 406: checkcast java/lang/Boolean
// 409: invokevirtual java/lang/Boolean.booleanValue ()Z
// 40c: aload 16
// 40e: ifnonnull 423
// 411: ifne 426
// 414: goto 422
// 417: ldc2_w 8729748579484923900
// 41a: lload 6
// 41c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 421: athrow
// 422: bipush 1
// 423: goto 427
// 426: bipush 0
// 427: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 42a: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 42d: fload 19
// 42f: ldc 14.0
// 431: fadd
// 432: fstore 19
// 434: nop
// 435: nop
// 436: aload 16
// 438: ifnull 280
// 43b: nop
// 43c: iload 2
// 43d: iflt 440
// 440: return
// 441: aload 5
// 443: getstatic su/catlean/api/event/events/client/InputEvent$Action.Release Lsu/catlean/api/event/events/client/InputEvent$Action;
// 446: if_acmpne 468
// 449: aload 0
// 44a: bipush 0
// 44b: putfield su/catlean/gf.w Z
// 44e: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 451: aconst_null
// 452: invokevirtual su/catlean/w8.R (Lsu/catlean/gf;)V
// 455: aload 16
// 457: ifnull 65e
// 45a: goto 468
// 45d: ldc2_w 8729748579484923900
// 460: lload 6
// 462: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 467: athrow
// 468: aload 0
// 469: lload 8
// 46b: invokevirtual su/catlean/gf.G (J)Z
// 46e: ifeq 65e
// 471: goto 47f
// 474: ldc2_w 8729748579484923900
// 477: lload 6
// 479: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: athrow
// 47f: aload 5
// 481: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 484: if_acmpne 65e
// 487: goto 495
// 48a: ldc2_w 8729748579484923900
// 48d: lload 6
// 48f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 494: athrow
// 495: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 498: invokevirtual su/catlean/w8.q ()Lsu/catlean/gf;
// 49b: iload 2
// 49c: iflt 4c4
// 49f: aload 16
// 4a1: ifnonnull 4c4
// 4a4: goto 4b2
// 4a7: ldc2_w 8729748579484923900
// 4aa: lload 6
// 4ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b1: athrow
// 4b2: ifnonnull 65e
// 4b5: goto 4c3
// 4b8: ldc2_w 8729748579484923900
// 4bb: lload 6
// 4bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c2: athrow
// 4c3: aload 0
// 4c4: iload 14
// 4c6: iload 15
// 4c8: invokevirtual su/catlean/gf.i (II)V
// 4cb: aload 16
// 4cd: ifnull 65e
// 4d0: aload 5
// 4d2: goto 4e0
// 4d5: ldc2_w 8729748579484923900
// 4d8: lload 6
// 4da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4df: athrow
// 4e0: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 4e3: if_acmpne 65e
// 4e6: aload 0
// 4e7: aload 16
// 4e9: ifnonnull 51f
// 4ec: goto 4fa
// 4ef: ldc2_w 8729748579484923900
// 4f2: lload 6
// 4f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f9: athrow
// 4fa: lload 8
// 4fc: invokevirtual su/catlean/gf.G (J)Z
// 4ff: ifeq 65e
// 502: goto 510
// 505: ldc2_w 8729748579484923900
// 508: lload 6
// 50a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50f: athrow
// 510: aload 0
// 511: goto 51f
// 514: ldc2_w 8729748579484923900
// 517: lload 6
// 519: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51e: athrow
// 51f: invokevirtual su/catlean/gf.c ()Ljava/util/List;
// 522: checkcast java/lang/Iterable
// 525: astore 17
// 527: bipush 0
// 528: istore 18
// 52a: aload 17
// 52c: aload 16
// 52e: ifnonnull 584
// 531: instanceof java/util/Collection
// 534: ifeq 582
// 537: goto 545
// 53a: ldc2_w 8729748579484923900
// 53d: lload 6
// 53f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 544: athrow
// 545: aload 17
// 547: checkcast java/util/Collection
// 54a: aload 16
// 54c: ifnonnull 584
// 54f: goto 55d
// 552: ldc2_w 8729748579484923900
// 555: lload 6
// 557: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55c: athrow
// 55d: invokeinterface java/util/Collection.isEmpty ()Z 1
// 562: ifeq 582
// 565: goto 573
// 568: ldc2_w 8729748579484923900
// 56b: lload 6
// 56d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 572: athrow
// 573: bipush 0
// 574: goto 616
// 577: ldc2_w 8729748579484923900
// 57a: lload 6
// 57c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 581: athrow
// 582: aload 17
// 584: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 589: astore 19
// 58b: aload 19
// 58d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 592: ifeq 615
// 595: aload 19
// 597: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 59c: astore 20
// 59e: aload 20
// 5a0: checkcast su/catlean/a1
// 5a3: astore 21
// 5a5: bipush 0
// 5a6: istore 22
// 5a8: aload 21
// 5aa: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 5ad: sipush 11380
// 5b0: ldc2_w 4753303539417078452
// 5b3: lload 6
// 5b5: lxor
// 5b6: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5be: aload 16
// 5c0: ifnonnull 5ea
// 5c3: ifne 604
// 5c6: aload 21
// 5c8: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 5cb: sipush 12588
// 5ce: ldc2_w 6026766864296167401
// 5d1: lload 6
// 5d3: lxor
// 5d4: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/gf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5dc: goto 5ea
// 5df: ldc2_w 8729748579484923900
// 5e2: lload 6
// 5e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e9: athrow
// 5ea: aload 16
// 5ec: ifnonnull 601
// 5ef: ifne 604
// 5f2: goto 600
// 5f5: ldc2_w 8729748579484923900
// 5f8: lload 6
// 5fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ff: athrow
// 600: bipush 1
// 601: goto 605
// 604: bipush 0
// 605: ifeq 58b
// 608: bipush 1
// 609: aload 16
// 60b: iload 1
// 60c: iflt 5c0
// 60f: ifnonnull 5be
// 612: goto 616
// 615: bipush 0
// 616: ifeq 65e
// 619: aload 0
// 61a: aload 0
// 61b: getfield su/catlean/gf.s Z
// 61e: aload 16
// 620: ifnonnull 643
// 623: goto 631
// 626: ldc2_w 8729748579484923900
// 629: lload 6
// 62b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 630: athrow
// 631: ifne 646
// 634: goto 642
// 637: ldc2_w 8729748579484923900
// 63a: lload 6
// 63c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 641: athrow
// 642: bipush 1
// 643: goto 647
// 646: bipush 0
// 647: putfield su/catlean/gf.s Z
// 64a: aload 0
// 64b: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 64e: invokevirtual su/catlean/w8.H ()F
// 651: putfield su/catlean/gf.T F
// 654: aload 0
// 655: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 658: invokevirtual su/catlean/w8.u ()F
// 65b: putfield su/catlean/gf.X F
// 65e: return
}

protected final void i(int param1, int param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/gf.u J
// 11: lxor
// 12: lstore 3
// 13: lload 3
// 14: dup2
// 15: ldc2_w 111886389725826
// 18: lxor
// 19: lstore 5
// 1b: dup2
// 1c: ldc2_w 9362361592879
// 1f: lxor
// 20: lstore 7
// 22: dup2
// 23: ldc2_w 67190958120800
// 26: lxor
// 27: lstore 9
// 29: dup2
// 2a: ldc2_w 76309174011044
// 2d: lxor
// 2e: lstore 11
// 30: pop2
// 31: ldc2_w 1613011060449757820
// 34: lload 3
// 35: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: astore 13
// 3c: aload 0
// 3d: aload 13
// 3f: ifnonnull b6
// 42: instanceof su/catlean/g1
// 45: ifeq 93
// 48: goto 55
// 4b: ldc2_w 1650906943251355699
// 4e: lload 3
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: lload 5
// 57: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5a: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 5d: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 60: lload 11
// 62: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 65: invokevirtual net/minecraft/class_746.method_23317 ()D
// 68: d2i
// 69: lload 11
// 6b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6e: invokevirtual net/minecraft/class_746.method_23318 ()D
// 71: d2i
// 72: lload 11
// 74: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 77: invokevirtual net/minecraft/class_746.method_23321 ()D
// 7a: d2i
// 7b: invokedynamic makeConcatWithConstants (III)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001 \u0001" ]
// 80: checkcast java/lang/CharSequence
// 83: invokestatic org/lwjgl/glfw/GLFW.glfwSetClipboardString (JLjava/lang/CharSequence;)V
// 86: goto 93
// 89: ldc2_w 1650906943251355699
// 8c: lload 3
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: aload 0
// 94: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 97: invokevirtual su/catlean/w8.H ()F
// 9a: aload 0
// 9b: lload 9
// 9d: invokevirtual su/catlean/gf.p (J)F
// a0: fsub
// a1: putfield su/catlean/gf.C F
// a4: aload 0
// a5: getstatic su/catlean/w8.T Lsu/catlean/w8;
// a8: invokevirtual su/catlean/w8.u ()F
// ab: aload 0
// ac: lload 7
// ae: invokevirtual su/catlean/gf.V (J)F
// b1: fsub
// b2: putfield su/catlean/gf.V F
// b5: aload 0
// b6: bipush 1
// b7: putfield su/catlean/gf.w Z
// ba: getstatic su/catlean/w8.T Lsu/catlean/w8;
// bd: aload 0
// be: invokevirtual su/catlean/w8.R (Lsu/catlean/gf;)V
// c1: return
}

public final float p(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 98587245974917L;
long var5 = var1 ^ 26958820068720L;
return this.T(var3).C() * this.r(var5);
}

public final float V(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 30998273965455L;
long var5 = var1 ^ 118978727569098L;
return this.T(var5).c() * this.l(var3);
}

protected final float N() {
return w8.T.H();
}

protected final float b() {
return w8.T.u();
}

protected final boolean G(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gf.u J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 40761536834830
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 18199082966593
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: aload 0
// 016: lload 5
// 018: invokevirtual su/catlean/gf.p (J)F
// 01b: fstore 8
// 01d: aload 0
// 01e: lload 5
// 020: invokevirtual su/catlean/gf.p (J)F
// 023: aload 0
// 024: getfield su/catlean/gf.v F
// 027: fadd
// 028: fstore 9
// 02a: ldc2_w -2935295195854238883
// 02d: lload 1
// 02e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: aload 0
// 034: invokevirtual su/catlean/gf.N ()F
// 037: fstore 10
// 039: astore 7
// 03b: fload 8
// 03d: fload 10
// 03f: fcmpg
// 040: aload 7
// 042: ifnonnull 067
// 045: ifgt 08e
// 048: goto 055
// 04b: ldc2_w -2898032758982321902
// 04e: lload 1
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: fload 10
// 057: fload 9
// 059: fcmpg
// 05a: goto 067
// 05d: ldc2_w -2898032758982321902
// 060: lload 1
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 7
// 069: ifnonnull 08b
// 06c: ifgt 08a
// 06f: goto 07c
// 072: ldc2_w -2898032758982321902
// 075: lload 1
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: bipush 1
// 07d: goto 08f
// 080: ldc2_w -2898032758982321902
// 083: lload 1
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: bipush 0
// 08b: goto 08f
// 08e: bipush 0
// 08f: ifeq 11c
// 092: aload 0
// 093: lload 3
// 094: invokevirtual su/catlean/gf.V (J)F
// 097: fstore 8
// 099: aload 0
// 09a: lload 3
// 09b: invokevirtual su/catlean/gf.V (J)F
// 09e: aload 0
// 09f: getfield su/catlean/gf.r F
// 0a2: fadd
// 0a3: fstore 9
// 0a5: aload 0
// 0a6: invokevirtual su/catlean/gf.b ()F
// 0a9: fstore 10
// 0ab: fload 8
// 0ad: fload 10
// 0af: fcmpg
// 0b0: aload 7
// 0b2: lload 1
// 0b3: lconst_0
// 0b4: lcmp
// 0b5: ifle 0df
// 0b8: ifnonnull 0dd
// 0bb: ifgt 104
// 0be: goto 0cb
// 0c1: ldc2_w -2898032758982321902
// 0c4: lload 1
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: fload 10
// 0cd: fload 9
// 0cf: fcmpg
// 0d0: goto 0dd
// 0d3: ldc2_w -2898032758982321902
// 0d6: lload 1
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 7
// 0df: ifnonnull 101
// 0e2: ifgt 100
// 0e5: goto 0f2
// 0e8: ldc2_w -2898032758982321902
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: bipush 1
// 0f3: goto 105
// 0f6: ldc2_w -2898032758982321902
// 0f9: lload 1
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: bipush 0
// 101: goto 105
// 104: bipush 0
// 105: lload 1
// 106: lconst_0
// 107: lcmp
// 108: ifle 10f
// 10b: ifeq 11c
// 10e: bipush 1
// 10f: goto 11d
// 112: ldc2_w -2898032758982321902
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: bipush 0
// 11d: ireturn
}

protected final void s(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 42577454140691L;

int var10000;
label17: {
try {
if (w8.T.q() != null) {
var10000 = c<"b">(9355, 5650974618625662198L ^ var1);
break label17;
}
} catch (UnsupportedOperationException var6) {
throw vm.a<"Å">(var6, 5870565697519443874L, var1);
}

var10000 = c<"b">(11649, 928273687574795769L ^ var1);
}

int var5 = var10000;
GLFW.glfwSetCursor(zf.F(var3).method_22683().method_4490(), GLFW.glfwCreateStandardCursor(var5));
}

protected final void X(float w, float h) {
this.v = wx;
this.r = h;
}

protected final int l(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 124726213401378L;
return zf.F(var3).method_22683().method_4502();
}

protected final int r(long var1) {
var1 = u ^ var1;
long var3 = var1 ^ 70756890826898L;
return zf.F(var3).method_22683().method_4486();
}

protected final boolean t(long a, float n1, float n2) {
a = u ^ a;
String var5 = vm.a<"Å">(7851444665416823019L, a);

try {
float var8;
int var10000 = (var8 = Math.abs(n1 - n2) - 2.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
if (var5 != null) {
return (boolean)var10000;
}

if (var10000 < 0) {
return (boolean)1;
}
} catch (UnsupportedOperationException var6) {
throw vm.a<"Å">(var6, 7817771002017178276L, a);
}

return (boolean)0;
}

protected final void J(@NotNull Matrix3x2fStack m, float x, float y, float w, long a, float h, float a, boolean batch) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gf.u J
// 03: lload 5
// 05: lxor
// 06: lstore 5
// 08: lload 5
// 0a: dup2
// 0b: ldc2_w 98781838910279
// 0e: lxor
// 0f: dup2
// 10: bipush 48
// 12: lushr
// 13: l2i
// 14: istore 10
// 16: dup2
// 17: bipush 16
// 19: lshl
// 1a: bipush 48
// 1c: lushr
// 1d: l2i
// 1e: istore 11
// 20: dup2
// 21: bipush 32
// 23: lshl
// 24: bipush 32
// 26: lushr
// 27: l2i
// 28: istore 12
// 2a: pop2
// 2b: pop2
// 2c: ldc2_w -9003378454660129005
// 2f: lload 5
// 31: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: astore 13
// 38: aload 1
// 39: aload 13
// 3b: ifnonnull 8a
// 3e: ldc "m"
// 40: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 43: iload 9
// 45: ifeq 7b
// 48: goto 56
// 4b: ldc2_w -8969427860392997540
// 4e: lload 5
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 59: invokevirtual su/catlean/w8.c ()Lsu/catlean/ab;
// 5c: aload 1
// 5d: fload 2
// 5e: fload 3
// 5f: fload 4
// 61: fload 7
// 63: fload 8
// 65: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 68: aload 13
// 6a: ifnull c0
// 6d: goto 7b
// 70: ldc2_w -8969427860392997540
// 73: lload 5
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: aload 1
// 7c: goto 8a
// 7f: ldc2_w -8969427860392997540
// 82: lload 5
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: iload 10
// 8c: i2c
// 8d: fload 2
// 8e: fload 3
// 8f: fload 4
// 91: fload 7
// 93: ldc 3.0
// 95: ldc 1.5
// 97: fconst_0
// 98: fload 8
// 9a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 9d: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// a0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// a3: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// a6: fconst_0
// a7: iload 11
// a9: i2s
// aa: fconst_0
// ab: iload 12
// ad: fconst_0
// ae: sipush 16517
// b1: ldc2_w 4105518362641623560
// b4: lload 5
// b6: lxor
// b7: invokedynamic b (IJ)I bsm=su/catlean/gf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: aconst_null
// bd: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// c0: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void b(
gf var0,
Matrix3x2fStack var1,
float var2,
short var3,
int var4,
float var5,
float var6,
float var7,
short var8,
float var9,
boolean var10,
int var11,
Object var12
) {
long var13 = ((long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ u;
long var15 = var13 ^ 135910492181294L;
String var17 = vm.a<"Å">(-5339385317861561864L, var13);

try {
if (var12 != null) {
throw new UnsupportedOperationException(a<"a">(13513, 2486797632619974224L ^ var13));
}
} catch (UnsupportedOperationException var19) {
throw vm.a<"Å">(var19, -5373617568064488521L, var13);
}

int var10000;
String var10001;
label52: {
label51: {
label50: {
try {
var10000 = var11 & c<"b">(9284, 4299724659956365345L ^ var13);
var10001 = var17;
if (var3 < 0) {
break label52;
}

if (var17 != null) {
break label51;
}

if (var10000 == 0) {
break label50;
}
} catch (UnsupportedOperationException var21) {
throw vm.a<"Å">(var21, -5373617568064488521L, var13);
}

var9 = 1.0F;
}

var10000 = var11 & c<"b">(19510, 4134726939345506393L ^ var13);
}

try {
var10001 = var17;
} catch (UnsupportedOperationException var18) {
throw vm.a<"Å">(var18, -5373617568064488521L, var13);
}
}

label39: {
label38: {
try {
if (var10001 != null) {
break label38;
}

if (var10000 == 0) {
break label39;
}
} catch (UnsupportedOperationException var20) {
throw vm.a<"Å">(var20, -5373617568064488521L, var13);
}

var10000 = 1;
}

var10 = var10000;
}

var0.J(var1, var2, var5, var6, var15, var7, var9, (boolean)var10);
}

protected final void w(@NotNull Matrix3x2fStack m, float x, float y, float a) {
Intrinsics.checkNotNullParameter(m, "m");
Matrix3x2f var5 = new Matrix3x2f((Matrix3x2fc)m);
w8.T.B().add(new aj(var5, x, y, 0.5F, 8.5F, a));
}

public static void u(long var0, gf var2, Matrix3x2fStack var3, float var4, float var5, float var6, int var7, Object var8) {
var0 = u ^ var0;

try {
if (var8 != null) {
throw new UnsupportedOperationException(a<"a">(22311, 8545360988187606249L ^ var0));
}
} catch (UnsupportedOperationException var9) {
throw vm.a<"Å">(var9, -2001525966947751197L, var0);
}

if ((var7 & c<"b">(17822, 8435750616360552614L ^ var0)) != 0) {
var6 = 1.0F;
}

var2.w(var3, var4, var5, var6);
}

protected final void m(@NotNull bj image, @NotNull Matrix3x2fStack m, float x, float y, float w, long a, float h, float a) {
a = u ^ a;
long var10 = a ^ 11614707618062L;
Intrinsics.checkNotNullParameter(image, a<"a">(17036, 1501224778669912070L ^ a));
Intrinsics.checkNotNullParameter(m, "m");
Matrix3x2f var12 = new Matrix3x2f((Matrix3x2fc)m);
w8.T.X().add(new ff(var10, image, var12, x, y, wx, h, ax));
}

public static void l(gf var0, bj var1, Matrix3x2fStack var2, float var3, float var4, float var5, long var6, float var8, float var9, int var10, Object var11) {
var6 = u ^ var6;
long var12 = var6 ^ 70630953007495L;

try {
if (var11 != null) {
throw new UnsupportedOperationException(a<"a">(22768, 3745519605229319728L ^ var6));
}
} catch (UnsupportedOperationException var14) {
throw vm.a<"Å">(var14, 2395452235034931172L, var6);
}

if ((var10 & c<"b">(19510, 4134806289554785290L ^ var6)) != 0) {
var9 = 1.0F;
}

var0.m(var1, var2, var3, var4, var5, var12, var8, var9);
}

protected final void Z(@NotNull class_332 context, @NotNull String s, float x, long a, float y, @NotNull Color color) {
a = u ^ a;
long var8 = a ^ 129818166237779L;
long var10 = a ^ 46553833905876L;
Intrinsics.checkNotNullParameter(context, a<"a">(27214, 2055639976252908516L ^ a));
Intrinsics.checkNotNullParameter(sx, "s");
Intrinsics.checkNotNullParameter(color, a<"a">(28444, 2333065126662874787L ^ a));
c6 var10000 = b8.f(var8);
Matrix3x2fStack var10001 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10001, a<"a">(29562, 1734887327598295757L ^ a));
c6.W(var10000, var10001, sx, x, y, var10, color, false, 0, c<"b">(8080, 8150977881992589506L ^ a), null);
}

static {
long var20 = u ^ 49269217096539L;
vm.a<"Å">(null, 6332125215637917244L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[28];
int var16 = 0;
String var15 = "1\u0002ÿC¾çÊ¤Ö\u0085Ã7Á@\u00982\u0087Ò=hæÜNîY¾<\u0089T0¶ß\u0010mî¦`\u000e±ó3ê´\u008c Ni¼Q\u0010£ã\f\u009f\u0004w:Ø-\nä¼³v(¦\u0010åã¸øÚ:\u0093Y¢|&c\u0098^\u001b]\u0010ÿ\u009eÔ\u0006µT\u001b\u0091h\u0006l 8y3«\u0010\u0093\u008cCfä¹2B¡u\u0090\"pêï!\u0010êÏm\u001fª\u0090A\u0006ô\u008f eç¡È\u009e\u0010Ã\u008cÀ~T\u001e ã°\u0012\u0084ý\u0094\u000fÂy\u0010\u008eÄåÛ,²ï5z}\rUdÐ\u0004\u00950AÆ\u0002ïÕ\u0089-8v\u001f\u008e\u008a\u0019\u001a\u009b(¬Ø.±K{\u001b\u00118\u000fó\f¶&×æ(¸_óIf\u000fµ\u0097£Ê\u0000<\\+M\u0010\u0082\u001d}qÄ5\u00adG\f\u0089¸ú£\u009af£\u0018\u008fÒÚ6>\u0001!¾Ô\u001d\u0085È!\u001c\u0088\u0083«=hï\u0018\u008a=\u008e\u0018sý\u0088\fjÑl|\u0084iDfz\t\u001cR¡å\u000f\u0094ß\u0018\u009c\u009b ³¬\n$ìúD\"éqºÇf~\f\u0012\u001dyb\\©,Û`î\u00103ö~D\u0002\r\u0010\r×FÌ7¶\u008d\u000bfë\u009b\u0018\u0000\t6÷\u0088h ´h¯üÉ:ú\u0081\u0016GÀÕk¢XÂçFmÇ\u0019#ê\u001e]³4Dv?\u007fÓÕÙ J\r\u0098×8h¿@ÊÛ\u0083eÌá@$t\u008bbA\u008b%\u009e \u0011ÞFÚ\u0093ÿ©²²ö³OqL¹.Z»Ë×Dü\u000esÌ¬\u001d\u0010ví¿:lì5\u0098\u0095ß2¶\rò8+G\u0019'\u001erÃ\u0085Hë\u0087u&ÒÝ&é\u001e$i\u0014)Ä\u001eÙ\u000f²ÝÚÏ±¢\u0080\u0085(v5ãä\u0007Ó¿¡*G\u0090D\u000f¦æà¾\"Ó'1\u0004\u0088\u0083¢j.¡ìH\u0003Dwi)\u001cãÕI\u0086ü¿û¦K$\u001fý\u0095ZE·\u008f\u001c\u008aÝ\u009c\u0095\u0081ø.\u001dÃÔ;|?^`V}\u008b\u0005_\u001d\u0003¹\u0088¡æþ,f\u0083\u000f$\u009dv\u0010ó\u008eÝüV\u0013ôw]Êµ\u0085qZF%«Þ\u0080\u0098ô\u0000\u001c\"p\u0099£\u0015Z\u008c^å \u001cÏÌ\u0005P+®\u0019sñ\u0011¶ýµ¡\u001a´Ö\u0012©\u000e;\u001b\u000e¬È³u´n\u0000Æ\u000eaÄA\u0095Mé¨ôÈãGÚ\fj\u008frøR>5e2\u0083,c®|T\u008e\u0088Rq\u009d'è\u008ceßÏ.{\u0080Ü6\u008arµÅæ¹XQ(\u0088¶\u0089]È\u0013]µ5\u009e92\n\u0097 Âõ\u0011ÈÛ\"¶\u00847\u0004\u0003K=÷\u0092%\u0098\u0099/\u009f\u0011±nï\u0017\u0010\u0016\u0085<\u0084Æóô*\u0083ßÞh\u007few\u000b\u0010\u0096\u000eiæ\u001bV9Ã\u000f\u009bÅ\u000e%k\u0091è\u0010XJì\u0093\u0096¤\u0019ovlE:ª2»\u0088\u0010e\u001d\u001fñ]\u00804á\u0012/÷Ä'ù\u001d×\u0018ê4\u000b\u001d\u0010å\u0081Ëß\u000bb\u0015ïÈJ¢\u009cgô\u0010Ã\u0002´ä\u0010g¨$Eè\u007fQ\u0001^Ö Ts%Ì1\u0088/`Ïf\u009dªk¡§\u0095)$ÿâ\u00adä \u0091\u001bnÅÐ³\u0080cAëèÓ;û c\u0096\bçvò`Pu\u008e3®ÐfÜ>ùÀ¤\u0095¼\u001b5+ã\u00adN!4N\u0083©\u001c\u0095=õ\u008ej\u0099À)\f«3BCkäbç@5Éî2¦åÆó\u0093\u00810\u0015\u0082«\u0081\r.C\rî\u0016µ\u009a$\u0090øÕG¾-\u0012u\u001e\u008f\\'ì.c®\u0086¨´»©_Ñy1êùæí";
int var17 = "1\u0002ÿC¾çÊ¤Ö\u0085Ã7Á@\u00982\u0087Ò=hæÜNîY¾<\u0089T0¶ß\u0010mî¦`\u000e±ó3ê´\u008c Ni¼Q\u0010£ã\f\u009f\u0004w:Ø-\nä¼³v(¦\u0010åã¸øÚ:\u0093Y¢|&c\u0098^\u001b]\u0010ÿ\u009eÔ\u0006µT\u001b\u0091h\u0006l 8y3«\u0010\u0093\u008cCfä¹2B¡u\u0090\"pêï!\u0010êÏm\u001fª\u0090A\u0006ô\u008f eç¡È\u009e\u0010Ã\u008cÀ~T\u001e ã°\u0012\u0084ý\u0094\u000fÂy\u0010\u008eÄåÛ,²ï5z}\rUdÐ\u0004\u00950AÆ\u0002ïÕ\u0089-8v\u001f\u008e\u008a\u0019\u001a\u009b(¬Ø.±K{\u001b\u00118\u000fó\f¶&×æ(¸_óIf\u000fµ\u0097£Ê\u0000<\\+M\u0010\u0082\u001d}qÄ5\u00adG\f\u0089¸ú£\u009af£\u0018\u008fÒÚ6>\u0001!¾Ô\u001d\u0085È!\u001c\u0088\u0083«=hï\u0018\u008a=\u008e\u0018sý\u0088\fjÑl|\u0084iDfz\t\u001cR¡å\u000f\u0094ß\u0018\u009c\u009b ³¬\n$ìúD\"éqºÇf~\f\u0012\u001dyb\\©,Û`î\u00103ö~D\u0002\r\u0010\r×FÌ7¶\u008d\u000bfë\u009b\u0018\u0000\t6÷\u0088h ´h¯üÉ:ú\u0081\u0016GÀÕk¢XÂçFmÇ\u0019#ê\u001e]³4Dv?\u007fÓÕÙ J\r\u0098×8h¿@ÊÛ\u0083eÌá@$t\u008bbA\u008b%\u009e \u0011ÞFÚ\u0093ÿ©²²ö³OqL¹.Z»Ë×Dü\u000esÌ¬\u001d\u0010ví¿:lì5\u0098\u0095ß2¶\rò8+G\u0019'\u001erÃ\u0085Hë\u0087u&ÒÝ&é\u001e$i\u0014)Ä\u001eÙ\u000f²ÝÚÏ±¢\u0080\u0085(v5ãä\u0007Ó¿¡*G\u0090D\u000f¦æà¾\"Ó'1\u0004\u0088\u0083¢j.¡ìH\u0003Dwi)\u001cãÕI\u0086ü¿û¦K$\u001fý\u0095ZE·\u008f\u001c\u008aÝ\u009c\u0095\u0081ø.\u001dÃÔ;|?^`V}\u008b\u0005_\u001d\u0003¹\u0088¡æþ,f\u0083\u000f$\u009dv\u0010ó\u008eÝüV\u0013ôw]Êµ\u0085qZF%«Þ\u0080\u0098ô\u0000\u001c\"p\u0099£\u0015Z\u008c^å \u001cÏÌ\u0005P+®\u0019sñ\u0011¶ýµ¡\u001a´Ö\u0012©\u000e;\u001b\u000e¬È³u´n\u0000Æ\u000eaÄA\u0095Mé¨ôÈãGÚ\fj\u008frøR>5e2\u0083,c®|T\u008e\u0088Rq\u009d'è\u008ceßÏ.{\u0080Ü6\u008arµÅæ¹XQ(\u0088¶\u0089]È\u0013]µ5\u009e92\n\u0097 Âõ\u0011ÈÛ\"¶\u00847\u0004\u0003K=÷\u0092%\u0098\u0099/\u009f\u0011±nï\u0017\u0010\u0016\u0085<\u0084Æóô*\u0083ßÞh\u007few\u000b\u0010\u0096\u000eiæ\u001bV9Ã\u000f\u009bÅ\u000e%k\u0091è\u0010XJì\u0093\u0096¤\u0019ovlE:ª2»\u0088\u0010e\u001d\u001fñ]\u00804á\u0012/÷Ä'ù\u001d×\u0018ê4\u000b\u001d\u0010å\u0081Ëß\u000bb\u0015ïÈJ¢\u009cgô\u0010Ã\u0002´ä\u0010g¨$Eè\u007fQ\u0001^Ö Ts%Ì1\u0088/`Ïf\u009dªk¡§\u0095)$ÿâ\u00adä \u0091\u001bnÅÐ³\u0080cAëèÓ;û c\u0096\bçvò`Pu\u008e3®ÐfÜ>ùÀ¤\u0095¼\u001b5+ã\u00adN!4N\u0083©\u001c\u0095=õ\u008ej\u0099À)\f«3BCkäbç@5Éî2¦åÆó\u0093\u00810\u0015\u0082«\u0081\r.C\rî\u0016µ\u009a$\u0090øÕG¾-\u0012u\u001e\u008f\\'ì.c®\u0086¨´»©_Ñy1êùæí"
.length();
char var14 = ' ';
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
Z = var18;
ab = new String[28];
eb = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[20];
int var3 = 0;
String var4 = "Ö\u0089yQ\u0086¦iÇ®X\u0088]iE\u000eÞqÃéY´\u0098\u008d\u0089q¬{\u00934\u001fÃª½õ5ãx|x:\u0089(¸i{h\u0002FÄî|L^\u0080á6±¨/Ö: \u008a¬W×Uj3ì]l\u0005[Ýdû^Ô W=äÎ\u0095Óÿu\u009b\u0015Ã¸ñ\u0089nËª¹.hÕ¥#²\u000b`\u0005Úa¿I\u0015Ø\u0013\f+¢\u0003âÌ1is¦\n?ÊÞ\u0081Áh2Au\u008d]ºt~G¦\u009bh7";
int var5 = "Ö\u0089yQ\u0086¦iÇ®X\u0088]iE\u000eÞqÃéY´\u0098\u008d\u0089q¬{\u00934\u001fÃª½õ5ãx|x:\u0089(¸i{h\u0002FÄî|L^\u0080á6±¨/Ö: \u008a¬W×Uj3ì]l\u0005[Ýdû^Ô W=äÎ\u0095Óÿu\u009b\u0015Ã¸ñ\u0089nËª¹.hÕ¥#²\u000b`\u0005Úa¿I\u0015Ø\u0013\f+¢\u0003âÌ1is¦\n?ÊÞ\u0081Áh2Au\u008d]ºt~G¦\u009bh7"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
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
var29[var10001] = var46;
if (var2 >= var5) {
cb = var6;
db = new Integer[20];
KProperty[] var22 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(gf.class, a<"a">(8905, 5997343448115509912L ^ var20), a<"a">(7362, 369086142322754695L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(gf.class, a<"a">(19706, 8668566338803438754L ^ var20), a<"a">(29587, 7408075875488869331L ^ var20), 0)
)
};
d = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "7\u0088Hõ\u0004\u0000u\u007f\u009d}\u000b\u0083d²5U";
var5 = "7\u0088Hõ\u0004\u0000u\u007f\u009d}\u000b\u0083d²5U".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
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

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "½ÜA\u0015\u008aè÷Ó\u009c\u008fz(6ë\u0092ýIR\u0000æ9¯\u0091\u008dÁ:ö²\u0002V\u008aH\r¶\u0095\u0002DQ\u0015*º\u0080Ès%\u001d6ÌªÝ\u0019M®Æ9 p\u001cM\u0019F)R\u000fñ-\u0084¥»\u009aDÄ1©É\t\u008eÐ4WÆùßD£8\u001c¥$uÂÕ\u00941Ó¾8h\\Þ\u008a8ó|æ\u008co²\u0012\u0097EØù¿C~¹\u0012ã\u000fj\u008b\u0084\u0098ñ\u009d/\u0094³\u0012*åâ*ìù 7Ø^Zq$¼sµ°vÁ$\u008e\u001fÚ\u0083Å\u0084}\u009e\u000f\u0000¿B¼\u0001OíR\u0019¬";
var17 = "½ÜA\u0015\u008aè÷Ó\u009c\u008fz(6ë\u0092ýIR\u0000æ9¯\u0091\u008dÁ:ö²\u0002V\u008aH\r¶\u0095\u0002DQ\u0015*º\u0080Ès%\u001d6ÌªÝ\u0019M®Æ9 p\u001cM\u0019F)R\u000fñ-\u0084¥»\u009aDÄ1©É\t\u008eÐ4WÆùßD£8\u001c¥$uÂÕ\u00941Ó¾8h\\Þ\u008a8ó|æ\u008co²\u0012\u0097EØù¿C~¹\u0012ã\u000fj\u008b\u0084\u0098ñ\u009d/\u0094³\u0012*åâ*ìù 7Ø^Zq$¼sµ°vÁ$\u008e\u001fÚ\u0083Å\u0084}\u009e\u000f\u0000¿B¼\u0001OíR\u0019¬"
.length();
var14 = 136;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void k(String var0) {
W = var0;
}

public static String m() {
return W;
}

private static UnsupportedOperationException a(UnsupportedOperationException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3788;
if (ab[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])bb.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
bb.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/gf", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = Z[var5].getBytes("ISO-8859-1");
ab[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return ab[var5];
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
throw new RuntimeException("su/catlean/gf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10274;
if (db[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = cb[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])eb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
eb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/gf", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
db[var3] = var15;
}

return db[var3];
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
throw new RuntimeException("su/catlean/gf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
