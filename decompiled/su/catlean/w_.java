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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w_ {
@NotNull
private final class_243 K;
private int T;
private int l;
private static boolean n;
private static final long a = yz.a(-5227922391234230014L, -4517947155902184789L, MethodHandles.lookup().lookupClass()).a(171516094932246L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public w_(@NotNull class_243 pos, int color, long a, int age) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(pos, a<"n">(25591, 8765456004766211813L ^ ax));
super();
this.K = pos;
this.T = color;
this.l = age;
}

public w_(class_243 var1, int var2, int var3, int var4, DefaultConstructorMarker var5, long var6) {
var6 = a ^ var6;
long var8 = var6 ^ 92616157175320L;
if ((var4 & 2) != 0) {
var2 = -1;
}

if ((var4 & 4) != 0) {
var3 = 0;
}

this(var1, var2, var8, var3);
}

@NotNull
public final class_243 R() {
return this.K;
}

public final int m() {
return this.T;
}

public final void j(int <set-?>) {
this.T = <set-?>;
}

public final int J() {
return this.l;
}

public final void a(int <set-?>) {
this.l = <set-?>;
}

@NotNull
public final class_243 Z() {
return this.K;
}

public final int X() {
return this.T;
}

public final int q() {
return this.l;
}

@NotNull
public final w_ N(@NotNull class_243 pos, int color, long a, int age) {
ax = a ^ ax;
long var6 = ax ^ 35208257212816L;
Intrinsics.checkNotNullParameter(pos, a<"n">(19772, 3843257403324583035L ^ ax));
return new w_(pos, color, var6, age);
}

public static w_ v(w_ param0, class_243 param1, int param2, int param3, int param4, long param5, Object param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/w_.a J
// 03: lload 5
// 05: lxor
// 06: lstore 5
// 08: lload 5
// 0a: dup2
// 0b: ldc2_w 39456098280719
// 0e: lxor
// 0f: lstore 8
// 11: pop2
// 12: ldc2_w -5508968793005944204
// 15: lload 5
// 17: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c: istore 10
// 1e: iload 4
// 20: bipush 1
// 21: iand
// 22: iload 10
// 24: ifne 41
// 27: ifeq 3d
// 2a: goto 38
// 2d: ldc2_w -5511281104302902146
// 30: lload 5
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: getfield su/catlean/w_.K Lnet/minecraft/class_243;
// 3c: astore 1
// 3d: iload 4
// 3f: bipush 2
// 40: iand
// 41: iload 10
// 43: lload 5
// 45: lconst_0
// 46: lcmp
// 47: iflt 69
// 4a: ifne 67
// 4d: ifeq 63
// 50: goto 5e
// 53: ldc2_w -5511281104302902146
// 56: lload 5
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: aload 0
// 5f: getfield su/catlean/w_.T I
// 62: istore 2
// 63: iload 4
// 65: bipush 4
// 66: iand
// 67: iload 10
// 69: ifne 8f
// 6c: ifeq 90
// 6f: goto 7d
// 72: ldc2_w -5511281104302902146
// 75: lload 5
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: aload 0
// 7e: getfield su/catlean/w_.l I
// 81: goto 8f
// 84: ldc2_w -5511281104302902146
// 87: lload 5
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: istore 3
// 90: aload 0
// 91: aload 1
// 92: iload 2
// 93: lload 8
// 95: iload 3
// 96: invokevirtual su/catlean/w_.N (Lnet/minecraft/class_243;IJI)Lsu/catlean/w_;
// 99: ldc2_w -5548255530865611375
// 9c: lload 5
// 9e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: ifnull d3
// a6: iload 10
// a8: ifeq c8
// ab: goto b9
// ae: ldc2_w -5511281104302902146
// b1: lload 5
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: bipush 0
// ba: goto c9
// bd: ldc2_w -5511281104302902146
// c0: lload 5
// c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c7: athrow
// c8: bipush 1
// c9: ldc2_w -5575040782443819262
// cc: lload 5
// ce: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d3: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 118174314145803L;
int var3 = this.l;
int var4 = this.T;
class_243 var5 = this.K;
return a<"n">(16222, 8349854843132232008L ^ var1)
+ var5
+ a<"n">(30140, 8318638998710815656L ^ var1)
+ var4
+ a<"n">(20758, 3644018344145956611L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 110746392599185L;
int var4 = this.K.hashCode();
boolean var10000 = vm.a<"Å">(8516607925777085499L, var1);
var4 = var4 * b<"y">(53, 7892817679572633542L ^ var1) + Integer.hashCode(this.T);
boolean var3 = var10000;
var4 = var4 * b<"y">(10068, 9201591166584430758L ^ var1) + Integer.hashCode(this.l);

try {
if (!var3) {
vm.a<"Å">(new _g[2], 8536160707867933771L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 8539937189872021886L, var1);
}
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
// 00: getstatic su/catlean/w_.a J
// 03: ldc2_w 17962712487335
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -5063648704538601406
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifne 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -5064993429113209272
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -5064993429113209272
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifne 5c
// 3c: instanceof su/catlean/w_
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -5064993429113209272
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -5064993429113209272
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/w_
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/w_.K Lnet/minecraft/class_243;
// 65: aload 5
// 67: getfield su/catlean/w_.K Lnet/minecraft/class_243;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: iload 4
// 6f: ifne 92
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -5064993429113209272
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -5064993429113209272
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/w_.T I
// 92: aload 5
// 94: getfield su/catlean/w_.T I
// 97: iload 4
// 99: ifne d3
// 9c: if_icmpeq b8
// 9f: goto ac
// a2: ldc2_w -5064993429113209272
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -5064993429113209272
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: aload 0
// b9: getfield su/catlean/w_.l I
// bc: iload 4
// be: ifne e3
// c1: aload 5
// c3: getfield su/catlean/w_.l I
// c6: goto d3
// c9: ldc2_w -5064993429113209272
// cc: lload 2
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: if_icmpeq e2
// d6: bipush 0
// d7: ireturn
// d8: ldc2_w -5064993429113209272
// db: lload 2
// dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e1: athrow
// e2: bipush 1
// e3: ireturn
}

public static void C(boolean var0) {
n = var0;
}

public static boolean w() {
return n;
}

public static boolean d() {
boolean var0 = w();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 127216565867726L;
vm.a<"Å">(false, -5044486430537628579L, var20);
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
String var15 = "×! \u0016q¿ÿÏ\u0003+z7Î\nT\u0097\u0087\u000f80ÒîL\u001cþåxïð\u0013Ô`\u0010´ \u009e¸/ì´âqº'cÅÀY. íR»Ð=I\u009d\u0097G®\fd:þñÊÖtÛ\u0004Õ°R\u0017éS\"\u0094:mÚÅ";
int var17 = "×! \u0016q¿ÿÏ\u0003+z7Î\nT\u0097\u0087\u000f80ÒîL\u001cþåxïð\u0013Ô`\u0010´ \u009e¸/ì´âqº'cÅÀY. íR»Ð=I\u009d\u0097G®\fd:þñÊÖtÛ\u0004Õ°R\u0017éS\"\u0094:mÚÅ"
.length();
char var14 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[5];
g = new HashMap(13);
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
String var4 = "~>\u0083/\nU\u009fW`ìæ®§²ÜP";
int var5 = "~>\u0083/\nU\u009fW`ìæ®§²ÜP".length();
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

e = var6;
f = new Integer[2];
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

var15 = "Q^C7\u0001À^\u0088,îFÅ\u0083ïìm\u0010\u0086iÏe¥\u008bÌçi¬®Ãæ3B\u0004";
var17 = "Q^C7\u0001À^\u0088,îFÅ\u0083ïìm\u0010\u0086iÏe¥\u008bÌçi¬®Ãæ3B\u0004".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15325;
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
throw new RuntimeException("su/catlean/w_", var10);
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
throw new RuntimeException("su/catlean/w_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28834;
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
throw new RuntimeException("su/catlean/w_", var14);
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
throw new RuntimeException("su/catlean/w_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
