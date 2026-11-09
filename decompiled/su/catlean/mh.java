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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class mh {
@NotNull
public static final dq F;
@NotNull
private String y;
@NotNull
private Map I;
@JvmField
@NotNull
private static final Lazy[] p;
private static String d;
private static final long a = yz.a(-1073044233864713857L, -8253338650984321951L, MethodHandles.lookup().lookupClass()).a(203440635290575L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long f;

public mh(@NotNull String id, @NotNull Map items, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(id, a<"r">(32596, 4910138427261377186L ^ ax));
Intrinsics.checkNotNullParameter(items, a<"r">(31571, 8640180292248854177L ^ ax));
super();
this.y = id;
this.I = items;
}

@NotNull
public final String R() {
return this.y;
}

public final void M(long a, @NotNull String <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"r">(1079, 1996886638644214105L ^ ax));
this.y = <set-?>;
}

@NotNull
public final Map r() {
return this.I;
}

public final void Y(short a, int a, int a, @NotNull Map <set-?>) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"r">(5245, 2917053110754750054L ^ var5));
this.I = <set-?>;
}

@NotNull
public final String s() {
return this.y;
}

@NotNull
public final Map T() {
return this.I;
}

@NotNull
public final mh P(long a, @NotNull String id, @NotNull Map items) {
ax = a ^ ax;
long var5 = ax ^ 32410447645923L;
Intrinsics.checkNotNullParameter(id, a<"r">(11372, 4726942716619351876L ^ ax));
Intrinsics.checkNotNullParameter(items, a<"r">(23630, 4589923204294023013L ^ ax));
return new mh(id, items, var5);
}

public static mh r(mh var0, long var1, String var3, int var4, Map var5, int var6, Object var7) {
long var8 = (var1 << 32 | (long)var4 << 32 >>> 32) ^ a;
long var10 = var8 ^ 15206201251098L;
String var12 = vm.a<"Å">(-9040459091408113672L, var8);

int var10000;
label25: {
label24: {
try {
var10000 = var6 & 1;
if (var12 == null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -9022103126985364173L, var8);
}

var3 = var0.y;
}

var10000 = var6 & 2;
}

if (var10000 != 0) {
var5 = var0.I;
}

return var0.P(var10, var3, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 121371237941419L;
String var10000 = this.y;
Map var10001 = this.I;
return a<"r">(611, 7520118719827812150L ^ var1) + var10000 + a<"r">(17287, 1083680338348203731L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 58363076277834L;
int var3 = this.y.hashCode();
return var3 * (int)f + this.I.hashCode();
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
// 00: getstatic su/catlean/mh.a J
// 03: ldc2_w 110239186902600
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 4411224931926249542
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 4428457831091147405
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 4428457831091147405
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/mh
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 4428457831091147405
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 4428457831091147405
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/mh
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/mh.y Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/mh.y Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 4428457831091147405
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 4428457831091147405
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/mh.I Ljava/util/Map;
// 92: aload 5
// 94: getfield su/catlean/mh.I Ljava/util/Map;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 4428457831091147405
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 4428457831091147405
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void c(mh self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = p;
output.encodeStringElement(serialDesc, 0, self.y);
output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy<? super Map>)var3[1].getValue(), self.I);
}

public mh(long a, int seen0, String id, Map items, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (3 != (3 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 3, gl.C.getDescriptor());
}

super();
this.y = id;
this.I = items;
}

private static final KSerializer D() {
long var0 = a ^ 24244598011481L;
long var2 = var0 ^ 138785126326208L;
return new LinkedHashMapSerializer<>(IntSerializer.INSTANCE, new ls(var2));
}

public static final Lazy[] z() {
return p;
}

static {
long var14 = a ^ 122410228165598L;
vm.a<"Å">("tCVCw", -3986309724960917484L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[8];
int var10 = 0;
String var9 = "¸´æ¹àºÔ:ÈØG1bÉ= \u0010îq5Z×1}¼A \u0006ÛÕ¤l\u008a\u0010X»|Nà\u0010\u001fIÚbÿ\u0080\u00190P,\u0010å\u007f§0:U\u000b»\u0081hÞ-¤\u0089OÇ\u0010\u0000e¸Ñæ\u0003\u008fzBRïÔÛ\u0095GY\u0010ñ\u0098\u0090c\u0081$ÚÃù´ª×O\u0080\tW";
int var11 = "¸´æ¹àºÔ:ÈØG1bÉ= \u0010îq5Z×1}¼A \u0006ÛÕ¤l\u008a\u0010X»|Nà\u0010\u001fIÚbÿ\u0080\u00190P,\u0010å\u007f§0:U\u000b»\u0081hÞ-¤\u0089OÇ\u0010\u0000e¸Ñæ\u0003\u008fzBRïÔÛ\u0095GY\u0010ñ\u0098\u0090c\u0081$ÚÃù´ª×O\u0080\tW"
.length();
char var8 = 16;
int var18 = -1;

label37:
while (true) {
String var19 = var9.substring(++var18, var18 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
String var27 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var27;
if ((var18 += var8) >= var11) {
b = var12;
c = new String[8];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -501270713572842284L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var31 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var31;
F = new dq(null);
Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, mh::D)};
p = var16;
return;
}

var8 = var9.charAt(var18);
break;
default:
var12[var10++] = var27;
if ((var18 += var8) < var11) {
var8 = var9.charAt(var18);
continue label37;
}

var9 = "¶8/ÆàZ»G(\u0002Ý\u0003à{FÂÓ¼Ô5^^\u0006ÕXæA4D0\u008b^(S\u0001îHºü\u0090¿@rå\u001es%¤¯Ïbc¬Ò\u009f1}*y¤\u000eÍØ\u009eX'¡õ\u008agN*\u001c";
var11 = "¶8/ÆàZ»G(\u0002Ý\u0003à{FÂÓ¼Ô5^^\u0006ÕXæA4D0\u008b^(S\u0001îHºü\u0090¿@rå\u001es%¤¯Ïbc¬Ò\u009f1}*y¤\u000eÍØ\u009eX'¡õ\u008agN*\u001c".length();
var8 = ' ';
var18 = -1;
}

var19 = var9.substring(++var18, var18 + var8);
var10001 = 0;
}
}
}

public static void X(String var0) {
d = var0;
}

public static String S() {
return d;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32710;
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
throw new RuntimeException("su/catlean/mh", var10);
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
throw new RuntimeException("su/catlean/mh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
