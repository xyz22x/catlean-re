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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pd extends gf {
@NotNull
public static final pd f;
private static final long a = yz.a(3763233803705961437L, -4135775130737356960L, MethodHandles.lookup().lookupClass()).a(160838531008089L);
private static final String[] b;
private static final String[] c;
private static final Map g = new HashMap(13);

private pd(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 130156062091631L;
int var3 = (int)((var1 ^ 130156062091631L) >>> 48);
int var4 = (int)((var1 ^ 130156062091631L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"j">(13547, 7214208543028376733L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 106730335067037
// 05: lxor
// 06: lstore 4
// 08: dup2
// 09: ldc2_w 116853176505585
// 0c: lxor
// 0d: lstore 6
// 0f: dup2
// 10: ldc2_w 100541977110631
// 13: lxor
// 14: dup2
// 15: bipush 32
// 17: lushr
// 18: lstore 8
// 1a: dup2
// 1b: bipush 32
// 1d: lshl
// 1e: bipush 32
// 20: lushr
// 21: l2i
// 22: istore 10
// 24: pop2
// 25: pop2
// 26: ldc2_w -5990947769900206742
// 29: lload 1
// 2a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: aload 3
// 30: sipush 17424
// 33: ldc2_w 8670769436015217388
// 36: lload 1
// 37: lxor
// 38: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/pd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 40: istore 11
// 42: aload 0
// 43: aload 3
// 44: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 47: lload 8
// 49: iload 10
// 4b: invokevirtual su/catlean/nf.a (JI)F
// 4e: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 51: iload 11
// 53: ifne 88
// 56: lload 4
// 58: invokevirtual su/catlean/nf.w (J)Z
// 5b: ifeq 85
// 5e: goto 6b
// 61: ldc2_w -6009886678615647284
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: sipush 3215
// 6e: ldc2_w 6077842006547104369
// 71: lload 1
// 72: lxor
// 73: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/pd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: goto 8e
// 7b: ldc2_w -6009886678615647284
// 7e: lload 1
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 88: invokevirtual su/catlean/nf.p ()F
// 8b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 8e: sipush 20877
// 91: ldc2_w 5924422710447791986
// 94: lload 1
// 95: lxor
// 96: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/pd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: swap
// 9c: sipush 1529
// 9f: ldc2_w 7001809959180569348
// a2: lload 1
// a3: lxor
// a4: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/pd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: invokedynamic makeConcatWithConstants (FLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// ae: lload 6
// b0: dup2_x1
// b1: pop2
// b2: invokevirtual su/catlean/pd.X (Lnet/minecraft/class_332;JLjava/lang/String;)V
// b5: return
}

static {
long var9 = a ^ 72457318923244L;
long var11 = var9 ^ 120025089873928L;
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
String var4 = "\u009eCY\fF´\u0090ÁdAp\u008cT\u0080Sa\u0010¨\u0081~.áßÎ\u0092¤£®a):üÀ\u0010e¢u\u0001\u0017ØÏ|<\u0085ðÜÈ FC";
int var6 = "\u009eCY\fF´\u0090ÁdAp\u008cT\u0080Sa\u0010¨\u0081~.áßÎ\u0092¤£®a):üÀ\u0010e¢u\u0001\u0017ØÏ|<\u0085ðÜÈ FC".length();
char var3 = 16;
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
f = new pd(var11);
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

var4 = "T\u008b&i@æ\u0015¢Iã\u0018\u0096Â/\u000eþ\u0018¼r8hV\u0083X¸=äBw\u0087%Aôöq 2Á\u0006«L";
var6 = "T\u008b&i@æ\u0015¢Iã\u0018\u0096Â/\u000eþ\u0018¼r8hV\u0083X¸=äBw\u0087%Aôöq 2Á\u0006«L".length();
var3 = 16;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9110;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pd", var10);
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
throw new RuntimeException("su/catlean/pd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
