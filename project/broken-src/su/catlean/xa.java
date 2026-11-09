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
import net.minecraft.class_1799;
import net.minecraft.class_3489;
import org.jetbrains.annotations.NotNull;

public final class xa {
private static boolean P;
private static final long a = yz.a(561138447295734001L, -4577200242209532022L, MethodHandles.lookup().lookupClass()).a(163512189779997L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public static final boolean N(@NotNull class_1799 item, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(item, a<"i">(7723, 4031703968689336223L ^ ax));
return item.method_31573(class_3489.field_42611);
}

public static final boolean K(@NotNull class_1799 item, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(item, a<"i">(7723, 4031575421083319577L ^ ax));
return item.method_31573(class_3489.field_42614);
}

public static final boolean F(long a, @NotNull class_1799 item) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/xa.a J
// 03: lload 0
// 04: lxor
// 05: lstore 0
// 06: ldc2_w 6318255755795311017
// 09: lload 0
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 2
// 10: sipush 15016
// 13: ldc2_w 6246694950143347975
// 16: lload 0
// 17: lxor
// 18: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/xa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: istore 3
// 21: aload 2
// 22: getstatic net/minecraft/class_3489.field_48294 Lnet/minecraft/class_6862;
// 25: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
// 28: iload 3
// 29: ifeq b5
// 2c: ifne b4
// 2f: goto 3c
// 32: ldc2_w 6295758929877727775
// 35: lload 0
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: aload 2
// 3d: getstatic net/minecraft/class_3489.field_48295 Lnet/minecraft/class_6862;
// 40: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
// 43: iload 3
// 44: ifeq b5
// 47: goto 54
// 4a: ldc2_w 6295758929877727775
// 4d: lload 0
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: ifne b4
// 57: goto 64
// 5a: ldc2_w 6295758929877727775
// 5d: lload 0
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: aload 2
// 65: getstatic net/minecraft/class_3489.field_48296 Lnet/minecraft/class_6862;
// 68: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
// 6b: iload 3
// 6c: ifeq b5
// 6f: goto 7c
// 72: ldc2_w 6295758929877727775
// 75: lload 0
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: ifne b4
// 7f: goto 8c
// 82: ldc2_w 6295758929877727775
// 85: lload 0
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: aload 2
// 8d: getstatic net/minecraft/class_3489.field_48297 Lnet/minecraft/class_6862;
// 90: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
// 93: iload 3
// 94: ifeq b5
// 97: goto a4
// 9a: ldc2_w 6295758929877727775
// 9d: lload 0
// 9e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: athrow
// a4: ifeq b8
// a7: goto b4
// aa: ldc2_w 6295758929877727775
// ad: lload 0
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: bipush 1
// b5: goto b9
// b8: bipush 0
// b9: ireturn
}

public static void G(boolean var0) {
P = var0;
}

public static boolean i() {
return P;
}

public static boolean V() {
boolean var0 = i();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var9 = a ^ 6176293510818L;
vm.a<"Å">(false, 1429442817967892835L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[2];
int var5 = 0;
String var4 = "hlzóu\u008cV¶±øru2=Þ8\u0010û£ÁÈ\u000f\u00adñ\u0087\u0019õ\u0003â\u0019¤Ï±";
int var6 = "hlzóu\u008cV¶±øru2=Þ8\u0010û£ÁÈ\u000f\u00adñ\u0087\u0019õ\u0003â\u0019¤Ï±".length();
char var3 = 16;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var13;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8503;
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
throw new RuntimeException("su/catlean/xa", var10);
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
throw new RuntimeException("su/catlean/xa" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
