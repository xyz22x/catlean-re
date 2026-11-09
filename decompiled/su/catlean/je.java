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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class je {
private long H;
private int A;
@NotNull
private class_243 P;
private boolean g;
private double k;
private static final long a = yz.a(7108756093035470062L, -3097520588444956872L, MethodHandles.lookup().lookupClass()).a(214777698122585L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;
private static final long i;

public je(long time, long a, int attempts, @NotNull class_243 pos, boolean place) {
ax = a ^ ax;
long var8 = ax ^ 47647526489764L;
Intrinsics.checkNotNullParameter(pos, a<"j">(25275, 5903288282129900223L ^ ax));
super();
this.H = time;
this.A = attempts;
this.P = pos;
this.g = place;
this.k = zf.v(var8).method_5707(this.P);
}

public final long J() {
return this.H;
}

public final void R(long <set-?>) {
this.H = <set-?>;
}

@NotNull
public final class_243 F() {
return this.P;
}

public final void P(long a, @NotNull class_243 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"j">(12603, 7614930785558027459L ^ ax));
this.P = <set-?>;
}

public final boolean r() {
return this.g;
}

public final void N(boolean <set-?>) {
this.g = <set-?>;
}

public final double K() {
return this.k;
}

public final void e(double <set-?>) {
this.k = <set-?>;
}

public final boolean f(int param1, short param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/je.a J
// 1a: lxor
// 1b: lstore 4
// 1d: lload 4
// 1f: dup2
// 20: ldc2_w 53975654488282
// 23: lxor
// 24: lstore 6
// 26: dup2
// 27: ldc2_w 66290904009514
// 2a: lxor
// 2b: lstore 8
// 2d: pop2
// 2e: ldc2_w -2778142033261685392
// 31: lload 4
// 33: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: astore 10
// 3a: aload 0
// 3b: getfield su/catlean/je.k D
// 3e: lload 8
// 40: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43: aload 0
// 44: getfield su/catlean/je.P Lnet/minecraft/class_243;
// 47: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 4a: dsub
// 4b: invokestatic java/lang/Math.abs (D)D
// 4e: aload 0
// 4f: lload 6
// 51: invokevirtual su/catlean/je.N (J)Z
// 54: ifeq 66
// 57: fconst_1
// 58: goto 68
// 5b: ldc2_w -2788533048140807412
// 5e: lload 4
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: ldc 10.0
// 68: f2d
// 69: dcmpl
// 6a: aload 10
// 6c: ifnull b1
// 6f: ifge b0
// 72: goto 80
// 75: ldc2_w -2788533048140807412
// 78: lload 4
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: invokestatic su/catlean/zf.A ()J
// 83: aload 0
// 84: getfield su/catlean/je.H J
// 87: lsub
// 88: getstatic su/catlean/je.i J
// 8b: lcmp
// 8c: aload 10
// 8e: ifnull b1
// 91: goto 9f
// 94: ldc2_w -2788533048140807412
// 97: lload 4
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: ifle b4
// a2: goto b0
// a5: ldc2_w -2788533048140807412
// a8: lload 4
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: bipush 1
// b1: goto b5
// b4: bipush 0
// b5: ireturn
}

public final void t(int param1, long param2) {
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
// 005: lload 2
// 006: bipush 32
// 008: lshl
// 009: bipush 32
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/je.a J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 103008484026807
// 019: lxor
// 01a: lstore 6
// 01c: dup2
// 01d: ldc2_w 30796307672771
// 020: lxor
// 021: lstore 8
// 023: dup2
// 024: ldc2_w 72858877051844
// 027: lxor
// 028: dup2
// 029: bipush 32
// 02b: lushr
// 02c: l2i
// 02d: istore 10
// 02f: dup2
// 030: bipush 32
// 032: lshl
// 033: bipush 48
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 48
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: pop2
// 044: pop2
// 045: ldc2_w 3416863909281784681
// 048: lload 4
// 04a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: aload 0
// 050: getfield su/catlean/je.A I
// 053: istore 14
// 055: astore 13
// 057: aload 0
// 058: iload 14
// 05a: bipush 1
// 05b: iadd
// 05c: putfield su/catlean/je.A I
// 05f: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 062: iload 10
// 064: iload 11
// 066: i2s
// 067: iload 12
// 069: invokevirtual su/catlean/ux.NG (ISI)Z
// 06c: aload 13
// 06e: ifnull 096
// 071: ifeq 109
// 074: goto 082
// 077: ldc2_w 3410367185685427477
// 07a: lload 4
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: aload 0
// 083: lload 8
// 085: invokevirtual su/catlean/je.N (J)Z
// 088: goto 096
// 08b: ldc2_w 3410367185685427477
// 08e: lload 4
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: ifeq 109
// 099: getstatic su/catlean/ad.x Lsu/catlean/ad;
// 09c: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 09f: aload 0
// 0a0: getfield su/catlean/je.g Z
// 0a3: iload 1
// 0a4: iflt 0d7
// 0a7: ifeq 0d4
// 0aa: goto 0b8
// 0ad: ldc2_w 3410367185685427477
// 0b0: lload 4
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: sipush 21904
// 0bb: ldc2_w 2232892895075591682
// 0be: lload 4
// 0c0: lxor
// 0c1: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/je.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: goto 0e2
// 0c9: ldc2_w 3410367185685427477
// 0cc: lload 4
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: sipush 27880
// 0d7: ldc2_w 7470513254175498104
// 0da: lload 4
// 0dc: lxor
// 0dd: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/je.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: sipush 15048
// 0e5: ldc2_w 6648986912015681884
// 0e8: lload 4
// 0ea: lxor
// 0eb: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/je.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: swap
// 0f1: sipush 6578
// 0f4: ldc2_w 2147598829556050472
// 0f7: lload 4
// 0f9: lxor
// 0fa: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/je.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 104: lload 6
// 106: invokevirtual su/catlean/ad.a (Ljava/lang/String;J)V
// 109: return
}

public final boolean N(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/je.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 75566908456931
// 0b: lxor
// 0c: dup2
// 0d: bipush 16
// 0f: lushr
// 10: lstore 3
// 11: dup2
// 12: bipush 48
// 14: lshl
// 15: bipush 48
// 17: lushr
// 18: l2i
// 19: istore 5
// 1b: pop2
// 1c: pop2
// 1d: ldc2_w 7442053371658087237
// 20: lload 1
// 21: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: astore 6
// 28: aload 0
// 29: getfield su/catlean/je.A I
// 2c: aload 6
// 2e: ifnull 6a
// 31: bipush 5
// 32: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 35: aconst_null
// 36: lload 3
// 37: bipush 1
// 38: iload 5
// 3a: i2c
// 3b: aconst_null
// 3c: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 3f: i2f
// 40: ldc 25.0
// 42: fdiv
// 43: f2d
// 44: invokestatic java/lang/Math.ceil (D)D
// 47: d2f
// 48: f2i
// 49: invokestatic java/lang/Math.max (II)I
// 4c: if_icmplt 6d
// 4f: goto 5c
// 52: ldc2_w 7455798660565564729
// 55: lload 1
// 56: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: athrow
// 5c: bipush 1
// 5d: goto 6a
// 60: ldc2_w 7455798660565564729
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: goto 6e
// 6d: bipush 0
// 6e: ireturn
}

public final long P() {
return this.H;
}

private final int X() {
return this.A;
}

@NotNull
public final class_243 Q() {
return this.P;
}

public final boolean H() {
return this.g;
}

@NotNull
public final je B(long time, int attempts, int a, long a, @NotNull class_243 pos, boolean place) {
long var9 = ((long)axx << 32 | ax << 32 >>> 32) ^ a;
long var11 = var9 ^ 80018834664613L;
Intrinsics.checkNotNullParameter(pos, a<"j">(26575, 4506778965428301187L ^ var9));
return new je(time, var11, attempts, pos, place);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 5786748831296L;
boolean var3 = this.g;
class_243 var4 = this.P;
int var5 = this.A;
long var6 = this.H;
return a<"j">(19483, 4752092215206670718L ^ var1)
+ var6
+ a<"j">(14606, 7775970092422792292L ^ var1)
+ var5
+ a<"j">(6319, 2858450963992978889L ^ var1)
+ var4
+ a<"j">(31828, 1120437890636562748L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 31281249414718L;
int var3 = Long.hashCode(this.H);
var3 = var3 * b<"t">(3620, 2599097106430503377L ^ var1) + Integer.hashCode(this.A);
var3 = var3 * b<"t">(29264, 9214308866956219815L ^ var1) + this.P.hashCode();
return var3 * b<"t">(29264, 9214308866956219815L ^ var1) + Boolean.hashCode(this.g);
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
// 000: getstatic su/catlean/je.a J
// 003: ldc2_w 10522311915807
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 2217817916129530565
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 2231648898150007993
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 2231648898150007993
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/je
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 2231648898150007993
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 2231648898150007993
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/je
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/je.H J
// 065: aload 5
// 067: getfield su/catlean/je.H J
// 06a: lcmp
// 06b: aload 4
// 06d: ifnull 090
// 070: ifeq 08c
// 073: goto 080
// 076: ldc2_w 2231648898150007993
// 079: lload 2
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: bipush 0
// 081: ireturn
// 082: ldc2_w 2231648898150007993
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: aload 0
// 08d: getfield su/catlean/je.A I
// 090: aload 4
// 092: ifnull 0c2
// 095: aload 5
// 097: getfield su/catlean/je.A I
// 09a: if_icmpeq 0b6
// 09d: goto 0aa
// 0a0: ldc2_w 2231648898150007993
// 0a3: lload 2
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: bipush 0
// 0ab: ireturn
// 0ac: ldc2_w 2231648898150007993
// 0af: lload 2
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 0
// 0b7: getfield su/catlean/je.P Lnet/minecraft/class_243;
// 0ba: aload 5
// 0bc: getfield su/catlean/je.P Lnet/minecraft/class_243;
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c2: aload 4
// 0c4: ifnull 0e7
// 0c7: ifne 0e3
// 0ca: goto 0d7
// 0cd: ldc2_w 2231648898150007993
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: bipush 0
// 0d8: ireturn
// 0d9: ldc2_w 2231648898150007993
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: aload 0
// 0e4: getfield su/catlean/je.g Z
// 0e7: aload 4
// 0e9: ifnull 10e
// 0ec: aload 5
// 0ee: getfield su/catlean/je.g Z
// 0f1: if_icmpeq 10d
// 0f4: goto 101
// 0f7: ldc2_w 2231648898150007993
// 0fa: lload 2
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: bipush 0
// 102: ireturn
// 103: ldc2_w 2231648898150007993
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: bipush 1
// 10e: ireturn
}

static {
long var16 = a ^ 69379942212268L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[11];
int var23 = 0;
String var22 = ".÷^2dÕEy¨2\u001a\u0011\u0093¦ó4\u00109¯M\u000eW\u008eßÍ\u0001é\u0019jÀ\u0085\u001fc\u0010\u0017G\u0083f\b\u0003f\u0095Z¬Y¹ùú\u008fÒ\u0010ç;%½\fÝÄÅ\u0085î0íWòÑW\u0010ð1ã]Dªp9ó\u0099ö\u0016¿)ïÜ\u00184ã.º\u0083£\u009cÜ\u0089³ÛË¸õÀ4\u009cÅ ^\u0081\u009f¯7\u0010ó]`*åÉaþ\u0091\u0098p\u0091\u008cÅ¿H8¾\nq;ËQ\u0017\u009e\u0015Ìöå£Ø}_¬9äÀÜé\u008b¡õbôf\u008eu\u0093\u0098O\u0010»Å\u0006·Àó8\u008f\u0092!ä8¿[\u0090\u0018\u0094|a\r\\»\u0018\u008cÉ\u0010Í²ú\u0007ìX*®\\ã\n\u001b\u0012ú¯Pv\u0092µ¥*";
int var24 = ".÷^2dÕEy¨2\u001a\u0011\u0093¦ó4\u00109¯M\u000eW\u008eßÍ\u0001é\u0019jÀ\u0085\u001fc\u0010\u0017G\u0083f\b\u0003f\u0095Z¬Y¹ùú\u008fÒ\u0010ç;%½\fÝÄÅ\u0085î0íWòÑW\u0010ð1ã]Dªp9ó\u0099ö\u0016¿)ïÜ\u00184ã.º\u0083£\u009cÜ\u0089³ÛË¸õÀ4\u009cÅ ^\u0081\u009f¯7\u0010ó]`*åÉaþ\u0091\u0098p\u0091\u008cÅ¿H8¾\nq;ËQ\u0017\u009e\u0015Ìöå£Ø}_¬9äÀÜé\u008b¡õbôf\u008eu\u0093\u0098O\u0010»Å\u0006·Àó8\u008f\u0092!ä8¿[\u0090\u0018\u0094|a\r\\»\u0018\u008cÉ\u0010Í²ú\u0007ìX*®\\ã\n\u001b\u0012ú¯Pv\u0092µ¥*"
.length();
char var21 = 16;
int var28 = -1;

label56:
while (true) {
String var29 = var22.substring(++var28, var28 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var40;
if ((var28 += var21) >= var24) {
b = var25;
c = new String[11];
h = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[3];
int var8 = 0;
String var9 = "\u001a#7Ù\u0091E\u000bþ\u008d%~\u0002Öþ.Ð\u0082ä\u008c\u007fFÿ=A";
int var10 = "\u001a#7Ù\u0091E\u000bþ\u008d%~\u0002Öþ.Ð\u0082ä\u008c\u007fFÿ=A".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
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
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var47 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

e = var11;
f = new Integer[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 3080628059373715909L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var45 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var38 = -1;
i = var45;
return;
}

var21 = var22.charAt(var28);
break;
default:
var25[var23++] = var40;
if ((var28 += var21) < var24) {
var21 = var22.charAt(var28);
continue label56;
}

var22 = "ý Ú\u0000ñú¨¦\u001a\u0085óÌNý\u0091ûJÀ\u0094vÞc|Y\u0014³\u0019\u009b'P\u0087\u0088¬1\u009e\u0012,í¿¨ÿ²\u001fÀc§\u0013\n \u0096µïØ³æb+tSê\u0013#ìþ£{Îûøn\u001bI¿§Å\u001ah\u001e@Þ\u001a";
var24 = "ý Ú\u0000ñú¨¦\u001a\u0085óÌNý\u0091ûJÀ\u0094vÞc|Y\u0014³\u0019\u009b'P\u0087\u0088¬1\u009e\u0012,í¿¨ÿ²\u001fÀc§\u0013\n \u0096µïØ³æb+tSê\u0013#ìþ£{Îûøn\u001bI¿§Å\u001ah\u001e@Þ\u001a"
.length();
var21 = '0';
var28 = -1;
}

var29 = var22.substring(++var28, var28 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7631;
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
throw new RuntimeException("su/catlean/je", var10);
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
throw new RuntimeException("su/catlean/je" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12068;
if (f[var3] == null) {
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
throw new RuntimeException("su/catlean/je", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/je" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
