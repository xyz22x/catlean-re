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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class sh {
@NotNull
public static final np N;
@NotNull
private final String f;
@NotNull
private final String d;
private static int k;
private static final long a = yz.a(2521332337147926580L, 4148699431164448361L, MethodHandles.lookup().lookupClass()).a(38866830842349L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long g;

public sh(@NotNull String id, @NotNull String value, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(id, a<"i">(10048, 1537384280605095485L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"i">(3453, 8320664434233334788L ^ ax));
super();
this.f = id;
this.d = value;
}

@NotNull
public final String d() {
return this.f;
}

@NotNull
public final String G() {
return this.d;
}

@NotNull
public final String f() {
return this.f;
}

@NotNull
public final String Y() {
return this.d;
}

@NotNull
public final sh a(long a, @NotNull String id, @NotNull String value) {
ax = a ^ ax;
long var5 = ax ^ 69175785663610L;
Intrinsics.checkNotNullParameter(id, a<"i">(17180, 5345105819781239719L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"i">(23500, 1558535144400915312L ^ ax));
return new sh(id, value, var5);
}

public static sh S(sh var0, String var1, String var2, int var3, Object var4, long var5) {
var5 = a ^ var5;
long var7 = var5 ^ 126316702212738L;
_g[] var9 = vm.a<"Å">(3680591182648473052L, var5);

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
throw vm.a<"Å">(var10, 3683351177977695001L, var5);
}

var1 = var0.f;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.d;
}

return var0.a(var7, var1, var2);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 112769547212713L;
String var10000 = this.f;
String var10001 = this.d;
return a<"i">(2304, 700958364726288112L ^ var1) + var10000 + a<"i">(17324, 5732155541494633566L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 20361839915106L;
int var3 = this.f.hashCode();
return var3 * (int)g + this.d.hashCode();
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
// 00: getstatic su/catlean/sh.a J
// 03: ldc2_w 77257944233744
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6619556934750379285
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 6617073981991674832
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 6617073981991674832
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/sh
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 6617073981991674832
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 6617073981991674832
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/sh
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/sh.f Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/sh.f Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 6617073981991674832
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 6617073981991674832
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/sh.d Ljava/lang/String;
// 92: aload 5
// 94: getfield su/catlean/sh.d Ljava/lang/String;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 6617073981991674832
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 6617073981991674832
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void a(sh self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeStringElement(serialDesc, 0, self.f);
output.encodeStringElement(serialDesc, 1, self.d);
}

public sh(long a, int seen0, String id, String value, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (3 != (3 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 3, pm.O.getDescriptor());
}

super();
this.f = id;
this.d = value;
}

static {
long var14 = a ^ 39442853854328L;
vm.a<"Å">(0, -3439893845966237193L, var14);
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
String var9 = "ç8èï·\r\u0012\u0082;´í\u0085\u001e*±¬c\\È÷;Uxá\u009bÃÛ¶\n\u0010!yyIêT\b\u008fúã\u0010P\u0099\u001fO\u008d8wÐ\"A?\u0088ÿ\u0006çä \n\u0081a\u007féè\u0097Ö\u0004æ7\u0089ÓÍ\u001d[9Su\u009fåð?8\u008d®7\u0087ËÎnÛ\u0010vÚ\u0003L³}ßÖÿM\u0081z 6Ð\u0094";
int var11 = "ç8èï·\r\u0012\u0082;´í\u0085\u001e*±¬c\\È÷;Uxá\u009bÃÛ¶\n\u0010!yyIêT\b\u008fúã\u0010P\u0099\u001fO\u008d8wÐ\"A?\u0088ÿ\u0006çä \n\u0081a\u007féè\u0097Ö\u0004æ7\u0089ÓÍ\u001d[9Su\u009fåð?8\u008d®7\u0087ËÎnÛ\u0010vÚ\u0003L³}ßÖÿM\u0081z 6Ð\u0094"
.length();
char var8 = '(';
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
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
long var2 = -6279189437528282564L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
g = var30;
N = new np(null);
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "Þ6Ç\u001b¸[¾u\u001d\u008cÞû\u009a¹uâ\u0010\"\"\u0099dPÅ©®ä\b\"<©\u008fôæ";
var11 = "Þ6Ç\u001b¸[¾u\u001d\u008cÞû\u009a¹uâ\u0010\"\"\u0099dPÅ©®ä\b\"<©\u008fôæ".length();
var8 = 16;
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
var10001 = 0;
}
}
}

public static void b(int var0) {
k = var0;
}

public static int y() {
return k;
}

public static int V() {
int var0 = y();

try {
return var0 == 0 ? 56 : 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28131;
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
throw new RuntimeException("su/catlean/sh", var10);
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
throw new RuntimeException("su/catlean/sh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
