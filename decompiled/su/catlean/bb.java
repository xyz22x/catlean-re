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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bb {
private final float V;
private final float G;
private final boolean Y;
private final boolean f;
private final boolean D;
private final boolean v;
private final boolean l;
private final boolean B;
private final boolean U;
private final boolean C;
private static String H;
private static final long a = yz.a(-3856362123290917829L, -8635259768604139610L, MethodHandles.lookup().lookupClass()).a(264089995816117L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

public bb(float yaw, float pitch, boolean forward, boolean back, boolean left, boolean right, boolean sneak, boolean jump, boolean use, boolean attack) {
this.V = yaw;
this.G = pitch;
this.Y = forward;
this.f = back;
this.D = left;
this.v = right;
this.l = sneak;
this.B = jump;
this.U = use;
this.C = attack;
}

public final float A() {
return this.V;
}

public final float i() {
return this.G;
}

public final boolean P() {
return this.Y;
}

public final boolean C() {
return this.f;
}

public final boolean N() {
return this.D;
}

public final boolean F() {
return this.v;
}

public final boolean T() {
return this.l;
}

public final boolean R() {
return this.B;
}

public final boolean t() {
return this.U;
}

public final boolean B() {
return this.C;
}

public final float Q() {
return this.V;
}

public final float q() {
return this.G;
}

public final boolean Y() {
return this.Y;
}

public final boolean c() {
return this.f;
}

public final boolean r() {
return this.D;
}

public final boolean d() {
return this.v;
}

public final boolean z() {
return this.l;
}

public final boolean u() {
return this.B;
}

public final boolean h() {
return this.U;
}

public final boolean E() {
return this.C;
}

@NotNull
public final bb O(float yaw, float pitch, boolean forward, boolean back, boolean left, boolean right, boolean sneak, boolean jump, boolean use, boolean attack) {
return new bb(yaw, pitch, forward, back, left, right, sneak, jump, use, attack);
}

public static bb o(
bb param0,
long param1,
float param3,
float param4,
boolean param5,
boolean param6,
boolean param7,
boolean param8,
boolean param9,
boolean param10,
boolean param11,
boolean param12,
int param13,
Object param14
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bb.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w -1937730532187199880
// 009: lload 1
// 00a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 15
// 011: iload 13
// 013: bipush 1
// 014: iand
// 015: aload 15
// 017: ifnonnull 033
// 01a: ifeq 02f
// 01d: goto 02a
// 020: ldc2_w -1972174159897046889
// 023: lload 1
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: aload 0
// 02b: getfield su/catlean/bb.V F
// 02e: fstore 3
// 02f: iload 13
// 031: bipush 2
// 032: iand
// 033: aload 15
// 035: lload 1
// 036: lconst_0
// 037: lcmp
// 038: ifle 05a
// 03b: ifnonnull 058
// 03e: ifeq 054
// 041: goto 04e
// 044: ldc2_w -1972174159897046889
// 047: lload 1
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: aload 0
// 04f: getfield su/catlean/bb.G F
// 052: fstore 4
// 054: iload 13
// 056: bipush 4
// 057: iand
// 058: aload 15
// 05a: lload 1
// 05b: lconst_0
// 05c: lcmp
// 05d: iflt 08b
// 060: ifnonnull 089
// 063: ifeq 079
// 066: goto 073
// 069: ldc2_w -1972174159897046889
// 06c: lload 1
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: aload 0
// 074: getfield su/catlean/bb.Y Z
// 077: istore 5
// 079: iload 13
// 07b: sipush 10795
// 07e: ldc2_w 8318299338354364455
// 081: lload 1
// 082: lxor
// 083: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: iand
// 089: aload 15
// 08b: lload 1
// 08c: lconst_0
// 08d: lcmp
// 08e: ifle 0bc
// 091: ifnonnull 0ba
// 094: ifeq 0aa
// 097: goto 0a4
// 09a: ldc2_w -1972174159897046889
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: aload 0
// 0a5: getfield su/catlean/bb.f Z
// 0a8: istore 6
// 0aa: iload 13
// 0ac: sipush 20697
// 0af: ldc2_w 9099832512392227538
// 0b2: lload 1
// 0b3: lxor
// 0b4: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: iand
// 0ba: aload 15
// 0bc: lload 1
// 0bd: lconst_0
// 0be: lcmp
// 0bf: iflt 0ed
// 0c2: ifnonnull 0eb
// 0c5: ifeq 0db
// 0c8: goto 0d5
// 0cb: ldc2_w -1972174159897046889
// 0ce: lload 1
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: aload 0
// 0d6: getfield su/catlean/bb.D Z
// 0d9: istore 7
// 0db: iload 13
// 0dd: sipush 710
// 0e0: ldc2_w 3110999847516256460
// 0e3: lload 1
// 0e4: lxor
// 0e5: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: iand
// 0eb: aload 15
// 0ed: lload 1
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: ifle 11e
// 0f3: ifnonnull 11c
// 0f6: ifeq 10c
// 0f9: goto 106
// 0fc: ldc2_w -1972174159897046889
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 0
// 107: getfield su/catlean/bb.v Z
// 10a: istore 8
// 10c: iload 13
// 10e: sipush 27513
// 111: ldc2_w 5561985187767931256
// 114: lload 1
// 115: lxor
// 116: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: iand
// 11c: aload 15
// 11e: lload 1
// 11f: lconst_0
// 120: lcmp
// 121: iflt 14f
// 124: ifnonnull 14d
// 127: ifeq 13d
// 12a: goto 137
// 12d: ldc2_w -1972174159897046889
// 130: lload 1
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: aload 0
// 138: getfield su/catlean/bb.l Z
// 13b: istore 9
// 13d: iload 13
// 13f: sipush 8722
// 142: ldc2_w 7663629036284811293
// 145: lload 1
// 146: lxor
// 147: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: iand
// 14d: aload 15
// 14f: lload 1
// 150: lconst_0
// 151: lcmp
// 152: ifle 180
// 155: ifnonnull 17e
// 158: ifeq 16e
// 15b: goto 168
// 15e: ldc2_w -1972174159897046889
// 161: lload 1
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: aload 0
// 169: getfield su/catlean/bb.B Z
// 16c: istore 10
// 16e: iload 13
// 170: sipush 19656
// 173: ldc2_w 271346192209180353
// 176: lload 1
// 177: lxor
// 178: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: iand
// 17e: aload 15
// 180: lload 1
// 181: lconst_0
// 182: lcmp
// 183: ifle 1b1
// 186: ifnonnull 1af
// 189: ifeq 19f
// 18c: goto 199
// 18f: ldc2_w -1972174159897046889
// 192: lload 1
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: getfield su/catlean/bb.U Z
// 19d: istore 11
// 19f: iload 13
// 1a1: sipush 26598
// 1a4: ldc2_w 1008111156198301163
// 1a7: lload 1
// 1a8: lxor
// 1a9: invokedynamic x (IJ)I bsm=su/catlean/bb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: iand
// 1af: aload 15
// 1b1: ifnonnull 1d5
// 1b4: ifeq 1d7
// 1b7: goto 1c4
// 1ba: ldc2_w -1972174159897046889
// 1bd: lload 1
// 1be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: athrow
// 1c4: aload 0
// 1c5: getfield su/catlean/bb.C Z
// 1c8: goto 1d5
// 1cb: ldc2_w -1972174159897046889
// 1ce: lload 1
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: istore 12
// 1d7: aload 0
// 1d8: fload 3
// 1d9: fload 4
// 1db: iload 5
// 1dd: iload 6
// 1df: iload 7
// 1e1: iload 8
// 1e3: iload 9
// 1e5: iload 10
// 1e7: iload 11
// 1e9: iload 12
// 1eb: invokevirtual su/catlean/bb.O (FFZZZZZZZZ)Lsu/catlean/bb;
// 1ee: lload 1
// 1ef: lconst_0
// 1f0: lcmp
// 1f1: iflt 20b
// 1f4: ldc2_w -1966796498706564571
// 1f7: lload 1
// 1f8: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: ifnull 218
// 200: ldc "WVKx7b"
// 202: ldc2_w -1977278332407438865
// 205: lload 1
// 206: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: goto 218
// 20e: ldc2_w -1972174159897046889
// 211: lload 1
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 113627369984495L;
boolean var3 = this.C;
boolean var4 = this.U;
boolean var5 = this.B;
boolean var6 = this.l;
boolean var7 = this.v;
boolean var8 = this.D;
boolean var9 = this.f;
boolean var10 = this.Y;
float var11 = this.G;
float var12 = this.V;
return a<"e">(30029, 7256441790919203677L ^ var1)
+ var12
+ a<"e">(28451, 8670314502987792696L ^ var1)
+ var11
+ a<"e">(12749, 2244623607039860693L ^ var1)
+ var10
+ a<"e">(3520, 3757234332138644446L ^ var1)
+ var9
+ a<"e">(16650, 2501756083273363227L ^ var1)
+ var8
+ a<"e">(7451, 7012035245821178628L ^ var1)
+ var7
+ a<"e">(13765, 1120262549986647001L ^ var1)
+ var6
+ a<"e">(15921, 1555855691215999016L ^ var1)
+ var5
+ a<"e">(19858, 4547052812428829583L ^ var1)
+ var4
+ a<"e">(13100, 6933210501221391670L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 28121042126070L;
int var4 = Float.hashCode(this.V);
String var10000 = vm.a<"Å">(1208626736429159334L, var1);
var4 = var4 * b<"x">(25552, 7513666727033515008L ^ var1) + Float.hashCode(this.G);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.Y);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.f);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.D);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.v);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.l);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.B);
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.U);
String var3 = var10000;
var4 = var4 * b<"x">(3068, 720583868124775466L ^ var1) + Boolean.hashCode(this.C);

try {
if (var3 != null) {
vm.a<"Å">(new _g[5], 1233006077411924769L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1260803150148412745L, var1);
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
// 000: getstatic su/catlean/bb.a J
// 003: ldc2_w 52897234244256
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 5085634987689444848
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 5127748705355264799
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 5127748705355264799
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/bb
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 5127748705355264799
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 5127748705355264799
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/bb
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/bb.V F
// 065: aload 5
// 067: getfield su/catlean/bb.V F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 5127748705355264799
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 5127748705355264799
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/bb.G F
// 092: aload 5
// 094: getfield su/catlean/bb.G F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0bf
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 5127748705355264799
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 5127748705355264799
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/bb.Y Z
// 0bf: aload 5
// 0c1: getfield su/catlean/bb.Y Z
// 0c4: aload 4
// 0c6: ifnonnull 0ee
// 0c9: if_icmpeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w 5127748705355264799
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w 5127748705355264799
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/bb.f Z
// 0e9: aload 5
// 0eb: getfield su/catlean/bb.f Z
// 0ee: aload 4
// 0f0: ifnonnull 118
// 0f3: if_icmpeq 10f
// 0f6: goto 103
// 0f9: ldc2_w 5127748705355264799
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: bipush 0
// 104: ireturn
// 105: ldc2_w 5127748705355264799
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 0
// 110: getfield su/catlean/bb.D Z
// 113: aload 5
// 115: getfield su/catlean/bb.D Z
// 118: aload 4
// 11a: ifnonnull 142
// 11d: if_icmpeq 139
// 120: goto 12d
// 123: ldc2_w 5127748705355264799
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 0
// 12e: ireturn
// 12f: ldc2_w 5127748705355264799
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 0
// 13a: getfield su/catlean/bb.v Z
// 13d: aload 5
// 13f: getfield su/catlean/bb.v Z
// 142: aload 4
// 144: ifnonnull 16c
// 147: if_icmpeq 163
// 14a: goto 157
// 14d: ldc2_w 5127748705355264799
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: bipush 0
// 158: ireturn
// 159: ldc2_w 5127748705355264799
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: aload 0
// 164: getfield su/catlean/bb.l Z
// 167: aload 5
// 169: getfield su/catlean/bb.l Z
// 16c: aload 4
// 16e: ifnonnull 196
// 171: if_icmpeq 18d
// 174: goto 181
// 177: ldc2_w 5127748705355264799
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: bipush 0
// 182: ireturn
// 183: ldc2_w 5127748705355264799
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 0
// 18e: getfield su/catlean/bb.B Z
// 191: aload 5
// 193: getfield su/catlean/bb.B Z
// 196: aload 4
// 198: ifnonnull 1c0
// 19b: if_icmpeq 1b7
// 19e: goto 1ab
// 1a1: ldc2_w 5127748705355264799
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: bipush 0
// 1ac: ireturn
// 1ad: ldc2_w 5127748705355264799
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 0
// 1b8: getfield su/catlean/bb.U Z
// 1bb: aload 5
// 1bd: getfield su/catlean/bb.U Z
// 1c0: aload 4
// 1c2: ifnonnull 1fc
// 1c5: if_icmpeq 1e1
// 1c8: goto 1d5
// 1cb: ldc2_w 5127748705355264799
// 1ce: lload 2
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: bipush 0
// 1d6: ireturn
// 1d7: ldc2_w 5127748705355264799
// 1da: lload 2
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: aload 0
// 1e2: getfield su/catlean/bb.C Z
// 1e5: aload 4
// 1e7: ifnonnull 20c
// 1ea: aload 5
// 1ec: getfield su/catlean/bb.C Z
// 1ef: goto 1fc
// 1f2: ldc2_w 5127748705355264799
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: if_icmpeq 20b
// 1ff: bipush 0
// 200: ireturn
// 201: ldc2_w 5127748705355264799
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: bipush 1
// 20c: ireturn
}

public static void P(String var0) {
H = var0;
}

public static String W() {
return H;
}

static {
long var20 = a ^ 81905839644160L;
vm.a<"Å">(null, 839697014603960007L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "\"â)lW:1Y®6St\u008f\u0006\u008c\u0093¬\u0013Õ÷Â¡`ÖOsªY(S\u009a\u0006\u0010 [~%Ê]üq¦þ\u009e\u001c,½q\u0099\u0018\u0016\u001f<£Ë\u008f}Çª.|ÚP÷Þ\u0093\u001bF|Us \b\u0011 ¾¨zÉ\u000f\u0092¬\u001dÉ\u0084ZÐ\u0099ÀDóà\u0090\u008a~rø\u009b\u00adò\tÌ6\u009eÌí \u0018äWÓ<Ó+tá.\u009fìBJÏZèÂ?&1\u0000>\u00153\u0010»¶\u0018\u0019Xz\u009aUÊü\u009dïÌ>\u0016~\u0010w<\u0084ò\u007f\u007fÆU+\u001d?\u001bh\u0001¾æ Õ-7a8ÚSfí>ýÎ\u0002ÉÕÉiüÐt#>\n\u0080Ý\u0014- \u0096PûÓ";
int var17 = "\"â)lW:1Y®6St\u008f\u0006\u008c\u0093¬\u0013Õ÷Â¡`ÖOsªY(S\u009a\u0006\u0010 [~%Ê]üq¦þ\u009e\u001c,½q\u0099\u0018\u0016\u001f<£Ë\u008f}Çª.|ÚP÷Þ\u0093\u001bF|Us \b\u0011 ¾¨zÉ\u000f\u0092¬\u001dÉ\u0084ZÐ\u0099ÀDóà\u0090\u008a~rø\u009b\u00adò\tÌ6\u009eÌí \u0018äWÓ<Ó+tá.\u009fìBJÏZèÂ?&1\u0000>\u00153\u0010»¶\u0018\u0019Xz\u009aUÊü\u009dïÌ>\u0016~\u0010w<\u0084ò\u007f\u007fÆU+\u001d?\u001bh\u0001¾æ Õ-7a8ÚSfí>ýÎ\u0002ÉÕÉiüÐt#>\n\u0080Ý\u0014- \u0096PûÓ"
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
c = new String[10];
h = new HashMap(13);
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
String var4 = "\u00ad\r \u0005\u001d\u0097qpmñØï¦Lðm-ç+\u0096.ô\t^Ñ+È4<\u00931\t\u0006Lª\"~\u009f`\b¢æ\u008c\u000f}´\u0000ßÂ?êýpé\u0080ç";
int var5 = "\u00ad\r \u0005\u001d\u0097qpmñØï¦Lðm-ç+\u0096.ô\t^Ñ+È4<\u00931\t\u0006Lª\"~\u009f`\b¢æ\u008c\u000f}´\u0000ßÂ?êýpé\u0080ç".length();
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
g = new Integer[9];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "6\u0099ï&E'Ýà»:\u009e©¨¬Óù";
var5 = "6\u0099ï&E'Ýà»:\u009e©¨¬Óù".length();
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

var15 = "\"R.07ÃÍ\u000b-¬¹\u009eí?.(\u0093Û¿]ÿ¸\u000e C°C\u0081×¼pV¼\f\u0083÷÷(\u0094!OCÍ\u0080MìA\"\u0010\u001bj\u0002T\u008cZßµR\u0011\t%\u0000\u000böì";
var17 = "\"R.07ÃÍ\u000b-¬¹\u009eí?.(\u0093Û¿]ÿ¸\u000e C°C\u0081×¼pV¼\f\u0083÷÷(\u0094!OCÍ\u0080MìA\"\u0010\u001bj\u0002T\u008cZßµR\u0011\t%\u0000\u000böì"
.length();
var14 = '0';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27450;
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
throw new RuntimeException("su/catlean/bb", var10);
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
throw new RuntimeException("su/catlean/bb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24556;
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
throw new RuntimeException("su/catlean/bb", var14);
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
throw new RuntimeException("su/catlean/bb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
