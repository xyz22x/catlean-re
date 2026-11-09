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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class pa {
@NotNull
public static final l4 t;
private final long L;
@Nullable
private final Long N;
private static final long a = yz.a(-5928698929605315017L, -7512739480564883346L, MethodHandles.lookup().lookupClass()).a(75149538775398L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public pa(long start, @Nullable Long end) {
this.L = start;
this.N = end;
}

public pa(short var1, int var2, long var3, char var5, Long var6, int var7, DefaultConstructorMarker var8) {
long var9 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
if ((var7 & 2) != 0) {
var6 = null;
}

this(var3, var6);
}

public final long M() {
return this.L;
}

@Nullable
public final Long e() {
return this.N;
}

public final long B() {
return this.L;
}

@Nullable
public final Long i() {
return this.N;
}

@NotNull
public final pa W(long start, @Nullable Long end) {
return new pa(start, end);
}

public static pa G(pa var0, long var1, long var3, Long var5, int var6, Object var7) {
var3 = a ^ var3;
_g[] var8 = vm.a<"Å">(3361732830364849267L, var3);

int var10000;
label25: {
label24: {
try {
var10000 = var6 & 1;
if (var8 == null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 3402013519954315308L, var3);
}

var1 = var0.L;
}

var10000 = var6 & 2;
}

if (var10000 != 0) {
var5 = var0.N;
}

return var0.W(var1, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 69976499656371L;
Long var3 = this.N;
long var4 = this.L;
return a<"q">(12327, 8461471617016255256L ^ var1) + var4 + a<"q">(2127, 7911224417043573617L ^ var1) + var3 + ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pa.a J
// 03: ldc2_w 51825561848752
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -4569614700411110847
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: getfield su/catlean/pa.L J
// 15: invokestatic java/lang/Long.hashCode (J)I
// 18: istore 4
// 1a: astore 3
// 1b: iload 4
// 1d: getstatic su/catlean/pa.e J
// 20: l2i
// 21: imul
// 22: aload 0
// 23: getfield su/catlean/pa.N Ljava/lang/Long;
// 26: aload 3
// 27: ifnull 4c
// 2a: ifnonnull 48
// 2d: goto 3a
// 30: ldc2_w -4538413656445426146
// 33: lload 1
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: bipush 0
// 3b: goto 4f
// 3e: ldc2_w -4538413656445426146
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 0
// 49: getfield su/catlean/pa.N Ljava/lang/Long;
// 4c: invokevirtual java/lang/Object.hashCode ()I
// 4f: iadd
// 50: istore 4
// 52: iload 4
// 54: ireturn
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
// 00: getstatic su/catlean/pa.a J
// 03: ldc2_w 131877998432901
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -7376843998718860428
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -7480188707396534485
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -7480188707396534485
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/pa
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -7480188707396534485
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -7480188707396534485
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/pa
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/pa.L J
// 65: aload 5
// 67: getfield su/catlean/pa.L J
// 6a: lcmp
// 6b: aload 4
// 6d: ifnull 98
// 70: ifeq 8c
// 73: goto 80
// 76: ldc2_w -7480188707396534485
// 79: lload 2
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: bipush 0
// 81: ireturn
// 82: ldc2_w -7480188707396534485
// 85: lload 2
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: aload 0
// 8d: getfield su/catlean/pa.N Ljava/lang/Long;
// 90: aload 5
// 92: getfield su/catlean/pa.N Ljava/lang/Long;
// 95: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 98: aload 4
// 9a: ifnull ba
// 9d: ifne b9
// a0: goto ad
// a3: ldc2_w -7480188707396534485
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: bipush 0
// ae: ireturn
// af: ldc2_w -7480188707396534485
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: bipush 1
// ba: ireturn
}

@JvmStatic
public static final void Z(long a, pa self, CompositeEncoder output, SerialDescriptor serialDesc, byte a) {
long var6 = (ax << 8 | (long)axx << 56 >>> 56) ^ a;
_g[] var10000 = vm.a<"Å">(-2085309356539864613L, var6);
output.encodeLongElement(serialDesc, 0, self.L);
_g[] var8 = var10000;

label40: {
label44: {
try {
var12 = output.shouldEncodeElementDefault(serialDesc, 1);
if (var8 == null) {
break label40;
}

if (var12) {
break label44;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -2117156611410967164L, var6);
}

try {
if (self.N != null) {
var12 = true;
break label40;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -2117156611410967164L, var6);
}

var12 = false;
break label40;
}

var12 = true;
}

try {
if (var12) {
output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.N);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -2117156611410967164L, var6);
}
}

public pa(long a, short a, int seen0, long start, Long end, SerializationConstructorMarker serializationConstructorMarker) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 16
// 03: lshl
// 04: iload 3
// 05: i2l
// 06: bipush 48
// 08: lshl
// 09: bipush 48
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/pa.a J
// 10: lxor
// 11: lstore 9
// 13: ldc2_w -2449271169766939434
// 16: lload 9
// 18: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: astore 11
// 1f: bipush 1
// 20: bipush 1
// 21: iload 4
// 23: iand
// 24: if_icmpeq 33
// 27: iload 4
// 29: bipush 1
// 2a: getstatic su/catlean/we.i Lsu/catlean/we;
// 2d: invokevirtual su/catlean/we.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 30: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 33: aload 0
// 34: invokespecial java/lang/Object.<init> ()V
// 37: lload 1
// 38: lconst_0
// 39: lcmp
// 3a: ifle 48
// 3d: aload 0
// 3e: aload 11
// 40: ifnull 7a
// 43: lload 5
// 45: putfield su/catlean/pa.L J
// 48: iload 3
// 49: ifle 58
// 4c: iload 4
// 4e: bipush 2
// 4f: iand
// 50: ifne 6b
// 53: aload 0
// 54: aconst_null
// 55: putfield su/catlean/pa.N Ljava/lang/Long;
// 58: aload 11
// 5a: ifnonnull 7f
// 5d: goto 6b
// 60: ldc2_w -2336427376013870967
// 63: lload 9
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 0
// 6c: goto 7a
// 6f: ldc2_w -2336427376013870967
// 72: lload 9
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: aload 7
// 7c: putfield su/catlean/pa.N Ljava/lang/Long;
// 7f: return
}

static {
long var5 = a ^ 63071312307535L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[2];
int var12 = 0;
String var11 = "3}Ö¡K+Í@½ðóW¨\u0014¡\u001c8»»\u0081Æ\r¡\u0087\u00072\b\u0010\u0010\rC\u00029}ry\u00ad\u001cõ\u0006Ó8\u0084\u0091\u0000b9Mpi ¡\b\u0088o¿\u001fm\u008e6\u0083«\u0017¢Ò\u009bUE[=a\u0082m";
int var13 = "3}Ö¡K+Í@½ðóW¨\u0014¡\u001c8»»\u0081Æ\r¡\u0087\u00072\b\u0010\u0010\rC\u00029}ry\u00ad\u001cõ\u0006Ó8\u0084\u0091\u0000b9Mpi ¡\b\u0088o¿\u001fm\u008e6\u0083«\u0017¢Ò\u009bUE[=a\u0082m"
.length();
char var10 = 16;
int var9 = -1;

while (true) {
byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
String var20 = a(var15).intern();
byte var10001 = -1;
var14[var12++] = var20;
if ((var9 += var10) >= var13) {
b = var14;
c = new String[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -6769937111697657390L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var23;
t = new l4(null);
return;
}

var10 = var11.charAt(var9);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32711;
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
throw new RuntimeException("su/catlean/pa", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/pa" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
