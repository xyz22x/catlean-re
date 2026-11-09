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
public final class bd implements GeneratedSerializer {
@NotNull
public static final bd M;
@NotNull
private static final SerialDescriptor X;
private static final long a = yz.a(-3718546963063561246L, -3997625981532284868L, MethodHandles.lookup().lookupClass()).a(114553667599215L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private bd() {
}

public final void g(short a, @NotNull Encoder encoder, int a, int a, @NotNull yq value) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(encoder, a<"r">(29465, 1117633868782466643L ^ var6));
Intrinsics.checkNotNullParameter(value, a<"r">(31648, 820669005333102312L ^ var6));
SerialDescriptor var8 = X;
CompositeEncoder var9 = encoder.beginStructure(var8);
yq.c(value, var9, var8);
var9.endStructure(var8);
}

@NotNull
public final yq B(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bd.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 123184439978838
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 15211
// 013: ldc2_w 7498139432371411545
// 016: lload 2
// 017: lxor
// 018: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/bd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: ldc2_w -2510928796288833549
// 023: lload 2
// 024: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: getstatic su/catlean/bd.X Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: astore 6
// 030: bipush 1
// 031: istore 8
// 033: bipush 0
// 034: istore 10
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: aconst_null
// 03d: astore 13
// 03f: aconst_null
// 040: astore 14
// 042: aconst_null
// 043: astore 15
// 045: aload 1
// 046: aload 7
// 048: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 04d: astore 16
// 04f: invokestatic su/catlean/yq.k ()[Lkotlin/Lazy;
// 052: astore 17
// 054: aload 16
// 056: aload 6
// 058: ifnull 08f
// 05b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 060: ifeq 137
// 063: goto 070
// 066: ldc2_w -2494390098783474119
// 069: lload 2
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: aload 16
// 072: aload 7
// 074: bipush 0
// 075: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 078: checkcast kotlinx/serialization/DeserializationStrategy
// 07b: aload 11
// 07d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 082: goto 08f
// 085: ldc2_w -2494390098783474119
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: checkcast java/lang/String
// 092: astore 11
// 094: iload 10
// 096: bipush 1
// 097: ior
// 098: istore 10
// 09a: aload 16
// 09c: aload 7
// 09e: bipush 1
// 09f: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 0a2: checkcast kotlinx/serialization/DeserializationStrategy
// 0a5: aload 12
// 0a7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0ac: checkcast java/lang/String
// 0af: astore 12
// 0b1: iload 10
// 0b3: bipush 2
// 0b4: ior
// 0b5: istore 10
// 0b7: aload 16
// 0b9: aload 7
// 0bb: bipush 2
// 0bc: getstatic su/catlean/we.i Lsu/catlean/we;
// 0bf: checkcast kotlinx/serialization/DeserializationStrategy
// 0c2: aload 13
// 0c4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0c9: checkcast su/catlean/pa
// 0cc: astore 13
// 0ce: iload 10
// 0d0: bipush 4
// 0d1: ior
// 0d2: istore 10
// 0d4: aload 16
// 0d6: aload 7
// 0d8: bipush 3
// 0d9: getstatic su/catlean/lf.H Lsu/catlean/lf;
// 0dc: checkcast kotlinx/serialization/DeserializationStrategy
// 0df: aload 14
// 0e1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0e6: checkcast su/catlean/an
// 0e9: astore 14
// 0eb: iload 10
// 0ed: sipush 6383
// 0f0: ldc2_w 8469512271830600247
// 0f3: lload 2
// 0f4: lxor
// 0f5: invokedynamic y (IJ)I bsm=su/catlean/bd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: ior
// 0fb: istore 10
// 0fd: aload 16
// 0ff: aload 7
// 101: bipush 4
// 102: aload 17
// 104: bipush 4
// 105: aaload
// 106: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 10b: checkcast kotlinx/serialization/DeserializationStrategy
// 10e: aload 15
// 110: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 115: checkcast java/util/List
// 118: astore 15
// 11a: iload 10
// 11c: sipush 5220
// 11f: ldc2_w 7556321820299511487
// 122: lload 2
// 123: lxor
// 124: invokedynamic y (IJ)I bsm=su/catlean/bd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: ior
// 12a: lload 2
// 12b: lconst_0
// 12c: lcmp
// 12d: ifle 139
// 130: istore 10
// 132: aload 6
// 134: ifnonnull 29c
// 137: iload 8
// 139: ifeq 29c
// 13c: goto 149
// 13f: ldc2_w -2494390098783474119
// 142: lload 2
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 16
// 14b: aload 7
// 14d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 152: istore 9
// 154: aload 6
// 156: ifnull 2a5
// 159: iload 9
// 15b: aload 6
// 15d: ifnull 19f
// 160: goto 16d
// 163: ldc2_w -2494390098783474119
// 166: lload 2
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: tableswitch 287 -1 4 49 63 103 143 183 235
// 194: ldc2_w -2494390098783474119
// 197: lload 2
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: bipush 0
// 19f: istore 8
// 1a1: aload 6
// 1a3: lload 2
// 1a4: lconst_0
// 1a5: lcmp
// 1a6: ifle 1cb
// 1a9: ifnonnull 137
// 1ac: aload 16
// 1ae: aload 7
// 1b0: bipush 0
// 1b1: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 1b4: checkcast kotlinx/serialization/DeserializationStrategy
// 1b7: aload 11
// 1b9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1be: checkcast java/lang/String
// 1c1: astore 11
// 1c3: iload 10
// 1c5: bipush 1
// 1c6: ior
// 1c7: istore 10
// 1c9: aload 6
// 1cb: lload 2
// 1cc: lconst_0
// 1cd: lcmp
// 1ce: iflt 1f3
// 1d1: ifnonnull 137
// 1d4: aload 16
// 1d6: aload 7
// 1d8: bipush 1
// 1d9: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE Lkotlinx/serialization/internal/StringSerializer;
// 1dc: checkcast kotlinx/serialization/DeserializationStrategy
// 1df: aload 12
// 1e1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1e6: checkcast java/lang/String
// 1e9: astore 12
// 1eb: iload 10
// 1ed: bipush 2
// 1ee: ior
// 1ef: istore 10
// 1f1: aload 6
// 1f3: lload 2
// 1f4: lconst_0
// 1f5: lcmp
// 1f6: iflt 21b
// 1f9: ifnonnull 137
// 1fc: aload 16
// 1fe: aload 7
// 200: bipush 2
// 201: getstatic su/catlean/we.i Lsu/catlean/we;
// 204: checkcast kotlinx/serialization/DeserializationStrategy
// 207: aload 13
// 209: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 20e: checkcast su/catlean/pa
// 211: astore 13
// 213: iload 10
// 215: bipush 4
// 216: ior
// 217: istore 10
// 219: aload 6
// 21b: lload 2
// 21c: lconst_0
// 21d: lcmp
// 21e: ifle 24f
// 221: ifnonnull 137
// 224: aload 16
// 226: aload 7
// 228: bipush 3
// 229: getstatic su/catlean/lf.H Lsu/catlean/lf;
// 22c: checkcast kotlinx/serialization/DeserializationStrategy
// 22f: aload 14
// 231: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 236: checkcast su/catlean/an
// 239: astore 14
// 23b: iload 10
// 23d: sipush 7176
// 240: ldc2_w 2216067909233790674
// 243: lload 2
// 244: lxor
// 245: invokedynamic y (IJ)I bsm=su/catlean/bd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: ior
// 24b: istore 10
// 24d: aload 6
// 24f: lload 2
// 250: lconst_0
// 251: lcmp
// 252: ifle 289
// 255: ifnonnull 137
// 258: aload 16
// 25a: aload 7
// 25c: bipush 4
// 25d: aload 17
// 25f: bipush 4
// 260: aaload
// 261: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 266: checkcast kotlinx/serialization/DeserializationStrategy
// 269: aload 15
// 26b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 270: checkcast java/util/List
// 273: astore 15
// 275: iload 10
// 277: sipush 13620
// 27a: ldc2_w 348955428446627821
// 27d: lload 2
// 27e: lxor
// 27f: invokedynamic y (IJ)I bsm=su/catlean/bd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: ior
// 285: istore 10
// 287: aload 6
// 289: ifnonnull 137
// 28c: new kotlinx/serialization/UnknownFieldException
// 28f: dup
// 290: iload 9
// 292: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 295: lload 2
// 296: lconst_0
// 297: lcmp
// 298: ifle 1be
// 29b: athrow
// 29c: aload 16
// 29e: aload 7
// 2a0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 2a5: new su/catlean/yq
// 2a8: dup
// 2a9: iload 10
// 2ab: aload 11
// 2ad: aload 12
// 2af: aload 13
// 2b1: aload 14
// 2b3: lload 4
// 2b5: aload 15
// 2b7: aconst_null
// 2b8: invokespecial su/catlean/yq.<init> (ILjava/lang/String;Ljava/lang/String;Lsu/catlean/pa;Lsu/catlean/an;JLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 2bb: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return X;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = yq.k();
return new KSerializer[]{
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE),
BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE),
we.i,
BuiltinSerializersKt.getNullable(lf.H),
BuiltinSerializersKt.getNullable((KSerializer)var1[4].getValue())
};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 73243450919707L;
long var10001 = var3 ^ 135440740217645L;
int var5 = (int)((var3 ^ 135440740217645L) >>> 48);
int var6 = (int)((var3 ^ 135440740217645L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
this.g((short)var5, encoder, var6, var7, (yq)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 87403435622376L;
long var4 = var2 ^ 55028198581152L;
return this.B(decoder, var4);
}

static {
long var20 = a ^ 104040963157268L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "k\u009bªG¼ÍEò\u0097Ëªd;§{\u0089\u0010&å\u0013X\u0014{õ{\u0003g\u0013\u0094`±×\u0083\u0010\u009d\u0010ü.\u0096R\r !)²\u0092î°«= hÒsýî¤\u0017B<\u0088\u0082ë\u0081is:-½fxº\u0095vi\u001b_3°[gÇ\u0003\u0010¬\u0081k%å\u0000\u0004\u0014£uÈäC\u00965g\u0010c\u0083£ºÓcÍù4Q\u0016\u001a/\u008däW\u0010-\u0080WÇ.fÂê\u0088gþ®hPµ\u0091";
int var17 = "k\u009bªG¼ÍEò\u0097Ëªd;§{\u0089\u0010&å\u0013X\u0014{õ{\u0003g\u0013\u0094`±×\u0083\u0010\u009d\u0010ü.\u0096R\r !)²\u0092î°«= hÒsýî¤\u0017B<\u0088\u0082ë\u0081is:-½fxº\u0095vi\u001b_3°[gÇ\u0003\u0010¬\u0081k%å\u0000\u0004\u0014£uÈäC\u00965g\u0010c\u0083£ºÓcÍù4Q\u0016\u001a/\u008däW\u0010-\u0080WÇ.fÂê\u0088gþ®hPµ\u0091"
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
c = new String[9];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "9B\u009eMOç§\u009e_\u009d\u0017à&PñÜ";
int var5 = "9B\u009eMOç§\u009e_\u009d\u0017à&PñÜ".length();
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
f = new Integer[4];
M = new bd();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(a<"r">(24304, 7315060506166779872L ^ var20), M, 5);
var22.addElement(a<"r">(2578, 175113823789189888L ^ var20), false);
var22.addElement(a<"r">(29387, 248410791589016542L ^ var20), false);
var22.addElement(a<"r">(1563, 9155500238702905088L ^ var20), false);
var22.addElement(a<"r">(16464, 2075038323323683140L ^ var20), false);
var22.addElement(a<"r">(22762, 7510384355378158076L ^ var20), false);
X = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "T\u0084}~ã\u0091§í\u0081tC\u0001\u001a\u0084\u0080\u0018";
var5 = "T\u0084}~ã\u0091§í\u0081tC\u0001\u001a\u0084\u0080\u0018".length();
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

var15 = "'µ\u008f\u001dúá\u001d8\u009fßÅ\u0016ìý\u0003e\u0018g*`Â×ò+\u0003ÆÑ\u007fÓ\u0090\u0080ún\u0094\u0010\u0083\u0007`\u0093\u0082g";
var17 = "'µ\u008f\u001dúá\u001d8\u009fßÅ\u0016ìý\u0003e\u0018g*`Â×ò+\u0003ÆÑ\u007fÓ\u0090\u0080ún\u0094\u0010\u0083\u0007`\u0093\u0082g".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15742;
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
throw new RuntimeException("su/catlean/bd", var10);
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
throw new RuntimeException("su/catlean/bd" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3730;
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
throw new RuntimeException("su/catlean/bd", var14);
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
throw new RuntimeException("su/catlean/bd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
