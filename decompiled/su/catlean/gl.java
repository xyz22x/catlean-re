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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class gl implements GeneratedSerializer {
@NotNull
public static final gl C;
@NotNull
private static final SerialDescriptor J;
private static final long a = yz.a(5201323990429553805L, -744405977627872805L, MethodHandles.lookup().lookupClass()).a(104200104134611L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private gl() {
}

public final void r(@NotNull Encoder encoder, @NotNull mh value, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"q">(11740, 8317020169036755585L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"q">(11526, 4970285229241201241L ^ ax));
SerialDescriptor var5 = J;
CompositeEncoder var6 = encoder.beginStructure(var5);
mh.c(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final mh L(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/gl.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 112940139987094
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 8249458107471290122
// 012: lload 2
// 013: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 2861
// 01c: ldc2_w 6418047809999135958
// 01f: lload 2
// 020: lxor
// 021: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/gl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: getstatic su/catlean/gl.J Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: astore 6
// 033: bipush 0
// 034: istore 10
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: aload 1
// 03d: aload 7
// 03f: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 044: astore 13
// 046: invokestatic su/catlean/mh.z ()[Lkotlin/Lazy;
// 049: astore 14
// 04b: aload 13
// 04d: aload 6
// 04f: ifnull 076
// 052: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 057: ifeq 0ce
// 05a: goto 067
// 05d: ldc2_w 8257253277640641832
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 13
// 069: goto 076
// 06c: ldc2_w 8257253277640641832
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: aload 7
// 078: bipush 0
// 079: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 07e: astore 11
// 080: iload 10
// 082: bipush 1
// 083: ior
// 084: istore 10
// 086: aload 13
// 088: aload 7
// 08a: bipush 1
// 08b: aload 14
// 08d: bipush 1
// 08e: aaload
// 08f: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 094: checkcast kotlinx/serialization/DeserializationStrategy
// 097: aload 12
// 099: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 09e: checkcast java/util/Map
// 0a1: astore 12
// 0a3: iload 10
// 0a5: bipush 2
// 0a6: ior
// 0a7: istore 10
// 0a9: lload 2
// 0aa: lconst_0
// 0ab: lcmp
// 0ac: iflt 0c1
// 0af: aload 6
// 0b1: ifnonnull 17d
// 0b4: bipush 4
// 0b5: anewarray 222
// 0b8: ldc2_w 8222684654928951329
// 0bb: lload 2
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: goto 0ce
// 0c4: ldc2_w 8257253277640641832
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: iload 8
// 0d0: ifeq 17d
// 0d3: aload 13
// 0d5: aload 7
// 0d7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0dc: istore 9
// 0de: aload 6
// 0e0: ifnull 186
// 0e3: iload 9
// 0e5: aload 6
// 0e7: ifnull 11b
// 0ea: goto 0f7
// 0ed: ldc2_w 8257253277640641832
// 0f0: lload 2
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: tableswitch 118 -1 1 35 49 78
// 110: ldc2_w 8257253277640641832
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: bipush 0
// 11b: istore 8
// 11d: aload 6
// 11f: lload 2
// 120: lconst_0
// 121: lcmp
// 122: iflt 13c
// 125: ifnonnull 0ce
// 128: aload 13
// 12a: aload 7
// 12c: bipush 0
// 12d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 132: astore 11
// 134: iload 10
// 136: bipush 1
// 137: ior
// 138: istore 10
// 13a: aload 6
// 13c: lload 2
// 13d: lconst_0
// 13e: lcmp
// 13f: iflt 16a
// 142: ifnonnull 0ce
// 145: aload 13
// 147: aload 7
// 149: bipush 1
// 14a: aload 14
// 14c: bipush 1
// 14d: aaload
// 14e: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 153: checkcast kotlinx/serialization/DeserializationStrategy
// 156: aload 12
// 158: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 15d: checkcast java/util/Map
// 160: astore 12
// 162: iload 10
// 164: bipush 2
// 165: ior
// 166: istore 10
// 168: aload 6
// 16a: ifnonnull 0ce
// 16d: new kotlinx/serialization/UnknownFieldException
// 170: dup
// 171: iload 9
// 173: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 176: lload 2
// 177: lconst_0
// 178: lcmp
// 179: ifle 15d
// 17c: athrow
// 17d: aload 13
// 17f: aload 7
// 181: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 186: new su/catlean/mh
// 189: dup
// 18a: lload 4
// 18c: iload 10
// 18e: aload 11
// 190: aload 12
// 192: aconst_null
// 193: invokespecial su/catlean/mh.<init> (JILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 196: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return J;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = mh.z();
return new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 102368815445204L;
long var5 = var3 ^ 21642910480205L;
this.r(encoder, (mh)value, var5);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 103551905930287L;
long var4 = var2 ^ 52839694266132L;
return this.L(decoder, var4);
}

static {
long var9 = a ^ 118272731210857L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[6];
int var5 = 0;
String var4 = "ÛüAnfä)Åy\u0087j#ÅdeÃ\u0018GåêÊ*ßOFø}ém\u0097\u008d\u0097h¿\nq)Óò)¸\u0010\u0094[ê±-\u00851oâßåøñ½=\u0092\u0010ò¹ô\u009bÌ\u0085&]s\u001f\u0095\u008eàïý:";
int var6 = "ÛüAnfä)Åy\u0087j#ÅdeÃ\u0018GåêÊ*ßOFø}ém\u0097\u008d\u0097h¿\nq)Óò)¸\u0010\u0094[ê±-\u00851oâßåøñ½=\u0092\u0010ò¹ô\u009bÌ\u0085&]s\u001f\u0095\u008eàïý:"
.length();
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
c = new String[6];
C = new gl();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"q">(25530, 2728035389657955304L ^ var9), C, 2);
var11.addElement(a<"q">(3849, 5536575237070116703L ^ var9), false);
var11.addElement(a<"q">(8884, 6716015451740895972L ^ var9), false);
J = var11;
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

var4 = "\u008eN×³\u0011y\u0004ß\u008e\u0007`rªÉ\u0016{\u0010´Öe`=Q\u0007e\u0088Y\u0085óÄü\u0012=";
var6 = "\u008eN×³\u0011y\u0004ß\u008e\u0007`rªÉ\u0016{\u0010´Öe`=Q\u0007e\u0088Y\u0085óÄü\u0012=".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7364;
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
throw new RuntimeException("su/catlean/gl", var10);
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
throw new RuntimeException("su/catlean/gl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
