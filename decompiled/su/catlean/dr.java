package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class dr extends dt {
@NotNull
private final List H;
@NotNull
private final Function1 v;
private static final long d = yz.a(4484864159493499220L, 3951599726281628396L, MethodHandles.lookup().lookupClass()).a(38506403934038L);
private static final String[] o;
private static final String[] q;
private static final Map r = new HashMap(13);

public dr(@NotNull List list, @NotNull Function1 clickAction, short a, long a) {
long var6 = ((long)a << 48 | ax << 16 >>> 16) ^ d;
long var10001 = var6 ^ 136078964668537L;
int var8 = (int)((var6 ^ 136078964668537L) >>> 32);
int var9 = (int)((var6 ^ 136078964668537L) << 32 >>> 40);
int var10 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(list, c<"p">(5108, 2212345201528404993L ^ var6));
Intrinsics.checkNotNullParameter(clickAction, c<"p">(32527, 8327294638916571388L ^ var6));
super(var8, var9, c<"p">(23052, 669134434756900346L ^ var6), (byte)var10);
this.H = list;
this.v = clickAction;
}

@NotNull
public final List n() {
return this.H;
}

@NotNull
public final Function1 u() {
return this.v;
}

@NotNull
@Override
protected List a(long var1) {
class_7922 var10000 = class_7923.field_41178;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41178, c<"p">(32021, 7901087721088737855L ^ var1));
return CollectionsKt.toList((Iterable)var10000);
}

@NotNull
protected String k(long a, @NotNull class_1792 item) {
a = d ^ a;
Intrinsics.checkNotNullParameter(item, c<"p">(23404, 3422953051738709725L ^ a));
String var10000 = item.method_63680().getString();
Intrinsics.checkNotNullExpressionValue(var10000, c<"p">(1133, 6407000217992217050L ^ a));
return var10000;
}

protected boolean Q(long a, @NotNull class_1792 item) {
a = d ^ a;
Intrinsics.checkNotNullParameter(item, c<"p">(23404, 3422880875024631781L ^ a));
return this.H.contains(item);
}

public void b(@NotNull class_332 context, float x, long a, float y, @NotNull class_1792 item) {
a = d ^ a;
Intrinsics.checkNotNullParameter(context, c<"p">(15549, 1139476252797781133L ^ a));
Intrinsics.checkNotNullParameter(item, c<"p">(14125, 3364884482898972443L ^ a));
context.method_51448().pushMatrix();
context.method_51448().translate(x + 8.0F, y);
context.method_51427(item.method_7854(), 0, 0);
context.method_51448().popMatrix();
}

protected void O(@NotNull class_1792 item, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dr.d J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 8188107968003071905
// 09: lload 2
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: sipush 23404
// 13: ldc2_w 3422912336265380301
// 16: lload 2
// 17: lxor
// 18: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/dr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: istore 4
// 22: aload 0
// 23: getfield su/catlean/dr.v Lkotlin/jvm/functions/Function1;
// 26: aload 1
// 27: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 2c: pop
// 2d: aload 0
// 2e: getfield su/catlean/dr.H Ljava/util/List;
// 31: astore 5
// 33: bipush 0
// 34: istore 6
// 36: aload 5
// 38: aload 1
// 39: iload 4
// 3b: ifne 6b
// 3e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 43: ifeq 68
// 46: goto 53
// 49: ldc2_w 8177874475170667514
// 4c: lload 2
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: aload 5
// 55: aload 1
// 56: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
// 5b: goto 70
// 5e: ldc2_w 8177874475170667514
// 61: lload 2
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: aload 5
// 6a: aload 1
// 6b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 70: pop
// 71: return
}

@Override
public String n(long a, Object item) {
long var4 = a ^ 65279083500531L;
return this.k(var4, (class_1792)item);
}

@Override
public boolean O(Object item, long a) {
long var4 = a ^ 49399548081729L;
return this.Q(var4, (class_1792)item);
}

@Override
public void j(class_332 context, float x, float y, long a, Object component) {
long var7 = a ^ 52143984131262L;
this.b(context, x, var7, y, (class_1792)component);
}

@Override
public void v(Object item, long a) {
long var4 = a ^ 103613740616024L;
this.O((class_1792)item, var4);
}

static {
long var0 = d ^ 2911767454843L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[8];
int var7 = 0;
String var6 = "Ñå¤\u0096LDr^3ì:óÐÂÀ\u0017\u0010\u0086:Îï´ÛÀt\u001a\u0098\u0000.\u0099sÉ^ ª\u0080óZÝ\u0080\u00941['\u008fR\nü¡\u009c\u0006m\u0097]:{sOt|;\u0083\u009f\u0096\n\u0005\u0010déc\u0005\u0083Þ*@¨¼\u0095ê¾Æ\u0082;\u0010,pqç¸óU\u0012p#tJRú_F\u0010:/\u008b{-SoÚè\u0082z\u000ev»: ";
int var8 = "Ñå¤\u0096LDr^3ì:óÐÂÀ\u0017\u0010\u0086:Îï´ÛÀt\u001a\u0098\u0000.\u0099sÉ^ ª\u0080óZÝ\u0080\u00941['\u008fR\nü¡\u009c\u0006m\u0097]:{sOt|;\u0083\u009f\u0096\n\u0005\u0010déc\u0005\u0083Þ*@¨¼\u0095ê¾Æ\u0082;\u0010,pqç¸óU\u0012p#tJRú_F\u0010:/\u008b{-SoÚè\u0082z\u000ev»: "
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = c(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
o = var9;
q = new String[8];
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

var6 = "j\u0007§Ñ$\u0082ko\u0093ø°íi?\u008dL\u00adæØ5\u0017H\u0019¢\u0098HËw\u009fÛAD\u0018\u0006\u0002s[ÐT0W\u008bD2Ô\u0099q\u0089<¡]näÃÙa¾";
var8 = "j\u0007§Ñ$\u0082ko\u0093ø°íi?\u008dL\u00adæØ5\u0017H\u0019¢\u0098HËw\u009fÛAD\u0018\u0006\u0002s[ÐT0W\u008bD2Ô\u0099q\u0089<¡]näÃÙa¾".length();
var5 = ' ';
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10963;
if (q[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])r.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
r.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/dr", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = o[var5].getBytes("ISO-8859-1");
q[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return q[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/dr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
