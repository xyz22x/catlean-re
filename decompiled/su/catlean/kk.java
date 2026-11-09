package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kk extends _g {
@NotNull
public static final kk a;
static final KProperty[] o;
@NotNull
private static final av e;
@NotNull
private static final cq i;
@Nullable
private static class_243 x;
@NotNull
private static final fd E;
@NotNull
private static class_243 u;
private static final long b = yz.a(8621345471678034559L, 7541880272653035240L, MethodHandles.lookup().lookupClass()).a(34667908258972L);
private static final String[] c;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map j;

private kk(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 53247024532257L;
super(b<"l">(20903, 6315031951243677710L ^ var1), jt.F(), null, 4, null, var3);
}

private final lj A(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 27383087936351L;
return (lj)e.E(this, var3, o[0]);
}

private final void q(long var1, lj var3) {
var1 = b ^ var1;
long var4 = var1 ^ 70593674084285L;
e.b(this, var4, o[0], var3);
}

private final boolean r(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 62337159488096L;
return (Boolean)i.E(this, var3, o[1]);
}

private final void w(long var1, boolean var3) {
var1 = b ^ var1;
long var4 = var1 ^ 70699802282029L;
i.b(this, var4, o[1], var3);
}

private final boolean J(long param1, class_1792 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kk.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w 6906579106332220824
// 009: lload 1
// 00a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 4
// 011: aload 3
// 012: instanceof net/minecraft/class_1776
// 015: aload 4
// 017: ifnull 10f
// 01a: ifne 10e
// 01d: goto 02a
// 020: ldc2_w 6851723044900839231
// 023: lload 1
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: aload 3
// 02b: instanceof net/minecraft/class_1835
// 02e: aload 4
// 030: ifnull 10f
// 033: goto 040
// 036: ldc2_w 6851723044900839231
// 039: lload 1
// 03a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: athrow
// 040: ifne 10e
// 043: goto 050
// 046: ldc2_w 6851723044900839231
// 049: lload 1
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: aload 3
// 051: instanceof net/minecraft/class_1779
// 054: aload 4
// 056: ifnull 10f
// 059: goto 066
// 05c: ldc2_w 6851723044900839231
// 05f: lload 1
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: ifne 10e
// 069: goto 076
// 06c: ldc2_w 6851723044900839231
// 06f: lload 1
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: aload 3
// 077: instanceof net/minecraft/class_1823
// 07a: aload 4
// 07c: ifnull 10f
// 07f: goto 08c
// 082: ldc2_w 6851723044900839231
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifne 10e
// 08f: goto 09c
// 092: ldc2_w 6851723044900839231
// 095: lload 1
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: aload 3
// 09d: instanceof net/minecraft/class_1771
// 0a0: aload 4
// 0a2: ifnull 10f
// 0a5: goto 0b2
// 0a8: ldc2_w 6851723044900839231
// 0ab: lload 1
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: ifne 10e
// 0b5: goto 0c2
// 0b8: ldc2_w 6851723044900839231
// 0bb: lload 1
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: aload 3
// 0c3: instanceof net/minecraft/class_1828
// 0c6: aload 4
// 0c8: ifnull 10f
// 0cb: goto 0d8
// 0ce: ldc2_w 6851723044900839231
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: ifne 10e
// 0db: goto 0e8
// 0de: ldc2_w 6851723044900839231
// 0e1: lload 1
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 3
// 0e9: instanceof net/minecraft/class_1803
// 0ec: aload 4
// 0ee: ifnull 10f
// 0f1: goto 0fe
// 0f4: ldc2_w 6851723044900839231
// 0f7: lload 1
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: ifeq 112
// 101: goto 10e
// 104: ldc2_w 6851723044900839231
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: bipush 1
// 10f: goto 113
// 112: bipush 0
// 113: ireturn
}

private final float W(long var1, class_1792 var3) {
var1 = b ^ var1;

try {
if (var3 instanceof class_1753) {
return 1.0F;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -2412210322373304657L, var1);
}

return 0.4F;
}

private final float B(long param1, class_1792 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kk.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -987650937386848246
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 3
// 12: instanceof net/minecraft/class_1828
// 15: aload 4
// 17: ifnull 3b
// 1a: ifne 56
// 1d: goto 2a
// 20: ldc2_w -971646805445659987
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 3
// 2b: instanceof net/minecraft/class_1803
// 2e: goto 3b
// 31: ldc2_w -971646805445659987
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: aload 4
// 3d: lload 1
// 3e: lconst_0
// 3f: lcmp
// 40: iflt 6f
// 43: ifnull 67
// 46: ifeq 63
// 49: goto 56
// 4c: ldc2_w -971646805445659987
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: ldc 0.39
// 58: freturn
// 59: ldc2_w -971646805445659987
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 3
// 64: instanceof net/minecraft/class_1779
// 67: lload 1
// 68: lconst_0
// 69: lcmp
// 6a: ifle 93
// 6d: aload 4
// 6f: ifnull 93
// 72: ifeq 8f
// 75: goto 82
// 78: ldc2_w -971646805445659987
// 7b: lload 1
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: ldc 0.59
// 84: freturn
// 85: ldc2_w -971646805445659987
// 88: lload 1
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: aload 3
// 90: instanceof net/minecraft/class_1835
// 93: ifeq a2
// 96: fconst_2
// 97: freturn
// 98: ldc2_w -971646805445659987
// 9b: lload 1
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: ldc 1.5
// a4: freturn
}

private final int S(class_1792 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kk.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 5848003303812174697
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 1
// 12: instanceof net/minecraft/class_1828
// 15: aload 4
// 17: ifnull 89
// 1a: ifne 7c
// 1d: goto 2a
// 20: ldc2_w 5901796686471369166
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 1
// 2b: instanceof net/minecraft/class_1803
// 2e: aload 4
// 30: ifnull 89
// 33: goto 40
// 36: ldc2_w 5901796686471369166
// 39: lload 2
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: lload 2
// 41: lconst_0
// 42: lcmp
// 43: ifle 7f
// 46: ifne 7c
// 49: goto 56
// 4c: ldc2_w 5901796686471369166
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 1
// 57: instanceof net/minecraft/class_1779
// 5a: aload 4
// 5c: ifnull 89
// 5f: goto 6c
// 62: ldc2_w 5901796686471369166
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: ifeq 8c
// 6f: goto 7c
// 72: ldc2_w 5901796686471369166
// 75: lload 2
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: sipush 4664
// 7f: ldc2_w 5755177463584573668
// 82: lload 2
// 83: lxor
// 84: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: goto 8d
// 8c: bipush 0
// 8d: ireturn
}

private final float n(class_1792 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kk.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -7387272683649836230
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 1
// 12: instanceof net/minecraft/class_1828
// 15: aload 4
// 17: ifnull 3b
// 1a: ifne 6a
// 1d: goto 2a
// 20: ldc2_w -7371250788776552035
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 1
// 2b: instanceof net/minecraft/class_1803
// 2e: goto 3b
// 31: ldc2_w -7371250788776552035
// 34: lload 2
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: lload 2
// 3c: lconst_0
// 3d: lcmp
// 3e: ifle 67
// 41: aload 4
// 43: ifnull 67
// 46: ifne 6a
// 49: goto 56
// 4c: ldc2_w -7371250788776552035
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 1
// 57: instanceof net/minecraft/class_1779
// 5a: goto 67
// 5d: ldc2_w -7371250788776552035
// 60: lload 2
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: ifeq 79
// 6a: ldc 4.0
// 6c: goto 7b
// 6f: ldc2_w -7371250788776552035
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: ldc 0.5
// 7b: freturn
}

@Flow
private final void v(FreecamStateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kk.b J
// 003: ldc2_w 61226656166478
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 122631261523221
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 15717260121808
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 10529201567923
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 30870431795450
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 51603965139190
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 721458711366944834
// 04a: lload 2
// 04b: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 18
// 052: getstatic su/catlean/kk.x Lnet/minecraft/class_243;
// 055: ifnull 0c3
// 058: aload 0
// 059: lload 4
// 05b: invokespecial su/catlean/kk.A (J)Lsu/catlean/lj;
// 05e: invokevirtual su/catlean/lj.X ()I
// 061: aload 18
// 063: ifnull 0a8
// 066: goto 073
// 069: ldc2_w 778012453398006501
// 06c: lload 2
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: bipush -1
// 074: if_icmpeq 0c3
// 077: goto 084
// 07a: ldc2_w 778012453398006501
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: lload 4
// 087: invokespecial su/catlean/kk.A (J)Lsu/catlean/lj;
// 08a: invokevirtual su/catlean/lj.X ()I
// 08d: iload 10
// 08f: i2s
// 090: swap
// 091: iload 11
// 093: swap
// 094: iload 12
// 096: i2c
// 097: swap
// 098: invokestatic su/catlean/bx.k (SICI)Z
// 09b: goto 0a8
// 09e: ldc2_w 778012453398006501
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: ifeq 0c3
// 0ab: lload 6
// 0ad: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b0: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 0b3: ifnonnull 0ce
// 0b6: goto 0c3
// 0b9: ldc2_w 778012453398006501
// 0bc: lload 2
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: return
// 0c4: ldc2_w 778012453398006501
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: aload 1
// 0cf: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.cancel ()V
// 0d2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0d5: lload 13
// 0d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0da: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0dd: dup
// 0de: sipush 18996
// 0e1: ldc2_w 6039720347198315501
// 0e4: lload 2
// 0e5: lxor
// 0e6: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ee: getstatic su/catlean/kk.x Lnet/minecraft/class_243;
// 0f1: dup
// 0f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f5: dconst_0
// 0f6: lload 13
// 0f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fb: lload 13
// 0fd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 100: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 103: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 106: f2d
// 107: dconst_0
// 108: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 10b: dup
// 10c: sipush 22509
// 10f: ldc2_w 567023875520349731
// 112: lload 2
// 113: lxor
// 114: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11c: getstatic su/catlean/kk.E Lsu/catlean/fd;
// 11f: invokevirtual su/catlean/fd.a ()F
// 122: fstore 15
// 124: astore 16
// 126: astore 17
// 128: lload 8
// 12a: aload 17
// 12c: aload 16
// 12e: fload 15
// 130: invokevirtual su/catlean/zi.q (JLnet/minecraft/class_243;Lnet/minecraft/class_243;F)Lnet/minecraft/class_243;
// 133: astore 19
// 135: aload 1
// 136: aload 19
// 138: getfield net/minecraft/class_243.field_1352 D
// 13b: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setX (D)V
// 13e: aload 1
// 13f: aload 19
// 141: getfield net/minecraft/class_243.field_1351 D
// 144: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setY (D)V
// 147: aload 1
// 148: aload 19
// 14a: getfield net/minecraft/class_243.field_1350 D
// 14d: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setZ (D)V
// 150: aload 1
// 151: lload 6
// 153: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 156: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 159: dup
// 15a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 15d: invokevirtual net/minecraft/class_1297.method_36454 ()F
// 160: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setYaw (F)V
// 163: aload 1
// 164: fconst_0
// 165: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setPitch (F)V
// 168: return
}

@Flow
private final void N(TickEvent var1) {
long var2 = b ^ 92277336064835L;
long var4 = var2 ^ 116586777536477L;
String[] var6 = vm.a<"Å">(4255416366756165967L, var2);

class_746 var10000;
try {
label31: {
if (var6 != null) {
var10000 = zf.F(var4).field_1724;
if (var10000 != null) {
break label31;
}
}

return;
}
} catch (NoWhenBranchMatchedException var9) {
throw vm.a<"Å">(var9, 4305839781421480936L, var2);
}

class_746 var7 = var10000;
boolean var8 = false;
class_243 var10 = var7.method_18798();
Intrinsics.checkNotNullExpressionValue(var10, b<"l">(23203, 3222370596104632954L ^ var2));
u = var10;
}

@Flow
private final void E(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kk.b J
// 003: ldc2_w 11287706877132
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 90586197345175
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 56762747164754
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 64454185309999
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 123942485024894
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 18771640756435
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 37538088379023
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 12910143159771
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 37353259943544
// 03e: lxor
// 03f: dup2
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 18
// 046: dup2
// 047: bipush 16
// 049: lshl
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 19
// 050: dup2
// 051: bipush 48
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 20
// 05a: pop2
// 05b: dup2
// 05c: ldc2_w 99489948228221
// 05f: lxor
// 060: lstore 21
// 062: pop2
// 063: ldc2_w 4936260799987844800
// 066: lload 2
// 067: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: astore 23
// 06e: getstatic su/catlean/kk.E Lsu/catlean/fd;
// 071: aload 0
// 072: lload 4
// 074: invokespecial su/catlean/kk.A (J)Lsu/catlean/lj;
// 077: invokevirtual su/catlean/lj.X ()I
// 07a: iload 18
// 07c: i2s
// 07d: swap
// 07e: iload 19
// 080: swap
// 081: iload 20
// 083: i2c
// 084: swap
// 085: invokestatic su/catlean/bx.k (SICI)Z
// 088: ifeq 099
// 08b: fconst_1
// 08c: goto 09a
// 08f: ldc2_w 4921928476258927719
// 092: lload 2
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: fconst_0
// 09a: lload 8
// 09c: dup2_x1
// 09d: pop2
// 09e: invokevirtual su/catlean/fd.B (JF)V
// 0a1: aconst_null
// 0a2: putstatic su/catlean/kk.x Lnet/minecraft/class_243;
// 0a5: lload 6
// 0a7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0aa: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ad: invokevirtual net/minecraft/class_315.method_42448 ()Lnet/minecraft/class_7172;
// 0b0: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 0b3: dup
// 0b4: sipush 14102
// 0b7: ldc2_w 7056124468057958475
// 0ba: lload 2
// 0bb: lxor
// 0bc: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c4: checkcast java/lang/Boolean
// 0c7: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0ca: istore 24
// 0cc: lload 6
// 0ce: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0d4: invokevirtual net/minecraft/class_315.method_42448 ()Lnet/minecraft/class_7172;
// 0d7: bipush 0
// 0d8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0db: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 0de: lload 12
// 0e0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0e3: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 0e6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0eb: astore 25
// 0ed: aload 25
// 0ef: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f4: ifeq 3c9
// 0f7: aload 25
// 0f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0fe: checkcast net/minecraft/class_742
// 101: astore 26
// 103: aload 26
// 105: invokevirtual net/minecraft/class_742.method_6047 ()Lnet/minecraft/class_1799;
// 108: dup
// 109: sipush 32354
// 10c: ldc2_w 7659671143509106987
// 10f: lload 2
// 110: lxor
// 111: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 119: astore 27
// 11b: aload 26
// 11d: invokevirtual net/minecraft/class_742.method_6079 ()Lnet/minecraft/class_1799;
// 120: dup
// 121: sipush 15060
// 124: ldc2_w 4516788226449794445
// 127: lload 2
// 128: lxor
// 129: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 131: astore 28
// 133: aload 23
// 135: ifnull 3dc
// 138: aload 27
// 13a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 13d: instanceof net/minecraft/class_1753
// 140: aload 23
// 142: ifnull 177
// 145: goto 152
// 148: ldc2_w 4921928476258927719
// 14b: lload 2
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ifne 1cc
// 155: goto 162
// 158: ldc2_w 4921928476258927719
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: aload 27
// 164: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 167: instanceof net/minecraft/class_1764
// 16a: goto 177
// 16d: ldc2_w 4921928476258927719
// 170: lload 2
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: aload 23
// 179: ifnull 1b7
// 17c: ifne 1cc
// 17f: goto 18c
// 182: ldc2_w 4921928476258927719
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: aload 0
// 18d: aload 27
// 18f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 192: dup
// 193: sipush 24340
// 196: ldc2_w 1017474163681263683
// 199: lload 2
// 19a: lxor
// 19b: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a3: lload 14
// 1a5: dup2_x1
// 1a6: pop2
// 1a7: invokespecial su/catlean/kk.J (JLnet/minecraft/class_1792;)Z
// 1aa: goto 1b7
// 1ad: ldc2_w 4921928476258927719
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 23
// 1b9: ifnull 1e4
// 1bc: ifeq 1dc
// 1bf: goto 1cc
// 1c2: ldc2_w 4921928476258927719
// 1c5: lload 2
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1cf: goto 264
// 1d2: ldc2_w 4921928476258927719
// 1d5: lload 2
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 28
// 1de: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1e1: instanceof net/minecraft/class_1753
// 1e4: aload 23
// 1e6: ifnull 20e
// 1e9: ifne 251
// 1ec: goto 1f9
// 1ef: ldc2_w 4921928476258927719
// 1f2: lload 2
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: aload 28
// 1fb: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1fe: instanceof net/minecraft/class_1764
// 201: goto 20e
// 204: ldc2_w 4921928476258927719
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: aload 23
// 210: ifnull 24e
// 213: ifne 251
// 216: goto 223
// 219: ldc2_w 4921928476258927719
// 21c: lload 2
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: aload 0
// 224: aload 28
// 226: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 229: dup
// 22a: sipush 27014
// 22d: ldc2_w 8457245893085836998
// 230: lload 2
// 231: lxor
// 232: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 23a: lload 14
// 23c: dup2_x1
// 23d: pop2
// 23e: invokespecial su/catlean/kk.J (JLnet/minecraft/class_1792;)Z
// 241: goto 24e
// 244: ldc2_w 4921928476258927719
// 247: lload 2
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: ifeq 261
// 251: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 254: goto 264
// 257: ldc2_w 4921928476258927719
// 25a: lload 2
// 25b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: athrow
// 261: goto 0ed
// 264: astore 29
// 266: aload 29
// 268: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 26b: if_acmpne 280
// 26e: aload 28
// 270: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 273: goto 285
// 276: ldc2_w 4921928476258927719
// 279: lload 2
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: aload 27
// 282: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 285: astore 31
// 287: aload 31
// 289: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 28c: aload 31
// 28e: astore 30
// 290: lload 16
// 292: aload 28
// 294: getstatic net/minecraft/class_1893.field_9108 Lnet/minecraft/class_5321;
// 297: dup
// 298: sipush 30700
// 29b: ldc2_w 1865992065072998588
// 29e: lload 2
// 29f: lxor
// 2a0: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a8: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// 2ab: istore 31
// 2ad: lload 16
// 2af: aload 27
// 2b1: getstatic net/minecraft/class_1893.field_9108 Lnet/minecraft/class_5321;
// 2b4: dup
// 2b5: sipush 28295
// 2b8: ldc2_w 6689418008716784083
// 2bb: lload 2
// 2bc: lxor
// 2bd: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c5: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// 2c8: istore 32
// 2ca: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2cd: aload 26
// 2cf: getfield net/minecraft/class_742.field_5982 F
// 2d2: aload 26
// 2d4: invokevirtual net/minecraft/class_742.method_36454 ()F
// 2d7: lload 21
// 2d9: invokevirtual su/catlean/jl.T (FFJ)F
// 2dc: fstore 33
// 2de: aload 28
// 2e0: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 2e3: instanceof net/minecraft/class_1764
// 2e6: aload 23
// 2e8: ifnull 334
// 2eb: ifeq 31f
// 2ee: goto 2fb
// 2f1: ldc2_w 4921928476258927719
// 2f4: lload 2
// 2f5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fa: athrow
// 2fb: iload 31
// 2fd: aload 23
// 2ff: ifnull 334
// 302: goto 30f
// 305: ldc2_w 4921928476258927719
// 308: lload 2
// 309: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30e: athrow
// 30f: ifne 34e
// 312: goto 31f
// 315: ldc2_w 4921928476258927719
// 318: lload 2
// 319: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31e: athrow
// 31f: aload 27
// 321: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 324: instanceof net/minecraft/class_1764
// 327: goto 334
// 32a: ldc2_w 4921928476258927719
// 32d: lload 2
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: aload 23
// 336: ifnull 34b
// 339: ifeq 3b0
// 33c: goto 349
// 33f: ldc2_w 4921928476258927719
// 342: lload 2
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: iload 32
// 34b: ifeq 3b0
// 34e: aload 0
// 34f: aload 26
// 351: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 354: lload 10
// 356: aload 26
// 358: checkcast net/minecraft/class_1657
// 35b: aload 30
// 35d: fload 33
// 35f: sipush 19038
// 362: ldc2_w 8174223822293501226
// 365: lload 2
// 366: lxor
// 367: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: i2f
// 36d: fsub
// 36e: invokevirtual su/catlean/kk.K (JLnet/minecraft/class_1657;Lnet/minecraft/class_1792;F)V
// 371: aload 0
// 372: lload 10
// 374: aload 26
// 376: checkcast net/minecraft/class_1657
// 379: aload 30
// 37b: fload 33
// 37d: invokevirtual su/catlean/kk.K (JLnet/minecraft/class_1657;Lnet/minecraft/class_1792;F)V
// 380: aload 0
// 381: lload 10
// 383: aload 26
// 385: checkcast net/minecraft/class_1657
// 388: aload 30
// 38a: fload 33
// 38c: sipush 19038
// 38f: ldc2_w 8174223822293501226
// 392: lload 2
// 393: lxor
// 394: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: i2f
// 39a: fadd
// 39b: invokevirtual su/catlean/kk.K (JLnet/minecraft/class_1657;Lnet/minecraft/class_1792;F)V
// 39e: aload 23
// 3a0: ifnonnull 0ed
// 3a3: goto 3b0
// 3a6: ldc2_w 4921928476258927719
// 3a9: lload 2
// 3aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3af: athrow
// 3b0: aload 0
// 3b1: aload 26
// 3b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3b6: lload 10
// 3b8: aload 26
// 3ba: checkcast net/minecraft/class_1657
// 3bd: aload 30
// 3bf: fload 33
// 3c1: invokevirtual su/catlean/kk.K (JLnet/minecraft/class_1657;Lnet/minecraft/class_1792;F)V
// 3c4: aload 23
// 3c6: ifnonnull 0ed
// 3c9: lload 6
// 3cb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3ce: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 3d1: invokevirtual net/minecraft/class_315.method_42448 ()Lnet/minecraft/class_7172;
// 3d4: iload 24
// 3d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 3d9: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 3dc: return
}

public final void K(long a, @NotNull class_1657 player, @NotNull class_1792 item, float yaw) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kk.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 113438929977851
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 43669200958935
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 68553378366671
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 10
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 32
// 027: lushr
// 028: l2i
// 029: istore 11
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 12
// 035: pop2
// 036: dup2
// 037: ldc2_w 35266722761014
// 03a: lxor
// 03b: lstore 13
// 03d: dup2
// 03e: ldc2_w 19145649381857
// 041: lxor
// 042: dup2
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 15
// 049: dup2
// 04a: bipush 32
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 16
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 17
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 57665382801247
// 062: lxor
// 063: lstore 18
// 065: dup2
// 066: ldc2_w 33060485018589
// 069: lxor
// 06a: dup2
// 06b: bipush 16
// 06d: lushr
// 06e: lstore 20
// 070: dup2
// 071: bipush 48
// 073: lshl
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 22
// 07a: pop2
// 07b: dup2
// 07c: ldc2_w 76547201118586
// 07f: lxor
// 080: lstore 23
// 082: dup2
// 083: ldc2_w 84735110299012
// 086: lxor
// 087: lstore 25
// 089: dup2
// 08a: ldc2_w 96863288654518
// 08d: lxor
// 08e: lstore 27
// 090: dup2
// 091: ldc2_w 139260226584264
// 094: lxor
// 095: dup2
// 096: bipush 48
// 098: lushr
// 099: l2i
// 09a: istore 29
// 09c: dup2
// 09d: bipush 16
// 09f: lshl
// 0a0: bipush 32
// 0a2: lushr
// 0a3: l2i
// 0a4: istore 30
// 0a6: dup2
// 0a7: bipush 48
// 0a9: lshl
// 0aa: bipush 48
// 0ac: lushr
// 0ad: l2i
// 0ae: istore 31
// 0b0: pop2
// 0b1: dup2
// 0b2: ldc2_w 78655994073053
// 0b5: lxor
// 0b6: lstore 32
// 0b8: dup2
// 0b9: ldc2_w 29538681649855
// 0bc: lxor
// 0bd: lstore 34
// 0bf: dup2
// 0c0: ldc2_w 78092651812532
// 0c3: lxor
// 0c4: lstore 36
// 0c6: dup2
// 0c7: ldc2_w 42583348284161
// 0ca: lxor
// 0cb: lstore 38
// 0cd: dup2
// 0ce: ldc2_w 16425486140372
// 0d1: lxor
// 0d2: lstore 40
// 0d4: dup2
// 0d5: ldc2_w 54307012041082
// 0d8: lxor
// 0d9: lstore 42
// 0db: dup2
// 0dc: ldc2_w 86914051541843
// 0df: lxor
// 0e0: lstore 44
// 0e2: pop2
// 0e3: aload 3
// 0e4: sipush 5667
// 0e7: ldc2_w 6170983544512041154
// 0ea: lload 1
// 0eb: lxor
// 0ec: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0f4: aload 4
// 0f6: sipush 19653
// 0f9: ldc2_w 4257453107802376758
// 0fc: lload 1
// 0fd: lxor
// 0fe: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 106: aconst_null
// 107: putstatic su/catlean/kk.x Lnet/minecraft/class_243;
// 10a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 10d: aload 3
// 10e: getfield net/minecraft/class_1657.field_6014 D
// 111: lload 44
// 113: dup2_x2
// 114: pop2
// 115: aload 3
// 116: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 119: invokevirtual su/catlean/jl.b (JDD)D
// 11c: dstore 51
// 11e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 121: aload 3
// 122: getfield net/minecraft/class_1657.field_6036 D
// 125: lload 44
// 127: dup2_x2
// 128: pop2
// 129: aload 3
// 12a: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 12d: invokevirtual su/catlean/jl.b (JDD)D
// 130: dstore 53
// 132: ldc2_w -2510673747561177239
// 135: lload 1
// 136: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 13e: aload 3
// 13f: getfield net/minecraft/class_1657.field_5969 D
// 142: lload 44
// 144: dup2_x2
// 145: pop2
// 146: aload 3
// 147: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 14a: invokevirtual su/catlean/jl.b (JDD)D
// 14d: dstore 55
// 14f: dload 53
// 151: aload 3
// 152: aload 3
// 153: invokevirtual net/minecraft/class_1657.method_18376 ()Lnet/minecraft/class_4050;
// 156: invokevirtual net/minecraft/class_1657.method_18381 (Lnet/minecraft/class_4050;)F
// 159: f2d
// 15a: dadd
// 15b: dstore 53
// 15d: astore 50
// 15f: aload 0
// 160: lload 38
// 162: invokespecial su/catlean/kk.r (J)Z
// 165: aload 50
// 167: ifnull 18e
// 16a: ifeq 23c
// 16d: goto 17a
// 170: ldc2_w -2456881464704590386
// 173: lload 1
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: dload 53
// 17c: ldc2_w 0.1
// 17f: dsub
// 180: dstore 53
// 182: aload 3
// 183: lload 6
// 185: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 188: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 18e: aload 50
// 190: ifnull 1bc
// 193: ifeq 23c
// 196: goto 1a3
// 199: ldc2_w -2456881464704590386
// 19c: lload 1
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 4
// 1a5: aload 3
// 1a6: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 1a9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1ac: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1af: goto 1bc
// 1b2: ldc2_w -2456881464704590386
// 1b5: lload 1
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: ifeq 210
// 1bf: dload 51
// 1c1: fload 5
// 1c3: ldc 180.0
// 1c5: fdiv
// 1c6: ldc 3.1415927
// 1c8: fmul
// 1c9: f2d
// 1ca: invokestatic java/lang/Math.cos (D)D
// 1cd: d2f
// 1ce: ldc 0.16
// 1d0: fmul
// 1d1: f2d
// 1d2: dadd
// 1d3: dstore 51
// 1d5: dload 55
// 1d7: fload 5
// 1d9: ldc 180.0
// 1db: fdiv
// 1dc: ldc 3.1415927
// 1de: fmul
// 1df: f2d
// 1e0: invokestatic java/lang/Math.sin (D)D
// 1e3: d2f
// 1e4: ldc 0.16
// 1e6: fmul
// 1e7: f2d
// 1e8: dadd
// 1e9: dstore 55
// 1eb: lload 1
// 1ec: lconst_0
// 1ed: lcmp
// 1ee: iflt 203
// 1f1: aload 50
// 1f3: ifnonnull 23c
// 1f6: bipush 4
// 1f7: anewarray 954
// 1fa: ldc2_w -2479850628559022168
// 1fd: lload 1
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: goto 210
// 206: ldc2_w -2456881464704590386
// 209: lload 1
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: dload 51
// 212: fload 5
// 214: ldc 180.0
// 216: fdiv
// 217: ldc 3.1415927
// 219: fmul
// 21a: f2d
// 21b: invokestatic java/lang/Math.cos (D)D
// 21e: d2f
// 21f: ldc 0.16
// 221: fmul
// 222: f2d
// 223: dsub
// 224: dstore 51
// 226: dload 55
// 228: fload 5
// 22a: ldc 180.0
// 22c: fdiv
// 22d: ldc 3.1415927
// 22f: fmul
// 230: f2d
// 231: invokestatic java/lang/Math.sin (D)D
// 234: d2f
// 235: ldc 0.16
// 237: fmul
// 238: f2d
// 239: dsub
// 23a: dstore 55
// 23c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 23f: aload 3
// 240: getfield net/minecraft/class_1657.field_6004 F
// 243: aload 3
// 244: invokevirtual net/minecraft/class_1657.method_36455 ()F
// 247: lload 40
// 249: invokevirtual su/catlean/jl.T (FFJ)F
// 24c: fstore 57
// 24e: aload 0
// 24f: lload 27
// 251: aload 4
// 253: invokespecial su/catlean/kk.W (JLnet/minecraft/class_1792;)F
// 256: fstore 58
// 258: fload 5
// 25a: ldc 180.0
// 25c: fdiv
// 25d: ldc 3.1415927
// 25f: fmul
// 260: f2d
// 261: invokestatic java/lang/Math.sin (D)D
// 264: d2f
// 265: fneg
// 266: fload 57
// 268: ldc 180.0
// 26a: fdiv
// 26b: ldc 3.1415927
// 26d: fmul
// 26e: f2d
// 26f: invokestatic java/lang/Math.cos (D)D
// 272: d2f
// 273: fmul
// 274: fload 58
// 276: fmul
// 277: f2d
// 278: dstore 59
// 27a: fload 57
// 27c: aload 0
// 27d: aload 4
// 27f: lload 8
// 281: invokespecial su/catlean/kk.S (Lnet/minecraft/class_1792;J)I
// 284: i2f
// 285: fsub
// 286: ldc 180.0
// 288: fdiv
// 289: ldc 3.141593
// 28b: fmul
// 28c: f2d
// 28d: invokestatic java/lang/Math.sin (D)D
// 290: d2f
// 291: fneg
// 292: fload 58
// 294: fmul
// 295: f2d
// 296: dstore 61
// 298: fload 5
// 29a: ldc 180.0
// 29c: fdiv
// 29d: ldc 3.1415927
// 29f: fmul
// 2a0: f2d
// 2a1: invokestatic java/lang/Math.cos (D)D
// 2a4: d2f
// 2a5: fload 57
// 2a7: ldc 180.0
// 2a9: fdiv
// 2aa: ldc 3.1415927
// 2ac: fmul
// 2ad: f2d
// 2ae: invokestatic java/lang/Math.cos (D)D
// 2b1: d2f
// 2b2: fmul
// 2b3: fload 58
// 2b5: fmul
// 2b6: f2d
// 2b7: dstore 63
// 2b9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2bc: fconst_0
// 2bd: aload 3
// 2be: invokevirtual net/minecraft/class_1657.method_6048 ()I
// 2c1: i2f
// 2c2: fconst_1
// 2c3: fsub
// 2c4: invokestatic java/lang/Math.max (FF)F
// 2c7: aload 3
// 2c8: invokevirtual net/minecraft/class_1657.method_6048 ()I
// 2cb: i2f
// 2cc: lload 40
// 2ce: invokevirtual su/catlean/jl.T (FFJ)F
// 2d1: ldc 20.0
// 2d3: fdiv
// 2d4: fstore 65
// 2d6: fload 65
// 2d8: fload 65
// 2da: fmul
// 2db: fload 65
// 2dd: fconst_2
// 2de: fmul
// 2df: fadd
// 2e0: ldc 3.0
// 2e2: lload 1
// 2e3: lconst_0
// 2e4: lcmp
// 2e5: iflt 2f3
// 2e8: fdiv
// 2e9: fstore 65
// 2eb: fload 65
// 2ed: aload 50
// 2ef: ifnull 333
// 2f2: fconst_1
// 2f3: fcmpl
// 2f4: ifgt 332
// 2f7: goto 304
// 2fa: ldc2_w -2456881464704590386
// 2fd: lload 1
// 2fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: athrow
// 304: fload 65
// 306: fconst_0
// 307: fcmpg
// 308: aload 50
// 30a: ifnull 32b
// 30d: goto 31a
// 310: ldc2_w -2456881464704590386
// 313: lload 1
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: ifne 32e
// 31d: goto 32a
// 320: ldc2_w -2456881464704590386
// 323: lload 1
// 324: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: athrow
// 32a: bipush 1
// 32b: goto 32f
// 32e: bipush 0
// 32f: ifeq 335
// 332: fconst_1
// 333: fstore 65
// 335: dload 59
// 337: dload 59
// 339: dmul
// 33a: dload 61
// 33c: dload 61
// 33e: dmul
// 33f: dadd
// 340: dload 63
// 342: dload 63
// 344: dmul
// 345: dadd
// 346: d2f
// 347: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 34a: fstore 66
// 34c: dload 59
// 34e: fload 66
// 350: f2d
// 351: ddiv
// 352: dstore 59
// 354: dload 61
// 356: fload 66
// 358: f2d
// 359: ddiv
// 35a: dstore 61
// 35c: dload 63
// 35e: fload 66
// 360: f2d
// 361: ddiv
// 362: dstore 63
// 364: aload 4
// 366: instanceof net/minecraft/class_1753
// 369: lload 1
// 36a: lconst_0
// 36b: lcmp
// 36c: iflt 39a
// 36f: aload 50
// 371: ifnull 39a
// 374: ifeq 395
// 377: goto 384
// 37a: ldc2_w -2456881464704590386
// 37d: lload 1
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: fload 65
// 386: fconst_2
// 387: fmul
// 388: goto 3ad
// 38b: ldc2_w -2456881464704590386
// 38e: lload 1
// 38f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: athrow
// 395: aload 4
// 397: instanceof net/minecraft/class_1764
// 39a: ifeq 3ac
// 39d: ldc 2.2
// 39f: goto 3ad
// 3a2: ldc2_w -2456881464704590386
// 3a5: lload 1
// 3a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ab: athrow
// 3ac: fconst_1
// 3ad: aload 0
// 3ae: lload 36
// 3b0: aload 4
// 3b2: invokespecial su/catlean/kk.B (JLnet/minecraft/class_1792;)F
// 3b5: fmul
// 3b6: fstore 67
// 3b8: dload 59
// 3ba: fload 67
// 3bc: f2d
// 3bd: dmul
// 3be: dstore 59
// 3c0: dload 61
// 3c2: fload 67
// 3c4: f2d
// 3c5: dmul
// 3c6: dstore 61
// 3c8: dload 63
// 3ca: fload 67
// 3cc: f2d
// 3cd: dmul
// 3ce: lload 1
// 3cf: lconst_0
// 3d0: lcmp
// 3d1: ifle 449
// 3d4: dstore 63
// 3d6: aload 50
// 3d8: ifnull 42f
// 3db: aload 3
// 3dc: lload 6
// 3de: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3e1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 3e4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3e7: ifeq 44b
// 3ea: goto 3f7
// 3ed: ldc2_w -2456881464704590386
// 3f0: lload 1
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: dload 59
// 3f9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3fc: getstatic su/catlean/kk.u Lnet/minecraft/class_243;
// 3ff: getfield net/minecraft/class_243.field_1352 D
// 402: lload 44
// 404: dup2_x2
// 405: pop2
// 406: aload 3
// 407: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
// 40a: getfield net/minecraft/class_243.field_1352 D
// 40d: invokevirtual su/catlean/jl.b (JDD)D
// 410: dadd
// 411: dstore 59
// 413: dload 61
// 415: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 418: getstatic su/catlean/kk.u Lnet/minecraft/class_243;
// 41b: getfield net/minecraft/class_243.field_1351 D
// 41e: lload 44
// 420: dup2_x2
// 421: pop2
// 422: aload 3
// 423: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
// 426: getfield net/minecraft/class_243.field_1351 D
// 429: invokevirtual su/catlean/jl.b (JDD)D
// 42c: dadd
// 42d: dstore 61
// 42f: dload 63
// 431: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 434: getstatic su/catlean/kk.u Lnet/minecraft/class_243;
// 437: getfield net/minecraft/class_243.field_1350 D
// 43a: lload 44
// 43c: dup2_x2
// 43d: pop2
// 43e: aload 3
// 43f: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
// 442: getfield net/minecraft/class_243.field_1350 D
// 445: invokevirtual su/catlean/jl.b (JDD)D
// 448: dadd
// 449: dstore 63
// 44b: aconst_null
// 44c: astore 68
// 44e: bipush 0
// 44f: istore 69
// 451: iload 69
// 453: sipush 27032
// 456: ldc2_w 3906656656615161678
// 459: lload 1
// 45a: lxor
// 45b: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 460: if_icmpge bbd
// 463: new net/minecraft/class_243
// 466: dup
// 467: dload 51
// 469: dload 53
// 46b: dload 55
// 46d: invokespecial net/minecraft/class_243.<init> (DDD)V
// 470: astore 68
// 472: dload 51
// 474: dload 59
// 476: dadd
// 477: dstore 51
// 479: dload 53
// 47b: dload 61
// 47d: dadd
// 47e: dstore 53
// 480: dload 55
// 482: dload 63
// 484: dadd
// 485: lload 1
// 486: lconst_0
// 487: lcmp
// 488: ifle 4f5
// 48b: dstore 55
// 48d: aload 50
// 48f: ifnull 4ef
// 492: lload 23
// 494: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 497: dload 51
// 499: dload 53
// 49b: dload 55
// 49d: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 4a0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 4a3: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 4a6: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
// 4a9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4ac: ifeq 4df
// 4af: goto 4bc
// 4b2: ldc2_w -2456881464704590386
// 4b5: lload 1
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: dload 59
// 4be: ldc2_w 0.8
// 4c1: dmul
// 4c2: dstore 59
// 4c4: dload 61
// 4c6: ldc2_w 0.8
// 4c9: dmul
// 4ca: dstore 61
// 4cc: dload 63
// 4ce: ldc2_w 0.8
// 4d1: dmul
// 4d2: dstore 63
// 4d4: lload 1
// 4d5: lconst_0
// 4d6: lcmp
// 4d7: ifle 4f7
// 4da: aload 50
// 4dc: ifnonnull 4f7
// 4df: dload 59
// 4e1: ldc2_w 0.99
// 4e4: dmul
// 4e5: dstore 59
// 4e7: dload 61
// 4e9: ldc2_w 0.99
// 4ec: dmul
// 4ed: dstore 61
// 4ef: dload 63
// 4f1: ldc2_w 0.99
// 4f4: dmul
// 4f5: dstore 63
// 4f7: dload 61
// 4f9: aload 4
// 4fb: instanceof net/minecraft/class_1753
// 4fe: lload 1
// 4ff: lconst_0
// 500: lcmp
// 501: iflt 533
// 504: aload 50
// 506: ifnull 533
// 509: ifeq 529
// 50c: goto 519
// 50f: ldc2_w -2456881464704590386
// 512: lload 1
// 513: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 518: athrow
// 519: ldc2_w 0.05000000074505806
// 51c: goto 549
// 51f: ldc2_w -2456881464704590386
// 522: lload 1
// 523: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 528: athrow
// 529: aload 3
// 52a: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 52d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 530: instanceof net/minecraft/class_1764
// 533: ifeq 546
// 536: ldc2_w 0.05000000074505806
// 539: goto 549
// 53c: ldc2_w -2456881464704590386
// 53f: lload 1
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: ldc2_w 0.03
// 549: dsub
// 54a: dstore 61
// 54c: new net/minecraft/class_243
// 54f: dup
// 550: dload 51
// 552: dload 53
// 554: dload 55
// 556: invokespecial net/minecraft/class_243.<init> (DDD)V
// 559: astore 70
// 55b: lload 23
// 55d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 560: new net/minecraft/class_3959
// 563: dup
// 564: aload 68
// 566: aload 70
// 568: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 56b: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 56e: aload 3
// 56f: checkcast net/minecraft/class_1297
// 572: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 575: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 578: dup
// 579: sipush 19766
// 57c: ldc2_w 4609294196220922819
// 57f: lload 1
// 580: lxor
// 581: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 586: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 589: astore 71
// 58b: aload 71
// 58d: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 590: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 593: if_acmpne 7d5
// 596: getstatic su/catlean/uz.E Lsu/catlean/uz;
// 599: lload 20
// 59b: iload 22
// 59d: i2s
// 59e: invokevirtual su/catlean/uz.e (JS)Z
// 5a1: ifeq 6d4
// 5a4: goto 5b1
// 5a7: ldc2_w -2456881464704590386
// 5aa: lload 1
// 5ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b0: athrow
// 5b1: new net/minecraft/class_238
// 5b4: dup
// 5b5: aload 71
// 5b7: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 5ba: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 5bd: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 5c0: aload 71
// 5c2: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 5c5: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 5c8: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 5cb: i2d
// 5cc: ldc2_w 0.125
// 5cf: dadd
// 5d0: invokevirtual net/minecraft/class_238.method_35578 (D)Lnet/minecraft/class_238;
// 5d3: dup
// 5d4: sipush 16018
// 5d7: ldc2_w 6866817957631555684
// 5da: lload 1
// 5db: lxor
// 5dc: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5e4: astore 72
// 5e6: lload 6
// 5e8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5eb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 5ee: dup
// 5ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5f2: invokevirtual net/minecraft/class_746.method_55754 ()D
// 5f5: d2f
// 5f6: fstore 74
// 5f8: lload 32
// 5fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5fd: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 600: aload 71
// 602: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 605: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 608: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 60b: dstore 75
// 60d: ldc2_w 2.299999952316284
// 610: dload 75
// 612: dcmpg
// 613: aload 50
// 615: lload 1
// 616: lconst_0
// 617: lcmp
// 618: ifle 643
// 61b: ifnull 641
// 61e: ifgt 668
// 621: goto 62e
// 624: ldc2_w -2456881464704590386
// 627: lload 1
// 628: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62d: athrow
// 62e: dload 75
// 630: fload 74
// 632: f2d
// 633: dcmpg
// 634: goto 641
// 637: ldc2_w -2456881464704590386
// 63a: lload 1
// 63b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 640: athrow
// 641: aload 50
// 643: ifnull 665
// 646: ifgt 664
// 649: goto 656
// 64c: ldc2_w -2456881464704590386
// 64f: lload 1
// 650: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 655: athrow
// 656: bipush 1
// 657: goto 669
// 65a: ldc2_w -2456881464704590386
// 65d: lload 1
// 65e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 663: athrow
// 664: bipush 0
// 665: goto 669
// 668: bipush 0
// 669: ifeq 682
// 66c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 66f: lload 18
// 671: bipush 0
// 672: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 675: goto 685
// 678: ldc2_w -2456881464704590386
// 67b: lload 1
// 67c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 681: athrow
// 682: getstatic java/awt/Color.RED Ljava/awt/Color;
// 685: astore 73
// 687: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 68a: lload 42
// 68c: aload 72
// 68e: aload 73
// 690: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 693: aload 73
// 695: aconst_null
// 696: bipush 4
// 697: aconst_null
// 698: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 69b: pop
// 69c: lload 13
// 69e: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6a1: aload 72
// 6a3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6a6: aload 73
// 6a8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6ab: lload 34
// 6ad: aload 73
// 6af: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 6b2: ldc 4.0
// 6b4: fdiv
// 6b5: iload 29
// 6b7: i2c
// 6b8: swap
// 6b9: iload 30
// 6bb: swap
// 6bc: iload 31
// 6be: i2s
// 6bf: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 6c2: aconst_null
// 6c3: bipush 4
// 6c4: aconst_null
// 6c5: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 6c8: pop
// 6c9: lload 1
// 6ca: lconst_0
// 6cb: lcmp
// 6cc: iflt 77f
// 6cf: aload 50
// 6d1: ifnonnull 73e
// 6d4: aload 0
// 6d5: aload 71
// 6d7: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 6da: dup
// 6db: sipush 10249
// 6de: ldc2_w 1454020468195782389
// 6e1: lload 1
// 6e2: lxor
// 6e3: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6eb: aload 0
// 6ec: aload 4
// 6ee: lload 25
// 6f0: invokespecial su/catlean/kk.n (Lnet/minecraft/class_1792;J)F
// 6f3: aload 71
// 6f5: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
// 6f8: dup
// 6f9: sipush 27046
// 6fc: ldc2_w 3675270225768329025
// 6ff: lload 1
// 700: lxor
// 701: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 706: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 709: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 70c: iload 69
// 70e: sipush 4229
// 711: ldc2_w 54805191191545425
// 714: lload 1
// 715: lxor
// 716: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71b: imul
// 71c: lload 18
// 71e: dup2_x1
// 71f: pop2
// 720: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 723: astore 46
// 725: astore 47
// 727: fstore 48
// 729: astore 49
// 72b: iload 15
// 72d: aload 49
// 72f: iload 16
// 731: i2s
// 732: fload 48
// 734: iload 17
// 736: i2s
// 737: aload 47
// 739: aload 46
// 73b: invokespecial su/catlean/kk.W (ILnet/minecraft/class_243;SFSLnet/minecraft/class_2350;Ljava/awt/Color;)V
// 73e: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 741: iload 10
// 743: i2s
// 744: aload 68
// 746: aload 71
// 748: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 74b: dup
// 74c: sipush 32724
// 74f: ldc2_w 7143118408961308963
// 752: lload 1
// 753: lxor
// 754: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 759: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 75c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 75f: lload 18
// 761: iload 69
// 763: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 766: aconst_null
// 767: bipush 0
// 768: iload 11
// 76a: iload 12
// 76c: i2c
// 76d: sipush 15887
// 770: ldc2_w 7857445316685654234
// 773: lload 1
// 774: lxor
// 775: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77a: aconst_null
// 77b: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 77e: pop
// 77f: aload 4
// 781: instanceof net/minecraft/class_1776
// 784: lload 1
// 785: lconst_0
// 786: lcmp
// 787: iflt 7b8
// 78a: aload 50
// 78c: ifnull 7b8
// 78f: ifeq 7d0
// 792: goto 79f
// 795: ldc2_w -2456881464704590386
// 798: lload 1
// 799: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79e: athrow
// 79f: aload 3
// 7a0: lload 6
// 7a2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 7a5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 7a8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 7ab: goto 7b8
// 7ae: ldc2_w -2456881464704590386
// 7b1: lload 1
// 7b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b7: athrow
// 7b8: ifeq 7d0
// 7bb: aload 71
// 7bd: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 7c0: putstatic su/catlean/kk.x Lnet/minecraft/class_243;
// 7c3: goto 7d0
// 7c6: ldc2_w -2456881464704590386
// 7c9: lload 1
// 7ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cf: athrow
// 7d0: aload 50
// 7d2: ifnonnull bbd
// 7d5: lload 23
// 7d7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 7da: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 7dd: dup
// 7de: sipush 30960
// 7e1: ldc2_w 3839660178472517147
// 7e4: lload 1
// 7e5: lxor
// 7e6: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7ee: astore 73
// 7f0: nop
// 7f1: bipush 0
// 7f2: istore 74
// 7f4: aload 73
// 7f6: astore 75
// 7f8: new java/util/ArrayList
// 7fb: dup
// 7fc: invokespecial java/util/ArrayList.<init> ()V
// 7ff: checkcast java/util/Collection
// 802: astore 76
// 804: bipush 0
// 805: istore 77
// 807: aload 75
// 809: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 80e: astore 78
// 810: aload 78
// 812: invokeinterface java/util/Iterator.hasNext ()Z 1
// 817: ifeq 8fe
// 81a: aload 78
// 81c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 821: astore 79
// 823: aload 79
// 825: checkcast net/minecraft/class_1297
// 828: astore 80
// 82a: bipush 0
// 82b: istore 81
// 82d: aload 80
// 82f: instanceof net/minecraft/class_1676
// 832: aload 50
// 834: ifnull 453
// 837: aload 50
// 839: lload 1
// 83a: lconst_0
// 83b: lcmp
// 83c: ifle 834
// 83f: lload 1
// 840: lconst_0
// 841: lcmp
// 842: ifle 874
// 845: ifnull 872
// 848: ifne 8eb
// 84b: goto 858
// 84e: ldc2_w -2456881464704590386
// 851: lload 1
// 852: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 857: athrow
// 858: aload 80
// 85a: lload 6
// 85c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 85f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 862: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 865: goto 872
// 868: ldc2_w -2456881464704590386
// 86b: lload 1
// 86c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 871: athrow
// 872: aload 50
// 874: lload 1
// 875: lconst_0
// 876: lcmp
// 877: ifle 8a7
// 87a: ifnull 8a5
// 87d: ifne 8eb
// 880: goto 88d
// 883: ldc2_w -2456881464704590386
// 886: lload 1
// 887: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88c: athrow
// 88d: aload 80
// 88f: aload 70
// 891: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 894: ldc2_w 25.0
// 897: dcmpg
// 898: goto 8a5
// 89b: ldc2_w -2456881464704590386
// 89e: lload 1
// 89f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a4: athrow
// 8a5: aload 50
// 8a7: ifnull 8e8
// 8aa: iflt 8e7
// 8ad: goto 8ba
// 8b0: ldc2_w -2456881464704590386
// 8b3: lload 1
// 8b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b9: athrow
// 8ba: aload 80
// 8bc: aload 68
// 8be: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 8c1: ldc2_w 25.0
// 8c4: dcmpg
// 8c5: aload 50
// 8c7: ifnull 8e8
// 8ca: goto 8d7
// 8cd: ldc2_w -2456881464704590386
// 8d0: lload 1
// 8d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d6: athrow
// 8d7: ifge 8eb
// 8da: goto 8e7
// 8dd: ldc2_w -2456881464704590386
// 8e0: lload 1
// 8e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e6: athrow
// 8e7: bipush 1
// 8e8: goto 8ec
// 8eb: bipush 0
// 8ec: ifeq 810
// 8ef: aload 76
// 8f1: aload 79
// 8f3: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 8f8: pop
// 8f9: aload 50
// 8fb: ifnonnull 810
// 8fe: aload 76
// 900: checkcast java/util/List
// 903: nop
// 904: astore 72
// 906: bipush 0
// 907: istore 73
// 909: aload 72
// 90b: checkcast java/lang/Iterable
// 90e: astore 74
// 910: bipush 0
// 911: istore 75
// 913: aload 74
// 915: lload 1
// 916: lconst_0
// 917: lcmp
// 918: ifle 7ee
// 91b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 920: astore 76
// 922: aload 76
// 924: invokeinterface java/util/Iterator.hasNext ()Z 1
// 929: ifeq a7b
// 92c: aload 76
// 92e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 933: astore 77
// 935: aload 77
// 937: checkcast net/minecraft/class_1297
// 93a: astore 78
// 93c: bipush 0
// 93d: istore 79
// 93f: aload 78
// 941: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 944: dup
// 945: sipush 18181
// 948: ldc2_w 2785857521230578175
// 94b: lload 1
// 94c: lxor
// 94d: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 952: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 955: astore 80
// 957: aload 80
// 959: aload 68
// 95b: aload 70
// 95d: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
// 960: astore 81
// 962: bipush 0
// 963: istore 82
// 965: aload 50
// 967: ifnull a76
// 96a: aload 81
// 96c: invokevirtual java/util/Optional.isPresent ()Z
// 96f: aload 50
// 971: lload 1
// 972: lconst_0
// 973: lcmp
// 974: ifle a86
// 977: ifnull a84
// 97a: goto 987
// 97d: ldc2_w -2456881464704590386
// 980: lload 1
// 981: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 986: athrow
// 987: ifeq a72
// 98a: goto 997
// 98d: ldc2_w -2456881464704590386
// 990: lload 1
// 991: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 996: athrow
// 997: iload 73
// 999: lload 1
// 99a: lconst_0
// 99b: lcmp
// 99c: iflt a25
// 99f: aload 50
// 9a1: ifnull a25
// 9a4: goto 9b1
// 9a7: ldc2_w -2456881464704590386
// 9aa: lload 1
// 9ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b0: athrow
// 9b1: ifne a72
// 9b4: goto 9c1
// 9b7: ldc2_w -2456881464704590386
// 9ba: lload 1
// 9bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c0: athrow
// 9c1: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 9c4: iload 10
// 9c6: i2s
// 9c7: aload 68
// 9c9: aload 81
// 9cb: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 9ce: dup
// 9cf: sipush 4357
// 9d2: ldc2_w 2586180871461296103
// 9d5: lload 1
// 9d6: lxor
// 9d7: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/kk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9df: checkcast net/minecraft/class_243
// 9e2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 9e5: lload 18
// 9e7: iload 69
// 9e9: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 9ec: aconst_null
// 9ed: bipush 0
// 9ee: iload 11
// 9f0: iload 12
// 9f2: i2c
// 9f3: sipush 14830
// 9f6: ldc2_w 2478768282580053820
// 9f9: lload 1
// 9fa: lxor
// 9fb: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a00: aconst_null
// a01: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// a04: pop
// a05: bipush 1
// a06: istore 73
// a08: aload 50
// a0a: lload 1
// a0b: lconst_0
// a0c: lcmp
// a0d: iflt a78
// a10: ifnull a76
// a13: aload 4
// a15: instanceof net/minecraft/class_1776
// a18: goto a25
// a1b: ldc2_w -2456881464704590386
// a1e: lload 1
// a1f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a24: athrow
// a25: ifeq a72
// a28: aload 3
// a29: aload 50
// a2b: ifnull a69
// a2e: goto a3b
// a31: ldc2_w -2456881464704590386
// a34: lload 1
// a35: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3a: athrow
// a3b: lload 6
// a3d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// a40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// a43: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// a46: ifeq a72
// a49: goto a56
// a4c: ldc2_w -2456881464704590386
// a4f: lload 1
// a50: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a55: athrow
// a56: getstatic su/catlean/kk.a Lsu/catlean/kk;
// a59: pop
// a5a: aload 78
// a5c: goto a69
// a5f: ldc2_w -2456881464704590386
// a62: lload 1
// a63: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a68: athrow
// a69: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// a6c: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// a6f: putstatic su/catlean/kk.x Lnet/minecraft/class_243;
// a72: nop
// a73: nop
// a74: nop
// a75: nop
// a76: aload 50
// a78: ifnonnull 922
// a7b: nop
// a7c: lload 1
// a7d: lconst_0
// a7e: lcmp
// a7f: ifle ba8
// a82: iload 73
// a84: aload 50
// a86: lload 1
// a87: lconst_0
// a88: lcmp
// a89: iflt ac6
// a8c: ifnull ac4
// a8f: ifeq ab1
// a92: goto a9f
// a95: ldc2_w -2456881464704590386
// a98: lload 1
// a99: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9e: athrow
// a9f: aload 50
// aa1: ifnonnull bbd
// aa4: goto ab1
// aa7: ldc2_w -2456881464704590386
// aaa: lload 1
// aab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab0: athrow
// ab1: dload 53
// ab3: ldc2_w -65.0
// ab6: dcmpg
// ab7: goto ac4
// aba: ldc2_w -2456881464704590386
// abd: lload 1
// abe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac3: athrow
// ac4: aload 50
// ac6: lload 1
// ac7: lconst_0
// ac8: lcmp
// ac9: ifle af2
// acc: ifnull af0
// acf: ifle bbd
// ad2: goto adf
// ad5: ldc2_w -2456881464704590386
// ad8: lload 1
// ad9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ade: athrow
// adf: dload 59
// ae1: dconst_0
// ae2: dcmpg
// ae3: goto af0
// ae6: ldc2_w -2456881464704590386
// ae9: lload 1
// aea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aef: athrow
// af0: aload 50
// af2: ifnull b06
// af5: ifne b09
// af8: goto b05
// afb: ldc2_w -2456881464704590386
// afe: lload 1
// aff: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b04: athrow
// b05: bipush 1
// b06: goto b0a
// b09: bipush 0
// b0a: lload 1
// b0b: lconst_0
// b0c: lcmp
// b0d: iflt ba7
// b10: ifeq b7b
// b13: dload 61
// b15: dconst_0
// b16: dcmpg
// b17: aload 50
// b19: ifnull b3a
// b1c: goto b29
// b1f: ldc2_w -2456881464704590386
// b22: lload 1
// b23: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b28: athrow
// b29: ifne b3d
// b2c: goto b39
// b2f: ldc2_w -2456881464704590386
// b32: lload 1
// b33: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b38: athrow
// b39: bipush 1
// b3a: goto b3e
// b3d: bipush 0
// b3e: lload 1
// b3f: lconst_0
// b40: lcmp
// b41: ifle ba7
// b44: ifeq b7b
// b47: dload 63
// b49: dconst_0
// b4a: dcmpg
// b4b: aload 50
// b4d: ifnull b6e
// b50: goto b5d
// b53: ldc2_w -2456881464704590386
// b56: lload 1
// b57: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5c: athrow
// b5d: ifne b71
// b60: goto b6d
// b63: ldc2_w -2456881464704590386
// b66: lload 1
// b67: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6c: athrow
// b6d: bipush 1
// b6e: goto b72
// b71: bipush 0
// b72: lload 1
// b73: lconst_0
// b74: lcmp
// b75: ifle ba7
// b78: ifne bb5
// b7b: getstatic su/catlean/zi.v Lsu/catlean/zi;
// b7e: iload 10
// b80: i2s
// b81: aload 68
// b83: aload 70
// b85: getstatic su/catlean/jh.f Lsu/catlean/jh;
// b88: lload 18
// b8a: iload 69
// b8c: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// b8f: aconst_null
// b90: bipush 0
// b91: iload 11
// b93: iload 12
// b95: i2c
// b96: sipush 14830
// b99: ldc2_w 2478768282580053820
// b9c: lload 1
// b9d: lxor
// b9e: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba3: aconst_null
// ba4: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// ba7: pop
// ba8: goto bb5
// bab: ldc2_w -2456881464704590386
// bae: lload 1
// baf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bb4: athrow
// bb5: iinc 69 1
// bb8: aload 50
// bba: ifnonnull 451
// bbd: lload 1
// bbe: lconst_0
// bbf: lcmp
// bc0: iflt 48d
// bc3: return
}

private final void W(int param1, class_243 param2, short param3, float param4, short param5, class_2350 param6, Color param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:44 from source 41_tail
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
//   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/kk.b J
// 01b: lxor
// 01c: lstore 8
// 01e: lload 8
// 020: dup2
// 021: ldc2_w 12117947063545
// 024: lxor
// 025: dup2
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 10
// 02c: dup2
// 02d: bipush 16
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 11
// 036: dup2
// 037: bipush 48
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 12
// 040: pop2
// 041: pop2
// 042: new java/util/ArrayList
// 045: dup
// 046: invokespecial java/util/ArrayList.<init> ()V
// 049: checkcast java/util/List
// 04c: astore 14
// 04e: ldc2_w -4242814318135113889
// 051: lload 8
// 053: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: aload 2
// 059: getfield net/minecraft/class_243.field_1352 D
// 05c: dstore 15
// 05e: aload 2
// 05f: getfield net/minecraft/class_243.field_1351 D
// 062: dstore 17
// 064: astore 13
// 066: aload 2
// 067: getfield net/minecraft/class_243.field_1350 D
// 06a: dstore 19
// 06c: sipush 19038
// 06f: ldc2_w 8174258250044966069
// 072: lload 8
// 074: lxor
// 075: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: istore 21
// 07c: bipush 0
// 07d: istore 22
// 07f: bipush 0
// 080: sipush 20363
// 083: ldc2_w 8016628026568606061
// 086: lload 8
// 088: lxor
// 089: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: iload 21
// 090: invokestatic kotlin/internal/ProgressionUtilKt.getProgressionLastElement (III)I
// 093: istore 23
// 095: iload 22
// 097: iload 23
// 099: aload 13
// 09b: ifnull 25a
// 09e: if_icmpgt 24b
// 0a1: goto 0af
// 0a4: ldc2_w -4192479553473444360
// 0a7: lload 8
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: iload 22
// 0b1: i2d
// 0b2: ldc2_w 3.141592653589793
// 0b5: dmul
// 0b6: ldc2_w 180.0
// 0b9: ddiv
// 0ba: dstore 24
// 0bc: aload 6
// 0be: getstatic su/catlean/wg.C [I
// 0c1: swap
// 0c2: invokevirtual net/minecraft/class_2350.ordinal ()I
// 0c5: iaload
// 0c6: tableswitch 268 1 6 38 76 114 153 192 230
// 0ec: new kotlin/Triple
// 0ef: dup
// 0f0: dload 24
// 0f2: invokestatic java/lang/Math.sin (D)D
// 0f5: fload 4
// 0f7: f2d
// 0f8: dmul
// 0f9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 0fc: dload 24
// 0fe: invokestatic java/lang/Math.cos (D)D
// 101: fload 4
// 103: f2d
// 104: dmul
// 105: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 108: dconst_0
// 109: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 10c: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 10f: goto 1da
// 112: new kotlin/Triple
// 115: dup
// 116: dload 24
// 118: invokestatic java/lang/Math.sin (D)D
// 11b: fload 4
// 11d: f2d
// 11e: dmul
// 11f: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 122: dload 24
// 124: invokestatic java/lang/Math.cos (D)D
// 127: fload 4
// 129: f2d
// 12a: dmul
// 12b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 12e: dconst_0
// 12f: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 132: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 135: goto 1da
// 138: new kotlin/Triple
// 13b: dup
// 13c: dconst_0
// 13d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 140: dload 24
// 142: invokestatic java/lang/Math.sin (D)D
// 145: fload 4
// 147: f2d
// 148: dmul
// 149: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 14c: dload 24
// 14e: invokestatic java/lang/Math.cos (D)D
// 151: dneg
// 152: fload 4
// 154: f2d
// 155: dmul
// 156: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 159: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 15c: goto 1da
// 15f: new kotlin/Triple
// 162: dup
// 163: dconst_0
// 164: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 167: dload 24
// 169: invokestatic java/lang/Math.sin (D)D
// 16c: fload 4
// 16e: f2d
// 16f: dmul
// 170: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 173: dload 24
// 175: invokestatic java/lang/Math.cos (D)D
// 178: dneg
// 179: fload 4
// 17b: f2d
// 17c: dmul
// 17d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 180: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 183: goto 1da
// 186: new kotlin/Triple
// 189: dup
// 18a: dload 24
// 18c: invokestatic java/lang/Math.cos (D)D
// 18f: fload 4
// 191: f2d
// 192: dmul
// 193: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 196: dconst_0
// 197: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 19a: dload 24
// 19c: invokestatic java/lang/Math.sin (D)D
// 19f: fload 4
// 1a1: f2d
// 1a2: dmul
// 1a3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1a6: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 1a9: goto 1da
// 1ac: new kotlin/Triple
// 1af: dup
// 1b0: dload 24
// 1b2: invokestatic java/lang/Math.cos (D)D
// 1b5: fload 4
// 1b7: f2d
// 1b8: dmul
// 1b9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1bc: dconst_0
// 1bd: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1c0: dload 24
// 1c2: invokestatic java/lang/Math.sin (D)D
// 1c5: fload 4
// 1c7: f2d
// 1c8: dmul
// 1c9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 1cc: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 1cf: goto 1da
// 1d2: new kotlin/NoWhenBranchMatchedException
// 1d5: dup
// 1d6: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 1d9: athrow
// 1da: astore 26
// 1dc: aload 26
// 1de: invokevirtual kotlin/Triple.component1 ()Ljava/lang/Object;
// 1e1: checkcast java/lang/Number
// 1e4: invokevirtual java/lang/Number.doubleValue ()D
// 1e7: dstore 27
// 1e9: aload 26
// 1eb: invokevirtual kotlin/Triple.component2 ()Ljava/lang/Object;
// 1ee: checkcast java/lang/Number
// 1f1: invokevirtual java/lang/Number.doubleValue ()D
// 1f4: dstore 29
// 1f6: aload 26
// 1f8: invokevirtual kotlin/Triple.component3 ()Ljava/lang/Object;
// 1fb: checkcast java/lang/Number
// 1fe: invokevirtual java/lang/Number.doubleValue ()D
// 201: dstore 31
// 203: aload 14
// 205: new net/minecraft/class_243
// 208: dup
// 209: dload 15
// 20b: dload 27
// 20d: dadd
// 20e: dload 17
// 210: dload 29
// 212: dadd
// 213: dload 19
// 215: dload 31
// 217: dadd
// 218: invokespecial net/minecraft/class_243.<init> (DDD)V
// 21b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 220: pop
// 221: iload 22
// 223: iload 3
// 224: ifle 25b
// 227: iload 23
// 229: aload 13
// 22b: ifnull 25a
// 22e: if_icmpeq 24b
// 231: goto 23f
// 234: ldc2_w -4192479553473444360
// 237: lload 8
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: iload 22
// 241: iload 21
// 243: iadd
// 244: istore 22
// 246: aload 13
// 248: ifnonnull 0af
// 24b: bipush 0
// 24c: istore 22
// 24e: aload 14
// 250: invokeinterface java/util/List.size ()I 1
// 255: iload 3
// 256: iflt 25b
// 259: bipush 1
// 25a: isub
// 25b: istore 23
// 25d: iload 22
// 25f: iload 23
// 261: if_icmpge 2a9
// 264: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 267: aload 14
// 269: iload 22
// 26b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 270: iload 10
// 272: i2s
// 273: swap
// 274: checkcast net/minecraft/class_243
// 277: aload 14
// 279: iload 22
// 27b: bipush 1
// 27c: iadd
// 27d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 282: checkcast net/minecraft/class_243
// 285: aload 7
// 287: aconst_null
// 288: bipush 0
// 289: iload 11
// 28b: iload 12
// 28d: i2c
// 28e: sipush 14830
// 291: ldc2_w 2478791526304085770
// 294: lload 8
// 296: lxor
// 297: invokedynamic u (IJ)I bsm=su/catlean/kk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: aconst_null
// 29d: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 2a0: pop
// 2a1: iinc 22 1
// 2a4: aload 13
// 2a6: ifnonnull 25d
// 2a9: iload 3
// 2aa: ifle 2a4
// 2ad: return
}

static {
long var27 = b ^ 13881990078781L;
long var29 = var27 ^ 20288749329976L;
long var31 = var27 ^ 90542327642926L;
long var33 = var27 ^ 77113420233226L;
long var10001 = var27 ^ 108983981037849L;
int var35 = (int)((var27 ^ 108983981037849L) >>> 32);
int var36 = (int)((var27 ^ 108983981037849L) << 32 >>> 48);
int var37 = (int)(var10001 << 48 >>> 48);
long var38 = var27 ^ 32954677836485L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[28];
int var23 = 0;
String var22 = "æWX\u0001M8W¢Ü\u0082>\u0097`F®1\u001dó8\u0085ªs\u008f)£¢|\u0004¨Ãîê¸aªVÛ\u0090¦¤\u0010pÊõ>CÅúÙâ\r\u00adøÕÌóÎ(è\u008cß\u0080,5j\u008e\tôö\u0000\u0096\u0003¹\u0015\u0097Ï\u007f\u0087bXå\u008eàÿ~$\u0006Ñ[\u0081j>/\u007f\u0015H¦Ó ªÏ¢v?½Ñ\u0018¯\u0012\r\u0019Ø§\n5\u0007\u0019ï\u0007O\u0014¿~6*\u0004Í\u009cl\u001eö ß\u007f\u000eò×q:`GÞ\u001e:\u000e//È`fÌ_?éÚ)xÙë´\u0089å¼<(\u001aÐ©Æ1ðfÒÖ¶Ë\"\u009f\u0019\u00ad\u00067\u0082¸p*ð\u0015¬[\u008dï\u0093¶!@É ËÏròU£ú ¸Ü\u0096\u001bN\u008fÕÊ\u0007QìÁj]yEÉà\u0001Cwa\u0098w·¯:÷{¿)e %\u0004-¥A?ÐÏìUÈ¿\u0013\u0081}ýúJÍaÑ\u001aXñ´\u0083TDöA\u00807(\rQ\u0084b\u008b\u008eþ)&Ç!î®]ÊÅ\u0095\u0080G¸Ë±íÒûTyèrá\u000f¾ó\u001fòÑ_\u0098\u0016&8\u000b~Ãý\u0089ù\u0085Y$r5¯\u0003î6ÌÊr0&¿\u0087~á2AYMa;ìp\u0098.#Àc\u009eX¾:ê \u0003ÓV¹à¼\u0003.v:ÉË{(g\u000bAêÞ×:BF\u0005L\u0083úàõ\u001631\u0096ÛA\u009ce8\u0002Û\u0095ôõ~G\u0082\u0015ºt~\u000fGí%\u0018ë\u0010{P;1æïíMbÑ&4¾\u0006£\u0012U\u0097Ýâãö\u0018\u0014\u0097\u0014\u008aw9ÒÃgïVè5M÷¾{I\u0092\u0019Í$\u0012\u001d(ÏùË ,µû·\u0018\u0004\tÀ@N>b\u0003!.\u008a\u0080\u001aà\u0015\u009eÕ\u0083<\u0097VÝ8ÝÞ2\u0000]}\rÂ(¥ÚQ+×ò«\u0088\bg?õ\u008boÜëh\u001c.\u009bõCË\n.\u009c\u0093Saî\"\u0004G`\u009bc\\\u0002\u009f\u0002 '\u009a¬\u001fË\u008aGqnwá\u0006\u001a5Ä/Gà\u0015:¤î' ú¥S£cûÉÖ\u0018¤¹a7bõq\u001c\u00adêÓÆÓ\u001c°\u008b¼ó\u0086ªålàÛ B\u0013§JAÓ\u00162¯$_Ói ðx³À 7]¡/xQq\u0017 \u0092eûö(â\u0015ã\u001cSl÷\u000e\f>ð»Ïcö\u0003êä8\u0013ÜV>ú\u00882\u001dI\tvC¶+2W\u009c\u0013 \u0094\u008f\u0010TF\u008fßOü@´þ¢Ë\u009a\u0097²¬H\u0018\u0004Rø¨ý(éÑG\u0019\u0080ülC.\u008cÀOã\t\u000eT8-0Ìü¯\u0007¹4¨Í 9\u0092\u0093ÿ©È/©ª\u0091®\u0095Só²è9A\u0095\u008f)f\u000e6&\u0001ÊG\u0005«tà\u0002\u0012\u008b\u0002éÏÁ\u0010\rN±\fÍ\rU\u009aù%â\u00155Í>* \u0083\u0007E\u0089àæªÛZ\u009e\u008czoè|z\u0085§\u009a0É¹U·àÛUð\r\u0006&\u0005\u0018\rs'àBÖ ³TÒ\u0088i\u0094\u00ad®þ\u001föPÃïºLÑ8ëy3OÇÆ\u0005\u0091\u008a\u001ffXÉñ»¯8k7½)CÅ4»¸Ñ.2Õ\u008a\u008dW#Ï'ø{á½´\u001b\u0080.\u001bb\u001a}\f\u0013í*/rþ\u0013";
int var24 = "æWX\u0001M8W¢Ü\u0082>\u0097`F®1\u001dó8\u0085ªs\u008f)£¢|\u0004¨Ãîê¸aªVÛ\u0090¦¤\u0010pÊõ>CÅúÙâ\r\u00adøÕÌóÎ(è\u008cß\u0080,5j\u008e\tôö\u0000\u0096\u0003¹\u0015\u0097Ï\u007f\u0087bXå\u008eàÿ~$\u0006Ñ[\u0081j>/\u007f\u0015H¦Ó ªÏ¢v?½Ñ\u0018¯\u0012\r\u0019Ø§\n5\u0007\u0019ï\u0007O\u0014¿~6*\u0004Í\u009cl\u001eö ß\u007f\u000eò×q:`GÞ\u001e:\u000e//È`fÌ_?éÚ)xÙë´\u0089å¼<(\u001aÐ©Æ1ðfÒÖ¶Ë\"\u009f\u0019\u00ad\u00067\u0082¸p*ð\u0015¬[\u008dï\u0093¶!@É ËÏròU£ú ¸Ü\u0096\u001bN\u008fÕÊ\u0007QìÁj]yEÉà\u0001Cwa\u0098w·¯:÷{¿)e %\u0004-¥A?ÐÏìUÈ¿\u0013\u0081}ýúJÍaÑ\u001aXñ´\u0083TDöA\u00807(\rQ\u0084b\u008b\u008eþ)&Ç!î®]ÊÅ\u0095\u0080G¸Ë±íÒûTyèrá\u000f¾ó\u001fòÑ_\u0098\u0016&8\u000b~Ãý\u0089ù\u0085Y$r5¯\u0003î6ÌÊr0&¿\u0087~á2AYMa;ìp\u0098.#Àc\u009eX¾:ê \u0003ÓV¹à¼\u0003.v:ÉË{(g\u000bAêÞ×:BF\u0005L\u0083úàõ\u001631\u0096ÛA\u009ce8\u0002Û\u0095ôõ~G\u0082\u0015ºt~\u000fGí%\u0018ë\u0010{P;1æïíMbÑ&4¾\u0006£\u0012U\u0097Ýâãö\u0018\u0014\u0097\u0014\u008aw9ÒÃgïVè5M÷¾{I\u0092\u0019Í$\u0012\u001d(ÏùË ,µû·\u0018\u0004\tÀ@N>b\u0003!.\u008a\u0080\u001aà\u0015\u009eÕ\u0083<\u0097VÝ8ÝÞ2\u0000]}\rÂ(¥ÚQ+×ò«\u0088\bg?õ\u008boÜëh\u001c.\u009bõCË\n.\u009c\u0093Saî\"\u0004G`\u009bc\\\u0002\u009f\u0002 '\u009a¬\u001fË\u008aGqnwá\u0006\u001a5Ä/Gà\u0015:¤î' ú¥S£cûÉÖ\u0018¤¹a7bõq\u001c\u00adêÓÆÓ\u001c°\u008b¼ó\u0086ªålàÛ B\u0013§JAÓ\u00162¯$_Ói ðx³À 7]¡/xQq\u0017 \u0092eûö(â\u0015ã\u001cSl÷\u000e\f>ð»Ïcö\u0003êä8\u0013ÜV>ú\u00882\u001dI\tvC¶+2W\u009c\u0013 \u0094\u008f\u0010TF\u008fßOü@´þ¢Ë\u009a\u0097²¬H\u0018\u0004Rø¨ý(éÑG\u0019\u0080ülC.\u008cÀOã\t\u000eT8-0Ìü¯\u0007¹4¨Í 9\u0092\u0093ÿ©È/©ª\u0091®\u0095Só²è9A\u0095\u008f)f\u000e6&\u0001ÊG\u0005«tà\u0002\u0012\u008b\u0002éÏÁ\u0010\rN±\fÍ\rU\u009aù%â\u00155Í>* \u0083\u0007E\u0089àæªÛZ\u009e\u008czoè|z\u0085§\u009a0É¹U·àÛUð\r\u0006&\u0005\u0018\rs'àBÖ ³TÒ\u0088i\u0094\u00ad®þ\u001föPÃïºLÑ8ëy3OÇÆ\u0005\u0091\u008a\u001ffXÉñ»¯8k7½)CÅ4»¸Ñ.2Õ\u008a\u008dW#Ï'ø{á½´\u001b\u0080.\u001bb\u001a}\f\u0013í*/rþ\u0013"
.length();
char var21 = '(';
int var43 = -1;

label64:
while (true) {
String var44 = var22.substring(++var43, var43 + var21);
byte var50 = -1;

while (true) {
byte[] var26 = var18.doFinal(var44.getBytes("ISO-8859-1"));
String var59 = b(var26).intern();
switch (var50) {
case 0:
var25[var23++] = var59;
if ((var43 += var21) >= var24) {
c = var25;
d = new String[28];
j = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[10];
int var10 = 0;
String var11 = "Ú~O\u0097±\u0095\u0011uR\\\u0081\u0094ñ\u0098 aºd]H¿æ-4~Àq\u001dø×ì½/\fÔÜÛ=·\u001dÞ\u0001;\u0086¦=\u0010.Åh\n\u0085\u000bUç-Ì\u0015W¬Q[{8";
int var12 = "Ú~O\u0097±\u0095\u0011uR\\\u0081\u0094ñ\u0098 aºd]H¿æ-4~Àq\u001dø×ì½/\fÔÜÛ=·\u001dÞ\u0001;\u0086¦=\u0010.Åh\n\u0085\u000bUç-Ì\u0015W¬Q[{8"
.length();
byte var9 = 0;

label46:
while (true) {
byte var54 = var9;
var9 += 8;
byte[] var14 = var11.substring(var54, var9).getBytes("ISO-8859-1");
long[] var47 = var13;
int var55 = var10++;
long var63 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var68 = -1;

while (true) {
long var15 = var63;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var71 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var68) {
case 0:
var47[var55] = var71;
if (var9 >= var12) {
g = var13;
h = new Integer[10];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 3933530298231266742L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var66 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var57 = -1;
long var0 = var66;
KProperty[] var40 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kk.class, b<"l">(10310, 7597870766937516783L ^ var27), b<"l">(25686, 5314071875475695349L ^ var27), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kk.class, b<"l">(1299, 4820851901525854125L ^ var27), b<"l">(5186, 928327574721533666L ^ var27), 0)
)
};
o = var40;
a = new kk(var38);
e = yp.J(
a,
b<"l">(23004, 883018510077352800L ^ var27),
new lj(0, false, var33, false, c<"u">(19791, 5563144557499932614L ^ var27), null),
null,
var35,
null,
var36,
(char)var37,
c<"u">(10932, 5497356803332290619L ^ var27),
null
);
i = yp.t(a, b<"l">(20402, 804678695557516544L ^ var27), false, var29, null, null, c<"u">(11317, 9019874044439445182L ^ var27), null);
E = new fd(_s.OUT_QUINT, var0, var31);
class_243 var49 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"l">(18116, 5850362427805058164L ^ var27));
u = var49;
return;
}
break;
default:
var47[var55] = var71;
if (var9 < var12) {
continue label46;
}

var11 = "óÜ\u0096\u0099Õ\u0080\u0080\u0004èçº|Þ\u0082¬ó";
var12 = "óÜ\u0096\u0099Õ\u0080\u0080\u0004èçº|Þ\u0082¬ó".length();
var9 = 0;
}

byte var56 = var9;
var9 += 8;
var14 = var11.substring(var56, var9).getBytes("ISO-8859-1");
var47 = var13;
var55 = var10++;
var63 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var68 = 0;
}
}
}

var21 = var22.charAt(var43);
break;
default:
var25[var23++] = var59;
if ((var43 += var21) < var24) {
var21 = var22.charAt(var43);
continue label64;
}

var22 = "\u0018,|Nh\tRVÔ\u0081«\u0019\u009d\u0001ðk\u0018\r-¿ñw\u0092sy*ÍÌ|\u0087ÂÝ®\u0014ÏØÃ³iq\u0088";
var24 = "\u0018,|Nh\tRVÔ\u0081«\u0019\u009d\u0001ðk\u0018\r-¿ñw\u0092sy*ÍÌ|\u0087ÂÝ®\u0014ÏØÃ³iq\u0088".length();
var21 = 16;
var43 = -1;
}

var44 = var22.substring(++var43, var43 + var21);
var50 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6720;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/kk", var10);
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
throw new RuntimeException("su/catlean/kk" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2663;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/kk", var14);
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
throw new RuntimeException("su/catlean/kk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
