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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
public final class jn {
@NotNull
public static final g U;
@NotNull
private final String B;
@NotNull
private List q;
@JvmField
@NotNull
private static final Lazy[] t;
private static _g[] M;
private static final long a = yz.a(-5104864904788312624L, -1317072020451654299L, MethodHandles.lookup().lookupClass()).a(230134003881481L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public jn(long a, char a, @NotNull String id, @NotNull List widgets) {
long var6 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(id, a<"r">(704, 4266243120036484386L ^ var6));
Intrinsics.checkNotNullParameter(widgets, a<"r">(23805, 298694981598628637L ^ var6));
super();
this.B = id;
this.q = widgets;
}

public jn(String var1, List var2, int var3, int var4, short var5, DefaultConstructorMarker var6, short var7) {
long var8 = ((long)var4 << 32 | (long)var5 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
long var10 = (var8 ^ 43384758444136L) >>> 16;
int var12 = (int)((var8 ^ 43384758444136L) << 48 >>> 48);
if ((var3 & 2) != 0) {
var2 = CollectionsKt.emptyList();
}

this(var10, (char)var12, var1, var2);
}

@NotNull
public final String w() {
return this.B;
}

@NotNull
public final List B() {
return this.q;
}

public final void L(@NotNull List <set-?>, byte a, long a) {
long var5 = ((long)axx << 56 | ax << 8 >>> 8) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"r">(30243, 1142413528939680517L ^ var5));
this.q = <set-?>;
}

@NotNull
public final String s() {
return this.B;
}

@NotNull
public final List Y() {
return this.q;
}

@NotNull
public final jn d(int a, char a, int a, @NotNull String id, @NotNull List widgets) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var8 = (var6 ^ 50417463165696L) >>> 16;
int var10 = (int)((var6 ^ 50417463165696L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(id, a<"r">(12868, 8830743015570709851L ^ var6));
Intrinsics.checkNotNullParameter(widgets, a<"r">(18478, 605298873970878263L ^ var6));
return new jn(var8, (char)var10, id, widgets);
}

public static jn a(jn var0, long var1, String var3, List var4, int var5, Object var6, int var7) {
long var8 = (var1 << 32 | (long)var7 << 32 >>> 32) ^ a;
long var10001 = var8 ^ 95906077603631L;
int var10 = (int)((var8 ^ 95906077603631L) >>> 32);
int var11 = (int)((var8 ^ 95906077603631L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
_g[] var13 = vm.a<"Å">(-7207414037805081294L, var8);

int var10000;
label25: {
label24: {
try {
var10000 = var5 & 1;
if (var13 == null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -7257903626408597233L, var8);
}

var3 = var0.B;
}

var10000 = var5 & 2;
}

if (var10000 != 0) {
var4 = var0.q;
}

return var0.d(var10, (char)var11, var12, var3, var4);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 19484694293168L;
String var10000 = this.B;
List var10001 = this.q;
return a<"r">(10452, 3604426599621607640L ^ var1) + var10000 + a<"r">(22112, 4230560401371741806L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 7207105237533L;
int var3 = this.B.hashCode();
return var3 * (int)e + this.q.hashCode();
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
// 00: getstatic su/catlean/jn.a J
// 03: ldc2_w 29999840144672
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -7516751529151442585
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -7560556094504934054
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -7560556094504934054
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/jn
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -7560556094504934054
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -7560556094504934054
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/jn
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/jn.B Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/jn.B Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -7560556094504934054
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -7560556094504934054
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/jn.q Ljava/util/List;
// 92: aload 5
// 94: getfield su/catlean/jn.q Ljava/util/List;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -7560556094504934054
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -7560556094504934054
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void P(jn self, CompositeEncoder output, long a, SerialDescriptor serialDesc) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jn.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: getstatic su/catlean/jn.t [Lkotlin/Lazy;
// 09: astore 6
// 0b: ldc2_w -8646208857879425334
// 0e: lload 2
// 0f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14: aload 1
// 15: aload 4
// 17: bipush 0
// 18: aload 0
// 19: getfield su/catlean/jn.B Ljava/lang/String;
// 1c: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 21: astore 5
// 23: aload 1
// 24: aload 4
// 26: bipush 1
// 27: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 2c: aload 5
// 2e: ifnull 59
// 31: ifeq 4f
// 34: goto 41
// 37: ldc2_w -8593185989100209417
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: bipush 1
// 42: goto 73
// 45: ldc2_w -8593185989100209417
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 0
// 50: getfield su/catlean/jn.q Ljava/util/List;
// 53: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 56: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 59: aload 5
// 5b: ifnull 6f
// 5e: ifne 72
// 61: goto 6e
// 64: ldc2_w -8593185989100209417
// 67: lload 2
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: bipush 1
// 6f: goto 73
// 72: bipush 0
// 73: ifeq 9c
// 76: aload 1
// 77: aload 4
// 79: bipush 1
// 7a: aload 6
// 7c: bipush 1
// 7d: aaload
// 7e: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 83: checkcast kotlinx/serialization/SerializationStrategy
// 86: aload 0
// 87: getfield su/catlean/jn.q Ljava/util/List;
// 8a: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V 5
// 8f: goto 9c
// 92: ldc2_w -8593185989100209417
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: return
}

public jn(int seen0, String id, char a, List widgets, SerializationConstructorMarker serializationConstructorMarker, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 3
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 6
// 07: i2l
// 08: bipush 32
// 0a: lshl
// 0b: bipush 16
// 0d: lushr
// 0e: lor
// 0f: iload 7
// 11: i2l
// 12: bipush 48
// 14: lshl
// 15: bipush 48
// 17: lushr
// 18: lor
// 19: getstatic su/catlean/jn.a J
// 1c: lxor
// 1d: lstore 8
// 1f: ldc2_w 8737875303408484235
// 22: lload 8
// 24: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: astore 10
// 2b: bipush 1
// 2c: bipush 1
// 2d: iload 1
// 2e: iand
// 2f: if_icmpeq 3d
// 32: iload 1
// 33: bipush 1
// 34: getstatic su/catlean/o1.J Lsu/catlean/o1;
// 37: invokevirtual su/catlean/o1.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 3a: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 3d: aload 0
// 3e: invokespecial java/lang/Object.<init> ()V
// 41: iload 6
// 43: ifle 50
// 46: aload 0
// 47: aload 10
// 49: ifnull 83
// 4c: aload 2
// 4d: putfield su/catlean/jn.B Ljava/lang/String;
// 50: iload 3
// 51: iflt 61
// 54: iload 1
// 55: bipush 2
// 56: iand
// 57: ifne 74
// 5a: aload 0
// 5b: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 5e: putfield su/catlean/jn.q Ljava/util/List;
// 61: aload 10
// 63: ifnonnull 88
// 66: goto 74
// 69: ldc2_w 8790898166481390518
// 6c: lload 8
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: aload 0
// 75: goto 83
// 78: ldc2_w 8790898166481390518
// 7b: lload 8
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: aload 4
// 85: putfield su/catlean/jn.q Ljava/util/List;
// 88: return
}

private static final KSerializer C() {
return new ArrayListSerializer(j8.C);
}

public static final Lazy[] K() {
return t;
}

static {
long var14 = a ^ 23968858558582L;
_g[] var10000 = new _g[4];
vm.a<"Å">(var10000, -1564861535094765248L, var14);
Cipher var5;
Cipher var19 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var19.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[7];
int var10 = 0;
String var9 = "\u009a3åsíýú¬\n²û\u001du\u0007\u008cIJÕµÇ\u001f\u008c\u0089\u0014\u00ad¢\u009b\u0093(«ïÂ\u0010\u000fË\u0013< \"#}ñQf`\u001b\u008e\u0090\u001b(\u0081aùçN\u009c¾$+\u000fãP§\u0097Çÿá÷¨7\u007fA$É\u009eðÍjrøè¥ïGö0\u0002öµ$\u0010¡a¡O®Rª{éå²¦\u008f\u0000\u0089\f\u0010Ñ5ß\u0099;û¶ªvDèP!]Í¬";
int var11 = "\u009a3åsíýú¬\n²û\u001du\u0007\u008cIJÕµÇ\u001f\u008c\u0089\u0014\u00ad¢\u009b\u0093(«ïÂ\u0010\u000fË\u0013< \"#}ñQf`\u001b\u008e\u0090\u001b(\u0081aùçN\u009c¾$+\u000fãP§\u0097Çÿá÷¨7\u007fA$É\u009eðÍjrøè¥ïGö0\u0002öµ$\u0010¡a¡O®Rª{éå²¦\u008f\u0000\u0089\f\u0010Ñ5ß\u0099;û¶ªvDèP!]Í¬"
.length();
char var8 = ' ';
int var18 = -1;

label37:
while (true) {
String var20 = var9.substring(++var18, var18 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var28;
if ((var18 += var8) >= var11) {
b = var12;
c = new String[7];
Cipher var0;
Cipher var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -5659973548343580318L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var32;
U = new g(null);
Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, jn::C)};
t = var16;
return;
}

var8 = var9.charAt(var18);
break;
default:
var12[var10++] = var28;
if ((var18 += var8) < var11) {
var8 = var9.charAt(var18);
continue label37;
}

var9 = "¸\u009a:\u008aÔ\b\u0089ÙvÑ\u0001r\u008a4\\\u001e\u0010¡º\u008b\u0084g\u009céýrTrH\\à(\u0096";
var11 = "¸\u009a:\u008aÔ\b\u0089ÙvÑ\u0001r\u008a4\\\u001e\u0010¡º\u008b\u0084g\u009céýrTrH\\à(\u0096".length();
var8 = 16;
var18 = -1;
}

var20 = var9.substring(++var18, var18 + var8);
var10001 = 0;
}
}
}

public static void R(_g[] var0) {
M = var0;
}

public static _g[] L() {
return M;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31046;
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
throw new RuntimeException("su/catlean/jn", var10);
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
throw new RuntimeException("su/catlean/jn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
