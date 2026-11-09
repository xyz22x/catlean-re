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
public final class js {
@NotNull
public static final ng S;
@NotNull
private final List p;
@JvmField
@NotNull
private static final Lazy[] m;
private static final long a = yz.a(3437041384660267994L, -7646689094990467597L, MethodHandles.lookup().lookupClass()).a(35891514876969L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public js(long a, @NotNull List wayPoints) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(wayPoints, a<"z">(2527, 3361557256011339728L ^ ax));
super();
this.p = wayPoints;
}

@NotNull
public final List Q() {
return this.p;
}

@NotNull
public final List X() {
return this.p;
}

@NotNull
public final js Z(long a, @NotNull List wayPoints) {
ax = a ^ ax;
long var4 = ax ^ 52572524974133L;
Intrinsics.checkNotNullParameter(wayPoints, a<"z">(31704, 6598428183387456352L ^ ax));
return new js(var4, wayPoints);
}

public static js N(js var0, List var1, int var2, long var3, Object var5) {
var3 = a ^ var3;
long var6 = var3 ^ 14668062072211L;
if ((var2 & 1) != 0) {
var1 = var0.p;
}

return var0.Z(var6, var1);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 107146886795218L;
List var10000 = this.p;
return a<"z">(22584, 8045071463239385291L ^ var1) + var10000 + ")";
}

@Override
public int hashCode() {
return this.p.hashCode();
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
// 00: getstatic su/catlean/js.a J
// 03: ldc2_w 81762392366198
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 3134535617225321800
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 3152008718322087489
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 3152008718322087489
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/js
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 3152008718322087489
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 3152008718322087489
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/js
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/js.p Ljava/util/List;
// 65: aload 5
// 67: getfield su/catlean/js.p Ljava/util/List;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 8f
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 3152008718322087489
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 3152008718322087489
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: ireturn
}

@JvmStatic
public static final void z(js self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = m;
output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy<? super List>)var3[0].getValue(), self.p);
}

public js(int seen0, List wayPoints, SerializationConstructorMarker serializationConstructorMarker, long a) {
ax = a ^ ax;
if (1 != (1 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 1, xd.w.getDescriptor());
}

super();
this.p = wayPoints;
}

private static final KSerializer d() {
return new ArrayListSerializer(lm.v);
}

public static final Lazy[] E() {
return m;
}

static {
long var0 = a ^ 106215058751528L;
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
String var6 = "\u0089}û\u0097ÖUjÕ\u0093¾·cm¦\u00890`¬ãg¯È$miª_>\u009b\u0014±¼Ã^\u0002$§@\u0087\u0096\u009a4k5Ì\u009bEÞzi\u0005éw\u000fÄ) >±XY<3\u0002\u001axmh§a\u0017\u0016\u0090sÀ@\u0007\u0095>\u009c-©\u000eB\u0018N¸\u009c)\u0018w\\Æ\bË\u0084G²[Ýâ\u001fá\u0080pQCª\u008eiÃn³Ä";
int var8 = "\u0089}û\u0097ÖUjÕ\u0093¾·cm¦\u00890`¬ãg¯È$miª_>\u009b\u0014±¼Ã^\u0002$§@\u0087\u0096\u009a4k5Ì\u009bEÞzi\u0005éw\u000fÄ) >±XY<3\u0002\u001axmh§a\u0017\u0016\u0090sÀ@\u0007\u0095>\u009c-©\u000eB\u0018N¸\u009c)\u0018w\\Æ\bË\u0084G²[Ýâ\u001fá\u0080pQCª\u008eiÃn³Ä"
.length();
char var5 = '8';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var14 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var14;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[3];
S = new ng(null);
Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, js::d)};
m = var11;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24992;
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
throw new RuntimeException("su/catlean/js", var10);
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
throw new RuntimeException("su/catlean/js" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
