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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class f8 {
@NotNull
public static final o6 L;
@NotNull
private final aw h;
@NotNull
private final dn A;
@JvmField
@NotNull
private static final Lazy[] x;
private static final long a = yz.a(165739871072492581L, 1490603611413866590L, MethodHandles.lookup().lookupClass()).a(120921302522548L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public f8(short a, @NotNull aw cmd, int a, short a, @NotNull dn args) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(cmd, a<"s">(24956, 6490083989815657384L ^ var6));
Intrinsics.checkNotNullParameter(args, a<"s">(5697, 2631806412981466260L ^ var6));
super();
this.h = cmd;
this.A = args;
}

@NotNull
public final aw P() {
return this.h;
}

@NotNull
public final dn s() {
return this.A;
}

@NotNull
public final aw z() {
return this.h;
}

@NotNull
public final dn r() {
return this.A;
}

@NotNull
public final f8 H(@NotNull aw cmd, short a, int a, char a, @NotNull dn args) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var6 ^ 20227481049291L;
int var8 = (int)((var6 ^ 20227481049291L) >>> 48);
int var9 = (int)((var6 ^ 20227481049291L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(cmd, a<"s">(16825, 8705311778689743630L ^ var6));
Intrinsics.checkNotNullParameter(args, a<"s">(17399, 1679878577806539073L ^ var6));
return new f8((short)var8, cmd, var9, (short)var10, args);
}

public static f8 s(f8 var0, aw var1, long var2, dn var4, int var5, Object var6) {
var2 = a ^ var2;
long var10001 = var2 ^ 54632711929740L;
int var7 = (int)((var2 ^ 54632711929740L) >>> 48);
int var8 = (int)((var2 ^ 54632711929740L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
String[] var10 = vm.a<"Å">(-5925890632610215963L, var2);

int var10000;
label25: {
label24: {
try {
var10000 = var5 & 1;
if (var10 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -5939122528694517070L, var2);
}

var1 = var0.h;
}

var10000 = var5 & 2;
}

if (var10000 != 0) {
var4 = var0.A;
}

return var0.H(var1, (short)var7, var8, (char)var9, var4);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 139939915162226L;
aw var10000 = this.h;
dn var10001 = this.A;
return a<"s">(222, 7630202472632044349L ^ var1) + var10000 + a<"s">(23592, 4471524360644532170L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 81677119076749L;
int var3 = this.h.hashCode();
return var3 * (int)e + this.A.hashCode();
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
// 00: getstatic su/catlean/f8.a J
// 03: ldc2_w 42601114758525
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -6000689214045550945
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -5987048995613260856
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -5987048995613260856
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/f8
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -5987048995613260856
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -5987048995613260856
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/f8
// 5f: astore 5
// 61: aload 0
// 62: aload 4
// 64: ifnonnull 8c
// 67: getfield su/catlean/f8.h Lsu/catlean/aw;
// 6a: aload 5
// 6c: getfield su/catlean/f8.h Lsu/catlean/aw;
// 6f: if_acmpeq 8b
// 72: goto 7f
// 75: ldc2_w -5987048995613260856
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -5987048995613260856
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/f8.A Lsu/catlean/dn;
// 8f: aload 5
// 91: getfield su/catlean/f8.A Lsu/catlean/dn;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: aload 4
// 99: ifnonnull b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w -5987048995613260856
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -5987048995613260856
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

@JvmStatic
public static final void W(f8 self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = x;
output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy<? super aw>)var3[0].getValue(), self.h);
output.encodeSerializableElement(serialDesc, 1, ny.M, self.A);
}

public f8(int seen0, long a, aw cmd, dn args, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (3 != (3 & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, 3, wr.T.getDescriptor());
}

super();
this.h = cmd;
this.A = args;
}

private static final KSerializer h() {
return aw.Companion.b();
}

public static final Lazy[] U() {
return x;
}

static {
long var5 = a ^ 82618394672047L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[6];
int var12 = 0;
String var11 = "ÀXæýØð\u001a\u0082\u0086sà\u009cÉþë\u0006\u0010m4ÃR\u00adê#\\\u007fGÈ\u0004¤\u009bf¡\u0010\u008dZ\u0086\u001eç¨F\u0013p'~¶ñùVä\u0010ªî\u00adÇ4c\u008c\u0091)ÙD\u00add×ò\u0011";
int var13 = "ÀXæýØð\u001a\u0082\u0086sà\u009cÉþë\u0006\u0010m4ÃR\u00adê#\\\u007fGÈ\u0004¤\u009bf¡\u0010\u008dZ\u0086\u001eç¨F\u0013p'~¶ñùVä\u0010ªî\u00adÇ4c\u008c\u0091)ÙD\u00add×ò\u0011"
.length();
char var10 = 16;
int var18 = -1;

label37:
while (true) {
String var19 = var11.substring(++var18, var18 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var19.getBytes("ISO-8859-1"));
String var27 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var27;
if ((var18 += var10) >= var13) {
b = var14;
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 7573640813153487356L;
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
L = new o6(null);
Lazy[] var16 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, f8::h), null};
x = var16;
return;
}

var10 = var11.charAt(var18);
break;
default:
var14[var12++] = var27;
if ((var18 += var10) < var13) {
var10 = var11.charAt(var18);
continue label37;
}

var11 = "#Gå\u0092Ì\ný\u008e\u0007tý\u0019Mñ\u008cö(5¿Eó 6\u009aãy¼9SÃÿ\u0093ñ(\u007fâ\u008fØÕïoËÁè2\u009bÛ«\u008cf\u0004Q*í\u009by¼";
var13 = "#Gå\u0092Ì\ný\u008e\u0007tý\u0019Mñ\u008cö(5¿Eó 6\u009aãy¼9SÃÿ\u0093ñ(\u007fâ\u008fØÕïoËÁè2\u009bÛ«\u008cf\u0004Q*í\u009by¼".length();
var10 = 16;
var18 = -1;
}

var19 = var11.substring(++var18, var18 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26942;
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
throw new RuntimeException("su/catlean/f8", var10);
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
throw new RuntimeException("su/catlean/f8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
