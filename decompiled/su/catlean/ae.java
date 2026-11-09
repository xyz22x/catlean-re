package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

public final class ae extends a3 {
@NotNull
public static final ae M;
private static final long b = yz.a(-1330683896654346504L, 8113014598360714461L, MethodHandles.lookup().lookupClass()).a(216145712880945L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);
private static final long j;

private ae(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 135866942115436L;
super(var3, b<"l">(15957, 5496647365478752733L ^ var1));
}

@Override
public void l(@NotNull LiteralArgumentBuilder builder, long a) {
long var4 = a ^ 61473902788714L;
Intrinsics.checkNotNullParameter(builder, b<"l">(12818, 4038719444783823932L ^ a));
String var10002 = b<"l">(471, 4505237819674120190L ^ a);
IntegerArgumentType var10003 = IntegerArgumentType.integer();
Intrinsics.checkNotNullExpressionValue(var10003, b<"l">(27135, 10421195696252887L ^ a));
builder.then(this.j(var10002, (ArgumentType)var10003, var4).executes(ae::T));
builder.executes(ae::a);
}

public final void N(long delay, long a) {
a = b ^ a;
int var5 = (int)((a ^ 127339897309202L) >>> 32);
long var6 = (a ^ 127339897309202L) << 32 >>> 32;
long var8 = a ^ 48028185312953L;
long var10 = a ^ 121281020147997L;
zf.k(var8).method_45730(b<"l">(30189, 118274337939594310L ^ a));
zf.Z(var5, var6).method_2906(zf.v(var10).field_7512.field_7763, 1, zf.v(var10).method_31548().method_67532(), class_1713.field_7791, (class_1657)zf.v(var10));
bo var12 = bo.S;
byte var13 = 0;
boolean var14 = false;
var12.Y().execute(new jm(var13, delay));
}

private static final int T(CommandContext var0) {
long var1 = b ^ 57273407728201L;
long var3 = var1 ^ 113451353374779L;
long var5 = ((Number)var0.getArgument(b<"l">(4413, 6954390478268887633L ^ var1), int.class)).intValue();
M.N(var5, var3);
return 1;
}

private static final int a(CommandContext var0) {
long var1 = b ^ 69287925605141L;
long var3 = var1 ^ 119012078913895L;
M.N(j, var3);
return 1;
}

static {
long var14 = b ^ 27667551736319L;
long var16 = var14 ^ 95153927605676L;
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[6];
int var10 = 0;
String var9 = "s¹`¶ù:n\u008f\u0095·\u009cg;\u001fu\u0087ÁhFEK¾\\rn9{ñ\u0019þD÷\u0010Àp\u0004Ä¢\u009d\u0085j\u0088s}Búâ\u0089x\u0010&S×\u0096LãH\u0013ÛÂ±${{ì>\u0010_\u009bÅJrn\u0013ë½\u0086fªö\u0083ÔÚ";
int var11 = "s¹`¶ù:n\u008f\u0095·\u009cg;\u001fu\u0087ÁhFEK¾\\rn9{ñ\u0019þD÷\u0010Àp\u0004Ä¢\u009d\u0085j\u0088s}Búâ\u0089x\u0010&S×\u0096LãH\u0013ÛÂ±${{ì>\u0010_\u009bÅJrn\u0013ë½\u0086fªö\u0083ÔÚ"
.length();
char var8 = ' ';
int var19 = -1;

label37:
while (true) {
String var20 = var9.substring(++var19, var19 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var28;
if ((var19 += var8) >= var11) {
g = var12;
h = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -861562200991680978L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
j = var32;
M = new ae(var16);
return;
}

var8 = var9.charAt(var19);
break;
default:
var12[var10++] = var28;
if ((var19 += var8) < var11) {
var8 = var9.charAt(var19);
continue label37;
}

var9 = "\u0004á«s\u0096PK\u001b\u0006Ù\u008aÒ¦\u0091ó] h\"t?{c¤\u0088¢\u0094uu\búØSB\u0006\bæùË\u0007Ï\u001aZ¦Bf¾\u0013ú";
var11 = "\u0004á«s\u0096PK\u001b\u0006Ù\u008aÒ¦\u0091ó] h\"t?{c¤\u0088¢\u0094uu\búØSB\u0006\bæùË\u0007Ï\u001aZ¦Bf¾\u0013ú".length();
var8 = 16;
var19 = -1;
}

var20 = var9.substring(++var19, var19 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 985;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ae", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = g[var5].getBytes("ISO-8859-1");
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/ae" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
