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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class qy extends _g {
@NotNull
public static final qy E;
private static final long a = yz.a(9210474451537299078L, -2703847134773862930L, MethodHandles.lookup().lookupClass()).a(180441402256248L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private qy(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 92865308799454L;
super(b<"k">(14155, 8684736476111743905L ^ var3), jt.I(), null, 4, null, var5);
}

@Flow
public final void l(@NotNull ReceivePacket event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qy.a J
// 03: ldc2_w 107366343491204
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 35374620227620
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 35727780318305
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 6806159833915524938
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: aload 1
// 22: sipush 22270
// 25: ldc2_w 3070907679391151132
// 28: lload 2
// 29: lxor
// 2a: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/qy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 32: astore 8
// 34: aload 1
// 35: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 38: aload 8
// 3a: ifnull 76
// 3d: instanceof net/minecraft/class_2735
// 40: ifeq 7d
// 43: goto 50
// 46: ldc2_w 6794677116768546774
// 49: lload 2
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: aload 1
// 51: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 54: new net/minecraft/class_2868
// 57: dup
// 58: lload 6
// 5a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 60: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 63: invokespecial net/minecraft/class_2868.<init> (I)V
// 66: checkcast net/minecraft/class_2596
// 69: goto 76
// 6c: ldc2_w 6794677116768546774
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: lload 4
// 78: dup2_x1
// 79: pop2
// 7a: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 7d: aload 8
// 7f: ifnonnull 9c
// 82: bipush 2
// 83: anewarray 118
// 86: ldc2_w 6785142377335247892
// 89: lload 2
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: goto 9c
// 92: ldc2_w 6794677116768546774
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: return
}

static {
long var9 = a ^ 89947889500242L;
int var11 = (int)((var9 ^ 40193219289429L) >>> 32);
int var12 = (int)((var9 ^ 40193219289429L) << 32 >>> 32);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[2];
int var5 = 0;
String var4 = "ÈÓQ®\u0087Fp\u009eª\u0091®\u0013§º'Z \bnG\f~è¨&\u0089ÜÆ¿B\u0007Ë¹GñùU#\u0097fjhy9Ý\u0097nÒ\f";
int var6 = "ÈÓQ®\u0087Fp\u009eª\u0091®\u0013§º'Z \bnG\f~è¨&\u0089ÜÆ¿B\u0007Ë¹GñùU#\u0097fjhy9Ý\u0097nÒ\f".length();
char var3 = 16;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var15 = b(var8).intern();
byte var10001 = -1;
var7[var5++] = var15;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
E = new qy(var11, var12);
return;
}

var3 = var4.charAt(var2);
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32236;
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
throw new RuntimeException("su/catlean/qy", var10);
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
throw new RuntimeException("su/catlean/qy" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
