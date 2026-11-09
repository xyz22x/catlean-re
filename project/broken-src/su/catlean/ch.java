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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ch extends a1 {
private static final long c = yz.a(-4423674274991693370L, -5857510393921412651L, MethodHandles.lookup().lookupClass()).a(32223435834195L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long l;

public ch(@NotNull String id, @NotNull d_ defaultValue, @Nullable h group, @NotNull Function0 visible, long a) {
a = c ^ a;
long var7 = a ^ 52068035423967L;
Intrinsics.checkNotNullParameter(id, b<"f">(28591, 3386126720065530658L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"f">(17992, 2031826558632084164L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"f">(9057, 2370735871888533487L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

public ch(String var1, d_ var2, long var3, h var5, Function0 var6, int var7, DefaultConstructorMarker var8) {
var3 = c ^ var3;
long var9 = var3 ^ 132148572696283L;
if ((var7 & 4) != 0) {
var5 = null;
}

if ((var7 & (int)l) != 0) {
var6 = ch::E;
}

this(var1, var2, var5, var6, var9);
}

@Override
public void P(@NotNull String setting, long a) {
Intrinsics.checkNotNullParameter(setting, b<"f">(23014, 1250851764474442239L ^ a));
Json var4 = a1.G.C();
boolean var6 = false;
var4.getSerializersModule();
this.H(var4.decodeFromString(d_.r.X(), setting));
}

@NotNull
@Override
public String toString() {
Json var1 = a1.G.C();
Object var2 = this.F();
boolean var3 = false;
var1.getSerializersModule();
return var1.encodeToString(d_.r.X(), var2);
}

private static final boolean E() {
return true;
}

static {
long var5 = c ^ 42800589966591L;
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
String var11 = "B\u0086Ó\u0002\u009fVÖ\u001dj\u0099x{Æ§\u0013,\u0010\u009bÞ{\u0099Í\b4-ñ\u001c\u0010¡(yj\u0088";
int var13 = "B\u0086Ó\u0002\u009fVÖ\u001dj\u0099x{Æ§\u0013,\u0010\u009bÞ{\u0099Í\b4-ñ\u001c\u0010¡(yj\u0088".length();
char var10 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
d = var14;
g = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5731425846871879751L;
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
l = var30;
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

var11 = "lp-l\bOº°ùùýPÎ¤\u0086°Ì\u0096}T\u00ad\u009ab¿¯\u008eSÞS²ÃÛ\u0010Hý>\u0016ªiI^\u0091iXÚ¡ÖÜÂ";
var13 = "lp-l\bOº°ùùýPÎ¤\u0086°Ì\u0096}T\u00ad\u009ab¿¯\u008eSÞS²ÃÛ\u0010Hý>\u0016ªiI^\u0091iXÚ¡ÖÜÂ".length();
var10 = ' ';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4767;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ch", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/ch" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
