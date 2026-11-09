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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.PrimitiveKind.STRING;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;

final class ls implements KSerializer {
@NotNull
private final SerialDescriptor z;
private static final long a = yz.a(8496499282509846615L, 4758659017180141203L, MethodHandles.lookup().lookupClass()).a(43132678878233L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public ls(long var1) {
var1 = a ^ var1;
super();
this.z = SerialDescriptorsKt.PrimitiveSerialDescriptor(a<"g">(22128, 5171355704502605333L ^ var1), STRING.INSTANCE);
}

@NotNull
@Override
public SerialDescriptor getDescriptor() {
return this.z;
}

@NotNull
public class_1792 D(long a, @NotNull Decoder decoder, short a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 16
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/ls.a J
// 011: lxor
// 012: lstore 5
// 014: aload 3
// 015: sipush 5689
// 018: ldc2_w 1998715166775463249
// 01b: lload 5
// 01d: lxor
// 01e: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ls.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 023: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 026: aload 3
// 027: invokeinterface kotlinx/serialization/encoding/Decoder.decodeString ()Ljava/lang/String; 1
// 02c: astore 8
// 02e: ldc2_w -6398261513928111547
// 031: lload 5
// 033: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: bipush 0
// 039: istore 9
// 03b: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
// 03e: dup
// 03f: sipush 30628
// 042: ldc2_w 874368852822273226
// 045: lload 5
// 047: lxor
// 048: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ls.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 050: checkcast java/lang/Iterable
// 053: astore 10
// 055: bipush 0
// 056: istore 11
// 058: aload 10
// 05a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 05f: astore 12
// 061: astore 7
// 063: aload 12
// 065: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06a: ifeq 09d
// 06d: aload 12
// 06f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 074: astore 13
// 076: aload 13
// 078: checkcast net/minecraft/class_1792
// 07b: astore 14
// 07d: bipush 0
// 07e: istore 15
// 080: aload 14
// 082: invokevirtual net/minecraft/class_1792.method_7876 ()Ljava/lang/String;
// 085: aload 8
// 087: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 08a: ifeq 063
// 08d: aload 13
// 08f: lload 1
// 090: lconst_0
// 091: lcmp
// 092: iflt 074
// 095: aload 7
// 097: ifnull 078
// 09a: goto 09e
// 09d: aconst_null
// 09e: checkcast net/minecraft/class_1792
// 0a1: iload 4
// 0a3: ifge 0e2
// 0a6: aload 7
// 0a8: ifnull 0e2
// 0ab: dup
// 0ac: ifnonnull 0e1
// 0af: goto 0bd
// 0b2: ldc2_w -6400648616016321795
// 0b5: lload 5
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: pop
// 0be: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 0c1: dup
// 0c2: sipush 25737
// 0c5: ldc2_w 2346600449295892450
// 0c8: lload 5
// 0ca: lxor
// 0cb: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ls.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d3: goto 0e1
// 0d6: ldc2_w -6400648616016321795
// 0d9: lload 5
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: nop
// 0e2: lload 1
// 0e3: lconst_0
// 0e4: lcmp
// 0e5: iflt 101
// 0e8: ldc2_w -6402491501738214988
// 0eb: lload 5
// 0ed: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: ifnull 10f
// 0f5: ldc "a2hPjc"
// 0f7: ldc2_w -6397119443319548031
// 0fa: lload 5
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: goto 10f
// 104: ldc2_w -6400648616016321795
// 107: lload 5
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: areturn
}

public void r(int a, int a, char a, @NotNull Encoder encoder, @NotNull class_1792 value) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(encoder, a<"g">(19908, 9075656501230694190L ^ var6));
Intrinsics.checkNotNullParameter(value, a<"g">(20283, 8261534491528195542L ^ var6));
String var10001 = value.method_7876();
Intrinsics.checkNotNullExpressionValue(var10001, a<"g">(7538, 4074156661853274012L ^ var6));
encoder.encodeString(var10001);
}

@Override
public Object deserialize(Decoder decoder) {
long var2 = a ^ 77662403484369L;
long var4 = (var2 ^ 19787272191141L) >>> 16;
int var6 = (int)((var2 ^ 19787272191141L) << 48 >>> 48);
return this.D(var4, decoder, (short)var6);
}

@Override
public void serialize(Encoder encoder, Object value) {
long var3 = a ^ 11453520267681L;
long var10001 = var3 ^ 118057154221650L;
int var5 = (int)((var3 ^ 118057154221650L) >>> 32);
int var6 = (int)((var3 ^ 118057154221650L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
this.r(var5, var6, (char)var7, encoder, (class_1792)value);
}

static {
long var0 = a ^ 50942194544098L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[7];
int var7 = 0;
String var6 = "3\\,-[=\u0001IË©c¸óÑ¨¿\u0010\u0083÷\u009c½@\u0089HH\u0006\u0002X£EÛ*5(G*\u0092mÃ¿Ñc\u009d\u00ad\u009d\u0012\u0006&³\u0018Fÿ|¦²Ù\u0016ÃXà fÞâ\u0017*æ\rÿG\u0017\u0087\u008e½\u0010÷\u008b¡wûxäË\u0010Ûó\u009d?¥Y\u000e\u0010Ï\u001aæô0\b\t;4\u0080v\u0011/|}d";
int var8 = "3\\,-[=\u0001IË©c¸óÑ¨¿\u0010\u0083÷\u009c½@\u0089HH\u0006\u0002X£EÛ*5(G*\u0092mÃ¿Ñc\u009d\u00ad\u009d\u0012\u0006&³\u0018Fÿ|¦²Ù\u0016ÃXà fÞâ\u0017*æ\rÿG\u0017\u0087\u008e½\u0010÷\u008b¡wûxäË\u0010Ûó\u009d?¥Y\u000e\u0010Ï\u001aæô0\b\t;4\u0080v\u0011/|}d"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[7];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "iþiüö\u0017\u008cÓiLáä1@^¥\u0010\u0085Æ¹ºk\u0000\u0081¼ÌÏëî\u000e÷íî";
var8 = "iþiüö\u0017\u008cÓiLáä1@^¥\u0010\u0085Æ¹ºk\u0000\u0081¼ÌÏëî\u000e÷íî".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32031;
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
throw new RuntimeException("su/catlean/ls", var10);
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
throw new RuntimeException("su/catlean/ls" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
