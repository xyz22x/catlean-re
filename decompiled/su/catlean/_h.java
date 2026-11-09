package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArrayDeque;
import org.jetbrains.annotations.NotNull;

public final class _h {
@NotNull
public static final _h G;
@NotNull
private static final ArrayDeque q;
private static int Y;
private static final long a = yz.a(-1401122628156748365L, -8725047003296678295L, MethodHandles.lookup().lookupClass()).a(137495720706535L);
private static final long b;

private _h() {
}

public final int q() {
return Y;
}

public final void I(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_h.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 2899358255112576794
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: invokestatic su/catlean/zf.A ()J
// 12: lstore 4
// 14: astore 3
// 15: getstatic su/catlean/_h.q Lkotlin/collections/ArrayDeque;
// 18: lload 4
// 1a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 1d: invokevirtual kotlin/collections/ArrayDeque.addLast (Ljava/lang/Object;)V
// 20: getstatic su/catlean/_h.q Lkotlin/collections/ArrayDeque;
// 23: invokevirtual kotlin/collections/ArrayDeque.firstOrNull ()Ljava/lang/Object;
// 26: checkcast java/lang/Long
// 29: dup
// 2a: ifnull 9b
// 2d: checkcast java/lang/Number
// 30: invokevirtual java/lang/Number.longValue ()J
// 33: lstore 6
// 35: bipush 0
// 36: istore 8
// 38: lload 6
// 3a: getstatic su/catlean/_h.b J
// 3d: l2i
// 3e: i2l
// 3f: ladd
// 40: lload 4
// 42: lcmp
// 43: lload 1
// 44: lconst_0
// 45: lcmp
// 46: iflt 9d
// 49: aload 3
// 4a: ifnonnull 9d
// 4d: aload 3
// 4e: ifnonnull 6f
// 51: goto 5e
// 54: ldc2_w 2884263782727035605
// 57: lload 1
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: ifge 72
// 61: goto 6e
// 64: ldc2_w 2884263782727035605
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: bipush 1
// 6f: goto 73
// 72: bipush 0
// 73: nop
// 74: aload 3
// 75: ifnonnull 98
// 78: bipush 1
// 79: if_icmpne 97
// 7c: goto 89
// 7f: ldc2_w 2884263782727035605
// 82: lload 1
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: bipush 1
// 8a: goto 9d
// 8d: ldc2_w 2884263782727035605
// 90: lload 1
// 91: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96: athrow
// 97: bipush 0
// 98: goto 9d
// 9b: pop
// 9c: bipush 0
// 9d: lload 1
// 9e: lconst_0
// 9f: lcmp
// a0: iflt ca
// a3: ifeq c4
// a6: getstatic su/catlean/_h.q Lkotlin/collections/ArrayDeque;
// a9: invokevirtual kotlin/collections/ArrayDeque.removeFirst ()Ljava/lang/Object;
// ac: pop
// ad: aload 3
// ae: ifnull 20
// b1: lload 1
// b2: lconst_0
// b3: lcmp
// b4: ifle cd
// b7: goto c4
// ba: ldc2_w 2884263782727035605
// bd: lload 1
// be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3: athrow
// c4: getstatic su/catlean/_h.q Lkotlin/collections/ArrayDeque;
// c7: invokevirtual kotlin/collections/ArrayDeque.size ()I
// ca: putstatic su/catlean/_h.Y I
// cd: return
}

static {
long var0 = a ^ 98824561301397L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -1886171039703569568L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var7 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var10001 = -1;
b = var7;
G = new _h();
q = new ArrayDeque();
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
