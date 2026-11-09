package su.catlean;

import java.lang.invoke.MethodHandles;

public final class nb implements Runnable {
final int p;
private static String W;
private static final long a = yz.a(-1144173234703483777L, 2499100012809533188L, MethodHandles.lookup().lookupClass()).a(103773081018879L);

public nb(int $delay) {
this.p = $delay;
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
// 00: getstatic su/catlean/nb.a J
// 03: ldc2_w 45619879420453
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 103103850120730
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 98473431858756
// 13: lxor
// 14: dup2
// 15: bipush 56
// 17: lushr
// 18: l2i
// 19: istore 5
// 1b: dup2
// 1c: bipush 8
// 1e: lshl
// 1f: bipush 8
// 21: lushr
// 22: lstore 6
// 24: pop2
// 25: dup2
// 26: ldc2_w 104831690665181
// 29: lxor
// 2a: lstore 8
// 2c: pop2
// 2d: aload 0
// 2e: getfield su/catlean/nb.p I
// 31: i2l
// 32: invokestatic java/lang/Thread.sleep (J)V
// 35: bipush 0
// 36: istore 11
// 38: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 3b: pop
// 3c: ldc2_w 991220255159768976
// 3f: lload 1
// 40: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: bipush 0
// 46: invokestatic su/catlean/uy.l (Z)V
// 49: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 4c: bipush 1
// 4d: invokevirtual su/catlean/sg.t (Z)V
// 50: getstatic su/catlean/us.z Lsu/catlean/us;
// 53: lload 8
// 55: invokevirtual su/catlean/us.d (J)V
// 58: astore 10
// 5a: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 5d: pop
// 5e: bipush 0
// 5f: invokestatic su/catlean/uy.m (Z)V
// 62: aload 10
// 64: ifnull a7
// 67: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 6a: lload 3
// 6b: invokestatic su/catlean/uy.O (Lsu/catlean/uy;J)Z
// 6e: ifeq 9e
// 71: goto 7e
// 74: ldc2_w 980124615500404845
// 77: lload 1
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: getstatic su/catlean/us.z Lsu/catlean/us;
// 81: iload 5
// 83: i2b
// 84: lload 6
// 86: invokevirtual su/catlean/us.o (BJ)V
// 89: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 8c: pop
// 8d: bipush 1
// 8e: invokestatic su/catlean/uy.m (Z)V
// 91: goto 9e
// 94: ldc2_w 980124615500404845
// 97: lload 1
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: getstatic su/catlean/sg.H Lsu/catlean/sg;
// a1: bipush 0
// a2: invokevirtual su/catlean/sg.t (Z)V
// a5: nop
// a6: nop
// a7: ldc2_w 942058125568971651
// aa: lload 1
// ab: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b0: ifnull cb
// b3: ldc "cJOfJ"
// b5: ldc2_w 988909728669763588
// b8: lload 1
// b9: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be: goto cb
// c1: ldc2_w 980124615500404845
// c4: lload 1
// c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ca: athrow
// cb: return
}

public static void Q(String var0) {
W = var0;
}

public static String D() {
return W;
}

static {
long var0 = a ^ 96256076865392L;
if (vm.a<"Å">(-1110986797195089211L, var0) == null) {
vm.a<"Å">("dTk9e", -1086441877781351087L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
