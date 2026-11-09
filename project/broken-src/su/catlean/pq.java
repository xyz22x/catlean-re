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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pq extends gf {
@NotNull
public static final pq i;
private static int K;
private static final long a = yz.a(-8051536857964912462L, 5044691229711541945L, MethodHandles.lookup().lookupClass()).a(242925070611648L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);

private pq(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 71823433632012L;
int var3 = (int)((var1 ^ 71823433632012L) >>> 48);
int var4 = (int)((var1 ^ 71823433632012L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"o">(13085, 2224298609573150478L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 73719739740194L;
long var6 = ax ^ 116853176505585L;

pq var10000;
class_332 var10001;
int var10002;
String var10003;
label17: {
try {
Intrinsics.checkNotNullParameter(context, b<"o">(15103, 8915891999660431363L ^ ax));
var10000 = this;
var10001 = context;
var10002 = K;
if ((Boolean)zf.F(var4).field_1690.method_42433().method_41753()) {
var10003 = b<"o">(26372, 150515265324451321L ^ ax);
break label17;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -5937891529122674466L, ax);
}

var10003 = b<"o">(14304, 738530978748486942L ^ ax);
}

var10000.X(var10001, var6, var10002 + " " + var10003);
}

@Override
public void w(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 38798774274332
// 05: lxor
// 06: lstore 3
// 07: pop2
// 08: ldc2_w 6612689061597532343
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 5
// 13: lload 3
// 14: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17: getfield net/minecraft/class_746.field_6012 I
// 1a: bipush 4
// 1b: irem
// 1c: iload 5
// 1e: ifeq 44
// 21: ifne 47
// 24: goto 31
// 27: ldc2_w 6521247433659219910
// 2a: lload 1
// 2b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: athrow
// 31: getstatic su/catlean/nk.f Lsu/catlean/nk;
// 34: invokevirtual su/catlean/nk.D ()I
// 37: goto 44
// 3a: ldc2_w 6521247433659219910
// 3d: lload 1
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: putstatic su/catlean/pq.K I
// 47: return
}

static {
long var9 = a ^ 103282710814173L;
long var11 = var9 ^ 77044443831898L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[4];
int var5 = 0;
String var4 = "3\u001ef{Ê\u008c¬\u007fÜ\u0088Z\u009dw×tÖ\u0092L\bâ\u001bú±\u001cù\u008b\u0082e{ÔF\u008e\u0010 P\u009f¿\u0081\u008a\u0001a^§\bÀWh,±";
int var6 = "3\u001ef{Ê\u008c¬\u007fÜ\u0088Z\u009dw×tÖ\u0092L\bâ\u001bú±\u001cù\u008b\u0082e{ÔF\u008e\u0010 P\u009f¿\u0081\u008a\u0001a^§\bÀWh,±".length();
char var3 = ' ';
int var14 = -1;

label27:
while (true) {
String var15 = var4.substring(++var14, var14 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = b(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var14 += var3) >= var6) {
b = var7;
c = new String[4];
i = new pq(var11);
return;
}

var3 = var4.charAt(var14);
break;
default:
var7[var5++] = var21;
if ((var14 += var3) < var6) {
var3 = var4.charAt(var14);
continue label27;
}

var4 = "$ÂÁÎf\u0099Îdç9\u00adbÂa°Ö\u0010|\u009fu\u008f\fçY\u000f4ßù=¶\u009ckV";
var6 = "$ÂÁÎf\u0099Îdç9\u00adbÂa°Ö\u0010|\u009fu\u008f\fçY\u000f4ßù=¶\u009ckV".length();
var3 = 16;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20372;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pq", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/pq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
