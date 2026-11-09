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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class ip {
@NotNull
public static final e u;
@NotNull
private final List b;
@JvmField
@NotNull
private static final Lazy[] U;
private static final long a = yz.a(529438658226126684L, -7499037509600963616L, MethodHandles.lookup().lookupClass()).a(262750791792157L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

public ip(long a, @NotNull List players) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(players, a<"h">(25766, 5897612146831382036L ^ ax));
super();
this.b = players;
}

@NotNull
public final List o() {
return this.b;
}

@NotNull
public final List h() {
return this.b;
}

@NotNull
public final ip K(char a, @NotNull List players, long a) {
long var5 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
long var7 = var5 ^ 58804615262368L;
Intrinsics.checkNotNullParameter(players, a<"h">(10498, 343409215856708230L ^ var5));
return new ip(var7, players);
}

public static ip P(ip var0, short var1, List var2, int var3, short var4, Object var5, int var6) {
long var7 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
int var9 = (int)((var7 ^ 15062162319528L) >>> 48);
long var10 = (var7 ^ 15062162319528L) << 16 >>> 16;
if ((var3 & 1) != 0) {
var2 = var0.b;
}

return var0.K((char)var9, var2, var10);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 31767118431327L;
List var10000 = this.b;
return a<"h">(19031, 4144336726445777753L ^ var1) + var10000 + ")";
}

@Override
public int hashCode() {
return this.b.hashCode();
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
// 00: getstatic su/catlean/ip.a J
// 03: ldc2_w 60162745433835
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6811666791029284937
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 6781778234451977064
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 6781778234451977064
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/ip
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 6781778234451977064
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 6781778234451977064
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/ip
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/ip.b Ljava/util/List;
// 65: aload 5
// 67: getfield su/catlean/ip.b Ljava/util/List;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 8f
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 6781778234451977064
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 6781778234451977064
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: ireturn
}

@JvmStatic
public static final void S(ip self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = U;
output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy<? super List>)var3[0].getValue(), self.b);
}

public ip(int seen0, long a, List players, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (1 != (1 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 1, zc.y.getDescriptor());
}

super();
this.b = players;
}

private static final KSerializer y() {
return new ArrayListSerializer<>(StringSerializer.INSTANCE);
}

public static final Lazy[] i() {
return U;
}

static {
long var0 = a ^ 115362654863634L;
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
String var6 = "\u0018i\u0092.\u001fô·½«\u0015\u0083\u0018¨\u001f\"h0\u008b\u0086T®\bÕ \b1R\u00190\u009b@\u0081\u0091V*=´=vkêüvP\u009b\"n\u00adÖ\u0087Á\u000e2\u0092nÃ¶\u0003¶¿¥\u001f&\u008a\"\u0010ÂÑ`\u001f`d¥Êf%\u0011æ²ù'\u0014";
int var8 = "\u0018i\u0092.\u001fô·½«\u0015\u0083\u0018¨\u001f\"h0\u008b\u0086T®\bÕ \b1R\u00190\u009b@\u0081\u0091V*=´=vkêüvP\u009b\"n\u00adÖ\u0087Á\u000e2\u0092nÃ¶\u0003¶¿¥\u001f&\u008a\"\u0010ÂÑ`\u001f`d¥Êf%\u0011æ²ù'\u0014"
.length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var14 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var14;
if ((var4 += var5) >= var8) {
c = var9;
d = new String[3];
u = new e(null);
Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ip::y)};
U = var11;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19652;
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
throw new RuntimeException("su/catlean/ip", var10);
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
throw new RuntimeException("su/catlean/ip" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
