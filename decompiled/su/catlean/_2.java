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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_241;
import net.minecraft.class_744;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ClientInputAccessor;

public final class _2 extends _g {
@NotNull
public static final _2 x;
private static boolean L;
private static final long a = yz.a(-4175720866563902228L, 5721813900176972765L, MethodHandles.lookup().lookupClass()).a(179858694017357L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private _2(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 68081570894101L;
super(b<"q">(11866, 2080629042046877067L ^ var1), jt.c(), null, 4, null, var3);
}

@Flow
private final void q(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_2.a J
// 003: ldc2_w 93322808354145
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 136904109386811
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 58514630847415
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 95838593301974
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 97286363099326
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 51500408073395
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 32
// 037: lushr
// 038: lstore 13
// 03a: pop2
// 03b: dup2
// 03c: ldc2_w 101322329743901
// 03f: lxor
// 040: lstore 15
// 042: pop2
// 043: ldc2_w 3487817209972978352
// 046: lload 2
// 047: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: istore 17
// 04e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 051: lload 8
// 053: invokevirtual su/catlean/dm.Y (J)Z
// 056: iload 17
// 058: ifne 086
// 05b: ifeq 0cf
// 05e: goto 06b
// 061: ldc2_w 3466665933960523582
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: lload 4
// 06d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 070: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 073: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 076: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 079: goto 086
// 07c: ldc2_w 3466665933960523582
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: iload 17
// 088: ifne 0cc
// 08b: ifeq 0cb
// 08e: goto 09b
// 091: ldc2_w 3466665933960523582
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: lload 4
// 09d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0a3: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 0a6: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0a9: iload 17
// 0ab: ifne 0cc
// 0ae: goto 0bb
// 0b1: ldc2_w 3466665933960523582
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: ifeq 0cf
// 0be: goto 0cb
// 0c1: ldc2_w 3466665933960523582
// 0c4: lload 2
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 1
// 0cc: goto 0d0
// 0cf: bipush 0
// 0d0: istore 18
// 0d2: iload 18
// 0d4: iload 17
// 0d6: ifne 125
// 0d9: ifeq 128
// 0dc: goto 0e9
// 0df: ldc2_w 3466665933960523582
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 0ec: new su/catlean/_w
// 0ef: dup
// 0f0: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0f3: iload 12
// 0f5: lload 13
// 0f7: invokevirtual su/catlean/dm.b (IJ)F
// 0fa: lload 15
// 0fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ff: invokevirtual net/minecraft/class_746.method_36455 ()F
// 102: lload 10
// 104: dup2_x1
// 105: pop2
// 106: bipush 0
// 107: getstatic su/catlean/z3.FORCE Lsu/catlean/z3;
// 10a: bipush 4
// 10b: aconst_null
// 10c: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 10f: bipush 0
// 110: lload 6
// 112: dup2_x2
// 113: pop2
// 114: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 117: bipush 1
// 118: goto 125
// 11b: ldc2_w 3466665933960523582
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: putstatic su/catlean/_2.L Z
// 128: return
}

@Flow(
priority = 10
)
private final void G(KeyboardInputEvent var1) {
long var2 = a ^ 36266818486697L;
int var4 = (int)((var2 ^ 99826608195707L) >>> 32);
long var5 = (var2 ^ 99826608195707L) << 32 >>> 32;
long var7 = var2 ^ 44232248837845L;
int var9 = vm.a<"Å">(1496861210410410552L, var2);

boolean var10000;
label22: {
try {
var10000 = L;
if (var9 == 0) {
break label22;
}

if (!L) {
return;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 1500937073138863094L, var2);
}

var10000 = false;
}

L = var10000;
float var10 = zf.v(var7).field_3913.method_3128().field_1342;
float var11 = zf.v(var7).field_3913.method_3128().field_1343;
float var12 = (zf.v(var7).method_36454() - dm.h.b(var4, var5)) * (float) (Math.PI / 180.0);
float var13 = (float)Math.cos(var12);
float var14 = (float)Math.sin(var12);
class_744 var16 = zf.v(var7).field_3913;
Intrinsics.checkNotNull(var16, b<"q">(23720, 1312095629391518478L ^ var2));
((ClientInputAccessor)var16).setMoveVector(new class_241(MathKt.roundToInt(var11 * var13 - var10 * var14), MathKt.roundToInt(var10 * var13 + var11 * var14)));
}

static {
long var9 = a ^ 79066652527624L;
long var11 = var9 ^ 100292575481284L;
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
String var4 = "\f\u0098\u0097Û\u008eú8\u0000\u0092\u000erLù×\u008b\u001e\u008f\u0002\u0083rÅ\u0011ÉV\u0090\u001c¹±\u00896\u0093\u009e§KU\u0095rAôuæÆ½pOÝìpZ\u000eÚ\u0092ºS8|D¹,gä7H\u0085`ä´)2¥\u0084¡2\u009fô\"Åû \u009cmØ\u0018o\u0004TJ'ó-ñ\u0099?*Z*õ¼\u001efÀ\u009bæòðÓ>Fò\u0016ó\u0004úÂaÈ¥mÑQ5²\u0099Á\u0082§mýÛ¯Ã\u008e&åöÚ¶¤ Æ²\u0096}\u000bùÇóÊ®°Ø\u009fSÚ¹\u009b<ì2*òÐ¤½é@ñÓ£";
int var6 = "\f\u0098\u0097Û\u008eú8\u0000\u0092\u000erLù×\u008b\u001e\u008f\u0002\u0083rÅ\u0011ÉV\u0090\u001c¹±\u00896\u0093\u009e§KU\u0095rAôuæÆ½pOÝìpZ\u000eÚ\u0092ºS8|D¹,gä7H\u0085`ä´)2¥\u0084¡2\u009fô\"Åû \u009cmØ\u0018o\u0004TJ'ó-ñ\u0099?*Z*õ¼\u001efÀ\u009bæòðÓ>Fò\u0016ó\u0004úÂaÈ¥mÑQ5²\u0099Á\u0082§mýÛ¯Ã\u008e&åöÚ¶¤ Æ²\u0096}\u000bùÇóÊ®°Ø\u009fSÚ¹\u009b<ì2*òÐ¤½é@ñÓ£"
.length();
char var3 = 24;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var15 = b(var8).intern();
byte var10001 = -1;
var7[var5++] = var15;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
x = new _2(var11);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4637;
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
throw new RuntimeException("su/catlean/_2", var10);
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
throw new RuntimeException("su/catlean/_2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
