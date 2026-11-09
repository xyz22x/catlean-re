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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class i8 {
@NotNull
private String k;
private float W;
private float N;
private float u;
private float l;
private float Y;
private float a;
@Nullable
private cu f;
private float h;
private float C;
private boolean x;
private boolean A;
private boolean p;
private boolean o;
private static int[] d;
private static final long g = yz.a(-8080473127445216268L, 2374458864467190491L, MethodHandles.lookup().lookupClass()).a(276704876498223L);
private static final String[] R;
private static final String[] T;
private static final Map ab = new HashMap(13);
private static final long[] bb;
private static final Integer[] cb;
private static final Map db;

public i8(@NotNull String name, float x, float y, long a, float width, float height) {
ax = g ^ ax;
Intrinsics.checkNotNullParameter(name, a<"e">(18075, 503792643928470856L ^ ax));
super();
this.k = name;
this.W = xx;
this.N = y;
this.u = width;
this.l = height;
this.Y = this.u;
this.a = this.l;
}

public i8(String var1, float var2, long var3, float var5, float var6, float var7, int var8, DefaultConstructorMarker var9) {
var3 = g ^ var3;
long var10 = var3 ^ 38737844636206L;
if ((var8 & 2) != 0) {
var2 = 50.0F;
}

if ((var8 & 4) != 0) {
var5 = 50.0F;
}

if ((var8 & c<"a">(7347, 5026829101334099312L ^ var3)) != 0) {
var6 = 230.0F;
}

if ((var8 & c<"a">(20764, 1125173080804243678L ^ var3)) != 0) {
var7 = 180.0F;
}

this(var1, var2, var5, var10, var6, var7);
}

@NotNull
public final String M() {
return this.k;
}

public final void w(short a, char a, int a, @NotNull String <set-?>) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ g;
Intrinsics.checkNotNullParameter(<set-?>, a<"e">(24151, 8252333295009438147L ^ var5));
this.k = <set-?>;
}

public final float e() {
return this.W;
}

public final void Y(float <set-?>) {
this.W = <set-?>;
}

public final float T() {
return this.N;
}

public final void q(float <set-?>) {
this.N = <set-?>;
}

public final float y() {
return this.u;
}

public final void v(float <set-?>) {
this.u = <set-?>;
}

public final float j() {
return this.l;
}

public final void m(float <set-?>) {
this.l = <set-?>;
}

@Nullable
public final cu W() {
return this.f;
}

public final void l(@Nullable cu <set-?>) {
this.f = <set-?>;
}

public final void D() {
this.o = true;
}

public abstract void Y(long var1);

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
// 003: ldc2_w 22135879901675
// 006: lxor
// 007: dup2
// 008: bipush 48
// 00a: lushr
// 00b: l2i
// 00c: istore 6
// 00e: dup2
// 00f: bipush 16
// 011: lshl
// 012: bipush 48
// 014: lushr
// 015: l2i
// 016: istore 7
// 018: dup2
// 019: bipush 32
// 01b: lshl
// 01c: bipush 32
// 01e: lushr
// 01f: l2i
// 020: istore 8
// 022: pop2
// 023: dup2
// 024: ldc2_w 55127167163707
// 027: lxor
// 028: lstore 9
// 02a: dup2
// 02b: ldc2_w 117687767941534
// 02e: lxor
// 02f: lstore 11
// 031: dup2
// 032: ldc2_w 2881734234662
// 035: lxor
// 036: lstore 13
// 038: dup2
// 039: ldc2_w 55531218400380
// 03c: lxor
// 03d: lstore 15
// 03f: dup2
// 040: ldc2_w 118149162295806
// 043: lxor
// 044: lstore 17
// 046: pop2
// 047: ldc2_w -9138060439118848720
// 04a: lload 4
// 04c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: aload 1
// 052: sipush 30714
// 055: ldc2_w 5283759779295629298
// 058: lload 4
// 05a: lxor
// 05b: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 063: astore 19
// 065: aload 0
// 066: getfield su/catlean/i8.o Z
// 069: aload 19
// 06b: ifnonnull 310
// 06e: ifeq 098
// 071: goto 07f
// 074: ldc2_w -9152100332011272847
// 077: lload 4
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: aload 0
// 080: lload 17
// 082: invokevirtual su/catlean/i8.Y (J)V
// 085: aload 0
// 086: bipush 0
// 087: putfield su/catlean/i8.o Z
// 08a: goto 098
// 08d: ldc2_w -9152100332011272847
// 090: lload 4
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 1
// 099: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 09c: dup
// 09d: sipush 26438
// 0a0: ldc2_w 5597030702424366927
// 0a3: lload 4
// 0a5: lxor
// 0a6: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ae: aload 0
// 0af: getfield su/catlean/i8.W F
// 0b2: iload 6
// 0b4: i2c
// 0b5: swap
// 0b6: aload 0
// 0b7: getfield su/catlean/i8.N F
// 0ba: aload 0
// 0bb: getfield su/catlean/i8.u F
// 0be: aload 0
// 0bf: getfield su/catlean/i8.l F
// 0c2: ldc 5.0
// 0c4: fconst_1
// 0c5: fconst_0
// 0c6: fconst_1
// 0c7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0ca: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 0cd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0d0: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 0d3: fconst_0
// 0d4: iload 7
// 0d6: i2s
// 0d7: fconst_0
// 0d8: iload 8
// 0da: fconst_0
// 0db: sipush 16974
// 0de: ldc2_w 4099166984881115462
// 0e1: lload 4
// 0e3: lxor
// 0e4: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: aconst_null
// 0ea: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0ed: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0f0: lload 13
// 0f2: aload 1
// 0f3: new su/catlean/o7
// 0f6: dup
// 0f7: aload 0
// 0f8: getfield su/catlean/i8.W F
// 0fb: bipush 2
// 0fc: i2f
// 0fd: fadd
// 0fe: aload 0
// 0ff: getfield su/catlean/i8.N F
// 102: sipush 15787
// 105: ldc2_w 4517065738793217701
// 108: lload 4
// 10a: lxor
// 10b: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: i2f
// 111: fadd
// 112: aload 0
// 113: getfield su/catlean/i8.W F
// 116: aload 0
// 117: getfield su/catlean/i8.u F
// 11a: fadd
// 11b: bipush 2
// 11c: i2f
// 11d: fsub
// 11e: aload 0
// 11f: getfield su/catlean/i8.N F
// 122: aload 0
// 123: getfield su/catlean/i8.l F
// 126: fadd
// 127: invokespecial su/catlean/o7.<init> (FFFF)V
// 12a: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 12d: aload 1
// 12e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 131: dup
// 132: sipush 17936
// 135: ldc2_w 3494035440648830493
// 138: lload 4
// 13a: lxor
// 13b: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 143: aload 0
// 144: getfield su/catlean/i8.W F
// 147: bipush 1
// 148: i2f
// 149: fadd
// 14a: iload 6
// 14c: i2c
// 14d: swap
// 14e: aload 0
// 14f: getfield su/catlean/i8.N F
// 152: sipush 21845
// 155: ldc2_w 9125670009277711960
// 158: lload 4
// 15a: lxor
// 15b: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: i2f
// 161: fadd
// 162: aload 0
// 163: getfield su/catlean/i8.u F
// 166: bipush 2
// 167: i2f
// 168: fsub
// 169: aload 0
// 16a: getfield su/catlean/i8.l F
// 16d: ldc 14.0
// 16f: fsub
// 170: ldc 5.0
// 172: fconst_1
// 173: ldc 0.1
// 175: ldc 0.5
// 177: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 17a: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 17d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 180: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 183: fconst_0
// 184: iload 7
// 186: i2s
// 187: fconst_0
// 188: iload 8
// 18a: fconst_0
// 18b: sipush 5398
// 18e: ldc2_w 192258405694621215
// 191: lload 4
// 193: lxor
// 194: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: aconst_null
// 19a: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 19d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1a0: lload 15
// 1a2: aload 1
// 1a3: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 1a6: aload 1
// 1a7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1aa: dup
// 1ab: sipush 17936
// 1ae: ldc2_w 3494035440648830493
// 1b1: lload 4
// 1b3: lxor
// 1b4: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1bc: aload 0
// 1bd: getfield su/catlean/i8.W F
// 1c0: aload 0
// 1c1: getfield su/catlean/i8.u F
// 1c4: fadd
// 1c5: sipush 21380
// 1c8: ldc2_w 9141316571908604040
// 1cb: lload 4
// 1cd: lxor
// 1ce: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: i2f
// 1d4: fsub
// 1d5: iload 6
// 1d7: i2c
// 1d8: swap
// 1d9: aload 0
// 1da: getfield su/catlean/i8.N F
// 1dd: bipush 3
// 1de: i2f
// 1df: fadd
// 1e0: ldc 8.0
// 1e2: ldc 8.0
// 1e4: ldc 4.0
// 1e6: fconst_0
// 1e7: ldc 0.1
// 1e9: fconst_1
// 1ea: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ed: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 1f0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f3: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1f6: fconst_0
// 1f7: iload 7
// 1f9: i2s
// 1fa: fconst_0
// 1fb: iload 8
// 1fd: fconst_0
// 1fe: sipush 5398
// 201: ldc2_w 192258405694621215
// 204: lload 4
// 206: lxor
// 207: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: aconst_null
// 20d: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 210: aload 1
// 211: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 214: dup
// 215: sipush 17936
// 218: ldc2_w 3494035440648830493
// 21b: lload 4
// 21d: lxor
// 21e: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 226: aload 0
// 227: getfield su/catlean/i8.W F
// 22a: aload 0
// 22b: getfield su/catlean/i8.u F
// 22e: fadd
// 22f: sipush 7605
// 232: ldc2_w 1441409528147398330
// 235: lload 4
// 237: lxor
// 238: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: i2f
// 23e: fsub
// 23f: iload 6
// 241: i2c
// 242: swap
// 243: aload 0
// 244: getfield su/catlean/i8.N F
// 247: bipush 3
// 248: i2f
// 249: fadd
// 24a: ldc 8.0
// 24c: ldc 8.0
// 24e: ldc 4.0
// 250: fconst_0
// 251: ldc 0.1
// 253: fconst_1
// 254: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 257: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 25a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 25d: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 260: fconst_0
// 261: iload 7
// 263: i2s
// 264: fconst_0
// 265: iload 8
// 267: fconst_0
// 268: sipush 5398
// 26b: ldc2_w 192258405694621215
// 26e: lload 4
// 270: lxor
// 271: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: aconst_null
// 277: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 27a: aload 1
// 27b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 27e: dup
// 27f: sipush 17936
// 282: ldc2_w 3494035440648830493
// 285: lload 4
// 287: lxor
// 288: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 290: aload 0
// 291: getfield su/catlean/i8.W F
// 294: aload 0
// 295: getfield su/catlean/i8.u F
// 298: fadd
// 299: sipush 27393
// 29c: ldc2_w 206911917812365316
// 29f: lload 4
// 2a1: lxor
// 2a2: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: i2f
// 2a8: fsub
// 2a9: iload 6
// 2ab: i2c
// 2ac: swap
// 2ad: aload 0
// 2ae: getfield su/catlean/i8.N F
// 2b1: bipush 3
// 2b2: i2f
// 2b3: fadd
// 2b4: ldc 8.0
// 2b6: ldc 8.0
// 2b8: ldc 4.0
// 2ba: fconst_0
// 2bb: ldc 0.1
// 2bd: fconst_1
// 2be: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2c1: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 2c4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2c7: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2ca: fconst_0
// 2cb: iload 7
// 2cd: i2s
// 2ce: fconst_0
// 2cf: iload 8
// 2d1: fconst_0
// 2d2: sipush 5398
// 2d5: ldc2_w 192258405694621215
// 2d8: lload 4
// 2da: lxor
// 2db: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e0: aconst_null
// 2e1: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2e4: lload 9
// 2e6: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2e9: aload 1
// 2ea: aload 0
// 2eb: getfield su/catlean/i8.k Ljava/lang/String;
// 2ee: aload 0
// 2ef: getfield su/catlean/i8.W F
// 2f2: aload 0
// 2f3: getfield su/catlean/i8.u F
// 2f6: bipush 2
// 2f7: i2f
// 2f8: fdiv
// 2f9: fadd
// 2fa: aload 0
// 2fb: getfield su/catlean/i8.N F
// 2fe: ldc 6.0
// 300: fadd
// 301: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 304: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 307: lload 11
// 309: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 30c: aload 0
// 30d: getfield su/catlean/i8.x Z
// 310: aload 19
// 312: lload 4
// 314: lconst_0
// 315: lcmp
// 316: ifle 357
// 319: ifnonnull 355
// 31c: ifeq 351
// 31f: goto 32d
// 322: ldc2_w -9152100332011272847
// 325: lload 4
// 327: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: athrow
// 32d: aload 0
// 32e: iload 2
// 32f: i2f
// 330: aload 0
// 331: getfield su/catlean/i8.h F
// 334: fsub
// 335: putfield su/catlean/i8.W F
// 338: aload 0
// 339: iload 3
// 33a: i2f
// 33b: aload 0
// 33c: getfield su/catlean/i8.C F
// 33f: fsub
// 340: putfield su/catlean/i8.N F
// 343: goto 351
// 346: ldc2_w -9152100332011272847
// 349: lload 4
// 34b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: athrow
// 351: aload 0
// 352: getfield su/catlean/i8.A Z
// 355: aload 19
// 357: ifnonnull 3a2
// 35a: ifeq 38b
// 35d: goto 36b
// 360: ldc2_w -9152100332011272847
// 363: lload 4
// 365: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36a: athrow
// 36b: aload 0
// 36c: aload 0
// 36d: getfield su/catlean/i8.Y F
// 370: iload 2
// 371: i2f
// 372: aload 0
// 373: getfield su/catlean/i8.h F
// 376: fsub
// 377: invokestatic java/lang/Math.max (FF)F
// 37a: putfield su/catlean/i8.u F
// 37d: goto 38b
// 380: ldc2_w -9152100332011272847
// 383: lload 4
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: aload 0
// 38c: aload 19
// 38e: ifnonnull 3a6
// 391: getfield su/catlean/i8.p Z
// 394: goto 3a2
// 397: ldc2_w -9152100332011272847
// 39a: lload 4
// 39c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: athrow
// 3a2: ifeq 3b7
// 3a5: aload 0
// 3a6: aload 0
// 3a7: getfield su/catlean/i8.a F
// 3aa: iload 3
// 3ab: i2f
// 3ac: aload 0
// 3ad: getfield su/catlean/i8.C F
// 3b0: fsub
// 3b1: invokestatic java/lang/Math.max (FF)F
// 3b4: putfield su/catlean/i8.l F
// 3b7: lload 4
// 3b9: lconst_0
// 3ba: lcmp
// 3bb: ifle 3d1
// 3be: aload 19
// 3c0: ifnull 3df
// 3c3: bipush 2
// 3c4: anewarray 419
// 3c7: ldc2_w -9137944270738650350
// 3ca: lload 4
// 3cc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d1: goto 3df
// 3d4: ldc2_w -9152100332011272847
// 3d7: lload 4
// 3d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3de: athrow
// 3df: return
}

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
// 01b: ldc2_w -2746228687453747716
// 01e: lload 7
// 020: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 025: aload 0
// 026: getfield su/catlean/i8.W F
// 029: fstore 10
// 02b: astore 9
// 02d: fload 1
// 02e: aload 0
// 02f: getfield su/catlean/i8.W F
// 032: aload 0
// 033: getfield su/catlean/i8.u F
// 036: fadd
// 037: fcmpg
// 038: aload 9
// 03a: ifnonnull 060
// 03d: ifgt 089
// 040: goto 04e
// 043: ldc2_w -2868427092428874307
// 046: lload 7
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: fload 10
// 050: fload 1
// 051: fcmpg
// 052: goto 060
// 055: ldc2_w -2868427092428874307
// 058: lload 7
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: aload 9
// 062: ifnonnull 086
// 065: ifgt 085
// 068: goto 076
// 06b: ldc2_w -2868427092428874307
// 06e: lload 7
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: bipush 1
// 077: goto 08a
// 07a: ldc2_w -2868427092428874307
// 07d: lload 7
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: bipush 0
// 086: goto 08a
// 089: bipush 0
// 08a: ifeq 154
// 08d: aload 0
// 08e: getfield su/catlean/i8.N F
// 091: fstore 10
// 093: fload 2
// 094: aload 0
// 095: getfield su/catlean/i8.N F
// 098: sipush 28546
// 09b: ldc2_w 6312784366785225802
// 09e: lload 7
// 0a0: lxor
// 0a1: invokedynamic a (IJ)I bsm=su/catlean/i8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: i2f
// 0a7: fadd
// 0a8: fcmpg
// 0a9: aload 9
// 0ab: iload 5
// 0ad: iflt 0d8
// 0b0: ifnonnull 0d6
// 0b3: ifgt 0ff
// 0b6: goto 0c4
// 0b9: ldc2_w -2868427092428874307
// 0bc: lload 7
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: fload 10
// 0c6: fload 2
// 0c7: fcmpg
// 0c8: goto 0d6
// 0cb: ldc2_w -2868427092428874307
// 0ce: lload 7
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: aload 9
// 0d8: ifnonnull 0fc
// 0db: ifgt 0fb
// 0de: goto 0ec
// 0e1: ldc2_w -2868427092428874307
// 0e4: lload 7
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: bipush 1
// 0ed: goto 100
// 0f0: ldc2_w -2868427092428874307
// 0f3: lload 7
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: bipush 0
// 0fc: goto 100
// 0ff: bipush 0
// 100: ifeq 154
// 103: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 106: invokevirtual su/catlean/s1.u ()Lsu/catlean/i8;
// 109: aload 9
// 10b: ifnonnull 155
// 10e: goto 11c
// 111: ldc2_w -2868427092428874307
// 114: lload 7
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: ifnonnull 154
// 11f: goto 12d
// 122: ldc2_w -2868427092428874307
// 125: lload 7
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 0
// 12e: bipush 1
// 12f: putfield su/catlean/i8.x Z
// 132: aload 0
// 133: fload 1
// 134: aload 0
// 135: getfield su/catlean/i8.W F
// 138: fsub
// 139: putfield su/catlean/i8.h F
// 13c: aload 0
// 13d: fload 2
// 13e: aload 0
// 13f: getfield su/catlean/i8.N F
// 142: fsub
// 143: putfield su/catlean/i8.C F
// 146: goto 154
// 149: ldc2_w -2868427092428874307
// 14c: lload 7
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: aload 0
// 155: getfield su/catlean/i8.W F
// 158: fstore 10
// 15a: fload 1
// 15b: aload 0
// 15c: getfield su/catlean/i8.W F
// 15f: aload 0
// 160: getfield su/catlean/i8.u F
// 163: fadd
// 164: fcmpg
// 165: aload 9
// 167: iload 6
// 169: ifle 194
// 16c: ifnonnull 192
// 16f: ifgt 1bb
// 172: goto 180
// 175: ldc2_w -2868427092428874307
// 178: lload 7
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: fload 10
// 182: fload 1
// 183: fcmpg
// 184: goto 192
// 187: ldc2_w -2868427092428874307
// 18a: lload 7
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: aload 9
// 194: ifnonnull 1b8
// 197: ifgt 1b7
// 19a: goto 1a8
// 19d: ldc2_w -2868427092428874307
// 1a0: lload 7
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: bipush 1
// 1a9: goto 1bc
// 1ac: ldc2_w -2868427092428874307
// 1af: lload 7
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: bipush 0
// 1b8: goto 1bc
// 1bb: bipush 0
// 1bc: ifeq 279
// 1bf: aload 0
// 1c0: getfield su/catlean/i8.N F
// 1c3: aload 0
// 1c4: getfield su/catlean/i8.l F
// 1c7: fadd
// 1c8: bipush 5
// 1c9: i2f
// 1ca: fsub
// 1cb: fstore 10
// 1cd: fload 2
// 1ce: aload 0
// 1cf: getfield su/catlean/i8.N F
// 1d2: aload 0
// 1d3: getfield su/catlean/i8.l F
// 1d6: fadd
// 1d7: fcmpg
// 1d8: aload 9
// 1da: iload 5
// 1dc: ifle 207
// 1df: ifnonnull 205
// 1e2: ifgt 22e
// 1e5: goto 1f3
// 1e8: ldc2_w -2868427092428874307
// 1eb: lload 7
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: fload 10
// 1f5: fload 2
// 1f6: fcmpg
// 1f7: goto 205
// 1fa: ldc2_w -2868427092428874307
// 1fd: lload 7
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: aload 9
// 207: ifnonnull 22b
// 20a: ifgt 22a
// 20d: goto 21b
// 210: ldc2_w -2868427092428874307
// 213: lload 7
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: bipush 1
// 21c: goto 22f
// 21f: ldc2_w -2868427092428874307
// 222: lload 7
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: bipush 0
// 22b: goto 22f
// 22e: bipush 0
// 22f: ifeq 279
// 232: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 235: invokevirtual su/catlean/s1.u ()Lsu/catlean/i8;
// 238: aload 9
// 23a: ifnonnull 27a
// 23d: goto 24b
// 240: ldc2_w -2868427092428874307
// 243: lload 7
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: ifnonnull 279
// 24e: goto 25c
// 251: ldc2_w -2868427092428874307
// 254: lload 7
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: aload 0
// 25d: bipush 1
// 25e: putfield su/catlean/i8.p Z
// 261: aload 0
// 262: fload 2
// 263: aload 0
// 264: getfield su/catlean/i8.l F
// 267: fsub
// 268: putfield su/catlean/i8.C F
// 26b: goto 279
// 26e: ldc2_w -2868427092428874307
// 271: lload 7
// 273: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 278: athrow
// 279: aload 0
// 27a: getfield su/catlean/i8.W F
// 27d: aload 0
// 27e: getfield su/catlean/i8.u F
// 281: fadd
// 282: bipush 5
// 283: i2f
// 284: fsub
// 285: fstore 10
// 287: fload 1
// 288: aload 0
// 289: getfield su/catlean/i8.W F
// 28c: aload 0
// 28d: getfield su/catlean/i8.u F
// 290: fadd
// 291: fcmpg
// 292: aload 9
// 294: iload 6
// 296: iflt 2c1
// 299: ifnonnull 2bf
// 29c: ifgt 2e8
// 29f: goto 2ad
// 2a2: ldc2_w -2868427092428874307
// 2a5: lload 7
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: fload 10
// 2af: fload 1
// 2b0: fcmpg
// 2b1: goto 2bf
// 2b4: ldc2_w -2868427092428874307
// 2b7: lload 7
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: aload 9
// 2c1: ifnonnull 2e5
// 2c4: ifgt 2e4
// 2c7: goto 2d5
// 2ca: ldc2_w -2868427092428874307
// 2cd: lload 7
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: bipush 1
// 2d6: goto 2e9
// 2d9: ldc2_w -2868427092428874307
// 2dc: lload 7
// 2de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: athrow
// 2e4: bipush 0
// 2e5: goto 2e9
// 2e8: bipush 0
// 2e9: ifeq 3a1
// 2ec: aload 0
// 2ed: getfield su/catlean/i8.N F
// 2f0: fstore 10
// 2f2: fload 2
// 2f3: aload 0
// 2f4: getfield su/catlean/i8.N F
// 2f7: aload 0
// 2f8: getfield su/catlean/i8.l F
// 2fb: fadd
// 2fc: fcmpg
// 2fd: aload 9
// 2ff: iload 3
// 300: iflt 32b
// 303: ifnonnull 329
// 306: ifgt 352
// 309: goto 317
// 30c: ldc2_w -2868427092428874307
// 30f: lload 7
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: fload 10
// 319: fload 2
// 31a: fcmpg
// 31b: goto 329
// 31e: ldc2_w -2868427092428874307
// 321: lload 7
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: aload 9
// 32b: ifnonnull 34f
// 32e: ifgt 34e
// 331: goto 33f
// 334: ldc2_w -2868427092428874307
// 337: lload 7
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: bipush 1
// 340: goto 353
// 343: ldc2_w -2868427092428874307
// 346: lload 7
// 348: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: athrow
// 34e: bipush 0
// 34f: goto 353
// 352: bipush 0
// 353: ifeq 3a1
// 356: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 359: invokevirtual su/catlean/s1.u ()Lsu/catlean/i8;
// 35c: iload 3
// 35d: iflt 3a2
// 360: aload 9
// 362: ifnonnull 3a2
// 365: goto 373
// 368: ldc2_w -2868427092428874307
// 36b: lload 7
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: ifnonnull 3a1
// 376: goto 384
// 379: ldc2_w -2868427092428874307
// 37c: lload 7
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: aload 0
// 385: bipush 1
// 386: putfield su/catlean/i8.A Z
// 389: aload 0
// 38a: fload 1
// 38b: aload 0
// 38c: getfield su/catlean/i8.u F
// 38f: fsub
// 390: putfield su/catlean/i8.h F
// 393: goto 3a1
// 396: ldc2_w -2868427092428874307
// 399: lload 7
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: aload 0
// 3a2: getfield su/catlean/i8.x Z
// 3a5: aload 9
// 3a7: iload 5
// 3a9: iflt 3d8
// 3ac: ifnonnull 3d2
// 3af: ifne 401
// 3b2: goto 3c0
// 3b5: ldc2_w -2868427092428874307
// 3b8: lload 7
// 3ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bf: athrow
// 3c0: aload 0
// 3c1: getfield su/catlean/i8.A Z
// 3c4: goto 3d2
// 3c7: ldc2_w -2868427092428874307
// 3ca: lload 7
// 3cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d1: athrow
// 3d2: iload 3
// 3d3: iflt 3fe
// 3d6: aload 9
// 3d8: ifnonnull 3fe
// 3db: ifne 401
// 3de: goto 3ec
// 3e1: ldc2_w -2868427092428874307
// 3e4: lload 7
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: aload 0
// 3ed: getfield su/catlean/i8.p Z
// 3f0: goto 3fe
// 3f3: ldc2_w -2868427092428874307
// 3f6: lload 7
// 3f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fd: athrow
// 3fe: ifeq 416
// 401: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 404: aload 0
// 405: invokevirtual su/catlean/s1.a (Lsu/catlean/i8;)V
// 408: goto 416
// 40b: ldc2_w -2868427092428874307
// 40e: lload 7
// 410: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 415: athrow
// 416: iload 3
// 417: iflt 434
// 41a: ldc2_w -2768060796630939900
// 41d: lload 7
// 41f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: ifnull 442
// 427: bipush 3
// 428: newarray 10
// 42a: ldc2_w -2791124986525046089
// 42d: lload 7
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: goto 442
// 437: ldc2_w -2868427092428874307
// 43a: lload 7
// 43c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: athrow
// 442: return
}

public void u(char key, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/i8.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 13901294375738
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 8559669982487816917
// 12: lload 2
// 13: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 6
// 1a: aload 6
// 1c: ifnonnull 49
// 1f: aload 0
// 20: getfield su/catlean/i8.f Lsu/catlean/cu;
// 23: dup
// 24: ifnull 4c
// 27: goto 34
// 2a: ldc2_w 8581658781169758868
// 2d: lload 2
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: iload 1
// 35: lload 4
// 37: invokeinterface su/catlean/cu.Z (CJ)V 4
// 3c: goto 49
// 3f: ldc2_w 8581658781169758868
// 42: lload 2
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: goto 4d
// 4c: pop
// 4d: return
}

public void R(int keyCode, int scanCode, long a, int modifiers) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 3
// 01: dup2
// 02: ldc2_w 109767034341650
// 05: lxor
// 06: dup2
// 07: bipush 48
// 09: lushr
// 0a: l2i
// 0b: istore 6
// 0d: dup2
// 0e: bipush 16
// 10: lshl
// 11: bipush 32
// 13: lushr
// 14: l2i
// 15: istore 7
// 17: dup2
// 18: bipush 48
// 1a: lshl
// 1b: bipush 48
// 1d: lushr
// 1e: l2i
// 1f: istore 8
// 21: pop2
// 22: pop2
// 23: ldc2_w -6368915696035595390
// 26: lload 3
// 27: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: astore 9
// 2e: aload 9
// 30: ifnonnull 62
// 33: aload 0
// 34: getfield su/catlean/i8.f Lsu/catlean/cu;
// 37: dup
// 38: ifnull 65
// 3b: goto 48
// 3e: ldc2_w -6462890153225624637
// 41: lload 3
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: iload 1
// 49: iload 6
// 4b: i2s
// 4c: iload 7
// 4e: iload 8
// 50: invokeinterface su/catlean/cu.W (ISII)V 5
// 55: goto 62
// 58: ldc2_w -6462890153225624637
// 5b: lload 3
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: goto 66
// 65: pop
// 66: return
}

public void a(double mouseX, long a, double mouseY, double amount) {
}

public final void z() {
this.x = false;
this.A = false;
this.p = false;
s1.d.a(null);
}

public static void h(int[] var0) {
d = var0;
}

public static int[] i() {
return d;
}

static {
long var20 = g ^ 51344730835733L;
vm.a<"Å">(null, 8191424974250148441L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "\u008d\u0098Nä\u009f·\u0085s\u008f\u001fE8ÙÛ\u0095\u0005ÀZs{V7¼\u008e¢h~¾Â \u0082T\u0010\u009e2¬uaÏ¥?\u0080\u0081¢OÀ¾\u009e4\u0010ð\u0000ÛúØ\u0003¬3v\u0082AKï\u0096hD";
int var17 = "\u008d\u0098Nä\u009f·\u0085s\u008f\u001fE8ÙÛ\u0095\u0005ÀZs{V7¼\u008e¢h~¾Â \u0082T\u0010\u009e2¬uaÏ¥?\u0080\u0081¢OÀ¾\u009e4\u0010ð\u0000ÛúØ\u0003¬3v\u0082AKï\u0096hD"
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
R = var18;
T = new String[5];
db = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "¹\u0018\u0081ÖX)Íâ#v¤\u0018\u008c¶N\u0087\u0000\u0010B\"\u0000¼cÆ°¿yÆvjÉÆå\u0017¹9\n=,¨\u009c¨1¥\u0005.\u0014\u008ev \u0082´Eñ\tI¤º³B8\u000bF\u000b";
int var5 = "¹\u0018\u0081ÖX)Íâ#v¤\u0018\u008c¶N\u0087\u0000\u0010B\"\u0000¼cÆ°¿yÆvjÉÆå\u0017¹9\n=,¨\u009c¨1¥\u0005.\u0014\u008ev \u0082´Eñ\tI¤º³B8\u000bF\u000b"
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
bb = var6;
cb = new Integer[10];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "é\u009aÿ\u0084-ì\u0098æçK«¼KWË\u0001";
var5 = "é\u009aÿ\u0084-ì\u0098æçK«¼KWË\u0001".length();
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

var15 = "\u0092[¹\u0004¿üüe´¾\u001a\u0095[®¬h K¦GãÝëàçwÃboÊ\u0082¬iz8HümÛ¦¡\u0083\\È\u0088\u001a{Á\u0015";
var17 = "\u0092[¹\u0004¿üüe´¾\u001a\u0095[®¬h K¦GãÝëàçwÃboÊ\u0082¬iz8HümÛ¦¡\u0083\\È\u0088\u001a{Á\u0015".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30721;
if (T[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])ab.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
ab.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/i8", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = R[var5].getBytes("ISO-8859-1");
T[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return T[var5];
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
throw new RuntimeException("su/catlean/i8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21252;
if (cb[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = bb[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])db.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
db.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/i8", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
cb[var3] = var15;
}

return cb[var3];
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
throw new RuntimeException("su/catlean/i8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
