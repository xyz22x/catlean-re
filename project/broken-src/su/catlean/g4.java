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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class g4 implements co {
@NotNull
private final Json z;
@NotNull
private final File g;
public po v;
private static final long a = yz.a(-7573330238437348837L, -4944645022501052395L, MethodHandles.lookup().lookupClass()).a(10006981304051L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public g4(@NotNull Json json, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(json, a<"l">(18583, 1735075612135392426L ^ ax));
super();
this.z = json;
this.g = new File(mj.v(), a<"l">(32334, 1430844493963735669L ^ ax));
}

@NotNull
public final po Z(long var1) {
var1 = a ^ var1;

try {
if (this.v != null) {
return this.v;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 143303875413446198L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"l">(112, 1308481706586034552L ^ var1));
return null;
}

public final void j(long a, short a, @NotNull po <set-?>) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"l">(10316, 1649540460038806000L ^ var5));
this.v = <set-?>;
}

@Override
public void w(long var1) {
long var3 = (var1 ^ 5002786454352L) >>> 16;
int var5 = (int)((var1 ^ 5002786454352L) << 48 >>> 48);
long var6 = var1 ^ 133444245573078L;

g4 var10000;
po var10001;
label29: {
try {
var10000 = this;
if (this.g.createNewFile()) {
var10001 = new po(new ArrayList(), var6);
break label29;
}
} catch (Exception var14) {
throw vm.a<"Å">(var14, -4906331847234014174L, var1);
}

g4 var12 = var10000;

po var9;
try {
var10000 = var12;
Json var15 = this.z;
String var10 = FilesKt.readText$default(this.g, null, 1, null);
boolean var11 = false;
var15.getSerializersModule();
var9 = var15.decodeFromString(po.Y.u(), var10);
} catch (Exception var13) {
var10000 = var12;
zf.x().warn(a<"l">(31957, 4157858625969428424L ^ var1));
var9 = new po(new ArrayList(), var6);
}

var10001 = var9;
}

po var8 = var10001;
var10000.j(var3, (short)var5, var8);
}

@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 133148621129362L;
File var10000 = this.g;
Json var8 = this.z;
po var9 = this.Z(var6);
boolean var10 = false;
var8.getSerializersModule();
FilesKt.writeText$default(var10000, var8.encodeToString(po.Y.u(), var9), null, 2, null);
}

static {
long var0 = a ^ 127484116305327L;
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
String var6 = "õ.näÊë®Qé1÷?Ç÷[j`\u0085hõ\u008b)å£Ï«>4÷\u0090>kÃb\u0000Ü\u008ai\u008aì\"}ÇÉ\u00adðÍ°\u001b\u0092d\u0083nI²\u0082º5N~FÑü-\u000eE¸©T\u0087~\u001c\u0097kMÂÿ°\u0018cÇ¹-º§\u0097\u0081O¥¿\u0099,Ä\u008f+8\u0003µ\u0085UÓ\u000füâÁD\u000f²ÏYîb\u0090  0\u0018À;Ý°þ\u008a-\u001e\u0084\u0090rAéb\u009c´?£°Yÿ)\u0091¾ìÓvX\u008e";
int var8 = "õ.näÊë®Qé1÷?Ç÷[j`\u0085hõ\u008b)å£Ï«>4÷\u0090>kÃb\u0000Ü\u008ai\u008aì\"}ÇÉ\u00adðÍ°\u001b\u0092d\u0083nI²\u0082º5N~FÑü-\u000eE¸©T\u0087~\u001c\u0097kMÂÿ°\u0018cÇ¹-º§\u0097\u0081O¥¿\u0099,Ä\u008f+8\u0003µ\u0085UÓ\u000füâÁD\u000f²ÏYîb\u0090  0\u0018À;Ý°þ\u008a-\u001e\u0084\u0090rAéb\u009c´?£°Yÿ)\u0091¾ìÓvX\u008e"
.length();
char var5 = 16;
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

var6 = "\u0098z}½Ê,qnÈZê9\u0005\u008cfö\u0010Í\u0088?©\u00808[@î~O\fjùùI";
var8 = "\u0098z}½Ê,qnÈZê9\u0005\u008cfö\u0010Í\u0088?©\u00808[@î~O\fjùùI".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20493;
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
throw new RuntimeException("su/catlean/g4", var10);
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
throw new RuntimeException("su/catlean/g4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
