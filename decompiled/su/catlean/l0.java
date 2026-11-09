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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l0 {
private final int H;
private final int F;
@NotNull
private final List i;
private boolean U;
private static String[] Z;
private static final long a = yz.a(6624608987865561082L, 332482047227653329L, MethodHandles.lookup().lookupClass()).a(81366006196731L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public l0(int x, int z, long a, @NotNull List list, boolean recalc) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(list, a<"z">(28513, 4485777138001254811L ^ ax));
super();
this.H = x;
this.F = z;
this.i = list;
this.U = recalc;
}

public final int i() {
return this.H;
}

public final int Z() {
return this.F;
}

@NotNull
public final List z() {
return this.i;
}

public final boolean M() {
return this.U;
}

public final void J(boolean <set-?>) {
this.U = <set-?>;
}

public final int s() {
return this.H;
}

public final int p() {
return this.F;
}

@NotNull
public final List l() {
return this.i;
}

public final boolean Y() {
return this.U;
}

@NotNull
public final l0 P(int x, byte a, int z, int a, @NotNull List list, boolean recalc, int a) {
long var8 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
long var10 = var8 ^ 104476073124893L;
Intrinsics.checkNotNullParameter(list, a<"z">(3433, 421711422075433291L ^ var8));
return new l0(x, z, var10, list, recalc);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 21085452738001L;
boolean var3 = this.U;
List var4 = this.i;
int var5 = this.F;
int var6 = this.H;
return a<"z">(1284, 1939540788283555498L ^ var1)
+ var6
+ a<"z">(12370, 8786599252928695290L ^ var1)
+ var5
+ a<"z">(27673, 8393386611589961648L ^ var1)
+ var4
+ a<"z">(8161, 1967346414857725006L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 85455050398340L;
int var3 = Integer.hashCode(this.H);
var3 = var3 * b<"a">(17109, 6182944142037289365L ^ var1) + Integer.hashCode(this.F);
var3 = var3 * b<"a">(28123, 9053518620115576472L ^ var1) + this.i.hashCode();
return var3 * b<"a">(28123, 9053518620115576472L ^ var1) + Boolean.hashCode(this.U);
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/l0.a J
// 003: ldc2_w 41301157724369
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 3455744365191486894
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 3404388392079557287
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 3404388392079557287
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/l0
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 3404388392079557287
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 3404388392079557287
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/l0
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/l0.H I
// 065: aload 5
// 067: getfield su/catlean/l0.H I
// 06a: aload 4
// 06c: ifnonnull 0a6
// 06f: if_icmpeq 08b
// 072: goto 07f
// 075: ldc2_w 3404388392079557287
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: bipush 0
// 080: ireturn
// 081: ldc2_w 3404388392079557287
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 0
// 08c: getfield su/catlean/l0.F I
// 08f: aload 4
// 091: ifnonnull 0c1
// 094: aload 5
// 096: getfield su/catlean/l0.F I
// 099: goto 0a6
// 09c: ldc2_w 3404388392079557287
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: if_icmpeq 0b5
// 0a9: bipush 0
// 0aa: ireturn
// 0ab: ldc2_w 3404388392079557287
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: aload 0
// 0b6: getfield su/catlean/l0.i Ljava/util/List;
// 0b9: aload 5
// 0bb: getfield su/catlean/l0.i Ljava/util/List;
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c1: aload 4
// 0c3: ifnonnull 0e6
// 0c6: ifne 0e2
// 0c9: goto 0d6
// 0cc: ldc2_w 3404388392079557287
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: bipush 0
// 0d7: ireturn
// 0d8: ldc2_w 3404388392079557287
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 0
// 0e3: getfield su/catlean/l0.U Z
// 0e6: aload 4
// 0e8: ifnonnull 10d
// 0eb: aload 5
// 0ed: getfield su/catlean/l0.U Z
// 0f0: if_icmpeq 10c
// 0f3: goto 100
// 0f6: ldc2_w 3404388392079557287
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: bipush 0
// 101: ireturn
// 102: ldc2_w 3404388392079557287
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: bipush 1
// 10d: ireturn
}

public static void D(String[] var0) {
Z = var0;
}

public static String[] O() {
return Z;
}

static {
long var20 = a ^ 81349804974721L;
vm.a<"Å">(null, -8222838261974177183L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[6];
int var16 = 0;
String var15 = "Ñù½¸ü\u0013'ÁF\u009aìxÖZÝÎ\u0010É±\u0085ä¨æ,uQÜ\u0088Öó\u000e¦\u001c\u0018ûpÊ\u00926D\u007f\t\u008bá\r£d6¶íä¡\u0091Ëõ\u0004ì®\u0018\u001d÷ T[û<ði\u001f\u001d¹\u0019\u0083ö$[þüYlFÊ,";
int var17 = "Ñù½¸ü\u0013'ÁF\u009aìxÖZÝÎ\u0010É±\u0085ä¨æ,uQÜ\u0088Öó\u000e¦\u001c\u0018ûpÊ\u00926D\u007f\t\u008bá\r£d6¶íä¡\u0091Ëõ\u0004ì®\u0018\u001d÷ T[û<ði\u001f\u001d¹\u0019\u0083ö$[þüYlFÊ,"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "õ\u0005\u0082$\u0011árd2#\u0098ù@ÖÒ!";
int var5 = "õ\u0005\u0082$\u0011árd2#\u0098ù@ÖÒ!".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "º0\u0006Ï\u001dÙ£GO[\u0094\u0095\u000eÚìK";
var5 = "º0\u0006Ï\u001dÙ£GO[\u0094\u0095\u000eÚìK".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "\u00154\u0094#ê\u0099-\u0007\u0096*¦wÚØtØ\u0010®\u0082¸\u0092\u0087tF\u0003O M\u0097³Aç#";
var17 = "\u00154\u0094#ê\u0099-\u0007\u0096*¦wÚØtØ\u0010®\u0082¸\u0092\u0087tF\u0003O M\u0097³Aç#".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18617;
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
throw new RuntimeException("su/catlean/l0", var10);
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
throw new RuntimeException("su/catlean/l0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32514;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/l0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/l0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
