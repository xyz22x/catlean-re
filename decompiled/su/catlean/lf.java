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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class lf implements GeneratedSerializer {
@NotNull
public static final lf H;
@NotNull
private static final SerialDescriptor V;
private static final long a = yz.a(-4881101996588712884L, 8115454559251400721L, MethodHandles.lookup().lookupClass()).a(264817322441560L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private lf() {
}

public final void l(@NotNull Encoder encoder, @NotNull an value, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"f">(11179, 3494965106876602882L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"f">(7390, 5563633313971957109L ^ ax));
SerialDescriptor var5 = V;
CompositeEncoder var6 = encoder.beginStructure(var5);
an.G(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final an s(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/lf.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 16290989103189
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 32
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
// 02a: sipush 19131
// 02d: ldc2_w 820868283289689969
// 030: lload 2
// 031: lxor
// 032: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/lf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: getstatic su/catlean/lf.V Lkotlinx/serialization/descriptors/SerialDescriptor;
// 03d: astore 8
// 03f: bipush 1
// 040: istore 9
// 042: bipush 0
// 043: istore 11
// 045: aconst_null
// 046: astore 12
// 048: aconst_null
// 049: astore 13
// 04b: aconst_null
// 04c: astore 14
// 04e: aconst_null
// 04f: astore 15
// 051: ldc2_w 8571857966939638817
// 054: lload 2
// 055: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: aload 1
// 05b: aload 8
// 05d: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 062: astore 16
// 064: astore 7
// 066: aload 16
// 068: aload 7
// 06a: ifnull 0a1
// 06d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 072: ifeq 11a
// 075: goto 082
// 078: ldc2_w 8513017461729271330
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: aload 16
// 084: aload 8
// 086: bipush 0
// 087: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 08a: checkcast kotlinx/serialization/DeserializationStrategy
// 08d: aload 12
// 08f: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 094: goto 0a1
// 097: ldc2_w 8513017461729271330
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: checkcast java/lang/String
// 0a4: astore 12
// 0a6: iload 11
// 0a8: bipush 1
// 0a9: ior
// 0aa: istore 11
// 0ac: aload 16
// 0ae: aload 8
// 0b0: bipush 1
// 0b1: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 0b4: checkcast kotlinx/serialization/DeserializationStrategy
// 0b7: aload 13
// 0b9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0be: checkcast java/lang/String
// 0c1: astore 13
// 0c3: iload 11
// 0c5: bipush 2
// 0c6: ior
// 0c7: istore 11
// 0c9: aload 16
// 0cb: aload 8
// 0cd: bipush 2
// 0ce: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 0d1: checkcast kotlinx/serialization/DeserializationStrategy
// 0d4: aload 14
// 0d6: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0db: checkcast java/lang/String
// 0de: astore 14
// 0e0: iload 11
// 0e2: bipush 4
// 0e3: ior
// 0e4: istore 11
// 0e6: aload 16
// 0e8: aload 8
// 0ea: bipush 3
// 0eb: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 0ee: checkcast kotlinx/serialization/DeserializationStrategy
// 0f1: aload 15
// 0f3: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0f8: checkcast java/lang/String
// 0fb: astore 15
// 0fd: iload 11
// 0ff: sipush 22713
// 102: ldc2_w 1752116972453515482
// 105: lload 2
// 106: lxor
// 107: invokedynamic i (IJ)I bsm=su/catlean/lf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: ior
// 10d: lload 2
// 10e: lconst_0
// 10f: lcmp
// 110: ifle 11c
// 113: istore 11
// 115: aload 7
// 117: ifnonnull 242
// 11a: iload 9
// 11c: ifeq 242
// 11f: goto 12c
// 122: ldc2_w 8513017461729271330
// 125: lload 2
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: aload 16
// 12e: aload 8
// 130: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 135: istore 10
// 137: aload 7
// 139: ifnull 24b
// 13c: iload 10
// 13e: aload 7
// 140: ifnull 17f
// 143: goto 150
// 146: ldc2_w 8513017461729271330
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: tableswitch 226 -1 3 46 60 100 140 180
// 174: ldc2_w 8513017461729271330
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: bipush 0
// 17f: istore 9
// 181: aload 7
// 183: lload 2
// 184: lconst_0
// 185: lcmp
// 186: iflt 1ab
// 189: ifnonnull 11a
// 18c: aload 16
// 18e: aload 8
// 190: bipush 0
// 191: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 194: checkcast kotlinx/serialization/DeserializationStrategy
// 197: aload 12
// 199: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 19e: checkcast java/lang/String
// 1a1: astore 12
// 1a3: iload 11
// 1a5: bipush 1
// 1a6: ior
// 1a7: istore 11
// 1a9: aload 7
// 1ab: lload 2
// 1ac: lconst_0
// 1ad: lcmp
// 1ae: iflt 1d3
// 1b1: ifnonnull 11a
// 1b4: aload 16
// 1b6: aload 8
// 1b8: bipush 1
// 1b9: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 1bc: checkcast kotlinx/serialization/DeserializationStrategy
// 1bf: aload 13
// 1c1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1c6: checkcast java/lang/String
// 1c9: astore 13
// 1cb: iload 11
// 1cd: bipush 2
// 1ce: ior
// 1cf: istore 11
// 1d1: aload 7
// 1d3: lload 2
// 1d4: lconst_0
// 1d5: lcmp
// 1d6: ifle 1fb
// 1d9: ifnonnull 11a
// 1dc: aload 16
// 1de: aload 8
// 1e0: bipush 2
// 1e1: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 1e4: checkcast kotlinx/serialization/DeserializationStrategy
// 1e7: aload 14
// 1e9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1ee: checkcast java/lang/String
// 1f1: astore 14
// 1f3: iload 11
// 1f5: bipush 4
// 1f6: ior
// 1f7: istore 11
// 1f9: aload 7
// 1fb: lload 2
// 1fc: lconst_0
// 1fd: lcmp
// 1fe: iflt 22f
// 201: ifnonnull 11a
// 204: aload 16
// 206: aload 8
// 208: bipush 3
// 209: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 20c: checkcast kotlinx/serialization/DeserializationStrategy
// 20f: aload 15
// 211: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 216: checkcast java/lang/String
// 219: astore 15
// 21b: iload 11
// 21d: sipush 25009
// 220: ldc2_w 3142707139759335891
// 223: lload 2
// 224: lxor
// 225: invokedynamic i (IJ)I bsm=su/catlean/lf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22a: ior
// 22b: istore 11
// 22d: aload 7
// 22f: ifnonnull 11a
// 232: new kotlinx/serialization/UnknownFieldException
// 235: dup
// 236: iload 10
// 238: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 23b: lload 2
// 23c: lconst_0
// 23d: lcmp
// 23e: ifle 19e
// 241: athrow
// 242: aload 16
// 244: aload 8
// 246: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 24b: new su/catlean/an
// 24e: dup
// 24f: iload 11
// 251: aload 12
// 253: iload 4
// 255: i2s
// 256: aload 13
// 258: aload 14
// 25a: iload 5
// 25c: aload 15
// 25e: aconst_null
// 25f: iload 6
// 261: i2c
// 262: invokespecial su/catlean/an.<init> (ILjava/lang/String;SLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;C)V
// 265: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return V;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE),
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE),
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE),
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)
};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 105805987294397L;
long var5 = var3 ^ 36972166594373L;
this.l(encoder, (an)value, var5);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 134181216110595L;
long var4 = var2 ^ 69874778161049L;
return this.s(decoder, var4);
}

static {
long var20 = a ^ 54787060223581L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "TÎ\u0087é+ì\u008dÐx:+\u009aïØd3\u0010 @&\u0090\u009b]õLîú\u0093wH.\u0085µ\u0010VK|\"q÷s\u0004 Sîú\u0082ø>5 ª¶ì7\u0080\u008fÄ\u0093ùW±pquªh/\u0097L¹\u000bim$öqÑ§ËD \u0084\u0018¹:ÁÙ\u009cÝ¤\u009dH\u0012{ºíPø\u009eÔ÷+ôF\u000b³N \u0013*ûÖñ8H@!\u0004Tc\u000e §b\u0080òÑ\u0080È\u009f\u0013R\u0018\u0002]ó2¦\u0083!";
int var17 = "TÎ\u0087é+ì\u008dÐx:+\u009aïØd3\u0010 @&\u0090\u009b]õLîú\u0093wH.\u0085µ\u0010VK|\"q÷s\u0004 Sîú\u0082ø>5 ª¶ì7\u0080\u008fÄ\u0093ùW±pquªh/\u0097L¹\u000bim$öqÑ§ËD \u0084\u0018¹:ÁÙ\u009cÝ¤\u009dH\u0012{ºíPø\u009eÔ÷+ôF\u000b³N \u0013*ûÖñ8H@!\u0004Tc\u000e §b\u0080òÑ\u0080È\u009f\u0013R\u0018\u0002]ó2¦\u0083!"
.length();
char var14 = 16;
int var24 = -1;

label45:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var34 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var34;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[8];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "U®ÿ|mv\r`ëQ0 \u0096y\u0096=";
int var5 = "U®ÿ|mv\r`ëQ0 \u0096y\u0096=".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var39 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
H = new lf();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(a<"f">(9694, 1122196621927115142L ^ var20), H, 4);
var22.addElement(a<"f">(22277, 105572210977348447L ^ var20), false);
var22.addElement(a<"f">(5179, 6874137057311283296L ^ var20), false);
var22.addElement(a<"f">(31473, 5965828108915422895L ^ var20), false);
var22.addElement(a<"f">(19346, 7050680247862134731L ^ var20), false);
V = var22;
return;
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var34;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label45;
}

var15 = "\u0081«-e\u0013\u0017\u008c\u0015\u001e×îõ\r@öÜ\u001cuø\u0082\u009bs?\u001c ^ÀQ\u0081ºÂ\u0006#Ôf½\u0012nÓ\u0019=\r\\%²C¬ü\u0096Ò®\u007fFS[½Æ";
var17 = "\u0081«-e\u0013\u0017\u008c\u0015\u001e×îõ\r@öÜ\u001cuø\u0082\u009bs?\u001c ^ÀQ\u0081ºÂ\u0006#Ôf½\u0012nÓ\u0019=\r\\%²C¬ü\u0096Ò®\u007fFS[½Æ".length();
var14 = 24;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25169;
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
throw new RuntimeException("su/catlean/lf", var10);
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
throw new RuntimeException("su/catlean/lf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32760;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/lf", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/lf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
