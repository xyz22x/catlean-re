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
public final class _l implements GeneratedSerializer {
@NotNull
public static final _l X;
@NotNull
private static final SerialDescriptor n;
private static final long a = yz.a(-622948480890690237L, -3441731842332842277L, MethodHandles.lookup().lookupClass()).a(235108308370038L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private _l() {
}

public final void H(long a, @NotNull Encoder encoder, @NotNull po value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"o">(17809, 2355609217018645676L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"o">(20776, 127588378868340759L ^ ax));
SerialDescriptor var5 = n;
CompositeEncoder var6 = encoder.beginStructure(var5);
po.l(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final po x(@NotNull Decoder decoder, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
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
// 00e: getstatic su/catlean/_l.a J
// 011: lxor
// 012: lstore 4
// 014: lload 4
// 016: dup2
// 017: ldc2_w 140099985614472
// 01a: lxor
// 01b: lstore 6
// 01d: pop2
// 01e: ldc2_w -5229492510767255131
// 021: lload 4
// 023: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: aload 1
// 029: sipush 17194
// 02c: ldc2_w 725675959400240101
// 02f: lload 4
// 031: lxor
// 032: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/_l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: getstatic su/catlean/_l.n Lkotlinx/serialization/descriptors/SerialDescriptor;
// 03d: astore 9
// 03f: astore 8
// 041: bipush 1
// 042: istore 10
// 044: bipush 0
// 045: istore 12
// 047: aconst_null
// 048: astore 13
// 04a: aload 1
// 04b: aload 9
// 04d: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 052: astore 14
// 054: invokestatic su/catlean/po.i ()[Lkotlin/Lazy;
// 057: astore 15
// 059: aload 14
// 05b: aload 8
// 05d: ifnull 09c
// 060: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 065: ifeq 0b0
// 068: goto 076
// 06b: ldc2_w -5205870419383539838
// 06e: lload 4
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: aload 14
// 078: aload 9
// 07a: bipush 0
// 07b: aload 15
// 07d: bipush 0
// 07e: aaload
// 07f: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 084: checkcast kotlinx/serialization/DeserializationStrategy
// 087: aload 13
// 089: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 08e: goto 09c
// 091: ldc2_w -5205870419383539838
// 094: lload 4
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: checkcast java/util/List
// 09f: astore 13
// 0a1: iload 12
// 0a3: bipush 1
// 0a4: ior
// 0a5: iload 3
// 0a6: ifgt 0b2
// 0a9: istore 12
// 0ab: aload 8
// 0ad: ifnonnull 14d
// 0b0: iload 10
// 0b2: ifeq 14d
// 0b5: goto 0c3
// 0b8: ldc2_w -5205870419383539838
// 0bb: lload 4
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: aload 14
// 0c5: aload 9
// 0c7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0cc: istore 11
// 0ce: aload 8
// 0d0: ifnull 156
// 0d3: iload 11
// 0d5: aload 8
// 0d7: ifnull 10c
// 0da: goto 0e8
// 0dd: ldc2_w -5205870419383539838
// 0e0: lload 4
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: tableswitch 87 -1 0 35 47
// 100: ldc2_w -5205870419383539838
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 0
// 10c: istore 10
// 10e: aload 8
// 110: iload 2
// 111: iflt 13c
// 114: ifnonnull 0b0
// 117: aload 14
// 119: aload 9
// 11b: bipush 0
// 11c: aload 15
// 11e: bipush 0
// 11f: aaload
// 120: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 125: checkcast kotlinx/serialization/DeserializationStrategy
// 128: aload 13
// 12a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 12f: checkcast java/util/List
// 132: astore 13
// 134: iload 12
// 136: bipush 1
// 137: ior
// 138: istore 12
// 13a: aload 8
// 13c: ifnonnull 0b0
// 13f: new kotlinx/serialization/UnknownFieldException
// 142: dup
// 143: iload 11
// 145: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 148: iload 2
// 149: ifle 12f
// 14c: athrow
// 14d: aload 14
// 14f: aload 9
// 151: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 156: new su/catlean/po
// 159: dup
// 15a: lload 6
// 15c: iload 12
// 15e: aload 13
// 160: aconst_null
// 161: invokespecial su/catlean/po.<init> (JILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 164: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return n;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = po.i();
return new KSerializer[]{(KSerializer)var1[0].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 113641973774598L;
long var5 = var3 ^ 135198557443818L;
this.H(var5, encoder, (po)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 121355570586148L;
int var4 = (int)((var2 ^ 62576445527102L) >>> 32);
int var5 = (int)((var2 ^ 62576445527102L) << 32 >>> 32);
return this.x(decoder, var4, var5);
}

static {
long var9 = a ^ 5034682334627L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "ü\u0099Ë\u0098îô\b¦\u0011,\u0000ª¨ç\u008a\u0086\u0010©ø¤·¦\u008bû\rEdZ\u008eAHÅ\u0092\u0010\u009cÃ\u008a\u0018jqÓ@4Ò\u0092ÚJÃFª";
int var6 = "ü\u0099Ë\u0098îô\b¦\u0011,\u0000ª¨ç\u008a\u0086\u0010©ø¤·¦\u008bû\rEdZ\u008eAHÅ\u0092\u0010\u009cÃ\u008a\u0018jqÓ@4Ò\u0092ÚJÃFª".length();
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
c = new String[5];
X = new _l();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"o">(4291, 4968285789393745171L ^ var9), X, 1);
var11.addElement(a<"o">(25458, 8816499947565745824L ^ var9), false);
n = var11;
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

var4 = "\u0001a\\EPv\u0099{Ù\u0081ú\u008fÝÓ3P\u0014\u008aõÞÙ[ì\u0096D)8íR,9ü\u0010D\u0001\u0003°\u0099Ã\u00adHâ8:«þÙ\u000b1";
var6 = "\u0001a\\EPv\u0099{Ù\u0081ú\u008fÝÓ3P\u0014\u008aõÞÙ[ì\u0096D)8íR,9ü\u0010D\u0001\u0003°\u0099Ã\u00adHâ8:«þÙ\u000b1".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26321;
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
throw new RuntimeException("su/catlean/_l", var10);
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
throw new RuntimeException("su/catlean/_l" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
