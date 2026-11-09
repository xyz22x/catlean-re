package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

public final class r4 {
private float A;
private float b;
private float i;
private float s;
private float o;
private float E;
private float y;
private float U;
private float w;
private float C;
private float W;
private float Y;
private float B;
private int K;
private int Z;
private boolean R;
private boolean V;
private int l;
@NotNull
private final Color u;
private float g;
private static final long a = yz.a(2829213519929027138L, 4420343396535405648L, MethodHandles.lookup().lookupClass()).a(260760626420435L);
private static final long[] c;
private static final Integer[] d;
private static final Map e = new HashMap(13);

public r4(char a, char a, float posX, int a, float posY, float posZ, float motionX, float motionY, float motionZ, float rot, float rotSpeed, float size) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/r4.a J
// 01b: lxor
// 01c: lstore 13
// 01e: lload 13
// 020: dup2
// 021: ldc2_w 69436795748095
// 024: lxor
// 025: lstore 15
// 027: dup2
// 028: ldc2_w 83072080431942
// 02b: lxor
// 02c: lstore 17
// 02e: dup2
// 02f: ldc2_w 128242629177451
// 032: lxor
// 033: lstore 19
// 035: dup2
// 036: ldc2_w 61472737946587
// 039: lxor
// 03a: lstore 21
// 03c: dup2
// 03d: ldc2_w 63125509246064
// 040: lxor
// 041: lstore 23
// 043: dup2
// 044: ldc2_w 37370132154038
// 047: lxor
// 048: lstore 25
// 04a: dup2
// 04b: ldc2_w 18630754963514
// 04e: lxor
// 04f: dup2
// 050: bipush 56
// 052: lushr
// 053: l2i
// 054: istore 27
// 056: dup2
// 057: bipush 8
// 059: lshl
// 05a: bipush 32
// 05c: lushr
// 05d: l2i
// 05e: istore 28
// 060: dup2
// 061: bipush 40
// 063: lshl
// 064: bipush 40
// 066: lushr
// 067: l2i
// 068: istore 29
// 06a: pop2
// 06b: dup2
// 06c: ldc2_w 48894220140062
// 06f: lxor
// 070: dup2
// 071: bipush 48
// 073: lushr
// 074: l2i
// 075: istore 30
// 077: dup2
// 078: bipush 16
// 07a: lshl
// 07b: bipush 32
// 07d: lushr
// 07e: l2i
// 07f: istore 31
// 081: dup2
// 082: bipush 48
// 084: lshl
// 085: bipush 48
// 087: lushr
// 088: l2i
// 089: istore 32
// 08b: pop2
// 08c: dup2
// 08d: ldc2_w 28388223636246
// 090: lxor
// 091: dup2
// 092: bipush 16
// 094: lushr
// 095: lstore 33
// 097: dup2
// 098: bipush 48
// 09a: lshl
// 09b: bipush 48
// 09d: lushr
// 09e: l2i
// 09f: istore 35
// 0a1: pop2
// 0a2: pop2
// 0a3: aload 0
// 0a4: invokespecial java/lang/Object.<init> ()V
// 0a7: ldc2_w -968385598982425136
// 0aa: lload 13
// 0ac: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: aload 0
// 0b2: fload 3
// 0b3: putfield su/catlean/r4.A F
// 0b6: aload 0
// 0b7: fload 5
// 0b9: putfield su/catlean/r4.b F
// 0bc: aload 0
// 0bd: fload 6
// 0bf: putfield su/catlean/r4.i F
// 0c2: aload 0
// 0c3: fload 7
// 0c5: putfield su/catlean/r4.s F
// 0c8: astore 37
// 0ca: aload 0
// 0cb: fload 8
// 0cd: putfield su/catlean/r4.o F
// 0d0: aload 0
// 0d1: fload 9
// 0d3: putfield su/catlean/r4.E F
// 0d6: aload 0
// 0d7: fload 10
// 0d9: putfield su/catlean/r4.y F
// 0dc: aload 0
// 0dd: fload 11
// 0df: putfield su/catlean/r4.U F
// 0e2: aload 0
// 0e3: fload 12
// 0e5: putfield su/catlean/r4.w F
// 0e8: aload 0
// 0e9: aload 0
// 0ea: getfield su/catlean/r4.A F
// 0ed: putfield su/catlean/r4.C F
// 0f0: aload 0
// 0f1: aload 0
// 0f2: getfield su/catlean/r4.b F
// 0f5: putfield su/catlean/r4.W F
// 0f8: aload 0
// 0f9: aload 0
// 0fa: getfield su/catlean/r4.i F
// 0fd: putfield su/catlean/r4.Y F
// 100: aload 0
// 101: aload 0
// 102: getfield su/catlean/r4.y F
// 105: putfield su/catlean/r4.B F
// 108: aload 0
// 109: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 10c: aload 37
// 10e: ifnull 14b
// 111: lload 21
// 113: dup2_x1
// 114: pop2
// 115: invokestatic su/catlean/kc.a (JLsu/catlean/kc;)Lsu/catlean/j;
// 118: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 11b: if_acmpne 148
// 11e: goto 12c
// 121: ldc2_w -995238716979467199
// 124: lload 13
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: sipush 12236
// 12f: ldc2_w 5371284545822771735
// 132: lload 13
// 134: lxor
// 135: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: goto 17c
// 13d: ldc2_w -995238716979467199
// 140: lload 13
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 14b: astore 36
// 14d: iload 30
// 14f: i2s
// 150: iload 31
// 152: aload 36
// 154: iload 32
// 156: invokestatic su/catlean/kc.q (SILsu/catlean/kc;I)I
// 159: i2f
// 15a: iload 30
// 15c: i2s
// 15d: iload 31
// 15f: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 162: iload 32
// 164: invokestatic su/catlean/kc.q (SILsu/catlean/kc;I)I
// 167: i2f
// 168: fconst_0
// 169: ldc 0.5
// 16b: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 16e: checkcast kotlin/ranges/ClosedRange
// 171: lload 17
// 173: bipush 0
// 174: bipush 2
// 175: aconst_null
// 176: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 179: fmul
// 17a: fadd
// 17b: f2i
// 17c: putfield su/catlean/r4.K I
// 17f: aload 0
// 180: aload 0
// 181: getfield su/catlean/r4.K I
// 184: putfield su/catlean/r4.Z I
// 187: aload 0
// 188: sipush 8130
// 18b: ldc2_w 136756902318537246
// 18e: lload 13
// 190: lxor
// 191: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: i2f
// 197: fconst_0
// 198: fconst_1
// 199: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 19c: checkcast kotlin/ranges/ClosedRange
// 19f: lload 17
// 1a1: bipush 0
// 1a2: bipush 2
// 1a3: aconst_null
// 1a4: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 1a7: fmul
// 1a8: f2i
// 1a9: putfield su/catlean/r4.l I
// 1ac: aload 0
// 1ad: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 1b0: aload 37
// 1b2: ifnull 1fd
// 1b5: astore 36
// 1b7: iload 27
// 1b9: i2b
// 1ba: aload 36
// 1bc: iload 28
// 1be: iload 29
// 1c0: invokestatic su/catlean/kc.W (BLsu/catlean/kc;II)Lsu/catlean/tz;
// 1c3: getstatic su/catlean/ly.K [I
// 1c6: swap
// 1c7: invokevirtual su/catlean/tz.ordinal ()I
// 1ca: iaload
// 1cb: tableswitch 175 1 5 33 60 77 106 141
// 1ec: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 1ef: goto 1fd
// 1f2: ldc2_w -995238716979467199
// 1f5: lload 13
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: lload 15
// 1ff: dup2_x1
// 200: pop2
// 201: invokestatic su/catlean/kc.E (JLsu/catlean/kc;)Ljava/awt/Color;
// 204: goto 282
// 207: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 20a: aload 0
// 20b: getfield su/catlean/r4.l I
// 20e: lload 19
// 210: dup2_x1
// 211: pop2
// 212: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 215: goto 282
// 218: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 21b: sipush 28011
// 21e: ldc2_w 1093362494501816502
// 221: lload 13
// 223: lxor
// 224: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: aload 0
// 22a: getfield su/catlean/r4.l I
// 22d: lload 23
// 22f: invokevirtual su/catlean/jl.N (IIJ)Ljava/awt/Color;
// 232: goto 282
// 235: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 238: sipush 3409
// 23b: ldc2_w 9115555822032218254
// 23e: lload 13
// 240: lxor
// 241: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: aload 0
// 247: getfield su/catlean/r4.l I
// 24a: lload 33
// 24c: iload 35
// 24e: i2c
// 24f: ldc 0.6
// 251: fconst_1
// 252: invokevirtual su/catlean/jl.q (IIJCFF)Ljava/awt/Color;
// 255: goto 282
// 258: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 25b: sipush 3409
// 25e: ldc2_w 9115555822032218254
// 261: lload 13
// 263: lxor
// 264: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: aload 0
// 26a: getfield su/catlean/r4.l I
// 26d: lload 33
// 26f: iload 35
// 271: i2c
// 272: fconst_1
// 273: fconst_1
// 274: invokevirtual su/catlean/jl.q (IIJCFF)Ljava/awt/Color;
// 277: goto 282
// 27a: new kotlin/NoWhenBranchMatchedException
// 27d: dup
// 27e: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 281: athrow
// 282: putfield su/catlean/r4.u Ljava/awt/Color;
// 285: aload 0
// 286: getstatic su/catlean/la.l Lsu/catlean/la;
// 289: new net/minecraft/class_243
// 28c: dup
// 28d: aload 0
// 28e: getfield su/catlean/r4.A F
// 291: f2d
// 292: aload 0
// 293: getfield su/catlean/r4.b F
// 296: f2d
// 297: aload 0
// 298: getfield su/catlean/r4.i F
// 29b: f2d
// 29c: invokespecial net/minecraft/class_243.<init> (DDD)V
// 29f: new net/minecraft/class_243
// 2a2: dup
// 2a3: aload 0
// 2a4: getfield su/catlean/r4.A F
// 2a7: f2d
// 2a8: aload 0
// 2a9: getfield su/catlean/r4.b F
// 2ac: f2d
// 2ad: ldc2_w 128.0
// 2b0: dsub
// 2b1: aload 0
// 2b2: getfield su/catlean/r4.i F
// 2b5: f2d
// 2b6: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2b9: bipush 0
// 2ba: aconst_null
// 2bb: bipush 0
// 2bc: sipush 5974
// 2bf: ldc2_w 8183566549253649032
// 2c2: lload 13
// 2c4: lxor
// 2c5: invokedynamic p (IJ)I bsm=su/catlean/r4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: aconst_null
// 2cb: lload 25
// 2cd: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 2d0: astore 38
// 2d2: aload 38
// 2d4: aload 37
// 2d6: ifnull 2ec
// 2d9: ifnull 33f
// 2dc: goto 2ea
// 2df: ldc2_w -995238716979467199
// 2e2: lload 13
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: aload 38
// 2ec: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 2ef: astore 39
// 2f1: aload 39
// 2f3: aload 37
// 2f5: ifnull 31c
// 2f8: ifnull 33f
// 2fb: goto 309
// 2fe: ldc2_w -995238716979467199
// 301: lload 13
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: aload 39
// 30b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 30e: goto 31c
// 311: ldc2_w -995238716979467199
// 314: lload 13
// 316: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: athrow
// 31c: astore 40
// 31e: aload 40
// 320: aload 37
// 322: ifnull 338
// 325: ifnull 33f
// 328: goto 336
// 32b: ldc2_w -995238716979467199
// 32e: lload 13
// 330: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 335: athrow
// 336: aload 40
// 338: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 33b: i2f
// 33c: goto 343
// 33f: aload 0
// 340: getfield su/catlean/r4.b F
// 343: putfield su/catlean/r4.g F
// 346: iload 4
// 348: iflt 35e
// 34b: aload 37
// 34d: ifnonnull 36c
// 350: bipush 3
// 351: anewarray 282
// 354: ldc2_w -963334718629676900
// 357: lload 13
// 359: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: goto 36c
// 361: ldc2_w -995238716979467199
// 364: lload 13
// 366: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: athrow
// 36c: return
}

public final float X() {
return this.A;
}

public final void t(float <set-?>) {
this.A = <set-?>;
}

public final float z() {
return this.b;
}

public final void N(float <set-?>) {
this.b = <set-?>;
}

public final float W() {
return this.i;
}

public final void l(float <set-?>) {
this.i = <set-?>;
}

public final float b() {
return this.s;
}

public final void k(float <set-?>) {
this.s = <set-?>;
}

public final float G() {
return this.o;
}

public final void d(float <set-?>) {
this.o = <set-?>;
}

public final float s() {
return this.E;
}

public final void y(float <set-?>) {
this.E = <set-?>;
}

public final float C() {
return this.y;
}

public final void s(float <set-?>) {
this.y = <set-?>;
}

public final float R() {
return this.U;
}

public final void P(float <set-?>) {
this.U = <set-?>;
}

public final float M() {
return this.w;
}

public final void H(float <set-?>) {
this.w = <set-?>;
}

public final float f() {
return this.C;
}

public final void M(float <set-?>) {
this.C = <set-?>;
}

public final float h() {
return this.W;
}

public final void q(float <set-?>) {
this.W = <set-?>;
}

public final float k() {
return this.Y;
}

public final void f(float <set-?>) {
this.Y = <set-?>;
}

public final float Y() {
return this.B;
}

public final void b(float <set-?>) {
this.B = <set-?>;
}

public final int E() {
return this.K;
}

public final void q(int <set-?>) {
this.K = <set-?>;
}

public final int H() {
return this.Z;
}

public final void I(int <set-?>) {
this.Z = <set-?>;
}

public final boolean r() {
return this.R;
}

public final void K(boolean <set-?>) {
this.R = <set-?>;
}

public final boolean t() {
return this.V;
}

public final void k(boolean <set-?>) {
this.V = <set-?>;
}

public final int D() {
return this.l;
}

public final void p(int <set-?>) {
this.l = <set-?>;
}

@NotNull
public final Color j() {
return this.u;
}

public final float B() {
return this.g;
}

public final void R(float <set-?>) {
this.g = <set-?>;
}

static {
long var0 = a ^ 76953059398063L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var8 = new long[5];
int var5 = 0;
String var6 = "$?YÅ4\u0004áüÓ>\u0000\u008aGt\u0094ÇrÕÇu\u008c(Ýä";
int var7 = "$?YÅ4\u0004áüÓ>\u0000\u008aGt\u0094ÇrÕÇu\u008c(Ýä".length();
byte var4 = 0;

label23:
while (true) {
int var10001 = var4;
var4 += 8;
byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
long[] var14 = var8;
var10001 = var5++;
long var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
byte var19 = -1;

while (true) {
long var10 = var17;
byte[] var12 = var2.doFinal(
new byte[]{
(byte)(var10 >>> 56),
(byte)(var10 >>> 48),
(byte)(var10 >>> 40),
(byte)(var10 >>> 32),
(byte)(var10 >>> 24),
(byte)(var10 >>> 16),
(byte)(var10 >>> 8),
(byte)var10
}
);
long var21 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
switch (var19) {
case 0:
var14[var10001] = var21;
if (var4 >= var7) {
c = var8;
d = new Integer[5];
return;
}
break;
default:
var14[var10001] = var21;
if (var4 < var7) {
continue label23;
}

var6 = "S(Ñïñô8\u0006¬êx)\u007fÐ\"\u0090";
var7 = "S(Ñïñô8\u0006¬êx)\u007fÐ\"\u0090".length();
var4 = 0;
}

byte var16 = var4;
var4 += 8;
var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
var14 = var8;
var10001 = var5++;
var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
var19 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
return var0;
}

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5721;
if (d[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = c[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])e.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r4", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
d[var3] = var15;
}

return d[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/r4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
