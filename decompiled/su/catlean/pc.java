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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;

public final class pc extends gf {
@NotNull
public static final pc m;
private static final long a = yz.a(-247199576849033109L, 1780895264669328685L, MethodHandles.lookup().lookupClass()).a(9484570757181L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private pc(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 37655777733509L;
int var3 = (int)((var1 ^ 37655777733509L) >>> 48);
int var4 = (int)((var1 ^ 37655777733509L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"z">(17616, 6702328070289348114L ^ var1), (char)var5);
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
// 009: ldc2_w 42099833797024
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 21040909390270
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 129362142031597
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 39732485283849
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 90317468167310
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 109580710346244
// 02f: lxor
// 030: lstore 16
// 032: dup2
// 033: ldc2_w 104104530525409
// 036: lxor
// 037: dup2
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 18
// 03e: dup2
// 03f: bipush 16
// 041: lshl
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 19
// 048: dup2
// 049: bipush 48
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 20
// 052: pop2
// 053: dup2
// 054: ldc2_w 16349136930672
// 057: lxor
// 058: lstore 21
// 05a: dup2
// 05b: ldc2_w 128377113661390
// 05e: lxor
// 05f: lstore 23
// 061: dup2
// 062: ldc2_w 20173347401993
// 065: lxor
// 066: lstore 25
// 068: dup2
// 069: ldc2_w 99949442920536
// 06c: lxor
// 06d: lstore 27
// 06f: dup2
// 070: ldc2_w 30591967126976
// 073: lxor
// 074: lstore 29
// 076: pop2
// 077: ldc2_w -5990947769900206742
// 07a: lload 1
// 07b: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: aload 3
// 081: sipush 28568
// 084: ldc2_w 4235153276059513148
// 087: lload 1
// 088: lxor
// 089: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 091: istore 31
// 093: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 096: invokestatic su/catlean/CatLeanKt.y ()Lnet/fabricmc/loader/api/ModContainer;
// 099: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata ()Lnet/fabricmc/loader/api/metadata/ModMetadata; 1
// 09e: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getVersion ()Lnet/fabricmc/loader/api/Version; 1
// 0a3: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Lnet/fabricmc/loader/api/Version;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ " \u0001v\u0001" ]
// 0a8: astore 32
// 0aa: lload 16
// 0ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0af: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 0b2: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 0b5: astore 33
// 0b7: iload 31
// 0b9: ifne 0f7
// 0bc: lload 6
// 0be: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 0c1: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 0c4: dup
// 0c5: ifnull 0e9
// 0c8: goto 0d5
// 0cb: ldc2_w -6033769159946869164
// 0ce: lload 1
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 0d8: dup
// 0d9: ifnonnull 104
// 0dc: goto 0e9
// 0df: ldc2_w -6033769159946869164
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: pop
// 0ea: goto 0f7
// 0ed: ldc2_w -6033769159946869164
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: sipush 28302
// 0fa: ldc2_w 7412757296344723493
// 0fd: lload 1
// 0fe: lxor
// 0ff: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: astore 34
// 106: lload 27
// 108: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 10b: aload 32
// 10d: sipush 5288
// 110: ldc2_w 5131142527162780161
// 113: lload 1
// 114: lxor
// 115: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: swap
// 11b: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 120: lload 25
// 122: dup2_x1
// 123: pop2
// 124: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 127: fstore 35
// 129: lload 27
// 12b: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 12e: aload 33
// 130: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 133: lload 25
// 135: aload 33
// 137: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 13a: fstore 36
// 13c: lload 27
// 13e: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 141: lload 25
// 143: aload 34
// 145: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 148: fstore 37
// 14a: aload 0
// 14b: lload 29
// 14d: invokevirtual su/catlean/pc.p (J)F
// 150: fstore 38
// 152: aload 0
// 153: checkcast su/catlean/gf
// 156: aload 3
// 157: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 15a: dup
// 15b: sipush 20477
// 15e: ldc2_w 153449062888755551
// 161: lload 1
// 162: lxor
// 163: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16b: fload 38
// 16d: ldc 30.0
// 16f: fadd
// 170: aload 0
// 171: lload 4
// 173: invokevirtual su/catlean/pc.V (J)F
// 176: iload 18
// 178: i2s
// 179: swap
// 17a: iload 19
// 17c: swap
// 17d: fload 35
// 17f: ldc 10.0
// 181: fadd
// 182: ldc 13.0
// 184: iload 20
// 186: i2s
// 187: fconst_0
// 188: bipush 0
// 189: sipush 11299
// 18c: ldc2_w 7152968395860539413
// 18f: lload 1
// 190: lxor
// 191: invokedynamic g (IJ)I bsm=su/catlean/pc.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: aconst_null
// 197: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 19a: aload 0
// 19b: checkcast su/catlean/gf
// 19e: aload 3
// 19f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1a2: dup
// 1a3: sipush 20477
// 1a6: ldc2_w 153449062888755551
// 1a9: lload 1
// 1aa: lxor
// 1ab: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b3: fload 38
// 1b5: ldc 30.0
// 1b7: fadd
// 1b8: aload 0
// 1b9: lload 4
// 1bb: invokevirtual su/catlean/pc.V (J)F
// 1be: ldc 14.0
// 1c0: fadd
// 1c1: iload 18
// 1c3: i2s
// 1c4: swap
// 1c5: iload 19
// 1c7: swap
// 1c8: fload 36
// 1ca: ldc 6.0
// 1cc: fadd
// 1cd: ldc 13.0
// 1cf: iload 20
// 1d1: i2s
// 1d2: fconst_0
// 1d3: bipush 0
// 1d4: sipush 10741
// 1d7: ldc2_w 1403811443329793473
// 1da: lload 1
// 1db: lxor
// 1dc: invokedynamic g (IJ)I bsm=su/catlean/pc.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: aconst_null
// 1e2: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 1e5: aload 0
// 1e6: checkcast su/catlean/gf
// 1e9: aload 3
// 1ea: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1ed: dup
// 1ee: sipush 20477
// 1f1: ldc2_w 153449062888755551
// 1f4: lload 1
// 1f5: lxor
// 1f6: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1fe: fload 38
// 200: ldc 31.0
// 202: fadd
// 203: fload 36
// 205: fadd
// 206: ldc 6.0
// 208: fadd
// 209: aload 0
// 20a: lload 4
// 20c: invokevirtual su/catlean/pc.V (J)F
// 20f: ldc 14.0
// 211: fadd
// 212: iload 18
// 214: i2s
// 215: swap
// 216: iload 19
// 218: swap
// 219: fload 37
// 21b: ldc 7.0
// 21d: fadd
// 21e: ldc 13.0
// 220: iload 20
// 222: i2s
// 223: fconst_0
// 224: bipush 0
// 225: sipush 10741
// 228: ldc2_w 1403811443329793473
// 22b: lload 1
// 22c: lxor
// 22d: invokedynamic g (IJ)I bsm=su/catlean/pc.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: aconst_null
// 233: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 236: aload 0
// 237: aload 3
// 238: aload 32
// 23a: fload 38
// 23c: ldc 33.0
// 23e: fadd
// 23f: lload 21
// 241: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 244: lload 25
// 246: sipush 2945
// 249: ldc2_w 6731631568676459817
// 24c: lload 1
// 24d: lxor
// 24e: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 256: fadd
// 257: aload 0
// 258: lload 4
// 25a: invokevirtual su/catlean/pc.V (J)F
// 25d: fconst_1
// 25e: fadd
// 25f: lload 23
// 261: dup2_x1
// 262: pop2
// 263: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 266: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 269: invokevirtual su/catlean/pc.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 26c: aload 0
// 26d: aload 3
// 26e: aload 33
// 270: fload 38
// 272: ldc 33.0
// 274: fadd
// 275: aload 0
// 276: lload 4
// 278: invokevirtual su/catlean/pc.V (J)F
// 27b: ldc 15.0
// 27d: fadd
// 27e: lload 23
// 280: dup2_x1
// 281: pop2
// 282: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 285: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 288: invokevirtual su/catlean/pc.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 28b: lload 1
// 28c: lconst_0
// 28d: lcmp
// 28e: iflt 2b8
// 291: aload 0
// 292: aload 3
// 293: iload 31
// 295: ifne 351
// 298: aload 34
// 29a: fload 38
// 29c: ldc 40.5
// 29e: fadd
// 29f: fload 36
// 2a1: fadd
// 2a2: aload 0
// 2a3: lload 4
// 2a5: invokevirtual su/catlean/pc.V (J)F
// 2a8: ldc 15.0
// 2aa: fadd
// 2ab: lload 23
// 2ad: dup2_x1
// 2ae: pop2
// 2af: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2b2: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2b5: invokevirtual su/catlean/pc.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 2b8: getstatic su/catlean/os.D Lsu/catlean/os;
// 2bb: invokevirtual su/catlean/os.Q ()Lsu/catlean/f0;
// 2be: getstatic su/catlean/os.D Lsu/catlean/os;
// 2c1: invokevirtual su/catlean/os.G ()Lsu/catlean/f0;
// 2c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2c7: ifne 342
// 2ca: goto 2d7
// 2cd: ldc2_w -6033769159946869164
// 2d0: lload 1
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: fload 38
// 2d9: fconst_1
// 2da: fadd
// 2db: aload 0
// 2dc: lload 4
// 2de: invokevirtual su/catlean/pc.V (J)F
// 2e1: fconst_1
// 2e2: fsub
// 2e3: ldc 27.0
// 2e5: ldc 27.0
// 2e7: ldc 3.0
// 2e9: fconst_2
// 2ea: fconst_0
// 2eb: fconst_1
// 2ec: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2ef: dup
// 2f0: sipush 10282
// 2f3: ldc2_w 7831612248797197961
// 2f6: lload 1
// 2f7: lxor
// 2f8: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/pc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 300: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 303: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 306: aload 3
// 307: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 30a: getstatic su/catlean/wz.K Lsu/catlean/wz;
// 30d: getstatic su/catlean/os.D Lsu/catlean/os;
// 310: invokevirtual su/catlean/os.Q ()Lsu/catlean/f0;
// 313: lload 12
// 315: bipush 0
// 316: bipush 1
// 317: bipush 1
// 318: aconst_null
// 319: invokestatic su/catlean/f0.Q (Lsu/catlean/f0;JIZILjava/lang/Object;)Ljava/lang/String;
// 31c: lload 10
// 31e: dup2_x1
// 31f: pop2
// 320: invokevirtual su/catlean/wz.F (JLjava/lang/String;)Lnet/minecraft/class_2960;
// 323: lload 14
// 325: dup2_x1
// 326: pop2
// 327: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 32a: lload 1
// 32b: lconst_0
// 32c: lcmp
// 32d: iflt 363
// 330: iload 31
// 332: ifeq 358
// 335: goto 342
// 338: ldc2_w -6033769159946869164
// 33b: lload 1
// 33c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: athrow
// 342: aload 0
// 343: aload 3
// 344: goto 351
// 347: ldc2_w -6033769159946869164
// 34a: lload 1
// 34b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: athrow
// 351: fload 38
// 353: lload 8
// 355: invokespecial su/catlean/pc.P (Lnet/minecraft/class_332;FJ)V
// 358: aload 0
// 359: fload 35
// 35b: ldc 40.0
// 35d: fadd
// 35e: ldc 28.0
// 360: invokevirtual su/catlean/pc.X (FF)V
// 363: ldc2_w -6036285412282092885
// 366: lload 1
// 367: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: ifnull 399
// 36f: iload 31
// 371: ifeq 38f
// 374: goto 381
// 377: ldc2_w -6033769159946869164
// 37a: lload 1
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: bipush 0
// 382: goto 390
// 385: ldc2_w -6033769159946869164
// 388: lload 1
// 389: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: athrow
// 38f: bipush 1
// 390: ldc2_w -5993467118750132150
// 393: lload 1
// 394: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: return
}

@Override
public void H(@NotNull class_332 context, long a) {
long var4 = ax ^ 118901760466898L;
long var6 = ax ^ 84319185194541L;
long var8 = ax ^ 127062392772158L;
long var10 = ax ^ 98664999447709L;
Intrinsics.checkNotNullParameter(context, b<"z">(5060, 322064073410053173L ^ ax));
b8.t(var6).A(context, b<"z">(19474, 222958622367308783L ^ ax), var8, this.p(var10) + 33.0F, this.V(var4) + 0.5F, d<"g">(4185, 7680753218634665265L ^ ax));
}

private final void P(class_332 var1, float var2, long var3) {
var3 = a ^ var3;
long var5 = var3 ^ 66412303464127L;
long var10001 = var3 ^ 63390873886211L;
int var7 = (int)((var3 ^ 63390873886211L) >>> 32);
int var8 = (int)((var3 ^ 63390873886211L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
long var10 = var3 ^ 124803508395572L;
var1.method_51448().pushMatrix();
jl var10000 = jl.y;
Matrix3x2fStack var14 = var1.method_51448();
Intrinsics.checkNotNullExpressionValue(var14, b<"z">(25961, 4751133479447845878L ^ var3));
Matrix3x2f var15 = (Matrix3x2f)var14;
class_746 var10002 = zf.v(var10);
Intrinsics.checkNotNull(var10002, b<"z">(25051, 7695038686074003270L ^ var3));
class_2960 var18 = ((class_742)var10002).method_52814().comp_1626().comp_3627();
Intrinsics.checkNotNullExpressionValue(var18, b<"z">(27559, 2283515080168854841L ^ var3));
float var10003 = var2 + 3.0F;
float var10004 = this.V(var5) + 1.0F;
Color var10007 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"z">(18946, 1218259470757459092L ^ var3));
jl.W(
var10000,
var15,
var18,
var10003,
var10004,
24.0F,
24.0F,
var10007,
null,
var7,
null,
null,
0.125F,
(char)var8,
0.125F,
0.25F,
(short)var9,
0.25F,
false,
d<"g">(21882, 968498601775964541L ^ var3),
null
);
var10000 = jl.y;
Matrix3x2fStack var16 = var1.method_51448();
Intrinsics.checkNotNullExpressionValue(var16, b<"z">(20477, 153468972921090415L ^ var3));
Matrix3x2f var17 = (Matrix3x2f)var16;
var10002 = zf.v(var10);
Intrinsics.checkNotNull(var10002, b<"z">(14675, 5098172346962872265L ^ var3));
class_2960 var20 = ((class_742)var10002).method_52814().comp_1626().comp_3627();
Intrinsics.checkNotNullExpressionValue(var20, b<"z">(18997, 925592867840062628L ^ var3));
var10003 = var2 + 1.0F;
var10004 = this.V(var5) - 1.0F;
var10007 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"z">(10282, 7831596968840206009L ^ var3));
jl.W(
var10000,
var17,
var20,
var10003,
var10004,
28.0F,
28.0F,
var10007,
null,
var7,
null,
null,
0.625F,
(char)var8,
0.125F,
0.75F,
(short)var9,
0.25F,
false,
d<"g">(5803, 2861018402086150826L ^ var3),
null
);
var1.method_51448().popMatrix();
}

static {
long var20 = a ^ 46744505311324L;
long var22 = var20 ^ 90243623698770L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[15];
int var16 = 0;
String var15 = "Ü¬5ø\"£OÖÆ\u0080\u0010Ü¸ÖÅ¤§P\u0015b*\"íÕç\u0092ö0O\u008fl6÷ctù\u0087\u0010í>ÊÅ5gÉ:Oh\u009c óÓÃ?0D©\u0014Â\u0010\u0015%N\u001dÇZ\u0092bucðxb\u008c\u001d\u008eü\u0089\u008cDa\u0093+Ö¨á<\u008eÞèB\u008a¾Ø¼\u0099û´y\u0099\u0098\u00167wû\u0095Ïä\u009f-Ì0¤ÊÝx¡¦?Âñwöðc\u0093;\u008f6Ê^ÈC)×áÉòàª\u0096\u0010ÿÌ íÄ¼\u001dä.\u0081\u008fzÒ\u0082\u001b°|©æ\u0090L=-ãy\u009bwËs»eYmë\u001d\u0010ïÙÌ]Ø\u008f\u0012\u0096²\u009c¿Á¶\u007fA\u0094 £á¨j\u000f\u0096¸Úòû\u008e5ãÊY\u0005á´L×¯é\bWê$¶\u0005J\u0007Q,(MÔñý\u009dk¹\"TüÐb\u0002jó²VÛà4»KKøÑAX\t\u000f \u0091MIVÖbÕ\u0097V1 e\u008düwA\\¿¤\u0097=TZóæñ\u0095¶ý~{\u000eGË\"Æ¤\u0095å+\u0015£>\u0010©t>stØ\u0089¢$!\u0002\u0017þA\u0014m\u0080\u001ch\u0086òwÆ¿4_à6\u0081¥Ða/\u0094g$\u0017Aw.P'\u000eß \u001ar\u009aÕª;»\u001cþ\u009fEÝ©\u0000\u0090ù\u0017½ÁÌ[D\u001e\u0005\u0006\u0019\u0094ö ²zþí^ßðiÊ\u008anø'óÝé\u009d\u0098\u0097Ô§EÂ\u0089)2¦H!Ï¨7$\u000f\u001e,0E»\u0085cý´ï\u0085·îCI\u0081uä-\u0019/Ú6±\u0017ú#\u001e\u008ds&\u001dKè\nþ9\u0018Ú\u009a+tou\u0091:º\u009bÖ{©³´µ&Ì\u0099æc\u0015U%\u0010»:-\u009f®ê«´Ý55\u001e#\u0004À[\u0010?$\u001a¨yªàpRÄ°¥Á\r0#(\u000b\u0080Û?öH¿¦õ\u000fò\u0083ª¤ÏýÉ\ri'\u000bì£p8+aoB:Û×\u0099Ë\u009b\u0097Ø5\u001fk\u0010êeêE\u0017\u008dàv{é!_\u0090v\u00866";
int var17 = "Ü¬5ø\"£OÖÆ\u0080\u0010Ü¸ÖÅ¤§P\u0015b*\"íÕç\u0092ö0O\u008fl6÷ctù\u0087\u0010í>ÊÅ5gÉ:Oh\u009c óÓÃ?0D©\u0014Â\u0010\u0015%N\u001dÇZ\u0092bucðxb\u008c\u001d\u008eü\u0089\u008cDa\u0093+Ö¨á<\u008eÞèB\u008a¾Ø¼\u0099û´y\u0099\u0098\u00167wû\u0095Ïä\u009f-Ì0¤ÊÝx¡¦?Âñwöðc\u0093;\u008f6Ê^ÈC)×áÉòàª\u0096\u0010ÿÌ íÄ¼\u001dä.\u0081\u008fzÒ\u0082\u001b°|©æ\u0090L=-ãy\u009bwËs»eYmë\u001d\u0010ïÙÌ]Ø\u008f\u0012\u0096²\u009c¿Á¶\u007fA\u0094 £á¨j\u000f\u0096¸Úòû\u008e5ãÊY\u0005á´L×¯é\bWê$¶\u0005J\u0007Q,(MÔñý\u009dk¹\"TüÐb\u0002jó²VÛà4»KKøÑAX\t\u000f \u0091MIVÖbÕ\u0097V1 e\u008düwA\\¿¤\u0097=TZóæñ\u0095¶ý~{\u000eGË\"Æ¤\u0095å+\u0015£>\u0010©t>stØ\u0089¢$!\u0002\u0017þA\u0014m\u0080\u001ch\u0086òwÆ¿4_à6\u0081¥Ða/\u0094g$\u0017Aw.P'\u000eß \u001ar\u009aÕª;»\u001cþ\u009fEÝ©\u0000\u0090ù\u0017½ÁÌ[D\u001e\u0005\u0006\u0019\u0094ö ²zþí^ßðiÊ\u008anø'óÝé\u009d\u0098\u0097Ô§EÂ\u0089)2¦H!Ï¨7$\u000f\u001e,0E»\u0085cý´ï\u0085·îCI\u0081uä-\u0019/Ú6±\u0017ú#\u001e\u008ds&\u001dKè\nþ9\u0018Ú\u009a+tou\u0091:º\u009bÖ{©³´µ&Ì\u0099æc\u0015U%\u0010»:-\u009f®ê«´Ý55\u001e#\u0004À[\u0010?$\u001a¨yªàpRÄ°¥Á\r0#(\u000b\u0080Û?öH¿¦õ\u000fò\u0083ª¤ÏýÉ\ri'\u000bì£p8+aoB:Û×\u0099Ë\u009b\u0097Ø5\u001fk\u0010êeêE\u0017\u008dàv{é!_\u0090v\u00866"
.length();
char var14 = 144;
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[15];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "»\u0094ü-¯E\"\u008at¿Ö£>~iáØ\u000f\u000bq2Qá6";
int var5 = "»\u0094ü-¯E\"\u008at¿Ö£>~iáØ\u000f\u000bq2Qá6".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
g = var6;
h = new Integer[5];
m = new pc(var22);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "jVÍ\u0098nwÈôG^\u0005\u0094ößØ&";
var5 = "jVÍ\u0098nwÈôG^\u0005\u0094ößØ&".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "df'B\"\u008bmHû\u009cµÝ\u0002÷ªà¦P\u001aÛÈÈù²¿âÑ×¶Ö@S\u0082M|UPd{e\u0010\u0016\"+\t¹\u008b\u0085=\u009d\nXR\u0082nS\u001a";
var17 = "df'B\"\u008bmHû\u009cµÝ\u0002÷ªà¦P\u001aÛÈÈù²¿âÑ×¶Ö@S\u0082M|UPd{e\u0010\u0016\"+\t¹\u008b\u0085=\u009d\nXR\u0082nS\u001a".length();
var14 = '(';
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13249;
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
throw new RuntimeException("su/catlean/pc", var10);
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
throw new RuntimeException("su/catlean/pc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31070;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/pc", var14);
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
throw new RuntimeException("su/catlean/pc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
