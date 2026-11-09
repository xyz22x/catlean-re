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
public final class y_ {
@NotNull
public static final yn v;
@NotNull
private final String V;
@NotNull
private List z;
@JvmField
@NotNull
private static final Lazy[] X;
private static String[] Z;
private static final long a = yz.a(8000383159215201605L, -3329495775121983527L, MethodHandles.lookup().lookupClass()).a(36221155869830L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public y_(short a, int a, char a, @NotNull String id, @NotNull List modules) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(id, a<"u">(28458, 7077392197399984670L ^ var6));
Intrinsics.checkNotNullParameter(modules, a<"u">(1556, 3231014226848437027L ^ var6));
super();
this.V = id;
this.z = modules;
}

public y_(String var1, List var2, int var3, DefaultConstructorMarker var4, long var5) {
var5 = a ^ var5;
long var10001 = var5 ^ 71171843658578L;
int var7 = (int)((var5 ^ 71171843658578L) >>> 48);
int var8 = (int)((var5 ^ 71171843658578L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
if ((var3 & 2) != 0) {
var2 = CollectionsKt.emptyList();
}

this((short)var7, var8, (char)var9, var1, var2);
}

@NotNull
public final String q() {
return this.V;
}

@NotNull
public final List f() {
return this.z;
}

public final void s(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(8257, 291965477383083456L ^ ax));
this.z = <set-?>;
}

@NotNull
public final String L() {
return this.V;
}

@NotNull
public final List K() {
return this.z;
}

@NotNull
public final y_ Y(char a, @NotNull String id, @NotNull List modules, int a, int a) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var6 ^ 121734145761918L;
int var8 = (int)((var6 ^ 121734145761918L) >>> 48);
int var9 = (int)((var6 ^ 121734145761918L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(id, a<"u">(32018, 4534790280016609056L ^ var6));
Intrinsics.checkNotNullParameter(modules, a<"u">(27203, 6187642385776683127L ^ var6));
return new y_((short)var8, var9, (char)var10, id, modules);
}

public static y_ J(y_ var0, short var1, String var2, char var3, List var4, int var5, int var6, Object var7) {
long var8 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
long var10001 = var8 ^ 24314779121330L;
int var10 = (int)((var8 ^ 24314779121330L) >>> 48);
int var11 = (int)((var8 ^ 24314779121330L) << 16 >>> 32);
int var12 = (int)(var10001 << 48 >>> 48);
_g[] var13 = vm.a<"Å">(-2646016064581427825L, var8);

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
throw vm.a<"Å">(var14, -2622600876764894720L, var8);
}

var2 = var0.V;
}

var10000 = var5 & 2;
}

if (var10000 != 0) {
var4 = var0.z;
}

return var0.Y((char)var10, var2, var4, var11, var12);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 109481644689280L;
String var10000 = this.V;
List var10001 = this.z;
return a<"u">(9664, 3972739669808057589L ^ var1) + var10000 + a<"u">(21931, 238138345294855320L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 98155421641909L;
int var3 = this.V.hashCode();
return var3 * (int)e + this.z.hashCode();
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
// 00: getstatic su/catlean/y_.a J
// 03: ldc2_w 121019884357214
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 3626299793699337371
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 3643100379696857876
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 3643100379696857876
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/y_
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 3643100379696857876
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 3643100379696857876
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/y_
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/y_.V Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/y_.V Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 3643100379696857876
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 3643100379696857876
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/y_.z Ljava/util/List;
// 92: aload 5
// 94: getfield su/catlean/y_.z Ljava/util/List;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 3643100379696857876
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 3643100379696857876
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void h(int a, y_ self, int a, CompositeEncoder output, SerialDescriptor serialDesc, byte a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 0
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 40
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 5
// 10: i2l
// 11: bipush 56
// 13: lshl
// 14: bipush 56
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/y_.a J
// 1b: lxor
// 1c: lstore 6
// 1e: ldc2_w -3137246598276934978
// 21: lload 6
// 23: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: getstatic su/catlean/y_.X [Lkotlin/Lazy;
// 2b: astore 9
// 2d: aload 3
// 2e: aload 4
// 30: bipush 0
// 31: aload 1
// 32: getfield su/catlean/y_.V Ljava/lang/String;
// 35: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V 4
// 3a: astore 8
// 3c: aload 3
// 3d: aload 4
// 3f: bipush 1
// 40: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 45: aload 8
// 47: ifnull 74
// 4a: ifeq 6a
// 4d: goto 5b
// 50: ldc2_w -3122240449628084943
// 53: lload 6
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: bipush 1
// 5c: goto 8f
// 5f: ldc2_w -3122240449628084943
// 62: lload 6
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: aload 1
// 6b: getfield su/catlean/y_.z Ljava/util/List;
// 6e: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 71: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 74: aload 8
// 76: ifnull 8b
// 79: ifne 8e
// 7c: goto 8a
// 7f: ldc2_w -3122240449628084943
// 82: lload 6
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: bipush 1
// 8b: goto 8f
// 8e: bipush 0
// 8f: ifeq b9
// 92: aload 3
// 93: aload 4
// 95: bipush 1
// 96: aload 9
// 98: bipush 1
// 99: aaload
// 9a: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 9f: checkcast kotlinx/serialization/SerializationStrategy
// a2: aload 1
// a3: getfield su/catlean/y_.z Ljava/util/List;
// a6: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V 5
// ab: goto b9
// ae: ldc2_w -3122240449628084943
// b1: lload 6
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: return
}

public y_(int seen0, String id, long a, List modules, SerializationConstructorMarker serializationConstructorMarker) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/y_.a J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: ldc2_w -793369908429475275
// 09: lload 3
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 7
// 11: bipush 1
// 12: bipush 1
// 13: iload 1
// 14: iand
// 15: if_icmpeq 23
// 18: iload 1
// 19: bipush 1
// 1a: getstatic su/catlean/g8.d Lsu/catlean/g8;
// 1d: invokevirtual su/catlean/g8.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 20: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 23: aload 0
// 24: invokespecial java/lang/Object.<init> ()V
// 27: lload 3
// 28: lconst_0
// 29: lcmp
// 2a: ifle 37
// 2d: aload 0
// 2e: aload 7
// 30: ifnull 6a
// 33: aload 2
// 34: putfield su/catlean/y_.V Ljava/lang/String;
// 37: lload 3
// 38: lconst_0
// 39: lcmp
// 3a: ifle 4a
// 3d: iload 1
// 3e: bipush 2
// 3f: iand
// 40: ifne 5c
// 43: aload 0
// 44: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 47: putfield su/catlean/y_.z Ljava/util/List;
// 4a: aload 7
// 4c: ifnonnull 6f
// 4f: goto 5c
// 52: ldc2_w -855487903386909254
// 55: lload 3
// 56: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: athrow
// 5c: aload 0
// 5d: goto 6a
// 60: ldc2_w -855487903386909254
// 63: lload 3
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: aload 5
// 6c: putfield su/catlean/y_.z Ljava/util/List;
// 6f: return
}

private static final KSerializer v() {
return new ArrayListSerializer(j8.C);
}

public static final Lazy[] y() {
return X;
}

static {
long var14 = a ^ 136470732487278L;
vm.a<"Å">(null, -3567587640048357080L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[7];
int var10 = 0;
String var9 = "äq\u001f^:}\røéC¸\u008d7ZÏ\u008e\u00104B=8\u0086ðÿæ\u0088\r\u0011\u008f\u0082 7§\u0010kMÚ¼G\u001f$\u0090UL©¯*½i× \u0001\u008f-º5°{ÀPðY\u0091, ñ\u0090ï\u0017\u0080\u0090@í\u0097t»\u009cb\u0017i!z\u0090\u0010Âr©âÂ^\u0089ø6m\u008awõ«\u000fS";
int var11 = "äq\u001f^:}\røéC¸\u008d7ZÏ\u008e\u00104B=8\u0086ðÿæ\u0088\r\u0011\u008f\u0082 7§\u0010kMÚ¼G\u001f$\u0090UL©¯*½i× \u0001\u008f-º5°{ÀPðY\u0091, ñ\u0090ï\u0017\u0080\u0090@í\u0097t»\u009cb\u0017i!z\u0090\u0010Âr©âÂ^\u0089ø6m\u008awõ«\u000fS"
.length();
char var8 = 16;
int var18 = -1;

label37:
while (true) {
String var19 = var9.substring(++var18, var18 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
String var27 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var27;
if ((var18 += var8) >= var11) {
b = var12;
c = new String[7];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 2333149830238392216L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var31 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var31;
v = new yn(null);
Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, y_::v)};
X = var16;
return;
}

var8 = var9.charAt(var18);
break;
default:
var12[var10++] = var27;
if ((var18 += var8) < var11) {
var8 = var9.charAt(var18);
continue label37;
}

var9 = "¥\u000fßäB~ØfÛx\u008b\u0003È/îér(v+Ñ\u009b\nI¨\u007f61\u0004Þ<\u009cK¡<ë÷\u0019»\u0012\u0010û ?yM\u0086\u0086HW¢u~\u0007úFÝ";
var11 = "¥\u000fßäB~ØfÛx\u008b\u0003È/îér(v+Ñ\u009b\nI¨\u007f61\u0004Þ<\u009cK¡<ë÷\u0019»\u0012\u0010û ?yM\u0086\u0086HW¢u~\u0007úFÝ".length();
var8 = '(';
var18 = -1;
}

var19 = var9.substring(++var18, var18 + var8);
var10001 = 0;
}
}
}

public static void H(String[] var0) {
Z = var0;
}

public static String[] x() {
return Z;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23498;
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
throw new RuntimeException("su/catlean/y_", var10);
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
throw new RuntimeException("su/catlean/y_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
