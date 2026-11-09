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
public final class xd implements GeneratedSerializer {
@NotNull
public static final xd w;
@NotNull
private static final SerialDescriptor j;
private static final long a = yz.a(-5550014357837599586L, 3773883092802158321L, MethodHandles.lookup().lookupClass()).a(235013073875661L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private xd() {
}

public final void C(long a, @NotNull Encoder encoder, @NotNull js value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"p">(10779, 6928206713421060633L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"p">(23735, 4777996001522003126L ^ ax));
SerialDescriptor var5 = j;
CompositeEncoder var6 = encoder.beginStructure(var5);
js.z(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final js r(short a, @NotNull Decoder decoder, int a, short a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/xd.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 138535273546940
// 024: lxor
// 025: lstore 7
// 027: pop2
// 028: ldc2_w 5216309729800752812
// 02b: lload 5
// 02d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: aload 2
// 033: sipush 30230
// 036: ldc2_w 8117658746834559308
// 039: lload 5
// 03b: lxor
// 03c: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/xd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 044: getstatic su/catlean/xd.j Lkotlinx/serialization/descriptors/SerialDescriptor;
// 047: astore 10
// 049: bipush 1
// 04a: istore 11
// 04c: astore 9
// 04e: bipush 0
// 04f: istore 13
// 051: aconst_null
// 052: astore 14
// 054: aload 2
// 055: aload 10
// 057: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 05c: astore 15
// 05e: invokestatic su/catlean/js.E ()[Lkotlin/Lazy;
// 061: astore 16
// 063: aload 15
// 065: aload 9
// 067: ifnull 0a6
// 06a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 06f: ifeq 0ba
// 072: goto 080
// 075: ldc2_w 5209216142801596062
// 078: lload 5
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: aload 15
// 082: aload 10
// 084: bipush 0
// 085: aload 16
// 087: bipush 0
// 088: aaload
// 089: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 08e: checkcast kotlinx/serialization/DeserializationStrategy
// 091: aload 14
// 093: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 098: goto 0a6
// 09b: ldc2_w 5209216142801596062
// 09e: lload 5
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: checkcast java/util/List
// 0a9: astore 14
// 0ab: iload 13
// 0ad: bipush 1
// 0ae: ior
// 0af: iload 1
// 0b0: iflt 0bc
// 0b3: istore 13
// 0b5: aload 9
// 0b7: ifnonnull 156
// 0ba: iload 11
// 0bc: ifeq 156
// 0bf: goto 0cd
// 0c2: ldc2_w 5209216142801596062
// 0c5: lload 5
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 15
// 0cf: aload 10
// 0d1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0d6: istore 12
// 0d8: aload 9
// 0da: ifnull 15f
// 0dd: iload 12
// 0df: aload 9
// 0e1: ifnull 114
// 0e4: goto 0f2
// 0e7: ldc2_w 5209216142801596062
// 0ea: lload 5
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: tableswitch 85 -1 0 33 45
// 108: ldc2_w 5209216142801596062
// 10b: lload 5
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: bipush 0
// 114: istore 11
// 116: aload 9
// 118: iload 1
// 119: iflt 144
// 11c: ifnonnull 0ba
// 11f: aload 15
// 121: aload 10
// 123: bipush 0
// 124: aload 16
// 126: bipush 0
// 127: aaload
// 128: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 12d: checkcast kotlinx/serialization/DeserializationStrategy
// 130: aload 14
// 132: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 137: checkcast java/util/List
// 13a: astore 14
// 13c: iload 13
// 13e: bipush 1
// 13f: ior
// 140: istore 13
// 142: aload 9
// 144: ifnonnull 0ba
// 147: new kotlinx/serialization/UnknownFieldException
// 14a: dup
// 14b: iload 12
// 14d: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 150: iload 4
// 152: ifle 137
// 155: athrow
// 156: aload 15
// 158: aload 10
// 15a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 15f: new su/catlean/js
// 162: dup
// 163: iload 13
// 165: aload 14
// 167: aconst_null
// 168: lload 7
// 16a: invokespecial su/catlean/js.<init> (ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;J)V
// 16d: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return j;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = js.E();
return new KSerializer[]{(KSerializer)var1[0].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 67500595728258L;
long var5 = var3 ^ 30835929293262L;
this.C(var5, encoder, (js)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 1559684859754L;
long var10001 = var2 ^ 76512795758201L;
int var4 = (int)((var2 ^ 76512795758201L) >>> 48);
int var5 = (int)((var2 ^ 76512795758201L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
return this.r((short)var4, decoder, var5, (short)var6);
}

static {
long var9 = a ^ 113043726624416L;
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
String var4 = "\u009blè]%\u0090F¦÷ûK\rî_3¾ `\u0089´·ÑJ\u008a6k\f\u0011\u0089\u0002¢\u0092X'#\u009bieýYÞ\u008c±\u0014\u00134öü4 \u000b¤Û~Ø\u0017\u009eg8Î\u008e#Z°a\u0019½1\u008búvVh\u007f\u008e\u0004\u001a\u00892×Æ\u0088";
int var6 = "\u009blè]%\u0090F¦÷ûK\rî_3¾ `\u0089´·ÑJ\u008a6k\f\u0011\u0089\u0002¢\u0092X'#\u009bieýYÞ\u008c±\u0014\u00134öü4 \u000b¤Û~Ø\u0017\u009eg8Î\u008e#Z°a\u0019½1\u008búvVh\u007f\u008e\u0004\u001a\u00892×Æ\u0088"
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
c = new String[5];
w = new xd();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"p">(6981, 2706183770620548710L ^ var9), w, 1);
var11.addElement(a<"p">(6497, 456474260448040001L ^ var9), false);
j = var11;
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

var4 = "â\"¹\u0089\u0004V¥òÆ08ÐPuï¦\u0010\u0003»\u001cä\u0092 Ík4=Í?íÕ\tp";
var6 = "â\"¹\u0089\u0004V¥òÆ08ÐPuï¦\u0010\u0003»\u001cä\u0092 Ík4=Í?íÕ\tp".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7757;
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
throw new RuntimeException("su/catlean/xd", var10);
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
throw new RuntimeException("su/catlean/xd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
