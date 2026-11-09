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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class y9 {
@NotNull
public static final in o;
@Nullable
private final f0 W;
@Nullable
private final Integer L;
@Nullable
private final String v;
private static final long a = yz.a(-1644088560341167889L, 9162345201365215097L, MethodHandles.lookup().lookupClass()).a(167707067820255L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public y9(@Nullable f0 user, @Nullable Integer code, @Nullable String message) {
this.W = user;
this.L = code;
this.v = message;
}

@Nullable
public final f0 X() {
return this.W;
}

@Nullable
public final Integer A() {
return this.L;
}

@Nullable
public final String F() {
return this.v;
}

@Nullable
public final f0 T() {
return this.W;
}

@Nullable
public final Integer M() {
return this.L;
}

@Nullable
public final String n() {
return this.v;
}

@NotNull
public final y9 s(@Nullable f0 user, @Nullable Integer code, @Nullable String message) {
return new y9(user, code, message);
}

public static y9 l(y9 var0, f0 var1, Integer var2, String var3, int var4, long var5, Object var7) {
var5 = a ^ var5;
String[] var8 = vm.a<"Å">(-1475106933581659743L, var5);

int var10000;
label41: {
label40: {
try {
var10000 = var4 & 1;
if (var8 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -1457769892238306028L, var5);
}

var1 = var0.W;
}

var10000 = var4 & 2;
}

label32: {
label31: {
try {
if (var8 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -1457769892238306028L, var5);
}

var2 = var0.L;
}

var10000 = var4 & 4;
}

if (var10000 != 0) {
var3 = var0.v;
}

return var0.s(var1, var2, var3);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 78375205419075L;
String var3 = this.v;
Integer var4 = this.L;
f0 var5 = this.W;
return a<"z">(31728, 6983787939269257977L ^ var1)
+ var5
+ a<"z">(19390, 1975495048143280822L ^ var1)
+ var4
+ a<"z">(28452, 6131090840536104494L ^ var1)
+ var3
+ ")";
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
// 00: getstatic su/catlean/y9.a J
// 03: ldc2_w 68496315975827
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 5248986676039639806
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 3
// 12: aload 0
// 13: getfield su/catlean/y9.W Lsu/catlean/f0;
// 16: aload 3
// 17: ifnonnull 3c
// 1a: ifnonnull 38
// 1d: goto 2a
// 20: ldc2_w 5231931096813270603
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 0
// 2b: goto 3f
// 2e: ldc2_w 5231931096813270603
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: getfield su/catlean/y9.W Lsu/catlean/f0;
// 3c: invokevirtual su/catlean/f0.hashCode ()I
// 3f: istore 4
// 41: iload 4
// 43: sipush 6710
// 46: ldc2_w 5704557827860313207
// 49: lload 1
// 4a: lxor
// 4b: invokedynamic u (IJ)I bsm=su/catlean/y9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: imul
// 51: aload 0
// 52: getfield su/catlean/y9.L Ljava/lang/Integer;
// 55: aload 3
// 56: ifnonnull 7b
// 59: ifnonnull 77
// 5c: goto 69
// 5f: ldc2_w 5231931096813270603
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: bipush 0
// 6a: goto 7e
// 6d: ldc2_w 5231931096813270603
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: aload 0
// 78: getfield su/catlean/y9.L Ljava/lang/Integer;
// 7b: invokevirtual java/lang/Object.hashCode ()I
// 7e: iadd
// 7f: istore 4
// 81: iload 4
// 83: sipush 5632
// 86: ldc2_w 4724902190420310082
// 89: lload 1
// 8a: lxor
// 8b: invokedynamic u (IJ)I bsm=su/catlean/y9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: imul
// 91: aload 0
// 92: getfield su/catlean/y9.v Ljava/lang/String;
// 95: aload 3
// 96: ifnonnull bb
// 99: ifnonnull b7
// 9c: goto a9
// 9f: ldc2_w 5231931096813270603
// a2: lload 1
// a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8: athrow
// a9: bipush 0
// aa: goto be
// ad: ldc2_w 5231931096813270603
// b0: lload 1
// b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: athrow
// b7: aload 0
// b8: getfield su/catlean/y9.v Ljava/lang/String;
// bb: invokevirtual java/lang/String.hashCode ()I
// be: iadd
// bf: istore 4
// c1: iload 4
// c3: ireturn
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
// 00: getstatic su/catlean/y9.a J
// 03: ldc2_w 81209127212465
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6195354421575221212
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 6177243289627192169
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 6177243289627192169
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/y9
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 6177243289627192169
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 6177243289627192169
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/y9
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/y9.W Lsu/catlean/f0;
// 65: aload 5
// 67: getfield su/catlean/y9.W Lsu/catlean/f0;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 6177243289627192169
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 6177243289627192169
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/y9.L Ljava/lang/Integer;
// 92: aload 5
// 94: getfield su/catlean/y9.L Ljava/lang/Integer;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnonnull c7
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 6177243289627192169
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 6177243289627192169
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/y9.v Ljava/lang/String;
// bf: aload 5
// c1: getfield su/catlean/y9.v Ljava/lang/String;
// c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c7: aload 4
// c9: ifnonnull e9
// cc: ifne e8
// cf: goto dc
// d2: ldc2_w 6177243289627192169
// d5: lload 2
// d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db: athrow
// dc: bipush 0
// dd: ireturn
// de: ldc2_w 6177243289627192169
// e1: lload 2
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: ireturn
}

@JvmStatic
public static final void j(y9 self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeNullableSerializableElement(serialDesc, 0, fn.k, self.W);
output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.L);
output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.v);
}

public y9(int seen0, f0 user, Integer code, String message, SerializationConstructorMarker serializationConstructorMarker, long a) {
ax = a ^ ax;
if (b<"u">(18185, 2473084589384656874L ^ ax) != (b<"u">(18536, 1769942294240127112L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"u">(18536, 1769942294240127112L ^ ax), zb.K.getDescriptor());
}

super();
this.W = user;
this.L = code;
this.v = message;
}

static {
long var11 = a ^ 86866305790322L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[3];
int var18 = 0;
String var17 = "o\u000f=\u008dÐÛÏãòúê¹7GÎ\u000f(]\u0083Ók\u0097Ç'\u0088\u0006ìDo1o\ne\u0003Ù¯\u009c\u0082\u0019)XÈ6|[\u009bY\u0099Äôë3É\u0084áÝS\u0018Pr*c\u009dU©YJñ\u008fââ\tL ÛitÌpdð\u0015";
int var19 = "o\u000f=\u008dÐÛÏãòúê¹7GÎ\u000f(]\u0083Ók\u0097Ç'\u0088\u0006ìDo1o\ne\u0003Ù¯\u009c\u0082\u0019)XÈ6|[\u009bY\u0099Äôë3É\u0084áÝS\u0018Pr*c\u009dU©YJñ\u008fââ\tL ÛitÌpdð\u0015"
.length();
char var16 = 16;
int var15 = -1;

while (true) {
byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
String var30 = a(var21).intern();
int var10001 = -1;
var20[var18++] = var30;
if ((var15 += var16) >= var19) {
b = var20;
c = new String[3];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "M©_\u0019¼Ð\u008fß\u0095\u001bC®×>Ml";
int var5 = "M©_\u0019¼Ð\u008fß\u0095\u001bC®×>Ml".length();
byte var2 = 0;

label32:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var25 = var6;
var10001 = var3++;
long var33 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var36 = -1;

while (true) {
long var8 = var33;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var38 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var36) {
case 0:
var25[var10001] = var38;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
o = new in(null);
return;
}
break;
default:
var25[var10001] = var38;
if (var2 < var5) {
continue label32;
}

var4 = "ÚÌ}\u0018óïÞ3õ^MÚÏtkE";
var5 = "ÚÌ}\u0018óïÞ3õ^MÚÏtkE".length();
var2 = 0;
}

byte var29 = var2;
var2 += 8;
var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
var25 = var6;
var10001 = var3++;
var33 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var36 = 0;
}
}
}

var16 = var17.charAt(var15);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10350;
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
throw new RuntimeException("su/catlean/y9", var10);
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
throw new RuntimeException("su/catlean/y9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26615;
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
throw new RuntimeException("su/catlean/y9", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/y9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
