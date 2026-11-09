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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qq extends _g {
@NotNull
public static final qq V;
@NotNull
private static final c8 U;
private static final long a = yz.a(4028453455007656430L, 129853559770542919L, MethodHandles.lookup().lookupClass()).a(93899997799702L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private qq(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 61921804003001L;
super(b<"n">(31146, 996405756625074868L ^ var1), jt.A(), null, 4, null, var3);
}

private final int a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 65481896985924L;
return ((Number)U.E(this, var3, c[0])).intValue();
}

@Flow(
priority = -10
)
private final void x(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qq.a J
// 003: ldc2_w 59656182531465
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 46655620661230
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 69917344243307
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 84727998565577
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 37433713389412
// 031: lxor
// 032: lstore 11
// 034: pop2
// 035: ldc2_w -4786775860288108224
// 038: lload 2
// 039: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: lload 11
// 040: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 043: astore 14
// 045: istore 13
// 047: bipush 0
// 048: istore 15
// 04a: aload 14
// 04c: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 04f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 052: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 055: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 058: iload 13
// 05a: ifeq 0af
// 05d: ifne 09d
// 060: goto 06d
// 063: ldc2_w -4782152054000196883
// 066: lload 2
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: aload 14
// 06f: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 072: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 075: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 078: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 07b: iload 13
// 07d: ifeq 0af
// 080: goto 08d
// 083: ldc2_w -4782152054000196883
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: ifeq 130
// 090: goto 09d
// 093: ldc2_w -4782152054000196883
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 14
// 09f: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 0a2: goto 0af
// 0a5: ldc2_w -4782152054000196883
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: iload 13
// 0b1: ifeq 0e8
// 0b4: ifeq 130
// 0b7: goto 0c4
// 0ba: ldc2_w -4782152054000196883
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: aload 14
// 0c6: iload 13
// 0c8: ifeq 12d
// 0cb: goto 0d8
// 0ce: ldc2_w -4782152054000196883
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: invokevirtual net/minecraft/class_746.method_6048 ()I
// 0db: goto 0e8
// 0de: ldc2_w -4782152054000196883
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: getstatic su/catlean/qq.V Lsu/catlean/qq;
// 0eb: lload 9
// 0ed: invokespecial su/catlean/qq.a (J)I
// 0f0: if_icmplt 130
// 0f3: iload 6
// 0f5: lload 7
// 0f7: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 0fa: lload 11
// 0fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ff: checkcast net/minecraft/class_1657
// 102: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
// 105: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 108: fconst_0
// 109: lload 4
// 10b: fconst_0
// 10c: sipush 28170
// 10f: ldc2_w 5181539722245556125
// 112: lload 2
// 113: lxor
// 114: invokedynamic e (IJ)I bsm=su/catlean/qq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: aconst_null
// 11a: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 11d: pop
// 11e: aload 14
// 120: goto 12d
// 123: ldc2_w -4782152054000196883
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: invokevirtual net/minecraft/class_746.method_6075 ()V
// 130: nop
// 131: nop
// 132: return
}

static {
long var20 = a ^ 46803098053519L;
long var22 = var20 ^ 25214111996345L;
long var24 = var20 ^ 57127562993135L;
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
String var15 = "^ÎðÎ\u0083\u0001nZò\u0016\u000b\u0093@\\«û\u0018\u008dæOA\u001f\u0082\u0015éOÍè¥\u009f\ró¥Å)OGqM$)";
int var17 = "^ÎðÎ\u0083\u0001nZò\u0016\u000b\u0093@\\«û\u0018\u008dæOA\u001f\u0082\u0015éOÍè¥\u009f\ró¥Å)OGqM$)".length();
char var14 = 16;
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
d = new String[4];
h = new HashMap(13);
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
String var4 = "r\u000f\u009f\u008fù_«|\u0000Õwn\u0017ø!L\u00902j\u0019 \u008ckw";
int var5 = "r\u000f\u009f\u008fù_«|\u0000Õwn\u0017ø!L\u00902j\u0019 \u008ckw".length();
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

f = var6;
g = new Integer[3];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qq.class, b<"n">(22622, 4692440406597730095L ^ var20), b<"n">(21168, 2524783255120672192L ^ var20), 0))
};
c = var26;
V = new qq(var24);
U = yp.L(
V,
b<"n">(30895, 7076811276638085085L ^ var20),
3,
new IntRange(0, c<"e">(19729, 1438933603908110977L ^ var20)),
var22,
null,
null,
c<"e">(16597, 6701126472763000647L ^ var20),
null
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

var15 = "\u007f6å°¤v\u0017çb±ò¼\u001e>lNª\u000fê&Ó\u0089\u0016\u0014\u0010\u0083ú³í$Ûö5Ø7Ý\u001d\u0089xªÃ";
var17 = "\u007f6å°¤v\u0017çb±ò¼\u001e>lNª\u000fê&Ó\u0089\u0016\u0014\u0010\u0083ú³í$Ûö5Ø7Ý\u001d\u0089xªÃ".length();
var14 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13692;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qq", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/qq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5533;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/qq", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/qq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
