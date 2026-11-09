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
public final class o1 implements GeneratedSerializer {
@NotNull
public static final o1 J;
@NotNull
private static final SerialDescriptor H;
private static final long a = yz.a(-7612119032143918667L, 4553587271965421570L, MethodHandles.lookup().lookupClass()).a(220559094809913L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private o1() {
}

public final void J(long a, @NotNull Encoder encoder, @NotNull jn value) {
ax = a ^ ax;
long var5 = ax ^ 103152457771416L;
Intrinsics.checkNotNullParameter(encoder, a<"e">(2188, 1012626146684427938L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"e">(7229, 5335010083272641041L ^ ax));
SerialDescriptor var7 = H;
CompositeEncoder var8 = encoder.beginStructure(var7);
jn.P(value, var8, var5, var7);
var8.endStructure(var7);
}

@NotNull
public final jn F(@NotNull Decoder decoder, int a, char a, int a) {
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
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/o1.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 6835109878511
// 024: lxor
// 025: dup2
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 7
// 02c: dup2
// 02d: bipush 16
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 8
// 036: dup2
// 037: bipush 48
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 9
// 040: pop2
// 041: pop2
// 042: aload 1
// 043: sipush 11014
// 046: ldc2_w 8584284519554596634
// 049: lload 5
// 04b: lxor
// 04c: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/o1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 054: getstatic su/catlean/o1.H Lkotlinx/serialization/descriptors/SerialDescriptor;
// 057: astore 11
// 059: bipush 1
// 05a: istore 12
// 05c: ldc2_w -7470241937056735588
// 05f: lload 5
// 061: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: bipush 0
// 067: istore 14
// 069: aconst_null
// 06a: astore 15
// 06c: aconst_null
// 06d: astore 16
// 06f: astore 10
// 071: aload 1
// 072: aload 11
// 074: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 079: astore 17
// 07b: invokestatic su/catlean/jn.K ()[Lkotlin/Lazy;
// 07e: astore 18
// 080: aload 17
// 082: aload 10
// 084: ifnull 0ad
// 087: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 08c: ifeq 0e9
// 08f: goto 09d
// 092: ldc2_w -7440446416480886995
// 095: lload 5
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 17
// 09f: goto 0ad
// 0a2: ldc2_w -7440446416480886995
// 0a5: lload 5
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: aload 11
// 0af: bipush 0
// 0b0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0b5: astore 15
// 0b7: iload 14
// 0b9: bipush 1
// 0ba: ior
// 0bb: istore 14
// 0bd: aload 17
// 0bf: aload 11
// 0c1: bipush 1
// 0c2: aload 18
// 0c4: bipush 1
// 0c5: aaload
// 0c6: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 0cb: checkcast kotlinx/serialization/DeserializationStrategy
// 0ce: aload 16
// 0d0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0d5: checkcast java/util/List
// 0d8: astore 16
// 0da: iload 14
// 0dc: bipush 2
// 0dd: ior
// 0de: iload 2
// 0df: ifle 0eb
// 0e2: istore 14
// 0e4: aload 10
// 0e6: ifnonnull 1a5
// 0e9: iload 12
// 0eb: ifeq 1a5
// 0ee: goto 0fc
// 0f1: ldc2_w -7440446416480886995
// 0f4: lload 5
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: aload 17
// 0fe: aload 11
// 100: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 105: istore 13
// 107: aload 10
// 109: ifnull 1ae
// 10c: iload 13
// 10e: aload 10
// 110: ifnull 148
// 113: goto 121
// 116: ldc2_w -7440446416480886995
// 119: lload 5
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: tableswitch 118 -1 1 38 50 78
// 13c: ldc2_w -7440446416480886995
// 13f: lload 5
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: bipush 0
// 148: istore 12
// 14a: aload 10
// 14c: iload 3
// 14d: iflt 167
// 150: ifnonnull 0e9
// 153: aload 17
// 155: aload 11
// 157: bipush 0
// 158: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 15d: astore 15
// 15f: iload 14
// 161: bipush 1
// 162: ior
// 163: istore 14
// 165: aload 10
// 167: iload 4
// 169: iflt 194
// 16c: ifnonnull 0e9
// 16f: aload 17
// 171: aload 11
// 173: bipush 1
// 174: aload 18
// 176: bipush 1
// 177: aaload
// 178: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 17d: checkcast kotlinx/serialization/DeserializationStrategy
// 180: aload 16
// 182: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 187: checkcast java/util/List
// 18a: astore 16
// 18c: iload 14
// 18e: bipush 2
// 18f: ior
// 190: istore 14
// 192: aload 10
// 194: ifnonnull 0e9
// 197: new kotlinx/serialization/UnknownFieldException
// 19a: dup
// 19b: iload 13
// 19d: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 1a0: iload 2
// 1a1: iflt 187
// 1a4: athrow
// 1a5: aload 17
// 1a7: aload 11
// 1a9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 1ae: new su/catlean/jn
// 1b1: dup
// 1b2: iload 14
// 1b4: aload 15
// 1b6: iload 7
// 1b8: i2c
// 1b9: aload 16
// 1bb: aconst_null
// 1bc: iload 8
// 1be: iload 9
// 1c0: i2c
// 1c1: invokespecial su/catlean/jn.<init> (ILjava/lang/String;CLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;IC)V
// 1c4: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return H;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = jn.K();
return new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 101831373987932L;
long var5 = var3 ^ 77591383538505L;
this.J(var5, encoder, (jn)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 140303823999071L;
long var10001 = var2 ^ 118613261650300L;
int var4 = (int)((var2 ^ 118613261650300L) >>> 32);
int var5 = (int)((var2 ^ 118613261650300L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
return this.F(decoder, var4, (char)var5, var6);
}

static {
long var9 = a ^ 77984986781066L;
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
String var4 = "ô|4Pk|\u001cñc)\u0084¹\u009a´ù\u0004vË6\u008eK§Í õèì \bôÕ\u0081\u0010ÉZ\u001e½ÐYü\u000fâ\u009a3\u001eñ¤j±\u0010jì0RD#_°\u0006k\u0005\u0012}Þ÷Ö\u0010îZJî\u0000|õE\u0096\u009b°\u0018Úk\u0091\n";
int var6 = "ô|4Pk|\u001cñc)\u0084¹\u009a´ù\u0004vË6\u008eK§Í õèì \bôÕ\u0081\u0010ÉZ\u001e½ÐYü\u000fâ\u009a3\u001eñ¤j±\u0010jì0RD#_°\u0006k\u0005\u0012}Þ÷Ö\u0010îZJî\u0000|õE\u0096\u009b°\u0018Úk\u0091\n"
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
J = new o1();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"e">(9565, 2827523657798294122L ^ var9), J, 2);
var11.addElement(a<"e">(8044, 5302751213280698457L ^ var9), false);
var11.addElement(a<"e">(20363, 9179619271050391736L ^ var9), true);
H = var11;
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

var4 = "oI·\u0004[ {\u0087\u0098hf/¦§Kê\u0010HôõÊ×Ã-O¹ght®ð~\u009c";
var6 = "oI·\u0004[ {\u0087\u0098hf/¦§Kê\u0010HôõÊ×Ã-O¹ght®ð~\u009c".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3386;
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
throw new RuntimeException("su/catlean/o1", var10);
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
throw new RuntimeException("su/catlean/o1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
