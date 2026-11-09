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
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class qk extends _g {
@NotNull
public static final qk i;
private static final long a = yz.a(-409144438903890511L, -9045457264614971245L, MethodHandles.lookup().lookupClass()).a(39559327956211L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private qk(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 11337631146430L;
super(b<"o">(7053, 2688441692886029737L ^ var1), jt.I(), null, 4, null, var3);
}

@Flow
private final void D(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qk.a J
// 03: ldc2_w 135335338232294
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 84011659082476
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 86155553081564
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 115554071945095
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -2858433228039084174
// 22: lload 2
// 23: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 1
// 2b: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2e: instanceof net/minecraft/class_2815
// 31: aload 10
// 33: ifnull 6d
// 36: ifeq a0
// 39: goto 46
// 3c: ldc2_w -2784794907253301209
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 49: aload 10
// 4b: ifnull 73
// 4e: goto 5b
// 51: ldc2_w -2784794907253301209
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: lload 8
// 5d: invokevirtual su/catlean/_n.f (J)Z
// 60: goto 6d
// 63: ldc2_w -2784794907253301209
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: ifeq 9c
// 70: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 73: lload 4
// 75: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 78: getstatic su/catlean/su.NONE Lsu/catlean/su;
// 7b: if_acmpeq 9c
// 7e: aload 0
// 7f: sipush 21575
// 82: ldc2_w 8799098545202541235
// 85: lload 2
// 86: lxor
// 87: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/qk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: lload 6
// 8e: invokevirtual su/catlean/qk.F (Ljava/lang/String;J)V
// 91: return
// 92: ldc2_w -2784794907253301209
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: aload 1
// 9d: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// a0: return
}

static {
long var9 = a ^ 60792978276138L;
long var11 = var9 ^ 30995664703053L;
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
String var4 = "¹\u0007\b\u0086ü#x\u0002HÂmI\u00996·^ dºÕä\u008e\\\u0007\\\u0002)õþi¿â.\u0099\u0018\u0082f±oWòd\u009a\u0080Îb±ëÎ";
int var6 = "¹\u0007\b\u0086ü#x\u0002HÂmI\u00996·^ dºÕä\u008e\\\u0007\\\u0002)õþi¿â.\u0099\u0018\u0082f±oWòd\u009a\u0080Îb±ëÎ".length();
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
i = new qk(var11);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16195;
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
throw new RuntimeException("su/catlean/qk", var10);
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
throw new RuntimeException("su/catlean/qk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
