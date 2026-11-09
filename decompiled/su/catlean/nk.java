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
import kotlin.collections.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class nk implements ym {
@NotNull
public static final nk f;
@NotNull
private static final ArrayDeque Q;
private static int n;
private static String x;
private static final long a = yz.a(1313455027364634256L, -6703462306956533736L, MethodHandles.lookup().lookupClass()).a(11254470846963L);
private static final String b;
private static final long[] c;
private static final Integer[] d;
private static final Map e;

private nk() {
}

public final int D() {
return n;
}

public final void B(int <set-?>) {
n = <set-?>;
}

@Flow
public final void D(@NotNull Render3DEvent event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nk.a J
// 03: ldc2_w 65948199650610
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 5087954458230630557
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: getstatic su/catlean/nk.b Ljava/lang/String;
// 15: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 18: invokestatic su/catlean/zf.A ()J
// 1b: lstore 5
// 1d: astore 4
// 1f: getstatic su/catlean/nk.Q Lkotlin/collections/ArrayDeque;
// 22: lload 5
// 24: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 27: invokevirtual kotlin/collections/ArrayDeque.addLast (Ljava/lang/Object;)V
// 2a: getstatic su/catlean/nk.Q Lkotlin/collections/ArrayDeque;
// 2d: invokevirtual kotlin/collections/ArrayDeque.firstOrNull ()Ljava/lang/Object;
// 30: checkcast java/lang/Long
// 33: dup
// 34: ifnull ab
// 37: checkcast java/lang/Number
// 3a: invokevirtual java/lang/Number.longValue ()J
// 3d: lstore 7
// 3f: bipush 0
// 40: istore 9
// 42: lload 7
// 44: sipush 16968
// 47: ldc2_w 3516046317269588421
// 4a: lload 2
// 4b: lxor
// 4c: invokedynamic d (IJ)I bsm=su/catlean/nk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: i2l
// 52: ladd
// 53: lload 5
// 55: lcmp
// 56: aload 4
// 58: ifnonnull ad
// 5b: aload 4
// 5d: ifnonnull 7e
// 60: goto 6d
// 63: ldc2_w 5106765448193089458
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: ifge 81
// 70: goto 7d
// 73: ldc2_w 5106765448193089458
// 76: lload 2
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 1
// 7e: goto 82
// 81: bipush 0
// 82: nop
// 83: aload 4
// 85: ifnonnull a8
// 88: bipush 1
// 89: if_icmpne a7
// 8c: goto 99
// 8f: ldc2_w 5106765448193089458
// 92: lload 2
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: bipush 1
// 9a: goto ad
// 9d: ldc2_w 5106765448193089458
// a0: lload 2
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: bipush 0
// a8: goto ad
// ab: pop
// ac: bipush 0
// ad: ifeq c9
// b0: getstatic su/catlean/nk.Q Lkotlin/collections/ArrayDeque;
// b3: invokevirtual kotlin/collections/ArrayDeque.removeFirst ()Ljava/lang/Object;
// b6: pop
// b7: aload 4
// b9: ifnull 2a
// bc: goto c9
// bf: ldc2_w 5106765448193089458
// c2: lload 2
// c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c8: athrow
// c9: getstatic su/catlean/nk.Q Lkotlin/collections/ArrayDeque;
// cc: invokevirtual kotlin/collections/ArrayDeque.size ()I
// cf: bipush 4
// d0: invokestatic java/lang/Math.max (II)I
// d3: putstatic su/catlean/nk.n I
// d6: return
}

static {
long var14 = a ^ 20128211039203L;
if (vm.a<"Å">(-5709547010313940893L, var14) != null) {
vm.a<"Å">("ei1Go", -5714801605659899547L, var14);
}

Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var14 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var13 = var11.doFinal("·K\u008f\u001eo4qL".getBytes("ISO-8859-1"));
String var19 = a(var13).intern();
int var10001 = -1;
b = var19;
e = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "ÙÉjv^%^³F{M2Ú´\u009ah";
int var5 = "ÙÉjv^%^³F{M2Ú´\u009ah".length();
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
byte var22 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

c = var6;
d = new Integer[2];
f = new nk();
Q = new ArrayDeque();
n = a<"d">(8466, 6439316589979831375L ^ var14);
}

public static void L(String var0) {
x = var0;
}

public static String h() {
return x;
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7259;
if (d[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = c[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])e.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/nk", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
d[var3] = var15;
}

return d[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/nk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
