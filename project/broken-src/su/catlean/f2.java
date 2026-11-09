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

public final class f2 implements b4 {
@NotNull
public static final f2 p;
private static int b;
private static int u;
private static int c;
private static int U;
private static final long a = yz.a(-6245659716847199657L, 8328145373008717844L, MethodHandles.lookup().lookupClass()).a(191144222059247L);
private static final String d;
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private f2() {
}

public final int y() {
return b;
}

public final void A(int <set-?>) {
b = <set-?>;
}

public final int j() {
return u;
}

public final void r(int <set-?>) {
u = <set-?>;
}

public final int u() {
return c;
}

public final void H(int <set-?>) {
c = <set-?>;
}

@Override
public void Q(int var1, long var2) {
}

@Override
public void P(@NotNull _w rotation, short a, int a, int a) {
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
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: lstore 5
// 01a: lload 5
// 01c: dup2
// 01d: ldc2_w 86959730434430
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 7
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 132427939850213
// 041: lxor
// 042: lstore 10
// 044: dup2
// 045: ldc2_w 45796165513343
// 048: lxor
// 049: lstore 12
// 04b: dup2
// 04c: ldc2_w 117761595250026
// 04f: lxor
// 050: lstore 14
// 052: pop2
// 053: ldc2_w -2859712109970658601
// 056: lload 5
// 058: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: aload 1
// 05e: getstatic su/catlean/f2.d Ljava/lang/String;
// 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 064: ldc 20.0
// 066: getstatic su/catlean/um.E Lsu/catlean/um;
// 069: lload 14
// 06b: invokevirtual su/catlean/um.Bj (J)I
// 06e: i2f
// 06f: fdiv
// 070: f2i
// 071: bipush 1
// 072: isub
// 073: istore 17
// 075: ldc 20.0
// 077: getstatic su/catlean/um.E Lsu/catlean/um;
// 07a: iload 7
// 07c: i2c
// 07d: iload 8
// 07f: iload 9
// 081: invokevirtual su/catlean/um.L (CII)I
// 084: i2f
// 085: fdiv
// 086: f2i
// 087: bipush 1
// 088: isub
// 089: istore 18
// 08b: iload 17
// 08d: iload 18
// 08f: invokestatic java/lang/Math.min (II)I
// 092: istore 19
// 094: istore 16
// 096: iload 17
// 098: iload 18
// 09a: invokestatic java/lang/Math.max (II)I
// 09d: istore 20
// 09f: getstatic su/catlean/f2.c I
// 0a2: istore 21
// 0a4: iload 21
// 0a6: bipush 1
// 0a7: iadd
// 0a8: putstatic su/catlean/f2.c I
// 0ab: getstatic su/catlean/um.E Lsu/catlean/um;
// 0ae: lload 12
// 0b0: invokevirtual su/catlean/um.V (J)Z
// 0b3: iload 16
// 0b5: ifeq 11f
// 0b8: ifeq 122
// 0bb: goto 0c9
// 0be: ldc2_w -2837713050961235605
// 0c1: lload 5
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: new kotlin/ranges/IntRange
// 0cc: dup
// 0cd: iload 19
// 0cf: iload 20
// 0d1: invokespecial kotlin/ranges/IntRange.<init> (II)V
// 0d4: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 0d7: checkcast kotlin/random/Random
// 0da: invokestatic kotlin/ranges/RangesKt.random (Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I
// 0dd: i2d
// 0de: invokestatic su/catlean/zf.A ()J
// 0e1: sipush 31743
// 0e4: ldc2_w 9209843914663829181
// 0e7: lload 5
// 0e9: lxor
// 0ea: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: i2l
// 0f0: lrem
// 0f1: l2d
// 0f2: ldc2_w 100.0
// 0f5: ddiv
// 0f6: bipush 2
// 0f7: i2d
// 0f8: dmul
// 0f9: ldc2_w 3.141592653589793
// 0fc: dmul
// 0fd: invokestatic java/lang/Math.sin (D)D
// 100: ldc2_w 1.5
// 103: dmul
// 104: dadd
// 105: ldc2_w 1.5
// 108: dadd
// 109: d2i
// 10a: iload 19
// 10c: iload 20
// 10e: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
// 111: goto 11f
// 114: ldc2_w -2837713050961235605
// 117: lload 5
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: goto 128
// 122: aload 0
// 123: lload 10
// 125: invokespecial su/catlean/f2.V (J)I
// 128: putstatic su/catlean/f2.b I
// 12b: getstatic su/catlean/f2.b I
// 12e: putstatic su/catlean/f2.u I
// 131: iload 16
// 133: iload 4
// 135: iflt 13c
// 138: ifne 157
// 13b: bipush 3
// 13c: anewarray 513
// 13f: ldc2_w -2832550130498809203
// 142: lload 5
// 144: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: goto 157
// 14c: ldc2_w -2837713050961235605
// 14f: lload 5
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: return
}

@Override
public void n(long var1) {
int var3 = b;
b = var3 + -1;
}

public final boolean b(long a, int offset) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f2.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 74463795741765
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 33680716585513
// 12: lxor
// 13: lstore 6
// 15: pop2
// 16: ldc2_w -6022956594329444627
// 19: lload 1
// 1a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: istore 8
// 21: aload 0
// 22: lload 6
// 24: iload 3
// 25: invokespecial su/catlean/f2.R (JI)Z
// 28: iload 8
// 2a: ifeq 7f
// 2d: ifne 6d
// 30: goto 3d
// 33: ldc2_w -6006674781577788079
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: getstatic su/catlean/um.E Lsu/catlean/um;
// 40: lload 4
// 42: invokevirtual su/catlean/um.V (J)Z
// 45: iload 8
// 47: lload 1
// 48: lconst_0
// 49: lcmp
// 4a: iflt 81
// 4d: ifeq 7f
// 50: goto 5d
// 53: ldc2_w -6006674781577788079
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: ifeq 98
// 60: goto 6d
// 63: ldc2_w -6006674781577788079
// 66: lload 1
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: getstatic su/catlean/f2.b I
// 70: iload 3
// 71: isub
// 72: goto 7f
// 75: ldc2_w -6006674781577788079
// 78: lload 1
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: iload 8
// 81: ifeq 95
// 84: ifgt 98
// 87: goto 94
// 8a: ldc2_w -6006674781577788079
// 8d: lload 1
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: bipush 1
// 95: goto 99
// 98: bipush 0
// 99: ireturn
}

public static boolean k(f2 var0, int var1, int var2, long var3, Object var5) {
var3 = a ^ var3;
long var6 = var3 ^ 34518990913436L;
int var8 = vm.a<"Å">(-8796665111301719275L, var3);

try {
int var10000 = var2 & 1;
if (var8 != 0) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.b(var6, var1);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8817996727829435307L, var3);
}

byte var11 = 0;
return var0.b(var6, var11);
}

public final boolean z(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f2.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 62381482796064
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 1061039303841
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 4507253491186090098
// 18: lload 1
// 19: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: istore 7
// 20: lload 3
// 21: aload 0
// 22: bipush 0
// 23: bipush 1
// 24: aconst_null
// 25: invokestatic su/catlean/f2.d (JLsu/catlean/f2;IILjava/lang/Object;)Z
// 28: iload 7
// 2a: ifne 59
// 2d: ifeq 72
// 30: goto 3d
// 33: ldc2_w 4523621911433566002
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: lload 5
// 3f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 42: ldc 0.5
// 44: invokevirtual net/minecraft/class_746.method_7261 (F)F
// 47: f2d
// 48: ldc2_w 0.93
// 4b: dcmpl
// 4c: goto 59
// 4f: ldc2_w 4523621911433566002
// 52: lload 1
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: iload 7
// 5b: ifne 6f
// 5e: ifle 72
// 61: goto 6e
// 64: ldc2_w 4523621911433566002
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: bipush 1
// 6f: goto 73
// 72: bipush 0
// 73: ireturn
}

private final boolean R(long param1, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f2.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 49534503582805
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 121933395260018
// 012: lxor
// 013: dup2
// 014: bipush 56
// 016: lushr
// 017: l2i
// 018: istore 6
// 01a: dup2
// 01b: bipush 8
// 01d: lshl
// 01e: bipush 8
// 020: lushr
// 021: lstore 7
// 023: pop2
// 024: dup2
// 025: ldc2_w 38180199068669
// 028: lxor
// 029: dup2
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 9
// 030: dup2
// 031: bipush 32
// 033: lshl
// 034: bipush 56
// 036: lushr
// 037: l2i
// 038: istore 10
// 03a: dup2
// 03b: bipush 40
// 03d: lshl
// 03e: bipush 40
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: pop2
// 045: dup2
// 046: ldc2_w 84742404959032
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 17315729394900
// 050: lxor
// 051: lstore 14
// 053: dup2
// 054: ldc2_w 15018155012723
// 057: lxor
// 058: lstore 16
// 05a: pop2
// 05b: ldc2_w -6890799398199173472
// 05e: lload 1
// 05f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: istore 18
// 066: lload 16
// 068: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06b: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 06e: iload 18
// 070: ifne 1ae
// 073: ifne 193
// 076: goto 083
// 079: ldc2_w -6911565865314006560
// 07c: lload 1
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 086: invokevirtual su/catlean/dm.o ()D
// 089: iload 18
// 08b: ifne 12c
// 08e: goto 09b
// 091: ldc2_w -6911565865314006560
// 094: lload 1
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: lload 1
// 09c: lconst_0
// 09d: lcmp
// 09e: ifle 11f
// 0a1: dconst_0
// 0a2: dcmpl
// 0a3: ifgt 119
// 0a6: goto 0b3
// 0a9: ldc2_w -6911565865314006560
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: lload 16
// 0b5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b8: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 0bb: getfield net/minecraft/class_243.field_1351 D
// 0be: ldc2_w 0.0031
// 0c1: dcmpg
// 0c2: iload 18
// 0c4: ifne 1ae
// 0c7: goto 0d4
// 0ca: ldc2_w -6911565865314006560
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: lload 1
// 0d5: lconst_0
// 0d6: lcmp
// 0d7: iflt 1a1
// 0da: ifge 193
// 0dd: goto 0ea
// 0e0: ldc2_w -6911565865314006560
// 0e3: lload 1
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: iload 3
// 0eb: iload 18
// 0ed: lload 1
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: iflt 1b0
// 0f3: ifne 1ae
// 0f6: goto 103
// 0f9: ldc2_w -6911565865314006560
// 0fc: lload 1
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: lload 1
// 104: lconst_0
// 105: lcmp
// 106: ifle 1a1
// 109: ifeq 193
// 10c: goto 119
// 10f: ldc2_w -6911565865314006560
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 11c: invokevirtual su/catlean/dm.o ()D
// 11f: goto 12c
// 122: ldc2_w -6911565865314006560
// 125: lload 1
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: dstore 20
// 12e: ldc2_w 1.13
// 131: dload 20
// 133: dcmpg
// 134: iload 18
// 136: lload 1
// 137: lconst_0
// 138: lcmp
// 139: iflt 164
// 13c: ifne 162
// 13f: ifgt 189
// 142: goto 14f
// 145: ldc2_w -6911565865314006560
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: dload 20
// 151: ldc2_w 1.146
// 154: dcmpg
// 155: goto 162
// 158: ldc2_w -6911565865314006560
// 15b: lload 1
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: iload 18
// 164: ifne 186
// 167: ifgt 185
// 16a: goto 177
// 16d: ldc2_w -6911565865314006560
// 170: lload 1
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: bipush 1
// 178: goto 18a
// 17b: ldc2_w -6911565865314006560
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: bipush 0
// 186: goto 18a
// 189: bipush 0
// 18a: lload 1
// 18b: lconst_0
// 18c: lcmp
// 18d: ifle 1a1
// 190: ifeq 1c3
// 193: lload 4
// 195: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 198: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 19b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 19e: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1a1: goto 1ae
// 1a4: ldc2_w -6911565865314006560
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: iload 18
// 1b0: ifne 1c4
// 1b3: ifne 1c7
// 1b6: goto 1c3
// 1b9: ldc2_w -6911565865314006560
// 1bc: lload 1
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: bipush 1
// 1c4: goto 1c8
// 1c7: bipush 0
// 1c8: istore 19
// 1ca: lload 16
// 1cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cf: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 1d2: iload 18
// 1d4: lload 1
// 1d5: lconst_0
// 1d6: lcmp
// 1d7: iflt 3cc
// 1da: ifne 3ca
// 1dd: ifne 3c2
// 1e0: goto 1ed
// 1e3: ldc2_w -6911565865314006560
// 1e6: lload 1
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: lload 16
// 1ef: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f2: getstatic net/minecraft/class_1294.field_5919 Lnet/minecraft/class_6880;
// 1f5: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 1f8: iload 18
// 1fa: ifne 398
// 1fd: goto 20a
// 200: ldc2_w -6911565865314006560
// 203: lload 1
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: ifne 397
// 20d: goto 21a
// 210: ldc2_w -6911565865314006560
// 213: lload 1
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: lload 16
// 21c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21f: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
// 222: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 225: iload 18
// 227: ifne 398
// 22a: goto 237
// 22d: ldc2_w -6911565865314006560
// 230: lload 1
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: ifne 397
// 23a: goto 247
// 23d: ldc2_w -6911565865314006560
// 240: lload 1
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: lload 16
// 249: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24c: getstatic net/minecraft/class_3486.field_15517 Lnet/minecraft/class_6862;
// 24f: invokevirtual net/minecraft/class_746.method_5777 (Lnet/minecraft/class_6862;)Z
// 252: iload 18
// 254: ifne 398
// 257: goto 264
// 25a: ldc2_w -6911565865314006560
// 25d: lload 1
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: ifne 397
// 267: goto 274
// 26a: ldc2_w -6911565865314006560
// 26d: lload 1
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: lload 16
// 276: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 279: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 27c: iload 18
// 27e: lload 1
// 27f: lconst_0
// 280: lcmp
// 281: ifle 2fb
// 284: ifne 2f9
// 287: goto 294
// 28a: ldc2_w -6911565865314006560
// 28d: lload 1
// 28e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 293: athrow
// 294: lload 1
// 295: lconst_0
// 296: lcmp
// 297: ifle 2ec
// 29a: ifeq 2d7
// 29d: goto 2aa
// 2a0: ldc2_w -6911565865314006560
// 2a3: lload 1
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: lload 16
// 2ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2af: getstatic net/minecraft/class_3486.field_15518 Lnet/minecraft/class_6862;
// 2b2: invokevirtual net/minecraft/class_746.method_5777 (Lnet/minecraft/class_6862;)Z
// 2b5: iload 18
// 2b7: ifne 398
// 2ba: goto 2c7
// 2bd: ldc2_w -6911565865314006560
// 2c0: lload 1
// 2c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: athrow
// 2c7: ifne 397
// 2ca: goto 2d7
// 2cd: ldc2_w -6911565865314006560
// 2d0: lload 1
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 2da: lload 16
// 2dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2df: checkcast net/minecraft/class_1657
// 2e2: iload 9
// 2e4: iload 10
// 2e6: i2b
// 2e7: iload 11
// 2e9: invokevirtual su/catlean/bi.j (Lnet/minecraft/class_1657;IBI)Z
// 2ec: goto 2f9
// 2ef: ldc2_w -6911565865314006560
// 2f2: lload 1
// 2f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: athrow
// 2f9: iload 18
// 2fb: ifne 398
// 2fe: ifne 397
// 301: goto 30e
// 304: ldc2_w -6911565865314006560
// 307: lload 1
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 311: lload 16
// 313: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 316: checkcast net/minecraft/class_1657
// 319: lload 12
// 31b: invokevirtual su/catlean/bi.c (Lnet/minecraft/class_1657;J)Z
// 31e: iload 18
// 320: ifne 398
// 323: goto 330
// 326: ldc2_w -6911565865314006560
// 329: lload 1
// 32a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32f: athrow
// 330: ifne 397
// 333: goto 340
// 336: ldc2_w -6911565865314006560
// 339: lload 1
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: lload 16
// 342: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 345: invokevirtual net/minecraft/class_746.method_21754 ()Z
// 348: iload 18
// 34a: ifne 398
// 34d: goto 35a
// 350: ldc2_w -6911565865314006560
// 353: lload 1
// 354: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 359: athrow
// 35a: ifne 397
// 35d: goto 36a
// 360: ldc2_w -6911565865314006560
// 363: lload 1
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: lload 16
// 36c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 36f: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 372: getfield net/minecraft/class_1656.field_7479 Z
// 375: iload 18
// 377: ifne 398
// 37a: goto 387
// 37d: ldc2_w -6911565865314006560
// 380: lload 1
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: ifeq 39b
// 38a: goto 397
// 38d: ldc2_w -6911565865314006560
// 390: lload 1
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: bipush 1
// 398: goto 39c
// 39b: bipush 0
// 39c: istore 20
// 39e: iload 20
// 3a0: iload 18
// 3a2: ifne 55c
// 3a5: ifne 55b
// 3a8: goto 3b5
// 3ab: ldc2_w -6911565865314006560
// 3ae: lload 1
// 3af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b4: athrow
// 3b5: iload 19
// 3b7: ireturn
// 3b8: ldc2_w -6911565865314006560
// 3bb: lload 1
// 3bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: athrow
// 3c2: lload 16
// 3c4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c7: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 3ca: iload 18
// 3cc: lload 1
// 3cd: lconst_0
// 3ce: lcmp
// 3cf: iflt 41e
// 3d2: ifne 41c
// 3d5: ifne 48a
// 3d8: goto 3e5
// 3db: ldc2_w -6911565865314006560
// 3de: lload 1
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: lload 14
// 3e7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3ea: getstatic su/catlean/um.E Lsu/catlean/um;
// 3ed: lload 16
// 3ef: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3f2: iload 6
// 3f4: i2b
// 3f5: swap
// 3f6: lload 7
// 3f8: dup2_x1
// 3f9: pop2
// 3fa: checkcast net/minecraft/class_1297
// 3fd: invokevirtual su/catlean/um.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 400: checkcast net/minecraft/class_2374
// 403: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 406: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 409: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 40c: instanceof net/minecraft/class_2404
// 40f: goto 41c
// 412: ldc2_w -6911565865314006560
// 415: lload 1
// 416: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: athrow
// 41c: iload 18
// 41e: lload 1
// 41f: lconst_0
// 420: lcmp
// 421: ifle 473
// 424: ifne 471
// 427: ifeq 48a
// 42a: goto 437
// 42d: ldc2_w -6911565865314006560
// 430: lload 1
// 431: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 436: athrow
// 437: lload 14
// 439: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 43c: getstatic su/catlean/um.E Lsu/catlean/um;
// 43f: lload 16
// 441: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 444: iload 6
// 446: i2b
// 447: swap
// 448: lload 7
// 44a: dup2_x1
// 44b: pop2
// 44c: checkcast net/minecraft/class_1297
// 44f: invokevirtual su/catlean/um.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 452: checkcast net/minecraft/class_2374
// 455: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 458: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 45b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 45e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 461: instanceof net/minecraft/class_2189
// 464: goto 471
// 467: ldc2_w -6911565865314006560
// 46a: lload 1
// 46b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: athrow
// 471: iload 18
// 473: ifne 487
// 476: ifeq 48a
// 479: goto 486
// 47c: ldc2_w -6911565865314006560
// 47f: lload 1
// 480: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 485: athrow
// 486: bipush 1
// 487: goto 48b
// 48a: bipush 0
// 48b: istore 20
// 48d: iload 20
// 48f: iload 18
// 491: ifne 4d2
// 494: ifeq 4d1
// 497: goto 4a4
// 49a: ldc2_w -6911565865314006560
// 49d: lload 1
// 49e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a3: athrow
// 4a4: lload 16
// 4a6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a9: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 4ac: getfield net/minecraft/class_1656.field_7479 Z
// 4af: iload 18
// 4b1: ifne 4d2
// 4b4: goto 4c1
// 4b7: ldc2_w -6911565865314006560
// 4ba: lload 1
// 4bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c0: athrow
// 4c1: ifeq 4d5
// 4c4: goto 4d1
// 4c7: ldc2_w -6911565865314006560
// 4ca: lload 1
// 4cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d0: athrow
// 4d1: bipush 1
// 4d2: goto 4d6
// 4d5: bipush 0
// 4d6: istore 21
// 4d8: lload 16
// 4da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4dd: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 4e0: iload 18
// 4e2: ifne 539
// 4e5: ifne 537
// 4e8: goto 4f5
// 4eb: ldc2_w -6911565865314006560
// 4ee: lload 1
// 4ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: athrow
// 4f5: lload 4
// 4f7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4fa: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 4fd: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 500: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 503: iload 18
// 505: lload 1
// 506: lconst_0
// 507: lcmp
// 508: iflt 53b
// 50b: ifne 539
// 50e: goto 51b
// 511: ldc2_w -6911565865314006560
// 514: lload 1
// 515: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51a: athrow
// 51b: ifne 537
// 51e: goto 52b
// 521: ldc2_w -6911565865314006560
// 524: lload 1
// 525: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52a: athrow
// 52b: bipush 1
// 52c: ireturn
// 52d: ldc2_w -6911565865314006560
// 530: lload 1
// 531: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 536: athrow
// 537: iload 21
// 539: iload 18
// 53b: ifne 55c
// 53e: ifne 55b
// 541: goto 54e
// 544: ldc2_w -6911565865314006560
// 547: lload 1
// 548: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54d: athrow
// 54e: iload 19
// 550: ireturn
// 551: ldc2_w -6911565865314006560
// 554: lload 1
// 555: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55a: athrow
// 55b: bipush 1
// 55c: ireturn
}

static boolean d(long var0, f2 var2, int var3, int var4, Object var5) {
var0 = a ^ var0;
long var6 = var0 ^ 59253218540274L;
int var8 = vm.a<"Å">(-8343776631855254838L, var0);

try {
int var10000 = var4 & 1;
if (var8 != 0) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var2.R(var6, var3);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8322887001213934198L, var0);
}

byte var11 = 0;
return var2.R(var6, var11);
}

private final int V(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f2.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 37118134842787
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 53189202843350
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 111106521636606
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 43279934365660
// 01f: lxor
// 020: dup2
// 021: bipush 56
// 023: lushr
// 024: l2i
// 025: istore 9
// 027: dup2
// 028: bipush 8
// 02a: lshl
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 10
// 031: dup2
// 032: bipush 40
// 034: lshl
// 035: bipush 40
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 1544922332037
// 040: lxor
// 041: lstore 12
// 043: pop2
// 044: ldc2_w 3001924836073953110
// 047: lload 1
// 048: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: istore 14
// 04f: getstatic su/catlean/ul.b Lsu/catlean/ul;
// 052: iload 9
// 054: i2b
// 055: iload 10
// 057: iload 11
// 059: invokevirtual su/catlean/ul.K (BII)Z
// 05c: iload 14
// 05e: ifne 07e
// 061: ifeq 07f
// 064: goto 071
// 067: ldc2_w 3018295456896565270
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: sipush 2520
// 074: ldc2_w 5878585967354093028
// 077: lload 1
// 078: lxor
// 079: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: ireturn
// 07f: lload 12
// 081: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 084: getstatic net/minecraft/class_5134.field_23723 Lnet/minecraft/class_6880;
// 087: invokevirtual net/minecraft/class_746.method_45325 (Lnet/minecraft/class_6880;)D
// 08a: dstore 15
// 08c: fconst_1
// 08d: f2d
// 08e: lload 12
// 090: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 093: getstatic net/minecraft/class_5134.field_23723 Lnet/minecraft/class_6880;
// 096: invokevirtual net/minecraft/class_746.method_45325 (Lnet/minecraft/class_6880;)D
// 099: ddiv
// 09a: sipush 5849
// 09d: ldc2_w 768262728574042855
// 0a0: lload 1
// 0a1: lxor
// 0a2: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: i2d
// 0a8: dmul
// 0a9: d2i
// 0aa: istore 17
// 0ac: iload 17
// 0ae: sipush 313
// 0b1: ldc2_w 8078094554825430274
// 0b4: lload 1
// 0b5: lxor
// 0b6: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: invokestatic java/lang/Math.max (II)I
// 0be: istore 17
// 0c0: dload 15
// 0c2: ldc2_w 4.0
// 0c5: dcmpg
// 0c6: iload 14
// 0c8: ifne 0dc
// 0cb: ifne 0df
// 0ce: goto 0db
// 0d1: ldc2_w 3018295456896565270
// 0d4: lload 1
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: bipush 1
// 0dc: goto 0e0
// 0df: bipush 0
// 0e0: lload 1
// 0e1: lconst_0
// 0e2: lcmp
// 0e3: ifle 1d4
// 0e6: ifne 1c7
// 0e9: ldc2_w 4.4
// 0ec: dload 15
// 0ee: dcmpg
// 0ef: iload 14
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: ifle 12c
// 0f7: ifne 12a
// 0fa: goto 107
// 0fd: ldc2_w 3018295456896565270
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: ifgt 151
// 10a: goto 117
// 10d: ldc2_w 3018295456896565270
// 110: lload 1
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: dload 15
// 119: ldc2_w 4.401
// 11c: dcmpg
// 11d: goto 12a
// 120: ldc2_w 3018295456896565270
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: iload 14
// 12c: ifne 14e
// 12f: ifgt 14d
// 132: goto 13f
// 135: ldc2_w 3018295456896565270
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: goto 152
// 143: ldc2_w 3018295456896565270
// 146: lload 1
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: bipush 0
// 14e: goto 152
// 151: bipush 0
// 152: lload 1
// 153: lconst_0
// 154: lcmp
// 155: ifle 1d4
// 158: ifne 1c7
// 15b: ldc2_w 4.8
// 15e: dload 15
// 160: dcmpg
// 161: iload 14
// 163: lload 1
// 164: lconst_0
// 165: lcmp
// 166: ifle 19e
// 169: ifne 19c
// 16c: goto 179
// 16f: ldc2_w 3018295456896565270
// 172: lload 1
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: ifgt 1c3
// 17c: goto 189
// 17f: ldc2_w 3018295456896565270
// 182: lload 1
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: dload 15
// 18b: ldc2_w 4.801
// 18e: dcmpg
// 18f: goto 19c
// 192: ldc2_w 3018295456896565270
// 195: lload 1
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: iload 14
// 19e: ifne 1c0
// 1a1: ifgt 1bf
// 1a4: goto 1b1
// 1a7: ldc2_w 3018295456896565270
// 1aa: lload 1
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: bipush 1
// 1b2: goto 1c4
// 1b5: ldc2_w 3018295456896565270
// 1b8: lload 1
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: bipush 0
// 1c0: goto 1c4
// 1c3: bipush 0
// 1c4: ifeq 1d6
// 1c7: sipush 313
// 1ca: ldc2_w 8078094554825430274
// 1cd: lload 1
// 1ce: lxor
// 1cf: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: istore 17
// 1d6: getstatic su/catlean/um.E Lsu/catlean/um;
// 1d9: lload 5
// 1db: invokevirtual su/catlean/um.Z (J)Z
// 1de: iload 14
// 1e0: ifne 269
// 1e3: ifeq 261
// 1e6: goto 1f3
// 1e9: ldc2_w 3018295456896565270
// 1ec: lload 1
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: lload 3
// 1f4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1f7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1fa: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1fd: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 200: iload 14
// 202: ifne 269
// 205: goto 212
// 208: ldc2_w 3018295456896565270
// 20b: lload 1
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: ifne 261
// 215: goto 222
// 218: ldc2_w 3018295456896565270
// 21b: lload 1
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: lload 12
// 224: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 227: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 22a: iload 14
// 22c: lload 1
// 22d: lconst_0
// 22e: lcmp
// 22f: iflt 26b
// 232: ifne 269
// 235: goto 242
// 238: ldc2_w 3018295456896565270
// 23b: lload 1
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: ifeq 261
// 245: goto 252
// 248: ldc2_w 3018295456896565270
// 24b: lload 1
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: sipush 31019
// 255: ldc2_w 6405919572055026971
// 258: lload 1
// 259: lxor
// 25a: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: istore 17
// 261: lload 12
// 263: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 266: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 269: iload 14
// 26b: lload 1
// 26c: lconst_0
// 26d: lcmp
// 26e: ifle 2a0
// 271: ifne 29e
// 274: ifeq 2b7
// 277: goto 284
// 27a: ldc2_w 3018295456896565270
// 27d: lload 1
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: lload 3
// 285: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 288: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 28b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 28e: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 291: goto 29e
// 294: ldc2_w 3018295456896565270
// 297: lload 1
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: iload 14
// 2a0: ifne 2b4
// 2a3: ifne 2b7
// 2a6: goto 2b3
// 2a9: ldc2_w 3018295456896565270
// 2ac: lload 1
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: bipush 1
// 2b4: goto 2b8
// 2b7: bipush 2
// 2b8: istore 18
// 2ba: getstatic su/catlean/um.E Lsu/catlean/um;
// 2bd: lload 7
// 2bf: invokevirtual su/catlean/um.BH (J)Lsu/catlean/nl;
// 2c2: getstatic su/catlean/gm.Y [I
// 2c5: swap
// 2c6: invokevirtual su/catlean/nl.ordinal ()I
// 2c9: iaload
// 2ca: iload 14
// 2cc: lload 1
// 2cd: lconst_0
// 2ce: lcmp
// 2cf: iflt 316
// 2d2: ifne 314
// 2d5: tableswitch 357 1 2 33 114
// 2ec: ldc2_w 3018295456896565270
// 2ef: lload 1
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: getstatic su/catlean/f2.c I
// 2f9: sipush 31748
// 2fc: ldc2_w 2546318840405780540
// 2ff: lload 1
// 300: lxor
// 301: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: irem
// 307: goto 314
// 30a: ldc2_w 3018295456896565270
// 30d: lload 1
// 30e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: athrow
// 314: iload 14
// 316: lload 1
// 317: lconst_0
// 318: lcmp
// 319: ifle 320
// 31c: ifne 344
// 31f: bipush 3
// 320: if_icmpne 342
// 323: goto 330
// 326: ldc2_w 3018295456896565270
// 329: lload 1
// 32a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32f: athrow
// 330: iload 17
// 332: iload 18
// 334: iadd
// 335: goto 43c
// 338: ldc2_w 3018295456896565270
// 33b: lload 1
// 33c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: athrow
// 342: iload 17
// 344: goto 43c
// 347: getstatic su/catlean/f2.c I
// 34a: bipush 5
// 34b: irem
// 34c: iload 14
// 34e: lload 1
// 34f: lconst_0
// 350: lcmp
// 351: ifle 409
// 354: ifne 407
// 357: ifne 3f6
// 35a: goto 367
// 35d: ldc2_w 3018295456896565270
// 360: lload 1
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: lload 12
// 369: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 36c: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 36f: iload 14
// 371: ifne 3f3
// 374: goto 381
// 377: ldc2_w 3018295456896565270
// 37a: lload 1
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: lload 1
// 382: lconst_0
// 383: lcmp
// 384: ifle 3e9
// 387: ifeq 3e6
// 38a: goto 397
// 38d: ldc2_w 3018295456896565270
// 390: lload 1
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: lload 3
// 398: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 39b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 39e: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 3a1: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 3a4: iload 14
// 3a6: ifne 3f3
// 3a9: goto 3b6
// 3ac: ldc2_w 3018295456896565270
// 3af: lload 1
// 3b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b5: athrow
// 3b6: lload 1
// 3b7: lconst_0
// 3b8: lcmp
// 3b9: ifle 3e9
// 3bc: ifne 3e6
// 3bf: goto 3cc
// 3c2: ldc2_w 3018295456896565270
// 3c5: lload 1
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: sipush 10488
// 3cf: ldc2_w 8649573201173527745
// 3d2: lload 1
// 3d3: lxor
// 3d4: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: goto 43c
// 3dc: ldc2_w 3018295456896565270
// 3df: lload 1
// 3e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e5: athrow
// 3e6: sipush 16632
// 3e9: ldc2_w 1671373144471524549
// 3ec: lload 1
// 3ed: lxor
// 3ee: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f3: goto 43c
// 3f6: getstatic su/catlean/f2.c I
// 3f9: sipush 18576
// 3fc: ldc2_w 2237728272986168490
// 3ff: lload 1
// 400: lxor
// 401: invokedynamic k (IJ)I bsm=su/catlean/f2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 406: irem
// 407: iload 14
// 409: lload 1
// 40a: lconst_0
// 40b: lcmp
// 40c: iflt 413
// 40f: ifne 437
// 412: bipush 3
// 413: if_icmpne 435
// 416: goto 423
// 419: ldc2_w 3018295456896565270
// 41c: lload 1
// 41d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 422: athrow
// 423: iload 17
// 425: iload 18
// 427: iadd
// 428: goto 43c
// 42b: ldc2_w 3018295456896565270
// 42e: lload 1
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: iload 17
// 437: goto 43c
// 43a: iload 17
// 43c: ireturn
}

static {
long var14 = a ^ 140679782591647L;
if (vm.a<"Å">(4270971079761544635L, var14) != 0) {
vm.a<"Å">(22, 4268648345091553184L, var14);
}

Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var14 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var13 = var11.doFinal("»Æäß³\u0005°<\u009bÒÜì\u0091ûå&".getBytes("ISO-8859-1"));
String var22 = a(var13).intern();
int var10001 = -1;
d = var22;
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "\u009d¿É\u0011¤\u00138õÑ)rXW\u0080mmhü\u00811Sz0]¤\u0084\u0095Ó\u008a¯í-_\u000e¼onâõ|Ï\u0019;\u0087g 3oïÎ\u0099¦Z\u0091<!";
int var5 = "\u009d¿É\u0011¤\u00138õÑ)rXW\u0080mmhü\u00811Sz0]¤\u0084\u0095Ó\u008a¯í-_\u000e¼onâõ|Ï\u0019;\u0087g 3oïÎ\u0099¦Z\u0091<!".length();
byte var2 = 0;

label33:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var18 = var6;
var10001 = var3++;
long var24 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var27 = -1;

while (true) {
long var8 = var24;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var29 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var27) {
case 0:
var18[var10001] = var29;
if (var2 >= var5) {
e = var6;
f = new Integer[9];
p = new f2();
return;
}
break;
default:
var18[var10001] = var29;
if (var2 < var5) {
continue label33;
}

var4 = "_{§E\u0083}Ü\tÙ\u0084â\u0097¡¤¿\t";
var5 = "_{§E\u0083}Ü\tÙ\u0084â\u0097¡¤¿\t".length();
var2 = 0;
}

byte var21 = var2;
var2 += 8;
var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
var18 = var6;
var10001 = var3++;
var24 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var27 = 0;
}
}
}

public static void y(int var0) {
U = var0;
}

public static int L() {
return U;
}

public static int N() {
int var0 = L();

try {
return var0 == 0 ? 37 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15570;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/f2", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/f2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
