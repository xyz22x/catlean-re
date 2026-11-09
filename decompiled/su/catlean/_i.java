package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _i extends _3 {
@NotNull
public static final _i m;
static final KProperty[] n;
@NotNull
private static final cw i;
@NotNull
private static final cw w;
private static final long c = yz.a(-3642399964216823531L, -3278230875015548246L, MethodHandles.lookup().lookupClass()).a(253763653545815L);
private static final String[] h;
private static final String[] l;
private static final Map o = new HashMap(13);
private static final long[] t;
private static final Integer[] y;
private static final Map B;

private _i(long var1) {
var1 = c ^ var1;
long var10001 = var1 ^ 89606630272954L;
int var3 = (int)((var1 ^ 89606630272954L) >>> 48);
int var4 = (int)((var1 ^ 89606630272954L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
super(c<"o">(28405, 2007996452368175729L ^ var1), (short)var3, jt.Q(), 0, false, f<"y">(1768, 205726459772460577L ^ var1), (short)var4, var5, null);
}

private final no l(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 95915076947877L;
return (no)i.E(this, var3, n[0]);
}

private final nj Z(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 132271126999709L;
return (nj)w.E(this, var3, n[1]);
}

@Flow
private final void Y(PlayerUpdateEvent var1) {
long var2 = c ^ 5474470265927L;
long var4 = var2 ^ 45046169865879L;
long var6 = var2 ^ 130475010179756L;
_3.s(this, this.I(var4), false, false, null, false, f<"y">(20252, 3769250792946155218L ^ var2), var6, null);
}

private final List I(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_i.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 54783180789657
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 125601064114622
// 011: lxor
// 012: dup2
// 013: bipush 56
// 015: lushr
// 016: l2i
// 017: istore 5
// 019: dup2
// 01a: bipush 8
// 01c: lshl
// 01d: bipush 8
// 01f: lushr
// 020: lstore 6
// 022: pop2
// 023: dup2
// 024: ldc2_w 71439030377160
// 027: lxor
// 028: dup2
// 029: bipush 56
// 02b: lushr
// 02c: l2i
// 02d: istore 8
// 02f: dup2
// 030: bipush 8
// 032: lshl
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 9
// 039: dup2
// 03a: bipush 40
// 03c: lshl
// 03d: bipush 40
// 03f: lushr
// 040: l2i
// 041: istore 10
// 043: pop2
// 044: dup2
// 045: ldc2_w 158484757979
// 048: lxor
// 049: lstore 11
// 04b: dup2
// 04c: ldc2_w 21310346159896
// 04f: lxor
// 050: lstore 13
// 052: dup2
// 053: ldc2_w 63515925858727
// 056: lxor
// 057: lstore 15
// 059: dup2
// 05a: ldc2_w 17825484359453
// 05d: lxor
// 05e: lstore 17
// 060: dup2
// 061: ldc2_w 29759294821187
// 064: lxor
// 065: dup2
// 066: bipush 16
// 068: lushr
// 069: lstore 19
// 06b: dup2
// 06c: bipush 48
// 06e: lshl
// 06f: bipush 48
// 071: lushr
// 072: l2i
// 073: istore 21
// 075: pop2
// 076: pop2
// 077: ldc2_w 833075872291509418
// 07a: lload 1
// 07b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: aload 0
// 081: lload 11
// 083: invokespecial su/catlean/_i.L (J)Ljava/util/List;
// 086: astore 23
// 088: astore 22
// 08a: aload 0
// 08b: lload 15
// 08d: invokespecial su/catlean/_i.l (J)Lsu/catlean/no;
// 090: getstatic su/catlean/no.DEFAULT Lsu/catlean/no;
// 093: if_acmpne 0a3
// 096: aload 23
// 098: areturn
// 099: ldc2_w 838490305647100211
// 09c: lload 1
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: new java/util/ArrayList
// 0a6: dup
// 0a7: invokespecial java/util/ArrayList.<init> ()V
// 0aa: astore 24
// 0ac: aload 23
// 0ae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0b3: astore 25
// 0b5: aload 25
// 0b7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0bc: ifeq 30d
// 0bf: aload 25
// 0c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c6: checkcast net/minecraft/class_2338
// 0c9: astore 26
// 0cb: lload 13
// 0cd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d0: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 0d3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0d8: astore 27
// 0da: aload 27
// 0dc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e1: ifeq 0b5
// 0e4: aload 27
// 0e6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0eb: checkcast net/minecraft/class_742
// 0ee: astore 28
// 0f0: aload 28
// 0f2: lload 3
// 0f3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0f9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0fc: lload 1
// 0fd: lconst_0
// 0fe: lcmp
// 0ff: ifle 0e1
// 102: aload 22
// 104: ifnull 0e1
// 107: aload 22
// 109: lload 1
// 10a: lconst_0
// 10b: lcmp
// 10c: ifle 104
// 10f: ifnull 0bc
// 112: aload 22
// 114: lload 1
// 115: lconst_0
// 116: lcmp
// 117: ifle 104
// 11a: lload 1
// 11b: lconst_0
// 11c: lcmp
// 11d: iflt 151
// 120: ifnull 14f
// 123: ifne 1a8
// 126: goto 133
// 129: ldc2_w 838490305647100211
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 28
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 138: aload 28
// 13a: checkcast net/minecraft/class_1657
// 13d: lload 17
// 13f: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 142: goto 14f
// 145: ldc2_w 838490305647100211
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 22
// 151: lload 1
// 152: lconst_0
// 153: lcmp
// 154: iflt 18f
// 157: ifnull 18d
// 15a: ifne 1a8
// 15d: goto 16a
// 160: ldc2_w 838490305647100211
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: aload 28
// 16c: lload 3
// 16d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 170: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 173: dup
// 174: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 177: checkcast net/minecraft/class_1297
// 17a: invokevirtual net/minecraft/class_742.method_5739 (Lnet/minecraft/class_1297;)F
// 17d: ldc 12.0
// 17f: fcmpl
// 180: goto 18d
// 183: ldc2_w 838490305647100211
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 22
// 18f: lload 1
// 190: lconst_0
// 191: lcmp
// 192: ifle 1cb
// 195: ifnull 1c9
// 198: ifle 1ba
// 19b: goto 1a8
// 19e: ldc2_w 838490305647100211
// 1a1: lload 1
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: aload 22
// 1aa: ifnonnull 0da
// 1ad: goto 1ba
// 1b0: ldc2_w 838490305647100211
// 1b3: lload 1
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: aload 28
// 1bc: invokevirtual net/minecraft/class_742.method_23318 ()D
// 1bf: aload 26
// 1c1: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1c4: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1c7: i2d
// 1c8: dcmpg
// 1c9: aload 22
// 1cb: ifnull 20b
// 1ce: ifge 1f0
// 1d1: goto 1de
// 1d4: ldc2_w 838490305647100211
// 1d7: lload 1
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: aload 22
// 1e0: ifnonnull 0da
// 1e3: goto 1f0
// 1e6: ldc2_w 838490305647100211
// 1e9: lload 1
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 1f3: aconst_null
// 1f4: lload 19
// 1f6: bipush 1
// 1f7: iload 21
// 1f9: i2c
// 1fa: aconst_null
// 1fb: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 1fe: i2d
// 1ff: ldc2_w 1.5
// 202: dmul
// 203: ldc2_w 50.0
// 206: ddiv
// 207: invokestatic java/lang/Math.ceil (D)D
// 20a: d2i
// 20b: istore 29
// 20d: iload 29
// 20f: aload 22
// 211: ifnull 286
// 214: ifgt 285
// 217: goto 224
// 21a: ldc2_w 838490305647100211
// 21d: lload 1
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: lload 1
// 225: lconst_0
// 226: lcmp
// 227: iflt 280
// 22a: aload 0
// 22b: iload 5
// 22d: i2b
// 22e: lload 6
// 230: aload 28
// 232: checkcast net/minecraft/class_1297
// 235: invokevirtual su/catlean/_i.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 238: aload 26
// 23a: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 23d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 240: ldc2_w 2.0
// 243: dcmpl
// 244: aload 22
// 246: ifnull 27f
// 249: goto 256
// 24c: ldc2_w 838490305647100211
// 24f: lload 1
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: ifle 278
// 259: goto 266
// 25c: ldc2_w 838490305647100211
// 25f: lload 1
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: aload 22
// 268: ifnonnull 0da
// 26b: goto 278
// 26e: ldc2_w 838490305647100211
// 271: lload 1
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: aload 24
// 27a: aload 26
// 27c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 27f: pop
// 280: aload 22
// 282: ifnonnull 0da
// 285: bipush 0
// 286: istore 30
// 288: iload 30
// 28a: aload 22
// 28c: ifnull 0e1
// 28f: iload 29
// 291: if_icmpgt 0da
// 294: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 297: iload 8
// 299: i2b
// 29a: aload 28
// 29c: checkcast net/minecraft/class_1657
// 29f: iload 30
// 2a1: iload 9
// 2a3: iload 10
// 2a5: invokevirtual su/catlean/lo.c (BLnet/minecraft/class_1657;III)Lnet/minecraft/class_243;
// 2a8: astore 31
// 2aa: aload 31
// 2ac: aload 26
// 2ae: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 2b1: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 2b4: ldc2_w 2.0
// 2b7: dcmpl
// 2b8: ifle 2d8
// 2bb: aload 22
// 2bd: lload 1
// 2be: lconst_0
// 2bf: lcmp
// 2c0: ifle 2c8
// 2c3: ifnull 2ed
// 2c6: aload 22
// 2c8: ifnonnull 2ed
// 2cb: goto 2d8
// 2ce: ldc2_w 838490305647100211
// 2d1: lload 1
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: aload 24
// 2da: aload 26
// 2dc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 2df: pop
// 2e0: goto 2ed
// 2e3: ldc2_w 838490305647100211
// 2e6: lload 1
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: iload 30
// 2ef: aload 22
// 2f1: ifnull 0e1
// 2f4: iload 29
// 2f6: lload 1
// 2f7: lconst_0
// 2f8: lcmp
// 2f9: iflt 291
// 2fc: if_icmpeq 0da
// 2ff: iinc 30 1
// 302: aload 22
// 304: lload 1
// 305: lconst_0
// 306: lcmp
// 307: iflt 0c6
// 30a: ifnonnull 294
// 30d: aload 24
// 30f: checkcast java/util/List
// 312: lload 1
// 313: lconst_0
// 314: lcmp
// 315: iflt 0c6
// 318: areturn
}

private final List L(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_i.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 133277793708423
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 90954958205996
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 21371056006322
// 018: lxor
// 019: lstore 7
// 01b: pop2
// 01c: new java/util/ArrayList
// 01f: dup
// 020: invokespecial java/util/ArrayList.<init> ()V
// 023: checkcast java/util/List
// 026: astore 10
// 028: ldc2_w 8539577023425685927
// 02b: lload 1
// 02c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: lload 7
// 033: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 036: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 039: checkcast net/minecraft/class_2374
// 03c: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 03f: dup
// 040: sipush 16098
// 043: ldc2_w 5937997726280308777
// 046: lload 1
// 047: lxor
// 048: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/_i.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 050: astore 11
// 052: aload 0
// 053: lload 5
// 055: invokevirtual su/catlean/_i.Y (J)F
// 058: f2d
// 059: invokestatic java/lang/Math.ceil (D)D
// 05c: d2f
// 05d: f2i
// 05e: istore 12
// 060: astore 9
// 062: aload 11
// 064: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 067: iload 12
// 069: isub
// 06a: istore 13
// 06c: aload 11
// 06e: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 071: iload 12
// 073: iadd
// 074: istore 14
// 076: iload 13
// 078: iload 14
// 07a: aload 9
// 07c: ifnull 0a3
// 07f: if_icmpgt 1c2
// 082: goto 08f
// 085: ldc2_w 8552309737422994494
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: aload 11
// 091: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 094: iload 12
// 096: goto 0a3
// 099: ldc2_w 8552309737422994494
// 09c: lload 1
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: isub
// 0a4: istore 15
// 0a6: aload 11
// 0a8: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0ab: iload 12
// 0ad: iadd
// 0ae: istore 16
// 0b0: iload 15
// 0b2: lload 1
// 0b3: lconst_0
// 0b4: lcmp
// 0b5: iflt 1a2
// 0b8: iload 16
// 0ba: if_icmpgt 1a0
// 0bd: aload 11
// 0bf: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0c2: iload 12
// 0c4: isub
// 0c5: istore 17
// 0c7: aload 11
// 0c9: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0cc: iload 12
// 0ce: iadd
// 0cf: istore 18
// 0d1: iload 17
// 0d3: iload 18
// 0d5: aload 9
// 0d7: ifnull 1a4
// 0da: if_icmpgt 166
// 0dd: new net/minecraft/class_2338
// 0e0: dup
// 0e1: iload 13
// 0e3: iload 15
// 0e5: iload 17
// 0e7: invokespecial net/minecraft/class_2338.<init> (III)V
// 0ea: astore 19
// 0ec: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 0ef: aload 19
// 0f1: lload 3
// 0f2: invokevirtual su/catlean/wc.d (Lnet/minecraft/class_2338;J)Z
// 0f5: aload 9
// 0f7: ifnull 168
// 0fa: ifeq 12c
// 0fd: aload 10
// 0ff: aload 19
// 101: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 106: lload 1
// 107: lconst_0
// 108: lcmp
// 109: iflt 12e
// 10c: aload 9
// 10e: ifnull 12e
// 111: goto 11e
// 114: ldc2_w 8552309737422994494
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: pop
// 11f: goto 12c
// 122: ldc2_w 8552309737422994494
// 125: lload 1
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: iload 17
// 12e: iload 18
// 130: aload 9
// 132: lload 1
// 133: lconst_0
// 134: lcmp
// 135: ifle 172
// 138: ifnull 16a
// 13b: if_icmpeq 166
// 13e: goto 14b
// 141: ldc2_w 8552309737422994494
// 144: lload 1
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: iinc 17 1
// 14e: aload 9
// 150: ifnonnull 0dd
// 153: lload 1
// 154: lconst_0
// 155: lcmp
// 156: iflt 12c
// 159: goto 166
// 15c: ldc2_w 8552309737422994494
// 15f: lload 1
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: iload 15
// 168: iload 16
// 16a: lload 1
// 16b: lconst_0
// 16c: lcmp
// 16d: ifle 1a4
// 170: aload 9
// 172: ifnull 1a4
// 175: if_icmpeq 1a0
// 178: goto 185
// 17b: ldc2_w 8552309737422994494
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: iinc 15 1
// 188: aload 9
// 18a: ifnonnull 0bd
// 18d: lload 1
// 18e: lconst_0
// 18f: lcmp
// 190: iflt 166
// 193: goto 1a0
// 196: ldc2_w 8552309737422994494
// 199: lload 1
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: iload 13
// 1a2: iload 14
// 1a4: if_icmpeq 1c2
// 1a7: iinc 13 1
// 1aa: aload 9
// 1ac: ifnonnull 08f
// 1af: lload 1
// 1b0: lconst_0
// 1b1: lcmp
// 1b2: iflt 0b0
// 1b5: goto 1c2
// 1b8: ldc2_w 8552309737422994494
// 1bb: lload 1
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: aload 10
// 1c4: areturn
}

@NotNull
@Override
protected List R(long var1) {
long var3 = var1 ^ 57424830627199L;
long var10001 = var1 ^ 127027046720104L;
int var5 = (int)((var1 ^ 127027046720104L) >>> 32);
int var6 = (int)((var1 ^ 127027046720104L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
long var8 = var1 ^ 0L;
String var10 = vm.a<"Å">(4787199541397888330L, var1);

_i var10000;
label38: {
label42: {
try {
var10000 = this;
if (var10 == null) {
break label38;
}

if (this.Z(var3) != nj.WEB) {
break label42;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 4774599507490441427L, var1);
}

gg var15 = gg.P;
class_2248[] var11 = new class_2248[1];

try {
class_2248 var10003 = class_2246.field_10343;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10343, c<"o">(3711, 7225461394845654107L ^ var1));
var11[0] = var10003;
if (var15.O(var5, (short)var6, var11, var7).R()) {
return CollectionsKt.listOf(class_2246.field_10343);
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 4774599507490441427L, var1);
}
}

var10000 = this;
}

try {
List var16 = var10000.R(var8);
if (var1 > 0L && var10 == null) {
vm.a<"Å">(new _g[3], 4762478041540544554L, var1);
}

return var16;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 4774599507490441427L, var1);
}
}

static {
long var20 = c ^ 62595573547703L;
long var22 = var20 ^ 82138832645923L;
long var24 = var20 ^ 71779214196231L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "Î<KÆ\u0002\u0017è\u0002ÜÛrõóöæL\u0010Û©ck¥Òß\u0015\u008d?\u0096#°Øø#\u0018\u0091í5>Q\u009bp]\u0084ÄU¤\u000eð\u0081\u0090$Y\u009aÛ\u0014\u0081y\u0088\u0010\u009aµç\u0085Xs\t6¦ÕÈk#ziM Di<Ú>R~±YYj]\u0083T\u0099\tS\u0011]h6§²ò\"}y\u001aV4u-\u0010at<ÇÙywt\u0096\u0093IE\u0002\\\b« 0\t\u0084\u0015óçñ&ø¢\u0013ÖwÌH`|¤~ÏÍ\u0006Ñ\u0090¯KÃå\u0080ç\u0016\u000f";
int var17 = "Î<KÆ\u0002\u0017è\u0002ÜÛrõóöæL\u0010Û©ck¥Òß\u0015\u008d?\u0096#°Øø#\u0018\u0091í5>Q\u009bp]\u0084ÄU¤\u000eð\u0081\u0090$Y\u009aÛ\u0014\u0081y\u0088\u0010\u009aµç\u0085Xs\t6¦ÕÈk#ziM Di<Ú>R~±YYj]\u0083T\u0099\tS\u0011]h6§²ò\"}y\u001aV4u-\u0010at<ÇÙywt\u0096\u0093IE\u0002\\\b« 0\t\u0084\u0015óçñ&ø¢\u0013ÖwÌH`|¤~ÏÍ\u0006Ñ\u0090¯KÃå\u0080ç\u0016\u000f"
.length();
char var14 = 16;
int var28 = -1;

label45:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = c(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
h = var18;
l = new String[9];
B = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "t\u000f··-g\u0002div\u0006\u008a6r\u001aúÈRîP¶÷®ã";
int var5 = "t\u000f··-g\u0002div\u0006\u008a6r\u001aúÈRîP¶÷®ã".length();
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
byte var43 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

t = var6;
y = new Integer[3];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(_i.class, c<"o">(32028, 7117361851705749098L ^ var20), c<"o">(3123, 1641223238068641614L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(_i.class, c<"o">(20239, 6876696476319177852L ^ var20), c<"o">(21227, 6150524734271570329L ^ var20), 0))
};
n = var26;
m = new _i(var22);
i = yp.L(m, c<"o">(7590, 382443717193240274L ^ var20), no.AROUND_PLAYERS, null, null, f<"y">(5358, 4947987412401054675L ^ var20), null, var24);
w = yp.L(m, c<"o">(18599, 399809812718377943L ^ var20), nj.OBBY, null, null, f<"y">(1768, 205665479258075604L ^ var20), null, var24);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label45;
}

var15 = "£i~mÅ\u0085*i\u008d»½\u0081[e1þdù\u0012¼aÇEâ_güÎÙ\bÞ\u001b\u0080àæO\u0010ý¶ºSî%ND\u0082\rËv£rQ\u0089ÀÕ\f\u0013ªá\u007f\u0099øîÍ+D\u001fÈõ¢\u0000Î0z\u0015x¸_;Gü\u001aÖè\u0003î\u0089°5v£~\u009dLx±Ãßv\u00057\u0097è¦ûÙu\u0091ãÚ\u0085q.'¨h\u009dÉô\u0001»";
var17 = "£i~mÅ\u0085*i\u008d»½\u0081[e1þdù\u0012¼aÇEâ_güÎÙ\bÞ\u001b\u0080àæO\u0010ý¶ºSî%ND\u0082\rËv£rQ\u0089ÀÕ\f\u0013ªá\u007f\u0099øîÍ+D\u001fÈõ¢\u0000Î0z\u0015x¸_;Gü\u001aÖè\u0003î\u0089°5v£~\u009dLx±Ãßv\u00057\u0097è¦ûÙu\u0091ãÚ\u0085q.'¨h\u009dÉô\u0001»"
.length();
var14 = 'H';
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4372;
if (l[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])o.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_i", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = h[var5].getBytes("ISO-8859-1");
l[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return l[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_i" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30045;
if (y[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = t[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])B.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
B.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_i", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
y[var3] = var15;
}

return y[var3];
}

private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = f(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite f(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_i" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
