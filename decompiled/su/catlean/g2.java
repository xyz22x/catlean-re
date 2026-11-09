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
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class g2 extends gf {
@NotNull
public static final g2 N;
private static final long a = yz.a(-7882222852425971598L, -7117920506270352489L, MethodHandles.lookup().lookupClass()).a(72985151591069L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);

private g2(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 87007840131871L;
int var3 = (int)((var1 ^ 87007840131871L) >>> 48);
int var4 = (int)((var1 ^ 87007840131871L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"u">(1397, 6205451005624819048L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 116853176505585L;
long var6 = ax ^ 14448239366368L;
Intrinsics.checkNotNullParameter(context, b<"u">(4967, 1542961909003532164L ^ ax));
Pair var8 = this.h(var6);
boolean var9 = false;
String var12 = b<"u">(16227, 3200623221442157442L ^ ax) + var8.getFirst() + b<"u">(497, 8815243546196419863L ^ ax) + var8.getSecond();
this.X(context, var4, var12);
}

private final Pair h(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/g2.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 111413471951648
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w -2927417133710222292
// 011: lload 1
// 012: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: bipush 0
// 018: istore 6
// 01a: bipush 0
// 01b: istore 7
// 01d: istore 5
// 01f: nop
// 020: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 023: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 026: checkcast java/lang/Iterable
// 029: astore 8
// 02b: bipush 0
// 02c: istore 9
// 02e: aload 8
// 030: astore 10
// 032: new java/util/ArrayList
// 035: dup
// 036: invokespecial java/util/ArrayList.<init> ()V
// 039: checkcast java/util/Collection
// 03c: astore 11
// 03e: bipush 0
// 03f: istore 12
// 041: aload 10
// 043: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 048: astore 13
// 04a: aload 13
// 04c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 051: ifeq 09e
// 054: aload 13
// 056: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 05b: astore 14
// 05d: lload 1
// 05e: lconst_0
// 05f: lcmp
// 060: ifle 0b3
// 063: aload 14
// 065: instanceof net/minecraft/class_2595
// 068: iload 5
// 06a: ifeq 0b1
// 06d: iload 5
// 06f: ifeq 098
// 072: goto 07f
// 075: ldc2_w -2930156102678855906
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: ifeq 04a
// 082: goto 08f
// 085: ldc2_w -2930156102678855906
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: aload 11
// 091: aload 14
// 093: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 098: pop
// 099: iload 5
// 09b: ifne 04a
// 09e: aload 11
// 0a0: checkcast java/util/List
// 0a3: nop
// 0a4: checkcast java/lang/Iterable
// 0a7: astore 8
// 0a9: nop
// 0aa: lload 1
// 0ab: lconst_0
// 0ac: lcmp
// 0ad: ifle 0b3
// 0b0: bipush 0
// 0b1: istore 9
// 0b3: aload 8
// 0b5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ba: astore 10
// 0bc: aload 10
// 0be: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c3: ifeq 144
// 0c6: aload 10
// 0c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0cd: astore 11
// 0cf: aload 11
// 0d1: checkcast net/minecraft/class_2595
// 0d4: astore 12
// 0d6: bipush 0
// 0d7: istore 13
// 0d9: lload 3
// 0da: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0dd: aload 12
// 0df: invokevirtual net/minecraft/class_2595.method_11016 ()Lnet/minecraft/class_2338;
// 0e2: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0e5: getstatic net/minecraft/class_2281.field_10770 Lnet/minecraft/class_2754;
// 0e8: checkcast net/minecraft/class_2769
// 0eb: invokevirtual net/minecraft/class_2680.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
// 0ee: dup
// 0ef: sipush 29707
// 0f2: ldc2_w 7176518040384678760
// 0f5: lload 1
// 0f6: lxor
// 0f7: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/g2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ff: checkcast net/minecraft/class_2745
// 102: astore 14
// 104: iload 5
// 106: ifeq 14b
// 109: aload 14
// 10b: getstatic net/minecraft/class_2745.field_12569 Lnet/minecraft/class_2745;
// 10e: if_acmpne 133
// 111: goto 11e
// 114: ldc2_w -2930156102678855906
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: iload 6
// 120: istore 15
// 122: iload 15
// 124: bipush 1
// 125: iadd
// 126: istore 6
// 128: iload 5
// 12a: lload 1
// 12b: lconst_0
// 12c: lcmp
// 12d: iflt 141
// 130: ifne 13d
// 133: iload 7
// 135: istore 15
// 137: iload 15
// 139: bipush 1
// 13a: iadd
// 13b: istore 7
// 13d: nop
// 13e: nop
// 13f: iload 5
// 141: ifne 0bc
// 144: nop
// 145: lload 1
// 146: lconst_0
// 147: lcmp
// 148: ifle 0cf
// 14b: goto 150
// 14e: astore 8
// 150: new kotlin/Pair
// 153: dup
// 154: iload 6
// 156: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 159: iload 7
// 15b: bipush 2
// 15c: idiv
// 15d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 160: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 163: areturn
}

static {
long var9 = a ^ 76141645160754L;
long var11 = var9 ^ 88843832291494L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "ÐjÍñÁ\u0096>ÖçØðUN\u0005\u0096ÏkÆ»0(@\u008aa²\u0006Fµ\u009e\u008bÿp\u0010\u009dm\u0082Ç\u0006\u000bs\u0086z«¹Îæ¿ß^ :¶î·\rfg\u0017\u0016fmä\u0096\u009e3F!XêcòåtMù1Ï=\u008fxs;";
int var6 = "ÐjÍñÁ\u0096>ÖçØðUN\u0005\u0096ÏkÆ»0(@\u008aa²\u0006Fµ\u009e\u008bÿp\u0010\u009dm\u0082Ç\u0006\u000bs\u0086z«¹Îæ¿ß^ :¶î·\rfg\u0017\u0016fmä\u0096\u009e3F!XêcòåtMù1Ï=\u008fxs;"
.length();
char var3 = ' ';
int var14 = -1;

label27:
while (true) {
String var15 = var4.substring(++var14, var14 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = b(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var14 += var3) >= var6) {
b = var7;
c = new String[5];
N = new g2(var11);
return;
}

var3 = var4.charAt(var14);
break;
default:
var7[var5++] = var21;
if ((var14 += var3) < var6) {
var3 = var4.charAt(var14);
continue label27;
}

var4 = "²?\u0013ÊR[4I|[\u008c\u0080\u0089Ú/ ds\u001aö\u001dØ\u0019\u0086\u0010\u0014[)¤mù\u0082÷îÿ\u0003Ë\u0011ÓÆä";
var6 = "²?\u0013ÊR[4I|[\u008c\u0080\u0089Ú/ ds\u001aö\u001dØ\u0019\u0086\u0010\u0014[)¤mù\u0082÷îÿ\u0003Ë\u0011ÓÆä".length();
var3 = 24;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2441;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/g2", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/g2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
