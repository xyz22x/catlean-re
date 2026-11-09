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
import net.minecraft.class_2797;

public final class c0 implements Runnable {
final int B;
final class_2797 j;
private static final long a = yz.a(-7093673972862245032L, -432391920590358905L, MethodHandles.lookup().lookupClass()).a(8804299783378L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public c0(int var1, class_2797 var2) {
this.B = var1;
this.j = var2;
}

@Override
public final void run() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/c0.a J
// 003: ldc2_w 60827504855801
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 130587959516011
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 52135136733352
// 013: lxor
// 014: lstore 5
// 016: dup2
// 017: ldc2_w 80820675495758
// 01a: lxor
// 01b: lstore 7
// 01d: pop2
// 01e: aload 0
// 01f: getfield su/catlean/c0.B I
// 022: i2l
// 023: invokestatic java/lang/Thread.sleep (J)V
// 026: ldc2_w 6656610256025732626
// 029: lload 1
// 02a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: bipush 0
// 030: istore 10
// 032: astore 9
// 034: nop
// 035: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 038: aload 0
// 039: getfield su/catlean/c0.j Lnet/minecraft/class_2797;
// 03c: invokevirtual net/minecraft/class_2797.comp_945 ()Ljava/lang/String;
// 03f: dup
// 040: sipush 18882
// 043: ldc2_w 1621061871271013488
// 046: lload 1
// 047: lxor
// 048: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/c0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 050: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 053: lload 5
// 055: invokestatic su/catlean/ej.D (Lsu/catlean/ej;J)Lsu/catlean/iy;
// 058: invokevirtual su/catlean/iy.name ()Ljava/lang/String;
// 05b: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 05e: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 061: dup
// 062: sipush 20170
// 065: ldc2_w 9218421567607991162
// 068: lload 1
// 069: lxor
// 06a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/c0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 072: lload 3
// 073: invokestatic su/catlean/ej.h (Lsu/catlean/ej;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
// 076: astore 11
// 078: aload 0
// 079: getfield su/catlean/c0.j Lnet/minecraft/class_2797;
// 07c: invokevirtual net/minecraft/class_2797.comp_945 ()Ljava/lang/String;
// 07f: aload 9
// 081: ifnonnull 0fd
// 084: aload 11
// 086: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
// 089: ifeq 0f7
// 08c: goto 099
// 08f: ldc2_w 6673597036357476220
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 09c: pop
// 09d: aload 0
// 09e: getfield su/catlean/c0.j Lnet/minecraft/class_2797;
// 0a1: invokevirtual net/minecraft/class_2797.comp_945 ()Ljava/lang/String;
// 0a4: invokestatic su/catlean/ej.q (Ljava/lang/String;)V
// 0a7: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 0aa: checkcast su/catlean/_g
// 0ad: aload 0
// 0ae: getfield su/catlean/c0.j Lnet/minecraft/class_2797;
// 0b1: invokevirtual net/minecraft/class_2797.comp_945 ()Ljava/lang/String;
// 0b4: dup
// 0b5: sipush 23091
// 0b8: ldc2_w 2908126196656439170
// 0bb: lload 1
// 0bc: lxor
// 0bd: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/c0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c5: bipush 1
// 0c6: lload 7
// 0c8: invokestatic su/catlean/o2.j (Lsu/catlean/_g;Ljava/lang/String;ZJ)V
// 0cb: aload 9
// 0cd: ifnull 118
// 0d0: goto 0dd
// 0d3: ldc2_w 6673597036357476220
// 0d6: lload 1
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: bipush 5
// 0de: anewarray 117
// 0e1: ldc2_w 6653133204389058153
// 0e4: lload 1
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: goto 0f7
// 0ed: ldc2_w 6673597036357476220
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 0fa: pop
// 0fb: aload 11
// 0fd: invokestatic su/catlean/ej.q (Ljava/lang/String;)V
// 100: getstatic su/catlean/ej.J Lsu/catlean/ej;
// 103: checkcast su/catlean/_g
// 106: aload 11
// 108: bipush 1
// 109: lload 7
// 10b: invokestatic su/catlean/o2.j (Lsu/catlean/_g;Ljava/lang/String;ZJ)V
// 10e: goto 118
// 111: astore 11
// 113: aload 11
// 115: invokevirtual java/lang/Exception.printStackTrace ()V
// 118: nop
// 119: nop
// 11a: return
}

static {
long var0 = a ^ 12263586786064L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[3];
int var7 = 0;
String var6 = "Ñeùvp×9\u0084\u0016Ö¾ÆK:Qb\"B^Å\u008d\u0097æ\u009a?ÉåÒ¬Ö55ýß\u0097æ¬\u0093ó3 \u0010i)\u0084ÿùµ\u0006\u008c\u008bB\u0087Ë`\u0080\f6\u0016\"È\u008fÙi©?µÖþ\\[ô²\u0018m^'$RÈÂÎ\u0094¿Oè\u001cu*\u0093;\u0084§Çµ¾w\u008d";
int var8 = "Ñeùvp×9\u0084\u0016Ö¾ÆK:Qb\"B^Å\u008d\u0097æ\u009a?ÉåÒ¬Ö55ýß\u0097æ¬\u0093ó3 \u0010i)\u0084ÿùµ\u0006\u008c\u008bB\u0087Ë`\u0080\f6\u0016\"È\u008fÙi©?µÖþ\\[ô²\u0018m^'$RÈÂÎ\u0094¿Oè\u001cu*\u0093;\u0084§Çµ¾w\u008d"
.length();
char var5 = '(';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[3];
return;
}

var5 = var6.charAt(var4);
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30915;
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
throw new RuntimeException("su/catlean/c0", var10);
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
throw new RuntimeException("su/catlean/c0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
