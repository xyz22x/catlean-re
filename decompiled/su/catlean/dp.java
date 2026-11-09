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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class dp extends dt {
@NotNull
private final a1 s;
private static final long d = yz.a(-8632702415593481019L, 3831179648269467186L, MethodHandles.lookup().lookupClass()).a(92361440263941L);
private static final String[] o;
private static final String[] q;
private static final Map r = new HashMap(13);

public dp(@NotNull a1 setting, long a) {
a = d ^ a;
long var10001 = a ^ 109865850533469L;
int var4 = (int)((a ^ 109865850533469L) >>> 32);
int var5 = (int)((a ^ 109865850533469L) << 32 >>> 40);
int var6 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(setting, c<"j">(21355, 5657583585141246017L ^ a));
super(var4, var5, c<"j">(3300, 4237963031964391375L ^ a), (byte)var6);
this.s = setting;
}

@NotNull
public final a1 n() {
return this.s;
}

@NotNull
@Override
protected List a(long var1) {
List var3 = new ArrayList();
Collection var10000 = var3;
class_7922 var10001 = class_7923.field_41175;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41175, c<"j">(22610, 2588749750499736961L ^ var1));
CollectionsKt.addAll(var10000, (Iterable)var10001);
var3.remove(class_2246.field_10124);
Iterable var4 = var3;
boolean var5 = false;
CollectionsKt.sortedWith(var4, new q());
return var3;
}

@NotNull
protected String a(@NotNull class_2248 item, long a) {
a = d ^ a;
Intrinsics.checkNotNullParameter(item, c<"j">(22076, 834703210093760144L ^ a));
String var10000 = item.method_9518().getString();
Intrinsics.checkNotNullExpressionValue(var10000, c<"j">(16279, 335564226107844412L ^ a));
return var10000;
}

protected boolean j(short a, int a, short a, @NotNull class_2248 item) {
long var5 = ((long)a << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ d;
Intrinsics.checkNotNullParameter(item, c<"j">(22076, 834695658280716376L ^ var5));
return ((dg)this.s.F()).e().contains(item);
}

public void c(@NotNull class_332 context, float x, float y, int a, short a, @NotNull class_2248 block, int a) {
long var8 = ((long)a << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ d;
Intrinsics.checkNotNullParameter(context, c<"j">(92, 8521576591074619161L ^ var8));
Intrinsics.checkNotNullParameter(block, c<"j">(10664, 2226623374868367087L ^ var8));
context.method_51448().pushMatrix();
context.method_51448().translate(x + 8.0F, y);
context.method_51427(block.method_8389().method_7854(), 0, 0);
context.method_51448().popMatrix();
}

protected void z(long a, @NotNull class_2248 item) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dp.d J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: aload 3
// 07: sipush 25165
// 0a: ldc2_w 5796904821762076005
// 0d: lload 1
// 0e: lxor
// 0f: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/dp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: ldc2_w -2389397522718134060
// 1a: lload 1
// 1b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: aload 0
// 21: getfield su/catlean/dp.s Lsu/catlean/a1;
// 24: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 27: checkcast su/catlean/dg
// 2a: invokevirtual su/catlean/dg.e ()Ljava/util/List;
// 2d: astore 5
// 2f: bipush 0
// 30: istore 6
// 32: istore 4
// 34: aload 5
// 36: aload 3
// 37: iload 4
// 39: ifne 69
// 3c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 41: ifeq 66
// 44: goto 51
// 47: ldc2_w -2397295401231545226
// 4a: lload 1
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: aload 5
// 53: aload 3
// 54: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
// 59: goto 6e
// 5c: ldc2_w -2397295401231545226
// 5f: lload 1
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: aload 5
// 68: aload 3
// 69: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 6e: pop
// 6f: return
}

@Override
public String n(long a, Object item) {
long var4 = a ^ 5115181560600L;
return this.a((class_2248)item, var4);
}

@Override
public boolean O(Object item, long a) {
long var10001 = a ^ 83392101042522L;
int var4 = (int)((a ^ 83392101042522L) >>> 48);
int var5 = (int)((a ^ 83392101042522L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
return this.j((short)var4, var5, (short)var6, (class_2248)item);
}

@Override
public void j(class_332 context, float x, float y, long a, Object component) {
long var10001 = a ^ 93427562403384L;
int var7 = (int)((a ^ 93427562403384L) >>> 32);
int var8 = (int)((a ^ 93427562403384L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
this.c(context, x, y, var7, (short)var8, (class_2248)component, var9);
}

@Override
public void v(Object item, long a) {
long var4 = a ^ 119614146666790L;
this.z(var4, (class_2248)item);
}

static {
long var0 = d ^ 18464682235336L;
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
String var6 = ",8¾\u0089\u0016\\\\'\u008bsóf{\u009f'\u008c\u0010\u008b&_è\u0085\u0089o¥\u001fål|\u0087v\u0083\u0090 \u0094)\u0087Æ\u0000\u000e\u0006l\foÄï¯<F\tvf\u009eõ\u009drG$Îï,ÒÍ4\u0093?\u0010Ýb;kÓÚ\u00937\u0086¢ª\u009a\u001d%\u0016ñ\u0010°B\u0000ÀTzJ~Æ\u0093H6R8~²\u0010\u0098ÐÆs\u0013¤î¬\u0003FÒr\u0015\u0007g\u0086";
int var8 = ",8¾\u0089\u0016\\\\'\u008bsóf{\u009f'\u008c\u0010\u008b&_è\u0085\u0089o¥\u001fål|\u0087v\u0083\u0090 \u0094)\u0087Æ\u0000\u000e\u0006l\foÄï¯<F\tvf\u009eõ\u009drG$Îï,ÒÍ4\u0093?\u0010Ýb;kÓÚ\u00937\u0086¢ª\u009a\u001d%\u0016ñ\u0010°B\u0000ÀTzJ~Æ\u0093H6R8~²\u0010\u0098ÐÆs\u0013¤î¬\u0003FÒr\u0015\u0007g\u0086"
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

var6 = "îÝ°ô8«\u0095/&\u008e\t;í\nQYu\u0083\u0006I\u001a©Ç7¤\u0086¿[ïÔ Q\u0010vE\u0010)\u0089Ü\u008aÙ4µ\u0017\u008b©e\u008bÃ";
var8 = "îÝ°ô8«\u0095/&\u008e\t;í\nQYu\u0083\u0006I\u001a©Ç7¤\u0086¿[ïÔ Q\u0010vE\u0010)\u0089Ü\u008aÙ4µ\u0017\u008b©e\u008bÃ".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4139;
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
throw new RuntimeException("su/catlean/dp", var10);
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
throw new RuntimeException("su/catlean/dp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
