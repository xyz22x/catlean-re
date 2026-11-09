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
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class _6 extends _g {
@NotNull
public static final _6 d;
@NotNull
private static final cq t;
private static boolean G;
private static final long a = yz.a(-5176684480394093158L, -1088314767408584400L, MethodHandles.lookup().lookupClass()).a(134880797631408L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

private _6(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 46147732568929L;
super(b<"m">(22477, 3958995206754015392L ^ var1), jt.c(), null, 4, null, var3);
}

private final boolean s(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 129110578386660L;
return (Boolean)t.E(this, var6, X[0]);
}

public final boolean V() {
return G;
}

public final void h(boolean <set-?>) {
G = <set-?>;
}

@Flow(
priority = 10
)
private final void Z(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_6.a J
// 003: ldc2_w 6224575118114
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 44578637657769
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 2581704289779
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 52798525415874
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 32
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 10263925813816
// 03c: lxor
// 03d: lstore 11
// 03f: pop2
// 040: ldc2_w 2365786603419094203
// 043: lload 2
// 044: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: istore 13
// 04b: aload 0
// 04c: lload 4
// 04e: invokevirtual su/catlean/_6.S (J)Z
// 051: iload 13
// 053: ifeq 06a
// 056: ifne 067
// 059: goto 066
// 05c: ldc2_w 2331337721272162884
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: return
// 067: getstatic su/catlean/_6.G Z
// 06a: iload 13
// 06c: ifeq 096
// 06f: ifeq 08e
// 072: goto 07f
// 075: ldc2_w 2331337721272162884
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: bipush 0
// 080: putstatic su/catlean/_6.G Z
// 083: return
// 084: ldc2_w 2331337721272162884
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 091: lload 6
// 093: invokevirtual su/catlean/dm.Y (J)Z
// 096: iload 13
// 098: ifeq 0c4
// 09b: ifeq 143
// 09e: goto 0ab
// 0a1: ldc2_w 2331337721272162884
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 0
// 0ac: iload 8
// 0ae: i2c
// 0af: iload 9
// 0b1: iload 10
// 0b3: i2s
// 0b4: invokespecial su/catlean/_6.s (CIS)Z
// 0b7: goto 0c4
// 0ba: ldc2_w 2331337721272162884
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: iload 13
// 0c6: ifeq 12a
// 0c9: ifeq 103
// 0cc: goto 0d9
// 0cf: ldc2_w 2331337721272162884
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: lload 11
// 0db: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0de: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 0e1: iload 13
// 0e3: ifeq 12a
// 0e6: goto 0f3
// 0e9: ldc2_w 2331337721272162884
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: ifne 143
// 0f6: goto 103
// 0f9: ldc2_w 2331337721272162884
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: lload 11
// 105: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 108: iload 13
// 10a: ifeq 13f
// 10d: goto 11a
// 110: ldc2_w 2331337721272162884
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 11d: goto 12a
// 120: ldc2_w 2331337721272162884
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: ifne 143
// 12d: lload 11
// 12f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 132: goto 13f
// 135: ldc2_w 2331337721272162884
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 143: return
}

static {
long var16 = a ^ 26219846231382L;
long var18 = var16 ^ 31568833755633L;
long var20 = var16 ^ 34175702421230L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "¶\u000eV\u0001q;\u000b%\rE6h»ÆÕ,\bº\u0085»\u0087;òü*ü\u0097¹À¸\füÛ{}\u0080\u0004×ï*\u0018\u008d\u0014\u007f¨áWÙ\u001dßëp5õÝÉªº2½í¥\u009ex\"";
int var13 = "¶\u000eV\u0001q;\u000b%\rE6h»ÆÕ,\bº\u0085»\u0087;òü*ü\u0097¹À¸\füÛ{}\u0080\u0004×ï*\u0018\u008d\u0014\u007f¨áWÙ\u001dßëp5õÝÉªº2½í¥\u009ex\""
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
c = new String[4];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -3234344678459455309L;
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
Reflection.property1(new PropertyReference1Impl(_6.class, b<"m">(20015, 3732996425579058651L ^ var16), b<"m">(28204, 7528790924126451163L ^ var16), 0))
};
X = var22;
d = new _6(var20);
t = yp.t(d, b<"m">(6209, 8617418349334856628L ^ var16), false, var18, null, null, (int)var0, null);
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

var11 = "Jàc\u007f»~Ò!¤u¸9\u0017\u000b2\u000fÜ²+c«.:P¨\u0017\u001f\u009f½ÕÂr \u0094#\u0081TL\u0092\"þ\u0095,\u0090\u001cUÔýSÛc\u0082¬\u008a¦\u0096þÂNuî\u001f¥¨ä";
var13 = "Jàc\u007f»~Ò!¤u¸9\u0017\u000b2\u000fÜ²+c«.:P¨\u0017\u001f\u009f½ÕÂr \u0094#\u0081TL\u0092\"þ\u0095,\u0090\u001cUÔýSÛc\u0082¬\u008a¦\u0096þÂNuî\u001f¥¨ä"
.length();
var10 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25812;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_6", var10);
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
throw new RuntimeException("su/catlean/_6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
