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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class i1 {
@NotNull
public static final i1 C;
@NotNull
private static final Float[] c;
private static final long a = yz.a(5534783901550420242L, -5998892869796493544L, MethodHandles.lookup().lookupClass()).a(91365475665220L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);

private i1() {
}

@NotNull
public final Float[] f() {
return c;
}

public final boolean C(@NotNull class_243 pos, long a, @NotNull class_243 interactVec) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/i1.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 35626999496542
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 11195537662133
// 012: lxor
// 013: lstore 7
// 015: pop2
// 016: aload 1
// 017: sipush 923
// 01a: ldc2_w 5436602830957082491
// 01d: lload 2
// 01e: lxor
// 01f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 027: aload 4
// 029: sipush 23726
// 02c: ldc2_w 5174715368741218378
// 02f: lload 2
// 030: lxor
// 031: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 039: new net/minecraft/class_238
// 03c: dup
// 03d: aload 1
// 03e: dconst_1
// 03f: dconst_0
// 040: dconst_1
// 041: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
// 044: aload 1
// 045: dconst_1
// 046: ldc2_w 2.0
// 049: dconst_1
// 04a: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 04d: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)V
// 050: astore 10
// 052: ldc2_w 8233940979492685154
// 055: lload 2
// 056: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: lload 7
// 05d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 060: invokevirtual net/minecraft/class_746.method_55755 ()D
// 063: dstore 11
// 065: dconst_0
// 066: dstore 23
// 068: ldc2_w 1.7976931348623157E308
// 06b: dstore 23
// 06d: aload 4
// 06f: lload 7
// 071: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 074: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 077: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 07a: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 07d: dload 11
// 07f: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 082: dup
// 083: sipush 24744
// 086: ldc2_w 6457745093795419209
// 089: lload 2
// 08a: lxor
// 08b: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 093: astore 13
// 095: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 098: lload 5
// 09a: invokevirtual su/catlean/dm.S (J)Lnet/minecraft/class_243;
// 09d: astore 14
// 09f: getstatic su/catlean/i1.c [Ljava/lang/Float;
// 0a2: astore 15
// 0a4: astore 9
// 0a6: bipush 0
// 0a7: istore 16
// 0a9: aload 15
// 0ab: arraylength
// 0ac: istore 17
// 0ae: iload 16
// 0b0: iload 17
// 0b2: if_icmpge 1b3
// 0b5: aload 15
// 0b7: iload 16
// 0b9: aaload
// 0ba: invokevirtual java/lang/Float.floatValue ()F
// 0bd: fstore 18
// 0bf: aload 14
// 0c1: dconst_0
// 0c2: fload 18
// 0c4: f2d
// 0c5: dconst_0
// 0c6: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0c9: dup
// 0ca: sipush 19252
// 0cd: ldc2_w 328465375660097495
// 0d0: lload 2
// 0d1: lxor
// 0d2: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0da: astore 19
// 0dc: aload 19
// 0de: aload 13
// 0e0: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 0e3: dup
// 0e4: sipush 25302
// 0e7: ldc2_w 8983649197215422004
// 0ea: lload 2
// 0eb: lxor
// 0ec: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f4: astore 20
// 0f6: aload 10
// 0f8: aload 20
// 0fa: invokevirtual net/minecraft/class_238.method_1006 (Lnet/minecraft/class_243;)Z
// 0fd: aload 9
// 0ff: lload 2
// 100: lconst_0
// 101: lcmp
// 102: iflt 1c3
// 105: ifnonnull 1c1
// 108: aload 9
// 10a: ifnonnull 167
// 10d: goto 11a
// 110: ldc2_w 8220855384625494787
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: lload 2
// 11b: lconst_0
// 11c: lcmp
// 11d: iflt 15a
// 120: ifne 159
// 123: goto 130
// 126: ldc2_w 8220855384625494787
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: aload 10
// 132: aload 19
// 134: aload 9
// 136: ifnonnull 16c
// 139: goto 146
// 13c: ldc2_w 8220855384625494787
// 13f: lload 2
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: invokevirtual net/minecraft/class_238.method_1006 (Lnet/minecraft/class_243;)Z
// 149: ifeq 168
// 14c: goto 159
// 14f: ldc2_w 8220855384625494787
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: bipush 1
// 15a: goto 167
// 15d: ldc2_w 8220855384625494787
// 160: lload 2
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: ireturn
// 168: aload 10
// 16a: aload 19
// 16c: aload 20
// 16e: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
// 171: astore 21
// 173: bipush 0
// 174: istore 22
// 176: aload 9
// 178: lload 2
// 179: lconst_0
// 17a: lcmp
// 17b: ifle 1b0
// 17e: ifnonnull 1ae
// 181: aload 21
// 183: invokevirtual java/util/Optional.isPresent ()Z
// 186: ifeq 1aa
// 189: goto 196
// 18c: ldc2_w 8220855384625494787
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: dload 23
// 198: aload 19
// 19a: aload 21
// 19c: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 19f: checkcast net/minecraft/class_243
// 1a2: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 1a5: invokestatic java/lang/Math.min (DD)D
// 1a8: dstore 23
// 1aa: nop
// 1ab: iinc 16 1
// 1ae: aload 9
// 1b0: ifnull 0ae
// 1b3: lload 2
// 1b4: lconst_0
// 1b5: lcmp
// 1b6: ifle 1da
// 1b9: dload 23
// 1bb: dload 11
// 1bd: dload 11
// 1bf: dmul
// 1c0: dcmpg
// 1c1: aload 9
// 1c3: ifnonnull 1d7
// 1c6: ifgt 1da
// 1c9: goto 1d6
// 1cc: ldc2_w 8220855384625494787
// 1cf: lload 2
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: bipush 1
// 1d7: goto 1db
// 1da: bipush 0
// 1db: ireturn
}

public static boolean f(i1 var0, class_243 var1, long var2, class_243 var4, int var5, Object var6) {
var2 = a ^ var2;
long var7 = var2 ^ 20034891394036L;
String var9 = vm.a<"Å">(3729459883722589415L, var2);

try {
int var10000 = var5 & 2;
if (var9 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.C(var1, var7, var4);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 3716377724686629510L, var2);
}

return var0.C(var1, var7, var1);
}

static {
long var0 = a ^ 52994207583463L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[5];
int var7 = 0;
String var6 = "_1Qv!yÇª\b*\u0087Ù+d\u0004¥ Zæ[o\u000bÓÎì\u0087G\u0081ß÷¹\u001ceó\u0094òacmØµ\u0081ì<ûë=#\u0002\u0018#ðÕ|d¥ï<J XÄ?pÊÈyÎÊ¤D]äõ";
int var8 = "_1Qv!yÇª\b*\u0087Ù+d\u0004¥ Zæ[o\u000bÓÎì\u0087G\u0081ß÷¹\u001ceó\u0094òacmØµ\u0081ì<ûë=#\u0002\u0018#ðÕ|d¥ï<J XÄ?pÊÈyÎÊ¤D]äõ".length();
char var5 = 16;
int var13 = -1;

label27:
while (true) {
String var14 = var6.substring(++var13, var13 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
String var20 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var20;
if ((var13 += var5) >= var8) {
b = var9;
d = new String[5];
C = new i1();
Float[] var11 = new Float[]{1.62F, 0.4F};
c = var11;
return;
}

var5 = var6.charAt(var13);
break;
default:
var9[var7++] = var20;
if ((var13 += var5) < var8) {
var5 = var6.charAt(var13);
continue label27;
}

var6 = "U5YZ\u000bHö<Ò\u00ad\u0083¡uÇâ@S\u001eú/Çù\u0011·0\u009f²\u0017]\u008b\u0014Û  ÐÊ \u0010<g\u0098\u0084\u0003\u0003áS(\u0014Åë/\u00828\\0\u001d¹û^Å\u0002ì¶cu";
var8 = "U5YZ\u000bHö<Ò\u00ad\u0083¡uÇâ@S\u001eú/Çù\u0011·0\u009f²\u0017]\u008b\u0014Û  ÐÊ \u0010<g\u0098\u0084\u0003\u0003áS(\u0014Åë/\u00828\\0\u001d¹û^Å\u0002ì¶cu"
.length();
var5 = ' ';
var13 = -1;
}

var14 = var6.substring(++var13, var13 + var5);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1850;
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
throw new RuntimeException("su/catlean/i1", var10);
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
throw new RuntimeException("su/catlean/i1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
