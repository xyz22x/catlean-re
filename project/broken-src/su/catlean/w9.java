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
public final class w9 implements GeneratedSerializer {
@NotNull
public static final w9 f;
@NotNull
private static final SerialDescriptor F;
private static final long a = yz.a(-2550104169387604567L, -4828697023080717901L, MethodHandles.lookup().lookupClass()).a(278745541394698L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private w9() {
}

public final void K(@NotNull Encoder encoder, long a, @NotNull c2 value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"q">(21594, 5855686696506577665L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"q">(4134, 8427892462652266358L ^ ax));
SerialDescriptor var5 = F;
CompositeEncoder var6 = encoder.beginStructure(var5);
c2.t(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final c2 B(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/w9.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 42519576073974
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 1974756960609389007
// 012: lload 1
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 3
// 019: sipush 22702
// 01c: ldc2_w 4340860942353787002
// 01f: lload 1
// 020: lxor
// 021: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/w9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: istore 6
// 02b: getstatic su/catlean/w9.F Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02e: astore 7
// 030: bipush 1
// 031: istore 8
// 033: bipush 0
// 034: istore 10
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: bipush 0
// 03d: istore 13
// 03f: aconst_null
// 040: astore 14
// 042: aconst_null
// 043: astore 15
// 045: bipush 0
// 046: istore 16
// 048: aload 3
// 049: aload 7
// 04b: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 050: astore 17
// 052: aload 17
// 054: iload 6
// 056: ifeq 07d
// 059: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05e: ifeq 116
// 061: goto 06e
// 064: ldc2_w 2007434522504338071
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 17
// 070: goto 07d
// 073: ldc2_w 2007434522504338071
// 076: lload 1
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: aload 7
// 07f: bipush 0
// 080: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 085: astore 11
// 087: iload 10
// 089: bipush 1
// 08a: ior
// 08b: istore 10
// 08d: aload 17
// 08f: aload 7
// 091: bipush 1
// 092: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 097: astore 12
// 099: iload 10
// 09b: bipush 2
// 09c: ior
// 09d: istore 10
// 09f: aload 17
// 0a1: aload 7
// 0a3: bipush 2
// 0a4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 0a9: istore 13
// 0ab: iload 10
// 0ad: bipush 4
// 0ae: ior
// 0af: istore 10
// 0b1: aload 17
// 0b3: aload 7
// 0b5: bipush 3
// 0b6: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0bb: astore 14
// 0bd: iload 10
// 0bf: sipush 5663
// 0c2: ldc2_w 2660454526167328746
// 0c5: lload 1
// 0c6: lxor
// 0c7: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: ior
// 0cd: istore 10
// 0cf: aload 17
// 0d1: aload 7
// 0d3: bipush 4
// 0d4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0d9: astore 15
// 0db: iload 10
// 0dd: sipush 2131
// 0e0: ldc2_w 2724528352821459367
// 0e3: lload 1
// 0e4: lxor
// 0e5: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: ior
// 0eb: istore 10
// 0ed: aload 17
// 0ef: aload 7
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: ifle 27c
// 0f7: bipush 5
// 0f8: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0fd: istore 16
// 0ff: iload 10
// 101: sipush 8017
// 104: ldc2_w 5174850758505639585
// 107: lload 1
// 108: lxor
// 109: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: ior
// 10f: istore 10
// 111: iload 6
// 113: ifne 278
// 116: iload 8
// 118: ifeq 278
// 11b: goto 128
// 11e: ldc2_w 2007434522504338071
// 121: lload 1
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 17
// 12a: aload 7
// 12c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 131: istore 9
// 133: iload 6
// 135: lload 1
// 136: lconst_0
// 137: lcmp
// 138: iflt 140
// 13b: ifeq 281
// 13e: iload 9
// 140: lload 1
// 141: lconst_0
// 142: lcmp
// 143: ifle 193
// 146: iload 6
// 148: ifeq 18f
// 14b: goto 158
// 14e: ldc2_w 2007434522504338071
// 151: lload 1
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: tableswitch 272 -1 5 54 68 97 126 155 196 237
// 184: ldc2_w 2007434522504338071
// 187: lload 1
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: bipush 0
// 18f: istore 8
// 191: iload 6
// 193: lload 1
// 194: lconst_0
// 195: lcmp
// 196: ifle 1b0
// 199: ifne 116
// 19c: aload 17
// 19e: aload 7
// 1a0: bipush 0
// 1a1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1a6: astore 11
// 1a8: iload 10
// 1aa: bipush 1
// 1ab: ior
// 1ac: istore 10
// 1ae: iload 6
// 1b0: lload 1
// 1b1: lconst_0
// 1b2: lcmp
// 1b3: ifle 1cd
// 1b6: ifne 116
// 1b9: aload 17
// 1bb: aload 7
// 1bd: bipush 1
// 1be: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1c3: astore 12
// 1c5: iload 10
// 1c7: bipush 2
// 1c8: ior
// 1c9: istore 10
// 1cb: iload 6
// 1cd: lload 1
// 1ce: lconst_0
// 1cf: lcmp
// 1d0: ifle 1ea
// 1d3: ifne 116
// 1d6: aload 17
// 1d8: aload 7
// 1da: bipush 2
// 1db: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 1e0: istore 13
// 1e2: iload 10
// 1e4: bipush 4
// 1e5: ior
// 1e6: istore 10
// 1e8: iload 6
// 1ea: lload 1
// 1eb: lconst_0
// 1ec: lcmp
// 1ed: ifle 213
// 1f0: ifne 116
// 1f3: aload 17
// 1f5: aload 7
// 1f7: bipush 3
// 1f8: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1fd: astore 14
// 1ff: iload 10
// 201: sipush 22013
// 204: ldc2_w 1576082471305405452
// 207: lload 1
// 208: lxor
// 209: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: ior
// 20f: istore 10
// 211: iload 6
// 213: lload 1
// 214: lconst_0
// 215: lcmp
// 216: ifle 23c
// 219: ifne 116
// 21c: aload 17
// 21e: aload 7
// 220: bipush 4
// 221: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 226: astore 15
// 228: iload 10
// 22a: sipush 2616
// 22d: ldc2_w 5502309174804069327
// 230: lload 1
// 231: lxor
// 232: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: ior
// 238: istore 10
// 23a: iload 6
// 23c: lload 1
// 23d: lconst_0
// 23e: lcmp
// 23f: ifle 265
// 242: ifne 116
// 245: aload 17
// 247: aload 7
// 249: bipush 5
// 24a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 24f: istore 16
// 251: iload 10
// 253: sipush 21132
// 256: ldc2_w 7097394574071817086
// 259: lload 1
// 25a: lxor
// 25b: invokedynamic s (IJ)I bsm=su/catlean/w9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: ior
// 261: istore 10
// 263: iload 6
// 265: ifne 116
// 268: lload 1
// 269: lconst_0
// 26a: lcmp
// 26b: iflt 133
// 26e: new kotlinx/serialization/UnknownFieldException
// 271: dup
// 272: iload 9
// 274: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 277: athrow
// 278: aload 17
// 27a: aload 7
// 27c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 281: new su/catlean/c2
// 284: dup
// 285: iload 10
// 287: aload 11
// 289: aload 12
// 28b: iload 13
// 28d: aload 14
// 28f: aload 15
// 291: iload 16
// 293: aconst_null
// 294: lload 4
// 296: invokespecial su/catlean/c2.<init> (ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;J)V
// 299: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return F;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
long var1 = a ^ 31007468785821L;
KSerializer[] var3 = new KSerializer[b<"s">(24955, 3548775066068610437L ^ var1)];
var3[0] = StringSerializer.INSTANCE;
var3[1] = StringSerializer.INSTANCE;
var3[2] = IntSerializer.INSTANCE;
var3[3] = StringSerializer.INSTANCE;
var3[4] = StringSerializer.INSTANCE;
var3[5] = BooleanSerializer.INSTANCE;
return var3;
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 99741367786791L;
long var5 = var3 ^ 139611807117332L;
this.K(encoder, var5, (c2)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 47858842522490L;
long var4 = var2 ^ 43535851243973L;
return this.B(var4, decoder);
}

static {
long var20 = a ^ 72331180086046L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "8\u0096\u0098¹ \u0090È/\u0094ed>¤µD#\u0010ý,/óÙ\u0016ßª\u0015½\u0088Ä\u009dº~~\u0010+\u001bQÀ¦\u001c8Ò\u0018ì\u0004\u0086ìcH\u0010\u0010arÔQ\u0080aöË\u009a¿À\u0088ÊÚì|\u0018C\"Ågp å\u000e#K}\u0002t \u007f~#WJ96nÆÇ Æ)&TYc\u0019»RÝØn±¡{\u000bd/`R_1R8åj\u0092\u0011\u0092n\u008a7\u0010sWt'û|V\u0005\u0015>½Ï\n &Ú\u0010¯x âöâ\u0014êõ7_Öá\u0088¿\u0093";
int var17 = "8\u0096\u0098¹ \u0090È/\u0094ed>¤µD#\u0010ý,/óÙ\u0016ßª\u0015½\u0088Ä\u009dº~~\u0010+\u001bQÀ¦\u001c8Ò\u0018ì\u0004\u0086ìcH\u0010\u0010arÔQ\u0080aöË\u009a¿À\u0088ÊÚì|\u0018C\"Ågp å\u000e#K}\u0002t \u007f~#WJ96nÆÇ Æ)&TYc\u0019»RÝØn±¡{\u000bd/`R_1R8åj\u0092\u0011\u0092n\u008a7\u0010sWt'û|V\u0005\u0015>½Ï\n &Ú\u0010¯x âöâ\u0014êõ7_Öá\u0088¿\u0093"
.length();
char var14 = 16;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[10];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "\u008e×þ\u0093\u008c×ÔÉH\u00974U÷\u0007/dóãF¶JÛ!\u0092s®Fð>Í6NÃþSÝÕ\u0095\u0084ë\u009c ·,Î\u0012Öù";
int var5 = "\u008e×þ\u0093\u008c×ÔÉH\u00974U÷\u0007/dóãF¶JÛ!\u0092s®Fð>Í6NÃþSÝÕ\u0095\u0084ë\u009c ·,Î\u0012Öù".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
e = var6;
g = new Integer[8];
f = new w9();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(
a<"q">(5974, 5743485862883858697L ^ var20), f, b<"s">(4286, 2388750582144606150L ^ var20)
);
var22.addElement(a<"q">(32, 5301695271964774011L ^ var20), false);
var22.addElement(a<"q">(8663, 667312515972345739L ^ var20), false);
var22.addElement(a<"q">(17204, 8664703150801538407L ^ var20), false);
var22.addElement(a<"q">(12565, 5271974847265652557L ^ var20), false);
var22.addElement(a<"q">(13216, 8195514465337622014L ^ var20), false);
var22.addElement(a<"q">(6006, 2063967516723648811L ^ var20), false);
F = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "}æ²\u0094éñÜ`©ã\u001b¥çØ?R";
var5 = "}æ²\u0094éñÜ`©ã\u001b¥çØ?R".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "¶GT\u0083KC]\u008f&À(|K\u0001\u0007æ\u0010åË\u009cWï\u008b®\u0018M\u000bÌ\u0010\u008a\u0003U'";
var17 = "¶GT\u0083KC]\u008f&À(|K\u0001\u0007æ\u0010åË\u009cWï\u008b®\u0018M\u000bÌ\u0010\u008a\u0003U'".length();
var14 = 16;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10859;
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
throw new RuntimeException("su/catlean/w9", var10);
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
throw new RuntimeException("su/catlean/w9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11087;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/w9", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/w9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
