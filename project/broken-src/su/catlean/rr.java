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

public final class rr implements Runnable {
final int C;
private static final long a = yz.a(8037117996999275962L, -7339403553783878488L, MethodHandles.lookup().lookupClass()).a(78596087269641L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public rr(int $delay) {
this.C = $delay;
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
// 00: getstatic su/catlean/rr.a J
// 03: ldc2_w 60165230418039
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 102753895227498
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 95700024648464
// 13: lxor
// 14: dup2
// 15: bipush 32
// 17: lushr
// 18: l2i
// 19: istore 5
// 1b: dup2
// 1c: bipush 32
// 1e: lshl
// 1f: bipush 48
// 21: lushr
// 22: l2i
// 23: istore 6
// 25: dup2
// 26: bipush 48
// 28: lshl
// 29: bipush 48
// 2b: lushr
// 2c: l2i
// 2d: istore 7
// 2f: pop2
// 30: dup2
// 31: ldc2_w 76601876948799
// 34: lxor
// 35: lstore 8
// 37: dup2
// 38: ldc2_w 139907418813479
// 3b: lxor
// 3c: lstore 10
// 3e: pop2
// 3f: ldc2_w 8997038555350237717
// 42: lload 1
// 43: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: aload 0
// 49: getfield su/catlean/rr.C I
// 4c: i2l
// 4d: invokestatic java/lang/Thread.sleep (J)V
// 50: astore 12
// 52: bipush 0
// 53: istore 13
// 55: aload 12
// 57: ifnonnull ea
// 5a: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 5d: lload 8
// 5f: invokevirtual su/catlean/ko.q (J)Lsu/catlean/at;
// 62: getstatic su/catlean/at.OFF Lsu/catlean/at;
// 65: if_acmpeq e8
// 68: goto 75
// 6b: ldc2_w 8986243978755157945
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: getstatic su/catlean/rq.G Lsu/catlean/rq;
// 78: getstatic su/catlean/ko.u Lsu/catlean/ko;
// 7b: lload 8
// 7d: invokevirtual su/catlean/ko.q (J)Lsu/catlean/at;
// 80: getstatic su/catlean/at.ON Lsu/catlean/at;
// 83: if_acmpne cd
// 86: goto 93
// 89: ldc2_w 8986243978755157945
// 8c: lload 1
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: getstatic su/catlean/rq.G Lsu/catlean/rq;
// 96: lload 3
// 97: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 9a: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 9d: invokevirtual net/minecraft/class_320.method_1676 ()Ljava/lang/String;
// a0: sipush 746
// a3: ldc2_w 335287158630738812
// a6: lload 1
// a7: lxor
// a8: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/rr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// b2: iload 5
// b4: swap
// b5: iload 6
// b7: i2s
// b8: swap
// b9: iload 7
// bb: i2s
// bc: swap
// bd: invokestatic su/catlean/rq.p (Lsu/catlean/rq;ISSLjava/lang/String;)Ljava/lang/String;
// c0: goto e3
// c3: ldc2_w 8986243978755157945
// c6: lload 1
// c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cc: athrow
// cd: invokestatic su/catlean/rq.j ()I
// d0: sipush 14869
// d3: ldc2_w 5134799332937159554
// d6: lload 1
// d7: lxor
// d8: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/rr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dd: swap
// de: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// e3: lload 10
// e5: invokevirtual su/catlean/rq.C (Ljava/lang/String;J)V
// e8: nop
// e9: nop
// ea: return
}

static {
long var0 = a ^ 87955539667534L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "ä\u001bnK\u0007L\u0000â~\u008a\u0018\u008a\u001f®\u0003á\u0010/Òé\tULÀ¬\u0091R\u008dcKÊÓÇ";
int var8 = "ä\u001bnK\u0007L\u0000â~\u008a\u0018\u008a\u001f®\u0003á\u0010/Òé\tULÀ¬\u0091R\u008dcKÊÓÇ".length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[2];
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5301;
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
throw new RuntimeException("su/catlean/rr", var10);
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
throw new RuntimeException("su/catlean/rr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
