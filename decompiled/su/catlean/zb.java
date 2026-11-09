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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class zb implements GeneratedSerializer {
@NotNull
public static final zb K;
@NotNull
private static final SerialDescriptor u;
private static final long a = yz.a(9073740647604714359L, -3812309502717393823L, MethodHandles.lookup().lookupClass()).a(281433894883512L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private zb() {
}

public final void x(@NotNull Encoder encoder, @NotNull y9 value, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"j">(29199, 93394127478393918L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"j">(21256, 1647195272005659962L ^ ax));
SerialDescriptor var5 = u;
CompositeEncoder var6 = encoder.beginStructure(var5);
y9.j(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final y9 U(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zb.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 124699559975181
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 12820
// 013: ldc2_w 9160883629281514140
// 016: lload 2
// 017: lxor
// 018: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/zb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w -2426556431989050251
// 023: lload 2
// 024: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/zb.u Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: astore 6
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
// 049: aload 14
// 04b: aload 6
// 04d: ifnonnull 084
// 050: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 055: ifeq 0d4
// 058: goto 065
// 05b: ldc2_w -2405160925705429763
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: aload 14
// 067: aload 7
// 069: bipush 0
// 06a: getstatic su/catlean/fn.k Lsu/catlean/fn;
// 06d: checkcast kotlinx/serialization/DeserializationStrategy
// 070: aload 11
// 072: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 077: goto 084
// 07a: ldc2_w -2405160925705429763
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: checkcast su/catlean/f0
// 087: astore 11
// 089: iload 10
// 08b: bipush 1
// 08c: ior
// 08d: istore 10
// 08f: aload 14
// 091: aload 7
// 093: bipush 1
// 094: getstatic kotlinx/serialization/internal/IntSerializer.INSTANCE Lkotlinx/serialization/internal/IntSerializer;
// 097: checkcast kotlinx/serialization/DeserializationStrategy
// 09a: aload 12
// 09c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0a1: checkcast java/lang/Integer
// 0a4: astore 12
// 0a6: iload 10
// 0a8: bipush 2
// 0a9: ior
// 0aa: istore 10
// 0ac: aload 14
// 0ae: aload 7
// 0b0: bipush 2
// 0b1: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 0b4: checkcast kotlinx/serialization/DeserializationStrategy
// 0b7: aload 13
// 0b9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0be: checkcast java/lang/String
// 0c1: astore 13
// 0c3: iload 10
// 0c5: bipush 4
// 0c6: ior
// 0c7: lload 2
// 0c8: lconst_0
// 0c9: lcmp
// 0ca: iflt 0d6
// 0cd: istore 10
// 0cf: aload 6
// 0d1: ifnull 1ca
// 0d4: iload 8
// 0d6: ifeq 1ca
// 0d9: goto 0e6
// 0dc: ldc2_w -2405160925705429763
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: aload 14
// 0e8: aload 7
// 0ea: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0ef: istore 9
// 0f1: lload 2
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: iflt 1d3
// 0f7: aload 6
// 0f9: ifnonnull 1d3
// 0fc: iload 9
// 0fe: aload 6
// 100: ifnonnull 13b
// 103: goto 110
// 106: ldc2_w -2405160925705429763
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: tableswitch 170 -1 2 42 56 96 136
// 130: ldc2_w -2405160925705429763
// 133: lload 2
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: bipush 0
// 13b: istore 8
// 13d: aload 6
// 13f: lload 2
// 140: lconst_0
// 141: lcmp
// 142: ifle 167
// 145: ifnull 0d4
// 148: aload 14
// 14a: aload 7
// 14c: bipush 0
// 14d: getstatic su/catlean/fn.k Lsu/catlean/fn;
// 150: checkcast kotlinx/serialization/DeserializationStrategy
// 153: aload 11
// 155: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 15a: checkcast su/catlean/f0
// 15d: astore 11
// 15f: iload 10
// 161: bipush 1
// 162: ior
// 163: istore 10
// 165: aload 6
// 167: lload 2
// 168: lconst_0
// 169: lcmp
// 16a: ifle 18f
// 16d: ifnull 0d4
// 170: aload 14
// 172: aload 7
// 174: bipush 1
// 175: getstatic kotlinx/serialization/internal/IntSerializer.INSTANCE Lkotlinx/serialization/internal/IntSerializer;
// 178: checkcast kotlinx/serialization/DeserializationStrategy
// 17b: aload 12
// 17d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 182: checkcast java/lang/Integer
// 185: astore 12
// 187: iload 10
// 189: bipush 2
// 18a: ior
// 18b: istore 10
// 18d: aload 6
// 18f: lload 2
// 190: lconst_0
// 191: lcmp
// 192: ifle 1b7
// 195: ifnull 0d4
// 198: aload 14
// 19a: aload 7
// 19c: bipush 2
// 19d: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 1a0: checkcast kotlinx/serialization/DeserializationStrategy
// 1a3: aload 13
// 1a5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1aa: checkcast java/lang/String
// 1ad: astore 13
// 1af: iload 10
// 1b1: bipush 4
// 1b2: ior
// 1b3: istore 10
// 1b5: aload 6
// 1b7: ifnull 0d4
// 1ba: new kotlinx/serialization/UnknownFieldException
// 1bd: dup
// 1be: iload 9
// 1c0: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 1c3: lload 2
// 1c4: lconst_0
// 1c5: lcmp
// 1c6: iflt 15a
// 1c9: athrow
// 1ca: aload 14
// 1cc: aload 7
// 1ce: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 1d3: new su/catlean/y9
// 1d6: dup
// 1d7: iload 10
// 1d9: aload 11
// 1db: aload 12
// 1dd: aload 13
// 1df: aconst_null
// 1e0: lload 4
// 1e2: invokespecial su/catlean/y9.<init> (ILsu/catlean/f0;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;J)V
// 1e5: lload 2
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: iflt 204
// 1eb: ldc2_w -2419371462025559811
// 1ee: lload 2
// 1ef: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: ifnull 211
// 1f7: bipush 4
// 1f8: anewarray 6
// 1fb: ldc2_w -2430053118359090712
// 1fe: lload 2
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: goto 211
// 207: ldc2_w -2405160925705429763
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return u;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{
BuiltinSerializersKt.getNullable(fn.k), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)
};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 96332438318521L;
long var5 = var3 ^ 89285571324991L;
this.x(encoder, (y9)value, var5);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 139651132950864L;
long var4 = var2 ^ 76698482693741L;
return this.U(decoder, var4);
}

static {
long var9 = a ^ 90153939314485L;
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
String var4 = "Í\u009c\u008b:@r\u009cfW¶\u008a\u008f*B½í\u0010â\u0012xâ/Ö4«ÚS`A^\u0088b\u0091\u0010A{7*·[Êßç÷å:êþÁY\u0010\u0016Ä\n¤B[\u0012÷\u0092\u008dÙ>iã8ð\u0010\u008aí\u001dÚ\u009aÝ!\\Ñ\u0080\fûç²\u001b®";
int var6 = "Í\u009c\u008b:@r\u009cfW¶\u008a\u008f*B½í\u0010â\u0012xâ/Ö4«ÚS`A^\u0088b\u0091\u0010A{7*·[Êßç÷å:êþÁY\u0010\u0016Ä\n¤B[\u0012÷\u0092\u008dÙ>iã8ð\u0010\u008aí\u001dÚ\u009aÝ!\\Ñ\u0080\fûç²\u001b®"
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
c = new String[7];
K = new zb();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"j">(11599, 8766329613526651372L ^ var9), K, 3);
var11.addElement(a<"j">(17083, 3510338686045634076L ^ var9), false);
var11.addElement(a<"j">(21024, 8011206735478533762L ^ var9), false);
var11.addElement(a<"j">(2070, 6695604281007240374L ^ var9), false);
u = var11;
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

var4 = "E¬oq\u0000W\u0016<È\"ì »Êà8\u000eû(H<ÿ\u000171c28\u001côz¸\u0010üü\u001c\u0089\u00884\u0001\u001a½\u001a+\u0011?â\u000f0";
var6 = "E¬oq\u0000W\u0016<È\"ì »Êà8\u000eû(H<ÿ\u000171c28\u001côz¸\u0010üü\u001c\u0089\u00884\u0001\u001a½\u001a+\u0011?â\u000f0".length();
var3 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32695;
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
throw new RuntimeException("su/catlean/zb", var10);
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
throw new RuntimeException("su/catlean/zb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
