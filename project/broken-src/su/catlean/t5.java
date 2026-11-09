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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class t5 {
@NotNull
private final _w R;
private final int u;
@NotNull
private Function0 F;
private static String e;
private static final long b = yz.a(-6617334934752308678L, -1766727414190661172L, MethodHandles.lookup().lookupClass()).a(150592718730132L);
private static final String[] c;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long j;

public t5(@NotNull _w rotation, long a, int priority, @NotNull Function0 action) {
a = b ^ a;
Intrinsics.checkNotNullParameter(rotation, a<"w">(16412, 1632277073856207155L ^ a));
Intrinsics.checkNotNullParameter(action, a<"w">(21891, 2359349731268037807L ^ a));
super();
this.R = rotation;
this.u = priority;
this.F = action;
}

@NotNull
public final _w O() {
return this.R;
}

public final int b() {
return this.u;
}

@NotNull
public final Function0 A() {
return this.F;
}

public final void c(@NotNull Function0 <set-?>, short a, short a, int a) {
long var5 = ((long)a << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ b;
Intrinsics.checkNotNullParameter(<set-?>, a<"w">(5514, 712262750743339383L ^ var5));
this.F = <set-?>;
}

public static void D(String var0) {
e = var0;
}

public static String B() {
return e;
}

static {
long var14 = b ^ 124225933643326L;
vm.a<"Å">("VTFFQc", -273390152863317497L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[3];
int var10 = 0;
String var9 = ",¬3ãD»ÁçÃ\u009a\u0089{?¥Wq\u0018pô\u0002}eØ\u0003MõMgåé\u0085òD\u008e9\u0082Ïé\u001båJ\u0010ü²\u000eÝ\u009d¤\u001fï\u0000\u0081ì\u0093Üµà\u0097";
int var11 = ",¬3ãD»ÁçÃ\u009a\u0089{?¥Wq\u0018pô\u0002}eØ\u0003MõMgåé\u0085òD\u008e9\u0082Ïé\u001båJ\u0010ü²\u000eÝ\u009d¤\u001fï\u0000\u0081ì\u0093Üµà\u0097"
.length();
char var8 = 16;
int var7 = -1;

while (true) {
byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
String var20 = a(var13).intern();
byte var10001 = -1;
var12[var10++] = var20;
if ((var7 += var8) >= var11) {
c = var12;
d = new String[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 7083757643692585949L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
j = var23;
return;
}

var8 = var9.charAt(var7);
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23867;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/t5", var10);
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
throw new RuntimeException("su/catlean/t5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
