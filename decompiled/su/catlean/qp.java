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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.api.event.events.player.UsingItemEvent;
import su.catlean.gofra.Flow;

public final class qp extends _g {
@NotNull
public static final qp S;
@NotNull
private static final ct W;
private static boolean i;
private static final long a = yz.a(4467084617582284403L, 7837622134091032439L, MethodHandles.lookup().lookupClass()).a(44826970442611L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private qp(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 77272844101283L;
super(b<"z">(8376, 7654918612913876919L ^ var1), jt.n(), null, 4, null, var3);
}

private final float V(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 123065251129307L;
return ((Number)W.E(this, var6, y[0])).floatValue();
}

@Flow(
priority = -10
)
private final void P(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qp.a J
// 003: ldc2_w 44327132987215
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 2524014797809
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 8234886091920
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 11196032037755
// 035: lxor
// 036: lstore 9
// 038: pop2
// 039: ldc2_w -2183562616404133886
// 03c: lload 2
// 03d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: bipush 0
// 043: putstatic su/catlean/qp.i Z
// 046: astore 11
// 048: lload 9
// 04a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04d: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 050: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 053: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
// 056: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 059: aload 11
// 05b: ifnull 0a2
// 05e: ifne 0a1
// 061: goto 06e
// 064: ldc2_w -2201914845851580389
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: lload 9
// 070: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 073: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 076: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 079: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 07f: aload 11
// 081: ifnull 0a2
// 084: goto 091
// 087: ldc2_w -2201914845851580389
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: ifeq 0a5
// 094: goto 0a1
// 097: ldc2_w -2201914845851580389
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: bipush 1
// 0a2: goto 0a6
// 0a5: bipush 0
// 0a6: istore 12
// 0a8: lload 9
// 0aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ad: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0b0: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0b3: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b9: aload 11
// 0bb: ifnull 102
// 0be: ifne 101
// 0c1: goto 0ce
// 0c4: ldc2_w -2201914845851580389
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: lload 9
// 0d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d3: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0d6: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0d9: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
// 0dc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0df: aload 11
// 0e1: ifnull 102
// 0e4: goto 0f1
// 0e7: ldc2_w -2201914845851580389
// 0ea: lload 2
// 0eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: athrow
// 0f1: ifeq 105
// 0f4: goto 101
// 0f7: ldc2_w -2201914845851580389
// 0fa: lload 2
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: bipush 1
// 102: goto 106
// 105: bipush 0
// 106: istore 13
// 108: iload 12
// 10a: aload 11
// 10c: ifnull 16e
// 10f: ifne 143
// 112: goto 11f
// 115: ldc2_w -2201914845851580389
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: iload 13
// 121: aload 11
// 123: ifnull 16e
// 126: goto 133
// 129: ldc2_w -2201914845851580389
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: ifeq 1ec
// 136: goto 143
// 139: ldc2_w -2201914845851580389
// 13c: lload 2
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: lload 9
// 145: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 148: invokevirtual net/minecraft/class_746.method_6032 ()F
// 14b: lload 9
// 14d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 150: invokevirtual net/minecraft/class_746.method_6067 ()F
// 153: fadd
// 154: aload 0
// 155: iload 6
// 157: i2c
// 158: iload 7
// 15a: iload 8
// 15c: i2c
// 15d: invokespecial su/catlean/qp.V (CIC)F
// 160: fcmpg
// 161: goto 16e
// 164: ldc2_w -2201914845851580389
// 167: lload 2
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: aload 11
// 170: ifnull 198
// 173: ifgt 1ec
// 176: goto 183
// 179: ldc2_w -2201914845851580389
// 17c: lload 2
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: lload 9
// 185: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 188: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 18b: goto 198
// 18e: ldc2_w -2201914845851580389
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: aload 11
// 19a: ifnull 1e9
// 19d: ifne 1e8
// 1a0: goto 1ad
// 1a3: ldc2_w -2201914845851580389
// 1a6: lload 2
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: iload 12
// 1af: ifeq 1cf
// 1b2: goto 1bf
// 1b5: ldc2_w -2201914845851580389
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 1c2: goto 1d2
// 1c5: ldc2_w -2201914845851580389
// 1c8: lload 2
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1d2: fconst_0
// 1d3: lload 4
// 1d5: fconst_0
// 1d6: sipush 25823
// 1d9: ldc2_w 5396287247062787691
// 1dc: lload 2
// 1dd: lxor
// 1de: invokedynamic i (IJ)I bsm=su/catlean/qp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: aconst_null
// 1e4: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 1e7: pop
// 1e8: bipush 1
// 1e9: putstatic su/catlean/qp.i Z
// 1ec: return
}

@Flow
private final void U(UsingItemEvent var1) {
long var2 = a ^ 131585805128277L;

try {
if (i) {
var1.cancel();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 894920966553232641L, var2);
}
}

@Flow
private final void o(StopUsingItemEvent var1) {
long var2 = a ^ 82216382588120L;

try {
if (i) {
var1.cancel();
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 8855863075088044940L, var2);
}
}

static {
long var20 = a ^ 118577123125061L;
long var22 = var20 ^ 138812469489794L;
long var24 = var20 ^ 13926063493439L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "!\fæ¬:*(»\\ýMm[ÕPØi%b\u0002ÄZOý\u0083£ìkÆ\u0090Õn 9Ù`ÿ>\u0013s\u0098ê´æ\u0091Fý\u0092]Ù\u009bC\u0091\u0016qîF¢ß§v!¦\u0099>";
int var17 = "!\fæ¬:*(»\\ýMm[ÕPØi%b\u0002ÄZOý\u0083£ìkÆ\u0090Õn 9Ù`ÿ>\u0013s\u0098ê´æ\u0091Fý\u0092]Ù\u009bC\u0091\u0016qîF¢ß§v!¦\u0099>".length();
char var14 = ' ';
int var28 = -1;

label45:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
c = new String[4];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u008a²JÌ\u0006RæÂ\u009a\u0012G\u0017\u001a\tsV";
int var5 = "\u008a²JÌ\u0006RæÂ\u009a\u0012G\u0017\u001a\tsV".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
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
byte var43 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qp.class, b<"z">(21896, 3012541231432783073L ^ var20), b<"z">(12054, 1613192225198648956L ^ var20), 0))
};
y = var26;
S = new qp(var24);
W = yp.k(
S, b<"z">(31538, 6130801756093053530L ^ var20), 15.0F, var22, RangesKt.rangeTo(1.0F, 36.0F), null, null, c<"i">(4451, 1372300282188696540L ^ var20), null
);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label45;
}

var15 = "\u009f\u0004nh(8\u0018CÔE\u0017f7é\u008b\u001e\u0010\u0005\u001a½4u\u0006\u008fÍ±¸\u008cÐPâ\u008fì";
var17 = "\u009f\u0004nh(8\u0018CÔE\u0017f7é\u008b\u001e\u0010\u0005\u001a½4u\u0006\u008fÍ±¸\u008cÐPâ\u008fì".length();
var14 = 16;
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31092;
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
throw new RuntimeException("su/catlean/qp", var10);
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
throw new RuntimeException("su/catlean/qp" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25248;
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
throw new RuntimeException("su/catlean/qp", var14);
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
throw new RuntimeException("su/catlean/qp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
