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
public final class dn {
@NotNull
public static final pk c;
private final int t;
@NotNull
private final yq g;
private static final long a = yz.a(7305753417115354482L, -4603186143088505191L, MethodHandles.lookup().lookupClass()).a(135432161967122L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long f;

public dn(int pid, int a, char a, char a, @NotNull yq activity) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(activity, a<"f">(10348, 4966696808375139367L ^ var6));
super();
this.t = pid;
this.g = activity;
}

public final int h() {
return this.t;
}

@NotNull
public final yq U() {
return this.g;
}

public final int c() {
return this.t;
}

@NotNull
public final yq l() {
return this.g;
}

@NotNull
public final dn b(long a, int pid, @NotNull yq activity) {
ax = a ^ ax;
long var10001 = ax ^ 140504745716609L;
int var5 = (int)((ax ^ 140504745716609L) >>> 32);
int var6 = (int)((ax ^ 140504745716609L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(activity, a<"f">(17877, 5802466878898161234L ^ ax));
return new dn(pid, var5, (char)var6, (char)var7, activity);
}

public static dn U(dn var0, int var1, yq var2, int var3, long var4, Object var6) {
var4 = a ^ var4;
long var7 = var4 ^ 99052909172974L;
String[] var9 = vm.a<"Å">(-7193315830545369590L, var4);

int var10000;
label25: {
label24: {
try {
var10000 = var3 & 1;
if (var9 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -7187005616888026713L, var4);
}

var1 = var0.t;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.g;
}

return var0.b(var7, var1, var2);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 78921199143838L;
int var10000 = this.t;
yq var10001 = this.g;
return a<"f">(16300, 7991850605959246363L ^ var1) + var10000 + a<"f">(3565, 3842191711908020315L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 107510138954321L;
int var3 = Integer.hashCode(this.t);
return var3 * (int)f + this.g.hashCode();
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
// 00: getstatic su/catlean/dn.a J
// 03: ldc2_w 90001748625002
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -4951695075391958674
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -4961103439163109693
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -4961103439163109693
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/dn
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -4961103439163109693
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -4961103439163109693
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/dn
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/dn.t I
// 65: aload 4
// 67: ifnonnull 97
// 6a: aload 5
// 6c: getfield su/catlean/dn.t I
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w -4961103439163109693
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -4961103439163109693
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/dn.g Lsu/catlean/yq;
// 8f: aload 5
// 91: getfield su/catlean/dn.g Lsu/catlean/yq;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: aload 4
// 99: ifnonnull b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w -4961103439163109693
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -4961103439163109693
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

@JvmStatic
public static final void V(dn self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeIntElement(serialDesc, 0, self.t);
output.encodeSerializableElement(serialDesc, 1, bd.M, self.g);
}

public dn(int seen0, int pid, yq activity, long a, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (3 != (3 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 3, ny.M.getDescriptor());
}

super();
this.t = pid;
this.g = activity;
}

static {
long var5 = a ^ 89339671385754L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "-Øæ>Gî\u0002¦7\u0097S\u008b4>\u008df|\u0011Û\u0014Ñ\u0084\tlã3ûjÎÊ\u00865 \f)Å\fÑlùEÅêÿI®ª\u001crz8°÷-\u001d(\u0088v,\u001a§ÂwZ\u0088";
int var13 = "-Øæ>Gî\u0002¦7\u0097S\u008b4>\u008df|\u0011Û\u0014Ñ\u0084\tlã3ûjÎÊ\u00865 \f)Å\fÑlùEÅêÿI®ª\u001crz8°÷-\u001d(\u0088v,\u001a§ÂwZ\u0088".length();
char var10 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
d = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4271348323371410322L;
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
f = var30;
c = new pk(null);
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "¾\u0091Y\u0094¢s¡áq|\u0018\u0007®^ÿVËÜä7¨»L\u001fÏÆ=»«>\u009f\u0089 <t\u008f\u0010÷\u0005\u0091]ò4rO\u009d\u000fY\f;L\u0014Éû\u0082Z\u001cLú?ºÝÈ\u009c\u0012";
var13 = "¾\u0091Y\u0094¢s¡áq|\u0018\u0007®^ÿVËÜä7¨»L\u001fÏÆ=»«>\u009f\u0089 <t\u008f\u0010÷\u0005\u0091]ò4rO\u009d\u000fY\f;L\u0014Éû\u0082Z\u001cLú?ºÝÈ\u009c\u0012"
.length();
var10 = ' ';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14951;
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
throw new RuntimeException("su/catlean/dn", var10);
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
throw new RuntimeException("su/catlean/dn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
