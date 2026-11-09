package su.catlean;

import java.io.File;
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
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class mx implements co {
@NotNull
private final Json v;
@NotNull
private final File E;
public sl c;
private static String X;
private static final long a = yz.a(-5185824560382203290L, -8667211323177996932L, MethodHandles.lookup().lookupClass()).a(90155952526716L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public mx(long a, @NotNull Json json) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(json, a<"s">(16667, 2344433655150931227L ^ ax));
super();
this.v = json;
this.E = new File(mj.v(), a<"s">(6956, 8944310342481950511L ^ ax));
}

@NotNull
public final sl W(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/mx.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -4383072490422579192
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 3
// 11: ifnonnull 45
// 14: aload 0
// 15: getfield su/catlean/mx.c Lsu/catlean/sl;
// 18: dup
// 19: ifnull 34
// 1c: goto 29
// 1f: ldc2_w -4453415610828988233
// 22: lload 1
// 23: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: athrow
// 29: areturn
// 2a: ldc2_w -4453415610828988233
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: pop
// 35: sipush 4097
// 38: ldc2_w 7029654982387085640
// 3b: lload 1
// 3c: lxor
// 3d: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/mx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
// 45: aconst_null
// 46: areturn
}

public final void B(@NotNull sl <set-?>, short a, int a, char a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"s">(32393, 1648422096545295024L ^ var5));
this.c = <set-?>;
}

@Override
public void w(long var1) {
long var10001 = var1 ^ 117038982073452L;
int var3 = (int)((var1 ^ 117038982073452L) >>> 48);
int var4 = (int)((var1 ^ 117038982073452L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 9504272317057L;

mx var10000;
label29: {
try {
var10000 = this;
if (this.E.createNewFile()) {
var15 = new sl(null, null, var6, null, null, false, b<"p">(19569, 7839211768675194690L ^ var1), null);
break label29;
}
} catch (Exception var13) {
throw vm.a<"Å">(var13, -4902070734552721027L, var1);
}

mx var11 = var10000;

sl var8;
try {
var10000 = var11;
Json var14 = this.v;
String var9 = FilesKt.readText$default(this.E, null, 1, null);
boolean var10 = false;
var14.getSerializersModule();
var8 = var14.decodeFromString(sl.C.T(), var9);
} catch (Exception var12) {
var10000 = var11;
zf.x().warn(a<"s">(30392, 733949001506205240L ^ var1));
var8 = new sl(null, null, var6, null, null, false, b<"p">(24312, 5846992008900265418L ^ var1), null);
}

var15 = var8;
}

var10000.B(var15, (short)var3, var4, (char)var5);
}

@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 116852923442287L;
File var10000 = this.E;
Json var8 = this.v;
sl var9 = this.W(var6);
boolean var10 = false;
var8.getSerializersModule();
FilesKt.writeText$default(var10000, var8.encodeToString(sl.C.T(), var9), null, 2, null);
}

public static void q(String var0) {
X = var0;
}

public static String r() {
return X;
}

static {
long var20 = a ^ 32688124194337L;
vm.a<"Å">(null, 8010291376940571646L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "-í\u000b²j\u0001Gfv¢\u0010Z¸]Qíë\u009cµø\u001bLn\u008d\u009c)Ëüß\\½\u0099X\u001e\u0085\u0095tÕ\u007f\u0096\u009bm·rãðüThÒÔ\u008f$\u008e¹9B\f\u0087Ñ\f{\u000e\u001b\u0001r9UìÔÃ¡ \u0091õµ×.Þ¿Zeµ\u0082]\u0000\u0081\u0093\u0001P\u007fiH\u0011Ñÿ¨\u009f½*9îT~É¨º!]*ËWD\u0088$ãQ\u008dé|\b\u0010îI\b\u0097YY+\u0000\u0094½h¥®¯÷A";
int var17 = "-í\u000b²j\u0001Gfv¢\u0010Z¸]Qíë\u009cµø\u001bLn\u008d\u009c)Ëüß\\½\u0099X\u001e\u0085\u0095tÕ\u007f\u0096\u009bm·rãðüThÒÔ\u008f$\u008e¹9B\f\u0087Ñ\f{\u000e\u001b\u0001r9UìÔÃ¡ \u0091õµ×.Þ¿Zeµ\u0082]\u0000\u0081\u0093\u0001P\u007fiH\u0011Ñÿ¨\u009f½*9îT~É¨º!]*ËWD\u0088$ãQ\u008dé|\b\u0010îI\b\u0097YY+\u0000\u0094½h¥®¯÷A"
.length();
char var14 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
b = var18;
d = new String[5];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u0086\u0004(0g\u008eÒ\u0018ék\u0090ß\u009d%G;";
int var5 = "\u0086\u0004(0g\u008eÒ\u0018ék\u0090ß\u009d%G;".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
g = new Integer[2];
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "è\u0001ÙÍÅ¥\u008b<èÔÚ\u0094õ!Cu\u0010B9\u000e\u008d\u000f5\u0090gë\\\nò\u0084÷§\u008a";
var17 = "è\u0001ÙÍÅ¥\u008b<èÔÚ\u0094õ!Cu\u0010B9\u000e\u008d\u000f5\u0090gë\\\nò\u0084÷§\u008a".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25488;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/mx", var10);
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
throw new RuntimeException("su/catlean/mx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8227;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/mx", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/mx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
