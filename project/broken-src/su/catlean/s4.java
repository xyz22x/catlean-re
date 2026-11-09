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
public final class s4 {
@NotNull
public static final aa s;
@NotNull
private String a;
private int o;
private int Q;
private int J;
@NotNull
private String q;
private int j;
private boolean m;
private static String U;
private static final long b = yz.a(5657386671542807604L, -4264056233285571399L, MethodHandles.lookup().lookupClass()).a(236359970585003L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public s4(@NotNull String id, int x, int y, int a, int a, byte a, int z, @NotNull String server, int dimension, boolean visible) {
long var11 = ((long)axxx << 32 | (long)ax << 40 >>> 32 | (long)axx << 56 >>> 56) ^ b;
Intrinsics.checkNotNullParameter(id, a<"f">(8435, 6488559782010904028L ^ var11));
Intrinsics.checkNotNullParameter(server, a<"f">(19178, 2850455465472440263L ^ var11));
super();
this.a = id;
this.o = x;
this.Q = y;
this.J = z;
this.q = server;
this.j = dimension;
this.m = visible;
}

public s4(String var1, int var2, int var3, int var4, String var5, int var6, boolean var7, long var8, int var10, DefaultConstructorMarker var11) {
var8 = b ^ var8;
long var10001 = var8 ^ 23668220001189L;
int var12 = (int)((var8 ^ 23668220001189L) >>> 32);
int var13 = (int)((var8 ^ 23668220001189L) << 32 >>> 40);
int var14 = (int)(var10001 << 56 >>> 56);
if ((var10 & b<"l">(3885, 7449673803232819039L ^ var8)) != 0) {
var5 = a<"f">(10550, 3836921083661305568L ^ var8);
}

if ((var10 & b<"l">(29100, 198577880525294034L ^ var8)) != 0) {
var6 = 0;
}

if ((var10 & b<"l">(3705, 3941078856734193154L ^ var8)) != 0) {
var7 = true;
}

this(var1, var2, var3, var12, var13, (byte)var14, var4, var5, var6, var7);
}

@NotNull
public final String e() {
return this.a;
}

public final void z(int a, @NotNull String <set-?>, int a, byte a) {
long var5 = ((long)axxx << 32 | (long)ax << 40 >>> 32 | (long)axx << 56 >>> 56) ^ b;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(1787, 2192552580277844124L ^ var5));
this.a = <set-?>;
}

public final int I() {
return this.o;
}

public final void K(int <set-?>) {
this.o = <set-?>;
}

public final int r() {
return this.Q;
}

public final void p(int <set-?>) {
this.Q = <set-?>;
}

public final int u() {
return this.J;
}

public final void B(int <set-?>) {
this.J = <set-?>;
}

@NotNull
public final String h() {
return this.q;
}

public final void A(@NotNull String <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(297, 3299704143048938798L ^ ax));
this.q = <set-?>;
}

public final int W() {
return this.j;
}

public final void a(int <set-?>) {
this.j = <set-?>;
}

public final boolean g() {
return this.m;
}

public final void K(boolean <set-?>) {
this.m = <set-?>;
}

@NotNull
public final String E() {
return this.a;
}

public final int S() {
return this.o;
}

public final int a() {
return this.Q;
}

public final int M() {
return this.J;
}

@NotNull
public final String D() {
return this.q;
}

public final int k() {
return this.j;
}

public final boolean m() {
return this.m;
}

@NotNull
public final s4 i(@NotNull String id, int x, int y, int z, @NotNull String server, int dimension, boolean visible, long a) {
ax = b ^ ax;
long var10001 = ax ^ 57054780737780L;
int var10 = (int)((ax ^ 57054780737780L) >>> 32);
int var11 = (int)((ax ^ 57054780737780L) << 32 >>> 40);
int var12 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(id, a<"f">(28304, 5298913007108108819L ^ ax));
Intrinsics.checkNotNullParameter(server, a<"f">(29683, 9088031659784318841L ^ ax));
return new s4(id, x, y, var10, var11, (byte)var12, z, server, dimension, visible);
}

public static s4 I(
s4 param0, String param1, int param2, int param3, long param4, int param6, String param7, int param8, boolean param9, int param10, Object param11
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s4.b J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 42075208842869
// 00e: lxor
// 00f: lstore 12
// 011: pop2
// 012: ldc2_w -2543550680115085117
// 015: lload 4
// 017: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01c: astore 14
// 01e: iload 10
// 020: bipush 1
// 021: iand
// 022: aload 14
// 024: ifnull 041
// 027: ifeq 03d
// 02a: goto 038
// 02d: ldc2_w -2557699062969965796
// 030: lload 4
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 0
// 039: getfield su/catlean/s4.a Ljava/lang/String;
// 03c: astore 1
// 03d: iload 10
// 03f: bipush 2
// 040: iand
// 041: aload 14
// 043: lload 4
// 045: lconst_0
// 046: lcmp
// 047: iflt 069
// 04a: ifnull 067
// 04d: ifeq 063
// 050: goto 05e
// 053: ldc2_w -2557699062969965796
// 056: lload 4
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: aload 0
// 05f: getfield su/catlean/s4.o I
// 062: istore 2
// 063: iload 10
// 065: bipush 4
// 066: iand
// 067: aload 14
// 069: lload 4
// 06b: lconst_0
// 06c: lcmp
// 06d: ifle 09c
// 070: ifnull 09a
// 073: ifeq 089
// 076: goto 084
// 079: ldc2_w -2557699062969965796
// 07c: lload 4
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: getfield su/catlean/s4.Q I
// 088: istore 3
// 089: iload 10
// 08b: sipush 30935
// 08e: ldc2_w 8254362484479714512
// 091: lload 4
// 093: lxor
// 094: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: iand
// 09a: aload 14
// 09c: lload 4
// 09e: lconst_0
// 09f: lcmp
// 0a0: ifle 0d0
// 0a3: ifnull 0ce
// 0a6: ifeq 0bd
// 0a9: goto 0b7
// 0ac: ldc2_w -2557699062969965796
// 0af: lload 4
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 0
// 0b8: getfield su/catlean/s4.J I
// 0bb: istore 6
// 0bd: iload 10
// 0bf: sipush 3885
// 0c2: ldc2_w 7449719059856626468
// 0c5: lload 4
// 0c7: lxor
// 0c8: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: iand
// 0ce: aload 14
// 0d0: lload 4
// 0d2: lconst_0
// 0d3: lcmp
// 0d4: iflt 104
// 0d7: ifnull 102
// 0da: ifeq 0f1
// 0dd: goto 0eb
// 0e0: ldc2_w -2557699062969965796
// 0e3: lload 4
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: aload 0
// 0ec: getfield su/catlean/s4.q Ljava/lang/String;
// 0ef: astore 7
// 0f1: iload 10
// 0f3: sipush 29100
// 0f6: ldc2_w 198522728330456489
// 0f9: lload 4
// 0fb: lxor
// 0fc: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: iand
// 102: aload 14
// 104: lload 4
// 106: lconst_0
// 107: lcmp
// 108: iflt 138
// 10b: ifnull 136
// 10e: ifeq 125
// 111: goto 11f
// 114: ldc2_w -2557699062969965796
// 117: lload 4
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 0
// 120: getfield su/catlean/s4.j I
// 123: istore 8
// 125: iload 10
// 127: sipush 3705
// 12a: ldc2_w 3941125280482857593
// 12d: lload 4
// 12f: lxor
// 130: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: iand
// 136: aload 14
// 138: ifnull 15e
// 13b: ifeq 160
// 13e: goto 14c
// 141: ldc2_w -2557699062969965796
// 144: lload 4
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 0
// 14d: getfield su/catlean/s4.m Z
// 150: goto 15e
// 153: ldc2_w -2557699062969965796
// 156: lload 4
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: istore 9
// 160: aload 0
// 161: aload 1
// 162: iload 2
// 163: iload 3
// 164: iload 6
// 166: aload 7
// 168: iload 8
// 16a: iload 9
// 16c: lload 12
// 16e: invokevirtual su/catlean/s4.i (Ljava/lang/String;IIILjava/lang/String;IZJ)Lsu/catlean/s4;
// 171: areturn
}

@NotNull
@Override
public String toString() {
long var1 = b ^ 58050314465373L;
boolean var3 = this.m;
int var4 = this.j;
String var5 = this.q;
int var6 = this.J;
int var7 = this.Q;
int var8 = this.o;
String var9 = this.a;
return a<"f">(21025, 6777180846467243420L ^ var1)
+ var9
+ a<"f">(20786, 8315903404336864909L ^ var1)
+ var8
+ a<"f">(19334, 59451413623620663L ^ var1)
+ var7
+ a<"f">(10588, 1467397539105908456L ^ var1)
+ var6
+ a<"f">(5468, 7236822692563262185L ^ var1)
+ var5
+ a<"f">(14442, 3273776261698074582L ^ var1)
+ var4
+ a<"f">(27845, 3603239016149083007L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = b ^ 25277827849709L;
vm.a<"Å">(-784460968967296659L, var1);
int var4 = this.a.hashCode();
var4 = var4 * b<"l">(27901, 5357903824227850583L ^ var1) + Integer.hashCode(this.o);
var4 = var4 * b<"l">(1784, 3117281635044799319L ^ var1) + Integer.hashCode(this.Q);
var4 = var4 * b<"l">(1784, 3117281635044799319L ^ var1) + Integer.hashCode(this.J);
var4 = var4 * b<"l">(1784, 3117281635044799319L ^ var1) + this.q.hashCode();
var4 = var4 * b<"l">(1784, 3117281635044799319L ^ var1) + Integer.hashCode(this.j);
var4 = var4 * b<"l">(1784, 3117281635044799319L ^ var1) + Boolean.hashCode(this.m);

try {
if (vm.a<"Å">(-728544405770212494L, var1) != null) {
vm.a<"Å">("uaCYjc", -724206526371944496L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -779320069110805838L, var1);
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
// 000: getstatic su/catlean/s4.b J
// 003: ldc2_w 45976446587536
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -5016948642444155376
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -5020823454268127793
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -5020823454268127793
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/s4
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -5020823454268127793
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -5020823454268127793
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/s4
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/s4.a Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/s4.a Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 092
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -5020823454268127793
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -5020823454268127793
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/s4.o I
// 092: aload 5
// 094: getfield su/catlean/s4.o I
// 097: aload 4
// 099: ifnull 0c1
// 09c: if_icmpeq 0b8
// 09f: goto 0ac
// 0a2: ldc2_w -5020823454268127793
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: ireturn
// 0ae: ldc2_w -5020823454268127793
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/s4.Q I
// 0bc: aload 5
// 0be: getfield su/catlean/s4.Q I
// 0c1: aload 4
// 0c3: ifnull 0fd
// 0c6: if_icmpeq 0e2
// 0c9: goto 0d6
// 0cc: ldc2_w -5020823454268127793
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: bipush 0
// 0d7: ireturn
// 0d8: ldc2_w -5020823454268127793
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 0
// 0e3: getfield su/catlean/s4.J I
// 0e6: aload 4
// 0e8: ifnull 118
// 0eb: aload 5
// 0ed: getfield su/catlean/s4.J I
// 0f0: goto 0fd
// 0f3: ldc2_w -5020823454268127793
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: if_icmpeq 10c
// 100: bipush 0
// 101: ireturn
// 102: ldc2_w -5020823454268127793
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 0
// 10d: getfield su/catlean/s4.q Ljava/lang/String;
// 110: aload 5
// 112: getfield su/catlean/s4.q Ljava/lang/String;
// 115: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 118: aload 4
// 11a: ifnull 13d
// 11d: ifne 139
// 120: goto 12d
// 123: ldc2_w -5020823454268127793
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 0
// 12e: ireturn
// 12f: ldc2_w -5020823454268127793
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 0
// 13a: getfield su/catlean/s4.j I
// 13d: aload 5
// 13f: getfield su/catlean/s4.j I
// 142: aload 4
// 144: ifnull 17e
// 147: if_icmpeq 163
// 14a: goto 157
// 14d: ldc2_w -5020823454268127793
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: bipush 0
// 158: ireturn
// 159: ldc2_w -5020823454268127793
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: aload 0
// 164: getfield su/catlean/s4.m Z
// 167: aload 4
// 169: ifnull 18e
// 16c: aload 5
// 16e: getfield su/catlean/s4.m Z
// 171: goto 17e
// 174: ldc2_w -5020823454268127793
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: if_icmpeq 18d
// 181: bipush 0
// 182: ireturn
// 183: ldc2_w -5020823454268127793
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 1
// 18e: ireturn
}

@JvmStatic
public static final void G(s4 self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s4.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: aload 3
// 007: aload 4
// 009: bipush 0
// 00a: aload 0
// 00b: getfield su/catlean/s4.a Ljava/lang/String;
// 00e: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 013: aload 3
// 014: aload 4
// 016: bipush 1
// 017: aload 0
// 018: getfield su/catlean/s4.o I
// 01b: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;II)V 4
// 020: ldc2_w -7727603009321842510
// 023: lload 1
// 024: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: aload 3
// 02a: aload 4
// 02c: bipush 2
// 02d: aload 0
// 02e: getfield su/catlean/s4.Q I
// 031: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;II)V 4
// 036: astore 5
// 038: aload 3
// 039: aload 4
// 03b: bipush 3
// 03c: aload 0
// 03d: getfield su/catlean/s4.J I
// 040: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;II)V 4
// 045: aload 3
// 046: aload 4
// 048: bipush 4
// 049: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 04e: aload 5
// 050: ifnull 085
// 053: ifeq 071
// 056: goto 063
// 059: ldc2_w -7714579985599878291
// 05c: lload 1
// 05d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: athrow
// 063: bipush 1
// 064: goto 09f
// 067: ldc2_w -7714579985599878291
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 0
// 072: getfield su/catlean/s4.q Ljava/lang/String;
// 075: sipush 10550
// 078: ldc2_w 3836848750332029674
// 07b: lload 1
// 07c: lxor
// 07d: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/s4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 085: aload 5
// 087: ifnull 09b
// 08a: ifne 09e
// 08d: goto 09a
// 090: ldc2_w -7714579985599878291
// 093: lload 1
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: bipush 1
// 09b: goto 09f
// 09e: bipush 0
// 09f: lload 1
// 0a0: lconst_0
// 0a1: lcmp
// 0a2: ifle 0cb
// 0a5: ifeq 0c2
// 0a8: aload 3
// 0a9: aload 4
// 0ab: bipush 4
// 0ac: aload 0
// 0ad: getfield su/catlean/s4.q Ljava/lang/String;
// 0b0: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 0b5: goto 0c2
// 0b8: ldc2_w -7714579985599878291
// 0bb: lload 1
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: aload 3
// 0c3: aload 4
// 0c5: bipush 5
// 0c6: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0cb: aload 5
// 0cd: lload 1
// 0ce: lconst_0
// 0cf: lcmp
// 0d0: ifle 0fa
// 0d3: ifnull 0f8
// 0d6: ifeq 0f4
// 0d9: goto 0e6
// 0dc: ldc2_w -7714579985599878291
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: bipush 1
// 0e7: goto 112
// 0ea: ldc2_w -7714579985599878291
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: aload 0
// 0f5: getfield su/catlean/s4.j I
// 0f8: aload 5
// 0fa: ifnull 10e
// 0fd: ifeq 111
// 100: goto 10d
// 103: ldc2_w -7714579985599878291
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: bipush 1
// 10e: goto 112
// 111: bipush 0
// 112: lload 1
// 113: lconst_0
// 114: lcmp
// 115: ifle 14a
// 118: ifeq 135
// 11b: aload 3
// 11c: aload 4
// 11e: bipush 5
// 11f: aload 0
// 120: getfield su/catlean/s4.j I
// 123: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;II)V 4
// 128: goto 135
// 12b: ldc2_w -7714579985599878291
// 12e: lload 1
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: aload 3
// 136: aload 4
// 138: sipush 15559
// 13b: ldc2_w 2064938721771382971
// 13e: lload 1
// 13f: lxor
// 140: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 14a: aload 5
// 14c: lload 1
// 14d: lconst_0
// 14e: lcmp
// 14f: iflt 179
// 152: ifnull 177
// 155: ifeq 173
// 158: goto 165
// 15b: ldc2_w -7714579985599878291
// 15e: lload 1
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: bipush 1
// 166: goto 19f
// 169: ldc2_w -7714579985599878291
// 16c: lload 1
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 0
// 174: getfield su/catlean/s4.m Z
// 177: aload 5
// 179: ifnull 19b
// 17c: bipush 1
// 17d: if_icmpeq 19e
// 180: goto 18d
// 183: ldc2_w -7714579985599878291
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 1
// 18e: goto 19b
// 191: ldc2_w -7714579985599878291
// 194: lload 1
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: goto 19f
// 19e: bipush 0
// 19f: ifeq 1c8
// 1a2: aload 3
// 1a3: aload 4
// 1a5: sipush 10857
// 1a8: ldc2_w 2434188316923461139
// 1ab: lload 1
// 1ac: lxor
// 1ad: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: aload 0
// 1b3: getfield su/catlean/s4.m Z
// 1b6: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V 4
// 1bb: goto 1c8
// 1be: ldc2_w -7714579985599878291
// 1c1: lload 1
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: lload 1
// 1c9: lconst_0
// 1ca: lcmp
// 1cb: iflt 1e0
// 1ce: aload 5
// 1d0: ifnonnull 1ed
// 1d3: bipush 3
// 1d4: anewarray 318
// 1d7: ldc2_w -7761227300223082889
// 1da: lload 1
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: goto 1ed
// 1e3: ldc2_w -7714579985599878291
// 1e6: lload 1
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: return
}

public s4(
int seen0, String id, int x, long a, int y, int z, String server, int dimension, boolean visible, SerializationConstructorMarker serializationConstructorMarker
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s4.b J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: ldc2_w 2425004522078895575
// 00b: lload 4
// 00d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 012: astore 12
// 014: sipush 9549
// 017: ldc2_w 884136695349134419
// 01a: lload 4
// 01c: lxor
// 01d: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 022: sipush 24783
// 025: ldc2_w 5089810187753488857
// 028: lload 4
// 02a: lxor
// 02b: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030: iload 1
// 031: iand
// 032: if_icmpeq 04d
// 035: iload 1
// 036: sipush 24783
// 039: ldc2_w 5089810187753488857
// 03c: lload 4
// 03e: lxor
// 03f: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: getstatic su/catlean/lm.v Lsu/catlean/lm;
// 047: invokevirtual su/catlean/lm.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 04a: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 04d: aload 0
// 04e: invokespecial java/lang/Object.<init> ()V
// 051: aload 0
// 052: aload 2
// 053: putfield su/catlean/s4.a Ljava/lang/String;
// 056: aload 0
// 057: iload 3
// 058: putfield su/catlean/s4.o I
// 05b: aload 0
// 05c: iload 6
// 05e: putfield su/catlean/s4.Q I
// 061: aload 0
// 062: aload 12
// 064: lload 4
// 066: lconst_0
// 067: lcmp
// 068: iflt 0ca
// 06b: ifnull 0c8
// 06e: iload 7
// 070: putfield su/catlean/s4.J I
// 073: lload 4
// 075: lconst_0
// 076: lcmp
// 077: iflt 09f
// 07a: iload 1
// 07b: sipush 6736
// 07e: ldc2_w 8746152137288579906
// 081: lload 4
// 083: lxor
// 084: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: iand
// 08a: ifne 0b9
// 08d: aload 0
// 08e: sipush 880
// 091: ldc2_w 3880036635279275468
// 094: lload 4
// 096: lxor
// 097: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/s4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: putfield su/catlean/s4.q Ljava/lang/String;
// 09f: lload 4
// 0a1: lconst_0
// 0a2: lcmp
// 0a3: ifle 0cd
// 0a6: aload 12
// 0a8: ifnonnull 0cd
// 0ab: goto 0b9
// 0ae: ldc2_w 2419871859641196040
// 0b1: lload 4
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: aload 0
// 0ba: goto 0c8
// 0bd: ldc2_w 2419871859641196040
// 0c0: lload 4
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: aload 8
// 0ca: putfield su/catlean/s4.q Ljava/lang/String;
// 0cd: lload 4
// 0cf: lconst_0
// 0d0: lcmp
// 0d1: iflt 10c
// 0d4: iload 1
// 0d5: sipush 26929
// 0d8: ldc2_w 223964617374337062
// 0db: lload 4
// 0dd: lxor
// 0de: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: iand
// 0e4: ifne 106
// 0e7: aload 0
// 0e8: bipush 0
// 0e9: putfield su/catlean/s4.j I
// 0ec: lload 4
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: ifle 11a
// 0f3: aload 12
// 0f5: ifnonnull 11a
// 0f8: goto 106
// 0fb: ldc2_w 2419871859641196040
// 0fe: lload 4
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 0
// 107: iload 9
// 109: putfield su/catlean/s4.j I
// 10c: goto 11a
// 10f: ldc2_w 2419871859641196040
// 112: lload 4
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: lload 4
// 11c: lconst_0
// 11d: lcmp
// 11e: ifle 152
// 121: iload 1
// 122: sipush 4975
// 125: ldc2_w 3022632007098659443
// 128: lload 4
// 12a: lxor
// 12b: invokedynamic l (IJ)I bsm=su/catlean/s4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: iand
// 131: ifne 14c
// 134: aload 0
// 135: bipush 1
// 136: putfield su/catlean/s4.m Z
// 139: aload 12
// 13b: ifnonnull 160
// 13e: goto 14c
// 141: ldc2_w 2419871859641196040
// 144: lload 4
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 0
// 14d: iload 10
// 14f: putfield su/catlean/s4.m Z
// 152: goto 160
// 155: ldc2_w 2419871859641196040
// 158: lload 4
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: return
}

static {
long var20 = b ^ 118253021840231L;
vm.a<"Å">("YM31G", -6090723282569660070L, var20);
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
String var15 = "\u008dSS;\u0015\u0015ÀNÏgR\u000b\u0001CLÊ \u0003øLB[Ã4*\u0082Ý§ÎmK1z'8\u0086\u001dÃ¸\u0002â\"mc+\u0018bÂÁ Æ=^\u0087yÌ\u0015âw\u008b\u009e\\{\u0001\u0010£Åd\u007f\u0082\u009aFh\u0098S*cÊ\u0003Â'ð\u0010\u0013/?\u0015o\b\u009d\u0007¨ài-\u007f\u000f6\u0019 \u008f [¬Gù [æ]9At:÷\u008edõ\u0011\u009d\u0007\u001bQüþg °¯$æç\u0010±Î-Î\u009d\u0086[Þ¦ø\u0018\u0004B\u000b\u009c©\u0010~\u008fâ\u0092oÒ^2ËãV)0úÒf\u0010Öx\u008e\u0000oî»½v(@7\u009dkÌH\u0010·\u0006¬½\u009cÓBaoimà¨Ê3¿\u0010Êöx\fô3R£t8\u009aXÿ\u0090á\u007f $(®>\u0083H¨Ñ©zá®)\u008d\u0086¦£gº/G°·n\u0004\tÿ¼Ë8çN \u0006\u009b4Æ\u00ad6RïU\u001d\u0090ÒçÞ\u0083\f²]ìRX\\ö ´\u0002§Å¸%O\u0098\u0010¨Ë°¯C\\\u008bP¹qã0£¸\u0096>";
int var17 = "\u008dSS;\u0015\u0015ÀNÏgR\u000b\u0001CLÊ \u0003øLB[Ã4*\u0082Ý§ÎmK1z'8\u0086\u001dÃ¸\u0002â\"mc+\u0018bÂÁ Æ=^\u0087yÌ\u0015âw\u008b\u009e\\{\u0001\u0010£Åd\u007f\u0082\u009aFh\u0098S*cÊ\u0003Â'ð\u0010\u0013/?\u0015o\b\u009d\u0007¨ài-\u007f\u000f6\u0019 \u008f [¬Gù [æ]9At:÷\u008edõ\u0011\u009d\u0007\u001bQüþg °¯$æç\u0010±Î-Î\u009d\u0086[Þ¦ø\u0018\u0004B\u000b\u009c©\u0010~\u008fâ\u0092oÒ^2ËãV)0úÒf\u0010Öx\u008e\u0000oî»½v(@7\u009dkÌH\u0010·\u0006¬½\u009cÓBaoimà¨Ê3¿\u0010Êöx\fô3R£t8\u009aXÿ\u0090á\u007f $(®>\u0083H¨Ñ©zá®)\u008d\u0086¦£gº/G°·n\u0004\tÿ¼Ë8çN \u0006\u009b4Æ\u00ad6RïU\u001d\u0090ÒçÞ\u0083\f²]ìRX\\ö ´\u0002§Å¸%O\u0098\u0010¨Ë°¯C\\\u008bP¹qã0£¸\u0096>"
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
c = var18;
d = new String[15];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[13];
int var3 = 0;
String var4 = "ZdÖàwÆé\u0085\u0081Á¥±2]Gî;\u0015ÙbÌøC;\u0097\u0015\u001cQé\u00134£\u0090\u008f\u0099¨hßz\u008e\bñ\u0012\u0083\u0007\u009a\u0091\u001eC1\u0082øÐnrÀ®\u0085h\u009dp\u0003k\u0081\u009f~Óûå{\u0087\u0015èü`\u0080\"Â4D+m \u009c\u0092_\u0083ü";
int var5 = "ZdÖàwÆé\u0085\u0081Á¥±2]Gî;\u0015ÙbÌøC;\u0097\u0015\u001cQé\u00134£\u0090\u008f\u0099¨hßz\u008e\bñ\u0012\u0083\u0007\u009a\u0091\u001eC1\u0082øÐnrÀ®\u0085h\u009dp\u0003k\u0081\u009f~Óûå{\u0087\u0015èü`\u0080\"Â4D+m \u009c\u0092_\u0083ü"
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
f = var6;
g = new Integer[13];
s = new aa(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Ó÷´Vð¦\u0019ÍC\u00965\u0097d*#]";
var5 = "Ó÷´Vð¦\u0019ÍC\u00965\u0097d*#]".length();
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

var15 = "¢\u0099Nf\u001d¾¨)Aè\u001f\u0092¥\u0005\u001eyêÌêêò\u00892/íi:¼HKÔ\u00ad\u0010\u000e±\u0016\u0015zC\u0093\u009ewÙÙ\u0019\u0093q\u00ad\u0091";
var17 = "¢\u0099Nf\u001d¾¨)Aè\u001f\u0092¥\u0005\u001eyêÌêêò\u00892/íi:¼HKÔ\u00ad\u0010\u000e±\u0016\u0015zC\u0093\u009ewÙÙ\u0019\u0093q\u00ad\u0091".length();
var14 = ' ';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void L(String var0) {
U = var0;
}

public static String Q() {
return U;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5813;
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
throw new RuntimeException("su/catlean/s4", var10);
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
throw new RuntimeException("su/catlean/s4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16669;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/s4", var14);
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
throw new RuntimeException("su/catlean/s4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
