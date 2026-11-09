package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xu {
private final int A;
@NotNull
private final List B;
private static final long a = yz.a(-536854847234019410L, 3743746291669544609L, MethodHandles.lookup().lookupClass()).a(104583174968920L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public xu(int playerId, char a, @NotNull List particles, char a, int a) {
long var6 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(particles, a<"l">(15360, 3553395379626724733L ^ var6));
super();
this.A = playerId;
this.B = particles;
}

public xu(int var1, List var2, int var3, long var4, DefaultConstructorMarker var6) {
var4 = a ^ var4;
long var10001 = var4 ^ 125208949237553L;
int var7 = (int)((var4 ^ 125208949237553L) >>> 48);
int var8 = (int)((var4 ^ 125208949237553L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
if ((var3 & 2) != 0) {
var2 = new ArrayList();
}

this(var1, (char)var7, var2, (char)var8, var9);
}

public final int q() {
return this.A;
}

@NotNull
public final List b() {
return this.B;
}

public final int O() {
return this.A;
}

@NotNull
public final List P() {
return this.B;
}

@NotNull
public final xu n(long a, int playerId, @NotNull List particles) {
ax = a ^ ax;
long var10001 = ax ^ 77614633847499L;
int var5 = (int)((ax ^ 77614633847499L) >>> 48);
int var6 = (int)((ax ^ 77614633847499L) << 16 >>> 48);
int var7 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(particles, a<"l">(1558, 4756419418021346174L ^ ax));
return new xu(playerId, (char)var5, particles, (char)var6, var7);
}

public static xu y(xu var0, int var1, long var2, List var4, int var5, Object var6) {
var2 = a ^ var2;
long var7 = var2 ^ 101056327016619L;
String[] var9 = vm.a<"Å">(-4462411904247691303L, var2);

int var10000;
label25: {
label24: {
try {
var10000 = var5 & 1;
if (var9 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -4451355329776945389L, var2);
}

var1 = var0.A;
}

var10000 = var5 & 2;
}

if (var10000 != 0) {
var4 = var0.B;
}

return var0.n(var7, var1, var4);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 111599850194642L;
int var10000 = this.A;
List var10001 = this.B;
return a<"l">(6856, 8514603079022576199L ^ var1) + var10000 + a<"l">(18756, 7229759411952374218L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 24935424502124L;
int var3 = Integer.hashCode(this.A);
return var3 * (int)e + this.B.hashCode();
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
// 00: getstatic su/catlean/xu.a J
// 03: ldc2_w 17170086755006
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -4760853136756770779
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -4772194209064875793
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -4772194209064875793
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/xu
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -4772194209064875793
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -4772194209064875793
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/xu
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/xu.A I
// 65: aload 4
// 67: ifnonnull 97
// 6a: aload 5
// 6c: getfield su/catlean/xu.A I
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w -4772194209064875793
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -4772194209064875793
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/xu.B Ljava/util/List;
// 8f: aload 5
// 91: getfield su/catlean/xu.B Ljava/util/List;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: aload 4
// 99: ifnonnull b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w -4772194209064875793
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -4772194209064875793
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

static {
long var5 = a ^ 19954983263572L;
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
String var11 = "lxýU\u000f\u0086\u009a\u0086¶`\u0082¦y7\u0018ý6\u0093w\u0080<Á\u009bäim¥fxW/!(y%,a¥[\u0086\u0015@^ÉX\u008d»A;cùZ/\u0015b²%{FÓ\u009bùe½]é#m©ÿK\u009c\u0092";
int var13 = "lxýU\u000f\u0086\u009a\u0086¶`\u0082¦y7\u0018ý6\u0093w\u0080<Á\u009bäim¥fxW/!(y%,a¥[\u0086\u0015@^ÉX\u008d»A;cùZ/\u0015b²%{FÓ\u009bùe½]é#m©ÿK\u009c\u0092"
.length();
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
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 2607372242686838719L;
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
e = var30;
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

var11 = "\u0092ÄU\b\u0096\b\u0080El(\u0088 laè6Õ\u0094-\u0096óÙÂ)\u0007\u0085\u0092ìÀ\u0082ðç\u0018ïÅñÐäÝú+åÿñ\u008bþyþü\u0092\tP_\u0086\u0017^b";
var13 = "\u0092ÄU\b\u0096\b\u0080El(\u0088 laè6Õ\u0094-\u0096óÙÂ)\u0007\u0085\u0092ìÀ\u0082ðç\u0018ïÅñÐäÝú+åÿñ\u008bþyþü\u0092\tP_\u0086\u0017^b".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22659;
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
throw new RuntimeException("su/catlean/xu", var10);
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
throw new RuntimeException("su/catlean/xu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
