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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jv {
@NotNull
private final class_1657 I;
@NotNull
private final fd B;
private boolean K;
private static final long a = yz.a(8843209845161219949L, -4472365921686497638L, MethodHandles.lookup().lookupClass()).a(59252553739925L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public jv(long a, @NotNull class_1657 entity, @NotNull fd animation, boolean removing) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(entity, a<"d">(27678, 8899448682981903853L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"d">(2552, 2362448287467087887L ^ ax));
super();
this.I = entity;
this.B = animation;
this.K = removing;
}

@NotNull
public final class_1657 X() {
return this.I;
}

@NotNull
public final fd i() {
return this.B;
}

public final boolean W() {
return this.K;
}

public final void h(boolean <set-?>) {
this.K = <set-?>;
}

@NotNull
public final String H(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 101274367744191L;
int var3 = (int)((var1 ^ 101274367744191L) >>> 32);
int var4 = (int)((var1 ^ 101274367744191L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 33698370639931L;
long var8 = var1 ^ 35076720117401L;

class_124 var10000;
label17: {
try {
if (zv.a(this.I, var6)) {
var10000 = class_124.field_1060;
break label17;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -7709350648687765199L, var1);
}

var10000 = class_124.field_1068;
}

String var17 = this.I.method_7334().name();
class_124 var10002 = class_124.field_1070;
int var10003 = MathKt.roundToInt(this.I.method_6032() + this.I.method_6067());
int var10004 = MathKt.roundToInt(zf.v(var8).method_5739((class_1297)this.I));
int var10 = nf.Z.z(var3, (short)var4, (short)var5, this.I);
int var11 = var10004;
int var12 = var10003;
class_124 var13 = var10002;
Object var14 = var17;
return var10000
+ var14
+ var13
+ a<"d">(10349, 5032661074655582271L ^ var1)
+ var12
+ a<"d">(32446, 3209141494935637741L ^ var1)
+ var11
+ a<"d">(6552, 830287415171099084L ^ var1)
+ var10
+ a<"d">(1927, 8173316833750267871L ^ var1);
}

@NotNull
public final class_1657 d() {
return this.I;
}

@NotNull
public final fd h() {
return this.B;
}

public final boolean k() {
return this.K;
}

@NotNull
public final jv A(@NotNull class_1657 entity, @NotNull fd animation, boolean removing, long a) {
ax = a ^ ax;
long var6 = ax ^ 133304035373153L;
Intrinsics.checkNotNullParameter(entity, a<"d">(2910, 7868108750293330902L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"d">(24358, 4073851828561395631L ^ ax));
return new jv(var6, entity, animation, removing);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 138325672759633L;
boolean var3 = this.K;
fd var4 = this.B;
class_1657 var5 = this.I;
return a<"d">(30062, 7899994699443138688L ^ var1)
+ var5
+ a<"d">(18359, 8495133689888752211L ^ var1)
+ var4
+ a<"d">(4273, 2286781264922449236L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 17672494881591L;
int var3 = this.I.hashCode();
var3 = var3 * b<"d">(16575, 7441885714946422745L ^ var1) + this.B.hashCode();
return var3 * b<"d">(6163, 3433762604259094388L ^ var1) + Boolean.hashCode(this.K);
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
// 00: getstatic su/catlean/jv.a J
// 03: ldc2_w 99329030119841
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 5839071628168071353
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifne 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 5786265884070780031
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 5786265884070780031
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifne 5c
// 3c: instanceof su/catlean/jv
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 5786265884070780031
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 5786265884070780031
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/jv
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/jv.I Lnet/minecraft/class_1657;
// 65: aload 5
// 67: getfield su/catlean/jv.I Lnet/minecraft/class_1657;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: iload 4
// 6f: ifne 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 5786265884070780031
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 5786265884070780031
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/jv.B Lsu/catlean/fd;
// 92: aload 5
// 94: getfield su/catlean/jv.B Lsu/catlean/fd;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: iload 4
// 9c: ifne bf
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 5786265884070780031
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 5786265884070780031
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/jv.K Z
// bf: iload 4
// c1: ifne e6
// c4: aload 5
// c6: getfield su/catlean/jv.K Z
// c9: if_icmpeq e5
// cc: goto d9
// cf: ldc2_w 5786265884070780031
// d2: lload 2
// d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d8: athrow
// d9: bipush 0
// da: ireturn
// db: ldc2_w 5786265884070780031
// de: lload 2
// df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4: athrow
// e5: bipush 1
// e6: ireturn
}

static {
long var16 = a ^ 139872360388450L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[11];
int var23 = 0;
String var22 = "\u0081Ü~Äi*Ó~5/¸zê\u0094U§\u0010Ï\r\u008cÄã-\u0082\u0094\u008fwÅËmÏop(ô×;4\u0091%¨Ú\u0011\u0018é4\u001e5Ý'©·UQïþ3Õ\u000b\u009eÙþ\u0088\u00056Öj\u000bs\u001bçß¬\u000e\u0018g&\u008dI`xÜÄZ8áeFùbÏá\u0001j\u001bå\u0002_v\u0010rQ\u0096Ç\u008bSdt\u009bo\u009f\u008b\f\u0084\u0005a\u0018\u0004Wö]°N¸s\u0014Ö\u0089¿µ8x\u0012\u0090¿W\u008cö,¬\u0014\u0010\u009fKß+æt]1^)M¸\u0080ÜîÉ\u0010p·Á\u0098äpü,\n+t4ú\u0084\u009b( ì\u0019g\u000eOÓ¿_O¸\u000eüæ¦\u008dýÍè\u0098ÂZ!yRfP5Vv²Bð";
int var24 = "\u0081Ü~Äi*Ó~5/¸zê\u0094U§\u0010Ï\r\u008cÄã-\u0082\u0094\u008fwÅËmÏop(ô×;4\u0091%¨Ú\u0011\u0018é4\u001e5Ý'©·UQïþ3Õ\u000b\u009eÙþ\u0088\u00056Öj\u000bs\u001bçß¬\u000e\u0018g&\u008dI`xÜÄZ8áeFùbÏá\u0001j\u001bå\u0002_v\u0010rQ\u0096Ç\u008bSdt\u009bo\u009f\u008b\f\u0084\u0005a\u0018\u0004Wö]°N¸s\u0014Ö\u0089¿µ8x\u0012\u0090¿W\u008cö,¬\u0014\u0010\u009fKß+æt]1^)M¸\u0080ÜîÉ\u0010p·Á\u0098äpü,\n+t4ú\u0084\u009b( ì\u0019g\u000eOÓ¿_O¸\u000eüæ¦\u008dýÍè\u0098ÂZ!yRfP5Vv²Bð"
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
c = new String[11];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[2];
int var8 = 0;
String var9 = "ïE¢·\u0093àbW¨}bþ¬d^o";
int var10 = "ïE¢·\u0093àbW¨}bþ¬d^o".length();
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
f = new Integer[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -1619276897447064061L;
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

var22 = "F1ÊRìsÃ\u0091\\mbù¯=å\u0092\u008b\u008b\u0014ýåjô¾z®6\u009fÐ\u009f\u0007n\u0010>MØ¦®è¡\u0018\u0018;P·Ì\u000f¹Û";
var24 = "F1ÊRìsÃ\u0091\\mbù¯=å\u0092\u008b\u008b\u0014ýåjô¾z®6\u009fÐ\u009f\u0007n\u0010>MØ¦®è¡\u0018\u0018;P·Ì\u000f¹Û".length();
var21 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9636;
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
throw new RuntimeException("su/catlean/jv", var10);
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
throw new RuntimeException("su/catlean/jv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7497;
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
throw new RuntimeException("su/catlean/jv", var14);
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
throw new RuntimeException("su/catlean/jv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
