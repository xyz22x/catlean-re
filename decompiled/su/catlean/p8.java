package su.catlean;

import java.awt.Color;
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
import net.minecraft.class_2338;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class p8 extends gf {
@NotNull
public static final p8 S;
@Nullable
private static class_2338 H;
private static boolean q;
private static final long a = yz.a(5877506847525410344L, -5635231647439142756L, MethodHandles.lookup().lookupClass()).a(175790408166648L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);

private p8(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 34249231653253L;
int var3 = (int)((var1 ^ 34249231653253L) >>> 48);
int var4 = (int)((var1 ^ 34249231653253L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"w">(19804, 7492293249720042240L ^ var1), (char)var5);
}

@Nullable
public final class_2338 P() {
return H;
}

public final void i(@Nullable class_2338 <set-?>) {
H = <set-?>;
}

public final boolean H() {
return q;
}

public final void J(boolean <set-?>) {
q = <set-?>;
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 50910300018319L;
long var6 = ax ^ 133399993616875L;
long var8 = ax ^ 20494741382199L;
long var10 = ax ^ 30591967126976L;
long var12 = ax ^ 109580710346244L;
Intrinsics.checkNotNullParameter(context, b<"w">(2468, 4200890185864362398L ^ ax));
float var14 = 50.0F;

try {
if (H == null) {
return;
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, -5937608875376314452L, ax);
}

double var15 = jl.y.a(zf.v(var12).field_6014, zf.v(var12).method_23317(), jl.y.K(var8));
double var17 = jl.y.a(zf.v(var12).field_5969, zf.v(var12).method_23321(), jl.y.K(var8));
class_2338 var10000 = H;
Intrinsics.checkNotNull(H);
float var19 = var10000.method_10263() + 0.5F;
var10000 = H;
Intrinsics.checkNotNull(H);
float var20 = var10000.method_10260() + 0.5F;
float var21 = ((float)var15 - var19 + 0.2F) * var14;
float var22 = ((float)var17 - var20 + 0.2F) * var14;
context.method_51448().pushMatrix();
context.method_51448().rotateAbout((float)Math.toRadians(-zf.v(var12).method_36454() + 180.0), this.p(var10) + var14 * 0.5F, this.V(var4) + var14 * 0.5F);
float var23 = this.p(var10) + var21;
float var24 = this.V(var4) + var22;

label22: {
try {
if (!q) {
var29 = jh.f.n();
break label22;
}
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, -5937608875376314452L, ax);
}

var29 = Color.RED;
}

Color var25 = var29;
jl.y.Y(context.method_51448(), this.p(var10), this.V(var4), var14, var14, var6, jh.f.n());
jl var30 = jl.y;
Matrix3x2fStack var10001 = context.method_51448();
float var10004 = var14 * 0.6F;
float var10005 = var14 * 0.6F;
Intrinsics.checkNotNull(var25);
var30.Y(var10001, var23, var24, var10004, var10005, var6, var25);
context.method_51448().popMatrix();
this.X(var14, var14);
}

@Override
public void w(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 4312191108922
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 29379288129452
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 36689842386875
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 38798774274332
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w 6612305006036320882
// 020: lload 1
// 021: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: lload 9
// 028: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02b: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 02e: dup
// 02f: sipush 11784
// 032: ldc2_w 593842633728485675
// 035: lload 1
// 036: lxor
// 037: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/p8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03f: astore 12
// 041: ldc 1.0E-5
// 043: fstore 13
// 045: bipush 0
// 046: putstatic su/catlean/p8.q Z
// 049: istore 11
// 04b: lload 3
// 04c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 04f: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 052: instanceof net/minecraft/class_408
// 055: iload 11
// 057: ifne 081
// 05a: ifne 084
// 05d: goto 06a
// 060: ldc2_w 6521529812925022388
// 063: lload 1
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: lload 3
// 06b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 071: instanceof su/catlean/rl
// 074: goto 081
// 077: ldc2_w 6521529812925022388
// 07a: lload 1
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: ifeq 0a6
// 084: lload 9
// 086: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 089: lload 5
// 08b: dup2_x1
// 08c: pop2
// 08d: checkcast net/minecraft/class_1297
// 090: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 093: checkcast net/minecraft/class_2374
// 096: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 099: goto 0a7
// 09c: ldc2_w 6521529812925022388
// 09f: lload 1
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: aconst_null
// 0a7: putstatic su/catlean/p8.H Lnet/minecraft/class_2338;
// 0aa: bipush 4
// 0ab: anewarray 377
// 0ae: astore 15
// 0b0: aload 15
// 0b2: bipush 0
// 0b3: aload 12
// 0b5: getfield net/minecraft/class_238.field_1323 D
// 0b8: aload 12
// 0ba: getfield net/minecraft/class_238.field_1322 D
// 0bd: ldc2_w 0.3
// 0c0: dadd
// 0c1: aload 12
// 0c3: getfield net/minecraft/class_238.field_1321 D
// 0c6: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 0c9: dup
// 0ca: sipush 18911
// 0cd: ldc2_w 7222541347519368959
// 0d0: lload 1
// 0d1: lxor
// 0d2: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/p8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0da: aastore
// 0db: aload 15
// 0dd: bipush 1
// 0de: aload 12
// 0e0: getfield net/minecraft/class_238.field_1323 D
// 0e3: aload 12
// 0e5: getfield net/minecraft/class_238.field_1322 D
// 0e8: ldc2_w 0.3
// 0eb: dadd
// 0ec: aload 12
// 0ee: getfield net/minecraft/class_238.field_1324 D
// 0f1: fload 13
// 0f3: f2d
// 0f4: dsub
// 0f5: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 0f8: dup
// 0f9: sipush 17733
// 0fc: ldc2_w 1872966890509501027
// 0ff: lload 1
// 100: lxor
// 101: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/p8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 109: aastore
// 10a: aload 15
// 10c: bipush 2
// 10d: aload 12
// 10f: getfield net/minecraft/class_238.field_1320 D
// 112: fload 13
// 114: f2d
// 115: dsub
// 116: aload 12
// 118: getfield net/minecraft/class_238.field_1322 D
// 11b: ldc2_w 0.3
// 11e: dadd
// 11f: aload 12
// 121: getfield net/minecraft/class_238.field_1321 D
// 124: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 127: dup
// 128: sipush 17733
// 12b: ldc2_w 1872966890509501027
// 12e: lload 1
// 12f: lxor
// 130: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/p8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 138: aastore
// 139: aload 15
// 13b: bipush 3
// 13c: aload 12
// 13e: getfield net/minecraft/class_238.field_1320 D
// 141: fload 13
// 143: f2d
// 144: dsub
// 145: aload 12
// 147: getfield net/minecraft/class_238.field_1322 D
// 14a: ldc2_w 0.3
// 14d: dadd
// 14e: aload 12
// 150: getfield net/minecraft/class_238.field_1324 D
// 153: fload 13
// 155: f2d
// 156: dsub
// 157: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 15a: dup
// 15b: sipush 17733
// 15e: ldc2_w 1872966890509501027
// 161: lload 1
// 162: lxor
// 163: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/p8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16b: aastore
// 16c: aload 15
// 16e: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 171: astore 14
// 173: aload 14
// 175: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 17a: astore 15
// 17c: aload 15
// 17e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 183: ifeq 1e0
// 186: aload 15
// 188: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 18d: checkcast net/minecraft/class_2338
// 190: astore 16
// 192: lload 7
// 194: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 197: aload 16
// 199: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 19c: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 19f: lload 1
// 1a0: lconst_0
// 1a1: lcmp
// 1a2: ifle 1dd
// 1a5: iload 11
// 1a7: ifne 1d8
// 1aa: ifne 1d7
// 1ad: goto 1ba
// 1b0: ldc2_w 6521529812925022388
// 1b3: lload 1
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: aload 16
// 1bc: putstatic su/catlean/p8.H Lnet/minecraft/class_2338;
// 1bf: iload 11
// 1c1: lload 1
// 1c2: lconst_0
// 1c3: lcmp
// 1c4: iflt 183
// 1c7: ifeq 17c
// 1ca: goto 1d7
// 1cd: ldc2_w 6521529812925022388
// 1d0: lload 1
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: bipush 1
// 1d8: putstatic su/catlean/p8.q Z
// 1db: iload 11
// 1dd: ifeq 17c
// 1e0: lload 1
// 1e1: lconst_0
// 1e2: lcmp
// 1e3: ifle 17c
// 1e6: return
}

static {
long var9 = a ^ 48118335932855L;
long var11 = var9 ^ 121267140827833L;
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
String var4 = "¦b\u008a¦¬F¯À%\u0086\u0082Fn'yÉ(TfkFGõªÏiÕê\u0086\u000f¬¿I=bô\u0016\u0005-u ÉÏ\u0086#\"ú³ò+\u008c\u008b¡i¿1j\u0018\u00011¼WÃG\u00adSråPÁ\u008d4ª4Êõ7Ý+[\n'";
int var6 = "¦b\u008a¦¬F¯À%\u0086\u0082Fn'yÉ(TfkFGõªÏiÕê\u0086\u000f¬¿I=bô\u0016\u0005-u ÉÏ\u0086#\"ú³ò+\u008c\u008b¡i¿1j\u0018\u00011¼WÃG\u00adSråPÁ\u008d4ª4Êõ7Ý+[\n'"
.length();
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
S = new p8(var11);
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

var4 = "ðgXÖ1Z¸Ì3\u001a\u009b'b¦\u0084×\u00954¼\u0085\u0084\u009c\u008eÍ8\u001a&?#YKÏ ¹q\u0097\bÜ4Ô3\\tg{\u0098\u0012\u009fÿ2ÐNÎVn\u0010í±äM·\u0017P\u0083Z";
var6 = "ðgXÖ1Z¸Ì3\u001a\u009b'b¦\u0084×\u00954¼\u0085\u0084\u009c\u008eÍ8\u001a&?#YKÏ ¹q\u0097\bÜ4Ô3\\tg{\u0098\u0012\u009fÿ2ÐNÎVn\u0010í±äM·\u0017P\u0083Z"
.length();
var3 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7505;
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
throw new RuntimeException("su/catlean/p8", var10);
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
throw new RuntimeException("su/catlean/p8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
