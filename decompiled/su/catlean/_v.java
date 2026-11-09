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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _v extends _g {
@NotNull
public static final _v V;
static final KProperty[] l;
@NotNull
private static final cw S;
private static final long a = yz.a(-672488293640877659L, 3372041345910309674L, MethodHandles.lookup().lookupClass()).a(7836620945013L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private _v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 1758225847788L;
super(b<"g">(15770, 2829208215511212632L ^ var1), jt.c(), null, 4, null, var3);
}

private final f9 e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114842561150845L;
return (f9)S.E(this, var3, l[0]);
}

private final void T(f9 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 107311884753447L;
S.b(this, var4, l[0], var1);
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 64129331416845
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 44030506242343
// 0b: lxor
// 0c: dup2
// 0d: bipush 48
// 0f: lushr
// 10: l2i
// 11: istore 5
// 13: dup2
// 14: bipush 16
// 16: lshl
// 17: bipush 32
// 19: lushr
// 1a: l2i
// 1b: istore 6
// 1d: dup2
// 1e: bipush 48
// 20: lshl
// 21: bipush 48
// 23: lushr
// 24: l2i
// 25: istore 7
// 27: pop2
// 28: pop2
// 29: ldc2_w 1373154656538072419
// 2c: lload 1
// 2d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: astore 8
// 34: lload 3
// 35: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 38: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 3b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 3e: dup
// 3f: sipush 17572
// 42: ldc2_w 470467595243342866
// 45: lload 1
// 46: lxor
// 47: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 4f: aload 8
// 51: ifnonnull 94
// 54: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 57: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 5c: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 5f: iload 5
// 61: i2s
// 62: swap
// 63: iload 6
// 65: swap
// 66: iload 7
// 68: i2c
// 69: swap
// 6a: invokestatic su/catlean/bx.k (SICI)Z
// 6d: ifne 98
// 70: goto 7d
// 73: ldc2_w 1417788398739624846
// 76: lload 1
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: lload 3
// 7e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 81: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 84: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 87: goto 94
// 8a: ldc2_w 1417788398739624846
// 8d: lload 1
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: bipush 0
// 95: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 98: lload 1
// 99: lconst_0
// 9a: lcmp
// 9b: ifle b0
// 9e: aload 8
// a0: ifnull bd
// a3: bipush 3
// a4: anewarray 142
// a7: ldc2_w 1397120299992947038
// aa: lload 1
// ab: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b0: goto bd
// b3: ldc2_w 1417788398739624846
// b6: lload 1
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: return
}

@Flow(
priority = -10
)
private final void n(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_v.a J
// 003: ldc2_w 59620558697954
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 38160410127035
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 107048225744028
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 6926413035070
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 112023685522334
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 27618155066
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 134243311289992
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 2273648747677
// 046: lxor
// 047: lstore 17
// 049: pop2
// 04a: ldc2_w 8554715057736675541
// 04d: lload 2
// 04e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: lload 4
// 055: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 058: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 05b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 05e: bipush 1
// 05f: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 062: astore 19
// 064: lload 17
// 066: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 069: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 06c: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
// 06f: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 072: invokevirtual net/minecraft/class_1796.method_7904 (Lnet/minecraft/class_1799;)Z
// 075: aload 19
// 077: ifnonnull 093
// 07a: ifeq 08b
// 07d: goto 08a
// 080: ldc2_w 8510369458986939960
// 083: lload 2
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: return
// 08b: lload 17
// 08d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 090: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 093: aload 19
// 095: ifnonnull 144
// 098: ifne 12f
// 09b: goto 0a8
// 09e: ldc2_w 8510369458986939960
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: lload 13
// 0aa: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ad: lload 17
// 0af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b2: checkcast net/minecraft/class_1297
// 0b5: lload 17
// 0b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ba: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 0bd: dconst_0
// 0be: ldc2_w -1.0
// 0c1: dconst_0
// 0c2: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 0c5: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 0c8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0cd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0d2: aload 19
// 0d4: ifnonnull 144
// 0d7: goto 0e4
// 0da: ldc2_w 8510369458986939960
// 0dd: lload 2
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: ifeq 12f
// 0e7: goto 0f4
// 0ea: ldc2_w 8510369458986939960
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: aload 0
// 0f5: new su/catlean/_w
// 0f8: dup
// 0f9: lload 17
// 0fb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fe: invokevirtual net/minecraft/class_746.method_36454 ()F
// 101: lload 9
// 103: ldc 90.0
// 105: bipush 0
// 106: aconst_null
// 107: sipush 1979
// 10a: ldc2_w 7358855406447143063
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic s (IJ)I bsm=su/catlean/_v.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: aconst_null
// 115: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 118: lload 15
// 11a: invokespecial su/catlean/_v.w (Lsu/catlean/_w;J)V
// 11d: aload 19
// 11f: ifnull 2aa
// 122: goto 12f
// 125: ldc2_w 8510369458986939960
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: lload 17
// 131: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 134: getfield net/minecraft/class_746.field_5976 Z
// 137: goto 144
// 13a: ldc2_w 8510369458986939960
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: ifeq 2aa
// 147: aload 0
// 148: lload 17
// 14a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14d: iload 6
// 14f: i2b
// 150: swap
// 151: lload 7
// 153: dup2_x1
// 154: pop2
// 155: checkcast net/minecraft/class_1297
// 158: invokevirtual su/catlean/_v.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 15b: checkcast net/minecraft/class_2374
// 15e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 161: dup
// 162: sipush 24011
// 165: ldc2_w 3595168604486938826
// 168: lload 2
// 169: lxor
// 16a: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 172: astore 20
// 174: getstatic su/catlean/y7.b Lkotlin/enums/EnumEntries;
// 177: checkcast java/lang/Iterable
// 17a: astore 22
// 17c: bipush 0
// 17d: istore 23
// 17f: aload 22
// 181: astore 24
// 183: new java/util/ArrayList
// 186: dup
// 187: invokespecial java/util/ArrayList.<init> ()V
// 18a: checkcast java/util/Collection
// 18d: astore 25
// 18f: bipush 0
// 190: istore 26
// 192: aload 24
// 194: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 199: astore 27
// 19b: aload 27
// 19d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1a2: ifeq 21a
// 1a5: aload 27
// 1a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ac: astore 28
// 1ae: aload 28
// 1b0: checkcast net/minecraft/class_2350
// 1b3: astore 29
// 1b5: bipush 0
// 1b6: istore 30
// 1b8: aload 19
// 1ba: ifnonnull 2aa
// 1bd: aload 29
// 1bf: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 1c2: aload 19
// 1c4: ifnonnull 1f6
// 1c7: goto 1d4
// 1ca: ldc2_w 8510369458986939960
// 1cd: lload 2
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: if_acmpeq 207
// 1d7: goto 1e4
// 1da: ldc2_w 8510369458986939960
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: aload 29
// 1e6: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 1e9: goto 1f6
// 1ec: ldc2_w 8510369458986939960
// 1ef: lload 2
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: if_acmpeq 207
// 1f9: bipush 1
// 1fa: goto 208
// 1fd: ldc2_w 8510369458986939960
// 200: lload 2
// 201: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: athrow
// 207: bipush 0
// 208: ifeq 19b
// 20b: aload 25
// 20d: aload 28
// 20f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 214: pop
// 215: aload 19
// 217: ifnull 19b
// 21a: aload 25
// 21c: checkcast java/util/List
// 21f: nop
// 220: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 225: astore 21
// 227: aload 21
// 229: invokeinterface java/util/Iterator.hasNext ()Z 1
// 22e: ifeq 2aa
// 231: aload 21
// 233: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 238: checkcast net/minecraft/class_2350
// 23b: astore 22
// 23d: aload 20
// 23f: aload 22
// 241: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 244: dup
// 245: sipush 25747
// 248: ldc2_w 1854254657860798864
// 24b: lload 2
// 24c: lxor
// 24d: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 255: astore 23
// 257: aload 19
// 259: ifnonnull 2a5
// 25c: lload 13
// 25e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 261: aload 23
// 263: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 266: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 269: ifne 227
// 26c: goto 279
// 26f: ldc2_w 8510369458986939960
// 272: lload 2
// 273: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 278: athrow
// 279: aload 0
// 27a: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 27d: aload 23
// 27f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 282: dconst_0
// 283: ldc2_w -0.5
// 286: dconst_0
// 287: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 28a: dup
// 28b: sipush 21920
// 28e: ldc2_w 8008862498267543725
// 291: lload 2
// 292: lxor
// 293: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 298: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 29b: lload 11
// 29d: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 2a0: lload 15
// 2a2: invokespecial su/catlean/_v.w (Lsu/catlean/_w;J)V
// 2a5: aload 19
// 2a7: ifnull 227
// 2aa: return
}

private final void w(_w var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 105015972662253L;
long var6 = var2 ^ 120675537797635L;
long var8 = var2 ^ 109146161815536L;
long var10 = var2 ^ 132951916184770L;
fg var12 = gg.P.X(var8, _v::r, this.e(var6));

try {
if (var12.R()) {
_8.P.C(var4, new t5(var1, var10, c<"s">(10290, 3325425178926318468L ^ var2), _v::j));
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -972051132253900128L, var2);
}
}

private static final boolean r(class_1799 var0) {
long var1 = a ^ 41209188048905L;
Intrinsics.checkNotNullParameter(var0, b<"g">(16684, 2423483384492702144L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_49098);
}

private static final Unit g() {
long var0 = a ^ 88924202013840L;
long var2 = var0 ^ 119491187250533L;
long var4 = var0 ^ 110615126143402L;
ag.K(class_1268.field_5808, 0.0F, var2, 0.0F, c<"s">(19815, 447135570754765626L ^ var0), null);
_r.a(var4, (class_2596)(new class_2879(class_1268.field_5808)));
return Unit.INSTANCE;
}

private static final Unit j(fg var0) {
long var1 = a ^ 22178465347543L;
long var3 = var1 ^ 95574711372110L;
long var5 = var1 ^ 66630837486766L;
gg.P.T(var3, var0.a(), V.e(var5), _v::g);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 45973755259595L;
long var22 = var20 ^ 10429019779070L;
long var24 = var20 ^ 100157637727421L;
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
String var15 = "¬Ð\u009d§mð;B\u007f#WÉ\u008fn\u0000q°G@\u000f{iæ=Zh\u009b\u0006\u0019FI5\u0010Sâ\u007fmo<RØ\u0092í§ØJùÀÉ\u0010@tüb\tá\u0007Ä\u0098r(³ðrÎ$0mv\u000eç\"5\u008ecnsæ6&\u0090c\u0081áp\u009c\u009d\u0003e ä5\u0087\u0004Ä\t,i¯\u009dBçÛ·\u008a2Z\u008feôÁ\u001b)\u0002[ p\u0082\"\u001c«ÓOj\u0089ìgV\u0005\u001bÓ\u0090\u0006'JÀ\u00061~_ãêt \u0089\u00ad\u008a\u0006\u00881Ã¼9wy¶\u001céF\u0093VS\u0087ã×ûíÕ\u0004¦ý]õ\u0002Þ×\u00969Ù\u0085\\*j\u0093ÿ´¦t\u0004©vhäd\u0017oÕßKË\u0007h\u0095ûÖ\u0088´2\u0014\u001c\u00184\u0080²¾¹\u000b¾\u0086è§scspvæ,Ú«N[_+\u008dn²\u0089×=\u0099+\u00ad*k`\u0000\u000bq8¶ºÄ\u0013¾\u001b\u009c1¿ÜÔqÑý\u00192\u0096Ñä\u008c\n\u0098.\u0017ùV\büÙU'\u0006\u0098lK\u0018\u0014s1\u001e05A\u0092\u0082=ÀàA§}PVù\u0001\\\u0091\u0003f%";
int var17 = "¬Ð\u009d§mð;B\u007f#WÉ\u008fn\u0000q°G@\u000f{iæ=Zh\u009b\u0006\u0019FI5\u0010Sâ\u007fmo<RØ\u0092í§ØJùÀÉ\u0010@tüb\tá\u0007Ä\u0098r(³ðrÎ$0mv\u000eç\"5\u008ecnsæ6&\u0090c\u0081áp\u009c\u009d\u0003e ä5\u0087\u0004Ä\t,i¯\u009dBçÛ·\u008a2Z\u008feôÁ\u001b)\u0002[ p\u0082\"\u001c«ÓOj\u0089ìgV\u0005\u001bÓ\u0090\u0006'JÀ\u00061~_ãêt \u0089\u00ad\u008a\u0006\u00881Ã¼9wy¶\u001céF\u0093VS\u0087ã×ûíÕ\u0004¦ý]õ\u0002Þ×\u00969Ù\u0085\\*j\u0093ÿ´¦t\u0004©vhäd\u0017oÕßKË\u0007h\u0095ûÖ\u0088´2\u0014\u001c\u00184\u0080²¾¹\u000b¾\u0086è§scspvæ,Ú«N[_+\u008dn²\u0089×=\u0099+\u00ad*k`\u0000\u000bq8¶ºÄ\u0013¾\u001b\u009c1¿ÜÔqÑý\u00192\u0096Ñä\u008c\n\u0098.\u0017ùV\büÙU'\u0006\u0098lK\u0018\u0014s1\u001e05A\u0092\u0082=ÀàA§}PVù\u0001\\\u0091\u0003f%"
.length();
char var14 = ' ';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
c = new String[9];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "~\u001ekÄÈ^'n\u000f÷É\t¡ìf#";
int var5 = "~\u001ekÄÈ^'n\u000f÷É\t¡ìf#".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
KProperty[] var26 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_v.class, b<"g">(19144, 7512583075081271523L ^ var20), b<"g">(24689, 4512529183072555614L ^ var20), 0)
)
};
l = var26;
V = new _v(var22);
S = yp.L(V, b<"g">(14186, 7041083590190777671L ^ var20), f9.SILENT_FULL, null, null, c<"s">(31195, 3412925358836533727L ^ var20), null, var24);
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "\b°(\r§\u0099\u008d6JÃåh½ã£Æ";
var5 = "\b°(\r§\u0099\u008d6JÃåh½ã£Æ".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "Å\u0004nZÄ\u008f4Ã'\u0011M4Ó\u0003^µ\u0088È\u0090\u0086J\u0016\u009e:\u0018\u009c\u00152Ìö(_§ ÎÈ÷'\u0095ý\u008c\u0011\u0011\u0082þ\u0083ü\u0093\u0083";
var17 = "Å\u0004nZÄ\u008f4Ã'\u0011M4Ó\u0003^µ\u0088È\u0090\u0086J\u0016\u009e:\u0018\u009c\u00152Ìö(_§ ÎÈ÷'\u0095ý\u008c\u0011\u0011\u0082þ\u0083ü\u0093\u0083"
.length();
var14 = 24;
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6903;
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
throw new RuntimeException("su/catlean/_v", var10);
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
throw new RuntimeException("su/catlean/_v" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22751;
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
throw new RuntimeException("su/catlean/_v", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/_v" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
