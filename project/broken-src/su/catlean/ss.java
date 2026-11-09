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
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class ss implements GeneratedSerializer {
@NotNull
public static final ss B;
@NotNull
private static final SerialDescriptor a;
private static int[] s;
private static final long b = yz.a(2048381505463177781L, 992294576496061884L, MethodHandles.lookup().lookupClass()).a(262362797778263L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

private ss() {
}

public final void a(@NotNull Encoder encoder, int a, @NotNull lj value, char a, char a) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ b;
long var10001 = var6 ^ 30643440529658L;
int var8 = (int)((var6 ^ 30643440529658L) >>> 32);
int var9 = (int)((var6 ^ 30643440529658L) << 32 >>> 56);
int var10 = (int)(var10001 << 40 >>> 40);
Intrinsics.checkNotNullParameter(encoder, a<"p">(27671, 5537915725263817193L ^ var6));
Intrinsics.checkNotNullParameter(value, a<"p">(30465, 3008824880945222397L ^ var6));
SerialDescriptor var11 = a;
CompositeEncoder var12 = encoder.beginStructure(var11);
lj.F(value, var12, var8, (byte)var9, var11, var10);
var12.endStructure(var11);
}

@NotNull
public final lj G(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ss.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 121243585421375
// 00b: lxor
// 00c: dup2
// 00d: bipush 8
// 00f: lushr
// 010: lstore 4
// 012: dup2
// 013: bipush 56
// 015: lshl
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: pop2
// 01d: pop2
// 01e: aload 3
// 01f: sipush 24357
// 022: ldc2_w 330968148553982397
// 025: lload 1
// 026: lxor
// 027: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/ss.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02f: ldc2_w 9128728168064762906
// 032: lload 1
// 033: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: getstatic su/catlean/ss.a Lkotlinx/serialization/descriptors/SerialDescriptor;
// 03b: astore 8
// 03d: bipush 1
// 03e: istore 9
// 040: bipush 0
// 041: istore 11
// 043: bipush 0
// 044: istore 12
// 046: astore 7
// 048: bipush 0
// 049: istore 13
// 04b: bipush 0
// 04c: istore 14
// 04e: aload 3
// 04f: aload 8
// 051: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 056: astore 15
// 058: aload 15
// 05a: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05f: aload 7
// 061: ifnonnull 0d1
// 064: ifeq 0cf
// 067: goto 074
// 06a: ldc2_w 9148196006596723812
// 06d: lload 1
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: aload 15
// 076: aload 8
// 078: bipush 0
// 079: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 07e: istore 12
// 080: iload 11
// 082: bipush 1
// 083: ior
// 084: istore 11
// 086: aload 15
// 088: aload 8
// 08a: bipush 1
// 08b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 090: istore 13
// 092: iload 11
// 094: bipush 2
// 095: ior
// 096: istore 11
// 098: aload 15
// 09a: aload 8
// 09c: lload 1
// 09d: lconst_0
// 09e: lcmp
// 09f: ifle 195
// 0a2: bipush 2
// 0a3: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0a8: istore 14
// 0aa: iload 11
// 0ac: bipush 4
// 0ad: ior
// 0ae: istore 11
// 0b0: aload 7
// 0b2: ifnull 191
// 0b5: bipush 5
// 0b6: anewarray 243
// 0b9: ldc2_w 9135420271706141946
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: goto 0cf
// 0c5: ldc2_w 9148196006596723812
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: iload 9
// 0d1: ifeq 191
// 0d4: aload 15
// 0d6: aload 8
// 0d8: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0dd: istore 10
// 0df: aload 7
// 0e1: ifnonnull 19a
// 0e4: iload 10
// 0e6: aload 7
// 0e8: ifnonnull 123
// 0eb: goto 0f8
// 0ee: ldc2_w 9148196006596723812
// 0f1: lload 1
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: tableswitch 137 -1 2 42 56 85 114
// 118: ldc2_w 9148196006596723812
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: bipush 0
// 123: istore 9
// 125: aload 7
// 127: lload 1
// 128: lconst_0
// 129: lcmp
// 12a: ifle 144
// 12d: ifnull 0cf
// 130: aload 15
// 132: aload 8
// 134: bipush 0
// 135: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)I 3
// 13a: istore 12
// 13c: iload 11
// 13e: bipush 1
// 13f: ior
// 140: istore 11
// 142: aload 7
// 144: lload 1
// 145: lconst_0
// 146: lcmp
// 147: ifle 161
// 14a: ifnull 0cf
// 14d: aload 15
// 14f: aload 8
// 151: bipush 1
// 152: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 157: istore 13
// 159: iload 11
// 15b: bipush 2
// 15c: ior
// 15d: istore 11
// 15f: aload 7
// 161: lload 1
// 162: lconst_0
// 163: lcmp
// 164: iflt 17e
// 167: ifnull 0cf
// 16a: aload 15
// 16c: aload 8
// 16e: bipush 2
// 16f: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 174: istore 14
// 176: iload 11
// 178: bipush 4
// 179: ior
// 17a: istore 11
// 17c: aload 7
// 17e: ifnull 0cf
// 181: lload 1
// 182: lconst_0
// 183: lcmp
// 184: ifle 191
// 187: new kotlinx/serialization/UnknownFieldException
// 18a: dup
// 18b: iload 10
// 18d: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 190: athrow
// 191: aload 15
// 193: aload 8
// 195: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 19a: new su/catlean/lj
// 19d: dup
// 19e: iload 11
// 1a0: iload 12
// 1a2: iload 13
// 1a4: lload 4
// 1a6: iload 14
// 1a8: aconst_null
// 1a9: iload 6
// 1ab: i2b
// 1ac: invokespecial su/catlean/lj.<init> (IIZJZLkotlinx/serialization/internal/SerializationConstructorMarker;B)V
// 1af: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return a;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = b ^ 96481669764274L;
long var10001 = var3 ^ 120955835101233L;
int var5 = (int)((var3 ^ 120955835101233L) >>> 32);
int var6 = (int)((var3 ^ 120955835101233L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
this.a(encoder, var5, (lj)value, (char)var6, (char)var7);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = b ^ 31638901248471L;
long var4 = var2 ^ 38015044365879L;
return this.G(var4, decoder);
}

static {
long var9 = b ^ 96928580885022L;
int[] var10000 = new int[2];
vm.a<"Å">(var10000, -2532393369658322489L, var9);
Cipher var0;
Cipher var14 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[7];
int var5 = 0;
String var4 = "n;¿þHsôgõXÚ\u0019¡\u0017¿¤\u0010h6{Ú\u0087Ë´¸x\u0010ù\u001c#fû\u0013\u0010cî×\u0092T¼Ä¡Ùrf\u008cc¤Ë}\u0010\u0005A°\u0001ó\u000f ¹\u0086\u0085}È\u0097`\u0098T\u0010\"\u0088³º\u007fäÜ »üR\u0001(\u001d\u008aã";
int var6 = "n;¿þHsôgõXÚ\u0019¡\u0017¿¤\u0010h6{Ú\u0087Ë´¸x\u0010ù\u001c#fû\u0013\u0010cî×\u0092T¼Ä¡Ùrf\u008cc¤Ë}\u0010\u0005A°\u0001ó\u000f ¹\u0086\u0085}È\u0097`\u0098T\u0010\"\u0088³º\u007fäÜ »üR\u0001(\u001d\u008aã"
.length();
char var3 = 16;
int var13 = -1;

label27:
while (true) {
String var15 = var4.substring(++var13, var13 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var13 += var3) >= var6) {
c = var7;
d = new String[7];
B = new ss();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"p">(14579, 3944991887421121959L ^ var9), B, 3);
var11.addElement(a<"p">(30689, 1766854896587729585L ^ var9), true);
var11.addElement(a<"p">(25008, 1965600276545502433L ^ var9), true);
var11.addElement(a<"p">(32433, 5288207420311561186L ^ var9), true);
a = var11;
return;
}

var3 = var4.charAt(var13);
break;
default:
var7[var5++] = var21;
if ((var13 += var3) < var6) {
var3 = var4.charAt(var13);
continue label27;
}

var4 = "x\u0098f\u0091\u008fd\u0015,ü%n\u0013å\u008aÞ\u0007ª¹ê\u000fÃÏé.<i\u007f\u0080Y:b\u0011\u0010!ÇË}\bà{«C\u0007\u0018\u001f\u0094À\u0012ü";
var6 = "x\u0098f\u0091\u008fd\u0015,ü%n\u0013å\u008aÞ\u0007ª¹ê\u000fÃÏé.<i\u007f\u0080Y:b\u0011\u0010!ÇË}\bà{«C\u0007\u0018\u001f\u0094À\u0012ü".length();
var3 = ' ';
var13 = -1;
}

var15 = var4.substring(++var13, var13 + var3);
var10001 = 0;
}
}
}

public static void c(int[] var0) {
s = var0;
}

public static int[] h() {
return s;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16763;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ss", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/ss" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
