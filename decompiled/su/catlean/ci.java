package su.catlean;

import java.lang.invoke.MethodHandles;

public final class ci implements Runnable {
final int H;
final ds q;
final String[] v;
private static final long a = yz.a(5319287408544337369L, 1526305187217338417L, MethodHandles.lookup().lookupClass()).a(242160210000506L);

public ci(int var1, ds var2, String[] var3) {
this.H = var1;
this.q = var2;
this.v = var3;
}

@Override
public final void run() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ci.a J
// 03: ldc2_w 21825868370796
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 128049193073198
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 74104062819618
// 13: lxor
// 14: dup2
// 15: bipush 32
// 17: lushr
// 18: lstore 5
// 1a: dup2
// 1b: bipush 32
// 1d: lshl
// 1e: bipush 32
// 20: lushr
// 21: l2i
// 22: istore 7
// 24: pop2
// 25: dup2
// 26: ldc2_w 128847305529320
// 29: lxor
// 2a: lstore 8
// 2c: pop2
// 2d: ldc2_w 8490428410667546365
// 30: lload 1
// 31: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: aload 0
// 37: getfield su/catlean/ci.H I
// 3a: i2l
// 3b: invokestatic java/lang/Thread.sleep (J)V
// 3e: bipush 0
// 3f: istore 11
// 41: astore 10
// 43: aload 10
// 45: ifnull a3
// 48: lload 5
// 4a: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 4d: aload 0
// 4e: getfield su/catlean/ci.q Lsu/catlean/ds;
// 51: lload 3
// 52: invokevirtual su/catlean/ds.L (J)Ljava/lang/String;
// 55: dup
// 56: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 59: iload 7
// 5b: invokestatic su/catlean/s7.C (JLsu/catlean/s7;Ljava/lang/String;I)Z
// 5e: ifeq a1
// 61: goto 6e
// 64: ldc2_w 8373284702202068055
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: invokestatic su/catlean/s7.F ()Ljava/util/concurrent/CopyOnWriteArrayList;
// 71: aload 0
// 72: getfield su/catlean/ci.q Lsu/catlean/ds;
// 75: invokevirtual java/util/concurrent/CopyOnWriteArrayList.add (Ljava/lang/Object;)Z
// 78: ifeq a1
// 7b: goto 88
// 7e: ldc2_w 8373284702202068055
// 81: lload 1
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: lload 8
// 8a: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 8d: aload 0
// 8e: getfield su/catlean/ci.v [Ljava/lang/String;
// 91: invokestatic su/catlean/s7.E (JLsu/catlean/s7;[Ljava/lang/String;)V
// 94: goto a1
// 97: ldc2_w 8373284702202068055
// 9a: lload 1
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: nop
// a2: nop
// a3: return
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
