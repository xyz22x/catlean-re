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
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class ow implements GeneratedSerializer {
@NotNull
public static final ow c;
@NotNull
private static final SerialDescriptor U;
private static final long a = yz.a(-2983098198207827791L, 8833115122815622980L, MethodHandles.lookup().lookupClass()).a(247830653810644L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);

private ow() {
}

public final void m(long a, @NotNull Encoder encoder, @NotNull m value) {
ax = a ^ ax;
long var5 = ax ^ 71083434693960L;
Intrinsics.checkNotNullParameter(encoder, a<"w">(26296, 6824293105498546414L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"w">(29831, 7394251577309295314L ^ ax));
SerialDescriptor var7 = U;
CompositeEncoder var8 = encoder.beginStructure(var7);
m.Y(value, var5, var8, var7);
var8.endStructure(var7);
}

@NotNull
public final m D(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ow.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 93893930906582
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w -4920733106126848642
// 012: lload 2
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 11437
// 01c: ldc2_w 4994350980188376822
// 01f: lload 2
// 020: lxor
// 021: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/ow.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: astore 6
// 02b: getstatic su/catlean/ow.U Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02e: astore 7
// 030: bipush 1
// 031: istore 8
// 033: bipush 0
// 034: istore 10
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: aconst_null
// 03d: astore 13
// 03f: aload 1
// 040: aload 7
// 042: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 047: astore 14
// 049: invokestatic su/catlean/m.G ()[Lkotlin/Lazy;
// 04c: astore 15
// 04e: aload 14
// 050: aload 6
// 052: ifnull 08f
// 055: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05a: ifeq 0eb
// 05d: goto 06a
// 060: ldc2_w -4954620630127143733
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: aload 14
// 06c: aload 7
// 06e: bipush 0
// 06f: aload 15
// 071: bipush 0
// 072: aaload
// 073: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 078: checkcast kotlinx/serialization/DeserializationStrategy
// 07b: aload 11
// 07d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 082: goto 08f
// 085: ldc2_w -4954620630127143733
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: checkcast java/util/List
// 092: astore 11
// 094: iload 10
// 096: bipush 1
// 097: ior
// 098: istore 10
// 09a: aload 14
// 09c: aload 7
// 09e: bipush 1
// 09f: aload 15
// 0a1: bipush 1
// 0a2: aaload
// 0a3: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 0a8: checkcast kotlinx/serialization/DeserializationStrategy
// 0ab: aload 12
// 0ad: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0b2: checkcast java/util/List
// 0b5: astore 12
// 0b7: iload 10
// 0b9: bipush 2
// 0ba: ior
// 0bb: istore 10
// 0bd: aload 14
// 0bf: aload 7
// 0c1: bipush 2
// 0c2: aload 15
// 0c4: bipush 2
// 0c5: aaload
// 0c6: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 0cb: checkcast kotlinx/serialization/DeserializationStrategy
// 0ce: aload 13
// 0d0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0d5: checkcast java/util/List
// 0d8: astore 13
// 0da: iload 10
// 0dc: bipush 4
// 0dd: ior
// 0de: lload 2
// 0df: lconst_0
// 0e0: lcmp
// 0e1: iflt 0ed
// 0e4: istore 10
// 0e6: aload 6
// 0e8: ifnonnull 1ec
// 0eb: iload 8
// 0ed: ifeq 1ec
// 0f0: goto 0fd
// 0f3: ldc2_w -4954620630127143733
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: aload 14
// 0ff: aload 7
// 101: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 106: istore 9
// 108: aload 6
// 10a: ifnull 1f5
// 10d: iload 9
// 10f: aload 6
// 111: ifnull 14b
// 114: goto 121
// 117: ldc2_w -4954620630127143733
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: tableswitch 187 -1 2 41 55 101 147
// 140: ldc2_w -4954620630127143733
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: bipush 0
// 14b: istore 8
// 14d: aload 6
// 14f: lload 2
// 150: lconst_0
// 151: lcmp
// 152: ifle 17d
// 155: ifnonnull 0eb
// 158: aload 14
// 15a: aload 7
// 15c: bipush 0
// 15d: aload 15
// 15f: bipush 0
// 160: aaload
// 161: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 166: checkcast kotlinx/serialization/DeserializationStrategy
// 169: aload 11
// 16b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 170: checkcast java/util/List
// 173: astore 11
// 175: iload 10
// 177: bipush 1
// 178: ior
// 179: istore 10
// 17b: aload 6
// 17d: lload 2
// 17e: lconst_0
// 17f: lcmp
// 180: ifle 1ab
// 183: ifnonnull 0eb
// 186: aload 14
// 188: aload 7
// 18a: bipush 1
// 18b: aload 15
// 18d: bipush 1
// 18e: aaload
// 18f: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 194: checkcast kotlinx/serialization/DeserializationStrategy
// 197: aload 12
// 199: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 19e: checkcast java/util/List
// 1a1: astore 12
// 1a3: iload 10
// 1a5: bipush 2
// 1a6: ior
// 1a7: istore 10
// 1a9: aload 6
// 1ab: lload 2
// 1ac: lconst_0
// 1ad: lcmp
// 1ae: iflt 1d9
// 1b1: ifnonnull 0eb
// 1b4: aload 14
// 1b6: aload 7
// 1b8: bipush 2
// 1b9: aload 15
// 1bb: bipush 2
// 1bc: aaload
// 1bd: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 1c2: checkcast kotlinx/serialization/DeserializationStrategy
// 1c5: aload 13
// 1c7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1cc: checkcast java/util/List
// 1cf: astore 13
// 1d1: iload 10
// 1d3: bipush 4
// 1d4: ior
// 1d5: istore 10
// 1d7: aload 6
// 1d9: ifnonnull 0eb
// 1dc: new kotlinx/serialization/UnknownFieldException
// 1df: dup
// 1e0: iload 9
// 1e2: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 1e5: lload 2
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: ifle 170
// 1eb: athrow
// 1ec: aload 14
// 1ee: aload 7
// 1f0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 1f5: new su/catlean/m
// 1f8: dup
// 1f9: iload 10
// 1fb: aload 11
// 1fd: aload 12
// 1ff: aload 13
// 201: lload 4
// 203: aconst_null
// 204: invokespecial su/catlean/m.<init> (ILjava/util/List;Ljava/util/List;Ljava/util/List;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 207: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return U;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = m.G();
return new KSerializer[]{(KSerializer)var1[0].getValue(), (KSerializer)var1[1].getValue(), (KSerializer)var1[2].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 33278885009343L;
long var5 = var3 ^ 127831726066036L;
this.m(var5, encoder, (m)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 44465828110328L;
long var4 = var2 ^ 116328760026425L;
return this.D(decoder, var4);
}

static {
long var9 = a ^ 96052334952183L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[7];
int var5 = 0;
String var4 = "Gªãr½ü\u0087´¬ T\u001d3ÎÃ£ÊS\u0097ô±wÞi\u0010¸ë\u0007ýR41É\u001b¿\u0010\u0015<\u001bê\u0089 -\u0002\u008e=Z`\u0090¨¥\u009c¬ÃV\u008dç®\fÕTà+^ûÅA~y\u0001«üM¬ \u0094\u009c\u001d×È=\u0013ýf|§\u001a\",\u009dµ¯æd X\u0083Ç¼\u0092\u009aØègð0\u001c\u0018\u0016Ï\u001e\n2Ø{l;\u0087ú°EðõÃ¸0â@ªÉ[S";
int var6 = "Gªãr½ü\u0087´¬ T\u001d3ÎÃ£ÊS\u0097ô±wÞi\u0010¸ë\u0007ýR41É\u001b¿\u0010\u0015<\u001bê\u0089 -\u0002\u008e=Z`\u0090¨¥\u009c¬ÃV\u008dç®\fÕTà+^ûÅA~y\u0001«üM¬ \u0094\u009c\u001d×È=\u0013ýf|§\u001a\",\u009dµ¯æd X\u0083Ç¼\u0092\u009aØègð0\u001c\u0018\u0016Ï\u001e\n2Ø{l;\u0087ú°EðõÃ¸0â@ªÉ[S"
.length();
char var3 = 24;
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
d = new String[7];
c = new ow();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"w">(17772, 8720992902962102044L ^ var9), c, 3);
var11.addElement(a<"w">(10743, 481986723902772096L ^ var9), true);
var11.addElement(a<"w">(7985, 6454442144750626112L ^ var9), true);
var11.addElement(a<"w">(4790, 5755573587496102085L ^ var9), true);
U = var11;
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

var4 = "\u001aÒ\"¯\u0081z\fÒ#èp1yW¬l\u0010¬\f~úÏT4\u009dÊA²RãP}#";
var6 = "\u001aÒ\"¯\u0081z\fÒ#èp1yW¬l\u0010¬\f~úÏT4\u009dÊA²RãP}#".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6299;
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
throw new RuntimeException("su/catlean/ow", var10);
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
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/ow" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
