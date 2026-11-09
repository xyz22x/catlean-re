package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import net.minecraft.class_2248;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class az extends a1 {
private static boolean V;
private static final long c = yz.a(6098716356791051978L, 9032995278210375532L, MethodHandles.lookup().lookupClass()).a(243275797860609L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

public az(@NotNull String id, @NotNull dg defaultValue, long a, @Nullable h group, @NotNull Function0 visible) {
a = c ^ a;
long var7 = a ^ 130762460222044L;
Intrinsics.checkNotNullParameter(id, b<"l">(21016, 2662777442979258571L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"l">(14945, 2188904145545840816L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"l">(31864, 5947548853263732397L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

public az(String var1, dg var2, h var3, long var4, Function0 var6, int var7, DefaultConstructorMarker var8) {
var4 = c ^ var4;
long var9 = var4 ^ 85597570231343L;
if ((var7 & 4) != 0) {
var3 = null;
}

if ((var7 & d<"z">(24383, 5858758564056170586L ^ var4)) != 0) {
var6 = az::T;
}

this(var1, var2, var9, var3, var6);
}

@Override
public void P(@NotNull String setting, long a) {
long var4 = a ^ 45093887485344L;
Intrinsics.checkNotNullParameter(setting, b<"l">(5603, 2591233510315783972L ^ a));
int[] var10000 = vm.a<"Å">(-4949701183071367693L, a);
Json var7 = a1.G.C();
boolean var9 = false;
var7.getSerializersModule();
Iterable var30 = var7.decodeFromString(new ArrayListSerializer<>(StringSerializer.INSTANCE), setting);
boolean var8 = false;
int[] var6 = var10000;
var var10 = new ArrayList();
boolean var11 = false;
boolean var13 = false;
Iterator var14 = var30.iterator();

while (true) {
if (var14.hasNext()) {
Object var15 = var14.next();
boolean var17 = false;
String var18 = (String)var15;
boolean var19 = false;
class_7922 var31 = class_7923.field_41175;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41175, b<"l">(26178, 2469892691567805575L ^ a));
Iterable var20 = (Iterable)var31;
boolean var21 = false;
if (var6 == null) {
break;
}

Iterator var22 = var20.iterator();

label47:
while (true) {
if (!var22.hasNext()) {
var10000 = null;
break;
}

var10000 = (int[])var22.next();

while (true) {
Object var23 = var10000;
var10000 = (int[])var23;

while (true) {
class_2248 var24 = (class_2248)var10000;
boolean var25 = false;
if (!Intrinsics.areEqual(var24.method_63499(), var18)) {
continue label47;
}

var10000 = (int[])var23;
if (a <= 0L) {
break;
}

if (var6 != null) {
break label47;
}
}
}
}

class_2248 var33 = (class_2248)var10000;
if ((class_2248)var10000 != null) {
class_2248 var26 = var33;
boolean var27 = false;
var10.add(var26);
}

if (var6 != null) {
continue;
}
}

if (a >= 0L) {
}
break;
}

List var29 = CollectionsKt.toMutableList(var10);
this.H(new dg(var29, var4));
if (vm.a<"Å">(-4911502081667193529L, a) != null) {
vm.a<"Å">(new int[2], -4968850478410699390L, a);
}
}

@NotNull
@Override
public String toString() {
long var1 = c ^ 133307215855158L;
int[] var10000 = vm.a<"Å">(-6934018058537113223L, var1);
Json var4 = a1.G.C();
Iterable var5 = ((dg)this.F()).e();
boolean var6 = false;
Collection var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, d<"z">(30860, 3339284609917050723L ^ var1)));
int[] var3 = var10000;
boolean var9 = false;
Iterator var10 = var5.iterator();

while (true) {
if (var10.hasNext()) {
Object var11 = var10.next();
var17 = var8;
class_2248 var12 = (class_2248)var11;
if (var3 == null) {
break;
}

boolean var13 = false;
var8.add(var12.method_63499());
if (var3 != null) {
continue;
}
}

var17 = var8;
break;
}

List var15 = (List)var17;
var6 = false;
var4.getSerializersModule();
return var4.encodeToString(new ArrayListSerializer<>(StringSerializer.INSTANCE), var15);
}

private static final boolean T() {
return true;
}

public static void m(boolean var0) {
V = var0;
}

public static boolean a() {
return V;
}

public static boolean H() {
boolean var0 = a();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = c ^ 74356430924528L;
vm.a<"Å">(false, 5408989799196204132L, var20);
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
String var15 = "l½\u0011ª%!½\u008a²:hs\u0092\u001e.·J\\\u0016\u0014m\u000e¾\u001dK\u009a\u009bë\u0082Íß¾\u0010\u0097o¨Øñ³\u0090\u0084/Ò\u0013£^uÞK\u0010\u0018Ï5À_½U\u001cöIÏ\u000bY7*\u0099";
int var17 = "l½\u0011ª%!½\u008a²:hs\u0092\u001e.·J\\\u0016\u0014m\u000e¾\u001dK\u009a\u009bë\u0082Íß¾\u0010\u0097o¨Øñ³\u0090\u0084/Ò\u0013£^uÞK\u0010\u0018Ï5À_½U\u001cöIÏ\u000bY7*\u0099"
.length();
char var14 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
d = var18;
g = new String[5];
n = new HashMap(13);
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
String var4 = "X\u0016H<÷\u001c9ô«\u0012A\\\u000fkè2";
int var5 = "X\u0016H<÷\u001c9ô«\u0012A\\\u000fkè2".length();
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

l = var6;
m = new Integer[2];
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

var15 = "\u0000\u0094ù£Ï(\u0085´«T\u0005òd\u009d\u0018\u0014\u0010+ÖZVi\u0090V\u0084\u001fÌ/kÚ!=\u000e";
var17 = "\u0000\u0094ù£Ï(\u0085´«T\u0005òd\u009d\u0018\u0014\u0010+ÖZVi\u0090V\u0084\u001fÌ/kÚ!=\u000e".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22595;
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
throw new RuntimeException("su/catlean/az", var10);
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
throw new RuntimeException("su/catlean/az" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14818;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/az", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/az" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
