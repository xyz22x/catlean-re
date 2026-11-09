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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _e extends _3 {
@NotNull
public static final _e m;
@NotNull
private static final cq S;
@NotNull
private static final cp l;
@NotNull
private static final cq t;
@NotNull
private static final cq B;
@NotNull
private static final cq c;
@NotNull
private static final cq I;
private static final long h = yz.a(-2026720568093427720L, -6173730685574026536L, MethodHandles.lookup().lookupClass()).a(227687632189410L);
private static final String[] i;
private static final String[] n;
private static final Map o = new HashMap(13);
private static final long[] w;
private static final Integer[] y;
private static final Map F;

private _e(long var1) {
var1 = h ^ var1;
long var10001 = var1 ^ 81835466389311L;
int var3 = (int)((var1 ^ 81835466389311L) >>> 48);
int var4 = (int)((var1 ^ 81835466389311L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
super(c<"c">(2514, 5956776669811301940L ^ var1), (short)var3, jt.Q(), 0, false, f<"o">(24693, 7028490798185525128L ^ var1), (short)var4, var5, null);
}

private final boolean V(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ h;
long var6 = var4 ^ 75858240150997L;
return (Boolean)S.E(this, var6, O[0]);
}

private final h i(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 39138518361472L;
return (h)l.E(this, var3, O[1]);
}

private final boolean t(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 23751057622643L;
return (Boolean)t.E(this, var3, O[2]);
}

private final boolean Z(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ h;
long var6 = var4 ^ 5404729176499L;
return (Boolean)B.E(this, var6, O[3]);
}

private final boolean I(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 92843765777005L;
return (Boolean)c.E(this, var3, O[4]);
}

private final boolean L(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ h;
long var6 = var4 ^ 92682178012015L;
return (Boolean)I.E(this, var6, O[5]);
}

@Flow
private final void w(PlayerUpdateEvent var1) {
long var2 = h ^ 31258983154773L;
long var4 = var2 ^ 21167218219485L;
long var6 = var2 ^ 64742074719690L;
_3.p(this, this.T(var4), false, false, var6, null, false, f<"o">(31005, 7860238647737750077L ^ var2), null);
}

private final List T(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_e.h J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 114107649813415
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 16
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 4
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: l2i
// 024: istore 5
// 026: pop2
// 027: dup2
// 028: ldc2_w 89159594397414
// 02b: lxor
// 02c: dup2
// 02d: bipush 56
// 02f: lushr
// 030: l2i
// 031: istore 6
// 033: dup2
// 034: bipush 8
// 036: lshl
// 037: bipush 8
// 039: lushr
// 03a: lstore 7
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 53108891742272
// 041: lxor
// 042: lstore 9
// 044: pop2
// 045: ldc2_w -7099500314585943902
// 048: lload 1
// 049: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: lload 9
// 050: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 053: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 056: dup
// 057: sipush 30211
// 05a: ldc2_w 6601174728179911028
// 05d: lload 1
// 05e: lxor
// 05f: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 067: checkcast java/lang/Iterable
// 06a: astore 12
// 06c: astore 11
// 06e: bipush 0
// 06f: istore 13
// 071: aload 12
// 073: astore 14
// 075: new java/util/ArrayList
// 078: dup
// 079: invokespecial java/util/ArrayList.<init> ()V
// 07c: checkcast java/util/Collection
// 07f: astore 15
// 081: bipush 0
// 082: istore 16
// 084: aload 14
// 086: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 08b: astore 17
// 08d: aload 17
// 08f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 094: ifeq 0fd
// 097: aload 17
// 099: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 09e: astore 18
// 0a0: aload 18
// 0a2: checkcast net/minecraft/class_742
// 0a5: astore 19
// 0a7: bipush 0
// 0a8: istore 20
// 0aa: lload 1
// 0ab: lconst_0
// 0ac: lcmp
// 0ad: iflt 137
// 0b0: getstatic su/catlean/_e.m Lsu/catlean/_e;
// 0b3: aload 19
// 0b5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b8: iload 3
// 0b9: i2c
// 0ba: aload 19
// 0bc: checkcast net/minecraft/class_1657
// 0bf: iload 4
// 0c1: i2s
// 0c2: iload 5
// 0c4: invokespecial su/catlean/_e.z (CLnet/minecraft/class_1657;SI)Z
// 0c7: aload 11
// 0c9: ifnull 135
// 0cc: aload 11
// 0ce: ifnull 0f7
// 0d1: goto 0de
// 0d4: ldc2_w -7165427027745177967
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: ifeq 08d
// 0e1: goto 0ee
// 0e4: ldc2_w -7165427027745177967
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 15
// 0f0: aload 18
// 0f2: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0f7: pop
// 0f8: aload 11
// 0fa: ifnonnull 08d
// 0fd: aload 15
// 0ff: checkcast java/util/List
// 102: nop
// 103: checkcast java/lang/Iterable
// 106: astore 12
// 108: nop
// 109: bipush 0
// 10a: istore 13
// 10c: aload 12
// 10e: astore 14
// 110: new java/util/ArrayList
// 113: dup
// 114: aload 12
// 116: sipush 8848
// 119: ldc2_w 5254454501086021109
// 11c: lload 1
// 11d: lxor
// 11e: invokedynamic o (IJ)I bsm=su/catlean/_e.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 126: invokespecial java/util/ArrayList.<init> (I)V
// 129: checkcast java/util/Collection
// 12c: astore 15
// 12e: lload 1
// 12f: lconst_0
// 130: lcmp
// 131: ifle 137
// 134: bipush 0
// 135: istore 16
// 137: aload 14
// 139: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 13e: astore 17
// 140: aload 17
// 142: invokeinterface java/util/Iterator.hasNext ()Z 1
// 147: ifeq 18f
// 14a: aload 17
// 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 151: astore 18
// 153: aload 15
// 155: aload 18
// 157: checkcast net/minecraft/class_742
// 15a: astore 19
// 15c: aload 11
// 15e: ifnull 197
// 161: astore 21
// 163: bipush 0
// 164: istore 20
// 166: getstatic su/catlean/_e.m Lsu/catlean/_e;
// 169: aload 19
// 16b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 16e: iload 6
// 170: i2b
// 171: lload 7
// 173: aload 19
// 175: checkcast net/minecraft/class_1297
// 178: invokevirtual su/catlean/_e.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 17b: checkcast net/minecraft/class_2374
// 17e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 181: aload 21
// 183: swap
// 184: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 189: pop
// 18a: aload 11
// 18c: ifnonnull 140
// 18f: aload 15
// 191: lload 1
// 192: lconst_0
// 193: lcmp
// 194: ifle 151
// 197: checkcast java/util/List
// 19a: nop
// 19b: areturn
}

@NotNull
@Override
protected List g(long param1) {
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
// 002: ldc2_w 57655682716551
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 129341789484699
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 32
// 020: lshl
// 021: bipush 32
// 023: lushr
// 024: l2i
// 025: istore 7
// 027: pop2
// 028: dup2
// 029: ldc2_w 40697395733575
// 02c: lxor
// 02d: dup2
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 8
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 9
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 10
// 048: pop2
// 049: dup2
// 04a: ldc2_w 129300603557785
// 04d: lxor
// 04e: lstore 11
// 050: pop2
// 051: ldc2_w -8313667855081496252
// 054: lload 1
// 055: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: new java/util/ArrayList
// 05d: dup
// 05e: invokespecial java/util/ArrayList.<init> ()V
// 061: checkcast java/util/List
// 064: astore 14
// 066: astore 13
// 068: aload 0
// 069: iload 5
// 06b: i2c
// 06c: iload 6
// 06e: i2c
// 06f: iload 7
// 071: invokespecial su/catlean/_e.L (CCI)Z
// 074: aload 13
// 076: ifnull 0ba
// 079: ifeq 0b5
// 07c: goto 089
// 07f: ldc2_w -8257029808100216969
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: aload 14
// 08b: getstatic net/minecraft/class_2246.field_16492 Lnet/minecraft/class_2248;
// 08e: invokevirtual net/minecraft/class_2248.method_8389 ()Lnet/minecraft/class_1792;
// 091: dup
// 092: sipush 25595
// 095: ldc2_w 4524708182893399393
// 098: lload 1
// 099: lxor
// 09a: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0a7: pop
// 0a8: goto 0b5
// 0ab: ldc2_w -8257029808100216969
// 0ae: lload 1
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: aload 0
// 0b6: lload 3
// 0b7: invokespecial su/catlean/_e.t (J)Z
// 0ba: aload 13
// 0bc: lload 1
// 0bd: lconst_0
// 0be: lcmp
// 0bf: ifle 10f
// 0c2: ifnull 10d
// 0c5: ifeq 101
// 0c8: goto 0d5
// 0cb: ldc2_w -8257029808100216969
// 0ce: lload 1
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: aload 14
// 0d7: getstatic net/minecraft/class_2246.field_9983 Lnet/minecraft/class_2248;
// 0da: invokevirtual net/minecraft/class_2248.method_8389 ()Lnet/minecraft/class_1792;
// 0dd: dup
// 0de: sipush 18709
// 0e1: ldc2_w 5348684925927171976
// 0e4: lload 1
// 0e5: lxor
// 0e6: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ee: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0f3: pop
// 0f4: goto 101
// 0f7: ldc2_w -8257029808100216969
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 0
// 102: iload 8
// 104: iload 9
// 106: i2s
// 107: iload 10
// 109: i2c
// 10a: invokespecial su/catlean/_e.Z (ISC)Z
// 10d: aload 13
// 10f: lload 1
// 110: lconst_0
// 111: lcmp
// 112: ifle 15c
// 115: ifnull 15a
// 118: ifeq 154
// 11b: goto 128
// 11e: ldc2_w -8257029808100216969
// 121: lload 1
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 14
// 12a: getstatic net/minecraft/class_2246.field_10597 Lnet/minecraft/class_2248;
// 12d: invokevirtual net/minecraft/class_2248.method_8389 ()Lnet/minecraft/class_1792;
// 130: dup
// 131: sipush 18709
// 134: ldc2_w 5348684925927171976
// 137: lload 1
// 138: lxor
// 139: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 141: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 146: pop
// 147: goto 154
// 14a: ldc2_w -8257029808100216969
// 14d: lload 1
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: aload 0
// 155: lload 11
// 157: invokespecial su/catlean/_e.I (J)Z
// 15a: aload 13
// 15c: ifnull 197
// 15f: ifeq 198
// 162: goto 16f
// 165: ldc2_w -8257029808100216969
// 168: lload 1
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 14
// 171: getstatic net/minecraft/class_1802.field_8143 Lnet/minecraft/class_1792;
// 174: dup
// 175: sipush 15783
// 178: ldc2_w 2685158716690813742
// 17b: lload 1
// 17c: lxor
// 17d: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 185: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 18a: goto 197
// 18d: ldc2_w -8257029808100216969
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: pop
// 198: aload 14
// 19a: lload 1
// 19b: lconst_0
// 19c: lcmp
// 19d: ifle 1b2
// 1a0: aload 13
// 1a2: ifnonnull 1bf
// 1a5: bipush 1
// 1a6: anewarray 376
// 1a9: ldc2_w -8265846839099357324
// 1ac: lload 1
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: goto 1bf
// 1b5: ldc2_w -8257029808100216969
// 1b8: lload 1
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: areturn
}

private final boolean z(char param1, class_1657 param2, short param3, int param4) {
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
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/_e.h J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 54846511247583
// 024: lxor
// 025: dup2
// 026: bipush 56
// 028: lushr
// 029: l2i
// 02a: istore 7
// 02c: dup2
// 02d: bipush 8
// 02f: lshl
// 030: bipush 8
// 032: lushr
// 033: lstore 8
// 035: pop2
// 036: dup2
// 037: ldc2_w 68938879946875
// 03a: lxor
// 03b: dup2
// 03c: bipush 16
// 03e: lushr
// 03f: lstore 10
// 041: dup2
// 042: bipush 48
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 12
// 04b: pop2
// 04c: dup2
// 04d: ldc2_w 33458309722090
// 050: lxor
// 051: lstore 13
// 053: dup2
// 054: ldc2_w 88766362570361
// 057: lxor
// 058: lstore 15
// 05a: dup2
// 05b: ldc2_w 21415888003136
// 05e: lxor
// 05f: lstore 17
// 061: dup2
// 062: ldc2_w 119670882281470
// 065: lxor
// 066: dup2
// 067: bipush 32
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: dup2
// 06e: bipush 32
// 070: lshl
// 071: bipush 48
// 073: lushr
// 074: l2i
// 075: istore 20
// 077: dup2
// 078: bipush 48
// 07a: lshl
// 07b: bipush 48
// 07d: lushr
// 07e: l2i
// 07f: istore 21
// 081: pop2
// 082: dup2
// 083: ldc2_w 92274783907452
// 086: lxor
// 087: lstore 22
// 089: dup2
// 08a: ldc2_w 90900997828830
// 08d: lxor
// 08e: lstore 24
// 090: pop2
// 091: ldc2_w -6683092383414448485
// 094: lload 5
// 096: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: astore 26
// 09d: aload 2
// 09e: invokevirtual net/minecraft/class_1657.method_5805 ()Z
// 0a1: aload 26
// 0a3: ifnull 13b
// 0a6: ifeq 13a
// 0a9: goto 0b7
// 0ac: ldc2_w -6722138235257896792
// 0af: lload 5
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: lload 24
// 0b9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bc: aload 2
// 0bd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c0: aload 26
// 0c2: ifnull 13b
// 0c5: goto 0d3
// 0c8: ldc2_w -6722138235257896792
// 0cb: lload 5
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: ifne 13a
// 0d6: goto 0e4
// 0d9: ldc2_w -6722138235257896792
// 0dc: lload 5
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: aload 2
// 0e5: invokevirtual net/minecraft/class_1657.method_5681 ()Z
// 0e8: aload 26
// 0ea: ifnull 13b
// 0ed: goto 0fb
// 0f0: ldc2_w -6722138235257896792
// 0f3: lload 5
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: ifne 13a
// 0fe: goto 10c
// 101: ldc2_w -6722138235257896792
// 104: lload 5
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 2
// 10d: lload 22
// 10f: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 112: aload 26
// 114: iload 3
// 115: ifle 15c
// 118: ifnull 15a
// 11b: goto 129
// 11e: ldc2_w -6722138235257896792
// 121: lload 5
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: ifeq 13c
// 12c: goto 13a
// 12f: ldc2_w -6722138235257896792
// 132: lload 5
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: bipush 0
// 13b: ireturn
// 13c: lload 15
// 13e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 141: aload 2
// 142: checkcast net/minecraft/class_1297
// 145: aload 2
// 146: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 149: dconst_0
// 14a: ldc2_w 0.1
// 14d: dconst_0
// 14e: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 151: dconst_1
// 152: dconst_0
// 153: dconst_1
// 154: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 157: invokevirtual net/minecraft/class_638.method_52569 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Z
// 15a: aload 26
// 15c: ifnull 1b9
// 15f: ifne 1aa
// 162: goto 170
// 165: ldc2_w -6722138235257896792
// 168: lload 5
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 173: lload 10
// 175: iload 12
// 177: i2s
// 178: aload 2
// 179: invokevirtual su/catlean/bi.Q (JSLnet/minecraft/class_1657;)Ljava/util/List;
// 17c: invokeinterface java/util/List.size ()I 1
// 181: aload 26
// 183: iload 3
// 184: ifle 1e6
// 187: ifnull 1e4
// 18a: goto 198
// 18d: ldc2_w -6722138235257896792
// 190: lload 5
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: bipush 1
// 199: if_icmple 1ba
// 19c: goto 1aa
// 19f: ldc2_w -6722138235257896792
// 1a2: lload 5
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: bipush 0
// 1ab: goto 1b9
// 1ae: ldc2_w -6722138235257896792
// 1b1: lload 5
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: ireturn
// 1ba: aload 0
// 1bb: new net/minecraft/class_238
// 1be: dup
// 1bf: aload 0
// 1c0: iload 7
// 1c2: i2b
// 1c3: lload 8
// 1c5: aload 2
// 1c6: checkcast net/minecraft/class_1297
// 1c9: invokevirtual su/catlean/_e.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1cc: dconst_0
// 1cd: ldc2_w 0.3
// 1d0: dconst_0
// 1d1: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1d4: checkcast net/minecraft/class_2374
// 1d7: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 1da: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 1dd: lload 13
// 1df: dup2_x1
// 1e0: pop2
// 1e1: invokespecial su/catlean/_e.a (JLnet/minecraft/class_238;)Z
// 1e4: aload 26
// 1e6: iload 4
// 1e8: ifge 219
// 1eb: ifnull 217
// 1ee: ifeq 20c
// 1f1: goto 1ff
// 1f4: ldc2_w -6722138235257896792
// 1f7: lload 5
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: bipush 0
// 200: ireturn
// 201: ldc2_w -6722138235257896792
// 204: lload 5
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: aload 0
// 20d: iload 19
// 20f: iload 20
// 211: i2c
// 212: iload 21
// 214: invokespecial su/catlean/_e.V (ICI)Z
// 217: aload 26
// 219: ifnull 27c
// 21c: ifne 266
// 21f: goto 22d
// 222: ldc2_w -6722138235257896792
// 225: lload 5
// 227: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: athrow
// 22d: aload 2
// 22e: invokevirtual net/minecraft/class_1657.method_20448 ()Z
// 231: aload 26
// 233: iload 1
// 234: iflt 27e
// 237: ifnull 27c
// 23a: goto 248
// 23d: ldc2_w -6722138235257896792
// 240: lload 5
// 242: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: athrow
// 248: ifeq 266
// 24b: goto 259
// 24e: ldc2_w -6722138235257896792
// 251: lload 5
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: bipush 0
// 25a: ireturn
// 25b: ldc2_w -6722138235257896792
// 25e: lload 5
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: lload 24
// 268: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 26b: aload 2
// 26c: checkcast net/minecraft/class_1297
// 26f: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 272: aload 0
// 273: lload 17
// 275: invokevirtual su/catlean/_e.Y (J)F
// 278: ldc 3.0
// 27a: fadd
// 27b: fcmpg
// 27c: aload 26
// 27e: ifnull 293
// 281: ifgt 296
// 284: goto 292
// 287: ldc2_w -6722138235257896792
// 28a: lload 5
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: bipush 1
// 293: goto 297
// 296: bipush 0
// 297: ireturn
}

private final boolean a(long param1, class_238 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_e.h J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 81246820824077
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 1816353343150241007
// 012: lload 1
// 013: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: lload 4
// 01a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 01d: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 020: dup
// 021: sipush 9284
// 024: ldc2_w 7003779985717190501
// 027: lload 1
// 028: lxor
// 029: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_e.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 031: astore 7
// 033: astore 6
// 035: bipush 0
// 036: istore 8
// 038: aload 7
// 03a: astore 9
// 03c: new java/util/ArrayList
// 03f: dup
// 040: invokespecial java/util/ArrayList.<init> ()V
// 043: checkcast java/util/Collection
// 046: astore 10
// 048: bipush 0
// 049: istore 11
// 04b: aload 9
// 04d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 052: astore 12
// 054: aload 12
// 056: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05b: ifeq 0a8
// 05e: aload 12
// 060: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 065: astore 13
// 067: aload 13
// 069: instanceof net/minecraft/class_1533
// 06c: lload 1
// 06d: lconst_0
// 06e: lcmp
// 06f: ifle 0da
// 072: aload 6
// 074: ifnull 0da
// 077: aload 6
// 079: ifnull 0a2
// 07c: goto 089
// 07f: ldc2_w 1784045288362048220
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: ifeq 054
// 08c: goto 099
// 08f: ldc2_w 1784045288362048220
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 10
// 09b: aload 13
// 09d: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0a2: pop
// 0a3: aload 6
// 0a5: ifnonnull 054
// 0a8: aload 10
// 0aa: checkcast java/util/List
// 0ad: nop
// 0ae: checkcast java/lang/Iterable
// 0b1: astore 7
// 0b3: nop
// 0b4: bipush 0
// 0b5: lload 1
// 0b6: lconst_0
// 0b7: lcmp
// 0b8: ifle 0cd
// 0bb: istore 8
// 0bd: aload 7
// 0bf: lload 1
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: ifle 065
// 0c5: aload 6
// 0c7: ifnull 119
// 0ca: instanceof java/util/Collection
// 0cd: goto 0da
// 0d0: ldc2_w 1784045288362048220
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: ifeq 117
// 0dd: aload 7
// 0df: checkcast java/util/Collection
// 0e2: aload 6
// 0e4: ifnull 119
// 0e7: goto 0f4
// 0ea: ldc2_w 1784045288362048220
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0f9: ifeq 117
// 0fc: goto 109
// 0ff: ldc2_w 1784045288362048220
// 102: lload 1
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: goto 159
// 10d: ldc2_w 1784045288362048220
// 110: lload 1
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: aload 7
// 119: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 11e: astore 9
// 120: aload 9
// 122: invokeinterface java/util/Iterator.hasNext ()Z 1
// 127: ifeq 158
// 12a: aload 9
// 12c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 131: astore 10
// 133: aload 10
// 135: checkcast net/minecraft/class_1533
// 138: astore 11
// 13a: bipush 0
// 13b: istore 12
// 13d: aload 11
// 13f: invokevirtual net/minecraft/class_1533.method_5829 ()Lnet/minecraft/class_238;
// 142: aload 3
// 143: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 146: ifeq 120
// 149: bipush 1
// 14a: lload 1
// 14b: lconst_0
// 14c: lcmp
// 14d: ifle 146
// 150: aload 6
// 152: ifnull 146
// 155: goto 159
// 158: bipush 0
// 159: ireturn
}

@NotNull
@Override
protected y4 s() {
return y4.NONE;
}

static {
long var20 = h ^ 8213585110959L;
long var22 = var20 ^ 64523397575907L;
long var10001 = var20 ^ 66234667278801L;
int var24 = (int)((var20 ^ 66234667278801L) >>> 48);
int var25 = (int)((var20 ^ 66234667278801L) << 16 >>> 32);
int var26 = (int)(var10001 << 48 >>> 48);
long var27 = var20 ^ 110089747598891L;
long var29 = var20 ^ 121156672950974L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[24];
int var16 = 0;
String var15 = "êÞ*\\\u0090%Y\u0080g\u009fyw.!¼Pª¤kS\u0087\u00ad\u0014\u008a\u0018\u008b4æ#i9\b-ÞD+¥\u0015r\u0097\u0098é¸*PÌ¸ºh \u0011\u0099sC\u0010°çt`°N9Gú\u0017[\u0012\u008f\u0013\u0083ê/éü*t*\u0085\u001bN»r \f+\u0011¸úõ\u009eÓ+)óAÉÌTJe\u0097w`\u0092fÁi&wÈ¼\r\u007f4ß\u00101¿M\u0015\b\u0004ºÂh´JÃÓ\u007fÚ\u0088 \u009cÃu\b\"a¯»x»æ\u001bW\u0010}h Ï+\u0086\u001b>ÀLÌ\u001e$±r¤s\u008b ¥!Q>\rõý:\u0003\u0006\u0086:\u009cù¸O\u0004¤4à+\u0097ð»°Ã?òñ\u001f\u0012k\u0010\u0087ª\u0016¯\u008ciy\u0086\n*é\\\u0017\u008b'\u0099\u0010%Èù±\u008cOµ\u0019Ì¿ìPGö\u0012ú òÁ8\u0005øûÀ\u00ad\u00868qÎ»\u0000Ôª¸4ÒÚ»\u0005Î)¸ÈI0Ë\u0084Cµ\u0010ð\u000e1ÍL\u0080CWÀj}ú^\n¤B(\"7\u009f¨\u0011\r&\u0097@ç\u0000¯çûÓ¸^+\u008d½\u0002Mò,V\u001fûi\u0019Ígå\u008aÂ¥\u008fiM®\u0098\u0010ÈÀ^\u009c\u0015\u0011»¦Ú\u0013å(\u008e\rÀÑ\u0018ÝX\u000eÖÔ{\u0005ÖEþ\"Â¨~o\u0017>õU\u000f6P\u001a\u009d8üTKÜ\u0082qý\u0087hÊô\f\u0096©$rWó¾\u009b©\u0018%#È9:T\u0017O4Ø§\b\b\u0099*i]\u0091Ë\u009d³òÀI\u008a\"FÕ5ñ4èZA Ùª$.®Ë þö=÷û7±>1Ìv\u001f\u009f\u0015w¿~Tqè\u008dëD\u008b\f\u0018\u0095tüìZ7÷#»ùEb\u0012`½júM~¶eÌÒó\u0010èµ®¸]6Ï\u0007aåÅ+ÎÄ\u0097ù\u0010Uo \u0086 \t\u009b\u0084®\u0084%\u0081õB@,\u0010ÝÍ0AB¦p±ãA\u001f\u0081t\u009a\u0019m(c\u0014U \u001fW:\u0007»«É\u0094Þ Í±\u008b]0¢<J\u0098T\\f\u001bD\u0096ô\u008e\"ù2\u0006\u0010³\rW\u00ad >\u00914Uw\tµ;\u00adØT-\u009fÊe<\u001e\u0083è\u0093T\u0006\u00107/ÙÅß©ÝÅ\u009f";
int var17 = "êÞ*\\\u0090%Y\u0080g\u009fyw.!¼Pª¤kS\u0087\u00ad\u0014\u008a\u0018\u008b4æ#i9\b-ÞD+¥\u0015r\u0097\u0098é¸*PÌ¸ºh \u0011\u0099sC\u0010°çt`°N9Gú\u0017[\u0012\u008f\u0013\u0083ê/éü*t*\u0085\u001bN»r \f+\u0011¸úõ\u009eÓ+)óAÉÌTJe\u0097w`\u0092fÁi&wÈ¼\r\u007f4ß\u00101¿M\u0015\b\u0004ºÂh´JÃÓ\u007fÚ\u0088 \u009cÃu\b\"a¯»x»æ\u001bW\u0010}h Ï+\u0086\u001b>ÀLÌ\u001e$±r¤s\u008b ¥!Q>\rõý:\u0003\u0006\u0086:\u009cù¸O\u0004¤4à+\u0097ð»°Ã?òñ\u001f\u0012k\u0010\u0087ª\u0016¯\u008ciy\u0086\n*é\\\u0017\u008b'\u0099\u0010%Èù±\u008cOµ\u0019Ì¿ìPGö\u0012ú òÁ8\u0005øûÀ\u00ad\u00868qÎ»\u0000Ôª¸4ÒÚ»\u0005Î)¸ÈI0Ë\u0084Cµ\u0010ð\u000e1ÍL\u0080CWÀj}ú^\n¤B(\"7\u009f¨\u0011\r&\u0097@ç\u0000¯çûÓ¸^+\u008d½\u0002Mò,V\u001fûi\u0019Ígå\u008aÂ¥\u008fiM®\u0098\u0010ÈÀ^\u009c\u0015\u0011»¦Ú\u0013å(\u008e\rÀÑ\u0018ÝX\u000eÖÔ{\u0005ÖEþ\"Â¨~o\u0017>õU\u000f6P\u001a\u009d8üTKÜ\u0082qý\u0087hÊô\f\u0096©$rWó¾\u009b©\u0018%#È9:T\u0017O4Ø§\b\b\u0099*i]\u0091Ë\u009d³òÀI\u008a\"FÕ5ñ4èZA Ùª$.®Ë þö=÷û7±>1Ìv\u001f\u009f\u0015w¿~Tqè\u008dëD\u008b\f\u0018\u0095tüìZ7÷#»ùEb\u0012`½júM~¶eÌÒó\u0010èµ®¸]6Ï\u0007aåÅ+ÎÄ\u0097ù\u0010Uo \u0086 \t\u009b\u0084®\u0084%\u0081õB@,\u0010ÝÍ0AB¦p±ãA\u001f\u0081t\u009a\u0019m(c\u0014U \u001fW:\u0007»«É\u0094Þ Í±\u008b]0¢<J\u0098T\\f\u001bD\u0096ô\u008e\"ù2\u0006\u0010³\rW\u00ad >\u00914Uw\tµ;\u00adØT-\u009fÊe<\u001e\u0083è\u0093T\u0006\u00107/ÙÅß©ÝÅ\u009f"
.length();
char var14 = 24;
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
byte var39 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var47 = c(var19).intern();
switch (var39) {
case 0:
var18[var16++] = var47;
if ((var34 += var14) >= var17) {
i = var18;
n = new String[24];
F = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "\u0096g ÎÂqâ\u0086ÿ·?Ó´\u009a\u0006ôqEIÄ°ss\u001c\u0004$Ñ× ²«\u008fç\u0085>´¿Ý\u000ea";
int var5 = "\u0096g ÎÂqâ\u0086ÿ·?Ó´\u009a\u0006ôqEIÄ°ss\u001c\u0004$Ñ× ²«\u008fç\u0085>´¿Ý\u000ea".length();
byte var2 = 0;

label36:
while (true) {
byte var43 = var2;
var2 += 8;
byte[] var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
int var44 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var54 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var56 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var54) {
case 0:
var38[var44] = var56;
if (var2 >= var5) {
w = var6;
y = new Integer[7];
KProperty[] var31 = new KProperty[f<"o">(7213, 9086406400932353269L ^ var20)];
var31[0] = Reflection.property1(
new PropertyReference1Impl(_e.class, c<"c">(5274, 2656449233022190683L ^ var20), c<"c">(21865, 7052308183333127614L ^ var20), 0)
);
var31[1] = Reflection.property1(new PropertyReference1Impl(_e.class, c<"c">(23904, 993456349965503915L ^ var20), c<"c">(4547, 1692252575922159886L ^ var20), 0));
var31[2] = Reflection.property1(
new PropertyReference1Impl(_e.class, c<"c">(13486, 7552511120879166567L ^ var20), c<"c">(22851, 1474361130884483456L ^ var20), 0)
);
var31[3] = Reflection.property1(
new PropertyReference1Impl(_e.class, c<"c">(17090, 5474987559614435859L ^ var20), c<"c">(12375, 6641862423615545499L ^ var20), 0)
);
var31[4] = Reflection.property1(
new PropertyReference1Impl(_e.class, c<"c">(14211, 8809087272346888017L ^ var20), c<"c">(14137, 1416950526296532970L ^ var20), 0)
);
var31[5] = Reflection.property1(new PropertyReference1Impl(_e.class, c<"c">(15328, 6438281603377277728L ^ var20), c<"c">(3265, 789236750300093449L ^ var20), 0));
O = var31;
m = new _e(var29);
S = yp.t(m, c<"c">(10736, 3577302953311582500L ^ var20), false, var22, null, null, f<"o">(25467, 3927221321285790624L ^ var20), null);
l = yp.B(m, c<"c">(7422, 6801288927707073582L ^ var20), (short)var24, w7.BOOLS, null, 4, var25, null, (char)var26);
t = yp.t(m, c<"c">(21652, 7764719635400803419L ^ var20), true, var22, m.i(var27), null, f<"o">(22564, 2973870927071662333L ^ var20), null);
B = yp.t(m, c<"c">(23162, 1516260896871434942L ^ var20), true, var22, m.i(var27), null, f<"o">(27380, 4901451538835497514L ^ var20), null);
c = yp.t(m, c<"c">(25393, 592948167392556022L ^ var20), true, var22, m.i(var27), null, f<"o">(27380, 4901451538835497514L ^ var20), null);
I = yp.t(m, c<"c">(22869, 868313042967415199L ^ var20), true, var22, m.i(var27), null, f<"o">(27380, 4901451538835497514L ^ var20), null);
return;
}
break;
default:
var38[var44] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "\t¸\u008eÍ\u0092\u0085«!ïÆÇº5è¸Þ";
var5 = "\t¸\u008eÍ\u0092\u0085«!ïÆÇº5è¸Þ".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var38 = var6;
var44 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var54 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var47;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "\u0085¾!\u0012ñ\u001eð\u001c%N\u001c§\u001dÀ\u001dzÌù\u00823sA¸ý\u0003\u0091®çql\u0087Þx9úôÜ¦5³\u0013Æ|\u0007%\\½\u009f\u0087G\u00030×¶æ\u0096 ?&ûA\u009f\u0096ÖPëÓ\u0013bV7D\u0015U¼ì\u0088û1ÀWÃO\u009døvµÑ+";
var17 = "\u0085¾!\u0012ñ\u001eð\u001c%N\u001c§\u001dÀ\u001dzÌù\u00823sA¸ý\u0003\u0091®çql\u0087Þx9úôÜ¦5³\u0013Æ|\u0007%\\½\u009f\u0087G\u00030×¶æ\u0096 ?&ûA\u009f\u0096ÖPëÓ\u0013bV7D\u0015U¼ì\u0088û1ÀWÃO\u009døvµÑ+"
.length();
var14 = '8';
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
var39 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25330;
if (n[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])o.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_e", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = i[var5].getBytes("ISO-8859-1");
n[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return n[var5];
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
throw new RuntimeException("su/catlean/_e" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31465;
if (y[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = w[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])F.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
F.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_e", var14);
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
throw new RuntimeException("su/catlean/_e" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
