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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class we implements GeneratedSerializer {
@NotNull
public static final we i;
@NotNull
private static final SerialDescriptor K;
private static final long a = yz.a(-7504785167752595900L, -3757317680692730734L, MethodHandles.lookup().lookupClass()).a(87661859100148L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private we() {
}

public final void n(int a, int a, @NotNull Encoder encoder, int a, @NotNull pa value) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var8 = (var6 ^ 57477361767034L) >>> 8;
int var10 = (int)((var6 ^ 57477361767034L) << 56 >>> 56);
Intrinsics.checkNotNullParameter(encoder, a<"z">(20501, 4906061064361970834L ^ var6));
Intrinsics.checkNotNullParameter(value, a<"z">(3951, 860656287247848426L ^ var6));
SerialDescriptor var11 = K;
CompositeEncoder var12 = encoder.beginStructure(var11);
pa.Z(var8, value, var12, var11, (byte)var10);
var12.endStructure(var11);
}

@NotNull
public final pa O(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/we.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 65276690282506
// 00b: lxor
// 00c: dup2
// 00d: bipush 16
// 00f: lushr
// 010: lstore 4
// 012: dup2
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: pop2
// 01d: pop2
// 01e: aload 1
// 01f: sipush 19546
// 022: ldc2_w 1671866700178917287
// 025: lload 2
// 026: lxor
// 027: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/we.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02f: getstatic su/catlean/we.K Lkotlinx/serialization/descriptors/SerialDescriptor;
// 032: astore 8
// 034: ldc2_w -1422559260511463786
// 037: lload 2
// 038: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: bipush 1
// 03e: istore 9
// 040: bipush 0
// 041: istore 11
// 043: lconst_0
// 044: lstore 12
// 046: astore 7
// 048: aconst_null
// 049: astore 14
// 04b: aload 1
// 04c: aload 8
// 04e: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 053: astore 15
// 055: aload 15
// 057: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05c: aload 7
// 05e: ifnull 081
// 061: ifeq 0ab
// 064: goto 071
// 067: ldc2_w -1437843363289117476
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 15
// 073: aload 8
// 075: bipush 0
// 076: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeLongElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)J 3
// 07b: lstore 12
// 07d: iload 11
// 07f: bipush 1
// 080: ior
// 081: istore 11
// 083: aload 15
// 085: aload 8
// 087: bipush 1
// 088: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE Lkotlinx/serialization/internal/LongSerializer;
// 08b: checkcast kotlinx/serialization/DeserializationStrategy
// 08e: aload 14
// 090: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 095: checkcast java/lang/Long
// 098: astore 14
// 09a: iload 11
// 09c: bipush 2
// 09d: ior
// 09e: lload 2
// 09f: lconst_0
// 0a0: lcmp
// 0a1: ifle 0ad
// 0a4: istore 11
// 0a6: aload 7
// 0a8: ifnonnull 163
// 0ab: iload 9
// 0ad: ifeq 163
// 0b0: goto 0bd
// 0b3: ldc2_w -1437843363289117476
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: aload 15
// 0bf: aload 8
// 0c1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0c6: istore 10
// 0c8: aload 7
// 0ca: ifnull 16c
// 0cd: iload 10
// 0cf: aload 7
// 0d1: ifnull 107
// 0d4: goto 0e1
// 0d7: ldc2_w -1437843363289117476
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: tableswitch 114 -1 1 37 51 80
// 0fc: ldc2_w -1437843363289117476
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: istore 9
// 109: aload 7
// 10b: lload 2
// 10c: lconst_0
// 10d: lcmp
// 10e: iflt 128
// 111: ifnonnull 0ab
// 114: aload 15
// 116: aload 8
// 118: bipush 0
// 119: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeLongElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)J 3
// 11e: lstore 12
// 120: iload 11
// 122: bipush 1
// 123: ior
// 124: istore 11
// 126: aload 7
// 128: lload 2
// 129: lconst_0
// 12a: lcmp
// 12b: iflt 150
// 12e: ifnonnull 0ab
// 131: aload 15
// 133: aload 8
// 135: bipush 1
// 136: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE Lkotlinx/serialization/internal/LongSerializer;
// 139: checkcast kotlinx/serialization/DeserializationStrategy
// 13c: aload 14
// 13e: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 143: checkcast java/lang/Long
// 146: astore 14
// 148: iload 11
// 14a: bipush 2
// 14b: ior
// 14c: istore 11
// 14e: aload 7
// 150: ifnonnull 0ab
// 153: new kotlinx/serialization/UnknownFieldException
// 156: dup
// 157: iload 10
// 159: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 15c: lload 2
// 15d: lconst_0
// 15e: lcmp
// 15f: ifle 143
// 162: athrow
// 163: aload 15
// 165: aload 8
// 167: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 16c: new su/catlean/pa
// 16f: dup
// 170: lload 4
// 172: iload 6
// 174: i2s
// 175: iload 11
// 177: lload 12
// 179: aload 14
// 17b: aconst_null
// 17c: invokespecial su/catlean/pa.<init> (JSIJLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 17f: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return K;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 91950737475238L;
long var10001 = var3 ^ 71813391924470L;
int var5 = (int)((var3 ^ 71813391924470L) >>> 32);
int var6 = (int)((var3 ^ 71813391924470L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
this.n(var5, var6, encoder, var7, (pa)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 110921453952114L;
long var4 = var2 ^ 131804342235487L;
return this.O(decoder, var4);
}

static {
long var9 = a ^ 36305872839693L;
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
String var4 = "\u0004\u0006°\u009c\u0013Þ\u000eF\t\u0097e8ôw\u008e\t\u0010è«\u0082æ\u0087Ì\u009d\u0096 }±¥Y5@\u008a\u0010ÆÈÅd³F\u0011fëlûÙSÞÁ\u0004\u0010\u008f\u0000)U\u00982\r;¢6\n.Ê m¾";
int var6 = "\u0004\u0006°\u009c\u0013Þ\u000eF\t\u0097e8ôw\u008e\t\u0010è«\u0082æ\u0087Ì\u009d\u0096 }±¥Y5@\u008a\u0010ÆÈÅd³F\u0011fëlûÙSÞÁ\u0004\u0010\u008f\u0000)U\u00982\r;¢6\n.Ê m¾"
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
i = new we();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"z">(16347, 1915281580213419521L ^ var9), i, 2);
var11.addElement(a<"z">(30450, 2944585376706459437L ^ var9), false);
var11.addElement(a<"z">(8215, 5175072325477605834L ^ var9), true);
K = var11;
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

var4 = "ËþLVìÁn»rk\\s\u0010\u009cL» Ñ\u0016B6kjøk\u001f½\u001aVjò¡\u008eÿ_\u0082\u0097\u0014'¾~Icg\u0098§èÔi";
var6 = "ËþLVìÁn»rk\\s\u0010\u009cL» Ñ\u0016B6kjøk\u001f½\u001aVjò¡\u008eÿ_\u0082\u0097\u0014'¾~Icg\u0098§èÔi".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9940;
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
throw new RuntimeException("su/catlean/we", var10);
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
throw new RuntimeException("su/catlean/we" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
