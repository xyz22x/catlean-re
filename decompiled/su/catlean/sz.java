package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import net.minecraft.class_1657;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;

public final class sz {
@NotNull
public static final sz D;
@NotNull
private static final Map t;
private static String A;
private static final long a = yz.a(-7121557786601803158L, -5886729597098733288L, MethodHandles.lookup().lookupClass()).a(6028895574914L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private sz() {
}

@NotNull
public final Map W() {
return t;
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
// $VF: Irreducible bytecode was duplicated to produce valid code
public final void q(int a, int a, char a, int samples) {
long var5 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 22445942580578L;
long var9 = var5 ^ 53961412512556L;
String var10000 = vm.a<"Å">(-3946386766580777419L, var5);
List var10001 = zf.z(var7).method_18456();
Intrinsics.checkNotNullExpressionValue(var10001, a<"y">(17430, 1378225726184954848L ^ var5));
Iterable var12 = var10001;
boolean var13 = false;
Iterator var14 = var12.iterator();
String var11 = var10000;

label60:
while (var14.hasNext()) {
Object var15 = var14.next();
class_742 var16 = (class_742)var15;
boolean var17 = false;

try {
sz var30 = D;
Intrinsics.checkNotNull(var16);
var30.p(var9, (class_1657)var16, samples);
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -3948561148288443710L, var5);
}

do {
try {
var10000 = var11;
if (axxx > 0) {
if (var11 != null) {
break label60;
}

var10000 = var11;
}

if (var10000 == null) {
continue label60;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -3948561148288443710L, var5);
}
} while (ax <= 0);

vm.a<"Å">(new _g[4], -3923307036537666640L, var5);
break;
}

List var32 = zf.z(var7).method_18456();
Intrinsics.checkNotNullExpressionValue(var32, a<"y">(32629, 5314954315284717696L ^ var5));
Iterable var26 = var32;
boolean var27 = false;
Collection var28 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var26, (int)e));
boolean var29 = false;
Iterator var18 = var26.iterator();

label40:
while (true) {
if (var18.hasNext()) {
var10000 = (String)var18.next();
} else {
var10000 = var28;
if (axx > 0) {
break;
}
}

while (true) {
Object var19 = var10000;
var10000 = var28;
class_742 var20 = (class_742)var19;
if (var11 != null) {
break label40;
}

boolean var21 = false;
var28.add(var20.method_5628());
if (var11 == null) {
break;
}

var10000 = var28;
if (axx > 0) {
break label40;
}
}
}

List var25 = (List)var10000;
t.keySet().removeIf(sz::Z);
}

private final void p(long param1, class_1657 param3, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
//   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
//
// Bytecode:
// 00: getstatic su/catlean/sz.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 371995293704106535
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: getstatic su/catlean/sz.t Ljava/util/Map;
// 12: aload 3
// 13: invokevirtual net/minecraft/class_1657.method_5628 ()I
// 16: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 19: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/sz.N (Ljava/lang/Integer;)Ljava/util/ArrayDeque;, (Ljava/lang/Integer;)Ljava/util/ArrayDeque; ]
// 1e: invokedynamic apply (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/sz.E (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/ArrayDeque;, (Ljava/lang/Object;)Ljava/util/ArrayDeque; ]
// 23: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
// 28: dup
// 29: sipush 22969
// 2c: ldc2_w 5010810085517871708
// 2f: lload 1
// 30: lxor
// 31: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/sz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 39: checkcast java/util/ArrayDeque
// 3c: astore 6
// 3e: astore 5
// 40: aload 6
// 42: aload 3
// 43: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 46: dconst_0
// 47: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
// 4a: invokevirtual java/util/ArrayDeque.addLast (Ljava/lang/Object;)V
// 4d: aload 6
// 4f: invokevirtual java/util/ArrayDeque.size ()I
// 52: iload 4
// 54: if_icmple 62
// 57: aload 6
// 59: invokevirtual java/util/ArrayDeque.removeFirst ()Ljava/lang/Object;
// 5c: pop
// 5d: aload 5
// 5f: ifnull 4d
// 62: lload 1
// 63: lconst_0
// 64: lcmp
// 65: ifle 5d
// 68: return
}

private static final boolean n(List var0, Integer var1) {
long var2 = a ^ 49862253898994L;
String var10000 = vm.a<"Å">(-6170598909854343853L, var2);
Intrinsics.checkNotNullParameter(var1, a<"y">(14711, 7139844376614340069L ^ var2));
String var4 = var10000;

try {
boolean var6 = var0.contains(var1);
if (var4 != null) {
return var6;
}

if (!var6) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -6172787645848634972L, var2);
}

return false;
}

private static final boolean Z(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final ArrayDeque N(Integer var0) {
long var1 = a ^ 18410146735728L;
Intrinsics.checkNotNullParameter(var0, a<"y">(1491, 3496074530041951175L ^ var1));
return new ArrayDeque();
}

private static final ArrayDeque E(Function1 var0, Object var1) {
return (ArrayDeque)var0.invoke(var1);
}

static {
long var14 = a ^ 4973784812099L;
vm.a<"Å">(null, -8347566853300863943L, var14);
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
String var9 = "GÐFEÒy¬óÐ³Ú\u0019\u0081Ð\n\" ½¾w\u001e\u0099C\rï,ïÝ\u0015¡N~Bããþ\u0080M\u0016Þj\u000bå2d\u0099\u008e\u001bÊ R5\u0083#\u0014«Wzîûå»·\u0004+µ~ÄÌ\u0099¨¯_¹Gßª\u007fv\u0012\u0082í";
int var11 = "GÐFEÒy¬óÐ³Ú\u0019\u0081Ð\n\" ½¾w\u001e\u0099C\rï,ïÝ\u0015¡N~Bããþ\u0080M\u0016Þj\u000bå2d\u0099\u008e\u001bÊ R5\u0083#\u0014«Wzîûå»·\u0004+µ~ÄÌ\u0099¨¯_¹Gßª\u007fv\u0012\u0082í"
.length();
char var8 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
b = var12;
c = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -5726989596321704622L;
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
e = var30;
D = new sz();
t = new LinkedHashMap();
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

var9 = "¦\u0091$\u0090ýH§\u0000}íÐýk[öÜ&\u0010åº\u0085Üéyx¶\u0011P*\u0006Êa|\bHùÀÄ³4 _Ý°\u0005\nõ(\u008d\u0094\"híe½bXãYË\u0095»\u0086£d×\u0013¬zw¹\u0011\u0013";
var11 = "¦\u0091$\u0090ýH§\u0000}íÐýk[öÜ&\u0010åº\u0085Üéyx¶\u0011P*\u0006Êa|\bHùÀÄ³4 _Ý°\u0005\nõ(\u008d\u0094\"híe½bXãYË\u0095»\u0086£d×\u0013¬zw¹\u0011\u0013"
.length();
var8 = '(';
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
var10001 = 0;
}
}
}

public static void r(String var0) {
A = var0;
}

public static String A() {
return A;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5982;
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
throw new RuntimeException("su/catlean/sz", var10);
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
throw new RuntimeException("su/catlean/sz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
