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
public final class lm implements GeneratedSerializer {
@NotNull
public static final lm v;
@NotNull
private static final SerialDescriptor G;
private static final long a = yz.a(270663441620567301L, -7673129082363775506L, MethodHandles.lookup().lookupClass()).a(139993090291377L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private lm() {
}

public final void c(@NotNull Encoder encoder, long a, @NotNull s4 value) {
ax = a ^ ax;
long var5 = ax ^ 26970621099581L;
Intrinsics.checkNotNullParameter(encoder, a<"j">(4506, 6703919108652997086L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"j">(31534, 695885971798782824L ^ ax));
SerialDescriptor var7 = G;
CompositeEncoder var8 = encoder.beginStructure(var7);
s4.G(value, var5, var8, var7);
var8.endStructure(var7);
}

@NotNull
public final s4 t(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/lm.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 64907444740488
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 3
// 010: sipush 23163
// 013: ldc2_w 2924793360174135529
// 016: lload 1
// 017: lxor
// 018: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/lm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w 2985980235827279104
// 023: lload 1
// 024: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/lm.G Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: astore 6
// 036: aconst_null
// 037: astore 11
// 039: bipush 0
// 03a: istore 12
// 03c: bipush 0
// 03d: istore 13
// 03f: bipush 0
// 040: istore 14
// 042: aconst_null
// 043: astore 15
// 045: bipush 0
// 046: istore 16
// 048: bipush 0
// 049: istore 17
// 04b: aload 3
// 04c: aload 7
// 04e: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 053: astore 18
// 055: aload 18
// 057: aload 6
// 059: ifnull 080
// 05c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 061: ifeq 143
// 064: goto 071
// 067: ldc2_w 3010106767959699047
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 18
// 073: goto 080
// 076: ldc2_w 3010106767959699047
// 079: lload 1
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: aload 7
// 082: bipush 0
// 083: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 088: astore 11
// 08a: iload 10
// 08c: bipush 1
// 08d: ior
// 08e: istore 10
// 090: aload 18
// 092: aload 7
// 094: bipush 1
// 095: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 09a: istore 12
// 09c: iload 10
// 09e: bipush 2
// 09f: ior
// 0a0: istore 10
// 0a2: aload 18
// 0a4: aload 7
// 0a6: bipush 2
// 0a7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 0ac: istore 13
// 0ae: iload 10
// 0b0: bipush 4
// 0b1: ior
// 0b2: istore 10
// 0b4: aload 18
// 0b6: aload 7
// 0b8: bipush 3
// 0b9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 0be: istore 14
// 0c0: iload 10
// 0c2: sipush 24749
// 0c5: ldc2_w 3899190524344137362
// 0c8: lload 1
// 0c9: lxor
// 0ca: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: ior
// 0d0: istore 10
// 0d2: aload 18
// 0d4: aload 7
// 0d6: bipush 4
// 0d7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0dc: astore 15
// 0de: iload 10
// 0e0: sipush 4972
// 0e3: ldc2_w 4334513791813813586
// 0e6: lload 1
// 0e7: lxor
// 0e8: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: ior
// 0ee: istore 10
// 0f0: aload 18
// 0f2: aload 7
// 0f4: bipush 5
// 0f5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 0fa: istore 16
// 0fc: iload 10
// 0fe: sipush 16889
// 101: ldc2_w 8645975767190099912
// 104: lload 1
// 105: lxor
// 106: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: ior
// 10c: istore 10
// 10e: aload 18
// 110: aload 7
// 112: lload 1
// 113: lconst_0
// 114: lcmp
// 115: ifle 2d5
// 118: sipush 17283
// 11b: ldc2_w 2446417127246255541
// 11e: lload 1
// 11f: lxor
// 120: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 12a: istore 17
// 12c: iload 10
// 12e: sipush 992
// 131: ldc2_w 5734210790336697820
// 134: lload 1
// 135: lxor
// 136: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: ior
// 13c: istore 10
// 13e: aload 6
// 140: ifnonnull 2d1
// 143: iload 8
// 145: ifeq 2d1
// 148: goto 155
// 14b: ldc2_w 3010106767959699047
// 14e: lload 1
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: aload 18
// 157: aload 7
// 159: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 15e: istore 9
// 160: aload 6
// 162: ifnull 2da
// 165: iload 9
// 167: aload 6
// 169: ifnull 1b3
// 16c: goto 179
// 16f: ldc2_w 3010106767959699047
// 172: lload 1
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: tableswitch 328 -1 6 57 71 100 129 158 199 240 281
// 1a8: ldc2_w 3010106767959699047
// 1ab: lload 1
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: bipush 0
// 1b3: istore 8
// 1b5: aload 6
// 1b7: lload 1
// 1b8: lconst_0
// 1b9: lcmp
// 1ba: iflt 1d4
// 1bd: ifnonnull 143
// 1c0: aload 18
// 1c2: aload 7
// 1c4: bipush 0
// 1c5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1ca: astore 11
// 1cc: iload 10
// 1ce: bipush 1
// 1cf: ior
// 1d0: istore 10
// 1d2: aload 6
// 1d4: lload 1
// 1d5: lconst_0
// 1d6: lcmp
// 1d7: ifle 1f1
// 1da: ifnonnull 143
// 1dd: aload 18
// 1df: aload 7
// 1e1: bipush 1
// 1e2: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 1e7: istore 12
// 1e9: iload 10
// 1eb: bipush 2
// 1ec: ior
// 1ed: istore 10
// 1ef: aload 6
// 1f1: lload 1
// 1f2: lconst_0
// 1f3: lcmp
// 1f4: iflt 20e
// 1f7: ifnonnull 143
// 1fa: aload 18
// 1fc: aload 7
// 1fe: bipush 2
// 1ff: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 204: istore 13
// 206: iload 10
// 208: bipush 4
// 209: ior
// 20a: istore 10
// 20c: aload 6
// 20e: lload 1
// 20f: lconst_0
// 210: lcmp
// 211: iflt 237
// 214: ifnonnull 143
// 217: aload 18
// 219: aload 7
// 21b: bipush 3
// 21c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 221: istore 14
// 223: iload 10
// 225: sipush 23003
// 228: ldc2_w 2793403002964725739
// 22b: lload 1
// 22c: lxor
// 22d: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: ior
// 233: istore 10
// 235: aload 6
// 237: lload 1
// 238: lconst_0
// 239: lcmp
// 23a: iflt 260
// 23d: ifnonnull 143
// 240: aload 18
// 242: aload 7
// 244: bipush 4
// 245: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 24a: astore 15
// 24c: iload 10
// 24e: sipush 17335
// 251: ldc2_w 7363559038177957250
// 254: lload 1
// 255: lxor
// 256: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: ior
// 25c: istore 10
// 25e: aload 6
// 260: lload 1
// 261: lconst_0
// 262: lcmp
// 263: ifle 289
// 266: ifnonnull 143
// 269: aload 18
// 26b: aload 7
// 26d: bipush 5
// 26e: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 273: istore 16
// 275: iload 10
// 277: sipush 32736
// 27a: ldc2_w 4369457489247267287
// 27d: lload 1
// 27e: lxor
// 27f: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: ior
// 285: istore 10
// 287: aload 6
// 289: lload 1
// 28a: lconst_0
// 28b: lcmp
// 28c: iflt 2be
// 28f: ifnonnull 143
// 292: aload 18
// 294: aload 7
// 296: sipush 17283
// 299: ldc2_w 2446417127246255541
// 29c: lload 1
// 29d: lxor
// 29e: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a3: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 2a8: istore 17
// 2aa: iload 10
// 2ac: sipush 23630
// 2af: ldc2_w 6970072272085469818
// 2b2: lload 1
// 2b3: lxor
// 2b4: invokedynamic e (IJ)I bsm=su/catlean/lm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: ior
// 2ba: istore 10
// 2bc: aload 6
// 2be: ifnonnull 143
// 2c1: lload 1
// 2c2: lconst_0
// 2c3: lcmp
// 2c4: iflt 160
// 2c7: new kotlinx/serialization/UnknownFieldException
// 2ca: dup
// 2cb: iload 9
// 2cd: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 2d0: athrow
// 2d1: aload 18
// 2d3: aload 7
// 2d5: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 2da: new su/catlean/s4
// 2dd: dup
// 2de: iload 10
// 2e0: aload 11
// 2e2: iload 12
// 2e4: lload 4
// 2e6: iload 13
// 2e8: iload 14
// 2ea: aload 15
// 2ec: iload 16
// 2ee: iload 17
// 2f0: aconst_null
// 2f1: invokespecial su/catlean/s4.<init> (ILjava/lang/String;IJIILjava/lang/String;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 2f4: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return G;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
long var1 = a ^ 10343419722811L;
KSerializer[] var3 = new KSerializer[b<"e">(15856, 5621439847745450957L ^ var1)];
var3[0] = StringSerializer.INSTANCE;
var3[1] = IntSerializer.INSTANCE;
var3[2] = IntSerializer.INSTANCE;
var3[3] = IntSerializer.INSTANCE;
var3[4] = StringSerializer.INSTANCE;
var3[5] = IntSerializer.INSTANCE;
var3[b<"e">(15234, 4419735546869708208L ^ var1)] = BooleanSerializer.INSTANCE;
return var3;
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 23489312515637L;
long var5 = var3 ^ 28317544850490L;
this.c(encoder, var5, (s4)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 68917534093551L;
long var4 = var2 ^ 74212979922992L;
return this.t(var4, decoder);
}

static {
long var20 = a ^ 95637773838447L;
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
String var15 = "4=\u0006sõ\u0098öå\u0091Â_Ï\u0095£Ï¨\u0010°#¹\u0018í÷ñÇ!p\u0090È\u0087 ós\u0018C3Ðb¼Io\u0012Ï\u0097IAM\u0005¥\u009fW\u0085^Pö½X>\u0010F\u00ad>õ\u008b\u0099\u0099Æv\u00943}Ý¡øð\u0010W.m\u0012\u000eÔÃ$ê\u0011^ÐÍ±\u008c,\u0010E\u0016Ý\u0084[r\u0000R\u0015\u0084s\u008cèn«ù";
int var17 = "4=\u0006sõ\u0098öå\u0091Â_Ï\u0095£Ï¨\u0010°#¹\u0018í÷ñÇ!p\u0090È\u0087 ós\u0018C3Ðb¼Io\u0012Ï\u0097IAM\u0005¥\u009fW\u0085^Pö½X>\u0010F\u00ad>õ\u008b\u0099\u0099Æv\u00943}Ý¡øð\u0010W.m\u0012\u000eÔÃ$ê\u0011^ÐÍ±\u008c,\u0010E\u0016Ý\u0084[r\u0000R\u0015\u0084s\u008cèn«ù"
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
long[] var6 = new long[12];
int var3 = 0;
String var4 = "sÖi&\u00adÏ!\u001eÉn!ÏrÁ\u008fB\u008b\u000e\rì§¹R\u0097\u009dY0ß\u009d\u000f\u0016\u000e\u001fg`\u008a\u0018\u0016\u0082D££ãû4\u001fz+\u0014üó`7ç|\u0082ÿÈ<¡±\u001f;dñå)ýDgOOÕÑY1VþÝ.";
int var5 = "sÖi&\u00adÏ!\u001eÉn!ÏrÁ\u008fB\u008b\u000e\rì§¹R\u0097\u009dY0ß\u009d\u000f\u0016\u000e\u001fg`\u008a\u0018\u0016\u0082D££ãû4\u001fz+\u0014üó`7ç|\u0082ÿÈ<¡±\u001f;dñå)ýDgOOÕÑY1VþÝ."
.length();
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
f = new Integer[12];
v = new lm();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(
a<"j">(21490, 3659551827495140657L ^ var20), v, b<"e">(27803, 4985949781690939132L ^ var20)
);
var22.addElement(a<"j">(18399, 4261111324474779930L ^ var20), false);
var22.addElement("x", false);
var22.addElement("y", false);
var22.addElement("z", false);
var22.addElement(a<"j">(9965, 7023880351647483948L ^ var20), true);
var22.addElement(a<"j">(12142, 6276535799887937961L ^ var20), true);
var22.addElement(a<"j">(32318, 7870291161955635450L ^ var20), true);
G = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "V\u00adèl\u000eQ;×ì_?\u0092\u009c¯o\u0010";
var5 = "V\u00adèl\u000eQ;×ì_?\u0092\u009c¯o\u0010".length();
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

var15 = "\u00006>íÊXÜÇ·\u0010Ò¡gÕ\u008e\u0094ãIÉýR$Ý*L©x\u009eÍ\u0092Ã=\u0010çê%T\u0081\u000eÚ\u001c}^Ò@Ï³Ñí";
var17 = "\u00006>íÊXÜÇ·\u0010Ò¡gÕ\u008e\u0094ãIÉýR$Ý*L©x\u009eÍ\u0092Ã=\u0010çê%T\u0081\u000eÚ\u001c}^Ò@Ï³Ñí".length();
var14 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19018;
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
throw new RuntimeException("su/catlean/lm", var10);
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
throw new RuntimeException("su/catlean/lm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16104;
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
throw new RuntimeException("su/catlean/lm", var14);
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
throw new RuntimeException("su/catlean/lm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
