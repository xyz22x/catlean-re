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
import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.KeyMappingAccessor;

public final class ja implements b4 {
@NotNull
public static final ja E;
private static boolean e;
private static boolean k;
private static final long a = yz.a(-1107915982818841974L, -1462049736569999676L, MethodHandles.lookup().lookupClass()).a(108566854776481L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long f;

private ja() {
}

public final boolean w() {
return k;
}

public final void f(boolean <set-?>) {
k = <set-?>;
}

@Override
public void Q(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
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
// 00d: lstore 4
// 00f: lload 4
// 011: dup2
// 012: ldc2_w 118634436058407
// 015: lxor
// 016: lstore 6
// 018: dup2
// 019: ldc2_w 82055159719698
// 01c: lxor
// 01d: lstore 8
// 01f: dup2
// 020: ldc2_w 53672989956210
// 023: lxor
// 024: lstore 10
// 026: dup2
// 027: ldc2_w 16782221287606
// 02a: lxor
// 02b: lstore 12
// 02d: pop2
// 02e: ldc2_w 8258463305824275557
// 031: lload 4
// 033: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: istore 14
// 03a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 03d: invokevirtual su/catlean/dm.J ()Z
// 040: iload 14
// 042: ifne 06c
// 045: ifeq 086
// 048: goto 056
// 04b: ldc2_w 8224733489207716496
// 04e: lload 4
// 050: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: athrow
// 056: lload 12
// 058: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05b: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 05e: goto 06c
// 061: ldc2_w 8224733489207716496
// 064: lload 4
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: iload 14
// 06e: ifne 083
// 071: ifne 086
// 074: goto 082
// 077: ldc2_w 8224733489207716496
// 07a: lload 4
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 1
// 083: goto 087
// 086: bipush 0
// 087: istore 15
// 089: iload 15
// 08b: iload 14
// 08d: ifne 0ce
// 090: ifeq 170
// 093: goto 0a1
// 096: ldc2_w 8224733489207716496
// 099: lload 4
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: getstatic su/catlean/um.E Lsu/catlean/um;
// 0a4: iload 1
// 0a5: iflt 0d4
// 0a8: iload 14
// 0aa: ifne 0d4
// 0ad: goto 0bb
// 0b0: ldc2_w 8224733489207716496
// 0b3: lload 4
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: lload 6
// 0bd: invokevirtual su/catlean/um.T (J)Z
// 0c0: goto 0ce
// 0c3: ldc2_w 8224733489207716496
// 0c6: lload 4
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: ifne 170
// 0d1: getstatic su/catlean/um.E Lsu/catlean/um;
// 0d4: lload 10
// 0d6: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 0d9: getstatic su/catlean/lb.NORMAL Lsu/catlean/lb;
// 0dc: lload 2
// 0dd: lconst_0
// 0de: lcmp
// 0df: ifle 111
// 0e2: iload 14
// 0e4: ifne 111
// 0e7: if_acmpeq 114
// 0ea: goto 0f8
// 0ed: ldc2_w 8224733489207716496
// 0f0: lload 4
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: getstatic su/catlean/um.E Lsu/catlean/um;
// 0fb: lload 10
// 0fd: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 100: getstatic su/catlean/lb.HVH Lsu/catlean/lb;
// 103: goto 111
// 106: ldc2_w 8224733489207716496
// 109: lload 4
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: if_acmpne 170
// 114: lload 12
// 116: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 119: lload 2
// 11a: lconst_0
// 11b: lcmp
// 11c: ifle 14f
// 11f: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 122: iload 14
// 124: ifne 147
// 127: goto 135
// 12a: ldc2_w 8224733489207716496
// 12d: lload 4
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: ifne 170
// 138: goto 146
// 13b: ldc2_w 8224733489207716496
// 13e: lload 4
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: bipush 1
// 147: putstatic su/catlean/ja.e Z
// 14a: lload 12
// 14c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14f: bipush 0
// 150: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 153: lload 8
// 155: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 158: new net/minecraft/class_2848
// 15b: dup
// 15c: lload 12
// 15e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 161: checkcast net/minecraft/class_1297
// 164: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 167: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 16a: checkcast net/minecraft/class_2596
// 16d: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
// 170: return
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
// 01d: ldc2_w 82911683487590
// 020: lxor
// 021: dup2
// 022: bipush 32
// 024: lushr
// 025: lstore 7
// 027: dup2
// 028: bipush 32
// 02a: lshl
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 9
// 031: pop2
// 032: dup2
// 033: ldc2_w 115964598551774
// 036: lxor
// 037: lstore 10
// 039: dup2
// 03a: ldc2_w 51433702095905
// 03d: lxor
// 03e: lstore 12
// 040: dup2
// 041: ldc2_w 13460627852636
// 044: lxor
// 045: lstore 14
// 047: dup2
// 048: ldc2_w 130078601425468
// 04b: lxor
// 04c: lstore 16
// 04e: dup2
// 04f: ldc2_w 81216036539128
// 052: lxor
// 053: lstore 18
// 055: pop2
// 056: ldc2_w -2859712109970658601
// 059: lload 5
// 05b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: aload 1
// 061: sipush 23435
// 064: ldc2_w 4173186407438872847
// 067: lload 5
// 069: lxor
// 06a: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ja.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 072: istore 20
// 074: getstatic su/catlean/ja.e Z
// 077: iload 20
// 079: ifeq 0c6
// 07c: ifeq 0c5
// 07f: goto 08d
// 082: ldc2_w -2852369459418988322
// 085: lload 5
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: lload 18
// 08f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 092: bipush 1
// 093: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 096: lload 14
// 098: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 09b: new net/minecraft/class_2848
// 09e: dup
// 09f: lload 18
// 0a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a4: checkcast net/minecraft/class_1297
// 0a7: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 0aa: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 0ad: checkcast net/minecraft/class_2596
// 0b0: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
// 0b3: bipush 0
// 0b4: putstatic su/catlean/ja.e Z
// 0b7: goto 0c5
// 0ba: ldc2_w -2852369459418988322
// 0bd: lload 5
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: bipush 0
// 0c6: putstatic su/catlean/ja.k Z
// 0c9: getstatic su/catlean/um.E Lsu/catlean/um;
// 0cc: lload 16
// 0ce: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 0d1: getstatic su/catlean/lb.LEGIT_EXTRA Lsu/catlean/lb;
// 0d4: iload 20
// 0d6: ifeq 159
// 0d9: if_acmpeq 140
// 0dc: goto 0ea
// 0df: ldc2_w -2852369459418988322
// 0e2: lload 5
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: getstatic su/catlean/um.E Lsu/catlean/um;
// 0ed: lload 16
// 0ef: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 0f2: getstatic su/catlean/lb.LEGIT Lsu/catlean/lb;
// 0f5: iload 3
// 0f6: ifle 159
// 0f9: iload 20
// 0fb: ifeq 159
// 0fe: goto 10c
// 101: ldc2_w -2852369459418988322
// 104: lload 5
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: iload 4
// 10e: iflt 14b
// 111: if_acmpeq 140
// 114: goto 122
// 117: ldc2_w -2852369459418988322
// 11a: lload 5
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: iload 4
// 124: iflt 1ad
// 127: aload 0
// 128: lload 7
// 12a: iload 9
// 12c: invokevirtual su/catlean/ja.Z (JI)Z
// 12f: ifeq 1ad
// 132: goto 140
// 135: ldc2_w -2852369459418988322
// 138: lload 5
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: getstatic su/catlean/um.E Lsu/catlean/um;
// 143: lload 16
// 145: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 148: getstatic su/catlean/lb.LEGIT_EXTRA Lsu/catlean/lb;
// 14b: goto 159
// 14e: ldc2_w -2852369459418988322
// 151: lload 5
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: if_acmpne 172
// 15c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 15f: lload 12
// 161: invokevirtual su/catlean/dm.F (J)V
// 164: goto 172
// 167: ldc2_w -2852369459418988322
// 16a: lload 5
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: lload 18
// 174: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 177: lload 10
// 179: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 17c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 17f: lload 10
// 181: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 184: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 187: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 18a: dup
// 18b: sipush 11590
// 18e: ldc2_w 6711875497808299969
// 191: lload 5
// 193: lxor
// 194: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ja.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 19c: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 19f: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 1a4: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 1a7: invokestatic net/minecraft/class_3675.method_15987 (Lnet/minecraft/class_1041;I)Z
// 1aa: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 1ad: iload 2
// 1ae: iflt 1cd
// 1b1: ldc2_w -2826320950094477737
// 1b4: lload 5
// 1b6: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: ifnull 1db
// 1be: iinc 20 1
// 1c1: iload 20
// 1c3: ldc2_w -2833482568319413200
// 1c6: lload 5
// 1c8: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: goto 1db
// 1d0: ldc2_w -2852369459418988322
// 1d3: lload 5
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: return
}

@Override
public void n(long var1) {
}

public final void i(boolean hvh, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ja.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 57301642754599
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 7497032961441142516
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: istore 6
// 1a: iload 1
// 1b: iload 6
// 1d: ifne 57
// 20: ifeq 9e
// 23: goto 30
// 26: ldc2_w 7544977255796387841
// 29: lload 2
// 2a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: athrow
// 30: lload 4
// 32: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 35: iload 6
// 37: ifne 6c
// 3a: goto 47
// 3d: ldc2_w 7544977255796387841
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 4a: goto 57
// 4d: ldc2_w 7544977255796387841
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: ifne 9e
// 5a: lload 4
// 5c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5f: goto 6c
// 62: ldc2_w 7544977255796387841
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: astore 7
// 6e: bipush 0
// 6f: istore 8
// 71: aload 7
// 73: aload 7
// 75: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 78: getfield net/minecraft/class_243.field_1352 D
// 7b: ldc2_w 0.6
// 7e: ddiv
// 7f: aload 7
// 81: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 84: getfield net/minecraft/class_243.field_1351 D
// 87: aload 7
// 89: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 8c: getfield net/minecraft/class_243.field_1350 D
// 8f: ldc2_w 0.6
// 92: ddiv
// 93: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 96: aload 7
// 98: bipush 1
// 99: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 9c: nop
// 9d: nop
// 9e: return
}

public final boolean Z(long param1, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 32
// 03: lshl
// 04: iload 3
// 05: i2l
// 06: bipush 32
// 08: lshl
// 09: bipush 32
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/ja.a J
// 10: lxor
// 11: lstore 4
// 13: lload 4
// 15: dup2
// 16: ldc2_w 81098665412156
// 19: lxor
// 1a: lstore 6
// 1c: dup2
// 1d: ldc2_w 13286452611536
// 20: lxor
// 21: lstore 8
// 23: pop2
// 24: ldc2_w -1655875206967993470
// 27: lload 4
// 29: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: istore 10
// 30: getstatic su/catlean/um.E Lsu/catlean/um;
// 33: lload 6
// 35: invokevirtual su/catlean/um.T (J)Z
// 38: iload 10
// 3a: ifeq 64
// 3d: ifeq 93
// 40: goto 4e
// 43: ldc2_w -1639523913917288053
// 46: lload 4
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: getstatic su/catlean/tc.s Lsu/catlean/tc;
// 51: lload 8
// 53: invokevirtual su/catlean/tc.I (J)I
// 56: goto 64
// 59: ldc2_w -1639523913917288053
// 5c: lload 4
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: iload 10
// 66: lload 1
// 67: lconst_0
// 68: lcmp
// 69: ifle 70
// 6c: ifeq 90
// 6f: bipush -1
// 70: if_icmpeq 93
// 73: goto 81
// 76: ldc2_w -1639523913917288053
// 79: lload 4
// 7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80: athrow
// 81: bipush 1
// 82: goto 90
// 85: ldc2_w -1639523913917288053
// 88: lload 4
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: goto 94
// 93: bipush 0
// 94: ireturn
}

public final boolean J(boolean can, int a, short a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/ja.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 108546950706874
// 024: lxor
// 025: dup2
// 026: bipush 32
// 028: lushr
// 029: lstore 7
// 02b: dup2
// 02c: bipush 32
// 02e: lshl
// 02f: bipush 32
// 031: lushr
// 032: l2i
// 033: istore 9
// 035: pop2
// 036: dup2
// 037: ldc2_w 71096534897922
// 03a: lxor
// 03b: lstore 10
// 03d: dup2
// 03e: ldc2_w 55103972130089
// 041: lxor
// 042: lstore 12
// 044: dup2
// 045: ldc2_w 126468313953150
// 048: lxor
// 049: lstore 14
// 04b: dup2
// 04c: ldc2_w 82964733256639
// 04f: lxor
// 050: lstore 16
// 052: dup2
// 053: ldc2_w 105137172751328
// 056: lxor
// 057: lstore 18
// 059: dup2
// 05a: ldc2_w 129548065730241
// 05d: lxor
// 05e: lstore 20
// 060: dup2
// 061: ldc2_w 105608850381604
// 064: lxor
// 065: lstore 22
// 067: pop2
// 068: ldc2_w -3923643331471344885
// 06b: lload 5
// 06d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: iload 1
// 073: istore 25
// 075: istore 24
// 077: getstatic su/catlean/um.E Lsu/catlean/um;
// 07a: lload 18
// 07c: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 07f: getstatic su/catlean/lb.LEGIT_EXTRA Lsu/catlean/lb;
// 082: if_acmpne 094
// 085: bipush 1
// 086: goto 095
// 089: ldc2_w -3911815223167053566
// 08c: lload 5
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: bipush 0
// 095: istore 26
// 097: getstatic su/catlean/f2.p Lsu/catlean/f2;
// 09a: lload 14
// 09c: bipush 1
// 09d: invokevirtual su/catlean/f2.b (JI)Z
// 0a0: iload 24
// 0a2: ifeq 27e
// 0a5: ifeq 27c
// 0a8: goto 0b6
// 0ab: ldc2_w -3911815223167053566
// 0ae: lload 5
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: lload 22
// 0b8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bb: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 0be: getfield net/minecraft/class_243.field_1351 D
// 0c1: ldc2_w -0.07
// 0c4: dcmpg
// 0c5: iload 24
// 0c7: ifeq 27e
// 0ca: goto 0d8
// 0cd: ldc2_w -3911815223167053566
// 0d0: lload 5
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: ifge 27c
// 0db: goto 0e9
// 0de: ldc2_w -3911815223167053566
// 0e1: lload 5
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: lload 22
// 0eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ee: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 0f1: iload 24
// 0f3: iload 4
// 0f5: ifle 132
// 0f8: ifeq 130
// 0fb: goto 109
// 0fe: ldc2_w -3911815223167053566
// 101: lload 5
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: ifne 178
// 10c: goto 11a
// 10f: ldc2_w -3911815223167053566
// 112: lload 5
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: aload 0
// 11b: lload 7
// 11d: iload 9
// 11f: invokevirtual su/catlean/ja.Z (JI)Z
// 122: goto 130
// 125: ldc2_w -3911815223167053566
// 128: lload 5
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: iload 24
// 132: ifeq 27e
// 135: ifeq 27c
// 138: goto 146
// 13b: ldc2_w -3911815223167053566
// 13e: lload 5
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: lload 10
// 148: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 14b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 14e: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 151: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 154: iload 24
// 156: ifeq 27e
// 159: goto 167
// 15c: ldc2_w -3911815223167053566
// 15f: lload 5
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: ifeq 27c
// 16a: goto 178
// 16d: ldc2_w -3911815223167053566
// 170: lload 5
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: getstatic su/catlean/um.E Lsu/catlean/um;
// 17b: lload 18
// 17d: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 180: getstatic su/catlean/lb.LEGIT Lsu/catlean/lb;
// 183: iload 2
// 184: iflt 1c4
// 187: iload 24
// 189: ifeq 1c4
// 18c: goto 19a
// 18f: ldc2_w -3911815223167053566
// 192: lload 5
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: if_acmpeq 1f3
// 19d: goto 1ab
// 1a0: ldc2_w -3911815223167053566
// 1a3: lload 5
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: getstatic su/catlean/um.E Lsu/catlean/um;
// 1ae: lload 18
// 1b0: invokevirtual su/catlean/um.l (J)Lsu/catlean/lb;
// 1b3: getstatic su/catlean/lb.LEGIT_EXTRA Lsu/catlean/lb;
// 1b6: goto 1c4
// 1b9: ldc2_w -3911815223167053566
// 1bc: lload 5
// 1be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: athrow
// 1c4: if_acmpeq 1f3
// 1c7: aload 0
// 1c8: lload 7
// 1ca: iload 9
// 1cc: invokevirtual su/catlean/ja.Z (JI)Z
// 1cf: iload 24
// 1d1: ifeq 27e
// 1d4: goto 1e2
// 1d7: ldc2_w -3911815223167053566
// 1da: lload 5
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: ifeq 27c
// 1e5: goto 1f3
// 1e8: ldc2_w -3911815223167053566
// 1eb: lload 5
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: iload 2
// 1f4: iflt 265
// 1f7: iload 26
// 1f9: iload 24
// 1fb: ifeq 25a
// 1fe: goto 20c
// 201: ldc2_w -3911815223167053566
// 204: lload 5
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: iload 2
// 20d: ifle 248
// 210: ifeq 237
// 213: goto 221
// 216: ldc2_w -3911815223167053566
// 219: lload 5
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 224: lload 16
// 226: invokevirtual su/catlean/dm.D (J)V
// 229: goto 237
// 22c: ldc2_w -3911815223167053566
// 22f: lload 5
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: lload 22
// 239: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23c: bipush 0
// 23d: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 240: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 243: bipush 1
// 244: invokevirtual su/catlean/_6.h (Z)V
// 247: bipush 0
// 248: istore 25
// 24a: lload 10
// 24c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 252: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
// 255: bipush 0
// 256: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 259: bipush 1
// 25a: putstatic su/catlean/ja.k Z
// 25d: getstatic su/catlean/tc.s Lsu/catlean/tc;
// 260: lload 12
// 262: invokevirtual su/catlean/tc.f (J)V
// 265: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 268: lload 20
// 26a: bipush 3
// 26b: bipush 0
// 26c: bipush 0
// 26d: iload 26
// 26f: invokedynamic run (Z)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/ja.O (Z)V, ()V ]
// 274: getstatic su/catlean/ja.f J
// 277: l2i
// 278: aconst_null
// 279: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 27c: iload 25
// 27e: ireturn
}

private static final void O(boolean var0) {
long var1 = a ^ 132282349710123L;
long var3 = var1 ^ 81705531875409L;
long var5 = var1 ^ 15327765911726L;

try {
k = false;
class_304 var10000 = zf.F(var3).field_1690.field_1867;
class_1041 var10001 = zf.F(var3).method_22683();
class_304 var10002 = zf.F(var3).field_1690.field_1867;
Intrinsics.checkNotNull(var10002, a<"a">(2462, 1092134908523710356L ^ var1));
var10000.method_23481(class_3675.method_15987(var10001, ((KeyMappingAccessor)var10002).getKey().method_1444()));
if (var0) {
dm.h.F(var5);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -223638323214113711L, var1);
}
}

static {
long var5 = a ^ 15185953413877L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[3];
int var12 = 0;
String var11 = "½Æ\u008b\u0012ÌÈß&\u0095[j«\u008ak2\u000fl\r\u0089ôQÁ×*ågg\u0001Ö²&×é¿yqüâ\u000e\u008d,73_Ëy¶¼U\u0018¾Á,\u008d\u0098ªdô\ruXÖ \u001f0Ñ\n»*FÚÇxTD\u0015×KÁÒ\u009f\u0084Ãw\u009e\u0083\u009fò5Q¢½\u00163\rvs\u0006/\u0086ìÔÆ\u008b&cqyN\u007fþAÏýJ\n¡º\u008eËÌ\u009aù\u0004µíÇ~z\u0005S$A\u001a¡É\u0018\u0015\fÇå±«,)ÿÃ;!\u0010\u00919ô}'ìþYïUÈ\u0088\u0005ÜÏOd\u001bx\u0092\u001cÙ>õÇ,g¬\u0086Izÿ3\u0083UÂCäßó&\u0081\u009e\u0080\u001eW<¬M\u0086Áµð_\u0018°\u0011)ß\"\u0083¹§\u0019\u0016\u0010*ù\u0084n=\u0082C¼ÔtK\u0089gõÞ½²\u0087°\u008b`\u0001\u009f»j\u0090]õÔ\u0013\u0092öÈÄ\u0004\u009d\u0098\rò\u0003\u0015\u009dm?ïÞ[~UÁ9\u0082\u0011X0çòÇ³¡=-Â\u0011£uõeû¤ÚAòÑ¡u\nÁ÷\u009ew7";
int var13 = "½Æ\u008b\u0012ÌÈß&\u0095[j«\u008ak2\u000fl\r\u0089ôQÁ×*ågg\u0001Ö²&×é¿yqüâ\u000e\u008d,73_Ëy¶¼U\u0018¾Á,\u008d\u0098ªdô\ruXÖ \u001f0Ñ\n»*FÚÇxTD\u0015×KÁÒ\u009f\u0084Ãw\u009e\u0083\u009fò5Q¢½\u00163\rvs\u0006/\u0086ìÔÆ\u008b&cqyN\u007fþAÏýJ\n¡º\u008eËÌ\u009aù\u0004µíÇ~z\u0005S$A\u001a¡É\u0018\u0015\fÇå±«,)ÿÃ;!\u0010\u00919ô}'ìþYïUÈ\u0088\u0005ÜÏOd\u001bx\u0092\u001cÙ>õÇ,g¬\u0086Izÿ3\u0083UÂCäßó&\u0081\u009e\u0080\u001eW<¬M\u0086Áµð_\u0018°\u0011)ß\"\u0083¹§\u0019\u0016\u0010*ù\u0084n=\u0082C¼ÔtK\u0089gõÞ½²\u0087°\u008b`\u0001\u009f»j\u0090]õÔ\u0013\u0092öÈÄ\u0004\u009d\u0098\rò\u0003\u0015\u009dm?ïÞ[~UÁ9\u0082\u0011X0çòÇ³¡=-Â\u0011£uõeû¤ÚAòÑ¡u\nÁ÷\u009ew7"
.length();
char var10 = 136;
int var9 = -1;

while (true) {
byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
String var20 = a(var15).intern();
byte var10001 = -1;
var14[var12++] = var20;
if ((var9 += var10) >= var13) {
b = var14;
c = new String[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 812500189593130529L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var23;
E = new ja();
return;
}

var10 = var11.charAt(var9);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29458;
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
throw new RuntimeException("su/catlean/ja", var10);
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
throw new RuntimeException("su/catlean/ja" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
