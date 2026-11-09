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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_5498;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.CameraOffsetEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kd extends _g {
@NotNull
public static final kd V;
@NotNull
private static final ct f;
@NotNull
private static fd Y;
@NotNull
private static class_5498 A;
private static final long a = yz.a(7605663450691189193L, 8624925237643576773L, MethodHandles.lookup().lookupClass()).a(157427514851799L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private kd(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 87787759183470L;
super(b<"z">(32473, 5671757696828750025L ^ var4), jt.F(), null, 4, null, var6);
}

private final float P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 29772130860698L;
return ((Number)f.E(this, var3, k[0])).floatValue();
}

private final void a(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 15440396178300L;
f.b(this, var4, k[0], var1);
}

@Flow
private final void f(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kd.a J
// 03: ldc2_w 15299071799097
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 39505481693019
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 47076692178982
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 3145271422408773669
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnull 82
// 28: getstatic su/catlean/kd.A Lnet/minecraft/class_5498;
// 2b: lload 4
// 2d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 30: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 33: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 36: if_acmpeq 79
// 39: goto 46
// 3c: ldc2_w 3090666078236805758
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: getstatic su/catlean/kd.Y Lsu/catlean/fd;
// 49: fconst_0
// 4a: invokevirtual su/catlean/fd.P (F)V
// 4d: lload 4
// 4f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 52: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 55: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 58: dup
// 59: sipush 10071
// 5c: ldc2_w 3708977939503168992
// 5f: lload 2
// 60: lxor
// 61: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/kd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 69: putstatic su/catlean/kd.A Lnet/minecraft/class_5498;
// 6c: goto 79
// 6f: ldc2_w 3090666078236805758
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: getstatic su/catlean/kd.Y Lsu/catlean/fd;
// 7c: lload 6
// 7e: fconst_1
// 7f: invokevirtual su/catlean/fd.B (JF)V
// 82: return
}

@Flow
private final void B(CameraOffsetEvent var1) {
long var2 = a ^ 126249461181741L;
long var4 = var2 ^ 45087994421171L;
var1.setOffset(1.0F + (this.P(var4) - 1.0F) * Y.a());
var1.cancel();
}

static {
long var23 = a ^ 112367314305513L;
long var25 = var23 ^ 104500274695262L;
long var27 = var23 ^ 51864559642374L;
long var10001 = var23 ^ 9690903312222L;
int var29 = (int)((var23 ^ 9690903312222L) >>> 48);
int var30 = (int)((var23 ^ 9690903312222L) << 16 >>> 48);
int var31 = (int)(var10001 << 32 >>> 32);
Cipher var14;
Cipher var10000 = var14 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var23 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var15 = 1; var15 < 8; var15++) {
var10003[var15] = (byte)(var23 << var15 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var21 = new String[5];
int var19 = 0;
String var18 = "\u001aÞÜû\u0006p÷\u00adù®ZÉ<\u0006$¯*M\u009b\u008d7½~Î:Hnh5`ù\u008ee¤\u0096äô±\u000f½ Þõ\b©&RÕ*¡³(\u001e\u001c\u0082ßíÁ\u000b=äP4l0Nbo\u00155¬Eß LÕÈv\u008cþ\u0081ÞÆ\u008b;\fé\u0080Óz\u0093ß\u0016Åû°\u0004 \u0006O+^T\u009fN\u0095";
int var20 = "\u001aÞÜû\u0006p÷\u00adù®ZÉ<\u0006$¯*M\u009b\u008d7½~Î:Hnh5`ù\u008ee¤\u0096äô±\u000f½ Þõ\b©&RÕ*¡³(\u001e\u001c\u0082ßíÁ\u000b=äP4l0Nbo\u00155¬Eß LÕÈv\u008cþ\u0081ÞÆ\u008b;\fé\u0080Óz\u0093ß\u0016Åû°\u0004 \u0006O+^T\u009fN\u0095"
.length();
char var17 = '(';
int var34 = -1;

label49:
while (true) {
String var35 = var18.substring(++var34, var34 + var17);
byte var39 = -1;

while (true) {
byte[] var22 = var14.doFinal(var35.getBytes("ISO-8859-1"));
String var46 = b(var22).intern();
switch (var39) {
case 0:
var21[var19++] = var46;
if ((var34 += var17) >= var20) {
b = var21;
c = new String[5];
Cipher var9;
var10000 = var9 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var23 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var10 = 1; var10 < 8; var10++) {
var10003[var10] = (byte)(var23 << var10 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var11 = 6715543078490045620L;
byte[] var13 = var9.doFinal(
new byte[]{
(byte)(var11 >>> 56),
(byte)(var11 >>> 48),
(byte)(var11 >>> 40),
(byte)(var11 >>> 32),
(byte)(var11 >>> 24),
(byte)(var11 >>> 16),
(byte)(var11 >>> 8),
(byte)var11
}
);
long var50 = (var13[0] & 255L) << 56
| (var13[1] & 255L) << 48
| (var13[2] & 255L) << 40
| (var13[3] & 255L) << 32
| (var13[4] & 255L) << 24
| (var13[5] & 255L) << 16
| (var13[6] & 255L) << 8
| var13[7] & 255L;
byte var43 = -1;
long var7 = var50;
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var23 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var23 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -2954244434832901779L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var52 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var44 = -1;
long var0 = var52;
KProperty[] var32 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kd.class, b<"z">(25652, 9046569393121267792L ^ var23), b<"z">(4786, 2893894277625931473L ^ var23), 0)
)
};
k = var32;
V = new kd((char)var29, (short)var30, var31);
f = yp.k(V, b<"z">(97, 3644604989571855367L ^ var23), 3.0F, var25, RangesKt.rangeTo(1.0F, 20.0F), null, null, (int)var7, null);
Y = new fd(_s.OUT_QUINT, var0, var27);
A = class_5498.field_26664;
return;
}

var17 = var18.charAt(var34);
break;
default:
var21[var19++] = var46;
if ((var34 += var17) < var20) {
var17 = var18.charAt(var34);
continue label49;
}

var18 = "\u0095ÙÌ+CK\u001fîáÌ#|\u0015Þ%M°¥v\u0088\u0007öS{\u0018Ü7¥Ùæ,\u009b¡Þ\u008e\u008e\u000bR{ù8Wpñ\u0099Ó\u0002À@";
var20 = "\u0095ÙÌ+CK\u001fîáÌ#|\u0015Þ%M°¥v\u0088\u0007öS{\u0018Ü7¥Ùæ,\u009b¡Þ\u008e\u008e\u000bR{ù8Wpñ\u0099Ó\u0002À@".length();
var17 = 24;
var34 = -1;
}

var35 = var18.substring(++var34, var34 + var17);
var39 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12453;
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
throw new RuntimeException("su/catlean/kd", var10);
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
throw new RuntimeException("su/catlean/kd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
