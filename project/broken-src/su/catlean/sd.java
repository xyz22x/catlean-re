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
public final class sd {
@NotNull
public static final z4 Z;
@NotNull
private final String O;
@NotNull
private final List L;
@JvmField
@NotNull
private static final Lazy[] A;
private static boolean t;
private static final long a = yz.a(-948373274984763685L, -1126620234001459598L, MethodHandles.lookup().lookupClass()).a(83186511652295L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public sd(@NotNull String id, long a, @NotNull List settings) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(id, a<"t">(26327, 3935563371275789174L ^ ax));
Intrinsics.checkNotNullParameter(settings, a<"t">(4433, 3540181456421147889L ^ ax));
super();
this.O = id;
this.L = settings;
}

@NotNull
public final String y() {
return this.O;
}

@NotNull
public final List p() {
return this.L;
}

@NotNull
public final String h() {
return this.O;
}

@NotNull
public final List N() {
return this.L;
}

@NotNull
public final sd f(@NotNull String id, long a, @NotNull List settings) {
ax = a ^ ax;
long var5 = ax ^ 91639125927243L;
Intrinsics.checkNotNullParameter(id, a<"t">(25662, 1213334265948566577L ^ ax));
Intrinsics.checkNotNullParameter(settings, a<"t">(1667, 7158130512619247245L ^ ax));
return new sd(id, var5, settings);
}

public static sd n(sd var0, String var1, List var2, int var3, long var4, Object var6) {
var4 = a ^ var4;
long var7 = var4 ^ 137029356113446L;
_g[] var9 = vm.a<"Å">(7318114834929492807L, var4);

int var10000;
label25: {
label24: {
try {
var10000 = var3 & 1;
if (var9 == null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 7297858333001591514L, var4);
}

var1 = var0.O;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.L;
}

return var0.f(var1, var7, var2);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 32240034947064L;
String var10000 = this.O;
List var10001 = this.L;
return a<"t">(8046, 3289448959481690688L ^ var1) + var10000 + a<"t">(2397, 448367966220692594L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 4626261939204L;
int var3 = this.O.hashCode();
return var3 * (int)e + this.L.hashCode();
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
// 00: getstatic su/catlean/sd.a J
// 03: ldc2_w 135254027815987
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -170195553542685845
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -185982546080779530
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -185982546080779530
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/sd
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -185982546080779530
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -185982546080779530
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/sd
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/sd.O Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/sd.O Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -185982546080779530
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -185982546080779530
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/sd.L Ljava/util/List;
// 92: aload 5
// 94: getfield su/catlean/sd.L Ljava/util/List;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -185982546080779530
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -185982546080779530
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void p(sd self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = A;
output.encodeStringElement(serialDesc, 0, self.O);
output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy<? super List>)var3[1].getValue(), self.L);
}

public sd(int seen0, String id, List settings, SerializationConstructorMarker serializationConstructorMarker, long a) {
ax = a ^ ax;
if (3 != (3 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 3, j8.C.getDescriptor());
}

super();
this.O = id;
this.L = settings;
}

private static final KSerializer m() {
return new ArrayListSerializer(pm.O);
}

public static final Lazy[] T() {
return A;
}

static {
long var14 = a ^ 27302823185620L;
vm.a<"Å">(false, 9024855847743193953L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[6];
int var10 = 0;
String var9 = "ã½+\u0007sTq±\u0085OÜÀ4\f\u0017Ó±\u00ad\u0017\u008aÁ[´\u0081\u0012\u0013iàß\u0007C#\u0010\u0080TZÄ3'´®\u0017q\u009bâZ\f¬\u009d eÉÑ\bÚ×@mUñ½ø\u008e:Eº\rÿ°H }\u000bÐ\u0089ÊQ¢\b\u0013æº\u0010ÖÜ\u0089AÊ\u0000[¾ÿx\u0084ÒyÑ\u008bÊ";
int var11 = "ã½+\u0007sTq±\u0085OÜÀ4\f\u0017Ó±\u00ad\u0017\u008aÁ[´\u0081\u0012\u0013iàß\u0007C#\u0010\u0080TZÄ3'´®\u0017q\u009bâZ\f¬\u009d eÉÑ\bÚ×@mUñ½ø\u008e:Eº\rÿ°H }\u000bÐ\u0089ÊQ¢\b\u0013æº\u0010ÖÜ\u0089AÊ\u0000[¾ÿx\u0084ÒyÑ\u008bÊ"
.length();
char var8 = ' ';
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
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -1861156234916813047L;
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
e = var31;
Z = new z4(null);
Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, sd::m)};
A = var16;
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

var9 = "©a~.[B\u0089-Dð\u0019Ï\u0081\u0099¼¹\u0088á\u0096~%i\u0094Fú¦ñ\u0095Ã^¥\u0001\u0018í\bç¾Ù=\u0000èoòå¸à¸8w\u009fq¨s\u0001Ü¡,";
var11 = "©a~.[B\u0089-Dð\u0019Ï\u0081\u0099¼¹\u0088á\u0096~%i\u0094Fú¦ñ\u0095Ã^¥\u0001\u0018í\bç¾Ù=\u0000èoòå¸à¸8w\u009fq¨s\u0001Ü¡,".length();
var8 = ' ';
var18 = -1;
}

var19 = var9.substring(++var18, var18 + var8);
var10001 = 0;
}
}
}

public static void l(boolean var0) {
t = var0;
}

public static boolean i() {
return t;
}

public static boolean x() {
boolean var0 = i();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2613;
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
throw new RuntimeException("su/catlean/sd", var10);
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
throw new RuntimeException("su/catlean/sd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
