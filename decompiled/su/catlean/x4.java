package su.catlean;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2784;
import org.jetbrains.annotations.NotNull;

public final class x4 {
@NotNull
private final class_1657 c;
@NotNull
private final ArrayList Y;
private static final long a = yz.a(-8236725112308872336L, 283751220734721062L, MethodHandles.lookup().lookupClass()).a(140134895162036L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public x4(long a, @NotNull class_1657 target) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(target, a<"a">(16080, 8135262837931493399L ^ ax));
super();
this.c = target;
this.Y = new ArrayList();
}

@NotNull
public final class_1657 t() {
return this.c;
}

@NotNull
public final synchronized ArrayList f() {
return this.Y;
}

public final void q(int param1, char param2, short param3) {
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
// 017: getstatic su/catlean/x4.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 37118842367129
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 80133530196067
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: dup2
// 03d: bipush 48
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 139458077145904
// 04b: lxor
// 04c: lstore 11
// 04e: dup2
// 04f: ldc2_w 21899064479022
// 052: lxor
// 053: dup2
// 054: bipush 56
// 056: lushr
// 057: l2i
// 058: istore 13
// 05a: dup2
// 05b: bipush 8
// 05d: lshl
// 05e: bipush 32
// 060: lushr
// 061: l2i
// 062: istore 14
// 064: dup2
// 065: bipush 40
// 067: lshl
// 068: bipush 40
// 06a: lushr
// 06b: l2i
// 06c: istore 15
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 137168690021783
// 073: lxor
// 074: lstore 16
// 076: pop2
// 077: ldc2_w -3024336102309194450
// 07a: lload 4
// 07c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: aload 0
// 082: getfield su/catlean/x4.Y Ljava/util/ArrayList;
// 085: astore 21
// 087: astore 20
// 089: aload 21
// 08b: monitorenter
// 08c: nop
// 08d: bipush 0
// 08e: istore 22
// 090: aload 0
// 091: getfield su/catlean/x4.Y Ljava/util/ArrayList;
// 094: invokevirtual java/util/ArrayList.clear ()V
// 097: new kotlin/jvm/internal/Ref$DoubleRef
// 09a: dup
// 09b: invokespecial kotlin/jvm/internal/Ref$DoubleRef.<init> ()V
// 09e: astore 23
// 0a0: aload 23
// 0a2: aload 0
// 0a3: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0a6: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 0a9: aload 0
// 0aa: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0ad: getfield net/minecraft/class_1657.field_6014 D
// 0b0: dsub
// 0b1: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 0b4: new kotlin/jvm/internal/Ref$DoubleRef
// 0b7: dup
// 0b8: invokespecial kotlin/jvm/internal/Ref$DoubleRef.<init> ()V
// 0bb: astore 24
// 0bd: aload 24
// 0bf: aload 0
// 0c0: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0c3: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 0c6: aload 0
// 0c7: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0ca: getfield net/minecraft/class_1657.field_6036 D
// 0cd: dsub
// 0ce: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 0d1: new kotlin/jvm/internal/Ref$DoubleRef
// 0d4: dup
// 0d5: invokespecial kotlin/jvm/internal/Ref$DoubleRef.<init> ()V
// 0d8: astore 25
// 0da: aload 25
// 0dc: aload 20
// 0de: ifnull 150
// 0e1: aload 0
// 0e2: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0e5: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 0e8: aload 0
// 0e9: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0ec: getfield net/minecraft/class_1657.field_5969 D
// 0ef: dsub
// 0f0: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 0f3: aload 0
// 0f4: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 0f7: lload 16
// 0f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ff: ifeq 14e
// 102: goto 110
// 105: ldc2_w -2906806869798522861
// 108: lload 4
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: aload 23
// 112: lload 16
// 114: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 117: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 11a: getfield net/minecraft/class_243.field_1352 D
// 11d: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 120: aload 24
// 122: lload 16
// 124: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 127: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 12a: getfield net/minecraft/class_243.field_1351 D
// 12d: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 130: aload 25
// 132: lload 16
// 134: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 137: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 13a: getfield net/minecraft/class_243.field_1350 D
// 13d: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 140: goto 14e
// 143: ldc2_w -2906806869798522861
// 146: lload 4
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 23
// 150: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 153: aload 25
// 155: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 158: invokestatic java/lang/Math.hypot (DD)D
// 15b: dstore 26
// 15d: dload 26
// 15f: aload 0
// 160: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 163: invokevirtual net/minecraft/class_1657.method_5715 ()Z
// 166: ifeq 17a
// 169: ldc2_w 0.08511
// 16c: goto 17d
// 16f: ldc2_w -2906806869798522861
// 172: lload 4
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: ldc2_w 0.2837
// 17d: ldc2_w 0.45392000000000005
// 180: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
// 183: dstore 28
// 185: dload 26
// 187: dconst_0
// 188: dcmpg
// 189: aload 20
// 18b: ifnull 1a0
// 18e: ifne 1a3
// 191: goto 19f
// 194: ldc2_w -2906806869798522861
// 197: lload 4
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: bipush 1
// 1a0: goto 1a4
// 1a3: bipush 0
// 1a4: iload 3
// 1a5: ifge 1f7
// 1a8: ifne 1d9
// 1ab: aload 23
// 1ad: aload 23
// 1af: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 1b2: dload 26
// 1b4: ddiv
// 1b5: dload 28
// 1b7: dmul
// 1b8: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 1bb: aload 25
// 1bd: aload 25
// 1bf: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 1c2: dload 26
// 1c4: ddiv
// 1c5: dload 28
// 1c7: dmul
// 1c8: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 1cb: goto 1d9
// 1ce: ldc2_w -2906806869798522861
// 1d1: lload 4
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: lload 11
// 1db: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1de: aload 0
// 1df: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 1e2: checkcast net/minecraft/class_1297
// 1e5: aload 0
// 1e6: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 1e9: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 1ec: dconst_0
// 1ed: ldc2_w -0.1
// 1f0: dconst_0
// 1f1: invokevirtual net/minecraft/class_238.method_1012 (DDD)Lnet/minecraft/class_238;
// 1f4: invokevirtual net/minecraft/class_638.method_52569 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Z
// 1f7: aload 20
// 1f9: ifnull 235
// 1fc: ifeq 240
// 1ff: goto 20d
// 202: ldc2_w -2906806869798522861
// 205: lload 4
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: aload 24
// 20f: aload 20
// 211: ifnull 23a
// 214: goto 222
// 217: ldc2_w -2906806869798522861
// 21a: lload 4
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 225: dconst_0
// 226: dcmpl
// 227: goto 235
// 22a: ldc2_w -2906806869798522861
// 22d: lload 4
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: ifle 240
// 238: aload 24
// 23a: ldc2_w -0.0784
// 23d: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 240: new kotlin/jvm/internal/Ref$ObjectRef
// 243: dup
// 244: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
// 247: astore 30
// 249: aload 30
// 24b: aload 0
// 24c: aload 0
// 24d: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 250: iload 13
// 252: i2b
// 253: swap
// 254: iload 14
// 256: iload 15
// 258: invokevirtual su/catlean/x4.V (BLnet/minecraft/class_1657;II)Lnet/minecraft/class_238;
// 25b: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 25e: aload 24
// 260: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 263: dconst_0
// 264: dcmpl
// 265: aload 20
// 267: iload 1
// 268: iflt 2a3
// 26b: ifnull 2a1
// 26e: ifle 29b
// 271: goto 27f
// 274: ldc2_w -2906806869798522861
// 277: lload 4
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: aload 24
// 281: aload 0
// 282: aload 24
// 284: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 287: invokevirtual su/catlean/x4.G (D)D
// 28a: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 28d: goto 29b
// 290: ldc2_w -2906806869798522861
// 293: lload 4
// 295: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: athrow
// 29b: dload 26
// 29d: ldc2_w 0.056740000000000006
// 2a0: dcmpg
// 2a1: aload 20
// 2a3: iload 1
// 2a4: iflt 2dd
// 2a7: ifnull 2db
// 2aa: ifge 2d5
// 2ad: goto 2bb
// 2b0: ldc2_w -2906806869798522861
// 2b3: lload 4
// 2b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ba: athrow
// 2bb: aload 23
// 2bd: dconst_0
// 2be: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 2c1: aload 25
// 2c3: dconst_0
// 2c4: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 2c7: goto 2d5
// 2ca: ldc2_w -2906806869798522861
// 2cd: lload 4
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: dload 26
// 2d7: ldc2_w 0.056740000000000006
// 2da: dcmpg
// 2db: aload 20
// 2dd: ifnull 355
// 2e0: ifge 347
// 2e3: goto 2f1
// 2e6: ldc2_w -2906806869798522861
// 2e9: lload 4
// 2eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: athrow
// 2f1: aload 24
// 2f3: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 2f6: invokestatic java/lang/Math.abs (D)D
// 2f9: ldc2_w 0.1
// 2fc: dcmpg
// 2fd: aload 20
// 2ff: ifnull 355
// 302: goto 310
// 305: ldc2_w -2906806869798522861
// 308: lload 4
// 30a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: athrow
// 310: ifge 347
// 313: goto 321
// 316: ldc2_w -2906806869798522861
// 319: lload 4
// 31b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 320: athrow
// 321: aload 0
// 322: getfield su/catlean/x4.Y Ljava/util/ArrayList;
// 325: sipush 15014
// 328: ldc2_w 8507494403974273928
// 32b: lload 4
// 32d: lxor
// 32e: invokedynamic x (IJ)I bsm=su/catlean/x4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: aload 30
// 335: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 338: invokestatic java/util/Collections.nCopies (ILjava/lang/Object;)Ljava/util/List;
// 33b: checkcast java/util/Collection
// 33e: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
// 341: pop
// 342: nop
// 343: aload 21
// 345: monitorexit
// 346: return
// 347: sipush 30085
// 34a: ldc2_w 4885132196388394154
// 34d: lload 4
// 34f: lxor
// 350: invokedynamic x (IJ)I bsm=su/catlean/x4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: istore 31
// 357: bipush 0
// 358: istore 32
// 35a: iload 32
// 35c: iload 31
// 35e: if_icmpge 428
// 361: iload 32
// 363: istore 33
// 365: bipush 0
// 366: istore 34
// 368: aload 20
// 36a: ifnull 429
// 36d: aload 24
// 36f: aload 0
// 370: aload 20
// 372: ifnull 3d1
// 375: goto 383
// 378: ldc2_w -2906806869798522861
// 37b: lload 4
// 37d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: athrow
// 383: aload 0
// 384: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 387: aload 30
// 389: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 38c: checkcast net/minecraft/class_238
// 38f: dconst_0
// 390: ldc2_w -0.01
// 393: dconst_0
// 394: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 397: dup
// 398: sipush 1928
// 39b: ldc2_w 7288307325644026415
// 39e: lload 4
// 3a0: lxor
// 3a1: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a9: astore 18
// 3ab: astore 19
// 3ad: iload 8
// 3af: iload 9
// 3b1: i2s
// 3b2: aload 19
// 3b4: iload 10
// 3b6: i2c
// 3b7: aload 18
// 3b9: invokevirtual su/catlean/x4.i (ISLnet/minecraft/class_1657;CLnet/minecraft/class_238;)Z
// 3bc: ifeq 3d0
// 3bf: ldc2_w -0.0784
// 3c2: goto 3d9
// 3c5: ldc2_w -2906806869798522861
// 3c8: lload 4
// 3ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cf: athrow
// 3d0: aload 0
// 3d1: aload 24
// 3d3: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 3d6: invokevirtual su/catlean/x4.G (D)D
// 3d9: putfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 3dc: aload 30
// 3de: aload 0
// 3df: aload 30
// 3e1: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 3e4: checkcast net/minecraft/class_238
// 3e7: aload 23
// 3e9: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 3ec: aload 24
// 3ee: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 3f1: aload 25
// 3f3: getfield kotlin/jvm/internal/Ref$DoubleRef.element D
// 3f6: lload 6
// 3f8: dup2_x2
// 3f9: pop2
// 3fa: invokevirtual su/catlean/x4.Q (Lnet/minecraft/class_238;DDJD)Lnet/minecraft/class_238;
// 3fd: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 400: aload 0
// 401: getfield su/catlean/x4.Y Ljava/util/ArrayList;
// 404: aload 30
// 406: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 409: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 40c: pop
// 40d: nop
// 40e: iinc 32 1
// 411: aload 20
// 413: ifnonnull 35a
// 416: bipush 2
// 417: iload 1
// 418: ifle 366
// 41b: anewarray 560
// 41e: ldc2_w -2891320077223141918
// 421: lload 4
// 423: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 428: nop
// 429: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 42c: astore 22
// 42e: aload 21
// 430: monitorexit
// 431: goto 43c
// 434: astore 23
// 436: aload 21
// 438: monitorexit
// 439: aload 23
// 43b: athrow
// 43c: return
}

public final double G(double d) {
return (dx - 0.08) * 0.98;
}

public final boolean i(int a, short a, @NotNull class_1657 player, char a, @NotNull class_238 box) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var8 = var6 ^ 77402892156220L;
Intrinsics.checkNotNullParameter(player, a<"a">(20923, 7484250365724451349L ^ var6));
Intrinsics.checkNotNullParameter(box, a<"a">(8421, 3954320630960689993L ^ var6));
return zf.z(var8).method_20812((class_1297)player, box).iterator().hasNext();
}

@NotNull
public final class_238 V(byte a, @NotNull class_1657 entity, int a, int a) {
long var5 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
String var10000 = vm.a<"Å">(4991683757784499823L, var5);
Intrinsics.checkNotNullParameter(entity, a<"a">(30797, 6173538597787295395L ^ var5));
String var7 = var10000;
class_238 var14 = entity.method_5829();
Intrinsics.checkNotNullExpressionValue(var14, a<"a">(3936, 2076732688024775045L ^ var5));
class_238 var8 = var14;
class_243 var9 = new class_243(entity.field_6014, entity.field_6036, entity.field_5969);

label32: {
label31: {
try {
double var17;
var15 = (var17 = var9.method_1027() - 0.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
if (var7 == null) {
break label32;
}

if (!var15) {
break label31;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 4965659721363350354L, var5);
}

var15 = 0;
break label32;
}

var15 = 1;
}

try {
if (var15) {
class_238 var16 = entity.method_5829();
Intrinsics.checkNotNullExpressionValue(var16, a<"a">(10834, 3720195205903355058L ^ var5));
return var16;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 4965659721363350354L, var5);
}

double var10 = var8.method_17939() / 2.0;
return new class_238(
-var10 + var9.field_1352, var9.field_1351, -var10 + var9.field_1350, var10 + var9.field_1352, var8.method_17940() + var9.field_1351, var10 + var9.field_1350
);
}

private final List E(long var1, class_1297 var3, List var4, class_238 var5) {
var1 = a ^ var1;
long var6 = var1 ^ 35305197296643L;
Builder var10000 = ImmutableList.builderWithExpectedSize(var4.size() + 1);
Intrinsics.checkNotNullExpressionValue(var10000, a<"a">(18891, 6532706333136526161L ^ var1));
Builder var8 = var10000;

try {
if (!var4.isEmpty()) {
var8.addAll(var4);
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -5720789477574174944L, var1);
}

class_2784 var14 = zf.z(var6).method_8621();
Intrinsics.checkNotNullExpressionValue(var14, a<"a">(10712, 2266345471235750720L ^ var1));
class_2784 var9 = var14;
boolean var10 = var9.method_39459(var3, var5);

try {
if (var1 > 0L && var10) {
var8.add(var9.method_17903());
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -5720789477574174944L, var1);
}

ImmutableList var15 = var8.addAll(zf.z(var6).method_20812(var3, var5)).build();
Intrinsics.checkNotNullExpressionValue(var15, a<"a">(12677, 5789929877434458901L ^ var1));
return (List)var15;
}

@NotNull
public final class_238 Q(@NotNull class_238 box, double motionX, double motionY, long a, double motionZ) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/x4.a J
// 003: lload 6
// 005: lxor
// 006: lstore 6
// 008: lload 6
// 00a: dup2
// 00b: ldc2_w 139673879022506
// 00e: lxor
// 00f: lstore 10
// 011: dup2
// 012: ldc2_w 51978467527110
// 015: lxor
// 016: lstore 12
// 018: pop2
// 019: ldc2_w 2661970180968114136
// 01c: lload 6
// 01e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 023: aload 1
// 024: sipush 1514
// 027: ldc2_w 3925677199465661110
// 02a: lload 6
// 02c: lxor
// 02d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 035: aload 1
// 036: dload 2
// 037: dload 4
// 039: dload 8
// 03b: invokevirtual net/minecraft/class_238.method_1012 (DDD)Lnet/minecraft/class_238;
// 03e: dup
// 03f: sipush 21263
// 042: ldc2_w 7747844024705225815
// 045: lload 6
// 047: lxor
// 048: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 050: astore 15
// 052: aload 0
// 053: aload 0
// 054: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 057: lload 10
// 059: dup2_x1
// 05a: pop2
// 05b: checkcast net/minecraft/class_1297
// 05e: lload 12
// 060: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 063: aload 0
// 064: getfield su/catlean/x4.c Lnet/minecraft/class_1657;
// 067: checkcast net/minecraft/class_1297
// 06a: aload 15
// 06c: invokevirtual net/minecraft/class_638.method_20743 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
// 06f: dup
// 070: sipush 8882
// 073: ldc2_w 2437060997432108514
// 076: lload 6
// 078: lxor
// 079: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 081: aload 15
// 083: invokespecial su/catlean/x4.E (JLnet/minecraft/class_1297;Ljava/util/List;Lnet/minecraft/class_238;)Ljava/util/List;
// 086: astore 16
// 088: aload 1
// 089: astore 17
// 08b: dload 2
// 08c: dstore 18
// 08e: dconst_0
// 08f: dstore 28
// 091: dload 4
// 093: dstore 28
// 095: dconst_0
// 096: dstore 30
// 098: dload 8
// 09a: dstore 30
// 09c: astore 14
// 09e: aload 16
// 0a0: invokeinterface java/util/List.isEmpty ()Z 1
// 0a5: ifeq 0d1
// 0a8: aload 17
// 0aa: dload 18
// 0ac: dload 28
// 0ae: dload 30
// 0b0: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 0b3: dup
// 0b4: sipush 4285
// 0b7: ldc2_w 2701201076822104035
// 0ba: lload 6
// 0bc: lxor
// 0bd: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c5: areturn
// 0c6: ldc2_w 2692768975213789925
// 0c9: lload 6
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 17
// 0d3: astore 20
// 0d5: dload 28
// 0d7: dconst_0
// 0d8: dcmpg
// 0d9: aload 14
// 0db: ifnull 0f0
// 0de: ifne 0f3
// 0e1: goto 0ef
// 0e4: ldc2_w 2692768975213789925
// 0e7: lload 6
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: bipush 1
// 0f0: goto 0f4
// 0f3: bipush 0
// 0f4: ifne 152
// 0f7: getstatic net/minecraft/class_2350$class_2351.field_11052 Lnet/minecraft/class_2350$class_2351;
// 0fa: aload 17
// 0fc: aload 16
// 0fe: checkcast java/lang/Iterable
// 101: dload 28
// 103: invokestatic net/minecraft/class_259.method_1085 (Lnet/minecraft/class_2350$class_2351;Lnet/minecraft/class_238;Ljava/lang/Iterable;D)D
// 106: dstore 21
// 108: dload 21
// 10a: dstore 23
// 10c: bipush 0
// 10d: istore 26
// 10f: dload 23
// 111: dstore 28
// 113: dload 21
// 115: dconst_0
// 116: dcmpg
// 117: aload 14
// 119: ifnull 12e
// 11c: ifne 131
// 11f: goto 12d
// 122: ldc2_w 2692768975213789925
// 125: lload 6
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 1
// 12e: goto 132
// 131: bipush 0
// 132: ifne 152
// 135: aload 17
// 137: dconst_0
// 138: dload 28
// 13a: dconst_0
// 13b: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 13e: dup
// 13f: sipush 1928
// 142: ldc2_w 7288255168348569817
// 145: lload 6
// 147: lxor
// 148: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 150: astore 17
// 152: dload 18
// 154: invokestatic java/lang/Math.abs (D)D
// 157: dload 30
// 159: invokestatic java/lang/Math.abs (D)D
// 15c: dcmpg
// 15d: aload 14
// 15f: ifnull 174
// 162: ifge 177
// 165: goto 173
// 168: ldc2_w 2692768975213789925
// 16b: lload 6
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: bipush 1
// 174: goto 178
// 177: bipush 0
// 178: istore 21
// 17a: iload 21
// 17c: aload 14
// 17e: lload 6
// 180: lconst_0
// 181: lcmp
// 182: ifle 22a
// 185: ifnull 228
// 188: ifeq 224
// 18b: goto 199
// 18e: ldc2_w 2692768975213789925
// 191: lload 6
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: dload 30
// 19b: dconst_0
// 19c: dcmpg
// 19d: aload 14
// 19f: ifnull 1c2
// 1a2: goto 1b0
// 1a5: ldc2_w 2692768975213789925
// 1a8: lload 6
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: ifne 1c5
// 1b3: goto 1c1
// 1b6: ldc2_w 2692768975213789925
// 1b9: lload 6
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: bipush 1
// 1c2: goto 1c6
// 1c5: bipush 0
// 1c6: ifne 224
// 1c9: getstatic net/minecraft/class_2350$class_2351.field_11051 Lnet/minecraft/class_2350$class_2351;
// 1cc: aload 17
// 1ce: aload 16
// 1d0: checkcast java/lang/Iterable
// 1d3: dload 30
// 1d5: invokestatic net/minecraft/class_259.method_1085 (Lnet/minecraft/class_2350$class_2351;Lnet/minecraft/class_238;Ljava/lang/Iterable;D)D
// 1d8: dstore 23
// 1da: dload 23
// 1dc: dstore 25
// 1de: bipush 0
// 1df: istore 27
// 1e1: dload 25
// 1e3: dstore 30
// 1e5: dload 23
// 1e7: dconst_0
// 1e8: dcmpg
// 1e9: aload 14
// 1eb: ifnull 200
// 1ee: ifne 203
// 1f1: goto 1ff
// 1f4: ldc2_w 2692768975213789925
// 1f7: lload 6
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: bipush 1
// 200: goto 204
// 203: bipush 0
// 204: ifne 224
// 207: aload 17
// 209: dconst_0
// 20a: dconst_0
// 20b: dload 30
// 20d: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 210: dup
// 211: sipush 1928
// 214: ldc2_w 7288255168348569817
// 217: lload 6
// 219: lxor
// 21a: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 222: astore 17
// 224: dload 18
// 226: dconst_0
// 227: dcmpg
// 228: aload 14
// 22a: ifnull 23f
// 22d: ifne 242
// 230: goto 23e
// 233: ldc2_w 2692768975213789925
// 236: lload 6
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: bipush 1
// 23f: goto 243
// 242: bipush 0
// 243: ifne 2c3
// 246: getstatic net/minecraft/class_2350$class_2351.field_11048 Lnet/minecraft/class_2350$class_2351;
// 249: aload 17
// 24b: aload 16
// 24d: checkcast java/lang/Iterable
// 250: dload 18
// 252: invokestatic net/minecraft/class_259.method_1085 (Lnet/minecraft/class_2350$class_2351;Lnet/minecraft/class_238;Ljava/lang/Iterable;D)D
// 255: dstore 18
// 257: iload 21
// 259: aload 14
// 25b: lload 6
// 25d: lconst_0
// 25e: lcmp
// 25f: ifle 2c7
// 262: ifnull 2c5
// 265: ifne 2c3
// 268: goto 276
// 26b: ldc2_w 2692768975213789925
// 26e: lload 6
// 270: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: athrow
// 276: dload 18
// 278: dconst_0
// 279: dcmpg
// 27a: aload 14
// 27c: ifnull 29f
// 27f: goto 28d
// 282: ldc2_w 2692768975213789925
// 285: lload 6
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: ifne 2a2
// 290: goto 29e
// 293: ldc2_w 2692768975213789925
// 296: lload 6
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: bipush 1
// 29f: goto 2a3
// 2a2: bipush 0
// 2a3: ifne 2c3
// 2a6: aload 17
// 2a8: dload 18
// 2aa: dconst_0
// 2ab: dconst_0
// 2ac: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 2af: dup
// 2b0: sipush 1928
// 2b3: ldc2_w 7288255168348569817
// 2b6: lload 6
// 2b8: lxor
// 2b9: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c1: astore 17
// 2c3: iload 21
// 2c5: aload 14
// 2c7: lload 6
// 2c9: lconst_0
// 2ca: lcmp
// 2cb: iflt 2f6
// 2ce: ifnull 2f4
// 2d1: ifne 323
// 2d4: goto 2e2
// 2d7: ldc2_w 2692768975213789925
// 2da: lload 6
// 2dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: athrow
// 2e2: dload 30
// 2e4: dconst_0
// 2e5: dcmpg
// 2e6: goto 2f4
// 2e9: ldc2_w 2692768975213789925
// 2ec: lload 6
// 2ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: athrow
// 2f4: aload 14
// 2f6: ifnull 30b
// 2f9: ifne 30e
// 2fc: goto 30a
// 2ff: ldc2_w 2692768975213789925
// 302: lload 6
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: bipush 1
// 30b: goto 30f
// 30e: bipush 0
// 30f: ifne 323
// 312: getstatic net/minecraft/class_2350$class_2351.field_11051 Lnet/minecraft/class_2350$class_2351;
// 315: aload 17
// 317: aload 16
// 319: checkcast java/lang/Iterable
// 31c: dload 30
// 31e: invokestatic net/minecraft/class_259.method_1085 (Lnet/minecraft/class_2350$class_2351;Lnet/minecraft/class_238;Ljava/lang/Iterable;D)D
// 321: dstore 30
// 323: aload 20
// 325: dload 18
// 327: dload 28
// 329: dload 30
// 32b: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 32e: dup
// 32f: sipush 1928
// 332: ldc2_w 7288255168348569817
// 335: lload 6
// 337: lxor
// 338: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/x4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 340: areturn
}

static {
long var11 = a ^ 117070300704913L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[14];
int var18 = 0;
String var17 = "¤ïæ\u0085Ë\u0082«xim{úÿÃWC\u0018\u0084SÇcUÓC^¨,¤>\u0084ÎË\"<\rù\u0085×T0 \u0010\fN\u008et© I\u0012ÕË\u001aõ\u0003ª\u0096\u00120Kv\u009c\u008d\u0098Æ\u0005 ®J½1GbQ>B7@+\u008f#\u0006¤\u0081s)rà»\u008f\u0002±\u0082l!k\u0099Z\u000b¹\u001cÖJ{ºd60ÿ.`ÍÖ\u008fRµ\u0001%õw2£º5ó!\u0011Ìk¢\u0015\u009fk\neKb\u0001»ÐK\\1îª\u009bO]ªØàëÞPÅÃ \u0091ÅÖ@c§\u008d0\u0016»F:i\u009dï\u008d|¸$î\u0012\u009d7Ö~KÑÙØ\u001dà\u0087(7\u0087V\u008aÊëPÌ\u0019\bªOÓgN\n9çÕþfÆXð*´\u00079\u0098\u00adÂèù\u008aÖA9\u0097Ö,\u0010\u0098£éÚØÀ\u0097\u0013\u008f)ò¢©¥f\u0096\u0010ý\"eô÷4ÖÂ¿áYöõ\u0093\bv(ù2#1\u0095f\u0080©~æný=âa\u001a?\u0090úÕ2-ÜM\u00adÓo×\fC!\b\u0003\u001c\u0089ºQb¬N\u0018ègiø\u0000I!\u001bþ½¶\u008b÷ëÆR\u009c¥äèG^Ó\u00840ÍÓÙ±t7\u009d÷\u0004\u000fó\u009ejî°sCãbß?«¶¥\n¹=\u000fdìàÅç'è3¸\u0084P4ÀîÖ)'×\u008b\u001e";
int var19 = "¤ïæ\u0085Ë\u0082«xim{úÿÃWC\u0018\u0084SÇcUÓC^¨,¤>\u0084ÎË\"<\rù\u0085×T0 \u0010\fN\u008et© I\u0012ÕË\u001aõ\u0003ª\u0096\u00120Kv\u009c\u008d\u0098Æ\u0005 ®J½1GbQ>B7@+\u008f#\u0006¤\u0081s)rà»\u008f\u0002±\u0082l!k\u0099Z\u000b¹\u001cÖJ{ºd60ÿ.`ÍÖ\u008fRµ\u0001%õw2£º5ó!\u0011Ìk¢\u0015\u009fk\neKb\u0001»ÐK\\1îª\u009bO]ªØàëÞPÅÃ \u0091ÅÖ@c§\u008d0\u0016»F:i\u009dï\u008d|¸$î\u0012\u009d7Ö~KÑÙØ\u001dà\u0087(7\u0087V\u008aÊëPÌ\u0019\bªOÓgN\n9çÕþfÆXð*´\u00079\u0098\u00adÂèù\u008aÖA9\u0097Ö,\u0010\u0098£éÚØÀ\u0097\u0013\u008f)ò¢©¥f\u0096\u0010ý\"eô÷4ÖÂ¿áYöõ\u0093\bv(ù2#1\u0095f\u0080©~æný=âa\u001a?\u0090úÕ2-ÜM\u00adÓo×\fC!\b\u0003\u001c\u0089ºQb¬N\u0018ègiø\u0000I!\u001bþ½¶\u008b÷ëÆR\u009c¥äèG^Ó\u00840ÍÓÙ±t7\u009d÷\u0004\u000fó\u009ejî°sCãbß?«¶¥\n¹=\u000fdìàÅç'è3¸\u0084P4ÀîÖ)'×\u008b\u001e"
.length();
char var16 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
d = new String[14];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "f!ºW³T|`OÙ¿.\u008bä;ç";
int var5 = "f!ºW³T|`OÙ¿.\u008bä;ç".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
g = new Integer[2];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "Síc\u0095\u0088M\u0002\u0016!ÿ?ÐLÃÝtò]Ù\bÞBz`ãÖ\u0088\u0080}\u001føÀ¡¤x8ãcÿ\u001e\u0010ðñ£ÎåG÷ùZ\u0000\u00adÔ@J\u008f\u009b";
var19 = "Síc\u0095\u0088M\u0002\u0016!ÿ?ÐLÃÝtò]Ù\bÞBz`ãÖ\u0088\u0080}\u001føÀ¡¤x8ãcÿ\u001e\u0010ðñ£ÎåG÷ùZ\u0000\u00adÔ@J\u008f\u009b".length();
var16 = '(';
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25434;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/x4", var10);
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
throw new RuntimeException("su/catlean/x4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30679;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/x4", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/x4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
