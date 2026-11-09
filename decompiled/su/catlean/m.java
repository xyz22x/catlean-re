package su.catlean;

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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class m {
@NotNull
public static final wh F;
@NotNull
private final List G;
@NotNull
private final List q;
@NotNull
private final List Y;
@JvmField
@NotNull
private static final Lazy[] i;
private static final long a = yz.a(7138261453855312611L, -4179142141675755360L, MethodHandles.lookup().lookupClass()).a(13126021563988L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public m(@NotNull List settingMacros, @NotNull List chatMacros, @NotNull List itemMacros, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(settingMacros, a<"x">(8845, 7790683739073465656L ^ ax));
Intrinsics.checkNotNullParameter(chatMacros, a<"x">(6511, 2946255340363740894L ^ ax));
Intrinsics.checkNotNullParameter(itemMacros, a<"x">(11268, 2481469874185618358L ^ ax));
super();
this.G = settingMacros;
this.q = chatMacros;
this.Y = itemMacros;
}

public m(List var1, List var2, List var3, int var4, DefaultConstructorMarker var5, long var6) {
var6 = a ^ var6;
long var8 = var6 ^ 85903095134154L;
if ((var4 & 1) != 0) {
var1 = new ArrayList();
}

if ((var4 & 2) != 0) {
var2 = new ArrayList();
}

if ((var4 & 4) != 0) {
var3 = new ArrayList();
}

this(var1, var2, var3, var8);
}

@NotNull
public final List F() {
return this.G;
}

@NotNull
public final List h() {
return this.q;
}

@NotNull
public final List V() {
return this.Y;
}

@NotNull
public final List n() {
return this.G;
}

@NotNull
public final List a() {
return this.q;
}

@NotNull
public final List t() {
return this.Y;
}

@NotNull
public final m z(@NotNull List settingMacros, @NotNull List chatMacros, @NotNull List itemMacros, long a) {
ax = a ^ ax;
long var6 = ax ^ 71088293882330L;
Intrinsics.checkNotNullParameter(settingMacros, a<"x">(25230, 5796369541538523109L ^ ax));
Intrinsics.checkNotNullParameter(chatMacros, a<"x">(671, 2143442266282477553L ^ ax));
Intrinsics.checkNotNullParameter(itemMacros, a<"x">(32562, 3514469396732983901L ^ ax));
return new m(settingMacros, chatMacros, itemMacros, var6);
}

public static m d(long var0, m var2, List var3, List var4, List var5, int var6, Object var7) {
var0 = a ^ var0;
long var8 = var0 ^ 59037436075857L;
_g[] var10 = vm.a<"Å">(-5013290779134722907L, var0);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var10 == null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -4903469448712700139L, var0);
}

var3 = var2.G;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var10 == null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -4903469448712700139L, var0);
}

var4 = var2.q;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var2.Y;
}

return var2.z(var3, var4, var5, var8);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 37730823198392L;
List var3 = this.Y;
List var4 = this.q;
List var5 = this.G;
return a<"x">(12095, 8203335871145629867L ^ var1)
+ var5
+ a<"x">(9066, 7979364257322456305L ^ var1)
+ var4
+ a<"x">(30621, 3999155711934169090L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 21032898324863L;
int var3 = this.G.hashCode();
var3 = var3 * b<"k">(16174, 6051254915817258164L ^ var1) + this.q.hashCode();
return var3 * b<"k">(6067, 4144369927398003752L ^ var1) + this.Y.hashCode();
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
// 00: getstatic su/catlean/m.a J
// 03: ldc2_w 60926640685185
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -9010488995611884484
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -8977334446400370804
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -8977334446400370804
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/m
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -8977334446400370804
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -8977334446400370804
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/m
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/m.G Ljava/util/List;
// 65: aload 5
// 67: getfield su/catlean/m.G Ljava/util/List;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -8977334446400370804
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -8977334446400370804
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/m.q Ljava/util/List;
// 92: aload 5
// 94: getfield su/catlean/m.q Ljava/util/List;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull c7
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -8977334446400370804
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -8977334446400370804
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/m.Y Ljava/util/List;
// bf: aload 5
// c1: getfield su/catlean/m.Y Ljava/util/List;
// c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c7: aload 4
// c9: ifnull e9
// cc: ifne e8
// cf: goto dc
// d2: ldc2_w -8977334446400370804
// d5: lload 2
// d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db: athrow
// dc: bipush 0
// dd: ireturn
// de: ldc2_w -8977334446400370804
// e1: lload 2
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: ireturn
}

@JvmStatic
public static final void Y(m self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w -3893834431380287682
// 009: lload 1
// 00a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: getstatic su/catlean/m.i [Lkotlin/Lazy;
// 012: astore 6
// 014: astore 5
// 016: aload 3
// 017: aload 4
// 019: bipush 0
// 01a: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 01f: aload 5
// 021: ifnull 053
// 024: ifeq 042
// 027: goto 034
// 02a: ldc2_w -4005947290094809970
// 02d: lload 1
// 02e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: athrow
// 034: bipush 1
// 035: goto 06d
// 038: ldc2_w -4005947290094809970
// 03b: lload 1
// 03c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: athrow
// 042: aload 0
// 043: getfield su/catlean/m.G Ljava/util/List;
// 046: new java/util/ArrayList
// 049: dup
// 04a: invokespecial java/util/ArrayList.<init> ()V
// 04d: checkcast java/util/List
// 050: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 053: aload 5
// 055: ifnull 069
// 058: ifne 06c
// 05b: goto 068
// 05e: ldc2_w -4005947290094809970
// 061: lload 1
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: bipush 1
// 069: goto 06d
// 06c: bipush 0
// 06d: lload 1
// 06e: lconst_0
// 06f: lcmp
// 070: iflt 0a5
// 073: ifeq 09c
// 076: aload 3
// 077: aload 4
// 079: bipush 0
// 07a: aload 6
// 07c: bipush 0
// 07d: aaload
// 07e: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 083: checkcast kotlinx/serialization/SerializationStrategy
// 086: aload 0
// 087: getfield su/catlean/m.G Ljava/util/List;
// 08a: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V 5
// 08f: goto 09c
// 092: ldc2_w -4005947290094809970
// 095: lload 1
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: aload 3
// 09d: aload 4
// 09f: bipush 1
// 0a0: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0a5: aload 5
// 0a7: lload 1
// 0a8: lconst_0
// 0a9: lcmp
// 0aa: ifle 0e1
// 0ad: ifnull 0df
// 0b0: ifeq 0ce
// 0b3: goto 0c0
// 0b6: ldc2_w -4005947290094809970
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: bipush 1
// 0c1: goto 0f9
// 0c4: ldc2_w -4005947290094809970
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: aload 0
// 0cf: getfield su/catlean/m.q Ljava/util/List;
// 0d2: new java/util/ArrayList
// 0d5: dup
// 0d6: invokespecial java/util/ArrayList.<init> ()V
// 0d9: checkcast java/util/List
// 0dc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0df: aload 5
// 0e1: ifnull 0f5
// 0e4: ifne 0f8
// 0e7: goto 0f4
// 0ea: ldc2_w -4005947290094809970
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: bipush 1
// 0f5: goto 0f9
// 0f8: bipush 0
// 0f9: lload 1
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: ifle 131
// 0ff: ifeq 128
// 102: aload 3
// 103: aload 4
// 105: bipush 1
// 106: aload 6
// 108: bipush 1
// 109: aaload
// 10a: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 10f: checkcast kotlinx/serialization/SerializationStrategy
// 112: aload 0
// 113: getfield su/catlean/m.q Ljava/util/List;
// 116: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V 5
// 11b: goto 128
// 11e: ldc2_w -4005947290094809970
// 121: lload 1
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 3
// 129: aload 4
// 12b: bipush 2
// 12c: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 131: aload 5
// 133: lload 1
// 134: lconst_0
// 135: lcmp
// 136: ifle 16d
// 139: ifnull 16b
// 13c: ifeq 15a
// 13f: goto 14c
// 142: ldc2_w -4005947290094809970
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: bipush 1
// 14d: goto 185
// 150: ldc2_w -4005947290094809970
// 153: lload 1
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 0
// 15b: getfield su/catlean/m.Y Ljava/util/List;
// 15e: new java/util/ArrayList
// 161: dup
// 162: invokespecial java/util/ArrayList.<init> ()V
// 165: checkcast java/util/List
// 168: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 16b: aload 5
// 16d: ifnull 181
// 170: ifne 184
// 173: goto 180
// 176: ldc2_w -4005947290094809970
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: bipush 1
// 181: goto 185
// 184: bipush 0
// 185: ifeq 1ae
// 188: aload 3
// 189: aload 4
// 18b: bipush 2
// 18c: aload 6
// 18e: bipush 2
// 18f: aaload
// 190: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 195: checkcast kotlinx/serialization/SerializationStrategy
// 198: aload 0
// 199: getfield su/catlean/m.Y Ljava/util/List;
// 19c: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V 5
// 1a1: goto 1ae
// 1a4: ldc2_w -4005947290094809970
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: return
}

public m(int seen0, List settingMacros, List chatMacros, List itemMacros, long a, SerializationConstructorMarker serializationConstructorMarker) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: ldc2_w 5432023185255501226
// 00b: lload 5
// 00d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 012: astore 8
// 014: bipush 0
// 015: iload 1
// 016: iand
// 017: ifeq 025
// 01a: iload 1
// 01b: bipush 0
// 01c: getstatic su/catlean/ow.c Lsu/catlean/ow;
// 01f: invokevirtual su/catlean/ow.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 022: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 025: aload 0
// 026: invokespecial java/lang/Object.<init> ()V
// 029: aload 8
// 02b: lload 5
// 02d: lconst_0
// 02e: lcmp
// 02f: iflt 060
// 032: ifnull 057
// 035: iload 1
// 036: bipush 1
// 037: iand
// 038: ifne 063
// 03b: aload 0
// 03c: new java/util/ArrayList
// 03f: dup
// 040: invokespecial java/util/ArrayList.<init> ()V
// 043: checkcast java/util/List
// 046: putfield su/catlean/m.G Ljava/util/List;
// 049: goto 057
// 04c: ldc2_w 5403257783766634010
// 04f: lload 5
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: lload 5
// 059: lconst_0
// 05a: lcmp
// 05b: iflt 076
// 05e: aload 8
// 060: ifnonnull 076
// 063: aload 0
// 064: aload 2
// 065: putfield su/catlean/m.G Ljava/util/List;
// 068: goto 076
// 06b: ldc2_w 5403257783766634010
// 06e: lload 5
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: lload 5
// 078: lconst_0
// 079: lcmp
// 07a: iflt 0b0
// 07d: iload 1
// 07e: bipush 2
// 07f: iand
// 080: ifne 0ab
// 083: aload 0
// 084: new java/util/ArrayList
// 087: dup
// 088: invokespecial java/util/ArrayList.<init> ()V
// 08b: checkcast java/util/List
// 08e: putfield su/catlean/m.q Ljava/util/List;
// 091: lload 5
// 093: lconst_0
// 094: lcmp
// 095: ifle 0be
// 098: aload 8
// 09a: ifnonnull 0be
// 09d: goto 0ab
// 0a0: ldc2_w 5403257783766634010
// 0a3: lload 5
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 0
// 0ac: aload 3
// 0ad: putfield su/catlean/m.q Ljava/util/List;
// 0b0: goto 0be
// 0b3: ldc2_w 5403257783766634010
// 0b6: lload 5
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: lload 5
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: ifle 0f2
// 0c5: iload 1
// 0c6: bipush 4
// 0c7: iand
// 0c8: ifne 0ec
// 0cb: aload 0
// 0cc: new java/util/ArrayList
// 0cf: dup
// 0d0: invokespecial java/util/ArrayList.<init> ()V
// 0d3: checkcast java/util/List
// 0d6: putfield su/catlean/m.Y Ljava/util/List;
// 0d9: aload 8
// 0db: ifnonnull 100
// 0de: goto 0ec
// 0e1: ldc2_w 5403257783766634010
// 0e4: lload 5
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 0
// 0ed: aload 4
// 0ef: putfield su/catlean/m.Y Ljava/util/List;
// 0f2: goto 100
// 0f5: ldc2_w 5403257783766634010
// 0f8: lload 5
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: return
}

private static final KSerializer Z() {
return new ArrayListSerializer(rg.W);
}

private static final KSerializer p() {
return new ArrayListSerializer(p2.N);
}

private static final KSerializer s() {
return new ArrayListSerializer(ca.N);
}

public m(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 87685246864573L;
this(null, null, null, b<"k">(6702, 8633855415571645740L ^ var1), null, var3);
}

public static final Lazy[] G() {
return i;
}

static {
long var11 = a ^ 110154041240267L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[9];
int var18 = 0;
String var17 = "áRN\u000eq°ü\u0092\fy Ó··bí\u0005\u0019\u0016\u008a&\r\u0097o\u0018H\u0011\u0002n\u001b\u0095[\u000b\u008cµ}g§r÷×øNx\u0089w\u0001¨q ÌÓ\u0004¯\u0094\u000bùÒ§ÓG+\u00170æqúÚì>\tl{?\u0080(\u000eí\u0016\u001fiR \u0007óQSö 8\u008e\u0081l\u001c¢Öö\u0003e1\u009b7\u001c\u0088\u0002hÉ/¶ ø \u0015÷\u0089 -\u0092ÃÑ`MãhÓÔ@\u001e\u0082Ìê\u00ad=D\u000b:ñû\u0089ÿÏ·gµýÚðÆ\u0018\u009fÀ$°t,A\u0002¤±\u009eP,É\u000b\u0083*X\u009bz'\u008a\u0097§ ¸¦L?à'\u008e\u008a\u0017¼à'ñ¬·u\u008aã«T)\u0011ê°ý\u009aG\u00ad\u008e/Ê¼";
int var19 = "áRN\u000eq°ü\u0092\fy Ó··bí\u0005\u0019\u0016\u008a&\r\u0097o\u0018H\u0011\u0002n\u001b\u0095[\u000b\u008cµ}g§r÷×øNx\u0089w\u0001¨q ÌÓ\u0004¯\u0094\u000bùÒ§ÓG+\u00170æqúÚì>\tl{?\u0080(\u000eí\u0016\u001fiR \u0007óQSö 8\u008e\u0081l\u001c¢Öö\u0003e1\u009b7\u001c\u0088\u0002hÉ/¶ ø \u0015÷\u0089 -\u0092ÃÑ`MãhÓÔ@\u001e\u0082Ìê\u00ad=D\u000b:ñû\u0089ÿÏ·gµýÚðÆ\u0018\u009fÀ$°t,A\u0002¤±\u009eP,É\u000b\u0083*X\u009bz'\u008a\u0097§ ¸¦L?à'\u008e\u008a\u0017¼à'ñ¬·u\u008aã«T)\u0011ê°ý\u009aG\u00ad\u008e/Ê¼"
.length();
char var16 = 24;
int var24 = -1;

label45:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var34 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var34;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[9];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\"äª¸õA\u0010\u0003Ü\u0099\u008fX\u000e\u007föDÑ¹\u0094\u0088ËÝôÝ";
int var5 = "\"äª¸õA\u0010\u0003Ü\u0099\u008fX\u000e\u007föDÑ¹\u0094\u0088ËÝôÝ".length();
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
byte var39 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
F = new wh(null);
Lazy[] var22 = new Lazy[]{
LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, m::Z), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, m::p), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, m::s)
};
i = var22;
return;
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var34;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label45;
}

var17 = "\u0013[Þ\u0094`\u0013¢#^TÛ\"xM\u0097ì\u0017\u0082\u008d\u0088u\u008d!\u0005\u0098ï³Ç\"Þ7«0~²rX\u0002FÌ×*l.Ôj\u0014Ã¥ÿö\\\u0099°M\u0082\u0014ü,\u0004gÀ \nM\u0005ÓW\u0097\u0003\u0089\u0018\u0004®!AÜ\u0081\u0083\u0099m";
var19 = "\u0013[Þ\u0094`\u0013¢#^TÛ\"xM\u0097ì\u0017\u0082\u008d\u0088u\u008d!\u0005\u0098ï³Ç\"Þ7«0~²rX\u0002FÌ×*l.Ôj\u0014Ã¥ÿö\\\u0099°M\u0082\u0014ü,\u0004gÀ \nM\u0005ÓW\u0097\u0003\u0089\u0018\u0004®!AÜ\u0081\u0083\u0099m"
.length();
var16 = ' ';
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8742;
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
throw new RuntimeException("su/catlean/m", var10);
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
throw new RuntimeException("su/catlean/m" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27110;
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
throw new RuntimeException("su/catlean/m", var14);
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
throw new RuntimeException("su/catlean/m" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
