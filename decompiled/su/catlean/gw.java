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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_7202;
import net.minecraft.class_7204;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class gw implements ym {
@NotNull
public static final gw Y;
@NotNull
private static final Map s;
@NotNull
private static final Map y;
@NotNull
private static class_243 B;
private static int[] W;
private static final long a = yz.a(-7212214856345696819L, 378907001664476378L, MethodHandles.lookup().lookupClass()).a(242930208664616L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private gw() {
}

@NotNull
public final Map r() {
return y;
}

@Flow(
priority = 10
)
public final void M(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: ldc2_w 106546504980728
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 3726227952921
// 00d: lxor
// 00e: dup2
// 00f: bipush 16
// 011: lushr
// 012: lstore 4
// 014: dup2
// 015: bipush 48
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 6
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 9920468344805
// 023: lxor
// 024: lstore 7
// 026: pop2
// 027: aload 1
// 028: ldc "e"
// 02a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02d: new java/util/HashMap
// 030: dup
// 031: getstatic su/catlean/gw.y Ljava/util/Map;
// 034: invokespecial java/util/HashMap.<init> (Ljava/util/Map;)V
// 037: checkcast java/util/Map
// 03a: astore 10
// 03c: bipush 0
// 03d: istore 11
// 03f: ldc2_w 991909883609414715
// 042: lload 2
// 043: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: aload 10
// 04a: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 04f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 054: astore 12
// 056: astore 9
// 058: aload 12
// 05a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05f: ifeq 0f3
// 062: aload 12
// 064: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 069: checkcast java/util/Map$Entry
// 06c: astore 13
// 06e: aload 13
// 070: astore 14
// 072: bipush 0
// 073: istore 15
// 075: aload 14
// 077: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 07c: checkcast net/minecraft/class_2338
// 07f: astore 16
// 081: aload 14
// 083: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 088: checkcast java/lang/Number
// 08b: invokevirtual java/lang/Number.longValue ()J
// 08e: lstore 17
// 090: aload 9
// 092: ifnonnull 110
// 095: aload 9
// 097: ifnonnull 0ee
// 09a: goto 0a7
// 09d: ldc2_w 988485862313654427
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: invokestatic java/lang/System.currentTimeMillis ()J
// 0aa: lload 17
// 0ac: lsub
// 0ad: l2f
// 0ae: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 0b1: aconst_null
// 0b2: lload 4
// 0b4: bipush 1
// 0b5: iload 6
// 0b7: i2c
// 0b8: aconst_null
// 0b9: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 0bc: i2f
// 0bd: fconst_2
// 0be: fmul
// 0bf: fcmpl
// 0c0: ifle 0ec
// 0c3: goto 0d0
// 0c6: ldc2_w 988485862313654427
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 0d3: pop
// 0d4: getstatic su/catlean/gw.y Ljava/util/Map;
// 0d7: aload 16
// 0d9: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0de: pop
// 0df: goto 0ec
// 0e2: ldc2_w 988485862313654427
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: nop
// 0ed: nop
// 0ee: aload 9
// 0f0: ifnull 058
// 0f3: nop
// 0f4: lload 7
// 0f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f9: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0fc: dup
// 0fd: sipush 21216
// 100: ldc2_w 1328081510928694818
// 103: lload 2
// 104: lxor
// 105: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10d: putstatic su/catlean/gw.B Lnet/minecraft/class_243;
// 110: return
}

public final boolean F(@NotNull class_243 vec, long a) {
ax = a ^ ax;
long var4 = ax ^ 14981004585272L;

try {
Intrinsics.checkNotNullParameter(vec, a<"e">(28439, 4345141161897186118L ^ ax));
if (la.R(la.l, B, vec, false, null, false, b<"o">(14419, 564993326201983543L ^ ax), null, var4) == null) {
return true;
}
} catch (NoSuchElementException var6) {
throw vm.a<"Å">(var6, -2506837412686288871L, ax);
}

return false;
}

@NotNull
public final class_243 a(short a, int a, char a, @NotNull class_1297 entity) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/gw.a J
// 1a: lxor
// 1b: lstore 5
// 1d: lload 5
// 1f: dup2
// 20: ldc2_w 77285480964696
// 23: lxor
// 24: lstore 7
// 26: pop2
// 27: ldc2_w 8106118169793560966
// 2a: lload 5
// 2c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: aload 4
// 33: sipush 26022
// 36: ldc2_w 3252216019195720949
// 39: lload 5
// 3b: lxor
// 3c: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 44: astore 9
// 46: aload 4
// 48: aload 9
// 4a: ifnonnull 77
// 4d: lload 7
// 4f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 52: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 55: ifeq 75
// 58: goto 66
// 5b: ldc2_w 8073408116335379750
// 5e: lload 5
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: getstatic su/catlean/gw.B Lnet/minecraft/class_243;
// 69: areturn
// 6a: ldc2_w 8073408116335379750
// 6d: lload 5
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: aload 4
// 77: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 7a: dup
// 7b: sipush 24052
// 7e: ldc2_w 4553834311520079035
// 81: lload 5
// 83: lxor
// 84: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8c: areturn
}

@Nullable
public final t5 O(
@NotNull class_2338 bp,
int slot,
@NotNull xx interact,
@NotNull zr mode,
int a,
char a,
@NotNull y4 ignore,
float range,
float wallRange,
int priority,
@NotNull yi switch,
@NotNull List calcGhost,
boolean grim,
char a
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 5
// 002: i2l
// 003: bipush 32
// 005: lshl
// 006: iload 6
// 008: i2l
// 009: bipush 48
// 00b: lshl
// 00c: bipush 32
// 00e: lushr
// 00f: lor
// 010: iload 14
// 012: i2l
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: lor
// 01a: getstatic su/catlean/gw.a J
// 01d: lxor
// 01e: lstore 15
// 020: lload 15
// 022: dup2
// 023: ldc2_w 15790279692594
// 026: lxor
// 027: lstore 17
// 029: dup2
// 02a: ldc2_w 97621591445599
// 02d: lxor
// 02e: lstore 19
// 030: dup2
// 031: ldc2_w 105683341439734
// 034: lxor
// 035: lstore 21
// 037: dup2
// 038: ldc2_w 123108548917406
// 03b: lxor
// 03c: dup2
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 23
// 043: dup2
// 044: bipush 16
// 046: lshl
// 047: bipush 16
// 049: lushr
// 04a: lstore 24
// 04c: pop2
// 04d: pop2
// 04e: ldc2_w 294871851346163183
// 051: lload 15
// 053: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: aload 1
// 059: sipush 10130
// 05c: ldc2_w 2905159125879210666
// 05f: lload 15
// 061: lxor
// 062: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: astore 26
// 06c: aload 3
// 06d: sipush 2482
// 070: ldc2_w 3508048592486886585
// 073: lload 15
// 075: lxor
// 076: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07e: aload 4
// 080: sipush 15575
// 083: ldc2_w 3842056840219056589
// 086: lload 15
// 088: lxor
// 089: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 091: aload 7
// 093: sipush 23618
// 096: ldc2_w 4512737151387744617
// 099: lload 15
// 09b: lxor
// 09c: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a4: aload 11
// 0a6: sipush 28991
// 0a9: ldc2_w 4453691463412651063
// 0ac: lload 15
// 0ae: lxor
// 0af: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: aload 12
// 0b9: sipush 1263
// 0bc: ldc2_w 1414999542191284694
// 0bf: lload 15
// 0c1: lxor
// 0c2: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: aload 26
// 0cc: ifnonnull 101
// 0cf: aload 0
// 0d0: aload 1
// 0d1: lload 19
// 0d3: iload 2
// 0d4: aload 3
// 0d5: aload 7
// 0d7: fload 8
// 0d9: fload 9
// 0db: aload 12
// 0dd: invokevirtual su/catlean/gw.m (Lnet/minecraft/class_2338;JILsu/catlean/xx;Lsu/catlean/y4;FFLjava/util/List;)Lnet/minecraft/class_3965;
// 0e0: dup
// 0e1: ifnonnull 103
// 0e4: goto 0f2
// 0e7: ldc2_w 316287773003772239
// 0ea: lload 15
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: pop
// 0f3: goto 101
// 0f6: ldc2_w 316287773003772239
// 0f9: lload 15
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aconst_null
// 102: areturn
// 103: astore 27
// 105: iload 2
// 106: aload 11
// 108: aload 27
// 10a: aload 4
// 10c: aload 1
// 10d: invokedynamic invoke (ILsu/catlean/yi;Lnet/minecraft/class_3965;Lsu/catlean/zr;Lnet/minecraft/class_2338;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/gw.L (ILsu/catlean/yi;Lnet/minecraft/class_3965;Lsu/catlean/zr;Lnet/minecraft/class_2338;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 112: astore 28
// 114: aload 3
// 115: getstatic su/catlean/xx.GRIM Lsu/catlean/xx;
// 118: if_acmpne 161
// 11b: new su/catlean/ty
// 11e: dup
// 11f: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 122: aload 27
// 124: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 127: dup
// 128: sipush 923
// 12b: ldc2_w 6953640354163320452
// 12e: lload 15
// 130: lxor
// 131: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 139: lload 17
// 13b: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 13e: iload 13
// 140: invokevirtual su/catlean/_w.b (Z)Lsu/catlean/_w;
// 143: iload 23
// 145: i2s
// 146: swap
// 147: iload 10
// 149: aload 28
// 14b: lload 24
// 14d: invokespecial su/catlean/ty.<init> (SLsu/catlean/_w;ILkotlin/jvm/functions/Function0;J)V
// 150: checkcast su/catlean/t5
// 153: goto 192
// 156: ldc2_w 316287773003772239
// 159: lload 15
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: new su/catlean/t5
// 164: dup
// 165: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 168: aload 27
// 16a: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 16d: dup
// 16e: sipush 6982
// 171: ldc2_w 5431717784653463119
// 174: lload 15
// 176: lxor
// 177: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17f: lload 17
// 181: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 184: iload 13
// 186: invokevirtual su/catlean/_w.b (Z)Lsu/catlean/_w;
// 189: lload 21
// 18b: iload 10
// 18d: aload 28
// 18f: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 192: areturn
}

public static t5 P(
gw var0,
class_2338 var1,
int var2,
xx var3,
zr var4,
y4 var5,
float var6,
float var7,
int var8,
long var9,
yi var11,
List var12,
boolean var13,
int var14,
Object var15
) {
var9 = a ^ var9;
long var10001 = var9 ^ 110144670419690L;
int var16 = (int)((var9 ^ 110144670419690L) >>> 32);
int var17 = (int)((var9 ^ 110144670419690L) << 32 >>> 48);
int var18 = (int)(var10001 << 48 >>> 48);
_g[] var19 = vm.a<"Å">(-7309438018128155785L, var9);

int var10000;
label37: {
label36: {
try {
var10000 = var14 & b<"o">(12948, 7674558475904950077L ^ var9);
if (var19 != null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoSuchElementException var21) {
throw vm.a<"Å">(var21, -7279049866973286441L, var9);
}

var12 = new ArrayList();
}

var10000 = var14 & b<"o">(5849, 3361009165303987060L ^ var9);
}

label27: {
try {
if (var19 != null) {
break label27;
}

if (var10000 == 0) {
return var0.O(var1, var2, var3, var4, var16, (char)var17, var5, var6, var7, var8, var11, var12, (boolean)var13, (char)var18);
}
} catch (NoSuchElementException var20) {
throw vm.a<"Å">(var20, -7279049866973286441L, var9);
}

var10000 = 0;
}

var13 = var10000;
return var0.O(var1, var2, var3, var4, var16, (char)var17, var5, var6, var7, var8, var11, var12, (boolean)var13, (char)var18);
}

public final boolean x(@NotNull class_2338 bp, @NotNull xx interact, long a, @NotNull y4 ignore, float range, float wallRange) {
ax = a ^ ax;
long var8 = ax ^ 67633042807993L;
_g[] var10000 = vm.a<"Å">(706743995165308982L, ax);
Intrinsics.checkNotNullParameter(bp, a<"e">(10130, 2905227876885057395L ^ ax));
_g[] var10 = var10000;

label45: {
try {
Intrinsics.checkNotNullParameter(interact, a<"e">(31439, 2457503219419943464L ^ ax));
Intrinsics.checkNotNullParameter(ignore, a<"e">(17589, 7034935762847247433L ^ ax));
boolean var14 = y.containsKey(bp);
if (var10 != null) {
return var14;
}

if (!var14) {
break label45;
}
} catch (NoSuchElementException var12) {
throw vm.a<"Å">(var12, 701133845347990678L, ax);
}

return false;
}

try {
if (j(this, bp, -1, var8, interact, ignore, range, wallRange, null, b<"o">(12848, 3624898128719973594L ^ ax), null) != null) {
return true;
}
} catch (NoSuchElementException var11) {
throw vm.a<"Å">(var11, 701133845347990678L, ax);
}

return false;
}

public final void y(@NotNull class_7204 packetCreator, int a, int a, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 20093218366593L;
long var9 = var5 ^ 17941672860198L;
Intrinsics.checkNotNullParameter(packetCreator, a<"e">(3337, 1741705163685635107L ^ var5));
var var11 = (AutoCloseable & class_7202)zf.z(var7).method_41925().method_41937();
Throwable var12 = null;

try {
class_7202 var13 = (class_7202)var11;
boolean var14 = false;
zf.v(var9).field_3944.method_52787(packetCreator.predict(var13.method_41942()));
Unit var19 = Unit.INSTANCE;
} catch (Throwable var17) {
var12 = var17;
throw var17;
} finally {
AutoCloseableKt.closeFinally(var11, var12);
}
}

@Nullable
public final class_3965 m(
@NotNull class_2338 bp, long a, int slot, @NotNull xx interact, @NotNull y4 ignore, float range, float wallRange, @NotNull List calcGhost
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 122096349041007
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 10
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 11
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 98007267319348
// 022: lxor
// 023: lstore 12
// 025: dup2
// 026: ldc2_w 57600652114678
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 14
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 15
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 16
// 045: pop2
// 046: dup2
// 047: ldc2_w 114243418713275
// 04a: lxor
// 04b: lstore 17
// 04d: dup2
// 04e: ldc2_w 131034018128950
// 051: lxor
// 052: dup2
// 053: bipush 48
// 055: lushr
// 056: l2i
// 057: istore 19
// 059: dup2
// 05a: bipush 16
// 05c: lshl
// 05d: bipush 32
// 05f: lushr
// 060: l2i
// 061: istore 20
// 063: dup2
// 064: bipush 48
// 066: lshl
// 067: bipush 48
// 069: lushr
// 06a: l2i
// 06b: istore 21
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 52926051536648
// 072: lxor
// 073: lstore 22
// 075: dup2
// 076: ldc2_w 94278896796846
// 079: lxor
// 07a: lstore 24
// 07c: dup2
// 07d: ldc2_w 7427114059586
// 080: lxor
// 081: lstore 26
// 083: dup2
// 084: ldc2_w 112082813899292
// 087: lxor
// 088: lstore 28
// 08a: pop2
// 08b: aload 1
// 08c: sipush 10130
// 08f: ldc2_w 2905172001347061383
// 092: lload 2
// 093: lxor
// 094: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 09c: ldc2_w 16488539370811842
// 09f: lload 2
// 0a0: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: aload 5
// 0a7: sipush 31439
// 0aa: ldc2_w 2457419475362749404
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: aload 6
// 0b9: sipush 17589
// 0bc: ldc2_w 7034995471794546109
// 0bf: lload 2
// 0c0: lxor
// 0c1: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c9: astore 32
// 0cb: aload 9
// 0cd: sipush 20046
// 0d0: ldc2_w 163265130179833667
// 0d3: lload 2
// 0d4: lxor
// 0d5: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0dd: getstatic su/catlean/j2.X Lsu/catlean/j2;
// 0e0: lload 24
// 0e2: aload 1
// 0e3: invokevirtual su/catlean/j2.g (JLnet/minecraft/class_2338;)Z
// 0e6: ifeq 0f5
// 0e9: aconst_null
// 0ea: areturn
// 0eb: ldc2_w 22133521405474146
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: lload 17
// 0f7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0fa: ldc net/minecraft/class_1297
// 0fc: getstatic su/catlean/e4.j Lsu/catlean/e4;
// 0ff: lload 26
// 101: invokevirtual su/catlean/e4.f (J)Z
// 104: ifeq 126
// 107: new net/minecraft/class_238
// 10a: dup
// 10b: aload 1
// 10c: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 10f: ldc2_w -1.0E-12
// 112: dconst_0
// 113: ldc2_w -1.0E-12
// 116: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 119: goto 12e
// 11c: ldc2_w 22133521405474146
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: new net/minecraft/class_238
// 129: dup
// 12a: aload 1
// 12b: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 12e: invokevirtual net/minecraft/class_638.method_18467 (Ljava/lang/Class;Lnet/minecraft/class_238;)Ljava/util/List;
// 131: checkcast java/lang/Iterable
// 134: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 137: dup
// 138: sipush 22709
// 13b: ldc2_w 40919875423189404
// 13e: lload 2
// 13f: lxor
// 140: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 148: astore 33
// 14a: aload 6
// 14c: getstatic su/catlean/y4.ALL Lsu/catlean/y4;
// 14f: aload 32
// 151: ifnonnull 27d
// 154: if_acmpne 278
// 157: goto 164
// 15a: ldc2_w 22133521405474146
// 15d: lload 2
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: aload 33
// 166: checkcast java/lang/Iterable
// 169: astore 35
// 16b: bipush 0
// 16c: istore 36
// 16e: aload 35
// 170: astore 37
// 172: new java/util/ArrayList
// 175: dup
// 176: invokespecial java/util/ArrayList.<init> ()V
// 179: checkcast java/util/Collection
// 17c: astore 38
// 17e: bipush 0
// 17f: istore 39
// 181: aload 37
// 183: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 188: astore 40
// 18a: aload 40
// 18c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 191: ifeq 21d
// 194: aload 40
// 196: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 19b: astore 41
// 19d: aload 41
// 19f: checkcast net/minecraft/class_1297
// 1a2: astore 42
// 1a4: bipush 0
// 1a5: istore 43
// 1a7: lload 2
// 1a8: lconst_0
// 1a9: lcmp
// 1aa: iflt 29d
// 1ad: aload 42
// 1af: instanceof net/minecraft/class_1542
// 1b2: aload 32
// 1b4: ifnonnull 29b
// 1b7: aload 32
// 1b9: lload 2
// 1ba: lconst_0
// 1bb: lcmp
// 1bc: iflt 1f3
// 1bf: ifnonnull 1f1
// 1c2: goto 1cf
// 1c5: ldc2_w 22133521405474146
// 1c8: lload 2
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: ifne 20a
// 1d2: goto 1df
// 1d5: ldc2_w 22133521405474146
// 1d8: lload 2
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: aload 42
// 1e1: instanceof net/minecraft/class_1303
// 1e4: goto 1f1
// 1e7: ldc2_w 22133521405474146
// 1ea: lload 2
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: aload 32
// 1f3: ifnonnull 207
// 1f6: ifne 20a
// 1f9: goto 206
// 1fc: ldc2_w 22133521405474146
// 1ff: lload 2
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: bipush 1
// 207: goto 20b
// 20a: bipush 0
// 20b: ifeq 18a
// 20e: aload 38
// 210: aload 41
// 212: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 217: pop
// 218: aload 32
// 21a: ifnull 18a
// 21d: aload 38
// 21f: checkcast java/util/List
// 222: nop
// 223: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 228: astore 34
// 22a: aload 34
// 22c: aload 32
// 22e: lload 2
// 22f: lconst_0
// 230: lcmp
// 231: iflt 377
// 234: ifnonnull 271
// 237: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23c: ifeq 278
// 23f: goto 24c
// 242: ldc2_w 22133521405474146
// 245: lload 2
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: aload 34
// 24e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 253: dup
// 254: sipush 23117
// 257: ldc2_w 7487620898081061706
// 25a: lload 2
// 25b: lxor
// 25c: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 264: goto 271
// 267: ldc2_w 22133521405474146
// 26a: lload 2
// 26b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 270: athrow
// 271: checkcast net/minecraft/class_1297
// 274: astore 35
// 276: aconst_null
// 277: areturn
// 278: aload 6
// 27a: getstatic su/catlean/y4.ONLY_CRYSTALS Lsu/catlean/y4;
// 27d: if_acmpne 3bb
// 280: aload 33
// 282: checkcast java/lang/Iterable
// 285: astore 35
// 287: bipush 0
// 288: istore 36
// 28a: aload 35
// 28c: astore 37
// 28e: new java/util/ArrayList
// 291: dup
// 292: invokespecial java/util/ArrayList.<init> ()V
// 295: checkcast java/util/Collection
// 298: astore 38
// 29a: bipush 0
// 29b: istore 39
// 29d: aload 37
// 29f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2a4: astore 40
// 2a6: aload 40
// 2a8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ad: ifeq 360
// 2b0: aload 40
// 2b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b7: astore 41
// 2b9: aload 41
// 2bb: checkcast net/minecraft/class_1297
// 2be: astore 42
// 2c0: bipush 0
// 2c1: istore 43
// 2c3: aload 32
// 2c5: ifnonnull 3bb
// 2c8: aload 42
// 2ca: instanceof net/minecraft/class_1511
// 2cd: aload 32
// 2cf: lload 2
// 2d0: lconst_0
// 2d1: lcmp
// 2d2: iflt 309
// 2d5: ifnonnull 307
// 2d8: goto 2e5
// 2db: ldc2_w 22133521405474146
// 2de: lload 2
// 2df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: athrow
// 2e5: ifne 34d
// 2e8: goto 2f5
// 2eb: ldc2_w 22133521405474146
// 2ee: lload 2
// 2ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f4: athrow
// 2f5: aload 42
// 2f7: instanceof net/minecraft/class_1542
// 2fa: goto 307
// 2fd: ldc2_w 22133521405474146
// 300: lload 2
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: aload 32
// 309: lload 2
// 30a: lconst_0
// 30b: lcmp
// 30c: ifle 336
// 30f: ifnonnull 334
// 312: ifne 34d
// 315: goto 322
// 318: ldc2_w 22133521405474146
// 31b: lload 2
// 31c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: athrow
// 322: aload 42
// 324: instanceof net/minecraft/class_1303
// 327: goto 334
// 32a: ldc2_w 22133521405474146
// 32d: lload 2
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: aload 32
// 336: ifnonnull 34a
// 339: ifne 34d
// 33c: goto 349
// 33f: ldc2_w 22133521405474146
// 342: lload 2
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: bipush 1
// 34a: goto 34e
// 34d: bipush 0
// 34e: ifeq 2a6
// 351: aload 38
// 353: aload 41
// 355: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 35a: pop
// 35b: aload 32
// 35d: ifnull 2a6
// 360: aload 38
// 362: checkcast java/util/List
// 365: nop
// 366: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 36b: astore 34
// 36d: aload 34
// 36f: lload 2
// 370: lconst_0
// 371: lcmp
// 372: ifle 2b7
// 375: aload 32
// 377: ifnonnull 3b4
// 37a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 37f: ifeq 3bb
// 382: goto 38f
// 385: ldc2_w 22133521405474146
// 388: lload 2
// 389: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: athrow
// 38f: aload 34
// 391: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 396: dup
// 397: sipush 16116
// 39a: ldc2_w 3364950337813143536
// 39d: lload 2
// 39e: lxor
// 39f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a7: goto 3b4
// 3aa: ldc2_w 22133521405474146
// 3ad: lload 2
// 3ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b3: athrow
// 3b4: checkcast net/minecraft/class_1297
// 3b7: astore 35
// 3b9: aconst_null
// 3ba: areturn
// 3bb: lload 17
// 3bd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3c0: aload 1
// 3c1: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 3c4: dup
// 3c5: sipush 10634
// 3c8: ldc2_w 1427529407647664259
// 3cb: lload 2
// 3cc: lxor
// 3cd: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d5: astore 34
// 3d7: lload 2
// 3d8: lconst_0
// 3d9: lcmp
// 3da: ifle 3f1
// 3dd: aload 34
// 3df: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 3e2: ifne 3f1
// 3e5: aconst_null
// 3e6: areturn
// 3e7: ldc2_w 22133521405474146
// 3ea: lload 2
// 3eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: athrow
// 3f1: aload 5
// 3f3: getstatic su/catlean/xx.AirPlace Lsu/catlean/xx;
// 3f6: if_acmpne 43e
// 3f9: aload 0
// 3fa: new net/minecraft/class_3959
// 3fd: dup
// 3fe: aload 0
// 3ff: lload 28
// 401: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 404: iload 19
// 406: i2s
// 407: swap
// 408: iload 20
// 40a: swap
// 40b: iload 21
// 40d: i2c
// 40e: swap
// 40f: checkcast net/minecraft/class_1297
// 412: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 415: aload 1
// 416: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 419: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 41c: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 41f: lload 28
// 421: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 424: checkcast net/minecraft/class_1297
// 427: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 42a: aload 1
// 42b: aconst_null
// 42c: bipush 4
// 42d: lload 22
// 42f: aconst_null
// 430: invokestatic su/catlean/gw.q (Lsu/catlean/gw;Lnet/minecraft/class_3959;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;IJLjava/lang/Object;)Lnet/minecraft/class_3965;
// 433: areturn
// 434: ldc2_w 22133521405474146
// 437: lload 2
// 438: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43d: athrow
// 43e: aload 0
// 43f: lload 12
// 441: aload 1
// 442: aload 9
// 444: invokevirtual su/catlean/gw.h (JLnet/minecraft/class_2338;Ljava/util/List;)Ljava/util/List;
// 447: astore 35
// 449: bipush 0
// 44a: iload 4
// 44c: lload 2
// 44d: lconst_0
// 44e: lcmp
// 44f: iflt 495
// 452: aload 32
// 454: ifnonnull 495
// 457: if_icmpgt 4aa
// 45a: goto 467
// 45d: ldc2_w 22133521405474146
// 460: lload 2
// 461: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 466: athrow
// 467: iload 4
// 469: aload 32
// 46b: ifnonnull 4a7
// 46e: goto 47b
// 471: ldc2_w 22133521405474146
// 474: lload 2
// 475: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47a: athrow
// 47b: sipush 22780
// 47e: ldc2_w 4329258463915831271
// 481: lload 2
// 482: lxor
// 483: invokedynamic o (IJ)I bsm=su/catlean/gw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 488: goto 495
// 48b: ldc2_w 22133521405474146
// 48e: lload 2
// 48f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 494: athrow
// 495: if_icmpge 4a6
// 498: bipush 1
// 499: goto 4ab
// 49c: ldc2_w 22133521405474146
// 49f: lload 2
// 4a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a5: athrow
// 4a6: bipush 0
// 4a7: goto 4ab
// 4aa: bipush 0
// 4ab: ifeq 4cb
// 4ae: lload 28
// 4b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4b3: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 4b6: iload 4
// 4b8: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 4bb: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 4be: goto 4ce
// 4c1: ldc2_w 22133521405474146
// 4c4: lload 2
// 4c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ca: athrow
// 4cb: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
// 4ce: astore 37
// 4d0: aload 37
// 4d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4d5: aload 37
// 4d7: astore 36
// 4d9: aload 36
// 4db: getstatic net/minecraft/class_1802.field_8143 Lnet/minecraft/class_1792;
// 4de: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4e1: aload 32
// 4e3: lload 2
// 4e4: lconst_0
// 4e5: lcmp
// 4e6: ifle 525
// 4e9: ifnonnull 523
// 4ec: ifeq 51b
// 4ef: goto 4fc
// 4f2: ldc2_w 22133521405474146
// 4f5: lload 2
// 4f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fb: athrow
// 4fc: aload 35
// 4fe: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/gw.M (Lsu/catlean/zl;)Z, (Lsu/catlean/zl;)Ljava/lang/Boolean; ]
// 503: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/gw.l (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 508: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 50d: pop
// 50e: goto 51b
// 511: ldc2_w 22133521405474146
// 514: lload 2
// 515: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51a: athrow
// 51b: aload 36
// 51d: getstatic net/minecraft/class_1802.field_17523 Lnet/minecraft/class_1792;
// 520: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 523: aload 32
// 525: ifnonnull 57f
// 528: ifeq 577
// 52b: goto 538
// 52e: ldc2_w 22133521405474146
// 531: lload 2
// 532: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 537: athrow
// 538: aload 34
// 53a: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 53d: getstatic net/minecraft/class_2246.field_10597 Lnet/minecraft/class_2248;
// 540: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 543: aload 32
// 545: lload 2
// 546: lconst_0
// 547: lcmp
// 548: iflt 581
// 54b: ifnonnull 57f
// 54e: goto 55b
// 551: ldc2_w 22133521405474146
// 554: lload 2
// 555: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55a: athrow
// 55b: ifeq 577
// 55e: goto 56b
// 561: ldc2_w 22133521405474146
// 564: lload 2
// 565: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56a: athrow
// 56b: aconst_null
// 56c: areturn
// 56d: ldc2_w 22133521405474146
// 570: lload 2
// 571: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 576: athrow
// 577: aload 36
// 579: getstatic net/minecraft/class_1802.field_8121 Lnet/minecraft/class_1792;
// 57c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 57f: aload 32
// 581: ifnonnull 5b4
// 584: ifeq 5b5
// 587: goto 594
// 58a: ldc2_w 22133521405474146
// 58d: lload 2
// 58e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 593: athrow
// 594: aload 35
// 596: aload 33
// 598: invokedynamic invoke (Ljava/util/ArrayList;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/gw.E (Ljava/util/ArrayList;Lsu/catlean/zl;)Z, (Lsu/catlean/zl;)Ljava/lang/Boolean; ]
// 59d: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/gw.W (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 5a2: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 5a7: goto 5b4
// 5aa: ldc2_w 22133521405474146
// 5ad: lload 2
// 5ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b3: athrow
// 5b4: pop
// 5b5: aload 35
// 5b7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 5bc: astore 37
// 5be: aload 37
// 5c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5c5: ifeq 6bc
// 5c8: aload 37
// 5ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5cf: checkcast su/catlean/zl
// 5d2: astore 38
// 5d4: aload 5
// 5d6: getstatic su/catlean/xx.Strict Lsu/catlean/xx;
// 5d9: aload 32
// 5db: ifnonnull 600
// 5de: if_acmpeq 603
// 5e1: goto 5ee
// 5e4: ldc2_w 22133521405474146
// 5e7: lload 2
// 5e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ed: athrow
// 5ee: aload 5
// 5f0: getstatic su/catlean/xx.GRIM Lsu/catlean/xx;
// 5f3: goto 600
// 5f6: ldc2_w 22133521405474146
// 5f9: lload 2
// 5fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ff: athrow
// 600: if_acmpne 662
// 603: aload 0
// 604: aload 38
// 606: invokevirtual su/catlean/zl.v ()Lnet/minecraft/class_2338;
// 609: iload 10
// 60b: swap
// 60c: iload 11
// 60e: invokevirtual su/catlean/gw.M (ILnet/minecraft/class_2338;I)Ljava/util/List;
// 611: astore 39
// 613: aload 39
// 615: invokeinterface java/util/List.isEmpty ()Z 1
// 61a: lload 2
// 61b: lconst_0
// 61c: lcmp
// 61d: ifle 64d
// 620: aload 32
// 622: ifnonnull 64d
// 625: ifeq 641
// 628: goto 635
// 62b: ldc2_w 22133521405474146
// 62e: lload 2
// 62f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 634: athrow
// 635: aconst_null
// 636: areturn
// 637: ldc2_w 22133521405474146
// 63a: lload 2
// 63b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 640: athrow
// 641: aload 39
// 643: aload 38
// 645: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 648: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 64d: ifne 662
// 650: aload 32
// 652: ifnull 5be
// 655: goto 662
// 658: ldc2_w 22133521405474146
// 65b: lload 2
// 65c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 661: athrow
// 662: aload 0
// 663: aload 38
// 665: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 668: aload 38
// 66a: invokevirtual su/catlean/zl.v ()Lnet/minecraft/class_2338;
// 66d: fload 8
// 66f: fload 7
// 671: aload 5
// 673: getstatic su/catlean/xx.GRIM Lsu/catlean/xx;
// 676: if_acmpne 687
// 679: bipush 1
// 67a: goto 688
// 67d: ldc2_w 22133521405474146
// 680: lload 2
// 681: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 686: athrow
// 687: bipush 0
// 688: istore 30
// 68a: fstore 31
// 68c: iload 14
// 68e: iload 15
// 690: i2c
// 691: fload 31
// 693: iload 16
// 695: iload 30
// 697: invokevirtual su/catlean/gw.R (Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;FICFIZ)Lnet/minecraft/class_243;
// 69a: astore 39
// 69c: aload 39
// 69e: ifnull 5be
// 6a1: new net/minecraft/class_3965
// 6a4: dup
// 6a5: aload 39
// 6a7: aload 38
// 6a9: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 6ac: aload 38
// 6ae: invokevirtual su/catlean/zl.v ()Lnet/minecraft/class_2338;
// 6b1: bipush 0
// 6b2: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 6b5: lload 2
// 6b6: lconst_0
// 6b7: lcmp
// 6b8: iflt 5cf
// 6bb: areturn
// 6bc: aconst_null
// 6bd: areturn
}

public static class_3965 j(gw var0, class_2338 var1, int var2, long var3, xx var5, y4 var6, float var7, float var8, List var9, int var10, Object var11) {
var3 = a ^ var3;
long var12 = var3 ^ 125711503709517L;
if ((var10 & b<"o">(1398, 4948250231950455632L ^ var3)) != 0) {
var9 = new ArrayList();
}

return var0.m(var1, var12, var2, var5, var6, var7, var8, var9);
}

@NotNull
public final List h(long a, @NotNull class_2338 bp, @NotNull List calcGhost) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 116903772071677
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 140335514232181
// 012: lxor
// 013: lstore 7
// 015: pop2
// 016: aload 3
// 017: sipush 10130
// 01a: ldc2_w 2905159582019914945
// 01d: lload 1
// 01e: lxor
// 01f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 027: aload 4
// 029: sipush 20046
// 02c: ldc2_w 163261468328781061
// 02f: lload 1
// 030: lxor
// 031: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 039: getstatic su/catlean/gw.s Ljava/util/Map;
// 03c: astore 10
// 03e: bipush 0
// 03f: istore 11
// 041: aload 10
// 043: astore 12
// 045: new java/util/ArrayList
// 048: dup
// 049: invokespecial java/util/ArrayList.<init> ()V
// 04c: checkcast java/util/Collection
// 04f: astore 13
// 051: bipush 0
// 052: istore 14
// 054: aload 12
// 056: astore 15
// 058: bipush 0
// 059: istore 16
// 05b: ldc2_w 5367333668092296068
// 05e: lload 1
// 05f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: aload 15
// 066: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 06b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 070: astore 17
// 072: astore 9
// 074: aload 17
// 076: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07b: ifeq 18d
// 07e: aload 17
// 080: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 085: checkcast java/util/Map$Entry
// 088: astore 18
// 08a: aload 18
// 08c: astore 19
// 08e: bipush 0
// 08f: istore 20
// 091: aload 19
// 093: astore 21
// 095: bipush 0
// 096: istore 22
// 098: aload 21
// 09a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 09f: checkcast net/minecraft/class_2350
// 0a2: astore 23
// 0a4: aload 21
// 0a6: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 0ab: checkcast net/minecraft/class_2338
// 0ae: astore 24
// 0b0: aload 3
// 0b1: aload 24
// 0b3: checkcast net/minecraft/class_2382
// 0b6: invokevirtual net/minecraft/class_2338.method_10081 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_2338;
// 0b9: dup
// 0ba: sipush 21718
// 0bd: ldc2_w 4886761499844050864
// 0c0: lload 1
// 0c1: lxor
// 0c2: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: astore 25
// 0cc: aload 9
// 0ce: ifnonnull 194
// 0d1: lload 5
// 0d3: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d6: aload 25
// 0d8: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0db: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0de: aload 9
// 0e0: lload 1
// 0e1: lconst_0
// 0e2: lcmp
// 0e3: ifle 129
// 0e6: ifnonnull 121
// 0e9: goto 0f6
// 0ec: ldc2_w 5334707167719931684
// 0ef: lload 1
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: ifeq 155
// 0f9: goto 106
// 0fc: ldc2_w 5334707167719931684
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 109: pop
// 10a: getstatic su/catlean/gw.y Ljava/util/Map;
// 10d: aload 25
// 10f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 114: goto 121
// 117: ldc2_w 5334707167719931684
// 11a: lload 1
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: lload 1
// 122: lconst_0
// 123: lcmp
// 124: iflt 152
// 127: aload 9
// 129: ifnonnull 152
// 12c: ifne 155
// 12f: goto 13c
// 132: ldc2_w 5334707167719931684
// 135: lload 1
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 4
// 13e: aload 25
// 140: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 145: goto 152
// 148: ldc2_w 5334707167719931684
// 14b: lload 1
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ifeq 16f
// 155: new su/catlean/zl
// 158: dup
// 159: aload 25
// 15b: lload 7
// 15d: aload 23
// 15f: invokespecial su/catlean/zl.<init> (Lnet/minecraft/class_2338;JLnet/minecraft/class_2350;)V
// 162: goto 170
// 165: ldc2_w 5334707167719931684
// 168: lload 1
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aconst_null
// 170: dup
// 171: ifnull 186
// 174: astore 26
// 176: bipush 0
// 177: istore 27
// 179: aload 13
// 17b: aload 26
// 17d: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 182: pop
// 183: goto 187
// 186: pop
// 187: nop
// 188: aload 9
// 18a: ifnull 074
// 18d: nop
// 18e: lload 1
// 18f: lconst_0
// 190: lcmp
// 191: ifle 194
// 194: aload 13
// 196: checkcast java/util/List
// 199: nop
// 19a: checkcast java/util/Collection
// 19d: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
// 1a0: areturn
}

@Nullable
public final zl u(long a, @NotNull class_2338 blockPos) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 104818394502996
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 82069319095516
// 012: lxor
// 013: lstore 6
// 015: pop2
// 016: ldc2_w 8923227964960115245
// 019: lload 1
// 01a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: aload 3
// 020: sipush 24383
// 023: ldc2_w 8192894073803589111
// 026: lload 1
// 027: lxor
// 028: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 030: getstatic su/catlean/gw.s Ljava/util/Map;
// 033: astore 9
// 035: astore 8
// 037: bipush 0
// 038: istore 10
// 03a: aload 9
// 03c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 041: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 046: astore 11
// 048: aload 11
// 04a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 04f: ifeq 0fe
// 052: aload 11
// 054: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 059: checkcast java/util/Map$Entry
// 05c: astore 12
// 05e: aload 12
// 060: astore 13
// 062: bipush 0
// 063: istore 14
// 065: aload 13
// 067: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 06c: checkcast net/minecraft/class_2350
// 06f: astore 15
// 071: aload 13
// 073: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 078: checkcast net/minecraft/class_2338
// 07b: astore 16
// 07d: aload 3
// 07e: aload 16
// 080: checkcast net/minecraft/class_2382
// 083: invokevirtual net/minecraft/class_2338.method_10081 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_2338;
// 086: dup
// 087: sipush 17812
// 08a: ldc2_w 5326427108855537531
// 08d: lload 1
// 08e: lxor
// 08f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 097: astore 17
// 099: aload 8
// 09b: lload 1
// 09c: lconst_0
// 09d: lcmp
// 09e: ifle 0a6
// 0a1: ifnonnull 105
// 0a4: aload 8
// 0a6: lload 1
// 0a7: lconst_0
// 0a8: lcmp
// 0a9: iflt 0fb
// 0ac: ifnonnull 0f9
// 0af: goto 0bc
// 0b2: ldc2_w 8908571832165600909
// 0b5: lload 1
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: lload 1
// 0bd: lconst_0
// 0be: lcmp
// 0bf: ifle 0f9
// 0c2: lload 4
// 0c4: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c7: aload 17
// 0c9: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0cc: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0cf: ifne 0f7
// 0d2: goto 0df
// 0d5: ldc2_w 8908571832165600909
// 0d8: lload 1
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: new su/catlean/zl
// 0e2: dup
// 0e3: aload 17
// 0e5: lload 6
// 0e7: aload 15
// 0e9: invokespecial su/catlean/zl.<init> (Lnet/minecraft/class_2338;JLnet/minecraft/class_2350;)V
// 0ec: areturn
// 0ed: ldc2_w 8908571832165600909
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: nop
// 0f8: nop
// 0f9: aload 8
// 0fb: ifnull 048
// 0fe: nop
// 0ff: lload 1
// 100: lconst_0
// 101: lcmp
// 102: ifle 105
// 105: aconst_null
// 106: areturn
}

public final float C(@NotNull class_243 vec, long a) {
ax = a ^ ax;
long var4 = ax ^ 69882563218541L;
Intrinsics.checkNotNullParameter(vec, a<"e">(5353, 219366020439141280L ^ ax));
return (float)vec.method_1025(zf.v(var4).method_33571());
}

public final float w(long a, @NotNull class_243 vec) {
ax = a ^ ax;
long var4 = ax ^ 127881067760341L;
Intrinsics.checkNotNullParameter(vec, a<"e">(28439, 4345223318990968564L ^ ax));
double var6 = vec.field_1352 - zf.v(var4).method_23317();
double var8 = vec.field_1350 - zf.v(var4).method_23321();
return (float)(var6 * var6 + var8 * var8);
}

@NotNull
public final cg v(@NotNull class_2338 bp, long a) {
ax = a ^ ax;
long var10001 = ax ^ 66628158144714L;
int var4 = (int)((ax ^ 66628158144714L) >>> 48);
int var5 = (int)((ax ^ 66628158144714L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = ax ^ 50878180931296L;
Intrinsics.checkNotNullParameter(bp, a<"e">(10130, 2905232149418058363L ^ ax));
class_243 var10000 = bp.method_46558();
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(17942, 8350769971604964313L ^ ax));
class_243 var9 = var10000;
return new cg(
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1352 - var9.method_1031(0.5, 0.0, 0.0).field_1352,
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1352 - var9.method_1031(-0.5, 0.0, 0.0).field_1352,
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1350 - var9.method_1031(0.0, 0.0, 0.5).field_1350,
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1350 - var9.method_1031(0.0, 0.0, -0.5).field_1350,
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1351 - var9.method_1031(0.0, 0.5, 0.0).field_1351,
this.a((short)var4, var5, (char)var6, (class_1297)zf.v(var7)).field_1351 - var9.method_1031(0.0, -0.5, 0.0).field_1351
);
}

public final boolean B(@NotNull class_2338 bp, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gw.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 7968300853660
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 368720009466344677
// 12: lload 2
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 1
// 19: sipush 10130
// 1c: ldc2_w 2905206944709854112
// 1f: lload 2
// 20: lxor
// 21: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: astore 6
// 2b: lload 4
// 2d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 30: aload 1
// 31: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 34: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 37: aload 6
// 39: ifnonnull 78
// 3c: ifeq 77
// 3f: goto 4c
// 42: ldc2_w 390056741055656005
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: getstatic su/catlean/gw.y Ljava/util/Map;
// 4f: aload 1
// 50: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 55: aload 6
// 57: ifnonnull 78
// 5a: goto 67
// 5d: ldc2_w 390056741055656005
// 60: lload 2
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: ifeq 7b
// 6a: goto 77
// 6d: ldc2_w 390056741055656005
// 70: lload 2
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: bipush 1
// 78: goto 7c
// 7b: bipush 0
// 7c: ireturn
}

@NotNull
public final List M(int a, @NotNull class_2338 bp, int a) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/gw.a J
// 011: lxor
// 012: lstore 4
// 014: lload 4
// 016: dup2
// 017: ldc2_w 101679493507494
// 01a: lxor
// 01b: lstore 6
// 01d: dup2
// 01e: ldc2_w 40400243602835
// 021: lxor
// 022: lstore 8
// 024: pop2
// 025: ldc2_w -8851913438822435617
// 028: lload 4
// 02a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: aload 2
// 030: sipush 10130
// 033: ldc2_w 2905108834123465626
// 036: lload 4
// 038: lxor
// 039: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 041: astore 10
// 043: new java/util/ArrayList
// 046: dup
// 047: invokespecial java/util/ArrayList.<init> ()V
// 04a: checkcast java/util/List
// 04d: astore 11
// 04f: aload 0
// 050: aload 2
// 051: lload 8
// 053: invokevirtual su/catlean/gw.v (Lnet/minecraft/class_2338;J)Lsu/catlean/cg;
// 056: astore 12
// 058: bipush 0
// 059: istore 13
// 05b: aload 12
// 05d: invokevirtual su/catlean/cg.H ()D
// 060: dconst_0
// 061: dcmpl
// 062: aload 10
// 064: ifnonnull 0cf
// 067: ifle 0c8
// 06a: goto 078
// 06d: ldc2_w -8839552527961362305
// 070: lload 4
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: lload 6
// 07a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 07d: aload 2
// 07e: invokevirtual net/minecraft/class_2338.method_10078 ()Lnet/minecraft/class_2338;
// 081: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 084: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 087: aload 10
// 089: iload 1
// 08a: ifle 0d1
// 08d: ifnonnull 0cf
// 090: goto 09e
// 093: ldc2_w -8839552527961362305
// 096: lload 4
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: ifeq 0c8
// 0a1: goto 0af
// 0a4: ldc2_w -8839552527961362305
// 0a7: lload 4
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: aload 11
// 0b1: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
// 0b4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0b9: pop
// 0ba: goto 0c8
// 0bd: ldc2_w -8839552527961362305
// 0c0: lload 4
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: aload 12
// 0ca: invokevirtual su/catlean/cg.m ()D
// 0cd: dconst_0
// 0ce: dcmpg
// 0cf: aload 10
// 0d1: ifnonnull 13c
// 0d4: ifge 135
// 0d7: goto 0e5
// 0da: ldc2_w -8839552527961362305
// 0dd: lload 4
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: lload 6
// 0e7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ea: aload 2
// 0eb: invokevirtual net/minecraft/class_2338.method_10067 ()Lnet/minecraft/class_2338;
// 0ee: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0f1: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0f4: aload 10
// 0f6: iload 3
// 0f7: ifge 13e
// 0fa: ifnonnull 13c
// 0fd: goto 10b
// 100: ldc2_w -8839552527961362305
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: ifeq 135
// 10e: goto 11c
// 111: ldc2_w -8839552527961362305
// 114: lload 4
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 11
// 11e: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
// 121: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 126: pop
// 127: goto 135
// 12a: ldc2_w -8839552527961362305
// 12d: lload 4
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: aload 12
// 137: invokevirtual su/catlean/cg.o ()D
// 13a: dconst_0
// 13b: dcmpl
// 13c: aload 10
// 13e: ifnonnull 1a9
// 141: ifle 1a2
// 144: goto 152
// 147: ldc2_w -8839552527961362305
// 14a: lload 4
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: lload 6
// 154: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 157: aload 2
// 158: invokevirtual net/minecraft/class_2338.method_10072 ()Lnet/minecraft/class_2338;
// 15b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 15e: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 161: aload 10
// 163: iload 3
// 164: ifgt 1ab
// 167: ifnonnull 1a9
// 16a: goto 178
// 16d: ldc2_w -8839552527961362305
// 170: lload 4
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: ifeq 1a2
// 17b: goto 189
// 17e: ldc2_w -8839552527961362305
// 181: lload 4
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: aload 11
// 18b: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
// 18e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 193: pop
// 194: goto 1a2
// 197: ldc2_w -8839552527961362305
// 19a: lload 4
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: aload 12
// 1a4: invokevirtual su/catlean/cg.g ()D
// 1a7: dconst_0
// 1a8: dcmpg
// 1a9: aload 10
// 1ab: ifnonnull 216
// 1ae: ifge 20f
// 1b1: goto 1bf
// 1b4: ldc2_w -8839552527961362305
// 1b7: lload 4
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: lload 6
// 1c1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1c4: aload 2
// 1c5: invokevirtual net/minecraft/class_2338.method_10095 ()Lnet/minecraft/class_2338;
// 1c8: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1cb: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 1ce: aload 10
// 1d0: iload 1
// 1d1: ifle 218
// 1d4: ifnonnull 216
// 1d7: goto 1e5
// 1da: ldc2_w -8839552527961362305
// 1dd: lload 4
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: ifeq 20f
// 1e8: goto 1f6
// 1eb: ldc2_w -8839552527961362305
// 1ee: lload 4
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: aload 11
// 1f8: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
// 1fb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 200: pop
// 201: goto 20f
// 204: ldc2_w -8839552527961362305
// 207: lload 4
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: aload 12
// 211: invokevirtual su/catlean/cg.O ()D
// 214: dconst_0
// 215: dcmpl
// 216: aload 10
// 218: ifnonnull 283
// 21b: ifle 27c
// 21e: goto 22c
// 221: ldc2_w -8839552527961362305
// 224: lload 4
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: lload 6
// 22e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 231: aload 2
// 232: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 235: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 238: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 23b: aload 10
// 23d: iload 3
// 23e: ifgt 285
// 241: ifnonnull 283
// 244: goto 252
// 247: ldc2_w -8839552527961362305
// 24a: lload 4
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: ifeq 27c
// 255: goto 263
// 258: ldc2_w -8839552527961362305
// 25b: lload 4
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: aload 11
// 265: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 268: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 26d: pop
// 26e: goto 27c
// 271: ldc2_w -8839552527961362305
// 274: lload 4
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: aload 12
// 27e: invokevirtual su/catlean/cg.z ()D
// 281: dconst_0
// 282: dcmpg
// 283: aload 10
// 285: iload 1
// 286: iflt 2bc
// 289: ifnonnull 2ba
// 28c: ifge 2e9
// 28f: goto 29d
// 292: ldc2_w -8839552527961362305
// 295: lload 4
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: lload 6
// 29f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2a2: aload 2
// 2a3: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 2a6: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2a9: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 2ac: goto 2ba
// 2af: ldc2_w -8839552527961362305
// 2b2: lload 4
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: aload 10
// 2bc: ifnonnull 2e8
// 2bf: ifeq 2e9
// 2c2: goto 2d0
// 2c5: ldc2_w -8839552527961362305
// 2c8: lload 4
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: aload 11
// 2d2: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 2d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2da: goto 2e8
// 2dd: ldc2_w -8839552527961362305
// 2e0: lload 4
// 2e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e7: athrow
// 2e8: pop
// 2e9: nop
// 2ea: nop
// 2eb: aload 11
// 2ed: areturn
}

@Nullable
public final dl z(@NotNull class_2338 bp, long a, @NotNull xx interact) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 116431081379995
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 1269678437114
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 109775590824993
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: aload 1
// 01e: sipush 10130
// 021: ldc2_w 2905195275717513381
// 024: lload 2
// 025: lxor
// 026: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02e: ldc2_w -3019389762093635616
// 031: lload 2
// 032: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: aload 4
// 039: sipush 31439
// 03c: ldc2_w 2457536861143649790
// 03f: lload 2
// 040: lxor
// 041: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 049: astore 11
// 04b: aload 4
// 04d: getstatic su/catlean/xx.Vanilla Lsu/catlean/xx;
// 050: aload 11
// 052: ifnonnull 09e
// 055: if_acmpne 099
// 058: goto 065
// 05b: ldc2_w -2995791584865639616
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: new su/catlean/dl
// 068: dup
// 069: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 06c: aload 1
// 06d: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 070: dconst_0
// 071: ldc2_w 0.5
// 074: dconst_0
// 075: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 078: dup
// 079: sipush 5878
// 07c: ldc2_w 4251295206488580604
// 07f: lload 2
// 080: lxor
// 081: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 089: lload 7
// 08b: invokespecial su/catlean/dl.<init> (Lnet/minecraft/class_2350;Lnet/minecraft/class_243;J)V
// 08e: areturn
// 08f: ldc2_w -2995791584865639616
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 4
// 09b: getstatic su/catlean/xx.Strict Lsu/catlean/xx;
// 09e: aload 11
// 0a0: ifnonnull 0c5
// 0a3: if_acmpeq 0c8
// 0a6: goto 0b3
// 0a9: ldc2_w -2995791584865639616
// 0ac: lload 2
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: aload 4
// 0b5: getstatic su/catlean/xx.GRIM Lsu/catlean/xx;
// 0b8: goto 0c5
// 0bb: ldc2_w -2995791584865639616
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: if_acmpne 294
// 0c8: ldc 999.0
// 0ca: fstore 12
// 0cc: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 0cf: astore 13
// 0d1: aconst_null
// 0d2: astore 14
// 0d4: getstatic su/catlean/bf.s Lkotlin/enums/EnumEntries;
// 0d7: invokeinterface kotlin/enums/EnumEntries.iterator ()Ljava/util/Iterator; 1
// 0dc: astore 15
// 0de: aload 15
// 0e0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e5: ifeq 26f
// 0e8: aload 15
// 0ea: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ef: checkcast net/minecraft/class_2350
// 0f2: astore 16
// 0f4: aload 16
// 0f6: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 0f9: invokevirtual net/minecraft/class_2382.method_10263 ()I
// 0fc: i2d
// 0fd: ldc2_w 0.5
// 100: dmul
// 101: dstore 17
// 103: aload 16
// 105: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 108: invokevirtual net/minecraft/class_2382.method_10264 ()I
// 10b: i2d
// 10c: ldc2_w 0.5
// 10f: dmul
// 110: dstore 19
// 112: aload 16
// 114: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
// 117: invokevirtual net/minecraft/class_2382.method_10260 ()I
// 11a: i2d
// 11b: ldc2_w 0.5
// 11e: dmul
// 11f: dstore 21
// 121: aload 1
// 122: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 125: lload 2
// 126: lconst_0
// 127: lcmp
// 128: iflt 277
// 12b: aload 11
// 12d: ifnonnull 277
// 130: dload 17
// 132: invokestatic java/lang/Math.abs (D)D
// 135: ldc2_w 0.5
// 138: dcmpg
// 139: aload 11
// 13b: ifnonnull 15c
// 13e: goto 14b
// 141: ldc2_w -2995791584865639616
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: ifne 15f
// 14e: goto 15b
// 151: ldc2_w -2995791584865639616
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: bipush 1
// 15c: goto 160
// 15f: bipush 0
// 160: ifeq 172
// 163: dload 17
// 165: goto 186
// 168: ldc2_w -2995791584865639616
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: ldc2_w -0.1
// 175: ldc2_w 0.1
// 178: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 17b: checkcast kotlin/ranges/ClosedRange
// 17e: bipush 0
// 17f: bipush 2
// 180: aconst_null
// 181: lload 5
// 183: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 186: dload 19
// 188: invokestatic java/lang/Math.abs (D)D
// 18b: ldc2_w 0.5
// 18e: dcmpg
// 18f: aload 11
// 191: ifnonnull 1a5
// 194: ifne 1a8
// 197: goto 1a4
// 19a: ldc2_w -2995791584865639616
// 19d: lload 2
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: bipush 1
// 1a5: goto 1a9
// 1a8: bipush 0
// 1a9: ifeq 1bb
// 1ac: dload 19
// 1ae: goto 1cf
// 1b1: ldc2_w -2995791584865639616
// 1b4: lload 2
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: ldc2_w -0.1
// 1be: ldc2_w 0.1
// 1c1: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 1c4: checkcast kotlin/ranges/ClosedRange
// 1c7: bipush 0
// 1c8: bipush 2
// 1c9: aconst_null
// 1ca: lload 5
// 1cc: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 1cf: dload 21
// 1d1: invokestatic java/lang/Math.abs (D)D
// 1d4: ldc2_w 0.5
// 1d7: dcmpg
// 1d8: aload 11
// 1da: ifnonnull 1ee
// 1dd: ifne 1f1
// 1e0: goto 1ed
// 1e3: ldc2_w -2995791584865639616
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: bipush 1
// 1ee: goto 1f2
// 1f1: bipush 0
// 1f2: ifeq 204
// 1f5: dload 21
// 1f7: goto 218
// 1fa: ldc2_w -2995791584865639616
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: ldc2_w -0.1
// 207: ldc2_w 0.1
// 20a: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 20d: checkcast kotlin/ranges/ClosedRange
// 210: bipush 0
// 211: bipush 2
// 212: aconst_null
// 213: lload 5
// 215: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 218: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 21b: dup
// 21c: sipush 5878
// 21f: ldc2_w 4251295206488580604
// 222: lload 2
// 223: lxor
// 224: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 22c: astore 23
// 22e: aload 0
// 22f: aload 23
// 231: lload 9
// 233: invokevirtual su/catlean/gw.C (Lnet/minecraft/class_243;J)F
// 236: fstore 24
// 238: lload 2
// 239: lconst_0
// 23a: lcmp
// 23b: iflt 26a
// 23e: fload 12
// 240: aload 11
// 242: ifnonnull 268
// 245: fload 24
// 247: fcmpl
// 248: lload 2
// 249: lconst_0
// 24a: lcmp
// 24b: ifle 0e5
// 24e: ifle 0de
// 251: goto 25e
// 254: ldc2_w -2995791584865639616
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: aload 16
// 260: astore 13
// 262: aload 23
// 264: astore 14
// 266: fload 24
// 268: fstore 12
// 26a: aload 11
// 26c: ifnull 0de
// 26f: lload 2
// 270: lconst_0
// 271: lcmp
// 272: ifle 286
// 275: aload 14
// 277: ifnonnull 286
// 27a: aconst_null
// 27b: areturn
// 27c: ldc2_w -2995791584865639616
// 27f: lload 2
// 280: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: athrow
// 286: new su/catlean/dl
// 289: dup
// 28a: aload 13
// 28c: aload 14
// 28e: lload 7
// 290: invokespecial su/catlean/dl.<init> (Lnet/minecraft/class_2350;Lnet/minecraft/class_243;J)V
// 293: areturn
// 294: aconst_null
// 295: areturn
}

@Nullable
public final class_243 R(@NotNull class_2350 dir, @NotNull class_2338 bp, float wallRange, int a, char a, float range, int a, boolean random) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 4
// 002: i2l
// 003: bipush 32
// 005: lshl
// 006: iload 5
// 008: i2l
// 009: bipush 48
// 00b: lshl
// 00c: bipush 32
// 00e: lushr
// 00f: lor
// 010: iload 7
// 012: i2l
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: lor
// 01a: getstatic su/catlean/gw.a J
// 01d: lxor
// 01e: lstore 9
// 020: lload 9
// 022: dup2
// 023: ldc2_w 123781980767677
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 140179317376337
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 5522855132312
// 034: lxor
// 035: lstore 15
// 037: pop2
// 038: ldc2_w -5854973323295826106
// 03b: lload 9
// 03d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: aload 1
// 043: sipush 24142
// 046: ldc2_w 5481112375112897020
// 049: lload 9
// 04b: lxor
// 04c: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 054: aload 2
// 055: sipush 10130
// 058: ldc2_w 2905207135462516739
// 05b: lload 9
// 05d: lxor
// 05e: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 066: aload 0
// 067: lload 11
// 069: aload 1
// 06a: invokevirtual su/catlean/gw.J (JLnet/minecraft/class_2350;)Lnet/minecraft/class_238;
// 06d: astore 18
// 06f: astore 17
// 071: new java/util/ArrayList
// 074: dup
// 075: invokespecial java/util/ArrayList.<init> ()V
// 078: checkcast java/util/List
// 07b: astore 19
// 07d: aload 18
// 07f: getfield net/minecraft/class_238.field_1320 D
// 082: aload 18
// 084: getfield net/minecraft/class_238.field_1323 D
// 087: dsub
// 088: dconst_0
// 089: dcmpg
// 08a: aload 17
// 08c: ifnonnull 0a1
// 08f: ifne 0a4
// 092: goto 0a0
// 095: ldc2_w -5851650740168172570
// 098: lload 9
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: bipush 1
// 0a1: goto 0a5
// 0a4: bipush 0
// 0a5: ifeq 16a
// 0a8: aload 18
// 0aa: getfield net/minecraft/class_238.field_1322 D
// 0ad: dstore 20
// 0af: dload 20
// 0b1: aload 18
// 0b3: getfield net/minecraft/class_238.field_1325 D
// 0b6: dcmpg
// 0b7: ifge 16a
// 0ba: aload 18
// 0bc: getfield net/minecraft/class_238.field_1321 D
// 0bf: iload 5
// 0c1: iflt 17a
// 0c4: aload 17
// 0c6: ifnonnull 17a
// 0c9: dstore 22
// 0cb: dload 22
// 0cd: aload 18
// 0cf: getfield net/minecraft/class_238.field_1324 D
// 0d2: dcmpg
// 0d3: ifge 158
// 0d6: new net/minecraft/class_243
// 0d9: dup
// 0da: aload 2
// 0db: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0de: i2d
// 0df: aload 18
// 0e1: getfield net/minecraft/class_238.field_1323 D
// 0e4: dadd
// 0e5: aload 2
// 0e6: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0e9: i2d
// 0ea: dload 20
// 0ec: dadd
// 0ed: aload 2
// 0ee: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0f1: i2d
// 0f2: dload 22
// 0f4: dadd
// 0f5: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0f8: astore 24
// 0fa: aload 17
// 0fc: iload 5
// 0fe: iflt 155
// 101: ifnonnull 153
// 104: aload 0
// 105: aload 24
// 107: aload 2
// 108: lload 13
// 10a: fload 3
// 10b: fload 6
// 10d: invokevirtual su/catlean/gw.f (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;JFF)Z
// 110: aload 17
// 112: ifnonnull 0b7
// 115: iload 5
// 117: ifle 17c
// 11a: goto 128
// 11d: ldc2_w -5851650740168172570
// 120: lload 9
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: iload 4
// 12a: ifle 13c
// 12d: ifne 14b
// 130: aload 19
// 132: checkcast java/util/Collection
// 135: aload 24
// 137: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 13c: pop
// 13d: goto 14b
// 140: ldc2_w -5851650740168172570
// 143: lload 9
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: dload 22
// 14d: ldc2_w 0.1
// 150: dadd
// 151: dstore 22
// 153: aload 17
// 155: ifnull 0cb
// 158: dload 20
// 15a: ldc2_w 0.1
// 15d: dadd
// 15e: dstore 20
// 160: aload 17
// 162: iload 4
// 164: iflt 390
// 167: ifnull 0af
// 16a: aload 18
// 16c: getfield net/minecraft/class_238.field_1325 D
// 16f: aload 18
// 171: getfield net/minecraft/class_238.field_1322 D
// 174: iload 7
// 176: iflt 17b
// 179: dsub
// 17a: dconst_0
// 17b: dcmpg
// 17c: aload 17
// 17e: ifnonnull 193
// 181: ifne 196
// 184: goto 192
// 187: ldc2_w -5851650740168172570
// 18a: lload 9
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: bipush 1
// 193: goto 197
// 196: bipush 0
// 197: ifeq 25c
// 19a: aload 18
// 19c: getfield net/minecraft/class_238.field_1323 D
// 19f: dstore 20
// 1a1: dload 20
// 1a3: aload 18
// 1a5: getfield net/minecraft/class_238.field_1320 D
// 1a8: dcmpg
// 1a9: ifge 25c
// 1ac: aload 18
// 1ae: getfield net/minecraft/class_238.field_1321 D
// 1b1: iload 4
// 1b3: iflt 26c
// 1b6: aload 17
// 1b8: ifnonnull 26c
// 1bb: dstore 22
// 1bd: dload 22
// 1bf: aload 18
// 1c1: getfield net/minecraft/class_238.field_1324 D
// 1c4: dcmpg
// 1c5: ifge 24a
// 1c8: new net/minecraft/class_243
// 1cb: dup
// 1cc: aload 2
// 1cd: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 1d0: i2d
// 1d1: dload 20
// 1d3: dadd
// 1d4: aload 2
// 1d5: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1d8: i2d
// 1d9: aload 18
// 1db: getfield net/minecraft/class_238.field_1322 D
// 1de: dadd
// 1df: aload 2
// 1e0: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 1e3: i2d
// 1e4: dload 22
// 1e6: dadd
// 1e7: invokespecial net/minecraft/class_243.<init> (DDD)V
// 1ea: astore 24
// 1ec: aload 17
// 1ee: iload 4
// 1f0: ifle 247
// 1f3: ifnonnull 245
// 1f6: aload 0
// 1f7: aload 24
// 1f9: aload 2
// 1fa: lload 13
// 1fc: fload 3
// 1fd: fload 6
// 1ff: invokevirtual su/catlean/gw.f (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;JFF)Z
// 202: aload 17
// 204: ifnonnull 1a9
// 207: iload 5
// 209: ifle 26e
// 20c: goto 21a
// 20f: ldc2_w -5851650740168172570
// 212: lload 9
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: iload 4
// 21c: iflt 22e
// 21f: ifne 23d
// 222: aload 19
// 224: checkcast java/util/Collection
// 227: aload 24
// 229: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 22e: pop
// 22f: goto 23d
// 232: ldc2_w -5851650740168172570
// 235: lload 9
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: dload 22
// 23f: ldc2_w 0.1
// 242: dadd
// 243: dstore 22
// 245: aload 17
// 247: ifnull 1bd
// 24a: dload 20
// 24c: ldc2_w 0.1
// 24f: dadd
// 250: dstore 20
// 252: aload 17
// 254: iload 4
// 256: iflt 390
// 259: ifnull 1a1
// 25c: aload 18
// 25e: getfield net/minecraft/class_238.field_1324 D
// 261: aload 18
// 263: getfield net/minecraft/class_238.field_1321 D
// 266: iload 4
// 268: ifle 26d
// 26b: dsub
// 26c: dconst_0
// 26d: dcmpg
// 26e: aload 17
// 270: ifnonnull 285
// 273: ifne 288
// 276: goto 284
// 279: ldc2_w -5851650740168172570
// 27c: lload 9
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: bipush 1
// 285: goto 289
// 288: bipush 0
// 289: ifeq 349
// 28c: aload 18
// 28e: getfield net/minecraft/class_238.field_1323 D
// 291: dstore 20
// 293: dload 20
// 295: aload 18
// 297: getfield net/minecraft/class_238.field_1320 D
// 29a: dcmpg
// 29b: ifge 349
// 29e: aload 18
// 2a0: aload 17
// 2a2: ifnonnull 39e
// 2a5: getfield net/minecraft/class_238.field_1322 D
// 2a8: dstore 22
// 2aa: dload 22
// 2ac: aload 18
// 2ae: getfield net/minecraft/class_238.field_1325 D
// 2b1: dcmpg
// 2b2: ifge 337
// 2b5: new net/minecraft/class_243
// 2b8: dup
// 2b9: aload 2
// 2ba: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 2bd: i2d
// 2be: dload 20
// 2c0: dadd
// 2c1: aload 2
// 2c2: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 2c5: i2d
// 2c6: dload 22
// 2c8: dadd
// 2c9: aload 2
// 2ca: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 2cd: i2d
// 2ce: aload 18
// 2d0: getfield net/minecraft/class_238.field_1321 D
// 2d3: dadd
// 2d4: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2d7: astore 24
// 2d9: aload 17
// 2db: iload 7
// 2dd: ifle 334
// 2e0: ifnonnull 332
// 2e3: aload 0
// 2e4: aload 24
// 2e6: aload 2
// 2e7: lload 13
// 2e9: fload 3
// 2ea: fload 6
// 2ec: invokevirtual su/catlean/gw.f (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;JFF)Z
// 2ef: aload 17
// 2f1: ifnonnull 29b
// 2f4: iload 5
// 2f6: iflt 2b2
// 2f9: goto 307
// 2fc: ldc2_w -5851650740168172570
// 2ff: lload 9
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: iload 7
// 309: ifle 31b
// 30c: ifne 32a
// 30f: aload 19
// 311: checkcast java/util/Collection
// 314: aload 24
// 316: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 31b: pop
// 31c: goto 32a
// 31f: ldc2_w -5851650740168172570
// 322: lload 9
// 324: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: athrow
// 32a: dload 22
// 32c: ldc2_w 0.1
// 32f: dadd
// 330: dstore 22
// 332: aload 17
// 334: ifnull 2aa
// 337: dload 20
// 339: ldc2_w 0.1
// 33c: dadd
// 33d: dstore 20
// 33f: aload 17
// 341: iload 4
// 343: iflt 390
// 346: ifnull 293
// 349: aload 19
// 34b: iload 5
// 34d: ifle 39e
// 350: invokeinterface java/util/List.isEmpty ()Z 1
// 355: iload 4
// 357: ifle 37f
// 35a: aload 17
// 35c: ifnonnull 37f
// 35f: ifeq 37d
// 362: goto 370
// 365: ldc2_w -5851650740168172570
// 368: lload 9
// 36a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: athrow
// 370: aconst_null
// 371: areturn
// 372: ldc2_w -5851650740168172570
// 375: lload 9
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: iload 8
// 37f: ifeq 3a4
// 382: aload 19
// 384: checkcast java/util/Collection
// 387: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 38a: checkcast kotlin/random/Random
// 38d: invokestatic kotlin/collections/CollectionsKt.random (Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;
// 390: goto 39e
// 393: ldc2_w -5851650740168172570
// 396: lload 9
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: checkcast net/minecraft/class_243
// 3a1: goto 483
// 3a4: aload 19
// 3a6: checkcast java/lang/Iterable
// 3a9: astore 20
// 3ab: bipush 0
// 3ac: istore 21
// 3ae: aload 20
// 3b0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3b5: astore 22
// 3b7: aload 22
// 3b9: aload 17
// 3bb: ifnonnull 3ee
// 3be: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3c3: ifne 3e7
// 3c6: goto 3d4
// 3c9: ldc2_w -5851650740168172570
// 3cc: lload 9
// 3ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: athrow
// 3d4: new java/util/NoSuchElementException
// 3d7: dup
// 3d8: invokespecial java/util/NoSuchElementException.<init> ()V
// 3db: athrow
// 3dc: ldc2_w -5851650740168172570
// 3df: lload 9
// 3e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e6: athrow
// 3e7: aload 22
// 3e9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3ee: astore 23
// 3f0: aload 22
// 3f2: aload 17
// 3f4: ifnonnull 41f
// 3f7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3fc: ifne 41d
// 3ff: goto 40d
// 402: ldc2_w -5851650740168172570
// 405: lload 9
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: aload 23
// 40f: goto 480
// 412: ldc2_w -5851650740168172570
// 415: lload 9
// 417: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41c: athrow
// 41d: aload 23
// 41f: checkcast net/minecraft/class_243
// 422: astore 24
// 424: bipush 0
// 425: istore 26
// 427: lload 15
// 429: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 42c: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 42f: aload 24
// 431: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 434: dstore 24
// 436: aload 22
// 438: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 43d: astore 26
// 43f: aload 26
// 441: checkcast net/minecraft/class_243
// 444: astore 27
// 446: bipush 0
// 447: istore 29
// 449: lload 15
// 44b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 44e: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 451: aload 27
// 453: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 456: dstore 27
// 458: dload 24
// 45a: dload 27
// 45c: invokestatic java/lang/Double.compare (DD)I
// 45f: ifle 46a
// 462: aload 26
// 464: astore 23
// 466: dload 27
// 468: dstore 24
// 46a: aload 22
// 46c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 471: ifne 436
// 474: aload 17
// 476: iload 5
// 478: iflt 464
// 47b: ifnonnull 466
// 47e: aload 23
// 480: checkcast net/minecraft/class_243
// 483: areturn
}

// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
@NotNull
public final class_238 J(long a, @NotNull class_2350 dir) {
ax = a ^ ax;

try {
Intrinsics.checkNotNullParameter(dir, a<"e">(1128, 676506377395755570L ^ ax));
switch (rp.c[dir.ordinal()]) {
case 1:
return new class_238(0.15, 0.0, 0.15, 0.85, 0.0, 0.85);
case 2:
return new class_238(0.15, 1.0, 0.15, 0.85, 1.0, 0.85);
case 3:
return new class_238(0.15, 0.15, 0.0, 0.85, 0.85, 0.0);
case 4:
return new class_238(0.15, 0.15, 1.0, 0.85, 0.85, 1.0);
case 5:
return new class_238(0.0, 0.15, 0.15, 0.0, 0.85, 0.85);
case 6:
return new class_238(1.0, 0.15, 0.15, 1.0, 0.85, 0.85);
default:
throw new NoWhenBranchMatchedException();
}
} catch (NoSuchElementException var4) {
throw vm.a<"Å">(var4, 4541289395744295465L, ax);
}
}

public final boolean f(@NotNull class_243 point, @NotNull class_2338 bp, long a, float wallRange, float range) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 49453971100444
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 76919188026788
// 012: lxor
// 013: lstore 9
// 015: dup2
// 016: ldc2_w 66183367236497
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 11
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 32
// 027: lushr
// 028: l2i
// 029: istore 12
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 13
// 035: pop2
// 036: dup2
// 037: ldc2_w 51597191966139
// 03a: lxor
// 03b: lstore 14
// 03d: pop2
// 03e: ldc2_w -4639306712521814427
// 041: lload 3
// 042: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: aload 1
// 048: sipush 21103
// 04b: ldc2_w 8485883215181876451
// 04e: lload 3
// 04f: lxor
// 050: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 058: aload 2
// 059: sipush 1530
// 05c: ldc2_w 2877340412230163292
// 05f: lload 3
// 060: lxor
// 061: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 069: astore 16
// 06b: new net/minecraft/class_3959
// 06e: dup
// 06f: aload 0
// 070: lload 14
// 072: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 075: iload 11
// 077: i2s
// 078: swap
// 079: iload 12
// 07b: swap
// 07c: iload 13
// 07e: i2c
// 07f: swap
// 080: checkcast net/minecraft/class_1297
// 083: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 086: aload 1
// 087: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 08a: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 08d: lload 14
// 08f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 092: checkcast net/minecraft/class_1297
// 095: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 098: astore 17
// 09a: lload 7
// 09c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 09f: aload 17
// 0a1: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 0a4: dup
// 0a5: sipush 5713
// 0a8: ldc2_w 5746592724929104085
// 0ab: lload 3
// 0ac: lxor
// 0ad: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b5: astore 18
// 0b7: aload 0
// 0b8: aload 1
// 0b9: lload 9
// 0bb: invokevirtual su/catlean/gw.C (Lnet/minecraft/class_243;J)F
// 0be: fstore 19
// 0c0: aload 18
// 0c2: aload 16
// 0c4: ifnonnull 0ec
// 0c7: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 0ca: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 0cd: if_acmpne 144
// 0d0: goto 0dd
// 0d3: ldc2_w -4617903416557778235
// 0d6: lload 3
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 18
// 0df: goto 0ec
// 0e2: ldc2_w -4617903416557778235
// 0e5: lload 3
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0ef: aload 2
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f3: aload 16
// 0f5: ifnonnull 14c
// 0f8: ifne 144
// 0fb: goto 108
// 0fe: ldc2_w -4617903416557778235
// 101: lload 3
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: fload 19
// 10a: fload 5
// 10c: fload 5
// 10e: fmul
// 10f: fcmpl
// 110: aload 16
// 112: lload 3
// 113: lconst_0
// 114: lcmp
// 115: iflt 14e
// 118: ifnonnull 14c
// 11b: goto 128
// 11e: ldc2_w -4617903416557778235
// 121: lload 3
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: ifle 144
// 12b: goto 138
// 12e: ldc2_w -4617903416557778235
// 131: lload 3
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: bipush 1
// 139: ireturn
// 13a: ldc2_w -4617903416557778235
// 13d: lload 3
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: fload 19
// 146: fload 6
// 148: fload 6
// 14a: fmul
// 14b: fcmpl
// 14c: aload 16
// 14e: ifnonnull 162
// 151: ifle 165
// 154: goto 161
// 157: ldc2_w -4617903416557778235
// 15a: lload 3
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: bipush 1
// 162: goto 166
// 165: bipush 0
// 166: ireturn
}

public final boolean D(@NotNull class_2248 b, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gw.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -3414322046254243483
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: ldc "b"
// 12: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 15: astore 4
// 17: aload 1
// 18: instanceof net/minecraft/class_2237
// 1b: aload 4
// 1d: ifnonnull f2
// 20: ifne f1
// 23: goto 30
// 26: ldc2_w -3392949537152391739
// 29: lload 2
// 2a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: athrow
// 30: aload 1
// 31: getstatic net/minecraft/class_2246.field_9980 Lnet/minecraft/class_2248;
// 34: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 37: aload 4
// 39: ifnonnull f2
// 3c: goto 49
// 3f: ldc2_w -3392949537152391739
// 42: lload 2
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: ifne f1
// 4c: goto 59
// 4f: ldc2_w -3392949537152391739
// 52: lload 2
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: aload 1
// 5a: instanceof net/minecraft/class_2533
// 5d: aload 4
// 5f: ifnonnull f2
// 62: goto 6f
// 65: ldc2_w -3392949537152391739
// 68: lload 2
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: ifne f1
// 72: goto 7f
// 75: ldc2_w -3392949537152391739
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: aload 1
// 80: instanceof net/minecraft/class_2401
// 83: aload 4
// 85: ifnonnull f2
// 88: goto 95
// 8b: ldc2_w -3392949537152391739
// 8e: lload 2
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: ifne f1
// 98: goto a5
// 9b: ldc2_w -3392949537152391739
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: aload 1
// a6: instanceof net/minecraft/class_2269
// a9: aload 4
// ab: ifnonnull f2
// ae: goto bb
// b1: ldc2_w -3392949537152391739
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: ifne f1
// be: goto cb
// c1: ldc2_w -3392949537152391739
// c4: lload 2
// c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ca: athrow
// cb: aload 1
// cc: instanceof net/minecraft/class_2323
// cf: aload 4
// d1: ifnonnull f2
// d4: goto e1
// d7: ldc2_w -3392949537152391739
// da: lload 2
// db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e0: athrow
// e1: ifeq f5
// e4: goto f1
// e7: ldc2_w -3392949537152391739
// ea: lload 2
// eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f0: athrow
// f1: bipush 1
// f2: goto f6
// f5: bipush 0
// f6: ireturn
}

public final boolean O(@NotNull class_243 pos, int fov, long a) {
ax = a ^ ax;
long var5 = ax ^ 107936635004176L;
Intrinsics.checkNotNullParameter(pos, a<"e">(16388, 375491243225470474L ^ ax));
double var8 = pos.method_10216() - zf.v(var5).method_23317();
_g[] var10000 = vm.a<"Å">(8590215962161612494L, ax);
double var10 = pos.method_10215() - zf.v(var5).method_23321();
_g[] var7 = var10000;
float var12 = class_3532.method_15393(
(float)class_3532.method_15338(Math.toDegrees(Math.atan2(var10, var8)) - 90.0) - class_3532.method_15393(zf.v(var5).method_36454())
);

try {
double var16;
int var15 = (var16 = Math.abs((double)var12) - fov) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
if (var7 != null) {
return (boolean)var15;
}

if (var15 <= 0) {
return (boolean)1;
}
} catch (NoSuchElementException var13) {
throw vm.a<"Å">(var13, 8593613045421769326L, ax);
}

return (boolean)0;
}

@NotNull
public final class_3965 A(long a, @NotNull class_3959 context, @NotNull class_2338 block, @NotNull class_2680 state) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(context, a<"e">(16005, 2806672340575867288L ^ ax));
Intrinsics.checkNotNullParameter(block, a<"e">(26219, 3172294206091102536L ^ ax));
Intrinsics.checkNotNullParameter(state, a<"e">(13676, 3882433583002114669L ^ ax));
Object var10000 = class_1922.method_17744(context.method_17750(), context.method_17747(), context, gw::l, gw::n);
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(1265, 143164574390283247L ^ ax));
return (class_3965)var10000;
}

public static class_3965 q(gw var0, class_3959 var1, class_2338 var2, class_2680 var3, int var4, long var5, Object var7) {
var5 = a ^ var5;
long var8 = var5 ^ 41519268577576L;
if ((var4 & 4) != 0) {
class_2680 var10000 = class_2246.field_10540.method_9564();
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(25888, 7396857008753516399L ^ var5));
var3 = var10000;
}

return var0.A(var8, var1, var2, var3);
}

public final boolean s(@NotNull class_1297 entity, @NotNull _w rotation, float distance, boolean rayTrace, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 95640638853972
// 00e: lxor
// 00f: lstore 7
// 011: dup2
// 012: ldc2_w 138620516290544
// 015: lxor
// 016: lstore 9
// 018: dup2
// 019: ldc2_w 48823681625702
// 01c: lxor
// 01d: lstore 11
// 01f: dup2
// 020: ldc2_w 122105910707684
// 023: lxor
// 024: lstore 13
// 026: pop2
// 027: aload 1
// 028: sipush 11177
// 02b: ldc2_w 3219298777354460513
// 02e: lload 5
// 030: lxor
// 031: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 039: ldc2_w 1712105358294509114
// 03c: lload 5
// 03e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: aload 2
// 044: sipush 29009
// 047: ldc2_w 195572059840677798
// 04a: lload 5
// 04c: lxor
// 04d: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 055: fload 3
// 056: f2d
// 057: dstore 16
// 059: astore 15
// 05b: dload 16
// 05d: invokestatic net/minecraft/class_3532.method_33723 (D)D
// 060: dstore 18
// 062: lload 13
// 064: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 067: lload 7
// 069: dup2_x1
// 06a: pop2
// 06b: checkcast net/minecraft/class_1297
// 06e: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 071: dconst_0
// 072: lload 13
// 074: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 077: lload 13
// 079: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07c: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 07f: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 082: f2d
// 083: dconst_0
// 084: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 087: dup
// 088: sipush 14961
// 08b: ldc2_w 3317959662780435640
// 08e: lload 5
// 090: lxor
// 091: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 099: astore 20
// 09b: aconst_null
// 09c: astore 21
// 09e: dconst_0
// 09f: dstore 22
// 0a1: iload 4
// 0a3: ifeq 0f3
// 0a6: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0a9: fload 3
// 0aa: aload 2
// 0ab: invokevirtual su/catlean/_w.q ()F
// 0ae: aload 2
// 0af: invokevirtual su/catlean/_w.N ()F
// 0b2: lload 9
// 0b4: dup2_x1
// 0b5: pop2
// 0b6: invokevirtual su/catlean/dm.r (FFJF)Lnet/minecraft/class_239;
// 0b9: astore 21
// 0bb: aload 21
// 0bd: lload 5
// 0bf: lconst_0
// 0c0: lcmp
// 0c1: ifle 0dc
// 0c4: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 0c7: aload 15
// 0c9: ifnonnull 104
// 0cc: aload 20
// 0ce: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0d1: dstore 22
// 0d3: lload 5
// 0d5: lconst_0
// 0d6: lcmp
// 0d7: iflt 0f0
// 0da: aload 21
// 0dc: invokevirtual net/minecraft/class_239.method_17783 ()Lnet/minecraft/class_239$class_240;
// 0df: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 0e2: if_acmpeq 0f6
// 0e5: dload 22
// 0e7: dstore 18
// 0e9: dload 22
// 0eb: invokestatic java/lang/Math.sqrt (D)D
// 0ee: dstore 16
// 0f0: goto 0f6
// 0f3: aconst_null
// 0f4: astore 21
// 0f6: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0f9: aload 2
// 0fa: invokevirtual su/catlean/_w.N ()F
// 0fd: aload 2
// 0fe: invokevirtual su/catlean/_w.q ()F
// 101: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 104: astore 24
// 106: aload 20
// 108: aload 24
// 10a: getfield net/minecraft/class_243.field_1352 D
// 10d: dload 16
// 10f: dmul
// 110: aload 24
// 112: getfield net/minecraft/class_243.field_1351 D
// 115: dload 16
// 117: dmul
// 118: aload 24
// 11a: getfield net/minecraft/class_243.field_1350 D
// 11d: dload 16
// 11f: dmul
// 120: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 123: dup
// 124: sipush 5878
// 127: ldc2_w 4251333958312681510
// 12a: lload 5
// 12c: lxor
// 12d: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 135: astore 25
// 137: lload 13
// 139: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13c: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 13f: aload 24
// 141: dload 16
// 143: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 146: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
// 149: dconst_1
// 14a: dconst_1
// 14b: dconst_1
// 14c: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 14f: dup
// 150: sipush 13292
// 153: ldc2_w 64628190081041720
// 156: lload 5
// 158: lxor
// 159: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 161: astore 26
// 163: lload 13
// 165: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 168: checkcast net/minecraft/class_1297
// 16b: aload 20
// 16d: aload 25
// 16f: aload 26
// 171: aload 1
// 172: invokedynamic test (Lnet/minecraft/class_1297;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/gw.t (Lnet/minecraft/class_1297;Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
// 177: dload 18
// 179: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
// 17c: astore 27
// 17e: lload 5
// 180: lconst_0
// 181: lcmp
// 182: ifle 197
// 185: aload 27
// 187: ifnonnull 197
// 18a: bipush 0
// 18b: ireturn
// 18c: ldc2_w 1708738580993565338
// 18f: lload 5
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: aload 0
// 198: aload 21
// 19a: aload 15
// 19c: ifnonnull 1f4
// 19f: ifnull 1e1
// 1a2: goto 1b0
// 1a5: ldc2_w 1708738580993565338
// 1a8: lload 5
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: aload 27
// 1b2: aload 15
// 1b4: ifnonnull 1f4
// 1b7: goto 1c5
// 1ba: ldc2_w 1708738580993565338
// 1bd: lload 5
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
// 1c8: aload 20
// 1ca: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 1cd: dload 22
// 1cf: dcmpg
// 1d0: ifge 1f7
// 1d3: goto 1e1
// 1d6: ldc2_w 1708738580993565338
// 1d9: lload 5
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: aload 27
// 1e3: checkcast net/minecraft/class_239
// 1e6: goto 1f4
// 1e9: ldc2_w 1708738580993565338
// 1ec: lload 5
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: goto 1f9
// 1f7: aload 21
// 1f9: aload 20
// 1fb: lload 11
// 1fd: fload 3
// 1fe: invokespecial su/catlean/gw.D (Lnet/minecraft/class_239;Lnet/minecraft/class_243;JF)Lnet/minecraft/class_239;
// 201: astore 28
// 203: aload 28
// 205: instanceof net/minecraft/class_3966
// 208: aload 15
// 20a: lload 5
// 20c: lconst_0
// 20d: lcmp
// 20e: ifle 241
// 211: ifnonnull 23f
// 214: ifeq 259
// 217: goto 225
// 21a: ldc2_w 1708738580993565338
// 21d: lload 5
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: athrow
// 225: aload 28
// 227: checkcast net/minecraft/class_3966
// 22a: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 22d: aload 1
// 22e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 231: goto 23f
// 234: ldc2_w 1708738580993565338
// 237: lload 5
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: aload 15
// 241: ifnonnull 256
// 244: ifeq 259
// 247: goto 255
// 24a: ldc2_w 1708738580993565338
// 24d: lload 5
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: bipush 1
// 256: goto 25a
// 259: bipush 0
// 25a: ldc2_w 1718900348123547979
// 25d: lload 5
// 25f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 264: lload 5
// 266: lconst_0
// 267: lcmp
// 268: iflt 272
// 26b: ifnull 28a
// 26e: bipush 1
// 26f: anewarray 1162
// 272: ldc2_w 1720088029120690298
// 275: lload 5
// 277: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: goto 28a
// 27f: ldc2_w 1708738580993565338
// 282: lload 5
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: ireturn
}

private final class_239 D(class_239 var1, class_243 var2, long var3, float var5) {
var3 = a ^ var3;
_g[] var6 = vm.a<"Å">(-1308605540541457362L, var3);

label27: {
try {
if (var6 != null) {
return var1;
}

if (!var1.method_17784().method_24802((class_2374)var2, var5)) {
break label27;
}
} catch (NoSuchElementException var8) {
throw vm.a<"Å">(var8, -1323266236168759154L, var3);
}

return var1;
}

class_243 var10 = var1.method_17784();
Intrinsics.checkNotNullExpressionValue(var10, a<"e">(6982, 5431667536836171662L ^ var3));
class_243 var7 = var10;
class_3965 var11 = class_3965.method_17778(
var7,
class_2350.method_10142(var7.field_1352 - var2.field_1352, var7.field_1351 - var2.field_1351, var7.field_1350 - var2.field_1350),
class_2338.method_49638((class_2374)var7)
);
Intrinsics.checkNotNullExpressionValue(var11, a<"e">(3103, 3419685512000962789L ^ var3));
return (class_239)var11;
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@NotNull
public final List c(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 45831227871323L;
class_2338 var10000 = class_2338.method_49638((class_2374)zf.v(var3).method_33571());
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(8330, 754863377121608647L ^ var1));
class_2338 var6 = var10000;
int var7 = (int)Math.ceil(zf.v(var3).method_55754());
Iterable var8 = new IntRange(var6.method_10263() - var7, var6.method_10263() + var7);
_g[] var46 = vm.a<"Å">(4791223500558807941L, var1);
boolean var9 = false;
Collection var11 = new ArrayList();
_g[] var5 = var46;
boolean var12 = false;
Iterator var13 = var8.iterator();

label77:
while (true) {
Iterator var47 = var13;

label74:
while (true) {
if (var47.hasNext()) {
int var14 = ((IntIterator)var13).nextInt();
int var15 = var14;
boolean var16 = false;
Iterable var17 = new IntRange(var6.method_10264() - var7, var6.method_10264() + var7);
boolean var18 = false;
ArrayList var48 = new ArrayList();
if (var1 <= 0L) {
return var48;
}

var10000 = var48;
if (var5 != null) {
break;
}

Object var20 = var10000;
boolean var21 = false;
Iterator var22 = var17.iterator();

while (var22.hasNext()) {
int var23 = ((IntIterator)var22).nextInt();
int var24 = var23;
boolean var25 = false;
Iterable var26 = new IntRange(var6.method_10260() - var7, var6.method_10260() + var7);
boolean var27 = false;
var var29 = new ArrayList();
boolean var30 = false;
boolean var32 = false;
var47 = var26.iterator();
if (var5 != null) {
continue label74;
}

Iterator var33 = var47;

label66: {
label65:
while (var33.hasNext()) {
int var34 = ((IntIterator)var33).nextInt();
boolean var36 = false;
boolean var38 = false;
class_2338 var39 = new class_2338(var15, var24, var34);
boolean var40 = false;

try {
var10000 = var29;
if (var1 < 0L) {
break label66;
}

var29.add(var39);
} catch (NoSuchElementException var42) {
throw vm.a<"Å">(var42, 4758596219607988005L, var1);
}

while (true) {
try {
if (var5 != null) {
break label65;
}

if (var5 == null) {
break;
}
} catch (NoSuchElementException var43) {
throw vm.a<"Å">(var43, 4758596219607988005L, var1);
}

if (var1 >= 0L) {
break label65;
}
}
}

var10000 = var29;
}

Object var41 = var10000;
CollectionsKt.addAll((Collection)var20, (Iterable)var41);
if (var5 != null) {
break;
}
}

var var45 = (Iterable & List)var20;
CollectionsKt.addAll(var11, var45);
if (var1 >= 0L && var5 == null) {
continue label77;
}
}

var10000 = var11;
if (var1 >= 0L) {
}
break;
}

return (List)var10000;
}
}

// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
@NotNull
public final _w r(@NotNull class_2350 direction, long a) {
ax = a ^ ax;
long var4 = ax ^ 138531055625411L;
long var6 = ax ^ 131236172768691L;

float var10000;
label47: {
label46: {
label45: {
label44: {
try {
Intrinsics.checkNotNullParameter(direction, a<"e">(16206, 7807421700016077677L ^ ax));
switch (rp.c[direction.ordinal()]) {
case 3:
var10000 = 180.0F;
break label47;
case 4:
break label46;
case 5:
break label45;
case 6:
break label44;
}
} catch (NoSuchElementException var12) {
throw vm.a<"Å">(var12, -6538465091004739474L, ax);
}

var10000 = 0.0F;
break label47;
}

var10000 = -90.0F;
break label47;
}

var10000 = 90.0F;
break label47;
}

var10000 = 0.0F;
}

float var8 = var10000;

label30: {
label29: {
try {
switch (rp.c[direction.ordinal()]) {
case 1:
break label29;
case 2:
var10000 = -88.0F;
break label30;
}
} catch (NoSuchElementException var11) {
throw vm.a<"Å">(var11, -6538465091004739474L, ax);
}

var10000 = -10.0F;
break label30;
}

var10000 = 88.0F;
}

float var9 = var10000;
int var10 = (int)(dm.h.U(var4) / 360.0F);
return new _w(var8 + var10 * b<"o">(7429, 8600354416475475741L ^ ax), var6, var9, false, null, b<"o">(12363, 258377955347210842L ^ ax), null);
}

private static final class_2596 m(class_3965 var0, int var1) {
return (class_2596)(new class_2885(class_1268.field_5808, var0, var1));
}

private static final Unit L(int param0, yi param1, class_3965 param2, zr param3, class_2338 param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gw.a J
// 003: ldc2_w 16516255007997
// 006: lxor
// 007: lstore 5
// 009: lload 5
// 00b: dup2
// 00c: ldc2_w 9239824160362
// 00f: lxor
// 010: lstore 7
// 012: dup2
// 013: ldc2_w 68371300793076
// 016: lxor
// 017: lstore 9
// 019: dup2
// 01a: ldc2_w 43483446875433
// 01d: lxor
// 01e: lstore 11
// 020: dup2
// 021: ldc2_w 135766863622895
// 024: lxor
// 025: dup2
// 026: bipush 32
// 028: lushr
// 029: l2i
// 02a: istore 13
// 02c: dup2
// 02d: bipush 32
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: lstore 14
// 035: pop2
// 036: dup2
// 037: ldc2_w 110985994534215
// 03a: lxor
// 03b: lstore 16
// 03d: dup2
// 03e: ldc2_w 112928395229093
// 041: lxor
// 042: lstore 18
// 044: dup2
// 045: ldc2_w 110095604114367
// 048: lxor
// 049: lstore 20
// 04b: dup2
// 04c: ldc2_w 37521372482996
// 04f: lxor
// 050: dup2
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 22
// 057: dup2
// 058: bipush 32
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 23
// 061: dup2
// 062: bipush 48
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 24
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 113146600244192
// 070: lxor
// 071: lstore 25
// 073: pop2
// 074: ldc2_w -7942494683716165570
// 077: lload 5
// 079: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: lload 25
// 080: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 083: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 086: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 089: istore 28
// 08b: astore 27
// 08d: iload 0
// 08e: aload 27
// 090: ifnonnull 147
// 093: bipush -1
// 094: if_icmpeq 11e
// 097: goto 0a5
// 09a: ldc2_w -7948113071818087266
// 09d: lload 5
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: aload 1
// 0a6: getstatic su/catlean/rp.L [I
// 0a9: swap
// 0aa: invokevirtual su/catlean/yi.ordinal ()I
// 0ad: iaload
// 0ae: tableswitch 93 1 3 37 37 65
// 0c8: ldc2_w -7948113071818087266
// 0cb: lload 5
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0d6: iload 0
// 0d7: lload 7
// 0d9: invokevirtual su/catlean/gg.f (IJ)V
// 0dc: aload 27
// 0de: ifnull 11e
// 0e1: goto 0ef
// 0e4: ldc2_w -7948113071818087266
// 0e7: lload 5
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0f2: lload 20
// 0f4: iload 0
// 0f5: invokevirtual su/catlean/gg.X (JI)V
// 0f8: aload 27
// 0fa: ifnull 11e
// 0fd: goto 10b
// 100: ldc2_w -7948113071818087266
// 103: lload 5
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: new kotlin/NoWhenBranchMatchedException
// 10e: dup
// 10f: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 112: athrow
// 113: ldc2_w -7948113071818087266
// 116: lload 5
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 121: lload 16
// 123: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 126: aload 2
// 127: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 12a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 12d: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 130: dup
// 131: sipush 22234
// 134: ldc2_w 7938815297444652586
// 137: lload 5
// 139: lxor
// 13a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 142: lload 11
// 144: invokevirtual su/catlean/gw.D (Lnet/minecraft/class_2248;J)Z
// 147: aload 27
// 149: ifnonnull 173
// 14c: ifeq 18d
// 14f: goto 15d
// 152: ldc2_w -7948113071818087266
// 155: lload 5
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: lload 25
// 15f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 162: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 165: goto 173
// 168: ldc2_w -7948113071818087266
// 16b: lload 5
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 27
// 175: ifnonnull 18a
// 178: ifne 18d
// 17b: goto 189
// 17e: ldc2_w -7948113071818087266
// 181: lload 5
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: bipush 1
// 18a: goto 18e
// 18d: bipush 0
// 18e: istore 29
// 190: iload 29
// 192: ifeq 1ac
// 195: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 198: lload 9
// 19a: bipush 1
// 19b: invokevirtual su/catlean/wu.G (JZ)V
// 19e: goto 1ac
// 1a1: ldc2_w -7948113071818087266
// 1a4: lload 5
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: aload 3
// 1ad: getstatic su/catlean/zr.Normal Lsu/catlean/zr;
// 1b0: if_acmpne 1e6
// 1b3: iload 13
// 1b5: lload 14
// 1b7: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 1ba: lload 25
// 1bc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1bf: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1c2: aload 2
// 1c3: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 1c6: dup
// 1c7: sipush 15643
// 1ca: ldc2_w 6789648044214996443
// 1cd: lload 5
// 1cf: lxor
// 1d0: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d8: goto 1fc
// 1db: ldc2_w -7948113071818087266
// 1de: lload 5
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 1e9: aload 2
// 1ea: invokedynamic predict (Lnet/minecraft/class_3965;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/gw.m (Lnet/minecraft/class_3965;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 1ef: iload 22
// 1f1: iload 23
// 1f3: iload 24
// 1f5: i2c
// 1f6: invokevirtual su/catlean/gw.y (Lnet/minecraft/class_7204;IIC)V
// 1f9: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 1fc: pop
// 1fd: new net/minecraft/class_2879
// 200: dup
// 201: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 204: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 207: checkcast net/minecraft/class_2596
// 20a: lload 18
// 20c: dup2_x1
// 20d: pop2
// 20e: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 211: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 214: pop
// 215: getstatic su/catlean/gw.y Ljava/util/Map;
// 218: aload 4
// 21a: invokestatic su/catlean/zf.A ()J
// 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 220: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 225: pop
// 226: iload 29
// 228: aload 27
// 22a: ifnonnull 257
// 22d: ifeq 255
// 230: goto 23e
// 233: ldc2_w -7948113071818087266
// 236: lload 5
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 241: lload 9
// 243: bipush 0
// 244: invokevirtual su/catlean/wu.G (JZ)V
// 247: goto 255
// 24a: ldc2_w -7948113071818087266
// 24d: lload 5
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: iload 28
// 257: aload 27
// 259: ifnonnull 285
// 25c: bipush -1
// 25d: if_icmpeq 2d0
// 260: goto 26e
// 263: ldc2_w -7948113071818087266
// 266: lload 5
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: aload 1
// 26f: getstatic su/catlean/rp.L [I
// 272: swap
// 273: invokevirtual su/catlean/yi.ordinal ()I
// 276: iaload
// 277: goto 285
// 27a: ldc2_w -7948113071818087266
// 27d: lload 5
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: tableswitch 75 2 3 23 52
// 29c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 29f: iload 28
// 2a1: lload 7
// 2a3: invokevirtual su/catlean/gg.f (IJ)V
// 2a6: aload 27
// 2a8: ifnull 2d0
// 2ab: goto 2b9
// 2ae: ldc2_w -7948113071818087266
// 2b1: lload 5
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2bc: lload 20
// 2be: iload 0
// 2bf: invokevirtual su/catlean/gg.X (JI)V
// 2c2: goto 2d0
// 2c5: ldc2_w -7948113071818087266
// 2c8: lload 5
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 2d3: areturn
}

private static final boolean M(zl param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gw.a J
// 03: ldc2_w 46469442371265
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 3169041466575215106
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: sipush 13641
// 15: ldc2_w 1201211687385825213
// 18: lload 1
// 19: lxor
// 1a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 3
// 23: aload 0
// 24: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 27: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 2a: aload 3
// 2b: ifnonnull 52
// 2e: if_acmpeq 55
// 31: goto 3e
// 34: ldc2_w 3138591140232388258
// 37: lload 1
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: aload 0
// 3f: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 42: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 45: goto 52
// 48: ldc2_w 3138591140232388258
// 4b: lload 1
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: if_acmpne 63
// 55: bipush 1
// 56: goto 64
// 59: ldc2_w 3138591140232388258
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: bipush 0
// 64: ireturn
}

private static final boolean l(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean E(ArrayList param0, zl param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gw.a J
// 03: ldc2_w 80579609801103
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 7256655137902204236
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: ldc "s"
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: aload 0
// 18: checkcast java/lang/Iterable
// 1b: astore 5
// 1d: astore 4
// 1f: bipush 0
// 20: istore 6
// 22: aload 5
// 24: aload 4
// 26: ifnonnull 78
// 29: instanceof java/util/Collection
// 2c: ifeq 76
// 2f: goto 3c
// 32: ldc2_w 7260056628335153644
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: aload 5
// 3e: checkcast java/util/Collection
// 41: aload 4
// 43: ifnonnull 78
// 46: goto 53
// 49: ldc2_w 7260056628335153644
// 4c: lload 2
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: invokeinterface java/util/Collection.isEmpty ()Z 1
// 58: ifeq 76
// 5b: goto 68
// 5e: ldc2_w 7260056628335153644
// 61: lload 2
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: bipush 0
// 69: goto d0
// 6c: ldc2_w 7260056628335153644
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: aload 5
// 78: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 7d: astore 7
// 7f: aload 7
// 81: invokeinterface java/util/Iterator.hasNext ()Z 1
// 86: ifeq cf
// 89: aload 7
// 8b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 90: astore 8
// 92: aload 8
// 94: checkcast net/minecraft/class_1297
// 97: astore 9
// 99: bipush 0
// 9a: istore 10
// 9c: aload 9
// 9e: aload 1
// 9f: invokevirtual su/catlean/zl.v ()Lnet/minecraft/class_2338;
// a2: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// a5: aload 1
// a6: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// a9: ldc2_w 0.5
// ac: invokevirtual net/minecraft/class_243.method_43206 (Lnet/minecraft/class_2350;D)Lnet/minecraft/class_243;
// af: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// b2: ldc2_w 0.5
// b5: dcmpg
// b6: aload 4
// b8: ifnonnull bf
// bb: ifge c2
// be: bipush 1
// bf: goto c3
// c2: bipush 0
// c3: ifeq 7f
// c6: bipush 1
// c7: aload 4
// c9: ifnonnull b6
// cc: goto d0
// cf: bipush 0
// d0: ireturn
}

private static final boolean W(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final class_3965 l(class_2338 var0, class_2680 var1, class_3959 var2, class_2338 var3) {
long var4 = a ^ 137607223514716L;
long var6 = var4 ^ 25093898579942L;

class_2680 var10000;
label59: {
try {
Intrinsics.checkNotNullParameter(var2, a<"e">(22738, 8381547564901300918L ^ var4));
Intrinsics.checkNotNullParameter(var3, a<"e">(7479, 7093316094522802031L ^ var4));
if (!var3.equals(var0)) {
var10000 = class_2246.field_10124.method_9564();
break label59;
}
} catch (NoSuchElementException var22) {
throw vm.a<"Å">(var22, -4389932768267946433L, var4);
}

var10000 = var1;
}

class_2680 var9 = var10000;
Intrinsics.checkNotNull(var9);
class_243 var24 = var2.method_17750();
Intrinsics.checkNotNullExpressionValue(var24, a<"e">(26935, 7635303587329592135L ^ var4));
class_243 var23 = var24;
class_243 var25 = var2.method_17747();
Intrinsics.checkNotNullExpressionValue(var25, a<"e">(11523, 1001735136193253232L ^ var4));
class_243 var10 = var25;
class_265 var26 = var2.method_17748(var9, (class_1922)zf.z(var6), var3);
Intrinsics.checkNotNullExpressionValue(var26, a<"e">(6601, 8268883593354034054L ^ var4));
class_265 var11 = var26;
class_3965 var12 = zf.z(var6).method_17745(var23, var10, var3, var11, var9);
class_265 var27 = class_259.method_1073();
Intrinsics.checkNotNullExpressionValue(var27, a<"e">(23163, 6136658343110735912L ^ var4));
class_265 var13 = var27;
class_3965 var14 = var13.method_1092(var23, var10, var3);

label51: {
try {
if (var12 == null) {
var28 = Double.MAX_VALUE;
break label51;
}
} catch (NoSuchElementException var21) {
throw vm.a<"Å">(var21, -4389932768267946433L, var4);
}

var28 = var2.method_17750().method_1025(var12.method_17784());
}

double var15 = var28;

label43: {
try {
if (var14 == null) {
var29 = Double.MAX_VALUE;
break label43;
}
} catch (NoSuchElementException var20) {
throw vm.a<"Å">(var20, -4389932768267946433L, var4);
}

var29 = var2.method_17750().method_1025(var14.method_17784());
}

double var17 = var29;

try {
if (var15 <= var17) {
return var12;
}
} catch (NoSuchElementException var19) {
throw vm.a<"Å">(var19, -4389932768267946433L, var4);
}

return var14;
}

private static final class_3965 n(class_3959 var0) {
long var1 = a ^ 89735111973246L;
Intrinsics.checkNotNullParameter(var0, a<"e">(13641, 1201322507920873474L ^ var1));
class_243 var10000 = var0.method_17750().method_1020(var0.method_17747());
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(22762, 8368835049018422698L ^ var1));
class_243 var3 = var10000;
return class_3965.method_17778(
var0.method_17747(), class_2350.method_10142(var3.field_1352, var3.field_1351, var3.field_1350), class_2338.method_49638((class_2374)var0.method_17747())
);
}

private static final boolean t(class_1297 param0, class_1297 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/gw.a J
// 03: ldc2_w 35410045445923
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -1001848489308191776
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: sipush 15152
// 15: ldc2_w 5974810579702392880
// 18: lload 2
// 19: lxor
// 1a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/gw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 4
// 24: aload 1
// 25: invokevirtual net/minecraft/class_1297.method_5863 ()Z
// 28: aload 4
// 2a: ifnonnull 4f
// 2d: ifeq 68
// 30: goto 3d
// 33: ldc2_w -978250388819310784
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: aload 1
// 3e: aload 0
// 3f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 42: goto 4f
// 45: ldc2_w -978250388819310784
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 4
// 51: ifnonnull 65
// 54: ifeq 68
// 57: goto 64
// 5a: ldc2_w -978250388819310784
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: bipush 1
// 65: goto 69
// 68: bipush 0
// 69: ireturn
}

static {
long var20 = a ^ 58458194141647L;
int[] var10000 = new int[2];
vm.a<"Å">(var10000, -5404662761471353252L, var20);
Cipher var11;
Cipher var26 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var26.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[56];
int var16 = 0;
String var15 = "ûg|\u0019 ÖÜ'\\Þ\u0011\u0096A0µ!Ñ¯\u0013§ÌRJ9\u0088!]Vv÷w\u0093\u0010\u000fÌ0\u0091ë\u0083ßÅ ýCÛ;ÄÛÑ\u0010<í\u009bç\fjDú´µ\u0010h\u0096uæ4 \u009dS?4\f\u009a\u0099xìmE\u0017%©»é³\u001bImºHlâZô»àÍ´áÎ(\"Ö\bgª¹4\u0015\u0018CbN;!QlÑ\u0082ùu_cl¸ñ±YÛªFN\u0019\u0005ò»\u0000H\"H-\u0010\f°¬îM\u0093½\u009b\b\u0004)üâ\u001c6ò\u0018Î\u009d\u000fè¯º]LD\u009d\u007f¢\u007f´Ó[mÚ5\n\u0085+$\u009a \u009e\u008eò\\\u000eáÆÐýG®\u000e}&?\u009e¡Ð\u001fÊ\u0001$ \u008eÔ\u0080»qØÍSõ\u0018o7\u0015I\u008ex¡\u0006q\u008e½6Îôþ\u0019\u009c2¡\u0010&ALª(äÚ¦ ô\u0012a,ªî¶\u0084öµ\rA\nÒÿ\u0016æ\u008bÝ\u00148\u009dEàè$½©\u0092ÖD\u008d\u0000\u0082§\n\u0010¤ E)\u0001;\u0084i7¿\u008cÔ»79¦\u0010\u008fæ&\u0006,ÆsÎ9²Ý_\"Ê\u0083Ñ ¦\rFþ\u0090l\\#Y{\u0018\u0094¦4H\u0091±\u009f7]û´Ó)ó]\u0013\u0010Ç²-·\u0018\u0081\u008an)\u0019ÜÈ\u008c\nh¶%,6Êq\u00004}\u009b/ÉÅ¼ \u0093öª«S\"\u0099x\u0017\u007f4\u0088\u001a \u0015pú\n{\u001e\u00ad2¾ÐIÐ:ÝU\u008f©ø ùsÏ~\u008cL¯t\u008b»ý{)¨x\u0014\\ÐN\u0005{z!Óf}(\u00ad\u0010\u0014Y\u0098\u0010\u0091\\ZEçý]jóÜf\u000b·(øx +^bÖ¬\u0088Â\u009dsÀíU\u0016ï!\u0083,=\u0016ªóÇ2\n\u0097K\u0084÷/£÷\f(ßÓCæ\u0083q\u0010èø\u0083\u008d\u001dDÐ*»\u0004\u0083Zræ\u000bM\\D²Zz\u0085f!Ææhf?oêE[ \u009c yL\u001fÄi\u0086~ÆV£þ¾\u0001\u0000áoä 2Ì«)\u0081m\u0003\u0005\u0011yI¢\u0010Aã\u007f¬:\u0002¯}°\u0019¥c\u0013\u0002\u0006x(Ï¿°}Ý\u001aR¹s¶£ªeÈJWkØ\u008bÆiÎ\u0016z\u000b\u0002\u001båF \u0019*ËÂ/1\fò2\u0017\u0010êE´\u008dx..`.X{\u0018D\u0017å\u0004\u0010\u0000\u00148îòÒ!]Ú\u000fè¼ÈçfS\u0010EÒ\u0017â¥jv+/\u008aaÖ\u0085SÌ% Å\u0094Ý*À{Á¨Ì\rçÕR\u0091\u0086§ºÒâpaæ*ø¸ªñ¦ªV×ë\u0010\u0002ô¯Mî¸\n\u0014 y\u008f\u008aµ\u00935\u009e(Ó\u0019\u0006\u0019%0Ö\u0013Ã³éë³w=.\u0096u@\u0000¸2\u0087\u0093Ã\u009eùær,òÛL\u00953HN]\u001aí\u0018,ü\u008cª´\u009dåE\u0088á\u009dº\u009b\u0001^\tÊi¶)ñ\u009d\u0087q\u0010ïÙ\u0002ß\u00032X¤P\u0093þ\u0001\u009ee\n\u0087(´^rPÞ³#/A\u0005Ê\u009e\u0001ªâyDú©\u0006'Q18R'è\føoô¹\u0017á\tx\u0094Ð°: ¤\tLÖ@\u0088ç°\u0015Y)§\u0092\u001d\u0092¡>JC¡/\u0016æ¯\tÉÍ¨\u0095y\u009d\u0086\u0018¸Wg\u0014ñ\u001eò¨\u001cu|¶\u0095wK\u001ak\u0097\u0089\rg¹>9\u0010÷_Aäupz\f\u0003Ô¼\u009e2vj)\u0010Ò1_(ªç|¤!i¬y=k\u0007\u001e\u0010Ný¤\r®eðGX+aÈ%ºô£ '\u001b¥û\u0091\u0086&\u0013b\u0018Ý¨gK\f¡È3\u0016\bèÃ¶\u00959\u0094.\u001auÆüF ×o\u008a\u0001ÏÐ\u008aª¬\u001fa°nbp?ÏÞT»]Â\u008eª\u000f\bÍ_]Cê¸\u0010\u0018EÜJ\bÞÊpô@u¡ò\u0082¯ö(\\\u0091Y¬¡\u008b\u0082dl£µ¾=F\u00ad!Q\u000esW\r\u0012\u009cJäÔ\u008e\u0014¹ú$fø°vó\u000bÀ|\u0006\u0010º\u0017¥Ó<P²ß\u0000\u0097l³¹\u0000\u0083\\(O±7»\u0081Ö\u0092ö\u0014\u000f/§Úb>¯!\u0089Ú,\u0099£Ab\u0085:u\u0010võéÏ\u0002ùÚ:\u0001\u0000k· ÌÆ\u009fó®\n\u0010C\r1]Ë\u000f=¹.\u0016H¾\u0094~?UóÂ\u001b\u000ez ñ\u0016&(B4ìÒA7P$Tx\u0016g3û?\u0002\u009aG±bí\u009aÓà^Ú6}p4çÓO[õ¾êRj\n _\u0001\u001c\u0090!\u0090\b5q`ùææ\u0098\u0004º|?ÂäyUKc\u0091\u009a¸\r\u0080tQÕ\u0018%¤¸·\u0004\u0004Ø\u0085qó¬´\u009d\u0004ÿl³íÀ!ÃO.Õ öÇù\r\u0087GÀ7ñH\u0019Ê/¤\u0093\u0080}ûJ\u009f¡q 6\u0098,\nÚI¬²\u0094 \u001cÈ³\u001c\u0019IïnKÏHý\u0092,\"lF\u001c8Ú93länMy\nM_\u008cö \u00927\u0083¬¦\u0016V$¤¸æ\u0089¨\u009dt\u0010óÚ\u0094Ç/¤ö\u000e¾\u0083\u00adÒl\u0090\\L\u0010\u0096x©B\u000bó¾ýBËU\n\\\r@\u0002(\u0092dóoi\u0092Q¢iÑñ\u0018\u009e\u009f\u0096>U\"8wPw\u0095\u000fü\u0004Z\u001a\u0003ÚÝ'\nÕ\u0005\u0083W|.ó\u0018'ÎC\u0002\u0013Z]f\u0015ÂÏfãªå¸\u0089\u00840\u000eÇúez ?#\u000b\u0016dö\u009c\u0082¯HB\u0001G\u0083\\ 8V\u0082È/§t\u0082±ö6\u00823=jð\u0010oÓXè\fõÑ\u0004XpL?Ï³¤ò";
int var17 = "ûg|\u0019 ÖÜ'\\Þ\u0011\u0096A0µ!Ñ¯\u0013§ÌRJ9\u0088!]Vv÷w\u0093\u0010\u000fÌ0\u0091ë\u0083ßÅ ýCÛ;ÄÛÑ\u0010<í\u009bç\fjDú´µ\u0010h\u0096uæ4 \u009dS?4\f\u009a\u0099xìmE\u0017%©»é³\u001bImºHlâZô»àÍ´áÎ(\"Ö\bgª¹4\u0015\u0018CbN;!QlÑ\u0082ùu_cl¸ñ±YÛªFN\u0019\u0005ò»\u0000H\"H-\u0010\f°¬îM\u0093½\u009b\b\u0004)üâ\u001c6ò\u0018Î\u009d\u000fè¯º]LD\u009d\u007f¢\u007f´Ó[mÚ5\n\u0085+$\u009a \u009e\u008eò\\\u000eáÆÐýG®\u000e}&?\u009e¡Ð\u001fÊ\u0001$ \u008eÔ\u0080»qØÍSõ\u0018o7\u0015I\u008ex¡\u0006q\u008e½6Îôþ\u0019\u009c2¡\u0010&ALª(äÚ¦ ô\u0012a,ªî¶\u0084öµ\rA\nÒÿ\u0016æ\u008bÝ\u00148\u009dEàè$½©\u0092ÖD\u008d\u0000\u0082§\n\u0010¤ E)\u0001;\u0084i7¿\u008cÔ»79¦\u0010\u008fæ&\u0006,ÆsÎ9²Ý_\"Ê\u0083Ñ ¦\rFþ\u0090l\\#Y{\u0018\u0094¦4H\u0091±\u009f7]û´Ó)ó]\u0013\u0010Ç²-·\u0018\u0081\u008an)\u0019ÜÈ\u008c\nh¶%,6Êq\u00004}\u009b/ÉÅ¼ \u0093öª«S\"\u0099x\u0017\u007f4\u0088\u001a \u0015pú\n{\u001e\u00ad2¾ÐIÐ:ÝU\u008f©ø ùsÏ~\u008cL¯t\u008b»ý{)¨x\u0014\\ÐN\u0005{z!Óf}(\u00ad\u0010\u0014Y\u0098\u0010\u0091\\ZEçý]jóÜf\u000b·(øx +^bÖ¬\u0088Â\u009dsÀíU\u0016ï!\u0083,=\u0016ªóÇ2\n\u0097K\u0084÷/£÷\f(ßÓCæ\u0083q\u0010èø\u0083\u008d\u001dDÐ*»\u0004\u0083Zræ\u000bM\\D²Zz\u0085f!Ææhf?oêE[ \u009c yL\u001fÄi\u0086~ÆV£þ¾\u0001\u0000áoä 2Ì«)\u0081m\u0003\u0005\u0011yI¢\u0010Aã\u007f¬:\u0002¯}°\u0019¥c\u0013\u0002\u0006x(Ï¿°}Ý\u001aR¹s¶£ªeÈJWkØ\u008bÆiÎ\u0016z\u000b\u0002\u001båF \u0019*ËÂ/1\fò2\u0017\u0010êE´\u008dx..`.X{\u0018D\u0017å\u0004\u0010\u0000\u00148îòÒ!]Ú\u000fè¼ÈçfS\u0010EÒ\u0017â¥jv+/\u008aaÖ\u0085SÌ% Å\u0094Ý*À{Á¨Ì\rçÕR\u0091\u0086§ºÒâpaæ*ø¸ªñ¦ªV×ë\u0010\u0002ô¯Mî¸\n\u0014 y\u008f\u008aµ\u00935\u009e(Ó\u0019\u0006\u0019%0Ö\u0013Ã³éë³w=.\u0096u@\u0000¸2\u0087\u0093Ã\u009eùær,òÛL\u00953HN]\u001aí\u0018,ü\u008cª´\u009dåE\u0088á\u009dº\u009b\u0001^\tÊi¶)ñ\u009d\u0087q\u0010ïÙ\u0002ß\u00032X¤P\u0093þ\u0001\u009ee\n\u0087(´^rPÞ³#/A\u0005Ê\u009e\u0001ªâyDú©\u0006'Q18R'è\føoô¹\u0017á\tx\u0094Ð°: ¤\tLÖ@\u0088ç°\u0015Y)§\u0092\u001d\u0092¡>JC¡/\u0016æ¯\tÉÍ¨\u0095y\u009d\u0086\u0018¸Wg\u0014ñ\u001eò¨\u001cu|¶\u0095wK\u001ak\u0097\u0089\rg¹>9\u0010÷_Aäupz\f\u0003Ô¼\u009e2vj)\u0010Ò1_(ªç|¤!i¬y=k\u0007\u001e\u0010Ný¤\r®eðGX+aÈ%ºô£ '\u001b¥û\u0091\u0086&\u0013b\u0018Ý¨gK\f¡È3\u0016\bèÃ¶\u00959\u0094.\u001auÆüF ×o\u008a\u0001ÏÐ\u008aª¬\u001fa°nbp?ÏÞT»]Â\u008eª\u000f\bÍ_]Cê¸\u0010\u0018EÜJ\bÞÊpô@u¡ò\u0082¯ö(\\\u0091Y¬¡\u008b\u0082dl£µ¾=F\u00ad!Q\u000esW\r\u0012\u009cJäÔ\u008e\u0014¹ú$fø°vó\u000bÀ|\u0006\u0010º\u0017¥Ó<P²ß\u0000\u0097l³¹\u0000\u0083\\(O±7»\u0081Ö\u0092ö\u0014\u000f/§Úb>¯!\u0089Ú,\u0099£Ab\u0085:u\u0010võéÏ\u0002ùÚ:\u0001\u0000k· ÌÆ\u009fó®\n\u0010C\r1]Ë\u000f=¹.\u0016H¾\u0094~?UóÂ\u001b\u000ez ñ\u0016&(B4ìÒA7P$Tx\u0016g3û?\u0002\u009aG±bí\u009aÓà^Ú6}p4çÓO[õ¾êRj\n _\u0001\u001c\u0090!\u0090\b5q`ùææ\u0098\u0004º|?ÂäyUKc\u0091\u009a¸\r\u0080tQÕ\u0018%¤¸·\u0004\u0004Ø\u0085qó¬´\u009d\u0004ÿl³íÀ!ÃO.Õ öÇù\r\u0087GÀ7ñH\u0019Ê/¤\u0093\u0080}ûJ\u009f¡q 6\u0098,\nÚI¬²\u0094 \u001cÈ³\u001c\u0019IïnKÏHý\u0092,\"lF\u001c8Ú93länMy\nM_\u008cö \u00927\u0083¬¦\u0016V$¤¸æ\u0089¨\u009dt\u0010óÚ\u0094Ç/¤ö\u000e¾\u0083\u00adÒl\u0090\\L\u0010\u0096x©B\u000bó¾ýBËU\n\\\r@\u0002(\u0092dóoi\u0092Q¢iÑñ\u0018\u009e\u009f\u0096>U\"8wPw\u0095\u000fü\u0004Z\u001a\u0003ÚÝ'\nÕ\u0005\u0083W|.ó\u0018'ÎC\u0002\u0013Z]f\u0015ÂÏfãªå¸\u0089\u00840\u000eÇúez ?#\u000b\u0016dö\u009c\u0082¯HB\u0001G\u0083\\ 8V\u0082È/§t\u0082±ö6\u00823=jð\u0010oÓXè\fõÑ\u0004XpL?Ï³¤ò"
.length();
char var14 = ' ';
int var25 = -1;

label54:
while (true) {
String var27 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var39 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var39;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[56];
g = new HashMap(13);
Cipher var0;
Cipher var29 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var29.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "?ÆÇI\n\u0011ç \u0092¦âÛêL\"¨\u008d\u0017)4²]½½\u00016\r>\u0017\tQ±c ôÒ¿\u001a¸}¹ß\u0002+\u0080Þü\b.u£\n5Æ\u0010×";
int var5 = "?ÆÇI\n\u0011ç \u0092¦âÛêL\"¨\u008d\u0017)4²]½½\u00016\r>\u0017\tQ±c ôÒ¿\u001a¸}¹ß\u0002+\u0080Þü\b.u£\n5Æ\u0010×".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var43 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var46 = -1;

while (true) {
long var8 = var43;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var48 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var46) {
case 0:
var30[var10001] = var48;
if (var2 >= var5) {
e = var6;
f = new Integer[9];
Y = new gw();
Pair[] var22 = new Pair[b<"o">(5509, 4226624292779562577L ^ var20)];
var22[0] = TuplesKt.to(class_2350.field_11036, new class_2338(0, -1, 0));
var22[1] = TuplesKt.to(class_2350.field_11033, new class_2338(0, 1, 0));
var22[2] = TuplesKt.to(class_2350.field_11034, new class_2338(-1, 0, 0));
var22[3] = TuplesKt.to(class_2350.field_11039, new class_2338(1, 0, 0));
var22[4] = TuplesKt.to(class_2350.field_11043, new class_2338(0, 0, 1));
var22[5] = TuplesKt.to(class_2350.field_11035, new class_2338(0, 0, -1));
s = MapsKt.mapOf(var22);
y = new LinkedHashMap();
class_243 var31 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, a<"e">(13230, 7043092131973752410L ^ var20));
B = var31;
return;
}
break;
default:
var30[var10001] = var48;
if (var2 < var5) {
continue label36;
}

var4 = "Qn#>ÈAØg\\Ö_>Hd{À";
var5 = "Qn#>ÈAØg\\Ö_>Hd{À".length();
var2 = 0;
}

byte var37 = var2;
var2 += 8;
var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var43 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var46 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var39;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "¹Íê\\OÊ\u0092Ðè\u001ez%~>Ýu\u0010çÁ-\u0099³\u0092\u0080\u0010]\u0005\t¤ó\u0011ì\u009bÏ\u0086è.\u001f\u0001\u009b¦";
var17 = "¹Íê\\OÊ\u0092Ðè\u001ez%~>Ýu\u0010çÁ-\u0099³\u0092\u0080\u0010]\u0005\t¤ó\u0011ì\u009bÏ\u0086è.\u001f\u0001\u009b¦".length();
var14 = 24;
var25 = -1;
}

var27 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void S(int[] var0) {
W = var0;
}

public static int[] Z() {
return W;
}

private static NoSuchElementException a(NoSuchElementException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24659;
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
throw new RuntimeException("su/catlean/gw", var10);
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
throw new RuntimeException("su/catlean/gw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13935;
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
throw new RuntimeException("su/catlean/gw", var14);
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
throw new RuntimeException("su/catlean/gw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
