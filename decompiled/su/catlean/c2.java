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
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class c2 {
@NotNull
public static final yd Y;
@NotNull
private String D;
@NotNull
private String f;
private int m;
@NotNull
private String l;
@NotNull
private String c;
private boolean z;
private int k;
private static int V;
private static final long a = yz.a(-7652981070721862985L, -7688904333320191220L, MethodHandles.lookup().lookupClass()).a(244113080261655L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

public c2(int a, @NotNull String id, @NotNull String ip, int port, byte a, @NotNull String user, @NotNull String password, boolean socks4, int ping, int a) {
long var11 = ((long)axxx << 32 | (long)ax << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
Intrinsics.checkNotNullParameter(id, a<"h">(30711, 8308745572163982379L ^ var11));
Intrinsics.checkNotNullParameter(ip, a<"h">(29749, 4378560231035475941L ^ var11));
Intrinsics.checkNotNullParameter(user, a<"h">(15051, 6442924547653622033L ^ var11));
Intrinsics.checkNotNullParameter(password, a<"h">(21615, 2910209027001497531L ^ var11));
super();
this.D = id;
this.f = ip;
this.m = port;
this.l = user;
this.c = password;
this.z = socks4;
this.k = ping;
}

public c2(int var1, String var2, String var3, int var4, int var5, String var6, String var7, boolean var8, int var9, int var10, DefaultConstructorMarker var11) {
long var12 = ((long)var1 << 32 | (long)var5 << 32 >>> 32) ^ a;
long var10001 = var12 ^ 86905502283476L;
int var14 = (int)((var12 ^ 86905502283476L) >>> 32);
int var15 = (int)((var12 ^ 86905502283476L) << 32 >>> 56);
int var16 = (int)(var10001 << 40 >>> 40);
if ((var10 & b<"i">(13001, 2415821724737158888L ^ var12)) != 0) {
var9 = -1;
}

this(var14, var2, var3, var4, (byte)var15, var6, var7, var8, var9, var16);
}

@NotNull
public final String j() {
return this.D;
}

public final void F(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(24731, 458634005630313959L ^ ax));
this.D = <set-?>;
}

@NotNull
public final String c() {
return this.f;
}

public final void N(char a, char a, int a, @NotNull String <set-?>) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(24731, 458533405261116130L ^ var5));
this.f = <set-?>;
}

public final int X() {
return this.m;
}

public final void W(int <set-?>) {
this.m = <set-?>;
}

@NotNull
public final String f() {
return this.l;
}

public final void q(short a, @NotNull String <set-?>, char a, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(24731, 458577580686304260L ^ var5));
this.l = <set-?>;
}

@NotNull
public final String G() {
return this.c;
}

public final void U(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"h">(7101, 6155156277064870497L ^ ax));
this.c = <set-?>;
}

public final boolean W() {
return this.z;
}

public final void Y(boolean <set-?>) {
this.z = <set-?>;
}

public final int o() {
return this.k;
}

public final void Z(int <set-?>) {
this.k = <set-?>;
}

/** @deprecated */
@Transient
public static void w() {
}

@NotNull
public final String Z() {
return this.D;
}

@NotNull
public final String S() {
return this.f;
}

public final int d() {
return this.m;
}

@NotNull
public final String e() {
return this.l;
}

@NotNull
public final String I() {
return this.c;
}

public final boolean h() {
return this.z;
}

public final int Y() {
return this.k;
}

@NotNull
public final c2 K(@NotNull String id, @NotNull String ip, int port, long a, @NotNull String user, @NotNull String password, boolean socks4, int ping) {
ax = a ^ ax;
long var10001 = ax ^ 124476925679584L;
int var10 = (int)((ax ^ 124476925679584L) >>> 32);
int var11 = (int)((ax ^ 124476925679584L) << 32 >>> 56);
int var12 = (int)(var10001 << 40 >>> 40);
Intrinsics.checkNotNullParameter(id, a<"h">(25788, 2508933039072717028L ^ ax));
Intrinsics.checkNotNullParameter(ip, a<"h">(13109, 2234526169983483754L ^ ax));
Intrinsics.checkNotNullParameter(user, a<"h">(25061, 6967959192820460981L ^ ax));
Intrinsics.checkNotNullParameter(password, a<"h">(22374, 3072274479228558141L ^ ax));
return new c2(var10, id, ip, port, (byte)var11, user, password, socks4, ping, var12);
}

public static c2 E(
c2 param0, String param1, String param2, long param3, int param5, String param6, String param7, boolean param8, int param9, int param10, Object param11
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/c2.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 119363984420801
// 00b: lxor
// 00c: lstore 12
// 00e: pop2
// 00f: ldc2_w 4441649575345383063
// 012: lload 3
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: istore 14
// 01a: iload 10
// 01c: bipush 1
// 01d: iand
// 01e: iload 14
// 020: ifne 03c
// 023: ifeq 038
// 026: goto 033
// 029: ldc2_w 4425818617811649721
// 02c: lload 3
// 02d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: athrow
// 033: aload 0
// 034: getfield su/catlean/c2.D Ljava/lang/String;
// 037: astore 1
// 038: iload 10
// 03a: bipush 2
// 03b: iand
// 03c: iload 14
// 03e: lload 3
// 03f: lconst_0
// 040: lcmp
// 041: ifle 062
// 044: ifne 060
// 047: ifeq 05c
// 04a: goto 057
// 04d: ldc2_w 4425818617811649721
// 050: lload 3
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: aload 0
// 058: getfield su/catlean/c2.f Ljava/lang/String;
// 05b: astore 2
// 05c: iload 10
// 05e: bipush 4
// 05f: iand
// 060: iload 14
// 062: lload 3
// 063: lconst_0
// 064: lcmp
// 065: ifle 093
// 068: ifne 091
// 06b: ifeq 081
// 06e: goto 07b
// 071: ldc2_w 4425818617811649721
// 074: lload 3
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: aload 0
// 07c: getfield su/catlean/c2.m I
// 07f: istore 5
// 081: iload 10
// 083: sipush 23926
// 086: ldc2_w 5679897590350718926
// 089: lload 3
// 08a: lxor
// 08b: invokedynamic i (IJ)I bsm=su/catlean/c2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: iand
// 091: iload 14
// 093: lload 3
// 094: lconst_0
// 095: lcmp
// 096: ifle 0c4
// 099: ifne 0c2
// 09c: ifeq 0b2
// 09f: goto 0ac
// 0a2: ldc2_w 4425818617811649721
// 0a5: lload 3
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: aload 0
// 0ad: getfield su/catlean/c2.l Ljava/lang/String;
// 0b0: astore 6
// 0b2: iload 10
// 0b4: sipush 11964
// 0b7: ldc2_w 8276096579652637698
// 0ba: lload 3
// 0bb: lxor
// 0bc: invokedynamic i (IJ)I bsm=su/catlean/c2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: iand
// 0c2: iload 14
// 0c4: lload 3
// 0c5: lconst_0
// 0c6: lcmp
// 0c7: ifle 0f5
// 0ca: ifne 0f3
// 0cd: ifeq 0e3
// 0d0: goto 0dd
// 0d3: ldc2_w 4425818617811649721
// 0d6: lload 3
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 0
// 0de: getfield su/catlean/c2.c Ljava/lang/String;
// 0e1: astore 7
// 0e3: iload 10
// 0e5: sipush 3999
// 0e8: ldc2_w 6169367280263755045
// 0eb: lload 3
// 0ec: lxor
// 0ed: invokedynamic i (IJ)I bsm=su/catlean/c2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: iand
// 0f3: iload 14
// 0f5: lload 3
// 0f6: lconst_0
// 0f7: lcmp
// 0f8: ifle 126
// 0fb: ifne 124
// 0fe: ifeq 114
// 101: goto 10e
// 104: ldc2_w 4425818617811649721
// 107: lload 3
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: aload 0
// 10f: getfield su/catlean/c2.z Z
// 112: istore 8
// 114: iload 10
// 116: sipush 26527
// 119: ldc2_w 964981901509958947
// 11c: lload 3
// 11d: lxor
// 11e: invokedynamic i (IJ)I bsm=su/catlean/c2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: iand
// 124: iload 14
// 126: ifne 14a
// 129: ifeq 14c
// 12c: goto 139
// 12f: ldc2_w 4425818617811649721
// 132: lload 3
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 0
// 13a: getfield su/catlean/c2.k I
// 13d: goto 14a
// 140: ldc2_w 4425818617811649721
// 143: lload 3
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: istore 9
// 14c: aload 0
// 14d: aload 1
// 14e: aload 2
// 14f: iload 5
// 151: lload 12
// 153: aload 6
// 155: aload 7
// 157: iload 8
// 159: iload 9
// 15b: invokevirtual su/catlean/c2.K (Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;ZI)Lsu/catlean/c2;
// 15e: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 8618316027730L;
int var3 = this.k;
boolean var4 = this.z;
String var5 = this.c;
String var6 = this.l;
int var7 = this.m;
String var8 = this.f;
String var9 = this.D;
return a<"h">(19063, 8240913525228503645L ^ var1)
+ var9
+ a<"h">(9656, 5880833679621123480L ^ var1)
+ var8
+ a<"h">(3624, 2327008147981944334L ^ var1)
+ var7
+ a<"h">(14935, 6065611032896926329L ^ var1)
+ var6
+ a<"h">(29947, 3559568776361753817L ^ var1)
+ var5
+ a<"h">(17609, 7325231889682468076L ^ var1)
+ var4
+ a<"h">(25652, 3580108562468776983L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 49610470508324L;
int var10000 = vm.a<"Å">(-141414719223552707L, var1);
int var4 = this.D.hashCode();
int var3 = var10000;
var4 = var4 * b<"i">(4888, 182362164656122377L ^ var1) + this.f.hashCode();
var4 = var4 * b<"i">(18370, 4303584575663603409L ^ var1) + Integer.hashCode(this.m);
var4 = var4 * b<"i">(18370, 4303584575663603409L ^ var1) + this.l.hashCode();
var4 = var4 * b<"i">(18370, 4303584575663603409L ^ var1) + this.c.hashCode();
var4 = var4 * b<"i">(18370, 4303584575663603409L ^ var1) + Boolean.hashCode(this.z);
var4 = var4 * b<"i">(18370, 4303584575663603409L ^ var1) + Integer.hashCode(this.k);

try {
if (vm.a<"Å">(-135965590911197043L, var1) != null) {
vm.a<"Å">(++var3, -81743177255607571L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -89550432666679533L, var1);
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
// 000: getstatic su/catlean/c2.a J
// 003: ldc2_w 10407062636302
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -4745742435415071465
// 00b: lload 2
// 00c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifne 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -4689375092577745095
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -4689375092577745095
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifne 05c
// 03c: instanceof su/catlean/c2
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -4689375092577745095
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -4689375092577745095
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/c2
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/c2.D Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/c2.D Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifne 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -4689375092577745095
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -4689375092577745095
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/c2.f Ljava/lang/String;
// 092: aload 5
// 094: getfield su/catlean/c2.f Ljava/lang/String;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: iload 4
// 09c: ifne 0bf
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -4689375092577745095
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -4689375092577745095
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/c2.m I
// 0bf: iload 4
// 0c1: ifne 0f1
// 0c4: aload 5
// 0c6: getfield su/catlean/c2.m I
// 0c9: if_icmpeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w -4689375092577745095
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w -4689375092577745095
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/c2.l Ljava/lang/String;
// 0e9: aload 5
// 0eb: getfield su/catlean/c2.l Ljava/lang/String;
// 0ee: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f1: iload 4
// 0f3: ifne 11e
// 0f6: ifne 112
// 0f9: goto 106
// 0fc: ldc2_w -4689375092577745095
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w -4689375092577745095
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 0
// 113: getfield su/catlean/c2.c Ljava/lang/String;
// 116: aload 5
// 118: getfield su/catlean/c2.c Ljava/lang/String;
// 11b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11e: iload 4
// 120: ifne 143
// 123: ifne 13f
// 126: goto 133
// 129: ldc2_w -4689375092577745095
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 0
// 134: ireturn
// 135: ldc2_w -4689375092577745095
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: aload 0
// 140: getfield su/catlean/c2.z Z
// 143: aload 5
// 145: getfield su/catlean/c2.z Z
// 148: iload 4
// 14a: ifne 184
// 14d: if_icmpeq 169
// 150: goto 15d
// 153: ldc2_w -4689375092577745095
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: bipush 0
// 15e: ireturn
// 15f: ldc2_w -4689375092577745095
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 0
// 16a: getfield su/catlean/c2.k I
// 16d: iload 4
// 16f: ifne 194
// 172: aload 5
// 174: getfield su/catlean/c2.k I
// 177: goto 184
// 17a: ldc2_w -4689375092577745095
// 17d: lload 2
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: if_icmpeq 193
// 187: bipush 0
// 188: ireturn
// 189: ldc2_w -4689375092577745095
// 18c: lload 2
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: bipush 1
// 194: ireturn
}

@JvmStatic
public static final void t(c2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeStringElement(serialDesc, 0, self.D);
output.encodeStringElement(serialDesc, 1, self.f);
output.encodeIntElement(serialDesc, 2, self.m);
output.encodeStringElement(serialDesc, 3, self.l);
output.encodeStringElement(serialDesc, 4, self.c);
output.encodeBooleanElement(serialDesc, 5, self.z);
}

public c2(
int seen0, String id, String ip, int port, String user, String password, boolean socks4, SerializationConstructorMarker serializationConstructorMarker, long a
) {
ax = a ^ ax;
if (b<"i">(12320, 8006743239394230872L ^ ax) != (b<"i">(30964, 3460765394250386054L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"i">(30964, 3460765394250386054L ^ ax), w9.f.getDescriptor());
}

super();
this.D = id;
this.f = ip;
this.m = port;
this.l = user;
this.c = password;
this.z = socks4;
this.k = -1;
}

static {
long var20 = a ^ 89335643551130L;
vm.a<"Å">(0, -8330556098190094253L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[17];
int var16 = 0;
String var15 = "J\u0018å_pÕ\u007fjÍ\u0093±«\u000eÂÎÒ¼£\u0086éÉüWry\u0018ñð°_\u000bj\u0010½Æ¯jMÖ\u0092²Æ\u0080i\u001f×ä\u00186\u0010ÿ©¤¾Ô\u008f<f\b\u001fºñ³ãø×  u8ePôb·\u00834®ÞÇ!x\u001b¹%8\u0091éû\u009e\u000bgÔ\u008d\u0088\u001b{Ðù\u0010\u0085»&F×,ÏU¾\b1\u001bM\u0002P`\u0010SP\u0000gQnÃ\u0011A%{k|:Íu\u0018ÍwÆ\u008f5(\f\u0019®.,+áEûZímÂ\u0088PËw§\u0010\u0083@qúç\u0011wö\r\u009cÓ \u0090¦ó\u0017\u0010Ì\n\u0011æ¨àÏÂDk;«\u008cÀÞ-\u0010Ë`æ§\u000bs\u0097H\u0013h<ÚòÜ*\u0011\u0010\u000b>Ú\u0007SªÒ7\u009f6®Ù\u009f^\u0007/ \u000b0.ï\u0080É\u0093Î! ìÒ²â\u009f«\u008f××U\u00971S\u0019\u0081ÞøÚâôfP \u0089ï\u008fB\tW\u0011®Xx@ à\u0002\u00ad\u009c\u0093\u001fFK P´P/ÉJ®óDöÞ\u0010!Å\u0005\u0099u\rÕáå·'LÌ\u00870\u009c\u0010ø\u0092ZÚ\u001boÑ\u0081´\u009d?dÊ}\u008b\u0095";
int var17 = "J\u0018å_pÕ\u007fjÍ\u0093±«\u000eÂÎÒ¼£\u0086éÉüWry\u0018ñð°_\u000bj\u0010½Æ¯jMÖ\u0092²Æ\u0080i\u001f×ä\u00186\u0010ÿ©¤¾Ô\u008f<f\b\u001fºñ³ãø×  u8ePôb·\u00834®ÞÇ!x\u001b¹%8\u0091éû\u009e\u000bgÔ\u008d\u0088\u001b{Ðù\u0010\u0085»&F×,ÏU¾\b1\u001bM\u0002P`\u0010SP\u0000gQnÃ\u0011A%{k|:Íu\u0018ÍwÆ\u008f5(\f\u0019®.,+áEûZímÂ\u0088PËw§\u0010\u0083@qúç\u0011wö\r\u009cÓ \u0090¦ó\u0017\u0010Ì\n\u0011æ¨àÏÂDk;«\u008cÀÞ-\u0010Ë`æ§\u000bs\u0097H\u0013h<ÚòÜ*\u0011\u0010\u000b>Ú\u0007SªÒ7\u009f6®Ù\u009f^\u0007/ \u000b0.ï\u0080É\u0093Î! ìÒ²â\u009f«\u008f××U\u00971S\u0019\u0081ÞøÚâôfP \u0089ï\u008fB\tW\u0011®Xx@ à\u0002\u00ad\u009c\u0093\u001fFK P´P/ÉJ®óDöÞ\u0010!Å\u0005\u0099u\rÕáå·'LÌ\u00870\u009c\u0010ø\u0092ZÚ\u001boÑ\u0081´\u009d?dÊ}\u008b\u0095"
.length();
char var14 = ' ';
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
d = new String[17];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "2c\u0000A¶\u0085G@·x\nàá×!\u000b÷\u001bÜ\u0099x\u0002\u0014 ±'\u00895P\u0095´d\u0000.êA\\\u0080]&QIb\u009bÊágàyò\u0080&Q^\bÜ";
int var5 = "2c\u0000A¶\u0085G@·x\nàá×!\u000b÷\u001bÜ\u0099x\u0002\u0014 ±'\u00895P\u0095´d\u0000.êA\\\u0080]&QIb\u009bÊágàyò\u0080&Q^\bÜ".length();
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
g = var6;
h = new Integer[9];
Y = new yd(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Aýê¡\u0082\u009fz«ÞB¿ç¦¹\u009eÇ";
var5 = "Aýê¡\u0082\u009fz«ÞB¿ç¦¹\u009eÇ".length();
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

var15 = "}äô/\u0006\u0098`'wlBç\u0087\u0006`f\u00103U\u0092¡Ê=\u0084 |4\u0017\r\u0007q2¨";
var17 = "}äô/\u0006\u0098`'wlBç\u0087\u0006`f\u00103U\u0092¡Ê=\u0084 |4\u0017\r\u0007q2¨".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void d(int var0) {
V = var0;
}

public static int z() {
return V;
}

public static int L() {
int var0 = z();

try {
return var0 == 0 ? 71 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10002;
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
throw new RuntimeException("su/catlean/c2", var10);
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
throw new RuntimeException("su/catlean/c2" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18010;
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
throw new RuntimeException("su/catlean/c2", var14);
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
throw new RuntimeException("su/catlean/c2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
