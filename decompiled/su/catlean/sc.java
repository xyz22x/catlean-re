package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class sc {
private static final long a = yz.a(-8555004561154222389L, -452644591607570317L, MethodHandles.lookup().lookupClass()).a(272087165307025L);
private static final String b;
private static final long c;

public static final int l(@NotNull String version, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/sc.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 6735395338405520796
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 0
// 10: getstatic su/catlean/sc.b Ljava/lang/String;
// 13: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 16: astore 3
// 17: aload 0
// 18: checkcast java/lang/CharSequence
// 1b: bipush 2
// 1c: anewarray 43
// 1f: astore 5
// 21: aload 5
// 23: bipush 0
// 24: ldc "+"
// 26: aastore
// 27: aload 5
// 29: bipush 1
// 2a: ldc "."
// 2c: aastore
// 2d: aload 5
// 2f: bipush 0
// 30: bipush 0
// 31: getstatic su/catlean/sc.c J
// 34: l2i
// 35: aconst_null
// 36: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 39: astore 4
// 3b: dconst_0
// 3c: dstore 15
// 3e: aload 4
// 40: checkcast java/lang/Iterable
// 43: invokestatic kotlin/collections/CollectionsKt.reversed (Ljava/lang/Iterable;)Ljava/util/List;
// 46: checkcast java/lang/Iterable
// 49: astore 6
// 4b: bipush 0
// 4c: istore 7
// 4e: bipush 0
// 4f: istore 8
// 51: aload 6
// 53: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 58: astore 9
// 5a: aload 9
// 5c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 61: ifeq e6
// 64: aload 9
// 66: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6b: astore 10
// 6d: iload 8
// 6f: iinc 8 1
// 72: istore 11
// 74: iload 11
// 76: aload 3
// 77: lload 1
// 78: lconst_0
// 79: lcmp
// 7a: ifle 81
// 7d: ifnonnull ea
// 80: aload 3
// 81: lload 1
// 82: lconst_0
// 83: lcmp
// 84: ifle b1
// 87: ifnonnull ac
// 8a: goto 97
// 8d: ldc2_w 6660116448328508483
// 90: lload 1
// 91: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96: athrow
// 97: ifge aa
// 9a: goto a7
// 9d: ldc2_w 6660116448328508483
// a0: lload 1
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// aa: iload 11
// ac: aload 10
// ae: checkcast java/lang/String
// b1: astore 12
// b3: istore 13
// b5: bipush 0
// b6: istore 14
// b8: dload 15
// ba: ldc2_w 10.0
// bd: iload 13
// bf: i2d
// c0: invokestatic java/lang/Math.pow (DD)D
// c3: aload 12
// c5: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// c8: i2d
// c9: dmul
// ca: dadd
// cb: dstore 15
// cd: nop
// ce: nop
// cf: aload 3
// d0: ifnull 5a
// d3: bipush 3
// d4: anewarray 136
// d7: lload 1
// d8: lconst_0
// d9: lcmp
// da: iflt 6b
// dd: ldc2_w 6679925266948118158
// e0: lload 1
// e1: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e6: nop
// e7: dload 15
// e9: d2i
// ea: ireturn
}

public static final boolean V() {
return false;
}

static {
long var5 = a ^ 54897961227835L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var9 = var7.doFinal("Ã\u000fE«\u0097\nI\u009c".getBytes("ISO-8859-1"));
String var12 = a(var9).intern();
byte var10001 = -1;
b = var12;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4953254409211375179L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var14 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
c = var14;
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
}
