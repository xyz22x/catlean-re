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
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

public final class ag {
private static String h;
private static final long a = yz.a(5964778084651047137L, 7846755280579591988L, MethodHandles.lookup().lookupClass()).a(8826777607296L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public static final void r(int id, int button, @NotNull class_1713 type, boolean closeAfter, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ag.a J
// 03: lload 4
// 05: lxor
// 06: lstore 4
// 08: lload 4
// 0a: dup2
// 0b: ldc2_w 20037258255898
// 0e: lxor
// 0f: lstore 6
// 11: dup2
// 12: ldc2_w 55860580885625
// 15: lxor
// 16: lstore 8
// 18: dup2
// 19: ldc2_w 55648819548220
// 1c: lxor
// 1d: lstore 10
// 1f: pop2
// 20: ldc2_w -4453636147929904791
// 23: lload 4
// 25: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: aload 2
// 2b: sipush 17972
// 2e: ldc2_w 1051834205897321576
// 31: lload 4
// 33: lxor
// 34: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/ag.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3c: istore 12
// 3e: iload 12
// 40: ifne 84
// 43: lload 6
// 45: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 48: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
// 4b: dup
// 4c: ifnull 87
// 4f: goto 5d
// 52: ldc2_w -4427200012217321952
// 55: lload 4
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: lload 10
// 5f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 62: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 65: getfield net/minecraft/class_1703.field_7763 I
// 68: iload 0
// 69: iload 1
// 6a: aload 2
// 6b: lload 10
// 6d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 70: checkcast net/minecraft/class_1657
// 73: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
// 76: goto 84
// 79: ldc2_w -4427200012217321952
// 7c: lload 4
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: goto 88
// 87: pop
// 88: lload 4
// 8a: lconst_0
// 8b: lcmp
// 8c: ifle af
// 8f: iload 3
// 90: ifeq bd
// 93: new net/minecraft/class_2815
// 96: dup
// 97: lload 10
// 99: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9c: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 9f: getfield net/minecraft/class_1703.field_7763 I
// a2: invokespecial net/minecraft/class_2815.<init> (I)V
// a5: checkcast net/minecraft/class_2596
// a8: lload 8
// aa: dup2_x1
// ab: pop2
// ac: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// af: goto bd
// b2: ldc2_w -4427200012217321952
// b5: lload 4
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: return
}

@NotNull
public static final class_1269 x(@NotNull class_1268 hand, float y, long a, float p) {
ax = a ^ ax;
int var5 = (int)((ax ^ 123990516976194L) >>> 32);
long var6 = (ax ^ 123990516976194L) << 32 >>> 32;
long var8 = ax ^ 120231636745037L;
Intrinsics.checkNotNullParameter(hand, a<"l">(15643, 1756834930680020021L ^ ax));
class_1269 var10000 = zf.Z(var5, var6).method_2919((class_1657)zf.v(var8), hand);
Intrinsics.checkNotNullExpressionValue(var10000, a<"l">(7860, 2307691643251433368L ^ ax));
return var10000;
}

public static void i(String var0) {
h = var0;
}

public static String x() {
return h;
}

static {
long var14 = a ^ 56873782510836L;
vm.a<"Å">("FG0P1b", -1278234691615084343L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[3];
int var10 = 0;
String var9 = "x1;Ä\u008c\u0012*ºîâ\u001fèÖ\u00117±ñL\u008f»®º@\u009c\u0010\u001e%\u0099¨\u008a{Ïg9>KËJ\u009e\u0096¤\u0010Ï*\u0002 ÿIubÀª\u008f7\u0001Rl\u0006";
int var11 = "x1;Ä\u008c\u0012*ºîâ\u001fèÖ\u00117±ñL\u008f»®º@\u009c\u0010\u001e%\u0099¨\u008a{Ïg9>KËJ\u009e\u0096¤\u0010Ï*\u0002 ÿIubÀª\u008f7\u0001Rl\u0006"
.length();
char var8 = 24;
int var7 = -1;

while (true) {
byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
String var20 = a(var13).intern();
byte var10001 = -1;
var12[var10++] = var20;
if ((var7 += var8) >= var11) {
b = var12;
c = new String[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 6095282082561974453L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var23;
return;
}

var8 = var9.charAt(var7);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26894;
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
throw new RuntimeException("su/catlean/ag", var10);
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
throw new RuntimeException("su/catlean/ag" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
