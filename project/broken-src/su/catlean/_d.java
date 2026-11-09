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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class _d extends _3 {
static final KProperty[] c;
@NotNull
private final az m;
@NotNull
private final cq n;
private static String W;
private static final long h = yz.a(-8127311394969466936L, 6317689863304216677L, MethodHandles.lookup().lookupClass()).a(182394309137271L);
private static final String[] t;
private static final String[] w;
private static final Map y = new HashMap(13);
private static final long[] B;
private static final Integer[] F;
private static final Map I;

public _d(@NotNull String id, @NotNull fu category, long a) {
a = h ^ a;
long var5 = a ^ 9814060001265L;
long var7 = a ^ 50769434288698L;
long var9 = a ^ 102610374016516L;
long var11 = a ^ 121360109164928L;
Intrinsics.checkNotNullParameter(id, c<"c">(2978, 2402558699367189460L ^ a));
Intrinsics.checkNotNullParameter(category, c<"c">(755, 5743247958583657099L ^ a));
super(id, category, f<"o">(9785, 1270252356590231664L ^ a), var7, true);
jk var10001 = this;
String var10002 = c<"c">(9334, 336354224589399055L ^ a);
class_2248[] var18 = new class_2248[1];
class_2248 var10007 = class_2246.field_10540;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10540, c<"c">(9922, 3792305215497917L ^ a));
var18[0] = var10007;
dg var10003 = new dg(CollectionsKt.mutableListOf(var18), var9);
int var10006 = f<"o">(25850, 8182678803628696241L ^ a);
Object var13 = null;
int var14 = var10006;
Object var15 = null;
Object var16 = null;
dg var17 = var10003;
this.m = yp.y(var10001, var10002, var11, var17, (h)var16, (Function0)var15, var14, var13);
this.n = yp.t(this, c<"c">(24008, 8098755472193854909L ^ a), true, var5, null, null, f<"o">(16568, 4799897242665486069L ^ a), null);
}

private final dg T(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 924903946947L;
return (dg)this.m.E(this, var3, c[0]);
}

private final void A(long var1, dg var3) {
var1 = h ^ var1;
long var4 = var1 ^ 25016170929703L;
this.m.b(this, var4, c[0], var3);
}

public final boolean i(short var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ h;
long var6 = var4 ^ 19904277150562L;
return (Boolean)this.n.E(this, var6, c[1]);
}

public final void J(int a, @Nullable class_1657 target, int a) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/_d.h J
// 011: lxor
// 012: lstore 4
// 014: lload 4
// 016: dup2
// 017: ldc2_w 10288789242914
// 01a: lxor
// 01b: dup2
// 01c: bipush 56
// 01e: lushr
// 01f: l2i
// 020: istore 6
// 022: dup2
// 023: bipush 8
// 025: lshl
// 026: bipush 8
// 028: lushr
// 029: lstore 7
// 02b: pop2
// 02c: dup2
// 02d: ldc2_w 139108154259280
// 030: lxor
// 031: lstore 9
// 033: dup2
// 034: ldc2_w 42947338228081
// 037: lxor
// 038: lstore 11
// 03a: dup2
// 03b: ldc2_w 59362417528083
// 03e: lxor
// 03f: dup2
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 13
// 046: dup2
// 047: bipush 16
// 049: lshl
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 14
// 050: dup2
// 051: bipush 48
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 15
// 05a: pop2
// 05b: dup2
// 05c: ldc2_w 20153143877813
// 05f: lxor
// 060: lstore 16
// 062: dup2
// 063: ldc2_w 116646762923043
// 066: lxor
// 067: lstore 18
// 069: pop2
// 06a: ldc2_w -7573437799353169157
// 06d: lload 4
// 06f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: astore 20
// 076: aload 2
// 077: aload 20
// 079: ifnonnull 0eb
// 07c: lload 18
// 07e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 081: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 084: ifeq 0ea
// 087: goto 095
// 08a: ldc2_w -7566447670845370871
// 08d: lload 4
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: lload 18
// 097: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09a: aload 20
// 09c: ifnonnull 0eb
// 09f: goto 0ad
// 0a2: ldc2_w -7566447670845370871
// 0a5: lload 4
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: invokevirtual net/minecraft/class_746.method_20232 ()Z
// 0b0: ifeq 0ea
// 0b3: goto 0c1
// 0b6: ldc2_w -7566447670845370871
// 0b9: lload 4
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: aload 0
// 0c2: iload 13
// 0c4: i2s
// 0c5: iload 14
// 0c7: iload 15
// 0c9: i2s
// 0ca: invokevirtual su/catlean/_d.i (SIS)Z
// 0cd: ifeq 0ea
// 0d0: goto 0de
// 0d3: ldc2_w -7566447670845370871
// 0d6: lload 4
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: return
// 0df: ldc2_w -7566447670845370871
// 0e2: lload 4
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: aload 2
// 0eb: ifnull 26c
// 0ee: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0f1: ldc 0.5
// 0f3: bipush 1
// 0f4: fconst_0
// 0f5: lload 16
// 0f7: fconst_0
// 0f8: fconst_0
// 0f9: sipush 3313
// 0fc: ldc2_w 2600042368011173076
// 0ff: lload 4
// 101: lxor
// 102: invokedynamic o (IJ)I bsm=su/catlean/_d.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: aconst_null
// 108: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 10b: astore 21
// 10d: aload 2
// 10e: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 111: getfield net/minecraft/class_238.field_1323 D
// 114: dstore 22
// 116: aload 2
// 117: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 11a: getfield net/minecraft/class_238.field_1322 D
// 11d: dstore 24
// 11f: aload 2
// 120: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 123: getfield net/minecraft/class_238.field_1321 D
// 126: dstore 26
// 128: aload 2
// 129: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 12c: getfield net/minecraft/class_238.field_1320 D
// 12f: dstore 28
// 131: aload 2
// 132: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 135: getfield net/minecraft/class_238.field_1325 D
// 138: dstore 30
// 13a: aload 2
// 13b: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 13e: getfield net/minecraft/class_238.field_1324 D
// 141: dstore 32
// 143: aload 2
// 144: aload 20
// 146: ifnonnull 16c
// 149: invokevirtual net/minecraft/class_1657.method_24828 ()Z
// 14c: ifne 186
// 14f: goto 15d
// 152: ldc2_w -7566447670845370871
// 155: lload 4
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: aload 2
// 15e: goto 16c
// 161: ldc2_w -7566447670845370871
// 164: lload 4
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: new net/minecraft/class_238
// 16f: dup
// 170: dload 22
// 172: dload 24
// 174: dload 26
// 176: dload 28
// 178: dload 30
// 17a: ldc 0.5
// 17c: f2d
// 17d: dsub
// 17e: dload 32
// 180: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 183: invokevirtual net/minecraft/class_1657.method_5857 (Lnet/minecraft/class_238;)V
// 186: aload 0
// 187: aload 0
// 188: iload 6
// 18a: i2b
// 18b: lload 7
// 18d: aload 2
// 18e: checkcast net/minecraft/class_1297
// 191: invokevirtual su/catlean/_d.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 194: checkcast net/minecraft/class_2374
// 197: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 19a: dup
// 19b: sipush 17419
// 19e: ldc2_w 3224206725431472665
// 1a1: lload 4
// 1a3: lxor
// 1a4: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_d.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ac: new java/util/LinkedHashSet
// 1af: dup
// 1b0: invokespecial java/util/LinkedHashSet.<init> ()V
// 1b3: checkcast java/util/Set
// 1b6: lload 9
// 1b8: dup2_x1
// 1b9: pop2
// 1ba: invokespecial su/catlean/_d.x (Lnet/minecraft/class_2338;JLjava/util/Set;)Ljava/util/List;
// 1bd: checkcast java/lang/Iterable
// 1c0: invokestatic kotlin/collections/CollectionsKt.toList (Ljava/lang/Iterable;)Ljava/util/List;
// 1c3: astore 34
// 1c5: aload 2
// 1c6: lload 18
// 1c8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1ce: ifeq 1ef
// 1d1: aload 34
// 1d3: checkcast java/lang/Iterable
// 1d6: astore 35
// 1d8: bipush 0
// 1d9: istore 36
// 1db: aload 35
// 1dd: new su/catlean/me
// 1e0: dup
// 1e1: aload 21
// 1e3: invokespecial su/catlean/me.<init> ([D)V
// 1e6: checkcast java/util/Comparator
// 1e9: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 1ec: goto 208
// 1ef: aload 34
// 1f1: checkcast java/lang/Iterable
// 1f4: astore 35
// 1f6: bipush 0
// 1f7: istore 36
// 1f9: aload 35
// 1fb: new su/catlean/t4
// 1fe: dup
// 1ff: invokespecial su/catlean/t4.<init> ()V
// 202: checkcast java/util/Comparator
// 205: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 208: astore 34
// 20a: aload 0
// 20b: checkcast su/catlean/_3
// 20e: aload 34
// 210: bipush 0
// 211: bipush 0
// 212: aconst_null
// 213: bipush 0
// 214: sipush 25323
// 217: ldc2_w 7195294163648844488
// 21a: lload 4
// 21c: lxor
// 21d: invokedynamic o (IJ)I bsm=su/catlean/_d.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: lload 11
// 224: aconst_null
// 225: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 228: iload 3
// 229: ifge 236
// 22c: pop
// 22d: aload 2
// 22e: aload 20
// 230: ifnonnull 256
// 233: invokevirtual net/minecraft/class_1657.method_24828 ()Z
// 236: ifne 26c
// 239: goto 247
// 23c: ldc2_w -7566447670845370871
// 23f: lload 4
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 2
// 248: goto 256
// 24b: ldc2_w -7566447670845370871
// 24e: lload 4
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: new net/minecraft/class_238
// 259: dup
// 25a: dload 22
// 25c: dload 24
// 25e: dload 26
// 260: dload 28
// 262: dload 30
// 264: dload 32
// 266: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 269: invokevirtual net/minecraft/class_1657.method_5857 (Lnet/minecraft/class_238;)V
// 26c: return
}

@Override
protected boolean m(@NotNull class_1297 crystal, long a) {
int var4 = (int)((a ^ 75096564203215L) >>> 56);
long var5 = (a ^ 75096564203215L) << 8 >>> 8;
long var7 = a ^ 124027046021740L;
long var9 = a ^ 42888259370702L;
String var10000 = vm.a<"Å">(3173053555865120790L, a);
Intrinsics.checkNotNullParameter(crystal, c<"c">(3302, 349728123617591312L ^ a));
String var11 = var10000;

try {
float var14;
int var13 = (
var14 = la.K(la.l, this.J((byte)var4, var5, crystal), (class_1657)zf.v(var9), 0, false, null, false, f<"o">(21031, 9017006915881638125L ^ a), null, var7)
+ 4.0F
- (zf.v(var9).method_6032() + zf.v(var9).method_6067())
)
== 0.0F
? 0
: (var14 < 0.0F ? -1 : 1);
if (var11 != null) {
return (boolean)var13;
}

if (var13 < 0) {
return (boolean)1;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 3176127326945981668L, a);
}

return (boolean)0;
}

private final List x(class_2338 param1, long param2, Set param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_d.h J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 54007414211609
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 36680594509210
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 42606727373037
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 53074994687289
// 020: lxor
// 021: lstore 11
// 023: dup2
// 024: ldc2_w 111058848992980
// 027: lxor
// 028: lstore 13
// 02a: dup2
// 02b: ldc2_w 8531404631758
// 02e: lxor
// 02f: lstore 15
// 031: dup2
// 032: ldc2_w 23854136006692
// 035: lxor
// 036: lstore 17
// 038: pop2
// 039: new java/util/ArrayList
// 03c: dup
// 03d: invokespecial java/util/ArrayList.<init> ()V
// 040: checkcast java/util/List
// 043: astore 20
// 045: ldc2_w 5516048296707297426
// 048: lload 2
// 049: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: getstatic su/catlean/ix.e Lkotlin/enums/EnumEntries;
// 051: invokeinterface kotlin/enums/EnumEntries.iterator ()Ljava/util/Iterator; 1
// 056: astore 21
// 058: astore 19
// 05a: aload 21
// 05c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 061: ifeq 34a
// 064: aload 21
// 066: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 06b: checkcast net/minecraft/class_2350
// 06e: astore 22
// 070: aload 1
// 071: aload 22
// 073: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 076: dup
// 077: sipush 16418
// 07a: ldc2_w 7276450404009208926
// 07d: lload 2
// 07e: lxor
// 07f: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_d.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 087: astore 23
// 089: lload 9
// 08b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 08e: aload 23
// 090: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 093: dup
// 094: sipush 568
// 097: ldc2_w 1608914501162872397
// 09a: lload 2
// 09b: lxor
// 09c: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_d.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a4: astore 24
// 0a6: aload 4
// 0a8: aload 23
// 0aa: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 0af: aload 19
// 0b1: ifnonnull 0c9
// 0b4: ifne 11e
// 0b7: aload 24
// 0b9: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0bc: goto 0c9
// 0bf: ldc2_w 5519123063498921056
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 19
// 0cb: ifnonnull 142
// 0ce: ifne 130
// 0d1: goto 0de
// 0d4: ldc2_w 5519123063498921056
// 0d7: lload 2
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 24
// 0e0: lload 9
// 0e2: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0e5: checkcast net/minecraft/class_1922
// 0e8: aload 23
// 0ea: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 0ed: invokevirtual net/minecraft/class_265.method_1110 ()Z
// 0f0: aload 19
// 0f2: lload 2
// 0f3: lconst_0
// 0f4: lcmp
// 0f5: iflt 144
// 0f8: ifnonnull 142
// 0fb: goto 108
// 0fe: ldc2_w 5519123063498921056
// 101: lload 2
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: lload 2
// 109: lconst_0
// 10a: lcmp
// 10b: ifle 139
// 10e: ifne 130
// 111: goto 11e
// 114: ldc2_w 5519123063498921056
// 117: lload 2
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 19
// 120: ifnull 05a
// 123: goto 130
// 126: ldc2_w 5519123063498921056
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: aload 4
// 132: aload 23
// 134: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
// 139: pop
// 13a: aload 0
// 13b: lload 5
// 13d: aload 23
// 13f: invokevirtual su/catlean/_d.m (JLnet/minecraft/class_2338;)Z
// 142: aload 19
// 144: ifnonnull 178
// 147: ifeq 17e
// 14a: goto 157
// 14d: ldc2_w 5519123063498921056
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: aload 20
// 159: aload 0
// 15a: aload 23
// 15c: lload 11
// 15e: aload 4
// 160: invokespecial su/catlean/_d.x (Lnet/minecraft/class_2338;JLjava/util/Set;)Ljava/util/List;
// 163: checkcast java/util/Collection
// 166: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
// 16b: goto 178
// 16e: ldc2_w 5519123063498921056
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: pop
// 179: aload 19
// 17b: ifnull 05a
// 17e: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 181: aload 23
// 183: lload 17
// 185: bipush -1
// 186: aload 0
// 187: lload 15
// 189: invokevirtual su/catlean/_d.w (J)Lsu/catlean/xx;
// 18c: getstatic su/catlean/y4.ONLY_CRYSTALS Lsu/catlean/y4;
// 18f: aload 0
// 190: lload 13
// 192: invokevirtual su/catlean/_d.Y (J)F
// 195: aload 0
// 196: lload 7
// 198: invokevirtual su/catlean/_d.Q (J)F
// 19b: aload 20
// 19d: invokevirtual su/catlean/gw.m (Lnet/minecraft/class_2338;JILsu/catlean/xx;Lsu/catlean/y4;FFLjava/util/List;)Lnet/minecraft/class_3965;
// 1a0: astore 25
// 1a2: aload 19
// 1a4: lload 2
// 1a5: lconst_0
// 1a6: lcmp
// 1a7: iflt 347
// 1aa: ifnonnull 345
// 1ad: aload 25
// 1af: ifnonnull 33b
// 1b2: goto 1bf
// 1b5: ldc2_w 5519123063498921056
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: getstatic su/catlean/ix.e Lkotlin/enums/EnumEntries;
// 1c2: checkcast java/lang/Iterable
// 1c5: astore 27
// 1c7: bipush 0
// 1c8: istore 28
// 1ca: aload 27
// 1cc: astore 29
// 1ce: new java/util/ArrayList
// 1d1: dup
// 1d2: invokespecial java/util/ArrayList.<init> ()V
// 1d5: checkcast java/util/Collection
// 1d8: astore 30
// 1da: bipush 0
// 1db: istore 31
// 1dd: aload 29
// 1df: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1e4: astore 32
// 1e6: aload 32
// 1e8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ed: ifeq 237
// 1f0: aload 32
// 1f2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1f7: astore 33
// 1f9: aload 33
// 1fb: checkcast net/minecraft/class_2350
// 1fe: astore 34
// 200: bipush 0
// 201: istore 35
// 203: aload 34
// 205: aload 19
// 207: ifnonnull 06e
// 20a: lload 2
// 20b: lconst_0
// 20c: lcmp
// 20d: iflt 06b
// 210: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 213: if_acmpeq 224
// 216: bipush 1
// 217: goto 225
// 21a: ldc2_w 5519123063498921056
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: bipush 0
// 225: ifeq 1e6
// 228: aload 30
// 22a: aload 33
// 22c: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 231: pop
// 232: aload 19
// 234: ifnull 1e6
// 237: aload 30
// 239: checkcast java/util/List
// 23c: nop
// 23d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 242: lload 2
// 243: lconst_0
// 244: lcmp
// 245: iflt 1f7
// 248: astore 26
// 24a: aload 26
// 24c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 251: ifeq 05a
// 254: aload 26
// 256: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 25b: checkcast net/minecraft/class_2350
// 25e: astore 27
// 260: aload 23
// 262: aload 27
// 264: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 267: dup
// 268: sipush 24185
// 26b: ldc2_w 3473084346972664324
// 26e: lload 2
// 26f: lxor
// 270: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_d.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 278: astore 28
// 27a: aload 4
// 27c: aload 28
// 27e: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 283: aload 19
// 285: lload 2
// 286: lconst_0
// 287: lcmp
// 288: ifle 0b1
// 28b: ifnonnull 061
// 28e: aload 19
// 290: lload 2
// 291: lconst_0
// 292: lcmp
// 293: ifle 0b1
// 296: lload 2
// 297: lconst_0
// 298: lcmp
// 299: ifle 2be
// 29c: ifnonnull 2bc
// 29f: ifne 24a
// 2a2: goto 2af
// 2a5: ldc2_w 5519123063498921056
// 2a8: lload 2
// 2a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ae: athrow
// 2af: lload 9
// 2b1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2b4: aload 28
// 2b6: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2b9: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 2bc: aload 19
// 2be: ifnonnull 2e0
// 2c1: ifne 2d7
// 2c4: goto 2d1
// 2c7: ldc2_w 5519123063498921056
// 2ca: lload 2
// 2cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d0: athrow
// 2d1: lload 2
// 2d2: lconst_0
// 2d3: lcmp
// 2d4: ifgt 24a
// 2d7: aload 4
// 2d9: aload 28
// 2db: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
// 2e0: pop
// 2e1: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 2e4: aload 28
// 2e6: lload 17
// 2e8: bipush -1
// 2e9: aload 0
// 2ea: lload 15
// 2ec: invokevirtual su/catlean/_d.w (J)Lsu/catlean/xx;
// 2ef: getstatic su/catlean/y4.ONLY_CRYSTALS Lsu/catlean/y4;
// 2f2: aload 0
// 2f3: lload 13
// 2f5: invokevirtual su/catlean/_d.Y (J)F
// 2f8: aload 0
// 2f9: lload 7
// 2fb: invokevirtual su/catlean/_d.Q (J)F
// 2fe: aload 20
// 300: invokevirtual su/catlean/gw.m (Lnet/minecraft/class_2338;JILsu/catlean/xx;Lsu/catlean/y4;FFLjava/util/List;)Lnet/minecraft/class_3965;
// 303: astore 29
// 305: aload 19
// 307: lload 2
// 308: lconst_0
// 309: lcmp
// 30a: iflt 338
// 30d: ifnonnull 336
// 310: aload 29
// 312: ifnull 24a
// 315: goto 322
// 318: ldc2_w 5519123063498921056
// 31b: lload 2
// 31c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: athrow
// 322: aload 20
// 324: aload 28
// 326: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 32b: pop
// 32c: aload 20
// 32e: aload 23
// 330: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 335: pop
// 336: aload 19
// 338: ifnull 05a
// 33b: aload 20
// 33d: aload 23
// 33f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 344: pop
// 345: aload 19
// 347: ifnull 05a
// 34a: aload 20
// 34c: lload 2
// 34d: lconst_0
// 34e: lcmp
// 34f: ifle 06b
// 352: areturn
}

@NotNull
@Override
protected List R(long var1) {
long var3 = var1 ^ 139471251167438L;
return this.T(var3).e();
}

static {
long var20 = h ^ 96205042373378L;
vm.a<"Å">("dqgH3", 4585743270880088197L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[14];
int var16 = 0;
String var15 = "ø¼7HCÆNÂ³\u0006(¶ÔNK¹Á'Y\u0093\u000es`S MYÄ+\u0098oÀïxÊ\u0080Æ(<\u008a\u0087\u0019X¢¾\u001dÍÀ¾÷Ï<ÍFÔµ\u000e\u0018\u0099 \u007f¼î\u008cÜ\u0011t¨5)\u0091K7píg'sØ}Ê\u009b Þ2ò½\"%É\\lñÿ\u009f\u0091G[\u0011 °È_ºJ¸B1WÁ\u00886Â\u0000ê\u0018\u008aàß!Y¨uFÕ£ExBÚûGl>\n\u0080ß\u0002áZ \u0002·\u0012è&\u000bÂv`\u001f?Ô|q~\u009f´\u008cöK\u0087ñKÅH\u0000SÔtõ\u008a\u0090 W\u0082ÑÅSÜ\u0086[ìô¹ñ\u0014¿^\b\u0019ýL¸ÕG\u008bey[\u0012\u00ad\u0085ÄhQ\u0010\u0012Ä=$tà\u009e¤Z[\u001c\u0018\u0094õ6\u008d\u0010¾B\u0013Úð4,~ËÕ*T(\u009eëõ(I\u001eõá½\u0019¤O=óì\u008b¬Ó×Ciz<³£Ä©\u0010ùûÜõÜ2ÐÂ\u0093¸úpÝ~Æw\u0010£p\r×ÜÞÙ*òÍ\f\u0098§\u008c5Ë\u0018¦irÆ'~ì®Ô¦\u0080b×m\u0094èJñÔÑÔª M";
int var17 = "ø¼7HCÆNÂ³\u0006(¶ÔNK¹Á'Y\u0093\u000es`S MYÄ+\u0098oÀïxÊ\u0080Æ(<\u008a\u0087\u0019X¢¾\u001dÍÀ¾÷Ï<ÍFÔµ\u000e\u0018\u0099 \u007f¼î\u008cÜ\u0011t¨5)\u0091K7píg'sØ}Ê\u009b Þ2ò½\"%É\\lñÿ\u009f\u0091G[\u0011 °È_ºJ¸B1WÁ\u00886Â\u0000ê\u0018\u008aàß!Y¨uFÕ£ExBÚûGl>\n\u0080ß\u0002áZ \u0002·\u0012è&\u000bÂv`\u001f?Ô|q~\u009f´\u008cöK\u0087ñKÅH\u0000SÔtõ\u008a\u0090 W\u0082ÑÅSÜ\u0086[ìô¹ñ\u0014¿^\b\u0019ýL¸ÕG\u008bey[\u0012\u00ad\u0085ÄhQ\u0010\u0012Ä=$tà\u009e¤Z[\u001c\u0018\u0094õ6\u008d\u0010¾B\u0013Úð4,~ËÕ*T(\u009eëõ(I\u001eõá½\u0019¤O=óì\u008b¬Ó×Ciz<³£Ä©\u0010ùûÜõÜ2ÐÂ\u0093¸úpÝ~Æw\u0010£p\r×ÜÞÙ*òÍ\f\u0098§\u008c5Ë\u0018¦irÆ'~ì®Ô¦\u0080b×m\u0094èJñÔÑÔª M"
.length();
char var14 = 24;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = c(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
t = var18;
w = new String[14];
I = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "\u0007IBvm)\nxT\u0014;æ¡\u0013)5)o+^ðf\u001aé±Ì°ó5:7í";
int var5 = "\u0007IBvm)\nxT\u0014;æ¡\u0013)5)o+^ðf\u001aé±Ì°ó5:7í".length();
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
B = var6;
F = new Integer[6];
KProperty[] var22 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_d.class, c<"c">(2266, 4214197281517262780L ^ var20), c<"c">(7706, 794424868788584816L ^ var20), 0)
),
Reflection.property1(new PropertyReference1Impl(_d.class, c<"c">(24400, 1084156864402358324L ^ var20), c<"c">(3804, 4674419198276030899L ^ var20), 0))
};
c = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "fûoì_\u001fà½Õîsús»\u009fÕ";
var5 = "fûoì_\u001fà½Õîsús»\u009fÕ".length();
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

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "\u009cà\u0090zË\u000e\u0089=¹\u0087\u0082RD¢\b.Ý\u0086ÇÀ.\u008c\u001f]æx\u0002\u0085t>øÉ~\u008e´Ð\u000b\u008c\u0013¢^bM\u0097æ\u0016¥YBA\u0014,ä¸Y¦/þ\u0081:¹íÈÀ0¿\u0096×\u0007M\bù}òoÏÚA¦@ÂÆ\u001fzÿë¢§\u0016áì9WáñQËj\nh+Î\u008bf\u0098x\u0012`5õÓIo";
var17 = "\u009cà\u0090zË\u000e\u0089=¹\u0087\u0082RD¢\b.Ý\u0086ÇÀ.\u008c\u001f]æx\u0002\u0085t>øÉ~\u008e´Ð\u000b\u008c\u0013¢^bM\u0097æ\u0016¥YBA\u0014,ä¸Y¦/þ\u0081:¹íÈÀ0¿\u0096×\u0007M\bù}òoÏÚA¦@ÂÆ\u001fzÿë¢§\u0016áì9WáñQËj\nh+Î\u008bf\u0098x\u0012`5õÓIo"
.length();
var14 = '@';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void s(String var0) {
W = var0;
}

public static String I() {
return W;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24925;
if (w[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])y.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
y.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_d", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = t[var5].getBytes("ISO-8859-1");
w[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return w[var5];
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
throw new RuntimeException("su/catlean/_d" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26475;
if (F[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = B[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])I.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
I.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_d", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
F[var3] = var15;
}

return F[var3];
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
throw new RuntimeException("su/catlean/_d" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
