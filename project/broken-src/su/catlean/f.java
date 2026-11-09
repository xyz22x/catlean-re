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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class f {
@NotNull
private final Runnable o;
private int Y;
private byte m;
private boolean s;
private long Z;
private static final long a = yz.a(5560506419059705471L, 1901072871140361640L, MethodHandles.lookup().lookupClass()).a(267273582825383L);
private static final String b;
private static final long[] c;
private static final Integer[] d;
private static final Map e;

public f(@NotNull Runnable action, int delay, long a, byte priority, boolean tick, long time) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(action, b);
super();
String[] var10000 = vm.a<"Å">(-3914532958079739404L, ax);
this.o = action;
this.Y = delay;
this.m = priority;
String[] var9 = var10000;

try {
this.s = tick;
this.Z = time;
if (var9 == null) {
vm.a<"Å">(new _g[2], -3926613977818676292L, ax);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -3896869362998744677L, ax);
}
}

public f(long var1, Runnable var3, int var4, byte var5, boolean var6, long var7, int var9, DefaultConstructorMarker var10) {
var1 = a ^ var1;
long var11 = var1 ^ 41113802662253L;
if ((var9 & 4) != 0) {
var5 = a<"u">(12333, 5943430167812360743L ^ var1);
}

if ((var9 & a<"u">(18318, 3127775998104780166L ^ var1)) != 0) {
var6 = true;
}

if ((var9 & a<"u">(23693, 5477535280556811910L ^ var1)) != 0) {
var7 = zf.A();
}

this(var3, var4, var11, (byte)var5, var6, var7);
}

@NotNull
public final Runnable u() {
return this.o;
}

public final int H() {
return this.Y;
}

public final void c(int <set-?>) {
this.Y = <set-?>;
}

public final byte B() {
return this.m;
}

public final void k(byte <set-?>) {
this.m = <set-?>;
}

public final boolean p() {
return this.s;
}

public final void A(boolean <set-?>) {
this.s = <set-?>;
}

public final long w() {
return this.Z;
}

public final void o(long <set-?>) {
this.Z = <set-?>;
}

public final boolean W(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/f.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -8413347720871978139
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 0
// 11: aload 0
// 12: getfield su/catlean/f.Y I
// 15: aload 0
// 16: getfield su/catlean/f.s Z
// 19: aload 3
// 1a: ifnull 2e
// 1d: ifeq 31
// 20: goto 2d
// 23: ldc2_w -8396248863256138998
// 26: lload 1
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: bipush 1
// 2e: goto 3a
// 31: invokestatic su/catlean/zf.A ()J
// 34: aload 0
// 35: getfield su/catlean/f.Z J
// 38: lsub
// 39: l2i
// 3a: isub
// 3b: putfield su/catlean/f.Y I
// 3e: aload 0
// 3f: getfield su/catlean/f.Y I
// 42: aload 3
// 43: ifnull 73
// 46: ifge 6b
// 49: goto 56
// 4c: ldc2_w -8396248863256138998
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 0
// 57: getfield su/catlean/f.o Ljava/lang/Runnable;
// 5a: invokeinterface java/lang/Runnable.run ()V 1
// 5f: bipush 1
// 60: ireturn
// 61: ldc2_w -8396248863256138998
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 0
// 6c: invokestatic su/catlean/zf.A ()J
// 6f: putfield su/catlean/f.Z J
// 72: bipush 0
// 73: ireturn
}

static {
long var11 = a ^ 3172009532300L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var15 = var13.doFinal("{Ao+=S/&".getBytes("ISO-8859-1"));
String var19 = a(var15).intern();
int var10001 = -1;
b = var19;
e = new HashMap(13);
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
String var4 = "IrõÉ\u009b\u001c5ÿë6vQ\"6ÌP\u009dî\u0096Õãâ\u0015'";
int var5 = "IrõÉ\u009b\u001c5ÿë6vQ\"6ÌP\u009dî\u0096Õãâ\u0015'".length();
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
d = new Integer[3];
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
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16826;
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
throw new RuntimeException("su/catlean/f", var14);
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
throw new RuntimeException("su/catlean/f" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
