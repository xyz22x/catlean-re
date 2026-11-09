package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class bx {
private static _g[] O;
private static final long a = yz.a(6259692815043206833L, 7492812825357708346L, MethodHandles.lookup().lookupClass()).a(243122606885064L);
private static final long b;

public static final boolean k(short a, int a, char a, int key) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 0
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 1
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 2
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/bx.a J
// 1a: lxor
// 1b: lstore 4
// 1d: lload 4
// 1f: dup2
// 20: ldc2_w 59609358565514
// 23: lxor
// 24: lstore 6
// 26: pop2
// 27: ldc2_w 6714778102093030859
// 2a: lload 4
// 2c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: astore 8
// 33: invokestatic com/mojang/blaze3d/systems/RenderSystem.isOnRenderThread ()Z
// 36: aload 8
// 38: ifnonnull a6
// 3b: ifeq a5
// 3e: goto 4c
// 41: ldc2_w 6686920410364382699
// 44: lload 4
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: iload 3
// 4d: aload 8
// 4f: ifnonnull a6
// 52: goto 60
// 55: ldc2_w 6686920410364382699
// 58: lload 4
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: bipush -1
// 61: if_icmpeq a5
// 64: goto 72
// 67: ldc2_w 6686920410364382699
// 6a: lload 4
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: lload 6
// 74: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 77: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 7a: instanceof net/minecraft/class_408
// 7d: aload 8
// 7f: iload 2
// 80: iflt aa
// 83: ifnonnull a8
// 86: goto 94
// 89: ldc2_w 6686920410364382699
// 8c: lload 4
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: ifeq a7
// 97: goto a5
// 9a: ldc2_w 6686920410364382699
// 9d: lload 4
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: bipush 0
// a6: ireturn
// a7: iload 3
// a8: aload 8
// aa: ifnonnull e7
// ad: getstatic su/catlean/bx.b J
// b0: l2i
// b1: if_icmpge db
// b4: goto c2
// b7: ldc2_w 6686920410364382699
// ba: lload 4
// bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c1: athrow
// c2: getstatic su/catlean/iq.a Lsu/catlean/iq;
// c5: invokevirtual su/catlean/iq.u ()Ljava/util/ArrayList;
// c8: iload 3
// c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// cc: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
// cf: ireturn
// d0: ldc2_w 6686920410364382699
// d3: lload 4
// d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// da: athrow
// db: lload 6
// dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// e0: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// e3: iload 3
// e4: invokestatic net/minecraft/class_3675.method_15987 (Lnet/minecraft/class_1041;I)Z
// e7: ireturn
}

public static void t(_g[] var0) {
O = var0;
}

public static _g[] O() {
return O;
}

static {
long var5 = a ^ 125022590784181L;
if (vm.a<"Å">(-8272896064717833640L, var5) != null) {
vm.a<"Å">(new _g[5], -8291269219167525863L, var5);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -3562735855658840421L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var7 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var10001 = -1;
b = var7;
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
