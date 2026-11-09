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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class nh implements wl {
@NotNull
public static final jo Y;
@NotNull
private String r;
@NotNull
private lj f;
private boolean q;
@NotNull
private String Q;
@NotNull
private String i;
@NotNull
private String C;
@NotNull
private String G;
private boolean j;
private static _g[] J;
private static final long a = yz.a(-6448266468659516814L, -5397245568266820198L, MethodHandles.lookup().lookupClass()).a(167200558413576L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

public nh(
@NotNull String id,
@NotNull lj bind,
boolean enabled,
@NotNull String module,
@NotNull String setting,
@NotNull String pressValue,
@NotNull String releaseValue,
boolean hold,
long a
) {
ax = a ^ ax;
boolean var10000 = vm.a<"Å">(-1809004810277525509L, ax);
Intrinsics.checkNotNullParameter(id, a<"u">(18313, 3653025049955594458L ^ ax));
boolean var11 = var10000;
Intrinsics.checkNotNullParameter(bind, a<"u">(4969, 7716856197248820268L ^ ax));
Intrinsics.checkNotNullParameter(module, a<"u">(21585, 4080901808258442002L ^ ax));
Intrinsics.checkNotNullParameter(setting, a<"u">(27816, 1928675425761582072L ^ ax));
Intrinsics.checkNotNullParameter(pressValue, a<"u">(11202, 1755393788124765332L ^ ax));
Intrinsics.checkNotNullParameter(releaseValue, a<"u">(11712, 1585427144024234644L ^ ax));
super();
this.r = id;
this.f = bind;
this.q = enabled;
this.Q = module;
this.i = setting;
this.C = pressValue;
this.G = releaseValue;
this.j = hold;
if (vm.a<"Å">(-1838083220882458388L, ax) != null) {
label22: {
try {
var10000 = var11;
if (ax <= 0L) {
break label22;
}

if (var11) {
var10000 = false;
break label22;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -1871304794071236756L, ax);
}

var10000 = true;
}

vm.a<"Å">(var10000, -1858585849700715895L, ax);
}
}

@NotNull
@Override
public String W() {
return this.r;
}

@Override
public void j(@NotNull String <set-?>, long a) {
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(25211, 2369047179145243064L ^ ax));
this.r = <set-?>;
}

@NotNull
@Override
public lj X() {
return this.f;
}

@Override
public void r(@NotNull lj <set-?>, long a) {
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(25211, 2369050572634350164L ^ ax));
this.f = <set-?>;
}

@Override
public boolean I() {
return this.q;
}

@Override
public void K(boolean <set-?>) {
this.q = <set-?>;
}

@NotNull
public final String f() {
return this.Q;
}

public final void l(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(25211, 2369101086868183444L ^ ax));
this.Q = <set-?>;
}

@NotNull
public final String R() {
return this.i;
}

public final void k(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(25211, 2369078724506020547L ^ ax));
this.i = <set-?>;
}

@NotNull
public final String M() {
return this.C;
}

public final void p(int a, @NotNull String <set-?>, char a, short a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(25211, 2369156466915412862L ^ var5));
this.C = <set-?>;
}

@NotNull
public final String V() {
return this.G;
}

public final void x(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(10639, 308948615440604886L ^ ax));
this.G = <set-?>;
}

public final boolean s() {
return this.j;
}

public final void I(boolean <set-?>) {
this.j = <set-?>;
}

@NotNull
public final String H() {
return this.r;
}

@NotNull
public final lj n() {
return this.f;
}

public final boolean d() {
return this.q;
}

@NotNull
public final String O() {
return this.Q;
}

@NotNull
public final String U() {
return this.i;
}

@NotNull
public final String p() {
return this.C;
}

@NotNull
public final String c() {
return this.G;
}

public final boolean Q() {
return this.j;
}

@NotNull
public final nh Y(
int a,
@NotNull String id,
char a,
@NotNull lj bind,
boolean enabled,
@NotNull String module,
@NotNull String setting,
@NotNull String pressValue,
@NotNull String releaseValue,
boolean hold,
short a
) {
long var12 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var14 = var12 ^ 63658249358326L;
Intrinsics.checkNotNullParameter(id, a<"u">(8410, 5409807251961219618L ^ var12));
Intrinsics.checkNotNullParameter(bind, a<"u">(27327, 4752265787520991315L ^ var12));
Intrinsics.checkNotNullParameter(module, a<"u">(21090, 2308452788302379138L ^ var12));
Intrinsics.checkNotNullParameter(setting, a<"u">(7437, 179994240769505256L ^ var12));
Intrinsics.checkNotNullParameter(pressValue, a<"u">(25748, 995126608487566967L ^ var12));
Intrinsics.checkNotNullParameter(releaseValue, a<"u">(5162, 3899030494061706967L ^ var12));
return new nh(id, bind, enabled, module, setting, pressValue, releaseValue, hold, var14);
}

public static nh o(
nh param0,
long param1,
String param3,
lj param4,
boolean param5,
String param6,
String param7,
String param8,
String param9,
boolean param10,
int param11,
Object param12
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nh.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 61573609222068
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 13
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 14
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 15
// 027: pop2
// 028: pop2
// 029: ldc2_w 191154838269232057
// 02c: lload 1
// 02d: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: istore 16
// 034: iload 11
// 036: bipush 1
// 037: iand
// 038: iload 16
// 03a: ifeq 056
// 03d: ifeq 052
// 040: goto 04d
// 043: ldc2_w 163761064216369966
// 046: lload 1
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: aload 0
// 04e: getfield su/catlean/nh.r Ljava/lang/String;
// 051: astore 3
// 052: iload 11
// 054: bipush 2
// 055: iand
// 056: iload 16
// 058: lload 1
// 059: lconst_0
// 05a: lcmp
// 05b: ifle 07d
// 05e: ifeq 07b
// 061: ifeq 077
// 064: goto 071
// 067: ldc2_w 163761064216369966
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 0
// 072: getfield su/catlean/nh.f Lsu/catlean/lj;
// 075: astore 4
// 077: iload 11
// 079: bipush 4
// 07a: iand
// 07b: iload 16
// 07d: lload 1
// 07e: lconst_0
// 07f: lcmp
// 080: iflt 0ae
// 083: ifeq 0ac
// 086: ifeq 09c
// 089: goto 096
// 08c: ldc2_w 163761064216369966
// 08f: lload 1
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 0
// 097: getfield su/catlean/nh.q Z
// 09a: istore 5
// 09c: iload 11
// 09e: sipush 1259
// 0a1: ldc2_w 3371259119669331948
// 0a4: lload 1
// 0a5: lxor
// 0a6: invokedynamic l (IJ)I bsm=su/catlean/nh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: iand
// 0ac: iload 16
// 0ae: lload 1
// 0af: lconst_0
// 0b0: lcmp
// 0b1: ifle 0df
// 0b4: ifeq 0dd
// 0b7: ifeq 0cd
// 0ba: goto 0c7
// 0bd: ldc2_w 163761064216369966
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: aload 0
// 0c8: getfield su/catlean/nh.Q Ljava/lang/String;
// 0cb: astore 6
// 0cd: iload 11
// 0cf: sipush 18625
// 0d2: ldc2_w 7224252767909678018
// 0d5: lload 1
// 0d6: lxor
// 0d7: invokedynamic l (IJ)I bsm=su/catlean/nh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: iand
// 0dd: iload 16
// 0df: lload 1
// 0e0: lconst_0
// 0e1: lcmp
// 0e2: ifle 110
// 0e5: ifeq 10e
// 0e8: ifeq 0fe
// 0eb: goto 0f8
// 0ee: ldc2_w 163761064216369966
// 0f1: lload 1
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 0
// 0f9: getfield su/catlean/nh.i Ljava/lang/String;
// 0fc: astore 7
// 0fe: iload 11
// 100: sipush 26219
// 103: ldc2_w 1118216676537541999
// 106: lload 1
// 107: lxor
// 108: invokedynamic l (IJ)I bsm=su/catlean/nh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: iand
// 10e: iload 16
// 110: lload 1
// 111: lconst_0
// 112: lcmp
// 113: iflt 141
// 116: ifeq 13f
// 119: ifeq 12f
// 11c: goto 129
// 11f: ldc2_w 163761064216369966
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: aload 0
// 12a: getfield su/catlean/nh.C Ljava/lang/String;
// 12d: astore 8
// 12f: iload 11
// 131: sipush 10782
// 134: ldc2_w 7665976552971233564
// 137: lload 1
// 138: lxor
// 139: invokedynamic l (IJ)I bsm=su/catlean/nh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: iand
// 13f: iload 16
// 141: lload 1
// 142: lconst_0
// 143: lcmp
// 144: ifle 172
// 147: ifeq 170
// 14a: ifeq 160
// 14d: goto 15a
// 150: ldc2_w 163761064216369966
// 153: lload 1
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 0
// 15b: getfield su/catlean/nh.G Ljava/lang/String;
// 15e: astore 9
// 160: iload 11
// 162: sipush 15737
// 165: ldc2_w 2054732491354177145
// 168: lload 1
// 169: lxor
// 16a: invokedynamic l (IJ)I bsm=su/catlean/nh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: iand
// 170: iload 16
// 172: ifeq 196
// 175: ifeq 198
// 178: goto 185
// 17b: ldc2_w 163761064216369966
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: aload 0
// 186: getfield su/catlean/nh.j Z
// 189: goto 196
// 18c: ldc2_w 163761064216369966
// 18f: lload 1
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: istore 10
// 198: aload 0
// 199: iload 13
// 19b: aload 3
// 19c: iload 14
// 19e: i2c
// 19f: aload 4
// 1a1: iload 5
// 1a3: aload 6
// 1a5: aload 7
// 1a7: aload 8
// 1a9: aload 9
// 1ab: iload 10
// 1ad: iload 15
// 1af: i2s
// 1b0: invokevirtual su/catlean/nh.Y (ILjava/lang/String;CLsu/catlean/lj;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZS)Lsu/catlean/nh;
// 1b3: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 105450093724162L;
boolean var3 = this.j;
String var4 = this.G;
String var5 = this.C;
String var6 = this.i;
String var7 = this.Q;
boolean var8 = this.q;
lj var9 = this.f;
String var10 = this.r;
return a<"u">(9998, 6625423501420569391L ^ var1)
+ var10
+ a<"u">(25502, 5166122370420303805L ^ var1)
+ var9
+ a<"u">(559, 8259392047069464095L ^ var1)
+ var8
+ a<"u">(24150, 5891533039963888233L ^ var1)
+ var7
+ a<"u">(26435, 8148267749706851193L ^ var1)
+ var6
+ a<"u">(910, 3549589429945960368L ^ var1)
+ var5
+ a<"u">(30209, 4055438248094036541L ^ var1)
+ var4
+ a<"u">(13001, 8737426535299331824L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 17016317677604L;
int var4 = this.r.hashCode();
var4 = var4 * b<"l">(27423, 8280038177195797788L ^ var1) + this.f.hashCode();
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + Boolean.hashCode(this.q);
boolean var10000 = vm.a<"Å">(-8673258855725529412L, var1);
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + this.Q.hashCode();
boolean var3 = var10000;
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + this.i.hashCode();
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + this.C.hashCode();
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + this.G.hashCode();
var4 = var4 * b<"l">(26563, 2709662868021551562L ^ var1) + Boolean.hashCode(this.j);

try {
if (!var3) {
vm.a<"Å">(new _g[5], -8697421728519254671L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -8700760381918634453L, var1);
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
// 000: getstatic su/catlean/nh.a J
// 003: ldc2_w 105663492509624
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 6358531158472775968
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifeq 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 6403238956238848439
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 6403238956238848439
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifeq 05c
// 03c: instanceof su/catlean/nh
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 6403238956238848439
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 6403238956238848439
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/nh
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/nh.r Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/nh.r Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifeq 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 6403238956238848439
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 6403238956238848439
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/nh.f Lsu/catlean/lj;
// 092: aload 5
// 094: getfield su/catlean/nh.f Lsu/catlean/lj;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: iload 4
// 09c: ifeq 0bf
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 6403238956238848439
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 6403238956238848439
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/nh.q Z
// 0bf: iload 4
// 0c1: ifeq 0f1
// 0c4: aload 5
// 0c6: getfield su/catlean/nh.q Z
// 0c9: if_icmpeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w 6403238956238848439
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w 6403238956238848439
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/nh.Q Ljava/lang/String;
// 0e9: aload 5
// 0eb: getfield su/catlean/nh.Q Ljava/lang/String;
// 0ee: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f1: iload 4
// 0f3: ifeq 11e
// 0f6: ifne 112
// 0f9: goto 106
// 0fc: ldc2_w 6403238956238848439
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w 6403238956238848439
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 0
// 113: getfield su/catlean/nh.i Ljava/lang/String;
// 116: aload 5
// 118: getfield su/catlean/nh.i Ljava/lang/String;
// 11b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11e: iload 4
// 120: ifeq 14b
// 123: ifne 13f
// 126: goto 133
// 129: ldc2_w 6403238956238848439
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 0
// 134: ireturn
// 135: ldc2_w 6403238956238848439
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: aload 0
// 140: getfield su/catlean/nh.C Ljava/lang/String;
// 143: aload 5
// 145: getfield su/catlean/nh.C Ljava/lang/String;
// 148: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14b: iload 4
// 14d: ifeq 178
// 150: ifne 16c
// 153: goto 160
// 156: ldc2_w 6403238956238848439
// 159: lload 2
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: bipush 0
// 161: ireturn
// 162: ldc2_w 6403238956238848439
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: aload 0
// 16d: getfield su/catlean/nh.G Ljava/lang/String;
// 170: aload 5
// 172: getfield su/catlean/nh.G Ljava/lang/String;
// 175: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 178: iload 4
// 17a: ifeq 19d
// 17d: ifne 199
// 180: goto 18d
// 183: ldc2_w 6403238956238848439
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 0
// 18e: ireturn
// 18f: ldc2_w 6403238956238848439
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: getfield su/catlean/nh.j Z
// 19d: iload 4
// 19f: ifeq 1c4
// 1a2: aload 5
// 1a4: getfield su/catlean/nh.j Z
// 1a7: if_icmpeq 1c3
// 1aa: goto 1b7
// 1ad: ldc2_w 6403238956238848439
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: bipush 0
// 1b8: ireturn
// 1b9: ldc2_w 6403238956238848439
// 1bc: lload 2
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: bipush 1
// 1c4: ireturn
}

@JvmStatic
public static final void Z(nh self, CompositeEncoder output, SerialDescriptor serialDesc, long a) {
ax = a ^ ax;
output.encodeStringElement(serialDesc, 0, self.W());
output.encodeSerializableElement(serialDesc, 1, ss.B, self.X());
output.encodeBooleanElement(serialDesc, 2, self.I());
output.encodeStringElement(serialDesc, 3, self.Q);
output.encodeStringElement(serialDesc, 4, self.i);
output.encodeStringElement(serialDesc, 5, self.C);
output.encodeStringElement(serialDesc, b<"l">(14319, 5706314356476932477L ^ ax), self.G);
output.encodeBooleanElement(serialDesc, b<"l">(26493, 1379786145907909088L ^ ax), self.j);
}

public nh(
int seen0,
String id,
lj bind,
boolean enabled,
String module,
String setting,
String pressValue,
String releaseValue,
boolean hold,
SerializationConstructorMarker serializationConstructorMarker,
long a
) {
ax = a ^ ax;
if (b<"l">(24701, 7851344224848479870L ^ ax) != (b<"l">(12916, 7525988894263497855L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"l">(12916, 7525988894263497855L ^ ax), rg.W.getDescriptor());
}

super();
this.r = id;
this.f = bind;
this.q = enabled;
this.Q = module;
this.i = setting;
this.C = pressValue;
this.G = releaseValue;
this.j = hold;
}

static {
long var20 = a ^ 135068977646307L;
vm.a<"Å">(null, 6655116067500638384L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[22];
int var16 = 0;
String var15 = "U=?À\u009e \r\u0017*Ç/\u009aâ0 \b\u0018UðâjFÞ\u009d\rF`h\u0007Q\u000f\u0006zóÓ|ú÷x\u001ag\u0010\u0006HÒY\u001eöàþåª\u0094Ø\u0017îúK\u0010q¡^v\u0007\bûàY?×NwA\u0006q \u0086ËäÒìCó7\u0090\u008feâ\u0092§[\u001a¥á\u0084F\u0010Ê\u0082à\nze\u0099L(ì´\u0010Xâ\u0080¤|.9Óø\u0018\u009eT®´ô- ²\b\u008f`Âëý\n\u008aõ$\u001cuÝ\u0080Ða3æ\u0082ÕNî\"\tW0P\u0003»_Á\u0010îË\u0001ÆFa¢ä¢ÙüM©&0\u008a\u00109Ñz\u0093=3ø3\u0091Åtõ1\u009eÚÔ\u0010_\u000býôgrDs¯\u0089Wbe8Ñì\u0018Ôÿ\u009a\u0091î\"ñtÌ\u0091K¢¬GqCQ#³@\t)Ñµ ¿/Õ\u0013Û÷É\u0013q\u0005\u008a´\u009f5ÌdwJ[þ)¶\u001d´\rßÓ\u0017Å\u0010U'\u0010Á;=*5Vdw\u0000ö Ö|\u0093'É æÆ¾D\t\u0000\f\u008e\u0012¿\rê,\u009cg×\u008b´ÏË$ÿS2èi\u008bcÔ3\u0005È Uæzph0\u001bìZÀEÉ4eáÍ\u0006ZÄ=>²L°vôàv£F²\u0087\u0018/\u0096õðïü\u000f\u0089ÄfÜ4ß\bÕ v\u0096^\u001b¿Ïz)(]F\u008d=Â\u008cìG\u0015\u0000\u0086\u0085O\u0080\u0090BAb»HHjý\rÈWF¬\u0099±Æì5«¡è ]ñ÷\u0018¶î\u007fìQ\u008a×ý\u0006(Ý\u0001n\u0010»J\u0088½+¤\u007fWA&\u0010ó¯k=%¯e¤IáÈE\u0094OÒG\u0010·:\u00962z÷\u008aá?\u0082\u0096)\"0ßç";
int var17 = "U=?À\u009e \r\u0017*Ç/\u009aâ0 \b\u0018UðâjFÞ\u009d\rF`h\u0007Q\u000f\u0006zóÓ|ú÷x\u001ag\u0010\u0006HÒY\u001eöàþåª\u0094Ø\u0017îúK\u0010q¡^v\u0007\bûàY?×NwA\u0006q \u0086ËäÒìCó7\u0090\u008feâ\u0092§[\u001a¥á\u0084F\u0010Ê\u0082à\nze\u0099L(ì´\u0010Xâ\u0080¤|.9Óø\u0018\u009eT®´ô- ²\b\u008f`Âëý\n\u008aõ$\u001cuÝ\u0080Ða3æ\u0082ÕNî\"\tW0P\u0003»_Á\u0010îË\u0001ÆFa¢ä¢ÙüM©&0\u008a\u00109Ñz\u0093=3ø3\u0091Åtõ1\u009eÚÔ\u0010_\u000býôgrDs¯\u0089Wbe8Ñì\u0018Ôÿ\u009a\u0091î\"ñtÌ\u0091K¢¬GqCQ#³@\t)Ñµ ¿/Õ\u0013Û÷É\u0013q\u0005\u008a´\u009f5ÌdwJ[þ)¶\u001d´\rßÓ\u0017Å\u0010U'\u0010Á;=*5Vdw\u0000ö Ö|\u0093'É æÆ¾D\t\u0000\f\u008e\u0012¿\rê,\u009cg×\u008b´ÏË$ÿS2èi\u008bcÔ3\u0005È Uæzph0\u001bìZÀEÉ4eáÍ\u0006ZÄ=>²L°vôàv£F²\u0087\u0018/\u0096õðïü\u000f\u0089ÄfÜ4ß\bÕ v\u0096^\u001b¿Ïz)(]F\u008d=Â\u008cìG\u0015\u0000\u0086\u0085O\u0080\u0090BAb»HHjý\rÈWF¬\u0099±Æì5«¡è ]ñ÷\u0018¶î\u007fìQ\u008a×ý\u0006(Ý\u0001n\u0010»J\u0088½+¤\u007fWA&\u0010ó¯k=%¯e¤IáÈE\u0094OÒG\u0010·:\u00962z÷\u008aá?\u0082\u0096)\"0ßç"
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
c = new String[22];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "A¬ËSc¾Ï\u000bLjm\u008fåé²\u008cÄÅg´îµw\bA\u001f'~i\u008fâ\u0082.¦\u000búû¸L£¶:®c»äÇO\u0094\u0011+\u00adPç&Ø¯m<ÂjÙ\t÷\u008cÛ\u008fðêz|ÿ";
int var5 = "A¬ËSc¾Ï\u000bLjm\u008fåé²\u008cÄÅg´îµw\bA\u001f'~i\u008fâ\u0082.¦\u000búû¸L£¶:®c»äÇO\u0094\u0011+\u00adPç&Ø¯m<ÂjÙ\t÷\u008cÛ\u008fðêz|ÿ".length();
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
g = new Integer[11];
Y = new jo(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0096c};dìZÈ\"\u0011Ô \u009c{ô\u0081";
var5 = "\u0096c};dìZÈ\"\u0011Ô \u009c{ô\u0081".length();
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

var15 = "^A\u0003fJ]f©L¸\u000fDGH-{\u008c\u0092\u0092ÛFD¨È\u0010\u00ad\\\\Z\f\u0007÷oÙ]Íþ\u008c\u0090\u0015h";
var17 = "^A\u0003fJ]f©L¸\u000fDGH-{\u008c\u0092\u0092ÛFD¨È\u0010\u00ad\\\\Z\f\u0007÷oÙ]Íþ\u008c\u0090\u0015h".length();
var14 = 24;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void c(_g[] var0) {
J = var0;
}

public static _g[] k() {
return J;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20604;
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
throw new RuntimeException("su/catlean/nh", var10);
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
throw new RuntimeException("su/catlean/nh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16490;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/nh", var14);
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
throw new RuntimeException("su/catlean/nh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
