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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class il extends i8 {
@NotNull
public static final il r;
@NotNull
private static final List M;
@Nullable
private static f6 Q;
@Nullable
private static f6 t;
@Nullable
private static f6 c;
@Nullable
private static xw Z;
@NotNull
private static fd w;
@NotNull
private static fd F;
@NotNull
private static fd S;
private static boolean s;
private static float B;
@NotNull
private static final fz i;
@NotNull
private static final fz P;
@NotNull
private static final fz V;
@NotNull
private static final fz z;
@NotNull
private static final fz J;
private static String v;
private static final long b = yz.a(-7662111121247854744L, 6747433453880005797L, MethodHandles.lookup().lookupClass()).a(211758816005306L);
private static final String[] e;
private static final String[] j;
private static final Map m = new HashMap(13);
private static final long[] n;
private static final Integer[] q;
private static final Map y;

private il(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 140357993297591L;
super(b<"k">(20738, 2127196748142436945L ^ var1), 0.0F, var3, 0.0F, 0.0F, 0.0F, d<"v">(20292, 206589336674027787L ^ var1), null);
}

@NotNull
public final List n() {
return M;
}

@Nullable
public final f6 Q() {
return Q;
}

public final void N(@Nullable f6 <set-?>) {
Q = <set-?>;
}

@Nullable
public final f6 Z() {
return c;
}

public final void v(@Nullable f6 <set-?>) {
c = <set-?>;
}

@Nullable
public final xw S() {
return Z;
}

public final void C(@Nullable xw <set-?>) {
Z = <set-?>;
}

@NotNull
public final fd E() {
return w;
}

public final void G(long a, @NotNull fd <set-?>, char a) {
long var5 = (a << 16 | (long)ax << 48 >>> 48) ^ b;
Intrinsics.checkNotNullParameter(<set-?>, b<"k">(4726, 8116801700221475137L ^ var5));
w = <set-?>;
}

@Override
public void Y(long var1) {
long var3 = var1 ^ 135417448851113L;
long var5 = var1 ^ 25583469870279L;
M.clear();
Iterable var7 = jg.l.M(var5);
boolean var8 = false;

for (Object var10 : var7) {
c2 var11 = (c2)var10;
boolean var12 = false;
M.add(new xw(var3, var11));
if (var1 >= 0L && var1 >= 0L) {
continue;
}
break;
}
}

@Override
public void p(@NotNull class_332 context, int mouseX, int mouseY, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 135894313010346
// 006: lxor
// 007: lstore 6
// 009: dup2
// 00a: ldc2_w 138493012530694
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 8
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 9
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 10
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 136208856317167
// 02e: lxor
// 02f: lstore 11
// 031: dup2
// 032: ldc2_w 38443269427772
// 035: lxor
// 036: lstore 13
// 038: dup2
// 039: ldc2_w 128069896831989
// 03c: lxor
// 03d: lstore 15
// 03f: dup2
// 040: ldc2_w 136208856317167
// 043: lxor
// 044: lstore 17
// 046: dup2
// 047: ldc2_w 129382754651428
// 04a: lxor
// 04b: lstore 19
// 04d: dup2
// 04e: ldc2_w 47084340786468
// 051: lxor
// 052: lstore 21
// 054: dup2
// 055: ldc2_w 55302899458674
// 058: lxor
// 059: dup2
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 23
// 060: dup2
// 061: bipush 16
// 063: lshl
// 064: bipush 32
// 066: lushr
// 067: l2i
// 068: istore 24
// 06a: dup2
// 06b: bipush 48
// 06d: lshl
// 06e: bipush 48
// 070: lushr
// 071: l2i
// 072: istore 25
// 074: pop2
// 075: dup2
// 076: ldc2_w 22135879901675
// 079: lxor
// 07a: dup2
// 07b: bipush 48
// 07d: lushr
// 07e: l2i
// 07f: istore 26
// 081: dup2
// 082: bipush 16
// 084: lshl
// 085: bipush 48
// 087: lushr
// 088: l2i
// 089: istore 27
// 08b: dup2
// 08c: bipush 32
// 08e: lshl
// 08f: bipush 32
// 091: lushr
// 092: l2i
// 093: istore 28
// 095: pop2
// 096: dup2
// 097: ldc2_w 136208856317167
// 09a: lxor
// 09b: lstore 29
// 09d: dup2
// 09e: ldc2_w 27182768661316
// 0a1: lxor
// 0a2: lstore 31
// 0a4: dup2
// 0a5: ldc2_w 0
// 0a8: lxor
// 0a9: lstore 33
// 0ab: dup2
// 0ac: ldc2_w 97910750751556
// 0af: lxor
// 0b0: lstore 35
// 0b2: dup2
// 0b3: ldc2_w 55127167163707
// 0b6: lxor
// 0b7: lstore 37
// 0b9: dup2
// 0ba: ldc2_w 101408683801774
// 0bd: lxor
// 0be: lstore 39
// 0c0: dup2
// 0c1: ldc2_w 2881734234662
// 0c4: lxor
// 0c5: lstore 41
// 0c7: dup2
// 0c8: ldc2_w 55531218400380
// 0cb: lxor
// 0cc: lstore 43
// 0ce: dup2
// 0cf: ldc2_w 136208856317167
// 0d2: lxor
// 0d3: lstore 45
// 0d5: pop2
// 0d6: aload 1
// 0d7: sipush 30895
// 0da: ldc2_w 9018710224524917949
// 0dd: lload 4
// 0df: lxor
// 0e0: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0e8: ldc2_w -9120475805730933394
// 0eb: lload 4
// 0ed: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: aload 0
// 0f3: aload 1
// 0f4: iload 2
// 0f5: iload 3
// 0f6: lload 33
// 0f8: invokespecial su/catlean/i8.p (Lnet/minecraft/class_332;IIJ)V
// 0fb: astore 62
// 0fd: getstatic su/catlean/il.w Lsu/catlean/fd;
// 100: fconst_1
// 101: aload 62
// 103: ifnonnull 135
// 106: lload 13
// 108: dup2_x1
// 109: pop2
// 10a: invokevirtual su/catlean/fd.B (JF)V
// 10d: getstatic su/catlean/il.F Lsu/catlean/fd;
// 110: aload 0
// 111: invokevirtual su/catlean/il.W ()Lsu/catlean/cu;
// 114: ifnull 138
// 117: goto 125
// 11a: ldc2_w -9154430032642699548
// 11d: lload 4
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: ldc 0.5
// 127: goto 135
// 12a: ldc2_w -9154430032642699548
// 12d: lload 4
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: goto 139
// 138: fconst_0
// 139: lload 13
// 13b: dup2_x1
// 13c: pop2
// 13d: invokevirtual su/catlean/fd.B (JF)V
// 140: getstatic su/catlean/il.S Lsu/catlean/fd;
// 143: lload 13
// 145: getstatic su/catlean/il.B F
// 148: invokevirtual su/catlean/fd.B (JF)V
// 14b: aload 0
// 14c: invokevirtual su/catlean/il.e ()F
// 14f: ldc 3.0
// 151: fadd
// 152: fstore 63
// 154: aload 0
// 155: invokevirtual su/catlean/il.e ()F
// 158: ldc 72.0
// 15a: fadd
// 15b: fstore 64
// 15d: iload 2
// 15e: i2f
// 15f: fstore 65
// 161: fload 63
// 163: fload 65
// 165: fcmpg
// 166: aload 62
// 168: lload 4
// 16a: lconst_0
// 16b: lcmp
// 16c: iflt 198
// 16f: ifnonnull 196
// 172: ifgt 1bf
// 175: goto 183
// 178: ldc2_w -9154430032642699548
// 17b: lload 4
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: fload 65
// 185: fload 64
// 187: fcmpg
// 188: goto 196
// 18b: ldc2_w -9154430032642699548
// 18e: lload 4
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: aload 62
// 198: ifnonnull 1bc
// 19b: ifgt 1bb
// 19e: goto 1ac
// 1a1: ldc2_w -9154430032642699548
// 1a4: lload 4
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: bipush 1
// 1ad: goto 1c0
// 1b0: ldc2_w -9154430032642699548
// 1b3: lload 4
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: bipush 0
// 1bc: goto 1c0
// 1bf: bipush 0
// 1c0: ifeq 251
// 1c3: aload 0
// 1c4: invokevirtual su/catlean/il.T ()F
// 1c7: ldc 5.0
// 1c9: fadd
// 1ca: fstore 63
// 1cc: aload 0
// 1cd: invokevirtual su/catlean/il.T ()F
// 1d0: ldc 13.0
// 1d2: fadd
// 1d3: fstore 64
// 1d5: iload 3
// 1d6: i2f
// 1d7: fstore 65
// 1d9: fload 63
// 1db: fload 65
// 1dd: fcmpg
// 1de: aload 62
// 1e0: lload 4
// 1e2: lconst_0
// 1e3: lcmp
// 1e4: ifle 210
// 1e7: ifnonnull 20e
// 1ea: ifgt 237
// 1ed: goto 1fb
// 1f0: ldc2_w -9154430032642699548
// 1f3: lload 4
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: fload 65
// 1fd: fload 64
// 1ff: fcmpg
// 200: goto 20e
// 203: ldc2_w -9154430032642699548
// 206: lload 4
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: aload 62
// 210: ifnonnull 234
// 213: ifgt 233
// 216: goto 224
// 219: ldc2_w -9154430032642699548
// 21c: lload 4
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: bipush 1
// 225: goto 238
// 228: ldc2_w -9154430032642699548
// 22b: lload 4
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: bipush 0
// 234: goto 238
// 237: bipush 0
// 238: lload 4
// 23a: lconst_0
// 23b: lcmp
// 23c: ifle 243
// 23f: ifeq 251
// 242: bipush 1
// 243: goto 252
// 246: ldc2_w -9154430032642699548
// 249: lload 4
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: bipush 0
// 252: putstatic su/catlean/il.s Z
// 255: aload 1
// 256: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 259: dup
// 25a: sipush 24975
// 25d: ldc2_w 3402184201236456854
// 260: lload 4
// 262: lxor
// 263: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26b: aload 0
// 26c: invokevirtual su/catlean/il.e ()F
// 26f: ldc 5.0
// 271: fadd
// 272: aload 0
// 273: invokevirtual su/catlean/il.T ()F
// 276: ldc 3.0
// 278: fadd
// 279: ldc 69.0
// 27b: ldc 8.0
// 27d: fconst_2
// 27e: getstatic su/catlean/il.s Z
// 281: ifeq 294
// 284: ldc 2.5
// 286: goto 295
// 289: ldc2_w -9154430032642699548
// 28c: lload 4
// 28e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 293: athrow
// 294: fconst_2
// 295: getstatic su/catlean/il.s Z
// 298: ifeq 2ab
// 29b: ldc 0.1
// 29d: goto 2ac
// 2a0: ldc2_w -9154430032642699548
// 2a3: lload 4
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: fconst_0
// 2ac: fconst_1
// 2ad: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2b0: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 2b3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2b6: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2b9: fconst_0
// 2ba: fconst_0
// 2bb: fconst_0
// 2bc: sipush 23141
// 2bf: ldc2_w 7710565065401477998
// 2c2: lload 4
// 2c4: lxor
// 2c5: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: aconst_null
// 2cb: astore 47
// 2cd: istore 48
// 2cf: fstore 49
// 2d1: fstore 50
// 2d3: fstore 51
// 2d5: astore 52
// 2d7: astore 53
// 2d9: fstore 54
// 2db: fstore 55
// 2dd: fstore 56
// 2df: fstore 57
// 2e1: fstore 58
// 2e3: fstore 59
// 2e5: fstore 60
// 2e7: fstore 61
// 2e9: iload 26
// 2eb: i2c
// 2ec: fload 61
// 2ee: fload 60
// 2f0: fload 59
// 2f2: fload 58
// 2f4: fload 57
// 2f6: fload 56
// 2f8: fload 55
// 2fa: fload 54
// 2fc: aload 53
// 2fe: aload 52
// 300: fload 51
// 302: iload 27
// 304: i2s
// 305: fload 50
// 307: iload 28
// 309: fload 49
// 30b: iload 48
// 30d: aload 47
// 30f: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 312: lload 37
// 314: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 317: aload 1
// 318: ldc "+"
// 31a: aload 0
// 31b: invokevirtual su/catlean/il.e ()F
// 31e: ldc 36.0
// 320: fadd
// 321: lload 19
// 323: dup2_x1
// 324: pop2
// 325: aload 0
// 326: invokevirtual su/catlean/il.T ()F
// 329: fconst_1
// 32a: fadd
// 32b: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 32e: dup
// 32f: sipush 13640
// 332: ldc2_w 7242333551145677139
// 335: lload 4
// 337: lxor
// 338: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 340: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 343: aload 1
// 344: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 347: dup
// 348: sipush 11801
// 34b: ldc2_w 7842225272758397447
// 34e: lload 4
// 350: lxor
// 351: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 359: aload 0
// 35a: invokevirtual su/catlean/il.e ()F
// 35d: ldc 76.0
// 35f: fadd
// 360: iload 26
// 362: i2c
// 363: swap
// 364: aload 0
// 365: invokevirtual su/catlean/il.T ()F
// 368: ldc 6.0
// 36a: aload 0
// 36b: invokevirtual su/catlean/il.j ()F
// 36e: fconst_1
// 36f: fconst_0
// 370: fconst_0
// 371: fconst_1
// 372: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 375: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 378: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 37b: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 37e: fconst_0
// 37f: iload 27
// 381: i2s
// 382: fconst_0
// 383: iload 28
// 385: fconst_0
// 386: sipush 18703
// 389: ldc2_w 3145625907030079490
// 38c: lload 4
// 38e: lxor
// 38f: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: aconst_null
// 395: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 398: aconst_null
// 399: putstatic su/catlean/il.c Lsu/catlean/f6;
// 39c: aconst_null
// 39d: putstatic su/catlean/il.Q Lsu/catlean/f6;
// 3a0: fconst_0
// 3a1: fstore 63
// 3a3: ldc 17.0
// 3a5: getstatic su/catlean/il.S Lsu/catlean/fd;
// 3a8: invokevirtual su/catlean/fd.a ()F
// 3ab: fadd
// 3ac: fstore 63
// 3ae: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3b1: lload 41
// 3b3: aload 1
// 3b4: new su/catlean/o7
// 3b7: dup
// 3b8: aload 0
// 3b9: invokevirtual su/catlean/il.e ()F
// 3bc: aload 0
// 3bd: invokevirtual su/catlean/il.T ()F
// 3c0: sipush 9887
// 3c3: ldc2_w 1112852020954093463
// 3c6: lload 4
// 3c8: lxor
// 3c9: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: i2f
// 3cf: fadd
// 3d0: aload 0
// 3d1: invokevirtual su/catlean/il.e ()F
// 3d4: sipush 7922
// 3d7: ldc2_w 6865008395379994622
// 3da: lload 4
// 3dc: lxor
// 3dd: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: i2f
// 3e3: fadd
// 3e4: aload 0
// 3e5: invokevirtual su/catlean/il.T ()F
// 3e8: aload 0
// 3e9: invokevirtual su/catlean/il.j ()F
// 3ec: fadd
// 3ed: fconst_2
// 3ee: fsub
// 3ef: invokespecial su/catlean/o7.<init> (FFFF)V
// 3f2: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 3f5: getstatic su/catlean/il.M Ljava/util/List;
// 3f8: checkcast java/lang/Iterable
// 3fb: astore 64
// 3fd: bipush 0
// 3fe: istore 65
// 400: aload 64
// 402: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 407: astore 66
// 409: aload 66
// 40b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 410: ifeq 47e
// 413: aload 66
// 415: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 41a: astore 67
// 41c: aload 67
// 41e: checkcast su/catlean/xw
// 421: astore 68
// 423: bipush 0
// 424: istore 69
// 426: aload 68
// 428: lload 29
// 42a: aload 1
// 42b: getstatic su/catlean/il.r Lsu/catlean/il;
// 42e: invokevirtual su/catlean/il.e ()F
// 431: getstatic su/catlean/il.r Lsu/catlean/il;
// 434: invokevirtual su/catlean/il.T ()F
// 437: fload 63
// 439: fadd
// 43a: iload 2
// 43b: i2f
// 43c: iload 3
// 43d: i2f
// 43e: invokevirtual su/catlean/xw.o (JLnet/minecraft/class_332;FFFF)V
// 441: fload 63
// 443: ldc 29.0
// 445: fadd
// 446: fstore 63
// 448: nop
// 449: nop
// 44a: aload 62
// 44c: lload 4
// 44e: lconst_0
// 44f: lcmp
// 450: iflt 48a
// 453: ifnonnull 488
// 456: aload 62
// 458: ifnull 409
// 45b: lload 4
// 45d: lconst_0
// 45e: lcmp
// 45f: iflt 44a
// 462: goto 470
// 465: ldc2_w -9154430032642699548
// 468: lload 4
// 46a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46f: athrow
// 470: bipush 4
// 471: anewarray 680
// 474: ldc2_w -9137944270738650350
// 477: lload 4
// 479: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: nop
// 47f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 482: lload 43
// 484: aload 1
// 485: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 488: aload 62
// 48a: lload 4
// 48c: lconst_0
// 48d: lcmp
// 48e: iflt 6e6
// 491: ifnonnull 6e4
// 494: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 497: ifnull 5f8
// 49a: goto 4a8
// 49d: ldc2_w -9154430032642699548
// 4a0: lload 4
// 4a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a7: athrow
// 4a8: fconst_1
// 4a9: getstatic su/catlean/il.w Lsu/catlean/fd;
// 4ac: invokevirtual su/catlean/fd.a ()F
// 4af: fsub
// 4b0: ldc 10.0
// 4b2: fmul
// 4b3: fstore 64
// 4b5: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/il.g ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 4ba: astore 65
// 4bc: getstatic su/catlean/il.i Lsu/catlean/fz;
// 4bf: lload 11
// 4c1: aload 1
// 4c2: aload 0
// 4c3: invokevirtual su/catlean/il.e ()F
// 4c6: ldc 84.0
// 4c8: fadd
// 4c9: aload 0
// 4ca: invokevirtual su/catlean/il.T ()F
// 4cd: ldc 17.0
// 4cf: fadd
// 4d0: fload 64
// 4d2: fadd
// 4d3: iload 2
// 4d4: i2f
// 4d5: iload 3
// 4d6: i2f
// 4d7: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 4da: getstatic su/catlean/il.P Lsu/catlean/fz;
// 4dd: lload 11
// 4df: aload 1
// 4e0: aload 0
// 4e1: invokevirtual su/catlean/il.e ()F
// 4e4: ldc 84.0
// 4e6: fadd
// 4e7: aload 0
// 4e8: invokevirtual su/catlean/il.T ()F
// 4eb: ldc 32.0
// 4ed: fadd
// 4ee: fload 64
// 4f0: fadd
// 4f1: iload 2
// 4f2: i2f
// 4f3: iload 3
// 4f4: i2f
// 4f5: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 4f8: getstatic su/catlean/il.V Lsu/catlean/fz;
// 4fb: lload 11
// 4fd: aload 1
// 4fe: aload 0
// 4ff: invokevirtual su/catlean/il.e ()F
// 502: ldc 84.0
// 504: fadd
// 505: aload 0
// 506: invokevirtual su/catlean/il.T ()F
// 509: ldc 47.0
// 50b: fadd
// 50c: fload 64
// 50e: fadd
// 50f: iload 2
// 510: i2f
// 511: iload 3
// 512: i2f
// 513: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 516: getstatic su/catlean/il.z Lsu/catlean/fz;
// 519: lload 11
// 51b: aload 1
// 51c: aload 0
// 51d: invokevirtual su/catlean/il.e ()F
// 520: ldc 84.0
// 522: fadd
// 523: aload 0
// 524: invokevirtual su/catlean/il.T ()F
// 527: ldc 62.0
// 529: fadd
// 52a: fload 64
// 52c: fadd
// 52d: iload 2
// 52e: i2f
// 52f: iload 3
// 530: i2f
// 531: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 534: getstatic su/catlean/il.J Lsu/catlean/fz;
// 537: lload 11
// 539: aload 1
// 53a: aload 0
// 53b: invokevirtual su/catlean/il.e ()F
// 53e: ldc 84.0
// 540: fadd
// 541: aload 0
// 542: invokevirtual su/catlean/il.T ()F
// 545: ldc 77.0
// 547: fadd
// 548: fload 64
// 54a: fadd
// 54b: iload 2
// 54c: i2f
// 54d: iload 3
// 54e: i2f
// 54f: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 552: new su/catlean/xq
// 555: dup
// 556: aload 0
// 557: invokevirtual su/catlean/il.y ()F
// 55a: lload 39
// 55c: sipush 4574
// 55f: ldc2_w 2810285875611391430
// 562: lload 4
// 564: lxor
// 565: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56a: sipush 16682
// 56d: ldc2_w 8742317350591563056
// 570: lload 4
// 572: lxor
// 573: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 578: new su/catlean/oy
// 57b: dup
// 57c: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 57f: dup
// 580: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 583: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 586: lload 6
// 588: invokespecial su/catlean/oy.<init> (Ljava/lang/Object;J)V
// 58b: checkcast kotlin/reflect/KMutableProperty0
// 58e: new su/catlean/wy
// 591: dup
// 592: lload 15
// 594: aload 0
// 595: invokespecial su/catlean/wy.<init> (JLjava/lang/Object;)V
// 598: checkcast kotlin/reflect/KMutableProperty0
// 59b: invokespecial su/catlean/xq.<init> (FJLjava/lang/String;Ljava/lang/String;Lkotlin/reflect/KMutableProperty0;Lkotlin/reflect/KMutableProperty0;)V
// 59e: lload 45
// 5a0: aload 1
// 5a1: aload 0
// 5a2: invokevirtual su/catlean/il.e ()F
// 5a5: ldc 84.0
// 5a7: fadd
// 5a8: aload 0
// 5a9: invokevirtual su/catlean/il.T ()F
// 5ac: ldc 92.0
// 5ae: fadd
// 5af: fload 64
// 5b1: fadd
// 5b2: iload 2
// 5b3: i2f
// 5b4: iload 3
// 5b5: i2f
// 5b6: invokevirtual su/catlean/xq.o (JLnet/minecraft/class_332;FFFF)V
// 5b9: new su/catlean/fv
// 5bc: dup
// 5bd: aload 65
// 5bf: aload 0
// 5c0: invokevirtual su/catlean/il.y ()F
// 5c3: iload 8
// 5c5: swap
// 5c6: iload 9
// 5c8: i2s
// 5c9: swap
// 5ca: new su/catlean/yo
// 5cd: dup
// 5ce: aload 0
// 5cf: lload 21
// 5d1: invokespecial su/catlean/yo.<init> (Ljava/lang/Object;J)V
// 5d4: checkcast kotlin/reflect/KMutableProperty0
// 5d7: iload 10
// 5d9: i2s
// 5da: invokespecial su/catlean/fv.<init> (Lkotlin/jvm/functions/Function0;ISFLkotlin/reflect/KMutableProperty0;S)V
// 5dd: lload 17
// 5df: aload 1
// 5e0: aload 0
// 5e1: invokevirtual su/catlean/il.e ()F
// 5e4: ldc 84.0
// 5e6: fadd
// 5e7: aload 0
// 5e8: invokevirtual su/catlean/il.T ()F
// 5eb: ldc 107.0
// 5ed: fadd
// 5ee: fload 64
// 5f0: fadd
// 5f1: iload 2
// 5f2: i2f
// 5f3: iload 3
// 5f4: i2f
// 5f5: invokevirtual su/catlean/fv.o (JLnet/minecraft/class_332;FFFF)V
// 5f8: aload 0
// 5f9: invokevirtual su/catlean/il.e ()F
// 5fc: aload 0
// 5fd: invokevirtual su/catlean/il.T ()F
// 600: aload 0
// 601: invokevirtual su/catlean/il.y ()F
// 604: aload 0
// 605: invokevirtual su/catlean/il.j ()F
// 608: ldc 5.0
// 60a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 60d: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 610: dup
// 611: sipush 1511
// 614: ldc2_w 4589299404200067570
// 617: lload 4
// 619: lxor
// 61a: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 622: getstatic su/catlean/il.F Lsu/catlean/fd;
// 625: invokevirtual su/catlean/fd.a ()F
// 628: iload 23
// 62a: i2c
// 62b: swap
// 62c: iload 24
// 62e: swap
// 62f: iload 25
// 631: i2s
// 632: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 635: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 638: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 63b: dup
// 63c: sipush 10071
// 63f: ldc2_w 7665672275096200001
// 642: lload 4
// 644: lxor
// 645: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 64d: getstatic su/catlean/il.F Lsu/catlean/fd;
// 650: invokevirtual su/catlean/fd.a ()F
// 653: iload 23
// 655: i2c
// 656: swap
// 657: iload 24
// 659: swap
// 65a: iload 25
// 65c: i2s
// 65d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 660: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 663: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 666: dup
// 667: sipush 10071
// 66a: ldc2_w 7665672275096200001
// 66d: lload 4
// 66f: lxor
// 670: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 675: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 678: getstatic su/catlean/il.F Lsu/catlean/fd;
// 67b: invokevirtual su/catlean/fd.a ()F
// 67e: iload 23
// 680: i2c
// 681: swap
// 682: iload 24
// 684: swap
// 685: iload 25
// 687: i2s
// 688: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 68b: lload 35
// 68d: dup2_x1
// 68e: pop2
// 68f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 692: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 695: dup
// 696: sipush 10071
// 699: ldc2_w 7665672275096200001
// 69c: lload 4
// 69e: lxor
// 69f: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6a7: getstatic su/catlean/il.F Lsu/catlean/fd;
// 6aa: invokevirtual su/catlean/fd.a ()F
// 6ad: iload 23
// 6af: i2c
// 6b0: swap
// 6b1: iload 24
// 6b3: swap
// 6b4: iload 25
// 6b6: i2s
// 6b7: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 6ba: aload 1
// 6bb: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6be: dup
// 6bf: sipush 11801
// 6c2: ldc2_w 7842225272758397447
// 6c5: lload 4
// 6c7: lxor
// 6c8: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6d0: fconst_0
// 6d1: aconst_null
// 6d2: sipush 8949
// 6d5: ldc2_w 1710120551232558076
// 6d8: lload 4
// 6da: lxor
// 6db: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e0: aconst_null
// 6e1: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 6e4: aload 62
// 6e6: ifnonnull 738
// 6e9: aload 0
// 6ea: invokevirtual su/catlean/il.W ()Lsu/catlean/cu;
// 6ed: dup
// 6ee: ifnull 73b
// 6f1: goto 6ff
// 6f4: ldc2_w -9154430032642699548
// 6f7: lload 4
// 6f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fe: athrow
// 6ff: aload 1
// 700: aload 0
// 701: invokevirtual su/catlean/il.e ()F
// 704: aload 0
// 705: invokevirtual su/catlean/il.y ()F
// 708: fconst_2
// 709: fdiv
// 70a: fadd
// 70b: ldc 60.0
// 70d: fsub
// 70e: aload 0
// 70f: invokevirtual su/catlean/il.T ()F
// 712: aload 0
// 713: invokevirtual su/catlean/il.j ()F
// 716: bipush 2
// 717: i2f
// 718: fdiv
// 719: fadd
// 71a: ldc 35.0
// 71c: fsub
// 71d: iload 2
// 71e: i2f
// 71f: lload 31
// 721: dup2_x1
// 722: pop2
// 723: iload 3
// 724: i2f
// 725: invokeinterface su/catlean/cu.Y (Lnet/minecraft/class_332;FFJFF)V 8
// 72a: goto 738
// 72d: ldc2_w -9154430032642699548
// 730: lload 4
// 732: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 737: athrow
// 738: goto 73c
// 73b: pop
// 73c: return
}

private final void H(String var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 72122391592176L;
int var6 = (int)((var2 ^ 99164662230804L) >>> 32);
int var7 = (int)((var2 ^ 99164662230804L) << 32 >>> 32);
long var8 = var2 ^ 77173186768669L;
jg.l.B(var8, new c2(var6, var1, "", 0, var7, "", "", false, 0, d<"v">(12994, 6944114496386227906L ^ var2), null));
this.Y(var4);
this.l(null);
}

@Override
public void c(float mX, float mY, short a, int button, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: lstore 7
// 01b: lload 7
// 01d: dup2
// 01e: ldc2_w 72650074335561
// 021: lxor
// 022: lstore 9
// 024: dup2
// 025: ldc2_w 0
// 028: lxor
// 029: dup2
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 11
// 030: dup2
// 031: bipush 16
// 033: lshl
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 12
// 03a: dup2
// 03b: bipush 48
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 13
// 044: pop2
// 045: dup2
// 046: ldc2_w 38836403100948
// 049: lxor
// 04a: lstore 14
// 04c: dup2
// 04d: ldc2_w 89123186698759
// 050: lxor
// 051: lstore 16
// 053: dup2
// 054: ldc2_w 20362906346987
// 057: lxor
// 058: lstore 18
// 05a: pop2
// 05b: ldc2_w -2764657741324833374
// 05e: lload 7
// 060: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: aload 0
// 066: fload 1
// 067: fload 2
// 068: iload 11
// 06a: i2s
// 06b: iload 4
// 06d: iload 12
// 06f: iload 13
// 071: i2c
// 072: invokespecial su/catlean/i8.c (FFSIIC)V
// 075: astore 20
// 077: aload 20
// 079: ifnonnull 0d6
// 07c: aload 0
// 07d: invokevirtual su/catlean/il.W ()Lsu/catlean/cu;
// 080: dup
// 081: ifnull 0d5
// 084: goto 092
// 087: ldc2_w -2866374457604549080
// 08a: lload 7
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 14
// 094: fload 1
// 095: fload 2
// 096: iload 4
// 098: invokeinterface su/catlean/cu.y (JFFI)Z 6
// 09d: aload 20
// 09f: ifnonnull 0d2
// 0a2: goto 0b0
// 0a5: ldc2_w -2866374457604549080
// 0a8: lload 7
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: bipush 1
// 0b1: if_icmpne 0d1
// 0b4: goto 0c2
// 0b7: ldc2_w -2866374457604549080
// 0ba: lload 7
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: bipush 1
// 0c3: goto 0d7
// 0c6: ldc2_w -2866374457604549080
// 0c9: lload 7
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: bipush 0
// 0d2: goto 0d7
// 0d5: pop
// 0d6: bipush 0
// 0d7: ifeq 0db
// 0da: return
// 0db: iload 6
// 0dd: ifle 113
// 0e0: getstatic su/catlean/il.s Z
// 0e3: ifeq 10e
// 0e6: getstatic su/catlean/fz.I Lsu/catlean/b;
// 0e9: aconst_null
// 0ea: invokevirtual su/catlean/b.A (Lsu/catlean/fz;)V
// 0ed: aload 0
// 0ee: new su/catlean/rd
// 0f1: dup
// 0f2: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/il.L (Ljava/lang/String;)Lkotlin/Unit;, (Ljava/lang/String;)Lkotlin/Unit; ]
// 0f7: lload 16
// 0f9: invokespecial su/catlean/rd.<init> (Lkotlin/jvm/functions/Function1;J)V
// 0fc: checkcast su/catlean/cu
// 0ff: invokevirtual su/catlean/il.l (Lsu/catlean/cu;)V
// 102: return
// 103: ldc2_w -2866374457604549080
// 106: lload 7
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: aload 0
// 10f: aconst_null
// 110: invokevirtual su/catlean/il.l (Lsu/catlean/cu;)V
// 113: getstatic su/catlean/il.Q Lsu/catlean/f6;
// 116: iload 6
// 118: ifle 15b
// 11b: aload 20
// 11d: ifnonnull 15b
// 120: ifnull 154
// 123: goto 131
// 126: ldc2_w -2866374457604549080
// 129: lload 7
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: getstatic su/catlean/il.Q Lsu/catlean/f6;
// 134: putstatic su/catlean/il.t Lsu/catlean/f6;
// 137: getstatic su/catlean/il.Q Lsu/catlean/f6;
// 13a: dup
// 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 13e: fload 1
// 13f: fload 2
// 140: iload 4
// 142: lload 18
// 144: invokevirtual su/catlean/f6.P (FFIJ)Z
// 147: pop
// 148: return
// 149: ldc2_w -2866374457604549080
// 14c: lload 7
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: aconst_null
// 155: putstatic su/catlean/il.t Lsu/catlean/f6;
// 158: getstatic su/catlean/il.c Lsu/catlean/f6;
// 15b: ifnull 2c4
// 15e: iload 4
// 160: iload 6
// 162: iflt 1d6
// 165: aload 20
// 167: ifnonnull 1d6
// 16a: goto 178
// 16d: ldc2_w -2866374457604549080
// 170: lload 7
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: tableswitch 332 0 1 35 166
// 190: ldc2_w -2866374457604549080
// 193: lload 7
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 19e: iload 3
// 19f: iflt 204
// 1a2: aload 20
// 1a4: ifnonnull 204
// 1a7: goto 1b5
// 1aa: ldc2_w -2866374457604549080
// 1ad: lload 7
// 1af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: athrow
// 1b5: invokevirtual su/catlean/jg.N ()Lsu/catlean/c2;
// 1b8: getstatic su/catlean/il.c Lsu/catlean/f6;
// 1bb: dup
// 1bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1bf: checkcast su/catlean/xw
// 1c2: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 1c5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c8: goto 1d6
// 1cb: ldc2_w -2866374457604549080
// 1ce: lload 7
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: ifeq 1f3
// 1d9: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 1dc: aconst_null
// 1dd: invokevirtual su/catlean/jg.d (Lsu/catlean/c2;)V
// 1e0: aload 20
// 1e2: ifnull 2c4
// 1e5: goto 1f3
// 1e8: ldc2_w -2866374457604549080
// 1eb: lload 7
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 1f6: goto 204
// 1f9: ldc2_w -2866374457604549080
// 1fc: lload 7
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: getstatic su/catlean/il.c Lsu/catlean/f6;
// 207: dup
// 208: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 20b: checkcast su/catlean/xw
// 20e: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 211: invokevirtual su/catlean/jg.d (Lsu/catlean/c2;)V
// 214: iload 6
// 216: iflt 2b6
// 219: aload 20
// 21b: ifnull 2c4
// 21e: getstatic su/catlean/il.c Lsu/catlean/f6;
// 221: dup
// 222: sipush 21020
// 225: ldc2_w 6754469098420293325
// 228: lload 7
// 22a: lxor
// 22b: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 233: checkcast su/catlean/xw
// 236: putstatic su/catlean/il.Z Lsu/catlean/xw;
// 239: getstatic su/catlean/il.i Lsu/catlean/fz;
// 23c: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 23f: dup
// 240: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 243: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 246: invokevirtual su/catlean/c2.j ()Ljava/lang/String;
// 249: lload 9
// 24b: dup2_x1
// 24c: pop2
// 24d: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 250: getstatic su/catlean/il.P Lsu/catlean/fz;
// 253: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 256: dup
// 257: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 25a: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 25d: invokevirtual su/catlean/c2.c ()Ljava/lang/String;
// 260: lload 9
// 262: dup2_x1
// 263: pop2
// 264: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 267: getstatic su/catlean/il.V Lsu/catlean/fz;
// 26a: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 26d: dup
// 26e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 271: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 274: invokevirtual su/catlean/c2.X ()I
// 277: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 27a: lload 9
// 27c: dup2_x1
// 27d: pop2
// 27e: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 281: getstatic su/catlean/il.J Lsu/catlean/fz;
// 284: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 287: dup
// 288: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 28b: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 28e: invokevirtual su/catlean/c2.G ()Ljava/lang/String;
// 291: lload 9
// 293: dup2_x1
// 294: pop2
// 295: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 298: getstatic su/catlean/il.z Lsu/catlean/fz;
// 29b: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 29e: dup
// 29f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2a2: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 2a5: invokevirtual su/catlean/c2.f ()Ljava/lang/String;
// 2a8: lload 9
// 2aa: dup2_x1
// 2ab: pop2
// 2ac: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 2af: getstatic su/catlean/il.w Lsu/catlean/fd;
// 2b2: fconst_0
// 2b3: invokevirtual su/catlean/fd.P (F)V
// 2b6: goto 2c4
// 2b9: ldc2_w -2866374457604549080
// 2bc: lload 7
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: return
}

@Override
public void a(double mouseX, long a, double mouseY, double amount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: ldc2_w -990805233691621828
// 003: lload 3
// 004: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 0
// 00a: invokevirtual su/catlean/il.e ()F
// 00d: fstore 10
// 00f: astore 9
// 011: dload 1
// 012: aload 0
// 013: invokevirtual su/catlean/il.e ()F
// 016: ldc 76.0
// 018: fadd
// 019: f2d
// 01a: dcmpg
// 01b: aload 9
// 01d: lload 3
// 01e: lconst_0
// 01f: lcmp
// 020: ifle 04a
// 023: ifnonnull 048
// 026: ifgt 06f
// 029: goto 036
// 02c: ldc2_w -889863265054589514
// 02f: lload 3
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: fload 10
// 038: f2d
// 039: dload 1
// 03a: dcmpg
// 03b: goto 048
// 03e: ldc2_w -889863265054589514
// 041: lload 3
// 042: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: athrow
// 048: aload 9
// 04a: ifnonnull 06c
// 04d: ifgt 06b
// 050: goto 05d
// 053: ldc2_w -889863265054589514
// 056: lload 3
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: bipush 1
// 05e: goto 070
// 061: ldc2_w -889863265054589514
// 064: lload 3
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: bipush 0
// 06c: goto 070
// 06f: bipush 0
// 070: ifeq 111
// 073: aload 0
// 074: invokevirtual su/catlean/il.T ()F
// 077: fstore 10
// 079: dload 5
// 07b: aload 0
// 07c: invokevirtual su/catlean/il.T ()F
// 07f: aload 0
// 080: invokevirtual su/catlean/il.j ()F
// 083: fadd
// 084: fconst_2
// 085: fsub
// 086: f2d
// 087: dcmpg
// 088: aload 9
// 08a: lload 3
// 08b: lconst_0
// 08c: lcmp
// 08d: ifle 0b8
// 090: ifnonnull 0b6
// 093: ifgt 0dd
// 096: goto 0a3
// 099: ldc2_w -889863265054589514
// 09c: lload 3
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: fload 10
// 0a5: f2d
// 0a6: dload 5
// 0a8: dcmpg
// 0a9: goto 0b6
// 0ac: ldc2_w -889863265054589514
// 0af: lload 3
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 9
// 0b8: ifnonnull 0da
// 0bb: ifgt 0d9
// 0be: goto 0cb
// 0c1: ldc2_w -889863265054589514
// 0c4: lload 3
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 1
// 0cc: goto 0de
// 0cf: ldc2_w -889863265054589514
// 0d2: lload 3
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: goto 0de
// 0dd: bipush 0
// 0de: ifeq 111
// 0e1: getstatic su/catlean/il.B F
// 0e4: dload 7
// 0e6: d2f
// 0e7: ldc 7.0
// 0e9: fmul
// 0ea: fadd
// 0eb: putstatic su/catlean/il.B F
// 0ee: getstatic su/catlean/il.B F
// 0f1: getstatic su/catlean/il.M Ljava/util/List;
// 0f4: invokeinterface java/util/List.size ()I 1
// 0f9: i2f
// 0fa: ldc -29.0
// 0fc: fmul
// 0fd: fconst_0
// 0fe: invokestatic java/lang/Math.clamp (FFF)F
// 101: putstatic su/catlean/il.B F
// 104: goto 111
// 107: ldc2_w -889863265054589514
// 10a: lload 3
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: return
}

private static final Unit c(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/il.b J
// 03: ldc2_w 118046885818737
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 88233822140894
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: aload 0
// 11: sipush 31130
// 14: ldc2_w 1781706119289413195
// 17: lload 1
// 18: lxor
// 19: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 21: getstatic su/catlean/il.r Lsu/catlean/il;
// 24: pop
// 25: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 28: dup
// 29: ifnull 55
// 2c: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 2f: dup
// 30: ifnull 55
// 33: goto 40
// 36: ldc2_w 2537078152338779429
// 39: lload 1
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: aload 0
// 41: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 44: lload 3
// 45: invokevirtual su/catlean/c2.F (Ljava/lang/String;J)V
// 48: goto 56
// 4b: ldc2_w 2537078152338779429
// 4e: lload 1
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: pop
// 56: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 59: areturn
}

private static final Unit n(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/il.b J
// 03: ldc2_w 70143620382464
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 114528175923370
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 3
// 14: dup2
// 15: bipush 16
// 17: lshl
// 18: bipush 48
// 1a: lushr
// 1b: l2i
// 1c: istore 4
// 1e: dup2
// 1f: bipush 32
// 21: lshl
// 22: bipush 32
// 24: lushr
// 25: l2i
// 26: istore 5
// 28: pop2
// 29: pop2
// 2a: aload 0
// 2b: sipush 31130
// 2e: ldc2_w 1781649543411257402
// 31: lload 1
// 32: lxor
// 33: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3b: getstatic su/catlean/il.r Lsu/catlean/il;
// 3e: pop
// 3f: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 42: dup
// 43: ifnull 78
// 46: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 49: dup
// 4a: ifnull 78
// 4d: goto 5a
// 50: ldc2_w 7873655217964704596
// 53: lload 1
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: aload 0
// 5b: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 5e: iload 3
// 5f: i2c
// 60: swap
// 61: iload 4
// 63: i2c
// 64: swap
// 65: iload 5
// 67: swap
// 68: invokevirtual su/catlean/c2.N (CCILjava/lang/String;)V
// 6b: goto 79
// 6e: ldc2_w 7873655217964704596
// 71: lload 1
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: pop
// 79: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 7c: areturn
}

private static final Unit x(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/il.b J
// 03: ldc2_w 40495927858546
// 06: lxor
// 07: lstore 1
// 08: aload 0
// 09: sipush 23794
// 0c: ldc2_w 6405832125225803572
// 0f: lload 1
// 10: lxor
// 11: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 19: getstatic su/catlean/il.r Lsu/catlean/il;
// 1c: pop
// 1d: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 20: dup
// 21: ifnull 77
// 24: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 27: dup
// 28: ifnull 77
// 2b: goto 38
// 2e: ldc2_w 519827843603597606
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 3c: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
// 3f: dup
// 40: ifnull 60
// 43: goto 50
// 46: ldc2_w 519827843603597606
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: invokevirtual java/lang/Integer.intValue ()I
// 53: goto 6e
// 56: ldc2_w 519827843603597606
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: pop
// 61: sipush 1790
// 64: ldc2_w 716515452012785718
// 67: lload 1
// 68: lxor
// 69: invokedynamic v (IJ)I bsm=su/catlean/il.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: invokestatic java/lang/Math.abs (I)I
// 71: invokevirtual su/catlean/c2.W (I)V
// 74: goto 78
// 77: pop
// 78: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 7b: areturn
}

private static final Unit g(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/il.b J
// 03: ldc2_w 4388781455376
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 119079269691740
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 3
// 14: dup2
// 15: bipush 16
// 17: lshl
// 18: bipush 48
// 1a: lushr
// 1b: l2i
// 1c: istore 4
// 1e: dup2
// 1f: bipush 32
// 21: lshl
// 22: bipush 32
// 24: lushr
// 25: l2i
// 26: istore 5
// 28: pop2
// 29: pop2
// 2a: aload 0
// 2b: sipush 31130
// 2e: ldc2_w 1781610054438541098
// 31: lload 1
// 32: lxor
// 33: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3b: getstatic su/catlean/il.r Lsu/catlean/il;
// 3e: pop
// 3f: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 42: dup
// 43: ifnull 76
// 46: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 49: dup
// 4a: ifnull 76
// 4d: goto 5a
// 50: ldc2_w 7662007809860363332
// 53: lload 1
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: aload 0
// 5b: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 5e: iload 3
// 5f: i2s
// 60: swap
// 61: iload 4
// 63: i2c
// 64: iload 5
// 66: invokevirtual su/catlean/c2.q (SLjava/lang/String;CI)V
// 69: goto 77
// 6c: ldc2_w 7662007809860363332
// 6f: lload 1
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: pop
// 77: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 7a: areturn
}

private static final Unit k(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/il.b J
// 03: ldc2_w 39156223236518
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 29843638085048
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: aload 0
// 11: sipush 31130
// 14: ldc2_w 1781644821880272540
// 17: lload 1
// 18: lxor
// 19: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/il.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 21: getstatic su/catlean/il.r Lsu/catlean/il;
// 24: pop
// 25: getstatic su/catlean/il.Z Lsu/catlean/xw;
// 28: dup
// 29: ifnull 55
// 2c: invokevirtual su/catlean/xw.b ()Lsu/catlean/c2;
// 2f: dup
// 30: ifnull 55
// 33: goto 40
// 36: ldc2_w -3755214962919062030
// 39: lload 1
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: aload 0
// 41: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 44: lload 3
// 45: invokevirtual su/catlean/c2.U (Ljava/lang/String;J)V
// 48: goto 56
// 4b: ldc2_w -3755214962919062030
// 4e: lload 1
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: pop
// 56: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 59: areturn
}

private static final Unit g() {
long var0 = b ^ 6874918096757L;
long var2 = var0 ^ 15849051135411L;
jg var10000 = jg.l;
xw var10001 = Z;
Intrinsics.checkNotNull(Z);
var10000.Q(var2, var10001.b());
Collection var4 = M;
xw var5 = Z;
TypeIntrinsics.asMutableCollection(var4).remove(var5);
Z = null;
return Unit.INSTANCE;
}

private static final Unit L(String var0) {
long var1 = b ^ 138716284355949L;
long var3 = var1 ^ 108697711253611L;
Intrinsics.checkNotNullParameter(var0, b<"k">(31130, 1781720329048697431L ^ var1));
r.H(var0, var3);
return Unit.INSTANCE;
}

static {
long var31 = b ^ 121234865053920L;
long var33 = var31 ^ 80834378667944L;
long var35 = var31 ^ 3484894041006L;
long var37 = var31 ^ 40178600006044L;
long var39 = var31 ^ 1433373869031L;
long var41 = var31 ^ 93511203654310L;
vm.a<"Å">(null, -922746909383639371L, var31);
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[18];
int var27 = 0;
String var26 = "¤Á\u0004UÞã4\u000f ¢\u00926ÒmBW\u00108³\u009eÝû?zå\u0012O\u0001A¡Ìi\u0093\u0010·ãeÀ\u0019m\u0016\u009bÉ?µüª\u0081)*\u0010_å\u0099¨Å%Æè]:ä\u0097¯1Ôó\u0010Y\n\rz\u009fÔ\u009aÇ\u008c\u0019h.O\u0080ë1\u0010Æ?\u009b-Ë\u0007\u0000¯\u0004?®ö\u00adZØ.\u0010R2\u0015O¤\u0002¬\u0018\u0089½Ç\u0081ª\u0016%¬ uÞêÌ\u007f/;\u0095ß#jO°\u0089Ô ÐaÀ\u0084\fÿ\u0007§Ò\u008a P0Óv1\u0010O\u0017\u000f3Áæ¹\u000bxöø/íöÌþ\u0090\u00ad=ÝÝ`êfý\u0000ê´VÇâ¨HòI\u000eï\u0002\u0089ä\u009b\u00144E8Ö\u008bú\u008a´]Ôþ;EÙÿ¨0¡ß$Çfå /2Ý7Õ\u0019¬\u0017/AC(\u0010\u0097\u0018.âg\rÆªÏ½F\u001a7~\u001a¶\u009asÝJ\u0084\u0010´\u0083ð\n<©\u0004\u0000¥í«ö9\u008bG\u0010¯5ùÄ¶6÷n\u0089#B¥\u0014QKã<¥\u0087ãÃIl\u008fcÚÑ ÷õØ\fÏA\u0081\u001aÙ\u0015\u0098o\u0086Ò\u008bx ï÷µ\u0084B#\u000f°:vö\u008eð\u0082!¨ú\u0097Øá«þÇE1\u0083ÿY\u00ad\u009c¦ê\u0010\u008aM\u000e(\u0097Dô~!¹xcò\u001dÏ¸\u0010\u0018497.\u008e\u00940øO$WÌ\u000eîà\u0018\u0083V\u001e=ºd\u008egÏ\u0013úy\"ò\n\u0013f>Mpÿi\u0010h\u0010õSO\u0089Ö\u009b§®v¨%c\u0016'al\u00107cQnH\u008d½\u008fq\u0013o=Ð\u009f\u0086o";
int var28 = "¤Á\u0004UÞã4\u000f ¢\u00926ÒmBW\u00108³\u009eÝû?zå\u0012O\u0001A¡Ìi\u0093\u0010·ãeÀ\u0019m\u0016\u009bÉ?µüª\u0081)*\u0010_å\u0099¨Å%Æè]:ä\u0097¯1Ôó\u0010Y\n\rz\u009fÔ\u009aÇ\u008c\u0019h.O\u0080ë1\u0010Æ?\u009b-Ë\u0007\u0000¯\u0004?®ö\u00adZØ.\u0010R2\u0015O¤\u0002¬\u0018\u0089½Ç\u0081ª\u0016%¬ uÞêÌ\u007f/;\u0095ß#jO°\u0089Ô ÐaÀ\u0084\fÿ\u0007§Ò\u008a P0Óv1\u0010O\u0017\u000f3Áæ¹\u000bxöø/íöÌþ\u0090\u00ad=ÝÝ`êfý\u0000ê´VÇâ¨HòI\u000eï\u0002\u0089ä\u009b\u00144E8Ö\u008bú\u008a´]Ôþ;EÙÿ¨0¡ß$Çfå /2Ý7Õ\u0019¬\u0017/AC(\u0010\u0097\u0018.âg\rÆªÏ½F\u001a7~\u001a¶\u009asÝJ\u0084\u0010´\u0083ð\n<©\u0004\u0000¥í«ö9\u008bG\u0010¯5ùÄ¶6÷n\u0089#B¥\u0014QKã<¥\u0087ãÃIl\u008fcÚÑ ÷õØ\fÏA\u0081\u001aÙ\u0015\u0098o\u0086Ò\u008bx ï÷µ\u0084B#\u000f°:vö\u008eð\u0082!¨ú\u0097Øá«þÇE1\u0083ÿY\u00ad\u009c¦ê\u0010\u008aM\u000e(\u0097Dô~!¹xcò\u001dÏ¸\u0010\u0018497.\u008e\u00940øO$WÌ\u000eîà\u0018\u0083V\u001e=ºd\u008egÏ\u0013úy\"ò\n\u0013f>Mpÿi\u0010h\u0010õSO\u0089Ö\u009b§®v¨%c\u0016'al\u00107cQnH\u008d½\u008fq\u0013o=Ð\u009f\u0086o"
.length();
char var25 = 16;
int var45 = -1;

label74:
while (true) {
String var46 = var26.substring(++var45, var45 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var46.getBytes("ISO-8859-1"));
String var60 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var60;
if ((var45 += var25) >= var28) {
e = var29;
j = new String[18];
y = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[8];
int var14 = 0;
String var15 = "ùh¾}\u001f\u0018E»5\u00ad§\u008d\u000508se\u008e.\u0095\u0013ê`S}cóÁ\u008fÄ\u0090q¼ ¯i¼3vÚ\u009a·¨\u0082Q\u0088ò¸";
int var16 = "ùh¾}\u001f\u0018E»5\u00ad§\u008d\u000508se\u008e.\u0095\u0013ê`S}cóÁ\u008fÄ\u0090q¼ ¯i¼3vÚ\u009a·¨\u0082Q\u0088ò¸".length();
byte var13 = 0;

label56:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var49 = var17;
var10001 = var14++;
long var64 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var68 = -1;

while (true) {
long var19 = var64;
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
long var72 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var68) {
case 0:
var49[var10001] = var72;
if (var13 >= var16) {
n = var17;
q = new Integer[8];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var31 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[3];
int var4 = 0;
String var5 = "ì3î\u0014x_ã\u001c\u0095\u009c\u000fBè\r\u007fÞì3î\u0014x_ã\u001c";
int var6 = "ì3î\u0014x_ã\u001c\u0095\u009c\u000fBè\r\u007fÞì3î\u0014x_ã\u001c".length();
byte var3 = 0;

do {
int var57 = var3;
var3 += 8;
byte[] var7 = var5.substring(var57, var3).getBytes("ISO-8859-1");
var57 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var72 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var71 = -1;
var0[var57] = var72;
} while (var3 < var6);

r = new il(var33);
M = new ArrayList();
w = new fd(_s.OUT_QUINT, var0[0], var37);
F = new fd(_s.OUT_QUINT, var0[2], var37);
S = new fd(_s.OUT_QUINT, var0[1], var37);
i = new fz(b<"k">(22388, 7361833540110901555L ^ var31), r.y(), null, var41, il::c, 4, null);
P = new fz(b<"k">(14537, 5653551806439460486L ^ var31), r.y(), null, var41, il::n, 4, null);
V = new fz(b<"k">(5082, 604366335256733071L ^ var31), r.y(), null, var41, il::x, 4, null);
z = new fz(b<"k">(18839, 4343273684510212051L ^ var31), r.y(), null, var41, il::g, 4, null);
J = new fz(b<"k">(29479, 6996390698594551142L ^ var31), r.y(), null, var41, il::k, 4, null);
jg.l.o(var39);
r.Y(var35);
r.Y(530.0F);
return;
}
break;
default:
var49[var10001] = var72;
if (var13 < var16) {
continue label56;
}

var15 = "É]\r5|Éi \u0015C\u0082&úø\u001a\u0088";
var16 = "É]\r5|Éi \u0015C\u0082&úø\u001a\u0088".length();
var13 = 0;
}

byte var56 = var13;
var13 += 8;
var18 = var15.substring(var56, var13).getBytes("ISO-8859-1");
var49 = var17;
var10001 = var14++;
var64 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var68 = 0;
}
}
}

var25 = var26.charAt(var45);
break;
default:
var29[var27++] = var60;
if ((var45 += var25) < var28) {
var25 = var26.charAt(var45);
continue label74;
}

var26 = "Ûº\u009f\u0018þà0¤m¨2\tâ\u0095w3\u0010H®õr4Ó\u000b¹s\u008aÌ$t\u0015NÝ";
var28 = "Ûº\u009f\u0018þà0¤m¨2\tâ\u0095w3\u0010H®õr4Ó\u000b¹s\u008aÌ$t\u0015NÝ".length();
var25 = 16;
var45 = -1;
}

var46 = var26.substring(++var45, var45 + var25);
var10001 = 0;
}
}
}

public static void B(String var0) {
v = var0;
}

public static String v() {
return v;
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17436;
if (j[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])m.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/il", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
j[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return j[var5];
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
throw new RuntimeException("su/catlean/il" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28934;
if (q[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])y.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
y.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/il", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
q[var3] = var15;
}

return q[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/il" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
