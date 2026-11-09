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
public final class fn implements GeneratedSerializer {
@NotNull
public static final fn k;
@NotNull
private static final SerialDescriptor i;
private static final long a = yz.a(5860507367026198542L, 1860373817185736680L, MethodHandles.lookup().lookupClass()).a(240731730162171L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private fn() {
}

public final void Z(@NotNull Encoder encoder, @NotNull f0 value, long a) {
ax = a ^ ax;
long var5 = ax ^ 36658452284769L;
Intrinsics.checkNotNullParameter(encoder, a<"t">(15477, 1017267696254795746L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"t">(14940, 3193104701485758925L ^ ax));
SerialDescriptor var7 = i;
CompositeEncoder var8 = encoder.beginStructure(var7);
f0.j(var5, value, var8, var7);
var8.endStructure(var7);
}

@NotNull
public final f0 E(long a, @NotNull Decoder decoder) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/fn.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 34432843482945
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: aload 3
// 010: sipush 31098
// 013: ldc2_w 1855914257429399060
// 016: lload 1
// 017: lxor
// 018: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: getstatic su/catlean/fn.i Lkotlinx/serialization/descriptors/SerialDescriptor;
// 023: astore 7
// 025: ldc2_w 1761312055583552087
// 028: lload 1
// 029: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: bipush 1
// 02f: istore 8
// 031: bipush 0
// 032: istore 10
// 034: astore 6
// 036: aconst_null
// 037: astore 11
// 039: aconst_null
// 03a: astore 12
// 03c: aconst_null
// 03d: astore 13
// 03f: aload 3
// 040: aload 7
// 042: invokeinterface kotlinx/serialization/encoding/Decoder.beginStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder; 2
// 047: astore 14
// 049: aload 14
// 04b: aload 6
// 04d: ifnonnull 074
// 050: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeSequentially ()Z 1
// 055: ifeq 0b3
// 058: goto 065
// 05b: ldc2_w 1763394200325656757
// 05e: lload 1
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: aload 14
// 067: goto 074
// 06a: ldc2_w 1763394200325656757
// 06d: lload 1
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: aload 7
// 076: bipush 0
// 077: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 07c: astore 11
// 07e: iload 10
// 080: bipush 1
// 081: ior
// 082: istore 10
// 084: aload 14
// 086: aload 7
// 088: bipush 1
// 089: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 08e: astore 12
// 090: iload 10
// 092: bipush 2
// 093: ior
// 094: istore 10
// 096: aload 14
// 098: aload 7
// 09a: bipush 2
// 09b: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 0a0: astore 13
// 0a2: iload 10
// 0a4: bipush 4
// 0a5: ior
// 0a6: lload 1
// 0a7: lconst_0
// 0a8: lcmp
// 0a9: iflt 0b5
// 0ac: istore 10
// 0ae: aload 6
// 0b0: ifnull 181
// 0b3: iload 8
// 0b5: ifeq 181
// 0b8: goto 0c5
// 0bb: ldc2_w 1763394200325656757
// 0be: lload 1
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: aload 14
// 0c7: aload 7
// 0c9: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeElementIndex (Lkotlinx/serialization/descriptors/SerialDescriptor;)I 2
// 0ce: istore 9
// 0d0: aload 6
// 0d2: ifnonnull 18a
// 0d5: iload 9
// 0d7: aload 6
// 0d9: ifnonnull 113
// 0dc: goto 0e9
// 0df: ldc2_w 1763394200325656757
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: tableswitch 136 -1 2 41 55 84 113
// 108: ldc2_w 1763394200325656757
// 10b: lload 1
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlinx/serialization/UnknownFieldException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: bipush 0
// 113: istore 8
// 115: aload 6
// 117: lload 1
// 118: lconst_0
// 119: lcmp
// 11a: iflt 134
// 11d: ifnull 0b3
// 120: aload 14
// 122: aload 7
// 124: bipush 0
// 125: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 12a: astore 11
// 12c: iload 10
// 12e: bipush 1
// 12f: ior
// 130: istore 10
// 132: aload 6
// 134: lload 1
// 135: lconst_0
// 136: lcmp
// 137: iflt 151
// 13a: ifnull 0b3
// 13d: aload 14
// 13f: aload 7
// 141: bipush 1
// 142: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 147: astore 12
// 149: iload 10
// 14b: bipush 2
// 14c: ior
// 14d: istore 10
// 14f: aload 6
// 151: lload 1
// 152: lconst_0
// 153: lcmp
// 154: ifle 16e
// 157: ifnull 0b3
// 15a: aload 14
// 15c: aload 7
// 15e: bipush 2
// 15f: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.decodeStringElement (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String; 3
// 164: astore 13
// 166: iload 10
// 168: bipush 4
// 169: ior
// 16a: istore 10
// 16c: aload 6
// 16e: ifnull 0b3
// 171: lload 1
// 172: lconst_0
// 173: lcmp
// 174: iflt 0d0
// 177: new kotlinx/serialization/UnknownFieldException
// 17a: dup
// 17b: iload 9
// 17d: invokespecial kotlinx/serialization/UnknownFieldException.<init> (I)V
// 180: athrow
// 181: aload 14
// 183: aload 7
// 185: invokeinterface kotlinx/serialization/encoding/CompositeDecoder.endStructure (Lkotlinx/serialization/descriptors/SerialDescriptor;)V 2
// 18a: new su/catlean/f0
// 18d: dup
// 18e: iload 10
// 190: lload 4
// 192: aload 11
// 194: aload 12
// 196: aload 13
// 198: aconst_null
// 199: invokespecial su/catlean/f0.<init> (IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
// 19c: areturn
}

@NotNull
@Override
public final SerialDescriptor getDescriptor() {
return i;
}

@NotNull
@Override
public final KSerializer[] childSerializers() {
return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
}

@NotNull
@Override
public KSerializer[] typeParametersSerializers() {
return GeneratedSerializer.super.typeParametersSerializers();
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 16676417573948L;
long var5 = var3 ^ 32372493054427L;
this.Z(encoder, (f0)value, var5);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 36858811879783L;
long var4 = var2 ^ 96158109042808L;
return this.E(var4, decoder);
}

static {
long var9 = a ^ 116306720776939L;
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
String var4 = "\u0094ï\u009d·* \u001b\r½=\u000e\u0014AwúÔ\u0010\u0086A5¾\u009fKæóömÞ_jl\u0094×\u0010\u0015Hn\u0097#Ââï+Ãh©³êO5 ¿y\u0084IAzÀ;É\u0085é£®Ã\u008fÎ\u0097·\u009fà}Iü\u0086]RHl\u001aï\u0087ï\u0010\u000b\"¢ÂÎ\"·\u000b`dg%®\u0089'ê";
int var6 = "\u0094ï\u009d·* \u001b\r½=\u000e\u0014AwúÔ\u0010\u0086A5¾\u009fKæóömÞ_jl\u0094×\u0010\u0015Hn\u0097#Ââï+Ãh©³êO5 ¿y\u0084IAzÀ;É\u0085é£®Ã\u008fÎ\u0097·\u009fà}Iü\u0086]RHl\u001aï\u0087ï\u0010\u000b\"¢ÂÎ\"·\u000b`dg%®\u0089'ê"
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
k = new fn();
PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(a<"t">(17704, 7330751153835186591L ^ var9), k, 3);
var11.addElement(a<"t">(5178, 3797365255610386571L ^ var9), true);
var11.addElement(a<"t">(12503, 8145738282652986469L ^ var9), true);
var11.addElement(a<"t">(27378, 7332248474282866242L ^ var9), true);
i = var11;
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

var4 = "õ´È.\u0004\u0084n¨ä\u0017ÞÃ\u008c\u0093\"² ú#{\u0090ó£ºS\u000e²·*89ò\u0013\u001eÒk'\u000f\\Fæç-$ËÂÚm\u0001";
var6 = "õ´È.\u0004\u0084n¨ä\u0017ÞÃ\u008c\u0093\"² ú#{\u0090ó£ºS\u000e²·*89ò\u0013\u001eÒk'\u000f\\Fæç-$ËÂÚm\u0001".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26228;
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
throw new RuntimeException("su/catlean/fn", var10);
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
throw new RuntimeException("su/catlean/fn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
