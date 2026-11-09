package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z_ implements class_11281 {
@NotNull
private final class_241 P;
private static final long a = yz.a(-473017441815266072L, 7835919563790592020L, MethodHandles.lookup().lookupClass()).a(238673575230103L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public z_(long a, @NotNull class_241 halfTexelSize) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(halfTexelSize, a<"a">(8625, 3940230616124148282L ^ ax));
super();
this.P = halfTexelSize;
}

@NotNull
public final class_241 U() {
return this.P;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 13747344981885L;
long var4 = var2 ^ 30021210743840L;
long var6 = var2 ^ 81263762660216L;
long var8 = var2 ^ 62546587615563L;
Intrinsics.checkNotNullParameter(buffer, a<"a">(27943, 2771391645849167983L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.P.field_1343, this.P.field_1342)
.putFloat(Math.abs(jl.y.B((zf.v(var8).field_6012 - 1) / 48.0F, zf.v(var8).field_6012 / 48.0F, jl.y.K(var6))))
.putInt(k6.b.r(var4).ordinal());
}

@NotNull
public final class_241 H() {
return this.P;
}

@NotNull
public final z_ j(short a, int a, char a, @NotNull class_241 halfTexelSize) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 87750198464447L;
Intrinsics.checkNotNullParameter(halfTexelSize, a<"a">(15358, 6072773698092020369L ^ var5));
return new z_(var7, halfTexelSize);
}

public static z_ R(z_ var0, class_241 var1, int var2, Object var3, long var4) {
var4 = a ^ var4;
long var10001 = var4 ^ 26733815110187L;
int var6 = (int)((var4 ^ 26733815110187L) >>> 48);
int var7 = (int)((var4 ^ 26733815110187L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
if ((var2 & 1) != 0) {
var1 = var0.P;
}

return var0.j((short)var6, var7, (char)var8, var1);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 4826778158485L;
class_241 var10000 = this.P;
return a<"a">(25218, 494319418039033120L ^ var1) + var10000 + ")";
}

@Override
public int hashCode() {
return this.P.hashCode();
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
// 00: getstatic su/catlean/z_.a J
// 03: ldc2_w 55371514272697
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -5200986052390396948
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -5239900276451692724
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -5239900276451692724
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/z_
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -5239900276451692724
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -5239900276451692724
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/z_
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/z_.P Lnet/minecraft/class_241;
// 65: aload 5
// 67: getfield su/catlean/z_.P Lnet/minecraft/class_241;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 8f
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -5239900276451692724
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -5239900276451692724
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: ireturn
}

static {
long var0 = a ^ 49391403548669L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[4];
int var7 = 0;
String var6 = "¾ý\u0083;\u00adË\u001cfæ\u0014\u0016@\u0011H27fPßì*¿À²½¯ìr[m\\Ý\u0010\u0097Ç\u001e\u0005@)\u0007ò^¦\u000f(DèÕ)";
int var8 = "¾ý\u0083;\u00adË\u001cfæ\u0014\u0016@\u0011H27fPßì*¿À²½¯ìr[m\\Ý\u0010\u0097Ç\u001e\u0005@)\u0007ò^¦\u000f(DèÕ)".length();
char var5 = ' ';
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[4];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "l¦<ôékMï\u0015\u009cè\u008c\u009c§v\u0001\u008bºÆ\næ+ÐF}k¨¸-r\tÄ8\u001fß8½Ñò\u0018\u0096ùà \u009cÊÖ\u0083Hï?b\u000b¾á\u0083:ªôu\u009f\nf¼Ì\u0001@\u001d¾<>ÃëMl\u008fö\u0087\u0002D\u008ff³±\u0097¥Ðu\u0014";
var8 = "l¦<ôékMï\u0015\u009cè\u008c\u009c§v\u0001\u008bºÆ\næ+ÐF}k¨¸-r\tÄ8\u001fß8½Ñò\u0018\u0096ùà \u009cÊÖ\u0083Hï?b\u000b¾á\u0083:ªôu\u009f\nf¼Ì\u0001@\u001d¾<>ÃëMl\u008fö\u0087\u0002D\u008ff³±\u0097¥Ðu\u0014"
.length();
var5 = ' ';
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5997;
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
throw new RuntimeException("su/catlean/z_", var10);
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
throw new RuntimeException("su/catlean/z_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
