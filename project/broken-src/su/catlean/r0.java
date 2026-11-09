package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class r0 extends ru {
@NotNull
private final a1 S;
@NotNull
private final tw P;
@NotNull
private final fd H;
@NotNull
private final bj g;
@NotNull
private List J;
private float y;
private static final long b = yz.a(-2238804436590267411L, 975171940259192307L, MethodHandles.lookup().lookupClass()).a(262341776574849L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] h;
private static final Integer[] k;
private static final Map l;
private static final long m;

public r0(@NotNull a1 setting, @NotNull tw module, long a) {
a = b ^ a;
long var5 = a ^ 119740717049973L;
long var7 = a ^ 54428687144306L;
long var9 = a ^ 53651658705052L;
long var11 = a ^ 99706152032211L;
long var13 = a ^ 28271660175897L;
long var15 = a ^ 93974224162186L;
Intrinsics.checkNotNullParameter(setting, a<"n">(19100, 1970123964814217659L ^ a));
Intrinsics.checkNotNullParameter(module, a<"n">(1851, 1735493805017963551L ^ a));
super(var13, setting);
this.S = setting;
this.P = module;
this.H = new fd(_s.OUT_QUINT, m, var5);
this.g = new bj(a<"n">(1277, 9144419624598740956L ^ a), b<"j">(2052, 966198199075818560L ^ a), b<"j">(843, 3696107685491558156L ^ a), var7);
this.J = new ArrayList();
if (((h)this.A().F()).x() == w7.BOOLS) {
float var17 = 0.0F;
var17 = 2.0F;
Iterable var19 = this.P.K().c();
boolean var20 = false;
var var22 = new ArrayList();
boolean var23 = false;

for (Object var25 : var19) {
a1 var26 = (a1)var25;
boolean var27 = false;
if (a < 0L) {
return;
}

boolean var10000 = Intrinsics.areEqual(var26.m(), this.A().F());
if (a > 0L) {
if (!var10000) {
continue;
}

var22.add(var25);
}

if (a < 0L) {
break;
}
}

List var18 = var22;
var19 = var18;
var20 = false;
var19 = CollectionsKt.sortedWith(var19, new fm());
var20 = false;

for (Object var34 : var19) {
a1 var35 = (a1)var34;
boolean var36 = false;
String var37 = var35.Q();
float var38 = b8.d(var15).D(var11, var37) + 6.0F;
if (a < 0L) {
break;
}

float var41;
int var39 = (var41 = var17 + var38 - (this.F() - 10.0F)) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
if (a >= 0L) {
if (var39 > 0) {
this.y += 12.0F;
var17 = 2.0F;
}

List var40 = this.J;
float var10004 = this.y;
Intrinsics.checkNotNull(var35, a<"n">(6284, 5484399882649502639L ^ a));
var40.add(new sm(var17, var10004, var38, var35, var9, null, b<"j">(32134, 380507402208065996L ^ a), null));
}

var17 += var38 + 2.0F;
if (a <= 0L) {
break;
}
}
}
}

@NotNull
@Override
public a1 A() {
return this.S;
}

@NotNull
public final tw v() {
return this.P;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
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
// 003: ldc2_w 9915521765924
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 49494862758009
// 00d: lxor
// 00e: lstore 9
// 010: dup2
// 011: ldc2_w 20797107207379
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 11
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 12
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 13
// 030: pop2
// 031: dup2
// 032: ldc2_w 39844814704388
// 035: lxor
// 036: lstore 14
// 038: dup2
// 039: ldc2_w 114903264084220
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 115096991696004
// 043: lxor
// 044: lstore 18
// 046: dup2
// 047: ldc2_w 62123167127486
// 04a: lxor
// 04b: lstore 20
// 04d: dup2
// 04e: ldc2_w 127000398109451
// 051: lxor
// 052: lstore 22
// 054: dup2
// 055: ldc2_w 120682356120742
// 058: lxor
// 059: lstore 24
// 05b: dup2
// 05c: ldc2_w 24369959771588
// 05f: lxor
// 060: lstore 26
// 062: pop2
// 063: ldc2_w 6640577628623117237
// 066: lload 4
// 068: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: aload 1
// 06e: sipush 19489
// 071: ldc2_w 8944571800858231168
// 074: lload 4
// 076: lxor
// 077: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07f: astore 28
// 081: aload 0
// 082: aload 28
// 084: ifnull 3eb
// 087: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 08a: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 08d: checkcast su/catlean/h
// 090: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 093: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 096: if_acmpne 3dc
// 099: goto 0a7
// 09c: ldc2_w 6648970608269357251
// 09f: lload 4
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: lload 16
// 0a9: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0ac: aload 1
// 0ad: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0b0: dup
// 0b1: sipush 10752
// 0b4: ldc2_w 831417387291469731
// 0b7: lload 4
// 0b9: lxor
// 0ba: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c2: aload 0
// 0c3: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 0c6: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0c9: aload 0
// 0ca: invokevirtual su/catlean/r0.x ()F
// 0cd: aload 0
// 0ce: invokevirtual su/catlean/r0.R ()F
// 0d1: fconst_1
// 0d2: fsub
// 0d3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0d6: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 0d9: lload 18
// 0db: dup2_x1
// 0dc: pop2
// 0dd: bipush 0
// 0de: bipush 0
// 0df: sipush 6862
// 0e2: ldc2_w 8175614035207292929
// 0e5: lload 4
// 0e7: lxor
// 0e8: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: aconst_null
// 0ee: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 0f1: aload 0
// 0f2: aload 0
// 0f3: getfield su/catlean/r0.y F
// 0f6: ldc 26.0
// 0f8: fadd
// 0f9: invokevirtual su/catlean/r0.m (F)V
// 0fc: aload 0
// 0fd: getfield su/catlean/r0.J Ljava/util/List;
// 100: checkcast java/lang/Iterable
// 103: astore 29
// 105: bipush 0
// 106: istore 30
// 108: aload 29
// 10a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 10f: astore 31
// 111: aload 31
// 113: invokeinterface java/util/Iterator.hasNext ()Z 1
// 118: ifeq 3cf
// 11b: aload 31
// 11d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 122: astore 32
// 124: aload 32
// 126: checkcast su/catlean/sm
// 129: astore 33
// 12b: bipush 0
// 12c: istore 34
// 12e: aload 28
// 130: lload 4
// 132: lconst_0
// 133: lcmp
// 134: iflt 3d9
// 137: ifnull 3d7
// 13a: aload 33
// 13c: invokevirtual su/catlean/sm.P ()Lsu/catlean/fd;
// 13f: aload 33
// 141: invokevirtual su/catlean/sm.Z ()Lsu/catlean/a1;
// 144: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 147: checkcast java/lang/Boolean
// 14a: invokevirtual java/lang/Boolean.booleanValue ()Z
// 14d: ifeq 16d
// 150: goto 15e
// 153: ldc2_w 6648970608269357251
// 156: lload 4
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: fconst_1
// 15f: goto 16e
// 162: ldc2_w 6648970608269357251
// 165: lload 4
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: fconst_0
// 16e: lload 14
// 170: dup2_x1
// 171: pop2
// 172: invokevirtual su/catlean/fd.B (JF)V
// 175: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 178: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 17b: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 17e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 181: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 184: lload 7
// 186: dup2_x1
// 187: pop2
// 188: aload 33
// 18a: invokevirtual su/catlean/sm.P ()Lsu/catlean/fd;
// 18d: invokevirtual su/catlean/fd.a ()F
// 190: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 193: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 196: astore 35
// 198: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 19b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 19e: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 1a1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1a4: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 1a7: lload 7
// 1a9: dup2_x1
// 1aa: pop2
// 1ab: aload 33
// 1ad: invokevirtual su/catlean/sm.P ()Lsu/catlean/fd;
// 1b0: invokevirtual su/catlean/fd.a ()F
// 1b3: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 1b6: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 1b9: astore 36
// 1bb: aload 1
// 1bc: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1bf: dup
// 1c0: sipush 29402
// 1c3: ldc2_w 6420095890449153917
// 1c6: lload 4
// 1c8: lxor
// 1c9: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d1: aload 0
// 1d2: invokevirtual su/catlean/r0.x ()F
// 1d5: aload 33
// 1d7: invokevirtual su/catlean/sm.H ()F
// 1da: fadd
// 1db: iload 11
// 1dd: i2c
// 1de: swap
// 1df: aload 0
// 1e0: invokevirtual su/catlean/r0.R ()F
// 1e3: aload 33
// 1e5: invokevirtual su/catlean/sm.E ()F
// 1e8: fadd
// 1e9: ldc 13.0
// 1eb: fadd
// 1ec: aload 33
// 1ee: invokevirtual su/catlean/sm.p ()F
// 1f1: ldc 10.0
// 1f3: fconst_2
// 1f4: ldc 2.5
// 1f6: ldc 0.8
// 1f8: fconst_1
// 1f9: aload 35
// 1fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1fe: aload 35
// 200: aload 36
// 202: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 205: aload 36
// 207: fconst_0
// 208: iload 12
// 20a: i2s
// 20b: fconst_0
// 20c: iload 13
// 20e: fconst_0
// 20f: sipush 2347
// 212: ldc2_w 3268917391721831397
// 215: lload 4
// 217: lxor
// 218: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: aconst_null
// 21e: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 221: lload 22
// 223: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 226: aload 1
// 227: aload 33
// 229: invokevirtual su/catlean/sm.Z ()Lsu/catlean/a1;
// 22c: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 22f: aload 0
// 230: invokevirtual su/catlean/r0.x ()F
// 233: aload 33
// 235: invokevirtual su/catlean/sm.H ()F
// 238: fadd
// 239: aload 33
// 23b: invokevirtual su/catlean/sm.p ()F
// 23e: fconst_2
// 23f: fdiv
// 240: fadd
// 241: fconst_1
// 242: fsub
// 243: aload 0
// 244: invokevirtual su/catlean/r0.R ()F
// 247: fconst_1
// 248: fsub
// 249: aload 33
// 24b: invokevirtual su/catlean/sm.E ()F
// 24e: fadd
// 24f: ldc 18.0
// 251: fadd
// 252: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 255: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 258: lload 24
// 25a: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 25d: aload 0
// 25e: invokevirtual su/catlean/r0.x ()F
// 261: aload 33
// 263: invokevirtual su/catlean/sm.H ()F
// 266: fadd
// 267: fconst_1
// 268: fadd
// 269: fstore 37
// 26b: aload 0
// 26c: invokevirtual su/catlean/r0.x ()F
// 26f: aload 33
// 271: invokevirtual su/catlean/sm.H ()F
// 274: fadd
// 275: fconst_1
// 276: fadd
// 277: aload 33
// 279: invokevirtual su/catlean/sm.p ()F
// 27c: fadd
// 27d: fstore 38
// 27f: iload 2
// 280: i2f
// 281: fstore 39
// 283: fload 37
// 285: fload 39
// 287: fcmpg
// 288: aload 28
// 28a: lload 4
// 28c: lconst_0
// 28d: lcmp
// 28e: iflt 2ba
// 291: ifnull 2b8
// 294: ifgt 2e1
// 297: goto 2a5
// 29a: ldc2_w 6648970608269357251
// 29d: lload 4
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: fload 39
// 2a7: fload 38
// 2a9: fcmpg
// 2aa: goto 2b8
// 2ad: ldc2_w 6648970608269357251
// 2b0: lload 4
// 2b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b7: athrow
// 2b8: aload 28
// 2ba: ifnull 2de
// 2bd: ifgt 2dd
// 2c0: goto 2ce
// 2c3: ldc2_w 6648970608269357251
// 2c6: lload 4
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: bipush 1
// 2cf: goto 2e2
// 2d2: ldc2_w 6648970608269357251
// 2d5: lload 4
// 2d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dc: athrow
// 2dd: bipush 0
// 2de: goto 2e2
// 2e1: bipush 0
// 2e2: ifeq 3c8
// 2e5: aload 0
// 2e6: invokevirtual su/catlean/r0.R ()F
// 2e9: fconst_1
// 2ea: fsub
// 2eb: aload 33
// 2ed: invokevirtual su/catlean/sm.E ()F
// 2f0: fadd
// 2f1: ldc 14.0
// 2f3: fadd
// 2f4: fstore 37
// 2f6: aload 0
// 2f7: invokevirtual su/catlean/r0.R ()F
// 2fa: aload 33
// 2fc: invokevirtual su/catlean/sm.E ()F
// 2ff: fadd
// 300: ldc 23.0
// 302: fadd
// 303: fstore 38
// 305: iload 3
// 306: i2f
// 307: fstore 39
// 309: fload 37
// 30b: fload 39
// 30d: fcmpg
// 30e: aload 28
// 310: lload 4
// 312: lconst_0
// 313: lcmp
// 314: ifle 340
// 317: ifnull 33e
// 31a: ifgt 367
// 31d: goto 32b
// 320: ldc2_w 6648970608269357251
// 323: lload 4
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: fload 39
// 32d: fload 38
// 32f: fcmpg
// 330: goto 33e
// 333: ldc2_w 6648970608269357251
// 336: lload 4
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: aload 28
// 340: ifnull 364
// 343: ifgt 363
// 346: goto 354
// 349: ldc2_w 6648970608269357251
// 34c: lload 4
// 34e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: athrow
// 354: bipush 1
// 355: goto 368
// 358: ldc2_w 6648970608269357251
// 35b: lload 4
// 35d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 362: athrow
// 363: bipush 0
// 364: goto 368
// 367: bipush 0
// 368: lload 4
// 36a: lconst_0
// 36b: lcmp
// 36c: iflt 375
// 36f: ifeq 3c8
// 372: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 375: sipush 20130
// 378: ldc2_w 3367528137179192424
// 37b: lload 4
// 37d: lxor
// 37e: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: if_icmpeq 3c8
// 386: goto 394
// 389: ldc2_w 6648970608269357251
// 38c: lload 4
// 38e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 393: athrow
// 394: lload 9
// 396: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 399: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 39c: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 39f: sipush 3214
// 3a2: ldc2_w 7045365922154126918
// 3a5: lload 4
// 3a7: lxor
// 3a8: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ad: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 3b0: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 3b3: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 3b6: bipush 0
// 3b7: invokevirtual su/catlean/fi.A (Z)V
// 3ba: goto 3c8
// 3bd: ldc2_w 6648970608269357251
// 3c0: lload 4
// 3c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c7: athrow
// 3c8: nop
// 3c9: nop
// 3ca: aload 28
// 3cc: ifnonnull 111
// 3cf: nop
// 3d0: lload 4
// 3d2: lconst_0
// 3d3: lcmp
// 3d4: iflt 3d7
// 3d7: aload 28
// 3d9: ifnonnull 564
// 3dc: aload 0
// 3dd: goto 3eb
// 3e0: ldc2_w 6648970608269357251
// 3e3: lload 4
// 3e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: athrow
// 3eb: getfield su/catlean/r0.H Lsu/catlean/fd;
// 3ee: aload 0
// 3ef: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 3f2: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 3f5: checkcast su/catlean/h
// 3f8: invokevirtual su/catlean/h.L ()Z
// 3fb: ifeq 40d
// 3fe: fconst_1
// 3ff: goto 40e
// 402: ldc2_w 6648970608269357251
// 405: lload 4
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: fconst_0
// 40e: lload 14
// 410: dup2_x1
// 411: pop2
// 412: invokevirtual su/catlean/fd.B (JF)V
// 415: aload 0
// 416: getfield su/catlean/r0.P Lsu/catlean/tw;
// 419: aload 0
// 41a: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 41d: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 420: checkcast su/catlean/h
// 423: lload 20
// 425: invokevirtual su/catlean/tw.M (Lsu/catlean/h;J)F
// 428: aload 0
// 429: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 42c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 42f: checkcast su/catlean/h
// 432: invokevirtual su/catlean/h.L ()Z
// 435: ifeq 447
// 438: fconst_1
// 439: goto 448
// 43c: ldc2_w 6648970608269357251
// 43f: lload 4
// 441: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 446: athrow
// 447: fconst_0
// 448: fadd
// 449: fstore 29
// 44b: aload 0
// 44c: getfield su/catlean/r0.H Lsu/catlean/fd;
// 44f: invokevirtual su/catlean/fd.a ()F
// 452: bipush 2
// 453: i2f
// 454: fmul
// 455: fstore 30
// 457: aload 0
// 458: ldc 13.0
// 45a: invokevirtual su/catlean/r0.m (F)V
// 45d: aload 1
// 45e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 461: dup
// 462: sipush 29402
// 465: ldc2_w 6420095890449153917
// 468: lload 4
// 46a: lxor
// 46b: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 473: aload 0
// 474: invokevirtual su/catlean/r0.x ()F
// 477: fload 30
// 479: fsub
// 47a: iload 11
// 47c: i2c
// 47d: swap
// 47e: aload 0
// 47f: invokevirtual su/catlean/r0.R ()F
// 482: fconst_1
// 483: fsub
// 484: aload 0
// 485: invokevirtual su/catlean/r0.F ()F
// 488: ldc 7.0
// 48a: fsub
// 48b: fload 30
// 48d: bipush 2
// 48e: i2f
// 48f: fmul
// 490: fadd
// 491: fload 29
// 493: ldc 3.0
// 495: ldc 2.5
// 497: aload 0
// 498: getfield su/catlean/r0.H Lsu/catlean/fd;
// 49b: invokevirtual su/catlean/fd.a ()F
// 49e: fconst_2
// 49f: fdiv
// 4a0: fconst_1
// 4a1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4a4: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 4a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4aa: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 4ad: fconst_0
// 4ae: iload 12
// 4b0: i2s
// 4b1: fconst_0
// 4b2: iload 13
// 4b4: fconst_0
// 4b5: sipush 26790
// 4b8: ldc2_w 5717815645284891242
// 4bb: lload 4
// 4bd: lxor
// 4be: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: aconst_null
// 4c4: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 4c7: lload 16
// 4c9: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 4cc: aload 1
// 4cd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4d0: dup
// 4d1: sipush 29402
// 4d4: ldc2_w 6420095890449153917
// 4d7: lload 4
// 4d9: lxor
// 4da: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4e2: aload 0
// 4e3: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 4e6: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 4e9: aload 0
// 4ea: invokevirtual su/catlean/r0.x ()F
// 4ed: ldc 3.0
// 4ef: fadd
// 4f0: aload 0
// 4f1: invokevirtual su/catlean/r0.R ()F
// 4f4: fconst_1
// 4f5: fsub
// 4f6: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4f9: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 4fc: lload 18
// 4fe: dup2_x1
// 4ff: pop2
// 500: bipush 0
// 501: bipush 0
// 502: sipush 9588
// 505: ldc2_w 2808210767036495801
// 508: lload 4
// 50a: lxor
// 50b: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: aconst_null
// 511: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 514: aload 0
// 515: getfield su/catlean/r0.g Lsu/catlean/bj;
// 518: aload 1
// 519: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 51c: dup
// 51d: sipush 29402
// 520: ldc2_w 6420095890449153917
// 523: lload 4
// 525: lxor
// 526: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/r0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 52e: checkcast org/joml/Matrix3x2f
// 531: aload 0
// 532: invokevirtual su/catlean/r0.x ()F
// 535: aload 0
// 536: invokevirtual su/catlean/r0.F ()F
// 539: fadd
// 53a: f2d
// 53b: ldc2_w 18.0
// 53e: dsub
// 53f: aload 0
// 540: invokevirtual su/catlean/r0.R ()F
// 543: f2d
// 544: dconst_1
// 545: dsub
// 546: fconst_0
// 547: fconst_0
// 548: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 54b: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 54e: aconst_null
// 54f: fconst_0
// 550: sipush 28999
// 553: ldc2_w 1388180300266824590
// 556: lload 4
// 558: lxor
// 559: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55e: lload 26
// 560: aconst_null
// 561: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 564: return
}

@Override
public void W(long a, double mouseX, double mouseY, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: ldc2_w 8591482653260427430
// 003: lload 1
// 004: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: astore 8
// 00b: aload 0
// 00c: lload 1
// 00d: lconst_0
// 00e: lcmp
// 00f: iflt 01d
// 012: aload 8
// 014: ifnull 1d3
// 017: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 01a: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 01d: checkcast su/catlean/h
// 020: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 023: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 026: if_acmpne 1c5
// 029: goto 036
// 02c: ldc2_w 8599309396483267536
// 02f: lload 1
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 0
// 037: getfield su/catlean/r0.J Ljava/util/List;
// 03a: checkcast java/lang/Iterable
// 03d: astore 9
// 03f: bipush 0
// 040: istore 10
// 042: aload 9
// 044: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 049: astore 11
// 04b: aload 11
// 04d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 052: ifeq 1b9
// 055: aload 11
// 057: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 05c: astore 12
// 05e: aload 12
// 060: checkcast su/catlean/sm
// 063: astore 13
// 065: bipush 0
// 066: istore 14
// 068: aload 0
// 069: invokevirtual su/catlean/r0.x ()F
// 06c: aload 13
// 06e: invokevirtual su/catlean/sm.H ()F
// 071: fadd
// 072: fstore 15
// 074: aload 8
// 076: lload 1
// 077: lconst_0
// 078: lcmp
// 079: ifle 1c2
// 07c: ifnull 1c0
// 07f: dload 3
// 080: aload 0
// 081: invokevirtual su/catlean/r0.x ()F
// 084: aload 13
// 086: invokevirtual su/catlean/sm.H ()F
// 089: fadd
// 08a: aload 13
// 08c: invokevirtual su/catlean/sm.p ()F
// 08f: fadd
// 090: f2d
// 091: dcmpg
// 092: aload 8
// 094: lload 1
// 095: lconst_0
// 096: lcmp
// 097: iflt 0ce
// 09a: ifnull 0cc
// 09d: goto 0aa
// 0a0: ldc2_w 8599309396483267536
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: ifgt 0f3
// 0ad: goto 0ba
// 0b0: ldc2_w 8599309396483267536
// 0b3: lload 1
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: fload 15
// 0bc: f2d
// 0bd: dload 3
// 0be: dcmpg
// 0bf: goto 0cc
// 0c2: ldc2_w 8599309396483267536
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: aload 8
// 0ce: ifnull 0f0
// 0d1: ifgt 0ef
// 0d4: goto 0e1
// 0d7: ldc2_w 8599309396483267536
// 0da: lload 1
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: bipush 1
// 0e2: goto 0f4
// 0e5: ldc2_w 8599309396483267536
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: bipush 0
// 0f0: goto 0f4
// 0f3: bipush 0
// 0f4: ifeq 1b2
// 0f7: aload 0
// 0f8: invokevirtual su/catlean/r0.R ()F
// 0fb: fconst_1
// 0fc: fsub
// 0fd: aload 13
// 0ff: invokevirtual su/catlean/sm.E ()F
// 102: fadd
// 103: ldc 14.0
// 105: fadd
// 106: fstore 15
// 108: dload 5
// 10a: aload 0
// 10b: invokevirtual su/catlean/r0.R ()F
// 10e: aload 13
// 110: invokevirtual su/catlean/sm.E ()F
// 113: fadd
// 114: ldc 23.0
// 116: fadd
// 117: f2d
// 118: dcmpg
// 119: aload 8
// 11b: lload 1
// 11c: lconst_0
// 11d: lcmp
// 11e: iflt 149
// 121: ifnull 147
// 124: ifgt 16e
// 127: goto 134
// 12a: ldc2_w 8599309396483267536
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: fload 15
// 136: f2d
// 137: dload 5
// 139: dcmpg
// 13a: goto 147
// 13d: ldc2_w 8599309396483267536
// 140: lload 1
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: aload 8
// 149: ifnull 16b
// 14c: ifgt 16a
// 14f: goto 15c
// 152: ldc2_w 8599309396483267536
// 155: lload 1
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: bipush 1
// 15d: goto 16f
// 160: ldc2_w 8599309396483267536
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: bipush 0
// 16b: goto 16f
// 16e: bipush 0
// 16f: ifeq 1b2
// 172: aload 13
// 174: invokevirtual su/catlean/sm.Z ()Lsu/catlean/a1;
// 177: aload 13
// 179: invokevirtual su/catlean/sm.Z ()Lsu/catlean/a1;
// 17c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 17f: checkcast java/lang/Boolean
// 182: invokevirtual java/lang/Boolean.booleanValue ()Z
// 185: aload 8
// 187: ifnull 1a8
// 18a: goto 197
// 18d: ldc2_w 8599309396483267536
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: ifne 1ab
// 19a: goto 1a7
// 19d: ldc2_w 8599309396483267536
// 1a0: lload 1
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: bipush 1
// 1a8: goto 1ac
// 1ab: bipush 0
// 1ac: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 1af: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 1b2: nop
// 1b3: nop
// 1b4: aload 8
// 1b6: ifnonnull 04b
// 1b9: nop
// 1ba: lload 1
// 1bb: lconst_0
// 1bc: lcmp
// 1bd: iflt 1c0
// 1c0: aload 8
// 1c2: ifnonnull 2f6
// 1c5: aload 0
// 1c6: goto 1d3
// 1c9: ldc2_w 8599309396483267536
// 1cc: lload 1
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: invokevirtual su/catlean/r0.x ()F
// 1d6: fstore 9
// 1d8: dload 3
// 1d9: aload 0
// 1da: invokevirtual su/catlean/r0.x ()F
// 1dd: aload 0
// 1de: invokevirtual su/catlean/r0.F ()F
// 1e1: sipush 29306
// 1e4: ldc2_w 1051022447606090669
// 1e7: lload 1
// 1e8: lxor
// 1e9: invokedynamic j (IJ)I bsm=su/catlean/r0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: i2f
// 1ef: fsub
// 1f0: fadd
// 1f1: f2d
// 1f2: dcmpg
// 1f3: aload 8
// 1f5: lload 1
// 1f6: lconst_0
// 1f7: lcmp
// 1f8: iflt 222
// 1fb: ifnull 220
// 1fe: ifgt 247
// 201: goto 20e
// 204: ldc2_w 8599309396483267536
// 207: lload 1
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: fload 9
// 210: f2d
// 211: dload 3
// 212: dcmpg
// 213: goto 220
// 216: ldc2_w 8599309396483267536
// 219: lload 1
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 8
// 222: ifnull 244
// 225: ifgt 243
// 228: goto 235
// 22b: ldc2_w 8599309396483267536
// 22e: lload 1
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: bipush 1
// 236: goto 248
// 239: ldc2_w 8599309396483267536
// 23c: lload 1
// 23d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 242: athrow
// 243: bipush 0
// 244: goto 248
// 247: bipush 0
// 248: ifeq 2f6
// 24b: aload 0
// 24c: invokevirtual su/catlean/r0.R ()F
// 24f: fstore 9
// 251: dload 5
// 253: aload 0
// 254: invokevirtual su/catlean/r0.R ()F
// 257: ldc 13.0
// 259: fadd
// 25a: f2d
// 25b: dcmpg
// 25c: aload 8
// 25e: lload 1
// 25f: lconst_0
// 260: lcmp
// 261: iflt 28c
// 264: ifnull 28a
// 267: ifgt 2b1
// 26a: goto 277
// 26d: ldc2_w 8599309396483267536
// 270: lload 1
// 271: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: athrow
// 277: fload 9
// 279: f2d
// 27a: dload 5
// 27c: dcmpg
// 27d: goto 28a
// 280: ldc2_w 8599309396483267536
// 283: lload 1
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: aload 8
// 28c: ifnull 2ae
// 28f: ifgt 2ad
// 292: goto 29f
// 295: ldc2_w 8599309396483267536
// 298: lload 1
// 299: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29e: athrow
// 29f: bipush 1
// 2a0: goto 2b2
// 2a3: ldc2_w 8599309396483267536
// 2a6: lload 1
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: bipush 0
// 2ae: goto 2b2
// 2b1: bipush 0
// 2b2: ifeq 2f6
// 2b5: aload 0
// 2b6: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 2b9: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 2bc: checkcast su/catlean/h
// 2bf: aload 0
// 2c0: invokevirtual su/catlean/r0.A ()Lsu/catlean/a1;
// 2c3: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 2c6: checkcast su/catlean/h
// 2c9: invokevirtual su/catlean/h.L ()Z
// 2cc: aload 8
// 2ce: ifnull 2ef
// 2d1: goto 2de
// 2d4: ldc2_w 8599309396483267536
// 2d7: lload 1
// 2d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: athrow
// 2de: ifne 2f2
// 2e1: goto 2ee
// 2e4: ldc2_w 8599309396483267536
// 2e7: lload 1
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: bipush 1
// 2ef: goto 2f3
// 2f2: bipush 0
// 2f3: invokevirtual su/catlean/h.c (Z)V
// 2f6: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
}

@Override
public void T(char char, long a) {
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
}

static {
long var16 = b ^ 25296162847652L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[7];
int var23 = 0;
String var22 = "ØÝLÊ¸×Ä¨ÑaTnZò\u00999îþç°\u0080\u0087Ì·\u0088ÍBJ\b\u000e£\u001e,tQ\b,\u0005É£él1¤»½ã[\u0085\u001c^)-ÞIB¬o9\u0091\u0010Ø([\u009f\u0096öà#\u008c\u009b\u007fî\u008a)]¹W5\u0014Zz\u0016ô)\fY\u0094Ú¤õFî\u0090g\u0098!\u009b\u0086ÕQèS:ª<u\u001cÆ0ÕTM\u009cKÚ\u001dkªSò\"õóª²tüõ\u0097¤\u001cÆ\"\u0086#\u000bÎ\u000f\u008c}õ\u00adÉËÜæà åäóö#\u0095¨ÓÙA#p\u0010/7\u00ads¨Ë_Å\u008a^dj¹Z\u00adÐ\u00102dNÁ1\u000b{\u0018\u0015zY\u0012´\u001c%ß\u0018\u0010l\u0086ÆÁÜE\u000bª¬\u009e\u0016÷\u009dñ¼\u0010%\u000e,³ª\u000e\u0082";
int var24 = "ØÝLÊ¸×Ä¨ÑaTnZò\u00999îþç°\u0080\u0087Ì·\u0088ÍBJ\b\u000e£\u001e,tQ\b,\u0005É£él1¤»½ã[\u0085\u001c^)-ÞIB¬o9\u0091\u0010Ø([\u009f\u0096öà#\u008c\u009b\u007fî\u008a)]¹W5\u0014Zz\u0016ô)\fY\u0094Ú¤õFî\u0090g\u0098!\u009b\u0086ÕQèS:ª<u\u001cÆ0ÕTM\u009cKÚ\u001dkªSò\"õóª²tüõ\u0097¤\u001cÆ\"\u0086#\u000bÎ\u000f\u008c}õ\u00adÉËÜæà åäóö#\u0095¨ÓÙA#p\u0010/7\u00ads¨Ë_Å\u008a^dj¹Z\u00adÐ\u00102dNÁ1\u000b{\u0018\u0015zY\u0012´\u001c%ß\u0018\u0010l\u0086ÆÁÜE\u000bª¬\u009e\u0016÷\u009dñ¼\u0010%\u000e,³ª\u000e\u0082"
.length();
char var21 = 24;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
d = var25;
e = new String[7];
l = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[11];
int var8 = 0;
String var9 = "¿Î\u001fÚÐ\u0090kãÚmþrs¬-\u0015z\u0087Ü\u001aCFU\u0005yïtsÿ§¿¼Iß\u0013-ÆØÆ\u0080î#\u001fÖ\u001d·\u0080\fêê¹¦\u0093[\u000fç§&ò\u0012£,}Õ\u0090©Yîë¸\u0001ß";
int var10 = "¿Î\u001fÚÐ\u0090kãÚmþrs¬-\u0015z\u0087Ü\u001aCFU\u0005yïtsÿ§¿¼Iß\u0013-ÆØÆ\u0080î#\u001fÖ\u001d·\u0080\fêê¹¦\u0093[\u000fç§&ò\u0012£,}Õ\u0090©Yîë¸\u0001ß"
.length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var33 = var11;
var10001 = var8++;
long var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var52 = -1;

while (true) {
long var13 = var47;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var55 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var52) {
case 0:
var33[var10001] = var55;
if (var7 >= var10) {
h = var11;
k = new Integer[11];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 2533839312688082496L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var50 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var41 = -1;
m = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "ÑP¾.¹|\u0088\u0014RV\u0001\u000bzÄ\u0006d";
var10 = "ÑP¾.¹|\u0088\u0014RV\u0001\u000bzÄ\u0006d".length();
var7 = 0;
}

byte var40 = var7;
var7 += 8;
var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
var33 = var11;
var10001 = var8++;
var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var52 = 0;
}
}
}

var21 = var22.charAt(var29);
break;
default:
var25[var23++] = var43;
if ((var29 += var21) < var24) {
var21 = var22.charAt(var29);
continue label64;
}

var22 = "û\u0001öÂ'\u008fUf=©)N~Æ´Ã\u0010y\u009dòáÇpr\u0013ÙJ\u0003vu\u000b\u0082E";
var24 = "û\u0001öÂ'\u008fUf=©)N~Æ´Ã\u0010y\u009dòáÇpr\u0013ÙJ\u0003vu\u000b\u0082E".length();
var21 = 16;
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4243;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/r0", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/r0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20476;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/r0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
