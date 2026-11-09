package su.catlean;

import java.io.RandomAccessFile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class nx extends n9 {
@NotNull
private final RandomAccessFile C;
private static boolean U;
private static final long b = yz.a(-7187884488579481971L, 3040166209400938466L, MethodHandles.lookup().lookupClass()).a(55644735014189L);
private static final String[] e;
private static final String[] f;
private static final Map h = new HashMap(13);
private static final long i;
private static final long j;

public nx(@NotNull String name, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nx.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -3107741035398902404
// 09: lload 2
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: sipush 15635
// 13: ldc2_w 5247986869126069199
// 16: lload 2
// 17: lxor
// 18: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/nx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: aload 0
// 21: invokespecial su/catlean/n9.<init> ()V
// 24: aload 0
// 25: new java/io/RandomAccessFile
// 28: dup
// 29: aload 1
// 2a: sipush 19115
// 2d: ldc2_w 2692436760031169649
// 30: lload 2
// 31: lxor
// 32: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/nx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: invokespecial java/io/RandomAccessFile.<init> (Ljava/lang/String;Ljava/lang/String;)V
// 3a: putfield su/catlean/nx.C Ljava/io/RandomAccessFile;
// 3d: nop
// 3e: bipush 1
// 3f: bipush 0
// 40: aconst_null
// 41: sipush 11608
// 44: ldc2_w 2628027166604028803
// 47: lload 2
// 48: lxor
// 49: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/nx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: bipush 0
// 4f: aload 0
// 50: invokedynamic invoke (Lsu/catlean/nx;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/nx.Z (Lsu/catlean/nx;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 55: getstatic su/catlean/nx.i J
// 58: l2i
// 59: aconst_null
// 5a: invokestatic kotlin/concurrent/ThreadsKt.thread$default (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
// 5d: pop
// 5e: istore 4
// 60: nop
// 61: ldc2_w -3123044426430363079
// 64: lload 2
// 65: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: ifnull 97
// 6d: iload 4
// 6f: ifeq 8d
// 72: goto 7f
// 75: ldc2_w -3102282810875403057
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: goto 8e
// 83: ldc2_w -3102282810875403057
// 86: lload 2
// 87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: athrow
// 8d: bipush 1
// 8e: ldc2_w -3167778379706527873
// 91: lload 2
// 92: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: return
}

@Override
protected void P(long a, @NotNull ByteBuffer buffer) {
long var4 = a ^ 32913269016412L;
Intrinsics.checkNotNullParameter(buffer, b<"z">(18056, 8508583626045712159L ^ a));
nx var6 = this;

Object var7;
try {
var7 = var6;
boolean var8 = false;
((nx)var7).C.write(buffer.array());
var7 = Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var10) {
var7 = Result.constructor-impl(ResultKt.createFailure(var10));
}

if (Result.exceptionOrNull-impl(var7) != null) {
boolean var9 = false;
os.D.s(var4);
}
}

private final void O(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var10001 = var4 ^ 48716813202493L;
int var6 = (int)((var4 ^ 48716813202493L) >>> 32);
int var7 = (int)((var4 ^ 48716813202493L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
var10001 = var4 ^ 23152190378942L;
int var9 = (int)((var4 ^ 23152190378942L) >>> 32);
int var10 = (int)((var4 ^ 23152190378942L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);
long var12 = var4 ^ 41546153582601L;
ByteBuffer var14 = ByteBuffer.allocate(4);

while (true) {
Intrinsics.checkNotNull(var14);
this.c(var6, var7, (char)var8, var14);
b2 var15 = (b2)b2.w().get(Integer.reverseBytes(var14.getInt(0)));
this.c(var6, var7, (char)var8, var14);
int var16 = Integer.reverseBytes(var14.getInt(0));
ByteBuffer var17 = ByteBuffer.allocate(var16);
Intrinsics.checkNotNull(var17);
this.c(var6, var7, (char)var8, var17);
String var10000 = Charset.defaultCharset().decode(var17.rewind()).toString();
Intrinsics.checkNotNullExpressionValue(var10000, b<"z">(26363, 2066184200361286709L ^ var4));
String var18 = var10000;
os var22 = os.D;
short var10004 = (short)var10;
char var10005 = (char)var11;
Json var19 = op.d();
boolean var21 = false;
var19.getSerializersModule();
var22.M(var12, new gk(var9, var10004, var10005, var15, var19.decodeFromString(f4.i.v(), var18)));
}
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void c(int var1, int var2, char var3, ByteBuffer var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
boolean var10000 = vm.a<"Å">(6942685841496046074L, var5);
var4.rewind();
boolean var7 = var10000;

label41:
while (this.C.length() < var4.remaining()) {
try {
Thread.onSpinWait();
Thread.sleep(j);
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 6950233155343028297L, var5);
}

do {
try {
var10000 = var7;
if (var2 >= 0) {
if (!var7) {
return;
}

var10000 = var7;
}

if (var10000) {
continue label41;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 6950233155343028297L, var5);
}
} while (var2 < 0);
break;
}

while (var4.hasRemaining()) {
this.C.getChannel().read(var4);
if (!var7) {
return;
}
}
}

@Override
public void Q() {
nx var1 = this;

try {
nx var5 = var1;
boolean var3 = false;
var5.C.close();
var5 = (nx)Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var4) {
Object var2 = Result.constructor-impl(ResultKt.createFailure(var4));
}
}

private static final Unit Z(nx var0) {
long var1 = b ^ 60512930488303L;
long var10001 = var1 ^ 8127097681409L;
int var3 = (int)((var1 ^ 8127097681409L) >>> 48);
int var4 = (int)((var1 ^ 8127097681409L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
var0.O((short)var3, (short)var4, var5);
return Unit.INSTANCE;
}

public static void i(boolean var0) {
U = var0;
}

public static boolean l() {
return U;
}

public static boolean i() {
boolean var0 = l();

try {
return !var0;
} catch (NumberFormatException var1) {
throw b(var1);
}
}

static {
long var19 = b ^ 54702639518118L;
vm.a<"Å">(false, 7852779907880499084L, var19);
Cipher var10;
Cipher var10000 = var10 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var19 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var11 = 1; var11 < 8; var11++) {
var10003[var11] = (byte)(var19 << var11 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var17 = new String[5];
int var15 = 0;
String var14 = "*NX¼\u0005\r\\/ü\u008f\u001arÊá\u008eG .EàïmÉ°TrräÏÞ\u0097PEÉ_ADÛG I\\¤¥Ûõ*%/\u0010\u001a'\u008eI'å¥¨t¢Nýí\u009f\u0091¯";
int var16 = "*NX¼\u0005\r\\/ü\u008f\u001arÊá\u008eG .EàïmÉ°TrräÏÞ\u0097PEÉ_ADÛG I\\¤¥Ûõ*%/\u0010\u001a'\u008eI'å¥¨t¢Nýí\u009f\u0091¯".length();
char var13 = 16;
int var22 = -1;

label49:
while (true) {
String var23 = var14.substring(++var22, var22 + var13);
byte var10001 = -1;

while (true) {
byte[] var18 = var10.doFinal(var23.getBytes("ISO-8859-1"));
String var33 = b(var18).intern();
switch (var10001) {
case 0:
var17[var15++] = var33;
if ((var22 += var13) >= var16) {
e = var17;
f = new String[5];
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var19 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var19 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var7 = -2758560141383718893L;
byte[] var9 = var5.doFinal(
new byte[]{
(byte)(var7 >>> 56), (byte)(var7 >>> 48), (byte)(var7 >>> 40), (byte)(var7 >>> 32), (byte)(var7 >>> 24), (byte)(var7 >>> 16), (byte)(var7 >>> 8), (byte)var7
}
);
long var37 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
var10001 = -1;
i = var37;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var19 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var19 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 6743425642987955896L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var39 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
j = var39;
return;
}

var13 = var14.charAt(var22);
break;
default:
var17[var15++] = var33;
if ((var22 += var13) < var16) {
var13 = var14.charAt(var22);
continue label49;
}

var14 = "ât\u0093á\u0001Y\u0083Ã=wÁK\u0017h8]F ÚÕéÕ¦\u0001\u0089Û%6\bS\u008eë\u0089\u0006ýµY`<$.Gÿ±Q_O)\u0010RUYÃ·\u008fü\u0088Ý\u0010\u0082î\u009e\u0095è¨";
var16 = "ât\u0093á\u0001Y\u0083Ã=wÁK\u0017h8]F ÚÕéÕ¦\u0001\u0089Û%6\bS\u008eë\u0089\u0006ýµY`<$.Gÿ±Q_O)\u0010RUYÃ·\u008fü\u0088Ý\u0010\u0082î\u009e\u0095è¨"
.length();
var13 = '0';
var22 = -1;
}

var23 = var14.substring(++var22, var22 + var13);
var10001 = 0;
}
}
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4897;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/nx", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/nx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
