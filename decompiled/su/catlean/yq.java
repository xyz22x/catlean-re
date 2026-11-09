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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class yq {
@NotNull
public static final wp Y;
@Nullable
private final String I;
@Nullable
private final String F;
@NotNull
private final pa K;
@Nullable
private final an l;
@Nullable
private final List G;
@JvmField
@NotNull
private static final Lazy[] h;
private static final long a = yz.a(-2789625979092287146L, -8112105834674818296L, MethodHandles.lookup().lookupClass()).a(71756260976984L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public yq(@Nullable String details, long a, @Nullable String state, @NotNull pa timestamps, @Nullable an assets, @Nullable List buttons) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(timestamps, a<"s">(16083, 2077668910974530795L ^ ax));
super();
this.I = details;
this.F = state;
this.K = timestamps;
this.l = assets;
this.G = buttons;
}

@Nullable
public final String w() {
return this.I;
}

@Nullable
public final String e() {
return this.F;
}

@NotNull
public final pa y() {
return this.K;
}

@Nullable
public final an z() {
return this.l;
}

@Nullable
public final List T() {
return this.G;
}

@Nullable
public final String D() {
return this.I;
}

@Nullable
public final String f() {
return this.F;
}

@NotNull
public final pa U() {
return this.K;
}

@Nullable
public final an Q() {
return this.l;
}

@Nullable
public final List G() {
return this.G;
}

@NotNull
public final yq o(long a, @Nullable String details, @Nullable String state, @NotNull pa timestamps, @Nullable an assets, @Nullable List buttons) {
ax = a ^ ax;
long var8 = ax ^ 52963566352982L;
Intrinsics.checkNotNullParameter(timestamps, a<"s">(19415, 8183289490539203424L ^ ax));
return new yq(details, var8, state, timestamps, assets, buttons);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static yq g(yq var0, String var1, String var2, long var3, pa var5, an var6, List var7, int var8, Object var9) {
var3 = a ^ var3;
long var10 = var3 ^ 46156318010937L;
_g[] var12 = vm.a<"Å">(926371336203302415L, var3);

int var10000;
label89: {
label88: {
try {
var10000 = var8 & 1;
if (var12 == null) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 884441523118937509L, var3);
}

var1 = var0.I;
}

var10000 = var8 & 2;
}

_g[] var10001;
label80: {
label79: {
label78: {
try {
var10001 = var12;
if (var3 < 0L) {
break label80;
}

if (var12 == null) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 884441523118937509L, var3);
}

var2 = var0.F;
}

var10000 = var8 & 4;
}

try {
var10001 = var12;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 884441523118937509L, var3);
}
}

label67: {
label66: {
label65: {
try {
if (var3 <= 0L) {
break label67;
}

if (var10001 == null) {
break label66;
}

if (var10000 == 0) {
break label65;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 884441523118937509L, var3);
}

var5 = var0.K;
}

var10000 = var8 & b<"j">(25035, 6933159786740231057L ^ var3);
}

try {
var10001 = var12;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 884441523118937509L, var3);
}
}

label54: {
label53: {
try {
if (var10001 == null) {
break label54;
}

if (var10000 == 0) {
break label53;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 884441523118937509L, var3);
}

var6 = var0.l;
}

var10000 = var8 & b<"j">(17902, 6891813579341795253L ^ var3);
}

if (var10000 != 0) {
var7 = var0.G;
}

return var0.o(var10, var1, var2, var5, var6, var7);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 55670506017225L;
List var3 = this.G;
an var4 = this.l;
pa var5 = this.K;
String var6 = this.F;
String var7 = this.I;
return a<"s">(22333, 3421614704866158029L ^ var1)
+ var7
+ a<"s">(5322, 8660441857625007678L ^ var1)
+ var6
+ a<"s">(5823, 206573375607317578L ^ var1)
+ var5
+ a<"s">(10646, 5507441235338664804L ^ var1)
+ var4
+ a<"s">(25111, 3843659704013476064L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/yq.a J
// 003: ldc2_w 89975355262973
// 006: lxor
// 007: lstore 1
// 008: ldc2_w -699914878618006371
// 00b: lload 1
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 3
// 012: aload 0
// 013: getfield su/catlean/yq.I Ljava/lang/String;
// 016: aload 3
// 017: ifnull 03c
// 01a: ifnonnull 038
// 01d: goto 02a
// 020: ldc2_w -660784415711236297
// 023: lload 1
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 0
// 02b: goto 03f
// 02e: ldc2_w -660784415711236297
// 031: lload 1
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 0
// 039: getfield su/catlean/yq.I Ljava/lang/String;
// 03c: invokevirtual java/lang/String.hashCode ()I
// 03f: istore 4
// 041: iload 4
// 043: sipush 20481
// 046: ldc2_w 3841403604336140491
// 049: lload 1
// 04a: lxor
// 04b: invokedynamic j (IJ)I bsm=su/catlean/yq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: imul
// 051: aload 0
// 052: getfield su/catlean/yq.F Ljava/lang/String;
// 055: aload 3
// 056: ifnull 07b
// 059: ifnonnull 077
// 05c: goto 069
// 05f: ldc2_w -660784415711236297
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: bipush 0
// 06a: goto 07e
// 06d: ldc2_w -660784415711236297
// 070: lload 1
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 0
// 078: getfield su/catlean/yq.F Ljava/lang/String;
// 07b: invokevirtual java/lang/String.hashCode ()I
// 07e: iadd
// 07f: istore 4
// 081: iload 4
// 083: sipush 14956
// 086: ldc2_w 1880162363139328679
// 089: lload 1
// 08a: lxor
// 08b: invokedynamic j (IJ)I bsm=su/catlean/yq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: imul
// 091: aload 0
// 092: getfield su/catlean/yq.K Lsu/catlean/pa;
// 095: invokevirtual su/catlean/pa.hashCode ()I
// 098: iadd
// 099: istore 4
// 09b: iload 4
// 09d: sipush 14956
// 0a0: ldc2_w 1880162363139328679
// 0a3: lload 1
// 0a4: lxor
// 0a5: invokedynamic j (IJ)I bsm=su/catlean/yq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: imul
// 0ab: aload 0
// 0ac: getfield su/catlean/yq.l Lsu/catlean/an;
// 0af: aload 3
// 0b0: ifnull 0d5
// 0b3: ifnonnull 0d1
// 0b6: goto 0c3
// 0b9: ldc2_w -660784415711236297
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: bipush 0
// 0c4: goto 0d8
// 0c7: ldc2_w -660784415711236297
// 0ca: lload 1
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 0
// 0d2: getfield su/catlean/yq.l Lsu/catlean/an;
// 0d5: invokevirtual su/catlean/an.hashCode ()I
// 0d8: iadd
// 0d9: istore 4
// 0db: iload 4
// 0dd: sipush 14956
// 0e0: ldc2_w 1880162363139328679
// 0e3: lload 1
// 0e4: lxor
// 0e5: invokedynamic j (IJ)I bsm=su/catlean/yq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: imul
// 0eb: aload 0
// 0ec: getfield su/catlean/yq.G Ljava/util/List;
// 0ef: aload 3
// 0f0: ifnull 115
// 0f3: ifnonnull 111
// 0f6: goto 103
// 0f9: ldc2_w -660784415711236297
// 0fc: lload 1
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: bipush 0
// 104: goto 118
// 107: ldc2_w -660784415711236297
// 10a: lload 1
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: aload 0
// 112: getfield su/catlean/yq.G Ljava/util/List;
// 115: invokevirtual java/lang/Object.hashCode ()I
// 118: iadd
// 119: istore 4
// 11b: iload 4
// 11d: ldc2_w -686823709577320218
// 120: lload 1
// 121: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: ifnull 143
// 129: bipush 5
// 12a: anewarray 103
// 12d: ldc2_w -591676542940856183
// 130: lload 1
// 131: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: goto 143
// 139: ldc2_w -660784415711236297
// 13c: lload 1
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: ireturn
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
// 000: getstatic su/catlean/yq.a J
// 003: ldc2_w 125198401253340
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -7032292566823607108
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -6992599179666684138
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -6992599179666684138
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/yq
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -6992599179666684138
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -6992599179666684138
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/yq
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/yq.I Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/yq.I Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -6992599179666684138
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -6992599179666684138
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/yq.F Ljava/lang/String;
// 092: aload 5
// 094: getfield su/catlean/yq.F Ljava/lang/String;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -6992599179666684138
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -6992599179666684138
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/yq.K Lsu/catlean/pa;
// 0bf: aload 5
// 0c1: getfield su/catlean/yq.K Lsu/catlean/pa;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -6992599179666684138
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -6992599179666684138
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/yq.l Lsu/catlean/an;
// 0ec: aload 5
// 0ee: getfield su/catlean/yq.l Lsu/catlean/an;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: aload 4
// 0f6: ifnull 121
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w -6992599179666684138
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -6992599179666684138
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/yq.G Ljava/util/List;
// 119: aload 5
// 11b: getfield su/catlean/yq.G Ljava/util/List;
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 4
// 123: ifnull 143
// 126: ifne 142
// 129: goto 136
// 12c: ldc2_w -6992599179666684138
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -6992599179666684138
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 1
// 143: ireturn
}

@JvmStatic
public static final void c(yq self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = h;
output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.I);
output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.F);
output.encodeSerializableElement(serialDesc, 2, we.i, self.K);
output.encodeNullableSerializableElement(serialDesc, 3, lf.H, self.l);
output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy<? super List>)var3[4].getValue(), self.G);
}

public yq(
int seen0, String details, String state, pa timestamps, an assets, long a, List buttons, SerializationConstructorMarker serializationConstructorMarker
) {
ax = a ^ ax;
if (b<"j">(14956, 1880236468885322308L ^ ax) != (b<"j">(14956, 1880236468885322308L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"j">(14956, 1880236468885322308L ^ ax), bd.M.getDescriptor());
}

super();
this.I = details;
this.F = state;
this.K = timestamps;
this.l = assets;
this.G = buttons;
}

private static final KSerializer i() {
return new ArrayListSerializer(k.Z);
}

public static final Lazy[] k() {
return h;
}

static {
long var11 = a ^ 9800932957269L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[7];
int var18 = 0;
String var17 = "év\u008búÕ\u0095çÂ£N\u0002P^\u009a®¬Ô\u0006ÞÌr/,®8\b¢J¦i\u008cp(oñÛ-R6ëºT×\u001bÀ\u008b\u0083&Õb\u0098°cak\u0082sÛ\u001d\u0011T¥¼XØ=\u0019\u001bÏÅîsÂ *3àø\u0013ê·\\:KqáU0^ÒuRÇÉG¥_Á\u00960¬\u0083Rø\u008dE yÂßÅç\u009f¤i²Úk\u009e`!ÞûÄÅ@}b,@ØY&\u0005\u0004[\u008cJ$ \u000eñnÆDëçç\u0085ø(â@`ìtbá*\u0093|a¡.P\u0014º\u00ad5»5\u0095";
int var19 = "év\u008búÕ\u0095çÂ£N\u0002P^\u009a®¬Ô\u0006ÞÌr/,®8\b¢J¦i\u008cp(oñÛ-R6ëºT×\u001bÀ\u008b\u0083&Õb\u0098°cak\u0082sÛ\u001d\u0011T¥¼XØ=\u0019\u001bÏÅîsÂ *3àø\u0013ê·\\:KqáU0^ÒuRÇÉG¥_Á\u00960¬\u0083Rø\u008dE yÂßÅç\u009f¤i²Úk\u009e`!ÞûÄÅ@}b,@ØY&\u0005\u0004[\u008cJ$ \u000eñnÆDëçç\u0085ø(â@`ìtbá*\u0093|a¡.P\u0014º\u00ad5»5\u0095"
.length();
char var16 = ' ';
int var25 = -1;

label54:
while (true) {
String var26 = var17.substring(++var25, var25 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var37;
if ((var25 += var16) >= var19) {
b = var20;
c = new String[7];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "PèC±y\u0087høe=¸ZÙD4(";
int var5 = "PèC±y\u0087høe=¸ZÙD4(".length();
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
e = var6;
f = new Integer[4];
Y = new wp(null);
Lazy[] var22 = new Lazy[]{null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, yq::i)};
h = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "\u008a¡\u0082Wx\u0089½mã&ÓÝ\u0016\u0081Wi";
var5 = "\u008a¡\u0082Wx\u0089½mã&ÓÝ\u0016\u0081Wi".length();
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

var16 = var17.charAt(var25);
break;
default:
var20[var18++] = var37;
if ((var25 += var16) < var19) {
var16 = var17.charAt(var25);
continue label54;
}

var17 = "\u0081\u0086Ü8D\u0099©\tß\u0013Pjåå0\u0094\u008c®ÆÆN¤\bÑ\u0098_\u0080c\u0080\u007f\u007f. \u009czRÄ\r\u0014L\u001c±ütR\u009eÙý:²Í9\u001e*CjOæÜï\u00060=eÕ";
var19 = "\u0081\u0086Ü8D\u0099©\tß\u0013Pjåå0\u0094\u008c®ÆÆN¤\bÑ\u0098_\u0080c\u0080\u007f\u007f. \u009czRÄ\r\u0014L\u001c±ütR\u009eÙý:²Í9\u001e*CjOæÜï\u00060=eÕ"
.length();
var16 = ' ';
var25 = -1;
}

var26 = var17.substring(++var25, var25 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21475;
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
throw new RuntimeException("su/catlean/yq", var10);
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
throw new RuntimeException("su/catlean/yq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18415;
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
throw new RuntimeException("su/catlean/yq", var14);
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
throw new RuntimeException("su/catlean/yq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
