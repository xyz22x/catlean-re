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
public final class zc implements GeneratedSerializer {
@NotNull
public static final zc y;
@NotNull
private static final SerialDescriptor m;
private static final long a = yz.a(-2463412172762261032L, 3420083969172123640L, MethodHandles.lookup().lookupClass()).a(186358358752169L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private zc() {
}

public final void q(long a, @NotNull Encoder encoder, @NotNull ip value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"f">(2163, 8618672365717036089L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"f">(30342, 4832641958326395594L ^ ax));
SerialDescriptor var5 = m;
CompositeEncoder var6 = encoder.beginStructure(var5);
ip.S(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final ip q(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zc.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 131349001482913
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 3
// 010: sipush 10576
// 013: ldc2_w 5257019752341799196
// 016: lload 1
// 017: lxor
// 018: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/zc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: getstatic su/catlean/zc.m Lkotlinx/serialization/descriptors/SerialDescriptor;
// 023: astore 7
// 025: bipush 1
// 026: istore 8
// 028: bipush 0
// 029: istore 10
// 02b: ldc2_w -4073584090040059463
// 02e: lload 1
// 02f: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: aconst_null
// 035: astore 11
// 037: aload 3
// 038: aload 7
// 03a: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 03f: astore 12
// 041: invokestatic su/catlean/ip.i ()[Lkotlin/Lazy;
// 044: astore 13
// 046: astore 6
// 048: aload 12
// 04a: aload 6
// 04c: ifnonnull 089
// 04f: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 054: ifeq 0b9
// 057: goto 064
// 05a: ldc2_w -4097026581715155289
// 05d: lload 1
// 05e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: athrow
// 064: aload 12
// 066: aload 7
// 068: bipush 0
// 069: aload 13
// 06b: bipush 0
// 06c: aaload
// 06d: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 072: checkcast kotlinx/serialization/DeserializationStrategy
// 075: aload 11
// 077: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 07c: goto 089
// 07f: ldc2_w -4097026581715155289
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: checkcast java/util/List
// 08c: astore 11
// 08e: iload 10
// 090: bipush 1
// 091: ior
// 092: istore 10
// 094: lload 1
// 095: lconst_0
// 096: lcmp
// 097: iflt 0ac
// 09a: aload 6
// 09c: ifnull 148
// 09f: bipush 3
// 0a0: anewarray 215
// 0a3: ldc2_w -4059809683779170923
// 0a6: lload 1
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: goto 0b9
// 0af: ldc2_w -4097026581715155289
// 0b2: lload 1
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: iload 8
// 0bb: ifeq 148
// 0be: aload 12
// 0c0: aload 7
// 0c2: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0c7: istore 9
// 0c9: aload 6
// 0cb: ifnonnull 151
// 0ce: iload 9
// 0d0: aload 6
// 0d2: ifnonnull 103
// 0d5: goto 0e2
// 0d8: ldc2_w -4097026581715155289
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: tableswitch 86 -1 0 32 46
// 0f8: ldc2_w -4097026581715155289
// 0fb: lload 1
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: bipush 0
// 103: istore 8
// 105: aload 6
// 107: lload 1
// 108: lconst_0
// 109: lcmp
// 10a: ifle 135
// 10d: ifnull 0b9
// 110: aload 12
// 112: aload 7
// 114: bipush 0
// 115: aload 13
// 117: bipush 0
// 118: aaload
// 119: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 11e: checkcast kotlinx/serialization/DeserializationStrategy
// 121: aload 11
// 123: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 128: checkcast java/util/List
// 12b: astore 11
// 12d: iload 10
// 12f: bipush 1
// 130: ior
// 131: istore 10
// 133: aload 6
// 135: ifnull 0b9
// 138: new kotlinx/serialization/UnknownFieldException
// 13b: dup
// 13c: iload 9
// 13e: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 141: lload 1
// 142: lconst_0
// 143: lcmp
// 144: ifle 128
// 147: athrow
// 148: aload 12
// 14a: aload 7
// 14c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 151: new su/catlean/ip
// 154: dup
// 155: iload 10
// 157: lload 4
// 159: aload 11
// 15b: aconst_null
// 15c: invokespecial su/catlean/ip.<init> (IJLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 15f: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return m;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = ip.i();
return new KSerializer[]{(KSerializer)var1[0].getValue()};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 30233011824697L;
long var5 = var3 ^ 110557119697585L;
this.q(var5, encoder, (ip)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 116540498939472L;
long var4 = var2 ^ 131273478719711L;
return this.q(var4, decoder);
}

static {
long var9 = a ^ 99391639478728L;
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
String var4 = "E\u0007}´\u000eùZ@*ë\u0004¤Å½ó@W\u000b¸ÒÞ5Q\u0083¬'a:\rÿYb\u0010çG|\u0081\u0090ümèÝ:ÙY\u009dóäè\u0010\u0007\u001eîF|¿ã\u009c\u0012\u007f³9\u009bVÛ\u001c";
int var6 = "E\u0007}´\u000eùZ@*ë\u0004¤Å½ó@W\u000b¸ÒÞ5Q\u0083¬'a:\rÿYb\u0010çG|\u0081\u0090ümèÝ:ÙY\u009dóäè\u0010\u0007\u001eîF|¿ã\u009c\u0012\u007f³9\u009bVÛ\u001c"
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
c = new String[5];
y = new zc();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"f">(9908, 2800470474225120513L ^ var9), y, 1);
var11.addElement(a<"f">(3492, 3508074317092707856L ^ var9), false);
m = var11;
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

var4 = "5ì6}þ\u000fSq8Ç¾\u0004«IÜ\u001a\u0010*Ø¦£\u0013¨êÐ\u0019ê\u0018\u0082\u0084OYü";
var6 = "5ì6}þ\u000fSq8Ç¾\u0004«IÜ\u001a\u0010*Ø¦£\u0013¨êÐ\u0019ê\u0018\u0082\u0084OYü".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28352;
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
throw new RuntimeException("su/catlean/zc", var10);
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
throw new RuntimeException("su/catlean/zc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
