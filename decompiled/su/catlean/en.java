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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1820;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class en extends _g {
@NotNull
public static final en b;
static final KProperty[] Y;
@NotNull
private static final cw n;
@NotNull
private static final c8 J;
@NotNull
private static final i9 C;
private static final long a = yz.a(1345393246632750891L, 5283128540758722505L, MethodHandles.lookup().lookupClass()).a(281128856108139L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

private en(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 36390075280474L;
super(b<"m">(21502, 5252121623768221336L ^ var4), jt.y(), null, 4, null, var6);
}

private final f9 Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 74490798597762L;
return (f9)n.E(this, var3, Y[0]);
}

private final void W(int var1, f9 var2, int var3, int var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 20763574947518L;
n.b(this, var7, Y[0], var2);
}

private final int G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 129505874635275L;
return ((Number)J.E(this, var3, Y[1])).intValue();
}

private final void Q(long var1, int var3) {
var1 = a ^ var1;
long var4 = var1 ^ 53545212052951L;
J.b(this, var4, Y[1], var3);
}

@Flow
private final void l(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/en.a J
// 003: ldc2_w 8987611351591
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 12453594456225
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 67228152327208
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 96577799808444
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 9787106578317
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 72349546455910
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 39762082978498
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 33977556382455
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 57315273857936
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 42051403637861
// 045: lxor
// 046: lstore 20
// 048: pop2
// 049: ldc2_w 3925890599060340068
// 04c: lload 2
// 04d: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: astore 22
// 054: getstatic su/catlean/en.C Lsu/catlean/i9;
// 057: aload 0
// 058: lload 6
// 05a: invokespecial su/catlean/en.G (J)I
// 05d: lload 16
// 05f: invokevirtual su/catlean/i9.e (IJ)Z
// 062: ifeq 268
// 065: lload 14
// 067: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 06a: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 06d: dup
// 06e: sipush 899
// 071: ldc2_w 6991763759766625635
// 074: lload 2
// 075: lxor
// 076: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/en.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 07e: astore 24
// 080: nop
// 081: bipush 0
// 082: istore 25
// 084: aload 24
// 086: astore 26
// 088: new java/util/ArrayList
// 08b: dup
// 08c: invokespecial java/util/ArrayList.<init> ()V
// 08f: checkcast java/util/Collection
// 092: astore 27
// 094: bipush 0
// 095: istore 28
// 097: aload 26
// 099: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 09e: astore 29
// 0a0: aload 29
// 0a2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0a7: ifeq 192
// 0aa: aload 29
// 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0b1: astore 30
// 0b3: aload 30
// 0b5: checkcast net/minecraft/class_1297
// 0b8: astore 31
// 0ba: bipush 0
// 0bb: istore 32
// 0bd: aload 31
// 0bf: instanceof net/minecraft/class_1472
// 0c2: aload 22
// 0c4: ifnonnull 19f
// 0c7: aload 22
// 0c9: ifnonnull 0fe
// 0cc: goto 0d9
// 0cf: ldc2_w 3942593114099095473
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: ifeq 17f
// 0dc: goto 0e9
// 0df: ldc2_w 3942593114099095473
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 31
// 0eb: checkcast net/minecraft/class_1472
// 0ee: invokevirtual net/minecraft/class_1472.method_6629 ()Z
// 0f1: goto 0fe
// 0f4: ldc2_w 3942593114099095473
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 22
// 100: ifnonnull 128
// 103: ifne 17f
// 106: goto 113
// 109: ldc2_w 3942593114099095473
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: aload 31
// 115: checkcast net/minecraft/class_1472
// 118: invokevirtual net/minecraft/class_1472.method_6109 ()Z
// 11b: goto 128
// 11e: ldc2_w 3942593114099095473
// 121: lload 2
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 22
// 12a: ifnonnull 166
// 12d: ifne 17f
// 130: goto 13d
// 133: ldc2_w 3942593114099095473
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: lload 20
// 13f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 142: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 145: aload 31
// 147: checkcast net/minecraft/class_1472
// 14a: invokevirtual net/minecraft/class_1472.method_33571 ()Lnet/minecraft/class_243;
// 14d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 150: lload 20
// 152: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 155: invokevirtual net/minecraft/class_746.method_55755 ()D
// 158: dcmpg
// 159: goto 166
// 15c: ldc2_w 3942593114099095473
// 15f: lload 2
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: aload 22
// 168: ifnonnull 17c
// 16b: ifge 17f
// 16e: goto 17b
// 171: ldc2_w 3942593114099095473
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: bipush 1
// 17c: goto 180
// 17f: bipush 0
// 180: ifeq 0a0
// 183: aload 27
// 185: aload 30
// 187: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 18c: pop
// 18d: aload 22
// 18f: ifnull 0a0
// 192: aload 27
// 194: checkcast java/util/List
// 197: nop
// 198: checkcast java/lang/Iterable
// 19b: astore 24
// 19d: nop
// 19e: bipush 0
// 19f: istore 25
// 1a1: aload 24
// 1a3: new su/catlean/gd
// 1a6: dup
// 1a7: invokespecial su/catlean/gd.<init> ()V
// 1aa: checkcast java/util/Comparator
// 1ad: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 1b0: astore 23
// 1b2: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1b5: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/en.V (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 1ba: lload 18
// 1bc: dup2_x1
// 1bd: pop2
// 1be: aload 0
// 1bf: lload 4
// 1c1: invokespecial su/catlean/en.Y (J)Lsu/catlean/f9;
// 1c4: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 1c7: astore 24
// 1c9: aload 23
// 1cb: invokeinterface java/util/List.isEmpty ()Z 1
// 1d0: aload 22
// 1d2: ifnonnull 209
// 1d5: ifne 20c
// 1d8: goto 1e5
// 1db: ldc2_w 3942593114099095473
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: aload 24
// 1e7: aload 22
// 1e9: ifnonnull 223
// 1ec: goto 1f9
// 1ef: ldc2_w 3942593114099095473
// 1f2: lload 2
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: invokevirtual su/catlean/fg.R ()Z
// 1fc: goto 209
// 1ff: ldc2_w 3942593114099095473
// 202: lload 2
// 203: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 208: athrow
// 209: ifne 20d
// 20c: return
// 20d: aload 23
// 20f: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 212: dup
// 213: sipush 9843
// 216: ldc2_w 5585344545031780498
// 219: lload 2
// 21a: lxor
// 21b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/en.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 223: checkcast net/minecraft/class_1297
// 226: astore 25
// 228: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 22b: new su/catlean/tu
// 22e: dup
// 22f: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 232: aload 25
// 234: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 237: dup
// 238: sipush 27589
// 23b: ldc2_w 4224543400667591974
// 23e: lload 2
// 23f: lxor
// 240: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/en.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 248: lload 12
// 24a: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 24d: lload 8
// 24f: bipush 0
// 250: aload 24
// 252: aload 25
// 254: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_1297;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/en.c (Lsu/catlean/fg;Lnet/minecraft/class_1297;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 259: bipush 2
// 25a: aconst_null
// 25b: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 25e: checkcast su/catlean/t5
// 261: lload 10
// 263: dup2_x1
// 264: pop2
// 265: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 268: return
}

private static final boolean V(class_1799 var0) {
long var1 = a ^ 72141649912418L;
Intrinsics.checkNotNullParameter(var0, b<"m">(14109, 5582633122024227258L ^ var1));
return var0.method_7909() instanceof class_1820;
}

private static final Unit y(class_1297 var0) {
long var1 = a ^ 95384456230999L;
int var3 = (int)((var1 ^ 111391864170266L) >>> 32);
long var4 = (var1 ^ 111391864170266L) << 32 >>> 32;
long var6 = var1 ^ 132843895870997L;
zf.Z(var3, var4).method_2905((class_1657)zf.v(var6), var0, class_1268.field_5808);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

private static final Unit c(fg var0, class_1297 var1) {
long var2 = a ^ 107470676002223L;
long var4 = var2 ^ 108583014674217L;
long var6 = var2 ^ 62961266000907L;
gg.P.T(var6, var0.a(), b.Y(var4), en::y);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 29437419988048L;
long var22 = var20 ^ 36694312030073L;
long var24 = var20 ^ 31758900204233L;
int var26 = (int)((var20 ^ 29584309672147L) >>> 56);
long var27 = (var20 ^ 29584309672147L) << 8 >>> 8;
long var29 = var20 ^ 125586460812571L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "U\u0083®\u0004\u0011DÉ\u0011Á=¢D¬\u000bw\u0013u\u0089FS;\u000fYúQC\u0099\u0011\u008aX=î\u0018òÏ?È~Ô&ºÝ4w\u009aB¿«\u0010ÿ\u009dfÓ\u001a÷o\u0010\u0081\\H\u0088È³Ö9\"\u008c^ê+c©¯ cI!i\u0088\u001b\u0088\u0097û\u0080û¥EÍ\u0080fzta3ª\u001eñÝk`ÊÀM©ÝS\u0010wôu.úqb®\u009bQÑ\u0014\r½ýþ\u0010áí¹#Z\u0083Y\u009cç\u0098Uu\u0092¯á\u0092(!QP\u0083Ø±\u009fÅæ»ôHw\u0081;\u0017ù=¢Í\u009cÇTgjøDû±§Ôð\t|\u009d\u0011ðO_y8v.Â!íE\u0095»¯*ù\u0002\u0007À Co\u0086WKã³ús\u008e\u0018\u0083\u00ad¿«v3¼\u0019i°\u0005Z\u0003õ\u001cø+ÔÎU\u0087_\u0098[ DÉYç[\u0018ôô³\tGûîF\tB\u0083\u0005[æÏ6ùïä\u0083QÔO¶\u0010\tý\u0019Ê\u009e\u0090¢\u0091KåIÚ\u0095\u001beV";
int var17 = "U\u0083®\u0004\u0011DÉ\u0011Á=¢D¬\u000bw\u0013u\u0089FS;\u000fYúQC\u0099\u0011\u008aX=î\u0018òÏ?È~Ô&ºÝ4w\u009aB¿«\u0010ÿ\u009dfÓ\u001a÷o\u0010\u0081\\H\u0088È³Ö9\"\u008c^ê+c©¯ cI!i\u0088\u001b\u0088\u0097û\u0080û¥EÍ\u0080fzta3ª\u001eñÝk`ÊÀM©ÝS\u0010wôu.úqb®\u009bQÑ\u0014\r½ýþ\u0010áí¹#Z\u0083Y\u009cç\u0098Uu\u0092¯á\u0092(!QP\u0083Ø±\u009fÅæ»ôHw\u0081;\u0017ù=¢Í\u009cÇTgjøDû±§Ôð\t|\u009d\u0011ðO_y8v.Â!íE\u0095»¯*ù\u0002\u0007À Co\u0086WKã³ús\u008e\u0018\u0083\u00ad¿«v3¼\u0019i°\u0005Z\u0003õ\u001cø+ÔÎU\u0087_\u0098[ DÉYç[\u0018ôô³\tGûîF\tB\u0083\u0005[æÏ6ùïä\u0083QÔO¶\u0010\tý\u0019Ê\u009e\u0090¢\u0091KåIÚ\u0095\u001beV"
.length();
char var14 = '8';
int var33 = -1;

label47:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var33 += var14) >= var17) {
c = var18;
d = new String[11];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[3];
int var4 = 0;
String var5 = "r;>DÛ\u009b\u009f¥\u0083AZå\u008a\u0092ò\u0082÷Ð\u0000^\u008cpÑ-";
int var6 = "r;>DÛ\u009b\u009f¥\u0083AZå\u008a\u0092ò\u0082÷Ð\u0000^\u008cpÑ-".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
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
byte var48 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var31 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(en.class, b<"m">(19254, 3558626394389117861L ^ var20), b<"m">(20631, 9051557480774164486L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(en.class, b<"m">(29702, 7804239632437986463L ^ var20), b<"m">(15179, 3226257717776190416L ^ var20), 0)
)
};
Y = var31;
b = new en((byte)var26, var27);
n = yp.L(b, b<"m">(26495, 8103161649218082797L ^ var20), f9.SILENT_FULL, null, null, (int)var0[1], null, var29);
J = yp.L(b, b<"m">(14266, 4798443359935629098L ^ var20), 0, new IntRange(0, (int)var0[0]), var24, null, null, (int)var0[2], null);
C = new i9(var22);
return;
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var43;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label47;
}

var15 = "V\u0014]n+ûAÔí\u0094âò[_7g\u0088®8µ\u0096ß¼ù é\u008f\u0095\u00adòÓc\u000b/â\u0092É\u0013â^®^i5OLÒ±'4LÌeaKÏì";
var17 = "V\u0014]n+ûAÔí\u0094âò[_7g\u0088®8µ\u0096ß¼ù é\u008f\u0095\u00adòÓc\u000b/â\u0092É\u0013â^®^i5OLÒ±'4LÌeaKÏì".length();
var14 = 24;
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27116;
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
throw new RuntimeException("su/catlean/en", var10);
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
throw new RuntimeException("su/catlean/en" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
