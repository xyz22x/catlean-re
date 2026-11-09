package su.catlean;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cw extends a1 {
private static int I;
private static final long c = yz.a(-3206134455745378555L, -5262085740875104781L, MethodHandles.lookup().lookupClass()).a(23155495641509L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long l;

public cw(@NotNull String id, @NotNull Enum defaultValue, @Nullable h group, long a, @NotNull Function0 visible) {
a = c ^ a;
long var7 = a ^ 54957629176726L;
Intrinsics.checkNotNullParameter(id, b<"e">(28609, 8588653946042582386L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"e">(23283, 3807257467710877767L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"e">(32501, 6160093317690430532L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

@Override
public void P(@NotNull String setting, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: ldc2_w -4949701183071367693
// 03: lload 2
// 04: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09: aload 1
// 0a: sipush 23069
// 0d: ldc2_w 7648306708983548274
// 10: lload 2
// 11: lxor
// 12: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/cw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 1a: astore 4
// 1c: aload 0
// 1d: aload 0
// 1e: invokevirtual su/catlean/cw.h ()Ljava/lang/Object;
// 21: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 24: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
// 27: dup
// 28: sipush 24374
// 2b: ldc2_w 6465045860829367387
// 2e: lload 2
// 2f: lxor
// 30: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/cw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 38: astore 5
// 3a: astore 12
// 3c: bipush 0
// 3d: istore 6
// 3f: bipush 0
// 40: istore 7
// 42: aload 5
// 44: arraylength
// 45: istore 8
// 47: iload 7
// 49: iload 8
// 4b: if_icmpge b2
// 4e: aload 5
// 50: iload 7
// 52: aaload
// 53: astore 9
// 55: aload 9
// 57: checkcast java/lang/Enum
// 5a: astore 10
// 5c: bipush 0
// 5d: istore 11
// 5f: aload 4
// 61: lload 2
// 62: lconst_0
// 63: lcmp
// 64: iflt af
// 67: ifnull ad
// 6a: aload 10
// 6c: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 6f: lload 2
// 70: lconst_0
// 71: lcmp
// 72: iflt b9
// 75: aload 4
// 77: ifnull b9
// 7a: goto 87
// 7d: ldc2_w -5010406692488412930
// 80: lload 2
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: aload 1
// 88: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 8b: ifeq aa
// 8e: goto 9b
// 91: ldc2_w -5010406692488412930
// 94: lload 2
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: aload 9
// 9d: goto b9
// a0: ldc2_w -5010406692488412930
// a3: lload 2
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: iinc 7 1
// ad: aload 4
// af: ifnonnull 47
// b2: lload 2
// b3: lconst_0
// b4: lcmp
// b5: ifle ed
// b8: aconst_null
// b9: aload 12
// bb: swap
// bc: checkcast java/lang/Enum
// bf: aload 4
// c1: ifnull e7
// c4: dup
// c5: ifnonnull ea
// c8: goto d5
// cb: ldc2_w -5010406692488412930
// ce: lload 2
// cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d4: athrow
// d5: pop
// d6: aload 0
// d7: invokevirtual su/catlean/cw.h ()Ljava/lang/Object;
// da: goto e7
// dd: ldc2_w -5010406692488412930
// e0: lload 2
// e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e6: athrow
// e7: checkcast java/lang/Enum
// ea: invokevirtual su/catlean/cw.H (Ljava/lang/Object;)V
// ed: return
}

@NotNull
@Override
public String toString() {
return ((Enum)this.F()).name();
}

private static final boolean g() {
return true;
}

public static void I(int var0) {
I = var0;
}

public static int a() {
return I;
}

public static int Y() {
int var0 = a();

try {
return var0 == 0 ? 4 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = c ^ 24468608152650L;
vm.a<"Å">(69, -2507517052924499845L, var14);
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
String var9 = "Xùèqnt3G òEárf\u0095\u0085\u0010xeÈê¶T\u008d\u00932\u009fõ\u008f¶\u000b¨t(å G\u0086ÔõN£»Ö\u0002@\u0095c\u000bà\u0097tªV\u0083\u0003\bu1¦\byhô±\u008e+ÕÄÚÂZ%?";
int var11 = "Xùèqnt3G òEárf\u0095\u0085\u0010xeÈê¶T\u008d\u00932\u009fõ\u008f¶\u000b¨t(å G\u0086ÔõN£»Ö\u0002@\u0095c\u000bà\u0097tªV\u0083\u0003\bu1¦\byhô±\u008e+ÕÄÚÂZ%?"
.length();
char var8 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
d = var12;
g = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1956916107739965708L;
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
l = var30;
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

var9 = "[\u0000íÖ(¬¾\ns3\u009a;\u00126\u001e\u001d\u0018\u0097¼m;\u0086\u0007Ä\u0093\u008aéCe¨WC\u0012àà\u0080TÁ_\u001eá";
var11 = "[\u0000íÖ(¬¾\ns3\u009a;\u00126\u001e\u001d\u0018\u0097¼m;\u0086\u0007Ä\u0093\u008aéCe¨WC\u0012àà\u0080TÁ_\u001eá".length();
var8 = 16;
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27112;
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
throw new RuntimeException("su/catlean/cw", var10);
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
throw new RuntimeException("su/catlean/cw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
