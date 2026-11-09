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
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r {
private final int b;
private final int Y;
private final int o;
@NotNull
private final class_1713 G;
private static final long a = yz.a(8566558813725042847L, 2471778388290338780L, MethodHandles.lookup().lookupClass()).a(78662324520366L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public r(int syncId, long a, int slotId, int button, @NotNull class_1713 actionType) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(actionType, a<"n">(3372, 1115850573999293L ^ ax));
super();
this.b = syncId;
this.Y = slotId;
this.o = button;
this.G = actionType;
}

public final int e() {
return this.b;
}

public final int y() {
return this.Y;
}

public final int j() {
return this.o;
}

@NotNull
public final class_1713 z() {
return this.G;
}

public final int W() {
return this.b;
}

public final int Q() {
return this.Y;
}

public final int c() {
return this.o;
}

@NotNull
public final class_1713 P() {
return this.G;
}

@NotNull
public final r n(long a, int syncId, int slotId, int button, @NotNull class_1713 actionType) {
ax = a ^ ax;
long var7 = ax ^ 3572419270320L;
Intrinsics.checkNotNullParameter(actionType, a<"n">(13709, 7904771146508920721L ^ ax));
return new r(syncId, var7, slotId, button, actionType);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 126474720451142L;
class_1713 var3 = this.G;
int var4 = this.o;
int var5 = this.Y;
int var6 = this.b;
return a<"n">(28320, 6424826114359634526L ^ var1)
+ var6
+ a<"n">(26017, 3603094480627114330L ^ var1)
+ var5
+ a<"n">(16095, 8734102335118637600L ^ var1)
+ var4
+ a<"n">(22011, 1363389899491086598L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 53007442004520L;
int[] var10000 = vm.a<"Å">(-1240806387843806757L, var1);
int var4 = Integer.hashCode(this.b);
var4 = var4 * b<"l">(3591, 8613316629616117708L ^ var1) + Integer.hashCode(this.Y);
var4 = var4 * b<"l">(27256, 7366158769216988081L ^ var1) + Integer.hashCode(this.o);
int[] var3 = var10000;
var4 = var4 * b<"l">(27256, 7366158769216988081L ^ var1) + this.G.hashCode();

try {
if (var3 == null) {
vm.a<"Å">(new _g[2], -1282170868327324663L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -1265554954411094096L, var1);
}
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/r.a J
// 03: ldc2_w 109956886243578
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8352610373615113463
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -8305327871326278302
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -8305327871326278302
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/r
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -8305327871326278302
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -8305327871326278302
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/r
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/r.b I
// 65: aload 5
// 67: getfield su/catlean/r.b I
// 6a: aload 4
// 6c: ifnull 94
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w -8305327871326278302
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -8305327871326278302
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/r.Y I
// 8f: aload 5
// 91: getfield su/catlean/r.Y I
// 94: aload 4
// 96: ifnull d0
// 99: if_icmpeq b5
// 9c: goto a9
// 9f: ldc2_w -8305327871326278302
// a2: lload 2
// a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8: athrow
// a9: bipush 0
// aa: ireturn
// ab: ldc2_w -8305327871326278302
// ae: lload 2
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 0
// b6: aload 4
// b8: ifnull e0
// bb: getfield su/catlean/r.o I
// be: aload 5
// c0: getfield su/catlean/r.o I
// c3: goto d0
// c6: ldc2_w -8305327871326278302
// c9: lload 2
// ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: athrow
// d0: if_icmpeq df
// d3: bipush 0
// d4: ireturn
// d5: ldc2_w -8305327871326278302
// d8: lload 2
// d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// de: athrow
// df: aload 0
// e0: getfield su/catlean/r.G Lnet/minecraft/class_1713;
// e3: aload 5
// e5: getfield su/catlean/r.G Lnet/minecraft/class_1713;
// e8: if_acmpeq f7
// eb: bipush 0
// ec: ireturn
// ed: ldc2_w -8305327871326278302
// f0: lload 2
// f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f6: athrow
// f7: bipush 1
// f8: ireturn
}

static {
long var11 = a ^ 81694494910488L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[6];
int var18 = 0;
String var17 = "\u008e\u001câíÏ\u009fè V¨_¸îÍêÑ\u009b5ã¼\u0090Mõì]Ïi\u0015ª\u001bì»A[FÜeü=¡ 2ÉÏéDQ~1[W\u0005Èeÿ£\u0099n¬p©¥+bÇ<$¹k\u0082\u0017F\u0017 Í\u0015\u001e\u00ad\u0007B\u0091ç¡\u0016õªµ3M{Ë\u0094ol\u008fXõ\u0080U\u008c©×1$\u0017û !8\u0001\t«\u001d\u0085\u0089®®_*Gqa>|-Ó\u008dL\u0006Z={m£¥ô;\u0012ý";
int var19 = "\u008e\u001câíÏ\u009fè V¨_¸îÍêÑ\u009b5ã¼\u0090Mõì]Ïi\u0015ª\u001bì»A[FÜeü=¡ 2ÉÏéDQ~1[W\u0005Èeÿ£\u0099n¬p©¥+bÇ<$¹k\u0082\u0017F\u0017 Í\u0015\u001e\u00ad\u0007B\u0091ç¡\u0016õªµ3M{Ë\u0094ol\u008fXõ\u0080U\u008c©×1$\u0017û !8\u0001\t«\u001d\u0085\u0089®®_*Gqa>|-Ó\u008dL\u0006Z={m£¥ô;\u0012ý"
.length();
char var16 = '(';
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
c = var20;
d = new String[6];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "éå×\u00ad¬1Z\u000f[I§pa¥\u0093WÚ'\u0095\u008eÐÕ\f\u0085";
int var5 = "éå×\u00ad¬1Z\u000f[I§pa¥\u0093WÚ'\u0095\u008eÐÕ\f\u0085".length();
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
g = new Integer[3];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "ñá*ïºà\u008b\u0080»\u0094áÉ^bñÆ\u001eñ¯ÐÌEëù\u0018d)VS¥\u001c#sÉ`\u008c ´Ú\u0083\u0098m\u0087\u0091;[®0Z";
var19 = "ñá*ïºà\u008b\u0080»\u0094áÉ^bñÆ\u001eñ¯ÐÌEëù\u0018d)VS¥\u001c#sÉ`\u008c ´Ú\u0083\u0098m\u0087\u0091;[®0Z".length();
var16 = 24;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String a(byte[] var0) {
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31619;
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
throw new RuntimeException("su/catlean/r", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/r" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9946;
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
throw new RuntimeException("su/catlean/r", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/r" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
