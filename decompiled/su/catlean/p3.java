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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p3 extends gf {
@NotNull
public static final p3 Y;
@NotNull
private static final List i;
@Nullable
private static class_1309 B;
@NotNull
private static final fd K;
@NotNull
private static final fd O;
private static int Q;
private static final long a = yz.a(-7957233438780448904L, 6258790527258338699L, MethodHandles.lookup().lookupClass()).a(108401461291289L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map k;

private p3(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 13325641196433L;
int var3 = (int)((var1 ^ 13325641196433L) >>> 48);
int var4 = (int)((var1 ^ 13325641196433L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"f">(18689, 1268051633365095318L ^ var1), (char)var5);
}

@Nullable
public final class_1309 H() {
return B;
}

public final void S(@Nullable class_1309 <set-?>) {
B = <set-?>;
}

@NotNull
public final fd O() {
return K;
}

@Override
public void w(long param1) {
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
// 002: ldc2_w 50830991023686
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 121690619240855
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 100272641512152
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 38798774274332
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 70886708780098
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: ldc2_w 6612689061597532343
// 027: lload 1
// 028: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: istore 13
// 02f: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 032: iload 13
// 034: ifeq 05b
// 037: ifnull 0e8
// 03a: goto 047
// 03d: ldc2_w 6563337635985015003
// 040: lload 1
// 041: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: athrow
// 047: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 04a: dup
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 04e: goto 05b
// 051: ldc2_w 6563337635985015003
// 054: lload 1
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: invokevirtual net/minecraft/class_1309.method_29504 ()Z
// 05e: iload 13
// 060: ifeq 0f6
// 063: ifeq 0e8
// 066: goto 073
// 069: ldc2_w 6563337635985015003
// 06c: lload 1
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 076: instanceof net/minecraft/class_1657
// 079: iload 13
// 07b: ifeq 0f6
// 07e: goto 08b
// 081: ldc2_w 6563337635985015003
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 1
// 08c: lconst_0
// 08d: lcmp
// 08e: iflt 0e9
// 091: ifeq 0e8
// 094: goto 0a1
// 097: ldc2_w 6563337635985015003
// 09a: lload 1
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 0a4: lload 9
// 0a6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ac: iload 13
// 0ae: ifeq 0f6
// 0b1: goto 0be
// 0b4: ldc2_w 6563337635985015003
// 0b7: lload 1
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: ifne 0e8
// 0c1: goto 0ce
// 0c4: ldc2_w 6563337635985015003
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: getstatic su/catlean/p3.Q I
// 0d1: istore 14
// 0d3: iload 14
// 0d5: bipush 1
// 0d6: iadd
// 0d7: putstatic su/catlean/p3.Q I
// 0da: iload 14
// 0dc: pop
// 0dd: lload 1
// 0de: lconst_0
// 0df: lcmp
// 0e0: iflt 0f9
// 0e3: iload 13
// 0e5: ifne 0f9
// 0e8: bipush 0
// 0e9: goto 0f6
// 0ec: ldc2_w 6563337635985015003
// 0ef: lload 1
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: putstatic su/catlean/p3.Q I
// 0f9: lload 1
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: iflt 10a
// 0ff: getstatic su/catlean/um.E Lsu/catlean/um;
// 102: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 105: dup
// 106: ifnonnull 14e
// 109: pop
// 10a: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 10d: iload 13
// 10f: ifeq 144
// 112: goto 11f
// 115: ldc2_w 6563337635985015003
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: lload 11
// 121: invokevirtual su/catlean/ux.f (J)Z
// 124: ifeq 14a
// 127: goto 134
// 12a: ldc2_w 6563337635985015003
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 137: goto 144
// 13a: ldc2_w 6563337635985015003
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 147: goto 14b
// 14a: aconst_null
// 14b: checkcast net/minecraft/class_1297
// 14e: astore 14
// 150: aload 14
// 152: lload 1
// 153: lconst_0
// 154: lcmp
// 155: ifle 16f
// 158: iload 13
// 15a: ifeq 16f
// 15d: ifnull 26f
// 160: goto 16d
// 163: ldc2_w 6563337635985015003
// 166: lload 1
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: aload 14
// 16f: instanceof net/minecraft/class_1657
// 172: lload 1
// 173: lconst_0
// 174: lcmp
// 175: ifle 1bd
// 178: iload 13
// 17a: ifeq 1bd
// 17d: ifeq 26f
// 180: goto 18d
// 183: ldc2_w 6563337635985015003
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 14
// 18f: checkcast net/minecraft/class_1657
// 192: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 195: lload 1
// 196: lconst_0
// 197: lcmp
// 198: iflt 278
// 19b: ldc 10.0
// 19d: iload 13
// 19f: ifeq 277
// 1a2: goto 1af
// 1a5: ldc2_w 6563337635985015003
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: fcmpg
// 1b0: goto 1bd
// 1b3: ldc2_w 6563337635985015003
// 1b6: lload 1
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: lload 1
// 1be: lconst_0
// 1bf: lcmp
// 1c0: ifle 1dc
// 1c3: ifge 26f
// 1c6: aload 14
// 1c8: checkcast net/minecraft/class_1657
// 1cb: getfield net/minecraft/class_1657.field_6012 I
// 1ce: sipush 1500
// 1d1: ldc2_w 2778019897476728506
// 1d4: lload 1
// 1d5: lxor
// 1d6: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: irem
// 1dc: iload 13
// 1de: ifeq 26e
// 1e1: goto 1ee
// 1e4: ldc2_w 6563337635985015003
// 1e7: lload 1
// 1e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: athrow
// 1ee: ifne 26f
// 1f1: goto 1fe
// 1f4: ldc2_w 6563337635985015003
// 1f7: lload 1
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: getstatic su/catlean/p3.i Ljava/util/List;
// 201: new su/catlean/p0
// 204: dup
// 205: aload 0
// 206: lload 7
// 208: invokevirtual su/catlean/p3.p (J)F
// 20b: sipush 8398
// 20e: ldc2_w 1515416966630892459
// 211: lload 1
// 212: lxor
// 213: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: i2f
// 219: fadd
// 21a: sipush 11313
// 21d: ldc2_w 139432168593420120
// 220: lload 1
// 221: lxor
// 222: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: i2f
// 228: invokestatic java/lang/Math.random ()D
// 22b: d2f
// 22c: fmul
// 22d: fadd
// 22e: aload 0
// 22f: lload 5
// 231: invokevirtual su/catlean/p3.V (J)F
// 234: ldc 5.0
// 236: fadd
// 237: invokestatic java/lang/Math.random ()D
// 23a: d2f
// 23b: fconst_2
// 23c: fmul
// 23d: fconst_1
// 23e: fsub
// 23f: invokestatic java/lang/Math.random ()D
// 242: d2f
// 243: bipush 2
// 244: i2f
// 245: fmul
// 246: bipush 0
// 247: fconst_0
// 248: lload 3
// 249: fconst_0
// 24a: bipush 0
// 24b: sipush 28707
// 24e: ldc2_w 7382185446288831335
// 251: lload 1
// 252: lxor
// 253: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: aconst_null
// 259: invokespecial su/catlean/p0.<init> (FFFFIFJFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 25c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 261: goto 26e
// 264: ldc2_w 6563337635985015003
// 267: lload 1
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: pop
// 26f: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 272: invokevirtual su/catlean/fd.a ()F
// 275: ldc 20.0
// 277: fdiv
// 278: fstore 15
// 27a: fload 15
// 27c: fconst_0
// 27d: fconst_1
// 27e: invokestatic java/lang/Math.clamp (FFF)F
// 281: fstore 16
// 283: iload 13
// 285: ifeq 3e7
// 288: aload 14
// 28a: ifnull 3d4
// 28d: goto 29a
// 290: ldc2_w 6563337635985015003
// 293: lload 1
// 294: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 299: athrow
// 29a: lload 1
// 29b: lconst_0
// 29c: lcmp
// 29d: ifle 3e7
// 2a0: aload 14
// 2a2: instanceof net/minecraft/class_1309
// 2a5: iload 13
// 2a7: ifeq 3e6
// 2aa: goto 2b7
// 2ad: ldc2_w 6563337635985015003
// 2b0: lload 1
// 2b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b6: athrow
// 2b7: ifeq 3d4
// 2ba: goto 2c7
// 2bd: ldc2_w 6563337635985015003
// 2c0: lload 1
// 2c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: athrow
// 2c7: aload 14
// 2c9: checkcast net/minecraft/class_1309
// 2cc: getfield net/minecraft/class_1309.field_6235 I
// 2cf: istore 17
// 2d1: bipush 5
// 2d2: iload 17
// 2d4: lload 1
// 2d5: lconst_0
// 2d6: lcmp
// 2d7: ifle 31d
// 2da: iload 13
// 2dc: ifeq 31d
// 2df: if_icmpgt 332
// 2e2: goto 2ef
// 2e5: ldc2_w 6563337635985015003
// 2e8: lload 1
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: iload 17
// 2f1: iload 13
// 2f3: ifeq 32f
// 2f6: goto 303
// 2f9: ldc2_w 6563337635985015003
// 2fc: lload 1
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: sipush 15740
// 306: ldc2_w 8252811221645753858
// 309: lload 1
// 30a: lxor
// 30b: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: goto 31d
// 313: ldc2_w 6563337635985015003
// 316: lload 1
// 317: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31c: athrow
// 31d: if_icmpge 32e
// 320: bipush 1
// 321: goto 333
// 324: ldc2_w 6563337635985015003
// 327: lload 1
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: bipush 0
// 32f: goto 333
// 332: bipush 0
// 333: ifeq 3d4
// 336: sipush 16068
// 339: ldc2_w 7593310452006092161
// 33c: lload 1
// 33d: lxor
// 33e: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: istore 17
// 345: bipush 0
// 346: istore 18
// 348: iload 18
// 34a: iload 17
// 34c: if_icmpge 3d4
// 34f: iload 18
// 351: istore 19
// 353: bipush 0
// 354: istore 20
// 356: getstatic su/catlean/p3.i Ljava/util/List;
// 359: new su/catlean/p0
// 35c: dup
// 35d: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 360: lload 7
// 362: invokevirtual su/catlean/p3.p (J)F
// 365: fconst_2
// 366: fsub
// 367: ldc 114.0
// 369: fload 16
// 36b: fmul
// 36c: fadd
// 36d: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 370: lload 5
// 372: invokevirtual su/catlean/p3.V (J)F
// 375: ldc 44.5
// 377: fadd
// 378: invokestatic java/lang/Math.random ()D
// 37b: d2f
// 37c: bipush 2
// 37d: i2f
// 37e: fmul
// 37f: fadd
// 380: fconst_1
// 381: fsub
// 382: invokestatic java/lang/Math.random ()D
// 385: d2f
// 386: fconst_2
// 387: fmul
// 388: invokestatic java/lang/Math.random ()D
// 38b: d2f
// 38c: fconst_1
// 38d: fmul
// 38e: ldc 0.5
// 390: fsub
// 391: bipush 0
// 392: fconst_0
// 393: lload 3
// 394: fconst_0
// 395: bipush 1
// 396: sipush 11187
// 399: ldc2_w 471599296975202514
// 39c: lload 1
// 39d: lxor
// 39e: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a3: aconst_null
// 3a4: invokespecial su/catlean/p0.<init> (FFFFIFJFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3a7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 3ac: pop
// 3ad: nop
// 3ae: iinc 18 1
// 3b1: iload 13
// 3b3: lload 1
// 3b4: lconst_0
// 3b5: lcmp
// 3b6: ifle 3be
// 3b9: ifeq 3e7
// 3bc: iload 13
// 3be: ifne 348
// 3c1: lload 1
// 3c2: lconst_0
// 3c3: lcmp
// 3c4: ifle 3b1
// 3c7: goto 3d4
// 3ca: ldc2_w 6563337635985015003
// 3cd: lload 1
// 3ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: athrow
// 3d4: getstatic su/catlean/p3.i Ljava/util/List;
// 3d7: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/p3.p (Lsu/catlean/p0;)Z, (Lsu/catlean/p0;)Ljava/lang/Boolean; ]
// 3dc: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/p3.h (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 3e1: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 3e6: pop
// 3e7: return
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 50709462495480L;
Intrinsics.checkNotNullParameter(context, b<"f">(9167, 5363588852203896123L ^ ax));
this.Z(context, false, var4);
}

@Override
public void H(@NotNull class_332 context, long a) {
long var4 = ax ^ 119229165910437L;
Intrinsics.checkNotNullParameter(context, b<"f">(9361, 5027907674965881637L ^ ax));
this.Z(context, true, var4);
}

private final void Z(class_332 param1, boolean param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/p3.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 126414337741477
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 34876964041736
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 113877447346934
// 019: lxor
// 01a: dup2
// 01b: bipush 32
// 01d: lushr
// 01e: l2i
// 01f: istore 9
// 021: dup2
// 022: bipush 32
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 10
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 11
// 035: pop2
// 036: dup2
// 037: ldc2_w 136098152078808
// 03a: lxor
// 03b: lstore 12
// 03d: dup2
// 03e: ldc2_w 79279856358300
// 041: lxor
// 042: lstore 14
// 044: dup2
// 045: ldc2_w 132208688429287
// 048: lxor
// 049: lstore 16
// 04b: dup2
// 04c: ldc2_w 128301748462876
// 04f: lxor
// 050: dup2
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 18
// 057: dup2
// 058: bipush 32
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 19
// 061: dup2
// 062: bipush 48
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 20
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 272701481366
// 070: lxor
// 071: lstore 21
// 073: dup2
// 074: ldc2_w 90557909310595
// 077: lxor
// 078: lstore 23
// 07a: dup2
// 07b: ldc2_w 54347345168861
// 07e: lxor
// 07f: lstore 25
// 081: dup2
// 082: ldc2_w 122439566351974
// 085: lxor
// 086: dup2
// 087: bipush 48
// 089: lushr
// 08a: l2i
// 08b: istore 27
// 08d: dup2
// 08e: bipush 16
// 090: lshl
// 091: bipush 32
// 093: lushr
// 094: l2i
// 095: istore 28
// 097: dup2
// 098: bipush 48
// 09a: lshl
// 09b: bipush 48
// 09d: lushr
// 09e: l2i
// 09f: istore 29
// 0a1: pop2
// 0a2: dup2
// 0a3: ldc2_w 65266559351360
// 0a6: lxor
// 0a7: dup2
// 0a8: bipush 56
// 0aa: lushr
// 0ab: l2i
// 0ac: istore 30
// 0ae: dup2
// 0af: bipush 8
// 0b1: lshl
// 0b2: bipush 8
// 0b4: lushr
// 0b5: lstore 31
// 0b7: pop2
// 0b8: dup2
// 0b9: ldc2_w 105968024251490
// 0bc: lxor
// 0bd: lstore 33
// 0bf: dup2
// 0c0: ldc2_w 120848417463267
// 0c3: lxor
// 0c4: lstore 35
// 0c6: dup2
// 0c7: ldc2_w 94719609755974
// 0ca: lxor
// 0cb: dup2
// 0cc: bipush 48
// 0ce: lushr
// 0cf: l2i
// 0d0: istore 37
// 0d2: dup2
// 0d3: bipush 16
// 0d5: lshl
// 0d6: bipush 48
// 0d8: lushr
// 0d9: l2i
// 0da: istore 38
// 0dc: dup2
// 0dd: bipush 32
// 0df: lshl
// 0e0: bipush 32
// 0e2: lushr
// 0e3: l2i
// 0e4: istore 39
// 0e6: pop2
// 0e7: dup2
// 0e8: ldc2_w 46349810730823
// 0eb: lxor
// 0ec: lstore 40
// 0ee: pop2
// 0ef: ldc2_w -3576753880958396435
// 0f2: lload 3
// 0f3: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: istore 43
// 0fa: iload 43
// 0fc: ifne 360
// 0ff: iload 2
// 100: ifne 304
// 103: goto 110
// 106: ldc2_w -3563796618627361468
// 109: lload 3
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: lload 5
// 112: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 115: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 118: instanceof net/minecraft/class_408
// 11b: lload 3
// 11c: lconst_0
// 11d: lcmp
// 11e: ifle 15b
// 121: iload 43
// 123: ifne 15b
// 126: goto 133
// 129: ldc2_w -3563796618627361468
// 12c: lload 3
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: ifne 15e
// 136: goto 143
// 139: ldc2_w -3563796618627361468
// 13c: lload 3
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: lload 5
// 145: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 148: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 14b: instanceof su/catlean/rl
// 14e: goto 15b
// 151: ldc2_w -3563796618627361468
// 154: lload 3
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: ifeq 173
// 15e: lload 23
// 160: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 163: checkcast net/minecraft/class_1297
// 166: goto 1c8
// 169: ldc2_w -3563796618627361468
// 16c: lload 3
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: lload 3
// 174: lconst_0
// 175: lcmp
// 176: iflt 184
// 179: getstatic su/catlean/um.E Lsu/catlean/um;
// 17c: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 17f: dup
// 180: ifnonnull 1c8
// 183: pop
// 184: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 187: iload 43
// 189: ifne 1be
// 18c: goto 199
// 18f: ldc2_w -3563796618627361468
// 192: lload 3
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: lload 25
// 19b: invokevirtual su/catlean/ux.f (J)Z
// 19e: ifeq 1c4
// 1a1: goto 1ae
// 1a4: ldc2_w -3563796618627361468
// 1a7: lload 3
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1b1: goto 1be
// 1b4: ldc2_w -3563796618627361468
// 1b7: lload 3
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 1c1: goto 1c5
// 1c4: aconst_null
// 1c5: checkcast net/minecraft/class_1297
// 1c8: astore 44
// 1ca: aload 44
// 1cc: iload 43
// 1ce: lload 3
// 1cf: lconst_0
// 1d0: lcmp
// 1d1: ifle 1eb
// 1d4: ifne 1e9
// 1d7: ifnull 216
// 1da: goto 1e7
// 1dd: ldc2_w -3563796618627361468
// 1e0: lload 3
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: aload 44
// 1e9: iload 43
// 1eb: ifne 210
// 1ee: instanceof net/minecraft/class_1309
// 1f1: ifeq 216
// 1f4: goto 201
// 1f7: ldc2_w -3563796618627361468
// 1fa: lload 3
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: aload 44
// 203: goto 210
// 206: ldc2_w -3563796618627361468
// 209: lload 3
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: checkcast net/minecraft/class_1309
// 213: putstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 216: getstatic su/catlean/p3.K Lsu/catlean/fd;
// 219: aload 44
// 21b: lload 3
// 21c: lconst_0
// 21d: lcmp
// 21e: ifle 238
// 221: iload 43
// 223: ifne 238
// 226: ifnull 250
// 229: goto 236
// 22c: ldc2_w -3563796618627361468
// 22f: lload 3
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: aload 44
// 238: invokevirtual net/minecraft/class_1297.method_5805 ()Z
// 23b: iload 43
// 23d: ifne 253
// 240: ifne 2ba
// 243: goto 250
// 246: ldc2_w -3563796618627361468
// 249: lload 3
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: getstatic su/catlean/p3.Q I
// 253: istore 45
// 255: bipush 1
// 256: iload 45
// 258: lload 3
// 259: lconst_0
// 25a: lcmp
// 25b: ifle 2a1
// 25e: iload 43
// 260: ifne 2a1
// 263: if_icmpgt 2b6
// 266: goto 273
// 269: ldc2_w -3563796618627361468
// 26c: lload 3
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: iload 45
// 275: iload 43
// 277: ifne 2b3
// 27a: goto 287
// 27d: ldc2_w -3563796618627361468
// 280: lload 3
// 281: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 286: athrow
// 287: sipush 31406
// 28a: ldc2_w 2998718795939621960
// 28d: lload 3
// 28e: lxor
// 28f: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: goto 2a1
// 297: ldc2_w -3563796618627361468
// 29a: lload 3
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: if_icmpge 2b2
// 2a4: bipush 1
// 2a5: goto 2b7
// 2a8: ldc2_w -3563796618627361468
// 2ab: lload 3
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: bipush 0
// 2b3: goto 2b7
// 2b6: bipush 0
// 2b7: ifeq 2c8
// 2ba: fconst_1
// 2bb: goto 2c9
// 2be: ldc2_w -3563796618627361468
// 2c1: lload 3
// 2c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: athrow
// 2c8: fconst_0
// 2c9: lload 12
// 2cb: dup2_x1
// 2cc: pop2
// 2cd: invokevirtual su/catlean/fd.B (JF)V
// 2d0: iload 43
// 2d2: lload 3
// 2d3: lconst_0
// 2d4: lcmp
// 2d5: iflt 362
// 2d8: ifne 360
// 2db: getstatic su/catlean/p3.K Lsu/catlean/fd;
// 2de: invokevirtual su/catlean/fd.a ()F
// 2e1: fconst_0
// 2e2: fcmpg
// 2e3: ifgt 304
// 2e6: goto 2f3
// 2e9: ldc2_w -3563796618627361468
// 2ec: lload 3
// 2ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: athrow
// 2f3: aconst_null
// 2f4: putstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 2f7: goto 304
// 2fa: ldc2_w -3563796618627361468
// 2fd: lload 3
// 2fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: athrow
// 304: aload 1
// 305: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 308: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 30b: pop
// 30c: aload 1
// 30d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 310: aload 0
// 311: lload 40
// 313: invokevirtual su/catlean/p3.p (J)F
// 316: ldc 60.0
// 318: fadd
// 319: aload 0
// 31a: lload 7
// 31c: invokevirtual su/catlean/p3.V (J)F
// 31f: ldc 28.5
// 321: fadd
// 322: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 325: pop
// 326: aload 1
// 327: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 32a: getstatic su/catlean/p3.K Lsu/catlean/fd;
// 32d: invokevirtual su/catlean/fd.a ()F
// 330: fconst_0
// 331: fconst_2
// 332: invokestatic java/lang/Math.clamp (FFF)F
// 335: getstatic su/catlean/p3.K Lsu/catlean/fd;
// 338: invokevirtual su/catlean/fd.a ()F
// 33b: fconst_0
// 33c: fconst_2
// 33d: invokestatic java/lang/Math.clamp (FFF)F
// 340: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 343: pop
// 344: aload 1
// 345: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 348: aload 0
// 349: lload 40
// 34b: invokevirtual su/catlean/p3.p (J)F
// 34e: ldc 60.0
// 350: fadd
// 351: fneg
// 352: aload 0
// 353: lload 7
// 355: invokevirtual su/catlean/p3.V (J)F
// 358: ldc 28.5
// 35a: fadd
// 35b: fneg
// 35c: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 35f: pop
// 360: iload 43
// 362: ifne 6f0
// 365: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 368: ifnull 68b
// 36b: goto 378
// 36e: ldc2_w -3563796618627361468
// 371: lload 3
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: iload 2
// 379: lload 3
// 37a: lconst_0
// 37b: lcmp
// 37c: iflt 626
// 37f: iload 43
// 381: ifne 626
// 384: goto 391
// 387: ldc2_w -3563796618627361468
// 38a: lload 3
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: ifne 5e9
// 394: goto 3a1
// 397: ldc2_w -3563796618627361468
// 39a: lload 3
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: aload 0
// 3a2: checkcast su/catlean/gf
// 3a5: aload 1
// 3a6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3a9: dup
// 3aa: sipush 30233
// 3ad: ldc2_w 4966863916393695854
// 3b0: lload 3
// 3b1: lxor
// 3b2: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ba: aload 0
// 3bb: lload 40
// 3bd: invokevirtual su/catlean/p3.p (J)F
// 3c0: aload 0
// 3c1: lload 7
// 3c3: invokevirtual su/catlean/p3.V (J)F
// 3c6: iload 27
// 3c8: i2s
// 3c9: swap
// 3ca: iload 28
// 3cc: swap
// 3cd: ldc 120.0
// 3cf: ldc 57.0
// 3d1: iload 29
// 3d3: i2s
// 3d4: fconst_0
// 3d5: bipush 0
// 3d6: sipush 11539
// 3d9: ldc2_w 6979179389865786364
// 3dc: lload 3
// 3dd: lxor
// 3de: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e3: aconst_null
// 3e4: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 3e7: aload 0
// 3e8: checkcast su/catlean/gf
// 3eb: aload 1
// 3ec: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3ef: dup
// 3f0: sipush 11856
// 3f3: ldc2_w 8117969465392058941
// 3f6: lload 3
// 3f7: lxor
// 3f8: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 400: aload 0
// 401: lload 40
// 403: invokevirtual su/catlean/p3.p (J)F
// 406: sipush 25980
// 409: ldc2_w 8614067106304504726
// 40c: lload 3
// 40d: lxor
// 40e: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 413: i2f
// 414: fadd
// 415: aload 0
// 416: lload 7
// 418: invokevirtual su/catlean/p3.V (J)F
// 41b: bipush 2
// 41c: i2f
// 41d: fadd
// 41e: iload 27
// 420: i2s
// 421: swap
// 422: iload 28
// 424: swap
// 425: ldc 36.0
// 427: ldc 36.0
// 429: iload 29
// 42b: i2s
// 42c: fconst_1
// 42d: bipush 0
// 42e: sipush 8436
// 431: ldc2_w 3615490867350304287
// 434: lload 3
// 435: lxor
// 436: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43b: aconst_null
// 43c: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 43f: aload 0
// 440: checkcast su/catlean/gf
// 443: aload 1
// 444: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 447: dup
// 448: sipush 11856
// 44b: ldc2_w 8117969465392058941
// 44e: lload 3
// 44f: lxor
// 450: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 455: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 458: aload 0
// 459: lload 40
// 45b: invokevirtual su/catlean/p3.p (J)F
// 45e: sipush 15575
// 461: ldc2_w 5998307748035848759
// 464: lload 3
// 465: lxor
// 466: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46b: i2f
// 46c: fadd
// 46d: aload 0
// 46e: lload 7
// 470: invokevirtual su/catlean/p3.V (J)F
// 473: bipush 2
// 474: i2f
// 475: fadd
// 476: iload 27
// 478: i2s
// 479: swap
// 47a: iload 28
// 47c: swap
// 47d: ldc 36.0
// 47f: ldc 17.0
// 481: iload 29
// 483: i2s
// 484: fconst_1
// 485: bipush 0
// 486: sipush 12027
// 489: ldc2_w 9138596405580527639
// 48c: lload 3
// 48d: lxor
// 48e: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 493: aconst_null
// 494: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 497: aload 0
// 498: checkcast su/catlean/gf
// 49b: aload 1
// 49c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 49f: dup
// 4a0: sipush 11856
// 4a3: ldc2_w 8117969465392058941
// 4a6: lload 3
// 4a7: lxor
// 4a8: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b0: aload 0
// 4b1: lload 40
// 4b3: invokevirtual su/catlean/p3.p (J)F
// 4b6: sipush 11972
// 4b9: ldc2_w 3965429589523331126
// 4bc: lload 3
// 4bd: lxor
// 4be: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: i2f
// 4c4: fadd
// 4c5: aload 0
// 4c6: lload 7
// 4c8: invokevirtual su/catlean/p3.V (J)F
// 4cb: sipush 1017
// 4ce: ldc2_w 3786663541554894113
// 4d1: lload 3
// 4d2: lxor
// 4d3: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d8: i2f
// 4d9: fadd
// 4da: iload 27
// 4dc: i2s
// 4dd: swap
// 4de: iload 28
// 4e0: swap
// 4e1: ldc 36.0
// 4e3: ldc 17.0
// 4e5: iload 29
// 4e7: i2s
// 4e8: fconst_1
// 4e9: bipush 0
// 4ea: sipush 12027
// 4ed: ldc2_w 9138596405580527639
// 4f0: lload 3
// 4f1: lxor
// 4f2: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f7: aconst_null
// 4f8: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 4fb: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 4fe: instanceof net/minecraft/class_1657
// 501: lload 3
// 502: lconst_0
// 503: lcmp
// 504: iflt 55d
// 507: iload 43
// 509: ifne 55d
// 50c: goto 519
// 50f: ldc2_w -3563796618627361468
// 512: lload 3
// 513: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 518: athrow
// 519: ifeq 55a
// 51c: goto 529
// 51f: ldc2_w -3563796618627361468
// 522: lload 3
// 523: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 528: athrow
// 529: aload 0
// 52a: aload 1
// 52b: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 52e: dup
// 52f: sipush 11272
// 532: ldc2_w 1718163153484009598
// 535: lload 3
// 536: lxor
// 537: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 53f: checkcast net/minecraft/class_1657
// 542: lload 21
// 544: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 547: lload 14
// 549: iload 2
// 54a: invokespecial su/catlean/p3.Y (Lnet/minecraft/class_332;Ljava/util/List;JZ)V
// 54d: goto 55a
// 550: ldc2_w -3563796618627361468
// 553: lload 3
// 554: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 559: athrow
// 55a: getstatic su/catlean/p3.Q I
// 55d: lload 3
// 55e: lconst_0
// 55f: lcmp
// 560: ifle 5e6
// 563: ifle 5d6
// 566: aload 0
// 567: checkcast su/catlean/gf
// 56a: aload 1
// 56b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 56e: dup
// 56f: sipush 11856
// 572: ldc2_w 8117969465392058941
// 575: lload 3
// 576: lxor
// 577: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 57f: aload 0
// 580: lload 40
// 582: invokevirtual su/catlean/p3.p (J)F
// 585: aload 0
// 586: lload 7
// 588: invokevirtual su/catlean/p3.V (J)F
// 58b: iload 27
// 58d: i2s
// 58e: swap
// 58f: iload 28
// 591: swap
// 592: ldc 120.0
// 594: ldc 55.0
// 596: getstatic su/catlean/p3.Q I
// 599: i2f
// 59a: ldc 5.0
// 59c: fadd
// 59d: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 5a0: iload 9
// 5a2: iload 10
// 5a4: i2c
// 5a5: iload 11
// 5a7: invokevirtual su/catlean/zi.n (ICI)F
// 5aa: fadd
// 5ab: ldc 20.0
// 5ad: fdiv
// 5ae: fconst_0
// 5af: fconst_1
// 5b0: invokestatic java/lang/Math.clamp (FFF)F
// 5b3: iload 29
// 5b5: i2s
// 5b6: swap
// 5b7: bipush 0
// 5b8: sipush 12027
// 5bb: ldc2_w 9138596405580527639
// 5be: lload 3
// 5bf: lxor
// 5c0: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c5: aconst_null
// 5c6: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 5c9: goto 5d6
// 5cc: ldc2_w -3563796618627361468
// 5cf: lload 3
// 5d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d5: athrow
// 5d6: aload 0
// 5d7: ldc 120.0
// 5d9: ldc 55.0
// 5db: invokevirtual su/catlean/p3.X (FF)V
// 5de: lload 3
// 5df: lconst_0
// 5e0: lcmp
// 5e1: iflt 6f0
// 5e4: iload 43
// 5e6: ifeq 68b
// 5e9: aload 0
// 5ea: iload 18
// 5ec: iload 19
// 5ee: i2s
// 5ef: iload 20
// 5f1: i2s
// 5f2: aload 1
// 5f3: invokespecial su/catlean/p3.I (ISSLnet/minecraft/class_332;)V
// 5f6: aload 0
// 5f7: aload 1
// 5f8: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 5fb: dup
// 5fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5ff: iload 43
// 601: ifne 684
// 604: goto 611
// 607: ldc2_w -3563796618627361468
// 60a: lload 3
// 60b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 610: athrow
// 611: astore 42
// 613: iload 37
// 615: i2c
// 616: iload 38
// 618: i2c
// 619: iload 39
// 61b: aload 42
// 61d: invokespecial su/catlean/p3.K (Lnet/minecraft/class_332;CCILnet/minecraft/class_1309;)V
// 620: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 623: instanceof net/minecraft/class_1657
// 626: ifeq 67b
// 629: aload 0
// 62a: aload 1
// 62b: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 62e: dup
// 62f: sipush 22024
// 632: ldc2_w 8881850594426137199
// 635: lload 3
// 636: lxor
// 637: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 63f: checkcast net/minecraft/class_1657
// 642: lload 21
// 644: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 647: lload 14
// 649: bipush 1
// 64a: invokespecial su/catlean/p3.Y (Lnet/minecraft/class_332;Ljava/util/List;JZ)V
// 64d: aload 0
// 64e: aload 1
// 64f: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 652: dup
// 653: sipush 22024
// 656: ldc2_w 8881850594426137199
// 659: lload 3
// 65a: lxor
// 65b: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 660: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 663: checkcast net/minecraft/class_1657
// 666: iload 30
// 668: i2b
// 669: lload 31
// 66b: invokespecial su/catlean/p3.d (Lnet/minecraft/class_332;Lnet/minecraft/class_1657;BJ)V
// 66e: goto 67b
// 671: ldc2_w -3563796618627361468
// 674: lload 3
// 675: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67a: athrow
// 67b: aload 0
// 67c: aload 1
// 67d: getstatic su/catlean/p3.B Lnet/minecraft/class_1309;
// 680: dup
// 681: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 684: lload 33
// 686: dup2_x2
// 687: pop2
// 688: invokespecial su/catlean/p3.r (JLnet/minecraft/class_332;Lnet/minecraft/class_1309;)V
// 68b: lload 35
// 68d: invokestatic su/catlean/b8.k (J)Lsu/catlean/c6;
// 690: lload 16
// 692: aload 1
// 693: sipush 12742
// 696: ldc2_w 2080511142516149674
// 699: lload 3
// 69a: lxor
// 69b: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a0: sipush 32486
// 6a3: ldc2_w 2920613549784410120
// 6a6: lload 3
// 6a7: lxor
// 6a8: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ad: getstatic su/catlean/p3.Q I
// 6b0: i2l
// 6b1: bipush 0
// 6b2: sipush 32486
// 6b5: ldc2_w 2920613549784410120
// 6b8: lload 3
// 6b9: lxor
// 6ba: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6bf: invokestatic java/lang/Math.clamp (JII)I
// 6c2: isub
// 6c3: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 6c6: aload 0
// 6c7: lload 40
// 6c9: invokevirtual su/catlean/p3.p (J)F
// 6cc: ldc 59.0
// 6ce: fadd
// 6cf: aload 0
// 6d0: lload 7
// 6d2: invokevirtual su/catlean/p3.V (J)F
// 6d5: ldc 19.0
// 6d7: fadd
// 6d8: sipush 11054
// 6db: ldc2_w 5537919730722274770
// 6de: lload 3
// 6df: lxor
// 6e0: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e5: invokevirtual su/catlean/c6.g (JLnet/minecraft/class_332;Ljava/lang/String;FFI)V
// 6e8: aload 1
// 6e9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6ec: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 6ef: pop
// 6f0: return
}

private final void d(class_332 param1, class_1657 param2, byte param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 56
// 004: lshl
// 005: lload 4
// 007: bipush 8
// 009: lshl
// 00a: bipush 8
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/p3.a J
// 011: lxor
// 012: lstore 6
// 014: lload 6
// 016: dup2
// 017: ldc2_w 94895415769754
// 01a: lxor
// 01b: lstore 8
// 01d: dup2
// 01e: ldc2_w 64938885471287
// 021: lxor
// 022: lstore 10
// 024: dup2
// 025: ldc2_w 75491076022175
// 028: lxor
// 029: lstore 12
// 02b: dup2
// 02c: ldc2_w 80670638519260
// 02f: lxor
// 030: lstore 14
// 032: dup2
// 033: ldc2_w 24807341893189
// 036: lxor
// 037: lstore 16
// 039: dup2
// 03a: ldc2_w 16011742883704
// 03d: lxor
// 03e: lstore 18
// 040: pop2
// 041: ldc2_w -1845360959170297902
// 044: lload 6
// 046: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: istore 20
// 04d: getstatic su/catlean/p3.Q I
// 050: iload 20
// 052: ifne 111
// 055: ifle 067
// 058: goto 066
// 05b: ldc2_w -1822271830669099653
// 05e: lload 6
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: return
// 067: aload 1
// 068: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 06b: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 06e: pop
// 06f: aload 1
// 070: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 073: aload 0
// 074: lload 18
// 076: invokevirtual su/catlean/p3.p (J)F
// 079: ldc 83.0
// 07b: fadd
// 07c: aload 0
// 07d: lload 10
// 07f: invokevirtual su/catlean/p3.V (J)F
// 082: ldc 3.5
// 084: fadd
// 085: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 088: pop
// 089: aload 1
// 08a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 08d: ldc 0.8
// 08f: ldc 0.8
// 091: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 094: pop
// 095: aload 1
// 096: aload 2
// 097: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 09a: bipush 0
// 09b: bipush 0
// 09c: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 09f: aload 1
// 0a0: lload 8
// 0a2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a5: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
// 0a8: aload 2
// 0a9: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 0ac: bipush 0
// 0ad: bipush 0
// 0ae: invokevirtual net/minecraft/class_332.method_51431 (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
// 0b1: aload 1
// 0b2: aload 2
// 0b3: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 0b6: sipush 28999
// 0b9: ldc2_w 6031922713560354701
// 0bc: lload 6
// 0be: lxor
// 0bf: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: bipush 0
// 0c5: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 0c8: aload 1
// 0c9: lload 8
// 0cb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ce: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
// 0d1: aload 2
// 0d2: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 0d5: sipush 5307
// 0d8: ldc2_w 3067556174476503657
// 0db: lload 6
// 0dd: lxor
// 0de: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: bipush 0
// 0e4: invokevirtual net/minecraft/class_332.method_51431 (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
// 0e7: aload 1
// 0e8: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 0eb: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 0ee: bipush 0
// 0ef: sipush 24528
// 0f2: ldc2_w 4664156023630962971
// 0f5: lload 6
// 0f7: lxor
// 0f8: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 100: aload 1
// 101: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 104: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 107: pop
// 108: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 10b: aload 2
// 10c: lload 12
// 10e: invokevirtual su/catlean/dx.j (Lnet/minecraft/class_1657;J)I
// 111: istore 21
// 113: lload 14
// 115: invokestatic su/catlean/b8.k (J)Lsu/catlean/c6;
// 118: aload 1
// 119: iload 21
// 11b: iload 20
// 11d: ifne 143
// 120: ifne 141
// 123: goto 131
// 126: ldc2_w -1822271830669099653
// 129: lload 6
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: ldc "-"
// 133: goto 148
// 136: ldc2_w -1822271830669099653
// 139: lload 6
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: iload 21
// 143: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "-\u0001" ]
// 148: aload 0
// 149: lload 18
// 14b: invokevirtual su/catlean/p3.p (J)F
// 14e: ldc 105.0
// 150: fadd
// 151: aload 0
// 152: lload 10
// 154: invokevirtual su/catlean/p3.V (J)F
// 157: ldc 28.5
// 159: fadd
// 15a: getstatic java/awt/Color.white Ljava/awt/Color;
// 15d: dup
// 15e: sipush 26515
// 161: ldc2_w 4722416445737710536
// 164: lload 6
// 166: lxor
// 167: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16f: lload 16
// 171: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 174: return
}

private final void K(class_332 param1, char param2, char param3, int param4, class_1309 param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
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
// 018: getstatic su/catlean/p3.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 114306130396911
// 024: lxor
// 025: lstore 8
// 027: dup2
// 028: ldc2_w 65107965548956
// 02b: lxor
// 02c: lstore 10
// 02e: dup2
// 02f: ldc2_w 50973348626895
// 032: lxor
// 033: dup2
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 12
// 03a: dup2
// 03b: bipush 32
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 13
// 044: dup2
// 045: bipush 48
// 047: lshl
// 048: bipush 48
// 04a: lushr
// 04b: l2i
// 04c: istore 14
// 04e: pop2
// 04f: dup2
// 050: ldc2_w 95066644807473
// 053: lxor
// 054: lstore 15
// 056: dup2
// 057: ldc2_w 54395406979714
// 05a: lxor
// 05b: lstore 17
// 05d: dup2
// 05e: ldc2_w 79708603320650
// 061: lxor
// 062: lstore 19
// 064: dup2
// 065: ldc2_w 109855207296126
// 068: lxor
// 069: lstore 21
// 06b: pop2
// 06c: ldc2_w 4999775627018489361
// 06f: lload 6
// 071: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: istore 28
// 078: iload 28
// 07a: ifeq 0a7
// 07d: aload 5
// 07f: instanceof net/minecraft/class_1657
// 082: ifne 09f
// 085: goto 093
// 088: ldc2_w 5022516431168790141
// 08b: lload 6
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: return
// 094: ldc2_w 5022516431168790141
// 097: lload 6
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: aload 1
// 0a0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0a3: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 0a6: pop
// 0a7: ldc 10.0
// 0a9: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 0ac: invokevirtual su/catlean/fd.a ()F
// 0af: fconst_0
// 0b0: ldc 10.0
// 0b2: invokestatic java/lang/Math.clamp (FFF)F
// 0b5: fsub
// 0b6: fconst_2
// 0b7: fdiv
// 0b8: fstore 29
// 0ba: fload 29
// 0bc: aload 5
// 0be: getfield net/minecraft/class_1309.field_6012 I
// 0c1: i2f
// 0c2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0c5: iload 12
// 0c7: iload 13
// 0c9: i2c
// 0ca: iload 14
// 0cc: invokevirtual su/catlean/zi.n (ICI)F
// 0cf: fadd
// 0d0: f2d
// 0d1: invokestatic java/lang/Math.sin (D)D
// 0d4: d2f
// 0d5: fmul
// 0d6: fstore 30
// 0d8: fload 29
// 0da: aload 5
// 0dc: getfield net/minecraft/class_1309.field_6012 I
// 0df: i2f
// 0e0: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0e3: iload 12
// 0e5: iload 13
// 0e7: i2c
// 0e8: iload 14
// 0ea: invokevirtual su/catlean/zi.n (ICI)F
// 0ed: fadd
// 0ee: f2d
// 0ef: invokestatic java/lang/Math.cos (D)D
// 0f2: d2f
// 0f3: fmul
// 0f4: fstore 31
// 0f6: fload 29
// 0f8: fload 30
// 0fa: fmul
// 0fb: fstore 32
// 0fd: aload 1
// 0fe: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 101: aload 0
// 102: lload 21
// 104: invokevirtual su/catlean/p3.p (J)F
// 107: ldc 46.0
// 109: fadd
// 10a: ldc 14.0
// 10c: fadd
// 10d: fload 32
// 10f: fadd
// 110: aload 0
// 111: lload 15
// 113: invokevirtual su/catlean/p3.V (J)F
// 116: ldc 7.0
// 118: fadd
// 119: ldc 14.0
// 11b: fadd
// 11c: fload 31
// 11e: fsub
// 11f: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 122: pop
// 123: aload 1
// 124: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 127: fload 30
// 129: f2d
// 12a: invokestatic java/lang/Math.toRadians (D)D
// 12d: d2f
// 12e: invokevirtual org/joml/Matrix3x2fStack.rotate (F)Lorg/joml/Matrix3x2f;
// 131: pop
// 132: aload 1
// 133: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 136: fconst_1
// 137: aload 5
// 139: getfield net/minecraft/class_1309.field_6235 I
// 13c: i2f
// 13d: ldc 100.0
// 13f: fdiv
// 140: fsub
// 141: fconst_1
// 142: aload 5
// 144: getfield net/minecraft/class_1309.field_6235 I
// 147: i2f
// 148: ldc 100.0
// 14a: fdiv
// 14b: fsub
// 14c: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 14f: pop
// 150: aload 1
// 151: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 154: aload 0
// 155: lload 21
// 157: invokevirtual su/catlean/p3.p (J)F
// 15a: ldc 46.0
// 15c: fadd
// 15d: ldc 14.0
// 15f: fadd
// 160: fload 32
// 162: fadd
// 163: fneg
// 164: aload 0
// 165: lload 15
// 167: invokevirtual su/catlean/p3.V (J)F
// 16a: ldc 7.0
// 16c: fadd
// 16d: ldc 14.0
// 16f: fadd
// 170: fload 31
// 172: fsub
// 173: fneg
// 174: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 177: pop
// 178: new su/catlean/g7
// 17b: dup
// 17c: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 17f: dup
// 180: sipush 26067
// 183: ldc2_w 5272065634471645826
// 186: lload 6
// 188: lxor
// 189: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 191: bipush 2
// 192: bipush 0
// 193: bipush 4
// 194: aconst_null
// 195: astore 23
// 197: istore 24
// 199: istore 25
// 19b: istore 26
// 19d: astore 27
// 19f: lload 8
// 1a1: aload 27
// 1a3: iload 26
// 1a5: iload 25
// 1a7: iload 24
// 1a9: aload 23
// 1ab: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1ae: astore 33
// 1b0: lload 10
// 1b2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b5: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 1b8: aload 5
// 1ba: checkcast net/minecraft/class_742
// 1bd: invokevirtual net/minecraft/class_742.method_52814 ()Lnet/minecraft/class_8685;
// 1c0: invokevirtual net/minecraft/class_8685.comp_1626 ()Lnet/minecraft/class_12079$class_12081;
// 1c3: invokeinterface net/minecraft/class_12079$class_12081.comp_3627 ()Lnet/minecraft/class_2960; 1
// 1c8: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 1cb: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1ce: dup
// 1cf: sipush 30020
// 1d2: ldc2_w 3788960488688714249
// 1d5: lload 6
// 1d7: lxor
// 1d8: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e0: astore 34
// 1e2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e5: aload 33
// 1e7: aload 0
// 1e8: lload 21
// 1ea: invokevirtual su/catlean/p3.p (J)F
// 1ed: ldc 46.0
// 1ef: fadd
// 1f0: aload 0
// 1f1: lload 15
// 1f3: invokevirtual su/catlean/p3.V (J)F
// 1f6: ldc 7.0
// 1f8: fadd
// 1f9: ldc 28.0
// 1fb: ldc 28.0
// 1fd: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 200: dup
// 201: sipush 2251
// 204: ldc2_w 8497649774294892416
// 207: lload 6
// 209: lxor
// 20a: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 212: aconst_null
// 213: aconst_null
// 214: aconst_null
// 215: ldc 0.125
// 217: ldc 0.125
// 219: ldc 0.25
// 21b: lload 19
// 21d: ldc 0.25
// 21f: sipush 25677
// 222: ldc2_w 6310867537412602247
// 225: lload 6
// 227: lxor
// 228: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: aconst_null
// 22e: invokestatic su/catlean/jl.R (Lsu/catlean/jl;Lsu/catlean/g7;FFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFJFILjava/lang/Object;)V
// 231: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 234: aload 33
// 236: aload 0
// 237: lload 21
// 239: invokevirtual su/catlean/p3.p (J)F
// 23c: ldc 44.0
// 23e: fadd
// 23f: aload 0
// 240: lload 15
// 242: invokevirtual su/catlean/p3.V (J)F
// 245: ldc 5.0
// 247: fadd
// 248: ldc 32.0
// 24a: ldc 32.0
// 24c: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 24f: dup
// 250: sipush 2251
// 253: ldc2_w 8497649774294892416
// 256: lload 6
// 258: lxor
// 259: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 261: aconst_null
// 262: aconst_null
// 263: aconst_null
// 264: ldc 0.625
// 266: ldc 0.125
// 268: ldc 0.75
// 26a: lload 19
// 26c: ldc 0.25
// 26e: sipush 25677
// 271: ldc2_w 6310867537412602247
// 274: lload 6
// 276: lxor
// 277: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: aconst_null
// 27d: invokestatic su/catlean/jl.R (Lsu/catlean/jl;Lsu/catlean/g7;FFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFJFILjava/lang/Object;)V
// 280: lload 17
// 282: aload 33
// 284: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 287: invokevirtual su/catlean/b6.O ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 28a: lload 10
// 28c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 292: dup
// 293: sipush 11209
// 296: ldc2_w 3003090339033603200
// 299: lload 6
// 29b: lxor
// 29c: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a4: aconst_null
// 2a5: aconst_null
// 2a6: aload 1
// 2a7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2aa: checkcast org/joml/Matrix3x2f
// 2ad: sipush 27285
// 2b0: ldc2_w 3118611172629913034
// 2b3: lload 6
// 2b5: lxor
// 2b6: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bb: aload 34
// 2bd: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 2c0: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 2c3: sipush 3089
// 2c6: ldc2_w 3178686855741166035
// 2c9: lload 6
// 2cb: lxor
// 2cc: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: aconst_null
// 2d2: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 2d5: aload 1
// 2d6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2d9: fconst_1
// 2da: fconst_1
// 2db: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 2de: pop
// 2df: aload 1
// 2e0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2e3: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 2e6: pop
// 2e7: return
}

private final void I(int param1, short param2, short param3, class_332 param4) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/p3.a J
// 01a: lxor
// 01b: lstore 5
// 01d: lload 5
// 01f: dup2
// 020: ldc2_w 76282055965365
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 28183940163014
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 14057910566293
// 031: lxor
// 032: dup2
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 32
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: dup2
// 044: bipush 48
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 21912360873688
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 117560476038416
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 163591215861
// 060: lxor
// 061: dup2
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 18
// 068: dup2
// 069: bipush 16
// 06b: lshl
// 06c: bipush 32
// 06e: lushr
// 06f: l2i
// 070: istore 19
// 072: dup2
// 073: bipush 48
// 075: lshl
// 076: bipush 48
// 078: lushr
// 079: l2i
// 07a: istore 20
// 07c: pop2
// 07d: pop2
// 07e: new su/catlean/g7
// 081: dup
// 082: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 085: dup
// 086: sipush 11134
// 089: ldc2_w 1553554957058482290
// 08c: lload 5
// 08e: lxor
// 08f: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 097: getstatic su/catlean/p3.i Ljava/util/List;
// 09a: invokeinterface java/util/List.size ()I 1
// 09f: bipush 0
// 0a0: bipush 4
// 0a1: aconst_null
// 0a2: astore 21
// 0a4: istore 22
// 0a6: istore 23
// 0a8: istore 24
// 0aa: astore 25
// 0ac: lload 7
// 0ae: aload 25
// 0b0: iload 24
// 0b2: iload 23
// 0b4: iload 22
// 0b6: aload 21
// 0b8: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0bb: astore 27
// 0bd: lload 9
// 0bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c2: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 0c5: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 0c8: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 0cb: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 0ce: dup
// 0cf: sipush 30344
// 0d2: ldc2_w 561164177160306057
// 0d5: lload 5
// 0d7: lxor
// 0d8: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e0: astore 28
// 0e2: ldc2_w 4125220363732148366
// 0e5: lload 5
// 0e7: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: getstatic su/catlean/p3.i Ljava/util/List;
// 0ef: checkcast java/lang/Iterable
// 0f2: astore 29
// 0f4: istore 26
// 0f6: bipush 0
// 0f7: istore 30
// 0f9: aload 29
// 0fb: astore 31
// 0fd: new java/util/ArrayList
// 100: dup
// 101: invokespecial java/util/ArrayList.<init> ()V
// 104: checkcast java/util/Collection
// 107: astore 32
// 109: bipush 0
// 10a: istore 33
// 10c: aload 31
// 10e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 113: astore 34
// 115: aload 34
// 117: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11c: ifeq 173
// 11f: aload 34
// 121: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 126: astore 35
// 128: aload 35
// 12a: checkcast su/catlean/p0
// 12d: astore 36
// 12f: bipush 0
// 130: istore 37
// 132: iload 3
// 133: ifge 186
// 136: aload 36
// 138: invokevirtual su/catlean/p0.H ()Z
// 13b: iload 26
// 13d: ifne 184
// 140: iload 26
// 142: ifne 16d
// 145: goto 153
// 148: ldc2_w 4173062794087080487
// 14b: lload 5
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: ifeq 115
// 156: goto 164
// 159: ldc2_w 4173062794087080487
// 15c: lload 5
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: aload 32
// 166: aload 35
// 168: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 16d: pop
// 16e: iload 26
// 170: ifeq 115
// 173: aload 32
// 175: checkcast java/util/List
// 178: nop
// 179: checkcast java/lang/Iterable
// 17c: astore 29
// 17e: nop
// 17f: iload 3
// 180: ifge 186
// 183: bipush 0
// 184: istore 30
// 186: aload 29
// 188: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 18d: astore 31
// 18f: aload 31
// 191: invokeinterface java/util/Iterator.hasNext ()Z 1
// 196: ifeq 278
// 199: aload 31
// 19b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1a0: astore 32
// 1a2: aload 32
// 1a4: checkcast su/catlean/p0
// 1a7: astore 33
// 1a9: bipush 0
// 1aa: istore 34
// 1ac: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1af: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1b2: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 1b5: fconst_1
// 1b6: aload 33
// 1b8: invokevirtual su/catlean/p0.T ()I
// 1bb: i2f
// 1bc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1bf: iload 11
// 1c1: iload 12
// 1c3: i2c
// 1c4: iload 13
// 1c6: invokevirtual su/catlean/zi.n (ICI)F
// 1c9: fadd
// 1ca: ldc 10.0
// 1cc: fdiv
// 1cd: fsub
// 1ce: ldc 0.8
// 1d0: fmul
// 1d1: iload 18
// 1d3: i2c
// 1d4: swap
// 1d5: iload 19
// 1d7: swap
// 1d8: iload 20
// 1da: i2s
// 1db: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1de: astore 35
// 1e0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e3: aload 27
// 1e5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e8: aload 33
// 1ea: invokevirtual su/catlean/p0.V ()F
// 1ed: aload 33
// 1ef: invokevirtual su/catlean/p0.Z ()F
// 1f2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1f5: iload 11
// 1f7: iload 12
// 1f9: i2c
// 1fa: iload 13
// 1fc: invokevirtual su/catlean/zi.n (ICI)F
// 1ff: invokevirtual su/catlean/jl.B (FFF)F
// 202: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 205: aload 33
// 207: invokevirtual su/catlean/p0.t ()F
// 20a: aload 33
// 20c: invokevirtual su/catlean/p0.e ()F
// 20f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 212: iload 11
// 214: iload 12
// 216: i2c
// 217: iload 13
// 219: invokevirtual su/catlean/zi.n (ICI)F
// 21c: invokevirtual su/catlean/jl.B (FFF)F
// 21f: ldc 10.0
// 221: ldc 10.0
// 223: aload 35
// 225: aconst_null
// 226: aconst_null
// 227: aconst_null
// 228: getstatic su/catlean/gi.FIREFLY_ALT Lsu/catlean/gi;
// 22b: invokevirtual su/catlean/gi.o ()F
// 22e: getstatic su/catlean/gi.FIREFLY_ALT Lsu/catlean/gi;
// 231: invokevirtual su/catlean/gi.v ()F
// 234: getstatic su/catlean/gi.FIREFLY_ALT Lsu/catlean/gi;
// 237: invokevirtual su/catlean/gi.L ()F
// 23a: getstatic su/catlean/gi.FIREFLY_ALT Lsu/catlean/gi;
// 23d: invokevirtual su/catlean/gi.w ()F
// 240: lload 16
// 242: dup2_x1
// 243: pop2
// 244: sipush 6314
// 247: ldc2_w 3320563657985669428
// 24a: lload 5
// 24c: lxor
// 24d: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: aconst_null
// 253: invokestatic su/catlean/jl.R (Lsu/catlean/jl;Lsu/catlean/g7;FFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFJFILjava/lang/Object;)V
// 256: nop
// 257: nop
// 258: iload 26
// 25a: iload 1
// 25b: iflt 263
// 25e: ifne 284
// 261: iload 26
// 263: ifeq 18f
// 266: iload 3
// 267: ifgt 258
// 26a: goto 278
// 26d: ldc2_w 4173062794087080487
// 270: lload 5
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: nop
// 279: getstatic su/catlean/p3.i Ljava/util/List;
// 27c: checkcast java/lang/Iterable
// 27f: astore 29
// 281: bipush 0
// 282: istore 30
// 284: aload 29
// 286: astore 31
// 288: new java/util/ArrayList
// 28b: dup
// 28c: invokespecial java/util/ArrayList.<init> ()V
// 28f: checkcast java/util/Collection
// 292: astore 32
// 294: bipush 0
// 295: istore 33
// 297: aload 31
// 299: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 29e: astore 34
// 2a0: aload 34
// 2a2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2a7: ifeq 306
// 2aa: aload 34
// 2ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b1: astore 35
// 2b3: aload 35
// 2b5: checkcast su/catlean/p0
// 2b8: astore 36
// 2ba: bipush 0
// 2bb: istore 37
// 2bd: iload 1
// 2be: iflt 319
// 2c1: aload 36
// 2c3: invokevirtual su/catlean/p0.H ()Z
// 2c6: iload 26
// 2c8: ifne 317
// 2cb: iload 26
// 2cd: ifne 2f0
// 2d0: goto 2de
// 2d3: ldc2_w 4173062794087080487
// 2d6: lload 5
// 2d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: athrow
// 2de: ifne 2f3
// 2e1: goto 2ef
// 2e4: ldc2_w 4173062794087080487
// 2e7: lload 5
// 2e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ee: athrow
// 2ef: bipush 1
// 2f0: goto 2f4
// 2f3: bipush 0
// 2f4: ifeq 2a0
// 2f7: aload 32
// 2f9: aload 35
// 2fb: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 300: pop
// 301: iload 26
// 303: ifeq 2a0
// 306: aload 32
// 308: checkcast java/util/List
// 30b: nop
// 30c: checkcast java/lang/Iterable
// 30f: astore 29
// 311: nop
// 312: iload 1
// 313: iflt 319
// 316: bipush 0
// 317: istore 30
// 319: aload 29
// 31b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 320: astore 31
// 322: aload 31
// 324: invokeinterface java/util/Iterator.hasNext ()Z 1
// 329: ifeq 413
// 32c: aload 31
// 32e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 333: astore 32
// 335: aload 32
// 337: checkcast su/catlean/p0
// 33a: astore 33
// 33c: bipush 0
// 33d: istore 34
// 33f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 342: aload 27
// 344: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 347: aload 33
// 349: invokevirtual su/catlean/p0.V ()F
// 34c: aload 33
// 34e: invokevirtual su/catlean/p0.Z ()F
// 351: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 354: iload 11
// 356: iload 12
// 358: i2c
// 359: iload 13
// 35b: invokevirtual su/catlean/zi.n (ICI)F
// 35e: invokevirtual su/catlean/jl.B (FFF)F
// 361: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 364: aload 33
// 366: invokevirtual su/catlean/p0.t ()F
// 369: aload 33
// 36b: invokevirtual su/catlean/p0.e ()F
// 36e: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 371: iload 11
// 373: iload 12
// 375: i2c
// 376: iload 13
// 378: invokevirtual su/catlean/zi.n (ICI)F
// 37b: invokevirtual su/catlean/jl.B (FFF)F
// 37e: ldc 6.0
// 380: ldc 6.0
// 382: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 385: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 388: dup
// 389: sipush 6667
// 38c: ldc2_w 7887511921486663949
// 38f: lload 5
// 391: lxor
// 392: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 397: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 39a: fconst_1
// 39b: aload 33
// 39d: invokevirtual su/catlean/p0.T ()I
// 3a0: i2f
// 3a1: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3a4: iload 11
// 3a6: iload 12
// 3a8: i2c
// 3a9: iload 13
// 3ab: invokevirtual su/catlean/zi.n (ICI)F
// 3ae: fadd
// 3af: ldc 60.0
// 3b1: fdiv
// 3b2: fsub
// 3b3: iload 18
// 3b5: i2c
// 3b6: swap
// 3b7: iload 19
// 3b9: swap
// 3ba: iload 20
// 3bc: i2s
// 3bd: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3c0: aconst_null
// 3c1: aconst_null
// 3c2: aconst_null
// 3c3: getstatic su/catlean/gi.DROP Lsu/catlean/gi;
// 3c6: invokevirtual su/catlean/gi.o ()F
// 3c9: getstatic su/catlean/gi.DROP Lsu/catlean/gi;
// 3cc: invokevirtual su/catlean/gi.v ()F
// 3cf: getstatic su/catlean/gi.DROP Lsu/catlean/gi;
// 3d2: invokevirtual su/catlean/gi.L ()F
// 3d5: getstatic su/catlean/gi.DROP Lsu/catlean/gi;
// 3d8: invokevirtual su/catlean/gi.w ()F
// 3db: lload 16
// 3dd: dup2_x1
// 3de: pop2
// 3df: sipush 25677
// 3e2: ldc2_w 6310833921585104349
// 3e5: lload 5
// 3e7: lxor
// 3e8: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: aconst_null
// 3ee: invokestatic su/catlean/jl.R (Lsu/catlean/jl;Lsu/catlean/g7;FFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFJFILjava/lang/Object;)V
// 3f1: nop
// 3f2: nop
// 3f3: iload 26
// 3f5: iload 3
// 3f6: ifgt 3fe
// 3f9: ifne 46a
// 3fc: iload 26
// 3fe: ifeq 322
// 401: iload 3
// 402: ifgt 3f3
// 405: goto 413
// 408: ldc2_w 4173062794087080487
// 40b: lload 5
// 40d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 412: athrow
// 413: nop
// 414: lload 14
// 416: aload 27
// 418: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 41b: invokevirtual su/catlean/b6.S ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 41e: lload 9
// 420: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 423: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 426: dup
// 427: sipush 31493
// 42a: ldc2_w 4571716425002905615
// 42d: lload 5
// 42f: lxor
// 430: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 435: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 438: aconst_null
// 439: aconst_null
// 43a: aload 4
// 43c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 43f: checkcast org/joml/Matrix3x2f
// 442: sipush 23563
// 445: ldc2_w 5056935316940347139
// 448: lload 5
// 44a: lxor
// 44b: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 450: aload 28
// 452: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 455: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 458: sipush 28214
// 45b: ldc2_w 228242006098136994
// 45e: lload 5
// 460: lxor
// 461: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 466: aconst_null
// 467: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 46a: return
}

private final void r(long param1, class_332 param3, class_1309 param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/p3.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 103270412829485
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 105773624969749
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 55644597112850
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 9
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 10
// 02b: dup2
// 02c: bipush 32
// 02e: lshl
// 02f: bipush 32
// 031: lushr
// 032: l2i
// 033: istore 11
// 035: pop2
// 036: dup2
// 037: ldc2_w 4728362165189
// 03a: lxor
// 03b: lstore 12
// 03d: dup2
// 03e: ldc2_w 127551403782474
// 041: lxor
// 042: dup2
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 14
// 049: dup2
// 04a: bipush 32
// 04c: lshl
// 04d: bipush 40
// 04f: lushr
// 050: l2i
// 051: istore 15
// 053: dup2
// 054: bipush 56
// 056: lshl
// 057: bipush 56
// 059: lushr
// 05a: l2i
// 05b: istore 16
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 99532889943090
// 062: lxor
// 063: lstore 17
// 065: dup2
// 066: ldc2_w 22649074134210
// 069: lxor
// 06a: lstore 19
// 06c: dup2
// 06d: ldc2_w 85433285980263
// 070: lxor
// 071: lstore 21
// 073: dup2
// 074: ldc2_w 23047207555979
// 077: lxor
// 078: dup2
// 079: bipush 48
// 07b: lushr
// 07c: l2i
// 07d: istore 23
// 07f: dup2
// 080: bipush 16
// 082: lshl
// 083: bipush 32
// 085: lushr
// 086: l2i
// 087: istore 24
// 089: dup2
// 08a: bipush 48
// 08c: lshl
// 08d: bipush 48
// 08f: lushr
// 090: l2i
// 091: istore 25
// 093: pop2
// 094: dup2
// 095: ldc2_w 94199678220634
// 098: lxor
// 099: lstore 26
// 09b: pop2
// 09c: ldc2_w 8090421187023731509
// 09f: lload 1
// 0a0: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0a8: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0ab: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 0ae: iload 23
// 0b0: i2c
// 0b1: iload 24
// 0b3: ldc 0.8
// 0b5: iload 25
// 0b7: i2s
// 0b8: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0bb: astore 29
// 0bd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0c0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0c3: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 0c6: iload 23
// 0c8: i2c
// 0c9: iload 24
// 0cb: ldc 0.3
// 0cd: iload 25
// 0cf: i2s
// 0d0: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0d3: astore 30
// 0d5: istore 28
// 0d7: iload 28
// 0d9: ifeq 11d
// 0dc: aload 4
// 0de: instanceof net/minecraft/class_1657
// 0e1: ifeq 128
// 0e4: goto 0f1
// 0e7: ldc2_w 8113136117678664537
// 0ea: lload 1
// 0eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: athrow
// 0f1: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 0f4: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 0f7: aload 4
// 0f9: checkcast net/minecraft/class_1657
// 0fc: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 0ff: lload 17
// 101: invokevirtual su/catlean/ko.H (J)Lsu/catlean/_j;
// 104: lload 5
// 106: invokevirtual su/catlean/ko.A (Lnet/minecraft/class_1657;Lsu/catlean/_j;J)F
// 109: lload 12
// 10b: dup2_x1
// 10c: pop2
// 10d: invokevirtual su/catlean/fd.B (JF)V
// 110: goto 11d
// 113: ldc2_w 8113136117678664537
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: lload 1
// 11e: lconst_0
// 11f: lcmp
// 120: ifle 13d
// 123: iload 28
// 125: ifne 14a
// 128: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 12b: aload 4
// 12d: invokevirtual net/minecraft/class_1309.method_6032 ()F
// 130: aload 4
// 132: invokevirtual net/minecraft/class_1309.method_6067 ()F
// 135: fadd
// 136: lload 12
// 138: dup2_x1
// 139: pop2
// 13a: invokevirtual su/catlean/fd.B (JF)V
// 13d: goto 14a
// 140: ldc2_w 8113136117678664537
// 143: lload 1
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: fconst_0
// 14b: fstore 31
// 14d: iload 14
// 14f: aload 4
// 151: iload 15
// 153: iload 16
// 155: i2b
// 156: invokestatic su/catlean/s_.E (ILnet/minecraft/class_1309;IB)Ljava/util/List;
// 159: checkcast java/lang/Iterable
// 15c: astore 32
// 15e: bipush 0
// 15f: istore 33
// 161: aload 32
// 163: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 168: astore 34
// 16a: aload 34
// 16c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 171: ifeq 1bc
// 174: aload 34
// 176: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 17b: astore 35
// 17d: aload 35
// 17f: checkcast net/minecraft/class_1799
// 182: astore 36
// 184: bipush 0
// 185: istore 37
// 187: fload 31
// 189: aload 36
// 18b: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 18e: aload 36
// 190: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 193: isub
// 194: i2f
// 195: fadd
// 196: lload 1
// 197: lconst_0
// 198: lcmp
// 199: iflt 1c7
// 19c: fstore 31
// 19e: nop
// 19f: iload 28
// 1a1: ifeq 1bd
// 1a4: iload 28
// 1a6: ifne 16a
// 1a9: lload 1
// 1aa: lconst_0
// 1ab: lcmp
// 1ac: ifle 19f
// 1af: goto 1bc
// 1b2: ldc2_w 8113136117678664537
// 1b5: lload 1
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: nop
// 1bd: fload 31
// 1bf: ldc 2035.0
// 1c1: fdiv
// 1c2: fconst_0
// 1c3: fconst_1
// 1c4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 1c7: fstore 32
// 1c9: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 1cc: invokevirtual su/catlean/fd.a ()F
// 1cf: ldc 20.0
// 1d1: fdiv
// 1d2: fstore 33
// 1d4: fload 33
// 1d6: fconst_0
// 1d7: fconst_1
// 1d8: invokestatic java/lang/Math.clamp (FFF)F
// 1db: fstore 34
// 1dd: aload 3
// 1de: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1e1: dup
// 1e2: sipush 11856
// 1e5: ldc2_w 8117929355334904864
// 1e8: lload 1
// 1e9: lxor
// 1ea: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1f2: aload 0
// 1f3: lload 26
// 1f5: invokevirtual su/catlean/p3.p (J)F
// 1f8: bipush 3
// 1f9: i2f
// 1fa: fadd
// 1fb: iload 9
// 1fd: i2c
// 1fe: swap
// 1ff: aload 0
// 200: lload 7
// 202: invokevirtual su/catlean/p3.V (J)F
// 205: sipush 8489
// 208: ldc2_w 701755524810164684
// 20b: lload 1
// 20c: lxor
// 20d: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: i2f
// 213: fadd
// 214: ldc 114.0
// 216: ldc 4.0
// 218: fconst_1
// 219: fconst_1
// 21a: fconst_1
// 21b: fconst_1
// 21c: aload 30
// 21e: aload 30
// 220: fconst_0
// 221: iload 10
// 223: i2s
// 224: fconst_0
// 225: iload 11
// 227: fconst_0
// 228: sipush 12351
// 22b: ldc2_w 2562984780781672640
// 22e: lload 1
// 22f: lxor
// 230: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: aconst_null
// 236: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 239: aload 3
// 23a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 23d: dup
// 23e: sipush 11856
// 241: ldc2_w 8117929355334904864
// 244: lload 1
// 245: lxor
// 246: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24e: aload 0
// 24f: lload 26
// 251: invokevirtual su/catlean/p3.p (J)F
// 254: bipush 3
// 255: i2f
// 256: fadd
// 257: iload 9
// 259: i2c
// 25a: swap
// 25b: aload 0
// 25c: lload 7
// 25e: invokevirtual su/catlean/p3.V (J)F
// 261: sipush 27653
// 264: ldc2_w 2473745810388550907
// 267: lload 1
// 268: lxor
// 269: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: i2f
// 26f: fadd
// 270: ldc 114.0
// 272: fload 32
// 274: fmul
// 275: ldc 4.0
// 277: fconst_2
// 278: fconst_1
// 279: fconst_1
// 27a: fconst_1
// 27b: aload 29
// 27d: aload 29
// 27f: fconst_0
// 280: iload 10
// 282: i2s
// 283: fconst_0
// 284: iload 11
// 286: fconst_0
// 287: sipush 21265
// 28a: ldc2_w 3109924573690903548
// 28d: lload 1
// 28e: lxor
// 28f: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: aconst_null
// 295: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 298: aload 3
// 299: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 29c: dup
// 29d: sipush 11856
// 2a0: ldc2_w 8117929355334904864
// 2a3: lload 1
// 2a4: lxor
// 2a5: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ad: aload 0
// 2ae: lload 26
// 2b0: invokevirtual su/catlean/p3.p (J)F
// 2b3: bipush 3
// 2b4: i2f
// 2b5: fadd
// 2b6: iload 9
// 2b8: i2c
// 2b9: swap
// 2ba: aload 0
// 2bb: lload 7
// 2bd: invokevirtual su/catlean/p3.V (J)F
// 2c0: sipush 23454
// 2c3: ldc2_w 7361401338272166780
// 2c6: lload 1
// 2c7: lxor
// 2c8: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: i2f
// 2ce: fadd
// 2cf: ldc 114.0
// 2d1: ldc 9.0
// 2d3: fconst_2
// 2d4: fconst_1
// 2d5: fconst_1
// 2d6: fconst_1
// 2d7: aload 30
// 2d9: aload 30
// 2db: fconst_0
// 2dc: iload 10
// 2de: i2s
// 2df: fconst_0
// 2e0: iload 11
// 2e2: fconst_0
// 2e3: sipush 21265
// 2e6: ldc2_w 3109924573690903548
// 2e9: lload 1
// 2ea: lxor
// 2eb: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: aconst_null
// 2f1: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2f4: aload 3
// 2f5: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2f8: dup
// 2f9: sipush 11856
// 2fc: ldc2_w 8117929355334904864
// 2ff: lload 1
// 300: lxor
// 301: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 309: aload 0
// 30a: lload 26
// 30c: invokevirtual su/catlean/p3.p (J)F
// 30f: bipush 3
// 310: i2f
// 311: fadd
// 312: iload 9
// 314: i2c
// 315: swap
// 316: aload 0
// 317: lload 7
// 319: invokevirtual su/catlean/p3.V (J)F
// 31c: sipush 12165
// 31f: ldc2_w 1686499575394387817
// 322: lload 1
// 323: lxor
// 324: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: i2f
// 32a: fadd
// 32b: ldc 114.0
// 32d: fload 34
// 32f: fmul
// 330: ldc 9.0
// 332: fconst_2
// 333: fconst_1
// 334: fconst_1
// 335: fconst_1
// 336: aload 29
// 338: aload 29
// 33a: fconst_0
// 33b: iload 10
// 33d: i2s
// 33e: fconst_0
// 33f: iload 11
// 341: fconst_0
// 342: sipush 21265
// 345: ldc2_w 3109924573690903548
// 348: lload 1
// 349: lxor
// 34a: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: aconst_null
// 350: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 353: lload 19
// 355: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 358: aload 3
// 359: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 35c: invokevirtual su/catlean/fd.a ()F
// 35f: f2d
// 360: ldc2_w 10.0
// 363: dmul
// 364: invokestatic kotlin/math/MathKt.roundToInt (D)I
// 367: i2d
// 368: ldc2_w 10.0
// 36b: ddiv
// 36c: invokestatic java/lang/String.valueOf (D)Ljava/lang/String;
// 36f: aload 0
// 370: lload 26
// 372: invokevirtual su/catlean/p3.p (J)F
// 375: ldc 59.5
// 377: fadd
// 378: aload 0
// 379: lload 7
// 37b: invokevirtual su/catlean/p3.V (J)F
// 37e: ldc 48.5
// 380: fadd
// 381: getstatic java/awt/Color.black Ljava/awt/Color;
// 384: dup
// 385: sipush 11778
// 388: ldc2_w 268884577423944831
// 38b: lload 1
// 38c: lxor
// 38d: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 395: lload 21
// 397: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 39a: lload 19
// 39c: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 39f: aload 3
// 3a0: getstatic su/catlean/p3.O Lsu/catlean/fd;
// 3a3: invokevirtual su/catlean/fd.a ()F
// 3a6: f2d
// 3a7: ldc2_w 10.0
// 3aa: dmul
// 3ab: invokestatic kotlin/math/MathKt.roundToInt (D)I
// 3ae: i2d
// 3af: ldc2_w 10.0
// 3b2: ddiv
// 3b3: invokestatic java/lang/String.valueOf (D)Ljava/lang/String;
// 3b6: aload 0
// 3b7: lload 26
// 3b9: invokevirtual su/catlean/p3.p (J)F
// 3bc: ldc 59.0
// 3be: fadd
// 3bf: aload 0
// 3c0: lload 7
// 3c2: invokevirtual su/catlean/p3.V (J)F
// 3c5: ldc 48.0
// 3c7: fadd
// 3c8: getstatic java/awt/Color.white Ljava/awt/Color;
// 3cb: dup
// 3cc: sipush 14242
// 3cf: ldc2_w 6026550183372420565
// 3d2: lload 1
// 3d3: lxor
// 3d4: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3dc: lload 21
// 3de: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 3e1: return
}

private final void Y(class_332 param1, List param2, long param3, boolean param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/p3.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 1164181848347
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 62306173919109
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
// 030: ldc2_w 79478546740715
// 033: lxor
// 034: lstore 11
// 036: dup2
// 037: ldc2_w 96537701721411
// 03a: lxor
// 03b: lstore 13
// 03d: dup2
// 03e: ldc2_w 66573155101813
// 041: lxor
// 042: dup2
// 043: bipush 48
// 045: lushr
// 046: l2i
// 047: istore 15
// 049: dup2
// 04a: bipush 16
// 04c: lshl
// 04d: bipush 32
// 04f: lushr
// 050: l2i
// 051: istore 16
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 17
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 138361558255268
// 062: lxor
// 063: lstore 18
// 065: pop2
// 066: ldc2_w 1134773768099419662
// 069: lload 3
// 06a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: istore 20
// 071: getstatic su/catlean/p3.Q I
// 074: iload 20
// 076: ifne 08b
// 079: ifle 08a
// 07c: goto 089
// 07f: ldc2_w 1110575094322468007
// 082: lload 3
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: return
// 08a: bipush 4
// 08b: anewarray 571
// 08e: astore 22
// 090: aload 22
// 092: bipush 0
// 093: new kotlin/Pair
// 096: dup
// 097: aload 0
// 098: lload 18
// 09a: invokevirtual su/catlean/p3.p (J)F
// 09d: bipush 3
// 09e: i2f
// 09f: fadd
// 0a0: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0a3: aload 0
// 0a4: lload 11
// 0a6: invokevirtual su/catlean/p3.V (J)F
// 0a9: bipush 2
// 0aa: i2f
// 0ab: fadd
// 0ac: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0af: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 0b2: aastore
// 0b3: aload 22
// 0b5: bipush 1
// 0b6: new kotlin/Pair
// 0b9: dup
// 0ba: aload 0
// 0bb: lload 18
// 0bd: invokevirtual su/catlean/p3.p (J)F
// 0c0: sipush 5307
// 0c3: ldc2_w 3067608099444655029
// 0c6: lload 3
// 0c7: lxor
// 0c8: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: i2f
// 0ce: fadd
// 0cf: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0d2: aload 0
// 0d3: lload 11
// 0d5: invokevirtual su/catlean/p3.V (J)F
// 0d8: bipush 2
// 0d9: i2f
// 0da: fadd
// 0db: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0de: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 0e1: aastore
// 0e2: aload 22
// 0e4: bipush 2
// 0e5: new kotlin/Pair
// 0e8: dup
// 0e9: aload 0
// 0ea: lload 18
// 0ec: invokevirtual su/catlean/p3.p (J)F
// 0ef: sipush 5307
// 0f2: ldc2_w 3067608099444655029
// 0f5: lload 3
// 0f6: lxor
// 0f7: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: i2f
// 0fd: fadd
// 0fe: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 101: aload 0
// 102: lload 11
// 104: invokevirtual su/catlean/p3.V (J)F
// 107: sipush 16684
// 10a: ldc2_w 2166726245497755176
// 10d: lload 3
// 10e: lxor
// 10f: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: i2f
// 115: fadd
// 116: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 119: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 11c: aastore
// 11d: aload 22
// 11f: bipush 3
// 120: new kotlin/Pair
// 123: dup
// 124: aload 0
// 125: lload 18
// 127: invokevirtual su/catlean/p3.p (J)F
// 12a: bipush 3
// 12b: i2f
// 12c: fadd
// 12d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 130: aload 0
// 131: lload 11
// 133: invokevirtual su/catlean/p3.V (J)F
// 136: sipush 16684
// 139: ldc2_w 2166726245497755176
// 13c: lload 3
// 13d: lxor
// 13e: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: i2f
// 144: fadd
// 145: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 148: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 14b: aastore
// 14c: aload 22
// 14e: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 151: astore 21
// 153: aload 21
// 155: checkcast java/lang/Iterable
// 158: astore 22
// 15a: bipush 0
// 15b: istore 23
// 15d: bipush 0
// 15e: istore 24
// 160: aload 22
// 162: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 167: astore 25
// 169: aload 25
// 16b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 170: ifeq 38e
// 173: aload 25
// 175: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 17a: astore 26
// 17c: iload 24
// 17e: iinc 24 1
// 181: istore 27
// 183: iload 20
// 185: lload 3
// 186: lconst_0
// 187: lcmp
// 188: ifle 190
// 18b: ifne 395
// 18e: iload 27
// 190: iload 20
// 192: ifne 1b7
// 195: goto 1a2
// 198: ldc2_w 1110575094322468007
// 19b: lload 3
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: ifge 1b5
// 1a5: goto 1b2
// 1a8: ldc2_w 1110575094322468007
// 1ab: lload 3
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 1b5: iload 27
// 1b7: aload 26
// 1b9: checkcast kotlin/Pair
// 1bc: astore 28
// 1be: istore 29
// 1c0: bipush 0
// 1c1: istore 30
// 1c3: aload 28
// 1c5: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
// 1c8: checkcast java/lang/Number
// 1cb: invokevirtual java/lang/Number.floatValue ()F
// 1ce: fstore 31
// 1d0: aload 28
// 1d2: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
// 1d5: checkcast java/lang/Number
// 1d8: invokevirtual java/lang/Number.floatValue ()F
// 1db: fstore 32
// 1dd: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 1e0: astore 33
// 1e2: aload 2
// 1e3: bipush 3
// 1e4: iload 29
// 1e6: isub
// 1e7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 1ec: checkcast net/minecraft/class_1799
// 1ef: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 1f2: i2f
// 1f3: aload 2
// 1f4: bipush 3
// 1f5: iload 29
// 1f7: isub
// 1f8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 1fd: checkcast net/minecraft/class_1799
// 200: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 203: i2f
// 204: fdiv
// 205: fstore 34
// 207: fload 34
// 209: invokestatic java/lang/Float.isNaN (F)Z
// 20c: ifne 266
// 20f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 212: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 215: dup
// 216: sipush 2251
// 219: ldc2_w 8497634220525106522
// 21c: lload 3
// 21d: lxor
// 21e: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 226: getstatic java/awt/Color.RED Ljava/awt/Color;
// 229: dup
// 22a: sipush 30760
// 22d: ldc2_w 6028252387028190632
// 230: lload 3
// 231: lxor
// 232: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 23a: aload 2
// 23b: bipush 3
// 23c: iload 29
// 23e: isub
// 23f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 244: checkcast net/minecraft/class_1799
// 247: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 24a: i2f
// 24b: aload 2
// 24c: bipush 3
// 24d: iload 29
// 24f: isub
// 250: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 255: checkcast net/minecraft/class_1799
// 258: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 25b: i2f
// 25c: fdiv
// 25d: lload 6
// 25f: dup2_x2
// 260: pop2
// 261: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 264: astore 33
// 266: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 269: aload 33
// 26b: astore 35
// 26d: aload 35
// 26f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 272: aload 35
// 274: iload 15
// 276: i2c
// 277: iload 16
// 279: ldc 0.2
// 27b: iload 17
// 27d: i2s
// 27e: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 281: astore 33
// 283: iload 20
// 285: lload 3
// 286: lconst_0
// 287: lcmp
// 288: iflt 2ed
// 28b: ifne 2eb
// 28e: iload 5
// 290: ifne 2f6
// 293: goto 2a0
// 296: ldc2_w 1110575094322468007
// 299: lload 3
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 2a3: checkcast su/catlean/gf
// 2a6: aload 1
// 2a7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2aa: dup
// 2ab: sipush 11856
// 2ae: ldc2_w 8117885416699302878
// 2b1: lload 3
// 2b2: lxor
// 2b3: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2bb: fload 31
// 2bd: iload 8
// 2bf: i2s
// 2c0: iload 9
// 2c2: fload 32
// 2c4: ldc 17.0
// 2c6: ldc 17.0
// 2c8: iload 10
// 2ca: i2s
// 2cb: fconst_0
// 2cc: bipush 0
// 2cd: sipush 11539
// 2d0: ldc2_w 6979261506930850335
// 2d3: lload 3
// 2d4: lxor
// 2d5: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2da: aconst_null
// 2db: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 2de: goto 2eb
// 2e1: ldc2_w 1110575094322468007
// 2e4: lload 3
// 2e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: athrow
// 2eb: iload 20
// 2ed: lload 3
// 2ee: lconst_0
// 2ef: lcmp
// 2f0: iflt 38b
// 2f3: ifeq 355
// 2f6: fload 31
// 2f8: fload 32
// 2fa: sipush 23245
// 2fd: ldc2_w 3915124119389294026
// 300: lload 3
// 301: lxor
// 302: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: i2f
// 308: fload 34
// 30a: fmul
// 30b: fadd
// 30c: ldc 17.0
// 30e: ldc 17.0
// 310: fconst_1
// 311: fload 34
// 313: fsub
// 314: fmul
// 315: fconst_2
// 316: aload 33
// 318: aload 33
// 31a: lload 13
// 31c: aload 33
// 31e: aload 33
// 320: aload 1
// 321: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 324: dup
// 325: sipush 11856
// 328: ldc2_w 8117885416699302878
// 32b: lload 3
// 32c: lxor
// 32d: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 332: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 335: fconst_0
// 336: aconst_null
// 337: sipush 9094
// 33a: ldc2_w 6179986765056521344
// 33d: lload 3
// 33e: lxor
// 33f: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: aconst_null
// 345: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 348: goto 355
// 34b: ldc2_w 1110575094322468007
// 34e: lload 3
// 34f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 354: athrow
// 355: aload 1
// 356: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 359: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 35c: pop
// 35d: aload 1
// 35e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 361: fload 31
// 363: ldc 0.5
// 365: fadd
// 366: fload 32
// 368: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 36b: pop
// 36c: aload 1
// 36d: aload 2
// 36e: bipush 3
// 36f: iload 29
// 371: isub
// 372: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 377: checkcast net/minecraft/class_1799
// 37a: bipush 0
// 37b: bipush 0
// 37c: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 37f: aload 1
// 380: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 383: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 386: pop
// 387: nop
// 388: nop
// 389: iload 20
// 38b: ifeq 169
// 38e: nop
// 38f: lload 3
// 390: lconst_0
// 391: lcmp
// 392: iflt 395
// 395: return
}

private static final boolean p(p0 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/p3.a J
// 003: ldc2_w 114012528694880
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 9667903864827
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 67436337810612
// 013: lxor
// 014: lstore 5
// 016: pop2
// 017: aload 0
// 018: sipush 20882
// 01b: ldc2_w 7631559390467057172
// 01e: lload 1
// 01f: lxor
// 020: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/p3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 025: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 028: aload 0
// 029: aload 0
// 02a: invokevirtual su/catlean/p0.Z ()F
// 02d: invokevirtual su/catlean/p0.N (F)V
// 030: aload 0
// 031: aload 0
// 032: invokevirtual su/catlean/p0.e ()F
// 035: invokevirtual su/catlean/p0.J (F)V
// 038: ldc2_w 407747074461372123
// 03b: lload 1
// 03c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: aload 0
// 042: aload 0
// 043: invokevirtual su/catlean/p0.Z ()F
// 046: aload 0
// 047: invokevirtual su/catlean/p0.R ()F
// 04a: fadd
// 04b: invokevirtual su/catlean/p0.C (F)V
// 04e: istore 7
// 050: aload 0
// 051: aload 0
// 052: invokevirtual su/catlean/p0.e ()F
// 055: aload 0
// 056: invokevirtual su/catlean/p0.r ()F
// 059: fadd
// 05a: invokevirtual su/catlean/p0.R (F)V
// 05d: aload 0
// 05e: aload 0
// 05f: invokevirtual su/catlean/p0.R ()F
// 062: ldc 0.95
// 064: fmul
// 065: invokevirtual su/catlean/p0.G (F)V
// 068: aload 0
// 069: aload 0
// 06a: invokevirtual su/catlean/p0.r ()F
// 06d: ldc 0.95
// 06f: fmul
// 070: invokevirtual su/catlean/p0.S (F)V
// 073: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 076: lload 5
// 078: invokevirtual su/catlean/p3.p (J)F
// 07b: f2d
// 07c: ldc2_w 46.0
// 07f: dadd
// 080: dstore 8
// 082: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 085: lload 5
// 087: invokevirtual su/catlean/p3.p (J)F
// 08a: f2d
// 08b: ldc2_w 74.0
// 08e: dadd
// 08f: dstore 10
// 091: aload 0
// 092: invokevirtual su/catlean/p0.Z ()F
// 095: bipush 4
// 096: i2f
// 097: fadd
// 098: f2d
// 099: dstore 12
// 09b: dload 8
// 09d: dload 12
// 09f: dcmpg
// 0a0: iload 7
// 0a2: ifeq 0c7
// 0a5: ifgt 0ee
// 0a8: goto 0b5
// 0ab: ldc2_w 394573671778131639
// 0ae: lload 1
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: dload 12
// 0b7: dload 10
// 0b9: dcmpg
// 0ba: goto 0c7
// 0bd: ldc2_w 394573671778131639
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: iload 7
// 0c9: ifeq 0eb
// 0cc: ifgt 0ea
// 0cf: goto 0dc
// 0d2: ldc2_w 394573671778131639
// 0d5: lload 1
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 1
// 0dd: goto 0ef
// 0e0: ldc2_w 394573671778131639
// 0e3: lload 1
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: bipush 0
// 0eb: goto 0ef
// 0ee: bipush 0
// 0ef: ifeq 16f
// 0f2: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 0f5: lload 3
// 0f6: invokevirtual su/catlean/p3.V (J)F
// 0f9: f2d
// 0fa: ldc2_w 5.0
// 0fd: dadd
// 0fe: dstore 8
// 100: getstatic su/catlean/p3.Y Lsu/catlean/p3;
// 103: lload 3
// 104: invokevirtual su/catlean/p3.V (J)F
// 107: f2d
// 108: ldc2_w 33.0
// 10b: dadd
// 10c: dstore 10
// 10e: aload 0
// 10f: invokevirtual su/catlean/p0.e ()F
// 112: bipush 4
// 113: i2f
// 114: fadd
// 115: f2d
// 116: dstore 12
// 118: dload 8
// 11a: dload 12
// 11c: dcmpg
// 11d: iload 7
// 11f: ifeq 144
// 122: ifgt 16b
// 125: goto 132
// 128: ldc2_w 394573671778131639
// 12b: lload 1
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: dload 12
// 134: dload 10
// 136: dcmpg
// 137: goto 144
// 13a: ldc2_w 394573671778131639
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: iload 7
// 146: ifeq 168
// 149: ifgt 167
// 14c: goto 159
// 14f: ldc2_w 394573671778131639
// 152: lload 1
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: bipush 1
// 15a: goto 16c
// 15d: ldc2_w 394573671778131639
// 160: lload 1
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: bipush 0
// 168: goto 16c
// 16b: bipush 0
// 16c: ifne 1b8
// 16f: aload 0
// 170: invokevirtual su/catlean/p0.H ()Z
// 173: iload 7
// 175: ifeq 1bc
// 178: goto 185
// 17b: ldc2_w 394573671778131639
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: ifne 1b8
// 188: goto 195
// 18b: ldc2_w 394573671778131639
// 18e: lload 1
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: aload 0
// 196: aload 0
// 197: invokevirtual su/catlean/p0.r ()F
// 19a: ldc 0.2
// 19c: fadd
// 19d: invokevirtual su/catlean/p0.S (F)V
// 1a0: aload 0
// 1a1: aload 0
// 1a2: invokevirtual su/catlean/p0.R ()F
// 1a5: ldc 0.95
// 1a7: fmul
// 1a8: invokevirtual su/catlean/p0.G (F)V
// 1ab: goto 1b8
// 1ae: ldc2_w 394573671778131639
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: aload 0
// 1b9: invokevirtual su/catlean/p0.T ()I
// 1bc: istore 8
// 1be: aload 0
// 1bf: iload 8
// 1c1: bipush 1
// 1c2: iadd
// 1c3: invokevirtual su/catlean/p0.Y (I)V
// 1c6: iload 8
// 1c8: aload 0
// 1c9: invokevirtual su/catlean/p0.H ()Z
// 1cc: iload 7
// 1ce: ifeq 1ee
// 1d1: ifeq 1f1
// 1d4: goto 1e1
// 1d7: ldc2_w 394573671778131639
// 1da: lload 1
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: sipush 7723
// 1e4: ldc2_w 2456003384540594992
// 1e7: lload 1
// 1e8: lxor
// 1e9: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: goto 1fe
// 1f1: sipush 26161
// 1f4: ldc2_w 1056920564981005099
// 1f7: lload 1
// 1f8: lxor
// 1f9: invokedynamic k (IJ)I bsm=su/catlean/p3.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: if_icmple 20f
// 201: bipush 1
// 202: goto 210
// 205: ldc2_w 394573671778131639
// 208: lload 1
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: bipush 0
// 210: ireturn
}

private static final boolean h(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var31 = a ^ 53823310052456L;
long var33 = var31 ^ 94372120415699L;
long var35 = var31 ^ 112436683986290L;
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[23];
int var27 = 0;
String var26 = "\u0003ßUA ©7ÈDñßÿTîbÐ\u009c5.G\u0080\u0090yÖ\t%\u007f\u0010\u009bíð\u0010xÇVõêÛy\u0018-þ\u0007V Ý:<êÆ\u0006_ô\u009efèñí½\u0006é²\u0081å\u0005ñV°7÷ä\u0080T³ÌÄ?¹8\u0010\u009b yA\"§0vm\u009b:S²\u0081.ÙEò`ø\u0001\u00820\u0085\u009a{\r/7*\u008c+â+þÇ\u001c?E¤í¸Kq¶tÆo$d\u0088\u0095¨\u0011#Z\u0012\u0003g6¦\u001eÿjÔq¿ø\b\u0017\u007fµe\u0010\u0099C\u00946¸sF\u0083B3\u001fûÃ'\u001a8\u0010r\u0000ëÊÐhïäß¤ºxmç¦\u009a0bAh\u0089oÏfNÅ÷\u008dz>¬\u008fËFÅ(kÑ;¯\u0019ðªEéÏiGþñ\rf\u0095ª ¬\u0003\u0003TLò`\u0006\u0081\u0094\u0010ì+e§I\u0002CW½\u00167\u0011âUVB\u0010áZ\u008amé\\[>'\u001c_¥@Ô`y\u0018¯2êÁ\u0083x·C°5k8S¹Ãäúú<ÆÿJ\u0090\u0018\u0010\u009f!ÐfKNxðt¾d×\f5Ym(9þuß\f4\u0088\u001aA\u0089á.@TcH|ö_4H\u0007qÒmqo2\u0083\u00870ËG£7~\u0001þâÍ\u0018úWÐÁäÄS¼µ]¢ý%\u001aN²\u0085_í¦\fó\u0091i\u0018\u0004sÑ. \u0093Oå\u001a\u0003Éò^¾ó?s\u0002G¤\u0006}?l\u0010\u009a,ïÂ\u009a¹±b°\u00adå§ÒnÔ©\u0018Õ\u0011\u000e?AÔô\u0010\u008f\u0007ì\u008a«k°½vN\u009cíè£]û(\u0082\u0098\b\u0080\u001b\u008e1^\u0085ü§\u0014ê\u0080çmm]ô\u0011üCwú\u0082àRu>`ßbH,`]ªúï\r8nÿ{\u001d¥ÎÄÆc\u009c½d[È4\u0003ãmÁúóºK1\u0016=µ½VØ\u008f\u0086õ3\u0003\u000e\u008e×¬DÄñW+_\u0089Î.\u000b¶SkÍh\u0013æp\u0000\u009e¶%(Q·»G\u009eLoä¸PpÄ3Â\"\fjzynØùm\u0085\u0019~\u001e Á-\u001dºx\u0096\u009eKã<}¤Nk°ýRrË\u0082£Â<ô\u0015\u0010tMÿ\u0001ÛÙºøÁGL\u0091\u009dúð=<¡`÷V\u000eªQ=Qµ\u0010Ûî\u008cè\u009cáµf\u009f\u0016*ä%uð\u009f[\u008bYÁâº4Øé\u0018m\u0094^6èÏÍ{gë\u0091ôÛ©X´\u008bÖþßR¬È\u0094(ý\u0080»ÙÞÁê9\u001b\u00825Ñõ\u0086Ë\u0017\u0005\u009dÕ\u008aÓ\u0010\u008b\u0085\u0098Å\u0014/ºóÄ\"kð^/s?\u0092ë\u0010ö\u001fUÇ\u008b¿Õ¬ÓVº²_/n´\u0010ºÒ_°L·e¹\u008cRÏ\u0018ÍßF:";
int var28 = "\u0003ßUA ©7ÈDñßÿTîbÐ\u009c5.G\u0080\u0090yÖ\t%\u007f\u0010\u009bíð\u0010xÇVõêÛy\u0018-þ\u0007V Ý:<êÆ\u0006_ô\u009efèñí½\u0006é²\u0081å\u0005ñV°7÷ä\u0080T³ÌÄ?¹8\u0010\u009b yA\"§0vm\u009b:S²\u0081.ÙEò`ø\u0001\u00820\u0085\u009a{\r/7*\u008c+â+þÇ\u001c?E¤í¸Kq¶tÆo$d\u0088\u0095¨\u0011#Z\u0012\u0003g6¦\u001eÿjÔq¿ø\b\u0017\u007fµe\u0010\u0099C\u00946¸sF\u0083B3\u001fûÃ'\u001a8\u0010r\u0000ëÊÐhïäß¤ºxmç¦\u009a0bAh\u0089oÏfNÅ÷\u008dz>¬\u008fËFÅ(kÑ;¯\u0019ðªEéÏiGþñ\rf\u0095ª ¬\u0003\u0003TLò`\u0006\u0081\u0094\u0010ì+e§I\u0002CW½\u00167\u0011âUVB\u0010áZ\u008amé\\[>'\u001c_¥@Ô`y\u0018¯2êÁ\u0083x·C°5k8S¹Ãäúú<ÆÿJ\u0090\u0018\u0010\u009f!ÐfKNxðt¾d×\f5Ym(9þuß\f4\u0088\u001aA\u0089á.@TcH|ö_4H\u0007qÒmqo2\u0083\u00870ËG£7~\u0001þâÍ\u0018úWÐÁäÄS¼µ]¢ý%\u001aN²\u0085_í¦\fó\u0091i\u0018\u0004sÑ. \u0093Oå\u001a\u0003Éò^¾ó?s\u0002G¤\u0006}?l\u0010\u009a,ïÂ\u009a¹±b°\u00adå§ÒnÔ©\u0018Õ\u0011\u000e?AÔô\u0010\u008f\u0007ì\u008a«k°½vN\u009cíè£]û(\u0082\u0098\b\u0080\u001b\u008e1^\u0085ü§\u0014ê\u0080çmm]ô\u0011üCwú\u0082àRu>`ßbH,`]ªúï\r8nÿ{\u001d¥ÎÄÆc\u009c½d[È4\u0003ãmÁúóºK1\u0016=µ½VØ\u008f\u0086õ3\u0003\u000e\u008e×¬DÄñW+_\u0089Î.\u000b¶SkÍh\u0013æp\u0000\u009e¶%(Q·»G\u009eLoä¸PpÄ3Â\"\fjzynØùm\u0085\u0019~\u001e Á-\u001dºx\u0096\u009eKã<}¤Nk°ýRrË\u0082£Â<ô\u0015\u0010tMÿ\u0001ÛÙºøÁGL\u0091\u009dúð=<¡`÷V\u000eªQ=Qµ\u0010Ûî\u008cè\u009cáµf\u009f\u0016*ä%uð\u009f[\u008bYÁâº4Øé\u0018m\u0094^6èÏÍ{gë\u0091ôÛ©X´\u008bÖþßR¬È\u0094(ý\u0080»ÙÞÁê9\u001b\u00825Ñõ\u0086Ë\u0017\u0005\u009dÕ\u008aÓ\u0010\u008b\u0085\u0098Å\u0014/ºóÄ\"kð^/s?\u0092ë\u0010ö\u001fUÇ\u008b¿Õ¬ÓVº²_/n´\u0010ºÒ_°L·e¹\u008cRÏ\u0018ÍßF:"
.length();
char var25 = ' ';
int var39 = -1;

label74:
while (true) {
String var40 = var26.substring(++var39, var39 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var40.getBytes("ISO-8859-1"));
String var54 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var54;
if ((var39 += var25) >= var28) {
b = var29;
c = new String[23];
k = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[35];
int var14 = 0;
String var15 = "ÜÅ¡Ï\u009b:p-[\u001e#\u008b\u001e7\u000eÔ\u0010\u0092u\u0087Å\u001bÝì\u0095\u000bð÷RÞwµ»\u001c\u0084H\u008aDàf?<\u008cW\bÍ¼Ék__\u0005ï\u0011\u009f \u009bI\u009c4ëíØÎ\u0093kYk¼röGÁ+(\u008b\u0099(ÀH*>\u0095ex\u009aÙ¾ít\\3Ug\u0098Ì\\4V(Ç#\u0093\u0007!ô.l-ú±b\u0087@a!`}\u0003\u0016\u000b\"®ñ\u001f\u001b(\u0096û\u001e\u0007îäk6éj\u0098#ëy\u0099\u001a³m\u008c\u0004ëÑ\u008d´|äÍ½\u0012M-?ÜucÂé\u0096¤pñ8\u0013K#\u0011\u0010\u0012' E©X\\H\u009dy8¦\u0093\u000e^ºÈýç¡å\u0082ø<<TÜ/7¡Äùéø`\t¨kÛ÷t\u0094÷\u0000\u008d\u008aå¼\u009b~\u001bù\u0081åähG\u0007¸ GïúVÌ\u007f'\u0004¢ /\u001fÍôäGÄ\u0093û©\u0015\u008f\u0088\u0004êQ·~C\u00ad";
int var16 = "ÜÅ¡Ï\u009b:p-[\u001e#\u008b\u001e7\u000eÔ\u0010\u0092u\u0087Å\u001bÝì\u0095\u000bð÷RÞwµ»\u001c\u0084H\u008aDàf?<\u008cW\bÍ¼Ék__\u0005ï\u0011\u009f \u009bI\u009c4ëíØÎ\u0093kYk¼röGÁ+(\u008b\u0099(ÀH*>\u0095ex\u009aÙ¾ít\\3Ug\u0098Ì\\4V(Ç#\u0093\u0007!ô.l-ú±b\u0087@a!`}\u0003\u0016\u000b\"®ñ\u001f\u001b(\u0096û\u001e\u0007îäk6éj\u0098#ëy\u0099\u001a³m\u008c\u0004ëÑ\u008d´|äÍ½\u0012M-?ÜucÂé\u0096¤pñ8\u0013K#\u0011\u0010\u0012' E©X\\H\u009dy8¦\u0093\u000e^ºÈýç¡å\u0082ø<<TÜ/7¡Äùéø`\t¨kÛ÷t\u0094÷\u0000\u008d\u008aå¼\u009b~\u001bù\u0081åähG\u0007¸ GïúVÌ\u007f'\u0004¢ /\u001fÍôäGÄ\u0093û©\u0015\u008f\u0088\u0004êQ·~C\u00ad"
.length();
byte var13 = 0;

label56:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var43 = var17;
var10001 = var14++;
long var58 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var62 = -1;

while (true) {
long var19 = var58;
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
long var66 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var62) {
case 0:
var43[var10001] = var66;
if (var13 >= var16) {
g = var17;
h = new Integer[35];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var31 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "sã\u009e\u0093\u0095\u0089:êsã\u009e\u0093\u0095\u0089:ê";
int var6 = "sã\u009e\u0093\u0095\u0089:êsã\u009e\u0093\u0095\u0089:ê".length();
byte var3 = 0;

do {
int var51 = var3;
var3 += 8;
byte[] var7 = var5.substring(var51, var3).getBytes("ISO-8859-1");
var51 = var4++;
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
var66 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var65 = -1;
var0[var51] = var66;
} while (var3 < var6);

Y = new p3(var35);
i = new ArrayList();
K = new fd(_s.OUT_BACK, var0[1], var33);
O = new fd(_s.OUT_QUINT, var0[0], var33);
return;
}
break;
default:
var43[var10001] = var66;
if (var13 < var16) {
continue label56;
}

var15 = "\u009bÈ÷þ-\u0002?Á\u0004\u0017W)7\u001e³·";
var16 = "\u009bÈ÷þ-\u0002?Á\u0004\u0017W)7\u001e³·".length();
var13 = 0;
}

byte var50 = var13;
var13 += 8;
var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
var43 = var17;
var10001 = var14++;
var58 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var62 = 0;
}
}
}

var25 = var26.charAt(var39);
break;
default:
var29[var27++] = var54;
if ((var39 += var25) < var28) {
var25 = var26.charAt(var39);
continue label74;
}

var26 = "\u0085òW'\u0095\u0088#@íI§p\u0094\u0082\u0081·8Ð¯d\u0082Dqp\u008d4ßÊA\u009f\u0094¢\u0098R\u0000\u0085\nv-3\u0093\u0083\u0006J\u007fwW¶È}\u0014´;fù=\u00175\u008a]\u0010\u0017Ób%x¸úÆ@(4U";
var28 = "\u0085òW'\u0095\u0088#@íI§p\u0094\u0082\u0081·8Ð¯d\u0082Dqp\u008d4ßÊA\u009f\u0094¢\u0098R\u0000\u0085\nv-3\u0093\u0083\u0006J\u007fwW¶È}\u0014´;fù=\u00175\u008a]\u0010\u0017Ób%x¸úÆ@(4U"
.length();
var25 = 16;
var39 = -1;
}

var40 = var26.substring(++var39, var39 + var25);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13194;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/p3", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/p3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6422;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/p3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/p3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
