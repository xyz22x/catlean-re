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
public final class pm implements GeneratedSerializer {
@NotNull
public static final pm O;
@NotNull
private static final SerialDescriptor x;
private static final long a = yz.a(-6691075487035900621L, 5296551242683251550L, MethodHandles.lookup().lookupClass()).a(220288428864287L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private pm() {
}

public final void u(long a, @NotNull Encoder encoder, @NotNull sh value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"n">(23593, 3388746727696278538L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"n">(28777, 2290146678847146059L ^ ax));
SerialDescriptor var5 = x;
CompositeEncoder var6 = encoder.beginStructure(var5);
sh.a(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final sh P(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/pm.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 2879682669908
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 5100
// 013: ldc2_w 7707013469286424672
// 016: lload 2
// 017: lxor
// 018: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/pm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w 1663870391741862367
// 023: lload 2
// 024: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/pm.x Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: astore 6
// 033: bipush 0
// 034: istore 10
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: aload 1
// 03d: aload 7
// 03f: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 044: astore 13
// 046: aload 13
// 048: aload 6
// 04a: ifnull 071
// 04d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 052: ifeq 09e
// 055: goto 062
// 058: ldc2_w 1682370388174700341
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: aload 13
// 064: goto 071
// 067: ldc2_w 1682370388174700341
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 7
// 073: bipush 0
// 074: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 079: astore 11
// 07b: iload 10
// 07d: bipush 1
// 07e: ior
// 07f: istore 10
// 081: aload 13
// 083: aload 7
// 085: bipush 1
// 086: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 08b: astore 12
// 08d: iload 10
// 08f: bipush 2
// 090: ior
// 091: lload 2
// 092: lconst_0
// 093: lcmp
// 094: ifle 0a0
// 097: istore 10
// 099: aload 6
// 09b: ifnonnull 14c
// 09e: iload 8
// 0a0: ifeq 14c
// 0a3: goto 0b0
// 0a6: ldc2_w 1682370388174700341
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 13
// 0b2: aload 7
// 0b4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0b9: istore 9
// 0bb: aload 6
// 0bd: ifnull 155
// 0c0: iload 9
// 0c2: aload 6
// 0c4: ifnull 0fb
// 0c7: goto 0d4
// 0ca: ldc2_w 1682370388174700341
// 0cd: lload 2
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: tableswitch 104 -1 1 38 52 81
// 0f0: ldc2_w 1682370388174700341
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: bipush 0
// 0fb: istore 8
// 0fd: aload 6
// 0ff: lload 2
// 100: lconst_0
// 101: lcmp
// 102: iflt 11c
// 105: ifnonnull 09e
// 108: aload 13
// 10a: aload 7
// 10c: bipush 0
// 10d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 112: astore 11
// 114: iload 10
// 116: bipush 1
// 117: ior
// 118: istore 10
// 11a: aload 6
// 11c: lload 2
// 11d: lconst_0
// 11e: lcmp
// 11f: iflt 139
// 122: ifnonnull 09e
// 125: aload 13
// 127: aload 7
// 129: bipush 1
// 12a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 12f: astore 12
// 131: iload 10
// 133: bipush 2
// 134: ior
// 135: istore 10
// 137: aload 6
// 139: ifnonnull 09e
// 13c: lload 2
// 13d: lconst_0
// 13e: lcmp
// 13f: iflt 0bb
// 142: new kotlinx/serialization/UnknownFieldException
// 145: dup
// 146: iload 9
// 148: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 14b: athrow
// 14c: aload 13
// 14e: aload 7
// 150: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 155: new su/catlean/sh
// 158: dup
// 159: lload 4
// 15b: iload 10
// 15d: aload 11
// 15f: aload 12
// 161: aconst_null
// 162: invokespecial su/catlean/sh.<init> (JILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 165: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return x;
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
long var3 = a ^ 11350123127L;
long var5 = var3 ^ 122130025955262L;
this.u(var5, encoder, (sh)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 116710824603999L;
long var4 = var2 ^ 107313489307455L;
return this.P(decoder, var4);
}

static {
long var9 = a ^ 68395289649741L;
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
String var4 = "uÇX÷Ñ=f×]-\u0095óJ\u0092\u0088\u009b\u0018Aó\u0085î¡g\\'\u0084\t\u0014#\u008f\u0002è\u0099ôõu&ê\u001d\u0088½\u0010éÂ)³|È\u0095\u0090\u000e\u0007íÔÄ¢fÞ\u0010ÏØdY\u0014\u00165¡°\u0097Á\u00993å|\n";
int var6 = "uÇX÷Ñ=f×]-\u0095óJ\u0092\u0088\u009b\u0018Aó\u0085î¡g\\'\u0084\t\u0014#\u008f\u0002è\u0099ôõu&ê\u001d\u0088½\u0010éÂ)³|È\u0095\u0090\u000e\u0007íÔÄ¢fÞ\u0010ÏØdY\u0014\u00165¡°\u0097Á\u00993å|\n"
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
O = new pm();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"n">(20463, 3390801543024988070L ^ var9), O, 2);
var11.addElement(a<"n">(16967, 1624576726176023050L ^ var9), false);
var11.addElement(a<"n">(23272, 477353527350909600L ^ var9), false);
x = var11;
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

var4 = "¸tÚ\u0088O\u0014Ö1<RWyÊ\u0017 x\u0010ú\u0093½×ä+\u000f¶\u0099\u00ad9FÒ] 1";
var6 = "¸tÚ\u0088O\u0014Ö1<RWyÊ\u0017 x\u0010ú\u0093½×ä+\u000f¶\u0099\u00ad9FÒ] 1".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26088;
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
throw new RuntimeException("su/catlean/pm", var10);
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
throw new RuntimeException("su/catlean/pm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
