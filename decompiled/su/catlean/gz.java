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
import kotlin.collections.ArrayDeque;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class gz extends gf {
@NotNull
public static final gz x;
@NotNull
private static final ArrayDeque N;
@NotNull
private static final fd Y;
private static final long a = yz.a(1705647231680096880L, -2094026497548188876L, MethodHandles.lookup().lookupClass()).a(178387568216919L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private gz(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 11635647020273L;
int var3 = (int)((var1 ^ 11635647020273L) >>> 48);
int var4 = (int)((var1 ^ 11635647020273L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"i">(27366, 3697181073380184666L ^ var1), (char)var5);
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
// 017: ldc2_w 116354511866655
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 81581919584095
// 021: lxor
// 022: lstore 12
// 024: dup2
// 025: ldc2_w 17946477735558
// 028: lxor
// 029: lstore 14
// 02b: dup2
// 02c: ldc2_w 29635521244215
// 02f: lxor
// 030: lstore 16
// 032: dup2
// 033: ldc2_w 109580710346244
// 036: lxor
// 037: lstore 18
// 039: dup2
// 03a: ldc2_w 655743806298
// 03d: lxor
// 03e: lstore 20
// 040: dup2
// 041: ldc2_w 122621818626690
// 044: lxor
// 045: lstore 22
// 047: dup2
// 048: ldc2_w 128377113661390
// 04b: lxor
// 04c: lstore 24
// 04e: dup2
// 04f: ldc2_w 100947255473036
// 052: lxor
// 053: dup2
// 054: bipush 32
// 056: lushr
// 057: l2i
// 058: istore 26
// 05a: dup2
// 05b: bipush 32
// 05d: lshl
// 05e: bipush 40
// 060: lushr
// 061: l2i
// 062: istore 27
// 064: dup2
// 065: bipush 56
// 067: lshl
// 068: bipush 56
// 06a: lushr
// 06b: l2i
// 06c: istore 28
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 23238624456863
// 073: lxor
// 074: lstore 29
// 076: dup2
// 077: ldc2_w 30591967126976
// 07a: lxor
// 07b: lstore 31
// 07d: pop2
// 07e: ldc2_w -5990947769900206742
// 081: lload 1
// 082: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: aload 3
// 088: sipush 16387
// 08b: ldc2_w 7314238721719903137
// 08e: lload 1
// 08f: lxor
// 090: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 098: istore 37
// 09a: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 09d: lload 18
// 09f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a2: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0a5: iload 37
// 0a7: ifne 102
// 0aa: ifeq 0ea
// 0ad: goto 0ba
// 0b0: ldc2_w -6020456159490358945
// 0b3: lload 1
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 0bd: lload 20
// 0bf: invokevirtual su/catlean/_0.f (J)Z
// 0c2: iload 37
// 0c4: lload 1
// 0c5: lconst_0
// 0c6: lcmp
// 0c7: ifle 10a
// 0ca: ifne 102
// 0cd: goto 0da
// 0d0: ldc2_w -6020456159490358945
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: ifeq 138
// 0dd: goto 0ea
// 0e0: ldc2_w -6020456159490358945
// 0e3: lload 1
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: lload 4
// 0ec: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ef: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0f2: instanceof net/minecraft/class_408
// 0f5: goto 102
// 0f8: ldc2_w -6020456159490358945
// 0fb: lload 1
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: lload 1
// 103: lconst_0
// 104: lcmp
// 105: ifle 135
// 108: iload 37
// 10a: ifne 135
// 10d: ifne 138
// 110: goto 11d
// 113: ldc2_w -6020456159490358945
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: lload 4
// 11f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 122: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 125: instanceof su/catlean/rl
// 128: goto 135
// 12b: ldc2_w -6020456159490358945
// 12e: lload 1
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: ifeq 146
// 138: fconst_1
// 139: goto 147
// 13c: ldc2_w -6020456159490358945
// 13f: lload 1
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: fconst_0
// 147: lload 12
// 149: dup2_x1
// 14a: pop2
// 14b: invokevirtual su/catlean/fd.B (JF)V
// 14e: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 151: invokevirtual su/catlean/fd.a ()F
// 154: lload 1
// 155: lconst_0
// 156: lcmp
// 157: ifle 282
// 15a: fconst_0
// 15b: iload 37
// 15d: ifne 281
// 160: fcmpg
// 161: ifgt 17c
// 164: goto 171
// 167: ldc2_w -6020456159490358945
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: return
// 172: ldc2_w -6020456159490358945
// 175: lload 1
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: aload 3
// 17d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 180: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 183: pop
// 184: aload 3
// 185: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 188: aload 0
// 189: lload 31
// 18b: invokevirtual su/catlean/gz.p (J)F
// 18e: ldc 60.0
// 190: fadd
// 191: aload 0
// 192: lload 8
// 194: invokevirtual su/catlean/gz.V (J)F
// 197: ldc 28.5
// 199: fadd
// 19a: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 19d: pop
// 19e: aload 3
// 19f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1a2: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 1a5: invokevirtual su/catlean/fd.a ()F
// 1a8: fconst_0
// 1a9: fconst_2
// 1aa: invokestatic java/lang/Math.clamp (FFF)F
// 1ad: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 1b0: invokevirtual su/catlean/fd.a ()F
// 1b3: fconst_0
// 1b4: fconst_2
// 1b5: invokestatic java/lang/Math.clamp (FFF)F
// 1b8: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 1bb: pop
// 1bc: aload 3
// 1bd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1c0: aload 0
// 1c1: lload 31
// 1c3: invokevirtual su/catlean/gz.p (J)F
// 1c6: ldc 60.0
// 1c8: fadd
// 1c9: fneg
// 1ca: aload 0
// 1cb: lload 8
// 1cd: invokevirtual su/catlean/gz.V (J)F
// 1d0: ldc 28.5
// 1d2: fadd
// 1d3: fneg
// 1d4: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 1d7: pop
// 1d8: aload 0
// 1d9: aload 3
// 1da: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1dd: dup
// 1de: sipush 2741
// 1e1: ldc2_w 5156509801887230234
// 1e4: lload 1
// 1e5: lxor
// 1e6: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ee: aload 0
// 1ef: lload 31
// 1f1: invokevirtual su/catlean/gz.p (J)F
// 1f4: aload 0
// 1f5: lload 8
// 1f7: invokevirtual su/catlean/gz.V (J)F
// 1fa: ldc 135.0
// 1fc: lload 6
// 1fe: ldc 57.0
// 200: fconst_1
// 201: bipush 0
// 202: invokevirtual su/catlean/gz.J (Lorg/joml/Matrix3x2fStack;FFFJFFZ)V
// 205: aload 0
// 206: aload 3
// 207: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 20a: dup
// 20b: sipush 8387
// 20e: ldc2_w 8766441621986165604
// 211: lload 1
// 212: lxor
// 213: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 21b: aload 0
// 21c: lload 31
// 21e: invokevirtual su/catlean/gz.p (J)F
// 221: bipush 2
// 222: i2f
// 223: fadd
// 224: aload 0
// 225: lload 8
// 227: invokevirtual su/catlean/gz.V (J)F
// 22a: bipush 2
// 22b: i2f
// 22c: fadd
// 22d: ldc 53.0
// 22f: lload 6
// 231: ldc 53.0
// 233: ldc 0.6
// 235: bipush 0
// 236: invokevirtual su/catlean/gz.J (Lorg/joml/Matrix3x2fStack;FFFJFFZ)V
// 239: aload 0
// 23a: aload 3
// 23b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 23e: dup
// 23f: sipush 8387
// 242: ldc2_w 8766441621986165604
// 245: lload 1
// 246: lxor
// 247: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24f: aload 0
// 250: lload 31
// 252: invokevirtual su/catlean/gz.p (J)F
// 255: sipush 1946
// 258: ldc2_w 1397711769144225883
// 25b: lload 1
// 25c: lxor
// 25d: invokedynamic q (IJ)I bsm=su/catlean/gz.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: i2f
// 263: fadd
// 264: aload 0
// 265: lload 8
// 267: invokevirtual su/catlean/gz.V (J)F
// 26a: bipush 2
// 26b: i2f
// 26c: fadd
// 26d: ldc 8.0
// 26f: lload 6
// 271: ldc 53.0
// 273: ldc 0.6
// 275: bipush 0
// 276: invokevirtual su/catlean/gz.J (Lorg/joml/Matrix3x2fStack;FFFJFFZ)V
// 279: aload 0
// 27a: lload 31
// 27c: invokevirtual su/catlean/gz.p (J)F
// 27f: ldc 27.5
// 281: fadd
// 282: fstore 38
// 284: aload 0
// 285: lload 8
// 287: invokevirtual su/catlean/gz.V (J)F
// 28a: ldc 27.5
// 28c: fadd
// 28d: fstore 39
// 28f: lload 18
// 291: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 294: invokevirtual net/minecraft/class_746.method_36454 ()F
// 297: ldc 90.0
// 299: fadd
// 29a: fstore 40
// 29c: new net/minecraft/class_4587
// 29f: dup
// 2a0: invokespecial net/minecraft/class_4587.<init> ()V
// 2a3: astore 41
// 2a5: aload 41
// 2a7: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 2aa: aload 41
// 2ac: aload 0
// 2ad: lload 31
// 2af: invokevirtual su/catlean/gz.p (J)F
// 2b2: ldc 60.0
// 2b4: fadd
// 2b5: aload 0
// 2b6: lload 8
// 2b8: invokevirtual su/catlean/gz.V (J)F
// 2bb: ldc 28.5
// 2bd: fadd
// 2be: fconst_0
// 2bf: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 2c2: aload 41
// 2c4: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 2c7: invokevirtual su/catlean/fd.a ()F
// 2ca: fconst_0
// 2cb: fconst_2
// 2cc: invokestatic java/lang/Math.clamp (FFF)F
// 2cf: getstatic su/catlean/gz.Y Lsu/catlean/fd;
// 2d2: invokevirtual su/catlean/fd.a ()F
// 2d5: fconst_0
// 2d6: fconst_2
// 2d7: invokestatic java/lang/Math.clamp (FFF)F
// 2da: fconst_0
// 2db: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 2de: aload 41
// 2e0: aload 0
// 2e1: lload 31
// 2e3: invokevirtual su/catlean/gz.p (J)F
// 2e6: ldc 60.0
// 2e8: fadd
// 2e9: fneg
// 2ea: aload 0
// 2eb: lload 8
// 2ed: invokevirtual su/catlean/gz.V (J)F
// 2f0: ldc 28.5
// 2f2: fadd
// 2f3: fneg
// 2f4: fconst_0
// 2f5: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 2f8: aload 41
// 2fa: fload 38
// 2fc: fconst_1
// 2fd: fadd
// 2fe: fload 39
// 300: fconst_1
// 301: fadd
// 302: fconst_0
// 303: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 306: aload 41
// 308: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 30b: fload 40
// 30d: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 312: checkcast org/joml/Quaternionfc
// 315: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 318: aload 41
// 31a: fload 38
// 31c: fneg
// 31d: fconst_1
// 31e: fsub
// 31f: fload 39
// 321: fneg
// 322: fconst_1
// 323: fsub
// 324: fconst_0
// 325: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 328: getstatic su/catlean/kv.K Lsu/catlean/kv;
// 32b: iload 26
// 32d: iload 27
// 32f: aload 41
// 331: fload 38
// 333: fconst_1
// 334: fadd
// 335: iload 28
// 337: i2b
// 338: fload 39
// 33a: ldc 15.0
// 33c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 33f: lload 14
// 341: bipush 0
// 342: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 345: invokevirtual su/catlean/kv.L (IILnet/minecraft/class_4587;FBFFLjava/awt/Color;)V
// 348: aload 41
// 34a: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 34d: lload 18
// 34f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 352: invokevirtual net/minecraft/class_746.method_36455 ()F
// 355: ldc 90.0
// 357: fdiv
// 358: ldc 26.5
// 35a: fmul
// 35b: ldc 26.5
// 35d: fadd
// 35e: fstore 42
// 360: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 363: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 366: dup
// 367: sipush 29044
// 36a: ldc2_w 813932568259498706
// 36d: lload 1
// 36e: lxor
// 36f: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 377: bipush 0
// 378: bipush 2
// 379: aconst_null
// 37a: astore 33
// 37c: istore 34
// 37e: istore 35
// 380: astore 36
// 382: lload 22
// 384: aload 36
// 386: iload 35
// 388: iload 34
// 38a: aload 33
// 38c: invokestatic su/catlean/gg.k (Lsu/catlean/gg;JLnet/minecraft/class_1792;ZILjava/lang/Object;)I
// 38f: istore 43
// 391: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 394: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 397: dup
// 398: sipush 7451
// 39b: ldc2_w 457824762932002494
// 39e: lload 1
// 39f: lxor
// 3a0: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a8: bipush 0
// 3a9: bipush 2
// 3aa: aconst_null
// 3ab: astore 33
// 3ad: istore 34
// 3af: istore 35
// 3b1: astore 36
// 3b3: lload 22
// 3b5: aload 36
// 3b7: iload 35
// 3b9: iload 34
// 3bb: aload 33
// 3bd: invokestatic su/catlean/gg.k (Lsu/catlean/gg;JLnet/minecraft/class_1792;ZILjava/lang/Object;)I
// 3c0: istore 44
// 3c2: bipush 0
// 3c3: istore 45
// 3c5: fconst_0
// 3c6: fstore 46
// 3c8: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3cb: invokevirtual su/catlean/dm.r ()F
// 3ce: ldc 72.0
// 3d0: fmul
// 3d1: ldc 10.0
// 3d3: fmul
// 3d4: f2i
// 3d5: i2f
// 3d6: ldc 10.0
// 3d8: fdiv
// 3d9: fstore 47
// 3db: lload 18
// 3dd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e0: invokevirtual net/minecraft/class_746.method_23318 ()D
// 3e3: lload 18
// 3e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e8: getfield net/minecraft/class_746.field_6036 D
// 3eb: dsub
// 3ec: ldc 72.0
// 3ee: f2d
// 3ef: dmul
// 3f0: ldc 10.0
// 3f2: f2d
// 3f3: dmul
// 3f4: d2i
// 3f5: i2f
// 3f6: ldc 10.0
// 3f8: fdiv
// 3f9: fstore 48
// 3fb: lload 18
// 3fd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 400: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 403: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 406: dup
// 407: sipush 6730
// 40a: ldc2_w 8359494282005150187
// 40d: lload 1
// 40e: lxor
// 40f: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 414: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 417: astore 49
// 419: aload 49
// 41b: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 41e: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
// 421: iload 37
// 423: ifne 6c4
// 426: ifeq 4de
// 429: goto 436
// 42c: ldc2_w -6020456159490358945
// 42f: lload 1
// 430: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 435: athrow
// 436: getstatic su/catlean/gz.N Lkotlin/collections/ArrayDeque;
// 439: checkcast java/util/Collection
// 43c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 441: iload 37
// 443: ifne 464
// 446: goto 453
// 449: ldc2_w -6020456159490358945
// 44c: lload 1
// 44d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: athrow
// 453: ifne 467
// 456: goto 463
// 459: ldc2_w -6020456159490358945
// 45c: lload 1
// 45d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 462: athrow
// 463: bipush 1
// 464: goto 468
// 467: bipush 0
// 468: ifeq 4de
// 46b: lload 16
// 46d: aload 49
// 46f: getstatic net/minecraft/class_1893.field_9119 Lnet/minecraft/class_5321;
// 472: dup
// 473: sipush 29573
// 476: ldc2_w 816112925060010022
// 479: lload 1
// 47a: lxor
// 47b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 480: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 483: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 486: istore 50
// 488: aload 49
// 48a: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 48d: aload 49
// 48f: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 492: isub
// 493: istore 45
// 495: iload 45
// 497: i2d
// 498: getstatic su/catlean/gz.N Lkotlin/collections/ArrayDeque;
// 49b: checkcast java/lang/Iterable
// 49e: invokestatic kotlin/collections/CollectionsKt.averageOfFloat (Ljava/lang/Iterable;)D
// 4a1: dmul
// 4a2: d2f
// 4a3: fstore 46
// 4a5: fload 46
// 4a7: sipush 640
// 4aa: ldc2_w 8819519051057493315
// 4ad: lload 1
// 4ae: lxor
// 4af: invokedynamic q (IJ)I bsm=su/catlean/gz.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b4: i2f
// 4b5: fmul
// 4b6: f2i
// 4b7: i2f
// 4b8: ldc 10.0
// 4ba: fdiv
// 4bb: fstore 46
// 4bd: iload 50
// 4bf: iload 37
// 4c1: ifne 6c4
// 4c4: ifle 4de
// 4c7: goto 4d4
// 4ca: ldc2_w -6020456159490358945
// 4cd: lload 1
// 4ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d3: athrow
// 4d4: fload 46
// 4d6: iload 50
// 4d8: bipush 1
// 4d9: isub
// 4da: i2f
// 4db: fmul
// 4dc: fstore 46
// 4de: aload 0
// 4df: aload 3
// 4e0: ldc "X"
// 4e2: aload 0
// 4e3: lload 31
// 4e5: invokevirtual su/catlean/gz.p (J)F
// 4e8: ldc 25.5
// 4ea: fadd
// 4eb: aload 0
// 4ec: lload 8
// 4ee: invokevirtual su/catlean/gz.V (J)F
// 4f1: fconst_1
// 4f2: fadd
// 4f3: lload 24
// 4f5: dup2_x1
// 4f6: pop2
// 4f7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4fa: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 4fd: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 500: aload 0
// 501: aload 3
// 502: ldc "z"
// 504: aload 0
// 505: lload 31
// 507: invokevirtual su/catlean/gz.p (J)F
// 50a: ldc 4.0
// 50c: fadd
// 50d: aload 0
// 50e: lload 8
// 510: invokevirtual su/catlean/gz.V (J)F
// 513: ldc 22.0
// 515: fadd
// 516: lload 24
// 518: dup2_x1
// 519: pop2
// 51a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 51d: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 520: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 523: aload 0
// 524: aload 3
// 525: ldc "x"
// 527: aload 0
// 528: lload 31
// 52a: invokevirtual su/catlean/gz.p (J)F
// 52d: ldc 25.5
// 52f: fadd
// 530: aload 0
// 531: lload 8
// 533: invokevirtual su/catlean/gz.V (J)F
// 536: ldc 44.0
// 538: fadd
// 539: lload 24
// 53b: dup2_x1
// 53c: pop2
// 53d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 540: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 543: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 546: aload 0
// 547: aload 3
// 548: ldc "Z"
// 54a: aload 0
// 54b: lload 31
// 54d: invokevirtual su/catlean/gz.p (J)F
// 550: ldc 49.0
// 552: fadd
// 553: aload 0
// 554: lload 8
// 556: invokevirtual su/catlean/gz.V (J)F
// 559: ldc 22.0
// 55b: fadd
// 55c: lload 24
// 55e: dup2_x1
// 55f: pop2
// 560: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 563: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 566: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 569: aload 0
// 56a: aload 3
// 56b: iload 43
// 56d: sipush 12189
// 570: ldc2_w 5736424671415422003
// 573: lload 1
// 574: lxor
// 575: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57a: swap
// 57b: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 580: aload 0
// 581: lload 31
// 583: invokevirtual su/catlean/gz.p (J)F
// 586: ldc 67.0
// 588: fadd
// 589: aload 0
// 58a: lload 8
// 58c: invokevirtual su/catlean/gz.V (J)F
// 58f: lload 24
// 591: dup2_x1
// 592: pop2
// 593: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 596: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 599: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 59c: aload 0
// 59d: aload 3
// 59e: iload 45
// 5a0: sipush 28273
// 5a3: ldc2_w 3488069090615791067
// 5a6: lload 1
// 5a7: lxor
// 5a8: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ad: swap
// 5ae: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 5b3: aload 0
// 5b4: lload 31
// 5b6: invokevirtual su/catlean/gz.p (J)F
// 5b9: ldc 67.0
// 5bb: fadd
// 5bc: aload 0
// 5bd: lload 8
// 5bf: invokevirtual su/catlean/gz.V (J)F
// 5c2: ldc 9.0
// 5c4: fadd
// 5c5: lload 24
// 5c7: dup2_x1
// 5c8: pop2
// 5c9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 5cc: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 5cf: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 5d2: aload 0
// 5d3: aload 3
// 5d4: fload 46
// 5d6: sipush 5912
// 5d9: ldc2_w 5340536231814853808
// 5dc: lload 1
// 5dd: lxor
// 5de: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e3: swap
// 5e4: invokedynamic makeConcatWithConstants (Ljava/lang/String;F)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 5e9: aload 0
// 5ea: lload 31
// 5ec: invokevirtual su/catlean/gz.p (J)F
// 5ef: ldc 67.0
// 5f1: fadd
// 5f2: aload 0
// 5f3: lload 8
// 5f5: invokevirtual su/catlean/gz.V (J)F
// 5f8: ldc 18.0
// 5fa: fadd
// 5fb: lload 24
// 5fd: dup2_x1
// 5fe: pop2
// 5ff: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 602: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 605: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 608: aload 0
// 609: aload 3
// 60a: iload 44
// 60c: sipush 28036
// 60f: ldc2_w 6966836993033276964
// 612: lload 1
// 613: lxor
// 614: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 619: swap
// 61a: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 61f: aload 0
// 620: lload 31
// 622: invokevirtual su/catlean/gz.p (J)F
// 625: ldc 67.0
// 627: fadd
// 628: aload 0
// 629: lload 8
// 62b: invokevirtual su/catlean/gz.V (J)F
// 62e: ldc 27.0
// 630: fadd
// 631: lload 24
// 633: dup2_x1
// 634: pop2
// 635: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 638: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 63b: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 63e: aload 0
// 63f: aload 3
// 640: fload 47
// 642: sipush 29140
// 645: ldc2_w 887108317340209776
// 648: lload 1
// 649: lxor
// 64a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64f: swap
// 650: invokedynamic makeConcatWithConstants (Ljava/lang/String;F)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 655: aload 0
// 656: lload 31
// 658: invokevirtual su/catlean/gz.p (J)F
// 65b: ldc 67.0
// 65d: fadd
// 65e: aload 0
// 65f: lload 8
// 661: invokevirtual su/catlean/gz.V (J)F
// 664: ldc 36.0
// 666: fadd
// 667: lload 24
// 669: dup2_x1
// 66a: pop2
// 66b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 66e: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 671: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 674: aload 0
// 675: aload 3
// 676: fload 48
// 678: sipush 19356
// 67b: ldc2_w 5578789844977723445
// 67e: lload 1
// 67f: lxor
// 680: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 685: swap
// 686: invokedynamic makeConcatWithConstants (Ljava/lang/String;F)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 68b: aload 0
// 68c: lload 31
// 68e: invokevirtual su/catlean/gz.p (J)F
// 691: ldc 67.0
// 693: fadd
// 694: aload 0
// 695: lload 8
// 697: invokevirtual su/catlean/gz.V (J)F
// 69a: ldc 45.0
// 69c: fadd
// 69d: lload 24
// 69f: dup2_x1
// 6a0: pop2
// 6a1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6a4: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 6a7: invokevirtual su/catlean/gz.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 6aa: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 6ad: iload 37
// 6af: ifne 6ca
// 6b2: lload 20
// 6b4: invokevirtual su/catlean/ut.f (J)Z
// 6b7: goto 6c4
// 6ba: ldc2_w -6020456159490358945
// 6bd: lload 1
// 6be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c3: athrow
// 6c4: ifeq 73c
// 6c7: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 6ca: lload 10
// 6cc: invokevirtual su/catlean/ut.FX (J)Lsu/catlean/dz;
// 6cf: getstatic su/catlean/dz.INFINITE Lsu/catlean/dz;
// 6d2: if_acmpne 73c
// 6d5: getstatic su/catlean/l3.l Lsu/catlean/l3;
// 6d8: invokevirtual su/catlean/l3.Y ()F
// 6db: fstore 50
// 6dd: fload 50
// 6df: ldc 90.0
// 6e1: fdiv
// 6e2: ldc 26.5
// 6e4: fmul
// 6e5: ldc 26.5
// 6e7: fadd
// 6e8: fstore 51
// 6ea: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6ed: aload 3
// 6ee: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6f1: dup
// 6f2: sipush 8387
// 6f5: ldc2_w 8766441621986165604
// 6f8: lload 1
// 6f9: lxor
// 6fa: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 702: aload 0
// 703: lload 31
// 705: invokevirtual su/catlean/gz.p (J)F
// 708: ldc 57.0
// 70a: fadd
// 70b: aload 0
// 70c: lload 8
// 70e: invokevirtual su/catlean/gz.V (J)F
// 711: fload 51
// 713: fadd
// 714: ldc 8.0
// 716: fconst_1
// 717: bipush 1
// 718: anewarray 343
// 71b: astore 52
// 71d: aload 52
// 71f: bipush 0
// 720: getstatic java/awt/Color.RED Ljava/awt/Color;
// 723: dup
// 724: sipush 21583
// 727: ldc2_w 421443223091460068
// 72a: lload 1
// 72b: lxor
// 72c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 731: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 734: aastore
// 735: aload 52
// 737: lload 29
// 739: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 73c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 73f: aload 3
// 740: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 743: dup
// 744: sipush 8387
// 747: ldc2_w 8766441621986165604
// 74a: lload 1
// 74b: lxor
// 74c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/gz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 751: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 754: aload 0
// 755: lload 31
// 757: invokevirtual su/catlean/gz.p (J)F
// 75a: ldc 57.0
// 75c: fadd
// 75d: aload 0
// 75e: lload 8
// 760: invokevirtual su/catlean/gz.V (J)F
// 763: fload 42
// 765: fadd
// 766: ldc 8.0
// 768: fconst_1
// 769: bipush 1
// 76a: anewarray 343
// 76d: astore 50
// 76f: aload 50
// 771: bipush 0
// 772: new java/awt/Color
// 775: dup
// 776: sipush 258
// 779: ldc2_w 7672866833595823810
// 77c: lload 1
// 77d: lxor
// 77e: invokedynamic q (IJ)I bsm=su/catlean/gz.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 783: bipush 1
// 784: invokespecial java/awt/Color.<init> (IZ)V
// 787: aastore
// 788: aload 50
// 78a: lload 29
// 78c: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 78f: aload 3
// 790: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 793: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 796: pop
// 797: aload 0
// 798: ldc 120.0
// 79a: ldc 55.0
// 79c: invokevirtual su/catlean/gz.X (FF)V
// 79f: return
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
// 00: ldc2_w 6612305006036320882
// 03: lload 1
// 04: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09: istore 3
// 0a: lload 1
// 0b: lconst_0
// 0c: lcmp
// 0d: iflt 5e
// 10: getstatic su/catlean/gz.N Lkotlin/collections/ArrayDeque;
// 13: invokevirtual kotlin/collections/ArrayDeque.size ()I
// 16: iload 3
// 17: ifne 5d
// 1a: sipush 18495
// 1d: ldc2_w 5707845265626188005
// 20: lload 1
// 21: lxor
// 22: invokedynamic q (IJ)I bsm=su/catlean/gz.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: if_icmplt 4b
// 2a: goto 37
// 2d: ldc2_w 6587442329022051911
// 30: lload 1
// 31: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: athrow
// 37: getstatic su/catlean/gz.N Lkotlin/collections/ArrayDeque;
// 3a: invokevirtual kotlin/collections/ArrayDeque.removeFirst ()Ljava/lang/Object;
// 3d: pop
// 3e: goto 4b
// 41: ldc2_w 6587442329022051911
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: getstatic su/catlean/gz.N Lkotlin/collections/ArrayDeque;
// 4e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 51: invokevirtual su/catlean/dm.r ()F
// 54: ldc 20.0
// 56: fmul
// 57: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 5a: invokevirtual kotlin/collections/ArrayDeque.add (Ljava/lang/Object;)Z
// 5d: pop
// 5e: return
}

static {
long var27 = a ^ 129394002539005L;
long var29 = var27 ^ 26716362798629L;
long var31 = var27 ^ 41319142819719L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[15];
int var23 = 0;
String var22 = "I¤IÝ\u001dÈþ\u0011°ó¿Rù\u0080æ5\u008fIÒ|Ù.[\u0080\u0090à;JjÍß\u0017\u0010\u0094J±ê)Id¦¼ò\u009e\u0082ÇÜ÷×(¶{¼\u001d\u0016\u009a_í6Ú\u009ag\u0012¶\u001a\u0013Rðò[T0ìV\u009c×C¨ö\u0005×w®\u001d\u0014ÊW\u007f\u0004Ê\u0018Ñ¥;oL]j\u0018ÃÈÎÞ\u008bJ:\fNñ\rü×F\u001a\u000b\u0018\u008b\r²\u0094ó/Pçóß%bqAX\u0089\u000b\u000bBË\tó³ò\u0018\u0019\u008däÃjI7è!\u0019ò1F\u001d\u00149U5]Ò\u001cªºþ\u0010\u001f\u0018\\\u00adXÐm~\u0014B\f`vÖTÐ r:V+\n>¬5k\u0014\u0095xò\u0015\u009dF\u0087\u0006\u0010\u0080[¼(q(º°Öxº\u0089¯\u0010¦\u0003dPÎ|\u0083\u009fMâ-d\\ï\u0083¾ Ö\u000b\u0013%\u0016_ØÐÆ\u008a%ù\u0096Ä||\u00070ÝVôÎ\u0096¶\t{|\u0010cvÈ\u0092 \u000býRsL\u0018ê\u0087\u0091vÂÄÑ¶Kº°1\u00141*p[ E\u0011.\tºç\u0089î\u00183\u0013¢°\u0012±ÝÏ6ÊGp×úÓÏ9\u001eEEÍÎ[\u0081 \u001e\u008bº,ÏÕk½í|Î|\u0001Åpv\u0085Aé\u0092\u0017ýåÒ+\u007f¸Ðoì®Å";
int var24 = "I¤IÝ\u001dÈþ\u0011°ó¿Rù\u0080æ5\u008fIÒ|Ù.[\u0080\u0090à;JjÍß\u0017\u0010\u0094J±ê)Id¦¼ò\u009e\u0082ÇÜ÷×(¶{¼\u001d\u0016\u009a_í6Ú\u009ag\u0012¶\u001a\u0013Rðò[T0ìV\u009c×C¨ö\u0005×w®\u001d\u0014ÊW\u007f\u0004Ê\u0018Ñ¥;oL]j\u0018ÃÈÎÞ\u008bJ:\fNñ\rü×F\u001a\u000b\u0018\u008b\r²\u0094ó/Pçóß%bqAX\u0089\u000b\u000bBË\tó³ò\u0018\u0019\u008däÃjI7è!\u0019ò1F\u001d\u00149U5]Ò\u001cªºþ\u0010\u001f\u0018\\\u00adXÐm~\u0014B\f`vÖTÐ r:V+\n>¬5k\u0014\u0095xò\u0015\u009dF\u0087\u0006\u0010\u0080[¼(q(º°Öxº\u0089¯\u0010¦\u0003dPÎ|\u0083\u009fMâ-d\\ï\u0083¾ Ö\u000b\u0013%\u0016_ØÐÆ\u008a%ù\u0096Ä||\u00070ÝVôÎ\u0096¶\t{|\u0010cvÈ\u0092 \u000býRsL\u0018ê\u0087\u0091vÂÄÑ¶Kº°1\u00141*p[ E\u0011.\tºç\u0089î\u00183\u0013¢°\u0012±ÝÏ6ÊGp×úÓÏ9\u001eEEÍÎ[\u0081 \u001e\u008bº,ÏÕk½í|Î|\u0001Åpv\u0085Aé\u0092\u0017ýåÒ+\u007f¸Ðoì®Å"
.length();
char var21 = ' ';
int var35 = -1;

label64:
while (true) {
String var36 = var22.substring(++var35, var35 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var36.getBytes("ISO-8859-1"));
String var49 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var49;
if ((var35 += var21) >= var24) {
b = var25;
c = new String[15];
i = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[5];
int var10 = 0;
String var11 = "ìÜô$Npdì\u00adO{Zì8+ÿ¬[\u001bYgf\u0004U";
int var12 = "ìÜô$Npdì\u00adO{Zì8+ÿ¬[\u001bYgf\u0004U".length();
byte var9 = 0;

label46:
while (true) {
var10001 = var9;
var9 += 8;
byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
long[] var39 = var13;
var10001 = var10++;
long var53 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var58 = -1;

while (true) {
long var15 = var53;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var61 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var61;
if (var9 >= var12) {
g = var13;
h = new Integer[5];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 5178457782935036959L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var56 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var47 = -1;
long var0 = var56;
x = new gz(var31);
N = new ArrayDeque(d<"q">(24909, 7884564796112301570L ^ var27));
Y = new fd(_s.OUT_BACK, var0, var29);
return;
}
break;
default:
var39[var10001] = var61;
if (var9 < var12) {
continue label46;
}

var11 = "kÖ£}\u0088Ø¬1ó\u0095ªÆì\u0014h\u00ad";
var12 = "kÖ£}\u0088Ø¬1ó\u0095ªÆì\u0014h\u00ad".length();
var9 = 0;
}

byte var46 = var9;
var9 += 8;
var14 = var11.substring(var46, var9).getBytes("ISO-8859-1");
var39 = var13;
var10001 = var10++;
var53 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var58 = 0;
}
}
}

var21 = var22.charAt(var35);
break;
default:
var25[var23++] = var49;
if ((var35 += var21) < var24) {
var21 = var22.charAt(var35);
continue label64;
}

var22 = "ðï_ó\u008fº%xBÍB¤lcñþ\u0001\u0014N\u0089/Âi¢\u001d\u009f§Gíût\u008c\u0018\u0099\u0019¢\rQªüCGä~\u0006ÏÕo\u009c \u0000æ´Ì5³©";
var24 = "ðï_ó\u008fº%xBÍB¤lcñþ\u0001\u0014N\u0089/Âi¢\u001d\u009f§Gíût\u008c\u0018\u0099\u0019¢\rQªüCGä~\u0006ÏÕo\u009c \u0000æ´Ì5³©".length();
var21 = ' ';
var35 = -1;
}

var36 = var22.substring(++var35, var35 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20168;
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
throw new RuntimeException("su/catlean/gz", var10);
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
throw new RuntimeException("su/catlean/gz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23210;
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
throw new RuntimeException("su/catlean/gz", var14);
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
throw new RuntimeException("su/catlean/gz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
