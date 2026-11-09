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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class f0 {
@NotNull
public static final xv D;
@NotNull
private String V;
@NotNull
private String H;
@NotNull
private String E;
private static String[] y;
private static final long a = yz.a(5140828051802494958L, -3215160988240386815L, MethodHandles.lookup().lookupClass()).a(214153308615503L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public f0(int a, @NotNull String id, @NotNull String username, short a, short a, @NotNull String avatar) {
long var7 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(id, a<"h">(12419, 7925853652400772889L ^ var7));
Intrinsics.checkNotNullParameter(username, a<"h">(12680, 2474836380300842512L ^ var7));
Intrinsics.checkNotNullParameter(avatar, a<"h">(26260, 4624211797043167501L ^ var7));
super();
this.V = id;
this.H = username;
this.E = avatar;
}

public f0(String var1, String var2, String var3, int var4, DefaultConstructorMarker var5, byte var6, int var7, int var8) {
long var9 = ((long)var6 << 56 | (long)var7 << 32 >>> 8 | (long)var8 << 40 >>> 40) ^ a;
long var10001 = var9 ^ 31516905103384L;
int var11 = (int)((var9 ^ 31516905103384L) >>> 32);
int var12 = (int)((var9 ^ 31516905103384L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
if ((var4 & 1) != 0) {
var1 = a<"h">(1794, 2978914718841958711L ^ var9);
}

if ((var4 & 2) != 0) {
var2 = a<"h">(24849, 4835470816118445858L ^ var9);
}

if ((var4 & 4) != 0) {
var3 = a<"h">(24849, 4835470816118445858L ^ var9);
}

this(var11, var1, var2, (short)var12, (short)var13, var3);
}

@NotNull
public final String M() {
return this.V;
}

public final void K(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(20781, 4821200486810880111L ^ ax));
this.V = <set-?>;
}

@NotNull
public final String W() {
return this.H;
}

public final void x(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(27312, 2855702941701345235L ^ ax));
this.H = <set-?>;
}

@NotNull
public final String v() {
return this.E;
}

public final void B(@NotNull String <set-?>, long a, byte a) {
long var5 = (axx << 8 | (long)ax << 56 >>> 56) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(27312, 2855640933499422545L ^ var5));
this.E = <set-?>;
}

@NotNull
public final String u(int size, boolean forcePng, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f0.a J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: ldc2_w -8035975481736414628
// 09: lload 3
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: nop
// 10: astore 5
// 12: aload 0
// 13: getfield su/catlean/f0.E Ljava/lang/String;
// 16: sipush 32522
// 19: ldc2_w 997427929506436398
// 1c: lload 3
// 1d: lxor
// 1e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23: bipush 0
// 24: aload 5
// 26: ifnonnull 91
// 29: bipush 2
// 2a: aconst_null
// 2b: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
// 2e: ifeq 88
// 31: goto 3e
// 34: ldc2_w -8043552299611770268
// 37: lload 3
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: iload 2
// 3f: ifne 88
// 42: goto 4f
// 45: ldc2_w -8043552299611770268
// 48: lload 3
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 0
// 50: getfield su/catlean/f0.V Ljava/lang/String;
// 53: aload 0
// 54: getfield su/catlean/f0.E Ljava/lang/String;
// 57: iload 1
// 58: istore 6
// 5a: astore 7
// 5c: astore 8
// 5e: sipush 25397
// 61: ldc2_w 8925969111497984277
// 64: lload 3
// 65: lxor
// 66: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: aload 8
// 6d: ldc "/"
// 6f: aload 7
// 71: sipush 3664
// 74: ldc2_w 1760721594962551933
// 77: lload 3
// 78: lxor
// 79: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: iload 6
// 80: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
// 85: goto be
// 88: aload 0
// 89: getfield su/catlean/f0.V Ljava/lang/String;
// 8c: aload 0
// 8d: getfield su/catlean/f0.E Ljava/lang/String;
// 90: iload 1
// 91: istore 9
// 93: astore 10
// 95: astore 11
// 97: sipush 21919
// 9a: ldc2_w 3504134121385295800
// 9d: lload 3
// 9e: lxor
// 9f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: aload 11
// a6: ldc "/"
// a8: aload 10
// aa: sipush 23244
// ad: ldc2_w 544068922876129507
// b0: lload 3
// b1: lxor
// b2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: iload 9
// b9: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
// be: areturn
}

public static String Q(f0 var0, long var1, int var3, boolean var4, int var5, Object var6) {
var1 = a ^ var1;
long var7 = var1 ^ 27581140819062L;
String[] var9 = vm.a<"Å">(9060218101120948122L, var1);

int var10000;
label37: {
label36: {
try {
var10000 = var5 & 1;
if (var9 != null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 9050451227949129634L, var1);
}

var3 = b<"d">(28797, 7855124530970601942L ^ var1);
}

var10000 = var5 & 2;
}

label27: {
try {
if (var9 != null) {
break label27;
}

if (var10000 == 0) {
return var0.u(var3, (boolean)var4, var7);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 9050451227949129634L, var1);
}

var10000 = 0;
}

var4 = var10000;
return var0.u(var3, (boolean)var4, var7);
}

@NotNull
public final String A() {
return this.V;
}

@NotNull
public final String o() {
return this.H;
}

@NotNull
public final String U() {
return this.E;
}

@NotNull
public final f0 J(char a, @NotNull String id, short a, @NotNull String username, int a, @NotNull String avatar) {
long var7 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var10001 = var7 ^ 15597356455550L;
int var9 = (int)((var7 ^ 15597356455550L) >>> 32);
int var10 = (int)((var7 ^ 15597356455550L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(id, a<"h">(26991, 8253888558593796389L ^ var7));
Intrinsics.checkNotNullParameter(username, a<"h">(19716, 660675011966586191L ^ var7));
Intrinsics.checkNotNullParameter(avatar, a<"h">(22999, 4459692881560590732L ^ var7));
return new f0(var9, id, username, (short)var10, (short)var11, avatar);
}

public static f0 m(long var0, f0 var2, String var3, String var4, String var5, int var6, Object var7) {
var0 = a ^ var0;
long var10001 = var0 ^ 37456692256469L;
int var8 = (int)((var0 ^ 37456692256469L) >>> 48);
int var9 = (int)((var0 ^ 37456692256469L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
String[] var11 = vm.a<"Å">(-7682463066896974012L, var0);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var11 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -7690004495248705668L, var0);
}

var3 = var2.V;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var11 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -7690004495248705668L, var0);
}

var4 = var2.H;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var2.E;
}

return var2.J((char)var8, var3, (short)var9, var4, var10, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 81986222870229L;
String var3 = this.E;
String var4 = this.H;
String var5 = this.V;
return a<"h">(10075, 2877941847792870159L ^ var1)
+ var5
+ a<"h">(28410, 1504687976732797610L ^ var1)
+ var4
+ a<"h">(20867, 3475219143142184400L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 22853931227057L;
int var3 = this.V.hashCode();
var3 = var3 * b<"d">(6735, 4559536974063884597L ^ var1) + this.H.hashCode();
return var3 * b<"d">(15548, 5333293303594155973L ^ var1) + this.E.hashCode();
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
// 00: getstatic su/catlean/f0.a J
// 03: ldc2_w 83741921839460
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 4159754350023185308
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 4152212917309381540
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 4152212917309381540
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/f0
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 4152212917309381540
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 4152212917309381540
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/f0
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/f0.V Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/f0.V Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 4152212917309381540
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 4152212917309381540
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/f0.H Ljava/lang/String;
// 92: aload 5
// 94: getfield su/catlean/f0.H Ljava/lang/String;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnonnull c7
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 4152212917309381540
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 4152212917309381540
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/f0.E Ljava/lang/String;
// bf: aload 5
// c1: getfield su/catlean/f0.E Ljava/lang/String;
// c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c7: aload 4
// c9: ifnonnull e9
// cc: ifne e8
// cf: goto dc
// d2: ldc2_w 4152212917309381540
// d5: lload 2
// d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db: athrow
// dc: bipush 0
// dd: ireturn
// de: ldc2_w 4152212917309381540
// e1: lload 2
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: ireturn
}

@JvmStatic
public static final void j(long a, f0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f0.a J
// 003: lload 0
// 004: lxor
// 005: lstore 0
// 006: ldc2_w 1177715147452693118
// 009: lload 0
// 00a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 5
// 011: aload 3
// 012: aload 4
// 014: bipush 0
// 015: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 01a: aload 5
// 01c: ifnonnull 051
// 01f: ifeq 03d
// 022: goto 02f
// 025: ldc2_w 1188352730755019334
// 028: lload 0
// 029: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: athrow
// 02f: bipush 1
// 030: goto 06b
// 033: ldc2_w 1188352730755019334
// 036: lload 0
// 037: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: athrow
// 03d: aload 2
// 03e: getfield su/catlean/f0.V Ljava/lang/String;
// 041: sipush 24849
// 044: ldc2_w 4835591733665483547
// 047: lload 0
// 048: lxor
// 049: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 051: aload 5
// 053: ifnonnull 067
// 056: ifne 06a
// 059: goto 066
// 05c: ldc2_w 1188352730755019334
// 05f: lload 0
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: bipush 1
// 067: goto 06b
// 06a: bipush 0
// 06b: lload 0
// 06c: lconst_0
// 06d: lcmp
// 06e: iflt 097
// 071: ifeq 08e
// 074: aload 3
// 075: aload 4
// 077: bipush 0
// 078: aload 2
// 079: getfield su/catlean/f0.V Ljava/lang/String;
// 07c: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 081: goto 08e
// 084: ldc2_w 1188352730755019334
// 087: lload 0
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 3
// 08f: aload 4
// 091: bipush 1
// 092: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 097: aload 5
// 099: lload 0
// 09a: lconst_0
// 09b: lcmp
// 09c: iflt 0d6
// 09f: ifnonnull 0d4
// 0a2: ifeq 0c0
// 0a5: goto 0b2
// 0a8: ldc2_w 1188352730755019334
// 0ab: lload 0
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: bipush 1
// 0b3: goto 0ee
// 0b6: ldc2_w 1188352730755019334
// 0b9: lload 0
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 2
// 0c1: getfield su/catlean/f0.H Ljava/lang/String;
// 0c4: sipush 24849
// 0c7: ldc2_w 4835591733665483547
// 0ca: lload 0
// 0cb: lxor
// 0cc: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d4: aload 5
// 0d6: ifnonnull 0ea
// 0d9: ifne 0ed
// 0dc: goto 0e9
// 0df: ldc2_w 1188352730755019334
// 0e2: lload 0
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: bipush 1
// 0ea: goto 0ee
// 0ed: bipush 0
// 0ee: lload 0
// 0ef: lconst_0
// 0f0: lcmp
// 0f1: iflt 11a
// 0f4: ifeq 111
// 0f7: aload 3
// 0f8: aload 4
// 0fa: bipush 1
// 0fb: aload 2
// 0fc: getfield su/catlean/f0.H Ljava/lang/String;
// 0ff: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 104: goto 111
// 107: ldc2_w 1188352730755019334
// 10a: lload 0
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: aload 3
// 112: aload 4
// 114: bipush 2
// 115: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 11a: aload 5
// 11c: lload 0
// 11d: lconst_0
// 11e: lcmp
// 11f: ifle 159
// 122: ifnonnull 157
// 125: ifeq 143
// 128: goto 135
// 12b: ldc2_w 1188352730755019334
// 12e: lload 0
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: bipush 1
// 136: goto 171
// 139: ldc2_w 1188352730755019334
// 13c: lload 0
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: aload 2
// 144: getfield su/catlean/f0.E Ljava/lang/String;
// 147: sipush 24849
// 14a: ldc2_w 4835591733665483547
// 14d: lload 0
// 14e: lxor
// 14f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 157: aload 5
// 159: ifnonnull 16d
// 15c: ifne 170
// 15f: goto 16c
// 162: ldc2_w 1188352730755019334
// 165: lload 0
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: bipush 1
// 16d: goto 171
// 170: bipush 0
// 171: ifeq 18e
// 174: aload 3
// 175: aload 4
// 177: bipush 2
// 178: aload 2
// 179: getfield su/catlean/f0.E Ljava/lang/String;
// 17c: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 181: goto 18e
// 184: ldc2_w 1188352730755019334
// 187: lload 0
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: return
}

public f0(int seen0, long a, String id, String username, String avatar, SerializationConstructorMarker serializationConstructorMarker) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f0.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -5872607038824053594
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 8
// 11: bipush 0
// 12: iload 1
// 13: iand
// 14: ifeq 22
// 17: iload 1
// 18: bipush 0
// 19: getstatic su/catlean/fn.k Lsu/catlean/fn;
// 1c: invokevirtual su/catlean/fn.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 1f: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 22: aload 0
// 23: invokespecial java/lang/Object.<init> ()V
// 26: aload 8
// 28: lload 2
// 29: lconst_0
// 2a: lcmp
// 2b: iflt 5d
// 2e: ifnonnull 55
// 31: iload 1
// 32: bipush 1
// 33: iand
// 34: ifne 60
// 37: aload 0
// 38: sipush 24849
// 3b: ldc2_w 4835497808437900739
// 3e: lload 2
// 3f: lxor
// 40: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: putfield su/catlean/f0.V Ljava/lang/String;
// 48: goto 55
// 4b: ldc2_w -5862074625245573986
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: lload 2
// 56: lconst_0
// 57: lcmp
// 58: ifle 73
// 5b: aload 8
// 5d: ifnull 73
// 60: aload 0
// 61: aload 4
// 63: putfield su/catlean/f0.V Ljava/lang/String;
// 66: goto 73
// 69: ldc2_w -5862074625245573986
// 6c: lload 2
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: lload 2
// 74: lconst_0
// 75: lcmp
// 76: ifle ae
// 79: iload 1
// 7a: bipush 2
// 7b: iand
// 7c: ifne a8
// 7f: aload 0
// 80: sipush 24849
// 83: ldc2_w 4835497808437900739
// 86: lload 2
// 87: lxor
// 88: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: putfield su/catlean/f0.H Ljava/lang/String;
// 90: lload 2
// 91: lconst_0
// 92: lcmp
// 93: ifle bb
// 96: aload 8
// 98: ifnull bb
// 9b: goto a8
// 9e: ldc2_w -5862074625245573986
// a1: lload 2
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: aload 0
// a9: aload 5
// ab: putfield su/catlean/f0.H Ljava/lang/String;
// ae: goto bb
// b1: ldc2_w -5862074625245573986
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: lload 2
// bc: lconst_0
// bd: lcmp
// be: ifle f0
// c1: iload 1
// c2: bipush 4
// c3: iand
// c4: ifne ea
// c7: aload 0
// c8: sipush 24849
// cb: ldc2_w 4835497808437900739
// ce: lload 2
// cf: lxor
// d0: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/f0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: putfield su/catlean/f0.E Ljava/lang/String;
// d8: aload 8
// da: ifnull fd
// dd: goto ea
// e0: ldc2_w -5862074625245573986
// e3: lload 2
// e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e9: athrow
// ea: aload 0
// eb: aload 6
// ed: putfield su/catlean/f0.E Ljava/lang/String;
// f0: goto fd
// f3: ldc2_w -5862074625245573986
// f6: lload 2
// f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// fc: athrow
// fd: return
}

public f0(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var10001 = var4 ^ 87069188827651L;
int var6 = (int)((var4 ^ 87069188827651L) >>> 56);
int var7 = (int)((var4 ^ 87069188827651L) << 8 >>> 32);
int var8 = (int)(var10001 << 40 >>> 40);
this(null, null, null, b<"d">(27254, 9089644634584488368L ^ var4), null, (byte)var6, var7, var8);
}

static {
long var20 = a ^ 61417325037449L;
vm.a<"Å">(null, -5241480639568928532L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[18];
int var16 = 0;
String var15 = "\u008cTùº\u009b\u008aù]vCÔV¸Ç¼^@Ì\u0018M\u008eh\u008f\" Ô\u0090Ñnà\u009bX\u008d|µpbNbÓÖ*ý]/\u001bzÅÑ\"G\u0019¯4!åçÎ«Úõ0\f\u001aèéâiið\u008d\u008bà¼XÑ9Í{x¾\u0010w\u0003\u001c.vSÀíô¥\u0005ºÓ!ø®\u0018\u001aIø\fû\u0019(5±\n¨æ\u007f\u0015\u008ar!k}>\u0001\u0098@M \u0019á¤\u008fýWî\u009e\"\"3\u001dS30ð9âï²\u009eÍP\u0088úö\u0000\u0080\u0019Õ\u0004\u0000\u0010>\u000bYHÿ\u000b\u001eÈ³0´\u0087>®\u000eÛ@\u0086PK#à\u0084Å\u001b¿¾j$7\u001a\t@Æ\u008dñ,\u0098¼:©Èjd§CÔ\u0016?®\u007fóÌ+@A}\u007fé,Æ\u000fúãs(9\u008fbð·¥¸JîþGÝ\f0\u0017 ¹\r/N\u0012×\u0000\u0012\u009d~Å6k\u0004Æ>ÅûÔ,JÑ=%=}²\u008fKSµ¤\u0010ñ>{Ù\u007fÅöG\\ù\u009aÎH>xt «\u009eE\u0088Ð6\u0096\b)\u0015_\u0082\u0012\rE¨Üéï\u009b\u001bB¹_\u0005Ê:çèsy2\u0010{\u000eH8\u000e\u00adÎÑ\u0088Ç\rÎ\u0018TÅç Q\u0095\u008f×ìP\u0094«\u000e\u0084Ü¬x*\u008dÑ+{ üA\u009a¥ó\u009e\tÇ\u0019¥\u0002µÖ\u0010\u008c\u008d \n'5±\u0012\u000e\u0013]\u0006\u00ad°)÷\u0018xÿ\u0089îbtäGÿÔëÓ\u001a\u0012Ô\u0019x&É<ßþµç\u0010\u0005Lµ\u000eç'5Ì\u0083e\"DòÓr \u0010Î\u0005Zø!â¸X³\u000b=BÚdj\u0097";
int var17 = "\u008cTùº\u009b\u008aù]vCÔV¸Ç¼^@Ì\u0018M\u008eh\u008f\" Ô\u0090Ñnà\u009bX\u008d|µpbNbÓÖ*ý]/\u001bzÅÑ\"G\u0019¯4!åçÎ«Úõ0\f\u001aèéâiið\u008d\u008bà¼XÑ9Í{x¾\u0010w\u0003\u001c.vSÀíô¥\u0005ºÓ!ø®\u0018\u001aIø\fû\u0019(5±\n¨æ\u007f\u0015\u008ar!k}>\u0001\u0098@M \u0019á¤\u008fýWî\u009e\"\"3\u001dS30ð9âï²\u009eÍP\u0088úö\u0000\u0080\u0019Õ\u0004\u0000\u0010>\u000bYHÿ\u000b\u001eÈ³0´\u0087>®\u000eÛ@\u0086PK#à\u0084Å\u001b¿¾j$7\u001a\t@Æ\u008dñ,\u0098¼:©Èjd§CÔ\u0016?®\u007fóÌ+@A}\u007fé,Æ\u000fúãs(9\u008fbð·¥¸JîþGÝ\f0\u0017 ¹\r/N\u0012×\u0000\u0012\u009d~Å6k\u0004Æ>ÅûÔ,JÑ=%=}²\u008fKSµ¤\u0010ñ>{Ù\u007fÅöG\\ù\u009aÎH>xt «\u009eE\u0088Ð6\u0096\b)\u0015_\u0082\u0012\rE¨Üéï\u009b\u001bB¹_\u0005Ê:çèsy2\u0010{\u000eH8\u000e\u00adÎÑ\u0088Ç\rÎ\u0018TÅç Q\u0095\u008f×ìP\u0094«\u000e\u0084Ü¬x*\u008dÑ+{ üA\u009a¥ó\u009e\tÇ\u0019¥\u0002µÖ\u0010\u008c\u008d \n'5±\u0012\u000e\u0013]\u0006\u00ad°)÷\u0018xÿ\u0089îbtäGÿÔëÓ\u001a\u0012Ô\u0019x&É<ßþµç\u0010\u0005Lµ\u000eç'5Ì\u0083e\"DòÓr \u0010Î\u0005Zø!â¸X³\u000b=BÚdj\u0097"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[18];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "þ£\u0006Ñ;±äÙ¿\u009fô\u009d§)\u001eé";
int var5 = "þ£\u0006Ñ;±äÙ¿\u009fô\u009d§)\u001eé".length();
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
e = var6;
f = new Integer[4];
D = new xv(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "õ«?\u009b\u008d\u001ema\u001a(Ö DHx*";
var5 = "õ«?\u009b\u008d\u001ema\u001a(Ö DHx*".length();
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

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "\u0014\u008bå5\u0088\u008bÒ¥¹·\u0018\u0010\u0016 d§e\u009f\u001b²Ô\u0097\u0016µÛ#»\u0086q¶EÒ\u0010\u0093\u0095\u008ct`p°¡9Çñ\u001c\u0003ÄVù";
var17 = "\u0014\u008bå5\u0088\u008bÒ¥¹·\u0018\u0010\u0016 d§e\u009f\u001b²Ô\u0097\u0016µÛ#»\u0086q¶EÒ\u0010\u0093\u0095\u008ct`p°¡9Çñ\u001c\u0003ÄVù".length();
var14 = ' ';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void N(String[] var0) {
y = var0;
}

public static String[] L() {
return y;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15154;
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
throw new RuntimeException("su/catlean/f0", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/f0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9595;
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
throw new RuntimeException("su/catlean/f0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/f0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
