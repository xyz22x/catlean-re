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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class yc implements GeneratedSerializer {
@NotNull
public static final yc k;
@NotNull
private static final SerialDescriptor M;
private static final long a = yz.a(-7463108275238818246L, 3292397685456812125L, MethodHandles.lookup().lookupClass()).a(54392246450332L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private yc() {
}

public final void g(@NotNull Encoder encoder, @NotNull d_ value, long a) {
ax = a ^ ax;
long var5 = ax ^ 130142654215333L;
Intrinsics.checkNotNullParameter(encoder, a<"p">(3303, 939292203314389278L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"p">(14275, 6025897745572600377L ^ ax));
SerialDescriptor var7 = M;
CompositeEncoder var8 = encoder.beginStructure(var7);
d_.I(var5, value, var8, var7);
var8.endStructure(var7);
}

@NotNull
public final d_ Z(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/yc.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 24345192876136
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: pop2
// 029: aload 1
// 02a: sipush 16308
// 02d: ldc2_w 5321492957090536527
// 030: lload 2
// 031: lxor
// 032: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/yc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: ldc2_w -226308012518095250
// 03d: lload 2
// 03e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: getstatic su/catlean/yc.M Lkotlinx/serialization/descriptors/SerialDescriptor;
// 046: astore 8
// 048: astore 7
// 04a: bipush 1
// 04b: istore 9
// 04d: bipush 0
// 04e: istore 11
// 050: fconst_0
// 051: fstore 12
// 053: fconst_0
// 054: fstore 13
// 056: aload 1
// 057: aload 8
// 059: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 05e: astore 14
// 060: aload 14
// 062: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 067: aload 7
// 069: ifnonnull 0ba
// 06c: ifeq 0ab
// 06f: goto 07c
// 072: ldc2_w -181422996913307826
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 14
// 07e: aload 8
// 080: bipush 0
// 081: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)F 3
// 086: fstore 12
// 088: iload 11
// 08a: bipush 1
// 08b: ior
// 08c: istore 11
// 08e: aload 14
// 090: aload 8
// 092: lload 2
// 093: lconst_0
// 094: lcmp
// 095: ifle 160
// 098: bipush 1
// 099: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)F 3
// 09e: fstore 13
// 0a0: iload 11
// 0a2: bipush 2
// 0a3: ior
// 0a4: istore 11
// 0a6: aload 7
// 0a8: ifnull 15c
// 0ab: iload 9
// 0ad: goto 0ba
// 0b0: ldc2_w -181422996913307826
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: ifeq 15c
// 0bd: aload 14
// 0bf: aload 8
// 0c1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0c6: istore 10
// 0c8: lload 2
// 0c9: lconst_0
// 0ca: lcmp
// 0cb: ifle 165
// 0ce: aload 7
// 0d0: ifnonnull 165
// 0d3: iload 10
// 0d5: aload 7
// 0d7: ifnonnull 10b
// 0da: goto 0e7
// 0dd: ldc2_w -181422996913307826
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: tableswitch 101 -1 1 35 49 78
// 100: ldc2_w -181422996913307826
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: bipush 0
// 10b: istore 9
// 10d: aload 7
// 10f: lload 2
// 110: lconst_0
// 111: lcmp
// 112: iflt 12c
// 115: ifnull 0ab
// 118: aload 14
// 11a: aload 8
// 11c: bipush 0
// 11d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)F 3
// 122: fstore 12
// 124: iload 11
// 126: bipush 1
// 127: ior
// 128: istore 11
// 12a: aload 7
// 12c: lload 2
// 12d: lconst_0
// 12e: lcmp
// 12f: iflt 149
// 132: ifnull 0ab
// 135: aload 14
// 137: aload 8
// 139: bipush 1
// 13a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)F 3
// 13f: fstore 13
// 141: iload 11
// 143: bipush 2
// 144: ior
// 145: istore 11
// 147: aload 7
// 149: ifnull 0ab
// 14c: lload 2
// 14d: lconst_0
// 14e: lcmp
// 14f: ifle 15c
// 152: new kotlinx/serialization/UnknownFieldException
// 155: dup
// 156: iload 10
// 158: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 15b: athrow
// 15c: aload 14
// 15e: aload 8
// 160: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 165: new su/catlean/d_
// 168: dup
// 169: iload 11
// 16b: fload 12
// 16d: iload 4
// 16f: i2s
// 170: iload 5
// 172: fload 13
// 174: iload 6
// 176: aconst_null
// 177: invokespecial su/catlean/d_.<init> (IFSIFILkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 17a: ldc2_w -232620347174755756
// 17d: lload 2
// 17e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: lload 2
// 184: lconst_0
// 185: lcmp
// 186: iflt 190
// 189: ifnull 1a6
// 18c: bipush 2
// 18d: anewarray 299
// 190: ldc2_w -287948806379313380
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: goto 1a6
// 19c: ldc2_w -181422996913307826
// 19f: lload 2
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return M;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{FloatSerializer.INSTANCE, FloatSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 117913383439216L;
long var5 = var3 ^ 73119906150631L;
this.g(encoder, (d_)value, var5);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 44042734453221L;
long var4 = var2 ^ 45849771457649L;
return this.Z(decoder, var4);
}

static {
long var9 = a ^ 14619522718597L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[4];
int var5 = 0;
String var4 = "9æ)8Â\f\u0083\u008aç\u008co\u0095Òe\nð\u0018\u0088\u00ad\u0000q×¥\b\u0090Íb\u0087²c\b\u009f¼\u0006$ðû\u0091%\u0015±";
int var6 = "9æ)8Â\f\u0083\u008aç\u008co\u0095Òe\nð\u0018\u0088\u00ad\u0000q×¥\b\u0090Íb\u0087²c\b\u009f¼\u0006$ðû\u0091%\u0015±".length();
char var3 = 16;
int var13 = -1;

label27:
while (true) {
String var14 = var4.substring(++var13, var13 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var13 += var3) >= var6) {
b = var7;
c = new String[4];
k = new yc();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"p">(27224, 8870439881046662313L ^ var9), k, 2);
var11.addElement("x", true);
var11.addElement("y", true);
M = var11;
return;
}

var3 = var4.charAt(var13);
break;
default:
var7[var5++] = var20;
if ((var13 += var3) < var6) {
var3 = var4.charAt(var13);
continue label27;
}

var4 = "2_É¢þ\u0001\u001d¾òÕoïG#\u001f¼\u0010`k\u0081\u009aÑ-ñ\u0003\u0093m»ñ\u008a¤ÜM";
var6 = "2_É¢þ\u0001\u001d¾òÕoïG#\u001f¼\u0010`k\u0081\u009aÑ-ñ\u0003\u0093m»ñ\u008a¤ÜM".length();
var3 = 16;
var13 = -1;
}

var14 = var4.substring(++var13, var13 + var3);
var10001 = 0;
}
}
}

private static UnknownFieldException a(UnknownFieldException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7789;
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
throw new RuntimeException("su/catlean/yc", var10);
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
throw new RuntimeException("su/catlean/yc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
