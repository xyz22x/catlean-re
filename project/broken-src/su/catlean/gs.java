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

public final class gs {
private final float i;
@NotNull
private final String G;
@NotNull
private final fd Q;
@NotNull
private final Function0 X;
private static final long a = yz.a(410891623563466015L, -4486445242273999987L, MethodHandles.lookup().lookupClass()).a(7440197830492L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public gs(float x, @NotNull String name, @NotNull fd animation, short a, @NotNull Function0 action, int a, short a) {
long var8 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(name, a<"n">(12080, 3968952810459231601L ^ var8));
Intrinsics.checkNotNullParameter(animation, a<"n">(14536, 4548630422960300675L ^ var8));
Intrinsics.checkNotNullParameter(action, a<"n">(23712, 4569655128142022376L ^ var8));
super();
this.i = x;
this.G = name;
this.Q = animation;
this.X = action;
}

public final float u() {
return this.i;
}

@NotNull
public final String V() {
return this.G;
}

@NotNull
public final fd S() {
return this.Q;
}

@NotNull
public final Function0 f() {
return this.X;
}

public final float g() {
return this.i;
}

@NotNull
public final String E() {
return this.G;
}

@NotNull
public final fd t() {
return this.Q;
}

@NotNull
public final Function0 x() {
return this.X;
}

@NotNull
public final gs H(float x, long a, @NotNull String name, @NotNull fd animation, @NotNull Function0 action) {
ax = a ^ ax;
long var10001 = ax ^ 47831015552197L;
int var7 = (int)((ax ^ 47831015552197L) >>> 48);
int var8 = (int)((ax ^ 47831015552197L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(name, a<"n">(16996, 7036756855547223690L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"n">(31963, 8813815217791328308L ^ ax));
Intrinsics.checkNotNullParameter(action, a<"n">(11701, 6215907350310105432L ^ ax));
return new gs(x, name, animation, (short)var7, action, var8, (short)var9);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 8876541911114L;
Function0 var3 = this.X;
fd var4 = this.Q;
String var5 = this.G;
float var6 = this.i;
return a<"n">(22169, 4857149495506322588L ^ var1)
+ var6
+ a<"n">(18363, 7475542755613758903L ^ var1)
+ var5
+ a<"n">(32626, 1445761107457469808L ^ var1)
+ var4
+ a<"n">(23557, 3883335991419653635L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 1197739122640L;
int var3 = Float.hashCode(this.i);
var3 = var3 * b<"h">(1101, 7515486451957866338L ^ var1) + this.G.hashCode();
var3 = var3 * b<"h">(15620, 2997414497444308521L ^ var1) + this.Q.hashCode();
return var3 * b<"h">(15620, 2997414497444308521L ^ var1) + this.X.hashCode();
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
// 000: getstatic su/catlean/gs.a J
// 003: ldc2_w 20935547974742
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 5118383336878945386
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 5129628231088703335
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 5129628231088703335
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/gs
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 5129628231088703335
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 5129628231088703335
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/gs
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/gs.i F
// 065: aload 5
// 067: getfield su/catlean/gs.i F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 5129628231088703335
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 5129628231088703335
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/gs.G Ljava/lang/String;
// 092: aload 5
// 094: getfield su/catlean/gs.G Ljava/lang/String;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 5129628231088703335
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 5129628231088703335
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/gs.Q Lsu/catlean/fd;
// 0bf: aload 5
// 0c1: getfield su/catlean/gs.Q Lsu/catlean/fd;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 5129628231088703335
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 5129628231088703335
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/gs.X Lkotlin/jvm/functions/Function0;
// 0ec: aload 5
// 0ee: getfield su/catlean/gs.X Lkotlin/jvm/functions/Function0;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: aload 4
// 0f6: ifnull 116
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w 5129628231088703335
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 5129628231088703335
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 1
// 116: ireturn
}

static {
long var16 = a ^ 99113031518001L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[10];
int var23 = 0;
String var22 = "\u0090v\"\u0094Ñ\u007f¢\u001e+ÒÐÎ`«z\n\u0018z#!\u008fI\u0010\u000e\b\u009e0\u009eCãÈÇ%ïrÛì^á>\u0085 Ô\u000evÃ{\u001däàm\u001b¢:i°\u008f\u0000ña\u0005\u0001:$QF5¨÷Ã\u0018R\u0001Â î\u009b«÷\\¾ûpÑ\u0018Rãu\u001e-ÑØ:>µÐ\u000f\u0016p¤O»A\u0091\u0082\u00155\u0010r\u009c(Ú\u0081C/\u0018\u0002=§¦d\t'¨ 7\u009b\u001f\u0096\u0098\u0094\u001fÓÏ\u0012^$rgÉ-Ìªì\u0006xJ*«c:\u001ev±ß¯\u009b Õy\u00019Í}èI©ÛàoIÇ\u009aä¯\u008e+&dÅ7\u000f\u0083\u008e\u0006\u007fß\u0081)8\u0010§{\u0094\u008eçaûFJ\u008fÙÞiÅY2";
int var24 = "\u0090v\"\u0094Ñ\u007f¢\u001e+ÒÐÎ`«z\n\u0018z#!\u008fI\u0010\u000e\b\u009e0\u009eCãÈÇ%ïrÛì^á>\u0085 Ô\u000evÃ{\u001däàm\u001b¢:i°\u008f\u0000ña\u0005\u0001:$QF5¨÷Ã\u0018R\u0001Â î\u009b«÷\\¾ûpÑ\u0018Rãu\u001e-ÑØ:>µÐ\u000f\u0016p¤O»A\u0091\u0082\u00155\u0010r\u009c(Ú\u0081C/\u0018\u0002=§¦d\t'¨ 7\u009b\u001f\u0096\u0098\u0094\u001fÓÏ\u0012^$rgÉ-Ìªì\u0006xJ*«c:\u001ev±ß¯\u009b Õy\u00019Í}èI©ÛàoIÇ\u009aä¯\u008e+&dÅ7\u000f\u0083\u008e\u0006\u007fß\u0081)8\u0010§{\u0094\u008eçaûFJ\u008fÙÞiÅY2"
.length();
char var21 = 16;
int var28 = -1;

label56:
while (true) {
String var29 = var22.substring(++var28, var28 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var40;
if ((var28 += var21) >= var24) {
b = var25;
c = new String[10];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[3];
int var8 = 0;
String var9 = "{$\u0013RûÓWÓ©\u008bµÀ\u0094\u001a\u0087æÐæo¶K\u0086z¹";
int var10 = "{$\u0013RûÓWÓ©\u008bµÀ\u0094\u001a\u0087æÐæo¶K\u0086z¹".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var47 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

e = var11;
f = new Integer[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -6047265077473242533L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var45 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var38 = -1;
h = var45;
return;
}

var21 = var22.charAt(var28);
break;
default:
var25[var23++] = var40;
if ((var28 += var21) < var24) {
var21 = var22.charAt(var28);
continue label56;
}

var22 = "ÒÀýºPëC \b\u009a\u00ad\u0000\u008a¾D\u009e\u0010GCÉà\u008a²\u0084\u0005\u0012\u008e\u0086å\u009cÔ×8";
var24 = "ÒÀýºPëC \b\u009a\u00ad\u0000\u008a¾D\u009e\u0010GCÉà\u008a²\u0084\u0005\u0012\u008e\u0086å\u009cÔ×8".length();
var21 = 16;
var28 = -1;
}

var29 = var22.substring(++var28, var28 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 41;
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
throw new RuntimeException("su/catlean/gs", var10);
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
throw new RuntimeException("su/catlean/gs" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13976;
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
throw new RuntimeException("su/catlean/gs", var14);
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
throw new RuntimeException("su/catlean/gs" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
