package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class o {
@NotNull
public static final o G = new o();
@NotNull
private static final List H = new ArrayList();
private static boolean N;
private static int k;
private static String[] W;
private static final long a = yz.a(4960750192193325778L, -3953806531375182387L, MethodHandles.lookup().lookupClass()).a(245530227423405L);

private o() {
}

@NotNull
public final List z() {
return H;
}

public final boolean F() {
return N;
}

public final void B(boolean <set-?>) {
N = <set-?>;
}

public final int E() {
return k;
}

public final void Z(int <set-?>) {
k = <set-?>;
}

public final void D(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/o.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 128751665840725
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -3657958779974103238
// 11: lload 1
// 12: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: getstatic su/catlean/o.N Z
// 1c: aload 5
// 1e: ifnull 64
// 21: ifeq 67
// 24: goto 31
// 27: ldc2_w -3653828333888095343
// 2a: lload 1
// 2b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: athrow
// 31: getstatic su/catlean/os.D Lsu/catlean/os;
// 34: getstatic su/catlean/o.H Ljava/util/List;
// 37: getstatic su/catlean/o.k I
// 3a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 3f: checkcast su/catlean/ov
// 42: invokevirtual su/catlean/ov.o ()Ljava/lang/Object;
// 45: lload 3
// 46: invokestatic su/catlean/i2.g (Lsu/catlean/os;Ljava/lang/Object;J)V
// 49: getstatic su/catlean/o.k I
// 4c: bipush 1
// 4d: iadd
// 4e: getstatic su/catlean/o.H Ljava/util/List;
// 51: invokeinterface java/util/List.size ()I 1
// 56: irem
// 57: goto 64
// 5a: ldc2_w -3653828333888095343
// 5d: lload 1
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: putstatic su/catlean/o.k I
// 67: return
}

static {
long var0 = a ^ 81132619010781L;
String[] var10000 = new String[5];
vm.a<"Å">(var10000, -3269756968617347209L, var0);
}

public static void Q(String[] var0) {
W = var0;
}

public static String[] h() {
return W;
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
