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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class wb {
@NotNull
private String a;
@NotNull
private final o_ V;
private float f;
private float L;
@NotNull
private Color O;
private boolean e;
private boolean g;
private boolean n;
private boolean u;
private float C;
private float U;
@NotNull
private final fd W;
@NotNull
private final fd p;
@NotNull
private final fd R;
@NotNull
private final ArrayList v;
private static final long b = yz.a(-6284521952040941729L, -6362170675702915004L, MethodHandles.lookup().lookupClass()).a(233407246976513L);
private static final String[] c;
private static final String[] d;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] j;
private static final Map k;
private static final long[] l;
private static final Long[] m;
private static final Map o;

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public wb(@NotNull String id, @NotNull o_ theme, int a, short a, float x, float y, @NotNull Color setting, int a) {
long var9 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ b;
long var11 = var9 ^ 97770241240569L;
long var10001 = var9 ^ 73411705854084L;
int var13 = (int)((var9 ^ 73411705854084L) >>> 56);
int var14 = (int)((var9 ^ 73411705854084L) << 8 >>> 32);
int var15 = (int)(var10001 << 40 >>> 40);
long var16 = var9 ^ 91753777907281L;
_g[] var10000 = vm.a<"Å">(1081765240510475375L, var9);
Intrinsics.checkNotNullParameter(id, a<"s">(5860, 8725969600582471423L ^ var9));
Intrinsics.checkNotNullParameter(theme, a<"s">(3705, 374003492838692468L ^ var9));
Intrinsics.checkNotNullParameter(setting, a<"s">(20615, 2248747172188686472L ^ var9));
super();
this.a = id;
this.V = theme;
this.f = x;
_g[] var18 = var10000;
this.L = y;
this.O = setting;
this.C = 116.0F;
this.U = 14.0F;
this.W = new fd(_s.OUT_QUINT, c<"u">(21708, 6963546736965651857L ^ var9), var11);
this.p = new fd(_s.OUT_QUINT, c<"u">(8310, 5413238593780873514L ^ var9), var11);
this.R = new fd(_s.OUT_QUINT, c<"u">(8310, 5413238593780873514L ^ var9), var11);
this.v = new ArrayList();
byte var19 = 4;
int var20 = 0;

label38:
while (var20 < var19) {
int var21 = var20;
boolean var22 = false;

try {
this.v.add(new ig(new y2(var16, this), this.f, (byte)var13, var14, var15, this.L, var21));
var20++;
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, 1089912563008722094L, var9);
}

do {
try {
var10000 = var18;
if (axx >= 0) {
if (var18 == null) {
return;
}

var10000 = var18;
}

if (var10000 != null) {
continue label38;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, 1089912563008722094L, var9);
}
} while (axxx > 0);

return;
}
}

@NotNull
public final String B() {
return this.a;
}

public final void Z(@NotNull String <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"s">(20302, 2628346521771156144L ^ ax));
this.a = <set-?>;
}

@NotNull
public final o_ S() {
return this.V;
}

public final float N() {
return this.f;
}

public final void E(float <set-?>) {
this.f = <set-?>;
}

public final float e() {
return this.L;
}

public final void V(float <set-?>) {
this.L = <set-?>;
}

@NotNull
public final Color Z() {
return this.O;
}

public final void g(@NotNull Color <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"s">(3870, 3564719319493144597L ^ ax));
this.O = <set-?>;
}

public final float L() {
return this.C;
}

public final void e(float <set-?>) {
this.C = <set-?>;
}

public final float C() {
return this.U;
}

public final void D(float <set-?>) {
this.U = <set-?>;
}

public final void J(@NotNull class_332 context, long a, int mouseX, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wb.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 107014974328352
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 94830250347726
// 012: lxor
// 013: dup2
// 014: bipush 48
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 16
// 01d: lshl
// 01e: bipush 32
// 020: lushr
// 021: l2i
// 022: istore 9
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 10
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 14453541550116
// 033: lxor
// 034: lstore 11
// 036: dup2
// 037: ldc2_w 5655601267878
// 03a: lxor
// 03b: dup2
// 03c: bipush 32
// 03e: lushr
// 03f: l2i
// 040: istore 13
// 042: dup2
// 043: bipush 32
// 045: lshl
// 046: bipush 48
// 048: lushr
// 049: l2i
// 04a: istore 14
// 04c: dup2
// 04d: bipush 48
// 04f: lshl
// 050: bipush 48
// 052: lushr
// 053: l2i
// 054: istore 15
// 056: pop2
// 057: dup2
// 058: ldc2_w 99504636241724
// 05b: lxor
// 05c: lstore 16
// 05e: dup2
// 05f: ldc2_w 99616258190379
// 062: lxor
// 063: lstore 18
// 065: dup2
// 066: ldc2_w 32572141979754
// 069: lxor
// 06a: dup2
// 06b: bipush 48
// 06d: lushr
// 06e: l2i
// 06f: istore 20
// 071: dup2
// 072: bipush 16
// 074: lshl
// 075: bipush 32
// 077: lushr
// 078: l2i
// 079: istore 21
// 07b: dup2
// 07c: bipush 48
// 07e: lshl
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 22
// 085: pop2
// 086: dup2
// 087: ldc2_w 98691514261676
// 08a: lxor
// 08b: lstore 23
// 08d: dup2
// 08e: ldc2_w 65910939094003
// 091: lxor
// 092: dup2
// 093: bipush 48
// 095: lushr
// 096: l2i
// 097: istore 25
// 099: dup2
// 09a: bipush 16
// 09c: lshl
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 26
// 0a3: dup2
// 0a4: bipush 32
// 0a6: lshl
// 0a7: bipush 32
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 27
// 0ad: pop2
// 0ae: dup2
// 0af: ldc2_w 2391420136203
// 0b2: lxor
// 0b3: dup2
// 0b4: bipush 48
// 0b6: lushr
// 0b7: l2i
// 0b8: istore 28
// 0ba: dup2
// 0bb: bipush 16
// 0bd: lshl
// 0be: bipush 16
// 0c0: lushr
// 0c1: lstore 29
// 0c3: pop2
// 0c4: dup2
// 0c5: ldc2_w 130701774684508
// 0c8: lxor
// 0c9: lstore 31
// 0cb: dup2
// 0cc: ldc2_w 72125957158876
// 0cf: lxor
// 0d0: lstore 33
// 0d2: dup2
// 0d3: ldc2_w 20167119327028
// 0d6: lxor
// 0d7: lstore 35
// 0d9: dup2
// 0da: ldc2_w 69484802534116
// 0dd: lxor
// 0de: lstore 37
// 0e0: dup2
// 0e1: ldc2_w 75706025700230
// 0e4: lxor
// 0e5: lstore 39
// 0e7: dup2
// 0e8: ldc2_w 90389039495140
// 0eb: lxor
// 0ec: lstore 41
// 0ee: pop2
// 0ef: ldc2_w 3111433378704181314
// 0f2: lload 2
// 0f3: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: aload 1
// 0f9: sipush 26176
// 0fc: ldc2_w 5034397086152628861
// 0ff: lload 2
// 100: lxor
// 101: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 109: astore 58
// 10b: aload 1
// 10c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 10f: dup
// 110: sipush 18048
// 113: ldc2_w 1750083264406207167
// 116: lload 2
// 117: lxor
// 118: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 120: astore 59
// 122: lload 33
// 124: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 127: aload 1
// 128: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 12b: aload 0
// 12c: getfield su/catlean/wb.a Ljava/lang/String;
// 12f: sipush 19598
// 132: ldc2_w 9146765009547473071
// 135: lload 2
// 136: lxor
// 137: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: swap
// 13d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 142: iload 13
// 144: swap
// 145: bipush 0
// 146: anewarray 238
// 149: iload 14
// 14b: swap
// 14c: iload 15
// 14e: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 151: aload 0
// 152: getfield su/catlean/wb.f F
// 155: fconst_1
// 156: fsub
// 157: lload 16
// 159: dup2_x1
// 15a: pop2
// 15b: aload 0
// 15c: getfield su/catlean/wb.L F
// 15f: fconst_1
// 160: fsub
// 161: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 164: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 167: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 16a: aload 0
// 16b: aload 0
// 16c: getfield su/catlean/wb.e Z
// 16f: ifeq 181
// 172: ldc 65.0
// 174: goto 183
// 177: ldc2_w 3102169109943021699
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: ldc 14.0
// 183: putfield su/catlean/wb.U F
// 186: aload 0
// 187: getfield su/catlean/wb.W Lsu/catlean/fd;
// 18a: aload 0
// 18b: getfield su/catlean/wb.e Z
// 18e: ifeq 19f
// 191: fconst_1
// 192: goto 1a0
// 195: ldc2_w 3102169109943021699
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: fconst_0
// 1a0: lload 11
// 1a2: dup2_x1
// 1a3: pop2
// 1a4: invokevirtual su/catlean/fd.B (JF)V
// 1a7: fconst_1
// 1a8: aload 0
// 1a9: getfield su/catlean/wb.W Lsu/catlean/fd;
// 1ac: invokevirtual su/catlean/fd.a ()F
// 1af: fsub
// 1b0: fstore 60
// 1b2: aload 0
// 1b3: getfield su/catlean/wb.p Lsu/catlean/fd;
// 1b6: aload 0
// 1b7: aload 58
// 1b9: ifnull 1dd
// 1bc: getfield su/catlean/wb.e Z
// 1bf: ifeq 2cf
// 1c2: goto 1cf
// 1c5: ldc2_w 3102169109943021699
// 1c8: lload 2
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: aload 0
// 1d0: goto 1dd
// 1d3: ldc2_w 3102169109943021699
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: getfield su/catlean/wb.f F
// 1e0: fstore 61
// 1e2: aload 0
// 1e3: getfield su/catlean/wb.f F
// 1e6: ldc 25.0
// 1e8: fadd
// 1e9: fstore 62
// 1eb: iload 4
// 1ed: i2f
// 1ee: fstore 63
// 1f0: fload 61
// 1f2: fload 63
// 1f4: fcmpg
// 1f5: aload 58
// 1f7: lload 2
// 1f8: lconst_0
// 1f9: lcmp
// 1fa: ifle 224
// 1fd: ifnull 222
// 200: ifgt 249
// 203: goto 210
// 206: ldc2_w 3102169109943021699
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: fload 63
// 212: fload 62
// 214: fcmpg
// 215: goto 222
// 218: ldc2_w 3102169109943021699
// 21b: lload 2
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: aload 58
// 224: ifnull 246
// 227: ifgt 245
// 22a: goto 237
// 22d: ldc2_w 3102169109943021699
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: bipush 1
// 238: goto 24a
// 23b: ldc2_w 3102169109943021699
// 23e: lload 2
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: bipush 0
// 246: goto 24a
// 249: bipush 0
// 24a: ifeq 2cf
// 24d: aload 0
// 24e: getfield su/catlean/wb.L F
// 251: ldc 24.0
// 253: fadd
// 254: fstore 61
// 256: aload 0
// 257: getfield su/catlean/wb.L F
// 25a: ldc 34.0
// 25c: fadd
// 25d: fstore 62
// 25f: iload 5
// 261: i2f
// 262: fstore 63
// 264: fload 61
// 266: fload 63
// 268: fcmpg
// 269: aload 58
// 26b: lload 2
// 26c: lconst_0
// 26d: lcmp
// 26e: iflt 298
// 271: ifnull 296
// 274: ifgt 2bd
// 277: goto 284
// 27a: ldc2_w 3102169109943021699
// 27d: lload 2
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: fload 63
// 286: fload 62
// 288: fcmpg
// 289: goto 296
// 28c: ldc2_w 3102169109943021699
// 28f: lload 2
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: aload 58
// 298: ifnull 2ba
// 29b: ifgt 2b9
// 29e: goto 2ab
// 2a1: ldc2_w 3102169109943021699
// 2a4: lload 2
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: bipush 1
// 2ac: goto 2be
// 2af: ldc2_w 3102169109943021699
// 2b2: lload 2
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: bipush 0
// 2ba: goto 2be
// 2bd: bipush 0
// 2be: ifeq 2cf
// 2c1: fconst_1
// 2c2: goto 2d0
// 2c5: ldc2_w 3102169109943021699
// 2c8: lload 2
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: fconst_0
// 2d0: lload 2
// 2d1: lconst_0
// 2d2: lcmp
// 2d3: iflt 30b
// 2d6: lload 11
// 2d8: dup2_x1
// 2d9: pop2
// 2da: invokevirtual su/catlean/fd.B (JF)V
// 2dd: aload 0
// 2de: getfield su/catlean/wb.R Lsu/catlean/fd;
// 2e1: aload 0
// 2e2: aload 58
// 2e4: ifnull 308
// 2e7: getfield su/catlean/wb.e Z
// 2ea: ifeq 3fa
// 2ed: goto 2fa
// 2f0: ldc2_w 3102169109943021699
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: aload 0
// 2fb: goto 308
// 2fe: ldc2_w 3102169109943021699
// 301: lload 2
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: getfield su/catlean/wb.f F
// 30b: fstore 61
// 30d: aload 0
// 30e: getfield su/catlean/wb.f F
// 311: ldc 25.0
// 313: fadd
// 314: fstore 62
// 316: iload 4
// 318: i2f
// 319: fstore 63
// 31b: fload 61
// 31d: fload 63
// 31f: fcmpg
// 320: aload 58
// 322: lload 2
// 323: lconst_0
// 324: lcmp
// 325: ifle 34f
// 328: ifnull 34d
// 32b: ifgt 374
// 32e: goto 33b
// 331: ldc2_w 3102169109943021699
// 334: lload 2
// 335: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33a: athrow
// 33b: fload 63
// 33d: fload 62
// 33f: fcmpg
// 340: goto 34d
// 343: ldc2_w 3102169109943021699
// 346: lload 2
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: aload 58
// 34f: ifnull 371
// 352: ifgt 370
// 355: goto 362
// 358: ldc2_w 3102169109943021699
// 35b: lload 2
// 35c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 361: athrow
// 362: bipush 1
// 363: goto 375
// 366: ldc2_w 3102169109943021699
// 369: lload 2
// 36a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: athrow
// 370: bipush 0
// 371: goto 375
// 374: bipush 0
// 375: ifeq 3fa
// 378: aload 0
// 379: getfield su/catlean/wb.L F
// 37c: ldc 38.0
// 37e: fadd
// 37f: fstore 61
// 381: aload 0
// 382: getfield su/catlean/wb.L F
// 385: ldc 47.0
// 387: fadd
// 388: fstore 62
// 38a: iload 5
// 38c: i2f
// 38d: fstore 63
// 38f: fload 61
// 391: fload 63
// 393: fcmpg
// 394: aload 58
// 396: lload 2
// 397: lconst_0
// 398: lcmp
// 399: iflt 3c3
// 39c: ifnull 3c1
// 39f: ifgt 3e8
// 3a2: goto 3af
// 3a5: ldc2_w 3102169109943021699
// 3a8: lload 2
// 3a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: athrow
// 3af: fload 63
// 3b1: fload 62
// 3b3: fcmpg
// 3b4: goto 3c1
// 3b7: ldc2_w 3102169109943021699
// 3ba: lload 2
// 3bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: athrow
// 3c1: aload 58
// 3c3: ifnull 3e5
// 3c6: ifgt 3e4
// 3c9: goto 3d6
// 3cc: ldc2_w 3102169109943021699
// 3cf: lload 2
// 3d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d5: athrow
// 3d6: bipush 1
// 3d7: goto 3e9
// 3da: ldc2_w 3102169109943021699
// 3dd: lload 2
// 3de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e3: athrow
// 3e4: bipush 0
// 3e5: goto 3e9
// 3e8: bipush 0
// 3e9: ifeq 3fa
// 3ec: fconst_1
// 3ed: goto 3fb
// 3f0: ldc2_w 3102169109943021699
// 3f3: lload 2
// 3f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: athrow
// 3fa: fconst_0
// 3fb: lload 11
// 3fd: dup2_x1
// 3fe: pop2
// 3ff: invokevirtual su/catlean/fd.B (JF)V
// 402: bipush 3
// 403: newarray 6
// 405: astore 61
// 407: aload 0
// 408: getfield su/catlean/wb.O Ljava/awt/Color;
// 40b: invokevirtual java/awt/Color.getRed ()I
// 40e: aload 0
// 40f: getfield su/catlean/wb.O Ljava/awt/Color;
// 412: invokevirtual java/awt/Color.getGreen ()I
// 415: aload 0
// 416: getfield su/catlean/wb.O Ljava/awt/Color;
// 419: invokevirtual java/awt/Color.getBlue ()I
// 41c: aload 61
// 41e: invokestatic java/awt/Color.RGBtoHSB (III[F)[F
// 421: pop
// 422: aload 1
// 423: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 426: dup
// 427: sipush 16260
// 42a: ldc2_w 3667406849360053154
// 42d: lload 2
// 42e: lxor
// 42f: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 437: aload 0
// 438: getfield su/catlean/wb.f F
// 43b: aload 0
// 43c: getfield su/catlean/wb.C F
// 43f: fadd
// 440: ldc 18.0
// 442: fsub
// 443: iload 25
// 445: i2c
// 446: swap
// 447: aload 0
// 448: getfield su/catlean/wb.L F
// 44b: sipush 9531
// 44e: ldc2_w 3228944629852225588
// 451: lload 2
// 452: lxor
// 453: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 458: i2f
// 459: aload 0
// 45a: getfield su/catlean/wb.W Lsu/catlean/fd;
// 45d: invokevirtual su/catlean/fd.a ()F
// 460: fmul
// 461: fadd
// 462: ldc 11.0
// 464: ldc 11.0
// 466: fload 60
// 468: fmul
// 469: ldc 3.0
// 46b: ldc 2.5
// 46d: fconst_1
// 46e: fconst_1
// 46f: aload 0
// 470: getfield su/catlean/wb.O Ljava/awt/Color;
// 473: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 476: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 479: fconst_0
// 47a: iload 26
// 47c: i2s
// 47d: fconst_0
// 47e: iload 27
// 480: fconst_0
// 481: sipush 11916
// 484: ldc2_w 6078677806505085828
// 487: lload 2
// 488: lxor
// 489: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48e: aconst_null
// 48f: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 492: aload 0
// 493: lload 2
// 494: lconst_0
// 495: lcmp
// 496: iflt 987
// 499: aload 58
// 49b: ifnull 987
// 49e: getfield su/catlean/wb.e Z
// 4a1: ifeq 986
// 4a4: goto 4b1
// 4a7: ldc2_w 3102169109943021699
// 4aa: lload 2
// 4ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b0: athrow
// 4b1: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 4b4: invokevirtual su/catlean/wv.r ()Lsu/catlean/bj;
// 4b7: aload 1
// 4b8: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4bb: dup
// 4bc: sipush 16260
// 4bf: ldc2_w 3667406849360053154
// 4c2: lload 2
// 4c3: lxor
// 4c4: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4cc: checkcast org/joml/Matrix3x2f
// 4cf: aload 0
// 4d0: getfield su/catlean/wb.f F
// 4d3: aload 0
// 4d4: getfield su/catlean/wb.C F
// 4d7: fadd
// 4d8: f2d
// 4d9: ldc2_w 17.0
// 4dc: dsub
// 4dd: aload 0
// 4de: getfield su/catlean/wb.L F
// 4e1: f2d
// 4e2: ldc2_w 2.0
// 4e5: dsub
// 4e6: fconst_0
// 4e7: fconst_0
// 4e8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 4eb: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4ee: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 4f1: aload 0
// 4f2: getfield su/catlean/wb.W Lsu/catlean/fd;
// 4f5: invokevirtual su/catlean/fd.a ()F
// 4f8: iload 20
// 4fa: i2c
// 4fb: swap
// 4fc: iload 21
// 4fe: swap
// 4ff: iload 22
// 501: i2s
// 502: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 505: aconst_null
// 506: fconst_0
// 507: sipush 30365
// 50a: ldc2_w 7052517588851987358
// 50d: lload 2
// 50e: lxor
// 50f: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 514: lload 37
// 516: aconst_null
// 517: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 51a: aload 0
// 51b: getfield su/catlean/wb.f F
// 51e: aload 0
// 51f: getfield su/catlean/wb.C F
// 522: fadd
// 523: ldc 48.0
// 525: aload 0
// 526: getfield su/catlean/wb.W Lsu/catlean/fd;
// 529: invokevirtual su/catlean/fd.a ()F
// 52c: fmul
// 52d: fsub
// 52e: aload 0
// 52f: getfield su/catlean/wb.L F
// 532: ldc 10.0
// 534: aload 0
// 535: getfield su/catlean/wb.W Lsu/catlean/fd;
// 538: invokevirtual su/catlean/fd.a ()F
// 53b: fmul
// 53c: fadd
// 53d: ldc 40.0
// 53f: aload 0
// 540: getfield su/catlean/wb.W Lsu/catlean/fd;
// 543: invokevirtual su/catlean/fd.a ()F
// 546: fmul
// 547: ldc 39.5
// 549: aload 0
// 54a: getfield su/catlean/wb.W Lsu/catlean/fd;
// 54d: invokevirtual su/catlean/fd.a ()F
// 550: fmul
// 551: ldc 3.0
// 553: new java/awt/Color
// 556: dup
// 557: bipush 0
// 558: invokespecial java/awt/Color.<init> (I)V
// 55b: new java/awt/Color
// 55e: dup
// 55f: bipush -1
// 560: invokespecial java/awt/Color.<init> (I)V
// 563: new java/awt/Color
// 566: dup
// 567: bipush 0
// 568: invokespecial java/awt/Color.<init> (I)V
// 56b: new java/awt/Color
// 56e: dup
// 56f: aload 61
// 571: bipush 0
// 572: faload
// 573: fconst_1
// 574: fconst_1
// 575: invokestatic java/awt/Color.HSBtoRGB (FFF)I
// 578: invokespecial java/awt/Color.<init> (I)V
// 57b: aload 59
// 57d: fconst_0
// 57e: aconst_null
// 57f: sipush 24460
// 582: ldc2_w 6929898135023893134
// 585: lload 2
// 586: lxor
// 587: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58c: aconst_null
// 58d: astore 43
// 58f: istore 44
// 591: astore 45
// 593: fstore 46
// 595: astore 47
// 597: astore 48
// 599: astore 49
// 59b: lload 31
// 59d: aload 49
// 59f: aload 48
// 5a1: aload 47
// 5a3: fload 46
// 5a5: aload 45
// 5a7: iload 44
// 5a9: aload 43
// 5ab: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 5ae: aload 0
// 5af: getfield su/catlean/wb.v Ljava/util/ArrayList;
// 5b2: checkcast java/lang/Iterable
// 5b5: astore 62
// 5b7: bipush 0
// 5b8: istore 63
// 5ba: aload 62
// 5bc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5c1: astore 64
// 5c3: aload 64
// 5c5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5ca: ifeq 627
// 5cd: aload 64
// 5cf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5d4: astore 65
// 5d6: aload 65
// 5d8: checkcast su/catlean/ig
// 5db: astore 66
// 5dd: bipush 0
// 5de: lload 2
// 5df: lconst_0
// 5e0: lcmp
// 5e1: ifle 62f
// 5e4: istore 67
// 5e6: aload 66
// 5e8: aload 0
// 5e9: getfield su/catlean/wb.f F
// 5ec: invokevirtual su/catlean/ig.Y (F)V
// 5ef: aload 66
// 5f1: aload 0
// 5f2: getfield su/catlean/wb.L F
// 5f5: invokevirtual su/catlean/ig.G (F)V
// 5f8: aload 66
// 5fa: iload 8
// 5fc: i2c
// 5fd: aload 59
// 5ff: iload 9
// 601: iload 10
// 603: i2c
// 604: aload 1
// 605: invokevirtual su/catlean/ig.f (CLorg/joml/Matrix3x2fStack;ICLnet/minecraft/class_332;)V
// 608: nop
// 609: nop
// 60a: aload 58
// 60c: ifnull 62c
// 60f: aload 58
// 611: ifnonnull 5c3
// 614: lload 2
// 615: lconst_0
// 616: lcmp
// 617: ifle 60a
// 61a: goto 627
// 61d: ldc2_w 3102169109943021699
// 620: lload 2
// 621: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 626: athrow
// 627: nop
// 628: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 62b: pop
// 62c: sipush 1097
// 62f: ldc2_w 1104187963826665568
// 632: lload 2
// 633: lxor
// 634: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 639: astore 64
// 63b: bipush 3
// 63c: anewarray 238
// 63f: astore 65
// 641: aload 65
// 643: bipush 0
// 644: aload 0
// 645: getfield su/catlean/wb.O Ljava/awt/Color;
// 648: invokevirtual java/awt/Color.getRed ()I
// 64b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 64e: aastore
// 64f: aload 65
// 651: bipush 1
// 652: aload 0
// 653: getfield su/catlean/wb.O Ljava/awt/Color;
// 656: invokevirtual java/awt/Color.getGreen ()I
// 659: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 65c: aastore
// 65d: aload 65
// 65f: bipush 2
// 660: aload 0
// 661: getfield su/catlean/wb.O Ljava/awt/Color;
// 664: invokevirtual java/awt/Color.getBlue ()I
// 667: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 66a: aastore
// 66b: aload 65
// 66d: astore 65
// 66f: aload 64
// 671: aload 65
// 673: aload 65
// 675: arraylength
// 676: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// 679: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 67c: dup
// 67d: sipush 14866
// 680: ldc2_w 3928143030590981681
// 683: lload 2
// 684: lxor
// 685: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 68d: astore 62
// 68f: bipush 3
// 690: istore 63
// 692: bipush 0
// 693: istore 64
// 695: iload 64
// 697: iload 63
// 699: if_icmpge 815
// 69c: iload 64
// 69e: istore 65
// 6a0: bipush 0
// 6a1: lload 2
// 6a2: lconst_0
// 6a3: lcmp
// 6a4: ifle 8b2
// 6a7: istore 66
// 6a9: aload 58
// 6ab: ifnull 8b0
// 6ae: aload 59
// 6b0: aload 0
// 6b1: getfield su/catlean/wb.f F
// 6b4: aload 0
// 6b5: getfield su/catlean/wb.L F
// 6b8: ldc 10.0
// 6ba: fadd
// 6bb: iload 65
// 6bd: i2f
// 6be: ldc 14.0
// 6c0: fmul
// 6c1: fadd
// 6c2: ldc 27.0
// 6c4: ldc 11.0
// 6c6: fconst_2
// 6c7: fconst_2
// 6c8: iload 65
// 6ca: tableswitch 62 1 2 32 52
// 6e0: ldc2_w 3102169109943021699
// 6e3: lload 2
// 6e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e9: athrow
// 6ea: aload 0
// 6eb: getfield su/catlean/wb.p Lsu/catlean/fd;
// 6ee: invokevirtual su/catlean/fd.a ()F
// 6f1: goto 709
// 6f4: ldc2_w 3102169109943021699
// 6f7: lload 2
// 6f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fd: athrow
// 6fe: aload 0
// 6ff: getfield su/catlean/wb.R Lsu/catlean/fd;
// 702: invokevirtual su/catlean/fd.a ()F
// 705: goto 709
// 708: fconst_0
// 709: fadd
// 70a: ldc 0.5
// 70c: iload 65
// 70e: tableswitch 52 1 2 22 42
// 724: aload 0
// 725: getfield su/catlean/wb.p Lsu/catlean/fd;
// 728: invokevirtual su/catlean/fd.a ()F
// 72b: goto 743
// 72e: ldc2_w 3102169109943021699
// 731: lload 2
// 732: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 737: athrow
// 738: aload 0
// 739: getfield su/catlean/wb.R Lsu/catlean/fd;
// 73c: invokevirtual su/catlean/fd.a ()F
// 73f: goto 743
// 742: fconst_0
// 743: fmul
// 744: fconst_1
// 745: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 748: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 74b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 74e: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 751: fconst_0
// 752: fconst_0
// 753: fconst_0
// 754: sipush 11916
// 757: ldc2_w 6078677806505085828
// 75a: lload 2
// 75b: lxor
// 75c: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 761: aconst_null
// 762: astore 43
// 764: istore 44
// 766: fstore 45
// 768: fstore 46
// 76a: fstore 47
// 76c: astore 48
// 76e: astore 49
// 770: fstore 50
// 772: fstore 51
// 774: fstore 52
// 776: fstore 53
// 778: fstore 54
// 77a: fstore 55
// 77c: fstore 56
// 77e: fstore 57
// 780: iload 25
// 782: i2c
// 783: fload 57
// 785: fload 56
// 787: fload 55
// 789: fload 54
// 78b: fload 53
// 78d: fload 52
// 78f: fload 51
// 791: fload 50
// 793: aload 49
// 795: aload 48
// 797: fload 47
// 799: iload 26
// 79b: i2s
// 79c: fload 46
// 79e: iload 27
// 7a0: fload 45
// 7a2: iload 44
// 7a4: aload 43
// 7a6: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 7a9: lload 18
// 7ab: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 7ae: aload 1
// 7af: bipush 3
// 7b0: anewarray 24
// 7b3: astore 67
// 7b5: aload 67
// 7b7: bipush 0
// 7b8: aload 62
// 7ba: aastore
// 7bb: aload 67
// 7bd: bipush 1
// 7be: sipush 12850
// 7c1: ldc2_w 8333412844890476040
// 7c4: lload 2
// 7c5: lxor
// 7c6: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cb: aastore
// 7cc: aload 67
// 7ce: bipush 2
// 7cf: sipush 31934
// 7d2: ldc2_w 1666615246500364433
// 7d5: lload 2
// 7d6: lxor
// 7d7: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7dc: aastore
// 7dd: aload 67
// 7df: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 7e2: iload 65
// 7e4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 7e9: checkcast java/lang/String
// 7ec: aload 0
// 7ed: getfield su/catlean/wb.f F
// 7f0: ldc 13.5
// 7f2: fadd
// 7f3: aload 0
// 7f4: getfield su/catlean/wb.L F
// 7f7: ldc 14.5
// 7f9: fadd
// 7fa: iload 65
// 7fc: i2f
// 7fd: ldc 14.0
// 7ff: fmul
// 800: fadd
// 801: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 804: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 807: lload 39
// 809: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 80c: nop
// 80d: iinc 64 1
// 810: aload 58
// 812: ifnonnull 695
// 815: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 818: aload 1
// 819: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 81c: dup
// 81d: sipush 16260
// 820: ldc2_w 3667406849360053154
// 823: lload 2
// 824: lxor
// 825: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 82d: aload 0
// 82e: getfield su/catlean/wb.f F
// 831: ldc 61.0
// 833: fadd
// 834: aload 0
// 835: getfield su/catlean/wb.L F
// 838: ldc 10.0
// 83a: fadd
// 83b: fconst_2
// 83c: ldc 39.0
// 83e: bipush 4
// 83f: anewarray 247
// 842: astore 63
// 844: aload 63
// 846: bipush 0
// 847: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 84a: aload 0
// 84b: getfield su/catlean/wb.O Ljava/awt/Color;
// 84e: iload 20
// 850: i2c
// 851: iload 21
// 853: fconst_0
// 854: iload 22
// 856: i2s
// 857: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 85a: aastore
// 85b: aload 63
// 85d: bipush 1
// 85e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 861: aload 0
// 862: getfield su/catlean/wb.O Ljava/awt/Color;
// 865: iload 20
// 867: i2c
// 868: iload 21
// 86a: fconst_0
// 86b: iload 22
// 86d: i2s
// 86e: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 871: aastore
// 872: aload 63
// 874: bipush 2
// 875: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 878: aload 0
// 879: getfield su/catlean/wb.O Ljava/awt/Color;
// 87c: iload 20
// 87e: i2c
// 87f: iload 21
// 881: fconst_1
// 882: iload 22
// 884: i2s
// 885: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 888: aastore
// 889: aload 63
// 88b: bipush 3
// 88c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 88f: aload 0
// 890: getfield su/catlean/wb.O Ljava/awt/Color;
// 893: iload 20
// 895: i2c
// 896: iload 21
// 898: fconst_1
// 899: iload 22
// 89b: i2s
// 89c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 89f: aastore
// 8a0: aload 63
// 8a2: lload 41
// 8a4: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 8a7: bipush 1
// 8a8: lload 2
// 8a9: lconst_0
// 8aa: lcmp
// 8ab: iflt 9a5
// 8ae: istore 63
// 8b0: iload 63
// 8b2: sipush 5659
// 8b5: ldc2_w 5372920295634826001
// 8b8: lload 2
// 8b9: lxor
// 8ba: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8bf: if_icmpge 963
// 8c2: fconst_1
// 8c3: ldc 107.0
// 8c5: iload 63
// 8c7: i2f
// 8c8: aload 0
// 8c9: getfield su/catlean/wb.W Lsu/catlean/fd;
// 8cc: invokevirtual su/catlean/fd.a ()F
// 8cf: fmul
// 8d0: aload 0
// 8d1: getfield su/catlean/wb.W Lsu/catlean/fd;
// 8d4: invokevirtual su/catlean/fd.a ()F
// 8d7: fmul
// 8d8: fdiv
// 8d9: fdiv
// 8da: fconst_0
// 8db: fconst_1
// 8dc: invokestatic java/lang/Math.clamp (FFF)F
// 8df: fstore 64
// 8e1: fload 64
// 8e3: fconst_1
// 8e4: fconst_1
// 8e5: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
// 8e8: astore 65
// 8ea: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8ed: aload 1
// 8ee: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8f1: dup
// 8f2: sipush 16260
// 8f5: ldc2_w 3667406849360053154
// 8f8: lload 2
// 8f9: lxor
// 8fa: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 902: aload 0
// 903: getfield su/catlean/wb.f F
// 906: iload 63
// 908: i2f
// 909: fadd
// 90a: aload 0
// 90b: getfield su/catlean/wb.L F
// 90e: ldc 55.0
// 910: fadd
// 911: fconst_1
// 912: fconst_2
// 913: bipush 4
// 914: anewarray 247
// 917: astore 66
// 919: aload 66
// 91b: bipush 0
// 91c: aload 65
// 91e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 921: aload 65
// 923: aastore
// 924: aload 66
// 926: bipush 1
// 927: aload 65
// 929: aastore
// 92a: aload 66
// 92c: bipush 2
// 92d: aload 65
// 92f: aastore
// 930: aload 66
// 932: bipush 3
// 933: aload 65
// 935: aastore
// 936: aload 66
// 938: lload 41
// 93a: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 93d: iinc 63 1
// 940: aload 58
// 942: lload 2
// 943: lconst_0
// 944: lcmp
// 945: iflt 94d
// 948: ifnull 97c
// 94b: aload 58
// 94d: ifnonnull 8b0
// 950: lload 2
// 951: lconst_0
// 952: lcmp
// 953: ifle 97c
// 956: goto 963
// 959: ldc2_w 3102169109943021699
// 95c: lload 2
// 95d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 962: athrow
// 963: aload 0
// 964: aload 59
// 966: iload 28
// 968: i2c
// 969: iload 4
// 96b: lload 29
// 96d: invokespecial su/catlean/wb.e (Lorg/joml/Matrix3x2fStack;CIJ)V
// 970: aload 0
// 971: aload 59
// 973: iload 4
// 975: lload 23
// 977: iload 5
// 979: invokespecial su/catlean/wb.D (Lorg/joml/Matrix3x2fStack;IJI)V
// 97c: aload 0
// 97d: aload 59
// 97f: lload 6
// 981: iload 5
// 983: invokespecial su/catlean/wb.d (Lorg/joml/Matrix3x2fStack;JI)V
// 986: aload 0
// 987: aload 0
// 988: getfield su/catlean/wb.V Lsu/catlean/o_;
// 98b: lload 35
// 98d: dup2_x1
// 98e: pop2
// 98f: invokespecial su/catlean/wb.w (JLsu/catlean/o_;)V
// 992: ldc2_w 3116923539055064528
// 995: lload 2
// 996: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 99b: lload 2
// 99c: lconst_0
// 99d: lcmp
// 99e: ifle 9a8
// 9a1: ifnull 9be
// 9a4: bipush 1
// 9a5: anewarray 263
// 9a8: ldc2_w 3126142013179447445
// 9ab: lload 2
// 9ac: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b1: goto 9be
// 9b4: ldc2_w 3102169109943021699
// 9b7: lload 2
// 9b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9bd: athrow
// 9be: return
}

private final void D(Matrix3x2fStack var1, int var2, long var3, int var5) {
var3 = b ^ var3;
long var10001 = var3 ^ 35656724584548L;
int var6 = (int)((var3 ^ 35656724584548L) >>> 48);
int var7 = (int)((var3 ^ 35656724584548L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
var10001 = var3 ^ 6597716237309L;
int var9 = (int)((var3 ^ 6597716237309L) >>> 48);
int var10 = (int)((var3 ^ 6597716237309L) << 16 >>> 32);
int var11 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(-5136052236969878571L, var3);
float var13 = this.f + this.C - 48.0F + 2.0F;
_g[] var12 = var10000;
float var14 = this.L + 10.0F + 2.0F;
float[] var15 = new float[3];

label20: {
try {
Color.RGBtoHSB(this.O.getRed(), this.O.getGreen(), this.O.getBlue(), var15);
float var22 = var13 - 4.0F + b<"d">(249, 6876061412052891237L ^ var3) * var15[1];
char var10003 = (char)var6;
float var24 = var14 - 4.0F + b<"d">(2170, 8366007212442877668L ^ var3) * (1.0F - var15[2]);
Color var10010 = this.O;
Color var10011 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, a<"s">(18507, 7133456165763786724L ^ var3));
x1.n(
var1,
var10003,
var22,
var24,
7.0F,
7.0F,
2.5F,
1.5F,
1.0F,
1.0F,
var10010,
var10011,
0.0F,
(short)var7,
0.0F,
var8,
0.0F,
b<"d">(11916, 6078688369640134675L ^ var3),
null
);
var20 = this.g;
if (var12 == null) {
break label20;
}

if (!this.g) {
return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -5144793295764036844L, var3);
}

var20 = var2;
}

float var16 = Math.clamp((var20 - var13) / 40.0F, 0.0F, 1.0F);
float var17 = Math.clamp(1.0F - (var5 - var14) / 40.0F, 0.0F, 1.0F);
this.O = jl.y.p(new Color(Color.HSBtoRGB(var15[0], var16, var17)), (char)var9, var10, this.O.getAlpha() / 255.0F, (short)var11);
}

private final void d(Matrix3x2fStack param1, long param2, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wb.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 27469793375976
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
// 029: ldc2_w 68814295922033
// 02c: lxor
// 02d: dup2
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 8
// 034: dup2
// 035: bipush 16
// 037: lshl
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 9
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 10
// 048: pop2
// 049: pop2
// 04a: ldc2_w 1600232684384089433
// 04d: lload 2
// 04e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: aload 0
// 054: getfield su/catlean/wb.L F
// 057: ldc 11.0
// 059: fadd
// 05a: fstore 12
// 05c: astore 11
// 05e: aload 1
// 05f: aload 0
// 060: getfield su/catlean/wb.f F
// 063: ldc 58.0
// 065: fadd
// 066: iload 5
// 068: i2c
// 069: swap
// 06a: fload 12
// 06c: ldc 4.0
// 06e: fsub
// 06f: sipush 24584
// 072: ldc2_w 774152197212616733
// 075: lload 2
// 076: lxor
// 077: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: i2f
// 07d: fconst_1
// 07e: aload 0
// 07f: getfield su/catlean/wb.O Ljava/awt/Color;
// 082: invokevirtual java/awt/Color.getAlpha ()I
// 085: i2f
// 086: ldc 255.0
// 088: fdiv
// 089: fsub
// 08a: fmul
// 08b: fadd
// 08c: ldc 7.0
// 08e: ldc 7.0
// 090: ldc 2.5
// 092: fconst_1
// 093: fconst_1
// 094: fconst_1
// 095: aload 0
// 096: getfield su/catlean/wb.O Ljava/awt/Color;
// 099: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 09c: aload 0
// 09d: getfield su/catlean/wb.O Ljava/awt/Color;
// 0a0: iload 8
// 0a2: i2c
// 0a3: iload 9
// 0a5: fconst_1
// 0a6: iload 10
// 0a8: i2s
// 0a9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0ac: fconst_0
// 0ad: iload 6
// 0af: i2s
// 0b0: fconst_0
// 0b1: iload 7
// 0b3: fconst_0
// 0b4: sipush 15049
// 0b7: ldc2_w 2999635468091450079
// 0ba: lload 2
// 0bb: lxor
// 0bc: invokedynamic d (IJ)I bsm=su/catlean/wb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: aconst_null
// 0c2: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0c5: aload 0
// 0c6: aload 11
// 0c8: ifnull 0ec
// 0cb: getfield su/catlean/wb.n Z
// 0ce: ifeq 113
// 0d1: goto 0de
// 0d4: ldc2_w 1591526963503025560
// 0d7: lload 2
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 0
// 0df: goto 0ec
// 0e2: ldc2_w 1591526963503025560
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ef: aload 0
// 0f0: getfield su/catlean/wb.O Ljava/awt/Color;
// 0f3: fconst_1
// 0f4: iload 4
// 0f6: i2f
// 0f7: fload 12
// 0f9: fsub
// 0fa: ldc 39.0
// 0fc: fdiv
// 0fd: fsub
// 0fe: fconst_0
// 0ff: fconst_1
// 100: invokestatic java/lang/Math.clamp (FFF)F
// 103: iload 8
// 105: i2c
// 106: swap
// 107: iload 9
// 109: swap
// 10a: iload 10
// 10c: i2s
// 10d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 110: putfield su/catlean/wb.O Ljava/awt/Color;
// 113: return
}

private final void e(Matrix3x2fStack var1, char var2, int var3, long var4) {
long var6 = ((long)var2 << 48 | var4 << 16 >>> 16) ^ b;
long var10001 = var6 ^ 135804072367043L;
int var8 = (int)((var6 ^ 135804072367043L) >>> 48);
int var9 = (int)((var6 ^ 135804072367043L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
var10001 = var6 ^ 103279024492634L;
int var11 = (int)((var6 ^ 103279024492634L) >>> 48);
int var12 = (int)((var6 ^ 103279024492634L) << 16 >>> 32);
int var13 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(-5539910925461073806L, var6);
float var15 = this.f;
float[] var16 = new float[3];
Color.RGBtoHSB(this.O.getRed(), this.O.getGreen(), this.O.getBlue(), var16);
_g[] var14 = var10000;

label20: {
try {
x1.n(
var1,
(char)var8,
var15 - 3.5F + b<"d">(900, 3620735770149977784L ^ var6) * var16[0],
this.L + 52.0F,
7.0F,
7.0F,
2.5F,
1.0F,
1.0F,
1.0F,
new Color(Color.HSBtoRGB(var16[0], 1.0F, 1.0F)),
new Color(Color.HSBtoRGB(var16[0], 1.0F, 1.0F)),
0.0F,
(short)var9,
0.0F,
var10,
0.0F,
b<"d">(11916, 6078607372512383924L ^ var6),
null
);
var19 = this.u;
if (var14 == null) {
break label20;
}

if (!this.u) {
return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -5531161207757248333L, var6);
}

var19 = var3;
}

float var17 = Math.clamp((var19 - var15) / 107.0F, 0.0F, 1.0F);
this.O = jl.y.p(new Color(Color.HSBtoRGB(var17, var16[1], var16[2])), (char)var11, var12, this.O.getAlpha() / 255.0F, (short)var13);
}

public final void r(double mouseX, double mouseY, int button, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wb.b J
// 003: lload 6
// 005: lxor
// 006: lstore 6
// 008: lload 6
// 00a: dup2
// 00b: ldc2_w 43053278798656
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 102005844081375
// 015: lxor
// 016: lstore 10
// 018: pop2
// 019: ldc2_w 7633453901439797891
// 01c: lload 6
// 01e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 023: aload 0
// 024: getfield su/catlean/wb.f F
// 027: fstore 13
// 029: astore 12
// 02b: dload 1
// 02c: aload 0
// 02d: getfield su/catlean/wb.f F
// 030: aload 0
// 031: getfield su/catlean/wb.C F
// 034: fadd
// 035: f2d
// 036: dcmpg
// 037: aload 12
// 039: ifnull 060
// 03c: ifgt 089
// 03f: goto 04d
// 042: ldc2_w 7623590948596920898
// 045: lload 6
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: fload 13
// 04f: f2d
// 050: dload 1
// 051: dcmpg
// 052: goto 060
// 055: ldc2_w 7623590948596920898
// 058: lload 6
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: aload 12
// 062: ifnull 086
// 065: ifgt 085
// 068: goto 076
// 06b: ldc2_w 7623590948596920898
// 06e: lload 6
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: bipush 1
// 077: goto 08a
// 07a: ldc2_w 7623590948596920898
// 07d: lload 6
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: bipush 0
// 086: goto 08a
// 089: bipush 0
// 08a: ifeq 13b
// 08d: aload 0
// 08e: getfield su/catlean/wb.L F
// 091: fstore 13
// 093: dload 3
// 094: aload 0
// 095: getfield su/catlean/wb.L F
// 098: ldc 8.0
// 09a: fadd
// 09b: f2d
// 09c: dcmpg
// 09d: aload 12
// 09f: lload 6
// 0a1: lconst_0
// 0a2: lcmp
// 0a3: iflt 0cf
// 0a6: ifnull 0cd
// 0a9: ifgt 0f6
// 0ac: goto 0ba
// 0af: ldc2_w 7623590948596920898
// 0b2: lload 6
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: fload 13
// 0bc: f2d
// 0bd: dload 3
// 0be: dcmpg
// 0bf: goto 0cd
// 0c2: ldc2_w 7623590948596920898
// 0c5: lload 6
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 12
// 0cf: ifnull 0f3
// 0d2: ifgt 0f2
// 0d5: goto 0e3
// 0d8: ldc2_w 7623590948596920898
// 0db: lload 6
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: bipush 1
// 0e4: goto 0f7
// 0e7: ldc2_w 7623590948596920898
// 0ea: lload 6
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: bipush 0
// 0f3: goto 0f7
// 0f6: bipush 0
// 0f7: ifeq 13b
// 0fa: aload 0
// 0fb: aload 0
// 0fc: getfield su/catlean/wb.e Z
// 0ff: aload 12
// 101: ifnull 124
// 104: goto 112
// 107: ldc2_w 7623590948596920898
// 10a: lload 6
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: ifne 127
// 115: goto 123
// 118: ldc2_w 7623590948596920898
// 11b: lload 6
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: bipush 1
// 124: goto 128
// 127: bipush 0
// 128: putfield su/catlean/wb.e Z
// 12b: aload 0
// 12c: bipush 0
// 12d: putfield su/catlean/wb.n Z
// 130: aload 0
// 131: bipush 0
// 132: putfield su/catlean/wb.u Z
// 135: aload 0
// 136: bipush 0
// 137: putfield su/catlean/wb.g Z
// 13a: return
// 13b: aload 0
// 13c: aload 12
// 13e: ifnull 162
// 141: getfield su/catlean/wb.e Z
// 144: ifne 161
// 147: goto 155
// 14a: ldc2_w 7623590948596920898
// 14d: lload 6
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: return
// 156: ldc2_w 7623590948596920898
// 159: lload 6
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: aload 0
// 162: getfield su/catlean/wb.v Ljava/util/ArrayList;
// 165: checkcast java/lang/Iterable
// 168: astore 13
// 16a: bipush 0
// 16b: istore 14
// 16d: aload 13
// 16f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 174: astore 15
// 176: aload 15
// 178: invokeinterface java/util/Iterator.hasNext ()Z 1
// 17d: ifeq 1c7
// 180: aload 15
// 182: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 187: astore 16
// 189: aload 16
// 18b: checkcast su/catlean/ig
// 18e: astore 17
// 190: bipush 0
// 191: istore 18
// 193: aload 17
// 195: dload 1
// 196: d2i
// 197: dload 3
// 198: d2i
// 199: lload 10
// 19b: dup2_x1
// 19c: pop2
// 19d: invokevirtual su/catlean/ig.m (IJI)V
// 1a0: nop
// 1a1: lload 6
// 1a3: lconst_0
// 1a4: lcmp
// 1a5: ifle 1c8
// 1a8: aload 12
// 1aa: ifnull 1c8
// 1ad: aload 12
// 1af: ifnonnull 176
// 1b2: lload 6
// 1b4: lconst_0
// 1b5: lcmp
// 1b6: iflt 1a1
// 1b9: goto 1c7
// 1bc: ldc2_w 7623590948596920898
// 1bf: lload 6
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: nop
// 1c8: aload 0
// 1c9: getfield su/catlean/wb.e Z
// 1cc: aload 12
// 1ce: lload 6
// 1d0: lconst_0
// 1d1: lcmp
// 1d2: ifle 2fc
// 1d5: ifnull 2fa
// 1d8: ifeq 2e8
// 1db: goto 1e9
// 1de: ldc2_w 7623590948596920898
// 1e1: lload 6
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: aload 0
// 1ea: getfield su/catlean/wb.f F
// 1ed: ldc 57.0
// 1ef: fadd
// 1f0: fstore 13
// 1f2: dload 1
// 1f3: aload 0
// 1f4: getfield su/catlean/wb.f F
// 1f7: ldc 68.0
// 1f9: fadd
// 1fa: f2d
// 1fb: dcmpg
// 1fc: aload 12
// 1fe: lload 6
// 200: lconst_0
// 201: lcmp
// 202: ifle 22e
// 205: ifnull 22c
// 208: ifgt 255
// 20b: goto 219
// 20e: ldc2_w 7623590948596920898
// 211: lload 6
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: fload 13
// 21b: f2d
// 21c: dload 1
// 21d: dcmpg
// 21e: goto 22c
// 221: ldc2_w 7623590948596920898
// 224: lload 6
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: aload 12
// 22e: ifnull 252
// 231: ifgt 251
// 234: goto 242
// 237: ldc2_w 7623590948596920898
// 23a: lload 6
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: bipush 1
// 243: goto 256
// 246: ldc2_w 7623590948596920898
// 249: lload 6
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: bipush 0
// 252: goto 256
// 255: bipush 0
// 256: ifeq 2e8
// 259: aload 0
// 25a: getfield su/catlean/wb.L F
// 25d: ldc 11.0
// 25f: fadd
// 260: fstore 13
// 262: dload 3
// 263: aload 0
// 264: getfield su/catlean/wb.L F
// 267: ldc 50.0
// 269: fadd
// 26a: f2d
// 26b: dcmpg
// 26c: aload 12
// 26e: lload 6
// 270: lconst_0
// 271: lcmp
// 272: ifle 29e
// 275: ifnull 29c
// 278: ifgt 2c5
// 27b: goto 289
// 27e: ldc2_w 7623590948596920898
// 281: lload 6
// 283: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: athrow
// 289: fload 13
// 28b: f2d
// 28c: dload 3
// 28d: dcmpg
// 28e: goto 29c
// 291: ldc2_w 7623590948596920898
// 294: lload 6
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: aload 12
// 29e: ifnull 2c2
// 2a1: ifgt 2c1
// 2a4: goto 2b2
// 2a7: ldc2_w 7623590948596920898
// 2aa: lload 6
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: bipush 1
// 2b3: goto 2c6
// 2b6: ldc2_w 7623590948596920898
// 2b9: lload 6
// 2bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: athrow
// 2c1: bipush 0
// 2c2: goto 2c6
// 2c5: bipush 0
// 2c6: lload 6
// 2c8: lconst_0
// 2c9: lcmp
// 2ca: ifle 2ec
// 2cd: ifeq 2e8
// 2d0: aload 0
// 2d1: bipush 1
// 2d2: putfield su/catlean/wb.n Z
// 2d5: aload 12
// 2d7: ifnonnull 78c
// 2da: goto 2e8
// 2dd: ldc2_w 7623590948596920898
// 2e0: lload 6
// 2e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e7: athrow
// 2e8: aload 0
// 2e9: getfield su/catlean/wb.e Z
// 2ec: goto 2fa
// 2ef: ldc2_w 7623590948596920898
// 2f2: lload 6
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: aload 12
// 2fc: lload 6
// 2fe: lconst_0
// 2ff: lcmp
// 300: iflt 427
// 303: ifnull 425
// 306: ifeq 413
// 309: goto 317
// 30c: ldc2_w 7623590948596920898
// 30f: lload 6
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: aload 0
// 318: getfield su/catlean/wb.f F
// 31b: fstore 13
// 31d: dload 1
// 31e: aload 0
// 31f: getfield su/catlean/wb.f F
// 322: ldc 108.0
// 324: fadd
// 325: f2d
// 326: dcmpg
// 327: aload 12
// 329: lload 6
// 32b: lconst_0
// 32c: lcmp
// 32d: iflt 359
// 330: ifnull 357
// 333: ifgt 380
// 336: goto 344
// 339: ldc2_w 7623590948596920898
// 33c: lload 6
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: fload 13
// 346: f2d
// 347: dload 1
// 348: dcmpg
// 349: goto 357
// 34c: ldc2_w 7623590948596920898
// 34f: lload 6
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: aload 12
// 359: ifnull 37d
// 35c: ifgt 37c
// 35f: goto 36d
// 362: ldc2_w 7623590948596920898
// 365: lload 6
// 367: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: athrow
// 36d: bipush 1
// 36e: goto 381
// 371: ldc2_w 7623590948596920898
// 374: lload 6
// 376: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37b: athrow
// 37c: bipush 0
// 37d: goto 381
// 380: bipush 0
// 381: ifeq 413
// 384: aload 0
// 385: getfield su/catlean/wb.L F
// 388: ldc 53.0
// 38a: fadd
// 38b: fstore 13
// 38d: dload 3
// 38e: aload 0
// 38f: getfield su/catlean/wb.L F
// 392: ldc 58.0
// 394: fadd
// 395: f2d
// 396: dcmpg
// 397: aload 12
// 399: lload 6
// 39b: lconst_0
// 39c: lcmp
// 39d: ifle 3c9
// 3a0: ifnull 3c7
// 3a3: ifgt 3f0
// 3a6: goto 3b4
// 3a9: ldc2_w 7623590948596920898
// 3ac: lload 6
// 3ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b3: athrow
// 3b4: fload 13
// 3b6: f2d
// 3b7: dload 3
// 3b8: dcmpg
// 3b9: goto 3c7
// 3bc: ldc2_w 7623590948596920898
// 3bf: lload 6
// 3c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c6: athrow
// 3c7: aload 12
// 3c9: ifnull 3ed
// 3cc: ifgt 3ec
// 3cf: goto 3dd
// 3d2: ldc2_w 7623590948596920898
// 3d5: lload 6
// 3d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dc: athrow
// 3dd: bipush 1
// 3de: goto 3f1
// 3e1: ldc2_w 7623590948596920898
// 3e4: lload 6
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: bipush 0
// 3ed: goto 3f1
// 3f0: bipush 0
// 3f1: lload 6
// 3f3: lconst_0
// 3f4: lcmp
// 3f5: iflt 417
// 3f8: ifeq 413
// 3fb: aload 0
// 3fc: bipush 1
// 3fd: putfield su/catlean/wb.u Z
// 400: aload 12
// 402: ifnonnull 78c
// 405: goto 413
// 408: ldc2_w 7623590948596920898
// 40b: lload 6
// 40d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 412: athrow
// 413: aload 0
// 414: getfield su/catlean/wb.e Z
// 417: goto 425
// 41a: ldc2_w 7623590948596920898
// 41d: lload 6
// 41f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: athrow
// 425: aload 12
// 427: lload 6
// 429: lconst_0
// 42a: lcmp
// 42b: iflt 55f
// 42e: ifnull 55d
// 431: ifeq 54b
// 434: goto 442
// 437: ldc2_w 7623590948596920898
// 43a: lload 6
// 43c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: athrow
// 442: aload 0
// 443: getfield su/catlean/wb.f F
// 446: aload 0
// 447: getfield su/catlean/wb.C F
// 44a: fadd
// 44b: ldc 48.0
// 44d: fsub
// 44e: fstore 13
// 450: dload 1
// 451: aload 0
// 452: getfield su/catlean/wb.f F
// 455: aload 0
// 456: getfield su/catlean/wb.C F
// 459: fadd
// 45a: ldc 8.0
// 45c: fsub
// 45d: f2d
// 45e: dcmpg
// 45f: aload 12
// 461: lload 6
// 463: lconst_0
// 464: lcmp
// 465: iflt 491
// 468: ifnull 48f
// 46b: ifgt 4b8
// 46e: goto 47c
// 471: ldc2_w 7623590948596920898
// 474: lload 6
// 476: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47b: athrow
// 47c: fload 13
// 47e: f2d
// 47f: dload 1
// 480: dcmpg
// 481: goto 48f
// 484: ldc2_w 7623590948596920898
// 487: lload 6
// 489: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48e: athrow
// 48f: aload 12
// 491: ifnull 4b5
// 494: ifgt 4b4
// 497: goto 4a5
// 49a: ldc2_w 7623590948596920898
// 49d: lload 6
// 49f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: athrow
// 4a5: bipush 1
// 4a6: goto 4b9
// 4a9: ldc2_w 7623590948596920898
// 4ac: lload 6
// 4ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b3: athrow
// 4b4: bipush 0
// 4b5: goto 4b9
// 4b8: bipush 0
// 4b9: ifeq 54b
// 4bc: aload 0
// 4bd: getfield su/catlean/wb.L F
// 4c0: ldc 11.0
// 4c2: fadd
// 4c3: fstore 13
// 4c5: dload 3
// 4c6: aload 0
// 4c7: getfield su/catlean/wb.L F
// 4ca: ldc 51.0
// 4cc: fadd
// 4cd: f2d
// 4ce: dcmpg
// 4cf: aload 12
// 4d1: lload 6
// 4d3: lconst_0
// 4d4: lcmp
// 4d5: iflt 501
// 4d8: ifnull 4ff
// 4db: ifgt 528
// 4de: goto 4ec
// 4e1: ldc2_w 7623590948596920898
// 4e4: lload 6
// 4e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4eb: athrow
// 4ec: fload 13
// 4ee: f2d
// 4ef: dload 3
// 4f0: dcmpg
// 4f1: goto 4ff
// 4f4: ldc2_w 7623590948596920898
// 4f7: lload 6
// 4f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fe: athrow
// 4ff: aload 12
// 501: ifnull 525
// 504: ifgt 524
// 507: goto 515
// 50a: ldc2_w 7623590948596920898
// 50d: lload 6
// 50f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 514: athrow
// 515: bipush 1
// 516: goto 529
// 519: ldc2_w 7623590948596920898
// 51c: lload 6
// 51e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 523: athrow
// 524: bipush 0
// 525: goto 529
// 528: bipush 0
// 529: lload 6
// 52b: lconst_0
// 52c: lcmp
// 52d: iflt 54f
// 530: ifeq 54b
// 533: aload 0
// 534: bipush 1
// 535: putfield su/catlean/wb.g Z
// 538: aload 12
// 53a: ifnonnull 78c
// 53d: goto 54b
// 540: ldc2_w 7623590948596920898
// 543: lload 6
// 545: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54a: athrow
// 54b: aload 0
// 54c: getfield su/catlean/wb.e Z
// 54f: goto 55d
// 552: ldc2_w 7623590948596920898
// 555: lload 6
// 557: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55c: athrow
// 55d: aload 12
// 55f: ifnull 694
// 562: ifeq 66f
// 565: goto 573
// 568: ldc2_w 7623590948596920898
// 56b: lload 6
// 56d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 572: athrow
// 573: aload 0
// 574: getfield su/catlean/wb.f F
// 577: fstore 13
// 579: dload 1
// 57a: aload 0
// 57b: getfield su/catlean/wb.f F
// 57e: ldc 25.0
// 580: fadd
// 581: f2d
// 582: dcmpg
// 583: aload 12
// 585: lload 6
// 587: lconst_0
// 588: lcmp
// 589: iflt 5b5
// 58c: ifnull 5b3
// 58f: ifgt 5dc
// 592: goto 5a0
// 595: ldc2_w 7623590948596920898
// 598: lload 6
// 59a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59f: athrow
// 5a0: fload 13
// 5a2: f2d
// 5a3: dload 1
// 5a4: dcmpg
// 5a5: goto 5b3
// 5a8: ldc2_w 7623590948596920898
// 5ab: lload 6
// 5ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b2: athrow
// 5b3: aload 12
// 5b5: ifnull 5d9
// 5b8: ifgt 5d8
// 5bb: goto 5c9
// 5be: ldc2_w 7623590948596920898
// 5c1: lload 6
// 5c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c8: athrow
// 5c9: bipush 1
// 5ca: goto 5dd
// 5cd: ldc2_w 7623590948596920898
// 5d0: lload 6
// 5d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d7: athrow
// 5d8: bipush 0
// 5d9: goto 5dd
// 5dc: bipush 0
// 5dd: ifeq 66f
// 5e0: aload 0
// 5e1: getfield su/catlean/wb.L F
// 5e4: ldc 24.0
// 5e6: fadd
// 5e7: fstore 13
// 5e9: dload 3
// 5ea: aload 0
// 5eb: getfield su/catlean/wb.L F
// 5ee: ldc 34.0
// 5f0: fadd
// 5f1: f2d
// 5f2: dcmpg
// 5f3: aload 12
// 5f5: lload 6
// 5f7: lconst_0
// 5f8: lcmp
// 5f9: iflt 625
// 5fc: ifnull 623
// 5ff: ifgt 64c
// 602: goto 610
// 605: ldc2_w 7623590948596920898
// 608: lload 6
// 60a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60f: athrow
// 610: fload 13
// 612: f2d
// 613: dload 3
// 614: dcmpg
// 615: goto 623
// 618: ldc2_w 7623590948596920898
// 61b: lload 6
// 61d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 622: athrow
// 623: aload 12
// 625: ifnull 649
// 628: ifgt 648
// 62b: goto 639
// 62e: ldc2_w 7623590948596920898
// 631: lload 6
// 633: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 638: athrow
// 639: bipush 1
// 63a: goto 64d
// 63d: ldc2_w 7623590948596920898
// 640: lload 6
// 642: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 647: athrow
// 648: bipush 0
// 649: goto 64d
// 64c: bipush 0
// 64d: ifeq 66f
// 650: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 653: aload 0
// 654: getfield su/catlean/wb.O Ljava/awt/Color;
// 657: lload 8
// 659: invokevirtual su/catlean/jh.I (Ljava/awt/Color;J)V
// 65c: aload 12
// 65e: ifnonnull 78c
// 661: goto 66f
// 664: ldc2_w 7623590948596920898
// 667: lload 6
// 669: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66e: athrow
// 66f: aload 0
// 670: aload 12
// 672: ifnull 698
// 675: goto 683
// 678: ldc2_w 7623590948596920898
// 67b: lload 6
// 67d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 682: athrow
// 683: getfield su/catlean/wb.e Z
// 686: goto 694
// 689: ldc2_w 7623590948596920898
// 68c: lload 6
// 68e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 693: athrow
// 694: ifeq 78c
// 697: aload 0
// 698: getfield su/catlean/wb.f F
// 69b: fstore 13
// 69d: dload 1
// 69e: aload 0
// 69f: getfield su/catlean/wb.f F
// 6a2: ldc 25.0
// 6a4: fadd
// 6a5: f2d
// 6a6: dcmpg
// 6a7: aload 12
// 6a9: lload 6
// 6ab: lconst_0
// 6ac: lcmp
// 6ad: iflt 6d9
// 6b0: ifnull 6d7
// 6b3: ifgt 700
// 6b6: goto 6c4
// 6b9: ldc2_w 7623590948596920898
// 6bc: lload 6
// 6be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c3: athrow
// 6c4: fload 13
// 6c6: f2d
// 6c7: dload 1
// 6c8: dcmpg
// 6c9: goto 6d7
// 6cc: ldc2_w 7623590948596920898
// 6cf: lload 6
// 6d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d6: athrow
// 6d7: aload 12
// 6d9: ifnull 6fd
// 6dc: ifgt 6fc
// 6df: goto 6ed
// 6e2: ldc2_w 7623590948596920898
// 6e5: lload 6
// 6e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ec: athrow
// 6ed: bipush 1
// 6ee: goto 701
// 6f1: ldc2_w 7623590948596920898
// 6f4: lload 6
// 6f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fb: athrow
// 6fc: bipush 0
// 6fd: goto 701
// 700: bipush 0
// 701: ifeq 78c
// 704: aload 0
// 705: getfield su/catlean/wb.L F
// 708: ldc 38.0
// 70a: fadd
// 70b: fstore 13
// 70d: dload 3
// 70e: aload 0
// 70f: getfield su/catlean/wb.L F
// 712: ldc 47.0
// 714: fadd
// 715: f2d
// 716: dcmpg
// 717: aload 12
// 719: lload 6
// 71b: lconst_0
// 71c: lcmp
// 71d: iflt 749
// 720: ifnull 747
// 723: ifgt 770
// 726: goto 734
// 729: ldc2_w 7623590948596920898
// 72c: lload 6
// 72e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 733: athrow
// 734: fload 13
// 736: f2d
// 737: dload 3
// 738: dcmpg
// 739: goto 747
// 73c: ldc2_w 7623590948596920898
// 73f: lload 6
// 741: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 746: athrow
// 747: aload 12
// 749: ifnull 76d
// 74c: ifgt 76c
// 74f: goto 75d
// 752: ldc2_w 7623590948596920898
// 755: lload 6
// 757: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75c: athrow
// 75d: bipush 1
// 75e: goto 771
// 761: ldc2_w 7623590948596920898
// 764: lload 6
// 766: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76b: athrow
// 76c: bipush 0
// 76d: goto 771
// 770: bipush 0
// 771: ifeq 78c
// 774: aload 0
// 775: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 778: invokevirtual su/catlean/jh.l ()Ljava/awt/Color;
// 77b: putfield su/catlean/wb.O Ljava/awt/Color;
// 77e: goto 78c
// 781: ldc2_w 7623590948596920898
// 784: lload 6
// 786: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78b: athrow
// 78c: return
}

public final void T() {
this.g = false;
this.u = false;
this.n = false;
}

public final void X(int key, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wb.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 33882770163855
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -2773002866317903128
// 12: lload 2
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 6
// 1a: aload 0
// 1b: aload 6
// 1d: ifnull 41
// 20: getfield su/catlean/wb.e Z
// 23: ifeq 9f
// 26: goto 33
// 29: ldc2_w -2763161886549081559
// 2c: lload 2
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: aload 0
// 34: goto 41
// 37: ldc2_w -2763161886549081559
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: getfield su/catlean/wb.v Ljava/util/ArrayList;
// 44: checkcast java/lang/Iterable
// 47: astore 7
// 49: bipush 0
// 4a: istore 8
// 4c: aload 7
// 4e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 53: astore 9
// 55: aload 9
// 57: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5c: ifeq 9e
// 5f: aload 9
// 61: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 66: astore 10
// 68: aload 10
// 6a: checkcast su/catlean/ig
// 6d: astore 11
// 6f: bipush 0
// 70: istore 12
// 72: aload 11
// 74: lload 4
// 76: iload 1
// 77: invokevirtual su/catlean/ig.W (JI)V
// 7a: nop
// 7b: aload 6
// 7d: lload 2
// 7e: lconst_0
// 7f: lcmp
// 80: iflt 88
// 83: ifnull 9f
// 86: aload 6
// 88: ifnonnull 55
// 8b: lload 2
// 8c: lconst_0
// 8d: lcmp
// 8e: iflt 7b
// 91: goto 9e
// 94: ldc2_w -2763161886549081559
// 97: lload 2
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: nop
// 9f: return
}

public final void P(long a, char char) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wb.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 39642354645067
// 0b: lxor
// 0c: dup2
// 0d: bipush 32
// 0f: lushr
// 10: l2i
// 11: istore 4
// 13: dup2
// 14: bipush 32
// 16: lshl
// 17: bipush 48
// 19: lushr
// 1a: l2i
// 1b: istore 5
// 1d: dup2
// 1e: bipush 48
// 20: lshl
// 21: bipush 48
// 23: lushr
// 24: l2i
// 25: istore 6
// 27: pop2
// 28: pop2
// 29: ldc2_w -1813432128296843847
// 2c: lload 1
// 2d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: astore 7
// 34: aload 0
// 35: aload 7
// 37: ifnull 5b
// 3a: getfield su/catlean/wb.e Z
// 3d: ifeq be
// 40: goto 4d
// 43: ldc2_w -1804127723351360136
// 46: lload 1
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: aload 0
// 4e: goto 5b
// 51: ldc2_w -1804127723351360136
// 54: lload 1
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: getfield su/catlean/wb.v Ljava/util/ArrayList;
// 5e: checkcast java/lang/Iterable
// 61: astore 8
// 63: bipush 0
// 64: istore 9
// 66: aload 8
// 68: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 6d: astore 10
// 6f: aload 10
// 71: invokeinterface java/util/Iterator.hasNext ()Z 1
// 76: ifeq bd
// 79: aload 10
// 7b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 80: astore 11
// 82: aload 11
// 84: checkcast su/catlean/ig
// 87: astore 12
// 89: bipush 0
// 8a: istore 13
// 8c: aload 12
// 8e: iload 3
// 8f: iload 4
// 91: iload 5
// 93: i2c
// 94: iload 6
// 96: invokevirtual su/catlean/ig.x (CICI)V
// 99: nop
// 9a: aload 7
// 9c: lload 1
// 9d: lconst_0
// 9e: lcmp
// 9f: ifle a7
// a2: ifnull be
// a5: aload 7
// a7: ifnonnull 6f
// aa: lload 1
// ab: lconst_0
// ac: lcmp
// ad: ifle 9a
// b0: goto bd
// b3: ldc2_w -1804127723351360136
// b6: lload 1
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: nop
// be: return
}

public final void p(double mouseX, double mouseY, long a, double verticalAmount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/wb.b J
// 03: lload 5
// 05: lxor
// 06: lstore 5
// 08: lload 5
// 0a: dup2
// 0b: ldc2_w 87616068024527
// 0e: lxor
// 0f: lstore 9
// 11: pop2
// 12: ldc2_w -2248095543537237087
// 15: lload 5
// 17: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c: astore 11
// 1e: aload 0
// 1f: aload 11
// 21: ifnull 47
// 24: getfield su/catlean/wb.e Z
// 27: ifeq ab
// 2a: goto 38
// 2d: ldc2_w -2238782209338098848
// 30: lload 5
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: goto 47
// 3c: ldc2_w -2238782209338098848
// 3f: lload 5
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: getfield su/catlean/wb.v Ljava/util/ArrayList;
// 4a: checkcast java/lang/Iterable
// 4d: astore 12
// 4f: bipush 0
// 50: istore 13
// 52: aload 12
// 54: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 59: astore 14
// 5b: aload 14
// 5d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 62: ifeq aa
// 65: aload 14
// 67: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6c: astore 15
// 6e: aload 15
// 70: checkcast su/catlean/ig
// 73: astore 16
// 75: bipush 0
// 76: istore 17
// 78: aload 16
// 7a: dload 1
// 7b: lload 9
// 7d: dload 3
// 7e: dload 7
// 80: invokevirtual su/catlean/ig.L (DJDD)V
// 83: nop
// 84: aload 11
// 86: lload 5
// 88: lconst_0
// 89: lcmp
// 8a: ifle 92
// 8d: ifnull ab
// 90: aload 11
// 92: ifnonnull 5b
// 95: lload 5
// 97: lconst_0
// 98: lcmp
// 99: iflt 84
// 9c: goto aa
// 9f: ldc2_w -2238782209338098848
// a2: lload 5
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: nop
// ab: return
}

private final void w(long param1, o_ param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wb.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 75246774899245
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 40
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 56
// 020: lshl
// 021: bipush 56
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: dup2
// 029: ldc2_w 135938505820996
// 02c: lxor
// 02d: lstore 7
// 02f: dup2
// 030: ldc2_w 41588987489752
// 033: lxor
// 034: lstore 9
// 036: dup2
// 037: ldc2_w 86807170254302
// 03a: lxor
// 03b: lstore 11
// 03d: dup2
// 03e: ldc2_w 113610245664899
// 041: lxor
// 042: lstore 13
// 044: dup2
// 045: ldc2_w 53891061448903
// 048: lxor
// 049: lstore 15
// 04b: dup2
// 04c: ldc2_w 138823721654596
// 04f: lxor
// 050: lstore 17
// 052: dup2
// 053: ldc2_w 110787308904919
// 056: lxor
// 057: dup2
// 058: bipush 32
// 05a: lushr
// 05b: l2i
// 05c: istore 19
// 05e: dup2
// 05f: bipush 32
// 061: lshl
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 20
// 068: dup2
// 069: bipush 48
// 06b: lshl
// 06c: bipush 48
// 06e: lushr
// 06f: l2i
// 070: istore 21
// 072: pop2
// 073: dup2
// 074: ldc2_w 26375228977070
// 077: lxor
// 078: lstore 22
// 07a: dup2
// 07b: ldc2_w 24081912323594
// 07e: lxor
// 07f: lstore 24
// 081: dup2
// 082: ldc2_w 63015874329871
// 085: lxor
// 086: lstore 26
// 088: dup2
// 089: ldc2_w 72841277954870
// 08c: lxor
// 08d: lstore 28
// 08f: pop2
// 090: ldc2_w 1666710258389808205
// 093: lload 1
// 094: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: aload 0
// 09a: getfield su/catlean/wb.a Ljava/lang/String;
// 09d: astore 31
// 09f: astore 30
// 0a1: aload 31
// 0a3: invokevirtual java/lang/String.hashCode ()I
// 0a6: aload 30
// 0a8: ifnull 13d
// 0ab: lookupswitch 936 12 -2119261262 512 -1852378237 232 -1106245566 192 -1068784020 352 -969751984 152 -817598092 115 -525855409 272 -314765822 552 3027047 432 3556653 472 852059617 392 1267332622 312
// 114: ldc2_w 1657973738034023564
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 31
// 120: sipush 12426
// 123: ldc2_w 5322341264555077817
// 126: lload 1
// 127: lxor
// 128: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 130: goto 13d
// 133: ldc2_w 1657973738034023564
// 136: lload 1
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: ifne 30c
// 140: goto 453
// 143: lload 1
// 144: lconst_0
// 145: lcmp
// 146: iflt 352
// 149: aload 31
// 14b: sipush 8951
// 14e: ldc2_w 6706114865231520470
// 151: lload 1
// 152: lxor
// 153: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 15b: ifne 346
// 15e: goto 453
// 161: ldc2_w 1657973738034023564
// 164: lload 1
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: lload 1
// 16c: lconst_0
// 16d: lcmp
// 16e: ifle 36e
// 171: aload 31
// 173: sipush 11716
// 176: ldc2_w 3301226287020010988
// 179: lload 1
// 17a: lxor
// 17b: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 183: ifne 364
// 186: goto 453
// 189: ldc2_w 1657973738034023564
// 18c: lload 1
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: lload 1
// 194: lconst_0
// 195: lcmp
// 196: iflt 446
// 199: aload 31
// 19b: sipush 3783
// 19e: ldc2_w 5426679312364949229
// 1a1: lload 1
// 1a2: lxor
// 1a3: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 1ab: ifne 43a
// 1ae: goto 453
// 1b1: ldc2_w 1657973738034023564
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: lload 1
// 1bc: lconst_0
// 1bd: lcmp
// 1be: ifle 3aa
// 1c1: aload 31
// 1c3: sipush 19524
// 1c6: ldc2_w 5134877352953220210
// 1c9: lload 1
// 1ca: lxor
// 1cb: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 1d3: ifne 39e
// 1d6: goto 453
// 1d9: ldc2_w 1657973738034023564
// 1dc: lload 1
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: lload 1
// 1e4: lconst_0
// 1e5: lcmp
// 1e6: iflt 3ea
// 1e9: aload 31
// 1eb: sipush 15518
// 1ee: ldc2_w 8163118296112430261
// 1f1: lload 1
// 1f2: lxor
// 1f3: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 1fb: ifne 3e0
// 1fe: goto 453
// 201: ldc2_w 1657973738034023564
// 204: lload 1
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: lload 1
// 20c: lconst_0
// 20d: lcmp
// 20e: ifle 40c
// 211: aload 31
// 213: sipush 24244
// 216: ldc2_w 7941696108194438784
// 219: lload 1
// 21a: lxor
// 21b: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 223: ifne 3fc
// 226: goto 453
// 229: ldc2_w 1657973738034023564
// 22c: lload 1
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: lload 1
// 234: lconst_0
// 235: lcmp
// 236: iflt 428
// 239: aload 31
// 23b: sipush 23617
// 23e: ldc2_w 302499844860320866
// 241: lload 1
// 242: lxor
// 243: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 24b: ifne 41e
// 24e: goto 453
// 251: ldc2_w 1657973738034023564
// 254: lload 1
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: lload 1
// 25c: lconst_0
// 25d: lcmp
// 25e: iflt 334
// 261: aload 31
// 263: sipush 27766
// 266: ldc2_w 6528731771087694929
// 269: lload 1
// 26a: lxor
// 26b: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 270: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 273: ifne 328
// 276: goto 453
// 279: ldc2_w 1657973738034023564
// 27c: lload 1
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: lload 1
// 284: lconst_0
// 285: lcmp
// 286: iflt 38c
// 289: aload 31
// 28b: sipush 9525
// 28e: ldc2_w 1983766221028484368
// 291: lload 1
// 292: lxor
// 293: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 298: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 29b: ifne 380
// 29e: goto 453
// 2a1: ldc2_w 1657973738034023564
// 2a4: lload 1
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: lload 1
// 2ac: lconst_0
// 2ad: lcmp
// 2ae: iflt 3ce
// 2b1: aload 31
// 2b3: sipush 27390
// 2b6: ldc2_w 8065534534752840410
// 2b9: lload 1
// 2ba: lxor
// 2bb: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 2c3: ifne 3bc
// 2c6: goto 453
// 2c9: ldc2_w 1657973738034023564
// 2cc: lload 1
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: lload 1
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: iflt 2fa
// 2d9: aload 31
// 2db: sipush 15703
// 2de: ldc2_w 240500624466148710
// 2e1: lload 1
// 2e2: lxor
// 2e3: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/wb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
// 2eb: ifeq 453
// 2ee: aload 3
// 2ef: aload 0
// 2f0: getfield su/catlean/wb.O Ljava/awt/Color;
// 2f3: lload 26
// 2f5: dup2_x1
// 2f6: pop2
// 2f7: invokevirtual su/catlean/o_.t (JLjava/awt/Color;)V
// 2fa: aload 30
// 2fc: ifnonnull 453
// 2ff: goto 30c
// 302: ldc2_w 1657973738034023564
// 305: lload 1
// 306: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30b: athrow
// 30c: aload 3
// 30d: aload 0
// 30e: getfield su/catlean/wb.O Ljava/awt/Color;
// 311: lload 11
// 313: invokevirtual su/catlean/o_.V (Ljava/awt/Color;J)V
// 316: aload 30
// 318: ifnonnull 453
// 31b: goto 328
// 31e: ldc2_w 1657973738034023564
// 321: lload 1
// 322: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: athrow
// 328: aload 3
// 329: aload 0
// 32a: getfield su/catlean/wb.O Ljava/awt/Color;
// 32d: lload 13
// 32f: dup2_x1
// 330: pop2
// 331: invokevirtual su/catlean/o_.D (JLjava/awt/Color;)V
// 334: aload 30
// 336: ifnonnull 453
// 339: goto 346
// 33c: ldc2_w 1657973738034023564
// 33f: lload 1
// 340: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: athrow
// 346: aload 3
// 347: aload 0
// 348: getfield su/catlean/wb.O Ljava/awt/Color;
// 34b: lload 17
// 34d: dup2_x1
// 34e: pop2
// 34f: invokevirtual su/catlean/o_.l (JLjava/awt/Color;)V
// 352: aload 30
// 354: ifnonnull 453
// 357: goto 364
// 35a: ldc2_w 1657973738034023564
// 35d: lload 1
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: aload 3
// 365: aload 0
// 366: getfield su/catlean/wb.O Ljava/awt/Color;
// 369: lload 7
// 36b: invokevirtual su/catlean/o_.g (Ljava/awt/Color;J)V
// 36e: aload 30
// 370: ifnonnull 453
// 373: goto 380
// 376: ldc2_w 1657973738034023564
// 379: lload 1
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: aload 3
// 381: aload 0
// 382: getfield su/catlean/wb.O Ljava/awt/Color;
// 385: lload 9
// 387: dup2_x1
// 388: pop2
// 389: invokevirtual su/catlean/o_.q (JLjava/awt/Color;)V
// 38c: aload 30
// 38e: ifnonnull 453
// 391: goto 39e
// 394: ldc2_w 1657973738034023564
// 397: lload 1
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: aload 3
// 39f: aload 0
// 3a0: getfield su/catlean/wb.O Ljava/awt/Color;
// 3a3: lload 15
// 3a5: dup2_x1
// 3a6: pop2
// 3a7: invokevirtual su/catlean/o_.Q (JLjava/awt/Color;)V
// 3aa: aload 30
// 3ac: ifnonnull 453
// 3af: goto 3bc
// 3b2: ldc2_w 1657973738034023564
// 3b5: lload 1
// 3b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bb: athrow
// 3bc: aload 3
// 3bd: aload 0
// 3be: getfield su/catlean/wb.O Ljava/awt/Color;
// 3c1: iload 19
// 3c3: swap
// 3c4: iload 20
// 3c6: i2c
// 3c7: swap
// 3c8: iload 21
// 3ca: i2s
// 3cb: invokevirtual su/catlean/o_.j (ICLjava/awt/Color;S)V
// 3ce: aload 30
// 3d0: ifnonnull 453
// 3d3: goto 3e0
// 3d6: ldc2_w 1657973738034023564
// 3d9: lload 1
// 3da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3df: athrow
// 3e0: aload 3
// 3e1: aload 0
// 3e2: getfield su/catlean/wb.O Ljava/awt/Color;
// 3e5: lload 28
// 3e7: invokevirtual su/catlean/o_.Z (Ljava/awt/Color;J)V
// 3ea: aload 30
// 3ec: ifnonnull 453
// 3ef: goto 3fc
// 3f2: ldc2_w 1657973738034023564
// 3f5: lload 1
// 3f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: athrow
// 3fc: aload 3
// 3fd: aload 0
// 3fe: getfield su/catlean/wb.O Ljava/awt/Color;
// 401: iload 4
// 403: swap
// 404: iload 5
// 406: iload 6
// 408: i2b
// 409: invokevirtual su/catlean/o_.X (ILjava/awt/Color;IB)V
// 40c: aload 30
// 40e: ifnonnull 453
// 411: goto 41e
// 414: ldc2_w 1657973738034023564
// 417: lload 1
// 418: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41d: athrow
// 41e: aload 3
// 41f: aload 0
// 420: getfield su/catlean/wb.O Ljava/awt/Color;
// 423: lload 22
// 425: invokevirtual su/catlean/o_.G (Ljava/awt/Color;J)V
// 428: aload 30
// 42a: ifnonnull 453
// 42d: goto 43a
// 430: ldc2_w 1657973738034023564
// 433: lload 1
// 434: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 439: athrow
// 43a: aload 3
// 43b: aload 0
// 43c: getfield su/catlean/wb.O Ljava/awt/Color;
// 43f: lload 24
// 441: dup2_x1
// 442: pop2
// 443: invokevirtual su/catlean/o_.i (JLjava/awt/Color;)V
// 446: goto 453
// 449: ldc2_w 1657973738034023564
// 44c: lload 1
// 44d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: athrow
// 453: return
}

static {
long var22 = b ^ 98708708520001L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[26];
int var29 = 0;
String var28 = "Û\u008bÏapèYV\u009eôíAç \u0085\u000eõw\u0086\u0080`]L\\\u0010á¹¼\u007fk\nÒR\u0017+¾\u001c\b\b×t\u0018ÏË¡\u000en!ý\u001f\u0016»1\u0018\u000f\u0002ÛUs(a)\u0017\u0084\u0099^\u0010\u009d}SÊÒ/\u0001a¦þ\u0089Ú\u0084J#{\u0010\u009bUa\u0083hê\u0097ZÕ\u0083Ò1\u001c\u001aQV\u0010l\u0090Ü±ä\u0099êéP\u008ec\u000evE\u0093¼\u0010§DÊ\u0089nx\u0014úó\u0017\u007fuB\u000b{¯ '\u001fî*\u009c¤?\u0002<^\u0000\u0004\u00886£Ù¼éà\u001fmH;³\u0093¶/ {\u0091Ñf \u0082\u0090'M?\u0000âº6\u0081\u0090®\r\u0090\u0096Øög1èe\u000bµ\u0002hdü\u0080\u0007!\u009cò\u0010p-D\u001eB\u0011fm¢øþØ¹]Î_ ø÷\u001exë\u0087Ó¶fÎ¯\u0013\u0084\u0004ÌÄ\u0080xMÐeûéA@« ¯Ñ¸i#(ãâ4#ãðP\b\u00002b÷\u00039O\u001dãjH\u0095\u0085\u00163ÿ\u0082\u0016 \bvíG\u001c\u0006\u0080Él0\u0005\u000e\u0002\u0010\u008c\u0094Ï¦\u0015HãÇãÁé¬ãH\u009dP\u0018\u0092.±ÿ\b'i\u0099\u0098ë¿JÑ+k©gý´IIúì\b\u0010ÜbÒÔ\u008fÙl\u009cù\u001f¤\u0095\u0000\u0004H6(\u000f¹ÃJÍÓI\u0081\u0087\u0016e5äz÷Qï÷ÌÍ\u0006\u00141Ò Âð\\\u0016\u0084¡Ó¬±ýd¼û\u0003l\u0010Çx®\u00ad \u0098m\u0002Ï*\u0082T~\u0095LQ\u0018² =§µè¹N\nÝ%èC\u009ah\u001c \u0000ôK¨\u009d[Ã 8h\u009aùQ£\u0002á=TÅT*1T\u0095\u0081¼\u0001\u009cÿrÍÑè\u009d+\u008f\u00ady¡É\u0010\fÉ\u0095Î\u0015\u0092\u0099¤Û¶÷Ï\u008cy5\u009c\u0010ø¡V>f\u001bWÛ\u000f[¨I:º5\u0097\u0010\u0092Á(bÛ\u007fM°t®\u0095-óz\nk\u0010\u0089\u000fK\u009f\u0014×\u008b\u0086N³\u0098`ÁÂ\u0080\u001a é\u008e\f\u008a\u009b%(6ÌkÄÛ\u00ad\u0018aú\u008aé\u00053\u0097êÌAÿ²&¼ \u001e^ó";
int var30 = "Û\u008bÏapèYV\u009eôíAç \u0085\u000eõw\u0086\u0080`]L\\\u0010á¹¼\u007fk\nÒR\u0017+¾\u001c\b\b×t\u0018ÏË¡\u000en!ý\u001f\u0016»1\u0018\u000f\u0002ÛUs(a)\u0017\u0084\u0099^\u0010\u009d}SÊÒ/\u0001a¦þ\u0089Ú\u0084J#{\u0010\u009bUa\u0083hê\u0097ZÕ\u0083Ò1\u001c\u001aQV\u0010l\u0090Ü±ä\u0099êéP\u008ec\u000evE\u0093¼\u0010§DÊ\u0089nx\u0014úó\u0017\u007fuB\u000b{¯ '\u001fî*\u009c¤?\u0002<^\u0000\u0004\u00886£Ù¼éà\u001fmH;³\u0093¶/ {\u0091Ñf \u0082\u0090'M?\u0000âº6\u0081\u0090®\r\u0090\u0096Øög1èe\u000bµ\u0002hdü\u0080\u0007!\u009cò\u0010p-D\u001eB\u0011fm¢øþØ¹]Î_ ø÷\u001exë\u0087Ó¶fÎ¯\u0013\u0084\u0004ÌÄ\u0080xMÐeûéA@« ¯Ñ¸i#(ãâ4#ãðP\b\u00002b÷\u00039O\u001dãjH\u0095\u0085\u00163ÿ\u0082\u0016 \bvíG\u001c\u0006\u0080Él0\u0005\u000e\u0002\u0010\u008c\u0094Ï¦\u0015HãÇãÁé¬ãH\u009dP\u0018\u0092.±ÿ\b'i\u0099\u0098ë¿JÑ+k©gý´IIúì\b\u0010ÜbÒÔ\u008fÙl\u009cù\u001f¤\u0095\u0000\u0004H6(\u000f¹ÃJÍÓI\u0081\u0087\u0016e5äz÷Qï÷ÌÍ\u0006\u00141Ò Âð\\\u0016\u0084¡Ó¬±ýd¼û\u0003l\u0010Çx®\u00ad \u0098m\u0002Ï*\u0082T~\u0095LQ\u0018² =§µè¹N\nÝ%èC\u009ah\u001c \u0000ôK¨\u009d[Ã 8h\u009aùQ£\u0002á=TÅT*1T\u0095\u0081¼\u0001\u009cÿrÍÑè\u009d+\u008f\u00ady¡É\u0010\fÉ\u0095Î\u0015\u0092\u0099¤Û¶÷Ï\u008cy5\u009c\u0010ø¡V>f\u001bWÛ\u000f[¨I:º5\u0097\u0010\u0092Á(bÛ\u007fM°t®\u0095-óz\nk\u0010\u0089\u000fK\u009f\u0014×\u008b\u0086N³\u0098`ÁÂ\u0080\u001a é\u008e\f\u008a\u009b%(6ÌkÄÛ\u00ad\u0018aú\u008aé\u00053\u0097êÌAÿ²&¼ \u001e^ó"
.length();
char var27 = 24;
int var35 = -1;

label72:
while (true) {
String var36 = var28.substring(++var35, var35 + var27);
int var10001 = -1;

while (true) {
byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var32).intern();
switch (var10001) {
case 0:
var31[var29++] = var50;
if ((var35 += var27) >= var30) {
c = var31;
d = new String[26];
k = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[10];
int var14 = 0;
String var15 = "øà÷ëRº\u007f(\u001e\b\u0082Ú;Bñ2«\fÕ.\u008f}s\u0015#_Àv£\u001dÞþ\u0089-E<Ö\u00984Þ:Q\u0011\u0095\u0010\u0084\u0019*Û\u0086\u00966]\u000bUEÖÂO¿\u0098k¢,";
int var16 = "øà÷ëRº\u007f(\u001e\b\u0082Ú;Bñ2«\fÕ.\u008f}s\u0015#_Àv£\u001dÞþ\u0089-E<Ö\u00984Þ:Q\u0011\u0095\u0010\u0084\u0019*Û\u0086\u00966]\u000bUEÖÂO¿\u0098k¢,"
.length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var39 = var17;
var10001 = var14++;
long var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var58 = -1;

while (true) {
long var19 = var54;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var62 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var62;
if (var13 >= var16) {
i = var17;
j = new Integer[10];
o = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "ê\u0017v|Ì5ô\u0014½Ô\u0082r±\u0090äf";
int var5 = "ê\u0017v|Ì5ô\u0014½Ô\u0082r±\u0090äf".length();
byte var2 = 0;

do {
int var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var47 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var61 = -1;
var6[var47] = var62;
} while (var2 < var5);

l = var6;
m = new Long[2];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "å\rÙgÈ¡\u009c\"QjÎð\u009aºË\u0087";
var16 = "å\rÙgÈ¡\u009c\"QjÎð\u009aºË\u0087".length();
var13 = 0;
}

byte var46 = var13;
var13 += 8;
var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
var39 = var17;
var10001 = var14++;
var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var58 = 0;
}
}
}

var27 = var28.charAt(var35);
break;
default:
var31[var29++] = var50;
if ((var35 += var27) < var30) {
var27 = var28.charAt(var35);
continue label72;
}

var28 = "á\u001b¿\u001c\u0018¨\u0019\u0090\u0083Ø°@3 íÏ\u0010\u0000\u0081=\u0007Gû×*xX\u0099\u001d/Ð\\É";
var30 = "á\u001b¿\u001c\u0018¨\u0019\u0090\u0083Ø°@3 íÏ\u0010\u0000\u0081=\u0007Gû×*xX\u0099\u001d/Ð\\É".length();
var27 = 16;
var35 = -1;
}

var36 = var28.substring(++var35, var35 + var27);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22078;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/wb", var10);
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
throw new RuntimeException("su/catlean/wb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20251;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/wb", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/wb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22369;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])o.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/wb", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
m[var3] = var15;
}

return m[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = c(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/wb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
