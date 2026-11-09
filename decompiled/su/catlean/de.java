package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class de implements Comparator {
private static int[] R;
private static final long a = yz.a(8634637909241044180L, 8179733634144685024L, MethodHandles.lookup().lookupClass()).a(246365118970863L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 136813409625564L;
long var5 = var3 ^ 119869413325794L;
long var10001 = var3 ^ 119047663845277L;
int var7 = (int)((var3 ^ 119047663845277L) >>> 32);
int var8 = (int)((var3 ^ 119047663845277L) << 32 >>> 56);
int var9 = (int)(var10001 << 40 >>> 40);
long var10 = var3 ^ 95849343421932L;
vm.a<"Å">(2356065801553417963L, var3);
class_2338 var13 = (class_2338)ax;
boolean var14 = false;

float var21;
label39: {
try {
if (ev.j(var5, ev.N) == bm.FOV) {
var21 = u_.c.l(var7, (byte)var8, var13, var9);
break label39;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 2312178116369364093L, var3);
}

dm var10000 = dm.h;
class_243 var26 = var13.method_46558();
Intrinsics.checkNotNullExpressionValue(var26, a<"s">(17783, 3399828981972427245L ^ var3));
var21 = var10000.R(var10, var26);
}

Comparable var22 = var21;
var13 = (class_2338)bx;
Comparable var15 = var22;
var14 = false;

label31: {
try {
if (ev.j(var5, ev.N) == bm.FOV) {
var21 = u_.c.l(var7, (byte)var8, var13, var9);
break label31;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 2312178116369364093L, var3);
}

dm var23 = dm.h;
class_243 var27 = var13.method_46558();
Intrinsics.checkNotNullExpressionValue(var27, a<"s">(16684, 7873348044669871543L ^ var3));
var21 = var23.R(var10, var27);
}

try {
int var25 = ComparisonsKt.compareValues(var15, var21);
if (vm.a<"Å">(2360603762882002515L, var3) != null) {
vm.a<"Å">(new int[1], 2370556656224378605L, var3);
}

return var25;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 2312178116369364093L, var3);
}
}

public static void W(int[] var0) {
R = var0;
}

public static int[] L() {
return R;
}

static {
long var9 = a ^ 18638463197490L;
vm.a<"Å">(null, 2597314908154829315L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[2];
int var5 = 0;
String var4 = "\u0012¿6¡ÖS'ñ\u0002XncÜÄ^p+SÑ\u0098(¦N\u0080·0S3k)Ô*\u0018AÔà\r±ìùxP\nÛ5©]]í\n\u0080\n2Re:\u001e";
int var6 = "\u0012¿6¡ÖS'ñ\u0002XncÜÄ^p+SÑ\u0098(¦N\u0080·0S3k)Ô*\u0018AÔà\r±ìùxP\nÛ5©]]í\n\u0080\n2Re:\u001e".length();
char var3 = ' ';
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var13;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1288;
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
throw new RuntimeException("su/catlean/de", var10);
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
throw new RuntimeException("su/catlean/de" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
