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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class uu extends _g {
@NotNull
public static final uu J;
@NotNull
private static final ct G;
@NotNull
private static final cq f;
@NotNull
private static final c8 z;
@NotNull
private static final bg b;
private static final long a = yz.a(6057440100898153567L, -7111162560728401794L, MethodHandles.lookup().lookupClass()).a(10308587321698L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

private uu(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 33192078277085L;
super(b<"v">(14313, 7124640152658758215L ^ var1), jt.V(), null, 4, null, var3);
}

public final float n(int var1, short var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 21921409998484L;
return ((Number)G.E(this, var6, T[0])).floatValue();
}

public final boolean E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 14694104748335L;
int[] var5 = vm.a<"Å">(2039741583144512345L, var1);

try {
boolean var10000 = (Boolean)f.E(this, var3, T[1]);
if (vm.a<"Å">(2052195735797105387L, var1) != null) {
vm.a<"Å">(new int[3], 2051506611838181634L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 2150144218254882900L, var1);
}
}

public final int T(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 65296722262019L;
int[] var8 = vm.a<"Å">(-5376550185706962315L, var4);

try {
int var10000 = ((Number)z.E(this, var6, T[2])).intValue();
if (var8 != null) {
vm.a<"Å">(new _g[5], -5395086250040901859L, var4);
}

return var10000;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -5405745652041084552L, var4);
}
}

@NotNull
public final bg V() {
return b;
}

@Override
public void O(long var1) {
b.l();
}

@Flow
private final void f(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uu.a J
// 03: ldc2_w 32151457700331
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 85841884597115
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 88649638479040
// 2e: lxor
// 2f: lstore 7
// 31: dup2
// 32: ldc2_w 112830757842412
// 35: lxor
// 36: dup2
// 37: bipush 32
// 39: lushr
// 3a: l2i
// 3b: istore 9
// 3d: dup2
// 3e: bipush 32
// 40: lshl
// 41: bipush 48
// 43: lushr
// 44: l2i
// 45: istore 10
// 47: dup2
// 48: bipush 48
// 4a: lshl
// 4b: bipush 48
// 4d: lushr
// 4e: l2i
// 4f: istore 11
// 51: pop2
// 52: dup2
// 53: ldc2_w 128337035970745
// 56: lxor
// 57: lstore 12
// 59: dup2
// 5a: ldc2_w 48254265361048
// 5d: lxor
// 5e: lstore 14
// 60: pop2
// 61: ldc2_w 7161826677386941556
// 64: lload 2
// 65: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 6d: aload 0
// 6e: iload 4
// 70: iload 5
// 72: i2s
// 73: iload 6
// 75: invokevirtual su/catlean/uu.n (ISI)F
// 78: invokevirtual su/catlean/tq.x (F)V
// 7b: astore 16
// 7d: aload 0
// 7e: lload 7
// 80: invokevirtual su/catlean/uu.E (J)Z
// 83: aload 16
// 85: ifnonnull b9
// 88: ifeq cf
// 8b: goto 98
// 8e: ldc2_w 7132485221354194809
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: getstatic su/catlean/uu.b Lsu/catlean/bg;
// 9b: aload 0
// 9c: iload 9
// 9e: iload 10
// a0: i2c
// a1: iload 11
// a3: i2c
// a4: invokevirtual su/catlean/uu.T (ICC)I
// a7: lload 12
// a9: invokevirtual su/catlean/bg.c (IJ)Z
// ac: goto b9
// af: ldc2_w 7132485221354194809
// b2: lload 2
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: ifeq cf
// bc: aload 0
// bd: lload 14
// bf: invokevirtual su/catlean/uu.d (J)V
// c2: goto cf
// c5: ldc2_w 7132485221354194809
// c8: lload 2
// c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ce: athrow
// cf: return
}

private static final boolean v() {
long var0 = a ^ 107208840861627L;
long var2 = var0 ^ 48498819025552L;
return J.E(var2);
}

static {
long var20 = a ^ 133695693035198L;
long var22 = var20 ^ 77640718499770L;
long var24 = var20 ^ 95207827416527L;
long var26 = var20 ^ 112824112688001L;
long var28 = var20 ^ 80518926313191L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "\u008f\u0007\u008e\u0080\u009aÚË\u001fà89½ªTðt \u007f¯ïN\rp\u0016b\u0011\u001e\u009aì\u009bÄ\u0016ÕØÿ\u001bRa8\u0086©\u008e;ræÐßø°\u0010\fÌ61Ý\u009cyéRp\u0011\u0003^¶\u008c¼\u0010q-\u0013ÉÂô\"\u0092Ã\u0003·|Z[\n\u001f\u0010°å\u0001û!0Ü®Jì1\u0015\u008cg\u0000U {BZôÜRÝã\u0087½[ª÷.5UÌ\\\u009bM[ ð}²Yv×i,Ý\u009f(ø\u008fo7Ý`\föQÌS\\k\u00819§\u001b,Ñ\u00ad÷P®\u0098hþ%:)\u00ad\u0002L×ë»/Ä\u001cLs\u0010\u0090K|jU³ª{SÀïÈg\u0014\u0011-";
int var17 = "\u008f\u0007\u008e\u0080\u009aÚË\u001fà89½ªTðt \u007f¯ïN\rp\u0016b\u0011\u001e\u009aì\u009bÄ\u0016ÕØÿ\u001bRa8\u0086©\u008e;ræÐßø°\u0010\fÌ61Ý\u009cyéRp\u0011\u0003^¶\u008c¼\u0010q-\u0013ÉÂô\"\u0092Ã\u0003·|Z[\n\u001f\u0010°å\u0001û!0Ü®Jì1\u0015\u008cg\u0000U {BZôÜRÝã\u0087½[ª÷.5UÌ\\\u009bM[ ð}²Yv×i,Ý\u009f(ø\u008fo7Ý`\föQÌS\\k\u00819§\u001b,Ñ\u00ad÷P®\u0098hþ%:)\u00ad\u0002L×ë»/Ä\u001cLs\u0010\u0090K|jU³ª{SÀïÈg\u0014\u0011-"
.length();
char var14 = 16;
int var33 = -1;

label55:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var45;
if ((var33 += var14) >= var17) {
c = var18;
d = new String[10];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[4];
int var4 = 0;
String var5 = "\u0084\u0083©'¹È#¹i¤G\u008e8D¥è";
int var6 = "\u0084\u0083©'¹È#¹i¤G\u008e8D¥è".length();
byte var3 = 0;

label37:
while (true) {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var37 = var0;
var10001 = var4++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var37[var10001] = var54;
if (var3 >= var6) {
KProperty[] var30 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(uu.class, b<"v">(2768, 6584335633633751854L ^ var20), b<"v">(27961, 7373903813776233678L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uu.class, b<"v">(18580, 8856350328618021224L ^ var20), b<"v">(3624, 7914884042913527774L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(uu.class, b<"v">(4350, 3758630259047639301L ^ var20), b<"v">(5468, 6079464403370323108L ^ var20), 0))
};
T = var30;
J = new uu(var22);
G = yp.k(J, b<"v">(1248, 3582843256374574365L ^ var20), 1.0F, var24, RangesKt.rangeTo(0.1F, 10.0F), null, null, (int)var0[0], null);
f = yp.t(J, b<"v">(2974, 7568109969640075876L ^ var20), false, var26, null, null, (int)var0[1], null);
z = yp.L(J, b<"v">(15071, 4133273399531864864L ^ var20), 1, new IntRange(1, (int)var0[2]), var28, null, uu::v, (int)var0[3], null);
b = new bg();
return;
}
break;
default:
var37[var10001] = var54;
if (var3 < var6) {
continue label37;
}

var5 = "\u0086\u0007ï\u001a3ª\u0088\u0002µ\u000bd\u0097æð§3";
var6 = "\u0086\u0007ï\u001a3ª\u0088\u0002µ\u000bd\u0097æð§3".length();
var3 = 0;
}

byte var43 = var3;
var3 += 8;
var7 = var5.substring(var43, var3).getBytes("ISO-8859-1");
var37 = var0;
var10001 = var4++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var45;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label55;
}

var15 = "\b¤À{ 3%È\fU\u009a=\u009b;ä©¦M[P\u00028Þz\u001aÉ\u009c¯Ï{õ\u0093 æê9l?\u009a>\u009c\u0013jÔ\t\u0089\u0084\u0085ÈFì$\u0081×ØÌs§\u0086\u0010\u009d'\u00ad\u007fß";
var17 = "\b¤À{ 3%È\fU\u009a=\u009b;ä©¦M[P\u00028Þz\u001aÉ\u009c¯Ï{õ\u0093 æê9l?\u009a>\u009c\u0013jÔ\t\u0089\u0084\u0085ÈFì$\u0081×ØÌs§\u0086\u0010\u009d'\u00ad\u007fß"
.length();
var14 = ' ';
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21677;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/uu", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/uu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
