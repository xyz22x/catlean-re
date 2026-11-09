package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class po {
@NotNull
public static final z2 Y;
@NotNull
private final List y;
@JvmField
@NotNull
private static final Lazy[] a;
private static final long b = yz.a(-6829102522648488175L, -5216747680212718762L, MethodHandles.lookup().lookupClass()).a(219569052430666L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

public po(@NotNull List proxies, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(proxies, a<"b">(5441, 7410342177351934493L ^ ax));
super();
this.y = proxies;
}

@NotNull
public final List e() {
return this.y;
}

@NotNull
public final List g() {
return this.y;
}

@NotNull
public final po I(@NotNull List proxies, long a) {
ax = b ^ ax;
long var4 = ax ^ 35096307892270L;
Intrinsics.checkNotNullParameter(proxies, a<"b">(14169, 2102805148903974170L ^ ax));
return new po(proxies, var4);
}

public static po z(po var0, List var1, long var2, int var4, Object var5) {
var2 = b ^ var2;
long var6 = var2 ^ 33255496924675L;
if ((var4 & 1) != 0) {
var1 = var0.y;
}

return var0.I(var1, var6);
}

@NotNull
@Override
public String toString() {
long var1 = b ^ 43142744244106L;
List var10000 = this.y;
return a<"b">(15445, 3935904623471329861L ^ var1) + var10000 + ")";
}

@Override
public int hashCode() {
return this.y.hashCode();
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
// 00: getstatic su/catlean/po.b J
// 03: ldc2_w 55014053240999
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -4259716488568733142
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -4286024292889794138
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -4286024292889794138
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/po
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -4286024292889794138
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -4286024292889794138
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/po
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/po.y Ljava/util/List;
// 65: aload 5
// 67: getfield su/catlean/po.y Ljava/util/List;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 8f
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -4286024292889794138
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -4286024292889794138
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: ireturn
}

@JvmStatic
public static final void l(po self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = a;
output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy<? super List>)var3[0].getValue(), self.y);
}

public po(long a, int seen0, List proxies, SerializationConstructorMarker serializationConstructorMarker) {
ax = b ^ ax;
if (1 != (1 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 1, _l.X.getDescriptor());
}

super();
this.y = proxies;
}

private static final KSerializer D() {
return new ArrayListSerializer(w9.f);
}

public static final Lazy[] i() {
return a;
}

static {
long var0 = b ^ 88202807837191L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[3];
int var7 = 0;
String var6 = "°ê|»uí¥cYc\u009d\u0093ky»&\u0002ËþL ïõµ¯\u0082\u0016K\u0096b\u008e\u0082ïc÷\u0016\r}\u008fÊ\u0010Ø)ìHÇyfÐZ\u0089@ß}^C%\u0018ÂÇ \r\u000e\u001e*0\u000bí½\u0095ïÐfªæÜxzµÍJ¾";
int var8 = "°ê|»uí¥cYc\u009d\u0093ky»&\u0002ËþL ïõµ¯\u0082\u0016K\u0096b\u008e\u0082ïc÷\u0016\r}\u008fÊ\u0010Ø)ìHÇyfÐZ\u0089@ß}^C%\u0018ÂÇ \r\u000e\u001e*0\u000bí½\u0095ïÐfªæÜxzµÍJ¾"
.length();
char var5 = '(';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var14 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var14;
if ((var4 += var5) >= var8) {
c = var9;
d = new String[3];
Y = new z2(null);
Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, po::D)};
a = var11;
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25768;
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
throw new RuntimeException("su/catlean/po", var10);
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
throw new RuntimeException("su/catlean/po" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
