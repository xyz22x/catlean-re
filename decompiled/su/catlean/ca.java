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
public final class ca implements GeneratedSerializer {
@NotNull
public static final ca N;
@NotNull
private static final SerialDescriptor n;
private static final long a = yz.a(-1028490024247149554L, -584545370306137975L, MethodHandles.lookup().lookupClass()).a(57316533129747L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private ca() {
}

public final void N(@NotNull Encoder encoder, long a, @NotNull ft value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"s">(13919, 7747631785842187225L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"s">(14020, 8410014963661675328L ^ ax));
SerialDescriptor var5 = n;
CompositeEncoder var6 = encoder.beginStructure(var5);
ft.l(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final ft e(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ca.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 29167782160425
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 1
// 010: sipush 2161
// 013: ldc2_w 3894520058585969623
// 016: lload 2
// 017: lxor
// 018: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/ca.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: getstatic su/catlean/ca.n Lkotlinx/serialization/descriptors/SerialDescriptor;
// 023: astore 7
// 025: ldc2_w 8446873031695791143
// 028: lload 2
// 029: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: aconst_null
// 035: astore 11
// 037: aconst_null
// 038: astore 12
// 03a: istore 6
// 03c: bipush 0
// 03d: istore 13
// 03f: aconst_null
// 040: astore 14
// 042: bipush 0
// 043: istore 15
// 045: aload 1
// 046: aload 7
// 048: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 04d: astore 16
// 04f: aload 16
// 051: iload 6
// 053: ifeq 07a
// 056: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05b: ifeq 100
// 05e: goto 06b
// 061: ldc2_w 8485693623448372787
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: aload 16
// 06d: goto 07a
// 070: ldc2_w 8485693623448372787
// 073: lload 2
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: aload 7
// 07c: bipush 0
// 07d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 082: astore 11
// 084: iload 10
// 086: bipush 1
// 087: ior
// 088: istore 10
// 08a: aload 16
// 08c: aload 7
// 08e: bipush 1
// 08f: getstatic su/catlean/ss.B Lsu/catlean/ss;
// 092: checkcast kotlinx/serialization/DeserializationStrategy
// 095: aload 12
// 097: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 09c: checkcast su/catlean/lj
// 09f: astore 12
// 0a1: iload 10
// 0a3: bipush 2
// 0a4: ior
// 0a5: istore 10
// 0a7: aload 16
// 0a9: aload 7
// 0ab: bipush 2
// 0ac: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0b1: istore 13
// 0b3: iload 10
// 0b5: bipush 4
// 0b6: ior
// 0b7: istore 10
// 0b9: aload 16
// 0bb: aload 7
// 0bd: bipush 3
// 0be: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0c3: astore 14
// 0c5: iload 10
// 0c7: sipush 18508
// 0ca: ldc2_w 1764673649757868080
// 0cd: lload 2
// 0ce: lxor
// 0cf: invokedynamic j (IJ)I bsm=su/catlean/ca.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: ior
// 0d5: istore 10
// 0d7: aload 16
// 0d9: aload 7
// 0db: lload 2
// 0dc: lconst_0
// 0dd: lcmp
// 0de: ifle 242
// 0e1: bipush 4
// 0e2: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0e7: istore 15
// 0e9: iload 10
// 0eb: sipush 15075
// 0ee: ldc2_w 9095391844620182174
// 0f1: lload 2
// 0f2: lxor
// 0f3: invokedynamic j (IJ)I bsm=su/catlean/ca.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: ior
// 0f9: istore 10
// 0fb: iload 6
// 0fd: ifne 23e
// 100: iload 8
// 102: ifeq 23e
// 105: goto 112
// 108: ldc2_w 8485693623448372787
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 16
// 114: aload 7
// 116: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 11b: istore 9
// 11d: iload 6
// 11f: lload 2
// 120: lconst_0
// 121: lcmp
// 122: ifle 12a
// 125: ifeq 247
// 128: iload 9
// 12a: lload 2
// 12b: lconst_0
// 12c: lcmp
// 12d: iflt 177
// 130: iload 6
// 132: ifeq 173
// 135: goto 142
// 138: ldc2_w 8485693623448372787
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: tableswitch 236 -1 4 48 62 91 131 160 201
// 168: ldc2_w 8485693623448372787
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: bipush 0
// 173: istore 8
// 175: iload 6
// 177: lload 2
// 178: lconst_0
// 179: lcmp
// 17a: ifle 194
// 17d: ifne 100
// 180: aload 16
// 182: aload 7
// 184: bipush 0
// 185: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 18a: astore 11
// 18c: iload 10
// 18e: bipush 1
// 18f: ior
// 190: istore 10
// 192: iload 6
// 194: lload 2
// 195: lconst_0
// 196: lcmp
// 197: ifle 1bc
// 19a: ifne 100
// 19d: aload 16
// 19f: aload 7
// 1a1: bipush 1
// 1a2: getstatic su/catlean/ss.B Lsu/catlean/ss;
// 1a5: checkcast kotlinx/serialization/DeserializationStrategy
// 1a8: aload 12
// 1aa: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1af: checkcast su/catlean/lj
// 1b2: astore 12
// 1b4: iload 10
// 1b6: bipush 2
// 1b7: ior
// 1b8: istore 10
// 1ba: iload 6
// 1bc: lload 2
// 1bd: lconst_0
// 1be: lcmp
// 1bf: iflt 1d9
// 1c2: ifne 100
// 1c5: aload 16
// 1c7: aload 7
// 1c9: bipush 2
// 1ca: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 1cf: istore 13
// 1d1: iload 10
// 1d3: bipush 4
// 1d4: ior
// 1d5: istore 10
// 1d7: iload 6
// 1d9: lload 2
// 1da: lconst_0
// 1db: lcmp
// 1dc: iflt 202
// 1df: ifne 100
// 1e2: aload 16
// 1e4: aload 7
// 1e6: bipush 3
// 1e7: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1ec: astore 14
// 1ee: iload 10
// 1f0: sipush 653
// 1f3: ldc2_w 5679271114657897202
// 1f6: lload 2
// 1f7: lxor
// 1f8: invokedynamic j (IJ)I bsm=su/catlean/ca.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: ior
// 1fe: istore 10
// 200: iload 6
// 202: lload 2
// 203: lconst_0
// 204: lcmp
// 205: ifle 22b
// 208: ifne 100
// 20b: aload 16
// 20d: aload 7
// 20f: bipush 4
// 210: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 215: istore 15
// 217: iload 10
// 219: sipush 20114
// 21c: ldc2_w 3307233221219210988
// 21f: lload 2
// 220: lxor
// 221: invokedynamic j (IJ)I bsm=su/catlean/ca.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: ior
// 227: istore 10
// 229: iload 6
// 22b: ifne 100
// 22e: new kotlinx/serialization/UnknownFieldException
// 231: dup
// 232: iload 9
// 234: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 237: lload 2
// 238: lconst_0
// 239: lcmp
// 23a: iflt 1af
// 23d: athrow
// 23e: aload 16
// 240: aload 7
// 242: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 247: new su/catlean/ft
// 24a: dup
// 24b: iload 10
// 24d: aload 11
// 24f: aload 12
// 251: iload 13
// 253: aload 14
// 255: iload 15
// 257: aconst_null
// 258: lload 4
// 25a: invokespecial su/catlean/ft.<init> (ILjava/lang/String;Lsu/catlean/lj;ZLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;J)V
// 25d: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return n;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{StringSerializer.INSTANCE, ss.B, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 88767210899572L;
long var5 = var3 ^ 127199342881447L;
this.N(encoder, var5, (ft)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 96691316106480L;
long var4 = var2 ^ 100840540786688L;
return this.e(decoder, var4);
}

static {
long var20 = a ^ 44104586618854L;
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
String var15 = "ÃÃ{vv?}®R¨çÝw\f \u001c\u0010yk\u0013+*K`Ä\u009a\u0094ì@\u009bZ2k\u0010^¦£¤\u0090\\Á³!\u0082\nÆð©Ê\u0018\u0010\u008eKY¨\u001e¡\u0003èKçJ*Ö§\f!\u0010sL\u0099ÒÒ\u0001~'\u0013\f©Û\u001dÿ\u008c& \rð(\u001e~ûnè>\u0081V \u001aZ\u0000áðS\u001d37{ÏRh6IË\u000b\u008d$\b\u0010m\u0083ûÊsÌ y8ãò¤\u0015$\u000b\u001a";
int var17 = "ÃÃ{vv?}®R¨çÝw\f \u001c\u0010yk\u0013+*K`Ä\u009a\u0094ì@\u009bZ2k\u0010^¦£¤\u0090\\Á³!\u0082\nÆð©Ê\u0018\u0010\u008eKY¨\u001e¡\u0003èKçJ*Ö§\f!\u0010sL\u0099ÒÒ\u0001~'\u0013\f©Û\u001dÿ\u008c& \rð(\u001e~ûnè>\u0081V \u001aZ\u0000áðS\u001d37{ÏRh6IË\u000b\u008d$\b\u0010m\u0083ûÊsÌ y8ãò¤\u0015$\u000b\u001a"
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
String var4 = "wv\u0085B\u0017\u0096%RÁNb\u0094Ë\u008f¼²";
int var5 = "wv\u0085B\u0017\u0096%RÁNb\u0094Ë\u008f¼²".length();
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
N = new ca();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(a<"s">(15884, 3797197683428475506L ^ var20), N, 5);
var22.addElement(a<"s">(11048, 1638228689181726544L ^ var20), false);
var22.addElement(a<"s">(22984, 6370390865322812850L ^ var20), false);
var22.addElement(a<"s">(10130, 4173538704291814369L ^ var20), false);
var22.addElement(a<"s">(17444, 1001168003480172639L ^ var20), false);
var22.addElement(a<"s">(10702, 1761662792938411447L ^ var20), false);
n = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "ó©g§\u0018\u009dÝ\u0083G<\u001bÄñ\u000e(à";
var5 = "ó©g§\u0018\u009dÝ\u0083G<\u001bÄñ\u000e(à".length();
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

var15 = "Le©úAð£¸\u008ffÕ>\u0092!*\u0090\u0010\u0095ñ/\u0003§FjWö3A\u0082ù¤=«";
var17 = "Le©úAð£¸\u008ffÕ>\u0092!*\u0090\u0010\u0095ñ/\u0003§FjWö3A\u0082ù¤=«".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3921;
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
throw new RuntimeException("su/catlean/ca", var10);
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
throw new RuntimeException("su/catlean/ca" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27788;
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
throw new RuntimeException("su/catlean/ca", var14);
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
throw new RuntimeException("su/catlean/ca" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
