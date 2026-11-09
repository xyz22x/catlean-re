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
import kotlinx.serialization.internal.BooleanSerializer;
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
public final class p2 implements GeneratedSerializer {
@NotNull
public static final p2 N;
@NotNull
private static final SerialDescriptor Z;
private static final long a = yz.a(7175256589116179770L, 6936089288793650250L, MethodHandles.lookup().lookupClass()).a(138428819613526L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private p2() {
}

public final void v(long a, @NotNull Encoder encoder, @NotNull bp value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"q">(20031, 6830822989113845440L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"q">(28702, 3481287206288578790L ^ ax));
SerialDescriptor var5 = Z;
CompositeEncoder var6 = encoder.beginStructure(var5);
bp.s(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final bp j(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/p2.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 37291379776192
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 30861
// 013: ldc2_w 3320536506770977435
// 016: lload 2
// 017: lxor
// 018: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/p2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: getstatic su/catlean/p2.Z Lkotlinx/serialization/descriptors/SerialDescriptor;
// 023: astore 7
// 025: bipush 1
// 026: istore 8
// 028: ldc2_w 1958338343875615283
// 02b: lload 2
// 02c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: bipush 0
// 032: istore 10
// 034: aconst_null
// 035: astore 11
// 037: aconst_null
// 038: astore 12
// 03a: bipush 0
// 03b: istore 13
// 03d: aconst_null
// 03e: astore 14
// 040: aload 1
// 041: aload 7
// 043: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 048: astore 15
// 04a: istore 6
// 04c: aload 15
// 04e: iload 6
// 050: ifeq 077
// 053: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 058: ifeq 0df
// 05b: goto 068
// 05e: ldc2_w 2012192344663927329
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: aload 15
// 06a: goto 077
// 06d: ldc2_w 2012192344663927329
// 070: lload 2
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 7
// 079: bipush 0
// 07a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 07f: astore 11
// 081: iload 10
// 083: bipush 1
// 084: ior
// 085: istore 10
// 087: aload 15
// 089: aload 7
// 08b: bipush 1
// 08c: getstatic su/catlean/ss.B Lsu/catlean/ss;
// 08f: checkcast kotlinx/serialization/DeserializationStrategy
// 092: aload 12
// 094: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 099: checkcast su/catlean/lj
// 09c: astore 12
// 09e: iload 10
// 0a0: bipush 2
// 0a1: ior
// 0a2: istore 10
// 0a4: aload 15
// 0a6: aload 7
// 0a8: bipush 2
// 0a9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0ae: istore 13
// 0b0: iload 10
// 0b2: bipush 4
// 0b3: ior
// 0b4: istore 10
// 0b6: aload 15
// 0b8: aload 7
// 0ba: bipush 3
// 0bb: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0c0: astore 14
// 0c2: iload 10
// 0c4: sipush 23295
// 0c7: ldc2_w 6175949075548681810
// 0ca: lload 2
// 0cb: lxor
// 0cc: invokedynamic w (IJ)I bsm=su/catlean/p2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: ior
// 0d2: istore 10
// 0d4: iload 6
// 0d6: lload 2
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: iflt 0e1
// 0dc: ifne 1f1
// 0df: iload 8
// 0e1: ifeq 1f1
// 0e4: goto 0f1
// 0e7: ldc2_w 2012192344663927329
// 0ea: lload 2
// 0eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: athrow
// 0f1: aload 15
// 0f3: aload 7
// 0f5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0fa: istore 9
// 0fc: iload 6
// 0fe: lload 2
// 0ff: lconst_0
// 100: lcmp
// 101: ifle 109
// 104: ifeq 1fa
// 107: iload 9
// 109: lload 2
// 10a: lconst_0
// 10b: lcmp
// 10c: iflt 153
// 10f: iload 6
// 111: ifeq 14f
// 114: goto 121
// 117: ldc2_w 2012192344663927329
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: tableswitch 192 -1 3 45 59 88 128 157
// 144: ldc2_w 2012192344663927329
// 147: lload 2
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: bipush 0
// 14f: istore 8
// 151: iload 6
// 153: lload 2
// 154: lconst_0
// 155: lcmp
// 156: iflt 170
// 159: ifne 0df
// 15c: aload 15
// 15e: aload 7
// 160: bipush 0
// 161: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 166: astore 11
// 168: iload 10
// 16a: bipush 1
// 16b: ior
// 16c: istore 10
// 16e: iload 6
// 170: lload 2
// 171: lconst_0
// 172: lcmp
// 173: iflt 198
// 176: ifne 0df
// 179: aload 15
// 17b: aload 7
// 17d: bipush 1
// 17e: getstatic su/catlean/ss.B Lsu/catlean/ss;
// 181: checkcast kotlinx/serialization/DeserializationStrategy
// 184: aload 12
// 186: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 18b: checkcast su/catlean/lj
// 18e: astore 12
// 190: iload 10
// 192: bipush 2
// 193: ior
// 194: istore 10
// 196: iload 6
// 198: lload 2
// 199: lconst_0
// 19a: lcmp
// 19b: iflt 1b5
// 19e: ifne 0df
// 1a1: aload 15
// 1a3: aload 7
// 1a5: bipush 2
// 1a6: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 1ab: istore 13
// 1ad: iload 10
// 1af: bipush 4
// 1b0: ior
// 1b1: istore 10
// 1b3: iload 6
// 1b5: lload 2
// 1b6: lconst_0
// 1b7: lcmp
// 1b8: iflt 1de
// 1bb: ifne 0df
// 1be: aload 15
// 1c0: aload 7
// 1c2: bipush 3
// 1c3: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1c8: astore 14
// 1ca: iload 10
// 1cc: sipush 8357
// 1cf: ldc2_w 1299728914457971721
// 1d2: lload 2
// 1d3: lxor
// 1d4: invokedynamic w (IJ)I bsm=su/catlean/p2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: ior
// 1da: istore 10
// 1dc: iload 6
// 1de: ifne 0df
// 1e1: new kotlinx/serialization/UnknownFieldException
// 1e4: dup
// 1e5: iload 9
// 1e7: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 1ea: lload 2
// 1eb: lconst_0
// 1ec: lcmp
// 1ed: iflt 18b
// 1f0: athrow
// 1f1: aload 15
// 1f3: aload 7
// 1f5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 1fa: new su/catlean/bp
// 1fd: dup
// 1fe: iload 10
// 200: aload 11
// 202: aload 12
// 204: lload 4
// 206: iload 13
// 208: aload 14
// 20a: aconst_null
// 20b: invokespecial su/catlean/bp.<init> (ILjava/lang/String;Lsu/catlean/lj;JZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 20e: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return Z;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{StringSerializer.INSTANCE, ss.B, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 110856750750430L;
long var5 = var3 ^ 71472000525010L;
this.v(var5, encoder, (bp)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 71107679908129L;
long var4 = var2 ^ 128607270104005L;
return this.j(decoder, var4);
}

static {
long var20 = a ^ 78456960748665L;
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
String var15 = "ª¿JSi«Åi)þ\u007fX@µhß\u0010Ë\u009bmX½ÄpñÜ\u000b¦\u0099VÒü!\u0010¶z3r¹\u00ad/X\u0091\"h¢ô±ÚS\u0018b!BfÙv\u0005/\u009c\u009e¡a6îëTî\u008f\u001eì+Ùze\u0010|×\u009fv\u0095Y0\u0089Å\u001dæ\f³Xã]\u0010\u0083<ÇÕ\u0017O£Þô¨nåM?!M";
int var17 = "ª¿JSi«Åi)þ\u007fX@µhß\u0010Ë\u009bmX½ÄpñÜ\u000b¦\u0099VÒü!\u0010¶z3r¹\u00ad/X\u0091\"h¢ô±ÚS\u0018b!BfÙv\u0005/\u009c\u009e¡a6îëTî\u008f\u001eì+Ùze\u0010|×\u009fv\u0095Y0\u0089Å\u001dæ\f³Xã]\u0010\u0083<ÇÕ\u0017O£Þô¨nåM?!M"
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
String var4 = "\t°Ð\u001f)XQ¼)\u0088¿ïÏÆ¹\u0018";
int var5 = "\t°Ð\u001f)XQ¼)\u0088¿ïÏÆ¹\u0018".length();
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
N = new p2();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(a<"q">(31702, 4478435822826257734L ^ var20), N, 4);
var22.addElement(a<"q">(23196, 7413107263044213770L ^ var20), false);
var22.addElement(a<"q">(3667, 1909767680655493312L ^ var20), false);
var22.addElement(a<"q">(15133, 3894805105871994250L ^ var20), false);
var22.addElement(a<"q">(9270, 877443232592896679L ^ var20), false);
Z = var22;
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

var15 = "'Qà\u00136\rÔ®ZïÍ\u0006\u001cô\u0091ª\u0010²t¢ö\u001dÛ\u0015:|G\u00937r\u0093 \u0099";
var17 = "'Qà\u00136\rÔ®ZïÍ\u0006\u001cô\u0091ª\u0010²t¢ö\u001dÛ\u0015:|G\u00937r\u0093 \u0099".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4341;
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
throw new RuntimeException("su/catlean/p2", var10);
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
throw new RuntimeException("su/catlean/p2" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30281;
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
throw new RuntimeException("su/catlean/p2", var14);
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
throw new RuntimeException("su/catlean/p2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
