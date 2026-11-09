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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class k implements GeneratedSerializer {
@NotNull
public static final k Z;
@NotNull
private static final SerialDescriptor u;
private static final long a = yz.a(-76067798794993242L, -5480457992594935222L, MethodHandles.lookup().lookupClass()).a(56699145962283L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private k() {
}

public final void t(long a, @NotNull Encoder encoder, @NotNull ob value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"i">(10405, 2659277266796501819L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"i">(26172, 1307215458085115297L ^ ax));
SerialDescriptor var5 = u;
CompositeEncoder var6 = encoder.beginStructure(var5);
ob.c(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final ob N(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 105880374920636
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: pop2
// 029: ldc2_w -2618556886490570371
// 02c: lload 2
// 02d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: aload 1
// 033: sipush 8319
// 036: ldc2_w 3159454203675195880
// 039: lload 2
// 03a: lxor
// 03b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: getstatic su/catlean/k.u Lkotlinx/serialization/descriptors/SerialDescriptor;
// 046: astore 8
// 048: bipush 1
// 049: istore 9
// 04b: astore 7
// 04d: bipush 0
// 04e: istore 11
// 050: aconst_null
// 051: astore 12
// 053: aconst_null
// 054: astore 13
// 056: aload 1
// 057: aload 8
// 059: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 05e: astore 14
// 060: aload 14
// 062: aload 7
// 064: ifnull 08b
// 067: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 06c: ifeq 0b8
// 06f: goto 07c
// 072: ldc2_w -2624775821389561141
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 14
// 07e: goto 08b
// 081: ldc2_w -2624775821389561141
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 8
// 08d: bipush 0
// 08e: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 093: astore 12
// 095: iload 11
// 097: bipush 1
// 098: ior
// 099: istore 11
// 09b: aload 14
// 09d: aload 8
// 09f: bipush 1
// 0a0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0a5: astore 13
// 0a7: iload 11
// 0a9: bipush 2
// 0aa: ior
// 0ab: lload 2
// 0ac: lconst_0
// 0ad: lcmp
// 0ae: iflt 0ba
// 0b1: istore 11
// 0b3: aload 7
// 0b5: ifnonnull 164
// 0b8: iload 9
// 0ba: ifeq 164
// 0bd: goto 0ca
// 0c0: ldc2_w -2624775821389561141
// 0c3: lload 2
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: aload 14
// 0cc: aload 8
// 0ce: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0d3: istore 10
// 0d5: aload 7
// 0d7: ifnull 16d
// 0da: iload 10
// 0dc: aload 7
// 0de: ifnull 113
// 0e1: goto 0ee
// 0e4: ldc2_w -2624775821389561141
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: tableswitch 102 -1 1 36 50 79
// 108: ldc2_w -2624775821389561141
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: bipush 0
// 113: istore 9
// 115: aload 7
// 117: lload 2
// 118: lconst_0
// 119: lcmp
// 11a: ifle 134
// 11d: ifnonnull 0b8
// 120: aload 14
// 122: aload 8
// 124: bipush 0
// 125: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 12a: astore 12
// 12c: iload 11
// 12e: bipush 1
// 12f: ior
// 130: istore 11
// 132: aload 7
// 134: lload 2
// 135: lconst_0
// 136: lcmp
// 137: iflt 151
// 13a: ifnonnull 0b8
// 13d: aload 14
// 13f: aload 8
// 141: bipush 1
// 142: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 147: astore 13
// 149: iload 11
// 14b: bipush 2
// 14c: ior
// 14d: istore 11
// 14f: aload 7
// 151: ifnonnull 0b8
// 154: lload 2
// 155: lconst_0
// 156: lcmp
// 157: ifle 0d5
// 15a: new kotlinx/serialization/UnknownFieldException
// 15d: dup
// 15e: iload 10
// 160: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 163: athrow
// 164: aload 14
// 166: aload 8
// 168: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 16d: new su/catlean/ob
// 170: dup
// 171: iload 11
// 173: iload 4
// 175: iload 5
// 177: iload 6
// 179: aload 12
// 17b: aload 13
// 17d: aconst_null
// 17e: invokespecial su/catlean/ob.<init> (IIIILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 181: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return u;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 14034879420147L;
long var5 = var3 ^ 54468840498744L;
this.t(var5, encoder, (ob)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 139321300727165L;
long var4 = var2 ^ 110185948803003L;
return this.N(decoder, var4);
}

static {
long var9 = a ^ 56567542995047L;
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
String var4 = "·\rixài\u001e\u0013@ôþV°aÈò\u0010'ïÙ®±\u008b\u0003\u0012r` \u0005íáGx\u0010¼5¹F\u0015îøõ\u001e\u000b\u0006Â¦º\u0012\\ Yé\u009fÇïÏ\u0019\u001bÈ\u0005ûDä\u009b¤v¾h¡TÙÈ9Ö\u009d\u0018ø\u0099\u0082Yc(";
int var6 = "·\rixài\u001e\u0013@ôþV°aÈò\u0010'ïÙ®±\u008b\u0003\u0012r` \u0005íáGx\u0010¼5¹F\u0015îøõ\u001e\u000b\u0006Â¦º\u0012\\ Yé\u009fÇïÏ\u0019\u001bÈ\u0005ûDä\u009b¤v¾h¡TÙÈ9Ö\u009d\u0018ø\u0099\u0082Yc("
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
Z = new k();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"i">(3190, 952604375517591196L ^ var9), Z, 2);
var11.addElement(a<"i">(7412, 2639332105372919321L ^ var9), false);
var11.addElement(a<"i">(23120, 1253775542469763257L ^ var9), false);
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

var4 = "I\u007fñ\u0001£²\u0016\u0097ØÞ\u0098.5p®&\u0010.q?`\u009d\u0010\u008f\rÛLïVr¬ÈL";
var6 = "I\u007fñ\u0001£²\u0016\u0097ØÞ\u0098.5p®&\u0010.q?`\u009d\u0010\u008f\rÛLïVr¬ÈL".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17236;
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
throw new RuntimeException("su/catlean/k", var10);
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
throw new RuntimeException("su/catlean/k" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
