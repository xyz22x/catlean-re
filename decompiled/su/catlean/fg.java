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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fg {
@NotNull
public static final d5 O;
private final int M;
private final boolean S;
@NotNull
private final class_1799 m;
@NotNull
private static final fg y;
private static _g[] F;
private static final long a = yz.a(-2131163273576256315L, 5036752660355681584L, MethodHandles.lookup().lookupClass()).a(271579057654007L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public fg(long a, int slot, boolean found, @NotNull class_1799 stack) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(stack, a<"v">(7931, 2914229901631179946L ^ ax));
super();
this.M = slot;
this.S = found;
this.m = stack;
}

public final int a() {
return this.M;
}

public final boolean R() {
return this.S;
}

@NotNull
public final class_1799 r() {
return this.m;
}

public final boolean d(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 103990834890580
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 138752298060146
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -2642328766093645140
// 18: lload 1
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 3
// 21: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 27: aload 7
// 29: ifnonnull 4f
// 2c: ifnonnull 4a
// 2f: goto 3c
// 32: ldc2_w -2641237550320617940
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: bipush 0
// 3d: goto 80
// 40: ldc2_w -2641237550320617940
// 43: lload 1
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: lload 5
// 4c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 52: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 55: aload 7
// 57: ifnonnull 7c
// 5a: aload 0
// 5b: getfield su/catlean/fg.M I
// 5e: if_icmpne 7f
// 61: goto 6e
// 64: ldc2_w -2641237550320617940
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: bipush 1
// 6f: goto 7c
// 72: ldc2_w -2641237550320617940
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: goto 80
// 7f: bipush 0
// 80: ireturn
}

private final boolean J(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 2811320164900656891
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 0
// 11: getfield su/catlean/fg.M I
// 14: aload 3
// 15: ifnonnull 43
// 18: sipush 2490
// 1b: ldc2_w 6037772881039240042
// 1e: lload 1
// 1f: lxor
// 20: invokedynamic b (IJ)I bsm=su/catlean/fg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25: if_icmpge 46
// 28: goto 35
// 2b: ldc2_w 2814520270802225787
// 2e: lload 1
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: bipush 1
// 36: goto 43
// 39: ldc2_w 2814520270802225787
// 3c: lload 1
// 3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: athrow
// 43: goto 47
// 46: bipush 0
// 47: ireturn
}

public final void x(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 44726511019446
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 29717834657753
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 7069164739708425186
// 18: lload 1
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: aload 0
// 21: getfield su/catlean/fg.S Z
// 24: aload 7
// 26: ifnonnull 4c
// 29: ifeq 67
// 2c: goto 39
// 2f: ldc2_w 7067916301574852450
// 32: lload 1
// 33: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: athrow
// 39: aload 0
// 3a: lload 5
// 3c: invokespecial su/catlean/fg.J (J)Z
// 3f: goto 4c
// 42: ldc2_w 7067916301574852450
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: ifeq 67
// 4f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 52: aload 0
// 53: getfield su/catlean/fg.M I
// 56: lload 3
// 57: invokevirtual su/catlean/gg.f (IJ)V
// 5a: goto 67
// 5d: ldc2_w 7067916301574852450
// 60: lload 1
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: return
}

public final void r(long a, @NotNull Function1 action, short a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 16
// 03: lshl
// 04: iload 4
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 48
// 0c: lushr
// 0d: lor
// 0e: getstatic su/catlean/fg.a J
// 11: lxor
// 12: lstore 5
// 14: ldc2_w 5946329270225838973
// 17: lload 5
// 19: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: aload 3
// 1f: sipush 5728
// 22: ldc2_w 39299441812118696
// 25: lload 5
// 27: lxor
// 28: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/fg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 30: bipush 0
// 31: istore 8
// 33: astore 7
// 35: aload 0
// 36: aload 7
// 38: ifnonnull 64
// 3b: invokevirtual su/catlean/fg.R ()Z
// 3e: ifeq 65
// 41: goto 4f
// 44: ldc2_w 5947396361436004349
// 47: lload 5
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 3
// 50: aload 0
// 51: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 56: goto 64
// 59: ldc2_w 5947396361436004349
// 5c: lload 5
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: pop
// 65: return
}

public final int F() {
return this.M;
}

public final boolean C() {
return this.S;
}

@NotNull
public final class_1799 E() {
return this.m;
}

@NotNull
public final fg v(int slot, int a, short a, char a, boolean found, @NotNull class_1799 stack) {
long var7 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var9 = var7 ^ 70422637048481L;
Intrinsics.checkNotNullParameter(stack, a<"v">(6680, 2692110125311856684L ^ var7));
return new fg(var9, slot, found, stack);
}

public static fg I(fg var0, long var1, int var3, boolean var4, class_1799 var5, int var6, Object var7) {
var1 = a ^ var1;
long var10001 = var1 ^ 60595680958428L;
int var8 = (int)((var1 ^ 60595680958428L) >>> 32);
int var9 = (int)((var1 ^ 60595680958428L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
_g[] var11 = vm.a<"Å">(-5808371006358004068L, var1);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var11 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -5807256661112651236L, var1);
}

var3 = var0.M;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var11 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -5807256661112651236L, var1);
}

var4 = var0.S;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var0.m;
}

return var0.v(var3, var8, (short)var9, (char)var10, var4, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 44816177014947L;
class_1799 var3 = this.m;
boolean var4 = this.S;
int var5 = this.M;
return a<"v">(22793, 7356775091611566696L ^ var1)
+ var5
+ a<"v">(32397, 5070473297827571181L ^ var1)
+ var4
+ a<"v">(2084, 6737407510283375431L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 3506280275309L;
int var3 = Integer.hashCode(this.M);
var3 = var3 * b<"b">(10710, 7576461691642321634L ^ var1) + Boolean.hashCode(this.S);
return var3 * b<"b">(29068, 1606610737568203450L ^ var1) + this.m.hashCode();
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fg.a J
// 03: ldc2_w 93953634947902
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 8698673985269696847
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 8699576153476224463
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 8699576153476224463
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/fg
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 8699576153476224463
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 8699576153476224463
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/fg
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/fg.M I
// 65: aload 5
// 67: getfield su/catlean/fg.M I
// 6a: aload 4
// 6c: ifnonnull a6
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w 8699576153476224463
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w 8699576153476224463
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/fg.S Z
// 8f: aload 4
// 91: ifnonnull c1
// 94: aload 5
// 96: getfield su/catlean/fg.S Z
// 99: goto a6
// 9c: ldc2_w 8699576153476224463
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: if_icmpeq b5
// a9: bipush 0
// aa: ireturn
// ab: ldc2_w 8699576153476224463
// ae: lload 2
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 0
// b6: getfield su/catlean/fg.m Lnet/minecraft/class_1799;
// b9: aload 5
// bb: getfield su/catlean/fg.m Lnet/minecraft/class_1799;
// be: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c1: aload 4
// c3: ifnonnull e3
// c6: ifne e2
// c9: goto d6
// cc: ldc2_w 8699576153476224463
// cf: lload 2
// d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: athrow
// d6: bipush 0
// d7: ireturn
// d8: ldc2_w 8699576153476224463
// db: lload 2
// dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e1: athrow
// e2: bipush 1
// e3: ireturn
}

public static final fg X() {
return y;
}

static {
long var20 = a ^ 41354294163240L;
long var22 = var20 ^ 30158804024440L;
vm.a<"Å">(null, 6647022619826066323L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "{\u0002Æ<,7OÂ®ÉÓû²¾k8þ\u008cÍQøÓn¬\u0010èdØã`õ\u0016.\u0015v\u0007Á\u009b\"ãÃ0È\u000f\u008d/\u0010{>\u001cjd\u0017Z`¨\níE\tÐC\u0014Ç\u0000'£æÝ6\u000b*JÞoî²3\u009eûÓÊ\u00874È¬D\u0019ÜP ¹¿§\u0006R\u008aÆ7'\u008f)|!f5ß\u0007\u009bîøL6\u008e+Î\u007fúì\u0002:é\u008e\u0010\u0081¨D ë´|\u0015Zj\u009fJÜ>>s";
int var17 = "{\u0002Æ<,7OÂ®ÉÓû²¾k8þ\u008cÍQøÓn¬\u0010èdØã`õ\u0016.\u0015v\u0007Á\u009b\"ãÃ0È\u000f\u008d/\u0010{>\u001cjd\u0017Z`¨\níE\tÐC\u0014Ç\u0000'£æÝ6\u000b*JÞoî²3\u009eûÓÊ\u00874È¬D\u0019ÜP ¹¿§\u0006R\u008aÆ7'\u008f)|!f5ß\u0007\u009bîøL6\u008e+Î\u007fúì\u0002:é\u008e\u0010\u0081¨D ë´|\u0015Zj\u009fJÜ>>s"
.length();
char var14 = 24;
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[7];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = " ëóÐ\u001f\\+Ó9ëtº!ç¨V¢\u0090©¼C0¦w";
int var5 = " ëóÐ\u001f\\+Ó9ëtº!ç¨V¢\u0090©¼C0¦w".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
O = new d5(null);
class_1799 var10005 = class_1799.field_8037;
Intrinsics.checkNotNullExpressionValue(class_1799.field_8037, a<"v">(5923, 3682690704176419789L ^ var20));
y = new fg(var22, -1, false, var10005);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "§9\u009e\u0012\u0091¢Õ¸¼î\bHëA\u0098S\u0010:$¹ê<)½C½ ÈTß\u001c7L";
var17 = "§9\u009e\u0012\u0091¢Õ¸¼î\bHëA\u0098S\u0010:$¹ê<)½C½ ÈTß\u001c7L".length();
var14 = 16;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void F(_g[] var0) {
F = var0;
}

public static _g[] i() {
return F;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22784;
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
throw new RuntimeException("su/catlean/fg", var10);
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
throw new RuntimeException("su/catlean/fg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1179;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/fg", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/fg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
