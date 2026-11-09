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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class dd implements GeneratedSerializer {
@NotNull
public static final dd h;
@NotNull
private static final SerialDescriptor C;
private static final long a = yz.a(8684702391233035752L, 8502311137105004057L, MethodHandles.lookup().lookupClass()).a(268207149701798L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private dd() {
}

public final void a(@NotNull Encoder encoder, long a, @NotNull j9 value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"t">(26760, 1512512953227965759L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"t">(1213, 303589711904872712L ^ ax));
SerialDescriptor var5 = C;
CompositeEncoder var6 = encoder.beginStructure(var5);
j9.e(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final j9 T(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dd.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 37373140083133
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
// 029: aload 1
// 02a: sipush 8226
// 02d: ldc2_w 6379575622254305980
// 030: lload 2
// 031: lxor
// 032: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/dd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: getstatic su/catlean/dd.C Lkotlinx/serialization/descriptors/SerialDescriptor;
// 03d: astore 8
// 03f: bipush 1
// 040: istore 9
// 042: bipush 0
// 043: istore 11
// 045: bipush 0
// 046: istore 12
// 048: ldc2_w -7401289499832994961
// 04b: lload 2
// 04c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: aconst_null
// 052: astore 13
// 054: aload 1
// 055: aload 8
// 057: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 05c: astore 14
// 05e: astore 7
// 060: aload 14
// 062: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 067: aload 7
// 069: ifnonnull 08c
// 06c: ifeq 0ab
// 06f: goto 07c
// 072: ldc2_w -7374939957883789629
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 14
// 07e: aload 8
// 080: bipush 0
// 081: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 086: istore 12
// 088: iload 11
// 08a: bipush 1
// 08b: ior
// 08c: istore 11
// 08e: aload 14
// 090: aload 8
// 092: bipush 1
// 093: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 098: astore 13
// 09a: iload 11
// 09c: bipush 2
// 09d: ior
// 09e: lload 2
// 09f: lconst_0
// 0a0: lcmp
// 0a1: ifle 0ad
// 0a4: istore 11
// 0a6: aload 7
// 0a8: ifnull 158
// 0ab: iload 9
// 0ad: ifeq 158
// 0b0: goto 0bd
// 0b3: ldc2_w -7374939957883789629
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: aload 14
// 0bf: aload 8
// 0c1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0c6: istore 10
// 0c8: aload 7
// 0ca: ifnonnull 161
// 0cd: iload 10
// 0cf: aload 7
// 0d1: ifnonnull 107
// 0d4: goto 0e1
// 0d7: ldc2_w -7374939957883789629
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: tableswitch 103 -1 1 37 51 80
// 0fc: ldc2_w -7374939957883789629
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
// 111: ifnull 0ab
// 114: aload 14
// 116: aload 8
// 118: bipush 0
// 119: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 11e: istore 12
// 120: iload 11
// 122: bipush 1
// 123: ior
// 124: istore 11
// 126: aload 7
// 128: lload 2
// 129: lconst_0
// 12a: lcmp
// 12b: ifle 145
// 12e: ifnull 0ab
// 131: aload 14
// 133: aload 8
// 135: bipush 1
// 136: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 13b: astore 13
// 13d: iload 11
// 13f: bipush 2
// 140: ior
// 141: istore 11
// 143: aload 7
// 145: ifnull 0ab
// 148: lload 2
// 149: lconst_0
// 14a: lcmp
// 14b: ifle 0c8
// 14e: new kotlinx/serialization/UnknownFieldException
// 151: dup
// 152: iload 10
// 154: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 157: athrow
// 158: aload 14
// 15a: aload 8
// 15c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 161: new su/catlean/j9
// 164: dup
// 165: iload 4
// 167: iload 5
// 169: i2c
// 16a: iload 6
// 16c: i2c
// 16d: iload 11
// 16f: iload 12
// 171: aload 13
// 173: aconst_null
// 174: invokespecial su/catlean/j9.<init> (ICCIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 177: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return C;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 70691017939407L;
long var5 = var3 ^ 46226645212864L;
this.a(encoder, var5, (j9)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 48530379000470L;
long var4 = var2 ^ 109128618267313L;
return this.T(decoder, var4);
}

static {
long var9 = a ^ 28080563995381L;
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
String var4 = "Ó¨êç^æä\u0005råA\u000e\u000e³ \u0000\u0010~<Q!¨@\u0000ºÇ\u0012\u0007KÒ\u0089Ëã\u00109DúT1M²u\u008aü\u0082\u009f\u0085â½\u001a";
int var6 = "Ó¨êç^æä\u0005råA\u000e\u000e³ \u0000\u0010~<Q!¨@\u0000ºÇ\u0012\u0007KÒ\u0089Ëã\u00109DúT1M²u\u008aü\u0082\u009f\u0085â½\u001a".length();
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
h = new dd();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"t">(8628, 7512230507130599936L ^ var9), h, 2);
var11.addElement("v", false);
var11.addElement(a<"t">(9282, 2037706833266982897L ^ var9), false);
C = var11;
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

var4 = "Ç\u001f-e¹d\u0015TÙR ñD\u0014¨\u0001û\u0094 \u0001¼\u00adòI\u0018F?ýM%x°93qI8è\u0086ký\u0018J}ºÇNY\u0091";
var6 = "Ç\u001f-e¹d\u0015TÙR ñD\u0014¨\u0001û\u0094 \u0001¼\u00adòI\u0018F?ýM%x°93qI8è\u0086ký\u0018J}ºÇNY\u0091".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6840;
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
throw new RuntimeException("su/catlean/dd", var10);
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
throw new RuntimeException("su/catlean/dd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
