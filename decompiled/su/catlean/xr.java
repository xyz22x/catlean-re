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
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $VF: synthetic class
@Deprecated(
message = "This synthesized declaration should not be used directly",
level = DeprecationLevel.HIDDEN
)
public final class xr implements GeneratedSerializer {
@NotNull
public static final xr N;
@NotNull
private static final SerialDescriptor y;
private static final long a = yz.a(-4667064007167709103L, -441685530707106909L, MethodHandles.lookup().lookupClass()).a(259281605923610L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private xr() {
}

public final void F(long a, @NotNull Encoder encoder, @NotNull f4 value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(encoder, a<"g">(2288, 1071354830039329631L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"g">(5586, 5899096650452481659L ^ ax));
SerialDescriptor var5 = y;
CompositeEncoder var6 = encoder.beginStructure(var5);
f4.C(value, var6, var5);
var6.endStructure(var5);
}

@NotNull
public final f4 l(@NotNull Decoder decoder, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/xr.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 32055330976694
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 8044579273215624578
// 012: lload 2
// 013: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 11090
// 01c: ldc2_w 6674280565968242458
// 01f: lload 2
// 020: lxor
// 021: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: getstatic su/catlean/xr.y Lkotlinx/serialization/descriptors/SerialDescriptor;
// 02c: astore 7
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: aconst_null
// 035: astore 11
// 037: astore 6
// 039: aconst_null
// 03a: astore 12
// 03c: aconst_null
// 03d: astore 13
// 03f: aload 1
// 040: aload 7
// 042: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 047: astore 14
// 049: invokestatic su/catlean/f4.w ()[Lkotlin/Lazy;
// 04c: astore 15
// 04e: aload 14
// 050: aload 6
// 052: ifnonnull 08f
// 055: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 05a: ifeq 0ff
// 05d: goto 06a
// 060: ldc2_w 8014260525289701527
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: aload 14
// 06c: aload 7
// 06e: bipush 0
// 06f: aload 15
// 071: bipush 0
// 072: aaload
// 073: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 078: checkcast kotlinx/serialization/DeserializationStrategy
// 07b: aload 11
// 07d: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 082: goto 08f
// 085: ldc2_w 8014260525289701527
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: checkcast su/catlean/d1
// 092: astore 11
// 094: iload 10
// 096: bipush 1
// 097: ior
// 098: istore 10
// 09a: aload 14
// 09c: aload 7
// 09e: bipush 1
// 09f: aload 15
// 0a1: bipush 1
// 0a2: aaload
// 0a3: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 0a8: checkcast kotlinx/serialization/DeserializationStrategy
// 0ab: aload 12
// 0ad: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0b2: checkcast su/catlean/aw
// 0b5: astore 12
// 0b7: iload 10
// 0b9: bipush 2
// 0ba: ior
// 0bb: istore 10
// 0bd: aload 14
// 0bf: aload 7
// 0c1: bipush 2
// 0c2: getstatic su/catlean/zb.K Lsu/catlean/zb;
// 0c5: checkcast kotlinx/serialization/DeserializationStrategy
// 0c8: aload 13
// 0ca: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 0cf: checkcast su/catlean/y9
// 0d2: astore 13
// 0d4: iload 10
// 0d6: bipush 4
// 0d7: ior
// 0d8: istore 10
// 0da: lload 2
// 0db: lconst_0
// 0dc: lcmp
// 0dd: ifle 0f2
// 0e0: aload 6
// 0e2: ifnull 1ee
// 0e5: bipush 1
// 0e6: anewarray 102
// 0e9: ldc2_w 8065306126216291792
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: goto 0ff
// 0f5: ldc2_w 8014260525289701527
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: iload 8
// 101: ifeq 1ee
// 104: aload 14
// 106: aload 7
// 108: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 10d: istore 9
// 10f: aload 6
// 111: ifnonnull 1f7
// 114: iload 9
// 116: aload 6
// 118: ifnonnull 153
// 11b: goto 128
// 11e: ldc2_w 8014260525289701527
// 121: lload 2
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: tableswitch 182 -1 2 42 56 102 148
// 148: ldc2_w 8014260525289701527
// 14b: lload 2
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: bipush 0
// 153: istore 8
// 155: aload 6
// 157: lload 2
// 158: lconst_0
// 159: lcmp
// 15a: ifle 185
// 15d: ifnull 0ff
// 160: aload 14
// 162: aload 7
// 164: bipush 0
// 165: aload 15
// 167: bipush 0
// 168: aaload
// 169: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 16e: checkcast kotlinx/serialization/DeserializationStrategy
// 171: aload 11
// 173: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 178: checkcast su/catlean/d1
// 17b: astore 11
// 17d: iload 10
// 17f: bipush 1
// 180: ior
// 181: istore 10
// 183: aload 6
// 185: lload 2
// 186: lconst_0
// 187: lcmp
// 188: ifle 1b3
// 18b: ifnull 0ff
// 18e: aload 14
// 190: aload 7
// 192: bipush 1
// 193: aload 15
// 195: bipush 1
// 196: aaload
// 197: invokeinterface kotlin/Lazy.getValue ()Ljava/lang/Object; 1
// 19c: checkcast kotlinx/serialization/DeserializationStrategy
// 19f: aload 12
// 1a1: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeNullableSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1a6: checkcast su/catlean/aw
// 1a9: astore 12
// 1ab: iload 10
// 1ad: bipush 2
// 1ae: ior
// 1af: istore 10
// 1b1: aload 6
// 1b3: lload 2
// 1b4: lconst_0
// 1b5: lcmp
// 1b6: iflt 1db
// 1b9: ifnull 0ff
// 1bc: aload 14
// 1be: aload 7
// 1c0: bipush 2
// 1c1: getstatic su/catlean/zb.K Lsu/catlean/zb;
// 1c4: checkcast kotlinx/serialization/DeserializationStrategy
// 1c7: aload 13
// 1c9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSerializableElement (Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object; 5
// 1ce: checkcast su/catlean/y9
// 1d1: astore 13
// 1d3: iload 10
// 1d5: bipush 4
// 1d6: ior
// 1d7: istore 10
// 1d9: aload 6
// 1db: ifnull 0ff
// 1de: new kotlinx/serialization/UnknownFieldException
// 1e1: dup
// 1e2: iload 9
// 1e4: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 1e7: lload 2
// 1e8: lconst_0
// 1e9: lcmp
// 1ea: iflt 178
// 1ed: athrow
// 1ee: aload 14
// 1f0: aload 7
// 1f2: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 1f7: new su/catlean/f4
// 1fa: dup
// 1fb: iload 10
// 1fd: aload 11
// 1ff: aload 12
// 201: aload 13
// 203: lload 4
// 205: aconst_null
// 206: invokespecial su/catlean/f4.<init> (ILsu/catlean/d1;Lsu/catlean/aw;Lsu/catlean/y9;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 209: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return y;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
Lazy[] var1 = f4.w();
return new KSerializer[]{
BuiltinSerializersKt.getNullable((KSerializer)var1[0].getValue()), BuiltinSerializersKt.getNullable((KSerializer)var1[1].getValue()), zb.K
};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 50202912419571L;
long var5 = var3 ^ 75266351206362L;
this.F(var5, encoder, (f4)value);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 47603986060283L;
long var4 = var2 ^ 40112645193009L;
return this.l(decoder, var4);
}

static {
long var9 = a ^ 26602687243173L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[7];
int var5 = 0;
String var4 = "Ò\u0003Ñ6ÙüzÔÔs·Ízßi\u0003\u0010,ðaK\u0088\u001e\u0019ïA½\u008f\bðf\u0098F\u00102f\u001bC\u000fV\rV\r²>[êÂ\n¶\u0010û\u009cï#õß\u001aYþå\u0085÷\u009cá`n\u0010\u0004#ö\u0088\u0085ÂÛèý*¤\r^g\u001d\u0007";
int var6 = "Ò\u0003Ñ6ÙüzÔÔs·Ízßi\u0003\u0010,ðaK\u0088\u001e\u0019ïA½\u008f\bðf\u0098F\u00102f\u001bC\u000fV\rV\r²>[êÂ\n¶\u0010û\u009cï#õß\u001aYþå\u0085÷\u009cá`n\u0010\u0004#ö\u0088\u0085ÂÛèý*¤\r^g\u001d\u0007"
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
c = new String[7];
N = new xr();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"g">(13104, 7930846958679069993L ^ var9), N, 3);
var11.addElement(a<"g">(8435, 7820581636972545768L ^ var9), false);
var11.addElement(a<"g">(13272, 3126375460323759557L ^ var9), false);
var11.addElement(a<"g">(12892, 2710263703583233091L ^ var9), false);
y = var11;
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

var4 = "¯m\u0092AÙ\u0088ÁÔhh\u001bW6¡4) îò@\u001d\u001e¼\u0083Úÿd\u001aé^x\u0088àå`ÅíýêËÄ§\"\u009a&n\u0086`%";
var6 = "¯m\u0092AÙ\u0088ÁÔhh\u001bW6¡4) îò@\u001d\u001e¼\u0083Úÿd\u001aé^x\u0088àå`ÅíýêËÄ§\"\u009a&n\u0086`%".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17027;
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
throw new RuntimeException("su/catlean/xr", var10);
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
throw new RuntimeException("su/catlean/xr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
