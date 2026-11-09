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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.FlagEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ek extends _g {
@NotNull
public static final ek y;
@NotNull
private static final cq t;
private static float D;
private static float u;
private static final long a = yz.a(-7560937557423633448L, -512671032944002783L, MethodHandles.lookup().lookupClass()).a(6613293068898L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private ek(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 72647788768865L;
super(b<"z">(10762, 2646999412066649900L ^ var1), jt.v(), null, 4, null, var3);
}

public final boolean I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 82155169871706L;
_g[] var5 = vm.a<"Å">(-5020720288871230844L, var1);

try {
boolean var10000 = (Boolean)t.E(this, var3, f[0]);
if (var5 == null) {
vm.a<"Å">(new _g[3], -5009765882664079292L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -4981412805069664680L, var1);
}
}

@Flow
private final void I(PlayerUpdateEvent var1) {
long var2 = a ^ 6390058434410L;
long var4 = var2 ^ 99225304479990L;
D = zf.v(var4).method_36454();
u = zf.v(var4).method_36455();
}

@Flow
private final void t(FlagEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ek.a J
// 03: ldc2_w 25771642271502
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 31924202998864
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 79719185395858
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -2093699996920739289
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnull 59
// 28: aload 0
// 29: lload 4
// 2b: invokevirtual su/catlean/ek.I (J)Z
// 2e: ifeq 67
// 31: goto 3e
// 34: ldc2_w -2126533554076920069
// 37: lload 2
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: lload 6
// 40: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43: getstatic su/catlean/ek.D F
// 46: ldc 1.0E-6
// 48: fadd
// 49: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 4c: goto 59
// 4f: ldc2_w -2126533554076920069
// 52: lload 2
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: lload 6
// 5b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5e: getstatic su/catlean/ek.u F
// 61: ldc 1.0E-6
// 63: fadd
// 64: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 67: return
}

@Flow
private final void P(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ek.a J
// 03: ldc2_w 27064422336822
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 20778751177320
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 78529474105002
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 6686052276754134047
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 1
// 24: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 27: instanceof net/minecraft/class_2708
// 2a: aload 8
// 2c: ifnull 52
// 2f: ifeq b2
// 32: goto 3f
// 35: ldc2_w 6648728202440698051
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: aload 0
// 40: lload 4
// 42: invokevirtual su/catlean/ek.I (J)Z
// 45: goto 52
// 48: ldc2_w 6648728202440698051
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: ifne b2
// 55: aload 1
// 56: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 59: astore 9
// 5b: aload 9
// 5d: checkcast net/minecraft/class_2708
// 60: invokevirtual net/minecraft/class_2708.comp_3228 ()Lnet/minecraft/class_10182;
// 63: dup
// 64: sipush 30509
// 67: ldc2_w 4585718906195540339
// 6a: lload 2
// 6b: lxor
// 6c: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/ek.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 74: astore 10
// 76: aload 9
// 78: dup
// 79: sipush 8740
// 7c: ldc2_w 8541977299176664189
// 7f: lload 2
// 80: lxor
// 81: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/ek.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 89: checkcast su/catlean/mixins/accessors/ClientboundPlayerPositionPacketAccessor
// 8c: new net/minecraft/class_10182
// 8f: dup
// 90: aload 10
// 92: invokevirtual net/minecraft/class_10182.comp_3148 ()Lnet/minecraft/class_243;
// 95: aload 10
// 97: invokevirtual net/minecraft/class_10182.comp_3149 ()Lnet/minecraft/class_243;
// 9a: lload 6
// 9c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9f: invokevirtual net/minecraft/class_746.method_36454 ()F
// a2: lload 6
// a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a7: invokevirtual net/minecraft/class_746.method_36455 ()F
// aa: invokespecial net/minecraft/class_10182.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;FF)V
// ad: invokeinterface su/catlean/mixins/accessors/ClientboundPlayerPositionPacketAccessor.setChange (Lnet/minecraft/class_10182;)V 2
// b2: return
}

static {
long var16 = a ^ 93975860220069L;
long var18 = var16 ^ 14411567366788L;
long var20 = var16 ^ 59784356228637L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[6];
int var12 = 0;
String var11 = "\u0015#@\u009fôf\u000b\u0083Óµ\u00934÷å\u0084ã\u009d\u0001ù\u0099,\u0086\u0010Ê#¼ß¯øßMÂ\u0005\u0010p\u000e(´x@\u0018Údý`\u008b\u0002Æý0nä\u008a <I(§¹\u0094íéÖÊE¨D\u0006\u0083Ý\u0001\u009a¥\u00902ðè¸q±\u0098¦\u0016§ððÄâ\u0003ö\u0097h¡\u0080Wèæ9¿?:P\u0011\nZ_a\u0013l\u0097ªà\u0096Z\u0094 µæ)Ç\u0018+k\u0097å\u0099ruú\u001cðl&%txÐ\u0088\u0088Yvî*\tá\u00adò:\u008b\bÏÅ\u001a7\u001cR29z:A³j×}\bâÑ\u0007®î¶¿¶§¯¾4\u007fkÓ\u0002\u0007Vþ=ª¼¦×¬hÒÐì\u008cÈ¿JÎèÍV\u0013\u0013\u0085ôo\u0014\u0014áÇ \u0082b\u009c\u007f9µ_1\u009aòs5·õúdñÇ\u008e\u0099\u009b\u0010\u00801r\u0014ÓÆÙU6p\u0097#G\u0007û\u0005";
int var13 = "\u0015#@\u009fôf\u000b\u0083Óµ\u00934÷å\u0084ã\u009d\u0001ù\u0099,\u0086\u0010Ê#¼ß¯øßMÂ\u0005\u0010p\u000e(´x@\u0018Údý`\u008b\u0002Æý0nä\u008a <I(§¹\u0094íéÖÊE¨D\u0006\u0083Ý\u0001\u009a¥\u00902ðè¸q±\u0098¦\u0016§ððÄâ\u0003ö\u0097h¡\u0080Wèæ9¿?:P\u0011\nZ_a\u0013l\u0097ªà\u0096Z\u0094 µæ)Ç\u0018+k\u0097å\u0099ruú\u001cðl&%txÐ\u0088\u0088Yvî*\tá\u00adò:\u008b\bÏÅ\u001a7\u001cR29z:A³j×}\bâÑ\u0007®î¶¿¶§¯¾4\u007fkÓ\u0002\u0007Vþ=ª¼¦×¬hÒÐì\u008cÈ¿JÎèÍV\u0013\u0013\u0085ôo\u0014\u0014áÇ \u0082b\u009c\u007f9µ_1\u009aòs5·õúdñÇ\u008e\u0099\u009b\u0010\u00801r\u0014ÓÆÙU6p\u0097#G\u0007û\u0005"
.length();
char var10 = '(';
int var24 = -1;

label37:
while (true) {
String var25 = var11.substring(++var24, var24 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var25.getBytes("ISO-8859-1"));
String var33 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var33;
if ((var24 += var10) >= var13) {
b = var14;
c = new String[6];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -323456462123637437L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var37 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var37;
KProperty[] var22 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ek.class, b<"z">(28596, 3631856907216386168L ^ var16), b<"z">(2069, 5359314599083909084L ^ var16), 0))
};
f = var22;
y = new ek(var20);
t = yp.t(y, b<"z">(4695, 4128909601885816220L ^ var16), true, var18, null, null, (int)var0, null);
return;
}

var10 = var11.charAt(var24);
break;
default:
var14[var12++] = var33;
if ((var24 += var10) < var13) {
var10 = var11.charAt(var24);
continue label37;
}

var11 = "\u008a\u0002\u0007k_\u0092n\"n\u0087u:&y¿Ë\u0018°vÚu7^-s£\u0082>e\n|øB3õ*©\u009bå Ú";
var13 = "\u008a\u0002\u0007k_\u0092n\"n\u0087u:&y¿Ë\u0018°vÚu7^-s£\u0082>e\n|øB3õ*©\u009bå Ú".length();
var10 = 16;
var24 = -1;
}

var25 = var11.substring(++var24, var24 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21406;
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
throw new RuntimeException("su/catlean/ek", var10);
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
throw new RuntimeException("su/catlean/ek" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
