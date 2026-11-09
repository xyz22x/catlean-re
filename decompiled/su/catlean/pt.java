package su.catlean;

import dev.redstones.mediaplayerinfo.MediaInfo;
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
import kotlin.Unit;
import net.minecraft.class_241;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pt extends gf {
@NotNull
public static final pt S;
@Nullable
private static MediaInfo B;
@NotNull
private static class_2960 K;
@NotNull
private static class_241 x;
private static boolean Y;
@NotNull
private static String U;
@NotNull
private static final fd O;
@NotNull
private static final fd m;
private static boolean J;
private static int b;
@NotNull
private static bg l;
private static final long a = yz.a(4221061954764069181L, 7317170931695041761L, MethodHandles.lookup().lookupClass()).a(195108369576288L);
private static final String[] c;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private pt(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 31361116568018L;
int var3 = (int)((var1 ^ 31361116568018L) >>> 48);
int var4 = (int)((var1 ^ 31361116568018L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"a">(20466, 4621259509737361126L ^ var1), (char)var5);
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
// 002: ldc2_w 73719739740194
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 137466198657546
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 50910300018319
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 81581919584095
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 32333673308231
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 32496943983440
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 99541060701969
// 02f: lxor
// 030: dup2
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 16
// 037: dup2
// 038: bipush 16
// 03a: lshl
// 03b: bipush 32
// 03d: lushr
// 03e: l2i
// 03f: istore 17
// 041: dup2
// 042: bipush 48
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 18
// 04b: pop2
// 04c: dup2
// 04d: ldc2_w 90317468167310
// 050: lxor
// 051: lstore 19
// 053: dup2
// 054: ldc2_w 109580710346244
// 057: lxor
// 058: lstore 21
// 05a: dup2
// 05b: ldc2_w 104104530525409
// 05e: lxor
// 05f: dup2
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 23
// 066: dup2
// 067: bipush 16
// 069: lshl
// 06a: bipush 32
// 06c: lushr
// 06d: l2i
// 06e: istore 24
// 070: dup2
// 071: bipush 48
// 073: lshl
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 25
// 07a: pop2
// 07b: dup2
// 07c: ldc2_w 37430498539930
// 07f: lxor
// 080: lstore 26
// 082: dup2
// 083: ldc2_w 16349136930672
// 086: lxor
// 087: lstore 28
// 089: dup2
// 08a: ldc2_w 20173347401993
// 08d: lxor
// 08e: lstore 30
// 090: dup2
// 091: ldc2_w 20494741382199
// 094: lxor
// 095: lstore 32
// 097: dup2
// 098: ldc2_w 4180373105917
// 09b: lxor
// 09c: lstore 34
// 09e: dup2
// 09f: ldc2_w 116938881892165
// 0a2: lxor
// 0a3: lstore 36
// 0a5: dup2
// 0a6: ldc2_w 99253988284703
// 0a9: lxor
// 0aa: lstore 38
// 0ac: dup2
// 0ad: ldc2_w 30591967126976
// 0b0: lxor
// 0b1: lstore 40
// 0b3: pop2
// 0b4: ldc2_w -5990705277528627281
// 0b7: lload 1
// 0b8: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: aload 3
// 0be: sipush 3306
// 0c1: ldc2_w 3038062420116362184
// 0c4: lload 1
// 0c5: lxor
// 0c6: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ce: istore 42
// 0d0: getstatic su/catlean/pt.m Lsu/catlean/fd;
// 0d3: getstatic su/catlean/pt.J Z
// 0d6: iload 42
// 0d8: ifeq 103
// 0db: ifne 147
// 0de: goto 0eb
// 0e1: ldc2_w -6000096979265239199
// 0e4: lload 1
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: lload 4
// 0ed: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f0: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0f3: instanceof net/minecraft/class_408
// 0f6: goto 103
// 0f9: ldc2_w -6000096979265239199
// 0fc: lload 1
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: lload 1
// 104: lconst_0
// 105: lcmp
// 106: ifle 136
// 109: iload 42
// 10b: ifeq 136
// 10e: ifne 147
// 111: goto 11e
// 114: ldc2_w -6000096979265239199
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: lload 4
// 120: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 123: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 126: instanceof su/catlean/rl
// 129: goto 136
// 12c: ldc2_w -6000096979265239199
// 12f: lload 1
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: ifne 147
// 139: fconst_0
// 13a: goto 148
// 13d: ldc2_w -6000096979265239199
// 140: lload 1
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: fconst_1
// 148: lload 10
// 14a: dup2_x1
// 14b: pop2
// 14c: invokevirtual su/catlean/fd.B (JF)V
// 14f: aload 0
// 150: ldc 120.0
// 152: ldc 43.0
// 154: invokevirtual su/catlean/pt.X (FF)V
// 157: aload 3
// 158: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 15b: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 15e: pop
// 15f: aload 3
// 160: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 163: aload 0
// 164: lload 40
// 166: invokevirtual su/catlean/pt.p (J)F
// 169: ldc 60.0
// 16b: fadd
// 16c: aload 0
// 16d: lload 8
// 16f: invokevirtual su/catlean/pt.V (J)F
// 172: ldc 21.5
// 174: fadd
// 175: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 178: pop
// 179: aload 3
// 17a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 17d: getstatic su/catlean/pt.m Lsu/catlean/fd;
// 180: invokevirtual su/catlean/fd.a ()F
// 183: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 186: checkcast java/lang/Comparable
// 189: fconst_0
// 18a: fconst_2
// 18b: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 18e: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 191: checkcast java/lang/Number
// 194: invokevirtual java/lang/Number.floatValue ()F
// 197: getstatic su/catlean/pt.m Lsu/catlean/fd;
// 19a: invokevirtual su/catlean/fd.a ()F
// 19d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 1a0: checkcast java/lang/Comparable
// 1a3: fconst_0
// 1a4: fconst_2
// 1a5: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 1a8: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 1ab: checkcast java/lang/Number
// 1ae: invokevirtual java/lang/Number.floatValue ()F
// 1b1: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 1b4: pop
// 1b5: aload 3
// 1b6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1b9: aload 0
// 1ba: lload 40
// 1bc: invokevirtual su/catlean/pt.p (J)F
// 1bf: ldc 60.0
// 1c1: fadd
// 1c2: fneg
// 1c3: aload 0
// 1c4: lload 8
// 1c6: invokevirtual su/catlean/pt.V (J)F
// 1c9: ldc 21.5
// 1cb: fadd
// 1cc: fneg
// 1cd: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 1d0: pop
// 1d1: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 1d4: iload 42
// 1d6: lload 1
// 1d7: lconst_0
// 1d8: lcmp
// 1d9: iflt 2bc
// 1dc: ifeq 2ba
// 1df: ifnonnull 2b7
// 1e2: goto 1ef
// 1e5: ldc2_w -6000096979265239199
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: lload 4
// 1f1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1f4: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1f7: instanceof su/catlean/rl
// 1fa: lload 1
// 1fb: lconst_0
// 1fc: lcmp
// 1fd: ifle 23a
// 200: iload 42
// 202: ifeq 23a
// 205: goto 212
// 208: ldc2_w -6000096979265239199
// 20b: lload 1
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: ifne 23d
// 215: goto 222
// 218: ldc2_w -6000096979265239199
// 21b: lload 1
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: lload 4
// 224: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 227: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 22a: instanceof net/minecraft/class_408
// 22d: goto 23a
// 230: ldc2_w -6000096979265239199
// 233: lload 1
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: ifeq 2b7
// 23d: aload 0
// 23e: checkcast su/catlean/gf
// 241: aload 3
// 242: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 245: dup
// 246: sipush 24179
// 249: ldc2_w 1614316642087960916
// 24c: lload 1
// 24d: lxor
// 24e: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 256: aload 0
// 257: lload 40
// 259: invokevirtual su/catlean/pt.p (J)F
// 25c: aload 0
// 25d: lload 8
// 25f: invokevirtual su/catlean/pt.V (J)F
// 262: iload 23
// 264: i2s
// 265: swap
// 266: iload 24
// 268: swap
// 269: ldc 120.0
// 26b: ldc 43.0
// 26d: iload 25
// 26f: i2s
// 270: fconst_0
// 271: bipush 0
// 272: sipush 19640
// 275: ldc2_w 4077591953889334632
// 278: lload 1
// 279: lxor
// 27a: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: aconst_null
// 280: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 283: lload 28
// 285: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 288: aload 3
// 289: aload 0
// 28a: invokevirtual su/catlean/pt.A ()Ljava/lang/String;
// 28d: aload 0
// 28e: lload 40
// 290: invokevirtual su/catlean/pt.p (J)F
// 293: ldc 60.0
// 295: fadd
// 296: aload 0
// 297: lload 8
// 299: invokevirtual su/catlean/pt.V (J)F
// 29c: ldc 21.0
// 29e: fadd
// 29f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2a2: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2a5: lload 34
// 2a7: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 2aa: goto 2b7
// 2ad: ldc2_w -6000096979265239199
// 2b0: lload 1
// 2b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b6: athrow
// 2b7: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 2ba: iload 42
// 2bc: ifeq 2e9
// 2bf: ifnonnull 2e2
// 2c2: goto 2cf
// 2c5: ldc2_w -6000096979265239199
// 2c8: lload 1
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: aload 3
// 2d0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2d3: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 2d6: pop
// 2d7: return
// 2d8: ldc2_w -6000096979265239199
// 2db: lload 1
// 2dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: athrow
// 2e2: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 2e5: dup
// 2e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2e9: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPosition ()J
// 2ec: l2f
// 2ed: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 2f0: dup
// 2f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2f4: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getDuration ()J
// 2f7: l2f
// 2f8: fdiv
// 2f9: fconst_0
// 2fa: fconst_1
// 2fb: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 2fe: fstore 43
// 300: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 303: dup
// 304: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 307: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPosition ()J
// 30a: lconst_1
// 30b: lcmp
// 30c: iload 42
// 30e: lload 1
// 30f: lconst_0
// 310: lcmp
// 311: ifle 34d
// 314: ifeq 34b
// 317: ifle 364
// 31a: goto 327
// 31d: ldc2_w -6000096979265239199
// 320: lload 1
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 32a: dup
// 32b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 32e: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getDuration ()J
// 331: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 334: dup
// 335: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 338: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPosition ()J
// 33b: lsub
// 33c: lconst_1
// 33d: lcmp
// 33e: goto 34b
// 341: ldc2_w -6000096979265239199
// 344: lload 1
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: iload 42
// 34d: ifeq 361
// 350: ifle 364
// 353: goto 360
// 356: ldc2_w -6000096979265239199
// 359: lload 1
// 35a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: athrow
// 360: bipush 1
// 361: goto 365
// 364: bipush 0
// 365: istore 44
// 367: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 36a: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 36d: dup
// 36e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 371: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPlaying ()Z
// 374: lload 1
// 375: lconst_0
// 376: lcmp
// 377: iflt 391
// 37a: iload 42
// 37c: ifeq 391
// 37f: ifeq 3a2
// 382: goto 38f
// 385: ldc2_w -6000096979265239199
// 388: lload 1
// 389: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: athrow
// 38f: iload 44
// 391: ifeq 3a2
// 394: fconst_1
// 395: goto 3a3
// 398: ldc2_w -6000096979265239199
// 39b: lload 1
// 39c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: athrow
// 3a2: fconst_0
// 3a3: lload 10
// 3a5: dup2_x1
// 3a6: pop2
// 3a7: invokevirtual su/catlean/fd.B (JF)V
// 3aa: aload 0
// 3ab: checkcast su/catlean/gf
// 3ae: aload 3
// 3af: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3b2: dup
// 3b3: sipush 31243
// 3b6: ldc2_w 2339530658490623275
// 3b9: lload 1
// 3ba: lxor
// 3bb: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3c3: aload 0
// 3c4: lload 40
// 3c6: invokevirtual su/catlean/pt.p (J)F
// 3c9: aload 0
// 3ca: lload 8
// 3cc: invokevirtual su/catlean/pt.V (J)F
// 3cf: iload 23
// 3d1: i2s
// 3d2: swap
// 3d3: iload 24
// 3d5: swap
// 3d6: ldc 120.0
// 3d8: ldc 43.0
// 3da: iload 25
// 3dc: i2s
// 3dd: fconst_0
// 3de: bipush 0
// 3df: sipush 24351
// 3e2: ldc2_w 6638488666518587080
// 3e5: lload 1
// 3e6: lxor
// 3e7: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ec: aconst_null
// 3ed: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 3f0: aload 0
// 3f1: lload 40
// 3f3: invokevirtual su/catlean/pt.p (J)F
// 3f6: ldc 4.0
// 3f8: fadd
// 3f9: aload 0
// 3fa: lload 8
// 3fc: invokevirtual su/catlean/pt.V (J)F
// 3ff: ldc 4.0
// 401: fadd
// 402: ldc 35.0
// 404: ldc 35.0
// 406: ldc 3.0
// 408: fconst_2
// 409: fconst_0
// 40a: iload 44
// 40c: ifne 422
// 40f: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 412: invokevirtual su/catlean/fd.a ()F
// 415: goto 430
// 418: ldc2_w -6000096979265239199
// 41b: lload 1
// 41c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 421: athrow
// 422: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 425: invokevirtual su/catlean/fd.a ()F
// 428: ldc 0.5
// 42a: fadd
// 42b: fconst_0
// 42c: fconst_1
// 42d: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 430: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 433: dup
// 434: sipush 24809
// 437: ldc2_w 5617533149258596301
// 43a: lload 1
// 43b: lxor
// 43c: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 444: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 447: dup
// 448: sipush 3392
// 44b: ldc2_w 1333549350722916965
// 44e: lload 1
// 44f: lxor
// 450: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 455: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 458: aload 3
// 459: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 45c: lload 19
// 45e: getstatic su/catlean/pt.K Lnet/minecraft/class_2960;
// 461: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 464: aload 0
// 465: lload 40
// 467: invokevirtual su/catlean/pt.p (J)F
// 46a: ldc 4.0
// 46c: lload 1
// 46d: lconst_0
// 46e: lcmp
// 46f: ifle 481
// 472: fadd
// 473: iload 42
// 475: ifeq 599
// 478: aload 0
// 479: lload 8
// 47b: invokevirtual su/catlean/pt.V (J)F
// 47e: ldc 4.0
// 480: fadd
// 481: ldc 35.0
// 483: ldc 35.0
// 485: ldc 3.0
// 487: fconst_2
// 488: fconst_0
// 489: fconst_1
// 48a: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 48d: dup
// 48e: sipush 3392
// 491: ldc2_w 1333549350722916965
// 494: lload 1
// 495: lxor
// 496: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 49e: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 4a1: dup
// 4a2: sipush 3392
// 4a5: ldc2_w 1333549350722916965
// 4a8: lload 1
// 4a9: lxor
// 4aa: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b2: aload 3
// 4b3: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4b6: lload 19
// 4b8: getstatic su/catlean/pt.K Lnet/minecraft/class_2960;
// 4bb: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 4be: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 4c1: dup
// 4c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4c5: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPlaying ()Z
// 4c8: ifne 583
// 4cb: goto 4d8
// 4ce: ldc2_w -6000096979265239199
// 4d1: lload 1
// 4d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d7: athrow
// 4d8: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 4db: invokevirtual su/catlean/fd.a ()F
// 4de: iload 42
// 4e0: ifeq 599
// 4e3: goto 4f0
// 4e6: ldc2_w -6000096979265239199
// 4e9: lload 1
// 4ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ef: athrow
// 4f0: fconst_1
// 4f1: fcmpg
// 4f2: ifge 583
// 4f5: goto 502
// 4f8: ldc2_w -6000096979265239199
// 4fb: lload 1
// 4fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 501: athrow
// 502: aload 0
// 503: aload 3
// 504: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 507: dup
// 508: sipush 31243
// 50b: ldc2_w 2339530658490623275
// 50e: lload 1
// 50f: lxor
// 510: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 515: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 518: aload 0
// 519: lload 40
// 51b: invokevirtual su/catlean/pt.p (J)F
// 51e: ldc 13.0
// 520: fadd
// 521: aload 0
// 522: lload 8
// 524: invokevirtual su/catlean/pt.V (J)F
// 527: ldc 10.0
// 529: fadd
// 52a: ldc 6.0
// 52c: lload 6
// 52e: ldc 22.0
// 530: fconst_1
// 531: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 534: invokevirtual su/catlean/fd.a ()F
// 537: fsub
// 538: bipush 0
// 539: invokevirtual su/catlean/pt.J (Lorg/joml/Matrix3x2fStack;FFFJFFZ)V
// 53c: aload 0
// 53d: aload 3
// 53e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 541: dup
// 542: sipush 31243
// 545: ldc2_w 2339530658490623275
// 548: lload 1
// 549: lxor
// 54a: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 552: aload 0
// 553: lload 40
// 555: invokevirtual su/catlean/pt.p (J)F
// 558: ldc 23.0
// 55a: fadd
// 55b: aload 0
// 55c: lload 8
// 55e: invokevirtual su/catlean/pt.V (J)F
// 561: ldc 10.0
// 563: fadd
// 564: ldc 6.0
// 566: lload 6
// 568: ldc 22.0
// 56a: fconst_1
// 56b: getstatic su/catlean/pt.O Lsu/catlean/fd;
// 56e: invokevirtual su/catlean/fd.a ()F
// 571: fsub
// 572: bipush 0
// 573: invokevirtual su/catlean/pt.J (Lorg/joml/Matrix3x2fStack;FFFJFFZ)V
// 576: goto 583
// 579: ldc2_w -6000096979265239199
// 57c: lload 1
// 57d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 582: athrow
// 583: lload 28
// 585: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 588: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 58b: dup
// 58c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 58f: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getTitle ()Ljava/lang/String;
// 592: lload 30
// 594: dup2_x1
// 595: pop2
// 596: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 599: fstore 45
// 59b: ldc 74.0
// 59d: fstore 46
// 59f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5a2: lload 21
// 5a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5a7: getfield net/minecraft/class_746.field_6012 I
// 5aa: i2f
// 5ab: fconst_1
// 5ac: fsub
// 5ad: lload 21
// 5af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5b2: getfield net/minecraft/class_746.field_6012 I
// 5b5: i2f
// 5b6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5b9: lload 32
// 5bb: invokevirtual su/catlean/jl.K (J)F
// 5be: invokevirtual su/catlean/jl.B (FFF)F
// 5c1: sipush 14643
// 5c4: ldc2_w 6333148456568938721
// 5c7: lload 1
// 5c8: lxor
// 5c9: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ce: i2f
// 5cf: frem
// 5d0: ldc 120.0
// 5d2: fdiv
// 5d3: fstore 47
// 5d5: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 5d8: dup
// 5d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5dc: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPosition ()J
// 5df: sipush 7212
// 5e2: ldc2_w 7969587275426874877
// 5e5: lload 1
// 5e6: lxor
// 5e7: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ec: i2l
// 5ed: lrem
// 5ee: invokestatic java/lang/String.valueOf (J)Ljava/lang/String;
// 5f1: astore 48
// 5f3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5f6: lload 36
// 5f8: aload 3
// 5f9: new su/catlean/o7
// 5fc: dup
// 5fd: aload 0
// 5fe: lload 40
// 600: invokevirtual su/catlean/pt.p (J)F
// 603: ldc 43.0
// 605: fadd
// 606: aload 0
// 607: lload 8
// 609: invokevirtual su/catlean/pt.V (J)F
// 60c: aload 0
// 60d: lload 40
// 60f: invokevirtual su/catlean/pt.p (J)F
// 612: ldc 116.0
// 614: fadd
// 615: aload 0
// 616: lload 8
// 618: invokevirtual su/catlean/pt.V (J)F
// 61b: ldc 30.0
// 61d: fadd
// 61e: invokespecial su/catlean/o7.<init> (FFFF)V
// 621: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 624: lload 28
// 626: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 629: aload 3
// 62a: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 62d: dup
// 62e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 631: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getTitle ()Ljava/lang/String;
// 634: fload 45
// 636: fload 46
// 638: fcmpl
// 639: ifle 653
// 63c: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 63f: dup
// 640: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 643: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getTitle ()Ljava/lang/String;
// 646: goto 655
// 649: ldc2_w -6000096979265239199
// 64c: lload 1
// 64d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 652: athrow
// 653: ldc ""
// 655: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 65a: aload 0
// 65b: lload 40
// 65d: invokevirtual su/catlean/pt.p (J)F
// 660: ldc 42.0
// 662: fadd
// 663: fload 45
// 665: lload 1
// 666: lconst_0
// 667: lcmp
// 668: ifle 695
// 66b: fload 46
// 66d: iload 42
// 66f: ifeq 694
// 672: fcmpl
// 673: ifle 698
// 676: goto 683
// 679: ldc2_w -6000096979265239199
// 67c: lload 1
// 67d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 682: athrow
// 683: fload 47
// 685: fload 45
// 687: goto 694
// 68a: ldc2_w -6000096979265239199
// 68d: lload 1
// 68e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 693: athrow
// 694: fmul
// 695: goto 699
// 698: fconst_0
// 699: fsub
// 69a: lload 12
// 69c: dup2_x1
// 69d: pop2
// 69e: aload 0
// 69f: lload 8
// 6a1: invokevirtual su/catlean/pt.V (J)F
// 6a4: ldc 3.0
// 6a6: fadd
// 6a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6aa: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 6ad: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 6b0: lload 14
// 6b2: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 6b5: aload 3
// 6b6: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 6b9: dup
// 6ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6bd: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getArtist ()Ljava/lang/String;
// 6c0: aload 0
// 6c1: lload 40
// 6c3: invokevirtual su/catlean/pt.p (J)F
// 6c6: ldc 42.0
// 6c8: fadd
// 6c9: lload 12
// 6cb: dup2_x1
// 6cc: pop2
// 6cd: aload 0
// 6ce: lload 8
// 6d0: invokevirtual su/catlean/pt.V (J)F
// 6d3: ldc 13.0
// 6d5: fadd
// 6d6: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6d9: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 6dc: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 6df: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6e2: lload 38
// 6e4: aload 3
// 6e5: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 6e8: lload 14
// 6ea: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 6ed: aload 3
// 6ee: getstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 6f1: dup
// 6f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6f5: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getPosition ()J
// 6f8: l2f
// 6f9: ldc 60.0
// 6fb: fdiv
// 6fc: f2i
// 6fd: aload 48
// 6ff: iload 42
// 701: ifeq 732
// 704: invokevirtual java/lang/String.length ()I
// 707: bipush 1
// 708: if_icmpne 735
// 70b: goto 718
// 70e: ldc2_w -6000096979265239199
// 711: lload 1
// 712: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 717: athrow
// 718: sipush 247
// 71b: ldc2_w 1904596814948949974
// 71e: lload 1
// 71f: lxor
// 720: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 725: goto 732
// 728: ldc2_w -6000096979265239199
// 72b: lload 1
// 72c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 731: athrow
// 732: goto 737
// 735: ldc ":"
// 737: aload 48
// 739: invokedynamic makeConcatWithConstants (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 73e: aload 0
// 73f: lload 40
// 741: invokevirtual su/catlean/pt.p (J)F
// 744: ldc 42.0
// 746: fadd
// 747: lload 12
// 749: dup2_x1
// 74a: pop2
// 74b: aload 0
// 74c: lload 8
// 74e: invokevirtual su/catlean/pt.V (J)F
// 751: ldc 29.0
// 753: fadd
// 754: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 757: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 75a: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 75d: lload 14
// 75f: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 762: lload 30
// 764: getstatic su/catlean/pt.U Ljava/lang/String;
// 767: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 76a: fstore 49
// 76c: lload 14
// 76e: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 771: aload 3
// 772: getstatic su/catlean/pt.U Ljava/lang/String;
// 775: aload 0
// 776: lload 40
// 778: invokevirtual su/catlean/pt.p (J)F
// 77b: ldc 116.0
// 77d: fadd
// 77e: fload 49
// 780: fsub
// 781: lload 12
// 783: dup2_x1
// 784: pop2
// 785: aload 0
// 786: lload 8
// 788: invokevirtual su/catlean/pt.V (J)F
// 78b: ldc 29.0
// 78d: fadd
// 78e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 791: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 794: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 797: aload 0
// 798: lload 40
// 79a: invokevirtual su/catlean/pt.p (J)F
// 79d: ldc 42.0
// 79f: fadd
// 7a0: aload 0
// 7a1: lload 8
// 7a3: invokevirtual su/catlean/pt.V (J)F
// 7a6: ldc 23.0
// 7a8: fadd
// 7a9: lload 26
// 7ab: ldc 74.0
// 7ad: ldc 4.0
// 7af: fconst_2
// 7b0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7b3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7b6: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 7b9: iload 16
// 7bb: i2c
// 7bc: iload 17
// 7be: ldc 0.7
// 7c0: iload 18
// 7c2: i2s
// 7c3: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 7c6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7c9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7cc: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 7cf: iload 16
// 7d1: i2c
// 7d2: iload 17
// 7d4: ldc 0.7
// 7d6: iload 18
// 7d8: i2s
// 7d9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 7dc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7df: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7e2: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 7e5: iload 16
// 7e7: i2c
// 7e8: iload 17
// 7ea: ldc 0.7
// 7ec: iload 18
// 7ee: i2s
// 7ef: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 7f2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7f5: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7f8: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 7fb: iload 16
// 7fd: i2c
// 7fe: iload 17
// 800: ldc 0.7
// 802: iload 18
// 804: i2s
// 805: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 808: aload 3
// 809: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 80c: dup
// 80d: sipush 31243
// 810: ldc2_w 2339530658490623275
// 813: lload 1
// 814: lxor
// 815: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 81d: fconst_2
// 81e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 821: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 824: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 827: aload 0
// 828: lload 40
// 82a: invokevirtual su/catlean/pt.p (J)F
// 82d: ldc 42.0
// 82f: fadd
// 830: aload 0
// 831: lload 8
// 833: invokevirtual su/catlean/pt.V (J)F
// 836: ldc 23.0
// 838: fadd
// 839: ldc 74.0
// 83b: fload 43
// 83d: fmul
// 83e: lload 26
// 840: dup2_x1
// 841: pop2
// 842: ldc 4.0
// 844: fconst_2
// 845: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 848: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 84b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 84e: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 851: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 854: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 857: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 85a: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 85d: aload 3
// 85e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 861: dup
// 862: sipush 31243
// 865: ldc2_w 2339530658490623275
// 868: lload 1
// 869: lxor
// 86a: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 872: fconst_1
// 873: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 876: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 879: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 87c: aload 0
// 87d: lload 40
// 87f: invokevirtual su/catlean/pt.p (J)F
// 882: bipush 2
// 883: i2f
// 884: fsub
// 885: ldc 70.0
// 887: fload 43
// 889: fmul
// 88a: fadd
// 88b: ldc 42.0
// 88d: fadd
// 88e: aload 0
// 88f: lload 8
// 891: invokevirtual su/catlean/pt.V (J)F
// 894: ldc 23.0
// 896: fadd
// 897: ldc 1.5
// 899: fsub
// 89a: lload 26
// 89c: ldc 7.0
// 89e: ldc 7.0
// 8a0: ldc 2.5
// 8a2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8a5: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 8a8: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8ab: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 8ae: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8b1: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 8b4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8b7: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 8ba: aload 3
// 8bb: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8be: dup
// 8bf: sipush 31243
// 8c2: ldc2_w 2339530658490623275
// 8c5: lload 1
// 8c6: lxor
// 8c7: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/pt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8cf: fconst_1
// 8d0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8d3: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 8d6: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 8d9: aload 3
// 8da: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8dd: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 8e0: pop
// 8e1: return
}

@Override
public void w(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 90548526182604
// 05: lxor
// 06: lstore 3
// 07: pop2
// 08: ldc2_w 6612305006036320882
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 5
// 13: getstatic su/catlean/pt.l Lsu/catlean/bg;
// 16: sipush 9746
// 19: ldc2_w 601067037929048284
// 1c: lload 1
// 1d: lxor
// 1e: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23: lload 3
// 24: invokevirtual su/catlean/bg.c (IJ)Z
// 27: iload 5
// 29: ifne 40
// 2c: ifne 3d
// 2f: goto 3c
// 32: ldc2_w 6603156071957180537
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: return
// 3d: getstatic su/catlean/pt.Y Z
// 40: iload 5
// 42: ifne 69
// 45: ifeq c3
// 48: goto 55
// 4b: ldc2_w 6603156071957180537
// 4e: lload 1
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: bipush 0
// 56: putstatic su/catlean/pt.Y Z
// 59: getstatic su/catlean/pt.b I
// 5c: goto 69
// 5f: ldc2_w 6603156071957180537
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: istore 6
// 6b: iload 6
// 6d: bipush 1
// 6e: iadd
// 6f: putstatic su/catlean/pt.b I
// 72: iload 6
// 74: sipush 17031
// 77: ldc2_w 3779385364190358604
// 7a: lload 1
// 7b: lxor
// 7c: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: iload 5
// 83: ifne a9
// 86: if_icmple a7
// 89: goto 96
// 8c: ldc2_w 6603156071957180537
// 8f: lload 1
// 90: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: athrow
// 96: bipush 0
// 97: putstatic su/catlean/pt.J Z
// 9a: goto a7
// 9d: ldc2_w 6603156071957180537
// a0: lload 1
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: bipush 0
// a8: bipush 0
// a9: aconst_null
// aa: aconst_null
// ab: bipush 0
// ac: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/pt.y ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// b1: sipush 3595
// b4: ldc2_w 602086399627534535
// b7: lload 1
// b8: lxor
// b9: invokedynamic u (IJ)I bsm=su/catlean/pt.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be: aconst_null
// bf: invokestatic kotlin/concurrent/ThreadsKt.thread$default (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
// c2: pop
// c3: return
}

private static final Unit y() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/pt.a J
// 003: ldc2_w 49435633287719
// 006: lxor
// 007: lstore 0
// 008: lload 0
// 009: dup2
// 00a: ldc2_w 45178821019204
// 00d: lxor
// 00e: lstore 2
// 00f: dup2
// 010: ldc2_w 77774339430054
// 013: lxor
// 014: lstore 4
// 016: pop2
// 017: getstatic dev/redstones/mediaplayerinfo/MediaPlayerInfo.Instance Ldev/redstones/mediaplayerinfo/MediaPlayerInfo$Instance;
// 01a: invokevirtual dev/redstones/mediaplayerinfo/MediaPlayerInfo$Instance.getMediaSessions ()Ljava/util/List;
// 01d: checkcast java/lang/Iterable
// 020: astore 7
// 022: bipush 0
// 023: istore 8
// 025: ldc2_w 5528063555781642180
// 028: lload 0
// 029: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: aload 7
// 030: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 035: astore 9
// 037: istore 6
// 039: aload 9
// 03b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 040: ifeq 0f6
// 043: aload 9
// 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 04a: astore 10
// 04c: aload 10
// 04e: checkcast dev/redstones/mediaplayerinfo/IMediaSession
// 051: astore 11
// 053: bipush 0
// 054: istore 12
// 056: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 059: pop
// 05a: aload 11
// 05c: invokeinterface dev/redstones/mediaplayerinfo/IMediaSession.getMedia ()Ldev/redstones/mediaplayerinfo/MediaInfo; 1
// 061: putstatic su/catlean/pt.B Ldev/redstones/mediaplayerinfo/MediaInfo;
// 064: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 067: pop
// 068: aload 11
// 06a: invokeinterface dev/redstones/mediaplayerinfo/IMediaSession.getOwner ()Ljava/lang/String; 1
// 06f: putstatic su/catlean/pt.U Ljava/lang/String;
// 072: iload 6
// 074: ifeq 105
// 077: iload 6
// 079: ifeq 0de
// 07c: goto 089
// 07f: ldc2_w 5534996921149335306
// 082: lload 0
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: aload 11
// 08b: invokeinterface dev/redstones/mediaplayerinfo/IMediaSession.getMedia ()Ldev/redstones/mediaplayerinfo/MediaInfo; 1
// 090: invokevirtual dev/redstones/mediaplayerinfo/MediaInfo.getArtwork ()Ljava/awt/image/BufferedImage;
// 093: dup
// 094: ifnull 0dd
// 097: goto 0a4
// 09a: ldc2_w 5534996921149335306
// 09d: lload 0
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: astore 13
// 0a6: bipush 0
// 0a7: istore 14
// 0a9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ac: getstatic su/catlean/pt.K Lnet/minecraft/class_2960;
// 0af: getstatic su/catlean/wz.K Lsu/catlean/wz;
// 0b2: aload 13
// 0b4: lload 2
// 0b5: invokevirtual su/catlean/wz.h (Ljava/awt/image/BufferedImage;J)Ljava/awt/image/BufferedImage;
// 0b8: lload 4
// 0ba: dup2_x1
// 0bb: pop2
// 0bc: invokevirtual su/catlean/jl.b (Lnet/minecraft/class_2960;JLjava/awt/image/BufferedImage;)V
// 0bf: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 0c2: pop
// 0c3: new net/minecraft/class_241
// 0c6: dup
// 0c7: aload 13
// 0c9: invokevirtual java/awt/image/BufferedImage.getWidth ()I
// 0cc: i2f
// 0cd: aload 13
// 0cf: invokevirtual java/awt/image/BufferedImage.getHeight ()I
// 0d2: i2f
// 0d3: invokespecial net/minecraft/class_241.<init> (FF)V
// 0d6: putstatic su/catlean/pt.x Lnet/minecraft/class_241;
// 0d9: nop
// 0da: goto 0df
// 0dd: pop
// 0de: nop
// 0df: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 0e2: pop
// 0e3: bipush 1
// 0e4: putstatic su/catlean/pt.J Z
// 0e7: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 0ea: pop
// 0eb: bipush 0
// 0ec: putstatic su/catlean/pt.b I
// 0ef: nop
// 0f0: nop
// 0f1: iload 6
// 0f3: ifne 039
// 0f6: nop
// 0f7: getstatic su/catlean/pt.S Lsu/catlean/pt;
// 0fa: pop
// 0fb: bipush 1
// 0fc: putstatic su/catlean/pt.Y Z
// 0ff: getstatic su/catlean/pt.l Lsu/catlean/bg;
// 102: invokevirtual su/catlean/bg.l ()V
// 105: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 108: areturn
}

static {
long var31 = a ^ 106170622852343L;
long var33 = var31 ^ 129336060923924L;
long var35 = var31 ^ 139933279770835L;
long var37 = var31 ^ 42492522500014L;
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[9];
int var27 = 0;
String var26 = "\u0089-Y\u0097kfzý2iüÃÔÜMP<~y<\u0099ËÀ\u0084\u0010:T,\u0004FH\u001f\u000f \u0012héÅ\u0018¦\u009e\u00102\u0002\u0093\u00adZYÐ\u0015ó]¿\u00926\u0013{Ð\u0018\u0098©\u008aÑ/\"N ÙÏ\u0093H\u001eÌ\u009dÉ\u009b\u0086vdàµ%\u008c\u0010¸ \u0090Â\\Ý`Ï¸¸^M}gð¾\u0010 ^¦`²\u0088!)\u0006\u008b\u0098ÕIzÊS(äÑ\u0090Ïª\u008a\u008e%4Î;\u0006 ½©ÔU\u0007Ôaù·*,òM\u0013\u0080Ítëòoæà\u009fú\u00061\b";
int var28 = "\u0089-Y\u0097kfzý2iüÃÔÜMP<~y<\u0099ËÀ\u0084\u0010:T,\u0004FH\u001f\u000f \u0012héÅ\u0018¦\u009e\u00102\u0002\u0093\u00adZYÐ\u0015ó]¿\u00926\u0013{Ð\u0018\u0098©\u008aÑ/\"N ÙÏ\u0093H\u001eÌ\u009dÉ\u009b\u0086vdàµ%\u008c\u0010¸ \u0090Â\\Ý`Ï¸¸^M}gð¾\u0010 ^¦`²\u0088!)\u0006\u008b\u0098ÕIzÊS(äÑ\u0090Ïª\u008a\u008e%4Î;\u0006 ½©ÔU\u0007Ôaù·*,òM\u0013\u0080Ítëòoæà\u009fú\u00061\b"
.length();
char var25 = 24;
int var41 = -1;

label74:
while (true) {
String var42 = var26.substring(++var41, var41 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var42.getBytes("ISO-8859-1"));
String var56 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var56;
if ((var41 += var25) >= var28) {
c = var29;
f = new String[9];
k = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[7];
int var14 = 0;
String var15 = "\u008dv%2d:\u0093ÀÙ\u0092à{pV3\u001b\u0003\u0086éá/ä\u0007\"Å\u0083Ñ\u0005Ñ#S`\u0087\u009a\rp 9#\u008f";
int var16 = "\u008dv%2d:\u0093ÀÙ\u0092à{pV3\u001b\u0003\u0086éá/ä\u0007\"Å\u0083Ñ\u0005Ñ#S`\u0087\u009a\rp 9#\u008f".length();
byte var13 = 0;

label56:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var45 = var17;
var10001 = var14++;
long var60 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var64 = -1;

while (true) {
long var19 = var60;
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
long var68 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var64) {
case 0:
var45[var10001] = var68;
if (var13 >= var16) {
h = var17;
i = new Integer[7];
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
String var5 = "%¯\u0089\u00adï¦J\u008f\u0086\u0001d`Ìánz";
int var6 = "%¯\u0089\u00adï¦J\u008f\u0086\u0001d`Ìánz".length();
byte var3 = 0;

do {
int var53 = var3;
var3 += 8;
byte[] var7 = var5.substring(var53, var3).getBytes("ISO-8859-1");
var53 = var4++;
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
var68 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var67 = -1;
var0[var53] = var68;
} while (var3 < var6);

S = new pt(var37);
K = l6.J(b<"a">(26887, 492290634343409812L ^ var31), b<"a">(5818, 6960902705473984290L ^ var31), var35);
x = new class_241(1.0F, 1.0F);
Y = true;
U = "";
O = new fd(_s.OUT_QUINT, var0[1], var33);
m = new fd(_s.OUT_BACK, var0[0], var33);
l = new bg();
return;
}
break;
default:
var45[var10001] = var68;
if (var13 < var16) {
continue label56;
}

var15 = "l\u001f¶¸\u0097\u0014D\f+0}¦eDk\u008a";
var16 = "l\u001f¶¸\u0097\u0014D\f+0}¦eDk\u008a".length();
var13 = 0;
}

byte var52 = var13;
var13 += 8;
var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
var45 = var17;
var10001 = var14++;
var60 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var64 = 0;
}
}
}

var25 = var26.charAt(var41);
break;
default:
var29[var27++] = var56;
if ((var41 += var25) < var28) {
var25 = var26.charAt(var41);
continue label74;
}

var26 = "P\u0004¢i\u000e9\u0098wÔÌ\u009cxÐ\u008bCAh\u000f¯$ë\u000fc \u009d:ª¼ÝYàß\u0010ª\u0000³\u0096&\u001eµ)¸xÕo>Wbh";
var28 = "P\u0004¢i\u000e9\u0098wÔÌ\u009cxÐ\u008bCAh\u000f¯$ë\u000fc \u009d:ª¼ÝYàß\u0010ª\u0000³\u0096&\u001eµ)¸xÕo>Wbh".length();
var25 = ' ';
var41 = -1;
}

var42 = var26.substring(++var41, var41 + var25);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29259;
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
throw new RuntimeException("su/catlean/pt", var10);
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
throw new RuntimeException("su/catlean/pt" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29881;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/pt", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/pt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
