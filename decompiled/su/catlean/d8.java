package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1299;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class d8 extends dt {
@NotNull
private final a1 F;
private static final long d = yz.a(5470963018992934984L, 6806161391662975180L, MethodHandles.lookup().lookupClass()).a(211938083608534L);
private static final String[] o;
private static final String[] q;
private static final Map r = new HashMap(13);

public d8(@NotNull a1 setting, long a) {
a = d ^ a;
long var10001 = a ^ 138350912194254L;
int var4 = (int)((a ^ 138350912194254L) >>> 32);
int var5 = (int)((a ^ 138350912194254L) << 32 >>> 40);
int var6 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(setting, c<"f">(23719, 7033969978418595695L ^ a));
super(var4, var5, c<"f">(7128, 5411692729527910418L ^ a), (byte)var6);
this.F = setting;
}

@NotNull
public final a1 N() {
return this.F;
}

@NotNull
@Override
protected List a(long var1) {
class_7922 var10000 = class_7923.field_41177;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41177, c<"f">(6063, 4374319516400173577L ^ var1));
return CollectionsKt.toList((Iterable)var10000);
}

@NotNull
protected String Z(@NotNull class_1299 item, long a) {
a = d ^ a;
Intrinsics.checkNotNullParameter(item, c<"f">(22865, 6869875231387687479L ^ a));
String var10000 = item.method_5897().getString();
Intrinsics.checkNotNullExpressionValue(var10000, c<"f">(30112, 7315521719478859461L ^ a));
return var10000;
}

protected boolean L(long a, @NotNull class_1299 item) {
a = d ^ a;
Intrinsics.checkNotNullParameter(item, c<"f">(20976, 8024302858533048606L ^ a));
return ((d4)this.F.F()).q().contains(item);
}

public void A(@NotNull class_332 context, float x, long a, float y, @NotNull class_1299 entity) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/d8.d J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: ldc2_w 7665641275394559561
// 09: lload 3
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: sipush 21131
// 13: ldc2_w 6103299079457331555
// 16: lload 3
// 17: lxor
// 18: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: istore 7
// 22: aload 6
// 24: sipush 28113
// 27: ldc2_w 4604678328301315642
// 2a: lload 3
// 2b: lxor
// 2c: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 34: iload 7
// 36: ifeq 60
// 39: aload 6
// 3b: invokestatic net/minecraft/class_1826.method_8019 (Lnet/minecraft/class_1299;)Lnet/minecraft/class_1826;
// 3e: dup
// 3f: ifnull 5f
// 42: goto 4f
// 45: ldc2_w 7699286578352075748
// 48: lload 3
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: checkcast net/minecraft/class_1792
// 52: goto 63
// 55: ldc2_w 7699286578352075748
// 58: lload 3
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: pop
// 60: getstatic net/minecraft/class_1802.field_8077 Lnet/minecraft/class_1792;
// 63: astore 9
// 65: aload 9
// 67: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 6a: aload 9
// 6c: astore 8
// 6e: aload 1
// 6f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 72: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 75: pop
// 76: aload 1
// 77: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7a: fload 2
// 7b: ldc 8.0
// 7d: fadd
// 7e: fload 5
// 80: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 83: pop
// 84: aload 1
// 85: aload 8
// 87: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 8a: bipush 0
// 8b: bipush 0
// 8c: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 8f: aload 1
// 90: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 93: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 96: pop
// 97: return
}

protected void Y(@NotNull class_1299 item, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/d8.d J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: aload 1
// 07: sipush 20976
// 0a: ldc2_w 8024408318961727272
// 0d: lload 2
// 0e: lxor
// 0f: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: ldc2_w -8694516514022104194
// 1a: lload 2
// 1b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: aload 0
// 21: getfield su/catlean/d8.F Lsu/catlean/a1;
// 24: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 27: checkcast su/catlean/d4
// 2a: invokevirtual su/catlean/d4.q ()Ljava/util/List;
// 2d: astore 5
// 2f: bipush 0
// 30: istore 6
// 32: istore 4
// 34: aload 5
// 36: aload 1
// 37: iload 4
// 39: ifeq 69
// 3c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 41: ifeq 66
// 44: goto 51
// 47: ldc2_w -8651881960360288557
// 4a: lload 2
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: aload 5
// 53: aload 1
// 54: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
// 59: goto 6e
// 5c: ldc2_w -8651881960360288557
// 5f: lload 2
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: aload 5
// 68: aload 1
// 69: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 6e: pop
// 6f: return
}

@Override
public String n(long a, Object item) {
long var4 = a ^ 90927979473846L;
return this.Z((class_1299)item, var4);
}

@Override
public boolean O(Object item, long a) {
long var4 = a ^ 111487467574449L;
return this.L(var4, (class_1299)item);
}

@Override
public void j(class_332 context, float x, float y, long a, Object component) {
long var7 = a ^ 74559184613877L;
this.A(context, x, var7, y, (class_1299)component);
}

@Override
public void v(Object item, long a) {
long var4 = a ^ 91422355180470L;
this.Y((class_1299)item, var4);
}

static {
long var0 = d ^ 23114834137429L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[8];
int var7 = 0;
String var6 = "ïÞÂ?\u008aV\u0087\u001c\u00002\u009a\u0084¥Ì{*\u0010\u0088ç\u009dl\u001cÉ2\u0095;]«ÅÁ;\u009eV Áª\u000b*éVÛìÞ\u0092O\u009b¡+\u007f%\u001a\u0092\u0091ÐÛy\u009a£ú\u0011Z¿®\u0018\u00adÃ\u0010j\u001f\u009bïËÃröóÖL*ÙÀÚ\u0003\u0010Y\u0083m~§?Ç?Ñãt^\u009c\\¿0\u0010\u0090ÜNÇ\u009cáKdÚ,MÑUÈ_&";
int var8 = "ïÞÂ?\u008aV\u0087\u001c\u00002\u009a\u0084¥Ì{*\u0010\u0088ç\u009dl\u001cÉ2\u0095;]«ÅÁ;\u009eV Áª\u000b*éVÛìÞ\u0092O\u009b¡+\u007f%\u001a\u0092\u0091ÐÛy\u009a£ú\u0011Z¿®\u0018\u00adÃ\u0010j\u001f\u009bïËÃröóÖL*ÙÀÚ\u0003\u0010Y\u0083m~§?Ç?Ñãt^\u009c\\¿0\u0010\u0090ÜNÇ\u009cáKdÚ,MÑUÈ_&"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = c(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
o = var9;
q = new String[8];
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

var6 = "ïq\u0012>Ä¦ D#¾\u009f\u008a\u0096\u0085\u0097;¾\u008b¸¿*\u008b\u0090OµÙhN\u009bG\u001cq\u0018\u0000¢½_\u0015\u0091ê\u0083\u001e¼¡o²ttqïjÝ²þx¤Ù";
var8 = "ïq\u0012>Ä¦ D#¾\u009f\u008a\u0096\u0085\u0097;¾\u008b¸¿*\u008b\u0090OµÙhN\u009bG\u001cq\u0018\u0000¢½_\u0015\u0091ê\u0083\u001e¼¡o²ttqïjÝ²þx¤Ù"
.length();
var5 = ' ';
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

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24664;
if (q[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])r.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
r.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/d8", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = o[var5].getBytes("ISO-8859-1");
q[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return q[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/d8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
