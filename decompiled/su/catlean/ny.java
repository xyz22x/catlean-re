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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class ny implements GeneratedSerializer {
@NotNull
public static final ny M;
@NotNull
private static final SerialDescriptor f;
private static final long a = yz.a(7373484774601145551L, -3282188325311745895L, MethodHandles.lookup().lookupClass()).a(56587890445884L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private ny() {
}

public final void L(long a, @NotNull Encoder encoder, @NotNull dn value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"i">(15023, 5776989796222233238L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"i">(14008, 2196200139681851011L ^ ax));
SerialDescriptor var5 = f;
CompositeEncoder var6 = encoder.beginStructure(var5);
dn.V(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final dn P(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ny.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 102341488473241
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 3
// 010: sipush 7927
// 013: ldc2_w 8611428394189577127
// 016: lload 1
// 017: lxor
// 018: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/ny.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w 8112758993581562544
// 023: lload 1
// 024: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/ny.f Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: bipush 0
// 035: istore 11
// 037: aconst_null
// 038: astore 12
// 03a: aload 3
// 03b: aload 7
// 03d: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 042: astore 13
// 044: astore 6
// 046: aload 13
// 048: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 04d: aload 6
// 04f: ifnonnull 072
// 052: ifeq 09c
// 055: goto 062
// 058: ldc2_w 8148961521207667074
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: aload 13
// 064: aload 7
// 066: bipush 0
// 067: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 06c: istore 11
// 06e: iload 10
// 070: bipush 1
// 071: ior
// 072: istore 10
// 074: aload 13
// 076: aload 7
// 078: bipush 1
// 079: getstatic su/catlean/bd.M Lsu/catlean/bd;
// 07c: checkcast kotlinx/serialization/DeserializationStrategy
// 07f: aload 12
// 081: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 086: checkcast su/catlean/yq
// 089: astore 12
// 08b: iload 10
// 08d: bipush 2
// 08e: ior
// 08f: lload 1
// 090: lconst_0
// 091: lcmp
// 092: ifle 09e
// 095: istore 10
// 097: aload 6
// 099: ifnull 153
// 09c: iload 8
// 09e: ifeq 153
// 0a1: goto 0ae
// 0a4: ldc2_w 8148961521207667074
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 13
// 0b0: aload 7
// 0b2: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0b7: istore 9
// 0b9: aload 6
// 0bb: ifnonnull 15c
// 0be: iload 9
// 0c0: aload 6
// 0c2: ifnonnull 0f7
// 0c5: goto 0d2
// 0c8: ldc2_w 8148961521207667074
// 0cb: lload 1
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: tableswitch 113 -1 1 36 50 79
// 0ec: ldc2_w 8148961521207667074
// 0ef: lload 1
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: bipush 0
// 0f7: istore 8
// 0f9: aload 6
// 0fb: lload 1
// 0fc: lconst_0
// 0fd: lcmp
// 0fe: ifle 118
// 101: ifnull 09c
// 104: aload 13
// 106: aload 7
// 108: bipush 0
// 109: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 10e: istore 11
// 110: iload 10
// 112: bipush 1
// 113: ior
// 114: istore 10
// 116: aload 6
// 118: lload 1
// 119: lconst_0
// 11a: lcmp
// 11b: ifle 140
// 11e: ifnull 09c
// 121: aload 13
// 123: aload 7
// 125: bipush 1
// 126: getstatic su/catlean/bd.M Lsu/catlean/bd;
// 129: checkcast kotlinx/serialization/DeserializationStrategy
// 12c: aload 12
// 12e: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 133: checkcast su/catlean/yq
// 136: astore 12
// 138: iload 10
// 13a: bipush 2
// 13b: ior
// 13c: istore 10
// 13e: aload 6
// 140: ifnull 09c
// 143: new kotlinx/serialization/UnknownFieldException
// 146: dup
// 147: iload 9
// 149: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 14c: lload 1
// 14d: lconst_0
// 14e: lcmp
// 14f: iflt 133
// 152: athrow
// 153: aload 13
// 155: aload 7
// 157: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 15c: new su/catlean/dn
// 15f: dup
// 160: iload 10
// 162: iload 11
// 164: aload 12
// 166: lload 4
// 168: aconst_null
// 169: invokespecial su/catlean/dn.<init> (IILsu/catlean/yq;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 16c: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return f;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{IntSerializer.INSTANCE, bd.M};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 3416874694204L;
long var5 = var3 ^ 5925019603628L;
this.L(var5, encoder, (dn)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 33893411459449L;
long var4 = var2 ^ 79765699453057L;
return this.P(var4, decoder);
}

static {
long var9 = a ^ 71216259961742L;
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
String var4 = "i`Àd\u007fuÃp\"\u0018Y®\u008aêM\u009a\u0010ü&â\u00ad\b\u009fµy\u00884oµ1o.*\u0010Îõ-Å\u0017qK\u0099\u008dg\u001b\"Ã\u0003\u0006\r\u0010äWÉF¶fFÆþî;âé3K\u0096";
int var6 = "i`Àd\u007fuÃp\"\u0018Y®\u008aêM\u009a\u0010ü&â\u00ad\b\u009fµy\u00884oµ1o.*\u0010Îõ-Å\u0017qK\u0099\u008dg\u001b\"Ã\u0003\u0006\r\u0010äWÉF¶fFÆþî;âé3K\u0096"
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
M = new ny();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"i">(8224, 2671999462987715983L ^ var9), M, 2);
var11.addElement(a<"i">(29775, 3530653017562055141L ^ var9), false);
var11.addElement(a<"i">(2216, 3407560492944817414L ^ var9), false);
f = var11;
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

var4 = "ô?\u0016\u0016köK6^¿\"ð±\u0085ñCqß\u0089y»E\u0080\u0012 ÆìÖ\u001b9\u008cÊYÞ/®ñd%>/ÿ{¦L0ò\u008d\u008a(Ë]\u008a;\u0094Í1";
var6 = "ô?\u0016\u0016köK6^¿\"ð±\u0085ñCqß\u0089y»E\u0080\u0012 ÆìÖ\u001b9\u008cÊYÞ/®ñd%>/ÿ{¦L0ò\u008d\u008a(Ë]\u008a;\u0094Í1".length();
var3 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13483;
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
throw new RuntimeException("su/catlean/ny", var10);
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
throw new RuntimeException("su/catlean/ny" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
