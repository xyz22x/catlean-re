package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dw extends dj {
@NotNull
public static final ma X;
@NotNull
private final Map A;
@NotNull
private final n7 D;
@Nullable
private static dj C;
private static _g[] u;
private static final long a = yz.a(1339252223487118068L, 462184803136938387L, MethodHandles.lookup().lookupClass()).a(129072437144889L);
private static final String[] c;
private static final String[] d;
private static final Map g = new HashMap(13);
private static final long[] i;
private static final Integer[] k;
private static final Map m;

public dw(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 115883801038959L;
long var5 = var1 ^ 120721425278060L;
long var7 = var1 ^ 72029045081835L;
super(var3);
vm.a<"Å">(2068560621153135248L, var1);
this.A = new LinkedHashMap();
this.D = new n7(0.0F, 0.0F, 40.0F, 15.0F, "", dw::U, 0, var7, jh.f.i(), jh.f.h(), 0.0F, 0.0F, c<"x">(28036, 4645126838236825456L ^ var1), null);

try {
this.F(var5);
if (vm.a<"Å">(2022381947828961921L, var1) != null) {
vm.a<"Å">(new _g[4], 2021380006376900980L, var1);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 2076197329695723449L, var1);
}
}

private final void J(String var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 138432962331946L;
long var6 = var2 ^ 84707000799653L;
long var8 = var2 ^ 73485625961345L;
Iterable var11 = yl.g.m().s(var6);
od var17 = yl.g.m();
_g[] var10000 = vm.a<"Å">(4463930072844307414L, var2);
boolean var12 = false;
Iterator var13 = var11.iterator();
_g[] var10 = var10000;

label38:
while (true) {
if (!var13.hasNext()) {
var10000 = null;
break;
}

var10000 = (_g[])var13.next();

while (true) {
Object var14 = var10000;
var10000 = (_g[])var14;

while (true) {
mh var15 = (mh)var10000;
boolean var16 = false;
if (!Intrinsics.areEqual(var15.R(), var1)) {
continue label38;
}

var10000 = (_g[])var14;
if (var2 <= 0L) {
break;
}

if (var10 != null) {
break label38;
}
}
}
}

mh var22;
try {
var21 = var17;
var22 = (mh)var10000;
if ((mh)var10000 == null) {
return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 4437789820957290239L, var2);
}

var21.m(var8, var22);
this.F(var4);
}

private final void H(int var1, String var2, int var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 78887393206663L;
long var9 = var5 ^ 131195852977416L;
yl.g.m().s(var9).removeIf(dw::G);
this.F(var7);
}

public final void F(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dw.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 94845721925000
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 61965594368747
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: aload 0
// 016: ldc 188.0
// 018: invokevirtual su/catlean/dw.W (F)V
// 01b: ldc2_w -4560605778286119280
// 01e: lload 1
// 01f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: aload 0
// 025: ldc 119.0
// 027: invokevirtual su/catlean/dw.u (F)V
// 02a: aload 0
// 02b: getfield su/catlean/dw.A Ljava/util/Map;
// 02e: invokeinterface java/util/Map.clear ()V 1
// 033: bipush 0
// 034: istore 8
// 036: astore 7
// 038: bipush 0
// 039: istore 9
// 03b: iload 9
// 03d: bipush 4
// 03e: if_icmpge 147
// 041: bipush 0
// 042: istore 10
// 044: iload 10
// 046: sipush 27455
// 049: ldc2_w 3545129653022137799
// 04c: lload 1
// 04d: lxor
// 04e: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: if_icmpge 139
// 056: iload 8
// 058: istore 11
// 05a: aload 7
// 05c: lload 1
// 05d: lconst_0
// 05e: lcmp
// 05f: ifle 144
// 062: ifnull 142
// 065: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 068: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 06b: lload 3
// 06c: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 06f: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// 072: iload 8
// 074: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 077: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 07c: aload 7
// 07e: ifnull 0cf
// 081: goto 08e
// 084: ldc2_w -4553038474936577095
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: lload 1
// 08f: lconst_0
// 090: lcmp
// 091: iflt 0cb
// 094: ifnonnull 0b4
// 097: goto 0a4
// 09a: ldc2_w -4553038474936577095
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 0a7: goto 0d2
// 0aa: ldc2_w -4553038474936577095
// 0ad: lload 1
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0b7: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 0ba: lload 3
// 0bb: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 0be: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// 0c1: iload 8
// 0c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0c6: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0cb: dup
// 0cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0cf: checkcast net/minecraft/class_1792
// 0d2: astore 13
// 0d4: aload 13
// 0d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0d9: aload 13
// 0db: astore 12
// 0dd: aload 0
// 0de: getfield su/catlean/dw.A Ljava/util/Map;
// 0e1: new su/catlean/n7
// 0e4: dup
// 0e5: iload 10
// 0e7: i2f
// 0e8: ldc 20.0
// 0ea: fmul
// 0eb: iload 9
// 0ed: i2f
// 0ee: ldc 20.0
// 0f0: fmul
// 0f1: ldc 18.0
// 0f3: ldc 18.0
// 0f5: ldc ""
// 0f7: aload 12
// 0f9: aload 0
// 0fa: iload 11
// 0fc: invokedynamic invoke (Lnet/minecraft/class_1792;Lsu/catlean/dw;I)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/dw.N (Lnet/minecraft/class_1792;Lsu/catlean/dw;I)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 101: iload 8
// 103: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 106: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 109: lload 5
// 10b: dup2_x1
// 10c: pop2
// 10d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 110: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 113: fconst_0
// 114: fconst_0
// 115: sipush 18170
// 118: ldc2_w 6686441551160225804
// 11b: lload 1
// 11c: lxor
// 11d: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: aconst_null
// 123: invokespecial su/catlean/n7.<init> (FFFFLjava/lang/String;Lkotlin/jvm/functions/Function0;IJLjava/awt/Color;Ljava/awt/Color;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 126: aload 12
// 128: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 12d: pop
// 12e: iinc 8 1
// 131: iinc 10 1
// 134: aload 7
// 136: ifnonnull 044
// 139: lload 1
// 13a: lconst_0
// 13b: lcmp
// 13c: iflt 142
// 13f: iinc 9 1
// 142: aload 7
// 144: ifnonnull 03b
// 147: return
}

private final void Y(int param1, int param2, class_1792 param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: lload 4
// 07: bipush 32
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/dw.a J
// 11: lxor
// 12: lstore 6
// 14: lload 6
// 16: dup2
// 17: ldc2_w 68241497476228
// 1a: lxor
// 1b: lstore 8
// 1d: pop2
// 1e: ldc2_w -2758154160643870820
// 21: lload 6
// 23: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: aload 0
// 29: getfield su/catlean/dw.A Ljava/util/Map;
// 2c: invokestatic com/google/common/collect/Maps.newHashMap (Ljava/util/Map;)Ljava/util/HashMap;
// 2f: dup
// 30: sipush 27675
// 33: ldc2_w 4090855230378324110
// 36: lload 6
// 38: lxor
// 39: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 41: checkcast java/util/Map
// 44: astore 11
// 46: astore 10
// 48: bipush 0
// 49: istore 12
// 4b: aload 11
// 4d: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 52: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 57: astore 13
// 59: aload 13
// 5b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 60: ifeq d8
// 63: aload 13
// 65: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6a: checkcast java/util/Map$Entry
// 6d: astore 14
// 6f: aload 14
// 71: astore 15
// 73: bipush 0
// 74: istore 16
// 76: aload 10
// 78: iload 2
// 79: ifle d5
// 7c: ifnull d3
// 7f: aload 15
// 81: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 86: checkcast su/catlean/n7
// 89: aload 10
// 8b: ifnull f8
// 8e: goto 9c
// 91: ldc2_w -2748264553713300811
// 94: lload 6
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: invokevirtual su/catlean/n7.F ()I
// 9f: iload 1
// a0: if_icmpne d1
// a3: goto b1
// a6: ldc2_w -2748264553713300811
// a9: lload 6
// ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b0: athrow
// b1: aload 0
// b2: getfield su/catlean/dw.A Ljava/util/Map;
// b5: aload 15
// b7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// bc: aload 3
// bd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// c2: pop
// c3: goto d1
// c6: ldc2_w -2748264553713300811
// c9: lload 6
// cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0: athrow
// d1: nop
// d2: nop
// d3: aload 10
// d5: ifnonnull 59
// d8: nop
// d9: getstatic su/catlean/yl.g Lsu/catlean/yl;
// dc: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// df: lload 8
// e1: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// e4: invokevirtual su/catlean/mh.r ()Ljava/util/Map;
// e7: lload 4
// e9: lconst_0
// ea: lcmp
// eb: iflt 6a
// ee: iload 1
// ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// f2: aload 3
// f3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// f8: pop
// f9: return
}

@Override
public void B(@NotNull class_332 context, long a, int mouseX, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 49135606458366
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 140651307937406
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 83711771966610
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 119233142815521
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 134822669100867
// 021: lxor
// 022: lstore 14
// 024: dup2
// 025: ldc2_w 109054091827800
// 028: lxor
// 029: lstore 16
// 02b: dup2
// 02c: ldc2_w 102625430865227
// 02f: lxor
// 030: lstore 18
// 032: pop2
// 033: aload 1
// 034: sipush 3337
// 037: ldc2_w 4915894459730703207
// 03a: lload 2
// 03b: lxor
// 03c: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 044: lload 6
// 046: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 049: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 04c: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 04f: i2f
// 050: fconst_2
// 051: fdiv
// 052: aload 0
// 053: invokevirtual su/catlean/dw.l ()F
// 056: fconst_2
// 057: fdiv
// 058: fsub
// 059: fstore 21
// 05b: lload 6
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 063: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 066: i2f
// 067: fconst_2
// 068: fdiv
// 069: aload 0
// 06a: invokevirtual su/catlean/dw.p ()F
// 06d: fconst_2
// 06e: fdiv
// 06f: fsub
// 070: ldc 50.0
// 072: fsub
// 073: fstore 22
// 075: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 078: aload 1
// 079: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 07c: dup
// 07d: sipush 7814
// 080: ldc2_w 3047850658039210218
// 083: lload 2
// 084: lxor
// 085: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: fload 21
// 08f: sipush 16814
// 092: ldc2_w 7421087610339609769
// 095: lload 2
// 096: lxor
// 097: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: i2f
// 09d: fadd
// 09e: fload 22
// 0a0: ldc 91.5
// 0a2: fadd
// 0a3: aload 0
// 0a4: invokevirtual su/catlean/dw.l ()F
// 0a7: sipush 14444
// 0aa: ldc2_w 5224511705151911270
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: i2f
// 0b5: fsub
// 0b6: ldc 0.5
// 0b8: bipush 1
// 0b9: anewarray 546
// 0bc: astore 23
// 0be: aload 23
// 0c0: bipush 0
// 0c1: new java/awt/Color
// 0c4: dup
// 0c5: sipush 3084
// 0c8: ldc2_w 1698720806385975565
// 0cb: lload 2
// 0cc: lxor
// 0cd: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: bipush 1
// 0d3: invokespecial java/awt/Color.<init> (IZ)V
// 0d6: aastore
// 0d7: aload 23
// 0d9: lload 14
// 0db: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0de: aload 0
// 0df: getfield su/catlean/dw.D Lsu/catlean/n7;
// 0e2: fload 21
// 0e4: sipush 29789
// 0e7: ldc2_w 2712987971071670613
// 0ea: lload 2
// 0eb: lxor
// 0ec: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: i2f
// 0f2: fadd
// 0f3: fload 22
// 0f5: ldc 5.0
// 0f7: fadd
// 0f8: iload 4
// 0fa: i2f
// 0fb: iload 5
// 0fd: i2f
// 0fe: lload 16
// 100: dup2_x1
// 101: pop2
// 102: aload 1
// 103: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 106: ldc2_w -4953026533661471386
// 109: lload 2
// 10a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: lload 10
// 111: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 114: aload 1
// 115: sipush 21737
// 118: ldc2_w 8090543344449940098
// 11b: lload 2
// 11c: lxor
// 11d: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: fload 21
// 124: ldc 25.0
// 126: fadd
// 127: fload 22
// 129: ldc 11.0
// 12b: fadd
// 12c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 12f: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 132: lload 12
// 134: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 137: lload 10
// 139: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 13c: aload 1
// 13d: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 140: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 143: lload 8
// 145: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 148: invokevirtual su/catlean/mh.R ()Ljava/lang/String;
// 14b: sipush 564
// 14e: ldc2_w 5258484471711710302
// 151: lload 2
// 152: lxor
// 153: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: swap
// 159: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 15e: fload 21
// 160: aload 0
// 161: invokevirtual su/catlean/dw.l ()F
// 164: fconst_2
// 165: fdiv
// 166: fadd
// 167: fload 22
// 169: ldc 11.0
// 16b: fadd
// 16c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 16f: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 172: lload 12
// 174: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 177: bipush 0
// 178: istore 23
// 17a: aload 0
// 17b: getfield su/catlean/dw.A Ljava/util/Map;
// 17e: astore 24
// 180: bipush 0
// 181: istore 25
// 183: astore 20
// 185: aload 24
// 187: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 18c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 191: astore 26
// 193: aload 26
// 195: invokeinterface java/util/Iterator.hasNext ()Z 1
// 19a: ifeq 44d
// 19d: aload 26
// 19f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1a4: checkcast java/util/Map$Entry
// 1a7: astore 27
// 1a9: aload 27
// 1ab: astore 28
// 1ad: bipush 0
// 1ae: istore 29
// 1b0: iload 23
// 1b2: istore 30
// 1b4: aload 20
// 1b6: lload 2
// 1b7: lconst_0
// 1b8: lcmp
// 1b9: iflt 450
// 1bc: ifnull 44e
// 1bf: bipush 0
// 1c0: iload 30
// 1c2: lload 2
// 1c3: lconst_0
// 1c4: lcmp
// 1c5: iflt 218
// 1c8: aload 20
// 1ca: ifnull 218
// 1cd: goto 1da
// 1d0: ldc2_w -4961152559238125489
// 1d3: lload 2
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: if_icmpgt 22d
// 1dd: goto 1ea
// 1e0: ldc2_w -4961152559238125489
// 1e3: lload 2
// 1e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: athrow
// 1ea: iload 30
// 1ec: aload 20
// 1ee: ifnull 22a
// 1f1: goto 1fe
// 1f4: ldc2_w -4961152559238125489
// 1f7: lload 2
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: sipush 24704
// 201: ldc2_w 1752766878670876043
// 204: lload 2
// 205: lxor
// 206: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: goto 218
// 20e: ldc2_w -4961152559238125489
// 211: lload 2
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: if_icmpge 229
// 21b: bipush 1
// 21c: goto 22e
// 21f: ldc2_w -4961152559238125489
// 222: lload 2
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: bipush 0
// 22a: goto 22e
// 22d: bipush 0
// 22e: lload 2
// 22f: lconst_0
// 230: lcmp
// 231: ifle 252
// 234: ifeq 245
// 237: bipush 0
// 238: goto 374
// 23b: ldc2_w -4961152559238125489
// 23e: lload 2
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: sipush 24704
// 248: ldc2_w 1752766878670876043
// 24b: lload 2
// 24c: lxor
// 24d: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: iload 30
// 254: lload 2
// 255: lconst_0
// 256: lcmp
// 257: ifle 29d
// 25a: aload 20
// 25c: ifnull 29d
// 25f: if_icmpgt 2b2
// 262: goto 26f
// 265: ldc2_w -4961152559238125489
// 268: lload 2
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: iload 30
// 271: aload 20
// 273: ifnull 2af
// 276: goto 283
// 279: ldc2_w -4961152559238125489
// 27c: lload 2
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: sipush 29734
// 286: ldc2_w 1129931579739076907
// 289: lload 2
// 28a: lxor
// 28b: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: goto 29d
// 293: ldc2_w -4961152559238125489
// 296: lload 2
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: if_icmpge 2ae
// 2a0: bipush 1
// 2a1: goto 2b3
// 2a4: ldc2_w -4961152559238125489
// 2a7: lload 2
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: bipush 0
// 2af: goto 2b3
// 2b2: bipush 0
// 2b3: lload 2
// 2b4: lconst_0
// 2b5: lcmp
// 2b6: iflt 2e3
// 2b9: ifeq 2d6
// 2bc: sipush 22594
// 2bf: ldc2_w 9057410206450734407
// 2c2: lload 2
// 2c3: lxor
// 2c4: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: goto 374
// 2cc: ldc2_w -4961152559238125489
// 2cf: lload 2
// 2d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: athrow
// 2d6: sipush 27363
// 2d9: ldc2_w 3026058927831148517
// 2dc: lload 2
// 2dd: lxor
// 2de: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: iload 30
// 2e5: lload 2
// 2e6: lconst_0
// 2e7: lcmp
// 2e8: ifle 32e
// 2eb: aload 20
// 2ed: ifnull 32e
// 2f0: if_icmpgt 343
// 2f3: goto 300
// 2f6: ldc2_w -4961152559238125489
// 2f9: lload 2
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: iload 30
// 302: aload 20
// 304: ifnull 340
// 307: goto 314
// 30a: ldc2_w -4961152559238125489
// 30d: lload 2
// 30e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: athrow
// 314: sipush 17412
// 317: ldc2_w 4669133138654677256
// 31a: lload 2
// 31b: lxor
// 31c: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: goto 32e
// 324: ldc2_w -4961152559238125489
// 327: lload 2
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: if_icmpge 33f
// 331: bipush 1
// 332: goto 344
// 335: ldc2_w -4961152559238125489
// 338: lload 2
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: bipush 0
// 340: goto 344
// 343: bipush 0
// 344: lload 2
// 345: lconst_0
// 346: lcmp
// 347: ifle 36a
// 34a: ifeq 367
// 34d: sipush 19615
// 350: ldc2_w 7699968209611997590
// 353: lload 2
// 354: lxor
// 355: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35a: goto 374
// 35d: ldc2_w -4961152559238125489
// 360: lload 2
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: sipush 17835
// 36a: ldc2_w 6186678785834371236
// 36d: lload 2
// 36e: lxor
// 36f: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 374: istore 31
// 376: aload 28
// 378: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 37d: checkcast su/catlean/n7
// 380: iload 23
// 382: sipush 24704
// 385: ldc2_w 1752766878670876043
// 388: lload 2
// 389: lxor
// 38a: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: irem
// 390: i2f
// 391: ldc 20.0
// 393: fmul
// 394: fload 21
// 396: fadd
// 397: ldc 5.0
// 399: fadd
// 39a: iload 31
// 39c: i2f
// 39d: fload 22
// 39f: fadd
// 3a0: ldc 30.0
// 3a2: fadd
// 3a3: iload 4
// 3a5: i2f
// 3a6: iload 5
// 3a8: i2f
// 3a9: lload 16
// 3ab: dup2_x1
// 3ac: pop2
// 3ad: aload 1
// 3ae: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 3b1: aload 20
// 3b3: lload 2
// 3b4: lconst_0
// 3b5: lcmp
// 3b6: iflt 437
// 3b9: ifnull 435
// 3bc: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 3bf: ifnonnull 42d
// 3c2: goto 3cf
// 3c5: ldc2_w -4961152559238125489
// 3c8: lload 2
// 3c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: athrow
// 3cf: aload 1
// 3d0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3d3: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 3d6: pop
// 3d7: aload 1
// 3d8: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3db: iload 23
// 3dd: sipush 24704
// 3e0: ldc2_w 1752766878670876043
// 3e3: lload 2
// 3e4: lxor
// 3e5: invokedynamic x (IJ)I bsm=su/catlean/dw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: irem
// 3eb: i2f
// 3ec: ldc 20.0
// 3ee: fmul
// 3ef: fload 21
// 3f1: fadd
// 3f2: ldc 6.0
// 3f4: fadd
// 3f5: iload 31
// 3f7: i2f
// 3f8: fload 22
// 3fa: fadd
// 3fb: ldc 31.0
// 3fd: fadd
// 3fe: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 401: pop
// 402: aload 1
// 403: aload 28
// 405: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 40a: checkcast net/minecraft/class_1792
// 40d: invokevirtual net/minecraft/class_1792.method_8389 ()Lnet/minecraft/class_1792;
// 410: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 413: bipush 0
// 414: bipush 0
// 415: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 418: aload 1
// 419: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 41c: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 41f: pop
// 420: goto 42d
// 423: ldc2_w -4961152559238125489
// 426: lload 2
// 427: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42c: athrow
// 42d: iload 23
// 42f: bipush 1
// 430: iadd
// 431: istore 23
// 433: nop
// 434: nop
// 435: aload 20
// 437: ifnonnull 193
// 43a: bipush 1
// 43b: anewarray 365
// 43e: lload 2
// 43f: lconst_0
// 440: lcmp
// 441: ifle 1b6
// 444: ldc2_w -4931292738239090259
// 447: lload 2
// 448: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44d: nop
// 44e: aload 20
// 450: ifnull 47e
// 453: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 456: dup
// 457: ifnull 481
// 45a: goto 467
// 45d: ldc2_w -4961152559238125489
// 460: lload 2
// 461: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 466: athrow
// 467: aload 1
// 468: iload 4
// 46a: iload 5
// 46c: lload 18
// 46e: invokevirtual su/catlean/dj.E (Lnet/minecraft/class_332;IIJ)V
// 471: goto 47e
// 474: ldc2_w -4961152559238125489
// 477: lload 2
// 478: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47d: athrow
// 47e: goto 482
// 481: pop
// 482: return
}

@Override
public void T(long a, int mouseX, int mouseY, int mouseButton) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 83277054500049
// 05: lxor
// 06: lstore 6
// 08: dup2
// 09: ldc2_w 0
// 0c: lxor
// 0d: lstore 8
// 0f: pop2
// 10: ldc2_w 8772223444408192920
// 13: lload 1
// 14: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: astore 10
// 1b: aload 0
// 1c: aload 10
// 1e: ifnull 6f
// 21: lload 8
// 23: iload 3
// 24: iload 4
// 26: iload 5
// 28: invokespecial su/catlean/dj.T (JIII)V
// 2b: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 2e: ifnull 61
// 31: goto 3e
// 34: ldc2_w 8779785248991652529
// 37: lload 1
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 41: dup
// 42: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 45: lload 8
// 47: iload 3
// 48: iload 4
// 4a: iload 5
// 4c: invokevirtual su/catlean/dj.T (JIII)V
// 4f: aload 10
// 51: ifnonnull e9
// 54: goto 61
// 57: ldc2_w 8779785248991652529
// 5a: lload 1
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: aload 0
// 62: goto 6f
// 65: ldc2_w 8779785248991652529
// 68: lload 1
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: getfield su/catlean/dw.A Ljava/util/Map;
// 72: astore 11
// 74: bipush 0
// 75: istore 12
// 77: aload 11
// 79: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 7e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 83: astore 13
// 85: aload 13
// 87: invokeinterface java/util/Iterator.hasNext ()Z 1
// 8c: ifeq da
// 8f: aload 13
// 91: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 96: checkcast java/util/Map$Entry
// 99: astore 14
// 9b: aload 14
// 9d: astore 15
// 9f: bipush 0
// a0: istore 16
// a2: aload 15
// a4: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// a9: checkcast su/catlean/n7
// ac: iload 3
// ad: i2f
// ae: iload 4
// b0: i2f
// b1: lload 6
// b3: lload 1
// b4: lconst_0
// b5: lcmp
// b6: iflt e6
// b9: invokevirtual su/catlean/n7.P (FFJ)V
// bc: nop
// bd: aload 10
// bf: ifnull db
// c2: aload 10
// c4: ifnonnull 85
// c7: lload 1
// c8: lconst_0
// c9: lcmp
// ca: iflt bd
// cd: goto da
// d0: ldc2_w 8779785248991652529
// d3: lload 1
// d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9: athrow
// da: nop
// db: aload 0
// dc: getfield su/catlean/dw.D Lsu/catlean/n7;
// df: iload 3
// e0: i2f
// e1: iload 4
// e3: i2f
// e4: lload 6
// e6: invokevirtual su/catlean/n7.P (FFJ)V
// e9: return
}

@Override
public void w(int key, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: dup2
// 02: ldc2_w 0
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w 680427717724389204
// 0c: lload 2
// 0d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: aload 0
// 13: iload 1
// 14: lload 4
// 16: invokespecial su/catlean/dj.w (IJ)V
// 19: astore 6
// 1b: aload 6
// 1d: ifnull 47
// 20: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 23: dup
// 24: ifnull 4a
// 27: goto 34
// 2a: ldc2_w 654288527636028029
// 2d: lload 2
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: iload 1
// 35: lload 4
// 37: invokevirtual su/catlean/dj.w (IJ)V
// 3a: goto 47
// 3d: ldc2_w 654288527636028029
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: goto 4b
// 4a: pop
// 4b: return
}

@Override
public void I(long a, char char) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 0
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w 6895429091544131988
// 0c: lload 1
// 0d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: aload 0
// 13: lload 4
// 15: iload 3
// 16: invokespecial su/catlean/dj.I (JC)V
// 19: astore 6
// 1b: aload 6
// 1d: ifnull 47
// 20: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 23: dup
// 24: ifnull 4a
// 27: goto 34
// 2a: ldc2_w 6905248229469752509
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: lload 4
// 36: iload 3
// 37: invokevirtual su/catlean/dj.I (JC)V
// 3a: goto 47
// 3d: ldc2_w 6905248229469752509
// 40: lload 1
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: goto 4b
// 4a: pop
// 4b: return
}

@Override
public void a(double mouseX, double mouseY, double verticalAmount, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 7
// 02: dup2
// 03: ldc2_w 0
// 06: lxor
// 07: lstore 9
// 09: pop2
// 0a: ldc2_w 8942245335760423484
// 0d: lload 7
// 0f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14: aload 0
// 15: dload 1
// 16: dload 3
// 17: dload 5
// 19: lload 9
// 1b: invokespecial su/catlean/dj.a (DDDJ)V
// 1e: astore 11
// 20: aload 11
// 22: ifnull 51
// 25: getstatic su/catlean/dw.C Lsu/catlean/dj;
// 28: dup
// 29: ifnull 54
// 2c: goto 3a
// 2f: ldc2_w 8970077909317693205
// 32: lload 7
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: dload 1
// 3b: dload 3
// 3c: dload 5
// 3e: lload 9
// 40: invokevirtual su/catlean/dj.a (DDDJ)V
// 43: goto 51
// 46: ldc2_w 8970077909317693205
// 49: lload 7
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: goto 55
// 54: pop
// 55: return
}

private static final Unit l(dw var0, String var1) {
long var2 = a ^ 39683465804750L;
long var4 = var2 ^ 93641016133577L;
Intrinsics.checkNotNullParameter(var1, b<"p">(24906, 1327771678608287286L ^ var2));
var0.J(var1, var4);
dj var10000 = C;
Intrinsics.checkNotNull(C);
var10000.L(true);
return Unit.INSTANCE;
}

private static final Unit s(dw var0, String var1) {
long var2 = a ^ 23472141640334L;
long var10001 = var2 ^ 103615973571108L;
int var4 = (int)((var2 ^ 103615973571108L) >>> 32);
int var5 = (int)((var2 ^ 103615973571108L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var1, b<"p">(17390, 2962418372215676371L ^ var2));
var0.H(var4, var1, var5, (char)var6);
return Unit.INSTANCE;
}

private static final Unit U(dw var0) {
long var1 = a ^ 95396929469541L;
long var3 = var1 ^ 139528571775403L;
long var5 = var1 ^ 109574520643512L;
Iterable var8 = yl.g.m().s(var3);
_g[] var10000 = vm.a<"Å">(-8791832221606202408L, var1);
boolean var9 = false;
_g[] var7 = var10000;
Collection var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var8, c<"x">(6678, 7821618932099754411L ^ var1)));
boolean var12 = false;
Iterator var13 = var8.iterator();

while (true) {
if (var13.hasNext()) {
Object var14 = var13.next();
var21 = var11;
mh var15 = (mh)var14;
if (var7 == null) {
break;
}

boolean var16 = false;
var11.add(var15.R());
if (var7 != null) {
continue;
}
}

var21 = var11;
break;
}

List var22 = (List)var21;
Function1 var18 = dw::s;
Function1 var19 = dw::l;
List var20 = var22;
C = new db(var5, var20, var19, var18);
return Unit.INSTANCE;
}

private static final boolean Y(String var0, mh var1) {
long var2 = a ^ 21475294985657L;
Intrinsics.checkNotNullParameter(var1, b<"p">(17390, 2962410886423085796L ^ var2));
return Intrinsics.areEqual(var1.R(), var0);
}

private static final boolean G(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final Unit i(dw var0, int var1, class_1792 var2) {
long var3 = a ^ 9368762449535L;
int var5 = (int)((var3 ^ 132077789849138L) >>> 32);
long var6 = (var3 ^ 132077789849138L) << 32 >>> 32;
Intrinsics.checkNotNullParameter(var2, b<"p">(12297, 6651055657024729792L ^ var3));
var0.Y(var1, var5, var2, var6);
dj var10000 = C;
Intrinsics.checkNotNull(C);
var10000.L(true);
return Unit.INSTANCE;
}

private static final Unit N(class_1792 var0, dw var1, int var2) {
long var3 = a ^ 51585089650204L;
int var5 = (int)((var3 ^ 56551229650963L) >>> 48);
long var6 = (var3 ^ 56551229650963L) << 16 >>> 16;
class_1792[] var8 = new class_1792[]{var0};
C = new dr(CollectionsKt.mutableListOf(var8), dw::i, (short)var5, var6);
return Unit.INSTANCE;
}

public static final dj Z() {
return C;
}

public static final void J(dj <set-?>) {
C = <set-?>;
}

static {
long var20 = a ^ 123407693425694L;
_g[] var10000 = new _g[3];
vm.a<"Å">(var10000, -3080911460543184825L, var20);
Cipher var11;
Cipher var25 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "U\u0094Á\u0091\u008dèÆû\u0000\u0013ÓÎ\"ÕZ´\u00188Ó\u008c\u0098KRªlg æ\u008e\u0098\u0001ü\u009aEk2H\u0001i=ð\u0010¼;j+ìN¥\u0088ØbÓvæë\u0002K\u0010¸Ì\u0096;ø½M\u0086\t\bÝ\u009c\u0015bPa\u0018Z\u009f\u008c\u009c\u009d\u008a«\bBð$9ê@\u0006\u0010:\r^ÒÊÜ®\u0015\u0010\u008e\u0084«\u009cÕé<oÙE\u001d(^ú\u0002Ò";
int var17 = "U\u0094Á\u0091\u008dèÆû\u0000\u0013ÓÎ\"ÕZ´\u00188Ó\u008c\u0098KRªlg æ\u008e\u0098\u0001ü\u009aEk2H\u0001i=ð\u0010¼;j+ìN¥\u0088ØbÓvæë\u0002K\u0010¸Ì\u0096;ø½M\u0086\t\bÝ\u009c\u0015bPa\u0018Z\u009f\u008c\u009c\u009d\u008a«\bBð$9ê@\u0006\u0010:\r^ÒÊÜ®\u0015\u0010\u008e\u0084«\u009cÕé<oÙE\u001d(^ú\u0002Ò"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var26 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var24 += var14) >= var17) {
c = var18;
d = new String[8];
m = new HashMap(13);
Cipher var0;
Cipher var28 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var28.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[15];
int var3 = 0;
String var4 = "\u00875}$Ç\tP6\u009fqp#OH!\u008b\u001erãÂh\u0005¨}ü\u0005\u009b\u008c\bD\u009aØ\u0091\u0096ó`ü$\u0018üÅS£§D`V¿\u000e\u000eF! I\u0089W\u0095µ5\u009a´êv\u0001T\u001aê\u0007+Ç¢ÿé Ãë4\"\u0017\u0089aì\u0085\u0017G§è( fÊ`Ä«\u0004¥¹\r\u00058\u001e\b\rH";
int var5 = "\u00875}$Ç\tP6\u009fqp#OH!\u008b\u001erãÂh\u0005¨}ü\u0005\u009b\u008c\bD\u009aØ\u0091\u0096ó`ü$\u0018üÅS£§D`V¿\u000e\u000eF! I\u0089W\u0095µ5\u009a´êv\u0001T\u001aê\u0007+Ç¢ÿé Ãë4\"\u0017\u0089aì\u0085\u0017G§è( fÊ`Ä«\u0004¥¹\r\u00058\u001e\b\rH"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
i = var6;
k = new Integer[15];
X = new ma(null);
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "¼Ù÷\riBæÜÐÁév=?3e";
var5 = "¼Ù÷\riBæÜÐÁév=?3e".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var37;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "8ùr*\u0097\u009aø\u0094q+Á\u0099:cd¢\u0018Ý¢\\.FÒMäY\u009b\n\u0017\u009d\u0098R\u008c{\u0005=Z\u001e,Ð?";
var17 = "8ùr*\u0097\u009aø\u0094q+Á\u0099:cd¢\u0018Ý¢\\.FÒMäY\u009b\n\u0017\u009d\u0098R\u008c{\u0005=Z\u001e,Ð?".length();
var14 = 16;
var24 = -1;
}

var26 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void u(_g[] var0) {
u = var0;
}

public static _g[] g() {
return u;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1244;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/dw", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/dw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14268;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
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
throw new RuntimeException("su/catlean/dw", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/dw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
