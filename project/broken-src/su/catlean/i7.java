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

public final class i7 extends i8 {
@NotNull
public static final i7 j;
@NotNull
private static List F;
@Nullable
private static f6 K;
@Nullable
private static f6 V;
@Nullable
private static f6 G;
@Nullable
private static xp b;
@NotNull
private static fd Z;
@NotNull
private static fd m;
@NotNull
private static fd B;
private static boolean X;
private static float t;
@NotNull
private static final fz L;
@NotNull
private static final fz D;
@NotNull
private static final fz n;
@NotNull
private static final fz q;
@NotNull
private static final fz O;
private static final long c = yz.a(-1034828290320947124L, 1722824505300924339L, MethodHandles.lookup().lookupClass()).a(84933603646214L);
private static final String[] e;
private static final String[] i;
private static final Map r = new HashMap(13);
private static final long[] s;
private static final Integer[] v;
private static final Map w;

private i7(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 39304709395665L;
super(b<"f">(30321, 1884055786633211788L ^ var1), 0.0F, var3, 0.0F, 0.0F, 0.0F, d<"b">(20913, 2024656679949910746L ^ var1), null);
}

@NotNull
public final List o() {
return F;
}

public final void x(long a, @NotNull List <set-?>, byte a) {
long var5 = (a << 8 | (long)ax << 56 >>> 56) ^ c;
Intrinsics.checkNotNullParameter(<set-?>, b<"f">(2315, 3485416965656280356L ^ var5));
F = <set-?>;
}

@Nullable
public final f6 Z() {
return K;
}

public final void Z(@Nullable f6 <set-?>) {
K = <set-?>;
}

@Nullable
public final f6 f() {
return G;
}

public final void f(@Nullable f6 <set-?>) {
G = <set-?>;
}

@Nullable
public final xp k() {
return b;
}

public final void Q(@Nullable xp <set-?>) {
b = <set-?>;
}

@NotNull
public final fd c() {
return Z;
}

public final void K(long a, @NotNull fd <set-?>) {
a = c ^ a;
Intrinsics.checkNotNullParameter(<set-?>, b<"f">(10459, 6136893426247939829L ^ a));
Z = <set-?>;
}

@Override
public void Y(long var1) {
long var3 = var1 ^ 117820025401429L;
long var10001 = var1 ^ 138605463114249L;
int var5 = (int)((var1 ^ 138605463114249L) >>> 32);
int var6 = (int)((var1 ^ 138605463114249L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
F.clear();
Iterable var8 = iu.W.p(var3);
boolean var9 = false;

for (Object var11 : var8) {
s4 var12 = (s4)var11;
boolean var13 = false;
F.add(new xp(var12, var5, (short)var6, (char)var7));
if (var1 >= 0L && var1 > 0L) {
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
// 003: ldc2_w 138493012530694
// 006: lxor
// 007: dup2
// 008: bipush 32
// 00a: lushr
// 00b: l2i
// 00c: istore 6
// 00e: dup2
// 00f: bipush 32
// 011: lshl
// 012: bipush 48
// 014: lushr
// 015: l2i
// 016: istore 7
// 018: dup2
// 019: bipush 48
// 01b: lshl
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 8
// 022: pop2
// 023: dup2
// 024: ldc2_w 136208856317167
// 027: lxor
// 028: lstore 9
// 02a: dup2
// 02b: ldc2_w 38443269427772
// 02e: lxor
// 02f: lstore 11
// 031: dup2
// 032: ldc2_w 136208856317167
// 035: lxor
// 036: lstore 13
// 038: dup2
// 039: ldc2_w 129382754651428
// 03c: lxor
// 03d: lstore 15
// 03f: dup2
// 040: ldc2_w 136208856317167
// 043: lxor
// 044: lstore 17
// 046: dup2
// 047: ldc2_w 55302899458674
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 19
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 20
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 21
// 066: pop2
// 067: dup2
// 068: ldc2_w 22135879901675
// 06b: lxor
// 06c: dup2
// 06d: bipush 48
// 06f: lushr
// 070: l2i
// 071: istore 22
// 073: dup2
// 074: bipush 16
// 076: lshl
// 077: bipush 48
// 079: lushr
// 07a: l2i
// 07b: istore 23
// 07d: dup2
// 07e: bipush 32
// 080: lshl
// 081: bipush 32
// 083: lushr
// 084: l2i
// 085: istore 24
// 087: pop2
// 088: dup2
// 089: ldc2_w 70517311181201
// 08c: lxor
// 08d: lstore 25
// 08f: dup2
// 090: ldc2_w 27182768661316
// 093: lxor
// 094: lstore 27
// 096: dup2
// 097: ldc2_w 0
// 09a: lxor
// 09b: lstore 29
// 09d: dup2
// 09e: ldc2_w 97910750751556
// 0a1: lxor
// 0a2: lstore 31
// 0a4: dup2
// 0a5: ldc2_w 55127167163707
// 0a8: lxor
// 0a9: lstore 33
// 0ab: dup2
// 0ac: ldc2_w 2881734234662
// 0af: lxor
// 0b0: lstore 35
// 0b2: dup2
// 0b3: ldc2_w 55531218400380
// 0b6: lxor
// 0b7: lstore 37
// 0b9: dup2
// 0ba: ldc2_w 41763221279864
// 0bd: lxor
// 0be: dup2
// 0bf: bipush 56
// 0c1: lushr
// 0c2: l2i
// 0c3: istore 39
// 0c5: dup2
// 0c6: bipush 8
// 0c8: lshl
// 0c9: bipush 32
// 0cb: lushr
// 0cc: l2i
// 0cd: istore 40
// 0cf: dup2
// 0d0: bipush 40
// 0d2: lshl
// 0d3: bipush 40
// 0d5: lushr
// 0d6: l2i
// 0d7: istore 41
// 0d9: pop2
// 0da: dup2
// 0db: ldc2_w 107679707250070
// 0de: lxor
// 0df: lstore 42
// 0e1: dup2
// 0e2: ldc2_w 53082601043283
// 0e5: lxor
// 0e6: lstore 44
// 0e8: dup2
// 0e9: ldc2_w 136208856317167
// 0ec: lxor
// 0ed: lstore 46
// 0ef: pop2
// 0f0: ldc2_w -9129555738833684124
// 0f3: lload 4
// 0f5: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: aload 1
// 0fb: sipush 31577
// 0fe: ldc2_w 2593479875970692998
// 101: lload 4
// 103: lxor
// 104: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10c: aload 0
// 10d: aload 1
// 10e: iload 2
// 10f: iload 3
// 110: lload 29
// 112: invokespecial su/catlean/i8.p (Lnet/minecraft/class_332;IIJ)V
// 115: astore 63
// 117: getstatic su/catlean/i7.Z Lsu/catlean/fd;
// 11a: fconst_1
// 11b: aload 63
// 11d: ifnonnull 14f
// 120: lload 11
// 122: dup2_x1
// 123: pop2
// 124: invokevirtual su/catlean/fd.B (JF)V
// 127: getstatic su/catlean/i7.m Lsu/catlean/fd;
// 12a: aload 0
// 12b: invokevirtual su/catlean/i7.W ()Lsu/catlean/cu;
// 12e: ifnull 152
// 131: goto 13f
// 134: ldc2_w -9096410834560216300
// 137: lload 4
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: ldc 0.5
// 141: goto 14f
// 144: ldc2_w -9096410834560216300
// 147: lload 4
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: goto 153
// 152: fconst_0
// 153: lload 11
// 155: dup2_x1
// 156: pop2
// 157: invokevirtual su/catlean/fd.B (JF)V
// 15a: getstatic su/catlean/i7.B Lsu/catlean/fd;
// 15d: lload 11
// 15f: getstatic su/catlean/i7.t F
// 162: invokevirtual su/catlean/fd.B (JF)V
// 165: aload 0
// 166: invokevirtual su/catlean/i7.e ()F
// 169: ldc 3.0
// 16b: fadd
// 16c: fstore 64
// 16e: aload 0
// 16f: invokevirtual su/catlean/i7.e ()F
// 172: ldc 72.0
// 174: fadd
// 175: fstore 65
// 177: iload 2
// 178: i2f
// 179: fstore 66
// 17b: fload 64
// 17d: fload 66
// 17f: fcmpg
// 180: aload 63
// 182: lload 4
// 184: lconst_0
// 185: lcmp
// 186: ifle 1b2
// 189: ifnonnull 1b0
// 18c: ifgt 1d9
// 18f: goto 19d
// 192: ldc2_w -9096410834560216300
// 195: lload 4
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: fload 66
// 19f: fload 65
// 1a1: fcmpg
// 1a2: goto 1b0
// 1a5: ldc2_w -9096410834560216300
// 1a8: lload 4
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: aload 63
// 1b2: ifnonnull 1d6
// 1b5: ifgt 1d5
// 1b8: goto 1c6
// 1bb: ldc2_w -9096410834560216300
// 1be: lload 4
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: bipush 1
// 1c7: goto 1da
// 1ca: ldc2_w -9096410834560216300
// 1cd: lload 4
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: bipush 0
// 1d6: goto 1da
// 1d9: bipush 0
// 1da: ifeq 26b
// 1dd: aload 0
// 1de: invokevirtual su/catlean/i7.T ()F
// 1e1: ldc 5.0
// 1e3: fadd
// 1e4: fstore 64
// 1e6: aload 0
// 1e7: invokevirtual su/catlean/i7.T ()F
// 1ea: ldc 13.0
// 1ec: fadd
// 1ed: fstore 65
// 1ef: iload 3
// 1f0: i2f
// 1f1: fstore 66
// 1f3: fload 64
// 1f5: fload 66
// 1f7: fcmpg
// 1f8: aload 63
// 1fa: lload 4
// 1fc: lconst_0
// 1fd: lcmp
// 1fe: ifle 22a
// 201: ifnonnull 228
// 204: ifgt 251
// 207: goto 215
// 20a: ldc2_w -9096410834560216300
// 20d: lload 4
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: fload 66
// 217: fload 65
// 219: fcmpg
// 21a: goto 228
// 21d: ldc2_w -9096410834560216300
// 220: lload 4
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: aload 63
// 22a: ifnonnull 24e
// 22d: ifgt 24d
// 230: goto 23e
// 233: ldc2_w -9096410834560216300
// 236: lload 4
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: bipush 1
// 23f: goto 252
// 242: ldc2_w -9096410834560216300
// 245: lload 4
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: bipush 0
// 24e: goto 252
// 251: bipush 0
// 252: lload 4
// 254: lconst_0
// 255: lcmp
// 256: iflt 25d
// 259: ifeq 26b
// 25c: bipush 1
// 25d: goto 26c
// 260: ldc2_w -9096410834560216300
// 263: lload 4
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: bipush 0
// 26c: putstatic su/catlean/i7.X Z
// 26f: aload 1
// 270: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 273: dup
// 274: sipush 19476
// 277: ldc2_w 8465495142222282949
// 27a: lload 4
// 27c: lxor
// 27d: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 285: aload 0
// 286: invokevirtual su/catlean/i7.e ()F
// 289: ldc 5.0
// 28b: fadd
// 28c: aload 0
// 28d: invokevirtual su/catlean/i7.T ()F
// 290: ldc 3.0
// 292: fadd
// 293: ldc 69.0
// 295: ldc 8.0
// 297: fconst_2
// 298: getstatic su/catlean/i7.X Z
// 29b: ifeq 2ae
// 29e: ldc 2.5
// 2a0: goto 2af
// 2a3: ldc2_w -9096410834560216300
// 2a6: lload 4
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: fconst_2
// 2af: getstatic su/catlean/i7.X Z
// 2b2: ifeq 2c5
// 2b5: ldc 0.1
// 2b7: goto 2c6
// 2ba: ldc2_w -9096410834560216300
// 2bd: lload 4
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: fconst_0
// 2c6: fconst_1
// 2c7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2ca: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 2cd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2d0: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2d3: fconst_0
// 2d4: fconst_0
// 2d5: fconst_0
// 2d6: sipush 8800
// 2d9: ldc2_w 8907877798893380651
// 2dc: lload 4
// 2de: lxor
// 2df: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: aconst_null
// 2e5: astore 48
// 2e7: istore 49
// 2e9: fstore 50
// 2eb: fstore 51
// 2ed: fstore 52
// 2ef: astore 53
// 2f1: astore 54
// 2f3: fstore 55
// 2f5: fstore 56
// 2f7: fstore 57
// 2f9: fstore 58
// 2fb: fstore 59
// 2fd: fstore 60
// 2ff: fstore 61
// 301: fstore 62
// 303: iload 22
// 305: i2c
// 306: fload 62
// 308: fload 61
// 30a: fload 60
// 30c: fload 59
// 30e: fload 58
// 310: fload 57
// 312: fload 56
// 314: fload 55
// 316: aload 54
// 318: aload 53
// 31a: fload 52
// 31c: iload 23
// 31e: i2s
// 31f: fload 51
// 321: iload 24
// 323: fload 50
// 325: iload 49
// 327: aload 48
// 329: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 32c: lload 33
// 32e: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 331: aload 1
// 332: ldc "+"
// 334: aload 0
// 335: invokevirtual su/catlean/i7.e ()F
// 338: ldc 36.0
// 33a: fadd
// 33b: lload 15
// 33d: dup2_x1
// 33e: pop2
// 33f: aload 0
// 340: invokevirtual su/catlean/i7.T ()F
// 343: fconst_1
// 344: fadd
// 345: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 348: dup
// 349: sipush 5648
// 34c: ldc2_w 7733710878004943559
// 34f: lload 4
// 351: lxor
// 352: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 35a: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 35d: aload 1
// 35e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 361: dup
// 362: sipush 29883
// 365: ldc2_w 6271139444516812910
// 368: lload 4
// 36a: lxor
// 36b: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 373: aload 0
// 374: invokevirtual su/catlean/i7.e ()F
// 377: ldc 76.0
// 379: fadd
// 37a: iload 22
// 37c: i2c
// 37d: swap
// 37e: aload 0
// 37f: invokevirtual su/catlean/i7.T ()F
// 382: ldc 6.0
// 384: aload 0
// 385: invokevirtual su/catlean/i7.j ()F
// 388: fconst_1
// 389: fconst_0
// 38a: fconst_0
// 38b: fconst_1
// 38c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 38f: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 392: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 395: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 398: fconst_0
// 399: iload 23
// 39b: i2s
// 39c: fconst_0
// 39d: iload 24
// 39f: fconst_0
// 3a0: sipush 2324
// 3a3: ldc2_w 7176322506902720349
// 3a6: lload 4
// 3a8: lxor
// 3a9: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: aconst_null
// 3af: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 3b2: aconst_null
// 3b3: putstatic su/catlean/i7.G Lsu/catlean/f6;
// 3b6: aconst_null
// 3b7: putstatic su/catlean/i7.K Lsu/catlean/f6;
// 3ba: fconst_0
// 3bb: fstore 64
// 3bd: ldc 17.0
// 3bf: getstatic su/catlean/i7.B Lsu/catlean/fd;
// 3c2: invokevirtual su/catlean/fd.a ()F
// 3c5: fadd
// 3c6: fstore 64
// 3c8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3cb: lload 35
// 3cd: aload 1
// 3ce: new su/catlean/o7
// 3d1: dup
// 3d2: aload 0
// 3d3: invokevirtual su/catlean/i7.e ()F
// 3d6: aload 0
// 3d7: invokevirtual su/catlean/i7.T ()F
// 3da: sipush 11670
// 3dd: ldc2_w 8531732764242570201
// 3e0: lload 4
// 3e2: lxor
// 3e3: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e8: i2f
// 3e9: fadd
// 3ea: aload 0
// 3eb: invokevirtual su/catlean/i7.e ()F
// 3ee: sipush 6762
// 3f1: ldc2_w 3687669565074660390
// 3f4: lload 4
// 3f6: lxor
// 3f7: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fc: i2f
// 3fd: fadd
// 3fe: aload 0
// 3ff: invokevirtual su/catlean/i7.T ()F
// 402: aload 0
// 403: invokevirtual su/catlean/i7.j ()F
// 406: fadd
// 407: fconst_2
// 408: fsub
// 409: invokespecial su/catlean/o7.<init> (FFFF)V
// 40c: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 40f: getstatic su/catlean/i7.F Ljava/util/List;
// 412: checkcast java/lang/Iterable
// 415: astore 65
// 417: bipush 0
// 418: istore 66
// 41a: aload 65
// 41c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 421: astore 67
// 423: aload 67
// 425: invokeinterface java/util/Iterator.hasNext ()Z 1
// 42a: ifeq 498
// 42d: aload 67
// 42f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 434: astore 68
// 436: aload 68
// 438: checkcast su/catlean/xp
// 43b: astore 69
// 43d: bipush 0
// 43e: istore 70
// 440: aload 69
// 442: lload 17
// 444: aload 1
// 445: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 448: invokevirtual su/catlean/i7.e ()F
// 44b: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 44e: invokevirtual su/catlean/i7.T ()F
// 451: fload 64
// 453: fadd
// 454: iload 2
// 455: i2f
// 456: iload 3
// 457: i2f
// 458: invokevirtual su/catlean/xp.o (JLnet/minecraft/class_332;FFFF)V
// 45b: fload 64
// 45d: ldc 29.0
// 45f: fadd
// 460: fstore 64
// 462: nop
// 463: nop
// 464: aload 63
// 466: lload 4
// 468: lconst_0
// 469: lcmp
// 46a: iflt 4a4
// 46d: ifnonnull 4a2
// 470: aload 63
// 472: ifnull 423
// 475: lload 4
// 477: lconst_0
// 478: lcmp
// 479: ifle 464
// 47c: goto 48a
// 47f: ldc2_w -9096410834560216300
// 482: lload 4
// 484: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 489: athrow
// 48a: bipush 4
// 48b: anewarray 815
// 48e: ldc2_w -9137944270738650350
// 491: lload 4
// 493: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 498: nop
// 499: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 49c: lload 37
// 49e: aload 1
// 49f: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 4a2: aload 63
// 4a4: lload 4
// 4a6: lconst_0
// 4a7: lcmp
// 4a8: ifle 6eb
// 4ab: ifnonnull 6e9
// 4ae: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 4b1: ifnull 5fd
// 4b4: goto 4c2
// 4b7: ldc2_w -9096410834560216300
// 4ba: lload 4
// 4bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c1: athrow
// 4c2: fconst_1
// 4c3: getstatic su/catlean/i7.Z Lsu/catlean/fd;
// 4c6: invokevirtual su/catlean/fd.a ()F
// 4c9: fsub
// 4ca: ldc 10.0
// 4cc: fmul
// 4cd: fstore 65
// 4cf: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/i7.g ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 4d4: astore 66
// 4d6: getstatic su/catlean/i7.L Lsu/catlean/fz;
// 4d9: lload 9
// 4db: aload 1
// 4dc: aload 0
// 4dd: invokevirtual su/catlean/i7.e ()F
// 4e0: ldc 84.0
// 4e2: fadd
// 4e3: aload 0
// 4e4: invokevirtual su/catlean/i7.T ()F
// 4e7: ldc 17.0
// 4e9: fadd
// 4ea: fload 65
// 4ec: fadd
// 4ed: iload 2
// 4ee: i2f
// 4ef: iload 3
// 4f0: i2f
// 4f1: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 4f4: getstatic su/catlean/i7.D Lsu/catlean/fz;
// 4f7: lload 9
// 4f9: aload 1
// 4fa: aload 0
// 4fb: invokevirtual su/catlean/i7.e ()F
// 4fe: ldc 84.0
// 500: fadd
// 501: aload 0
// 502: invokevirtual su/catlean/i7.T ()F
// 505: ldc 32.0
// 507: fadd
// 508: fload 65
// 50a: fadd
// 50b: iload 2
// 50c: i2f
// 50d: iload 3
// 50e: i2f
// 50f: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 512: getstatic su/catlean/i7.n Lsu/catlean/fz;
// 515: lload 9
// 517: aload 1
// 518: aload 0
// 519: invokevirtual su/catlean/i7.e ()F
// 51c: ldc 84.0
// 51e: fadd
// 51f: aload 0
// 520: invokevirtual su/catlean/i7.T ()F
// 523: ldc 47.0
// 525: fadd
// 526: fload 65
// 528: fadd
// 529: iload 2
// 52a: i2f
// 52b: iload 3
// 52c: i2f
// 52d: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 530: getstatic su/catlean/i7.q Lsu/catlean/fz;
// 533: lload 9
// 535: aload 1
// 536: aload 0
// 537: invokevirtual su/catlean/i7.e ()F
// 53a: ldc 84.0
// 53c: fadd
// 53d: aload 0
// 53e: invokevirtual su/catlean/i7.T ()F
// 541: ldc 62.0
// 543: fadd
// 544: fload 65
// 546: fadd
// 547: iload 2
// 548: i2f
// 549: iload 3
// 54a: i2f
// 54b: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 54e: getstatic su/catlean/i7.O Lsu/catlean/fz;
// 551: lload 9
// 553: aload 1
// 554: aload 0
// 555: invokevirtual su/catlean/i7.e ()F
// 558: ldc 84.0
// 55a: fadd
// 55b: aload 0
// 55c: invokevirtual su/catlean/i7.T ()F
// 55f: ldc 77.0
// 561: fadd
// 562: fload 65
// 564: fadd
// 565: iload 2
// 566: i2f
// 567: iload 3
// 568: i2f
// 569: invokevirtual su/catlean/fz.o (JLnet/minecraft/class_332;FFFF)V
// 56c: new su/catlean/xt
// 56f: dup
// 570: aload 0
// 571: invokevirtual su/catlean/i7.y ()F
// 574: new su/catlean/ln
// 577: dup
// 578: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 57b: dup
// 57c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 57f: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 582: lload 44
// 584: invokespecial su/catlean/ln.<init> (Ljava/lang/Object;J)V
// 587: checkcast kotlin/reflect/KMutableProperty0
// 58a: new su/catlean/m6
// 58d: dup
// 58e: aload 0
// 58f: lload 42
// 591: invokespecial su/catlean/m6.<init> (Ljava/lang/Object;J)V
// 594: checkcast kotlin/reflect/KMutableProperty0
// 597: lload 25
// 599: dup2_x2
// 59a: pop2
// 59b: invokespecial su/catlean/xt.<init> (FJLkotlin/reflect/KMutableProperty0;Lkotlin/reflect/KMutableProperty0;)V
// 59e: lload 46
// 5a0: aload 1
// 5a1: aload 0
// 5a2: invokevirtual su/catlean/i7.e ()F
// 5a5: ldc 84.0
// 5a7: fadd
// 5a8: aload 0
// 5a9: invokevirtual su/catlean/i7.T ()F
// 5ac: ldc 92.0
// 5ae: fadd
// 5af: fload 65
// 5b1: fadd
// 5b2: iload 2
// 5b3: i2f
// 5b4: iload 3
// 5b5: i2f
// 5b6: invokevirtual su/catlean/xt.o (JLnet/minecraft/class_332;FFFF)V
// 5b9: new su/catlean/fv
// 5bc: dup
// 5bd: aload 66
// 5bf: aload 0
// 5c0: invokevirtual su/catlean/i7.y ()F
// 5c3: iload 6
// 5c5: swap
// 5c6: iload 7
// 5c8: i2s
// 5c9: swap
// 5ca: new su/catlean/pn
// 5cd: dup
// 5ce: iload 39
// 5d0: i2b
// 5d1: iload 40
// 5d3: iload 41
// 5d5: aload 0
// 5d6: invokespecial su/catlean/pn.<init> (BIILjava/lang/Object;)V
// 5d9: checkcast kotlin/reflect/KMutableProperty0
// 5dc: iload 8
// 5de: i2s
// 5df: invokespecial su/catlean/fv.<init> (Lkotlin/jvm/functions/Function0;ISFLkotlin/reflect/KMutableProperty0;S)V
// 5e2: lload 13
// 5e4: aload 1
// 5e5: aload 0
// 5e6: invokevirtual su/catlean/i7.e ()F
// 5e9: ldc 84.0
// 5eb: fadd
// 5ec: aload 0
// 5ed: invokevirtual su/catlean/i7.T ()F
// 5f0: ldc 107.0
// 5f2: fadd
// 5f3: fload 65
// 5f5: fadd
// 5f6: iload 2
// 5f7: i2f
// 5f8: iload 3
// 5f9: i2f
// 5fa: invokevirtual su/catlean/fv.o (JLnet/minecraft/class_332;FFFF)V
// 5fd: aload 0
// 5fe: invokevirtual su/catlean/i7.e ()F
// 601: aload 0
// 602: invokevirtual su/catlean/i7.T ()F
// 605: aload 0
// 606: invokevirtual su/catlean/i7.y ()F
// 609: aload 0
// 60a: invokevirtual su/catlean/i7.j ()F
// 60d: ldc 5.0
// 60f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 612: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 615: dup
// 616: sipush 26888
// 619: ldc2_w 179466872760526298
// 61c: lload 4
// 61e: lxor
// 61f: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 624: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 627: getstatic su/catlean/i7.m Lsu/catlean/fd;
// 62a: invokevirtual su/catlean/fd.a ()F
// 62d: iload 19
// 62f: i2c
// 630: swap
// 631: iload 20
// 633: swap
// 634: iload 21
// 636: i2s
// 637: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 63a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 63d: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 640: dup
// 641: sipush 29128
// 644: ldc2_w 1287806572325207318
// 647: lload 4
// 649: lxor
// 64a: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 652: getstatic su/catlean/i7.m Lsu/catlean/fd;
// 655: invokevirtual su/catlean/fd.a ()F
// 658: iload 19
// 65a: i2c
// 65b: swap
// 65c: iload 20
// 65e: swap
// 65f: iload 21
// 661: i2s
// 662: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 665: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 668: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 66b: dup
// 66c: sipush 29128
// 66f: ldc2_w 1287806572325207318
// 672: lload 4
// 674: lxor
// 675: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 67d: getstatic su/catlean/i7.m Lsu/catlean/fd;
// 680: invokevirtual su/catlean/fd.a ()F
// 683: iload 19
// 685: i2c
// 686: swap
// 687: iload 20
// 689: swap
// 68a: iload 21
// 68c: i2s
// 68d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 690: lload 31
// 692: dup2_x1
// 693: pop2
// 694: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 697: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 69a: dup
// 69b: sipush 29128
// 69e: ldc2_w 1287806572325207318
// 6a1: lload 4
// 6a3: lxor
// 6a4: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6ac: getstatic su/catlean/i7.m Lsu/catlean/fd;
// 6af: invokevirtual su/catlean/fd.a ()F
// 6b2: iload 19
// 6b4: i2c
// 6b5: swap
// 6b6: iload 20
// 6b8: swap
// 6b9: iload 21
// 6bb: i2s
// 6bc: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 6bf: aload 1
// 6c0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6c3: dup
// 6c4: sipush 29883
// 6c7: ldc2_w 6271139444516812910
// 6ca: lload 4
// 6cc: lxor
// 6cd: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6d5: fconst_0
// 6d6: aconst_null
// 6d7: sipush 25349
// 6da: ldc2_w 5163341807877793101
// 6dd: lload 4
// 6df: lxor
// 6e0: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e5: aconst_null
// 6e6: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 6e9: aload 63
// 6eb: ifnonnull 73d
// 6ee: aload 0
// 6ef: invokevirtual su/catlean/i7.W ()Lsu/catlean/cu;
// 6f2: dup
// 6f3: ifnull 740
// 6f6: goto 704
// 6f9: ldc2_w -9096410834560216300
// 6fc: lload 4
// 6fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 703: athrow
// 704: aload 1
// 705: aload 0
// 706: invokevirtual su/catlean/i7.e ()F
// 709: aload 0
// 70a: invokevirtual su/catlean/i7.y ()F
// 70d: fconst_2
// 70e: fdiv
// 70f: fadd
// 710: ldc 60.0
// 712: fsub
// 713: aload 0
// 714: invokevirtual su/catlean/i7.T ()F
// 717: aload 0
// 718: invokevirtual su/catlean/i7.j ()F
// 71b: bipush 2
// 71c: i2f
// 71d: fdiv
// 71e: fadd
// 71f: ldc 35.0
// 721: fsub
// 722: iload 2
// 723: i2f
// 724: lload 27
// 726: dup2_x1
// 727: pop2
// 728: iload 3
// 729: i2f
// 72a: invokeinterface su/catlean/cu.Y (Lnet/minecraft/class_332;FFJFF)V 8
// 72f: goto 73d
// 732: ldc2_w -9096410834560216300
// 735: lload 4
// 737: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73c: athrow
// 73d: goto 741
// 740: pop
// 741: return
}

private final void n(int param1, String param2, short param3, char param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/i7.c J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 89419604727743
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 57267089284669
// 02b: lxor
// 02c: lstore 9
// 02e: dup2
// 02f: ldc2_w 127410613626686
// 032: lxor
// 033: lstore 11
// 035: dup2
// 036: ldc2_w 28999905499854
// 039: lxor
// 03a: lstore 13
// 03c: dup2
// 03d: ldc2_w 4706484534414
// 040: lxor
// 041: dup2
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 15
// 048: dup2
// 049: bipush 32
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 16
// 052: dup2
// 053: bipush 48
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 17
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 76352011376023
// 061: lxor
// 062: lstore 18
// 064: dup2
// 065: ldc2_w 125301752371609
// 068: lxor
// 069: lstore 20
// 06b: dup2
// 06c: ldc2_w 19718593620736
// 06f: lxor
// 070: lstore 22
// 072: pop2
// 073: ldc2_w 5454765106140132250
// 076: lload 5
// 078: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: astore 25
// 07f: lload 7
// 081: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 084: aload 25
// 086: ifnonnull 0b0
// 089: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 08c: ifnull 0fe
// 08f: goto 09d
// 092: ldc2_w 5421617146446469610
// 095: lload 5
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 7
// 09f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a2: goto 0b0
// 0a5: ldc2_w 5421617146446469610
// 0a8: lload 5
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: iload 4
// 0b2: ifle 0e1
// 0b5: aload 25
// 0b7: ifnonnull 0e1
// 0ba: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 0bd: ifnull 0fe
// 0c0: goto 0ce
// 0c3: ldc2_w 5421617146446469610
// 0c6: lload 5
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: lload 7
// 0d0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d3: goto 0e1
// 0d6: ldc2_w 5421617146446469610
// 0d9: lload 5
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 0e4: dup
// 0e5: ifnull 0f9
// 0e8: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 0eb: goto 0fb
// 0ee: ldc2_w 5421617146446469610
// 0f1: lload 5
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: pop
// 0fa: aconst_null
// 0fb: ifnonnull 132
// 0fe: getstatic su/catlean/iu.W Lsu/catlean/iu;
// 101: new su/catlean/s4
// 104: dup
// 105: aload 2
// 106: bipush 0
// 107: bipush 0
// 108: bipush 0
// 109: aconst_null
// 10a: bipush 0
// 10b: bipush 0
// 10c: lload 13
// 10e: sipush 4713
// 111: ldc2_w 4702695432837275353
// 114: lload 5
// 116: lxor
// 117: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: aconst_null
// 11d: invokespecial su/catlean/s4.<init> (Ljava/lang/String;IIILjava/lang/String;IZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 120: astore 24
// 122: iload 15
// 124: iload 16
// 126: i2c
// 127: aload 24
// 129: iload 17
// 12b: i2s
// 12c: invokevirtual su/catlean/iu.D (ICLsu/catlean/s4;S)Z
// 12f: goto 1c2
// 132: getstatic su/catlean/iu.W Lsu/catlean/iu;
// 135: new su/catlean/s4
// 138: dup
// 139: aload 2
// 13a: lload 20
// 13c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13f: invokevirtual net/minecraft/class_746.method_23317 ()D
// 142: d2i
// 143: lload 20
// 145: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 148: invokevirtual net/minecraft/class_746.method_23318 ()D
// 14b: d2i
// 14c: lload 20
// 14e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 151: invokevirtual net/minecraft/class_746.method_23321 ()D
// 154: d2i
// 155: lload 9
// 157: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 15a: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 15d: dup
// 15e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 161: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 164: dup
// 165: sipush 7725
// 168: ldc2_w 4407625554236397579
// 16b: lload 5
// 16d: lxor
// 16e: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 176: getstatic su/catlean/iu.W Lsu/catlean/iu;
// 179: lload 11
// 17b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 17e: invokevirtual net/minecraft/class_638.method_27983 ()Lnet/minecraft/class_5321;
// 181: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 184: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
// 187: dup
// 188: sipush 12215
// 18b: ldc2_w 4500426533153761690
// 18e: lload 5
// 190: lxor
// 191: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 199: lload 18
// 19b: invokevirtual su/catlean/iu.K (Ljava/lang/String;J)I
// 19e: bipush 0
// 19f: lload 13
// 1a1: sipush 32494
// 1a4: ldc2_w 1214097342249431642
// 1a7: lload 5
// 1a9: lxor
// 1aa: invokedynamic b (IJ)I bsm=su/catlean/i7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: aconst_null
// 1b0: invokespecial su/catlean/s4.<init> (Ljava/lang/String;IIILjava/lang/String;IZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1b3: astore 24
// 1b5: iload 15
// 1b7: iload 16
// 1b9: i2c
// 1ba: aload 24
// 1bc: iload 17
// 1be: i2s
// 1bf: invokevirtual su/catlean/iu.D (ICLsu/catlean/s4;S)Z
// 1c2: pop
// 1c3: aload 0
// 1c4: lload 22
// 1c6: invokevirtual su/catlean/i7.Y (J)V
// 1c9: aload 0
// 1ca: aconst_null
// 1cb: invokevirtual su/catlean/i7.l (Lsu/catlean/cu;)V
// 1ce: return
}

@Override
public void c(float mX, float mY, short a, int button, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
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
// 05b: ldc2_w -2773878101604556376
// 05e: lload 7
// 060: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: astore 20
// 067: aload 0
// 068: aload 20
// 06a: ifnonnull 0b9
// 06d: fload 1
// 06e: fload 2
// 06f: iload 11
// 071: i2s
// 072: iload 4
// 074: iload 12
// 076: iload 13
// 078: i2c
// 079: invokespecial su/catlean/i8.c (FFSIIC)V
// 07c: getstatic su/catlean/i7.X Z
// 07f: ifeq 0b8
// 082: goto 090
// 085: ldc2_w -2805892688483300392
// 088: lload 7
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: getstatic su/catlean/fz.I Lsu/catlean/b;
// 093: aconst_null
// 094: invokevirtual su/catlean/b.A (Lsu/catlean/fz;)V
// 097: aload 0
// 098: new su/catlean/rd
// 09b: dup
// 09c: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/i7.v (Ljava/lang/String;)Lkotlin/Unit;, (Ljava/lang/String;)Lkotlin/Unit; ]
// 0a1: lload 16
// 0a3: invokespecial su/catlean/rd.<init> (Lkotlin/jvm/functions/Function1;J)V
// 0a6: checkcast su/catlean/cu
// 0a9: invokevirtual su/catlean/i7.l (Lsu/catlean/cu;)V
// 0ac: return
// 0ad: ldc2_w -2805892688483300392
// 0b0: lload 7
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: aload 20
// 0bb: ifnonnull 11a
// 0be: invokevirtual su/catlean/i7.W ()Lsu/catlean/cu;
// 0c1: ifnull 119
// 0c4: goto 0d2
// 0c7: ldc2_w -2805892688483300392
// 0ca: lload 7
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: aload 0
// 0d3: iload 3
// 0d4: iflt 11a
// 0d7: aload 20
// 0d9: ifnonnull 11a
// 0dc: goto 0ea
// 0df: ldc2_w -2805892688483300392
// 0e2: lload 7
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: invokevirtual su/catlean/i7.W ()Lsu/catlean/cu;
// 0ed: dup
// 0ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f1: lload 14
// 0f3: fload 1
// 0f4: fload 2
// 0f5: iload 4
// 0f7: invokeinterface su/catlean/cu.y (JFFI)Z 6
// 0fc: ifeq 119
// 0ff: goto 10d
// 102: ldc2_w -2805892688483300392
// 105: lload 7
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: return
// 10e: ldc2_w -2805892688483300392
// 111: lload 7
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: aload 0
// 11a: aconst_null
// 11b: invokevirtual su/catlean/i7.l (Lsu/catlean/cu;)V
// 11e: getstatic su/catlean/i7.K Lsu/catlean/f6;
// 121: iload 6
// 123: ifle 166
// 126: aload 20
// 128: ifnonnull 166
// 12b: ifnull 15f
// 12e: goto 13c
// 131: ldc2_w -2805892688483300392
// 134: lload 7
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: getstatic su/catlean/i7.K Lsu/catlean/f6;
// 13f: putstatic su/catlean/i7.V Lsu/catlean/f6;
// 142: getstatic su/catlean/i7.K Lsu/catlean/f6;
// 145: dup
// 146: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 149: fload 1
// 14a: fload 2
// 14b: iload 4
// 14d: lload 18
// 14f: invokevirtual su/catlean/f6.P (FFIJ)Z
// 152: pop
// 153: return
// 154: ldc2_w -2805892688483300392
// 157: lload 7
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aconst_null
// 160: putstatic su/catlean/i7.V Lsu/catlean/f6;
// 163: getstatic su/catlean/i7.G Lsu/catlean/f6;
// 166: ifnull 292
// 169: iload 5
// 16b: iflt 193
// 16e: iload 4
// 170: tableswitch 290 0 1 35 118
// 188: ldc2_w -2805892688483300392
// 18b: lload 7
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: getstatic su/catlean/i7.G Lsu/catlean/f6;
// 196: dup
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 19a: checkcast su/catlean/xp
// 19d: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 1a0: getstatic su/catlean/i7.G Lsu/catlean/f6;
// 1a3: dup
// 1a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1a7: checkcast su/catlean/xp
// 1aa: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 1ad: invokevirtual su/catlean/s4.g ()Z
// 1b0: aload 20
// 1b2: ifnonnull 1d5
// 1b5: goto 1c3
// 1b8: ldc2_w -2805892688483300392
// 1bb: lload 7
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: ifne 1d8
// 1c6: goto 1d4
// 1c9: ldc2_w -2805892688483300392
// 1cc: lload 7
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: bipush 1
// 1d5: goto 1d9
// 1d8: bipush 0
// 1d9: invokevirtual su/catlean/s4.K (Z)V
// 1dc: iload 6
// 1de: ifle 284
// 1e1: aload 20
// 1e3: ifnull 292
// 1e6: getstatic su/catlean/i7.G Lsu/catlean/f6;
// 1e9: dup
// 1ea: sipush 21601
// 1ed: ldc2_w 3053524578500903025
// 1f0: lload 7
// 1f2: lxor
// 1f3: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1fb: checkcast su/catlean/xp
// 1fe: putstatic su/catlean/i7.b Lsu/catlean/xp;
// 201: getstatic su/catlean/i7.L Lsu/catlean/fz;
// 204: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 207: dup
// 208: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 20b: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 20e: invokevirtual su/catlean/s4.e ()Ljava/lang/String;
// 211: lload 9
// 213: dup2_x1
// 214: pop2
// 215: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 218: getstatic su/catlean/i7.D Lsu/catlean/fz;
// 21b: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 21e: dup
// 21f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 222: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 225: invokevirtual su/catlean/s4.h ()Ljava/lang/String;
// 228: lload 9
// 22a: dup2_x1
// 22b: pop2
// 22c: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 22f: getstatic su/catlean/i7.n Lsu/catlean/fz;
// 232: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 235: dup
// 236: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 239: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 23c: invokevirtual su/catlean/s4.I ()I
// 23f: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 242: lload 9
// 244: dup2_x1
// 245: pop2
// 246: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 249: getstatic su/catlean/i7.q Lsu/catlean/fz;
// 24c: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 24f: dup
// 250: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 253: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 256: invokevirtual su/catlean/s4.r ()I
// 259: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 25c: lload 9
// 25e: dup2_x1
// 25f: pop2
// 260: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 263: getstatic su/catlean/i7.O Lsu/catlean/fz;
// 266: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 269: dup
// 26a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 26d: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 270: invokevirtual su/catlean/s4.u ()I
// 273: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 276: lload 9
// 278: dup2_x1
// 279: pop2
// 27a: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 27d: getstatic su/catlean/i7.Z Lsu/catlean/fd;
// 280: fconst_0
// 281: invokevirtual su/catlean/fd.P (F)V
// 284: goto 292
// 287: ldc2_w -2805892688483300392
// 28a: lload 7
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: return
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
// 000: ldc2_w -1000026591606470090
// 003: lload 3
// 004: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 0
// 00a: invokevirtual su/catlean/i7.e ()F
// 00d: fstore 10
// 00f: astore 9
// 011: dload 1
// 012: aload 0
// 013: invokevirtual su/catlean/i7.e ()F
// 016: ldc 76.0
// 018: fadd
// 019: f2d
// 01a: dcmpg
// 01b: aload 9
// 01d: lload 3
// 01e: lconst_0
// 01f: lcmp
// 020: iflt 04a
// 023: ifnonnull 048
// 026: ifgt 06f
// 029: goto 036
// 02c: ldc2_w -967866024694357946
// 02f: lload 3
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: fload 10
// 038: f2d
// 039: dload 1
// 03a: dcmpg
// 03b: goto 048
// 03e: ldc2_w -967866024694357946
// 041: lload 3
// 042: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: athrow
// 048: aload 9
// 04a: ifnonnull 06c
// 04d: ifgt 06b
// 050: goto 05d
// 053: ldc2_w -967866024694357946
// 056: lload 3
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: bipush 1
// 05e: goto 070
// 061: ldc2_w -967866024694357946
// 064: lload 3
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: bipush 0
// 06c: goto 070
// 06f: bipush 0
// 070: ifeq 111
// 073: aload 0
// 074: invokevirtual su/catlean/i7.T ()F
// 077: fstore 10
// 079: dload 5
// 07b: aload 0
// 07c: invokevirtual su/catlean/i7.T ()F
// 07f: aload 0
// 080: invokevirtual su/catlean/i7.j ()F
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
// 099: ldc2_w -967866024694357946
// 09c: lload 3
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: fload 10
// 0a5: f2d
// 0a6: dload 5
// 0a8: dcmpg
// 0a9: goto 0b6
// 0ac: ldc2_w -967866024694357946
// 0af: lload 3
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 9
// 0b8: ifnonnull 0da
// 0bb: ifgt 0d9
// 0be: goto 0cb
// 0c1: ldc2_w -967866024694357946
// 0c4: lload 3
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 1
// 0cc: goto 0de
// 0cf: ldc2_w -967866024694357946
// 0d2: lload 3
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: goto 0de
// 0dd: bipush 0
// 0de: ifeq 111
// 0e1: getstatic su/catlean/i7.t F
// 0e4: dload 7
// 0e6: d2f
// 0e7: ldc 7.0
// 0e9: fmul
// 0ea: fadd
// 0eb: putstatic su/catlean/i7.t F
// 0ee: getstatic su/catlean/i7.t F
// 0f1: getstatic su/catlean/i7.F Ljava/util/List;
// 0f4: invokeinterface java/util/List.size ()I 1
// 0f9: i2f
// 0fa: ldc -29.0
// 0fc: fmul
// 0fd: fconst_0
// 0fe: invokestatic java/lang/Math.clamp (FFF)F
// 101: putstatic su/catlean/i7.t F
// 104: goto 111
// 107: ldc2_w -967866024694357946
// 10a: lload 3
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: return
}

private static final Unit l(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i7.c J
// 03: ldc2_w 136913678957128
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 91137110819994
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 3
// 14: dup2
// 15: bipush 32
// 17: lshl
// 18: bipush 40
// 1a: lushr
// 1b: l2i
// 1c: istore 4
// 1e: dup2
// 1f: bipush 56
// 21: lshl
// 22: bipush 56
// 24: lushr
// 25: l2i
// 26: istore 5
// 28: pop2
// 29: pop2
// 2a: aload 0
// 2b: sipush 23563
// 2e: ldc2_w 5185331866230248910
// 31: lload 1
// 32: lxor
// 33: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3b: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 3e: pop
// 3f: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 42: dup
// 43: ifnull 75
// 46: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 49: dup
// 4a: ifnull 75
// 4d: goto 5a
// 50: ldc2_w -8876527238199437817
// 53: lload 1
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: aload 0
// 5b: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 5e: iload 3
// 5f: swap
// 60: iload 4
// 62: iload 5
// 64: i2b
// 65: invokevirtual su/catlean/s4.z (ILjava/lang/String;IB)V
// 68: goto 76
// 6b: ldc2_w -8876527238199437817
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: pop
// 76: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 79: areturn
}

private static final Unit m(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i7.c J
// 03: ldc2_w 6151203404135
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 58080697658839
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: aload 0
// 11: sipush 23563
// 14: ldc2_w 5185198733000906465
// 17: lload 1
// 18: lxor
// 19: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 21: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 24: pop
// 25: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 28: dup
// 29: ifnull 55
// 2c: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 2f: dup
// 30: ifnull 55
// 33: goto 40
// 36: ldc2_w 5187940733557069096
// 39: lload 1
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: aload 0
// 41: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 44: lload 3
// 45: invokevirtual su/catlean/s4.A (Ljava/lang/String;J)V
// 48: goto 56
// 4b: ldc2_w 5187940733557069096
// 4e: lload 1
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: pop
// 56: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 59: areturn
}

private static final Unit u(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i7.c J
// 03: ldc2_w 61925555483398
// 06: lxor
// 07: lstore 1
// 08: aload 0
// 09: sipush 28139
// 0c: ldc2_w 9122995399036513638
// 0f: lload 1
// 10: lxor
// 11: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 19: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 1c: pop
// 1d: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 20: dup
// 21: ifnull 68
// 24: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 27: dup
// 28: ifnull 68
// 2b: goto 38
// 2e: ldc2_w -3630330838777503927
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 3c: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
// 3f: dup
// 40: ifnull 60
// 43: goto 50
// 46: ldc2_w -3630330838777503927
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: invokevirtual java/lang/Integer.intValue ()I
// 53: goto 62
// 56: ldc2_w -3630330838777503927
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: pop
// 61: bipush 0
// 62: invokevirtual su/catlean/s4.K (I)V
// 65: goto 69
// 68: pop
// 69: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 6c: areturn
}

private static final Unit k(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i7.c J
// 03: ldc2_w 126507142006953
// 06: lxor
// 07: lstore 1
// 08: aload 0
// 09: sipush 23563
// 0c: ldc2_w 5185314776524973871
// 0f: lload 1
// 10: lxor
// 11: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 19: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 1c: pop
// 1d: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 20: dup
// 21: ifnull 68
// 24: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 27: dup
// 28: ifnull 68
// 2b: goto 38
// 2e: ldc2_w -5318414663355259674
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 3c: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
// 3f: dup
// 40: ifnull 60
// 43: goto 50
// 46: ldc2_w -5318414663355259674
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: invokevirtual java/lang/Integer.intValue ()I
// 53: goto 62
// 56: ldc2_w -5318414663355259674
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: pop
// 61: bipush 0
// 62: invokevirtual su/catlean/s4.p (I)V
// 65: goto 69
// 68: pop
// 69: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 6c: areturn
}

private static final Unit Y(fz param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i7.c J
// 03: ldc2_w 118629326492607
// 06: lxor
// 07: lstore 1
// 08: aload 0
// 09: sipush 23563
// 0c: ldc2_w 5185306434782739513
// 0f: lload 1
// 10: lxor
// 11: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/i7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 19: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 1c: pop
// 1d: getstatic su/catlean/i7.b Lsu/catlean/xp;
// 20: dup
// 21: ifnull 68
// 24: invokevirtual su/catlean/xp.s ()Lsu/catlean/s4;
// 27: dup
// 28: ifnull 68
// 2b: goto 38
// 2e: ldc2_w -1358069618888638480
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 3c: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
// 3f: dup
// 40: ifnull 60
// 43: goto 50
// 46: ldc2_w -1358069618888638480
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: invokevirtual java/lang/Integer.intValue ()I
// 53: goto 62
// 56: ldc2_w -1358069618888638480
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: pop
// 61: bipush 0
// 62: invokevirtual su/catlean/s4.B (I)V
// 65: goto 69
// 68: pop
// 69: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 6c: areturn
}

private static final Unit g() {
long var0 = c ^ 77748063047374L;
long var10001 = var0 ^ 59646668613679L;
int var2 = (int)((var0 ^ 59646668613679L) >>> 48);
int var3 = (int)((var0 ^ 59646668613679L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
iu var10000 = iu.W;
xp var7 = b;
Intrinsics.checkNotNull(b);
var10000.W((char)var2, var7.s(), var3, (short)var4);
Collection var5 = F;
xp var6 = b;
TypeIntrinsics.asMutableCollection(var5).remove(var6);
b = null;
return Unit.INSTANCE;
}

private static final Unit v(String var0) {
long var1 = c ^ 8203061206960L;
long var10001 = var1 ^ 83528396232006L;
int var3 = (int)((var1 ^ 83528396232006L) >>> 32);
int var4 = (int)((var1 ^ 83528396232006L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var0, b<"f">(23563, 5185195869000216630L ^ var1));
j.n(var3, var0, (short)var4, (char)var5);
return Unit.INSTANCE;
}

static {
long var31 = c ^ 136874861407508L;
long var33 = var31 ^ 139808758952323L;
long var35 = var31 ^ 8400208066618L;
long var37 = var31 ^ 16085899553465L;
long var39 = var31 ^ 97334421140401L;
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[16];
int var27 = 0;
String var26 = "{\u001f]j\nb\u0014#\u0081\u008e3(\"ÿFK\u0010*ÕÉ7Ø!\u0093D±\u0004íºÃ\u00adÐ\u0019 ï¦\u0094\u0001DM}c®uåßÓ\u0084ø¼\u008eh\u0088ÝµJ$ÀòÂ\u0005² \u008c¢\u008a\u0010'\u0018\u0082\"**)ÐÒ(\u0012Ì\u001aþR\u0091\u0018jæÞH×3ýO½P\u00840ÐL#\u0099\u0084ü\u0092\\Ç\u0099×Æ\u0010\u0019\u007fÀ\u0098\u0088@ÆC<V\u0099Ï\u009bÀ«ï Ì.èM\u0019\u0097\u001a¯Kïà-Zi\u008e3le\u0015¦]ðzW\u0090\u0019JüÓL\u0094Í\u0010Âes8áþéßÙ \u0015\\\túñÂ\u0010\u0011C\u001aE.\u009b\u0083#Î©\nÚ\u008bÊK\u0004\u0010\u0013\u009e\u0001X1eÚ^4\u0081L²÷á\u0011h\u0010¹\u0091\u0003\u008a\f'\u008aÿ/âÝ\u009d\\a}í D\u0013³õâG\u009fµñÐ£Õ6Cñ\r¹¸\u009fõ\n]\u0091ÊYD¸H ´ÃW\u009c\u0082ßJ\u0010òÅ\u009a\u0016_äFi\n±IZ5.\u008c@\u000f\rOëgÍÑÐ\u001fÃviµïR°FoyÏ.§#\u0087\u0084µ®ÿé/Ä&x\u009a\u0094§q4~ó©Ð~8\u0011\u008b\u00837\u009b q\u0015>Ý\u001e¨M\u000f=\u0097.\u0083@À\u0018ý\u0018P!\u000fñB\u0015Ãi\u0097p?îw¾\u0099Ôç>ü£D5\u000bZÑIs\u00adó49Ýn¼Ü¼;wî! ±³ÎÉuðà®*_\u000bÑoü³8DnYÃ\u0017×nåô\u008fÁMoG©£\u0010ñKº°èT¤Bjî\u0015Y\"ò9Ù";
int var28 = "{\u001f]j\nb\u0014#\u0081\u008e3(\"ÿFK\u0010*ÕÉ7Ø!\u0093D±\u0004íºÃ\u00adÐ\u0019 ï¦\u0094\u0001DM}c®uåßÓ\u0084ø¼\u008eh\u0088ÝµJ$ÀòÂ\u0005² \u008c¢\u008a\u0010'\u0018\u0082\"**)ÐÒ(\u0012Ì\u001aþR\u0091\u0018jæÞH×3ýO½P\u00840ÐL#\u0099\u0084ü\u0092\\Ç\u0099×Æ\u0010\u0019\u007fÀ\u0098\u0088@ÆC<V\u0099Ï\u009bÀ«ï Ì.èM\u0019\u0097\u001a¯Kïà-Zi\u008e3le\u0015¦]ðzW\u0090\u0019JüÓL\u0094Í\u0010Âes8áþéßÙ \u0015\\\túñÂ\u0010\u0011C\u001aE.\u009b\u0083#Î©\nÚ\u008bÊK\u0004\u0010\u0013\u009e\u0001X1eÚ^4\u0081L²÷á\u0011h\u0010¹\u0091\u0003\u008a\f'\u008aÿ/âÝ\u009d\\a}í D\u0013³õâG\u009fµñÐ£Õ6Cñ\r¹¸\u009fõ\n]\u0091ÊYD¸H ´ÃW\u009c\u0082ßJ\u0010òÅ\u009a\u0016_äFi\n±IZ5.\u008c@\u000f\rOëgÍÑÐ\u001fÃviµïR°FoyÏ.§#\u0087\u0084µ®ÿé/Ä&x\u009a\u0094§q4~ó©Ð~8\u0011\u008b\u00837\u009b q\u0015>Ý\u001e¨M\u000f=\u0097.\u0083@À\u0018ý\u0018P!\u000fñB\u0015Ãi\u0097p?îw¾\u0099Ôç>ü£D5\u000bZÑIs\u00adó49Ýn¼Ü¼;wî! ±³ÎÉuðà®*_\u000bÑoü³8DnYÃ\u0017×nåô\u008fÁMoG©£\u0010ñKº°èT¤Bjî\u0015Y\"ò9Ù"
.length();
char var25 = 16;
int var43 = -1;

label74:
while (true) {
String var44 = var26.substring(++var43, var43 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var44.getBytes("ISO-8859-1"));
String var58 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var58;
if ((var43 += var25) >= var28) {
e = var29;
i = new String[16];
w = new HashMap(13);
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
String var15 = "\u008f\u0087N.¬8q>ú£f\u008e?\u0093\u0018\u008cVüÒ>\u0011p§gjÞ\u000f@\u001bç\u009c\u0093\u0098³7Û´J\u0080¦DÊ;+E?ùÆ";
int var16 = "\u008f\u0087N.¬8q>ú£f\u008e?\u0093\u0018\u008cVüÒ>\u0011p§gjÞ\u000f@\u001bç\u009c\u0093\u0098³7Û´J\u0080¦DÊ;+E?ùÆ".length();
byte var13 = 0;

label56:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var47 = var17;
var10001 = var14++;
long var62 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var66 = -1;

while (true) {
long var19 = var62;
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
long var70 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var66) {
case 0:
var47[var10001] = var70;
if (var13 >= var16) {
s = var17;
v = new Integer[8];
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
String var5 = "q\u0098ß\u009fÍ\u0000d\u001a¥û^\u0002)WïÝ¥û^\u0002)WïÝ";
int var6 = "q\u0098ß\u009fÍ\u0000d\u001a¥û^\u0002)WïÝ¥û^\u0002)WïÝ".length();
byte var3 = 0;

do {
int var55 = var3;
var3 += 8;
byte[] var7 = var5.substring(var55, var3).getBytes("ISO-8859-1");
var55 = var4++;
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
var70 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var69 = -1;
var0[var55] = var70;
} while (var3 < var6);

j = new i7(var35);
F = new ArrayList();
Z = new fd(_s.OUT_QUINT, var0[1], var33);
m = new fd(_s.OUT_QUINT, var0[2], var33);
B = new fd(_s.OUT_QUINT, var0[0], var33);
L = new fz(b<"f">(12913, 5533000625727728874L ^ var31), j.y(), null, var37, i7::l, 4, null);
D = new fz(b<"f">(18235, 5737671511786297773L ^ var31), j.y(), null, var37, i7::m, 4, null);
n = new fz("X", j.y(), null, var37, i7::u, 4, null);
q = new fz("Y", j.y(), null, var37, i7::k, 4, null);
O = new fz("Z", j.y(), null, var37, i7::Y, 4, null);
j.Y(var39);
j.Y(290.0F);
return;
}
break;
default:
var47[var10001] = var70;
if (var13 < var16) {
continue label56;
}

var15 = "3\u0012+j\u0003Y~\u0088\u008eÊï\u0090[çó©";
var16 = "3\u0012+j\u0003Y~\u0088\u008eÊï\u0090[çó©".length();
var13 = 0;
}

byte var54 = var13;
var13 += 8;
var18 = var15.substring(var54, var13).getBytes("ISO-8859-1");
var47 = var17;
var10001 = var14++;
var62 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var66 = 0;
}
}
}

var25 = var26.charAt(var43);
break;
default:
var29[var27++] = var58;
if ((var43 += var25) < var28) {
var25 = var26.charAt(var43);
continue label74;
}

var26 = "ûNDW`G\u0094½Yå¶ëµ\u008e®\u0018\u0010T-\u0082Ú.Ë\n©\t\u000emFjÌ÷\u0000";
var28 = "ûNDW`G\u0094½Yå¶ëµ\u008e®\u0018\u0010T-\u0082Ú.Ë\n©\t\u000emFjÌ÷\u0000".length();
var25 = 16;
var43 = -1;
}

var44 = var26.substring(++var43, var43 + var25);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3295;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])r.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
r.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/i7", var10);
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
i[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return i[var5];
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
throw new RuntimeException("su/catlean/i7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17986;
if (v[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = s[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])w.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
w.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/i7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
v[var3] = var15;
}

return v[var3];
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
throw new RuntimeException("su/catlean/i7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
