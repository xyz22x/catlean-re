package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.LightMapUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.XRayBlockEvent;
import su.catlean.gofra.Flow;

public final class fq extends _g {
@NotNull
public static final fq x;
@NotNull
private static final az X;
@NotNull
private static final cq C;
@NotNull
private static final cq D;
@NotNull
private static final c8 T;
@NotNull
private static final c8 U;
@NotNull
private static final c8 k;
@NotNull
private static final c8 O;
@NotNull
private static final bg J;
@NotNull
private static final ArrayList I;
@Nullable
private static class_2338 b;
@NotNull
private static class_238 G;
private static boolean g;
private static final long a = yz.a(8638636948636311576L, -2532462535733190466L, MethodHandles.lookup().lookupClass()).a(34211223239199L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

private fq(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 7195338082922L;
super(b<"b">(18746, 8551031192135591857L ^ var1), jt.z(), null, 4, null, var3);
}

private final dg h(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 28877451538459L;
return (dg)X.E(this, var6, B[0]);
}

private final void O(int var1, char var2, short var3, dg var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var7 = var5 ^ 98702957594840L;
X.b(this, var7, B[0], var4);
}

private final boolean V(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 57359946156790L;
return (Boolean)C.E(this, var6, B[1]);
}

private final boolean q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 89907656542523L;
return (Boolean)D.E(this, var3, B[2]);
}

private final int p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 16599647923203L;
return ((Number)T.E(this, var3, B[3])).intValue();
}

private final int A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 9259974795711L;
return ((Number)U.E(this, var3, B[4])).intValue();
}

private final int E(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 134720568822864L;
return ((Number)k.E(this, var6, B[5])).intValue();
}

private final int D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 126911659349179L;
return ((Number)O.E(this, var3, B[c<"k">(4460, 6286503209937631342L ^ var1)])).intValue();
}

@Flow
private final void l(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fq.a J
// 03: ldc2_w 103663274982854
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 58167787767931
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 92652245957744
// 14: lxor
// 15: dup2
// 16: bipush 16
// 18: lushr
// 19: lstore 6
// 1b: dup2
// 1c: bipush 48
// 1e: lshl
// 1f: bipush 48
// 21: lushr
// 22: l2i
// 23: istore 8
// 25: pop2
// 26: dup2
// 27: ldc2_w 46919925414708
// 2a: lxor
// 2b: dup2
// 2c: bipush 48
// 2e: lushr
// 2f: l2i
// 30: istore 9
// 32: dup2
// 33: bipush 16
// 35: lshl
// 36: bipush 48
// 38: lushr
// 39: l2i
// 3a: istore 10
// 3c: dup2
// 3d: bipush 32
// 3f: lshl
// 40: bipush 32
// 42: lushr
// 43: l2i
// 44: istore 11
// 46: pop2
// 47: pop2
// 48: ldc2_w -7626343959329491319
// 4b: lload 2
// 4c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 54: bipush 1
// 55: invokevirtual su/catlean/api/event/GofraState.setXray (Z)V
// 58: astore 12
// 5a: aload 0
// 5b: iload 9
// 5d: i2c
// 5e: iload 10
// 60: i2c
// 61: iload 11
// 63: invokespecial su/catlean/fq.V (CCI)Z
// 66: aload 12
// 68: ifnonnull db
// 6b: ifeq cf
// 6e: goto 7b
// 71: ldc2_w -7635710767077183222
// 74: lload 2
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: getstatic su/catlean/fq.g Z
// 7e: aload 12
// 80: ifnonnull db
// 83: goto 90
// 86: ldc2_w -7635710767077183222
// 89: lload 2
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: ifne cf
// 93: goto a0
// 96: ldc2_w -7635710767077183222
// 99: lload 2
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// a3: invokevirtual java/util/ArrayList.clear ()V
// a6: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// a9: aload 0
// aa: lload 6
// ac: iload 8
// ae: i2s
// af: invokespecial su/catlean/fq.W (JS)Ljava/util/ArrayList;
// b2: checkcast java/util/Collection
// b5: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
// b8: pop
// b9: aload 0
// ba: lload 4
// bc: invokespecial su/catlean/fq.v (J)Lnet/minecraft/class_238;
// bf: putstatic su/catlean/fq.G Lnet/minecraft/class_238;
// c2: goto cf
// c5: ldc2_w -7635710767077183222
// c8: lload 2
// c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ce: athrow
// cf: aload 0
// d0: iload 9
// d2: i2c
// d3: iload 10
// d5: i2c
// d6: iload 11
// d8: invokespecial su/catlean/fq.V (CCI)Z
// db: putstatic su/catlean/fq.g Z
// de: return
}

@Flow
private final void E(XRayBlockEvent var1) {
long var2 = a ^ 65319033024065L;
int var4 = (int)((var2 ^ 107663909900894L) >>> 32);
long var5 = (var2 ^ 107663909900894L) << 32 >>> 32;

try {
if (this.h(var4, var5).e().contains(var1.getBlock())) {
var1.cancel();
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 5012476341460787853L, var2);
}
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 32978412894279
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 42464098356882
// 0b: lxor
// 0c: dup2
// 0d: bipush 16
// 0f: lushr
// 10: lstore 5
// 12: dup2
// 13: bipush 48
// 15: lshl
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 7
// 1c: pop2
// 1d: pop2
// 1e: ldc2_w 2651417630488036459
// 21: lload 1
// 22: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: astore 8
// 29: lload 3
// 2a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2d: aload 8
// 2f: ifnonnull 56
// 32: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 35: ifnull 6e
// 38: goto 45
// 3b: ldc2_w 2660206097284432872
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: lload 3
// 46: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 49: goto 56
// 4c: ldc2_w 2660206097284432872
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 8
// 58: ifnonnull 9d
// 5b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 5e: ifnonnull 79
// 61: goto 6e
// 64: ldc2_w 2660206097284432872
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: return
// 6f: ldc2_w 2660206097284432872
// 72: lload 1
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 7c: invokevirtual java/util/ArrayList.clear ()V
// 7f: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 82: aload 0
// 83: lload 5
// 85: iload 7
// 87: i2s
// 88: invokespecial su/catlean/fq.W (JS)Ljava/util/ArrayList;
// 8b: checkcast java/util/Collection
// 8e: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
// 91: pop
// 92: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 95: bipush 1
// 96: invokevirtual su/catlean/api/event/GofraState.setXray (Z)V
// 99: lload 3
// 9a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 9d: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
// a0: invokevirtual net/minecraft/class_761.method_3279 ()V
// a3: return
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 64129331416845
// 05: lxor
// 06: lstore 3
// 07: pop2
// 08: ldc2_w 1405578164060795681
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 5
// 13: lload 3
// 14: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 17: aload 5
// 19: ifnonnull 40
// 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 1f: ifnull 58
// 22: goto 2f
// 25: ldc2_w 1414364430743286946
// 28: lload 1
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: lload 3
// 30: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 33: goto 40
// 36: ldc2_w 1414364430743286946
// 39: lload 1
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: aload 5
// 42: ifnonnull 67
// 45: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 48: ifnonnull 63
// 4b: goto 58
// 4e: ldc2_w 1414364430743286946
// 51: lload 1
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: return
// 59: ldc2_w 1414364430743286946
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: lload 3
// 64: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 67: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
// 6a: invokevirtual net/minecraft/class_761.method_3279 ()V
// 6d: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 70: bipush 0
// 71: invokevirtual su/catlean/api/event/GofraState.setXray (Z)V
// 74: return
}

@Flow
private final void s(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fq.a J
// 03: ldc2_w 97238540863777
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 49046471118803
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 16
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 32
// 22: lshl
// 23: bipush 32
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: pop2
// 2b: ldc2_w 2508169249906328174
// 2e: lload 2
// 2f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: astore 7
// 36: aload 0
// 37: iload 4
// 39: i2c
// 3a: iload 5
// 3c: i2c
// 3d: iload 6
// 3f: invokespecial su/catlean/fq.V (CCI)Z
// 42: aload 7
// 44: ifnonnull 6f
// 47: ifeq a7
// 4a: goto 57
// 4d: ldc2_w 2517379926986622445
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 5a: checkcast java/util/Collection
// 5d: invokeinterface java/util/Collection.isEmpty ()Z 1
// 62: goto 6f
// 65: ldc2_w 2517379926986622445
// 68: lload 2
// 69: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: athrow
// 6f: aload 7
// 71: ifnonnull 85
// 74: ifne 88
// 77: goto 84
// 7a: ldc2_w 2517379926986622445
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: bipush 1
// 85: goto 89
// 88: bipush 0
// 89: ifeq a7
// 8c: aload 1
// 8d: dconst_0
// 8e: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 91: aload 1
// 92: dconst_0
// 93: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 96: aload 1
// 97: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 9a: goto a7
// 9d: ldc2_w 2517379926986622445
// a0: lload 2
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: return
}

@Flow
private final void o(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/fq.a J
// 003: ldc2_w 81424778751646
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 6418727472793
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 52052382452514
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 58584146756177
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 77334384453332
// 022: lxor
// 023: dup2
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 32
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: lstore 11
// 033: pop2
// 034: dup2
// 035: ldc2_w 44200648902489
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 66495739547067
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 100718322115486
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 69156335626348
// 04d: lxor
// 04e: dup2
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 16
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: dup2
// 060: bipush 32
// 062: lshl
// 063: bipush 32
// 065: lushr
// 066: l2i
// 067: istore 21
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 49638304055676
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 76609870861405
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 100916728715227
// 07c: lxor
// 07d: lstore 26
// 07f: pop2
// 080: ldc2_w -8831034561500207663
// 083: lload 2
// 084: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: astore 33
// 08b: aload 0
// 08c: iload 19
// 08e: i2c
// 08f: iload 20
// 091: i2c
// 092: iload 21
// 094: invokespecial su/catlean/fq.V (CCI)Z
// 097: ifne 0a5
// 09a: return
// 09b: ldc2_w -8840401371379260846
// 09e: lload 2
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: getstatic su/catlean/fq.b Lnet/minecraft/class_2338;
// 0a8: ifnull 117
// 0ab: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 0ae: checkcast java/util/Collection
// 0b1: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0b6: aload 33
// 0b8: ifnonnull 0d9
// 0bb: goto 0c8
// 0be: ldc2_w -8840401371379260846
// 0c1: lload 2
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: ifne 0dc
// 0cb: goto 0d8
// 0ce: ldc2_w -8840401371379260846
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: bipush 1
// 0d9: goto 0dd
// 0dc: bipush 0
// 0dd: ifeq 117
// 0e0: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0e3: new net/minecraft/class_238
// 0e6: dup
// 0e7: getstatic su/catlean/fq.b Lnet/minecraft/class_2338;
// 0ea: dup
// 0eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ee: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0f1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0f4: lload 13
// 0f6: bipush 0
// 0f7: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 0fa: aconst_null
// 0fb: bipush 4
// 0fc: aconst_null
// 0fd: astore 28
// 0ff: istore 29
// 101: astore 30
// 103: astore 31
// 105: astore 32
// 107: lload 22
// 109: aload 32
// 10b: aload 31
// 10d: aload 30
// 10f: iload 29
// 111: aload 28
// 113: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 116: pop
// 117: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 11a: lload 22
// 11c: getstatic su/catlean/fq.G Lnet/minecraft/class_238;
// 11f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 122: lload 13
// 124: bipush 0
// 125: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 128: aconst_null
// 129: bipush 4
// 12a: aconst_null
// 12b: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 12e: pop
// 12f: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 132: invokevirtual java/util/ArrayList.isEmpty ()Z
// 135: aload 33
// 137: ifnonnull 169
// 13a: ifeq 14b
// 13d: goto 14a
// 140: ldc2_w -8840401371379260846
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: return
// 14b: lload 26
// 14d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 150: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 153: dup
// 154: sipush 18832
// 157: ldc2_w 6546136039249066240
// 15a: lload 2
// 15b: lxor
// 15c: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/fq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 164: lload 6
// 166: invokestatic su/catlean/xa.K (Lnet/minecraft/class_1799;J)Z
// 169: aload 33
// 16b: ifnonnull 1bc
// 16e: ifeq 1ae
// 171: goto 17e
// 174: ldc2_w -8840401371379260846
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 181: lload 26
// 183: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 186: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 189: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 18c: sipush 17090
// 18f: ldc2_w 1343109945824081868
// 192: lload 2
// 193: lxor
// 194: invokedynamic k (IJ)I bsm=su/catlean/fq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: irem
// 19a: bipush 1
// 19b: iadd
// 19c: lload 8
// 19e: invokevirtual su/catlean/gg.f (IJ)V
// 1a1: goto 1ae
// 1a4: ldc2_w -8840401371379260846
// 1a7: lload 2
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: getstatic su/catlean/fq.J Lsu/catlean/bg;
// 1b1: aload 0
// 1b2: lload 4
// 1b4: invokespecial su/catlean/fq.p (J)I
// 1b7: lload 15
// 1b9: invokevirtual su/catlean/bg.q (IJ)Z
// 1bc: ifeq 270
// 1bf: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 1c2: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 1c5: invokevirtual java/util/ArrayList.size ()I
// 1c8: bipush 1
// 1c9: isub
// 1ca: bipush 1
// 1cb: aload 33
// 1cd: ifnonnull 204
// 1d0: goto 1dd
// 1d3: ldc2_w -8840401371379260846
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: if_icmpgt 1fb
// 1e0: goto 1ed
// 1e3: ldc2_w -8840401371379260846
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: bipush 0
// 1ee: goto 20c
// 1f1: ldc2_w -8840401371379260846
// 1f4: lload 2
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: bipush 0
// 1fc: getstatic su/catlean/fq.I Ljava/util/ArrayList;
// 1ff: invokevirtual java/util/ArrayList.size ()I
// 202: bipush 1
// 203: isub
// 204: bipush 0
// 205: lload 24
// 207: bipush 4
// 208: aconst_null
// 209: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 20c: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
// 20f: dup
// 210: sipush 14333
// 213: ldc2_w 1606386460648228728
// 216: lload 2
// 217: lxor
// 218: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/fq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 220: checkcast net/minecraft/class_2338
// 223: astore 34
// 225: iload 10
// 227: lload 11
// 229: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 22c: aload 34
// 22e: astore 35
// 230: aload 35
// 232: astore 36
// 234: astore 38
// 236: bipush 0
// 237: istore 37
// 239: getstatic su/catlean/fq.x Lsu/catlean/fq;
// 23c: pop
// 23d: aload 36
// 23f: putstatic su/catlean/fq.b Lnet/minecraft/class_2338;
// 242: aload 38
// 244: aload 35
// 246: lload 26
// 248: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24b: invokevirtual net/minecraft/class_746.method_5735 ()Lnet/minecraft/class_2350;
// 24e: invokevirtual net/minecraft/class_636.method_2910 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 251: pop
// 252: iload 10
// 254: lload 11
// 256: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 259: invokevirtual net/minecraft/class_636.method_2925 ()V
// 25c: new net/minecraft/class_2879
// 25f: dup
// 260: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 263: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 266: checkcast net/minecraft/class_2596
// 269: lload 17
// 26b: dup2_x1
// 26c: pop2
// 26d: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 270: return
}

@Flow
private final void f(LightMapUpdateEvent var1) {
var1.cancel();
}

private final class_238 v(long var1) {
var1 = a ^ var1;
int var3 = (int)((var1 ^ 136707800801219L) >>> 56);
long var4 = (var1 ^ 136707800801219L) << 8 >>> 8;
long var6 = var1 ^ 129459912836904L;
long var8 = var1 ^ 16212725838380L;
long var10 = var1 ^ 96571272423122L;
return new class_238(
zf.v(var10).method_23317() - this.A(var8),
zf.v(var10).method_23318() - this.D(var6),
zf.v(var10).method_23321() - this.A(var8),
zf.v(var10).method_23317() + this.A(var8),
zf.v(var10).method_23318() + this.E((byte)var3, var4),
zf.v(var10).method_23321() + this.A(var8)
);
}

private final ArrayList W(long param1, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 16
// 003: lshl
// 004: iload 3
// 005: i2l
// 006: bipush 48
// 008: lshl
// 009: bipush 48
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/fq.a J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 92611532231384
// 019: lxor
// 01a: dup2
// 01b: bipush 56
// 01d: lushr
// 01e: l2i
// 01f: istore 6
// 021: dup2
// 022: bipush 8
// 024: lshl
// 025: bipush 8
// 027: lushr
// 028: lstore 7
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 61250122362531
// 02f: lxor
// 030: lstore 9
// 032: dup2
// 033: ldc2_w 31845932690376
// 036: lxor
// 037: dup2
// 038: bipush 56
// 03a: lushr
// 03b: l2i
// 03c: istore 11
// 03e: dup2
// 03f: bipush 8
// 041: lshl
// 042: bipush 8
// 044: lushr
// 045: lstore 12
// 047: pop2
// 048: dup2
// 049: ldc2_w 23215547675427
// 04c: lxor
// 04d: lstore 14
// 04f: dup2
// 050: ldc2_w 58689522805886
// 053: lxor
// 054: lstore 16
// 056: dup2
// 057: ldc2_w 121073645733415
// 05a: lxor
// 05b: lstore 18
// 05d: dup2
// 05e: ldc2_w 60987294454489
// 061: lxor
// 062: lstore 20
// 064: pop2
// 065: ldc2_w 4644249592300626131
// 068: lload 4
// 06a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: aload 0
// 070: lload 20
// 072: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 075: iload 6
// 077: i2b
// 078: swap
// 079: lload 7
// 07b: dup2_x1
// 07c: pop2
// 07d: checkcast net/minecraft/class_1297
// 080: invokevirtual su/catlean/fq.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 083: checkcast net/minecraft/class_2374
// 086: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 089: dup
// 08a: sipush 993
// 08d: ldc2_w 4927858526880183908
// 090: lload 4
// 092: lxor
// 093: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/fq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09b: astore 23
// 09d: astore 22
// 09f: new java/util/ArrayList
// 0a2: dup
// 0a3: invokespecial java/util/ArrayList.<init> ()V
// 0a6: astore 24
// 0a8: aload 23
// 0aa: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0ad: aload 0
// 0ae: lload 18
// 0b0: invokespecial su/catlean/fq.A (J)I
// 0b3: isub
// 0b4: istore 25
// 0b6: aload 23
// 0b8: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0bb: aload 0
// 0bc: lload 18
// 0be: invokespecial su/catlean/fq.A (J)I
// 0c1: iadd
// 0c2: istore 26
// 0c4: iload 25
// 0c6: iload 26
// 0c8: aload 22
// 0ca: ifnonnull 0f7
// 0cd: if_icmpgt 2bf
// 0d0: goto 0de
// 0d3: ldc2_w 4635041250592024400
// 0d6: lload 4
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 23
// 0e0: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0e3: aload 0
// 0e4: lload 14
// 0e6: invokespecial su/catlean/fq.D (J)I
// 0e9: goto 0f7
// 0ec: ldc2_w 4635041250592024400
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: isub
// 0f8: istore 27
// 0fa: aload 23
// 0fc: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0ff: aload 0
// 100: iload 11
// 102: i2b
// 103: lload 12
// 105: invokespecial su/catlean/fq.E (BJ)I
// 108: iadd
// 109: istore 28
// 10b: iload 27
// 10d: iload 3
// 10e: ifge 2a0
// 111: iload 28
// 113: if_icmpgt 29e
// 116: aload 23
// 118: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 11b: aload 0
// 11c: lload 18
// 11e: invokespecial su/catlean/fq.A (J)I
// 121: isub
// 122: istore 29
// 124: aload 23
// 126: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 129: aload 0
// 12a: lload 18
// 12c: invokespecial su/catlean/fq.A (J)I
// 12f: iadd
// 130: istore 30
// 132: iload 29
// 134: iload 30
// 136: aload 22
// 138: ifnonnull 2a2
// 13b: if_icmpgt 264
// 13e: new net/minecraft/class_2338
// 141: dup
// 142: iload 25
// 144: iload 27
// 146: iload 29
// 148: invokespecial net/minecraft/class_2338.<init> (III)V
// 14b: astore 31
// 14d: lload 16
// 14f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 152: aload 31
// 154: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 157: aload 22
// 159: ifnonnull 266
// 15c: ifne 22a
// 15f: aload 0
// 160: lload 9
// 162: invokespecial su/catlean/fq.q (J)Z
// 165: aload 22
// 167: ifnonnull 22c
// 16a: goto 178
// 16d: ldc2_w 4635041250592024400
// 170: lload 4
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: aload 22
// 17a: ifnonnull 229
// 17d: goto 18b
// 180: ldc2_w 4635041250592024400
// 183: lload 4
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: iload 3
// 18c: ifge 229
// 18f: ifeq 222
// 192: goto 1a0
// 195: ldc2_w 4635041250592024400
// 198: lload 4
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: iload 25
// 1a2: bipush 2
// 1a3: irem
// 1a4: aload 22
// 1a6: ifnonnull 22c
// 1a9: goto 1b7
// 1ac: ldc2_w 4635041250592024400
// 1af: lload 4
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: ifeq 22a
// 1ba: goto 1c8
// 1bd: ldc2_w 4635041250592024400
// 1c0: lload 4
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: iload 27
// 1ca: bipush 2
// 1cb: irem
// 1cc: iload 3
// 1cd: ifgt 22c
// 1d0: aload 22
// 1d2: ifnonnull 22c
// 1d5: goto 1e3
// 1d8: ldc2_w 4635041250592024400
// 1db: lload 4
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: ifeq 22a
// 1e6: goto 1f4
// 1e9: ldc2_w 4635041250592024400
// 1ec: lload 4
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: iload 29
// 1f6: bipush 2
// 1f7: irem
// 1f8: aload 22
// 1fa: ifnonnull 229
// 1fd: goto 20b
// 200: ldc2_w 4635041250592024400
// 203: lload 4
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: ifne 222
// 20e: goto 21c
// 211: ldc2_w 4635041250592024400
// 214: lload 4
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: lload 1
// 21d: lconst_0
// 21e: lcmp
// 21f: ifgt 22a
// 222: aload 24
// 224: aload 31
// 226: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 229: pop
// 22a: iload 29
// 22c: iload 30
// 22e: aload 22
// 230: lload 1
// 231: lconst_0
// 232: lcmp
// 233: iflt 270
// 236: ifnonnull 268
// 239: if_icmpeq 264
// 23c: goto 24a
// 23f: ldc2_w 4635041250592024400
// 242: lload 4
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: iinc 29 1
// 24d: aload 22
// 24f: ifnull 13e
// 252: iload 3
// 253: ifgt 22a
// 256: goto 264
// 259: ldc2_w 4635041250592024400
// 25c: lload 4
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: iload 27
// 266: iload 28
// 268: lload 1
// 269: lconst_0
// 26a: lcmp
// 26b: ifle 2a2
// 26e: aload 22
// 270: ifnonnull 2a2
// 273: if_icmpeq 29e
// 276: goto 284
// 279: ldc2_w 4635041250592024400
// 27c: lload 4
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: iinc 27 1
// 287: aload 22
// 289: ifnull 116
// 28c: iload 3
// 28d: ifgt 264
// 290: goto 29e
// 293: ldc2_w 4635041250592024400
// 296: lload 4
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: iload 25
// 2a0: iload 26
// 2a2: if_icmpeq 2bf
// 2a5: iinc 25 1
// 2a8: aload 22
// 2aa: ifnull 0de
// 2ad: iload 3
// 2ae: ifge 10b
// 2b1: goto 2bf
// 2b4: ldc2_w 4635041250592024400
// 2b7: lload 4
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: aload 24
// 2c1: areturn
}

private static final boolean l() {
long var0 = a ^ 7118055784217L;
long var10001 = var0 ^ 125974964173291L;
int var2 = (int)((var0 ^ 125974964173291L) >>> 48);
int var3 = (int)((var0 ^ 125974964173291L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return x.V((char)var2, (char)var3, var4);
}

private static final boolean P() {
long var0 = a ^ 43988557729605L;
long var10001 = var0 ^ 102162164697527L;
int var2 = (int)((var0 ^ 102162164697527L) >>> 48);
int var3 = (int)((var0 ^ 102162164697527L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return x.V((char)var2, (char)var3, var4);
}

private static final boolean Q() {
long var0 = a ^ 20212403678196L;
long var10001 = var0 ^ 112740894436614L;
int var2 = (int)((var0 ^ 112740894436614L) >>> 48);
int var3 = (int)((var0 ^ 112740894436614L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return x.V((char)var2, (char)var3, var4);
}

private static final boolean C() {
long var0 = a ^ 67722152285480L;
long var10001 = var0 ^ 80798317695962L;
int var2 = (int)((var0 ^ 80798317695962L) >>> 48);
int var3 = (int)((var0 ^ 80798317695962L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return x.V((char)var2, (char)var3, var4);
}

private static final boolean s() {
long var0 = a ^ 72724804738272L;
long var10001 = var0 ^ 60262853237266L;
int var2 = (int)((var0 ^ 60262853237266L) >>> 48);
int var3 = (int)((var0 ^ 60262853237266L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return x.V((char)var2, (char)var3, var4);
}

static {
long var20 = a ^ 32887122775773L;
long var22 = var20 ^ 12910440210981L;
long var24 = var20 ^ 39695649828675L;
long var26 = var20 ^ 103363343039440L;
long var28 = var20 ^ 120055804124244L;
long var30 = var20 ^ 64145871803502L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[27];
int var16 = 0;
String var15 = "s¹½®\u0086Lª\u0085\u00914'¢ö\u0001\u0012\u0087\u00ad§\b\u0086g\u0014õ\u0080\u0018-ö4ûI\u0088¤¿ØÓ\u008f\u0014oëêtFë\u0014\u001eïZ\u0081\u0082\u0010LU²X\u0089`g%BdßýÛ*û'\u0018æ¨Þµ·\u0085²\u001c£$Ú?0\u001e\u009eâ¦Ü+Y\u009fÂr¬\u0010¾\u0005?1¾3!t?\u009a0\u0002àoÆ|\u0010âÿ\u0093\u009aÆ\u0080F\u001efÆ\u0010?\u0007ÀA\u009b\u0018:\u000eP0\u0094æê\u001f]O$u\u000f\u0090÷å\u0090\u0087ÖÙ)iù%\u0018¼ª\u000eÆ\u008bx\nH[ÎF¶öÄÕ0\u0086Ìªh\u000fÏ\u0007¦\u0010ö%ÍJ\u0019¾|û\fî\u0090K\u001b¨\nã\u0018AZ dÁ¶\u0081Ýð:\u0098Ì\u0004Ç\u008d¤µa\u008f³û¨»ó(\u0004\u009e\u00005+\u0015ä\u0088ÑÀÀ<¤æs\u0013¤mQ4Ì\u0089M\f\u008b\n{Õ#SxyÉÆþí\u008f·}\u0099\u0010\u009bó¤ì\u0088\u001dA]«¶»Ò\u0007üÖ& N9ÌJ\u0094]\u0094®^)\u009bÍ\u001f+ï'Ô\u0012§\u009eÅ³@z÷\u000f~\r\u0017ýõi\u0010\\\u0082&\u0002Wðé\t\u0097\u0080Qã,\u0088»l\u0018Rï\u009d\u001e[[\u008b\u0017ºà-\u0083\u0001²0ÍºqÈ\u0011\u001b\fªG àÃÒ|\u0007\u0088\u0001ñ¹T(Ë\u0083ªÇ¦\u000b±\u0083\u0093\u0092\u0016FPmD©xâ%R¥\u0018Ì¶ë\náü\u0012ªWc\u009en\u0080\u0010|õ\u0010\u008f\f\u000f\u0096¤ìÎ\u0010¦\u0085e  ¶W<@/\rR\u0091¬®Å\u0010ÀH3Kî\u008bl\u0080\u0087tÏ{S\u009dø}\u0010%wòÄ+\u0014%ÉK´årù\u0016l@\u0018\u00ad\u0093Ung\u0084\u0084'UÑ(mÚ8¶\u009b½Ýàî/ëi.\u0018\u0089ÖýEa\u009c}q4\u0094Ì\u000bn\\\u0007èy\u0082ðÈ7y¤^\u0010\u0098l?¢\u001eHÜ³¦ì&ÀÑo\u0085¹\u0010]¢\u0016=\u001dl\u0007ªg\u009a\u0012)ÈÓ8\u001aH\t\u008e\u0004X\u0012Ô¬9¬ð·{l ¼«`;S-À¤à(C\u0097tãØ6Sh\u0080ñhg3\u008c)ÐÔF:JGò²\u0002x\u001e_ÚïO\u0096\u0016õ\u009eçÎö'ùTÎk\u001eX;Êlq";
int var17 = "s¹½®\u0086Lª\u0085\u00914'¢ö\u0001\u0012\u0087\u00ad§\b\u0086g\u0014õ\u0080\u0018-ö4ûI\u0088¤¿ØÓ\u008f\u0014oëêtFë\u0014\u001eïZ\u0081\u0082\u0010LU²X\u0089`g%BdßýÛ*û'\u0018æ¨Þµ·\u0085²\u001c£$Ú?0\u001e\u009eâ¦Ü+Y\u009fÂr¬\u0010¾\u0005?1¾3!t?\u009a0\u0002àoÆ|\u0010âÿ\u0093\u009aÆ\u0080F\u001efÆ\u0010?\u0007ÀA\u009b\u0018:\u000eP0\u0094æê\u001f]O$u\u000f\u0090÷å\u0090\u0087ÖÙ)iù%\u0018¼ª\u000eÆ\u008bx\nH[ÎF¶öÄÕ0\u0086Ìªh\u000fÏ\u0007¦\u0010ö%ÍJ\u0019¾|û\fî\u0090K\u001b¨\nã\u0018AZ dÁ¶\u0081Ýð:\u0098Ì\u0004Ç\u008d¤µa\u008f³û¨»ó(\u0004\u009e\u00005+\u0015ä\u0088ÑÀÀ<¤æs\u0013¤mQ4Ì\u0089M\f\u008b\n{Õ#SxyÉÆþí\u008f·}\u0099\u0010\u009bó¤ì\u0088\u001dA]«¶»Ò\u0007üÖ& N9ÌJ\u0094]\u0094®^)\u009bÍ\u001f+ï'Ô\u0012§\u009eÅ³@z÷\u000f~\r\u0017ýõi\u0010\\\u0082&\u0002Wðé\t\u0097\u0080Qã,\u0088»l\u0018Rï\u009d\u001e[[\u008b\u0017ºà-\u0083\u0001²0ÍºqÈ\u0011\u001b\fªG àÃÒ|\u0007\u0088\u0001ñ¹T(Ë\u0083ªÇ¦\u000b±\u0083\u0093\u0092\u0016FPmD©xâ%R¥\u0018Ì¶ë\náü\u0012ªWc\u009en\u0080\u0010|õ\u0010\u008f\f\u000f\u0096¤ìÎ\u0010¦\u0085e  ¶W<@/\rR\u0091¬®Å\u0010ÀH3Kî\u008bl\u0080\u0087tÏ{S\u009dø}\u0010%wòÄ+\u0014%ÉK´årù\u0016l@\u0018\u00ad\u0093Ung\u0084\u0084'UÑ(mÚ8¶\u009b½Ýàî/ëi.\u0018\u0089ÖýEa\u009c}q4\u0094Ì\u000bn\\\u0007èy\u0082ðÈ7y¤^\u0010\u0098l?¢\u001eHÜ³¦ì&ÀÑo\u0085¹\u0010]¢\u0016=\u001dl\u0007ªg\u009a\u0012)ÈÓ8\u001aH\t\u008e\u0004X\u0012Ô¬9¬ð·{l ¼«`;S-À¤à(C\u0097tãØ6Sh\u0080ñhg3\u008c)ÐÔF:JGò²\u0002x\u001e_ÚïO\u0096\u0016õ\u009eçÎö'ùTÎk\u001eX;Êlq"
.length();
char var14 = 24;
int var40 = -1;

label54:
while (true) {
String var42 = var15.substring(++var40, var40 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var42.getBytes("ISO-8859-1"));
String var55 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var55;
if ((var40 += var14) >= var17) {
c = var18;
d = new String[27];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "Q¥¸RÔ\u0084\u0083#<V=\u0010\u001f8\u009d\u0087Æv>f÷£ò\u008ap`¢\u0087\u009fý`ç36f¹]¸Sâ\u0000\u0007\u0081õÝì$¤¥\u0098ñcë¡\u0007NÐS/ùÍ\u001b<ØW1Ó@\t\u000eW\u009c\u008f%6ç±Lðe";
int var5 = "Q¥¸RÔ\u0084\u0083#<V=\u0010\u001f8\u009d\u0087Æv>f÷£ò\u008ap`¢\u0087\u009fý`ç36f¹]¸Sâ\u0000\u0007\u0081õÝì$¤¥\u0098ñcë¡\u0007NÐS/ùÍ\u001b<ØW1Ó@\t\u000eW\u009c\u008f%6ç±Lðe"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var45 = var6;
var10001 = var3++;
long var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var63 = -1;

while (true) {
long var8 = var59;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var65 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var63) {
case 0:
var45[var10001] = var65;
if (var2 >= var5) {
f = var6;
h = new Integer[12];
KProperty[] var37 = new KProperty[c<"k">(18659, 3840904799376629160L ^ var20)];
var37[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(fq.class, b<"b">(1181, 3850757092999058516L ^ var20), b<"b">(14604, 3783179242514311646L ^ var20), 0)
);
var37[1] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(5964, 4495394227789875094L ^ var20), b<"b">(31453, 3735896686291397123L ^ var20), 0)
);
var37[2] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(30200, 1778620108998649124L ^ var20), b<"b">(14074, 3551735034058008119L ^ var20), 0)
);
var37[3] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(28502, 5834491343403007902L ^ var20), b<"b">(24310, 7051134589750939187L ^ var20), 0)
);
var37[4] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(27464, 8661812117544647562L ^ var20), b<"b">(24363, 6953153930046148596L ^ var20), 0)
);
var37[5] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(27264, 5004676606729337433L ^ var20), b<"b">(29288, 5706170640764314276L ^ var20), 0)
);
var37[c<"k">(5578, 4246605127518257285L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(fq.class, b<"b">(30786, 8552426159090215065L ^ var20), b<"b">(14551, 1973367702372968476L ^ var20), 0)
);
B = var37;
x = new fq(var30);
jk var46 = x;
String var53 = b<"b">(8704, 4699933540071600861L ^ var20);
class_2248[] var41 = new class_2248[3];
class_2248 var10006 = class_2246.field_10442;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10442, b<"b">(2018, 186152428555687720L ^ var20));
var41[0] = var10006;
var10006 = class_2246.field_29029;
Intrinsics.checkNotNullExpressionValue(class_2246.field_29029, b<"b">(22984, 5954121368190290184L ^ var20));
var41[1] = var10006;
var10006 = class_2246.field_22109;
Intrinsics.checkNotNullExpressionValue(class_2246.field_22109, b<"b">(14518, 1247010816007628917L ^ var20));
var41[2] = var10006;
dg var61 = new dg(CollectionsKt.mutableListOf(var41), var26);
int var10005 = c<"k">(281, 5190741574649648213L ^ var20);
Object var32 = null;
int var33 = var10005;
Object var34 = null;
Object var35 = null;
dg var36 = var61;
X = yp.y(var46, var53, var28, var36, (h)var35, (Function0)var34, var33, var32);
C = yp.t(x, b<"b">(30175, 5284850062993761551L ^ var20), false, var22, null, null, c<"k">(18397, 3768028086598980245L ^ var20), null);
D = yp.t(x, b<"b">(28290, 8742256793164627546L ^ var20), false, var22, null, fq::l, 4, null);
T = yp.L(
x,
b<"b">(12880, 220317337914008209L ^ var20),
c<"k">(9781, 3928624101021791094L ^ var20),
new IntRange(1, c<"k">(13048, 6446646237876332474L ^ var20)),
var24,
null,
fq::P,
c<"k">(7414, 6873343710238673343L ^ var20),
null
);
U = yp.L(
x,
b<"b">(12890, 3187900673602773661L ^ var20),
5,
new IntRange(1, c<"k">(7531, 6123251894524938283L ^ var20)),
var24,
null,
fq::Q,
c<"k">(7414, 6873343710238673343L ^ var20),
null
);
k = yp.L(
x,
b<"b">(12890, 3187900673602773661L ^ var20),
5,
new IntRange(1, c<"k">(12619, 1282159430179726341L ^ var20)),
var24,
null,
fq::C,
c<"k">(7414, 6873343710238673343L ^ var20),
null
);
O = yp.L(
x,
b<"b">(24826, 6950988002066903092L ^ var20),
5,
new IntRange(1, c<"k">(22306, 2610599718603014755L ^ var20)),
var24,
null,
fq::s,
c<"k">(7414, 6873343710238673343L ^ var20),
null
);
J = new bg();
I = new ArrayList();
G = new class_238(class_2338.field_10980);
return;
}
break;
default:
var45[var10001] = var65;
if (var2 < var5) {
continue label36;
}

var4 = "\b_\u0085DÊË\u009céãâ\u0082¾&`a@";
var5 = "\b_\u0085DÊË\u009céãâ\u0082¾&`a@".length();
var2 = 0;
}

byte var52 = var2;
var2 += 8;
var7 = var4.substring(var52, var2).getBytes("ISO-8859-1");
var45 = var6;
var10001 = var3++;
var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var63 = 0;
}
}
}

var14 = var15.charAt(var40);
break;
default:
var18[var16++] = var55;
if ((var40 += var14) < var17) {
var14 = var15.charAt(var40);
continue label54;
}

var15 = "\u0006ì\u000bm\u0098\u008fÝzÝO\u0094±'1ùq^e\u0000zTB\u001e\u0010U'gÐ.{¹¯\u0005\u001d«;òûgMÚC\u001b  \n\u0006â s\u0007O\u008e\u0003Lû\u0000Çî\u00adÕ\u008aV¸Jéü\u0098¢  µÔ\u0017wq_\u0012\u0092\u001cÄ";
var17 = "\u0006ì\u000bm\u0098\u008fÝzÝO\u0094±'1ùq^e\u0000zTB\u001e\u0010U'gÐ.{¹¯\u0005\u001d«;òûgMÚC\u001b  \n\u0006â s\u0007O\u008e\u0003Lû\u0000Çî\u00adÕ\u008aV¸Jéü\u0098¢  µÔ\u0017wq_\u0012\u0092\u001cÄ"
.length();
var14 = '0';
var40 = -1;
}

var42 = var15.substring(++var40, var40 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29757;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/fq", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/fq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12733;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/fq", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/fq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
