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
import kotlin.Unit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ed extends _g {
@NotNull
public static final ed h;
@NotNull
private static final ct O;
@NotNull
private static final cw u;
private static final long a = yz.a(2226174474649823111L, -3382020810309357469L, MethodHandles.lookup().lookupClass()).a(34461637909882L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private ed(int var1, short var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 8593765549056L;
super(b<"a">(31629, 8418029329049957138L ^ var4), jt.d(), null, 4, null, var6);
}

private final float E(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 122529917950036L;
return ((Number)O.E(this, var6, W[0])).floatValue();
}

private final f9 i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100223928298211L;
return (f9)u.E(this, var3, W[1]);
}

private final void N(f9 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 81391843424575L;
u.b(this, var4, W[1], var1);
}

@Flow(
priority = -10
)
private final void Z(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ed.a J
// 03: ldc2_w 75616561506124
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 85576713851019
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 104601093702059
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 118153956274972
// 1b: lxor
// 1c: dup2
// 1d: bipush 48
// 1f: lushr
// 20: l2i
// 21: istore 8
// 23: dup2
// 24: bipush 16
// 26: lshl
// 27: bipush 32
// 29: lushr
// 2a: l2i
// 2b: istore 9
// 2d: dup2
// 2e: bipush 48
// 30: lshl
// 31: bipush 48
// 33: lushr
// 34: l2i
// 35: istore 10
// 37: pop2
// 38: dup2
// 39: ldc2_w 108018706304613
// 3c: lxor
// 3d: lstore 11
// 3f: pop2
// 40: ldc2_w -7178482642547498998
// 43: lload 2
// 44: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: astore 13
// 4b: lload 11
// 4d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 50: invokevirtual net/minecraft/class_746.method_6032 ()F
// 53: aload 0
// 54: iload 8
// 56: i2s
// 57: iload 9
// 59: iload 10
// 5b: i2c
// 5c: invokespecial su/catlean/ed.E (SIC)F
// 5f: fcmpg
// 60: aload 13
// 62: ifnonnull ab
// 65: ifgt ac
// 68: goto 75
// 6b: ldc2_w -7064382374050785737
// 6e: lload 2
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 78: getstatic net/minecraft/class_1802.field_8208 Lnet/minecraft/class_1792;
// 7b: dup
// 7c: sipush 23727
// 7f: ldc2_w 1268514432869866977
// 82: lload 2
// 83: lxor
// 84: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ed.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8c: aload 0
// 8d: lload 6
// 8f: invokespecial su/catlean/ed.i (J)Lsu/catlean/f9;
// 92: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/ed.F ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 97: lload 4
// 99: dup2_x1
// 9a: pop2
// 9b: invokevirtual su/catlean/gg.S (Lnet/minecraft/class_1792;Lsu/catlean/f9;JLkotlin/jvm/functions/Function0;)Z
// 9e: goto ab
// a1: ldc2_w -7064382374050785737
// a4: lload 2
// a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa: athrow
// ab: pop
// ac: return
}

private static final Unit F() {
long var0 = a ^ 98735149375877L;
long var2 = var0 ^ 131195007719462L;
ag.K(class_1268.field_5808, 0.0F, var2, 0.0F, c<"m">(488, 6630907753176766806L ^ var0), null);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 86374515832232L;
long var22 = var20 ^ 105470180198258L;
long var10001 = var20 ^ 114809629761905L;
int var24 = (int)((var20 ^ 114809629761905L) >>> 32);
int var25 = (int)((var20 ^ 114809629761905L) << 32 >>> 48);
int var26 = (int)(var10001 << 48 >>> 48);
long var27 = var20 ^ 51241838064520L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = ",\fIÉ[4\u009ao\u0015Ü¦9UF`¸]-eÔ\u00adÄÄJ ¹¢ê;<uÃñTµq`t!À[W9\u008f¾¤çh|¨kßPÁ'Y\u0003 â\u008cô\u0086XXÛæZq\u0097ê¹\u0084\u0016wq·\u009dãq\ftjucVÇ\u0091»gR\u00189f\u0091ÆÜ;èµ\u0097Z\"N_\u0005´÷â\u0015âï\u0019wX\u009e /DG\u001f;M\u0001\u00ad\u0019ªÆ¢rl)¬Eîp£J;xò\u008fia\u0095£W0«\u0010\u0093\u000e¥\u0090iÐò\b¤\u0018üt\u0084)5D";
int var17 = ",\fIÉ[4\u009ao\u0015Ü¦9UF`¸]-eÔ\u00adÄÄJ ¹¢ê;<uÃñTµq`t!À[W9\u008f¾¤çh|¨kßPÁ'Y\u0003 â\u008cô\u0086XXÛæZq\u0097ê¹\u0084\u0016wq·\u009dãq\ftjucVÇ\u0091»gR\u00189f\u0091ÆÜ;èµ\u0097Z\"N_\u0005´÷â\u0015âï\u0019wX\u009e /DG\u001f;M\u0001\u00ad\u0019ªÆ¢rl)¬Eîp£J;xò\u008fia\u0095£W0«\u0010\u0093\u000e¥\u0090iÐò\b¤\u0018üt\u0084)5D"
.length();
char var14 = 24;
int var31 = -1;

label45:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
byte var35 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var42 = b(var19).intern();
switch (var35) {
case 0:
var18[var16++] = var42;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[8];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "îrqóp¤j°,\u008a\u0017\\\u009b\u009a» \u000b\u008a-\u0098\u001a}\u000ep";
int var5 = "îrqóp¤j°,\u008a\u0017\\\u009b\u009a» \u000b\u008a-\u0098\u001a}\u000ep".length();
byte var2 = 0;

do {
byte var39 = var2;
var2 += 8;
byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
int var40 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var47 = -1;
var6[var40] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
KProperty[] var29 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ed.class, b<"a">(24872, 5742486764471218821L ^ var20), b<"a">(29899, 7585488088879753063L ^ var20), 0)),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(ed.class, b<"a">(9633, 2665853946452358664L ^ var20), b<"a">(23339, 5891209319978715268L ^ var20), 0)
)
};
W = var29;
h = new ed(var24, (short)var25, var26);
O = yp.k(
h, b<"a">(29299, 6649646711492764120L ^ var20), 5.0F, var22, RangesKt.rangeTo(1.0F, 20.0F), null, null, c<"m">(19808, 7306982630809977330L ^ var20), null
);
u = yp.L(h, b<"a">(3427, 5452119332925841101L ^ var20), f9.SILENT_FULL, null, null, c<"m">(5953, 6565900139076000721L ^ var20), null, var27);
return;
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var42;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label45;
}

var15 = "ç4\u007fØ`#ÅSYçmí¬(\u008210ÏüÚ\u0088s©Òy;1ÛRÙNA\u0095/\u0086\u00ad+ \f\u0090 !Éÿj®%{è@8\u009fcÇý\\^@g\u009er¬?$\u001a";
var17 = "ç4\u007fØ`#ÅSYçmí¬(\u008210ÏüÚ\u0088s©Òy;1ÛRÙNA\u0095/\u0086\u00ad+ \f\u0090 !Éÿj®%{è@8\u009fcÇý\\^@g\u009er¬?$\u001a".length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var35 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23622;
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
throw new RuntimeException("su/catlean/ed", var10);
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
throw new RuntimeException("su/catlean/ed" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17276;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ed", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/ed" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
