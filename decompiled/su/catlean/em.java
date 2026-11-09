package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class em extends _g {
@NotNull
public static final em U;
@NotNull
private static final bg i;
private static final long a = yz.a(-4692500715715064216L, -1083886641505589772L, MethodHandles.lookup().lookupClass()).a(40918005135536L);
private static final String b;
private static final long c;

private em(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 50772685901445L;
super(b, jt.v(), null, 4, null, var3);
}

@Flow
public final void t(@NotNull SendPacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/em.a J
// 03: ldc2_w 50900202367278
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6656686404892688781
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: ldc "e"
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: istore 4
// 19: aload 1
// 1a: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 1d: instanceof net/minecraft/class_2793
// 20: iload 4
// 22: ifne 4c
// 25: ifeq 60
// 28: goto 35
// 2b: ldc2_w 6634397954407428333
// 2e: lload 2
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: getstatic su/catlean/em.i Lsu/catlean/bg;
// 38: invokevirtual su/catlean/bg.N ()J
// 3b: getstatic su/catlean/em.c J
// 3e: lcmp
// 3f: goto 4c
// 42: ldc2_w 6634397954407428333
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: ifge 60
// 4f: aload 1
// 50: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 53: goto 60
// 56: ldc2_w 6634397954407428333
// 59: lload 2
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: ldc2_w 6634798286229815938
// 63: lload 2
// 64: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: ifnull 87
// 6c: iinc 4 1
// 6f: iload 4
// 71: ldc2_w 6689964417732420850
// 74: lload 2
// 75: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: goto 87
// 7d: ldc2_w 6634397954407428333
// 80: lload 2
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: return
}

@Flow
public final void m(@NotNull PlayerUpdateEvent e) {
long var2 = a ^ 76742679321026L;
long var4 = var2 ^ 85473274970214L;
long var6 = var2 ^ 87599114649281L;
Intrinsics.checkNotNullParameter(e, "e");
int var10000 = vm.a<"Å">(-5998290407914128890L, var2);
int var9 = (int)(zf.v(var6).method_23317() - 2);
int var8 = var10000;
int var10 = (int)(zf.v(var6).method_23317() + 2);

label57:
while (true) {
var10000 = var9;

label55:
while (var10000 < var10) {
int var11 = (int)(zf.v(var6).method_23321() - 2);
int var12 = (int)(zf.v(var6).method_23321() + 2);

label52:
while (true) {
var10000 = var11;

label50:
while (true) {
if (var10000 >= var12) {
break label52;
}

int var13 = (int)(zf.v(var6).method_23318() - 2);
var10000 = (int)(zf.v(var6).method_23318() + 2);
if (var8 == 0) {
continue label55;
}

int var14 = var10000;

while (var13 < var14) {
var10000 = Intrinsics.areEqual(zf.z(var4).method_8320(class_2338.method_49637(var9, var13, var11)).method_26204(), class_2246.field_10316);
if (var8 == 0) {
continue label50;
}

try {
if (var10000 != 0) {
i.l();
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -5981213174109536255L, var2);
}

var13++;
if (var8 == 0) {
vm.a<"Å">(new _g[1], -6014059362228656460L, var2);
break;
}
}

var11++;
if (var8 == 0) {
break label52;
}
break;
}
}

var9++;
if (var8 == 0) {
return;
}
continue label57;
}

return;
}
}

static {
long var15 = a ^ 104150013536859L;
long var17 = var15 ^ 89753178829831L;
Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var14 = var12.doFinal("'\u0006\u0014^UÓ\u008f ÷=;\u0017\u0081ö6ð".getBytes("ISO-8859-1"));
String var23 = b(var14).intern();
byte var10001 = -1;
b = var23;
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var15 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var9 = -1458342436532458430L;
byte[] var11 = var7.doFinal(
new byte[]{
(byte)(var9 >>> 56), (byte)(var9 >>> 48), (byte)(var9 >>> 40), (byte)(var9 >>> 32), (byte)(var9 >>> 24), (byte)(var9 >>> 16), (byte)(var9 >>> 8), (byte)var9
}
);
long var25 = (var11[0] & 255L) << 56
| (var11[1] & 255L) << 48
| (var11[2] & 255L) << 40
| (var11[3] & 255L) << 32
| (var11[4] & 255L) << 24
| (var11[5] & 255L) << 16
| (var11[6] & 255L) << 8
| var11[7] & 255L;
var10001 = -1;
long var5 = var25;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 3661497879740907161L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var27 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
c = var27;
U = new em(var17);
i = new bg();
i.G((int)var5);
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
}
