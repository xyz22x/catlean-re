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
public final class wr implements GeneratedSerializer {
@NotNull
public static final wr T;
@NotNull
private static final SerialDescriptor o;
private static final long a = yz.a(-543419065803847783L, 4523165465334040761L, MethodHandles.lookup().lookupClass()).a(11719665911028L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private wr() {
}

public final void F(long a, @NotNull Encoder encoder, @NotNull f8 value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"f">(9311, 8404712255362333346L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"f">(10745, 3334138742350444295L ^ ax));
SerialDescriptor var5 = o;
CompositeEncoder var6 = encoder.beginStructure(var5);
f8.W(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final f8 b(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wr.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 49986103057063
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 3
// 010: sipush 24742
// 013: ldc2_w 3652817903033148087
// 016: lload 1
// 017: lxor
// 018: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/wr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: getstatic su/catlean/wr.o Lkotlinx/serialization/descriptors/SerialDescriptor;
// 023: astore 7
// 025: bipush 1
// 026: istore 8
// 028: bipush 0
// 029: istore 10
// 02b: ldc2_w -8291585853230995768
// 02e: lload 1
// 02f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: aconst_null
// 035: astore 11
// 037: astore 6
// 039: aconst_null
// 03a: astore 12
// 03c: aload 3
// 03d: aload 7
// 03f: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 044: astore 13
// 046: invokestatic su/catlean/f8.U ()[Lkotlin/Lazy;
// 049: astore 14
// 04b: aload 13
// 04d: aload 6
// 04f: ifnonnull 08c
// 052: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 057: ifeq 0bf
// 05a: goto 067
// 05d: ldc2_w -8352397327216412349
// 060: lload 1
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 13
// 069: aload 7
// 06b: bipush 0
// 06c: aload 14
// 06e: bipush 0
// 06f: aaload
// 070: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 075: checkcast kotlinx/serialization/DeserializationStrategy
// 078: aload 11
// 07a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 07f: goto 08c
// 082: ldc2_w -8352397327216412349
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: checkcast su/catlean/aw
// 08f: astore 11
// 091: iload 10
// 093: bipush 1
// 094: ior
// 095: istore 10
// 097: aload 13
// 099: aload 7
// 09b: bipush 1
// 09c: getstatic su/catlean/ny.M Lsu/catlean/ny;
// 09f: checkcast kotlinx/serialization/DeserializationStrategy
// 0a2: aload 12
// 0a4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0a9: checkcast su/catlean/dn
// 0ac: astore 12
// 0ae: iload 10
// 0b0: bipush 2
// 0b1: ior
// 0b2: lload 1
// 0b3: lconst_0
// 0b4: lcmp
// 0b5: iflt 0c1
// 0b8: istore 10
// 0ba: aload 6
// 0bc: ifnull 188
// 0bf: iload 8
// 0c1: ifeq 188
// 0c4: goto 0d1
// 0c7: ldc2_w -8352397327216412349
// 0ca: lload 1
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 13
// 0d3: aload 7
// 0d5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0da: istore 9
// 0dc: aload 6
// 0de: ifnonnull 191
// 0e1: iload 9
// 0e3: aload 6
// 0e5: ifnonnull 11b
// 0e8: goto 0f5
// 0eb: ldc2_w -8352397327216412349
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: tableswitch 131 -1 1 37 51 97
// 110: ldc2_w -8352397327216412349
// 113: lload 1
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: bipush 0
// 11b: istore 8
// 11d: aload 6
// 11f: lload 1
// 120: lconst_0
// 121: lcmp
// 122: iflt 14d
// 125: ifnull 0bf
// 128: aload 13
// 12a: aload 7
// 12c: bipush 0
// 12d: aload 14
// 12f: bipush 0
// 130: aaload
// 131: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 136: checkcast kotlinx/serialization/DeserializationStrategy
// 139: aload 11
// 13b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 140: checkcast su/catlean/aw
// 143: astore 11
// 145: iload 10
// 147: bipush 1
// 148: ior
// 149: istore 10
// 14b: aload 6
// 14d: lload 1
// 14e: lconst_0
// 14f: lcmp
// 150: ifle 175
// 153: ifnull 0bf
// 156: aload 13
// 158: aload 7
// 15a: bipush 1
// 15b: getstatic su/catlean/ny.M Lsu/catlean/ny;
// 15e: checkcast kotlinx/serialization/DeserializationStrategy
// 161: aload 12
// 163: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 168: checkcast su/catlean/dn
// 16b: astore 12
// 16d: iload 10
// 16f: bipush 2
// 170: ior
// 171: istore 10
// 173: aload 6
// 175: ifnull 0bf
// 178: new kotlinx/serialization/UnknownFieldException
// 17b: dup
// 17c: iload 9
// 17e: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 181: lload 1
// 182: lconst_0
// 183: lcmp
// 184: iflt 140
// 187: athrow
// 188: aload 13
// 18a: aload 7
// 18c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 191: new su/catlean/f8
// 194: dup
// 195: iload 10
// 197: lload 4
// 199: aload 11
// 19b: aload 12
// 19d: aconst_null
// 19e: invokespecial su/catlean/f8.<init> (IJLsu/catlean/aw;Lsu/catlean/dn;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 1a1: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return o;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = f8.U();
return new KSerializer[]{(KSerializer)var1[0].getValue(), ny.M};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 36090514591267L;
long var5 = var3 ^ 111003223662414L;
this.F(var5, encoder, (f8)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 10348211108084L;
long var4 = var2 ^ 86841065207156L;
return this.b(var4, decoder);
}

static {
long var9 = a ^ 107347792807755L;
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
String var4 = "Sân\u0014È\u0017E\u0016Å)yrwÂÍ5\u0010Ã.g{¼\u00867½¯£$\rí\u0014\u001e\u0091\u0010\u0004\u0087í'«y.ý]\u0005×5á/Pí\u0010î\u0096`¸\u000fp\u0015\u0089ÀL\u0097Úü³?§";
int var6 = "Sân\u0014È\u0017E\u0016Å)yrwÂÍ5\u0010Ã.g{¼\u00867½¯£$\rí\u0014\u001e\u0091\u0010\u0004\u0087í'«y.ý]\u0005×5á/Pí\u0010î\u0096`¸\u000fp\u0015\u0089ÀL\u0097Úü³?§"
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
T = new wr();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"f">(13732, 852606793101302369L ^ var9), T, 2);
var11.addElement(a<"f">(31902, 9101867996410745690L ^ var9), false);
var11.addElement(a<"f">(17479, 5682232736961801092L ^ var9), false);
o = var11;
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

var4 = " tC|Ë9ØqV0S\u0085G\u0016\u009a× ò\u0005ÃÄ\u0098>I\u0014o\u00adý\u0092=\u0091Ýu\u0085ýd0t,\u0000\u0096OÌGï\u000eKx\u009c";
var6 = " tC|Ë9ØqV0S\u0085G\u0016\u009a× ò\u0005ÃÄ\u0098>I\u0014o\u00adý\u0092=\u0091Ýu\u0085ýd0t,\u0000\u0096OÌGï\u000eKx\u009c".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3985;
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
throw new RuntimeException("su/catlean/wr", var10);
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
throw new RuntimeException("su/catlean/wr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
