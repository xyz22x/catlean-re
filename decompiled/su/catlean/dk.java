package su.catlean;

import java.io.File;
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
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class dk implements co {
@NotNull
private final Json E;
@NotNull
private final File T;
public List K;
private static final long a = yz.a(1130710695779698727L, -7325873853899627731L, MethodHandles.lookup().lookupClass()).a(146233375789374L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public dk(long a, @NotNull Json json) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(json, a<"o">(24605, 4405416984698372138L ^ ax));
super();
this.E = json;
this.T = new File(mj.v(), a<"o">(19106, 4378735865711291028L ^ ax));
}

@NotNull
public final List P(long var1) {
var1 = a ^ var1;

try {
if (this.K != null) {
return this.K;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -809709469777168694L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"o">(25517, 6863529589819659957L ^ var1));
return null;
}

public final void x(char a, @NotNull List <set-?>, long a) {
long var5 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"o">(3857, 8603997097031021609L ^ var5));
this.K = <set-?>;
}

@Override
public void w(long var1) {
int var3 = (int)((var1 ^ 99836442500987L) >>> 48);
long var4 = (var1 ^ 99836442500987L) << 16 >>> 16;

dk var10000;
List var10001;
label29: {
try {
var10000 = this;
if (this.T.createNewFile()) {
var10001 = new ArrayList();
break label29;
}
} catch (Exception var12) {
throw vm.a<"Å">(var12, -4904890097006921241L, var1);
}

dk var10 = var10000;

List var7;
try {
var10000 = var10;
Json var13 = this.E;
String var8 = FilesKt.readText$default(this.T, null, 1, null);
boolean var9 = false;
var13.getSerializersModule();
var7 = var13.decodeFromString(new ArrayListSerializer<>(StringSerializer.INSTANCE), var8);
} catch (Exception var11) {
var10000 = var10;
zf.x().warn(a<"o">(2930, 8446054257099632961L ^ var1));
var7 = new ArrayList();
}

var10001 = var7;
}

List var6 = var10001;
var10000.x((char)var3, var6, var4);
}

@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 33217499204655L;
File var10000 = this.T;
Json var8 = this.E;
List var9 = this.P(var6);
boolean var10 = false;
var8.getSerializersModule();
FilesKt.writeText$default(var10000, var8.encodeToString(new ArrayListSerializer<>(StringSerializer.INSTANCE), var9), null, 2, null);
}

static {
long var0 = a ^ 64613823944546L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[5];
int var7 = 0;
String var6 = "\u0013MÖ°\u009fp~ôË©áA\u0000ä\u0007âÏÍô\u0010Ei\u0090\u007f\u0010\u008d\u00adðËy\u0013à\u0001TnlÇ§C!û\u0010^ÎÿºJQ v©g£(5Tvx";
int var8 = "\u0013MÖ°\u009fp~ôË©áA\u0000ä\u0007âÏÍô\u0010Ei\u0090\u007f\u0010\u008d\u00adðËy\u0013à\u0001TnlÇ§C!û\u0010^ÎÿºJQ v©g£(5Tvx".length();
char var5 = 24;
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
c = new String[5];
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

var6 = "þ¢û\u001dW\u0091çl\u0001\u0087î\u0012-2#\u009dXÈî÷\u0082utý§a\u0093W\u008bcüÌ§8\u0001BÈ\u008eirN´å\tº\u0011IG\"\u0011\u000fV\u001bøªDî\u000f;qÓ%ùç\u0080c,NÐ\u009bîi\u0004]üE\u0086Ú(Ù©ô\u0085SÍoÎ\u009d\u009c\u008f\u0098ÇÌ?m,±4æÏ½JIçò";
var8 = "þ¢û\u001dW\u0091çl\u0001\u0087î\u0012-2#\u009dXÈî÷\u0082utý§a\u0093W\u008bcüÌ§8\u0001BÈ\u008eirN´å\tº\u0011IG\"\u0011\u000fV\u001bøªDî\u000f;qÓ%ùç\u0080c,NÐ\u009bîi\u0004]üE\u0086Ú(Ù©ô\u0085SÍoÎ\u009d\u009c\u008f\u0098ÇÌ?m,±4æÏ½JIçò"
.length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16678;
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
throw new RuntimeException("su/catlean/dk", var10);
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
throw new RuntimeException("su/catlean/dk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
