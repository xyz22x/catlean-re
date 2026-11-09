package su.catlean;

import java.lang.invoke.MethodHandles;

public final class bg {
private long C;
private static boolean B;
private static final long a = yz.a(1087004212696968314L, -4002072988966639041L, MethodHandles.lookup().lookupClass()).a(104254268490845L);

public bg() {
this.l();
}

public final boolean c(int ms, long a) {
ax = a ^ ax;
boolean var4 = vm.a<"Å">(-8389279173404472996L, ax);

try {
long var7;
int var10000 = (var7 = zf.A() - this.C - ms) == 0L ? 0 : (var7 < 0L ? -1 : 1);
if (var4) {
return (boolean)var10000;
}

if (var10000 >= 0) {
return (boolean)1;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -8477025956541852762L, ax);
}

return (boolean)0;
}

public final boolean q(int ms, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bg.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -1719427643451135252
// 09: lload 2
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: invokestatic su/catlean/zf.A ()J
// 14: aload 0
// 15: getfield su/catlean/bg.C J
// 18: lsub
// 19: iload 1
// 1a: i2l
// 1b: lcmp
// 1c: iload 4
// 1e: ifne 32
// 21: iflt 35
// 24: goto 31
// 27: ldc2_w -1591007142164172778
// 2a: lload 2
// 2b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: athrow
// 31: bipush 1
// 32: goto 36
// 35: bipush 0
// 36: istore 5
// 38: iload 5
// 3a: lload 2
// 3b: lconst_0
// 3c: lcmp
// 3d: iflt 68
// 40: iload 4
// 42: ifne 68
// 45: ifeq 66
// 48: goto 55
// 4b: ldc2_w -1591007142164172778
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: aload 0
// 56: invokevirtual su/catlean/bg.l ()V
// 59: goto 66
// 5c: ldc2_w -1591007142164172778
// 5f: lload 2
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: iload 5
// 68: ldc2_w -1613265139541608691
// 6b: lload 2
// 6c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: ifnull 9e
// 74: iload 4
// 76: ifeq 94
// 79: goto 86
// 7c: ldc2_w -1591007142164172778
// 7f: lload 2
// 80: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: athrow
// 86: bipush 0
// 87: goto 95
// 8a: ldc2_w -1591007142164172778
// 8d: lload 2
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: bipush 1
// 95: ldc2_w -1635585072518727449
// 98: lload 2
// 99: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: ireturn
}

public final void G(int ms) {
this.C = System.currentTimeMillis() - ms;
}

public final long N() {
return zf.A() - this.C;
}

public final void l() {
this.C = zf.A();
}

public static void Z(boolean var0) {
B = var0;
}

public static boolean B() {
return B;
}

public static boolean n() {
boolean var0 = B();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var0 = a ^ 116174915347367L;
if (!vm.a<"Å">(-8985240176519696958L, var0)) {
vm.a<"Å">(true, -8942724556566785457L, var0);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}
}
