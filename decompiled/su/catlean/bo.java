package su.catlean;

import com.google.common.collect.Lists;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class bo implements ym {
@NotNull
public static final bo S;
@NotNull
private static AtomicBoolean u;
@NotNull
private static ExecutorService D;
@NotNull
private static List H;
private static boolean U;
private static final long a = yz.a(1694520301718390403L, 8890729676895669104L, MethodHandles.lookup().lookupClass()).a(177800358160334L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private bo() {
}

@NotNull
public final AtomicBoolean Z() {
return u;
}

public final void M(int a, @NotNull AtomicBoolean <set-?>, int a, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"j">(20958, 1495725736828243487L ^ var5));
u = <set-?>;
}

@NotNull
public final ExecutorService Y() {
return D;
}

public final void k(long a, @NotNull ExecutorService <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"j">(30239, 6982233480313764606L ^ ax));
D = <set-?>;
}

@NotNull
public final List b() {
return H;
}

public final void s(@NotNull List <set-?>, int a, int a, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"j">(20958, 1495656051674403324L ^ var5));
H = <set-?>;
}

@Flow(
priority = 20
)
private final void o(TickEvent var1) {
u.set(true);
}

@Flow(
priority = -20
)
private final void D(PostTickEvent var1) {
u.set(false);
}

public final boolean R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bo.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 137179598926387
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 7949212381466476765
// 11: lload 1
// 12: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: istore 5
// 19: lload 3
// 1a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1d: invokevirtual net/minecraft/class_310.method_18854 ()Z
// 20: iload 5
// 22: ifeq 5e
// 25: ifne 5d
// 28: goto 35
// 2b: ldc2_w 7942484239635455768
// 2e: lload 1
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: getstatic su/catlean/bo.u Ljava/util/concurrent/atomic/AtomicBoolean;
// 38: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 3b: iload 5
// 3d: ifeq 5e
// 40: goto 4d
// 43: ldc2_w 7942484239635455768
// 46: lload 1
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: ifne 61
// 50: goto 5d
// 53: ldc2_w 7942484239635455768
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: bipush 1
// 5e: goto 62
// 61: bipush 0
// 62: ireturn
}

@Flow(
priority = 20
)
public final void A(@NotNull PlayerUpdateEvent e) {
long var2 = a ^ 24768536675790L;
long var4 = var2 ^ 93871785803397L;
Intrinsics.checkNotNullParameter(e, "e");
ArrayList var10000 = Lists.newArrayList(zf.z(var4).method_18456());
Intrinsics.checkNotNullExpressionValue(var10000, a<"j">(10954, 553664994632928631L ^ var2));
H = var10000;
}

public final void i(int a, short a, int delay, @NotNull Function0 runnable, short a) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(runnable, a<"j">(3552, 6759749558298930642L ^ var6));
boolean var8 = false;
this.Y().execute(new c(delay, runnable));
}

public static void J(bo var0, long var1, int var3, Function0 var4, int var5, Object var6) {
var1 = a ^ var1;
byte var7 = vm.a<"Å">(-3976903044339037696L, var1);

label37: {
label36: {
try {
int var10000 = var5 & 1;
if (var7 != 0) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -3935504576157403069L, var1);
}

var3 = 0;
}

Intrinsics.checkNotNullParameter(var4, a<"j">(14372, 6868697757847569654L ^ var1));
boolean var11 = false;
}

try {
var0.Y().execute(new c(var3, var4));
byte var12 = var7;
if (var1 > 0L) {
if (var7 == 0) {
return;
}

var12 = 4;
}

vm.a<"Å">(new _g[var12], -3961250983983660229L, var1);
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -3935504576157403069L, var1);
}
}

static {
long var9 = a ^ 137244189963026L;
vm.a<"Å">(false, -6594724597908482041L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[6];
int var5 = 0;
String var4 = "\u001doÑ¡÷\b Çqß¤Á¨¹\fµ\u001cß.@n\u008eÛ7.ø\u0092½=è;\u0003\u0091«¡«\u0085sÃ|r\u0086®2\u0010×Õ¤\u0082¢Þ\u0081Ï WUÝ\u0099RÝf}`T(g\u0014¡äÚ7\u001cGî+o¼2×/F\u0017=:ÞÄ\\#¦\u0092ü×VOIjd2t~Åy\u0003\u001cÖ Â5[Äñ'5_,\f\fS\u008fAVÓ¨Z\bª¯Qá^\u008aqÐG§=S9\u0010E)c4*Gï¼\u0080-$\u0011»×¢Ò";
int var6 = "\u001doÑ¡÷\b Çqß¤Á¨¹\fµ\u001cß.@n\u008eÛ7.ø\u0092½=è;\u0003\u0091«¡«\u0085sÃ|r\u0086®2\u0010×Õ¤\u0082¢Þ\u0081Ï WUÝ\u0099RÝf}`T(g\u0014¡äÚ7\u001cGî+o¼2×/F\u0017=:ÞÄ\\#¦\u0092ü×VOIjd2t~Åy\u0003\u001cÖ Â5[Äñ'5_,\f\fS\u008fAVÓ¨Z\bª¯Qá^\u008aqÐG§=S9\u0010E)c4*Gï¼\u0080-$\u0011»×¢Ò"
.length();
char var3 = '@';
int var12 = -1;

label27:
while (true) {
String var13 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var12 += var3) >= var6) {
b = var7;
c = new String[6];
S = new bo();
u = new AtomicBoolean(false);
ExecutorService var15 = Executors.newVirtualThreadPerTaskExecutor();
Intrinsics.checkNotNullExpressionValue(var15, a<"j">(27212, 1020755771066481452L ^ var9));
D = var15;
H = CollectionsKt.emptyList();
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var20;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "ç\u0094sÈ\u0091Î\u001cî?Èêw4µæÿ lçN3ðêÒO>\b9\u0085\u001d¿K¤Þ}\u001fÂ\u0019¯\u001f\u0082\u009a\u009a\t\u0086y«¨!";
var6 = "ç\u0094sÈ\u0091Î\u001cî?Èêw4µæÿ lçN3ðêÒO>\b9\u0085\u001d¿K¤Þ}\u001fÂ\u0019¯\u001f\u0082\u009a\u009a\t\u0086y«¨!".length();
var3 = 16;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

public static void b(boolean var0) {
U = var0;
}

public static boolean S() {
return U;
}

public static boolean t() {
boolean var0 = S();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13553;
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
throw new RuntimeException("su/catlean/bo", var10);
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
throw new RuntimeException("su/catlean/bo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
