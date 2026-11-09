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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

public final class uw extends _g {
@NotNull
public static final uw K;
@NotNull
private static final cq m;
private static final long a = yz.a(-1358673295243936049L, -2130830009718419867L, MethodHandles.lookup().lookupClass()).a(29271265281161L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private uw(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 46989482986996L;
super(b<"k">(14894, 1542144574317333867L ^ var1), jt.V(), null, 4, null, var3);
}

private final boolean a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 56473509251885L;
return (Boolean)m.E(this, var3, o[0]);
}

@Flow
private final void F(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uw.a J
// 03: ldc2_w 106404948079488
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 54025849484576
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 68944716579392
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 5687258556278
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -6632852586829485537
// 22: lload 2
// 23: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 0
// 2b: lload 4
// 2d: invokevirtual su/catlean/uw.S (J)Z
// 30: aload 10
// 32: ifnonnull 5c
// 35: ifne 56
// 38: goto 45
// 3b: ldc2_w -6697646725669105874
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 0
// 46: lload 6
// 48: invokevirtual su/catlean/uw.d (J)V
// 4b: return
// 4c: ldc2_w -6697646725669105874
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 0
// 57: lload 8
// 59: invokespecial su/catlean/uw.C (J)Z
// 5c: ifeq 7f
// 5f: aload 1
// 60: dconst_0
// 61: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 64: aload 1
// 65: dconst_0
// 66: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 69: aload 1
// 6a: dconst_0
// 6b: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 6e: aload 1
// 6f: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 72: goto 7f
// 75: ldc2_w -6697646725669105874
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: return
}

@Flow
private final void k(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uw.a J
// 03: ldc2_w 19383143243674
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 70662814095674
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 108011998582963
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 127863382166380
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 5758185070967948805
// 22: lload 2
// 23: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 0
// 2b: lload 6
// 2d: invokespecial su/catlean/uw.a (J)Z
// 30: aload 10
// 32: ifnonnull 58
// 35: ifeq f8
// 38: goto 45
// 3b: ldc2_w 5699125761442620212
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 0
// 46: lload 4
// 48: invokevirtual su/catlean/uw.S (J)Z
// 4b: goto 58
// 4e: ldc2_w 5699125761442620212
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: aload 10
// 5a: ifnonnull 80
// 5d: ifeq f8
// 60: goto 6d
// 63: ldc2_w 5699125761442620212
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: aload 0
// 6e: lload 8
// 70: invokespecial su/catlean/uw.C (J)Z
// 73: goto 80
// 76: ldc2_w 5699125761442620212
// 79: lload 2
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: aload 10
// 82: ifnonnull bb
// 85: ifeq f8
// 88: goto 95
// 8b: ldc2_w 5699125761442620212
// 8e: lload 2
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: aload 1
// 96: aload 10
// 98: ifnonnull f5
// 9b: goto a8
// 9e: ldc2_w 5699125761442620212
// a1: lload 2
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// ab: instanceof net/minecraft/class_2828
// ae: goto bb
// b1: ldc2_w 5699125761442620212
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: ifne e7
// be: aload 1
// bf: aload 10
// c1: ifnonnull f5
// c4: goto d1
// c7: ldc2_w 5699125761442620212
// ca: lload 2
// cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0: athrow
// d1: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// d4: instanceof net/minecraft/class_2851
// d7: ifeq f8
// da: goto e7
// dd: ldc2_w 5699125761442620212
// e0: lload 2
// e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e6: athrow
// e7: aload 1
// e8: goto f5
// eb: ldc2_w 5699125761442620212
// ee: lload 2
// ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f4: athrow
// f5: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// f8: return
}

private final boolean C(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uw.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 71734081226536
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 97437720610713
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 6186564716000549943
// 18: lload 1
// 19: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 5
// 22: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 28: aload 7
// 2a: ifnonnull 6c
// 2d: ifeq 6b
// 30: goto 3d
// 33: ldc2_w 6135421855734806790
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: getstatic su/catlean/um.E Lsu/catlean/um;
// 40: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 43: lload 1
// 44: lconst_0
// 45: lcmp
// 46: iflt 79
// 49: aload 7
// 4b: ifnonnull 79
// 4e: goto 5b
// 51: ldc2_w 6135421855734806790
// 54: lload 1
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: ifnonnull 6f
// 5e: goto 6b
// 61: ldc2_w 6135421855734806790
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: bipush 0
// 6c: goto a6
// 6f: getstatic su/catlean/um.E Lsu/catlean/um;
// 72: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 75: dup
// 76: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 79: lload 5
// 7b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7e: checkcast net/minecraft/class_1297
// 81: invokevirtual net/minecraft/class_1297.method_5739 (Lnet/minecraft/class_1297;)F
// 84: getstatic su/catlean/um.E Lsu/catlean/um;
// 87: lload 3
// 88: invokevirtual su/catlean/um.P (J)F
// 8b: fcmpg
// 8c: aload 7
// 8e: ifnonnull a2
// 91: ifge a5
// 94: goto a1
// 97: ldc2_w 6135421855734806790
// 9a: lload 1
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: bipush 1
// a2: goto a6
// a5: bipush 0
// a6: ireturn
}

static {
long var16 = a ^ 90307499982658L;
long var18 = var16 ^ 98594064802415L;
long var20 = var16 ^ 41275324623054L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "Ø\u0010TåÇ\u008d\u0097\u0097.°á\u0082\u0081`\u000eäqñCF\u0006¯m§ ãx¸%óuvO\u0014ôò\u0000«tg\u001aÅË\u0081\u0086'}ß7l\nO?\"Q0ð";
int var13 = "Ø\u0010TåÇ\u008d\u0097\u0097.°á\u0082\u0081`\u000eäqñCF\u0006¯m§ ãx¸%óuvO\u0014ôò\u0000«tg\u001aÅË\u0081\u0086'}ß7l\nO?\"Q0ð".length();
char var10 = 24;
int var24 = -1;

label37:
while (true) {
String var25 = var11.substring(++var24, var24 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var25.getBytes("ISO-8859-1"));
String var33 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var33;
if ((var24 += var10) >= var13) {
b = var14;
c = new String[4];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 632483154592366992L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var37 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var37;
KProperty[] var22 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(uw.class, b<"k">(26744, 7491023114824625167L ^ var16), b<"k">(25910, 2765247295235334467L ^ var16), 0))
};
o = var22;
K = new uw(var18);
m = yp.t(K, b<"k">(6815, 7480031523638402793L ^ var16), false, var20, null, null, (int)var0, null);
return;
}

var10 = var11.charAt(var24);
break;
default:
var14[var12++] = var33;
if ((var24 += var10) < var13) {
var10 = var11.charAt(var24);
continue label37;
}

var11 = "Í\u0082dº0Kl \u008bÁ3Øø0\u0093\u0016\u0018 E´\u0084p£rèÇPz4´#ß\n\u0007\\ÉÉ¸\u0093\u0007¦";
var13 = "Í\u0082dº0Kl \u008bÁ3Øø0\u0093\u0016\u0018 E´\u0084p£rèÇPz4´#ß\n\u0007\\ÉÉ¸\u0093\u0007¦".length();
var10 = 16;
var24 = -1;
}

var25 = var11.substring(++var24, var24 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27241;
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
throw new RuntimeException("su/catlean/uw", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/uw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
