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
public final class g8 implements GeneratedSerializer {
@NotNull
public static final g8 d;
@NotNull
private static final SerialDescriptor g;
private static final long a = yz.a(-7605410551257863861L, 8428592646698688987L, MethodHandles.lookup().lookupClass()).a(151560740109326L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

private g8() {
}

public final void n(long a, @NotNull Encoder encoder, @NotNull y_ value) {
ax = a ^ ax;
long var10001 = ax ^ 131237064774183L;
int var5 = (int)((ax ^ 131237064774183L) >>> 32);
int var6 = (int)((ax ^ 131237064774183L) << 32 >>> 40);
int var7 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(encoder, a<"t">(2864, 6890396141799704579L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"t">(12574, 2697876842880348714L ^ ax));
SerialDescriptor var8 = g;
CompositeEncoder var9 = encoder.beginStructure(var8);
y_.h(var5, value, var6, var9, var8, (byte)var7);
var9.endStructure(var8);
}

@NotNull
public final y_ e(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/g8.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 1660515766884
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w -3178570092881930965
// 012: lload 1
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 3
// 019: sipush 14414
// 01c: ldc2_w 7615445540746025908
// 01f: lload 1
// 020: lxor
// 021: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/g8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: getstatic su/catlean/g8.g Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: aconst_null
// 035: astore 11
// 037: aconst_null
// 038: astore 12
// 03a: aload 3
// 03b: aload 7
// 03d: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 042: astore 13
// 044: astore 6
// 046: invokestatic su/catlean/y_.y ()[Lkotlin/Lazy;
// 049: astore 14
// 04b: aload 13
// 04d: aload 6
// 04f: ifnull 076
// 052: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 057: ifeq 0b4
// 05a: goto 067
// 05d: ldc2_w -3221235484742878143
// 060: lload 1
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 13
// 069: goto 076
// 06c: ldc2_w -3221235484742878143
// 06f: lload 1
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
// 09e: checkcast java/util/List
// 0a1: astore 12
// 0a3: iload 10
// 0a5: bipush 2
// 0a6: ior
// 0a7: lload 1
// 0a8: lconst_0
// 0a9: lcmp
// 0aa: iflt 0b6
// 0ad: istore 10
// 0af: aload 6
// 0b1: ifnonnull 171
// 0b4: iload 8
// 0b6: ifeq 171
// 0b9: goto 0c6
// 0bc: ldc2_w -3221235484742878143
// 0bf: lload 1
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 13
// 0c8: aload 7
// 0ca: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0cf: istore 9
// 0d1: aload 6
// 0d3: ifnull 17a
// 0d6: iload 9
// 0d8: aload 6
// 0da: ifnull 10f
// 0dd: goto 0ea
// 0e0: ldc2_w -3221235484742878143
// 0e3: lload 1
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: tableswitch 119 -1 1 36 50 79
// 104: ldc2_w -3221235484742878143
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: bipush 0
// 10f: istore 8
// 111: aload 6
// 113: lload 1
// 114: lconst_0
// 115: lcmp
// 116: iflt 130
// 119: ifnonnull 0b4
// 11c: aload 13
// 11e: aload 7
// 120: bipush 0
// 121: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 126: astore 11
// 128: iload 10
// 12a: bipush 1
// 12b: ior
// 12c: istore 10
// 12e: aload 6
// 130: lload 1
// 131: lconst_0
// 132: lcmp
// 133: ifle 15e
// 136: ifnonnull 0b4
// 139: aload 13
// 13b: aload 7
// 13d: bipush 1
// 13e: aload 14
// 140: bipush 1
// 141: aaload
// 142: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 147: checkcast kotlinx/serialization/DeserializationStrategy
// 14a: aload 12
// 14c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 151: checkcast java/util/List
// 154: astore 12
// 156: iload 10
// 158: bipush 2
// 159: ior
// 15a: istore 10
// 15c: aload 6
// 15e: ifnonnull 0b4
// 161: new kotlinx/serialization/UnknownFieldException
// 164: dup
// 165: iload 9
// 167: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 16a: lload 1
// 16b: lconst_0
// 16c: lcmp
// 16d: iflt 151
// 170: athrow
// 171: aload 13
// 173: aload 7
// 175: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 17a: new su/catlean/y_
// 17d: dup
// 17e: iload 10
// 180: aload 11
// 182: lload 4
// 184: aload 12
// 186: aconst_null
// 187: invokespecial su/catlean/y_.<init> (ILjava/lang/String;JLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 18a: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return g;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = y_.y();
return new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 76156529601097L;
long var5 = var3 ^ 46911898802197L;
this.n(var5, encoder, (y_)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 68137291616644L;
long var4 = var2 ^ 4798858576656L;
return this.e(var4, decoder);
}

static {
long var9 = a ^ 82448618657120L;
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
String var4 = "%@Y\u0015¨k¼úw\u0084Ä'\u008a[B\u0093\u0094\u001d»\u0016\u0085çÝè1\u008c\u009fl\u00865\u00170\u0010x\u001aÐg¾\u0003kvBâ\u0082ÿ#È$2\u0010Fa`cìz\u009bì5SBØ´\fëx\u0010Ú@\u0093$¤D4}õ\u00101ÐõduD";
int var6 = "%@Y\u0015¨k¼úw\u0084Ä'\u008a[B\u0093\u0094\u001d»\u0016\u0085çÝè1\u008c\u009fl\u00865\u00170\u0010x\u001aÐg¾\u0003kvBâ\u0082ÿ#È$2\u0010Fa`cìz\u009bì5SBØ´\fëx\u0010Ú@\u0093$¤D4}õ\u00101ÐõduD"
.length();
char var3 = ' ';
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
d = new g8();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"t">(8013, 8776034595769321876L ^ var9), d, 2);
var11.addElement(a<"t">(5461, 5601257496089232269L ^ var9), false);
var11.addElement(a<"t">(2611, 234088163919305961L ^ var9), true);
g = var11;
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

var4 = "q\u008a<vß_\u008f\u0089Ú#üm\u0004ªú\u0081\u0010&¸M\u009aF£Ó¤søtÖ\u0080\ry\u0010";
var6 = "q\u008a<vß_\u008f\u0089Ú#üm\u0004ªú\u0081\u0010&¸M\u009aF£Ó¤søtÖ\u0080\ry\u0010".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12650;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/g8", var10);
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
throw new RuntimeException("su/catlean/g8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
