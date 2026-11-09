package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
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
import kotlin.math.MathKt;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

public final class tf extends class_437 {
private final float G;
private final float z;
@NotNull
private _s u;
private long f;
private boolean a;
private boolean M;
private int Y;
@NotNull
private final Color g;
@NotNull
private final Color V;
@NotNull
private final Color P;
@NotNull
private final Color T;
@NotNull
private final Color e;
@NotNull
private final Color v;
@NotNull
private final Color t;
private long U;
@NotNull
private final List I;
private static final long b = yz.a(-5064414432388862209L, -1955017227140488468L, MethodHandles.lookup().lookupClass()).a(81121127181867L);
private static final String[] c;
private static final String[] d;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] j;
private static final Map k;
private static final long l;

public tf(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
super(class_2561.method_30163(a<"a">(22961, 4360165233922076804L ^ var4)));
this.G = 210.0F;
this.z = 8.0F;
this.u = _s.LINEAR;
this.f = l;
this.a = true;
this.M = true;
this.Y = b<"i">(25153, 8774559559799270046L ^ var4);
this.g = new Color(b<"i">(21970, 54408629948767499L ^ var4));
this.V = new Color(b<"i">(18182, 7514966387560861650L ^ var4));
this.P = new Color(-1);
this.T = new Color(b<"i">(818, 3240734687186652150L ^ var4));
this.e = new Color(b<"i">(9181, 2351476052982508311L ^ var4));
this.v = new Color(b<"i">(16089, 5932867800810599938L ^ var4));
this.t = new Color(b<"i">(26689, 6518728383593373855L ^ var4));
this.I = CollectionsKt.toList(_s.W());
}

@NotNull
public final _s V() {
return this.u;
}

public final long g() {
return this.f;
}

public final void l(long <set-?>) {
this.f = <set-?>;
}

public final boolean a() {
return this.a;
}

public final void t(boolean <set-?>) {
this.a = <set-?>;
}

public final boolean b() {
return this.M;
}

public final void Z(boolean <set-?>) {
this.M = <set-?>;
}

public final int d() {
return this.Y;
}

public final void u(int <set-?>) {
this.Y = <set-?>;
}

@NotNull
public final Color l() {
return this.g;
}

@NotNull
public final Color O() {
return this.V;
}

@NotNull
public final Color P() {
return this.P;
}

@NotNull
public final Color j() {
return this.T;
}

@NotNull
public final Color c() {
return this.e;
}

@NotNull
public final Color m() {
return this.v;
}

@NotNull
public final Color v() {
return this.t;
}

protected void method_57734(@NotNull class_332 context) {
long var2 = b ^ 115214883752345L;
Intrinsics.checkNotNullParameter(context, a<"a">(17972, 3471179403049585977L ^ var2));
}

public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
long var5 = b ^ 89039088762141L;
Intrinsics.checkNotNullParameter(context, a<"a">(17972, 3471188394708957629L ^ var5));
}

public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tf.b J
// 003: ldc2_w 97187093846746
// 006: lxor
// 007: lstore 5
// 009: lload 5
// 00b: dup2
// 00c: ldc2_w 82843793928973
// 00f: lxor
// 010: lstore 7
// 012: dup2
// 013: ldc2_w 23351218299752
// 016: lxor
// 017: lstore 9
// 019: dup2
// 01a: ldc2_w 125078924083501
// 01d: lxor
// 01e: lstore 11
// 020: dup2
// 021: ldc2_w 90932762686327
// 024: lxor
// 025: lstore 13
// 027: dup2
// 028: ldc2_w 32392877863856
// 02b: lxor
// 02c: lstore 15
// 02e: dup2
// 02f: ldc2_w 113882529742550
// 032: lxor
// 033: lstore 17
// 035: pop2
// 036: ldc2_w 8033589059917749279
// 039: lload 5
// 03b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: aload 1
// 041: sipush 17166
// 044: ldc2_w 5991225878717127505
// 047: lload 5
// 049: lxor
// 04a: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 052: astore 22
// 054: aload 0
// 055: invokestatic su/catlean/zf.A ()J
// 058: putfield su/catlean/tf.U J
// 05b: aload 0
// 05c: getfield su/catlean/tf.a Z
// 05f: aload 22
// 061: ifnull 09d
// 064: ifne 092
// 067: goto 075
// 06a: ldc2_w 8037120597763078468
// 06d: lload 5
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: aload 0
// 076: aload 0
// 077: getfield su/catlean/tf.U J
// 07a: aload 0
// 07b: getfield su/catlean/tf.f J
// 07e: invokestatic java/lang/Math.min (JJ)J
// 081: putfield su/catlean/tf.U J
// 084: goto 092
// 087: ldc2_w 8037120597763078468
// 08a: lload 5
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 7
// 094: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 097: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 09a: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 09d: i2f
// 09e: fstore 23
// 0a0: lload 7
// 0a2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a5: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0a8: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 0ab: i2f
// 0ac: fstore 24
// 0ae: aload 1
// 0af: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0b2: dup
// 0b3: sipush 26854
// 0b6: ldc2_w 1559704310940889253
// 0b9: lload 5
// 0bb: lxor
// 0bc: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c4: astore 25
// 0c6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0c9: aload 25
// 0cb: fconst_0
// 0cc: fconst_0
// 0cd: fload 23
// 0cf: fload 24
// 0d1: bipush 1
// 0d2: anewarray 275
// 0d5: astore 26
// 0d7: aload 26
// 0d9: bipush 0
// 0da: aload 0
// 0db: getfield su/catlean/tf.g Ljava/awt/Color;
// 0de: aastore
// 0df: aload 26
// 0e1: lload 15
// 0e3: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0e6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e9: aload 25
// 0eb: fconst_0
// 0ec: fconst_0
// 0ed: aload 0
// 0ee: getfield su/catlean/tf.G F
// 0f1: fload 24
// 0f3: bipush 1
// 0f4: anewarray 275
// 0f7: astore 26
// 0f9: aload 26
// 0fb: bipush 0
// 0fc: aload 0
// 0fd: getfield su/catlean/tf.V Ljava/awt/Color;
// 100: aastore
// 101: aload 26
// 103: lload 15
// 105: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 108: lload 13
// 10a: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 10d: aload 1
// 10e: sipush 15102
// 111: ldc2_w 225264056208958137
// 114: lload 5
// 116: lxor
// 117: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: aload 0
// 11d: getfield su/catlean/tf.z F
// 120: lload 9
// 122: dup2_x1
// 123: pop2
// 124: aload 0
// 125: getfield su/catlean/tf.z F
// 128: aload 0
// 129: getfield su/catlean/tf.P Ljava/awt/Color;
// 12c: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 12f: aload 0
// 130: getfield su/catlean/tf.z F
// 133: sipush 8209
// 136: ldc2_w 2812950128895498687
// 139: lload 5
// 13b: lxor
// 13c: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: i2f
// 142: fadd
// 143: fstore 26
// 145: lload 13
// 147: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 14a: aload 1
// 14b: aload 0
// 14c: getfield su/catlean/tf.f J
// 14f: sipush 30294
// 152: ldc2_w 426081403934699016
// 155: lload 5
// 157: lxor
// 158: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: dup_x2
// 15e: pop
// 15f: sipush 24090
// 162: ldc2_w 5335224885808547408
// 165: lload 5
// 167: lxor
// 168: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: invokedynamic makeConcatWithConstants (Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 172: aload 0
// 173: getfield su/catlean/tf.z F
// 176: lload 9
// 178: dup2_x1
// 179: pop2
// 17a: fload 26
// 17c: aload 0
// 17d: getfield su/catlean/tf.T Ljava/awt/Color;
// 180: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 183: fload 26
// 185: sipush 9701
// 188: ldc2_w 7402136702010104912
// 18b: lload 5
// 18d: lxor
// 18e: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: i2f
// 194: fadd
// 195: fstore 26
// 197: lload 13
// 199: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 19c: aload 1
// 19d: aload 0
// 19e: getfield su/catlean/tf.a Z
// 1a1: sipush 8297
// 1a4: ldc2_w 8093978738544261160
// 1a7: lload 5
// 1a9: lxor
// 1aa: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: swap
// 1b0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 1b5: aload 0
// 1b6: getfield su/catlean/tf.z F
// 1b9: lload 9
// 1bb: dup2_x1
// 1bc: pop2
// 1bd: fload 26
// 1bf: aload 0
// 1c0: getfield su/catlean/tf.T Ljava/awt/Color;
// 1c3: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 1c6: fload 26
// 1c8: sipush 30637
// 1cb: ldc2_w 7040005385583250955
// 1ce: lload 5
// 1d0: lxor
// 1d1: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: i2f
// 1d7: fadd
// 1d8: fstore 26
// 1da: lload 13
// 1dc: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 1df: aload 1
// 1e0: aload 0
// 1e1: getfield su/catlean/tf.M Z
// 1e4: sipush 21842
// 1e7: ldc2_w 4929658536556285213
// 1ea: lload 5
// 1ec: lxor
// 1ed: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: swap
// 1f3: invokedynamic makeConcatWithConstants (Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 1f8: aload 0
// 1f9: getfield su/catlean/tf.z F
// 1fc: lload 9
// 1fe: dup2_x1
// 1ff: pop2
// 200: fload 26
// 202: aload 0
// 203: getfield su/catlean/tf.T Ljava/awt/Color;
// 206: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 209: fload 26
// 20b: sipush 30637
// 20e: ldc2_w 7040005385583250955
// 211: lload 5
// 213: lxor
// 214: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: i2f
// 21a: fadd
// 21b: fstore 26
// 21d: lload 13
// 21f: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 222: aload 1
// 223: aload 0
// 224: getfield su/catlean/tf.Y I
// 227: sipush 8413
// 22a: ldc2_w 5049552147195213976
// 22d: lload 5
// 22f: lxor
// 230: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: swap
// 236: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 23b: aload 0
// 23c: getfield su/catlean/tf.z F
// 23f: lload 9
// 241: dup2_x1
// 242: pop2
// 243: fload 26
// 245: aload 0
// 246: getfield su/catlean/tf.T Ljava/awt/Color;
// 249: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 24c: fload 26
// 24e: sipush 5506
// 251: ldc2_w 4215857689654111283
// 254: lload 5
// 256: lxor
// 257: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25c: i2f
// 25d: fadd
// 25e: fstore 26
// 260: lload 13
// 262: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 265: aload 1
// 266: sipush 32614
// 269: ldc2_w 1994744129124722477
// 26c: lload 5
// 26e: lxor
// 26f: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: aload 0
// 275: getfield su/catlean/tf.z F
// 278: lload 9
// 27a: dup2_x1
// 27b: pop2
// 27c: fload 26
// 27e: aload 0
// 27f: getfield su/catlean/tf.P Ljava/awt/Color;
// 282: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 285: fload 26
// 287: sipush 30637
// 28a: ldc2_w 7040005385583250955
// 28d: lload 5
// 28f: lxor
// 290: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: i2f
// 296: fadd
// 297: fstore 26
// 299: ldc 14.0
// 29b: fstore 27
// 29d: aload 0
// 29e: getfield su/catlean/tf.I Ljava/util/List;
// 2a1: checkcast java/lang/Iterable
// 2a4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2a9: astore 28
// 2ab: bipush 0
// 2ac: istore 29
// 2ae: aload 28
// 2b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2b5: ifeq 394
// 2b8: iload 29
// 2ba: istore 30
// 2bc: iload 29
// 2be: bipush 1
// 2bf: iadd
// 2c0: istore 29
// 2c2: aload 28
// 2c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2c9: checkcast su/catlean/_s
// 2cc: astore 31
// 2ce: aload 31
// 2d0: aload 0
// 2d1: getfield su/catlean/tf.u Lsu/catlean/_s;
// 2d4: if_acmpne 2e6
// 2d7: bipush 1
// 2d8: goto 2e7
// 2db: ldc2_w 8037120597763078468
// 2de: lload 5
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: bipush 0
// 2e7: istore 32
// 2e9: fload 26
// 2eb: iload 30
// 2ed: i2f
// 2ee: fload 27
// 2f0: fmul
// 2f1: fadd
// 2f2: fstore 33
// 2f4: fload 33
// 2f6: fload 27
// 2f8: fadd
// 2f9: fload 24
// 2fb: aload 0
// 2fc: getfield su/catlean/tf.z F
// 2ff: fsub
// 300: aload 22
// 302: ifnull 39c
// 305: fcmpl
// 306: ifgt 394
// 309: goto 317
// 30c: ldc2_w 8037120597763078468
// 30f: lload 5
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: iload 32
// 319: ifeq 352
// 31c: goto 32a
// 31f: ldc2_w 8037120597763078468
// 322: lload 5
// 324: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: athrow
// 32a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 32d: aload 25
// 32f: fconst_2
// 330: fload 33
// 332: fconst_1
// 333: fsub
// 334: aload 0
// 335: getfield su/catlean/tf.G F
// 338: ldc 4.0
// 33a: fsub
// 33b: fload 27
// 33d: bipush 1
// 33e: anewarray 275
// 341: astore 34
// 343: aload 34
// 345: bipush 0
// 346: aload 0
// 347: getfield su/catlean/tf.e Ljava/awt/Color;
// 34a: aastore
// 34b: aload 34
// 34d: lload 15
// 34f: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 352: lload 13
// 354: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 357: aload 1
// 358: aload 31
// 35a: invokevirtual su/catlean/_s.name ()Ljava/lang/String;
// 35d: aload 0
// 35e: getfield su/catlean/tf.z F
// 361: fload 33
// 363: iload 32
// 365: ifeq 37a
// 368: aload 0
// 369: getfield su/catlean/tf.P Ljava/awt/Color;
// 36c: goto 37e
// 36f: ldc2_w 8037120597763078468
// 372: lload 5
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: aload 0
// 37b: getfield su/catlean/tf.T Ljava/awt/Color;
// 37e: astore 19
// 380: fstore 20
// 382: fstore 21
// 384: lload 9
// 386: fload 21
// 388: fload 20
// 38a: aload 19
// 38c: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 38f: aload 22
// 391: ifnonnull 2ae
// 394: aload 0
// 395: getfield su/catlean/tf.G F
// 398: aload 0
// 399: getfield su/catlean/tf.z F
// 39c: fadd
// 39d: fstore 28
// 39f: fload 23
// 3a1: fload 28
// 3a3: fsub
// 3a4: aload 0
// 3a5: getfield su/catlean/tf.z F
// 3a8: fsub
// 3a9: fstore 29
// 3ab: fload 24
// 3ad: aload 0
// 3ae: getfield su/catlean/tf.z F
// 3b1: fsub
// 3b2: aload 0
// 3b3: getfield su/catlean/tf.z F
// 3b6: fsub
// 3b7: fstore 30
// 3b9: fload 30
// 3bb: ldc 0.62
// 3bd: fmul
// 3be: fstore 31
// 3c0: fload 30
// 3c2: fload 31
// 3c4: fsub
// 3c5: aload 0
// 3c6: getfield su/catlean/tf.z F
// 3c9: fsub
// 3ca: fstore 32
// 3cc: aload 0
// 3cd: aload 1
// 3ce: fload 28
// 3d0: aload 0
// 3d1: getfield su/catlean/tf.z F
// 3d4: lload 11
// 3d6: fload 29
// 3d8: fload 31
// 3da: invokespecial su/catlean/tf.R (Lnet/minecraft/class_332;FFJFF)V
// 3dd: aload 0
// 3de: aload 1
// 3df: lload 17
// 3e1: fload 28
// 3e3: aload 0
// 3e4: getfield su/catlean/tf.z F
// 3e7: fload 31
// 3e9: fadd
// 3ea: aload 0
// 3eb: getfield su/catlean/tf.z F
// 3ee: fadd
// 3ef: fload 29
// 3f1: fload 32
// 3f3: invokespecial su/catlean/tf.r (Lnet/minecraft/class_332;JFFFF)V
// 3f6: ldc2_w 8004521833087070596
// 3f9: lload 5
// 3fb: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 400: ifnull 41d
// 403: ldc "S7ZaG"
// 405: ldc2_w 8006672623791766202
// 408: lload 5
// 40a: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40f: goto 41d
// 412: ldc2_w 8037120597763078468
// 415: lload 5
// 417: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41c: athrow
// 41d: return
}

private final void R(class_332 param1, float param2, float param3, long param4, float param6, float param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tf.b J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 116633833068251
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 111202375583637
// 015: lxor
// 016: lstore 10
// 018: dup2
// 019: ldc2_w 50151798769348
// 01c: lxor
// 01d: lstore 12
// 01f: dup2
// 020: ldc2_w 11121669497110
// 023: lxor
// 024: dup2
// 025: bipush 32
// 027: lushr
// 028: lstore 14
// 02a: dup2
// 02b: bipush 32
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 16
// 034: pop2
// 035: dup2
// 036: ldc2_w 108134439339523
// 039: lxor
// 03a: lstore 17
// 03c: pop2
// 03d: aload 1
// 03e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 041: dup
// 042: sipush 15326
// 045: ldc2_w 3314418778862032429
// 048: lload 4
// 04a: lxor
// 04b: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 053: astore 20
// 055: ldc2_w 6543296504000326060
// 058: lload 4
// 05a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 062: aload 20
// 064: fload 2
// 065: fload 3
// 066: fload 6
// 068: fload 7
// 06a: bipush 1
// 06b: anewarray 275
// 06e: astore 21
// 070: aload 21
// 072: bipush 0
// 073: new java/awt/Color
// 076: dup
// 077: sipush 20018
// 07a: ldc2_w 4793459289140445752
// 07d: lload 4
// 07f: lxor
// 080: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokespecial java/awt/Color.<init> (I)V
// 088: aastore
// 089: aload 21
// 08b: lload 17
// 08d: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 090: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 093: aload 20
// 095: fload 2
// 096: fload 3
// 097: fload 6
// 099: fconst_1
// 09a: bipush 1
// 09b: anewarray 275
// 09e: astore 21
// 0a0: aload 21
// 0a2: bipush 0
// 0a3: aload 0
// 0a4: getfield su/catlean/tf.t Ljava/awt/Color;
// 0a7: aastore
// 0a8: aload 21
// 0aa: lload 17
// 0ac: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0af: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0b2: aload 20
// 0b4: fload 2
// 0b5: fload 3
// 0b6: fload 7
// 0b8: fadd
// 0b9: fconst_1
// 0ba: fsub
// 0bb: fload 6
// 0bd: fconst_1
// 0be: bipush 1
// 0bf: anewarray 275
// 0c2: astore 21
// 0c4: aload 21
// 0c6: bipush 0
// 0c7: aload 0
// 0c8: getfield su/catlean/tf.t Ljava/awt/Color;
// 0cb: aastore
// 0cc: aload 21
// 0ce: lload 17
// 0d0: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0d3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0d6: aload 20
// 0d8: fload 2
// 0d9: fload 3
// 0da: fconst_1
// 0db: fload 7
// 0dd: bipush 1
// 0de: anewarray 275
// 0e1: astore 21
// 0e3: aload 21
// 0e5: bipush 0
// 0e6: aload 0
// 0e7: getfield su/catlean/tf.t Ljava/awt/Color;
// 0ea: aastore
// 0eb: aload 21
// 0ed: lload 17
// 0ef: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0f2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0f5: aload 20
// 0f7: fload 2
// 0f8: fload 6
// 0fa: fadd
// 0fb: fconst_1
// 0fc: fsub
// 0fd: fload 3
// 0fe: fconst_1
// 0ff: fload 7
// 101: bipush 1
// 102: anewarray 275
// 105: astore 21
// 107: aload 21
// 109: bipush 0
// 10a: aload 0
// 10b: getfield su/catlean/tf.t Ljava/awt/Color;
// 10e: aastore
// 10f: aload 21
// 111: lload 17
// 113: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 116: astore 19
// 118: lload 12
// 11a: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 11d: aload 1
// 11e: aload 0
// 11f: getfield su/catlean/tf.u Lsu/catlean/_s;
// 122: invokevirtual su/catlean/_s.name ()Ljava/lang/String;
// 125: sipush 14673
// 128: ldc2_w 9056495094459962558
// 12b: lload 4
// 12d: lxor
// 12e: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: swap
// 134: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 139: fload 2
// 13a: aload 0
// 13b: getfield su/catlean/tf.z F
// 13e: fadd
// 13f: lload 8
// 141: dup2_x1
// 142: pop2
// 143: fload 3
// 144: aload 0
// 145: getfield su/catlean/tf.z F
// 148: fadd
// 149: aload 0
// 14a: getfield su/catlean/tf.P Ljava/awt/Color;
// 14d: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 150: fload 2
// 151: aload 0
// 152: getfield su/catlean/tf.z F
// 155: fadd
// 156: fstore 21
// 158: fload 3
// 159: aload 0
// 15a: getfield su/catlean/tf.z F
// 15d: fadd
// 15e: sipush 359
// 161: ldc2_w 318499849200078192
// 164: lload 4
// 166: lxor
// 167: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: i2f
// 16d: fadd
// 16e: fstore 22
// 170: fload 6
// 172: aload 0
// 173: getfield su/catlean/tf.z F
// 176: bipush 2
// 177: i2f
// 178: fmul
// 179: fsub
// 17a: fstore 23
// 17c: fload 7
// 17e: aload 0
// 17f: getfield su/catlean/tf.z F
// 182: bipush 2
// 183: i2f
// 184: fmul
// 185: sipush 22441
// 188: ldc2_w 629147314468936635
// 18b: lload 4
// 18d: lxor
// 18e: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: i2f
// 194: fadd
// 195: fsub
// 196: fstore 24
// 198: bipush 0
// 199: istore 25
// 19b: iload 25
// 19d: sipush 6775
// 1a0: ldc2_w 8340318566123771502
// 1a3: lload 4
// 1a5: lxor
// 1a6: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: if_icmpge 24a
// 1ae: fload 21
// 1b0: fload 23
// 1b2: iload 25
// 1b4: i2f
// 1b5: ldc 10.0
// 1b7: fdiv
// 1b8: fmul
// 1b9: fadd
// 1ba: fstore 26
// 1bc: fload 22
// 1be: fload 24
// 1c0: iload 25
// 1c2: i2f
// 1c3: ldc 10.0
// 1c5: fdiv
// 1c6: fmul
// 1c7: fadd
// 1c8: fstore 27
// 1ca: lload 14
// 1cc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1cf: aload 20
// 1d1: fload 26
// 1d3: fload 22
// 1d5: iload 16
// 1d7: fload 26
// 1d9: fload 22
// 1db: fload 24
// 1dd: fadd
// 1de: aload 0
// 1df: getfield su/catlean/tf.v Ljava/awt/Color;
// 1e2: aconst_null
// 1e3: sipush 5377
// 1e6: ldc2_w 1984757396682905881
// 1e9: lload 4
// 1eb: lxor
// 1ec: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: aconst_null
// 1f2: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 1f5: lload 14
// 1f7: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1fa: aload 20
// 1fc: fload 21
// 1fe: fload 27
// 200: fload 21
// 202: fload 23
// 204: fadd
// 205: iload 16
// 207: swap
// 208: fload 27
// 20a: aload 0
// 20b: getfield su/catlean/tf.v Ljava/awt/Color;
// 20e: aconst_null
// 20f: sipush 5377
// 212: ldc2_w 1984757396682905881
// 215: lload 4
// 217: lxor
// 218: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: aconst_null
// 21e: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 221: iinc 25 1
// 224: aload 19
// 226: lload 4
// 228: lconst_0
// 229: lcmp
// 22a: iflt 232
// 22d: ifnull 2eb
// 230: aload 19
// 232: ifnonnull 19b
// 235: lload 4
// 237: lconst_0
// 238: lcmp
// 239: ifle 224
// 23c: goto 24a
// 23f: ldc2_w 6501765983873961207
// 242: lload 4
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: lload 14
// 24c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 24f: aload 20
// 251: fload 21
// 253: fload 22
// 255: fload 24
// 257: fadd
// 258: fload 21
// 25a: fload 23
// 25c: fadd
// 25d: iload 16
// 25f: swap
// 260: fload 22
// 262: fload 24
// 264: fadd
// 265: new java/awt/Color
// 268: dup
// 269: sipush 12773
// 26c: ldc2_w 9112414411248778751
// 26f: lload 4
// 271: lxor
// 272: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: invokespecial java/awt/Color.<init> (I)V
// 27a: aconst_null
// 27b: sipush 5377
// 27e: ldc2_w 1984757396682905881
// 281: lload 4
// 283: lxor
// 284: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: aconst_null
// 28a: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 28d: lload 14
// 28f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 292: aload 20
// 294: fload 21
// 296: fload 22
// 298: iload 16
// 29a: fload 21
// 29c: fload 22
// 29e: fload 24
// 2a0: fadd
// 2a1: new java/awt/Color
// 2a4: dup
// 2a5: sipush 12773
// 2a8: ldc2_w 9112414411248778751
// 2ab: lload 4
// 2ad: lxor
// 2ae: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: invokespecial java/awt/Color.<init> (I)V
// 2b6: aconst_null
// 2b7: sipush 5377
// 2ba: ldc2_w 1984757396682905881
// 2bd: lload 4
// 2bf: lxor
// 2c0: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: aconst_null
// 2c6: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 2c9: sipush 22441
// 2cc: ldc2_w 629147314468936635
// 2cf: lload 4
// 2d1: lxor
// 2d2: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: aload 0
// 2d8: getfield su/catlean/tf.Y I
// 2db: invokestatic java/lang/Math.max (II)I
// 2de: istore 25
// 2e0: fload 21
// 2e2: fstore 26
// 2e4: fload 22
// 2e6: fload 24
// 2e8: fadd
// 2e9: fstore 27
// 2eb: bipush 0
// 2ec: istore 28
// 2ee: aload 19
// 2f0: ifnull 404
// 2f3: iload 28
// 2f5: iload 25
// 2f7: if_icmpgt 3cc
// 2fa: goto 308
// 2fd: ldc2_w 6501765983873961207
// 300: lload 4
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: iload 28
// 30a: i2d
// 30b: iload 25
// 30d: i2d
// 30e: ddiv
// 30f: dstore 29
// 311: aload 0
// 312: aload 0
// 313: getfield su/catlean/tf.u Lsu/catlean/_s;
// 316: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 319: dload 29
// 31b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 31e: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 323: checkcast java/lang/Number
// 326: invokevirtual java/lang/Number.doubleValue ()D
// 329: invokespecial su/catlean/tf.m (D)D
// 32c: dstore 31
// 32e: fload 21
// 330: dload 29
// 332: fload 23
// 334: f2d
// 335: dmul
// 336: d2f
// 337: fadd
// 338: fstore 33
// 33a: fload 22
// 33c: dconst_1
// 33d: dload 31
// 33f: dsub
// 340: fload 24
// 342: f2d
// 343: dmul
// 344: d2f
// 345: fadd
// 346: fstore 34
// 348: iload 28
// 34a: ifle 386
// 34d: lload 14
// 34f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 352: aload 20
// 354: fload 26
// 356: fload 27
// 358: iload 16
// 35a: fload 33
// 35c: fload 34
// 35e: new java/awt/Color
// 361: dup
// 362: sipush 18338
// 365: ldc2_w 2051764240310487971
// 368: lload 4
// 36a: lxor
// 36b: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: invokespecial java/awt/Color.<init> (I)V
// 373: aconst_null
// 374: sipush 5377
// 377: ldc2_w 1984757396682905881
// 37a: lload 4
// 37c: lxor
// 37d: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: aconst_null
// 383: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 386: fload 33
// 388: fstore 26
// 38a: fload 34
// 38c: lload 4
// 38e: lconst_0
// 38f: lcmp
// 390: ifle 41c
// 393: fstore 27
// 395: aload 19
// 397: ifnull 404
// 39a: iload 28
// 39c: iload 25
// 39e: if_icmpeq 3cc
// 3a1: goto 3af
// 3a4: ldc2_w 6501765983873961207
// 3a7: lload 4
// 3a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: athrow
// 3af: iinc 28 1
// 3b2: aload 19
// 3b4: ifnonnull 308
// 3b7: lload 4
// 3b9: lconst_0
// 3ba: lcmp
// 3bb: ifle 395
// 3be: goto 3cc
// 3c1: ldc2_w 6501765983873961207
// 3c4: lload 4
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: lload 12
// 3ce: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3d1: aload 1
// 3d2: sipush 176
// 3d5: ldc2_w 2261144834476420446
// 3d8: lload 4
// 3da: lxor
// 3db: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: lload 8
// 3e2: fload 21
// 3e4: fload 22
// 3e6: fload 24
// 3e8: fadd
// 3e9: bipush 2
// 3ea: i2f
// 3eb: fadd
// 3ec: new java/awt/Color
// 3ef: dup
// 3f0: sipush 952
// 3f3: ldc2_w 1628532288894570404
// 3f6: lload 4
// 3f8: lxor
// 3f9: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: invokespecial java/awt/Color.<init> (I)V
// 401: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 404: lload 12
// 406: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 409: lload 10
// 40b: sipush 2909
// 40e: ldc2_w 3875508047691261608
// 411: lload 4
// 413: lxor
// 414: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 419: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 41c: fstore 28
// 41e: lload 12
// 420: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 423: aload 1
// 424: sipush 30995
// 427: ldc2_w 3136906605722785005
// 42a: lload 4
// 42c: lxor
// 42d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: fload 21
// 434: fload 23
// 436: fadd
// 437: fload 28
// 439: fsub
// 43a: lload 8
// 43c: dup2_x1
// 43d: pop2
// 43e: fload 22
// 440: fload 24
// 442: fadd
// 443: bipush 2
// 444: i2f
// 445: fadd
// 446: new java/awt/Color
// 449: dup
// 44a: sipush 16886
// 44d: ldc2_w 1100805620083117554
// 450: lload 4
// 452: lxor
// 453: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 458: invokespecial java/awt/Color.<init> (I)V
// 45b: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 45e: return
}

private final void r(class_332 param1, long param2, float param4, float param5, float param6, float param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tf.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 136625281411360
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 65753857095999
// 012: lxor
// 013: lstore 10
// 015: dup2
// 016: ldc2_w 31113083166445
// 019: lxor
// 01a: dup2
// 01b: bipush 32
// 01d: lushr
// 01e: lstore 12
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 14
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 127579347859960
// 02f: lxor
// 030: lstore 15
// 032: pop2
// 033: ldc2_w -6542213131038140841
// 036: lload 2
// 037: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: aload 1
// 03d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 040: dup
// 041: sipush 15326
// 044: ldc2_w 3314429427673819606
// 047: lload 2
// 048: lxor
// 049: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 051: astore 18
// 053: astore 17
// 055: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 058: aload 18
// 05a: fload 4
// 05c: fload 5
// 05e: fload 6
// 060: fload 7
// 062: bipush 1
// 063: anewarray 275
// 066: astore 19
// 068: aload 19
// 06a: bipush 0
// 06b: new java/awt/Color
// 06e: dup
// 06f: sipush 31597
// 072: ldc2_w 2614151553693714565
// 075: lload 2
// 076: lxor
// 077: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokespecial java/awt/Color.<init> (I)V
// 07f: aastore
// 080: aload 19
// 082: lload 15
// 084: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 087: lload 10
// 089: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 08c: aload 1
// 08d: sipush 27093
// 090: ldc2_w 8644043078661848025
// 093: lload 2
// 094: lxor
// 095: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: fload 4
// 09c: aload 0
// 09d: getfield su/catlean/tf.z F
// 0a0: fadd
// 0a1: lload 8
// 0a3: dup2_x1
// 0a4: pop2
// 0a5: fload 5
// 0a7: aload 0
// 0a8: getfield su/catlean/tf.z F
// 0ab: fadd
// 0ac: aload 0
// 0ad: getfield su/catlean/tf.P Ljava/awt/Color;
// 0b0: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 0b3: fload 4
// 0b5: aload 0
// 0b6: getfield su/catlean/tf.z F
// 0b9: fadd
// 0ba: fstore 19
// 0bc: fload 5
// 0be: fload 7
// 0c0: bipush 2
// 0c1: i2f
// 0c2: fdiv
// 0c3: fadd
// 0c4: fstore 20
// 0c6: fload 6
// 0c8: aload 0
// 0c9: getfield su/catlean/tf.z F
// 0cc: bipush 2
// 0cd: i2f
// 0ce: fmul
// 0cf: fsub
// 0d0: fstore 21
// 0d2: lload 12
// 0d4: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0d7: aload 18
// 0d9: fload 19
// 0db: fload 20
// 0dd: fload 19
// 0df: fload 21
// 0e1: fadd
// 0e2: iload 14
// 0e4: swap
// 0e5: fload 20
// 0e7: new java/awt/Color
// 0ea: dup
// 0eb: sipush 5698
// 0ee: ldc2_w 8450601072000656807
// 0f1: lload 2
// 0f2: lxor
// 0f3: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: invokespecial java/awt/Color.<init> (I)V
// 0fb: aconst_null
// 0fc: sipush 11814
// 0ff: ldc2_w 4680000946465627614
// 102: lload 2
// 103: lxor
// 104: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: aconst_null
// 10a: invokestatic su/catlean/jl.a (JLsu/catlean/jl;Lorg/joml/Matrix3x2fStack;FFIFFLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)V
// 10d: aload 0
// 10e: getfield su/catlean/tf.f J
// 111: lconst_0
// 112: aload 17
// 114: ifnull 13e
// 117: lcmp
// 118: ifgt 136
// 11b: goto 128
// 11e: ldc2_w -6502635017013071092
// 121: lload 2
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: dconst_1
// 129: goto 146
// 12c: ldc2_w -6502635017013071092
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: aload 0
// 137: getfield su/catlean/tf.U J
// 13a: aload 0
// 13b: getfield su/catlean/tf.f J
// 13e: lrem
// 13f: l2d
// 140: aload 0
// 141: getfield su/catlean/tf.f J
// 144: l2d
// 145: ddiv
// 146: dstore 22
// 148: aload 0
// 149: getfield su/catlean/tf.M Z
// 14c: ifne 15e
// 14f: dload 22
// 151: goto 194
// 154: ldc2_w -6502635017013071092
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: dload 22
// 160: ldc2_w 2.0
// 163: dmul
// 164: dstore 26
// 166: dload 26
// 168: dconst_1
// 169: aload 17
// 16b: ifnull 193
// 16e: dcmpg
// 16f: ifgt 18e
// 172: goto 17f
// 175: ldc2_w -6502635017013071092
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: dload 26
// 181: goto 194
// 184: ldc2_w -6502635017013071092
// 187: lload 2
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: ldc2_w 2.0
// 191: dload 26
// 193: dsub
// 194: dstore 24
// 196: aload 0
// 197: aload 0
// 198: getfield su/catlean/tf.u Lsu/catlean/_s;
// 19b: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 19e: dload 24
// 1a0: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1a3: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 1a8: checkcast java/lang/Number
// 1ab: invokevirtual java/lang/Number.doubleValue ()D
// 1ae: invokespecial su/catlean/tf.m (D)D
// 1b1: dstore 26
// 1b3: fload 19
// 1b5: dload 26
// 1b7: fload 21
// 1b9: f2d
// 1ba: dmul
// 1bb: d2f
// 1bc: fadd
// 1bd: fstore 28
// 1bf: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1c2: aload 18
// 1c4: fload 28
// 1c6: fconst_1
// 1c7: fsub
// 1c8: fload 20
// 1ca: fconst_1
// 1cb: fsub
// 1cc: fconst_2
// 1cd: fconst_2
// 1ce: bipush 1
// 1cf: anewarray 275
// 1d2: astore 29
// 1d4: aload 29
// 1d6: bipush 0
// 1d7: new java/awt/Color
// 1da: dup
// 1db: sipush 9636
// 1de: ldc2_w 6238613733772514911
// 1e1: lload 2
// 1e2: lxor
// 1e3: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: invokespecial java/awt/Color.<init> (I)V
// 1eb: aastore
// 1ec: aload 29
// 1ee: lload 15
// 1f0: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 1f3: lload 10
// 1f5: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 1f8: aload 1
// 1f9: aload 0
// 1fa: dload 24
// 1fc: invokespecial su/catlean/tf.h (D)Ljava/lang/String;
// 1ff: aload 0
// 200: dload 26
// 202: invokespecial su/catlean/tf.h (D)Ljava/lang/String;
// 205: sipush 21956
// 208: ldc2_w 429426943546984384
// 20b: lload 2
// 20c: lxor
// 20d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: dup_x2
// 213: pop
// 214: sipush 7208
// 217: ldc2_w 1727097518516882978
// 21a: lload 2
// 21b: lxor
// 21c: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: swap
// 222: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 227: fload 4
// 229: aload 0
// 22a: getfield su/catlean/tf.z F
// 22d: fadd
// 22e: lload 8
// 230: dup2_x1
// 231: pop2
// 232: fload 5
// 234: fload 7
// 236: fadd
// 237: aload 0
// 238: getfield su/catlean/tf.z F
// 23b: fsub
// 23c: sipush 26953
// 23f: ldc2_w 592439016463604397
// 242: lload 2
// 243: lxor
// 244: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: i2f
// 24a: fsub
// 24b: aload 0
// 24c: getfield su/catlean/tf.T Ljava/awt/Color;
// 24f: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 252: return
}

public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tf.b J
// 003: ldc2_w 60724295396383
// 006: lxor
// 007: lstore 3
// 008: aload 1
// 009: sipush 31500
// 00c: ldc2_w 4114701103884178817
// 00f: lload 3
// 010: lxor
// 011: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 016: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 019: aload 1
// 01a: invokevirtual net/minecraft/class_11909.comp_4798 ()D
// 01d: d2i
// 01e: istore 6
// 020: ldc2_w -7370028700338328870
// 023: lload 3
// 024: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: aload 1
// 02a: invokevirtual net/minecraft/class_11909.comp_4799 ()D
// 02d: d2i
// 02e: istore 7
// 030: astore 5
// 032: aload 0
// 033: getfield su/catlean/tf.z F
// 036: f2i
// 037: sipush 5506
// 03a: ldc2_w 4215883157868927734
// 03d: lload 3
// 03e: lxor
// 03f: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: iadd
// 045: sipush 16763
// 048: ldc2_w 3749105224238009866
// 04b: lload 3
// 04c: lxor
// 04d: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: iadd
// 053: sipush 5506
// 056: ldc2_w 4215883157868927734
// 059: lload 3
// 05a: lxor
// 05b: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: iadd
// 061: istore 8
// 063: sipush 30637
// 066: ldc2_w 7040094642926008526
// 069: lload 3
// 06a: lxor
// 06b: invokedynamic i (IJ)I bsm=su/catlean/tf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: istore 9
// 072: bipush 0
// 073: iload 6
// 075: aload 5
// 077: ifnull 0b0
// 07a: if_icmpgt 0c5
// 07d: goto 08a
// 080: ldc2_w -7400265451384713343
// 083: lload 3
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: iload 6
// 08c: aload 5
// 08e: ifnull 0c2
// 091: goto 09e
// 094: ldc2_w -7400265451384713343
// 097: lload 3
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 0
// 09f: getfield su/catlean/tf.G F
// 0a2: f2i
// 0a3: goto 0b0
// 0a6: ldc2_w -7400265451384713343
// 0a9: lload 3
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: if_icmpge 0c1
// 0b3: bipush 1
// 0b4: goto 0c6
// 0b7: ldc2_w -7400265451384713343
// 0ba: lload 3
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: bipush 0
// 0c2: goto 0c6
// 0c5: bipush 0
// 0c6: ifeq 176
// 0c9: iload 7
// 0cb: aload 5
// 0cd: ifnull 17c
// 0d0: goto 0dd
// 0d3: ldc2_w -7400265451384713343
// 0d6: lload 3
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: iload 8
// 0df: if_icmplt 176
// 0e2: goto 0ef
// 0e5: ldc2_w -7400265451384713343
// 0e8: lload 3
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: iload 7
// 0f1: iload 8
// 0f3: isub
// 0f4: iload 9
// 0f6: idiv
// 0f7: istore 10
// 0f9: bipush 0
// 0fa: iload 10
// 0fc: aload 5
// 0fe: ifnull 13e
// 101: if_icmpgt 153
// 104: goto 111
// 107: ldc2_w -7400265451384713343
// 10a: lload 3
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: iload 10
// 113: aload 5
// 115: ifnull 150
// 118: goto 125
// 11b: ldc2_w -7400265451384713343
// 11e: lload 3
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 0
// 126: getfield su/catlean/tf.I Ljava/util/List;
// 129: checkcast java/util/Collection
// 12c: invokeinterface java/util/Collection.size ()I 1
// 131: goto 13e
// 134: ldc2_w -7400265451384713343
// 137: lload 3
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: if_icmpge 14f
// 141: bipush 1
// 142: goto 154
// 145: ldc2_w -7400265451384713343
// 148: lload 3
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: bipush 0
// 150: goto 154
// 153: bipush 0
// 154: ifeq 176
// 157: aload 0
// 158: aload 0
// 159: getfield su/catlean/tf.I Ljava/util/List;
// 15c: iload 10
// 15e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 163: checkcast su/catlean/_s
// 166: putfield su/catlean/tf.u Lsu/catlean/_s;
// 169: goto 176
// 16c: ldc2_w -7400265451384713343
// 16f: lload 3
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 0
// 177: aload 1
// 178: iload 2
// 179: invokespecial net/minecraft/class_437.method_25402 (Lnet/minecraft/class_11909;Z)Z
// 17c: ireturn
}

private final double m(double var1) {
return var1;
}

private final String h(double var1) {
return String.valueOf(MathKt.roundToInt(var1 * 1000.0) / 1000.0);
}

static {
long var16 = b ^ 82303988061871L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[20];
int var23 = 0;
String var22 = "88²\u000búÀµ\n\u001f.C\u0098J-«È\u0010Ó÷\u001c¥¼Ã`>/ó¸²è\b\u0010\u001a ÃÙ`e0{d\u0094Ómt¦\u0086Ok,Ä\u0011Þä\u0083EÒ\u007f\u0085W¾\u0087m«\u0015\u009a\u0010ôØ\"\u009aT\u0019ÈP\u009fUà\u0095y\u007fãæ\u0010¥Tì\u000fo\u000eGà\u0010J¤Ó@x÷!\u0010P°\u0014N*Á¡m\u0093\u00144¸\u00adu£0 µ\u0084Æ¨Éþë\u008fË»\f\u0017[\u001d\u009bo\u0082ìîlQÂS\u000b{O!fËÏ÷d\u0010\u0010_aÑ\u0013\u008e_ÀM\u0000\\\u009eXòVD\u0018Öv\u0082\u0011ü@ü\u0081½|H/&4*\u00ad¸à\u0091Âät\u000e6\u0018ÝÓ8r!\u009b|\u001cuhA÷\u0090ô\u008eá\u0003·\u0006\u0080¥_,ï\u0018¸\u0093Ë÷\u00ad\u008cnGañsS\u0013\u0084\u009aÔíjP«õ\u009e\u009b÷\u0010<·h&ÓÍb\u001e(¬~\u009eÄ\u0012S>\u0010F²KÛx\n©¥®²F6\u0091 _° ¥ÿªf\u000f\u0014øÔ¸©ÅÒ{¶\u0092TbãÁ\u0010\u0080ÐÖ ï~¼ço\u00814%\u0018þ\u0093V8ed£ZN\bÞwÖð\u001e©Õ1\u0096»\u009fMÛÖ o\u0000»\u0091v\u0082G{ð*$ß&~a\u0001'ì\u009cÐ\u0007øWFÑ/×5\u0085æÅ\u0014\u0010ô{\u0019\u0085 ôóµV¿$\bM·w\u0002\u0010ÿ\t\u0004óH\u008cZD¦0kHa\u008a#¤";
int var24 = "88²\u000búÀµ\n\u001f.C\u0098J-«È\u0010Ó÷\u001c¥¼Ã`>/ó¸²è\b\u0010\u001a ÃÙ`e0{d\u0094Ómt¦\u0086Ok,Ä\u0011Þä\u0083EÒ\u007f\u0085W¾\u0087m«\u0015\u009a\u0010ôØ\"\u009aT\u0019ÈP\u009fUà\u0095y\u007fãæ\u0010¥Tì\u000fo\u000eGà\u0010J¤Ó@x÷!\u0010P°\u0014N*Á¡m\u0093\u00144¸\u00adu£0 µ\u0084Æ¨Éþë\u008fË»\f\u0017[\u001d\u009bo\u0082ìîlQÂS\u000b{O!fËÏ÷d\u0010\u0010_aÑ\u0013\u008e_ÀM\u0000\\\u009eXòVD\u0018Öv\u0082\u0011ü@ü\u0081½|H/&4*\u00ad¸à\u0091Âät\u000e6\u0018ÝÓ8r!\u009b|\u001cuhA÷\u0090ô\u008eá\u0003·\u0006\u0080¥_,ï\u0018¸\u0093Ë÷\u00ad\u008cnGañsS\u0013\u0084\u009aÔíjP«õ\u009e\u009b÷\u0010<·h&ÓÍb\u001e(¬~\u009eÄ\u0012S>\u0010F²KÛx\n©¥®²F6\u0091 _° ¥ÿªf\u000f\u0014øÔ¸©ÅÒ{¶\u0092TbãÁ\u0010\u0080ÐÖ ï~¼ço\u00814%\u0018þ\u0093V8ed£ZN\bÞwÖð\u001e©Õ1\u0096»\u009fMÛÖ o\u0000»\u0091v\u0082G{ð*$ß&~a\u0001'ì\u009cÐ\u0007øWFÑ/×5\u0085æÅ\u0014\u0010ô{\u0019\u0085 ôóµV¿$\bM·w\u0002\u0010ÿ\t\u0004óH\u008cZD¦0kHa\u008a#¤"
.length();
char var21 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
c = var25;
d = new String[20];
k = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[26];
int var8 = 0;
String var9 = "ù0z\u007f]àHÃ8Z\u008cþ\u0089úÕ¦\u001e\u0000\u0086R\u000e$Ú\u001c\u009cC0wÂéÑ©\u001cmð#¶\u008f²¦Éûù-\u0002°\u009c\u0003a¦\u000e¿Êö½ú\n¾,)~V®\u000b\u008b\u0017\nðÌ²\\Ë¹\\6êT%rq\u0085\u0010ÍÛ\u009f¬\u008f\u0015õfÂÖ©rêÁÜùú~®\u008bÔc·#´a#6âDe\u001b^BÈ³\u0094¸OÆ9\u0081c\u0098±'\t\u0018\nù\n]S-X¸+×·\u008a@M\u0092ò5béM þ\u008e©¦m1êkL\"\u009dåoj8\u0097©Ü\u0081@\u001b\u0097¼ï<H\u009f,*¡A\u0080vÒ²\u0017ï÷g\u0003\u00ad";
int var10 = "ù0z\u007f]àHÃ8Z\u008cþ\u0089úÕ¦\u001e\u0000\u0086R\u000e$Ú\u001c\u009cC0wÂéÑ©\u001cmð#¶\u008f²¦Éûù-\u0002°\u009c\u0003a¦\u000e¿Êö½ú\n¾,)~V®\u000b\u008b\u0017\nðÌ²\\Ë¹\\6êT%rq\u0085\u0010ÍÛ\u009f¬\u008f\u0015õfÂÖ©rêÁÜùú~®\u008bÔc·#´a#6âDe\u001b^BÈ³\u0094¸OÆ9\u0081c\u0098±'\t\u0018\nù\n]S-X¸+×·\u008a@M\u0092ò5béM þ\u008e©¦m1êkL\"\u009dåoj8\u0097©Ü\u0081@\u001b\u0097¼ï<H\u009f,*¡A\u0080vÒ²\u0017ï÷g\u0003\u00ad"
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
i = var11;
j = new Integer[26];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2987269001150872779L;
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
l = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "U»Ë\u0004ç\u0091\u0083¹Üvs»]>òÏ";
var10 = "U»Ë\u0004ç\u0091\u0083¹Üvs»]>òÏ".length();
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

var22 = "Æö\u009ev\rÑ\u0098\u0095lF\u001fÀG~wØ \u0090û&£GGL¶¼#\u00ad\u0015âÖº\u0018pâù,5«\u001dçs¿\u0014\u0016\u0081ÕU*";
var24 = "Æö\u009ev\rÑ\u0098\u0095lF\u001fÀG~wØ \u0090û&£GGL¶¼#\u00ad\u0015âÖº\u0018pâù,5«\u001dçs¿\u0014\u0016\u0081ÕU*".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30217;
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
throw new RuntimeException("su/catlean/tf", var10);
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
throw new RuntimeException("su/catlean/tf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22501;
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
throw new RuntimeException("su/catlean/tf", var14);
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
throw new RuntimeException("su/catlean/tf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
