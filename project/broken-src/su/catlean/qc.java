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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qc extends _g {
@NotNull
public static final qc k;
static final KProperty[] f;
@NotNull
private static final cw V;
@NotNull
private static final av l;
@NotNull
private static final av g;
@NotNull
private static final cq w;
@NotNull
private static final cw j;
@NotNull
private static final cw N;
@NotNull
private static final cw S;
@NotNull
private static final cq a;
private static boolean m;
private static boolean y;
private static int W;
@NotNull
private static final class_1792[] T;
private static boolean e;
private static final long b = yz.a(-2684698560115584595L, 2535245307344694768L, MethodHandles.lookup().lookupClass()).a(63775117434846L);
private static final String[] c;
private static final String[] d;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] n;
private static final Map o;

private qc(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 55105828314781L;
super(b<"m">(29655, 1489708192226968416L ^ var1), jt.I(), null, 4, null, var3);
}

private final zp p(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 30383108391928L;
return (zp)V.E(this, var3, f[0]);
}

private final lj z(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 104965042063631L;
return (lj)l.E(this, var3, f[1]);
}

private final lj v(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 104098402877841L;
return (lj)g.E(this, var3, f[2]);
}

private final boolean q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 11966124694092L;
return (Boolean)w.E(this, var3, f[3]);
}

private final yt t(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
long var6 = var4 ^ 63660395937305L;
return (yt)j.E(this, var6, f[4]);
}

private final wj x(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 106885559255328L;
return (wj)N.E(this, var6, f[5]);
}

private final b_ Q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 40352958733756L;
return (b_)S.E(this, var3, f[c<"v">(26702, 682197092812586205L ^ var1)]);
}

private final boolean h(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 22397923009318L;
return (Boolean)a.E(this, var3, f[c<"v">(15477, 83735921444476532L ^ var1)]);
}

public final boolean r() {
return m;
}

public final void K(boolean <set-?>) {
m = <set-?>;
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
// 08: ldc2_w 10016030373321
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 9607710392669
// 12: lxor
// 13: lstore 7
// 15: pop2
// 16: ldc2_w 2597617212703117212
// 19: lload 1
// 1a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: astore 9
// 21: lload 3
// 22: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 28: ifnull 6d
// 2b: aload 0
// 2c: aload 9
// 2e: ifnull 64
// 31: goto 3e
// 34: ldc2_w 2612159299500069479
// 37: lload 1
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: lload 5
// 40: invokespecial su/catlean/qc.p (J)Lsu/catlean/zp;
// 43: getstatic su/catlean/zp.ENABLE Lsu/catlean/zp;
// 46: if_acmpne 6d
// 49: goto 56
// 4c: ldc2_w 2612159299500069479
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 0
// 57: goto 64
// 5a: ldc2_w 2612159299500069479
// 5d: lload 1
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: bipush 1
// 65: bipush 0
// 66: bipush 2
// 67: lload 7
// 69: aconst_null
// 6a: invokestatic su/catlean/qc.P (Lsu/catlean/qc;ZZIJLjava/lang/Object;)V
// 6d: return
}

@Flow
private final void g(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: ldc2_w 25176315182019
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 118927741236568
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 73098255258849
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 133868008519575
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -1874953692811637142
// 022: lload 2
// 023: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 10
// 02a: aload 0
// 02b: lload 6
// 02d: invokespecial su/catlean/qc.h (J)Z
// 030: aload 10
// 032: ifnull 058
// 035: ifeq 11c
// 038: goto 045
// 03b: ldc2_w -1894320475093036143
// 03e: lload 2
// 03f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: athrow
// 045: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 048: invokevirtual su/catlean/dm.Z ()I
// 04b: goto 058
// 04e: ldc2_w -1894320475093036143
// 051: lload 2
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 10
// 05a: ifnull 093
// 05d: sipush 16559
// 060: ldc2_w 8461085663954575743
// 063: lload 2
// 064: lxor
// 065: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: if_icmple 08b
// 06d: goto 07a
// 070: ldc2_w -1894320475093036143
// 073: lload 2
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: bipush 1
// 07b: putstatic su/catlean/qc.y Z
// 07e: goto 08b
// 081: ldc2_w -1894320475093036143
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 8
// 08d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 090: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 093: aload 10
// 095: ifnull 0ab
// 098: ifne 11c
// 09b: goto 0a8
// 09e: ldc2_w -1894320475093036143
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: getstatic su/catlean/qc.y Z
// 0ab: aload 10
// 0ad: ifnull 0ee
// 0b0: ifeq 11c
// 0b3: goto 0c0
// 0b6: ldc2_w -1894320475093036143
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: lload 8
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0c8: sipush 9074
// 0cb: ldc2_w 635736628415021738
// 0ce: lload 2
// 0cf: lxor
// 0d0: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0d8: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0db: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0de: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e1: goto 0ee
// 0e4: ldc2_w -1894320475093036143
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 10
// 0f0: ifnull 119
// 0f3: ifeq 118
// 0f6: goto 103
// 0f9: ldc2_w -1894320475093036143
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: aload 0
// 104: bipush 0
// 105: lload 4
// 107: bipush 1
// 108: invokespecial su/catlean/qc.x (ZJZ)V
// 10b: goto 118
// 10e: ldc2_w -1894320475093036143
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: bipush 0
// 119: putstatic su/catlean/qc.y Z
// 11c: return
}

@Flow
private final void e(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qc.b J
// 03: ldc2_w 73141123591789
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 35795739754514
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 9516922566693
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 28483656311185
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -1129128157567919164
// 22: lload 2
// 23: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 1
// 2b: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2e: aload 10
// 30: ifnull 57
// 33: instanceof net/minecraft/class_2848
// 36: ifeq f2
// 39: goto 46
// 3c: ldc2_w -1146076010430167489
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: aload 1
// 47: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 4a: goto 57
// 4d: ldc2_w -1146076010430167489
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: checkcast net/minecraft/class_2848
// 5a: invokevirtual net/minecraft/class_2848.method_12365 ()Lnet/minecraft/class_2848$class_2849;
// 5d: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 60: if_acmpne f2
// 63: aload 0
// 64: aload 10
// 66: ifnull 9c
// 69: goto 76
// 6c: ldc2_w -1146076010430167489
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: lload 8
// 78: invokespecial su/catlean/qc.p (J)Lsu/catlean/zp;
// 7b: getstatic su/catlean/zp.BIND Lsu/catlean/zp;
// 7e: if_acmpne ee
// 81: goto 8e
// 84: ldc2_w -1146076010430167489
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: goto 9c
// 92: ldc2_w -1146076010430167489
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: lload 6
// 9e: invokespecial su/catlean/qc.q (J)Z
// a1: aload 10
// a3: ifnull ef
// a6: ifeq ee
// a9: goto b6
// ac: ldc2_w -1146076010430167489
// af: lload 2
// b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5: athrow
// b6: getstatic su/catlean/qc.m Z
// b9: aload 10
// bb: ifnull ef
// be: goto cb
// c1: ldc2_w -1146076010430167489
// c4: lload 2
// c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ca: athrow
// cb: ifne ee
// ce: goto db
// d1: ldc2_w -1146076010430167489
// d4: lload 2
// d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// da: athrow
// db: aload 0
// dc: lload 4
// de: invokespecial su/catlean/qc.B (J)V
// e1: goto ee
// e4: ldc2_w -1146076010430167489
// e7: lload 2
// e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ed: athrow
// ee: bipush 0
// ef: putstatic su/catlean/qc.m Z
// f2: return
}

@Flow
private final void Z(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: ldc2_w 79121971876387
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 9306371756113
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 98526410416054
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 41769159752796
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 97039147407144
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 31424757423583
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 32110589258059
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 44887899479671
// 037: lxor
// 038: lstore 16
// 03a: pop2
// 03b: ldc2_w 5483839116593489802
// 03e: lload 2
// 03f: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: astore 18
// 046: aload 0
// 047: lload 12
// 049: invokespecial su/catlean/qc.p (J)Lsu/catlean/zp;
// 04c: getstatic su/catlean/zp.BIND Lsu/catlean/zp;
// 04f: if_acmpne 152
// 052: lload 4
// 054: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 057: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 05a: ifnonnull 152
// 05d: goto 06a
// 060: ldc2_w 5500676919366072945
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: aload 1
// 06b: aload 18
// 06d: ifnull 0a1
// 070: goto 07d
// 073: ldc2_w 5500676919366072945
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 080: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 083: if_acmpne 152
// 086: goto 093
// 089: ldc2_w 5500676919366072945
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: aload 1
// 094: goto 0a1
// 097: ldc2_w 5500676919366072945
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0a4: aload 0
// 0a5: lload 10
// 0a7: invokespecial su/catlean/qc.z (J)Lsu/catlean/lj;
// 0aa: invokevirtual su/catlean/lj.X ()I
// 0ad: aload 18
// 0af: ifnull 0e3
// 0b2: if_icmpne 0d9
// 0b5: goto 0c2
// 0b8: ldc2_w 5500676919366072945
// 0bb: lload 2
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: aload 0
// 0c3: bipush 0
// 0c4: bipush 0
// 0c5: bipush 2
// 0c6: lload 14
// 0c8: aconst_null
// 0c9: invokestatic su/catlean/qc.P (Lsu/catlean/qc;ZZIJLjava/lang/Object;)V
// 0cc: goto 0d9
// 0cf: ldc2_w 5500676919366072945
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 0
// 0da: lload 6
// 0dc: invokespecial su/catlean/qc.v (J)Lsu/catlean/lj;
// 0df: invokevirtual su/catlean/lj.X ()I
// 0e2: bipush -1
// 0e3: aload 18
// 0e5: ifnull 124
// 0e8: if_icmpeq 152
// 0eb: goto 0f8
// 0ee: ldc2_w 5500676919366072945
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 1
// 0f9: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0fc: aload 18
// 0fe: ifnull 13c
// 101: goto 10e
// 104: ldc2_w 5500676919366072945
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: aload 0
// 10f: lload 6
// 111: invokespecial su/catlean/qc.v (J)Lsu/catlean/lj;
// 114: invokevirtual su/catlean/lj.X ()I
// 117: goto 124
// 11a: ldc2_w 5500676919366072945
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: if_icmpne 152
// 127: lload 16
// 129: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12c: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 12f: goto 13c
// 132: ldc2_w 5500676919366072945
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: ifeq 152
// 13f: aload 0
// 140: lload 8
// 142: invokespecial su/catlean/qc.B (J)V
// 145: goto 152
// 148: ldc2_w 5500676919366072945
// 14b: lload 2
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: return
}

private final void B(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 82055820429557L;
o8.p(o8.g, var3, 0, (byte)c<"v">(24041, 6866193324498859692L ^ var1), false, qc::K, 5, null);
}

public final int l(short param1, int param2, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/qc.b J
// 1a: lxor
// 1b: lstore 4
// 1d: lload 4
// 1f: dup2
// 20: ldc2_w 9531802284595
// 23: lxor
// 24: dup2
// 25: bipush 48
// 27: lushr
// 28: l2i
// 29: istore 6
// 2b: dup2
// 2c: bipush 16
// 2e: lshl
// 2f: bipush 16
// 31: lushr
// 32: lstore 7
// 34: pop2
// 35: pop2
// 36: ldc2_w 5347175565574496676
// 39: lload 4
// 3b: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: getstatic su/catlean/qc.T [Lnet/minecraft/class_1792;
// 43: astore 10
// 45: bipush 0
// 46: istore 11
// 48: astore 9
// 4a: aload 10
// 4c: arraylength
// 4d: istore 12
// 4f: iload 11
// 51: iload 12
// 53: if_icmpge d5
// 56: aload 10
// 58: iload 11
// 5a: aaload
// 5b: astore 13
// 5d: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 60: bipush 1
// 61: anewarray 502
// 64: astore 15
// 66: aload 15
// 68: bipush 0
// 69: aload 13
// 6b: aastore
// 6c: aload 15
// 6e: iload 6
// 70: i2c
// 71: lload 7
// 73: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 76: astore 14
// 78: aload 9
// 7a: iload 3
// 7b: iflt c0
// 7e: ifnull be
// 81: aload 14
// 83: invokevirtual su/catlean/fg.R ()Z
// 86: aload 9
// 88: ifnull d6
// 8b: goto 99
// 8e: ldc2_w 5366089276776004703
// 91: lload 4
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: ifeq bb
// 9c: goto aa
// 9f: ldc2_w 5366089276776004703
// a2: lload 4
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: aload 14
// ac: invokevirtual su/catlean/fg.a ()I
// af: ireturn
// b0: ldc2_w 5366089276776004703
// b3: lload 4
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: iinc 11 1
// be: aload 9
// c0: ifnonnull 4f
// c3: bipush 4
// c4: iload 2
// c5: iflt 86
// c8: anewarray 197
// cb: ldc2_w 5337287691722244140
// ce: lload 4
// d0: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: bipush -1
// d6: ireturn
}

private final int T(byte param1, int param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 56
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 8
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 40
// 012: lshl
// 013: bipush 40
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/qc.b J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 118981659770622
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 4501296903523
// 02a: lxor
// 02b: lstore 8
// 02d: pop2
// 02e: ldc2_w 7112845033708538149
// 031: lload 4
// 033: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: bipush -1
// 039: istore 11
// 03b: astore 10
// 03d: bipush -1
// 03e: istore 12
// 040: bipush 0
// 041: istore 13
// 043: iload 13
// 045: sipush 10047
// 048: ldc2_w 7400193405296525741
// 04b: lload 4
// 04d: lxor
// 04e: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: if_icmpge 238
// 056: iload 2
// 057: ifle 08f
// 05a: lload 6
// 05c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 062: dup
// 063: ifnull 08e
// 066: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 069: dup
// 06a: ifnull 08e
// 06d: goto 07b
// 070: ldc2_w 7131785103128794334
// 073: lload 4
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: iload 13
// 07d: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 080: goto 090
// 083: ldc2_w 7131785103128794334
// 086: lload 4
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: pop
// 08f: aconst_null
// 090: astore 14
// 092: aload 10
// 094: ifnull 233
// 097: aload 14
// 099: ifnull 230
// 09c: goto 0aa
// 09f: ldc2_w 7131785103128794334
// 0a2: lload 4
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: aload 14
// 0ac: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0af: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b5: aload 10
// 0b7: iload 3
// 0b8: ifle 0f7
// 0bb: ifnull 0f5
// 0be: goto 0cc
// 0c1: ldc2_w 7131785103128794334
// 0c4: lload 4
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: ifeq 230
// 0cf: goto 0dd
// 0d2: ldc2_w 7131785103128794334
// 0d5: lload 4
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 0e0: aload 14
// 0e2: lload 8
// 0e4: invokevirtual su/catlean/_0.B (Lnet/minecraft/class_1799;J)Z
// 0e7: goto 0f5
// 0ea: ldc2_w 7131785103128794334
// 0ed: lload 4
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: aload 10
// 0f7: ifnull 10c
// 0fa: ifeq 230
// 0fd: goto 10b
// 100: ldc2_w 7131785103128794334
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 0
// 10c: istore 15
// 10e: aload 14
// 110: invokestatic net/minecraft/class_1890.method_57532 (Lnet/minecraft/class_1799;)Lnet/minecraft/class_9304;
// 113: dup
// 114: sipush 22486
// 117: ldc2_w 7687450060628118189
// 11a: lload 4
// 11c: lxor
// 11d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 125: astore 16
// 127: aload 16
// 129: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
// 12c: dup
// 12d: sipush 21240
// 130: ldc2_w 2044901008513945492
// 133: lload 4
// 135: lxor
// 136: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 13e: checkcast java/lang/Iterable
// 141: astore 17
// 143: bipush 0
// 144: istore 18
// 146: aload 17
// 148: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 14d: astore 19
// 14f: aload 19
// 151: invokeinterface java/util/Iterator.hasNext ()Z 1
// 156: ifeq 1b9
// 159: aload 19
// 15b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 160: astore 20
// 162: aload 20
// 164: checkcast net/minecraft/class_6880
// 167: astore 21
// 169: bipush 0
// 16a: istore 22
// 16c: aload 10
// 16e: iload 1
// 16f: iflt 1c0
// 172: ifnull 1be
// 175: aload 10
// 177: ifnull 1b1
// 17a: goto 188
// 17d: ldc2_w 7131785103128794334
// 180: lload 4
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 21
// 18a: dup
// 18b: ifnull 1b0
// 18e: goto 19c
// 191: ldc2_w 7131785103128794334
// 194: lload 4
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: astore 23
// 19e: bipush 0
// 19f: istore 24
// 1a1: iload 15
// 1a3: aload 16
// 1a5: aload 23
// 1a7: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
// 1aa: iadd
// 1ab: istore 15
// 1ad: goto 1b2
// 1b0: pop
// 1b1: nop
// 1b2: nop
// 1b3: nop
// 1b4: aload 10
// 1b6: ifnonnull 14f
// 1b9: nop
// 1ba: iload 1
// 1bb: iflt 1be
// 1be: aload 10
// 1c0: iload 2
// 1c1: ifle 235
// 1c4: ifnull 233
// 1c7: iload 15
// 1c9: iload 12
// 1cb: if_icmple 230
// 1ce: goto 1dc
// 1d1: ldc2_w 7131785103128794334
// 1d4: lload 4
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: iload 15
// 1de: istore 12
// 1e0: iload 13
// 1e2: iload 1
// 1e3: iflt 229
// 1e6: sipush 31565
// 1e9: ldc2_w 7771604335276269012
// 1ec: lload 4
// 1ee: lxor
// 1ef: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: aload 10
// 1f6: ifnull 228
// 1f9: if_icmpge 22c
// 1fc: goto 20a
// 1ff: ldc2_w 7131785103128794334
// 202: lload 4
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: iload 13
// 20c: sipush 2823
// 20f: ldc2_w 553834506137628063
// 212: lload 4
// 214: lxor
// 215: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: goto 228
// 21d: ldc2_w 7131785103128794334
// 220: lload 4
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: iadd
// 229: goto 22e
// 22c: iload 13
// 22e: istore 11
// 230: iinc 13 1
// 233: aload 10
// 235: ifnonnull 043
// 238: iload 1
// 239: iflt 056
// 23c: iload 11
// 23e: ireturn
}

private final void x(boolean var1, long var2, boolean var4) {
var2 = b ^ var2;
long var5 = var2 ^ 90597746157585L;
o8.p(o8.g, var5, 0, (byte)c<"v">(24041, 6866167230721480264L ^ var2), false, qc::K, 5, null);
}

static void P(qc var0, boolean var1, boolean var2, int var3, long var4, Object var6) {
var4 = b ^ var4;
long var7 = var4 ^ 125742767729352L;
int[] var9 = vm.a<"Å">(4209403275916743162L, var4);

label31: {
int var10000;
label30: {
try {
var10000 = var3 & 2;
if (var9 == null) {
break label30;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 4190067181185223681L, var4);
}

var10000 = 0;
}

var2 = var10000;
}

try {
var0.x(var1, var7, (boolean)var2);
if (var4 >= 0L && vm.a<"Å">(4195607152175359144L, var4) != null) {
vm.a<"Å">(new int[1], 4206649808650575889L, var4);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 4190067181185223681L, var4);
}
}

private final void w(int param1, long param2, boolean param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 111899150086048
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 135323284392875
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 38548808272373
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 13759917260847
// 020: lxor
// 021: lstore 11
// 023: dup2
// 024: ldc2_w 112742959273321
// 027: lxor
// 028: dup2
// 029: bipush 48
// 02b: lushr
// 02c: l2i
// 02d: istore 13
// 02f: dup2
// 030: bipush 16
// 032: lshl
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 14
// 039: dup2
// 03a: bipush 48
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 15
// 043: pop2
// 044: dup2
// 045: ldc2_w 14698105785861
// 048: lxor
// 049: lstore 16
// 04b: dup2
// 04c: ldc2_w 119862441596948
// 04f: lxor
// 050: dup2
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 18
// 057: dup2
// 058: bipush 16
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 19
// 061: dup2
// 062: bipush 32
// 064: lshl
// 065: bipush 32
// 067: lushr
// 068: l2i
// 069: istore 20
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 44365995840537
// 070: lxor
// 071: lstore 21
// 073: pop2
// 074: ldc2_w -4146546327212003868
// 077: lload 2
// 078: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: astore 23
// 07f: sipush 31721
// 082: ldc2_w 4856909583865887143
// 085: lload 2
// 086: lxor
// 087: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: iload 1
// 08d: aload 23
// 08f: ifnull 0cf
// 092: if_icmpgt 0e4
// 095: goto 0a2
// 098: ldc2_w -4163485457081913313
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: iload 1
// 0a3: aload 23
// 0a5: ifnull 0e1
// 0a8: goto 0b5
// 0ab: ldc2_w -4163485457081913313
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: sipush 22660
// 0b8: ldc2_w 1128445799089576671
// 0bb: lload 2
// 0bc: lxor
// 0bd: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: goto 0cf
// 0c5: ldc2_w -4163485457081913313
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: if_icmpge 0e0
// 0d2: bipush 1
// 0d3: goto 0e5
// 0d6: ldc2_w -4163485457081913313
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: bipush 0
// 0e1: goto 0e5
// 0e4: bipush 0
// 0e5: ifeq 176
// 0e8: lload 2
// 0e9: lconst_0
// 0ea: lcmp
// 0eb: ifle 15e
// 0ee: aload 0
// 0ef: lload 9
// 0f1: invokespecial su/catlean/qc.Q (J)Lsu/catlean/b_;
// 0f4: getstatic su/catlean/b_.DEFAULT Lsu/catlean/b_;
// 0f7: if_acmpne 144
// 0fa: goto 107
// 0fd: ldc2_w -4163485457081913313
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: sipush 4848
// 10a: ldc2_w 8396146573661917359
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: iload 1
// 115: sipush 2823
// 118: ldc2_w 553935359640422750
// 11b: lload 2
// 11c: lxor
// 11d: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: isub
// 123: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 126: bipush 1
// 127: lload 5
// 129: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 12c: lload 2
// 12d: lconst_0
// 12e: lcmp
// 12f: iflt 27e
// 132: aload 23
// 134: ifnonnull 27e
// 137: goto 144
// 13a: ldc2_w -4163485457081913313
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: lload 11
// 146: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 149: iload 1
// 14a: sipush 2823
// 14d: ldc2_w 553935359640422750
// 150: lload 2
// 151: lxor
// 152: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: isub
// 158: bipush 0
// 159: bipush 2
// 15a: aconst_null
// 15b: invokestatic su/catlean/gg.N (JLsu/catlean/gg;IIILjava/lang/Object;)V
// 15e: lload 2
// 15f: lconst_0
// 160: lcmp
// 161: iflt 27e
// 164: aload 23
// 166: ifnonnull 27e
// 169: goto 176
// 16c: ldc2_w -4163485457081913313
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: lload 2
// 177: lconst_0
// 178: lcmp
// 179: ifle 271
// 17c: aload 0
// 17d: iload 13
// 17f: i2c
// 180: iload 14
// 182: iload 15
// 184: i2c
// 185: invokespecial su/catlean/qc.x (CIC)Lsu/catlean/wj;
// 188: getstatic su/catlean/wj.DEFAULT Lsu/catlean/wj;
// 18b: if_acmpne 204
// 18e: goto 19b
// 191: ldc2_w -4163485457081913313
// 194: lload 2
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: iload 1
// 19c: lload 7
// 19e: bipush 0
// 19f: aconst_null
// 1a0: bipush 0
// 1a1: sipush 3564
// 1a4: ldc2_w 4054525759346954166
// 1a7: lload 2
// 1a8: lxor
// 1a9: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: aconst_null
// 1af: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1b2: sipush 4848
// 1b5: ldc2_w 8396146573661917359
// 1b8: lload 2
// 1b9: lxor
// 1ba: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: lload 7
// 1c1: bipush 0
// 1c2: aconst_null
// 1c3: bipush 0
// 1c4: sipush 18279
// 1c7: ldc2_w 6846209133426967867
// 1ca: lload 2
// 1cb: lxor
// 1cc: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: aconst_null
// 1d2: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1d5: iload 1
// 1d6: lload 7
// 1d8: bipush 0
// 1d9: aconst_null
// 1da: bipush 1
// 1db: sipush 4848
// 1de: ldc2_w 8396146573661917359
// 1e1: lload 2
// 1e2: lxor
// 1e3: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: aconst_null
// 1e9: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1ec: lload 2
// 1ed: lconst_0
// 1ee: lcmp
// 1ef: iflt 27e
// 1f2: aload 23
// 1f4: ifnonnull 27e
// 1f7: goto 204
// 1fa: ldc2_w -4163485457081913313
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: iload 1
// 205: lload 7
// 207: sipush 1609
// 20a: ldc2_w 8828703845211390980
// 20d: lload 2
// 20e: lxor
// 20f: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 217: bipush 0
// 218: sipush 18593
// 21b: ldc2_w 7618854429855353590
// 21e: lload 2
// 21f: lxor
// 220: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: aconst_null
// 226: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 229: sipush 4848
// 22c: ldc2_w 8396146573661917359
// 22f: lload 2
// 230: lxor
// 231: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: lload 7
// 238: sipush 15477
// 23b: ldc2_w 83664949037694496
// 23e: lload 2
// 23f: lxor
// 240: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 248: bipush 0
// 249: sipush 22346
// 24c: ldc2_w 3772899040397366554
// 24f: lload 2
// 250: lxor
// 251: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 256: aconst_null
// 257: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 25a: iload 1
// 25b: sipush 15477
// 25e: ldc2_w 83664949037694496
// 261: lload 2
// 262: lxor
// 263: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 26b: bipush 1
// 26c: lload 5
// 26e: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 271: goto 27e
// 274: ldc2_w -4163485457081913313
// 277: lload 2
// 278: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: athrow
// 27e: iload 4
// 280: aload 23
// 282: lload 2
// 283: lconst_0
// 284: lcmp
// 285: iflt 2b0
// 288: ifnull 2ae
// 28b: ifeq 2e7
// 28e: goto 29b
// 291: ldc2_w -4163485457081913313
// 294: lload 2
// 295: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: athrow
// 29b: aload 0
// 29c: lload 16
// 29e: invokespecial su/catlean/qc.q (J)Z
// 2a1: goto 2ae
// 2a4: ldc2_w -4163485457081913313
// 2a7: lload 2
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: aload 23
// 2b0: ifnull 2d8
// 2b3: ifeq 2e7
// 2b6: goto 2c3
// 2b9: ldc2_w -4163485457081913313
// 2bc: lload 2
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: lload 21
// 2c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c8: getfield net/minecraft/class_746.field_6012 I
// 2cb: goto 2d8
// 2ce: ldc2_w -4163485457081913313
// 2d1: lload 2
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: putstatic su/catlean/qc.W I
// 2db: aload 0
// 2dc: iload 18
// 2de: i2s
// 2df: iload 19
// 2e1: i2c
// 2e2: iload 20
// 2e4: invokespecial su/catlean/qc.j (SCI)V
// 2e7: return
}

private final void j(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 3114346997459L;
o8.p(o8.g, var6, -1, (byte)c<"v">(18111, 8021259039628067777L ^ var4), false, qc::F, 4, null);
}

private static final boolean Z() {
long var0 = b ^ 129102497425976L;
long var2 = var0 ^ 50618957325764L;

try {
if (k.p(var2) == zp.BIND) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -842905273353272726L, var0);
}

return false;
}

private static final boolean E() {
long var0 = b ^ 38328683479329L;
long var2 = var0 ^ 133860022521565L;

try {
if (k.p(var2) == zp.BIND) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 2257483918252337523L, var0);
}

return false;
}

private static final boolean g() {
long var0 = b ^ 13235495071449L;
long var2 = var0 ^ 96117081284901L;

try {
if (k.p(var2) == zp.BIND) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 3507212827502659211L, var0);
}

return false;
}

private static final boolean H() {
long var0 = b ^ 98278371434515L;
long var2 = var0 ^ 2201572143087L;

try {
if (k.p(var2) == zp.BIND) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 9108048761622169665L, var0);
}

return false;
}

private static final boolean A() {
long var0 = b ^ 49308405881251L;
long var2 = var0 ^ 131641326671455L;

try {
if (k.p(var2) == zp.BIND) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 564708816281825777L, var0);
}

return false;
}

private static final void K() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: ldc2_w 46556105562263
// 006: lxor
// 007: lstore 0
// 008: lload 0
// 009: dup2
// 00a: ldc2_w 9821450645370
// 00d: lxor
// 00e: lstore 2
// 00f: dup2
// 010: ldc2_w 109493755947436
// 013: lxor
// 014: lstore 4
// 016: dup2
// 017: ldc2_w 91745225190026
// 01a: lxor
// 01b: dup2
// 01c: bipush 56
// 01e: lushr
// 01f: l2i
// 020: istore 6
// 022: dup2
// 023: bipush 8
// 025: lshl
// 026: bipush 8
// 028: lushr
// 029: lstore 7
// 02b: pop2
// 02c: dup2
// 02d: ldc2_w 84763845755977
// 030: lxor
// 031: lstore 9
// 033: dup2
// 034: ldc2_w 17079452195030
// 037: lxor
// 038: dup2
// 039: bipush 32
// 03b: lushr
// 03c: l2i
// 03d: istore 11
// 03f: dup2
// 040: bipush 32
// 042: lshl
// 043: bipush 48
// 045: lushr
// 046: l2i
// 047: istore 12
// 049: dup2
// 04a: bipush 48
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 13
// 053: pop2
// 054: dup2
// 055: ldc2_w 31118695874217
// 058: lxor
// 059: dup2
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 14
// 060: dup2
// 061: bipush 16
// 063: lshl
// 064: bipush 16
// 066: lushr
// 067: lstore 15
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 123144253745762
// 06e: lxor
// 06f: lstore 17
// 071: dup2
// 072: ldc2_w 72572210845911
// 075: lxor
// 076: lstore 19
// 078: dup2
// 079: ldc2_w 140132503539263
// 07c: lxor
// 07d: lstore 21
// 07f: dup2
// 080: ldc2_w 76004754415750
// 083: lxor
// 084: lstore 23
// 086: dup2
// 087: ldc2_w 76359995544771
// 08a: lxor
// 08b: lstore 25
// 08d: dup2
// 08e: ldc2_w 43333684164911
// 091: lxor
// 092: lstore 27
// 094: pop2
// 095: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 098: bipush 1
// 099: anewarray 502
// 09c: astore 31
// 09e: aload 31
// 0a0: bipush 0
// 0a1: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 0a4: dup
// 0a5: sipush 13152
// 0a8: ldc2_w 7326845940143802942
// 0ab: lload 0
// 0ac: lxor
// 0ad: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b5: aastore
// 0b6: iload 11
// 0b8: aload 31
// 0ba: iload 12
// 0bc: iload 13
// 0be: i2c
// 0bf: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0c2: astore 30
// 0c4: ldc2_w 481585261903818046
// 0c7: lload 0
// 0c8: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0d0: bipush 1
// 0d1: anewarray 502
// 0d4: astore 32
// 0d6: aload 32
// 0d8: bipush 0
// 0d9: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 0dc: dup
// 0dd: sipush 6459
// 0e0: ldc2_w 5240213897414664275
// 0e3: lload 0
// 0e4: lxor
// 0e5: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ed: aastore
// 0ee: aload 32
// 0f0: iload 14
// 0f2: i2c
// 0f3: lload 15
// 0f5: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 0f8: astore 31
// 0fa: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0fd: lload 17
// 0ff: invokevirtual su/catlean/gg.o (J)V
// 102: astore 29
// 104: aload 30
// 106: invokevirtual su/catlean/fg.R ()Z
// 109: aload 29
// 10b: ifnull 149
// 10e: ifeq 137
// 111: goto 11e
// 114: ldc2_w 496021727661551813
// 117: lload 0
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 30
// 120: lload 21
// 122: invokevirtual su/catlean/fg.x (J)V
// 125: aload 29
// 127: ifnonnull 1be
// 12a: goto 137
// 12d: ldc2_w 496021727661551813
// 130: lload 0
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: aload 31
// 139: invokevirtual su/catlean/fg.R ()Z
// 13c: goto 149
// 13f: ldc2_w 496021727661551813
// 142: lload 0
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 29
// 14b: ifnull 170
// 14e: ifeq 188
// 151: goto 15e
// 154: ldc2_w 496021727661551813
// 157: lload 0
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aload 31
// 160: invokevirtual su/catlean/fg.a ()I
// 163: goto 170
// 166: ldc2_w 496021727661551813
// 169: lload 0
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: lload 25
// 172: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 175: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 178: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 17b: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 17e: bipush 1
// 17f: lload 2
// 180: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 183: aload 29
// 185: ifnonnull 1be
// 188: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 18b: checkcast su/catlean/_g
// 18e: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 191: checkcast su/catlean/_g
// 194: sipush 32405
// 197: ldc2_w 3667302583489267704
// 19a: lload 0
// 19b: lxor
// 19c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: bipush 0
// 1a2: anewarray 770
// 1a5: bipush 1
// 1a6: lload 27
// 1a8: invokestatic su/catlean/o2.f (Lsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;ZJ)Ljava/lang/String;
// 1ab: bipush 0
// 1ac: bipush 2
// 1ad: aconst_null
// 1ae: lload 4
// 1b0: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1b3: return
// 1b4: ldc2_w 496021727661551813
// 1b7: lload 0
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1c1: fconst_0
// 1c2: lload 9
// 1c4: fconst_0
// 1c5: sipush 4848
// 1c8: ldc2_w 8396248994925219957
// 1cb: lload 0
// 1cc: lxor
// 1cd: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: aconst_null
// 1d3: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 1d6: pop
// 1d7: new net/minecraft/class_2879
// 1da: dup
// 1db: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1de: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 1e1: checkcast net/minecraft/class_2596
// 1e4: lload 23
// 1e6: dup2_x1
// 1e7: pop2
// 1e8: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1eb: aload 29
// 1ed: ifnull 223
// 1f0: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 1f3: iload 6
// 1f5: i2b
// 1f6: lload 7
// 1f8: invokespecial su/catlean/qc.t (BJ)Lsu/catlean/yt;
// 1fb: getstatic su/catlean/yt.SILENT Lsu/catlean/yt;
// 1fe: if_acmpne 262
// 201: goto 20e
// 204: ldc2_w 496021727661551813
// 207: lload 0
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 211: lload 19
// 213: invokevirtual su/catlean/gg.d (J)V
// 216: goto 223
// 219: ldc2_w 496021727661551813
// 21c: lload 0
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: aload 30
// 225: invokevirtual su/catlean/fg.R ()Z
// 228: aload 29
// 22a: ifnull 24f
// 22d: ifne 262
// 230: goto 23d
// 233: ldc2_w 496021727661551813
// 236: lload 0
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: aload 31
// 23f: invokevirtual su/catlean/fg.a ()I
// 242: goto 24f
// 245: ldc2_w 496021727661551813
// 248: lload 0
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: lload 25
// 251: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 254: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 257: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 25a: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 25d: bipush 1
// 25e: lload 2
// 25f: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 262: return
}

private static final void K(boolean param0, boolean param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: ldc2_w 7283225475958
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 117094155251776
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 32
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 21655290379264
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 50395233207067
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 87264916851277
// 056: lxor
// 057: lstore 12
// 059: dup2
// 05a: ldc2_w 2264925854001
// 05d: lxor
// 05e: dup2
// 05f: bipush 32
// 061: lushr
// 062: l2i
// 063: istore 14
// 065: dup2
// 066: bipush 32
// 068: lshl
// 069: bipush 48
// 06b: lushr
// 06c: l2i
// 06d: istore 15
// 06f: dup2
// 070: bipush 48
// 072: lshl
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 16
// 079: pop2
// 07a: dup2
// 07b: ldc2_w 131360948312257
// 07e: lxor
// 07f: dup2
// 080: bipush 56
// 082: lushr
// 083: l2i
// 084: istore 17
// 086: dup2
// 087: bipush 8
// 089: lshl
// 08a: bipush 32
// 08c: lushr
// 08d: l2i
// 08e: istore 18
// 090: dup2
// 091: bipush 40
// 093: lshl
// 094: bipush 40
// 096: lushr
// 097: l2i
// 098: istore 19
// 09a: pop2
// 09b: dup2
// 09c: ldc2_w 50340005262631
// 09f: lxor
// 0a0: lstore 20
// 0a2: dup2
// 0a3: ldc2_w 79107574957267
// 0a6: lxor
// 0a7: lstore 22
// 0a9: dup2
// 0aa: ldc2_w 116249738327842
// 0ad: lxor
// 0ae: lstore 24
// 0b0: dup2
// 0b1: ldc2_w 12786569222862
// 0b4: lxor
// 0b5: lstore 26
// 0b7: pop2
// 0b8: ldc2_w 7300268986395283167
// 0bb: lload 2
// 0bc: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: astore 33
// 0c3: lload 24
// 0c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c8: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0cb: sipush 3166
// 0ce: ldc2_w 122339626810207543
// 0d1: lload 2
// 0d2: lxor
// 0d3: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0db: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0de: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0e1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e4: aload 33
// 0e6: ifnull 2be
// 0e9: ifeq 2b0
// 0ec: goto 0f9
// 0ef: ldc2_w 7278685519340835620
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 0fc: iload 4
// 0fe: i2s
// 0ff: iload 5
// 101: iload 6
// 103: i2s
// 104: invokevirtual su/catlean/qc.l (SIS)I
// 107: istore 34
// 109: iload 34
// 10b: aload 33
// 10d: ifnull 229
// 110: bipush -1
// 111: if_icmpeq 21b
// 114: goto 121
// 117: ldc2_w 7278685519340835620
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 124: checkcast su/catlean/_g
// 127: iload 14
// 129: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 12c: checkcast su/catlean/_g
// 12f: sipush 25182
// 132: ldc2_w 617645111273126105
// 135: lload 2
// 136: lxor
// 137: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: bipush 0
// 13d: anewarray 770
// 140: iload 15
// 142: i2c
// 143: bipush 0
// 144: bipush 4
// 145: aconst_null
// 146: iload 16
// 148: i2s
// 149: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 14c: getstatic su/catlean/ys.SUCCESS Lsu/catlean/ys;
// 14f: bipush 0
// 150: lload 24
// 152: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 155: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 158: iload 34
// 15a: sipush 2823
// 15d: ldc2_w 553864298281232997
// 160: lload 2
// 161: lxor
// 162: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: aload 33
// 169: ifnull 1a5
// 16c: goto 179
// 16f: ldc2_w 7278685519340835620
// 172: lload 2
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: if_icmplt 1a9
// 17c: goto 189
// 17f: ldc2_w 7278685519340835620
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: iload 34
// 18b: sipush 2823
// 18e: ldc2_w 553864298281232997
// 191: lload 2
// 192: lxor
// 193: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: goto 1a5
// 19b: ldc2_w 7278685519340835620
// 19e: lload 2
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: isub
// 1a6: goto 1ab
// 1a9: iload 34
// 1ab: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1ae: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 1b1: bipush 4
// 1b2: aconst_null
// 1b3: astore 28
// 1b5: istore 29
// 1b7: astore 30
// 1b9: istore 31
// 1bb: astore 32
// 1bd: iload 9
// 1bf: iload 10
// 1c1: i2c
// 1c2: iload 11
// 1c4: i2s
// 1c5: aload 32
// 1c7: iload 31
// 1c9: aload 30
// 1cb: iload 29
// 1cd: aload 28
// 1cf: invokestatic su/catlean/o2.e (Lsu/catlean/_g;Ljava/lang/String;ICSLsu/catlean/ys;ILnet/minecraft/class_1799;ILjava/lang/Object;)V
// 1d2: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 1d5: iload 34
// 1d7: lload 7
// 1d9: bipush 0
// 1da: invokespecial su/catlean/qc.w (IJZ)V
// 1dd: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 1e0: bipush 1
// 1e1: invokevirtual su/catlean/sg.t (Z)V
// 1e4: aload 33
// 1e6: ifnull 216
// 1e9: iload 0
// 1ea: ifeq 20f
// 1ed: goto 1fa
// 1f0: ldc2_w 7278685519340835620
// 1f3: lload 2
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 1fd: lload 22
// 1ff: invokevirtual su/catlean/qc.d (J)V
// 202: goto 20f
// 205: ldc2_w 7278685519340835620
// 208: lload 2
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 212: bipush 0
// 213: invokevirtual su/catlean/sg.t (Z)V
// 216: aload 33
// 218: ifnonnull 481
// 21b: iload 0
// 21c: goto 229
// 21f: ldc2_w 7278685519340835620
// 222: lload 2
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: ifeq 26b
// 22c: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 22f: iload 14
// 231: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 234: checkcast su/catlean/_g
// 237: sipush 443
// 23a: ldc2_w 2500354768980417316
// 23d: lload 2
// 23e: lxor
// 23f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: bipush 0
// 245: anewarray 770
// 248: iload 15
// 24a: i2c
// 24b: bipush 0
// 24c: bipush 4
// 24d: aconst_null
// 24e: iload 16
// 250: i2s
// 251: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 254: lload 20
// 256: invokevirtual su/catlean/qc.F (Ljava/lang/String;J)V
// 259: aload 33
// 25b: ifnonnull 481
// 25e: goto 26b
// 261: ldc2_w 7278685519340835620
// 264: lload 2
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 26e: checkcast su/catlean/_g
// 271: iload 14
// 273: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 276: checkcast su/catlean/_g
// 279: sipush 29112
// 27c: ldc2_w 6811593633776954117
// 27f: lload 2
// 280: lxor
// 281: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 286: bipush 0
// 287: anewarray 770
// 28a: iload 15
// 28c: i2c
// 28d: bipush 0
// 28e: bipush 4
// 28f: aconst_null
// 290: iload 16
// 292: i2s
// 293: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 296: bipush 0
// 297: bipush 2
// 298: aconst_null
// 299: lload 12
// 29b: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 29e: aload 33
// 2a0: ifnonnull 481
// 2a3: goto 2b0
// 2a6: ldc2_w 7278685519340835620
// 2a9: lload 2
// 2aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: athrow
// 2b0: iload 1
// 2b1: goto 2be
// 2b4: ldc2_w 7278685519340835620
// 2b7: lload 2
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: aload 33
// 2c0: ifnull 2ed
// 2c3: ifne 481
// 2c6: goto 2d3
// 2c9: ldc2_w 7278685519340835620
// 2cc: lload 2
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 2d6: iload 17
// 2d8: i2b
// 2d9: iload 18
// 2db: iload 19
// 2dd: invokespecial su/catlean/qc.T (BII)I
// 2e0: goto 2ed
// 2e3: ldc2_w 7278685519340835620
// 2e6: lload 2
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: istore 34
// 2ef: iload 34
// 2f1: aload 33
// 2f3: ifnull 40f
// 2f6: bipush -1
// 2f7: if_icmpeq 401
// 2fa: goto 307
// 2fd: ldc2_w 7278685519340835620
// 300: lload 2
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 30a: checkcast su/catlean/_g
// 30d: iload 14
// 30f: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 312: checkcast su/catlean/_g
// 315: sipush 17800
// 318: ldc2_w 2015697635730546454
// 31b: lload 2
// 31c: lxor
// 31d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: bipush 0
// 323: anewarray 770
// 326: iload 15
// 328: i2c
// 329: bipush 0
// 32a: bipush 4
// 32b: aconst_null
// 32c: iload 16
// 32e: i2s
// 32f: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 332: getstatic su/catlean/ys.SUCCESS Lsu/catlean/ys;
// 335: bipush 0
// 336: lload 24
// 338: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 33b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 33e: iload 34
// 340: sipush 2823
// 343: ldc2_w 553864298281232997
// 346: lload 2
// 347: lxor
// 348: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: aload 33
// 34f: ifnull 38b
// 352: goto 35f
// 355: ldc2_w 7278685519340835620
// 358: lload 2
// 359: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: athrow
// 35f: if_icmplt 38f
// 362: goto 36f
// 365: ldc2_w 7278685519340835620
// 368: lload 2
// 369: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36e: athrow
// 36f: iload 34
// 371: sipush 2823
// 374: ldc2_w 553864298281232997
// 377: lload 2
// 378: lxor
// 379: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: goto 38b
// 381: ldc2_w 7278685519340835620
// 384: lload 2
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: isub
// 38c: goto 391
// 38f: iload 34
// 391: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 394: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 397: bipush 4
// 398: aconst_null
// 399: astore 28
// 39b: istore 29
// 39d: astore 30
// 39f: istore 31
// 3a1: astore 32
// 3a3: iload 9
// 3a5: iload 10
// 3a7: i2c
// 3a8: iload 11
// 3aa: i2s
// 3ab: aload 32
// 3ad: iload 31
// 3af: aload 30
// 3b1: iload 29
// 3b3: aload 28
// 3b5: invokestatic su/catlean/o2.e (Lsu/catlean/_g;Ljava/lang/String;ICSLsu/catlean/ys;ILnet/minecraft/class_1799;ILjava/lang/Object;)V
// 3b8: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 3bb: iload 34
// 3bd: lload 7
// 3bf: bipush 1
// 3c0: invokespecial su/catlean/qc.w (IJZ)V
// 3c3: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 3c6: bipush 1
// 3c7: invokevirtual su/catlean/sg.t (Z)V
// 3ca: aload 33
// 3cc: ifnull 3fc
// 3cf: iload 0
// 3d0: ifeq 3f5
// 3d3: goto 3e0
// 3d6: ldc2_w 7278685519340835620
// 3d9: lload 2
// 3da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3df: athrow
// 3e0: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 3e3: lload 22
// 3e5: invokevirtual su/catlean/qc.d (J)V
// 3e8: goto 3f5
// 3eb: ldc2_w 7278685519340835620
// 3ee: lload 2
// 3ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: athrow
// 3f5: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 3f8: bipush 0
// 3f9: invokevirtual su/catlean/sg.t (Z)V
// 3fc: aload 33
// 3fe: ifnonnull 481
// 401: iload 0
// 402: goto 40f
// 405: ldc2_w 7278685519340835620
// 408: lload 2
// 409: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40e: athrow
// 40f: ifeq 449
// 412: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 415: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 418: checkcast su/catlean/_g
// 41b: sipush 13616
// 41e: ldc2_w 7932029983511031722
// 421: lload 2
// 422: lxor
// 423: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 428: bipush 0
// 429: anewarray 770
// 42c: bipush 1
// 42d: lload 26
// 42f: invokestatic su/catlean/o2.f (Lsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;ZJ)Ljava/lang/String;
// 432: lload 20
// 434: invokevirtual su/catlean/qc.F (Ljava/lang/String;J)V
// 437: aload 33
// 439: ifnonnull 481
// 43c: goto 449
// 43f: ldc2_w 7278685519340835620
// 442: lload 2
// 443: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 448: athrow
// 449: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 44c: checkcast su/catlean/_g
// 44f: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 452: checkcast su/catlean/_g
// 455: sipush 32089
// 458: ldc2_w 7312858641171736512
// 45b: lload 2
// 45c: lxor
// 45d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 462: bipush 0
// 463: anewarray 770
// 466: bipush 1
// 467: lload 26
// 469: invokestatic su/catlean/o2.f (Lsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;ZJ)Ljava/lang/String;
// 46c: bipush 0
// 46d: bipush 2
// 46e: aconst_null
// 46f: lload 12
// 471: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 474: goto 481
// 477: ldc2_w 7278685519340835620
// 47a: lload 2
// 47b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 480: athrow
// 481: return
}

private static final void F() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qc.b J
// 003: ldc2_w 105376607550460
// 006: lxor
// 007: lstore 0
// 008: lload 0
// 009: dup2
// 00a: ldc2_w 17962303895950
// 00d: lxor
// 00e: lstore 2
// 00f: dup2
// 010: ldc2_w 129371933572005
// 013: lxor
// 014: dup2
// 015: bipush 48
// 017: lushr
// 018: l2i
// 019: istore 4
// 01b: dup2
// 01c: bipush 16
// 01e: lshl
// 01f: bipush 48
// 021: lushr
// 022: l2i
// 023: istore 5
// 025: dup2
// 026: bipush 32
// 028: lshl
// 029: bipush 32
// 02b: lushr
// 02c: l2i
// 02d: istore 6
// 02f: pop2
// 030: dup2
// 031: ldc2_w 53823003965352
// 034: lxor
// 035: lstore 7
// 037: pop2
// 038: ldc2_w -1889934319863476651
// 03b: lload 0
// 03c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: astore 9
// 043: lload 7
// 045: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 048: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 04b: sipush 3166
// 04e: ldc2_w 122435529582734781
// 051: lload 0
// 052: lxor
// 053: invokedynamic v (IJ)I bsm=su/catlean/qc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 05b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 05e: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 061: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 064: aload 9
// 066: ifnull 11b
// 069: ifeq 106
// 06c: goto 079
// 06f: ldc2_w -1906908703022083154
// 072: lload 0
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: lload 7
// 07b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07e: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 081: ifeq 0b1
// 084: goto 091
// 087: ldc2_w -1906908703022083154
// 08a: lload 0
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: lload 2
// 092: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 095: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 098: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 09b: bipush 0
// 09c: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 09f: aload 9
// 0a1: ifnonnull 147
// 0a4: goto 0b1
// 0a7: ldc2_w -1906908703022083154
// 0aa: lload 0
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: lload 2
// 0b2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b5: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b8: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0bb: lload 7
// 0bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c0: getfield net/minecraft/class_746.field_6012 I
// 0c3: getstatic su/catlean/qc.W I
// 0c6: isub
// 0c7: bipush 2
// 0c8: irem
// 0c9: aload 9
// 0cb: ifnull 0ec
// 0ce: goto 0db
// 0d1: ldc2_w -1906908703022083154
// 0d4: lload 0
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: ifne 0ef
// 0de: goto 0eb
// 0e1: ldc2_w -1906908703022083154
// 0e4: lload 0
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: bipush 1
// 0ec: goto 0f0
// 0ef: bipush 0
// 0f0: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 0f3: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 0f6: iload 4
// 0f8: i2s
// 0f9: iload 5
// 0fb: i2c
// 0fc: iload 6
// 0fe: invokespecial su/catlean/qc.j (SCI)V
// 101: aload 9
// 103: ifnonnull 147
// 106: lload 7
// 108: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10b: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 10e: goto 11b
// 111: ldc2_w -1906908703022083154
// 114: lload 0
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: ifeq 147
// 11e: lload 2
// 11f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 122: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 125: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 128: bipush 1
// 129: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 12c: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 12f: iload 4
// 131: i2s
// 132: iload 5
// 134: i2c
// 135: iload 6
// 137: invokespecial su/catlean/qc.j (SCI)V
// 13a: goto 147
// 13d: ldc2_w -1906908703022083154
// 140: lload 0
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: return
}

static {
long var20 = b ^ 18554803705775L;
long var22 = var20 ^ 132315586022982L;
long var24 = var20 ^ 48406801656436L;
long var10001 = var20 ^ 10144835127655L;
int var26 = (int)((var20 ^ 10144835127655L) >>> 32);
int var27 = (int)((var20 ^ 10144835127655L) << 32 >>> 48);
int var28 = (int)(var10001 << 48 >>> 48);
long var29 = var20 ^ 62855256601842L;
long var31 = var20 ^ 4170515601899L;
vm.a<"Å">(false, -8504855650701065060L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[42];
int var16 = 0;
String var15 = "/Sf\u001d\u0092ê7Ç'\b\b»6£ô+Z\r×û\nU\u0015pJ\u0088\u007fîtKû\f JßT©bÒ\u0003Ð\u0086\"~õFÓ«;-a\u001efá¢Dê Þ\u0083D\u0016\u0090}* Ì¼=&b\u008a\u0093é°2\tA=Ø\u0080\tã´X=/\u000e|Én²÷X@í°\u0091\u0018\u0084\u009dÓCvK\u0095Øß/IIð\\ÕÏC}ÍK4\u009dÔ\u001e8¸¾µ\u001cè¢×Ö\u000eÈÇ§ØY\u0096F¬íôñl\"x\u007f\u008b»jñZO\u001ec_âùU\u00915A}ÝhU²wåR½\u0013 \u0000\u008f\u0091ó»Ý \u0004\u0082÷àÀ1\"G;\u0017WîgSÖBÂóÇE¸fLÁ}¢\u0010+gXÑ¬ z\u0094xÿÚY\u0006\u0019q\rk\u0010\u0017¦íý\u0091Ô\u009eÀ\nÉ\u008c÷Êü\u009aªC¹nå\u0018\u0013ÄIn°Õ\t]Ú\u009aµ\bæIå¨^ìJj¸\u0005F-\u0018äò|zT\u0096V\u007fÖù\u0089ç\u009a+.ßµéÑ\u009añ\u008eÆR(þåÀè\u001fÚ\u0088°iJ+52ÿðÎX¬\u009b\u0004Yn8\u000f\u000b\\¸QÄ÷<\u009d8þd¢\u001fAÇ\b l×,A\u009câòÛ¥\u0085ö2\u0093éS5ÂÌýñ\u0092<HÕ¶v\u0017sÂÖgp\u0018àãx\u009dc¢«2\u00ad\u000f]\u0092æßF\fz{+\u0014Í\u001c\u009dè(JÁ·\u0081Vcs8û_p\bJïg\u0015Ur)T£Ñ¡t§}\u0084È\u001côðpä\u0006\u0087UÆ¦»\u0083 ¦bì[e\u0088=M)?c~m)*Àde\u0003Ù¤òlb ³\u0091¾â¸bQ(\u0016t1¼4Þé\u008d®\u0099îÁ&©µs\u008bÖÞq\u008c®\u0001\u0017\u0002\u000e[×\u0001\u000bÀ\u000bÄ å]0`øT\u0018l\u0001²\u0090æ\u009f¨]\u000bNgªq\u0080èZ\u0000]=y(w\u0082] \u008d,Ëuj\u0002ë\u0089ï\u0007¤èåÙÊ¦\u009aHôµ\u001a\u0014@\u0096[ÀE´El\u0018÷ Ò\u0083»¥}\u001f)í\tÛ\rý\u009e\u0086*_E)\fZ>\u0015â\u0091bÔ\u0086òïñ\u001cD0¶À$Õáí\u008dI&\u0094sY^*\u0083\u0007\u0098ZÝì\u008f¦xz±ðcjAûøUö!\u000b§\\\u008fC\u0006¡eI¬á'Õä\u0010avP\u0010\u0085÷\u0006§¯\u001b\u0096\u008e$\u008c¶\u009c\u00100\u009e\fuZó\u0089\u0014S\u0093\u0094\u001e%\u001eÛ\u0016\u00184\u009dß\u0096ò>·\u0081Ú\u008d\u008c¥B\\Ïz\u0085ôa\u001beÃ[\rH´U\u007f¯¦¢ïA 1µíñ|\u008e\u0005\u001eÊÖralè\u0004\u0002Z\f!h¸o&?\u0017-æ$\u001c·æ¼:m1ùE©R\u0096b\u001f/#\u001d'.-JÒ@xº\u0090%.\u0084ñ÷ÇiÇ\u0084(`\u0019ºAØ\u0090g^Ä!J+\bìQe{\u0018\u0086.÷9\u0096BÐì\u001f?±í½æý÷ \u00115¤%d8%zñ¤\u0083ç@ ç¡öë\u009cyß\u009b\u0002.*\u009c÷ØûF}¼Ýº³QÉc\u008cúYàFZÊ[CÄsWÈ\u0098[&ÜJðe\u000fé¿?\u0018\u000f×T:ífTÓ\u0093®\u000e²Zõ\u0083ÁIÖ0køÈ\u0085Ä(\u0092\u0097\u0015-Ò\u0097ÐK\u0014ì8ä\u000bÿ\u001e¾×õÄ½¸A@\u0010\u009cÜ\u001aÕVÜ\u0081q),½¯\u0094?÷\u008e ÓFôü\u008dYhø\u0097>\u0005\nó×wN\u0082Pü\u0019^gék\u0018\u0004\u008fd\u0014Jv\u009c@\u001cn ß\u0086\u0083N±÷ÜWo\u001dðHHà~<>\bÀ\u00ad\u0098²\b\u001b\u008a\u0007}\tÑ\u0086\tXâ[ý\u0010\u0086½ø¿\u008cræÅ\u0003\u009d\u009cDd;åë\u0013ÇÓÁ\r1´êø0¿\u000fxfí´J¹vöý±\u0085¶Ø\u0012\u0017\u0099\u0014ÝFr\u0007÷\u0012M\u0011\"vZë\t{¹ùc$·Ûc\nòø3\u000f[Ê\u0010\u0018\u001e\u00ad¸ÔÞ°\u0085\u0016â\u008f¢ÖuÄê&6\u008bb³\u009f·\u0004â(Qýç¡\u0082AS\u0003X'ê¦\u00ad\u00031\u0080§\u0094Oúû\u009e¤n|>*Û\u0005?È·\u0083cË\u0016Ù\u0012\r\u008e U¯Êômâ\u001bòLà ÷K*,RÒ\u001e#^u)x(Pï7\u0080£\u001dÙ\u0094\u0018\u0018J\u001b´[Ä¨ZÕÚ\u0093\u001d-6Ï\u0010nG î>ã\u00ad»\u0018YØ§:\u0080áEÞ®~vý|3¥í\u009dUõ\u0017aj=,\u0018|®)\u0019Ëºÿ2Jiÿ\u00914uØZðy]\u0004\u008c\u0002\u0091\u0090(ïaJìä£\u0003ö¶ÊP£jh\nà\u0094y`\u0084\u008c\u0010E\u001e¥U£\u0019 Í£É\n³=\u00961\u0099ýn z©?ï0ÿ\u0099^¨H\u0014ÔÊìþnäóþ\u009fªË\u0015´´qvï\u001c¦ÏÙ(\n\u0015\fí\t\u00ad\u0082/k\u0095ð\u0089\u008c\u0099¶æíX¹\u007f:\u0086SÊ¬-\u008c\f]iZü¶\u0004 \u0019û(ï\u0082\u0018#\u0018À\u000fÿÒÌù!Á\u008aâö\u0086[W\fº\u0012®Íæ²ø";
int var17 = "/Sf\u001d\u0092ê7Ç'\b\b»6£ô+Z\r×û\nU\u0015pJ\u0088\u007fîtKû\f JßT©bÒ\u0003Ð\u0086\"~õFÓ«;-a\u001efá¢Dê Þ\u0083D\u0016\u0090}* Ì¼=&b\u008a\u0093é°2\tA=Ø\u0080\tã´X=/\u000e|Én²÷X@í°\u0091\u0018\u0084\u009dÓCvK\u0095Øß/IIð\\ÕÏC}ÍK4\u009dÔ\u001e8¸¾µ\u001cè¢×Ö\u000eÈÇ§ØY\u0096F¬íôñl\"x\u007f\u008b»jñZO\u001ec_âùU\u00915A}ÝhU²wåR½\u0013 \u0000\u008f\u0091ó»Ý \u0004\u0082÷àÀ1\"G;\u0017WîgSÖBÂóÇE¸fLÁ}¢\u0010+gXÑ¬ z\u0094xÿÚY\u0006\u0019q\rk\u0010\u0017¦íý\u0091Ô\u009eÀ\nÉ\u008c÷Êü\u009aªC¹nå\u0018\u0013ÄIn°Õ\t]Ú\u009aµ\bæIå¨^ìJj¸\u0005F-\u0018äò|zT\u0096V\u007fÖù\u0089ç\u009a+.ßµéÑ\u009añ\u008eÆR(þåÀè\u001fÚ\u0088°iJ+52ÿðÎX¬\u009b\u0004Yn8\u000f\u000b\\¸QÄ÷<\u009d8þd¢\u001fAÇ\b l×,A\u009câòÛ¥\u0085ö2\u0093éS5ÂÌýñ\u0092<HÕ¶v\u0017sÂÖgp\u0018àãx\u009dc¢«2\u00ad\u000f]\u0092æßF\fz{+\u0014Í\u001c\u009dè(JÁ·\u0081Vcs8û_p\bJïg\u0015Ur)T£Ñ¡t§}\u0084È\u001côðpä\u0006\u0087UÆ¦»\u0083 ¦bì[e\u0088=M)?c~m)*Àde\u0003Ù¤òlb ³\u0091¾â¸bQ(\u0016t1¼4Þé\u008d®\u0099îÁ&©µs\u008bÖÞq\u008c®\u0001\u0017\u0002\u000e[×\u0001\u000bÀ\u000bÄ å]0`øT\u0018l\u0001²\u0090æ\u009f¨]\u000bNgªq\u0080èZ\u0000]=y(w\u0082] \u008d,Ëuj\u0002ë\u0089ï\u0007¤èåÙÊ¦\u009aHôµ\u001a\u0014@\u0096[ÀE´El\u0018÷ Ò\u0083»¥}\u001f)í\tÛ\rý\u009e\u0086*_E)\fZ>\u0015â\u0091bÔ\u0086òïñ\u001cD0¶À$Õáí\u008dI&\u0094sY^*\u0083\u0007\u0098ZÝì\u008f¦xz±ðcjAûøUö!\u000b§\\\u008fC\u0006¡eI¬á'Õä\u0010avP\u0010\u0085÷\u0006§¯\u001b\u0096\u008e$\u008c¶\u009c\u00100\u009e\fuZó\u0089\u0014S\u0093\u0094\u001e%\u001eÛ\u0016\u00184\u009dß\u0096ò>·\u0081Ú\u008d\u008c¥B\\Ïz\u0085ôa\u001beÃ[\rH´U\u007f¯¦¢ïA 1µíñ|\u008e\u0005\u001eÊÖralè\u0004\u0002Z\f!h¸o&?\u0017-æ$\u001c·æ¼:m1ùE©R\u0096b\u001f/#\u001d'.-JÒ@xº\u0090%.\u0084ñ÷ÇiÇ\u0084(`\u0019ºAØ\u0090g^Ä!J+\bìQe{\u0018\u0086.÷9\u0096BÐì\u001f?±í½æý÷ \u00115¤%d8%zñ¤\u0083ç@ ç¡öë\u009cyß\u009b\u0002.*\u009c÷ØûF}¼Ýº³QÉc\u008cúYàFZÊ[CÄsWÈ\u0098[&ÜJðe\u000fé¿?\u0018\u000f×T:ífTÓ\u0093®\u000e²Zõ\u0083ÁIÖ0køÈ\u0085Ä(\u0092\u0097\u0015-Ò\u0097ÐK\u0014ì8ä\u000bÿ\u001e¾×õÄ½¸A@\u0010\u009cÜ\u001aÕVÜ\u0081q),½¯\u0094?÷\u008e ÓFôü\u008dYhø\u0097>\u0005\nó×wN\u0082Pü\u0019^gék\u0018\u0004\u008fd\u0014Jv\u009c@\u001cn ß\u0086\u0083N±÷ÜWo\u001dðHHà~<>\bÀ\u00ad\u0098²\b\u001b\u008a\u0007}\tÑ\u0086\tXâ[ý\u0010\u0086½ø¿\u008cræÅ\u0003\u009d\u009cDd;åë\u0013ÇÓÁ\r1´êø0¿\u000fxfí´J¹vöý±\u0085¶Ø\u0012\u0017\u0099\u0014ÝFr\u0007÷\u0012M\u0011\"vZë\t{¹ùc$·Ûc\nòø3\u000f[Ê\u0010\u0018\u001e\u00ad¸ÔÞ°\u0085\u0016â\u008f¢ÖuÄê&6\u008bb³\u009f·\u0004â(Qýç¡\u0082AS\u0003X'ê¦\u00ad\u00031\u0080§\u0094Oúû\u009e¤n|>*Û\u0005?È·\u0083cË\u0016Ù\u0012\r\u008e U¯Êômâ\u001bòLà ÷K*,RÒ\u001e#^u)x(Pï7\u0080£\u001dÙ\u0094\u0018\u0018J\u001b´[Ä¨ZÕÚ\u0093\u001d-6Ï\u0010nG î>ã\u00ad»\u0018YØ§:\u0080áEÞ®~vý|3¥í\u009dUõ\u0017aj=,\u0018|®)\u0019Ëºÿ2Jiÿ\u00914uØZðy]\u0004\u008c\u0002\u0091\u0090(ïaJìä£\u0003ö¶ÊP£jh\nà\u0094y`\u0084\u008c\u0010E\u001e¥U£\u0019 Í£É\n³=\u00961\u0099ýn z©?ï0ÿ\u0099^¨H\u0014ÔÊìþnäóþ\u009fªË\u0015´´qvï\u001c¦ÏÙ(\n\u0015\fí\t\u00ad\u0082/k\u0095ð\u0089\u008c\u0099¶æíX¹\u007f:\u0086SÊ¬-\u008c\f]iZü¶\u0004 \u0019û(ï\u0082\u0018#\u0018À\u000fÿÒÌù!Á\u008aâö\u0086[W\fº\u0012®Íæ²ø"
.length();
char var14 = ' ';
int var36 = -1;

label54:
while (true) {
String var38 = var15.substring(++var36, var36 + var14);
byte var42 = -1;

while (true) {
byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var42) {
case 0:
var18[var16++] = var50;
if ((var36 += var14) >= var17) {
c = var18;
d = new String[42];
o = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[20];
int var3 = 0;
String var4 = "\u0000o\u0002Â\u0011ìm£Ý\u0084\bäRM/B©sÊd.xð\u0080Ñg\u009d\u0090I\u001d\u0011ô'ZOÝv³µ¦úù\r\u0000à½'M/nU|}¯úPèÝ\u0010PAÅãu\f\u0019\u008f\u0007y[ñõÉ\u0088Ü¿5-\u008f-_¯uiå{×86á\u0089Nrõ6³\u007f\u0091 êò\u000ea\\íå5ÈÁ\u000bó\u0015Öy\u0099íý¢âÊb\u009a}ÅÍï÷5ù±\"£3é9þú\u001dgÉû9Â\u0001";
int var5 = "\u0000o\u0002Â\u0011ìm£Ý\u0084\bäRM/B©sÊd.xð\u0080Ñg\u009d\u0090I\u001d\u0011ô'ZOÝv³µ¦úù\r\u0000à½'M/nU|}¯úPèÝ\u0010PAÅãu\f\u0019\u008f\u0007y[ñõÉ\u0088Ü¿5-\u008f-_¯uiå{×86á\u0089Nrõ6³\u007f\u0091 êò\u000ea\\íå5ÈÁ\u000bó\u0015Öy\u0099íý¢âÊb\u009a}ÅÍï÷5ù±\"£3é9þú\u001dgÉû9Â\u0001"
.length();
byte var2 = 0;

label36:
while (true) {
byte var46 = var2;
var2 += 8;
byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
long[] var41 = var6;
int var47 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var63 = -1;

while (true) {
long var8 = var54;
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
var41[var47] = var65;
if (var2 >= var5) {
i = var6;
n = new Integer[20];
KProperty[] var33 = new KProperty[c<"v">(22346, 3772978740507794168L ^ var20)];
var33[0] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(16210, 1242213220307224835L ^ var20), b<"m">(10313, 3319179169753226782L ^ var20), 0)
);
var33[1] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(2668, 7043463946795351073L ^ var20), b<"m">(16341, 1937104435773983110L ^ var20), 0)
);
var33[2] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(26811, 8555364212061183729L ^ var20), b<"m">(29957, 306945526799500136L ^ var20), 0)
);
var33[3] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(24329, 8761174984734058845L ^ var20), b<"m">(3867, 4076891517138663753L ^ var20), 0)
);
var33[4] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(11735, 7426467932253674386L ^ var20), b<"m">(20764, 2837848085763827521L ^ var20), 0)
);
var33[5] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(14019, 7882902787435249805L ^ var20), b<"m">(22107, 8163811082129383450L ^ var20), 0)
);
var33[c<"v">(4848, 8396202079120924493L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(5688, 387559725978050672L ^ var20), b<"m">(16065, 1523817716288080024L ^ var20), 0)
);
var33[c<"v">(15477, 83716056452411842L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(qc.class, b<"m">(13276, 8552741484014781884L ^ var20), b<"m">(14349, 4747630892071079511L ^ var20), 0)
);
f = var33;
k = new qc(var31);
V = yp.L(k, b<"m">(30480, 2482758635265950022L ^ var20), zp.ENABLE, null, null, c<"v">(1574, 5522893183726062480L ^ var20), null, var29);
l = yp.J(
k,
b<"m">(27915, 5905094140945931081L ^ var20),
new lj(0, false, var24, false, c<"v">(15477, 83716056452411842L ^ var20), null),
null,
var26,
qc::Z,
var27,
(char)var28,
4,
null
);
g = yp.J(
k,
b<"m">(22684, 1645331868724408003L ^ var20),
new lj(0, false, var24, false, c<"v">(15477, 83716056452411842L ^ var20), null),
null,
var26,
qc::E,
var27,
(char)var28,
4,
null
);
w = yp.t(k, b<"m">(6383, 3186978779341450893L ^ var20), false, var22, null, qc::g, 4, null);
j = yp.L(k, b<"m">(16118, 8622446742641887405L ^ var20), yt.SILENT, null, qc::H, 4, null, var29);
N = yp.L(k, b<"m">(3870, 4662862054268926298L ^ var20), wj.ALT, null, null, c<"v">(2292, 5488692679214990681L ^ var20), null, var29);
S = yp.L(k, b<"m">(25814, 1639988885702873757L ^ var20), b_.DEFAULT, null, null, c<"v">(2292, 5488692679214990681L ^ var20), null, var29);
a = yp.t(k, b<"m">(14477, 6390762598162517736L ^ var20), false, var22, null, qc::A, 4, null);
class_1792[] var37 = new class_1792[c<"v">(4848, 8396202079120924493L ^ var20)];
class_1792 var56 = class_1802.field_22028;
Intrinsics.checkNotNullExpressionValue(class_1802.field_22028, b<"m">(26616, 4050737994387493275L ^ var20));
var37[0] = var56;
class_1792 var57 = class_1802.field_8058;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8058, b<"m">(16536, 40592262117766865L ^ var20));
var37[1] = var57;
class_1792 var58 = class_1802.field_8873;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8873, b<"m">(19469, 7715512421870451308L ^ var20));
var37[2] = var58;
class_1792 var59 = class_1802.field_8523;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8523, b<"m">(15694, 8427715105586039570L ^ var20));
var37[3] = var59;
class_1792 var60 = class_1802.field_8678;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8678, b<"m">(28073, 4000214692852472805L ^ var20));
var37[4] = var60;
class_1792 var61 = class_1802.field_8577;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8577, b<"m">(19428, 6527537166040120712L ^ var20));
var37[5] = var61;
T = var37;
return;
}
break;
default:
var41[var47] = var65;
if (var2 < var5) {
continue label36;
}

var4 = "ylWE\u001b\u009fi\u0095@_\u0089\u008dÆûE¡";
var5 = "ylWE\u001b\u009fi\u0095@_\u0089\u008dÆûE¡".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var41 = var6;
var47 = var3++;
var54 = (var7[0] & 255L) << 56
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

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var50;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "\u001aO4--\u001dP õ\bØÉvM+\u008b[Dú¿[\u0086rvÌ\u009d\u009aÐ\u0091`\u00ad\u001b\u0087æóËûïÙõi{{yÀÝJ\u008cBÁ8Ì\u009dWMbê\u001fÝ«=ä®\u009b(I\u0017¡¶æ\u001e0>êÈt\u009a4\u0090=ºÖ\u009a1HýTÙ\u0083\u009a^\b¦öÐ1âääÌtùÅE÷";
var17 = "\u001aO4--\u001dP õ\bØÉvM+\u008b[Dú¿[\u0086rvÌ\u009d\u009aÐ\u0091`\u00ad\u001b\u0087æóËûïÙõi{{yÀÝJ\u008cBÁ8Ì\u009dWMbê\u001fÝ«=ä®\u009b(I\u0017¡¶æ\u001e0>êÈt\u009a4\u0090=ºÖ\u009a1HýTÙ\u0083\u009a^\b¦öÐ1âääÌtùÅE÷"
.length();
var14 = '@';
var36 = -1;
}

var38 = var15.substring(++var36, var36 + var14);
var42 = 0;
}
}
}

public static void t(boolean var0) {
e = var0;
}

public static boolean I() {
return e;
}

public static boolean s() {
boolean var0 = I();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32465;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qc", var10);
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
throw new RuntimeException("su/catlean/qc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1320;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])o.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/qc", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
n[var3] = var15;
}

return n[var3];
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
throw new RuntimeException("su/catlean/qc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
