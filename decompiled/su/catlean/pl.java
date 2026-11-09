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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pl extends gf {
@NotNull
public static final pl N;
@NotNull
private static final cq R;
@NotNull
private static final cq c;
@NotNull
private static final cq E;
@NotNull
private static final cq h;
@NotNull
private static final cq m;
@NotNull
private static final cq y;
@NotNull
private static final cq O;
private static final long a = yz.a(3253173483629988902L, -2862634010910326185L, MethodHandles.lookup().lookupClass()).a(139530684506669L);
private static final String[] b;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] i;
private static final Integer[] k;
private static final Map l;

private pl(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 40107945685868L;
int var3 = (int)((var1 ^ 40107945685868L) >>> 48);
int var4 = (int)((var1 ^ 40107945685868L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"p">(23029, 3714729669287709909L ^ var1), (char)var5);
}

private final boolean y(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 51234942695119L;
return (Boolean)R.E(this, var6, n[0]);
}

private final boolean v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63763284703669L;
return (Boolean)c.E(this, var3, n[1]);
}

private final boolean g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63016436155165L;
return (Boolean)E.E(this, var3, n[2]);
}

private final boolean j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 117154015412001L;
return (Boolean)h.E(this, var3, n[3]);
}

private final boolean a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 62498629570608L;
return (Boolean)m.E(this, var3, n[4]);
}

private final boolean H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 51653178845481L;
return (Boolean)y.E(this, var3, n[5]);
}

private final boolean S(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 84762914557447L;
return (Boolean)O.E(this, var6, n[d<"u">(26321, 2717073318309412922L ^ var4)]);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 50910300018319
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 124694419039781
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 7291883418847
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 58809736933323
// 01a: lxor
// 01b: dup2
// 01c: bipush 16
// 01e: lushr
// 01f: lstore 10
// 021: dup2
// 022: bipush 48
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 12
// 02b: pop2
// 02c: dup2
// 02d: ldc2_w 95600647083779
// 030: lxor
// 031: dup2
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 13
// 038: dup2
// 039: bipush 32
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 14
// 042: dup2
// 043: bipush 48
// 045: lshl
// 046: bipush 48
// 048: lushr
// 049: l2i
// 04a: istore 15
// 04c: pop2
// 04d: dup2
// 04e: ldc2_w 118028023098805
// 051: lxor
// 052: lstore 16
// 054: dup2
// 055: ldc2_w 104104530525409
// 058: lxor
// 059: dup2
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 18
// 060: dup2
// 061: bipush 16
// 063: lshl
// 064: bipush 32
// 066: lushr
// 067: l2i
// 068: istore 19
// 06a: dup2
// 06b: bipush 48
// 06d: lshl
// 06e: bipush 48
// 070: lushr
// 071: l2i
// 072: istore 20
// 074: pop2
// 075: dup2
// 076: ldc2_w 122621818626690
// 079: lxor
// 07a: lstore 21
// 07c: dup2
// 07d: ldc2_w 38698685614388
// 080: lxor
// 081: lstore 23
// 083: dup2
// 084: ldc2_w 37502280442033
// 087: lxor
// 088: lstore 25
// 08a: dup2
// 08b: ldc2_w 20173347401993
// 08e: lxor
// 08f: lstore 27
// 091: dup2
// 092: ldc2_w 58410826854445
// 095: lxor
// 096: lstore 29
// 098: dup2
// 099: ldc2_w 99949442920536
// 09c: lxor
// 09d: lstore 31
// 09f: dup2
// 0a0: ldc2_w 38163162552857
// 0a3: lxor
// 0a4: lstore 33
// 0a6: dup2
// 0a7: ldc2_w 30591967126976
// 0aa: lxor
// 0ab: lstore 35
// 0ad: pop2
// 0ae: aload 3
// 0af: sipush 22100
// 0b2: ldc2_w 8366041495993194470
// 0b5: lload 1
// 0b6: lxor
// 0b7: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: ldc2_w -5990947769900206742
// 0c2: lload 1
// 0c3: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: bipush 2
// 0c9: istore 43
// 0cb: istore 42
// 0cd: new java/util/ArrayList
// 0d0: dup
// 0d1: invokespecial java/util/ArrayList.<init> ()V
// 0d4: checkcast java/util/List
// 0d7: astore 44
// 0d9: aload 0
// 0da: lload 10
// 0dc: iload 12
// 0de: i2c
// 0df: invokespecial su/catlean/pl.y (JC)Z
// 0e2: iload 42
// 0e4: ifne 126
// 0e7: ifeq 120
// 0ea: goto 0f7
// 0ed: ldc2_w -6035236062151250666
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 44
// 0f9: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 0fc: dup
// 0fd: sipush 31487
// 100: ldc2_w 4428368038221298521
// 103: lload 1
// 104: lxor
// 105: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 112: pop
// 113: goto 120
// 116: ldc2_w -6035236062151250666
// 119: lload 1
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: aload 0
// 121: lload 25
// 123: invokespecial su/catlean/pl.v (J)Z
// 126: iload 42
// 128: lload 1
// 129: lconst_0
// 12a: lcmp
// 12b: ifle 171
// 12e: ifne 16f
// 131: ifeq 169
// 134: goto 141
// 137: ldc2_w -6035236062151250666
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 44
// 143: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
// 146: dup
// 147: bipush 118
// 149: ldc2_w 5920896193054622149
// 14c: lload 1
// 14d: lxor
// 14e: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 156: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 15b: pop
// 15c: goto 169
// 15f: ldc2_w -6035236062151250666
// 162: lload 1
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 0
// 16a: lload 29
// 16c: invokespecial su/catlean/pl.H (J)Z
// 16f: iload 42
// 171: lload 1
// 172: lconst_0
// 173: lcmp
// 174: ifle 1bb
// 177: ifne 1b9
// 17a: ifeq 1b3
// 17d: goto 18a
// 180: ldc2_w -6035236062151250666
// 183: lload 1
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: aload 44
// 18c: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
// 18f: dup
// 190: sipush 3355
// 193: ldc2_w 1169720343796665517
// 196: lload 1
// 197: lxor
// 198: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1a5: pop
// 1a6: goto 1b3
// 1a9: ldc2_w -6035236062151250666
// 1ac: lload 1
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: aload 0
// 1b4: lload 33
// 1b6: invokespecial su/catlean/pl.g (J)Z
// 1b9: iload 42
// 1bb: lload 1
// 1bc: lconst_0
// 1bd: lcmp
// 1be: iflt 205
// 1c1: ifne 203
// 1c4: ifeq 1fd
// 1c7: goto 1d4
// 1ca: ldc2_w -6035236062151250666
// 1cd: lload 1
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: aload 44
// 1d6: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
// 1d9: dup
// 1da: sipush 11778
// 1dd: ldc2_w 8885253949569167290
// 1e0: lload 1
// 1e1: lxor
// 1e2: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1ef: pop
// 1f0: goto 1fd
// 1f3: ldc2_w -6035236062151250666
// 1f6: lload 1
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: aload 0
// 1fe: lload 6
// 200: invokespecial su/catlean/pl.j (J)Z
// 203: iload 42
// 205: lload 1
// 206: lconst_0
// 207: lcmp
// 208: iflt 255
// 20b: ifne 24d
// 20e: ifeq 247
// 211: goto 21e
// 214: ldc2_w -6035236062151250666
// 217: lload 1
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: aload 44
// 220: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
// 223: dup
// 224: sipush 12728
// 227: ldc2_w 6767183082286641178
// 22a: lload 1
// 22b: lxor
// 22c: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 234: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 239: pop
// 23a: goto 247
// 23d: ldc2_w -6035236062151250666
// 240: lload 1
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 0
// 248: lload 23
// 24a: invokespecial su/catlean/pl.a (J)Z
// 24d: lload 1
// 24e: lconst_0
// 24f: lcmp
// 250: ifle 2b5
// 253: iload 42
// 255: ifne 2b5
// 258: ifeq 291
// 25b: goto 268
// 25e: ldc2_w -6035236062151250666
// 261: lload 1
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: aload 44
// 26a: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 26d: dup
// 26e: sipush 31904
// 271: ldc2_w 4427593142200778041
// 274: lload 1
// 275: lxor
// 276: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 283: pop
// 284: goto 291
// 287: ldc2_w -6035236062151250666
// 28a: lload 1
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: lload 1
// 292: lconst_0
// 293: lcmp
// 294: ifle 354
// 297: aload 0
// 298: iload 42
// 29a: ifne 2eb
// 29d: iload 13
// 29f: iload 14
// 2a1: i2s
// 2a2: iload 15
// 2a4: i2c
// 2a5: invokespecial su/catlean/pl.S (ISC)Z
// 2a8: goto 2b5
// 2ab: ldc2_w -6035236062151250666
// 2ae: lload 1
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: lload 1
// 2b6: lconst_0
// 2b7: lcmp
// 2b8: ifle 2d9
// 2bb: ifeq 2e7
// 2be: aload 44
// 2c0: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
// 2c3: dup
// 2c4: sipush 27213
// 2c7: ldc2_w 5103039577121139669
// 2ca: lload 1
// 2cb: lxor
// 2cc: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2d4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2d9: pop
// 2da: goto 2e7
// 2dd: ldc2_w -6035236062151250666
// 2e0: lload 1
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: aload 0
// 2e8: checkcast su/catlean/gf
// 2eb: aload 3
// 2ec: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2ef: dup
// 2f0: sipush 30325
// 2f3: ldc2_w 1608666870031529946
// 2f6: lload 1
// 2f7: lxor
// 2f8: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 300: aload 0
// 301: lload 35
// 303: invokevirtual su/catlean/pl.p (J)F
// 306: aload 0
// 307: lload 4
// 309: invokevirtual su/catlean/pl.V (J)F
// 30c: iload 18
// 30e: i2s
// 30f: swap
// 310: iload 19
// 312: swap
// 313: fconst_1
// 314: ldc 20.0
// 316: aload 44
// 318: invokeinterface java/util/List.size ()I 1
// 31d: i2f
// 31e: fmul
// 31f: fadd
// 320: ldc 29.0
// 322: iload 20
// 324: i2s
// 325: fconst_0
// 326: bipush 0
// 327: sipush 30418
// 32a: ldc2_w 8725247916291964759
// 32d: lload 1
// 32e: lxor
// 32f: invokedynamic u (IJ)I bsm=su/catlean/pl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: aconst_null
// 335: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 338: aload 3
// 339: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 33c: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 33f: pop
// 340: aload 3
// 341: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 344: aload 0
// 345: lload 35
// 347: invokevirtual su/catlean/pl.p (J)F
// 34a: aload 0
// 34b: lload 4
// 34d: invokevirtual su/catlean/pl.V (J)F
// 350: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 353: pop
// 354: aload 44
// 356: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 35b: astore 45
// 35d: aload 45
// 35f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 364: ifeq 4a2
// 367: aload 45
// 369: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 36e: checkcast net/minecraft/class_1792
// 371: astore 46
// 373: iload 42
// 375: lload 1
// 376: lconst_0
// 377: lcmp
// 378: iflt 388
// 37b: ifne 4c3
// 37e: aload 46
// 380: aload 44
// 382: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
// 385: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 388: iload 42
// 38a: ifne 405
// 38d: goto 39a
// 390: ldc2_w -6035236062151250666
// 393: lload 1
// 394: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: athrow
// 39a: ifne 3ec
// 39d: goto 3aa
// 3a0: ldc2_w -6035236062151250666
// 3a3: lload 1
// 3a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: athrow
// 3aa: lload 16
// 3ac: aload 0
// 3ad: checkcast su/catlean/gf
// 3b0: aload 3
// 3b1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3b4: dup
// 3b5: sipush 25867
// 3b8: ldc2_w 4207627396636648610
// 3bb: lload 1
// 3bc: lxor
// 3bd: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3c5: iload 43
// 3c7: i2f
// 3c8: ldc 17.5
// 3ca: fadd
// 3cb: ldc 7.0
// 3cd: fconst_0
// 3ce: sipush 24783
// 3d1: ldc2_w 6969792162320066894
// 3d4: lload 1
// 3d5: lxor
// 3d6: invokedynamic u (IJ)I bsm=su/catlean/pl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: aconst_null
// 3dc: invokestatic su/catlean/gf.u (JLsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FFFILjava/lang/Object;)V
// 3df: goto 3ec
// 3e2: ldc2_w -6035236062151250666
// 3e5: lload 1
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: aload 3
// 3ed: aload 46
// 3ef: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 3f2: iload 43
// 3f4: bipush 2
// 3f5: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 3f8: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 3fb: lload 21
// 3fd: aload 46
// 3ff: bipush 0
// 400: bipush 2
// 401: aconst_null
// 402: invokestatic su/catlean/gg.k (Lsu/catlean/gg;JLnet/minecraft/class_1792;ZILjava/lang/Object;)I
// 405: istore 47
// 407: iload 47
// 409: iload 42
// 40b: ifne 420
// 40e: ifle 426
// 411: goto 41e
// 414: ldc2_w -6035236062151250666
// 417: lload 1
// 418: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41d: athrow
// 41e: iload 47
// 420: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 423: goto 428
// 426: ldc "-"
// 428: astore 48
// 42a: lload 31
// 42c: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 42f: aload 3
// 430: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 433: dup
// 434: sipush 25867
// 437: ldc2_w 4207627396636648610
// 43a: lload 1
// 43b: lxor
// 43c: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 444: aload 48
// 446: iload 43
// 448: i2f
// 449: ldc 8.0
// 44b: fadd
// 44c: lload 31
// 44e: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 451: lload 27
// 453: aload 48
// 455: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 458: fconst_2
// 459: fdiv
// 45a: fsub
// 45b: ldc 18.0
// 45d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 460: dup
// 461: sipush 24829
// 464: ldc2_w 8724367972025344342
// 467: lload 1
// 468: lxor
// 469: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/pl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 471: bipush 0
// 472: bipush 0
// 473: sipush 6196
// 476: ldc2_w 6581319815398609328
// 479: lload 1
// 47a: lxor
// 47b: invokedynamic u (IJ)I bsm=su/catlean/pl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 480: aconst_null
// 481: astore 37
// 483: istore 38
// 485: istore 39
// 487: istore 40
// 489: astore 41
// 48b: lload 8
// 48d: aload 41
// 48f: iload 40
// 491: iload 39
// 493: iload 38
// 495: aload 37
// 497: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 49a: iinc 43 20
// 49d: iload 42
// 49f: ifeq 35d
// 4a2: aload 3
// 4a3: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4a6: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 4a9: pop
// 4aa: aload 0
// 4ab: fconst_1
// 4ac: aload 44
// 4ae: invokeinterface java/util/List.size ()I 1
// 4b3: i2f
// 4b4: ldc 20.0
// 4b6: fmul
// 4b7: fadd
// 4b8: ldc 29.0
// 4ba: invokevirtual su/catlean/pl.X (FF)V
// 4bd: lload 1
// 4be: lconst_0
// 4bf: lcmp
// 4c0: iflt 4c3
// 4c3: return
}

@Override
public void H(@NotNull class_332 context, long a) {
long var10001 = ax ^ 1549896540735L;
int var4 = (int)((ax ^ 1549896540735L) >>> 32);
int var5 = (int)((ax ^ 1549896540735L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = ax ^ 26980051417349L;
Intrinsics.checkNotNullParameter(context, b<"p">(15899, 8568995777682437885L ^ ax));
b8.f(var7).g(var4, (char)var5, (short)var6);
}

static {
long var20 = a ^ 12859609424143L;
long var22 = var20 ^ 57916652658614L;
long var24 = var20 ^ 129088906336488L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[34];
int var16 = 0;
String var15 = "õ=\u009b\u0016Áz$\u0086\u0001\u009dªª\u009eìêWÞ\u0019)Ðpy:8N'ð§Ë#b'\u0005æ}p¶ê®å \u008a_\u0092/\u0096g\u0080\u008dø\u001bíSÔ&AÔßÙ\u008bH\u0098Þó\u001cPÐI¥\u008a×\n½\u0018\u0081ª^%\u0084¼\u001açî\rR;G\u009dÝëv\u001eÇ\u009bÈà\u0014Û\u00108ÙQh)âü´ÖÿÒfQ\u0004q\u0000\u0010ÂÙt\u0002\u0013\u0011m¨¡\u0098N\u0013å}VI\u0010{Öv\u0081Ç\u0004³)\u009c7ñ£f\u0007]p\u0018\u007fC-Lï±þ\u0017p±;lDp\u0086\u0080\u0007\u00ad\u009b{ù\rÎú\u0018\u0018»¯j\u008bÁDR\u001eÊ1\u0019ÈøÀÃ»2æäP \u0085F\u0010GãC¹jÊ\u0090\u0011\u001fÞ³Ä\u0082xºÉ \u0099\u001d\u0011\u0084Ö\u008f;²/;\u0002¨L\u0084è*Ûôúç]\u0089ù×¡\u0085pé\u0096XeÔ\u0010\u000b\u0017Ö s\u0092À\u0092\u001c¿ÎG\u0094«}G \u008aÇmÆÔ|³6OÈ+\u0094R-\u009dÏ¾´^\u000fuLº\u0099û\u0004]\b\u0006I\u0012H\u0010>\u00adZI6¡\u009aË\u007f\u0016[²Å\u0019(\u009c\u0010\u0085\u0013³ÓÞda8\u001b:÷{\u0010gXø(@Þ·©Á\u009c?0\u0082\u001a\u0085ªP\u000fj1\t¿\u009et%\n\u001b®l\u0097bÜBa)êÉÄ÷\u0006K±]¾\u0018öÑLäJaX\u00009þjlç\u008ac\u000b\u0084\u0082S¤\u001e\u0007{m\u0018Ñ\u0017×1ÕU\u0011¤\n|Á\u0092¾\bAf\u0092Íø>,k^i $¸\u0086\u001f¸ãÊ\u009bá®lí\u0000ð\u009bÇ-\f\u008e½°¾à\u0015X\u0089|l¹\r1\u0098\u0018>zé\u0007ÛÜ\u001fK![_A§öõo\u0080\u0093f\u0093M\u0015\u008aÂ\u0010{±\u008f Ýñ\u009bz.ÕB²xêø\u0094((\u000eg1\u0088Ì×êµ\u0086\u009d\r&¬G\u0010Ëx¾\u0089ì´¦ñ1¾\u008aÖM?;x®y,¬+í\u008e% º\u00116hö0\u0016¯]þ½\u009c6\u0091]d:\u0016¿þ/Ì\u001eDJFï\u0004Õ£\\1\u00102L=û0¬_¹S\u008bóA\tsX2\u0018E7lXßxR@\u0010ê\u0094>4³Iê\u009d\u0013f7æ÷°x \u0007·\u000f\u009c&âw¥\u008fó8Ã]\u0082?`Ü\nÁ9{y½\bëÎmS\u0005þDi\u0010¬íLÀ*â\u0082êSJ¤p*Ì\u00833 Û d(üÿ$ÚW\u0016dÇ\u0011\u0080o\u008eÄô¯I¡ho=\u0013/BßªÚ\u009fØ\u0010\u0085«Éu\u0007©Xg\"¢ÊE!¥\u008c\u0012 £ë¿TK\t#\u0095^üÎ\u001c,ÑÅÆ§\u0003¦Jøÿ\u000bÿ\u0087<j\u0012å\u0015?\u0015 !W\u001fC\u0094Õ_¯áwj÷Ø\u008cÃy\t-pJFïÚ{¦\u008dî\u001b\u0087¡\u0097ã(gy\u000fitÍiÞÕz³ÌèÌu\u0096\u0088Úx\u009f.C[ì±ª³?\u009a\u009e±Âð\u0001¹_@Í\u009b'\u0018t\u001d.a\u009f@\u0093¿\u0004\"\u001b\u009e*>F\u0011-SFU1K\n\u008d";
int var17 = "õ=\u009b\u0016Áz$\u0086\u0001\u009dªª\u009eìêWÞ\u0019)Ðpy:8N'ð§Ë#b'\u0005æ}p¶ê®å \u008a_\u0092/\u0096g\u0080\u008dø\u001bíSÔ&AÔßÙ\u008bH\u0098Þó\u001cPÐI¥\u008a×\n½\u0018\u0081ª^%\u0084¼\u001açî\rR;G\u009dÝëv\u001eÇ\u009bÈà\u0014Û\u00108ÙQh)âü´ÖÿÒfQ\u0004q\u0000\u0010ÂÙt\u0002\u0013\u0011m¨¡\u0098N\u0013å}VI\u0010{Öv\u0081Ç\u0004³)\u009c7ñ£f\u0007]p\u0018\u007fC-Lï±þ\u0017p±;lDp\u0086\u0080\u0007\u00ad\u009b{ù\rÎú\u0018\u0018»¯j\u008bÁDR\u001eÊ1\u0019ÈøÀÃ»2æäP \u0085F\u0010GãC¹jÊ\u0090\u0011\u001fÞ³Ä\u0082xºÉ \u0099\u001d\u0011\u0084Ö\u008f;²/;\u0002¨L\u0084è*Ûôúç]\u0089ù×¡\u0085pé\u0096XeÔ\u0010\u000b\u0017Ö s\u0092À\u0092\u001c¿ÎG\u0094«}G \u008aÇmÆÔ|³6OÈ+\u0094R-\u009dÏ¾´^\u000fuLº\u0099û\u0004]\b\u0006I\u0012H\u0010>\u00adZI6¡\u009aË\u007f\u0016[²Å\u0019(\u009c\u0010\u0085\u0013³ÓÞda8\u001b:÷{\u0010gXø(@Þ·©Á\u009c?0\u0082\u001a\u0085ªP\u000fj1\t¿\u009et%\n\u001b®l\u0097bÜBa)êÉÄ÷\u0006K±]¾\u0018öÑLäJaX\u00009þjlç\u008ac\u000b\u0084\u0082S¤\u001e\u0007{m\u0018Ñ\u0017×1ÕU\u0011¤\n|Á\u0092¾\bAf\u0092Íø>,k^i $¸\u0086\u001f¸ãÊ\u009bá®lí\u0000ð\u009bÇ-\f\u008e½°¾à\u0015X\u0089|l¹\r1\u0098\u0018>zé\u0007ÛÜ\u001fK![_A§öõo\u0080\u0093f\u0093M\u0015\u008aÂ\u0010{±\u008f Ýñ\u009bz.ÕB²xêø\u0094((\u000eg1\u0088Ì×êµ\u0086\u009d\r&¬G\u0010Ëx¾\u0089ì´¦ñ1¾\u008aÖM?;x®y,¬+í\u008e% º\u00116hö0\u0016¯]þ½\u009c6\u0091]d:\u0016¿þ/Ì\u001eDJFï\u0004Õ£\\1\u00102L=û0¬_¹S\u008bóA\tsX2\u0018E7lXßxR@\u0010ê\u0094>4³Iê\u009d\u0013f7æ÷°x \u0007·\u000f\u009c&âw¥\u008fó8Ã]\u0082?`Ü\nÁ9{y½\bëÎmS\u0005þDi\u0010¬íLÀ*â\u0082êSJ¤p*Ì\u00833 Û d(üÿ$ÚW\u0016dÇ\u0011\u0080o\u008eÄô¯I¡ho=\u0013/BßªÚ\u009fØ\u0010\u0085«Éu\u0007©Xg\"¢ÊE!¥\u008c\u0012 £ë¿TK\t#\u0095^üÎ\u001c,ÑÅÆ§\u0003¦Jøÿ\u000bÿ\u0087<j\u0012å\u0015?\u0015 !W\u001fC\u0094Õ_¯áwj÷Ø\u008cÃy\t-pJFïÚ{¦\u008dî\u001b\u0087¡\u0097ã(gy\u000fitÍiÞÕz³ÌèÌu\u0096\u0088Úx\u009f.C[ì±ª³?\u009a\u009e±Âð\u0001¹_@Í\u009b'\u0018t\u001d.a\u009f@\u0093¿\u0004\"\u001b\u009e*>F\u0011-SFU1K\n\u008d"
.length();
char var14 = '(';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
f = new String[34];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "â\u0015Ð¡Ï²Sk\u000e\u0013\u00843ð\u007f\u0015)Çû;VB\u0012Ð\u0081%®!D;.Ï*½ãÌ\u009fÏ¨\u0012,í\u007f\u0083+\u007fpjµ";
int var5 = "â\u0015Ð¡Ï²Sk\u000e\u0013\u00843ð\u007f\u0015)Çû;VB\u0012Ð\u0081%®!D;.Ï*½ãÌ\u009fÏ¨\u0012,í\u007f\u0083+\u007fpjµ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
i = var6;
k = new Integer[8];
KProperty[] var26 = new KProperty[d<"u">(17822, 2376224213756344343L ^ var20)];
var26[0] = Reflection.property1(
new PropertyReference1Impl(pl.class, b<"p">(23920, 7404340044195784899L ^ var20), b<"p">(20948, 7240747316552033377L ^ var20), 0)
);
var26[1] = Reflection.property1(
new PropertyReference1Impl(pl.class, b<"p">(1388, 3842814827102875858L ^ var20), b<"p">(16268, 2200300061339388452L ^ var20), 0)
);
var26[2] = Reflection.property1(new PropertyReference1Impl(pl.class, b<"p">(1586, 1256166154725503891L ^ var20), b<"p">(4226, 1041087607565493541L ^ var20), 0));
var26[3] = Reflection.property1(new PropertyReference1Impl(pl.class, b<"p">(6567, 2352674545064619025L ^ var20), b<"p">(5507, 2584127109201043489L ^ var20), 0));
var26[4] = Reflection.property1(new PropertyReference1Impl(pl.class, b<"p">(7963, 6237161746332297905L ^ var20), b<"p">(4619, 7796653292022605728L ^ var20), 0));
var26[5] = Reflection.property1(
new PropertyReference1Impl(pl.class, b<"p">(28765, 5972338817353729523L ^ var20), b<"p">(25045, 111095039952016506L ^ var20), 0)
);
var26[d<"u">(13126, 1955603585524272846L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(pl.class, b<"p">(3647, 4263153278925388691L ^ var20), b<"p">(28690, 5064706226650564023L ^ var20), 0)
);
n = var26;
N = new pl(var24);
R = yp.t(N, b<"p">(9453, 9142400379168002390L ^ var20), true, var22, null, null, d<"u">(8685, 1469678748104039520L ^ var20), null);
c = yp.t(N, b<"p">(10355, 9036546641009319363L ^ var20), true, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
E = yp.t(N, b<"p">(14202, 279433890455192264L ^ var20), true, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
h = yp.t(N, b<"p">(32279, 8500944350940023718L ^ var20), false, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
m = yp.t(N, b<"p">(21557, 8542958491737842061L ^ var20), true, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
y = yp.t(N, b<"p">(222, 8494862383225582948L ^ var20), true, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
O = yp.t(N, b<"p">(1185, 4323289039095050526L ^ var20), false, var22, null, null, d<"u">(31331, 1556401710552598508L ^ var20), null);
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "¿kÑQ\u0085%§ì\u0010\u001dº·¥\u0088\u009e\r";
var5 = "¿kÑQ\u0085%§ì\u0010\u001dº·¥\u0088\u009e\r".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "\u0001ÙÞf«\u0086:\u0094Ê½÷lq¢\u0004UÆ\u0015/¹W\u0015\u0000\u0017Õ\u000b\u0000KñªÜ\u0013 W\u009f/í=²«\u0091ø¶·Êù\u0096»{¾ë\u000et\u0087pÄ.\u009bj¹Ý\u0080ë/\u0092";
var17 = "\u0001ÙÞf«\u0086:\u0094Ê½÷lq¢\u0004UÆ\u0015/¹W\u0015\u0000\u0017Õ\u000b\u0000KñªÜ\u0013 W\u009f/í=²«\u0091ø¶·Êù\u0096»{¾ë\u000et\u0087pÄ.\u009bj¹Ý\u0080ë/\u0092"
.length();
var14 = ' ';
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27859;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pl", var10);
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
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/pl" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25834;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
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
throw new RuntimeException("su/catlean/pl", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/pl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
