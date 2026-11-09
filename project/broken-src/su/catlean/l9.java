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
public final class l9 implements GeneratedSerializer {
@NotNull
public static final l9 A;
@NotNull
private static final SerialDescriptor M;
private static final long a = yz.a(5649856968658319815L, 4530499556729357631L, MethodHandles.lookup().lookupClass()).a(68262269677789L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private l9() {
}

public final void s(long a, @NotNull Encoder encoder, @NotNull sl value) {
ax = a ^ ax;
long var5 = ax ^ 3698476273563L;
Intrinsics.checkNotNullParameter(encoder, a<"r">(3354, 5619828334205616631L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"r">(1395, 1633496669208824208L ^ ax));
SerialDescriptor var7 = M;
CompositeEncoder var8 = encoder.beginStructure(var7);
sl.X(value, var8, var5, var7);
var8.endStructure(var7);
}

@NotNull
public final sl x(int a, int a, @NotNull Decoder decoder, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/l9.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 106813547343449
// 024: lxor
// 025: lstore 7
// 027: pop2
// 028: aload 3
// 029: sipush 7439
// 02c: ldc2_w 3620088830414943971
// 02f: lload 5
// 031: lxor
// 032: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/l9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: getstatic su/catlean/l9.M Lkotlinx/serialization/descriptors/SerialDescriptor;
// 03d: astore 10
// 03f: bipush 1
// 040: istore 11
// 042: bipush 0
// 043: istore 13
// 045: aconst_null
// 046: astore 14
// 048: ldc2_w -8566287750310670378
// 04b: lload 5
// 04d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: aconst_null
// 053: astore 15
// 055: aconst_null
// 056: astore 16
// 058: astore 9
// 05a: aconst_null
// 05b: astore 17
// 05d: bipush 0
// 05e: istore 18
// 060: aload 3
// 061: aload 10
// 063: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 068: astore 19
// 06a: aload 19
// 06c: aload 9
// 06e: ifnull 097
// 071: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 076: ifeq 112
// 079: goto 087
// 07c: ldc2_w -8535518443570694150
// 07f: lload 5
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: aload 19
// 089: goto 097
// 08c: ldc2_w -8535518443570694150
// 08f: lload 5
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: aload 10
// 099: bipush 0
// 09a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 09f: astore 14
// 0a1: iload 13
// 0a3: bipush 1
// 0a4: ior
// 0a5: istore 13
// 0a7: aload 19
// 0a9: aload 10
// 0ab: bipush 1
// 0ac: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0b1: astore 15
// 0b3: iload 13
// 0b5: bipush 2
// 0b6: ior
// 0b7: istore 13
// 0b9: aload 19
// 0bb: aload 10
// 0bd: bipush 2
// 0be: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0c3: astore 16
// 0c5: iload 13
// 0c7: bipush 4
// 0c8: ior
// 0c9: istore 13
// 0cb: aload 19
// 0cd: aload 10
// 0cf: bipush 3
// 0d0: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0d5: astore 17
// 0d7: iload 13
// 0d9: bipush 68
// 0db: ldc2_w 8456014376578411306
// 0de: lload 5
// 0e0: lxor
// 0e1: invokedynamic y (IJ)I bsm=su/catlean/l9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: ior
// 0e7: istore 13
// 0e9: aload 19
// 0eb: aload 10
// 0ed: iload 4
// 0ef: ifle 238
// 0f2: bipush 4
// 0f3: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0f8: istore 18
// 0fa: iload 13
// 0fc: sipush 15065
// 0ff: ldc2_w 108220589908251061
// 102: lload 5
// 104: lxor
// 105: invokedynamic y (IJ)I bsm=su/catlean/l9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: ior
// 10b: istore 13
// 10d: aload 9
// 10f: ifnonnull 234
// 112: iload 11
// 114: ifeq 234
// 117: goto 125
// 11a: ldc2_w -8535518443570694150
// 11d: lload 5
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 19
// 127: aload 10
// 129: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 12e: istore 12
// 130: aload 9
// 132: ifnull 23d
// 135: iload 12
// 137: aload 9
// 139: ifnull 17c
// 13c: goto 14a
// 13f: ldc2_w -8535518443570694150
// 142: lload 5
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: tableswitch 220 -1 4 49 61 89 117 144 184
// 170: ldc2_w -8535518443570694150
// 173: lload 5
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: bipush 0
// 17c: istore 11
// 17e: aload 9
// 180: iload 1
// 181: iflt 19b
// 184: ifnonnull 112
// 187: aload 19
// 189: aload 10
// 18b: bipush 0
// 18c: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 191: astore 14
// 193: iload 13
// 195: bipush 1
// 196: ior
// 197: istore 13
// 199: aload 9
// 19b: iload 4
// 19d: ifle 1b7
// 1a0: ifnonnull 112
// 1a3: aload 19
// 1a5: aload 10
// 1a7: bipush 1
// 1a8: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1ad: astore 15
// 1af: iload 13
// 1b1: bipush 2
// 1b2: ior
// 1b3: istore 13
// 1b5: aload 9
// 1b7: iload 4
// 1b9: ifle 1d3
// 1bc: ifnonnull 112
// 1bf: aload 19
// 1c1: aload 10
// 1c3: bipush 2
// 1c4: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1c9: astore 16
// 1cb: iload 13
// 1cd: bipush 4
// 1ce: ior
// 1cf: istore 13
// 1d1: aload 9
// 1d3: iload 2
// 1d4: ifle 1fb
// 1d7: ifnonnull 112
// 1da: aload 19
// 1dc: aload 10
// 1de: bipush 3
// 1df: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 1e4: astore 17
// 1e6: iload 13
// 1e8: sipush 3067
// 1eb: ldc2_w 6860509304492023958
// 1ee: lload 5
// 1f0: lxor
// 1f1: invokedynamic y (IJ)I bsm=su/catlean/l9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: ior
// 1f7: istore 13
// 1f9: aload 9
// 1fb: iload 2
// 1fc: iflt 223
// 1ff: ifnonnull 112
// 202: aload 19
// 204: aload 10
// 206: bipush 4
// 207: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 20c: istore 18
// 20e: iload 13
// 210: sipush 20193
// 213: ldc2_w 4868498346487031182
// 216: lload 5
// 218: lxor
// 219: invokedynamic y (IJ)I bsm=su/catlean/l9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: ior
// 21f: istore 13
// 221: aload 9
// 223: ifnonnull 112
// 226: iload 1
// 227: iflt 130
// 22a: new kotlinx/serialization/UnknownFieldException
// 22d: dup
// 22e: iload 12
// 230: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 233: athrow
// 234: aload 19
// 236: aload 10
// 238: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 23d: new su/catlean/sl
// 240: dup
// 241: iload 13
// 243: aload 14
// 245: aload 15
// 247: aload 16
// 249: aload 17
// 24b: iload 18
// 24d: lload 7
// 24f: aconst_null
// 250: invokespecial su/catlean/sl.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 253: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return M;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{
StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE
};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 100495299802745L;
long var5 = var3 ^ 138429878163734L;
this.s(var5, encoder, (sl)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 106000181899394L;
long var10001 = var2 ^ 75003156936939L;
int var4 = (int)((var2 ^ 75003156936939L) >>> 32);
int var5 = (int)((var2 ^ 75003156936939L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
return this.x(var4, var5, decoder, var6);
}

static {
long var20 = a ^ 129640965485749L;
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
String var15 = "|®_à\u0099|9\u0010\u0082[Ïù¡j?ÄqZc²¢\u0018F¡\u0010\u0000a\u0097 ±û\u009bÀ£ø0;Ùgëà ØþÕ\u00040f\u0019\u000fUH»º\u0090\u0081É\u009ck#ª¬ì\rÄ±?=Zímq³\u008a(Iº\u0010ù7\u0099\u008f:ù\u0010$¢6\u0010ô\u0003DT\u008epýÃÓ\u0087Üd^GÓ~îÚwÃ¥Cïiÿ4\u0018k\u0095Ý\rN1Òü¶Æ\u0096i®®ÿ!©\rÚ\u00015]M\u001a (ñ\u0088À\u001d4Yã\fÌ±3&~Þ½Òí8é]\u009d\u0091Ða¼ù\r~Î`3\u0010\u0004Y\u009eÊÖ³Ó´a|\u008c¨\nÝAä";
int var17 = "|®_à\u0099|9\u0010\u0082[Ïù¡j?ÄqZc²¢\u0018F¡\u0010\u0000a\u0097 ±û\u009bÀ£ø0;Ùgëà ØþÕ\u00040f\u0019\u000fUH»º\u0090\u0081É\u009ck#ª¬ì\rÄ±?=Zímq³\u008a(Iº\u0010ù7\u0099\u008f:ù\u0010$¢6\u0010ô\u0003DT\u008epýÃÓ\u0087Üd^GÓ~îÚwÃ¥Cïiÿ4\u0018k\u0095Ý\rN1Òü¶Æ\u0096i®®ÿ!©\rÚ\u00015]M\u001a (ñ\u0088À\u001d4Yã\fÌ±3&~Þ½Òí8é]\u009d\u0091Ða¼ù\r~Î`3\u0010\u0004Y\u009eÊÖ³Ó´a|\u008c¨\nÝAä"
.length();
char var14 = 24;
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
String var4 = "_Cq\u0090L\u0094NáL¤N¤\u0085\u009bÈø";
int var5 = "_Cq\u0090L\u0094NáL¤N¤\u0085\u009bÈø".length();
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
A = new l9();
PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(a<"r">(549, 7525497285206286093L ^ var20), A, 5);
var22.addElement(a<"r">(20097, 2294296532136481707L ^ var20), true);
var22.addElement(a<"r">(31397, 4622528015715755914L ^ var20), true);
var22.addElement(a<"r">(14747, 4488622281663947954L ^ var20), true);
var22.addElement(a<"r">(29107, 2843184277136403613L ^ var20), true);
var22.addElement(a<"r">(5972, 6221780962136885881L ^ var20), true);
M = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "\u0019,Bø3Û\u0018øí\u0094jkÃ\u0086\"¨";
var5 = "\u0019,Bø3Û\u0018øí\u0094jkÃ\u0086\"¨".length();
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

var15 = "2C\u008a¢ºÂéö\u009c_¾\u007fí\"øqä\u008d\u0081å&ÆñFÐ¬\u000f \u0088\u008c+¾\u0010ËMÙûû·ßc³]´#DÙSÑ";
var17 = "2C\u008a¢ºÂéö\u009c_¾\u007fí\"øqä\u008d\u0081å&ÆñFÐ¬\u000f \u0088\u008c+¾\u0010ËMÙûû·ßc³]´#DÙSÑ".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25476;
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
throw new RuntimeException("su/catlean/l9", var10);
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
throw new RuntimeException("su/catlean/l9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25348;
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
throw new RuntimeException("su/catlean/l9", var14);
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
throw new RuntimeException("su/catlean/l9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
