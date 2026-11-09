package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.ClearColorEvent;
import su.catlean.api.event.events.world.ApplyFogEvent;
import su.catlean.gofra.Flow;

public final class km extends _g {
@NotNull
public static final km g;
@NotNull
private static final cq a;
@NotNull
private static final c8 O;
@NotNull
private static final c8 z;
@NotNull
private static final cs h;
@NotNull
private static final cq L;
@NotNull
private static final cq N;
@NotNull
private static final c8 n;
private static long A;
private static final long b = yz.a(-6005477155652132014L, 4869941492332302944L, MethodHandles.lookup().lookupClass()).a(5715448013098L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] i;
private static final Map j;

private km(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 22717286115603L;
super(b<"s">(20293, 7790707156121369090L ^ var1), jt.F(), null, 4, null, var3);
}

private final boolean I(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 26315158077030L;
return (Boolean)a.E(this, var6, S[0]);
}

private final int p(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 118199470562158L;
return ((Number)O.E(this, var6, S[1])).intValue();
}

private final int z(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 98527474888145L;
return ((Number)z.E(this, var3, S[2])).intValue();
}

private final Color q(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 110338222552552L;
return (Color)h.E(this, var6, S[3]);
}

private final boolean V(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 116368162239894L;
return (Boolean)L.E(this, var3, S[4]);
}

private final boolean n(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 50493878259907L;
return (Boolean)N.E(this, var3, S[5]);
}

private final int g(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 61829720299837L;
return ((Number)n.E(this, var3, S[c<"j">(1753, 1418449391720003401L ^ var1)])).intValue();
}

private final void h(long var1, int var3) {
var1 = b ^ var1;
long var4 = var1 ^ 67099513912140L;
n.b(this, var4, S[c<"j">(32006, 6692326523235645708L ^ var1)], var3);
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
// 08: ldc2_w 69599493015750
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 2636128448726849311
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 7
// 1a: lload 3
// 1b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 21: aload 7
// 23: ifnull 48
// 26: ifnull 4e
// 29: goto 36
// 2c: ldc2_w 2658960090954825259
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: lload 5
// 38: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3b: goto 48
// 3e: ldc2_w 2658960090954825259
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: invokevirtual net/minecraft/class_638.method_8532 ()J
// 4b: putstatic su/catlean/km.A J
// 4e: return
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
// 07: dup2
// 08: ldc2_w 27357895196556
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 1431950576299237461
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 7
// 1a: lload 3
// 1b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 21: aload 7
// 23: ifnull 48
// 26: ifnull 52
// 29: goto 36
// 2c: ldc2_w 1417685761240353121
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: lload 5
// 38: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3b: goto 48
// 3e: ldc2_w 1417685761240353121
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: getstatic su/catlean/km.A J
// 4b: getstatic su/catlean/km.A J
// 4e: bipush 1
// 4f: invokevirtual net/minecraft/class_638.method_29089 (JJZ)V
// 52: return
}

@Flow
private final void U(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/km.b J
// 03: ldc2_w 85132104941593
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 110483483081099
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w -4389595421205286753
// 14: lload 2
// 15: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: aload 1
// 1b: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1e: astore 7
// 20: astore 6
// 22: aload 7
// 24: instanceof net/minecraft/class_2761
// 27: aload 6
// 29: ifnull 4f
// 2c: ifeq 6e
// 2f: goto 3c
// 32: ldc2_w -4366546608275875413
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: aload 0
// 3d: lload 4
// 3f: invokespecial su/catlean/km.V (J)Z
// 42: goto 4f
// 45: ldc2_w -4366546608275875413
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: ifeq 6e
// 52: aload 7
// 54: checkcast net/minecraft/class_2761
// 57: invokevirtual net/minecraft/class_2761.comp_3219 ()J
// 5a: putstatic su/catlean/km.A J
// 5d: aload 1
// 5e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 61: goto 6e
// 64: ldc2_w -4366546608275875413
// 67: lload 2
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: return
}

@Flow
public final void m(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/km.b J
// 03: ldc2_w 123097324473163
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 77938495107801
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 25356147514994
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 43733031611375
// 1b: lxor
// 1c: lstore 8
// 1e: dup2
// 1f: ldc2_w 64048646068831
// 22: lxor
// 23: dup2
// 24: bipush 32
// 26: lushr
// 27: l2i
// 28: istore 10
// 2a: dup2
// 2b: bipush 32
// 2d: lshl
// 2e: bipush 48
// 30: lushr
// 31: l2i
// 32: istore 11
// 34: dup2
// 35: bipush 48
// 37: lshl
// 38: bipush 48
// 3a: lushr
// 3b: l2i
// 3c: istore 12
// 3e: pop2
// 3f: dup2
// 40: ldc2_w 126678556189716
// 43: lxor
// 44: lstore 13
// 46: dup2
// 47: ldc2_w 3130746263436
// 4a: lxor
// 4b: lstore 15
// 4d: pop2
// 4e: ldc2_w 5208171768991398861
// 51: lload 2
// 52: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: aload 1
// 58: ldc "e"
// 5a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 5d: astore 17
// 5f: aload 0
// 60: lload 4
// 62: invokespecial su/catlean/km.V (J)Z
// 65: aload 17
// 67: ifnull 9f
// 6a: ifeq cc
// 6d: goto 7a
// 70: ldc2_w 5203006014023275257
// 73: lload 2
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: aload 0
// 7b: aload 17
// 7d: ifnull a3
// 80: goto 8d
// 83: ldc2_w 5203006014023275257
// 86: lload 2
// 87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: athrow
// 8d: lload 15
// 8f: invokespecial su/catlean/km.n (J)Z
// 92: goto 9f
// 95: ldc2_w 5203006014023275257
// 98: lload 2
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: ifeq b5
// a2: aload 0
// a3: aload 0
// a4: iload 10
// a6: iload 11
// a8: i2c
// a9: iload 12
// ab: invokevirtual su/catlean/km.A (ICI)I
// ae: lload 8
// b0: dup2_x1
// b1: pop2
// b2: invokespecial su/catlean/km.h (JI)V
// b5: lload 13
// b7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// ba: aload 0
// bb: lload 6
// bd: invokespecial su/catlean/km.g (J)I
// c0: i2l
// c1: aload 0
// c2: lload 6
// c4: invokespecial su/catlean/km.g (J)I
// c7: i2l
// c8: bipush 0
// c9: invokevirtual net/minecraft/class_638.method_29089 (JJZ)V
// cc: ldc2_w 5228077658166220316
// cf: lload 2
// d0: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: ifnull f2
// d8: bipush 3
// d9: anewarray 4
// dc: ldc2_w 5194619911857535063
// df: lload 2
// e0: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e5: goto f2
// e8: ldc2_w 5203006014023275257
// eb: lload 2
// ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f1: athrow
// f2: return
}

@Flow
private final void O(ApplyFogEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/km.b J
// 003: ldc2_w 34673677405043
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 101191043854313
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 5109712549700
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 79883698600209
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 35746483609114
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 64955882877599
// 043: lxor
// 044: dup2
// 045: bipush 32
// 047: lushr
// 048: lstore 13
// 04a: dup2
// 04b: bipush 32
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 115917730840558
// 059: lxor
// 05a: dup2
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 16
// 061: dup2
// 062: bipush 16
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 17
// 06b: dup2
// 06c: bipush 32
// 06e: lshl
// 06f: bipush 32
// 071: lushr
// 072: l2i
// 073: istore 18
// 075: pop2
// 076: dup2
// 077: ldc2_w 126273602022624
// 07a: lxor
// 07b: dup2
// 07c: bipush 32
// 07e: lushr
// 07f: lstore 19
// 081: dup2
// 082: bipush 32
// 084: lshl
// 085: bipush 32
// 087: lushr
// 088: l2i
// 089: istore 21
// 08b: pop2
// 08c: dup2
// 08d: ldc2_w 58041444129817
// 090: lxor
// 091: dup2
// 092: bipush 32
// 094: lushr
// 095: l2i
// 096: istore 22
// 098: dup2
// 099: bipush 32
// 09b: lshl
// 09c: bipush 48
// 09e: lushr
// 09f: l2i
// 0a0: istore 23
// 0a2: dup2
// 0a3: bipush 48
// 0a5: lshl
// 0a6: bipush 48
// 0a8: lushr
// 0a9: l2i
// 0aa: istore 24
// 0ac: pop2
// 0ad: dup2
// 0ae: ldc2_w 7514346777254
// 0b1: lxor
// 0b2: lstore 25
// 0b4: pop2
// 0b5: ldc2_w -8611070654486742027
// 0b8: lload 2
// 0b9: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: astore 27
// 0c0: aload 0
// 0c1: iload 8
// 0c3: iload 9
// 0c5: iload 10
// 0c7: i2s
// 0c8: invokespecial su/catlean/km.I (IIS)Z
// 0cb: aload 27
// 0cd: ifnull 0f3
// 0d0: ifeq 192
// 0d3: goto 0e0
// 0d6: ldc2_w -8643328960200846655
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: aload 0
// 0e1: lload 11
// 0e3: invokevirtual su/catlean/km.S (J)Z
// 0e6: goto 0f3
// 0e9: ldc2_w -8643328960200846655
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: ifeq 192
// 0f6: aload 1
// 0f7: new org/joml/Vector4f
// 0fa: dup
// 0fb: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0fe: aload 0
// 0ff: lload 13
// 101: iload 15
// 103: invokespecial su/catlean/km.q (JI)Ljava/awt/Color;
// 106: iload 16
// 108: i2c
// 109: iload 17
// 10b: i2s
// 10c: iload 18
// 10e: invokevirtual su/catlean/jl.y (Ljava/awt/Color;CSI)F
// 111: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 114: aload 0
// 115: lload 13
// 117: iload 15
// 119: invokespecial su/catlean/km.q (JI)Ljava/awt/Color;
// 11c: lload 6
// 11e: dup2_x1
// 11f: pop2
// 120: invokevirtual su/catlean/jl.M (JLjava/awt/Color;)F
// 123: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 126: aload 0
// 127: lload 13
// 129: iload 15
// 12b: invokespecial su/catlean/km.q (JI)Ljava/awt/Color;
// 12e: lload 19
// 130: iload 21
// 132: invokevirtual su/catlean/jl.r (Ljava/awt/Color;JI)F
// 135: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 138: aload 0
// 139: lload 13
// 13b: iload 15
// 13d: invokespecial su/catlean/km.q (JI)Ljava/awt/Color;
// 140: lload 4
// 142: dup2_x1
// 143: pop2
// 144: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 147: invokespecial org/joml/Vector4f.<init> (FFFF)V
// 14a: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.setColorVec (Lorg/joml/Vector4f;)V
// 14d: aload 1
// 14e: aload 0
// 14f: iload 22
// 151: iload 23
// 153: iload 24
// 155: invokespecial su/catlean/km.p (III)I
// 158: i2f
// 159: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.setEStart (F)V
// 15c: aload 1
// 15d: aload 0
// 15e: lload 25
// 160: invokespecial su/catlean/km.z (J)I
// 163: i2f
// 164: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.setEEnd (F)V
// 167: aload 1
// 168: aload 0
// 169: iload 22
// 16b: iload 23
// 16d: iload 24
// 16f: invokespecial su/catlean/km.p (III)I
// 172: i2f
// 173: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.setRStart (F)V
// 176: aload 1
// 177: aload 0
// 178: lload 25
// 17a: invokespecial su/catlean/km.z (J)I
// 17d: i2f
// 17e: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.setREnd (F)V
// 181: aload 1
// 182: invokevirtual su/catlean/api/event/events/world/ApplyFogEvent.cancel ()V
// 185: goto 192
// 188: ldc2_w -8643328960200846655
// 18b: lload 2
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: return
}

@Flow
private final void F(ClearColorEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/km.b J
// 03: ldc2_w 87618447395234
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 27066970749888
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 117831924740174
// 2e: lxor
// 2f: dup2
// 30: bipush 32
// 32: lushr
// 33: lstore 7
// 35: dup2
// 36: bipush 32
// 38: lshl
// 39: bipush 32
// 3b: lushr
// 3c: l2i
// 3d: istore 9
// 3f: pop2
// 40: pop2
// 41: ldc2_w -3842128047590229724
// 44: lload 2
// 45: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: astore 10
// 4c: aload 0
// 4d: lload 7
// 4f: iload 9
// 51: invokespecial su/catlean/km.q (JI)Ljava/awt/Color;
// 54: invokevirtual java/awt/Color.getAlpha ()I
// 57: aload 10
// 59: ifnull 84
// 5c: ifeq 87
// 5f: goto 6c
// 62: ldc2_w -3828646669059715056
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: aload 0
// 6d: iload 4
// 6f: iload 5
// 71: iload 6
// 73: i2s
// 74: invokespecial su/catlean/km.I (IIS)Z
// 77: goto 84
// 7a: ldc2_w -3828646669059715056
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: ifne 88
// 87: return
// 88: aload 1
// 89: invokevirtual su/catlean/api/event/events/render/ClearColorEvent.cancel ()V
// 8c: return
}

public final int A(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
String[] var10000 = vm.a<"Å">(5804925790757266181L, var4);
double var7 = ZonedDateTime.now().toLocalTime().toSecondOfDay();
String[] var6 = var10000;
double var9 = var7 / 86400.0 * 24000.0;

try {
int var12 = (int)((var9 - c<"j">(19077, 7171435293468426041L ^ var4) + c<"j">(1645, 6100759102190105560L ^ var4)) % c<"j">(30652, 7221659582919426583L ^ var4));
if (var6 == null) {
vm.a<"Å">(new _g[4], 5779213112573778446L, var4);
}

return var12;
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 5835771790389938737L, var4);
}
}

private static final boolean E() {
long var0 = b ^ 2164718673510L;
long var10001 = var0 ^ 95478264523780L;
int var2 = (int)((var0 ^ 95478264523780L) >>> 32);
int var3 = (int)((var0 ^ 95478264523780L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
return g.I(var2, var3, (short)var4);
}

private static final boolean x() {
long var0 = b ^ 53975927709070L;
long var10001 = var0 ^ 112397024800748L;
int var2 = (int)((var0 ^ 112397024800748L) >>> 32);
int var3 = (int)((var0 ^ 112397024800748L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
return g.I(var2, var3, (short)var4);
}

private static final boolean L() {
long var0 = b ^ 118111927739174L;
long var10001 = var0 ^ 66255578779972L;
int var2 = (int)((var0 ^ 66255578779972L) >>> 32);
int var3 = (int)((var0 ^ 66255578779972L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
return g.I(var2, var3, (short)var4);
}

private static final boolean T() {
long var0 = b ^ 25006080842460L;
long var2 = var0 ^ 69992977277774L;
return g.V(var2);
}

private static final boolean w() {
long var0 = b ^ 70319728954949L;
long var2 = var0 ^ 25160898574295L;
return g.V(var2);
}

static {
long var20 = b ^ 104094697991104L;
long var22 = var20 ^ 79076504661893L;
long var24 = var20 ^ 114678878495459L;
int var26 = (int)((var20 ^ 59152381060368L) >>> 48);
long var27 = (var20 ^ 59152381060368L) << 16 >>> 16;
long var29 = var20 ^ 117855472030218L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[22];
int var16 = 0;
String var15 = "ü;\u000bcÒÒB4C@43\u001fÝQs\u009añõü\u0005J¿*nÞ×ô\u007f\u0004Ã\u00138ä\u0010Î«>Ae>@ps7:\u009f +K\u009bg\u0099¼£~\u0015(BY\u001fs\u0097e°õ\u00adÓ{\u0015,HM\tZ[#UïãFp/ì=6°Æ&\u0018*Lì}\u0011}Òrý\u008ax\u0018¸èê-sóå¿@'\r×\u0018!\u0006«J®ÿ\u0082¯ö¥á¼:år&\u000f\u0099ÜçS\u0096wQ y´9\u001fÁo\u0013ÃÚ$\u0011\u0091mL\u009c\u0015\u009b\u0090l²FL¿\u0007éÿ+m\u0094\u001f#N\u0010ÈÒ¨\u00adØ]À\u0002f\u00adä:×\rç{ \u000e\u0015k\u0004+ç\u0002Po\u0005¯â\u009fÜÃ_È[WÕOR?ræ§\u0001B4U9\u0014\u0010'Ðb+\u0006Ìm\"5\u0082R÷?\f** Û|\u0094ÅHTeb6\u0082Þ¥1ú¨\u009a\u001døU\u001eÝ\u008d¦K·q\u0094C\u0015Pp\u0090 ô¯¸Ì¹v\u009d%6h\u009cÕí\b2\fÊ>þ\u0005¹ymòÆ\u001bj,q®ýl \u0016x\u001a\u001a:\u0015\u0010z@¥ß B7\u000e¦Û`®»þ~9[N{ÖgE\u00ad\u0083,(;\t|Ð¹¨©c\u0000\u0091'?0\\òÒ£1ª%¢\u0018}é3óàsó¿¾µÖÌ§}Î÷+X\u0010óê÷¹$\bs\u0080ä.0·ë\u000f>ç\u0018\u009f-\u009cÞß4Ð\u0090\u008c\u0000Þ=c\u000f\u0081bV;6QãV¾\u0082\u0018µ\u008bZ øY\u0013û¢\u0087Ýûµ¢[¶&\u0099Qñ\u0091LBh\u0018PsS¨\u0018õõ'Öý\u007f\\Êï\u0015äÌÍÓ\u008e\u0091W¨º ÕZ\u0085s\u0081b°\u0015KC\nvÔÓEÏ%¿YI\u001c@\u001a¶\u000f\bßê\u0015¸zÎ ë³9%ú\u001b'o¼ð\u0004\u0005´\u0095üqDF\u0089\u009fA\u001fæ\u0080\u0007Â\u009c\u001b\b\u0082°û \u000b*!Þ\u008büø¯_\u0091\u0006¹\u0004ýT\u0096g©å¡¾\u0086s\u001a¾\u0097\u0011³e\u007f\u0085| B\u0006¦6sä\u000b+&\rè]·!\u008c9\u0083Åá@Ãà\u0081'!\b(e\u0017/Bë";
int var17 = "ü;\u000bcÒÒB4C@43\u001fÝQs\u009añõü\u0005J¿*nÞ×ô\u007f\u0004Ã\u00138ä\u0010Î«>Ae>@ps7:\u009f +K\u009bg\u0099¼£~\u0015(BY\u001fs\u0097e°õ\u00adÓ{\u0015,HM\tZ[#UïãFp/ì=6°Æ&\u0018*Lì}\u0011}Òrý\u008ax\u0018¸èê-sóå¿@'\r×\u0018!\u0006«J®ÿ\u0082¯ö¥á¼:år&\u000f\u0099ÜçS\u0096wQ y´9\u001fÁo\u0013ÃÚ$\u0011\u0091mL\u009c\u0015\u009b\u0090l²FL¿\u0007éÿ+m\u0094\u001f#N\u0010ÈÒ¨\u00adØ]À\u0002f\u00adä:×\rç{ \u000e\u0015k\u0004+ç\u0002Po\u0005¯â\u009fÜÃ_È[WÕOR?ræ§\u0001B4U9\u0014\u0010'Ðb+\u0006Ìm\"5\u0082R÷?\f** Û|\u0094ÅHTeb6\u0082Þ¥1ú¨\u009a\u001døU\u001eÝ\u008d¦K·q\u0094C\u0015Pp\u0090 ô¯¸Ì¹v\u009d%6h\u009cÕí\b2\fÊ>þ\u0005¹ymòÆ\u001bj,q®ýl \u0016x\u001a\u001a:\u0015\u0010z@¥ß B7\u000e¦Û`®»þ~9[N{ÖgE\u00ad\u0083,(;\t|Ð¹¨©c\u0000\u0091'?0\\òÒ£1ª%¢\u0018}é3óàsó¿¾µÖÌ§}Î÷+X\u0010óê÷¹$\bs\u0080ä.0·ë\u000f>ç\u0018\u009f-\u009cÞß4Ð\u0090\u008c\u0000Þ=c\u000f\u0081bV;6QãV¾\u0082\u0018µ\u008bZ øY\u0013û¢\u0087Ýûµ¢[¶&\u0099Qñ\u0091LBh\u0018PsS¨\u0018õõ'Öý\u007f\\Êï\u0015äÌÍÓ\u008e\u0091W¨º ÕZ\u0085s\u0081b°\u0015KC\nvÔÓEÏ%¿YI\u001c@\u001a¶\u000f\bßê\u0015¸zÎ ë³9%ú\u001b'o¼ð\u0004\u0005´\u0095üqDF\u0089\u009fA\u001fæ\u0080\u0007Â\u009c\u001b\b\u0082°û \u000b*!Þ\u008büø¯_\u0091\u0006¹\u0004ýT\u0096g©å¡¾\u0086s\u001a¾\u0097\u0011³e\u007f\u0085| B\u0006¦6sä\u000b+&\rè]·!\u008c9\u0083Åá@Ãà\u0081'!\b(e\u0017/Bë"
.length();
char var14 = ' ';
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var46 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var46;
if ((var34 += var14) >= var17) {
c = var18;
d = new String[22];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[17];
int var3 = 0;
String var4 = "\u0018E\u0005 BØ\r\nQþaZ\u0080Uð\u009fq.ÿè\u001axíkX\u001c\u00814vJÝ\u008e6ö[tµÄÖù\u0001u¿\u0017¼ÎAÞ0qBVMz\u008f^\\Êîr\u001c,6;5l¾h®Ë¢{{«¤)\u0010\u0092z©ù\u0088+\u00946½\u000eshí-*Þ\u008eâÄÃo1\u0002\u0003\u0013HSû9+ùn<ò\u0098\n¥#/\u0086Üo\u0007";
int var5 = "\u0018E\u0005 BØ\r\nQþaZ\u0080Uð\u009fq.ÿè\u001axíkX\u001c\u00814vJÝ\u008e6ö[tµÄÖù\u0001u¿\u0017¼ÎAÞ0qBVMz\u008f^\\Êîr\u001c,6;5l¾h®Ë¢{{«¤)\u0010\u0092z©ù\u0088+\u00946½\u000eshí-*Þ\u008eâÄÃo1\u0002\u0003\u0013HSû9+ùn<ò\u0098\n¥#/\u0086Üo\u0007"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
var10001 = var3++;
long var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var53 = -1;

while (true) {
long var8 = var50;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var55 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var53) {
case 0:
var38[var10001] = var55;
if (var2 >= var5) {
f = var6;
i = new Integer[17];
KProperty[] var31 = new KProperty[c<"j">(28317, 3149690445252207468L ^ var20)];
var31[0] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(2141, 5862564267383287173L ^ var20), b<"s">(18065, 5369059721732170585L ^ var20), 0)
);
var31[1] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(5585, 7692774076491591700L ^ var20), b<"s">(27152, 3947634685489844176L ^ var20), 0)
);
var31[2] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(27045, 4743795668115950698L ^ var20), b<"s">(30693, 6364763981059985961L ^ var20), 0)
);
var31[3] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(29809, 1057125349708435903L ^ var20), b<"s">(17408, 7582799588608614859L ^ var20), 0)
);
var31[4] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(17423, 4765960371527098833L ^ var20), b<"s">(20286, 2691305658420833023L ^ var20), 0)
);
var31[5] = Reflection.property1(
new PropertyReference1Impl(km.class, b<"s">(20202, 6796479243968686897L ^ var20), b<"s">(32647, 3012632718038637144L ^ var20), 0)
);
var31[c<"j">(32006, 6692312471743082751L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(km.class, b<"s">(7213, 6491830010335394287L ^ var20), b<"s">(25859, 1650112199770341577L ^ var20), 0)
);
S = var31;
g = new km(var29);
a = yp.t(g, b<"s">(7442, 5692911708906485973L ^ var20), true, var22, null, null, c<"j">(13949, 1087978749336812431L ^ var20), null);
O = yp.L(
g,
b<"s">(3616, 8739420581131152355L ^ var20),
0,
new IntRange(0, c<"j">(10201, 6608882202961603113L ^ var20)),
var24,
null,
km::E,
c<"j">(34, 975246895596260826L ^ var20),
null
);
z = yp.L(
g,
b<"s">(11731, 6569596502265382942L ^ var20),
c<"j">(12626, 943943010784804001L ^ var20),
new IntRange(c<"j">(11306, 758991189579719134L ^ var20), c<"j">(6339, 1103015998508520756L ^ var20)),
var24,
null,
km::x,
c<"j">(19644, 7513046322939920710L ^ var20),
null
);
h = yp.b(g, (short)var26, b<"s">(26114, 7080587265934296027L ^ var20), new Color(c<"j">(8953, 7724417534120849156L ^ var20)), null, km::L, 4, null, var27);
L = yp.t(g, b<"s">(21865, 5063477382428635309L ^ var20), false, var22, null, null, c<"j">(13347, 7929345464457460191L ^ var20), null);
N = yp.t(g, b<"s">(1267, 9138538472975425850L ^ var20), false, var22, null, km::T, 4, null);
n = yp.L(
g,
b<"s">(22477, 3836633653265445387L ^ var20),
c<"j">(13283, 6793277593119096342L ^ var20),
new IntRange(0, c<"j">(14389, 7957551009364538830L ^ var20)),
var24,
null,
km::w,
c<"j">(19644, 7513046322939920710L ^ var20),
null
);
return;
}
break;
default:
var38[var10001] = var55;
if (var2 < var5) {
continue label36;
}

var4 = "ºñI/\u001d\u0093+«\u0099\u0081Î¦W\u008b\u0011\r";
var5 = "ºñI/\u001d\u0093+«\u0099\u0081Î¦W\u008b\u0011\r".length();
var2 = 0;
}

byte var44 = var2;
var2 += 8;
var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
var38 = var6;
var10001 = var3++;
var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var53 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var46;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "¥¦ ^hÙ#4¿\u0097\u0011\u008eâíÏ\u0018\u008eXY¶TV±è \u0099\u0096H\u0090OÔÌZtÍ=\u0085%\u0089Á \u0099¶\u000fMÕ¥\u009eçª¯Ñc\u0011bd²";
var17 = "¥¦ ^hÙ#4¿\u0097\u0011\u008eâíÏ\u0018\u008eXY¶TV±è \u0099\u0096H\u0090OÔÌZtÍ=\u0085%\u0089Á \u0099¶\u000fMÕ¥\u009eçª¯Ñc\u0011bd²".length();
var14 = 24;
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19613;
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
throw new RuntimeException("su/catlean/km", var10);
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
throw new RuntimeException("su/catlean/km" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25775;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/km", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/km" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
