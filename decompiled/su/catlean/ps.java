package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ps extends gf {
@NotNull
public static final ps b;
@Nullable
private static class_6364 a;
private static boolean I;
private static long c;
private static final long f = yz.a(-5595675317502684446L, 4192046950317347832L, MethodHandles.lookup().lookupClass()).a(153251678729737L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);
private static final long[] k;
private static final Integer[] l;
private static final Map m;
private static final long n;

private ps(long var1) {
var1 = f ^ var1;
long var10001 = var1 ^ 70039035886126L;
int var3 = (int)((var1 ^ 70039035886126L) >>> 48);
int var4 = (int)((var1 ^ 70039035886126L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"k">(17150, 4003030041659312281L ^ var1), (char)var5);
}

@Nullable
public final class_6364 k() {
return a;
}

public final void F(@Nullable class_6364 <set-?>) {
a = <set-?>;
}

public final boolean a() {
return I;
}

public final void b(boolean <set-?>) {
I = <set-?>;
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 73719739740194
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 104104530525409
// 00c: lxor
// 00d: dup2
// 00e: bipush 48
// 010: lushr
// 011: l2i
// 012: istore 6
// 014: dup2
// 015: bipush 16
// 017: lshl
// 018: bipush 32
// 01a: lushr
// 01b: l2i
// 01c: istore 7
// 01e: dup2
// 01f: bipush 48
// 021: lshl
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 8
// 028: pop2
// 029: dup2
// 02a: ldc2_w 25262470473906
// 02d: lxor
// 02e: lstore 9
// 030: dup2
// 031: ldc2_w 50910300018319
// 034: lxor
// 035: lstore 11
// 037: dup2
// 038: ldc2_w 128377113661390
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 122759580220691
// 042: lxor
// 043: lstore 15
// 045: dup2
// 046: ldc2_w 23238624456863
// 049: lxor
// 04a: lstore 17
// 04c: dup2
// 04d: ldc2_w 30591967126976
// 050: lxor
// 051: lstore 19
// 053: dup2
// 054: ldc2_w 118028023098805
// 057: lxor
// 058: lstore 21
// 05a: pop2
// 05b: ldc2_w -5990947769900206742
// 05e: lload 1
// 05f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: aload 3
// 065: sipush 32082
// 068: ldc2_w 6832059094086937336
// 06b: lload 1
// 06c: lxor
// 06d: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 075: istore 23
// 077: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 07a: iload 23
// 07c: ifne 0c4
// 07f: ifnonnull 0bc
// 082: goto 08f
// 085: ldc2_w -6040729461903949688
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: new net/minecraft/class_6364
// 092: dup
// 093: lload 4
// 095: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 098: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 09b: getfield net/minecraft/class_276.field_1482 I
// 09e: lload 4
// 0a0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a3: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0a6: getfield net/minecraft/class_276.field_1481 I
// 0a9: invokespecial net/minecraft/class_6364.<init> (II)V
// 0ac: putstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 0af: goto 0bc
// 0b2: ldc2_w -6040729461903949688
// 0b5: lload 1
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: lload 4
// 0be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0c4: getfield net/minecraft/class_276.field_1482 I
// 0c7: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 0ca: dup
// 0cb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ce: getfield net/minecraft/class_6364.field_1482 I
// 0d1: lload 1
// 0d2: lconst_0
// 0d3: lcmp
// 0d4: ifle 10e
// 0d7: iload 23
// 0d9: ifne 10e
// 0dc: if_icmpne 111
// 0df: goto 0ec
// 0e2: ldc2_w -6040729461903949688
// 0e5: lload 1
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: lload 4
// 0ee: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0f4: getfield net/minecraft/class_276.field_1481 I
// 0f7: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 0fa: dup
// 0fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0fe: getfield net/minecraft/class_6364.field_1481 I
// 101: goto 10e
// 104: ldc2_w -6040729461903949688
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: if_icmpeq 13e
// 111: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 114: dup
// 115: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 118: lload 4
// 11a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 11d: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 120: getfield net/minecraft/class_276.field_1482 I
// 123: lload 4
// 125: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 128: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 12b: getfield net/minecraft/class_276.field_1481 I
// 12e: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 131: goto 13e
// 134: ldc2_w -6040729461903949688
// 137: lload 1
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: sipush 13938
// 141: ldc2_w 557815095773864400
// 144: lload 1
// 145: lxor
// 146: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: astore 24
// 14d: aload 0
// 14e: lload 19
// 150: invokevirtual su/catlean/ps.p (J)F
// 153: fstore 25
// 155: aload 0
// 156: checkcast su/catlean/gf
// 159: aload 3
// 15a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 15d: dup
// 15e: sipush 28281
// 161: ldc2_w 8253941623607294418
// 164: lload 1
// 165: lxor
// 166: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16e: fload 25
// 170: aload 0
// 171: lload 11
// 173: invokevirtual su/catlean/ps.V (J)F
// 176: iload 6
// 178: i2s
// 179: swap
// 17a: iload 7
// 17c: swap
// 17d: ldc 145.0
// 17f: ldc 13.0
// 181: iload 8
// 183: i2s
// 184: fconst_0
// 185: bipush 0
// 186: sipush 25066
// 189: ldc2_w 5246673695488974683
// 18c: lload 1
// 18d: lxor
// 18e: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: aconst_null
// 194: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 197: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 19a: aload 3
// 19b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 19e: dup
// 19f: sipush 27090
// 1a2: ldc2_w 2950857984416808561
// 1a5: lload 1
// 1a6: lxor
// 1a7: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1af: fload 25
// 1b1: sipush 6149
// 1b4: ldc2_w 4085647762553890480
// 1b7: lload 1
// 1b8: lxor
// 1b9: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: i2f
// 1bf: fadd
// 1c0: aload 0
// 1c1: lload 11
// 1c3: invokevirtual su/catlean/ps.V (J)F
// 1c6: ldc 3.0
// 1c8: fadd
// 1c9: ldc 0.5
// 1cb: ldc 7.5
// 1cd: bipush 1
// 1ce: anewarray 512
// 1d1: astore 26
// 1d3: aload 26
// 1d5: bipush 0
// 1d6: new java/awt/Color
// 1d9: dup
// 1da: sipush 23112
// 1dd: ldc2_w 6001333291484030207
// 1e0: lload 1
// 1e1: lxor
// 1e2: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: bipush 1
// 1e8: invokespecial java/awt/Color.<init> (IZ)V
// 1eb: aastore
// 1ec: aload 26
// 1ee: lload 17
// 1f0: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 1f3: aload 0
// 1f4: checkcast su/catlean/gf
// 1f7: aload 0
// 1f8: invokevirtual su/catlean/ps.x ()Lsu/catlean/bj;
// 1fb: aload 3
// 1fc: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1ff: dup
// 200: sipush 27090
// 203: ldc2_w 2950857984416808561
// 206: lload 1
// 207: lxor
// 208: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 210: fload 25
// 212: fconst_2
// 213: fadd
// 214: aload 0
// 215: lload 11
// 217: invokevirtual su/catlean/ps.V (J)F
// 21a: ldc 10.0
// 21c: lload 9
// 21e: ldc 10.0
// 220: fconst_0
// 221: sipush 12803
// 224: ldc2_w 3125707242495429819
// 227: lload 1
// 228: lxor
// 229: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: aconst_null
// 22f: invokestatic su/catlean/gf.l (Lsu/catlean/gf;Lsu/catlean/bj;Lorg/joml/Matrix3x2fStack;FFFJFFILjava/lang/Object;)V
// 232: sipush 32729
// 235: aload 0
// 236: aload 3
// 237: aload 24
// 239: fload 25
// 23b: ldc 18.0
// 23d: fadd
// 23e: aload 0
// 23f: lload 11
// 241: invokevirtual su/catlean/ps.V (J)F
// 244: fconst_1
// 245: fadd
// 246: lload 13
// 248: dup2_x1
// 249: pop2
// 24a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 24d: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 250: invokevirtual su/catlean/ps.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 253: ldc2_w 7154883506562498912
// 256: lload 1
// 257: lxor
// 258: bipush 0
// 259: istore 26
// 25b: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: istore 26
// 262: bipush 3
// 263: istore 27
// 265: bipush 0
// 266: istore 28
// 268: iload 28
// 26a: iload 27
// 26c: if_icmpge 3bb
// 26f: iload 28
// 271: istore 29
// 273: bipush 0
// 274: istore 30
// 276: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 279: lload 11
// 27b: invokevirtual su/catlean/ps.V (J)F
// 27e: iload 29
// 280: sipush 16603
// 283: ldc2_w 275683988707655270
// 286: lload 1
// 287: lxor
// 288: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: imul
// 28e: i2f
// 28f: fadd
// 290: sipush 30820
// 293: ldc2_w 3367758961299359440
// 296: lload 1
// 297: lxor
// 298: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: i2f
// 29e: fadd
// 29f: fstore 31
// 2a1: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 2a4: checkcast su/catlean/gf
// 2a7: aload 3
// 2a8: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2ab: dup
// 2ac: sipush 27090
// 2af: ldc2_w 2950857984416808561
// 2b2: lload 1
// 2b3: lxor
// 2b4: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2bc: fload 25
// 2be: iload 6
// 2c0: i2s
// 2c1: iload 7
// 2c3: fload 31
// 2c5: ldc 145.0
// 2c7: ldc 16.0
// 2c9: iload 8
// 2cb: i2s
// 2cc: fconst_0
// 2cd: bipush 0
// 2ce: sipush 25336
// 2d1: ldc2_w 6357221543833803851
// 2d4: lload 1
// 2d5: lxor
// 2d6: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: aconst_null
// 2dc: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 2df: sipush 3532
// 2e2: ldc2_w 7938943146183226226
// 2e5: lload 1
// 2e6: lxor
// 2e7: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: istore 32
// 2ee: iload 23
// 2f0: lload 1
// 2f1: lconst_0
// 2f2: lcmp
// 2f3: iflt 2fa
// 2f6: ifne 3d2
// 2f9: bipush 0
// 2fa: istore 33
// 2fc: iload 33
// 2fe: iload 32
// 300: if_icmpge 3ac
// 303: iload 33
// 305: istore 34
// 307: bipush 0
// 308: istore 35
// 30a: iload 34
// 30c: sipush 12862
// 30f: ldc2_w 5110629256414678146
// 312: lload 1
// 313: lxor
// 314: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: iload 23
// 31b: ifne 26c
// 31e: iload 23
// 320: lload 1
// 321: lconst_0
// 322: lcmp
// 323: ifle 31b
// 326: ifne 3a0
// 329: if_icmpge 39d
// 32c: goto 339
// 32f: ldc2_w -6040729461903949688
// 332: lload 1
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: lload 21
// 33b: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 33e: checkcast su/catlean/gf
// 341: aload 3
// 342: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 345: dup
// 346: sipush 27090
// 349: ldc2_w 2950857984416808561
// 34c: lload 1
// 34d: lxor
// 34e: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 356: fload 25
// 358: sipush 11568
// 35b: ldc2_w 624221839668859786
// 35e: lload 1
// 35f: lxor
// 360: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 365: i2f
// 366: fadd
// 367: iload 34
// 369: sipush 14813
// 36c: ldc2_w 153780329164293999
// 36f: lload 1
// 370: lxor
// 371: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 376: imul
// 377: i2f
// 378: fadd
// 379: fload 31
// 37b: ldc 4.0
// 37d: fadd
// 37e: fconst_0
// 37f: sipush 9759
// 382: ldc2_w 6503364499607312544
// 385: lload 1
// 386: lxor
// 387: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38c: aconst_null
// 38d: invokestatic su/catlean/gf.u (JLsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FFFILjava/lang/Object;)V
// 390: goto 39d
// 393: ldc2_w -6040729461903949688
// 396: lload 1
// 397: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39c: athrow
// 39d: iload 26
// 39f: bipush 1
// 3a0: iadd
// 3a1: istore 26
// 3a3: nop
// 3a4: iinc 33 1
// 3a7: iload 23
// 3a9: ifeq 2fc
// 3ac: nop
// 3ad: iinc 28 1
// 3b0: iload 23
// 3b2: lload 1
// 3b3: lconst_0
// 3b4: lcmp
// 3b5: ifle 305
// 3b8: ifeq 268
// 3bb: aload 0
// 3bc: aload 3
// 3bd: lload 15
// 3bf: fload 25
// 3c1: invokespecial su/catlean/ps.t (Lnet/minecraft/class_332;JF)V
// 3c4: aload 0
// 3c5: ldc 145.0
// 3c7: ldc 70.0
// 3c9: invokevirtual su/catlean/ps.X (FF)V
// 3cc: lload 1
// 3cd: lconst_0
// 3ce: lcmp
// 3cf: iflt 3d2
// 3d2: return
}

@Override
public void H(@NotNull class_332 context, long a) {
long var4 = ax ^ 96852611647315L;
long var6 = ax ^ 99437811927052L;
long var8 = ax ^ 98664999447709L;
Intrinsics.checkNotNullParameter(context, b<"k">(31928, 2823044793650176589L ^ ax));
this.j(var6);
this.L(context, var4, this.p(var8));
}

private final void t(class_332 param1, long param2, float param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ps.f J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 130835104867013
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 30507812013160
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 134362771879061
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 94952638196963
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: ldc2_w -126992162813859955
// 027: lload 2
// 028: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: istore 13
// 02f: invokestatic su/catlean/zf.A ()J
// 032: getstatic su/catlean/ps.c J
// 035: lsub
// 036: getstatic su/catlean/ps.n J
// 039: lcmp
// 03a: iload 13
// 03c: ifne 090
// 03f: ifge 082
// 042: goto 04f
// 045: ldc2_w -86639878209547665
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 052: invokevirtual su/catlean/w8.q ()Lsu/catlean/gf;
// 055: aload 0
// 056: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 059: lload 2
// 05a: lconst_0
// 05b: lcmp
// 05c: ifle 0c1
// 05f: iload 13
// 061: ifne 090
// 064: goto 071
// 067: ldc2_w -86639878209547665
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: ifne 082
// 074: goto 081
// 077: ldc2_w -86639878209547665
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: return
// 082: invokestatic su/catlean/zf.A ()J
// 085: putstatic su/catlean/ps.c J
// 088: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 08b: bipush 1
// 08c: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 08f: bipush 1
// 090: putstatic su/catlean/ps.I Z
// 093: sipush 3532
// 096: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 099: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 09e: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 0a1: dup
// 0a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a5: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0a8: dup
// 0a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ac: bipush 0
// 0ad: getstatic su/catlean/ps.a Lnet/minecraft/class_6364;
// 0b0: dup
// 0b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b4: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0b7: dup
// 0b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bb: dconst_1
// 0bc: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 0c1: ldc2_w 7939000931965772181
// 0c4: lload 2
// 0c5: lxor
// 0c6: new net/minecraft/class_4587
// 0c9: dup
// 0ca: invokespecial net/minecraft/class_4587.<init> ()V
// 0cd: astore 14
// 0cf: invokestatic com/mojang/blaze3d/systems/RenderSystem.backupProjectionMatrix ()V
// 0d2: lload 5
// 0d4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d7: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0da: dup
// 0db: sipush 11735
// 0de: ldc2_w 7988476116776052886
// 0e1: lload 2
// 0e2: lxor
// 0e3: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0eb: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 0ee: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelProjectionMatrixBuffer ()Lnet/minecraft/class_11286; 1
// 0f3: new org/joml/Matrix4f
// 0f6: dup
// 0f7: invokespecial org/joml/Matrix4f.<init> ()V
// 0fa: invokevirtual org/joml/Matrix4f.identity ()Lorg/joml/Matrix4f;
// 0fd: fconst_0
// 0fe: lload 5
// 100: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 103: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 106: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 109: i2f
// 10a: lload 5
// 10c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 10f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 112: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 115: i2f
// 116: fconst_0
// 117: ldc -160.0
// 119: ldc 160.0
// 11b: invokevirtual org/joml/Matrix4f.setOrtho (FFFFFF)Lorg/joml/Matrix4f;
// 11e: invokevirtual net/minecraft/class_11286.method_71123 (Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 121: invokestatic com/mojang/blaze3d/systems/RenderSystem.getProjectionType ()Lnet/minecraft/class_10366;
// 124: invokestatic com/mojang/blaze3d/systems/RenderSystem.setProjectionMatrix (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V
// 127: lload 5
// 129: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12c: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 12f: invokevirtual net/minecraft/class_757.method_71114 ()Lnet/minecraft/class_308;
// 132: getstatic net/minecraft/class_308$class_11274.field_60026 Lnet/minecraft/class_308$class_11274;
// 135: invokevirtual net/minecraft/class_308.method_71034 (Lnet/minecraft/class_308$class_11274;)V
// 138: bipush 0
// 139: istore 15
// 13b: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: istore 15
// 142: bipush 3
// 143: istore 16
// 145: bipush 0
// 146: istore 17
// 148: iload 17
// 14a: iload 16
// 14c: if_icmpge 244
// 14f: iload 17
// 151: istore 18
// 153: bipush 0
// 154: istore 19
// 156: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 159: lload 7
// 15b: invokevirtual su/catlean/ps.V (J)F
// 15e: iload 18
// 160: sipush 26023
// 163: ldc2_w 7836540928256559611
// 166: lload 2
// 167: lxor
// 168: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: imul
// 16e: i2f
// 16f: fadd
// 170: sipush 30820
// 173: ldc2_w 3367737170163291191
// 176: lload 2
// 177: lxor
// 178: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: i2f
// 17e: fadd
// 17f: fstore 20
// 181: sipush 3532
// 184: ldc2_w 7939000931965772181
// 187: lload 2
// 188: lxor
// 189: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: istore 21
// 190: lload 2
// 191: lconst_0
// 192: lcmp
// 193: iflt 282
// 196: bipush 0
// 197: iload 13
// 199: ifne 278
// 19c: istore 22
// 19e: iload 22
// 1a0: iload 21
// 1a2: if_icmpge 23b
// 1a5: iload 22
// 1a7: istore 23
// 1a9: bipush 0
// 1aa: istore 24
// 1ac: lload 11
// 1ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b1: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1b4: iload 15
// 1b6: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1b9: dup
// 1ba: sipush 20379
// 1bd: ldc2_w 4757985544739031768
// 1c0: lload 2
// 1c1: lxor
// 1c2: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ca: astore 25
// 1cc: aload 14
// 1ce: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 1d1: aload 14
// 1d3: fload 4
// 1d5: ldc 2.5
// 1d7: fadd
// 1d8: iload 23
// 1da: sipush 14813
// 1dd: ldc2_w 153794838957036936
// 1e0: lload 2
// 1e1: lxor
// 1e2: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: imul
// 1e8: i2f
// 1e9: fadd
// 1ea: fload 20
// 1ec: ldc 2.5
// 1ee: fadd
// 1ef: fconst_0
// 1f0: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 1f3: aload 14
// 1f5: ldc 0.75
// 1f7: ldc 0.75
// 1f9: fconst_1
// 1fa: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 1fd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 200: lload 9
// 202: aload 14
// 204: aload 25
// 206: invokevirtual su/catlean/jl.z (JLnet/minecraft/class_4587;Lnet/minecraft/class_1799;)V
// 209: aload 14
// 20b: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 20e: iload 15
// 210: bipush 1
// 211: iadd
// 212: istore 15
// 214: nop
// 215: iinc 22 1
// 218: iload 13
// 21a: lload 2
// 21b: lconst_0
// 21c: lcmp
// 21d: iflt 241
// 220: ifne 23f
// 223: iload 13
// 225: ifeq 19e
// 228: lload 2
// 229: lconst_0
// 22a: lcmp
// 22b: iflt 218
// 22e: goto 23b
// 231: ldc2_w -86639878209547665
// 234: lload 2
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: nop
// 23c: iinc 17 1
// 23f: iload 13
// 241: ifeq 148
// 244: lload 5
// 246: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 249: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 24c: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
// 24f: invokevirtual net/minecraft/class_11684.method_73002 ()V
// 252: lload 5
// 254: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 257: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
// 25a: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
// 25d: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
// 260: lload 5
// 262: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 265: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 268: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 26b: invokevirtual net/minecraft/class_11661.method_72953 ()V
// 26e: invokestatic com/mojang/blaze3d/systems/RenderSystem.restoreProjectionMatrix ()V
// 271: lload 2
// 272: lconst_0
// 273: lcmp
// 274: iflt 282
// 277: bipush 0
// 278: putstatic su/catlean/ps.I Z
// 27b: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 27e: bipush 0
// 27f: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 282: return
}

private final void j(long var1) {
var1 = f ^ var1;
long var3 = var1 ^ 1404232457863L;
long var5 = var1 ^ 102822249103860L;
long var7 = var1 ^ 107783694360659L;
long var9 = var1 ^ 12134239393177L;
long var11 = var1 ^ 68259916007224L;
long var13 = var1 ^ 56113834345832L;
float var20 = zf.F(var3).method_22683().method_4486();
float var21 = zf.F(var3).method_22683().method_4502();
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, b<"k">(29500, 538816103658048052L ^ var1));
int var10005 = d<"n">(23428, 8401792052032768913L ^ var1);
Object var15 = null;
int var16 = var10005;
boolean var17 = false;
byte var18 = 0;
VertexFormat var19 = var10002;
g7 var22 = new g7(var5, var19, var18, var17, var16, (DefaultConstructorMarker)var15);
g7 var10000 = g7.j(var22, 0.0F, var21, 0.0F, 4, var11, null).j(0.0F, var13, 0.0F);
Color var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"k">(7458, 6947452951425754151L ^ var1));
var10000.n(var10001, var7);
var10000 = g7.j(var22, var20, var21, 0.0F, 4, var11, null).j(1.0F, var13, 0.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"k">(22948, 6279463443593388192L ^ var1));
var10000.n(var10001, var7);
var10000 = g7.j(var22, var20, 0.0F, 0.0F, 4, var11, null).j(1.0F, var13, 1.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"k">(22948, 6279463443593388192L ^ var1));
var10000.n(var10001, var7);
var10000 = g7.j(var22, 0.0F, 0.0F, 0.0F, 4, var11, null).j(0.0F, var13, 1.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"k">(22948, 6279463443593388192L ^ var1));
var10000.n(var10001, var7);
RenderPipeline var30 = b6.R.O();
class_276 var10003 = zf.F(var3).method_1522();
Intrinsics.checkNotNullExpressionValue(var10003, b<"k">(21052, 4838925888475786037L ^ var1));
String var10007 = b<"k">(18437, 7039245626236858631L ^ var1);
class_6364 var10008 = a;
Intrinsics.checkNotNull(a);
GpuTextureView var31 = var10008.method_71639();
Intrinsics.checkNotNull(var31);
g7.R(var9, var22, var30, var10003, null, null, null, MapsKt.mapOf(TuplesKt.to(var10007, var31)), d<"n">(1358, 7660399718385145181L ^ var1), null);
}

private final void L(class_332 param1, long param2, float param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ps.f J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 79838312808949
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 3482961939096
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 7
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 8
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 9
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 121366457087861
// 033: lxor
// 034: lstore 10
// 036: dup2
// 037: ldc2_w 77573162276133
// 03a: lxor
// 03b: lstore 12
// 03d: dup2
// 03e: ldc2_w 39054431657982
// 041: lxor
// 042: lstore 14
// 044: pop2
// 045: ldc2_w 5557899964312130704
// 048: lload 2
// 049: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: bipush 0
// 04f: istore 17
// 051: sipush 3532
// 054: ldc2_w 7938872620107371144
// 057: lload 2
// 058: lxor
// 059: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: istore 17
// 060: bipush 3
// 061: istore 18
// 063: istore 16
// 065: bipush 0
// 066: istore 19
// 068: iload 19
// 06a: iload 18
// 06c: if_icmpge 19d
// 06f: iload 19
// 071: istore 20
// 073: bipush 0
// 074: istore 21
// 076: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 079: lload 10
// 07b: invokevirtual su/catlean/ps.V (J)F
// 07e: iload 20
// 080: sipush 26023
// 083: ldc2_w 7836414717735828198
// 086: lload 2
// 087: lxor
// 088: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: imul
// 08e: i2f
// 08f: fadd
// 090: sipush 30820
// 093: ldc2_w 3367829138620933930
// 096: lload 2
// 097: lxor
// 098: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: i2f
// 09e: fadd
// 09f: fstore 22
// 0a1: sipush 3532
// 0a4: ldc2_w 7938872620107371144
// 0a7: lload 2
// 0a8: lxor
// 0a9: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: istore 23
// 0b0: iload 16
// 0b2: lload 2
// 0b3: lconst_0
// 0b4: lcmp
// 0b5: iflt 0bc
// 0b8: ifne 1b3
// 0bb: bipush 0
// 0bc: istore 24
// 0be: iload 24
// 0c0: iload 23
// 0c2: if_icmpge 18e
// 0c5: iload 24
// 0c7: istore 25
// 0c9: bipush 0
// 0ca: istore 26
// 0cc: lload 14
// 0ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d1: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0d4: iload 17
// 0d6: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0d9: dup
// 0da: sipush 26376
// 0dd: ldc2_w 4307576940112056663
// 0e0: lload 2
// 0e1: lxor
// 0e2: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ea: astore 27
// 0ec: aload 27
// 0ee: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 0f1: bipush 1
// 0f2: iload 16
// 0f4: ifne 06c
// 0f7: iload 16
// 0f9: lload 2
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: ifle 0f4
// 0ff: ifne 182
// 102: if_icmple 17f
// 105: goto 112
// 108: ldc2_w 5607338480342163826
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: lload 5
// 114: invokestatic su/catlean/b8.M (J)Lsu/catlean/c6;
// 117: aload 1
// 118: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 11b: dup
// 11c: sipush 27090
// 11f: ldc2_w 2950928265673383819
// 122: lload 2
// 123: lxor
// 124: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ps.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12c: aload 27
// 12e: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 131: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 134: fload 4
// 136: fconst_2
// 137: fadd
// 138: iload 25
// 13a: sipush 14813
// 13d: ldc2_w 153709842950858389
// 140: lload 2
// 141: lxor
// 142: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: imul
// 148: i2f
// 149: fadd
// 14a: ldc 4.0
// 14c: fadd
// 14d: fload 22
// 14f: ldc 1.5
// 151: fadd
// 152: ldc 4.0
// 154: fadd
// 155: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 158: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 15b: lload 12
// 15d: dup2_x1
// 15e: pop2
// 15f: bipush 0
// 160: bipush 0
// 161: sipush 25336
// 164: ldc2_w 6357151258334887345
// 167: lload 2
// 168: lxor
// 169: invokedynamic n (IJ)I bsm=su/catlean/ps.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: aconst_null
// 16f: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 172: goto 17f
// 175: ldc2_w 5607338480342163826
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: iload 17
// 181: bipush 1
// 182: iadd
// 183: istore 17
// 185: nop
// 186: iinc 24 1
// 189: iload 16
// 18b: ifeq 0be
// 18e: nop
// 18f: iinc 19 1
// 192: iload 16
// 194: lload 2
// 195: lconst_0
// 196: lcmp
// 197: ifle 0c7
// 19a: ifeq 068
// 19d: lload 5
// 19f: invokestatic su/catlean/b8.M (J)Lsu/catlean/c6;
// 1a2: iload 7
// 1a4: iload 8
// 1a6: i2c
// 1a7: iload 9
// 1a9: i2s
// 1aa: invokevirtual su/catlean/c6.g (ICS)V
// 1ad: lload 2
// 1ae: lconst_0
// 1af: lcmp
// 1b0: ifle 1b3
// 1b3: return
}

static {
long var25 = f ^ 52563323962585L;
long var27 = var25 ^ 82270037423228L;
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[14];
int var21 = 0;
String var20 = "\u00adêv\u0019+Ç|_,\u0090\u000bq6Ýã]\u0010\u0012úæú¡è\\w]\u0096\u0014Ãó\u0005pì\u0018ù'Ðd\"'T\u009e\u0002Dv\u007f¼¯\u008eQú\u001bÇ\u0017uÚ\u0088L \u001aEÔBj×.+»E\u008e\u00800í×\u0014½É£\\\u000ejË\u009a]7ðg:\u000f\u0083X Ä¿5xëFxý»\u0095¹Ã$Xû\u0087H1±\u0014\u0013ÇªÉ\u0095\u0006\u0011ÁYÞÅö 1Å½u\u0090ÿU\u0087\u0098q\u0087wbïeúTÆp\r\u0011|®æ\u0095Vó^>Ùõs \u0087\u0096ÑÓÆd°¢#Àuò\u008ad%\u001bYþR;iY¶\u0017\u0089q\u0084´ÌeV§\u0090/\u000f Æe,9åk\u001f¡Ôbôû\u0004?£Ã\u0080¯\u009a\u001b×c\u001fNZAR,\u0081\u0080)í\u0097\u0096Ä´§:(5ÖÚRuÍu$ë\u009a4æ×\u001bÄ\t¨ö\u0082H@ß\u0084j6IIf½âµòéÞÂ÷¨÷Ý=þD³q\u0096\u008f\u0092\u001d§\u0086\u0083+Ö)Ìz5x`!Ú\u001b\u0019÷¥,\u001bSW-\u0093Ùb²\u008e\u008a\u00076Iò\u00009S\u008cðÔ\f\u0094\u009d»J·¦\u001d\t\u0091*\u0017dNS((åÓ¤GzÊ¢1ÜÂñIµâÊ#ÑV?á\u0097#÷¤øÁeZ!³òR\u0083¥\u009c\u0092\u001d<F³\u0010 0î,\u0012\u0086£Ál¾¡·îÁ\tÍ \u0081vf\u0018\u0093\u000el\u0003Û\u0099ê÷u¦ò\f\u0004xY«f\u0097\u0011\u0092\u001eOÐÅ. :8\u0010J\u0084\u0082ù\u00adø{»r¿=ªÃ\u0082\u008dÁ";
int var22 = "\u00adêv\u0019+Ç|_,\u0090\u000bq6Ýã]\u0010\u0012úæú¡è\\w]\u0096\u0014Ãó\u0005pì\u0018ù'Ðd\"'T\u009e\u0002Dv\u007f¼¯\u008eQú\u001bÇ\u0017uÚ\u0088L \u001aEÔBj×.+»E\u008e\u00800í×\u0014½É£\\\u000ejË\u009a]7ðg:\u000f\u0083X Ä¿5xëFxý»\u0095¹Ã$Xû\u0087H1±\u0014\u0013ÇªÉ\u0095\u0006\u0011ÁYÞÅö 1Å½u\u0090ÿU\u0087\u0098q\u0087wbïeúTÆp\r\u0011|®æ\u0095Vó^>Ùõs \u0087\u0096ÑÓÆd°¢#Àuò\u008ad%\u001bYþR;iY¶\u0017\u0089q\u0084´ÌeV§\u0090/\u000f Æe,9åk\u001f¡Ôbôû\u0004?£Ã\u0080¯\u009a\u001b×c\u001fNZAR,\u0081\u0080)í\u0097\u0096Ä´§:(5ÖÚRuÍu$ë\u009a4æ×\u001bÄ\t¨ö\u0082H@ß\u0084j6IIf½âµòéÞÂ÷¨÷Ý=þD³q\u0096\u008f\u0092\u001d§\u0086\u0083+Ö)Ìz5x`!Ú\u001b\u0019÷¥,\u001bSW-\u0093Ùb²\u008e\u008a\u00076Iò\u00009S\u008cðÔ\f\u0094\u009d»J·¦\u001d\t\u0091*\u0017dNS((åÓ¤GzÊ¢1ÜÂñIµâÊ#ÑV?á\u0097#÷¤øÁeZ!³òR\u0083¥\u009c\u0092\u001d<F³\u0010 0î,\u0012\u0086£Ál¾¡·îÁ\tÍ \u0081vf\u0018\u0093\u000el\u0003Û\u0099ê÷u¦ò\f\u0004xY«f\u0097\u0011\u0092\u001eOÐÅ. :8\u0010J\u0084\u0082ù\u00adø{»r¿=ªÃ\u0082\u008dÁ"
.length();
char var19 = 16;
int var31 = -1;

label64:
while (true) {
String var32 = var20.substring(++var31, var31 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var32.getBytes("ISO-8859-1"));
String var45 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var45;
if ((var31 += var19) >= var22) {
g = var23;
h = new String[14];
m = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[16];
int var8 = 0;
String var9 = "i=«\u0096¬D¥5-Äfã\u0018\u0084\u0091Jd\u001b\r1Q½\u008cM\u0090y\u008dù^|;Þ_ï\u0000TÚ8V\u0090+ýc\u008dô9)8\u009a\u0092Ã\u0007Ä_\u009d\u0086h\u0002Z\u0080ºó\u001b®Í=gB^»©ö\u009f¬Y÷g \u0019M\u0089^\u0085\u007fì¯\u008c\u0005Õ²\u0089É ¾c\u0096Õ\u0004fê\u0017 o{\u000b\u0083GzÜ\\]#";
int var10 = "i=«\u0096¬D¥5-Äfã\u0018\u0084\u0091Jd\u001b\r1Q½\u008cM\u0090y\u008dù^|;Þ_ï\u0000TÚ8V\u0090+ýc\u008dô9)8\u009a\u0092Ã\u0007Ä_\u009d\u0086h\u0002Z\u0080ºó\u001b®Í=gB^»©ö\u009f¬Y÷g \u0019M\u0089^\u0085\u007fì¯\u008c\u0005Õ²\u0089É ¾c\u0096Õ\u0004fê\u0017 o{\u000b\u0083GzÜ\\]#"
.length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var35 = var11;
var10001 = var8++;
long var49 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var54 = -1;

while (true) {
long var13 = var49;
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
long var57 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var54) {
case 0:
var35[var10001] = var57;
if (var7 >= var10) {
k = var11;
l = new Integer[16];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 566671588463674924L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var52 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var43 = -1;
n = var52;
b = new ps(var27);
return;
}
break;
default:
var35[var10001] = var57;
if (var7 < var10) {
continue label46;
}

var9 = "[5QÚäX\u0098d3È\u009dÝ\u0016\u00ad©\u009f";
var10 = "[5QÚäX\u0098d3È\u009dÝ\u0016\u00ad©\u009f".length();
var7 = 0;
}

byte var42 = var7;
var7 += 8;
var12 = var9.substring(var42, var7).getBytes("ISO-8859-1");
var35 = var11;
var10001 = var8++;
var49 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var54 = 0;
}
}
}

var19 = var20.charAt(var31);
break;
default:
var23[var21++] = var45;
if ((var31 += var19) < var22) {
var19 = var20.charAt(var31);
continue label64;
}

var20 = "\u0081\u0001¢K\u000b\u0002$iáJÏêÛ´sc5²\u0083}üø\u008b\u008fç¯\rÊû·ëK±L±'ý§7\u000f0O£Rxÿ\\ô*\u0003$\u0095ê\u0081É\u001c|TØx\u008f·Ó+÷ò?8\u000fcÀx\u007fEAËU4\u0005¤áÌ )\u0014´µA?";
var22 = "\u0081\u0001¢K\u000b\u0002$iáJÏêÛ´sc5²\u0083}üø\u008b\u008fç¯\rÊû·ëK±L±'ý§7\u000f0O£Rxÿ\\ô*\u0003$\u0095ê\u0081É\u001c|TØx\u008f·Ó+÷ò?8\u000fcÀx\u007fEAËU4\u0005¤áÌ )\u0014´µA?"
.length();
var19 = '(';
var31 = -1;
}

var32 = var20.substring(++var31, var31 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15050;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ps", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = g[var5].getBytes("ISO-8859-1");
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/ps" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21456;
if (l[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = k[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])m.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ps", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
l[var3] = var15;
}

return l[var3];
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
throw new RuntimeException("su/catlean/ps" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
