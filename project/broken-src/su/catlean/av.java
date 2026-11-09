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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

public final class av extends a1 {
@NotNull
private final Json n;
private static int R;
private static final long c = yz.a(-4777379769918061755L, -5755119447319120370L, MethodHandles.lookup().lookupClass()).a(77601524827902L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long l;

public av(@NotNull String id, @NotNull lj defaultValue, @NotNull Function0 visible, long a) {
a = c ^ a;
long var6 = a ^ 68940933372129L;
Intrinsics.checkNotNullParameter(id, b<"l">(12784, 4970939582116135609L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"l">(5483, 8462143284911941157L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"l">(32126, 7435009549037293109L ^ a));
super(var6, id, defaultValue, null, null, visible, (int)l, null);
this.n = JsonKt.Json$default(null, av::a, 1, null);
}

@Override
public void P(@NotNull String setting, long a) {
Intrinsics.checkNotNullParameter(setting, b<"l">(30753, 7831057081110860225L ^ a));
Json var4 = this.n;
boolean var6 = false;
var4.getSerializersModule();
this.H(var4.decodeFromString(lj.K.f(), setting));
}

@NotNull
@Override
public String toString() {
Json var1 = this.n;
Object var2 = this.F();
boolean var3 = false;
var1.getSerializersModule();
return var1.encodeToString(lj.K.f(), var2);
}

private static final boolean Z() {
return true;
}

private static final Unit a(JsonBuilder var0) {
long var1 = c ^ 33344562764332L;
Intrinsics.checkNotNullParameter(var0, b<"l">(19391, 8122736743879959577L ^ var1));
var0.setIgnoreUnknownKeys(true);
var0.setEncodeDefaults(true);
return Unit.INSTANCE;
}

public static void H(int var0) {
R = var0;
}

public static int p() {
return R;
}

public static int s() {
int var0 = p();

try {
return var0 == 0 ? 21 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = c ^ 108143107266488L;
vm.a<"Å">(48, 3522589599128628745L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[5];
int var10 = 0;
String var9 = "L¿\rÚ\u0096Á+\u007fF?fÄå\u008d\r\u0095Y\u0019[xf>\u0097sÝDó\u0003\u0092n·a\u0010§À\u00907H\u0099íæ>§=\u0000>ÔÔy\u0010øð;± î\u0099ÎÊ\u008bw\u0080\u0006\u0018F2";
int var11 = "L¿\rÚ\u0096Á+\u007fF?fÄå\u008d\r\u0095Y\u0019[xf>\u0097sÝDó\u0003\u0092n·a\u0010§À\u00907H\u0099íæ>§=\u0000>ÔÔy\u0010øð;± î\u0099ÎÊ\u008bw\u0080\u0006\u0018F2"
.length();
char var8 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
d = var12;
g = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 7061063201329358036L;
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

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "5\u0092h.;_A\u0011ä·]s\u0007J²{ itn\u0012õ2°¹ÞÛã\u0090F\u001a\u0097þéµ\f;\u0015Aþ\u008d\u0014\u001cW\u0091\u0099ô¶Ø";
var11 = "5\u0092h.;_A\u0011ä·]s\u0007J²{ itn\u0012õ2°¹ÞÛã\u0090F\u001a\u0097þéµ\f;\u0015Aþ\u008d\u0014\u001cW\u0091\u0099ô¶Ø".length();
var8 = 16;
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21349;
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
throw new RuntimeException("su/catlean/av", var10);
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
throw new RuntimeException("su/catlean/av" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
