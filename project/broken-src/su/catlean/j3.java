package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class j3 {
@NotNull
public static final j3 o = new j3();
private static final long a = yz.a(5311751763558104881L, 2191921631743439405L, MethodHandles.lookup().lookupClass()).a(22637797381130L);

private j3() {
}

public final float m(float endPoint, int a, float current, int a, int a, float speed) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 4
// 07: i2l
// 08: bipush 48
// 0a: lshl
// 0b: bipush 32
// 0d: lushr
// 0e: lor
// 0f: iload 5
// 11: i2l
// 12: bipush 48
// 14: lshl
// 15: bipush 48
// 17: lushr
// 18: lor
// 19: getstatic su/catlean/j3.a J
// 1c: lxor
// 1d: lstore 7
// 1f: ldc2_w -475426801540986413
// 22: lload 7
// 24: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: fload 6
// 2b: fstore 10
// 2d: istore 9
// 2f: fload 1
// 30: fload 3
// 31: fcmpl
// 32: iload 9
// 34: ifeq 49
// 37: ifle 4c
// 3a: goto 48
// 3d: ldc2_w -574255426938224129
// 40: lload 7
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: bipush 1
// 49: goto 4d
// 4c: bipush 0
// 4d: istore 11
// 4f: fload 10
// 51: fconst_0
// 52: fcmpg
// 53: iload 9
// 55: ifeq 9a
// 58: ifge 75
// 5b: goto 69
// 5e: ldc2_w -574255426938224129
// 61: lload 7
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: fconst_0
// 6a: iload 2
// 6b: iflt b0
// 6e: fstore 10
// 70: iload 9
// 72: ifne a0
// 75: fload 10
// 77: iload 9
// 79: ifeq b0
// 7c: goto 8a
// 7f: ldc2_w -574255426938224129
// 82: lload 7
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: fconst_1
// 8b: fcmpl
// 8c: goto 9a
// 8f: ldc2_w -574255426938224129
// 92: lload 7
// 94: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 99: athrow
// 9a: ifle a0
// 9d: fconst_1
// 9e: fstore 10
// a0: fload 1
// a1: f2d
// a2: fload 3
// a3: f2d
// a4: invokestatic java/lang/Math.max (DD)D
// a7: fload 1
// a8: f2d
// a9: fload 3
// aa: f2d
// ab: invokestatic java/lang/Math.min (DD)D
// ae: dsub
// af: d2f
// b0: fstore 12
// b2: fload 12
// b4: fload 10
// b6: fmul
// b7: fstore 13
// b9: fload 3
// ba: iload 11
// bc: ifeq cf
// bf: fload 13
// c1: goto d2
// c4: ldc2_w -574255426938224129
// c7: lload 7
// c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ce: athrow
// cf: fload 13
// d1: fneg
// d2: fadd
// d3: freturn
}

public final double X(@NotNull Number a) {
Intrinsics.checkNotNullParameter(ax, "a");
return Math.sqrt(1.0 - (ax.doubleValue() - 1.0) * (ax.doubleValue() - 1.0));
}

public final double N(@NotNull Number x) {
Intrinsics.checkNotNullParameter(x, "x");
return 1.0 - (0.5 * Math.sin(Math.PI * x.doubleValue() + (Math.PI / 2)) + 0.5);
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
