package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class p7 extends gf {
@NotNull
public static final p7 b;
@NotNull
private static final cq n;
private static final long a = yz.a(747417204174583001L, -3591388567823944706L, MethodHandles.lookup().lookupClass()).a(233256666860436L);
private static final String[] c;
private static final String[] f;
private static final Map g = new HashMap(13);

private p7(int var1, short var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var10001 = var4 ^ 71810928868541L;
int var6 = (int)((var4 ^ 71810928868541L) >>> 48);
int var7 = (int)((var4 ^ 71810928868541L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"i">(25217, 7318292896010249344L ^ var4), (char)var8);
}

private final boolean W(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 133610876093269L;
return (Boolean)n.E(this, var6, Q[0]);
}

@Override
public void h(long a, @NotNull class_332 context) {
long var10001 = ax ^ 86294490406460L;
int var4 = (int)((ax ^ 86294490406460L) >>> 48);
int var5 = (int)((ax ^ 86294490406460L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = ax ^ 116853176505585L;
var10001 = ax ^ 28405077213452L;
int var9 = (int)((ax ^ 28405077213452L) >>> 48);
int var10 = (int)((ax ^ 28405077213452L) << 16 >>> 48);
int var11 = (int)(var10001 << 32 >>> 32);
long var12 = ax ^ 95236895637490L;
boolean var10000 = vm.a<"Å">(-5990705277528627281L, ax);
Intrinsics.checkNotNullParameter(context, b<"i">(3023, 1301936128889837208L ^ ax));
boolean var14 = var10000;

label24: {
label28: {
try {
if (var14 && !this.W((char)var4, var5, (char)var6)) {
break label28;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -6022023423380325186L, ax);
}

String var16 = b<"i">(30310, 8706127278633659199L ^ ax);
Object[] var17 = new Object[]{(float)Math.rint(this.y((short)var9, (short)var10, var11) * tq.I.C()) * 0.1};
String var21 = String.format(var16, Arrays.copyOf(var17, var17.length));
Intrinsics.checkNotNullExpressionValue(var21, b<"i">(6871, 8218580168692025226L ^ ax));
var22 = var21 + b<"i">(24483, 2783852342651552507L ^ ax);
break label24;
}

String var19 = b<"i">(21385, 5960393080136535767L ^ ax);
Object[] var20 = new Object[]{(float)Math.rint(this.j(var12) * tq.I.C()) * 0.1};
String var23 = String.format(var19, Arrays.copyOf(var20, var20.length));
Intrinsics.checkNotNullExpressionValue(var23, b<"i">(8196, 1849357493072985426L ^ ax));
var22 = var23 + b<"i">(18759, 7959310330330977304L ^ ax);
}

String var15 = var22;
this.X(context, var7, var15);
}

private final float j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 31688697773552L;

try {
if (zf.v(var3).method_6128()) {
return dm.h.H() * 720.0F;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3429780157250404170L, var1);
}

return dm.h.r() * 720.0F;
}

private final float y(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 91919183905550L;

try {
if (zf.v(var6).method_6128()) {
return dm.h.H() * 200.0F;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -3357634002263801420L, var4);
}

return dm.h.r() * 200.0F;
}

static {
long var16 = a ^ 134988706649829L;
long var18 = var16 ^ 116300354432049L;
long var10001 = var16 ^ 106815111962835L;
int var20 = (int)((var16 ^ 106815111962835L) >>> 32);
int var21 = (int)((var16 ^ 106815111962835L) << 32 >>> 48);
int var22 = (int)(var10001 << 48 >>> 48);
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[11];
int var12 = 0;
String var11 = "ÛÃE1\u0092Ð£\\\u0004\u009d¯eG\u0015þ \u0010\"\u0088\u0013Ä%\u0081Æð¦c¢\u00125ÕBã \u00ad¶îWõ\u009c1ºn\u0085\u009e\u0004è»¦¶\u0007W°àãY\u000b®Å9*\u008fäµ\u0089< ÖÏÜý\u0011\u0014Óî\u0005æ\u0012¢ú\u0096\u009f÷»_É\u0001\u009bêuKH\u0016ûàÃ\bn\u0099\u0010TÃ²)Xöñëñøvd7÷\u009fÍ\u0010÷Õvw/ÑwvÿËÀ\u001c:IC\"\u0010\u001aúæò7Aöà²%ÊV\u0091±Éª\u00103¦ùzÿi¡»\u0089û\u001fEÚ|]H\u0010|\tP\u001dç¿\u009fÔ÷\u001bëç\u0018ãç\u0000";
int var13 = "ÛÃE1\u0092Ð£\\\u0004\u009d¯eG\u0015þ \u0010\"\u0088\u0013Ä%\u0081Æð¦c¢\u00125ÕBã \u00ad¶îWõ\u009c1ºn\u0085\u009e\u0004è»¦¶\u0007W°àãY\u000b®Å9*\u008fäµ\u0089< ÖÏÜý\u0011\u0014Óî\u0005æ\u0012¢ú\u0096\u009f÷»_É\u0001\u009bêuKH\u0016ûàÃ\bn\u0099\u0010TÃ²)Xöñëñøvd7÷\u009fÍ\u0010÷Õvw/ÑwvÿËÀ\u001c:IC\"\u0010\u001aúæò7Aöà²%ÊV\u0091±Éª\u00103¦ùzÿi¡»\u0089û\u001fEÚ|]H\u0010|\tP\u001dç¿\u009fÔ÷\u001bëç\u0018ãç\u0000"
.length();
char var10 = 16;
int var25 = -1;

label37:
while (true) {
String var26 = var11.substring(++var25, var25 + var10);
byte var29 = -1;

while (true) {
byte[] var15 = var7.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = b(var15).intern();
switch (var29) {
case 0:
var14[var12++] = var35;
if ((var25 += var10) >= var13) {
c = var14;
f = new String[11];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -2625455408054189885L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var39 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var33 = -1;
long var0 = var39;
KProperty[] var23 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(p7.class, b<"i">(12789, 5845717957622868774L ^ var16), b<"i">(22650, 462667261621093031L ^ var16), 0))
};
Q = var23;
b = new p7(var20, (short)var21, var22);
n = yp.t(b, b<"i">(5102, 2956489873743677756L ^ var16), false, var18, null, null, (int)var0, null);
return;
}

var10 = var11.charAt(var25);
break;
default:
var14[var12++] = var35;
if ((var25 += var10) < var13) {
var10 = var11.charAt(var25);
continue label37;
}

var11 = "±Õö÷c\tM\u0091X\u008aA_\u000e\u0088ÍÆçº y\u009d*×÷ \u001e\u0006È\u0095ÐU- °¼q!\u008e®\u0003ùö£Zxî¯t\u0007Ü\u0089\rüò\u0096\u001e{\u0081ú\u00985æ)Lô";
var13 = "±Õö÷c\tM\u0091X\u008aA_\u000e\u0088ÍÆçº y\u009d*×÷ \u001e\u0006È\u0095ÐU- °¼q!\u008e®\u0003ùö£Zxî¯t\u0007Ü\u0089\rüò\u0096\u001e{\u0081ú\u00985æ)Lô"
.length();
var10 = ' ';
var25 = -1;
}

var26 = var11.substring(++var25, var25 + var10);
var29 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28724;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/p7", var10);
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
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/p7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
